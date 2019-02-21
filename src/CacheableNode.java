/* Class282_Sub50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CacheableNode extends Node {
	public CacheableNode current;
	public CacheableNode aClass282_Sub50_8119;
	public long key;

	public void method13452() {
		if (null != current) {
			current.aClass282_Sub50_8119 = aClass282_Sub50_8119;
			aClass282_Sub50_8119.current = current;
			aClass282_Sub50_8119 = null;
			current = null;
		}
	}
}
