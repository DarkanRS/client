/* Class52_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class52_Sub2 extends Class52 {
	public static int anInt6815;

	public abstract int method579();

	public abstract int method580();

	public abstract int method581(int i, int i_0_);

	abstract void method582(int i, int i_1_);

	abstract void method583(int i, int i_2_);

	Class52_Sub2() {
		/* empty */
	}

	public abstract int method584(int i, int i_3_);

	public abstract int method585(int i, int i_4_);

	public abstract int method586(int i, int i_5_);

	public abstract int method587(int i, int i_6_);

	static final void method588(ClientScript2 class403, short i) {
		try {
			int i_7_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_7_, (byte) 56);
			Class119 class119 = Class389.aClass119Array4165[i_7_ >> 16];
			Class377.method4665(class105, class119, class403, (short) 19287);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wk.fr(").append(')').toString());
		}
	}

	public static void method589(int i) {
		try {
			Class476 class476 = null;
			try {
				class476 = Class86.method962("2", client.aClass411_8944.aString5317, true, -1804643872);
				RsByteBuffer class298_sub53 = new RsByteBuffer(client.anInt8890 * 260699542 + 3);
				class298_sub53.writeByte(1);
				class298_sub53.writeShort(client.anInt8890 * -672377959, 16711935);
				for (int i_8_ = 0; i_8_ < Class374.anIntArray4078.length; i_8_++) {
					if (Class254.aBooleanArray2790[i_8_]) {
						class298_sub53.writeShort(i_8_, 16711935);
						class298_sub53.writeInt((Class374.anIntArray4078[i_8_]), -679720276);
					}
				}
				class476.method6078(class298_sub53.buffer, 0, 385051775 * class298_sub53.index, 840147185);
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (null != class476)
					class476.method6079(746438158);
			} catch (Exception exception) {
				/* empty */
			}
			client.aLong8892 = Class122.method1319((byte) 1) * 5732957771927789473L;
			client.aBoolean8736 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wk.gr(").append(')').toString());
		}
	}

	static final void method590(ClientScript2 class403, int i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class73.method821(class105, class119, class403, (short) 255);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("wk.en(").append(')').toString());
		}
	}
}
