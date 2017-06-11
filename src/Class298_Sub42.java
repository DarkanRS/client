/* Class298_Sub42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub42 extends Linkable {
	int anInt7457;
	int anInt7458;
	int anInt7459;
	int anInt7460;
	int anInt7461;
	int anInt7462;
	int anInt7463;
	int anInt7464;
	int anInt7465;

	boolean method3520(int i, int i_0_, int i_1_, int i_2_) {
		try {
			if (((Class298_Sub42) this).anInt7464 * -206354885 == i && i_0_ >= ((Class298_Sub42) this).anInt7459 * -731405573 && i_0_ <= 480895455 * ((Class298_Sub42) this).anInt7460 && i_1_ >= -1728316981 * ((Class298_Sub42) this).anInt7462 && i_1_ <= -176293349 * ((Class298_Sub42) this).anInt7458)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.f(").append(')').toString());
		}
	}

	boolean method3521(int i, int i_3_, int i_4_) {
		try {
			if (i >= ((Class298_Sub42) this).anInt7459 * -731405573 && i <= 480895455 * ((Class298_Sub42) this).anInt7460 && i_3_ >= -1728316981 * ((Class298_Sub42) this).anInt7462 && i_3_ <= -176293349 * ((Class298_Sub42) this).anInt7458)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.a(").append(')').toString());
		}
	}

	boolean method3522(int i, int i_5_, byte i_6_) {
		try {
			if (i >= ((Class298_Sub42) this).anInt7457 * 1528024175 && i <= ((Class298_Sub42) this).anInt7461 * 37578241 && i_5_ >= 50981941 * ((Class298_Sub42) this).anInt7463 && i_5_ <= ((Class298_Sub42) this).anInt7465 * 1374138429)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.b(").append(')').toString());
		}
	}

	void method3523(int i, int i_7_, int[] is, int i_8_) {
		try {
			is[0] = -206354885 * ((Class298_Sub42) this).anInt7464;
			is[1] = (-731405573 * ((Class298_Sub42) this).anInt7459 - 1528024175 * ((Class298_Sub42) this).anInt7457 + i);
			is[2] = i_7_ + (((Class298_Sub42) this).anInt7462 * -1728316981 - 50981941 * ((Class298_Sub42) this).anInt7463);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.p(").append(')').toString());
		}
	}

	Class298_Sub42(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		((Class298_Sub42) this).anInt7464 = 301572851 * i;
		((Class298_Sub42) this).anInt7459 = i_9_ * 868816947;
		((Class298_Sub42) this).anInt7462 = -1243061277 * i_10_;
		((Class298_Sub42) this).anInt7460 = i_11_ * 992156191;
		((Class298_Sub42) this).anInt7458 = 878333971 * i_12_;
		((Class298_Sub42) this).anInt7457 = i_13_ * -134278513;
		((Class298_Sub42) this).anInt7463 = 1339754013 * i_14_;
		((Class298_Sub42) this).anInt7461 = i_15_ * 1785108993;
		((Class298_Sub42) this).anInt7465 = i_16_ * 734947093;
	}

	void method3524(int i, int i_17_, int[] is, int i_18_) {
		try {
			is[0] = 0;
			is[1] = (((Class298_Sub42) this).anInt7457 * 1528024175 - ((Class298_Sub42) this).anInt7459 * -731405573 + i);
			is[2] = (50981941 * ((Class298_Sub42) this).anInt7463 - -1728316981 * ((Class298_Sub42) this).anInt7462 + i_17_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aca.i(").append(')').toString());
		}
	}
}
