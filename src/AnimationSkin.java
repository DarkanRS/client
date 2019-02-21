/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class AnimationSkin {
	boolean aBool972;
	static short[] aShortArray973;
	static short[] aShortArray975;
	static short[] aShortArray976 = new short[500];
	static short[] aShortArray977;
	AnimationSkinNode skinNodeList = null;
	static short[] aShortArray979;
	int anInt980 = 0;
	short[] aShortArray981;
	short[] aShortArray982;
	short[] aShortArray983;
	short[] aShortArray984;
	byte[] aByteArray985;
	boolean aBool986 = false;
	short[] aShortArray987;
	boolean aBool988;
	static byte[] aByteArray991;

	AnimationSkin(byte[] skeletonData, AnimationSkinNode skins) {
		aBool972 = false;
		aBool988 = false;
		skinNodeList = skins;
		try {
			RsByteBuffer skeletonBuffer1 = new RsByteBuffer(skeletonData);
			RsByteBuffer skeletonBuffer2 = new RsByteBuffer(skeletonData);
			skeletonBuffer1.readUnsignedByte();
			skeletonBuffer1.index += 2064013562;
			int i = skeletonBuffer1.readUnsignedByte();
			int i_1_ = 0;
			int i_2_ = -1;
			int i_3_ = -1;
			skeletonBuffer2.index = (skeletonBuffer1.index * -1990677291 + i) * -1115476867;
			for (int i_4_ = 0; i_4_ < i; i_4_++) {
				int i_5_ = (((AnimationSkinNode) skinNodeList).anIntArray7562[i_4_]);
				if (i_5_ == 0)
					i_2_ = i_4_;
				int i_6_ = skeletonBuffer1.readUnsignedByte();
				if (i_6_ > 0) {
					if (i_5_ == 0)
						i_3_ = i_4_;
					aShortArray976[i_1_] = (short) i_4_;
					short i_7_ = 0;
					if (i_5_ == 3 || i_5_ == 10)
						i_7_ = (short) 128;
					if ((i_6_ & 0x1) != 0)
						aShortArray973[i_1_] = (short) skeletonBuffer2.method13094(98798348);
					else
						aShortArray973[i_1_] = i_7_;
					if ((i_6_ & 0x2) != 0)
						aShortArray977[i_1_] = (short) skeletonBuffer2.method13094(-1955143271);
					else
						aShortArray977[i_1_] = i_7_;
					if ((i_6_ & 0x4) != 0)
						aShortArray975[i_1_] = (short) skeletonBuffer2.method13094(117687154);
					else
						aShortArray975[i_1_] = i_7_;
					aByteArray991[i_1_] = (byte) (i_6_ >>> 3 & 0x3);
					if (i_5_ == 2 || i_5_ == 9) {
						aShortArray973[i_1_] = (short) (aShortArray973[i_1_] << 2 & 0x3fff);
						aShortArray977[i_1_] = (short) (aShortArray977[i_1_] << 2 & 0x3fff);
						aShortArray975[i_1_] = (short) (aShortArray975[i_1_] << 2 & 0x3fff);
					}
					aShortArray979[i_1_] = (short) -1;
					if (i_5_ == 1 || i_5_ == 2 || i_5_ == 3) {
						if (i_2_ > i_3_) {
							aShortArray979[i_1_] = (short) i_2_;
							i_3_ = i_2_;
						}
					} else if (i_5_ == 5)
						aBool986 = true;
					else if (i_5_ == 7)
						aBool972 = true;
					else if (i_5_ == 9 || i_5_ == 10 || i_5_ == 8)
						aBool988 = true;
					i_1_++;
				}
			}
			if (skeletonBuffer2.index * -1990677291 != skeletonData.length)
				throw new RuntimeException();
			anInt980 = i_1_;
			aShortArray987 = new short[i_1_];
			aShortArray981 = new short[i_1_];
			aShortArray982 = new short[i_1_];
			aShortArray983 = new short[i_1_];
			aShortArray984 = new short[i_1_];
			aByteArray985 = new byte[i_1_];
			for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
				aShortArray987[i_8_] = aShortArray976[i_8_];
				aShortArray981[i_8_] = aShortArray973[i_8_];
				aShortArray982[i_8_] = aShortArray977[i_8_];
				aShortArray983[i_8_] = aShortArray975[i_8_];
				aShortArray984[i_8_] = aShortArray979[i_8_];
				aByteArray985[i_8_] = aByteArray991[i_8_];
			}
		} catch (Exception exception) {
			anInt980 = 0;
			aBool986 = false;
			aBool972 = false;
		}
	}

	static {
		aShortArray973 = new short[500];
		aShortArray977 = new short[500];
		aShortArray975 = new short[500];
		aShortArray979 = new short[500];
		aByteArray991 = new byte[500];
	}
}
