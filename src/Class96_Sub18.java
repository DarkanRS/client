import java.util.Arrays;

public class Class96_Sub18 extends Class96 {

	int anInt9395;
	int[] anIntArray9397;
	int anInt9396;
	int anInt9398;

	Class96_Sub18(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9395 = rsbytebuffer_1.readUnsignedShort();
		this.anIntArray9397 = new int[Class8_Sub3.method14339(1886074121).length];
		this.anInt9396 = rsbytebuffer_1.readBigSmart();
		Arrays.fill(this.anIntArray9397, 0, this.anIntArray9397.length, this.anInt9396);
		this.anInt9398 = rsbytebuffer_1.readInt();
	}

	public void method1592(int i_1) {
		Animable animable_2 = Class82.aClass75Array804[this.anInt9395].method1342((byte) 62);
		if (this.anInt9398 == 0) {
			Class20.animate(animable_2, this.anIntArray9397, 0, false, (byte) -103);
		} else {
			Class331.method5923(animable_2, new int[] { this.anInt9396 }, new int[1], new int[] { this.anInt9398 }, 1929963591);
		}

	}

	boolean method1599(int i_1) {
		AnimationDefinitions animationdefinitions_2 = IndexLoaders.ANIMATION_INDEX_LOADER.getAnimDefs(this.anInt9396, (byte) -29);
		return animationdefinitions_2.ready();
	}

	public void method1601() {
		Animable animable_1 = Class82.aClass75Array804[1932395903 * this.anInt9395 * 1548991103].method1342((byte) 78);
		if (1684442377 * this.anInt9398 * 933564729 == 0) {
			Class20.animate(animable_1, this.anIntArray9397, 0, false, (byte) 7);
		} else {
			Class331.method5923(animable_1, new int[] { this.anInt9396 * 185651677 * 1590562421 }, new int[1], new int[] { this.anInt9398 * 933564729 * 1684442377 }, 1894867046);
		}

	}

	static final void method14664(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, boolean bool_2, int i_3, CS2Executor cs2executor_4, byte b_5) {
		cs2executor_4.intStackPtr -= 2;
		int i_6 = cs2executor_4.intStack[cs2executor_4.intStackPtr];
		int i_7 = cs2executor_4.intStack[cs2executor_4.intStackPtr + 1];
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class411.method6914(icomponentdefinitions_0.idHash, (short) 887);
			Class106.method1818(icomponentdefinitions_0.idHash, 209948825);
			Item.method12575(icomponentdefinitions_0.idHash, (byte) 59);
		}

		if (i_6 == -1) {
			icomponentdefinitions_0.anInt1329 = 1;
			icomponentdefinitions_0.anInt1330 = -1;
			icomponentdefinitions_0.anInt1426 = -1;
		} else {
			icomponentdefinitions_0.anInt1426 = i_6;
			icomponentdefinitions_0.anInt1427 = i_7;
			icomponentdefinitions_0.aBool1388 = bool_2;
			ItemDefinitions itemdefinitions_8 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_6, 501470763);
			icomponentdefinitions_0.anInt1385 = itemdefinitions_8.modelRotationX;
			icomponentdefinitions_0.anInt1336 = itemdefinitions_8.modelRotationY;
			icomponentdefinitions_0.anInt1337 = itemdefinitions_8.modelRotationZ;
			icomponentdefinitions_0.anInt1293 = itemdefinitions_8.modelOffsetX;
			icomponentdefinitions_0.anInt1334 = itemdefinitions_8.modelOffsetY;
			icomponentdefinitions_0.anInt1343 = itemdefinitions_8.modelZoom;
			icomponentdefinitions_0.anInt1335 = i_3;
			if (icomponentdefinitions_0.anInt1417 > 0) {
				icomponentdefinitions_0.anInt1343 = icomponentdefinitions_0.anInt1343 * 32 / icomponentdefinitions_0.anInt1417;
			} else if (icomponentdefinitions_0.anInt1297 > 0) {
				icomponentdefinitions_0.anInt1343 = icomponentdefinitions_0.anInt1343 * 32 / icomponentdefinitions_0.anInt1297;
			}
		}

	}

}
