import jaclib.memory.Buffer;
import jaggl.OpenGL;

public abstract class Class135 {

	static int[] anIntArray1626 = new int[1];
	boolean aBool1619 = false;
	OpenGLGraphicalRenderer aClass505_Sub1_1620;
	int anInt1621;
	int anInt1623;
	boolean aBool1624;
	int anInt1622;

	public void finalize() throws Throwable {
		if (!this.aBool1619) {
			this.aClass505_Sub1_1620.method13657(this.anInt1622, this.anInt1623);
			this.aBool1619 = true;
		}

		super.finalize();
	}

	Class135(OpenGLGraphicalRenderer class505_sub1_1, int i_2, Buffer buffer_3, int i_4, boolean bool_5) {
		this.aClass505_Sub1_1620 = class505_sub1_1;
		this.anInt1621 = i_2;
		this.anInt1623 = i_4;
		this.aBool1624 = bool_5;
		OpenGL.glGenBuffersARB(1, anIntArray1626, 0);
		this.anInt1622 = anIntArray1626[0];
		this.method2341();
		OpenGL.glBufferDataARBa(i_2, this.anInt1623, buffer_3.method2(), this.aBool1624 ? 35040 : 35044);
		this.aClass505_Sub1_1620.anInt8371 += this.anInt1623;
	}

	abstract void method2341();

	void method2342(byte[] bytes_1, int i_2) {
		this.method2341();
		if (i_2 > this.anInt1623) {
			OpenGL.glBufferDataARBub(this.anInt1621, i_2, bytes_1, 0, this.aBool1624 ? 35040 : 35044);
			this.aClass505_Sub1_1620.anInt8371 += i_2 - this.anInt1623;
			this.anInt1623 = i_2;
		} else {
			OpenGL.glBufferSubDataARBub(this.anInt1621, 0, i_2, bytes_1, 0);
		}

	}

	Class135(OpenGLGraphicalRenderer class505_sub1_1, int i_2, byte[] bytes_3, int i_4, boolean bool_5) {
		this.aClass505_Sub1_1620 = class505_sub1_1;
		this.anInt1621 = i_2;
		this.anInt1623 = i_4;
		this.aBool1624 = bool_5;
		OpenGL.glGenBuffersARB(1, anIntArray1626, 0);
		this.anInt1622 = anIntArray1626[0];
		this.method2341();
		OpenGL.glBufferDataARBub(i_2, this.anInt1623, bytes_3, 0, this.aBool1624 ? 35040 : 35044);
		this.aClass505_Sub1_1620.anInt8371 += this.anInt1623;
	}

	abstract void method2345();

	abstract void method2346();

}
