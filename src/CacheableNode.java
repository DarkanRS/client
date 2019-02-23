public class CacheableNode extends Node {

	public long key;
	public CacheableNode aClass282_Sub50_8119;
	public CacheableNode current;

	public void method13452() {
		if (this.current != null) {
			this.current.aClass282_Sub50_8119 = this.aClass282_Sub50_8119;
			this.aClass282_Sub50_8119.current = this.current;
			this.aClass282_Sub50_8119 = null;
			this.current = null;
		}

	}

}
