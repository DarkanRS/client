/* Class168 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.util.Vector;

public class Class168 {
	Interface9_Impl2_Impl1 anInterface9_Impl2_Impl1_1711;
	Class52_Sub1 aClass52_Sub1_1712;
	Interface9_Impl2_Impl1 anInterface9_Impl2_Impl1_1713;
	Interface9_Impl2_Impl1 anInterface9_Impl2_Impl1_1714;
	Vector aVector1715 = new Vector();
	Interface8_Impl1_Impl1 anInterface8_Impl1_Impl1_1716;
	Class_ra_Sub3 aClass_ra_Sub3_1717;
	Interface8_Impl1_Impl1 anInterface8_Impl1_Impl1_1718;
	Interface8_Impl1_Impl2 anInterface8_Impl1_Impl2_1719;
	int anInt1720;
	int anInt1721;
	Interface7_Impl1 anInterface7_Impl1_1722;
	boolean aBoolean1723;
	Interface8_Impl1_Impl1 anInterface8_Impl1_Impl1_1724;
	int anInt1725 = 0;
	Class153 aClass153_1726;
	Class77 aClass77_1727;

	Class168(Class_ra_Sub3 class_ra_sub3, int i, int i_0_) {
		((Class168) this).aClass_ra_Sub3_1717 = class_ra_sub3;
		((Class168) this).aClass77_1727 = Class77.aClass77_717;
		((Class168) this).anInt1720 = i;
		((Class168) this).anInt1721 = i_0_;
	}

	void method1789() {
		if (((Class168) this).anInterface7_Impl1_1722 == null) {
			((Class168) this).anInterface7_Impl1_1722 = ((Class168) this).aClass_ra_Sub3_1717.method5382(false);
			((Class168) this).anInterface7_Impl1_1722.method72(12, 4);
			ByteBuffer bytebuffer = ((Class168) this).aClass_ra_Sub3_1717.aByteBuffer8216;
			bytebuffer.clear();
			bytebuffer.putFloat(0.0F);
			bytebuffer.putFloat(1.0F);
			bytebuffer.putFloat(2.0F);
			((Class168) this).anInterface7_Impl1_1722.method63(0, bytebuffer.position(), ((Class168) this).aClass_ra_Sub3_1717.aLong8217);
			((Class168) this).aClass153_1726 = (((Class168) this).aClass_ra_Sub3_1717.method5404(new Class181[] { new Class181(Class155.aClass155_1601) }));
		}
	}

	void method1790() {
		((Class168) this).aClass_ra_Sub3_1717.method5467();
		((Class168) this).aClass_ra_Sub3_1717.method5374(0);
		((Class168) this).aClass_ra_Sub3_1717.method5360(1);
		((Class168) this).aClass_ra_Sub3_1717.L();
		((Class168) this).aClass52_Sub1_1712.method558(null);
		((Class168) this).aClass_ra_Sub3_1717.method5324(0, 0);
		int i = ((Class168) this).aVector1715.size();
		((Class168) this).anInterface9_Impl2_Impl1_1711.method103();
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
			Class150 class150 = (Class150) ((Class168) this).aVector1715.elementAt(i_1_);
			int i_2_ = class150.method1624();
			boolean bool = i_1_ == i - 1;
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
				if (bool && i_3_ == i_2_ - 1)
					((Class168) this).aClass_ra_Sub3_1717.method5005(((Class168) this).aClass52_Sub1_1712, (byte) -60);
				else
					((Class168) this).aClass52_Sub1_1712.method563(0, ((Class168) this).anInterface8_Impl1_Impl1_1724);
				Interface9_Impl2_Impl1 interface9_impl2_impl1 = ((Class168) this).anInterface9_Impl2_Impl1_1713;
				if (i_3_ == 0)
					interface9_impl2_impl1 = ((Class168) this).anInterface9_Impl2_Impl1_1711;
				class150.method1633(i_3_, ((Class168) this).aClass52_Sub1_1712, interface9_impl2_impl1, (((Class168) this).anInterface8_Impl1_Impl2_1719), (((Class168) this).anInterface9_Impl2_Impl1_1711));
				method1797();
				class150.method1623(i_3_);
				Interface9_Impl2_Impl1 interface9_impl2_impl1_4_ = ((Class168) this).anInterface9_Impl2_Impl1_1713;
				((Class168) this).anInterface9_Impl2_Impl1_1713 = ((Class168) this).anInterface9_Impl2_Impl1_1714;
				((Class168) this).anInterface9_Impl2_Impl1_1714 = interface9_impl2_impl1_4_;
				Interface8_Impl1_Impl1 interface8_impl1_impl1 = ((Class168) this).anInterface8_Impl1_Impl1_1716;
				((Class168) this).anInterface8_Impl1_Impl1_1716 = ((Class168) this).anInterface8_Impl1_Impl1_1724;
				((Class168) this).anInterface8_Impl1_Impl1_1724 = interface8_impl1_impl1;
			}
		}
		((Class168) this).aClass_ra_Sub3_1717.method5374(1);
		((Class168) this).aClass_ra_Sub3_1717.method5360(0);
	}

	void method1791() {
		method1789();
		switch (((Class168) this).anInt1725) {
		default:
			throw new RuntimeException();
		case 0:
			((Class168) this).aClass77_1727 = Class77.aClass77_717;
			break;
		case 2:
			((Class168) this).aClass77_1727 = Class77.aClass77_721;
			break;
		case 1:
			((Class168) this).aClass77_1727 = Class77.aClass77_714;
		}
		((Class168) this).aClass52_Sub1_1712 = ((Class168) this).aClass_ra_Sub3_1717.method5094();
		((Class168) this).anInterface9_Impl2_Impl1_1713 = (((Class168) this).aClass_ra_Sub3_1717.method5356(Class55.aClass55_557, ((Class168) this).aClass77_1727, ((Class168) this).anInt1720, ((Class168) this).anInt1721));
		((Class168) this).anInterface8_Impl1_Impl1_1716 = ((Class168) this).anInterface9_Impl2_Impl1_1713.method117(0);
		((Class168) this).anInterface9_Impl2_Impl1_1714 = (((Class168) this).aClass_ra_Sub3_1717.method5356(Class55.aClass55_557, ((Class168) this).aClass77_1727, ((Class168) this).anInt1720, ((Class168) this).anInt1721));
		((Class168) this).anInterface8_Impl1_Impl1_1724 = ((Class168) this).anInterface9_Impl2_Impl1_1714.method117(0);
		((Class168) this).anInterface9_Impl2_Impl1_1711 = (((Class168) this).aClass_ra_Sub3_1717.method5356(Class55.aClass55_557, ((Class168) this).aClass77_1727, ((Class168) this).anInt1720, ((Class168) this).anInt1721));
		((Class168) this).anInterface8_Impl1_Impl1_1718 = ((Class168) this).anInterface9_Impl2_Impl1_1711.method117(0);
		((Class168) this).anInterface8_Impl1_Impl2_1719 = (((Class168) this).aClass_ra_Sub3_1717.method5186(((Class168) this).anInt1720, ((Class168) this).anInt1721));
		int i = ((Class168) this).aVector1715.size();
		for (int i_5_ = 0; i_5_ < i; i_5_++) {
			Class150 class150 = (Class150) ((Class168) this).aVector1715.elementAt(i_5_);
			class150.method1621(((Class168) this).anInt1720, ((Class168) this).anInt1721);
		}
	}

	boolean method1792(Class150 class150) {
		return method1793(((Class168) this).aVector1715.size(), class150);
	}

	boolean method1793(int i, Class150 class150) {
		if (class150.method1617() || class150.method1618()) {
			((Class168) this).aVector1715.insertElementAt(class150, i);
			class150.method1621(((Class168) this).anInt1720, ((Class168) this).anInt1721);
			int i_6_ = class150.method1625();
			if (i_6_ > ((Class168) this).anInt1725)
				((Class168) this).anInt1725 = i_6_;
			((Class150) class150).aBoolean1586 = true;
			return true;
		}
		method1795(class150);
		return true;
	}

	void method1794() {
		if (((Class168) this).aBoolean1723) {
			method1790();
			((Class168) this).aBoolean1723 = false;
		}
	}

	void method1795(Class150 class150) {
		class150.method1620();
		((Class150) class150).aBoolean1586 = false;
		((Class168) this).aVector1715.removeElement(class150);
	}

	void method1796() {
		((Class168) this).aClass52_Sub1_1712.method135();
		((Class168) this).anInterface8_Impl1_Impl1_1716.b();
		((Class168) this).anInterface8_Impl1_Impl1_1724.b();
		((Class168) this).anInterface8_Impl1_Impl1_1718.b();
		((Class168) this).anInterface9_Impl2_Impl1_1713.b();
		((Class168) this).anInterface9_Impl2_Impl1_1714.b();
		((Class168) this).anInterface9_Impl2_Impl1_1711.b();
		((Class168) this).anInterface8_Impl1_Impl2_1719.b();
		int i = ((Class168) this).aVector1715.size();
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			Class150 class150 = (Class150) ((Class168) this).aVector1715.elementAt(i_7_);
			class150.method1620();
		}
	}

	void method1797() {
		((Class168) this).aClass_ra_Sub3_1717.method5383(0, ((Class168) this).anInterface7_Impl1_1722);
		((Class168) this).aClass_ra_Sub3_1717.method5455(((Class168) this).aClass153_1726);
		((Class168) this).aClass_ra_Sub3_1717.method5398(Class187.aClass187_1907, 0, 1);
	}

	boolean method1798(int i, int i_8_, int i_9_, int i_10_) {
		if (((Class168) this).aVector1715.isEmpty())
			return false;
		if (((Class168) this).anInt1720 != i_9_ || (((Class168) this).anInt1721 != i_10_ && (((Class168) this).aClass_ra_Sub3_1717 instanceof Class_ra_Sub3_Sub1))) {
			((Class168) this).anInt1720 = i_9_;
			((Class168) this).anInt1721 = i_10_;
			method1796();
			method1791();
		}
		((Class168) this).aClass52_Sub1_1712.method563(0, ((Class168) this).anInterface8_Impl1_Impl1_1718);
		if (((Class168) this).anInterface8_Impl1_Impl2_1719 != null)
			((Class168) this).aClass52_Sub1_1712.method558(((Class168) this).anInterface8_Impl1_Impl2_1719);
		((Class168) this).aClass_ra_Sub3_1717.method5143(((Class168) this).aClass52_Sub1_1712, (byte) 22);
		((Class168) this).aClass_ra_Sub3_1717.ba(3, -16777216);
		((Class168) this).aClass_ra_Sub3_1717.method5292(15);
		((Class168) this).aClass_ra_Sub3_1717.method5397(0);
		if (!((Class168) this).aClass52_Sub1_1712.method560())
			throw new RuntimeException("");
		((Class168) this).aBoolean1723 = true;
		return true;
	}
}
