/* Class383 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;
import java.util.Queue;

public class ClientScriptsExecutor {
	static int anInt4120;
	static Class374_Sub2 aClass374_Sub2_4121;
	static boolean aBoolean4122;
	static long aLong4123 = 7881601697932874601L;
	static Queue aQueue4124;
	static Class374_Sub1 aClass374_Sub1_4125;
	public static String[] aStringArray4126;

	static {
		anInt4120 = 0;
		aBoolean4122 = true;
		aClass374_Sub1_4125 = new Class374_Sub1();
		aClass374_Sub2_4121 = new Class374_Sub2();
		aQueue4124 = new LinkedList();
	}

	ClientScriptsExecutor() throws Throwable {
		throw new Error();
	}

	static void method4690(ClientScript class298_sub37_sub17, int i, ClientScript2 class403, int i_0_) {
		try {
			((ClientScript2) class403).anInt5239 = 0;
			((ClientScript2) class403).anInt5241 = 0;
			((ClientScript2) class403).anInt5259 = -286750741;
			((ClientScript2) class403).aClass298_Sub37_Sub17_5260 = class298_sub37_sub17;
			((ClientScript2) class403).aClass394Array5258 = (((ClientScript2) class403).aClass298_Sub37_Sub17_5260.aClass394Array9675);
			((ClientScript2) class403).anIntArray5257 = (((ClientScript2) class403).aClass298_Sub37_Sub17_5260.anIntArray9676);
			Class394 class394 = null;
			((ClientScript2) class403).anInt5250 = 0;
			try {
				try {
					Class388.anInt4152 = 0;
					for (;;) {
						Class388.anInt4152 += -138185287;
						if (-560594807 * Class388.anInt4152 > i)
							throw new RuntimeException("");
						class394 = (((ClientScript2) class403).aClass394Array5258[(((ClientScript2) class403).anInt5259 += 286750741) * 1883543357]);
						if (Class388.aBoolean4154 && (null == Class388.aString4155 || (null != (((ClientScript2) class403).aClass298_Sub37_Sub17_5260.aString9673) && (((ClientScript2) class403).aClass298_Sub37_Sub17_5260.aString9673.indexOf(Class388.aString4155) != -1))))
							System.out.println(new StringBuilder().append(((ClientScript2) class403).aClass298_Sub37_Sub17_5260.aString9673).append(": ").append(class394).toString());
						if ((((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]) == 1)
							((ClientScript2) class403).aBoolean5261 = true;
						else
							((ClientScript2) class403).aBoolean5261 = false;
						if (Class394.aClass394_4206 == class394 && (((ClientScript2) class403).anInt5250 * -932179775 == 0)) {
							Class50.method531((byte) 116);
							break;
						}
						Class249.method2392(class394, class403, (byte) 11);
					}
				} catch (Exception exception) {
					StringBuilder stringbuilder = new StringBuilder(30);
					stringbuilder.append("").append(7051297995265073167L * (((ClientScript2) class403).aClass298_Sub37_Sub17_5260.linkedKey)).append(" ");
					for (int i_1_ = (((ClientScript2) class403).anInt5250 * -932179775) - 1; i_1_ >= 0; i_1_--)
						stringbuilder.append("").append(7051297995265073167L * (((Class402) (((ClientScript2) class403).aClass402Array5249[i_1_])).aClass298_Sub37_Sub17_5229.linkedKey)).append(" ");
					stringbuilder.append("").append(Integer.valueOf(-2008816077 * class394.anInt5187));
					Class464.method6062(stringbuilder.toString(), exception, (short) -1126);
					Class50.method531((byte) 46);
				}
			} catch (RuntimeException object) {
				Class50.method531((byte) 2);
				throw object;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("px.s(").append(')').toString());
		}
	}

	static final void method4691(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = ((Player) ((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242).method4470(true, -1660599936);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("px.aom(").append(')').toString());
		}
	}

	static boolean method4692(CharSequence charsequence, int i, boolean bool, int i_2_) {
		try {
			if (i < 2 || i > 36)
				throw new IllegalArgumentException(new StringBuilder().append("").append(i).toString());
			boolean bool_3_ = false;
			boolean bool_4_ = false;
			int i_5_ = 0;
			int i_6_ = charsequence.length();
			for (int i_7_ = 0; i_7_ < i_6_; i_7_++) {
				int i_8_ = charsequence.charAt(i_7_);
				if (i_7_ == 0) {
					if (45 == i_8_) {
						bool_3_ = true;
						continue;
					}
					if (i_8_ == 43 && bool) {
						if (i_2_ != -1628070489)
							throw new IllegalStateException();
						continue;
					}
				}
				if (i_8_ >= 48 && i_8_ <= 57)
					i_8_ -= 48;
				else if (i_8_ >= 65 && i_8_ <= 90)
					i_8_ -= 55;
				else if (i_8_ >= 97 && i_8_ <= 122)
					i_8_ -= 87;
				else
					return false;
				if (i_8_ >= i)
					return false;
				if (bool_3_)
					i_8_ = -i_8_;
				int i_9_ = i_5_ * i + i_8_;
				if (i_9_ / i != i_5_)
					return false;
				i_5_ = i_9_;
				bool_4_ = true;
			}
			return bool_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("px.p(").append(')').toString());
		}
	}

	static void method4693(int i) {
		try {
			if (Class151.method1646(client.anInt8752 * -1233866115, -1337586273)) {
				if (client.lobbyConnection.method387(537308016) == null)
					Class439.method5851(4, 1378010016);
				else
					Class439.method5851(14, 310060879);
			} else if (-1233866115 * client.anInt8752 == 4 || client.anInt8752 * -1233866115 == 3)
				Class439.method5851(19, 1879261492);
			else if (client.anInt8752 * -1233866115 == 6)
				Class439.method5851(19, 1046566062);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("px.o(").append(')').toString());
		}
	}

	static final void method4694(ClientScript2 class403, byte i) {
		try {
			int i_10_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (client.aString8804 != null && i_10_ < -1801543887 * Class489.anInt6071)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = Class82_Sub6.aClass7Array6846[i_10_].aString92;
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("px.wp(").append(')').toString());
		}
	}
}
