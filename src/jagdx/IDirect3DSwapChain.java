/* IDirect3DSwapChain - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagdx;

public class IDirect3DSwapChain extends IUnknown {
	private IDirect3DSwapChain() throws Throwable {
		throw new Error();
	}

	public static native long GetBackBuffer(long l, int i, int i_0_);

	public static native int Present(long l, int i);
}
