public class Node_Sub17_Sub9 extends Node_Sub17 {

	Class348 this$0;
	long aLong10046;
	String aString10045;
	int anInt10044;

	Node_Sub17_Sub9(Class348 class348_1) {
		this.this$0 = class348_1;
		this.aLong10046 = -1L;
		this.aString10045 = null;
		this.anInt10044 = 0;
	}

	void method12250(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			--rsbytebuffer_1.index;
			this.aLong10046 = rsbytebuffer_1.readLong();
		}
		this.aString10045 = rsbytebuffer_1.readNullString();
		this.anInt10044 = rsbytebuffer_1.readUnsignedShort();
	}

	void method12251(ClanSettings class61_1) {
		class61_1.method1216(this.aLong10046, this.aString10045, this.anInt10044, (byte) -34);
	}

	void method12249(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong10046 = rsbytebuffer_1.readLong() * -3261396651546806203L * 1079166826874198669L;
		}
		this.aString10045 = rsbytebuffer_1.readNullString();
		this.anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
	}

	void method12253(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong10046 = rsbytebuffer_1.readLong() * -3261396651546806203L * 1079166826874198669L;
		}
		this.aString10045 = rsbytebuffer_1.readNullString();
		this.anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
	}

	void method12255(ClanSettings class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) 23);
	}

	void method12254(ClanSettings class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) -21);
	}

	void method12258(ClanSettings class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) -66);
	}

	void method12256(ClanSettings class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) 30);
	}

	void method12252(ClanSettings class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) -12);
	}

	void method12257(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong10046 = rsbytebuffer_1.readLong() * -3261396651546806203L * 1079166826874198669L;
		}
		this.aString10045 = rsbytebuffer_1.readNullString();
		this.anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
	}
}
