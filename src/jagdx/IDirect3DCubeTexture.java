/* IDirect3DCubeTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public class IDirect3DCubeTexture extends IDirect3DBaseTexture {
	private IDirect3DCubeTexture() throws Throwable {
		throw new Error();
	}

	public static native int Upload(long l, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, long l_7_);

	public static native int Download(long l, int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, long l_15_);
}
