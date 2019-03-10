public class Class282_Sub50_Sub12 extends CacheableNode {

	String aString9640;

	int anInt9641;

	int anInt9642;

	int anInt9668;

	static Queue aClass477_9666 = new Queue();

	static Queue aClass477_9655 = new Queue();

	static IterableNodeMap aClass465_9667 = new IterableNodeMap(16);

	int method14953(int i_1) {
		return (int) (this.data >>> 56 & 0xffL);
	}

	long method14955(int i_1) {
		return this.key & 0x7fffffffffffffffL;
	}

	void method14965(byte b_1) {
		this.key = this.key & ~0x7fffffffffffffffL | Class169.time() + 500L;
		aClass477_9655.method7936(this, -1738910950);
	}

	long method14967(int i_1) {
		return this.data & 0xffffffffffffffL;
	}

	void method14995(int i_1) {
		this.key |= ~0x7fffffffffffffffL;
		if (this.method14955(-1539167546) == 0L) {
			aClass477_9666.method7936(this, -1738910950);
		}
	}

	Class282_Sub50_Sub12(int i_1, long long_2) {
		this.data = (long) i_1 << 56 | long_2;
	}
}
