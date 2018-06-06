/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class48 {
	public Vector3 aClass385_448;
	protected Class505_Sub2 aClass505_Sub2_449;
	public float[] aFloatArray450 = new float[16];
	public Interface31 anInterface31_451;
	public Interface6 anInterface6_452;
	protected float aFloat453;
	public Matrix44Arr aClass384_454;
	public Vector3 aClass385_455;
	protected float aFloat456;
	public Vector3 aClass385_457;
	public Vector4 aClass303_458;
	public Vector3 aClass385_459;
	public Vector4 aClass303_460;
	public Vector3 aClass385_461;
	static final int anInt462 = 4;
	public float[] aFloatArray463 = new float[16];
	public Vector3 aClass385_464;
	public Matrix44Arr aClass384_465;
	public Vector3 aClass385_466;
	public int anInt467;
	public int anInt468;
	public int anInt469;
	public int anInt470;

	public abstract void method943();

	public void method944(Class169 class169) {
		switch (class169.aByte2076) {
		case 1:
			aFloat456 = 32.0F;
			aFloat453 = 0.5F;
			break;
		case 3:
			aFloat456 = 2.0F;
			aFloat453 = 0.8F;
			break;
		case 2:
			aFloat456 = 4.0F;
			aFloat453 = 0.65F;
			break;
		}
	}

	public abstract void method945(int i);

	public abstract void method946(boolean bool);

	public abstract void method947(int i);

	public abstract void method948(int i);

	public abstract void method949(int i);

	public abstract void method950();

	public abstract void method951(Matrix44Arr class384);

	public abstract void method952(Matrix44Arr class384);

	public abstract void method953(Matrix44Arr class384);

	public abstract void method954(boolean bool);

	Class48(Class505_Sub2 class505_sub2) {
		aClass384_454 = new Matrix44Arr();
		aClass385_455 = new Vector3();
		aClass303_458 = new Vector4();
		aClass385_459 = new Vector3();
		aClass303_460 = new Vector4();
		aClass385_457 = new Vector3();
		aClass385_466 = new Vector3();
		aClass385_448 = new Vector3();
		aClass385_464 = new Vector3();
		aClass385_461 = new Vector3();
		aClass384_465 = new Matrix44Arr();
		aClass505_Sub2_449 = class505_sub2;
	}

	public abstract void method955(boolean bool);

	public abstract void method956(boolean bool);

	public abstract void method957(Matrix44Arr class384);

	public abstract void method958(int i);

	public abstract void method959(int i);

	public abstract void method960(int i);

	public abstract void method961(int i);

	public abstract void method962(int i);

	public abstract void method963(Matrix44Arr class384);

	public abstract void method964(int i);

	public abstract void method965(int i);

	public abstract void method966();

	public abstract void method967(Matrix44Arr class384);
}
