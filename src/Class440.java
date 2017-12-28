
/* Class440 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;

public class Class440 {
	long aLong5345;
	Class442 aClass442_5346;
	long aLong5347 = 1396005531026477427L;
	byte[] aByteArray5348;
	int anInt5349;
	byte[] aByteArray5350;
	long aLong5351;
	static final int anInt5352 = 200000000;
	long aLong5353;
	long aLong5354;
	long aLong5355;
	int anInt5356;
	public static int anInt5357;

	public long method7345(byte i) {
		return ((Class440) this).aLong5355 * 5884830328726448101L;
	}

	public void method7346(int i) throws IOException {
		method7353((byte) -31);
		((Class440) this).aClass442_5346.method7385((short) 14390);
	}

	public void method7347(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		((Class440) this).aLong5353 = l * -3918522232594780051L;
	}

	public void method7348(byte[] is, int i, int i_0_) throws IOException {
		do {
			try {
				if (((long) i_0_ + ((Class440) this).aLong5353 * 4332008180302731621L) > 5884830328726448101L * ((Class440) this).aLong5355)
					((Class440) this).aLong5355 = (5464637124759944685L * ((4332008180302731621L * ((Class440) this).aLong5353) + (long) i_0_));
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 < ((Class440) this).aLong5345 * -8810271642138189085L) || (((Class440) this).aLong5353 * 4332008180302731621L > ((long) (675653231 * ((Class440) this).anInt5356) + (-8810271642138189085L * ((Class440) this).aLong5345)))))
					method7353((byte) -52);
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 + (long) i_0_) > (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).aByteArray5348).length))) {
					int i_1_ = (int) ((long) ((Class440) this).aByteArray5348.length - ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)));
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)), i_1_);
					((Class440) this).aLong5353 += (long) i_1_ * -3918522232594780051L;
					i += i_1_;
					i_0_ -= i_1_;
					((Class440) this).anInt5356 = (((Class440) this).aByteArray5348.length * -1070827377);
					method7353((byte) -124);
				}
				if (i_0_ > ((Class440) this).aByteArray5348.length) {
					if (((Class440) this).aLong5353 * 4332008180302731621L != (-6865785746406801633L * ((Class440) this).aLong5351)) {
						((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5353 * 4332008180302731621L);
						((Class440) this).aLong5351 = (2552102053604559611L * ((Class440) this).aLong5353);
					}
					((Class440) this).aClass442_5346.method7386(is, i, i_0_, 407092563);
					((Class440) this).aLong5351 += 7563976524047531231L * (long) i_0_;
					if (((Class440) this).aLong5351 * -6865785746406801633L > ((Class440) this).aLong5354 * -4543589230655698933L)
						((Class440) this).aLong5354 = (((Class440) this).aLong5351 * -3131878899264188995L);
					long l = -1L;
					long l_2_ = -1L;
					if ((((Class440) this).aLong5353 * 4332008180302731621L >= (-4231644474770799547L * ((Class440) this).aLong5347)) && (((Class440) this).aLong5353 * 4332008180302731621L < ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (823847309 * ((Class440) this).anInt5349))))
						l = ((Class440) this).aLong5353 * 4332008180302731621L;
					else if (((-4231644474770799547L * ((Class440) this).aLong5347) >= (4332008180302731621L * ((Class440) this).aLong5353)) && ((((Class440) this).aLong5347 * -4231644474770799547L) < ((long) i_0_ + (4332008180302731621L * ((Class440) this).aLong5353))))
						l = (-4231644474770799547L * ((Class440) this).aLong5347);
					if ((((long) i_0_ + 4332008180302731621L * ((Class440) this).aLong5353) > -4231644474770799547L * ((Class440) this).aLong5347) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_0_) <= ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (((Class440) this).anInt5349 * 823847309))))
						l_2_ = (long) i_0_ + (4332008180302731621L * ((Class440) this).aLong5353);
					else if ((((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) > (4332008180302731621L * ((Class440) this).aLong5353)) && (((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) <= (((Class440) this).aLong5353 * 4332008180302731621L) + (long) i_0_))
						l_2_ = ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L));
					if (l > -1L && l_2_ > l) {
						int i_3_ = (int) (l_2_ - l);
						System.arraycopy(is, (int) (l + (long) i - (4332008180302731621L * (((Class440) this).aLong5353))), ((Class440) this).aByteArray5350, (int) (l - (((Class440) this).aLong5347 * -4231644474770799547L)), i_3_);
					}
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_0_;
				} else {
					if (i_0_ <= 0)
						break;
					if (((Class440) this).aLong5345 * -8810271642138189085L == -1L)
						((Class440) this).aLong5345 = (-8210221580261630697L * ((Class440) this).aLong5353);
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), i_0_);
					((Class440) this).aLong5353 += (long) i_0_ * -3918522232594780051L;
					if ((4332008180302731621L * ((Class440) this).aLong5353 - -8810271642138189085L * ((Class440) this).aLong5345) > (long) (((Class440) this).anInt5356 * 675653231))
						((Class440) this).anInt5356 = (-1070827377 * (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)));
				}
			} catch (IOException ioexception) {
				((Class440) this).aLong5351 = -7563976524047531231L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	public void method7349() throws IOException {
		method7353((byte) -84);
		((Class440) this).aClass442_5346.method7385((short) 18495);
	}

	public void method7350(byte[] is, int i, int i_4_, int i_5_) throws IOException {
		try {
			if (i_4_ + i > is.length)
				throw new ArrayIndexOutOfBoundsException(i_4_ + i - is.length);
			if (-1L != ((Class440) this).aLong5345 * -8810271642138189085L && (((Class440) this).aLong5353 * 4332008180302731621L >= -8810271642138189085L * ((Class440) this).aLong5345) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_4_) <= ((long) (675653231 * ((Class440) this).anInt5356) + (((Class440) this).aLong5345 * -8810271642138189085L)))) {
				System.arraycopy(((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), is, i, i_4_);
				((Class440) this).aLong5353 += (long) i_4_ * -3918522232594780051L;
				return;
			}
			long l = ((Class440) this).aLong5353 * 4332008180302731621L;
			int i_6_ = i;
			int i_7_ = i_4_;
			if ((4332008180302731621L * ((Class440) this).aLong5353 >= ((Class440) this).aLong5347 * -4231644474770799547L) && (((Class440) this).aLong5353 * 4332008180302731621L < ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L)))) {
				int i_8_ = (int) ((long) (((Class440) this).anInt5349 * 823847309) - ((((Class440) this).aLong5353 * 4332008180302731621L) - (-4231644474770799547L * ((Class440) this).aLong5347)));
				if (i_8_ > i_4_)
					i_8_ = i_4_;
				System.arraycopy(((Class440) this).aByteArray5350, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-4231644474770799547L * ((Class440) this).aLong5347)), is, i, i_8_);
				((Class440) this).aLong5353 += -3918522232594780051L * (long) i_8_;
				i += i_8_;
				i_4_ -= i_8_;
			}
			if (i_4_ > ((Class440) this).aByteArray5350.length) {
				((Class440) this).aClass442_5346.method7390(4332008180302731621L * ((Class440) this).aLong5353);
				((Class440) this).aLong5351 = ((Class440) this).aLong5353 * 2552102053604559611L;
				int i_9_;
				for (/**/; i_4_ > 0; i_4_ -= i_9_) {
					i_9_ = ((Class440) this).aClass442_5346.method7389(is, i, i_4_, (byte) -118);
					if (i_9_ == -1)
						break;
					((Class440) this).aLong5351 += (long) i_9_ * 7563976524047531231L;
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_9_;
					i += i_9_;
				}
			} else if (i_4_ > 0) {
				method7363(-1494569111);
				int i_10_ = i_4_;
				if (i_10_ > ((Class440) this).anInt5349 * 823847309)
					i_10_ = ((Class440) this).anInt5349 * 823847309;
				System.arraycopy(((Class440) this).aByteArray5350, 0, is, i, i_10_);
				i += i_10_;
				i_4_ -= i_10_;
				((Class440) this).aLong5353 += (long) i_10_ * -3918522232594780051L;
			}
			if (-1L != -8810271642138189085L * ((Class440) this).aLong5345) {
				if ((-8810271642138189085L * ((Class440) this).aLong5345 > 4332008180302731621L * ((Class440) this).aLong5353) && i_4_ > 0) {
					int i_11_ = i + (int) ((-8810271642138189085L * ((Class440) this).aLong5345) - (((Class440) this).aLong5353 * 4332008180302731621L));
					if (i_11_ > i + i_4_)
						i_11_ = i + i_4_;
					while (i < i_11_) {
						is[i++] = (byte) 0;
						i_4_--;
						((Class440) this).aLong5353 += -3918522232594780051L;
					}
				}
				long l_12_ = -1L;
				long l_13_ = -1L;
				if (((Class440) this).aLong5345 * -8810271642138189085L >= l && (-8810271642138189085L * ((Class440) this).aLong5345 < (long) i_7_ + l))
					l_12_ = ((Class440) this).aLong5345 * -8810271642138189085L;
				else if (l >= (-8810271642138189085L * ((Class440) this).aLong5345) && l < ((long) (((Class440) this).anInt5356 * 675653231) + (((Class440) this).aLong5345 * -8810271642138189085L)))
					l_12_ = l;
				if (((long) (675653231 * ((Class440) this).anInt5356) + ((Class440) this).aLong5345 * -8810271642138189085L) > l && (((long) (675653231 * ((Class440) this).anInt5356) + ((Class440) this).aLong5345 * -8810271642138189085L) <= (long) i_7_ + l))
					l_13_ = ((long) (((Class440) this).anInt5356 * 675653231) + (-8810271642138189085L * ((Class440) this).aLong5345));
				else if ((long) i_7_ + l > (-8810271642138189085L * ((Class440) this).aLong5345) && (l + (long) i_7_ <= ((-8810271642138189085L * ((Class440) this).aLong5345) + (long) (((Class440) this).anInt5356 * 675653231))))
					l_13_ = (long) i_7_ + l;
				if (l_12_ > -1L && l_13_ > l_12_) {
					int i_14_ = (int) (l_13_ - l_12_);
					System.arraycopy(((Class440) this).aByteArray5348, (int) (l_12_ - (-8810271642138189085L * ((Class440) this).aLong5345)), is, i_6_ + (int) (l_12_ - l), i_14_);
					if (l_13_ > ((Class440) this).aLong5353 * 4332008180302731621L) {
						i_4_ -= l_13_ - (4332008180302731621L * ((Class440) this).aLong5353);
						((Class440) this).aLong5353 = l_13_ * -3918522232594780051L;
					}
				}
			}
		} catch (IOException ioexception) {
			((Class440) this).aLong5351 = -7563976524047531231L;
			throw ioexception;
		}
		if (i_4_ > 0)
			throw new EOFException();
	}

	public void method7351(byte[] is, int i) throws IOException {
		method7350(is, 0, is.length, 79386718);
	}

	public void method7352(byte[] is, int i, int i_15_, int i_16_) throws IOException {
		do {
			try {
				if (((long) i_15_ + ((Class440) this).aLong5353 * 4332008180302731621L) > 5884830328726448101L * ((Class440) this).aLong5355)
					((Class440) this).aLong5355 = (5464637124759944685L * ((4332008180302731621L * ((Class440) this).aLong5353) + (long) i_15_));
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 < ((Class440) this).aLong5345 * -8810271642138189085L) || (((Class440) this).aLong5353 * 4332008180302731621L > ((long) (675653231 * ((Class440) this).anInt5356) + (-8810271642138189085L * ((Class440) this).aLong5345)))))
					method7353((byte) -17);
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 + (long) i_15_) > (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).aByteArray5348).length))) {
					int i_17_ = (int) ((long) ((Class440) this).aByteArray5348.length - ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)));
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)), i_17_);
					((Class440) this).aLong5353 += (long) i_17_ * -3918522232594780051L;
					i += i_17_;
					i_15_ -= i_17_;
					((Class440) this).anInt5356 = (((Class440) this).aByteArray5348.length * -1070827377);
					method7353((byte) -81);
				}
				if (i_15_ > ((Class440) this).aByteArray5348.length) {
					if (((Class440) this).aLong5353 * 4332008180302731621L != (-6865785746406801633L * ((Class440) this).aLong5351)) {
						((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5353 * 4332008180302731621L);
						((Class440) this).aLong5351 = (2552102053604559611L * ((Class440) this).aLong5353);
					}
					((Class440) this).aClass442_5346.method7386(is, i, i_15_, 402289131);
					((Class440) this).aLong5351 += 7563976524047531231L * (long) i_15_;
					if (((Class440) this).aLong5351 * -6865785746406801633L > ((Class440) this).aLong5354 * -4543589230655698933L)
						((Class440) this).aLong5354 = (((Class440) this).aLong5351 * -3131878899264188995L);
					long l = -1L;
					long l_18_ = -1L;
					if ((((Class440) this).aLong5353 * 4332008180302731621L >= (-4231644474770799547L * ((Class440) this).aLong5347)) && (((Class440) this).aLong5353 * 4332008180302731621L < ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (823847309 * ((Class440) this).anInt5349))))
						l = ((Class440) this).aLong5353 * 4332008180302731621L;
					else if (((-4231644474770799547L * ((Class440) this).aLong5347) >= (4332008180302731621L * ((Class440) this).aLong5353)) && ((((Class440) this).aLong5347 * -4231644474770799547L) < ((long) i_15_ + (4332008180302731621L * ((Class440) this).aLong5353))))
						l = (-4231644474770799547L * ((Class440) this).aLong5347);
					if ((((long) i_15_ + 4332008180302731621L * ((Class440) this).aLong5353) > -4231644474770799547L * ((Class440) this).aLong5347) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_15_) <= ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (((Class440) this).anInt5349 * 823847309))))
						l_18_ = (long) i_15_ + (4332008180302731621L * ((Class440) this).aLong5353);
					else if ((((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) > (4332008180302731621L * ((Class440) this).aLong5353)) && (((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) <= (((Class440) this).aLong5353 * 4332008180302731621L) + (long) i_15_))
						l_18_ = ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L));
					if (l > -1L && l_18_ > l) {
						int i_19_ = (int) (l_18_ - l);
						System.arraycopy(is, (int) (l + (long) i - (4332008180302731621L * (((Class440) this).aLong5353))), ((Class440) this).aByteArray5350, (int) (l - (((Class440) this).aLong5347 * -4231644474770799547L)), i_19_);
					}
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_15_;
				} else {
					if (i_15_ <= 0)
						break;
					if (((Class440) this).aLong5345 * -8810271642138189085L == -1L)
						((Class440) this).aLong5345 = (-8210221580261630697L * ((Class440) this).aLong5353);
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), i_15_);
					((Class440) this).aLong5353 += (long) i_15_ * -3918522232594780051L;
					if ((4332008180302731621L * ((Class440) this).aLong5353 - -8810271642138189085L * ((Class440) this).aLong5345) > (long) (((Class440) this).anInt5356 * 675653231))
						((Class440) this).anInt5356 = (-1070827377 * (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)));
				}
			} catch (IOException ioexception) {
				((Class440) this).aLong5351 = -7563976524047531231L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	void method7353(byte i) throws IOException {
		if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L) {
			if (-8810271642138189085L * ((Class440) this).aLong5345 != -6865785746406801633L * ((Class440) this).aLong5351) {
				((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5345 * -8810271642138189085L);
				((Class440) this).aLong5351 = 417574901068126141L * ((Class440) this).aLong5345;
			}
			((Class440) this).aClass442_5346.method7386(((Class440) this).aByteArray5348, 0, ((Class440) this).anInt5356 * 675653231, -1758103988);
			((Class440) this).aLong5351 += 369589281825423025L * (long) ((Class440) this).anInt5356;
			if (-6865785746406801633L * ((Class440) this).aLong5351 > ((Class440) this).aLong5354 * -4543589230655698933L)
				((Class440) this).aLong5354 = -3131878899264188995L * ((Class440) this).aLong5351;
			long l = -1L;
			long l_20_ = -1L;
			if ((-8810271642138189085L * ((Class440) this).aLong5345 >= -4231644474770799547L * ((Class440) this).aLong5347) && (-8810271642138189085L * ((Class440) this).aLong5345 < ((long) (823847309 * ((Class440) this).anInt5349) + -4231644474770799547L * ((Class440) this).aLong5347)))
				l = ((Class440) this).aLong5345 * -8810271642138189085L;
			else if ((-4231644474770799547L * ((Class440) this).aLong5347 >= -8810271642138189085L * ((Class440) this).aLong5345) && (((Class440) this).aLong5347 * -4231644474770799547L < (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).anInt5356 * 675653231))))
				l = ((Class440) this).aLong5347 * -4231644474770799547L;
			if ((((long) (((Class440) this).anInt5356 * 675653231) + -8810271642138189085L * ((Class440) this).aLong5345) > ((Class440) this).aLong5347 * -4231644474770799547L) && (((long) (((Class440) this).anInt5356 * 675653231) + -8810271642138189085L * ((Class440) this).aLong5345) <= ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L))))
				l_20_ = ((long) (675653231 * ((Class440) this).anInt5356) + -8810271642138189085L * ((Class440) this).aLong5345);
			else if (((((Class440) this).aLong5347 * -4231644474770799547L + (long) (823847309 * ((Class440) this).anInt5349)) > ((Class440) this).aLong5345 * -8810271642138189085L) && (((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L)) <= ((-8810271642138189085L * ((Class440) this).aLong5345) + (long) (((Class440) this).anInt5356 * 675653231))))
				l_20_ = (((Class440) this).aLong5347 * -4231644474770799547L + (long) (((Class440) this).anInt5349 * 823847309));
			if (l > -1L && l_20_ > l) {
				int i_21_ = (int) (l_20_ - l);
				System.arraycopy(((Class440) this).aByteArray5348, (int) (l - (-8810271642138189085L * ((Class440) this).aLong5345)), ((Class440) this).aByteArray5350, (int) (l - (-4231644474770799547L * ((Class440) this).aLong5347)), i_21_);
			}
			((Class440) this).aLong5345 = 5735142949487742261L;
			((Class440) this).anInt5356 = 0;
		}
	}

	public void method7354(byte[] is) throws IOException {
		method7350(is, 0, is.length, 736039187);
	}

	public void method7355() throws IOException {
		method7353((byte) -70);
		((Class440) this).aClass442_5346.method7385((short) 29284);
	}

	public void method7356(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		((Class440) this).aLong5353 = l * -3918522232594780051L;
	}

	public void method7357(byte[] is, int i, int i_22_) throws IOException {
		do {
			try {
				if (((long) i_22_ + ((Class440) this).aLong5353 * 4332008180302731621L) > 5884830328726448101L * ((Class440) this).aLong5355)
					((Class440) this).aLong5355 = (5464637124759944685L * ((4332008180302731621L * ((Class440) this).aLong5353) + (long) i_22_));
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 < ((Class440) this).aLong5345 * -8810271642138189085L) || (((Class440) this).aLong5353 * 4332008180302731621L > ((long) (675653231 * ((Class440) this).anInt5356) + (-8810271642138189085L * ((Class440) this).aLong5345)))))
					method7353((byte) -122);
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 + (long) i_22_) > (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).aByteArray5348).length))) {
					int i_23_ = (int) ((long) ((Class440) this).aByteArray5348.length - ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)));
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)), i_23_);
					((Class440) this).aLong5353 += (long) i_23_ * -3918522232594780051L;
					i += i_23_;
					i_22_ -= i_23_;
					((Class440) this).anInt5356 = (((Class440) this).aByteArray5348.length * -1070827377);
					method7353((byte) -35);
				}
				if (i_22_ > ((Class440) this).aByteArray5348.length) {
					if (((Class440) this).aLong5353 * 4332008180302731621L != (-6865785746406801633L * ((Class440) this).aLong5351)) {
						((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5353 * 4332008180302731621L);
						((Class440) this).aLong5351 = (2552102053604559611L * ((Class440) this).aLong5353);
					}
					((Class440) this).aClass442_5346.method7386(is, i, i_22_, -1673621963);
					((Class440) this).aLong5351 += 7563976524047531231L * (long) i_22_;
					if (((Class440) this).aLong5351 * -6865785746406801633L > ((Class440) this).aLong5354 * -4543589230655698933L)
						((Class440) this).aLong5354 = (((Class440) this).aLong5351 * -3131878899264188995L);
					long l = -1L;
					long l_24_ = -1L;
					if ((((Class440) this).aLong5353 * 4332008180302731621L >= (-4231644474770799547L * ((Class440) this).aLong5347)) && (((Class440) this).aLong5353 * 4332008180302731621L < ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (823847309 * ((Class440) this).anInt5349))))
						l = ((Class440) this).aLong5353 * 4332008180302731621L;
					else if (((-4231644474770799547L * ((Class440) this).aLong5347) >= (4332008180302731621L * ((Class440) this).aLong5353)) && ((((Class440) this).aLong5347 * -4231644474770799547L) < ((long) i_22_ + (4332008180302731621L * ((Class440) this).aLong5353))))
						l = (-4231644474770799547L * ((Class440) this).aLong5347);
					if ((((long) i_22_ + 4332008180302731621L * ((Class440) this).aLong5353) > -4231644474770799547L * ((Class440) this).aLong5347) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_22_) <= ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (((Class440) this).anInt5349 * 823847309))))
						l_24_ = (long) i_22_ + (4332008180302731621L * ((Class440) this).aLong5353);
					else if ((((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) > (4332008180302731621L * ((Class440) this).aLong5353)) && (((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) <= (((Class440) this).aLong5353 * 4332008180302731621L) + (long) i_22_))
						l_24_ = ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L));
					if (l > -1L && l_24_ > l) {
						int i_25_ = (int) (l_24_ - l);
						System.arraycopy(is, (int) (l + (long) i - (4332008180302731621L * (((Class440) this).aLong5353))), ((Class440) this).aByteArray5350, (int) (l - (((Class440) this).aLong5347 * -4231644474770799547L)), i_25_);
					}
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_22_;
				} else {
					if (i_22_ <= 0)
						break;
					if (((Class440) this).aLong5345 * -8810271642138189085L == -1L)
						((Class440) this).aLong5345 = (-8210221580261630697L * ((Class440) this).aLong5353);
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), i_22_);
					((Class440) this).aLong5353 += (long) i_22_ * -3918522232594780051L;
					if ((4332008180302731621L * ((Class440) this).aLong5353 - -8810271642138189085L * ((Class440) this).aLong5345) > (long) (((Class440) this).anInt5356 * 675653231))
						((Class440) this).anInt5356 = (-1070827377 * (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)));
				}
			} catch (IOException ioexception) {
				((Class440) this).aLong5351 = -7563976524047531231L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	public long method7358() {
		return ((Class440) this).aLong5355 * 5884830328726448101L;
	}

	public Class440(Class442 class442, int i, int i_26_) throws IOException {
		((Class440) this).aLong5345 = 5735142949487742261L;
		((Class440) this).anInt5356 = 0;
		((Class440) this).aClass442_5346 = class442;
		((Class440) this).aLong5355 = ((((Class440) this).aLong5354 = class442.method7388(-273347477) * -2484724073555934301L) * -8609956465657720529L);
		((Class440) this).aByteArray5350 = new byte[i];
		((Class440) this).aByteArray5348 = new byte[i_26_];
		((Class440) this).aLong5353 = 0L;
	}

	public void method7359(byte[] is) throws IOException {
		method7350(is, 0, is.length, 2057345598);
	}

	public void method7360(byte[] is) throws IOException {
		method7350(is, 0, is.length, -677851398);
	}

	public void method7361(byte[] is, int i, int i_27_) throws IOException {
		try {
			if (i_27_ + i > is.length)
				throw new ArrayIndexOutOfBoundsException(i_27_ + i - is.length);
			if (-1L != ((Class440) this).aLong5345 * -8810271642138189085L && (((Class440) this).aLong5353 * 4332008180302731621L >= -8810271642138189085L * ((Class440) this).aLong5345) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_27_) <= ((long) (675653231 * ((Class440) this).anInt5356) + (((Class440) this).aLong5345 * -8810271642138189085L)))) {
				System.arraycopy(((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), is, i, i_27_);
				((Class440) this).aLong5353 += (long) i_27_ * -3918522232594780051L;
				return;
			}
			long l = ((Class440) this).aLong5353 * 4332008180302731621L;
			int i_28_ = i;
			int i_29_ = i_27_;
			if ((4332008180302731621L * ((Class440) this).aLong5353 >= ((Class440) this).aLong5347 * -4231644474770799547L) && (((Class440) this).aLong5353 * 4332008180302731621L < ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L)))) {
				int i_30_ = (int) ((long) (((Class440) this).anInt5349 * 823847309) - ((((Class440) this).aLong5353 * 4332008180302731621L) - (-4231644474770799547L * ((Class440) this).aLong5347)));
				if (i_30_ > i_27_)
					i_30_ = i_27_;
				System.arraycopy(((Class440) this).aByteArray5350, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-4231644474770799547L * ((Class440) this).aLong5347)), is, i, i_30_);
				((Class440) this).aLong5353 += -3918522232594780051L * (long) i_30_;
				i += i_30_;
				i_27_ -= i_30_;
			}
			if (i_27_ > ((Class440) this).aByteArray5350.length) {
				((Class440) this).aClass442_5346.method7390(4332008180302731621L * ((Class440) this).aLong5353);
				((Class440) this).aLong5351 = ((Class440) this).aLong5353 * 2552102053604559611L;
				int i_31_;
				for (/**/; i_27_ > 0; i_27_ -= i_31_) {
					i_31_ = ((Class440) this).aClass442_5346.method7389(is, i, i_27_, (byte) -126);
					if (i_31_ == -1)
						break;
					((Class440) this).aLong5351 += (long) i_31_ * 7563976524047531231L;
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_31_;
					i += i_31_;
				}
			} else if (i_27_ > 0) {
				method7363(1220675792);
				int i_32_ = i_27_;
				if (i_32_ > ((Class440) this).anInt5349 * 823847309)
					i_32_ = ((Class440) this).anInt5349 * 823847309;
				System.arraycopy(((Class440) this).aByteArray5350, 0, is, i, i_32_);
				i += i_32_;
				i_27_ -= i_32_;
				((Class440) this).aLong5353 += (long) i_32_ * -3918522232594780051L;
			}
			if (-1L != -8810271642138189085L * ((Class440) this).aLong5345) {
				if ((-8810271642138189085L * ((Class440) this).aLong5345 > 4332008180302731621L * ((Class440) this).aLong5353) && i_27_ > 0) {
					int i_33_ = i + (int) ((-8810271642138189085L * ((Class440) this).aLong5345) - (((Class440) this).aLong5353 * 4332008180302731621L));
					if (i_33_ > i + i_27_)
						i_33_ = i + i_27_;
					while (i < i_33_) {
						is[i++] = (byte) 0;
						i_27_--;
						((Class440) this).aLong5353 += -3918522232594780051L;
					}
				}
				long l_34_ = -1L;
				long l_35_ = -1L;
				if (((Class440) this).aLong5345 * -8810271642138189085L >= l && (-8810271642138189085L * ((Class440) this).aLong5345 < (long) i_29_ + l))
					l_34_ = ((Class440) this).aLong5345 * -8810271642138189085L;
				else if (l >= (-8810271642138189085L * ((Class440) this).aLong5345) && l < ((long) (((Class440) this).anInt5356 * 675653231) + (((Class440) this).aLong5345 * -8810271642138189085L)))
					l_34_ = l;
				if (((long) (675653231 * ((Class440) this).anInt5356) + ((Class440) this).aLong5345 * -8810271642138189085L) > l && (((long) (675653231 * ((Class440) this).anInt5356) + ((Class440) this).aLong5345 * -8810271642138189085L) <= (long) i_29_ + l))
					l_35_ = ((long) (((Class440) this).anInt5356 * 675653231) + (-8810271642138189085L * ((Class440) this).aLong5345));
				else if ((long) i_29_ + l > (-8810271642138189085L * ((Class440) this).aLong5345) && (l + (long) i_29_ <= ((-8810271642138189085L * ((Class440) this).aLong5345) + (long) (((Class440) this).anInt5356 * 675653231))))
					l_35_ = (long) i_29_ + l;
				if (l_34_ > -1L && l_35_ > l_34_) {
					int i_36_ = (int) (l_35_ - l_34_);
					System.arraycopy(((Class440) this).aByteArray5348, (int) (l_34_ - (-8810271642138189085L * ((Class440) this).aLong5345)), is, i_28_ + (int) (l_34_ - l), i_36_);
					if (l_35_ > ((Class440) this).aLong5353 * 4332008180302731621L) {
						i_27_ -= l_35_ - (4332008180302731621L * ((Class440) this).aLong5353);
						((Class440) this).aLong5353 = l_35_ * -3918522232594780051L;
					}
				}
			}
		} catch (IOException ioexception) {
			((Class440) this).aLong5351 = -7563976524047531231L;
			throw ioexception;
		}
		if (i_27_ > 0)
			throw new EOFException();
	}

	public void method7362(byte[] is, int i, int i_37_) throws IOException {
		try {
			if (i_37_ + i > is.length)
				throw new ArrayIndexOutOfBoundsException(i_37_ + i - is.length);
			if (-1L != ((Class440) this).aLong5345 * -8810271642138189085L && (((Class440) this).aLong5353 * 4332008180302731621L >= -8810271642138189085L * ((Class440) this).aLong5345) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_37_) <= ((long) (675653231 * ((Class440) this).anInt5356) + (((Class440) this).aLong5345 * -8810271642138189085L)))) {
				System.arraycopy(((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), is, i, i_37_);
				((Class440) this).aLong5353 += (long) i_37_ * -3918522232594780051L;
				return;
			}
			long l = ((Class440) this).aLong5353 * 4332008180302731621L;
			int i_38_ = i;
			int i_39_ = i_37_;
			if ((4332008180302731621L * ((Class440) this).aLong5353 >= ((Class440) this).aLong5347 * -4231644474770799547L) && (((Class440) this).aLong5353 * 4332008180302731621L < ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L)))) {
				int i_40_ = (int) ((long) (((Class440) this).anInt5349 * 823847309) - ((((Class440) this).aLong5353 * 4332008180302731621L) - (-4231644474770799547L * ((Class440) this).aLong5347)));
				if (i_40_ > i_37_)
					i_40_ = i_37_;
				System.arraycopy(((Class440) this).aByteArray5350, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-4231644474770799547L * ((Class440) this).aLong5347)), is, i, i_40_);
				((Class440) this).aLong5353 += -3918522232594780051L * (long) i_40_;
				i += i_40_;
				i_37_ -= i_40_;
			}
			if (i_37_ > ((Class440) this).aByteArray5350.length) {
				((Class440) this).aClass442_5346.method7390(4332008180302731621L * ((Class440) this).aLong5353);
				((Class440) this).aLong5351 = ((Class440) this).aLong5353 * 2552102053604559611L;
				int i_41_;
				for (/**/; i_37_ > 0; i_37_ -= i_41_) {
					i_41_ = ((Class440) this).aClass442_5346.method7389(is, i, i_37_, (byte) -13);
					if (i_41_ == -1)
						break;
					((Class440) this).aLong5351 += (long) i_41_ * 7563976524047531231L;
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_41_;
					i += i_41_;
				}
			} else if (i_37_ > 0) {
				method7363(-829765468);
				int i_42_ = i_37_;
				if (i_42_ > ((Class440) this).anInt5349 * 823847309)
					i_42_ = ((Class440) this).anInt5349 * 823847309;
				System.arraycopy(((Class440) this).aByteArray5350, 0, is, i, i_42_);
				i += i_42_;
				i_37_ -= i_42_;
				((Class440) this).aLong5353 += (long) i_42_ * -3918522232594780051L;
			}
			if (-1L != -8810271642138189085L * ((Class440) this).aLong5345) {
				if ((-8810271642138189085L * ((Class440) this).aLong5345 > 4332008180302731621L * ((Class440) this).aLong5353) && i_37_ > 0) {
					int i_43_ = i + (int) ((-8810271642138189085L * ((Class440) this).aLong5345) - (((Class440) this).aLong5353 * 4332008180302731621L));
					if (i_43_ > i + i_37_)
						i_43_ = i + i_37_;
					while (i < i_43_) {
						is[i++] = (byte) 0;
						i_37_--;
						((Class440) this).aLong5353 += -3918522232594780051L;
					}
				}
				long l_44_ = -1L;
				long l_45_ = -1L;
				if (((Class440) this).aLong5345 * -8810271642138189085L >= l && (-8810271642138189085L * ((Class440) this).aLong5345 < (long) i_39_ + l))
					l_44_ = ((Class440) this).aLong5345 * -8810271642138189085L;
				else if (l >= (-8810271642138189085L * ((Class440) this).aLong5345) && l < ((long) (((Class440) this).anInt5356 * 675653231) + (((Class440) this).aLong5345 * -8810271642138189085L)))
					l_44_ = l;
				if (((long) (675653231 * ((Class440) this).anInt5356) + ((Class440) this).aLong5345 * -8810271642138189085L) > l && (((long) (675653231 * ((Class440) this).anInt5356) + ((Class440) this).aLong5345 * -8810271642138189085L) <= (long) i_39_ + l))
					l_45_ = ((long) (((Class440) this).anInt5356 * 675653231) + (-8810271642138189085L * ((Class440) this).aLong5345));
				else if ((long) i_39_ + l > (-8810271642138189085L * ((Class440) this).aLong5345) && (l + (long) i_39_ <= ((-8810271642138189085L * ((Class440) this).aLong5345) + (long) (((Class440) this).anInt5356 * 675653231))))
					l_45_ = (long) i_39_ + l;
				if (l_44_ > -1L && l_45_ > l_44_) {
					int i_46_ = (int) (l_45_ - l_44_);
					System.arraycopy(((Class440) this).aByteArray5348, (int) (l_44_ - (-8810271642138189085L * ((Class440) this).aLong5345)), is, i_38_ + (int) (l_44_ - l), i_46_);
					if (l_45_ > ((Class440) this).aLong5353 * 4332008180302731621L) {
						i_37_ -= l_45_ - (4332008180302731621L * ((Class440) this).aLong5353);
						((Class440) this).aLong5353 = l_45_ * -3918522232594780051L;
					}
				}
			}
		} catch (IOException ioexception) {
			((Class440) this).aLong5351 = -7563976524047531231L;
			throw ioexception;
		}
		if (i_37_ > 0)
			throw new EOFException();
	}

	void method7363(int i) throws IOException {
		((Class440) this).anInt5349 = 0;
		if (4332008180302731621L * ((Class440) this).aLong5353 != ((Class440) this).aLong5351 * -6865785746406801633L) {
			((Class440) this).aClass442_5346.method7390(4332008180302731621L * (((Class440) this).aLong5353));
			((Class440) this).aLong5351 = 2552102053604559611L * ((Class440) this).aLong5353;
		}
		((Class440) this).aLong5347 = ((Class440) this).aLong5353 * -1173975285391924575L;
		int i_47_;
		for (/**/; (((Class440) this).anInt5349 * 823847309 < ((Class440) this).aByteArray5350.length); ((Class440) this).anInt5349 += i_47_ * -1760853691) {
			int i_48_ = (((Class440) this).aByteArray5350.length - 823847309 * ((Class440) this).anInt5349);
			if (i_48_ > 200000000)
				i_48_ = 200000000;
			i_47_ = (((Class440) this).aClass442_5346.method7389(((Class440) this).aByteArray5350, 823847309 * ((Class440) this).anInt5349, i_48_, (byte) -42));
			if (-1 == i_47_)
				break;
			((Class440) this).aLong5351 += (long) i_47_ * 7563976524047531231L;
		}
	}

	void method7364() throws IOException {
		((Class440) this).anInt5349 = 0;
		if (4332008180302731621L * ((Class440) this).aLong5353 != ((Class440) this).aLong5351 * -6865785746406801633L) {
			((Class440) this).aClass442_5346.method7390(4332008180302731621L * (((Class440) this).aLong5353));
			((Class440) this).aLong5351 = 2552102053604559611L * ((Class440) this).aLong5353;
		}
		((Class440) this).aLong5347 = ((Class440) this).aLong5353 * -1173975285391924575L;
		int i;
		for (/**/; (((Class440) this).anInt5349 * 823847309 < ((Class440) this).aByteArray5350.length); ((Class440) this).anInt5349 += i * -1760853691) {
			int i_49_ = (((Class440) this).aByteArray5350.length - 823847309 * ((Class440) this).anInt5349);
			if (i_49_ > 200000000)
				i_49_ = 200000000;
			i = (((Class440) this).aClass442_5346.method7389(((Class440) this).aByteArray5350, 823847309 * ((Class440) this).anInt5349, i_49_, (byte) -74));
			if (-1 == i)
				break;
			((Class440) this).aLong5351 += (long) i * 7563976524047531231L;
		}
	}

	void method7365() throws IOException {
		((Class440) this).anInt5349 = 0;
		if (4332008180302731621L * ((Class440) this).aLong5353 != ((Class440) this).aLong5351 * -6865785746406801633L) {
			((Class440) this).aClass442_5346.method7390(4332008180302731621L * (((Class440) this).aLong5353));
			((Class440) this).aLong5351 = 2552102053604559611L * ((Class440) this).aLong5353;
		}
		((Class440) this).aLong5347 = ((Class440) this).aLong5353 * -1173975285391924575L;
		int i;
		for (/**/; (((Class440) this).anInt5349 * 823847309 < ((Class440) this).aByteArray5350.length); ((Class440) this).anInt5349 += i * -1760853691) {
			int i_50_ = (((Class440) this).aByteArray5350.length - 823847309 * ((Class440) this).anInt5349);
			if (i_50_ > 200000000)
				i_50_ = 200000000;
			i = (((Class440) this).aClass442_5346.method7389(((Class440) this).aByteArray5350, 823847309 * ((Class440) this).anInt5349, i_50_, (byte) -116));
			if (-1 == i)
				break;
			((Class440) this).aLong5351 += (long) i * 7563976524047531231L;
		}
	}

	public void method7366(byte[] is, int i, int i_51_) throws IOException {
		do {
			try {
				if (((long) i_51_ + ((Class440) this).aLong5353 * 4332008180302731621L) > 5884830328726448101L * ((Class440) this).aLong5355)
					((Class440) this).aLong5355 = (5464637124759944685L * ((4332008180302731621L * ((Class440) this).aLong5353) + (long) i_51_));
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 < ((Class440) this).aLong5345 * -8810271642138189085L) || (((Class440) this).aLong5353 * 4332008180302731621L > ((long) (675653231 * ((Class440) this).anInt5356) + (-8810271642138189085L * ((Class440) this).aLong5345)))))
					method7353((byte) -31);
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 + (long) i_51_) > (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).aByteArray5348).length))) {
					int i_52_ = (int) ((long) ((Class440) this).aByteArray5348.length - ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)));
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)), i_52_);
					((Class440) this).aLong5353 += (long) i_52_ * -3918522232594780051L;
					i += i_52_;
					i_51_ -= i_52_;
					((Class440) this).anInt5356 = (((Class440) this).aByteArray5348.length * -1070827377);
					method7353((byte) -125);
				}
				if (i_51_ > ((Class440) this).aByteArray5348.length) {
					if (((Class440) this).aLong5353 * 4332008180302731621L != (-6865785746406801633L * ((Class440) this).aLong5351)) {
						((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5353 * 4332008180302731621L);
						((Class440) this).aLong5351 = (2552102053604559611L * ((Class440) this).aLong5353);
					}
					((Class440) this).aClass442_5346.method7386(is, i, i_51_, 106150295);
					((Class440) this).aLong5351 += 7563976524047531231L * (long) i_51_;
					if (((Class440) this).aLong5351 * -6865785746406801633L > ((Class440) this).aLong5354 * -4543589230655698933L)
						((Class440) this).aLong5354 = (((Class440) this).aLong5351 * -3131878899264188995L);
					long l = -1L;
					long l_53_ = -1L;
					if ((((Class440) this).aLong5353 * 4332008180302731621L >= (-4231644474770799547L * ((Class440) this).aLong5347)) && (((Class440) this).aLong5353 * 4332008180302731621L < ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (823847309 * ((Class440) this).anInt5349))))
						l = ((Class440) this).aLong5353 * 4332008180302731621L;
					else if (((-4231644474770799547L * ((Class440) this).aLong5347) >= (4332008180302731621L * ((Class440) this).aLong5353)) && ((((Class440) this).aLong5347 * -4231644474770799547L) < ((long) i_51_ + (4332008180302731621L * ((Class440) this).aLong5353))))
						l = (-4231644474770799547L * ((Class440) this).aLong5347);
					if ((((long) i_51_ + 4332008180302731621L * ((Class440) this).aLong5353) > -4231644474770799547L * ((Class440) this).aLong5347) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_51_) <= ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (((Class440) this).anInt5349 * 823847309))))
						l_53_ = (long) i_51_ + (4332008180302731621L * ((Class440) this).aLong5353);
					else if ((((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) > (4332008180302731621L * ((Class440) this).aLong5353)) && (((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) <= (((Class440) this).aLong5353 * 4332008180302731621L) + (long) i_51_))
						l_53_ = ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L));
					if (l > -1L && l_53_ > l) {
						int i_54_ = (int) (l_53_ - l);
						System.arraycopy(is, (int) (l + (long) i - (4332008180302731621L * (((Class440) this).aLong5353))), ((Class440) this).aByteArray5350, (int) (l - (((Class440) this).aLong5347 * -4231644474770799547L)), i_54_);
					}
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_51_;
				} else {
					if (i_51_ <= 0)
						break;
					if (((Class440) this).aLong5345 * -8810271642138189085L == -1L)
						((Class440) this).aLong5345 = (-8210221580261630697L * ((Class440) this).aLong5353);
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), i_51_);
					((Class440) this).aLong5353 += (long) i_51_ * -3918522232594780051L;
					if ((4332008180302731621L * ((Class440) this).aLong5353 - -8810271642138189085L * ((Class440) this).aLong5345) > (long) (((Class440) this).anInt5356 * 675653231))
						((Class440) this).anInt5356 = (-1070827377 * (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)));
				}
			} catch (IOException ioexception) {
				((Class440) this).aLong5351 = -7563976524047531231L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	public void method7367(byte[] is, int i, int i_55_) throws IOException {
		try {
			if (i_55_ + i > is.length)
				throw new ArrayIndexOutOfBoundsException(i_55_ + i - is.length);
			if (-1L != ((Class440) this).aLong5345 * -8810271642138189085L && (((Class440) this).aLong5353 * 4332008180302731621L >= -8810271642138189085L * ((Class440) this).aLong5345) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_55_) <= ((long) (675653231 * ((Class440) this).anInt5356) + (((Class440) this).aLong5345 * -8810271642138189085L)))) {
				System.arraycopy(((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), is, i, i_55_);
				((Class440) this).aLong5353 += (long) i_55_ * -3918522232594780051L;
				return;
			}
			long l = ((Class440) this).aLong5353 * 4332008180302731621L;
			int i_56_ = i;
			int i_57_ = i_55_;
			if ((4332008180302731621L * ((Class440) this).aLong5353 >= ((Class440) this).aLong5347 * -4231644474770799547L) && (((Class440) this).aLong5353 * 4332008180302731621L < ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L)))) {
				int i_58_ = (int) ((long) (((Class440) this).anInt5349 * 823847309) - ((((Class440) this).aLong5353 * 4332008180302731621L) - (-4231644474770799547L * ((Class440) this).aLong5347)));
				if (i_58_ > i_55_)
					i_58_ = i_55_;
				System.arraycopy(((Class440) this).aByteArray5350, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-4231644474770799547L * ((Class440) this).aLong5347)), is, i, i_58_);
				((Class440) this).aLong5353 += -3918522232594780051L * (long) i_58_;
				i += i_58_;
				i_55_ -= i_58_;
			}
			if (i_55_ > ((Class440) this).aByteArray5350.length) {
				((Class440) this).aClass442_5346.method7390(4332008180302731621L * ((Class440) this).aLong5353);
				((Class440) this).aLong5351 = ((Class440) this).aLong5353 * 2552102053604559611L;
				int i_59_;
				for (/**/; i_55_ > 0; i_55_ -= i_59_) {
					i_59_ = ((Class440) this).aClass442_5346.method7389(is, i, i_55_, (byte) -55);
					if (i_59_ == -1)
						break;
					((Class440) this).aLong5351 += (long) i_59_ * 7563976524047531231L;
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_59_;
					i += i_59_;
				}
			} else if (i_55_ > 0) {
				method7363(2063046804);
				int i_60_ = i_55_;
				if (i_60_ > ((Class440) this).anInt5349 * 823847309)
					i_60_ = ((Class440) this).anInt5349 * 823847309;
				System.arraycopy(((Class440) this).aByteArray5350, 0, is, i, i_60_);
				i += i_60_;
				i_55_ -= i_60_;
				((Class440) this).aLong5353 += (long) i_60_ * -3918522232594780051L;
			}
			if (-1L != -8810271642138189085L * ((Class440) this).aLong5345) {
				if ((-8810271642138189085L * ((Class440) this).aLong5345 > 4332008180302731621L * ((Class440) this).aLong5353) && i_55_ > 0) {
					int i_61_ = i + (int) ((-8810271642138189085L * ((Class440) this).aLong5345) - (((Class440) this).aLong5353 * 4332008180302731621L));
					if (i_61_ > i + i_55_)
						i_61_ = i + i_55_;
					while (i < i_61_) {
						is[i++] = (byte) 0;
						i_55_--;
						((Class440) this).aLong5353 += -3918522232594780051L;
					}
				}
				long l_62_ = -1L;
				long l_63_ = -1L;
				if (((Class440) this).aLong5345 * -8810271642138189085L >= l && (-8810271642138189085L * ((Class440) this).aLong5345 < (long) i_57_ + l))
					l_62_ = ((Class440) this).aLong5345 * -8810271642138189085L;
				else if (l >= (-8810271642138189085L * ((Class440) this).aLong5345) && l < ((long) (((Class440) this).anInt5356 * 675653231) + (((Class440) this).aLong5345 * -8810271642138189085L)))
					l_62_ = l;
				if (((long) (675653231 * ((Class440) this).anInt5356) + ((Class440) this).aLong5345 * -8810271642138189085L) > l && (((long) (675653231 * ((Class440) this).anInt5356) + ((Class440) this).aLong5345 * -8810271642138189085L) <= (long) i_57_ + l))
					l_63_ = ((long) (((Class440) this).anInt5356 * 675653231) + (-8810271642138189085L * ((Class440) this).aLong5345));
				else if ((long) i_57_ + l > (-8810271642138189085L * ((Class440) this).aLong5345) && (l + (long) i_57_ <= ((-8810271642138189085L * ((Class440) this).aLong5345) + (long) (((Class440) this).anInt5356 * 675653231))))
					l_63_ = (long) i_57_ + l;
				if (l_62_ > -1L && l_63_ > l_62_) {
					int i_64_ = (int) (l_63_ - l_62_);
					System.arraycopy(((Class440) this).aByteArray5348, (int) (l_62_ - (-8810271642138189085L * ((Class440) this).aLong5345)), is, i_56_ + (int) (l_62_ - l), i_64_);
					if (l_63_ > ((Class440) this).aLong5353 * 4332008180302731621L) {
						i_55_ -= l_63_ - (4332008180302731621L * ((Class440) this).aLong5353);
						((Class440) this).aLong5353 = l_63_ * -3918522232594780051L;
					}
				}
			}
		} catch (IOException ioexception) {
			((Class440) this).aLong5351 = -7563976524047531231L;
			throw ioexception;
		}
		if (i_55_ > 0)
			throw new EOFException();
	}

	public void method7368(byte[] is, int i, int i_65_) throws IOException {
		do {
			try {
				if (((long) i_65_ + ((Class440) this).aLong5353 * 4332008180302731621L) > 5884830328726448101L * ((Class440) this).aLong5355)
					((Class440) this).aLong5355 = (5464637124759944685L * ((4332008180302731621L * ((Class440) this).aLong5353) + (long) i_65_));
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 < ((Class440) this).aLong5345 * -8810271642138189085L) || (((Class440) this).aLong5353 * 4332008180302731621L > ((long) (675653231 * ((Class440) this).anInt5356) + (-8810271642138189085L * ((Class440) this).aLong5345)))))
					method7353((byte) -6);
				if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L && ((4332008180302731621L * ((Class440) this).aLong5353 + (long) i_65_) > (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).aByteArray5348).length))) {
					int i_66_ = (int) ((long) ((Class440) this).aByteArray5348.length - ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)));
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (((Class440) this).aLong5345 * -8810271642138189085L)), i_66_);
					((Class440) this).aLong5353 += (long) i_66_ * -3918522232594780051L;
					i += i_66_;
					i_65_ -= i_66_;
					((Class440) this).anInt5356 = (((Class440) this).aByteArray5348.length * -1070827377);
					method7353((byte) -92);
				}
				if (i_65_ > ((Class440) this).aByteArray5348.length) {
					if (((Class440) this).aLong5353 * 4332008180302731621L != (-6865785746406801633L * ((Class440) this).aLong5351)) {
						((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5353 * 4332008180302731621L);
						((Class440) this).aLong5351 = (2552102053604559611L * ((Class440) this).aLong5353);
					}
					((Class440) this).aClass442_5346.method7386(is, i, i_65_, -294002555);
					((Class440) this).aLong5351 += 7563976524047531231L * (long) i_65_;
					if (((Class440) this).aLong5351 * -6865785746406801633L > ((Class440) this).aLong5354 * -4543589230655698933L)
						((Class440) this).aLong5354 = (((Class440) this).aLong5351 * -3131878899264188995L);
					long l = -1L;
					long l_67_ = -1L;
					if ((((Class440) this).aLong5353 * 4332008180302731621L >= (-4231644474770799547L * ((Class440) this).aLong5347)) && (((Class440) this).aLong5353 * 4332008180302731621L < ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (823847309 * ((Class440) this).anInt5349))))
						l = ((Class440) this).aLong5353 * 4332008180302731621L;
					else if (((-4231644474770799547L * ((Class440) this).aLong5347) >= (4332008180302731621L * ((Class440) this).aLong5353)) && ((((Class440) this).aLong5347 * -4231644474770799547L) < ((long) i_65_ + (4332008180302731621L * ((Class440) this).aLong5353))))
						l = (-4231644474770799547L * ((Class440) this).aLong5347);
					if ((((long) i_65_ + 4332008180302731621L * ((Class440) this).aLong5353) > -4231644474770799547L * ((Class440) this).aLong5347) && ((((Class440) this).aLong5353 * 4332008180302731621L + (long) i_65_) <= ((((Class440) this).aLong5347 * -4231644474770799547L) + (long) (((Class440) this).anInt5349 * 823847309))))
						l_67_ = (long) i_65_ + (4332008180302731621L * ((Class440) this).aLong5353);
					else if ((((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) > (4332008180302731621L * ((Class440) this).aLong5353)) && (((-4231644474770799547L * ((Class440) this).aLong5347) + (long) (((Class440) this).anInt5349 * 823847309)) <= (((Class440) this).aLong5353 * 4332008180302731621L) + (long) i_65_))
						l_67_ = ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L));
					if (l > -1L && l_67_ > l) {
						int i_68_ = (int) (l_67_ - l);
						System.arraycopy(is, (int) (l + (long) i - (4332008180302731621L * (((Class440) this).aLong5353))), ((Class440) this).aByteArray5350, (int) (l - (((Class440) this).aLong5347 * -4231644474770799547L)), i_68_);
					}
					((Class440) this).aLong5353 += -3918522232594780051L * (long) i_65_;
				} else {
					if (i_65_ <= 0)
						break;
					if (((Class440) this).aLong5345 * -8810271642138189085L == -1L)
						((Class440) this).aLong5345 = (-8210221580261630697L * ((Class440) this).aLong5353);
					System.arraycopy(is, i, ((Class440) this).aByteArray5348, (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)), i_65_);
					((Class440) this).aLong5353 += (long) i_65_ * -3918522232594780051L;
					if ((4332008180302731621L * ((Class440) this).aLong5353 - -8810271642138189085L * ((Class440) this).aLong5345) > (long) (((Class440) this).anInt5356 * 675653231))
						((Class440) this).anInt5356 = (-1070827377 * (int) ((((Class440) this).aLong5353 * 4332008180302731621L) - (-8810271642138189085L * ((Class440) this).aLong5345)));
				}
			} catch (IOException ioexception) {
				((Class440) this).aLong5351 = -7563976524047531231L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	void method7369() throws IOException {
		if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L) {
			if (-8810271642138189085L * ((Class440) this).aLong5345 != -6865785746406801633L * ((Class440) this).aLong5351) {
				((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5345 * -8810271642138189085L);
				((Class440) this).aLong5351 = 417574901068126141L * ((Class440) this).aLong5345;
			}
			((Class440) this).aClass442_5346.method7386(((Class440) this).aByteArray5348, 0, ((Class440) this).anInt5356 * 675653231, -1670357479);
			((Class440) this).aLong5351 += 369589281825423025L * (long) ((Class440) this).anInt5356;
			if (-6865785746406801633L * ((Class440) this).aLong5351 > ((Class440) this).aLong5354 * -4543589230655698933L)
				((Class440) this).aLong5354 = -3131878899264188995L * ((Class440) this).aLong5351;
			long l = -1L;
			long l_69_ = -1L;
			if ((-8810271642138189085L * ((Class440) this).aLong5345 >= -4231644474770799547L * ((Class440) this).aLong5347) && (-8810271642138189085L * ((Class440) this).aLong5345 < ((long) (823847309 * ((Class440) this).anInt5349) + -4231644474770799547L * ((Class440) this).aLong5347)))
				l = ((Class440) this).aLong5345 * -8810271642138189085L;
			else if ((-4231644474770799547L * ((Class440) this).aLong5347 >= -8810271642138189085L * ((Class440) this).aLong5345) && (((Class440) this).aLong5347 * -4231644474770799547L < (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).anInt5356 * 675653231))))
				l = ((Class440) this).aLong5347 * -4231644474770799547L;
			if ((((long) (((Class440) this).anInt5356 * 675653231) + -8810271642138189085L * ((Class440) this).aLong5345) > ((Class440) this).aLong5347 * -4231644474770799547L) && (((long) (((Class440) this).anInt5356 * 675653231) + -8810271642138189085L * ((Class440) this).aLong5345) <= ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L))))
				l_69_ = ((long) (675653231 * ((Class440) this).anInt5356) + -8810271642138189085L * ((Class440) this).aLong5345);
			else if (((((Class440) this).aLong5347 * -4231644474770799547L + (long) (823847309 * ((Class440) this).anInt5349)) > ((Class440) this).aLong5345 * -8810271642138189085L) && (((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L)) <= ((-8810271642138189085L * ((Class440) this).aLong5345) + (long) (((Class440) this).anInt5356 * 675653231))))
				l_69_ = (((Class440) this).aLong5347 * -4231644474770799547L + (long) (((Class440) this).anInt5349 * 823847309));
			if (l > -1L && l_69_ > l) {
				int i = (int) (l_69_ - l);
				System.arraycopy(((Class440) this).aByteArray5348, (int) (l - (-8810271642138189085L * ((Class440) this).aLong5345)), ((Class440) this).aByteArray5350, (int) (l - (-4231644474770799547L * ((Class440) this).aLong5347)), i);
			}
			((Class440) this).aLong5345 = 5735142949487742261L;
			((Class440) this).anInt5356 = 0;
		}
	}

	public void method7370(long l) throws IOException {
		if (l < 0L)
			throw new IOException();
		((Class440) this).aLong5353 = l * -3918522232594780051L;
	}

	void method7371() throws IOException {
		if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L) {
			if (-8810271642138189085L * ((Class440) this).aLong5345 != -6865785746406801633L * ((Class440) this).aLong5351) {
				((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5345 * -8810271642138189085L);
				((Class440) this).aLong5351 = 417574901068126141L * ((Class440) this).aLong5345;
			}
			((Class440) this).aClass442_5346.method7386(((Class440) this).aByteArray5348, 0, ((Class440) this).anInt5356 * 675653231, -581935389);
			((Class440) this).aLong5351 += 369589281825423025L * (long) ((Class440) this).anInt5356;
			if (-6865785746406801633L * ((Class440) this).aLong5351 > ((Class440) this).aLong5354 * -4543589230655698933L)
				((Class440) this).aLong5354 = -3131878899264188995L * ((Class440) this).aLong5351;
			long l = -1L;
			long l_70_ = -1L;
			if ((-8810271642138189085L * ((Class440) this).aLong5345 >= -4231644474770799547L * ((Class440) this).aLong5347) && (-8810271642138189085L * ((Class440) this).aLong5345 < ((long) (823847309 * ((Class440) this).anInt5349) + -4231644474770799547L * ((Class440) this).aLong5347)))
				l = ((Class440) this).aLong5345 * -8810271642138189085L;
			else if ((-4231644474770799547L * ((Class440) this).aLong5347 >= -8810271642138189085L * ((Class440) this).aLong5345) && (((Class440) this).aLong5347 * -4231644474770799547L < (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).anInt5356 * 675653231))))
				l = ((Class440) this).aLong5347 * -4231644474770799547L;
			if ((((long) (((Class440) this).anInt5356 * 675653231) + -8810271642138189085L * ((Class440) this).aLong5345) > ((Class440) this).aLong5347 * -4231644474770799547L) && (((long) (((Class440) this).anInt5356 * 675653231) + -8810271642138189085L * ((Class440) this).aLong5345) <= ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L))))
				l_70_ = ((long) (675653231 * ((Class440) this).anInt5356) + -8810271642138189085L * ((Class440) this).aLong5345);
			else if (((((Class440) this).aLong5347 * -4231644474770799547L + (long) (823847309 * ((Class440) this).anInt5349)) > ((Class440) this).aLong5345 * -8810271642138189085L) && (((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L)) <= ((-8810271642138189085L * ((Class440) this).aLong5345) + (long) (((Class440) this).anInt5356 * 675653231))))
				l_70_ = (((Class440) this).aLong5347 * -4231644474770799547L + (long) (((Class440) this).anInt5349 * 823847309));
			if (l > -1L && l_70_ > l) {
				int i = (int) (l_70_ - l);
				System.arraycopy(((Class440) this).aByteArray5348, (int) (l - (-8810271642138189085L * ((Class440) this).aLong5345)), ((Class440) this).aByteArray5350, (int) (l - (-4231644474770799547L * ((Class440) this).aLong5347)), i);
			}
			((Class440) this).aLong5345 = 5735142949487742261L;
			((Class440) this).anInt5356 = 0;
		}
	}

	void method7372() throws IOException {
		if (-8810271642138189085L * ((Class440) this).aLong5345 != -1L) {
			if (-8810271642138189085L * ((Class440) this).aLong5345 != -6865785746406801633L * ((Class440) this).aLong5351) {
				((Class440) this).aClass442_5346.method7390(((Class440) this).aLong5345 * -8810271642138189085L);
				((Class440) this).aLong5351 = 417574901068126141L * ((Class440) this).aLong5345;
			}
			((Class440) this).aClass442_5346.method7386(((Class440) this).aByteArray5348, 0, ((Class440) this).anInt5356 * 675653231, 549151804);
			((Class440) this).aLong5351 += 369589281825423025L * (long) ((Class440) this).anInt5356;
			if (-6865785746406801633L * ((Class440) this).aLong5351 > ((Class440) this).aLong5354 * -4543589230655698933L)
				((Class440) this).aLong5354 = -3131878899264188995L * ((Class440) this).aLong5351;
			long l = -1L;
			long l_71_ = -1L;
			if ((-8810271642138189085L * ((Class440) this).aLong5345 >= -4231644474770799547L * ((Class440) this).aLong5347) && (-8810271642138189085L * ((Class440) this).aLong5345 < ((long) (823847309 * ((Class440) this).anInt5349) + -4231644474770799547L * ((Class440) this).aLong5347)))
				l = ((Class440) this).aLong5345 * -8810271642138189085L;
			else if ((-4231644474770799547L * ((Class440) this).aLong5347 >= -8810271642138189085L * ((Class440) this).aLong5345) && (((Class440) this).aLong5347 * -4231644474770799547L < (-8810271642138189085L * ((Class440) this).aLong5345 + (long) (((Class440) this).anInt5356 * 675653231))))
				l = ((Class440) this).aLong5347 * -4231644474770799547L;
			if ((((long) (((Class440) this).anInt5356 * 675653231) + -8810271642138189085L * ((Class440) this).aLong5345) > ((Class440) this).aLong5347 * -4231644474770799547L) && (((long) (((Class440) this).anInt5356 * 675653231) + -8810271642138189085L * ((Class440) this).aLong5345) <= ((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L))))
				l_71_ = ((long) (675653231 * ((Class440) this).anInt5356) + -8810271642138189085L * ((Class440) this).aLong5345);
			else if (((((Class440) this).aLong5347 * -4231644474770799547L + (long) (823847309 * ((Class440) this).anInt5349)) > ((Class440) this).aLong5345 * -8810271642138189085L) && (((long) (((Class440) this).anInt5349 * 823847309) + (((Class440) this).aLong5347 * -4231644474770799547L)) <= ((-8810271642138189085L * ((Class440) this).aLong5345) + (long) (((Class440) this).anInt5356 * 675653231))))
				l_71_ = (((Class440) this).aLong5347 * -4231644474770799547L + (long) (((Class440) this).anInt5349 * 823847309));
			if (l > -1L && l_71_ > l) {
				int i = (int) (l_71_ - l);
				System.arraycopy(((Class440) this).aByteArray5348, (int) (l - (-8810271642138189085L * ((Class440) this).aLong5345)), ((Class440) this).aByteArray5350, (int) (l - (-4231644474770799547L * ((Class440) this).aLong5347)), i);
			}
			((Class440) this).aLong5345 = 5735142949487742261L;
			((Class440) this).anInt5356 = 0;
		}
	}

	public static void method7373(int i, int i_72_, int i_73_, boolean bool, byte i_74_) {
		client.aLong7307 = 0L;
		int i_75_ = Class158.method2730((short) -26855);
		if (i == 3 || 3 == i_75_)
			bool = true;
		if (!Class316.aClass505_3680.method8664())
			bool = true;
		Class507.method8725(i_75_, i, i_72_, i_73_, bool, -1040786933);
	}

	static void method7374(int i, int i_76_, int i_77_) {
		Class282_Sub50_Sub12 class282_sub50_sub12 = Class263.method4778(6, (long) i);
		class282_sub50_sub12.method14995(752010216);
		((Class282_Sub50_Sub12) class282_sub50_sub12).anInt9668 = i_76_ * -1773141545;
	}
}
