/* Class96_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class96_Sub5 extends Class96 {
	int anInt8845;
	int anInt8846;
	int anInt8847;
	int anInt8848;
	int anInt8849;

	@Override
	public void method1601() {
		Class225.method3794(-1748191497 * this.anInt8845, this.anInt8846 * -808646567, -602355731 * this.anInt8847, 100, 100, false, (byte) -1);
		Class12.method486(-908637089 * this.anInt8848, this.anInt8849 * -1608889999, 0, 596260679);
		client.aBool7321 = true;
	}

	@Override
	public void method1592(int i) {
		Class225.method3794(-1748191497 * this.anInt8845, this.anInt8846 * -808646567, -602355731 * this.anInt8847, 100, 100, false, (byte) -1);
		Class12.method486(-908637089 * this.anInt8848, this.anInt8849 * -1608889999, 0, 596260679);
		client.aBool7321 = true;
	}

	Class96_Sub5(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		this.anInt8845 = class282_sub35.readUnsignedShort() * -597628217;
		this.anInt8847 = class282_sub35.readUnsignedShort() * 1851960805;
		this.anInt8846 = class282_sub35.readUnsignedShort() * 693223401;
		this.anInt8848 = class282_sub35.readUnsignedShort() * -1393422433;
		this.anInt8849 = class282_sub35.readUnsignedShort() * -652781679;
	}

	public static void method14243(short i) {
		if (null != IcmpService_Sub1.anIcmpService_Sub1_7964) {
			try {
				IcmpService_Sub1.anIcmpService_Sub1_7964.quit();
			} catch (Throwable throwable) {
				/* empty */
			}
			IcmpService_Sub1.anIcmpService_Sub1_7964 = null;
		}
	}

	static final void method14244(CS2Executor class527, int i) {
		int i_0_ = -2123019059 * Class363.anInt4203;
		int i_1_ = 977902937 * Class263.anInt3249;
		int i_2_ = -1;
		if (Class475.aBool5623) {
			Class467[] class467s = Class405.method6825((byte) 55);
			for (int i_3_ = 0; i_3_ < class467s.length; i_3_++) {
				Class467 class467 = class467s[i_3_];
				if (i_0_ == -1928226539 * class467.anInt5571 && class467.anInt5574 * -1980032233 == i_1_) {
					i_2_ = i_3_;
					break;
				}
			}
		}
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_2_;
	}
}
