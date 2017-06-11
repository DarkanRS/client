/* Class66_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class66_Sub1_Sub2 extends Class66_Sub1 {
	static int[] anIntArray9098 = new int[4];
	Class30_Sub1 aClass30_Sub1_9099;
	Class_ra_Sub2 aClass_ra_Sub2_9100;

	int method771() {
		return (((Class30_Sub1) ((Class66_Sub1_Sub2) this).aClass30_Sub1_9099).anInt6745);
	}

	Class30_Sub1 method769() {
		return ((Class66_Sub1_Sub2) this).aClass30_Sub1_9099;
	}

	boolean method772(Class30_Sub1 class30_sub1, Class30_Sub1 class30_sub1_0_, float f) {
		boolean bool = true;
		Class52_Sub1_Sub2 class52_sub1_sub2 = (((Class_ra_Sub2) ((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100).aClass52_Sub1_Sub2_8148);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.qa(anIntArray9098);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.L();
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5291();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, ((Class30_Sub1) (((Class66_Sub1_Sub2) this).aClass30_Sub1_9099)).anInt6745, ((Class30_Sub1) (((Class66_Sub1_Sub2) this).aClass30_Sub1_9099)).anInt6745);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5226(false);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5262(false);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5264(false);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5281(false);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5275(-2);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5255(1);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5260(0.0F, 0.0F, 0.0F, f);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5258(34165, 34165);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5256(class30_sub1_0_);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5255(0);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5243(1);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5256(class30_sub1);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5143(class52_sub1_sub2, (byte) 35);
		for (int i = 0; i < 6; i++) {
			int i_1_ = 34069 + i;
			class52_sub1_sub2.method563(0, ((Class66_Sub1_Sub2) this).aClass30_Sub1_9099.method418(i_1_, 0));
			class52_sub1_sub2.method572(0);
			if (class52_sub1_sub2.method560()) {
				OpenGL.glBegin(7);
				switch (i_1_) {
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
				}
				OpenGL.glEnd();
			} else {
				bool = false;
				break;
			}
		}
		class52_sub1_sub2.method563(0, null);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5005(class52_sub1_sub2, (byte) 34);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5255(1);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5256(null);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5258(8448, 8448);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5255(0);
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.method5256(null);
		OpenGL.glPopAttrib();
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100.r(anIntArray9098[0], anIntArray9098[1], anIntArray9098[2], anIntArray9098[3]);
		if (bool && !((Class_ra_Sub2) (((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100)).aBoolean8172)
			((Class66_Sub1_Sub2) this).aClass30_Sub1_9099.method413();
		return bool;
	}

	Class30_Sub1 method770() {
		return ((Class66_Sub1_Sub2) this).aClass30_Sub1_9099;
	}

	Class66_Sub1_Sub2(Class_ra_Sub2 class_ra_sub2, int i) {
		((Class66_Sub1_Sub2) this).aClass_ra_Sub2_9100 = class_ra_sub2;
		((Class66_Sub1_Sub2) this).aClass30_Sub1_9099 = new Class30_Sub1(class_ra_sub2, Class55.aClass55_557, Class77.aClass77_717, i);
	}
}
