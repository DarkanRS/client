public class Class66 {

	SoftCache aClass229_674 = new SoftCache(256);
	GraphicalRenderer_Sub2 aGraphicalRenderer_Sub2_676;
	Interface22 anInterface22_675;

	Class66(GraphicalRenderer_Sub2 class505_sub2_1, Interface22 interface22_2) {
		this.aGraphicalRenderer_Sub2_676 = class505_sub2_1;
		this.anInterface22_675 = interface22_2;
	}

	Interface6 method1277(int i_1, int i_2) {
		long long_3 = (long) (i_2 << 16 | i_1);
		Object object_5 = this.aClass229_674.get(long_3);
		if (object_5 != null) {
			return (Interface6) object_5;
		} else if (!this.anInterface22_675.method139(i_1, -1820036483)) {
			return null;
		} else {
			TextureDetails class169_6 = this.anInterface22_675.method144(i_1);
			if (i_2 == -1) {
				i_2 = class169_6.isHalfSize ? 64 : this.aGraphicalRenderer_Sub2_676.anInt8821;
			}

			Interface6 interface6_7;
			if (class169_6.hdr && this.aGraphicalRenderer_Sub2_676.method8471()) {
				float[] floats_9 = this.anInterface22_675.method145(i_1, i_2, i_2);
				interface6_7 = this.aGraphicalRenderer_Sub2_676.method13958(Class150.aClass150_1949, i_2, i_2, floats_9);
			} else {
				int[] ints_8;
				if (class169_6.blendType != 2 && Node_Sub41.method13367(class169_6.effectId, (short) 10824)) {
					ints_8 = this.anInterface22_675.method140(i_1, 0.7F, i_2, i_2, true, (byte) 124);
				} else {
					ints_8 = this.anInterface22_675.method141(i_1, i_2, i_2, false, 1385198087);
				}

				interface6_7 = this.aGraphicalRenderer_Sub2_676.method14024(i_2, i_2, true, ints_8);
			}

			interface6_7.method50(class169_6.repeatS, class169_6.repeatT);
			this.aClass229_674.put(interface6_7, long_3);
			return interface6_7;
		}
	}

	void method1278() {
		this.aClass229_674.method3858(5, (byte) -10);
	}

	void method1279() {
		this.aClass229_674.method3859(-906241221);
	}

	Interface6 method1283(int i_1) {
		return this.method1277(i_1, -1);
	}

}
