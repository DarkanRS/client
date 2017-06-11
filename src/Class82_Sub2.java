/* Class82_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub2 extends Class82 {
	int anInt6817;
	int anInt6818;
	int anInt6819;
	int anInt6820;
	int anInt6821;
	static int anInt6822;

	public void method869() {
		Class97_Sub1.method1043(930341525 * ((Class82_Sub2) this).anInt6817, ((Class82_Sub2) this).anInt6819 * -913226385, 1149350097 * ((Class82_Sub2) this).anInt6818, 100, 100, false);
		Class344.method4165(((Class82_Sub2) this).anInt6820 * -58553315, 300585813 * ((Class82_Sub2) this).anInt6821, 0, -1841339577);
		client.aBoolean8725 = true;
	}

	Class82_Sub2(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub2) this).anInt6817 = class298_sub53.readUnsignedShort() * -1170941763;
		((Class82_Sub2) this).anInt6818 = class298_sub53.readUnsignedShort() * -1109088207;
		((Class82_Sub2) this).anInt6819 = class298_sub53.readUnsignedShort() * -1180452465;
		((Class82_Sub2) this).anInt6820 = class298_sub53.readUnsignedShort() * 1885378101;
		((Class82_Sub2) this).anInt6821 = class298_sub53.readUnsignedShort() * -1386950147;
	}

	public void method868() {
		Class97_Sub1.method1043(930341525 * ((Class82_Sub2) this).anInt6817, ((Class82_Sub2) this).anInt6819 * -913226385, 1149350097 * ((Class82_Sub2) this).anInt6818, 100, 100, false);
		Class344.method4165(((Class82_Sub2) this).anInt6820 * -58553315, 300585813 * ((Class82_Sub2) this).anInt6821, 0, -1539652998);
		client.aBoolean8725 = true;
	}

	public void method866(int i) {
		try {
			Class97_Sub1.method1043(930341525 * ((Class82_Sub2) this).anInt6817, ((Class82_Sub2) this).anInt6819 * -913226385, 1149350097 * ((Class82_Sub2) this).anInt6818, 100, 100, false);
			Class344.method4165(((Class82_Sub2) this).anInt6820 * -58553315, 300585813 * ((Class82_Sub2) this).anInt6821, 0, -1646774896);
			client.aBoolean8725 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xc.f(").append(')').toString());
		}
	}

	public static int method878(int i, int i_0_, boolean bool, int i_1_) {
		try {
			Class298_Sub9 class298_sub9 = Class255.method2437(i, bool, -147362451);
			if (null == class298_sub9)
				return 0;
			if (i_0_ < 0 || i_0_ >= (((Class298_Sub9) class298_sub9).anIntArray7227).length)
				return 0;
			return ((Class298_Sub9) class298_sub9).anIntArray7227[i_0_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xc.f(").append(')').toString());
		}
	}
}
