public class Class488 {

    public static int anInt5760;

    static Index MESH_INDEX;

    Class488() throws Throwable {
        throw new Error();
    }

    static final String method8210(int i_0, int i_1) {
        String string_2 = Integer.toString(i_0);
        for (int i_3 = string_2.length() - 3; i_3 > 0; i_3 -= 3) {
            string_2 = string_2.substring(0, i_3) + "," + string_2.substring(i_3);
        }
        return string_2.length() > 9 ? " " + ParticleProducerDefinition.method1163(65408, 619010179) + string_2.substring(0, string_2.length() - 8) + Message.aClass433_5294.translate(Class223.CURRENT_LANGUAGE, -669112098) + " (" + string_2 + ")" + "</col>" : (string_2.length() > 6 ? " " + ParticleProducerDefinition.method1163(16777215, 619010179) + string_2.substring(0, string_2.length() - 4) + Message.aClass433_5296.translate(Class223.CURRENT_LANGUAGE, -327274264) + " (" + string_2 + ")" + "</col>" : " " + ParticleProducerDefinition.method1163(16776960, 619010179) + string_2 + "</col>");
    }
}
