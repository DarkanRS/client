/* Class82_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub20 extends Class82 {
	int anInt6896;
	int anInt6897;
	String aString6898;
	int anInt6899;
	int anInt6900;

	Class82_Sub20(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub20) this).anInt6900 = class298_sub53.readUnsignedShort() * -1972913347;
		((Class82_Sub20) this).anInt6896 = class298_sub53.readUnsignedShort() * 1250113173;
		((Class82_Sub20) this).aString6898 = class298_sub53.readString(2035314126);
		((Class82_Sub20) this).anInt6897 = class298_sub53.readInt((byte) 53) * -1423918679;
		((Class82_Sub20) this).anInt6899 = class298_sub53.readUnsignedShort() * 1154354255;
	}

	public void method869() {
		Class300.method3687(1855729883 * Class99.anInt952, -1180797931 * ((Class82_Sub20) this).anInt6900, -1854610243 * ((Class82_Sub20) this).anInt6896, (Class356.method4271(-1180797931 * ((Class82_Sub20) this).anInt6900, ((Class82_Sub20) this).anInt6896 * -1854610243, 1855729883 * Class99.anInt952, -2129149221)), ((Class82_Sub20) this).anInt6899 * -745698641, ((Class82_Sub20) this).anInt6897 * 1817377433, ((Class82_Sub20) this).aString6898, 1145625350);
	}

	public void method868() {
		Class300.method3687(1855729883 * Class99.anInt952, -1180797931 * ((Class82_Sub20) this).anInt6900, -1854610243 * ((Class82_Sub20) this).anInt6896, (Class356.method4271(-1180797931 * ((Class82_Sub20) this).anInt6900, ((Class82_Sub20) this).anInt6896 * -1854610243, 1855729883 * Class99.anInt952, -1605294967)), ((Class82_Sub20) this).anInt6899 * -745698641, ((Class82_Sub20) this).anInt6897 * 1817377433, ((Class82_Sub20) this).aString6898, 531512737);
	}

	public void method866(int i) {
		try {
			Class300.method3687(1855729883 * Class99.anInt952, -1180797931 * ((Class82_Sub20) this).anInt6900, -1854610243 * ((Class82_Sub20) this).anInt6896, Class356.method4271((-1180797931 * ((Class82_Sub20) this).anInt6900), (((Class82_Sub20) this).anInt6896 * -1854610243), 1855729883 * Class99.anInt952, -1944886078), ((Class82_Sub20) this).anInt6899 * -745698641, ((Class82_Sub20) this).anInt6897 * 1817377433, ((Class82_Sub20) this).aString6898, 1123266965);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yn.f(").append(')').toString());
		}
	}

	static void method933(byte i) {
		try {
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.RECEIVE_PACKET_COUNT_PACKET, client.gameConnection.aClass449_330, (byte) 17);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(client.anInt8713 * -2059460167, -1112529192);
			client.gameConnection.method390(class298_sub36, (byte) -106);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yn.ns(").append(')').toString());
		}
	}

	public static void method934(int i, byte i_0_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(16, (long) i);
			class298_sub37_sub12.method3445(-2024208824);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yn.l(").append(')').toString());
		}
	}

	static void method935(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(18, (long) i_1_ << 32 | (long) i);
			class298_sub37_sub12.method3449((byte) 25);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_2_;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 = i_3_ * 293101103;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yn.am(").append(')').toString());
		}
	}
}
