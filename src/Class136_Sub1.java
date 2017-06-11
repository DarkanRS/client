/* Class136_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class136_Sub1 extends Class136 {
	int anInt8576 = 0;

	public void method56(boolean bool) {
		int i = ((((Class136_Sub1) this).aClass158_6386.aClass139_6360.method1545(((Class136_Sub1) this).aClass57_6385.method271(), client.anInt8794 * 775068819, -2069269081)) + ((Class136_Sub1) this).aClass158_6386.anInt6362 * -245579987);
		int i_0_ = ((((Class136_Sub1) this).aClass158_6386.aClass133_6363.method1482(((Class136_Sub1) this).aClass57_6385.method626(), client.anInt8803 * -791746413, -936935431)) + (((Class136_Sub1) this).aClass158_6386.anInt6359 * -1426302101));
		((Class136_Sub1) this).aClass57_6385.method673((float) (i + ((Class136_Sub1) this).aClass57_6385.method271() / 2), (float) (i_0_ + ((Class136_Sub1) this).aClass57_6385.method626() / 2), 4096, ((Class136_Sub1) this).anInt8576 * -157704951);
		((Class136_Sub1) this).anInt8576 += 315105141 * ((Class158_Sub1) ((Class136_Sub1) this).aClass158_6386).anInt8567;
	}

	Class136_Sub1(Class243 class243, Class158_Sub1 class158_sub1) {
		super(class243, (Class158) class158_sub1);
	}

	public void method58(boolean bool, byte i) {
		try {
			int i_1_ = ((((Class136_Sub1) this).aClass158_6386.aClass139_6360.method1545(((Class136_Sub1) this).aClass57_6385.method271(), client.anInt8794 * 775068819, -2041461531)) + (((Class136_Sub1) this).aClass158_6386.anInt6362 * -245579987));
			int i_2_ = ((((Class136_Sub1) this).aClass158_6386.aClass133_6363.method1482(((Class136_Sub1) this).aClass57_6385.method626(), client.anInt8803 * -791746413, -2132177466)) + (((Class136_Sub1) this).aClass158_6386.anInt6359 * -1426302101));
			((Class136_Sub1) this).aClass57_6385.method673((float) (i_1_ + (((Class136_Sub1) this).aClass57_6385.method271() / 2)), (float) (i_2_ + (((Class136_Sub1) this).aClass57_6385.method626() / 2)), 4096, ((Class136_Sub1) this).anInt8576 * -157704951);
			((Class136_Sub1) this).anInt8576 += 315105141 * (((Class158_Sub1) ((Class136_Sub1) this).aClass158_6386).anInt8567);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("zh.f(").append(')').toString());
		}
	}

	static final void method1502(int i, byte i_3_) {
		try {
			client.anIntArray8793 = new int[i];
			client.anIntArray8670 = new int[i];
			client.anIntArray8795 = new int[i];
			client.anIntArray8641 = new int[i];
			client.anIntArray8797 = new int[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("zh.iw(").append(')').toString());
		}
	}
}
