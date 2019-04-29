public class Class274 {

    protected static Class470 aClass470_3336;
    
    int width;
    int height;
    int anInt3333;
    int anInt3335;
    String name;

    int method4868() {
        return this.anInt3333;
    }

    String getName() {
        return this.name;
    }

    int getWidth() {
        return this.width;
    }

    int method4872() {
        return this.anInt3335;
    }

    int getHeight() {
        return this.height;
    }

    public Class274(int width, int height, int i_3, int i_4, String name) {
        this.width = width;
        this.height = height;
        this.anInt3333 = i_3;
        this.anInt3335 = i_4;
        this.name = name;
    }

    public static void method4884(byte b_0) {
        if (Class448.CONNECTION_INFO.worldId != -1) {
            Class62.setGameHost(Class448.CONNECTION_INFO.worldId, Class448.CONNECTION_INFO.host);
        }
    }
}
