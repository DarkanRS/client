/* Class397 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class397 implements Interface38 {
	public static Class397 aClass397_4792;
	public static Class397 aClass397_4793;
	public static Class397 aClass397_4794;
	public static Class397 aClass397_4795;
	public static Class397 aClass397_4796;
	public static Class397 aClass397_4797;
	public static Class397 aClass397_4798;
	public static Class397 aClass397_4799;
	public static Class397 aClass397_4800;
	public static Class397 aClass397_4801 = new Class397("", 10);
	public int anInt4802;
	public static Class397 aClass397_4803;
	public static Class397 aClass397_4804;
	public static Class397 aClass397_4805;
	public static Class397 aClass397_4806;
	public static Class397 aClass397_4807;
	public static Class397 aClass397_4808;
	public static Class397 aClass397_4809;
	static Class397 aClass397_4810;
	static Class397 aClass397_4811;
	public static Class397 aClass397_4812;
	
	Class397(String string, int i) {
		anInt4802 = -983311285 * i;
	}

	static {
		aClass397_4793 = new Class397("", 11);
		aClass397_4794 = new Class397("", 12);
		aClass397_4795 = new Class397("", 13);
		aClass397_4796 = new Class397("", 14);
		aClass397_4797 = new Class397("", 15);
		aClass397_4798 = new Class397("", 16);
		aClass397_4805 = new Class397("", 17);
		aClass397_4800 = new Class397("", 18);
		aClass397_4812 = new Class397("", 19);
		aClass397_4792 = new Class397("", 20);
		aClass397_4803 = new Class397("", 21);
		aClass397_4804 = new Class397("", 22);
		aClass397_4806 = new Class397("", 23);
		aClass397_4799 = new Class397("", 24);
		aClass397_4807 = new Class397("", 25);
		aClass397_4808 = new Class397("", 26);
		aClass397_4809 = new Class397("", 27);
		aClass397_4810 = new Class397("", 73);
		aClass397_4811 = new Class397("", 76);
	}

	public static void method6775(int i, int i_0_, int i_1_, int i_2_, ObjectDefinitions class478, NPC class521_sub1_sub1_sub2_sub2, Player class521_sub1_sub1_sub2_sub1, int i_3_) {
		Class282_Sub48 class282_sub48 = new Class282_Sub48();
		((Class282_Sub48) class282_sub48).anInt8076 = 1589843113 * i;
		((Class282_Sub48) class282_sub48).anInt8107 = (i_0_ << 9) * 80768833;
		((Class282_Sub48) class282_sub48).anInt8078 = 1225707357 * (i_1_ << 9);
		if (class478 != null) {
			((Class282_Sub48) class282_sub48).aClass478_8104 = class478;
			int i_4_ = class478.anInt5648 * -752356381;
			int i_5_ = -1610844647 * class478.anInt5649;
			if (1 == i_2_ || i_2_ == 3) {
				i_4_ = class478.anInt5649 * -1610844647;
				i_5_ = class478.anInt5648 * -752356381;
			}
			((Class282_Sub48) class282_sub48).anInt8079 = (i_4_ + i_0_ << 9) * 1480845005;
			((Class282_Sub48) class282_sub48).anInt8077 = (i_5_ + i_1_ << 9) * 1710236473;
			((Class282_Sub48) class282_sub48).anInt8095 = -516170849 * class478.anInt5653;
			((Class282_Sub48) class282_sub48).aBool8098 = class478.aBool5696;
			((Class282_Sub48) class282_sub48).anInt8105 = (-983013495 * class478.anInt5693 << 9) * 1837689437;
			((Class282_Sub48) class282_sub48).anInt8089 = 1174101755 * class478.anInt5695;
			((Class282_Sub48) class282_sub48).anInt8072 = class478.anInt5667 * 1036400279;
			((Class282_Sub48) class282_sub48).anInt8101 = -1954755723 * class478.anInt5698;
			((Class282_Sub48) class282_sub48).anIntArray8102 = class478.anIntArray5688;
			((Class282_Sub48) class282_sub48).aBool8103 = class478.aBool5700;
			((Class282_Sub48) class282_sub48).anInt8094 = class478.anInt5709 * 1144293369;
			((Class282_Sub48) class282_sub48).anInt8093 = class478.anInt5708 * 1225461397;
			((Class282_Sub48) class282_sub48).anInt8081 = 1624181085 * (class478.anInt5694 * -1702005631 << 9);
			if (null != class478.anIntArray5650) {
				((Class282_Sub48) class282_sub48).aBool8092 = true;
				class282_sub48.method13426((byte) 1);
			}
			if (null != ((Class282_Sub48) class282_sub48).anIntArray8102)
				((Class282_Sub48) class282_sub48).anInt8080 = (1317424347 * ((Class282_Sub48) class282_sub48).anInt8072 + (int) (Math.random() * (double) (-1084771983 * (((Class282_Sub48) class282_sub48).anInt8101) - (((Class282_Sub48) class282_sub48).anInt8072 * 1317424347)))) * 401671005;
			Class282_Sub48.aClass482_8073.append(class282_sub48, -427234199);
		} else if (class521_sub1_sub1_sub2_sub2 != null) {
			((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub2_8085 = class521_sub1_sub1_sub2_sub2;
			NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
			if (null != class409.anIntArray4886) {
				((Class282_Sub48) class282_sub48).aBool8092 = true;
				class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
			}
			if (class409 != null) {
				((Class282_Sub48) class282_sub48).anInt8079 = 1480845005 * (1203434505 * class409.anInt4858 + i_0_ << 9);
				((Class282_Sub48) class282_sub48).anInt8077 = 1710236473 * (class409.anInt4858 * 1203434505 + i_1_ << 9);
				((Class282_Sub48) class282_sub48).anInt8095 = (Class282_Sub11_Sub1.method15433(class521_sub1_sub1_sub2_sub2, 912866554)) * -569710251;
				((Class282_Sub48) class282_sub48).aBool8098 = class409.aBool4872;
				((Class282_Sub48) class282_sub48).anInt8105 = (877155897 * class409.anInt4907 << 9) * 1837689437;
				((Class282_Sub48) class282_sub48).anInt8089 = class409.anInt4909 * 51937289;
				((Class282_Sub48) class282_sub48).anInt8094 = class409.anInt4919 * 367163663;
				((Class282_Sub48) class282_sub48).anInt8093 = 779306973 * class409.anInt4911;
				((Class282_Sub48) class282_sub48).anInt8081 = 1624181085 * (class409.anInt4908 * 1412189553 << 9);
			}
			Class282_Sub48.aClass482_8074.append(class282_sub48, 1710217984);
		} else if (null != class521_sub1_sub1_sub2_sub1) {
			((Class282_Sub48) class282_sub48).aClass521_Sub1_Sub1_Sub2_Sub1_8086 = class521_sub1_sub1_sub2_sub1;
			((Class282_Sub48) class282_sub48).anInt8079 = (i_0_ + class521_sub1_sub1_sub2_sub1.method15805(828768449) << 9) * 1480845005;
			((Class282_Sub48) class282_sub48).anInt8077 = (i_1_ + class521_sub1_sub1_sub2_sub1.method15805(828768449) << 9) * 1710236473;
			((Class282_Sub48) class282_sub48).anInt8095 = Class149_Sub2.method14610(class521_sub1_sub1_sub2_sub1, 1888639983) * -569710251;
			((Class282_Sub48) class282_sub48).aBool8098 = class521_sub1_sub1_sub2_sub1.isTransformedNPC;
			((Class282_Sub48) class282_sub48).anInt8105 = (1837689437 * (1304574447 * class521_sub1_sub1_sub2_sub1.isNpc << 9));
			((Class282_Sub48) class282_sub48).anInt8089 = -1517226111 * class521_sub1_sub1_sub2_sub1.anInt10566;
			((Class282_Sub48) class282_sub48).anInt8094 = 1769645824;
			((Class282_Sub48) class282_sub48).anInt8093 = 211241216;
			((Class282_Sub48) class282_sub48).anInt8081 = 0;
			Class282_Sub48.aClass465_8075.method7765(class282_sub48, (long) (-1691508299 * class521_sub1_sub1_sub2_sub1.anInt10314));
		}
	}

	static final void method6776(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class174.method2955(class118, class98, class527, (byte) 0);
	}
}
