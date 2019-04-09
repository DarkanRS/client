public class StructIndexLoader {

	static int anInt5015;
	Index aClass317_5014;
	int anInt5013;
	Class282_Sub50_Sub4[] aClass282_Sub50_Sub4Array5012;

	public Class282_Sub50_Sub4 getStruct(int i_1, int i_2) {
		return i_1 < 0 ? new Class282_Sub50_Sub4() : this.aClass282_Sub50_Sub4Array5012[i_1];
	}

	public StructIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_5014 = index_3;
		this.anInt5013 = this.aClass317_5014.filesCount(SharedConfigsType.STRUCTS.id);
		this.aClass282_Sub50_Sub4Array5012 = new Class282_Sub50_Sub4[this.anInt5013];

		for (int i_5 = 0; i_5 < this.anInt5013; i_5++) {
			Index index_7 = this.aClass317_5014;
			byte[] bytes_6;
			synchronized (this.aClass317_5014) {
				bytes_6 = this.aClass317_5014.getFile(SharedConfigsType.STRUCTS.id, i_5);
			}

			Class282_Sub50_Sub4 class282_sub50_sub4_9 = new Class282_Sub50_Sub4();
			if (bytes_6 != null) {
				class282_sub50_sub4_9.method14748(new RsByteBuffer(bytes_6));
			}

			this.aClass282_Sub50_Sub4Array5012[i_5] = class282_sub50_sub4_9;
		}

	}

	static final void method7039(byte b_0) {
		Class328.aClass118Array3772 = null;
		RenderAnimIndexLoader.method3629(client.anInt7349, 0, 0, Class349.anInt4083, client.anInt3243 * -969250379, 0, 0, -1, -1848011733);
		if (Class328.aClass118Array3772 != null) {
			IComponentDefinitions[] arr_1 = Class328.aClass118Array3772;
			int i_2 = -1412584499;
			byte b_3 = 0;
			byte b_4 = 0;
			int i_5 = Class349.anInt4083;
			int i_6 = client.anInt3243 * -969250379;
			int i_7 = Class400.anInt4822;
			int i_8 = IsaacCipher.anInt5157;
			int i_9;
			if (client.aClass118_7247 == Class221.aClass118_2763) {
				i_9 = -1;
			} else {
				i_9 = client.aClass118_7247.anInt1449;
			}

			GroundDecoration.method16094(arr_1, i_2, b_3, b_4, i_5, i_6, i_7, i_8, i_9, true);
			Class328.aClass118Array3772 = null;
		}

	}

}
