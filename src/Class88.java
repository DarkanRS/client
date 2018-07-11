
/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;

public class Class88 {
	public static final int anInt849 = 7;
	public static final int anInt850 = 2;
	public static final int anInt851 = 4;
	public static final int anInt852 = 16;
	public static final int anInt853 = 32;
	public static final int anInt854 = 4;
	public static final int anInt855 = 1;
	public static final int anInt856 = 2;
	public static final int anInt857 = 2;
	public static final int anInt858 = 1;
	public static final int anInt859 = 2;
	public static final int anInt860 = 16;
	public static final int anInt861 = 32;
	public static final int anInt862 = 128;
	public static final int anInt863 = 8;
	public static final int anInt864 = 2;
	public static final int anInt865 = 1024;
	public static final int anInt866 = 0;
	public static final int anInt867 = 4096;
	public static final int anInt868 = 8192;
	public static final int anInt869 = 5;
	public static final int anInt870 = 32768;
	public static final int anInt871 = 65536;
	public static final int anInt872 = 131072;
	public static final int anInt873 = 2;
	public static final int anInt874 = 524288;
	public static final int anInt875 = 1048576;
	public static final int anInt876 = 1;
	public static final int anInt877 = 3;
	public static final int anInt878 = 1;
	public static final int anInt879 = 64;
	public static final int anInt880 = 1;
	public static final int anInt881 = 2;
	public static final float aFloat882 = 1.0F;
	public static final int anInt883 = 16384;
	public static final int anInt884 = 16;
	public static final int anInt885 = 262144;
	public static final int anInt886 = 1;
	public static final int anInt887 = 2;
	public static final int anInt888 = 2;
	public static final int anInt889 = 1;
	public static final int anInt890 = 2;
	public static final int anInt891 = 3;
	public static final int anInt892 = 4;
	public static final int anInt893 = 1;
	public static final int anInt894 = 1;
	public static final int anInt895 = 2;
	public static final int anInt896 = 0;
	public static final int anInt897 = 1;
	public static final int anInt898 = 2;
	public static final int anInt899 = 4;
	public static final int anInt900 = 0;
	public static final int anInt901 = 8;
	public static final int anInt902 = 3;
	public static final int anInt903 = 0;
	public static final int anInt904 = 1;
	public static final float aFloat905 = 1.0F;
	public static final int anInt906 = 256;
	public static final int anInt907 = 4;
	public static final int anInt908 = 5;
	public static final int anInt909 = 0;
	public static final int anInt910 = 1;
	public static final int anInt911 = 32;
	public static final int anInt912 = 3;
	public static final int anInt913 = 4;
	public static final int anInt914 = 0;
	public static final float aFloat915 = 1.0F;
	public static final float aFloat916 = 0.25F;
	public static final int anInt917 = 15;
	static final float aFloat918 = 0.0F;
	static final float aFloat919 = 1.0F;
	public static final int anInt920 = 512;
	public static final int anInt921 = 1;
	public static final int anInt922 = 2;
	public static final int anInt923 = 4;
	public static final int anInt924 = 1;
	public static final int anInt925 = 4;
	public static final int anInt926 = 4;
	public static final int anInt927 = 8;
	public static final int anInt928 = 2048;
	public static final int anInt929 = 7;

	Class88() throws Throwable {
		throw new Error();
	}

	static synchronized GraphicalRenderer method1493(int i, Canvas canvas, Interface22 interface22, Index class317, int i_0_, int i_1_, int i_2_, byte i_3_) {
		if (0 == i)
			return Class109_Sub1.method14652(canvas, interface22, i_1_, i_2_, (byte) -124);
		if (i == 2)
			return FontRenderer.method404(canvas, interface22, i_1_, i_2_, 596227505);
		if (i == 1)
			return Class171.method2909(canvas, interface22, i_0_);
		if (5 == i)
			return Class315.getOpenGLRenderer(canvas, interface22, class317, i_0_);
		if (i == 3)
			return Class374.getDirectXRenderer(canvas, interface22, class317, i_0_);
		throw new IllegalArgumentException("");
	}

	static final void method1494(IComponentDefinitions class118, CS2Executor class527, byte i) {
		int i_4_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		int i_5_ = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) - 1);
		if (class118.anInt1329 * 2131324949 != 2)
			throw new RuntimeException("");
		NPCDefinitions class409 = IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(class118.anInt1330 * -402732635, (byte) -49);
		if (null == class118.aClass417_1308)
			class118.aClass417_1308 = new Class417(class409, false);
		class118.aClass417_1308.aLong4993 = Class86.method1480(1471250768) * 7197667099348947907L;
		if (i_5_ < 0 || i_5_ >= class409.anIntArray4860.length)
			throw new RuntimeException("");
		class118.aClass417_1308.anIntArray4992[i_5_] = i_4_;
		Class109.method1858(class118, (byte) 54);
	}

	static void method1495(String[] strings, short[] is, int i, int i_6_, int i_7_) {
		if (i < i_6_) {
			int i_8_ = (i + i_6_) / 2;
			int i_9_ = i;
			String string = strings[i_8_];
			strings[i_8_] = strings[i_6_];
			strings[i_6_] = string;
			short i_10_ = is[i_8_];
			is[i_8_] = is[i_6_];
			is[i_6_] = i_10_;
			for (int i_11_ = i; i_11_ < i_6_; i_11_++) {
				if (string == null || (null != strings[i_11_] && strings[i_11_].compareTo(string) < (i_11_ & 0x1))) {
					String string_12_ = strings[i_11_];
					strings[i_11_] = strings[i_9_];
					strings[i_9_] = string_12_;
					short i_13_ = is[i_11_];
					is[i_11_] = is[i_9_];
					is[i_9_++] = i_13_;
				}
			}
			strings[i_6_] = strings[i_9_];
			strings[i_9_] = string;
			is[i_6_] = is[i_9_];
			is[i_9_] = i_10_;
			method1495(strings, is, i, i_9_ - 1, -109372868);
			method1495(strings, is, 1 + i_9_, i_6_, -805435373);
		}
	}
}
