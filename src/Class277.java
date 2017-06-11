/* Class277 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class277 {
	int anInt2939;
	int anInt2940;
	Class387 aClass387_2941;
	Class276 aClass276_2942;
	static int anInt2943 = 512;
	Class320 aClass320_2944;
	int anInt2945;
	int anInt2946;
	int anInt2947;
	int anInt2948;
	Class276[] aClass276Array2949;
	Class57 aClass57_2950;
	int anInt2951;
	int anInt2952;
	Class276[] aClass276Array2953;
	boolean aBoolean2954;
	static Interface_ma anInterface_ma2955;
	int anInt2956;
	int anInt2957;
	byte[] aByteArray2958;
	boolean aBoolean2959;
	Class277 aClass277_2960;
	int anInt2961;
	int anInt2962;
	int anInt2963 = -697848799;
	static int anInt2964;
	public static Class243 aClass243_2965;

	public void method2583(int i, int i_0_, int i_1_) {
		try {
			if (((Class277) this).aBoolean2959) {
				/* empty */
			}
			((Class277) this).anInt2961 = -1739514523 * (i * (i_0_ - -1519560585 * (((Class277) this).anInt2947)) / 255 + -1519560585 * ((Class277) this).anInt2947);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.b(").append(')').toString());
		}
	}

	public void method2584(Class277 class277_2_, int i) {
		try {
			if (((Class277) this).aBoolean2959)
				((Class277) this).anInt2947 = 967778107 * ((Class277) this).anInt2961;
			else if (class277_2_ != null && ((Class277) class277_2_).aBoolean2959)
				((Class277) this).anInt2947 = (-910867015 - 967778107 * ((Class277) class277_2_).anInt2961);
			else
				((Class277) this).anInt2947 = 0;
			((Class277) this).aBoolean2959 = true;
			((Class277) this).aClass277_2960 = class277_2_;
			((Class277) this).anInt2961 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.p(").append(')').toString());
		}
	}

	public void method2585(byte i) {
		try {
			((Class277) this).aBoolean2959 = false;
			((Class277) this).aClass277_2960 = null;
			((Class277) this).anInt2961 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.i(").append(')').toString());
		}
	}

	public boolean method2586(byte i) {
		try {
			return ((Class277) this).aBoolean2959;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.k(").append(')').toString());
		}
	}

	public Class277 method2587(int i) {
		try {
			return ((Class277) this).aClass277_2960;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.d(").append(')').toString());
		}
	}

	public boolean method2588(GraphicsToolkit class_ra, int i, int i_3_, int i_4_) {
		try {
			if (-51566561 * ((Class277) this).anInt2963 != i) {
				((Class277) this).anInt2963 = 697848799 * i;
				int i_5_ = Class422_Sub4.method5639(i, 1272872211);
				if (i_5_ > 512)
					i_5_ = 512;
				if (i_5_ <= 0)
					i_5_ = 1;
				if (i_5_ != ((Class277) this).anInt2946 * -1994130525) {
					((Class277) this).anInt2946 = i_5_ * 285085707;
					((Class277) this).aClass57_2950 = null;
				}
				if (null != ((Class277) this).aClass276Array2949) {
					((Class277) this).anInt2945 = 0;
					int[] is = new int[((Class277) this).aClass276Array2949.length];
					for (int i_6_ = 0; i_6_ < ((Class277) this).aClass276Array2949.length; i_6_++) {
						Class276 class276 = ((Class277) this).aClass276Array2949[i_6_];
						if (class276.method2579(((Class277) this).anInt2957 * 1173193129, 796478559 * ((Class277) this).anInt2948, -226559159 * ((Class277) this).anInt2962, ((Class277) this).anInt2963 * -51566561)) {
							is[((Class277) this).anInt2945 * 1858024591] = ((Class276) class276).anInt2919;
							((Class277) this).aClass276Array2953[((((Class277) this).anInt2945 += 400255599) * 1858024591) - 1] = class276;
						}
					}
					Class419.method5602(is, ((Class277) this).aClass276Array2953, 0, (1858024591 * ((Class277) this).anInt2945) - 1, -641027314);
				}
				((Class277) this).aBoolean2954 = true;
			}
			boolean bool = false;
			if (((Class277) this).aBoolean2954) {
				((Class277) this).aBoolean2954 = false;
				for (int i_7_ = ((Class277) this).anInt2945 * 1858024591 - 1; i_7_ >= 0; i_7_--) {
					boolean bool_8_ = (((Class277) this).aClass276Array2953[i_7_].method2575(class_ra, ((Class277) this).aClass276_2942));
					Class277 class277_9_ = this;
					((Class277) class277_9_).aBoolean2954 = ((Class277) class277_9_).aBoolean2954 | !bool_8_;
					bool |= bool_8_;
				}
			}
			if (0 == i_3_ || !class_ra.method4996())
				((Class277) this).aClass387_2941 = null;
			else if (((Class277) this).aClass387_2941 == null && ((Class277) this).anInt2956 * -680590445 >= 0)
				method2589(class_ra, -1803183146);
			if (((Class277) this).aClass277_2960 != null && ((Class277) this).aClass277_2960 != this) {
				((Class277) this).aClass277_2960.method2585((byte) -39);
				bool |= ((Class277) this).aClass277_2960.method2588(class_ra, i, i_3_, -136782694);
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.u(").append(')').toString());
		}
	}

	void method2589(GraphicsToolkit class_ra, int i) {
		try {
			try {
				boolean bool = Class465.aClass243_6520.method2291((-680590445 * (((Class277) this).anInt2956)), 581664063);
				if (bool) {
					class_ra.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					Model model = Model.method751(Class465.aClass243_6520, (((Class277) this).anInt2956 * -680590445), 0);
					((Class277) this).aClass387_2941 = class_ra.method5037(model, 1099776, 0, 255, 1);
					byte[] is = ((Class277) this).aClass387_2941.ah();
					if (null == is)
						((Class277) this).aByteArray2958 = null;
					else {
						((Class277) this).aByteArray2958 = new byte[is.length];
						System.arraycopy(is, 0, ((Class277) this).aByteArray2958, 0, is.length);
					}
				}
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.x(").append(')').toString());
		}
	}

	public void method2590(GraphicsToolkit class_ra, int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		try {
			method2591(class_ra, i, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, 0, i_17_, true, false, (byte) -1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.r(").append(')').toString());
		}
	}

	public void method2591(GraphicsToolkit class_ra, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, boolean bool, boolean bool_27_, byte i_28_) {
		try {
			int i_29_ = 0;
			if (((Class277) this).aBoolean2959)
				i_29_ = ((Class277) this).anInt2961 * 1447218285;
			if (null != ((Class277) this).aClass277_2960) {
				Class277 class277_30_ = this;
				Class277 class277_31_ = ((Class277) this).aClass277_2960;
				if (class277_30_.hashCode() > class277_31_.hashCode()) {
					class277_30_ = ((Class277) this).aClass277_2960;
					class277_31_ = this;
					i_29_ = 255 - i_29_;
				}
				class277_30_.method2593(class_ra, i, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, bool, bool_27_, i_29_, 2089062848);
				class277_31_.method2593(class_ra, i, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, false, bool_27_, 255 - i_29_, 357729081);
			} else
				method2593(class_ra, i, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_, bool, bool_27_, i_29_, 1191709910);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.q(").append(')').toString());
		}
	}

	void method2592(GraphicsToolkit class_ra, int i, int i_32_, int i_33_, int i_34_, int i_35_) {
		try {
			Matrix3f class222 = class_ra.method5044();
			Matrix3f class222_36_ = new Matrix3f();
			class222_36_.method2062(0.0F, 0.0F, 0.0F);
			class222_36_.method2071(0.0F, -1.0F, 0.0F, Class220.method2049(-i_32_ & 0x3fff));
			class222_36_.method2071(-1.0F, 0.0F, 0.0F, Class220.method2049(-i & 0x3fff));
			class222_36_.method2071(0.0F, 0.0F, -1.0F, Class220.method2049(-i_33_ & 0x3fff));
			class_ra.method5043(class222_36_);
			Matrix3f class222_37_ = new Matrix3f();
			if (738421895 * ((Class277) this).anInt2951 != i_34_) {
				((Class277) this).aClass387_2941.method4742((byte) i_34_, (((Class277) this).aByteArray2958));
				((Class277) this).anInt2951 = i_34_ * -299787977;
			}
			((Class277) this).aClass387_2941.method4739(class222_37_, null, 0);
			class_ra.method5043(class222);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.s(").append(')').toString());
		}
	}

	void method2593(GraphicsToolkit class_ra, int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_, boolean bool, boolean bool_46_, int i_47_, int i_48_) {
		try {
			int i_49_ = 255 - i_47_;
			if (((Class277) this).aClass387_2941 == null) {
				class_ra.ba(2, 0);
				i_43_ = i_43_ + i & 0x3fff;
				if (((Class277) this).anInt2940 * 1461948177 != -1 && ((Class277) this).anInt2946 * -1994130525 != 0) {
					Class53 class53 = anInterface_ma2955.method174(((((Class277) this).anInt2940) * 1461948177), 434799685);
					if (null == ((Class277) this).aClass57_2950 && anInterface_ma2955.method170(((((Class277) this).anInt2940) * 1461948177), (short) 28045)) {
						int[] is = (2 == -2138060883 * class53.anInt528 ? (anInterface_ma2955.method172(((Class277) this).anInt2940 * 1461948177, 0.7F, -1994130525 * ((Class277) this).anInt2946, ((Class277) this).anInt2946 * -1994130525, false, (byte) 2)) : (anInterface_ma2955.method171(((Class277) this).anInt2940 * 1461948177, 0.7F, -1994130525 * ((Class277) this).anInt2946, -1994130525 * ((Class277) this).anInt2946, false, 833981844)));
						((Class277) this).anInt2939 = is[0] * 1667694183;
						((Class277) this).anInt2952 = 918308719 * is[is.length - 1];
						((Class277) this).aClass57_2950 = class_ra.method5031(is, 0, (((Class277) this).anInt2946 * -1994130525), (((Class277) this).anInt2946 * -1994130525), (((Class277) this).anInt2946 * -1994130525), 2072553439);
					}
					int i_50_ = (i_49_ == 255 ? class53.anInt528 * -2138060883 == 2 ? 1 : 0 : 1);
					if (1 == i_50_ && bool)
						class_ra.B(i_38_, i_39_, i_40_, i_41_, i_45_, 0);
					if (((Class277) this).aClass57_2950 != null) {
						int i_51_ = i_42_ * i_41_ / -4096;
						int i_52_;
						for (i_52_ = (i_40_ - i_41_) / 2 + i_43_ * i_41_ / 4096; i_52_ > i_41_; i_52_ -= i_41_) {
							/* empty */
						}
						for (/**/; i_52_ < 0; i_52_ += i_41_) {
							/* empty */
						}
						if (((Class277) this).aClass320_2944 == Class320.aClass320_6547) {
							for (int i_53_ = i_52_ - i_41_; i_53_ < i_40_; i_53_ += i_41_)
								((Class277) this).aClass57_2950.method634(i_38_ + i_53_, i_51_ + i_39_, i_41_, i_41_, 0, i_49_ << 24 | 0xffffff, i_50_);
							if ((150420823 * ((Class277) this).anInt2939 & ~0xffffff) != 0)
								class_ra.method5015(0, 0, i_40_, 1 + (i_39_ + i_51_), (150420823 * (((Class277) this).anInt2939)), (byte) 7);
							if (0 != (((Class277) this).anInt2952 * 1184429967 & ~0xffffff))
								class_ra.method5015(0, i_51_ + i_39_ + i_41_, i_40_, i_41_ - (i_41_ + (i_51_ + i_39_)), ((Class277) this).anInt2952 * 1184429967, (byte) 7);
						} else {
							for (/**/; i_51_ > i_41_; i_51_ -= i_41_) {
								/* empty */
							}
							for (/**/; i_51_ < 0; i_51_ += i_41_) {
								/* empty */
							}
							for (int i_54_ = i_52_ - i_41_; i_54_ < i_40_; i_54_ += i_41_) {
								for (int i_55_ = i_51_ - i_41_; i_55_ < i_41_; i_55_ += i_41_)
									((Class277) this).aClass57_2950.method634(i_38_ + i_54_, i_39_ + i_55_, i_41_, i_41_, 0, i_49_ << 24 | 0xffffff, i_50_);
							}
						}
					}
				} else
					class_ra.B(i_38_, i_39_, i_40_, i_41_, i_49_ << 24 | i_45_, 1);
			} else if (bool_46_) {
				Matrix4f class233 = class_ra.method5045();
				Matrix4f class233_56_ = class_ra.method5045();
				class233.aFloatArray2594[2] = class233.aFloatArray2594[3];
				class233.aFloatArray2594[6] = class233.aFloatArray2594[7];
				class233.aFloatArray2594[10] = class233.aFloatArray2594[11];
				class233.aFloatArray2594[14] = class233.aFloatArray2594[15];
				class_ra.method5182(class233);
				method2592(class_ra, i_42_, i_43_, i_44_, i_47_, -1456826082);
				class_ra.method5182(class233_56_);
			} else {
				if (bool)
					class_ra.ba(3, i_45_);
				method2592(class_ra, i_42_, i_43_, i_44_, i_47_, -1935584987);
			}
			for (int i_57_ = ((Class277) this).anInt2945 * 1858024591 - 1; i_57_ >= 0; i_57_--)
				((Class277) this).aClass276Array2953[i_57_].method2577(class_ra, i_38_, i_39_, i_40_, i_41_, i_42_, i_43_, 1173193129 * ((Class277) this).anInt2957, ((Class277) this).anInt2948 * 796478559, ((Class277) this).anInt2962 * -226559159, i_49_);
			class_ra.ba(2, 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.n(").append(')').toString());
		}
	}

	public Class277(int i, Class276[] class276s, int i_58_, int i_59_, int i_60_, int i_61_, Class320 class320, int i_62_) {
		((Class277) this).aBoolean2954 = true;
		((Class277) this).anInt2957 = i_59_ * 91665049;
		((Class277) this).anInt2948 = i_60_ * -2049962081;
		((Class277) this).anInt2962 = i_61_ * 2095769337;
		((Class277) this).anInt2940 = 318980593 * i;
		((Class277) this).aClass276Array2949 = class276s;
		((Class277) this).aClass320_2944 = class320;
		if (class276s != null) {
			((Class277) this).aClass276Array2953 = new Class276[class276s.length];
			((Class277) this).aClass276_2942 = i_58_ >= 0 ? class276s[i_58_] : null;
		} else {
			((Class277) this).aClass276Array2953 = null;
			((Class277) this).aClass276_2942 = null;
		}
		((Class277) this).anInt2956 = i_62_ * -2035969381;
	}

	static final void method2594(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			class105.anInt1306 = (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * -216431639;
			Tradution.method6054(class105, 2056943984);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.dv(").append(')').toString());
		}
	}

	static final void method2595(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Graphics.method613(class105, class119, class403, 1469378212);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.jw(").append(')').toString());
		}
	}

	static final void method2596(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class422_Sub27.method5722(class105, class403, 1480483039);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.qk(").append(')').toString());
		}
	}

	static final void method2597(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) client.aFloat8949 >> 3;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.agv(").append(')').toString());
		}
	}

	public static void method2598(long[] ls, int[] is, byte i) {
		try {
			Class50.method533(ls, is, 0, ls.length - 1, -373410323);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.k(").append(')').toString());
		}
	}

	public static void sendWalkPacket(Class336 class336) {
		sendWalkPacket(0, class336);
	}

	/*
	 * routeType -1 - normal walk routeType 0 - follow
	 */
	public static void sendWalkPacket(int type, Class336 class336) {
		int stepsCount = (Class298_Sub37.calculateRoute((Class287.myPlayer.scenePositionXQueue[0]), (Class287.myPlayer.scenePositionYQueue[0]), Class287.myPlayer.getSize(), class336, (client.aClass283_8716.getSceneClipDataPlane((Class287.myPlayer.plane))), true, client.calculatedScenePositionXs, client.calculatedScenePositionYs));

		Class298_Sub36 packet = null;
		if (0 == type)
			packet = Class18.method359(OutcommingPacket.WALKING_PACKET, client.gameConnection.aClass449_330, (byte) 51);
		if (type == 1)
			packet = Class18.method359(OutcommingPacket.MINI_WALKING_PACKET, client.gameConnection.aClass449_330, (byte) 28);
		packet.aClass298_Sub53_Sub2_7396.writeByte(5 + stepsCount * 2);
		Class341 class341 = client.aClass283_8716.method2628(681479919);
		packet.aClass298_Sub53_Sub2_7396.writeShort128(class341.gameSceneBaseX * -1760580017);
		packet.aClass298_Sub53_Sub2_7396.write128Byte(Class151.method1644(-545107710) ? 1 : 0, (byte) 1);
		packet.aClass298_Sub53_Sub2_7396.writeShort128(class341.gameSceneBaseY * 283514611);
		for (int c = stepsCount - 1; c >= 0; c--) {
			packet.aClass298_Sub53_Sub2_7396.writeByte(Class285.routeFinderXArray[c]);
			packet.aClass298_Sub53_Sub2_7396.writeByte(Class285.routeFinderYArray[c]);
		}
		Class3.aBoolean63 = false;
		if (stepsCount > 0) {
			Class3.anInt54 = Class285.routeFinderYArray[stepsCount - 1] * -1835291189;
			Class3.anInt62 = Class285.routeFinderXArray[stepsCount - 1] * -1129029761;
		}
		client.gameConnection.method390(packet, (byte) -115);
	}

	/*
	 * default one
	 */
	static Class298_Sub36 createWalkPacket(int localX, int localY, int type) {
		try {
			Class298_Sub36 packet = null;
			if (0 == type)
				packet = Class18.method359(OutcommingPacket.WALKING_PACKET, client.gameConnection.aClass449_330, (byte) 51);
			if (type == 1)
				packet = Class18.method359(OutcommingPacket.MINI_WALKING_PACKET, client.gameConnection.aClass449_330, (byte) 28);
			Class341 class341 = client.aClass283_8716.method2628(681479919);
			packet.aClass298_Sub53_Sub2_7396.writeShort128(class341.gameSceneBaseX * -1760580017 + localX);
			packet.aClass298_Sub53_Sub2_7396.write128Byte(Class151.method1644(-545107710) ? 1 : 0, (byte) 1);
			packet.aClass298_Sub53_Sub2_7396.writeShort128(localY + class341.gameSceneBaseY * 283514611);
			Class3.anInt62 = localY * -1129029761;
			Class3.anInt54 = localX * -1835291189;
			Class3.aBoolean63 = false;
			Class319.method3904(-1884278472);
			return packet;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.bp(").append(')').toString());
		}
	}

	static final void method2600(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = new StringBuilder().append(Class465.method6017((long) (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]) * 60000L, Class321.aClass429_3357.method242(694163818), true, -1759893587)).append(" UTC").toString();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("lm.aam(").append(')').toString());
		}
	}
}
