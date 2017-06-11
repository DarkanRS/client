/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class23 {
	static short aShort279 = 30;
	static short aShort280 = 3;
	static short aShort281 = 4;
	static short aShort282 = 5;
	static short aShort283 = 19;
	static short aShort284 = 9;
	static short aShort285 = 52;
	static short aShort286 = 10;
	static short aShort287 = 1012;
	static short aShort288 = 12;
	static short aShort289 = 13;
	static short aShort290 = 15;
	static short aShort291 = 16;
	static short aShort292 = 17;
	static short aShort293 = 18;
	static short aShort294 = 11;
	static short aShort295 = 20;
	static short aShort296 = 21;
	static short aShort297 = 22;
	static short aShort298 = 23;
	static short aShort299 = 57;
	static short aShort300 = 1011;
	static short aShort301 = 44;
	static short aShort302 = 47;
	static short aShort303 = 6;
	static short aShort304 = 46;
	static short aShort305 = 48;
	static short aShort306 = 49;
	static short aShort307 = 50;
	static short aShort308 = 51;
	static short aShort309 = 8;
	static short aShort310 = 53;
	static short aShort311 = 45;
	static short aShort312 = 1010;
	static short aShort313 = 59;
	static short aShort314 = 60;
	static short aShort315 = 58;
	static short aShort316 = 1002;
	static short aShort317 = 1003;
	static short aShort318 = 1004;
	static short aShort319 = 1006;
	static short aShort320 = 1007;
	static short aShort321 = 1008;
	static short aShort322 = 1009;
	static short aShort323 = 25;
	static short aShort324 = 2;
	static short aShort325 = 1001;
	public static Class243 aClass243_326;

	Class23() throws Throwable {
		throw new Error();
	}

	static final void method375(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class352 class352 = Class363.aClass339_3931.method4116(i_0_, -2093323393);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class352.anInt3817 * -804513353;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ax.ama(").append(')').toString());
		}
	}

	public static Class57 method376(GraphicsToolkit class_ra, int i, byte i_1_) {
		try {
			Class298_Sub49 class298_sub49 = ((Class298_Sub49) Class423.aClass437_5354.get((long) i));
			if (class298_sub49 != null) {
				Class298_Sub24_Sub3 class298_sub24_sub3 = ((Class298_Sub49) class298_sub49).aClass308_Sub1_7591.method3770((byte) 9);
				((Class298_Sub49) class298_sub49).aBoolean7594 = true;
				if (class298_sub24_sub3 != null) {
					((Class431) Class423.aClass431_5352).aClass_ra6503 = class_ra;
					return ((Class57) class298_sub24_sub3.method3088((Class423.aClass431_5352), -710052434));
				}
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ax.k(").append(')').toString());
		}
	}

	static void method377(String string, String string_2_, String string_3_, boolean bool, boolean bool_4_, byte i) {
		try {
			BufferedConnectionContext class25 = Class429.method5760((short) 512);
			if (class25.method387(537308016) != null) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2084, class25.aClass449_330, (byte) 52);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShort((Class58.method693(string, -142100047) + Class58.method693(string_2_, -435846723) + Class58.method693(string_3_, 733332406) + 1), 16711935);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string, 2114181594);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string_2_, 2128054697);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeString(string_3_, 2103261593);
				int i_5_ = 0;
				if (bool)
					i_5_ |= 0x1;
				if (bool_4_)
					i_5_ |= 0x2;
				class298_sub36.aClass298_Sub53_Sub2_7396.writeByte(i_5_);
				class25.method390(class298_sub36, (byte) -114);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ax.h(").append(')').toString());
		}
	}

	static final void method378(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -278777595 * Class436.anInt5506;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1592446965 * Class436.anInt5479;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ax.ua(").append(')').toString());
		}
	}

	public static int method379(RsByteBuffer class298_sub53, String string, int i) {
		try {
			int i_6_ = 385051775 * class298_sub53.index;
			byte[] is = Class77.method840(string, 1241279576);
			class298_sub53.method3594(is.length, (byte) 34);
			class298_sub53.index += ((Class106.aClass113_1308.method1246(is, 0, is.length, class298_sub53.buffer, 385051775 * class298_sub53.index, (byte) -45)) * 116413311);
			return 385051775 * class298_sub53.index - i_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ax.f(").append(')').toString());
		}
	}
}
