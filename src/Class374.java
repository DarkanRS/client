import java.awt.Canvas;

public class Class374 {

	public static GraphicalRenderer getDirectXRenderer(Canvas canvas_0, Interface22 interface22_1, Index index_2, int i_3) {
		try {
			boolean bool_5 = Class505_Sub2.method13893();
			if (!bool_5) {
				throw new RuntimeException("");
			} else if (!Class362.getNativeLibraryLoader().loadLibrary("jagdx", -1240220089)) {
				throw new RuntimeException("");
			} else {
				GraphicalRenderer graphicalrenderer_4 = Class505_Sub2_Sub2.method15638(canvas_0, interface22_1, index_2, Integer.valueOf(i_3));
				return graphicalrenderer_4;
			}
		} catch (Throwable throwable_7) {
			throw new RuntimeException("");
		}
	}

	Class374() throws Throwable {
		throw new Error();
	}

}
