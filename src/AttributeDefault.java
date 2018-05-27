/* Class437 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AttributeDefault {
	public String aString5335;
	char aChar5336;
	public int anInt5337;
	public boolean autoDisable = true;
	public static NativeSprite aClass160_5339;
	
	public boolean method7314() {
		return ((AttributeDefault) this).aChar5336 == 's';
	}

	void method7315(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_0_ = class282_sub35.readUnsignedByte();
			if (0 == i_0_)
				break;
			method7316(class282_sub35, i_0_, (byte) 87);
		}
	}

	void method7316(RsByteBuffer class282_sub35, int i, byte i_1_) {
		if (i == 1)
			((AttributeDefault) this).aChar5336 = Class11.method470(class282_sub35.readByte((short) -15275), 1486768413);
		else if (2 == i)
			anInt5337 = class282_sub35.readInt() * -1363087987;
		else if (4 == i)
			autoDisable = false;
		else if (i == 5)
			aString5335 = class282_sub35.readString(912160510);
	}

	void method7317(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			((AttributeDefault) this).aChar5336 = Class11.method470(class282_sub35.readByte((short) -9046), 1244571207);
		else if (2 == i)
			anInt5337 = class282_sub35.readInt() * -1363087987;
		else if (4 == i)
			autoDisable = false;
		else if (i == 5)
			aString5335 = class282_sub35.readString(51672565);
	}

	void method7318(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7316(class282_sub35, i, (byte) 47);
		}
	}

	public boolean method7319(int i) {
		return ((AttributeDefault) this).aChar5336 == 's';
	}

	AttributeDefault() {
		/* empty */
	}

	void method7320(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			((AttributeDefault) this).aChar5336 = Class11.method470(class282_sub35.readByte((short) -6827), -1180390377);
		else if (2 == i)
			anInt5337 = class282_sub35.readInt() * -1363087987;
		else if (4 == i)
			autoDisable = false;
		else if (i == 5)
			aString5335 = class282_sub35.readString(-347682615);
	}

	public boolean method7321() {
		return ((AttributeDefault) this).aChar5336 == 's';
	}

	static final void method7322(CS2Executor class527, int i) {
		Class520.method11160(Class507.method8727(-1377363314), class527, 1060557669);
	}

	static void method7323(byte i) {
		if (null != Renderers.SOFTWARE_RENDERER) {
			IndexLoaders.MAP_REGION_DECODER.method4444(1684896059);
			Class58.method1139(-1956740427);
			Class76.method1361((byte) -9);
			Defaults8Loader.method11156(-1284329582);
			IndexLoaders.MAP_REGION_DECODER.method4446((byte) -33);
			Class217_Sub1.method13056(-1395275172);
			Class356.method6227(false, (byte) -17);
			Class225_Sub6.method13413(-1756133525);
			Class122.method2111(true, 662490589);
			Class59.method1160(-319039192);
			Class386.method6673(326422820);
			for (int i_2_ = 0; i_2_ < client.aClass281Array7180.length; i_2_++) {
				if (null == client.aClass281Array7180[i_2_]) {
					/* empty */
				}
			}
			for (int i_3_ = 0; i_3_ < 2048; i_3_++) {
				Player class521_sub1_sub1_sub2_sub1 = client.players[i_3_];
				if (class521_sub1_sub1_sub2_sub1 != null) {
					for (int i_4_ = 0; i_4_ < (class521_sub1_sub1_sub2_sub1.aClass528Array10372).length; i_4_++)
						class521_sub1_sub1_sub2_sub1.aClass528Array10372[i_4_] = null;
				}
			}
			for (int i_5_ = 0; i_5_ < client.anInt7210 * 1658163325; i_5_++) {
				NPC class521_sub1_sub1_sub2_sub2 = ((NPC) client.aClass282_Sub47Array7209[i_5_].anObject8068);
				if (class521_sub1_sub1_sub2_sub2 != null) {
					for (int i_6_ = 0; i_6_ < (class521_sub1_sub1_sub2_sub2.aClass528Array10372).length; i_6_++)
						class521_sub1_sub1_sub2_sub2.aClass528Array10372[i_6_] = null;
				}
			}
			client.aClass465_7334.method7749(835503641);
			Renderers.SOFTWARE_RENDERER.method8396(-2084829618);
			Renderers.SOFTWARE_RENDERER = null;
		}
	}
}
