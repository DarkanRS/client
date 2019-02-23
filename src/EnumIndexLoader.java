public class EnumIndexLoader {

	public static int[] anIntArray5379;
	SoftCache aClass229_5377 = new SoftCache(128);
	Index aClass317_5378;

	public EnumDefinitions method7424(int i_1, byte b_2) {
		SoftCache softcache_4 = this.aClass229_5377;
		EnumDefinitions enumdefinitions_3;
		synchronized (this.aClass229_5377) {
			enumdefinitions_3 = (EnumDefinitions) this.aClass229_5377.get((long) i_1);
		}

		if (enumdefinitions_3 != null) {
			return enumdefinitions_3;
		} else {
			byte[] bytes_8 = this.aClass317_5378.getFile(SharedConfigsType.aClass120_1471.containerId(i_1), SharedConfigsType.aClass120_1471.fileId(i_1));
			enumdefinitions_3 = new EnumDefinitions();
			if (bytes_8 != null) {
				enumdefinitions_3.method7227(new RsByteBuffer(bytes_8), (byte) 104);
			}

			SoftCache softcache_5 = this.aClass229_5377;
			synchronized (this.aClass229_5377) {
				this.aClass229_5377.put(enumdefinitions_3, (long) i_1);
				return enumdefinitions_3;
			}
		}
	}

	public EnumIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_5378 = index_3;
		if (this.aClass317_5378 != null) {
			int i_4 = this.aClass317_5378.containersCount() - 1;
			SharedConfigsType.aClass120_1471.filesPerContainer(-613744571);
			this.aClass317_5378.filesCount(i_4);
		}

	}

	public static boolean method7426(int i_0, byte b_1) {
		for (Class282_Sub50_Sub7 class282_sub50_sub7_2 = (Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 75); class282_sub50_sub7_2 != null; class282_sub50_sub7_2 = (Class282_Sub50_Sub7) Class20.aClass482_171.next(1043628930)) {
			if (Class237.method3989(class282_sub50_sub7_2.anInt9587, (byte) 0) && (long) i_0 == class282_sub50_sub7_2.aLong9584) {
				return true;
			}
		}

		return false;
	}

	static final void method7427(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_2 >> 28;
	}

}
