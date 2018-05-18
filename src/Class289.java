
/* Class289 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.io.OutputStream;

public class Class289 implements Runnable {
	IOException anIOException3439;
	int anInt3440;
	byte[] aByteArray3441;
	OutputStream anOutputStream3442;
	int anInt3443 = 0;
	int anInt3444 = 0;
	Thread aThread3445;
	boolean aBool3446;

	void method5085() {
		((Class289) this).anOutputStream3442 = new OutputStream_Sub1();
	}

	boolean method5086(int i) {
		if (((Class289) this).aBool3446) {
			try {
				((Class289) this).anOutputStream3442.close();
				if (null == ((Class289) this).anIOException3439)
					((Class289) this).anIOException3439 = new IOException("");
			} catch (IOException ioexception) {
				if (((Class289) this).anIOException3439 == null)
					((Class289) this).anIOException3439 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	public void run() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (((Class289) this).anIOException3439 != null)
						return;
					if (291677693 * ((Class289) this).anInt3443 <= ((Class289) this).anInt3444 * -10079539)
						i = (-10079539 * ((Class289) this).anInt3444 - 291677693 * ((Class289) this).anInt3443);
					else
						i = (((Class289) this).anInt3444 * -10079539 + (1112575849 * ((Class289) this).anInt3440 - ((Class289) this).anInt3443 * 291677693));
					if (i > 0)
						break;
					try {
						((Class289) this).anOutputStream3442.flush();
					} catch (IOException ioexception) {
						((Class289) this).anIOException3439 = ioexception;
						return;
					}
					if (method5086(-1814029220))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (((Class289) this).anInt3443 * 291677693 + i <= ((Class289) this).anInt3440 * 1112575849)
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, ((Class289) this).anInt3443 * 291677693, i);
				else {
					int i_0_ = (1112575849 * ((Class289) this).anInt3440 - 291677693 * ((Class289) this).anInt3443);
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, ((Class289) this).anInt3443 * 291677693, i_0_);
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, 0, i - i_0_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class289) this).anIOException3439 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class289) this).anInt3443 = (1193172821 * ((((Class289) this).anInt3443 * 291677693 + i) % (1112575849 * ((Class289) this).anInt3440)));
			}
		} while (!method5086(528920596));
	}

	void method5087(byte[] is, int i, int i_1_, int i_2_) throws IOException {
		if (i_1_ < 0 || i < 0 || i + i_1_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (((Class289) this).anIOException3439 != null)
				throw new IOException(((Class289) this).anIOException3439.toString());
			int i_3_;
			if (((Class289) this).anInt3443 * 291677693 <= ((Class289) this).anInt3444 * -10079539)
				i_3_ = (((Class289) this).anInt3440 * 1112575849 - ((Class289) this).anInt3444 * -10079539 + ((Class289) this).anInt3443 * 291677693 - 1);
			else
				i_3_ = (291677693 * ((Class289) this).anInt3443 - -10079539 * ((Class289) this).anInt3444 - 1);
			if (i_3_ < i_1_)
				throw new IOException("");
			if (i_1_ + -10079539 * ((Class289) this).anInt3444 <= ((Class289) this).anInt3440 * 1112575849)
				System.arraycopy(is, i, ((Class289) this).aByteArray3441, ((Class289) this).anInt3444 * -10079539, i_1_);
			else {
				int i_4_ = (((Class289) this).anInt3440 * 1112575849 - -10079539 * ((Class289) this).anInt3444);
				System.arraycopy(is, i, ((Class289) this).aByteArray3441, -10079539 * ((Class289) this).anInt3444, i_4_);
				System.arraycopy(is, i_4_ + i, ((Class289) this).aByteArray3441, 0, i_1_ - i_4_);
			}
			((Class289) this).anInt3444 = 1259932165 * ((i_1_ + ((Class289) this).anInt3444 * -10079539) % (1112575849 * ((Class289) this).anInt3440));
			this.notifyAll();
		}
	}

	void method5088() {
		synchronized (this) {
			((Class289) this).aBool3446 = true;
			this.notifyAll();
		}
		try {
			((Class289) this).aThread3445.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method5089(byte i) {
		((Class289) this).anOutputStream3442 = new OutputStream_Sub1();
	}

	public void method5090() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (((Class289) this).anIOException3439 != null)
						return;
					if (291677693 * ((Class289) this).anInt3443 <= ((Class289) this).anInt3444 * -10079539)
						i = (-10079539 * ((Class289) this).anInt3444 - 291677693 * ((Class289) this).anInt3443);
					else
						i = (((Class289) this).anInt3444 * -10079539 + (1112575849 * ((Class289) this).anInt3440 - ((Class289) this).anInt3443 * 291677693));
					if (i > 0)
						break;
					try {
						((Class289) this).anOutputStream3442.flush();
					} catch (IOException ioexception) {
						((Class289) this).anIOException3439 = ioexception;
						return;
					}
					if (method5086(576359518))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (((Class289) this).anInt3443 * 291677693 + i <= ((Class289) this).anInt3440 * 1112575849)
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, ((Class289) this).anInt3443 * 291677693, i);
				else {
					int i_5_ = (1112575849 * ((Class289) this).anInt3440 - 291677693 * ((Class289) this).anInt3443);
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, ((Class289) this).anInt3443 * 291677693, i_5_);
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, 0, i - i_5_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class289) this).anIOException3439 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class289) this).anInt3443 = (1193172821 * ((((Class289) this).anInt3443 * 291677693 + i) % (1112575849 * ((Class289) this).anInt3440)));
			}
		} while (!method5086(-1184680792));
	}

	void method5091(byte[] is, int i, int i_6_) throws IOException {
		if (i_6_ < 0 || i < 0 || i + i_6_ > is.length)
			throw new IOException();
		synchronized (this) {
			if (((Class289) this).anIOException3439 != null)
				throw new IOException(((Class289) this).anIOException3439.toString());
			int i_7_;
			if (((Class289) this).anInt3443 * 291677693 <= ((Class289) this).anInt3444 * -10079539)
				i_7_ = (((Class289) this).anInt3440 * 1112575849 - ((Class289) this).anInt3444 * -10079539 + ((Class289) this).anInt3443 * 291677693 - 1);
			else
				i_7_ = (291677693 * ((Class289) this).anInt3443 - -10079539 * ((Class289) this).anInt3444 - 1);
			if (i_7_ < i_6_)
				throw new IOException("");
			if (i_6_ + -10079539 * ((Class289) this).anInt3444 <= ((Class289) this).anInt3440 * 1112575849)
				System.arraycopy(is, i, ((Class289) this).aByteArray3441, ((Class289) this).anInt3444 * -10079539, i_6_);
			else {
				int i_8_ = (((Class289) this).anInt3440 * 1112575849 - -10079539 * ((Class289) this).anInt3444);
				System.arraycopy(is, i, ((Class289) this).aByteArray3441, -10079539 * ((Class289) this).anInt3444, i_8_);
				System.arraycopy(is, i_8_ + i, ((Class289) this).aByteArray3441, 0, i_6_ - i_8_);
			}
			((Class289) this).anInt3444 = 1259932165 * ((i_6_ + ((Class289) this).anInt3444 * -10079539) % (1112575849 * ((Class289) this).anInt3440));
			this.notifyAll();
		}
	}

	boolean method5092() {
		if (((Class289) this).aBool3446) {
			try {
				((Class289) this).anOutputStream3442.close();
				if (null == ((Class289) this).anIOException3439)
					((Class289) this).anIOException3439 = new IOException("");
			} catch (IOException ioexception) {
				if (((Class289) this).anIOException3439 == null)
					((Class289) this).anIOException3439 = new IOException(ioexception);
			}
			return true;
		}
		return false;
	}

	public void method5093() {
		do {
			int i;
			synchronized (this) {
				for (;;) {
					if (((Class289) this).anIOException3439 != null)
						return;
					if (291677693 * ((Class289) this).anInt3443 <= ((Class289) this).anInt3444 * -10079539)
						i = (-10079539 * ((Class289) this).anInt3444 - 291677693 * ((Class289) this).anInt3443);
					else
						i = (((Class289) this).anInt3444 * -10079539 + (1112575849 * ((Class289) this).anInt3440 - ((Class289) this).anInt3443 * 291677693));
					if (i > 0)
						break;
					try {
						((Class289) this).anOutputStream3442.flush();
					} catch (IOException ioexception) {
						((Class289) this).anIOException3439 = ioexception;
						return;
					}
					if (method5086(-1392612266))
						return;
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
			}
			try {
				if (((Class289) this).anInt3443 * 291677693 + i <= ((Class289) this).anInt3440 * 1112575849)
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, ((Class289) this).anInt3443 * 291677693, i);
				else {
					int i_9_ = (1112575849 * ((Class289) this).anInt3440 - 291677693 * ((Class289) this).anInt3443);
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, ((Class289) this).anInt3443 * 291677693, i_9_);
					((Class289) this).anOutputStream3442.write(((Class289) this).aByteArray3441, 0, i - i_9_);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					((Class289) this).anIOException3439 = ioexception;
					break;
				}
			}
			synchronized (this) {
				((Class289) this).anInt3443 = (1193172821 * ((((Class289) this).anInt3443 * 291677693 + i) % (1112575849 * ((Class289) this).anInt3440)));
			}
		} while (!method5086(-2052580651));
	}

	void method5094(int i) {
		synchronized (this) {
			((Class289) this).aBool3446 = true;
			this.notifyAll();
		}
		try {
			((Class289) this).aThread3445.join();
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	void method5095() {
		((Class289) this).anOutputStream3442 = new OutputStream_Sub1();
	}

	void method5096() {
		((Class289) this).anOutputStream3442 = new OutputStream_Sub1();
	}

	Class289(OutputStream outputstream, int i) {
		((Class289) this).anOutputStream3442 = outputstream;
		((Class289) this).anInt3440 = -995823399 * (i + 1);
		((Class289) this).aByteArray3441 = new byte[((Class289) this).anInt3440 * 1112575849];
		((Class289) this).aThread3445 = new Thread(this);
		((Class289) this).aThread3445.setDaemon(true);
		((Class289) this).aThread3445.start();
	}

	static boolean method5097(GraphicalRenderer class505, int i, int i_10_) {
		Class169.method2869(1783349516);
		if (!class505.method8455(1890093661))
			return false;
		int i_11_ = client.aClass257_7353.method4424(-1338331391);
		int i_12_ = client.aClass257_7353.method4451(-663161868);
		Class311 class311 = client.aClass257_7353.method4433(33386298);
		Class206 class206 = client.aClass257_7353.method4430(-1741761339);
		int i_13_ = i_11_ / 2;
		int i_14_ = 0;
		int i_15_ = 0;
		boolean bool = true;
		for (int i_16_ = i_14_; i_16_ < i_11_ + i_14_; i_16_++) {
			for (int i_17_ = i_15_; i_17_ < i_12_ + i_15_; i_17_++) {
				for (int i_18_ = i; i_18_ <= 3; i_18_++) {
					if (class311.method5498(i, i_18_, i_16_, i_17_, (short) -19634)) {
						int i_19_ = i_18_;
						if (class311.method5497(i_16_, i_17_, 1914032698))
							i_19_--;
						if (i_19_ >= 0)
							bool &= Class282_Sub50_Sub9.method14921(i_19_, i_16_, i_17_, (byte) 95);
					}
				}
			}
		}
		if (!bool)
			return false;
		int i_20_ = 48 + 4 * i_11_ + 48;
		int[] is = new int[i_20_ * i_20_];
		for (int i_21_ = 0; i_21_ < is.length; i_21_++)
			is[i_21_] = -16777216;
		Class158_Sub1 class158_sub1 = null;
		int i_22_ = 0;
		int i_23_ = 0;
		if (Class187.aBool2352) {
			Class419.aClass160_5004 = class505.method8654(i_20_, i_20_, false, true);
			class158_sub1 = class505.method8418();
			class158_sub1.method13759(0, Class419.aClass160_5004.method2808());
			Interface8 interface8 = class505.method8419(i_20_, i_20_);
			class158_sub1.method13765(interface8);
			class505.method8637(class158_sub1, -165772657);
			i_13_ = i_11_;
			i_22_ = 48;
			i_23_ = 48;
			class505.ba(1, 0);
		} else
			Class419.aClass160_5004 = class505.createNativeSprite(is, 0, i_20_, i_20_, i_20_, 1063937715);
		client.aClass257_7353.method4435((byte) 1).method4052((byte) 1);
		int i_24_ = ~0xffffff | ((238 + (int) (Math.random() * 20.0) - 10 << 16) + (238 + (int) (Math.random() * 20.0) - 10 << 8) + (238 + (int) (Math.random() * 20.0) - 10));
		int i_25_ = ~0xffffff | 238 + (int) (Math.random() * 20.0) - 10 << 16;
		int i_26_ = ((int) (Math.random() * 8.0) << 16 | (int) (Math.random() * 8.0) << 8 | (int) (Math.random() * 8.0));
		boolean[][] bools = new boolean[1 + i_13_ + 2][i_13_ + 1 + 2];
		for (int i_27_ = i_14_; i_27_ < i_14_ + i_11_; i_27_ += i_13_) {
			for (int i_28_ = i_15_; i_28_ < i_12_ + i_15_; i_28_ += i_13_) {
				int i_29_ = i_22_;
				int i_30_ = i_23_;
				int i_31_ = i_27_;
				if (i_31_ > 0) {
					i_31_--;
					i_29_ += 4;
				}
				int i_32_ = i_28_;
				if (i_32_ > 0)
					i_32_--;
				int i_33_ = i_13_ + i_27_;
				if (i_33_ < i_11_)
					i_33_++;
				int i_34_ = i_13_ + i_28_;
				if (i_34_ < i_12_) {
					i_34_++;
					i_30_ += 4;
				}
				if (Class187.aBool2358)
					class505.L();
				else
					class505.r(0, 0, 4 * i_13_ + i_29_, i_13_ * 4 + i_30_);
				class505.ba(3, -16777216);
				int i_35_ = i_13_;
				if (i_35_ > i_11_ - 1)
					i_35_ = i_11_ - 1;
				for (int i_36_ = i; i_36_ <= 3; i_36_++) {
					for (int i_37_ = 0; i_37_ <= i_35_; i_37_++) {
						for (int i_38_ = 0; i_38_ <= i_35_; i_38_++)
							bools[i_37_][i_38_] = class311.method5498(i, i_36_, i_31_ + i_37_, i_38_ + i_32_, (short) 11199);
					}
					class206.aClass390Array2607[i_36_].method6715(i_22_, i_23_, 1024, i_31_, i_32_, i_33_, i_34_, bools);
					if (!Class187.aBool2356) {
						for (int i_39_ = -4; i_39_ < i_13_; i_39_++) {
							for (int i_40_ = -4; i_40_ < i_13_; i_40_++) {
								int i_41_ = i_27_ + i_39_;
								int i_42_ = i_28_ + i_40_;
								if (i_41_ >= i_14_ && i_42_ >= i_15_ && class311.method5498(i, i_36_, i_41_, i_42_, (short) -7367)) {
									int i_43_ = i_36_;
									if (class311.method5497(i_41_, i_42_, 2011719380))
										i_43_--;
									if (i_43_ >= 0)
										Class225_Sub5.method13042(class505, i_43_, i_41_, i_42_, i_29_ + 4 * i_39_, i_30_ + 4 * (i_13_ - i_40_) - 4, i_24_, i_25_, 1677446637);
								}
							}
						}
					}
				}
				if (Class187.aBool2356) {
					Class336 class336 = client.aClass257_7353.method4552(i, 1801793645);
					for (int i_44_ = 0; i_44_ < i_13_; i_44_++) {
						for (int i_45_ = 0; i_45_ < i_13_; i_45_++) {
							int i_46_ = i_27_ + i_44_;
							int i_47_ = i_28_ + i_45_;
							int i_48_ = (class336.anIntArrayArray3922[i_46_ - -1969357273 * class336.anInt3931][i_47_ - 1503444365 * class336.anInt3964]);
							if (0 != (i_48_ & 0x40240000))
								class505.method8425(4 * i_44_ + i_29_, i_30_ + 4 * (i_13_ - i_45_) - 4, 4, 4, -1713569622, (byte) -107);
							else if ((i_48_ & 0x800000) != 0)
								class505.method8659(i_29_ + 4 * i_44_, ((i_13_ - i_45_) * 4 + i_30_ - 4), 4, -1713569622, -113850245);
							else if ((i_48_ & 0x2000000) != 0)
								class505.method8428(i_29_ + i_44_ * 4 + 3, (4 * (i_13_ - i_45_) + i_30_ - 4), 4, -1713569622, -1796764807);
							else if (0 != (i_48_ & 0x8000000))
								class505.method8659(i_29_ + i_44_ * 4, 3 + ((i_13_ - i_45_) * 4 + i_30_ - 4), 4, -1713569622, 1008017075);
							else if ((i_48_ & 0x20000000) != 0)
								class505.method8428(i_44_ * 4 + i_29_, (i_30_ + (i_13_ - i_45_) * 4 - 4), 4, -1713569622, -1796764807);
						}
					}
				}
				class505.B(i_29_, i_30_, i_13_ * 4, i_13_ * 4, i_26_, 2);
				if (!Class187.aBool2352) {
					Class419.aClass160_5004.method2750(4 * (i_27_ - i_14_) + 48, i_12_ * 4 + 48 - 4 * (i_28_ - i_15_) - i_13_ * 4, 4 * i_13_, 4 * i_13_, i_29_, i_30_);
					if (Class187.aBool2358) {
						Class419.aClass160_5004.method2752(256, 0);
						try {
							class505.method8393((short) 3740);
							Class89.method1504(2000L);
						} catch (Exception exception) {
							/* empty */
						}
					}
				}
			}
		}
		if (Class187.aBool2352) {
			class505.method8416(class158_sub1, (byte) -88);
			if (Class187.aBool2358) {
				Class419.aClass160_5004.method2752(256, 0);
				try {
					class505.method8393((short) 11377);
					Class89.method1504(2000L);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class505.L();
		class505.ba(1, 1);
		IncomingPacket.method6378(-1538407760);
		Class474 class474 = client.aClass257_7353.method4436(-1461590672);
		Class187.anInt2353 = 0;
		Class187.aClass482_2350.method8118(862321870);
		if (!Class187.aBool2356) {
			for (int i_49_ = i_14_; i_49_ < i_14_ + i_11_; i_49_++) {
				for (int i_50_ = i_15_; i_50_ < i_12_ + i_15_; i_50_++) {
					for (int i_51_ = i; i_51_ <= i + 1 && i_51_ <= 3; i_51_++) {
						if (class311.method5498(i, i_51_, i_49_, i_50_, (short) -2270)) {
							Interface12 interface12 = ((Interface12) class206.method3415(i_51_, i_49_, i_50_, -387297653));
							if (null == interface12)
								interface12 = ((Interface12) (class206.method3413(i_51_, i_49_, i_50_, client.anInterface25_7446, -233664382)));
							if (interface12 == null)
								interface12 = ((Interface12) class206.method3381(i_51_, i_49_, i_50_, (byte) -90));
							if (interface12 == null)
								interface12 = ((Interface12) class206.method3511(i_51_, i_49_, i_50_, (byte) 98));
							if (interface12 != null) {
								Class478 class478 = (class474.method7891(interface12.method84(905574000), 65280));
								if (!class478.aBool5660 || client.membersWorld) {
									int i_52_ = class478.anInt5669 * -1796959211;
									if (class478.anIntArray5650 != null) {
										for (int i_53_ = 0; i_53_ < (class478.anIntArray5650).length; i_53_++) {
											if (class478.anIntArray5650[i_53_] != -1) {
												Class478 class478_54_ = (class474.method7891((class478.anIntArray5650[i_53_]), 65280));
												if ((class478_54_.anInt5669 * -1796959211) >= 0)
													i_52_ = (-1796959211 * (class478_54_.anInt5669));
											}
										}
									}
									if (i_52_ >= 0) {
										boolean bool_55_ = false;
										if (i_52_ >= 0) {
											Class220 class220 = (Class397.aClass218_4813.method3700(i_52_, 537535478));
											if (class220 != null && class220.aBool2730)
												bool_55_ = true;
										}
										int i_56_ = i_49_;
										int i_57_ = i_50_;
										if (bool_55_) {
											int[][] is_58_ = (client.aClass257_7353.method4552(i_51_, 1801793645).anIntArrayArray3922);
											int i_59_ = ((client.aClass257_7353.method4552(i_51_, 1801793645).anInt3931) * -1969357273);
											int i_60_ = ((client.aClass257_7353.method4552(i_51_, 1801793645).anInt3964) * 1503444365);
											for (int i_61_ = 0; i_61_ < 10; i_61_++) {
												int i_62_ = (int) (Math.random() * 4.0);
												if (0 == i_62_ && i_56_ > i_14_ && i_56_ > i_49_ - 3 && 0 == ((is_58_[(i_56_ - 1 - i_59_)][i_57_ - i_60_]) & 0x2c0108))
													i_56_--;
												if (i_62_ == 1 && (i_56_ < i_14_ + i_11_ - 1) && i_56_ < 3 + i_49_ && ((is_58_[1 + i_56_ - i_59_][i_57_ - i_60_]) & 0x2c0180) == 0)
													i_56_++;
												if (2 == i_62_ && i_57_ > i_15_ && i_57_ > i_50_ - 3 && 0 == ((is_58_[i_56_ - i_59_][(i_57_ - 1 - i_60_)]) & 0x2c0102))
													i_57_--;
												if (i_62_ == 3 && (i_57_ < i_15_ + i_12_ - 1) && i_57_ < 3 + i_50_ && 0 == ((is_58_[i_56_ - i_59_][(1 + i_57_ - i_60_)]) & 0x2c0120))
													i_57_++;
											}
										}
										Class187.anIntArray2357[Class187.anInt2353 * 1036045197] = class478.anInt5633 * -2132690865;
										Class187.anIntArray2354[1036045197 * Class187.anInt2353] = i_56_;
										Class187.anIntArray2355[Class187.anInt2353 * 1036045197] = i_57_;
										Class187.anInt2353 += -928813243;
									}
								}
							}
						}
					}
				}
			}
			Class283 class283 = client.aClass257_7353.method4528((byte) 79);
			if (class283 != null) {
				Class397.aClass218_4813.method3697(1024, 64, -2093693613);
				Class219 class219 = client.aClass257_7353.method4519(825342307);
				for (int i_63_ = 0; i_63_ < class283.anInt3382 * -361490119; i_63_++) {
					int i_64_ = class283.anIntArray3381[i_63_];
					if (i_64_ >> 28 == (Class84.myPlayer.aByte7967)) {
						int i_65_ = ((i_64_ >> 14 & 0x3fff) - class219.anInt2711 * 1948093437);
						int i_66_ = ((i_64_ & 0x3fff) - class219.anInt2712 * -1002240017);
						if (i_65_ >= 0 && i_65_ < i_11_ && i_66_ >= 0 && i_66_ < i_12_)
							Class187.aClass482_2350.method8059(new Class282_Sub38(i_63_), -2102160301);
						else {
							Class220 class220 = (Class397.aClass218_4813.method3700(class283.anIntArray3383[i_63_], 1792768149));
							if (null != class220.anIntArray2717 && (i_65_ + class220.anInt2731 * -1051190363 >= 0) && (class220.anInt2747 * -195227125 + i_65_ < i_11_) && 1123286327 * class220.anInt2746 + i_66_ >= 0 && (i_66_ + class220.anInt2744 * 1104382109 < i_12_))
								Class187.aClass482_2350.method8059(new Class282_Sub38(i_63_), -1057083252);
						}
					}
				}
				Class397.aClass218_4813.method3697(128, 64, -1572860391);
			}
		}
		return true;
	}

	static final void method5098(CS2Executor class527, int i) {
		int i_67_ = (((CS2Executor) class527).unknown[301123709 * ((CS2Executor) class527).instrPtr]);
		Class320.anIntArray3724[i_67_] = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub11.method15264(i_67_, (short) -20101);
		client.aBool7400 |= Class282_Sub17_Sub2.aBoolArray9934[i_67_];
	}

	static final void method5099(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class242.method4159(class118, class98, class527, -1802550840);
	}

	static final void method5100(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class41_Sub1_Sub1.method15524((byte) -41);
	}
}
