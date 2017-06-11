/* Class82_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub22 extends Class82 {
	int anInt6902;
	static int anInt6903 = 1;
	int anInt6904;
	int anInt6905;
	static int anInt6906 = 0;
	int anInt6907;
	int anInt6908;
	int anInt6909;
	int anInt6910;
	int anInt6911;
	int anInt6912;
	int anInt6913;
	int anInt6914;
	int anInt6915;
	int anInt6916;
	static int anInt6917;

	boolean method939() {
		Class398 class398 = (Class158_Sub1.aClass389_8568.method4857(1632084697 * ((Class82_Sub22) this).anInt6908, -1743709088));
		boolean bool = class398.method4919((byte) 119);
		Class391 class391 = Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) -66);
		bool &= class391.method4880(1883883362);
		return bool;
	}

	Class82_Sub22(RsByteBuffer class298_sub53, int i, int i_0_) {
		super(class298_sub53);
		if (i == 0) {
			int i_1_ = class298_sub53.readInt((byte) -14);
			((Class82_Sub22) this).anInt6902 = (i_1_ >>> 16) * -46611099;
			((Class82_Sub22) this).anInt6907 = 415557701 * (i_1_ & 0xffff);
			((Class82_Sub22) this).anInt6905 = 425099019;
		} else {
			((Class82_Sub22) this).anInt6902 = 46611099;
			((Class82_Sub22) this).anInt6907 = -415557701;
			((Class82_Sub22) this).anInt6905 = class298_sub53.readUnsignedShort() * -425099019;
		}
		if (0 == i_0_) {
			int i_2_ = class298_sub53.readInt((byte) 26);
			((Class82_Sub22) this).anInt6913 = 1611083453 * (i_2_ >>> 16);
			((Class82_Sub22) this).anInt6911 = (i_2_ & 0xffff) * -1666710765;
			((Class82_Sub22) this).anInt6909 = -514357691;
		} else {
			((Class82_Sub22) this).anInt6913 = -1611083453;
			((Class82_Sub22) this).anInt6911 = 1666710765;
			((Class82_Sub22) this).anInt6909 = class298_sub53.readUnsignedShort() * 514357691;
		}
		if (i == 0 && i_0_ == 0)
			((Class82_Sub22) this).anInt6910 = class298_sub53.readUnsignedByte() * -776341541;
		else
			((Class82_Sub22) this).anInt6910 = 776341541;
		((Class82_Sub22) this).anInt6908 = class298_sub53.readUnsignedShort() * 587513193;
		((Class82_Sub22) this).anInt6916 = class298_sub53.readUnsignedByte() * -479097679;
		((Class82_Sub22) this).anInt6912 = class298_sub53.readUnsignedByte() * -666257507;
		((Class82_Sub22) this).anInt6904 = class298_sub53.read24BitUnsignedInteger((byte) 75) * 856962157;
		((Class82_Sub22) this).anInt6915 = class298_sub53.readUnsignedShort() * 1304794705;
		((Class82_Sub22) this).anInt6914 = class298_sub53.readUnsignedByte() * -757238655;
	}

	boolean method870(int i) {
		try {
			Class398 class398 = Class158_Sub1.aClass389_8568.method4857((1632084697 * ((Class82_Sub22) this).anInt6908), -1845152840);
			boolean bool = class398.method4919((byte) 118);
			Class391 class391 = Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) -64);
			bool &= class391.method4880(1376129821);
			return bool;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yu.p(").append(')').toString());
		}
	}

	public void method868() {
		int i;
		int i_3_;
		int i_4_;
		if (227468397 * ((Class82_Sub22) this).anInt6902 >= 0) {
			i = 256 + ((Class82_Sub22) this).anInt6902 * 499702272;
			i_3_ = 256 + ((Class82_Sub22) this).anInt6907 * 869603840;
			i_4_ = ((Class82_Sub22) this).anInt6910 * -356438957;
		} else {
			Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[((Class82_Sub22) this).anInt6905 * -153670819].method1015(1193612238);
			Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
			i = (int) class217.aFloat2451;
			i_3_ = (int) class217.aFloat2454;
			i_4_ = class365_sub1_sub1_sub2.plane;
		}
		int i_5_;
		int i_6_;
		if (916056717 * ((Class82_Sub22) this).anInt6907 >= 0) {
			i_5_ = ((Class82_Sub22) this).anInt6913 * -679925248 + 256;
			i_6_ = 1149122048 * ((Class82_Sub22) this).anInt6911 + 256;
		} else {
			Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[((Class82_Sub22) this).anInt6909 * -1629854861].method1015(143521447);
			Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
			i_5_ = (int) class217.aFloat2451;
			i_6_ = (int) class217.aFloat2454;
			if (i_4_ < 0)
				i_4_ = class365_sub1_sub1_sub2.plane;
		}
		int i_7_ = ((Class82_Sub22) this).anInt6914 * 1745275777 << 2;
		Class365_Sub1_Sub1_Sub1 class365_sub1_sub1_sub1 = (new Class365_Sub1_Sub1_Sub1(client.aClass283_8716.method2675(-1611682495), ((Class82_Sub22) this).anInt6908 * 1632084697, i_4_, i_4_, i, i_3_, ((Class82_Sub22) this).anInt6916 * 266943569 << 2, client.anInt8884 * 443738891, (929559909 * ((Class82_Sub22) this).anInt6904 + client.anInt8884 * 443738891), -1300008271 * ((Class82_Sub22) this).anInt6915, i_7_, ((Class82_Sub22) this).anInt6905 * -153670819 + 1, 1 + -1629854861
				* ((Class82_Sub22) this).anInt6909, ((Class82_Sub22) this).anInt6912 * 172590773 << 2, false, 0));
		class365_sub1_sub1_sub1.method4405(i_5_, i_6_, 172590773 * ((Class82_Sub22) this).anInt6912 << 2, (client.anInt8884 * 443738891 + 929559909 * ((Class82_Sub22) this).anInt6904), -414343918);
		client.aClass453_8824.method5935(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1), 1292621740);
	}

	public void method869() {
		int i;
		int i_8_;
		int i_9_;
		if (227468397 * ((Class82_Sub22) this).anInt6902 >= 0) {
			i = 256 + ((Class82_Sub22) this).anInt6902 * 499702272;
			i_8_ = 256 + ((Class82_Sub22) this).anInt6907 * 869603840;
			i_9_ = ((Class82_Sub22) this).anInt6910 * -356438957;
		} else {
			Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[((Class82_Sub22) this).anInt6905 * -153670819].method1015(1656183484);
			Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
			i = (int) class217.aFloat2451;
			i_8_ = (int) class217.aFloat2454;
			i_9_ = class365_sub1_sub1_sub2.plane;
		}
		int i_10_;
		int i_11_;
		if (916056717 * ((Class82_Sub22) this).anInt6907 >= 0) {
			i_10_ = ((Class82_Sub22) this).anInt6913 * -679925248 + 256;
			i_11_ = 1149122048 * ((Class82_Sub22) this).anInt6911 + 256;
		} else {
			Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[((Class82_Sub22) this).anInt6909 * -1629854861].method1015(43837883);
			Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
			i_10_ = (int) class217.aFloat2451;
			i_11_ = (int) class217.aFloat2454;
			if (i_9_ < 0)
				i_9_ = class365_sub1_sub1_sub2.plane;
		}
		int i_12_ = ((Class82_Sub22) this).anInt6914 * 1745275777 << 2;
		Class365_Sub1_Sub1_Sub1 class365_sub1_sub1_sub1 = (new Class365_Sub1_Sub1_Sub1(client.aClass283_8716.method2675(-1611682495), ((Class82_Sub22) this).anInt6908 * 1632084697, i_9_, i_9_, i, i_8_, ((Class82_Sub22) this).anInt6916 * 266943569 << 2, client.anInt8884 * 443738891, (929559909 * ((Class82_Sub22) this).anInt6904 + client.anInt8884 * 443738891), -1300008271 * ((Class82_Sub22) this).anInt6915, i_12_, ((Class82_Sub22) this).anInt6905 * -153670819 + 1, 1 + -1629854861
				* ((Class82_Sub22) this).anInt6909, ((Class82_Sub22) this).anInt6912 * 172590773 << 2, false, 0));
		class365_sub1_sub1_sub1.method4405(i_10_, i_11_, 172590773 * ((Class82_Sub22) this).anInt6912 << 2, (client.anInt8884 * 443738891 + 929559909 * ((Class82_Sub22) this).anInt6904), 1238518641);
		client.aClass453_8824.method5935(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1), 489461607);
	}

	public void method866(int i) {
		try {
			int i_13_;
			int i_14_;
			int i_15_;
			if (227468397 * ((Class82_Sub22) this).anInt6902 >= 0) {
				i_13_ = 256 + ((Class82_Sub22) this).anInt6902 * 499702272;
				i_14_ = 256 + ((Class82_Sub22) this).anInt6907 * 869603840;
				i_15_ = ((Class82_Sub22) this).anInt6910 * -356438957;
			} else {
				Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[((Class82_Sub22) this).anInt6905 * -153670819].method1015(1024446891);
				Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
				i_13_ = (int) class217.aFloat2451;
				i_14_ = (int) class217.aFloat2454;
				i_15_ = class365_sub1_sub1_sub2.plane;
			}
			int i_16_;
			int i_17_;
			if (916056717 * ((Class82_Sub22) this).anInt6907 >= 0) {
				i_16_ = ((Class82_Sub22) this).anInt6913 * -679925248 + 256;
				i_17_ = 1149122048 * ((Class82_Sub22) this).anInt6911 + 256;
			} else {
				Entity class365_sub1_sub1_sub2 = Class87.aClass94Array794[((Class82_Sub22) this).anInt6909 * -1629854861].method1015(1821624579);
				Class217 class217 = class365_sub1_sub1_sub2.method4337().aClass217_2599;
				i_16_ = (int) class217.aFloat2451;
				i_17_ = (int) class217.aFloat2454;
				if (i_15_ < 0)
					i_15_ = class365_sub1_sub1_sub2.plane;
			}
			int i_18_ = ((Class82_Sub22) this).anInt6914 * 1745275777 << 2;
			Class365_Sub1_Sub1_Sub1 class365_sub1_sub1_sub1 = (new Class365_Sub1_Sub1_Sub1(client.aClass283_8716.method2675(-1611682495), ((Class82_Sub22) this).anInt6908 * 1632084697, i_15_, i_15_, i_13_, i_14_, ((Class82_Sub22) this).anInt6916 * 266943569 << 2, client.anInt8884 * 443738891, (929559909 * ((Class82_Sub22) this).anInt6904 + client.anInt8884 * 443738891), -1300008271 * ((Class82_Sub22) this).anInt6915, i_18_, ((Class82_Sub22) this).anInt6905 * -153670819 + 1, 1 + -1629854861
					* ((Class82_Sub22) this).anInt6909, ((Class82_Sub22) this).anInt6912 * 172590773 << 2, false, 0));
			class365_sub1_sub1_sub1.method4405(i_16_, i_17_, 172590773 * ((Class82_Sub22) this).anInt6912 << 2, (client.anInt8884 * 443738891 + 929559909 * ((Class82_Sub22) this).anInt6904), 1057769456);
			client.aClass453_8824.method5935(new Class298_Sub37_Sub2(class365_sub1_sub1_sub1), -428713736);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yu.f(").append(')').toString());
		}
	}

	static final void method940(int[] is, int i, int i_19_, int i_20_, int i_21_) {
		try {
			i--;
			int i_22_ = --i_19_ - 7;
			while (i < i_22_) {
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
				is[++i] = i_20_;
			}
			while (i <= i_19_)
				is[++i] = i_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yu.b(").append(')').toString());
		}
	}
}
