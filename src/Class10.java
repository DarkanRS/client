/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class10 {
	static int anInt129;
	static int anInt130;
	static byte[] slotFlags = new byte[2048];
	static byte[] playersMovementTypes = new byte[2048];
	static RsByteBuffer[] aClass298_Sub53Array133 = new RsByteBuffer[2048];
	static int[] anIntArray134;
	static int[] anIntArray135;
	static int anInt136 = 1;
	static int anInt137 = 2;
	static Class410[] aClass410Array138;
	static int anInt139;
	static int[] anIntArray140;

	static {
		anInt129 = 0;
		anIntArray135 = new int[2048];
		anInt130 = 0;
		anIntArray134 = new int[2048];
		aClass410Array138 = new Class410[2048];
		anInt139 = 0;
		anIntArray140 = new int[2048];
	}

	Class10() throws Throwable {
		throw new Error();
	}

	public static void method322(RsByteBuffer buffer, byte i) {
		try {
			byte[] is = new byte[24];
			try {
				Class291.aClass484_6499.method6140(0L);
				Class291.aClass484_6499.method6136(is, 430767444);
				int i_0_;
				for (i_0_ = 0; i_0_ < 24; i_0_++) {
					if (0 != is[i_0_]) {
						if (i != 1) {
							/* empty */
						}
						break;
					}
				}
				if (i_0_ >= 24)
					throw new IOException();
			} catch (Exception exception) {
				for (int i_1_ = 0; i_1_ < 24; i_1_++)
					is[i_1_] = (byte) -1;
			}
			buffer.writeByte(4);
			buffer.writeBytes(is, 0, 24, (short) -371);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ak.r(").append(')').toString());
		}
	}

	static final void method323(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_2_, (byte) -13);
			Class119 class119 = Class389.aClass119Array4165[i_2_ >> 16];
			Class194.method1870(class105, class119, class403, (byte) -123);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ak.jn(").append(')').toString());
		}
	}

	static final void method324(ClientScript2 class403, int i) {
		try {
			Class359.method4295((((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), (byte) 0);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ak.aef(").append(')').toString());
		}
	}

	static final void method325(ClientScript2 class403, byte i) {
		try {
			System.out.println(((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 -= 969361751) * -203050393)]);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ak.afw(").append(')').toString());
		}
	}
}
