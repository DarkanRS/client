/* Class206 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class SubIncommingPacket {
	public static SubIncommingPacket aClass206_2342;
	public static SubIncommingPacket aClass206_2343;
	public static SubIncommingPacket REMOVE_GROUND_ITEM_PACKET;
	public static SubIncommingPacket DESTROY_OBJECT_PACKET;
	public static SubIncommingPacket aClass206_2346;
	public static SubIncommingPacket aClass206_2347 = new SubIncommingPacket(6);
	public static SubIncommingPacket aClass206_2348;
	static Class57[] aClass57Array2349;
	public static SubIncommingPacket SPAWN_OBJECT_PACKET;
	public static SubIncommingPacket SEND_GROUND_ITEM_PACKET;
	public static SubIncommingPacket TILE_MESSAGE_PACKET;
	public static SubIncommingPacket aClass206_2353;
	public static SubIncommingPacket aClass206_2354;
	public static SubIncommingPacket PROJECTILE_PACKET;
	public static SubIncommingPacket aClass206_2356;
	public static SubIncommingPacket aClass206_2357;

	SubIncommingPacket(int i) {
		/* empty */
	}

	static {
		aClass206_2343 = new SubIncommingPacket(7);
		REMOVE_GROUND_ITEM_PACKET = new SubIncommingPacket(3);
		DESTROY_OBJECT_PACKET = new SubIncommingPacket(2);
		aClass206_2346 = new SubIncommingPacket(19);
		TILE_MESSAGE_PACKET = new SubIncommingPacket(-1);
		PROJECTILE_PACKET = new SubIncommingPacket(16);
		aClass206_2356 = new SubIncommingPacket(8);
		SPAWN_OBJECT_PACKET = new SubIncommingPacket(6);
		SEND_GROUND_ITEM_PACKET = new SubIncommingPacket(5);
		aClass206_2357 = new SubIncommingPacket(7);
		aClass206_2353 = new SubIncommingPacket(8);
		aClass206_2354 = new SubIncommingPacket(-1);
		aClass206_2342 = new SubIncommingPacket(9);
		aClass206_2348 = new SubIncommingPacket(5);
	}

	static void method1919(int i) {
		try {
			Class476 class476 = null;
			try {
				class476 = Class86.method962("2", client.aClass411_8944.aString5317, false, -1804643872);
				byte[] is = new byte[(int) class476.method6080(-1608358371)];
				int i_0_;
				for (int i_1_ = 0; i_1_ < is.length; i_1_ += i_0_) {
					i_0_ = class476.method6081(is, i_1_, is.length - i_1_, (short) 1638);
					if (i_0_ == -1)
						throw new IOException();
				}
				Class482.method6116(new RsByteBuffer(is), (byte) 3);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (null != class476)
					class476.method6079(1765313968);
			} catch (Exception exception) {
				/* empty */
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ir.r(").append(')').toString());
		}
	}

	static Class337[] method1920(int i) {
		try {
			return (new Class337[] { Class337.aClass337_3624, Class337.aClass337_3625, Class337.aClass337_3627 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ir.a(").append(')').toString());
		}
	}

	static final void method1921(byte i) {
		try {
			Class365_Sub1_Sub1_Sub6.method4494(Class373.aClass_ra4071, 556951212);
			if (1855729883 * Class99.anInt952 != 191260743 * client.anInt8792)
				Class475.method6075((short) -2730);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ir.ga(").append(')').toString());
		}
	}

	static Class98_Sub4 method1922(RsByteBuffer class298_sub53, int i) {
		try {
			return new Class98_Sub4(class298_sub53.readShort(1929673502), class298_sub53.readShort(1591525604), class298_sub53.readShort(1980414267), class298_sub53.readShort(1697989112), class298_sub53.readShort(1558777727), class298_sub53.readShort(1996690559), class298_sub53.readShort(1912436552), class298_sub53.readShort(1880856141), class298_sub53.read24BitUnsignedInteger((byte) -28), class298_sub53.readUnsignedByte());
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ir.r(").append(')').toString());
		}
	}

	static final void method1923(int i) {
		try {
			if (Class299.method3682(-1233866115 * client.anInt8752, 1765230881) || Class413.method5584(-1233866115 * client.anInt8752, 1927636725))
				Class216.method2001(false, (byte) 23);
			else {
				Class422_Sub21.aClass318_8414 = client.gameConnection.method387(537308016);
				client.gameConnection.method385(865497912);
				Class439.method5851(5, 2010723010);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ir.gk(").append(')').toString());
		}
	}

	static void method1924(int interfaceHash, int i_2_, int value, int i_4_, int i_5_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(4, (long) interfaceHash);
			class298_sub37_sub12.method3449((byte) 123);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = 1274450087 * i_2_;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9608 = value * 293101103;
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9609 = i_4_ * -80288087;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ir.al(").append(')').toString());
		}
	}

	static void method1925(Class502 class502, int i, int i_6_, ClientScript2 class403, int i_7_) {
		try {
			ClientScript class298_sub37_sub17 = Class86.method963(class502, i, i_6_, -1499442878);
			if (null == class298_sub37_sub17)
				Class50.method531((byte) 83);
			else {
				((ClientScript2) class403).anIntArray5248 = new int[class298_sub37_sub17.anInt9679 * -1516159487];
				((ClientScript2) class403).anObjectArray5234 = new Object[1787035509 * class298_sub37_sub17.anInt9680];
				if ((class298_sub37_sub17.aClass502_9678 == Class502.aClass502_6727) || (Class502.aClass502_6721 == class298_sub37_sub17.aClass502_9678) || (Class502.aClass502_6718 == class298_sub37_sub17.aClass502_9678)) {
					int i_8_ = 0;
					int i_9_ = 0;
					if (Class113.aClass105_1373 != null) {
						i_8_ = 1354508417 * Class113.aClass105_1373.anInt1143;
						i_9_ = Class113.aClass105_1373.anInt1155 * -749038817;
					}
					((ClientScript2) class403).anIntArray5248[0] = (Class165.recorder.getMouseX((byte) -93) - i_8_);
					((ClientScript2) class403).anIntArray5248[1] = (Class165.recorder.getMouseY((byte) -71) - i_9_);
				} else if (class298_sub37_sub17.aClass502_9678 == Class502.aClass502_6716)
					((ClientScript2) class403).anIntArray5248[0] = 1782404151 * ((ClientScript2) class403).anInt5255;
				ClientScriptsExecutor.method4690(class298_sub37_sub17, 200000, class403, -598583477);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ir.q(").append(')').toString());
		}
	}

	public static boolean method1926(int i) {
		try {
			return null != Class506.anInterface27_6203;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ir.b(").append(')').toString());
		}
	}
}
