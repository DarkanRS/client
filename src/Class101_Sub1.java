
/* Class101_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jaggl.OpenGL;

public class Class101_Sub1 extends Class101 {
	Class505_Sub2_Sub1 aClass505_Sub2_Sub1_9264;
	Class115_Sub2 aClass115_Sub2_9265;
	int anInt9266;

	Class101_Sub1(Class505_Sub2_Sub1 class505_sub2_sub1, Class114 class114) {
		super((Class505_Sub2) class505_sub2_sub1, class114);
		((Class101_Sub1) this).aClass505_Sub2_Sub1_9264 = class505_sub2_sub1;
	}

	Class115 method1743(Class505_Sub2 class505_sub2, Class99 class99) {
		return new Class115_Sub2((Class505_Sub2_Sub1) class505_sub2, this, class99);
	}

	public boolean method1655(Class115 class115) {
		if (((Class101_Sub1) this).aClass115_Sub2_9265 == class115)
			return true;
		if (!class115.method1899())
			return false;
		boolean bool = method1648();
		((Class101_Sub1) this).aClass115_Sub2_9265 = (Class115_Sub2) class115;
		anInt1015 = method1653(class115, (byte) -8) * -1224879653;
		if (anInt1015 * -401096109 == -1)
			throw new IllegalArgumentException();
		((Class101_Sub1) this).anInt9266 = (((Class115_Sub2) ((Class101_Sub1) this).aClass115_Sub2_9265).anInt9423);
		if (bool) {
			OpenGL.glUseProgram(((Class101_Sub1) this).anInt9266);
			((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189 = ((Class101_Sub1) this).aClass115_Sub2_9265;
		}
		return true;
	}

	Class282_Sub21_Sub1 method1765(Class122 class122) {
		return new Class282_Sub21_Sub1_Sub2(this, class122);
	}

	void method1772() {
		for (int i = 0; i < method1650(1603300975); i++)
			((Class115_Sub2) method1652(i, (byte) 84)).method26();
		super.method1684();
	}

	public void method1647() {
		/* empty */
	}

	public boolean method1648() {
		return ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) == ((Class101_Sub1) this).aClass115_Sub2_9265);
	}

	void method14573() throws Throwable {
		method1684();
		super.finalize();
	}

	public void finalize() throws Throwable {
		method1684();
		super.finalize();
	}

	void method1684() {
		for (int i = 0; i < method1650(2014466092); i++)
			((Class115_Sub2) method1652(i, (byte) 117)).method26();
		super.method1684();
	}

	void method14574() throws Throwable {
		method1684();
		super.finalize();
	}

	public void method1685() {
		if ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) != ((Class101_Sub1) this).aClass115_Sub2_9265) {
			if (((Class101_Sub1) this).aClass115_Sub2_9265 == null)
				throw new RuntimeException_Sub2();
			OpenGL.glUseProgram(((Class101_Sub1) this).anInt9266);
			((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189 = ((Class101_Sub1) this).aClass115_Sub2_9265;
		}
	}

	public void method1686() {
		if ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) != ((Class101_Sub1) this).aClass115_Sub2_9265) {
			if (((Class101_Sub1) this).aClass115_Sub2_9265 == null)
				throw new RuntimeException_Sub2();
			OpenGL.glUseProgram(((Class101_Sub1) this).anInt9266);
			((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189 = ((Class101_Sub1) this).aClass115_Sub2_9265;
		}
	}

	public void method1687() {
		if ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) != ((Class101_Sub1) this).aClass115_Sub2_9265) {
			if (((Class101_Sub1) this).aClass115_Sub2_9265 == null)
				throw new RuntimeException_Sub2();
			OpenGL.glUseProgram(((Class101_Sub1) this).anInt9266);
			((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189 = ((Class101_Sub1) this).aClass115_Sub2_9265;
		}
	}

	public void method1713() {
		/* empty */
	}

	Class115 method1697(Class505_Sub2 class505_sub2, Class99 class99) {
		return new Class115_Sub2((Class505_Sub2_Sub1) class505_sub2, this, class99);
	}

	public void method1678() {
		/* empty */
	}

	public void method1646() {
		if ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) != ((Class101_Sub1) this).aClass115_Sub2_9265) {
			if (((Class101_Sub1) this).aClass115_Sub2_9265 == null)
				throw new RuntimeException_Sub2();
			OpenGL.glUseProgram(((Class101_Sub1) this).anInt9266);
			((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189 = ((Class101_Sub1) this).aClass115_Sub2_9265;
		}
	}

	public boolean method1692() {
		return ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) == ((Class101_Sub1) this).aClass115_Sub2_9265);
	}

	public boolean method1693() {
		return ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) == ((Class101_Sub1) this).aClass115_Sub2_9265);
	}

	public boolean method1734() {
		return ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) == ((Class101_Sub1) this).aClass115_Sub2_9265);
	}

	Class115 method1683(Class505_Sub2 class505_sub2, Class99 class99) {
		return new Class115_Sub2((Class505_Sub2_Sub1) class505_sub2, this, class99);
	}

	public boolean method1664() {
		return ((((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189) == ((Class101_Sub1) this).aClass115_Sub2_9265);
	}

	public void method1690() {
		/* empty */
	}

	public boolean method1706(Class115 class115) {
		if (((Class101_Sub1) this).aClass115_Sub2_9265 == class115)
			return true;
		if (!class115.method1899())
			return false;
		boolean bool = method1648();
		((Class101_Sub1) this).aClass115_Sub2_9265 = (Class115_Sub2) class115;
		anInt1015 = method1653(class115, (byte) -104) * -1224879653;
		if (anInt1015 * -401096109 == -1)
			throw new IllegalArgumentException();
		((Class101_Sub1) this).anInt9266 = (((Class115_Sub2) ((Class101_Sub1) this).aClass115_Sub2_9265).anInt9423);
		if (bool) {
			OpenGL.glUseProgram(((Class101_Sub1) this).anInt9266);
			((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189 = ((Class101_Sub1) this).aClass115_Sub2_9265;
		}
		return true;
	}

	public boolean method1707(Class115 class115) {
		if (((Class101_Sub1) this).aClass115_Sub2_9265 == class115)
			return true;
		if (!class115.method1899())
			return false;
		boolean bool = method1648();
		((Class101_Sub1) this).aClass115_Sub2_9265 = (Class115_Sub2) class115;
		anInt1015 = method1653(class115, (byte) -108) * -1224879653;
		if (anInt1015 * -401096109 == -1)
			throw new IllegalArgumentException();
		((Class101_Sub1) this).anInt9266 = (((Class115_Sub2) ((Class101_Sub1) this).aClass115_Sub2_9265).anInt9423);
		if (bool) {
			OpenGL.glUseProgram(((Class101_Sub1) this).anInt9266);
			((Class505_Sub2_Sub1) ((Class101_Sub1) this).aClass505_Sub2_Sub1_9264).aClass115_Sub2_10189 = ((Class101_Sub1) this).aClass115_Sub2_9265;
		}
		return true;
	}

	Class282_Sub21_Sub1 method1694(Class122 class122) {
		return new Class282_Sub21_Sub1_Sub2(this, class122);
	}

	Class282_Sub21_Sub1 method1712(Class122 class122) {
		return new Class282_Sub21_Sub1_Sub2(this, class122);
	}

	Class115 method1665(Class505_Sub2 class505_sub2, Class99 class99) {
		return new Class115_Sub2((Class505_Sub2_Sub1) class505_sub2, this, class99);
	}
}
