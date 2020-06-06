package com.jagex;

public class Class148 {

    static Index aClass317_1731;

    static Index aClass317_1732;

    static Node_Sub15_Sub2 aNode_Sub15_Sub2_1735;

    static Index aClass317_1737;

    static int anInt1738;

    static long aLong1740;

    static int anInt1730;

    Class148() throws Throwable {
        throw new Error();
    }

    public static String method2550(int i_0) {
        VorbisNode class282_sub37_2 = (VorbisNode) Class492.INDEX36_FILE_CACHE.get(i_0);
        if (class282_sub37_2 != null) {
            Node_Sub41_Sub2 class282_sub41_sub2_3 = class282_sub37_2.vfReference.method4935();
            if (class282_sub41_sub2_3 != null) {
                double d_4 = class282_sub37_2.vfReference.method4923();
                if (class282_sub41_sub2_3.method14702() <= d_4 && class282_sub41_sub2_3.method14705() >= d_4) {
                    return class282_sub41_sub2_3.method14704();
                }
            }
        }
        return null;
    }

    public static RouteStrategy createNormalObjectStrategy(int x, int y, ObjectType objectType, int accessFlags) {
        RouteStrategies.NORMAL_OBJECT.approxDestinationX = x;
        RouteStrategies.NORMAL_OBJECT.approxDestinationY = y;
        RouteStrategies.NORMAL_OBJECT.approxDestinationSizeX = 0;
        RouteStrategies.NORMAL_OBJECT.approxDestinationSizeY = 0;
        RouteStrategies.NORMAL_OBJECT.objectType = objectType;
        RouteStrategies.NORMAL_OBJECT.accessFlags = accessFlags;
        return RouteStrategies.NORMAL_OBJECT;
    }

    static Class method2553(String string_0) throws ClassNotFoundException {
        return "B".equals(string_0) ? Byte.TYPE : ("I".equals(string_0) ? Integer.TYPE : ("S".equals(string_0) ? Short.TYPE : ("J".equals(string_0) ? Long.TYPE : ("Z".equals(string_0) ? Boolean.TYPE : ("F".equals(string_0) ? Float.TYPE : ("D".equals(string_0) ? Double.TYPE : ("C".equals(string_0) ? Character.TYPE : ("void".equals(string_0) ? Void.TYPE : Class.forName(string_0)))))))));
    }
}
