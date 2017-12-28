/* Class399 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class399 {
	public int anInt4814;
	public int anInt4815;
	public int anInt4816;

	Class399(int i, int i_0_, int i_1_) {
		anInt4814 = 2016254431 * i;
		anInt4815 = 1143743709 * i_0_;
		anInt4816 = -1834811437 * i_1_;
	}

	static int decodeSkip(RsBitsBuffer buffer, int i) {
		int needsRemove = buffer.readBits(2, (byte) 28);
		int i_3_;
		if (needsRemove == 0)
			i_3_ = 0;
		else if (1 == needsRemove)
			i_3_ = buffer.readBits(5, (byte) 14);
		else if (needsRemove == 2)
			i_3_ = buffer.readBits(8, (byte) 13);
		else
			i_3_ = buffer.readBits(11, (byte) 34);
		return i_3_;
	}
}
