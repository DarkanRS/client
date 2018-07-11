/* Class535 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class535 {
	float aFloat7080;
	float aFloat7081;
	float aFloat7082;
	int anInt7083;
	Vector3 aClass385_7084;
	int anInt7085;
	int anInt7086;
	Class152 aClass152_7087;
	float aFloat7088;
	float aFloat7089;
	float aFloat7090;
	Class247 aClass247_7091;

	boolean method11442(Class535 class535_0_) {
		return ((((Class535) this).anInt7083 * 783185137 == ((Class535) class535_0_).anInt7083 * 783185137) && (((Class535) class535_0_).aFloat7081 == ((Class535) this).aFloat7081) && (((Class535) this).aFloat7082 == ((Class535) class535_0_).aFloat7082) && (((Class535) class535_0_).aFloat7090 == ((Class535) this).aFloat7090) && (((Class535) class535_0_).aFloat7089 == ((Class535) this).aFloat7089) && (((Class535) class535_0_).aFloat7088 == ((Class535) this).aFloat7088)
				&& (((Class535) this).aFloat7080 == ((Class535) class535_0_).aFloat7080) && (227569303 * ((Class535) this).anInt7085 == ((Class535) class535_0_).anInt7085 * 227569303) && (-1617038559 * ((Class535) class535_0_).anInt7086 == ((Class535) this).anInt7086 * -1617038559) && (((Class535) class535_0_).aClass152_7087 == ((Class535) this).aClass152_7087) && (((Class535) this).aClass247_7091 == ((Class535) class535_0_).aClass247_7091));
	}

	public Class535(RsByteBuffer class282_sub35, Class239 class239) {
		method11468(class282_sub35, class239, -1150790406);
	}

	void method11443(int i) {
		((Class535) this).anInt7083 = -1187075549 * Class239.anInt2935;
		((Class535) this).aClass385_7084 = Vector3.method6639(-50.0F, -60.0F, -50.0F);
		((Class535) this).aFloat7081 = 1.1523438F;
		((Class535) this).aFloat7082 = 0.69921875F;
		((Class535) this).aFloat7090 = 1.2F;
		((Class535) this).anInt7085 = -2099944673 * Class239.anInt2932;
		((Class535) this).anInt7086 = 0;
		((Class535) this).aClass152_7087 = Class81.aClass152_802;
		((Class535) this).aFloat7088 = 1.0F;
		((Class535) this).aFloat7089 = 0.25F;
		((Class535) this).aFloat7080 = 1.0F;
		((Class535) this).aClass247_7091 = Class239.aClass247_2940;
	}

	void method11444(Class535 class535_1_, int i) {
		((Class535) this).anInt7083 = 1 * ((Class535) class535_1_).anInt7083;
		((Class535) this).aFloat7081 = ((Class535) class535_1_).aFloat7081;
		((Class535) this).aFloat7082 = ((Class535) class535_1_).aFloat7082;
		((Class535) this).aFloat7090 = ((Class535) class535_1_).aFloat7090;
		((Class535) this).aClass385_7084.copy(((Class535) class535_1_).aClass385_7084);
		((Class535) this).anInt7085 = ((Class535) class535_1_).anInt7085 * 1;
		((Class535) this).anInt7086 = 1 * ((Class535) class535_1_).anInt7086;
		((Class535) this).aClass152_7087 = ((Class535) class535_1_).aClass152_7087;
		((Class535) this).aFloat7088 = ((Class535) class535_1_).aFloat7088;
		((Class535) this).aFloat7089 = ((Class535) class535_1_).aFloat7089;
		((Class535) this).aFloat7080 = ((Class535) class535_1_).aFloat7080;
		((Class535) this).aClass247_7091 = ((Class535) class535_1_).aClass247_7091;
	}

	void method11445(GraphicalRenderer class505, Class535 class535_2_, Class535 class535_3_, float f, byte i) {
		((Class535) this).anInt7083 = Class302.method5364((783185137 * ((Class535) class535_2_).anInt7083), (((Class535) class535_3_).anInt7083 * 783185137), 255.0F * f, 833509259) * -1407321071;
		((Class535) this).aFloat7082 = (((Class535) class535_2_).aFloat7082 + (((Class535) class535_3_).aFloat7082 - ((Class535) class535_2_).aFloat7082) * f);
		((Class535) this).aFloat7090 = (((Class535) class535_2_).aFloat7090 + f * (((Class535) class535_3_).aFloat7090 - ((Class535) class535_2_).aFloat7090));
		((Class535) this).aFloat7081 = (f * (((Class535) class535_3_).aFloat7081 - ((Class535) class535_2_).aFloat7081) + ((Class535) class535_2_).aFloat7081);
		((Class535) this).aFloat7080 = (((Class535) class535_2_).aFloat7080 + (((Class535) class535_3_).aFloat7080 - ((Class535) class535_2_).aFloat7080) * f);
		((Class535) this).aFloat7088 = (((Class535) class535_2_).aFloat7088 + (((Class535) class535_3_).aFloat7088 - ((Class535) class535_2_).aFloat7088) * f);
		((Class535) this).aFloat7089 = (((Class535) class535_2_).aFloat7089 + f * (((Class535) class535_3_).aFloat7089 - ((Class535) class535_2_).aFloat7089));
		((Class535) this).anInt7085 = Class302.method5364((((Class535) class535_2_).anInt7085 * 227569303), (((Class535) class535_3_).anInt7085 * 227569303), 255.0F * f, 833509259) * 1335226663;
		((Class535) this).anInt7086 = 919818465 * (int) ((float) ((((Class535) class535_3_).anInt7086 * -1617038559) - (((Class535) class535_2_).anInt7086 * -1617038559)) * f + (float) (((Class535) class535_2_).anInt7086 * -1617038559));
		if (((Class535) class535_3_).aClass152_7087 != ((Class535) class535_2_).aClass152_7087)
			((Class535) this).aClass152_7087 = class505.method8467(((Class535) class535_2_).aClass152_7087, ((Class535) class535_3_).aClass152_7087, f, ((Class535) this).aClass152_7087);
		if (((Class535) class535_3_).aClass247_7091 != ((Class535) class535_2_).aClass247_7091) {
			if (((Class535) class535_2_).aClass247_7091 == null) {
				((Class535) this).aClass247_7091 = ((Class535) class535_3_).aClass247_7091;
				if (((Class535) this).aClass247_7091 != null)
					((Class535) this).aClass247_7091.method4207((int) (f * 255.0F), 0, 65280);
			} else {
				((Class535) this).aClass247_7091 = ((Class535) class535_2_).aClass247_7091;
				if (null != ((Class535) this).aClass247_7091)
					((Class535) this).aClass247_7091.method4207((int) (f * 255.0F), 255, 65280);
			}
		}
	}

	public Class247 method11446() {
		return ((Class535) this).aClass247_7091;
	}

	void method11447(GraphicalRenderer class505, Class535 class535_4_, Class535 class535_5_, float f) {
		((Class535) this).anInt7083 = Class302.method5364((783185137 * ((Class535) class535_4_).anInt7083), (((Class535) class535_5_).anInt7083 * 783185137), 255.0F * f, 833509259) * -1407321071;
		((Class535) this).aFloat7082 = (((Class535) class535_4_).aFloat7082 + (((Class535) class535_5_).aFloat7082 - ((Class535) class535_4_).aFloat7082) * f);
		((Class535) this).aFloat7090 = (((Class535) class535_4_).aFloat7090 + f * (((Class535) class535_5_).aFloat7090 - ((Class535) class535_4_).aFloat7090));
		((Class535) this).aFloat7081 = (f * (((Class535) class535_5_).aFloat7081 - ((Class535) class535_4_).aFloat7081) + ((Class535) class535_4_).aFloat7081);
		((Class535) this).aFloat7080 = (((Class535) class535_4_).aFloat7080 + (((Class535) class535_5_).aFloat7080 - ((Class535) class535_4_).aFloat7080) * f);
		((Class535) this).aFloat7088 = (((Class535) class535_4_).aFloat7088 + (((Class535) class535_5_).aFloat7088 - ((Class535) class535_4_).aFloat7088) * f);
		((Class535) this).aFloat7089 = (((Class535) class535_4_).aFloat7089 + f * (((Class535) class535_5_).aFloat7089 - ((Class535) class535_4_).aFloat7089));
		((Class535) this).anInt7085 = Class302.method5364((((Class535) class535_4_).anInt7085 * 227569303), (((Class535) class535_5_).anInt7085 * 227569303), 255.0F * f, 833509259) * 1335226663;
		((Class535) this).anInt7086 = 919818465 * (int) ((float) ((((Class535) class535_5_).anInt7086 * -1617038559) - (((Class535) class535_4_).anInt7086 * -1617038559)) * f + (float) (((Class535) class535_4_).anInt7086 * -1617038559));
		if (((Class535) class535_5_).aClass152_7087 != ((Class535) class535_4_).aClass152_7087)
			((Class535) this).aClass152_7087 = class505.method8467(((Class535) class535_4_).aClass152_7087, ((Class535) class535_5_).aClass152_7087, f, ((Class535) this).aClass152_7087);
		if (((Class535) class535_5_).aClass247_7091 != ((Class535) class535_4_).aClass247_7091) {
			if (((Class535) class535_4_).aClass247_7091 == null) {
				((Class535) this).aClass247_7091 = ((Class535) class535_5_).aClass247_7091;
				if (((Class535) this).aClass247_7091 != null)
					((Class535) this).aClass247_7091.method4207((int) (f * 255.0F), 0, 65280);
			} else {
				((Class535) this).aClass247_7091 = ((Class535) class535_4_).aClass247_7091;
				if (null != ((Class535) this).aClass247_7091)
					((Class535) this).aClass247_7091.method4207((int) (f * 255.0F), 255, 65280);
			}
		}
	}

	public void method11448(RsByteBuffer class282_sub35, Class239 class239) {
		int i = class282_sub35.readUnsignedShort();
		int i_6_ = class282_sub35.readShort(1650739334);
		int i_7_ = class282_sub35.readShort(1888796986);
		int i_8_ = class282_sub35.readShort(1900139067);
		int i_9_ = class282_sub35.readUnsignedShort();
		Class388.anInt4723 = -811581463 * i_9_;
		((Class535) this).aClass247_7091 = class239.method4050(i, i_6_, i_7_, i_8_, (byte) 15);
	}

	boolean method11449(Class535 class535_10_, int i) {
		return ((((Class535) this).anInt7083 * 783185137 == ((Class535) class535_10_).anInt7083 * 783185137) && (((Class535) class535_10_).aFloat7081 == ((Class535) this).aFloat7081) && (((Class535) this).aFloat7082 == ((Class535) class535_10_).aFloat7082) && (((Class535) class535_10_).aFloat7090 == ((Class535) this).aFloat7090) && (((Class535) class535_10_).aFloat7089 == ((Class535) this).aFloat7089) && (((Class535) class535_10_).aFloat7088 == ((Class535) this).aFloat7088)
				&& (((Class535) this).aFloat7080 == ((Class535) class535_10_).aFloat7080) && (227569303 * ((Class535) this).anInt7085 == ((Class535) class535_10_).anInt7085 * 227569303) && (-1617038559 * ((Class535) class535_10_).anInt7086 == ((Class535) this).anInt7086 * -1617038559) && (((Class535) class535_10_).aClass152_7087 == ((Class535) this).aClass152_7087) && (((Class535) this).aClass247_7091 == ((Class535) class535_10_).aClass247_7091));
	}

	public int method11450(int i) {
		return ((Class535) this).anInt7085 * 227569303;
	}

	public Class247 method11451(int i) {
		return ((Class535) this).aClass247_7091;
	}

	void method11452() {
		((Class535) this).anInt7083 = -1187075549 * Class239.anInt2935;
		((Class535) this).aClass385_7084 = Vector3.method6639(-50.0F, -60.0F, -50.0F);
		((Class535) this).aFloat7081 = 1.1523438F;
		((Class535) this).aFloat7082 = 0.69921875F;
		((Class535) this).aFloat7090 = 1.2F;
		((Class535) this).anInt7085 = -2099944673 * Class239.anInt2932;
		((Class535) this).anInt7086 = 0;
		((Class535) this).aClass152_7087 = Class81.aClass152_802;
		((Class535) this).aFloat7088 = 1.0F;
		((Class535) this).aFloat7089 = 0.25F;
		((Class535) this).aFloat7080 = 1.0F;
		((Class535) this).aClass247_7091 = Class239.aClass247_2940;
	}

	void method11453() {
		((Class535) this).anInt7083 = -1187075549 * Class239.anInt2935;
		((Class535) this).aClass385_7084 = Vector3.method6639(-50.0F, -60.0F, -50.0F);
		((Class535) this).aFloat7081 = 1.1523438F;
		((Class535) this).aFloat7082 = 0.69921875F;
		((Class535) this).aFloat7090 = 1.2F;
		((Class535) this).anInt7085 = -2099944673 * Class239.anInt2932;
		((Class535) this).anInt7086 = 0;
		((Class535) this).aClass152_7087 = Class81.aClass152_802;
		((Class535) this).aFloat7088 = 1.0F;
		((Class535) this).aFloat7089 = 0.25F;
		((Class535) this).aFloat7080 = 1.0F;
		((Class535) this).aClass247_7091 = Class239.aClass247_2940;
	}

	void method11454(Class535 class535_11_) {
		((Class535) this).anInt7083 = 1 * ((Class535) class535_11_).anInt7083;
		((Class535) this).aFloat7081 = ((Class535) class535_11_).aFloat7081;
		((Class535) this).aFloat7082 = ((Class535) class535_11_).aFloat7082;
		((Class535) this).aFloat7090 = ((Class535) class535_11_).aFloat7090;
		((Class535) this).aClass385_7084.copy(((Class535) class535_11_).aClass385_7084);
		((Class535) this).anInt7085 = ((Class535) class535_11_).anInt7085 * 1;
		((Class535) this).anInt7086 = 1 * ((Class535) class535_11_).anInt7086;
		((Class535) this).aClass152_7087 = ((Class535) class535_11_).aClass152_7087;
		((Class535) this).aFloat7088 = ((Class535) class535_11_).aFloat7088;
		((Class535) this).aFloat7089 = ((Class535) class535_11_).aFloat7089;
		((Class535) this).aFloat7080 = ((Class535) class535_11_).aFloat7080;
		((Class535) this).aClass247_7091 = ((Class535) class535_11_).aClass247_7091;
	}

	public Class535() {
		method11443(2115357726);
	}

	void method11455(Class535 class535_12_) {
		((Class535) this).anInt7083 = 1 * ((Class535) class535_12_).anInt7083;
		((Class535) this).aFloat7081 = ((Class535) class535_12_).aFloat7081;
		((Class535) this).aFloat7082 = ((Class535) class535_12_).aFloat7082;
		((Class535) this).aFloat7090 = ((Class535) class535_12_).aFloat7090;
		((Class535) this).aClass385_7084.copy(((Class535) class535_12_).aClass385_7084);
		((Class535) this).anInt7085 = ((Class535) class535_12_).anInt7085 * 1;
		((Class535) this).anInt7086 = 1 * ((Class535) class535_12_).anInt7086;
		((Class535) this).aClass152_7087 = ((Class535) class535_12_).aClass152_7087;
		((Class535) this).aFloat7088 = ((Class535) class535_12_).aFloat7088;
		((Class535) this).aFloat7089 = ((Class535) class535_12_).aFloat7089;
		((Class535) this).aFloat7080 = ((Class535) class535_12_).aFloat7080;
		((Class535) this).aClass247_7091 = ((Class535) class535_12_).aClass247_7091;
	}

	void method11456(GraphicalRenderer class505, Class535 class535_13_, Class535 class535_14_, float f) {
		((Class535) this).anInt7083 = Class302.method5364((783185137 * ((Class535) class535_13_).anInt7083), (((Class535) class535_14_).anInt7083 * 783185137), 255.0F * f, 833509259) * -1407321071;
		((Class535) this).aFloat7082 = (((Class535) class535_13_).aFloat7082 + (((Class535) class535_14_).aFloat7082 - ((Class535) class535_13_).aFloat7082) * f);
		((Class535) this).aFloat7090 = (((Class535) class535_13_).aFloat7090 + f * (((Class535) class535_14_).aFloat7090 - ((Class535) class535_13_).aFloat7090));
		((Class535) this).aFloat7081 = (f * (((Class535) class535_14_).aFloat7081 - ((Class535) class535_13_).aFloat7081) + ((Class535) class535_13_).aFloat7081);
		((Class535) this).aFloat7080 = (((Class535) class535_13_).aFloat7080 + (((Class535) class535_14_).aFloat7080 - ((Class535) class535_13_).aFloat7080) * f);
		((Class535) this).aFloat7088 = (((Class535) class535_13_).aFloat7088 + (((Class535) class535_14_).aFloat7088 - ((Class535) class535_13_).aFloat7088) * f);
		((Class535) this).aFloat7089 = (((Class535) class535_13_).aFloat7089 + f * (((Class535) class535_14_).aFloat7089 - ((Class535) class535_13_).aFloat7089));
		((Class535) this).anInt7085 = Class302.method5364((((Class535) class535_13_).anInt7085 * 227569303), (((Class535) class535_14_).anInt7085 * 227569303), 255.0F * f, 833509259) * 1335226663;
		((Class535) this).anInt7086 = 919818465 * (int) ((float) ((((Class535) class535_14_).anInt7086 * -1617038559) - (((Class535) class535_13_).anInt7086) * -1617038559) * f + (float) (((Class535) class535_13_).anInt7086 * -1617038559));
		if (((Class535) class535_14_).aClass152_7087 != ((Class535) class535_13_).aClass152_7087)
			((Class535) this).aClass152_7087 = class505.method8467(((Class535) class535_13_).aClass152_7087, ((Class535) class535_14_).aClass152_7087, f, ((Class535) this).aClass152_7087);
		if (((Class535) class535_14_).aClass247_7091 != ((Class535) class535_13_).aClass247_7091) {
			if (((Class535) class535_13_).aClass247_7091 == null) {
				((Class535) this).aClass247_7091 = ((Class535) class535_14_).aClass247_7091;
				if (((Class535) this).aClass247_7091 != null)
					((Class535) this).aClass247_7091.method4207((int) (f * 255.0F), 0, 65280);
			} else {
				((Class535) this).aClass247_7091 = ((Class535) class535_13_).aClass247_7091;
				if (null != ((Class535) this).aClass247_7091)
					((Class535) this).aClass247_7091.method4207((int) (f * 255.0F), 255, 65280);
			}
		}
	}

	public void method11457(RsByteBuffer class282_sub35) {
		((Class535) this).aFloat7088 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7089 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7080 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
	}

	public void method11458(RsByteBuffer class282_sub35, Class239 class239) {
		int i = class282_sub35.readUnsignedByte();
		if (Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1 && Renderers.SOFTWARE_RENDERER.method8463() > 0) {
			if ((i & 0x1) != 0)
				((Class535) this).anInt7083 = class282_sub35.readInt() * -1407321071;
			else
				((Class535) this).anInt7083 = Class239.anInt2935 * -1187075549;
			if ((i & 0x2) != 0)
				((Class535) this).aFloat7081 = (float) class282_sub35.readUnsignedShort() / 256.0F;
			else
				((Class535) this).aFloat7081 = 1.1523438F;
			if ((i & 0x4) != 0)
				((Class535) this).aFloat7082 = (float) class282_sub35.readUnsignedShort() / 256.0F;
			else
				((Class535) this).aFloat7082 = 0.69921875F;
			if (0 != (i & 0x8))
				((Class535) this).aFloat7090 = (float) class282_sub35.readUnsignedShort() / 256.0F;
			else
				((Class535) this).aFloat7090 = 1.2F;
		} else {
			if (0 != (i & 0x1))
				class282_sub35.readInt();
			if (0 != (i & 0x2))
				class282_sub35.readUnsignedShort();
			if (0 != (i & 0x4))
				class282_sub35.readUnsignedShort();
			if ((i & 0x8) != 0)
				class282_sub35.readUnsignedShort();
			((Class535) this).anInt7083 = -1187075549 * Class239.anInt2935;
			((Class535) this).aFloat7090 = 1.2F;
			((Class535) this).aFloat7082 = 0.69921875F;
			((Class535) this).aFloat7081 = 1.1523438F;
		}
		if ((i & 0x10) != 0)
			((Class535) this).aClass385_7084 = Vector3.method6639((float) class282_sub35.readShort(1915898354), (float) class282_sub35.readShort(1638997382), (float) class282_sub35.readShort(2052743731));
		else
			((Class535) this).aClass385_7084 = Vector3.method6639(-50.0F, -60.0F, -50.0F);
		if (0 != (i & 0x20))
			((Class535) this).anInt7085 = class282_sub35.readInt() * 1335226663;
		else
			((Class535) this).anInt7085 = -2099944673 * Class239.anInt2932;
		if ((i & 0x40) != 0)
			((Class535) this).anInt7086 = class282_sub35.readUnsignedShort() * 919818465;
		else
			((Class535) this).anInt7086 = 0;
		if (0 != (i & 0x80)) {
			int i_15_ = class282_sub35.readUnsignedShort();
			int i_16_ = class282_sub35.readUnsignedShort();
			int i_17_ = class282_sub35.readUnsignedShort();
			int i_18_ = class282_sub35.readUnsignedShort();
			int i_19_ = class282_sub35.readUnsignedShort();
			int i_20_ = class282_sub35.readUnsignedShort();
			((Class535) this).aClass152_7087 = class239.method4064(i_15_, i_16_, i_17_, i_18_, i_19_, i_20_, -335885653);
		} else
			((Class535) this).aClass152_7087 = Class81.aClass152_802;
	}

	public void method11459(RsByteBuffer class282_sub35) {
		((Class535) this).aFloat7088 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7089 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7080 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
	}

	public int method11460() {
		return ((Class535) this).anInt7085 * 227569303;
	}

	void method11461(Class535 class535_21_) {
		((Class535) this).anInt7083 = 1 * ((Class535) class535_21_).anInt7083;
		((Class535) this).aFloat7081 = ((Class535) class535_21_).aFloat7081;
		((Class535) this).aFloat7082 = ((Class535) class535_21_).aFloat7082;
		((Class535) this).aFloat7090 = ((Class535) class535_21_).aFloat7090;
		((Class535) this).aClass385_7084.copy(((Class535) class535_21_).aClass385_7084);
		((Class535) this).anInt7085 = ((Class535) class535_21_).anInt7085 * 1;
		((Class535) this).anInt7086 = 1 * ((Class535) class535_21_).anInt7086;
		((Class535) this).aClass152_7087 = ((Class535) class535_21_).aClass152_7087;
		((Class535) this).aFloat7088 = ((Class535) class535_21_).aFloat7088;
		((Class535) this).aFloat7089 = ((Class535) class535_21_).aFloat7089;
		((Class535) this).aFloat7080 = ((Class535) class535_21_).aFloat7080;
		((Class535) this).aClass247_7091 = ((Class535) class535_21_).aClass247_7091;
	}

	public void method11462(RsByteBuffer class282_sub35) {
		((Class535) this).aFloat7088 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7089 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7080 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
	}

	public Class247 method11463() {
		return ((Class535) this).aClass247_7091;
	}

	boolean method11464(Class535 class535_22_) {
		return ((((Class535) this).anInt7083 * 783185137 == ((Class535) class535_22_).anInt7083 * 783185137) && (((Class535) class535_22_).aFloat7081 == ((Class535) this).aFloat7081) && (((Class535) this).aFloat7082 == ((Class535) class535_22_).aFloat7082) && (((Class535) class535_22_).aFloat7090 == ((Class535) this).aFloat7090) && (((Class535) class535_22_).aFloat7089 == ((Class535) this).aFloat7089) && (((Class535) class535_22_).aFloat7088 == ((Class535) this).aFloat7088)
				&& (((Class535) this).aFloat7080 == ((Class535) class535_22_).aFloat7080) && (227569303 * ((Class535) this).anInt7085 == ((Class535) class535_22_).anInt7085 * 227569303) && (-1617038559 * ((Class535) class535_22_).anInt7086 == ((Class535) this).anInt7086 * -1617038559) && (((Class535) class535_22_).aClass152_7087 == ((Class535) this).aClass152_7087) && (((Class535) this).aClass247_7091 == ((Class535) class535_22_).aClass247_7091));
	}

	public void method11465(RsByteBuffer class282_sub35) {
		((Class535) this).aFloat7088 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7089 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7080 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
	}

	boolean method11466(Class535 class535_23_) {
		return ((((Class535) this).anInt7083 * 783185137 == ((Class535) class535_23_).anInt7083 * 783185137) && (((Class535) class535_23_).aFloat7081 == ((Class535) this).aFloat7081) && (((Class535) this).aFloat7082 == ((Class535) class535_23_).aFloat7082) && (((Class535) class535_23_).aFloat7090 == ((Class535) this).aFloat7090) && (((Class535) class535_23_).aFloat7089 == ((Class535) this).aFloat7089) && (((Class535) class535_23_).aFloat7088 == ((Class535) this).aFloat7088)
				&& (((Class535) this).aFloat7080 == ((Class535) class535_23_).aFloat7080) && (227569303 * ((Class535) this).anInt7085 == ((Class535) class535_23_).anInt7085 * 227569303) && (-1617038559 * ((Class535) class535_23_).anInt7086 == ((Class535) this).anInt7086 * -1617038559) && (((Class535) class535_23_).aClass152_7087 == ((Class535) this).aClass152_7087) && (((Class535) this).aClass247_7091 == ((Class535) class535_23_).aClass247_7091));
	}

	public int method11467() {
		return ((Class535) this).anInt7085 * 227569303;
	}

	public void method11468(RsByteBuffer class282_sub35, Class239 class239, int i) {
		int i_24_ = class282_sub35.readUnsignedByte();
		if (Class393.aClass282_Sub54_4783.aClass468_Sub19_8204.method12786(-399420695) == 1 && Renderers.SOFTWARE_RENDERER.method8463() > 0) {
			if ((i_24_ & 0x1) != 0)
				((Class535) this).anInt7083 = class282_sub35.readInt() * -1407321071;
			else
				((Class535) this).anInt7083 = Class239.anInt2935 * -1187075549;
			if ((i_24_ & 0x2) != 0)
				((Class535) this).aFloat7081 = (float) class282_sub35.readUnsignedShort() / 256.0F;
			else
				((Class535) this).aFloat7081 = 1.1523438F;
			if ((i_24_ & 0x4) != 0)
				((Class535) this).aFloat7082 = (float) class282_sub35.readUnsignedShort() / 256.0F;
			else
				((Class535) this).aFloat7082 = 0.69921875F;
			if (0 != (i_24_ & 0x8))
				((Class535) this).aFloat7090 = (float) class282_sub35.readUnsignedShort() / 256.0F;
			else
				((Class535) this).aFloat7090 = 1.2F;
		} else {
			if (0 != (i_24_ & 0x1))
				class282_sub35.readInt();
			if (0 != (i_24_ & 0x2))
				class282_sub35.readUnsignedShort();
			if (0 != (i_24_ & 0x4))
				class282_sub35.readUnsignedShort();
			if ((i_24_ & 0x8) != 0)
				class282_sub35.readUnsignedShort();
			((Class535) this).anInt7083 = -1187075549 * Class239.anInt2935;
			((Class535) this).aFloat7090 = 1.2F;
			((Class535) this).aFloat7082 = 0.69921875F;
			((Class535) this).aFloat7081 = 1.1523438F;
		}
		if ((i_24_ & 0x10) != 0)
			((Class535) this).aClass385_7084 = Vector3.method6639((float) class282_sub35.readShort(1605613449), (float) class282_sub35.readShort(1992590834), (float) class282_sub35.readShort(1784943938));
		else
			((Class535) this).aClass385_7084 = Vector3.method6639(-50.0F, -60.0F, -50.0F);
		if (0 != (i_24_ & 0x20))
			((Class535) this).anInt7085 = class282_sub35.readInt() * 1335226663;
		else
			((Class535) this).anInt7085 = -2099944673 * Class239.anInt2932;
		if ((i_24_ & 0x40) != 0)
			((Class535) this).anInt7086 = class282_sub35.readUnsignedShort() * 919818465;
		else
			((Class535) this).anInt7086 = 0;
		if (0 != (i_24_ & 0x80)) {
			int i_25_ = class282_sub35.readUnsignedShort();
			int i_26_ = class282_sub35.readUnsignedShort();
			int i_27_ = class282_sub35.readUnsignedShort();
			int i_28_ = class282_sub35.readUnsignedShort();
			int i_29_ = class282_sub35.readUnsignedShort();
			int i_30_ = class282_sub35.readUnsignedShort();
			((Class535) this).aClass152_7087 = class239.method4064(i_25_, i_26_, i_27_, i_28_, i_29_, i_30_, -1129883400);
		} else
			((Class535) this).aClass152_7087 = Class81.aClass152_802;
	}

	public Class247 method11469() {
		return ((Class535) this).aClass247_7091;
	}

	public Class247 method11470() {
		return ((Class535) this).aClass247_7091;
	}

	public void method11471(RsByteBuffer class282_sub35, byte i) {
		((Class535) this).aFloat7088 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7089 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
		((Class535) this).aFloat7080 = (float) (class282_sub35.readUnsignedByte() * 8) / 255.0F;
	}

	public void method11472(RsByteBuffer class282_sub35, Class239 class239, int i) {
		int i_31_ = class282_sub35.readUnsignedShort();
		int i_32_ = class282_sub35.readShort(1691992902);
		int i_33_ = class282_sub35.readShort(2108682700);
		int i_34_ = class282_sub35.readShort(1800641429);
		int i_35_ = class282_sub35.readUnsignedShort();
		Class388.anInt4723 = -811581463 * i_35_;
		((Class535) this).aClass247_7091 = class239.method4050(i_31_, i_32_, i_33_, i_34_, (byte) 15);
	}

	static final void method11473(CS2Executor class527, int i) {
		int i_36_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		IComponentDefinitions class118 = Class117.method1981(i_36_, (byte) 123);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = class118.anInt1312 * 682782159;
	}
}
