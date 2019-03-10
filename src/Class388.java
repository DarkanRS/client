public class Class388 implements Interface41 {

	static Index INTERFACE_INDEX;
	public static int anInt4722;
	public static int anInt4723;
	Index aClass317_4720;
	String aString4719;

	public Class445 method234() {
		return Class445.aClass445_5382;
	}

	public Class445 method232(byte b_1) {
		return Class445.aClass445_5382;
	}

	Class388(Index index_1, String string_2) {
		this.aClass317_4720 = index_1;
		this.aString4719 = string_2;
	}

	public int method231() {
		return this.aClass317_4720.method5629(this.aString4719, 71472045) ? 100 : this.aClass317_4720.method5631(this.aString4719, (byte) 58);
	}

	public Class445 method230() {
		return Class445.aClass445_5382;
	}

	public Class445 method233() {
		return Class445.aClass445_5382;
	}

	public int getCompletion(int i_1) {
		return this.aClass317_4720.method5629(this.aString4719, 71472045) ? 100 : this.aClass317_4720.method5631(this.aString4719, (byte) 25);
	}

	public Class445 method235() {
		return Class445.aClass445_5382;
	}

	static final void method6687(CS2Executor cs2executor_0, int i_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class521_Sub1_Sub4.method14892(icomponentdefinitions_3, interface_4, cs2executor_0, (byte) 121);
	}

	static final void method6688(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2;
		if (cs2executor_0.aBool7022) {
			underlaydefinition_2 = cs2executor_0.aClass513_6994;
		} else {
			underlaydefinition_2 = cs2executor_0.aClass513_7007;
		}

		IComponentDefinitions icomponentdefinitions_4 = underlaydefinition_2.aClass118_5886;
		Interface interface_5 = underlaydefinition_2.aClass98_5885;
		ClipMap.method6010(icomponentdefinitions_4, interface_5, cs2executor_0, -1956215078);
	}

	static final void method6689(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		int[] ints_5 = Class96_Sub14.method14642(string_4, cs2executor_2, 1724948075);
		if (ints_5 != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1397 = Class351.method6193(string_4, cs2executor_2, 116060778);
		icomponentdefinitions_0.anIntArray1401 = ints_5;
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method6690(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, byte b_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 41262162) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1361 = Class351.method6193(string_4, cs2executor_2, -295691698);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method6691(CS2Executor cs2executor_0, int i_1) {
		boolean bool_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr] != 0;
		int i_3 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = Class202.method3342((long) i_3, 0, bool_2, Class223.CURRENT_LANGUAGE, (byte) -28);
	}

	static void method6692(int i_0) {
		TCPMessage tcpmessage_1 = Class271.method4828(OutgoingPacket.aClass379_4627, client.aClass184_7475.isaac, 1965593342);
		tcpmessage_1.buffer.writeByte(Class158.windowedMode());
		tcpmessage_1.buffer.writeShort(Class349.anInt4083, 1417031095);
		tcpmessage_1.buffer.writeShort(client.anInt3243 * -969250379, 1417031095);
		tcpmessage_1.buffer.writeByte(Class393.preferences.aClass468_Sub4_8223.method12641(-965992195));
		client.aClass184_7475.method3049(tcpmessage_1, 664640946);
	}

	static boolean method6693(int i_0) {
		return client.gameState != 5 ? false : !JS5CacheFile.method3360((byte) 103) && !Class85.method1466(-611019435);
	}

	static void method6694(Class200 class200_0, int i_1, int i_2, int i_3, MeshRasterizer meshrasterizer_4, int i_5) {
		if (meshrasterizer_4 != null) {
			class200_0.method3253(i_1, i_2, i_3, meshrasterizer_4.N(), meshrasterizer_4.RA(), meshrasterizer_4.ya(), meshrasterizer_4.YA(), meshrasterizer_4.o(), meshrasterizer_4.AA(), meshrasterizer_4.ha());
		}

	}

	static final void method6695(CS2Executor cs2executor_0, int i_1) {
		Class101.method1774((byte) -107);
	}

}
