/* Class493 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;

public class Class493 {
	public int anInt6085;
	public int anInt6086;
	public int anInt6087;
	public int anInt6088 = 0;

	void method6186(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i >= 385051775) {
						/* empty */
					}
					break;
				}
				method6187(class298_sub53, i_0_, (byte) 112);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ui.a(").append(')').toString());
		}
	}

	void method6187(RsByteBuffer class298_sub53, int i, byte i_1_) {
		try {
			if (i == 1)
				anInt6088 = class298_sub53.readUnsignedByte() * 248827265;
			else if (2 == i)
				anInt6087 = class298_sub53.readUnsignedShort() * 258319417;
			else if (3 == i)
				anInt6085 = class298_sub53.readUnsignedShort() * -819060847;
			else if (i == 4)
				anInt6086 = class298_sub53.readShort(1649788845) * -1244481247;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ui.f(").append(')').toString());
		}
	}

	Class493() {
		anInt6086 = 0;
		anInt6085 = 1895598080;
		anInt6087 = 757188608;
	}

	public static void method6188(Class243 class243, int i) {
		try {
			Class344.anInt3678 = 0;
			Class344.anInt3686 = 0;
			Class344.aList3683 = new LinkedList();
			Class344.aClass302_Sub3_Sub1_Sub1Array3676 = new Class302_Sub3_Sub1_Sub1[1024];
			Class344.aClass351Array3679 = new Class351[1 + (Class65.anIntArray658[1197525581 * Class344.anInt3675])];
			Class344.anInt3680 = 0;
			Class344.anInt3681 = 0;
			Class112.method1243(class243, (byte) -107);
			Class108.method1146(class243, 679109105);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ui.a(").append(')').toString());
		}
	}

	static boolean method6189(int i, byte i_2_) {
		try {
			return (44 == i || i == 45 || 46 == i || 47 == i || 48 == i || 49 == i || 50 == i || i == 51 || 52 == i || 53 == i || i == 15);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ui.bl(").append(')').toString());
		}
	}

	public static char method6190(byte i, int i_3_) {
		try {
			int i_4_ = i & 0xff;
			if (0 == i_4_)
				throw new IllegalArgumentException(new StringBuilder().append("").append(Integer.toString(i_4_, 16)).toString());
			if (i_4_ >= 128 && i_4_ < 160) {
				int i_5_ = Class419.aCharArray5340[i_4_ - 128];
				if (i_5_ == 0)
					i_5_ = 63;
				i_4_ = i_5_;
			}
			return (char) i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ui.p(").append(')').toString());
		}
	}
}
