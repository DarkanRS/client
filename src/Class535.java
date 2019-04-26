public class Class535 {

	int anInt7083;

	Vector3 aClass385_7084;

	float aFloat7081;

	float aFloat7082;

	float aFloat7090;

	int anInt7085;

	int anInt7086;

	Class152 aClass152_7087;

	float aFloat7088;

	float aFloat7089;

	float aFloat7080;

	Class247 aClass247_7091;

	public Class535(RsByteBuffer rsbytebuffer_1, Class239 class239_2) {
		this.method11468(rsbytebuffer_1, class239_2, -1150790406);
	}

	void method11443() {
		this.anInt7083 = Class239.anInt2935;
		this.aClass385_7084 = Vector3.method6639(-50.0F, -60.0F, -50.0F);
		this.aFloat7081 = 1.1523438F;
		this.aFloat7082 = 0.69921875F;
		this.aFloat7090 = 1.2F;
		this.anInt7085 = Class239.anInt2932;
		this.anInt7086 = 0;
		this.aClass152_7087 = Class81.aClass152_802;
		this.aFloat7088 = 1.0F;
		this.aFloat7089 = 0.25F;
		this.aFloat7080 = 1.0F;
		this.aClass247_7091 = Class239.aClass247_2940;
	}

	void method11444(Class535 class535_1) {
		this.anInt7083 = class535_1.anInt7083;
		this.aFloat7081 = class535_1.aFloat7081;
		this.aFloat7082 = class535_1.aFloat7082;
		this.aFloat7090 = class535_1.aFloat7090;
		this.aClass385_7084.copy(class535_1.aClass385_7084);
		this.anInt7085 = class535_1.anInt7085;
		this.anInt7086 = class535_1.anInt7086;
		this.aClass152_7087 = class535_1.aClass152_7087;
		this.aFloat7088 = class535_1.aFloat7088;
		this.aFloat7089 = class535_1.aFloat7089;
		this.aFloat7080 = class535_1.aFloat7080;
		this.aClass247_7091 = class535_1.aClass247_7091;
	}

	void method11445(GraphicalRenderer graphicalrenderer_1, Class535 class535_2, Class535 class535_3, float f_4) {
		this.anInt7083 = Class302.method5364(class535_2.anInt7083, class535_3.anInt7083, 255.0F * f_4);
		this.aFloat7082 = class535_2.aFloat7082 + (class535_3.aFloat7082 - class535_2.aFloat7082) * f_4;
		this.aFloat7090 = class535_2.aFloat7090 + f_4 * (class535_3.aFloat7090 - class535_2.aFloat7090);
		this.aFloat7081 = f_4 * (class535_3.aFloat7081 - class535_2.aFloat7081) + class535_2.aFloat7081;
		this.aFloat7080 = class535_2.aFloat7080 + (class535_3.aFloat7080 - class535_2.aFloat7080) * f_4;
		this.aFloat7088 = class535_2.aFloat7088 + (class535_3.aFloat7088 - class535_2.aFloat7088) * f_4;
		this.aFloat7089 = class535_2.aFloat7089 + f_4 * (class535_3.aFloat7089 - class535_2.aFloat7089);
		this.anInt7085 = Class302.method5364(class535_2.anInt7085, class535_3.anInt7085, 255.0F * f_4);
		this.anInt7086 = (int) ((float) (class535_3.anInt7086 - class535_2.anInt7086) * f_4 + (float) class535_2.anInt7086);
		if (class535_2.aClass152_7087 != class535_3.aClass152_7087) {
			this.aClass152_7087 = graphicalrenderer_1.method8467(class535_2.aClass152_7087, class535_3.aClass152_7087, f_4, this.aClass152_7087);
		}
		if (class535_2.aClass247_7091 != class535_3.aClass247_7091) {
			if (class535_2.aClass247_7091 == null) {
				this.aClass247_7091 = class535_3.aClass247_7091;
				if (this.aClass247_7091 != null) {
					this.aClass247_7091.method4207((int) (f_4 * 255.0F), 0);
				}
			} else {
				this.aClass247_7091 = class535_2.aClass247_7091;
				if (this.aClass247_7091 != null) {
					this.aClass247_7091.method4207((int) (f_4 * 255.0F), 255);
				}
			}
		}
	}

	boolean method11449(Class535 class535_1) {
		return this.anInt7083 == class535_1.anInt7083 && class535_1.aFloat7081 == this.aFloat7081 && this.aFloat7082 == class535_1.aFloat7082 && class535_1.aFloat7090 == this.aFloat7090 && class535_1.aFloat7089 == this.aFloat7089 && class535_1.aFloat7088 == this.aFloat7088 && this.aFloat7080 == class535_1.aFloat7080 && this.anInt7085 == class535_1.anInt7085 && this.anInt7086 == class535_1.anInt7086 && this.aClass152_7087 == class535_1.aClass152_7087 && this.aClass247_7091 == class535_1.aClass247_7091;
	}

	public int method11450() {
		return this.anInt7085;
	}

	public Class247 method11451() {
		return this.aClass247_7091;
	}

	public Class535() {
		this.method11443();
	}

	public void method11468(RsByteBuffer rsbytebuffer_1, Class239 class239_2, int i_3) {
		int i_4 = rsbytebuffer_1.readUnsignedByte();
		if (Class393.preferences.aPreference_Sub19_8204.method12786() == 1 && Renderers.SOFTWARE_RENDERER.method8463() > 0) {
			if ((i_4 & 0x1) != 0) {
				this.anInt7083 = rsbytebuffer_1.readInt();
			} else {
				this.anInt7083 = Class239.anInt2935;
			}
			if ((i_4 & 0x2) != 0) {
				this.aFloat7081 = (float) rsbytebuffer_1.readUnsignedShort() / 256.0F;
			} else {
				this.aFloat7081 = 1.1523438F;
			}
			if ((i_4 & 0x4) != 0) {
				this.aFloat7082 = (float) rsbytebuffer_1.readUnsignedShort() / 256.0F;
			} else {
				this.aFloat7082 = 0.69921875F;
			}
			if ((i_4 & 0x8) != 0) {
				this.aFloat7090 = (float) rsbytebuffer_1.readUnsignedShort() / 256.0F;
			} else {
				this.aFloat7090 = 1.2F;
			}
		} else {
			if ((i_4 & 0x1) != 0) {
				rsbytebuffer_1.readInt();
			}
			if ((i_4 & 0x2) != 0) {
				rsbytebuffer_1.readUnsignedShort();
			}
			if ((i_4 & 0x4) != 0) {
				rsbytebuffer_1.readUnsignedShort();
			}
			if ((i_4 & 0x8) != 0) {
				rsbytebuffer_1.readUnsignedShort();
			}
			this.anInt7083 = Class239.anInt2935;
			this.aFloat7090 = 1.2F;
			this.aFloat7082 = 0.69921875F;
			this.aFloat7081 = 1.1523438F;
		}
		if ((i_4 & 0x10) != 0) {
			this.aClass385_7084 = Vector3.method6639((float) rsbytebuffer_1.readShort(), (float) rsbytebuffer_1.readShort(), (float) rsbytebuffer_1.readShort());
		} else {
			this.aClass385_7084 = Vector3.method6639(-50.0F, -60.0F, -50.0F);
		}
		if ((i_4 & 0x20) != 0) {
			this.anInt7085 = rsbytebuffer_1.readInt();
		} else {
			this.anInt7085 = Class239.anInt2932;
		}
		if ((i_4 & 0x40) != 0) {
			this.anInt7086 = rsbytebuffer_1.readUnsignedShort();
		} else {
			this.anInt7086 = 0;
		}
		if ((i_4 & 0x80) != 0) {
			int i_5 = rsbytebuffer_1.readUnsignedShort();
			int i_6 = rsbytebuffer_1.readUnsignedShort();
			int i_7 = rsbytebuffer_1.readUnsignedShort();
			int i_8 = rsbytebuffer_1.readUnsignedShort();
			int i_9 = rsbytebuffer_1.readUnsignedShort();
			int i_10 = rsbytebuffer_1.readUnsignedShort();
			this.aClass152_7087 = class239_2.method4064(i_5, i_6, i_7, i_8, i_9, i_10, -1129883400);
		} else {
			this.aClass152_7087 = Class81.aClass152_802;
		}
	}

	public void method11471(RsByteBuffer rsbytebuffer_1, byte b_2) {
		this.aFloat7088 = (float) (rsbytebuffer_1.readUnsignedByte() * 8) / 255.0F;
		this.aFloat7089 = (float) (rsbytebuffer_1.readUnsignedByte() * 8) / 255.0F;
		this.aFloat7080 = (float) (rsbytebuffer_1.readUnsignedByte() * 8) / 255.0F;
	}

	public void method11472(RsByteBuffer rsbytebuffer_1, Class239 class239_2) {
		int i_4 = rsbytebuffer_1.readUnsignedShort();
		int i_5 = rsbytebuffer_1.readShort();
		int i_6 = rsbytebuffer_1.readShort();
		int i_7 = rsbytebuffer_1.readShort();
		int i_8 = rsbytebuffer_1.readUnsignedShort();
		Class388.anInt4723 = i_8;
		this.aClass247_7091 = class239_2.method4050(i_4, i_5, i_6, i_7);
	}
}
