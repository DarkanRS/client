package com.jagex;

public class ParamDefinitions {

	public static NativeSprite aNativeSprite_5339;
	public int defaultInt;
	public boolean autoDisable = true;
	public String typeName;
	char typeChar;

	static void method7323() {
		if (Renderers.CURRENT_RENDERER != null) {
			IndexLoaders.MAP_REGION_DECODER.method4444();
			QuickchatFiller.method1139();
			Class76.method1361();
			Defaults8Loader.method11156();
			IndexLoaders.MAP_REGION_DECODER.method4446();
			WorldDescriptor.method13056();
			Class356.method6227(false);
			GroundItemStrategy.method13413();
			Class122.method2111(true);
			ParticleProducerDefinition.method1160();
			Class386.method6673();
			int i_1;
			HintTrail class281_10000;
			for (i_1 = 0; i_1 < client.HINT_TRAILS.length; i_1++) 
				class281_10000 = client.HINT_TRAILS[i_1];
			int i_3;
			for (i_1 = 0; i_1 < 2048; i_1++) {
				PlayerEntity player_2 = client.PLAYER_LIST[i_1];
				if (player_2 != null)
					for (i_3 = 0; i_3 < player_2.aMeshRasterizerArray10372.length; i_3++)
						player_2.aMeshRasterizerArray10372[i_3] = null;
			}
			for (i_1 = 0; i_1 < client.anInt7210; i_1++) {
				NPCEntity npc_4 = (NPCEntity) client.NPC_ARRAY[i_1].anObject8068;
				if (npc_4 != null)
					for (i_3 = 0; i_3 < npc_4.aMeshRasterizerArray10372.length; i_3++)
						npc_4.aMeshRasterizerArray10372[i_3] = null;
			}
			client.aClass465_7334.method7749();
			Renderers.CURRENT_RENDERER.method8396();
			Renderers.CURRENT_RENDERER = null;
		}
	}

	void method7315(ByteBuf rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0)
				return;
			method7316(rsbytebuffer_1, i_3);
		}
	}

	void method7316(ByteBuf buffer, int i_2) {
		if (i_2 == 1)
			typeChar = Utils.cp1252ToChar(buffer.readByte());
		else if (i_2 == 2)
			defaultInt = buffer.readInt();
		else if (i_2 == 4)
			autoDisable = false;
		else if (i_2 == 5)
			typeName = buffer.readString();
	}

	public boolean isString() {
		return typeChar == 's';
	}
}
