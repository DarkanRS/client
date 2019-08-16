public class Class92 {

	int anInt964;

	SceneObjectType aClass458_963;

	int anInt965;

	int anInt962;

	int anInt966;

	int anInt967;

	boolean method1557() {
		if (this.anInt964 < 0) {
			return true;
		} else {
			ObjectDefinitions objectdefinitions_2 = IndexLoaders.OBJECT_LOADER.getObjectDefinitions(this.anInt964);
			boolean bool_3 = objectdefinitions_2.method7987(this.aClass458_963.type, 792891536);
			int[] ints_4 = objectdefinitions_2.method8008();
			if (ints_4 != null) {
				int[] ints_5 = ints_4;
				for (int i_6 = 0; i_6 < ints_5.length; i_6++) {
					int i_7 = ints_5[i_6];
					bool_3 &= IndexLoaders.ANIMATION_LOADER.getAnimDefs(i_7, (byte) 92).ready();
				}
			}
			return bool_3;
		}
	}

	Class92(RsByteBuffer rsbytebuffer_1) {
		this.anInt964 = rsbytebuffer_1.readBigSmart();
		this.aClass458_963 = (SceneObjectType) Class386.identify(Class2.method262(), rsbytebuffer_1.readUnsignedByte());
	}

	void method1558(byte b_1) {
		Class299.method5313(this.anInt965, this.anInt962, this.anInt966, this.aClass458_963.anInt5494, -1, this.aClass458_963.type, this.anInt967);
	}

	void method1559(int i_1, int i_2, int i_3, int i_4, byte b_5) {
		Class299.method5313(i_1, i_2, i_3, this.aClass458_963.anInt5494, this.anInt964, this.aClass458_963.type, i_4);
		this.anInt965 = i_1;
		this.anInt962 = i_2;
		this.anInt966 = i_3;
		this.anInt967 = i_4;
	}

	static final int calculateTileHeights(int i_0, int i_1) {
		int i_3 = Class159.method2735(45365 + i_0, i_1 + 91923, 4) - 128 + (Class159.method2735(i_0 + 10294, 37821 + i_1, 2) - 128 >> 1) + (Class159.method2735(i_0, i_1, 1) - 128 >> 2);
		i_3 = (int) ((double) i_3 * 0.3D) + 35;
		if (i_3 < 10) {
			i_3 = 10;
		} else if (i_3 > 60) {
			i_3 = 60;
		}
		return i_3;
	}

	static QuickChatValueType[] getQuickChatDynamicValueTypes() {
		return new QuickChatValueType[] { QuickChatValueType.ENUM_STRING, QuickChatValueType.ACC_GETCOUNT_WORLD, QuickChatValueType.STAT_BASE, QuickChatValueType.ACTIVECOMBATLEVEL, QuickChatValueType.OBJTRADEDIALOG, QuickChatValueType.ENUM_STRING_CLAN, QuickChatValueType.COUNTDIALOG, QuickChatValueType.TOSTRING_VARBIT, QuickChatValueType.TOSTRING_VARP, QuickChatValueType.LISTDIALOG, QuickChatValueType.ACC_GETMEANCOMBATLEVEL, QuickChatValueType.TOSTRING_SHARED, QuickChatValueType.OBJDIALOG, QuickChatValueType.ENUM_STRING_STATBASE };
	}

	public static void method1563(int i_0) {
		VorbisNode class282_sub37_2 = (VorbisNode) Class492.INDEX36_FILE_CACHE.get((long) i_0);
		if (class282_sub37_2 != null) {
			class282_sub37_2.reference.method4947((byte) 44);
			Class62.method1260(class282_sub37_2.fileId, class282_sub37_2.aBool7998, 1656056599);
			class282_sub37_2.remove();
		}
	}

	static void method1564(int i_0, int i_1, int i_2, int i_3, int i_4) {
		for (int i_6 = i_2; i_6 <= i_3; i_6++) {
			KeyHoldInputSubscriber.method3922(Class532_Sub1.anIntArrayArray7072[i_6], i_0, i_1, i_4, (byte) -105);
		}
	}

	public static void method1565(int i_0, int i_1) {
		PulseEvent class282_sub50_sub12_2 = PulseEvent.createPulseEvent(4, (long) i_0);
		class282_sub50_sub12_2.method14965((byte) -28);
	}
}
