import java.io.File;
import java.io.IOException;

public class ObjectDefinitions {

	public int id;
	public String[] options;
	ObjectIndexLoader loader;
	public static short[] aShortArray5691 = new short[256];
	public byte[] aByteArray5636;
	public int[][] anIntArrayArray5637;
	public String aString5638 = "null";
	public int anInt5648 = 1;
	public int anInt5649 = 1;
	public int clipType = 2;
	public boolean projectileClipped = true;
	public int anInt5652 = -1;
	byte aByte5697 = 0;
	public boolean aBool5655 = false;
	public int anInt5656 = -1;
	int[] anIntArray5659 = null;
	public int anInt5661 = 64;
	int anInt5692 = 0;
	int anInt5663 = 0;
	short[] aShortArray5645;
	public short[] aShortArray5640;
	short[] aShortArray5680;
	public short[] aShortArray5643;
	byte[] aByteArray5641;
	public boolean aBool5674 = false;
	public boolean aBool5657 = true;
	int anInt5676 = 128;
	int anInt5639 = 128;
	int anInt5678 = 128;
	int anInt5679 = 0;
	int anInt5635 = 0;
	int anInt5681 = 0;
	public boolean aBool5685 = false;
	public boolean ignoreClipOnAlternativeRoute = false;
	public int anInt5687 = -1;
	int anInt5690 = -1;
	int anInt5662 = -1;
	public int anInt5653 = -1;
	public int anInt5693 = 0;
	public int anInt5667 = 0;
	public int anInt5698 = 0;
	public int[] anIntArray5688;
	public int[] anIntArray5650;
	int anInt5654 = -1;
	public boolean aBool5701 = false;
	public boolean aBool5703 = true;
	public boolean aBool5702 = true;
	public boolean aBool5660 = false;
	public boolean aBool5671 = false;
	public boolean aBool5706 = false;
	public int anInt5705 = -1;
	public int anInt5665 = -1;
	public int anInt5670 = -1;
	public int anInt5666 = -1;
	public int anInt5672 = 0;
	public int anInt5689 = -1;
	public int anInt5695 = 255;
	public boolean aBool5673 = false;
	int[] anIntArray5675 = null;
	public int anInt5669 = -1;
	public int[] anIntArray5707;
	byte aByte5644;
	byte aByte5642;
	byte aByte5646;
	byte aByte5634 = 0;
	int anInt5682 = 0;
	int anInt5683 = 0;
	int anInt5710 = 0;
	public int anInt5704 = 0;
	public boolean aBool5696 = false;
	public boolean aBool5700 = false;
	public int anInt5684 = 960;
	public int anInt5658 = 0;
	public int anInt5708 = 256;
	public int anInt5709 = 256;
	public boolean aBool5699 = false;
	public int anInt5694 = 0;
	public boolean aBool5711 = false;
	IterableNodeMap aClass465_5668;

	public int method7963(int i_1, int i_2, int i_3) {
		if (this.aClass465_5668 == null) {
			return i_2;
		} else {
			Class282_Sub38 class282_sub38_4 = (Class282_Sub38) this.aClass465_5668.method7754((long) i_1);
			return class282_sub38_4 == null ? i_2 : class282_sub38_4.anInt8002;
		}
	}

