public final class VariableParameter {
   public static VariableParameter[] parameters;
   private static int c;
   private static int[] d;
   public int parameter;

   public static void init(Archive archive) {
      Buffer buffer = new Buffer(archive.getEntry("varp.dat"));
      c = 0;
      int count = buffer.readUShort();
      if(parameters == null) {
         parameters = new VariableParameter[count];
      }

      if(d == null) {
         d = new int[count];
      }

      for(int id = 0; id < count; ++id) {
         if(parameters[id] == null) {
            parameters[id] = new VariableParameter();
         }

         VariableParameter var10000 = parameters[id];
         var10000.decode(buffer, id);
      }

      if(buffer.position != buffer.payload.length) {
         System.out.println("varptype load mismatch");
      }

   }

private void decode(Buffer buffer, int id) {
	int var3 = id;

	 int var6;
	 while((var6 = buffer.readUByte()) != 0) {
	    if(var6 == 1) {
	       buffer.readUByte();
	    } else if(var6 == 2) {
	       buffer.readUByte();
	    } else if(var6 == 3) {
	       d[c++] = var3;
	    } else if(var6 != 4) {
	       if(var6 == 5) {
	          parameter = buffer.readUShort();
	       } else if(var6 != 6) {
	          if(var6 == 7) {
	             buffer.readInt();
	          } else if(var6 != 8) {
	             if(var6 == 10) {
	                buffer.readString();
	             } else if(var6 != 11) {
	                if(var6 == 12) {
	                   buffer.readInt();
	                } else if(var6 != 13) {
	                   System.out.println("Error unrecognised config code: " + var6);
	                }
	             }
	          }
	       }
	    }
	 }
}
}
