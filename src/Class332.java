public class Class332 {

	public static Class332 aClass332_3875 = new Class332(1);
	static Class332 aClass332_3874 = new Class332(0);
	int anInt3876;

	Class332(int i_1) {
		this.anInt3876 = i_1;
	}

	static void method5927(int i_0, byte b_1) {
		Class180.aClass229_2245.method3858(i_0, (byte) 12);
	}

	public static Class350 method5928(RsByteBuffer rsbytebuffer_0, int i_1) {
		Class350_Sub3 class350_sub3_2 = (Class350_Sub3) Class163.method2843(rsbytebuffer_0, 653185943);
		int i_3 = rsbytebuffer_0.readShort();
		return new Class350_Sub3_Sub1(class350_sub3_2.aClass356_4094, class350_sub3_2.aClass353_4087, class350_sub3_2.anInt4090, class350_sub3_2.anInt4089, class350_sub3_2.anInt4093, class350_sub3_2.anInt4088, class350_sub3_2.anInt4092, class350_sub3_2.anInt4086, class350_sub3_2.anInt4091, class350_sub3_2.anInt7844, class350_sub3_2.anInt7840, class350_sub3_2.anInt7842, class350_sub3_2.anInt7843, class350_sub3_2.anInt7841, class350_sub3_2.anInt7845, i_3);
	}

	static void method5929(int i_0) {
		Class148.anInt1730 = 0;
		Class282_Sub44_Sub3.aClass282_Sub7_9563 = null;
		Class454.aClass250_5450 = null;
		Class75.aClass317_746 = null;
		Class282_Sub33.aClass282_Sub15_Sub2_7836 = null;
	}

	public static void method5930(int i_0, byte b_1) {
		TCPMessage tcpmessage_2 = Class271.method4828(OutgoingPacket.aClass379_4531, client.aClass184_7475.isaac, 220366407);
		tcpmessage_2.buffer.writeInt(-1);
		client.aClass184_7475.method3049(tcpmessage_2, 916919130);
		Class260.aClass116_3229 = new Class116(IndexLoaders.MUSIC_INDEX, i_0);
	}

}
