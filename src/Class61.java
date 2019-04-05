public class Class61 {

	long aLong631;

	public static NativeSprite aClass160_647;

	public int anInt635 = -1;

	public int anInt636 = -1;

	public int anInt641;

	long[] aLongArray638;

	public String[] aStringArray617;

	IterableNodeMap aClass465_629;

	int[] anIntArray621;

	public int anInt632;

	int anInt637 = 0;

	public String aString622 = null;

	int anInt623 = 0;

	long[] aLongArray630;

	public String[] aStringArray639;

	public byte[] aByteArray640;

	int[] anIntArray633;

	public int[] anIntArray634;

	boolean aBool618;

	boolean aBool620;

	public boolean aBool624;

	public byte aByte619;

	public byte aByte626;

	public byte aByte627;

	public byte aByte628;

	public int method1197(String string_1) {
		if (string_1 != null && string_1.length() != 0) {
			for (int i_3 = 0; i_3 < this.anInt632; i_3++) {
				if (this.aStringArray639[i_3].equals(string_1)) {
					return i_3;
				}
			}
			return -1;
		} else {
			return -1;
		}
	}

	public int method1198(int i_1, int i_2, int i_3) {
		int i_5 = i_3 == 31 ? -1 : (1 << i_3 + 1) - 1;
		return (this.anIntArray633[i_1] & i_5) >>> i_2;
	}

	public Integer method1199(int i_1) {
		if (this.aClass465_629 == null) {
			return null;
		} else {
			Node node_3 = this.aClass465_629.get((long) i_1);
			return node_3 != null && node_3 instanceof Class282_Sub38 ? new Integer(((Class282_Sub38) node_3).anInt8002) : null;
		}
	}

	public Long method1201(int i_1) {
		if (this.aClass465_629 == null) {
			return null;
		} else {
			Node node_3 = this.aClass465_629.get((long) i_1);
			return node_3 != null && node_3 instanceof Class282_Sub45 ? new Long(((Class282_Sub45) node_3).aLong8066) : null;
		}
	}

	public String method1202(int i_1) {
		if (this.aClass465_629 == null) {
			return null;
		} else {
			Node node_3 = this.aClass465_629.get((long) i_1);
			return node_3 != null && node_3 instanceof Class282_Sub47 ? (String) ((Class282_Sub47) node_3).anObject8068 : null;
		}
	}

	void method1206(int i_1) {
		if (this.anInt632 == 0) {
			this.anInt635 = -1;
			this.anInt636 = -1;
		} else {
			this.anInt635 = -1;
			this.anInt636 = -1;
			int i_2 = 0;
			byte b_3 = this.aByteArray640[0];
			for (int i_4 = 1; i_4 < this.anInt632; i_4++) {
				if (this.aByteArray640[i_4] > b_3) {
					if (b_3 == 125) {
						this.anInt636 = i_2;
					}
					i_2 = i_4;
					b_3 = this.aByteArray640[i_4];
				} else if (this.anInt636 == -1 && this.aByteArray640[i_4] == 125) {
					this.anInt636 = i_4;
				}
			}
			this.anInt635 = i_2;
			if (this.anInt635 != -1) {
				this.aByteArray640[this.anInt635] = 126;
			}
		}
	}

	void method1207(long long_1, String string_3, int i_4) {
		if (string_3 != null && string_3.length() == 0) {
			string_3 = null;
		}
		if (this.aBool618 != long_1 > 0L) {
			throw new RuntimeException("");
		} else if (string_3 != null != this.aBool620) {
			throw new RuntimeException("");
		} else {
			if (long_1 > 0L && (this.aLongArray638 == null || this.anInt641 >= this.aLongArray638.length) || string_3 != null && (this.aStringArray617 == null || this.anInt641 >= this.aStringArray617.length)) {
				this.method1211(this.anInt641 + 5);
			}
			if (this.aLongArray638 != null) {
				this.aLongArray638[this.anInt641] = long_1;
			}
			if (this.aStringArray617 != null) {
				this.aStringArray617[this.anInt641] = string_3;
			}
			++this.anInt641;
		}
	}

	void method1208(int i_1, int i_2) {
		--this.anInt641;
		if (this.anInt641 == 0) {
			this.aLongArray638 = null;
			this.aStringArray617 = null;
		} else {
			if (this.aLongArray638 != null) {
				Class503.method8351(this.aLongArray638, i_1 + 1, this.aLongArray638, i_1, this.anInt641 - i_1);
			}
			if (this.aStringArray617 != null) {
				Class503.method8359(this.aStringArray617, i_1 + 1, this.aStringArray617, i_1, this.anInt641 - i_1);
			}
		}
	}

	int method1209(int i_1, byte b_2, int i_3) {
		if (b_2 != 126 && b_2 != 127) {
			if (this.anInt635 == i_1 && (this.anInt636 == -1 || this.aByteArray640[this.anInt636] < 125)) {
				return -1;
			} else if (this.aByteArray640[i_1] == b_2) {
				return -1;
			} else {
				this.aByteArray640[i_1] = b_2;
				this.method1206(1779625886);
				return i_1;
			}
		} else {
			return -1;
		}
	}

	int method1210(int i_1, int i_2, int i_3, int i_4, byte b_5) {
		int i_6 = (1 << i_3) - 1;
		int i_7 = i_4 == 31 ? -1 : (1 << i_4 + 1) - 1;
		int i_8 = i_7 ^ i_6;
		i_2 <<= i_3;
		i_2 &= i_8;
		int i_9 = this.anIntArray633[i_1];
		if ((i_9 & i_8) == i_2) {
			return -1;
		} else {
			i_9 &= ~i_8;
			this.anIntArray633[i_1] = i_9 | i_2;
			return i_1;
		}
	}

	void method1211(int i_1) {
		if (this.aBool618) {
			if (this.aLongArray638 != null) {
				Class503.method8351(this.aLongArray638, 0, this.aLongArray638 = new long[i_1], 0, this.anInt641);
			} else {
				this.aLongArray638 = new long[i_1];
			}
		}
		if (this.aBool620) {
			if (this.aStringArray617 != null) {
				Class503.method8359(this.aStringArray617, 0, this.aStringArray617 = new String[i_1], 0, this.anInt641);
			} else {
				this.aStringArray617 = new String[i_1];
			}
		}
	}

	boolean method1212(int i_1, int i_2, int i_3, int i_4, byte b_5) {
		int i_6 = (1 << i_3) - 1;
		int i_7 = i_4 == 31 ? -1 : (1 << i_4 + 1) - 1;
		int i_8 = i_7 ^ i_6;
		i_2 <<= i_3;
		i_2 &= i_8;
		if (this.aClass465_629 != null) {
			Node node_9 = this.aClass465_629.get((long) i_1);
			if (node_9 != null) {
				if (node_9 instanceof Class282_Sub38) {
					Class282_Sub38 class282_sub38_10 = (Class282_Sub38) node_9;
					if ((class282_sub38_10.anInt8002 & i_8) == i_2) {
						return false;
					}
					class282_sub38_10.anInt8002 &= ~i_8;
					class282_sub38_10.anInt8002 |= i_2;
					return true;
				}
				node_9.remove();
			}
		} else {
			this.aClass465_629 = new IterableNodeMap(4);
		}
		this.aClass465_629.put(new Class282_Sub38(i_2), (long) i_1);
		return true;
	}

	boolean method1213(int i_1, long long_2) {
		if (this.aClass465_629 != null) {
			Node node_4 = this.aClass465_629.get((long) i_1);
			if (node_4 != null) {
				if (node_4 instanceof Class282_Sub45) {
					Class282_Sub45 class282_sub45_5 = (Class282_Sub45) node_4;
					if (class282_sub45_5.aLong8066 == long_2) {
						return false;
					}
					class282_sub45_5.aLong8066 = long_2;
					return true;
				}
				node_4.remove();
			}
		} else {
			this.aClass465_629 = new IterableNodeMap(4);
		}
		this.aClass465_629.put(new Class282_Sub45(long_2), (long) i_1);
		return true;
	}

	public int[] method1215() {
		if (this.anIntArray621 == null) {
			String[] arr_2 = new String[this.anInt632];
			this.anIntArray621 = new int[this.anInt632];
			for (int i_3 = 0; i_3 < this.anInt632; this.anIntArray621[i_3] = i_3++) {
				arr_2[i_3] = this.aStringArray639[i_3];
			}
			Class111.method1865(arr_2, this.anIntArray621, 415358781);
		}
		return this.anIntArray621;
	}

	void method1216(long long_1, String string_3, int i_4, byte b_5) {
		if (string_3 != null && string_3.length() == 0) {
			string_3 = null;
		}
		if (long_1 > 0L != this.aBool618) {
			throw new RuntimeException("");
		} else if (this.aBool620 != (string_3 != null)) {
			throw new RuntimeException("");
		} else {
			if (long_1 > 0L && (this.aLongArray630 == null || this.anInt632 >= this.aLongArray630.length) || string_3 != null && (this.aStringArray639 == null || this.anInt632 >= this.aStringArray639.length)) {
				this.method1232(this.anInt632 + 5);
			}
			if (this.aLongArray630 != null) {
				this.aLongArray630[this.anInt632] = long_1;
			}
			if (this.aStringArray639 != null) {
				this.aStringArray639[this.anInt632] = string_3;
			}
			if (this.anInt635 == -1) {
				this.anInt635 = this.anInt632;
				this.aByteArray640[this.anInt632] = 126;
			} else {
				this.aByteArray640[this.anInt632] = 0;
			}
			this.anIntArray633[this.anInt632] = 0;
			this.anIntArray634[this.anInt632] = i_4;
			++this.anInt632;
			this.anIntArray621 = null;
		}
	}

	public Class61(RsByteBuffer rsbytebuffer_1) {
		this.method1234(rsbytebuffer_1);
	}

	boolean method1222(int i_1, int i_2, int i_3) {
		if (this.aClass465_629 != null) {
			Node node_4 = this.aClass465_629.get((long) i_1);
			if (node_4 != null) {
				if (node_4 instanceof Class282_Sub38) {
					Class282_Sub38 class282_sub38_5 = (Class282_Sub38) node_4;
					if (i_2 == class282_sub38_5.anInt8002) {
						return false;
					}
					class282_sub38_5.anInt8002 = i_2;
					return true;
				}
				node_4.remove();
			}
		} else {
			this.aClass465_629 = new IterableNodeMap(4);
		}
		this.aClass465_629.put(new Class282_Sub38(i_2), (long) i_1);
		return true;
	}

	boolean method1224(int i_1, String string_2, byte b_3) {
		if (string_2 == null) {
			string_2 = "";
		} else if (string_2.length() > 80) {
			string_2 = string_2.substring(0, 80);
		}
		if (this.aClass465_629 != null) {
			Node node_4 = this.aClass465_629.get((long) i_1);
			if (node_4 != null) {
				if (node_4 instanceof Class282_Sub47) {
					Class282_Sub47 class282_sub47_5 = (Class282_Sub47) node_4;
					if (class282_sub47_5.anObject8068 instanceof String) {
						if (string_2.equals(class282_sub47_5.anObject8068)) {
							return false;
						}
						class282_sub47_5.remove();
						class282_sub47_5.remove();
						this.aClass465_629.put(new Class282_Sub47(string_2), class282_sub47_5.data);
						return true;
					}
				}
				node_4.remove();
			}
		} else {
			this.aClass465_629 = new IterableNodeMap(4);
		}
		this.aClass465_629.put(new Class282_Sub47(string_2), (long) i_1);
		return true;
	}

	public Integer method1225(int i_1, int i_2, int i_3) {
		if (this.aClass465_629 == null) {
			return null;
		} else {
			Node node_5 = this.aClass465_629.get((long) i_1);
			if (node_5 != null && node_5 instanceof Class282_Sub38) {
				int i_6 = i_3 == 31 ? -1 : (1 << i_3 + 1) - 1;
				return new Integer((((Class282_Sub38) node_5).anInt8002 & i_6) >>> i_2);
			} else {
				return null;
			}
		}
	}

	void method1232(int i_1) {
		if (this.aBool618) {
			if (this.aLongArray630 != null) {
				Class503.method8351(this.aLongArray630, 0, this.aLongArray630 = new long[i_1], 0, this.anInt632);
			} else {
				this.aLongArray630 = new long[i_1];
			}
		}
		if (this.aBool620) {
			if (this.aStringArray639 != null) {
				Class503.method8359(this.aStringArray639, 0, this.aStringArray639 = new String[i_1], 0, this.anInt632);
			} else {
				this.aStringArray639 = new String[i_1];
			}
		}
		if (this.aByteArray640 != null) {
			Class503.method8352(this.aByteArray640, 0, this.aByteArray640 = new byte[i_1], 0, this.anInt632);
		} else {
			this.aByteArray640 = new byte[i_1];
		}
		if (this.anIntArray633 != null) {
			Class503.method8362(this.anIntArray633, 0, this.anIntArray633 = new int[i_1], 0, this.anInt632);
		} else {
			this.anIntArray633 = new int[i_1];
		}
		if (this.anIntArray634 != null) {
			Class503.method8362(this.anIntArray634, 0, this.anIntArray634 = new int[i_1], 0, this.anInt632);
		} else {
			this.anIntArray634 = new int[i_1];
		}
	}

	void method1233(int i_1, int i_2) {
		if (i_1 >= 0 && i_1 < this.anInt632) {
			--this.anInt632;
			this.anIntArray621 = null;
			if (this.anInt632 == 0) {
				this.aLongArray630 = null;
				this.aStringArray639 = null;
				this.aByteArray640 = null;
				this.anIntArray633 = null;
				this.anIntArray634 = null;
				this.anInt635 = -1;
				this.anInt636 = -1;
			} else {
				Class503.method8352(this.aByteArray640, i_1 + 1, this.aByteArray640, i_1, this.anInt632 - i_1);
				Class503.method8362(this.anIntArray633, i_1 + 1, this.anIntArray633, i_1, this.anInt632 - i_1);
				Class503.method8362(this.anIntArray634, i_1 + 1, this.anIntArray634, i_1, this.anInt632 - i_1);
				if (this.aLongArray630 != null) {
					Class503.method8351(this.aLongArray630, i_1 + 1, this.aLongArray630, i_1, this.anInt632 - i_1);
				}
				if (this.aStringArray639 != null) {
					Class503.method8359(this.aStringArray639, i_1 + 1, this.aStringArray639, i_1, this.anInt632 - i_1);
				}
				if (this.anInt635 == i_1 || this.anInt636 == i_1) {
					this.method1206(-561191659);
				}
			}
		} else {
			throw new RuntimeException("");
		}
	}

	void method1234(RsByteBuffer rsbytebuffer_1) {
		int i_3 = rsbytebuffer_1.readUnsignedByte();
		if (i_3 >= 1 && i_3 <= 5) {
			int i_4 = rsbytebuffer_1.readUnsignedByte();
			if ((i_4 & 0x1) != 0) {
				this.aBool618 = true;
			}
			if ((i_4 & 0x2) != 0) {
				this.aBool620 = true;
			}
			if (!this.aBool618) {
				this.aLongArray630 = null;
				this.aLongArray638 = null;
			}
			if (!this.aBool620) {
				this.aStringArray639 = null;
				this.aStringArray617 = null;
			}
			this.anInt637 = rsbytebuffer_1.readInt();
			this.anInt623 = rsbytebuffer_1.readInt();
			if (i_3 <= 3 && this.anInt623 != 0) {
				this.anInt623 += 16912800;
			}
			this.anInt632 = rsbytebuffer_1.readUnsignedShort();
			this.anInt641 = rsbytebuffer_1.readUnsignedByte();
			this.aString622 = rsbytebuffer_1.readString();
			if (i_3 >= 4) {
				rsbytebuffer_1.readInt();
			}
			this.aBool624 = rsbytebuffer_1.readUnsignedByte() == 1;
			this.aByte619 = rsbytebuffer_1.readByte();
			this.aByte626 = rsbytebuffer_1.readByte();
			this.aByte627 = rsbytebuffer_1.readByte();
			this.aByte628 = rsbytebuffer_1.readByte();
			int i_5;
			if (this.anInt632 > 0) {
				if (this.aBool618 && (this.aLongArray630 == null || this.aLongArray630.length < this.anInt632)) {
					this.aLongArray630 = new long[this.anInt632];
				}
				if (this.aBool620 && (this.aStringArray639 == null || this.aStringArray639.length < this.anInt632)) {
					this.aStringArray639 = new String[this.anInt632];
				}
				if (this.aByteArray640 == null || this.aByteArray640.length < this.anInt632) {
					this.aByteArray640 = new byte[this.anInt632];
				}
				if (this.anIntArray633 == null || this.anIntArray633.length < this.anInt632) {
					this.anIntArray633 = new int[this.anInt632];
				}
				if (this.anIntArray634 == null || this.anIntArray634.length < this.anInt632) {
					this.anIntArray634 = new int[this.anInt632];
				}
				for (i_5 = 0; i_5 < this.anInt632; i_5++) {
					if (this.aBool618) {
						this.aLongArray630[i_5] = rsbytebuffer_1.readLong();
					}
					if (this.aBool620) {
						this.aStringArray639[i_5] = rsbytebuffer_1.readNullString();
					}
					this.aByteArray640[i_5] = rsbytebuffer_1.readByte();
					if (i_3 >= 2) {
						this.anIntArray633[i_5] = rsbytebuffer_1.readInt();
					}
					if (i_3 >= 5) {
						this.anIntArray634[i_5] = rsbytebuffer_1.readUnsignedShort();
					} else {
						this.anIntArray634[i_5] = 0;
					}
				}
				this.method1206(-931317286);
			}
			if (this.anInt641 > 0) {
				if (this.aBool618 && (this.aLongArray638 == null || this.aLongArray638.length < this.anInt641)) {
					this.aLongArray638 = new long[this.anInt641];
				}
				if (this.aBool620 && (this.aStringArray617 == null || this.aStringArray617.length < this.anInt641)) {
					this.aStringArray617 = new String[this.anInt641];
				}
				for (i_5 = 0; i_5 < this.anInt641; i_5++) {
					if (this.aBool618) {
						this.aLongArray638[i_5] = rsbytebuffer_1.readLong();
					}
					if (this.aBool620) {
						this.aStringArray617[i_5] = rsbytebuffer_1.readNullString();
					}
				}
			}
			if (i_3 >= 3) {
				i_5 = rsbytebuffer_1.readUnsignedShort();
				if (i_5 > 0) {
					this.aClass465_629 = new IterableNodeMap(i_5 < 16 ? ImageIndexLoader.nextPowerOfTwo(i_5, 1744507894) : 16);
					while (i_5-- > 0) {
						int i_6 = rsbytebuffer_1.readInt();
						int i_7 = i_6 & 0x3fffffff;
						int i_8 = i_6 >>> 30;
						if (i_8 == 0) {
							int i_9 = rsbytebuffer_1.readInt();
							this.aClass465_629.put(new Class282_Sub38(i_9), (long) i_7);
						} else if (i_8 == 1) {
							long long_11 = rsbytebuffer_1.readLong();
							this.aClass465_629.put(new Class282_Sub45(long_11), (long) i_7);
						} else if (i_8 == 2) {
							String string_13 = rsbytebuffer_1.readString();
							this.aClass465_629.put(new Class282_Sub47(string_13), (long) i_7);
						}
					}
				}
			}
		} else {
			throw new RuntimeException("" + i_3);
		}
	}
}
