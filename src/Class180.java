/* Class180 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class180 implements Interface20 {
	static File aFile6528;

	public String method241(Class367 class367, int[] is, long l) {
		try {
			if (class367 == Class367.aClass367_3987) {
				ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(is[0], 1528209569);
				return class483.method6122((int) l, (byte) -8);
			}
			if (class367 == Class367.aClass367_3999 || Class367.aClass367_3997 == class367) {
				ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((int) l);
				return class468.aString5707;
			}
			if (class367 == Class367.aClass367_3982 || Class367.aClass367_3983 == class367 || class367 == Class367.aClass367_3991)
				return Class51.aClass475_506.getClientScriptMap(is[0], 1528209569).method6122((int) l, (byte) -101);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hn.a(").append(')').toString());
		}
	}

	public String method240(Class367 class367, int[] is, long l) {
		if (class367 == Class367.aClass367_3987) {
			ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(is[0], 1528209569);
			return class483.method6122((int) l, (byte) -13);
		}
		if (class367 == Class367.aClass367_3999 || Class367.aClass367_3997 == class367) {
			ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions((int) l);
			return class468.aString5707;
		}
		if (class367 == Class367.aClass367_3982 || Class367.aClass367_3983 == class367 || class367 == Class367.aClass367_3991)
			return Class51.aClass475_506.getClientScriptMap(is[0], 1528209569).method6122((int) l, (byte) 79);
		return null;
	}

	static final void method1836(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aBoolean8647 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hn.akv(").append(')').toString());
		}
	}

	static final void method1837(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class165.recorder.getMouseX((byte) 69);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hn.un(").append(')').toString());
		}
	}

	static final void method1838(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class352.method4245(Class122.method1319((byte) 1));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("hn.akx(").append(')').toString());
		}
	}
}
