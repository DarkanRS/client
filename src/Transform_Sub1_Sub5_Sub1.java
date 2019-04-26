import java.io.IOException;

public class Transform_Sub1_Sub5_Sub1 extends Transform_Sub1_Sub5 implements SceneObject {

	static int anInt10526;
	static Class194 aClass194_10527;
	static int[] anIntArray10522 = new int[] { 1, 2, 4, 8 };
	static int[] anIntArray10518 = new int[] { 16, 32, 64, 128 };
	Shadow aCacheableNode_Sub17_10517;
	Class200 aClass200_10519;
	boolean aBool10524;
	ObjectIndexLoader aClass474_10515;
	int anInt10514;
	boolean aBool10525;
	byte aByte10521;
	byte aByte10520;
	boolean aBool10523;
	boolean aBool10516;
	MeshRasterizer aMeshRasterizer_10513;

	public void method88(GraphicalRenderer graphicalrenderer_1) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (this.aCacheableNode_Sub17_10517 == null && this.aBool10516) {
			Class452 class452_5 = this.method16101(graphicalrenderer_1, 262144, true, -306749899);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = this.aCacheableNode_Sub17_10517;
			this.aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_6 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_4 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_4, this.collisionPlane, (int) vector3_6.x, (int) vector3_6.z, (boolean[]) null, (byte) -17);
		}

	}

	boolean method12986(int i_1) {
		return this.aMeshRasterizer_10513 != null ? !this.aMeshRasterizer_10513.u() : true;
	}

	Class452 method16101(GraphicalRenderer graphicalrenderer_1, int i_2, boolean bool_3, int i_4) {
		ObjectDefinitions objectdefinitions_5 = this.aClass474_10515.getObjectDefinitions(this.anInt10514);
		Ground class390_6;
		Ground class390_7;
		if (this.aBool10525) {
			class390_6 = this.aClass206_7970.aGroundArray2614[this.collisionPlane];
			class390_7 = this.aClass206_7970.aGroundArray2607[0];
		} else {
			class390_6 = this.aClass206_7970.aGroundArray2607[this.collisionPlane];
			if (this.collisionPlane < 3) {
				class390_7 = this.aClass206_7970.aGroundArray2607[this.collisionPlane + 1];
			} else {
				class390_7 = null;
			}
		}

		Vector3 vector3_8 = this.method11166().aClass385_3595;
		return objectdefinitions_5.method8010(graphicalrenderer_1, i_2, this.aByte10521, this.aByte10520, class390_6, class390_7, (int) vector3_8.x, (int) vector3_8.y, (int) vector3_8.z, bool_3, (Class476) null, 1259203877);
	}

	public void method83(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10517 == null && this.aBool10516) {
			Class452 class452_4 = this.method16101(graphicalrenderer_1, 262144, true, -235872372);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10517;
			this.aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_5 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -128);
		}

	}

	MeshRasterizer method16102(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		if (this.aMeshRasterizer_10513 != null && graphicalrenderer_1.method8452(this.aMeshRasterizer_10513.m(), i_2) == 0) {
			return this.aMeshRasterizer_10513;
		} else {
			Class452 class452_4 = this.method16101(graphicalrenderer_1, i_2, false, 1433556866);
			return class452_4 != null ? (MeshRasterizer) class452_4.anObject5443 : null;
		}
	}

	Class285 method12989(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10513 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10523, (byte) -98);
			this.aMeshRasterizer_10513.method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[0], 0);
			return class285_3;
		}
	}

	public Class200 method12992(GraphicalRenderer graphicalrenderer_1, byte b_2) {
		Vector3 vector3_3 = this.method11166().aClass385_3595;
		if (this.aClass200_10519 == null) {
			this.aClass200_10519 = EntityNode_Sub2.method12505((int) vector3_3.x, (int) vector3_3.y, (int) vector3_3.z, this.method16102(graphicalrenderer_1, 0, 2053058474), (byte) 82);
		}

		return this.aClass200_10519;
	}

	public void method85() {
		if (this.aMeshRasterizer_10513 != null) {
			this.aMeshRasterizer_10513.method11259();
		}

	}

	void method12991(GraphicalRenderer graphicalrenderer_1, int i_2) {
	}

	void method13016(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6) {
		if (class521_sub1_2 instanceof Transform_Sub1_Sub5_Sub1) {
			Transform_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_7 = (Transform_Sub1_Sub5_Sub1) class521_sub1_2;
			if (this.aMeshRasterizer_10513 != null && class521_sub1_sub5_sub1_7.aMeshRasterizer_10513 != null) {
				this.aMeshRasterizer_10513.method11269(class521_sub1_sub5_sub1_7.aMeshRasterizer_10513, i_3, i_4, i_5, bool_6);
			}
		} else if (class521_sub1_2 instanceof Transform_Sub1_Sub1_Sub6) {
			Transform_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_8 = (Transform_Sub1_Sub1_Sub6) class521_sub1_2;
			if (this.aMeshRasterizer_10513 != null && class521_sub1_sub1_sub6_8.aMeshRasterizer_10535 != null) {
				this.aMeshRasterizer_10513.method11269(class521_sub1_sub1_sub6_8.aMeshRasterizer_10535, i_3, i_4, i_5, bool_6);
			}
		}

	}

	boolean method12985(int i_1) {
		return this.aBool10524;
	}

	public void method93(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10517 == null && this.aBool10516) {
			Class452 class452_4 = this.method16101(graphicalrenderer_1, 262144, true, 1179408975);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10517;
			this.aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_5 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) -90);
		}

	}

	void method12984(int i_1) {
		this.aBool10524 = false;
		if (this.aMeshRasterizer_10513 != null) {
			this.aMeshRasterizer_10513.KA(this.aMeshRasterizer_10513.m() & ~0x10000);
		}

	}

	public int getId(int i_1) {
		return this.anInt10514;
	}

	public int method89(int i_1) {
		return this.aByte10521;
	}

	public int method92(int i_1) {
		return this.aByte10520;
	}

	public int method13006() {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.YA() : 0;
	}

	public boolean method86(int i_1) {
		return this.aBool10516;
	}

	public void method87(GraphicalRenderer graphicalrenderer_1) {
		Object obj_3 = null;
		Shadow class282_sub50_sub17_4;
		if (this.aCacheableNode_Sub17_10517 == null && this.aBool10516) {
			Class452 class452_5 = this.method16101(graphicalrenderer_1, 262144, true, 1228305596);
			class282_sub50_sub17_4 = (Shadow) (class452_5 != null ? class452_5.anObject5444 : null);
		} else {
			class282_sub50_sub17_4 = this.aCacheableNode_Sub17_10517;
			this.aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_6 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_4 != null) {
			this.aClass206_7970.method3426(class282_sub50_sub17_4, this.collisionPlane, (int) vector3_6.x, (int) vector3_6.z, (boolean[]) null, (byte) -39);
		}

	}

	boolean method12999() {
		return this.aMeshRasterizer_10513 != null ? !this.aMeshRasterizer_10513.u() : true;
	}

	public int method76() {
		return this.anInt10514 * 1466066887 * -585553417;
	}

	public int method39() {
		return this.anInt10514 * 1466066887 * -585553417;
	}

	public int method73() {
		return this.aByte10521;
	}

	public int method77() {
		return this.aByte10521;
	}

	void method13023(GraphicalRenderer graphicalrenderer_1) {
	}

	public void method38() {
		if (this.aMeshRasterizer_10513 != null) {
			this.aMeshRasterizer_10513.method11259();
		}

	}

	public void method96() {
		if (this.aMeshRasterizer_10513 != null) {
			this.aMeshRasterizer_10513.method11259();
		}

	}

	public void method90() {
		if (this.aMeshRasterizer_10513 != null) {
			this.aMeshRasterizer_10513.method11259();
		}

	}

	public boolean method94() {
		return this.aBool10516;
	}

	public boolean method95() {
		return this.aBool10516;
	}

	boolean method13000() {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.i() : false;
	}

	public int method91() {
		return this.aByte10520;
	}

	public void method97(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10517 == null && this.aBool10516) {
			Class452 class452_4 = this.method16101(graphicalrenderer_1, 262144, true, -1296082997);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10517;
			this.aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_5 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) 23);
		}

	}

	public void method98(GraphicalRenderer graphicalrenderer_1) {
		Object obj_2 = null;
		Shadow class282_sub50_sub17_3;
		if (this.aCacheableNode_Sub17_10517 == null && this.aBool10516) {
			Class452 class452_4 = this.method16101(graphicalrenderer_1, 262144, true, -195320342);
			class282_sub50_sub17_3 = (Shadow) (class452_4 != null ? class452_4.anObject5444 : null);
		} else {
			class282_sub50_sub17_3 = this.aCacheableNode_Sub17_10517;
			this.aCacheableNode_Sub17_10517 = null;
		}

		Vector3 vector3_5 = this.method11166().aClass385_3595;
		if (class282_sub50_sub17_3 != null) {
			this.aClass206_7970.method3427(class282_sub50_sub17_3, this.collisionPlane, (int) vector3_5.x, (int) vector3_5.z, (boolean[]) null, (byte) 45);
		}

	}

	public Transform_Sub1_Sub5_Sub1(SceneObjectManager sceneobjectmanager_1, GraphicalRenderer graphicalrenderer_2, ObjectIndexLoader objectindexloader_3, ObjectDefinitions objectdefinitions_4, int i_5, int i_6, int i_7, int i_8, int i_9, boolean bool_10, int i_11, int i_12, boolean bool_13) {
		super(sceneobjectmanager_1, i_7, i_8, i_9, i_5, i_6, Class235.method3967(i_11, i_12));
		this.aClass474_10515 = objectindexloader_3;
		this.anInt10514 = objectdefinitions_4.id;
		this.aBool10525 = bool_10;
		this.aByte10521 = (byte) i_11;
		this.aByte10520 = (byte) i_12;
		this.aBool10523 = objectdefinitions_4.interactable != 0 && !bool_10;
		this.aBool10524 = bool_13;
		this.aBool10516 = graphicalrenderer_2.method8402() && objectdefinitions_4.aBool5703 && !this.aBool10525 && Class393.preferences.aPreference_Sub2_8205.method12624((byte) -75) != 0;
		int i_14 = 2048;
		if (this.aBool10524) {
			i_14 |= 0x10000;
		}

		if (objectdefinitions_4.aBool5711) {
			i_14 |= 0x80000;
		}

		Class452 class452_15 = this.method16101(graphicalrenderer_2, i_14, this.aBool10516, -1805031480);
		if (class452_15 != null) {
			this.aMeshRasterizer_10513 = (MeshRasterizer) class452_15.anObject5443;
			this.aCacheableNode_Sub17_10517 = (Shadow) class452_15.anObject5444;
			if (this.aBool10524 || objectdefinitions_4.aBool5711) {
				this.aMeshRasterizer_10513 = this.aMeshRasterizer_10513.method11289((byte) 0, i_14, false);
				if (objectdefinitions_4.aBool5711) {
					Class341 class341_16 = IndexLoaders.MAP_REGION_DECODER.method4426(475600426);
					this.aMeshRasterizer_10513.PA(class341_16.anInt3992, class341_16.anInt3993, class341_16.anInt3994, class341_16.anInt3995);
				}
			}
		}

		this.method13008(1, (byte) -117);
	}

	Class285 method12990(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10513 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_3 = this.method11168();
			Class285 class285_4 = Class470.method7824(this.aBool10523, (byte) -74);
			this.aMeshRasterizer_10513.method11282(matrix44var_3, this.aEntityNode_Sub5Array7965[0], 0);
			return class285_4;
		}
	}

	boolean method13001() {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.i() : false;
	}

	boolean method13002() {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.i() : false;
	}

	public int method13017() {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.YA() : 0;
	}

	public int method13005() {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.YA() : 0;
	}

	void method13013(GraphicalRenderer graphicalrenderer_1, Transform_Sub1 class521_sub1_2, int i_3, int i_4, int i_5, boolean bool_6, int i_7) {
		if (class521_sub1_2 instanceof Transform_Sub1_Sub5_Sub1) {
			Transform_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_8 = (Transform_Sub1_Sub5_Sub1) class521_sub1_2;
			if (this.aMeshRasterizer_10513 != null && class521_sub1_sub5_sub1_8.aMeshRasterizer_10513 != null) {
				this.aMeshRasterizer_10513.method11269(class521_sub1_sub5_sub1_8.aMeshRasterizer_10513, i_3, i_4, i_5, bool_6);
			}
		} else if (class521_sub1_2 instanceof Transform_Sub1_Sub1_Sub6) {
			Transform_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_9 = (Transform_Sub1_Sub1_Sub6) class521_sub1_2;
			if (this.aMeshRasterizer_10513 != null && class521_sub1_sub1_sub6_9.aMeshRasterizer_10535 != null) {
				this.aMeshRasterizer_10513.method11269(class521_sub1_sub1_sub6_9.aMeshRasterizer_10535, i_3, i_4, i_5, bool_6);
			}
		}

	}

	Class285 method13009(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10513 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10523, (byte) -12);
			this.aMeshRasterizer_10513.method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[0], 0);
			return class285_3;
		}
	}

	Class285 method13010(GraphicalRenderer graphicalrenderer_1) {
		if (this.aMeshRasterizer_10513 == null) {
			return null;
		} else {
			Matrix44Var matrix44var_2 = this.method11168();
			Class285 class285_3 = Class470.method7824(this.aBool10523, (byte) -7);
			this.aMeshRasterizer_10513.method11282(matrix44var_2, this.aEntityNode_Sub5Array7965[0], 0);
			return class285_3;
		}
	}

	public int method13003() {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.YA() : 0;
	}

	void method13012(GraphicalRenderer graphicalrenderer_1) {
	}

	boolean method13026() {
		return this.aBool10524;
	}

	boolean method13011() {
		return this.aBool10524;
	}

	public Class200 method13019(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		if (this.aClass200_10519 == null) {
			this.aClass200_10519 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16102(graphicalrenderer_1, 0, 1598187689), (byte) -54);
		}

		return this.aClass200_10519;
	}

	public Class200 method13018(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		if (this.aClass200_10519 == null) {
			this.aClass200_10519 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16102(graphicalrenderer_1, 0, -6951740), (byte) -23);
		}

		return this.aClass200_10519;
	}

	public Class200 method12993(GraphicalRenderer graphicalrenderer_1) {
		Vector3 vector3_2 = this.method11166().aClass385_3595;
		if (this.aClass200_10519 == null) {
			this.aClass200_10519 = EntityNode_Sub2.method12505((int) vector3_2.x, (int) vector3_2.y, (int) vector3_2.z, this.method16102(graphicalrenderer_1, 0, 1171214573), (byte) -10);
		}

		return this.aClass200_10519;
	}

	boolean method13020(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_4 = this.method16102(graphicalrenderer_1, 131072, 67761408);
		if (meshrasterizer_4 != null) {
			Matrix44Var matrix44var_5 = this.method11168();
			return meshrasterizer_4.method11270(i_2, i_3, matrix44var_5, false, 0);
		} else {
			return false;
		}
	}

	void method13021() {
		this.aBool10524 = false;
		if (this.aMeshRasterizer_10513 != null) {
			this.aMeshRasterizer_10513.KA(this.aMeshRasterizer_10513.m() & ~0x10000);
		}

	}

	boolean method12987(int i_1) {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.i() : false;
	}

	public int method12995(int i_1) {
		return this.aMeshRasterizer_10513 != null ? this.aMeshRasterizer_10513.YA() : 0;
	}

	void method13015() {
		this.aBool10524 = false;
		if (this.aMeshRasterizer_10513 != null) {
			this.aMeshRasterizer_10513.KA(this.aMeshRasterizer_10513.m() & ~0x10000);
		}

	}

	boolean method12983(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3) {
		MeshRasterizer meshrasterizer_5 = this.method16102(graphicalrenderer_1, 131072, 1136432980);
		if (meshrasterizer_5 != null) {
			Matrix44Var matrix44var_6 = this.method11168();
			return meshrasterizer_5.method11270(i_2, i_3, matrix44var_6, false, 0);
		} else {
			return false;
		}
	}

	static void handleAccountCreationStart() {
		if (Class192.ACCOUNT_CREATION_STAGE != null) {
			try {
				short s_1;
				if (Class14.anInt134 == 0) {
					s_1 = 250;
				} else {
					s_1 = 2000;
				}

				++Class14.anInt133;
				if (Class14.anInt133 > s_1) {
					Class5.method297(2057502740);
				}

				int i_3;
				if (Class192.ACCOUNT_CREATION_STAGE == AccountCreationStage.REQUEST) {
					client.connectionContext.method3050(SunDefinitions.createAsyncConnection(Class448.lobbyConnectionInfo.createSocket((byte) 121), 15000, 1038176780), Class448.lobbyConnectionInfo.host, (byte) -47);
					client.connectionContext.method3054((short) 8665);
					TCPPacket packet = SkyboxDefinitions.method3558((byte) 87);
					packet.buffer.writeByte(OutgoingLoginPacket.CREATE_ACCOUNT_CONNECT.id);
					packet.buffer.writeShort(0);
					i_3 = packet.buffer.index;
					packet.buffer.writeShort(727);
					packet.buffer.writeShort(1);
					Class14.LOGIN_XTEAS = Class463.method7725(packet);
					int i_4 = packet.buffer.index;
					packet.buffer.writeString(client.aString7164);
					packet.buffer.writeShort(client.anInt7149);
					packet.buffer.writeLong(client.aLong7153);
					packet.buffer.writeString(Class464.aString5555);
					packet.buffer.writeByte(Class223.CURRENT_LANGUAGE.getValue());
					packet.buffer.writeByte(client.CURRENT_GAME.id);
					IdentitiKitIndexLoader.method809(packet.buffer, -1671456029);
					String string_5 = client.aString7156;
					packet.buffer.writeByte(string_5 == null ? 0 : 1);
					if (string_5 != null) {
						packet.buffer.writeString(string_5);
					}

					Class11.SYSTEM_INFO.writeMachineInformation(packet.buffer);
					packet.buffer.index += 7;
					packet.buffer.encryptWithXtea(Class14.LOGIN_XTEAS, i_4, packet.buffer.index);
					packet.buffer.method13281(packet.buffer.index - i_3);
					client.connectionContext.queuePacket(packet);
					client.connectionContext.method3047(557990439);
					Class192.ACCOUNT_CREATION_STAGE = AccountCreationStage.RESPONSE;
				}

				if (AccountCreationStage.RESPONSE == Class192.ACCOUNT_CREATION_STAGE) {
					if (client.connectionContext.getConnection() == null) {
						Class5.method297(2055895853);
					} else if (client.connectionContext.getConnection().available(1)) {
						client.connectionContext.getConnection().read(client.connectionContext.recievedBuffer.buffer, 0, 1);
						CutsceneAction_Sub9.RECIEVED_RESPONSE = (AccountCreationResponseOpcodes) Class386.identify(RSInterface.method1626(), client.connectionContext.recievedBuffer.buffer[0] & 0xff);
						if (AccountCreationResponseOpcodes.CONTINUE != CutsceneAction_Sub9.RECIEVED_RESPONSE) {
							client.connectionContext.method3051((byte) -45);
						} else {
							client.connectionContext.isaac = new IsaacCipher(Class14.LOGIN_XTEAS);
							int[] ints_8 = new int[4];

							for (i_3 = 0; i_3 < 4; i_3++) {
								ints_8[i_3] = Class14.LOGIN_XTEAS[i_3] + 50;
							}

							client.connectionContext.aClass432_2295 = new IsaacCipher(ints_8);
							client.connectionContext.recievedBuffer.setIsaacCipher(client.connectionContext.aClass432_2295, 1577326429);
							Class365.setGameState(3);
							client.connectionContext.method3054((short) -8634);
							client.connectionContext.recievedBuffer.index = 0;
							client.connectionContext.lastPacket = null;
							client.connectionContext.secondLastPacket = null;
							client.connectionContext.thirdLastPacket = null;
							client.connectionContext.idleReadPulses = 0;
						}

						client.connectionContext.currentPacket = null;
						Class192.ACCOUNT_CREATION_STAGE = null;
					}
				}
			} catch (IOException ioexception_7) {
				Class5.method297(1992210840);
			}
		}

	}
}
