/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class19 {
	public int anInt153;
	int anInt154;

	public int method575() {
		return anInt153 * 1040633965 & 0x3fff;
	}

	public boolean method576(int i, int i_0_, int i_1_, int i_2_) {
		int i_3_ = ((Class19) this).anInt154 * -390891121;
		if (anInt153 * 1040633965 == i && -390891121 * ((Class19) this).anInt154 == 0)
			return false;
		boolean bool;
		if (0 == -390891121 * ((Class19) this).anInt154) {
			if (i > anInt153 * 1040633965 && i <= i_0_ + 1040633965 * anInt153 || (i < 1040633965 * anInt153 && i >= anInt153 * 1040633965 - i_0_)) {
				anInt153 = i * -254428827;
				return false;
			}
			bool = true;
		} else if (-390891121 * ((Class19) this).anInt154 > 0 && i > anInt153 * 1040633965) {
			int i_4_ = (((Class19) this).anInt154 * -390891121 * (-390891121 * ((Class19) this).anInt154) / (i_0_ * 2));
			int i_5_ = anInt153 * 1040633965 + i_4_;
			if (i_5_ >= i || i_5_ < 1040633965 * anInt153)
				bool = false;
			else
				bool = true;
		} else if (((Class19) this).anInt154 * -390891121 < 0 && i < 1040633965 * anInt153) {
			int i_6_ = (-390891121 * ((Class19) this).anInt154 * (((Class19) this).anInt154 * -390891121) / (2 * i_0_));
			int i_7_ = 1040633965 * anInt153 - i_6_;
			if (i_7_ <= i || i_7_ > 1040633965 * anInt153)
				bool = false;
			else
				bool = true;
		} else
			bool = false;
		if (bool) {
			if (i > 1040633965 * anInt153) {
				((Class19) this).anInt154 += i_0_ * 168396143;
				if (i_1_ != 0 && -390891121 * ((Class19) this).anInt154 > i_1_)
					((Class19) this).anInt154 = i_1_ * 168396143;
			} else {
				((Class19) this).anInt154 -= 168396143 * i_0_;
				if (0 != i_1_ && ((Class19) this).anInt154 * -390891121 < -i_1_)
					((Class19) this).anInt154 = -i_1_ * 168396143;
			}
			if (((Class19) this).anInt154 * -390891121 != i_3_) {
				int i_8_ = (-390891121 * ((Class19) this).anInt154 * (((Class19) this).anInt154 * -390891121) / (i_0_ * 2));
				if (i > 1040633965 * anInt153) {
					if (i_8_ + anInt153 * 1040633965 > i)
						((Class19) this).anInt154 = i_3_ * 168396143;
				} else if (i < 1040633965 * anInt153 && anInt153 * 1040633965 - i_8_ < i)
					((Class19) this).anInt154 = i_3_ * 168396143;
			}
		} else if (((Class19) this).anInt154 * -390891121 > 0) {
			((Class19) this).anInt154 -= 168396143 * i_0_;
			if (((Class19) this).anInt154 * -390891121 < 0)
				((Class19) this).anInt154 = 0;
		} else {
			((Class19) this).anInt154 += i_0_ * 168396143;
			if (-390891121 * ((Class19) this).anInt154 > 0)
				((Class19) this).anInt154 = 0;
		}
		anInt153 += -254428827 * (i_3_ + -390891121 * ((Class19) this).anInt154 >> 1);
		return bool;
	}

	public void method577(int i, int i_9_) {
		anInt153 = i * -254428827;
		((Class19) this).anInt154 = 0;
	}

	public int method578(byte i) {
		return anInt153 * 1040633965 & 0x3fff;
	}

	public void method579(int i) {
		anInt153 = -254428827 * (anInt153 * 1040633965 & 0x3fff);
	}

	public void method580() {
		anInt153 = -254428827 * (anInt153 * 1040633965 & 0x3fff);
	}

	public void method581(int i) {
		anInt153 = i * -254428827;
		((Class19) this).anInt154 = 0;
	}

	public void method582(int i) {
		anInt153 = i * -254428827;
		((Class19) this).anInt154 = 0;
	}

	public void method583(int i) {
		anInt153 = i * -254428827;
		((Class19) this).anInt154 = 0;
	}

	static final void method584(CS2Executor class527, byte i) {
		Class251.method4313((String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]), false, false, -354697449);
	}

	static final void method585(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1 ? 1 : 0;
	}

	static final void method586(CS2Executor class527, byte i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 318997953 * Class504.anInt5832;
	}

	static final void method587(CS2Executor class527, byte i) {
		Class361.aClass361_4182.method6257(-225278415);
	}
}
