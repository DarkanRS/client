
/* Class360_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

public class Class360_Sub3 extends Class360 implements Interface31 {
	int anInt9200;

	public void method203() {
		((Class360_Sub3) this).aClass505_Sub2_Sub2_4165.method15662(this);
	}

	Class360_Sub3(Class505_Sub2_Sub2 class505_sub2_sub2, int i, boolean bool, int[][] is) {
		super(class505_sub2_sub2, Class150.aClass150_1949, Class76.aClass76_751, bool && ((Class505_Sub2_Sub2) class505_sub2_sub2).aBool10247, i * i * 6);
		((Class360_Sub3) this).anInt9200 = i;
		if (((Class360_Sub3) this).aBool4166)
			((Class360_Sub3) this).aLong4168 = (IDirect3DDevice.CreateCubeTexture((((Class505_Sub2_Sub2) ((Class360_Sub3) this).aClass505_Sub2_Sub2_4165).aLong10252), ((Class360_Sub3) this).anInt9200, 0, 1024, 21, 1));
		else
			((Class360_Sub3) this).aLong4168 = (IDirect3DDevice.CreateCubeTexture((((Class505_Sub2_Sub2) ((Class360_Sub3) this).aClass505_Sub2_Sub2_4165).aLong10252), ((Class360_Sub3) this).anInt9200, 1, 0, 21, 1));
		ByteBuffer bytebuffer = ((Class360_Sub3) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		for (int i_0_ = 0; i_0_ < 6; i_0_++) {
			bytebuffer.clear();
			bytebuffer.asIntBuffer().put(is[i_0_]);
			IDirect3DCubeTexture.Upload(((Class360_Sub3) this).aLong4168, i_0_, 0, 0, 0, ((Class360_Sub3) this).anInt9200, ((Class360_Sub3) this).anInt9200, ((Class360_Sub3) this).anInt9200 * 4, 0, (((Class360_Sub3) this).aClass505_Sub2_Sub2_4165.aLong8695));
		}
	}

	public void method26() {
		super.method26();
	}

	public void method205(Class35 class35) {
		super.method205(class35);
	}

	public void method32() {
		super.method26();
	}

	public void method202(Class35 class35) {
		super.method205(class35);
	}

	public void method204(Class35 class35) {
		super.method205(class35);
	}

	public void method207() {
		((Class360_Sub3) this).aClass505_Sub2_Sub2_4165.method15662(this);
	}

	public void method201(Class35 class35) {
		super.method205(class35);
	}

	public void method206(Class35 class35) {
		super.method205(class35);
	}
}
