/* IDirect3DSurface - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public class IDirect3DSurface extends IUnknown {
	public static native int Download(long l, int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, long l_11_);

	public static native int Upload(long l, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, long l_5_);

	private IDirect3DSurface() throws Throwable {
		throw new Error();
	}
}
