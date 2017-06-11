/* Class468 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Dimension;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ItemDefinitions {
	public int anInt5700;
	public static int anInt5701 = 1;
	int anInt5702;
	public int anInt5703;
	public int anInt5704;
	public static int anInt5705 = 2;
	short[] aShortArray5706;
	public String aString5707 = "null";
	byte[] aByteArray5708;
	public int anInt5709;
	int anInt5710;
	short[] aShortArray5711;
	short[] aShortArray5712;
	public int anInt5713 = 730923888;
	public int anInt5714 = 0;
	public int anInt5715 = 0;
	public int anInt5716 = 0;
	public int anInt5717 = 0;
	public int anInt5718 = 0;
	public int anInt5719;
	public int anInt5720;
	public int anInt5721;
	public int anInt5722;
	public String[] aStringArray5723;
	public int anInt5724;
	public int anInt5725;
	public static int anInt5726 = 0;
	public int anInt5727;
	public int anInt5728;
	public int anInt5729;
	public int anInt5730;
	public boolean aBoolean5731;
	public String[] aStringArray5732;
	public int anInt5733;
	public boolean aBoolean5734;
	public int anInt5735;
	public int anInt5736;
	int femaleModelId1;
	int anInt5738;
	int anInt5739;
	int anInt5740;
	int anInt5741;
	int anInt5742;
	int anInt5743;
	int anInt5744;
	int anInt5745;
	int femaleModelId2;
	public int anInt5747;
	int anInt5748;
	int male_head_mdltwo;
	int anInt5750;
	Class477 aClass477_5751;
	int[] anIntArray5752;
	int[] anIntArray5753;
	short[] aShortArray5754;
	public int anInt5755;
	int anInt5756;
	public static short[] aShortArray5757 = new short[256];
	int anInt5758;
	int anInt5759;
	int anInt5760;
	int anInt5761;
	int anInt5762;
	public int anInt5763;
	int fem_head_mdltwo;
	public int anInt5765;
	HashTable aClass437_5766;
	public int[] anIntArray5767;
	public int anInt5768;
	int anInt5769;
	public int anInt5770;
	public boolean aBoolean5771;
	public int anInt5772;

	void method6025(int i) {
		try {
			/* empty */
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.a(").append(')').toString());
		}
	}

	void decode(RsByteBuffer class298_sub53, boolean oldItems) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					break;
				}
				method6038(class298_sub53, i_0_, oldItems);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.f(").append(')').toString());
		}
	}

	static void method50123(int x) {
		try {
			Class var_class = java.lang.ClassLoader.class;
			Field field = var_class.getDeclaredField("nativeLibraries");
			Class var_class_124_ = java.lang.reflect.AccessibleObject.class;
			Method method = var_class_124_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
			method.invoke(field, new Object[] { Boolean.TRUE });
		} catch (Throwable throwable) {
			/* empty */
		}
	}

	void method6027(ItemDefinitions class468_1_, ItemDefinitions class468_2_, int i) {
		try {
			((ItemDefinitions) this).anInt5738 = ((ItemDefinitions) class468_1_).anInt5738 * 1;
			anInt5713 = class468_1_.anInt5713 * 1;
			anInt5714 = class468_1_.anInt5714 * 1;
			anInt5715 = class468_1_.anInt5715 * 1;
			anInt5716 = 1 * class468_1_.anInt5716;
			anInt5717 = class468_1_.anInt5717 * 1;
			anInt5718 = class468_1_.anInt5718 * 1;
			((ItemDefinitions) this).aShortArray5754 = ((ItemDefinitions) class468_1_).aShortArray5754;
			((ItemDefinitions) this).aShortArray5706 = ((ItemDefinitions) class468_1_).aShortArray5706;
			((ItemDefinitions) this).aByteArray5708 = ((ItemDefinitions) class468_1_).aByteArray5708;
			((ItemDefinitions) this).aShortArray5711 = ((ItemDefinitions) class468_1_).aShortArray5711;
			((ItemDefinitions) this).aShortArray5712 = ((ItemDefinitions) class468_1_).aShortArray5712;
			aString5707 = class468_2_.aString5707;
			aBoolean5731 = class468_2_.aBoolean5731;
			anInt5721 = class468_2_.anInt5721 * 1;
			anInt5704 = 126481113;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.p(").append(')').toString());
		}
	}

	public final Model method6028(boolean bool, ItemEffects class464, int i) {
		try {
			int i_3_;
			int i_4_;
			int i_5_;
			if (bool) {
				if (class464 != null && class464.aura_cmp_pttwo != null) {
					i_3_ = class464.aura_cmp_pttwo[0];
					i_4_ = class464.aura_cmp_pttwo[1];
					i_5_ = class464.aura_cmp_pttwo[2];
				} else {
					i_3_ = anInt5747 * 1585491093;
					i_4_ = ((ItemDefinitions) this).femaleModelId2 * -1284247975;
					i_5_ = ((ItemDefinitions) this).anInt5741 * -1767718263;
				}
			} else if (class464 != null && null != class464.aura_cmp_ptone) {
				i_3_ = class464.aura_cmp_ptone[0];
				i_4_ = class464.aura_cmp_ptone[1];
				i_5_ = class464.aura_cmp_ptone[2];
			} else {
				i_3_ = anInt5724 * 1343198193;
				i_4_ = ((ItemDefinitions) this).femaleModelId1 * 34210967;
				i_5_ = ((ItemDefinitions) this).anInt5759 * 1313278521;
			}
			if (i_3_ == -1)
				return null;
			Model model = Model.method751((((Class477) (((ItemDefinitions) this).aClass477_5751)).aClass243_5992), i_3_, 0);
			if (model == null)
				return null;
			if (model.size < 13)
				model.method755(2);
			if (i_4_ != -1) {
				Model class64_6_ = Model.method751((((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992), i_4_, 0);
				if (class64_6_.size < 13)
					class64_6_.method755(2);
				if (i_5_ != -1) {
					Model class64_7_ = Model.method751((((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992), i_5_, 0);
					if (class64_7_.size < 13)
						class64_7_.method755(2);
					Model[] class64s = { model, class64_6_, class64_7_ };
					model = new Model(class64s, 3);
				} else {
					Model[] class64s = { model, class64_6_ };
					model = new Model(class64s, 2);
				}
			}
			if (!bool && (0 != ((ItemDefinitions) this).anInt5742 * -1268579363 || 345393423 * ((ItemDefinitions) this).anInt5744 != 0 || 0 != ((ItemDefinitions) this).anInt5748 * 669576861))
				model.method753(((ItemDefinitions) this).anInt5742 * -1268579363, 345393423 * ((ItemDefinitions) this).anInt5744, 669576861 * ((ItemDefinitions) this).anInt5748);
			if (bool && (0 != -1436808331 * ((ItemDefinitions) this).anInt5743 || -92251131 * ((ItemDefinitions) this).anInt5745 != 0 || ((ItemDefinitions) this).anInt5710 * 1813909637 != 0))
				model.method753(((ItemDefinitions) this).anInt5743 * -1436808331, ((ItemDefinitions) this).anInt5745 * -92251131, 1813909637 * ((ItemDefinitions) this).anInt5710);
			if (null != ((ItemDefinitions) this).aShortArray5754) {
				short[] is;
				if (class464 != null && class464.color_palette != null)
					is = class464.color_palette;
				else
					is = ((ItemDefinitions) this).aShortArray5706;
				for (int i_8_ = 0; i_8_ < ((ItemDefinitions) this).aShortArray5754.length; i_8_++)
					model.method756(((ItemDefinitions) this).aShortArray5754[i_8_], is[i_8_]);
			}
			if (null != ((ItemDefinitions) this).aShortArray5711) {
				short[] is;
				if (class464 != null && null != class464.texture_palette)
					is = class464.texture_palette;
				else
					is = ((ItemDefinitions) this).aShortArray5712;
				for (int i_9_ = 0; i_9_ < ((ItemDefinitions) this).aShortArray5711.length; i_9_++)
					model.method752(((ItemDefinitions) this).aShortArray5711[i_9_], is[i_9_]);
			}
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.z(").append(')').toString());
		}
	}

	public final Class387 method6029(GraphicsToolkit class_ra, int i, int i_10_, Class366 class366, Class438 class438, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		try {
			if (null != ((ItemDefinitions) this).anIntArray5752 && i_10_ > 1) {
				int i_16_ = -1;
				for (int i_17_ = 0; i_17_ < 10; i_17_++) {
					if (i_10_ >= ((ItemDefinitions) this).anIntArray5753[i_17_] && 0 != ((ItemDefinitions) this).anIntArray5753[i_17_])
						i_16_ = ((ItemDefinitions) this).anIntArray5752[i_17_];
				}
				if (i_16_ != -1)
					return (((ItemDefinitions) this).aClass477_5751.getItemDefinitions(i_16_).method6029(class_ra, i, 1, class366, class438, i_11_, i_12_, i_13_, i_14_, 2041211835));
			}
			int i_18_ = i;
			if (null != class438)
				i_18_ |= class438.method5829(-1790708337);
			Class387 class387;
			synchronized (((Class477) ((ItemDefinitions) this).aClass477_5751).aClass348_5994) {
				class387 = ((Class387) (((Class477) ((ItemDefinitions) this).aClass477_5751).aClass348_5994.method4184((long) (1027112447 * ((ItemDefinitions) this).anInt5740 | class_ra.anInt5298 * 580915349 << 29))));
			}
			if (null == class387 || class_ra.method5017(class387.m(), i_18_) != 0) {
				if (null != class387)
					i_18_ = class_ra.method5004(i_18_, class387.m());
				int i_19_ = i_18_;
				if (((ItemDefinitions) this).aShortArray5711 != null)
					i_19_ |= 0x8000;
				if (null != ((ItemDefinitions) this).aShortArray5754 || class366 != null)
					i_19_ |= 0x4000;
				if (128 != ((ItemDefinitions) this).anInt5758 * -1773084507)
					i_19_ |= 0x1;
				if (128 != ((ItemDefinitions) this).anInt5758 * -1773084507)
					i_19_ |= 0x2;
				if (((ItemDefinitions) this).anInt5758 * -1773084507 != 128)
					i_19_ |= 0x4;
				Model model = Model.method751((((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992), (((ItemDefinitions) this).anInt5738 * 381556007), 0);
				if (null == model)
					return null;
				if (model.size < 13)
					model.method755(2);
				class387 = (class_ra.method5037(model, i_19_, (((Class477) ((ItemDefinitions) this).aClass477_5751).anInt5991) * -424819635, 64 + 856370373 * ((ItemDefinitions) this).anInt5761, ((ItemDefinitions) this).anInt5762 * 1055603853 + 850));
				if (-1773084507 * ((ItemDefinitions) this).anInt5758 != 128 || 128 != ((ItemDefinitions) this).anInt5702 * 902366341 || 128 != -230848851 * ((ItemDefinitions) this).anInt5739)
					class387.oa(-1773084507 * ((ItemDefinitions) this).anInt5758, 902366341 * ((ItemDefinitions) this).anInt5702, ((ItemDefinitions) this).anInt5739 * -230848851);
				if (((ItemDefinitions) this).aShortArray5754 != null) {
					for (int i_20_ = 0; i_20_ < ((ItemDefinitions) this).aShortArray5754.length; i_20_++) {
						if (((ItemDefinitions) this).aByteArray5708 != null && i_20_ < ((ItemDefinitions) this).aByteArray5708.length)
							class387.X((((ItemDefinitions) this).aShortArray5754[i_20_]), aShortArray5757[(((ItemDefinitions) this).aByteArray5708[i_20_]) & 0xff]);
						else
							class387.X((((ItemDefinitions) this).aShortArray5754[i_20_]), (((ItemDefinitions) this).aShortArray5706[i_20_]));
					}
				}
				if (null != ((ItemDefinitions) this).aShortArray5711) {
					for (int i_21_ = 0; i_21_ < ((ItemDefinitions) this).aShortArray5711.length; i_21_++)
						class387.W(((ItemDefinitions) this).aShortArray5711[i_21_], ((ItemDefinitions) this).aShortArray5712[i_21_]);
				}
				if (null != class366) {
					for (int i_22_ = 0; i_22_ < 10; i_22_++) {
						for (int i_23_ = 0; (i_23_ < Class366.aShortArrayArray3970[i_22_].length); i_23_++) {
							if (class366.anIntArray3973[i_22_] < (Class22.aShortArrayArrayArray278[i_22_][i_23_]).length)
								class387.X((Class366.aShortArrayArray3970[i_22_][i_23_]), (Class22.aShortArrayArrayArray278[i_22_][i_23_][class366.anIntArray3973[i_22_]]));
						}
					}
				}
				class387.KA(i_18_);
				synchronized (((Class477) ((ItemDefinitions) this).aClass477_5751).aClass348_5994) {
					((Class477) ((ItemDefinitions) this).aClass477_5751).aClass348_5994.method4194(class387, (long) (((ItemDefinitions) this).anInt5740 * 1027112447 | class_ra.anInt5298 * 580915349 << 29));
				}
			}
			if (null != class438 || 0 != i_14_) {
				class387 = class387.method4755((byte) 1, i_18_, true);
				if (null != class438)
					class438.method5839(class387, 0, -1330952412);
				if (0 != i_14_)
					class387.PA(i_11_, i_12_, i_13_, i_14_);
			}
			class387.KA(i);
			return class387;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.d(").append(')').toString());
		}
	}

	public ItemDefinitions method6030(int i, int i_24_) {
		try {
			if (null != ((ItemDefinitions) this).anIntArray5752 && i > 1) {
				int i_25_ = -1;
				for (int i_26_ = 0; i_26_ < 10; i_26_++) {
					if (i >= ((ItemDefinitions) this).anIntArray5753[i_26_] && 0 != ((ItemDefinitions) this).anIntArray5753[i_26_])
						i_25_ = ((ItemDefinitions) this).anIntArray5752[i_26_];
				}
				if (-1 != i_25_)
					return ((ItemDefinitions) this).aClass477_5751.getItemDefinitions(i_25_);
			}
			return this;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.u(").append(')').toString());
		}
	}

	int[] method6031(GraphicsToolkit class_ra, GraphicsToolkit class_ra_27_, int i, int i_28_, int i_29_, boolean bool, int i_30_, Class264 class264, Class366 class366, int i_31_) {
		// class_ra beeing used to draw
		try {
			Model model = Model.method751((((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992), 381556007 * ((ItemDefinitions) this).anInt5738, 0);
			if (null == model)
				return null;
			if (model.size < 13)
				model.method755(2);
			if (null != ((ItemDefinitions) this).aShortArray5754) {
				for (int i_32_ = 0; i_32_ < ((ItemDefinitions) this).aShortArray5754.length; i_32_++) {
					if (((ItemDefinitions) this).aByteArray5708 != null && i_32_ < ((ItemDefinitions) this).aByteArray5708.length)
						model.method756((((ItemDefinitions) this).aShortArray5754[i_32_]), aShortArray5757[(((ItemDefinitions) this).aByteArray5708[i_32_]) & 0xff]);
					else
						model.method756((((ItemDefinitions) this).aShortArray5754[i_32_]), (((ItemDefinitions) this).aShortArray5706[i_32_]));
				}
			}
			if (null != ((ItemDefinitions) this).aShortArray5711) {
				for (int i_33_ = 0; i_33_ < ((ItemDefinitions) this).aShortArray5711.length; i_33_++)
					model.method752(((ItemDefinitions) this).aShortArray5711[i_33_], (((ItemDefinitions) this).aShortArray5712[i_33_]));
			}
			if (null != class366) {
				for (int i_34_ = 0; i_34_ < 10; i_34_++) {
					for (int i_35_ = 0; i_35_ < Class366.aShortArrayArray3970[i_34_].length; i_35_++) {
						if (class366.anIntArray3973[i_34_] < (Class22.aShortArrayArrayArray278[i_34_][i_35_]).length)
							model.method756((Class366.aShortArrayArray3970[i_34_][i_35_]), (Class22.aShortArrayArrayArray278[i_34_][i_35_][(class366.anIntArray3973[i_34_])]));
					}
				}
			}
			int i_36_ = 2048;
			boolean bool_37_ = false;
			if (-1773084507 * ((ItemDefinitions) this).anInt5758 != 128 || 128 != 902366341 * ((ItemDefinitions) this).anInt5702 || ((ItemDefinitions) this).anInt5739 * -230848851 != 128) {
				bool_37_ = true;
				i_36_ |= 0x7;
			}
			Class387 class387 = class_ra.method5037(model, i_36_, 64, (((ItemDefinitions) this).anInt5761 * 856370373 + 64), 768 + (((ItemDefinitions) this).anInt5762 * 1055603853));
			if (!class387.method4743())
				return null;
			if (bool_37_)
				class387.oa(-1773084507 * ((ItemDefinitions) this).anInt5758, 902366341 * ((ItemDefinitions) this).anInt5702, ((ItemDefinitions) this).anInt5739 * -230848851);
			Class57 class57 = null;
			if (-1 != -1673957995 * anInt5755) {
				class57 = (((ItemDefinitions) this).aClass477_5751.method6086(class_ra, class_ra_27_, 809765849 * anInt5709, 10, 1, 0, true, true, 0, class264, class366, -1795675060));
				if (null == class57)
					return null;
			} else if (465190555 * anInt5719 != -1) {
				class57 = (((ItemDefinitions) this).aClass477_5751.method6086(class_ra, class_ra_27_, ((ItemDefinitions) this).anInt5756 * -783380935, i, i_28_, i_29_, false, true, 0, class264, class366, 1124646536));
				if (null == class57)
					return null;
			} else if (-1 != anInt5770 * 2083650097) {
				class57 = (((ItemDefinitions) this).aClass477_5751.method6086(class_ra, class_ra_27_, 1981372535 * ((ItemDefinitions) this).anInt5769, i, i_28_, i_29_, false, true, 0, class264, class366, 311548691));
				if (null == class57)
					return null;
			}
			int i_38_;
			if (bool)
				i_38_ = (int) ((double) (1396167403 * anInt5713) * 1.5) << 2;
			else if (2 == i_28_)
				i_38_ = (int) ((double) (1396167403 * anInt5713) * 1.04) << 2;
			else
				i_38_ = anInt5713 * 1396167403 << 2;
			Matrix4f class233 = class_ra.method5045();
			Matrix4f class233_39_ = class_ra.method5036();
			class233_39_.method2152(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) class_ra.method4992((short) -14576).method545(), (float) class_ra.method4992((short) -3255).method552());
			class_ra.method5182(class233_39_);
			class_ra.method5187(0, 0, class_ra.method4992((short) 19509).method545(), class_ra.method4992((short) 21763).method552());
			Matrix3f class222 = new Matrix3f();
			class_ra.method5043(class222);
			class_ra.IA(0.95F + (float) (Math.random() / 10.0));
			class_ra.m(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
			Matrix3f transform = class_ra.method5178(); //Matrix transformations for item rendering
			transform.method2059(0.0F, 0.0F, 1.0F, Class220.method2049(-(anInt5716 * -1368639199) << 3));
			transform.method2071(0.0F, 1.0F, 0.0F, Class220.method2049(anInt5715 * -3355859 << 3));
			transform.method2064((float) (252709809 * anInt5717 << 2), (float) ((((Class220.anIntArray2483[330519029 * anInt5714 << 3]) * i_38_) >> 14) - class387.YA() / 2 + (-1811316489 * anInt5718 << 2)), (float) ((((Class220.anIntArray2474[330519029 * anInt5714 << 3]) * i_38_) >> 14) + (anInt5718 * -1811316489 << 2)));
			transform.method2071(1.0F, 0.0F, 0.0F, Class220.method2049((anInt5714 * 330519029) << 3));
			class_ra.ba(2, 0);
			class_ra.L();
			class_ra.B(0, 0, 36, 32, 0, 0);
			class387.method4739(transform, null, 1);
			class_ra.method5182(class233);
			int[] is = class_ra.aq(0, 0, 36, 32);
			if (i_28_ >= 1) {
				is = method6032(is, -16777214, 224723616);
				if (i_28_ >= 2)
					is = method6032(is, -1, 1899522127);
			}
			if (0 != i_29_)
				method6033(is, i_29_, 1738452390);
			if (-1 != 465190555 * anInt5719)
				class57.method645(0, 0);
			else if (-1 != anInt5770 * 2083650097)
				class57.method645(0, 0);
			class_ra.method5031(is, 0, 36, 36, 32, -1432690829).method645(0, 0);
			if (-1 != anInt5755 * -1673957995)
				class57.method645(0, 0);
			if (1 == i_30_ || 2 == i_30_ && (anInt5704 * 789409129 == 1 || 1 != i) && i != -1)
				class264.method2488(Class108.method1149(i, (((Class477) (((ItemDefinitions) this).aClass477_5751)).aClass429_5997), -2134002342), 0, 9, -256, -16777215, 1072909030);
			is = class_ra.aq(0, 0, 36, 32);
			for (int i_41_ = 0; i_41_ < is.length; i_41_++) {
				if (0 == (is[i_41_] & 0xffffff))
					is[i_41_] = 0;
				else
					is[i_41_] |= ~0xffffff;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.x(").append(')').toString());
		}
	}

	int[] method6032(int[] is, int i, int i_42_) {
		try {
			int[] is_43_ = new int[1152];
			int i_44_ = 0;
			for (int i_45_ = 0; i_45_ < 32; i_45_++) {
				for (int i_46_ = 0; i_46_ < 36; i_46_++) {
					int i_47_ = is[i_44_];
					if (i_47_ == 0) {
						if (i_46_ > 0 && 0 != is[i_44_ - 1])
							i_47_ = i;
						else if (i_45_ > 0 && is[i_44_ - 36] != 0)
							i_47_ = i;
						else if (i_46_ < 35 && 0 != is[1 + i_44_])
							i_47_ = i;
						else if (i_45_ < 31 && 0 != is[i_44_ + 36])
							i_47_ = i;
					}
					is_43_[i_44_++] = i_47_;
				}
			}
			return is_43_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.r(").append(')').toString());
		}
	}

	void method6033(int[] is, int i, int i_48_) {
		try {
			for (int i_49_ = 31; i_49_ > 0; i_49_--) {
				int i_50_ = i_49_ * 36;
				for (int i_51_ = 35; i_51_ > 0; i_51_--) {
					if (is[i_51_ + i_50_] == 0 && 0 != is[i_50_ + i_51_ - 1 - 36])
						is[i_50_ + i_51_] = i;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.q(").append(')').toString());
		}
	}

	public final boolean method6034(boolean bool, ItemEffects class464, byte i) {
		try {
			int i_52_;
			int i_53_;
			int i_54_;
			if (bool) {
				if (class464 != null && class464.aura_cmp_pttwo != null) {
					i_52_ = class464.aura_cmp_pttwo[0];
					i_53_ = class464.aura_cmp_pttwo[1];
					i_54_ = class464.aura_cmp_pttwo[2];
				} else {
					i_52_ = anInt5747 * 1585491093;
					i_53_ = -1284247975 * ((ItemDefinitions) this).femaleModelId2;
					i_54_ = ((ItemDefinitions) this).anInt5741 * -1767718263;
				}
			} else if (class464 != null && null != class464.aura_cmp_ptone) {
				i_52_ = class464.aura_cmp_ptone[0];
				i_53_ = class464.aura_cmp_ptone[1];
				i_54_ = class464.aura_cmp_ptone[2];
			} else {
				i_52_ = anInt5724 * 1343198193;
				i_53_ = ((ItemDefinitions) this).femaleModelId1 * 34210967;
				i_54_ = 1313278521 * ((ItemDefinitions) this).anInt5759;
			}
			if (-1 == i_52_)
				return true;
			boolean bool_55_ = true;
			if (!((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992.method2290(i_52_, 0, -870541215))
				bool_55_ = false;
			if (i_53_ != -1 && !((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992.method2290(i_53_, 0, -1713048725))
				bool_55_ = false;
			if (i_54_ != -1 && !((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992.method2290(i_54_, 0, -818152674))
				bool_55_ = false;
			return bool_55_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.s(").append(')').toString());
		}
	}

	public final boolean method6035(boolean bool, ItemEffects class464, byte i) {
		try {
			int i_56_;
			int i_57_;
			if (bool) {
				if (null != class464 && class464.fem_head_mdls != null) {
					i_56_ = class464.fem_head_mdls[0];
					i_57_ = class464.fem_head_mdls[1];
				} else {
					i_56_ = -1531415419 * ((ItemDefinitions) this).anInt5750;
					i_57_ = ((ItemDefinitions) this).fem_head_mdltwo * 1578724433;
				}
			} else if (null != class464 && null != class464.male_head_mdls) {
				i_56_ = class464.male_head_mdls[0];
				i_57_ = class464.male_head_mdls[1];
			} else {
				i_56_ = ((ItemDefinitions) this).anInt5760 * -1282951055;
				i_57_ = ((ItemDefinitions) this).male_head_mdltwo * 86274879;
			}
			if (i_56_ == -1)
				return true;
			boolean bool_58_ = true;
			if (!((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992.method2290(i_56_, 0, -1403829212))
				bool_58_ = false;
			if (-1 != i_57_ && !((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992.method2290(i_57_, 0, -1542572465))
				bool_58_ = false;
			return bool_58_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.y(").append(')').toString());
		}
	}

	void method6036(ItemDefinitions class468_59_, ItemDefinitions class468_60_, int i) {
		try {
			anInt5721 = 0;
			((ItemDefinitions) this).anInt5738 = 1 * ((ItemDefinitions) class468_59_).anInt5738;
			anInt5713 = class468_59_.anInt5713 * 1;
			anInt5714 = class468_59_.anInt5714 * 1;
			anInt5715 = 1 * class468_59_.anInt5715;
			anInt5716 = 1 * class468_59_.anInt5716;
			anInt5717 = class468_59_.anInt5717 * 1;
			anInt5718 = class468_59_.anInt5718 * 1;
			((ItemDefinitions) this).aShortArray5754 = ((ItemDefinitions) class468_60_).aShortArray5754;
			((ItemDefinitions) this).aShortArray5706 = ((ItemDefinitions) class468_60_).aShortArray5706;
			((ItemDefinitions) this).aByteArray5708 = ((ItemDefinitions) class468_60_).aByteArray5708;
			((ItemDefinitions) this).aShortArray5711 = ((ItemDefinitions) class468_60_).aShortArray5711;
			((ItemDefinitions) this).aShortArray5712 = ((ItemDefinitions) class468_60_).aShortArray5712;
			aString5707 = class468_60_.aString5707;
			aBoolean5731 = class468_60_.aBoolean5731;
			anInt5733 = class468_60_.anInt5733 * 1;
			anInt5772 = class468_60_.anInt5772 * 1;
			anInt5735 = class468_60_.anInt5735 * 1;
			anInt5724 = 1 * class468_60_.anInt5724;
			((ItemDefinitions) this).femaleModelId1 = 1 * ((ItemDefinitions) class468_60_).femaleModelId1;
			((ItemDefinitions) this).anInt5759 = ((ItemDefinitions) class468_60_).anInt5759 * 1;
			anInt5747 = 1 * class468_60_.anInt5747;
			((ItemDefinitions) this).femaleModelId2 = ((ItemDefinitions) class468_60_).femaleModelId2 * 1;
			((ItemDefinitions) this).anInt5741 = 1 * ((ItemDefinitions) class468_60_).anInt5741;
			((ItemDefinitions) this).anInt5742 = 1 * ((ItemDefinitions) class468_60_).anInt5742;
			((ItemDefinitions) this).anInt5743 = 1 * ((ItemDefinitions) class468_60_).anInt5743;
			((ItemDefinitions) this).anInt5744 = 1 * ((ItemDefinitions) class468_60_).anInt5744;
			((ItemDefinitions) this).anInt5745 = ((ItemDefinitions) class468_60_).anInt5745 * 1;
			((ItemDefinitions) this).anInt5748 = ((ItemDefinitions) class468_60_).anInt5748 * 1;
			((ItemDefinitions) this).anInt5710 = 1 * ((ItemDefinitions) class468_60_).anInt5710;
			((ItemDefinitions) this).anInt5760 = ((ItemDefinitions) class468_60_).anInt5760 * 1;
			((ItemDefinitions) this).male_head_mdltwo = ((ItemDefinitions) class468_60_).male_head_mdltwo * 1;
			((ItemDefinitions) this).anInt5750 = ((ItemDefinitions) class468_60_).anInt5750 * 1;
			((ItemDefinitions) this).fem_head_mdltwo = ((ItemDefinitions) class468_60_).fem_head_mdltwo * 1;
			anInt5700 = 1 * class468_60_.anInt5700;
			aStringArray5723 = class468_60_.aStringArray5723;
			((ItemDefinitions) this).aClass437_5766 = ((ItemDefinitions) class468_60_).aClass437_5766;
			anInt5704 = 1 * class468_60_.anInt5704;
			aStringArray5732 = new String[5];
			if (null != class468_60_.aStringArray5732) {
				for (int i_61_ = 0; i_61_ < 4; i_61_++)
					aStringArray5732[i_61_] = class468_60_.aStringArray5732[i_61_];
			}
			aStringArray5732[4] = Tradution.aClass470_5903.method6049((((Class477) (((ItemDefinitions) this).aClass477_5751)).aClass429_5997), -875414210);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.k(").append(')').toString());
		}
	}

	public int method6037(int i, int i_62_, int i_63_) {
		try {
			if (null == ((ItemDefinitions) this).aClass437_5766)
				return i_62_;
			Class298_Sub35 class298_sub35 = ((Class298_Sub35) ((ItemDefinitions) this).aClass437_5766.get((long) i));
			if (null == class298_sub35)
				return i_62_;
			return class298_sub35.anInt7394 * -774922497;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.h(").append(')').toString());
		}
	}

	void method6038(RsByteBuffer stream, int opcode, boolean oldItems) {
		try {
			if (1 == opcode)
				((ItemDefinitions) this).anInt5738 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1019082089;
			else if (2 == opcode)
				aString5707 = stream.readString(1338906243);
			else if (opcode == 4)
				anInt5713 = stream.readUnsignedShort() * -1885125181;
			else if (5 == opcode)
				anInt5714 = stream.readUnsignedShort() * -2068311459;
			else if (6 == opcode)
				anInt5715 = stream.readUnsignedShort() * -629359451;
			else if (7 == opcode) {
				anInt5717 = stream.readUnsignedShort() * -1497539247;
				if (anInt5717 * 252709809 > 32767)
					anInt5717 -= 1565589504;
			} else if (opcode == 8) {
				anInt5718 = stream.readUnsignedShort() * -572964665;
				if (-1811316489 * anInt5718 > 32767)
					anInt5718 -= 1086783488;
			} else if (opcode == 11)
				anInt5704 = 126481113;
			else if (12 == opcode)
				anInt5721 = stream.readInt((byte) -4) * -1375390745;
			else if (opcode == 13)
				anInt5733 = stream.readUnsignedByte() * -2026784241;
			else if (14 == opcode)
				anInt5772 = stream.readUnsignedByte() * -583083477;
			else if (16 == opcode)
				aBoolean5731 = true;
			else if (18 == opcode)
				anInt5720 = stream.readUnsignedShort() * -1741576309;
			else if (opcode == 23)
				anInt5724 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1612514031;
			else if (opcode == 24)
				((ItemDefinitions) this).femaleModelId1 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 582597415;
			else if (25 == opcode)
				anInt5747 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1430077763;
			else if (26 == opcode)
				((ItemDefinitions) this).femaleModelId2 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -336299543;
			else if (opcode == 27)
				anInt5735 = stream.readUnsignedByte() * -1438605935;
			else if (opcode >= 30 && opcode < 35)
				aStringArray5723[opcode - 30] = stream.readString(2111111360);
			else if (opcode >= 35 && opcode < 40)
				aStringArray5732[opcode - 35] = stream.readString(-101192414);
			else if (40 == opcode) {
				int i_65_ = stream.readUnsignedByte();
				((ItemDefinitions) this).aShortArray5754 = new short[i_65_];
				((ItemDefinitions) this).aShortArray5706 = new short[i_65_];
				for (int i_66_ = 0; i_66_ < i_65_; i_66_++) {
					((ItemDefinitions) this).aShortArray5754[i_66_] = (short) stream.readUnsignedShort();
					((ItemDefinitions) this).aShortArray5706[i_66_] = (short) stream.readUnsignedShort();
				}
			} else if (41 == opcode) {
				int i_67_ = stream.readUnsignedByte();
				((ItemDefinitions) this).aShortArray5711 = new short[i_67_];
				((ItemDefinitions) this).aShortArray5712 = new short[i_67_];
				for (int i_68_ = 0; i_68_ < i_67_; i_68_++) {
					((ItemDefinitions) this).aShortArray5711[i_68_] = (short) stream.readUnsignedShort();
					((ItemDefinitions) this).aShortArray5712[i_68_] = (short) stream.readUnsignedShort();
				}
			} else if (opcode == 42) {
				int i_69_ = stream.readUnsignedByte();
				((ItemDefinitions) this).aByteArray5708 = new byte[i_69_];
				for (int i_70_ = 0; i_70_ < i_69_; i_70_++)
					((ItemDefinitions) this).aByteArray5708[i_70_] = stream.readByte(-12558881);
			} else if (43 == opcode) {
				anInt5763 = stream.readInt((byte) 6) * 682064309;
				aBoolean5771 = true;
			} else if (65 == opcode)
				aBoolean5734 = true;
			else if (78 == opcode)
				((ItemDefinitions) this).anInt5759 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 756401161;
			else if (opcode == 79)
				((ItemDefinitions) this).anInt5741 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 2098680761;
			else if (opcode == 90)
				((ItemDefinitions) this).anInt5760 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 1319962769;
			else if (opcode == 91)
				((ItemDefinitions) this).anInt5750 = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * 1598907469;
			else if (opcode == 92)
				((ItemDefinitions) this).male_head_mdltwo = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1935344449;
			else if (93 == opcode)
				((ItemDefinitions) this).fem_head_mdltwo = (oldItems ? stream.readCustomUnsignedShort() : stream.readBigSmart(1235052657)) * -1194369871;
			else if (95 == opcode)
				anInt5716 = stream.readUnsignedShort() * -883520799;
			else if (96 == opcode)
				anInt5765 = stream.readUnsignedByte() * 135187667;
			else if (opcode == 97)
				anInt5709 = stream.readUnsignedShort() * -384973719;
			else if (98 == opcode)
				anInt5755 = stream.readUnsignedShort() * 1831957949;
			else if (opcode >= 100 && opcode < 110) {
				if (((ItemDefinitions) this).anIntArray5752 == null) {
					((ItemDefinitions) this).anIntArray5752 = new int[10];
					((ItemDefinitions) this).anIntArray5753 = new int[10];
				}
				((ItemDefinitions) this).anIntArray5752[opcode - 100] = stream.readUnsignedShort();
				((ItemDefinitions) this).anIntArray5753[opcode - 100] = stream.readUnsignedShort();
			} else if (opcode == 110)
				((ItemDefinitions) this).anInt5758 = stream.readUnsignedShort() * -237762771;
			else if (111 == opcode)
				((ItemDefinitions) this).anInt5702 = stream.readUnsignedShort() * 355882061;
			else if (opcode == 112)
				((ItemDefinitions) this).anInt5739 = stream.readUnsignedShort() * 1219480869;
			else if (opcode == 113)
				((ItemDefinitions) this).anInt5761 = stream.readByte(-12558881) * 712208909;
			else if (opcode == 114)
				((ItemDefinitions) this).anInt5762 = stream.readByte(-12558881) * -1050247335;
			else if (115 == opcode)
				anInt5700 = stream.readUnsignedByte() * 1325490629;
			else if (121 == opcode)
				((ItemDefinitions) this).anInt5756 = stream.readUnsignedShort() * -970653687;
			else if (122 == opcode)
				anInt5719 = stream.readUnsignedShort() * 2015131539;
			else if (opcode == 125) {
				((ItemDefinitions) this).anInt5742 = ((stream.readByte(-12558881) << 2) * -1833538443);
				((ItemDefinitions) this).anInt5744 = (stream.readByte(-12558881) << 2) * -25983505;
				((ItemDefinitions) this).anInt5748 = (stream.readByte(-12558881) << 2) * 1243416501;
			} else if (opcode == 126) {
				((ItemDefinitions) this).anInt5743 = ((stream.readByte(-12558881) << 2) * -1039520547);
				((ItemDefinitions) this).anInt5745 = (stream.readByte(-12558881) << 2) * 1803423949;
				((ItemDefinitions) this).anInt5710 = (stream.readByte(-12558881) << 2) * 519268429;
			} else if (opcode == 127) {
				anInt5729 = stream.readUnsignedByte() * 947829311;
				anInt5725 = stream.readUnsignedShort() * 300082645;
			} else if (128 == opcode) {
				anInt5730 = stream.readUnsignedByte() * -1036837039;
				anInt5703 = stream.readUnsignedShort() * 1829509431;
			} else if (129 == opcode) {
				anInt5736 = stream.readUnsignedByte() * -2098727417;
				anInt5727 = stream.readUnsignedShort() * -48114927;
			} else if (opcode == 130) {
				anInt5722 = stream.readUnsignedByte() * -969618575;
				anInt5728 = stream.readUnsignedShort() * -1531140281;
			} else if (132 == opcode) {
				int i_71_ = stream.readUnsignedByte();
				anIntArray5767 = new int[i_71_];
				for (int i_72_ = 0; i_72_ < i_71_; i_72_++)
					anIntArray5767[i_72_] = stream.readUnsignedShort();
			} else if (134 == opcode)
				anInt5768 = stream.readUnsignedByte() * 1394978643;
			else if (139 == opcode)
				((ItemDefinitions) this).anInt5769 = stream.readUnsignedShort() * 257950023;
			else if (opcode == 140)
				anInt5770 = stream.readUnsignedShort() * 78716625;
			else if (249 == opcode) {
				int i_73_ = stream.readUnsignedByte();
				if (null == ((ItemDefinitions) this).aClass437_5766) {
					int i_74_ = Class416.method5590(i_73_, (byte) 16);
					((ItemDefinitions) this).aClass437_5766 = new HashTable(i_74_);
				}
				for (int i_75_ = 0; i_75_ < i_73_; i_75_++) {
					boolean bool = stream.readUnsignedByte() == 1;
					int i_76_ = stream.read24BitUnsignedInteger((byte) 15);
					Linkable class298;
					if (bool)
						class298 = new Class298_Sub29(stream.readString(-1208778402));
					else
						class298 = new Class298_Sub35(stream.readInt((byte) 69));
					((ItemDefinitions) this).aClass437_5766.method5817(class298, (long) i_76_);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.b(").append(')').toString());
		}
	}

	void method6039(ItemDefinitions class468_77_, ItemDefinitions class468_78_, int i) {
		try {
			anInt5721 = 0;
			((ItemDefinitions) this).anInt5738 = 1 * ((ItemDefinitions) class468_77_).anInt5738;
			anInt5713 = class468_77_.anInt5713 * 1;
			anInt5714 = 1 * class468_77_.anInt5714;
			anInt5715 = class468_77_.anInt5715 * 1;
			anInt5716 = class468_77_.anInt5716 * 1;
			anInt5717 = 1 * class468_77_.anInt5717;
			anInt5718 = 1 * class468_77_.anInt5718;
			((ItemDefinitions) this).aShortArray5754 = ((ItemDefinitions) class468_78_).aShortArray5754;
			((ItemDefinitions) this).aShortArray5706 = ((ItemDefinitions) class468_78_).aShortArray5706;
			((ItemDefinitions) this).aByteArray5708 = ((ItemDefinitions) class468_78_).aByteArray5708;
			((ItemDefinitions) this).aShortArray5711 = ((ItemDefinitions) class468_78_).aShortArray5711;
			((ItemDefinitions) this).aShortArray5712 = ((ItemDefinitions) class468_78_).aShortArray5712;
			aString5707 = class468_78_.aString5707;
			aBoolean5731 = class468_78_.aBoolean5731;
			anInt5733 = 1 * class468_78_.anInt5733;
			anInt5772 = class468_78_.anInt5772 * 1;
			anInt5735 = class468_78_.anInt5735 * 1;
			anInt5724 = class468_78_.anInt5724 * 1;
			((ItemDefinitions) this).femaleModelId1 = ((ItemDefinitions) class468_78_).femaleModelId1 * 1;
			((ItemDefinitions) this).anInt5759 = 1 * ((ItemDefinitions) class468_78_).anInt5759;
			anInt5747 = 1 * class468_78_.anInt5747;
			((ItemDefinitions) this).femaleModelId2 = ((ItemDefinitions) class468_78_).femaleModelId2 * 1;
			((ItemDefinitions) this).anInt5741 = ((ItemDefinitions) class468_78_).anInt5741 * 1;
			((ItemDefinitions) this).anInt5742 = ((ItemDefinitions) class468_78_).anInt5742 * 1;
			((ItemDefinitions) this).anInt5743 = 1 * ((ItemDefinitions) class468_78_).anInt5743;
			((ItemDefinitions) this).anInt5744 = ((ItemDefinitions) class468_78_).anInt5744 * 1;
			((ItemDefinitions) this).anInt5745 = 1 * ((ItemDefinitions) class468_78_).anInt5745;
			((ItemDefinitions) this).anInt5748 = 1 * ((ItemDefinitions) class468_78_).anInt5748;
			((ItemDefinitions) this).anInt5710 = 1 * ((ItemDefinitions) class468_78_).anInt5710;
			((ItemDefinitions) this).anInt5760 = 1 * ((ItemDefinitions) class468_78_).anInt5760;
			((ItemDefinitions) this).male_head_mdltwo = 1 * ((ItemDefinitions) class468_78_).male_head_mdltwo;
			((ItemDefinitions) this).anInt5750 = 1 * ((ItemDefinitions) class468_78_).anInt5750;
			((ItemDefinitions) this).fem_head_mdltwo = 1 * ((ItemDefinitions) class468_78_).fem_head_mdltwo;
			anInt5700 = 1 * class468_78_.anInt5700;
			aStringArray5723 = class468_78_.aStringArray5723;
			((ItemDefinitions) this).aClass437_5766 = ((ItemDefinitions) class468_78_).aClass437_5766;
			aStringArray5732 = new String[5];
			if (class468_78_.aStringArray5732 != null) {
				for (int i_79_ = 0; i_79_ < 4; i_79_++)
					aStringArray5732[i_79_] = class468_78_.aStringArray5732[i_79_];
			}
			aStringArray5732[4] = Tradution.aClass470_5855.method6049((((Class477) (((ItemDefinitions) this).aClass477_5751)).aClass429_5997), -875414210);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.i(").append(')').toString());
		}
	}

	public final Model method6040(boolean bool, ItemEffects class464, int i) {
		try {
			int i_80_;
			int i_81_;
			if (bool) {
				if (class464 != null && null != class464.fem_head_mdls) {
					i_80_ = class464.fem_head_mdls[0];
					i_81_ = class464.fem_head_mdls[1];
				} else {
					i_80_ = ((ItemDefinitions) this).anInt5750 * -1531415419;
					i_81_ = 1578724433 * ((ItemDefinitions) this).fem_head_mdltwo;
				}
			} else if (null != class464 && null != class464.male_head_mdls) {
				i_80_ = class464.male_head_mdls[0];
				i_81_ = class464.male_head_mdls[1];
			} else {
				i_80_ = -1282951055 * ((ItemDefinitions) this).anInt5760;
				i_81_ = ((ItemDefinitions) this).male_head_mdltwo * 86274879;
			}
			if (-1 == i_80_)
				return null;
			Model model = Model.method751((((Class477) (((ItemDefinitions) this).aClass477_5751)).aClass243_5992), i_80_, 0);
			if (model.size < 13)
				model.method755(2);
			if (-1 != i_81_) {
				Model class64_82_ = Model.method751((((Class477) ((ItemDefinitions) this).aClass477_5751).aClass243_5992), i_81_, 0);
				if (class64_82_.size < 13)
					class64_82_.method755(2);
				Model[] class64s = { model, class64_82_ };
				model = new Model(class64s, 2);
			}
			if (null != ((ItemDefinitions) this).aShortArray5754) {
				short[] is;
				if (class464 != null && null != class464.color_palette)
					is = class464.color_palette;
				else
					is = ((ItemDefinitions) this).aShortArray5706;
				for (int i_83_ = 0; i_83_ < ((ItemDefinitions) this).aShortArray5754.length; i_83_++)
					model.method756(((ItemDefinitions) this).aShortArray5754[i_83_], is[i_83_]);
			}
			if (null != ((ItemDefinitions) this).aShortArray5711) {
				short[] is;
				if (null != class464 && class464.texture_palette != null)
					is = class464.texture_palette;
				else
					is = ((ItemDefinitions) this).aShortArray5712;
				for (int i_84_ = 0; i_84_ < ((ItemDefinitions) this).aShortArray5711.length; i_84_++)
					model.method752(((ItemDefinitions) this).aShortArray5711[i_84_], is[i_84_]);
			}
			return model;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.t(").append(')').toString());
		}
	}

	public String method6041(int i, String string, short i_85_) {
		try {
			if (((ItemDefinitions) this).aClass437_5766 == null)
				return string;
			Class298_Sub29 class298_sub29 = ((Class298_Sub29) ((ItemDefinitions) this).aClass437_5766.get((long) i));
			if (class298_sub29 == null)
				return string;
			return (String) class298_sub29.anObject7366;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.v(").append(')').toString());
		}
	}

	ItemDefinitions() {
		anInt5704 = 0;
		anInt5720 = 1741576309;
		anInt5721 = -1375390745;
		aBoolean5731 = false;
		anInt5725 = -300082645;
		anInt5703 = -1829509431;
		anInt5727 = 48114927;
		anInt5728 = 1531140281;
		anInt5729 = -947829311;
		anInt5730 = 1036837039;
		anInt5736 = 2098727417;
		anInt5722 = 969618575;
		anInt5733 = 2026784241;
		anInt5772 = 583083477;
		anInt5735 = 1438605935;
		anInt5724 = 1612514031;
		((ItemDefinitions) this).femaleModelId1 = -582597415;
		anInt5747 = 1430077763;
		((ItemDefinitions) this).femaleModelId2 = 336299543;
		((ItemDefinitions) this).anInt5759 = -756401161;
		((ItemDefinitions) this).anInt5741 = -2098680761;
		((ItemDefinitions) this).anInt5742 = 0;
		((ItemDefinitions) this).anInt5743 = 0;
		((ItemDefinitions) this).anInt5744 = 0;
		((ItemDefinitions) this).anInt5745 = 0;
		((ItemDefinitions) this).anInt5748 = 0;
		((ItemDefinitions) this).anInt5710 = 0;
		((ItemDefinitions) this).anInt5760 = -1319962769;
		((ItemDefinitions) this).male_head_mdltwo = 1935344449;
		((ItemDefinitions) this).anInt5750 = -1598907469;
		((ItemDefinitions) this).fem_head_mdltwo = 1194369871;
		anInt5709 = 384973719;
		anInt5755 = -1831957949;
		((ItemDefinitions) this).anInt5756 = 970653687;
		anInt5719 = -2015131539;
		((ItemDefinitions) this).anInt5758 = -368863616;
		((ItemDefinitions) this).anInt5702 = -1691736448;
		((ItemDefinitions) this).anInt5739 = 1474728576;
		((ItemDefinitions) this).anInt5761 = 0;
		((ItemDefinitions) this).anInt5762 = 0;
		anInt5700 = 0;
		aBoolean5734 = false;
		anInt5765 = 0;
		anInt5768 = 0;
		((ItemDefinitions) this).anInt5769 = -257950023;
		anInt5770 = -78716625;
		aBoolean5771 = false;
	}

	static final void method6042(int i, int i_86_, int i_87_) {
		try {
			if (Class301_Sub1.aFloat3233 < Class301_Sub1.aFloat3234) {
				Class301_Sub1.aFloat3233 += (double) Class301_Sub1.aFloat3233 / 30.0;
				if (Class301_Sub1.aFloat3233 > Class301_Sub1.aFloat3234)
					Class301_Sub1.aFloat3233 = Class301_Sub1.aFloat3234;
				Class225.method2103(65536);
				Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
				Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254, 818170582);
			} else if (Class301_Sub1.aFloat3233 > Class301_Sub1.aFloat3234) {
				Class301_Sub1.aFloat3233 -= (double) Class301_Sub1.aFloat3233 / 30.0;
				if (Class301_Sub1.aFloat3233 < Class301_Sub1.aFloat3234)
					Class301_Sub1.aFloat3233 = Class301_Sub1.aFloat3234;
				Class225.method2103(65536);
				Class301_Sub1.anInt3254 = (int) Class301_Sub1.aFloat3233 >> 1;
				Class301_Sub1.aByteArrayArrayArray3229 = IcmpService_Sub1.method6381(Class301_Sub1.anInt3254, 1742182898);
			}
			if (Class301_Sub1.anInt7632 * -1198160439 != -1 && -1 != -19739017 * Class301_Sub1.anInt7627) {
				int i_88_ = (-1198160439 * Class301_Sub1.anInt7632 - Class82_Sub14.anInt6875 * 1196508279);
				if (i_88_ < 2 || i_88_ > 2)
					i_88_ /= 8;
				int i_89_ = (Class301_Sub1.anInt7627 * -19739017 - Class376.anInt4090 * 1882038855);
				if (i_89_ < 2 || i_89_ > 2)
					i_89_ /= 8;
				Class82_Sub14.anInt6875 = ((i_88_ + Class82_Sub14.anInt6875 * 1196508279) * -2076584633);
				Class376.anInt4090 = (i_89_ + 1882038855 * Class376.anInt4090) * -435591305;
				if (i_88_ == 0 && i_89_ == 0) {
					Class301_Sub1.anInt7632 = 433609607;
					Class301_Sub1.anInt7627 = 789877945;
				}
				Class225.method2103(65536);
			}
			if (Class137_Sub1.anInt6991 * -1983068885 > 0) {
				Class88.anInt810 -= -1077128129;
				if (0 == Class88.anInt810 * -1581933633) {
					Class137_Sub1.anInt6991 -= -63057533;
					Class88.anInt810 = -338630500;
				}
			} else {
				Class301_Sub1.anInt7633 = -2138103821;
				Class301_Sub1.anInt7630 = -1998014133;
			}
			if (Class301_Sub1.aBoolean7628 && Class476.aClass453_5986 != null) {
				for (Class298_Sub6 class298_sub6 = ((Class298_Sub6) Class476.aClass453_5986.method5939(1766612795)); null != class298_sub6; class298_sub6 = (Class298_Sub6) Class476.aClass453_5986.method5944(49146)) {
					Class352 class352 = (Class301_Sub1.aClass339_3251.method4116(-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608), -1186797555));
					if (class298_sub6.method2862(i, i_86_, (byte) 19)) {
						if (class352.aStringArray3778 != null) {
							if (null != class352.aStringArray3778[4])
								Class234.method2174(class352.aStringArray3778[4], class352.aString3789, -1, 1012, -1, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608) * -530122905), false, -1324353170);
							if (class352.aStringArray3778[3] != null)
								Class234.method2174(class352.aStringArray3778[3], class352.aString3789, -1, 1011, -1, (long) (-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608)), class352.anInt3817 * -804513353, 0, true, false, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608) * -530122905), false, -1509752920);
							if (class352.aStringArray3778[2] != null)
								Class234.method2174(class352.aStringArray3778[2], class352.aString3789, -1, 1010, -1, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) (-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608)), false, -1074248386);
							if (class352.aStringArray3778[1] != null)
								Class234.method2174(class352.aStringArray3778[1], class352.aString3789, -1, 1009, -1, (long) (-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608)), class352.anInt3817 * -804513353, 0, true, false, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608) * -530122905), false, -1424985903);
							if (null != class352.aStringArray3778[0])
								Class234.method2174(class352.aStringArray3778[0], class352.aString3789, -1, 1008, -1, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608) * -530122905), class352.anInt3817 * -804513353, 0, true, false, (long) ((((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608) * -530122905), false, -2019134484);
						}
						if (!((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611) {
							((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611 = true;
							Class126.method1405(Class502.aClass502_6727, -530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608), class352.anInt3817 * -804513353, 20917601);
						}
						if (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611)
							Class126.method1405(Class502.aClass502_6721, -530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608), class352.anInt3817 * -804513353, -1586023399);
					} else if (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611) {
						((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.aBoolean7611 = false;
						Class126.method1405(Class502.aClass502_6718, (-530122905 * (((Class298_Sub6) class298_sub6).aClass298_Sub52_7206.anInt7608)), -804513353 * class352.anInt3817, -1187185253);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.bz(").append(')').toString());
		}
	}

	public static int method6043(int i, int i_90_, int i_91_) {
		try {
			if (HashTable.aClass371_5520.anInt4035 * -1919698893 == -1)
				return 1;
			if (i != Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-2106508116)) {
				Class371.method4584(i, (Tradution.aClass470_5789.method6049(Class321.aClass429_3357, -875414210)), true, (byte) 53);
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-1001808225) != i)
					return -1;
			}
			int i_92_;
			try {
				Dimension dimension = Class52_Sub2_Sub1.aCanvas9079.getSize();
				Class139.method1548(Tradution.aClass470_5789.method6049(Class321.aClass429_3357, -875414210), true, Class373.aClass_ra4071, Class343.aClass264_3673, Class422_Sub2.aClass505_8369, (byte) 5);
				Model model = Model.method751(Class341.aClass243_3646, (-1919698893 * HashTable.aClass371_5520.anInt4035), 0);
				long l = Class122.method1319((byte) 1);
				Class373.aClass_ra4071.L();
				client.aClass222_8871.method2062(0.0F, 256.0F, 0.0F);
				Class373.aClass_ra4071.method5043(client.aClass222_8871);
				Matrix4f class233 = Class373.aClass_ra4071.method5036();
				class233.method2152((float) (dimension.width / 2), (float) (dimension.height / 2), 512.0F, 512.0F, (float) client.aClass283_8716.method2634((byte) -121), (float) client.aClass283_8716.method2635(1789119116), (float) dimension.width, (float) dimension.height);
				Class373.aClass_ra4071.method5182(class233);
				Class373.aClass_ra4071.IA(1.0F);
				Class373.aClass_ra4071.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
				Class387 class387 = Class373.aClass_ra4071.method5037(model, 2048, 64, 64, 768);
				int i_93_ = 0;
				while_107_: for (int i_94_ = 0; i_94_ < 500; i_94_++) {
					Class373.aClass_ra4071.ba(3, 0);
					for (int i_95_ = 15; i_95_ >= 0; i_95_--) {
						for (int i_96_ = 0; i_96_ <= i_95_; i_96_++) {
							client.aClass222_8968.method2062((float) (int) (512.0F * ((float) i_96_ - (float) i_95_ / 2.0F)), 0.0F, (float) ((1 + i_95_) * 512));
							class387.method4739(client.aClass222_8968, null, 0);
							i_93_++;
							if (Class122.method1319((byte) 1) - l >= (long) i_90_) {
								if (i_91_ >= 1017103058)
									throw new IllegalStateException();
								break while_107_;
							}
						}
					}
				}
				Class373.aClass_ra4071.method5075();
				long l_97_ = ((long) (i_93_ * 1000) / (Class122.method1319((byte) 1) - l));
				Class373.aClass_ra4071.ba(3, 0);
				i_92_ = (int) l_97_;
			} catch (Throwable throwable) {
				throwable.printStackTrace();
				return -1;
			}
			return i_92_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("th.gt(").append(')').toString());
		}
	}
}
