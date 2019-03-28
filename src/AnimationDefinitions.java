public class AnimationDefinitions {

	AnimationIndexLoader animationIndexLoader;
	public int anInt5909;
	public static int anInt5930;
	public static boolean aBool5925 = false;
	public int[] frameDurations;
	public int loopDelay = -1;
	public boolean[] aBoolArray5915;
	public int[] frames;
	public int priority = 5;
	public int leftHandItem = -1;
	public int rightHandItem = -1;
	public int maxLoops = 99;
	public int animatingPrecedence = -1;
	public int walkingPrecedence = -1;
	public int replayMode = 2;
	public int[] anIntArray5911;
	public int[][] anIntArrayArray5913;
	public boolean aBool5923 = false;
	public boolean tweened = false;
	public boolean aBool5928 = false;
	public int[] anIntArray5926;
	public int[] anIntArray5927;
	public int[] anIntArray5919;
	IterableNodeMap aClass465_5910;

	public String method11129(int i_1, String string_2) {
		if (this.aClass465_5910 == null) {
			return string_2;
		} else {
			Class282_Sub47 class282_sub47_4 = (Class282_Sub47) this.aClass465_5910.get((long) i_1);
			return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
		}
	}

	void method11130(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method11131(rsbytebuffer_1, i_3);
		}
	}

	void method11131(RsByteBuffer rsbytebuffer_1, int i_2) {
		int i_4;
		int i_5;
		if (i_2 == 1) {
			i_4 = rsbytebuffer_1.readUnsignedShort();
			this.frameDurations = new int[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.frameDurations[i_5] = rsbytebuffer_1.readUnsignedShort();
			}
			this.frames = new int[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.frames[i_5] = rsbytebuffer_1.readUnsignedShort();
			}
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.frames[i_5] += rsbytebuffer_1.readUnsignedShort() << 16;
			}
		} else if (i_2 == 2) {
			this.loopDelay = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 3) {
			this.aBoolArray5915 = new boolean[256];
			i_4 = rsbytebuffer_1.readUnsignedByte();
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aBoolArray5915[rsbytebuffer_1.readUnsignedByte()] = true;
			}
		} else if (i_2 == 5) {
			this.priority = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 6) {
			this.leftHandItem = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 7) {
			this.rightHandItem = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 8) {
			this.maxLoops = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 9) {
			this.animatingPrecedence = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 10) {
			this.walkingPrecedence = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 11) {
			this.replayMode = rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 12) {
			i_4 = rsbytebuffer_1.readUnsignedByte();
			this.anIntArray5911 = new int[i_4];
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.anIntArray5911[i_5] = rsbytebuffer_1.readUnsignedShort();
			}
			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.anIntArray5911[i_5] += rsbytebuffer_1.readUnsignedShort() << 16;
			}
		} else {
			int i_7;
			if (i_2 == 13) {
				i_4 = rsbytebuffer_1.readUnsignedShort();
				this.anIntArrayArray5913 = new int[i_4][];
				for (i_5 = 0; i_5 < i_4; i_5++) {
					int children = rsbytebuffer_1.readUnsignedByte();
					if (children > 0) {
						this.anIntArrayArray5913[i_5] = new int[children];
						this.anIntArrayArray5913[i_5][0] = rsbytebuffer_1.read24BitUnsignedInteger();
						for (i_7 = 1; i_7 < children; i_7++) {
							this.anIntArrayArray5913[i_5][i_7] = rsbytebuffer_1.readUnsignedShort();
						}
					}
				}
			} else if (i_2 == 14) {
				this.aBool5923 = true;
			} else if (i_2 == 15) {
				this.tweened = true;
			} else if (i_2 != 16) {
				if (i_2 == 18) {
					this.aBool5928 = true;
				} else if (i_2 == 19) {
					if (this.anIntArray5926 == null) {
						this.anIntArray5926 = new int[this.anIntArrayArray5913.length];
						for (i_4 = 0; i_4 < this.anIntArrayArray5913.length; i_4++) {
							this.anIntArray5926[i_4] = 255;
						}
					}
					this.anIntArray5926[rsbytebuffer_1.readUnsignedByte()] = rsbytebuffer_1.readUnsignedByte();
				} else if (i_2 == 20) {
					if (this.anIntArray5927 == null || this.anIntArray5919 == null) {
						this.anIntArray5927 = new int[this.anIntArrayArray5913.length];
						this.anIntArray5919 = new int[this.anIntArrayArray5913.length];
						for (i_4 = 0; i_4 < this.anIntArrayArray5913.length; i_4++) {
							this.anIntArray5927[i_4] = 256;
							this.anIntArray5919[i_4] = 256;
						}
					}
					i_4 = rsbytebuffer_1.readUnsignedByte();
					this.anIntArray5927[i_4] = rsbytebuffer_1.readUnsignedShort();
					this.anIntArray5919[i_4] = rsbytebuffer_1.readUnsignedShort();
				} else if (i_2 == 249) {
					i_4 = rsbytebuffer_1.readUnsignedByte();
					if (this.aClass465_5910 == null) {
						i_5 = Texture.nextPowerOfTwo(i_4, 1720003752);
						this.aClass465_5910 = new IterableNodeMap(i_5);
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
						this.aClass465_5910.put((Node) obj_8, (long) i_7);
					}
				}
			}
		}
	}

	public boolean ready() {
		if (this.frames == null) {
			return true;
		} else {
			boolean bool_1 = true;
			int[] ints_2 = this.frames;
			for (int i_3 = 0; i_3 < ints_2.length; i_3++) {
				int i_4 = ints_2[i_3];
				if (this.animationIndexLoader.getAnimationFrame(i_4 >>> 16) == null) {
					bool_1 = false;
				}
			}
			return bool_1;
		}
	}

	public int method11133(int i_1, int i_2) {
		if (this.aClass465_5910 == null) {
			return i_2;
		} else {
			Class282_Sub38 class282_sub38_4 = (Class282_Sub38) this.aClass465_5910.get((long) i_1);
			return class282_sub38_4 == null ? i_2 : class282_sub38_4.anInt8002;
		}
	}

	void method11143() {
		if (this.animatingPrecedence == -1) {
			if (this.aBoolArray5915 != null) {
				this.animatingPrecedence = 2;
			} else {
				this.animatingPrecedence = 0;
			}
		}
		if (this.walkingPrecedence == -1) {
			if (this.aBoolArray5915 != null) {
				this.walkingPrecedence = 2;
			} else {
				this.walkingPrecedence = 0;
			}
		}
	}

	public static final void method11148(Class521_Sub1 class521_sub1_0, int i_1, int i_2) {
		Class8_Sub3.method14336(class521_sub1_0, i_1, true, 1386523975);
	}
}
