/* Class298_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public abstract class Class298_Sub24 extends Linkable {
	OggStreamState anOggStreamState7351;
	int anInt7352;

	abstract void method3072();

	void method3073(OggPacket oggpacket, int i) {
		try {
			method3074(oggpacket, -441826665);
			((Class298_Sub24) this).anInt7352 += 1765581491;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abi.a(").append(')').toString());
		}
	}

	abstract void method3074(OggPacket oggpacket, int i);

	abstract void method3075(int i);

	abstract void method3076(OggPacket oggpacket);

	abstract void method3077(OggPacket oggpacket);

	abstract void method3078(OggPacket oggpacket);

	Class298_Sub24(OggStreamState oggstreamstate) {
		((Class298_Sub24) this).anOggStreamState7351 = oggstreamstate;
	}

	abstract void method3079();

	public static void method3080(Class243 class243, Class243 class243_0_, Class243 class243_1_, Class243 class243_2_, int i) {
		try {
			Class270.aClass243_2894 = class243;
			RuntimeException_Sub3.aClass243_6310 = class243_0_;
			Class124.aClass243_1480 = class243_1_;
			Class389.aClass119Array4165 = new Class119[Class270.aClass243_2894.method2296(1202427542)];
			Class441.aBooleanArray5590 = new boolean[Class270.aClass243_2894.method2296(1827823316)];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abi.a(").append(')').toString());
		}
	}
}
