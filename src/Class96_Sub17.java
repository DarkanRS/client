/* Class96_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub17 extends Class96 {
	int anInt9385;
	int anInt9386;
	String aString9387;
	int anInt9388;
	int anInt9389;

	Class96_Sub17(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub17) this).anInt9385 = class282_sub35.readUnsignedShort() * -1930592711;
		((Class96_Sub17) this).anInt9386 = class282_sub35.readUnsignedShort() * -621881623;
		((Class96_Sub17) this).aString9387 = class282_sub35.readString();
		((Class96_Sub17) this).anInt9388 = class282_sub35.readInt() * -1475639137;
		((Class96_Sub17) this).anInt9389 = class282_sub35.readUnsignedShort() * -159499065;
	}

	public void method1592(int i) {
		Class59.method1161(Class4.anInt35 * 675588453, 31133705 * ((Class96_Sub17) this).anInt9385, ((Class96_Sub17) this).anInt9386 * -2086575783, (Class504.method8389(31133705 * ((Class96_Sub17) this).anInt9385, -2086575783 * ((Class96_Sub17) this).anInt9386, 675588453 * Class4.anInt35, (byte) 47)), ((Class96_Sub17) this).anInt9389 * -469908233, ((Class96_Sub17) this).anInt9388 * 882611039, ((Class96_Sub17) this).aString9387, (short) 12244);
	}

	public void method1601() {
		Class59.method1161(Class4.anInt35 * 675588453, 31133705 * ((Class96_Sub17) this).anInt9385, ((Class96_Sub17) this).anInt9386 * -2086575783, (Class504.method8389(31133705 * ((Class96_Sub17) this).anInt9385, -2086575783 * ((Class96_Sub17) this).anInt9386, 675588453 * Class4.anInt35, (byte) 93)), ((Class96_Sub17) this).anInt9389 * -469908233, ((Class96_Sub17) this).anInt9388 * 882611039, ((Class96_Sub17) this).aString9387, (short) 20309);
	}

	static final void method14653(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, -271288407) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1353 = Class351.method6193(string, class527, 1245386660);
		class118.aBool1384 = true;
	}

	static final boolean performCalculationS1(int srcX, int srcY, RouteStrategy strategy, ClipMap clipMap, int i_1_) {
		int currentX = srcX;
		int currentY = srcY;
		int halfGraphSizeX = 64;
		int halfGraphSizeY = 64;
		int graphBaseX = srcX - halfGraphSizeX;
		int graphBaseY = srcY - halfGraphSizeY;
		Class251.directions[halfGraphSizeX][halfGraphSizeY] = 99;
		Class251.distances[halfGraphSizeX][halfGraphSizeY] = 0;
		int write = 0;
		int read = 0;
		Class251.bufferX[write] = currentX;
		Class251.bufferY[write++] = currentY;
		int[][] clip = clipMap.map;
		while (read != write) {
			currentX = Class251.bufferX[read];
			currentY = Class251.bufferY[read];
			read = 1 + read & 0xfff;
			halfGraphSizeX = currentX - graphBaseX;
			halfGraphSizeY = currentY - graphBaseY;
			int cX = currentX - -1969357273 * clipMap.offsetX;
			int cY = currentY - 1503444365 * clipMap.offsetY;
			if (strategy.canExit(1, currentX, currentY, clipMap, (byte) -1)) {
				Class251.exitX = currentX * -1071145131;
				Class251.exitY = -1330567915 * currentY;
				return true;
			}
			int nextDistance = Class251.distances[halfGraphSizeX][halfGraphSizeY] + 1;
			if (halfGraphSizeX > 0 && Class251.directions[halfGraphSizeX - 1][halfGraphSizeY] == 0 && (clip[cX - 1][cY] & 0x42240000) == 0) {
				Class251.bufferX[write] = currentX - 1;
				Class251.bufferY[write] = currentY;
				write = write + 1 & 0xfff;
				Class251.directions[halfGraphSizeX - 1][halfGraphSizeY] = 2;
				Class251.distances[halfGraphSizeX - 1][halfGraphSizeY] = nextDistance;
			}
			if (halfGraphSizeX < 127 && Class251.directions[halfGraphSizeX + 1][halfGraphSizeY] == 0 && 0 == (clip[1 + cX][cY] & 0x60240000)) {
				Class251.bufferX[write] = 1 + currentX;
				Class251.bufferY[write] = currentY;
				write = 1 + write & 0xfff;
				Class251.directions[1 + halfGraphSizeX][halfGraphSizeY] = 8;
				Class251.distances[halfGraphSizeX + 1][halfGraphSizeY] = nextDistance;
			}
			if (halfGraphSizeY > 0 && 0 == Class251.directions[halfGraphSizeX][halfGraphSizeY - 1] && 0 == (clip[cX][cY - 1] & 0x40a40000)) {
				Class251.bufferX[write] = currentX;
				Class251.bufferY[write] = currentY - 1;
				write = write + 1 & 0xfff;
				Class251.directions[halfGraphSizeX][halfGraphSizeY - 1] = 1;
				Class251.distances[halfGraphSizeX][halfGraphSizeY - 1] = nextDistance;
			}
			if (halfGraphSizeY < 127 && 0 == Class251.directions[halfGraphSizeX][halfGraphSizeY + 1] && (clip[cX][cY + 1] & 0x48240000) == 0) {
				Class251.bufferX[write] = currentX;
				Class251.bufferY[write] = currentY + 1;
				write = write + 1 & 0xfff;
				Class251.directions[halfGraphSizeX][1 + halfGraphSizeY] = 4;
				Class251.distances[halfGraphSizeX][1 + halfGraphSizeY] = nextDistance;
			}
			if (halfGraphSizeX > 0 && halfGraphSizeY > 0 && Class251.directions[halfGraphSizeX - 1][halfGraphSizeY - 1] == 0 && 0 == (clip[cX - 1][cY - 1] & 0x43a40000) && (clip[cX - 1][cY] & 0x42240000) == 0 && 0 == (clip[cX][cY - 1] & 0x40a40000)) {
				Class251.bufferX[write] = currentX - 1;
				Class251.bufferY[write] = currentY - 1;
				write = 1 + write & 0xfff;
				Class251.directions[halfGraphSizeX - 1][halfGraphSizeY - 1] = 3;
				Class251.distances[halfGraphSizeX - 1][halfGraphSizeY - 1] = nextDistance;
			}
			if (halfGraphSizeX < 127 && halfGraphSizeY > 0 && 0 == Class251.directions[halfGraphSizeX + 1][halfGraphSizeY - 1] && (clip[1 + cX][cY - 1] & 0x60e40000) == 0 && 0 == (clip[1 + cX][cY] & 0x60240000) && (clip[cX][cY - 1] & 0x40a40000) == 0) {
				Class251.bufferX[write] = currentX + 1;
				Class251.bufferY[write] = currentY - 1;
				write = write + 1 & 0xfff;
				Class251.directions[1 + halfGraphSizeX][halfGraphSizeY - 1] = 9;
				Class251.distances[1 + halfGraphSizeX][halfGraphSizeY - 1] = nextDistance;
			}
			if (halfGraphSizeX > 0 && halfGraphSizeY < 127 && Class251.directions[halfGraphSizeX - 1][1 + halfGraphSizeY] == 0 && 0 == (clip[cX - 1][1 + cY] & 0x4e240000) && (clip[cX - 1][cY] & 0x42240000) == 0 && 0 == (clip[cX][1 + cY] & 0x48240000)) {
				Class251.bufferX[write] = currentX - 1;
				Class251.bufferY[write] = currentY + 1;
				write = write + 1 & 0xfff;
				Class251.directions[halfGraphSizeX - 1][halfGraphSizeY + 1] = 6;
				Class251.distances[halfGraphSizeX - 1][1 + halfGraphSizeY] = nextDistance;
			}
			if (halfGraphSizeX < 127 && halfGraphSizeY < 127 && 0 == Class251.directions[1 + halfGraphSizeX][1 + halfGraphSizeY] && (clip[cX + 1][1 + cY] & 0x78240000) == 0 && (clip[1 + cX][cY] & 0x60240000) == 0 && (clip[cX][1 + cY] & 0x48240000) == 0) {
				Class251.bufferX[write] = 1 + currentX;
				Class251.bufferY[write] = 1 + currentY;
				write = write + 1 & 0xfff;
				Class251.directions[1 + halfGraphSizeX][1 + halfGraphSizeY] = 12;
				Class251.distances[halfGraphSizeX + 1][1 + halfGraphSizeY] = nextDistance;
			}
		}
		Class251.exitX = currentX * -1071145131;
		Class251.exitY = currentY * -1330567915;
		return false;
	}

	static final void method14655(CS2Executor class527, byte i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class115.anInt1247 * 842593263;
	}

	public static void method14656(int i, int i_13_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Engine.getIComponentVar(20, (long) i);
		class282_sub50_sub12.method14965((byte) 40);
	}
}
