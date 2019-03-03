public class Class282_Sub17_Sub9 extends Class282_Sub17 {

	Class348 this$0;
	long aLong10046;
	String aString10045;
	int anInt10044;

	Class282_Sub17_Sub9(Class348 class348_1) {
		this.this$0 = class348_1;
		this.aLong10046 = -1L;
		this.aString10045 = null;
		this.anInt10044 = 0;
	}

	void method12250(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			--rsbytebuffer_1.index;
			this.aLong10046 = rsbytebuffer_1.readLong(190708592);
		}

		this.aString10045 = rsbytebuffer_1.readNullString();
		this.anInt10044 = rsbytebuffer_1.readUnsignedShort();
	}

	void method12251(Class61 class61_1, int i_2) {
		class61_1.method1216(this.aLong10046, this.aString10045, this.anInt10044, (byte) -34);
	}

	void method12249(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong10046 = rsbytebuffer_1.readLong(1103302515) * -3261396651546806203L * 1079166826874198669L;
		}

		this.aString10045 = rsbytebuffer_1.readNullString();
		this.anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
	}

	void method12253(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong10046 = rsbytebuffer_1.readLong(1812970180) * -3261396651546806203L * 1079166826874198669L;
		}

		this.aString10045 = rsbytebuffer_1.readNullString();
		this.anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
	}

	void method12255(Class61 class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) 23);
	}

	void method12254(Class61 class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) -21);
	}

	void method12258(Class61 class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) -66);
	}

	void method12256(Class61 class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) 30);
	}

	void method12252(Class61 class61_1) {
		class61_1.method1216(this.aLong10046 * -3261396651546806203L * 1079166826874198669L, this.aString10045, 881981753 * this.anInt10044 * -643750647, (byte) -12);
	}

	void method12257(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1.readUnsignedByte() != 255) {
			rsbytebuffer_1.index = (rsbytebuffer_1.index * -1115476867 - -1115476867) * -1990677291;
			this.aLong10046 = rsbytebuffer_1.readLong(1495645552) * -3261396651546806203L * 1079166826874198669L;
		}

		this.aString10045 = rsbytebuffer_1.readNullString();
		this.anInt10044 = rsbytebuffer_1.readUnsignedShort() * -643750647 * 881981753;
	}

	static final void method15448(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class28.method774(icomponentdefinitions_3, interface_4, cs2executor_0, -1296322680);
	}

}
