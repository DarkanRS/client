package com.jagex;
public class CacheableNode_Sub15 extends CacheableNode {

	String aString9771;
	Queue aClass477_9770;
	int anInt9769;

	int method15244(byte b_1) {
		return this.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119 != this.aClass477_9770.aCacheableNode_5629 ? ((CacheableNode_Sub7) this.aClass477_9770.aCacheableNode_5629.aCacheableNode_8119).clickType : -1;
	}

	CacheableNode_Sub15(String string_1) {
		this.aString9771 = string_1;
		this.aClass477_9770 = new Queue();
	}

	boolean method15245(CacheableNode_Sub7 class282_sub50_sub7_1) {
		boolean bool_3 = true;
		class282_sub50_sub7_1.method13452();

		for (CacheableNode_Sub7 class282_sub50_sub7_4 = (CacheableNode_Sub7) this.aClass477_9770.method7941(); class282_sub50_sub7_4 != null; bool_3 = false) {
			if (Class301.method5334(class282_sub50_sub7_1.clickType, class282_sub50_sub7_4.clickType, 82678317)) {
				Defaults7Loader.method8751(class282_sub50_sub7_1, class282_sub50_sub7_4);
				++this.anInt9769;
				return !bool_3;
			}

			class282_sub50_sub7_4 = (CacheableNode_Sub7) this.aClass477_9770.method7955(466135695);
		}

		this.aClass477_9770.method7936(class282_sub50_sub7_1);
		++this.anInt9769;
		return bool_3;
	}

	boolean method15249(CacheableNode_Sub7 class282_sub50_sub7_1, byte b_2) {
		int i_3 = this.method15244((byte) 112);
		class282_sub50_sub7_1.method13452();
		--this.anInt9769;
		if (this.anInt9769 == 0) {
			this.remove();
			this.method13452();
			--Class20.anInt170;
			Class20.aClass229_164.put(this, class282_sub50_sub7_1.aLong9580);
			return false;
		} else {
			return i_3 != this.method15244((byte) 109);
		}
	}

}
