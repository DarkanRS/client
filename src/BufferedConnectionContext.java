/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class BufferedConnectionContext {
	int anInt327;
	Class318 aClass318_328;
	Class453 aClass453_329 = new Class453();
	public IsaacCipher aClass449_330;
	RsByteBuffer aClass298_Sub53_331;
	static int anInt332 = 15000;
	RsBitsBuffer stream;
	IsaacCipher aClass449_334;
	IncommingPacket INCOMMING_PACKET;
	int anInt336;
	boolean aBoolean337;
	int anInt338;
	public int anInt339;
	Class124 aClass124_340;
	int anInt341;
	int anInt342;
	int anInt343;
	IncommingPacket aClass202_344;
	IncommingPacket aClass202_345;
	int anInt346 = 0;
	public boolean aBoolean347;
	IncommingPacket aClass202_348;

	final void method383(short i) {
		try {
			((BufferedConnectionContext) this).aClass453_329.method5943((byte) 1);
			((BufferedConnectionContext) this).anInt346 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.a(").append(')').toString());
		}
	}

	void method384(byte i) {
		try {
			if (((BufferedConnectionContext) this).aClass318_328 != null) {
				((BufferedConnectionContext) this).aClass318_328.method3860(-2071805238);
				((BufferedConnectionContext) this).aClass318_328 = null;
			}
			((BufferedConnectionContext) this).aClass124_340.method1381(null, -2060987245);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.k(").append(')').toString());
		}
	}

	BufferedConnectionContext() {
		((BufferedConnectionContext) this).aClass298_Sub53_331 = new RsByteBuffer(1500);
		((BufferedConnectionContext) this).stream = new RsBitsBuffer(15000);
		((BufferedConnectionContext) this).INCOMMING_PACKET = null;
		((BufferedConnectionContext) this).anInt336 = 0;
		((BufferedConnectionContext) this).aBoolean337 = true;
		((BufferedConnectionContext) this).anInt338 = 0;
		anInt339 = 0;
		aBoolean347 = false;
		((BufferedConnectionContext) this).aClass124_340 = new Class124();
		Thread thread = new Thread(((BufferedConnectionContext) this).aClass124_340);
		thread.setPriority(1);
		thread.start();
	}

	void method385(int i) {
		try {
			((BufferedConnectionContext) this).aClass318_328 = null;
			((BufferedConnectionContext) this).aClass124_340.method1381(null, -2119645240);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.d(").append(')').toString());
		}
	}

	public final void method386(int i) throws IOException {
		try {
			if (((BufferedConnectionContext) this).aClass318_328 != null && 500279933 * ((BufferedConnectionContext) this).anInt346 > 0) {
				((BufferedConnectionContext) this).aClass298_Sub53_331.index = 0;
				for (;;) {
					Class298_Sub36 class298_sub36 = (Class298_Sub36) ((BufferedConnectionContext) this).aClass453_329.method5939(1766612795);
					if (null == class298_sub36) {
						if (i < -876809530)
							break;
						return;
					}
					if (58571303 * class298_sub36.anInt7399 > ((((BufferedConnectionContext) this).aClass298_Sub53_331.buffer).length - (((BufferedConnectionContext) this).aClass298_Sub53_331.index * 385051775))) {
						if (i < -876809530)
							break;
						return;
					}
					((BufferedConnectionContext) this).aClass298_Sub53_331.writeBytes((class298_sub36.aClass298_Sub53_Sub2_7396.buffer), 0, class298_sub36.anInt7399 * 58571303, (short) -5547);
					((BufferedConnectionContext) this).anInt346 -= class298_sub36.anInt7399 * 20706419;
					class298_sub36.unlink(-1460969981);
					class298_sub36.aClass298_Sub53_Sub2_7396.method3650(-2079366553);
					class298_sub36.method3400(939112928);
				}
				((BufferedConnectionContext) this).aClass318_328.method3868(((BufferedConnectionContext) this).aClass298_Sub53_331.buffer, 0, (385051775 * ((BufferedConnectionContext) this).aClass298_Sub53_331.index), 1953252448);
				((BufferedConnectionContext) this).anInt342 += (211924279 * ((BufferedConnectionContext) this).aClass298_Sub53_331.index);
				anInt339 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.f(").append(')').toString());
		}
	}

	public Class318 method387(int i) {
		try {
			return ((BufferedConnectionContext) this).aClass318_328;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.u(").append(')').toString());
		}
	}

	void method388(byte i) {
		try {
			if (client.anInt8884 * 443738891 % 50 == 0) {
				((BufferedConnectionContext) this).anInt327 = -514533411 * ((BufferedConnectionContext) this).anInt342;
				((BufferedConnectionContext) this).anInt342 = 0;
				((BufferedConnectionContext) this).anInt343 = ((BufferedConnectionContext) this).anInt341 * 65385213;
				((BufferedConnectionContext) this).anInt341 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.p(").append(')').toString());
		}
	}

	void method389(Class318 class318, String string, byte i) {
		try {
			((BufferedConnectionContext) this).aClass318_328 = class318;
			((BufferedConnectionContext) this).aClass124_340.method1381(string, -2024607091);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.i(").append(')').toString());
		}
	}

	public final void method390(Class298_Sub36 class298_sub36, byte i) {
		try {
			((BufferedConnectionContext) this).aClass453_329.method5935(class298_sub36, 1630737890);
			class298_sub36.anInt7399 = (class298_sub36.aClass298_Sub53_Sub2_7396.index * -2007143959);
			class298_sub36.aClass298_Sub53_Sub2_7396.index = 0;
			((BufferedConnectionContext) this).anInt346 += class298_sub36.anInt7399 * 20706419;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.b(").append(')').toString());
		}
	}

	static final void method391(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_0_, (byte) -78);
			Class119 class119 = Class389.aClass119Array4165[i_0_ >> 16];
			Class241.method2247(class105, class119, class403, -915458909);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.ev(").append(')').toString());
		}
	}

	static int method392(byte[][] is, byte[][] is_1_, int[] is_2_, byte[] is_3_, int[] is_4_, int i, int i_5_, int i_6_) {
		try {
			int i_7_ = is_2_[i];
			int i_8_ = is_4_[i] + i_7_;
			int i_9_ = is_2_[i_5_];
			int i_10_ = i_9_ + is_4_[i_5_];
			int i_11_ = i_7_;
			if (i_9_ > i_7_)
				i_11_ = i_9_;
			int i_12_ = i_8_;
			if (i_10_ < i_8_)
				i_12_ = i_10_;
			int i_13_ = is_3_[i] & 0xff;
			if ((is_3_[i_5_] & 0xff) < i_13_)
				i_13_ = is_3_[i_5_] & 0xff;
			byte[] is_14_ = is_1_[i];
			byte[] is_15_ = is[i_5_];
			int i_16_ = i_11_ - i_7_;
			int i_17_ = i_11_ - i_9_;
			for (int i_18_ = i_11_; i_18_ < i_12_; i_18_++) {
				int i_19_ = is_14_[i_16_++] + is_15_[i_17_++];
				if (i_19_ < i_13_)
					i_13_ = i_19_;
			}
			return -i_13_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.b(").append(')').toString());
		}
	}

	public static void method393(int i, int i_20_, String string, String string_21_, String string_22_, String string_23_, String string_24_, int i_25_, int i_26_) {
		try {
			Class102 class102 = Class107.aClass102Array1312[99];
			for (int i_27_ = 99; i_27_ > 0; i_27_--)
				Class107.aClass102Array1312[i_27_] = Class107.aClass102Array1312[i_27_ - 1];
			if (class102 == null)
				class102 = new Class102(i, i_20_, string, string_21_, string_22_, string_24_, i_25_, string_23_);
			else
				class102.method1082(i, i_20_, string, string_21_, string_22_, string_24_, i_25_, string_23_, (short) 8448);
			Class107.aClass102Array1312[0] = class102;
			Class107.anInt1310 += 760013237;
			client.anInt8882 = client.anInt8933 * 1619726147;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.i(").append(')').toString());
		}
	}

	static final void method394(ClientScript2 class403, int i) {
		try {
			Class390.method4875(Class272.method2557(-2133581125), class403, (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.ut(").append(')').toString());
		}
	}

	static final void method395(ClientScript2 class403, int i) {
		try {
			int i_28_ = (((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]);
			Class128.aClass148_6331.method1604(i_28_, (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), 681479919);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("az.m(").append(')').toString());
		}
	}
}
