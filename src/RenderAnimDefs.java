
/* Class227 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.Iterator;

public class RenderAnimDefs {
	public int renderAnimId;
	public int anInt2786;
	public boolean aBool2787;
	RenderAnimIndexLoader aClass211_2788;
	public int[] anIntArray2789;
	public int anInt2790;
	public int[][] anIntArrayArray2791;
	public int walkDir2;
	public int walkAnimation;
	public int walkDir3;
	public int walkDir4;
	public int walkDir5;
	public int anInt2797;
	public int anInt2798;
	public int anInt2799;
	public int anInt2800;
	public int anInt2801;
	public int[][] anIntArrayArray2802;
	public int anInt2803;
	public int anInt2804;
	Matrix44Var[] aClass294Array2805;
	public int anInt2806;
	public int anInt2807;
	public int anInt2808;
	public int anInt2809;
	public int anInt2810;
	public int[] anIntArray2811;
	public int anInt2812;
	public int anInt2813;
	public int[] anIntArray2814;
	public int anInt2815;
	public int anInt2816;
	public int walkDir6;
	public int[] anIntArray2818;
	public int defaultStandAnimation = 1841483755;
	public int anInt2820;
	public int walkDir1;
	int anInt2822;
	public int anInt2823;
	public int anInt2824;
	public int anInt2825;
	public int anInt2826;
	public int anInt2827;
	public int anInt2828;
	public int anInt2829;
	public int anInt2830;
	static int anInt2831;

	void method3808(RsByteBuffer stream, int opcode, int i_0_) {
		if (1 == opcode) {
			defaultStandAnimation = stream.readBigSmart() * -1841483755;
			walkAnimation = stream.readBigSmart() * -1282270303;
		} else if (2 == opcode)
			anInt2801 = stream.readBigSmart() * 1440309881;
		else if (opcode == 3)
			anInt2828 = stream.readBigSmart() * -9280901;
		else if (opcode == 4)
			anInt2803 = stream.readBigSmart() * -1367558181;
		else if (5 == opcode)
			anInt2812 = stream.readBigSmart() * -1330842743;
		else if (opcode == 6)
			anInt2797 = stream.readBigSmart() * 1796346719;
		else if (opcode == 7)
			walkDir6 = stream.readBigSmart() * 619103101;
		else if (8 == opcode)
			anInt2799 = stream.readBigSmart() * 1275461135;
		else if (opcode == 9)
			anInt2800 = stream.readBigSmart() * -356781757;
		else if (26 == opcode) {
			anInt2786 = ((short) (stream.readUnsignedByte() * 4) * 1845638735);
			anInt2829 = ((short) (stream.readUnsignedByte() * 4) * -588956041);
		} else if (opcode == 27) {
			if (anIntArrayArray2802 == null)
				anIntArrayArray2802 = new int[(((RenderAnimIndexLoader) ((RenderAnimDefs) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_1_ = stream.readUnsignedByte();
			anIntArrayArray2802[i_1_] = new int[6];
			for (int i_2_ = 0; i_2_ < 6; i_2_++)
				anIntArrayArray2802[i_1_][i_2_] = stream.readShort(1960954063);
		} else if (opcode == 28) {
			int i_3_ = stream.readUnsignedByte();
			anIntArray2811 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				anIntArray2811[i_4_] = stream.readUnsignedByte();
				if (255 == anIntArray2811[i_4_])
					anIntArray2811[i_4_] = -1;
			}
		} else if (29 == opcode)
			anInt2820 = stream.readUnsignedByte() * -987374717;
		else if (30 == opcode)
			anInt2804 = stream.readUnsignedShort() * 257558101;
		else if (opcode == 31)
			anInt2825 = stream.readUnsignedByte() * -311542087;
		else if (32 == opcode)
			anInt2823 = stream.readUnsignedShort() * 2100277747;
		else if (33 == opcode)
			anInt2824 = stream.readShort(1858209964) * -472559017;
		else if (opcode == 34)
			anInt2816 = stream.readUnsignedByte() * -1099146947;
		else if (opcode == 35)
			anInt2815 = stream.readUnsignedShort() * 510177299;
		else if (36 == opcode)
			anInt2827 = stream.readShort(1666231467) * 50774847;
		else if (37 == opcode)
			anInt2826 = stream.readUnsignedByte() * -1731992137;
		else if (38 == opcode)
			walkDir1 = stream.readBigSmart() * -967389061;
		else if (opcode == 39)
			walkDir2 = stream.readBigSmart() * 1725030595;
		else if (opcode == 40)
			walkDir3 = stream.readBigSmart() * -1544163167;
		else if (41 == opcode)
			walkDir4 = stream.readBigSmart() * -963929139;
		else if (42 == opcode)
			walkDir5 = stream.readBigSmart() * -1607820639;
		else if (opcode == 43)
			stream.readUnsignedShort();
		else if (opcode == 44)
			stream.readUnsignedShort();
		else if (45 == opcode)
			anInt2798 = stream.readUnsignedShort() * -286307705;
		else if (46 == opcode)
			anInt2830 = stream.readBigSmart() * -1358044133;
		else if (opcode == 47)
			anInt2806 = stream.readBigSmart() * -602180007;
		else if (opcode == 48)
			anInt2807 = stream.readBigSmart() * -311781873;
		else if (49 == opcode)
			anInt2808 = stream.readBigSmart() * 1032347705;
		else if (opcode == 50)
			anInt2809 = stream.readBigSmart() * 1310162937;
		else if (opcode == 51)
			anInt2810 = stream.readBigSmart() * -1871121921;
		else if (52 == opcode) {
			int i_5_ = stream.readUnsignedByte();
			anIntArray2814 = new int[i_5_];
			anIntArray2789 = new int[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				anIntArray2814[i_6_] = stream.readBigSmart();
				int i_7_ = stream.readUnsignedByte();
				anIntArray2789[i_6_] = i_7_;
				((RenderAnimDefs) this).anInt2822 += -685147451 * i_7_;
			}
		} else if (53 == opcode)
			aBool2787 = false;
		else if (opcode == 54) {
			anInt2813 = (stream.readUnsignedByte() << 6) * -4475195;
			anInt2790 = (stream.readUnsignedByte() << 6) * 1862251257;
		} else if (opcode == 55) {
			if (anIntArray2818 == null)
				anIntArray2818 = new int[(((RenderAnimIndexLoader) ((RenderAnimDefs) this).aClass211_2788).aClass526_2672.equipmentSlots).length];
			int i_8_ = stream.readUnsignedByte();
			anIntArray2818[i_8_] = stream.readUnsignedShort();
		} else if (opcode == 56) {
			if (null == anIntArrayArray2791)
				anIntArrayArray2791 = new int[(((RenderAnimIndexLoader) ((RenderAnimDefs) this).aClass211_2788).aClass526_2672.equipmentSlots).length][];
			int i_9_ = stream.readUnsignedByte();
			anIntArrayArray2791[i_9_] = new int[3];
			for (int i_10_ = 0; i_10_ < 3; i_10_++)
				anIntArrayArray2791[i_9_][i_10_] = stream.readShort(2037322066);
		}
	}

	RenderAnimDefs() {
		anIntArray2814 = null;
		anIntArray2789 = null;
		anInt2822 = 0;
		walkDir1 = 967389061;
		walkDir2 = -1725030595;
		walkAnimation = 1282270303;
		walkDir3 = 1544163167;
		walkDir4 = 963929139;
		walkDir5 = 1607820639;
		anInt2797 = -1796346719;
		walkDir6 = -619103101;
		anInt2799 = -1275461135;
		anInt2800 = 356781757;
		anInt2801 = -1440309881;
		anInt2828 = 9280901;
		anInt2803 = 1367558181;
		anInt2812 = 1330842743;
		anInt2830 = 1358044133;
		anInt2806 = 602180007;
		anInt2807 = 311781873;
		anInt2808 = -1032347705;
		anInt2809 = -1310162937;
		anInt2810 = 1871121921;
		anInt2786 = 0;
		anInt2829 = 0;
		anInt2813 = 0;
		anInt2790 = 0;
		anInt2820 = 0;
		anInt2804 = 0;
		anInt2825 = 0;
		anInt2823 = 0;
		anInt2824 = 0;
		anInt2816 = 0;
		anInt2815 = 0;
		anInt2827 = 0;
		anInt2826 = 1731992137;
		anInt2798 = 286307705;
		aBool2787 = true;
	}

	public int method3809(int d) {
		if (-1 != (defaultStandAnimation * -243982531))
			return -243982531 * defaultStandAnimation;
		if (anIntArray2814 != null) {
			int i_11_ = (int) (Math.random() * (double) (1953362957 * ((RenderAnimDefs) this).anInt2822));
			int i_12_;
			for (i_12_ = 0; i_11_ >= anIntArray2789[i_12_]; i_12_++)
				i_11_ -= anIntArray2789[i_12_];
			return anIntArray2814[i_12_];
		}
		return -1;
	}

	public boolean method3810(int i, int i_13_) {
		if (i == -1)
			return false;
		if (i == (-243982531 * defaultStandAnimation))
			return true;
		if (null != anIntArray2814) {
			for (int i_14_ = 0; i_14_ < anIntArray2814.length; i_14_++) {
				if (anIntArray2814[i_14_] == i)
					return true;
			}
		}
		return false;
	}

	public Matrix44Var[] method3811(byte i) {
		if (((RenderAnimDefs) this).aClass294Array2805 != null)
			return ((RenderAnimDefs) this).aClass294Array2805;
		if (null == anIntArrayArray2802)
			return null;
		((RenderAnimDefs) this).aClass294Array2805 = new Matrix44Var[anIntArrayArray2802.length];
		for (int i_15_ = 0; i_15_ < anIntArrayArray2802.length; i_15_++) {
			int i_16_ = 0;
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;
			int i_21_ = 0;
			if (null != anIntArrayArray2802[i_15_]) {
				i_16_ = anIntArrayArray2802[i_15_][0];
				i_17_ = anIntArrayArray2802[i_15_][1];
				i_18_ = anIntArrayArray2802[i_15_][2];
				i_19_ = anIntArrayArray2802[i_15_][3] << 3;
				i_20_ = anIntArrayArray2802[i_15_][4] << 3;
				i_21_ = anIntArrayArray2802[i_15_][5] << 3;
			}
			if (0 != i_16_ || i_17_ != 0 || 0 != i_18_ || 0 != i_19_ || i_20_ != 0 || 0 != i_21_) {
				Matrix44Var class294 = (((RenderAnimDefs) this).aClass294Array2805[i_15_] = new Matrix44Var());
				if (i_21_ != 0)
					class294.method5220(0.0F, 0.0F, 1.0F, Class382.method6508(i_21_));
				if (i_19_ != 0)
					class294.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(i_19_));
				if (i_20_ != 0)
					class294.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(i_20_));
				class294.method5219((float) i_16_, (float) i_17_, (float) i_18_);
			}
		}
		return ((RenderAnimDefs) this).aClass294Array2805;
	}

	void method3821(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_59_ = class282_sub35.readUnsignedByte();
			if (0 == i_59_)
				break;
			method3808(class282_sub35, i_59_, -374840735);
		}
	}

	public int[] method3828(int i) {
		IterableNodeMap class465 = new IterableNodeMap(16);
		Class1.method253(-243982531 * defaultStandAnimation, class465, 1339333196);
		if (anIntArray2814 != null) {
			int[] is = anIntArray2814;
			for (int i_76_ = 0; i_76_ < is.length; i_76_++) {
				int i_77_ = is[i_76_];
				Class1.method253(i_77_, class465, -371482637);
			}
		}
		Class1.method253(1350078131 * walkDir1, class465, 936766272);
		Class1.method253(997445611 * walkDir2, class465, 617830168);
		Class1.method253(-1556707231 * walkAnimation, class465, 622026359);
		Class1.method253(walkDir3 * -670567583, class465, -1286273225);
		Class1.method253(-1950693115 * walkDir4, class465, 1136269352);
		Class1.method253(walkDir5 * -762066591, class465, 981784054);
		Class1.method253(anInt2797 * -474675041, class465, -432276567);
		Class1.method253(walkDir6 * 486149589, class465, -24099782);
		Class1.method253(anInt2799 * 1642803439, class465, -472783883);
		Class1.method253(anInt2800 * -833477781, class465, 843907387);
		Class1.method253(2055956425 * anInt2801, class465, -622930621);
		Class1.method253(1053306035 * anInt2828, class465, -405283185);
		Class1.method253(anInt2803 * 1879075923, class465, -576014447);
		Class1.method253(anInt2812 * 1489597113, class465, 1786049859);
		Class1.method253(-1250601453 * anInt2830, class465, 918825528);
		Class1.method253(anInt2806 * -1184599575, class465, 854789085);
		Class1.method253(anInt2807 * 1179359471, class465, 230817910);
		Class1.method253(anInt2808 * -578974199, class465, -1749638);
		Class1.method253(anInt2809 * 871699017, class465, 2115368709);
		Class1.method253(anInt2810 * 1656950271, class465, -1020829225);
		int[] is = new int[class465.method7748((short) 9430)];
		int i_78_ = 0;
		Iterator iterator = class465.iterator();
		while (iterator.hasNext()) {
			Node class282 = (Node) iterator.next();
			is[i_78_++] = (int) (class282.data * -3442165056282524525L);
		}
		return is;
	}

	static final void method3829(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class412.aByte4963;
	}

	static final void method3830(CS2Executor class527, byte i) {
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(Class468.method7788((long) (class527.intStack[((class527.intStackPtr -= 141891001) * 1942118537)]) * 60000L, Class223.CURRENT_LANGUAGE.method243((byte) 1), true, 1560112549)).append(" UTC").toString();
	}
}
