/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.IOException;

public class Class86 {
	int anInt786;
	Class424 aClass424_787;
	int anInt788;
	int anInt789;
	int anInt790;
	int anInt791;

	Class86(RsByteBuffer class298_sub53) {
		((Class86) this).anInt786 = class298_sub53.readBigSmart(1235052657) * 368471857;
		((Class86) this).aClass424_787 = ((Class424) Class422_Sub20.method5701(Class336_Sub6.method4108(114624527), class298_sub53.readUnsignedByte(), (byte) 2));
	}

	void method959(byte i) {
		try {
			Class420.method5606(-637425735 * ((Class86) this).anInt788, ((Class86) this).anInt789 * -123379955, 1400706617 * ((Class86) this).anInt790, -6749525 * ((Class86) this).aClass424_787.anInt6615, -1, ((Class86) this).aClass424_787.anInt6613 * -1976050083, ((Class86) this).anInt791 * 1067426701, -694910012);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.f(").append(')').toString());
		}
	}

	boolean method960(byte i) {
		try {
			if (766413265 * ((Class86) this).anInt786 >= 0) {
				ObjectDefinitions class432 = Class463.aClass433_5689.getObjectDefinitions(((((Class86) this).anInt786) * 766413265));
				boolean bool = class432.method5771((((Class86) this).aClass424_787.anInt6613) * -1976050083, (byte) 42);
				int[] is = class432.method5782(-1156078162);
				if (is != null) {
					int[] is_0_ = is;
					for (int i_1_ = 0; i_1_ < is_0_.length; i_1_++) {
						int i_2_ = is_0_[i_1_];
						bool &= Class501.aClass395_6122.method4903(i_2_, (byte) -42).method4880(714689881);
					}
				}
				return bool;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.b(").append(')').toString());
		}
	}

	void method961(int i, int i_3_, int i_4_, int i_5_, byte i_6_) {
		try {
			Class420.method5606(i, i_3_, i_4_, (-6749525 * ((Class86) this).aClass424_787.anInt6615), 766413265 * ((Class86) this).anInt786, (((Class86) this).aClass424_787.anInt6613 * -1976050083), i_5_, -392910268);
			((Class86) this).anInt788 = i * -1177932151;
			((Class86) this).anInt789 = 1251379141 * i_3_;
			((Class86) this).anInt790 = 1672214537 * i_4_;
			((Class86) this).anInt791 = 1408522053 * i_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.a(").append(')').toString());
		}
	}

	public static Class476 method962(String string, String string_7_, boolean bool, int i) {
		try {
			File file = new File(Class291.aFile6500, new StringBuilder().append("preferences").append(string).append(".dat").toString());
			do {
				if (file.exists()) {
					Class476 class476;
					try {
						Class476 class476_8_ = new Class476(file, "rw", 10000L);
						class476 = class476_8_;
					} catch (IOException ioexception) {
						break;
					}
					return class476;
				}
			} while (false);
			String string_9_ = "";
			if (33 == Class139.anInt1548 * -518493991)
				string_9_ = "_rc";
			else if (Class139.anInt1548 * -518493991 == 34)
				string_9_ = "_wip";
			File file_10_ = new File(Class83.aString765, new StringBuilder().append("darkan_").append(string_7_).append("_preferences").append(string).append(string_9_).append(".dat").toString());
			do {
				if (!bool && file_10_.exists()) {
					Class476 class476;
					try {
						Class476 class476_11_ = new Class476(file_10_, "rw", 10000L);
						class476 = class476_11_;
					} catch (IOException ioexception) {
						break;
					}
					return class476;
				}
			} while (false);
			Class476 class476;
			try {
				Class476 class476_12_ = new Class476(file, "rw", 10000L);
				class476 = class476_12_;
			} catch (IOException ioexception) {
				throw new RuntimeException();
			}
			return class476;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.u(").append(')').toString());
		}
	}

	static ClientScript method963(Class502 class502, int i, int i_13_, int i_14_) {
		try {
			int i_15_ = -1650162241 * class502.anInt6734 | i << 10;
			ClientScript class298_sub37_sub17 = ((ClientScript) Class399.aClass354_5218.method4253((long) i_15_ << 16));
			if (null != class298_sub37_sub17)
				return class298_sub37_sub17;
			byte[] is = (Class377.aClass243_4092.method2294(Class377.aClass243_4092.method2299(i_15_, 63686679), (byte) 22));
			if (is != null) {
				if (is.length <= 1)
					return null;
				try {
					class298_sub37_sub17 = ClanMember.method1775(is, (byte) 16);
				} catch (Exception exception) {
					throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_15_).toString());
				}
				class298_sub37_sub17.aClass502_9678 = class502;
				Class399.aClass354_5218.method4255(class298_sub37_sub17, (long) i_15_ << 16);
				return class298_sub37_sub17;
			}
			i_15_ = -1650162241 * class502.anInt6734 | i_13_ + 65536 << 10;
			class298_sub37_sub17 = ((ClientScript) Class399.aClass354_5218.method4253((long) i_15_ << 16));
			if (null != class298_sub37_sub17)
				return class298_sub37_sub17;
			is = (Class377.aClass243_4092.method2294(Class377.aClass243_4092.method2299(i_15_, 63686679), (byte) 82));
			if (is != null) {
				if (is.length <= 1)
					return null;
				try {
					class298_sub37_sub17 = ClanMember.method1775(is, (byte) 16);
				} catch (Exception exception) {
					throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_15_).toString());
				}
				class298_sub37_sub17.aClass502_9678 = class502;
				Class399.aClass354_5218.method4255(class298_sub37_sub17, (long) i_15_ << 16);
				return class298_sub37_sub17;
			}
			i_15_ = class502.anInt6734 * -1650162241 | 0x3fffc00;
			class298_sub37_sub17 = ((ClientScript) Class399.aClass354_5218.method4253((long) i_15_ << 16));
			if (null != class298_sub37_sub17)
				return class298_sub37_sub17;
			is = (Class377.aClass243_4092.method2294(Class377.aClass243_4092.method2299(i_15_, 63686679), (byte) 52));
			if (is != null) {
				if (is.length <= 1)
					return null;
				try {
					class298_sub37_sub17 = ClanMember.method1775(is, (byte) 16);
				} catch (Exception exception) {
					throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(i_15_).toString());
				}
				class298_sub37_sub17.aClass502_9678 = class502;
				Class399.aClass354_5218.method4255(class298_sub37_sub17, (long) i_15_ << 16);
				return class298_sub37_sub17;
			}
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.b(").append(')').toString());
		}
	}

	public static int method964(int i, byte i_16_) {
		try {
			double d = (double) (i >> 16 & 0xff) / 256.0;
			double d_17_ = (double) (i >> 8 & 0xff) / 256.0;
			double d_18_ = (double) (i & 0xff) / 256.0;
			double d_19_ = d;
			if (d_17_ < d_19_)
				d_19_ = d_17_;
			if (d_18_ < d_19_)
				d_19_ = d_18_;
			double d_20_ = d;
			if (d_17_ > d_20_)
				d_20_ = d_17_;
			if (d_18_ > d_20_)
				d_20_ = d_18_;
			double d_21_ = 0.0;
			double d_22_ = 0.0;
			double d_23_ = (d_20_ + d_19_) / 2.0;
			if (d_20_ != d_19_) {
				if (d_23_ < 0.5)
					d_22_ = (d_20_ - d_19_) / (d_19_ + d_20_);
				if (d_23_ >= 0.5)
					d_22_ = (d_20_ - d_19_) / (2.0 - d_20_ - d_19_);
				if (d == d_20_)
					d_21_ = (d_17_ - d_18_) / (d_20_ - d_19_);
				else if (d_17_ == d_20_)
					d_21_ = (d_18_ - d) / (d_20_ - d_19_) + 2.0;
				else if (d_18_ == d_20_)
					d_21_ = 4.0 + (d - d_17_) / (d_20_ - d_19_);
			}
			d_21_ /= 6.0;
			int i_24_ = (int) (256.0 * d_21_);
			int i_25_ = (int) (d_22_ * 256.0);
			int i_26_ = (int) (256.0 * d_23_);
			if (i_25_ < 0)
				i_25_ = 0;
			else if (i_25_ > 255)
				i_25_ = 255;
			if (i_26_ < 0)
				i_26_ = 0;
			else if (i_26_ > 255)
				i_26_ = 255;
			if (i_26_ > 243)
				i_25_ >>= 4;
			else if (i_26_ > 217)
				i_25_ >>= 3;
			else if (i_26_ > 192)
				i_25_ >>= 2;
			else if (i_26_ > 179)
				i_25_ >>= 1;
			return (((i_24_ & 0xff) >> 2 << 10) + (i_25_ >> 5 << 7) + (i_26_ >> 1));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.r(").append(')').toString());
		}
	}

	static final void method965(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass162_5252.aByte1672;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.xo(").append(')').toString());
		}
	}

	static void method966(String string, String string_27_, short i) {
		try {
			Class360.anInt3868 = 471358088;
			Class360.aClass25_3905 = client.gameConnection;
			Class460.method5981(false, false, string, string_27_, -1L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.t(").append(')').toString());
		}
	}

	public static void method967(int i, int i_28_, int i_29_, int i_30_) {
		try {
			if (Class298_Sub37_Sub10.aClass95_9602 != null && Class298_Sub37_Sub10.aClass95_9602.method1029((byte) 74) && (Class298_Sub37_Sub10.aClass95_9602.anInt921 * 1941368041 == i)) {
				Class116.method1268(Class298_Sub37_Sub10.aClass95_9602, i_28_, (byte) 20);
				Class300.anInt3207 = -184109511 * i;
				Class298_Sub37_Sub10.aClass95_9602 = null;
				Class298_Sub2.aClass298_Sub19_Sub1_7167 = null;
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2004, client.gameConnection.aClass449_330, (byte) 49);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(-1, -735665420);
				client.gameConnection.method390(class298_sub36, (byte) -21);
			} else {
				i_28_ = i_28_ * Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7584.method5726(-2143915756) >> 8;
				if (i == -1 && !Class300.aBoolean3208)
					Class134.method1489((byte) -85);
				else if (-1 != i && (-1256171511 * Class300.anInt3207 != i || !Class68.method781(-861777344)) && i_28_ != 0 && !Class300.aBoolean3208) {
					Class170.method1811(i_29_, Class374_Sub1.aClass243_7731, i, 0, i_28_, false, new Class97_Sub1(), (byte) -36);
					Class14.method344(-1484268589);
				}
				if (Class300.anInt3207 * -1256171511 != i)
					Class298_Sub2.aClass298_Sub19_Sub1_7167 = null;
				Class300.anInt3207 = -184109511 * i;
				Class300.aClass303_3215 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("dm.g(").append(')').toString());
		}
	}
}
