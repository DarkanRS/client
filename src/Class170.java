
/* Class170 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class170 {
	Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2092;
	Class282_Sub50_Sub19 aClass282_Sub50_Sub19_2093;
	boolean aBool2094;
	Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2095;
	int anInt2096 = 0;
	int anInt2097 = 0;
	int anInt2098 = 1;
	int anInt2099 = 1;
	boolean aBool2100;
	Class158_Sub1_Sub4 aClass158_Sub1_Sub4_2101;
	Class76 aClass76_2102;
	boolean aBool2103;
	Class137_Sub1 aClass137_Sub1_2104;
	boolean aBool2105;
	Class137_Sub1[] aClass137_Sub1Array2106;
	Class282_Sub50_Sub19 aClass282_Sub50_Sub19_2107;
	Class473 aClass473_2108 = new Class473();
	boolean aBool2109;
	boolean aBool2110;
	int anInt2111;
	Class505_Sub1 aClass505_Sub1_2112;

	boolean method2878(int i, int i_0_, int i_1_, int i_2_) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 == null || ((Class170) this).aClass473_2108.method7861(141891001))
			return false;
		if (((Class170) this).anInt2098 != i_1_ || ((Class170) this).anInt2099 != i_2_) {
			((Class170) this).anInt2098 = i_1_;
			((Class170) this).anInt2099 = i_2_;
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(1727282478); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12122((((Class170) this).anInt2098), (((Class170) this).anInt2099));
			((Class170) this).aBool2094 = true;
			((Class170) this).aBool2103 = true;
			((Class170) this).aBool2109 = true;
		}
		if (method2881()) {
			((Class170) this).anInt2096 = i;
			((Class170) this).anInt2097 = i_0_;
			((Class170) this).aBool2100 = true;
			((Class170) this).aClass505_Sub1_2112.method13640(-((Class170) this).anInt2096, (((Class170) this).anInt2099 + ((Class170) this).anInt2097 - ((Class170) this).aClass505_Sub1_2112.method8523((byte) 111).method2716()));
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 2064828153);
			((Class170) this).aClass505_Sub1_2112.ba(3, 0);
			((Class170) this).aClass158_Sub1_Sub4_2095.method15628(0);
			return true;
		}
		return false;
	}

	void method2879() {
		if (((Class170) this).aBool2100) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -96);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, -1373643193);
				((Class170) this).aClass158_Sub1_Sub4_2092.method15628(0);
				((Class170) this).aClass158_Sub1_Sub4_2101.method15624(0, 0, ((Class170) this).anInt2098, ((Class170) this).anInt2099, 0, 0, true, ((Class170) this).aBool2110);
			}
			((Class170) this).aClass505_Sub1_2112.method13637();
			((Class170) this).aClass505_Sub1_2112.method13624(0);
			((Class170) this).aClass505_Sub1_2112.method13612(1);
			((Class170) this).aClass505_Sub1_2112.L();
			int i = 0;
			int i_3_ = 1;
			Class282_Sub5 class282_sub5;
			for (Class282_Sub5 class282_sub5_4_ = (Class282_Sub5) ((Class170) this).aClass473_2108.method7859(782845351); class282_sub5_4_ != null; class282_sub5_4_ = class282_sub5) {
				class282_sub5 = (Class282_Sub5) ((Class170) this).aClass473_2108.method7857((byte) -96);
				int i_5_ = class282_sub5_4_.method12125();
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					class282_sub5_4_.method12119(i_6_, (((Class170) this).aClass137_Sub1Array2106[i]), (((Class170) this).aClass137_Sub1_2104));
					if (class282_sub5 == null && i_6_ == i_5_ - 1) {
						((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -11);
						((Class170) this).aClass505_Sub1_2112.method13640(0, 0);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2096, ((Class170) this).anInt2097);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2096, (((Class170) this).anInt2097 + ((Class170) this).anInt2099));
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i((((Class170) this).anInt2096 + ((Class170) this).anInt2098), (((Class170) this).anInt2097 + ((Class170) this).anInt2099));
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i((((Class170) this).anInt2096 + ((Class170) this).anInt2098), ((Class170) this).anInt2097);
						OpenGL.glEnd();
					} else {
						((Class170) this).aClass158_Sub1_Sub4_2092.method15628(i_3_);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(0, ((Class170) this).anInt2099);
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2098, ((Class170) this).anInt2099);
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2098, 0);
						OpenGL.glEnd();
					}
					class282_sub5_4_.method12121(i_6_);
					i_3_ = i_3_ + 1 & 0x1;
					i = i + 1 & 0x1;
				}
			}
			((Class170) this).aBool2100 = false;
		}
	}

	boolean method2880(Class282_Sub5 class282_sub5) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 != null) {
			if (class282_sub5.method12141() || class282_sub5.method12136()) {
				((Class170) this).aClass473_2108.method7877(class282_sub5, 1208340082);
				method2886();
				if (method2881()) {
					if (((Class170) this).anInt2098 != -1 && ((Class170) this).anInt2099 != -1)
						class282_sub5.method12122(((Class170) this).anInt2098, ((Class170) this).anInt2099);
					((Class282_Sub5) class282_sub5).aBool7506 = true;
					return true;
				}
			}
			method2885(class282_sub5);
		}
		return false;
	}

	boolean method2881() {
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass282_Sub50_Sub19_2093 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2093.method26();
				((Class170) this).aClass282_Sub50_Sub19_2093 = null;
			}
			if (((Class170) this).aClass137_Sub1_2104 != null) {
				((Class170) this).aClass137_Sub1_2104.method2355();
				((Class170) this).aClass137_Sub1_2104 = null;
			}
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass282_Sub50_Sub19_2107 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2107.method26();
				((Class170) this).aClass282_Sub50_Sub19_2107 = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[0] != null) {
				((Class170) this).aClass137_Sub1Array2106[0].method2355();
				((Class170) this).aClass137_Sub1Array2106[0] = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[1] != null) {
				((Class170) this).aClass137_Sub1Array2106[1].method2355();
				((Class170) this).aClass137_Sub1Array2106[1] = null;
			}
		}
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			if (((Class170) this).aBool2110)
				((Class170) this).aClass137_Sub1_2104 = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			else if (((Class170) this).aClass282_Sub50_Sub19_2093 == null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aBool2103 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2107 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			((Class170) this).aClass137_Sub1Array2106[0] = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aClass137_Sub1Array2106[1] = (((Class170) this).anInt2111 > 1 ? new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099) : null);
			((Class170) this).aBool2094 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2109) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 101972141);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -62);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2101, 825356298);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, ((Class170) this).aClass282_Sub50_Sub19_2107);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -71);
			} else {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 196803450);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				else
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -89);
			}
			((Class170) this).aBool2109 = false;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2105) {
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 1305416413);
			((Class170) this).aBool2105 = !((Class170) this).aClass158_Sub1_Sub4_2095.method13764();
			((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2095, (byte) -48);
		}
		return !((Class170) this).aBool2105;
	}

	boolean method2882(int i, int i_7_, int i_8_, int i_9_) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 == null || ((Class170) this).aClass473_2108.method7861(141891001))
			return false;
		if (((Class170) this).anInt2098 != i_8_ || ((Class170) this).anInt2099 != i_9_) {
			((Class170) this).anInt2098 = i_8_;
			((Class170) this).anInt2099 = i_9_;
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(982266916); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12122((((Class170) this).anInt2098), (((Class170) this).anInt2099));
			((Class170) this).aBool2094 = true;
			((Class170) this).aBool2103 = true;
			((Class170) this).aBool2109 = true;
		}
		if (method2881()) {
			((Class170) this).anInt2096 = i;
			((Class170) this).anInt2097 = i_7_;
			((Class170) this).aBool2100 = true;
			((Class170) this).aClass505_Sub1_2112.method13640(-((Class170) this).anInt2096, (((Class170) this).anInt2099 + ((Class170) this).anInt2097 - ((Class170) this).aClass505_Sub1_2112.method8523((byte) 107).method2716()));
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 903990341);
			((Class170) this).aClass505_Sub1_2112.ba(3, 0);
			((Class170) this).aClass158_Sub1_Sub4_2095.method15628(0);
			return true;
		}
		return false;
	}

	void method2883() {
		if (((Class170) this).aBool2100) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -56);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 1705377997);
				((Class170) this).aClass158_Sub1_Sub4_2092.method15628(0);
				((Class170) this).aClass158_Sub1_Sub4_2101.method15624(0, 0, ((Class170) this).anInt2098, ((Class170) this).anInt2099, 0, 0, true, ((Class170) this).aBool2110);
			}
			((Class170) this).aClass505_Sub1_2112.method13637();
			((Class170) this).aClass505_Sub1_2112.method13624(0);
			((Class170) this).aClass505_Sub1_2112.method13612(1);
			((Class170) this).aClass505_Sub1_2112.L();
			int i = 0;
			int i_10_ = 1;
			Class282_Sub5 class282_sub5;
			for (Class282_Sub5 class282_sub5_11_ = (Class282_Sub5) ((Class170) this).aClass473_2108.method7859(1222970052); class282_sub5_11_ != null; class282_sub5_11_ = class282_sub5) {
				class282_sub5 = (Class282_Sub5) ((Class170) this).aClass473_2108.method7857((byte) -118);
				int i_12_ = class282_sub5_11_.method12125();
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
					class282_sub5_11_.method12119(i_13_, ((Class170) this).aClass137_Sub1Array2106[i], ((Class170) this).aClass137_Sub1_2104);
					if (class282_sub5 == null && i_13_ == i_12_ - 1) {
						((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -53);
						((Class170) this).aClass505_Sub1_2112.method13640(0, 0);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2096, ((Class170) this).anInt2097);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2096, (((Class170) this).anInt2097 + ((Class170) this).anInt2099));
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i((((Class170) this).anInt2096 + ((Class170) this).anInt2098), (((Class170) this).anInt2097 + ((Class170) this).anInt2099));
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i((((Class170) this).anInt2096 + ((Class170) this).anInt2098), ((Class170) this).anInt2097);
						OpenGL.glEnd();
					} else {
						((Class170) this).aClass158_Sub1_Sub4_2092.method15628(i_10_);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(0, ((Class170) this).anInt2099);
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2098, ((Class170) this).anInt2099);
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2098, 0);
						OpenGL.glEnd();
					}
					class282_sub5_11_.method12121(i_13_);
					i_10_ = i_10_ + 1 & 0x1;
					i = i + 1 & 0x1;
				}
			}
			((Class170) this).aBool2100 = false;
		}
	}

	boolean method2884(int i, int i_14_, int i_15_, int i_16_) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 == null || ((Class170) this).aClass473_2108.method7861(141891001))
			return false;
		if (((Class170) this).anInt2098 != i_15_ || ((Class170) this).anInt2099 != i_16_) {
			((Class170) this).anInt2098 = i_15_;
			((Class170) this).anInt2099 = i_16_;
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(708316685); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12122((((Class170) this).anInt2098), (((Class170) this).anInt2099));
			((Class170) this).aBool2094 = true;
			((Class170) this).aBool2103 = true;
			((Class170) this).aBool2109 = true;
		}
		if (method2881()) {
			((Class170) this).anInt2096 = i;
			((Class170) this).anInt2097 = i_14_;
			((Class170) this).aBool2100 = true;
			((Class170) this).aClass505_Sub1_2112.method13640(-((Class170) this).anInt2096, (((Class170) this).anInt2099 + ((Class170) this).anInt2097 - ((Class170) this).aClass505_Sub1_2112.method8523((byte) 112).method2716()));
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, -2104794592);
			((Class170) this).aClass505_Sub1_2112.ba(3, 0);
			((Class170) this).aClass158_Sub1_Sub4_2095.method15628(0);
			return true;
		}
		return false;
	}

	void method2885(Class282_Sub5 class282_sub5) {
		((Class282_Sub5) class282_sub5).aBool7506 = false;
		class282_sub5.method12120();
		class282_sub5.unlink(-371378792);
		method2886();
	}

	void method2886() {
		int i = 0;
		boolean bool = false;
		Class76 class76 = Class76.aClass76_751;
		for (Class282_Sub5 class282_sub5 = ((Class282_Sub5) ((Class170) this).aClass473_2108.method7859(765484279)); class282_sub5 != null; class282_sub5 = (Class282_Sub5) ((Class170) this).aClass473_2108.method7857((byte) -40)) {
			Class76 class76_17_ = class282_sub5.method12127();
			if (class76_17_.anInt748 * 971905895 > class76.anInt748 * 971905895)
				class76 = class76_17_;
			bool |= class282_sub5.method12126();
			i += class282_sub5.method12125();
		}
		if (class76 != ((Class170) this).aClass76_2102) {
			((Class170) this).aClass76_2102 = class76;
			((Class170) this).aBool2094 = true;
		}
		int i_18_ = (((Class170) this).anInt2111 > 2 ? 2 : ((Class170) this).anInt2111);
		int i_19_ = i > 2 ? 2 : i;
		if (i_18_ != i_19_) {
			((Class170) this).aBool2094 = true;
			((Class170) this).aBool2109 = true;
		}
		if (bool != ((Class170) this).aBool2110) {
			((Class170) this).aBool2110 = bool;
			((Class170) this).aBool2103 = true;
		}
		((Class170) this).anInt2111 = i;
	}

	void method2887() {
		((Class170) this).aClass158_Sub1_Sub4_2092 = null;
		((Class170) this).aClass158_Sub1_Sub4_2101 = null;
		((Class170) this).aClass158_Sub1_Sub4_2095 = null;
		((Class170) this).aClass282_Sub50_Sub19_2093 = null;
		((Class170) this).aClass137_Sub1_2104 = null;
		((Class170) this).aClass137_Sub1Array2106 = null;
		((Class170) this).aClass282_Sub50_Sub19_2107 = null;
		if (!((Class170) this).aClass473_2108.method7861(141891001)) {
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(1825691275); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12120();
		}
		((Class170) this).anInt2099 = 1;
		((Class170) this).anInt2098 = 1;
	}

	void method2888() {
		((Class170) this).aClass158_Sub1_Sub4_2092 = null;
		((Class170) this).aClass158_Sub1_Sub4_2101 = null;
		((Class170) this).aClass158_Sub1_Sub4_2095 = null;
		((Class170) this).aClass282_Sub50_Sub19_2093 = null;
		((Class170) this).aClass137_Sub1_2104 = null;
		((Class170) this).aClass137_Sub1Array2106 = null;
		((Class170) this).aClass282_Sub50_Sub19_2107 = null;
		if (!((Class170) this).aClass473_2108.method7861(141891001)) {
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(934182416); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12120();
		}
		((Class170) this).anInt2099 = 1;
		((Class170) this).anInt2098 = 1;
	}

	boolean method2889() {
		return ((Class170) this).aClass158_Sub1_Sub4_2095 != null;
	}

	boolean method2890() {
		return ((Class170) this).aClass158_Sub1_Sub4_2095 != null;
	}

	boolean method2891() {
		return ((Class170) this).aClass158_Sub1_Sub4_2095 != null;
	}

	boolean method2892() {
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass282_Sub50_Sub19_2093 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2093.method26();
				((Class170) this).aClass282_Sub50_Sub19_2093 = null;
			}
			if (((Class170) this).aClass137_Sub1_2104 != null) {
				((Class170) this).aClass137_Sub1_2104.method2355();
				((Class170) this).aClass137_Sub1_2104 = null;
			}
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass282_Sub50_Sub19_2107 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2107.method26();
				((Class170) this).aClass282_Sub50_Sub19_2107 = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[0] != null) {
				((Class170) this).aClass137_Sub1Array2106[0].method2355();
				((Class170) this).aClass137_Sub1Array2106[0] = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[1] != null) {
				((Class170) this).aClass137_Sub1Array2106[1].method2355();
				((Class170) this).aClass137_Sub1Array2106[1] = null;
			}
		}
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			if (((Class170) this).aBool2110)
				((Class170) this).aClass137_Sub1_2104 = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			else if (((Class170) this).aClass282_Sub50_Sub19_2093 == null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aBool2103 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2107 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			((Class170) this).aClass137_Sub1Array2106[0] = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aClass137_Sub1Array2106[1] = (((Class170) this).anInt2111 > 1 ? new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099) : null);
			((Class170) this).aBool2094 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2109) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, -1821924654);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -57);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2101, -160616903);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, ((Class170) this).aClass282_Sub50_Sub19_2107);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -32);
			} else {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 14096986);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				else
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -87);
			}
			((Class170) this).aBool2109 = false;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2105) {
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 14655036);
			((Class170) this).aBool2105 = !((Class170) this).aClass158_Sub1_Sub4_2095.method13764();
			((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2095, (byte) -36);
		}
		return !((Class170) this).aBool2105;
	}

	boolean method2893() {
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass282_Sub50_Sub19_2093 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2093.method26();
				((Class170) this).aClass282_Sub50_Sub19_2093 = null;
			}
			if (((Class170) this).aClass137_Sub1_2104 != null) {
				((Class170) this).aClass137_Sub1_2104.method2355();
				((Class170) this).aClass137_Sub1_2104 = null;
			}
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass282_Sub50_Sub19_2107 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2107.method26();
				((Class170) this).aClass282_Sub50_Sub19_2107 = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[0] != null) {
				((Class170) this).aClass137_Sub1Array2106[0].method2355();
				((Class170) this).aClass137_Sub1Array2106[0] = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[1] != null) {
				((Class170) this).aClass137_Sub1Array2106[1].method2355();
				((Class170) this).aClass137_Sub1Array2106[1] = null;
			}
		}
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			if (((Class170) this).aBool2110)
				((Class170) this).aClass137_Sub1_2104 = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			else if (((Class170) this).aClass282_Sub50_Sub19_2093 == null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aBool2103 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2107 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			((Class170) this).aClass137_Sub1Array2106[0] = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aClass137_Sub1Array2106[1] = (((Class170) this).anInt2111 > 1 ? new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099) : null);
			((Class170) this).aBool2094 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2109) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, -1271710546);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -5);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2101, 707489225);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, ((Class170) this).aClass282_Sub50_Sub19_2107);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -126);
			} else {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 728579707);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				else
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -99);
			}
			((Class170) this).aBool2109 = false;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2105) {
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 1352925102);
			((Class170) this).aBool2105 = !((Class170) this).aClass158_Sub1_Sub4_2095.method13764();
			((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2095, (byte) -28);
		}
		return !((Class170) this).aBool2105;
	}

	boolean method2894() {
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass282_Sub50_Sub19_2093 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2093.method26();
				((Class170) this).aClass282_Sub50_Sub19_2093 = null;
			}
			if (((Class170) this).aClass137_Sub1_2104 != null) {
				((Class170) this).aClass137_Sub1_2104.method2355();
				((Class170) this).aClass137_Sub1_2104 = null;
			}
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass282_Sub50_Sub19_2107 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2107.method26();
				((Class170) this).aClass282_Sub50_Sub19_2107 = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[0] != null) {
				((Class170) this).aClass137_Sub1Array2106[0].method2355();
				((Class170) this).aClass137_Sub1Array2106[0] = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[1] != null) {
				((Class170) this).aClass137_Sub1Array2106[1].method2355();
				((Class170) this).aClass137_Sub1Array2106[1] = null;
			}
		}
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			if (((Class170) this).aBool2110)
				((Class170) this).aClass137_Sub1_2104 = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			else if (((Class170) this).aClass282_Sub50_Sub19_2093 == null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aBool2103 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2107 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			((Class170) this).aClass137_Sub1Array2106[0] = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aClass137_Sub1Array2106[1] = (((Class170) this).anInt2111 > 1 ? new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099) : null);
			((Class170) this).aBool2094 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2109) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 836421559);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -106);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2101, -1934566997);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, ((Class170) this).aClass282_Sub50_Sub19_2107);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -4);
			} else {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, -1127137486);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				else
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -118);
			}
			((Class170) this).aBool2109 = false;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2105) {
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 1400062596);
			((Class170) this).aBool2105 = !((Class170) this).aClass158_Sub1_Sub4_2095.method13764();
			((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2095, (byte) -66);
		}
		return !((Class170) this).aBool2105;
	}

	boolean method2895() {
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass282_Sub50_Sub19_2093 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2093.method26();
				((Class170) this).aClass282_Sub50_Sub19_2093 = null;
			}
			if (((Class170) this).aClass137_Sub1_2104 != null) {
				((Class170) this).aClass137_Sub1_2104.method2355();
				((Class170) this).aClass137_Sub1_2104 = null;
			}
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass282_Sub50_Sub19_2107 != null) {
				((Class170) this).aClass282_Sub50_Sub19_2107.method26();
				((Class170) this).aClass282_Sub50_Sub19_2107 = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[0] != null) {
				((Class170) this).aClass137_Sub1Array2106[0].method2355();
				((Class170) this).aClass137_Sub1Array2106[0] = null;
			}
			if (((Class170) this).aClass137_Sub1Array2106[1] != null) {
				((Class170) this).aClass137_Sub1Array2106[1].method2355();
				((Class170) this).aClass137_Sub1Array2106[1] = null;
			}
		}
		if (((Class170) this).aBool2103) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			if (((Class170) this).aBool2110)
				((Class170) this).aClass137_Sub1_2104 = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			else if (((Class170) this).aClass282_Sub50_Sub19_2093 == null)
				((Class170) this).aClass282_Sub50_Sub19_2093 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1953, Class76.aClass76_749, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aBool2103 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2094) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null)
				((Class170) this).aClass282_Sub50_Sub19_2107 = new Class282_Sub50_Sub19((((Class170) this).aClass505_Sub1_2112), Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099, (((Class505_Sub1) (((Class170) this).aClass505_Sub1_2112)).anInt8475));
			((Class170) this).aClass137_Sub1Array2106[0] = new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099);
			((Class170) this).aClass137_Sub1Array2106[1] = (((Class170) this).anInt2111 > 1 ? new Class137_Sub1(((Class170) this).aClass505_Sub1_2112, 34037, Class150.aClass150_1949, ((Class170) this).aClass76_2102, ((Class170) this).anInt2098, ((Class170) this).anInt2099) : null);
			((Class170) this).aBool2094 = false;
			((Class170) this).aBool2109 = true;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2109) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 532692774);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -94);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2101, -735203060);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13759(0, ((Class170) this).aClass282_Sub50_Sub19_2107);
				((Class170) this).aClass158_Sub1_Sub4_2101.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -77);
			} else {
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 1274331841);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13765(null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, null);
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(0, ((Class170) this).aClass137_Sub1Array2106[0].method14441(0));
				((Class170) this).aClass158_Sub1_Sub4_2092.method13759(1, (((Class170) this).anInt2111 > 1 ? ((Class170) this).aClass137_Sub1Array2106[1].method14441(0) : null));
				if (((Class170) this).aBool2110)
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass137_Sub1_2104.method14440(0));
				else
					((Class170) this).aClass158_Sub1_Sub4_2092.method13765(((Class170) this).aClass282_Sub50_Sub19_2093);
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -58);
			}
			((Class170) this).aBool2109 = false;
			((Class170) this).aBool2105 = true;
		}
		if (((Class170) this).aBool2105) {
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 353967157);
			((Class170) this).aBool2105 = !((Class170) this).aClass158_Sub1_Sub4_2095.method13764();
			((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2095, (byte) -43);
		}
		return !((Class170) this).aBool2105;
	}

	Class170(Class505_Sub1 class505_sub1) {
		((Class170) this).aBool2094 = true;
		((Class170) this).aBool2103 = true;
		((Class170) this).aBool2109 = true;
		((Class170) this).aBool2105 = true;
		((Class170) this).aClass137_Sub1Array2106 = new Class137_Sub1[2];
		((Class170) this).aBool2110 = false;
		((Class170) this).anInt2111 = 0;
		((Class170) this).aClass76_2102 = Class76.aClass76_751;
		((Class170) this).aClass505_Sub1_2112 = class505_sub1;
		if (((Class505_Sub1) ((Class170) this).aClass505_Sub1_2112).aBool8472 && (((Class505_Sub1) ((Class170) this).aClass505_Sub1_2112).aBool8401)) {
			((Class170) this).aClass158_Sub1_Sub4_2095 = ((Class170) this).aClass158_Sub1_Sub4_2092 = new Class158_Sub1_Sub4(((Class170) this).aClass505_Sub1_2112);
			if ((((Class505_Sub1) ((Class170) this).aClass505_Sub1_2112).anInt8475) > 1 && (((Class505_Sub1) ((Class170) this).aClass505_Sub1_2112).aBool8338) && (((Class505_Sub1) ((Class170) this).aClass505_Sub1_2112).aBool8488))
				((Class170) this).aClass158_Sub1_Sub4_2095 = ((Class170) this).aClass158_Sub1_Sub4_2101 = new Class158_Sub1_Sub4(((Class170) this).aClass505_Sub1_2112);
		}
	}

	boolean method2896() {
		return ((Class170) this).aClass158_Sub1_Sub4_2095 != null;
	}

	void method2897() {
		int i = 0;
		boolean bool = false;
		Class76 class76 = Class76.aClass76_751;
		for (Class282_Sub5 class282_sub5 = ((Class282_Sub5) ((Class170) this).aClass473_2108.method7859(509749516)); class282_sub5 != null; class282_sub5 = (Class282_Sub5) ((Class170) this).aClass473_2108.method7857((byte) -17)) {
			Class76 class76_20_ = class282_sub5.method12127();
			if (class76_20_.anInt748 * 971905895 > class76.anInt748 * 971905895)
				class76 = class76_20_;
			bool |= class282_sub5.method12126();
			i += class282_sub5.method12125();
		}
		if (class76 != ((Class170) this).aClass76_2102) {
			((Class170) this).aClass76_2102 = class76;
			((Class170) this).aBool2094 = true;
		}
		int i_21_ = (((Class170) this).anInt2111 > 2 ? 2 : ((Class170) this).anInt2111);
		int i_22_ = i > 2 ? 2 : i;
		if (i_21_ != i_22_) {
			((Class170) this).aBool2094 = true;
			((Class170) this).aBool2109 = true;
		}
		if (bool != ((Class170) this).aBool2110) {
			((Class170) this).aBool2110 = bool;
			((Class170) this).aBool2103 = true;
		}
		((Class170) this).anInt2111 = i;
	}

	void method2898() {
		((Class170) this).aClass158_Sub1_Sub4_2092 = null;
		((Class170) this).aClass158_Sub1_Sub4_2101 = null;
		((Class170) this).aClass158_Sub1_Sub4_2095 = null;
		((Class170) this).aClass282_Sub50_Sub19_2093 = null;
		((Class170) this).aClass137_Sub1_2104 = null;
		((Class170) this).aClass137_Sub1Array2106 = null;
		((Class170) this).aClass282_Sub50_Sub19_2107 = null;
		if (!((Class170) this).aClass473_2108.method7861(141891001)) {
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(659744196); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12120();
		}
		((Class170) this).anInt2099 = 1;
		((Class170) this).anInt2098 = 1;
	}

	boolean method2899(int i, int i_23_, int i_24_, int i_25_) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 == null || ((Class170) this).aClass473_2108.method7861(141891001))
			return false;
		if (((Class170) this).anInt2098 != i_24_ || ((Class170) this).anInt2099 != i_25_) {
			((Class170) this).anInt2098 = i_24_;
			((Class170) this).anInt2099 = i_25_;
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(1133601034); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12122((((Class170) this).anInt2098), (((Class170) this).anInt2099));
			((Class170) this).aBool2094 = true;
			((Class170) this).aBool2103 = true;
			((Class170) this).aBool2109 = true;
		}
		if (method2881()) {
			((Class170) this).anInt2096 = i;
			((Class170) this).anInt2097 = i_23_;
			((Class170) this).aBool2100 = true;
			((Class170) this).aClass505_Sub1_2112.method13640(-((Class170) this).anInt2096, (((Class170) this).anInt2099 + ((Class170) this).anInt2097 - ((Class170) this).aClass505_Sub1_2112.method8523((byte) 106).method2716()));
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 1169300197);
			((Class170) this).aClass505_Sub1_2112.ba(3, 0);
			((Class170) this).aClass158_Sub1_Sub4_2095.method15628(0);
			return true;
		}
		return false;
	}

	boolean method2900(Class282_Sub5 class282_sub5) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 != null) {
			if (class282_sub5.method12141() || class282_sub5.method12136()) {
				((Class170) this).aClass473_2108.method7877(class282_sub5, 1896451818);
				method2886();
				if (method2881()) {
					if (((Class170) this).anInt2098 != -1 && ((Class170) this).anInt2099 != -1)
						class282_sub5.method12122(((Class170) this).anInt2098, ((Class170) this).anInt2099);
					((Class282_Sub5) class282_sub5).aBool7506 = true;
					return true;
				}
			}
			method2885(class282_sub5);
		}
		return false;
	}

	void method2901() {
		if (((Class170) this).aBool2100) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -73);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 101516088);
				((Class170) this).aClass158_Sub1_Sub4_2092.method15628(0);
				((Class170) this).aClass158_Sub1_Sub4_2101.method15624(0, 0, ((Class170) this).anInt2098, ((Class170) this).anInt2099, 0, 0, true, ((Class170) this).aBool2110);
			}
			((Class170) this).aClass505_Sub1_2112.method13637();
			((Class170) this).aClass505_Sub1_2112.method13624(0);
			((Class170) this).aClass505_Sub1_2112.method13612(1);
			((Class170) this).aClass505_Sub1_2112.L();
			int i = 0;
			int i_26_ = 1;
			Class282_Sub5 class282_sub5;
			for (Class282_Sub5 class282_sub5_27_ = (Class282_Sub5) ((Class170) this).aClass473_2108.method7859(1622388917); class282_sub5_27_ != null; class282_sub5_27_ = class282_sub5) {
				class282_sub5 = (Class282_Sub5) ((Class170) this).aClass473_2108.method7857((byte) -103);
				int i_28_ = class282_sub5_27_.method12125();
				for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
					class282_sub5_27_.method12119(i_29_, ((Class170) this).aClass137_Sub1Array2106[i], ((Class170) this).aClass137_Sub1_2104);
					if (class282_sub5 == null && i_29_ == i_28_ - 1) {
						((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -63);
						((Class170) this).aClass505_Sub1_2112.method13640(0, 0);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2096, ((Class170) this).anInt2097);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2096, (((Class170) this).anInt2097 + ((Class170) this).anInt2099));
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i((((Class170) this).anInt2096 + ((Class170) this).anInt2098), (((Class170) this).anInt2097 + ((Class170) this).anInt2099));
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i((((Class170) this).anInt2096 + ((Class170) this).anInt2098), ((Class170) this).anInt2097);
						OpenGL.glEnd();
					} else {
						((Class170) this).aClass158_Sub1_Sub4_2092.method15628(i_26_);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(0, ((Class170) this).anInt2099);
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2098, ((Class170) this).anInt2099);
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2098, 0);
						OpenGL.glEnd();
					}
					class282_sub5_27_.method12121(i_29_);
					i_26_ = i_26_ + 1 & 0x1;
					i = i + 1 & 0x1;
				}
			}
			((Class170) this).aBool2100 = false;
		}
	}

	void method2902() {
		if (((Class170) this).aBool2100) {
			if (((Class170) this).aClass158_Sub1_Sub4_2101 != null) {
				((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2101, (byte) -45);
				((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2092, 884690503);
				((Class170) this).aClass158_Sub1_Sub4_2092.method15628(0);
				((Class170) this).aClass158_Sub1_Sub4_2101.method15624(0, 0, ((Class170) this).anInt2098, ((Class170) this).anInt2099, 0, 0, true, ((Class170) this).aBool2110);
			}
			((Class170) this).aClass505_Sub1_2112.method13637();
			((Class170) this).aClass505_Sub1_2112.method13624(0);
			((Class170) this).aClass505_Sub1_2112.method13612(1);
			((Class170) this).aClass505_Sub1_2112.L();
			int i = 0;
			int i_30_ = 1;
			Class282_Sub5 class282_sub5;
			for (Class282_Sub5 class282_sub5_31_ = (Class282_Sub5) ((Class170) this).aClass473_2108.method7859(1245716997); class282_sub5_31_ != null; class282_sub5_31_ = class282_sub5) {
				class282_sub5 = (Class282_Sub5) ((Class170) this).aClass473_2108.method7857((byte) -72);
				int i_32_ = class282_sub5_31_.method12125();
				for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
					class282_sub5_31_.method12119(i_33_, ((Class170) this).aClass137_Sub1Array2106[i], ((Class170) this).aClass137_Sub1_2104);
					if (class282_sub5 == null && i_33_ == i_32_ - 1) {
						((Class170) this).aClass505_Sub1_2112.method8416(((Class170) this).aClass158_Sub1_Sub4_2092, (byte) -25);
						((Class170) this).aClass505_Sub1_2112.method13640(0, 0);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2096, ((Class170) this).anInt2097);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2096, (((Class170) this).anInt2097 + ((Class170) this).anInt2099));
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i((((Class170) this).anInt2096 + ((Class170) this).anInt2098), (((Class170) this).anInt2097 + ((Class170) this).anInt2099));
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i((((Class170) this).anInt2096 + ((Class170) this).anInt2098), ((Class170) this).anInt2097);
						OpenGL.glEnd();
					} else {
						((Class170) this).aClass158_Sub1_Sub4_2092.method15628(i_30_);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(0, ((Class170) this).anInt2099);
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2098, ((Class170) this).anInt2099);
						OpenGL.glTexCoord2f((float) (((Class170) this).anInt2098), (float) (((Class170) this).anInt2099));
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i(((Class170) this).anInt2098, 0);
						OpenGL.glEnd();
					}
					class282_sub5_31_.method12121(i_33_);
					i_30_ = i_30_ + 1 & 0x1;
					i = i + 1 & 0x1;
				}
			}
			((Class170) this).aBool2100 = false;
		}
	}

	boolean method2903(Class282_Sub5 class282_sub5) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 != null) {
			if (class282_sub5.method12141() || class282_sub5.method12136()) {
				((Class170) this).aClass473_2108.method7877(class282_sub5, 990840249);
				method2886();
				if (method2881()) {
					if (((Class170) this).anInt2098 != -1 && ((Class170) this).anInt2099 != -1)
						class282_sub5.method12122(((Class170) this).anInt2098, ((Class170) this).anInt2099);
					((Class282_Sub5) class282_sub5).aBool7506 = true;
					return true;
				}
			}
			method2885(class282_sub5);
		}
		return false;
	}

	boolean method2904(Class282_Sub5 class282_sub5) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 != null) {
			if (class282_sub5.method12141() || class282_sub5.method12136()) {
				((Class170) this).aClass473_2108.method7877(class282_sub5, 280873562);
				method2886();
				if (method2881()) {
					if (((Class170) this).anInt2098 != -1 && ((Class170) this).anInt2099 != -1)
						class282_sub5.method12122(((Class170) this).anInt2098, ((Class170) this).anInt2099);
					((Class282_Sub5) class282_sub5).aBool7506 = true;
					return true;
				}
			}
			method2885(class282_sub5);
		}
		return false;
	}

	boolean method2905(int i, int i_34_, int i_35_, int i_36_) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 == null || ((Class170) this).aClass473_2108.method7861(141891001))
			return false;
		if (((Class170) this).anInt2098 != i_35_ || ((Class170) this).anInt2099 != i_36_) {
			((Class170) this).anInt2098 = i_35_;
			((Class170) this).anInt2099 = i_36_;
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(1057147905); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12122((((Class170) this).anInt2098), (((Class170) this).anInt2099));
			((Class170) this).aBool2094 = true;
			((Class170) this).aBool2103 = true;
			((Class170) this).aBool2109 = true;
		}
		if (method2881()) {
			((Class170) this).anInt2096 = i;
			((Class170) this).anInt2097 = i_34_;
			((Class170) this).aBool2100 = true;
			((Class170) this).aClass505_Sub1_2112.method13640(-((Class170) this).anInt2096, (((Class170) this).anInt2099 + ((Class170) this).anInt2097 - ((Class170) this).aClass505_Sub1_2112.method8523((byte) 118).method2716()));
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 956644390);
			((Class170) this).aClass505_Sub1_2112.ba(3, 0);
			((Class170) this).aClass158_Sub1_Sub4_2095.method15628(0);
			return true;
		}
		return false;
	}

	boolean method2906(Class282_Sub5 class282_sub5) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 != null) {
			if (class282_sub5.method12141() || class282_sub5.method12136()) {
				((Class170) this).aClass473_2108.method7877(class282_sub5, 1473462273);
				method2886();
				if (method2881()) {
					if (((Class170) this).anInt2098 != -1 && ((Class170) this).anInt2099 != -1)
						class282_sub5.method12122(((Class170) this).anInt2098, ((Class170) this).anInt2099);
					((Class282_Sub5) class282_sub5).aBool7506 = true;
					return true;
				}
			}
			method2885(class282_sub5);
		}
		return false;
	}

	void method2907(Class282_Sub5 class282_sub5) {
		((Class282_Sub5) class282_sub5).aBool7506 = false;
		class282_sub5.method12120();
		class282_sub5.unlink(-371378792);
		method2886();
	}

	boolean method2908(int i, int i_37_, int i_38_, int i_39_) {
		if (((Class170) this).aClass158_Sub1_Sub4_2095 == null || ((Class170) this).aClass473_2108.method7861(141891001))
			return false;
		if (((Class170) this).anInt2098 != i_38_ || ((Class170) this).anInt2099 != i_39_) {
			((Class170) this).anInt2098 = i_38_;
			((Class170) this).anInt2099 = i_39_;
			for (Node class282 = ((Class170) this).aClass473_2108.method7859(1396380065); class282 != ((Class170) this).aClass473_2108.aClass282_5604; class282 = class282.next)
				((Class282_Sub5) class282).method12122((((Class170) this).anInt2098), (((Class170) this).anInt2099));
			((Class170) this).aBool2094 = true;
			((Class170) this).aBool2103 = true;
			((Class170) this).aBool2109 = true;
		}
		if (method2881()) {
			((Class170) this).anInt2096 = i;
			((Class170) this).anInt2097 = i_37_;
			((Class170) this).aBool2100 = true;
			((Class170) this).aClass505_Sub1_2112.method13640(-((Class170) this).anInt2096, (((Class170) this).anInt2099 + ((Class170) this).anInt2097 - ((Class170) this).aClass505_Sub1_2112.method8523((byte) 105).method2716()));
			((Class170) this).aClass505_Sub1_2112.method8637(((Class170) this).aClass158_Sub1_Sub4_2095, 1060609217);
			((Class170) this).aClass505_Sub1_2112.ba(3, 0);
			((Class170) this).aClass158_Sub1_Sub4_2095.method15628(0);
			return true;
		}
		return false;
	}
}
