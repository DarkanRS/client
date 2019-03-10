import java.io.IOException;
import java.util.Date;

public abstract class Class209 {

	public abstract int method3564();

	public abstract boolean method3565(byte var1);

	public abstract boolean method3566(int var1);

	public abstract boolean method3567(byte var1);

	public boolean method3568(short s_1) {
		return this.method3565((byte) -13) || this.method3566(-2143623365) || this.method3567((byte) 69);
	}

	public abstract int method3569(int var1);

	public abstract int method3570(int var1);

	public abstract MouseRecord nextSubmission(byte var1);

	public abstract int method3573();

	public abstract void method3578();

	public abstract boolean method3579();

	public abstract boolean method3580();

	public abstract void method3581();

	public abstract boolean method3582();

	public abstract boolean method3583();

	public abstract void method3584(int var1);

	public abstract int method3585();

	public abstract MouseRecord method3588();

	public abstract void method3589(byte var1);

	public abstract MouseRecord method3590();

	public abstract MouseRecord method3591();

	public abstract MouseRecord method3592();

	public abstract boolean method3593();

	public abstract void method3594();

	public abstract void method3595();

	public static void method3598(String string_0, int i_1) {
		if (Class13.aStringArray129 == null) {
			FontRenderer.method402(1696819544);
		}
		client.aCalendar7278.setTime(new Date(Class169.time()));
		int i_2 = client.aCalendar7278.get(11);
		int i_3 = client.aCalendar7278.get(12);
		int i_4 = client.aCalendar7278.get(13);
		String string_5 = Integer.toString(i_2 / 10) + i_2 % 10 + ":" + i_3 / 10 + i_3 % 10 + ":" + i_4 / 10 + i_4 % 10;
		String[] arr_6 = Class456_Sub3.method12681(string_0, '\n', 229848533);
		for (int i_7 = 0; i_7 < arr_6.length; i_7++) {
			for (int i_8 = Class179.anInt2227; i_8 > 0; --i_8) {
				Class13.aStringArray129[i_8] = Class13.aStringArray129[i_8 - 1];
			}
			Class13.aStringArray129[0] = string_5 + ": " + arr_6[i_7];
			if (TextureDefinition.aFileOutputStream9481 != null) {
				try {
					TextureDefinition.aFileOutputStream9481.write(LinkedNodeList.method7885(Class13.aStringArray129[0] + "\n", (byte) -108));
				} catch (IOException ioexception_10) {
					;
				}
			}
			if (Class179.anInt2227 < Class13.aStringArray129.length - 1) {
				++Class179.anInt2227;
				if (Class179.anInt2223 > 0) {
					++Class179.anInt2223;
				}
			}
		}
	}

	public static boolean method3600(byte b_0, int i_1) {
		int i_2 = b_0 & 0xff;
		return i_2 == 0 ? false : i_2 < 128 || i_2 >= 160 || Class490.aCharArray5766[i_2 - 128] != 0;
	}

	static final void method3601(IComponentDefinitions icomponentdefinitions_0, CS2Executor cs2executor_1, int i_2) {
		int i_3 = cs2executor_1.intStack[--cs2executor_1.intStackPtr];
		int i_4 = cs2executor_1.intStack[--cs2executor_1.intStackPtr] - 1;
		if (icomponentdefinitions_0.anInt1329 != 6 && icomponentdefinitions_0.anInt1329 != 2) {
			throw new RuntimeException("");
		} else {
			NPCDefinitions npcdefinitions_5 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(icomponentdefinitions_0.anInt1330, (byte) 4);
			if (icomponentdefinitions_0.aClass417_1308 == null) {
				icomponentdefinitions_0.aClass417_1308 = new Class417(npcdefinitions_5, icomponentdefinitions_0.anInt1329 == 6);
			}
			icomponentdefinitions_0.aClass417_1308.aLong4993 = Class86.method1480(1488415195);
			if (npcdefinitions_5.aShortArray4867 != null && i_4 >= 0 && i_4 < npcdefinitions_5.aShortArray4867.length) {
				icomponentdefinitions_0.aClass417_1308.aShortArray4991[i_4] = (short) i_3;
				Class109.method1858(icomponentdefinitions_0, (byte) 25);
			} else {
				throw new RuntimeException("");
			}
		}
	}
}
