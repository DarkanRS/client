package com.jagex;

import com.jagex.clans.settings.ClanSettings;

public class ClanSettingsDelta {

	public static void method6175(boolean bool_0) {
		if (bool_0) {
			if (client.BASE_WINDOW_ID != -1)
				Class337.unloadInterface(client.BASE_WINDOW_ID);
			for (SubInterface class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7750(); class282_sub44_2 != null; class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7751()) {
				if (!class282_sub44_2.linked()) {
					class282_sub44_2 = (SubInterface) client.OPEN_INTERFACES.method7750();
					if (class282_sub44_2 == null)
						break;
				}
				Class351.closeChildren(class282_sub44_2, true, false);
			}
			client.BASE_WINDOW_ID = -1;
			client.OPEN_INTERFACES = new IterableNodeMap(8);
			MeshModifier.method7041();
			client.BASE_WINDOW_ID = QuickchatFiller.ENTITY_DEFAULTS.loginWindow;
			Class516.method8867(false);
			Static.method6378();
			Class150.method2582(client.BASE_WINDOW_ID, null);
		}
		BloomPreference.method12708();
		Class9.aBool71 = false;
		CS2ReturnValue.method8739();
		client.anInt7427 = -1;
		UnderlayIndexLoader.method8036(client.anInt7340);
		VertexNormal.MY_PLAYER = new PlayerEntity(null);
		VertexNormal.MY_PLAYER.method11172((IndexLoaders.MAP_REGION_DECODER.getSizeX() * 512 / 2), 0.0F, (IndexLoaders.MAP_REGION_DECODER.getSizeY() * 512 / 2));
		VertexNormal.MY_PLAYER.regionBaseX[0] = IndexLoaders.MAP_REGION_DECODER.getSizeX() / 2;
		VertexNormal.MY_PLAYER.regionBaseY[0] = IndexLoaders.MAP_REGION_DECODER.getSizeY() / 2;
		Class246.CAM_MOVE_ABSOLUTEY = 0;
		IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = 0;
		if (NativeLibraryLoader.anInt3240 == 5) {
			IdentiKitIndexLoader.CAM_MOVE_ABSOLUTEX = Class296.CAM_MOVE_LOCALX << 9;
			Class246.CAM_MOVE_ABSOLUTEY = SubInterface.CAM_MOVE_LOCALY << 9;
		} else
			SpotAnimIndexLoader.method8860();
		IndexLoaders.MAP_REGION_DECODER.method4435().method4048();
	}

	static boolean method6176(int i_0) {
		return i_0 == 44 || i_0 == 45 || i_0 == 46 || i_0 == 47 || i_0 == 48 || i_0 == 49 || i_0 == 50 || i_0 == 51 || i_0 == 52 || i_0 == 53 || i_0 == 15;
	}

	long unusedZero;

	int updateCount = -1;

	NodeCollection<ClanSettingDeltaUpdate> updateNodes = new NodeCollection<>();

	public ClanSettingsDelta(ByteBuf rsbytebuffer_1) {
		decode(rsbytebuffer_1);
	}

	public void applyUpdates(ClanSettings originalSetting) {
		if ((originalSetting.aLong631 != unusedZero) || (updateCount != originalSetting.updateCount))
			throw new RuntimeException("");
		for (ClanSettingDeltaUpdate update = (ClanSettingDeltaUpdate) updateNodes.head(); update != null; update = (ClanSettingDeltaUpdate) updateNodes.next())
			update.applyUpdate(originalSetting);
		++originalSetting.updateCount;
	}

	//details
	void decode(ByteBuf stream) {
		unusedZero = stream.readLong();
		updateCount = stream.readInt();
		for (int updateType = stream.readUnsignedByte(); updateType != 0; updateType = stream.readUnsignedByte()) {
			ClanSettingDeltaUpdate updateNode;
			if (updateType == 3)
				updateNode = new Node_Sub17_Sub10(this);
			else if (updateType == 1)
				updateNode = new Node_Sub17_Sub1(this);
			else if (updateType == 13)
				updateNode = new Node_Sub17_Sub9(this);
			else if (updateType == 4)
				updateNode = new Node_Sub17_Sub6(this);
			else if (updateType == 6)
				updateNode = new Node_Sub17_Sub8(this);
			else if (updateType == 5)
				updateNode = new Node_Sub17_Sub2(this);
			else if (updateType == 2)
				updateNode = new Node_Sub17_Sub7(this);
			else if (updateType == 7)
				updateNode = new Node_Sub17_Sub12(this);
			else if (updateType == 8)
				updateNode = new Node_Sub17_Sub13(this);
			else if (updateType == 9)
				updateNode = new Node_Sub17_Sub11(this);
			else if (updateType == 10)
				updateNode = new Node_Sub17_Sub5(this);
			else if (updateType == 11)
				updateNode = new Node_Sub17_Sub4(this);
			else {
				if (updateType != 12)
					throw new RuntimeException("");
				updateNode = new Node_Sub17_Sub3(this);
			}
			updateNode.decode(stream);
			updateNodes.append(updateNode);
		}
	}
}
