
/* Class315 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

import jaggl.OpenGL;

public class Class315 {
	Class315() throws Throwable {
		throw new Error();
	}

	public static GraphicalRenderer getOpenGLRenderer(Canvas canvas, Interface22 interface22, Index class317, int i) {
		Class505_Sub2_Sub1 class505_sub2_sub1;
		try {
			boolean bool = Class505_Sub2.method13893();
			if (!bool)
				throw new RuntimeException("");
			if (!Class362.getNativeLibraryLoader(616047582).loadLibrary("jaggl", -8022122))
				throw new RuntimeException("");
			Class459.method7679(canvas, 1663051494);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class505_Sub2_Sub1 class505_sub2_sub1_0_ = new Class505_Sub2_Sub1(opengl, canvas, l, interface22, class317, i);
			class505_sub2_sub1_0_.method14147();
			class505_sub2_sub1 = class505_sub2_sub1_0_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class505_sub2_sub1;
	}

	public static GraphicalRenderer method5583(Canvas canvas, Interface22 interface22, Index class317, int i) {
		Class505_Sub2_Sub1 class505_sub2_sub1;
		try {
			boolean bool = Class505_Sub2.method13893();
			if (!bool)
				throw new RuntimeException("");
			if (!Class362.getNativeLibraryLoader(616047582).loadLibrary("jaggl", -1157219139))
				throw new RuntimeException("");
			Class459.method7679(canvas, 1988390598);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class505_Sub2_Sub1 class505_sub2_sub1_1_ = new Class505_Sub2_Sub1(opengl, canvas, l, interface22, class317, i);
			class505_sub2_sub1_1_.method14147();
			class505_sub2_sub1 = class505_sub2_sub1_1_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class505_sub2_sub1;
	}

	public static GraphicalRenderer method5584(Canvas canvas, Interface22 interface22, Index class317, int i) {
		Class505_Sub2_Sub1 class505_sub2_sub1;
		try {
			boolean bool = Class505_Sub2.method13893();
			if (!bool)
				throw new RuntimeException("");
			if (!Class362.getNativeLibraryLoader(616047582).loadLibrary("jaggl", -1661577036))
				throw new RuntimeException("");
			Class459.method7679(canvas, 2046172802);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class505_Sub2_Sub1 class505_sub2_sub1_2_ = new Class505_Sub2_Sub1(opengl, canvas, l, interface22, class317, i);
			class505_sub2_sub1_2_.method14147();
			class505_sub2_sub1 = class505_sub2_sub1_2_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class505_sub2_sub1;
	}

	public static GraphicalRenderer method5585(Canvas canvas, Interface22 interface22, Index class317, int i) {
		Class505_Sub2_Sub1 class505_sub2_sub1;
		try {
			boolean bool = Class505_Sub2.method13893();
			if (!bool)
				throw new RuntimeException("");
			if (!Class362.getNativeLibraryLoader(616047582).loadLibrary("jaggl", 685919251))
				throw new RuntimeException("");
			Class459.method7679(canvas, 1169167916);
			OpenGL opengl = new OpenGL();
			long l = opengl.init(canvas, 8, 8, 8, 24, 0, i);
			if (l == 0L)
				throw new RuntimeException("");
			Class505_Sub2_Sub1 class505_sub2_sub1_3_ = new Class505_Sub2_Sub1(opengl, canvas, l, interface22, class317, i);
			class505_sub2_sub1_3_.method14147();
			class505_sub2_sub1 = class505_sub2_sub1_3_;
		} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
		return class505_sub2_sub1;
	}
}
