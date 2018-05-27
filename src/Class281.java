
/* Class281 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.LinkedList;

public class Class281 {
	int anInt3372;
	int[] anIntArray3373;
	int anInt3374;
	int[] anIntArray3375;
	static int anInt3376 = 0;
	LinkedList aLinkedList3377;

	void method4976(Class206 class206) {
		((Class281) this).aLinkedList3377 = new LinkedList();
		Class311 class311 = IndexLoaders.MAP_REGION_DECODER.method4433(33386298);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1448463599);
		Class219 class219_0_ = new Class219(675588453 * Class4.anInt35, ((Class281) this).anIntArray3375[0], ((Class281) this).anIntArray3373[0]);
		for (int i = 1; i < 1443022381 * ((Class281) this).anInt3374; i++) {
			Class219 class219_1_ = new Class219(675588453 * Class4.anInt35, ((Class281) this).anIntArray3375[i], ((Class281) this).anIntArray3373[i]);
			while ((class219_0_.anInt2711 * 1948093437 != 1948093437 * class219_1_.anInt2711) || (-1002240017 * class219_0_.anInt2712 != -1002240017 * class219_1_.anInt2712)) {
				if (class219_0_.anInt2711 * 1948093437 < class219_1_.anInt2711 * 1948093437)
					class219_0_.anInt2711 += 1013524821;
				else if (1948093437 * class219_0_.anInt2711 > 1948093437 * class219_1_.anInt2711)
					class219_0_.anInt2711 -= 1013524821;
				if (class219_0_.anInt2712 * -1002240017 < class219_1_.anInt2712 * -1002240017)
					class219_0_.anInt2712 += -2816241;
				else if (-1002240017 * class219_0_.anInt2712 > -1002240017 * class219_1_.anInt2712)
					class219_0_.anInt2712 -= -2816241;
				int i_2_ = 675588453 * Class4.anInt35;
				int i_3_ = (1948093437 * class219_0_.anInt2711 - class219.anInt2711 * 1948093437);
				int i_4_ = (-1002240017 * class219_0_.anInt2712 - -1002240017 * class219.anInt2712);
				if (i_3_ >= 0 && i_3_ < class206.anInt2617 * -1912960305 && i_4_ >= 0 && i_4_ < class206.anInt2603 * -18177099) {
					int i_5_ = (i_3_ << 9) + 256;
					int i_6_ = (i_4_ << 9) + 256;
					if (class311.method5497(i_3_, i_4_, 1443895157))
						i_2_++;
					((Class281) this).aLinkedList3377.add(new Class521_Sub1_Sub1_Sub1(class206, this, 675588453 * Class4.anInt35, i_2_, i_5_, Class504.method8389(i_5_, i_6_, Class4.anInt35 * 675588453, (byte) 48), i_6_));
				}
			}
			class219_0_ = class219_1_;
		}
	}

	MeshRasterizer method4977(GraphicalRenderer class505, int i) {
		RSMesh class157 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, ((Class281) this).anInt3372 * 68563351, 0);
		if (null == class157)
			return null;
		if (class157.zoom < 13)
			class157.upscale(2);
		return class505.createMeshRasterizer(class157, 2048, anInt3376 * 44398085, 64, 768);
	}

	public void method4978(Class206 class206, byte i) {
		if (class206 != null) {
			if (i != -1) {
				for (;;) {
					/* empty */
				}
			}
			if (((Class281) this).anInt3374 * 1443022381 > 0) {
				if (i == -1) {
					method4983(class206, -199147692);
					Iterator iterator = ((Class281) this).aLinkedList3377.iterator();
					while (iterator.hasNext()) {
						if (i != -1)
							break;
						Class521_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1 = (Class521_Sub1_Sub1_Sub1) iterator.next();
						class206.method3397(class521_sub1_sub1_sub1, false, 1630649491);
					}
				}
			}
		}
	}

	public void method4979(Class206 class206, int i) {
		if (null != class206 && null != ((Class281) this).aLinkedList3377) {
			Iterator iterator = ((Class281) this).aLinkedList3377.iterator();
			while (iterator.hasNext()) {
				Class521_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1 = (Class521_Sub1_Sub1_Sub1) iterator.next();
				class206.method3530(class521_sub1_sub1_sub1.aByte7967, class521_sub1_sub1_sub1.aShort9458, class521_sub1_sub1_sub1.aShort9456, new Class280(class521_sub1_sub1_sub1), -1561298110);
			}
		}
	}

	public void method4980(Class206 class206) {
		if (null != class206 && null != ((Class281) this).aLinkedList3377) {
			Iterator iterator = ((Class281) this).aLinkedList3377.iterator();
			while (iterator.hasNext()) {
				Class521_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1 = (Class521_Sub1_Sub1_Sub1) iterator.next();
				class206.method3530(class521_sub1_sub1_sub1.aByte7967, class521_sub1_sub1_sub1.aShort9458, class521_sub1_sub1_sub1.aShort9456, new Class280(class521_sub1_sub1_sub1), -454434245);
			}
		}
	}

	MeshRasterizer method4981(GraphicalRenderer class505) {
		RSMesh class157 = RSMesh.decodeMesh(IndexLoaders.MESH_INDEX, ((Class281) this).anInt3372 * 68563351, 0);
		if (null == class157)
			return null;
		if (class157.zoom < 13)
			class157.upscale(2);
		return class505.createMeshRasterizer(class157, 2048, anInt3376 * 44398085, 64, 768);
	}

	public void method4982(Class206 class206) {
		if (class206 != null && ((Class281) this).anInt3374 * 1443022381 > 0) {
			method4983(class206, -199147692);
			Iterator iterator = ((Class281) this).aLinkedList3377.iterator();
			while (iterator.hasNext()) {
				Class521_Sub1_Sub1_Sub1 class521_sub1_sub1_sub1 = (Class521_Sub1_Sub1_Sub1) iterator.next();
				class206.method3397(class521_sub1_sub1_sub1, false, -767760037);
			}
		}
	}

	void method4983(Class206 class206, int i) {
		((Class281) this).aLinkedList3377 = new LinkedList();
		Class311 class311 = IndexLoaders.MAP_REGION_DECODER.method4433(33386298);
		Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(309280433);
		Class219 class219_7_ = new Class219(675588453 * Class4.anInt35, ((Class281) this).anIntArray3375[0], ((Class281) this).anIntArray3373[0]);
		for (int i_8_ = 1; i_8_ < 1443022381 * ((Class281) this).anInt3374; i_8_++) {
			Class219 class219_9_ = new Class219(675588453 * Class4.anInt35, ((Class281) this).anIntArray3375[i_8_], ((Class281) this).anIntArray3373[i_8_]);
			while ((class219_7_.anInt2711 * 1948093437 != 1948093437 * class219_9_.anInt2711) || (-1002240017 * class219_7_.anInt2712 != -1002240017 * class219_9_.anInt2712)) {
				if (class219_7_.anInt2711 * 1948093437 < class219_9_.anInt2711 * 1948093437)
					class219_7_.anInt2711 += 1013524821;
				else if (1948093437 * class219_7_.anInt2711 > 1948093437 * class219_9_.anInt2711)
					class219_7_.anInt2711 -= 1013524821;
				if (class219_7_.anInt2712 * -1002240017 < class219_9_.anInt2712 * -1002240017)
					class219_7_.anInt2712 += -2816241;
				else if (-1002240017 * class219_7_.anInt2712 > -1002240017 * class219_9_.anInt2712)
					class219_7_.anInt2712 -= -2816241;
				int i_10_ = 675588453 * Class4.anInt35;
				int i_11_ = (1948093437 * class219_7_.anInt2711 - class219.anInt2711 * 1948093437);
				int i_12_ = (-1002240017 * class219_7_.anInt2712 - -1002240017 * class219.anInt2712);
				if (i_11_ >= 0 && i_11_ < class206.anInt2617 * -1912960305 && i_12_ >= 0 && i_12_ < class206.anInt2603 * -18177099) {
					int i_13_ = (i_11_ << 9) + 256;
					int i_14_ = (i_12_ << 9) + 256;
					if (class311.method5497(i_11_, i_12_, 1872595412))
						i_10_++;
					((Class281) this).aLinkedList3377.add(new Class521_Sub1_Sub1_Sub1(class206, this, 675588453 * Class4.anInt35, i_10_, i_13_, Class504.method8389(i_13_, i_14_, Class4.anInt35 * 675588453, (byte) 91), i_14_));
				}
			}
			class219_7_ = class219_9_;
		}
	}

	public Class281(GraphicalRenderer class505, RsByteBuffer class282_sub35, int i) {
		((Class281) this).anInt3372 = i * 1946115623;
		((Class281) this).anInt3374 = class282_sub35.method13094(1207140670) * 1284995493;
		((Class281) this).anIntArray3375 = new int[1443022381 * ((Class281) this).anInt3374];
		((Class281) this).anIntArray3373 = new int[((Class281) this).anInt3374 * 1443022381];
		int i_15_ = class282_sub35.readUnsignedShort();
		int i_16_ = class282_sub35.readUnsignedShort();
		for (int i_17_ = 0; i_17_ < ((Class281) this).anInt3374 * 1443022381; i_17_++) {
			((Class281) this).anIntArray3375[i_17_] = i_15_ + class282_sub35.readByte((short) -12275);
			((Class281) this).anIntArray3373[i_17_] = i_16_ + class282_sub35.readByte((short) -23566);
		}
		method4977(class505, 546105467);
	}

	public static void method4984(int i) {
		anInt3376 = -719788339 * i;
	}

	public static void method4985(int i) {
		anInt3376 = -719788339 * i;
	}

	static final void method4986(CS2Executor class527, int i) {
		int i_18_ = (class527.unknown[class527.instrPtr * 301123709]);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = ((Player) class527.animable).aClass155_10561.method2627(i_18_, -1165969492);
	}

	static final void method4987(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i_19_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = new StringBuilder().append(string).append(i_19_).toString();
	}

	static final void method4988(CS2Executor class527, int i) {
		int i_20_ = (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub50_Sub6 class282_sub50_sub6 = Class291.method5130(i_20_);
		if (class282_sub50_sub6 == null) {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		} else {
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (235539227 * class282_sub50_sub6.anInt9540 - -742910705 * class282_sub50_sub6.anInt9539);
			class527.intStack[((class527.anInt7012 += 141891001) * 1942118537 - 1)] = (1097246003 * class282_sub50_sub6.anInt9535 - class282_sub50_sub6.anInt9541 * 458255425);
		}
	}

	static final void method4989(CS2Executor class527, int i) {
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12622(531406560) ? 1 : 0;
	}
}
