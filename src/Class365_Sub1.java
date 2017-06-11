/* Class365_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class365_Sub1 extends Class365 {
	Class365_Sub1 aClass365_Sub1_7721;
	public Class331 aClass331_7722;
	public byte plane;
	public byte aByte7724;
	int anInt7725;
	public Class302_Sub1[] aClass302_Sub1Array7726;

	abstract boolean method4349();

	abstract boolean method4350(GraphicsToolkit class_ra, int i, int i_0_, byte i_1_);

	abstract boolean method4351();

	abstract boolean method4352(GraphicsToolkit class_ra, int i, int i_2_);

	abstract boolean method4353();

	abstract int method4354(Class298_Sub10[] class298_sub10s, int i);

	abstract void method4355(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1_3_, int i, int i_4_, int i_5_, boolean bool, int i_6_);

	int method4356(byte i) {
		try {
			return 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adp.dh(").append(')').toString());
		}
	}

	abstract void method4357(GraphicsToolkit class_ra, int i);

	public abstract Class334 method4358(GraphicsToolkit class_ra, byte i);

	abstract boolean method4359(GraphicsToolkit class_ra);

	abstract boolean method4360(int i);

	public abstract int method4361(int i);

	void method4362(int i, int i_7_) {
		try {
			aClass302_Sub1Array7726 = new Class302_Sub1[i];
			for (int i_8_ = 0; i_8_ < aClass302_Sub1Array7726.length; i_8_++)
				aClass302_Sub1Array7726[i_8_] = new Class302_Sub1();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adp.dx(").append(')').toString());
		}
	}

	public int method4363(byte i) {
		try {
			return -method4361(1951240662);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adp.bx(").append(')').toString());
		}
	}

	abstract boolean method4364(GraphicsToolkit class_ra, byte i);

	abstract boolean method4365();

	abstract boolean method4366(int i);

	public abstract Class334 method4367(GraphicsToolkit class_ra);

	public abstract Class334 method4368(GraphicsToolkit class_ra);

	abstract boolean method4369();

	abstract Class335 method4370(GraphicsToolkit class_ra);

	abstract void method4371(GraphicsToolkit class_ra);

	abstract boolean method4372(GraphicsToolkit class_ra, int i, int i_9_);

	abstract void method4373(GraphicsToolkit class_ra);

	abstract boolean method4374();

	abstract void method4375(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1_10_, int i, int i_11_, int i_12_, boolean bool);

	abstract boolean method4376(short i);

	abstract void method4377();

	abstract void method4378();

	public abstract int method4379();

	public abstract int method4380();

	public abstract int method4381();

	abstract boolean method4382();

	abstract boolean method4383();

	Class365_Sub1(Class331 class331) {
		aClass331_7722 = class331;
	}

	abstract boolean method4384();

	abstract boolean method4385(GraphicsToolkit class_ra, int i, int i_13_);

	abstract boolean method4386();

	abstract boolean method4387();

	abstract void method4388(GraphicsToolkit class_ra, Class365_Sub1 class365_sub1_14_, int i, int i_15_, int i_16_, boolean bool);

	abstract boolean method4389(GraphicsToolkit class_ra);

	abstract int method4390(Class298_Sub10[] class298_sub10s);

	abstract boolean method4391(GraphicsToolkit class_ra);

	int method4392(int i, int i_17_, Class298_Sub10[] class298_sub10s, int i_18_) {
		try {
			long l = (((Class331) aClass331_7722).aLongArrayArrayArray3554[plane][i][i_17_]);
			long l_19_ = 0L;
			int i_20_ = 0;
			for (/**/; l_19_ <= 48L; l_19_ += 16L) {
				int i_21_ = (int) (l >> (int) l_19_ & 0xffffL);
				if (i_21_ <= 0)
					break;
				class298_sub10s[i_20_++] = (((Class331) aClass331_7722).aClass321Array3558[i_21_ - 1].aClass298_Sub10_3337);
			}
			for (int i_22_ = i_20_; i_22_ < 4; i_22_++)
				class298_sub10s[i_22_] = null;
			return i_20_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adp.ds(").append(')').toString());
		}
	}

	abstract boolean method4393(GraphicsToolkit class_ra);

	abstract Class335 method4394(GraphicsToolkit class_ra, int i);

	abstract boolean method4395();

	abstract boolean method4396();

	abstract boolean method4397();

	abstract void method4398(byte i);

	abstract boolean method4399(byte i);

	abstract boolean method4400();

	static final void method4401(IComponentDefinition class105, Class119 class119, ClientScript2 class403, byte i) {
		try {
			int i_23_ = ((((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) - 1);
			if (i_23_ < 0 || i_23_ > 9)
				((ClientScript2) class403).anInt5241 -= 969361751;
			else
				class105.method1115(i_23_, (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]), 1110385787);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adp.is(").append(')').toString());
		}
	}

	static final void method4402(ClientScript2 class403, byte i) {
		try {
			int i_24_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_24_, (byte) -7);
			Class119 class119 = Class389.aClass119Array4165[i_24_ >> 16];
			Class244.method2323(class105, class119, class403, 1982682635);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adp.fx(").append(')').toString());
		}
	}

	static void method4403(byte i) {
		try {
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub21_7580.method5703((byte) -114) == 1)
				Class62.aClass248_612.method2385(new Class267(Class266.aClass266_2852, null), -1108671657);
			else {
				client.aClass283_8716.method2667(1601177628);
				InputStream_Sub1.method273(-119452364);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adp.v(").append(')').toString());
		}
	}
}
