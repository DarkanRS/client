/* Class282_Sub50_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class QuickchatDefinitions extends CacheableNode {
	QuickchatDefinitionsLoader aClass429_9623;
	public int[] anIntArray9624;
	int[] dynamicValueTypes;
	int[][] anIntArrayArray9626;
	String[] messages;
	public boolean aBool9628 = true;

	void decode(RsByteBuffer buffer, int i, int i_1_) {
		if (1 == i)
			((QuickchatDefinitions) this).messages = Class456_Sub3.method12681(buffer.readString(), '<', 229848533);
		else if (2 == i) {
			int i_2_ = buffer.readUnsignedByte();
			anIntArray9624 = new int[i_2_];
			for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
				anIntArray9624[i_3_] = buffer.readUnsignedShort();
		} else if (i == 3) {
			int i_4_ = buffer.readUnsignedByte();
			((QuickchatDefinitions) this).dynamicValueTypes = new int[i_4_];
			((QuickchatDefinitions) this).anIntArrayArray9626 = new int[i_4_][];
			for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
				int i_6_ = buffer.readUnsignedShort();
				QuickChatDynamicValue class243 = QuickChatDynamicValue.get(i_6_, (byte) -5);
				if (class243 != null) {
					((QuickchatDefinitions) this).dynamicValueTypes[i_5_] = i_6_;
					((QuickchatDefinitions) this).anIntArrayArray9626[i_5_] = new int[class243.paramCount * 720437159];
					for (int i_7_ = 0; i_7_ < class243.paramCount * 720437159; i_7_++)
						((QuickchatDefinitions) this).anIntArrayArray9626[i_5_][i_7_] = buffer.readUnsignedShort();
				}
			}
		} else if (4 == i)
			aBool9628 = false;
	}

	public void method14896(RsByteBuffer class282_sub35, int[] is, int i) {
		if (((QuickchatDefinitions) this).dynamicValueTypes != null) {
			for (int i_8_ = 0; (i_8_ < ((QuickchatDefinitions) this).dynamicValueTypes.length && i_8_ < is.length); i_8_++) {
				int i_9_ = method14918(i_8_, -218667909).clientTransmitSize * -906335175;
				if (i_9_ > 0)
					class282_sub35.method13068((long) is[i_8_], i_9_, 1986683793);
			}
		}
	}

	public String fillDynamicValues(RsByteBuffer buffer, byte i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((QuickchatDefinitions) this).dynamicValueTypes != null) {
			for (int i_10_ = 0; i_10_ < ((QuickchatDefinitions) this).dynamicValueTypes.length; i_10_++) {
				stringbuilder.append(((QuickchatDefinitions) this).messages[i_10_]);
				stringbuilder.append(((QuickchatDefinitions) this).aClass429_9623.method7212(method14918(i_10_, 12195822), ((QuickchatDefinitions) this).anIntArrayArray9626[i_10_], buffer.method13089((QuickChatDynamicValue.get((((QuickchatDefinitions) this).dynamicValueTypes[i_10_]), (byte) -21).serverTransmitSize) * 730963347, 1911535403)));
			}
		}
		stringbuilder.append(((QuickchatDefinitions) this).messages[(((QuickchatDefinitions) this).messages).length - 1]);
		return stringbuilder.toString();
	}

	public String method14898(int i) {
		StringBuilder stringbuilder = new StringBuilder(80);
		if (((QuickchatDefinitions) this).messages == null)
			return "";
		stringbuilder.append(((QuickchatDefinitions) this).messages[0]);
		for (int i_11_ = 1; i_11_ < ((QuickchatDefinitions) this).messages.length; i_11_++) {
			for (int i_12_ = 0; i_12_ < 3; i_12_++)
				stringbuilder.append('.');
			stringbuilder.append(((QuickchatDefinitions) this).messages[i_11_]);
		}
		return stringbuilder.toString();
	}

	public int method14901(int i, int i_13_, int i_14_) {
		if (null == ((QuickchatDefinitions) this).dynamicValueTypes || i < 0 || i > ((QuickchatDefinitions) this).dynamicValueTypes.length)
			return -1;
		if (null == ((QuickchatDefinitions) this).anIntArrayArray9626[i] || i_13_ < 0 || (i_13_ > ((QuickchatDefinitions) this).anIntArrayArray9626[i].length))
			return -1;
		return ((QuickchatDefinitions) this).anIntArrayArray9626[i][i_13_];
	}

	void method14912(int i) {
		if (anIntArray9624 != null) {
			for (int i_25_ = 0; i_25_ < anIntArray9624.length; i_25_++)
				anIntArray9624[i_25_] |= 0x8000;
		}
	}

	void method14913(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_26_ = class282_sub35.readUnsignedByte();
			if (0 == i_26_)
				break;
			decode(class282_sub35, i_26_, -1464850620);
		}
	}

	public int method14916(int i) {
		if (null == ((QuickchatDefinitions) this).dynamicValueTypes)
			return 0;
		return ((QuickchatDefinitions) this).dynamicValueTypes.length;
	}

	QuickchatDefinitions() {
		/* empty */
	}

	public QuickChatDynamicValue method14918(int i, int i_27_) {
		if (null == ((QuickchatDefinitions) this).dynamicValueTypes || i < 0 || i > ((QuickchatDefinitions) this).dynamicValueTypes.length)
			return null;
		return QuickChatDynamicValue.get((((QuickchatDefinitions) this).dynamicValueTypes[i]), (byte) -128);
	}

	static boolean method14921(int i, int i_28_, int i_29_, byte i_30_) {
		SceneObjectManager class206 = IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager(-1536948250);
		boolean bool = true;
		SceneObject interface12 = (SceneObject) class206.getWall(i, i_28_, i_29_, (byte) -61);
		if (null != interface12)
			bool &= Class93.method1577(interface12, -1691371970);
		interface12 = (SceneObject) class206.getInteractableObject(i, i_28_, i_29_, client.anInterface25_7446, -233664382);
		if (interface12 != null)
			bool &= Class93.method1577(interface12, -1754652045);
		interface12 = (SceneObject) class206.getGroundDecoration(i, i_28_, i_29_, -387297653);
		if (interface12 != null)
			bool &= Class93.method1577(interface12, -1776795369);
		return bool;
	}
}
