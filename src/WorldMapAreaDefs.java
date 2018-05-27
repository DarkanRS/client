import java.util.Arrays;

/* Class220 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class WorldMapAreaDefs {
	public int anInt2715;
	WorldMapIndexLoader aClass218_2716;
	public int[] anIntArray2717;
	public int anInt2718;
	public int anInt2719 = -90645705;
	public int anInt2720;
	public int anInt2721;
	public int anInt2722;
	public int anInt2726;
	public int anInt2727;
	public boolean aBool2728;
	public boolean aBool2729;
	public boolean aBool2730;
	public int anInt2731;
	public String aString2732;
	int anInt2733;
	int anInt2734;
	int anInt2735;
	int anInt2736;
	IterableNodeMap aClass465_2737;
	public int[] anIntArray2738;
	int anInt2739;
	public String[] aStringArray2740;
	int anInt2741;
	public boolean aBool2742;
	int anInt2743;
	public int anInt2744;
	int anInt2745;
	public int anInt2746;
	public int anInt2747;
	public int anInt2748;
	public int anInt2749;
	public int anInt2750;
	public String areaName;
	public int anInt2752;
	public int anInt2753;
	public byte[] aByteArray2754;
	int anInt2755;
	public int anInt2756;
	public int anInt2757 = -953100891;

	void method3716(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (0 == i_1_)
				break;
			method3717(class282_sub35, i_1_, 1169523211);
		}
	}

	void method3717(RsByteBuffer stream, int i, int i_2_) {
		if (1 == i)
			anInt2719 = stream.readBigSmart() * 90645705;
		else if (2 == i)
			anInt2757 = stream.readBigSmart() * 953100891;
		else if (i == 3)
			areaName = stream.readString(1816271322);
		else if (4 == i)
			anInt2720 = stream.read24BitUnsignedInteger((short) 13167) * 646948849;
		else if (5 == i)
			anInt2721 = stream.read24BitUnsignedInteger((short) 20127) * -1023529093;
		else if (i == 6)
			anInt2722 = stream.readUnsignedByte() * -1396277445;
		else if (i == 7) {
			int i_3_ = stream.readUnsignedByte();
			if ((i_3_ & 0x1) == 0)
				aBool2728 = false;
			if (2 == (i_3_ & 0x2))
				aBool2729 = true;
		} else if (i == 8)
			aBool2730 = stream.readUnsignedByte() == 1;
		else if (i == 9) {
			((WorldMapAreaDefs) this).anInt2736 = stream.readUnsignedShort() * 198435007;
			if (((WorldMapAreaDefs) this).anInt2736 * -1762685121 == 65535)
				((WorldMapAreaDefs) this).anInt2736 = -198435007;
			((WorldMapAreaDefs) this).anInt2745 = stream.readUnsignedShort() * -2088640545;
			if (-999908321 * ((WorldMapAreaDefs) this).anInt2745 == 65535)
				((WorldMapAreaDefs) this).anInt2745 = 2088640545;
			((WorldMapAreaDefs) this).anInt2734 = stream.readInt() * 851050709;
			((WorldMapAreaDefs) this).anInt2735 = stream.readInt() * 467386983;
		} else if (i >= 10 && i <= 14)
			aStringArray2740[i - 10] = stream.readString(138200082);
		else if (15 == i) {
			int i_4_ = stream.readUnsignedByte();
			anIntArray2717 = new int[2 * i_4_];
			for (int i_5_ = 0; i_5_ < i_4_ * 2; i_5_++)
				anIntArray2717[i_5_] = stream.readShort(1931014548);
			anInt2715 = stream.readInt() * -1146478901;
			int i_6_ = stream.readUnsignedByte();
			anIntArray2738 = new int[i_6_];
			for (int i_7_ = 0; i_7_ < anIntArray2738.length; i_7_++)
				anIntArray2738[i_7_] = stream.readInt();
			aByteArray2754 = new byte[i_4_];
			for (int i_8_ = 0; i_8_ < i_4_; i_8_++)
				aByteArray2754[i_8_] = stream.readByte((short) -27001);
		} else if (i == 16)
			aBool2742 = false;
		else if (17 == i)
			aString2732 = stream.readString(-318635961);
		else if (i == 18)
			((WorldMapAreaDefs) this).anInt2733 = stream.readBigSmart() * -868666115;
		else if (19 == i)
			anInt2718 = stream.readUnsignedShort() * 295187979;
		else if (20 == i) {
			((WorldMapAreaDefs) this).anInt2755 = stream.readUnsignedShort() * -1338069957;
			if (65535 == -485274381 * ((WorldMapAreaDefs) this).anInt2755)
				((WorldMapAreaDefs) this).anInt2755 = 1338069957;
			((WorldMapAreaDefs) this).anInt2741 = stream.readUnsignedShort() * -561030001;
			if (1197884015 * ((WorldMapAreaDefs) this).anInt2741 == 65535)
				((WorldMapAreaDefs) this).anInt2741 = 561030001;
			((WorldMapAreaDefs) this).anInt2743 = stream.readInt() * -1604948715;
			((WorldMapAreaDefs) this).anInt2739 = stream.readInt() * 611234189;
		} else if (i == 21)
			anInt2727 = stream.readInt() * 1968360403;
		else if (22 == i)
			anInt2726 = stream.readInt() * -355663391;
		else if (23 == i) {
			anInt2748 = stream.readUnsignedByte() * 1006097031;
			anInt2749 = stream.readUnsignedByte() * 490112867;
			anInt2756 = stream.readUnsignedByte() * -2107093317;
		} else if (24 == i) {
			anInt2750 = stream.readShort(2027508262) * 166291447;
			anInt2752 = stream.readShort(2043715799) * 1693760877;
		} else if (i == 249) {
			int i_9_ = stream.readUnsignedByte();
			if (((WorldMapAreaDefs) this).aClass465_2737 == null) {
				int i_10_ = Class323.nextPowerOfTwo(i_9_, -417308135);
				((WorldMapAreaDefs) this).aClass465_2737 = new IterableNodeMap(i_10_);
			}
			for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
				boolean bool = stream.readUnsignedByte() == 1;
				int i_12_ = stream.read24BitUnsignedInteger((short) 1908);
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(stream.readString(-189509374));
				else
					class282 = new Class282_Sub38(stream.readInt());
				((WorldMapAreaDefs) this).aClass465_2737.method7765(class282, (long) i_12_);
			}
		}
	}

	void method3718(int i) {
		if (anIntArray2717 != null) {
			for (int i_13_ = 0; i_13_ < anIntArray2717.length; i_13_ += 2) {
				if (anIntArray2717[i_13_] < -195227125 * anInt2747)
					anInt2747 = 442853795 * anIntArray2717[i_13_];
				else if (anIntArray2717[i_13_] > anInt2731 * -1051190363)
					anInt2731 = anIntArray2717[i_13_] * -1176677331;
				if (anIntArray2717[i_13_ + 1] < 1104382109 * anInt2744)
					anInt2744 = -394314315 * anIntArray2717[1 + i_13_];
				else if (anIntArray2717[1 + i_13_] > anInt2746 * 1123286327)
					anInt2746 = -36550521 * anIntArray2717[1 + i_13_];
			}
		}
	}

	public boolean method3719(Interface42 interface42, int i) {
		int i_14_;
		if (((WorldMapAreaDefs) this).anInt2745 * -999908321 != -1)
			i_14_ = interface42.method240((((WorldMapAreaDefs) this).anInt2745 * -999908321), 1482918340);
		else if (-1 != -1762685121 * ((WorldMapAreaDefs) this).anInt2736)
			i_14_ = interface42.method241((-1762685121 * ((WorldMapAreaDefs) this).anInt2736), 1874672884);
		else
			return true;
		if (i_14_ < -1501349763 * ((WorldMapAreaDefs) this).anInt2734 || i_14_ > 548944215 * ((WorldMapAreaDefs) this).anInt2735)
			return false;
		boolean bool = false;
		int i_15_;
		if (1197884015 * ((WorldMapAreaDefs) this).anInt2741 != -1)
			i_15_ = interface42.method240((((WorldMapAreaDefs) this).anInt2741 * 1197884015), 873480521);
		else if (((WorldMapAreaDefs) this).anInt2755 * -485274381 != -1)
			i_15_ = interface42.method241((-485274381 * ((WorldMapAreaDefs) this).anInt2755), 1556323126);
		else
			return true;
		if (i_15_ < -2135131587 * ((WorldMapAreaDefs) this).anInt2743 || i_15_ > ((WorldMapAreaDefs) this).anInt2739 * 660142405)
			return false;
		return true;
	}

	public String method3722(int i, String string, int i_26_) {
		if (((WorldMapAreaDefs) this).aClass465_2737 == null)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((WorldMapAreaDefs) this).aClass465_2737.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public int method3723(int i, int i_27_, int i_28_) {
		if (((WorldMapAreaDefs) this).aClass465_2737 == null)
			return i_27_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((WorldMapAreaDefs) this).aClass465_2737.method7754((long) i));
		if (null == class282_sub38)
			return i_27_;
		return -570797415 * class282_sub38.anInt8002;
	}

	WorldMapAreaDefs() {
		anInt2721 = 1023529093;
		anInt2722 = 0;
		aBool2728 = true;
		aBool2729 = false;
		aBool2730 = true;
		aStringArray2740 = new String[5];
		((WorldMapAreaDefs) this).anInt2733 = 868666115;
		((WorldMapAreaDefs) this).anInt2736 = -198435007;
		((WorldMapAreaDefs) this).anInt2745 = 2088640545;
		((WorldMapAreaDefs) this).anInt2755 = 1338069957;
		((WorldMapAreaDefs) this).anInt2741 = 561030001;
		anInt2747 = 1704629853;
		anInt2744 = -1753169333;
		anInt2731 = -2147483648;
		anInt2746 = -2147483648;
		anInt2748 = -1006097031;
		anInt2749 = -490112867;
		anInt2756 = 2107093317;
		aBool2742 = true;
		anInt2718 = -295187979;
	}

	public NativeSprite method3729(GraphicalRenderer class505, int i) {
		NativeSprite class160 = ((NativeSprite) (((WorldMapIndexLoader) ((WorldMapAreaDefs) this).aClass218_2716).aClass229_2708.get((long) (1555531861 * ((WorldMapAreaDefs) this).anInt2733 | 0x20000 | class505.rendererId * -413843045 << 29))));
		if (null != class160)
			return class160;
		((WorldMapIndexLoader) ((WorldMapAreaDefs) this).aClass218_2716).aClass317_2703.method5661(1555531861 * ((WorldMapAreaDefs) this).anInt2733, -1916455101);
		Class91 class91 = Class91.method1522((((WorldMapIndexLoader) ((WorldMapAreaDefs) this).aClass218_2716).aClass317_2703), 1555531861 * ((WorldMapAreaDefs) this).anInt2733, 0);
		if (null != class91) {
			class160 = class505.method8444(class91, true);
			((WorldMapIndexLoader) ((WorldMapAreaDefs) this).aClass218_2716).aClass229_2708.put(class160, (long) (1555531861 * ((WorldMapAreaDefs) this).anInt2733 | 0x20000 | class505.rendererId * -413843045 << 29));
		}
		return class160;
	}

	public NativeSprite renderIcons(GraphicalRenderer class505, boolean bool, byte i) {
		int i_63_ = bool ? anInt2757 * -992610861 : -1248709255 * anInt2719;
		int i_64_ = i_63_ | -413843045 * class505.rendererId << 29;
		NativeSprite class160 = (NativeSprite) ((WorldMapIndexLoader) ((WorldMapAreaDefs) this).aClass218_2716).aClass229_2708.get((long) i_64_);
		if (class160 != null)
			return class160;
		if (!((WorldMapIndexLoader) ((WorldMapAreaDefs) this).aClass218_2716).aClass317_2703.method5661(i_63_, 803416398))
			return null;
		Class91 class91 = Class91.method1522((((WorldMapIndexLoader) ((WorldMapAreaDefs) this).aClass218_2716).aClass317_2703), i_63_, 0);
		if (null != class91) {
			class160 = class505.method8444(class91, true);
			((WorldMapIndexLoader) ((WorldMapAreaDefs) this).aClass218_2716).aClass229_2708.put(class160, (long) i_64_);
		}
		return class160;
	}

	static void method3736(NPC class521_sub1_sub1_sub2_sub2, boolean bool, int i) {
		if (2144330291 * Class20.anInt169 < 412) {
			NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
			String string = class521_sub1_sub1_sub2_sub2.aString10584;
			if (class409.anIntArray4886 != null) {
				class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (null == class409)
					return;
				string = class409.aString4857;
			}
			if (class409.aBool4893) {
				if (class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433 != 0) {
					String string_65_ = (client.CURRENT_GAME == Game.stellarDawn ? (Message.RATING_.translate(Class223.CURRENT_LANGUAGE, -834706251)) : (Message.LEVEL_.translate(Class223.CURRENT_LANGUAGE, -2066176113)));
					string = new StringBuilder().append(string).append(ItemIndexLoader.method7169((class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433), (Class84.myPlayer.anInt10565) * -1880473919, -1957998512)).append(Class2.aString15).append(string_65_).append(class521_sub1_sub1_sub2_sub2.anInt10582 * -1394313433).append(Class2.aString18).toString();
				}
				if (client.aBool7344 && !bool) {
					AttributeDefault class437 = (-1 != Class96_Sub12.anInt9319 * -1605351655 ? (IndexLoaders.ITEM_DEFAULTS.method7069(-1605351655 * Class96_Sub12.anInt9319, (byte) 0)) : null);
					if (0 != (Class506.anInt5858 * 1310510077 & 0x2) && (null == class437 || ((class409.method6876(-1605351655 * Class96_Sub12.anInt9319, -1741480635 * class437.anInt5337, 130038001)) != class437.anInt5337 * -1741480635)))
						PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(16776960, 619010179)).append(string).toString(), -239192305 * Defaults8Loader.anInt5932, 8, -1, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub2.anInt10314)), 0, 0, true, false, (long) (class521_sub1_sub1_sub2_sub2.anInt10314 * -1691508299), false, -1728725165);
				}
				if (!bool) {
					String[] strings = class409.aStringArray4882;
					if (client.aBool7264)
						strings = Class362.method6277(strings, (short) 9362);
					if (null != strings) {
						for (int i_66_ = strings.length - 1; i_66_ >= 0; i_66_--) {
							if (null != strings[i_66_] && (0 == class409.aByte4916 || (!(strings[i_66_].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1264290338))) && !(strings[i_66_].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -1819151765)))))) {
								int i_67_ = 0;
								int i_68_ = 452205213 * client.anInt7342;
								if (0 == i_66_)
									i_67_ = 9;
								if (1 == i_66_)
									i_67_ = 10;
								if (2 == i_66_)
									i_67_ = 11;
								if (3 == i_66_)
									i_67_ = 12;
								if (i_66_ == 4)
									i_67_ = 13;
								if (5 == i_66_)
									i_67_ = 1003;
								if (-1111700649 * class409.anInt4875 == i_66_)
									i_68_ = class409.anInt4873 * -370908623;
								if (class409.anInt4854 * 351313017 == i_66_)
									i_68_ = class409.anInt4861 * -574217529;
								PlayerAppearance.method4032(strings[i_66_], new StringBuilder().append(Class59.method1163(16776960, 619010179)).append(string).toString(), ((strings[i_66_].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -422947170))) ? -1025853585 * class409.anInt4877 : i_68_), i_67_, -1, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), 0, 0, true, false, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), false, -1773453670);
							}
						}
						if (1 == class409.aByte4916) {
							for (int i_69_ = 0; i_69_ < strings.length; i_69_++) {
								if (null != strings[i_69_] && ((strings[i_69_].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -436851003))) || (strings[i_69_].equalsIgnoreCase(Message.EXAMINE.translate(Class223.CURRENT_LANGUAGE, -473516287))))) {
									short i_70_ = 0;
									if ((-1394313433 * (class521_sub1_sub1_sub2_sub2.anInt10582)) > (-1880473919 * (Class84.myPlayer.anInt10565)))
										i_70_ = (short) 2000;
									short i_71_ = 0;
									int i_72_ = 452205213 * client.anInt7342;
									if (0 == i_69_)
										i_71_ = (short) 9;
									if (i_69_ == 1)
										i_71_ = (short) 10;
									if (i_69_ == 2)
										i_71_ = (short) 11;
									if (i_69_ == 3)
										i_71_ = (short) 12;
									if (4 == i_69_)
										i_71_ = (short) 13;
									if (5 == i_69_)
										i_71_ = (short) 1003;
									if (i_71_ != 0)
										i_71_ += i_70_;
									if (-1111700649 * class409.anInt4875 == i_69_)
										i_72_ = -370908623 * class409.anInt4873;
									if (class409.anInt4854 * 351313017 == i_69_)
										i_72_ = class409.anInt4861 * -574217529;
									PlayerAppearance.method4032(strings[i_69_], new StringBuilder().append(Class59.method1163(16776960, 619010179)).append(string).toString(), ((strings[i_69_].equalsIgnoreCase(Message.ATTACK.translate(Class223.CURRENT_LANGUAGE, -1997310478))) ? -1025853585 * class409.anInt4877 : i_72_), i_71_, -1, (long) ((class521_sub1_sub1_sub2_sub2.anInt10314) * -1691508299), 0, 0, true, false, (long) (-1691508299 * (class521_sub1_sub1_sub2_sub2.anInt10314)), false,
											-1021673171);
								}
							}
						}
					}
				}
			}
		}
	}

	static final void method3737(CS2Executor class527, short i) {
		if ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) == 0) {
			if (i < 2048)
				((CS2Executor) class527).instrPtr += (-1051529003 * (((CS2Executor) class527).unknown[((CS2Executor) class527).instrPtr * 301123709]));
		}
	}

	static final void method3738(Class118 class118, Class98 class98, CS2Executor class527, byte i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_73_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_74_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		if (-1 == i_73_ && i_74_ == -1)
			class118.aClass118_1379 = null;
		else
			class118.aClass118_1379 = Index.method5694(i_73_, i_74_, 551266570);
	}

	static final void method3739(CS2Executor class527, int i) {
		int i_75_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (client.anInt7434 * 1609086245 == 2 && i_75_ < 493536965 * client.anInt7449)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = client.aClass6Array7452[i_75_].aBool38 ? 1 : 0;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method3740(CS2Executor class527, int i) {
		NPC class521_sub1_sub1_sub2_sub2 = ((NPC) ((CS2Executor) class527).animable);
		NPCDefinitions class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
		if (null != class409.anIntArray4886)
			class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = class409 != null ? 1 : 0;
	}

	public static String method3741(byte i) {
		String string = "www";
		if (Class496.aClass496_5811 == Class90.aClass496_952) {
			if (i != -1) {
				/* empty */
			}
			string = "www-wtrc";
		} else if (Class496.aClass496_5808 == Class90.aClass496_952) {
			if (i != -1)
				throw new IllegalStateException();
			string = "www-wtqa";
		} else if (Class496.aClass496_5807 == Class90.aClass496_952) {
			if (i != -1) {
				for (;;) {
					/* empty */
				}
			}
			string = "www-wtwip";
		} else if (Class90.aClass496_952 == Class496.aClass496_5809) {
			if (i != -1)
				throw new IllegalStateException();
			string = "www-wti";
		}
		String string_76_ = "";
		if (client.aString7281 != null) {
			if (i != -1)
				throw new IllegalStateException();
			string_76_ = new StringBuilder().append("/p=").append(client.aString7281).toString();
		}
		String string_77_ = new StringBuilder().append(client.CURRENT_GAME.aString5748).append(".com").toString();
		return new StringBuilder().append("http://").append(string).append(".").append(string_77_).append("/l=").append(Class223.CURRENT_LANGUAGE).append("/a=").append(-1543197399 * client.anInt7149).append(string_76_).append("/").toString();
	}

	static boolean renderIconsAndNames(GraphicalRenderer renderer, Class282_Sub36 class282_sub36, WorldMapAreaDefs class220, int i, int i_78_, int i_79_) {
		int i_80_ = 2147483647;
		int i_81_ = -2147483648;
		int i_82_ = 2147483647;
		int i_83_ = -2147483648;
		if (null != class220.anIntArray2717) {
			i_80_ = (((Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) * (-1306535747 * class282_sub36.anInt7987 + -195227125 * class220.anInt2747 - Class291_Sub1.anInt3485) / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485)) + Class291_Sub1.anInt3489);
			i_81_ = (Class291_Sub1.anInt3489 + ((class220.anInt2731 * -1051190363 + class282_sub36.anInt7987 * -1306535747 - Class291_Sub1.anInt3485) * (Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485)));
			i_83_ = (Class291_Sub1.anInt3492 - ((Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * (1012301095 * class282_sub36.anInt7993 + class220.anInt2744 * 1104382109 - Class291_Sub1.anInt3465) / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465)));
			i_82_ = (Class291_Sub1.anInt3492 - ((Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * (class220.anInt2746 * 1123286327 + class282_sub36.anInt7993 * 1012301095 - Class291_Sub1.anInt3465) / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465)));
		}
		NativeSprite sprite = null;
		int i_84_ = 0;
		int i_85_ = 0;
		int i_86_ = 0;
		int i_87_ = 0;
		if (class220.anInt2719 * -1248709255 != -1) {
			if (class282_sub36.aBool7989 && class220.anInt2757 * -992610861 != -1)
				sprite = class220.renderIcons(renderer, true, (byte) 8);
			else
				sprite = class220.renderIcons(renderer, false, (byte) 8);
			if (null != sprite) {
				i_84_ = (443215287 * class282_sub36.anInt7990 - (sprite.method228() + 1 >> 1));
				if (i_84_ < i_80_)
					i_80_ = i_84_;
				i_85_ = (443215287 * class282_sub36.anInt7990 + (sprite.method228() + 1 >> 1));
				if (i_85_ > i_81_)
					i_81_ = i_85_;
				i_86_ = (-904538465 * class282_sub36.anInt7992 - (sprite.method2748() + 1 >> 1));
				if (i_86_ < i_82_)
					i_82_ = i_86_;
				i_87_ = (class282_sub36.anInt7992 * -904538465 + (sprite.method2748() + 1 >> 1));
				if (i_87_ > i_83_)
					i_83_ = i_87_;
			}
		}
		Class194 class194 = null;
		int i_88_ = 0;
		int i_89_ = 0;
		int i_90_ = 0;
		int i_91_ = 0;
		int i_92_ = 0;
		int i_93_ = 0;
		int i_94_ = 0;
		int i_95_ = 0;
		if (class220.areaName != null) {
			class194 = Class286.method5048(class220.anInt2722 * 1172439539, (byte) -57);
			if (null != class194) {
				i_88_ = (Class282_Sub17_Sub2.aClass414_9933.method6987(class220.areaName, null, Class291_Sub1.aStringArray8024, null, (byte) 0));
				i_89_ = (443215287 * class282_sub36.anInt7990 + (-1153726009 * class220.anInt2750 * (Class291_Sub1.anInt3476 - Class291_Sub1.anInt3489) / (Class291_Sub1.anInt3480 - Class291_Sub1.anInt3485)));
				i_90_ = (class282_sub36.anInt7992 * -904538465 - ((Class291_Sub1.anInt3492 - Class291_Sub1.anInt3490) * (class220.anInt2752 * -1409297307) / (Class291_Sub1.anInt3486 - Class291_Sub1.anInt3465)));
				if (sprite == null)
					i_90_ -= class194.method3186() * i_88_ / 2;
				else
					i_90_ -= ((sprite.method2748() >> 1) + class194.method3173() * i_88_);
				for (int i_96_ = 0; i_96_ < i_88_; i_96_++) {
					String string = Class291_Sub1.aStringArray8024[i_96_];
					if (i_96_ < i_88_ - 1)
						string = string.substring(0, string.length() - 4);
					int i_97_ = class194.method3177(string);
					if (i_97_ > i_91_)
						i_91_ = i_97_;
				}
				i_92_ = i_89_ - i_91_ / 2 + i;
				if (i_92_ < i_80_)
					i_80_ = i_92_;
				i_93_ = i_91_ / 2 + i_89_ + i;
				if (i_93_ > i_81_)
					i_81_ = i_93_;
				i_94_ = i_90_ + i_78_;
				if (i_94_ < i_82_)
					i_82_ = i_94_;
				i_95_ = i_90_ + i_88_ * class194.method3173() + i_78_;
				if (i_95_ > i_83_)
					i_83_ = i_95_;
			}
		}
		if (i_81_ < Class291_Sub1.anInt3489 || i_80_ > Class291_Sub1.anInt3476 || i_83_ < Class291_Sub1.anInt3490 || i_82_ > Class291_Sub1.anInt3492)
			return true;
		Class291_Sub1.method5147(renderer, class282_sub36, class220);
		if (sprite != null) {
			if (Class361.anInt4185 * 750747217 > 0 && ((-1 != Class291_Sub1.anInt8018 * 2089227969 && (Class291_Sub1.anInt8018 * 2089227969 == class282_sub36.anInt7991 * -1798678621)) || (614736923 * Class291_Sub1.anInt8026 != -1 && (Class291_Sub1.anInt8026 * 614736923 == class220.anInt2718 * 781329827)))) {
				int i_98_;
				if (896422831 * Class96_Sub9.anInt9282 > 50)
					i_98_ = 200 - Class96_Sub9.anInt9282 * 1792845662;
				else
					i_98_ = Class96_Sub9.anInt9282 * 1792845662;
				int i_99_ = i_98_ << 24 | 0xffff00;
				renderer.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, sprite.method2747() / 2 + 7, i_99_, 1444193569);
				renderer.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, sprite.method2747() / 2 + 5, i_99_, -1310024744);
				renderer.method8468(443215287 * class282_sub36.anInt7990, class282_sub36.anInt7992 * -904538465, sprite.method2747() / 2 + 3, i_99_, -333030920);
				renderer.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, sprite.method2747() / 2 + 1, i_99_, 283633810);
				renderer.method8468(class282_sub36.anInt7990 * 443215287, -904538465 * class282_sub36.anInt7992, sprite.method2747() / 2, i_99_, -1440374921);
			}
			sprite.method2752((443215287 * class282_sub36.anInt7990 - (sprite.method228() >> 1)), (-904538465 * class282_sub36.anInt7992 - (sprite.method2748() >> 1)));
		}
		if (class220.areaName != null && class194 != null)
			InventoriesIndexLoader.renderAreaText(renderer, class282_sub36, class220, i_88_, i_89_, i_90_, i_91_, class194, (byte) 79);
		if (-1248709255 * class220.anInt2719 != -1 || class220.areaName != null) {
			Class282_Sub33 class282_sub33 = new Class282_Sub33(class282_sub36);
			((Class282_Sub33) class282_sub33).anInt7830 = i_84_ * -925812333;
			((Class282_Sub33) class282_sub33).anInt7828 = i_85_ * 1303174651;
			((Class282_Sub33) class282_sub33).anInt7834 = i_86_ * -1854557465;
			((Class282_Sub33) class282_sub33).anInt7833 = -724182681 * i_87_;
			((Class282_Sub33) class282_sub33).anInt7829 = i_92_ * -1447464913;
			((Class282_Sub33) class282_sub33).anInt7832 = -705732785 * i_93_;
			((Class282_Sub33) class282_sub33).anInt7831 = -2064740419 * i_94_;
			((Class282_Sub33) class282_sub33).anInt7827 = -719287379 * i_95_;
			Class346.aClass482_4049.append(class282_sub33, -1280264944);
		}
		return false;
	}

	static final void method3743(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = client.aBool7325 ? 1 : 0;
	}
}
