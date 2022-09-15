/* OggPage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package jagtheora.ogg;

import jagtheora.misc.SimplePeer;

public class OggPage extends SimplePeer {
	@Override
	protected native void clear();

	@Override
	protected native void f();

	public native int getCompletedPackets();

	public native long getGranulePos();

	public native long getPageNumber();

	public native int getSerialNumber();

	public native int getVersion();

	public native boolean isBOS();

	public native boolean isContinued();

	public native boolean isEOS();

	@Override
	protected native void m();

	@Override
	protected native void q();
}
