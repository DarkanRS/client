/* Class403 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class403 {
	public static final long aLong4829 = 94608000L;

	Class403() throws Throwable {
		throw new Error();
	}

	public static Class336 method6801(int i, int i_0_, byte i_1_) {
		Class336 class336 = new Class336();
		class336.anInt3931 = -892178839;
		class336.anInt3964 = 1315713723;
		((Class336) class336).anInt3965 = 260756261 * (5 + (1 + i));
		((Class336) class336).anInt3966 = (5 + (i_0_ + 1)) * 2015661001;
		class336.anIntArrayArray3922 = (new int[((Class336) class336).anInt3965 * -1208414035][((Class336) class336).anInt3966 * 117800569]);
		class336.method5965((byte) 5);
		return class336;
	}

	static final void method6802(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class237.method3987(class118, class98, class527, -669419549);
	}

	public static void method6803(Index interfaceIdx, Index meshIdx, Index spritesIdx, Index fontIdx, int i) {
		Class388.INTERFACE_INDEX = interfaceIdx;
		Class488.MESH_INDEX = meshIdx;
		Class463.SPRITES_INDEX = spritesIdx;
		Class468_Sub8.aClass98Array7889 = new Interface[Class388.INTERFACE_INDEX.containersCount(-1686951777)];
		WorldMapIndexLoader.aBoolArray2709 = new boolean[Class388.INTERFACE_INDEX.containersCount(-1593209723)];
	}
}
