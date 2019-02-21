/* Class456 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Animation {
	AnimationDefinitions defs;
	boolean aBool5456;
	int anInt5457;
	int speed;
	int anInt5459;
	int anInt5460;
	int anInt5461;
	boolean aBool5462 = false;
	boolean aBool5463 = false;
	Class462 aClass462_5464;
	int anInt5466;
	Class462 aClass462_5467;

	final boolean method7562(int i) {
		if (this.defs != null) {
			boolean bool = (this.aClass462_5464.method7707(NamedFileReference.aClass523_411, this.defs, this.anInt5460 * 643220577, 1844755981 * this.anInt5466, this.defs.skeletonIds, -514647052));
			if (bool && this.aBool5463 && this.defs.anIntArray5911 != null)
				this.aClass462_5467.method7707(NamedFileReference.aClass523_411, this.defs, 643220577 * this.anInt5460, this.anInt5466 * 1844755981, this.defs.anIntArray5911, -1635915089);
			return bool;
		}
		return false;
	}

	public final void method7563(Animation class456_0_, int i) {
		this.defs = ((Animation) class456_0_).defs;
		this.aBool5462 = ((Animation) class456_0_).aBool5462;
		this.aBool5463 = ((Animation) class456_0_).aBool5463;
		this.speed = 1 * ((Animation) class456_0_).speed;
		this.anInt5459 = ((Animation) class456_0_).anInt5459 * 1;
		this.anInt5460 = ((Animation) class456_0_).anInt5460 * 1;
		this.anInt5466 = ((Animation) class456_0_).anInt5466 * 1;
		this.anInt5457 = ((Animation) class456_0_).anInt5457 * 1;
		method7588((byte) 78);
	}

	public final boolean hasDefs() {
		return null != this.defs;
	}

	public final AnimationDefinitions getDefs() {
		return this.defs;
	}

	public final void method7567(int i, short i_1_) {
		method7571(i, 0, 0, false, -629553578);
	}

	public final void method7569(int i, boolean bool, int i_2_) {
		method7571(i, 0, 0, bool, -731012703);
	}

	public final void method7570(int i, boolean bool, boolean bool_3_, int i_4_) {
		method7572(i, 0, 0, bool, bool_3_, (byte) 104);
	}

	public final void method7571(int i, int i_5_, int i_6_, boolean bool, int i_7_) {
		method7572(i, i_5_, i_6_, bool, false, (byte) 62);
	}

	final void method7572(int animId, int speed, int i_9_, boolean bool, boolean bool_10_, byte i_11_) {
		if (animId != method7597(-1779648283)) {
			if (-1 != animId) {
				if (this.defs != null && (this.defs.anInt5909 * -2014062571) == animId) {
					if (0 == (this.defs.anInt5907 * 554947543))
						return;
				} else
					this.defs = NamedFileReference.aClass523_411.getAnimDefs(animId, (byte) 11);
				this.anInt5459 = 0;
				this.speed = speed * 333323387;
				this.anInt5461 = -1783646677 * i_9_;
				this.aBool5456 = bool_10_;
				if (bool) {
					this.anInt5460 = ((int) (Math.random() * (double) (this.defs.skeletonIds).length) * 723443617);
					this.anInt5457 = (int) (Math.random() * (double) (this.defs.animationStepLengths[(this.anInt5460 * 643220577)])) * 1755763003;
				} else {
					this.anInt5460 = 0;
					this.anInt5457 = 0;
				}
				this.anInt5466 = 1017168069 + 212721317 * this.anInt5460;
				if (this.anInt5466 * 1844755981 < 0 || (this.anInt5466 * 1844755981 >= (this.defs.skeletonIds).length))
					this.anInt5466 = -1017168069;
				if (1072784051 * this.speed == 0)
					method7586(this.defs, this.anInt5460 * 643220577, 395624971);
				this.aBool5462 = false;
			} else
				this.defs = null;
			method7588((byte) 42);
		}
	}

	public final boolean hasSpeed(int i) {
		return this.speed * 1072784051 != 0;
	}

	public final int getSpeed() {
		return this.speed * 1072784051;
	}

	public final void setSpeed(int i) {
		this.speed = 333323387 * i;
	}

	public final void method7577(MeshRasterizer class528, int i, int i_15_) {
		if (null != this.defs) {
			if (null != this.defs.skeletonIds && method7562(2049608469)) {
				class528.method11262((((Class462) this.aClass462_5464).aClass282_Sub50_Sub13_5545), (((Class462) this.aClass462_5464).anInt5542 * -104209121), (((Class462) this.aClass462_5464).aClass282_Sub50_Sub13_5546), (((Class462) this.aClass462_5464).anInt5547 * -775231561),
						-706748429 * this.anInt5457, (this.defs.animationStepLengths[this.anInt5460 * 643220577]), i, this.defs.aBool5923);
				if (this.aBool5463 && this.defs.anIntArray5911 != null && ((Class462) this.aClass462_5467).aBool5544)
					class528.method11262((((Class462) this.aClass462_5467).aClass282_Sub50_Sub13_5545), -104209121 * ((Class462) (this.aClass462_5467)).anInt5542, (((Class462) this.aClass462_5467).aClass282_Sub50_Sub13_5546), (((Class462) this.aClass462_5467).anInt5547) * -775231561,
							-706748429 * this.anInt5457, (this.defs.animationStepLengths[this.anInt5460 * 643220577]), i, this.defs.aBool5923);
			}
		}
	}

	public final void method7578(MeshRasterizer class528, int i, int i_16_, int i_17_) {
		if (null != this.defs.skeletonIds && method7562(1399567490)) {
			class528.method11258((((Class462) this.aClass462_5464).aClass282_Sub50_Sub13_5545), (-104209121 * ((Class462) this.aClass462_5464).anInt5542), (((Class462) this.aClass462_5464).aClass282_Sub50_Sub13_5546), (-775231561 * ((Class462) this.aClass462_5464).anInt5547),
					this.anInt5457 * -706748429, (this.defs.animationStepLengths[this.anInt5460 * 643220577]), i, i_16_, this.defs.aBool5923, null);
			if (this.aBool5463 && this.defs.anIntArray5911 != null && ((Class462) this.aClass462_5467).aBool5544)
				class528.method11258((((Class462) this.aClass462_5467).aClass282_Sub50_Sub13_5545), (((Class462) this.aClass462_5467).anInt5542 * -104209121), (((Class462) this.aClass462_5467).aClass282_Sub50_Sub13_5546), (((Class462) this.aClass462_5467).anInt5547 * -775231561),
						this.anInt5457 * -706748429, (this.defs.animationStepLengths[643220577 * this.anInt5460]), i, i_16_, this.defs.aBool5923, null);
		}
	}

	public final void method7579(MeshRasterizer class528, int i) {
		if (null != this.defs.skeletonIds && method7562(1730078988)) {
			class528.method11284((((Class462) this.aClass462_5464).aClass282_Sub50_Sub13_5545), (((Class462) this.aClass462_5464).anInt5542) * -104209121);
			if (this.aBool5463 && null != this.defs.anIntArray5911 && ((Class462) this.aClass462_5467).aBool5544)
				class528.method11284((((Class462) this.aClass462_5467).aClass282_Sub50_Sub13_5545), (((Class462) (this.aClass462_5467)).anInt5542 * -104209121));
		}
	}

	public final boolean method7580(int i) {
		return this.aBool5462;
	}

	public final void method7582(byte i) {
		method7583(0, (byte) 0);
	}

	public final void method7583(int i, byte i_18_) {
		this.anInt5460 = 0;
		this.anInt5466 = (1017168069 * (this.defs.skeletonIds.length > 1 ? 1 : -1));
		this.anInt5457 = 0;
		this.aBool5462 = false;
		this.speed = 333323387 * i;
		this.anInt5459 = 0;
		if (this.defs != null & this.defs.skeletonIds != null) {
			method7586(this.defs, 643220577 * this.anInt5460, -722856799);
			method7588((byte) 59);
		}
	}

	public final void method7584(int i) {
		this.anInt5459 = 0;
	}

	public final boolean method7585(int i, int i_19_) {
		if (this.defs == null | (i -= this.speed * 1072784051) <= 0)
			return false;
		return (this.defs.aBool5924 | (this.anInt5457 * -706748429 + i > (this.defs.animationStepLengths[this.anInt5460 * 643220577])));
	}

	void method7586(AnimationDefinitions class518, int i, int i_20_) {
		/* empty */
	}

	final void method7588(byte i) {
		this.aClass462_5464.method7708(13720241);
		if (this.aBool5463)
			this.aClass462_5467.method7708(13720241);
	}

	void method7590(AnimationDefinitions class518, int i) {
		/* empty */
	}

	void method7591(AnimationDefinitions class518, int i) {
		/* empty */
	}

	void method7592(AnimationDefinitions class518, int i) {
		/* empty */
	}

	void method7594(AnimationDefinitions class518, int i) {
		/* empty */
	}

	public final int method7597(int i) {
		return (null != this.defs ? -2014062571 * this.defs.anInt5909 : -1);
	}

	Animation(boolean bool) {
		this.anInt5461 = 0;
		this.aBool5456 = false;
		this.aBool5463 = bool;
		this.aClass462_5464 = new Class462();
		if (this.aBool5463)
			this.aClass462_5467 = new Class462();
		else
			this.aClass462_5467 = null;
	}

	public final void method7615(int i, int i_40_, int i_41_) {
		method7571(i, i_40_, 0, false, 1549105687);
	}

	void method7616(AnimationDefinitions class518, int i) {
		/* empty */
	}

	void method7626(AnimationDefinitions class518, int i) {
		/* empty */
	}

	public final boolean method7627(int i, int i_45_) {
		if (null == this.defs || 0 == i)
			return false;
		if (this.speed * 1072784051 > 0) {
			if (this.speed * 1072784051 >= i) {
				this.speed -= i * 333323387;
				return false;
			}
			i -= 1072784051 * this.speed;
			this.speed = 0;
			method7586(this.defs, this.anInt5460 * 643220577, 61864237);
		}
		i += this.anInt5457 * -706748429;
		boolean bool = this.defs.aBool5924 | AnimationDefinitions.aBool5925;
		if (i > 100 && -542281047 * this.defs.loopDelay > 0) {
			int i_46_;
			for (i_46_ = (this.defs.skeletonIds.length - (this.defs.loopDelay * -542281047)); (643220577 * this.anInt5460 < i_46_ && i > (this.defs.animationStepLengths[this.anInt5460 * 643220577])); this.anInt5460 += 723443617)
				i -= (this.defs.animationStepLengths[643220577 * this.anInt5460]);
			if (this.anInt5460 * 643220577 >= i_46_) {
				int i_47_ = 0;
				for (int i_48_ = i_46_; i_48_ < (this.defs.skeletonIds).length; i_48_++)
					i_47_ += (this.defs.animationStepLengths[i_48_]);
				if (this.anInt5461 * 619010179 == 0)
					this.anInt5459 += i / i_47_ * -1013682765;
				i %= i_47_;
			}
			this.anInt5466 = this.anInt5460 * 212721317 + 1017168069;
			if (1844755981 * this.anInt5466 >= this.defs.skeletonIds.length) {
				if (-1 == (this.defs.loopDelay * -542281047) && this.aBool5456)
					this.anInt5466 = 0;
				else
					this.anInt5466 -= (2081946637 * this.defs.loopDelay);
				if (this.anInt5466 * 1844755981 < 0 || (this.anInt5466 * 1844755981 >= (this.defs.skeletonIds).length))
					this.anInt5466 = -1017168069;
			}
			bool = true;
		}
		while (i > (this.defs.animationStepLengths[this.anInt5460 * 643220577])) {
			bool = true;
			i -= (this.defs.animationStepLengths[((this.anInt5460 += 723443617) * 643220577 - 1)]);
			if (643220577 * this.anInt5460 >= this.defs.skeletonIds.length) {
				if (-1 != (-542281047 * this.defs.loopDelay) && this.anInt5461 * 619010179 != 2) {
					this.anInt5460 -= (this.defs.loopDelay * -1782295735);
					if (0 == this.anInt5461 * 619010179)
						this.anInt5459 += -1013682765;
				}
				if ((this.anInt5459 * 1323043195 >= this.defs.anInt5929 * 820353795) || this.anInt5460 * 643220577 < 0 || (this.anInt5460 * 643220577 >= (this.defs.skeletonIds).length)) {
					this.aBool5462 = true;
					break;
				}
			}
			method7586(this.defs, 643220577 * this.anInt5460, -469139589);
			this.anInt5466 = 1017168069 + 212721317 * this.anInt5460;
			if (1844755981 * this.anInt5466 >= this.defs.skeletonIds.length) {
				if ((this.defs.loopDelay * -542281047 == -1) && this.aBool5456)
					this.anInt5466 = 0;
				else
					this.anInt5466 -= (this.defs.loopDelay * 2081946637);
				if (this.anInt5466 * 1844755981 < 0 || (this.anInt5466 * 1844755981 >= (this.defs.skeletonIds).length))
					this.anInt5466 = -1017168069;
			}
		}
		this.anInt5457 = i * 1755763003;
		if (bool)
			method7588((byte) 30);
		return bool;
	}

	public final int method7640(int i) {
		if (method7562(1825517174)) {
			int i_55_ = 0;
			if (method7562(1608975787)) {
				i_55_ |= -1154737479 * ((Class462) (this.aClass462_5464)).anInt5543;
				if (this.aBool5463 && this.defs.anIntArray5911 != null)
					i_55_ |= (((Class462) this.aClass462_5467).anInt5543) * -1154737479;
			}
			return i_55_;
		}
		return 0;
	}

	static final void method7643(CS2Executor class527, byte i) {
		int i_56_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_56_, (byte) 98);
		int i_57_ = -1;
		int i_58_ = -1;
		Class119 class119 = class118.method2046(Renderers.SOFTWARE_RENDERER, 1740359651);
		if (null != class119) {
			if (i >= -1)
				throw new IllegalStateException();
			i_57_ = -1125753931 * class119.anInt1458;
			i_58_ = class119.anInt1454 * 2069222845;
		}
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_57_;
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = i_58_;
	}

	static Class149_Sub1 method7644(RsByteBuffer class282_sub35, int i) {
		return new Class149_Sub1(class282_sub35.readShort(2106402099), class282_sub35.readShort(1584223282), class282_sub35.readShort(1636690940), class282_sub35.readShort(1585273759), class282_sub35.read24BitUnsignedInteger(), class282_sub35.read24BitUnsignedInteger(),
				class282_sub35.readUnsignedByte());
	}
}
