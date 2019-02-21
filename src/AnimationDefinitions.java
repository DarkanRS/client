/* Class518 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationDefinitions {
	public int anInt5907;
	AnimationIndexLoader animationIndexLoader;
	public int anInt5909;
	IterableNodeMap aClass465_5910;
	public int[] anIntArray5911;
	public int[] animationStepLengths;
	public int[][] anIntArrayArray5913;
	public int loopDelay = 1208528487;
	public boolean[] aBoolArray5915;
	public int priority = -1175313279;
	public int leftHandItem = 611393677;
	public int rightHandItem = -814987755;
	public int[] anIntArray5919;
	public int anInt5920;
	public int anInt5921;
	public int[] skeletonIds;
	public boolean aBool5923;
	public boolean aBool5924;
	public static boolean aBool5925 = false;
	public int[] anIntArray5926;
	public int[] anIntArray5927;
	public boolean aBool5928;
	public int anInt5929 = 949180193;
	public static int anInt5930;

	public String method11129(int i, String string, int i_0_) {
		if (null == ((AnimationDefinitions) this).aClass465_5910)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) ((AnimationDefinitions) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub47)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	void method11130(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_1_ = class282_sub35.readUnsignedByte();
			if (i_1_ == 0)
				break;
			method11131(class282_sub35, i_1_, 1214881169);
		}
	}

	void method11131(RsByteBuffer stream, int opcode, int i_2_) {
		if (1 == opcode) {
			int i_3_ = stream.readUnsignedShort();
			animationStepLengths = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				animationStepLengths[i_4_] = stream.readUnsignedShort();
			skeletonIds = new int[i_3_];
			for (int i_5_ = 0; i_5_ < i_3_; i_5_++)
				skeletonIds[i_5_] = stream.readUnsignedShort();
			for (int i_6_ = 0; i_6_ < i_3_; i_6_++)
				skeletonIds[i_6_] = (stream.readUnsignedShort() << 16) + skeletonIds[i_6_];
		} else if (opcode == 2)
			loopDelay = stream.readUnsignedShort() * -1208528487;
		else if (3 == opcode) {
			aBoolArray5915 = new boolean[256];
			int i_7_ = stream.readUnsignedByte();
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++)
				aBoolArray5915[stream.readUnsignedByte()] = true;
		} else if (5 == opcode)
			priority = stream.readUnsignedByte() * -1094056115;
		else if (6 == opcode)
			leftHandItem = stream.readUnsignedShort() * -611393677;
		else if (opcode == 7)
			rightHandItem = stream.readUnsignedShort() * 814987755;
		else if (8 == opcode)
			anInt5929 = stream.readUnsignedByte() * 313272235;
		else if (9 == opcode)
			anInt5920 = stream.readUnsignedByte() * -26888893;
		else if (10 == opcode)
			anInt5921 = stream.readUnsignedByte() * -507546261;
		else if (opcode == 11)
			anInt5907 = stream.readUnsignedByte() * -845688857;
		else if (opcode == 12) {
			int i_9_ = stream.readUnsignedByte();
			anIntArray5911 = new int[i_9_];
			for (int i_10_ = 0; i_10_ < i_9_; i_10_++)
				anIntArray5911[i_10_] = stream.readUnsignedShort();
			for (int i_11_ = 0; i_11_ < i_9_; i_11_++)
				anIntArray5911[i_11_] = (stream.readUnsignedShort() << 16) + anIntArray5911[i_11_];
		} else if (13 == opcode) {
			int i_12_ = stream.readUnsignedShort();
			anIntArrayArray5913 = new int[i_12_][];
			for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
				int i_14_ = stream.readUnsignedByte();
				if (i_14_ > 0) {
					anIntArrayArray5913[i_13_] = new int[i_14_];
					anIntArrayArray5913[i_13_][0] = stream.read24BitUnsignedInteger();
					for (int i_15_ = 1; i_15_ < i_14_; i_15_++)
						anIntArrayArray5913[i_13_][i_15_] = stream.readUnsignedShort();
				}
			}
		} else if (opcode == 14)
			aBool5923 = true;
		else if (opcode == 15)
			aBool5924 = true;
		else if (opcode != 16) {
			if (18 == opcode)
				aBool5928 = true;
			else if (19 == opcode) {
				if (anIntArray5926 == null) {
					anIntArray5926 = new int[anIntArrayArray5913.length];
					for (int i_16_ = 0; i_16_ < anIntArrayArray5913.length; i_16_++)
						anIntArray5926[i_16_] = 255;
				}
				anIntArray5926[stream.readUnsignedByte()] = stream.readUnsignedByte();
			} else if (opcode == 20) {
				if (null == anIntArray5927 || null == anIntArray5919) {
					anIntArray5927 = new int[anIntArrayArray5913.length];
					anIntArray5919 = new int[anIntArrayArray5913.length];
					for (int i_17_ = 0; i_17_ < anIntArrayArray5913.length; i_17_++) {
						anIntArray5927[i_17_] = 256;
						anIntArray5919[i_17_] = 256;
					}
				}
				int i_18_ = stream.readUnsignedByte();
				anIntArray5927[i_18_] = stream.readUnsignedShort();
				anIntArray5919[i_18_] = stream.readUnsignedShort();
			} else if (249 == opcode) {
				int i_19_ = stream.readUnsignedByte();
				if (((AnimationDefinitions) this).aClass465_5910 == null) {
					int i_20_ = Class323.nextPowerOfTwo(i_19_, 1720003752);
					((AnimationDefinitions) this).aClass465_5910 = new IterableNodeMap(i_20_);
				}
				for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
					boolean bool = stream.readUnsignedByte() == 1;
					int i_22_ = stream.read24BitUnsignedInteger();
					Node class282;
					if (bool)
						class282 = new Class282_Sub47(stream.readString());
					else
						class282 = new Class282_Sub38(stream.readInt());
					((AnimationDefinitions) this).aClass465_5910.method7765(class282, (long) i_22_);
				}
			}
		}
	}

	AnimationDefinitions() {
		anInt5920 = 26888893;
		anInt5921 = 507546261;
		anInt5907 = -1691377714;
		aBool5923 = false;
		aBool5924 = false;
		aBool5928 = false;
	}

	public boolean loadSkeletons() {
		if (skeletonIds == null)
			return true;
		boolean success = true;
		int[] skeletons = skeletonIds;
		for (int i = 0; i < skeletons.length; i++) {
			int skeleton = skeletons[i];
			if (((AnimationDefinitions) this).animationIndexLoader.getAnimationSkeleton(skeleton >>> 16, -1536383536) == null)
				success = false;
		}
		return success;
	}

	public int method11133(int i, int i_25_, int i_26_) {
		if (null == ((AnimationDefinitions) this).aClass465_5910)
			return i_25_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) ((AnimationDefinitions) this).aClass465_5910.method7754((long) i));
		if (null == class282_sub38)
			return i_25_;
		return class282_sub38.anInt8002 * -570797415;
	}
	
	void method11143(byte i) {
		if (-1113882773 * anInt5920 == -1) {
			if (aBoolArray5915 != null)
				anInt5920 = -53777786;
			else
				anInt5920 = 0;
		}
		if (113839939 * anInt5921 == -1) {
			if (null != aBoolArray5915)
				anInt5921 = -1015092522;
			else
				anInt5921 = 0;
		}
	}

	static final void method11147(CS2Executor class527, int i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub1_8197.method12609(-1561738474) ? 1 : 0;
	}

	public static final void method11148(Class521_Sub1 class521_sub1, int i, int i_94_) {
		Class8_Sub3.method14336(class521_sub1, i, true, 1386523975);
	}
}
