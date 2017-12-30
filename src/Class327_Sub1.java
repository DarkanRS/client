
/* Class327_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class327_Sub1 extends Class327 {
	boolean aBool7779;
	Class312 aClass312_7780;
	Class313 aClass313_7781;
	Class203 aClass203_7782;
	Class203 aClass203_7783;
	Class282_Sub50_Sub11 aClass282_Sub50_Sub11_7784;
	long aLong7785;
	byte[] aByteArray7786;
	int anInt7787;
	Class322 aClass322_7788;
	static final byte aByte7789 = 0;
	static final byte aByte7790 = 1;
	static final byte aByte7791 = -1;
	byte[] aByteArray7792;
	int anInt7793 = 0;
	int anInt7794;
	boolean aBool7795;
	Class465 aClass465_7796 = new Class465(16);
	int anInt7797 = 0;
	Class482 aClass482_7798;
	static final int anInt7799 = 2;
	static final int anInt7800 = 1;
	boolean aBool7801;
	static final int anInt7802 = 1000;
	static final int anInt7803 = 250;
	static CRC32 aCRC32_7804 = new CRC32();
	static final int anInt7805 = 0;
	int anInt7806;
	Class482 aClass482_7807 = new Class482();

	void method5812(int i) {
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			for (Class282 class282 = ((Class327_Sub1) this).aClass482_7807.method8097((byte) 23); null != class282; class282 = ((Class327_Sub1) this).aClass482_7807.method8067(290181019)) {
				if (-3442165056282524525L * class282.aLong3379 == (long) i)
					return;
			}
			Class282 class282 = new Class282();
			class282.aLong3379 = (long) i * -1253863389874800229L;
			((Class327_Sub1) this).aClass482_7807.method8059(class282, -1173351233);
		}
	}

	int method5806(int i, byte i_0_) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = ((Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11)
			return class282_sub50_sub11.method14943(-1369977403);
		return 0;
	}

	Class322 method5803(int i) {
		if (((Class327_Sub1) this).aClass322_7788 != null)
			return ((Class327_Sub1) this).aClass322_7788;
		if (((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 == null) {
			if (((Class327_Sub1) this).aClass312_7780.method5517(-1056221811))
				return null;
			((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = (((Class327_Sub1) this).aClass312_7780.method5515(255, 737076305 * ((Class327_Sub1) this).anInt7787, (byte) 0, true, (byte) 102));
		}
		if (((Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass282_Sub50_Sub11_7784).aBool9639)
			return null;
		byte[] is = ((Class327_Sub1) this).aClass282_Sub50_Sub11_7784.method14942(862505694);
		if (((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 instanceof Class282_Sub50_Sub11_Sub2) {
			try {
				if (is == null)
					throw new RuntimeException();
				((Class327_Sub1) this).aClass322_7788 = new Class322(is, (-1197578581 * ((Class327_Sub1) this).anInt7806), ((Class327_Sub1) this).aByteArray7786);
				if (1502635595 * ((Class322) (((Class327_Sub1) this).aClass322_7788)).anInt3735 != -1803818645 * ((Class327_Sub1) this).anInt7794)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				((Class327_Sub1) this).aClass322_7788 = null;
				if (((Class327_Sub1) this).aClass312_7780.method5517(-430209987))
					((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = null;
				else
					((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = (((Class327_Sub1) this).aClass312_7780.method5515(255, 737076305 * ((Class327_Sub1) this).anInt7787, (byte) 0, true, (byte) 22));
				return null;
			}
		} else {
			try {
				if (is == null)
					throw new RuntimeException();
				((Class327_Sub1) this).aClass322_7788 = new Class322(is, (((Class327_Sub1) this).anInt7806 * -1197578581), ((Class327_Sub1) this).aByteArray7786);
			} catch (RuntimeException runtimeexception) {
				((Class327_Sub1) this).aClass312_7780.method5520((byte) 0);
				((Class327_Sub1) this).aClass322_7788 = null;
				if (((Class327_Sub1) this).aClass312_7780.method5517(-2045697306))
					((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = null;
				else
					((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = (((Class327_Sub1) this).aClass312_7780.method5515(255, ((Class327_Sub1) this).anInt7787 * 737076305, (byte) 0, true, (byte) 12));
				return null;
			}
			if (null != ((Class327_Sub1) this).aClass203_7783)
				((Class327_Sub1) this).aClass313_7781.method5564(((Class327_Sub1) this).anInt7787 * 737076305, is, ((Class327_Sub1) this).aClass203_7783, -694199353);
		}
		((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = null;
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aByteArray7792 = new byte[(((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3740) * 1563136279];
			((Class327_Sub1) this).anInt7793 = 0;
		}
		return ((Class327_Sub1) this).aClass322_7788;
	}

	byte[] method5804(int i, int i_1_) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = method12546(i, 0, 242482231);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.method14942(-2100194534);
		class282_sub50_sub11.method4991(-371378792);
		return is;
	}

	Class282_Sub50_Sub11 method12539(int i, int i_2_) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = ((Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11 && 0 == i_2_ && !((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && ((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639) {
			class282_sub50_sub11.method4991(-371378792);
			class282_sub50_sub11 = null;
		}
		if (class282_sub50_sub11 == null) {
			if (i_2_ == 0) {
				if (((Class327_Sub1) this).aClass203_7782 != null && -1 != ((Class327_Sub1) this).aByteArray7792[i])
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass313_7781.method5578(i, ((Class327_Sub1) this).aClass203_7782, -1397235399));
				else if (!((Class327_Sub1) this).aClass312_7780.method5517(-879672011))
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) -46));
				else
					return null;
			} else if (i_2_ == 1) {
				if (null == ((Class327_Sub1) this).aClass203_7782)
					throw new RuntimeException();
				class282_sub50_sub11 = (((Class327_Sub1) this).aClass313_7781.method5567(i, ((Class327_Sub1) this).aClass203_7782, 1457301550));
			} else if (2 == i_2_) {
				if (null == ((Class327_Sub1) this).aClass203_7782)
					throw new RuntimeException();
				if (-1 != ((Class327_Sub1) this).aByteArray7792[i])
					throw new RuntimeException();
				if (!((Class327_Sub1) this).aClass312_7780.method5516(867066440))
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, false, (byte) 78));
				else
					return null;
			} else
				throw new RuntimeException();
			((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11, (long) i);
		}
		if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639)
			return null;
		byte[] is = class282_sub50_sub11.method14942(2007782401);
		if (class282_sub50_sub11 instanceof Class282_Sub50_Sub11_Sub2) {
			Class282_Sub50_Sub11 class282_sub50_sub11_3_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7804.reset();
				aCRC32_7804.update(is, 0, is.length - 2);
				int i_4_ = (int) aCRC32_7804.getValue();
				if (i_4_ != (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3745[i]))
					throw new RuntimeException();
				if (null != (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742) && (null != (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]))) {
					byte[] is_5_ = (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]);
					byte[] is_6_ = Class361.method6273(is, 0, is.length - 2, (byte) -40);
					for (int i_7_ = 0; i_7_ < 64; i_7_++) {
						if (is_6_[i_7_] != is_5_[i_7_])
							throw new RuntimeException();
					}
				}
				int i_8_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]) & 0xffff) != i_8_)
					throw new RuntimeException();
				if (1 != ((Class327_Sub1) this).aByteArray7792[i]) {
					if (0 != ((Class327_Sub1) this).aByteArray7792[i]) {
						/* empty */
					}
					((Class327_Sub1) this).anInt7793 += -1723048149;
					((Class327_Sub1) this).aByteArray7792[i] = (byte) 1;
				}
				if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
					class282_sub50_sub11.method4991(-371378792);
				class282_sub50_sub11_3_ = class282_sub50_sub11;
			} catch (Exception exception) {
				((Class327_Sub1) this).aByteArray7792[i] = (byte) -1;
				class282_sub50_sub11.method4991(-371378792);
				if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && !((Class327_Sub1) this).aClass312_7780.method5517(-493131273)) {
					Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) -92));
					((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
				}
				return null;
			}
			return class282_sub50_sub11_3_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7804.reset();
			aCRC32_7804.update(is, 0, is.length - 2);
			int i_9_ = (int) aCRC32_7804.getValue();
			if ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3745[i]) != i_9_)
				throw new RuntimeException();
			if ((((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742) != null && (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]) != null) {
				byte[] is_10_ = (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]);
				byte[] is_11_ = Class361.method6273(is, 0, is.length - 2, (byte) -26);
				for (int i_12_ = 0; i_12_ < 64; i_12_++) {
					if (is_11_[i_12_] != is_10_[i_12_])
						throw new RuntimeException();
				}
			}
			((Class327_Sub1) this).aClass312_7780.anInt3657 = 0;
			((Class327_Sub1) this).aClass312_7780.anInt3650 = 0;
		} catch (RuntimeException runtimeexception) {
			((Class327_Sub1) this).aClass312_7780.method5520((byte) 0);
			class282_sub50_sub11.method4991(-371378792);
			if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && !((Class327_Sub1) this).aClass312_7780.method5517(-2048838005)) {
				Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) -23));
				((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]);
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aClass313_7781.method5564(i, is, ((Class327_Sub1) this).aClass203_7782, -432045144);
			if (((Class327_Sub1) this).aByteArray7792[i] != 1) {
				((Class327_Sub1) this).anInt7793 += -1723048149;
				((Class327_Sub1) this).aByteArray7792[i] = (byte) 1;
			}
		}
		if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
			class282_sub50_sub11.method4991(-371378792);
		return class282_sub50_sub11;
	}

	void method12540(byte i) {
		if (null != ((Class327_Sub1) this).aClass482_7798 && method5803(-2030640343) != null) {
			for (Class282 class282 = ((Class327_Sub1) this).aClass482_7807.method8097((byte) 69); null != class282; class282 = ((Class327_Sub1) this).aClass482_7807.method8067(-235017563)) {
				int i_13_ = (int) (class282.aLong3379 * -3442165056282524525L);
				if (i_13_ < 0 || (i_13_ >= (((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3740) * 1563136279) || 0 == (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3744[i_13_]))
					class282.method4991(-371378792);
				else {
					if (((Class327_Sub1) this).aByteArray7792[i_13_] == 0)
						method12546(i_13_, 1, -43813469);
					if (((Class327_Sub1) this).aByteArray7792[i_13_] == -1)
						method12546(i_13_, 2, -461658168);
					if (1 == ((Class327_Sub1) this).aByteArray7792[i_13_])
						class282.method4991(-371378792);
				}
			}
		}
	}

	void method5805(int i, int i_14_) {
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			for (Class282 class282 = ((Class327_Sub1) this).aClass482_7807.method8097((byte) 115); null != class282; class282 = ((Class327_Sub1) this).aClass482_7807.method8067(-1039604534)) {
				if (-3442165056282524525L * class282.aLong3379 == (long) i)
					return;
			}
			Class282 class282 = new Class282();
			class282.aLong3379 = (long) i * -1253863389874800229L;
			((Class327_Sub1) this).aClass482_7807.method8059(class282, 1037130654);
		}
	}

	public int method12541(int i) {
		if (((Class327_Sub1) this).aClass322_7788 == null)
			return 0;
		return (((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3736 * 1006899347);
	}

	public int method12542(int i) {
		return ((Class327_Sub1) this).anInt7793 * 308504451;
	}

	public int method12543(int i) {
		if (method5803(-122167082) == null) {
			if (((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 == null)
				return 0;
			return ((Class327_Sub1) this).aClass282_Sub50_Sub11_7784.method14943(-1790040248);
		}
		return 100;
	}

	public void method12544(short i) {
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aBool7795 = true;
			if (((Class327_Sub1) this).aClass482_7798 == null)
				((Class327_Sub1) this).aClass482_7798 = new Class482();
		}
	}

	Class282_Sub50_Sub11 method12545(int i, int i_15_) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = ((Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11 && 0 == i_15_ && !((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && ((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639) {
			class282_sub50_sub11.method4991(-371378792);
			class282_sub50_sub11 = null;
		}
		if (class282_sub50_sub11 == null) {
			if (i_15_ == 0) {
				if (((Class327_Sub1) this).aClass203_7782 != null && -1 != ((Class327_Sub1) this).aByteArray7792[i])
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass313_7781.method5578(i, ((Class327_Sub1) this).aClass203_7782, -1732969068));
				else if (!((Class327_Sub1) this).aClass312_7780.method5517(-794928762))
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) 56));
				else
					return null;
			} else if (i_15_ == 1) {
				if (null == ((Class327_Sub1) this).aClass203_7782)
					throw new RuntimeException();
				class282_sub50_sub11 = (((Class327_Sub1) this).aClass313_7781.method5567(i, ((Class327_Sub1) this).aClass203_7782, 1177727286));
			} else if (2 == i_15_) {
				if (null == ((Class327_Sub1) this).aClass203_7782)
					throw new RuntimeException();
				if (-1 != ((Class327_Sub1) this).aByteArray7792[i])
					throw new RuntimeException();
				if (!((Class327_Sub1) this).aClass312_7780.method5516(1912577989))
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, false, (byte) -10));
				else
					return null;
			} else
				throw new RuntimeException();
			((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11, (long) i);
		}
		if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639)
			return null;
		byte[] is = class282_sub50_sub11.method14942(-1917129227);
		if (class282_sub50_sub11 instanceof Class282_Sub50_Sub11_Sub2) {
			Class282_Sub50_Sub11 class282_sub50_sub11_16_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7804.reset();
				aCRC32_7804.update(is, 0, is.length - 2);
				int i_17_ = (int) aCRC32_7804.getValue();
				if (i_17_ != (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3745[i]))
					throw new RuntimeException();
				if (null != (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742) && (null != (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]))) {
					byte[] is_18_ = (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]);
					byte[] is_19_ = Class361.method6273(is, 0, is.length - 2, (byte) 14);
					for (int i_20_ = 0; i_20_ < 64; i_20_++) {
						if (is_19_[i_20_] != is_18_[i_20_])
							throw new RuntimeException();
					}
				}
				int i_21_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]) & 0xffff) != i_21_)
					throw new RuntimeException();
				if (1 != ((Class327_Sub1) this).aByteArray7792[i]) {
					if (0 != ((Class327_Sub1) this).aByteArray7792[i]) {
						/* empty */
					}
					((Class327_Sub1) this).anInt7793 += -1723048149;
					((Class327_Sub1) this).aByteArray7792[i] = (byte) 1;
				}
				if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
					class282_sub50_sub11.method4991(-371378792);
				class282_sub50_sub11_16_ = class282_sub50_sub11;
			} catch (Exception exception) {
				((Class327_Sub1) this).aByteArray7792[i] = (byte) -1;
				class282_sub50_sub11.method4991(-371378792);
				if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && !((Class327_Sub1) this).aClass312_7780.method5517(-2140204680)) {
					Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) -70));
					((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
				}
				return null;
			}
			return class282_sub50_sub11_16_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7804.reset();
			aCRC32_7804.update(is, 0, is.length - 2);
			int i_22_ = (int) aCRC32_7804.getValue();
			if ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3745[i]) != i_22_)
				throw new RuntimeException();
			if ((((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742) != null && (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]) != null) {
				byte[] is_23_ = (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]);
				byte[] is_24_ = Class361.method6273(is, 0, is.length - 2, (byte) 35);
				for (int i_25_ = 0; i_25_ < 64; i_25_++) {
					if (is_24_[i_25_] != is_23_[i_25_])
						throw new RuntimeException();
				}
			}
			((Class327_Sub1) this).aClass312_7780.anInt3657 = 0;
			((Class327_Sub1) this).aClass312_7780.anInt3650 = 0;
		} catch (RuntimeException runtimeexception) {
			((Class327_Sub1) this).aClass312_7780.method5520((byte) 0);
			class282_sub50_sub11.method4991(-371378792);
			if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && !((Class327_Sub1) this).aClass312_7780.method5517(-445478867)) {
				Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) 6));
				((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]);
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aClass313_7781.method5564(i, is, ((Class327_Sub1) this).aClass203_7782, -1441648970);
			if (((Class327_Sub1) this).aByteArray7792[i] != 1) {
				((Class327_Sub1) this).anInt7793 += -1723048149;
				((Class327_Sub1) this).aByteArray7792[i] = (byte) 1;
			}
		}
		if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
			class282_sub50_sub11.method4991(-371378792);
		return class282_sub50_sub11;
	}

	Class282_Sub50_Sub11 method12546(int i, int i_26_, int i_27_) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = ((Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11 && 0 == i_26_ && !((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && ((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639) {
			class282_sub50_sub11.method4991(-371378792);
			class282_sub50_sub11 = null;
		}
		if (class282_sub50_sub11 == null) {
			if (i_26_ == 0) {
				if (((Class327_Sub1) this).aClass203_7782 != null && -1 != ((Class327_Sub1) this).aByteArray7792[i])
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass313_7781.method5578(i, ((Class327_Sub1) this).aClass203_7782, -1224840675));
				else if (!((Class327_Sub1) this).aClass312_7780.method5517(-1505335895))
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) 13));
				else
					return null;
			} else if (i_26_ == 1) {
				if (null == ((Class327_Sub1) this).aClass203_7782)
					throw new RuntimeException();
				class282_sub50_sub11 = (((Class327_Sub1) this).aClass313_7781.method5567(i, ((Class327_Sub1) this).aClass203_7782, 1246338163));
			} else if (2 == i_26_) {
				if (null == ((Class327_Sub1) this).aClass203_7782)
					throw new RuntimeException();
				if (-1 != ((Class327_Sub1) this).aByteArray7792[i])
					throw new RuntimeException();
				if (!((Class327_Sub1) this).aClass312_7780.method5516(-633705058))
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, false, (byte) 54));
				else
					return null;
			} else
				throw new RuntimeException();
			((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11, (long) i);
		}
		if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639)
			return null;
		byte[] is = class282_sub50_sub11.method14942(-530456645);
		if (class282_sub50_sub11 instanceof Class282_Sub50_Sub11_Sub2) {
			Class282_Sub50_Sub11 class282_sub50_sub11_28_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7804.reset();
				aCRC32_7804.update(is, 0, is.length - 2);
				int i_29_ = (int) aCRC32_7804.getValue();
				if (i_29_ != (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3745[i]))
					throw new RuntimeException();
				if (null != (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742) && (null != (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]))) {
					byte[] is_30_ = (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]);
					byte[] is_31_ = Class361.method6273(is, 0, is.length - 2, (byte) 21);
					for (int i_32_ = 0; i_32_ < 64; i_32_++) {
						if (is_31_[i_32_] != is_30_[i_32_])
							throw new RuntimeException();
					}
				}
				int i_33_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]) & 0xffff) != i_33_)
					throw new RuntimeException();
				if (1 != ((Class327_Sub1) this).aByteArray7792[i]) {
					if (0 != ((Class327_Sub1) this).aByteArray7792[i]) {
						/* empty */
					}
					((Class327_Sub1) this).anInt7793 += -1723048149;
					((Class327_Sub1) this).aByteArray7792[i] = (byte) 1;
				}
				if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
					class282_sub50_sub11.method4991(-371378792);
				class282_sub50_sub11_28_ = class282_sub50_sub11;
			} catch (Exception exception) {
				((Class327_Sub1) this).aByteArray7792[i] = (byte) -1;
				class282_sub50_sub11.method4991(-371378792);
				if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && !((Class327_Sub1) this).aClass312_7780.method5517(-439719120)) {
					Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) -66));
					((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
				}
				return null;
			}
			return class282_sub50_sub11_28_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7804.reset();
			aCRC32_7804.update(is, 0, is.length - 2);
			int i_34_ = (int) aCRC32_7804.getValue();
			if ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3745[i]) != i_34_)
				throw new RuntimeException();
			if ((((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742) != null && (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]) != null) {
				byte[] is_35_ = (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]);
				byte[] is_36_ = Class361.method6273(is, 0, is.length - 2, (byte) 12);
				for (int i_37_ = 0; i_37_ < 64; i_37_++) {
					if (is_36_[i_37_] != is_35_[i_37_])
						throw new RuntimeException();
				}
			}
			((Class327_Sub1) this).aClass312_7780.anInt3657 = 0;
			((Class327_Sub1) this).aClass312_7780.anInt3650 = 0;
		} catch (RuntimeException runtimeexception) {
			((Class327_Sub1) this).aClass312_7780.method5520((byte) 0);
			class282_sub50_sub11.method4991(-371378792);
			if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && !((Class327_Sub1) this).aClass312_7780.method5517(-1089916342)) {
				Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) -35));
				((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]);
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aClass313_7781.method5564(i, is, ((Class327_Sub1) this).aClass203_7782, -234788536);
			if (((Class327_Sub1) this).aByteArray7792[i] != 1) {
				((Class327_Sub1) this).anInt7793 += -1723048149;
				((Class327_Sub1) this).aByteArray7792[i] = (byte) 1;
			}
		}
		if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
			class282_sub50_sub11.method4991(-371378792);
		return class282_sub50_sub11;
	}

	Class322 method5807() {
		if (((Class327_Sub1) this).aClass322_7788 != null)
			return ((Class327_Sub1) this).aClass322_7788;
		if (((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 == null) {
			if (((Class327_Sub1) this).aClass312_7780.method5517(-1103490150))
				return null;
			((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = (((Class327_Sub1) this).aClass312_7780.method5515(255, 737076305 * ((Class327_Sub1) this).anInt7787, (byte) 0, true, (byte) -74));
		}
		if (((Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass282_Sub50_Sub11_7784).aBool9639)
			return null;
		byte[] is = ((Class327_Sub1) this).aClass282_Sub50_Sub11_7784.method14942(1691080819);
		if (((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 instanceof Class282_Sub50_Sub11_Sub2) {
			try {
				if (is == null)
					throw new RuntimeException();
				((Class327_Sub1) this).aClass322_7788 = new Class322(is, (-1197578581 * ((Class327_Sub1) this).anInt7806), ((Class327_Sub1) this).aByteArray7786);
				if (1502635595 * ((Class322) (((Class327_Sub1) this).aClass322_7788)).anInt3735 != -1803818645 * ((Class327_Sub1) this).anInt7794)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				((Class327_Sub1) this).aClass322_7788 = null;
				if (((Class327_Sub1) this).aClass312_7780.method5517(-1857312667))
					((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = null;
				else
					((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = (((Class327_Sub1) this).aClass312_7780.method5515(255, 737076305 * ((Class327_Sub1) this).anInt7787, (byte) 0, true, (byte) 43));
				return null;
			}
		} else {
			try {
				if (is == null)
					throw new RuntimeException();
				((Class327_Sub1) this).aClass322_7788 = new Class322(is, (((Class327_Sub1) this).anInt7806 * -1197578581), ((Class327_Sub1) this).aByteArray7786);
			} catch (RuntimeException runtimeexception) {
				((Class327_Sub1) this).aClass312_7780.method5520((byte) 0);
				((Class327_Sub1) this).aClass322_7788 = null;
				if (((Class327_Sub1) this).aClass312_7780.method5517(-621846092))
					((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = null;
				else
					((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = (((Class327_Sub1) this).aClass312_7780.method5515(255, ((Class327_Sub1) this).anInt7787 * 737076305, (byte) 0, true, (byte) -5));
				return null;
			}
			if (null != ((Class327_Sub1) this).aClass203_7783)
				((Class327_Sub1) this).aClass313_7781.method5564(((Class327_Sub1) this).anInt7787 * 737076305, is, ((Class327_Sub1) this).aClass203_7783, -1915662957);
		}
		((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = null;
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aByteArray7792 = new byte[(((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3740) * 1563136279];
			((Class327_Sub1) this).anInt7793 = 0;
		}
		return ((Class327_Sub1) this).aClass322_7788;
	}

	Class327_Sub1(int i, Class203 class203, Class203 class203_38_, Class312 class312, Class313 class313, int i_39_, byte[] is, int i_40_, boolean bool) {
		((Class327_Sub1) this).aLong7785 = 0L;
		((Class327_Sub1) this).anInt7787 = -507714383 * i;
		((Class327_Sub1) this).aClass203_7782 = class203;
		if (null == ((Class327_Sub1) this).aClass203_7782)
			((Class327_Sub1) this).aBool7779 = false;
		else {
			((Class327_Sub1) this).aBool7779 = true;
			((Class327_Sub1) this).aClass482_7798 = new Class482();
		}
		((Class327_Sub1) this).aClass203_7783 = class203_38_;
		((Class327_Sub1) this).aClass312_7780 = class312;
		((Class327_Sub1) this).aClass313_7781 = class313;
		((Class327_Sub1) this).anInt7806 = -903977981 * i_39_;
		((Class327_Sub1) this).aByteArray7786 = is;
		((Class327_Sub1) this).anInt7794 = i_40_ * -794625213;
		((Class327_Sub1) this).aBool7801 = bool;
		if (((Class327_Sub1) this).aClass203_7783 != null)
			((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 = (((Class327_Sub1) this).aClass313_7781.method5578(737076305 * ((Class327_Sub1) this).anInt7787, ((Class327_Sub1) this).aClass203_7783, -1435732555));
	}

	byte[] method5809(int i) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = method12546(i, 0, -1085366519);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.method14942(1414497884);
		class282_sub50_sub11.method4991(-371378792);
		return is;
	}

	int method5810(int i) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = ((Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11)
			return class282_sub50_sub11.method14943(-1968748053);
		return 0;
	}

	byte[] method5811(int i) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = method12546(i, 0, 227570516);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.method14942(1816584795);
		class282_sub50_sub11.method4991(-371378792);
		return is;
	}

	void method5808(int i) {
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			for (Class282 class282 = ((Class327_Sub1) this).aClass482_7807.method8097((byte) 28); null != class282; class282 = ((Class327_Sub1) this).aClass482_7807.method8067(978707001)) {
				if (-3442165056282524525L * class282.aLong3379 == (long) i)
					return;
			}
			Class282 class282 = new Class282();
			class282.aLong3379 = (long) i * -1253863389874800229L;
			((Class327_Sub1) this).aClass482_7807.method8059(class282, 269471242);
		}
	}

	public int method12547() {
		return ((Class327_Sub1) this).anInt7793 * 308504451;
	}

	byte[] method5813(int i) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = method12546(i, 0, -1115231710);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.method14942(737831388);
		class282_sub50_sub11.method4991(-371378792);
		return is;
	}

	public int method12548() {
		if (method5803(189313567) == null) {
			if (((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 == null)
				return 0;
			return ((Class327_Sub1) this).aClass282_Sub50_Sub11_7784.method14943(-1801277219);
		}
		return 100;
	}

	public int method12549() {
		if (method5803(-1455082006) == null) {
			if (((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 == null)
				return 0;
			return ((Class327_Sub1) this).aClass282_Sub50_Sub11_7784.method14943(-1639655464);
		}
		return 100;
	}

	public void method12550() {
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aBool7795 = true;
			if (((Class327_Sub1) this).aClass482_7798 == null)
				((Class327_Sub1) this).aClass482_7798 = new Class482();
		}
	}

	Class282_Sub50_Sub11 method12551(int i, int i_41_) {
		Class282_Sub50_Sub11 class282_sub50_sub11 = ((Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11 && 0 == i_41_ && !((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && ((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639) {
			class282_sub50_sub11.method4991(-371378792);
			class282_sub50_sub11 = null;
		}
		if (class282_sub50_sub11 == null) {
			if (i_41_ == 0) {
				if (((Class327_Sub1) this).aClass203_7782 != null && -1 != ((Class327_Sub1) this).aByteArray7792[i])
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass313_7781.method5578(i, ((Class327_Sub1) this).aClass203_7782, -1748974654));
				else if (!((Class327_Sub1) this).aClass312_7780.method5517(-1700651730))
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) 29));
				else
					return null;
			} else if (i_41_ == 1) {
				if (null == ((Class327_Sub1) this).aClass203_7782)
					throw new RuntimeException();
				class282_sub50_sub11 = (((Class327_Sub1) this).aClass313_7781.method5567(i, ((Class327_Sub1) this).aClass203_7782, 1095723903));
			} else if (2 == i_41_) {
				if (null == ((Class327_Sub1) this).aClass203_7782)
					throw new RuntimeException();
				if (-1 != ((Class327_Sub1) this).aByteArray7792[i])
					throw new RuntimeException();
				if (!((Class327_Sub1) this).aClass312_7780.method5516(-1115503501))
					class282_sub50_sub11 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, false, (byte) 49));
				else
					return null;
			} else
				throw new RuntimeException();
			((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11, (long) i);
		}
		if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639)
			return null;
		byte[] is = class282_sub50_sub11.method14942(-1271823311);
		if (class282_sub50_sub11 instanceof Class282_Sub50_Sub11_Sub2) {
			Class282_Sub50_Sub11 class282_sub50_sub11_42_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7804.reset();
				aCRC32_7804.update(is, 0, is.length - 2);
				int i_43_ = (int) aCRC32_7804.getValue();
				if (i_43_ != (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3745[i]))
					throw new RuntimeException();
				if (null != (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742) && (null != (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]))) {
					byte[] is_44_ = (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]);
					byte[] is_45_ = Class361.method6273(is, 0, is.length - 2, (byte) -72);
					for (int i_46_ = 0; i_46_ < 64; i_46_++) {
						if (is_45_[i_46_] != is_44_[i_46_])
							throw new RuntimeException();
					}
				}
				int i_47_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]) & 0xffff) != i_47_)
					throw new RuntimeException();
				if (1 != ((Class327_Sub1) this).aByteArray7792[i]) {
					if (0 != ((Class327_Sub1) this).aByteArray7792[i]) {
						/* empty */
					}
					((Class327_Sub1) this).anInt7793 += -1723048149;
					((Class327_Sub1) this).aByteArray7792[i] = (byte) 1;
				}
				if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
					class282_sub50_sub11.method4991(-371378792);
				class282_sub50_sub11_42_ = class282_sub50_sub11;
			} catch (Exception exception) {
				((Class327_Sub1) this).aByteArray7792[i] = (byte) -1;
				class282_sub50_sub11.method4991(-371378792);
				if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && !((Class327_Sub1) this).aClass312_7780.method5517(-778407375)) {
					Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) -53));
					((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
				}
				return null;
			}
			return class282_sub50_sub11_42_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7804.reset();
			aCRC32_7804.update(is, 0, is.length - 2);
			int i_48_ = (int) aCRC32_7804.getValue();
			if ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3745[i]) != i_48_)
				throw new RuntimeException();
			if ((((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742) != null && (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]) != null) {
				byte[] is_49_ = (((Class322) ((Class327_Sub1) this).aClass322_7788).aByteArrayArray3742[i]);
				byte[] is_50_ = Class361.method6273(is, 0, is.length - 2, (byte) 22);
				for (int i_51_ = 0; i_51_ < 64; i_51_++) {
					if (is_50_[i_51_] != is_49_[i_51_])
						throw new RuntimeException();
				}
			}
			((Class327_Sub1) this).aClass312_7780.anInt3657 = 0;
			((Class327_Sub1) this).aClass312_7780.anInt3650 = 0;
		} catch (RuntimeException runtimeexception) {
			((Class327_Sub1) this).aClass312_7780.method5520((byte) 0);
			class282_sub50_sub11.method4991(-371378792);
			if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637 && !((Class327_Sub1) this).aClass312_7780.method5517(-1111564705)) {
				Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (((Class327_Sub1) this).aClass312_7780.method5515(((Class327_Sub1) this).anInt7787 * 737076305, i, (byte) 2, true, (byte) -26));
				((Class327_Sub1) this).aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]) >>> 8);
		is[is.length - 1] = (byte) (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3743[i]);
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aClass313_7781.method5564(i, is, ((Class327_Sub1) this).aClass203_7782, 691148886);
			if (((Class327_Sub1) this).aByteArray7792[i] != 1) {
				((Class327_Sub1) this).anInt7793 += -1723048149;
				((Class327_Sub1) this).aByteArray7792[i] = (byte) 1;
			}
		}
		if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
			class282_sub50_sub11.method4991(-371378792);
		return class282_sub50_sub11;
	}

	void method12552(int i) {
		if (null != ((Class327_Sub1) this).aClass482_7798) {
			if (method5803(418724601) == null)
				return;
			if (((Class327_Sub1) this).aBool7779) {
				boolean bool = true;
				for (Class282 class282 = ((Class327_Sub1) this).aClass482_7798.method8097((byte) 124); null != class282; class282 = ((Class327_Sub1) this).aClass482_7798.method8067(328179980)) {
					int i_52_ = (int) (-3442165056282524525L * class282.aLong3379);
					if (((Class327_Sub1) this).aByteArray7792[i_52_] == 0)
						method12546(i_52_, 1, -1048339107);
					if (((Class327_Sub1) this).aByteArray7792[i_52_] != 0)
						class282.method4991(-371378792);
					else
						bool = false;
				}
				while (1482915297 * ((Class327_Sub1) this).anInt7797 < (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3744).length) {
					if ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3744[((Class327_Sub1) this).anInt7797 * 1482915297]) == 0)
						((Class327_Sub1) this).anInt7797 += -1503033823;
					else {
						if ((((Class313) ((Class327_Sub1) this).aClass313_7781).anInt3662) * 3183863 >= 250) {
							bool = false;
							break;
						}
						if (0 == (((Class327_Sub1) this).aByteArray7792[(1482915297 * ((Class327_Sub1) this).anInt7797)]))
							method12546((((Class327_Sub1) this).anInt7797 * 1482915297), 1, 317844663);
						if (0 == (((Class327_Sub1) this).aByteArray7792[(((Class327_Sub1) this).anInt7797 * 1482915297)])) {
							Class282 class282 = new Class282();
							class282.aLong3379 = ((long) ((Class327_Sub1) this).anInt7797 * -3869615546755887045L);
							((Class327_Sub1) this).aClass482_7798.method8059(class282, -1762683318);
							bool = false;
						}
						((Class327_Sub1) this).anInt7797 += -1503033823;
					}
				}
				if (bool) {
					((Class327_Sub1) this).aBool7779 = false;
					((Class327_Sub1) this).anInt7797 = 0;
				}
			} else if (((Class327_Sub1) this).aBool7795) {
				boolean bool = true;
				for (Class282 class282 = ((Class327_Sub1) this).aClass482_7798.method8097((byte) 13); null != class282; class282 = ((Class327_Sub1) this).aClass482_7798.method8067(392865935)) {
					int i_53_ = (int) (class282.aLong3379 * -3442165056282524525L);
					if (1 != ((Class327_Sub1) this).aByteArray7792[i_53_])
						method12546(i_53_, 2, -1651626518);
					if (1 == ((Class327_Sub1) this).aByteArray7792[i_53_])
						class282.method4991(-371378792);
					else
						bool = false;
				}
				while (1482915297 * ((Class327_Sub1) this).anInt7797 < (((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3744).length) {
					if ((((Class322) ((Class327_Sub1) this).aClass322_7788).anIntArray3744[1482915297 * ((Class327_Sub1) this).anInt7797]) == 0)
						((Class327_Sub1) this).anInt7797 += -1503033823;
					else {
						if (((Class327_Sub1) this).aClass312_7780.method5516(-619518274)) {
							bool = false;
							break;
						}
						if (1 != (((Class327_Sub1) this).aByteArray7792[(((Class327_Sub1) this).anInt7797 * 1482915297)]))
							method12546((1482915297 * ((Class327_Sub1) this).anInt7797), 2, 627310789);
						if (1 != (((Class327_Sub1) this).aByteArray7792[(((Class327_Sub1) this).anInt7797 * 1482915297)])) {
							Class282 class282 = new Class282();
							class282.aLong3379 = (-3869615546755887045L * (long) ((Class327_Sub1) this).anInt7797);
							((Class327_Sub1) this).aClass482_7798.method8059(class282, 720444419);
							bool = false;
						}
						((Class327_Sub1) this).anInt7797 += -1503033823;
					}
				}
				if (bool) {
					((Class327_Sub1) this).aBool7795 = false;
					((Class327_Sub1) this).anInt7797 = 0;
				}
			} else
				((Class327_Sub1) this).aClass482_7798 = null;
		}
		if (((Class327_Sub1) this).aBool7801 && (Class169.method2869(2055331378) >= ((Class327_Sub1) this).aLong7785 * 8350705993444210771L)) {
			for (Class282_Sub50_Sub11 class282_sub50_sub11 = (Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass465_7796.method7750(-556717169); class282_sub50_sub11 != null; class282_sub50_sub11 = (Class282_Sub50_Sub11) ((Class327_Sub1) this).aClass465_7796.method7751((byte) 47)) {
				if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9639) {
					if (((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9638) {
						if (!((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9637)
							throw new RuntimeException();
						class282_sub50_sub11.method4991(-371378792);
					} else
						((Class282_Sub50_Sub11) class282_sub50_sub11).aBool9638 = true;
				}
			}
			((Class327_Sub1) this).aLong7785 = ((Class169.method2869(1703691062) + 1000L) * -8999221579515212837L);
		}
	}

	public int method12553() {
		if (method5803(1495950533) == null) {
			if (((Class327_Sub1) this).aClass282_Sub50_Sub11_7784 == null)
				return 0;
			return ((Class327_Sub1) this).aClass282_Sub50_Sub11_7784.method14943(-1828514558);
		}
		return 100;
	}

	public int method12554() {
		if (null == ((Class327_Sub1) this).aClass322_7788)
			return 0;
		if (!((Class327_Sub1) this).aBool7779)
			return (1006899347 * (((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3736));
		Class282 class282 = ((Class327_Sub1) this).aClass482_7798.method8097((byte) 108);
		if (null == class282)
			return 0;
		return (int) (class282.aLong3379 * -3442165056282524525L);
	}

	public int method12555() {
		if (null == ((Class327_Sub1) this).aClass322_7788)
			return 0;
		if (!((Class327_Sub1) this).aBool7779)
			return (1006899347 * (((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3736));
		Class282 class282 = ((Class327_Sub1) this).aClass482_7798.method8097((byte) 106);
		if (null == class282)
			return 0;
		return (int) (class282.aLong3379 * -3442165056282524525L);
	}

	public int method12556() {
		if (null == ((Class327_Sub1) this).aClass322_7788)
			return 0;
		if (!((Class327_Sub1) this).aBool7779)
			return (1006899347 * (((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3736));
		Class282 class282 = ((Class327_Sub1) this).aClass482_7798.method8097((byte) 88);
		if (null == class282)
			return 0;
		return (int) (class282.aLong3379 * -3442165056282524525L);
	}

	public int method12557() {
		if (null == ((Class327_Sub1) this).aClass322_7788)
			return 0;
		if (!((Class327_Sub1) this).aBool7779)
			return (1006899347 * (((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3736));
		Class282 class282 = ((Class327_Sub1) this).aClass482_7798.method8097((byte) 52);
		if (null == class282)
			return 0;
		return (int) (class282.aLong3379 * -3442165056282524525L);
	}

	public void method12558() {
		if (((Class327_Sub1) this).aClass203_7782 != null) {
			((Class327_Sub1) this).aBool7795 = true;
			if (((Class327_Sub1) this).aClass482_7798 == null)
				((Class327_Sub1) this).aClass482_7798 = new Class482();
		}
	}

	public int method12559(int i) {
		if (null == ((Class327_Sub1) this).aClass322_7788)
			return 0;
		if (!((Class327_Sub1) this).aBool7779)
			return (1006899347 * (((Class322) ((Class327_Sub1) this).aClass322_7788).anInt3736));
		Class282 class282 = ((Class327_Sub1) this).aClass482_7798.method8097((byte) 11);
		if (null == class282)
			return 0;
		return (int) (class282.aLong3379 * -3442165056282524525L);
	}

	static final void method12560(CS2Executor class527, short i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub26_8224.method12943(1554846172) == 1 ? 1 : 0;
	}

	static final void method12561(CS2Executor class527, int i) {
		int i_54_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (i_54_ != -1)
			Class92.method1563(i_54_, 1917715893);
	}

	static boolean method12562(int i) {
		if (null == Class1.aClass282_Sub50_Sub7_12)
			return false;
		if ((((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12).anInt9587 * -1441507225) >= 2000)
			((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12).anInt9587 -= -836888656;
		if (1007 == -1441507225 * ((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12).anInt9587)
			return true;
		return false;
	}
}
