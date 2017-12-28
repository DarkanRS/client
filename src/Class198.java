/* Class198 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class198 {
	Class290 aClass290_2437;
	static final int anInt2438 = 70;
	public int anInt2439;
	public int anInt2440;
	int anInt2441;
	public int anInt2442;
	public int anInt2443;
	int anInt2444;
	int anInt2445;
	public int anInt2446 = 2013284631;
	int anInt2447;

	public Class160 method3204(Class505 class505) {
		if (-940773669 * ((Class198) this).anInt2441 < 0)
			return method3207(class505, -976132451);
		Class160 class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-940773669 * ((Class198) this).anInt2441)));
		if (class160 == null) {
			method3211(class505, (byte) 57);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-940773669 * ((Class198) this).anInt2441)));
		}
		return class160;
	}

	public Class160 method3205(Class505 class505) {
		if (-1811392407 * ((Class198) this).anInt2445 < 0)
			return null;
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))));
		if (class160 == null) {
			method3211(class505, (byte) 46);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1811392407 * ((Class198) this).anInt2445)));
		}
		return class160;
	}

	void method3206(RsByteBuffer class282_sub35, int i, int i_0_) {
		if (1 == i)
			class282_sub35.readUnsignedShort();
		else if (i == 2)
			anInt2446 = class282_sub35.readUnsignedByte() * 664772585;
		else if (3 == i)
			anInt2440 = class282_sub35.readUnsignedByte() * -722509891;
		else if (i == 4)
			anInt2439 = 0;
		else if (5 == i)
			anInt2443 = class282_sub35.readUnsignedShort() * 514692599;
		else if (i == 6)
			class282_sub35.readUnsignedByte();
		else if (7 == i)
			((Class198) this).anInt2444 = class282_sub35.readBigSmart(2069704994) * 558441445;
		else if (i == 8)
			((Class198) this).anInt2445 = class282_sub35.readBigSmart(2110884240) * 413841369;
		else if (9 == i)
			((Class198) this).anInt2441 = class282_sub35.readBigSmart(1977844584) * 134962515;
		else if (10 == i)
			((Class198) this).anInt2447 = class282_sub35.readBigSmart(2120650847) * 1272096869;
		else if (i == 11)
			anInt2439 = class282_sub35.readUnsignedShort() * -1198621823;
	}

	public Class160 method3207(Class505 class505, int i) {
		if (((Class198) this).anInt2444 * 1794138605 < 0)
			return null;
		Class160 class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605)));
		if (class160 == null) {
			method3211(class505, (byte) 74);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605)));
		}
		return class160;
	}

	public Class160 method3208(Class505 class505, int i) {
		if (-1811392407 * ((Class198) this).anInt2445 < 0)
			return null;
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))));
		if (class160 == null) {
			method3211(class505, (byte) 2);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1811392407 * ((Class198) this).anInt2445)));
		}
		return class160;
	}

	public Class160 method3209(Class505 class505) {
		if (((Class198) this).anInt2447 * -1781806739 < 0)
			return method3208(class505, 549654584);
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1781806739 * ((Class198) this).anInt2447))));
		if (null == class160) {
			method3211(class505, (byte) 32);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1781806739 * ((Class198) this).anInt2447)));
		}
		return class160;
	}

	void method3210(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (0 == i_1_)
				break;
			method3206(class282_sub35, i_1_, -1413100161);
		}
	}

	void method3211(Class505 class505, byte i) {
		Class317 class317 = ((Class290) ((Class198) this).aClass290_2437).aClass317_3448;
		if (((Class198) this).anInt2444 * 1794138605 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605))) == null && class317.method5661(((Class198) this).anInt2444 * 1794138605, -1437687942)) {
			Class91 class91 = Class91.method1515(class317, ((Class198) this).anInt2444 * 1794138605);
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (1794138605 * ((Class198) this).anInt2444));
		}
		if (((Class198) this).anInt2445 * -1811392407 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))) == null && class317.method5661(((Class198) this).anInt2445 * -1811392407, 2010871682)) {
			Class91 class91 = Class91.method1515(class317, -1811392407 * (((Class198) this).anInt2445));
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (-1811392407 * ((Class198) this).anInt2445));
		}
		if (-940773669 * ((Class198) this).anInt2441 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-940773669 * ((Class198) this).anInt2441))) == null && class317.method5661(-940773669 * ((Class198) this).anInt2441, 121971957)) {
			Class91 class91 = Class91.method1515(class317, ((Class198) this).anInt2441 * -940773669);
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (((Class198) this).anInt2441 * -940773669));
		}
		if (-1781806739 * ((Class198) this).anInt2447 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2447 * -1781806739))) == null && class317.method5661(((Class198) this).anInt2447 * -1781806739, -11371692)) {
			Class91 class91 = Class91.method1515(class317, (((Class198) this).anInt2447 * -1781806739));
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (-1781806739 * ((Class198) this).anInt2447));
		}
	}

	void method3212(Class505 class505) {
		Class317 class317 = ((Class290) ((Class198) this).aClass290_2437).aClass317_3448;
		if (((Class198) this).anInt2444 * 1794138605 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605))) == null && class317.method5661(((Class198) this).anInt2444 * 1794138605, 276215187)) {
			Class91 class91 = Class91.method1515(class317, ((Class198) this).anInt2444 * 1794138605);
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (1794138605 * ((Class198) this).anInt2444));
		}
		if (((Class198) this).anInt2445 * -1811392407 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))) == null && class317.method5661(((Class198) this).anInt2445 * -1811392407, -1081835064)) {
			Class91 class91 = Class91.method1515(class317, -1811392407 * (((Class198) this).anInt2445));
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (-1811392407 * ((Class198) this).anInt2445));
		}
		if (-940773669 * ((Class198) this).anInt2441 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-940773669 * ((Class198) this).anInt2441))) == null && class317.method5661(-940773669 * ((Class198) this).anInt2441, 151049182)) {
			Class91 class91 = Class91.method1515(class317, ((Class198) this).anInt2441 * -940773669);
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (((Class198) this).anInt2441 * -940773669));
		}
		if (-1781806739 * ((Class198) this).anInt2447 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2447 * -1781806739))) == null && class317.method5661(((Class198) this).anInt2447 * -1781806739, 1110755666)) {
			Class91 class91 = Class91.method1515(class317, (((Class198) this).anInt2447 * -1781806739));
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (-1781806739 * ((Class198) this).anInt2447));
		}
	}

	void method3213(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method3206(class282_sub35, i, -1301053652);
		}
	}

	Class198() {
		anInt2440 = 443571523;
		anInt2439 = 1198621823;
		anInt2442 = -16828887;
		anInt2443 = 1668743562;
		((Class198) this).anInt2444 = -558441445;
		((Class198) this).anInt2445 = -413841369;
		((Class198) this).anInt2441 = -134962515;
		((Class198) this).anInt2447 = -1272096869;
	}

	void method3214(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			class282_sub35.readUnsignedShort();
		else if (i == 2)
			anInt2446 = class282_sub35.readUnsignedByte() * 664772585;
		else if (3 == i)
			anInt2440 = class282_sub35.readUnsignedByte() * -722509891;
		else if (i == 4)
			anInt2439 = 0;
		else if (5 == i)
			anInt2443 = class282_sub35.readUnsignedShort() * 514692599;
		else if (i == 6)
			class282_sub35.readUnsignedByte();
		else if (7 == i)
			((Class198) this).anInt2444 = class282_sub35.readBigSmart(1958736854) * 558441445;
		else if (i == 8)
			((Class198) this).anInt2445 = class282_sub35.readBigSmart(2141977962) * 413841369;
		else if (9 == i)
			((Class198) this).anInt2441 = class282_sub35.readBigSmart(2075646900) * 134962515;
		else if (10 == i)
			((Class198) this).anInt2447 = class282_sub35.readBigSmart(2087051588) * 1272096869;
		else if (i == 11)
			anInt2439 = class282_sub35.readUnsignedShort() * -1198621823;
	}

	public Class160 method3215(Class505 class505) {
		if (((Class198) this).anInt2444 * 1794138605 < 0)
			return null;
		Class160 class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605)));
		if (class160 == null) {
			method3211(class505, (byte) 36);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605)));
		}
		return class160;
	}

	void method3216(RsByteBuffer class282_sub35, int i) {
		if (1 == i)
			class282_sub35.readUnsignedShort();
		else if (i == 2)
			anInt2446 = class282_sub35.readUnsignedByte() * 664772585;
		else if (3 == i)
			anInt2440 = class282_sub35.readUnsignedByte() * -722509891;
		else if (i == 4)
			anInt2439 = 0;
		else if (5 == i)
			anInt2443 = class282_sub35.readUnsignedShort() * 514692599;
		else if (i == 6)
			class282_sub35.readUnsignedByte();
		else if (7 == i)
			((Class198) this).anInt2444 = class282_sub35.readBigSmart(1989884192) * 558441445;
		else if (i == 8)
			((Class198) this).anInt2445 = class282_sub35.readBigSmart(1985032983) * 413841369;
		else if (9 == i)
			((Class198) this).anInt2441 = class282_sub35.readBigSmart(2052175607) * 134962515;
		else if (10 == i)
			((Class198) this).anInt2447 = class282_sub35.readBigSmart(2113835627) * 1272096869;
		else if (i == 11)
			anInt2439 = class282_sub35.readUnsignedShort() * -1198621823;
	}

	public Class160 method3217(Class505 class505) {
		if (((Class198) this).anInt2444 * 1794138605 < 0)
			return null;
		Class160 class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605)));
		if (class160 == null) {
			method3211(class505, (byte) -14);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605)));
		}
		return class160;
	}

	public Class160 method3218(Class505 class505) {
		if (-1811392407 * ((Class198) this).anInt2445 < 0)
			return null;
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))));
		if (class160 == null) {
			method3211(class505, (byte) 56);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1811392407 * ((Class198) this).anInt2445)));
		}
		return class160;
	}

	public Class160 method3219(Class505 class505) {
		if (-1811392407 * ((Class198) this).anInt2445 < 0)
			return null;
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))));
		if (class160 == null) {
			method3211(class505, (byte) 105);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1811392407 * ((Class198) this).anInt2445)));
		}
		return class160;
	}

	public Class160 method3220(Class505 class505) {
		if (-1811392407 * ((Class198) this).anInt2445 < 0)
			return null;
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))));
		if (class160 == null) {
			method3211(class505, (byte) 13);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1811392407 * ((Class198) this).anInt2445)));
		}
		return class160;
	}

	public Class160 method3221(Class505 class505) {
		if (-1811392407 * ((Class198) this).anInt2445 < 0)
			return null;
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))));
		if (class160 == null) {
			method3211(class505, (byte) 77);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1811392407 * ((Class198) this).anInt2445)));
		}
		return class160;
	}

	public Class160 method3222(Class505 class505, int i) {
		if (-940773669 * ((Class198) this).anInt2441 < 0)
			return method3207(class505, -1561879417);
		Class160 class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-940773669 * ((Class198) this).anInt2441)));
		if (class160 == null) {
			method3211(class505, (byte) 15);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-940773669 * ((Class198) this).anInt2441)));
		}
		return class160;
	}

	public Class160 method3223(Class505 class505) {
		if (((Class198) this).anInt2447 * -1781806739 < 0)
			return method3208(class505, 549654584);
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1781806739 * ((Class198) this).anInt2447))));
		if (null == class160) {
			method3211(class505, (byte) -12);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1781806739 * ((Class198) this).anInt2447)));
		}
		return class160;
	}

	public Class160 method3224(Class505 class505, int i) {
		if (((Class198) this).anInt2447 * -1781806739 < 0)
			return method3208(class505, 549654584);
		Class160 class160 = ((Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1781806739 * ((Class198) this).anInt2447))));
		if (null == class160) {
			method3211(class505, (byte) -2);
			class160 = (Class160) (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-1781806739 * ((Class198) this).anInt2447)));
		}
		return class160;
	}

	void method3225(Class505 class505) {
		Class317 class317 = ((Class290) ((Class198) this).aClass290_2437).aClass317_3448;
		if (((Class198) this).anInt2444 * 1794138605 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605))) == null && class317.method5661(((Class198) this).anInt2444 * 1794138605, -1156578481)) {
			Class91 class91 = Class91.method1515(class317, ((Class198) this).anInt2444 * 1794138605);
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (1794138605 * ((Class198) this).anInt2444));
		}
		if (((Class198) this).anInt2445 * -1811392407 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))) == null && class317.method5661(((Class198) this).anInt2445 * -1811392407, -815565742)) {
			Class91 class91 = Class91.method1515(class317, -1811392407 * (((Class198) this).anInt2445));
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (-1811392407 * ((Class198) this).anInt2445));
		}
		if (-940773669 * ((Class198) this).anInt2441 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-940773669 * ((Class198) this).anInt2441))) == null && class317.method5661(-940773669 * ((Class198) this).anInt2441, -168293336)) {
			Class91 class91 = Class91.method1515(class317, ((Class198) this).anInt2441 * -940773669);
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (((Class198) this).anInt2441 * -940773669));
		}
		if (-1781806739 * ((Class198) this).anInt2447 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2447 * -1781806739))) == null && class317.method5661(((Class198) this).anInt2447 * -1781806739, 1506460876)) {
			Class91 class91 = Class91.method1515(class317, (((Class198) this).anInt2447 * -1781806739));
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (-1781806739 * ((Class198) this).anInt2447));
		}
	}

	void method3226(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method3206(class282_sub35, i, -1271919401);
		}
	}

	void method3227(Class505 class505) {
		Class317 class317 = ((Class290) ((Class198) this).aClass290_2437).aClass317_3448;
		if (((Class198) this).anInt2444 * 1794138605 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2444 * 1794138605))) == null && class317.method5661(((Class198) this).anInt2444 * 1794138605, -1187962781)) {
			Class91 class91 = Class91.method1515(class317, ((Class198) this).anInt2444 * 1794138605);
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (1794138605 * ((Class198) this).anInt2444));
		}
		if (((Class198) this).anInt2445 * -1811392407 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2445 * -1811392407))) == null && class317.method5661(((Class198) this).anInt2445 * -1811392407, -1981993531)) {
			Class91 class91 = Class91.method1515(class317, -1811392407 * (((Class198) this).anInt2445));
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (-1811392407 * ((Class198) this).anInt2445));
		}
		if (-940773669 * ((Class198) this).anInt2441 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (-940773669 * ((Class198) this).anInt2441))) == null && class317.method5661(-940773669 * ((Class198) this).anInt2441, 23223642)) {
			Class91 class91 = Class91.method1515(class317, ((Class198) this).anInt2441 * -940773669);
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (((Class198) this).anInt2441 * -940773669));
		}
		if (-1781806739 * ((Class198) this).anInt2447 >= 0 && (((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3865((long) (((Class198) this).anInt2447 * -1781806739))) == null && class317.method5661(((Class198) this).anInt2447 * -1781806739, 981173802)) {
			Class91 class91 = Class91.method1515(class317, (((Class198) this).anInt2447 * -1781806739));
			((Class290) ((Class198) this).aClass290_2437).aClass229_3447.method3856(class505.method8444(class91, true), (long) (-1781806739 * ((Class198) this).anInt2447));
		}
	}

	static final void method3228(Class527 class527, byte i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_2_ = (((Class527) class527).anIntArray6999[((Class527) class527).anInt7012 * 1942118537]);
		int i_3_ = (((Class527) class527).anIntArray6999[1 + ((Class527) class527).anInt7012 * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class252.method4327(i_2_, i_3_, false, false, (byte) -108);
	}

	static final void method3229(Class527 class527, int i) {
		int i_4_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = (Class119.aClass426_1463.getItemDefinitions(i_4_, 1626966641).anInt5050 * -1728731771);
	}

	static void method3230(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, byte i_11_) {
		int i_12_ = i_10_ + i_6_;
		int i_13_ = i_7_ - i_10_;
		for (int i_14_ = i_6_; i_14_ < i_12_; i_14_++)
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_14_], i, i_5_, i_9_, (byte) 42);
		for (int i_15_ = i_7_; i_15_ > i_13_; i_15_--)
			Class232.method3922(Class532_Sub1.anIntArrayArray7072[i_15_], i, i_5_, i_9_, (byte) 20);
		int i_16_ = i + i_10_;
		int i_17_ = i_5_ - i_10_;
		for (int i_18_ = i_12_; i_18_ <= i_13_; i_18_++) {
			int[] is = Class532_Sub1.anIntArrayArray7072[i_18_];
			Class232.method3922(is, i, i_16_, i_9_, (byte) -24);
			Class232.method3922(is, i_16_, i_17_, i_8_, (byte) -35);
			Class232.method3922(is, i_17_, i_5_, i_9_, (byte) -33);
		}
	}

	static final void method3231(int i, int i_19_, int i_20_, int i_21_, boolean bool, int i_22_) {
		if (client.aClass257_7353.method4430(-2133910723) == null)
			Class316.aClass505_3680.method8425(i, i_19_, i_20_, i_21_, -16777216, (byte) -114);
		else {
			Class385 class385 = (Class84.myPlayer.method11166().aClass385_3595);
			boolean bool_23_ = false;
			if (1 != -891719545 * client.anInt7341) {
				if (!client.aBool7321)
					bool_23_ = true;
			} else if ((int) class385.aFloat4671 < 0 || ((int) class385.aFloat4671 >= client.aClass257_7353.method4424(56329418) * 512) || (int) class385.aFloat4673 < 0 || ((int) class385.aFloat4673 >= (client.aClass257_7353.method4451(-639715489) * 512)))
				bool_23_ = true;
			if (bool_23_)
				Class316.aClass505_3680.method8425(i, i_19_, i_20_, i_21_, -16777216, (byte) -104);
			else {
				client.anInt7286 += 1895928101;
				if (null != Class84.myPlayer && ((int) class385.aFloat4671 - (Class84.myPlayer.method15805(828768449) - 1) * 256) >> 9 == Class187.anInt2361 * 895508675 && (((int) class385.aFloat4673 - (Class84.myPlayer.method15805(828768449) - 1) * 256) >> 9 == Class187.anInt2359 * -1068588689)) {
					Class187.anInt2361 = 134656021;
					Class187.anInt2359 = 818291313;
					Class282_Sub20_Sub9.method15255((short) -25188);
				}
				Class52_Sub3.method14519((short) -3339);
				if (!bool)
					Class113.method1883(-782258901);
				Class258.method4569(2030083664);
				Class492.method8265(i, i_19_, i_20_, i_21_, true, (byte) 63);
				i = client.anInt7444 * -1007294471;
				i_19_ = client.anInt7445 * 915815265;
				i_20_ = 1064588657 * client.anInt7188;
				i_21_ = 292041583 * client.anInt7440;
				Class380.method6451(i, i_19_, -1689058679);
				if (Class262.anInt3240 * -672443707 == 2) {
					int i_24_ = (int) client.aFloat7146;
					if (client.anInt7273 * 1661251369 >> 8 > i_24_)
						i_24_ = client.anInt7273 * 1661251369 >> 8;
					if (client.aBoolArray7431[4] && 128 + client.anIntArray7433[4] > i_24_)
						i_24_ = 128 + client.anIntArray7433[4];
					int i_25_ = ((client.anInt7343 * -297983899 + (int) client.aFloat7365) & 0x3fff);
					Class387.method6683(1762352089 * Class11.anInt122, Class504.method8389((int) class385.aFloat4671, (int) class385.aFloat4673, 675588453 * Class4.anInt35, (byte) 13) - 200, 518160421 * Class266.anInt3289, i_24_, i_25_, 600 + (i_24_ >> 3) * 3 << 2, i_21_, 1262873702);
				} else if (4 == -672443707 * Class262.anInt3240) {
					int i_26_ = (int) client.aFloat7146;
					if (client.anInt7273 * 1661251369 >> 8 > i_26_)
						i_26_ = 1661251369 * client.anInt7273 >> 8;
					if (client.aBoolArray7431[4] && client.anIntArray7433[4] + 128 > i_26_)
						i_26_ = 128 + client.anIntArray7433[4];
					int i_27_ = (int) client.aFloat7365 & 0x3fff;
					Class387.method6683(Class11.anInt122 * 1762352089, Class504.method8389(61805441 * client.anInt7262, client.anInt7376 * -1032332761, Class4.anInt35 * 675588453, (byte) 101) - 200, Class266.anInt3289 * 518160421, i_26_, i_27_, 600 + (i_26_ >> 3) * 3 << 2, i_21_, 1318646026);
				} else if (1 == -672443707 * Class262.anInt3240)
					Class232.method3920(i_21_, -491570614);
				int i_28_ = Class31.anInt361 * -360258135;
				int i_29_ = Class109_Sub1.anInt9384 * 1929945579;
				int i_30_ = 413271601 * Class246.anInt3029;
				int i_31_ = Class293.anInt3512 * 726126721;
				int i_32_ = 1236051449 * Class518.anInt5930;
				for (int i_33_ = 0; i_33_ < 5; i_33_++) {
					if (client.aBoolArray7431[i_33_]) {
						int i_34_ = (int) ((Math.random() * (double) (1 + (client.anIntArray7268[i_33_]) * 2)) - (double) client.anIntArray7268[i_33_] + (Math.sin((double) (client.anIntArray7435[i_33_]) * ((double) (client.anIntArray7462[i_33_]) / 100.0)) * (double) (client.anIntArray7433[i_33_])));
						if (i_33_ == 0)
							Class31.anInt361 += (i_34_ << 2) * -2043310439;
						if (1 == i_33_)
							Class109_Sub1.anInt9384 += -126779709 * (i_34_ << 2);
						if (i_33_ == 2)
							Class246.anInt3029 += (i_34_ << 2) * 1442943697;
						if (3 == i_33_)
							Class518.anInt5930 = (1898253385 * (i_34_ + 1236051449 * Class518.anInt5930 & 0x3fff));
						if (4 == i_33_) {
							Class293.anInt3512 += -647467135 * i_34_;
							if (Class293.anInt3512 * 726126721 < 1024)
								Class293.anInt3512 = -1581382656;
							else if (726126721 * Class293.anInt3512 > 3072)
								Class293.anInt3512 = -449180672;
						}
					}
				}
				if (Class31.anInt361 * -360258135 < 0)
					Class31.anInt361 = 0;
				if (-360258135 * Class31.anInt361 > ((client.aClass257_7353.method4430(-2044226179).anInt2617 * -1912960305) << 9) - 1)
					Class31.anInt361 = (((client.aClass257_7353.method4430(-1540309436).anInt2617) * -1912960305 << 9) - 1) * -2043310439;
				if (413271601 * Class246.anInt3029 < 0)
					Class246.anInt3029 = 0;
				if (413271601 * Class246.anInt3029 > ((client.aClass257_7353.method4430(-1972336821).anInt2603 * -18177099) << 9) - 1)
					Class246.anInt3029 = (((client.aClass257_7353.method4430(-1780427901).anInt2603) * -18177099 << 9) - 1) * 1442943697;
				Class429.method7215((byte) 2);
				Class316.aClass505_3680.method8617(i, i_19_, i_20_, i_21_);
				Class316.aClass505_3680.r(i, i_19_, i + i_20_, i_21_ + i_19_);
				Class535 class535 = client.aClass257_7353.method4435((byte) 1).method4038((short) 4699);
				int i_35_ = class535.method11450(522743760);
				client.aClass294_7457.method5223((float) -(-360258135 * Class31.anInt361), (float) -(Class109_Sub1.anInt9384 * 1929945579), (float) -(413271601 * Class246.anInt3029));
				client.aClass294_7457.method5220(0.0F, -1.0F, 0.0F, Class382.method6508(-(1236051449 * Class518.anInt5930) & 0x3fff));
				client.aClass294_7457.method5220(-1.0F, 0.0F, 0.0F, Class382.method6508(-(Class293.anInt3512 * 726126721) & 0x3fff));
				client.aClass294_7457.method5220(0.0F, 0.0F, -1.0F, Class382.method6508(-(Class121.anInt1525 * -370288779) & 0x3fff));
				Class316.aClass505_3680.method8457(client.aClass294_7457);
				Class228.method3850(client.aClass384_7167, true, (float) (i_20_ / 2), (float) (i_21_ / 2), (float) (client.anInt7451 * 1010147487 << 1), (float) (client.anInt7451 * 1010147487 << 1), i_20_, i_21_, (byte) 116);
				Class316.aClass505_3680.method8424(client.aClass384_7167);
				if (class535.method11451(1476624725) != null) {
					Class316.aClass505_3680.IA(1.0F);
					Class316.aClass505_3680.m(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
					class535.method11451(1476624725).method4215(Class316.aClass505_3680, -1528395687 * Class388.anInt4723 << 3, i, i_19_, i_20_, i_21_, 726126721 * Class293.anInt3512, Class518.anInt5930 * 1236051449, Class121.anInt1525 * -370288779, i_35_, true, false, (byte) 14);
				} else
					Class316.aClass505_3680.ba(3, i_35_);
				Class412.method6934(client.aClass294_7457, client.aClass384_7167, i_20_, i_21_, (byte) -77);
				client.aClass257_7353.method4435((byte) 1).method4037(client.aClass257_7353, (byte) 57);
				byte i_36_ = (Class393.aClass282_Sub54_4783.aClass468_Sub27_8209.method12952((byte) 83) == 2 ? (byte) (48374445 * client.anInt7286) : (byte) 1);
				client.aClass257_7353.method4430(-1029746106).method3447(-1809259861 * client.cycles, Class31.anInt361 * -360258135, 1929945579 * Class109_Sub1.anInt9384, Class246.anInt3029 * 413271601, client.aClass257_7353.method4532(1227540505), client.anIntArray7198, client.anIntArray7303, client.anIntArray7194, client.anIntArray7305, client.anIntArray7306, Class84.myPlayer.aByte7967 + 1, i_36_, (int) class385.aFloat4671 >> 9, (int) class385.aFloat4673 >> 9,
						Class393.aClass282_Sub54_4783.aClass468_Sub26_8224.method12943(619789577) == 0, true, 0, true);
				client.anInt7396 += -752140529;
				Class282_Sub20_Sub24.method15391(-1221353280);
				if (13 == client.anInt7166 * -1741204137) {
					Class423.method7066(i, i_19_, i_20_, i_21_, 256, 256, (byte) -11);
					Class250.method4298(i, i_19_, i_20_, i_21_, 256, 256, (byte) -90);
					Class96_Sub12.method14612(i, i_19_, i_20_, i_21_, 256, 256, -927883680);
					Class163.method2844(i, i_19_, i_20_, i_21_, -869018249);
				}
				client.aClass257_7353.method4430(-1467332289).method3399((byte) 19);
				Class31.anInt361 = i_28_ * -2043310439;
				Class109_Sub1.anInt9384 = i_29_ * -126779709;
				Class246.anInt3029 = 1442943697 * i_30_;
				Class293.anInt3512 = i_31_ * -647467135;
				Class518.anInt5930 = i_32_ * 1898253385;
				if (client.aBool7172 && Class119.aClass312_1462.method5553((short) 26280) == 0)
					client.aBool7172 = false;
				if (client.aBool7172) {
					Class316.aClass505_3680.method8425(i, i_19_, i_20_, i_21_, -16777216, (byte) -43);
					Class446.method7447(Class433.aClass433_5251.method7273(Class223.aClass495_2772, -1334063717), false, Class316.aClass505_3680, Class16.aClass8_144, Class16.aClass414_139, (byte) -94);
				}
				Class228.method3850(client.aClass384_7167, false, (float) (i + i_20_ / 2), (float) (i_21_ / 2 + i_19_), (float) (client.anInt7451 * 1010147487 << 1), (float) (client.anInt7451 * 1010147487 << 1), i_20_, i_21_, (byte) 55);
				Class316.aClass505_3680.method8424(client.aClass384_7167);
				Class282_Sub39.method13296(client.aClass384_7167, 1454907005);
			}
		}
	}

	static final void method3232(Class527 class527, int i) {
		int i_37_ = (((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_37_, (byte) 92);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_37_ >> 16];
		Class282_Sub41_Sub1.method14700(class118, class98, class527, -442383470);
	}

	static final void method3233(Class527 class527, int i) {
		Class526.method11248(2004309168);
		client.aClass257_7353.method4547((byte) -90);
		Class190.method3148((byte) 38);
		client.aBool7175 = false;
	}
}
