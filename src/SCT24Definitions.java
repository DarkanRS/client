public class SCT24Definitions {

	public char aChar5431;

	void method7485(RsByteBuffer rsbytebuffer_1, int i_2) {
		if (i_2 == 1) {
			this.aChar5431 = Utils.cp1252ToChar(rsbytebuffer_1.readByte());
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
			if (Class448.anInt5430 < Class485.WORLD_LIST_START) {
				Class448.anInt5430 = Class485.WORLD_LIST_START;
			}

			while (true) {
				while (Class448.anInt5430 < Class244.WORLD_LIST_SIZEPLUS1) {
					WorldDescriptor class217_sub1_1 = ObjectIndexLoader.method7916(Class448.anInt5430, 1398054526);
					if (class217_sub1_1 != null && class217_sub1_1.anInt7978 == -1) {
						if (Class448.aClass510_5423 == null) {
							Class448.aClass510_5423 = client.aClass508_7223.method8729(class217_sub1_1.ipAddress, (short) -905);
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
