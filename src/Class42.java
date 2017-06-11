/* Class42 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class42 {
	Class52_Sub1_Sub2 aClass52_Sub1_Sub2_442;
	boolean aBoolean443;
	boolean aBoolean444;
	Class52_Sub1_Sub2 aClass52_Sub1_Sub2_445;
	int anInt446 = 0;
	int anInt447 = 0;
	Class30_Sub2[] aClass30_Sub2Array448;
	int anInt449;
	boolean aBoolean450;
	Class458 aClass458_451;
	Class30_Sub2 aClass30_Sub2_452;
	boolean aBoolean453;
	Class_ra_Sub2 aClass_ra_Sub2_454;
	boolean aBoolean455;
	int anInt456 = 1;
	Class298_Sub37_Sub18 aClass298_Sub37_Sub18_457;
	boolean aBoolean458;
	Class298_Sub37_Sub18 aClass298_Sub37_Sub18_459;
	Class52_Sub1_Sub2 aClass52_Sub1_Sub2_460;
	int anInt461;
	Class77 aClass77_462;

	boolean method481(int i, int i_0_, int i_1_, int i_2_) {
		if (((Class42) this).aClass52_Sub1_Sub2_445 == null || ((Class42) this).aClass458_451.method5970((byte) 63))
			return false;
		if (((Class42) this).anInt456 != i_1_ || ((Class42) this).anInt449 != i_2_) {
			((Class42) this).anInt456 = i_1_;
			((Class42) this).anInt449 = i_2_;
			for (Linkable class298 = ((Class42) this).aClass458_451.method5967(1528300499); class298 != ((Class42) this).aClass458_451.aClass298_5668; class298 = class298.next)
				((Class298_Sub8) class298).method2871((((Class42) this).anInt456), (((Class42) this).anInt449));
			((Class42) this).aBoolean443 = true;
			((Class42) this).aBoolean453 = true;
			((Class42) this).aBoolean444 = true;
		}
		if (method488()) {
			((Class42) this).anInt446 = i;
			((Class42) this).anInt447 = i_0_;
			((Class42) this).aBoolean450 = true;
			((Class42) this).aClass_ra_Sub2_454.method5289(-((Class42) this).anInt446, (((Class42) this).anInt449 + ((Class42) this).anInt447 - ((Class42) this).aClass_ra_Sub2_454.method4992((short) 16970).method552()));
			((Class42) this).aClass_ra_Sub2_454.method5143(((Class42) this).aClass52_Sub1_Sub2_445, (byte) -31);
			((Class42) this).aClass_ra_Sub2_454.ba(3, 0);
			((Class42) this).aClass52_Sub1_Sub2_445.method572(0);
			return true;
		}
		return false;
	}

	boolean method482() {
		return ((Class42) this).aClass52_Sub1_Sub2_445 != null;
	}

	void method483() {
		if (((Class42) this).aBoolean450) {
			if (((Class42) this).aClass52_Sub1_Sub2_460 != null) {
				((Class42) this).aClass_ra_Sub2_454.method5005(((Class42) this).aClass52_Sub1_Sub2_460, (byte) -72);
				((Class42) this).aClass_ra_Sub2_454.method5143(((Class42) this).aClass52_Sub1_Sub2_442, (byte) -36);
				((Class42) this).aClass52_Sub1_Sub2_442.method572(0);
				((Class42) this).aClass52_Sub1_Sub2_460.method570(0, 0, ((Class42) this).anInt456, ((Class42) this).anInt449, 0, 0, true, ((Class42) this).aBoolean458);
			}
			((Class42) this).aClass_ra_Sub2_454.method5251();
			((Class42) this).aClass_ra_Sub2_454.method5266(0);
			((Class42) this).aClass_ra_Sub2_454.method5243(1);
			((Class42) this).aClass_ra_Sub2_454.L();
			int i = 0;
			int i_3_ = 1;
			Class298_Sub8 class298_sub8;
			for (Class298_Sub8 class298_sub8_4_ = ((Class298_Sub8) ((Class42) this).aClass458_451.method5967(1607067175)); class298_sub8_4_ != null; class298_sub8_4_ = class298_sub8) {
				class298_sub8 = (Class298_Sub8) ((Class42) this).aClass458_451.method5969((byte) -76);
				int i_5_ = class298_sub8_4_.method2874();
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					class298_sub8_4_.method2872(i_6_, (((Class42) this).aClass30_Sub2Array448[i]), (((Class42) this).aClass30_Sub2_452));
					if (class298_sub8 == null && i_6_ == i_5_ - 1) {
						((Class42) this).aClass_ra_Sub2_454.method5005(((Class42) this).aClass52_Sub1_Sub2_442, (byte) 40);
						((Class42) this).aClass_ra_Sub2_454.method5289(0, 0);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) ((Class42) this).anInt449);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(((Class42) this).anInt446, ((Class42) this).anInt447);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(((Class42) this).anInt446, (((Class42) this).anInt447 + ((Class42) this).anInt449));
						OpenGL.glTexCoord2f((float) ((Class42) this).anInt456, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i((((Class42) this).anInt446 + ((Class42) this).anInt456), (((Class42) this).anInt447 + ((Class42) this).anInt449));
						OpenGL.glTexCoord2f((float) ((Class42) this).anInt456, (float) ((Class42) this).anInt449);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i((((Class42) this).anInt446 + ((Class42) this).anInt456), ((Class42) this).anInt447);
						OpenGL.glEnd();
					} else {
						((Class42) this).aClass52_Sub1_Sub2_442.method572(i_3_);
						OpenGL.glBegin(7);
						OpenGL.glTexCoord2f(0.0F, (float) ((Class42) this).anInt449);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
						OpenGL.glVertex2i(0, 0);
						OpenGL.glTexCoord2f(0.0F, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
						OpenGL.glVertex2i(0, ((Class42) this).anInt449);
						OpenGL.glTexCoord2f((float) ((Class42) this).anInt456, 0.0F);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
						OpenGL.glVertex2i(((Class42) this).anInt456, ((Class42) this).anInt449);
						OpenGL.glTexCoord2f((float) ((Class42) this).anInt456, (float) ((Class42) this).anInt449);
						OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
						OpenGL.glVertex2i(((Class42) this).anInt456, 0);
						OpenGL.glEnd();
					}
					class298_sub8_4_.method2873(i_6_);
					i_3_ = i_3_ + 1 & 0x1;
					i = i + 1 & 0x1;
				}
			}
			((Class42) this).aBoolean450 = false;
		}
	}

	Class42(Class_ra_Sub2 class_ra_sub2) {
		((Class42) this).anInt449 = 1;
		((Class42) this).aClass458_451 = new Class458();
		((Class42) this).aBoolean443 = true;
		((Class42) this).aBoolean453 = true;
		((Class42) this).aBoolean444 = true;
		((Class42) this).aBoolean455 = true;
		((Class42) this).aClass30_Sub2Array448 = new Class30_Sub2[2];
		((Class42) this).aBoolean458 = false;
		((Class42) this).anInt461 = 0;
		((Class42) this).aClass77_462 = Class77.aClass77_717;
		((Class42) this).aClass_ra_Sub2_454 = class_ra_sub2;
		if (((Class_ra_Sub2) ((Class42) this).aClass_ra_Sub2_454).aBoolean8170 && (((Class_ra_Sub2) ((Class42) this).aClass_ra_Sub2_454).aBoolean8179)) {
			((Class42) this).aClass52_Sub1_Sub2_445 = ((Class42) this).aClass52_Sub1_Sub2_442 = new Class52_Sub1_Sub2(((Class42) this).aClass_ra_Sub2_454);
			if ((((Class_ra_Sub2) ((Class42) this).aClass_ra_Sub2_454).anInt8051) > 1 && (((Class_ra_Sub2) ((Class42) this).aClass_ra_Sub2_454).aBoolean8171) && (((Class_ra_Sub2) ((Class42) this).aClass_ra_Sub2_454).aBoolean8137))
				((Class42) this).aClass52_Sub1_Sub2_445 = ((Class42) this).aClass52_Sub1_Sub2_460 = new Class52_Sub1_Sub2(((Class42) this).aClass_ra_Sub2_454);
		}
	}

	boolean method484(Class298_Sub8 class298_sub8) {
		if (((Class42) this).aClass52_Sub1_Sub2_445 != null) {
			if (class298_sub8.method2868() || class298_sub8.method2869()) {
				((Class42) this).aClass458_451.method5968(class298_sub8, 1179569939);
				method487();
				if (method488()) {
					if (((Class42) this).anInt456 != -1 && ((Class42) this).anInt449 != -1)
						class298_sub8.method2871(((Class42) this).anInt456, ((Class42) this).anInt449);
					((Class298_Sub8) class298_sub8).aBoolean7221 = true;
					return true;
				}
			}
			method485(class298_sub8);
		}
		return false;
	}

	void method485(Class298_Sub8 class298_sub8) {
		((Class298_Sub8) class298_sub8).aBoolean7221 = false;
		class298_sub8.method2870();
		class298_sub8.unlink(-1460969981);
		method487();
	}

	void method486() {
		((Class42) this).aClass52_Sub1_Sub2_442 = null;
		((Class42) this).aClass52_Sub1_Sub2_460 = null;
		((Class42) this).aClass52_Sub1_Sub2_445 = null;
		((Class42) this).aClass298_Sub37_Sub18_459 = null;
		((Class42) this).aClass30_Sub2_452 = null;
		((Class42) this).aClass30_Sub2Array448 = null;
		((Class42) this).aClass298_Sub37_Sub18_457 = null;
		if (!((Class42) this).aClass458_451.method5970((byte) 106)) {
			for (Linkable class298 = ((Class42) this).aClass458_451.method5967(1803490493); class298 != ((Class42) this).aClass458_451.aClass298_5668; class298 = class298.next)
				((Class298_Sub8) class298).method2870();
		}
		((Class42) this).anInt449 = 1;
		((Class42) this).anInt456 = 1;
	}

	void method487() {
		int i = 0;
		boolean bool = false;
		Class77 class77 = Class77.aClass77_717;
		for (Class298_Sub8 class298_sub8 = ((Class298_Sub8) ((Class42) this).aClass458_451.method5967(1419681613)); class298_sub8 != null; class298_sub8 = (Class298_Sub8) ((Class42) this).aClass458_451.method5969((byte) -84)) {
			Class77 class77_7_ = class298_sub8.method2875();
			if (class77_7_.anInt724 * 685647847 > class77.anInt724 * 685647847)
				class77 = class77_7_;
			bool |= class298_sub8.method2881();
			i += class298_sub8.method2874();
		}
		if (class77 != ((Class42) this).aClass77_462) {
			((Class42) this).aClass77_462 = class77;
			((Class42) this).aBoolean443 = true;
		}
		int i_8_ = ((Class42) this).anInt461 > 2 ? 2 : ((Class42) this).anInt461;
		int i_9_ = i > 2 ? 2 : i;
		if (i_8_ != i_9_) {
			((Class42) this).aBoolean443 = true;
			((Class42) this).aBoolean444 = true;
		}
		if (bool != ((Class42) this).aBoolean458) {
			((Class42) this).aBoolean458 = bool;
			((Class42) this).aBoolean453 = true;
		}
		((Class42) this).anInt461 = i;
	}

	boolean method488() {
		if (((Class42) this).aBoolean453) {
			if (((Class42) this).aClass298_Sub37_Sub18_459 != null) {
				((Class42) this).aClass298_Sub37_Sub18_459.b();
				((Class42) this).aClass298_Sub37_Sub18_459 = null;
			}
			if (((Class42) this).aClass30_Sub2_452 != null) {
				((Class42) this).aClass30_Sub2_452.method408();
				((Class42) this).aClass30_Sub2_452 = null;
			}
		}
		if (((Class42) this).aBoolean443) {
			if (((Class42) this).aClass298_Sub37_Sub18_457 != null) {
				((Class42) this).aClass298_Sub37_Sub18_457.b();
				((Class42) this).aClass298_Sub37_Sub18_457 = null;
			}
			if (((Class42) this).aClass30_Sub2Array448[0] != null) {
				((Class42) this).aClass30_Sub2Array448[0].method408();
				((Class42) this).aClass30_Sub2Array448[0] = null;
			}
			if (((Class42) this).aClass30_Sub2Array448[1] != null) {
				((Class42) this).aClass30_Sub2Array448[1].method408();
				((Class42) this).aClass30_Sub2Array448[1] = null;
			}
		}
		if (((Class42) this).aBoolean453) {
			if (((Class42) this).aClass52_Sub1_Sub2_460 != null)
				((Class42) this).aClass298_Sub37_Sub18_459 = (new Class298_Sub37_Sub18(((Class42) this).aClass_ra_Sub2_454, Class55.aClass55_561, Class77.aClass77_719, ((Class42) this).anInt456, ((Class42) this).anInt449, (((Class_ra_Sub2) ((Class42) this).aClass_ra_Sub2_454).anInt8051)));
			if (((Class42) this).aBoolean458)
				((Class42) this).aClass30_Sub2_452 = new Class30_Sub2(((Class42) this).aClass_ra_Sub2_454, 34037, Class55.aClass55_561, Class77.aClass77_719, ((Class42) this).anInt456, ((Class42) this).anInt449);
			else if (((Class42) this).aClass298_Sub37_Sub18_459 == null)
				((Class42) this).aClass298_Sub37_Sub18_459 = new Class298_Sub37_Sub18((((Class42) this).aClass_ra_Sub2_454), Class55.aClass55_561, Class77.aClass77_719, ((Class42) this).anInt456, ((Class42) this).anInt449);
			((Class42) this).aBoolean453 = false;
			((Class42) this).aBoolean444 = true;
			((Class42) this).aBoolean455 = true;
		}
		if (((Class42) this).aBoolean443) {
			if (((Class42) this).aClass52_Sub1_Sub2_460 != null)
				((Class42) this).aClass298_Sub37_Sub18_457 = (new Class298_Sub37_Sub18(((Class42) this).aClass_ra_Sub2_454, Class55.aClass55_557, ((Class42) this).aClass77_462, ((Class42) this).anInt456, ((Class42) this).anInt449, (((Class_ra_Sub2) ((Class42) this).aClass_ra_Sub2_454).anInt8051)));
			((Class42) this).aClass30_Sub2Array448[0] = new Class30_Sub2(((Class42) this).aClass_ra_Sub2_454, 34037, Class55.aClass55_557, ((Class42) this).aClass77_462, ((Class42) this).anInt456, ((Class42) this).anInt449);
			((Class42) this).aClass30_Sub2Array448[1] = (((Class42) this).anInt461 > 1 ? new Class30_Sub2(((Class42) this).aClass_ra_Sub2_454, 34037, Class55.aClass55_557, ((Class42) this).aClass77_462, ((Class42) this).anInt456, ((Class42) this).anInt449) : null);
			((Class42) this).aBoolean443 = false;
			((Class42) this).aBoolean444 = true;
			((Class42) this).aBoolean455 = true;
		}
		if (((Class42) this).aBoolean444) {
			if (((Class42) this).aClass52_Sub1_Sub2_460 != null) {
				((Class42) this).aClass_ra_Sub2_454.method5143(((Class42) this).aClass52_Sub1_Sub2_442, (byte) -20);
				((Class42) this).aClass52_Sub1_Sub2_442.method558(null);
				((Class42) this).aClass52_Sub1_Sub2_442.method563(0, null);
				((Class42) this).aClass52_Sub1_Sub2_442.method563(1, null);
				((Class42) this).aClass52_Sub1_Sub2_442.method563(0, ((Class42) this).aClass30_Sub2Array448[0].method423(0));
				((Class42) this).aClass52_Sub1_Sub2_442.method563(1, (((Class42) this).anInt461 > 1 ? ((Class42) this).aClass30_Sub2Array448[1].method423(0) : null));
				if (((Class42) this).aBoolean458)
					((Class42) this).aClass52_Sub1_Sub2_442.method558(((Class42) this).aClass30_Sub2_452.method424(0));
				((Class42) this).aClass_ra_Sub2_454.method5005(((Class42) this).aClass52_Sub1_Sub2_442, (byte) -22);
				((Class42) this).aClass_ra_Sub2_454.method5143(((Class42) this).aClass52_Sub1_Sub2_460, (byte) 12);
				((Class42) this).aClass52_Sub1_Sub2_460.method558(null);
				((Class42) this).aClass52_Sub1_Sub2_460.method563(0, null);
				((Class42) this).aClass52_Sub1_Sub2_460.method563(0, ((Class42) this).aClass298_Sub37_Sub18_457);
				((Class42) this).aClass52_Sub1_Sub2_460.method558(((Class42) this).aClass298_Sub37_Sub18_459);
				((Class42) this).aClass_ra_Sub2_454.method5005(((Class42) this).aClass52_Sub1_Sub2_460, (byte) 18);
			} else {
				((Class42) this).aClass_ra_Sub2_454.method5143(((Class42) this).aClass52_Sub1_Sub2_442, (byte) -69);
				((Class42) this).aClass52_Sub1_Sub2_442.method558(null);
				((Class42) this).aClass52_Sub1_Sub2_442.method563(0, null);
				((Class42) this).aClass52_Sub1_Sub2_442.method563(1, null);
				((Class42) this).aClass52_Sub1_Sub2_442.method563(0, ((Class42) this).aClass30_Sub2Array448[0].method423(0));
				((Class42) this).aClass52_Sub1_Sub2_442.method563(1, (((Class42) this).anInt461 > 1 ? ((Class42) this).aClass30_Sub2Array448[1].method423(0) : null));
				if (((Class42) this).aBoolean458)
					((Class42) this).aClass52_Sub1_Sub2_442.method558(((Class42) this).aClass30_Sub2_452.method424(0));
				else
					((Class42) this).aClass52_Sub1_Sub2_442.method558(((Class42) this).aClass298_Sub37_Sub18_459);
				((Class42) this).aClass_ra_Sub2_454.method5005(((Class42) this).aClass52_Sub1_Sub2_442, (byte) 1);
			}
			((Class42) this).aBoolean444 = false;
			((Class42) this).aBoolean455 = true;
		}
		if (((Class42) this).aBoolean455) {
			((Class42) this).aClass_ra_Sub2_454.method5143(((Class42) this).aClass52_Sub1_Sub2_445, (byte) -31);
			((Class42) this).aBoolean455 = !((Class42) this).aClass52_Sub1_Sub2_445.method560();
			((Class42) this).aClass_ra_Sub2_454.method5005(((Class42) this).aClass52_Sub1_Sub2_445, (byte) 15);
		}
		return !((Class42) this).aBoolean455;
	}
}
