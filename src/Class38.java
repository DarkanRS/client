
/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class38 {
	public int anInt395;
	public int anInt396 = 386291400;
	public int anInt397;
	public int anInt398;
	public int anInt399;
	public boolean aBool400;
	public int anInt401;
	public int anInt402;
	public int anInt403;
	public int anInt404 = 832394903;
	public int anInt405;

	void method843(RsByteBuffer class282_sub35, int i, int i_0_) {
		if (1 == i)
			anInt396 = class282_sub35.readUnsignedShort() * 1122028249;
		else if (i == 2)
			aBool400 = true;
		else if (3 == i) {
			anInt401 = class282_sub35.readShort(2039701434) * 195595401;
			anInt397 = class282_sub35.readShort(1948246025) * 1348226623;
			anInt399 = class282_sub35.readShort(1762274670) * 1916002877;
		} else if (4 == i)
			anInt395 = class282_sub35.readUnsignedByte() * 1741810315;
		else if (i == 5)
			anInt402 = class282_sub35.readBigSmart(1992336155) * 1489057977;
		else if (6 == i)
			anInt404 = class282_sub35.read24BitUnsignedInteger((short) 11913) * 929212777;
		else if (i == 7) {
			anInt403 = class282_sub35.readShort(1729052508) * 1226097743;
			anInt398 = class282_sub35.readShort(2077020068) * 405070739;
			anInt405 = class282_sub35.readShort(2000498721) * -2075249661;
		}
	}

	Class38() {
		/* empty */
	}

	void method844(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			anInt396 = class282_sub35.readUnsignedShort() * 1122028249;
		else if (i == 2)
			aBool400 = true;
		else if (3 == i) {
			anInt401 = class282_sub35.readShort(1584210559) * 195595401;
			anInt397 = class282_sub35.readShort(1675926497) * 1348226623;
			anInt399 = class282_sub35.readShort(1583906109) * 1916002877;
		} else if (4 == i)
			anInt395 = class282_sub35.readUnsignedByte() * 1741810315;
		else if (i == 5)
			anInt402 = class282_sub35.readBigSmart(2092374659) * 1489057977;
		else if (6 == i)
			anInt404 = class282_sub35.read24BitUnsignedInteger((short) 4167) * 929212777;
		else if (i == 7) {
			anInt403 = class282_sub35.readShort(1852655368) * 1226097743;
			anInt398 = class282_sub35.readShort(2126737512) * 405070739;
			anInt405 = class282_sub35.readShort(2110661700) * -2075249661;
		}
	}

	void method845(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method843(class282_sub35, i, 1952299916);
		}
	}

	void method846(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method843(class282_sub35, i, 666652414);
		}
	}

	void method847(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			anInt396 = class282_sub35.readUnsignedShort() * 1122028249;
		else if (i == 2)
			aBool400 = true;
		else if (3 == i) {
			anInt401 = class282_sub35.readShort(1955574863) * 195595401;
			anInt397 = class282_sub35.readShort(1721272105) * 1348226623;
			anInt399 = class282_sub35.readShort(2044118617) * 1916002877;
		} else if (4 == i)
			anInt395 = class282_sub35.readUnsignedByte() * 1741810315;
		else if (i == 5)
			anInt402 = class282_sub35.readBigSmart(2125461903) * 1489057977;
		else if (6 == i)
			anInt404 = class282_sub35.read24BitUnsignedInteger((short) 24474) * 929212777;
		else if (i == 7) {
			anInt403 = class282_sub35.readShort(1977307492) * 1226097743;
			anInt398 = class282_sub35.readShort(2113694101) * 405070739;
			anInt405 = class282_sub35.readShort(1678799772) * -2075249661;
		}
	}

	void method848(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			anInt396 = class282_sub35.readUnsignedShort() * 1122028249;
		else if (i == 2)
			aBool400 = true;
		else if (3 == i) {
			anInt401 = class282_sub35.readShort(2095343675) * 195595401;
			anInt397 = class282_sub35.readShort(1776540743) * 1348226623;
			anInt399 = class282_sub35.readShort(1854789642) * 1916002877;
		} else if (4 == i)
			anInt395 = class282_sub35.readUnsignedByte() * 1741810315;
		else if (i == 5)
			anInt402 = class282_sub35.readBigSmart(2147400124) * 1489057977;
		else if (6 == i)
			anInt404 = class282_sub35.read24BitUnsignedInteger((short) 10644) * 929212777;
		else if (i == 7) {
			anInt403 = class282_sub35.readShort(1726375417) * 1226097743;
			anInt398 = class282_sub35.readShort(1798022906) * 405070739;
			anInt405 = class282_sub35.readShort(2138149306) * -2075249661;
		}
	}

	void method849(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			anInt396 = class282_sub35.readUnsignedShort() * 1122028249;
		else if (i == 2)
			aBool400 = true;
		else if (3 == i) {
			anInt401 = class282_sub35.readShort(1917600472) * 195595401;
			anInt397 = class282_sub35.readShort(2083433613) * 1348226623;
			anInt399 = class282_sub35.readShort(1572769334) * 1916002877;
		} else if (4 == i)
			anInt395 = class282_sub35.readUnsignedByte() * 1741810315;
		else if (i == 5)
			anInt402 = class282_sub35.readBigSmart(1983074206) * 1489057977;
		else if (6 == i)
			anInt404 = class282_sub35.read24BitUnsignedInteger((short) 28766) * 929212777;
		else if (i == 7) {
			anInt403 = class282_sub35.readShort(1661264331) * 1226097743;
			anInt398 = class282_sub35.readShort(2005763884) * 405070739;
			anInt405 = class282_sub35.readShort(1995009058) * -2075249661;
		}
	}

	void method850(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (0 == i_1_)
				break;
			method843(class282_sub35, i_1_, 2017295137);
		}
	}

	static void method851(int i, int i_2_) {
		Class180.anInt2246 = -1709646095 * i;
		Class180.aClass229_2245.method3859(1791836497);
	}

	public static Class202 method852(Socket socket, int i, int i_3_) throws IOException {
		return new Class202_Sub1(socket, i);
	}

	public static Class225 method853(int i, int i_4_, int i_5_) {
		Class224.aClass225_Sub1_2776.anInt2779 = -726719813 * i;
		Class224.aClass225_Sub1_2776.anInt2780 = 1767388707 * i_4_;
		Class224.aClass225_Sub1_2776.anInt2781 = -12808295;
		Class224.aClass225_Sub1_2776.anInt2782 = 1709796035;
		return Class224.aClass225_Sub1_2776;
	}

	public static void method854(boolean bool, boolean bool_6_, int i) {
		if (bool) {
			Class540.anInt7137 += -1089474401;
			Class371.method6351(2032384190);
		}
		if (bool_6_) {
			Class540.anInt7135 += 2019563659;
			Class77.method1365(-1118767035);
		}
	}

	static final void method855(CS2Executor class527, byte i) {
		int i_7_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_7_, (byte) 78);
		Class235.method3965(class118, class527, -252931751);
	}

	static final void method856(CS2Executor class527, byte i) {
		int i_8_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i_8_);
		if (class282_sub50_sub6 == null) {
			if (i > -1)
				((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537) - 1] = -1;
		} else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = class282_sub50_sub6.anInt9542 * -1337359695;
	}

	static void method857(GraphicalRenderer class505, int i) {
		int i_9_ = Class301.anInt3555 * 1742345613;
		int i_10_ = Class184.anInt2300 * 815250613;
		int i_11_ = -13788709 * Class158_Sub2.anInt8975;
		int i_12_ = Class110.anInt1104 * -1488439617 - 3;
		int i_13_ = 20;
		if (Class186.aClass8_2348 == null || null == Class176.aClass414_2200) {
			Class186.aClass8_2348 = ((FontRenderer) Class487.aClass378_5752.method6426((client.anInterface35_7206), (Class242.anInt2982 * -1242615035), true, true, -2144080048));
			Class176.aClass414_2200 = Class487.aClass378_5752.method6415(client.anInterface35_7206, (Class242.anInt2982 * -1242615035), -1588148414);
			if (Class186.aClass8_2348 != null && null != Class176.aClass414_2200) {
				Class316.method5594(-559600711);
				int i_14_ = i_9_ + i_11_ / 2;
				if (i_14_ + i_11_ > -418109423 * Class349.anInt4083)
					i_14_ = Class349.anInt4083 * -418109423 - i_11_;
				if (i_14_ < 0)
					i_14_ = 0;
				Class262.method4653(i_14_, 815250613 * Class184.anInt2300, 1505177278);
				return;
			}
		}
		FontRenderer class8;
		if (Class186.aClass8_2348 == null || Class176.aClass414_2200 == null)
			class8 = Class285.aClass8_3394;
		else
			class8 = Class186.aClass8_2348;
		Class414 class414 = Class114.method1887(-864314974);
		Class456_Sub2.method12680(class505, 1742345613 * Class301.anInt3555, Class184.anInt2300 * 815250613, Class158_Sub2.anInt8975 * -13788709, -1488439617 * Class110.anInt1104, i_13_, class8, class414, Class433.aClass433_5255.method7273(Class223.aClass495_2772, -827597083), -1519032164);
		int i_15_ = (255 - Class182.anInt2262 * 1734917383 - Class20.anInt156 * -1454754391);
		if (i_15_ < 0)
			i_15_ = 0;
		int i_16_ = Class163.aClass209_2031.method3569(2129837373);
		int i_17_ = Class163.aClass209_2031.method3570(756095591);
		if (!Class20.aBool162) {
			int i_18_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 108)); class282_sub50_sub7 != null; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(-573495848))) {
				int i_19_ = ((Class20.anInt178 * 997766473 * (Class20.anInt169 * 2144330291 - 1 - i_18_)) + (class414.anInt4978 * 397683159 + (i_10_ + i_13_) + 1));
				if (i_16_ > 1742345613 * Class301.anInt3555 && i_16_ < (Class301.anInt3555 * 1742345613 + -13788709 * Class158_Sub2.anInt8975) && i_17_ > i_19_ - 397683159 * class414.anInt4978 - 1 && i_17_ < class414.anInt4979 * -1518951631 + i_19_ && ((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9583)
					class505.B(1742345613 * Class301.anInt3555, i_19_ - 397683159 * class414.anInt4978, -13788709 * Class158_Sub2.anInt8975, 997766473 * Class20.anInt178, i_15_ << 24 | Class20.anInt188 * -813614471, 1);
				i_18_++;
			}
		} else {
			int i_20_ = 0;
			for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-2089129686))) {
				int i_21_ = (997766473 * Class20.anInt178 * i_20_ + (1 + (397683159 * class414.anInt4978 + (i_10_ + i_13_))));
				if (i_16_ > 1742345613 * Class301.anInt3555 && i_16_ < (-13788709 * Class158_Sub2.anInt8975 + Class301.anInt3555 * 1742345613) && i_17_ > i_21_ - class414.anInt4978 * 397683159 - 1 && i_17_ < i_21_ + class414.anInt4979 * -1518951631 && ((((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769) * 2026887253 > 1 || ((Class282_Sub50_Sub7) (Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)).aBool9583))
					class505.B(Class301.anInt3555 * 1742345613, i_21_ - 397683159 * class414.anInt4978, Class158_Sub2.anInt8975 * -13788709, Class20.anInt178 * 997766473, i_15_ << 24 | -813614471 * Class20.anInt188, 1);
				i_20_++;
			}
			if (Class20.aClass282_Sub50_Sub15_163 != null) {
				Class456_Sub2.method12680(class505, Class341.anInt3996 * 143093737, Class282_Sub50_Sub2.anInt9471 * 2107083711, Class96_Sub3.anInt8518 * 572079435, -1193351845 * Class521_Sub1_Sub5_Sub1.anInt10526, i_13_, class8, class414, ((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aString9771, -1519032164);
				i_20_ = 0;
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aClass477_9770.method7941((byte) 4)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aClass477_9770.method7955(-889659924))) {
					int i_22_ = (1 + (i_13_ + Class282_Sub50_Sub2.anInt9471 * 2107083711 + class414.anInt4978 * 397683159) + i_20_ * (997766473 * Class20.anInt178));
					if (i_16_ > 143093737 * Class341.anInt3996 && i_16_ < (Class96_Sub3.anInt8518 * 572079435 + 143093737 * Class341.anInt3996) && i_17_ > i_22_ - 397683159 * class414.anInt4978 - 1 && i_17_ < i_22_ + class414.anInt4979 * -1518951631 && (((Class282_Sub50_Sub7) class282_sub50_sub7).aBool9583))
						class505.B(143093737 * Class341.anInt3996, i_22_ - 397683159 * class414.anInt4978, Class96_Sub3.anInt8518 * 572079435, Class20.anInt178 * 997766473, i_15_ << 24 | Class20.anInt188 * -813614471, 1);
					i_20_++;
				}
				Class487.method8209(class505, Class341.anInt3996 * 143093737, Class282_Sub50_Sub2.anInt9471 * 2107083711, 572079435 * Class96_Sub3.anInt8518, (Class521_Sub1_Sub5_Sub1.anInt10526 * -1193351845), i_13_, (byte) 61);
			}
		}
		Class487.method8209(class505, 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300, Class158_Sub2.anInt8975 * -13788709, Class110.anInt1104 * -1488439617, i_13_, (byte) -15);
		if (!Class20.aBool162) {
			int i_23_ = 0;
			for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 123)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(-668033309))) {
				int i_24_ = (1 + (i_10_ + i_13_ + class414.anInt4978 * 397683159) + ((2144330291 * Class20.anInt169 - 1 - i_23_) * (997766473 * Class20.anInt178)));
				Class282_Sub25.method12400(i_16_, i_17_, i_9_, i_10_, i_11_, i_12_, i_24_, class282_sub50_sub7, class8, class414, 1836789541 * Class388.anInt4722 | ~0xffffff, Class99.anInt1005 * 191426225 | ~0xffffff, -162491799);
				i_23_++;
			}
		} else {
			int i_25_ = 0;
			for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4)); null != class282_sub50_sub15; class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7955(880459303))) {
				int i_26_ = (Class20.anInt178 * 997766473 * i_25_ + (i_13_ + 815250613 * Class184.anInt2300 + 397683159 * class414.anInt4978 + 1));
				if ((((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769 * 2026887253) == 1)
					Class282_Sub25.method12400(i_16_, i_17_, 1742345613 * Class301.anInt3555, 815250613 * Class184.anInt2300, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i_26_, ((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), class8, class414, Class388.anInt4722 * 1836789541 | ~0xffffff, Class99.anInt1005 * 191426225 | ~0xffffff, -462904311);
				else
					Class99.method1630(i_16_, i_17_, 1742345613 * Class301.anInt3555, Class184.anInt2300 * 815250613, -13788709 * Class158_Sub2.anInt8975, Class110.anInt1104 * -1488439617, i_26_, class282_sub50_sub15, class8, class414, (1836789541 * Class388.anInt4722 | ~0xffffff), (191426225 * Class99.anInt1005 | ~0xffffff), -814194841);
				i_25_++;
			}
			if (null != Class20.aClass282_Sub50_Sub15_163) {
				i_25_ = 0;
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aClass477_9770.method7941((byte) 4)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) ((Class282_Sub50_Sub15) Class20.aClass282_Sub50_Sub15_163).aClass477_9770.method7955(-2102750964))) {
					int i_27_ = (class414.anInt4978 * 397683159 + (i_13_ + Class282_Sub50_Sub2.anInt9471 * 2107083711) + 1 + Class20.anInt178 * 997766473 * i_25_);
					Class282_Sub25.method12400(i_16_, i_17_, Class341.anInt3996 * 143093737, Class282_Sub50_Sub2.anInt9471 * 2107083711, 572079435 * Class96_Sub3.anInt8518, Class521_Sub1_Sub5_Sub1.anInt10526 * -1193351845, i_27_, class282_sub50_sub7, class8, class414, Class388.anInt4722 * 1836789541 | ~0xffffff, 191426225 * Class99.anInt1005 | ~0xffffff, 50305852);
					i_25_++;
				}
			}
		}
	}

	static final void method858(CS2Executor class527, int i) {
		int i_28_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_28_, (byte) 35);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1376 * -354780671;
	}

	static boolean method859(int i, int i_29_) {
		if (18 == i || i == 19 || i == 20 || i == 21 || 22 == i || 1004 == i)
			return true;
		if (i == 17)
			return true;
		return false;
	}

	static void method860(int i, String string, int i_30_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(3, (long) i);
		class282_sub50_sub12.method14995(902819927);
		((Class282_Sub50_Sub12) class282_sub50_sub12).aString9640 = string;
	}
}
