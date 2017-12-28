
/* Class400 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class400 {
	Class317 aClass317_4817;
	Class402[] aClass402Array4818;
	static final int anInt4819 = 0;
	int anInt4820;
	static int anInt4821;
	static int anInt4822;

	public Class399[] method6783(int i) {
		if (i < 0 || i >= ((Class400) this).aClass402Array4818.length)
			return (((Class402) method6784(0, 0, 1120603126)).aClass399Array4827);
		Class402 class402 = ((Class400) this).aClass402Array4818[i];
		if (!((Class402) class402).aBool4826 || ((Class402) class402).aClass399Array4827.length <= 1)
			return ((Class402) class402).aClass399Array4827;
		int i_0_ = ((Class400) this).anInt4820 * 162347205 == -1 ? 0 : 1;
		Random random = new Random();
		Class399[] class399s = new Class399[((Class402) class402).aClass399Array4827.length];
		System.arraycopy(((Class402) class402).aClass399Array4827, 0, class399s, 0, class399s.length);
		for (int i_1_ = i_0_; i_1_ < class399s.length; i_1_++) {
			int i_2_ = (Class476.method7931(random, class399s.length - i_0_, 1292242826) + i_0_);
			Class399 class399 = ((Class402) class402).aClass399Array4827[i_1_];
			class399s[i_1_] = class399s[i_2_];
			class399s[i_2_] = class399;
		}
		return class399s;
	}

	Class402 method6784(int i, int i_3_, int i_4_) {
		if (-1 == 162347205 * ((Class400) this).anInt4820)
			return new Class402(false, new Class399[0]);
		Class399 class399 = new Class399(162347205 * ((Class400) this).anInt4820, i, i_3_);
		return new Class402(false, new Class399[] { class399 });
	}

	public Class393 method6785(int i, int i_5_) {
		byte[] is = ((Class400) this).aClass317_4817.method5607(i, 0, -1978812291);
		Class393 class393 = new Class393();
		class393.method6743(new RsByteBuffer(is), -1754311806);
		return class393;
	}

	public Class399[] method6786(int i, int i_6_) {
		if (i < 0 || i >= ((Class400) this).aClass402Array4818.length)
			return (((Class402) method6784(0, 0, 1890158711)).aClass399Array4827);
		Class402 class402 = ((Class400) this).aClass402Array4818[i];
		if (!((Class402) class402).aBool4826 || ((Class402) class402).aClass399Array4827.length <= 1)
			return ((Class402) class402).aClass399Array4827;
		int i_7_ = ((Class400) this).anInt4820 * 162347205 == -1 ? 0 : 1;
		Random random = new Random();
		Class399[] class399s = new Class399[((Class402) class402).aClass399Array4827.length];
		System.arraycopy(((Class402) class402).aClass399Array4827, 0, class399s, 0, class399s.length);
		for (int i_8_ = i_7_; i_8_ < class399s.length; i_8_++) {
			int i_9_ = (Class476.method7931(random, class399s.length - i_7_, -871858753) + i_7_);
			Class399 class399 = ((Class402) class402).aClass399Array4827[i_8_];
			class399s[i_8_] = class399s[i_9_];
			class399s[i_9_] = class399;
		}
		return class399s;
	}

	public Class399[] method6787(int i) {
		if (i < 0 || i >= ((Class400) this).aClass402Array4818.length)
			return (((Class402) method6784(0, 0, 1874523982)).aClass399Array4827);
		Class402 class402 = ((Class400) this).aClass402Array4818[i];
		if (!((Class402) class402).aBool4826 || ((Class402) class402).aClass399Array4827.length <= 1)
			return ((Class402) class402).aClass399Array4827;
		int i_10_ = ((Class400) this).anInt4820 * 162347205 == -1 ? 0 : 1;
		Random random = new Random();
		Class399[] class399s = new Class399[((Class402) class402).aClass399Array4827.length];
		System.arraycopy(((Class402) class402).aClass399Array4827, 0, class399s, 0, class399s.length);
		for (int i_11_ = i_10_; i_11_ < class399s.length; i_11_++) {
			int i_12_ = (Class476.method7931(random, class399s.length - i_10_, -556481382) + i_10_);
			Class399 class399 = ((Class402) class402).aClass399Array4827[i_11_];
			class399s[i_11_] = class399s[i_12_];
			class399s[i_12_] = class399;
		}
		return class399s;
	}

	Class402 method6788(int i, int i_13_) {
		if (-1 == 162347205 * ((Class400) this).anInt4820)
			return new Class402(false, new Class399[0]);
		Class399 class399 = new Class399(162347205 * ((Class400) this).anInt4820, i, i_13_);
		return new Class402(false, new Class399[] { class399 });
	}

	public Class399[] method6789(int i) {
		if (i < 0 || i >= ((Class400) this).aClass402Array4818.length)
			return (((Class402) method6784(0, 0, 1056801890)).aClass399Array4827);
		Class402 class402 = ((Class400) this).aClass402Array4818[i];
		if (!((Class402) class402).aBool4826 || ((Class402) class402).aClass399Array4827.length <= 1)
			return ((Class402) class402).aClass399Array4827;
		int i_14_ = ((Class400) this).anInt4820 * 162347205 == -1 ? 0 : 1;
		Random random = new Random();
		Class399[] class399s = new Class399[((Class402) class402).aClass399Array4827.length];
		System.arraycopy(((Class402) class402).aClass399Array4827, 0, class399s, 0, class399s.length);
		for (int i_15_ = i_14_; i_15_ < class399s.length; i_15_++) {
			int i_16_ = (Class476.method7931(random, class399s.length - i_14_, 763793108) + i_14_);
			Class399 class399 = ((Class402) class402).aClass399Array4827[i_15_];
			class399s[i_15_] = class399s[i_16_];
			class399s[i_16_] = class399;
		}
		return class399s;
	}

	public boolean method6790(int i) {
		return ((Class400) this).anInt4820 * 162347205 != -1;
	}

	public boolean method6791() {
		return ((Class400) this).anInt4820 * 162347205 != -1;
	}

	public boolean method6792() {
		return ((Class400) this).anInt4820 * 162347205 != -1;
	}

	public Class400(Class486 class486, Class495 class495, Class317 class317) {
		((Class400) this).aClass317_4817 = class317;
		RsByteBuffer class282_sub35 = new RsByteBuffer(((Class400) this).aClass317_4817.method5607(0, 0, -1323254674));
		int i = ((class282_sub35.buffer == null || class282_sub35.buffer.length < 1) ? -1 : class282_sub35.readUnsignedByte());
		if (i < 4) {
			((Class400) this).aClass402Array4818 = new Class402[0];
			((Class400) this).anInt4820 = -1381598733;
		} else {
			int i_17_ = class282_sub35.readUnsignedByte();
			Class60[] class60s = Class112.method1870(-738775405);
			boolean bool = true;
			if (i_17_ != class60s.length)
				bool = false;
			else {
				for (int i_18_ = 0; i_18_ < class60s.length; i_18_++) {
					int i_19_ = class282_sub35.readUnsignedByte();
					if (440784951 * class60s[i_18_].anInt611 != i_19_) {
						bool = false;
						break;
					}
				}
			}
			if (bool) {
				int i_20_ = class282_sub35.readUnsignedByte();
				int i_21_ = class282_sub35.readUnsignedByte();
				int i_22_;
				int i_23_;
				if (i > 2) {
					((Class400) this).anInt4820 = class282_sub35.readShort(2041179357) * 1381598733;
					i_22_ = class282_sub35.read24BitUnsignedInteger((short) 22864);
					i_23_ = class282_sub35.readUnsignedShort();
				} else {
					((Class400) this).anInt4820 = -1381598733;
					i_22_ = 0;
					i_23_ = 0;
				}
				((Class400) this).aClass402Array4818 = new Class402[1 + i_21_];
				for (int i_24_ = 0; i_24_ < i_20_; i_24_++) {
					int i_25_ = class282_sub35.readUnsignedByte();
					boolean bool_26_ = class282_sub35.readUnsignedByte() == 1;
					int i_27_ = class282_sub35.readUnsignedShort();
					Class399[] class399s;
					if (162347205 * ((Class400) this).anInt4820 == -1) {
						class399s = new Class399[i_27_];
						for (int i_28_ = 0; i_28_ < i_27_; i_28_++) {
							int i_29_ = class282_sub35.readUnsignedShort();
							int i_30_ = class282_sub35.read24BitUnsignedInteger((short) 8450);
							int i_31_ = class282_sub35.readUnsignedShort();
							class399s[i_28_] = new Class399(i_29_, i_30_, i_31_);
						}
						((Class400) this).aClass402Array4818[i_25_] = new Class402(bool_26_, class399s);
					} else {
						class399s = new Class399[1 + i_27_];
						class399s[0] = new Class399((((Class400) this).anInt4820 * 162347205), i_22_, i_23_);
						for (int i_32_ = 0; i_32_ < i_27_; i_32_++) {
							int i_33_ = class282_sub35.readUnsignedShort();
							int i_34_ = class282_sub35.read24BitUnsignedInteger((short) 6867);
							int i_35_ = class282_sub35.readUnsignedShort();
							class399s[1 + i_32_] = new Class399(i_33_, i_34_, i_35_);
						}
					}
					((Class400) this).aClass402Array4818[i_25_] = new Class402(bool_26_, class399s);
				}
				for (int i_36_ = 0; i_36_ < 1 + i_21_; i_36_++) {
					if (null == ((Class400) this).aClass402Array4818[i_36_])
						((Class400) this).aClass402Array4818[i_36_] = method6784(i_22_, i_23_, 85224376);
				}
			} else {
				((Class400) this).aClass402Array4818 = new Class402[0];
				((Class400) this).anInt4820 = -1381598733;
			}
		}
	}

	static String method6793(String string, byte i) {
		String string_37_ = null;
		int i_38_ = string.indexOf("--> ");
		if (i_38_ >= 0) {
			string_37_ = string.substring(0, 4 + i_38_);
			string = string.substring(4 + i_38_);
		}
		if (string.startsWith("directlogin ")) {
			int i_39_ = string.indexOf(" ", "directlogin ".length());
			if (i_39_ >= 0) {
				int i_40_ = string.length();
				string = new StringBuilder().append(string.substring(0, i_39_)).append(" ").toString();
				for (int i_41_ = i_39_ + 1; i_41_ < i_40_; i_41_++)
					string = new StringBuilder().append(string).append("*").toString();
			}
		}
		if (null != string_37_)
			return new StringBuilder().append(string_37_).append(string).toString();
		return string;
	}

	static void method6794(Class282_Sub43 class282_sub43, int i, byte i_42_) {
		Object[] objects = class282_sub43.anObjectArray8054;
		int i_43_ = ((Integer) objects[0]).intValue();
		Class282_Sub50_Sub5 class282_sub50_sub5 = Class286.method5049(i_43_, -905040063);
		if (null != class282_sub50_sub5) {
			Class527 class527 = Class125.method2167(-444057050);
			((Class527) class527).anIntArray6995 = new int[class282_sub50_sub5.anInt9525 * 693687803];
			int i_44_ = 0;
			((Class527) class527).anObjectArray7017 = new String[class282_sub50_sub5.anInt9526 * 1886892247];
			int i_45_ = 0;
			((Class527) class527).aLongArray6996 = new long[class282_sub50_sub5.anInt9530 * -684160137];
			int i_46_ = 0;
			for (int i_47_ = 1; i_47_ < objects.length; i_47_++) {
				if (objects[i_47_] instanceof Integer) {
					int i_48_ = ((Integer) objects[i_47_]).intValue();
					if (i_48_ == -2147483647)
						i_48_ = class282_sub43.anInt8059 * 1154494623;
					if (i_48_ == -2147483646)
						i_48_ = 558772889 * class282_sub43.anInt8055;
					if (-2147483645 == i_48_)
						i_48_ = (class282_sub43.aClass118_8053 != null ? (-1952846363 * class282_sub43.aClass118_8053.anInt1287) : -1);
					if (-2147483644 == i_48_)
						i_48_ = class282_sub43.anInt8051 * -1778855835;
					if (-2147483643 == i_48_)
						i_48_ = (class282_sub43.aClass118_8053 != null ? (1924549737 * class282_sub43.aClass118_8053.anInt1288) : -1);
					if (i_48_ == -2147483642)
						i_48_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1287 * -1952846363) : -1);
					if (-2147483641 == i_48_)
						i_48_ = (null != class282_sub43.aClass118_8057 ? (class282_sub43.aClass118_8057.anInt1288 * 1924549737) : -1);
					if (-2147483640 == i_48_)
						i_48_ = class282_sub43.anInt8058 * 101519687;
					if (-2147483639 == i_48_)
						i_48_ = 505716237 * class282_sub43.anInt8056;
					((Class527) class527).anIntArray6995[i_44_++] = i_48_;
				} else if (objects[i_47_] instanceof String) {
					String string = (String) objects[i_47_];
					if (string.equals("event_opbase"))
						string = class282_sub43.aString8060;
					((Class527) class527).anObjectArray7017[i_45_++] = string;
				} else if (objects[i_47_] instanceof Long) {
					long l = ((Long) objects[i_47_]).longValue();
					((Class527) class527).aLongArray6996[i_46_++] = l;
				}
			}
			((Class527) class527).anInt7015 = -1709878683 * ((Class282_Sub43) class282_sub43).anInt8061;
			Class51.method1068(class282_sub50_sub5, i, class527, 564283341);
		}
	}

	static void method6795(int i) {
		int i_49_ = Class349.anInt4083 * -418109423;
		int i_50_ = -969250379 * client.anInt3243;
		if (Class45.anInt434 * -1016911135 < i_49_)
			i_49_ = -1016911135 * Class45.anInt434;
		if (Class107.anInt1082 * -499509193 < i_50_)
			i_50_ = -499509193 * Class107.anInt1082;
		try {
			Class361.aClass361_4173.method6256((new Object[] { Integer.valueOf(i_49_), Integer.valueOf(i_50_), Integer.valueOf(Class158.method2730((short) -17142)), Integer.valueOf(Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method12666(1852404651)) }), 2140026236);
		} catch (Throwable throwable) {
			/* empty */
		}
	}
}
