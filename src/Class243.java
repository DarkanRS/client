/* Class243 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class243 {
	static int anInt2711 = 0;
	public static int anInt2712 = 1;
	Class226 aClass226_2713 = null;
	static Class519 aClass519_2714 = new Class519();
	boolean aBoolean2715;
	static int anInt2716 = 0;
	Object[] anObjectArray2717;
	Object[][] anObjectArrayArray2718;
	int anInt2719;
	Class242 aClass242_2720;
	static boolean aBoolean2721 = false;
	static int anInt2722 = 0;
	public static int anInt2723 = 2;
	static int anInt2724 = 1;

	synchronized boolean method2284(int i) {
		try {
			if (((Class243) this).aClass226_2713 == null) {
				((Class243) this).aClass226_2713 = ((Class243) this).aClass242_2720.method2250(2102263091);
				if (((Class243) this).aClass226_2713 == null)
					return false;
				((Class243) this).anObjectArray2717 = new Object[-1583970959 * (((Class226) (((Class243) this).aClass226_2713)).anInt2521)];
				((Class243) this).anObjectArrayArray2718 = new Object[-1583970959 * (((Class226) (((Class243) this).aClass226_2713)).anInt2521)][];
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.a(").append(')').toString());
		}
	}

	public int getCRC(byte i) {
		try {
			if (!method2284(14382781))
				throw new IllegalStateException("");
			return (((Class226) ((Class243) this).aClass226_2713).anInt2513 * 1600327191);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.f(").append(')').toString());
		}
	}

	synchronized boolean method2286(int i, int i_0_, byte i_1_) {
		try {
			if (!method2284(24313456))
				return false;
			if (i < 0 || i_0_ < 0 || i >= (((Class226) ((Class243) this).aClass226_2713).anIntArray2517).length || i_0_ >= (((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i])) {
				if (aBoolean2721)
					throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_0_).toString());
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.p(").append(')').toString());
		}
	}

	synchronized void method2287(int i, byte i_2_) {
		try {
			if (((Class243) this).aBoolean2715)
				((Class243) this).anObjectArray2717[i] = ((Class243) this).aClass242_2720.method2251(i, (byte) -83);
			else
				((Class243) this).anObjectArray2717[i] = Class158.method1702(((Class243) this).aClass242_2720.method2251(i, (byte) -115), false, (short) -5444);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.i(").append(')').toString());
		}
	}

	void method2288(int i, byte i_3_) {
		try {
			((Class243) this).aClass242_2720.method2256(i, (short) -11867);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.k(").append(')').toString());
		}
	}

	public synchronized byte[] method2289(int i, int i_4_, int[] is, int i_5_) {
		try {
			if (!method2286(i, i_4_, (byte) 106))
				return null;
			byte[] is_6_ = null;
			if (null == ((Class243) this).anObjectArrayArray2718[i] || null == ((Class243) this).anObjectArrayArray2718[i][i_4_]) {
				boolean bool = method2306(i, i_4_, is, (byte) 1);
				if (!bool) {
					method2287(i, (byte) 23);
					bool = method2306(i, i_4_, is, (byte) 1);
					if (!bool)
						return null;
				}
			}
			if (null == ((Class243) this).anObjectArrayArray2718[i])
				throw new RuntimeException("");
			if (((Class243) this).anObjectArrayArray2718[i][i_4_] == null) {
				if (i_5_ >= -969677092) {
					/* empty */
				}
			} else {
				is_6_ = Class338.method4114((((Class243) this).anObjectArrayArray2718[i][i_4_]), false, -390800011);
				if (is_6_ == null)
					throw new RuntimeException("");
			}
			if (null != is_6_) {
				if (((Class243) this).anInt2719 * -1870742467 == 1) {
					((Class243) this).anObjectArrayArray2718[i][i_4_] = null;
					if (1 == (((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i]))
						((Class243) this).anObjectArrayArray2718[i] = null;
				} else if (((Class243) this).anInt2719 * -1870742467 == 2)
					((Class243) this).anObjectArrayArray2718[i] = null;
			}
			return is_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.u(").append(')').toString());
		}
	}

	public synchronized boolean method2290(int i, int i_7_, int i_8_) {
		try {
			if (!method2286(i, i_7_, (byte) 52))
				return false;
			if (((Class243) this).anObjectArrayArray2718[i] != null && ((Class243) this).anObjectArrayArray2718[i][i_7_] != null)
				return true;
			if (((Class243) this).anObjectArray2717[i] != null)
				return true;
			method2287(i, (byte) 102);
			if (null != ((Class243) this).anObjectArray2717[i])
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.x(").append(')').toString());
		}
	}

	public synchronized boolean method2291(int i, int i_9_) {
		try {
			if (!method2309(i, (byte) 1))
				return false;
			if (null != ((Class243) this).anObjectArray2717[i])
				return true;
			method2287(i, (byte) 60);
			if (((Class243) this).anObjectArray2717[i] != null)
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.q(").append(')').toString());
		}
	}

	public synchronized boolean method2292(int i) {
		try {
			if (!method2284(1564303970))
				return false;
			boolean bool = true;
			for (int i_10_ = 0; i_10_ < (((Class226) ((Class243) this).aClass226_2713).anIntArray2518).length; i_10_++) {
				int i_11_ = (((Class226) ((Class243) this).aClass226_2713).anIntArray2518[i_10_]);
				if (((Class243) this).anObjectArray2717[i_11_] == null) {
					method2287(i_11_, (byte) 10);
					if (null == ((Class243) this).anObjectArray2717[i_11_])
						bool = false;
				}
			}
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.n(").append(')').toString());
		}
	}

	public synchronized int method2293(byte i) {
		try {
			if (!method2284(-561688978))
				return 0;
			int i_12_ = 0;
			int i_13_ = 0;
			for (int i_14_ = 0; i_14_ < ((Class243) this).anObjectArray2717.length; i_14_++) {
				if ((((Class226) ((Class243) this).aClass226_2713).anIntArray2525[i_14_]) > 0) {
					i_12_ += 100;
					i_13_ += method2303(i_14_, (byte) 1);
				}
			}
			if (0 == i_12_)
				return 100;
			int i_15_ = i_13_ * 100 / i_12_;
			return i_15_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.z(").append(')').toString());
		}
	}

	public synchronized byte[] method2294(int i, byte i_16_) {
		try {
			if (!method2284(-1120870395))
				return null;
			if ((((Class226) ((Class243) this).aClass226_2713).anIntArray2517).length == 1)
				return getFile(0, i, (byte) -42);
			if (!method2309(i, (byte) 1))
				return null;
			if (((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i] == 1)
				return getFile(i, 0, (byte) -48);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.y(").append(')').toString());
		}
	}

	public boolean method2295(String string, int i) {
		try {
			if (!method2284(2084387932))
				return false;
			string = string.toLowerCase();
			int i_17_ = (((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(Class244.method2328(string, -1973803814), 867865737));
			if (i_17_ < 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.j(").append(')').toString());
		}
	}

	public int method2296(int i) {
		try {
			if (!method2284(-1854256654))
				return -1;
			return (((Class226) ((Class243) this).aClass226_2713).anIntArray2517).length;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.v(").append(')').toString());
		}
	}

	public synchronized void method2297(int i, int i_18_) {
		try {
			if (method2309(i, (byte) 1)) {
				if (((Class243) this).anObjectArrayArray2718 != null)
					((Class243) this).anObjectArrayArray2718[i] = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.g(").append(')').toString());
		}
	}

	public void method2298(boolean bool, boolean bool_19_, int i) {
		try {
			if (method2284(843198070)) {
				if (bool) {
					((Class226) ((Class243) this).aClass226_2713).anIntArray2519 = null;
					((Class226) ((Class243) this).aClass226_2713).aClass112_2520 = null;
				}
				if (bool_19_) {
					((Class226) ((Class243) this).aClass226_2713).anIntArrayArray2523 = null;
					((Class226) ((Class243) this).aClass226_2713).aClass112Array2528 = null;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.e(").append(')').toString());
		}
	}

	public Class243(Class242 class242, boolean bool, int i) {
		if (i < 0 || i > 2)
			throw new IllegalArgumentException("");
		((Class243) this).aClass242_2720 = class242;
		((Class243) this).aBoolean2715 = bool;
		((Class243) this).anInt2719 = -98387179 * i;
	}

	public int method2299(int i, int i_20_) {
		try {
			if (!method2284(-1669476342))
				return -1;
			int i_21_ = ((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(i, 1079998267);
			if (!method2309(i_21_, (byte) 1))
				return -1;
			return i_21_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.w(").append(')').toString());
		}
	}

	public boolean method2300(String string, String string_22_, byte i) {
		try {
			if (!method2284(-574952224))
				return false;
			string = string.toLowerCase();
			string_22_ = string_22_.toLowerCase();
			int i_23_ = (((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(Class244.method2328(string, -1984349791), 728033014));
			if (i_23_ < 0)
				return false;
			int i_24_ = (((Class226) ((Class243) this).aClass226_2713).aClass112Array2528[i_23_].method1239(Class244.method2328(string_22_, -2081152646), 2090644563));
			if (i_24_ < 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.o(").append(')').toString());
		}
	}

	public synchronized byte[] method2301(String string, String string_25_, int i) {
		try {
			if (!method2284(-1323260380))
				return null;
			string = string.toLowerCase();
			string_25_ = string_25_.toLowerCase();
			int i_26_ = (((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(Class244.method2328(string, -1961901970), 1404802795));
			if (!method2309(i_26_, (byte) 1))
				return null;
			int i_27_ = (((Class226) ((Class243) this).aClass226_2713).aClass112Array2528[i_26_].method1239(Class244.method2328(string_25_, -2059879258), 838109915));
			return getFile(i_26_, i_27_, (byte) -34);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.l(").append(')').toString());
		}
	}

	boolean method2302(String string, String string_28_, int i) {
		try {
			if (!method2284(391595632))
				return false;
			string = string.toLowerCase();
			string_28_ = string_28_.toLowerCase();
			int i_29_ = (((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(Class244.method2328(string, -2027002851), 906979105));
			if (!method2309(i_29_, (byte) 1))
				return false;
			int i_30_ = (((Class226) ((Class243) this).aClass226_2713).aClass112Array2528[i_29_].method1239(Class244.method2328(string_28_, -2028561031), 2121455333));
			return method2290(i_29_, i_30_, -1219568896);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.ax(").append(')').toString());
		}
	}

	synchronized int method2303(int i, byte i_31_) {
		try {
			if (!method2309(i, (byte) 1))
				return 0;
			if (((Class243) this).anObjectArray2717[i] != null)
				return 100;
			return ((Class243) this).aClass242_2720.method2253(i, 65535);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.s(").append(')').toString());
		}
	}

	public void method2304(String string, int i) {
		try {
			if (method2284(1339347995)) {
				string = string.toLowerCase();
				int i_32_ = (((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(Class244.method2328(string, -2097971535), 1493933726));
				method2288(i_32_, (byte) 98);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.ae(").append(')').toString());
		}
	}

	public int method2305(String string, int i) {
		try {
			if (!method2284(2032881212))
				return 0;
			string = string.toLowerCase();
			int i_33_ = (((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(Class244.method2328(string, -2069451291), 96817353));
			return method2303(i_33_, (byte) 1);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.ao(").append(')').toString());
		}
	}

	synchronized boolean method2306(int i, int i_34_, int[] is, byte i_35_) {
		try {
			if (!method2309(i, (byte) 1))
				return false;
			if (null == ((Class243) this).anObjectArray2717[i])
				return false;
			int i_36_ = (((Class226) ((Class243) this).aClass226_2713).anIntArray2525[i]);
			int[] is_37_ = (((Class226) ((Class243) this).aClass226_2713).anIntArrayArray2526[i]);
			if (null == ((Class243) this).anObjectArrayArray2718[i])
				((Class243) this).anObjectArrayArray2718[i] = new Object[(((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i])];
			Object[] objects = ((Class243) this).anObjectArrayArray2718[i];
			boolean bool = true;
			for (int i_38_ = 0; i_38_ < i_36_; i_38_++) {
				int i_39_;
				if (is_37_ == null)
					i_39_ = i_38_;
				else
					i_39_ = is_37_[i_38_];
				if (null == objects[i_39_]) {
					bool = false;
					break;
				}
			}
			if (bool)
				return true;
			byte[] is_40_;
			if (null != is && (0 != is[0] || is[1] != 0 || is[2] != 0 || 0 != is[3])) {
				is_40_ = Class338.method4114((((Class243) this).anObjectArray2717[i]), true, -858479492);
				RsByteBuffer class298_sub53 = new RsByteBuffer(is_40_);
				class298_sub53.method3612(is, 5, class298_sub53.buffer.length, -1429633724);
			} else
				is_40_ = Class338.method4114((((Class243) this).anObjectArray2717[i]), false, -144584373);
			byte[] is_41_;
			try {
				is_41_ = Class236.method2188(is_40_, 1072675128);
			} catch (RuntimeException runtimeexception) {
				throw Class346.method4175(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_40_.length).append(" ").append(Class271.method2548(is_40_, is_40_.length, -1914018334)).append(" ").append(Class271.method2548(is_40_, is_40_.length - 2, -1788280058)).append(" ").append(((Class226) ((Class243) this).aClass226_2713).anIntArray2522[i]).append(" ").append(1600327191 * (((Class226) (((Class243) this).aClass226_2713)).anInt2513)).toString());
			}
			if (((Class243) this).aBoolean2715)
				((Class243) this).anObjectArray2717[i] = null;
			if (i_36_ > 1) {
				if (2 != ((Class243) this).anInt2719 * -1870742467) {
					int i_42_ = is_41_.length;
					int i_43_ = is_41_[--i_42_] & 0xff;
					i_42_ -= 4 * (i_43_ * i_36_);
					RsByteBuffer class298_sub53 = new RsByteBuffer(is_41_);
					int[] is_44_ = new int[i_36_];
					class298_sub53.index = i_42_ * 116413311;
					for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
						int i_46_ = 0;
						for (int i_47_ = 0; i_47_ < i_36_; i_47_++) {
							i_46_ += class298_sub53.readInt((byte) 13);
							is_44_[i_47_] += i_46_;
						}
					}
					byte[][] is_48_ = new byte[i_36_][];
					for (int i_49_ = 0; i_49_ < i_36_; i_49_++) {
						is_48_[i_49_] = new byte[is_44_[i_49_]];
						is_44_[i_49_] = 0;
					}
					class298_sub53.index = i_42_ * 116413311;
					int i_50_ = 0;
					for (int i_51_ = 0; i_51_ < i_43_; i_51_++) {
						int i_52_ = 0;
						for (int i_53_ = 0; i_53_ < i_36_; i_53_++) {
							i_52_ += class298_sub53.readInt((byte) -32);
							System.arraycopy(is_41_, i_50_, is_48_[i_53_], is_44_[i_53_], i_52_);
							is_44_[i_53_] += i_52_;
							i_50_ += i_52_;
						}
					}
					for (int i_54_ = 0; i_54_ < i_36_; i_54_++) {
						int i_55_;
						if (null == is_37_)
							i_55_ = i_54_;
						else
							i_55_ = is_37_[i_54_];
						if (-1870742467 * ((Class243) this).anInt2719 == 0)
							objects[i_55_] = Class158.method1702(is_48_[i_54_], false, (short) -26522);
						else
							objects[i_55_] = is_48_[i_54_];
					}
				} else {
					int i_56_ = is_41_.length;
					int i_57_ = is_41_[--i_56_] & 0xff;
					i_56_ -= i_36_ * i_57_ * 4;
					RsByteBuffer class298_sub53 = new RsByteBuffer(is_41_);
					int i_58_ = 0;
					int i_59_ = 0;
					class298_sub53.index = 116413311 * i_56_;
					for (int i_60_ = 0; i_60_ < i_57_; i_60_++) {
						int i_61_ = 0;
						for (int i_62_ = 0; i_62_ < i_36_; i_62_++) {
							i_61_ += class298_sub53.readInt((byte) -36);
							int i_63_;
							if (null == is_37_)
								i_63_ = i_62_;
							else
								i_63_ = is_37_[i_62_];
							if (i_63_ == i_34_) {
								i_58_ += i_61_;
								i_59_ = i_63_;
							}
						}
					}
					if (i_58_ == 0)
						return true;
					byte[] is_64_ = new byte[i_58_];
					i_58_ = 0;
					class298_sub53.index = i_56_ * 116413311;
					int i_65_ = 0;
					for (int i_66_ = 0; i_66_ < i_57_; i_66_++) {
						int i_67_ = 0;
						for (int i_68_ = 0; i_68_ < i_36_; i_68_++) {
							i_67_ += class298_sub53.readInt((byte) -26);
							int i_69_;
							if (null == is_37_)
								i_69_ = i_68_;
							else
								i_69_ = is_37_[i_68_];
							if (i_69_ == i_34_) {
								System.arraycopy(is_41_, i_65_, is_64_, i_58_, i_67_);
								i_58_ += i_67_;
							}
							i_65_ += i_67_;
						}
					}
					objects[i_59_] = is_64_;
				}
			} else {
				int i_70_;
				if (null == is_37_)
					i_70_ = 0;
				else
					i_70_ = is_37_[0];
				if (0 == ((Class243) this).anInt2719 * -1870742467)
					objects[i_70_] = Class158.method1702(is_41_, false, (short) -11343);
				else
					objects[i_70_] = is_41_;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.c(").append(')').toString());
		}
	}

	public synchronized int[] method2307(int i, int i_71_) {
		try {
			if (!method2309(i, (byte) 1))
				return null;
			int[] is = (((Class226) ((Class243) this).aClass226_2713).anIntArrayArray2526[i]);
			if (is == null) {
				is = new int[(((Class226) ((Class243) this).aClass226_2713).anIntArray2525[i])];
				for (int i_72_ = 0; i_72_ < is.length; i_72_++)
					is[i_72_] = i_72_;
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.t(").append(')').toString());
		}
	}

	synchronized boolean method2308(int i, int i_73_, int[] is) {
		if (!method2309(i, (byte) 1))
			return false;
		if (null == ((Class243) this).anObjectArray2717[i])
			return false;
		int i_74_ = ((Class226) ((Class243) this).aClass226_2713).anIntArray2525[i];
		int[] is_75_ = (((Class226) ((Class243) this).aClass226_2713).anIntArrayArray2526[i]);
		if (null == ((Class243) this).anObjectArrayArray2718[i])
			((Class243) this).anObjectArrayArray2718[i] = new Object[(((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i])];
		Object[] objects = ((Class243) this).anObjectArrayArray2718[i];
		boolean bool = true;
		for (int i_76_ = 0; i_76_ < i_74_; i_76_++) {
			int i_77_;
			if (is_75_ == null)
				i_77_ = i_76_;
			else
				i_77_ = is_75_[i_76_];
			if (null == objects[i_77_]) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_78_;
		if (null != is && (0 != is[0] || is[1] != 0 || is[2] != 0 || 0 != is[3])) {
			is_78_ = Class338.method4114(((Class243) this).anObjectArray2717[i], true, -1017882504);
			RsByteBuffer class298_sub53 = new RsByteBuffer(is_78_);
			class298_sub53.method3612(is, 5, class298_sub53.buffer.length, -2120558016);
		} else
			is_78_ = Class338.method4114(((Class243) this).anObjectArray2717[i], false, 959051680);
		byte[] is_79_;
		try {
			is_79_ = Class236.method2188(is_78_, -199793511);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_78_.length).append(" ").append(Class271.method2548(is_78_, is_78_.length, -2111183372)).append(" ").append(Class271.method2548(is_78_, is_78_.length - 2, -1919903806)).append(" ").append(((Class226) ((Class243) this).aClass226_2713).anIntArray2522[i]).append(" ").append(1600327191 * (((Class226) ((Class243) this).aClass226_2713).anInt2513)).toString());
		}
		if (((Class243) this).aBoolean2715)
			((Class243) this).anObjectArray2717[i] = null;
		if (i_74_ > 1) {
			if (2 != ((Class243) this).anInt2719 * -1870742467) {
				int i_80_ = is_79_.length;
				int i_81_ = is_79_[--i_80_] & 0xff;
				i_80_ -= 4 * (i_81_ * i_74_);
				RsByteBuffer class298_sub53 = new RsByteBuffer(is_79_);
				int[] is_82_ = new int[i_74_];
				class298_sub53.index = i_80_ * 116413311;
				for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
					int i_84_ = 0;
					for (int i_85_ = 0; i_85_ < i_74_; i_85_++) {
						i_84_ += class298_sub53.readInt((byte) -6);
						is_82_[i_85_] += i_84_;
					}
				}
				byte[][] is_86_ = new byte[i_74_][];
				for (int i_87_ = 0; i_87_ < i_74_; i_87_++) {
					is_86_[i_87_] = new byte[is_82_[i_87_]];
					is_82_[i_87_] = 0;
				}
				class298_sub53.index = i_80_ * 116413311;
				int i_88_ = 0;
				for (int i_89_ = 0; i_89_ < i_81_; i_89_++) {
					int i_90_ = 0;
					for (int i_91_ = 0; i_91_ < i_74_; i_91_++) {
						i_90_ += class298_sub53.readInt((byte) 5);
						System.arraycopy(is_79_, i_88_, is_86_[i_91_], is_82_[i_91_], i_90_);
						is_82_[i_91_] += i_90_;
						i_88_ += i_90_;
					}
				}
				for (int i_92_ = 0; i_92_ < i_74_; i_92_++) {
					int i_93_;
					if (null == is_75_)
						i_93_ = i_92_;
					else
						i_93_ = is_75_[i_92_];
					if (-1870742467 * ((Class243) this).anInt2719 == 0)
						objects[i_93_] = Class158.method1702(is_86_[i_92_], false, (short) 3420);
					else
						objects[i_93_] = is_86_[i_92_];
				}
			} else {
				int i_94_ = is_79_.length;
				int i_95_ = is_79_[--i_94_] & 0xff;
				i_94_ -= i_74_ * i_95_ * 4;
				RsByteBuffer class298_sub53 = new RsByteBuffer(is_79_);
				int i_96_ = 0;
				int i_97_ = 0;
				class298_sub53.index = 116413311 * i_94_;
				for (int i_98_ = 0; i_98_ < i_95_; i_98_++) {
					int i_99_ = 0;
					for (int i_100_ = 0; i_100_ < i_74_; i_100_++) {
						i_99_ += class298_sub53.readInt((byte) -22);
						int i_101_;
						if (null == is_75_)
							i_101_ = i_100_;
						else
							i_101_ = is_75_[i_100_];
						if (i_101_ == i_73_) {
							i_96_ += i_99_;
							i_97_ = i_101_;
						}
					}
				}
				if (i_96_ == 0)
					return true;
				byte[] is_102_ = new byte[i_96_];
				i_96_ = 0;
				class298_sub53.index = i_94_ * 116413311;
				int i_103_ = 0;
				for (int i_104_ = 0; i_104_ < i_95_; i_104_++) {
					int i_105_ = 0;
					for (int i_106_ = 0; i_106_ < i_74_; i_106_++) {
						i_105_ += class298_sub53.readInt((byte) 49);
						int i_107_;
						if (null == is_75_)
							i_107_ = i_106_;
						else
							i_107_ = is_75_[i_106_];
						if (i_107_ == i_73_) {
							System.arraycopy(is_79_, i_103_, is_102_, i_96_, i_105_);
							i_96_ += i_105_;
						}
						i_103_ += i_105_;
					}
				}
				objects[i_97_] = is_102_;
			}
		} else {
			int i_108_;
			if (null == is_75_)
				i_108_ = 0;
			else
				i_108_ = is_75_[0];
			if (0 == ((Class243) this).anInt2719 * -1870742467)
				objects[i_108_] = Class158.method1702(is_79_, false, (short) -45);
			else
				objects[i_108_] = is_79_;
		}
		return true;
	}

	synchronized boolean method2309(int i, byte i_109_) {
		try {
			if (!method2284(-1888148215))
				return false;
			if (i < 0 || i >= (((Class226) ((Class243) this).aClass226_2713).anIntArray2517).length || 0 == (((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i])) {
				if (aBoolean2721)
					throw new IllegalArgumentException(Integer.toString(i));
				return false;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.b(").append(')').toString());
		}
	}

	public synchronized boolean method2310(int i, int i_110_) {
		try {
			if (!method2284(-259904989))
				return false;
			if (1 == (((Class226) ((Class243) this).aClass226_2713).anIntArray2517).length)
				return method2290(0, i, -1025716899);
			if (!method2309(i, (byte) 1))
				return false;
			if (((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i] == 1)
				return method2290(i, 0, -2065975004);
			throw new RuntimeException();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.r(").append(')').toString());
		}
	}

	public int method2311(String string, int i) {
		try {
			if (!method2284(1289573635))
				return -1;
			string = string.toLowerCase();
			int i_111_ = (((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(Class244.method2328(string, -2067562497), 403552753));
			if (!method2309(i_111_, (byte) 1))
				return -1;
			return i_111_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.m(").append(')').toString());
		}
	}

	public boolean method2312(String string, int i) {
		try {
			if (!method2284(-492791802))
				return false;
			string = string.toLowerCase();
			int i_112_ = (((Class226) ((Class243) this).aClass226_2713).aClass112_2520.method1239(Class244.method2328(string, -2120237955), 187766103));
			return method2291(i_112_, 1717306833);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.ak(").append(')').toString());
		}
	}

	public boolean method2313(String string, int i) {
		try {
			int i_113_ = method2311("", -1723903675);
			if (i_113_ != -1)
				return method2302("", string, -563288883);
			return method2302(string, "", -859462811);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.aa(").append(')').toString());
		}
	}

	synchronized boolean method2314(int i, int i_114_, int[] xtea) {
		if (!method2309(i, (byte) 1))
			return false;
		if (null == ((Class243) this).anObjectArray2717[i])
			return false;
		int i_115_ = ((Class226) ((Class243) this).aClass226_2713).anIntArray2525[i];
		int[] is_116_ = (((Class226) ((Class243) this).aClass226_2713).anIntArrayArray2526[i]);
		if (null == ((Class243) this).anObjectArrayArray2718[i])
			((Class243) this).anObjectArrayArray2718[i] = new Object[(((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i])];
		Object[] objects = ((Class243) this).anObjectArrayArray2718[i];
		boolean bool = true;
		for (int i_117_ = 0; i_117_ < i_115_; i_117_++) {
			int i_118_;
			if (is_116_ == null)
				i_118_ = i_117_;
			else
				i_118_ = is_116_[i_117_];
			if (null == objects[i_118_]) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_119_;
		if (null != xtea && (0 != xtea[0] || xtea[1] != 0 || xtea[2] != 0 || 0 != xtea[3])) {
			is_119_ = Class338.method4114(((Class243) this).anObjectArray2717[i], true, 1730830793);
			RsByteBuffer class298_sub53 = new RsByteBuffer(is_119_);
			class298_sub53.method3612(xtea, 5, class298_sub53.buffer.length, -458895567);
		} else
			is_119_ = Class338.method4114(((Class243) this).anObjectArray2717[i], false, 235085962);
		byte[] is_120_;
		try {
			is_120_ = Class236.method2188(is_119_, 2053445966);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append(null != xtea).append(" ").append(i).append(" ").append(is_119_.length).append(" ").append(Class271.method2548(is_119_, is_119_.length, -2054415257)).append(" ").append(Class271.method2548(is_119_, is_119_.length - 2, -1915676199)).append(" ").append(((Class226) ((Class243) this).aClass226_2713).anIntArray2522[i]).append(" ").append(1600327191 * (((Class226) ((Class243) this).aClass226_2713).anInt2513)).toString());
		}
		if (((Class243) this).aBoolean2715)
			((Class243) this).anObjectArray2717[i] = null;
		if (i_115_ > 1) {
			if (2 != ((Class243) this).anInt2719 * -1870742467) {
				int i_121_ = is_120_.length;
				int i_122_ = is_120_[--i_121_] & 0xff;
				i_121_ -= 4 * (i_122_ * i_115_);
				RsByteBuffer class298_sub53 = new RsByteBuffer(is_120_);
				int[] is_123_ = new int[i_115_];
				class298_sub53.index = i_121_ * 116413311;
				for (int i_124_ = 0; i_124_ < i_122_; i_124_++) {
					int i_125_ = 0;
					for (int i_126_ = 0; i_126_ < i_115_; i_126_++) {
						i_125_ += class298_sub53.readInt((byte) -16);
						is_123_[i_126_] += i_125_;
					}
				}
				byte[][] is_127_ = new byte[i_115_][];
				for (int i_128_ = 0; i_128_ < i_115_; i_128_++) {
					is_127_[i_128_] = new byte[is_123_[i_128_]];
					is_123_[i_128_] = 0;
				}
				class298_sub53.index = i_121_ * 116413311;
				int i_129_ = 0;
				for (int i_130_ = 0; i_130_ < i_122_; i_130_++) {
					int i_131_ = 0;
					for (int i_132_ = 0; i_132_ < i_115_; i_132_++) {
						i_131_ += class298_sub53.readInt((byte) -61);
						System.arraycopy(is_120_, i_129_, is_127_[i_132_], is_123_[i_132_], i_131_);
						is_123_[i_132_] += i_131_;
						i_129_ += i_131_;
					}
				}
				for (int i_133_ = 0; i_133_ < i_115_; i_133_++) {
					int i_134_;
					if (null == is_116_)
						i_134_ = i_133_;
					else
						i_134_ = is_116_[i_133_];
					if (-1870742467 * ((Class243) this).anInt2719 == 0)
						objects[i_134_] = Class158.method1702(is_127_[i_133_], false, (short) -1311);
					else
						objects[i_134_] = is_127_[i_133_];
				}
			} else {
				int i_135_ = is_120_.length;
				int i_136_ = is_120_[--i_135_] & 0xff;
				i_135_ -= i_115_ * i_136_ * 4;
				RsByteBuffer class298_sub53 = new RsByteBuffer(is_120_);
				int i_137_ = 0;
				int i_138_ = 0;
				class298_sub53.index = 116413311 * i_135_;
				for (int i_139_ = 0; i_139_ < i_136_; i_139_++) {
					int i_140_ = 0;
					for (int i_141_ = 0; i_141_ < i_115_; i_141_++) {
						i_140_ += class298_sub53.readInt((byte) 51);
						int i_142_;
						if (null == is_116_)
							i_142_ = i_141_;
						else
							i_142_ = is_116_[i_141_];
						if (i_142_ == i_114_) {
							i_137_ += i_140_;
							i_138_ = i_142_;
						}
					}
				}
				if (i_137_ == 0)
					return true;
				byte[] is_143_ = new byte[i_137_];
				i_137_ = 0;
				class298_sub53.index = i_135_ * 116413311;
				int i_144_ = 0;
				for (int i_145_ = 0; i_145_ < i_136_; i_145_++) {
					int i_146_ = 0;
					for (int i_147_ = 0; i_147_ < i_115_; i_147_++) {
						i_146_ += class298_sub53.readInt((byte) 10);
						int i_148_;
						if (null == is_116_)
							i_148_ = i_147_;
						else
							i_148_ = is_116_[i_147_];
						if (i_148_ == i_114_) {
							System.arraycopy(is_120_, i_144_, is_143_, i_137_, i_146_);
							i_137_ += i_146_;
						}
						i_144_ += i_146_;
					}
				}
				objects[i_138_] = is_143_;
			}
		} else {
			int i_149_;
			if (null == is_116_)
				i_149_ = 0;
			else
				i_149_ = is_116_[0];
			if (0 == ((Class243) this).anInt2719 * -1870742467)
				objects[i_149_] = Class158.method1702(is_120_, false, (short) 7031);
			else
				objects[i_149_] = is_120_;
		}
		return true;
	}

	public byte[] getFile(int i, int i_150_, byte i_151_) {
		try {
			return method2289(i, i_150_, null, -1954204331);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.d(").append(')').toString());
		}
	}

	public int method2316(int i, int i_152_) {
		try {
			if (!method2309(i, (byte) 1))
				return 0;
			return (((Class226) ((Class243) this).aClass226_2713).anIntArray2517[i]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.h(").append(')').toString());
		}
	}

	static final void method2317(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1820459724) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1273 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.nf(").append(')').toString());
		}
	}

	static final void method2318(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) (Class122.method1319((byte) 1) / 86400000L) - 11745;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ke.aka(").append(')').toString());
		}
	}
}
