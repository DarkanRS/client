/* Class385 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class385 {
	Class217 aClass217_4129;
	float aFloat4130;
	float aFloat4131;
	float aFloat4132;
	int anInt4133;
	int anInt4134;
	int anInt4135;
	Class66 aClass66_4136;
	float aFloat4137;
	float aFloat4138;
	float aFloat4139;
	Class277 aClass277_4140;
	public static client aClient4141;
	static Class89 aClass89_4142;

	public Class385(RsByteBuffer class298_sub53, Class364 class364) {
		method4706(class298_sub53, class364, (short) 9475);
	}

	void method4704(Class385 class385_0_, byte i) {
		try {
			((Class385) this).anInt4133 = ((Class385) class385_0_).anInt4133 * 1;
			((Class385) this).aFloat4130 = ((Class385) class385_0_).aFloat4130;
			((Class385) this).aFloat4131 = ((Class385) class385_0_).aFloat4131;
			((Class385) this).aFloat4137 = ((Class385) class385_0_).aFloat4137;
			((Class385) this).aClass217_4129.method2013(((Class385) class385_0_).aClass217_4129);
			((Class385) this).anInt4134 = ((Class385) class385_0_).anInt4134 * 1;
			((Class385) this).anInt4135 = 1 * ((Class385) class385_0_).anInt4135;
			((Class385) this).aClass66_4136 = ((Class385) class385_0_).aClass66_4136;
			((Class385) this).aFloat4139 = ((Class385) class385_0_).aFloat4139;
			((Class385) this).aFloat4138 = ((Class385) class385_0_).aFloat4138;
			((Class385) this).aFloat4132 = ((Class385) class385_0_).aFloat4132;
			((Class385) this).aClass277_4140 = ((Class385) class385_0_).aClass277_4140;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.f(").append(')').toString());
		}
	}

	void method4705(GraphicsToolkit class_ra, Class385 class385_1_, Class385 class385_2_, float f, int i) {
		try {
			((Class385) this).anInt4133 = Class350.method4215((-1951302757 * ((Class385) class385_1_).anInt4133), (((Class385) class385_2_).anInt4133 * -1951302757), f * 255.0F, -394247366) * 743535251;
			((Class385) this).aFloat4131 = (f * (((Class385) class385_2_).aFloat4131 - ((Class385) class385_1_).aFloat4131) + ((Class385) class385_1_).aFloat4131);
			((Class385) this).aFloat4137 = ((((Class385) class385_2_).aFloat4137 - ((Class385) class385_1_).aFloat4137) * f + ((Class385) class385_1_).aFloat4137);
			((Class385) this).aFloat4130 = (f * (((Class385) class385_2_).aFloat4130 - ((Class385) class385_1_).aFloat4130) + ((Class385) class385_1_).aFloat4130);
			((Class385) this).aFloat4132 = ((((Class385) class385_2_).aFloat4132 - ((Class385) class385_1_).aFloat4132) * f + ((Class385) class385_1_).aFloat4132);
			((Class385) this).aFloat4139 = (((Class385) class385_1_).aFloat4139 + f * (((Class385) class385_2_).aFloat4139 - ((Class385) class385_1_).aFloat4139));
			((Class385) this).aFloat4138 = (((Class385) class385_1_).aFloat4138 + f * (((Class385) class385_2_).aFloat4138 - ((Class385) class385_1_).aFloat4138));
			((Class385) this).anInt4134 = Class350.method4215((((Class385) class385_1_).anInt4134 * -1269717659), (-1269717659 * ((Class385) class385_2_).anInt4134), f * 255.0F, 561967704) * -316996499;
			((Class385) this).anInt4135 = (1820271565 * (int) ((float) (((Class385) class385_1_).anInt4135 * -1939701499) + f * (float) ((((Class385) class385_2_).anInt4135 * -1939701499) - (((Class385) class385_1_).anInt4135) * -1939701499)));
			if (((Class385) class385_1_).aClass66_4136 != ((Class385) class385_2_).aClass66_4136)
				((Class385) this).aClass66_4136 = class_ra.method5179((((Class385) class385_1_).aClass66_4136), (((Class385) class385_2_).aClass66_4136), f, ((Class385) this).aClass66_4136);
			if (((Class385) class385_2_).aClass277_4140 != ((Class385) class385_1_).aClass277_4140) {
				if (null == ((Class385) class385_1_).aClass277_4140) {
					((Class385) this).aClass277_4140 = ((Class385) class385_2_).aClass277_4140;
					if (((Class385) this).aClass277_4140 != null)
						((Class385) this).aClass277_4140.method2583((int) (f * 255.0F), 0, -909735354);
				} else {
					((Class385) this).aClass277_4140 = ((Class385) class385_1_).aClass277_4140;
					if (((Class385) this).aClass277_4140 != null)
						((Class385) this).aClass277_4140.method2583((int) (f * 255.0F), 255, 398258366);
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.b(").append(')').toString());
		}
	}

	public void method4706(RsByteBuffer class298_sub53, Class364 class364, short i) {
		try {
			int i_3_ = class298_sub53.readUnsignedByte();
			if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub15_7560.method5684(-1934130167) == 1 && Class373.aClass_ra4071.method5048() > 0) {
				if (0 != (i_3_ & 0x1))
					((Class385) this).anInt4133 = class298_sub53.readInt((byte) 33) * 743535251;
				else
					((Class385) this).anInt4133 = -980012211 * Class364.anInt3952;
				if ((i_3_ & 0x2) != 0)
					((Class385) this).aFloat4130 = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Class385) this).aFloat4130 = 1.1523438F;
				if (0 != (i_3_ & 0x4))
					((Class385) this).aFloat4131 = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Class385) this).aFloat4131 = 0.69921875F;
				if (0 != (i_3_ & 0x8))
					((Class385) this).aFloat4137 = ((float) class298_sub53.readUnsignedShort() / 256.0F);
				else
					((Class385) this).aFloat4137 = 1.2F;
			} else {
				if ((i_3_ & 0x1) != 0)
					class298_sub53.readInt((byte) 50);
				if ((i_3_ & 0x2) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x4) != 0)
					class298_sub53.readUnsignedShort();
				if ((i_3_ & 0x8) != 0)
					class298_sub53.readUnsignedShort();
				((Class385) this).anInt4133 = Class364.anInt3952 * -980012211;
				((Class385) this).aFloat4137 = 1.2F;
				((Class385) this).aFloat4131 = 0.69921875F;
				((Class385) this).aFloat4130 = 1.1523438F;
			}
			if ((i_3_ & 0x10) != 0)
				((Class385) this).aClass217_4129 = Class217.method2004((float) class298_sub53.readShort(2126608204), (float) class298_sub53.readShort(1708860776), (float) class298_sub53.readShort(1771057202));
			else
				((Class385) this).aClass217_4129 = Class217.method2004(-50.0F, -60.0F, -50.0F);
			if ((i_3_ & 0x20) != 0)
				((Class385) this).anInt4134 = class298_sub53.readInt((byte) 9) * -316996499;
			else
				((Class385) this).anInt4134 = Class364.anInt3933 * 1359380751;
			if (0 != (i_3_ & 0x40))
				((Class385) this).anInt4135 = class298_sub53.readUnsignedShort() * 1820271565;
			else
				((Class385) this).anInt4135 = 0;
			if (0 != (i_3_ & 0x80)) {
				int i_4_ = class298_sub53.readUnsignedShort();
				int i_5_ = class298_sub53.readUnsignedShort();
				int i_6_ = class298_sub53.readUnsignedShort();
				int i_7_ = class298_sub53.readUnsignedShort();
				int i_8_ = class298_sub53.readUnsignedShort();
				int i_9_ = class298_sub53.readUnsignedShort();
				((Class385) this).aClass66_4136 = class364.method4329(i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, 257018874);
			} else
				((Class385) this).aClass66_4136 = Class82_Sub12.aClass66_6864;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.p(").append(')').toString());
		}
	}

	public void method4707(RsByteBuffer class298_sub53, int i) {
		try {
			((Class385) this).aFloat4139 = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			((Class385) this).aFloat4138 = (float) (class298_sub53.readUnsignedByte() * 8) / 255.0F;
			((Class385) this).aFloat4132 = ((float) (class298_sub53.readUnsignedByte() * 8) / 255.0F);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.i(").append(')').toString());
		}
	}

	public Class385() {
		method4711((byte) 115);
	}

	boolean method4708(Class385 class385_10_, int i) {
		try {
			return ((-1951302757 * ((Class385) class385_10_).anInt4133 == ((Class385) this).anInt4133 * -1951302757) && (((Class385) this).aFloat4130 == ((Class385) class385_10_).aFloat4130) && (((Class385) class385_10_).aFloat4131 == ((Class385) this).aFloat4131) && (((Class385) class385_10_).aFloat4137 == ((Class385) this).aFloat4137) && (((Class385) class385_10_).aFloat4138 == ((Class385) this).aFloat4138) && (((Class385) this).aFloat4139 == ((Class385) class385_10_).aFloat4139)
					&& (((Class385) class385_10_).aFloat4132 == ((Class385) this).aFloat4132) && (-1269717659 * ((Class385) this).anInt4134 == ((Class385) class385_10_).anInt4134 * -1269717659) && (((Class385) class385_10_).anInt4135 * -1939701499 == ((Class385) this).anInt4135 * -1939701499) && (((Class385) class385_10_).aClass66_4136 == ((Class385) this).aClass66_4136) && (((Class385) class385_10_).aClass277_4140 == ((Class385) this).aClass277_4140));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.d(").append(')').toString());
		}
	}

	public int method4709(int i) {
		try {
			return -1269717659 * ((Class385) this).anInt4134;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.u(").append(')').toString());
		}
	}

	public Class277 method4710(byte i) {
		try {
			return ((Class385) this).aClass277_4140;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.x(").append(')').toString());
		}
	}

	void method4711(byte i) {
		try {
			((Class385) this).anInt4133 = Class364.anInt3952 * -980012211;
			((Class385) this).aClass217_4129 = Class217.method2004(-50.0F, -60.0F, -50.0F);
			((Class385) this).aFloat4130 = 1.1523438F;
			((Class385) this).aFloat4131 = 0.69921875F;
			((Class385) this).aFloat4137 = 1.2F;
			((Class385) this).anInt4134 = Class364.anInt3933 * 1359380751;
			((Class385) this).anInt4135 = 0;
			((Class385) this).aClass66_4136 = Class82_Sub12.aClass66_6864;
			((Class385) this).aFloat4139 = 1.0F;
			((Class385) this).aFloat4138 = 0.25F;
			((Class385) this).aFloat4132 = 1.0F;
			((Class385) this).aClass277_4140 = Class254.aClass277_2789;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.a(").append(')').toString());
		}
	}

	public void method4712(RsByteBuffer class298_sub53, Class364 class364, byte i) {
		try {
			int i_11_ = class298_sub53.readUnsignedShort();
			int i_12_ = class298_sub53.readShort(2107553233);
			int i_13_ = class298_sub53.readShort(1662518170);
			int i_14_ = class298_sub53.readShort(2045049677);
			int i_15_ = class298_sub53.readUnsignedShort();
			ClanMember.anInt1685 = 1827318333 * i_15_;
			((Class385) this).aClass277_4140 = class364.method4328(i_11_, i_12_, i_13_, i_14_, (short) -3311);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.k(").append(')').toString());
		}
	}

	static final void method4713(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = client.aByte8959;
			if (client.aByte8959 != -1)
				client.aByte8959 = (byte) -6;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.abk(").append(')').toString());
		}
	}

	public static void method4714(int i) {
		try {
			if (IcmpService_Sub1.anIcmpService_Sub1_8551 != null) {
				try {
					IcmpService_Sub1.anIcmpService_Sub1_8551.quit();
				} catch (Throwable throwable) {
					/* empty */
				}
				IcmpService_Sub1.anIcmpService_Sub1_8551 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.d(").append(')').toString());
		}
	}

	static final void method4715(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5241 -= 969361751;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.aj(").append(')').toString());
		}
	}

	public static Class343_Sub1 method4716(byte i) {
		try {
			Class474.anInt5977 = 0;
			return Class365_Sub1_Sub5_Sub2.method4537(-1079868050);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pz.i(").append(')').toString());
		}
	}
}
