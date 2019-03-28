public class Class282_Sub11_Sub1 extends Class282_Sub11 {

	String aString10001;
	byte aByte9999;
	byte aByte10000;
	Class349 this$0;

	void method12204(ClanChannel class282_sub4_1) {
		class282_sub4_1.clanName = this.aString10001;
		if (this.aString10001 != null) {
			class282_sub4_1.guestsTalk = this.aByte9999;
			class282_sub4_1.minRankToKick = this.aByte10000;
		}

	}

	void method12203(RsByteBuffer rsbytebuffer_1) {
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

	void method12205(ClanChannel class282_sub4_1) {
		class282_sub4_1.clanName = this.aString10001;
		if (this.aString10001 != null) {
			class282_sub4_1.guestsTalk = this.aByte9999;
			class282_sub4_1.minRankToKick = this.aByte10000;
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

	static int method15433(NPC npc_0) {
		NPCDefinitions npcdefinitions_2 = npc_0.definitions;
		if (npcdefinitions_2.transformTo != null) {
			npcdefinitions_2 = npcdefinitions_2.method6884(Class158_Sub1.PLAYER_VAR_PROVIDER);
			if (npcdefinitions_2 == null) {
				return -1;
			}
		}

		int i_3 = npcdefinitions_2.anInt4876;
		RenderAnimDefs renderanimdefs_4 = npc_0.getRenderAnimDefs();
		int i_5 = npc_0.aClass456_Sub3_10337.method7597();
		if (i_5 != -1 && !npc_0.aClass456_Sub3_10337.aBool7891) {
			if (i_5 != renderanimdefs_4.runningAnimation && i_5 != renderanimdefs_4.runDir3 && i_5 != renderanimdefs_4.runDir1 && i_5 != renderanimdefs_4.runDir2) {
				if (i_5 == renderanimdefs_4.teleportingAnimation || i_5 == renderanimdefs_4.teleDir3 || i_5 == renderanimdefs_4.teleDir1 || i_5 == renderanimdefs_4.teleDir2) {
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

	public static ParticleProducerDefinition getParticleProducerDefs(int i_0) {
		ParticleProducerDefinition defs = (ParticleProducerDefinition) ParticleProducerDefinition.aClass229_533.get((long) i_0);
		if (defs != null) {
			return defs;
		} else {
			byte[] bytes_3 = CoordGrid.PARTICLE_INDEX.getFile(0, i_0);
			defs = new ParticleProducerDefinition();
			if (bytes_3 != null) {
				defs.decode(new RsByteBuffer(bytes_3));
			}

			defs.init();
			ParticleProducerDefinition.aClass229_533.put(defs, (long) i_0);
			return defs;
		}
	}

}