	void method7964(RsByteBuffer rsbytebuffer_1, byte b_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7965(rsbytebuffer_1, i_3, -421182854);
		}
	}

	void method7965(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		int i_4;
		int i_5;
		int i_6;
		int i_7;
		if (i_2 == 1) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.aByteArray5636 = new byte[i_4];
			this.anIntArrayArray5637 = new int[i_4][];

			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aByteArray5636[i_5] = rsbytebuffer_1.readByte();
				i_6 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArrayArray5637[i_5] = new int[i_6];

				for (i_7 = 0; i_7 < i_6; i_7++) {
					this.anIntArrayArray5637[i_5][i_7] = rsbytebuffer_1.readBigSmart();
				}
			}
		} else if (i_2 == 2) {
			this.aString5638 = rsbytebuffer_1.readString();
		} else if (i_2 == 14) {
			this.anInt5648 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 15) {
			this.anInt5649 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 17) {
			this.clipType = 0;
			this.projectileClipped = false;
		} else if (i_2 == 18) {
			this.projectileClipped = false;
		} else if (i_2 == 19) {
			this.anInt5652 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 21) {
			this.aByte5697 = 1;
		} else if (i_2 == 22) {
			this.aBool5655 = true;
		} else if (i_2 == 23) {
			this.anInt5656 = 1;
		} else if (i_2 == 24) {
			i_4 = rsbytebuffer_1.readBigSmart();
			if (i_4 != -1) {
				this.anIntArray5659 = new int[] { i_4 };
			}
		} else if (i_2 == 27) {
			this.clipType = 1;
		} else if (i_2 == 28) {
			this.anInt5661 = rsbytebuffer_1.readUnsignedByte() << 2;
		} else if (i_2 == 29) {
			this.anInt5692 = rsbytebuffer_1.readByte();
		} else if (i_2 == 39) {
			this.anInt5663 = rsbytebuffer_1.readByte() * 5;
		} else if (i_2 >= 30 && i_2 < 35) {
			this.options[i_2 - 30] = rsbytebuffer_1.readString();
		} else if (i_2 == 40) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.aShortArray5645 = new short[i_4];
			this.aShortArray5640 = new short[i_4];

			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aShortArray5645[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
				this.aShortArray5640[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
			}
		} else if (i_2 == 41) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.aShortArray5680 = new short[i_4];
			this.aShortArray5643 = new short[i_4];

			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aShortArray5680[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
				this.aShortArray5643[i_5] = (short) rsbytebuffer_1.readUnsignedShort();
			}
		} else if (i_2 == 42) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.aByteArray5641 = new byte[i_4];

			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aByteArray5641[i_5] = rsbytebuffer_1.readByte();
			}
		} else if (i_2 == 62) {
			this.aBool5674 = true;
		} else if (i_2 == 64) {
			this.aBool5657 = false;
		} else if (i_2 == 65) {
			this.anInt5676 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 66) {
			this.anInt5639 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 67) {
			this.anInt5678 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 69) {
			rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 70) {
			this.anInt5679 = rsbytebuffer_1.readShort(1685514622) << 2;
		} else if (i_2 == 71) {
			this.anInt5635 = rsbytebuffer_1.readShort(1579109585) << 2;
		} else if (i_2 == 72) {
			this.anInt5681 = rsbytebuffer_1.readShort(1620608715) << 2;
		} else if (i_2 == 73) {
			this.aBool5685 = true;
		} else if (i_2 == 74) {
			this.ignoreClipOnAlternativeRoute = true;
		} else if (i_2 == 75) {
			this.anInt5687 = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 != 77 && i_2 != 92) {
			if (i_2 == 78) {
				this.anInt5653 = rsbytebuffer_1.readUnsignedShort();
				this.anInt5693 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 79) {
				this.anInt5667 = rsbytebuffer_1.readUnsignedShort();
				this.anInt5698 = rsbytebuffer_1.readUnsignedShort();
				this.anInt5693 = rsbytebuffer_1.readUnsignedByte();
				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray5688 = new int[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray5688[i_5] = rsbytebuffer_1.readUnsignedShort();
				}
			} else if (i_2 == 81) {
				this.aByte5697 = 2;
				this.anInt5654 = rsbytebuffer_1.readUnsignedByte() * 256;
			} else if (i_2 == 82) {
				this.aBool5701 = true;
			} else if (i_2 == 88) {
				this.aBool5703 = false;
			} else if (i_2 == 89) {
				this.aBool5702 = false;
			} else if (i_2 == 91) {
				this.aBool5660 = true;
			} else if (i_2 == 93) {
				this.aByte5697 = 3;
				this.anInt5654 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 94) {
				this.aByte5697 = 4;
			} else if (i_2 == 95) {
				this.aByte5697 = 5;
				this.anInt5654 = rsbytebuffer_1.readShort(1937595123);
			} else if (i_2 == 97) {
				this.aBool5671 = true;
			} else if (i_2 == 98) {
				this.aBool5706 = true;
			} else if (i_2 == 99) {
				this.anInt5705 = rsbytebuffer_1.readUnsignedByte();
				this.anInt5665 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 100) {
				this.anInt5670 = rsbytebuffer_1.readUnsignedByte();
				this.anInt5666 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 101) {
				this.anInt5672 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 102) {
				this.anInt5689 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 103) {
				this.anInt5656 = 0;
			} else if (i_2 == 104) {
				this.anInt5695 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 105) {
				this.aBool5673 = true;
			} else if (i_2 == 106) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				i_5 = 0;
				this.anIntArray5659 = new int[i_4];
				this.anIntArray5675 = new int[i_4];

				for (i_6 = 0; i_6 < i_4; i_6++) {
					this.anIntArray5659[i_6] = rsbytebuffer_1.readBigSmart();
					i_5 += this.anIntArray5675[i_6] = rsbytebuffer_1.readUnsignedByte();
				}

				for (i_6 = 0; i_6 < i_4; i_6++) {
					this.anIntArray5675[i_6] = this.anIntArray5675[i_6] * 65535 / i_5;
				}
			} else if (i_2 == 107) {
				this.anInt5669 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 >= 150 && i_2 < 155) {
				this.options[i_2 - 150] = rsbytebuffer_1.readString();
				if (!this.loader.showOptions) {
					this.options[i_2 - 150] = null;
				}
			} else if (i_2 == 160) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray5707 = new int[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray5707[i_5] = rsbytebuffer_1.readUnsignedShort();
				}
			} else if (i_2 == 162) {
				this.aByte5697 = 3;
				this.anInt5654 = rsbytebuffer_1.readInt();
			} else if (i_2 == 163) {
				this.aByte5644 = rsbytebuffer_1.readByte();
				this.aByte5642 = rsbytebuffer_1.readByte();
				this.aByte5646 = rsbytebuffer_1.readByte();
				this.aByte5634 = rsbytebuffer_1.readByte();
			} else if (i_2 == 164) {
				this.anInt5682 = rsbytebuffer_1.readShort(1834354367);
			} else if (i_2 == 165) {
				this.anInt5683 = rsbytebuffer_1.readShort(1806623177);
			} else if (i_2 == 166) {
				this.anInt5710 = rsbytebuffer_1.readShort(2108159773);
			} else if (i_2 == 167) {
				this.anInt5704 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 168) {
				this.aBool5696 = true;
			} else if (i_2 == 169) {
				this.aBool5700 = true;
			} else if (i_2 == 170) {
				this.anInt5684 = rsbytebuffer_1.readUnsignedSmart(1632519186);
			} else if (i_2 == 171) {
				this.anInt5658 = rsbytebuffer_1.readUnsignedSmart(1916118902);
			} else if (i_2 == 173) {
				this.anInt5708 = rsbytebuffer_1.readUnsignedShort();
				this.anInt5709 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 177) {
				this.aBool5699 = true;
			} else if (i_2 == 178) {
				this.anInt5694 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 189) {
				this.aBool5711 = true;
			} else if (i_2 == 249) {
				i_4 = rsbytebuffer_1.readUnsignedByte();
				if (this.aClass465_5668 == null) {
					i_5 = Class323.nextPowerOfTwo(i_4, -1920576994);
					this.aClass465_5668 = new IterableNodeMap(i_5);
				}

				for (i_5 = 0; i_5 < i_4; i_5++) {
					boolean bool_9 = rsbytebuffer_1.readUnsignedByte() == 1;
					i_7 = rsbytebuffer_1.read24BitUnsignedInteger();
					Object obj_8;
					if (bool_9) {
						obj_8 = new Class282_Sub47(rsbytebuffer_1.readString());
					} else {
						obj_8 = new Class282_Sub38(rsbytebuffer_1.readInt());
					}

					this.aClass465_5668.method7765((Node) obj_8, (long) i_7);
				}
			}
		} else {
			this.anInt5690 = rsbytebuffer_1.readUnsignedShort();
			if (this.anInt5690 == 65535) {
				this.anInt5690 = -1;
			}

			this.anInt5662 = rsbytebuffer_1.readUnsignedShort();
			if (this.anInt5662 == 65535) {
				this.anInt5662 = -1;
			}

			i_4 = -1;
			if (i_2 == 92) {
				i_4 = rsbytebuffer_1.readBigSmart();
			}

			i_5 = rsbytebuffer_1.readUnsignedByte();
			this.anIntArray5650 = new int[i_5 + 2];

			for (i_6 = 0; i_6 <= i_5; i_6++) {
				this.anIntArray5650[i_6] = rsbytebuffer_1.readBigSmart();
			}

			this.anIntArray5650[i_5 + 1] = i_4;
		}

	}

	void method7966(int i_1) {
		if (this.anInt5652 == -1) {
			this.anInt5652 = 0;
			if (this.aByteArray5636 != null && this.aByteArray5636.length == 1 && this.aByteArray5636[0] == SceneObjectType.SCENERY_INTERACT.type) {
				this.anInt5652 = 1;
			}

			for (int i_2 = 0; i_2 < 5; i_2++) {
				if (this.options[i_2] != null) {
					this.anInt5652 = 1;
					break;
				}
			}
		}

		if (this.anInt5687 == -1) {
			this.anInt5687 = this.clipType != 0 ? 1 : 0;
		}

		if (this.method7967((byte) 39) || this.aBool5706 || this.anIntArray5650 != null) {
			this.aBool5699 = true;
		}

	}

	public boolean method7967(byte b_1) {
		return this.anIntArray5659 != null;
	}

	public final boolean method7968(int i_1) {
		if (this.anIntArrayArray5637 == null) {
			return true;
		} else {
			boolean bool_2 = true;
			Index index_3 = this.loader.meshIndex;
			synchronized (this.loader.meshIndex) {
				for (int i_4 = 0; i_4 < this.anIntArrayArray5637.length; i_4++) {
					for (int i_5 = 0; i_5 < this.anIntArrayArray5637[i_4].length; i_5++) {
						bool_2 &= this.loader.meshIndex.load(this.anIntArrayArray5637[i_4][i_5], 0);
					}
				}

				return bool_2;
			}
		}
	}

	MeshRasterizer method7971(GraphicalRenderer class505, int i, int i_35_, int i_36_, Class476 class476, int i_37_) {
		int i_38_ = 64 + ((ObjectDefinitions) this).anInt5692;
		int i_39_ = 850 + ((ObjectDefinitions) this).anInt5663;
		int i_40_ = i;
		boolean bool = aBool5674 || i_35_ == (SceneObjectType.WALL_WHOLE_CORNER.type) && i_36_ > 3;
		if (bool)
			i |= 0x10;
		if (0 == i_36_) {
			if (128 != ((ObjectDefinitions) this).anInt5676 || 0 != ((ObjectDefinitions) this).anInt5679)
				i |= 0x1;
			if (128 != ((ObjectDefinitions) this).anInt5678 || ((ObjectDefinitions) this).anInt5681 != 0)
				i |= 0x4;
		} else
			i |= 0xd;
		if (((ObjectDefinitions) this).anInt5639 != 128 || ((ObjectDefinitions) this).anInt5635 != 0)
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
				long l = (long) (class505.rendererId);
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
					class528 = class505.createMeshRasterizer(class157, i_45_, (((ObjectIndexLoader) (((ObjectDefinitions) this).loader)).anInt5617), i_38_, i_39_);
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
		if (SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type == i_35_ && i_36_ > 3) {
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
		if (((ObjectDefinitions) this).anInt5676 != 128 || 128 != ((ObjectDefinitions) this).anInt5639 || 128 != ((ObjectDefinitions) this).anInt5678)
			class528_48_.oa(((ObjectDefinitions) this).anInt5676, ((ObjectDefinitions) this).anInt5639, ((ObjectDefinitions) this).anInt5678);
		if (((ObjectDefinitions) this).anInt5679 != 0 || ((ObjectDefinitions) this).anInt5635 != 0 || ((ObjectDefinitions) this).anInt5681 != 0)
			class528_48_.ia(((ObjectDefinitions) this).anInt5679, ((ObjectDefinitions) this).anInt5635, ((ObjectDefinitions) this).anInt5681);
		class528_48_.KA(i_40_);
		return class528_48_;
	}

	public String method7973(int i_1, String string_2, byte b_3) {
		if (this.aClass465_5668 == null) {
			return string_2;
		} else {
			Class282_Sub47 class282_sub47_4 = (Class282_Sub47) this.aClass465_5668.method7754((long) i_1);
			return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
		}
	}

	public boolean method7974(int i_1) {
		if (this.anIntArray5650 == null) {
			return this.anInt5653 != -1 || this.anIntArray5688 != null;
		} else {
			for (int i_2 = 0; i_2 < this.anIntArray5650.length; i_2++) {
				if (this.anIntArray5650[i_2] != -1) {
					ObjectDefinitions objectdefinitions_3 = this.loader.getObjectDefinitions(this.anIntArray5650[i_2], 65280);
					if (objectdefinitions_3.anInt5653 != -1 || objectdefinitions_3.anIntArray5688 != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public boolean method7976(short s_1) {
		return this.anIntArray5659 != null && this.anIntArray5659.length > 1;
	}

	public int method7977(byte b_1) {
		if (this.anIntArray5659 != null) {
			if (this.anIntArray5659.length <= 1) {
				return this.anIntArray5659[0];
			}

			int i_2 = (int) (Math.random() * 65535.0D);

			for (int i_3 = 0; i_3 < this.anIntArray5659.length; i_3++) {
				if (i_2 <= this.anIntArray5675[i_3]) {
					return this.anIntArray5659[i_3];
				}

				i_2 -= this.anIntArray5675[i_3];
			}
		}

		return -1;
	}

	public boolean method7979(int i_1, int i_2) {
		if (this.anIntArray5659 != null && i_1 != -1) {
			for (int i_3 = 0; i_3 < this.anIntArray5659.length; i_3++) {
				if (this.anIntArray5659[i_3] == i_1) {
					return true;
				}
			}
		}

		return false;
	}

	public final boolean method7987(int i_1, int i_2) {
		if (this.anIntArrayArray5637 == null) {
			return true;
		} else {
			boolean bool_3 = true;
			Index index_4 = this.loader.meshIndex;
			synchronized (this.loader.meshIndex) {
				for (int i_5 = 0; i_5 < this.aByteArray5636.length; i_5++) {
					if (this.aByteArray5636[i_5] == i_1) {
						for (int i_6 = 0; i_6 < this.anIntArrayArray5637[i_5].length; i_6++) {
							if (!this.loader.meshIndex.load(this.anIntArrayArray5637[i_5][i_6], 0)) {
								bool_3 = false;
							}
						}
					}
				}

				return bool_3;
			}
		}
	}

	public int[] method8008(int i_1) {
		return this.anIntArray5659;
	}

	public final synchronized Class452 method8010(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, Class390 class390_5, Class390 class390_6, int i_7, int i_8, int i_9, boolean bool_10, Class476 class476_11, int i_12) {
		if (Class485.method8201(i_3, -159499065)) {
			i_3 = SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type;
		}

		long long_13 = (long) ((i_3 << 3) + i_4 + (this.id << 10));
		long_13 |= (long) (graphicalrenderer_1.rendererId << 29);
		if (class476_11 != null) {
			long_13 |= class476_11.aLong5627 << 32;
		}

		int i_15 = i_2;
		if (this.aByte5697 == 3) {
			i_15 = i_2 | 0x7;
		} else {
			if (this.aByte5697 != 0 || this.anInt5683 != 0) {
				i_15 = i_2 | 0x2;
			}

			if (this.anInt5682 != 0) {
				i_15 |= 0x1;
			}

			if (this.anInt5710 != 0) {
				i_15 |= 0x4;
			}
		}

		if (bool_10) {
			i_15 |= 0x40000;
		}

		SoftCache softcache_17 = this.loader.aClass229_5615;
		Class452 class452_16;
		synchronized (this.loader.aClass229_5615) {
			class452_16 = (Class452) this.loader.aClass229_5615.get(long_13);
		}

		MeshRasterizer meshrasterizer_24 = (MeshRasterizer) (class452_16 != null ? class452_16.anObject5443 : null);
		Class282_Sub50_Sub17 class282_sub50_sub17_18 = null;
		if (meshrasterizer_24 != null && graphicalrenderer_1.method8452(meshrasterizer_24.m(), i_15) == 0) {
			class282_sub50_sub17_18 = (Class282_Sub50_Sub17) class452_16.anObject5444;
			if (bool_10 && class282_sub50_sub17_18 == null) {
				class282_sub50_sub17_18 = (Class282_Sub50_Sub17) (class452_16.anObject5444 = meshrasterizer_24.ga((Class282_Sub50_Sub17) null));
			}
		} else {
			if (meshrasterizer_24 != null) {
				i_15 = graphicalrenderer_1.method8546(i_15, meshrasterizer_24.m());
			}

			int i_19 = i_15;
			if (i_3 == SceneObjectType.SCENERY_INTERACT.type && i_4 > 3) {
				i_19 = i_15 | 0x5;
			}

			meshrasterizer_24 = this.method7971(graphicalrenderer_1, i_19, i_3, i_4, class476_11, 1453950061);
			if (meshrasterizer_24 == null) {
				return null;
			}

			if (i_3 == SceneObjectType.SCENERY_INTERACT.type && i_4 > 3) {
				meshrasterizer_24.f(2048);
			}

			if (bool_10) {
				class282_sub50_sub17_18 = meshrasterizer_24.ga((Class282_Sub50_Sub17) null);
			}

			meshrasterizer_24.KA(i_15);
			class452_16 = new Class452(meshrasterizer_24, class282_sub50_sub17_18);
			SoftCache softcache_20 = this.loader.aClass229_5615;
			synchronized (this.loader.aClass229_5615) {
				this.loader.aClass229_5615.put(class452_16, long_13);
			}
		}

		boolean bool_25 = this.aByte5697 != 0 && (class390_5 != null || class390_6 != null);
		boolean bool_21 = this.anInt5682 != 0 || this.anInt5683 != 0 || this.anInt5710 != 0;
		if (!bool_25 && !bool_21) {
			meshrasterizer_24 = meshrasterizer_24.method11289((byte) 0, i_2, true);
		} else {
			meshrasterizer_24 = meshrasterizer_24.method11289((byte) 0, i_15, true);
			if (bool_25 && this.anInt5654 < 16384) {
				meshrasterizer_24.pa(this.aByte5697, this.anInt5654, class390_5, class390_6, i_7, i_8, i_9);
			}

			if (bool_21) {
				meshrasterizer_24.ia(this.anInt5682, this.anInt5683, this.anInt5710);
			}

			meshrasterizer_24.KA(i_2);
		}

		this.loader.aClass452_5620.anObject5443 = meshrasterizer_24;
		this.loader.aClass452_5620.anObject5444 = class282_sub50_sub17_18;
		return this.loader.aClass452_5620;
	}

	public final synchronized MeshRasterizer method8012(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, Class390 class390_5, Class390 class390_6, int i_7, int i_8, int i_9, Animation animation_10, Class476 class476_11, int i_12) {
		if (Class485.method8201(i_3, -159499065)) {
			i_3 = SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type;
		}

		long long_13 = (long) ((i_3 << 3) + i_4 + (this.id << 10));
		long_13 |= (long) (graphicalrenderer_1.rendererId << 29);
		if (class476_11 != null) {
			long_13 |= class476_11.aLong5627 << 32;
		}

		if (animation_10 != null) {
			i_2 |= animation_10.method7640(-967753514);
		}

		if (this.aByte5697 == 3) {
			i_2 |= 0x7;
		} else {
			if (this.aByte5697 != 0 || this.anInt5683 != 0) {
				i_2 |= 0x2;
			}

			if (this.anInt5682 != 0) {
				i_2 |= 0x1;
			}

			if (this.anInt5710 != 0) {
				i_2 |= 0x4;
			}
		}

		if (i_3 == SceneObjectType.SCENERY_INTERACT.type && i_4 > 3) {
			i_2 |= 0x5;
		}

		SoftCache softcache_17 = this.loader.aClass229_5619;
		MeshRasterizer meshrasterizer_16;
		synchronized (this.loader.aClass229_5619) {
			meshrasterizer_16 = (MeshRasterizer) this.loader.aClass229_5619.get(long_13);
		}

		if (meshrasterizer_16 == null || graphicalrenderer_1.method8452(meshrasterizer_16.m(), i_2) != 0) {
			if (meshrasterizer_16 != null) {
				i_2 = graphicalrenderer_1.method8546(i_2, meshrasterizer_16.m());
			}

			meshrasterizer_16 = this.method7971(graphicalrenderer_1, i_2, i_3, i_4, class476_11, 991974728);
			if (meshrasterizer_16 == null) {
				return null;
			}

			softcache_17 = this.loader.aClass229_5619;
			synchronized (this.loader.aClass229_5619) {
				this.loader.aClass229_5619.put(meshrasterizer_16, long_13);
			}
		}

		boolean bool_18 = false;
		if (animation_10 != null) {
			meshrasterizer_16 = meshrasterizer_16.method11289((byte) 1, i_2, true);
			bool_18 = true;
			animation_10.method7577(meshrasterizer_16, i_4 & 0x3, 16711935);
		}

		if (i_3 == SceneObjectType.SCENERY_INTERACT.type && i_4 > 3) {
			if (!bool_18) {
				meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
				bool_18 = true;
			}

			meshrasterizer_16.f(2048);
		}

		if (this.aByte5697 != 0) {
			if (!bool_18) {
				meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
				bool_18 = true;
			}

			meshrasterizer_16.pa(this.aByte5697, this.anInt5654, class390_5, class390_6, i_7, i_8, i_9);
		}

		if (this.anInt5682 != 0 || this.anInt5683 != 0 || this.anInt5710 != 0) {
			if (!bool_18) {
				meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
				bool_18 = true;
			}

			meshrasterizer_16.ia(this.anInt5682, this.anInt5683, this.anInt5710);
		}

		if (bool_18) {
			meshrasterizer_16.KA(i_2);
		}

		return meshrasterizer_16;
	}

	public final ObjectDefinitions method8013(Interface42 interface42_1, byte b_2) {
		int i_3 = -1;
		if (this.anInt5690 != -1) {
			i_3 = interface42_1.method241(this.anInt5690, 1655583167);
		} else if (this.anInt5662 != -1) {
			i_3 = interface42_1.method240(this.anInt5662, 426606861);
		}

		if (i_3 >= 0 && i_3 < this.anIntArray5650.length - 1 && this.anIntArray5650[i_3] != -1) {
			return this.loader.getObjectDefinitions(this.anIntArray5650[i_3], 65280);
		} else {
			int i_4 = this.anIntArray5650[this.anIntArray5650.length - 1];
			return i_4 != -1 ? this.loader.getObjectDefinitions(i_4, 65280) : null;
		}
	}

	static final void method8018(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 74);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		ItemDefinitions.method7142(icomponentdefinitions_3, interface_4, cs2executor_0, -1447710686);
	}

	static final void method8019(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.anInt7434 != 0 && i_2 < client.anInt7373) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = client.aClass10Array7456[i_2].aString115;
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
		}

	}

	public static void method8020(int i_0) {
		MeshModifier.method7042((byte) 2);
		Class282_Sub20_Sub36.method15420((byte) -32);
		Class282_Sub20_Sub24.method15391(792930354);
		Class335.method5961(1418471735);
	}

	static final void method8021(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class96_Sub10.method14603(5, i_2 << 16 | i_3, i_4, "", (byte) 110);
	}

	static Class282_Sub50_Sub12 method8022(int i_0) {
		Class282_Sub50_Sub12 class282_sub50_sub12_1 = (Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass477_9666.method7941((byte) 4);
		if (class282_sub50_sub12_1 != null) {
			class282_sub50_sub12_1.remove();
			class282_sub50_sub12_1.method13452();
			return class282_sub50_sub12_1;
		} else {
			do {
				class282_sub50_sub12_1 = (Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass477_9655.method7941((byte) 4);
				if (class282_sub50_sub12_1 == null) {
					return null;
				}

				if (class282_sub50_sub12_1.method14955(31148025) > Class169.method2869(1956971878)) {
					return null;
				}

				class282_sub50_sub12_1.remove();
				class282_sub50_sub12_1.method13452();
			} while ((class282_sub50_sub12_1.key & ~0x7fffffffffffffffL) == 0L);

			return class282_sub50_sub12_1;
		}
	}

	static byte[] method8023(File file_0, int i_1, byte b_2) {
		try {
			byte[] bytes_4 = new byte[i_1];
			Class353.method6208(file_0, bytes_4, i_1, 108704305);
			return bytes_4;
		} catch (IOException ioexception_5) {
			return null;
		}
	}

}
