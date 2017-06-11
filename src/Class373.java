/* Class373 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

public class Class373 {
	int anInt4053;
	public int anInt4054;
	public int anInt4055;
	public int anInt4056 = 0;
	public int anInt4057 = -473139963;
	static int anInt4058 = 1190717;
	public int anInt4059;
	public int anInt4060;
	public boolean aBoolean4061;
	public boolean aBoolean4062 = true;
	public boolean aBoolean4063;
	public int anInt4064;
	Class375 aClass375_4065;
	public int anInt4066;
	public int anInt4067;
	public int anInt4068;
	public int anInt4069;
	public static Class57 aClass57_4070;
	public static GraphicsToolkit aClass_ra4071;
	public static Class242_Sub1[] aClass242_Sub1Array4072;

	Class373() {
		anInt4059 = 1749423345;
		anInt4060 = 99235328;
		aBoolean4061 = true;
		anInt4055 = 1206519288;
		aBoolean4063 = false;
		anInt4064 = -1425774653;
		anInt4066 = -120073920;
		anInt4054 = -345860175;
		anInt4067 = 1567851881;
		anInt4068 = 0;
		anInt4069 = 526820032;
	}

	void method4603(byte i) {
		try {
			anInt4055 = (2109091647 * anInt4055 << 8 | -692668059 * ((Class373) this).anInt4053) * 150814911;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.b(").append(')').toString());
		}
	}

	void method4604(RsByteBuffer class298_sub53, int i, short i_0_) {
		try {
			if (i == 1)
				anInt4056 = Class112.method1240(class298_sub53.read24BitUnsignedInteger((byte) 45), (byte) 66) * -1294090885;
			else if (i == 2)
				anInt4057 = class298_sub53.readUnsignedByte() * 473139963;
			else if (3 == i) {
				anInt4057 = class298_sub53.readUnsignedShort() * 473139963;
				if (324071475 * anInt4057 == 65535)
					anInt4057 = -473139963;
			} else if (5 == i)
				aBoolean4062 = false;
			else if (i == 7)
				anInt4059 = Class112.method1240(class298_sub53.read24BitUnsignedInteger((byte) -44), (byte) 71) * -1749423345;
			else if (i == 8)
				((Class373) this).aClass375_4065.anInt4080 = 1023752851 * ((Class373) this).anInt4053;
			else if (i == 9)
				anInt4060 = (class298_sub53.readUnsignedShort() << 2) * 1803744539;
			else if (10 == i)
				aBoolean4061 = false;
			else if (11 == i)
				anInt4055 = class298_sub53.readUnsignedByte() * 150814911;
			else if (i == 12)
				aBoolean4063 = true;
			else if (13 == i)
				anInt4064 = class298_sub53.read24BitUnsignedInteger((byte) -32) * -442102017;
			else if (i == 14)
				anInt4066 = ((class298_sub53.readUnsignedByte() << 2) * -1612488891);
			else if (16 == i)
				anInt4054 = class298_sub53.readUnsignedByte() * 1767159631;
			else if (i == 20)
				anInt4067 = class298_sub53.readUnsignedShort() * 1320194135;
			else if (21 == i)
				anInt4068 = class298_sub53.readUnsignedByte() * 346396917;
			else if (22 == i)
				anInt4069 = class298_sub53.readUnsignedShort() * 75340427;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.f(").append(')').toString());
		}
	}

	void method4605(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_1_ = class298_sub53.readUnsignedByte();
				if (i_1_ == 0) {
					if (i <= -64748789) {
						/* empty */
					}
					break;
				}
				method4604(class298_sub53, i_1_, (short) 8128);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.a(").append(')').toString());
		}
	}

	static final void method4606(IComponentDefinition class105, Class119 class119, ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			class105.anInt1214 = ((((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]) * -1733811909);
			class105.anInt1124 = (210030285 * (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 1]));
			class105.anInt1191 = ((((ClientScript2) class403).anIntArray5244[2 + 681479919 * ((ClientScript2) class403).anInt5239]) * 1629063197);
			Tradution.method6054(class105, -260828169);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.ep(").append(')').toString());
		}
	}

	static final void method4607(ClientScript2 class403, byte i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (2 == client.anInt8942 * 1131012101 && i_2_ < -1054937867 * client.anInt8941)
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = client.anIntArray8705[i_2_];
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.vw(").append(')').toString());
		}
	}

	static final void method4608(ClientScript2 class403, int i) {
		try {
			int i_3_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_3_, -1477365564);
			int i_4_ = -1;
			if (class102 != null)
				i_4_ = class102.anInt1086 * -876503999;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_4_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.acx(").append(')').toString());
		}
	}

	static final void method4609(ClientScript2 class403, int i) {
		try {
			boolean bool = false;
			String string = "";
			if (((ClientScript2) class403).aClass214_5256 != null && ((ClientScript2) class403).aClass214_5256.method1985(592860146)) {
				File file = ((ClientScript2) class403).aClass214_5256.method1986((short) -10504);
				if (null != file) {
					string = file.getPath();
					if (string == null)
						string = "";
				}
				bool = true;
				((ClientScript2) class403).aClass214_5256 = null;
			}
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
			((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393 - 1)] = string;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.agm(").append(')').toString());
		}
	}

	static final void method4610(int i) {
		try {
			Class504.aClass375_6196.method4646((byte) 89);
			Class151.aClass451_6358.method5931(1757095308);
			Class212.aClass144_2433.method1581(682089220);
			client.aClass283_8716.method2641(134727545).method5795(1599239758);
			Class15.aClass507_224.method6274(343664164);
			Class298_Sub32_Sub14.aClass477_9400.method6093(75457779);
			Class501.aClass395_6122.method4902(-927634718);
			Class158_Sub1.aClass389_8568.method4856(1855785885);
			Class472.aClass314_5965.method3824(2005498704);
			Class440.aClass205_5582.method1917((byte) 80);
			Class422_Sub7.aClass445_8384.method5891(1240218712);
			Class82_Sub16.aClass427_6886.method5747(2116049963);
			Class99.aClass517_951.method6306((byte) 119);
			Class299.aClass370_3199.method4575(242474592);
			Class94.aClass349_913.method4201((byte) -124);
			Class120.aClass487_1463.method6162((byte) 81);
			Class363.aClass339_3931.method4120(758365461);
			Class92.aClass504_905.method6248(2090718480);
			ConfigDefinitions.aClass317_3472.method3848(-1350735214);
			Class138_Sub1.aClass131_7010.method1468(382411498);
			Class237.aClass499_6668.method6213(122236875);
			Class_na.aClass491_9686.method6173((short) -15590);
			Class500.aClass347_6117.method4179(-1069278127);
			Class114.method1257(-1852134831);
			Class282.method2622(26517601);
			Class497.aClass197_6105.method1884(-1647804880);
			Class502.method6234(-962878443);
			Class132.method1480((byte) -41);
			client.aClass348_8780.method4189();
			client.aClass348_8898.method4189();
			client.aClass348_8697.method4189();
			Class436.aClass348_5500.method4189();
			Class388.aClass348_4153.method4189();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.gb(").append(')').toString());
		}
	}

	static final void method4611(ClientScript2 class403, int i) {
		try {
			int i_5_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			int i_6_ = client.aClass251Array8920[i_5_].method2400(-574288948);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1 == i_6_ ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pn.yz(").append(')').toString());
		}
	}
}
