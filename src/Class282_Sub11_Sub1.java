public class Class282_Sub11_Sub1 extends Class282_Sub11 {

	String aString10001;
	byte aByte9999;
	byte aByte10000;
	Class349 this$0;

	void method12204(Class282_Sub4 class282_sub4_1, int i_2) {
		class282_sub4_1.aString7501 = this.aString10001;
		if (this.aString10001 != null) {
			class282_sub4_1.aByte7504 = this.aByte9999;
			class282_sub4_1.aByte7497 = this.aByte10000;
		}

	}

	void method12203(RsByteBuffer rsbytebuffer_1, int i_2) {
		this.aString10001 = rsbytebuffer_1.readNullString();
		if (this.aString10001 != null) {
			rsbytebuffer_1.readUnsignedByte();
			this.aByte9999 = rsbytebuffer_1.readByte();
			this.aByte10000 = rsbytebuffer_1.readByte();
		}

	}

	void method12206(RsByteBuffer rsbytebuffer_1) {
		this.aString10001 = rsbytebuffer_1.readNullString();
		if (this.aString10001 != null) {
			rsbytebuffer_1.readUnsignedByte();
			this.aByte9999 = rsbytebuffer_1.readByte();
			this.aByte10000 = rsbytebuffer_1.readByte();
		}

	}

	void method12205(Class282_Sub4 class282_sub4_1) {
		class282_sub4_1.aString7501 = this.aString10001;
		if (this.aString10001 != null) {
			class282_sub4_1.aByte7504 = this.aByte9999;
			class282_sub4_1.aByte7497 = this.aByte10000;
		}

	}

	void method12208(RsByteBuffer rsbytebuffer_1) {
		this.aString10001 = rsbytebuffer_1.readNullString();
		if (this.aString10001 != null) {
			rsbytebuffer_1.readUnsignedByte();
			this.aByte9999 = rsbytebuffer_1.readByte();
			this.aByte10000 = rsbytebuffer_1.readByte();
		}

	}

	void method12207(RsByteBuffer rsbytebuffer_1) {
		this.aString10001 = rsbytebuffer_1.readNullString();
		if (this.aString10001 != null) {
			rsbytebuffer_1.readUnsignedByte();
			this.aByte9999 = rsbytebuffer_1.readByte();
			this.aByte10000 = rsbytebuffer_1.readByte();
		}

	}

	Class282_Sub11_Sub1(Class349 class349_1) {
		this.this$0 = class349_1;
	}

	static int method15433(NPC npc_0, int i_1) {
		NPCDefinitions npcdefinitions_2 = npc_0.definitions;
		if (npcdefinitions_2.anIntArray4886 != null) {
			npcdefinitions_2 = npcdefinitions_2.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER, 265881693);
			if (npcdefinitions_2 == null) {
				return -1;
			}
		}

		int i_3 = npcdefinitions_2.anInt4876;
		RenderAnimDefs renderanimdefs_4 = npc_0.getRenderAnimDefs((byte) -17);
		int i_5 = npc_0.aClass456_Sub3_10337.method7597(-693790395);
		if (i_5 != -1 && !npc_0.aClass456_Sub3_10337.aBool7891) {
			if (i_5 != renderanimdefs_4.anInt2797 && i_5 != renderanimdefs_4.walkDir6 && i_5 != renderanimdefs_4.anInt2800 && i_5 != renderanimdefs_4.anInt2799) {
				if (i_5 == renderanimdefs_4.anInt2801 || i_5 == renderanimdefs_4.anInt2828 || i_5 == renderanimdefs_4.anInt2812 || i_5 == renderanimdefs_4.anInt2803) {
					i_3 = npcdefinitions_2.anInt4921;
				}
			} else {
				i_3 = npcdefinitions_2.anInt4906;
			}
		} else {
			i_3 = npcdefinitions_2.anInt4903;
		}

		return i_3;
	}

	public static ParticleProducerDefinition getParticleProducerDefs(int i_0, byte b_1) {
		ParticleProducerDefinition defs = (ParticleProducerDefinition) ParticleProducerDefinition.aClass229_533.get((long) i_0);
		if (defs != null) {
			return defs;
		} else {
			byte[] bytes_3 = CoordGrid.PARTICLE_INDEX.getFile(0, i_0);
			defs = new ParticleProducerDefinition();
			if (bytes_3 != null) {
				defs.decode(new RsByteBuffer(bytes_3), -1621727040);
			}

			defs.init((byte) 1);
			ParticleProducerDefinition.aClass229_533.put(defs, (long) i_0);
			return defs;
		}
	}

	static void method15435(int i_0, int i_1, byte b_2) {
		Class282_Sub50_Sub12 class282_sub50_sub12_3 = Engine.getIComponentVar(16, (long) i_0);
		class282_sub50_sub12_3.method14995(1165505680);
		class282_sub50_sub12_3.anInt9668 = i_1;
	}

}
