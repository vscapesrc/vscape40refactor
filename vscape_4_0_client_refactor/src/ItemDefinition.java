public final class ItemDefinition {
	public byte femaleTranslation;
	public int value;
	public int[] replacementColors;
	public int id = -1;
	static Cache sprites = new Cache(100);
	public static Cache models = new Cache(50);
	public int[] originalColors;
	public boolean membersObject;
	public int tertiaryFemaleEquipmentModel;
	public int notedTemplateId;
	public int secondaryFemaleModel;
	public int primaryMaleModel;
	public int secondaryMaleHeadpiece;
	private int groundScaleX;
	public String[] groundActions;
	private int spriteTranslateX;
	public String itemName;
	private static ItemDefinition[] cache;
	public int secondaryFemaleHeadpiece;
	private int modelId;
	public int primaryMaleHeadpiece;
	public boolean stackable;
	public byte[] description;
	private int noteInfoId;
	private static int cacheIndex;
	public int spriteScale;
	public static boolean membersServer = true;
	private static Buffer data;
	private int diffusion;
	public int tertiaryMaleEquipmentModel;
	public int secondaryMaleModel;
	public String[] widgetActions;
	public String[] y;
	public int spritePitch;
	private int groudScaleZ;
	private int groundScaleY;
	private int[] stackIds;
	private int spriteTranslateY;
	private static int[] offsets;
	private int ambience;
	public int primaryFemaleHeadpiece;
	public int spriteCameraRoll;
	public int primaryFemaleModel;
	private int[] stackAmounts;
	public int team;
	public static int count;
	private int spriteCameraYaw;
	public byte maleTranslation;

	public static void dispose() {
		models = null;
		sprites = null;
		offsets = null;
		cache = null;
		data = null;
	}

	public static void init(Archive archive) {
		data = new Buffer(archive.getEntry("obj.dat"));
		Buffer buffer;
		offsets = new int[(count = (buffer = new Buffer(archive.getEntry("obj.idx"))).readUShort()) + 15000];
		int var1 = 2;

		int var2;
		for (var2 = 0; var2 < count; ++var2) {
			offsets[var2] = var1;
			var1 += buffer.readUShort();
		}

		cache = new ItemDefinition[10];

		for (var2 = 0; var2 < 10; ++var2) {
			cache[var2] = new ItemDefinition();
		}

	}

	public static ItemDefinition fromID(int id) {

		for (int var1 = 0; var1 < 10; ++var1) {
			if (cache[var1].id == id) {
				return cache[var1];
			}
		}

		cacheIndex = (cacheIndex + 1) % 10;
		ItemDefinition definition = cache[cacheIndex];
		data.position = offsets[id];
		definition.id = id;
		definition.reset();
		definition.decode(data);

		if (definition.notedTemplateId != -1) {
			definition.toNote();
		}

		if (!membersServer && definition.membersObject) {
			definition.itemName = "Members Object";
			definition.description = "Login to a members\' server to use this object.".getBytes();
			definition.groundActions = null;
			definition.widgetActions = null;
			definition.team = 0;
		}

		return definition;
	}

	private void toNote() {
		ItemDefinition var8 = fromID(notedTemplateId);
		modelId = var8.modelId;
		spriteScale = var8.spriteScale;
		spritePitch = var8.spritePitch;
		spriteCameraRoll = var8.spriteCameraRoll;
		spriteCameraYaw = var8.spriteCameraYaw;
		spriteTranslateX = var8.spriteTranslateX;
		spriteTranslateY = var8.spriteTranslateY;
		originalColors = var8.originalColors;
		replacementColors = var8.replacementColors;
		ItemDefinition var9 = fromID(noteInfoId);
		itemName = var9.itemName;
		membersObject = var9.membersObject;
		value = var9.value;
		String var10 = "a";
		char var11;
		if ((var11 = var9.itemName.charAt(0)) == 65 || var11 == 69 || var11 == 73 || var11 == 79 || var11 == 85) {
			var10 = "an";
		}

		description = ("Swap this note at any bank for " + var10 + " " + var9.itemName + ".").getBytes();
		stackable = true;
	}

	private void decode(Buffer var2) {
		int var3;
		while ((var3 = var2.readUByte()) != 0) {
			if (var3 == 1) {
				modelId = var2.readUShort();
			} else if (var3 == 2) {
				itemName = var2.readString();
			} else if (var3 == 3) {
				description = var2.readStringBytes();
			} else if (var3 == 4) {
				spriteScale = var2.readUShort();
			} else if (var3 == 5) {
				spritePitch = var2.readUShort();
			} else if (var3 == 6) {
				spriteCameraRoll = var2.readUShort();
			} else if (var3 == 7) {
				spriteTranslateX = var2.readUShort();
				if (spriteTranslateX > 32767) {
					spriteTranslateX -= 65536;
				}
			} else if (var3 == 8) {
				spriteTranslateY = var2.readUShort();
				if (spriteTranslateY > 32767) {
					spriteTranslateY -= 65536;
				}
			} else if (var3 == 10) {
				var2.readUShort();
			} else if (var3 == 11) {
				stackable = true;
			} else if (var3 == 12) {
				value = var2.readInt();
			} else if (var3 == 16) {
				membersObject = true;
			} else if (var3 == 23) {
				primaryMaleModel = var2.readUShort();
				maleTranslation = var2.readByte();
			} else if (var3 == 24) {
				secondaryMaleModel = var2.readUShort();
			} else if (var3 == 25) {
				primaryFemaleModel = var2.readUShort();
				femaleTranslation = var2.readByte();
			} else if (var3 == 26) {
				secondaryFemaleModel = var2.readUShort();
			} else if (var3 >= 30 && var3 < 35) {
				if (groundActions == null) {
					groundActions = new String[5];
				}

				groundActions[var3 - 30] = var2.readString();
				if (groundActions[var3 - 30].equalsIgnoreCase("hidden")) {
					groundActions[var3 - 30] = null;
				}
			} else if (var3 >= 35 && var3 < 40) {
				if (widgetActions == null) {
					widgetActions = new String[5];
				}

				widgetActions[var3 - 35] = var2.readString();
			} else if (var3 == 40) {
				int var4 = var2.readUByte();
				originalColors = new int[var4];
				replacementColors = new int[var4];

				for (int var5 = 0; var5 < var4; ++var5) {
					originalColors[var5] = var2.readUShort();
					replacementColors[var5] = var2.readUShort();
				}
			} else if (var3 >= 45 && var3 < 50) {
				if (y == null) {
					y = new String[5];
				}

				y[var3 - 45] = var2.readString();
			} else if (var3 == 78) {
				tertiaryMaleEquipmentModel = var2.readUShort();
			} else if (var3 == 79) {
				tertiaryFemaleEquipmentModel = var2.readUShort();
			} else if (var3 == 90) {
				primaryMaleHeadpiece = var2.readUShort();
			} else if (var3 == 91) {
				primaryFemaleHeadpiece = var2.readUShort();
			} else if (var3 == 92) {
				secondaryMaleHeadpiece = var2.readUShort();
			} else if (var3 == 93) {
				secondaryFemaleHeadpiece = var2.readUShort();
			} else if (var3 == 95) {
				spriteCameraYaw = var2.readUShort();
			} else if (var3 == 97) {
				noteInfoId = var2.readUShort();
			} else if (var3 == 98) {
				notedTemplateId = var2.readUShort();
			} else if (var3 >= 100 && var3 < 110) {
				if (stackIds == null) {
					stackIds = new int[10];
					stackAmounts = new int[10];
				}

				stackIds[var3 - 100] = var2.readUShort();
				stackAmounts[var3 - 100] = var2.readUShort();
			} else if (var3 == 110) {
				groundScaleX = var2.readUShort();
			} else if (var3 == 111) {
				groundScaleY = var2.readUShort();
			} else if (var3 == 112) {
				groudScaleZ = var2.readUShort();
			} else if (var3 == 113) {
				ambience = var2.readByte();
			} else if (var3 == 114) {
				diffusion = var2.readByte() * 5;
			} else if (var3 == 115) {
				team = var2.readUByte();
			}
		}
	}

	private void reset() {
		modelId = 0;
		itemName = null;
		description = null;
		originalColors = null;
		replacementColors = null;
		spriteScale = 2000;
		spritePitch = 0;
		spriteCameraRoll = 0;
		spriteCameraYaw = 0;
		spriteTranslateX = 0;
		spriteTranslateY = 0;
		stackable = false;
		value = 1;
		membersObject = false;
		groundActions = null;
		widgetActions = null;
		y = null;
		primaryMaleModel = -1;
		secondaryMaleModel = -1;
		maleTranslation = 0;
		primaryFemaleModel = -1;
		secondaryFemaleModel = -1;
		femaleTranslation = 0;
		tertiaryMaleEquipmentModel = -1;
		tertiaryFemaleEquipmentModel = -1;
		primaryMaleHeadpiece = -1;
		secondaryMaleHeadpiece = -1;
		primaryFemaleHeadpiece = -1;
		secondaryFemaleHeadpiece = -1;
		stackIds = null;
		stackAmounts = null;
		noteInfoId = -1;
		notedTemplateId = -1;
		groundScaleX = 128;
		groundScaleY = 128;
		groudScaleZ = 128;
		ambience = 0;
		diffusion = 0;
		team = 0;
	}

	public static Sprite sprite(int id, int stackSize, int backColor) {
		if (backColor == 0) {
			Sprite var3;
			if ((var3 = (Sprite) sprites.get((long) id)) != null && var3.resizeHeight != stackSize
					&& var3.resizeHeight != -1) {
				var3.unlink();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		ItemDefinition definition;
		if ((definition = fromID(id)).stackIds == null) {
			stackSize = -1;
		}

		int var4;
		if (stackSize > 1) {
			var4 = -1;

			for (int var5 = 0; var5 < 10; ++var5) {
				if (stackSize >= definition.stackAmounts[var5] && definition.stackAmounts[var5] != 0) {
					var4 = definition.stackIds[var5];
				}
			}

			if (var4 != -1) {
				definition = fromID(var4);
			}
		}

		Model model;
		if ((model = definition.getAmountModel(1)) == null) {
			return null;
		} else {
			Sprite notedSprite = null;
			if (definition.notedTemplateId != -1 && (notedSprite = sprite(definition.noteInfoId, 10, -1)) == null) {
				return null;
			} else {
				Sprite var6 = new Sprite(32, 32);
				int var7 = Rasterizer3D.e;
				int var8 = Rasterizer3D.f;
				int[] var9 = Rasterizer3D.t;
				int[] var10 = Rasterizer2D.pixels;
				int var11 = Rasterizer2D.width;
				int var12 = Rasterizer2D.height;
				int var13 = Rasterizer2D.clipLeft;
				int var14 = Rasterizer2D.clipRight;
				int var15 = Rasterizer2D.clipBottom;
				int var16 = Rasterizer2D.clipTop;
				Rasterizer3D.approximateAlphaBlending = false;
				Rasterizer2D.init(32, 32, var6.pixels);
				Rasterizer2D.fillRectangle(32, 0, 0, 0, 32);
				Rasterizer3D.useViewport();
				int scale = definition.spriteScale;
				if (backColor == -1) {
					scale = (int) ((double) scale * 1.5D);
				}

				if (backColor > 0) {
					scale = (int) ((double) scale * 1.04D);
				}

				int sin = Rasterizer3D.SINE[definition.spritePitch] * scale >> 16;
				scale = Rasterizer3D.COSINE[definition.spritePitch] * scale >> 16;
				model.render(definition.spriteCameraRoll, definition.spriteCameraYaw, definition.spritePitch,
						definition.spriteTranslateX, sin + model.modelHeight / 2 + definition.spriteTranslateY,
						scale + definition.spriteTranslateY);

				for (var4 = 31; var4 >= 0; --var4) {
					for (scale = 31; scale >= 0; --scale) {
						if (var6.pixels[var4 + (scale << 5)] == 0) {
							if (var4 > 0 && var6.pixels[var4 - 1 + (scale << 5)] > 1) {
								var6.pixels[var4 + (scale << 5)] = 1;
							} else if (scale > 0 && var6.pixels[var4 + (scale - 1 << 5)] > 1) {
								var6.pixels[var4 + (scale << 5)] = 1;
							} else if (var4 < 31 && var6.pixels[var4 + 1 + (scale << 5)] > 1) {
								var6.pixels[var4 + (scale << 5)] = 1;
							} else if (scale < 31 && var6.pixels[var4 + (scale + 1 << 5)] > 1) {
								var6.pixels[var4 + (scale << 5)] = 1;
							}
						}
					}
				}

				if (backColor > 0) {
					for (var4 = 31; var4 >= 0; --var4) {
						for (scale = 31; scale >= 0; --scale) {
							if (var6.pixels[var4 + (scale << 5)] == 0) {
								if (var4 > 0 && var6.pixels[var4 - 1 + (scale << 5)] == 1) {
									var6.pixels[var4 + (scale << 5)] = backColor;
								} else if (scale > 0 && var6.pixels[var4 + (scale - 1 << 5)] == 1) {
									var6.pixels[var4 + (scale << 5)] = backColor;
								} else if (var4 < 31 && var6.pixels[var4 + 1 + (scale << 5)] == 1) {
									var6.pixels[var4 + (scale << 5)] = backColor;
								} else if (scale < 31 && var6.pixels[var4 + (scale + 1 << 5)] == 1) {
									var6.pixels[var4 + (scale << 5)] = backColor;
								}
							}
						}
					}
				} else if (backColor == 0) {
					for (var4 = 31; var4 >= 0; --var4) {
						for (scale = 31; scale >= 0; --scale) {
							if (var6.pixels[var4 + (scale << 5)] == 0 && var4 > 0 && scale > 0
									&& var6.pixels[var4 - 1 + (scale - 1 << 5)] > 0) {
								var6.pixels[var4 + (scale << 5)] = 3153952;
							}
						}
					}
				}

				if (definition.notedTemplateId != -1) {
					var4 = notedSprite.resizeWidth;
					scale = notedSprite.resizeHeight;
					notedSprite.resizeWidth = 32;
					notedSprite.resizeHeight = 32;
					notedSprite.drawSprite(0, 0);
					notedSprite.resizeWidth = var4;
					notedSprite.resizeHeight = scale;
				}

				if (backColor == 0) {
					sprites.put(var6, (long) id);
				}

				Rasterizer2D.init(var12, var11, var10);
				Rasterizer2D.setBounds(var16, var13, var14, var15);
				Rasterizer3D.e = var7;
				Rasterizer3D.f = var8;
				Rasterizer3D.t = var9;
				Rasterizer3D.approximateAlphaBlending = true;
				if (definition.stackable) {
					var6.resizeWidth = 33;
				} else {
					var6.resizeWidth = 32;
				}

				var6.resizeHeight = stackSize;
				return var6;
			}
		}
	}

	public final Model getAmountModel(int amount) {
		// while(true) {
		int var3;
		if (this.stackIds != null && amount > 1) {
			int var2 = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (amount >= this.stackAmounts[var3] && this.stackAmounts[var3] != 0) {
					var2 = this.stackIds[var3];
				}
			}

			if (var2 != -1) {
				ItemDefinition var10000 = fromID(var2);
				amount = 1;
				// this = var10000;
				// continue;
				return var10000.getAmountModel(amount);
			}
		}

		Model var4;
		if ((var4 = (Model) models.get((long) this.id)) != null) {
			return var4;
		}

		if ((var4 = Model.lookup(this.modelId)) == null) {
			return null;
		}

		if (this.groundScaleX != 128 || this.groundScaleY != 128 || this.groudScaleZ != 128) {
			var4.scale(this.groundScaleX, this.groudScaleZ, this.groundScaleY);
		}

		if (this.originalColors != null) {
			for (var3 = 0; var3 < this.originalColors.length; ++var3) {
				var4.recolor(this.originalColors[var3], this.replacementColors[var3]);
			}
		}

		var4.light(64 + this.ambience, 768 + this.diffusion, -50, -10, -50, true);
		var4.y = true;
		models.put(var4, (long) this.id);
		return var4;
		// }
	}

	public final Model asStack(int stackSize) {
		// while(true) {
		int var3;
		if (this.stackIds != null && stackSize > 1) {
			int id = -1;

			for (var3 = 0; var3 < 10; ++var3) {
				if (stackSize >= this.stackAmounts[var3] && this.stackAmounts[var3] != 0) {
					id = this.stackIds[var3];
				}
			}

			if (id != -1) {
				ItemDefinition var10000 = fromID(id);
				stackSize = 1;
				return var10000.asStack(stackSize);
				// this = var10000;
				// continue;
			}
		}

		Model var4;
		if ((var4 = Model.lookup(this.modelId)) == null) {
			return null;
		}

		if (this.originalColors != null) {
			for (var3 = 0; var3 < this.originalColors.length; ++var3) {
				var4.recolor(this.originalColors[var3], this.replacementColors[var3]);
			}
		}

		return var4;
	}
	// }
}
