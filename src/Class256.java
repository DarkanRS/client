/* Class256 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class256 {
	Class243 aClass243_2796;
	Class243 aClass243_2797;
	Class348 aClass348_2798 = new Class348(64);
	static int anInt2799 = 0;
	static int anInt2800 = 32768;
	public static int anInt2801;

	public Class298_Sub37_Sub8 method2441(int i, int i_0_) {
		try {
			Class298_Sub37_Sub8 class298_sub37_sub8 = ((Class298_Sub37_Sub8) ((Class256) this).aClass348_2798.method4184((long) i));
			if (null != class298_sub37_sub8)
				return class298_sub37_sub8;
			byte[] is;
			if (i >= 32768)
				is = ((Class256) this).aClass243_2797.method2315(0, i & 0x7fff, (byte) -102);
			else
				is = ((Class256) this).aClass243_2796.method2315(0, i, (byte) -91);
			class298_sub37_sub8 = new Class298_Sub37_Sub8();
			if (is != null)
				class298_sub37_sub8.method3430(new RsByteBuffer(is), 754160666);
			if (i >= 32768)
				class298_sub37_sub8.method3432(-1787095576);
			((Class256) this).aClass348_2798.method4194(class298_sub37_sub8, (long) i);
			return class298_sub37_sub8;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ks.a(").append(')').toString());
		}
	}

	public Class256(Class429 class429, Class243 class243, Class243 class243_1_) {
		((Class256) this).aClass243_2796 = class243;
		((Class256) this).aClass243_2797 = class243_1_;
		if (((Class256) this).aClass243_2796 != null)
			((Class256) this).aClass243_2796.method2316(0, 1395155699);
		if (((Class256) this).aClass243_2797 != null)
			((Class256) this).aClass243_2797.method2316(0, 393673779);
	}

	static final void method2442(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class393.method4891(class105, class119, class403, (byte) -101);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ks.hf(").append(')').toString());
		}
	}

	static final void method2443(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) 44);
			Class119 class119 = Class389.aClass119Array4165[i_2_ >> 16];
			Class62.method724(class105, class119, class403, (byte) 59);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ks.jv(").append(')').toString());
		}
	}

	static final void method2444(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_3_, (byte) -44);
			Class119 class119 = Class389.aClass119Array4165[i_3_ >> 16];
			Class158.method1699(class105, class119, class403, (byte) -112);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ks.lo(").append(')').toString());
		}
	}

	static final void method2445(ClientScript2 class403, int i) {
		try {
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			((ClientScript2) class403).anInt5239 -= -783761378;
			int i_4_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_5_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			Class505 class505 = Class322.method3931(Class173.aClass243_1758, i_5_, 0, (byte) 57);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = class505.method6262(string, i_4_, Class130_Sub2.aClass57Array6959, 1970071925);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ks.zf(").append(')').toString());
		}
	}

	static int[] method2446(Class298_Sub36 class298_sub36, int i) {
		try {
			RsByteBuffer class298_sub53 = new RsByteBuffer(518);
			int[] is = new int[4];
			for (int i_6_ = 0; i_6_ < 4; i_6_++)
				is[i_6_] = (int) (Math.random() * 9.9999999E7);
			class298_sub53.writeByte(10);
			class298_sub53.writeInt(is[0], 287776861);
			class298_sub53.writeInt(is[1], -691239943);
			class298_sub53.writeInt(is[2], 341776687);
			class298_sub53.writeInt(is[3], -551127202);
			for (int i_7_ = 0; i_7_ < 10; i_7_++)
				class298_sub53.writeInt((int) (Math.random() * 9.9999999E7), -1703203090);
			class298_sub53.writeShort((int) (Math.random() * 9.9999999E7), 16711935);
			class298_sub53.applyRsa(Class50.aBigInteger500, Class50.aBigInteger503, 1970926718);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeBytes(class298_sub53.buffer, 0, 385051775 * class298_sub53.index, (short) -19107);
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ks.s(").append(')').toString());
		}
	}
}
