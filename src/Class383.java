import java.awt.Dimension;

public class Class383 implements Interface41 {

	static int anInt4664;

	Index aClass317_4663;

	String aString4662;

	public Class445 method234() {
		return Class445.aClass445_5380;
	}

	public int getCompletion() {
		return this.aClass317_4663.method5628(this.aString4662) ? 100 : 0;
	}

	Class383(Index index_1) {
		this.aClass317_4663 = index_1;
		this.aString4662 = "huffman";
	}

	public int method231() {
		return this.aClass317_4663.method5628(this.aString4662) ? 100 : 0;
	}

	public Class445 method235() {
		return Class445.aClass445_5380;
	}

	public Class445 method233() {
		return Class445.aClass445_5380;
	}

	public Class445 method230() {
		return Class445.aClass445_5380;
	}

	public Class445 method232() {
		return Class445.aClass445_5380;
	}

	public static Class268 method6509(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5) {
		if (Class393.preferences.aPreference_Sub13_8225.method12714() != 0 && i_1 != 0 && Class260.anInt3219 < 50 && i_0 != -1) {
			Class268 class268_7 = new Class268((byte) 1, i_0, i_1, i_2, i_3, i_4, i_5, (Transform_Sub1) null);
			Class260.aClass268Array3232[++Class260.anInt3219 - 1] = class268_7;
			return class268_7;
		} else {
			return null;
		}
	}

	public static void method6511() {
		for (Node_Sub37 class282_sub37_1 = (Node_Sub37) Class492.aClass465_5774.method7750(76127195); class282_sub37_1 != null; class282_sub37_1 = (Node_Sub37) Class492.aClass465_5774.method7751((byte) 48)) {
			if (!class282_sub37_1.aBool7996) {
				Class92.method1563(class282_sub37_1.anInt7999);
			} else {
				class282_sub37_1.aBool7996 = false;
			}
		}
	}

	static Class350 method6512(RsByteBuffer rsbytebuffer_0) {
		Class356 class356_2 = Class350_Sub3_Sub1.method15558(-535190719)[rsbytebuffer_0.readUnsignedByte()];
		Class353 class353_3 = AccountCreationResponseOpcodes.method8155()[rsbytebuffer_0.readUnsignedByte()];
		int i_4 = rsbytebuffer_0.readShort();
		int i_5 = rsbytebuffer_0.readShort();
		int i_6 = rsbytebuffer_0.readUnsignedShort();
		int i_7 = rsbytebuffer_0.readUnsignedShort();
		int i_8 = rsbytebuffer_0.readShort();
		int i_9 = rsbytebuffer_0.readBigSmart();
		int i_10 = rsbytebuffer_0.readInt();
		return new Class350(class356_2, class353_3, i_4, i_5, i_6, i_7, i_8, i_9, i_10);
	}

	public static int method6513(int i_0, int i_1, int i_2) {
		if (QuickchatFiller.ENTITY_DEFAULTS.profilingModel == -1) {
			return 1;
		} else {
			if (i_0 != Class393.preferences.currentToolkit.getValue(-408744518)) {
				Class231.method3914(i_0, Message.PROFILING.translate(Class223.CURRENT_LANGUAGE, -1872391356), true, (byte) 110);
				if (Class393.preferences.currentToolkit.getValue(-455278899) != i_0) {
					return -1;
				}
			}
			try {
				Dimension dimension_4 = Class351.gameCanvas.getSize();
				Class446.method7447(Message.PROFILING.translate(Class223.CURRENT_LANGUAGE, -1923061831), true, Renderers.SOFTWARE_RENDERER, Class16.aFontRenderer_144, Class16.aClass414_139, (byte) -8);
				RSMesh rsmesh_5 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, QuickchatFiller.ENTITY_DEFAULTS.profilingModel);
				long long_6 = TextureDetails.time();
				Renderers.SOFTWARE_RENDERER.L();
				client.aClass294_7457.method5223(0.0F, 256.0F, 0.0F);
				Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
				Matrix44Arr matrix44arr_8 = Renderers.SOFTWARE_RENDERER.method8449();
				matrix44arr_8.method6531((float) (dimension_4.width / 2), (float) (dimension_4.height / 2), 512.0F, 512.0F, (float) IndexLoaders.MAP_REGION_DECODER.method4544(1468645069), (float) IndexLoaders.MAP_REGION_DECODER.method4522(-1126120958), (float) dimension_4.width, (float) dimension_4.height);
				Renderers.SOFTWARE_RENDERER.method8424(matrix44arr_8);
				Renderers.SOFTWARE_RENDERER.IA(1.0F);
				Renderers.SOFTWARE_RENDERER.m(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
				MeshRasterizer meshrasterizer_9 = Renderers.SOFTWARE_RENDERER.createMeshRasterizer(rsmesh_5, 2048, 64, 64, 768);
				int i_10 = 0;
				label43: for (int i_11 = 0; i_11 < 500; i_11++) {
					Renderers.SOFTWARE_RENDERER.ba(3, 0);
					for (int i_12 = 15; i_12 >= 0; --i_12) {
						for (int i_13 = 0; i_13 <= i_12; i_13++) {
							client.aClass294_7169.method5223((float) ((int) (512.0F * ((float) i_13 - (float) i_12 / 2.0F))), 0.0F, (float) ((i_12 + 1) * 512));
							meshrasterizer_9.method11282(client.aClass294_7169, (EntityNode_Sub5) null, 0);
							++i_10;
							if (TextureDetails.time() - long_6 >= (long) i_1) {
								break label43;
							}
						}
					}
				}
				Renderers.SOFTWARE_RENDERER.method8395();
				long long_14 = (long) (i_10 * 1000) / (TextureDetails.time() - long_6);
				Renderers.SOFTWARE_RENDERER.ba(3, 0);
				int i_3 = (int) long_14;
				return i_3;
			} catch (Throwable throwable_16) {
				throwable_16.printStackTrace();
				return -1;
			}
		}
	}

	static final void method6514(int i_0, int i_1, int i_2) {
		if (MovingAnimation.isInterfaceLoaded(i_0, (int[]) null, -1336109157)) {
			Class151.method2591(Preference_Sub8.INTERFACES[i_0].components, i_1, (byte) -17);
		}
	}

	public static String method6515(CharSequence charsequence_0) {
		return KeyPressInputSubscriber.method3754(charsequence_0, (Class413) null);
	}
}
