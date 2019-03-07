public class Class282_Sub21 extends Node {

	static NativeSprite[] aClass160Array7673;
	String aString7674;
	int anInt7675;

	static void setItemInContainer(int key, int slot, int itemId, int amount, boolean negativeKey) {
		long longKey = (long) (key | (negativeKey ? Integer.MIN_VALUE : 0));
		ItemContainer container = (ItemContainer) ItemContainer.CONTAINER_MAP.get(longKey);
		if (container == null) {
			container = new ItemContainer();
			ItemContainer.CONTAINER_MAP.put(container, longKey);
		}

		if (container.itemIds.length <= slot) {
			int[] ints_9 = new int[slot + 1];
			int[] ints_10 = new int[slot + 1];

			int i;
			for (i = 0; i < container.itemIds.length; i++) {
				ints_9[i] = container.itemIds[i];
				ints_10[i] = container.amounts[i];
			}

			for (i = container.itemIds.length; i < slot; i++) {
				ints_9[i] = -1;
				ints_10[i] = 0;
			}

			container.itemIds = ints_9;
			container.amounts = ints_10;
		}

		container.itemIds[slot] = itemId;
		container.amounts[slot] = amount;
	}

}
