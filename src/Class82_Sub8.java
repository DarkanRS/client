/* Class82_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub8 extends Class82 {
	long aLong6853;
	int anInt6854;
	public static Class57 aClass57_6855;
	public static String aString6856;

	public void method866(int i) {
		try {
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) Class87.aClass437_793.get(8017746467363524815L * (((Class82_Sub8) this).aLong6853)));
			if (class298_sub35 != null)
				class298_sub35.anInt7394 = -1178949921 * ((Class82_Sub8) this).anInt6854;
			else
				Class87.aClass437_793.method5817(new Class298_Sub35(825940513 * ((Class82_Sub8) this).anInt6854), ((Class82_Sub8) this).aLong6853 * 8017746467363524815L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xq.f(").append(')').toString());
		}
	}

	public void method868() {
		Class298_Sub35 class298_sub35 = ((Class298_Sub35) Class87.aClass437_793.get(8017746467363524815L * (((Class82_Sub8) this).aLong6853)));
		if (class298_sub35 != null)
			class298_sub35.anInt7394 = -1178949921 * ((Class82_Sub8) this).anInt6854;
		else
			Class87.aClass437_793.method5817(new Class298_Sub35(825940513 * ((Class82_Sub8) this).anInt6854), ((Class82_Sub8) this).aLong6853 * 8017746467363524815L);
	}

	Class82_Sub8(RsByteBuffer class298_sub53, boolean bool) {
		super(class298_sub53);
		int i = class298_sub53.readUnsignedShort();
		if (bool)
			((Class82_Sub8) this).aLong6853 = (0x100000000L | (long) i) * -3845001125918771665L;
		else
			((Class82_Sub8) this).aLong6853 = (long) i * -3845001125918771665L;
		((Class82_Sub8) this).anInt6854 = class298_sub53.readInt((byte) -88) * -914937375;
	}

	public void method869() {
		Class298_Sub35 class298_sub35 = ((Class298_Sub35) Class87.aClass437_793.get(8017746467363524815L * (((Class82_Sub8) this).aLong6853)));
		if (class298_sub35 != null)
			class298_sub35.anInt7394 = -1178949921 * ((Class82_Sub8) this).anInt6854;
		else
			Class87.aClass437_793.method5817(new Class298_Sub35(825940513 * ((Class82_Sub8) this).anInt6854), ((Class82_Sub8) this).aLong6853 * 8017746467363524815L);
	}

	static final void method892(ClientScript2 class403, byte i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -30);
			Class239.method2209(class105, class403, (byte) 24);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xq.qw(").append(')').toString());
		}
	}

	public static void method893(int i, int i_1_) {
		try {
			Class441.aBooleanArray5590[i] = false;
			Class140.method1560(i, -175879726);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xq.u(").append(')').toString());
		}
	}

	static final void method894(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7570.method5612(i_2_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xq.aoh(").append(')').toString());
		}
	}

	static void method895(int i, int i_3_, int i_4_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(6, (long) i);
			class298_sub37_sub12.method3449((byte) 15);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = i_3_ * 1274450087;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xq.as(").append(')').toString());
		}
	}

	static void method896(int i, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_) {
		try {
			long l = (long) (i | (bool ? -2147483648 : 0));
			Class298_Sub9 class298_sub9 = (Class298_Sub9) Class298_Sub9.aClass437_7224.get(l);
			if (class298_sub9 == null) {
				class298_sub9 = new Class298_Sub9();
				Class298_Sub9.aClass437_7224.method5817(class298_sub9, l);
			}
			if (((Class298_Sub9) class298_sub9).anIntArray7226.length <= i_5_) {
				int[] is = new int[i_5_ + 1];
				int[] is_9_ = new int[i_5_ + 1];
				for (int i_10_ = 0; (i_10_ < ((Class298_Sub9) class298_sub9).anIntArray7226.length); i_10_++) {
					is[i_10_] = (((Class298_Sub9) class298_sub9).anIntArray7226[i_10_]);
					is_9_[i_10_] = (((Class298_Sub9) class298_sub9).anIntArray7227[i_10_]);
				}
				for (int i_11_ = (((Class298_Sub9) class298_sub9).anIntArray7226).length; i_11_ < i_5_; i_11_++) {
					is[i_11_] = -1;
					is_9_[i_11_] = 0;
				}
				((Class298_Sub9) class298_sub9).anIntArray7226 = is;
				((Class298_Sub9) class298_sub9).anIntArray7227 = is_9_;
			}
			((Class298_Sub9) class298_sub9).anIntArray7226[i_5_] = i_6_;
			((Class298_Sub9) class298_sub9).anIntArray7227[i_5_] = i_7_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xq.d(").append(')').toString());
		}
	}

	static final void method897(ClientScript2 class403, byte i) {
		try {
			if (-1233866115 * client.anInt8752 != 14 || Class315.method3837((byte) 9))
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else if (Class474.aBoolean5974)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			else if (Class325.aLong3454 * -247648477838985581L > Class122.method1319((byte) 1) - 1000L)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else {
				Class474.aBoolean5974 = true;
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2071, client.lobbyConnection.aClass449_330, (byte) 42);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(-1351839083 * Class117.anInt1399, -933492277);
				client.lobbyConnection.method390(class298_sub36, (byte) -36);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xq.alo(").append(')').toString());
		}
	}
}
