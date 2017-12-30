
/* Class360_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

public class Class360_Sub2 extends Class360 implements Interface6 {
	int anInt9154;
	boolean aBool9155;
	boolean aBool9156;
	int anInt9157;

	public boolean method46() {
		return true;
	}

	public void method48(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		if (((Class360_Sub2) this).aClass150_4167 != Class150.aClass150_1949 || ((Class360_Sub2) this).aClass76_4164 != Class76.aClass76_751)
			throw new RuntimeException();
		if (i_4_ == 0)
			i_4_ = i_1_;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_3_, i_4_ * i_2_);
		IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, i, i_0_, i_1_, i_2_, i_4_ * (((Class360_Sub2) this).aClass150_4167.anInt1959 * 351642797), 0, ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695);
	}

	public void method66(int i, int i_5_, int i_6_, int i_7_, int[] is, int i_8_, int i_9_) {
		if (((Class360_Sub2) this).aClass150_4167 != Class150.aClass150_1949 || ((Class360_Sub2) this).aClass76_4164 != Class76.aClass76_751)
			throw new RuntimeException();
		if (i_9_ == 0)
			i_9_ = i_6_;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_8_, i_9_ * i_7_);
		IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, i, i_5_, i_6_, i_7_, i_9_ * (((Class360_Sub2) this).aClass150_4167.anInt1959 * 351642797), 0, ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695);
	}

	Class360_Sub2(Class505_Sub2_Sub2 class505_sub2_sub2, Class150 class150, int i, int i_10_, boolean bool, byte[] is, int i_11_, int i_12_) {
		super(class505_sub2_sub2, class150, Class76.aClass76_751, bool && ((Class505_Sub2_Sub2) class505_sub2_sub2).aBool10263, i * i_10_);
		if (!((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aBool10265) {
			((Class360_Sub2) this).anInt9154 = Class323.nextPowerOfTwo(i, -401816318);
			((Class360_Sub2) this).anInt9157 = Class323.nextPowerOfTwo(i_10_, -1632403262);
		} else {
			((Class360_Sub2) this).anInt9154 = i;
			((Class360_Sub2) this).anInt9157 = i_10_;
		}
		if (bool)
			((Class360_Sub2) this).aLong4168 = (IDirect3DDevice.CreateTexture((((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aLong10252), ((Class360_Sub2) this).anInt9154, ((Class360_Sub2) this).anInt9157, 0, 1024, Class505_Sub2_Sub2.method15652((((Class360_Sub2) this).aClass150_4167), Class76.aClass76_751), 1));
		else
			((Class360_Sub2) this).aLong4168 = (IDirect3DDevice.CreateTexture((((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aLong10252), ((Class360_Sub2) this).anInt9154, ((Class360_Sub2) this).anInt9157, 1, 0, Class505_Sub2_Sub2.method15652((((Class360_Sub2) this).aClass150_4167), Class76.aClass76_751), 1));
		if (i_12_ == 0)
			i_12_ = i;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		Class150 class150_13_ = ((Class360_Sub2) this).aClass150_4167;
		if (((Class360_Sub2) this).aClass150_4167 != null) {
			/* empty */
		}
		if (class150_13_ == Class150.aClass150_1956) {
			bytebuffer.put(is, i_11_, i_10_ * i / 2);
			IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, 0, 0, i, i_10_ / 4, i / 4 * 8, 0, (((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695));
		} else {
			Class150 class150_14_ = ((Class360_Sub2) this).aClass150_4167;
			if (((Class360_Sub2) this).aClass150_4167 != null) {
				/* empty */
			}
			if (class150_14_ == Class150.aClass150_1957) {
				bytebuffer.put(is, i_11_, i_10_ * i);
				IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, 0, 0, i, i_10_ / 4, i / 4 * 16, 0, (((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695));
			} else {
				bytebuffer.put(is, i_11_, i_12_ * i_10_);
				IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, 0, 0, i, i_10_, i_12_ * ((((Class360_Sub2) this).aClass150_4167.anInt1959) * 351642797), 0, (((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695));
			}
		}
	}

	public boolean method63() {
		return true;
	}

	Class360_Sub2(Class505_Sub2_Sub2 class505_sub2_sub2, Class150 class150, Class76 class76, int i, int i_15_, int i_16_, int i_17_) {
		super(class505_sub2_sub2, class150, class76, false, i * i_15_);
		if (!((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aBool10265) {
			((Class360_Sub2) this).anInt9154 = Class323.nextPowerOfTwo(i, 72788545);
			((Class360_Sub2) this).anInt9157 = Class323.nextPowerOfTwo(i_15_, -1380222378);
		} else {
			((Class360_Sub2) this).anInt9154 = i;
			((Class360_Sub2) this).anInt9157 = i_15_;
		}
		((Class360_Sub2) this).aLong4168 = (IDirect3DDevice.CreateTexture(((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aLong10252, i, i_15_, 0, i_16_, Class505_Sub2_Sub2.method15652((((Class360_Sub2) this).aClass150_4167), (((Class360_Sub2) this).aClass76_4164)), i_17_));
	}

	long method6245() {
		return ((Class360_Sub2) this).aLong4168;
	}

	public int method36() {
		return ((Class360_Sub2) this).anInt9154;
	}

	public float method62(float f) {
		return f / (float) ((Class360_Sub2) this).anInt9157;
	}

	Class360_Sub2(Class505_Sub2_Sub2 class505_sub2_sub2, Class150 class150, int i, int i_18_, boolean bool, float[] fs, int i_19_, int i_20_) {
		super(class505_sub2_sub2, class150, Class76.aClass76_751, bool && ((Class505_Sub2_Sub2) class505_sub2_sub2).aBool10263, i * i_18_);
		if (!((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aBool10265) {
			((Class360_Sub2) this).anInt9154 = Class323.nextPowerOfTwo(i, 98224599);
			((Class360_Sub2) this).anInt9157 = Class323.nextPowerOfTwo(i_18_, -1607346569);
		} else {
			((Class360_Sub2) this).anInt9154 = i;
			((Class360_Sub2) this).anInt9157 = i_18_;
		}
		if (bool)
			((Class360_Sub2) this).aLong4168 = (IDirect3DDevice.CreateTexture((((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aLong10252), ((Class360_Sub2) this).anInt9154, ((Class360_Sub2) this).anInt9157, 0, 1024, Class505_Sub2_Sub2.method15652((((Class360_Sub2) this).aClass150_4167), Class76.aClass76_758), 1));
		else
			((Class360_Sub2) this).aLong4168 = (IDirect3DDevice.CreateTexture((((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aLong10252), ((Class360_Sub2) this).anInt9154, ((Class360_Sub2) this).anInt9157, 1, 0, Class505_Sub2_Sub2.method15652((((Class360_Sub2) this).aClass150_4167), Class76.aClass76_758), 1));
		if (i_20_ == 0)
			i_20_ = i;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.asFloatBuffer().put(fs, i_19_, i_20_ * i_18_ * ((((Class360_Sub2) this).aClass150_4167.anInt1959) * 351642797));
		IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, 0, 0, i, i_18_, i_20_ * (((Class360_Sub2) this).aClass150_4167.anInt1959 * 351642797) * 4, 0, ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695);
	}

	public void method52(int i, int i_21_, int i_22_, int i_23_, byte[] is, Class150 class150, int i_24_, int i_25_) {
		if (((Class360_Sub2) this).aClass150_4167 != class150 || ((Class360_Sub2) this).aClass76_4164 != Class76.aClass76_751)
			throw new RuntimeException();
		if (i_25_ == 0)
			i_25_ = i_22_;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.put(is, i_24_, i_25_ * i_23_);
		IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, i, i_21_, i_22_, i_23_, i_25_ * (((Class360_Sub2) this).aClass150_4167.anInt1959 * 351642797), 0, ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695);
	}

	public void method204(Class35 class35) {
		super.method205(class35);
	}

	public void method50(boolean bool, boolean bool_26_) {
		((Class360_Sub2) this).aBool9156 = bool;
		((Class360_Sub2) this).aBool9155 = bool_26_;
	}

	public void method201(Class35 class35) {
		super.method205(class35);
	}

	Class360_Sub2(Class505_Sub2_Sub2 class505_sub2_sub2, Class150 class150, Class76 class76, int i, int i_27_) {
		this(class505_sub2_sub2, class150, class76, i, i_27_, 0, 1);
	}

	public void method53(int i, int i_28_, int i_29_, int i_30_, int[] is, int i_31_) {
		if (((Class360_Sub2) this).aClass150_4167 != Class150.aClass150_1949 || ((Class360_Sub2) this).aClass76_4164 != Class76.aClass76_751)
			throw new RuntimeException();
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class360_Sub2) this).aLong4168, 0, i, i_28_, i_29_, i_30_, i_29_ * 4, 0, (((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695));
		bytebuffer.asIntBuffer().get(is, i_31_, i_29_ * i_30_);
	}

	public void method207() {
		((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.method15647(this);
	}

	public float method47(float f) {
		return f / (float) ((Class360_Sub2) this).anInt9154;
	}

	public void method26() {
		super.method26();
	}

	Class360_Sub2(Class505_Sub2_Sub2 class505_sub2_sub2, int i, int i_32_, boolean bool, int[] is, int i_33_, int i_34_) {
		super(class505_sub2_sub2, Class150.aClass150_1949, Class76.aClass76_751, bool && ((Class505_Sub2_Sub2) class505_sub2_sub2).aBool10263, i * i_32_);
		if (!((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aBool10265) {
			((Class360_Sub2) this).anInt9154 = Class323.nextPowerOfTwo(i, 1990331952);
			((Class360_Sub2) this).anInt9157 = Class323.nextPowerOfTwo(i_32_, -173988631);
		} else {
			((Class360_Sub2) this).anInt9154 = i;
			((Class360_Sub2) this).anInt9157 = i_32_;
		}
		if (bool)
			((Class360_Sub2) this).aLong4168 = (IDirect3DDevice.CreateTexture((((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aLong10252), ((Class360_Sub2) this).anInt9154, ((Class360_Sub2) this).anInt9157, 0, 1024, 21, 1));
		else
			((Class360_Sub2) this).aLong4168 = (IDirect3DDevice.CreateTexture((((Class505_Sub2_Sub2) ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165).aLong10252), ((Class360_Sub2) this).anInt9154, ((Class360_Sub2) this).anInt9157, 1, 0, 21, 1));
		if (i_34_ == 0)
			i_34_ = i;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_33_, i_34_ * i_32_);
		IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, 0, 0, i, i_32_, i_34_ * (((Class360_Sub2) this).aClass150_4167.anInt1959 * 351642797), 0, ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695);
	}

	public int method55() {
		return ((Class360_Sub2) this).anInt9154;
	}

	public int method59() {
		return ((Class360_Sub2) this).anInt9157;
	}

	public int method57() {
		return ((Class360_Sub2) this).anInt9154;
	}

	public int method70() {
		return ((Class360_Sub2) this).anInt9154;
	}

	public float method65(float f) {
		return f / (float) ((Class360_Sub2) this).anInt9154;
	}

	public float method56(float f) {
		return f / (float) ((Class360_Sub2) this).anInt9154;
	}

	public float method45(float f) {
		return f / (float) ((Class360_Sub2) this).anInt9154;
	}

	public float method60(float f) {
		return f / (float) ((Class360_Sub2) this).anInt9157;
	}

	public boolean method54() {
		return false;
	}

	public float method51(float f) {
		return f / (float) ((Class360_Sub2) this).anInt9157;
	}

	public int method1() {
		return ((Class360_Sub2) this).anInt9154;
	}

	public void method64(boolean bool, boolean bool_35_) {
		((Class360_Sub2) this).aBool9156 = bool;
		((Class360_Sub2) this).aBool9155 = bool_35_;
	}

	public void method61(int i, int i_36_, int i_37_, int i_38_, int[] is, int i_39_, int i_40_) {
		if (((Class360_Sub2) this).aClass150_4167 != Class150.aClass150_1949 || ((Class360_Sub2) this).aClass76_4164 != Class76.aClass76_751)
			throw new RuntimeException();
		if (i_40_ == 0)
			i_40_ = i_37_;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_39_, i_40_ * i_38_);
		IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, i, i_36_, i_37_, i_38_, i_40_ * (((Class360_Sub2) this).aClass150_4167.anInt1959 * 351642797), 0, ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695);
	}

	public void method205(Class35 class35) {
		super.method205(class35);
	}

	public void method67(int i, int i_41_, int i_42_, int i_43_, int[] is, int i_44_, int i_45_) {
		if (((Class360_Sub2) this).aClass150_4167 != Class150.aClass150_1949 || ((Class360_Sub2) this).aClass76_4164 != Class76.aClass76_751)
			throw new RuntimeException();
		if (i_45_ == 0)
			i_45_ = i_42_;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.asIntBuffer().put(is, i_44_, i_45_ * i_43_);
		IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, i, i_41_, i_42_, i_43_, i_45_ * (((Class360_Sub2) this).aClass150_4167.anInt1959 * 351642797), 0, ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695);
	}

	public void method68(int i, int i_46_, int i_47_, int i_48_, byte[] is, Class150 class150, int i_49_, int i_50_) {
		if (((Class360_Sub2) this).aClass150_4167 != class150 || ((Class360_Sub2) this).aClass76_4164 != Class76.aClass76_751)
			throw new RuntimeException();
		if (i_50_ == 0)
			i_50_ = i_47_;
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		bytebuffer.put(is, i_49_, i_50_ * i_48_);
		IDirect3DTexture.Upload(((Class360_Sub2) this).aLong4168, 0, i, i_46_, i_47_, i_48_, i_50_ * (((Class360_Sub2) this).aClass150_4167.anInt1959 * 351642797), 0, ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695);
	}

	public void method69(int i, int i_51_, int i_52_, int i_53_, int[] is, int i_54_) {
		if (((Class360_Sub2) this).aClass150_4167 != Class150.aClass150_1949 || ((Class360_Sub2) this).aClass76_4164 != Class76.aClass76_751)
			throw new RuntimeException();
		ByteBuffer bytebuffer = ((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aByteBuffer8838;
		bytebuffer.clear();
		IDirect3DTexture.Download(((Class360_Sub2) this).aLong4168, 0, i, i_51_, i_52_, i_53_, i_52_ * 4, 0, (((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.aLong8695));
		bytebuffer.asIntBuffer().get(is, i_54_, i_52_ * i_53_);
	}

	public boolean method49() {
		return false;
	}

	public void method203() {
		((Class360_Sub2) this).aClass505_Sub2_Sub2_4165.method15647(this);
	}

	public void method32() {
		super.method26();
	}

	public void method206(Class35 class35) {
		super.method205(class35);
	}

	public float method58(float f) {
		return f / (float) ((Class360_Sub2) this).anInt9157;
	}

	public void method202(Class35 class35) {
		super.method205(class35);
	}

	long method6249() {
		return ((Class360_Sub2) this).aLong4168;
	}

	public int method71() {
		return ((Class360_Sub2) this).anInt9157;
	}

	public int method72() {
		return ((Class360_Sub2) this).anInt9157;
	}
}
