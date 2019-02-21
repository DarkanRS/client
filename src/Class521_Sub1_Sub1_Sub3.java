/* Class521_Sub1_Sub1_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class521_Sub1_Sub1_Sub3 extends Class521_Sub1_Sub1 {
	public int anInt10382;
	int anInt10383;
	public int anInt10384;
	int anInt10385;
	int anInt10386;
	int anInt10387;
	int anInt10388;
	int anInt10389;
	double aDouble10390;
	int anInt10391;
	public int anInt10392;
	public int anInt10393;
	double aDouble10394;
	double aDouble10395;
	double aDouble10396;
	double aDouble10397;
	boolean aBool10398 = false;
	Animation aClass456_10399;
	boolean aBool10400;
	boolean aBool10401;
	Class539 aClass539_10402;

	boolean method12999() {
		return false;
	}

	boolean method12986(int i) {
		return false;
	}

	public void method15902() {
		if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398) {
			if (((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765 != 0) {
				Animable class521_sub1_sub1_sub2 = null;
				if (-891719545 * client.anInt7341 == 4)
					class521_sub1_sub1_sub2 = Class82.aClass75Array804[(((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1].method1342((byte) 107);
				else if ((-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) < 0) {
					int i = (-(-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) - 1);
					if (i == client.anInt7315 * 1595512269)
						class521_sub1_sub1_sub2 = Class84.myPlayer;
					else
						class521_sub1_sub1_sub2 = client.players[i];
				} else {
					int i = ((((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1);
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i));
					if (null != class282_sub47)
						class521_sub1_sub1_sub2 = ((Animable) class282_sub47.anObject8068);
				}
				if (null != class521_sub1_sub1_sub2) {
					Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
					method11172(class385.x, (float) ((Class504.method8389((int) class385.x, (int) class385.z, plane, (byte) 115)) - (-100801035 * (((Class521_Sub1_Sub1_Sub3) this).anInt10383))), class385.z);
					if ((((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371) >= 0) {
						RenderAnimDefs class227 = class521_sub1_sub1_sub2.getRenderAnimDefs((byte) -17);
						int i = 0;
						int i_0_ = 0;
						if (class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[(1480934371 * (((Class521_Sub1_Sub1_Sub3) this).anInt10391))])) {
							i += (class227.anIntArrayArray2802[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_0_ += (class227.anIntArrayArray2802[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371][2]);
						}
						if (class227.anIntArrayArray2791 != null && (class227.anIntArrayArray2791[(((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371)]) != null) {
							i += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_0_ += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][2]);
						}
						if (i != 0 || 0 != i_0_) {
							int i_1_ = class521_sub1_sub1_sub2.aClass19_10359.method578((byte) 2);
							int i_2_ = i_1_;
							if (class521_sub1_sub1_sub2.anIntArray10362 != null && (class521_sub1_sub1_sub2.anIntArray10362[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371]) != -1)
								i_2_ = (class521_sub1_sub1_sub2.anIntArray10362[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391]);
							int i_3_ = i_2_ - i_1_ & 0x3fff;
							int i_4_ = Class382.anIntArray4657[i_3_];
							int i_5_ = Class382.anIntArray4661[i_3_];
							int i_6_ = i_4_ * i_0_ + i * i_5_ >> 14;
							i_0_ = i_0_ * i_5_ - i_4_ * i >> 14;
							i = i_6_;
							Vector3 class385_7_ = Vector3.method6623(method11166().aClass385_3595);
							class385_7_.x += (float) i;
							class385_7_.z += (float) i_0_;
							method11171(class385_7_);
							class385_7_.method6624();
						}
					}
				}
			}
		}
	}

	public void method15903(int i) {
		if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398) {
			if (((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765 != 0) {
				Animable class521_sub1_sub1_sub2 = null;
				if (-891719545 * client.anInt7341 == 4)
					class521_sub1_sub1_sub2 = Class82.aClass75Array804[(((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1].method1342((byte) 61);
				else if ((-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) < 0) {
					int i_8_ = (-(-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) - 1);
					if (i_8_ == client.anInt7315 * 1595512269)
						class521_sub1_sub1_sub2 = Class84.myPlayer;
					else
						class521_sub1_sub1_sub2 = (client.players[i_8_]);
				} else {
					int i_9_ = ((((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1);
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i_9_));
					if (null != class282_sub47)
						class521_sub1_sub1_sub2 = ((Animable) class282_sub47.anObject8068);
				}
				if (null != class521_sub1_sub1_sub2) {
					Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
					method11172(class385.x, (float) ((Class504.method8389((int) class385.x, (int) class385.z, plane, (byte) 26)) - (-100801035 * (((Class521_Sub1_Sub1_Sub3) this).anInt10383))), class385.z);
					if ((((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371) >= 0) {
						RenderAnimDefs class227 = class521_sub1_sub1_sub2.getRenderAnimDefs((byte) -17);
						int i_10_ = 0;
						int i_11_ = 0;
						if (class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[(1480934371 * (((Class521_Sub1_Sub1_Sub3) this).anInt10391))])) {
							i_10_ += (class227.anIntArrayArray2802[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_11_ += (class227.anIntArrayArray2802[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371][2]);
						}
						if (class227.anIntArrayArray2791 != null && (class227.anIntArrayArray2791[(((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371)]) != null) {
							i_10_ += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_11_ += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][2]);
						}
						if (i_10_ != 0 || 0 != i_11_) {
							int i_12_ = class521_sub1_sub1_sub2.aClass19_10359.method578((byte) 2);
							int i_13_ = i_12_;
							if (class521_sub1_sub1_sub2.anIntArray10362 != null && (class521_sub1_sub1_sub2.anIntArray10362[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371]) != -1)
								i_13_ = (class521_sub1_sub1_sub2.anIntArray10362[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391]);
							int i_14_ = i_13_ - i_12_ & 0x3fff;
							int i_15_ = Class382.anIntArray4657[i_14_];
							int i_16_ = Class382.anIntArray4661[i_14_];
							int i_17_ = i_15_ * i_11_ + i_10_ * i_16_ >> 14;
							i_11_ = i_11_ * i_16_ - i_15_ * i_10_ >> 14;
							i_10_ = i_17_;
							Vector3 class385_18_ = Vector3.method6623(method11166().aClass385_3595);
							class385_18_.x += (float) i_10_;
							class385_18_.z += (float) i_11_;
							method11171(class385_18_);
							class385_18_.method6624();
						}
					}
				}
			}
		}
	}

	public Class200 method12992(GraphicalRenderer class505, byte i) {
		return null;
	}

	public final void method15904(int i, int i_19_, int i_20_, int i_21_, int i_22_) {
		Vector3 class385 = Vector3.method6623(method11166().aClass385_3595);
		if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398) {
			float f = (float) i - class385.x;
			float f_23_ = (float) i_19_ - class385.z;
			float f_24_ = (float) Math.sqrt((double) (f_23_ * f_23_ + f * f));
			if (0.0F != f_24_) {
				class385.x += f * (float) (((Class521_Sub1_Sub1_Sub3) this).anInt10388 * 36370993) / f_24_;
				class385.z += f_23_ * (float) (36370993 * (((Class521_Sub1_Sub1_Sub3) this).anInt10388)) / f_24_;
			}
			if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
				class385.y = (float) (Class504.method8389((int) class385.x, (int) class385.z, plane, (byte) 116) - -100801035 * (((Class521_Sub1_Sub1_Sub3) this).anInt10383));
			method11171(class385);
		}
		double d = (double) (-780553027 * anInt10392 + 1 - i_21_);
		((Class521_Sub1_Sub1_Sub3) this).aDouble10394 = (double) ((float) i - class385.x) / d;
		((Class521_Sub1_Sub1_Sub3) this).aDouble10395 = (double) ((float) i_19_ - class385.z) / d;
		((Class521_Sub1_Sub1_Sub3) this).aDouble10396 = Math.sqrt((((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) + (((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * ((Class521_Sub1_Sub1_Sub3) this).aDouble10394));
		if (-1 != -699448719 * ((Class521_Sub1_Sub1_Sub3) this).anInt10387) {
			if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398)
				((Class521_Sub1_Sub1_Sub3) this).aDouble10397 = (-((Class521_Sub1_Sub1_Sub3) this).aDouble10396 * Math.tan(0.02454369 * (double) ((((Class521_Sub1_Sub1_Sub3) this).anInt10387) * -699448719)));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10390 = (((double) ((float) i_20_ - class385.y) - ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * d) * 2.0 / (d * d));
		} else
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 = (double) ((float) i_20_ - class385.y) / d;
		class385.method6624();
	}

	boolean method13000() {
		return ((Class521_Sub1_Sub1_Sub3) this).aBool10401;
	}

	public int method12995(int i) {
		return ((Class521_Sub1_Sub1_Sub3) this).anInt10385 * 1701537219;
	}

	public Class200 method13018(GraphicalRenderer class505) {
		return null;
	}

	Class285 method12990(GraphicalRenderer class505, int i) {
		MeshRasterizer class528 = method15907(class505, 2048, 288666020);
		if (class528 == null)
			return null;
		Matrix44Var class294 = method11168();
		method15905(class505, class528, class294, (short) -8736);
		Class285 class285 = Class470.method7824(false, (byte) -59);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null) {
			Class151 class151 = ((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub1_Sub3) this).aBool10401 = class528.i();
		class528.n();
		((Class521_Sub1_Sub1_Sub3) this).anInt10385 = class528.YA() * -1120357653;
		return class285;
	}

	void method12991(GraphicalRenderer class505, int i) {
		MeshRasterizer class528 = method15907(class505, 0, 1850318327);
		if (null != class528) {
			Matrix44Var class294 = method11168();
			((Class521_Sub1_Sub1_Sub3) this).anInt10385 = class528.YA() * -1120357653;
			class528.n();
			method15905(class505, class528, class294, (short) 22710);
		}
	}

	void method14697(byte i) {
		Vector3 class385 = method11166().aClass385_3595;
		aShort9458 = localX = (short) (int) (class385.x / 512.0F);
		aShort9456 = localY = (short) (int) (class385.z / 512.0F);
	}

	void method15905(GraphicalRenderer class505, MeshRasterizer class528, Matrix44Var class294, short i) {
		class528.method11273(class294);
		Class87[] class87s = class528.method11253();
		Class172[] class172s = class528.method11274();
		if ((((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 == null || ((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.aBool7132) && (null != class87s || null != class172s))
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 = Class539.method11557(client.cycles * -1809259861, true);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null) {
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11511(class505, (long) (-1809259861 * client.cycles), class87s, class172s, false);
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11515(plane, aShort9458, localX, aShort9456, localY);
		}
	}

	public void method15906(int i) {
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null)
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11527();
	}

	boolean method12983(GraphicalRenderer class505, int i, int i_25_, int i_26_) {
		return false;
	}

	public int method13003() {
		return ((Class521_Sub1_Sub1_Sub3) this).anInt10385 * 1701537219;
	}

	final void method13013(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_27_, int i_28_, boolean bool, int i_29_) {
		throw new IllegalStateException();
	}

	MeshRasterizer method15907(GraphicalRenderer class505, int i, int i_30_) {
		SpotAnimDefinitions class525 = (IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(((Class521_Sub1_Sub1_Sub3) this).anInt10386 * 867621295, (byte) -54));
		return class525.method11228(class505, i, (((Class521_Sub1_Sub1_Sub3) this).aClass456_10399), (byte) 2, (byte) 57);
	}

	public int method13005() {
		return ((Class521_Sub1_Sub1_Sub3) this).anInt10385 * 1701537219;
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	boolean method13001() {
		return ((Class521_Sub1_Sub1_Sub3) this).aBool10401;
	}

	boolean method13002() {
		return ((Class521_Sub1_Sub1_Sub3) this).aBool10401;
	}

	public int method13017() {
		return ((Class521_Sub1_Sub1_Sub3) this).anInt10385 * 1701537219;
	}

	public void method15908() {
		if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398) {
			if (((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765 != 0) {
				Animable class521_sub1_sub1_sub2 = null;
				if (-891719545 * client.anInt7341 == 4)
					class521_sub1_sub1_sub2 = Class82.aClass75Array804[(((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1].method1342((byte) 94);
				else if ((-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) < 0) {
					int i = (-(-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) - 1);
					if (i == client.anInt7315 * 1595512269)
						class521_sub1_sub1_sub2 = Class84.myPlayer;
					else
						class521_sub1_sub1_sub2 = client.players[i];
				} else {
					int i = ((((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1);
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i));
					if (null != class282_sub47)
						class521_sub1_sub1_sub2 = ((Animable) class282_sub47.anObject8068);
				}
				if (null != class521_sub1_sub1_sub2) {
					Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
					method11172(class385.x, (float) ((Class504.method8389((int) class385.x, (int) class385.z, plane, (byte) 71)) - (-100801035 * (((Class521_Sub1_Sub1_Sub3) this).anInt10383))), class385.z);
					if ((((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371) >= 0) {
						RenderAnimDefs class227 = class521_sub1_sub1_sub2.getRenderAnimDefs((byte) -17);
						int i = 0;
						int i_31_ = 0;
						if (class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[(1480934371 * (((Class521_Sub1_Sub1_Sub3) this).anInt10391))])) {
							i += (class227.anIntArrayArray2802[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_31_ += (class227.anIntArrayArray2802[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371][2]);
						}
						if (class227.anIntArrayArray2791 != null && (class227.anIntArrayArray2791[(((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371)]) != null) {
							i += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_31_ += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][2]);
						}
						if (i != 0 || 0 != i_31_) {
							int i_32_ = class521_sub1_sub1_sub2.aClass19_10359.method578((byte) 2);
							int i_33_ = i_32_;
							if (class521_sub1_sub1_sub2.anIntArray10362 != null && (class521_sub1_sub1_sub2.anIntArray10362[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371]) != -1)
								i_33_ = (class521_sub1_sub1_sub2.anIntArray10362[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391]);
							int i_34_ = i_33_ - i_32_ & 0x3fff;
							int i_35_ = Class382.anIntArray4657[i_34_];
							int i_36_ = Class382.anIntArray4661[i_34_];
							int i_37_ = i_35_ * i_31_ + i * i_36_ >> 14;
							i_31_ = i_31_ * i_36_ - i_35_ * i >> 14;
							i = i_37_;
							Vector3 class385_38_ = Vector3.method6623(method11166().aClass385_3595);
							class385_38_.x += (float) i;
							class385_38_.z += (float) i_31_;
							method11171(class385_38_);
							class385_38_.method6624();
						}
					}
				}
			}
		}
	}

	void method15909(GraphicalRenderer class505, MeshRasterizer class528, Matrix44Var class294) {
		class528.method11273(class294);
		Class87[] class87s = class528.method11253();
		Class172[] class172s = class528.method11274();
		if ((((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 == null || ((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.aBool7132) && (null != class87s || null != class172s))
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 = Class539.method11557(client.cycles * -1809259861, true);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null) {
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11511(class505, (long) (-1809259861 * client.cycles), class87s, class172s, false);
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11515(plane, aShort9458, localX, aShort9456, localY);
		}
	}

	public int method13006() {
		return ((Class521_Sub1_Sub1_Sub3) this).anInt10385 * 1701537219;
	}

	Class285 method13009(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15907(class505, 2048, -52713373);
		if (class528 == null)
			return null;
		Matrix44Var class294 = method11168();
		method15905(class505, class528, class294, (short) -381);
		Class285 class285 = Class470.method7824(false, (byte) -61);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null) {
			Class151 class151 = ((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub1_Sub3) this).aBool10401 = class528.i();
		class528.n();
		((Class521_Sub1_Sub1_Sub3) this).anInt10385 = class528.YA() * -1120357653;
		return class285;
	}

	Class285 method13010(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15907(class505, 2048, 1825252349);
		if (class528 == null)
			return null;
		Matrix44Var class294 = method11168();
		method15905(class505, class528, class294, (short) 8398);
		Class285 class285 = Class470.method7824(false, (byte) -42);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null) {
			Class151 class151 = ((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub1_Sub3) this).aBool10401 = class528.i();
		class528.n();
		((Class521_Sub1_Sub1_Sub3) this).anInt10385 = class528.YA() * -1120357653;
		return class285;
	}

	public Class521_Sub1_Sub1_Sub3(SceneObjectManager class206, int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, boolean bool, int i_51_) {
		super(class206, i_39_, i_40_, i_41_, Class504.method8389(i_41_, i_42_, i_39_, (byte) 25) - i_43_, i_42_, i_41_ >> 9, i_41_ >> 9, i_42_ >> 9, i_42_ >> 9, false, (byte) 0);
		((Class521_Sub1_Sub1_Sub3) this).anInt10385 = 0;
		((Class521_Sub1_Sub1_Sub3) this).aBool10401 = false;
		((Class521_Sub1_Sub1_Sub3) this).anInt10386 = 1731599695 * i;
		anInt10393 = 159483475 * i_44_;
		anInt10392 = -77011307 * i_45_;
		((Class521_Sub1_Sub1_Sub3) this).anInt10387 = -1790689647 * i_46_;
		((Class521_Sub1_Sub1_Sub3) this).anInt10388 = 1293426385 * i_47_;
		((Class521_Sub1_Sub1_Sub3) this).anInt10389 = i_48_ * 314085963;
		anInt10382 = -1316960975 * i_49_;
		((Class521_Sub1_Sub1_Sub3) this).anInt10383 = -1420435875 * i_43_;
		anInt10384 = i_50_ * 1098022889;
		((Class521_Sub1_Sub1_Sub3) this).aBool10400 = bool;
		((Class521_Sub1_Sub1_Sub3) this).aBool10398 = false;
		((Class521_Sub1_Sub1_Sub3) this).anInt10391 = -614065717 * i_51_;
		int i_52_ = ((IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(867621295 * ((Class521_Sub1_Sub1_Sub3) this).anInt10386, (byte) -8).animationId) * -364555849);
		((Class521_Sub1_Sub1_Sub3) this).aClass456_10399 = new Class456_Sub2(this, false);
		((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7567(i_52_, (short) 8960);
		method13008(1, (byte) -89);
	}

	void method13012(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15907(class505, 0, 613981340);
		if (null != class528) {
			Matrix44Var class294 = method11168();
			((Class521_Sub1_Sub1_Sub3) this).anInt10385 = class528.YA() * -1120357653;
			class528.n();
			method15905(class505, class528, class294, (short) -18799);
		}
	}

	void method13023(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15907(class505, 0, 208863314);
		if (null != class528) {
			Matrix44Var class294 = method11168();
			((Class521_Sub1_Sub1_Sub3) this).anInt10385 = class528.YA() * -1120357653;
			class528.n();
			method15905(class505, class528, class294, (short) -29917);
		}
	}

	final void method12984(int i) {
		throw new IllegalStateException();
	}

	final boolean method13011() {
		return false;
	}

	boolean method12987(int i) {
		return ((Class521_Sub1_Sub1_Sub3) this).aBool10401;
	}

	void method14698() {
		Vector3 class385 = method11166().aClass385_3595;
		aShort9458 = localX = (short) (int) (class385.x / 512.0F);
		aShort9456 = localY = (short) (int) (class385.z / 512.0F);
	}

	void method14699() {
		Vector3 class385 = method11166().aClass385_3595;
		aShort9458 = localX = (short) (int) (class385.x / 512.0F);
		aShort9456 = localY = (short) (int) (class385.z / 512.0F);
	}

	public Class200 method13019(GraphicalRenderer class505) {
		return null;
	}

	public final void method15910(int i, short i_53_) {
		((Class521_Sub1_Sub1_Sub3) this).aBool10398 = true;
		Class305 class305 = new Class305(method11166());
		class305.aClass385_3595.x += ((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * (double) i;
		class305.aClass385_3595.z += ((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * (double) i;
		if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
			class305.aClass385_3595.y = (float) (Class504.method8389((int) (class305.aClass385_3595.x), (int) (class305.aClass385_3595.z), plane, (byte) 18) - (((Class521_Sub1_Sub1_Sub3) this).anInt10383 * -100801035));
		else if (((Class521_Sub1_Sub1_Sub3) this).anInt10387 * -699448719 != -1) {
			class305.aClass385_3595.y += (((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i + (double) i * ((double) i * (0.5 * (((Class521_Sub1_Sub1_Sub3) this).aDouble10390))));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 += (double) i * ((Class521_Sub1_Sub1_Sub3) this).aDouble10390;
		} else
			class305.aClass385_3595.y += ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i;
		class305.aClass381_3594.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10397, (((Class521_Sub1_Sub1_Sub3) this).aDouble10396)));
		Quaternion class381 = Quaternion.create();
		class381.angle(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10394, ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) - 3.1415927F));
		class305.aClass381_3594.multiply(class381);
		class381.cache();
		method11191(class305);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7627(1, -1320963255) && ((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7580(1594863337))
			((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7582((byte) -115);
	}

	public Class200 method12993(GraphicalRenderer class505) {
		return null;
	}

	boolean method13020(GraphicalRenderer class505, int i, int i_54_) {
		return false;
	}

	Class285 method12989(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15907(class505, 2048, 886246446);
		if (class528 == null)
			return null;
		Matrix44Var class294 = method11168();
		method15905(class505, class528, class294, (short) 13564);
		Class285 class285 = Class470.method7824(false, (byte) -22);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null) {
			Class151 class151 = ((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub1_Sub3) this).aBool10401 = class528.i();
		class528.n();
		((Class521_Sub1_Sub1_Sub3) this).anInt10385 = class528.YA() * -1120357653;
		return class285;
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	public final void method15911(int i, int i_55_, int i_56_, int i_57_) {
		Vector3 class385 = Vector3.method6623(method11166().aClass385_3595);
		if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398) {
			float f = (float) i - class385.x;
			float f_58_ = (float) i_55_ - class385.z;
			float f_59_ = (float) Math.sqrt((double) (f_58_ * f_58_ + f * f));
			if (0.0F != f_59_) {
				class385.x += f * (float) (((Class521_Sub1_Sub1_Sub3) this).anInt10388 * 36370993) / f_59_;
				class385.z += f_58_ * (float) (36370993 * (((Class521_Sub1_Sub1_Sub3) this).anInt10388)) / f_59_;
			}
			if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
				class385.y = (float) (Class504.method8389((int) class385.x, (int) class385.z, plane, (byte) 118) - -100801035 * (((Class521_Sub1_Sub1_Sub3) this).anInt10383));
			method11171(class385);
		}
		double d = (double) (-780553027 * anInt10392 + 1 - i_57_);
		((Class521_Sub1_Sub1_Sub3) this).aDouble10394 = (double) ((float) i - class385.x) / d;
		((Class521_Sub1_Sub1_Sub3) this).aDouble10395 = (double) ((float) i_55_ - class385.z) / d;
		((Class521_Sub1_Sub1_Sub3) this).aDouble10396 = Math.sqrt((((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) + (((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * ((Class521_Sub1_Sub1_Sub3) this).aDouble10394));
		if (-1 != -699448719 * ((Class521_Sub1_Sub1_Sub3) this).anInt10387) {
			if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398)
				((Class521_Sub1_Sub1_Sub3) this).aDouble10397 = (-((Class521_Sub1_Sub1_Sub3) this).aDouble10396 * Math.tan(0.02454369 * (double) ((((Class521_Sub1_Sub1_Sub3) this).anInt10387) * -699448719)));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10390 = (((double) ((float) i_56_ - class385.y) - ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * d) * 2.0 / (d * d));
		} else
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 = (double) ((float) i_56_ - class385.y) / d;
		class385.method6624();
	}

	public final void method15912(int i, int i_60_, int i_61_, int i_62_) {
		Vector3 class385 = Vector3.method6623(method11166().aClass385_3595);
		if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398) {
			float f = (float) i - class385.x;
			float f_63_ = (float) i_60_ - class385.z;
			float f_64_ = (float) Math.sqrt((double) (f_63_ * f_63_ + f * f));
			if (0.0F != f_64_) {
				class385.x += f * (float) (((Class521_Sub1_Sub1_Sub3) this).anInt10388 * 36370993) / f_64_;
				class385.z += f_63_ * (float) (36370993 * (((Class521_Sub1_Sub1_Sub3) this).anInt10388)) / f_64_;
			}
			if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
				class385.y = (float) (Class504.method8389((int) class385.x, (int) class385.z, plane, (byte) 122) - -100801035 * (((Class521_Sub1_Sub1_Sub3) this).anInt10383));
			method11171(class385);
		}
		double d = (double) (-780553027 * anInt10392 + 1 - i_62_);
		((Class521_Sub1_Sub1_Sub3) this).aDouble10394 = (double) ((float) i - class385.x) / d;
		((Class521_Sub1_Sub1_Sub3) this).aDouble10395 = (double) ((float) i_60_ - class385.z) / d;
		((Class521_Sub1_Sub1_Sub3) this).aDouble10396 = Math.sqrt((((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) + (((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * ((Class521_Sub1_Sub1_Sub3) this).aDouble10394));
		if (-1 != -699448719 * ((Class521_Sub1_Sub1_Sub3) this).anInt10387) {
			if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398)
				((Class521_Sub1_Sub1_Sub3) this).aDouble10397 = (-((Class521_Sub1_Sub1_Sub3) this).aDouble10396 * Math.tan(0.02454369 * (double) ((((Class521_Sub1_Sub1_Sub3) this).anInt10387) * -699448719)));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10390 = (((double) ((float) i_61_ - class385.y) - ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * d) * 2.0 / (d * d));
		} else
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 = (double) ((float) i_61_ - class385.y) / d;
		class385.method6624();
	}

	final boolean method13026() {
		return false;
	}

	public void method15913() {
		if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398) {
			if (((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765 != 0) {
				Animable class521_sub1_sub1_sub2 = null;
				if (-891719545 * client.anInt7341 == 4)
					class521_sub1_sub1_sub2 = Class82.aClass75Array804[(((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1].method1342((byte) 58);
				else if ((-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) < 0) {
					int i = (-(-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) - 1);
					if (i == client.anInt7315 * 1595512269)
						class521_sub1_sub1_sub2 = Class84.myPlayer;
					else
						class521_sub1_sub1_sub2 = client.players[i];
				} else {
					int i = ((((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1);
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i));
					if (null != class282_sub47)
						class521_sub1_sub1_sub2 = ((Animable) class282_sub47.anObject8068);
				}
				if (null != class521_sub1_sub1_sub2) {
					Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
					method11172(class385.x, (float) ((Class504.method8389((int) class385.x, (int) class385.z, plane, (byte) 38)) - (-100801035 * (((Class521_Sub1_Sub1_Sub3) this).anInt10383))), class385.z);
					if ((((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371) >= 0) {
						RenderAnimDefs class227 = class521_sub1_sub1_sub2.getRenderAnimDefs((byte) -17);
						int i = 0;
						int i_65_ = 0;
						if (class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[(1480934371 * (((Class521_Sub1_Sub1_Sub3) this).anInt10391))])) {
							i += (class227.anIntArrayArray2802[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_65_ += (class227.anIntArrayArray2802[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371][2]);
						}
						if (class227.anIntArrayArray2791 != null && (class227.anIntArrayArray2791[(((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371)]) != null) {
							i += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_65_ += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][2]);
						}
						if (i != 0 || 0 != i_65_) {
							int i_66_ = class521_sub1_sub1_sub2.aClass19_10359.method578((byte) 2);
							int i_67_ = i_66_;
							if (class521_sub1_sub1_sub2.anIntArray10362 != null && (class521_sub1_sub1_sub2.anIntArray10362[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371]) != -1)
								i_67_ = (class521_sub1_sub1_sub2.anIntArray10362[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391]);
							int i_68_ = i_67_ - i_66_ & 0x3fff;
							int i_69_ = Class382.anIntArray4657[i_68_];
							int i_70_ = Class382.anIntArray4661[i_68_];
							int i_71_ = i_69_ * i_65_ + i * i_70_ >> 14;
							i_65_ = i_65_ * i_70_ - i_69_ * i >> 14;
							i = i_71_;
							Vector3 class385_72_ = Vector3.method6623(method11166().aClass385_3595);
							class385_72_.x += (float) i;
							class385_72_.z += (float) i_65_;
							method11171(class385_72_);
							class385_72_.method6624();
						}
					}
				}
			}
		}
	}

	public final void method15914(int i) {
		((Class521_Sub1_Sub1_Sub3) this).aBool10398 = true;
		Class305 class305 = new Class305(method11166());
		class305.aClass385_3595.x += ((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * (double) i;
		class305.aClass385_3595.z += ((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * (double) i;
		if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
			class305.aClass385_3595.y = (float) (Class504.method8389((int) (class305.aClass385_3595.x), (int) (class305.aClass385_3595.z), plane, (byte) 28) - (((Class521_Sub1_Sub1_Sub3) this).anInt10383 * -100801035));
		else if (((Class521_Sub1_Sub1_Sub3) this).anInt10387 * -699448719 != -1) {
			class305.aClass385_3595.y += (((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i + (double) i * ((double) i * (0.5 * (((Class521_Sub1_Sub1_Sub3) this).aDouble10390))));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 += (double) i * ((Class521_Sub1_Sub1_Sub3) this).aDouble10390;
		} else
			class305.aClass385_3595.y += ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i;
		class305.aClass381_3594.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10397, (((Class521_Sub1_Sub1_Sub3) this).aDouble10396)));
		Quaternion class381 = Quaternion.create();
		class381.angle(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10394, ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) - 3.1415927F));
		class305.aClass381_3594.multiply(class381);
		class381.cache();
		method11191(class305);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7627(1, 1626910440) && ((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7580(1477130198))
			((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7582((byte) -13);
	}

	public void method15915() {
		if (!((Class521_Sub1_Sub1_Sub3) this).aBool10398) {
			if (((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765 != 0) {
				Animable class521_sub1_sub1_sub2 = null;
				if (-891719545 * client.anInt7341 == 4)
					class521_sub1_sub1_sub2 = Class82.aClass75Array804[(((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1].method1342((byte) 89);
				else if ((-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) < 0) {
					int i = (-(-1488836765 * ((Class521_Sub1_Sub1_Sub3) this).anInt10389) - 1);
					if (i == client.anInt7315 * 1595512269)
						class521_sub1_sub1_sub2 = Class84.myPlayer;
					else
						class521_sub1_sub1_sub2 = client.players[i];
				} else {
					int i = ((((Class521_Sub1_Sub1_Sub3) this).anInt10389 * -1488836765) - 1);
					Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754((long) i));
					if (null != class282_sub47)
						class521_sub1_sub1_sub2 = ((Animable) class282_sub47.anObject8068);
				}
				if (null != class521_sub1_sub1_sub2) {
					Vector3 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
					method11172(class385.x, (float) ((Class504.method8389((int) class385.x, (int) class385.z, plane, (byte) 58)) - (-100801035 * (((Class521_Sub1_Sub1_Sub3) this).anInt10383))), class385.z);
					if ((((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371) >= 0) {
						RenderAnimDefs class227 = class521_sub1_sub1_sub2.getRenderAnimDefs((byte) -17);
						int i = 0;
						int i_73_ = 0;
						if (class227.anIntArrayArray2802 != null && null != (class227.anIntArrayArray2802[(1480934371 * (((Class521_Sub1_Sub1_Sub3) this).anInt10391))])) {
							i += (class227.anIntArrayArray2802[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_73_ += (class227.anIntArrayArray2802[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371][2]);
						}
						if (class227.anIntArrayArray2791 != null && (class227.anIntArrayArray2791[(((Class521_Sub1_Sub1_Sub3) this).anInt10391 * 1480934371)]) != null) {
							i += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][0]);
							i_73_ += (class227.anIntArrayArray2791[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391][2]);
						}
						if (i != 0 || 0 != i_73_) {
							int i_74_ = class521_sub1_sub1_sub2.aClass19_10359.method578((byte) 2);
							int i_75_ = i_74_;
							if (class521_sub1_sub1_sub2.anIntArray10362 != null && (class521_sub1_sub1_sub2.anIntArray10362[(((Class521_Sub1_Sub1_Sub3) this).anInt10391) * 1480934371]) != -1)
								i_75_ = (class521_sub1_sub1_sub2.anIntArray10362[1480934371 * ((Class521_Sub1_Sub1_Sub3) this).anInt10391]);
							int i_76_ = i_75_ - i_74_ & 0x3fff;
							int i_77_ = Class382.anIntArray4657[i_76_];
							int i_78_ = Class382.anIntArray4661[i_76_];
							int i_79_ = i_77_ * i_73_ + i * i_78_ >> 14;
							i_73_ = i_73_ * i_78_ - i_77_ * i >> 14;
							i = i_79_;
							Vector3 class385_80_ = Vector3.method6623(method11166().aClass385_3595);
							class385_80_.x += (float) i;
							class385_80_.z += (float) i_73_;
							method11171(class385_80_);
							class385_80_.method6624();
						}
					}
				}
			}
		}
	}

	public final void method15916(int i) {
		((Class521_Sub1_Sub1_Sub3) this).aBool10398 = true;
		Class305 class305 = new Class305(method11166());
		class305.aClass385_3595.x += ((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * (double) i;
		class305.aClass385_3595.z += ((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * (double) i;
		if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
			class305.aClass385_3595.y = (float) (Class504.method8389((int) (class305.aClass385_3595.x), (int) (class305.aClass385_3595.z), plane, (byte) 66) - (((Class521_Sub1_Sub1_Sub3) this).anInt10383 * -100801035));
		else if (((Class521_Sub1_Sub1_Sub3) this).anInt10387 * -699448719 != -1) {
			class305.aClass385_3595.y += (((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i + (double) i * ((double) i * (0.5 * (((Class521_Sub1_Sub1_Sub3) this).aDouble10390))));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 += (double) i * ((Class521_Sub1_Sub1_Sub3) this).aDouble10390;
		} else
			class305.aClass385_3595.y += ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i;
		class305.aClass381_3594.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10397, (((Class521_Sub1_Sub1_Sub3) this).aDouble10396)));
		Quaternion class381 = Quaternion.create();
		class381.angle(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10394, ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) - 3.1415927F));
		class305.aClass381_3594.multiply(class381);
		class381.cache();
		method11191(class305);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7627(1, -1052149881) && ((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7580(1302835871))
			((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7582((byte) -105);
	}

	public final void method15917(int i) {
		((Class521_Sub1_Sub1_Sub3) this).aBool10398 = true;
		Class305 class305 = new Class305(method11166());
		class305.aClass385_3595.x += ((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * (double) i;
		class305.aClass385_3595.z += ((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * (double) i;
		if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
			class305.aClass385_3595.y = (float) (Class504.method8389((int) (class305.aClass385_3595.x), (int) (class305.aClass385_3595.z), plane, (byte) 76) - (((Class521_Sub1_Sub1_Sub3) this).anInt10383 * -100801035));
		else if (((Class521_Sub1_Sub1_Sub3) this).anInt10387 * -699448719 != -1) {
			class305.aClass385_3595.y += (((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i + (double) i * ((double) i * (0.5 * (((Class521_Sub1_Sub1_Sub3) this).aDouble10390))));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 += (double) i * ((Class521_Sub1_Sub1_Sub3) this).aDouble10390;
		} else
			class305.aClass385_3595.y += ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i;
		class305.aClass381_3594.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10397, (((Class521_Sub1_Sub1_Sub3) this).aDouble10396)));
		Quaternion class381 = Quaternion.create();
		class381.angle(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10394, ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) - 3.1415927F));
		class305.aClass381_3594.multiply(class381);
		class381.cache();
		method11191(class305);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7627(1, 1738263551) && ((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7580(1067367478))
			((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7582((byte) -72);
	}

	final void method13016(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_81_, int i_82_, boolean bool) {
		throw new IllegalStateException();
	}

	public final void method15918(int i) {
		((Class521_Sub1_Sub1_Sub3) this).aBool10398 = true;
		Class305 class305 = new Class305(method11166());
		class305.aClass385_3595.x += ((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * (double) i;
		class305.aClass385_3595.z += ((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * (double) i;
		if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
			class305.aClass385_3595.y = (float) (Class504.method8389((int) (class305.aClass385_3595.x), (int) (class305.aClass385_3595.z), plane, (byte) 75) - (((Class521_Sub1_Sub1_Sub3) this).anInt10383 * -100801035));
		else if (((Class521_Sub1_Sub1_Sub3) this).anInt10387 * -699448719 != -1) {
			class305.aClass385_3595.y += (((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i + (double) i * ((double) i * (0.5 * (((Class521_Sub1_Sub1_Sub3) this).aDouble10390))));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 += (double) i * ((Class521_Sub1_Sub1_Sub3) this).aDouble10390;
		} else
			class305.aClass385_3595.y += ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i;
		class305.aClass381_3594.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10397, (((Class521_Sub1_Sub1_Sub3) this).aDouble10396)));
		Quaternion class381 = Quaternion.create();
		class381.angle(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10394, ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) - 3.1415927F));
		class305.aClass381_3594.multiply(class381);
		class381.cache();
		method11191(class305);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7627(1, 559262999) && ((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7580(1841884579))
			((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7582((byte) -66);
	}

	public final void method15919(int i) {
		((Class521_Sub1_Sub1_Sub3) this).aBool10398 = true;
		Class305 class305 = new Class305(method11166());
		class305.aClass385_3595.x += ((Class521_Sub1_Sub1_Sub3) this).aDouble10394 * (double) i;
		class305.aClass385_3595.z += ((Class521_Sub1_Sub1_Sub3) this).aDouble10395 * (double) i;
		if (((Class521_Sub1_Sub1_Sub3) this).aBool10400)
			class305.aClass385_3595.y = (float) (Class504.method8389((int) (class305.aClass385_3595.x), (int) (class305.aClass385_3595.z), plane, (byte) 45) - (((Class521_Sub1_Sub1_Sub3) this).anInt10383 * -100801035));
		else if (((Class521_Sub1_Sub1_Sub3) this).anInt10387 * -699448719 != -1) {
			class305.aClass385_3595.y += (((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i + (double) i * ((double) i * (0.5 * (((Class521_Sub1_Sub1_Sub3) this).aDouble10390))));
			((Class521_Sub1_Sub1_Sub3) this).aDouble10397 += (double) i * ((Class521_Sub1_Sub1_Sub3) this).aDouble10390;
		} else
			class305.aClass385_3595.y += ((Class521_Sub1_Sub1_Sub3) this).aDouble10397 * (double) i;
		class305.aClass381_3594.angle(1.0F, 0.0F, 0.0F, (float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10397, (((Class521_Sub1_Sub1_Sub3) this).aDouble10396)));
		Quaternion class381 = Quaternion.create();
		class381.angle(0.0F, 1.0F, 0.0F, ((float) Math.atan2(((Class521_Sub1_Sub1_Sub3) this).aDouble10394, ((Class521_Sub1_Sub1_Sub3) this).aDouble10395) - 3.1415927F));
		class305.aClass381_3594.multiply(class381);
		class381.cache();
		method11191(class305);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7627(1, -415799064) && ((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7580(133311853))
			((Class521_Sub1_Sub1_Sub3) this).aClass456_10399.method7582((byte) -22);
	}

	MeshRasterizer method15920(GraphicalRenderer class505, int i) {
		SpotAnimDefinitions class525 = (IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(((Class521_Sub1_Sub1_Sub3) this).anInt10386 * 867621295, (byte) -21));
		return class525.method11228(class505, i, (((Class521_Sub1_Sub1_Sub3) this).aClass456_10399), (byte) 2, (byte) 2);
	}

	final boolean method12985(int i) {
		return false;
	}

	void method15921(GraphicalRenderer class505, MeshRasterizer class528, Matrix44Var class294) {
		class528.method11273(class294);
		Class87[] class87s = class528.method11253();
		Class172[] class172s = class528.method11274();
		if ((((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 == null || ((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.aBool7132) && (null != class87s || null != class172s))
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 = Class539.method11557(client.cycles * -1809259861, true);
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null) {
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11511(class505, (long) (-1809259861 * client.cycles), class87s, class172s, false);
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11515(plane, aShort9458, localX, aShort9456, localY);
		}
	}

	public void method15922() {
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null)
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11527();
	}

	public void method15923() {
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null)
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11527();
	}

	public void method15924() {
		if (((Class521_Sub1_Sub1_Sub3) this).aClass539_10402 != null)
			((Class521_Sub1_Sub1_Sub3) this).aClass539_10402.method11527();
	}
}
