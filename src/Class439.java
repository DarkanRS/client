
/* Class439 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public final class Class439 {
	
	Class439() throws Throwable {
		throw new Error();
	}

	public static void method7343(int i, int i_2_) {
		IComponentDefinitions.aClass229_1280.method3858(i, (byte) 2);
		IComponentDefinitions.aClass229_1341.method3858(i, (byte) 35);
		IComponentDefinitions.aClass229_1303.method3858(i, (byte) 34);
		IComponentDefinitions.aClass229_1282.method3858(i, (byte) -52);
	}

	static final void routeToSceneObject(int i, int i_3_, long l) {
		int i_4_ = (int) l >> 14 & 0x1f;
		int i_5_ = (int) l >> 20 & 0x3;
		int i_6_ = (int) (l >>> 32) & 0x7fffffff;
		SceneObjectType class458 = (SceneObjectType) Class386.method6672(Class2.method262((byte) -1), i_4_, -917234900);
		RouteStrategy class225;
		if (class458 == SceneObjectType.SCENERY_INTERACT || SceneObjectType.GROUND_INTERACT == class458 || class458 == SceneObjectType.GROUND_DECORATION) {
			ObjectDefinitions class478 = IndexLoaders.MAP_REGION_DECODER.method4436(-1792559044).getObjectDefinitions(i_6_, 65280);
			int i_7_;
			int i_8_;
			if (i_5_ == 0 || i_5_ == 2) {
				i_7_ = -752356381 * class478.anInt5648;
				i_8_ = class478.anInt5649 * -1610844647;
			} else {
				i_7_ = -1610844647 * class478.anInt5649;
				i_8_ = -752356381 * class478.anInt5648;
			}
			if (i_5_ == 0) {
				/* empty */
			}
			class225 = JS5CacheFile.method3354(i, i_3_, i_7_, i_8_, SceneObjectType.WALL_STRAIGHT, 0, 1608795477);
		} else if (Class308.isWall(1109376893 * class458.type, 1861080465))
			class225 = JS5CacheFile.method3354(i, i_3_, 0, 0, class458, i_5_, 1608795477);
		else
			class225 = Class148.method2551(i, i_3_, 0, 0, class458, i_5_, 960380494);
		MapRegion.routeTo(i, i_3_, true, class225, 2130368133);
	}
}
