public class Class148 {

	static Index aClass317_1731;

	static Index aClass317_1732;

	static Node_Sub15_Sub2 aNode_Sub15_Sub2_1735;

	static Index aClass317_1737;

	static int anInt1738;

	static long aLong1740;

	static int anInt1730 = 0;

	Class148() throws Throwable {
		throw new Error();
	}

	public static String method2550(int i_0) {
		VorbisNode class282_sub37_2 = (VorbisNode) Class492.INDEX36_FILE_CACHE.get((long) i_0);
		if (class282_sub37_2 != null) {
			Node_Sub41_Sub2 class282_sub41_sub2_3 = class282_sub37_2.reference.method4935();
			if (class282_sub41_sub2_3 != null) {
				double d_4 = class282_sub37_2.reference.method4923(1997080101);
				if ((double) class282_sub41_sub2_3.method14702() <= d_4 && (double) class282_sub41_sub2_3.method14705((byte) 5) >= d_4) {
					return class282_sub41_sub2_3.method14704();
				}
			}
		}
		return null;
	}

	public static RouteStrategy method2551(int i_0, int i_1, SceneObjectType sceneobjecttype_4, int i_5) {
		RouteStrategies.NORMAL_OBJECT.approxDestinationX = i_0;
		RouteStrategies.NORMAL_OBJECT.approxDestinationY = i_1;
		RouteStrategies.NORMAL_OBJECT.approxDestinationSizeX = 0;
		RouteStrategies.NORMAL_OBJECT.approxDestinationSizeY = 0;
		RouteStrategies.NORMAL_OBJECT.aClass458_7972 = sceneobjecttype_4;
		RouteStrategies.NORMAL_OBJECT.anInt7971 = i_5;
		return RouteStrategies.NORMAL_OBJECT;
	}

	static Class method2553(String string_0, short s_1) throws ClassNotFoundException {
		return string_0.equals("B") ? Byte.TYPE : (string_0.equals("I") ? Integer.TYPE : (string_0.equals("S") ? Short.TYPE : (string_0.equals("J") ? Long.TYPE : (string_0.equals("Z") ? Boolean.TYPE : (string_0.equals("F") ? Float.TYPE : (string_0.equals("D") ? Double.TYPE : (string_0.equals("C") ? Character.TYPE : (string_0.equals("void") ? Void.TYPE : Class.forName(string_0)))))))));
	}
}
