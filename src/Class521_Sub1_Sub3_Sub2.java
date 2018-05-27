/* Class521_Sub1_Sub3_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class521_Sub1_Sub3_Sub2 extends Class521_Sub1_Sub3 implements Interface12 {
	Class200 aClass200_10505;
	boolean aBool10506;
	public Class123 aClass123_10507;
	boolean aBool10508 = true;

	public Class200 method12993(GraphicalRenderer class505) {
		return ((Class521_Sub1_Sub3_Sub2) this).aClass200_10505;
	}

	boolean method12986(int i) {
		return false;
	}

	boolean method12987(int i) {
		return ((Class521_Sub1_Sub3_Sub2) this).aBool10508;
	}

	public Class200 method12992(GraphicalRenderer class505, byte i) {
		return ((Class521_Sub1_Sub3_Sub2) this).aClass200_10505;
	}

	public int method12995(int i) {
		return aClass123_10507.method2115(560819680);
	}

	public int method12997(int i) {
		return aClass123_10507.method2121((byte) 1);
	}

	Class285 method12990(GraphicalRenderer class505, int i) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 2048, false, true, -1384937123);
		if (null == class528)
			return null;
		Class294 class294 = method11168();
		Class305 class305 = method11166();
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub3_Sub2) this).aBool10506, (byte) -122);
		int i_0_ = (int) class305.aClass385_3595.aFloat4671 >> 9;
		int i_1_ = (int) class305.aClass385_3595.aFloat4673 >> 9;
		aClass123_10507.method2119(class505, class528, class294, i_0_, i_0_, i_1_, i_1_, true, 1139295169);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (((Class123) aClass123_10507).aClass539_1538 != null) {
			Class151 class151 = ((Class123) aClass123_10507).aClass539_1538.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub3_Sub2) this).aBool10508 = (class528.i() || null != ((Class123) aClass123_10507).aClass539_1538);
		if (null == ((Class521_Sub1_Sub3_Sub2) this).aClass200_10505)
			((Class521_Sub1_Sub3_Sub2) this).aClass200_10505 = Class275_Sub2.method12505((int) (class305.aClass385_3595.aFloat4671), (int) (class305.aClass385_3595.aFloat4672), (int) (class305.aClass385_3595.aFloat4673), class528, (byte) -28);
		else
			Class388.method6694((((Class521_Sub1_Sub3_Sub2) this).aClass200_10505), (int) class305.aClass385_3595.aFloat4671, (int) class305.aClass385_3595.aFloat4672, (int) class305.aClass385_3595.aFloat4673, class528, -1412574443);
		return class285;
	}

	void method12991(GraphicalRenderer class505, int i) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 262144, true, true, -1384937123);
		if (class528 != null) {
			Class385 class385 = method11166().aClass385_3595;
			int i_2_ = (int) class385.aFloat4671 >> 9;
			int i_3_ = (int) class385.aFloat4673 >> 9;
			aClass123_10507.method2119(class505, class528, method11168(), i_2_, i_2_, i_3_, i_3_, false, 205228660);
		}
	}

	boolean method12983(GraphicalRenderer class505, int i, int i_4_, int i_5_) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 131072, false, false, -1384937123);
		if (null == class528)
			return false;
		return class528.method11270(i, i_4_, method11168(), false, 0);
	}

	final boolean method12985(int i) {
		return false;
	}

	final void method13013(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_6_, int i_7_, boolean bool, int i_8_) {
		throw new IllegalStateException();
	}

	public void method16090(Class476 class476) {
		aClass123_10507.method2116(class476, -950249360);
	}

	final boolean method13026() {
		return false;
	}

	public int method84(int i) {
		return 1535779425 * ((Class123) aClass123_10507).anInt1540;
	}

	public int method92(int i) {
		return -515017769 * ((Class123) aClass123_10507).anInt1542;
	}

	public void method16091(Class476 class476, int i) {
		aClass123_10507.method2116(class476, -1448472118);
	}

	public void method85(byte i) {
		/* empty */
	}

	public boolean method86(int i) {
		return aClass123_10507.method2117(-1218985167);
	}

	public void method87(GraphicalRenderer class505, int i) {
		aClass123_10507.method2136(class505, (byte) -38);
	}

	boolean method13001() {
		return ((Class521_Sub1_Sub3_Sub2) this).aBool10508;
	}

	public int method76() {
		return 1535779425 * ((Class123) aClass123_10507).anInt1540;
	}

	public int method39() {
		return 1535779425 * ((Class123) aClass123_10507).anInt1540;
	}

	boolean method13020(GraphicalRenderer class505, int i, int i_9_) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 131072, false, false, -1384937123);
		if (null == class528)
			return false;
		return class528.method11270(i, i_9_, method11168(), false, 0);
	}

	boolean method13002() {
		return ((Class521_Sub1_Sub3_Sub2) this).aBool10508;
	}

	public int method91() {
		return -515017769 * ((Class123) aClass123_10507).anInt1542;
	}

	public void method38() {
		/* empty */
	}

	public int method77() {
		return ((Class123) aClass123_10507).anInt1555 * 845010167;
	}

	public void method90() {
		/* empty */
	}

	public boolean method94() {
		return aClass123_10507.method2117(-1277974275);
	}

	Class285 method13009(GraphicalRenderer class505) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 2048, false, true, -1384937123);
		if (null == class528)
			return null;
		Class294 class294 = method11168();
		Class305 class305 = method11166();
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub3_Sub2) this).aBool10506, (byte) -111);
		int i = (int) class305.aClass385_3595.aFloat4671 >> 9;
		int i_10_ = (int) class305.aClass385_3595.aFloat4673 >> 9;
		aClass123_10507.method2119(class505, class528, class294, i, i, i_10_, i_10_, true, 2037340333);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (((Class123) aClass123_10507).aClass539_1538 != null) {
			Class151 class151 = ((Class123) aClass123_10507).aClass539_1538.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub3_Sub2) this).aBool10508 = (class528.i() || null != ((Class123) aClass123_10507).aClass539_1538);
		if (null == ((Class521_Sub1_Sub3_Sub2) this).aClass200_10505)
			((Class521_Sub1_Sub3_Sub2) this).aClass200_10505 = Class275_Sub2.method12505((int) (class305.aClass385_3595.aFloat4671), (int) (class305.aClass385_3595.aFloat4672), (int) (class305.aClass385_3595.aFloat4673), class528, (byte) -26);
		else
			Class388.method6694((((Class521_Sub1_Sub3_Sub2) this).aClass200_10505), (int) class305.aClass385_3595.aFloat4671, (int) class305.aClass385_3595.aFloat4672, (int) class305.aClass385_3595.aFloat4673, class528, 1093700673);
		return class285;
	}

	void method13023(GraphicalRenderer class505) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 262144, true, true, -1384937123);
		if (class528 != null) {
			Class385 class385 = method11166().aClass385_3595;
			int i = (int) class385.aFloat4671 >> 9;
			int i_11_ = (int) class385.aFloat4673 >> 9;
			aClass123_10507.method2119(class505, class528, method11168(), i, i, i_11_, i_11_, false, 77499913);
		}
	}

	public void method83(GraphicalRenderer class505) {
		aClass123_10507.method2136(class505, (byte) 0);
	}

	public void method97(GraphicalRenderer class505) {
		aClass123_10507.method2118(class505, 2118292159);
	}

	public void method98(GraphicalRenderer class505) {
		aClass123_10507.method2118(class505, 1583823457);
	}

	boolean method12999() {
		return false;
	}

	public int method73() {
		return ((Class123) aClass123_10507).anInt1555 * 845010167;
	}

	final void method12984(int i) {
		throw new IllegalStateException();
	}

	boolean method13000() {
		return ((Class521_Sub1_Sub3_Sub2) this).aBool10508;
	}

	public int method13003() {
		return aClass123_10507.method2115(-1400524037);
	}

	public int method13017() {
		return aClass123_10507.method2115(1023858019);
	}

	public int method13005() {
		return aClass123_10507.method2115(-1751223861);
	}

	public Class521_Sub1_Sub3_Sub2(Class206 class206, GraphicalRenderer class505, ObjectIndexLoader class474, ObjectDefinitions class478, int i, int i_12_, int i_13_, int i_14_, int i_15_, boolean bool, int i_16_, int i_17_) {
		super(class206, i_13_, i_14_, i_15_, i, i_12_, 1338534295 * class478.anInt5704);
		aClass123_10507 = new Class123(class505, class474, class478, Class458.aClass458_5480.anInt5481 * 1109376893, i_16_, i, i_12_, this, bool, i_17_);
		((Class521_Sub1_Sub3_Sub2) this).aBool10506 = class478.anInt5652 * -348507379 != 0 && !bool;
		method13008(1, (byte) -48);
	}

	public int method13007() {
		return aClass123_10507.method2121((byte) 1);
	}

	public int method13028() {
		return aClass123_10507.method2121((byte) 1);
	}

	public int method89(int i) {
		return ((Class123) aClass123_10507).anInt1555 * 845010167;
	}

	Class285 method13010(GraphicalRenderer class505) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 2048, false, true, -1384937123);
		if (null == class528)
			return null;
		Class294 class294 = method11168();
		Class305 class305 = method11166();
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub3_Sub2) this).aBool10506, (byte) -77);
		int i = (int) class305.aClass385_3595.aFloat4671 >> 9;
		int i_18_ = (int) class305.aClass385_3595.aFloat4673 >> 9;
		aClass123_10507.method2119(class505, class528, class294, i, i, i_18_, i_18_, true, -467825416);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (((Class123) aClass123_10507).aClass539_1538 != null) {
			Class151 class151 = ((Class123) aClass123_10507).aClass539_1538.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub3_Sub2) this).aBool10508 = (class528.i() || null != ((Class123) aClass123_10507).aClass539_1538);
		if (null == ((Class521_Sub1_Sub3_Sub2) this).aClass200_10505)
			((Class521_Sub1_Sub3_Sub2) this).aClass200_10505 = Class275_Sub2.method12505((int) (class305.aClass385_3595.aFloat4671), (int) (class305.aClass385_3595.aFloat4672), (int) (class305.aClass385_3595.aFloat4673), class528, (byte) -32);
		else
			Class388.method6694((((Class521_Sub1_Sub3_Sub2) this).aClass200_10505), (int) class305.aClass385_3595.aFloat4671, (int) class305.aClass385_3595.aFloat4672, (int) class305.aClass385_3595.aFloat4673, class528, 234784710);
		return class285;
	}

	Class285 method12989(GraphicalRenderer class505) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 2048, false, true, -1384937123);
		if (null == class528)
			return null;
		Class294 class294 = method11168();
		Class305 class305 = method11166();
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub3_Sub2) this).aBool10506, (byte) -86);
		int i = (int) class305.aClass385_3595.aFloat4671 >> 9;
		int i_19_ = (int) class305.aClass385_3595.aFloat4673 >> 9;
		aClass123_10507.method2119(class505, class528, class294, i, i, i_19_, i_19_, true, 973723182);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (((Class123) aClass123_10507).aClass539_1538 != null) {
			Class151 class151 = ((Class123) aClass123_10507).aClass539_1538.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub3_Sub2) this).aBool10508 = (class528.i() || null != ((Class123) aClass123_10507).aClass539_1538);
		if (null == ((Class521_Sub1_Sub3_Sub2) this).aClass200_10505)
			((Class521_Sub1_Sub3_Sub2) this).aClass200_10505 = Class275_Sub2.method12505((int) (class305.aClass385_3595.aFloat4671), (int) (class305.aClass385_3595.aFloat4672), (int) (class305.aClass385_3595.aFloat4673), class528, (byte) 68);
		else
			Class388.method6694((((Class521_Sub1_Sub3_Sub2) this).aClass200_10505), (int) class305.aClass385_3595.aFloat4671, (int) class305.aClass385_3595.aFloat4672, (int) class305.aClass385_3595.aFloat4673, class528, 1066988598);
		return class285;
	}

	void method13012(GraphicalRenderer class505) {
		MeshRasterizer class528 = aClass123_10507.method2132(class505, 262144, true, true, -1384937123);
		if (class528 != null) {
			Class385 class385 = method11166().aClass385_3595;
			int i = (int) class385.aFloat4671 >> 9;
			int i_20_ = (int) class385.aFloat4673 >> 9;
			aClass123_10507.method2119(class505, class528, method11168(), i, i, i_20_, i_20_, false, 315040844);
		}
	}

	public int method13006() {
		return aClass123_10507.method2115(-674527119);
	}

	public boolean method95() {
		return aClass123_10507.method2117(-917966176);
	}

	final boolean method13011() {
		return false;
	}

	final void method13016(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_21_, int i_22_, boolean bool) {
		throw new IllegalStateException();
	}

	public void method16092(Class476 class476) {
		aClass123_10507.method2116(class476, -1842214258);
	}

	public Class200 method13018(GraphicalRenderer class505) {
		return ((Class521_Sub1_Sub3_Sub2) this).aClass200_10505;
	}

	public void method16093(Class476 class476) {
		aClass123_10507.method2116(class476, -117198698);
	}

	public void method88(GraphicalRenderer class505, int i) {
		aClass123_10507.method2118(class505, 2063033359);
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	public void method93(GraphicalRenderer class505) {
		aClass123_10507.method2136(class505, (byte) -31);
	}

	public void method96() {
		/* empty */
	}

	public Class200 method13019(GraphicalRenderer class505) {
		return ((Class521_Sub1_Sub3_Sub2) this).aClass200_10505;
	}

	public static final void method16094(Class118[] class118s, int i, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_, boolean bool, byte i_30_) {
		Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
		for (int i_31_ = 0; i_31_ < class118s.length; i_31_++) {
			Class118 class118 = class118s[i_31_];
			if (class118 != null && (2110532063 * class118.anInt1305 == i || (i == -1412584499 && client.aClass118_7257 == class118))) {
				int i_32_;
				if (i_29_ == -1) {
					client.aRectangleArray7411[1858642375 * client.anInt7407].setBounds(i_27_ + 597157617 * class118.anInt1299, i_28_ + 198275475 * class118.anInt1428, class118.anInt1301 * 1506818197, class118.anInt1429 * -492594917);
					i_32_ = (client.anInt7407 += -779825161) * 1858642375 - 1;
				} else
					i_32_ = i_29_;
				class118.anInt1449 = i_32_ * 762437895;
				class118.anInt1450 = client.cycles * 526622519;
				if (!client.method11651(class118)) {
					if (0 != class118.anInt1290 * 1449989045)
						Class28.method776(class118, (byte) 119);
					int i_33_ = i_27_ + 597157617 * class118.anInt1299;
					int i_34_ = 198275475 * class118.anInt1428 + i_28_;
					int i_35_ = 1762983005 * class118.anInt1453;
					if (client.aBool7168 && ((client.method11633(class118).anInt7547 * 488242129 != 0) || 0 == class118.anInt1268 * -2131393857) && i_35_ > 127)
						i_35_ = 127;
					if (class118 == client.aClass118_7257) {
						if (i != -1412584499 && ((930045391 * class118.anInt1382 == Class118.anInt1265 * -1267941319) || (930045391 * class118.anInt1382 == -281434611 * Class118.anInt1283) || client.method11633(class118).method12196(-28031909))) {
							Class328.aClass118Array3772 = class118s;
							Class400.anInt4822 = -1596738261 * i_27_;
							IsaacCipher.anInt5157 = 1474036921 * i_28_;
							continue;
						}
						if (client.aBool7364 && client.aBool7403) {
							int i_36_ = Class163.aClass209_2031.method3569(2098527627);
							int i_37_ = Class163.aClass209_2031.method3570(756095591);
							i_36_ -= client.anInt7361 * 290868651;
							i_37_ -= -554256717 * client.anInt7362;
							if (i_36_ < client.anInt7432 * 1326654489)
								i_36_ = client.anInt7432 * 1326654489;
							if (i_36_ + 1506818197 * class118.anInt1301 > (1326654489 * client.anInt7432 + client.anInt7367 * 1831433281))
								i_36_ = (client.anInt7432 * 1326654489 + client.anInt7367 * 1831433281 - class118.anInt1301 * 1506818197);
							if (i_37_ < -2042382973 * client.anInt7265)
								i_37_ = client.anInt7265 * -2042382973;
							if (-492594917 * class118.anInt1429 + i_37_ > (-2042382973 * client.anInt7265 + -1128803311 * client.anInt7476))
								i_37_ = (-1128803311 * client.anInt7476 + -2042382973 * client.anInt7265 - class118.anInt1429 * -492594917);
							if (client.method11633(class118).method12196(1554582083))
								Class292.method5201(i_36_, i_37_, (class118.anInt1301 * 1506818197), (-492594917 * class118.anInt1429), (byte) 12);
							i_33_ = i_36_;
							i_34_ = i_37_;
						}
						if (class118.anInt1382 * 930045391 == -281434611 * Class118.anInt1283)
							i_35_ = 128;
					}
					int i_38_;
					int i_39_;
					int i_40_;
					int i_41_;
					if (class118.anInt1268 * -2131393857 == 2) {
						i_38_ = i_23_;
						i_39_ = i_24_;
						i_40_ = i_25_;
						i_41_ = i_26_;
					} else {
						int i_42_ = i_33_ + class118.anInt1301 * 1506818197;
						int i_43_ = class118.anInt1429 * -492594917 + i_34_;
						if (-2131393857 * class118.anInt1268 == 9) {
							i_42_++;
							i_43_++;
						}
						i_38_ = i_33_ > i_23_ ? i_33_ : i_23_;
						i_39_ = i_34_ > i_24_ ? i_34_ : i_24_;
						i_40_ = i_42_ < i_25_ ? i_42_ : i_25_;
						i_41_ = i_43_ < i_26_ ? i_43_ : i_26_;
					}
					if (i_38_ < i_40_ && i_39_ < i_41_) {
						if (class118.anInt1290 * 1449989045 != 0) {
							if ((-741477579 * Class118.anInt1372 == 1449989045 * class118.anInt1290) || (260799187 * Class118.anInt1436 == class118.anInt1290 * 1449989045)) {
								Class198.method3231(i_33_, i_34_, class118.anInt1301 * 1506818197, -492594917 * class118.anInt1429, (Class118.anInt1436 * 260799187 == 1449989045 * class118.anInt1290), 72550989);
								Class282_Sub23.method12366(i_32_, i_38_, i_39_, i_40_, i_41_, i_33_, i_34_, -368732775);
								Renderers.SOFTWARE_RENDERER.method8421();
								Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
								client.aBoolArray7443[i_32_] = true;
								continue;
							}
							if ((class118.anInt1290 * 1449989045 == 1575345145 * Class118.anInt1269) && -891719545 * client.anInt7341 == 1) {
								if (class118.method2046((Renderers.SOFTWARE_RENDERER), -890940576) != null) {
									Class282_Sub20_Sub24.method15391(-165186170);
									Item.method12574(Renderers.SOFTWARE_RENDERER, class118, i_33_, i_34_, -1198677116);
									Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
								}
								continue;
							}
							if (Class118.anInt1276 * -47064917 == 1449989045 * class118.anInt1290) {
								Class282_Sub50_Sub17.method15506(Renderers.SOFTWARE_RENDERER, i_33_, i_34_, class118, 1138717057);
								continue;
							}
							if (-362135887 * Class118.anInt1300 == class118.anInt1290 * 1449989045) {
								Class366.method6301(Renderers.SOFTWARE_RENDERER, i_33_, i_34_, class118, (class118.anInt1264 * -795991475 % 64), -16711936);
								continue;
							}
							if (-431010797 * Class118.anInt1270 == 1449989045 * class118.anInt1290) {
								if (class118.method2046((Renderers.SOFTWARE_RENDERER), -1781031351) != null) {
									Class278_Sub1.method13448(class118, i_33_, i_34_, 1237889366);
									Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
								}
								continue;
							}
							if (Class118.anInt1313 * 663156097 == class118.anInt1290 * 1449989045) {
								Class282_Sub46.method13407(Renderers.SOFTWARE_RENDERER, IndexLoaders.IMAGE_LOADER, i_33_, i_34_, 1506818197 * class118.anInt1301, class118.anInt1429 * -492594917, (byte) 85);
								client.aBoolArray7443[i_32_] = true;
								Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
								continue;
							}
							if (Class118.anInt1272 * -1417910959 == 1449989045 * class118.anInt1290) {
								LoadingStage.renderMiniMiniMap(Renderers.SOFTWARE_RENDERER, i_33_, i_34_, (class118.anInt1301 * 1506818197), (-492594917 * class118.anInt1429), (short) 20938);
								client.aBoolArray7443[i_32_] = true;
								Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
								continue;
							}
							if (Class118.anInt1273 * -639931977 == class118.anInt1290 * 1449989045) {
								if (client.aBool7176 || client.aBool7177) {
									Class252.method4326(i_33_, i_34_, class118, -2019729413);
									client.aBoolArray7443[i_32_] = true;
								}
								continue;
							}
						}
						if (-2131393857 * class118.anInt1268 == 0) {
							if ((1449989045 * class118.anInt1290 == 1718905043 * Class118.anInt1275) && Renderers.SOFTWARE_RENDERER.method8471())
								Renderers.SOFTWARE_RENDERER.method8525(0, 0, Class349.anInt4083 * -418109423, client.anInt3243 * -969250379);
							method16094(class118s, -1952846363 * class118.anInt1287, i_38_, i_39_, i_40_, i_41_, i_33_ - 276864765 * class118.anInt1311, i_34_ - 682782159 * class118.anInt1312, i_32_, bool, (byte) 6);
							if (null != class118.aClass118Array1439)
								method16094(class118.aClass118Array1439, -1952846363 * class118.anInt1287, i_38_, i_39_, i_40_, i_41_, (i_33_ - class118.anInt1311 * 276864765), (i_34_ - 682782159 * class118.anInt1312), i_32_, bool, (byte) 6);
							Class282_Sub44 class282_sub44 = ((Class282_Sub44) (client.aClass465_7442.method7754((long) (-1952846363 * class118.anInt1287))));
							if (null != class282_sub44)
								Class211.method3629((class282_sub44.anInt8063 * 587626901), i_38_, i_39_, i_40_, i_41_, i_33_, i_34_, i_32_, -1473886497);
							if (1718905043 * Class118.anInt1275 == class118.anInt1290 * 1449989045) {
								if (Renderers.SOFTWARE_RENDERER.method8471())
									Renderers.SOFTWARE_RENDERER.method8474();
								if (4 == client.anInt7341 * -891719545) {
									int i_44_ = client.anInt7238 * 1823561699;
									int i_45_ = client.anInt7377 * 1356525315;
									int i_46_ = client.anInt7413 * 1512368315;
									int i_47_ = -1249044679 * client.anInt7217;
									if (-1809259861 * client.cycles < -1347062991 * client.anInt7237) {
										float f = ((float) ((-1809259861 * client.cycles) - (1475344155 * client.anInt7236)) * 1.0F / (float) ((client.anInt7237 * -1347062991) - (1475344155 * (client.anInt7236))));
										i_44_ = (int) (((float) (1823561699 * (client.anInt7238)) * f) + ((1.0F - f) * (float) (-749035951 * (Class468_Sub2.anInt7868))));
										i_45_ = (int) (((float) (1356525315 * (client.anInt7377)) * f) + ((float) ((Class350_Sub2.anInt7815) * -1105587013) * (1.0F - f)));
										i_46_ = (int) (f * (float) ((client.anInt7413) * 1512368315) + ((float) ((Class329_Sub1.anInt7726) * -551744803) * (1.0F - f)));
										i_47_ = (int) (f * (float) (-1249044679 * (client.anInt7217)) + ((float) (-88550325 * (Class282_Sub17_Sub4.anInt9940)) * (1.0F - f)));
									}
									if (i_44_ > 0)
										Renderers.SOFTWARE_RENDERER.method8425(i_38_, i_39_, i_40_ - i_38_, i_41_ - i_39_, (i_44_ << 24 | i_45_ << 16 | i_46_ << 8 | i_47_), (byte) -107);
								}
							}
							Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
						}
						if (client.aBoolArray7410[i_32_] || 414438813 * client.anInt7412 > 1) {
							if (3 == -2131393857 * class118.anInt1268) {
								if (i_35_ == 0) {
									if (class118.aBool1316)
										Renderers.SOFTWARE_RENDERER.B(i_33_, i_34_, class118.anInt1301 * 1506818197, class118.anInt1429 * -492594917, -795991475 * class118.anInt1264, 0);
									else
										Renderers.SOFTWARE_RENDERER.method8430(i_33_, i_34_, 1506818197 * class118.anInt1301, class118.anInt1429 * -492594917, -795991475 * class118.anInt1264, 0);
								} else if (class118.aBool1316)
									Renderers.SOFTWARE_RENDERER.B(i_33_, i_34_, class118.anInt1301 * 1506818197, class118.anInt1429 * -492594917, (255 - (i_35_ & 0xff) << 24 | (class118.anInt1264 * -795991475 & 0xffffff)), 1);
								else
									Renderers.SOFTWARE_RENDERER.method8430(i_33_, i_34_, class118.anInt1301 * 1506818197, -492594917 * class118.anInt1429, (255 - (i_35_ & 0xff) << 24 | (class118.anInt1264 * -795991475 & 0xffffff)), 1);
							} else if (-2131393857 * class118.anInt1268 == 4) {
								FontRenderer class8 = (class118.method1988(Class487.aClass378_5752, client.anInterface35_7206, 177804367));
								if (null == class8) {
									if (Class118.aBool1399)
										Class109.method1858(class118, (byte) -4);
								} else {
									int i_48_ = -795991475 * class118.anInt1264;
									String string = class118.aString1391;
									if (-56249735 * class118.anInt1426 != -1) {
										ItemDefinitions class425 = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(-56249735 * class118.anInt1426, 75675331));
										string = class425.aString5043;
										if (string == null)
											string = "null";
										if (((318481945 * class425.stackable == 1) || (class118.anInt1427 * 6040081 != 1)) && (6040081 * class118.anInt1427 != -1))
											string = new StringBuilder().append(Class59.method1163(16748608, 619010179)).append(string).append(Class2.aString20).append(" x").append(Class488.method8210((6040081 * class118.anInt1427), -518631775)).toString();
									}
									if (602613369 * class118.anInt1435 != -1) {
										string = (Class148.method2550(602613369 * class118.anInt1435, -1624079582));
										if (string == null)
											string = "";
									}
									if (class118 == client.aClass118_7352) {
										string = (Message.PLEASE_WAIT.translate(Class223.CURRENT_LANGUAGE, -1013521006));
										i_48_ = -795991475 * class118.anInt1264;
									}
									if (client.aBool7358)
										Renderers.SOFTWARE_RENDERER.o(i_33_, i_34_, (1506818197 * class118.anInt1301 + i_33_), i_34_ + (-492594917 * class118.anInt1429));
									if (class118.aBool1363)
										class8.method367(string, i_33_, i_34_, 1506818197 * class118.anInt1301, -492594917 * class118.anInt1429, (255 - (i_35_ & 0xff) << 24 | i_48_), (class118.aBool1420 ? 255 - (i_35_ & 0xff) << 24 : -1), class118.anInt1359 * -220189555, class118.anInt1360 * 1297350181, client.aRandom7260, (-242333475 * PacketsDecoder.anInt9079), client.anIntArray7438, Class182.aClass160Array2261, null, 1113506161);
									else
										class8.method373(string, i_33_, i_34_, class118.anInt1301 * 1506818197, -492594917 * class118.anInt1429, (255 - (i_35_ & 0xff) << 24 | i_48_), (class118.aBool1420 ? 255 - (i_35_ & 0xff) << 24 : -1), class118.anInt1359 * -220189555, class118.anInt1360 * 1297350181, class118.anInt1358 * -753644021, -376720781 * class118.anInt1362, Class182.aClass160Array2261, null, null, 0, 0, (byte) 0);
									if (client.aBool7358)
										Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
								}
							} else if (class118.anInt1268 * -2131393857 == 5) {
								if (class118.anInt1404 * -1546094517 >= 0)
									class118.method2027(IndexLoaders.aClass288_1746, IndexLoaders.aClass45_5759, -1984245878).method4214(Renderers.SOFTWARE_RENDERER, 0, i_33_, i_34_, 1506818197 * class118.anInt1301, class118.anInt1429 * -492594917, class118.anInt1430 * 671850415 << 3, -1492999367 * class118.anInt1431 << 3, 0, 0, -789260204);
								else {
									NativeSprite class160;
									if (-56249735 * class118.anInt1426 != -1) {
										PlayerAppearance class238 = (class118.aBool1388 ? (Class84.myPlayer.playerAppearance) : null);
										class160 = (IndexLoaders.ITEM_INDEX_LOADER.softwareRender(Renderers.SOFTWARE_RENDERER, class118.anInt1426 * -56249735, class118.anInt1427 * 6040081, (class118.anInt1323 * -346307573), (~0xffffff | (1279397863 * class118.anInt1324)), 71935343 * class118.anInt1335, class238, 206421629));
									} else if (-1 != (602613369 * class118.anInt1435))
										class160 = (Class515.method8858(Renderers.SOFTWARE_RENDERER, class118.anInt1435 * 602613369, 1570194813));
									else
										class160 = (class118.method2048(Renderers.SOFTWARE_RENDERER, 1499865683));
									if (null != class160) {
										int i_49_ = class160.method228();
										int i_50_ = class160.method2748();
										int i_51_ = (255 - (i_35_ & 0xff) << 24 | (0 != (-795991475 * class118.anInt1264) ? (class118.anInt1264 * -795991475) & 0xffffff : 16777215));
										if (class118.aBool1322) {
											Renderers.SOFTWARE_RENDERER.o(i_33_, i_34_, i_33_ + (class118.anInt1301 * 1506818197), (i_34_ + (-492594917 * class118.anInt1429)));
											if (0 != (-169127141 * class118.anInt1423)) {
												int i_52_ = (((1506818197 * class118.anInt1301) + (i_49_ - 1)) / i_49_);
												int i_53_ = ((i_50_ - 1 + (-492594917 * (class118.anInt1429))) / i_50_);
												for (int i_54_ = 0; i_54_ < i_52_; i_54_++) {
													for (int i_55_ = 0; i_55_ < i_53_; i_55_++) {
														if ((-795991475 * (class118.anInt1264)) != 0)
															class160.method2790(((float) ((i_54_ * i_49_) + i_33_) + ((float) i_49_ / 2.0F)), (((float) i_50_ / 2.0F) + (float) (i_34_ + i_50_ * i_55_)), 4096, (-169127141 * (class118.anInt1423)), 0, i_51_, 1);
														else
															class160.method2758(((float) (i_33_ + i_49_ * i_54_) + ((float) i_49_ / 2.0F)), ((float) (i_34_ + i_50_ * i_55_) + ((float) i_50_ / 2.0F)), 4096, ((class118.anInt1423) * -169127141));
													}
												}
											} else if (0 != (-795991475 * (class118.anInt1264)) || i_35_ != 0)
												class160.method2772(i_33_, i_34_, (1506818197 * class118.anInt1301), (class118.anInt1429 * -492594917), 0, i_51_, 1);
											else
												class160.method2756(i_33_, i_34_, (class118.anInt1301 * 1506818197), (-492594917 * class118.anInt1429));
											Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
										} else if ((-795991475 * class118.anInt1264) != 0 || 0 != i_35_) {
											if (0 != (class118.anInt1423 * -169127141))
												class160.method2790(((float) (1506818197 * (class118.anInt1301)) / 2.0F) + (float) i_33_, ((float) ((class118.anInt1429) * -492594917) / 2.0F) + (float) i_34_, (class118.anInt1301 * 59330560 / i_49_), (class118.anInt1423 * -169127141), 0, i_51_, 1);
											else if ((i_49_ != (class118.anInt1301 * 1506818197)) || (i_50_ != (-492594917 * (class118.anInt1429))))
												class160.method2754(i_33_, i_34_, (1506818197 * class118.anInt1301), (class118.anInt1429 * -492594917), 0, i_51_, 1);
											else
												class160.method2742(i_33_, i_34_, 0, i_51_, 1);
										} else if (0 != (class118.anInt1423 * -169127141))
											class160.method2758(((float) (class118.anInt1301 * 1506818197) / 2.0F + (float) i_33_), ((float) i_34_ + ((float) (-492594917 * (class118.anInt1429)) / 2.0F)), (class118.anInt1301 * 59330560 / i_49_), (class118.anInt1423 * -169127141));
										else if (((1506818197 * class118.anInt1301) != i_49_) || ((-492594917 * class118.anInt1429) != i_50_))
											class160.method2789(i_33_, i_34_, (1506818197 * class118.anInt1301), (-492594917 * class118.anInt1429));
										else
											class160.method2752(i_33_, i_34_);
									} else if (Class118.aBool1399)
										Class109.method1858(class118, (byte) 43);
								}
							} else if (6 == class118.anInt1268 * -2131393857) {
								IndexLoaders.MAP_REGION_DECODER.method4435((byte) 1).method4052((byte) 1);
								MeshRasterizer class528 = null;
								int i_56_ = 2048;
								if (0 != class118.anInt1354 * -1613167741)
									i_56_ |= 0x80000;
								int i_57_ = 0;
								if (class118.anInt1426 * -56249735 != -1) {
									ItemDefinitions class425 = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(class118.anInt1426 * -56249735, 202135928));
									if (class425 != null) {
										class425 = class425.method7090(((class118.anInt1427) * 6040081), (byte) 107);
										class528 = (class425.method7084(Renderers.SOFTWARE_RENDERER, i_56_, 1, (class118.aBool1388 ? (Class84.myPlayer.playerAppearance) : null), class118.aClass456_1437, 0, 0, 0, 0, (byte) 0));
										if (null != class528)
											i_57_ = -class528.YA() >> 1;
										else
											Class109.method1858(class118, (byte) 15);
									}
								} else if (3 == (class118.anInt1329 * 2131324949)) {
									int i_58_ = class118.anInt1330 * -402732635;
									if (i_58_ >= 0 && i_58_ < 2048) {
										Player class521_sub1_sub1_sub2_sub1 = (client.players[i_58_]);
										if ((null != class521_sub1_sub1_sub2_sub1) && ((client.anInt7315 * 1595512269 == i_58_) || ((Class272.method4840((class521_sub1_sub1_sub2_sub1.displayName), (byte) 111)) == (class118.anInt1339 * 1871217945)))) {
											class528 = (class118.method2002(Renderers.SOFTWARE_RENDERER, i_56_, (IndexLoaders.aClass211_9383), IndexLoaders.aClass31_204, (IndexLoaders.NPC_INDEX_LOADER), IndexLoaders.ITEM_INDEX_LOADER, IndexLoaders.aClass523_3868, Class158_Sub1.aClass3_8507, class118.aClass456_1437, (class521_sub1_sub1_sub2_sub1.playerAppearance), -1254103030));
											if (null == class528 && Class118.aBool1399)
												Class109.method1858(class118, (byte) -76);
										}
									}
								} else if (5 == (class118.anInt1329 * 2131324949)) {
									int i_59_ = -402732635 * class118.anInt1330;
									if (i_59_ >= 0 && i_59_ < 2048) {
										Player class521_sub1_sub1_sub2_sub1 = (client.players[i_59_]);
										if ((null != class521_sub1_sub1_sub2_sub1) && (i_59_ == (1595512269 * client.anInt7315) || ((Class272.method4840((class521_sub1_sub1_sub2_sub1.displayName), (byte) 17)) == (1871217945 * (class118.anInt1339)))))
											class528 = (class521_sub1_sub1_sub2_sub1.playerAppearance.method3998(Renderers.SOFTWARE_RENDERER, i_56_, (IndexLoaders.aClass211_9383), IndexLoaders.aClass31_204, (IndexLoaders.NPC_INDEX_LOADER), IndexLoaders.ITEM_INDEX_LOADER, IndexLoaders.aClass523_3868, Class158_Sub1.aClass3_8507, class118.aClass456_1437, null, null, null, 0, true, Class473.DEFAULTS_LOADER_6, (short) -10357));
									}
								} else if (2131324949 * class118.anInt1329 == 8 || 9 == (class118.anInt1329 * 2131324949)) {
									Class282_Sub30 class282_sub30 = Class517.method11127(((class118.anInt1330) * -402732635), false, 1899477275);
									if (null != class282_sub30)
										class528 = (class282_sub30.method12429(Renderers.SOFTWARE_RENDERER, i_56_, class118.aClass456_1437, (1871217945 * class118.anInt1339), (2131324949 * class118.anInt1329) == 9, (class118.aBool1388 ? (Class84.myPlayer.playerAppearance) : null), -1983093950));
								} else if (class118.aClass456_1437 == null || !class118.aClass456_1437.method7564(1507425525)) {
									class528 = (class118.method2002(Renderers.SOFTWARE_RENDERER, i_56_, IndexLoaders.aClass211_9383, IndexLoaders.aClass31_204, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_INDEX_LOADER, IndexLoaders.aClass523_3868, Class158_Sub1.aClass3_8507, null, (Class84.myPlayer.playerAppearance), -1254103030));
									if (null == class528 && Class118.aBool1399)
										Class109.method1858(class118, (byte) -35);
								} else {
									class528 = (class118.method2002(Renderers.SOFTWARE_RENDERER, i_56_, IndexLoaders.aClass211_9383, IndexLoaders.aClass31_204, IndexLoaders.NPC_INDEX_LOADER, IndexLoaders.ITEM_INDEX_LOADER, IndexLoaders.aClass523_3868, Class158_Sub1.aClass3_8507, class118.aClass456_1437, (Class84.myPlayer.playerAppearance), -1254103030));
									if (class528 == null && Class118.aBool1399)
										Class109.method1858(class118, (byte) -7);
								}
								if (null != class528) {
									if (0 != class118.anInt1354 * -1613167741)
										class528.PA(1413938227 * class118.anInt1340, -1723915925 * class118.anInt1350, class118.anInt1281 * 931721901, class118.anInt1354 * -1613167741);
									int i_60_;
									if (-1326245411 * class118.anInt1417 > 0)
										i_60_ = ((class118.anInt1301 * 1506818197 << 9) / (class118.anInt1417 * -1326245411));
									else
										i_60_ = 512;
									int i_61_;
									if (class118.anInt1326 * 480196683 > 0)
										i_61_ = ((class118.anInt1429 * -492594917 << 9) / (class118.anInt1326 * 480196683));
									else
										i_61_ = 512;
									int i_62_ = i_33_ + (class118.anInt1301 * 1506818197 / 2);
									int i_63_ = (-492594917 * class118.anInt1429 / 2 + i_34_);
									if (!class118.aBool1332) {
										i_62_ += i_60_ * (class118.anInt1441 * 1137958705) >> 9;
										i_63_ += (i_61_ * (1521392511 * class118.anInt1263) >> 9);
									}
									client.aClass294_7457.method5212();
									Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
									Class384 class384 = Renderers.SOFTWARE_RENDERER.method8449();
									int i_64_ = IndexLoaders.MAP_REGION_DECODER.method4544(-1051442584);
									int i_65_ = IndexLoaders.MAP_REGION_DECODER.method4522(-1749801746);
									i_65_ += -1823193031 * class118.anInt1343;
									if (class118.aBool1344) {
										if (class118.aBool1332)
											class384.method6532((float) i_62_, (float) i_63_, (float) i_60_, (float) i_61_, (float) i_64_, (float) i_65_, (float) (Class349.anInt4083 * -418109423), (float) (client.anInt3243 * -969250379), (float) (class118.anInt1343 * -1823193031));
										else
											class384.method6532((float) i_62_, (float) i_63_, (float) i_60_, (float) i_61_, (float) i_64_, (float) i_65_, (float) (Class349.anInt4083 * -418109423), (float) (client.anInt3243 * -969250379), (float) ((class118.anInt1343 * -1823193031) << 2));
									} else
										class384.method6531((float) i_62_, (float) i_63_, (float) i_60_, (float) i_61_, (float) i_64_, (float) i_65_, (float) (-418109423 * Class349.anInt4083), (float) (client.anInt3243 * -969250379));
									Renderers.SOFTWARE_RENDERER.method8424(class384);
									Renderers.SOFTWARE_RENDERER.ba(2, 0);
									if (class118.aBool1345)
										Renderers.SOFTWARE_RENDERER.RA(false);
									if (class118.aBool1332) {
										client.aClass294_7169.method5217(1.0F, 0.0F, 0.0F, (Class382.method6508(class118.anInt1385 * -1627383873)));
										client.aClass294_7169.method5220(0.0F, 1.0F, 0.0F, (Class382.method6508(682349813 * class118.anInt1336)));
										client.aClass294_7169.method5220(0.0F, 0.0F, 1.0F, (Class382.method6508(class118.anInt1337 * -1009302201)));
										client.aClass294_7169.method5219((float) (1137958705 * class118.anInt1441), (float) (class118.anInt1263 * 1521392511), (float) (1530586333 * class118.anInt1304));
									} else {
										int i_66_ = (((Class382.anIntArray4657[(-1627383873 * class118.anInt1385) << 3]) * ((class118.anInt1343 * -1823193031) << 2)) >> 14);
										int i_67_ = ((((class118.anInt1343 * -1823193031) << 2) * (Class382.anIntArray4661[(class118.anInt1385 * -1627383873) << 3])) >> 14);
										client.aClass294_7169.method5217(0.0F, 0.0F, 1.0F, (Class382.method6508(-(-1009302201 * class118.anInt1337) << 3)));
										client.aClass294_7169.method5220(0.0F, 1.0F, 0.0F, (Class382.method6508(682349813 * class118.anInt1336 << 3)));
										client.aClass294_7169.method5219((float) ((1552292309 * class118.anInt1293) << 2), (float) (i_66_ + ((class118.anInt1334 * 539377845) << 2) + i_57_), (float) (i_67_ + ((539377845 * class118.anInt1334) << 2)));
										client.aClass294_7169.method5220(1.0F, 0.0F, 0.0F, (Class382.method6508(class118.anInt1385 * -1627383873 << 3)));
									}
									class118.method1991((Renderers.SOFTWARE_RENDERER), class528, client.aClass294_7169, (client.cycles * -1809259861), (byte) -118);
									if (client.aBool7358)
										Renderers.SOFTWARE_RENDERER.o(i_33_, i_34_, (class118.anInt1301 * 1506818197 + i_33_), (class118.anInt1429 * -492594917 + i_34_));
									class528.method11282(client.aClass294_7169, null, 1);
									if (!class118.aBool1344 && null != class118.aClass539_1452)
										Renderers.SOFTWARE_RENDERER.method8456(class118.aClass539_1452.method11533());
									if (client.aBool7358)
										Renderers.SOFTWARE_RENDERER.r(i_23_, i_24_, i_25_, i_26_);
									if (class118.aBool1345)
										Renderers.SOFTWARE_RENDERER.RA(true);
								}
							} else if (9 == -2131393857 * class118.anInt1268) {
								int i_68_;
								int i_69_;
								int i_70_;
								int i_71_;
								if (class118.aBool1357) {
									i_68_ = i_33_;
									i_69_ = i_34_ + (class118.anInt1429 * -492594917);
									i_70_ = i_33_ + (class118.anInt1301 * 1506818197);
									i_71_ = i_34_;
								} else {
									i_68_ = i_33_;
									i_69_ = i_34_;
									i_70_ = (1506818197 * class118.anInt1301 + i_33_);
									i_71_ = i_34_ + (-492594917 * class118.anInt1429);
								}
								if (1 == class118.anInt1377 * -728430911)
									Renderers.SOFTWARE_RENDERER.method8433(i_68_, i_69_, i_70_, i_71_, class118.anInt1264 * -795991475, 0);
								else
									Renderers.SOFTWARE_RENDERER.method8496(i_68_, i_69_, i_70_, i_71_, class118.anInt1264 * -795991475, class118.anInt1377 * -728430911, 0);
							}
						}
					}
				}
			}
		}
	}

	static final void method16095(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class263.method4772(class118, class98, class527, (byte) 12);
	}
}
