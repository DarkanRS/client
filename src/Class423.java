public class Class423 {

	Class423() throws Throwable {
		throw new Error();
	}

	public static ParticleArchive1Def method7065(int i_0) {
		ParticleArchive1Def class345_2 = (ParticleArchive1Def) ParticleArchive1Def.aClass229_4031.get((long) i_0);
		if (class345_2 != null) {
			return class345_2;
		} else {
			byte[] bytes_3 = ParticleArchive1Def.PARTICLE_INDEX.getFile(1, i_0);
			class345_2 = new ParticleArchive1Def();
			class345_2.anInt4032 = i_0;
			if (bytes_3 != null) {
				class345_2.method6124(new RsByteBuffer(bytes_3));
			}

			class345_2.method6128();
			if (class345_2.anInt4041 == 2 && ParticleArchive1Def.aClass465_4029.get((long) i_0) == null) {
				ParticleArchive1Def.aClass465_4029.put(new IntNode(ParticleArchive1Def.anInt4028), (long) i_0);
				ParticleArchive1Def.aClass345Array4025[++ParticleArchive1Def.anInt4028 - 1] = class345_2;
			}

			ParticleArchive1Def.aClass229_4031.put(class345_2, (long) i_0);
			return class345_2;
		}
	}

	static final void method7066(int i_0, int i_1, int i_2, int i_3) {
		for (EntityNode_Sub6 class275_sub6_7 = (EntityNode_Sub6) client.aClass457_7335.method7659(); class275_sub6_7 != null; class275_sub6_7 = (EntityNode_Sub6) client.aClass457_7335.method7650((byte) 39)) {
			if (client.cycles >= class275_sub6_7.anInt7858) {
				class275_sub6_7.method4887();
			} else {
				Class407.method6871(class275_sub6_7.anInt7857, (class275_sub6_7.anInt7859 << 9) + 256, (class275_sub6_7.anInt7854 << 9) + 256, class275_sub6_7.anInt7855 * 2, -1994365952);
				Class285.aFontRenderer_3394.method360(class275_sub6_7.aString7860, (int) ((float) i_0 + client.aFloatArray7292[0]), (int) ((float) i_1 + client.aFloatArray7292[1]), ~0xffffff | class275_sub6_7.anInt7856, 0);
			}
		}

	}

}
