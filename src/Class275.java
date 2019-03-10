import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class275 {

    public Class275 aClass275_3339;

    public Class275 aClass275_3340;

    public void method4887(byte b_1) {
        if (this.aClass275_3340 != null) {
            this.aClass275_3340.aClass275_3339 = this.aClass275_3339;
            this.aClass275_3339.aClass275_3340 = this.aClass275_3340;
            this.aClass275_3339 = null;
            this.aClass275_3340 = null;
        }
    }

    static final int method4890(int i_0, int i_1, int i_2, int i_3) {
        return i_0 < i_1 ? i_1 : (i_0 > i_2 ? i_2 : i_0);
    }

    public static void method4891(byte b_0) {
        if (client.fullScreenFrame == null) {
            int i_1 = client.anInt3250;
            int i_2 = client.anInt3251;
            int i_3 = Class45.anInt434 - Class349.anInt4083 - i_1;
            int i_4 = Class107.anInt1082 - client.anInt3243 * -969250379 - i_2;
            if (i_1 > 0 || i_3 > 0 || i_2 > 0 || i_4 > 0) {
                try {
                    Container container_5 = Class371.getActiveContainer((byte) 1);
                    int i_6 = 0;
                    int i_7 = 0;
                    if (container_5 == client.engineFrame) {
                        Insets insets_8 = client.engineFrame.getInsets();
                        i_6 = insets_8.left;
                        i_7 = insets_8.top;
                    }
                    Graphics graphics_10 = container_5.getGraphics();
                    graphics_10.setColor(Color.black);
                    if (i_1 > 0) {
                        graphics_10.fillRect(i_6, i_7, i_1, Class107.anInt1082);
                    }
                    if (i_2 > 0) {
                        graphics_10.fillRect(i_6, i_7, Class45.anInt434, i_2);
                    }
                    if (i_3 > 0) {
                        graphics_10.fillRect(i_6 + Class45.anInt434 - i_3, i_7, i_3, Class107.anInt1082);
                    }
                    if (i_4 > 0) {
                        graphics_10.fillRect(i_6, i_7 + Class107.anInt1082 - i_4, Class45.anInt434, i_4);
                    }
                } catch (Exception exception_9) {
                    ;
                }
            }
        }
    }
}
