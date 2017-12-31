
/* Class465 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public final class SwitchMap implements Iterable {
	long aLong5557;
	Class282[] aClass282Array5558;
	Class282 aClass282_5559;
	int anInt5560;
	Class282 aClass282_5561;
	int anInt5562 = 0;

	public Class282 method7745() {
		if (null == ((SwitchMap) this).aClass282_5561)
			return null;
		for (Class282 class282 = (((SwitchMap) this).aClass282Array5558[(int) (4504069746288158699L * ((SwitchMap) this).aLong5557 & (long) (((SwitchMap) this).anInt5560 * 25900449 - 1))]); class282 != ((SwitchMap) this).aClass282_5561; ((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378) {
			if ((((SwitchMap) this).aClass282_5561.aLong3379 * -3442165056282524525L) == ((SwitchMap) this).aLong5557 * 4504069746288158699L) {
				Class282 class282_0_ = ((SwitchMap) this).aClass282_5561;
				((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378;
				return class282_0_;
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		return null;
	}

	public void method7746() {
		for (int i = 0; i < ((SwitchMap) this).anInt5560 * 25900449; i++) {
			Class282 class282 = ((SwitchMap) this).aClass282Array5558[i];
			for (;;) {
				Class282 class282_1_ = class282.aClass282_3378;
				if (class282 == class282_1_)
					break;
				class282_1_.method4991(-371378792);
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		((SwitchMap) this).aClass282_5559 = null;
	}

	public Class282 method7747(int i) {
		if (null == ((SwitchMap) this).aClass282_5561)
			return null;
		for (Class282 class282 = (((SwitchMap) this).aClass282Array5558[(int) (4504069746288158699L * ((SwitchMap) this).aLong5557 & (long) (((SwitchMap) this).anInt5560 * 25900449 - 1))]); class282 != ((SwitchMap) this).aClass282_5561; ((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378) {
			if ((((SwitchMap) this).aClass282_5561.aLong3379 * -3442165056282524525L) == ((SwitchMap) this).aLong5557 * 4504069746288158699L) {
				Class282 class282_2_ = ((SwitchMap) this).aClass282_5561;
				((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378;
				return class282_2_;
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		return null;
	}

	public int method7748(short i) {
		int i_3_ = 0;
		for (int i_4_ = 0; i_4_ < 25900449 * ((SwitchMap) this).anInt5560; i_4_++) {
			Class282 class282 = ((SwitchMap) this).aClass282Array5558[i_4_];
			for (Class282 class282_5_ = class282.aClass282_3378; class282 != class282_5_; class282_5_ = class282_5_.aClass282_3378)
				i_3_++;
		}
		return i_3_;
	}

	public Iterator iterator() {
		return new Class451(this);
	}

	public void method7749(int i) {
		for (int i_6_ = 0; i_6_ < ((SwitchMap) this).anInt5560 * 25900449; i_6_++) {
			Class282 class282 = ((SwitchMap) this).aClass282Array5558[i_6_];
			for (;;) {
				Class282 class282_7_ = class282.aClass282_3378;
				if (class282 == class282_7_)
					break;
				class282_7_.method4991(-371378792);
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		((SwitchMap) this).aClass282_5559 = null;
	}

	public Class282 method7750(int i) {
		((SwitchMap) this).anInt5562 = 0;
		return method7751((byte) 63);
	}

	public Class282 method7751(byte i) {
		if (((SwitchMap) this).anInt5562 * 620631441 > 0 && ((((SwitchMap) this).aClass282Array5558[((SwitchMap) this).anInt5562 * 620631441 - 1]) != ((SwitchMap) this).aClass282_5559)) {
			Class282 class282 = ((SwitchMap) this).aClass282_5559;
			((SwitchMap) this).aClass282_5559 = class282.aClass282_3378;
			return class282;
		}
		while (((SwitchMap) this).anInt5562 * 620631441 < 25900449 * ((SwitchMap) this).anInt5560) {
			Class282 class282 = (((SwitchMap) this).aClass282Array5558[((((SwitchMap) this).anInt5562 += -745059471) * 620631441 - 1)].aClass282_3378);
			if ((((SwitchMap) this).aClass282Array5558[620631441 * ((SwitchMap) this).anInt5562 - 1]) != class282) {
				((SwitchMap) this).aClass282_5559 = class282.aClass282_3378;
				return class282;
			}
		}
		return null;
	}

	public Class282 method7752(long l) {
		((SwitchMap) this).aLong5557 = l * 7471503269310367939L;
		Class282 class282 = (((SwitchMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((SwitchMap) this).anInt5560 - 1))]);
		for (((SwitchMap) this).aClass282_5561 = class282.aClass282_3378; class282 != ((SwitchMap) this).aClass282_5561; ((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378) {
			if (l == (((SwitchMap) this).aClass282_5561.aLong3379 * -3442165056282524525L)) {
				Class282 class282_8_ = ((SwitchMap) this).aClass282_5561;
				((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378;
				return class282_8_;
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		return null;
	}

	public Class282 method7753() {
		if (((SwitchMap) this).anInt5562 * 620631441 > 0 && ((((SwitchMap) this).aClass282Array5558[((SwitchMap) this).anInt5562 * 620631441 - 1]) != ((SwitchMap) this).aClass282_5559)) {
			Class282 class282 = ((SwitchMap) this).aClass282_5559;
			((SwitchMap) this).aClass282_5559 = class282.aClass282_3378;
			return class282;
		}
		while (((SwitchMap) this).anInt5562 * 620631441 < 25900449 * ((SwitchMap) this).anInt5560) {
			Class282 class282 = (((SwitchMap) this).aClass282Array5558[((((SwitchMap) this).anInt5562 += -745059471) * 620631441 - 1)].aClass282_3378);
			if ((((SwitchMap) this).aClass282Array5558[620631441 * ((SwitchMap) this).anInt5562 - 1]) != class282) {
				((SwitchMap) this).aClass282_5559 = class282.aClass282_3378;
				return class282;
			}
		}
		return null;
	}

	public Class282 method7754(long l) {
		((SwitchMap) this).aLong5557 = l * 7471503269310367939L;
		Class282 class282 = (((SwitchMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((SwitchMap) this).anInt5560 - 1))]);
		for (((SwitchMap) this).aClass282_5561 = class282.aClass282_3378; class282 != ((SwitchMap) this).aClass282_5561; ((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378) {
			if (l == (((SwitchMap) this).aClass282_5561.aLong3379 * -3442165056282524525L)) {
				Class282 class282_9_ = ((SwitchMap) this).aClass282_5561;
				((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378;
				return class282_9_;
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		return null;
	}

	public void method7755() {
		for (int i = 0; i < ((SwitchMap) this).anInt5560 * 25900449; i++) {
			Class282 class282 = ((SwitchMap) this).aClass282Array5558[i];
			for (;;) {
				Class282 class282_10_ = class282.aClass282_3378;
				if (class282 == class282_10_)
					break;
				class282_10_.method4991(-371378792);
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		((SwitchMap) this).aClass282_5559 = null;
	}

	public void method7756() {
		for (int i = 0; i < ((SwitchMap) this).anInt5560 * 25900449; i++) {
			Class282 class282 = ((SwitchMap) this).aClass282Array5558[i];
			for (;;) {
				Class282 class282_11_ = class282.aClass282_3378;
				if (class282 == class282_11_)
					break;
				class282_11_.method4991(-371378792);
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		((SwitchMap) this).aClass282_5559 = null;
	}

	public Class282 method7757() {
		if (null == ((SwitchMap) this).aClass282_5561)
			return null;
		for (Class282 class282 = (((SwitchMap) this).aClass282Array5558[(int) (4504069746288158699L * ((SwitchMap) this).aLong5557 & (long) (((SwitchMap) this).anInt5560 * 25900449 - 1))]); class282 != ((SwitchMap) this).aClass282_5561; ((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378) {
			if ((((SwitchMap) this).aClass282_5561.aLong3379 * -3442165056282524525L) == ((SwitchMap) this).aLong5557 * 4504069746288158699L) {
				Class282 class282_12_ = ((SwitchMap) this).aClass282_5561;
				((SwitchMap) this).aClass282_5561 = ((SwitchMap) this).aClass282_5561.aClass282_3378;
				return class282_12_;
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		return null;
	}

	public int method7758() {
		int i = 0;
		for (int i_13_ = 0; i_13_ < 25900449 * ((SwitchMap) this).anInt5560; i_13_++) {
			Class282 class282 = ((SwitchMap) this).aClass282Array5558[i_13_];
			for (Class282 class282_14_ = class282.aClass282_3378; class282 != class282_14_; class282_14_ = class282_14_.aClass282_3378)
				i++;
		}
		return i;
	}

	public void method7759(Class282 class282, long l) {
		if (class282.aClass282_3380 != null)
			class282.method4991(-371378792);
		Class282 class282_15_ = (((SwitchMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((SwitchMap) this).anInt5560 - 1))]);
		class282.aClass282_3380 = class282_15_.aClass282_3380;
		class282.aClass282_3378 = class282_15_;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
		class282.aLong3379 = -1253863389874800229L * l;
	}

	public void method7760(Class282 class282, long l) {
		if (class282.aClass282_3380 != null)
			class282.method4991(-371378792);
		Class282 class282_16_ = (((SwitchMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((SwitchMap) this).anInt5560 - 1))]);
		class282.aClass282_3380 = class282_16_.aClass282_3380;
		class282.aClass282_3378 = class282_16_;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
		class282.aLong3379 = -1253863389874800229L * l;
	}

	public void method7761(Class282 class282, long l) {
		if (class282.aClass282_3380 != null)
			class282.method4991(-371378792);
		Class282 class282_17_ = (((SwitchMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((SwitchMap) this).anInt5560 - 1))]);
		class282.aClass282_3380 = class282_17_.aClass282_3380;
		class282.aClass282_3378 = class282_17_;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
		class282.aLong3379 = -1253863389874800229L * l;
	}

	public Iterator method7762() {
		return new Class451(this);
	}

	public Iterator method7763() {
		return new Class451(this);
	}

	public void method7764() {
		for (int i = 0; i < ((SwitchMap) this).anInt5560 * 25900449; i++) {
			Class282 class282 = ((SwitchMap) this).aClass282Array5558[i];
			for (;;) {
				Class282 class282_18_ = class282.aClass282_3378;
				if (class282 == class282_18_)
					break;
				class282_18_.method4991(-371378792);
			}
		}
		((SwitchMap) this).aClass282_5561 = null;
		((SwitchMap) this).aClass282_5559 = null;
	}

	public void method7765(Class282 class282, long l) {
		if (class282.aClass282_3380 != null)
			class282.method4991(-371378792);
		Class282 class282_19_ = (((SwitchMap) this).aClass282Array5558[(int) (l & (long) (25900449 * ((SwitchMap) this).anInt5560 - 1))]);
		class282.aClass282_3380 = class282_19_.aClass282_3380;
		class282.aClass282_3378 = class282_19_;
		class282.aClass282_3380.aClass282_3378 = class282;
		class282.aClass282_3378.aClass282_3380 = class282;
		class282.aLong3379 = -1253863389874800229L * l;
	}

	public Class282 method7766() {
		((SwitchMap) this).anInt5562 = 0;
		return method7751((byte) 101);
	}

	public Class282 method7767() {
		((SwitchMap) this).anInt5562 = 0;
		return method7751((byte) 6);
	}

	public Class282 method7768() {
		((SwitchMap) this).anInt5562 = 0;
		return method7751((byte) 110);
	}

	public Class282 method7769() {
		((SwitchMap) this).anInt5562 = 0;
		return method7751((byte) 14);
	}

	public SwitchMap(int i) {
		((SwitchMap) this).anInt5560 = i * 1246096993;
		((SwitchMap) this).aClass282Array5558 = new Class282[i];
		for (int i_20_ = 0; i_20_ < i; i_20_++) {
			Class282 class282 = ((SwitchMap) this).aClass282Array5558[i_20_] = new Class282();
			class282.aClass282_3378 = class282;
			class282.aClass282_3380 = class282;
		}
	}

	public Class282 method7770() {
		if (((SwitchMap) this).anInt5562 * 620631441 > 0 && ((((SwitchMap) this).aClass282Array5558[((SwitchMap) this).anInt5562 * 620631441 - 1]) != ((SwitchMap) this).aClass282_5559)) {
			Class282 class282 = ((SwitchMap) this).aClass282_5559;
			((SwitchMap) this).aClass282_5559 = class282.aClass282_3378;
			return class282;
		}
		while (((SwitchMap) this).anInt5562 * 620631441 < 25900449 * ((SwitchMap) this).anInt5560) {
			Class282 class282 = (((SwitchMap) this).aClass282Array5558[((((SwitchMap) this).anInt5562 += -745059471) * 620631441 - 1)].aClass282_3378);
			if ((((SwitchMap) this).aClass282Array5558[620631441 * ((SwitchMap) this).anInt5562 - 1]) != class282) {
				((SwitchMap) this).aClass282_5559 = class282.aClass282_3378;
				return class282;
			}
		}
		return null;
	}

	static final void method7771(CS2Executor class527, int i) {
		String string;
		if (null != Class84.myPlayer && null != Class84.myPlayer.username)
			string = Class84.myPlayer.method16128(false, 1912893547);
		else
			string = "";
		((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}

	static final void method7772(Class282_Sub31 class282_sub31, boolean bool, int i) {
		if (((Class282_Sub31) class282_sub31).aBool7774) {
			if (-1369039751 * ((Class282_Sub31) class282_sub31).anInt7765 < 0 || (Class492.method8264(client.aClass257_7353.method4436(-1617066319), ((Class282_Sub31) class282_sub31).anInt7765 * -1369039751, -1307943861 * ((Class282_Sub31) class282_sub31).anInt7770, 1942118537))) {
				if (!bool)
					Class174.method2956((((Class282_Sub31) class282_sub31).anInt7764 * 1291499461), (((Class282_Sub31) class282_sub31).anInt7766 * -497894501), 37618455 * class282_sub31.anInt7762, class282_sub31.anInt7763 * -322610393, (((Class282_Sub31) class282_sub31).anInt7765 * -1369039751), (1421843241 * ((Class282_Sub31) class282_sub31).anInt7767), (-1307943861 * ((Class282_Sub31) class282_sub31).anInt7770), -1, -1133711870);
				else
					Class243.method4179((1291499461 * (((Class282_Sub31) class282_sub31).anInt7764)), (((Class282_Sub31) class282_sub31).anInt7766) * -497894501, class282_sub31.anInt7762 * 37618455, class282_sub31.anInt7763 * -322610393, null, (byte) 30);
				class282_sub31.method4991(-371378792);
			}
		} else if (((Class282_Sub31) class282_sub31).aBool7773 && 37618455 * class282_sub31.anInt7762 >= 1 && class282_sub31.anInt7763 * -322610393 >= 1 && (class282_sub31.anInt7762 * 37618455 <= client.aClass257_7353.method4424(800318016) - 2) && (-322610393 * class282_sub31.anInt7763 <= client.aClass257_7353.method4451(-349859539) - 2)
				&& ((-1809279077 * ((Class282_Sub31) class282_sub31).anInt7769) < 0 || (Class492.method8264(client.aClass257_7353.method4436(-1528257548), (-1809279077 * ((Class282_Sub31) class282_sub31).anInt7769), (((Class282_Sub31) class282_sub31).anInt7771 * 965123467), 1942118537)))) {
			if (!bool)
				Class174.method2956(1291499461 * ((Class282_Sub31) class282_sub31).anInt7764, ((Class282_Sub31) class282_sub31).anInt7766 * -497894501, 37618455 * class282_sub31.anInt7762, class282_sub31.anInt7763 * -322610393, -1809279077 * ((Class282_Sub31) class282_sub31).anInt7769, ((Class282_Sub31) class282_sub31).anInt7772 * -818262241, 965123467 * ((Class282_Sub31) class282_sub31).anInt7771, -1, -1118636715);
			else
				Class243.method4179(1291499461 * ((Class282_Sub31) class282_sub31).anInt7764, ((Class282_Sub31) class282_sub31).anInt7766 * -497894501, class282_sub31.anInt7762 * 37618455, -322610393 * class282_sub31.anInt7763, ((Class282_Sub31) class282_sub31).aClass476_7768, (byte) 127);
			((Class282_Sub31) class282_sub31).aBool7773 = false;
			if (!bool && (-1369039751 * ((Class282_Sub31) class282_sub31).anInt7765 == (((Class282_Sub31) class282_sub31).anInt7769 * -1809279077)) && (-1369039751 * ((Class282_Sub31) class282_sub31).anInt7765 == -1))
				class282_sub31.method4991(-371378792);
			else if (!bool && ((-1369039751 * ((Class282_Sub31) class282_sub31).anInt7765) == (((Class282_Sub31) class282_sub31).anInt7769 * -1809279077)) && ((1421843241 * ((Class282_Sub31) class282_sub31).anInt7767) == (-818262241 * ((Class282_Sub31) class282_sub31).anInt7772)) && ((((Class282_Sub31) class282_sub31).anInt7771 * 965123467) == (((Class282_Sub31) class282_sub31).anInt7770 * -1307943861)))
				class282_sub31.method4991(-371378792);
		}
	}

	static final void method7773(CS2Executor class527, int i) {
		Class282_Sub40.method13300(-1273704391);
		client.aClass257_7353.method4547((byte) -42);
		Class190.method3148((byte) 53);
		client.aBool7175 = false;
	}

	static final void method7774(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_21_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_22_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537 + 1]);
		Class515.method8862(i_21_, i_22_ >> 14 & 0x3fff, i_22_ & 0x3fff, true, -1732540658);
	}
}
