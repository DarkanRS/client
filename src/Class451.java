/* Class451 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class451 {
	Class243 aClass243_5639;
	Class348 aClass348_5640 = new Class348(128);
	public static Class243 aClass243_5641;

	public void method5929(int i) {
		try {
			synchronized (((Class451) this).aClass348_5640) {
				((Class451) this).aClass348_5640.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sp.f(").append(')').toString());
		}
	}

	public void method5930(int i, int i_0_) {
		try {
			synchronized (((Class451) this).aClass348_5640) {
				((Class451) this).aClass348_5640.method4186(i, -328942985);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sp.b(").append(')').toString());
		}
	}

	public void method5931(int i) {
		try {
			synchronized (((Class451) this).aClass348_5640) {
				((Class451) this).aClass348_5640.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sp.p(").append(')').toString());
		}
	}

	public Class443 method5932(int i, byte i_1_) {
		try {
			Class443 class443;
			synchronized (((Class451) this).aClass348_5640) {
				class443 = (Class443) ((Class451) this).aClass348_5640.method4184((long) i);
			}
			if (class443 != null)
				return class443;
			byte[] is;
			synchronized (((Class451) this).aClass243_5639) {
				is = (((Class451) this).aClass243_5639.getFile(-1006924897 * Class120.aClass120_1428.anInt1460, i, (byte) -122));
			}
			class443 = new Class443();
			if (is != null)
				class443.method5882(new RsByteBuffer(is), (byte) -31);
			synchronized (((Class451) this).aClass348_5640) {
				((Class451) this).aClass348_5640.method4194(class443, (long) i);
			}
			return class443;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sp.a(").append(')').toString());
		}
	}

	public Class451(Class411 class411, Class429 class429, Class243 class243) {
		((Class451) this).aClass243_5639 = class243;
		((Class451) this).aClass243_5639.method2316((-1006924897 * (Class120.aClass120_1428.anInt1460)), -978414795);
	}

	static final void method5933(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			Class497 class497 = Class92.aClass504_905.method6251(i_3_, 1053350248);
			if (class497.method6206(1883696427))
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class501.aClass395_6122.method4903(i_2_, (byte) -26).method4877(i_3_, class497.aString6101, -130818690);
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = (Class501.aClass395_6122.method4903(i_2_, (byte) 51).method4881(i_3_, -388931549 * class497.anInt6100, 240769181));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sp.abq(").append(')').toString());
		}
	}

	public static void method5934(Player class365_sub1_sub1_sub2_sub2, byte i) {
		try {
			Class298_Sub41 class298_sub41 = ((Class298_Sub41) (Class298_Sub41.aClass437_7440.get((long) (1888274983 * class365_sub1_sub1_sub2_sub2.anInt10064))));
			if (null == class298_sub41)
				Class391.method4884(class365_sub1_sub1_sub2_sub2.plane, (class365_sub1_sub1_sub2_sub2.scenePositionXQueue[0]), (class365_sub1_sub1_sub2_sub2.scenePositionYQueue[0]), 0, null, null, class365_sub1_sub1_sub2_sub2, (byte) 58);
			else
				class298_sub41.method3519(-1931224140);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sp.u(").append(')').toString());
		}
	}
}
