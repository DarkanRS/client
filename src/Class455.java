/* Class455 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class455 {
	public static short[] aShortArray5452;

	Class455() {
		/* empty */
	}

	static void method7553(IComponentDefinitions class118, int i, int i_0_, int i_1_) {
		if (client.aBool7344) {
			AttributeDefault class437 = (Class96_Sub12.anInt9319 * -1605351655 != -1 ? IndexLoaders.ITEM_DEFAULTS.method7069((-1605351655 * (Class96_Sub12.anInt9319)), (byte) 0) : null);
			if (client.method11633(class118).method12181(2135995178) && (Class506.anInt5858 * 1310510077 & 0x20) != 0 && (class437 == null || (class118.method1997((Class96_Sub12.anInt9319 * -1605351655), -1741480635 * class437.anInt5337, 1315662275) != class437.anInt5337 * -1741480635)))
				PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(class118.aString1369).toString(), -239192305 * Defaults8Loader.anInt5932, 58, class118.anInt1426 * -56249735, 0L, 1924549737 * class118.anInt1288, class118.idHash * -1952846363, true, false, (long) (1924549737 * class118.anInt1288 << 32 | -1952846363 * class118.idHash), false, -1704442537);
		}
		for (int i_2_ = 9; i_2_ >= 5; i_2_--) {
			String string = ItemIndexLoader.method7171(class118, i_2_, (byte) -85);
			if (null != string)
				PlayerAppearance.method4032(string, class118.aString1369, Class520.method11163(class118, i_2_, 556653013), 1007, -56249735 * class118.anInt1426, (long) (i_2_ + 1), class118.anInt1288 * 1924549737, -1952846363 * class118.idHash, true, false, (long) (1924549737 * class118.anInt1288 << 32 | class118.idHash * -1952846363), false, -976206052);
		}
		String string = Class346.method6157(class118, -948753255);
		if (string != null)
			PlayerAppearance.method4032(string, class118.aString1369, class118.anInt1378 * 1289545277, 25, -56249735 * class118.anInt1426, 0L, 1924549737 * class118.anInt1288, -1952846363 * class118.idHash, true, false, (long) (1924549737 * class118.anInt1288 << 32 | class118.idHash * -1952846363), false, -1589662667);
		for (int i_3_ = 4; i_3_ >= 0; i_3_--) {
			String string_4_ = ItemIndexLoader.method7171(class118, i_3_, (byte) 19);
			if (null != string_4_)
				PlayerAppearance.method4032(string_4_, class118.aString1369, Class520.method11163(class118, i_3_, 1809769976), 57, class118.anInt1426 * -56249735, (long) (i_3_ + 1), 1924549737 * class118.anInt1288, class118.idHash * -1952846363, true, false, (long) (class118.anInt1288 * 1924549737 << 32 | -1952846363 * class118.idHash), false, -1644118104);
		}
		if (client.method11633(class118).method12182(-1173401009)) {
			if (class118.aString1348 != null)
				PlayerAppearance.method4032(class118.aString1348, "", -1, 30, -56249735 * class118.anInt1426, 0L, 1924549737 * class118.anInt1288, -1952846363 * class118.idHash, true, false, (long) ((1924549737 * class118.anInt1288 << 32) | (class118.idHash * -1952846363)), false, -1336342241);
			else
				PlayerAppearance.method4032(Message.CONTINUE.translate(Class223.CURRENT_LANGUAGE, -1421679788), "", -1, 30, class118.anInt1426 * -56249735, 0L, 1924549737 * class118.anInt1288, class118.idHash * -1952846363, true, false, (long) (1924549737 * class118.anInt1288 << 32 | -1952846363 * class118.idHash), false, -1542959326);
		}
	}

	static void method7554(Interface class98, IComponentDefinitions class118, int i) {
		if (null != class118) {
			if (class118.anInt1288 * 1924549737 != -1) {
				IComponentDefinitions class118_5_ = class98.method1618(class118.anInt1305 * 2110532063, (byte) 12);
				if (null != class118_5_) {
					if (class118_5_.aClass118Array1439 == class118_5_.aClass118Array1438) {
						class118_5_.aClass118Array1439 = (new IComponentDefinitions[class118_5_.aClass118Array1438.length]);
						class118_5_.aClass118Array1439[class118_5_.aClass118Array1439.length - 1] = class118;
						Class503.method8359(class118_5_.aClass118Array1438, 0, class118_5_.aClass118Array1439, 0, class118.anInt1288 * 1924549737);
						Class503.method8359(class118_5_.aClass118Array1438, (1924549737 * class118.anInt1288 + 1), class118_5_.aClass118Array1439, class118.anInt1288 * 1924549737, ((class118_5_.aClass118Array1438).length - class118.anInt1288 * 1924549737 - 1));
					} else {
						int i_6_ = 0;
						IComponentDefinitions[] class118s;
						for (class118s = class118_5_.aClass118Array1439; (i_6_ < class118s.length && class118s[i_6_] != class118); i_6_++) {
							/* empty */
						}
						if (i_6_ < class118s.length) {
							Class503.method8359(class118s, 1 + i_6_, class118s, i_6_, class118s.length - i_6_ - 1);
							class118s[(class118_5_.aClass118Array1439.length - 1)] = class118;
						}
					}
				}
			} else {
				IComponentDefinitions[] class118s = class98.method1617(-894902521);
				int i_7_;
				for (i_7_ = 0; i_7_ < class118s.length && class118s[i_7_] != class118; i_7_++) {
					/* empty */
				}
				if (i_7_ < class118s.length) {
					Class503.method8359(class118s, 1 + i_7_, class118s, i_7_, class118s.length - i_7_ - 1);
					class118s[class118s.length - 1] = class118;
				}
			}
		}
	}

	static final void method7555(IComponentDefinitions class118, Interface class98, CS2Executor class527, byte i) {
		class118.anInt1329 = 589750077;
		class118.anInt1330 = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) * -636815827);
		Class109.method1858(class118, (byte) -15);
		if (1924549737 * class118.anInt1288 == -1 && !class98.aBool999)
			Class92.method1565(class118.idHash * -1952846363, -624586705);
	}

	static final void method7556(CS2Executor class527, int i) {
		class527.anInt7000 -= -1341717846;
		String string = (String) (class527.objectStack[1806726141 * class527.anInt7000]);
		String string_8_ = (String) (class527.objectStack[class527.anInt7000 * 1806726141 + 1]);
		if ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) == 1)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = string_8_;
	}

	public static int method7557(CharSequence charsequence, CharSequence charsequence_9_, Language class495, int i) {
		int i_10_ = charsequence.length();
		int i_11_ = charsequence_9_.length();
		int i_12_ = 0;
		int i_13_ = 0;
		char c = '\0';
		char c_14_ = '\0';
		while (i_12_ - c < i_10_ || i_13_ - c_14_ < i_11_) {
			if (i_12_ - c >= i_10_)
				return -1;
			if (i_13_ - c_14_ >= i_11_)
				return 1;
			char c_15_;
			if (c != 0) {
				c_15_ = c;
				boolean bool = false;
			} else
				c_15_ = charsequence.charAt(i_12_++);
			char c_16_;
			if (c_14_ != 0) {
				c_16_ = c_14_;
				boolean bool = false;
			} else
				c_16_ = charsequence_9_.charAt(i_13_++);
			c = Class466.method7778(c_15_, -1430101456);
			c_14_ = Class466.method7778(c_16_, 1240929738);
			c_15_ = Class152.method2599(c_15_, class495, 32768);
			c_16_ = Class152.method2599(c_16_, class495, 32768);
			if (c_15_ != c_16_ && (Character.toUpperCase(c_15_) != Character.toUpperCase(c_16_))) {
				c_15_ = Character.toLowerCase(c_15_);
				c_16_ = Character.toLowerCase(c_16_);
				if (c_16_ != c_15_)
					return (Class468_Sub30.method13422(c_15_, class495, -556732263) - Class468_Sub30.method13422(c_16_, class495, -556732263));
			}
		}
		int i_17_ = Math.min(i_10_, i_11_);
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++) {
			if (class495 == Language.aClass495_5801) {
				i_12_ = i_10_ - 1 - i_18_;
				i_13_ = i_11_ - 1 - i_18_;
			} else
				i_12_ = i_13_ = i_18_;
			char c_19_ = charsequence.charAt(i_12_);
			char c_20_ = charsequence_9_.charAt(i_13_);
			if (c_20_ != c_19_ && (Character.toUpperCase(c_19_) != Character.toUpperCase(c_20_))) {
				c_19_ = Character.toLowerCase(c_19_);
				c_20_ = Character.toLowerCase(c_20_);
				if (c_19_ != c_20_)
					return (Class468_Sub30.method13422(c_19_, class495, -556732263) - Class468_Sub30.method13422(c_20_, class495, -556732263));
			}
		}
		int i_21_ = i_10_ - i_11_;
		if (0 != i_21_)
			return i_21_;
		for (int i_22_ = 0; i_22_ < i_17_; i_22_++) {
			char c_23_ = charsequence.charAt(i_22_);
			char c_24_ = charsequence_9_.charAt(i_22_);
			if (c_23_ != c_24_)
				return (Class468_Sub30.method13422(c_23_, class495, -556732263) - Class468_Sub30.method13422(c_24_, class495, -556732263));
		}
		return 0;
	}

	static void method7558(boolean bool, boolean bool_25_, String string, String string_26_, long l) {
		Class9.socialNetworkLogin = bool;
		if (!bool_25_)
			Class9.anInt76 = -1481524237;
		Class9.aBool74 = bool_25_;
		Class9.aString99 = string;
		Class9.aString102 = string_26_;
		Class9.aLong77 = l * 2087908126908168589L;
		if (!Class9.aBool74 && (Class9.aString99.equals("") || Class9.aString102.equals("")))
			Class8_Sub1.method13784(3, 737925306);
		else {
			if (140 != Class9.lobbyStage * 368603503) {
				Class9.anInt103 = 0;
				Class9.anInt112 = 1260694625;
				Class9.anInt94 = -605935537;
			}
			Class9.aClass184_73.aBool2298 = false;
			Class8_Sub1.method13784(-3, -416283097);
			Class9.loginStage = 69019906;
			Class9.anInt90 = 0;
			Class9.anInt104 = 0;
		}
	}

	static int method7559(byte[] is, int i, int i_27_, int i_28_) {
		int i_29_ = -1;
		for (int i_30_ = i; i_30_ < i_27_; i_30_++)
			i_29_ = i_29_ >>> 8 ^ (RsByteBuffer.anIntArray7986[(i_29_ ^ is[i_30_]) & 0xff]);
		i_29_ ^= 0xffffffff;
		return i_29_;
	}

	static final void method7560(CS2Executor class527, int i) {
		int i_31_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_31_, (byte) 59);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_31_ >> 16];
		ClipMap.method6010(class118, class98, class527, -298020679);
	}

	static final void method7561(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class236.method3983(class118, class98, class527, -1010803403);
	}
}
