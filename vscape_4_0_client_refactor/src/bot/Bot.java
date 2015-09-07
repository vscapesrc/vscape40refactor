package bot;

import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import bot.iface.Client;
import bot.iface.Widget;
import bot.iface.helpers.Buffer;

public class Bot implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener, ItemListener, ActionListener {

	Client client;
	Frame scapeFrame;
	public Bot(Client clientInstance) {
		client = clientInstance;
		scapeFrame = null;
	}
	
	MouseWheelListener mouseWheelListener;
	MouseListener mouseListener;
	MouseMotionListener mouseMotionListener;
	KeyListener keyListener;
	
	void hookInput() {
		MouseWheelListener[] mouseWheelListeners = scapeFrame.getMouseWheelListeners();
		MouseListener[] mouseListeners = scapeFrame.getMouseListeners();
		MouseMotionListener[] mouseMotionListeners = scapeFrame.getMouseMotionListeners();
		KeyListener[] keyListeners = scapeFrame.getKeyListeners();
		
		if(mouseWheelListeners.length > 0 && mouseListeners.length > 0 && mouseMotionListeners.length > 0 && keyListeners.length > 0) {
			mouseWheelListener = mouseWheelListeners[0];
			scapeFrame.removeMouseWheelListener(mouseWheelListener);
			scapeFrame.addMouseWheelListener(this);
			
			mouseListener = mouseListeners[0];
			scapeFrame.removeMouseListener(mouseListener);
			scapeFrame.addMouseListener(this);
			
			mouseMotionListener = mouseMotionListeners[0];
			scapeFrame.removeMouseMotionListener(mouseMotionListener);
			scapeFrame.addMouseMotionListener(this);
			
			keyListener = keyListeners[0];
			scapeFrame.removeKeyListener(keyListener);
			scapeFrame.addKeyListener(this);
		}
	}
	
	MenuBar bar;
	
	void addFrameMenuBar(MenuBar bar) {
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		Insets origInsets = scapeFrame.getInsets();
		int width = scapeFrame.getWidth() - (origInsets.left + origInsets.right);
		int height = scapeFrame.getHeight() - (origInsets.top + origInsets.bottom);
		
		scapeFrame.setMenuBar(bar);
		
		scapeFrame.setVisible(true);
		scapeFrame.requestFocus();
		scapeFrame.toFront();
		scapeFrame.setFocusTraversalKeysEnabled(false);
		scapeFrame.toFront();
		
		
		Insets insets = scapeFrame.getInsets();

		// use this code instead to size and center the window
		int fullWidth = width + insets.left + insets.right;
		int fullHeight = height + insets.top + insets.bottom;
		scapeFrame.setBounds((int) (0.5 * d.getWidth()) - fullWidth / 2,
				(int) (0.5 * d.getHeight()) - fullHeight / 2, fullWidth, fullHeight);
		
		Graphics g = client.getDrawGraphics();
		g.translate(insets.left - origInsets.left, insets.top - origInsets.top);
		client.setDrawGraphics(g);
	}
	
	void updateScapeFrame() {
		Frame frame = (Frame)client.getScapeFrame();
		
		if(frame != null && frame != scapeFrame) {
			scapeFrame = frame;
			
			bar = new MenuBar();
			
			Menu clientMenu = new Menu("Client");
			bar.add(clientMenu);
			
			CheckboxMenuItem multilog = new CheckboxMenuItem("Allow MultiLogging");
			multilog.addItemListener(this);
			multilog.setName("multilog");
			clientMenu.add(multilog);
			
			Menu hacksMenu = new Menu("Hacks");
			Menu playerHacks = new Menu("Player");
			MenuItem dropAll = new MenuItem("Drop inventory");
			dropAll.setName("dropall");
			dropAll.addActionListener(this);
	
			playerHacks.add(dropAll);
			hacksMenu.add(playerHacks);
			bar.add(hacksMenu);
			
			Menu botMenu = new Menu("Bot");
			Menu inputMenu = new Menu("User Input");
			
			CheckboxMenuItem keyInput = new CheckboxMenuItem("Keyboard");
			CheckboxMenuItem mouseInput = new CheckboxMenuItem("Mouse");
			
			keyInput.setState(true);
			keyInput.addItemListener(this);
			keyInput.setName("keyinput");
			mouseInput.setState(true);
			mouseInput.addItemListener(this);
			mouseInput.setName("mouseinput");
			
			inputMenu.add(keyInput);
			inputMenu.add(mouseInput);
			
			botMenu.add(inputMenu);
			bar.add(botMenu);
			//scapeFrame.setVisible(false);
			//scapeFrame.setMenuBar(bar);
			//scapeFrame.setVisible(true);
			//scapeFrame.pack();
			
			addFrameMenuBar(bar);
			
			hookInput();
		}
	}
	
