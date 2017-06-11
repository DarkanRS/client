/* IDirect3DVolumeTexture - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public class IDirect3DVolumeTexture extends IDirect3DBaseTexture {
	private IDirect3DVolumeTexture() throws Throwable {
		throw new Error();
	}

	public static native int Upload(long l, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, long l_8_);

	public static native int Download(long l, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, long l_17_);
}
