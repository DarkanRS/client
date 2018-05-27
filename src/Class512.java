/* Class512 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

final class Class512 implements Runnable {
	
	public void method8759() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_7964.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_7964 = null;
	}

	public void run() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_7964.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_7964 = null;
	}

	public void method8760() {
		try {
			IcmpService_Sub1.anIcmpService_Sub1_7964.run();
		} catch (Throwable throwable) {
			/* empty */
		}
		IcmpService_Sub1.anIcmpService_Sub1_7964 = null;
	}

	public static short[] method8761(short[] is, int i) {
		if (null == is)
			return null;
		short[] is_0_ = new short[is.length];
		System.arraycopy(is, 0, is_0_, 0, is.length);
		return is_0_;
	}

	public static final void method8762(Player class521_sub1_sub1_sub2_sub1, int i, int i_1_, byte i_2_, byte i_3_) {
		int i_4_ = class521_sub1_sub1_sub2_sub1.regionBaseX[0];
		int i_5_ = class521_sub1_sub1_sub2_sub1.regionBaseY[0];
		if (i_4_ >= 0 && i_4_ < IndexLoaders.MAP_REGION_DECODER.method4424(1757338570) && i_5_ >= 0 && i_5_ < IndexLoaders.MAP_REGION_DECODER.method4451(-701853905) && (i >= 0 && i < IndexLoaders.MAP_REGION_DECODER.method4424(66898442) && i_1_ >= 0 && i_1_ < IndexLoaders.MAP_REGION_DECODER.method4451(-890656908))) {
			int i_6_ = Class112.method1873(i_4_, i_5_, class521_sub1_sub1_sub2_sub1.method15805(828768449), Class38.method853(i, i_1_, 1356660525), (IndexLoaders.MAP_REGION_DECODER.method4552(class521_sub1_sub1_sub2_sub1.aByte7967, 1801793645)), true, client.anIntArray7245, client.anIntArray7246, -1498716878);
			if (i_6_ >= 1 && i_6_ <= 3) {
				for (int i_7_ = 0; i_7_ < i_6_ - 1; i_7_++)
					class521_sub1_sub1_sub2_sub1.method16132(client.anIntArray7245[i_7_], client.anIntArray7246[i_7_], i_2_, (short) 255);
			}
		}
	}

	static final void method8763(CS2Executor class527, int i) {
		int i_8_ = (class527.unknown[301123709 * class527.instrPtr]);
		Class158_Sub1.aClass3_8507.method280(i_8_, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -1160393570);
	}
}