	Buffer packet;
	
	public void init() {
		updateScapeFrame();
		allowKeyboardInput = true;
		allowMouseInput = true;
		
		bot.iface.Buffer packetIface = client.getPacket();
		packet = new Buffer(packetIface);
	}
	
	public void preFrame() {
		
	}
	
	public void postFrame() {
		Graphics g = client.getDrawGraphics();
		
		int size = 21;
		int x, y;
		
		x = client.getMouseX();
		y = client.getMouseY();
		
		g.setColor(Color.RED);
		g.drawLine(x-size/2, y, x+size/2, y);
		g.drawLine(x, y-size/2, x, y+size/2);
		
	}
	
	private int dropIndex = -1;
	private long lastStealTime = -1;
	
	public void preTick() {
		updateScapeFrame();
		
		
		if(!client.isGameCrashed() && client.isLoggedIn() && client.getPacket() != null) {
			packet.setBuffer(client.getPacket());
			
			Widget widget = client.getWidget();
			Widget[] widgets = widget.getWidgets();
			int[] redStoneIds = client.getRedStoneWidgetIds();
			
			Widget inventory = null;
			if(redStoneIds.length != 0) {
				int id = redStoneIds[Client.REDSTONE_INVENTORY];
				if(id != -1) {
					Widget invParent = widgets[id];
					if(invParent.getChildren().length != 0) {
						inventory = widgets[invParent.getChildren()[0]];
					}
				}
			}
			
			if(inventory != null)
			{
				if(dropIndex != -1) {
					
					int selected = client.getSelectedRedStoneId();
					
					if(selected == Client.REDSTONE_INVENTORY) {
						if(redStoneIds[selected] != -1) {
							int[] ids = inventory.getItemIds();
							if(ids[dropIndex] != 0) {
								
								packet.writeOpcode(87);
								packet.writeShortA(ids[dropIndex]-1);
								packet.writeShort(inventory.getId()); // widget id
								packet.writeShortA(dropIndex); // inventory index
							}
							
							if(++dropIndex >= ids.length) {
								dropIndex = -1;
							}
						}
					}
				}
				else {
					if(System.currentTimeMillis() >=  lastStealTime + 6000 ) {
						lastStealTime = System.currentTimeMillis();
						
						boolean inventoryFull = true;
						int[] ids = inventory.getItemIds();
						for(int i = 0; i < ids.length; i++) {
							if(ids[i] == 0) {
								inventoryFull = false;
								break;
							}
						}
						
						if(!inventoryFull) {
							int objectId = 1115708211;
							int param2 = 54;
							int param1 = 51;
							this.packet.writeOpcode(252);
							this.packet.writeLEShortA(objectId >> 14 & 32767); // send object x y
							this.packet.writeLEShort(param2 + client.getSceneY());
							this.packet.writeShortA(param1 + client.getSceneX());
							System.out.println("steal");
						}
						else {
							dropIndex = 0;
							lastStealTime -= 2000;
							System.out.println("drop");
						}
					}
				}
			}
		}
	}
	
	public void postTick() {

	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		MenuItem item = (MenuItem)e.getSource();

		switch(item.getName()) {
		case "keyinput":
			allowKeyboardInput =  (e.getStateChange() == ItemEvent.SELECTED) ? true : false;
			break;
		case "mouseinput":
			allowMouseInput = (e.getStateChange() == ItemEvent.SELECTED) ? true : false;
			break;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MenuItem item = (MenuItem)e.getSource();

		switch(item.getName()) {
		case "dropall":
			if(dropIndex == -1) {
				dropIndex = 0;
			}
			break;
		}
	}
	
	boolean allowMouseInput;
	@Override
	public void mouseWheelMoved(MouseWheelEvent e) {
		if(allowMouseInput) mouseWheelListener.mouseWheelMoved(e);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(allowMouseInput) mouseMotionListener.mouseDragged(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		if(allowMouseInput) mouseMotionListener.mouseMoved(e);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(allowMouseInput) mouseListener.mouseClicked(e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if(allowMouseInput) mouseListener.mouseEntered(e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(allowMouseInput) mouseListener.mouseExited(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(allowMouseInput) mouseListener.mousePressed(e);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(allowMouseInput) mouseListener.mouseReleased(e);
	}
	
	boolean allowKeyboardInput;
	@Override
	public void keyPressed(KeyEvent e) {
		if(allowKeyboardInput) keyListener.keyPressed(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(allowKeyboardInput) keyListener.keyReleased(e);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if(allowKeyboardInput) keyListener.keyTyped(e);
	}
}
