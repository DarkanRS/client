package com.jagex;

public class RasterizerFlags {

    RasterizerFlags() throws Throwable {
        throw new Error();
    }

    static boolean method2180(int i_0) {
        return (i_0 & 0x21) != 0;
    }

    static boolean method2181(int i_0) {
        return (i_0 & 0x22) != 0;
    }

    static boolean method2183(int i_0) {
        return (i_0 & 0x37) != 0;
    }

    static boolean method2184(int i_0) {
        return (i_0 & 0x34) != 0;
    }

    static boolean method2185(int i_0) {
        return (i_0 & 0x84080) != 0;
    }

    static boolean method2186(int i_0) {
        return (i_0 & 0x100100) != 0;
    }

    static boolean method2188(int i_0) {
        return (i_0 & 0x10) != 0;
    }

    static boolean method2189(int i_0) {
        return (i_0 & 0x8000) != 0;
    }

    static boolean method2190(int i_0) {
        return (i_0 & 0xc580) != 0;
    }

    static boolean method2191(int i_0) {
        return (i_0 & 0x10000) != 0;
    }

    static boolean method2192(int i_0) {
        return (i_0 & 0x800) != 0;
    }

    static boolean method2193(int i_0, int i_1) {
        return (i_0 & 0x800) != 0 && (i_1 & 0x37) != 0;
    }

    static boolean method2194(int i_0) {
        return (i_0 & 0x800) != 0;
    }

    static boolean method2195(int i_0) {
        return (i_0 & 0x220) == 544 | (i_0 & 0x18) != 0;
    }

    static boolean method2196(int i_0) {
        return (i_0 & 0x800) != 0;
    }

    static boolean method2197(int i_0) {
        return (method2180(i_0) | method2181(i_0) | method2184(i_0)) & method2192(i_0);
    }

    static boolean method2199(int i_0, int i_1) {
        return method2194(i_0) && ((i_0 & 0xb000) != 0 | method2185(i_0) | method2186(i_0) || (i_1 & 0x37) == 0 & (method2195(i_0) | method2191(i_0)));
    }

    static boolean method2200() {
        return false;
    }

    static boolean method2201(int i_0) {
        return (i_0 & 0x800) != 0;
    }

    static boolean method2202(int i_0) {
        return (i_0 & 0x70000) != 0 | method2180(i_0) || method2197(i_0);
    }

    static boolean method2204(int i_0, int i_1) {
        return (i_0 & 0x10000) != 0 | method2195(i_0) || method2261(i_0, i_1) || (i_1 & 0x37) == 0 && method2199(i_0, i_1);
    }

    static boolean method2205(int i_0, int i_1) {
        return method2185(i_0) || method2199(i_0, i_1);
    }

    static boolean method2206(int i_0, int i_1) {
        return (i_0 & 0x40000) != 0 | method2186(i_0) || method2199(i_0, i_1);
    }

    static boolean method2208(int i_0) {
        return (i_0 & 0x180) != 0;
    }

    static boolean method2211(int i_0, int i_1) {
        return (i_0 & 0x60000) != 0 | method2188(i_0) || method2199(i_0, i_1) || method2283(i_0);
    }

    static boolean method2212(int i_0, int i_1) {
        return (i_0 & 0x800) != 0 | method2189(i_0) || method2199(i_0, i_1);
    }

    static boolean method2226(int i_0) {
        return (i_0 & 0x20) != 0;
    }

    static boolean method2229(int i_0) {
        return (i_0 & 0x70000) != 0 | method2181(i_0) || method2197(i_0);
    }

    static boolean method2241() {
        return method2200();
    }

    static boolean method2252(int i_0) {
        return (i_0 & 0x70000) != 0 | method2184(i_0) || method2197(i_0);
    }

    static boolean method2260(int i_0) {
        return (i_0 & 0x400) != 0;
    }

    static boolean method2261(int i_0, int i_1) {
        return ((i_0 & 0x2000) != 0 | method2195(i_0) | method2191(i_0)) & method2193(i_0, i_1);
    }

    static boolean method2283(int i_0) {
        return method2188(i_0) & method2196(i_0);
    }

}
