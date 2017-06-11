import java.awt.Color;

public class al {
	public byte cr, cg, cb;
	public float f;
	public boolean m;
	
	public al(byte r, byte g, byte b) {
		cr=r;
		cg=g;
		cb=b;
		f = 0f;
		m = false;
	}
	
	public Color inc() {
		f += 0.1337f;
		if(f > 1f)
			f = 0f;
		return Color.getHSBColor(f, 1, 1);
	}
}
