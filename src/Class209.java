
/* Class209 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.io.IOException;
import java.util.Date;

public abstract class Class209 {
	
	public boolean method3563() {
		return (method3565((byte) -32) || method3566(-2143623365) || method3567((byte) 10));
	}

	public abstract int method3564();

	public abstract boolean method3565(byte i);

	public abstract boolean method3566(int i);

	public abstract boolean method3567(byte i);

	public boolean method3568(short i) {
		return (method3565((byte) -13) || method3566(-2143623365) || method3567((byte) 69));
	}

	public abstract int method3569(int i);

	public abstract int method3570(int i);

	public abstract Class282_Sub53 method3571(byte i);

	public boolean method3572() {
		return (method3565((byte) -96) || method3566(-2143623365) || method3567((byte) 105));
	}

	public abstract int method3573();

	public static Class209 method3574(Component component, boolean bool) {
		return new Class209_Sub1(component, bool);
	}

	public static void method3575(int i) {
		Class329.method5906(i, -464275916);
	}

	public static void method3576(int i) {
		Class329.method5906(i, -464275916);
	}

	public static Class209 method3577(Component component, boolean bool) {
		return new Class209_Sub1(component, bool);
	}

	public abstract void method3578();

	public abstract boolean method3579();

	public abstract boolean method3580();

	public abstract void method3581();

	public abstract boolean method3582();

	public abstract boolean method3583();

	public abstract void method3584(int i);

	public abstract int method3585();

	public boolean method3586() {
		return (method3565((byte) -19) || method3566(-2143623365) || method3567((byte) -30));
	}

	public boolean method3587() {
		return (method3565((byte) -22) || method3566(-2143623365) || method3567((byte) -41));
	}

	public abstract Class282_Sub53 method3588();

	public abstract void method3589(byte i);

	Class209() {
		/* empty */
	}

	public abstract Class282_Sub53 method3590();

	public abstract Class282_Sub53 method3591();

	public abstract Class282_Sub53 method3592();

	public abstract boolean method3593();

	public abstract void method3594();

	public abstract void method3595();

	static final void method3596(CS2Executor class527, int i) {
		int i_0_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_0_, (byte) 50);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_0_ >> 16];
		Class151.method2593(class118, class98, class527, -1741314875);
	}

	static final void method3597(CS2Executor class527, byte i) {
		int i_1_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (2 == client.anInt7434 * 1609086245 && i_1_ < 493536965 * client.anInt7449)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = -2041808379 * client.aClass6Array7452[i_1_].anInt41;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
	}

	public static void method3598(String string, int i) {
		if (Class13.aStringArray129 == null)
			FontRenderer.method402(1696819544);
		client.aCalendar7278.setTime(new Date(Class169.method2869(1677357681)));
		int i_2_ = client.aCalendar7278.get(11);
		int i_3_ = client.aCalendar7278.get(12);
		int i_4_ = client.aCalendar7278.get(13);
		String string_5_ = new StringBuilder().append(Integer.toString(i_2_ / 10)).append(i_2_ % 10).append(":").append(i_3_ / 10).append(i_3_ % 10).append(":").append(i_4_ / 10).append(i_4_ % 10).toString();
		String[] strings = Class456_Sub3.method12681(string, '\n', 229848533);
		for (int i_6_ = 0; i_6_ < strings.length; i_6_++) {
			for (int i_7_ = -1647152403 * Class179.anInt2227; i_7_ > 0; i_7_--)
				Class13.aStringArray129[i_7_] = Class13.aStringArray129[i_7_ - 1];
			Class13.aStringArray129[0] = new StringBuilder().append(string_5_).append(": ").append(strings[i_6_]).toString();
			if (null != TextureDefinition.aFileOutputStream9481) {
				try {
					TextureDefinition.aFileOutputStream9481.write(Class473.method7885(new StringBuilder().append(Class13.aStringArray129[0]).append("\n").toString(), (byte) -108));
				} catch (IOException ioexception) {
					/* empty */
				}
			}
			if (-1647152403 * Class179.anInt2227 < Class13.aStringArray129.length - 1) {
				Class179.anInt2227 += 895204069;
				if (-2132918525 * Class179.anInt2223 > 0)
					Class179.anInt2223 += -758144085;
			}
		}
	}

	static final void method3599(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub13_8225, (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]), -334486590);
		Class190.method3148((byte) 97);
		client.aBool7175 = false;
	}

	public static boolean method3600(byte i, int i_8_) {
		int i_9_ = i & 0xff;
		if (i_9_ == 0)
			return false;
		if (i_9_ >= 128 && i_9_ < 160 && '\0' == Class490.aCharArray5766[i_9_ - 128])
			return false;
		return true;
	}

	static final void method3601(IComponentDefinitions class118, CS2Executor class527, int i) {
		int i_10_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		int i_11_ = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) - 1);
		if (6 != class118.anInt1329 * 2131324949 && 2 != 2131324949 * class118.anInt1329)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(-402732635 * class118.anInt1330, (byte) 4);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, 2131324949 * class118.anInt1329 == 6);
		class118.aClass417_1308.aLong4993 = Class86.method1480(1488415195) * 7197667099348947907L;
		if (null == class409.aShortArray4867 || i_11_ < 0 || i_11_ >= class409.aShortArray4867.length)
			throw new RuntimeException("");
		class118.aClass417_1308.aShortArray4991[i_11_] = (short) i_10_;
		Class109.method1858(class118, (byte) 25);
	}
}
