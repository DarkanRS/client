/* Class282_Sub11_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub11_Sub4 extends Class282_Sub11 {
	int anInt10216;
	byte aByte10217;
	String aString10218;
	Class349 this$0;

	void method12204(Class282_Sub4 class282_sub4, int i) {
		Class57 class57 = new Class57();
		class57.aString524 = ((Class282_Sub11_Sub4) this).aString10218;
		class57.anInt526 = ((Class282_Sub11_Sub4) this).anInt10216 * -1982781809;
		class57.aByte525 = ((Class282_Sub11_Sub4) this).aByte10217;
		class282_sub4.method12105(class57, (byte) 92);
	}

	void method12205(Class282_Sub4 class282_sub4) {
		Class57 class57 = new Class57();
		class57.aString524 = ((Class282_Sub11_Sub4) this).aString10218;
		class57.anInt526 = ((Class282_Sub11_Sub4) this).anInt10216 * -1982781809;
		class57.aByte525 = ((Class282_Sub11_Sub4) this).aByte10217;
		class282_sub4.method12105(class57, (byte) 92);
	}

	Class282_Sub11_Sub4(Class349 class349) {
		((Class282_Sub11_Sub4) this).this$0 = class349;
		((Class282_Sub11_Sub4) this).aString10218 = null;
	}

	void method12203(RsByteBuffer class282_sub35, int i) {
		if (class282_sub35.readUnsignedByte() != 255) {
			class282_sub35.index -= -1115476867;
			class282_sub35.readLong(1727926612);
		}
		((Class282_Sub11_Sub4) this).aString10218 = class282_sub35.readNullString(422828400);
		((Class282_Sub11_Sub4) this).anInt10216 = class282_sub35.readUnsignedShort() * 1097857565;
		((Class282_Sub11_Sub4) this).aByte10217 = class282_sub35.readByte();
		class282_sub35.readLong(2047516343);
	}

	void method12206(RsByteBuffer class282_sub35) {
		if (class282_sub35.readUnsignedByte() != 255) {
			class282_sub35.index -= -1115476867;
			class282_sub35.readLong(2073241783);
		}
		((Class282_Sub11_Sub4) this).aString10218 = class282_sub35.readNullString(-145183646);
		((Class282_Sub11_Sub4) this).anInt10216 = class282_sub35.readUnsignedShort() * 1097857565;
		((Class282_Sub11_Sub4) this).aByte10217 = class282_sub35.readByte();
		class282_sub35.readLong(732799323);
	}

	void method12207(RsByteBuffer class282_sub35) {
		if (class282_sub35.readUnsignedByte() != 255) {
			class282_sub35.index -= -1115476867;
			class282_sub35.readLong(1508093198);
		}
		((Class282_Sub11_Sub4) this).aString10218 = class282_sub35.readNullString(1154304204);
		((Class282_Sub11_Sub4) this).anInt10216 = class282_sub35.readUnsignedShort() * 1097857565;
		((Class282_Sub11_Sub4) this).aByte10217 = class282_sub35.readByte();
		class282_sub35.readLong(573713222);
	}

	void method12208(RsByteBuffer class282_sub35) {
		if (class282_sub35.readUnsignedByte() != 255) {
			class282_sub35.index -= -1115476867;
			class282_sub35.readLong(-130957944);
		}
		((Class282_Sub11_Sub4) this).aString10218 = class282_sub35.readNullString(2004842633);
		((Class282_Sub11_Sub4) this).anInt10216 = class282_sub35.readUnsignedShort() * 1097857565;
		((Class282_Sub11_Sub4) this).aByte10217 = class282_sub35.readByte();
		class282_sub35.readLong(511730374);
	}

	static final void method15616(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		WorldMapAreaDefs class220 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_0_, 461290146);
		if (null == class220.areaName)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = class220.areaName;
	}
}
