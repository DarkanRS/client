public class Animation {

	AnimationDefinitions defs;

	boolean aBool5462 = false;

	boolean aBool5463 = false;

	int speed;

	int anInt5459;

	int anInt5460;

	int anInt5466;

	int anInt5457;

	int anInt5461 = 0;

	boolean aBool5456 = false;

	Class462 aClass462_5464;

	Class462 aClass462_5467;

	final boolean method7562(int i_1) {
		if (this.defs != null) {
			boolean bool_2 = this.aClass462_5464.method7707(NamedFileReference.aClass523_411, this.defs, this.anInt5460, this.anInt5466, this.defs.frames, -514647052);
			if (bool_2 && this.aBool5463 && this.defs.anIntArray5911 != null) {
				this.aClass462_5467.method7707(NamedFileReference.aClass523_411, this.defs, this.anInt5460, this.anInt5466, this.defs.anIntArray5911, -1635915089);
			}
			return bool_2;
		} else {
			return false;
		}
	}

	public final void method7563(Animation animation_1, int i_2) {
		this.defs = animation_1.defs;
		this.aBool5462 = animation_1.aBool5462;
		this.aBool5463 = animation_1.aBool5463;
		this.speed = animation_1.speed;
		this.anInt5459 = animation_1.anInt5459;
		this.anInt5460 = animation_1.anInt5460;
		this.anInt5466 = animation_1.anInt5466;
		this.anInt5457 = animation_1.anInt5457;
		this.method7588((byte) 78);
	}

	public final boolean hasDefs() {
		return this.defs != null;
	}

	public final AnimationDefinitions getDefs() {
		return this.defs;
	}

	public final void method7567(int i_1, short s_2) {
		this.method7571(i_1, 0, 0, false, -629553578);
	}

	public final void method7569(int i_1, boolean bool_2, int i_3) {
		this.method7571(i_1, 0, 0, bool_2, -731012703);
	}

	public final void method7570(int i_1, boolean bool_2, boolean bool_3, int i_4) {
		this.method7572(i_1, 0, 0, bool_2, bool_3, (byte) 104);
	}

	public final void method7571(int i_1, int i_2, int i_3, boolean bool_4, int i_5) {
		this.method7572(i_1, i_2, i_3, bool_4, false, (byte) 62);
	}

	final void method7572(int i_1, int i_2, int i_3, boolean bool_4, boolean bool_5, byte b_6) {
		if (i_1 != this.method7597(-1779648283)) {
			if (i_1 == -1) {
				this.defs = null;
			} else {
				if (this.defs != null && this.defs.anInt5909 == i_1) {
					if (this.defs.replayMode == 0) {
						return;
					}
				} else {
					this.defs = NamedFileReference.aClass523_411.getAnimDefs(i_1, (byte) 11);
				}
				this.anInt5459 = 0;
				this.speed = i_2;
				this.anInt5461 = i_3;
				this.aBool5456 = bool_5;
				if (bool_4) {
					this.anInt5460 = (int) (Math.random() * (double) this.defs.frames.length);
					this.anInt5457 = (int) (Math.random() * (double) this.defs.frameDurations[this.anInt5460]);
				} else {
					this.anInt5460 = 0;
					this.anInt5457 = 0;
				}
				this.anInt5466 = this.anInt5460 + 1;
				if (this.anInt5466 < 0 || this.anInt5466 >= this.defs.frames.length) {
					this.anInt5466 = -1;
				}
				if (this.speed == 0) {
					this.method7586(this.defs, this.anInt5460, 395624971);
				}
				this.aBool5462 = false;
			}
			this.method7588((byte) 42);
		}
	}

	public final boolean hasSpeed(int i_1) {
		return this.speed != 0;
	}

	public final int getSpeed() {
		return this.speed;
	}

	public final void setSpeed(int i_1) {
		this.speed = i_1;
	}

	public final void rasterize(MeshRasterizer meshrasterizer_1, int i_2, int i_3) {
		if (this.defs != null && this.defs.frames != null && this.method7562(2049608469)) {
			meshrasterizer_1.method11262(this.aClass462_5464.aClass282_Sub50_Sub13_5545, this.aClass462_5464.anInt5542, this.aClass462_5464.aClass282_Sub50_Sub13_5546, this.aClass462_5464.anInt5547, this.anInt5457, this.defs.frameDurations[this.anInt5460], i_2, this.defs.aBool5923);
			if (this.aBool5463 && this.defs.anIntArray5911 != null && this.aClass462_5467.aBool5544) {
				meshrasterizer_1.method11262(this.aClass462_5467.aClass282_Sub50_Sub13_5545, this.aClass462_5467.anInt5542, this.aClass462_5467.aClass282_Sub50_Sub13_5546, this.aClass462_5467.anInt5547, this.anInt5457, this.defs.frameDurations[this.anInt5460], i_2, this.defs.aBool5923);
			}
		}
	}

	public final void method7578(MeshRasterizer meshrasterizer_1, int i_2, int i_3, int i_4) {
		if (this.defs.frames != null && this.method7562(1399567490)) {
			meshrasterizer_1.method11258(this.aClass462_5464.aClass282_Sub50_Sub13_5545, this.aClass462_5464.anInt5542, this.aClass462_5464.aClass282_Sub50_Sub13_5546, this.aClass462_5464.anInt5547, this.anInt5457, this.defs.frameDurations[this.anInt5460], i_2, i_3, this.defs.aBool5923, (int[]) null);
			if (this.aBool5463 && this.defs.anIntArray5911 != null && this.aClass462_5467.aBool5544) {
				meshrasterizer_1.method11258(this.aClass462_5467.aClass282_Sub50_Sub13_5545, this.aClass462_5467.anInt5542, this.aClass462_5467.aClass282_Sub50_Sub13_5546, this.aClass462_5467.anInt5547, this.anInt5457, this.defs.frameDurations[this.anInt5460], i_2, i_3, this.defs.aBool5923, (int[]) null);
			}
		}
	}

	public final void method7579(MeshRasterizer meshrasterizer_1, int i_2) {
		if (this.defs.frames != null && this.method7562(1730078988)) {
			meshrasterizer_1.method11284(this.aClass462_5464.aClass282_Sub50_Sub13_5545, this.aClass462_5464.anInt5542);
			if (this.aBool5463 && this.defs.anIntArray5911 != null && this.aClass462_5467.aBool5544) {
				meshrasterizer_1.method11284(this.aClass462_5467.aClass282_Sub50_Sub13_5545, this.aClass462_5467.anInt5542);
			}
		}
	}

	public final boolean method7580(int i_1) {
		return this.aBool5462;
	}

	public final void method7582(byte b_1) {
		this.method7583(0, (byte) 0);
	}

	public final void method7583(int i_1, byte b_2) {
		this.anInt5460 = 0;
		this.anInt5466 = this.defs.frames.length > 1 ? 1 : -1;
		this.anInt5457 = 0;
		this.aBool5462 = false;
		this.speed = i_1;
		this.anInt5459 = 0;
		if (this.defs != null & this.defs.frames != null) {
			this.method7586(this.defs, this.anInt5460, -722856799);
			this.method7588((byte) 59);
		}
	}

	public final void method7584(int i_1) {
		this.anInt5459 = 0;
	}

	public final boolean method7585(int i_1, int i_2) {
		return this.defs == null | (i_1 -= this.speed) <= 0 ? false : this.defs.tweened | this.anInt5457 + i_1 > this.defs.frameDurations[this.anInt5460];
	}

	void method7586(AnimationDefinitions animationdefinitions_1, int i_2, int i_3) {
	}

	final void method7588(byte b_1) {
		this.aClass462_5464.method7708(13720241);
		if (this.aBool5463) {
			this.aClass462_5467.method7708(13720241);
		}
	}

	public final int method7597(int i_1) {
		return this.defs != null ? this.defs.anInt5909 : -1;
	}

	Animation(boolean bool_1) {
		this.aBool5463 = bool_1;
		this.aClass462_5464 = new Class462();
		if (this.aBool5463) {
			this.aClass462_5467 = new Class462();
		} else {
			this.aClass462_5467 = null;
		}
	}

	public final void method7615(int i_1, int i_2, int i_3) {
		this.method7571(i_1, i_2, 0, false, 1549105687);
	}

	public final boolean method7627(int i_1, int i_2) {
		if (this.defs != null && i_1 != 0) {
			if (this.speed > 0) {
				if (this.speed >= i_1) {
					this.speed -= i_1;
					return false;
				}
				i_1 -= this.speed;
				this.speed = 0;
				this.method7586(this.defs, this.anInt5460, 61864237);
			}
			i_1 += this.anInt5457;
			boolean bool_3 = this.defs.tweened | AnimationDefinitions.aBool5925;
			if (i_1 > 100 && this.defs.loopDelay > 0) {
				int i_4;
				for (i_4 = this.defs.frames.length - this.defs.loopDelay; this.anInt5460 < i_4 && i_1 > this.defs.frameDurations[this.anInt5460]; this.anInt5460++) {
					i_1 -= this.defs.frameDurations[this.anInt5460];
				}
				if (this.anInt5460 >= i_4) {
					int i_5 = 0;
					for (int i_6 = i_4; i_6 < this.defs.frames.length; i_6++) {
						i_5 += this.defs.frameDurations[i_6];
					}
					if (this.anInt5461 == 0) {
						this.anInt5459 += i_1 / i_5;
					}
					i_1 %= i_5;
				}
				this.anInt5466 = this.anInt5460 + 1;
				if (this.anInt5466 >= this.defs.frames.length) {
					if (this.defs.loopDelay == -1 && this.aBool5456) {
						this.anInt5466 = 0;
					} else {
						this.anInt5466 -= this.defs.loopDelay;
					}
					if (this.anInt5466 < 0 || this.anInt5466 >= this.defs.frames.length) {
						this.anInt5466 = -1;
					}
				}
				bool_3 = true;
			}
			while (i_1 > this.defs.frameDurations[this.anInt5460]) {
				bool_3 = true;
				i_1 -= this.defs.frameDurations[++this.anInt5460 - 1];
				if (this.anInt5460 >= this.defs.frames.length) {
					if (this.defs.loopDelay != -1 && this.anInt5461 != 2) {
						this.anInt5460 -= this.defs.loopDelay;
						if (this.anInt5461 == 0) {
							++this.anInt5459;
						}
					}
					if (this.anInt5459 >= this.defs.maxLoops || this.anInt5460 < 0 || this.anInt5460 >= this.defs.frames.length) {
						this.aBool5462 = true;
						break;
					}
				}
				this.method7586(this.defs, this.anInt5460, -469139589);
				this.anInt5466 = this.anInt5460 + 1;
				if (this.anInt5466 >= this.defs.frames.length) {
					if (this.defs.loopDelay == -1 && this.aBool5456) {
						this.anInt5466 = 0;
					} else {
						this.anInt5466 -= this.defs.loopDelay;
					}
					if (this.anInt5466 < 0 || this.anInt5466 >= this.defs.frames.length) {
						this.anInt5466 = -1;
					}
				}
			}
			this.anInt5457 = i_1;
			if (bool_3) {
				this.method7588((byte) 30);
			}
			return bool_3;
		} else {
			return false;
		}
	}

	public final int method7640(int i_1) {
		if (this.method7562(1825517174)) {
			int i_2 = 0;
			if (this.method7562(1608975787)) {
				i_2 |= this.aClass462_5464.anInt5543;
				if (this.aBool5463 && this.defs.anIntArray5911 != null) {
					i_2 |= this.aClass462_5467.anInt5543;
				}
			}
			return i_2;
		} else {
			return 0;
		}
	}

	static Class149_Sub1 method7644(RsByteBuffer rsbytebuffer_0, int i_1) {
		return new Class149_Sub1(rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.readShort(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.read24BitUnsignedInteger(), rsbytebuffer_0.readUnsignedByte());
	}
}
