public abstract class JS5CacheRequest extends CacheableNode {

	boolean highPriority;
	boolean aBool9638;
	volatile boolean waiting = true;

	abstract byte[] method14941();

	abstract byte[] getData(int var1);

	abstract int getCompletion(int var1);

	abstract byte[] method14944();

	abstract byte[] method14945();

	abstract int method14946();

	abstract int method14947();

	abstract int method14948();

	static void method14949(Class466 class466_0, int i_1) {
		Class404.aClass466_4831 = class466_0;
	}

}
