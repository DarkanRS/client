
/* Class478 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class478 {
	public int anInt5633;
	byte aByte5634;
	int anInt5635;
	public byte[] aByteArray5636;
	public int[][] anIntArrayArray5637;
	public String aString5638 = "null";
	int anInt5639;
	public short[] aShortArray5640;
	byte[] aByteArray5641;
	byte aByte5642;
	public short[] aShortArray5643;
	byte aByte5644;
	short[] aShortArray5645;
	byte aByte5646;
	public String[] aStringArray5647;
	public int anInt5648;
	public int anInt5649;
	public int[] anIntArray5650;
	Class474 aClass474_5651;
	public int anInt5652;
	public int anInt5653;
	int anInt5654;
	public boolean aBool5655;
	public int anInt5656;
	public boolean aBool5657;
	public int anInt5658;
	int[] anIntArray5659;
	public boolean aBool5660;
	public int anInt5661;
	int anInt5662;
	int anInt5663;
	public boolean aBool5664;
	public int anInt5665;
	public int anInt5666;
	public int anInt5667;
	SwitchMap aClass465_5668;
	public int anInt5669;
	public int anInt5670;
	public boolean aBool5671;
	public int anInt5672;
	public boolean aBool5673;
	public boolean aBool5674;
	int[] anIntArray5675;
	int anInt5676;
	public int anInt5677;
	int anInt5678;
	int anInt5679;
	short[] aShortArray5680;
	int anInt5681;
	int anInt5682;
	int anInt5683;
	public int anInt5684;
	public boolean aBool5685;
	public boolean aBool5686;
	public int anInt5687;
	public int[] anIntArray5688;
	public int anInt5689;
	int anInt5690;
	public static short[] aShortArray5691 = new short[256];
	int anInt5692;
	public int anInt5693;
	public int anInt5694;
	public int anInt5695;
	public boolean aBool5696;
	byte aByte5697;
	public int anInt5698;
	public boolean aBool5699;
	public boolean aBool5700;
	public boolean aBool5701;
	public boolean aBool5702;
	public boolean aBool5703;
	public int anInt5704;
	public int anInt5705;
	public boolean aBool5706;
	public int[] anIntArray5707;
	public int anInt5708;
	public int anInt5709;
	int anInt5710;
	public boolean aBool5711;
	static final int anInt5712 = 127007;

	public int method7963(int i, int i_0_, int i_1_) {
		if (((Class478) this).aClass465_5668 == null)
			return i_0_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class478) this).aClass465_5668.method7754((long) i));
		if (class282_sub38 == null)
			return i_0_;
		return class282_sub38.anInt8002 * -570797415;
	}

	void method7964(RsByteBuffer class282_sub35, byte i) {
		for (;;) {
			int i_2_ = class282_sub35.readUnsignedByte();
			if (0 == i_2_)
				break;
			method7965(class282_sub35, i_2_, -421182854);
		}
	}

	void method7965(RsByteBuffer class282_sub35, int i, int i_3_) {
		if (i == 1) {
			int i_4_ = class282_sub35.readUnsignedByte();
			aByteArray5636 = new byte[i_4_];
			anIntArrayArray5637 = new int[i_4_][];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				aByteArray5636[i_5_] = class282_sub35.readByte((short) -16663);
				int i_6_ = class282_sub35.readUnsignedByte();
				anIntArrayArray5637[i_5_] = new int[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
					anIntArrayArray5637[i_5_][i_7_] = class282_sub35.readBigSmart(2106520173);
			}
		} else if (i == 2)
			aString5638 = class282_sub35.readString(501873848);
		else if (i == 14)
			anInt5648 = class282_sub35.readUnsignedByte() * 63498699;
		else if (15 == i)
			anInt5649 = class282_sub35.readUnsignedByte() * -390035927;
		else if (17 == i) {
			anInt5677 = 0;
			aBool5664 = false;
		} else if (18 == i)
			aBool5664 = false;
		else if (i == 19)
			anInt5652 = class282_sub35.readUnsignedByte() * 133157829;
		else if (21 == i)
			((Class478) this).aByte5697 = (byte) 1;
		else if (22 == i)
			aBool5655 = true;
		else if (i == 23)
			anInt5656 = 1255728073;
		else if (i == 24) {
			int i_8_ = class282_sub35.readBigSmart(1946195738);
			if (i_8_ != -1)
				((Class478) this).anIntArray5659 = new int[] { i_8_ };
		} else if (i == 27)
			anInt5677 = -1129004249;
		else if (i == 28)
			anInt5661 = (class282_sub35.readUnsignedByte() << 2) * -256480385;
		else if (i == 29)
			((Class478) this).anInt5692 = class282_sub35.readByte((short) -31310) * -887236111;
		else if (39 == i)
			((Class478) this).anInt5663 = class282_sub35.readByte((short) -24295) * -520358997;
		else if (i >= 30 && i < 35)
			aStringArray5647[i - 30] = class282_sub35.readString(1449027993);
		else if (40 == i) {
			int i_9_ = class282_sub35.readUnsignedByte();
			((Class478) this).aShortArray5645 = new short[i_9_];
			aShortArray5640 = new short[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				((Class478) this).aShortArray5645[i_10_] = (short) class282_sub35.readUnsignedShort();
				aShortArray5640[i_10_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 41) {
			int i_11_ = class282_sub35.readUnsignedByte();
			((Class478) this).aShortArray5680 = new short[i_11_];
			aShortArray5643 = new short[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				((Class478) this).aShortArray5680[i_12_] = (short) class282_sub35.readUnsignedShort();
				aShortArray5643[i_12_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_13_ = class282_sub35.readUnsignedByte();
			((Class478) this).aByteArray5641 = new byte[i_13_];
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
				((Class478) this).aByteArray5641[i_14_] = class282_sub35.readByte((short) -18578);
		} else if (i == 62)
			aBool5674 = true;
		else if (i == 64)
			aBool5657 = false;
		else if (65 == i)
			((Class478) this).anInt5676 = class282_sub35.readUnsignedShort() * 801023861;
		else if (i == 66)
			((Class478) this).anInt5639 = class282_sub35.readUnsignedShort() * -1035484709;
		else if (67 == i)
			((Class478) this).anInt5678 = class282_sub35.readUnsignedShort() * 767415499;
		else if (i == 69)
			class282_sub35.readUnsignedByte();
		else if (70 == i)
			((Class478) this).anInt5679 = (class282_sub35.readShort(1685514622) << 2) * -1230022539;
		else if (i == 71)
			((Class478) this).anInt5635 = (class282_sub35.readShort(1579109585) << 2) * 568911825;
		else if (i == 72)
			((Class478) this).anInt5681 = (class282_sub35.readShort(1620608715) << 2) * -1156266609;
		else if (73 == i)
			aBool5685 = true;
		else if (i == 74)
			aBool5686 = true;
		else if (i == 75)
			anInt5687 = class282_sub35.readUnsignedByte() * -1098527587;
		else if (77 == i || 92 == i) {
			((Class478) this).anInt5690 = class282_sub35.readUnsignedShort() * -1845719585;
			if (65535 == ((Class478) this).anInt5690 * 657157663)
				((Class478) this).anInt5690 = 1845719585;
			((Class478) this).anInt5662 = class282_sub35.readUnsignedShort() * -1094307109;
			if (((Class478) this).anInt5662 * -480478893 == 65535)
				((Class478) this).anInt5662 = 1094307109;
			int i_15_ = -1;
			if (i == 92)
				i_15_ = class282_sub35.readBigSmart(2011662671);
			int i_16_ = class282_sub35.readUnsignedByte();
			anIntArray5650 = new int[i_16_ + 2];
			for (int i_17_ = 0; i_17_ <= i_16_; i_17_++)
				anIntArray5650[i_17_] = class282_sub35.readBigSmart(1942776498);
			anIntArray5650[1 + i_16_] = i_15_;
		} else if (78 == i) {
			anInt5653 = class282_sub35.readUnsignedShort() * 846534283;
			anInt5693 = class282_sub35.readUnsignedByte() * 36323001;
		} else if (79 == i) {
			anInt5667 = class282_sub35.readUnsignedShort() * -522100571;
			anInt5698 = class282_sub35.readUnsignedShort() * -291570643;
			anInt5693 = class282_sub35.readUnsignedByte() * 36323001;
			int i_18_ = class282_sub35.readUnsignedByte();
			anIntArray5688 = new int[i_18_];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
				anIntArray5688[i_19_] = class282_sub35.readUnsignedShort();
		} else if (81 == i) {
			((Class478) this).aByte5697 = (byte) 2;
			((Class478) this).anInt5654 = class282_sub35.readUnsignedByte() * -1155853568;
		} else if (i == 82)
			aBool5701 = true;
		else if (88 == i)
			aBool5703 = false;
		else if (i == 89)
			aBool5702 = false;
		else if (91 == i)
			aBool5660 = true;
		else if (93 == i) {
			((Class478) this).aByte5697 = (byte) 3;
			((Class478) this).anInt5654 = class282_sub35.readUnsignedShort() * -1833231597;
		} else if (i == 94)
			((Class478) this).aByte5697 = (byte) 4;
		else if (95 == i) {
			((Class478) this).aByte5697 = (byte) 5;
			((Class478) this).anInt5654 = class282_sub35.readShort(1937595123) * -1833231597;
		} else if (97 == i)
			aBool5671 = true;
		else if (98 == i)
			aBool5706 = true;
		else if (99 == i) {
			anInt5705 = class282_sub35.readUnsignedByte() * -639946005;
			anInt5665 = class282_sub35.readUnsignedShort() * 855306295;
		} else if (i == 100) {
			anInt5670 = class282_sub35.readUnsignedByte() * 493578143;
			anInt5666 = class282_sub35.readUnsignedShort() * -1305998005;
		} else if (101 == i)
			anInt5672 = class282_sub35.readUnsignedByte() * 777293949;
		else if (i == 102)
			anInt5689 = class282_sub35.readUnsignedShort() * -380570225;
		else if (i == 103)
			anInt5656 = 0;
		else if (104 == i)
			anInt5695 = class282_sub35.readUnsignedByte() * -1685623039;
		else if (i == 105)
			aBool5673 = true;
		else if (106 == i) {
			int i_20_ = class282_sub35.readUnsignedByte();
			int i_21_ = 0;
			((Class478) this).anIntArray5659 = new int[i_20_];
			((Class478) this).anIntArray5675 = new int[i_20_];
			for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
				((Class478) this).anIntArray5659[i_22_] = class282_sub35.readBigSmart(2030150652);
				i_21_ += ((Class478) this).anIntArray5675[i_22_] = class282_sub35.readUnsignedByte();
			}
			for (int i_23_ = 0; i_23_ < i_20_; i_23_++)
				((Class478) this).anIntArray5675[i_23_] = ((Class478) this).anIntArray5675[i_23_] * 65535 / i_21_;
		} else if (i == 107)
			anInt5669 = class282_sub35.readUnsignedShort() * 945855293;
		else if (i >= 150 && i < 155) {
			aStringArray5647[i - 150] = class282_sub35.readString(49209846);
			if (!((Class474) ((Class478) this).aClass474_5651).aBool5609)
				aStringArray5647[i - 150] = null;
		} else if (160 == i) {
			int i_24_ = class282_sub35.readUnsignedByte();
			anIntArray5707 = new int[i_24_];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
				anIntArray5707[i_25_] = class282_sub35.readUnsignedShort();
		} else if (162 == i) {
			((Class478) this).aByte5697 = (byte) 3;
			((Class478) this).anInt5654 = class282_sub35.readInt() * -1833231597;
		} else if (163 == i) {
			((Class478) this).aByte5644 = class282_sub35.readByte((short) -5428);
			((Class478) this).aByte5642 = class282_sub35.readByte((short) -3687);
			((Class478) this).aByte5646 = class282_sub35.readByte((short) -32207);
			((Class478) this).aByte5634 = class282_sub35.readByte((short) -12177);
		} else if (164 == i)
			((Class478) this).anInt5682 = class282_sub35.readShort(1834354367) * -2137677977;
		else if (165 == i)
			((Class478) this).anInt5683 = class282_sub35.readShort(1806623177) * 2105389349;
		else if (166 == i)
			((Class478) this).anInt5710 = class282_sub35.readShort(2108159773) * 1749486395;
		else if (167 == i)
			anInt5704 = class282_sub35.readUnsignedShort() * -1140808153;
		else if (168 == i)
			aBool5696 = true;
		else if (169 == i)
			aBool5700 = true;
		else if (i == 170)
			anInt5684 = class282_sub35.readUnsignedSmart(1632519186) * 320365989;
		else if (i == 171)
			anInt5658 = class282_sub35.readUnsignedSmart(1916118902) * -1055006837;
		else if (i == 173) {
			anInt5708 = class282_sub35.readUnsignedShort() * -8430363;
			anInt5709 = class282_sub35.readUnsignedShort() * -1558642785;
		} else if (177 == i)
			aBool5699 = true;
		else if (178 == i)
			anInt5694 = class282_sub35.readUnsignedByte() * -799618175;
		else if (189 == i)
			aBool5711 = true;
		else if (249 == i) {
			int i_26_ = class282_sub35.readUnsignedByte();
			if (((Class478) this).aClass465_5668 == null) {
				int i_27_ = Class323.nextPowerOfTwo(i_26_, -1920576994);
				((Class478) this).aClass465_5668 = new SwitchMap(i_27_);
			}
			for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_29_ = class282_sub35.read24BitUnsignedInteger((short) 13754);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(1733811807));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class478) this).aClass465_5668.method7765(class282, (long) i_29_);
			}
		}
	}

	void method7966(int i) {
		if (anInt5652 * -348507379 == -1) {
			anInt5652 = 0;
			if (null != aByteArray5636 && aByteArray5636.length == 1 && (aByteArray5636[0] == 1109376893 * Class458.aClass458_5490.anInt5481))
				anInt5652 = 133157829;
			for (int i_30_ = 0; i_30_ < 5; i_30_++) {
				if (aStringArray5647[i_30_] != null) {
					anInt5652 = 133157829;
					break;
				}
			}
		}
		if (anInt5687 * -1062790731 == -1)
			anInt5687 = -1098527587 * (0 != 647396503 * anInt5677 ? 1 : 0);
		if (method7967((byte) 39) || aBool5706 || anIntArray5650 != null)
			aBool5699 = true;
	}

	public boolean method7967(byte i) {
		return null != ((Class478) this).anIntArray5659;
	}

	public final boolean method7968(int i) {
		if (null == anIntArrayArray5637)
			return true;
		boolean bool = true;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
			for (int i_31_ = 0; i_31_ < anIntArrayArray5637.length; i_31_++) {
				for (int i_32_ = 0; i_32_ < anIntArrayArray5637[i_31_].length; i_32_++)
					bool &= (((Class474) ((Class478) this).aClass474_5651).aClass317_5611.method5688(anIntArrayArray5637[i_31_][i_32_], 0, 16711935));
			}
		}
		return bool;
	}

	public int method7969() {
		if (((Class478) this).anIntArray5659 != null) {
			if (((Class478) this).anIntArray5659.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_33_ = 0; i_33_ < ((Class478) this).anIntArray5659.length; i_33_++) {
					if (i <= ((Class478) this).anIntArray5675[i_33_])
						return ((Class478) this).anIntArray5659[i_33_];
					i -= ((Class478) this).anIntArray5675[i_33_];
				}
			} else
				return ((Class478) this).anIntArray5659[0];
		}
		return -1;
	}

	public int method7970(int i, int i_34_) {
		if (((Class478) this).aClass465_5668 == null)
			return i_34_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class478) this).aClass465_5668.method7754((long) i));
		if (class282_sub38 == null)
			return i_34_;
		return class282_sub38.anInt8002 * -570797415;
	}

	Class528 method7971(Class505 class505, int i, int i_35_, int i_36_, Class476 class476, int i_37_) {
		int i_38_ = 64 + 1821243153 * ((Class478) this).anInt5692;
		int i_39_ = 850 + -1091753201 * ((Class478) this).anInt5663;
		int i_40_ = i;
		boolean bool = aBool5674 || i_35_ == (Class458.aClass458_5472.anInt5481 * 1109376893) && i_36_ > 3;
		if (bool)
			i |= 0x10;
		if (0 == i_36_) {
			if (128 != -1341804323 * ((Class478) this).anInt5676 || 0 != ((Class478) this).anInt5679 * 1949415389)
				i |= 0x1;
			if (128 != ((Class478) this).anInt5678 * -1815416605 || -1272530577 * ((Class478) this).anInt5681 != 0)
				i |= 0x4;
		} else
			i |= 0xd;
		if (((Class478) this).anInt5639 * -1356049837 != 128 || 520802609 * ((Class478) this).anInt5635 != 0)
			i |= 0x2;
		if (null != ((Class478) this).aShortArray5645)
			i |= 0x4000;
		if (((Class478) this).aShortArray5680 != null)
			i |= 0x8000;
		if (0 != ((Class478) this).aByte5634)
			i |= 0x80000;
		Class528 class528 = null;
		if (aByteArray5636 != null) {
			int i_41_ = -1;
			for (int i_42_ = 0; i_42_ < aByteArray5636.length; i_42_++) {
				if (i_35_ == aByteArray5636[i_42_]) {
					i_41_ = i_42_;
					break;
				}
			}
			if (-1 == i_41_)
				return null;
			int[] is = ((null != class476 && null != ((Class476) class476).anIntArray5626) ? ((Class476) class476).anIntArray5626 : anIntArrayArray5637[i_41_]);
			int i_43_ = is.length;
			if (i_43_ > 0) {
				long l = (long) (-413843045 * class505.anInt5840);
				for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
					l = (long) is[i_44_] + 67783L * l;
				synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5614) {
					class528 = ((Class528) ((Class474) ((Class478) this).aClass474_5651).aClass229_5614.method3865(l));
				}
				if (null != class528) {
					if (i_38_ != class528.c())
						i |= 0x1000;
					if (i_39_ != class528.Z())
						i |= 0x2000;
				}
				if (class528 == null || class505.method8452(class528.m(), i) != 0) {
					int i_45_ = i | 0x1f01f;
					if (class528 != null)
						i_45_ = class505.method8546(i_45_, class528.m());
					Class157 class157 = null;
					synchronized (((Class474) ((Class478) this).aClass474_5651).aClass157Array5616) {
						for (int i_46_ = 0; i_46_ < i_43_; i_46_++) {
							synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
								class157 = Class157.method2689((((Class474) (((Class478) this).aClass474_5651)).aClass317_5611), is[i_46_], 0);
							}
							if (null == class157) {
								Class528 class528_47_ = null;
								return class528_47_;
							}
							if (class157.anInt1986 < 13)
								class157.method2679(2);
							if (i_43_ > 1)
								((Class474) ((Class478) this).aClass474_5651).aClass157Array5616[i_46_] = class157;
						}
						if (i_43_ > 1)
							class157 = new Class157((((Class474) (((Class478) this).aClass474_5651)).aClass157Array5616), i_43_);
					}
					class528 = class505.method8451(class157, i_45_, 456299079 * (((Class474) (((Class478) this).aClass474_5651)).anInt5617), i_38_, i_39_);
					synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5614) {
						((Class474) ((Class478) this).aClass474_5651).aClass229_5614.method3856(class528, l);
					}
				}
			}
		}
		if (null == class528)
			return null;
		Class528 class528_48_ = class528.method11289((byte) 0, i, true);
		if (i_38_ != class528.c())
			class528_48_.p(i_38_);
		if (i_39_ != class528.Z())
			class528_48_.Q(i_39_);
		if (bool)
			class528_48_.wa();
		if (Class458.aClass458_5475.anInt5481 * 1109376893 == i_35_ && i_36_ > 3) {
			class528_48_.S(2048);
			class528_48_.ia(180, 0, -180);
		}
		i_36_ &= 0x3;
		if (i_36_ == 1)
			class528_48_.S(4096);
		else if (i_36_ == 2)
			class528_48_.S(8192);
		else if (i_36_ == 3)
			class528_48_.S(12288);
		if (null != ((Class478) this).aShortArray5645) {
			short[] is;
			if (class476 != null && ((Class476) class476).aShortArray5628 != null)
				is = ((Class476) class476).aShortArray5628;
			else
				is = aShortArray5640;
			for (int i_49_ = 0; i_49_ < ((Class478) this).aShortArray5645.length; i_49_++) {
				if (null != ((Class478) this).aByteArray5641 && i_49_ < ((Class478) this).aByteArray5641.length)
					class528_48_.X(((Class478) this).aShortArray5645[i_49_], (aShortArray5691[(((Class478) this).aByteArray5641[i_49_] & 0xff)]));
				else
					class528_48_.X(((Class478) this).aShortArray5645[i_49_], is[i_49_]);
			}
		}
		if (null != ((Class478) this).aShortArray5680) {
			short[] is;
			if (class476 != null && null != ((Class476) class476).aShortArray5625)
				is = ((Class476) class476).aShortArray5625;
			else
				is = aShortArray5643;
			for (int i_50_ = 0; i_50_ < ((Class478) this).aShortArray5680.length; i_50_++)
				class528_48_.W(((Class478) this).aShortArray5680[i_50_], is[i_50_]);
		}
		if (((Class478) this).aByte5634 != 0)
			class528_48_.PA(((Class478) this).aByte5644, ((Class478) this).aByte5642, ((Class478) this).aByte5646, ((Class478) this).aByte5634 & 0xff);
		if (-1341804323 * ((Class478) this).anInt5676 != 128 || 128 != -1356049837 * ((Class478) this).anInt5639 || 128 != -1815416605 * ((Class478) this).anInt5678)
			class528_48_.oa(-1341804323 * ((Class478) this).anInt5676, ((Class478) this).anInt5639 * -1356049837, ((Class478) this).anInt5678 * -1815416605);
		if (1949415389 * ((Class478) this).anInt5679 != 0 || ((Class478) this).anInt5635 * 520802609 != 0 || -1272530577 * ((Class478) this).anInt5681 != 0)
			class528_48_.ia(1949415389 * ((Class478) this).anInt5679, 520802609 * ((Class478) this).anInt5635, ((Class478) this).anInt5681 * -1272530577);
		class528_48_.KA(i_40_);
		return class528_48_;
	}

	Class478() {
		((Class478) this).aByte5634 = (byte) 0;
		anInt5648 = 63498699;
		anInt5649 = -390035927;
		anInt5677 = 2036958798;
		aBool5664 = true;
		anInt5652 = -133157829;
		((Class478) this).aByte5697 = (byte) 0;
		((Class478) this).anInt5654 = 1833231597;
		aBool5655 = false;
		anInt5656 = -1255728073;
		anInt5684 = -1686295872;
		anInt5658 = 0;
		((Class478) this).anIntArray5659 = null;
		((Class478) this).anIntArray5675 = null;
		anInt5661 = 765124544;
		((Class478) this).anInt5692 = 0;
		((Class478) this).anInt5663 = 0;
		anInt5665 = -855306295;
		anInt5666 = 1305998005;
		anInt5705 = 639946005;
		anInt5670 = -493578143;
		anInt5669 = -945855293;
		anInt5689 = 380570225;
		aBool5671 = false;
		anInt5672 = 0;
		aBool5673 = false;
		aBool5674 = false;
		aBool5657 = true;
		((Class478) this).anInt5676 = -548160896;
		((Class478) this).anInt5639 = 601943424;
		((Class478) this).anInt5678 = -555063936;
		((Class478) this).anInt5679 = 0;
		((Class478) this).anInt5635 = 0;
		((Class478) this).anInt5681 = 0;
		((Class478) this).anInt5682 = 0;
		((Class478) this).anInt5683 = 0;
		((Class478) this).anInt5710 = 0;
		aBool5685 = false;
		aBool5686 = false;
		anInt5687 = 1098527587;
		anInt5704 = 0;
		((Class478) this).anInt5690 = 1845719585;
		((Class478) this).anInt5662 = 1094307109;
		anInt5653 = -846534283;
		anInt5693 = 0;
		anInt5694 = 0;
		anInt5695 = -337145345;
		aBool5696 = false;
		anInt5667 = 0;
		anInt5698 = 0;
		aBool5700 = false;
		aBool5702 = true;
		aBool5701 = false;
		aBool5703 = true;
		aBool5660 = false;
		aBool5706 = false;
		anInt5708 = 2136794368;
		anInt5709 = 419405568;
		aBool5699 = false;
		aBool5711 = false;
	}

	public int method7972(int i, int i_51_) {
		if (((Class478) this).aClass465_5668 == null)
			return i_51_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((Class478) this).aClass465_5668.method7754((long) i));
		if (class282_sub38 == null)
			return i_51_;
		return class282_sub38.anInt8002 * -570797415;
	}

	public String method7973(int i, String string, byte i_52_) {
		if (((Class478) this).aClass465_5668 == null)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class478) this).aClass465_5668.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public boolean method7974(int i) {
		if (anIntArray5650 == null)
			return -1 != anInt5653 * 520233251 || anIntArray5688 != null;
		for (int i_53_ = 0; i_53_ < anIntArray5650.length; i_53_++) {
			if (anIntArray5650[i_53_] != -1) {
				Class478 class478_54_ = ((Class478) this).aClass474_5651.method7891(anIntArray5650[i_53_], 65280);
				if (520233251 * class478_54_.anInt5653 != -1 || null != class478_54_.anIntArray5688)
					return true;
			}
		}
		return false;
	}

	public int[] method7975() {
		return ((Class478) this).anIntArray5659;
	}

	public boolean method7976(short i) {
		return (null != ((Class478) this).anIntArray5659 && ((Class478) this).anIntArray5659.length > 1);
	}

	public int method7977(byte i) {
		if (((Class478) this).anIntArray5659 != null) {
			if (((Class478) this).anIntArray5659.length > 1) {
				int i_55_ = (int) (Math.random() * 65535.0);
				for (int i_56_ = 0; i_56_ < ((Class478) this).anIntArray5659.length; i_56_++) {
					if (i_55_ <= ((Class478) this).anIntArray5675[i_56_])
						return ((Class478) this).anIntArray5659[i_56_];
					i_55_ -= ((Class478) this).anIntArray5675[i_56_];
				}
			} else
				return ((Class478) this).anIntArray5659[0];
		}
		return -1;
	}

	Class528 method7978(Class505 class505, int i, int i_57_, int i_58_, Class476 class476) {
		int i_59_ = 64 + 1821243153 * ((Class478) this).anInt5692;
		int i_60_ = 850 + -1091753201 * ((Class478) this).anInt5663;
		int i_61_ = i;
		boolean bool = aBool5674 || i_57_ == (Class458.aClass458_5472.anInt5481 * 1109376893) && i_58_ > 3;
		if (bool)
			i |= 0x10;
		if (0 == i_58_) {
			if (128 != -1341804323 * ((Class478) this).anInt5676 || 0 != ((Class478) this).anInt5679 * 1949415389)
				i |= 0x1;
			if (128 != ((Class478) this).anInt5678 * -1815416605 || -1272530577 * ((Class478) this).anInt5681 != 0)
				i |= 0x4;
		} else
			i |= 0xd;
		if (((Class478) this).anInt5639 * -1356049837 != 128 || 520802609 * ((Class478) this).anInt5635 != 0)
			i |= 0x2;
		if (null != ((Class478) this).aShortArray5645)
			i |= 0x4000;
		if (((Class478) this).aShortArray5680 != null)
			i |= 0x8000;
		if (0 != ((Class478) this).aByte5634)
			i |= 0x80000;
		Class528 class528 = null;
		if (aByteArray5636 != null) {
			int i_62_ = -1;
			for (int i_63_ = 0; i_63_ < aByteArray5636.length; i_63_++) {
				if (i_57_ == aByteArray5636[i_63_]) {
					i_62_ = i_63_;
					break;
				}
			}
			if (-1 == i_62_)
				return null;
			int[] is = ((null != class476 && null != ((Class476) class476).anIntArray5626) ? ((Class476) class476).anIntArray5626 : anIntArrayArray5637[i_62_]);
			int i_64_ = is.length;
			if (i_64_ > 0) {
				long l = (long) (-413843045 * class505.anInt5840);
				for (int i_65_ = 0; i_65_ < i_64_; i_65_++)
					l = (long) is[i_65_] + 67783L * l;
				synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5614) {
					class528 = ((Class528) ((Class474) ((Class478) this).aClass474_5651).aClass229_5614.method3865(l));
				}
				if (null != class528) {
					if (i_59_ != class528.c())
						i |= 0x1000;
					if (i_60_ != class528.Z())
						i |= 0x2000;
				}
				if (class528 == null || class505.method8452(class528.m(), i) != 0) {
					int i_66_ = i | 0x1f01f;
					if (class528 != null)
						i_66_ = class505.method8546(i_66_, class528.m());
					Class157 class157 = null;
					synchronized (((Class474) ((Class478) this).aClass474_5651).aClass157Array5616) {
						for (int i_67_ = 0; i_67_ < i_64_; i_67_++) {
							synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
								class157 = Class157.method2689((((Class474) (((Class478) this).aClass474_5651)).aClass317_5611), is[i_67_], 0);
							}
							if (null == class157) {
								Class528 class528_68_ = null;
								return class528_68_;
							}
							if (class157.anInt1986 < 13)
								class157.method2679(2);
							if (i_64_ > 1)
								((Class474) ((Class478) this).aClass474_5651).aClass157Array5616[i_67_] = class157;
						}
						if (i_64_ > 1)
							class157 = new Class157((((Class474) (((Class478) this).aClass474_5651)).aClass157Array5616), i_64_);
					}
					class528 = class505.method8451(class157, i_66_, 456299079 * (((Class474) (((Class478) this).aClass474_5651)).anInt5617), i_59_, i_60_);
					synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5614) {
						((Class474) ((Class478) this).aClass474_5651).aClass229_5614.method3856(class528, l);
					}
				}
			}
		}
		if (null == class528)
			return null;
		Class528 class528_69_ = class528.method11289((byte) 0, i, true);
		if (i_59_ != class528.c())
			class528_69_.p(i_59_);
		if (i_60_ != class528.Z())
			class528_69_.Q(i_60_);
		if (bool)
			class528_69_.wa();
		if (Class458.aClass458_5475.anInt5481 * 1109376893 == i_57_ && i_58_ > 3) {
			class528_69_.S(2048);
			class528_69_.ia(180, 0, -180);
		}
		i_58_ &= 0x3;
		if (i_58_ == 1)
			class528_69_.S(4096);
		else if (i_58_ == 2)
			class528_69_.S(8192);
		else if (i_58_ == 3)
			class528_69_.S(12288);
		if (null != ((Class478) this).aShortArray5645) {
			short[] is;
			if (class476 != null && ((Class476) class476).aShortArray5628 != null)
				is = ((Class476) class476).aShortArray5628;
			else
				is = aShortArray5640;
			for (int i_70_ = 0; i_70_ < ((Class478) this).aShortArray5645.length; i_70_++) {
				if (null != ((Class478) this).aByteArray5641 && i_70_ < ((Class478) this).aByteArray5641.length)
					class528_69_.X(((Class478) this).aShortArray5645[i_70_], (aShortArray5691[(((Class478) this).aByteArray5641[i_70_] & 0xff)]));
				else
					class528_69_.X(((Class478) this).aShortArray5645[i_70_], is[i_70_]);
			}
		}
		if (null != ((Class478) this).aShortArray5680) {
			short[] is;
			if (class476 != null && null != ((Class476) class476).aShortArray5625)
				is = ((Class476) class476).aShortArray5625;
			else
				is = aShortArray5643;
			for (int i_71_ = 0; i_71_ < ((Class478) this).aShortArray5680.length; i_71_++)
				class528_69_.W(((Class478) this).aShortArray5680[i_71_], is[i_71_]);
		}
		if (((Class478) this).aByte5634 != 0)
			class528_69_.PA(((Class478) this).aByte5644, ((Class478) this).aByte5642, ((Class478) this).aByte5646, ((Class478) this).aByte5634 & 0xff);
		if (-1341804323 * ((Class478) this).anInt5676 != 128 || 128 != -1356049837 * ((Class478) this).anInt5639 || 128 != -1815416605 * ((Class478) this).anInt5678)
			class528_69_.oa(-1341804323 * ((Class478) this).anInt5676, ((Class478) this).anInt5639 * -1356049837, ((Class478) this).anInt5678 * -1815416605);
		if (1949415389 * ((Class478) this).anInt5679 != 0 || ((Class478) this).anInt5635 * 520802609 != 0 || -1272530577 * ((Class478) this).anInt5681 != 0)
			class528_69_.ia(1949415389 * ((Class478) this).anInt5679, 520802609 * ((Class478) this).anInt5635, ((Class478) this).anInt5681 * -1272530577);
		class528_69_.KA(i_61_);
		return class528_69_;
	}

	public boolean method7979(int i, int i_72_) {
		if (null != ((Class478) this).anIntArray5659 && i != -1) {
			for (int i_73_ = 0; i_73_ < ((Class478) this).anIntArray5659.length; i_73_++) {
				if (((Class478) this).anIntArray5659[i_73_] == i)
					return true;
			}
		}
		return false;
	}

	void method7980(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7965(class282_sub35, i, -421182854);
		}
	}

	void method7981(RsByteBuffer class282_sub35, int i) {
		if (i == 1) {
			int i_74_ = class282_sub35.readUnsignedByte();
			aByteArray5636 = new byte[i_74_];
			anIntArrayArray5637 = new int[i_74_][];
			for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
				aByteArray5636[i_75_] = class282_sub35.readByte((short) -9146);
				int i_76_ = class282_sub35.readUnsignedByte();
				anIntArrayArray5637[i_75_] = new int[i_76_];
				for (int i_77_ = 0; i_77_ < i_76_; i_77_++)
					anIntArrayArray5637[i_75_][i_77_] = class282_sub35.readBigSmart(2063656629);
			}
		} else if (i == 2)
			aString5638 = class282_sub35.readString(420363973);
		else if (i == 14)
			anInt5648 = class282_sub35.readUnsignedByte() * 63498699;
		else if (15 == i)
			anInt5649 = class282_sub35.readUnsignedByte() * -390035927;
		else if (17 == i) {
			anInt5677 = 0;
			aBool5664 = false;
		} else if (18 == i)
			aBool5664 = false;
		else if (i == 19)
			anInt5652 = class282_sub35.readUnsignedByte() * 133157829;
		else if (21 == i)
			((Class478) this).aByte5697 = (byte) 1;
		else if (22 == i)
			aBool5655 = true;
		else if (i == 23)
			anInt5656 = 1255728073;
		else if (i == 24) {
			int i_78_ = class282_sub35.readBigSmart(2078352702);
			if (i_78_ != -1)
				((Class478) this).anIntArray5659 = new int[] { i_78_ };
		} else if (i == 27)
			anInt5677 = -1129004249;
		else if (i == 28)
			anInt5661 = (class282_sub35.readUnsignedByte() << 2) * -256480385;
		else if (i == 29)
			((Class478) this).anInt5692 = class282_sub35.readByte((short) -29470) * -887236111;
		else if (39 == i)
			((Class478) this).anInt5663 = class282_sub35.readByte((short) -14481) * -520358997;
		else if (i >= 30 && i < 35)
			aStringArray5647[i - 30] = class282_sub35.readString(1560192253);
		else if (40 == i) {
			int i_79_ = class282_sub35.readUnsignedByte();
			((Class478) this).aShortArray5645 = new short[i_79_];
			aShortArray5640 = new short[i_79_];
			for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
				((Class478) this).aShortArray5645[i_80_] = (short) class282_sub35.readUnsignedShort();
				aShortArray5640[i_80_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 41) {
			int i_81_ = class282_sub35.readUnsignedByte();
			((Class478) this).aShortArray5680 = new short[i_81_];
			aShortArray5643 = new short[i_81_];
			for (int i_82_ = 0; i_82_ < i_81_; i_82_++) {
				((Class478) this).aShortArray5680[i_82_] = (short) class282_sub35.readUnsignedShort();
				aShortArray5643[i_82_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_83_ = class282_sub35.readUnsignedByte();
			((Class478) this).aByteArray5641 = new byte[i_83_];
			for (int i_84_ = 0; i_84_ < i_83_; i_84_++)
				((Class478) this).aByteArray5641[i_84_] = class282_sub35.readByte((short) -11356);
		} else if (i == 62)
			aBool5674 = true;
		else if (i == 64)
			aBool5657 = false;
		else if (65 == i)
			((Class478) this).anInt5676 = class282_sub35.readUnsignedShort() * 801023861;
		else if (i == 66)
			((Class478) this).anInt5639 = class282_sub35.readUnsignedShort() * -1035484709;
		else if (67 == i)
			((Class478) this).anInt5678 = class282_sub35.readUnsignedShort() * 767415499;
		else if (i == 69)
			class282_sub35.readUnsignedByte();
		else if (70 == i)
			((Class478) this).anInt5679 = (class282_sub35.readShort(1930684304) << 2) * -1230022539;
		else if (i == 71)
			((Class478) this).anInt5635 = (class282_sub35.readShort(1939649421) << 2) * 568911825;
		else if (i == 72)
			((Class478) this).anInt5681 = (class282_sub35.readShort(2028912829) << 2) * -1156266609;
		else if (73 == i)
			aBool5685 = true;
		else if (i == 74)
			aBool5686 = true;
		else if (i == 75)
			anInt5687 = class282_sub35.readUnsignedByte() * -1098527587;
		else if (77 == i || 92 == i) {
			((Class478) this).anInt5690 = class282_sub35.readUnsignedShort() * -1845719585;
			if (65535 == ((Class478) this).anInt5690 * 657157663)
				((Class478) this).anInt5690 = 1845719585;
			((Class478) this).anInt5662 = class282_sub35.readUnsignedShort() * -1094307109;
			if (((Class478) this).anInt5662 * -480478893 == 65535)
				((Class478) this).anInt5662 = 1094307109;
			int i_85_ = -1;
			if (i == 92)
				i_85_ = class282_sub35.readBigSmart(2100427725);
			int i_86_ = class282_sub35.readUnsignedByte();
			anIntArray5650 = new int[i_86_ + 2];
			for (int i_87_ = 0; i_87_ <= i_86_; i_87_++)
				anIntArray5650[i_87_] = class282_sub35.readBigSmart(1992478358);
			anIntArray5650[1 + i_86_] = i_85_;
		} else if (78 == i) {
			anInt5653 = class282_sub35.readUnsignedShort() * 846534283;
			anInt5693 = class282_sub35.readUnsignedByte() * 36323001;
		} else if (79 == i) {
			anInt5667 = class282_sub35.readUnsignedShort() * -522100571;
			anInt5698 = class282_sub35.readUnsignedShort() * -291570643;
			anInt5693 = class282_sub35.readUnsignedByte() * 36323001;
			int i_88_ = class282_sub35.readUnsignedByte();
			anIntArray5688 = new int[i_88_];
			for (int i_89_ = 0; i_89_ < i_88_; i_89_++)
				anIntArray5688[i_89_] = class282_sub35.readUnsignedShort();
		} else if (81 == i) {
			((Class478) this).aByte5697 = (byte) 2;
			((Class478) this).anInt5654 = class282_sub35.readUnsignedByte() * -1155853568;
		} else if (i == 82)
			aBool5701 = true;
		else if (88 == i)
			aBool5703 = false;
		else if (i == 89)
			aBool5702 = false;
		else if (91 == i)
			aBool5660 = true;
		else if (93 == i) {
			((Class478) this).aByte5697 = (byte) 3;
			((Class478) this).anInt5654 = class282_sub35.readUnsignedShort() * -1833231597;
		} else if (i == 94)
			((Class478) this).aByte5697 = (byte) 4;
		else if (95 == i) {
			((Class478) this).aByte5697 = (byte) 5;
			((Class478) this).anInt5654 = class282_sub35.readShort(2063592252) * -1833231597;
		} else if (97 == i)
			aBool5671 = true;
		else if (98 == i)
			aBool5706 = true;
		else if (99 == i) {
			anInt5705 = class282_sub35.readUnsignedByte() * -639946005;
			anInt5665 = class282_sub35.readUnsignedShort() * 855306295;
		} else if (i == 100) {
			anInt5670 = class282_sub35.readUnsignedByte() * 493578143;
			anInt5666 = class282_sub35.readUnsignedShort() * -1305998005;
		} else if (101 == i)
			anInt5672 = class282_sub35.readUnsignedByte() * 777293949;
		else if (i == 102)
			anInt5689 = class282_sub35.readUnsignedShort() * -380570225;
		else if (i == 103)
			anInt5656 = 0;
		else if (104 == i)
			anInt5695 = class282_sub35.readUnsignedByte() * -1685623039;
		else if (i == 105)
			aBool5673 = true;
		else if (106 == i) {
			int i_90_ = class282_sub35.readUnsignedByte();
			int i_91_ = 0;
			((Class478) this).anIntArray5659 = new int[i_90_];
			((Class478) this).anIntArray5675 = new int[i_90_];
			for (int i_92_ = 0; i_92_ < i_90_; i_92_++) {
				((Class478) this).anIntArray5659[i_92_] = class282_sub35.readBigSmart(1954737901);
				i_91_ += ((Class478) this).anIntArray5675[i_92_] = class282_sub35.readUnsignedByte();
			}
			for (int i_93_ = 0; i_93_ < i_90_; i_93_++)
				((Class478) this).anIntArray5675[i_93_] = ((Class478) this).anIntArray5675[i_93_] * 65535 / i_91_;
		} else if (i == 107)
			anInt5669 = class282_sub35.readUnsignedShort() * 945855293;
		else if (i >= 150 && i < 155) {
			aStringArray5647[i - 150] = class282_sub35.readString(603165079);
			if (!((Class474) ((Class478) this).aClass474_5651).aBool5609)
				aStringArray5647[i - 150] = null;
		} else if (160 == i) {
			int i_94_ = class282_sub35.readUnsignedByte();
			anIntArray5707 = new int[i_94_];
			for (int i_95_ = 0; i_95_ < i_94_; i_95_++)
				anIntArray5707[i_95_] = class282_sub35.readUnsignedShort();
		} else if (162 == i) {
			((Class478) this).aByte5697 = (byte) 3;
			((Class478) this).anInt5654 = class282_sub35.readInt() * -1833231597;
		} else if (163 == i) {
			((Class478) this).aByte5644 = class282_sub35.readByte((short) -8409);
			((Class478) this).aByte5642 = class282_sub35.readByte((short) -3960);
			((Class478) this).aByte5646 = class282_sub35.readByte((short) -14692);
			((Class478) this).aByte5634 = class282_sub35.readByte((short) -5862);
		} else if (164 == i)
			((Class478) this).anInt5682 = class282_sub35.readShort(1856849973) * -2137677977;
		else if (165 == i)
			((Class478) this).anInt5683 = class282_sub35.readShort(1687170123) * 2105389349;
		else if (166 == i)
			((Class478) this).anInt5710 = class282_sub35.readShort(2012080441) * 1749486395;
		else if (167 == i)
			anInt5704 = class282_sub35.readUnsignedShort() * -1140808153;
		else if (168 == i)
			aBool5696 = true;
		else if (169 == i)
			aBool5700 = true;
		else if (i == 170)
			anInt5684 = class282_sub35.readUnsignedSmart(1637527677) * 320365989;
		else if (i == 171)
			anInt5658 = class282_sub35.readUnsignedSmart(1734915130) * -1055006837;
		else if (i == 173) {
			anInt5708 = class282_sub35.readUnsignedShort() * -8430363;
			anInt5709 = class282_sub35.readUnsignedShort() * -1558642785;
		} else if (177 == i)
			aBool5699 = true;
		else if (178 == i)
			anInt5694 = class282_sub35.readUnsignedByte() * -799618175;
		else if (189 == i)
			aBool5711 = true;
		else if (249 == i) {
			int i_96_ = class282_sub35.readUnsignedByte();
			if (((Class478) this).aClass465_5668 == null) {
				int i_97_ = Class323.nextPowerOfTwo(i_96_, 104760474);
				((Class478) this).aClass465_5668 = new SwitchMap(i_97_);
			}
			for (int i_98_ = 0; i_98_ < i_96_; i_98_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_99_ = class282_sub35.read24BitUnsignedInteger((short) 4553);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(1394702078));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class478) this).aClass465_5668.method7765(class282, (long) i_99_);
			}
		}
	}

	void method7982() {
		if (anInt5652 * -348507379 == -1) {
			anInt5652 = 0;
			if (null != aByteArray5636 && aByteArray5636.length == 1 && (aByteArray5636[0] == 1109376893 * Class458.aClass458_5490.anInt5481))
				anInt5652 = 133157829;
			for (int i = 0; i < 5; i++) {
				if (aStringArray5647[i] != null) {
					anInt5652 = 133157829;
					break;
				}
			}
		}
		if (anInt5687 * -1062790731 == -1)
			anInt5687 = -1098527587 * (0 != 647396503 * anInt5677 ? 1 : 0);
		if (method7967((byte) 56) || aBool5706 || anIntArray5650 != null)
			aBool5699 = true;
	}

	void method7983() {
		if (anInt5652 * -348507379 == -1) {
			anInt5652 = 0;
			if (null != aByteArray5636 && aByteArray5636.length == 1 && (aByteArray5636[0] == 1109376893 * Class458.aClass458_5490.anInt5481))
				anInt5652 = 133157829;
			for (int i = 0; i < 5; i++) {
				if (aStringArray5647[i] != null) {
					anInt5652 = 133157829;
					break;
				}
			}
		}
		if (anInt5687 * -1062790731 == -1)
			anInt5687 = -1098527587 * (0 != 647396503 * anInt5677 ? 1 : 0);
		if (method7967((byte) 118) || aBool5706 || anIntArray5650 != null)
			aBool5699 = true;
	}

	public final synchronized Class452 method7984(Class505 class505, int i, int i_100_, int i_101_, Class390 class390, Class390 class390_102_, int i_103_, int i_104_, int i_105_, boolean bool, Class476 class476) {
		if (Class485.method8201(i_100_, -159499065))
			i_100_ = 1109376893 * Class458.aClass458_5475.anInt5481;
		long l = (long) ((i_100_ << 3) + (anInt5633 * -2132690865 << 10) + i_101_);
		l |= (long) (class505.anInt5840 * -413843045 << 29);
		if (class476 != null)
			l |= 8163495958999789513L * ((Class476) class476).aLong5627 << 32;
		int i_106_ = i;
		if (((Class478) this).aByte5697 == 3)
			i_106_ |= 0x7;
		else {
			if (0 != ((Class478) this).aByte5697 || 0 != 1290338989 * ((Class478) this).anInt5683)
				i_106_ |= 0x2;
			if (841092183 * ((Class478) this).anInt5682 != 0)
				i_106_ |= 0x1;
			if (1789236723 * ((Class478) this).anInt5710 != 0)
				i_106_ |= 0x4;
		}
		if (bool)
			i_106_ |= 0x40000;
		Class452 class452;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5615) {
			class452 = (Class452) ((Class474) ((Class478) this).aClass474_5651).aClass229_5615.method3865(l);
		}
		Class528 class528 = (Class528) (null != class452 ? class452.anObject5443 : null);
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		if (class528 == null || class505.method8452(class528.m(), i_106_) != 0) {
			if (class528 != null)
				i_106_ = class505.method8546(i_106_, class528.m());
			int i_107_ = i_106_;
			if (i_100_ == 1109376893 * Class458.aClass458_5490.anInt5481 && i_101_ > 3)
				i_107_ |= 0x5;
			class528 = method7971(class505, i_107_, i_100_, i_101_, class476, 1336649552);
			if (null == class528)
				return null;
			if (i_100_ == Class458.aClass458_5490.anInt5481 * 1109376893 && i_101_ > 3)
				class528.f(2048);
			if (bool)
				class282_sub50_sub17 = class528.ga(null);
			class528.KA(i_106_);
			class452 = new Class452(class528, class282_sub50_sub17);
			synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5615) {
				((Class474) ((Class478) this).aClass474_5651).aClass229_5615.method3856(class452, l);
			}
		} else {
			class282_sub50_sub17 = (Class282_Sub50_Sub17) class452.anObject5444;
			if (bool && class282_sub50_sub17 == null)
				class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452.anObject5444 = class528.ga(null));
		}
		boolean bool_108_ = (((Class478) this).aByte5697 != 0 && (class390 != null || class390_102_ != null));
		boolean bool_109_ = (841092183 * ((Class478) this).anInt5682 != 0 || 0 != 1290338989 * ((Class478) this).anInt5683 || 0 != 1789236723 * ((Class478) this).anInt5710);
		if (bool_108_ || bool_109_) {
			class528 = class528.method11289((byte) 0, i_106_, true);
			if (bool_108_)
				class528.pa(((Class478) this).aByte5697, ((Class478) this).anInt5654 * -1064114405, class390, class390_102_, i_103_, i_104_, i_105_);
			if (bool_109_)
				class528.ia(841092183 * ((Class478) this).anInt5682, 1290338989 * ((Class478) this).anInt5683, ((Class478) this).anInt5710 * 1789236723);
			class528.KA(i);
		} else
			class528 = class528.method11289((byte) 0, i, true);
		((Class474) ((Class478) this).aClass474_5651).aClass452_5620.anObject5443 = class528;
		((Class474) ((Class478) this).aClass474_5651).aClass452_5620.anObject5444 = class282_sub50_sub17;
		return ((Class474) ((Class478) this).aClass474_5651).aClass452_5620;
	}

	public final boolean method7985(int i) {
		if (null == anIntArrayArray5637)
			return true;
		boolean bool = true;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
			for (int i_110_ = 0; i_110_ < aByteArray5636.length; i_110_++) {
				if (i == aByteArray5636[i_110_]) {
					for (int i_111_ = 0; i_111_ < anIntArrayArray5637[i_110_].length; i_111_++) {
						if (!((Class474) ((Class478) this).aClass474_5651).aClass317_5611.method5688(anIntArrayArray5637[i_110_][i_111_], 0, 16711935))
							bool = false;
					}
				}
			}
		}
		return bool;
	}

	void method7986() {
		if (anInt5652 * -348507379 == -1) {
			anInt5652 = 0;
			if (null != aByteArray5636 && aByteArray5636.length == 1 && (aByteArray5636[0] == 1109376893 * Class458.aClass458_5490.anInt5481))
				anInt5652 = 133157829;
			for (int i = 0; i < 5; i++) {
				if (aStringArray5647[i] != null) {
					anInt5652 = 133157829;
					break;
				}
			}
		}
		if (anInt5687 * -1062790731 == -1)
			anInt5687 = -1098527587 * (0 != 647396503 * anInt5677 ? 1 : 0);
		if (method7967((byte) 51) || aBool5706 || anIntArray5650 != null)
			aBool5699 = true;
	}

	public final boolean method7987(int i, int i_112_) {
		if (null == anIntArrayArray5637)
			return true;
		boolean bool = true;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
			for (int i_113_ = 0; i_113_ < aByteArray5636.length; i_113_++) {
				if (i == aByteArray5636[i_113_]) {
					for (int i_114_ = 0; i_114_ < anIntArrayArray5637[i_113_].length; i_114_++) {
						if (!((Class474) ((Class478) this).aClass474_5651).aClass317_5611.method5688(anIntArrayArray5637[i_113_][i_114_], 0, 16711935))
							bool = false;
					}
				}
			}
		}
		return bool;
	}

	public final boolean method7988() {
		if (null == anIntArrayArray5637)
			return true;
		boolean bool = true;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
			for (int i = 0; i < anIntArrayArray5637.length; i++) {
				for (int i_115_ = 0; i_115_ < anIntArrayArray5637[i].length; i_115_++)
					bool &= (((Class474) ((Class478) this).aClass474_5651).aClass317_5611.method5688(anIntArrayArray5637[i][i_115_], 0, 16711935));
			}
		}
		return bool;
	}

	public boolean method7989() {
		return null != ((Class478) this).anIntArray5659;
	}

	public final synchronized Class528 method7990(Class505 class505, int i, int i_116_, int i_117_, Class390 class390, Class390 class390_118_, int i_119_, int i_120_, int i_121_, Class456 class456, Class476 class476) {
		if (Class485.method8201(i_116_, -159499065))
			i_116_ = Class458.aClass458_5475.anInt5481 * 1109376893;
		long l = (long) (i_117_ + ((anInt5633 * -2132690865 << 10) + (i_116_ << 3)));
		int i_122_ = i;
		l |= (long) (-413843045 * class505.anInt5840 << 29);
		if (null != class476)
			l |= ((Class476) class476).aLong5627 * 8163495958999789513L << 32;
		if (class456 != null)
			i |= class456.method7640(-1218152426);
		if (((Class478) this).aByte5697 == 3)
			i |= 0x7;
		else {
			if (0 != ((Class478) this).aByte5697 || 0 != 1290338989 * ((Class478) this).anInt5683)
				i |= 0x2;
			if (((Class478) this).anInt5682 * 841092183 != 0)
				i |= 0x1;
			if (0 != ((Class478) this).anInt5710 * 1789236723)
				i |= 0x4;
		}
		if (i_116_ == 1109376893 * Class458.aClass458_5490.anInt5481 && i_117_ > 3)
			i |= 0x5;
		Class528 class528;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5619) {
			class528 = (Class528) ((Class474) ((Class478) this).aClass474_5651).aClass229_5619.method3865(l);
		}
		if (class528 == null || class505.method8452(class528.m(), i) != 0) {
			if (null != class528)
				i = class505.method8546(i, class528.m());
			class528 = method7971(class505, i, i_116_, i_117_, class476, 1028588599);
			if (class528 == null)
				return null;
			synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5619) {
				((Class474) ((Class478) this).aClass474_5651).aClass229_5619.method3856(class528, l);
			}
		}
		boolean bool = false;
		if (null != class456) {
			class528 = class528.method11289((byte) 1, i, true);
			bool = true;
			class456.method7577(class528, i_117_ & 0x3, 16711935);
		}
		if (i_116_ == Class458.aClass458_5490.anInt5481 * 1109376893 && i_117_ > 3) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.f(2048);
		}
		if (0 != ((Class478) this).aByte5697) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.pa(((Class478) this).aByte5697, -1064114405 * ((Class478) this).anInt5654, class390, class390_118_, i_119_, i_120_, i_121_);
		}
		if (841092183 * ((Class478) this).anInt5682 != 0 || 0 != 1290338989 * ((Class478) this).anInt5683 || ((Class478) this).anInt5710 * 1789236723 != 0) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.ia(841092183 * ((Class478) this).anInt5682, ((Class478) this).anInt5683 * 1290338989, 1789236723 * ((Class478) this).anInt5710);
		}
		if (bool)
			class528.KA(i_122_);
		return class528;
	}

	public boolean method7991() {
		return (null != ((Class478) this).anIntArray5659 && ((Class478) this).anIntArray5659.length > 1);
	}

	public final synchronized Class528 method7992(Class505 class505, int i, int i_123_, int i_124_, Class390 class390, Class390 class390_125_, int i_126_, int i_127_, int i_128_, Class456 class456, Class476 class476) {
		if (Class485.method8201(i_123_, -159499065))
			i_123_ = Class458.aClass458_5475.anInt5481 * 1109376893;
		long l = (long) (i_124_ + ((anInt5633 * -2132690865 << 10) + (i_123_ << 3)));
		int i_129_ = i;
		l |= (long) (-413843045 * class505.anInt5840 << 29);
		if (null != class476)
			l |= ((Class476) class476).aLong5627 * 8163495958999789513L << 32;
		if (class456 != null)
			i |= class456.method7640(-1640277476);
		if (((Class478) this).aByte5697 == 3)
			i |= 0x7;
		else {
			if (0 != ((Class478) this).aByte5697 || 0 != 1290338989 * ((Class478) this).anInt5683)
				i |= 0x2;
			if (((Class478) this).anInt5682 * 841092183 != 0)
				i |= 0x1;
			if (0 != ((Class478) this).anInt5710 * 1789236723)
				i |= 0x4;
		}
		if (i_123_ == 1109376893 * Class458.aClass458_5490.anInt5481 && i_124_ > 3)
			i |= 0x5;
		Class528 class528;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5619) {
			class528 = (Class528) ((Class474) ((Class478) this).aClass474_5651).aClass229_5619.method3865(l);
		}
		if (class528 == null || class505.method8452(class528.m(), i) != 0) {
			if (null != class528)
				i = class505.method8546(i, class528.m());
			class528 = method7971(class505, i, i_123_, i_124_, class476, 441620808);
			if (class528 == null)
				return null;
			synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5619) {
				((Class474) ((Class478) this).aClass474_5651).aClass229_5619.method3856(class528, l);
			}
		}
		boolean bool = false;
		if (null != class456) {
			class528 = class528.method11289((byte) 1, i, true);
			bool = true;
			class456.method7577(class528, i_124_ & 0x3, 16711935);
		}
		if (i_123_ == Class458.aClass458_5490.anInt5481 * 1109376893 && i_124_ > 3) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.f(2048);
		}
		if (0 != ((Class478) this).aByte5697) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.pa(((Class478) this).aByte5697, -1064114405 * ((Class478) this).anInt5654, class390, class390_125_, i_126_, i_127_, i_128_);
		}
		if (841092183 * ((Class478) this).anInt5682 != 0 || 0 != 1290338989 * ((Class478) this).anInt5683 || ((Class478) this).anInt5710 * 1789236723 != 0) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.ia(841092183 * ((Class478) this).anInt5682, ((Class478) this).anInt5683 * 1290338989, 1789236723 * ((Class478) this).anInt5710);
		}
		if (bool)
			class528.KA(i_129_);
		return class528;
	}

	Class528 method7993(Class505 class505, int i, int i_130_, int i_131_, Class476 class476) {
		int i_132_ = 64 + 1821243153 * ((Class478) this).anInt5692;
		int i_133_ = 850 + -1091753201 * ((Class478) this).anInt5663;
		int i_134_ = i;
		boolean bool = (aBool5674 || (i_130_ == Class458.aClass458_5472.anInt5481 * 1109376893 && i_131_ > 3));
		if (bool)
			i |= 0x10;
		if (0 == i_131_) {
			if (128 != -1341804323 * ((Class478) this).anInt5676 || 0 != ((Class478) this).anInt5679 * 1949415389)
				i |= 0x1;
			if (128 != ((Class478) this).anInt5678 * -1815416605 || -1272530577 * ((Class478) this).anInt5681 != 0)
				i |= 0x4;
		} else
			i |= 0xd;
		if (((Class478) this).anInt5639 * -1356049837 != 128 || 520802609 * ((Class478) this).anInt5635 != 0)
			i |= 0x2;
		if (null != ((Class478) this).aShortArray5645)
			i |= 0x4000;
		if (((Class478) this).aShortArray5680 != null)
			i |= 0x8000;
		if (0 != ((Class478) this).aByte5634)
			i |= 0x80000;
		Class528 class528 = null;
		if (aByteArray5636 != null) {
			int i_135_ = -1;
			for (int i_136_ = 0; i_136_ < aByteArray5636.length; i_136_++) {
				if (i_130_ == aByteArray5636[i_136_]) {
					i_135_ = i_136_;
					break;
				}
			}
			if (-1 == i_135_)
				return null;
			int[] is = ((null != class476 && null != ((Class476) class476).anIntArray5626) ? ((Class476) class476).anIntArray5626 : anIntArrayArray5637[i_135_]);
			int i_137_ = is.length;
			if (i_137_ > 0) {
				long l = (long) (-413843045 * class505.anInt5840);
				for (int i_138_ = 0; i_138_ < i_137_; i_138_++)
					l = (long) is[i_138_] + 67783L * l;
				synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5614) {
					class528 = ((Class528) ((Class474) ((Class478) this).aClass474_5651).aClass229_5614.method3865(l));
				}
				if (null != class528) {
					if (i_132_ != class528.c())
						i |= 0x1000;
					if (i_133_ != class528.Z())
						i |= 0x2000;
				}
				if (class528 == null || class505.method8452(class528.m(), i) != 0) {
					int i_139_ = i | 0x1f01f;
					if (class528 != null)
						i_139_ = class505.method8546(i_139_, class528.m());
					Class157 class157 = null;
					synchronized (((Class474) ((Class478) this).aClass474_5651).aClass157Array5616) {
						for (int i_140_ = 0; i_140_ < i_137_; i_140_++) {
							synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
								class157 = Class157.method2689((((Class474) (((Class478) this).aClass474_5651)).aClass317_5611), is[i_140_], 0);
							}
							if (null == class157) {
								Class528 class528_141_ = null;
								return class528_141_;
							}
							if (class157.anInt1986 < 13)
								class157.method2679(2);
							if (i_137_ > 1)
								((Class474) ((Class478) this).aClass474_5651).aClass157Array5616[i_140_] = class157;
						}
						if (i_137_ > 1)
							class157 = new Class157((((Class474) (((Class478) this).aClass474_5651)).aClass157Array5616), i_137_);
					}
					class528 = class505.method8451(class157, i_139_, 456299079 * (((Class474) (((Class478) this).aClass474_5651)).anInt5617), i_132_, i_133_);
					synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5614) {
						((Class474) ((Class478) this).aClass474_5651).aClass229_5614.method3856(class528, l);
					}
				}
			}
		}
		if (null == class528)
			return null;
		Class528 class528_142_ = class528.method11289((byte) 0, i, true);
		if (i_132_ != class528.c())
			class528_142_.p(i_132_);
		if (i_133_ != class528.Z())
			class528_142_.Q(i_133_);
		if (bool)
			class528_142_.wa();
		if (Class458.aClass458_5475.anInt5481 * 1109376893 == i_130_ && i_131_ > 3) {
			class528_142_.S(2048);
			class528_142_.ia(180, 0, -180);
		}
		i_131_ &= 0x3;
		if (i_131_ == 1)
			class528_142_.S(4096);
		else if (i_131_ == 2)
			class528_142_.S(8192);
		else if (i_131_ == 3)
			class528_142_.S(12288);
		if (null != ((Class478) this).aShortArray5645) {
			short[] is;
			if (class476 != null && ((Class476) class476).aShortArray5628 != null)
				is = ((Class476) class476).aShortArray5628;
			else
				is = aShortArray5640;
			for (int i_143_ = 0; i_143_ < ((Class478) this).aShortArray5645.length; i_143_++) {
				if (null != ((Class478) this).aByteArray5641 && i_143_ < ((Class478) this).aByteArray5641.length)
					class528_142_.X(((Class478) this).aShortArray5645[i_143_], (aShortArray5691[(((Class478) this).aByteArray5641[i_143_] & 0xff)]));
				else
					class528_142_.X(((Class478) this).aShortArray5645[i_143_], is[i_143_]);
			}
		}
		if (null != ((Class478) this).aShortArray5680) {
			short[] is;
			if (class476 != null && null != ((Class476) class476).aShortArray5625)
				is = ((Class476) class476).aShortArray5625;
			else
				is = aShortArray5643;
			for (int i_144_ = 0; i_144_ < ((Class478) this).aShortArray5680.length; i_144_++)
				class528_142_.W(((Class478) this).aShortArray5680[i_144_], is[i_144_]);
		}
		if (((Class478) this).aByte5634 != 0)
			class528_142_.PA(((Class478) this).aByte5644, ((Class478) this).aByte5642, ((Class478) this).aByte5646, ((Class478) this).aByte5634 & 0xff);
		if (-1341804323 * ((Class478) this).anInt5676 != 128 || 128 != -1356049837 * ((Class478) this).anInt5639 || 128 != -1815416605 * ((Class478) this).anInt5678)
			class528_142_.oa(-1341804323 * ((Class478) this).anInt5676, ((Class478) this).anInt5639 * -1356049837, ((Class478) this).anInt5678 * -1815416605);
		if (1949415389 * ((Class478) this).anInt5679 != 0 || ((Class478) this).anInt5635 * 520802609 != 0 || -1272530577 * ((Class478) this).anInt5681 != 0)
			class528_142_.ia(1949415389 * ((Class478) this).anInt5679, 520802609 * ((Class478) this).anInt5635, ((Class478) this).anInt5681 * -1272530577);
		class528_142_.KA(i_134_);
		return class528_142_;
	}

	public final synchronized Class528 method7994(Class505 class505, int i, int i_145_, int i_146_, Class390 class390, Class390 class390_147_, int i_148_, int i_149_, int i_150_, Class456 class456, Class476 class476) {
		if (Class485.method8201(i_145_, -159499065))
			i_145_ = Class458.aClass458_5475.anInt5481 * 1109376893;
		long l = (long) (i_146_ + ((anInt5633 * -2132690865 << 10) + (i_145_ << 3)));
		int i_151_ = i;
		l |= (long) (-413843045 * class505.anInt5840 << 29);
		if (null != class476)
			l |= ((Class476) class476).aLong5627 * 8163495958999789513L << 32;
		if (class456 != null)
			i |= class456.method7640(-1281795260);
		if (((Class478) this).aByte5697 == 3)
			i |= 0x7;
		else {
			if (0 != ((Class478) this).aByte5697 || 0 != 1290338989 * ((Class478) this).anInt5683)
				i |= 0x2;
			if (((Class478) this).anInt5682 * 841092183 != 0)
				i |= 0x1;
			if (0 != ((Class478) this).anInt5710 * 1789236723)
				i |= 0x4;
		}
		if (i_145_ == 1109376893 * Class458.aClass458_5490.anInt5481 && i_146_ > 3)
			i |= 0x5;
		Class528 class528;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5619) {
			class528 = (Class528) ((Class474) ((Class478) this).aClass474_5651).aClass229_5619.method3865(l);
		}
		if (class528 == null || class505.method8452(class528.m(), i) != 0) {
			if (null != class528)
				i = class505.method8546(i, class528.m());
			class528 = method7971(class505, i, i_145_, i_146_, class476, 835420766);
			if (class528 == null)
				return null;
			synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5619) {
				((Class474) ((Class478) this).aClass474_5651).aClass229_5619.method3856(class528, l);
			}
		}
		boolean bool = false;
		if (null != class456) {
			class528 = class528.method11289((byte) 1, i, true);
			bool = true;
			class456.method7577(class528, i_146_ & 0x3, 16711935);
		}
		if (i_145_ == Class458.aClass458_5490.anInt5481 * 1109376893 && i_146_ > 3) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.f(2048);
		}
		if (0 != ((Class478) this).aByte5697) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.pa(((Class478) this).aByte5697, -1064114405 * ((Class478) this).anInt5654, class390, class390_147_, i_148_, i_149_, i_150_);
		}
		if (841092183 * ((Class478) this).anInt5682 != 0 || 0 != 1290338989 * ((Class478) this).anInt5683 || ((Class478) this).anInt5710 * 1789236723 != 0) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.ia(841092183 * ((Class478) this).anInt5682, ((Class478) this).anInt5683 * 1290338989, 1789236723 * ((Class478) this).anInt5710);
		}
		if (bool)
			class528.KA(i_151_);
		return class528;
	}

	public int[] method7995() {
		return ((Class478) this).anIntArray5659;
	}

	public final Class478 method7996(Interface42 interface42) {
		int i = -1;
		if (-1 != 657157663 * ((Class478) this).anInt5690)
			i = interface42.method241(((Class478) this).anInt5690 * 657157663, -2105112559);
		else if (-480478893 * ((Class478) this).anInt5662 != -1)
			i = interface42.method240(((Class478) this).anInt5662 * -480478893, 1105386690);
		if (i < 0 || i >= anIntArray5650.length - 1 || -1 == anIntArray5650[i]) {
			int i_152_ = anIntArray5650[anIntArray5650.length - 1];
			if (-1 != i_152_)
				return ((Class478) this).aClass474_5651.method7891(i_152_, 65280);
			return null;
		}
		return ((Class478) this).aClass474_5651.method7891(anIntArray5650[i], 65280);
	}

	public boolean method7997(int i) {
		if (null != ((Class478) this).anIntArray5659 && i != -1) {
			for (int i_153_ = 0; i_153_ < ((Class478) this).anIntArray5659.length; i_153_++) {
				if (((Class478) this).anIntArray5659[i_153_] == i)
					return true;
			}
		}
		return false;
	}

	public boolean method7998() {
		if (anIntArray5650 == null)
			return -1 != anInt5653 * 520233251 || anIntArray5688 != null;
		for (int i = 0; i < anIntArray5650.length; i++) {
			if (anIntArray5650[i] != -1) {
				Class478 class478_154_ = ((Class478) this).aClass474_5651.method7891(anIntArray5650[i], 65280);
				if (520233251 * class478_154_.anInt5653 != -1 || null != class478_154_.anIntArray5688)
					return true;
			}
		}
		return false;
	}

	public String method7999(int i, String string) {
		if (((Class478) this).aClass465_5668 == null)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class478) this).aClass465_5668.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public String method8000(int i, String string) {
		if (((Class478) this).aClass465_5668 == null)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((Class478) this).aClass465_5668.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public boolean method8001() {
		if (anIntArray5650 == null)
			return -1 != anInt5653 * 520233251 || anIntArray5688 != null;
		for (int i = 0; i < anIntArray5650.length; i++) {
			if (anIntArray5650[i] != -1) {
				Class478 class478_155_ = ((Class478) this).aClass474_5651.method7891(anIntArray5650[i], 65280);
				if (520233251 * class478_155_.anInt5653 != -1 || null != class478_155_.anIntArray5688)
					return true;
			}
		}
		return false;
	}

	public boolean method8002() {
		if (anIntArray5650 == null)
			return -1 != anInt5653 * 520233251 || anIntArray5688 != null;
		for (int i = 0; i < anIntArray5650.length; i++) {
			if (anIntArray5650[i] != -1) {
				Class478 class478_156_ = ((Class478) this).aClass474_5651.method7891(anIntArray5650[i], 65280);
				if (520233251 * class478_156_.anInt5653 != -1 || null != class478_156_.anIntArray5688)
					return true;
			}
		}
		return false;
	}

	public int method8003() {
		if (((Class478) this).anIntArray5659 != null) {
			if (((Class478) this).anIntArray5659.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_157_ = 0; i_157_ < ((Class478) this).anIntArray5659.length; i_157_++) {
					if (i <= ((Class478) this).anIntArray5675[i_157_])
						return ((Class478) this).anIntArray5659[i_157_];
					i -= ((Class478) this).anIntArray5675[i_157_];
				}
			} else
				return ((Class478) this).anIntArray5659[0];
		}
		return -1;
	}

	public final Class478 method8004(Interface42 interface42) {
		int i = -1;
		if (-1 != 657157663 * ((Class478) this).anInt5690)
			i = interface42.method241(((Class478) this).anInt5690 * 657157663, -1620643117);
		else if (-480478893 * ((Class478) this).anInt5662 != -1)
			i = interface42.method240(((Class478) this).anInt5662 * -480478893, 1813121800);
		if (i < 0 || i >= anIntArray5650.length - 1 || -1 == anIntArray5650[i]) {
			int i_158_ = anIntArray5650[anIntArray5650.length - 1];
			if (-1 != i_158_)
				return ((Class478) this).aClass474_5651.method7891(i_158_, 65280);
			return null;
		}
		return ((Class478) this).aClass474_5651.method7891(anIntArray5650[i], 65280);
	}

	public boolean method8005() {
		return (null != ((Class478) this).anIntArray5659 && ((Class478) this).anIntArray5659.length > 1);
	}

	public final boolean method8006() {
		if (null == anIntArrayArray5637)
			return true;
		boolean bool = true;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
			for (int i = 0; i < anIntArrayArray5637.length; i++) {
				for (int i_159_ = 0; i_159_ < anIntArrayArray5637[i].length; i_159_++)
					bool &= (((Class474) ((Class478) this).aClass474_5651).aClass317_5611.method5688(anIntArrayArray5637[i][i_159_], 0, 16711935));
			}
		}
		return bool;
	}

	public int method8007() {
		if (((Class478) this).anIntArray5659 != null) {
			if (((Class478) this).anIntArray5659.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_160_ = 0; i_160_ < ((Class478) this).anIntArray5659.length; i_160_++) {
					if (i <= ((Class478) this).anIntArray5675[i_160_])
						return ((Class478) this).anIntArray5659[i_160_];
					i -= ((Class478) this).anIntArray5675[i_160_];
				}
			} else
				return ((Class478) this).anIntArray5659[0];
		}
		return -1;
	}

	public int[] method8008(int i) {
		return ((Class478) this).anIntArray5659;
	}

	public int method8009() {
		if (((Class478) this).anIntArray5659 != null) {
			if (((Class478) this).anIntArray5659.length > 1) {
				int i = (int) (Math.random() * 65535.0);
				for (int i_161_ = 0; i_161_ < ((Class478) this).anIntArray5659.length; i_161_++) {
					if (i <= ((Class478) this).anIntArray5675[i_161_])
						return ((Class478) this).anIntArray5659[i_161_];
					i -= ((Class478) this).anIntArray5675[i_161_];
				}
			} else
				return ((Class478) this).anIntArray5659[0];
		}
		return -1;
	}

	public final synchronized Class452 method8010(Class505 class505, int i, int i_162_, int i_163_, Class390 class390, Class390 class390_164_, int i_165_, int i_166_, int i_167_, boolean bool, Class476 class476, int i_168_) {
		if (Class485.method8201(i_162_, -159499065))
			i_162_ = 1109376893 * Class458.aClass458_5475.anInt5481;
		long l = (long) ((i_162_ << 3) + (anInt5633 * -2132690865 << 10) + i_163_);
		l |= (long) (class505.anInt5840 * -413843045 << 29);
		if (class476 != null)
			l |= 8163495958999789513L * ((Class476) class476).aLong5627 << 32;
		int i_169_ = i;
		if (((Class478) this).aByte5697 == 3)
			i_169_ |= 0x7;
		else {
			if (0 != ((Class478) this).aByte5697 || 0 != 1290338989 * ((Class478) this).anInt5683)
				i_169_ |= 0x2;
			if (841092183 * ((Class478) this).anInt5682 != 0)
				i_169_ |= 0x1;
			if (1789236723 * ((Class478) this).anInt5710 != 0)
				i_169_ |= 0x4;
		}
		if (bool)
			i_169_ |= 0x40000;
		Class452 class452;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5615) {
			class452 = (Class452) ((Class474) ((Class478) this).aClass474_5651).aClass229_5615.method3865(l);
		}
		Class528 class528 = (Class528) (null != class452 ? class452.anObject5443 : null);
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		if (class528 == null || class505.method8452(class528.m(), i_169_) != 0) {
			if (class528 != null)
				i_169_ = class505.method8546(i_169_, class528.m());
			int i_170_ = i_169_;
			if (i_162_ == 1109376893 * Class458.aClass458_5490.anInt5481 && i_163_ > 3)
				i_170_ |= 0x5;
			class528 = method7971(class505, i_170_, i_162_, i_163_, class476, 1453950061);
			if (null == class528)
				return null;
			if (i_162_ == Class458.aClass458_5490.anInt5481 * 1109376893 && i_163_ > 3)
				class528.f(2048);
			if (bool)
				class282_sub50_sub17 = class528.ga(null);
			class528.KA(i_169_);
			class452 = new Class452(class528, class282_sub50_sub17);
			synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5615) {
				((Class474) ((Class478) this).aClass474_5651).aClass229_5615.method3856(class452, l);
			}
		} else {
			class282_sub50_sub17 = (Class282_Sub50_Sub17) class452.anObject5444;
			if (bool && class282_sub50_sub17 == null)
				class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452.anObject5444 = class528.ga(null));
		}
		boolean bool_171_ = (((Class478) this).aByte5697 != 0 && (class390 != null || class390_164_ != null));
		boolean bool_172_ = (841092183 * ((Class478) this).anInt5682 != 0 || 0 != 1290338989 * ((Class478) this).anInt5683 || 0 != 1789236723 * ((Class478) this).anInt5710);
		if (bool_171_ || bool_172_) {
			class528 = class528.method11289((byte) 0, i_169_, true);
			if (bool_171_)
				class528.pa(((Class478) this).aByte5697, ((Class478) this).anInt5654 * -1064114405, class390, class390_164_, i_165_, i_166_, i_167_);
			if (bool_172_)
				class528.ia(841092183 * ((Class478) this).anInt5682, 1290338989 * ((Class478) this).anInt5683, ((Class478) this).anInt5710 * 1789236723);
			class528.KA(i);
		} else
			class528 = class528.method11289((byte) 0, i, true);
		((Class474) ((Class478) this).aClass474_5651).aClass452_5620.anObject5443 = class528;
		((Class474) ((Class478) this).aClass474_5651).aClass452_5620.anObject5444 = class282_sub50_sub17;
		return ((Class474) ((Class478) this).aClass474_5651).aClass452_5620;
	}

	public int[] method8011() {
		return ((Class478) this).anIntArray5659;
	}

	public final synchronized Class528 method8012(Class505 class505, int i, int i_173_, int i_174_, Class390 class390, Class390 class390_175_, int i_176_, int i_177_, int i_178_, Class456 class456, Class476 class476, int i_179_) {
		if (Class485.method8201(i_173_, -159499065))
			i_173_ = Class458.aClass458_5475.anInt5481 * 1109376893;
		long l = (long) (i_174_ + ((anInt5633 * -2132690865 << 10) + (i_173_ << 3)));
		int i_180_ = i;
		l |= (long) (-413843045 * class505.anInt5840 << 29);
		if (null != class476)
			l |= ((Class476) class476).aLong5627 * 8163495958999789513L << 32;
		if (class456 != null)
			i |= class456.method7640(-967753514);
		if (((Class478) this).aByte5697 == 3)
			i |= 0x7;
		else {
			if (0 != ((Class478) this).aByte5697 || 0 != 1290338989 * ((Class478) this).anInt5683)
				i |= 0x2;
			if (((Class478) this).anInt5682 * 841092183 != 0)
				i |= 0x1;
			if (0 != ((Class478) this).anInt5710 * 1789236723)
				i |= 0x4;
		}
		if (i_173_ == 1109376893 * Class458.aClass458_5490.anInt5481 && i_174_ > 3)
			i |= 0x5;
		Class528 class528;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5619) {
			class528 = (Class528) ((Class474) ((Class478) this).aClass474_5651).aClass229_5619.method3865(l);
		}
		if (class528 == null || class505.method8452(class528.m(), i) != 0) {
			if (null != class528)
				i = class505.method8546(i, class528.m());
			class528 = method7971(class505, i, i_173_, i_174_, class476, 991974728);
			if (class528 == null)
				return null;
			synchronized (((Class474) ((Class478) this).aClass474_5651).aClass229_5619) {
				((Class474) ((Class478) this).aClass474_5651).aClass229_5619.method3856(class528, l);
			}
		}
		boolean bool = false;
		if (null != class456) {
			class528 = class528.method11289((byte) 1, i, true);
			bool = true;
			class456.method7577(class528, i_174_ & 0x3, 16711935);
		}
		if (i_173_ == Class458.aClass458_5490.anInt5481 * 1109376893 && i_174_ > 3) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.f(2048);
		}
		if (0 != ((Class478) this).aByte5697) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.pa(((Class478) this).aByte5697, -1064114405 * ((Class478) this).anInt5654, class390, class390_175_, i_176_, i_177_, i_178_);
		}
		if (841092183 * ((Class478) this).anInt5682 != 0 || 0 != 1290338989 * ((Class478) this).anInt5683 || ((Class478) this).anInt5710 * 1789236723 != 0) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.ia(841092183 * ((Class478) this).anInt5682, ((Class478) this).anInt5683 * 1290338989, 1789236723 * ((Class478) this).anInt5710);
		}
		if (bool)
			class528.KA(i_180_);
		return class528;
	}

	public final Class478 method8013(Interface42 interface42, byte i) {
		int i_181_ = -1;
		if (-1 != 657157663 * ((Class478) this).anInt5690)
			i_181_ = interface42.method241((((Class478) this).anInt5690 * 657157663), 1655583167);
		else if (-480478893 * ((Class478) this).anInt5662 != -1)
			i_181_ = interface42.method240((((Class478) this).anInt5662 * -480478893), 426606861);
		if (i_181_ < 0 || i_181_ >= anIntArray5650.length - 1 || -1 == anIntArray5650[i_181_]) {
			int i_182_ = anIntArray5650[anIntArray5650.length - 1];
			if (-1 != i_182_)
				return ((Class478) this).aClass474_5651.method7891(i_182_, 65280);
			return null;
		}
		return ((Class478) this).aClass474_5651.method7891(anIntArray5650[i_181_], 65280);
	}

	public int[] method8014() {
		return ((Class478) this).anIntArray5659;
	}

	public int[] method8015() {
		return ((Class478) this).anIntArray5659;
	}

	public final boolean method8016(int i) {
		if (null == anIntArrayArray5637)
			return true;
		boolean bool = true;
		synchronized (((Class474) ((Class478) this).aClass474_5651).aClass317_5611) {
			for (int i_183_ = 0; i_183_ < aByteArray5636.length; i_183_++) {
				if (i == aByteArray5636[i_183_]) {
					for (int i_184_ = 0; i_184_ < anIntArrayArray5637[i_183_].length; i_184_++) {
						if (!((Class474) ((Class478) this).aClass474_5651).aClass317_5611.method5688(anIntArrayArray5637[i_183_][i_184_], 0, 16711935))
							bool = false;
					}
				}
			}
		}
		return bool;
	}

	public boolean method8017(int i) {
		if (null != ((Class478) this).anIntArray5659 && i != -1) {
			for (int i_185_ = 0; i_185_ < ((Class478) this).anIntArray5659.length; i_185_++) {
				if (((Class478) this).anIntArray5659[i_185_] == i)
					return true;
			}
		}
		return false;
	}

	static final void method8018(CS2Executor class527, int i) {
		int i_186_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_186_, (byte) 74);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_186_ >> 16];
		ItemDefinitions.method7142(class118, class98, class527, -1447710686);
	}

	static final void method8019(CS2Executor class527, short i) {
		int i_187_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (1609086245 * client.anInt7434 != 0 && i_187_ < client.anInt7373 * -1754449153)
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = client.aClass10Array7456[i_187_].aString115;
		else
			((CS2Executor) class527).objectStack[((((CS2Executor) class527).anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	public static void method8020(int i) {
		ItemEffects.method7042((byte) 2);
		Class282_Sub20_Sub36.method15420((byte) -32);
		Class282_Sub20_Sub24.method15391(792930354);
		Class335.method5961(1418471735);
	}

	static final void method8021(CS2Executor class527, short i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		int i_188_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_189_ = (((CS2Executor) class527).intStack[1 + 1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_190_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 2]);
		Class96_Sub10.method14603(5, i_188_ << 16 | i_189_, i_190_, "", (byte) 110);
	}

	static Class282_Sub50_Sub12 method8022(int i) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = ((Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass477_9666.method7941((byte) 4));
		if (null != class282_sub50_sub12) {
			class282_sub50_sub12.method4991(-371378792);
			class282_sub50_sub12.method13452((byte) -5);
			return class282_sub50_sub12;
		}
		for (;;) {
			class282_sub50_sub12 = ((Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass477_9655.method7941((byte) 4));
			if (class282_sub50_sub12 == null)
				return null;
			if (class282_sub50_sub12.method14955(31148025) > Class169.method2869(1956971878))
				return null;
			class282_sub50_sub12.method4991(-371378792);
			class282_sub50_sub12.method13452((byte) -5);
			if ((class282_sub50_sub12.aLong8120 * -7883876913471066125L & ~0x7fffffffffffffffL) != 0L)
				return class282_sub50_sub12;
		}
	}

	static byte[] method8023(File file, int i, byte i_191_) {
		byte[] is;
		try {
			byte[] is_192_ = new byte[i];
			Class353.method6208(file, is_192_, i, 108704305);
			is = is_192_;
		} catch (IOException ioexception) {
			return null;
		}
		return is;
	}
}
