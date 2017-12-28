/* Class282_Sub50_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class282_Sub50_Sub4 extends Class282_Sub50 {
	Class465 aClass465_9518;

	void method14747(RsByteBuffer class282_sub35, int i, byte i_0_) {
		if (249 == i) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (((Class282_Sub50_Sub4) this).aClass465_9518 == null) {
				int i_2_ = Class323.method5778(i_1_, -1925062571);
				((Class282_Sub50_Sub4) this).aClass465_9518 = new Class465(i_2_);
			}
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_4_ = class282_sub35.read24BitUnsignedInteger((short) 20945);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(288497349));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class282_Sub50_Sub4) this).aClass465_9518.method7765(class282, (long) i_4_);
			}
		}
	}

	void method14748(RsByteBuffer class282_sub35, byte i) {
		for (;;) {
			int i_5_ = class282_sub35.readUnsignedByte();
			if (i_5_ == 0) {
				if (i == 1)
					break;
				break;
			}
			method14747(class282_sub35, i_5_, (byte) 46);
		}
	}

	public String method14749(int i, String string) {
		if (((Class282_Sub50_Sub4) this).aClass465_9518 == null)
			return string;
		Class282_Sub47 class282_sub47 = (Class282_Sub47) ((Class282_Sub50_Sub4) this).aClass465_9518.method7754((long) i);
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	public int method14750(int i, int i_6_, byte i_7_) {
		if (((Class282_Sub50_Sub4) this).aClass465_9518 == null)
			return i_6_;
		Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class282_Sub50_Sub4) this).aClass465_9518.method7754((long) i);
		if (null == class282_sub38)
			return i_6_;
		return class282_sub38.anInt8002 * -570797415;
	}

	public String method14751(int i, String string, int i_8_) {
		if (((Class282_Sub50_Sub4) this).aClass465_9518 == null)
			return string;
		Class282_Sub47 class282_sub47 = (Class282_Sub47) ((Class282_Sub50_Sub4) this).aClass465_9518.method7754((long) i);
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	void method14752(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method14747(class282_sub35, i, (byte) 72);
		}
	}

	void method14753(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (i == 0)
				break;
			method14747(class282_sub35, i, (byte) 21);
		}
	}

	void method14754(RsByteBuffer class282_sub35, int i) {
		if (249 == i) {
			int i_9_ = class282_sub35.readUnsignedByte();
			if (((Class282_Sub50_Sub4) this).aClass465_9518 == null) {
				int i_10_ = Class323.method5778(i_9_, 781797865);
				((Class282_Sub50_Sub4) this).aClass465_9518 = new Class465(i_10_);
			}
			for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_12_ = class282_sub35.read24BitUnsignedInteger((short) 24774);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(775635941));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class282_Sub50_Sub4) this).aClass465_9518.method7765(class282, (long) i_12_);
			}
		}
	}

	Class282_Sub50_Sub4() {
		/* empty */
	}

	void method14755(RsByteBuffer class282_sub35, int i) {
		if (249 == i) {
			int i_13_ = class282_sub35.readUnsignedByte();
			if (((Class282_Sub50_Sub4) this).aClass465_9518 == null) {
				int i_14_ = Class323.method5778(i_13_, -280894682);
				((Class282_Sub50_Sub4) this).aClass465_9518 = new Class465(i_14_);
			}
			for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_16_ = class282_sub35.read24BitUnsignedInteger((short) 12573);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(1574624072));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class282_Sub50_Sub4) this).aClass465_9518.method7765(class282, (long) i_16_);
			}
		}
	}

	public int method14756(int i, int i_17_) {
		if (((Class282_Sub50_Sub4) this).aClass465_9518 == null)
			return i_17_;
		Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class282_Sub50_Sub4) this).aClass465_9518.method7754((long) i);
		if (null == class282_sub38)
			return i_17_;
		return class282_sub38.anInt8002 * -570797415;
	}

	public int method14757(int i, int i_18_) {
		if (((Class282_Sub50_Sub4) this).aClass465_9518 == null)
			return i_18_;
		Class282_Sub38 class282_sub38 = (Class282_Sub38) ((Class282_Sub50_Sub4) this).aClass465_9518.method7754((long) i);
		if (null == class282_sub38)
			return i_18_;
		return class282_sub38.anInt8002 * -570797415;
	}

	public String method14758(int i, String string) {
		if (((Class282_Sub50_Sub4) this).aClass465_9518 == null)
			return string;
		Class282_Sub47 class282_sub47 = (Class282_Sub47) ((Class282_Sub50_Sub4) this).aClass465_9518.method7754((long) i);
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	void method14759(RsByteBuffer class282_sub35, int i) {
		if (249 == i) {
			int i_19_ = class282_sub35.readUnsignedByte();
			if (((Class282_Sub50_Sub4) this).aClass465_9518 == null) {
				int i_20_ = Class323.method5778(i_19_, -1810445264);
				((Class282_Sub50_Sub4) this).aClass465_9518 = new Class465(i_20_);
			}
			for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_22_ = class282_sub35.read24BitUnsignedInteger((short) 25793);
				Class282 class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(481209285));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				((Class282_Sub50_Sub4) this).aClass465_9518.method7765(class282, (long) i_22_);
			}
		}
	}

	public String method14760(int i, String string) {
		if (((Class282_Sub50_Sub4) this).aClass465_9518 == null)
			return string;
		Class282_Sub47 class282_sub47 = (Class282_Sub47) ((Class282_Sub50_Sub4) this).aClass465_9518.method7754((long) i);
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}
}
