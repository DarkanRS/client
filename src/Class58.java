/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class58 {
	public int anInt574;
	public static int anInt575 = 4318;
	public static int anInt576 = 4098;
	public String aString577;
	public static int anInt578 = -1;
	public static int anInt579 = 0;
	public static int anInt580 = 32902;
	public int anInt581;
	public String aString582;
	public long aLong583;

	public Class58(int i, String string, int i_0_, String string_1_, long l) {
		anInt574 = i * -665725969;
		aString582 = string;
		anInt581 = -364036995 * i_0_;
		aString577 = string_1_;
		aLong583 = l * -6963750442385516415L;
	}

	public static int method692(int i, int i_2_, int i_3_) {
		try {
			int i_4_ = i_2_ >>> 24;
			int i_5_ = 255 - i_4_;
			i_2_ = ((i_2_ & 0xff00ff) * i_4_ & ~0xff00ff | i_4_ * (i_2_ & 0xff00) & 0xff0000) >>> 8;
			return i_2_ + ((i_5_ * (i & 0xff00ff) & ~0xff00ff | (i & 0xff00) * i_5_ & 0xff0000) >>> 8);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ci.d(").append(')').toString());
		}
	}

	public static int method693(String string, int i) {
		try {
			return string.length() + 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ci.s(").append(')').toString());
		}
	}

	static boolean method694(int i) {
		try {
			if (Class436.aClass298_Sub37_Sub15_5477 == null)
				return false;
			if ((((Class298_Sub37_Sub15) Class436.aClass298_Sub37_Sub15_5477).anInt9662) * 946432351 >= 2000)
				((Class298_Sub37_Sub15) Class436.aClass298_Sub37_Sub15_5477).anInt9662 -= -853837264;
			if (1007 == 946432351 * ((Class298_Sub37_Sub15) Class436.aClass298_Sub37_Sub15_5477).anInt9662)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ci.x(").append(')').toString());
		}
	}

	public static Class134 method695(RsByteBuffer class298_sub53, int i) {
		try {
			int i_6_ = class298_sub53.readUnsignedByte();
			Class139 class139 = (Class491.method6176((byte) 12)[class298_sub53.readUnsignedByte()]);
			Class133 class133 = (Class113.method1255(334501262)[class298_sub53.readUnsignedByte()]);
			int i_7_ = class298_sub53.readShort(2061620701);
			int i_8_ = class298_sub53.readShort(1990309362);
			int i_9_ = class298_sub53.readUnsignedShort();
			int i_10_ = class298_sub53.readUnsignedShort();
			int i_11_ = class298_sub53.readInt((byte) -72);
			int i_12_ = class298_sub53.readInt((byte) 16);
			int i_13_ = class298_sub53.readInt((byte) 7);
			boolean bool = class298_sub53.readUnsignedByte() == 1;
			return new Class134(i_6_, class139, class133, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, bool);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ci.a(").append(')').toString());
		}
	}
}
