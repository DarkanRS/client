/* Class308 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

public abstract class Class308 {
	Class298_Sub24_Sub1 aClass298_Sub24_Sub1_3268;
	static int anInt3269 = 10;
	byte[] aByteArray3270;
	OggPage anOggPage3271;
	OggPacket anOggPacket3272;
	OggSyncState anOggSyncState3273;
	String aString3274;
	static int anInt3275 = 50;
	boolean aBoolean3276;
	boolean aBoolean3277;
	Class298_Sub24_Sub3 aClass298_Sub24_Sub3_3278;
	HashTable aClass437_3279;
	Class298_Sub24_Sub4 aClass298_Sub24_Sub4_3280;
	boolean aBoolean3281;
	boolean aBoolean3282;

	public Class298_Sub24_Sub1 method3763(int i) {
		try {
			return ((Class308) this).aClass298_Sub24_Sub1_3268;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.r(").append(')').toString());
		}
	}

	public void method3764(String string, byte i) {
		try {
			((Class308) this).aString3274 = string;
			if (((Class308) this).aString3274 == null)
				((Class308) this).aClass298_Sub24_Sub4_3280 = null;
			else {
				if (null != ((Class308) this).aClass298_Sub24_Sub4_3280 && !(((Class308) this).aString3274.equals(((Class308) this).aClass298_Sub24_Sub4_3280.method3091((byte) 108))))
					((Class308) this).aClass298_Sub24_Sub4_3280 = null;
				if (((Class308) this).aClass298_Sub24_Sub4_3280 == null) {
					for (Class298_Sub24 class298_sub24 = (Class298_Sub24) ((Class308) this).aClass437_3279.method5816(1591555400); null != class298_sub24; class298_sub24 = (Class298_Sub24) ((Class308) this).aClass437_3279.method5815((byte) -51)) {
						if (class298_sub24 instanceof Class298_Sub24_Sub4) {
							Class298_Sub24_Sub4 class298_sub24_sub4 = (Class298_Sub24_Sub4) class298_sub24;
							if (((Class308) this).aString3274.equals(class298_sub24_sub4.method3091((byte) 59))) {
								((Class308) this).aClass298_Sub24_Sub4_3280 = class298_sub24_sub4;
								break;
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.s(").append(')').toString());
		}
	}

	void method3765(int i) throws IOException {
		try {
			while (((Class298_Sub24_Sub3) ((Class308) this).aClass298_Sub24_Sub3_3278).anOggStreamState7351.packetOut(((Class308) this).anOggPacket3272) != 1) {
				Class298_Sub24 class298_sub24 = method3774((byte) 0);
				if (class298_sub24 == null) {
					if (((Class308) this).aBoolean3277)
						method3769(444648186);
					return;
				}
				if (((Class308) this).aClass298_Sub24_Sub4_3280 == class298_sub24)
					method3767((byte) 76);
			}
			((Class308) this).aClass298_Sub24_Sub3_3278.method3073(((Class308) this).anOggPacket3272, -1226862921);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.p(").append(')').toString());
		}
	}

	abstract int method3766(byte[] is) throws IOException;

	void method3767(byte i) {
		try {
			for (Class298_Sub24 class298_sub24 = (Class298_Sub24) ((Class308) this).aClass437_3279.method5816(2015139315); null != class298_sub24; class298_sub24 = (Class298_Sub24) ((Class308) this).aClass437_3279.method5815((byte) 5)) {
				if (!(class298_sub24 instanceof Class298_Sub24_Sub4)) {
					if (i <= 0) {
						/* empty */
					}
				} else {
					Class298_Sub24_Sub4 class298_sub24_sub4 = (Class298_Sub24_Sub4) class298_sub24;
					while (((((Class298_Sub24_Sub4) class298_sub24_sub4).anInt7352) * -1312498565 <= 8 || (method3779((short) 30482) > (double) class298_sub24_sub4.method3093(-136313953))) && (((Class298_Sub24_Sub4) class298_sub24_sub4).anOggStreamState7351.packetOut(((Class308) this).anOggPacket3272)) == 1)
						class298_sub24_sub4.method3073((((Class308) this).anOggPacket3272), -1226862921);
				}
			}
			method3764(((Class308) this).aString3274, (byte) 111);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.i(").append(')').toString());
		}
	}

	boolean method3768(int i) {
		try {
			if (null != ((Class308) this).aClass298_Sub24_Sub1_3268)
				return (!((Class308) this).aClass298_Sub24_Sub3_3278.method3087(-1737998296) || (method3779((short) 7060) > ((Class308) this).aClass298_Sub24_Sub3_3278.method3085(-2077117247)));
			double d = (double) ((Class308) this).aClass298_Sub24_Sub3_3278.method3084(-1240396603);
			return (0.0 == d || ((double) Class122.method1319((byte) 1) >= (double) ((Class308) this).aClass298_Sub24_Sub3_3278.method3086((byte) 0) + 1000.0 / d));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.k(").append(')').toString());
		}
	}

	void method3769(int i) {
		try {
			for (Class298_Sub24 class298_sub24 = (Class298_Sub24) ((Class308) this).aClass437_3279.method5816(2104844471); null != class298_sub24; class298_sub24 = (Class298_Sub24) ((Class308) this).aClass437_3279.method5815((byte) -42)) {
				if (((Class308) this).aClass298_Sub24_Sub3_3278 == class298_sub24) {
					if (i == -1942073337) {
						/* empty */
					}
				} else {
					while (((Class298_Sub24) class298_sub24).anOggStreamState7351.packetOut() == 1)
						class298_sub24.method3073((((Class308) this).anOggPacket3272), -1226862921);
				}
			}
			if (((Class308) this).aClass298_Sub24_Sub3_3278 != null) {
				for (int i_0_ = 0; i_0_ < 10 && method3768(-1610938594); i_0_++) {
					if (((Class298_Sub24_Sub3) ((Class308) this).aClass298_Sub24_Sub3_3278).anOggStreamState7351.packetOut() != 1) {
						method3771((byte) 61);
						break;
					}
					((Class308) this).aClass298_Sub24_Sub3_3278.method3073(((Class308) this).anOggPacket3272, -1226862921);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.d(").append(')').toString());
		}
	}

	public Class298_Sub24_Sub3 method3770(byte i) {
		try {
			return ((Class308) this).aClass298_Sub24_Sub3_3278;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.x(").append(')').toString());
		}
	}

	public void method3771(byte i) {
		try {
			if (!((Class308) this).aBoolean3276) {
				for (Class298_Sub24 class298_sub24 = (Class298_Sub24) ((Class308) this).aClass437_3279.method5816(1658578802); class298_sub24 != null; class298_sub24 = (Class298_Sub24) ((Class308) this).aClass437_3279.method5815((byte) -74)) {
					class298_sub24.method3075(1392127048);
					((Class298_Sub24) class298_sub24).anOggStreamState7351.f();
				}
				((Class308) this).anOggPacket3272.f();
				((Class308) this).anOggPage3271.f();
				((Class308) this).anOggSyncState3273.f();
				((Class308) this).aBoolean3276 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.u(").append(')').toString());
		}
	}

	public Class298_Sub24_Sub4 method3772(byte i) {
		try {
			return ((Class308) this).aClass298_Sub24_Sub4_3280;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.q(").append(')').toString());
		}
	}

	public boolean method3773(int i) {
		try {
			if (!((Class308) this).aBoolean3276 && !((Class308) this).aBoolean3277)
				return false;
			if (null != ((Class308) this).aClass298_Sub24_Sub1_3268 && ((Class308) this).aClass298_Sub24_Sub1_3268.method3083(-693943954) > 0)
				return false;
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.n(").append(')').toString());
		}
	}

	Class298_Sub24 method3774(byte i) throws IOException {
		try {
			if (((Class308) this).aBoolean3276)
				throw new IllegalStateException();
			if (((Class308) this).aBoolean3277)
				return null;
			while_75_: do {
				int i_1_;
				do {
					if (((Class308) this).anOggSyncState3273.pageOut(((Class308) this).anOggPage3271) > 0)
						break while_75_;
					i_1_ = method3775(((Class308) this).aByteArray3270, -2116572420);
					if (-1 == i_1_) {
						((Class308) this).aBoolean3277 = true;
						return null;
					}
					if (0 == i_1_)
						return null;
				} while (((Class308) this).anOggSyncState3273.write(((Class308) this).aByteArray3270, i_1_));
				throw new RuntimeException("");
			} while (false);
			int i_2_ = ((Class308) this).anOggPage3271.getSerialNumber();
			if (((Class308) this).anOggPage3271.isBOS()) {
				OggStreamState oggstreamstate = new OggStreamState(i_2_);
				if (!oggstreamstate.pageIn(((Class308) this).anOggPage3271))
					throw new IllegalStateException();
				if (oggstreamstate.packetPeek(((Class308) this).anOggPacket3272) != 1)
					throw new IllegalStateException();
				Class298_Sub24 class298_sub24;
				if (null == ((Class308) this).aClass298_Sub24_Sub3_3278 && ((Class308) this).anOggPacket3272.isTheora()) {
					((Class308) this).aClass298_Sub24_Sub3_3278 = new Class298_Sub24_Sub3(oggstreamstate);
					class298_sub24 = ((Class308) this).aClass298_Sub24_Sub3_3278;
				} else if (null == ((Class308) this).aClass298_Sub24_Sub1_3268 && ((Class308) this).anOggPacket3272.isVorbis()) {
					((Class308) this).aClass298_Sub24_Sub1_3268 = new Class298_Sub24_Sub1(oggstreamstate);
					class298_sub24 = ((Class308) this).aClass298_Sub24_Sub1_3268;
				} else {
					byte[] is = ((Class308) this).anOggPacket3272.getData();
					StringBuilder stringbuilder = new StringBuilder();
					for (int i_3_ = 1; i_3_ < is.length; i_3_++) {
						if (!Character.isLetterOrDigit((char) is[i_3_])) {
							if (i != 0) {
								/* empty */
							}
							break;
						}
						stringbuilder.append((char) is[i_3_]);
					}
					String string = stringbuilder.toString();
					if (string.equals("kate"))
						class298_sub24 = new Class298_Sub24_Sub4(oggstreamstate);
					else
						class298_sub24 = new Class298_Sub24_Sub2(oggstreamstate);
				}
				((Class308) this).aClass437_3279.method5817(class298_sub24, (long) i_2_);
				return class298_sub24;
			}
			Class298_Sub24 class298_sub24 = ((Class298_Sub24) ((Class308) this).aClass437_3279.get((long) i_2_));
			if (!((Class298_Sub24) class298_sub24).anOggStreamState7351.pageIn(((Class308) this).anOggPage3271))
				throw new IllegalStateException();
			return class298_sub24;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.f(").append(')').toString());
		}
	}

	abstract int method3775(byte[] is, int i) throws IOException;

	public void method3776(boolean bool, int i) {
		try {
			if (null != ((Class308) this).aClass298_Sub24_Sub1_3268) {
				Class298_Sub19_Sub3 class298_sub19_sub3 = ((Class308) this).aClass298_Sub24_Sub1_3268.method3082(-840425248);
				if (class298_sub19_sub3 != null)
					class298_sub19_sub3.method3036(bool, 1527417335);
			}
			((Class308) this).aBoolean3282 = !((Class308) this).aBoolean3282;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.y(").append(')').toString());
		}
	}

	abstract int method3777(byte[] is) throws IOException;

	abstract int method3778(byte[] is) throws IOException;

	public double method3779(short i) {
		try {
			if (((Class308) this).aClass298_Sub24_Sub1_3268 != null)
				return ((Class308) this).aClass298_Sub24_Sub1_3268.method3081(-762609524);
			if (null != ((Class308) this).aClass298_Sub24_Sub3_3278)
				return ((Class308) this).aClass298_Sub24_Sub3_3278.method3085(-831725814);
			return 0.0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.z(").append(')').toString());
		}
	}

	public void method3780(byte i) throws IOException {
		try {
			if (!((Class308) this).aBoolean3282) {
				while_77_: for (/**/; !((Class308) this).aBoolean3276; ((Class308) this).aBoolean3281 = false) {
					Class298_Sub24 class298_sub24;
					if (!((Class308) this).aBoolean3281) {
						class298_sub24 = method3774((byte) 0);
						if (class298_sub24 == null) {
							if (((Class308) this).aBoolean3277)
								method3769(483146986);
							break;
						}
						if (null == class298_sub24)
							throw new IllegalStateException();
						((Class308) this).aBoolean3281 = true;
					} else
						class298_sub24 = ((Class298_Sub24) (((Class308) this).aClass437_3279.get((long) ((Class308) this).anOggPage3271.getSerialNumber())));
					if (class298_sub24 == ((Class308) this).aClass298_Sub24_Sub1_3268) {
						if (((Class308) this).aClass298_Sub24_Sub1_3268.method3083(-693943954) < 50) {
							do {
								if ((((Class298_Sub24_Sub1) (((Class308) this).aClass298_Sub24_Sub1_3268)).anOggStreamState7351.packetOut(((Class308) this).anOggPacket3272)) != 1)
									continue while_77_;
								((Class308) this).aClass298_Sub24_Sub1_3268.method3073(((Class308) this).anOggPacket3272, -1226862921);
								method3767((byte) 126);
								if (((Class308) this).aClass298_Sub24_Sub3_3278 != null) {
									double d = ((Class308) this).aClass298_Sub24_Sub3_3278.method3085(-820053880);
									for (int i_4_ = 0; i_4_ < 10 && method3768(1506745043); i_4_++) {
										method3765(-508179442);
										if (((Class308) this).aBoolean3276)
											return;
									}
									if (d < ((Class308) this).aClass298_Sub24_Sub3_3278.method3085(-1579482552))
										break;
								}
							} while (((Class308) this).aClass298_Sub24_Sub1_3268.method3083(-693943954) < 50);
							break;
						}
						break;
					}
					if (class298_sub24 instanceof Class298_Sub24_Sub4)
						method3767((byte) 72);
					else if (class298_sub24 != ((Class308) this).aClass298_Sub24_Sub3_3278) {
						while ((((Class298_Sub24) class298_sub24).anOggStreamState7351.packetOut(((Class308) this).anOggPacket3272)) == 1) {
							if (1 == (((Class298_Sub24) class298_sub24).anInt7352) * -1312498565 && (class298_sub24 instanceof Class298_Sub24_Sub4))
								method3764(((Class308) this).aString3274, (byte) 43);
							class298_sub24.method3073((((Class308) this).anOggPacket3272), -1226862921);
						}
					} else if ((null == ((Class308) this).aClass298_Sub24_Sub1_3268) && !((Class308) this).aBoolean3282) {
						for (int i_5_ = 0; i_5_ < 10 && method3768(1830575914); i_5_++) {
							method3765(-508179442);
							if (((Class308) this).aBoolean3276)
								break;
						}
						break;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.b(").append(')').toString());
		}
	}

	Class308(int i) {
		if (!Class85.method955(-1260275656).method265("jagtheora", -1126695495))
			throw new RuntimeException("");
		((Class308) this).aByteArray3270 = new byte[i];
		((Class308) this).anOggSyncState3273 = new OggSyncState();
		((Class308) this).anOggPage3271 = new OggPage();
		((Class308) this).anOggPacket3272 = new OggPacket();
		((Class308) this).aClass437_3279 = new HashTable(8);
	}

	static final void method3781(ClientScript2 class403, byte i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_6_, (byte) 10);
			Class119 class119 = Class389.aClass119Array4165[i_6_ >> 16];
			Class380.method4681(class105, class119, class403, 1808304001);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.la(").append(')').toString());
		}
	}

	static final void method3782(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		try {
			int i_11_ = 0;
			int i_12_ = i_8_;
			int i_13_ = -i_8_;
			int i_14_ = -1;
			int i_15_ = Class463.method6012(i_8_ + i, Class372_Sub1.anInt4051 * -1424479739, Class372_Sub1.anInt4048 * 1135094847, -1212608691);
			int i_16_ = Class463.method6012(i - i_8_, Class372_Sub1.anInt4051 * -1424479739, 1135094847 * Class372_Sub1.anInt4048, -1212608691);
			Class82_Sub22.method940(Class372_Sub1.anIntArrayArray4047[i_7_], i_16_, i_15_, i_9_, 410046201);
			while (i_12_ > i_11_) {
				i_14_ += 2;
				i_13_ += i_14_;
				if (i_13_ > 0) {
					i_12_--;
					i_13_ -= i_12_ << 1;
					int i_17_ = i_7_ - i_12_;
					int i_18_ = i_7_ + i_12_;
					if (i_18_ >= 1155384281 * Class372_Sub1.anInt4049 && i_17_ <= Class372_Sub1.anInt4050 * -1062447355) {
						int i_19_ = Class463.method6012(i_11_ + i, (Class372_Sub1.anInt4051 * -1424479739), (1135094847 * Class372_Sub1.anInt4048), -1212608691);
						int i_20_ = Class463.method6012(i - i_11_, (-1424479739 * Class372_Sub1.anInt4051), (Class372_Sub1.anInt4048 * 1135094847), -1212608691);
						if (i_18_ <= Class372_Sub1.anInt4050 * -1062447355)
							Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_18_]), i_20_, i_19_, i_9_, 483446032);
						if (i_17_ >= 1155384281 * Class372_Sub1.anInt4049)
							Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_17_]), i_20_, i_19_, i_9_, 694694186);
					}
				}
				i_11_++;
				int i_21_ = i_7_ - i_11_;
				int i_22_ = i_11_ + i_7_;
				if (i_22_ >= 1155384281 * Class372_Sub1.anInt4049 && i_21_ <= -1062447355 * Class372_Sub1.anInt4050) {
					int i_23_ = Class463.method6012(i_12_ + i, (-1424479739 * Class372_Sub1.anInt4051), (Class372_Sub1.anInt4048 * 1135094847), -1212608691);
					int i_24_ = Class463.method6012(i - i_12_, (Class372_Sub1.anInt4051 * -1424479739), 1135094847 * (Class372_Sub1.anInt4048), -1212608691);
					if (i_22_ <= Class372_Sub1.anInt4050 * -1062447355)
						Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_22_]), i_24_, i_23_, i_9_, -698175360);
					if (i_21_ >= Class372_Sub1.anInt4049 * 1155384281)
						Class82_Sub22.method940((Class372_Sub1.anIntArrayArray4047[i_21_]), i_24_, i_23_, i_9_, -1368687138);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.n(").append(')').toString());
		}
	}

	static final void method3783(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class270.method2536(class105, class119, class403, 1489338850);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.dh(").append(')').toString());
		}
	}

	public static void method3784(byte i) {
		try {
			if (Class474.aBoolean5970) {
				if (Class474.anInt5971 * -64101949 < -1648308965 * Class395.anInt5190)
					Class474.anInt5971 = Class395.anInt5190 * 1429182921;
				while (Class474.anInt5971 * -64101949 < -499146007 * Class338.anInt3630) {
					Class343_Sub1 class343_sub1 = Class226.method2105(Class474.anInt5971 * -64101949, (byte) -50);
					if (class343_sub1 == null || -1 != class343_sub1.anInt7720 * 512449113)
						Class474.anInt5971 += 854136555;
					else {
						if (Class474.aClass396_5978 == null)
							Class474.aClass396_5978 = (client.aClass404_8715.method4946(class343_sub1.aString7718, (byte) 111));
						int i_25_ = Class474.aClass396_5978.anInt5195 * -747638219;
						if (i_25_ == -1)
							break;
						class343_sub1.anInt7720 = i_25_ * -718385687;
						Class474.anInt5971 += 854136555;
						Class474.aClass396_5978 = null;
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mu.a(").append(')').toString());
		}
	}
}
