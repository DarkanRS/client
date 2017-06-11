/* Class318 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.io.IOException;

public abstract class Class318 {
	static Class298_Sub37_Sub15 aClass298_Sub37_Sub15_3322;
	static int anInt3323;

	public abstract int method3855() throws IOException;

	public abstract boolean isAvailable(int length, byte i_0_) throws IOException;

	public abstract int method3857(int i) throws IOException;

	public abstract int read(byte[] is, int i, int i_1_, byte i_2_) throws IOException;

	public abstract void method3859();

	public abstract void method3860(int i);

	Class318() {
		/* empty */
	}

	public abstract boolean method3861(int i) throws IOException;

	public abstract void method3862(byte[] is, int i, int i_3_) throws IOException;

	public abstract void method3863();

	public abstract int method3864(byte[] is, int i, int i_4_) throws IOException;

	public abstract void method3865(byte[] is, int i, int i_5_) throws IOException;

	public abstract void method3866(byte[] is, int i, int i_6_) throws IOException;

	public abstract void method3867(byte i);

	public abstract void method3868(byte[] is, int i, int i_7_, int i_8_) throws IOException;

	public abstract int method3869(byte[] is, int i, int i_9_) throws IOException;

	static final void method3870(ClientScript2 class403, int i) {
		try {
			if (client.anInt8942 * 1131012101 == 0)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -2;
			else if (client.anInt8942 * 1131012101 == 1)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = -1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = client.anInt8941 * -1054937867;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ng.vb(").append(')').toString());
		}
	}

	static final void method3871(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1959403445;
			int i_10_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_11_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_12_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			int i_13_ = (((ClientScript2) class403).anIntArray5244[3 + 681479919 * ((ClientScript2) class403).anInt5239]);
			int i_14_ = (((ClientScript2) class403).anIntArray5244[4 + ((ClientScript2) class403).anInt5239 * 681479919]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (i_11_ - i_10_) * (i_14_ - i_12_) / (i_13_ - i_12_) + i_10_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ng.yo(").append(')').toString());
		}
	}

	static final void method3872(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			client.aShort8928 = (short) (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			if (client.aShort8928 <= 0)
				client.aShort8928 = (short) 256;
			client.aShort8929 = (short) (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]);
			if (client.aShort8929 <= 0)
				client.aShort8929 = (short) 205;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ng.akb(").append(')').toString());
		}
	}

	static void method3873(int i) {
		try {
			client.aClass283_8716.method2646((byte) 8);
			InputStream_Sub1.method273(1268026984);
			Class223.method2082(true, -1663847334);
			Class117.method1278((byte) 27);
			System.gc();
			Class373.aClass_ra4071.ba(2, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ng.lk(").append(')').toString());
		}
	}

	public static Container method3874(byte i) {
		try {
			if (null != Class231.aFrame2589)
				return Class231.aFrame2589;
			if (null != Class298_Sub36.aFrame7403)
				return Class298_Sub36.aFrame7403;
			return ClientScriptMap.anApplet6044;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ng.t(").append(')').toString());
		}
	}

	static final void method3875(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1567522756;
			class105.anInt1253 = -478399925 * (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			class105.anInt1153 = (-1661995333 * (((ClientScript2) class403).anIntArray5244[1 + 681479919 * ((ClientScript2) class403).anInt5239]));
			class105.anInt1221 = 0;
			class105.anInt1198 = 0;
			int i_15_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			if (i_15_ < 0)
				i_15_ = 0;
			else if (i_15_ > 4)
				i_15_ = 4;
			int i_16_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 3]);
			if (i_16_ < 0)
				i_16_ = 0;
			else if (i_16_ > 4)
				i_16_ = 4;
			class105.aByte1148 = (byte) i_15_;
			class105.aByte1149 = (byte) i_16_;
			Tradution.method6054(class105, -903706483);
			Class438.method5845(class119, class105, -1959938301);
			if (0 == class105.anInt1144 * -1215239439)
				Class65.method761(class119, class105, false, 112223880);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ng.ck(").append(')').toString());
		}
	}
}
