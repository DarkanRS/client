/* Class497 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class497 {
	public static final int anInt5817 = 1;
	public static final int anInt5818 = 2;
	public static final int anInt5819 = 3;
	public static final int anInt5820 = 4;
	public static Index aClass317_5821;
	public static Class233 aClass233_5822;

	Class497() throws Throwable {
		throw new Error();
	}

	static void method8316(long[] ls, int[] is, int i, int i_0_, int i_1_) {
		if (i < i_0_) {
			int i_2_ = (i_0_ + i) / 2;
			int i_3_ = i;
			long l = ls[i_2_];
			ls[i_2_] = ls[i_0_];
			ls[i_0_] = l;
			int i_4_ = is[i_2_];
			is[i_2_] = is[i_0_];
			is[i_0_] = i_4_;
			int i_5_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_6_ = i; i_6_ < i_0_; i_6_++) {
				if (ls[i_6_] < (long) (i_6_ & i_5_) + l) {
					long l_7_ = ls[i_6_];
					ls[i_6_] = ls[i_3_];
					ls[i_3_] = l_7_;
					int i_8_ = is[i_6_];
					is[i_6_] = is[i_3_];
					is[i_3_++] = i_8_;
				}
			}
			ls[i_0_] = ls[i_3_];
			ls[i_3_] = l;
			is[i_0_] = is[i_3_];
			is[i_3_] = i_4_;
			method8316(ls, is, i, i_3_ - 1, -1763921861);
			method8316(ls, is, 1 + i_3_, i_0_, -1763921861);
		}
	}
}
