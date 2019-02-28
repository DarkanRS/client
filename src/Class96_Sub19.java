public class Class96_Sub19 extends Class96 {

	int anInt9403;
	int anInt9404;
	int anInt9402;
	int anInt9407;
	int anInt9408;
	int anInt9400;
	int anInt9401;
	int anInt9410;
	int anInt9405;
	int anInt9413;
	int anInt9409;
	int anInt9412;
	int anInt9399;

	public void method1592(int i_1) {
		int i_2;
		int i_3;
		int i_4;
		if (this.anInt9403 >= 0) {
			i_2 = this.anInt9403 * 512 + 256;
			i_3 = this.anInt9404 * 512 + 256;
			i_4 = this.anInt9401;
		} else {
			Animable animable_9 = Class82.aClass75Array804[this.anInt9402].method1342((byte) 70);
			Vector3 vector3_10 = animable_9.method11166().aClass385_3595;
			i_2 = (int) vector3_10.x;
			i_3 = (int) vector3_10.z;
			i_4 = animable_9.plane;
		}

		int i_5;
		int i_6;
		if (this.anInt9404 >= 0) {
			i_5 = this.anInt9407 * 512 + 256;
			i_6 = this.anInt9408 * 512 + 256;
		} else {
			Animable animable_11 = Class82.aClass75Array804[this.anInt9400].method1342((byte) 21);
			Vector3 vector3_8 = animable_11.method11166().aClass385_3595;
			i_5 = (int) vector3_8.x;
			i_6 = (int) vector3_8.z;
			if (i_4 < 0) {
				i_4 = animable_11.plane;
			}
		}

		int i_7 = this.anInt9399 << 2;
		Class521_Sub1_Sub1_Sub3 class521_sub1_sub1_sub3_12 = new Class521_Sub1_Sub1_Sub3(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1436448746), this.anInt9410, i_4, i_4, i_2, i_3, this.anInt9405 << 2, client.cycles, this.anInt9409 + client.cycles, this.anInt9412, i_7, this.anInt9402 + 1, this.anInt9400 + 1, this.anInt9413 << 2, false, 0);
		class521_sub1_sub1_sub3_12.method15904(i_5, i_6, this.anInt9413 << 2, this.anInt9409 + client.cycles, -209443166);
		client.aClass482_7333.append(new Class282_Sub50_Sub16(class521_sub1_sub1_sub3_12), 1701018076);
	}

	public void method1601() {
		int i_1;
		int i_2;
		int i_3;
		if (this.anInt9403 * -895580983 * 1708709241 >= 0) {
			i_1 = -1314196992 * this.anInt9403 * -895580983 + 256;
			i_2 = 256 + 1197836800 * this.anInt9404 * -943784947;
			i_3 = 1713842129 * this.anInt9401 * 1723109681;
		} else {
			Animable animable_8 = Class82.aClass75Array804[-772738915 * this.anInt9402 * -37939787].method1342((byte) 45);
			Vector3 vector3_9 = animable_8.method11166().aClass385_3595;
			i_1 = (int) vector3_9.x;
			i_2 = (int) vector3_9.z;
			i_3 = animable_8.plane;
		}

		int i_4;
		int i_5;
		if (this.anInt9404 * -943784947 * -316427579 >= 0) {
			i_4 = this.anInt9407 * -1660550435 * -875894272 + 256;
			i_5 = this.anInt9408 * 11223535 * -2078663168 + 256;
		} else {
			Animable animable_10 = Class82.aClass75Array804[this.anInt9400 * 857868507 * 1060287315].method1342((byte) 42);
			Vector3 vector3_7 = animable_10.method11166().aClass385_3595;
			i_4 = (int) vector3_7.x;
			i_5 = (int) vector3_7.z;
			if (i_3 < 0) {
				i_3 = animable_10.plane;
			}
		}

		int i_6 = -716833811 * this.anInt9399 * 2139724261 << 2;
		Class521_Sub1_Sub1_Sub3 class521_sub1_sub1_sub3_11 = new Class521_Sub1_Sub1_Sub3(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-2009786094), this.anInt9410 * 2035189521 * 899631601, i_3, i_3, i_1, i_2, this.anInt9405 * 2127134041 * -1118504215 << 2, client.cycles * 1968179203 * -1809259861, -1809259861 * client.cycles * 1968179203 + this.anInt9409 * -229470439 * -511484631, this.anInt9412 * -1446164009 * 1829419495, i_6, 1 + this.anInt9402 * -37939787 * -772738915, this.anInt9400 * 857868507 * 1060287315 + 1, -209777139 * this.anInt9413 * 885452997 << 2, false, 0);
		class521_sub1_sub1_sub3_11.method15904(i_4, i_5, -209777139 * this.anInt9413 * 885452997 << 2, -511484631 * this.anInt9409 * -229470439 + client.cycles * 1968179203 * -1809259861, -209443166);
		client.aClass482_7333.append(new Class282_Sub50_Sub16(class521_sub1_sub1_sub3_11), -1862724150);
	}

	boolean method1599(int i_1) {
		SpotAnimDefinitions spotanimdefinitions_2 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(this.anInt9410, (byte) 46);
		boolean bool_3 = spotanimdefinitions_2.method11230(-583697397);
		AnimationDefinitions animationdefinitions_4 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(spotanimdefinitions_2.animationId, (byte) 7);
		bool_3 &= animationdefinitions_4.ready();
		return bool_3;
	}

	Class96_Sub19(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		super(rsbytebuffer_1);
		int i_4;
		if (i_2 == 0) {
			i_4 = rsbytebuffer_1.readInt();
			this.anInt9403 = i_4 >>> 16;
			this.anInt9404 = i_4 & 0xffff;
			this.anInt9402 = -1;
		} else {
			this.anInt9403 = -1;
			this.anInt9404 = -1;
			this.anInt9402 = rsbytebuffer_1.readUnsignedShort();
		}

		if (i_3 == 0) {
			i_4 = rsbytebuffer_1.readInt();
			this.anInt9407 = i_4 >>> 16;
			this.anInt9408 = i_4 & 0xffff;
			this.anInt9400 = -1;
		} else {
			this.anInt9407 = -1;
			this.anInt9408 = -1;
			this.anInt9400 = rsbytebuffer_1.readUnsignedShort();
		}

		if (i_2 == 0 && i_3 == 0) {
			this.anInt9401 = rsbytebuffer_1.readUnsignedByte();
		} else {
			this.anInt9401 = -1;
		}

		this.anInt9410 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9405 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9413 = rsbytebuffer_1.readUnsignedByte();
		this.anInt9409 = rsbytebuffer_1.read24BitUnsignedInteger();
		this.anInt9412 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9399 = rsbytebuffer_1.readUnsignedByte();
	}

	public static final void method14665(String string_0, int i_1) {
		if (string_0 != null) {
			String string_2 = Class383.method6515(string_0, 1942118537);
			if (string_2 != null) {
				for (int i_3 = 0; i_3 < client.anInt7373; i_3++) {
					Class10 class10_4 = client.aClass10Array7456[i_3];
					String string_5 = class10_4.aString115;
					String string_6 = Class383.method6515(string_5, 1942118537);
					if (Class159.method2734(string_0, string_2, string_5, string_6, (byte) -110)) {
						--client.anInt7373;

						for (int i_7 = i_3; i_7 < client.anInt7373; i_7++) {
							client.aClass10Array7456[i_7] = client.aClass10Array7456[i_7 + 1];
						}

						client.anInt7386 = client.anInt7347;
						Class184 class184_9 = Class468_Sub20.method12807(-1089718324);
						TCPMessage tcpmessage_8 = Class271.method4828(OutgoingPacket.aClass379_4561, class184_9.isaac, 1422272717);
						tcpmessage_8.buffer.writeByte(ChatLine.getLength(string_0));
						tcpmessage_8.buffer.writeString(string_0);
						class184_9.method3049(tcpmessage_8, 1742869197);
						break;
					}
				}
			}
		}

	}

	public static void method14666(String string_0, boolean bool_1, int i_2, String string_3, int i_4) {
		Class215.method3673(string_0, bool_1, i_2, -1, string_3, true, -857703512);
	}

	static final void method14667(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = client.anInt7300;
	}

}
