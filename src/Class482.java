/* Class482 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;

public class Class482 {
	Class482() throws Throwable {
		throw new Error();
	}

	static void method6116(RsByteBuffer class298_sub53, byte i) {
		try {
			if ((class298_sub53.buffer.length - class298_sub53.index * 385051775) >= 1) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ >= 0 && i_0_ <= 1 && (class298_sub53.buffer.length - class298_sub53.index * 385051775) >= 2) {
					int i_1_ = class298_sub53.readUnsignedShort();
					if ((class298_sub53.buffer.length - class298_sub53.index * 385051775) >= i_1_ * 6) {
						for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
							int i_3_ = class298_sub53.readUnsignedShort();
							int i_4_ = class298_sub53.readInt((byte) 13);
							if (i_3_ < Class374.anIntArray4078.length) {
								if (!Class254.aBooleanArray2790[i_3_]) {
									if (i != 3) {
										/* empty */
									}
								} else {
									if ((Class320.aClass494_6550.method6191(i_3_, (byte) 10).aChar5968) == '1') {
										if (i_4_ < -1)
											continue;
										if (i_4_ > 1) {
											if (i != 3) {
												/* empty */
											}
											continue;
										}
									}
									Class374.anIntArray4078[i_3_] = i_4_;
								}
							}
						}
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tw.q(").append(')').toString());
		}
	}

	static final void method6117(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class116.method1271(class105, class119, class403, (byte) -55);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tw.cg(").append(')').toString());
		}
	}

	static File method6118(String string, byte i) {
		try {
			if (!Class304.aBoolean3266)
				throw new RuntimeException("");
			File file = (File) Class304.aHashtable3267.get(string);
			if (null != file)
				return file;
			File file_5_ = new File(Class304.aFile3265, string);
			RandomAccessFile randomaccessfile = null;
			File file_6_;
			try {
				File file_7_ = new File(file_5_.getParent());
				if (!file_7_.exists())
					throw new RuntimeException("");
				randomaccessfile = new RandomAccessFile(file_5_, "rw");
				int i_8_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_8_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Class304.aHashtable3267.put(string, file_5_);
				file_6_ = file_5_;
			} catch (Exception exception) {
				try {
					if (null != randomaccessfile) {
						randomaccessfile.close();
						Object object = null;
					}
				} catch (Exception exception_9_) {
					/* empty */
				}
				throw new RuntimeException();
			}
			return file_6_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tw.f(").append(')').toString());
		}
	}

	static void method6119(int i) {
		try {
			synchronized (Class462.aClass348_5682) {
				Class462.aClass348_5682.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tw.b(").append(')').toString());
		}
	}

	static short[][] method6120(float[][] fs, short[][] is, byte i) {
		try {
			for (int i_10_ = 0; i_10_ < fs.length; i_10_++) {
				for (int i_11_ = 0; i_11_ < is[i_10_].length; i_11_++)
					is[i_10_][i_11_] = (short) (int) (16383.0F * fs[i_10_][i_11_]);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tw.q(").append(')').toString());
		}
	}

	static final void method6121(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		try {
			int i_19_ = i_17_ - 334;
			if (i_19_ < 0)
				i_19_ = 0;
			else if (i_19_ > 100)
				i_19_ = 100;
			int i_20_ = (client.aShort8923 + i_19_ * (client.aShort8931 - client.aShort8923) / 100);
			i_16_ = i_20_ * i_16_ >> 8;
			int i_21_ = 16384 - i_14_ & 0x3fff;
			int i_22_ = 16384 - i_15_ & 0x3fff;
			int i_23_ = 0;
			int i_24_ = 0;
			int i_25_ = i_16_;
			if (i_21_ != 0) {
				i_24_ = -i_25_ * Class220.anIntArray2483[i_21_] >> 14;
				i_25_ = Class220.anIntArray2474[i_21_] * i_25_ >> 14;
			}
			if (0 != i_22_) {
				i_23_ = Class220.anIntArray2483[i_22_] * i_25_ >> 14;
				i_25_ = Class220.anIntArray2474[i_22_] * i_25_ >> 14;
			}
			Class367.anInt4000 = (i - i_23_) * 547882953;
			Class110.anInt6403 = 1078403147 * (i_12_ - i_24_);
			Class146.anInt1575 = (i_13_ - i_25_) * 309839105;
			client.anInt8756 = -648269561 * i_14_;
			Class135.anInt6384 = -1587695039 * i_15_;
			Class229.anInt6458 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tw.je(").append(')').toString());
		}
	}
}
