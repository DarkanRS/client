public class Class282_Sub11_Sub4 extends Class282_Sub11 {

	Class349 this$0;
	String aString10218;
	int anInt10216;
	byte aByte10217;

	void method12204(Class282_Sub4 class282_sub4_1, int i_2) {
		Class57 class57_3 = new Class57();
		class57_3.aString524 = this.aString10218;
		class57_3.anInt526 = this.anInt10216;
		class57_3.aByte525 = this.aByte10217;
		class282_sub4_1.method12105(class57_3, (byte) 92);
	}

	void method12205(Class282_Sub4 class282_sub4_1) {
		Class57 class57_2 = new Class57();
		class57_2.aString524 = this.aString10218;
		class57_2.anInt526 = this.anInt10216 * 1097857565 * -1982781809 * -1097296133;
		class57_2.aByte525 = this.aByte10217;
		class282_sub4_1.method12105(class57_2, (byte) 92);
	}

	Class282_Sub11_Sub4(Class349 class349_1) {
		this.this$0 = class349_1;
		this.aString10218 = null;
	}

	void method12203(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			--rsbytebuffer_1.index;
			rsbytebuffer_1.readLong(1727926612);
		}

		this.aString10218 = rsbytebuffer_1.readNullString();
		this.anInt10216 = rsbytebuffer_1.readUnsignedShort();
		this.aByte10217 = rsbytebuffer_1.readByte();
		rsbytebuffer_1.readLong(2047516343);
	}

	void method12206(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			rsbytebuffer_1.readLong(2073241783);
		}

		this.aString10218 = rsbytebuffer_1.readNullString();
		this.anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
		this.aByte10217 = rsbytebuffer_1.readByte();
		rsbytebuffer_1.readLong(732799323);
	}

	void method12207(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			rsbytebuffer_1.readLong(1508093198);
		}

		this.aString10218 = rsbytebuffer_1.readNullString();
		this.anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
		this.aByte10217 = rsbytebuffer_1.readByte();
		rsbytebuffer_1.readLong(573713222);
	}

	void method12208(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			rsbytebuffer_1.readLong(-130957944);
		}

		this.aString10218 = rsbytebuffer_1.readNullString();
		this.anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
		this.aByte10217 = rsbytebuffer_1.readByte();
		rsbytebuffer_1.readLong(511730374);
	}

	static final void method15616(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		WorldMapAreaDefs worldmapareadefs_3 = IndexLoaders.WORLD_MAP_INDEX_LOADER.getWorldMapDefs(i_2, 461290146);
		if (worldmapareadefs_3.areaName == null) {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = "";
		} else {
			cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = worldmapareadefs_3.areaName;
		}

	}

}
