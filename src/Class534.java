
/* Class534 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public abstract class Class534 {
	long aLong7074;
	int anInt7075;
	long aLong7076;
	Class482 aClass482_7077 = new Class482();
	int anInt7078;
	static short aShort7079;

	void method11407() {
		if (method11423(1136712953)) {
			Class282_Sub23 class282_sub23 = null;
			int i = 0;
			int i_0_ = 0;
			int i_1_ = 0;
			Iterator iterator = ((Class534) this).aClass482_7077.iterator();
			while (iterator.hasNext()) {
				Class282_Sub53 class282_sub53 = (Class282_Sub53) iterator.next();
				if (class282_sub23 != null && (-1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index) - i >= 252 - (6 + method11412(-384248029))))
					break;
				class282_sub53.method4991(-371378792);
				int i_2_ = class282_sub53.method13469(857056097);
				if (i_2_ < -1)
					i_2_ = -1;
				else if (i_2_ > 65534)
					i_2_ = 65534;
				int i_3_ = class282_sub53.method13481(1222940196);
				if (i_3_ < -1)
					i_3_ = -1;
				else if (i_3_ > 65534)
					i_3_ = 65534;
				if (i_3_ == ((Class534) this).anInt7075 * 166883137 && i_2_ == -849141485 * ((Class534) this).anInt7078)
					class282_sub53.method13475(142807330);
				else {
					if (null == class282_sub23) {
						class282_sub23 = method11416((byte) 78);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
						i = -1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index);
						class282_sub23.aClass282_Sub35_Sub2_7682.index += 2064013562;
						i_0_ = 0;
						i_1_ = 0;
					}
					int i_4_;
					int i_5_;
					int i_6_;
					if (((Class534) this).aLong7076 * 2966128844247041579L != -1L) {
						i_4_ = i_3_ - 166883137 * ((Class534) this).anInt7075;
						i_5_ = i_2_ - ((Class534) this).anInt7078 * -849141485;
						i_6_ = (int) ((class282_sub53.method13471(499851942) - (2966128844247041579L * ((Class534) this).aLong7076)) / 20L);
						i_0_ += (class282_sub53.method13471(-737754156) - (((Class534) this).aLong7076 * 2966128844247041579L)) % 20L;
					} else {
						i_4_ = i_3_;
						i_5_ = i_2_;
						i_6_ = 2147483647;
					}
					((Class534) this).anInt7075 = i_3_ * 802300097;
					((Class534) this).anInt7078 = -2119577317 * i_2_;
					if (i_6_ < 8 && i_4_ >= -32 && i_4_ <= 31 && i_5_ >= -32 && i_5_ <= 31) {
						i_4_ += 32;
						i_5_ += 32;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_5_ + ((i_4_ << 6) + (i_6_ << 12)), 1417031095);
					} else if (i_6_ < 32 && i_4_ >= -128 && i_4_ <= 127 && i_5_ >= -128 && i_5_ <= 127) {
						i_4_ += 128;
						i_5_ += 128;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_6_ + 128);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_4_ << 8) + i_5_, 1417031095);
					} else if (i_6_ < 32) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(192 + i_6_);
						if (i_3_ == -1 || i_2_ == -1)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_3_ | i_2_ << 16);
					} else {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_6_ & 0x1fff) + 57344, 1417031095);
						if (-1 == i_3_ || -1 == i_2_)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_3_ | i_2_ << 16);
					}
					i_1_++;
					method11413(class282_sub23.aClass282_Sub35_Sub2_7682, class282_sub53, 1859408302);
					((Class534) this).aLong7076 = (class282_sub53.method13471(1604650728) * 1203484888895588483L);
					class282_sub53.method13475(-743702571);
				}
			}
			if (null != class282_sub23) {
				class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291) - i, -1970657196);
				int i_7_ = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i;
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_0_ / i_1_);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_0_ % i_1_);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i_7_;
				client.aClass184_7475.method3049(class282_sub23, 1412827457);
			}
		}
		method11414(-1872108333);
	}

	int method11408(Class282_Sub53 class282_sub53, int i, int i_8_) {
		long l;
		if (((Class534) this).aLong7074 * 4875607950991837499L == -1L)
			l = (long) i;
		else {
			l = (class282_sub53.method13471(-568247340) - 4875607950991837499L * ((Class534) this).aLong7074);
			if (l > (long) i)
				l = (long) i;
		}
		((Class534) this).aLong7074 = class282_sub53.method13471(1455935453) * 1393221467304339443L;
		return (int) l;
	}

	void method11409(int i) {
		((Class534) this).aClass482_7077.method8118(839183612);
		((Class534) this).aLong7074 = -1393221467304339443L;
		((Class534) this).aLong7076 = -1203484888895588483L;
		((Class534) this).anInt7075 = -802300097;
		((Class534) this).anInt7078 = 2119577317;
	}

	void method11410(Class282_Sub53 class282_sub53, byte i) {
		((Class534) this).aClass482_7077.method8059(class282_sub53, -1396840421);
	}

	void method11411() {
		((Class534) this).aClass482_7077.method8118(-929653423);
		((Class534) this).aLong7074 = -1393221467304339443L;
		((Class534) this).aLong7076 = -1203484888895588483L;
		((Class534) this).anInt7075 = -802300097;
		((Class534) this).anInt7078 = 2119577317;
	}

	abstract int method11412(int i);

	abstract void method11413(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53, int i);

	abstract void method11414(int i);

	abstract int method11415();

	abstract Class282_Sub23 method11416(byte i);

	void method11417(int i) {
		if (method11423(-1420677067)) {
			Class282_Sub23 class282_sub23 = null;
			int i_9_ = 0;
			int i_10_ = 0;
			int i_11_ = 0;
			Iterator iterator = ((Class534) this).aClass482_7077.iterator();
			while (iterator.hasNext()) {
				Class282_Sub53 class282_sub53 = (Class282_Sub53) iterator.next();
				if (class282_sub23 != null && (-1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index) - i_9_ >= 252 - (6 + method11412(919512464))))
					break;
				class282_sub53.method4991(-371378792);
				int i_12_ = class282_sub53.method13469(1360106336);
				if (i_12_ < -1)
					i_12_ = -1;
				else if (i_12_ > 65534)
					i_12_ = 65534;
				int i_13_ = class282_sub53.method13481(2047173833);
				if (i_13_ < -1)
					i_13_ = -1;
				else if (i_13_ > 65534)
					i_13_ = 65534;
				if (i_13_ == ((Class534) this).anInt7075 * 166883137 && i_12_ == -849141485 * ((Class534) this).anInt7078)
					class282_sub53.method13475(-894194576);
				else {
					if (null == class282_sub23) {
						class282_sub23 = method11416((byte) -81);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
						i_9_ = -1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index);
						class282_sub23.aClass282_Sub35_Sub2_7682.index += 2064013562;
						i_10_ = 0;
						i_11_ = 0;
					}
					int i_14_;
					int i_15_;
					int i_16_;
					if (((Class534) this).aLong7076 * 2966128844247041579L != -1L) {
						i_14_ = i_13_ - 166883137 * ((Class534) this).anInt7075;
						i_15_ = i_12_ - ((Class534) this).anInt7078 * -849141485;
						i_16_ = (int) ((class282_sub53.method13471(1951145050) - (2966128844247041579L * ((Class534) this).aLong7076)) / 20L);
						i_10_ += (class282_sub53.method13471(898396823) - (((Class534) this).aLong7076 * 2966128844247041579L)) % 20L;
					} else {
						i_14_ = i_13_;
						i_15_ = i_12_;
						i_16_ = 2147483647;
					}
					((Class534) this).anInt7075 = i_13_ * 802300097;
					((Class534) this).anInt7078 = -2119577317 * i_12_;
					if (i_16_ < 8 && i_14_ >= -32 && i_14_ <= 31 && i_15_ >= -32 && i_15_ <= 31) {
						i_14_ += 32;
						i_15_ += 32;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_15_ + ((i_14_ << 6) + (i_16_ << 12)), 1417031095);
					} else if (i_16_ < 32 && i_14_ >= -128 && i_14_ <= 127 && i_15_ >= -128 && i_15_ <= 127) {
						i_14_ += 128;
						i_15_ += 128;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_16_ + 128);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_14_ << 8) + i_15_, 1417031095);
					} else if (i_16_ < 32) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(192 + i_16_);
						if (i_13_ == -1 || i_12_ == -1)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_13_ | i_12_ << 16);
					} else {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_16_ & 0x1fff) + 57344, 1417031095);
						if (-1 == i_13_ || -1 == i_12_)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_13_ | i_12_ << 16);
					}
					i_11_++;
					method11413(class282_sub23.aClass282_Sub35_Sub2_7682, class282_sub53, 1351568696);
					((Class534) this).aLong7076 = (class282_sub53.method13471(1014804991) * 1203484888895588483L);
					class282_sub53.method13475(684754110);
				}
			}
			if (null != class282_sub23) {
				class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291) - i_9_, -898756253);
				int i_17_ = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i_9_;
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_10_ / i_11_);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_10_ % i_11_);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i_17_;
				client.aClass184_7475.method3049(class282_sub23, 1392403393);
			}
		}
		method11414(-1167987838);
	}

	abstract void method11418();

	void method11419() {
		if (method11423(-1183231170)) {
			Class282_Sub23 class282_sub23 = null;
			int i = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			Iterator iterator = ((Class534) this).aClass482_7077.iterator();
			while (iterator.hasNext()) {
				Class282_Sub53 class282_sub53 = (Class282_Sub53) iterator.next();
				if (class282_sub23 != null && (-1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index) - i >= 252 - (6 + method11412(-1667494729))))
					break;
				class282_sub53.method4991(-371378792);
				int i_20_ = class282_sub53.method13469(-114444026);
				if (i_20_ < -1)
					i_20_ = -1;
				else if (i_20_ > 65534)
					i_20_ = 65534;
				int i_21_ = class282_sub53.method13481(1660620473);
				if (i_21_ < -1)
					i_21_ = -1;
				else if (i_21_ > 65534)
					i_21_ = 65534;
				if (i_21_ == ((Class534) this).anInt7075 * 166883137 && i_20_ == -849141485 * ((Class534) this).anInt7078)
					class282_sub53.method13475(383961179);
				else {
					if (null == class282_sub23) {
						class282_sub23 = method11416((byte) -71);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
						i = -1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index);
						class282_sub23.aClass282_Sub35_Sub2_7682.index += 2064013562;
						i_18_ = 0;
						i_19_ = 0;
					}
					int i_22_;
					int i_23_;
					int i_24_;
					if (((Class534) this).aLong7076 * 2966128844247041579L != -1L) {
						i_22_ = i_21_ - 166883137 * ((Class534) this).anInt7075;
						i_23_ = i_20_ - ((Class534) this).anInt7078 * -849141485;
						i_24_ = (int) ((class282_sub53.method13471(1620437982) - (2966128844247041579L * ((Class534) this).aLong7076)) / 20L);
						i_18_ += (class282_sub53.method13471(-137653440) - (((Class534) this).aLong7076 * 2966128844247041579L)) % 20L;
					} else {
						i_22_ = i_21_;
						i_23_ = i_20_;
						i_24_ = 2147483647;
					}
					((Class534) this).anInt7075 = i_21_ * 802300097;
					((Class534) this).anInt7078 = -2119577317 * i_20_;
					if (i_24_ < 8 && i_22_ >= -32 && i_22_ <= 31 && i_23_ >= -32 && i_23_ <= 31) {
						i_22_ += 32;
						i_23_ += 32;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_23_ + ((i_22_ << 6) + (i_24_ << 12)), 1417031095);
					} else if (i_24_ < 32 && i_22_ >= -128 && i_22_ <= 127 && i_23_ >= -128 && i_23_ <= 127) {
						i_22_ += 128;
						i_23_ += 128;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_24_ + 128);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_22_ << 8) + i_23_, 1417031095);
					} else if (i_24_ < 32) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(192 + i_24_);
						if (i_21_ == -1 || i_20_ == -1)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_21_ | i_20_ << 16);
					} else {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_24_ & 0x1fff) + 57344, 1417031095);
						if (-1 == i_21_ || -1 == i_20_)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_21_ | i_20_ << 16);
					}
					i_19_++;
					method11413(class282_sub23.aClass282_Sub35_Sub2_7682, class282_sub53, 1189902715);
					((Class534) this).aLong7076 = (class282_sub53.method13471(362996623) * 1203484888895588483L);
					class282_sub53.method13475(-1171100133);
				}
			}
			if (null != class282_sub23) {
				class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291) - i, -1246178693);
				int i_25_ = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i;
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_18_ / i_19_);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_18_ % i_19_);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i_25_;
				client.aClass184_7475.method3049(class282_sub23, -370590607);
			}
		}
		method11414(-1451859630);
	}

	Class534() {
		((Class534) this).aLong7074 = -1393221467304339443L;
		((Class534) this).aLong7076 = -1203484888895588483L;
		((Class534) this).anInt7075 = -802300097;
		((Class534) this).anInt7078 = 2119577317;
	}

	abstract Class282_Sub23 method11420();

	abstract Class282_Sub23 method11421();

	abstract Class282_Sub23 method11422();

	abstract boolean method11423(int i);

	abstract int method11424();

	abstract int method11425();

	abstract void method11426(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53);

	abstract void method11427(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53);

	abstract Class282_Sub23 method11428();

	void method11429() {
		if (method11423(-97982467)) {
			Class282_Sub23 class282_sub23 = null;
			int i = 0;
			int i_26_ = 0;
			int i_27_ = 0;
			Iterator iterator = ((Class534) this).aClass482_7077.iterator();
			while (iterator.hasNext()) {
				Class282_Sub53 class282_sub53 = (Class282_Sub53) iterator.next();
				if (class282_sub23 != null && (-1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index) - i >= 252 - (6 + method11412(-1870142111))))
					break;
				class282_sub53.method4991(-371378792);
				int i_28_ = class282_sub53.method13469(154136423);
				if (i_28_ < -1)
					i_28_ = -1;
				else if (i_28_ > 65534)
					i_28_ = 65534;
				int i_29_ = class282_sub53.method13481(1575445910);
				if (i_29_ < -1)
					i_29_ = -1;
				else if (i_29_ > 65534)
					i_29_ = 65534;
				if (i_29_ == ((Class534) this).anInt7075 * 166883137 && i_28_ == -849141485 * ((Class534) this).anInt7078)
					class282_sub53.method13475(-312046384);
				else {
					if (null == class282_sub23) {
						class282_sub23 = method11416((byte) -90);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
						i = -1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index);
						class282_sub23.aClass282_Sub35_Sub2_7682.index += 2064013562;
						i_26_ = 0;
						i_27_ = 0;
					}
					int i_30_;
					int i_31_;
					int i_32_;
					if (((Class534) this).aLong7076 * 2966128844247041579L != -1L) {
						i_30_ = i_29_ - 166883137 * ((Class534) this).anInt7075;
						i_31_ = i_28_ - ((Class534) this).anInt7078 * -849141485;
						i_32_ = (int) ((class282_sub53.method13471(-250066231) - (2966128844247041579L * ((Class534) this).aLong7076)) / 20L);
						i_26_ += (class282_sub53.method13471(1274258991) - (((Class534) this).aLong7076 * 2966128844247041579L)) % 20L;
					} else {
						i_30_ = i_29_;
						i_31_ = i_28_;
						i_32_ = 2147483647;
					}
					((Class534) this).anInt7075 = i_29_ * 802300097;
					((Class534) this).anInt7078 = -2119577317 * i_28_;
					if (i_32_ < 8 && i_30_ >= -32 && i_30_ <= 31 && i_31_ >= -32 && i_31_ <= 31) {
						i_30_ += 32;
						i_31_ += 32;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_31_ + ((i_30_ << 6) + (i_32_ << 12)), 1417031095);
					} else if (i_32_ < 32 && i_30_ >= -128 && i_30_ <= 127 && i_31_ >= -128 && i_31_ <= 127) {
						i_30_ += 128;
						i_31_ += 128;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_32_ + 128);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_30_ << 8) + i_31_, 1417031095);
					} else if (i_32_ < 32) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(192 + i_32_);
						if (i_29_ == -1 || i_28_ == -1)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_29_ | i_28_ << 16);
					} else {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_32_ & 0x1fff) + 57344, 1417031095);
						if (-1 == i_29_ || -1 == i_28_)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_29_ | i_28_ << 16);
					}
					i_27_++;
					method11413(class282_sub23.aClass282_Sub35_Sub2_7682, class282_sub53, 1182738603);
					((Class534) this).aLong7076 = (class282_sub53.method13471(-477865889) * 1203484888895588483L);
					class282_sub53.method13475(-848779405);
				}
			}
			if (null != class282_sub23) {
				class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291) - i, -1060479548);
				int i_33_ = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i;
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_26_ / i_27_);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_26_ % i_27_);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i_33_;
				client.aClass184_7475.method3049(class282_sub23, 596584401);
			}
		}
		method11414(-1192965394);
	}

	void method11430() {
		if (method11423(1369259428)) {
			Class282_Sub23 class282_sub23 = null;
			int i = 0;
			int i_34_ = 0;
			int i_35_ = 0;
			Iterator iterator = ((Class534) this).aClass482_7077.iterator();
			while (iterator.hasNext()) {
				Class282_Sub53 class282_sub53 = (Class282_Sub53) iterator.next();
				if (class282_sub23 != null && (-1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index) - i >= 252 - (6 + method11412(-1260784789))))
					break;
				class282_sub53.method4991(-371378792);
				int i_36_ = class282_sub53.method13469(2034837568);
				if (i_36_ < -1)
					i_36_ = -1;
				else if (i_36_ > 65534)
					i_36_ = 65534;
				int i_37_ = class282_sub53.method13481(1467319281);
				if (i_37_ < -1)
					i_37_ = -1;
				else if (i_37_ > 65534)
					i_37_ = 65534;
				if (i_37_ == ((Class534) this).anInt7075 * 166883137 && i_36_ == -849141485 * ((Class534) this).anInt7078)
					class282_sub53.method13475(650631207);
				else {
					if (null == class282_sub23) {
						class282_sub23 = method11416((byte) 81);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(0);
						i = -1990677291 * (class282_sub23.aClass282_Sub35_Sub2_7682.index);
						class282_sub23.aClass282_Sub35_Sub2_7682.index += 2064013562;
						i_34_ = 0;
						i_35_ = 0;
					}
					int i_38_;
					int i_39_;
					int i_40_;
					if (((Class534) this).aLong7076 * 2966128844247041579L != -1L) {
						i_38_ = i_37_ - 166883137 * ((Class534) this).anInt7075;
						i_39_ = i_36_ - ((Class534) this).anInt7078 * -849141485;
						i_40_ = (int) ((class282_sub53.method13471(1015502366) - (2966128844247041579L * ((Class534) this).aLong7076)) / 20L);
						i_34_ += (class282_sub53.method13471(203095497) - (((Class534) this).aLong7076 * 2966128844247041579L)) % 20L;
					} else {
						i_38_ = i_37_;
						i_39_ = i_36_;
						i_40_ = 2147483647;
					}
					((Class534) this).anInt7075 = i_37_ * 802300097;
					((Class534) this).anInt7078 = -2119577317 * i_36_;
					if (i_40_ < 8 && i_38_ >= -32 && i_38_ <= 31 && i_39_ >= -32 && i_39_ <= 31) {
						i_38_ += 32;
						i_39_ += 32;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort(i_39_ + ((i_38_ << 6) + (i_40_ << 12)), 1417031095);
					} else if (i_40_ < 32 && i_38_ >= -128 && i_38_ <= 127 && i_39_ >= -128 && i_39_ <= 127) {
						i_38_ += 128;
						i_39_ += 128;
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_40_ + 128);
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_38_ << 8) + i_39_, 1417031095);
					} else if (i_40_ < 32) {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(192 + i_40_);
						if (i_37_ == -1 || i_36_ == -1)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_37_ | i_36_ << 16);
					} else {
						class282_sub23.aClass282_Sub35_Sub2_7682.writeShort((i_40_ & 0x1fff) + 57344, 1417031095);
						if (-1 == i_37_ || -1 == i_36_)
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(-2147483648);
						else
							class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_37_ | i_36_ << 16);
					}
					i_35_++;
					method11413(class282_sub23.aClass282_Sub35_Sub2_7682, class282_sub53, 1583978467);
					((Class534) this).aLong7076 = (class282_sub53.method13471(1161336255) * 1203484888895588483L);
					class282_sub53.method13475(566490460);
				}
			}
			if (null != class282_sub23) {
				class282_sub23.aClass282_Sub35_Sub2_7682.method13061((class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291) - i, 456523800);
				int i_41_ = (class282_sub23.aClass282_Sub35_Sub2_7682.index * -1990677291);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i;
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_34_ / i_35_);
				class282_sub23.aClass282_Sub35_Sub2_7682.writeByte(i_34_ % i_35_);
				class282_sub23.aClass282_Sub35_Sub2_7682.index = -1115476867 * i_41_;
				client.aClass184_7475.method3049(class282_sub23, 171832005);
			}
		}
		method11414(-2072994171);
	}

	abstract void method11431();

	void method11432() {
		((Class534) this).aClass482_7077.method8118(427310995);
		((Class534) this).aLong7074 = -1393221467304339443L;
		((Class534) this).aLong7076 = -1203484888895588483L;
		((Class534) this).anInt7075 = -802300097;
		((Class534) this).anInt7078 = 2119577317;
	}

	void method11433() {
		((Class534) this).aClass482_7077.method8118(-1123619296);
		((Class534) this).aLong7074 = -1393221467304339443L;
		((Class534) this).aLong7076 = -1203484888895588483L;
		((Class534) this).anInt7075 = -802300097;
		((Class534) this).anInt7078 = 2119577317;
	}

	abstract boolean method11434();

	void method11435(Class282_Sub53 class282_sub53) {
		((Class534) this).aClass482_7077.method8059(class282_sub53, 1748816746);
	}

	int method11436(Class282_Sub53 class282_sub53, int i) {
		long l;
		if (((Class534) this).aLong7074 * 4875607950991837499L == -1L)
			l = (long) i;
		else {
			l = (class282_sub53.method13471(-93666140) - 4875607950991837499L * ((Class534) this).aLong7074);
			if (l > (long) i)
				l = (long) i;
		}
		((Class534) this).aLong7074 = class282_sub53.method13471(754542037) * 1393221467304339443L;
		return (int) l;
	}

	int method11437(Class282_Sub53 class282_sub53, int i) {
		long l;
		if (((Class534) this).aLong7074 * 4875607950991837499L == -1L)
			l = (long) i;
		else {
			l = (class282_sub53.method13471(323464137) - 4875607950991837499L * ((Class534) this).aLong7074);
			if (l > (long) i)
				l = (long) i;
		}
		((Class534) this).aLong7074 = class282_sub53.method13471(-535786084) * 1393221467304339443L;
		return (int) l;
	}

	static final void method11438(CS2Executor class527, byte i) {
		int i_42_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_42_, (byte) 76);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_42_ >> 16];
		Class185.method3078(class118, class98, class527, -1906837964);
	}

	static final void method11439(CS2Executor class527, int i) {
		int i_43_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		int i_44_ = i_43_ >> 14 & 0x3fff;
		int i_45_ = i_43_ & 0x3fff;
		Class219 class219 = client.aClass257_7353.method4519(2060657850);
		i_44_ -= class219.anInt2711 * 1948093437;
		if (i_44_ < 0)
			i_44_ = 0;
		else if (i_44_ >= client.aClass257_7353.method4424(1745707366))
			i_44_ = client.aClass257_7353.method4424(564190904);
		i_45_ -= class219.anInt2712 * -1002240017;
		if (i_45_ < 0)
			i_45_ = 0;
		else if (i_45_ >= client.aClass257_7353.method4451(-500504359))
			i_45_ = client.aClass257_7353.method4451(-160695726);
		client.anInt7262 = 2146249857 * (256 + (i_44_ << 9));
		client.anInt7376 = (256 + (i_45_ << 9)) * -1818102377;
		Class262.anInt3240 = 1540976692;
		Class86.anInt833 = -1509271845;
		Class508.anInt5864 = 987778595;
	}

	static final void method11440(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		int i_46_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]);
		int i_47_ = (((CS2Executor) class527).intStack[1 + ((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_48_ = (((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012 + 2]);
		Class96_Sub10.method14603(1, i_46_ << 16 | i_47_, i_48_, "", (byte) 25);
	}

	static void method11441(byte i) {
		if (-2115839039 * Class179.anInt2226 > 0) {
			int i_49_ = 0;
			for (int i_50_ = 0; i_50_ < Class13.aStringArray129.length; i_50_++) {
				if (Class13.aStringArray129[i_50_].indexOf("--> ") != -1 && ++i_49_ == Class179.anInt2226 * -2115839039) {
					Class179.aString2225 = (Class13.aStringArray129[i_50_].substring(Class13.aStringArray129[i_50_].indexOf('>') + 2));
					break;
				}
			}
		} else
			Class179.aString2225 = "";
	}
}
