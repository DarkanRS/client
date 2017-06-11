/* Class52_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class52_Sub1 extends Class52 {
	protected static int anInt6814 = 4;

	public abstract boolean method557();

	public abstract void method558(Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract boolean method559();

	public abstract boolean method560();

	public abstract void method561(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	public abstract void method562(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	Class52_Sub1() {
		/* empty */
	}

	public abstract void method563(int i, Interface8_Impl1_Impl1 interface8_impl1_impl1);

	public abstract void method564(Interface8_Impl1_Impl2 interface8_impl1_impl2);

	public abstract boolean method565();

	public static void method566(byte i) {
		try {
			if (Class389.method4865((byte) 1) != Class292.aClass292_3162) {
				try {
					String string = ClientScriptMap.anApplet6044.getParameter(Class209.aClass209_2382.aString2395);
					int i_0_ = ((int) (Class122.method1319((byte) 1) / 86400000L) - 11745);
					String string_1_ = new StringBuilder().append("usrdob=").append(i_0_).append("; version=1; path=/; domain=").append(string).toString();
					Class466.method6020(ClientScriptMap.anApplet6044, new StringBuilder().append("document.cookie=\"").append(string_1_).append("\"").toString(), -1921482054);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("we.ni(").append(')').toString());
		}
	}

	public static Class298_Sub52 method567(int i) {
		try {
			if (null == Class301_Sub1.aClass453_3236 || Class301_Sub1.aClass446_7634 == null)
				return null;
			for (Class298_Sub52 class298_sub52 = (Class298_Sub52) Class301_Sub1.aClass446_7634.next(); class298_sub52 != null; class298_sub52 = (Class298_Sub52) Class301_Sub1.aClass446_7634.next()) {
				Class352 class352 = Class301_Sub1.aClass339_3251.method4116(((class298_sub52.anInt7608) * -530122905), -616779677);
				if (class352 != null && class352.aBoolean3816 && class352.method4237(Class301_Sub1.anInterface23_3223, 1789313805))
					return class298_sub52;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("we.ch(").append(')').toString());
		}
	}
}
