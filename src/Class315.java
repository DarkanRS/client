/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class315 {
	static Class336_Sub5 aClass336_Sub5_3304;
	static Class336_Sub4 aClass336_Sub4_3305;
	static short aShort3306;
	static Class336_Sub6 aClass336_Sub6_3307 = new Class336_Sub6();
	static Class336_Sub1 aClass336_Sub1_3308;
	static Class336_Sub2 aClass336_Sub2_3309;
	static Class336_Sub3 aClass336_Sub3_3310;

	Class315() throws Throwable {
		throw new Error();
	}

	static {
		aClass336_Sub4_3305 = new Class336_Sub4();
		aClass336_Sub3_3310 = new Class336_Sub3();
		aClass336_Sub5_3304 = new Class336_Sub5();
		aClass336_Sub1_3308 = new Class336_Sub1();
		aClass336_Sub2_3309 = new Class336_Sub2();
	}

	public static int method3833(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		try {
			if (1 == (i_4_ & 0x1)) {
				int i_6_ = i_2_;
				i_2_ = i_3_;
				i_3_ = i_6_;
			}
			i_1_ &= 0x3;
			if (0 == i_1_)
				return i_0_;
			if (i_1_ == 1)
				return 7 - i - (i_2_ - 1);
			if (i_1_ == 2)
				return 7 - i_0_ - (i_3_ - 1);
			return i;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nd.k(").append(')').toString());
		}
	}

	static final void method3834(SubIncommingPacket class206, short i) {
		try {
			RsBitsBuffer class298_sub53_sub2 = ((BufferedConnectionContext) client.gameConnection).stream;
			if (SubIncommingPacket.aClass206_2347 == class206) {
				int i_7_ = class298_sub53_sub2.readIntV2((byte) 109);
				int i_8_ = class298_sub53_sub2.readUnsignedByte128(-1014855659);
				int i_9_ = i_8_ >> 2;
				int i_10_ = i_8_ & 0x3;
				int i_11_ = client.anIntArray8739[i_9_];
				int i_12_ = class298_sub53_sub2.readUnsignedByteC((short) -10129);
				int i_13_ = 134435705 * Class162.baseTileX + (i_12_ >> 4 & 0x7);
				int i_14_ = (i_12_ & 0x7) + -105526719 * Class216.baseTileY;
				if (client.aClass283_8716.method2674(-586078948) != Class266.aClass266_2846)
					Tradution.method6055(Class375.basePlane * -191892109, i_13_, i_14_, i_11_, i_9_, i_10_, i_7_, -1921538188);
			} else if (SubIncommingPacket.aClass206_2354 == class206) {
				int i_15_ = class298_sub53_sub2.readUnsigned128Byte((byte) 112);
				int i_16_ = i_15_ >> 2;
				int i_17_ = client.anIntArray8739[i_16_];
				int i_18_ = class298_sub53_sub2.readUnsigned128Byte((byte) 92);
				int i_19_ = (i_18_ >> 4 & 0x7) + 134435705 * Class162.baseTileX;
				int i_20_ = (i_18_ & 0x7) + Class216.baseTileY * -105526719;
				int i_21_ = class298_sub53_sub2.readIntLE(-1682120369);
				ObjectDefinitions class432 = client.aClass283_8716.method2641(-527347356).getObjectDefinitions(i_21_);
				int i_22_ = class298_sub53_sub2.readUnsignedByte128(-1014855659);
				if (i_16_ == -1976050083 * Class424.aClass424_6604.anInt6613)
					i_16_ = Class424.aClass424_6611.anInt6613 * -1976050083;
				int i_23_ = 0;
				if (class432.aByteArray5430 != null) {
					int i_24_ = -1;
					for (int i_25_ = 0; i_25_ < class432.aByteArray5430.length; i_25_++) {
						if (i_16_ == class432.aByteArray5430[i_25_]) {
							i_24_ = i_25_;
							break;
						}
					}
					i_23_ = class432.modelIds[i_24_].length;
				}
				int i_26_ = 0;
				if (null != class432.aShortArray5367)
					i_26_ = class432.aShortArray5367.length;
				int i_27_ = 0;
				if (null != class432.aShortArray5373)
					i_27_ = class432.aShortArray5373.length;
				if (1 == (i_22_ & 0x1))
					Class370.method4579(-191892109 * Class375.basePlane, i_19_, i_20_, i_17_, i_21_, i_16_, null, (byte) -43);
				else {
					int[] is = null;
					if ((i_22_ & 0x2) == 2) {
						is = new int[i_23_];
						for (int i_28_ = 0; i_28_ < i_23_; i_28_++)
							is[i_28_] = class298_sub53_sub2.readInt((byte) -37);
					}
					short[] is_29_ = null;
					if (4 == (i_22_ & 0x4)) {
						is_29_ = new short[i_26_];
						for (int i_30_ = 0; i_30_ < i_26_; i_30_++)
							is_29_[i_30_] = (short) class298_sub53_sub2.readUnsignedShort();
					}
					short[] is_31_ = null;
					if (8 == (i_22_ & 0x8)) {
						is_31_ = new short[i_27_];
						for (int i_32_ = 0; i_32_ < i_27_; i_32_++)
							is_31_[i_32_] = (short) class298_sub53_sub2.readUnsignedShort();
					}
					Class370.method4579(-191892109 * Class375.basePlane, i_19_, i_20_, i_17_, i_21_, i_16_, new Class435((Class298_Sub1.aLong7163 * -5796734886992507517L), is, is_29_, is_31_), (byte) 8);
					Class298_Sub1.aLong7163 += 2843605614692854059L;
				}
			} else if (class206 == SubIncommingPacket.DESTROY_OBJECT_PACKET) {
				int i_33_ = class298_sub53_sub2.readUnsignedByteC((short) -27580);
				int i_34_ = i_33_ >> 2;
				int i_35_ = i_33_ & 0x3;
				int i_36_ = client.anIntArray8739[i_34_];
				int i_37_ = class298_sub53_sub2.readUnsignedByte128(-1014855659);
				int i_38_ = (i_37_ >> 4 & 0x7) + 134435705 * Class162.baseTileX;
				int i_39_ = (i_37_ & 0x7) + Class216.baseTileY * -105526719;
				if (client.aClass283_8716.method2674(99999280).method2522((byte) -3) || (i_38_ >= 0 && i_39_ >= 0 && (i_38_ < client.aClass283_8716.method2629(-1871735876)) && (i_39_ < client.aClass283_8716.method2630(-164212893))))
					Class420.method5606(-191892109 * Class375.basePlane, i_38_, i_39_, i_36_, -1, i_34_, i_35_, 322889547);
			} else if (SubIncommingPacket.PROJECTILE_PACKET == class206) {
				int i_40_ = class298_sub53_sub2.readUnsignedByte();
				boolean bool = (i_40_ & 0x80) != 0;
				int i_41_ = Class162.baseTileX * 134435705 + (i_40_ >> 3 & 0x7);
				int i_42_ = (i_40_ & 0x7) + Class216.baseTileY * -105526719;
				int i_43_ = i_41_ + class298_sub53_sub2.readByte(-12558881);
				int i_44_ = i_42_ + class298_sub53_sub2.readByte(-12558881);
				int index = class298_sub53_sub2.readShort(1998351313);
				int i_46_ = class298_sub53_sub2.readUnsignedShort();
				int i_47_ = class298_sub53_sub2.readUnsignedByte() * 4;
				int i_48_ = class298_sub53_sub2.readUnsignedByte() * 4;
				int i_49_ = class298_sub53_sub2.readUnsignedShort();
				int i_50_ = class298_sub53_sub2.readUnsignedShort();
				int i_51_ = class298_sub53_sub2.readUnsignedByte();
				int i_52_ = class298_sub53_sub2.readUnsignedShort();
				if (i_51_ == 255)
					i_51_ = -1;
				if (client.aClass283_8716.method2674(-135283377) != Class266.aClass266_2846) {
					if (i_41_ >= 0 && i_42_ >= 0 && (i_41_ < client.aClass283_8716.method2629(-2115187525)) && i_42_ < client.aClass283_8716.method2630(1222512663) && i_43_ >= 0 && i_44_ >= 0 && (i_43_ < client.aClass283_8716.method2629(-2121627992)) && (i_44_ < client.aClass283_8716.method2630(-2081531222)) && i_46_ != 65535) {
						i_41_ = 256 + 512 * i_41_;
						i_42_ = 256 + 512 * i_42_;
						i_43_ = 256 + i_43_ * 512;
						i_44_ = i_44_ * 512 + 256;
						i_47_ <<= 2;
						i_48_ <<= 2;
						i_52_ <<= 2;
						Class365_Sub1_Sub1_Sub1 class365_sub1_sub1_sub1 = (new Class365_Sub1_Sub1_Sub1(client.aClass283_8716.method2675(-1611682495), i_46_, -191892109 * Class375.basePlane, Class375.basePlane * -191892109, i_41_, i_42_, i_47_, i_49_ + client.anInt8884 * 443738891, client.anInt8884 * 443738891 + i_50_, i_51_, i_52_, 0, index, i_48_, bool, -1));
						class365_sub1_sub1_sub1.method4405(i_43_, i_44_, Class356.method4271(i_43_, i_44_, (-191892109 * Class375.basePlane), -1671970391) - i_48_, 443738891 * client.anInt8884 + i_49_, -53743739);
						client.aClass453_8824.method5935(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1), 719403792);
					}
				}
			} else if (class206 == SubIncommingPacket.SEND_GROUND_ITEM_PACKET) {
				int i_53_ = class298_sub53_sub2.readUnsignedByte128(-1014855659);
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				int i_54_ = (i_53_ & 0x7) + -105526719 * Class216.baseTileY;
				int i_55_ = i_54_ + class341.gameSceneBaseY * 283514611;
				int i_56_ = Class162.baseTileX * 134435705 + (i_53_ >> 4 & 0x7);
				int i_57_ = class341.gameSceneBaseX * -1760580017 + i_56_;
				int i_58_ = class298_sub53_sub2.readUnsignedShortLE128(1478539457);
				int i_59_ = class298_sub53_sub2.readUnsignedShortLE((byte) -118);
				boolean bool = (i_56_ >= 0 && i_54_ >= 0 && i_56_ < client.aClass283_8716.method2629(-2010293889) && (i_54_ < client.aClass283_8716.method2630(-747226515)));
				if (bool || client.aClass283_8716.method2674(131556130).method2522((byte) -65)) {
					Class411.method5576(Class375.basePlane * -191892109, i_57_, i_55_, new Class298_Sub12(i_59_, i_58_), -369193084);
					if (bool)
						Class173.method1820(-191892109 * Class375.basePlane, i_56_, i_54_, 1649431547);
				}
			} else if (class206 == SubIncommingPacket.aClass206_2348) {
				int i_60_ = class298_sub53_sub2.readInt((byte) -12);
				int i_61_ = class298_sub53_sub2.readUnsignedByte();
				client.aClass283_8716.method2641(267585287).getObjectDefinitions(i_60_).method5771(i_61_, (byte) 28);
			} else if (SubIncommingPacket.aClass206_2357 == class206) {
				int i_62_ = class298_sub53_sub2.readUnsignedByte();
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				int i_63_ = -105526719 * Class216.baseTileY + (i_62_ & 0x7);
				int i_64_ = 283514611 * class341.gameSceneBaseY + i_63_;
				int i_65_ = (i_62_ >> 4 & 0x7) + 134435705 * Class162.baseTileX;
				int i_66_ = i_65_ + -1760580017 * class341.gameSceneBaseX;
				int i_67_ = class298_sub53_sub2.readUnsignedShort();
				int i_68_ = class298_sub53_sub2.readUnsignedShort();
				int i_69_ = class298_sub53_sub2.readUnsignedShort();
				if (null != client.groundItems) {
					Class298_Sub2 class298_sub2 = ((Class298_Sub2) (client.groundItems.get((long) (-191892109 * Class375.basePlane << 28 | i_64_ << 14 | i_66_))));
					if (class298_sub2 != null) {
						for (Class298_Sub12 class298_sub12 = ((Class298_Sub12) class298_sub2.aClass453_7166.method5939(1766612795)); null != class298_sub12; class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5944(49146)) {
							if ((class298_sub12.anInt7257 * 1768239597 == (i_67_ & 0x7fff)) && (567630807 * ((Class298_Sub12) class298_sub12).anInt7256 == i_68_)) {
								class298_sub12.unlink(-1460969981);
								((Class298_Sub12) class298_sub12).anInt7256 = i_69_ * -1076181017;
								Class411.method5576((Class375.basePlane * -191892109), i_66_, i_64_, class298_sub12, -2035381169);
								break;
							}
						}
						if (i_65_ >= 0 && i_63_ >= 0 && i_65_ < client.aClass283_8716.method2629(-2131588637) && i_63_ < client.aClass283_8716.method2630(-523876912))
							Class173.method1820((-191892109 * Class375.basePlane), i_65_, i_63_, 1760601086);
					}
				}
			} else if (class206 == SubIncommingPacket.TILE_MESSAGE_PACKET) {
				class298_sub53_sub2.readUnsignedByte();
				int i_70_ = class298_sub53_sub2.readUnsignedByte();
				int i_71_ = (i_70_ >> 4 & 0x7) + Class162.baseTileX * 134435705;
				int i_72_ = (i_70_ & 0x7) + -105526719 * Class216.baseTileY;
				int i_73_ = class298_sub53_sub2.readUnsignedShort();
				int i_74_ = class298_sub53_sub2.readUnsignedByte();
				int i_75_ = class298_sub53_sub2.read24BitUnsignedInteger((byte) -11);
				String string = class298_sub53_sub2.readString(-844550451);
				if (client.aClass283_8716.method2674(1533260419) != Class266.aClass266_2846)
					Class300.method3687(-191892109 * Class375.basePlane, i_71_, i_72_, i_74_, i_73_, i_75_, string, 1332190940);
			} else if (class206 == SubIncommingPacket.SPAWN_OBJECT_PACKET) {
				int i_76_ = class298_sub53_sub2.readUnsignedByte();
				int i_77_ = 134435705 * Class162.baseTileX + (i_76_ >> 4 & 0x7);
				int i_78_ = -105526719 * Class216.baseTileY + (i_76_ & 0x7);
				int i_79_ = class298_sub53_sub2.readUnsignedByte();
				int i_80_ = i_79_ >> 2;
				int i_81_ = i_79_ & 0x3;
				int i_82_ = client.anIntArray8739[i_80_];
				int i_83_ = class298_sub53_sub2.readIntLE(-1674329814);
				if (client.aClass283_8716.method2674(39788259).method2522((byte) 29) || (i_77_ >= 0 && i_78_ >= 0 && (i_77_ < client.aClass283_8716.method2629(-2063854515)) && (i_78_ < client.aClass283_8716.method2630(-1828303048))))
					Class420.method5606(-191892109 * Class375.basePlane, i_77_, i_78_, i_82_, i_83_, i_80_, i_81_, 2010363527);
			} else if (SubIncommingPacket.aClass206_2343 == class206) {
				int i_84_ = class298_sub53_sub2.readUnsignedShort128(1457639602);
				int i_85_ = class298_sub53_sub2.readUnsignedShortLE((byte) 22);
				int i_86_ = class298_sub53_sub2.readUnsignedShort();
				int i_87_ = class298_sub53_sub2.readUnsignedByte();
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				int i_88_ = -105526719 * Class216.baseTileY + (i_87_ & 0x7);
				int i_89_ = class341.gameSceneBaseY * 283514611 + i_88_;
				int i_90_ = Class162.baseTileX * 134435705 + (i_87_ >> 4 & 0x7);
				int i_91_ = -1760580017 * class341.gameSceneBaseX + i_90_;
				if (i_84_ != -442628795 * client.playerIndex) {
					boolean bool = (i_90_ >= 0 && i_88_ >= 0 && i_90_ < client.aClass283_8716.method2629(-2004210913) && i_88_ < client.aClass283_8716.method2630(133385720));
					if (bool || client.aClass283_8716.method2674(1297675002).method2522((byte) -41)) {
						Class411.method5576(-191892109 * Class375.basePlane, i_91_, i_89_, new Class298_Sub12(i_85_, i_86_), 1214818737);
						if (bool)
							Class173.method1820((Class375.basePlane * -191892109), i_90_, i_88_, 1328737922);
					}
				}
			} else if (SubIncommingPacket.aClass206_2346 == class206) {
				int i_92_ = class298_sub53_sub2.readUnsignedByte();
				int i_93_ = 268871410 * Class162.baseTileX + (i_92_ >> 4 & 0xf);
				int i_94_ = -211053438 * Class216.baseTileY + (i_92_ & 0xf);
				int i_95_ = class298_sub53_sub2.readUnsignedByte();
				boolean bool = (i_95_ & 0x1) != 0;
				boolean bool_96_ = (i_95_ & 0x2) != 0;
				int i_97_ = bool_96_ ? i_95_ >> 2 : -1;
				int i_98_ = i_93_ + class298_sub53_sub2.readByte(-12558881);
				int i_99_ = i_94_ + class298_sub53_sub2.readByte(-12558881);
				int i_100_ = class298_sub53_sub2.readShort(1793836109);
				int i_101_ = class298_sub53_sub2.readShort(1964039723);
				int i_102_ = class298_sub53_sub2.readUnsignedShort();
				int i_103_ = class298_sub53_sub2.readUnsignedByte();
				if (bool_96_)
					i_103_ = (byte) i_103_;
				else
					i_103_ *= 4;
				int i_104_ = class298_sub53_sub2.readUnsignedByte() * 4;
				int i_105_ = class298_sub53_sub2.readUnsignedShort();
				int i_106_ = class298_sub53_sub2.readUnsignedShort();
				int i_107_ = class298_sub53_sub2.readUnsignedByte();
				int i_108_ = class298_sub53_sub2.readUnsignedShort();
				if (i_107_ == 255)
					i_107_ = -1;
				if (client.aClass283_8716.method2674(781301439) != Class266.aClass266_2846) {
					if (i_93_ >= 0 && i_94_ >= 0 && i_93_ < client.aClass283_8716.method2629(-2097499815) * 2 && i_94_ < client.aClass283_8716.method2629(-1925634796) * 2 && i_98_ >= 0 && i_99_ >= 0 && i_98_ < client.aClass283_8716.method2630(-2066893296) * 2 && (i_99_ < client.aClass283_8716.method2630(1895360083) * 2) && 65535 != i_102_) {
						i_93_ *= 256;
						i_94_ = 256 * i_94_;
						i_98_ = 256 * i_98_;
						i_99_ *= 256;
						i_103_ <<= 2;
						i_104_ <<= 2;
						i_108_ <<= 2;
						HashTable.method5818(i_102_, i_100_, i_101_, i_97_, i_103_, i_104_, i_93_, i_94_, i_98_, i_99_, i_105_, i_106_, i_107_, i_108_, bool, 618819500);
					}
				}
			} else if (SubIncommingPacket.aClass206_2353 == class206) {
				int i_109_ = class298_sub53_sub2.readUnsignedByte();
				int i_110_ = Class162.baseTileX * 134435705 + (i_109_ >> 4 & 0x7);
				int i_111_ = Class216.baseTileY * -105526719 + (i_109_ & 0x7);
				int i_112_ = class298_sub53_sub2.readUnsignedShort();
				if (65535 == i_112_)
					i_112_ = -1;
				int i_113_ = class298_sub53_sub2.readUnsignedByte();
				int i_114_ = i_113_ >> 4 & 0xf;
				int i_115_ = i_113_ & 0x7;
				int i_116_ = class298_sub53_sub2.readUnsignedByte();
				int i_117_ = class298_sub53_sub2.readUnsignedByte();
				int i_118_ = class298_sub53_sub2.readUnsignedShort();
				if (client.aClass283_8716.method2674(569302746) != Class266.aClass266_2846) {
					if (i_110_ >= 0 && i_111_ >= 0 && (i_110_ < client.aClass283_8716.method2629(-2099610751)) && (i_111_ < client.aClass283_8716.method2630(-358830712))) {
						int i_119_ = 1 + i_114_;
						if ((Class287.myPlayer.scenePositionXQueue[0]) >= i_110_ - i_119_ && (Class287.myPlayer.scenePositionXQueue[0]) <= i_119_ + i_110_ && (Class287.myPlayer.scenePositionYQueue[0]) >= i_111_ - i_119_ && (Class287.myPlayer.scenePositionYQueue[0]) <= i_119_ + i_111_)
							Class69.method789(i_112_, i_115_, i_116_, i_117_, ((-191892109 * Class375.basePlane << 24) + (i_110_ << 16) + (i_111_ << 8) + i_114_), i_118_, -1062229425);
					}
				}
			} else if (class206 == SubIncommingPacket.aClass206_2356) {
				int i_120_ = class298_sub53_sub2.readUnsignedByte();
				int i_121_ = 134435705 * Class162.baseTileX + (i_120_ >> 4 & 0x7);
				int i_122_ = (i_120_ & 0x7) + -105526719 * Class216.baseTileY;
				int i_123_ = class298_sub53_sub2.readUnsignedShort();
				if (i_123_ == 65535)
					i_123_ = -1;
				int i_124_ = class298_sub53_sub2.readUnsignedShort();
				int i_125_ = class298_sub53_sub2.readUnsignedShort();
				int i_126_ = class298_sub53_sub2.readUnsignedByte();
				if (client.aClass283_8716.method2674(1544127575) != Class266.aClass266_2846) {
					if (i_121_ >= 0 && i_122_ >= 0 && (i_121_ < client.aClass283_8716.method2629(-2060803867)) && (i_122_ < client.aClass283_8716.method2630(210266167))) {
						if (-1 == i_123_) {
							Class298_Sub37_Sub3 class298_sub37_sub3 = ((Class298_Sub37_Sub3) (client.aClass437_8825.get((long) (i_121_ << 16 | i_122_))));
							if (class298_sub37_sub3 != null) {
								((Class298_Sub37_Sub3) class298_sub37_sub3).aClass365_Sub1_Sub1_Sub3_9578.method4480((byte) 26);
								class298_sub37_sub3.unlink(-1460969981);
							}
						} else {
							int i_127_ = 256 + i_121_ * 512;
							int i_128_ = i_122_ * 512 + 256;
							int i_129_ = Class375.basePlane * -191892109;
							if (i_129_ < 3 && client.aClass283_8716.method2654(1627070231).method2320(i_121_, i_122_, 575492228))
								i_129_++;
							Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (new Class365_Sub1_Sub1_Sub3(client.aClass283_8716.method2675(-1611682495), i_123_, i_125_, -191892109 * Class375.basePlane, i_129_, i_127_, Class356.method4271(i_127_, i_128_, (Class375.basePlane * -191892109), -1861382449) - i_124_, i_128_, i_121_, i_121_, i_122_, i_122_, i_126_, false));
							client.aClass437_8825.method5817((new Class298_Sub37_Sub3(class365_sub1_sub1_sub3)), (long) (i_121_ << 16 | i_122_));
						}
					}
				}
			} else if (SubIncommingPacket.aClass206_2342 == class206) {
				int i_130_ = class298_sub53_sub2.readUnsignedByte();
				int i_131_ = (i_130_ >> 4 & 0x7) + 134435705 * Class162.baseTileX;
				int i_132_ = (i_130_ & 0x7) + -105526719 * Class216.baseTileY;
				int i_133_ = class298_sub53_sub2.readUnsignedShort();
				if (65535 == i_133_)
					i_133_ = -1;
				int i_134_ = class298_sub53_sub2.readUnsignedByte();
				int i_135_ = i_134_ >> 4 & 0xf;
				int i_136_ = i_134_ & 0x7;
				int i_137_ = class298_sub53_sub2.readUnsignedByte();
				int i_138_ = class298_sub53_sub2.readUnsignedByte();
				int i_139_ = class298_sub53_sub2.readUnsignedShort();
				boolean bool = class298_sub53_sub2.readUnsignedByte() == 1;
				if (client.aClass283_8716.method2674(39884684) != Class266.aClass266_2846) {
					if (i_131_ >= 0 && i_132_ >= 0 && (i_131_ < client.aClass283_8716.method2629(-2049168352)) && (i_132_ < client.aClass283_8716.method2630(91496889))) {
						int i_140_ = i_135_ + 1;
						if ((Class287.myPlayer.scenePositionXQueue[0]) >= i_131_ - i_140_ && (Class287.myPlayer.scenePositionXQueue[0]) <= i_140_ + i_131_ && (Class287.myPlayer.scenePositionYQueue[0]) >= i_132_ - i_140_ && (Class287.myPlayer.scenePositionYQueue[0]) <= i_140_ + i_132_)
							Class336_Sub4.method4103(i_133_, i_136_, i_137_, i_138_, ((i_131_ << 16) + ((-191892109 * Class375.basePlane) << 24) + (i_132_ << 8) + i_135_), bool, i_139_, -889648047);
					}
				}
			} else if (class206 == SubIncommingPacket.REMOVE_GROUND_ITEM_PACKET) {
				int i_141_ = class298_sub53_sub2.readUnsignedShortLE((byte) 67);
				int i_142_ = class298_sub53_sub2.readUnsigned128Byte((byte) 68);
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				int i_143_ = Class216.baseTileY * -105526719 + (i_142_ & 0x7);
				int i_144_ = 283514611 * class341.gameSceneBaseY + i_143_;
				int i_145_ = 134435705 * Class162.baseTileX + (i_142_ >> 4 & 0x7);
				int i_146_ = i_145_ + -1760580017 * class341.gameSceneBaseX;
				Class298_Sub2 class298_sub2 = ((Class298_Sub2) (client.groundItems.get((long) (Class375.basePlane * -191892109 << 28 | i_144_ << 14 | i_146_))));
				if (class298_sub2 != null) {
					for (Class298_Sub12 class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5939(1766612795); class298_sub12 != null; class298_sub12 = (Class298_Sub12) class298_sub2.aClass453_7166.method5944(49146)) {
						if ((i_141_ & 0x7fff) == class298_sub12.anInt7257 * 1768239597) {
							class298_sub12.unlink(-1460969981);
							break;
						}
					}
					if (class298_sub2.aClass453_7166.method5946(-1293494081))
						class298_sub2.unlink(-1460969981);
					if (i_145_ >= 0 && i_143_ >= 0 && (i_145_ < client.aClass283_8716.method2629(-1929078790)) && (i_143_ < client.aClass283_8716.method2630(-999181271)))
						Class173.method1820(Class375.basePlane * -191892109, i_145_, i_143_, 547814341);
				}
			} else {
				Class464.method6062(new StringBuilder().append("").append(class206).toString(), new RuntimeException(), (short) -20731);
				Class216.method2001(false, (byte) 28);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nd.jh(").append(')').toString());
		}
	}

	static void method3835(int i, int i_147_, int i_148_, int i_149_, int i_150_, byte i_151_) {
		try {
			if (i_148_ <= Class372_Sub3.anInt4050 * -1062447355 && i_149_ >= 1155384281 * Class372_Sub3.anInt4049) {
				boolean bool;
				if (i < Class372_Sub3.anInt4051 * -1424479739) {
					i = Class372_Sub3.anInt4051 * -1424479739;
					bool = false;
				} else if (i > Class372_Sub3.anInt4048 * 1135094847) {
					i = 1135094847 * Class372_Sub3.anInt4048;
					bool = false;
				} else
					bool = true;
				boolean bool_152_;
				if (i_147_ < -1424479739 * Class372_Sub3.anInt4051) {
					i_147_ = -1424479739 * Class372_Sub3.anInt4051;
					bool_152_ = false;
				} else if (i_147_ > Class372_Sub3.anInt4048 * 1135094847) {
					i_147_ = 1135094847 * Class372_Sub3.anInt4048;
					bool_152_ = false;
				} else
					bool_152_ = true;
				if (i_148_ >= Class372_Sub3.anInt4049 * 1155384281)
					Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_148_++]), i, i_147_, i_150_, -1668539966);
				else
					i_148_ = Class372_Sub3.anInt4049 * 1155384281;
				if (i_149_ <= -1062447355 * Class372_Sub3.anInt4050)
					Class82_Sub22.method940((Class372_Sub3.anIntArrayArray4047[i_149_--]), i, i_147_, i_150_, 172166528);
				else
					i_149_ = -1062447355 * Class372_Sub3.anInt4050;
				if (bool && bool_152_) {
					for (int i_153_ = i_148_; i_153_ <= i_149_; i_153_++) {
						int[] is = Class372_Sub3.anIntArrayArray4047[i_153_];
						is[i] = is[i_147_] = i_150_;
					}
				} else if (bool) {
					for (int i_154_ = i_148_; i_154_ <= i_149_; i_154_++)
						Class372_Sub3.anIntArrayArray4047[i_154_][i] = i_150_;
				} else if (bool_152_) {
					for (int i_155_ = i_148_; i_155_ <= i_149_; i_155_++)
						Class372_Sub3.anIntArrayArray4047[i_155_][i_147_] = i_150_;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nd.h(").append(')').toString());
		}
	}

	static final void method3836(int i, int i_156_, int i_157_, int i_158_, int i_159_, int i_160_, byte i_161_) {
		try {
			Class97.method1041(i_157_, 1637585593);
			int i_162_ = 0;
			int i_163_ = i_157_ - i_160_;
			if (i_163_ < 0)
				i_163_ = 0;
			int i_164_ = i_157_;
			int i_165_ = -i_157_;
			int i_166_ = i_163_;
			int i_167_ = -i_163_;
			int i_168_ = -1;
			int i_169_ = -1;
			if (i_156_ >= Class372_Sub1.anInt4049 * 1155384281 && i_156_ <= Class372_Sub1.anInt4050 * -1062447355) {
				int[] is = Class372_Sub1.anIntArrayArray4047[i_156_];
				int i_170_ = Class463.method6012(i - i_157_, (-1424479739 * Class372_Sub1.anInt4051), 1135094847 * Class372_Sub1.anInt4048, -1212608691);
				int i_171_ = Class463.method6012(i + i_157_, (Class372_Sub1.anInt4051 * -1424479739), 1135094847 * Class372_Sub1.anInt4048, -1212608691);
				int i_172_ = Class463.method6012(i - i_163_, (-1424479739 * Class372_Sub1.anInt4051), Class372_Sub1.anInt4048 * 1135094847, -1212608691);
				int i_173_ = Class463.method6012(i + i_163_, (Class372_Sub1.anInt4051 * -1424479739), 1135094847 * Class372_Sub1.anInt4048, -1212608691);
				Class82_Sub22.method940(is, i_170_, i_172_, i_159_, 1255708006);
				Class82_Sub22.method940(is, i_172_, i_173_, i_158_, -1330979432);
				Class82_Sub22.method940(is, i_173_, i_171_, i_159_, 173830974);
			}
			while (i_164_ > i_162_) {
				i_168_ += 2;
				i_169_ += 2;
				i_165_ += i_168_;
				i_167_ += i_169_;
				if (i_167_ >= 0 && i_166_ >= 1) {
					i_166_--;
					i_167_ -= i_166_ << 1;
					Class372_Sub1.anIntArray7727[i_166_] = i_162_;
				}
				i_162_++;
				if (i_165_ >= 0) {
					i_164_--;
					i_165_ -= i_164_ << 1;
					int i_174_ = i_156_ - i_164_;
					int i_175_ = i_156_ + i_164_;
					if (i_175_ >= Class372_Sub1.anInt4049 * 1155384281 && i_174_ <= -1062447355 * Class372_Sub1.anInt4050) {
						if (i_164_ >= i_163_) {
							int i_176_ = (Class463.method6012(i_162_ + i, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048, -1212608691));
							int i_177_ = (Class463.method6012(i - i_162_, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048, -1212608691));
							if (i_175_ <= -1062447355 * Class372_Sub1.anInt4050)
								Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_175_]), i_177_, i_176_, i_159_, -587973246);
							if (i_174_ >= 1155384281 * Class372_Sub1.anInt4049)
								Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_174_]), i_177_, i_176_, i_159_, 458640866);
						} else {
							int i_178_ = Class372_Sub1.anIntArray7727[i_164_];
							int i_179_ = (Class463.method6012(i_162_ + i, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048, -1212608691));
							int i_180_ = Class463.method6012(i - i_162_, (Class372_Sub1.anInt4051 * -1424479739), (Class372_Sub1.anInt4048 * 1135094847), -1212608691);
							int i_181_ = Class463.method6012(i_178_ + i, (Class372_Sub1.anInt4051 * -1424479739), (Class372_Sub1.anInt4048 * 1135094847), -1212608691);
							int i_182_ = (Class463.method6012(i - i_178_, -1424479739 * Class372_Sub1.anInt4051, 1135094847 * Class372_Sub1.anInt4048, -1212608691));
							if (i_175_ <= Class372_Sub1.anInt4050 * -1062447355) {
								int[] is = (Class372_Sub1.anIntArrayArray4047[i_175_]);
								Class82_Sub22.method940(is, i_180_, i_182_, i_159_, -328560892);
								Class82_Sub22.method940(is, i_182_, i_181_, i_158_, 859736172);
								Class82_Sub22.method940(is, i_181_, i_179_, i_159_, -1686922326);
							}
							if (i_174_ >= 1155384281 * Class372_Sub1.anInt4049) {
								int[] is = (Class372_Sub1.anIntArrayArray4047[i_174_]);
								Class82_Sub22.method940(is, i_180_, i_182_, i_159_, 1196048570);
								Class82_Sub22.method940(is, i_182_, i_181_, i_158_, -427208666);
								Class82_Sub22.method940(is, i_181_, i_179_, i_159_, 1638963838);
							}
						}
					}
				}
				int i_183_ = i_156_ - i_162_;
				int i_184_ = i_156_ + i_162_;
				if (i_184_ >= Class372_Sub1.anInt4049 * 1155384281 && i_183_ <= -1062447355 * Class372_Sub1.anInt4050) {
					int i_185_ = i_164_ + i;
					int i_186_ = i - i_164_;
					if (i_185_ >= -1424479739 * Class372_Sub1.anInt4051 && i_186_ <= 1135094847 * Class372_Sub1.anInt4048) {
						i_185_ = Class463.method6012(i_185_, (-1424479739 * Class372_Sub1.anInt4051), (1135094847 * Class372_Sub1.anInt4048), -1212608691);
						i_186_ = Class463.method6012(i_186_, (Class372_Sub1.anInt4051 * -1424479739), (Class372_Sub1.anInt4048 * 1135094847), -1212608691);
						if (i_162_ < i_163_) {
							int i_187_ = (i_166_ < i_162_ ? Class372_Sub1.anIntArray7727[i_162_] : i_166_);
							int i_188_ = (Class463.method6012(i + i_187_, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048, -1212608691));
							int i_189_ = (Class463.method6012(i - i_187_, -1424479739 * Class372_Sub1.anInt4051, Class372_Sub1.anInt4048 * 1135094847, -1212608691));
							if (i_184_ <= Class372_Sub1.anInt4050 * -1062447355) {
								int[] is = (Class372_Sub1.anIntArrayArray4047[i_184_]);
								Class82_Sub22.method940(is, i_186_, i_189_, i_159_, -1634458137);
								Class82_Sub22.method940(is, i_189_, i_188_, i_158_, -656430266);
								Class82_Sub22.method940(is, i_188_, i_185_, i_159_, -455567963);
							}
							if (i_183_ >= Class372_Sub1.anInt4049 * 1155384281) {
								int[] is = (Class372_Sub1.anIntArrayArray4047[i_183_]);
								Class82_Sub22.method940(is, i_186_, i_189_, i_159_, -1604708462);
								Class82_Sub22.method940(is, i_189_, i_188_, i_158_, 603923181);
								Class82_Sub22.method940(is, i_188_, i_185_, i_159_, 1400336613);
							}
						} else {
							if (i_184_ <= Class372_Sub1.anInt4050 * -1062447355)
								Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_184_]), i_186_, i_185_, i_159_, -2102947655);
							if (i_183_ >= Class372_Sub1.anInt4049 * 1155384281)
								Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_183_]), i_186_, i_185_, i_159_, -372087596);
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nd.q(").append(')').toString());
		}
	}

	public static final boolean method3837(byte i) {
		try {
			return Class360.anInt3896 * -707576455 != 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nd.k(").append(')').toString());
		}
	}

	public static void method3838(int i, int i_190_) {
		try {
			Class521.anInt6282 = -1444280763 * i;
			Class298_Sub50_Sub2.aClass298_Sub50_Sub2Array9770 = new Class298_Sub50_Sub2[i];
			Class446.anInt5614 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("nd.ad(").append(')').toString());
		}
	}
}
