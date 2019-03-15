public class Class449 {

	public char aChar5431;

	void method7485(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.aChar5431 = Class11.getChar(rsbytebuffer_1.readByte(), -232268203);
		}

	}

	void method7487(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7485(rsbytebuffer_1, i_3);
		}
	}

	public static void method7490() {
		if (Class448.aBool5419) {
			if (Class448.anInt5430 < Class485.anInt5740) {
				Class448.anInt5430 = Class485.anInt5740;
			}

			while (true) {
				while (Class448.anInt5430 < Class244.anInt3003) {
					Class217_Sub1 class217_sub1_1 = ObjectIndexLoader.method7916(Class448.anInt5430, 1398054526);
					if (class217_sub1_1 != null && class217_sub1_1.anInt7978 == -1) {
						if (Class448.aClass510_5423 == null) {
							Class448.aClass510_5423 = client.aClass508_7223.method8729(class217_sub1_1.aString7976, (short) -905);
						}

						int i_2 = Class448.aClass510_5423.anInt5872;
						if (i_2 == -1) {
							return;
						}

						class217_sub1_1.anInt7978 = i_2;
						++Class448.anInt5430;
						Class448.aClass510_5423 = null;
					} else {
						++Class448.anInt5430;
					}
				}

				return;
			}
		}
	}

}
