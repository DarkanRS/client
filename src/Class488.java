/* Class488 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class488 {
	public static final int anInt5753 = -5;
	public static final int anInt5754 = -6;
	public static final int anInt5755 = -4;
	public static final int anInt5756 = 20;
	public static final int anInt5757 = -1;
	public static Index aClass317_5758;
	public static Class45 aClass45_5759;
	public static int anInt5760;
	static Index aClass317_5761;

	Class488() throws Throwable {
		throw new Error();
	}

	static final String method8210(int i, int i_0_) {
		String string = Integer.toString(i);
		for (int i_1_ = string.length() - 3; i_1_ > 0; i_1_ -= 3)
			string = new StringBuilder().append(string.substring(0, i_1_)).append(Class2.aString14).append(string.substring(i_1_)).toString();
		if (string.length() > 9)
			return new StringBuilder().append(" ").append(Class59.method1163(65408, 619010179)).append(string.substring(0, string.length() - 8)).append(Message.aClass433_5294.translate(Class223.aClass495_2772, -669112098)).append(" (").append(string).append(")").append(Class2.aString20).toString();
		if (string.length() > 6)
			return new StringBuilder().append(" ").append(Class59.method1163(16777215, 619010179)).append(string.substring(0, string.length() - 4)).append(Message.aClass433_5296.translate(Class223.aClass495_2772, -327274264)).append(" (").append(string).append(")").append(Class2.aString20).toString();
		return new StringBuilder().append(" ").append(Class59.method1163(16776960, 619010179)).append(string).append(Class2.aString20).toString();
	}

	static final void method8211(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = -1009302201 * class118.anInt1337;
	}

	static final void method8212(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class529.method11337(class118, class98, class527, -2109817364);
	}
}
