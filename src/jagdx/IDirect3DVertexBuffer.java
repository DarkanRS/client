/* IDirect3DVertexBuffer - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public class IDirect3DVertexBuffer extends IUnknown {
	private IDirect3DVertexBuffer() throws Throwable {
		throw new Error();
	}

	public static native long Lock(long l, int i, int i_0_, int i_1_);

	public static native void Unlock(long l);

	public static native int Upload(long l, int i, int i_2_, int i_3_, long l_4_);

	public static native int Download(long l, int i, int i_5_, int i_6_, long l_7_);
}
