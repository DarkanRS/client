
/* Class152_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class152_Sub1_Sub2 extends Class152_Sub1 {
	Class505_Sub1 aClass505_Sub1_10123;
	Class137_Sub2 aClass137_Sub2_10124;
	static int[] anIntArray10125 = new int[4];

	int method15529() {
		return (((Class137_Sub2) ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124).anInt9104);
	}

	boolean method15530(Class137_Sub2 class137_sub2, Class137_Sub2 class137_sub2_0_, float f) {
		boolean bool = true;
		Class158_Sub1_Sub4 class158_sub1_sub4 = (((Class505_Sub1) ((Class152_Sub1_Sub2) this).aClass505_Sub1_10123).aClass158_Sub1_Sub4_8493);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.qa(anIntArray10125);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.L();
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13586();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, ((Class137_Sub2) (((Class152_Sub1_Sub2) this).aClass137_Sub2_10124)).anInt9104, ((Class137_Sub2) (((Class152_Sub1_Sub2) this).aClass137_Sub2_10124)).anInt9104);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13642(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13620(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13656(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13623(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13581(-2);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13635(0.0F, 0.0F, 0.0F, f);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13717(34165, 34165);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(class137_sub2_0_);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(0);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13612(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(class137_sub2);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method8637(class158_sub1_sub4, -1947711799);
		for (int i = 0; i < 6; i++) {
			int i_1_ = 34069 + i;
			class158_sub1_sub4.method13759(0, ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124.method14458(i_1_, 0));
			class158_sub1_sub4.method15628(0);
			if (class158_sub1_sub4.method13764()) {
				OpenGL.glBegin(7);
				switch (i_1_) {
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class158_sub1_sub4.method13759(0, null);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method8416(class158_sub1_sub4, (byte) -24);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(null);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13717(8448, 8448);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(0);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(null);
		OpenGL.glPopAttrib();
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.r(anIntArray10125[0], anIntArray10125[1], anIntArray10125[2], anIntArray10125[3]);
		if (bool && !((Class505_Sub1) (((Class152_Sub1_Sub2) this).aClass505_Sub1_10123)).aBool8465)
			((Class152_Sub1_Sub2) this).aClass137_Sub2_10124.method2353();
		return bool;
	}

	Class137_Sub2 method13519() {
		return ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124;
	}

	boolean method15531(Class137_Sub2 class137_sub2, Class137_Sub2 class137_sub2_2_, float f) {
		boolean bool = true;
		Class158_Sub1_Sub4 class158_sub1_sub4 = (((Class505_Sub1) ((Class152_Sub1_Sub2) this).aClass505_Sub1_10123).aClass158_Sub1_Sub4_8493);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.qa(anIntArray10125);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.L();
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13586();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, ((Class137_Sub2) (((Class152_Sub1_Sub2) this).aClass137_Sub2_10124)).anInt9104, ((Class137_Sub2) (((Class152_Sub1_Sub2) this).aClass137_Sub2_10124)).anInt9104);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13642(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13620(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13656(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13623(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13581(-2);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13635(0.0F, 0.0F, 0.0F, f);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13717(34165, 34165);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(class137_sub2_2_);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(0);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13612(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(class137_sub2);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method8637(class158_sub1_sub4, 1679995585);
		for (int i = 0; i < 6; i++) {
			int i_3_ = 34069 + i;
			class158_sub1_sub4.method13759(0, ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124.method14458(i_3_, 0));
			class158_sub1_sub4.method15628(0);
			if (class158_sub1_sub4.method13764()) {
				OpenGL.glBegin(7);
				switch (i_3_) {
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class158_sub1_sub4.method13759(0, null);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method8416(class158_sub1_sub4, (byte) -26);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(null);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13717(8448, 8448);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(0);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(null);
		OpenGL.glPopAttrib();
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.r(anIntArray10125[0], anIntArray10125[1], anIntArray10125[2], anIntArray10125[3]);
		if (bool && !((Class505_Sub1) (((Class152_Sub1_Sub2) this).aClass505_Sub1_10123)).aBool8465)
			((Class152_Sub1_Sub2) this).aClass137_Sub2_10124.method2353();
		return bool;
	}

	Class137_Sub2 method13520() {
		return ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124;
	}

	int method15532() {
		return (((Class137_Sub2) ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124).anInt9104);
	}

	Class137_Sub2 method13521() {
		return ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124;
	}

	Class152_Sub1_Sub2(Class505_Sub1 class505_sub1, int i) {
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123 = class505_sub1;
		((Class152_Sub1_Sub2) this).aClass137_Sub2_10124 = new Class137_Sub2(class505_sub1, Class150.aClass150_1949, Class76.aClass76_751, i);
	}

	boolean method15533(Class137_Sub2 class137_sub2, Class137_Sub2 class137_sub2_4_, float f) {
		boolean bool = true;
		Class158_Sub1_Sub4 class158_sub1_sub4 = (((Class505_Sub1) ((Class152_Sub1_Sub2) this).aClass505_Sub1_10123).aClass158_Sub1_Sub4_8493);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.qa(anIntArray10125);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.L();
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13586();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, ((Class137_Sub2) (((Class152_Sub1_Sub2) this).aClass137_Sub2_10124)).anInt9104, ((Class137_Sub2) (((Class152_Sub1_Sub2) this).aClass137_Sub2_10124)).anInt9104);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13642(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13620(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13656(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13623(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13581(-2);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13635(0.0F, 0.0F, 0.0F, f);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13717(34165, 34165);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(class137_sub2_4_);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(0);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13612(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(class137_sub2);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method8637(class158_sub1_sub4, -2090028482);
		for (int i = 0; i < 6; i++) {
			int i_5_ = 34069 + i;
			class158_sub1_sub4.method13759(0, ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124.method14458(i_5_, 0));
			class158_sub1_sub4.method15628(0);
			if (class158_sub1_sub4.method13764()) {
				OpenGL.glBegin(7);
				switch (i_5_) {
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class158_sub1_sub4.method13759(0, null);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method8416(class158_sub1_sub4, (byte) -26);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(null);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13717(8448, 8448);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(0);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(null);
		OpenGL.glPopAttrib();
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.r(anIntArray10125[0], anIntArray10125[1], anIntArray10125[2], anIntArray10125[3]);
		if (bool && !((Class505_Sub1) (((Class152_Sub1_Sub2) this).aClass505_Sub1_10123)).aBool8465)
			((Class152_Sub1_Sub2) this).aClass137_Sub2_10124.method2353();
		return bool;
	}

	boolean method15534(Class137_Sub2 class137_sub2, Class137_Sub2 class137_sub2_6_, float f) {
		boolean bool = true;
		Class158_Sub1_Sub4 class158_sub1_sub4 = (((Class505_Sub1) ((Class152_Sub1_Sub2) this).aClass505_Sub1_10123).aClass158_Sub1_Sub4_8493);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.qa(anIntArray10125);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.L();
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13586();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, ((Class137_Sub2) (((Class152_Sub1_Sub2) this).aClass137_Sub2_10124)).anInt9104, ((Class137_Sub2) (((Class152_Sub1_Sub2) this).aClass137_Sub2_10124)).anInt9104);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13642(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13620(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13656(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13623(false);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13581(-2);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13635(0.0F, 0.0F, 0.0F, f);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13717(34165, 34165);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(class137_sub2_6_);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(0);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13612(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(class137_sub2);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method8637(class158_sub1_sub4, 1840720713);
		for (int i = 0; i < 6; i++) {
			int i_7_ = 34069 + i;
			class158_sub1_sub4.method13759(0, ((Class152_Sub1_Sub2) this).aClass137_Sub2_10124.method14458(i_7_, 0));
			class158_sub1_sub4.method15628(0);
			if (class158_sub1_sub4.method13764()) {
				OpenGL.glBegin(7);
				switch (i_7_) {
				case 34073:
					OpenGL.glTexCoord3i(-65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65534, 65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34071:
					OpenGL.glTexCoord3i(-65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, 65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34069:
					OpenGL.glTexCoord3i(65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34070:
					OpenGL.glTexCoord3i(-65535, 65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, 65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65535, -65534, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65535, -65534, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34072:
					OpenGL.glTexCoord3i(-65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, 65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(-65534, -65535, -65534);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				case 34074:
					OpenGL.glTexCoord3i(65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
					OpenGL.glVertex2f(0.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, 65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
					OpenGL.glVertex2f(1.0F, 0.0F);
					OpenGL.glTexCoord3i(-65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
					OpenGL.glVertex2f(1.0F, 1.0F);
					OpenGL.glTexCoord3i(65534, -65534, -65535);
					OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
					OpenGL.glVertex2f(0.0F, 1.0F);
					break;
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class158_sub1_sub4.method13759(0, null);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method8416(class158_sub1_sub4, (byte) -43);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(1);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(null);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13717(8448, 8448);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13610(0);
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.method13654(null);
		OpenGL.glPopAttrib();
		((Class152_Sub1_Sub2) this).aClass505_Sub1_10123.r(anIntArray10125[0], anIntArray10125[1], anIntArray10125[2], anIntArray10125[3]);
		if (bool && !((Class505_Sub1) (((Class152_Sub1_Sub2) this).aClass505_Sub1_10123)).aBool8465)
			((Class152_Sub1_Sub2) this).aClass137_Sub2_10124.method2353();
		return bool;
	}
}
