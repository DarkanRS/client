import java.awt.EventQueue;
import java.io.File;

public abstract class Shadow extends CacheableNode {

	static EventQueue anEventQueue10074;

	static void method15506(GraphicalRenderer graphicalrenderer_0, int i_1, int i_2, IComponentDefinitions icomponentdefinitions_3) {
		byte b_5 = 63;
		byte b_6 = 7;
		for (int i_7 = 63; i_7 >= 0; --i_7) {
			int i_8 = (i_7 & 0x3f) << 10 | (b_6 & 0x7) << 7 | b_5 & 0x7f;
			Class38.method854(false, true, -2145672761);
			int i_9 = Class540.anIntArray7136[i_8];
			Class13.method508(false, true, 425097305);
			graphicalrenderer_0.B(i_1, ((63 - i_7) * icomponentdefinitions_3.anInt1429 >> 6) + i_2, icomponentdefinitions_3.anInt1301, (icomponentdefinitions_3.anInt1429 >> 6) + 1, i_9, 0);
		}
	}

	static int method15507(Class282_Sub50_Sub7 class282_sub50_sub7_0, FontMetrics fontmetrics_1) {
		String string_3 = IncomingPacket.method6380(class282_sub50_sub7_0, 594489701);
		int[] ints_4 = Class534_Sub1.method12815(class282_sub50_sub7_0, -1355601435);
		if (ints_4 != null) {
			string_3 = string_3 + Class15.method547(ints_4, 1858331234);
		}
		int i_5 = fontmetrics_1.getWidth(string_3, Class115.aClass160Array1248);
		if (class282_sub50_sub7_0.aBool9577) {
			i_5 += Exception_Sub1.aClass160_10075.method2747() + 4;
		}
		return i_5;
	}

	public static File method15508(int i_0) {
		return Engine.aFile3264;
	}

	static final void method15509(int i_0) {
		--CS2Runner.CURRENT_CS2_EXEC_IDX;
	}

	static final void method15511(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		icomponentdefinitions_0.spriteScale = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.redrawComponent(icomponentdefinitions_0, (byte) 56);
		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			Class106.method1818(icomponentdefinitions_0.idHash, 438520847);
		}
	}
}