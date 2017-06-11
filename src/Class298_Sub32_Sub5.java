/* Class298_Sub32_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class298_Sub32_Sub5 extends Class298_Sub32 {
	int anInt9344;
	static int anInt9345 = 0;
	int anInt9346;
	static int anInt9347 = 2000;
	static int anInt9348 = 4096;
	int anInt9349 = 0;
	int anInt9350;
	static int anInt9351 = 16;
	int anInt9352;
	static int anInt9353 = 0;

	void method3167() {
		Class250.method2396((byte) -44);
	}

	int[] method3168(int i) {
		int[] is = aClass257_7384.method2448(i, 574201304);
		if (aClass257_7384.aBoolean2810) {
			int i_0_ = 1698072291 * ((Class298_Sub32_Sub5) this).anInt9352 >> 1;
			int[][] is_1_ = aClass257_7384.method2449(432902408);
			Random random = new Random((long) (((Class298_Sub32_Sub5) this).anInt9349 * -1552351361));
			for (int i_2_ = 0; i_2_ < -1197969353 * ((Class298_Sub32_Sub5) this).anInt9344; i_2_++) {
				int i_3_ = (((Class298_Sub32_Sub5) this).anInt9352 * 1698072291 > 0 ? (-114289409 * ((Class298_Sub32_Sub5) this).anInt9350 + ((Class298_Sub19_Sub3.method3039(random, (1698072291 * ((Class298_Sub32_Sub5) this).anInt9352), (byte) -39)) - i_0_)) : -114289409 * ((Class298_Sub32_Sub5) this).anInt9350);
				i_3_ = i_3_ >> 4 & 0xff;
				int i_4_ = Class298_Sub19_Sub3.method3039(random, (-1474554145 * Class250.anInt2755), (byte) 18);
				int i_5_ = Class298_Sub19_Sub3.method3039(random, (461985445 * Class250.anInt2756), (byte) -39);
				int i_6_ = i_4_ + ((((Class298_Sub32_Sub5) this).anInt9346 * -1584670283 * Class250.anIntArray2763[i_3_]) >> 12);
				int i_7_ = (((-1584670283 * ((Class298_Sub32_Sub5) this).anInt9346 * Class250.anIntArray2761[i_3_]) >> 12) + i_5_);
				int i_8_ = i_7_ - i_5_;
				int i_9_ = i_6_ - i_4_;
				if (0 != i_9_ || i_8_ != 0) {
					if (i_8_ < 0)
						i_8_ = -i_8_;
					if (i_9_ < 0)
						i_9_ = -i_9_;
					boolean bool = i_8_ > i_9_;
					if (bool) {
						int i_10_ = i_4_;
						int i_11_ = i_6_;
						i_4_ = i_5_;
						i_5_ = i_10_;
						i_6_ = i_7_;
						i_7_ = i_11_;
					}
					if (i_4_ > i_6_) {
						int i_12_ = i_4_;
						int i_13_ = i_5_;
						i_4_ = i_6_;
						i_6_ = i_12_;
						i_5_ = i_7_;
						i_7_ = i_13_;
					}
					int i_14_ = i_5_;
					int i_15_ = i_6_ - i_4_;
					int i_16_ = i_7_ - i_5_;
					int i_17_ = -i_15_ / 2;
					int i_18_ = 2048 / i_15_;
					int i_19_ = 1024 - (Class298_Sub19_Sub3.method3039(random, 4096, (byte) 29) >> 2);
					int i_20_ = i_5_ < i_7_ ? 1 : -1;
					if (i_16_ < 0)
						i_16_ = -i_16_;
					for (int i_21_ = i_4_; i_21_ < i_6_; i_21_++) {
						int i_22_ = 1024 + i_19_ + i_18_ * (i_21_ - i_4_);
						int i_23_ = i_21_ & Class250.anInt2753 * -901777799;
						int i_24_ = i_14_ & -289063255 * Class250.anInt2758;
						if (bool)
							is_1_[i_24_][i_23_] = i_22_;
						else
							is_1_[i_23_][i_24_] = i_22_;
						i_17_ += i_16_;
						if (i_17_ > 0) {
							i_17_ -= i_15_;
							i_14_ = i_20_ + i_14_;
						}
					}
				}
			}
		}
		return is;
	}

	void method3133(int i) {
		try {
			Class250.method2396((byte) 42);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agl.x(").append(')').toString());
		}
	}

	void method3169(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 3:
			((Class298_Sub32_Sub5) this).anInt9350 = class298_sub53.readUnsignedShort() * -132715777;
			break;
		case 2:
			((Class298_Sub32_Sub5) this).anInt9346 = class298_sub53.readUnsignedByte() * -1689580387;
			break;
		case 0:
			((Class298_Sub32_Sub5) this).anInt9349 = class298_sub53.readUnsignedByte() * 94814335;
			break;
		case 1:
			((Class298_Sub32_Sub5) this).anInt9344 = class298_sub53.readUnsignedShort() * -23968377;
			break;
		case 4:
			((Class298_Sub32_Sub5) this).anInt9352 = class298_sub53.readUnsignedShort() * 1425338059;
			break;
		}
	}

	int[] method3170(int i) {
		int[] is = aClass257_7384.method2448(i, 1014530517);
		if (aClass257_7384.aBoolean2810) {
			int i_25_ = 1698072291 * ((Class298_Sub32_Sub5) this).anInt9352 >> 1;
			int[][] is_26_ = aClass257_7384.method2449(-125478280);
			Random random = new Random((long) (((Class298_Sub32_Sub5) this).anInt9349 * -1552351361));
			for (int i_27_ = 0; i_27_ < -1197969353 * ((Class298_Sub32_Sub5) this).anInt9344; i_27_++) {
				int i_28_ = (((Class298_Sub32_Sub5) this).anInt9352 * 1698072291 > 0 ? (-114289409 * ((Class298_Sub32_Sub5) this).anInt9350 + ((Class298_Sub19_Sub3.method3039(random, (1698072291 * ((Class298_Sub32_Sub5) this).anInt9352), (byte) 21)) - i_25_)) : -114289409 * ((Class298_Sub32_Sub5) this).anInt9350);
				i_28_ = i_28_ >> 4 & 0xff;
				int i_29_ = Class298_Sub19_Sub3.method3039(random, (-1474554145 * Class250.anInt2755), (byte) -30);
				int i_30_ = Class298_Sub19_Sub3.method3039(random, (461985445 * Class250.anInt2756), (byte) -9);
				int i_31_ = i_29_ + ((((Class298_Sub32_Sub5) this).anInt9346 * -1584670283 * Class250.anIntArray2763[i_28_]) >> 12);
				int i_32_ = (((-1584670283 * ((Class298_Sub32_Sub5) this).anInt9346 * Class250.anIntArray2761[i_28_]) >> 12) + i_30_);
				int i_33_ = i_32_ - i_30_;
				int i_34_ = i_31_ - i_29_;
				if (0 != i_34_ || i_33_ != 0) {
					if (i_33_ < 0)
						i_33_ = -i_33_;
					if (i_34_ < 0)
						i_34_ = -i_34_;
					boolean bool = i_33_ > i_34_;
					if (bool) {
						int i_35_ = i_29_;
						int i_36_ = i_31_;
						i_29_ = i_30_;
						i_30_ = i_35_;
						i_31_ = i_32_;
						i_32_ = i_36_;
					}
					if (i_29_ > i_31_) {
						int i_37_ = i_29_;
						int i_38_ = i_30_;
						i_29_ = i_31_;
						i_31_ = i_37_;
						i_30_ = i_32_;
						i_32_ = i_38_;
					}
					int i_39_ = i_30_;
					int i_40_ = i_31_ - i_29_;
					int i_41_ = i_32_ - i_30_;
					int i_42_ = -i_40_ / 2;
					int i_43_ = 2048 / i_40_;
					int i_44_ = 1024 - (Class298_Sub19_Sub3.method3039(random, 4096, (byte) -15) >> 2);
					int i_45_ = i_30_ < i_32_ ? 1 : -1;
					if (i_41_ < 0)
						i_41_ = -i_41_;
					for (int i_46_ = i_29_; i_46_ < i_31_; i_46_++) {
						int i_47_ = 1024 + i_44_ + i_43_ * (i_46_ - i_29_);
						int i_48_ = i_46_ & Class250.anInt2753 * -901777799;
						int i_49_ = i_39_ & -289063255 * Class250.anInt2758;
						if (bool)
							is_26_[i_49_][i_48_] = i_47_;
						else
							is_26_[i_48_][i_49_] = i_47_;
						i_42_ += i_41_;
						if (i_42_ > 0) {
							i_42_ -= i_40_;
							i_39_ = i_45_ + i_39_;
						}
					}
				}
			}
		}
		return is;
	}

	void method3137(int i, RsByteBuffer class298_sub53, byte i_50_) {
		try {
			switch (i) {
			case 3:
				((Class298_Sub32_Sub5) this).anInt9350 = class298_sub53.readUnsignedShort() * -132715777;
				break;
			case 2:
				((Class298_Sub32_Sub5) this).anInt9346 = class298_sub53.readUnsignedByte() * -1689580387;
				break;
			case 0:
				((Class298_Sub32_Sub5) this).anInt9349 = class298_sub53.readUnsignedByte() * 94814335;
				break;
			case 1:
				((Class298_Sub32_Sub5) this).anInt9344 = class298_sub53.readUnsignedShort() * -23968377;
				break;
			case 4:
				((Class298_Sub32_Sub5) this).anInt9352 = class298_sub53.readUnsignedShort() * 1425338059;
				break;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agl.r(").append(')').toString());
		}
	}

	void method3171() {
		Class250.method2396((byte) 41);
	}

	int[] method3131(int i, int i_51_) {
		try {
			int[] is = aClass257_7384.method2448(i, 236039494);
			if (aClass257_7384.aBoolean2810) {
				int i_52_ = 1698072291 * ((Class298_Sub32_Sub5) this).anInt9352 >> 1;
				int[][] is_53_ = aClass257_7384.method2449(-1416653577);
				Random random = new Random((long) (((Class298_Sub32_Sub5) this).anInt9349 * -1552351361));
				for (int i_54_ = 0; (i_54_ < -1197969353 * ((Class298_Sub32_Sub5) this).anInt9344); i_54_++) {
					int i_55_ = ((((Class298_Sub32_Sub5) this).anInt9352 * 1698072291 > 0) ? ((-114289409 * ((Class298_Sub32_Sub5) this).anInt9350) + ((Class298_Sub19_Sub3.method3039(random, (1698072291 * ((Class298_Sub32_Sub5) this).anInt9352), (byte) 24)) - i_52_)) : (-114289409 * ((Class298_Sub32_Sub5) this).anInt9350));
					i_55_ = i_55_ >> 4 & 0xff;
					int i_56_ = Class298_Sub19_Sub3.method3039(random, (-1474554145 * (Class250.anInt2755)), (byte) 15);
					int i_57_ = Class298_Sub19_Sub3.method3039(random, (461985445 * (Class250.anInt2756)), (byte) 76);
					int i_58_ = (i_56_ + ((((Class298_Sub32_Sub5) this).anInt9346 * -1584670283 * Class250.anIntArray2763[i_55_]) >> 12));
					int i_59_ = (((-1584670283 * ((Class298_Sub32_Sub5) this).anInt9346 * Class250.anIntArray2761[i_55_]) >> 12) + i_57_);
					int i_60_ = i_59_ - i_57_;
					int i_61_ = i_58_ - i_56_;
					if (0 == i_61_ && i_60_ == 0) {
						if (i_51_ == -484575331) {
							/* empty */
						}
					} else {
						if (i_60_ < 0)
							i_60_ = -i_60_;
						if (i_61_ < 0)
							i_61_ = -i_61_;
						boolean bool = i_60_ > i_61_;
						if (bool) {
							int i_62_ = i_56_;
							int i_63_ = i_58_;
							i_56_ = i_57_;
							i_57_ = i_62_;
							i_58_ = i_59_;
							i_59_ = i_63_;
						}
						if (i_56_ > i_58_) {
							int i_64_ = i_56_;
							int i_65_ = i_57_;
							i_56_ = i_58_;
							i_58_ = i_64_;
							i_57_ = i_59_;
							i_59_ = i_65_;
						}
						int i_66_ = i_57_;
						int i_67_ = i_58_ - i_56_;
						int i_68_ = i_59_ - i_57_;
						int i_69_ = -i_67_ / 2;
						int i_70_ = 2048 / i_67_;
						int i_71_ = (1024 - (Class298_Sub19_Sub3.method3039(random, 4096, (byte) -25) >> 2));
						int i_72_ = i_57_ < i_59_ ? 1 : -1;
						if (i_68_ < 0)
							i_68_ = -i_68_;
						for (int i_73_ = i_56_; i_73_ < i_58_; i_73_++) {
							int i_74_ = 1024 + i_71_ + i_70_ * (i_73_ - i_56_);
							int i_75_ = i_73_ & Class250.anInt2753 * -901777799;
							int i_76_ = i_66_ & -289063255 * Class250.anInt2758;
							if (bool)
								is_53_[i_76_][i_75_] = i_74_;
							else
								is_53_[i_75_][i_76_] = i_74_;
							i_69_ += i_68_;
							if (i_69_ > 0) {
								i_69_ -= i_67_;
								i_66_ = i_72_ + i_66_;
							}
						}
					}
				}
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agl.i(").append(')').toString());
		}
	}

	void method3172() {
		Class250.method2396((byte) -70);
	}

	void method3173(int i, RsByteBuffer class298_sub53) {
		switch (i) {
		case 3:
			((Class298_Sub32_Sub5) this).anInt9350 = class298_sub53.readUnsignedShort() * -132715777;
			break;
		case 2:
			((Class298_Sub32_Sub5) this).anInt9346 = class298_sub53.readUnsignedByte() * -1689580387;
			break;
		case 0:
			((Class298_Sub32_Sub5) this).anInt9349 = class298_sub53.readUnsignedByte() * 94814335;
			break;
		case 1:
			((Class298_Sub32_Sub5) this).anInt9344 = class298_sub53.readUnsignedShort() * -23968377;
			break;
		case 4:
			((Class298_Sub32_Sub5) this).anInt9352 = class298_sub53.readUnsignedShort() * 1425338059;
			break;
		}
	}

	public Class298_Sub32_Sub5() {
		super(0, true);
		((Class298_Sub32_Sub5) this).anInt9344 = -692113744;
		((Class298_Sub32_Sub5) this).anInt9346 = -1263482416;
		((Class298_Sub32_Sub5) this).anInt9352 = 1324134400;
		((Class298_Sub32_Sub5) this).anInt9350 = 0;
	}

	static final void method3174(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (Class298_Sub6.method2863(string, class403, -1433949674) != null)
				string = string.substring(0, string.length() - 1);
			class105.anObjectArray1274 = Class128_Sub2.method1441(string, class403, -2046058202);
			class105.aBoolean1238 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("agl.nw(").append(')').toString());
		}
	}
}
