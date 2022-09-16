/* DirectBufferHelper - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jaclib.memory;

public class DirectBufferHelper {
	public static native long getDirectBufferAddress(java.nio.ByteBuffer object);

	private DirectBufferHelper() throws Throwable {
		throw new Error();
	}
}
