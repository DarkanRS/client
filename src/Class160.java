/* Class160 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class160 {
	static int anInt1630 = 3;
	int anInt1631 = -247396807;
	Class453 aClass453_1632 = new Class453();
	static int anInt1633 = 1;
	static int anInt1634 = 2;
	static int anInt1635 = 7;
	static int anInt1636 = 4;
	static int anInt1637 = 11;
	static int anInt1638 = 6;
	static int anInt1639 = 12;
	static int anInt1640 = 8;
	static int anInt1641 = 5;
	static int anInt1642 = 10;
	long aLong1643;
	static int anInt1644 = 9;
	static int anInt1645 = 13;
	static Class57[] aClass57Array1646;
	public static Class243 aClass243_1647;

	public void method1707(Class162 class162, byte i) {
		try {
			if ((2334843941678543823L * ((Class162) class162).aLong1663 != -6211723929392173281L * ((Class160) this).aLong1643) || (((Class160) this).anInt1631 * 2001926135 != -934549233 * ((Class162) class162).anInt1653))
				throw new RuntimeException("");
			for (Class298_Sub40 class298_sub40 = (Class298_Sub40) ((Class160) this).aClass453_1632.method5939(1766612795); null != class298_sub40; class298_sub40 = ((Class298_Sub40) ((Class160) this).aClass453_1632.method5944(49146)))
				class298_sub40.method3510(class162, (byte) 1);
			((Class162) class162).anInt1653 += 1441392111;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gn.f(").append(')').toString());
		}
	}

	public Class160(RsByteBuffer class298_sub53) {
		method1708(class298_sub53, (short) 594);
	}

	void method1708(RsByteBuffer stream, short i) {
		try {
			((Class160) this).aLong1643 = (stream.readLong((short) 21326) * 8254773464748362975L); // has
																									// to
																									// be
																									// 0
																									// else
																									// crash
			((Class160) this).anInt1631 = stream.readInt((byte) -33) * 247396807;
			for (int i_0_ = stream.readUnsignedByte(); 0 != i_0_; i_0_ = stream.readUnsignedByte()) {
				Class298_Sub40 class298_sub40;
				if (i_0_ == 3)
					class298_sub40 = new Class298_Sub40_Sub2(this);
				else if (1 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub1(this);
				else if (13 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub5(this);
				else if (i_0_ == 4)
					class298_sub40 = new Class298_Sub40_Sub6(this);
				else if (6 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub11(this);
				else if (5 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub7(this);
				else if (2 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub9(this);
				else if (7 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub10(this);
				else if (8 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub13(this);
				else if (i_0_ == 9)
					class298_sub40 = new Class298_Sub40_Sub8(this);
				else if (i_0_ == 10)
					class298_sub40 = new Class298_Sub40_Sub3(this);
				else if (i_0_ == 11)
					class298_sub40 = new Class298_Sub40_Sub12(this);
				else if (12 == i_0_)
					class298_sub40 = new Class298_Sub40_Sub4(this);
				else
					throw new RuntimeException("");
				class298_sub40.method3508(stream, 804752437);
				((Class160) this).aClass453_1632.method5935(class298_sub40, 843424958);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gn.a(").append(')').toString());
		}
	}

	static final void method1709(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_1_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_2_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_1_);
			if (i_2_ >= 1 && i_2_ <= 5 && null != class468.aStringArray5732[i_2_ - 1])
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class468.aStringArray5732[i_2_ - 1];
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gn.aar(").append(')').toString());
		}
	}

	static final void method1710(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class62.method724(class105, class119, class403, (byte) 125);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gn.jz(").append(')').toString());
		}
	}

	static final void method1711(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_3_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			IComponentDefinition class105 = Class140.method1558(i_3_ << 16 | i_4_, i_5_, -156511736);
			Class144.method1587((byte) 4);
			IComponentSettings class298_sub38 = client.method2801(class105);
			Class147.method1600(class105, class298_sub38.method3497((byte) -10), -1133219011 * class298_sub38.anInt7410, 1387537939);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("gn.amf(").append(')').toString());
		}
	}
}
