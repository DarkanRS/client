import java.io.InputStream;

public class InputStream_Sub1 extends InputStream {

	public int read() {
		Class89.sleep(30000L);
		return -1;
	}
}
