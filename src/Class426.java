/* Class426 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class426 implements Interface20 {
	Class486 aClass486_5103;
	Class495 aClass495_5104;
	boolean aBool5105;
	Class317 aClass317_5106;
	String[] aStringArray5107;
	public int anInt5108;
	Class229 aClass229_5109 = new Class229(64);
	String[] aStringArray5110;
	Class317 aClass317_5111;
	Class420 aClass420_5112;
	Class424 aClass424_5113;
	public Class212 aClass212_5114;
	Class229 aClass229_5115 = new Class229(50);
	int anInt5116;

	public void method7144() {
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(-1954393081);
		}
	}

	public ItemDefinitions getItemDefinitions(int i, int i_0_) {
		ItemDefinitions class425;
		synchronized (((Class426) this).aClass229_5109) {
			class425 = ((ItemDefinitions) ((Class426) this).aClass229_5109.method3865((long) i));
		}
		if (class425 != null)
			return class425;
		byte[] is;
		synchronized (((Class426) this).aClass317_5106) {
			is = (((Class426) this).aClass317_5106.getFile(Class120.aClass120_1493.method2079(i, 548952968), Class120.aClass120_1493.method2080(i, -1930948292), -1500146511));
		}
		class425 = new ItemDefinitions();
		((ItemDefinitions) class425).aClass426_5034 = this;
		((ItemDefinitions) class425).anInt5035 = i * -2098132987;
		class425.aStringArray5053 = (String[]) ((Class426) this).aStringArray5110.clone();
		class425.aStringArray5054 = (String[]) ((Class426) this).aStringArray5107.clone();
		if (null != is)
			class425.method7086(new RsByteBuffer(is), -176434754);
		class425.method7085(-1924179762);
		if (-722914683 * class425.anInt5078 != -1)
			class425.method7088(getItemDefinitions(-722914683 * class425.anInt5078, 1167906942), getItemDefinitions(1416589415 * class425.anInt5084, 1245595517), -1715219620);
		if (-1 != class425.anInt5068 * -1203090775)
			class425.method7134(getItemDefinitions(class425.anInt5068 * -1203090775, 294444778), getItemDefinitions((((ItemDefinitions) class425).anInt5048 * -14763883), 1908925068), -1404615542);
		if (class425.anInt5046 * 370155889 != -1)
			class425.method7087(getItemDefinitions(370155889 * class425.anInt5046, 828359432), getItemDefinitions((((ItemDefinitions) class425).anInt5099 * 224116893), 1928714230), 1201532175);
		if (!((Class426) this).aBool5105 && class425.aBool5052) {
			class425.anInt5093 = 0;
			class425.aStringArray5053 = ((Class426) this).aStringArray5110;
			class425.aStringArray5054 = ((Class426) this).aStringArray5107;
			class425.aBool5085 = false;
			class425.anIntArray5097 = null;
			if (((ItemDefinitions) class425).aClass465_5040 != null) {
				boolean bool = false;
				for (Class282 class282 = ((ItemDefinitions) class425).aClass465_5040.method7750(-778830741); class282 != null; class282 = ((ItemDefinitions) class425).aClass465_5040.method7751((byte) 57)) {
					Class437 class437 = (((Class426) this).aClass424_5113.method7069((int) (class282.aLong3379 * -3442165056282524525L), (byte) 0));
					if (class437.aBool5338)
						class282.method4991(-371378792);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) class425).aClass465_5040 = null;
			}
		}
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3856(class425, (long) i);
		}
		return class425;
	}

	public ItemDefinitions method7146(int i) {
		ItemDefinitions class425;
		synchronized (((Class426) this).aClass229_5109) {
			class425 = ((ItemDefinitions) ((Class426) this).aClass229_5109.method3865((long) i));
		}
		if (class425 != null)
			return class425;
		byte[] is;
		synchronized (((Class426) this).aClass317_5106) {
			is = (((Class426) this).aClass317_5106.getFile(Class120.aClass120_1493.method2079(i, -1102857534), Class120.aClass120_1493.method2080(i, -1990546535), -1273057531));
		}
		class425 = new ItemDefinitions();
		((ItemDefinitions) class425).aClass426_5034 = this;
		((ItemDefinitions) class425).anInt5035 = i * -2098132987;
		class425.aStringArray5053 = (String[]) ((Class426) this).aStringArray5110.clone();
		class425.aStringArray5054 = (String[]) ((Class426) this).aStringArray5107.clone();
		if (null != is)
			class425.method7086(new RsByteBuffer(is), 30903266);
		class425.method7085(-1924179762);
		if (-722914683 * class425.anInt5078 != -1)
			class425.method7088(getItemDefinitions(-722914683 * class425.anInt5078, 1647943494), getItemDefinitions(1416589415 * class425.anInt5084, 1391404404), -1200431545);
		if (-1 != class425.anInt5068 * -1203090775)
			class425.method7134(getItemDefinitions(class425.anInt5068 * -1203090775, 1202138970), getItemDefinitions((((ItemDefinitions) class425).anInt5048 * -14763883), 1408840359), -337716708);
		if (class425.anInt5046 * 370155889 != -1)
			class425.method7087(getItemDefinitions(370155889 * class425.anInt5046, 112914662), getItemDefinitions((((ItemDefinitions) class425).anInt5099 * 224116893), 438609250), 1201532175);
		if (!((Class426) this).aBool5105 && class425.aBool5052) {
			class425.anInt5093 = 0;
			class425.aStringArray5053 = ((Class426) this).aStringArray5110;
			class425.aStringArray5054 = ((Class426) this).aStringArray5107;
			class425.aBool5085 = false;
			class425.anIntArray5097 = null;
			if (((ItemDefinitions) class425).aClass465_5040 != null) {
				boolean bool = false;
				for (Class282 class282 = ((ItemDefinitions) class425).aClass465_5040.method7750(1058675589); class282 != null; class282 = ((ItemDefinitions) class425).aClass465_5040.method7751((byte) 111)) {
					Class437 class437 = (((Class426) this).aClass424_5113.method7069((int) (class282.aLong3379 * -3442165056282524525L), (byte) 0));
					if (class437.aBool5338)
						class282.method4991(-371378792);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) class425).aClass465_5040 = null;
			}
		}
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3856(class425, (long) i);
		}
		return class425;
	}

	public Class160 method7147(Class505 class505, Class505 class505_1_, int i, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_, int i_6_, Class8 class8, Class238 class238, byte i_7_) {
		if (!bool_5_) {
			Class160 class160 = method7162(class505_1_, i, i_2_, i_3_, i_4_, i_6_, class238, 206421629);
			if (null != class160)
				return class160;
		}
		ItemDefinitions class425 = getItemDefinitions(i, 1779200762);
		if (i_2_ > 1 && ((ItemDefinitions) class425).anIntArray5082 != null) {
			int i_8_ = -1;
			for (int i_9_ = 0; i_9_ < 10; i_9_++) {
				if (i_2_ >= ((ItemDefinitions) class425).anIntArray5072[i_9_] && 0 != ((ItemDefinitions) class425).anIntArray5072[i_9_])
					i_8_ = ((ItemDefinitions) class425).anIntArray5082[i_9_];
			}
			if (i_8_ != -1)
				class425 = getItemDefinitions(i_8_, 486684892);
		}
		int[] is = class425.method7093(class505, class505_1_, i_2_, i_3_, i_4_, bool, i_6_, class8, class238, (short) 255);
		if (is == null)
			return null;
		Class160 class160;
		if (bool_5_)
			class160 = class505.method8549(is, 0, 36, 36, 32, -1903449230);
		else
			class160 = class505_1_.method8549(is, 0, 36, 36, 32, -923043708);
		if (!bool_5_) {
			Class420 class420 = new Class420();
			((Class420) class420).anInt5008 = class505_1_.anInt5840 * -557951377;
			((Class420) class420).anInt5007 = i * 412172861;
			((Class420) class420).anInt5006 = -1802585529 * i_2_;
			((Class420) class420).anInt5005 = i_3_ * -1113099245;
			((Class420) class420).anInt5009 = i_4_ * -621770313;
			((Class420) class420).anInt5010 = -190647633 * i_6_;
			((Class420) class420).aBool5011 = class238 != null;
			aClass212_5114.method3644(class160, class420);
		}
		return class160;
	}

	public void method7148(boolean bool, int i) {
		if (((Class426) this).aBool5105 != bool) {
			((Class426) this).aBool5105 = bool;
			method7150(-2095377821);
		}
	}

	public Class160 method7149(Class505 class505, int i, int i_10_, int i_11_, int i_12_, int i_13_, Class238 class238) {
		((Class420) ((Class426) this).aClass420_5112).anInt5008 = -557951377 * class505.anInt5840;
		((Class420) ((Class426) this).aClass420_5112).anInt5007 = 412172861 * i;
		((Class420) ((Class426) this).aClass420_5112).anInt5006 = -1802585529 * i_10_;
		((Class420) ((Class426) this).aClass420_5112).anInt5005 = i_11_ * -1113099245;
		((Class420) ((Class426) this).aClass420_5112).anInt5009 = i_12_ * -621770313;
		((Class420) ((Class426) this).aClass420_5112).anInt5010 = i_13_ * -190647633;
		((Class420) ((Class426) this).aClass420_5112).aBool5011 = class238 != null;
		return ((Class160) aClass212_5114.method3654(((Class426) this).aClass420_5112));
	}

	public void method7150(int i) {
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3859(-1183528358);
		}
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(-545923890);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3638();
		}
	}

	public void method7151(byte i) {
		synchronized (aClass212_5114) {
			aClass212_5114.method3638();
		}
	}

	public void method7152(int i) {
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(1371574931);
		}
	}

	public void method7153(int i, int i_14_) {
		((Class426) this).anInt5116 = i * 1246124191;
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(1018730754);
		}
	}

	public ItemDefinitions method7154(int i) {
		ItemDefinitions class425;
		synchronized (((Class426) this).aClass229_5109) {
			class425 = ((ItemDefinitions) ((Class426) this).aClass229_5109.method3865((long) i));
		}
		if (class425 != null)
			return class425;
		byte[] is;
		synchronized (((Class426) this).aClass317_5106) {
			is = (((Class426) this).aClass317_5106.getFile(Class120.aClass120_1493.method2079(i, -1135251178), Class120.aClass120_1493.method2080(i, -2073774449), -1396225442));
		}
		class425 = new ItemDefinitions();
		((ItemDefinitions) class425).aClass426_5034 = this;
		((ItemDefinitions) class425).anInt5035 = i * -2098132987;
		class425.aStringArray5053 = (String[]) ((Class426) this).aStringArray5110.clone();
		class425.aStringArray5054 = (String[]) ((Class426) this).aStringArray5107.clone();
		if (null != is)
			class425.method7086(new RsByteBuffer(is), 976121676);
		class425.method7085(-1924179762);
		if (-722914683 * class425.anInt5078 != -1)
			class425.method7088(getItemDefinitions(-722914683 * class425.anInt5078, 584370598), getItemDefinitions(1416589415 * class425.anInt5084, 627520735), -1436836013);
		if (-1 != class425.anInt5068 * -1203090775)
			class425.method7134(getItemDefinitions(class425.anInt5068 * -1203090775, 1923453477), getItemDefinitions((((ItemDefinitions) class425).anInt5048 * -14763883), 114592367), 92763970);
		if (class425.anInt5046 * 370155889 != -1)
			class425.method7087(getItemDefinitions(370155889 * class425.anInt5046, 1745805832), getItemDefinitions((((ItemDefinitions) class425).anInt5099 * 224116893), 597719078), 1201532175);
		if (!((Class426) this).aBool5105 && class425.aBool5052) {
			class425.anInt5093 = 0;
			class425.aStringArray5053 = ((Class426) this).aStringArray5110;
			class425.aStringArray5054 = ((Class426) this).aStringArray5107;
			class425.aBool5085 = false;
			class425.anIntArray5097 = null;
			if (((ItemDefinitions) class425).aClass465_5040 != null) {
				boolean bool = false;
				for (Class282 class282 = ((ItemDefinitions) class425).aClass465_5040.method7750(-1669241343); class282 != null; class282 = ((ItemDefinitions) class425).aClass465_5040.method7751((byte) 97)) {
					Class437 class437 = (((Class426) this).aClass424_5113.method7069((int) (class282.aLong3379 * -3442165056282524525L), (byte) 0));
					if (class437.aBool5338)
						class282.method4991(-371378792);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) class425).aClass465_5040 = null;
			}
		}
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3856(class425, (long) i);
		}
		return class425;
	}

	public void method7155() {
		synchronized (aClass212_5114) {
			aClass212_5114.method3638();
		}
	}

	public void method7156(int i, byte i_15_) {
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3858(i, (byte) -11);
		}
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3858(i, (byte) -73);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3639(i);
		}
	}

	public ItemDefinitions method7157(int i) {
		ItemDefinitions class425;
		synchronized (((Class426) this).aClass229_5109) {
			class425 = ((ItemDefinitions) ((Class426) this).aClass229_5109.method3865((long) i));
		}
		if (class425 != null)
			return class425;
		byte[] is;
		synchronized (((Class426) this).aClass317_5106) {
			is = (((Class426) this).aClass317_5106.getFile(Class120.aClass120_1493.method2079(i, -301653827), Class120.aClass120_1493.method2080(i, -2123977413), -1682751769));
		}
		class425 = new ItemDefinitions();
		((ItemDefinitions) class425).aClass426_5034 = this;
		((ItemDefinitions) class425).anInt5035 = i * -2098132987;
		class425.aStringArray5053 = (String[]) ((Class426) this).aStringArray5110.clone();
		class425.aStringArray5054 = (String[]) ((Class426) this).aStringArray5107.clone();
		if (null != is)
			class425.method7086(new RsByteBuffer(is), 1355509897);
		class425.method7085(-1924179762);
		if (-722914683 * class425.anInt5078 != -1)
			class425.method7088(getItemDefinitions(-722914683 * class425.anInt5078, 1950243383), getItemDefinitions(1416589415 * class425.anInt5084, 199235353), -1869366956);
		if (-1 != class425.anInt5068 * -1203090775)
			class425.method7134(getItemDefinitions(class425.anInt5068 * -1203090775, 389100236), getItemDefinitions((((ItemDefinitions) class425).anInt5048 * -14763883), 1614642943), -1129062859);
		if (class425.anInt5046 * 370155889 != -1)
			class425.method7087(getItemDefinitions(370155889 * class425.anInt5046, 1334571716), getItemDefinitions((((ItemDefinitions) class425).anInt5099 * 224116893), 460602891), 1201532175);
		if (!((Class426) this).aBool5105 && class425.aBool5052) {
			class425.anInt5093 = 0;
			class425.aStringArray5053 = ((Class426) this).aStringArray5110;
			class425.aStringArray5054 = ((Class426) this).aStringArray5107;
			class425.aBool5085 = false;
			class425.anIntArray5097 = null;
			if (((ItemDefinitions) class425).aClass465_5040 != null) {
				boolean bool = false;
				for (Class282 class282 = ((ItemDefinitions) class425).aClass465_5040.method7750(-1890404666); class282 != null; class282 = ((ItemDefinitions) class425).aClass465_5040.method7751((byte) 83)) {
					Class437 class437 = (((Class426) this).aClass424_5113.method7069((int) (class282.aLong3379 * -3442165056282524525L), (byte) 0));
					if (class437.aBool5338)
						class282.method4991(-371378792);
					else
						bool = true;
				}
				if (!bool)
					((ItemDefinitions) class425).aClass465_5040 = null;
			}
		}
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3856(class425, (long) i);
		}
		return class425;
	}

	public void method7158(int i) {
		((Class426) this).anInt5116 = i * 1246124191;
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(860415769);
		}
	}

	public Class426(Class486 class486, Class495 class495, boolean bool, Class424 class424, Class317 class317, Class317 class317_16_) {
		aClass212_5114 = new Class212(250);
		((Class426) this).aClass420_5112 = new Class420();
		((Class426) this).aClass486_5103 = class486;
		((Class426) this).aClass495_5104 = class495;
		((Class426) this).aBool5105 = bool;
		((Class426) this).aClass424_5113 = class424;
		((Class426) this).aClass317_5106 = class317;
		((Class426) this).aClass317_5111 = class317_16_;
		if (((Class426) this).aClass317_5106 != null) {
			int i = ((Class426) this).aClass317_5106.method5618(-1865229040) - 1;
			anInt5108 = (i * Class120.aClass120_1493.method2078(-1077198554) + ((Class426) this).aClass317_5106.method5624(i, -1891673686)) * -230207835;
		} else
			anInt5108 = 0;
		if (Class486.aClass486_5744 == ((Class426) this).aClass486_5103)
			((Class426) this).aStringArray5110 = (new String[] { null, null, Class433.aClass433_5243.method7273((((Class426) this).aClass495_5104), -1215966862), null, null, Class433.aClass433_5282.method7273((((Class426) this).aClass495_5104), -380297277) });
		else
			((Class426) this).aStringArray5110 = (new String[] { null, null, Class433.aClass433_5243.method7273((((Class426) this).aClass495_5104), -791276439), null, null, null });
		((Class426) this).aStringArray5107 = (new String[] { null, null, null, null, Class433.aClass433_5168.method7273((((Class426) this).aClass495_5104), -1623734133) });
	}

	public Class160 method7159(Class505 class505, Class505 class505_17_, int i, int i_18_, int i_19_, int i_20_, boolean bool, boolean bool_21_, int i_22_, Class8 class8, Class238 class238) {
		if (!bool_21_) {
			Class160 class160 = method7162(class505_17_, i, i_18_, i_19_, i_20_, i_22_, class238, 206421629);
			if (null != class160)
				return class160;
		}
		ItemDefinitions class425 = getItemDefinitions(i, 90824098);
		if (i_18_ > 1 && ((ItemDefinitions) class425).anIntArray5082 != null) {
			int i_23_ = -1;
			for (int i_24_ = 0; i_24_ < 10; i_24_++) {
				if (i_18_ >= ((ItemDefinitions) class425).anIntArray5072[i_24_] && 0 != ((ItemDefinitions) class425).anIntArray5072[i_24_])
					i_23_ = ((ItemDefinitions) class425).anIntArray5082[i_24_];
			}
			if (i_23_ != -1)
				class425 = getItemDefinitions(i_23_, 657488618);
		}
		int[] is = class425.method7093(class505, class505_17_, i_18_, i_19_, i_20_, bool, i_22_, class8, class238, (short) 255);
		if (is == null)
			return null;
		Class160 class160;
		if (bool_21_)
			class160 = class505.method8549(is, 0, 36, 36, 32, 1464089111);
		else
			class160 = class505_17_.method8549(is, 0, 36, 36, 32, -66647770);
		if (!bool_21_) {
			Class420 class420 = new Class420();
			((Class420) class420).anInt5008 = class505_17_.anInt5840 * -557951377;
			((Class420) class420).anInt5007 = i * 412172861;
			((Class420) class420).anInt5006 = -1802585529 * i_18_;
			((Class420) class420).anInt5005 = i_19_ * -1113099245;
			((Class420) class420).anInt5009 = i_20_ * -621770313;
			((Class420) class420).anInt5010 = -190647633 * i_22_;
			((Class420) class420).aBool5011 = class238 != null;
			aClass212_5114.method3644(class160, class420);
		}
		return class160;
	}

	public void method7160(boolean bool) {
		if (((Class426) this).aBool5105 != bool) {
			((Class426) this).aBool5105 = bool;
			method7150(-1402031993);
		}
	}

	public void method7161(int i) {
		((Class426) this).anInt5116 = i * 1246124191;
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(1414882183);
		}
	}

	public Class160 method7162(Class505 class505, int i, int i_25_, int i_26_, int i_27_, int i_28_, Class238 class238, int i_29_) {
		((Class420) ((Class426) this).aClass420_5112).anInt5008 = -557951377 * class505.anInt5840;
		((Class420) ((Class426) this).aClass420_5112).anInt5007 = 412172861 * i;
		((Class420) ((Class426) this).aClass420_5112).anInt5006 = -1802585529 * i_25_;
		((Class420) ((Class426) this).aClass420_5112).anInt5005 = i_26_ * -1113099245;
		((Class420) ((Class426) this).aClass420_5112).anInt5009 = i_27_ * -621770313;
		((Class420) ((Class426) this).aClass420_5112).anInt5010 = i_28_ * -190647633;
		((Class420) ((Class426) this).aClass420_5112).aBool5011 = class238 != null;
		return ((Class160) aClass212_5114.method3654(((Class426) this).aClass420_5112));
	}

	public void method7163() {
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3859(-1323673176);
		}
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(-1240077198);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3638();
		}
	}

	public void method7164() {
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3859(720827446);
		}
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(586119089);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3638();
		}
	}

	public Class160 method7165(Class505 class505, int i, int i_30_, int i_31_, int i_32_, int i_33_, Class238 class238) {
		((Class420) ((Class426) this).aClass420_5112).anInt5008 = -557951377 * class505.anInt5840;
		((Class420) ((Class426) this).aClass420_5112).anInt5007 = 412172861 * i;
		((Class420) ((Class426) this).aClass420_5112).anInt5006 = -1802585529 * i_30_;
		((Class420) ((Class426) this).aClass420_5112).anInt5005 = i_31_ * -1113099245;
		((Class420) ((Class426) this).aClass420_5112).anInt5009 = i_32_ * -621770313;
		((Class420) ((Class426) this).aClass420_5112).anInt5010 = i_33_ * -190647633;
		((Class420) ((Class426) this).aClass420_5112).aBool5011 = class238 != null;
		return ((Class160) aClass212_5114.method3654(((Class426) this).aClass420_5112));
	}

	public void method7166(int i) {
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3863(1688795020);
		}
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3863(692619526);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3641();
		}
	}

	public void method7167() {
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3859(-988255675);
		}
	}

	public void method7168(int i) {
		synchronized (((Class426) this).aClass229_5109) {
			((Class426) this).aClass229_5109.method3858(i, (byte) -3);
		}
		synchronized (((Class426) this).aClass229_5115) {
			((Class426) this).aClass229_5115.method3858(i, (byte) -28);
		}
		synchronized (aClass212_5114) {
			aClass212_5114.method3639(i);
		}
	}

	static String method7169(int i, int i_34_, int i_35_) {
		int i_36_ = i_34_ - i;
		if (i_36_ < -9)
			return Class59.method1163(16711680, 619010179);
		if (i_36_ < -6)
			return Class59.method1163(16723968, 619010179);
		if (i_36_ < -3)
			return Class59.method1163(16740352, 619010179);
		if (i_36_ < 0)
			return Class59.method1163(16756736, 619010179);
		if (i_36_ > 9)
			return Class59.method1163(65280, 619010179);
		if (i_36_ > 6)
			return Class59.method1163(4259584, 619010179);
		if (i_36_ > 3)
			return Class59.method1163(8453888, 619010179);
		if (i_36_ > 0)
			return Class59.method1163(12648192, 619010179);
		return Class59.method1163(16776960, 619010179);
	}

	static void method7170(int i, int i_37_) {
		if (Class5.anIntArray36 == null || Class5.anIntArray36.length < i)
			Class5.anIntArray36 = new int[i];
	}

	static String method7171(Class118 class118, int i, byte i_38_) {
		if (!client.method11633(class118).method12178(i, (short) -32600) && class118.anObjectArray1410 == null)
			return null;
		if (class118.aStringArray1352 == null || class118.aStringArray1352.length <= i || class118.aStringArray1352[i] == null || class118.aStringArray1352[i].trim().length() == 0) {
			if (client.aBool7168)
				return new StringBuilder().append("Hidden-").append(i).toString();
			return null;
		}
		return class118.aStringArray1352[i];
	}
}
