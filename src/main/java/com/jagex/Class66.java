package com.jagex;

public class Class66 {

	LRUCache aClass229_674 = new LRUCache(256);
	HardwareRenderer aGraphicalRenderer_Sub2_676;
	ImageLoader anInterface22_675;

	Class66(HardwareRenderer class505_sub2_1, ImageLoader interface22_2) {
		aGraphicalRenderer_Sub2_676 = class505_sub2_1;
		anInterface22_675 = interface22_2;
	}

	Interface6 method1277(int i_1, int i_2) {
		int i_21 = i_2;
		long long_3 = i_21 << 16 | i_1;
		Object object_5 = aClass229_674.get(long_3);
		if (object_5 != null)
			return (Interface6) object_5;
		if (!anInterface22_675.loadTexture(i_1))
			return null;
		else {
			TextureDetails class169_6 = anInterface22_675.getTextureDetails(i_1);
			if (i_21 == -1)
				i_21 = class169_6.isHalfSize ? 64 : aGraphicalRenderer_Sub2_676.anInt8821;

			Interface6 interface6_7;
			if (class169_6.hdr && aGraphicalRenderer_Sub2_676.method8471()) {
				float[] floats_9 = anInterface22_675.renderMaterialPixelsF(i_1, i_21, i_21);
				interface6_7 = aGraphicalRenderer_Sub2_676.method13958(Class150.aClass150_1949, i_21, i_21, floats_9);
			} else {
				int[] ints_8;
				if (class169_6.blendType != 2 && Node_Sub41.method13367(class169_6.effectId))
					ints_8 = anInterface22_675.renderTexturePixels(i_1, 0.7F, i_21, i_21, true);
				else
					ints_8 = anInterface22_675.renderMaterialPixelsI(i_1, i_21, i_21);

				interface6_7 = aGraphicalRenderer_Sub2_676.method14024(i_21, i_21, true, ints_8);
			}

			interface6_7.method50(class169_6.repeatS, class169_6.repeatT);
			aClass229_674.put(interface6_7, long_3);
			return interface6_7;
		}
	}

	void method1278() {
		aClass229_674.method3858(5);
	}

	void method1279() {
		aClass229_674.method3859();
	}

	Interface6 method1283(int i_1) {
		return method1277(i_1, -1);
	}

}
