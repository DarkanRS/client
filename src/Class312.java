
/* Class312 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class Class312 {
	Class477 aClass477_3645;
	static final int anInt3646 = 50;
	RsByteBuffer aClass282_Sub35_3647;
	long aLong3648;
	static final int anInt3649 = 20;
	public volatile int anInt3650;
	Class477 aClass477_3651;
	Class477 aClass477_3652 = new Class477();
	int anInt3653;
	Class477 aClass477_3654;
	RsByteBuffer aClass282_Sub35_3655;
	byte aByte3656;
	public volatile int anInt3657;
	static final int anInt3658 = 3;
	static final int anInt3659 = 512;
	Class282_Sub50_Sub11_Sub1 aClass282_Sub50_Sub11_Sub1_3660;

	public abstract void method5514();

	Class282_Sub50_Sub11_Sub1 method5515(int i, int i_0_, byte i_1_, boolean bool, byte i_2_) {
		long l = ((long) i << 32) + (long) i_0_;
		Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = new Class282_Sub50_Sub11_Sub1();
		class282_sub50_sub11_sub1.aLong8120 = 5418180015864004923L * l;
		((Class282_Sub50_Sub11_Sub1) class282_sub50_sub11_sub1).aByte10376 = i_1_;
		((Class282_Sub50_Sub11_Sub1) class282_sub50_sub11_sub1).aBool9637 = bool;
		if (bool) {
			if (method5553((short) 22331) >= 50)
				throw new RuntimeException();
			((Class312) this).aClass477_3652.method7936(class282_sub50_sub11_sub1, -1738910950);
		} else {
			if (method5518(-1983883069) >= 20)
				throw new RuntimeException();
			((Class312) this).aClass477_3651.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		return class282_sub50_sub11_sub1;
	}

	boolean method5516(int i) {
		return method5518(-1727956644) >= 20;
	}

	boolean method5517(int i) {
		return method5553((short) 24755) >= 50;
	}

	int method5518(int i) {
		return (((Class312) this).aClass477_3651.method7939(-1975244786) + ((Class312) this).aClass477_3654.method7939(431574855));
	}

	boolean method5519() {
		return method5553((short) 32767) >= 50;
	}

	abstract void method5520(byte i);

	public abstract boolean method5521(byte i);

	public abstract void method5522(Object object, boolean bool, int i);

	public abstract void method5523(boolean bool, byte i);

	public abstract boolean method5524();

	public abstract void method5525(int i);

	public abstract void method5526(int i);

	public abstract void method5527();

	public abstract void method5528();

	boolean method5529() {
		return method5518(-1700709774) >= 20;
	}

	public abstract void method5530();

	boolean method5531() {
		return method5553((short) 25005) >= 50;
	}

	public abstract void method5532();

	int method5533() {
		return (((Class312) this).aClass477_3651.method7939(-1833157623) + ((Class312) this).aClass477_3654.method7939(1052580148));
	}

	int method5534() {
		return (((Class312) this).aClass477_3651.method7939(-736499075) + ((Class312) this).aClass477_3654.method7939(778707133));
	}

	public int method5535() {
		return (((Class312) this).aClass477_3652.method7939(-2132459517) + ((Class312) this).aClass477_3645.method7939(-1042231454));
	}

	public int method5536() {
		return (((Class312) this).aClass477_3652.method7939(-87712776) + ((Class312) this).aClass477_3645.method7939(-4797720));
	}

	public abstract void method5537();

	abstract void method5538();

	abstract void method5539();

	abstract void method5540();

	public int method5541() {
		return (((Class312) this).aClass477_3652.method7939(-2034520370) + ((Class312) this).aClass477_3645.method7939(-1464928681));
	}

	public abstract boolean method5542();

	public abstract void method5543(byte i);

	public abstract void method5544(Object object, boolean bool);

	public abstract void method5545(Object object, boolean bool);

	public abstract void method5546(boolean bool);

	public abstract void method5547();

	public abstract void method5548();

	public abstract void method5549();

	Class312() {
		((Class312) this).aClass477_3645 = new Class477();
		((Class312) this).aClass477_3651 = new Class477();
		((Class312) this).aClass477_3654 = new Class477();
		((Class312) this).aClass282_Sub35_3655 = new RsByteBuffer(6);
		((Class312) this).aByte3656 = (byte) 0;
		anInt3657 = 0;
		anInt3650 = 0;
		((Class312) this).aClass282_Sub35_3647 = new RsByteBuffer(10);
	}

	public abstract void method5550();

	boolean method5551() {
		return method5553((short) 26572) >= 50;
	}

	public abstract void method5552();

	public int method5553(short i) {
		return (((Class312) this).aClass477_3652.method7939(946484951) + ((Class312) this).aClass477_3645.method7939(1256746547));
	}

	public abstract void method5554();

	Class282_Sub50_Sub11_Sub1 method5555(int i, int i_3_, byte i_4_, boolean bool) {
		long l = ((long) i << 32) + (long) i_3_;
		Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = new Class282_Sub50_Sub11_Sub1();
		class282_sub50_sub11_sub1.aLong8120 = 5418180015864004923L * l;
		((Class282_Sub50_Sub11_Sub1) class282_sub50_sub11_sub1).aByte10376 = i_4_;
		((Class282_Sub50_Sub11_Sub1) class282_sub50_sub11_sub1).aBool9637 = bool;
		if (bool) {
			if (method5553((short) 12213) >= 50)
				throw new RuntimeException();
			((Class312) this).aClass477_3652.method7936(class282_sub50_sub11_sub1, -1738910950);
		} else {
			if (method5518(-1770923873) >= 20)
				throw new RuntimeException();
			((Class312) this).aClass477_3651.method7936(class282_sub50_sub11_sub1, -1738910950);
		}
		return class282_sub50_sub11_sub1;
	}

	boolean method5556() {
		return method5518(-1507782793) >= 20;
	}

	public abstract boolean method5557();

	public static final void method5558(int i) {
		Class9.loginStage = -469549710;
		Class9.anInt106 = 278796630;
		Class9.anInt72 = 1604822550;
	}

	public static void method5559(Class317 class317, int i) {
		Class347.aClass317_4053 = class317;
	}

	public static void method5560(RsByteBuffer class282_sub35, int i, int i_5_) {
		Class282_Sub42 class282_sub42 = new Class282_Sub42();
		((Class282_Sub42) class282_sub42).anInt8033 = class282_sub35.readUnsignedByte() * 1029882891;
		((Class282_Sub42) class282_sub42).anInt8038 = class282_sub35.readInt() * 1339438983;
		((Class282_Sub42) class282_sub42).anIntArray8035 = (new int[((Class282_Sub42) class282_sub42).anInt8033 * -286349405]);
		((Class282_Sub42) class282_sub42).anIntArray8036 = (new int[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aFieldArray8037 = (new Field[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).anIntArray8040 = (new int[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aMethodArray8034 = (new Method[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041 = (new byte[((Class282_Sub42) class282_sub42).anInt8033 * -286349405][][]);
		for (int i_6_ = 0; i_6_ < ((Class282_Sub42) class282_sub42).anInt8033 * -286349405; i_6_++) {
			try {
				int i_7_ = class282_sub35.readUnsignedByte();
				if (i_7_ == 0 || 1 == i_7_ || i_7_ == 2) {
					String string = class282_sub35.readString(950258426);
					String string_8_ = class282_sub35.readString(110703663);
					int i_9_ = 0;
					if (1 == i_7_)
						i_9_ = class282_sub35.readInt();
					((Class282_Sub42) class282_sub42).anIntArray8035[i_6_] = i_7_;
					((Class282_Sub42) class282_sub42).anIntArray8040[i_6_] = i_9_;
					if (Class148.method2553(string, (short) 15152).getClassLoader() == null)
						throw new SecurityException();
					((Class282_Sub42) class282_sub42).aFieldArray8037[i_6_] = Class148.method2553(string, (short) 8812).getDeclaredField(string_8_);
				} else if (3 == i_7_ || 4 == i_7_) {
					String string = class282_sub35.readString(1516633120);
					String string_10_ = class282_sub35.readString(-9080598);
					int i_11_ = class282_sub35.readUnsignedByte();
					String[] strings = new String[i_11_];
					for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
						strings[i_12_] = class282_sub35.readString(-94718751);
					String string_13_ = class282_sub35.readString(103146882);
					byte[][] is = new byte[i_11_][];
					if (3 == i_7_) {
						for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
							int i_15_ = class282_sub35.readInt();
							is[i_14_] = new byte[i_15_];
							class282_sub35.readBytes(is[i_14_], 0, i_15_, 1724620794);
						}
					}
					((Class282_Sub42) class282_sub42).anIntArray8035[i_6_] = i_7_;
					Class[] var_classes = new Class[i_11_];
					for (int i_16_ = 0; i_16_ < i_11_; i_16_++)
						var_classes[i_16_] = Class148.method2553(strings[i_16_], (short) 32325);
					Class var_class = Class148.method2553(string_13_, (short) 26273);
					if (Class148.method2553(string, (short) 12990).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class148.method2553(string, (short) 12676).getDeclaredMethods();
					Method[] methods_17_ = methods;
					for (int i_18_ = 0; i_18_ < methods_17_.length; i_18_++) {
						Method method = methods_17_[i_18_];
						if (method.getName().equals(string_10_)) {
							Class[] var_classes_19_ = method.getParameterTypes();
							if (var_classes.length == var_classes_19_.length) {
								boolean bool = true;
								for (int i_20_ = 0; i_20_ < var_classes.length; i_20_++) {
									if (var_classes[i_20_] != var_classes_19_[i_20_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									((Class282_Sub42) class282_sub42).aMethodArray8034[i_6_] = method;
							}
						}
					}
					((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041[i_6_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -1;
			} catch (SecurityException securityexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -2;
			} catch (NullPointerException nullpointerexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -3;
			} catch (Exception exception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -4;
			} catch (Throwable throwable) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -5;
			}
		}
		Class435.aClass482_5332.method8059(class282_sub42, 1226152090);
	}
}
