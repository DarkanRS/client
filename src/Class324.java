/* Class324 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Class324 {
	int anInt3445;
	boolean aBoolean3446;
	int anInt3447;
	public List aList3448 = new LinkedList();

	public void method3956(int i) {
		try {
			Iterator iterator = aList3448.iterator();
			while (iterator.hasNext()) {
				Class335 class335 = (Class335) iterator.next();
				iterator.remove();
				Class205.method1918(class335, (byte) -40);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nn.a(").append(')').toString());
		}
	}

	void method3957(Class335 class335, int i) {
		try {
			Class365_Sub1 class365_sub1 = class335.aClass365_Sub1_3616;
			boolean bool = true;
			Class302_Sub1[] class302_sub1s = class335.aClass365_Sub1_3616.aClass302_Sub1Array7726;
			for (int i_0_ = 0; i_0_ < class302_sub1s.length; i_0_++) {
				if (class302_sub1s[i_0_].aBoolean7644) {
					bool = false;
					break;
				}
			}
			if (!bool) {
				((Class335) class335).aClass324_3618 = this;
				if (((Class324) this).aBoolean3446) {
					Iterator iterator = aList3448.iterator();
					while (iterator.hasNext()) {
						Class335 class335_1_ = (Class335) iterator.next();
						if (class335_1_.aClass365_Sub1_3616 == class365_sub1) {
							iterator.remove();
							Class205.method1918(class335_1_, (byte) -92);
						}
					}
				}
				ListIterator listiterator = aList3448.listIterator();
				while_78_: do {
					Class335 class335_2_;
					do {
						if (!listiterator.hasNext())
							break while_78_;
						class335_2_ = (Class335) listiterator.next();
					} while ((((Class365_Sub1) class365_sub1).anInt7725 * -1235150701) < -1235150701 * (((Class365_Sub1) class335_2_.aClass365_Sub1_3616).anInt7725));
					listiterator.previous();
					listiterator.add(class335);
					return;
				} while (false);
				aList3448.add(class335);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nn.f(").append(')').toString());
		}
	}

	Class324(boolean bool) {
		((Class324) this).aBoolean3446 = false;
		((Class324) this).anInt3447 = 0;
		((Class324) this).anInt3445 = 0;
		((Class324) this).aBoolean3446 = bool;
	}

	static final void method3958(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -562423925) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1287 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nn.ot(").append(')').toString());
		}
	}

	static final void method3959(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class284.method2694(class105, class403, -1302150014);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nn.qj(").append(')').toString());
		}
	}

	static void method3960(ClientScript2 class403, byte i) {
		try {
			Class369 class369 = Class316.aClass362_3318.method4307((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]), 245040087);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (null == class369.anIntArray4016 ? 0 : class369.anIntArray4016.length);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nn.d(").append(')').toString());
		}
	}
}
