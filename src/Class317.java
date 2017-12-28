/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class317 {
	static final int anInt3681 = 0;
	Object[] anObjectArray3682;
	int anInt3683;
	static Class395 aClass395_3684 = new Class395();
	boolean aBool3685;
	static final int anInt3686 = 0;
	public static final int anInt3687 = 1;
	Object[][] anObjectArrayArray3688;
	static int anInt3689;
	Class327 aClass327_3690;
	public static final int anInt3691 = 2;
	static boolean aBool3692 = false;
	static final int anInt3693 = 1;
	Class322 aClass322_3694 = null;

	public int method5600() {
		if (!method5635((byte) 1))
			return -1;
		return (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length;
	}

	static final byte[] method5601(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		int i_0_ = class282_sub35.readInt();
		if (i_0_ < 0 || 1020558379 * anInt3689 != 0 && i_0_ > 1020558379 * anInt3689)
			throw new RuntimeException();
		if (0 == i) {
			byte[] is_1_ = new byte[i_0_];
			class282_sub35.readBytes(is_1_, 0, i_0_, 1758832535);
			return is_1_;
		}
		int i_2_ = class282_sub35.readInt();
		if (i_2_ < 0 || 0 != anInt3689 * 1020558379 && i_2_ > 1020558379 * anInt3689)
			throw new RuntimeException();
		byte[] is_3_ = new byte[i_2_];
		if (i == 1)
			Class471.method7828(is_3_, i_2_, is, i_0_, 9);
		else {
			synchronized (aClass395_3684) {
				aClass395_3684.method6767(class282_sub35, is_3_, -692917456);
			}
		}
		return is_3_;
	}

	public int method5602(int i) {
		if (!method5635((byte) 1))
			throw new IllegalStateException("");
		return (-2006273977 * ((Class322) ((Class317) this).aClass322_3694).anInt3733);
	}

	synchronized boolean method5603(int i, int i_4_) {
		if (!method5635((byte) 1))
			return false;
		if (i < 0 || i >= (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length || 0 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])) {
			if (aBool3692)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	synchronized boolean method5604(int i, int i_5_, int i_6_) {
		if (!method5635((byte) 1))
			return false;
		if (i < 0 || i_5_ < 0 || i >= (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length || i_5_ >= (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])) {
			if (aBool3692)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_5_).toString());
			return false;
		}
		return true;
	}

	synchronized void method5605(int i, byte i_7_) {
		if (((Class317) this).aBool3685)
			((Class317) this).anObjectArray3682[i] = ((Class317) this).aClass327_3690.method5804(i, 1942118537);
		else
			((Class317) this).anObjectArray3682[i] = Class309.method5493(((Class317) this).aClass327_3690.method5804(i, 1942118537), false, (byte) 47);
	}

	void method5606(int i, int i_8_) {
		((Class317) this).aClass327_3690.method5805(i, 1941193995);
	}

	public byte[] method5607(int i, int i_9_, int i_10_) {
		return method5643(i, i_9_, null, -1098430914);
	}

	public boolean validFile(String string, int i) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i_11_ = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -746218156), -1797692054));
		if (i_11_ < 0)
			return false;
		return true;
	}

	synchronized void method5609(int i) {
		if (((Class317) this).aBool3685)
			((Class317) this).anObjectArray3682[i] = ((Class317) this).aClass327_3690.method5804(i, 1942118537);
		else
			((Class317) this).anObjectArray3682[i] = Class309.method5493(((Class317) this).aClass327_3690.method5804(i, 1942118537), false, (byte) 104);
	}

	public int method5610(String string, int i) {
		if (!method5635((byte) 1))
			return -1;
		string = string.toLowerCase();
		int i_12_ = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -221631935), -1537354695));
		if (!method5603(i_12_, 16711680))
			return -1;
		return i_12_;
	}

	public int method5611(int i) {
		if (!method5603(i, 16711680))
			return 0;
		return ((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i];
	}

	public synchronized boolean method5612(byte i) {
		if (!method5635((byte) 1))
			return false;
		boolean bool = true;
		for (int i_13_ = 0; i_13_ < (((Class322) ((Class317) this).aClass322_3694).anIntArray3737).length; i_13_++) {
			int i_14_ = (((Class322) ((Class317) this).aClass322_3694).anIntArray3737[i_13_]);
			if (null == ((Class317) this).anObjectArray3682[i_14_]) {
				method5605(i_14_, (byte) 0);
				if (null == ((Class317) this).anObjectArray3682[i_14_])
					bool = false;
			}
		}
		return bool;
	}

	synchronized int method5613(int i, byte i_15_) {
		if (!method5603(i, 16711680))
			return 0;
		if (((Class317) this).anObjectArray3682[i] != null)
			return 100;
		return ((Class317) this).aClass327_3690.method5806(i, (byte) 49);
	}

	public synchronized int method5614(int i) {
		if (!method5635((byte) 1))
			return 0;
		int i_16_ = 0;
		int i_17_ = 0;
		for (int i_18_ = 0; i_18_ < ((Class317) this).anObjectArray3682.length; i_18_++) {
			if ((((Class322) ((Class317) this).aClass322_3694).anIntArray3744[i_18_]) > 0) {
				i_16_ += 100;
				i_17_ += method5613(i_18_, (byte) -93);
			}
		}
		if (0 == i_16_)
			return 100;
		int i_19_ = 100 * i_17_ / i_16_;
		return i_19_;
	}

	public synchronized byte[] method5615(int i, int i_20_) {
		if (!method5635((byte) 1))
			return null;
		if (((Class322) ((Class317) this).aClass322_3694).anIntArray3748.length == 1)
			return method5607(0, i, -1610063782);
		if (!method5603(i, 16711680))
			return null;
		if (1 == ((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])
			return method5607(i, 0, -2077891857);
		throw new RuntimeException();
	}

	public synchronized int[] method5616(int i, int i_21_) {
		if (!method5603(i, 16711680))
			return null;
		int[] is = (((Class322) ((Class317) this).aClass322_3694).anIntArrayArray3732[i]);
		if (null == is) {
			is = new int[(((Class322) ((Class317) this).aClass322_3694).anIntArray3744[i])];
			for (int i_22_ = 0; i_22_ < is.length; i_22_++)
				is[i_22_] = i_22_;
		}
		return is;
	}

	public void method5617(String string) {
		if (method5635((byte) 1)) {
			string = string.toLowerCase();
			int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 773521919), -1815814704));
			method5606(i, 1975002633);
		}
	}

	public int method5618(int i) {
		if (!method5635((byte) 1))
			return -1;
		return (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length;
	}

	public synchronized void method5619(int i, int i_23_) {
		if (method5603(i, 16711680)) {
			if (null != ((Class317) this).anObjectArrayArray3688)
				((Class317) this).anObjectArrayArray3688[i] = null;
		}
	}

	synchronized boolean method5620() {
		if (((Class317) this).aClass322_3694 == null) {
			((Class317) this).aClass322_3694 = ((Class317) this).aClass327_3690.method5803(-812003151);
			if (((Class317) this).aClass322_3694 == null)
				return false;
			((Class317) this).anObjectArray3682 = new Object[(((Class322) ((Class317) this).aClass322_3694).anInt3740) * 1563136279];
			((Class317) this).anObjectArrayArray3688 = new Object[(((Class322) ((Class317) this).aClass322_3694).anInt3740) * 1563136279][];
		}
		return true;
	}

	public synchronized byte[] method5621(String string, String string_24_) {
		if (!method5635((byte) 1))
			return null;
		string = string.toLowerCase();
		string_24_ = string_24_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 532020848), -1628167191));
		if (!method5603(i, 16711680))
			return null;
		int i_25_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_24_, -354779451), -2143360651));
		return method5607(i, i_25_, -1618039130);
	}

	void method5622(int i) {
		((Class317) this).aClass327_3690.method5805(i, 1941193995);
	}

	public int method5623(int i, byte i_26_) {
		if (!method5635((byte) 1))
			return -1;
		int i_27_ = ((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(i, -1675109701);
		if (!method5603(i_27_, 16711680))
			return -1;
		return i_27_;
	}

	public int method5624(int i, int i_28_) {
		if (!method5603(i, 16711680))
			return 0;
		return ((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i];
	}

	public boolean method5625(String string, String string_29_, byte i) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_29_ = string_29_.toLowerCase();
		int i_30_ = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1816008366), -1883190493));
		if (i_30_ < 0)
			return false;
		int i_31_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i_30_].method865(Class505.method8696(string_29_, -92083175), -1658700496));
		if (i_31_ < 0)
			return false;
		return true;
	}

	public synchronized byte[] method5626(String string, String string_32_, byte i) {
		if (!method5635((byte) 1))
			return null;
		string = string.toLowerCase();
		string_32_ = string_32_.toLowerCase();
		int i_33_ = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1702952082), -1918848832));
		if (!method5603(i_33_, 16711680))
			return null;
		int i_34_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i_33_].method865(Class505.method8696(string_32_, -1819598468), -1926581994));
		return method5607(i_33_, i_34_, -1552378572);
	}

	boolean method5627(String string, String string_35_, byte i) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_35_ = string_35_.toLowerCase();
		int i_36_ = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 639316649), -1994003594));
		if (!method5603(i_36_, 16711680))
			return false;
		int i_37_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i_36_].method865(Class505.method8696(string_35_, -316679725), -1542672707));
		return method5688(i_36_, i_37_, 16711935);
	}

	public boolean method5628(String string, int i) {
		int i_38_ = method5610("", -200916633);
		if (-1 != i_38_)
			return method5627("", string, (byte) -29);
		return method5627(string, "", (byte) 31);
	}

	public boolean method5629(String string, int i) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i_39_ = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1032103959), -2031296285));
		return method5647(i_39_, -2119577317);
	}

	public void method5630(String string, int i) {
		if (method5635((byte) 1)) {
			string = string.toLowerCase();
			int i_40_ = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 320473901), -2076023188));
			method5606(i_40_, 831904871);
		}
	}

	public int method5631(String string, byte i) {
		if (!method5635((byte) 1))
			return 0;
		string = string.toLowerCase();
		int i_41_ = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1627018596), -1645709178));
		return method5613(i_41_, (byte) -6);
	}

	static {
		anInt3689 = 0;
	}

	public synchronized byte[] method5632(String string, String string_42_) {
		if (!method5635((byte) 1))
			return null;
		string = string.toLowerCase();
		string_42_ = string_42_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -7509924), -1529117724));
		if (!method5603(i, 16711680))
			return null;
		int i_43_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_42_, -1159328950), -1645264325));
		return method5607(i, i_43_, -1671568270);
	}

	synchronized boolean method5633() {
		if (((Class317) this).aClass322_3694 == null) {
			((Class317) this).aClass322_3694 = ((Class317) this).aClass327_3690.method5803(-1653982660);
			if (((Class317) this).aClass322_3694 == null)
				return false;
			((Class317) this).anObjectArray3682 = new Object[(((Class322) ((Class317) this).aClass322_3694).anInt3740) * 1563136279];
			((Class317) this).anObjectArrayArray3688 = new Object[(((Class322) ((Class317) this).aClass322_3694).anInt3740) * 1563136279][];
		}
		return true;
	}

	public int method5634() {
		if (!method5635((byte) 1))
			throw new IllegalStateException("");
		return (-2006273977 * ((Class322) ((Class317) this).aClass322_3694).anInt3733);
	}

	synchronized boolean method5635(byte i) {
		if (((Class317) this).aClass322_3694 == null) {
			((Class317) this).aClass322_3694 = ((Class317) this).aClass327_3690.method5803(-860118856);
			if (((Class317) this).aClass322_3694 == null)
				return false;
			((Class317) this).anObjectArray3682 = new Object[(((Class322) ((Class317) this).aClass322_3694).anInt3740) * 1563136279];
			((Class317) this).anObjectArrayArray3688 = new Object[(((Class322) ((Class317) this).aClass322_3694).anInt3740) * 1563136279][];
		}
		return true;
	}

	public int method5636(String string) {
		if (!method5635((byte) 1))
			return 0;
		string = string.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 535815928), -1650121675));
		return method5613(i, (byte) 47);
	}

	public int method5637(int i) {
		if (!method5635((byte) 1))
			return -1;
		int i_44_ = ((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(i, -1841382872);
		if (!method5603(i_44_, 16711680))
			return -1;
		return i_44_;
	}

	synchronized boolean method5638(int i, int i_45_, int[] is, int i_46_) {
		if (!method5603(i, 16711680))
			return false;
		if (((Class317) this).anObjectArray3682[i] == null)
			return false;
		int i_47_ = ((Class322) ((Class317) this).aClass322_3694).anIntArray3744[i];
		int[] is_48_ = (((Class322) ((Class317) this).aClass322_3694).anIntArrayArray3732[i]);
		if (null == ((Class317) this).anObjectArrayArray3688[i])
			((Class317) this).anObjectArrayArray3688[i] = new Object[(((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])];
		Object[] objects = ((Class317) this).anObjectArrayArray3688[i];
		boolean bool = true;
		for (int i_49_ = 0; i_49_ < i_47_; i_49_++) {
			int i_50_;
			if (null == is_48_)
				i_50_ = i_49_;
			else
				i_50_ = is_48_[i_49_];
			if (objects[i_50_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_51_;
		if (null != is && (is[0] != 0 || 0 != is[1] || 0 != is[2] || is[3] != 0)) {
			is_51_ = Class346.method6154(((Class317) this).anObjectArray3682[i], true, (byte) 1);
			RsByteBuffer class282_sub35 = new RsByteBuffer(is_51_);
			class282_sub35.method13249(is, 5, class282_sub35.buffer.length, -429400691);
		} else
			is_51_ = Class346.method6154(((Class317) this).anObjectArray3682[i], false, (byte) 1);
		byte[] is_52_;
		try {
			is_52_ = Class282_Sub17_Sub6.method15438(is_51_, (byte) 43);
		} catch (RuntimeException runtimeexception) {
			throw Class150.method2585(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_51_.length).append(" ").append(Class285.method5028(is_51_, is_51_.length, (short) 255)).append(" ").append(Class285.method5028(is_51_, is_51_.length - 2, (short) 255)).append(" ").append(((Class322) ((Class317) this).aClass322_3694).anIntArray3745[i]).append(" ").append(-2006273977 * (((Class322) ((Class317) this).aClass322_3694).anInt3733)).toString());
		}
		if (((Class317) this).aBool3685)
			((Class317) this).anObjectArray3682[i] = null;
		if (i_47_ > 1) {
			if (1067739717 * ((Class317) this).anInt3683 != 2) {
				int i_53_ = is_52_.length;
				int i_54_ = is_52_[--i_53_] & 0xff;
				i_53_ -= i_54_ * i_47_ * 4;
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_52_);
				int[] is_55_ = new int[i_47_];
				class282_sub35.index = i_53_ * -1115476867;
				for (int i_56_ = 0; i_56_ < i_54_; i_56_++) {
					int i_57_ = 0;
					for (int i_58_ = 0; i_58_ < i_47_; i_58_++) {
						i_57_ += class282_sub35.readInt();
						is_55_[i_58_] += i_57_;
					}
				}
				byte[][] is_59_ = new byte[i_47_][];
				for (int i_60_ = 0; i_60_ < i_47_; i_60_++) {
					is_59_[i_60_] = new byte[is_55_[i_60_]];
					is_55_[i_60_] = 0;
				}
				class282_sub35.index = i_53_ * -1115476867;
				int i_61_ = 0;
				for (int i_62_ = 0; i_62_ < i_54_; i_62_++) {
					int i_63_ = 0;
					for (int i_64_ = 0; i_64_ < i_47_; i_64_++) {
						i_63_ += class282_sub35.readInt();
						System.arraycopy(is_52_, i_61_, is_59_[i_64_], is_55_[i_64_], i_63_);
						is_55_[i_64_] += i_63_;
						i_61_ += i_63_;
					}
				}
				for (int i_65_ = 0; i_65_ < i_47_; i_65_++) {
					int i_66_;
					if (is_48_ == null)
						i_66_ = i_65_;
					else
						i_66_ = is_48_[i_65_];
					if (((Class317) this).anInt3683 * 1067739717 == 0)
						objects[i_66_] = Class309.method5493(is_59_[i_65_], false, (byte) 5);
					else
						objects[i_66_] = is_59_[i_65_];
				}
			} else {
				int i_67_ = is_52_.length;
				int i_68_ = is_52_[--i_67_] & 0xff;
				i_67_ -= 4 * (i_68_ * i_47_);
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_52_);
				int i_69_ = 0;
				int i_70_ = 0;
				class282_sub35.index = i_67_ * -1115476867;
				for (int i_71_ = 0; i_71_ < i_68_; i_71_++) {
					int i_72_ = 0;
					for (int i_73_ = 0; i_73_ < i_47_; i_73_++) {
						i_72_ += class282_sub35.readInt();
						int i_74_;
						if (null == is_48_)
							i_74_ = i_73_;
						else
							i_74_ = is_48_[i_73_];
						if (i_45_ == i_74_) {
							i_69_ += i_72_;
							i_70_ = i_74_;
						}
					}
				}
				if (0 == i_69_)
					return true;
				byte[] is_75_ = new byte[i_69_];
				i_69_ = 0;
				class282_sub35.index = -1115476867 * i_67_;
				int i_76_ = 0;
				for (int i_77_ = 0; i_77_ < i_68_; i_77_++) {
					int i_78_ = 0;
					for (int i_79_ = 0; i_79_ < i_47_; i_79_++) {
						i_78_ += class282_sub35.readInt();
						int i_80_;
						if (is_48_ == null)
							i_80_ = i_79_;
						else
							i_80_ = is_48_[i_79_];
						if (i_80_ == i_45_) {
							System.arraycopy(is_52_, i_76_, is_75_, i_69_, i_78_);
							i_69_ += i_78_;
						}
						i_76_ += i_78_;
					}
				}
				objects[i_70_] = is_75_;
			}
		} else {
			int i_81_;
			if (is_48_ == null)
				i_81_ = 0;
			else
				i_81_ = is_48_[0];
			if (0 == 1067739717 * ((Class317) this).anInt3683)
				objects[i_81_] = Class309.method5493(is_52_, false, (byte) 109);
			else
				objects[i_81_] = is_52_;
		}
		return true;
	}

	void method5639(int i) {
		((Class317) this).aClass327_3690.method5805(i, 1941193995);
	}

	boolean method5640(String string, String string_82_) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_82_ = string_82_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -387435017), -2063240900));
		if (!method5603(i, 16711680))
			return false;
		int i_83_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_82_, 790390616), -2027995032));
		return method5688(i, i_83_, 16711935);
	}

	synchronized int method5641(int i) {
		if (!method5603(i, 16711680))
			return 0;
		if (((Class317) this).anObjectArray3682[i] != null)
			return 100;
		return ((Class317) this).aClass327_3690.method5806(i, (byte) 84);
	}

	void method5642(int i) {
		((Class317) this).aClass327_3690.method5805(i, 1941193995);
	}

	public synchronized byte[] method5643(int i, int i_84_, int[] xteas, int i_85_) {
		if (!method5604(i, i_84_, -1834383347))
			return null;
		byte[] is_86_ = null;
		if (((Class317) this).anObjectArrayArray3688[i] == null || null == ((Class317) this).anObjectArrayArray3688[i][i_84_]) {
			boolean bool = method5638(i, i_84_, xteas, 2068142986);
			if (!bool) {
				method5605(i, (byte) 0);
				bool = method5638(i, i_84_, xteas, 382040238);
				if (!bool)
					return null;
			}
		}
		if (null == ((Class317) this).anObjectArrayArray3688[i])
			throw new RuntimeException("");
		if (null != ((Class317) this).anObjectArrayArray3688[i][i_84_]) {
			is_86_ = Class346.method6154((((Class317) this).anObjectArrayArray3688[i][i_84_]), false, (byte) 1);
			if (is_86_ == null)
				throw new RuntimeException("");
		}
		if (is_86_ != null) {
			if (1 == ((Class317) this).anInt3683 * 1067739717) {
				((Class317) this).anObjectArrayArray3688[i][i_84_] = null;
				if (1 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i]))
					((Class317) this).anObjectArrayArray3688[i] = null;
			} else if (((Class317) this).anInt3683 * 1067739717 == 2)
				((Class317) this).anObjectArrayArray3688[i] = null;
		}
		return is_86_;
	}

	public synchronized byte[] method5644(int i, int i_87_, int[] is) {
		if (!method5604(i, i_87_, -1834383347))
			return null;
		byte[] is_88_ = null;
		if (((Class317) this).anObjectArrayArray3688[i] == null || null == ((Class317) this).anObjectArrayArray3688[i][i_87_]) {
			boolean bool = method5638(i, i_87_, is, 876920409);
			if (!bool) {
				method5605(i, (byte) 0);
				bool = method5638(i, i_87_, is, -830684638);
				if (!bool)
					return null;
			}
		}
		if (null == ((Class317) this).anObjectArrayArray3688[i])
			throw new RuntimeException("");
		if (null != ((Class317) this).anObjectArrayArray3688[i][i_87_]) {
			is_88_ = Class346.method6154((((Class317) this).anObjectArrayArray3688[i][i_87_]), false, (byte) 1);
			if (is_88_ == null)
				throw new RuntimeException("");
		}
		if (is_88_ != null) {
			if (1 == ((Class317) this).anInt3683 * 1067739717) {
				((Class317) this).anObjectArrayArray3688[i][i_87_] = null;
				if (1 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i]))
					((Class317) this).anObjectArrayArray3688[i] = null;
			} else if (((Class317) this).anInt3683 * 1067739717 == 2)
				((Class317) this).anObjectArrayArray3688[i] = null;
		}
		return is_88_;
	}

	public synchronized byte[] method5645(int i, int i_89_, int[] is) {
		if (!method5604(i, i_89_, -1834383347))
			return null;
		byte[] is_90_ = null;
		if (((Class317) this).anObjectArrayArray3688[i] == null || null == ((Class317) this).anObjectArrayArray3688[i][i_89_]) {
			boolean bool = method5638(i, i_89_, is, -1138525784);
			if (!bool) {
				method5605(i, (byte) 0);
				bool = method5638(i, i_89_, is, -1248285257);
				if (!bool)
					return null;
			}
		}
		if (null == ((Class317) this).anObjectArrayArray3688[i])
			throw new RuntimeException("");
		if (null != ((Class317) this).anObjectArrayArray3688[i][i_89_]) {
			is_90_ = Class346.method6154((((Class317) this).anObjectArrayArray3688[i][i_89_]), false, (byte) 1);
			if (is_90_ == null)
				throw new RuntimeException("");
		}
		if (is_90_ != null) {
			if (1 == ((Class317) this).anInt3683 * 1067739717) {
				((Class317) this).anObjectArrayArray3688[i][i_89_] = null;
				if (1 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i]))
					((Class317) this).anObjectArrayArray3688[i] = null;
			} else if (((Class317) this).anInt3683 * 1067739717 == 2)
				((Class317) this).anObjectArrayArray3688[i] = null;
		}
		return is_90_;
	}

	synchronized boolean method5646(int i, int i_91_, int[] is) {
		if (!method5603(i, 16711680))
			return false;
		if (((Class317) this).anObjectArray3682[i] == null)
			return false;
		int i_92_ = ((Class322) ((Class317) this).aClass322_3694).anIntArray3744[i];
		int[] is_93_ = (((Class322) ((Class317) this).aClass322_3694).anIntArrayArray3732[i]);
		if (null == ((Class317) this).anObjectArrayArray3688[i])
			((Class317) this).anObjectArrayArray3688[i] = new Object[(((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])];
		Object[] objects = ((Class317) this).anObjectArrayArray3688[i];
		boolean bool = true;
		for (int i_94_ = 0; i_94_ < i_92_; i_94_++) {
			int i_95_;
			if (null == is_93_)
				i_95_ = i_94_;
			else
				i_95_ = is_93_[i_94_];
			if (objects[i_95_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_96_;
		if (null != is && (is[0] != 0 || 0 != is[1] || 0 != is[2] || is[3] != 0)) {
			is_96_ = Class346.method6154(((Class317) this).anObjectArray3682[i], true, (byte) 1);
			RsByteBuffer class282_sub35 = new RsByteBuffer(is_96_);
			class282_sub35.method13249(is, 5, class282_sub35.buffer.length, -429400691);
		} else
			is_96_ = Class346.method6154(((Class317) this).anObjectArray3682[i], false, (byte) 1);
		byte[] is_97_;
		try {
			is_97_ = Class282_Sub17_Sub6.method15438(is_96_, (byte) 26);
		} catch (RuntimeException runtimeexception) {
			throw Class150.method2585(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_96_.length).append(" ").append(Class285.method5028(is_96_, is_96_.length, (short) 255)).append(" ").append(Class285.method5028(is_96_, is_96_.length - 2, (short) 255)).append(" ").append(((Class322) ((Class317) this).aClass322_3694).anIntArray3745[i]).append(" ").append(-2006273977 * (((Class322) ((Class317) this).aClass322_3694).anInt3733)).toString());
		}
		if (((Class317) this).aBool3685)
			((Class317) this).anObjectArray3682[i] = null;
		if (i_92_ > 1) {
			if (1067739717 * ((Class317) this).anInt3683 != 2) {
				int i_98_ = is_97_.length;
				int i_99_ = is_97_[--i_98_] & 0xff;
				i_98_ -= i_99_ * i_92_ * 4;
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_97_);
				int[] is_100_ = new int[i_92_];
				class282_sub35.index = i_98_ * -1115476867;
				for (int i_101_ = 0; i_101_ < i_99_; i_101_++) {
					int i_102_ = 0;
					for (int i_103_ = 0; i_103_ < i_92_; i_103_++) {
						i_102_ += class282_sub35.readInt();
						is_100_[i_103_] += i_102_;
					}
				}
				byte[][] is_104_ = new byte[i_92_][];
				for (int i_105_ = 0; i_105_ < i_92_; i_105_++) {
					is_104_[i_105_] = new byte[is_100_[i_105_]];
					is_100_[i_105_] = 0;
				}
				class282_sub35.index = i_98_ * -1115476867;
				int i_106_ = 0;
				for (int i_107_ = 0; i_107_ < i_99_; i_107_++) {
					int i_108_ = 0;
					for (int i_109_ = 0; i_109_ < i_92_; i_109_++) {
						i_108_ += class282_sub35.readInt();
						System.arraycopy(is_97_, i_106_, is_104_[i_109_], is_100_[i_109_], i_108_);
						is_100_[i_109_] += i_108_;
						i_106_ += i_108_;
					}
				}
				for (int i_110_ = 0; i_110_ < i_92_; i_110_++) {
					int i_111_;
					if (is_93_ == null)
						i_111_ = i_110_;
					else
						i_111_ = is_93_[i_110_];
					if (((Class317) this).anInt3683 * 1067739717 == 0)
						objects[i_111_] = Class309.method5493(is_104_[i_110_], false, (byte) 73);
					else
						objects[i_111_] = is_104_[i_110_];
				}
			} else {
				int i_112_ = is_97_.length;
				int i_113_ = is_97_[--i_112_] & 0xff;
				i_112_ -= 4 * (i_113_ * i_92_);
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_97_);
				int i_114_ = 0;
				int i_115_ = 0;
				class282_sub35.index = i_112_ * -1115476867;
				for (int i_116_ = 0; i_116_ < i_113_; i_116_++) {
					int i_117_ = 0;
					for (int i_118_ = 0; i_118_ < i_92_; i_118_++) {
						i_117_ += class282_sub35.readInt();
						int i_119_;
						if (null == is_93_)
							i_119_ = i_118_;
						else
							i_119_ = is_93_[i_118_];
						if (i_91_ == i_119_) {
							i_114_ += i_117_;
							i_115_ = i_119_;
						}
					}
				}
				if (0 == i_114_)
					return true;
				byte[] is_120_ = new byte[i_114_];
				i_114_ = 0;
				class282_sub35.index = -1115476867 * i_112_;
				int i_121_ = 0;
				for (int i_122_ = 0; i_122_ < i_113_; i_122_++) {
					int i_123_ = 0;
					for (int i_124_ = 0; i_124_ < i_92_; i_124_++) {
						i_123_ += class282_sub35.readInt();
						int i_125_;
						if (is_93_ == null)
							i_125_ = i_124_;
						else
							i_125_ = is_93_[i_124_];
						if (i_125_ == i_91_) {
							System.arraycopy(is_97_, i_121_, is_120_, i_114_, i_123_);
							i_114_ += i_123_;
						}
						i_121_ += i_123_;
					}
				}
				objects[i_115_] = is_120_;
			}
		} else {
			int i_126_;
			if (is_93_ == null)
				i_126_ = 0;
			else
				i_126_ = is_93_[0];
			if (0 == 1067739717 * ((Class317) this).anInt3683)
				objects[i_126_] = Class309.method5493(is_97_, false, (byte) 34);
			else
				objects[i_126_] = is_97_;
		}
		return true;
	}

	public synchronized boolean method5647(int i, int i_127_) {
		if (!method5603(i, 16711680))
			return false;
		if (null != ((Class317) this).anObjectArray3682[i])
			return true;
		method5605(i, (byte) 0);
		if (null != ((Class317) this).anObjectArray3682[i])
			return true;
		return false;
	}

	public synchronized boolean method5648(int i) {
		if (!method5635((byte) 1))
			return false;
		if (1 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length)
			return method5688(0, i, 16711935);
		if (!method5603(i, 16711680))
			return false;
		if (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i] == 1)
			return method5688(i, 0, 16711935);
		throw new RuntimeException();
	}

	public synchronized boolean method5649(int i) {
		if (!method5635((byte) 1))
			return false;
		if (1 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length)
			return method5688(0, i, 16711935);
		if (!method5603(i, 16711680))
			return false;
		if (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i] == 1)
			return method5688(i, 0, 16711935);
		throw new RuntimeException();
	}

	public synchronized boolean method5650(int i) {
		if (!method5603(i, 16711680))
			return false;
		if (null != ((Class317) this).anObjectArray3682[i])
			return true;
		method5605(i, (byte) 0);
		if (null != ((Class317) this).anObjectArray3682[i])
			return true;
		return false;
	}

	public synchronized boolean method5651(int i) {
		if (!method5635((byte) 1))
			return false;
		if (1 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length)
			return method5688(0, i, 16711935);
		if (!method5603(i, 16711680))
			return false;
		if (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i] == 1)
			return method5688(i, 0, 16711935);
		throw new RuntimeException();
	}

	synchronized int method5652(int i) {
		if (!method5603(i, 16711680))
			return 0;
		if (((Class317) this).anObjectArray3682[i] != null)
			return 100;
		return ((Class317) this).aClass327_3690.method5806(i, (byte) 63);
	}

	public synchronized int method5653() {
		if (!method5635((byte) 1))
			return 0;
		int i = 0;
		int i_128_ = 0;
		for (int i_129_ = 0; i_129_ < ((Class317) this).anObjectArray3682.length; i_129_++) {
			if ((((Class322) ((Class317) this).aClass322_3694).anIntArray3744[i_129_]) > 0) {
				i += 100;
				i_128_ += method5613(i_129_, (byte) 11);
			}
		}
		if (0 == i)
			return 100;
		int i_130_ = 100 * i_128_ / i;
		return i_130_;
	}

	public synchronized byte[] method5654(int i) {
		if (!method5635((byte) 1))
			return null;
		if (((Class322) ((Class317) this).aClass322_3694).anIntArray3748.length == 1)
			return method5607(0, i, -1441335109);
		if (!method5603(i, 16711680))
			return null;
		if (1 == ((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])
			return method5607(i, 0, -1687894798);
		throw new RuntimeException();
	}

	synchronized boolean method5655(int i, int i_131_) {
		if (!method5635((byte) 1))
			return false;
		if (i < 0 || i_131_ < 0 || i >= (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length || i_131_ >= (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])) {
			if (aBool3692)
				throw new IllegalArgumentException(new StringBuilder().append(i).append(" ").append(i_131_).toString());
			return false;
		}
		return true;
	}

	public synchronized int[] method5656(int i) {
		if (!method5603(i, 16711680))
			return null;
		int[] is = (((Class322) ((Class317) this).aClass322_3694).anIntArrayArray3732[i]);
		if (null == is) {
			is = new int[(((Class322) ((Class317) this).aClass322_3694).anIntArray3744[i])];
			for (int i_132_ = 0; i_132_ < is.length; i_132_++)
				is[i_132_] = i_132_;
		}
		return is;
	}

	public int method5657(int i) {
		if (!method5603(i, 16711680))
			return 0;
		return ((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i];
	}

	public int method5658(int i) {
		if (!method5635((byte) 1))
			return -1;
		int i_133_ = ((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(i, -1617413821);
		if (!method5603(i_133_, 16711680))
			return -1;
		return i_133_;
	}

	public int method5659() {
		if (!method5635((byte) 1))
			return -1;
		return (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length;
	}

	boolean method5660(String string, String string_134_) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_134_ = string_134_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 557483804), -1801616016));
		if (!method5603(i, 16711680))
			return false;
		int i_135_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_134_, -1679798670), -1594002616));
		return method5688(i, i_135_, 16711935);
	}

	public synchronized boolean method5661(int i, int i_136_) {
		if (!method5635((byte) 1))
			return false;
		if (1 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length)
			return method5688(0, i, 16711935);
		if (!method5603(i, 16711680))
			return false;
		if (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i] == 1)
			return method5688(i, 0, 16711935);
		throw new RuntimeException();
	}

	public void method5662(boolean bool, boolean bool_137_) {
		if (method5635((byte) 1)) {
			if (bool) {
				((Class322) ((Class317) this).aClass322_3694).anIntArray3738 = null;
				((Class322) ((Class317) this).aClass322_3694).aClass40_3739 = null;
			}
			if (bool_137_) {
				((Class322) ((Class317) this).aClass322_3694).anIntArrayArray3746 = null;
				((Class322) ((Class317) this).aClass322_3694).aClass40Array3741 = null;
			}
		}
	}

	public void method5663(boolean bool, boolean bool_138_) {
		if (method5635((byte) 1)) {
			if (bool) {
				((Class322) ((Class317) this).aClass322_3694).anIntArray3738 = null;
				((Class322) ((Class317) this).aClass322_3694).aClass40_3739 = null;
			}
			if (bool_138_) {
				((Class322) ((Class317) this).aClass322_3694).anIntArrayArray3746 = null;
				((Class322) ((Class317) this).aClass322_3694).aClass40Array3741 = null;
			}
		}
	}

	public void method5664(boolean bool, boolean bool_139_) {
		if (method5635((byte) 1)) {
			if (bool) {
				((Class322) ((Class317) this).aClass322_3694).anIntArray3738 = null;
				((Class322) ((Class317) this).aClass322_3694).aClass40_3739 = null;
			}
			if (bool_139_) {
				((Class322) ((Class317) this).aClass322_3694).anIntArrayArray3746 = null;
				((Class322) ((Class317) this).aClass322_3694).aClass40Array3741 = null;
			}
		}
	}

	public Class317(Class327 class327, boolean bool, int i) {
		if (i < 0 || i > 2)
			throw new IllegalArgumentException("");
		((Class317) this).aClass327_3690 = class327;
		((Class317) this).aBool3685 = bool;
		((Class317) this).anInt3683 = i * -1279321971;
	}

	public int method5665(String string) {
		if (!method5635((byte) 1))
			return -1;
		string = string.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -2060943249), -1681538698));
		if (!method5603(i, 16711680))
			return -1;
		return i;
	}

	public int method5666(int i) {
		if (!method5635((byte) 1))
			return -1;
		int i_140_ = ((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(i, -2071966577);
		if (!method5603(i_140_, 16711680))
			return -1;
		return i_140_;
	}

	public int method5667(String string) {
		if (!method5635((byte) 1))
			return 0;
		string = string.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1768848227), -1641833264));
		return method5613(i, (byte) -96);
	}

	public boolean method5668(String string) {
		int i = method5610("", -552874421);
		if (-1 != i)
			return method5627("", string, (byte) 53);
		return method5627(string, "", (byte) 71);
	}

	public boolean method5669(String string) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -915258889), -1727927839));
		if (i < 0)
			return false;
		return true;
	}

	public boolean method5670(String string) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1692372125), -2080894365));
		if (i < 0)
			return false;
		return true;
	}

	public boolean method5671(String string) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 825541651), -1867869969));
		if (i < 0)
			return false;
		return true;
	}

	public synchronized boolean method5672(int i, int i_141_) {
		if (!method5604(i, i_141_, -1834383347))
			return false;
		if (((Class317) this).anObjectArrayArray3688[i] != null && ((Class317) this).anObjectArrayArray3688[i][i_141_] != null)
			return true;
		if (((Class317) this).anObjectArray3682[i] != null)
			return true;
		method5605(i, (byte) 0);
		if (null != ((Class317) this).anObjectArray3682[i])
			return true;
		return false;
	}

	public boolean method5673(String string, String string_142_) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_142_ = string_142_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 123879864), -1890845180));
		if (i < 0)
			return false;
		int i_143_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_142_, -1202274403), -1965287606));
		if (i_143_ < 0)
			return false;
		return true;
	}

	public boolean method5674(String string, String string_144_) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_144_ = string_144_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1783596769), -1840800228));
		if (i < 0)
			return false;
		int i_145_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_144_, 500031796), -1621453325));
		if (i_145_ < 0)
			return false;
		return true;
	}

	public synchronized byte[] method5675(String string, String string_146_) {
		if (!method5635((byte) 1))
			return null;
		string = string.toLowerCase();
		string_146_ = string_146_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1352654462), -1967554044));
		if (!method5603(i, 16711680))
			return null;
		int i_147_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_146_, -15935266), -1547314840));
		return method5607(i, i_147_, -1997607006);
	}

	public void method5676(boolean bool, boolean bool_148_, byte i) {
		if (method5635((byte) 1)) {
			if (bool) {
				((Class322) ((Class317) this).aClass322_3694).anIntArray3738 = null;
				((Class322) ((Class317) this).aClass322_3694).aClass40_3739 = null;
			}
			if (bool_148_) {
				((Class322) ((Class317) this).aClass322_3694).anIntArrayArray3746 = null;
				((Class322) ((Class317) this).aClass322_3694).aClass40Array3741 = null;
			}
		}
	}

	public synchronized byte[] method5677(String string, String string_149_) {
		if (!method5635((byte) 1))
			return null;
		string = string.toLowerCase();
		string_149_ = string_149_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 21452779), -1561549211));
		if (!method5603(i, 16711680))
			return null;
		int i_150_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_149_, 653951877), -1698493736));
		return method5607(i, i_150_, -1757473206);
	}

	public synchronized byte[] method5678(int i) {
		if (!method5635((byte) 1))
			return null;
		if (((Class322) ((Class317) this).aClass322_3694).anIntArray3748.length == 1)
			return method5607(0, i, -1449993027);
		if (!method5603(i, 16711680))
			return null;
		if (1 == ((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])
			return method5607(i, 0, -1187330001);
		throw new RuntimeException();
	}

	boolean method5679(String string, String string_151_) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_151_ = string_151_.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -222493619), -1819733188));
		if (!method5603(i, 16711680))
			return false;
		int i_152_ = (((Class322) ((Class317) this).aClass322_3694).aClass40Array3741[i].method865(Class505.method8696(string_151_, -898083348), -2053347529));
		return method5688(i, i_152_, 16711935);
	}

	public boolean method5680(String string) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, 439542471), -1949650563));
		if (i < 0)
			return false;
		return true;
	}

	public int method5681() {
		if (!method5635((byte) 1))
			return -1;
		return (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length;
	}

	void method5682(int i) {
		((Class317) this).aClass327_3690.method5805(i, 1941193995);
	}

	public boolean method5683(String string) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -1040822209), -1568946636));
		return method5647(i, -2119577317);
	}

	synchronized boolean method5684(int i) {
		if (!method5635((byte) 1))
			return false;
		if (i < 0 || i >= (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length || 0 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])) {
			if (aBool3692)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	public void method5685(String string) {
		if (method5635((byte) 1)) {
			string = string.toLowerCase();
			int i = (((Class322) ((Class317) this).aClass322_3694).aClass40_3739.method865(Class505.method8696(string, -245115226), -1961366867));
			method5606(i, 1977967810);
		}
	}

	synchronized boolean method5686(int i) {
		if (!method5635((byte) 1))
			return false;
		if (i < 0 || i >= (((Class322) ((Class317) this).aClass322_3694).anIntArray3748).length || 0 == (((Class322) ((Class317) this).aClass322_3694).anIntArray3748[i])) {
			if (aBool3692)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	public byte[] method5687(int i, int i_153_) {
		return method5643(i, i_153_, null, -1371542666);
	}

	public synchronized boolean method5688(int i, int i_154_, int i_155_) {
		if (!method5604(i, i_154_, -1834383347))
			return false;
		if (((Class317) this).anObjectArrayArray3688[i] != null && ((Class317) this).anObjectArrayArray3688[i][i_154_] != null)
			return true;
		if (((Class317) this).anObjectArray3682[i] != null)
			return true;
		method5605(i, (byte) 0);
		if (null != ((Class317) this).anObjectArray3682[i])
			return true;
		return false;
	}

	static final byte[] method5689(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		int i_156_ = class282_sub35.readInt();
		if (i_156_ < 0 || 1020558379 * anInt3689 != 0 && i_156_ > 1020558379 * anInt3689)
			throw new RuntimeException();
		if (0 == i) {
			byte[] is_157_ = new byte[i_156_];
			class282_sub35.readBytes(is_157_, 0, i_156_, 909514282);
			return is_157_;
		}
		int i_158_ = class282_sub35.readInt();
		if (i_158_ < 0 || 0 != anInt3689 * 1020558379 && i_158_ > 1020558379 * anInt3689)
			throw new RuntimeException();
		byte[] is_159_ = new byte[i_158_];
		if (i == 1)
			Class471.method7828(is_159_, i_158_, is, i_156_, 9);
		else {
			synchronized (aClass395_3684) {
				aClass395_3684.method6767(class282_sub35, is_159_, 532980265);
			}
		}
		return is_159_;
	}

	static final byte[] method5690(byte[] is) {
		RsByteBuffer class282_sub35 = new RsByteBuffer(is);
		int i = class282_sub35.readUnsignedByte();
		int i_160_ = class282_sub35.readInt();
		if (i_160_ < 0 || 1020558379 * anInt3689 != 0 && i_160_ > 1020558379 * anInt3689)
			throw new RuntimeException();
		if (0 == i) {
			byte[] is_161_ = new byte[i_160_];
			class282_sub35.readBytes(is_161_, 0, i_160_, 1294989123);
			return is_161_;
		}
		int i_162_ = class282_sub35.readInt();
		if (i_162_ < 0 || 0 != anInt3689 * 1020558379 && i_162_ > 1020558379 * anInt3689)
			throw new RuntimeException();
		byte[] is_163_ = new byte[i_162_];
		if (i == 1)
			Class471.method7828(is_163_, i_162_, is, i_160_, 9);
		else {
			synchronized (aClass395_3684) {
				aClass395_3684.method6767(class282_sub35, is_163_, -1876509120);
			}
		}
		return is_163_;
	}

	static final void method5691(Class527 class527, byte i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		int i_164_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub36.method15419(string, 1 == i_164_, -940793702);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method5692(Class527 class527, int i) {
		Class518.method11148(((Class521_Sub1) ((Class527) class527).anInterface12_7013), (((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 -= 141891001) * 1942118537)]), -253954252);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	public static int method5693(CharSequence charsequence, int i, int i_165_, byte[] is, int i_166_, int i_167_) {
		int i_168_ = i_165_ - i;
		for (int i_169_ = 0; i_169_ < i_168_; i_169_++) {
			char c = charsequence.charAt(i + i_169_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_169_ + i_166_] = (byte) c;
			else if ('\u20ac' == c)
				is[i_169_ + i_166_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_166_ + i_169_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_166_ + i_169_] = (byte) -125;
			else if ('\u201e' == c)
				is[i_169_ + i_166_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_166_ + i_169_] = (byte) -123;
			else if (c == '\u2020')
				is[i_166_ + i_169_] = (byte) -122;
			else if (c == '\u2021')
				is[i_169_ + i_166_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_166_ + i_169_] = (byte) -120;
			else if (c == '\u2030')
				is[i_169_ + i_166_] = (byte) -119;
			else if ('\u0160' == c)
				is[i_169_ + i_166_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_169_ + i_166_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_169_ + i_166_] = (byte) -116;
			else if (c == '\u017d')
				is[i_166_ + i_169_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_169_ + i_166_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_169_ + i_166_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_169_ + i_166_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_166_ + i_169_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_169_ + i_166_] = (byte) -107;
			else if (c == '\u2013')
				is[i_169_ + i_166_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_169_ + i_166_] = (byte) -105;
			else if (c == '\u02dc')
				is[i_166_ + i_169_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_169_ + i_166_] = (byte) -103;
			else if ('\u0161' == c)
				is[i_166_ + i_169_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_166_ + i_169_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_166_ + i_169_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_166_ + i_169_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_166_ + i_169_] = (byte) -97;
			else
				is[i_166_ + i_169_] = (byte) 63;
		}
		return i_168_;
	}

	public static Class118 method5694(int i, int i_170_, int i_171_) {
		Class118 class118 = Class117.method1981(i, (byte) 33);
		if (-1 == i_170_)
			return class118;
		if (class118 == null || class118.aClass118Array1438 == null || i_170_ >= class118.aClass118Array1438.length)
			return null;
		return class118.aClass118Array1438[i_170_];
	}

	static final void method5695(Class527 class527, byte i) {
		int i_172_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		if (client.anInt7434 * 1609086245 == 2 && i_172_ < 493536965 * client.anInt7449)
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1017482937 * client.aClass6Array7452[i_172_].anInt39;
		else
			((Class527) class527).anIntArray6999[((((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method5696(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 425673003;
		Class153.method2618((((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]), (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 * 1942118537 + 1)]), (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 * 1942118537 + 2)]), 255, 256, 1363502239);
	}
}
