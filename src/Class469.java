
/* Class469 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class469 implements Iterator {
	Class282_Sub50 aClass282_Sub50_5582 = null;
	Class282_Sub50 aClass282_Sub50_5583;
	Class477 aClass477_5584;
	public static boolean aBool5585;

	public Class282_Sub50 method7790(int i) {
		method7800((short) 255);
		return (Class282_Sub50) next();
	}

	public Class469(Class477 class477) {
		((Class469) this).aClass477_5584 = class477;
		((Class469) this).aClass282_Sub50_5583 = (((Class469) this).aClass477_5584.aClass282_Sub50_5629.aClass282_Sub50_8119);
		((Class469) this).aClass282_Sub50_5582 = null;
	}

	public Object method7791() {
		Class282_Sub50 class282_sub50 = ((Class469) this).aClass282_Sub50_5583;
		if (class282_sub50 == ((Class469) this).aClass477_5584.aClass282_Sub50_5629) {
			class282_sub50 = null;
			((Class469) this).aClass282_Sub50_5583 = null;
		} else
			((Class469) this).aClass282_Sub50_5583 = class282_sub50.aClass282_Sub50_8119;
		((Class469) this).aClass282_Sub50_5582 = class282_sub50;
		return class282_sub50;
	}

	public Object next() {
		Class282_Sub50 class282_sub50 = ((Class469) this).aClass282_Sub50_5583;
		if (class282_sub50 == ((Class469) this).aClass477_5584.aClass282_Sub50_5629) {
			class282_sub50 = null;
			((Class469) this).aClass282_Sub50_5583 = null;
		} else
			((Class469) this).aClass282_Sub50_5583 = class282_sub50.aClass282_Sub50_8119;
		((Class469) this).aClass282_Sub50_5582 = class282_sub50;
		return class282_sub50;
	}

	public boolean hasNext() {
		return (((Class469) this).aClass282_Sub50_5583 != ((Class469) this).aClass477_5584.aClass282_Sub50_5629);
	}

	public void remove() {
		if (null == ((Class469) this).aClass282_Sub50_5582)
			throw new IllegalStateException();
		((Class469) this).aClass282_Sub50_5582.method13452((byte) -5);
		((Class469) this).aClass282_Sub50_5582 = null;
	}

	public boolean method7792() {
		return (((Class469) this).aClass282_Sub50_5583 != ((Class469) this).aClass477_5584.aClass282_Sub50_5629);
	}

	public boolean method7793() {
		return (((Class469) this).aClass282_Sub50_5583 != ((Class469) this).aClass477_5584.aClass282_Sub50_5629);
	}

	public boolean method7794() {
		return (((Class469) this).aClass282_Sub50_5583 != ((Class469) this).aClass477_5584.aClass282_Sub50_5629);
	}

	public Object method7795() {
		Class282_Sub50 class282_sub50 = ((Class469) this).aClass282_Sub50_5583;
		if (class282_sub50 == ((Class469) this).aClass477_5584.aClass282_Sub50_5629) {
			class282_sub50 = null;
			((Class469) this).aClass282_Sub50_5583 = null;
		} else
			((Class469) this).aClass282_Sub50_5583 = class282_sub50.aClass282_Sub50_8119;
		((Class469) this).aClass282_Sub50_5582 = class282_sub50;
		return class282_sub50;
	}

	void method7796() {
		((Class469) this).aClass282_Sub50_5583 = (((Class469) this).aClass477_5584.aClass282_Sub50_5629.aClass282_Sub50_8119);
		((Class469) this).aClass282_Sub50_5582 = null;
	}

	void method7797() {
		((Class469) this).aClass282_Sub50_5583 = (((Class469) this).aClass477_5584.aClass282_Sub50_5629.aClass282_Sub50_8119);
		((Class469) this).aClass282_Sub50_5582 = null;
	}

	public void method7798() {
		if (null == ((Class469) this).aClass282_Sub50_5582)
			throw new IllegalStateException();
		((Class469) this).aClass282_Sub50_5582.method13452((byte) -5);
		((Class469) this).aClass282_Sub50_5582 = null;
	}

	public void method7799() {
		if (null == ((Class469) this).aClass282_Sub50_5582)
			throw new IllegalStateException();
		((Class469) this).aClass282_Sub50_5582.method13452((byte) -5);
		((Class469) this).aClass282_Sub50_5582 = null;
	}

	void method7800(short i) {
		((Class469) this).aClass282_Sub50_5583 = (((Class469) this).aClass477_5584.aClass282_Sub50_5629.aClass282_Sub50_8119);
		((Class469) this).aClass282_Sub50_5582 = null;
	}

	public Class282_Sub50 method7801() {
		method7800((short) 255);
		return (Class282_Sub50) next();
	}

	public Class282_Sub50 method7802() {
		method7800((short) 255);
		return (Class282_Sub50) next();
	}

	public Class282_Sub50 method7803() {
		method7800((short) 255);
		return (Class282_Sub50) next();
	}

	public Object method7804() {
		Class282_Sub50 class282_sub50 = ((Class469) this).aClass282_Sub50_5583;
		if (class282_sub50 == ((Class469) this).aClass477_5584.aClass282_Sub50_5629) {
			class282_sub50 = null;
			((Class469) this).aClass282_Sub50_5583 = null;
		} else
			((Class469) this).aClass282_Sub50_5583 = class282_sub50.aClass282_Sub50_8119;
		((Class469) this).aClass282_Sub50_5582 = class282_sub50;
		return class282_sub50;
	}

	static void method7805(Class505 class505, int i, int i_0_, Class118 class118, Class455 class455, int i_1_, int i_2_, int i_3_) {
		for (int i_4_ = 0; i_4_ < -685729279 * client.anInt7211; i_4_++) {
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) client.anIntArray7212[i_4_]));
			if (class282_sub47 != null) {
				NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
				if (class521_sub1_sub1_sub2_sub2.method16160(-438666523) && (class521_sub1_sub1_sub2_sub2.aByte7967 == (Class84.myPlayer.aByte7967))) {
					Class409 class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
					if (null != class409 && null != class409.anIntArray4886)
						class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
					if (class409 != null && class409.aBool4864 && class409.aBool4893) {
						Class385 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
						int i_5_ = (int) class385.aFloat4671 / 128 - i / 128;
						int i_6_ = (int) class385.aFloat4673 / 128 - i_0_ / 128;
						if (-1230504941 * class409.anInt4914 != -1)
							Class158.method2731(class505, class455, class118, i_1_, i_2_, i_5_, i_6_, (-1230504941 * class409.anInt4914), -1804553865);
						else
							Class190.method3149(class118, class455, i_1_, i_2_, i_5_, i_6_, Class250.aClass160Array3092[1], -1465246718);
					}
				}
			}
		}
	}
}
