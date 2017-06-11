/* Class298_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class298_Sub31 extends Linkable {
	int anInt7369;
	String aString7370;

	Class298_Sub31() {
		/* empty */
	}

	static final void method3114(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class525.aBoolean6300 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abp.amd(").append(')').toString());
		}
	}

	static final String method3115(String string, String string_0_, String string_1_, int i) {
		try {
			for (int i_2_ = string.indexOf(string_0_); i_2_ != -1; i_2_ = string.indexOf(string_0_, i_2_ + string_1_.length()))
				string = new StringBuilder().append(string.substring(0, i_2_)).append(string_1_).append(string.substring(i_2_ + string_0_.length())).toString();
			return string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abp.i(").append(')').toString());
		}
	}
}
