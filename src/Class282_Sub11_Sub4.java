public class Class282_Sub11_Sub4 extends Class282_Sub11 {

	Class349 this$0;

	String aString10218;

	int anInt10216;

	byte aByte10217;

	void method12204(ClanChannel class282_sub4_1) {
		ClanChannelPlayer class57_3 = new ClanChannelPlayer();
		class57_3.name = this.aString10218;
		class57_3.world = this.anInt10216;
		class57_3.rank = this.aByte10217;
		class282_sub4_1.method12105(class57_3);
	}

	void method12205(ClanChannel class282_sub4_1) {
		ClanChannelPlayer class57_2 = new ClanChannelPlayer();
		class57_2.name = this.aString10218;
		class57_2.world = this.anInt10216 * 1097857565 * -1982781809 * -1097296133;
		class57_2.rank = this.aByte10217;
		class282_sub4_1.method12105(class57_2);
	}

	Class282_Sub11_Sub4(Class349 class349_1) {
		this.this$0 = class349_1;
		this.aString10218 = null;
	}

	void method12203(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			--rsbytebuffer_1.index;
			rsbytebuffer_1.readLong();
		}
		this.aString10218 = rsbytebuffer_1.readNullString();
		this.anInt10216 = rsbytebuffer_1.readUnsignedShort();
		this.aByte10217 = rsbytebuffer_1.readByte();
		rsbytebuffer_1.readLong();
	}

	void method12206(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			rsbytebuffer_1.readLong();
		}
		this.aString10218 = rsbytebuffer_1.readNullString();
		this.anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
		this.aByte10217 = rsbytebuffer_1.readByte();
		rsbytebuffer_1.readLong();
	}

	void method12207(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			rsbytebuffer_1.readLong();
		}
		this.aString10218 = rsbytebuffer_1.readNullString();
		this.anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
		this.aByte10217 = rsbytebuffer_1.readByte();
		rsbytebuffer_1.readLong();
	}

	void method12208(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			rsbytebuffer_1.readLong();
		}
		this.aString10218 = rsbytebuffer_1.readNullString();
		this.anInt10216 = rsbytebuffer_1.readUnsignedShort() * 1097857565 * -1282369483;
		this.aByte10217 = rsbytebuffer_1.readByte();
		rsbytebuffer_1.readLong();
	}
}
