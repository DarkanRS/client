/* Class282_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub21 extends Node {
	static NativeSprite[] aClass160Array7673;
	String aString7674;
	int anInt7675;

	Class282_Sub21() {
		/* empty */
	}

	static void method12353(int i, int i_0_, int i_1_, int i_2_, boolean bool, int i_3_) {
		long l = (long) (i | (bool ? -2147483648 : 0));
		Class282_Sub30 class282_sub30 = (Class282_Sub30) Class282_Sub30.aClass465_7711.method7754(l);
		if (null == class282_sub30) {
			class282_sub30 = new Class282_Sub30();
			Class282_Sub30.aClass465_7711.method7765(class282_sub30, l);
		}
		if (((Class282_Sub30) class282_sub30).anIntArray7710.length <= i_0_) {
			int[] is = new int[1 + i_0_];
			int[] is_4_ = new int[i_0_ + 1];
			for (int i_5_ = 0; (i_5_ < ((Class282_Sub30) class282_sub30).anIntArray7710.length); i_5_++) {
				is[i_5_] = ((Class282_Sub30) class282_sub30).anIntArray7710[i_5_];
				is_4_[i_5_] = ((Class282_Sub30) class282_sub30).anIntArray7709[i_5_];
			}
			for (int i_6_ = ((Class282_Sub30) class282_sub30).anIntArray7710.length; i_6_ < i_0_; i_6_++) {
				is[i_6_] = -1;
				is_4_[i_6_] = 0;
			}
			((Class282_Sub30) class282_sub30).anIntArray7710 = is;
			((Class282_Sub30) class282_sub30).anIntArray7709 = is_4_;
		}
		((Class282_Sub30) class282_sub30).anIntArray7710[i_0_] = i_1_;
		((Class282_Sub30) class282_sub30).anIntArray7709[i_0_] = i_2_;
	}
}
