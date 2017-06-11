/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class75 {
	int[] anIntArray701;
	int[] anIntArray702;
	int[] anIntArray703;
	int[] anIntArray704;
	int[] anIntArray705;
	int[] anIntArray706;
	int[] anIntArray707;
	public static int anInt708;

	void method833(int i, int i_0_) {
		try {
			int[][] is = new int[((Class75) this).anIntArray705.length << 1][4];
			for (int i_1_ = 0; i_1_ < ((Class75) this).anIntArray705.length; i_1_++) {
				is[i_1_ * 2][0] = ((Class75) this).anIntArray705[i_1_];
				is[2 * i_1_][1] = ((Class75) this).anIntArray702[i_1_];
				is[2 * i_1_][2] = ((Class75) this).anIntArray703[i_1_];
				is[2 * i_1_][3] = ((Class75) this).anIntArray707[i_1_];
				is[1 + 2 * i_1_][0] = ((Class75) this).anIntArray704[i_1_];
				is[1 + i_1_ * 2][1] = ((Class75) this).anIntArray701[i_1_];
				is[1 + 2 * i_1_][2] = ((Class75) this).anIntArray706[i_1_];
				is[2 * i_1_ + 1][3] = ((Class75) this).anIntArray707[i_1_];
			}
			client.anIntArrayArrayArray8767[i] = is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("da.a(").append(')').toString());
		}
	}

	Class75(RsByteBuffer class298_sub53) {
		int i = class298_sub53.readUnsignedSmart(1723054621);
		((Class75) this).anIntArray705 = new int[i];
		((Class75) this).anIntArray702 = new int[i];
		((Class75) this).anIntArray703 = new int[i];
		((Class75) this).anIntArray707 = new int[i];
		((Class75) this).anIntArray704 = new int[i];
		((Class75) this).anIntArray701 = new int[i];
		((Class75) this).anIntArray706 = new int[i];
		for (int i_2_ = 0; i_2_ < i; i_2_++) {
			((Class75) this).anIntArray705[i_2_] = class298_sub53.readUnsignedShort() - 5120;
			((Class75) this).anIntArray703[i_2_] = class298_sub53.readUnsignedShort() - 5120;
			((Class75) this).anIntArray702[i_2_] = class298_sub53.readShort(1563719109);
			((Class75) this).anIntArray704[i_2_] = class298_sub53.readUnsignedShort() - 5120;
			((Class75) this).anIntArray706[i_2_] = class298_sub53.readUnsignedShort() - 5120;
			((Class75) this).anIntArray701[i_2_] = class298_sub53.readShort(2133929202);
			((Class75) this).anIntArray707[i_2_] = class298_sub53.readShort(1967809784);
		}
	}

	public static final Class284 method834(Component component, int i, int i_3_, int i_4_) {
		try {
			if (0 == Class284.anInt3059 * 1164070869)
				throw new IllegalStateException();
			if (i < 0 || i >= 2)
				throw new IllegalArgumentException();
			if (i_3_ < 256)
				i_3_ = 256;
			Class284_Sub1 class284_sub1;
			try {
				Class284_Sub1 class284_sub1_5_ = new Class284_Sub1();
				((Class284) class284_sub1_5_).anIntArray3052 = new int[(Class284.aBoolean3047 ? 2 : 1) * 256];
				((Class284) class284_sub1_5_).anInt3071 = i_3_ * -949520941;
				class284_sub1_5_.method2683(component, (byte) 127);
				((Class284) class284_sub1_5_).anInt3046 = 2121848755 * ((i_3_ & ~0x3ff) + 1024);
				if (-1894797445 * ((Class284) class284_sub1_5_).anInt3046 > 16384)
					((Class284) class284_sub1_5_).anInt3046 = 904708096;
				class284_sub1_5_.method2684((((Class284) class284_sub1_5_).anInt3046) * -1894797445, 557897773);
				if (-1869204691 * Class284.anInt3048 > 0 && null == Class284.aClass288_3057) {
					Class284.aClass288_3057 = new Class288_Sub1();
					Thread thread = new Thread(Class284.aClass288_3057);
					thread.setDaemon(true);
					thread.start();
					thread.setPriority(Class284.anInt3048 * -1869204691);
				}
				if (Class284.aClass288_3057 != null) {
					if (null != (((Class288) Class284.aClass288_3057).aClass284Array3104[i]))
						throw new IllegalArgumentException();
					((Class288) Class284.aClass288_3057).aClass284Array3104[i] = class284_sub1_5_;
				}
				class284_sub1 = class284_sub1_5_;
			} catch (Throwable throwable) {
				return new Class284();
			}
			return class284_sub1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("da.f(").append(')').toString());
		}
	}

	static final void method835(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			class105.aString1228 = (String) (((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 -= 969361751) * -203050393)]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("da.js(").append(')').toString());
		}
	}

	static final void method836(ClientScript2 class403, byte i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (Class301_Sub1.aClass437_7637 != null) {
				Linkable class298 = Class301_Sub1.aClass437_7637.get((long) i_6_);
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = class298 != null ? 1 : 0;
			} else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("da.aey(").append(')').toString());
		}
	}

	static void method837(Class298_Sub37_Sub5 class298_sub37_sub5, int i) {
		try {
			boolean bool = false;
			class298_sub37_sub5.method3402(-1845829409);
			for (Class298_Sub37_Sub5 class298_sub37_sub5_7_ = ((Class298_Sub37_Sub5) Class436.aClass461_5482.method5984(-1268764084)); class298_sub37_sub5_7_ != null; class298_sub37_sub5_7_ = ((Class298_Sub37_Sub5) Class436.aClass461_5482.method5985(-1549897657))) {
				if (Class473.method6069(class298_sub37_sub5.method3417(-610126190), class298_sub37_sub5_7_.method3417(-1229609996), -537262415)) {
					Class458.method5973(class298_sub37_sub5, class298_sub37_sub5_7_, -1541675772);
					bool = true;
					break;
				}
			}
			if (!bool)
				Class436.aClass461_5482.method5982(class298_sub37_sub5, (byte) -51);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("da.h(").append(')').toString());
		}
	}

	static final void method838(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class82_Sub19.method925(class105, class119, class403, -535116520);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("da.fv(").append(')').toString());
		}
	}
}
