/* Class82_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub11 extends Class82 {
	int anInt6859;
	String aString6860;
	static Class57[] aClass57Array6861;

	public void method866(int i) {
		try {
			if (577335585 * client.anInt8870 != -1)
				Class70.method803(577335585 * client.anInt8870, ((Class82_Sub11) this).aString6860, 607881685 * ((Class82_Sub11) this).anInt6859, 2017220990);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xx.f(").append(')').toString());
		}
	}

	Class82_Sub11(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub11) this).aString6860 = class298_sub53.readString(919568963);
		((Class82_Sub11) this).anInt6859 = class298_sub53.readUnsignedShort() * -602577027;
	}

	public void method868() {
		if (577335585 * client.anInt8870 != -1)
			Class70.method803(577335585 * client.anInt8870, ((Class82_Sub11) this).aString6860, 607881685 * ((Class82_Sub11) this).anInt6859, 1486270976);
	}

	public void method869() {
		if (577335585 * client.anInt8870 != -1)
			Class70.method803(577335585 * client.anInt8870, ((Class82_Sub11) this).aString6860, 607881685 * ((Class82_Sub11) this).anInt6859, 1478832260);
	}

	public static final void method906(int i) {
		try {
			for (int i_0_ = 0; i_0_ < 5; i_0_++)
				client.aBooleanArray8684[i_0_] = false;
			client.anInt8768 = -1723181617;
			client.anInt8769 = 2694169;
			Class128_Sub1.anInt8556 = 0;
			Class427.anInt5362 = 0;
			Class298_Sub1.anInt7164 = 1355934404;
			Class418.anInt5339 = -1001372047;
			Class100.anInt1081 = 178575833;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xx.hg(").append(')').toString());
		}
	}

	static void method907(GraphicsToolkit class_ra, int i) {
		try {
			int i_1_ = Class88.anInt806 * -1347746885;
			int i_2_ = Class302_Sub4.anInt7658 * 1089948687;
			int i_3_ = 608683427 * Class134.anInt6343;
			int i_4_ = 1396607435 * Class448.anInt5619 - 3;
			int i_5_ = 20;
			if (null == Class65.aClass264_664 || null == Class211.aClass505_2420) {
				Class65.aClass264_664 = (Class264) (Class497.aClass197_6105.method1883(client.anInterface10_8700, Class242.anInt2710 * -2085188617, true, true, -2063324548));
				Class211.aClass505_2420 = (Class497.aClass197_6105.method1879(client.anInterface10_8700, -2085188617 * Class242.anInt2710, -203887938));
				if (Class65.aClass264_664 != null && Class211.aClass505_2420 != null) {
					Class194.method1868(2025307040);
					int i_6_ = i_1_ + i_3_ / 2;
					if (i_3_ + i_6_ > Class462.anInt5683 * -2110394505)
						i_6_ = Class462.anInt5683 * -2110394505 - i_3_;
					if (i_6_ < 0)
						i_6_ = 0;
					Class110.method1226(i_6_, Class302_Sub4.anInt7658 * 1089948687, (byte) 34);
					return;
				}
			}
			Class264 class264;
			if (Class65.aClass264_664 == null || Class211.aClass505_2420 == null)
				class264 = Class101.aClass264_1084;
			else
				class264 = Class65.aClass264_664;
			Class505 class505 = Class142.method1571(-2117423030);
			Class319.method3900(class_ra, Class88.anInt806 * -1347746885, 1089948687 * Class302_Sub4.anInt7658, 608683427 * Class134.anInt6343, Class448.anInt5619 * 1396607435, i_5_, class264, class505, Tradution.aClass470_5907.method6049(Class321.aClass429_3357, -875414210), 1493499179);
			int i_7_ = (255 - Class436.anInt5484 * 597392981 - 1868123923 * Class436.anInt5498);
			if (i_7_ < 0)
				i_7_ = 0;
			int i_8_ = Class165.recorder.getMouseX((byte) -89);
			int i_9_ = Class165.recorder.getMouseY((byte) 17);
			if (!Class436.aBoolean5471) {
				int i_10_ = 0;
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5939(1766612795)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5944(49146))) {
					int i_11_ = (1 + (class505.anInt6202 * 1110385787 + (i_5_ + i_2_)) + ((-278777595 * Class436.anInt5506 - 1 - i_10_) * (-411680299 * Class436.anInt5467)));
					if (i_8_ > -1347746885 * Class88.anInt806 && i_8_ < (608683427 * Class134.anInt6343 + -1347746885 * Class88.anInt806) && i_9_ > i_11_ - class505.anInt6202 * 1110385787 - 1 && i_9_ < i_11_ + class505.anInt6197 * -1883958527 && (((Class298_Sub37_Sub15) class298_sub37_sub15).aBoolean9664))
						class_ra.B(-1347746885 * Class88.anInt806, i_11_ - class505.anInt6202 * 1110385787, 608683427 * Class134.anInt6343, Class436.anInt5467 * -411680299, i_7_ << 24 | 427035573 * Class313.anInt3297, 1);
					i_10_++;
				}
			} else {
				int i_12_ = 0;
				for (Class298_Sub37_Sub5 class298_sub37_sub5 = ((Class298_Sub37_Sub5) Class436.aClass461_5482.method5984(324606134)); null != class298_sub37_sub5; class298_sub37_sub5 = ((Class298_Sub37_Sub5) Class436.aClass461_5482.method5985(2083970273))) {
					int i_13_ = (i_12_ * (Class436.anInt5467 * -411680299) + (class505.anInt6202 * 1110385787 + (i_5_ + i_2_) + 1));
					if (i_8_ > Class88.anInt806 * -1347746885 && i_8_ < (Class134.anInt6343 * 608683427 + -1347746885 * Class88.anInt806) && i_9_ > i_13_ - class505.anInt6202 * 1110385787 - 1 && i_9_ < i_13_ + class505.anInt6197 * -1883958527 && (-628325139 * ((Class298_Sub37_Sub5) class298_sub37_sub5).anInt9583 > 1 || ((Class298_Sub37_Sub15) (Class298_Sub37_Sub15) (((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.aClass298_Sub37_5679.aClass298_Sub37_7405)).aBoolean9664))
						class_ra.B(Class88.anInt806 * -1347746885, i_13_ - class505.anInt6202 * 1110385787, Class134.anInt6343 * 608683427, Class436.anInt5467 * -411680299, i_7_ << 24 | Class313.anInt3297 * 427035573, 1);
					i_12_++;
				}
				if (Class436.aClass298_Sub37_Sub5_5472 != null) {
					Class319.method3900(class_ra, 805710735 * Class461.anInt5681, -1370784315 * Class501.anInt6119, 2054409059 * Class420.anInt5345, -1855216229 * Class389.anInt4166, i_5_, class264, class505, (((Class298_Sub37_Sub5) Class436.aClass298_Sub37_Sub5_5472).aString9585), -1919103988);
					i_12_ = 0;
					for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) Class436.aClass298_Sub37_Sub5_5472).aClass461_9584.method5984(473884533)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) Class436.aClass298_Sub37_Sub5_5472).aClass461_9584.method5985(1876214432))) {
						int i_14_ = (1 + (Class501.anInt6119 * -1370784315 + i_5_ + 1110385787 * class505.anInt6202) + -411680299 * Class436.anInt5467 * i_12_);
						if (i_8_ > 805710735 * Class461.anInt5681 && i_8_ < (Class461.anInt5681 * 805710735 + Class420.anInt5345 * 2054409059) && (i_9_ > i_14_ - 1110385787 * class505.anInt6202 - 1) && i_9_ < i_14_ + class505.anInt6197 * -1883958527 && (((Class298_Sub37_Sub15) class298_sub37_sub15).aBoolean9664))
							class_ra.B(805710735 * Class461.anInt5681, i_14_ - 1110385787 * class505.anInt6202, Class420.anInt5345 * 2054409059, Class436.anInt5467 * -411680299, (i_7_ << 24 | Class313.anInt3297 * 427035573), 1);
						i_12_++;
					}
					Class247.method2372(class_ra, 805710735 * Class461.anInt5681, -1370784315 * Class501.anInt6119, 2054409059 * Class420.anInt5345, -1855216229 * Class389.anInt4166, i_5_, 2145329590);
				}
			}
			Class247.method2372(class_ra, -1347746885 * Class88.anInt806, Class302_Sub4.anInt7658 * 1089948687, 608683427 * Class134.anInt6343, 1396607435 * Class448.anInt5619, i_5_, 2136796856);
			if (!Class436.aBoolean5471) {
				int i_15_ = 0;
				for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5939(1766612795)); class298_sub37_sub15 != null; class298_sub37_sub15 = ((Class298_Sub37_Sub15) Class436.aClass453_5480.method5944(49146))) {
					int i_16_ = (1110385787 * class505.anInt6202 + (i_5_ + i_2_) + 1 + ((Class436.anInt5506 * -278777595 - 1 - i_15_) * (Class436.anInt5467 * -411680299)));
					GraphicsToolkit.method5192(i_8_, i_9_, i_1_, i_2_, i_3_, i_4_, i_16_, class298_sub37_sub15, class264, class505, (-1067973831 * Class343.anInt3674 | ~0xffffff), 1697857463 * (Class298_Sub40_Sub2.anInt9693) | ~0xffffff, 549127677);
					i_15_++;
				}
			} else {
				int i_17_ = 0;
				for (Class298_Sub37_Sub5 class298_sub37_sub5 = ((Class298_Sub37_Sub5) Class436.aClass461_5482.method5984(-476899641)); null != class298_sub37_sub5; class298_sub37_sub5 = ((Class298_Sub37_Sub5) Class436.aClass461_5482.method5985(81519453))) {
					int i_18_ = (-411680299 * Class436.anInt5467 * i_17_ + (1 + (i_5_ + 1089948687 * Class302_Sub4.anInt7658 + 1110385787 * class505.anInt6202)));
					if ((((Class298_Sub37_Sub5) class298_sub37_sub5).anInt9583 * -628325139) == 1)
						GraphicsToolkit.method5192(i_8_, i_9_, Class88.anInt806 * -1347746885, Class302_Sub4.anInt7658 * 1089948687, Class134.anInt6343 * 608683427, Class448.anInt5619 * 1396607435, i_18_, ((Class298_Sub37_Sub15) (((Class298_Sub37_Sub5) class298_sub37_sub5).aClass461_9584.aClass298_Sub37_5679.aClass298_Sub37_7405)), class264, class505, Class343.anInt3674 * -1067973831 | ~0xffffff, (Class298_Sub40_Sub2.anInt9693 * 1697857463 | ~0xffffff), 579895839);
					else
						Class66.method763(i_8_, i_9_, Class88.anInt806 * -1347746885, 1089948687 * Class302_Sub4.anInt7658, 608683427 * Class134.anInt6343, 1396607435 * Class448.anInt5619, i_18_, class298_sub37_sub5, class264, class505, -1067973831 * Class343.anInt3674 | ~0xffffff, (1697857463 * Class298_Sub40_Sub2.anInt9693 | ~0xffffff), (byte) -36);
					i_17_++;
				}
				if (Class436.aClass298_Sub37_Sub5_5472 != null) {
					i_17_ = 0;
					for (Class298_Sub37_Sub15 class298_sub37_sub15 = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) Class436.aClass298_Sub37_Sub5_5472).aClass461_9584.method5984(45096692)); null != class298_sub37_sub15; class298_sub37_sub15 = ((Class298_Sub37_Sub15) ((Class298_Sub37_Sub5) Class436.aClass298_Sub37_Sub5_5472).aClass461_9584.method5985(1092020370))) {
						int i_19_ = (i_17_ * (Class436.anInt5467 * -411680299) + (1 + (class505.anInt6202 * 1110385787 + (Class501.anInt6119 * -1370784315 + i_5_))));
						GraphicsToolkit.method5192(i_8_, i_9_, 805710735 * Class461.anInt5681, Class501.anInt6119 * -1370784315, 2054409059 * Class420.anInt5345, -1855216229 * Class389.anInt4166, i_19_, class298_sub37_sub15, class264, class505, (Class343.anInt3674 * -1067973831 | ~0xffffff), (Class298_Sub40_Sub2.anInt9693 * 1697857463) | ~0xffffff, -316918375);
						i_17_++;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xx.bd(").append(')').toString());
		}
	}

	static final void method908(ClientScript2 class403, byte i) {
		try {
			IComponentDefinition.method1135((((ClientScript2) class403).aClass365_Sub1_Sub4_Sub1_5253), class403, -1596344570);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xx.aph(").append(')').toString());
		}
	}
}
