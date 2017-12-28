/* Class282_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub34 extends Class282 {
	int anInt7852;
	public int anInt7853;

	Class282_Sub34(int i, int i_0_) {
		anInt7853 = 4443735 * i;
		((Class282_Sub34) this).anInt7852 = i_0_ * -302993409;
	}

	static final void decodePlayerUpdate(RsBitsBuffer buffer, int i, byte i_1_) {
		Class197.anInt2434 = 0;
		Class387.decodeUpdate(buffer, 1850021542);
		Class508.decodeMasks(buffer, 1038274352);
		if (i != buffer.index * -1990677291)
			throw new RuntimeException(new StringBuilder().append(-1990677291 * buffer.index).append(" ").append(i).toString());
	}
}
