import java.io.IOException;
import java.net.Socket;
import java.util.Calendar;

public class Class450 {

    public String aString5433;

    public int worldId;

    public static int anInt5438;

    boolean aBool5436 = true;

    boolean aBool5432 = false;

    public int anInt5437 = 1;

    public int anInt5434 = -190419398;

    public boolean method7491(Class450 class450_1, int i_2) {
        return class450_1 == null ? false : this.worldId == class450_1.worldId && this.aString5433.equals(class450_1.aString5433);
    }

    public void method7493(int i_1) {
        if (!this.aBool5436) {
            this.aBool5436 = true;
            this.aBool5432 = true;
        } else if (this.aBool5432) {
            this.aBool5432 = false;
        } else {
            this.aBool5436 = false;
        }
    }

    public Socket method7494(byte b_1) throws IOException {
        return new Socket(this.aString5433, 5555);
    }

    static String method7499(long long_0, int i_2, boolean bool_3, int i_4) {
        Calendar calendar_5;
        if (bool_3) {
            Class288.method5083(long_0);
            calendar_5 = Class407.aCalendar4846;
        } else {
            Class155.method2634(long_0);
            calendar_5 = Class407.aCalendar4848;
        }
        int i_6 = calendar_5.get(5);
        int i_7 = calendar_5.get(2) + 1;
        int i_8 = calendar_5.get(1);
        int i_9 = calendar_5.get(11);
        int i_10 = calendar_5.get(12);
        return Integer.toString(i_6 / 10) + i_6 % 10 + "/" + i_7 / 10 + i_7 % 10 + "/" + i_8 % 100 / 10 + i_8 % 10 + " " + i_9 / 10 + i_9 % 10 + ":" + i_10 / 10 + i_10 % 10;
    }
}
