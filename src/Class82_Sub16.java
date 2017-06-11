/* Class82_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub16 extends Class82 {
	int anInt6881;
	int anInt6882;
	int anInt6883;
	int anInt6884;
	Class297 aClass297_6885;
	public static Class427 aClass427_6886;

	public void method866(int i) {
		try {
			((Class82_Sub16) this).aClass297_6885 = (Class239.method2210(-105889067 * ((Class82_Sub16) this).anInt6882, -1362481351 * ((Class82_Sub16) this).anInt6884, 0, -331142053 * ((Class82_Sub16) this).anInt6881, ((Class82_Sub16) this).anInt6883 * 743412087, 1596868518));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yd.f(").append(')').toString());
		}
	}

	public void method869() {
		((Class82_Sub16) this).aClass297_6885 = (Class239.method2210(-105889067 * ((Class82_Sub16) this).anInt6882, -1362481351 * ((Class82_Sub16) this).anInt6884, 0, -331142053 * ((Class82_Sub16) this).anInt6881, ((Class82_Sub16) this).anInt6883 * 743412087, 1426590590));
	}

	Class82_Sub16(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub16) this).anInt6882 = class298_sub53.readUnsignedShort() * 525657725;
		((Class82_Sub16) this).anInt6881 = class298_sub53.readUnsignedByte() * -1118428205;
		((Class82_Sub16) this).anInt6883 = class298_sub53.readUnsignedByte() * -1460627385;
		((Class82_Sub16) this).anInt6884 = class298_sub53.readUnsignedByte() * -216002807;
	}

	public void method868() {
		((Class82_Sub16) this).aClass297_6885 = (Class239.method2210(-105889067 * ((Class82_Sub16) this).anInt6882, -1362481351 * ((Class82_Sub16) this).anInt6884, 0, -331142053 * ((Class82_Sub16) this).anInt6881, ((Class82_Sub16) this).anInt6883 * 743412087, 1563339513));
	}

	void method867(int i) {
		try {
			if (((Class82_Sub16) this).aClass297_6885 != null) {
				Class405.method4957(((Class82_Sub16) this).aClass297_6885, (short) 5723);
				((Class82_Sub16) this).aClass297_6885 = null;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("yd.b(").append(')').toString());
		}
	}

	void method917() {
		if (((Class82_Sub16) this).aClass297_6885 != null) {
			Class405.method4957(((Class82_Sub16) this).aClass297_6885, (short) 27279);
			((Class82_Sub16) this).aClass297_6885 = null;
		}
	}
}
