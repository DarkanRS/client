import java.util.ArrayList;

public final class CS2Runner {

	static int anInt5904 = 0;

	static int[] anIntArray5900 = new int[3];

	public static SoftCache aClass229_5901 = new SoftCache(4);

	static boolean aBool5898 = false;

	static String aString5897 = null;

	static ArrayList CS2_EXECUTORS = new ArrayList();

	static int CURRENT_CS2_EXEC_IDX = 0;

	static int anInt5906 = 0;

	CS2Runner() throws Throwable {
		throw new Error();
	}

	static ItemContainer getItemContainer(int key, boolean negativeKey) {
		long longKey = (long) (key | (negativeKey ? Integer.MIN_VALUE : 0));
		return (ItemContainer) ItemContainer.CONTAINER_MAP.get(longKey);
	}
}
