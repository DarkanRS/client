
/* Class478 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class ObjectDefinitions {
	public int id;
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
	public String[] options;
	public int anInt5648;
	public int anInt5649;
	public int[] anIntArray5650;
	ObjectIndexLoader loader;
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
	public boolean projectileClipped;
	public int anInt5665;
	public int anInt5666;
	public int anInt5667;
	IterableNodeMap aClass465_5668;
	public int anInt5669;
	public int anInt5670;
	public boolean aBool5671;
	public int anInt5672;
	public boolean aBool5673;
	public boolean aBool5674;
	int[] anIntArray5675;
	int anInt5676;
	public int clipType;
	int anInt5678;
	int anInt5679;
	short[] aShortArray5680;
	int anInt5681;
	int anInt5682;
	int anInt5683;
	public int anInt5684;
	public boolean aBool5685;
	public boolean ignoreClipOnAlternativeRoute;
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

	public int method7963(int i, int i_0_, int i_1_) {
		if (((ObjectDefinitions) this).aClass465_5668 == null)
			return i_0_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((ObjectDefinitions) this).aClass465_5668.method7754((long) i));
		if (class282_sub38 == null)
			return i_0_;
		return class282_sub38.anInt8002 * -570797415;
	}

	void method7964(RsByteBuffer stream, byte i) {
		for (;;) {
			int i_2_ = stream.readUnsignedByte();
			if (0 == i_2_)
				break;
			method7965(stream, i_2_, -421182854);
		}
	}

	void method7965(RsByteBuffer stream, int opcode, int i_3_) {
		if (opcode == 1) {
			int i_4_ = stream.readUnsignedByte();
			aByteArray5636 = new byte[i_4_];
			anIntArrayArray5637 = new int[i_4_][];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				aByteArray5636[i_5_] = stream.readByte();
				int i_6_ = stream.readUnsignedByte();
				anIntArrayArray5637[i_5_] = new int[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
					anIntArrayArray5637[i_5_][i_7_] = stream.readBigSmart();
			}
		} else if (opcode == 2)
			aString5638 = stream.readString();
		else if (opcode == 14)
			anInt5648 = stream.readUnsignedByte() * 63498699;
		else if (15 == opcode)
			anInt5649 = stream.readUnsignedByte() * -390035927;
		else if (17 == opcode) {
			clipType = 0;
			projectileClipped = false;
		} else if (18 == opcode)
			projectileClipped = false;
		else if (opcode == 19)
			anInt5652 = stream.readUnsignedByte() * 133157829;
		else if (21 == opcode)
			((ObjectDefinitions) this).aByte5697 = (byte) 1;
		else if (22 == opcode)
			aBool5655 = true;
		else if (opcode == 23)
			anInt5656 = 1255728073; //1
		else if (opcode == 24) {
			int i_8_ = stream.readBigSmart();
			if (i_8_ != -1)
				((ObjectDefinitions) this).anIntArray5659 = new int[] { i_8_ };
		} else if (opcode == 27)
			clipType = -1129004249; //1
		else if (opcode == 28)
			anInt5661 = (stream.readUnsignedByte() << 2) * -256480385;
		else if (opcode == 29)
			((ObjectDefinitions) this).anInt5692 = stream.readByte() * -887236111;
		else if (39 == opcode)
			((ObjectDefinitions) this).anInt5663 = stream.readByte() * -520358997;
		else if (opcode >= 30 && opcode < 35)
			options[opcode - 30] = stream.readString();
		else if (40 == opcode) {
			int i_9_ = stream.readUnsignedByte();
			((ObjectDefinitions) this).aShortArray5645 = new short[i_9_];
			aShortArray5640 = new short[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
				((ObjectDefinitions) this).aShortArray5645[i_10_] = (short) stream.readUnsignedShort();
				aShortArray5640[i_10_] = (short) stream.readUnsignedShort();
			}
		} else if (opcode == 41) {
			int i_11_ = stream.readUnsignedByte();
			((ObjectDefinitions) this).aShortArray5680 = new short[i_11_];
			aShortArray5643 = new short[i_11_];
			for (int i_12_ = 0; i_12_ < i_11_; i_12_++) {
				((ObjectDefinitions) this).aShortArray5680[i_12_] = (short) stream.readUnsignedShort();
				aShortArray5643[i_12_] = (short) stream.readUnsignedShort();
			}
		} else if (opcode == 42) {
			int i_13_ = stream.readUnsignedByte();
			((ObjectDefinitions) this).aByteArray5641 = new byte[i_13_];
			for (int i_14_ = 0; i_14_ < i_13_; i_14_++)
				((ObjectDefinitions) this).aByteArray5641[i_14_] = stream.readByte();
		} else if (opcode == 62)
			aBool5674 = true;
		else if (opcode == 64)
			aBool5657 = false;
		else if (65 == opcode)
			((ObjectDefinitions) this).anInt5676 = stream.readUnsignedShort() * 801023861;
		else if (opcode == 66)
			((ObjectDefinitions) this).anInt5639 = stream.readUnsignedShort() * -1035484709;
		else if (67 == opcode)
			((ObjectDefinitions) this).anInt5678 = stream.readUnsignedShort() * 767415499;
		else if (opcode == 69)
			stream.readUnsignedByte();
		else if (70 == opcode)
			((ObjectDefinitions) this).anInt5679 = (stream.readShort(1685514622) << 2) * -1230022539;
		else if (opcode == 71)
			((ObjectDefinitions) this).anInt5635 = (stream.readShort(1579109585) << 2) * 568911825;
		else if (opcode == 72)
			((ObjectDefinitions) this).anInt5681 = (stream.readShort(1620608715) << 2) * -1156266609;
		else if (73 == opcode)
			aBool5685 = true;
		else if (opcode == 74)
			ignoreClipOnAlternativeRoute = true;
		else if (opcode == 75)
			anInt5687 = stream.readUnsignedByte() * -1098527587;
		else if (77 == opcode || 92 == opcode) {
			((ObjectDefinitions) this).anInt5690 = stream.readUnsignedShort() * -1845719585;
			if (65535 == ((ObjectDefinitions) this).anInt5690 * 657157663)
				((ObjectDefinitions) this).anInt5690 = 1845719585; //-1
			((ObjectDefinitions) this).anInt5662 = stream.readUnsignedShort() * -1094307109;
			if (((ObjectDefinitions) this).anInt5662 * -480478893 == 65535)
				((ObjectDefinitions) this).anInt5662 = 1094307109; //-1
			int i_15_ = -1;
			if (opcode == 92)
				i_15_ = stream.readBigSmart();
			int i_16_ = stream.readUnsignedByte();
			anIntArray5650 = new int[i_16_ + 2];
			for (int i_17_ = 0; i_17_ <= i_16_; i_17_++)
				anIntArray5650[i_17_] = stream.readBigSmart();
			anIntArray5650[1 + i_16_] = i_15_;
		} else if (78 == opcode) {
			anInt5653 = stream.readUnsignedShort() * 846534283;
			anInt5693 = stream.readUnsignedByte() * 36323001;
		} else if (79 == opcode) {
			anInt5667 = stream.readUnsignedShort() * -522100571;
			anInt5698 = stream.readUnsignedShort() * -291570643;
			anInt5693 = stream.readUnsignedByte() * 36323001;
			int i_18_ = stream.readUnsignedByte();
			anIntArray5688 = new int[i_18_];
			for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
				anIntArray5688[i_19_] = stream.readUnsignedShort();
		} else if (81 == opcode) {
			((ObjectDefinitions) this).aByte5697 = (byte) 2;
			((ObjectDefinitions) this).anInt5654 = stream.readUnsignedByte() * -1155853568;
		} else if (opcode == 82)
			aBool5701 = true;
		else if (88 == opcode)
			aBool5703 = false;
		else if (opcode == 89)
			aBool5702 = false;
		else if (91 == opcode)
			aBool5660 = true;
		else if (93 == opcode) {
			((ObjectDefinitions) this).aByte5697 = (byte) 3;
			((ObjectDefinitions) this).anInt5654 = stream.readUnsignedShort() * -1833231597;
		} else if (opcode == 94)
			((ObjectDefinitions) this).aByte5697 = (byte) 4;
		else if (95 == opcode) {
			((ObjectDefinitions) this).aByte5697 = (byte) 5;
			((ObjectDefinitions) this).anInt5654 = stream.readShort(1937595123) * -1833231597;
		} else if (97 == opcode)
			aBool5671 = true;
		else if (98 == opcode)
			aBool5706 = true;
		else if (99 == opcode) {
			anInt5705 = stream.readUnsignedByte() * -639946005;
			anInt5665 = stream.readUnsignedShort() * 855306295;
		} else if (opcode == 100) {
			anInt5670 = stream.readUnsignedByte() * 493578143;
			anInt5666 = stream.readUnsignedShort() * -1305998005;
		} else if (101 == opcode)
			anInt5672 = stream.readUnsignedByte() * 777293949;
		else if (opcode == 102)
			anInt5689 = stream.readUnsignedShort() * -380570225;
		else if (opcode == 103)
			anInt5656 = 0;
		else if (104 == opcode)
			anInt5695 = stream.readUnsignedByte() * -1685623039;
		else if (opcode == 105)
			aBool5673 = true;
		else if (106 == opcode) {
			int i_20_ = stream.readUnsignedByte();
			int i_21_ = 0;
			((ObjectDefinitions) this).anIntArray5659 = new int[i_20_];
			((ObjectDefinitions) this).anIntArray5675 = new int[i_20_];
			for (int i_22_ = 0; i_22_ < i_20_; i_22_++) {
				((ObjectDefinitions) this).anIntArray5659[i_22_] = stream.readBigSmart();
				i_21_ += ((ObjectDefinitions) this).anIntArray5675[i_22_] = stream.readUnsignedByte();
			}
			for (int i_23_ = 0; i_23_ < i_20_; i_23_++)
				((ObjectDefinitions) this).anIntArray5675[i_23_] = ((ObjectDefinitions) this).anIntArray5675[i_23_] * 65535 / i_21_;
		} else if (opcode == 107)
			anInt5669 = stream.readUnsignedShort() * 945855293;
		else if (opcode >= 150 && opcode < 155) {
			options[opcode - 150] = stream.readString();
			if (!((ObjectIndexLoader) ((ObjectDefinitions) this).loader).showOptions)
				options[opcode - 150] = null;
		} else if (160 == opcode) {
			int i_24_ = stream.readUnsignedByte();
			anIntArray5707 = new int[i_24_];
			for (int i_25_ = 0; i_25_ < i_24_; i_25_++)
				anIntArray5707[i_25_] = stream.readUnsignedShort();
		} else if (162 == opcode) {
			((ObjectDefinitions) this).aByte5697 = (byte) 3;
			((ObjectDefinitions) this).anInt5654 = stream.readInt() * -1833231597;
		} else if (163 == opcode) {
			((ObjectDefinitions) this).aByte5644 = stream.readByte();
			((ObjectDefinitions) this).aByte5642 = stream.readByte();
			((ObjectDefinitions) this).aByte5646 = stream.readByte();
			((ObjectDefinitions) this).aByte5634 = stream.readByte();
		} else if (164 == opcode)
			((ObjectDefinitions) this).anInt5682 = stream.readShort(1834354367) * -2137677977;
		else if (165 == opcode)
			((ObjectDefinitions) this).anInt5683 = stream.readShort(1806623177) * 2105389349;
		else if (166 == opcode)
			((ObjectDefinitions) this).anInt5710 = stream.readShort(2108159773) * 1749486395;
		else if (167 == opcode)
			anInt5704 = stream.readUnsignedShort() * -1140808153;
		else if (168 == opcode)
			aBool5696 = true;
		else if (169 == opcode)
			aBool5700 = true;
		else if (opcode == 170)
			anInt5684 = stream.readUnsignedSmart(1632519186) * 320365989;
		else if (opcode == 171)
			anInt5658 = stream.readUnsignedSmart(1916118902) * -1055006837;
		else if (opcode == 173) {
			anInt5708 = stream.readUnsignedShort() * -8430363;
			anInt5709 = stream.readUnsignedShort() * -1558642785;
		} else if (177 == opcode)
			aBool5699 = true;
		else if (178 == opcode)
			anInt5694 = stream.readUnsignedByte() * -799618175;
		else if (189 == opcode)
			aBool5711 = true;
		else if (249 == opcode) {
			int i_26_ = stream.readUnsignedByte();
			if (((ObjectDefinitions) this).aClass465_5668 == null) {
				int i_27_ = Class323.nextPowerOfTwo(i_26_, -1920576994);
				((ObjectDefinitions) this).aClass465_5668 = new IterableNodeMap(i_27_);
			}
			for (int i_28_ = 0; i_28_ < i_26_; i_28_++) {
				boolean bool = stream.readUnsignedByte() == 1;
				int i_29_ = stream.read24BitUnsignedInteger();
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(stream.readString());
				else
					class282 = new Class282_Sub38(stream.readInt());
				((ObjectDefinitions) this).aClass465_5668.method7765(class282, (long) i_29_);
			}
		}
	}

	void method7966(int i) {
		if (anInt5652 * -348507379 == -1) {
			anInt5652 = 0;
			if (null != aByteArray5636 && aByteArray5636.length == 1 && (aByteArray5636[0] == 1109376893 * SceneObjectType.SCENERY_INTERACT.type))
				anInt5652 = 133157829;
			for (int i_30_ = 0; i_30_ < 5; i_30_++) {
				if (options[i_30_] != null) {
					anInt5652 = 133157829;
					break;
				}
			}
		}
		if (anInt5687 * -1062790731 == -1)
			anInt5687 = -1098527587 * (0 != 647396503 * clipType ? 1 : 0);
		if (method7967((byte) 39) || aBool5706 || anIntArray5650 != null)
			aBool5699 = true;
	}

	public boolean method7967(byte i) {
		return null != ((ObjectDefinitions) this).anIntArray5659;
	}

	public final boolean method7968(int i) {
		if (null == anIntArrayArray5637)
			return true;
		boolean bool = true;
		synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).meshIndex) {
			for (int i_31_ = 0; i_31_ < anIntArrayArray5637.length; i_31_++) {
				for (int i_32_ = 0; i_32_ < anIntArrayArray5637[i_31_].length; i_32_++)
					bool &= (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).meshIndex.load(anIntArrayArray5637[i_31_][i_32_], 0, 16711935));
			}
		}
		return bool;
	}

	MeshRasterizer method7971(GraphicalRenderer class505, int i, int i_35_, int i_36_, Class476 class476, int i_37_) {
		int i_38_ = 64 + 1821243153 * ((ObjectDefinitions) this).anInt5692;
		int i_39_ = 850 + -1091753201 * ((ObjectDefinitions) this).anInt5663;
		int i_40_ = i;
		boolean bool = aBool5674 || i_35_ == (SceneObjectType.WALL_WHOLE_CORNER.type * 1109376893) && i_36_ > 3;
		if (bool)
			i |= 0x10;
		if (0 == i_36_) {
			if (128 != -1341804323 * ((ObjectDefinitions) this).anInt5676 || 0 != ((ObjectDefinitions) this).anInt5679 * 1949415389)
				i |= 0x1;
			if (128 != ((ObjectDefinitions) this).anInt5678 * -1815416605 || -1272530577 * ((ObjectDefinitions) this).anInt5681 != 0)
				i |= 0x4;
		} else
			i |= 0xd;
		if (((ObjectDefinitions) this).anInt5639 * -1356049837 != 128 || 520802609 * ((ObjectDefinitions) this).anInt5635 != 0)
			i |= 0x2;
		if (null != ((ObjectDefinitions) this).aShortArray5645)
			i |= 0x4000;
		if (((ObjectDefinitions) this).aShortArray5680 != null)
			i |= 0x8000;
		if (0 != ((ObjectDefinitions) this).aByte5634)
			i |= 0x80000;
		MeshRasterizer class528 = null;
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
				long l = (long) (-413843045 * class505.rendererId);
				for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
					l = (long) is[i_44_] + 67783L * l;
				synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5614) {
					class528 = ((MeshRasterizer) ((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5614.get(l));
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
					RSMesh class157 = null;
					synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass157Array5616) {
						for (int i_46_ = 0; i_46_ < i_43_; i_46_++) {
							synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).meshIndex) {
								class157 = RSMesh.decodeMesh((((ObjectIndexLoader) (((ObjectDefinitions) this).loader)).meshIndex), is[i_46_], 0);
							}
							if (null == class157) {
								MeshRasterizer class528_47_ = null;
								return class528_47_;
							}
							if (class157.zoom < 13)
								class157.upscale(2);
							if (i_43_ > 1)
								((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass157Array5616[i_46_] = class157;
						}
						if (i_43_ > 1)
							class157 = new RSMesh((((ObjectIndexLoader) (((ObjectDefinitions) this).loader)).aClass157Array5616), i_43_);
					}
					class528 = class505.createMeshRasterizer(class157, i_45_, 456299079 * (((ObjectIndexLoader) (((ObjectDefinitions) this).loader)).anInt5617), i_38_, i_39_);
					synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5614) {
						((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5614.put(class528, l);
					}
				}
			}
		}
		if (null == class528)
			return null;
		MeshRasterizer class528_48_ = class528.method11289((byte) 0, i, true);
		if (i_38_ != class528.c())
			class528_48_.p(i_38_);
		if (i_39_ != class528.Z())
			class528_48_.Q(i_39_);
		if (bool)
			class528_48_.wa();
		if (SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type * 1109376893 == i_35_ && i_36_ > 3) {
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
		if (null != ((ObjectDefinitions) this).aShortArray5645) {
			short[] is;
			if (class476 != null && ((Class476) class476).aShortArray5628 != null)
				is = ((Class476) class476).aShortArray5628;
			else
				is = aShortArray5640;
			for (int i_49_ = 0; i_49_ < ((ObjectDefinitions) this).aShortArray5645.length; i_49_++) {
				if (null != ((ObjectDefinitions) this).aByteArray5641 && i_49_ < ((ObjectDefinitions) this).aByteArray5641.length)
					class528_48_.X(((ObjectDefinitions) this).aShortArray5645[i_49_], (aShortArray5691[(((ObjectDefinitions) this).aByteArray5641[i_49_] & 0xff)]));
				else
					class528_48_.X(((ObjectDefinitions) this).aShortArray5645[i_49_], is[i_49_]);
			}
		}
		if (null != ((ObjectDefinitions) this).aShortArray5680) {
			short[] is;
			if (class476 != null && null != ((Class476) class476).aShortArray5625)
				is = ((Class476) class476).aShortArray5625;
			else
				is = aShortArray5643;
			for (int i_50_ = 0; i_50_ < ((ObjectDefinitions) this).aShortArray5680.length; i_50_++)
				class528_48_.W(((ObjectDefinitions) this).aShortArray5680[i_50_], is[i_50_]);
		}
		if (((ObjectDefinitions) this).aByte5634 != 0)
			class528_48_.PA(((ObjectDefinitions) this).aByte5644, ((ObjectDefinitions) this).aByte5642, ((ObjectDefinitions) this).aByte5646, ((ObjectDefinitions) this).aByte5634 & 0xff);
		if (-1341804323 * ((ObjectDefinitions) this).anInt5676 != 128 || 128 != -1356049837 * ((ObjectDefinitions) this).anInt5639 || 128 != -1815416605 * ((ObjectDefinitions) this).anInt5678)
			class528_48_.oa(-1341804323 * ((ObjectDefinitions) this).anInt5676, ((ObjectDefinitions) this).anInt5639 * -1356049837, ((ObjectDefinitions) this).anInt5678 * -1815416605);
		if (1949415389 * ((ObjectDefinitions) this).anInt5679 != 0 || ((ObjectDefinitions) this).anInt5635 * 520802609 != 0 || -1272530577 * ((ObjectDefinitions) this).anInt5681 != 0)
			class528_48_.ia(1949415389 * ((ObjectDefinitions) this).anInt5679, 520802609 * ((ObjectDefinitions) this).anInt5635, ((ObjectDefinitions) this).anInt5681 * -1272530577);
		class528_48_.KA(i_40_);
		return class528_48_;
	}

	ObjectDefinitions() {
		((ObjectDefinitions) this).aByte5634 = (byte) 0;
		anInt5648 = 63498699;
		anInt5649 = -390035927;
		clipType = 2036958798;
		projectileClipped = true;
		anInt5652 = -133157829;
		((ObjectDefinitions) this).aByte5697 = (byte) 0;
		((ObjectDefinitions) this).anInt5654 = 1833231597;
		aBool5655 = false;
		anInt5656 = -1255728073;
		anInt5684 = -1686295872;
		anInt5658 = 0;
		((ObjectDefinitions) this).anIntArray5659 = null;
		((ObjectDefinitions) this).anIntArray5675 = null;
		anInt5661 = 765124544;
		((ObjectDefinitions) this).anInt5692 = 0;
		((ObjectDefinitions) this).anInt5663 = 0;
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
		((ObjectDefinitions) this).anInt5676 = -548160896;
		((ObjectDefinitions) this).anInt5639 = 601943424;
		((ObjectDefinitions) this).anInt5678 = -555063936;
		((ObjectDefinitions) this).anInt5679 = 0;
		((ObjectDefinitions) this).anInt5635 = 0;
		((ObjectDefinitions) this).anInt5681 = 0;
		((ObjectDefinitions) this).anInt5682 = 0;
		((ObjectDefinitions) this).anInt5683 = 0;
		((ObjectDefinitions) this).anInt5710 = 0;
		aBool5685 = false;
		ignoreClipOnAlternativeRoute = false;
		anInt5687 = 1098527587;
		anInt5704 = 0;
		((ObjectDefinitions) this).anInt5690 = 1845719585;
		((ObjectDefinitions) this).anInt5662 = 1094307109;
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

	public String method7973(int i, String string, byte i_52_) {
		if (((ObjectDefinitions) this).aClass465_5668 == null)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((ObjectDefinitions) this).aClass465_5668.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public boolean method7974(int i) {
		if (anIntArray5650 == null)
			return -1 != anInt5653 * 520233251 || anIntArray5688 != null;
		for (int i_53_ = 0; i_53_ < anIntArray5650.length; i_53_++) {
			if (anIntArray5650[i_53_] != -1) {
				ObjectDefinitions class478_54_ = ((ObjectDefinitions) this).loader.getObjectDefinitions(anIntArray5650[i_53_], 65280);
				if (520233251 * class478_54_.anInt5653 != -1 || null != class478_54_.anIntArray5688)
					return true;
			}
		}
		return false;
	}


	public boolean method7976(short i) {
		return (null != ((ObjectDefinitions) this).anIntArray5659 && ((ObjectDefinitions) this).anIntArray5659.length > 1);
	}

	public int method7977(byte i) {
		if (((ObjectDefinitions) this).anIntArray5659 != null) {
			if (((ObjectDefinitions) this).anIntArray5659.length > 1) {
				int i_55_ = (int) (Math.random() * 65535.0);
				for (int i_56_ = 0; i_56_ < ((ObjectDefinitions) this).anIntArray5659.length; i_56_++) {
					if (i_55_ <= ((ObjectDefinitions) this).anIntArray5675[i_56_])
						return ((ObjectDefinitions) this).anIntArray5659[i_56_];
					i_55_ -= ((ObjectDefinitions) this).anIntArray5675[i_56_];
				}
			} else
				return ((ObjectDefinitions) this).anIntArray5659[0];
		}
		return -1;
	}

	public boolean method7979(int i, int i_72_) {
		if (null != ((ObjectDefinitions) this).anIntArray5659 && i != -1) {
			for (int i_73_ = 0; i_73_ < ((ObjectDefinitions) this).anIntArray5659.length; i_73_++) {
				if (((ObjectDefinitions) this).anIntArray5659[i_73_] == i)
					return true;
			}
		}
		return false;
	}

	public final boolean method7987(int i, int i_112_) {
		if (null == anIntArrayArray5637)
			return true;
		boolean bool = true;
		synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).meshIndex) {
			for (int i_113_ = 0; i_113_ < aByteArray5636.length; i_113_++) {
				if (i == aByteArray5636[i_113_]) {
					for (int i_114_ = 0; i_114_ < anIntArrayArray5637[i_113_].length; i_114_++) {
						if (!((ObjectIndexLoader) ((ObjectDefinitions) this).loader).meshIndex.load(anIntArrayArray5637[i_113_][i_114_], 0, 16711935))
							bool = false;
					}
				}
			}
		}
		return bool;
	}

	public int[] method8008(int i) {
		return ((ObjectDefinitions) this).anIntArray5659;
	}

	public final synchronized Class452 method8010(GraphicalRenderer class505, int i, int i_162_, int i_163_, Class390 class390, Class390 class390_164_, int i_165_, int i_166_, int i_167_, boolean bool, Class476 class476, int i_168_) {
		if (Class485.method8201(i_162_, -159499065))
			i_162_ = 1109376893 * SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type;
		long l = (long) ((i_162_ << 3) + (id * -2132690865 << 10) + i_163_);
		l |= (long) (class505.rendererId * -413843045 << 29);
		if (class476 != null)
			l |= 8163495958999789513L * ((Class476) class476).aLong5627 << 32;
		int i_169_ = i;
		if (((ObjectDefinitions) this).aByte5697 == 3)
			i_169_ |= 0x7;
		else {
			if (0 != ((ObjectDefinitions) this).aByte5697 || 0 != 1290338989 * ((ObjectDefinitions) this).anInt5683)
				i_169_ |= 0x2;
			if (841092183 * ((ObjectDefinitions) this).anInt5682 != 0)
				i_169_ |= 0x1;
			if (1789236723 * ((ObjectDefinitions) this).anInt5710 != 0)
				i_169_ |= 0x4;
		}
		if (bool)
			i_169_ |= 0x40000;
		Class452 class452;
		synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5615) {
			class452 = (Class452) ((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5615.get(l);
		}
		MeshRasterizer raster = (MeshRasterizer) (null != class452 ? class452.anObject5443 : null);
		Class282_Sub50_Sub17 class282_sub50_sub17 = null;
		if (raster == null || class505.method8452(raster.m(), i_169_) != 0) {
			if (raster != null)
				i_169_ = class505.method8546(i_169_, raster.m());
			int i_170_ = i_169_;
			if (i_162_ == 1109376893 * SceneObjectType.SCENERY_INTERACT.type && i_163_ > 3)
				i_170_ |= 0x5;
			raster = method7971(class505, i_170_, i_162_, i_163_, class476, 1453950061);
			if (null == raster)
				return null;
			if (i_162_ == SceneObjectType.SCENERY_INTERACT.type * 1109376893 && i_163_ > 3)
				raster.f(2048);
			if (bool)
				class282_sub50_sub17 = raster.ga(null);
			raster.KA(i_169_);
			class452 = new Class452(raster, class282_sub50_sub17);
			synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5615) {
				((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5615.put(class452, l);
			}
		} else {
			class282_sub50_sub17 = (Class282_Sub50_Sub17) class452.anObject5444;
			if (bool && class282_sub50_sub17 == null)
				class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452.anObject5444 = raster.ga(null));
		}
		boolean bool_171_ = (((ObjectDefinitions) this).aByte5697 != 0 && (class390 != null || class390_164_ != null));
		boolean bool_172_ = (841092183 * ((ObjectDefinitions) this).anInt5682 != 0 || 0 != 1290338989 * ((ObjectDefinitions) this).anInt5683 || 0 != 1789236723 * ((ObjectDefinitions) this).anInt5710);
		if (bool_171_ || bool_172_) {
			raster = raster.method11289((byte) 0, i_169_, true);
			if (bool_171_ && (anInt5654 * -1064114405) < 16384) { //crashes in software
				raster.pa(((ObjectDefinitions) this).aByte5697, ((ObjectDefinitions) this).anInt5654 * -1064114405, class390, class390_164_, i_165_, i_166_, i_167_);
			}
			if (bool_172_)
				raster.ia(841092183 * ((ObjectDefinitions) this).anInt5682, 1290338989 * ((ObjectDefinitions) this).anInt5683, ((ObjectDefinitions) this).anInt5710 * 1789236723);
			raster.KA(i);
		} else
			raster = raster.method11289((byte) 0, i, true);
		((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass452_5620.anObject5443 = raster;
		((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass452_5620.anObject5444 = class282_sub50_sub17;
		return ((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass452_5620;
	}

	public final synchronized MeshRasterizer method8012(GraphicalRenderer class505, int i, int i_173_, int i_174_, Class390 class390, Class390 class390_175_, int i_176_, int i_177_, int i_178_, Animation class456, Class476 class476, int i_179_) {
		if (Class485.method8201(i_173_, -159499065))
			i_173_ = SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type * 1109376893;
		long l = (long) (i_174_ + ((id * -2132690865 << 10) + (i_173_ << 3)));
		int i_180_ = i;
		l |= (long) (-413843045 * class505.rendererId << 29);
		if (null != class476)
			l |= ((Class476) class476).aLong5627 * 8163495958999789513L << 32;
		if (class456 != null)
			i |= class456.method7640(-967753514);
		if (((ObjectDefinitions) this).aByte5697 == 3)
			i |= 0x7;
		else {
			if (0 != ((ObjectDefinitions) this).aByte5697 || 0 != 1290338989 * ((ObjectDefinitions) this).anInt5683)
				i |= 0x2;
			if (((ObjectDefinitions) this).anInt5682 * 841092183 != 0)
				i |= 0x1;
			if (0 != ((ObjectDefinitions) this).anInt5710 * 1789236723)
				i |= 0x4;
		}
		if (i_173_ == 1109376893 * SceneObjectType.SCENERY_INTERACT.type && i_174_ > 3)
			i |= 0x5;
		MeshRasterizer class528;
		synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5619) {
			class528 = (MeshRasterizer) ((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5619.get(l);
		}
		if (class528 == null || class505.method8452(class528.m(), i) != 0) {
			if (null != class528)
				i = class505.method8546(i, class528.m());
			class528 = method7971(class505, i, i_173_, i_174_, class476, 991974728);
			if (class528 == null)
				return null;
			synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5619) {
				((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5619.put(class528, l);
			}
		}
		boolean bool = false;
		if (null != class456) {
			class528 = class528.method11289((byte) 1, i, true);
			bool = true;
			class456.method7577(class528, i_174_ & 0x3, 16711935);
		}
		if (i_173_ == SceneObjectType.SCENERY_INTERACT.type * 1109376893 && i_174_ > 3) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.f(2048);
		}
		if (0 != ((ObjectDefinitions) this).aByte5697) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.pa(((ObjectDefinitions) this).aByte5697, -1064114405 * ((ObjectDefinitions) this).anInt5654, class390, class390_175_, i_176_, i_177_, i_178_);
		}
		if (841092183 * ((ObjectDefinitions) this).anInt5682 != 0 || 0 != 1290338989 * ((ObjectDefinitions) this).anInt5683 || ((ObjectDefinitions) this).anInt5710 * 1789236723 != 0) {
			if (!bool) {
				class528 = class528.method11289((byte) 3, i, true);
				bool = true;
			}
			class528.ia(841092183 * ((ObjectDefinitions) this).anInt5682, ((ObjectDefinitions) this).anInt5683 * 1290338989, 1789236723 * ((ObjectDefinitions) this).anInt5710);
		}
		if (bool)
			class528.KA(i_180_);
		return class528;
	}

	public final ObjectDefinitions method8013(Interface42 interface42, byte i) {
		int i_181_ = -1;
		if (-1 != 657157663 * ((ObjectDefinitions) this).anInt5690)
			i_181_ = interface42.method241((((ObjectDefinitions) this).anInt5690 * 657157663), 1655583167);
		else if (-480478893 * ((ObjectDefinitions) this).anInt5662 != -1)
			i_181_ = interface42.method240((((ObjectDefinitions) this).anInt5662 * -480478893), 426606861);
		if (i_181_ < 0 || i_181_ >= anIntArray5650.length - 1 || -1 == anIntArray5650[i_181_]) {
			int i_182_ = anIntArray5650[anIntArray5650.length - 1];
			if (-1 != i_182_)
				return ((ObjectDefinitions) this).loader.getObjectDefinitions(i_182_, 65280);
			return null;
		}
		return ((ObjectDefinitions) this).loader.getObjectDefinitions(anIntArray5650[i_181_], 65280);
	}

	static final void method8018(CS2Executor class527, int i) {
		int i_186_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_186_, (byte) 74);
		Interface class98 = Class468_Sub8.aClass98Array7889[i_186_ >> 16];
		ItemDefinitions.method7142(class118, class98, class527, -1447710686);
	}

	static final void method8019(CS2Executor class527, short i) {
		int i_187_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (1609086245 * client.anInt7434 != 0 && i_187_ < client.anInt7373 * -1754449153)
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = client.aClass10Array7456[i_187_].aString115;
		else
			class527.objectStack[((class527.anInt7000 += 1476624725) * 1806726141 - 1)] = "";
	}

	public static void method8020(int i) {
		MeshModifier.method7042((byte) 2);
		Class282_Sub20_Sub36.method15420((byte) -32);
		Class282_Sub20_Sub24.method15391(792930354);
		Class335.method5961(1418471735);
	}

	static final void method8021(CS2Executor class527, short i) {
		class527.intStackPtr -= 425673003;
		int i_188_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_189_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		int i_190_ = (class527.intStack[1942118537 * class527.intStackPtr + 2]);
		Class96_Sub10.method14603(5, i_188_ << 16 | i_189_, i_190_, "", (byte) 110);
	}

	static Class282_Sub50_Sub12 method8022(int i) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = ((Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass477_9666.method7941((byte) 4));
		if (null != class282_sub50_sub12) {
			class282_sub50_sub12.remove();
			class282_sub50_sub12.method13452();
			return class282_sub50_sub12;
		}
		for (;;) {
			class282_sub50_sub12 = ((Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass477_9655.method7941((byte) 4));
			if (class282_sub50_sub12 == null)
				return null;
			if (class282_sub50_sub12.method14955(31148025) > Class169.method2869(1956971878))
				return null;
			class282_sub50_sub12.remove();
			class282_sub50_sub12.method13452();
			if ((class282_sub50_sub12.key * -7883876913471066125L & ~0x7fffffffffffffffL) != 0L)
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
