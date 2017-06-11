/* Class327 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Iterator;

public class ConfigDefinitions {
	public int anInt3468;
	public int anInt3469;
	public int anInt3470;
	static RsByteBuffer aClass298_Sub53_3471;
	public static Class317 aClass317_3472;

	void method3975(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (0 == i_0_) {
					if (i != 16711680) {
						/* empty */
					}
					break;
				}
				method3976(class298_sub53, i_0_, 1156077382);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.a(").append(')').toString());
		}
	}

	void method3976(RsByteBuffer class298_sub53, int i, int i_1_) {
		try {
			if (1 == i) {
				anInt3469 = class298_sub53.readUnsignedShort() * 2019336269;
				anInt3468 = class298_sub53.readUnsignedByte() * 2083582845;
				anInt3470 = class298_sub53.readUnsignedByte() * 627221103;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.f(").append(')').toString());
		}
	}

	ConfigDefinitions() {
		/* empty */
	}

	public static void method3977(Class331 class331, GraphicsToolkit class_ra, int i) {
		try {
			Iterator iterator = Class344.aList3683.iterator();
			while (iterator.hasNext()) {
				Class351 class351 = (Class351) iterator.next();
				if (((Class351) class351).aBoolean3771)
					class351.method4228(class331, class_ra);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.b(").append(')').toString());
		}
	}

	static final void method3978(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -68836416) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1291 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.lt(").append(')').toString());
		}
	}

	public static void method3979(boolean bool, byte[] is, int i) {
		try {
			if (aClass298_Sub53_3471 == null)
				aClass298_Sub53_3471 = new RsByteBuffer(20000);
			aClass298_Sub53_3471.writeBytes(is, 0, is.length, (short) -3701);
			if (bool) {
				Class431.method5763(aClass298_Sub53_3471.buffer, 325303236);
				Class474.aClass343_Sub1Array5975 = new Class343_Sub1[1017276543 * Class24.anInt9950];
				int i_2_ = 0;
				for (int i_3_ = -1648308965 * Class395.anInt5190; i_3_ <= -499146007 * Class338.anInt3630; i_3_++) {
					Class343_Sub1 class343_sub1 = Class226.method2105(i_3_, (byte) 40);
					if (class343_sub1 != null)
						Class474.aClass343_Sub1Array5975[i_2_++] = class343_sub1;
				}
				Class474.aBoolean5974 = false;
				Class325.aLong3454 = Class122.method1319((byte) 1) * -4824082235216898149L;
				aClass298_Sub53_3471 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.p(").append(')').toString());
		}
	}

	static final boolean method3980(char c, int i) {
		try {
			return c == '\u00a0' || c == ' ' || c == '_' || '-' == c;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.b(").append(')').toString());
		}
	}

	static Class298_Sub32 method3981(RsByteBuffer class298_sub53, int i) {
		try {
			class298_sub53.readUnsignedByte();
			int i_4_ = class298_sub53.readUnsignedByte();
			Class298_Sub32 class298_sub32 = Class234.method2182(i_4_, (byte) 11);
			((Class298_Sub32) class298_sub32).anInt7381 = class298_sub53.readUnsignedByte() * -2127296983;
			int i_5_ = class298_sub53.readUnsignedByte();
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				int i_7_ = class298_sub53.readUnsignedByte();
				class298_sub32.method3137(i_7_, class298_sub53, (byte) 92);
			}
			class298_sub32.method3133(-245700254);
			return class298_sub32;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.u(").append(')').toString());
		}
	}

	static final void method3982(ClientScript2 class403, int i) {
		try {
			String string = "";
			if (Class365_Sub1_Sub5_Sub2.aClipboard9941 != null) {
				Transferable transferable = Class365_Sub1_Sub5_Sub2.aClipboard9941.getContents(null);
				if (transferable != null) {
					try {
						string = ((String) transferable.getTransferData(DataFlavor.stringFlavor));
						if (null == string)
							string = "";
					} catch (Exception exception) {
						/* empty */
					}
				}
			}
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.afl(").append(')').toString());
		}
	}

	static void method3983(int i) {
		try {
			Class436.aClass298_Sub37_Sub15_5466 = (new Class298_Sub37_Sub15(Tradution.aClass470_5934.method6049(Class321.aClass429_3357, -875414210), "", -1808468501 * client.anInt8937, 1006, -1, 0L, 0, 0, true, false, 0L, true));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.k(").append(')').toString());
		}
	}

	static final void method3984(ClientScript2 class403, int i) {
		try {
			int i_8_ = ((client.anIntArrayArrayArray8767[(((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)])]).length >> 1);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_8_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nq.afz(").append(')').toString());
		}
	}
}
