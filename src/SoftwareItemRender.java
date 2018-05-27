/* Class420 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class SoftwareItemRender implements Interface18 {
	int outlineSize;
	int itemAmount;
	int itemId;
	int rendererId;
	int shadowColor;
	int renderStack;
	boolean hasPlayerAppearance;

	public boolean method132(Interface18 interface18) {
		if (!(interface18 instanceof SoftwareItemRender))
			return false;
		SoftwareItemRender class420_0_ = (SoftwareItemRender) interface18;
		if (((SoftwareItemRender) class420_0_).rendererId * 362003861 != ((SoftwareItemRender) this).rendererId * 362003861)
			return false;
		if (-2122717931 * ((SoftwareItemRender) class420_0_).itemId != -2122717931 * ((SoftwareItemRender) this).itemId)
			return false;
		if (((SoftwareItemRender) class420_0_).itemAmount * 716754807 != 716754807 * ((SoftwareItemRender) this).itemAmount)
			return false;
		if (((SoftwareItemRender) this).outlineSize * -1886226917 != -1886226917 * ((SoftwareItemRender) class420_0_).outlineSize)
			return false;
		if (442868743 * ((SoftwareItemRender) class420_0_).shadowColor != ((SoftwareItemRender) this).shadowColor * 442868743)
			return false;
		if (((SoftwareItemRender) class420_0_).renderStack * -1317952433 != -1317952433 * ((SoftwareItemRender) this).renderStack)
			return false;
		if (((SoftwareItemRender) class420_0_).hasPlayerAppearance != ((SoftwareItemRender) this).hasPlayerAppearance)
			return false;
		return true;
	}

	SoftwareItemRender() {
		/* empty */
	}

	public boolean method131(Interface18 interface18) {
		if (!(interface18 instanceof SoftwareItemRender))
			return false;
		SoftwareItemRender class420_1_ = (SoftwareItemRender) interface18;
		if (((SoftwareItemRender) class420_1_).rendererId * 362003861 != ((SoftwareItemRender) this).rendererId * 362003861)
			return false;
		if (-2122717931 * ((SoftwareItemRender) class420_1_).itemId != -2122717931 * ((SoftwareItemRender) this).itemId)
			return false;
		if (((SoftwareItemRender) class420_1_).itemAmount * 716754807 != 716754807 * ((SoftwareItemRender) this).itemAmount)
			return false;
		if (((SoftwareItemRender) this).outlineSize * -1886226917 != -1886226917 * ((SoftwareItemRender) class420_1_).outlineSize)
			return false;
		if (442868743 * ((SoftwareItemRender) class420_1_).shadowColor != ((SoftwareItemRender) this).shadowColor * 442868743)
			return false;
		if (((SoftwareItemRender) class420_1_).renderStack * -1317952433 != -1317952433 * ((SoftwareItemRender) this).renderStack)
			return false;
		if (((SoftwareItemRender) class420_1_).hasPlayerAppearance != ((SoftwareItemRender) this).hasPlayerAppearance)
			return false;
		return true;
	}

	public long method109() {
		long[] ls = RsByteBuffer.aLongArray7979;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (362003861 * ((SoftwareItemRender) this).rendererId)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2122717931 * ((SoftwareItemRender) this).itemId >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-2122717931 * ((SoftwareItemRender) this).itemId)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (716754807 * ((SoftwareItemRender) this).itemAmount >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (716754807 * ((SoftwareItemRender) this).itemAmount >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (716754807 * ((SoftwareItemRender) this).itemAmount >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((SoftwareItemRender) this).itemAmount * 716754807)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1886226917 * ((SoftwareItemRender) this).outlineSize)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (442868743 * ((SoftwareItemRender) this).shadowColor >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((SoftwareItemRender) this).shadowColor * 442868743 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (442868743 * ((SoftwareItemRender) this).shadowColor >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (442868743 * ((SoftwareItemRender) this).shadowColor)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1317952433 * ((SoftwareItemRender) this).renderStack)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((SoftwareItemRender) this).hasPlayerAppearance ? 1 : 0)) & 0xffL)];
		return l;
	}

	public long method130() {
		long[] ls = RsByteBuffer.aLongArray7979;
		long l = -1L;
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (362003861 * ((SoftwareItemRender) this).rendererId)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (-2122717931 * ((SoftwareItemRender) this).itemId >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-2122717931 * ((SoftwareItemRender) this).itemId)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (716754807 * ((SoftwareItemRender) this).itemAmount >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (716754807 * ((SoftwareItemRender) this).itemAmount >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (716754807 * ((SoftwareItemRender) this).itemAmount >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((SoftwareItemRender) this).itemAmount * 716754807)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1886226917 * ((SoftwareItemRender) this).outlineSize)) & 0xffL)];
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (442868743 * ((SoftwareItemRender) this).shadowColor >> 24)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (((SoftwareItemRender) this).shadowColor * 442868743 >> 16)) & 0xffL)]);
		l = (l >>> 8 ^ ls[(int) ((l ^ (long) (442868743 * ((SoftwareItemRender) this).shadowColor >> 8)) & 0xffL)]);
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (442868743 * ((SoftwareItemRender) this).shadowColor)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (-1317952433 * ((SoftwareItemRender) this).renderStack)) & 0xffL)];
		l = l >>> 8 ^ ls[(int) ((l ^ (long) (((SoftwareItemRender) this).hasPlayerAppearance ? 1 : 0)) & 0xffL)];
		return l;
	}

	public boolean method133(Interface18 interface18) {
		if (!(interface18 instanceof SoftwareItemRender))
			return false;
		SoftwareItemRender class420_2_ = (SoftwareItemRender) interface18;
		if (((SoftwareItemRender) class420_2_).rendererId * 362003861 != ((SoftwareItemRender) this).rendererId * 362003861)
			return false;
		if (-2122717931 * ((SoftwareItemRender) class420_2_).itemId != -2122717931 * ((SoftwareItemRender) this).itemId)
			return false;
		if (((SoftwareItemRender) class420_2_).itemAmount * 716754807 != 716754807 * ((SoftwareItemRender) this).itemAmount)
			return false;
		if (((SoftwareItemRender) this).outlineSize * -1886226917 != -1886226917 * ((SoftwareItemRender) class420_2_).outlineSize)
			return false;
		if (442868743 * ((SoftwareItemRender) class420_2_).shadowColor != ((SoftwareItemRender) this).shadowColor * 442868743)
			return false;
		if (((SoftwareItemRender) class420_2_).renderStack * -1317952433 != -1317952433 * ((SoftwareItemRender) this).renderStack)
			return false;
		if (((SoftwareItemRender) class420_2_).hasPlayerAppearance != ((SoftwareItemRender) this).hasPlayerAppearance)
			return false;
		return true;
	}

	public boolean method134(Interface18 interface18) {
		if (!(interface18 instanceof SoftwareItemRender))
			return false;
		SoftwareItemRender class420_3_ = (SoftwareItemRender) interface18;
		if (((SoftwareItemRender) class420_3_).rendererId * 362003861 != ((SoftwareItemRender) this).rendererId * 362003861)
			return false;
		if (-2122717931 * ((SoftwareItemRender) class420_3_).itemId != -2122717931 * ((SoftwareItemRender) this).itemId)
			return false;
		if (((SoftwareItemRender) class420_3_).itemAmount * 716754807 != 716754807 * ((SoftwareItemRender) this).itemAmount)
			return false;
		if (((SoftwareItemRender) this).outlineSize * -1886226917 != -1886226917 * ((SoftwareItemRender) class420_3_).outlineSize)
			return false;
		if (442868743 * ((SoftwareItemRender) class420_3_).shadowColor != ((SoftwareItemRender) this).shadowColor * 442868743)
			return false;
		if (((SoftwareItemRender) class420_3_).renderStack * -1317952433 != -1317952433 * ((SoftwareItemRender) this).renderStack)
			return false;
		if (((SoftwareItemRender) class420_3_).hasPlayerAppearance != ((SoftwareItemRender) this).hasPlayerAppearance)
			return false;
		return true;
	}

	static final void method7032(CS2Executor class527, short i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = class118.anInt1301 * 1506818197;
	}

	static Class149_Sub4 method7033(RsByteBuffer class282_sub35, int i) {
		return new Class149_Sub4(class282_sub35.readShort(1848939200), class282_sub35.readShort(1780715141), class282_sub35.readShort(1644491611), class282_sub35.readShort(1586203891), class282_sub35.read24BitUnsignedInteger((short) 4319), class282_sub35.read24BitUnsignedInteger((short) 18735), class282_sub35.readUnsignedByte());
	}

	public static void method7034(AnimationDefinitions class518, int i, int i_4_) {
		if (-458827259 * Class260.anInt3219 < 50 && (class518 != null && null != class518.anIntArrayArray5913 && i < class518.anIntArrayArray5913.length && null != class518.anIntArrayArray5913[i])) {
			int i_5_ = class518.anIntArrayArray5913[i][0];
			int i_6_ = i_5_ >> 8;
			int i_7_ = i_5_ >> 5 & 0x7;
			if (class518.anIntArrayArray5913[i].length > 1) {
				int i_8_ = (int) (Math.random() * (double) (class518.anIntArrayArray5913[i]).length);
				if (i_8_ > 0)
					i_6_ = class518.anIntArrayArray5913[i][i_8_];
			}
			int i_9_ = 256;
			if (class518.anIntArray5927 != null && null != class518.anIntArray5919)
				i_9_ = Class76.method1356(class518.anIntArray5927[i], class518.anIntArray5919[i], -1021175029);
			int i_10_ = (class518.anIntArray5926 == null ? 255 : class518.anIntArray5926[i]);
			if (class518.aBool5928)
				Class435.method7300(i_6_, i_7_, 0, i_10_, false, i_9_, 1449989045);
			else
				Class153.method2618(i_6_, i_7_, 0, i_10_, i_9_, 1648413322);
		}
	}

	static final boolean method7035(char c, int i) {
		return '\u00a0' == c || c == ' ' || '_' == c || c == '-';
	}
}
