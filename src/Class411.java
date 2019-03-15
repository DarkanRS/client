public class Class411 {

	static Class411 aClass411_4951 = new Class411(8, 0);

	static Class411 aClass411_4926 = new Class411(11, 1);

	static Class411 aClass411_4927 = new Class411(3, 2);

	static Class411 aClass411_4928 = new Class411(7, 3);

	static Class411 aClass411_4929 = new Class411(4, 10);

	static Class411 aClass411_4930 = new Class411(1, 11);

	static Class411 aClass411_4942 = new Class411(9, 12);

	static Class411 aClass411_4944 = new Class411(12, 13);

	static Class411 aClass411_4933 = new Class411(26, 14);

	static Class411 aClass411_4934 = new Class411(2, 15);

	static Class411 aClass411_4935 = new Class411(29, 16);

	static Class411 aClass411_4936 = new Class411(25, 17);

	static Class411 aClass411_4937 = new Class411(20, 20);

	static Class411 aClass411_4953 = new Class411(0, 21);

	static Class411 aClass411_4939 = new Class411(13, 22);

	static Class411 aClass411_4940 = new Class411(18, 30);

	static Class411 aClass411_4941 = new Class411(23, 31);

	static Class411 aClass411_4950 = new Class411(5, 32);

	static Class411 aClass411_4943 = new Class411(6, 33);

	static Class411 aClass411_4954 = new Class411(30, 40);

	static Class411 aClass411_4947 = new Class411(17, 41);

	static Class411 aClass411_4946 = new Class411(14, 42);

	static Class411 aClass411_4938 = new Class411(21, 43);

	static Class411 aClass411_4948 = new Class411(28, 50);

	static Class411 aClass411_4949 = new Class411(24, 51);

	static Class411 aClass411_4945 = new Class411(15, 52);

	static Class411 aClass411_4932 = new Class411(19, 53);

	static Class411 aClass411_4952 = new Class411(10, 60);

	static Class411 aClass411_4925 = new Class411(27, 61);

	static Class411 aClass411_4931 = new Class411(22, 70);

	static Class411 aClass411_4955 = new Class411(16, 255);

	public int anInt4956;

	int anInt4957;

	Class411(int i_1, int i_2) {
		this.anInt4956 = i_1;
		this.anInt4957 = i_2;
	}

	static void method6912(RsByteBuffer rsbytebuffer_0) {
		int i_2 = rsbytebuffer_0.readUnsignedSmart(1492689351);
		Class354.aClass213Array4111 = new Class213[i_2];
		int i_3;
		for (i_3 = 0; i_3 < i_2; i_3++) {
			Class354.aClass213Array4111[i_3] = new Class213();
			Class354.aClass213Array4111[i_3].anInt2680 = rsbytebuffer_0.readUnsignedSmart(1678784961);
			Class354.aClass213Array4111[i_3].aString2679 = rsbytebuffer_0.readGJString(-25640017);
		}
		Class485.anInt5740 = rsbytebuffer_0.readUnsignedSmart(1537539293);
		Class244.anInt3003 = rsbytebuffer_0.readUnsignedSmart(1477928184);
		Class4.anInt34 = rsbytebuffer_0.readUnsignedSmart(2033196684);
		Class244.aClass217_Sub1Array3006 = new Class217_Sub1[Class244.anInt3003 - Class485.anInt5740 + 1];
		for (i_3 = 0; i_3 < Class4.anInt34; i_3++) {
			int i_4 = rsbytebuffer_0.readUnsignedSmart(1627362556);
			Class217_Sub1 class217_sub1_5 = Class244.aClass217_Sub1Array3006[i_4] = new Class217_Sub1();
			class217_sub1_5.anInt2696 = rsbytebuffer_0.readUnsignedByte();
			class217_sub1_5.anInt2700 = rsbytebuffer_0.readInt();
			class217_sub1_5.anInt7975 = i_4 + Class485.anInt5740;
			class217_sub1_5.aString7977 = rsbytebuffer_0.readGJString(-1607231726);
			class217_sub1_5.aString7976 = rsbytebuffer_0.readGJString(-157018561);
		}
		Class418.anInt4999 = rsbytebuffer_0.readInt();
		Class244.aBool3007 = true;
	}

	public static void method6914(int i_0) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(9, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) -16);
	}

	public static Class350 method6915(RsByteBuffer rsbytebuffer_0) {
		Class350 class350_2 = Class383.method6512(rsbytebuffer_0);
		int i_3 = rsbytebuffer_0.readInt();
		int i_4 = rsbytebuffer_0.readInt();
		return new Class350_Sub2(class350_2.aClass356_4094, class350_2.aClass353_4087, class350_2.anInt4090, class350_2.anInt4089, class350_2.anInt4093, class350_2.anInt4088, class350_2.anInt4092, class350_2.anInt4086, class350_2.anInt4091, i_3, i_4);
	}
}
