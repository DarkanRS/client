/* IDirect3DTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public class IDirect3DTexture extends IDirect3DBaseTexture {
	private IDirect3DTexture() throws Throwable {
		throw new Error();
	}

	public static native long GetSurfaceLevel(long l, int i);

	public static native int Upload(long l, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, long l_6_);

	public static native int Download(long l, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, long l_13_);
}
