import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public final class VScapeSettings {
   private static String g = SignLink.getLocalCacheDirectory() + "settings.ini";
   public static String a = "";
   public static String b = "";
   public static int c = 0;
   public static int d = 900;
   public static int e = 600;
   public static int camDragSensitivity = 4;

   public static void write() throws Throwable {
      File var0 = new File(g);

      try {
         if(!var0.exists()) {
            var0.createNewFile();
         }
      } catch (IOException var11) {
         System.out.println("error writing settings file.");
      }

      if(var0.exists()) {
         try {
            Throwable var14 = null;

            try {
               BufferedWriter var1 = new BufferedWriter(new FileWriter(g));

               try {
                  var1.write("[CHARACTER]");
                  var1.newLine();
                  var1.write("remember = " + Client.c);
                  var1.newLine();
                  var1.write("username = " + (Client.c?Client.username:""));
                  var1.newLine();
                  var1.write("password = " + (Client.c?Client.password:""));
                  var1.newLine();
                  var1.newLine();
                  var1.write("[CHAT]");
                  var1.newLine();
                  var1.write("game = " + Client.client.h);
                  var1.newLine();
                  var1.write("public = " + Client.client.G);
                  var1.newLine();
                  var1.write("private = " + Client.client.i);
                  var1.newLine();
                  var1.write("clan = " + Client.client.f);
                  var1.newLine();
                  var1.write("trade = " + Client.client.F);
                  var1.newLine();
                  var1.write("global = " + Client.client.g);
                  var1.newLine();
                  var1.newLine();
                  var1.write("[GRAPHICAL]");
                  var1.newLine();
                  var1.write("sizeMode = " + (Client.resizeMode > 0?"1":"0"));
                  var1.newLine();
                  var1.write("resizableW = " + Client.clientWidth);
                  var1.newLine();
                  var1.write("resizableH = " + Client.clientHeight);
                  var1.newLine();
                  var1.write("roofs = " + !Client.client.showRoofs);
                  var1.newLine();
                  var1.newLine();
                  var1.write("[MISC]");
                  var1.newLine();
                  var1.write("loginMusic = " + Client.playLoginMusic);
                  var1.newLine();
                  var1.write("xpDrop = " + Client.client.xpDrops);
                  var1.newLine();
                  var1.write("camDragSensitivity = " + camDragSensitivity);
                  var1.newLine();
                  var1.flush();
                  var1.close();
               } finally {
                  var1.close();
               }
            } catch (Throwable var12) {
               if(var14 == null) {
                  var14 = var12;
               } else if(var14 != var12) {
                  var14.addSuppressed(var12);
               }

               throw var14;
            }
         } catch (IOException var13) {
            System.out.println("error writing settings file.");
         }
      }

      a = Client.c?Client.username:"";
      b = Client.c?Client.password:"";
      c = Client.resizeMode > 0?1:0;
      d = Client.clientWidth;
      e = Client.clientHeight;
   }

   public static void read() throws Throwable {
      if((new File(g)).exists()) {
         try {
            Throwable var1 = null;

            try {
               BufferedReader var2 = new BufferedReader(new FileReader(g));

               try {
                  for(String var0 = var2.readLine(); var0 != null; var0 = var2.readLine()) {
                     int var3;
                     if((var3 = (var0 = var0.trim()).indexOf("=")) >= 0) {
                        String var4 = var0.substring(0, var3).trim();
                        if(!(var0 = var0.substring(var3 + 1).trim()).isEmpty() && var0.length() > 0) {
                           switch(var4.hashCode()) {
                           case -1764210628:
                              if(var4.equals("loginMusic")) {
                                 Client.playLoginMusic = Boolean.parseBoolean(var0);
                              }
                              break;
                           case -1243020381:
                              if(var4.equals("global")) {
                                 Client.client.g = Integer.parseInt(var0);
                              }
                              break;
                           case -977423767:
                              if(var4.equals("public")) {
                                 Client.client.G = Integer.parseInt(var0);
                              }
                              break;
                           case -753895929:
                              if(var4.equals("xpDrop")) {
                                 Client.client.xpDrops = Boolean.parseBoolean(var0);
                              }
                              break;
                           case -522328435:
                              if(var4.equals("remember")) {
                                 Client.c = Boolean.parseBoolean(var0);
                              }
                              break;
                           case -314497661:
                              if(var4.equals("private")) {
                                 Client.client.i = Integer.parseInt(var0);
                              }
                              break;
                           case -265713450:
                              if(var4.equals("username")) {
                                 a = var0;
                                 Client.username = var0;
                              }
                              break;
                           case 3056214:
                              if(var4.equals("clan")) {
                                 Client.client.f = Integer.parseInt(var0);
                              }
                              break;
                           case 3165170:
                              if(var4.equals("game")) {
                                 Client.client.h = Integer.parseInt(var0);
                              }
                              break;
                           case 108698143:
                              if(var4.equals("roofs")) {
                                 Client.client.showRoofs = !Boolean.parseBoolean(var0);
                              }
                              break;
                           case 110621028:
                              if(var4.equals("trade")) {
                                 Client.client.F = Integer.parseInt(var0);
                              }
                              break;
                           case 270258428:
                              if(var4.equals("camDragSensitivity")) {
                                 if((camDragSensitivity = Integer.parseInt(var0)) <= 0) {
                                    camDragSensitivity = 1;
                                 }

                                 if(camDragSensitivity > 10) {
                                    camDragSensitivity = 10;
                                 }
                              }
                              break;
                           case 846767428:
                              if(var4.equals("sizeMode")) {
                                 c = Integer.parseInt(var0);
                              }
                              break;
                           case 1216985755:
                              if(var4.equals("password")) {
                                 b = var0;
                                 Client.password = var0;
                              }
                              break;
                           case 2046685949:
                              if(var4.equals("resizableH")) {
                                 e = Integer.parseInt(var0);
                              }
                              break;
                           case 2046685964:
                              if(var4.equals("resizableW")) {
                                 d = Integer.parseInt(var0);
                              }
                           }
                        }
                     }
                  }

                  var2.close();
               } finally {
                  var2.close();
               }

               return;
            } catch (Throwable var12) {
               if(var1 == null) {
                  var1 = var12;
               } else if(var1 != var12) {
                  var1.addSuppressed(var12);
               }

               throw var1;
            }
         } catch (IOException var13) {
            System.out.println("error writing settings file.");
         }
      }

   }
}
