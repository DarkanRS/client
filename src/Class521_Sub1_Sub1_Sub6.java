/* Class521_Sub1_Sub1_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class521_Sub1_Sub1_Sub6 extends Class521_Sub1_Sub1 implements SceneObject {
	int anInt10534;
	MeshRasterizer aClass528_10535;
	boolean aBool10536;
	Class200 aClass200_10537;
	Class282_Sub50_Sub17 aClass282_Sub50_Sub17_10538;
	byte aByte10539;
	byte aByte10540;
	boolean aBool10541;
	ObjectIndexLoader aClass474_10542;
	boolean aBool10543;
	boolean aBool10544;

	public boolean method94() {
		return ((Class521_Sub1_Sub1_Sub6) this).aBool10544;
	}

	boolean method13026() {
		return ((Class521_Sub1_Sub1_Sub6) this).aBool10543;
	}

	boolean method12987(int i) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			return ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.i();
		return false;
	}

	public int method16115(int i) {
		return (null != ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 ? ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.N() / 4 : 15);
	}

	MeshRasterizer method16116(GraphicalRenderer class505, int i, int i_0_) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null && class505.method8452(((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.m(), i) == 0)
			return ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535;
		Class452 class452 = method16117(class505, i, false, (byte) 0);
		if (class452 != null)
			return (MeshRasterizer) class452.anObject5443;
		return null;
	}

	Class452 method16117(GraphicalRenderer class505, int i, boolean bool, byte i_1_) {
		ObjectDefinitions class478 = (((Class521_Sub1_Sub1_Sub6) this).aClass474_10542.getObjectDefinitions(-1638295397 * ((Class521_Sub1_Sub1_Sub6) this).anInt10534, 65280));
		Class390 class390;
		Class390 class390_2_;
		if (((Class521_Sub1_Sub1_Sub6) this).aBool10536) {
			class390 = aClass206_7970.aClass390Array2614[aByte7968];
			class390_2_ = aClass206_7970.aClass390Array2607[0];
		} else {
			class390 = aClass206_7970.aClass390Array2607[aByte7968];
			if (aByte7968 < 3)
				class390_2_ = aClass206_7970.aClass390Array2607[aByte7968 + 1];
			else
				class390_2_ = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		return (class478.method8010(class505, i, ((Class458.aClass458_5492.anInt5481 * 1109376893 != ((Class521_Sub1_Sub1_Sub6) this).aByte10539) ? (int) ((Class521_Sub1_Sub1_Sub6) this).aByte10539 : 1109376893 * Class458.aClass458_5490.anInt5481), ((1109376893 * Class458.aClass458_5492.anInt5481 == ((Class521_Sub1_Sub1_Sub6) this).aByte10539) ? (int) (((Class521_Sub1_Sub1_Sub6) this).aByte10540 + 4) : ((Class521_Sub1_Sub1_Sub6) this).aByte10540), class390, class390_2_,
				(int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, bool, null, -333836235));
	}

	public Class200 method12992(GraphicalRenderer class505, byte i) {
		Class385 class385 = method11166().aClass385_3595;
		if (null == ((Class521_Sub1_Sub1_Sub6) this).aClass200_10537)
			((Class521_Sub1_Sub1_Sub6) this).aClass200_10537 = Class275_Sub2.method12505((int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, method16116(class505, 0, 1810045144), (byte) -15);
		return ((Class521_Sub1_Sub1_Sub6) this).aClass200_10537;
	}

	public Class521_Sub1_Sub1_Sub6(SceneObjectManager class206, GraphicalRenderer class505, ObjectIndexLoader class474, ObjectDefinitions class478, int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, boolean bool_13_) {
		super(class206, i, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, -1062790731 * class478.anInt5687 == 1, Class472.method7853(i_11_, i_12_, 1133726339));
		((Class521_Sub1_Sub1_Sub6) this).aClass474_10542 = class474;
		((Class521_Sub1_Sub1_Sub6) this).anInt10534 = class478.id * -1214228387;
		aByte7968 = (byte) i_3_;
		((Class521_Sub1_Sub1_Sub6) this).aBool10536 = bool;
		((Class521_Sub1_Sub1_Sub6) this).aByte10539 = (byte) i_11_;
		((Class521_Sub1_Sub1_Sub6) this).aByte10540 = (byte) i_12_;
		((Class521_Sub1_Sub1_Sub6) this).aBool10541 = -348507379 * class478.anInt5652 != 0 && !bool;
		((Class521_Sub1_Sub1_Sub6) this).aBool10543 = bool_13_;
		((Class521_Sub1_Sub1_Sub6) this).aBool10544 = (class505.method8402() && class478.aBool5703 && !((Class521_Sub1_Sub1_Sub6) this).aBool10536 && Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -6) != 0);
		int i_14_ = 2048;
		if (((Class521_Sub1_Sub1_Sub6) this).aBool10543)
			i_14_ |= 0x10000;
		if (class478.aBool5711)
			i_14_ |= 0x80000;
		Class452 class452 = method16117(class505, i_14_, ((Class521_Sub1_Sub1_Sub6) this).aBool10544, (byte) 0);
		if (null != class452) {
			((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 = (MeshRasterizer) class452.anObject5443;
			((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 = (Class282_Sub50_Sub17) class452.anObject5444;
			if (((Class521_Sub1_Sub1_Sub6) this).aBool10543 || class478.aBool5711) {
				((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 = ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11289((byte) 0, i_14_, false);
				if (class478.aBool5711) {
					Class341 class341 = IndexLoaders.MAP_REGION_DECODER.method4426(1466531789);
					((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.PA(class341.anInt3992 * 1367691291, class341.anInt3993 * 1646020803, 945117807 * class341.anInt3994, class341.anInt3995 * 2100466695);
				}
			}
		}
		method13008(1, (byte) -117);
	}

	public int method89(int i) {
		return ((Class521_Sub1_Sub1_Sub6) this).aByte10539;
	}

	Class285 method13009(GraphicalRenderer class505) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 == null)
			return null;
		Class294 class294 = method11168();
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub1_Sub6) this).aBool10541, (byte) -109);
		((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	boolean method12985(int i) {
		return ((Class521_Sub1_Sub1_Sub6) this).aBool10543;
	}

	void method13013(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_15_, int i_16_, boolean bool, int i_17_) {
		if (class521_sub1 instanceof Class521_Sub1_Sub5_Sub1) {
			Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = (Class521_Sub1_Sub5_Sub1) class521_sub1;
			if (null != ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 && null != (((Class521_Sub1_Sub5_Sub1) class521_sub1_sub5_sub1).aClass528_10513))
				((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11269((((Class521_Sub1_Sub5_Sub1) class521_sub1_sub5_sub1).aClass528_10513), i, i_15_, i_16_, bool);
		} else if (class521_sub1 instanceof Class521_Sub1_Sub1_Sub6) {
			Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_18_ = (Class521_Sub1_Sub1_Sub6) class521_sub1;
			if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null && null != ((Class521_Sub1_Sub1_Sub6) class521_sub1_sub1_sub6_18_).aClass528_10535)
				((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11269((((Class521_Sub1_Sub1_Sub6) class521_sub1_sub1_sub6_18_).aClass528_10535), i, i_15_, i_16_, bool);
		}
	}

	void method12984(int i) {
		((Class521_Sub1_Sub1_Sub6) this).aBool10543 = false;
		if (null != ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535)
			((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.KA(((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.m() & ~0x10000);
	}

	public int getId(int i) {
		return -1638295397 * ((Class521_Sub1_Sub1_Sub6) this).anInt10534;
	}

	Class285 method12990(GraphicalRenderer class505, int i) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 == null)
			return null;
		Class294 class294 = method11168();
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub1_Sub6) this).aBool10541, (byte) -118);
		((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	public int method92(int i) {
		return ((Class521_Sub1_Sub1_Sub6) this).aByte10540;
	}

	public void method38() {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11259();
	}

	public boolean method86(int i) {
		return ((Class521_Sub1_Sub1_Sub6) this).aBool10544;
	}

	public void method96() {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11259();
	}

	public void method88(GraphicalRenderer class505, int i) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 == null) && ((Class521_Sub1_Sub1_Sub6) this).aBool10544) {
			Class452 class452 = method16117(class505, 262144, true, (byte) 0);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538;
			((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null)
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -117);
	}

	boolean method13001() {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			return ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.i();
		return false;
	}

	public int method76() {
		return -1638295397 * ((Class521_Sub1_Sub1_Sub6) this).anInt10534;
	}

	public int method39() {
		return -1638295397 * ((Class521_Sub1_Sub1_Sub6) this).anInt10534;
	}

	public int method91() {
		return ((Class521_Sub1_Sub1_Sub6) this).aByte10540;
	}

	Class452 method16118(GraphicalRenderer class505, int i, boolean bool) {
		ObjectDefinitions class478 = (((Class521_Sub1_Sub1_Sub6) this).aClass474_10542.getObjectDefinitions(-1638295397 * ((Class521_Sub1_Sub1_Sub6) this).anInt10534, 65280));
		Class390 class390;
		Class390 class390_19_;
		if (((Class521_Sub1_Sub1_Sub6) this).aBool10536) {
			class390 = aClass206_7970.aClass390Array2614[aByte7968];
			class390_19_ = aClass206_7970.aClass390Array2607[0];
		} else {
			class390 = aClass206_7970.aClass390Array2607[aByte7968];
			if (aByte7968 < 3)
				class390_19_ = aClass206_7970.aClass390Array2607[aByte7968 + 1];
			else
				class390_19_ = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		return (class478.method8010(class505, i, ((Class458.aClass458_5492.anInt5481 * 1109376893 != ((Class521_Sub1_Sub1_Sub6) this).aByte10539) ? (int) ((Class521_Sub1_Sub1_Sub6) this).aByte10539 : 1109376893 * Class458.aClass458_5490.anInt5481), ((1109376893 * Class458.aClass458_5492.anInt5481 == ((Class521_Sub1_Sub1_Sub6) this).aByte10539) ? (int) (((Class521_Sub1_Sub1_Sub6) this).aByte10540 + 4) : ((Class521_Sub1_Sub1_Sub6) this).aByte10540), class390, class390_19_,
				(int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, bool, null, 1212209991));
	}

	public void method93(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 == null) && ((Class521_Sub1_Sub1_Sub6) this).aBool10544) {
			Class452 class452 = method16117(class505, 262144, true, (byte) 0);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538;
			((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null)
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -21);
	}

	public int method77() {
		return ((Class521_Sub1_Sub1_Sub6) this).aByte10539;
	}

	public int method16119() {
		return (null != ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 ? ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.N() / 4 : 15);
	}

	public void method90() {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11259();
	}

	public int method13017() {
		return (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null ? ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.YA() : 0);
	}

	public boolean method95() {
		return ((Class521_Sub1_Sub1_Sub6) this).aBool10544;
	}

	static byte method16120(int i, int i_20_) {
		if (Class458.aClass458_5474.anInt5481 * 1109376893 != i)
			return (byte) 0;
		if ((i_20_ & 0x1) == 0)
			return (byte) 1;
		return (byte) 2;
	}

	public void method83(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 == null) && ((Class521_Sub1_Sub1_Sub6) this).aBool10544) {
			Class452 class452 = method16117(class505, 262144, true, (byte) 0);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538;
			((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null)
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -17);
	}

	public void method97(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 == null) && ((Class521_Sub1_Sub1_Sub6) this).aBool10544) {
			Class452 class452 = method16117(class505, 262144, true, (byte) 0);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538;
			((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null)
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -47);
	}

	public void method98(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 == null) && ((Class521_Sub1_Sub1_Sub6) this).aBool10544) {
			Class452 class452 = method16117(class505, 262144, true, (byte) 0);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538;
			((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null)
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) 98);
	}

	boolean method12999() {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			return !((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.u();
		return true;
	}

	boolean method13000() {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			return ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.i();
		return false;
	}

	boolean method12986(int i) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			return !((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.u();
		return true;
	}

	boolean method13002() {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			return ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.i();
		return false;
	}

	public int method13003() {
		return (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null ? ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.YA() : 0);
	}

	boolean method12983(GraphicalRenderer class505, int i, int i_21_, int i_22_) {
		MeshRasterizer class528 = method16116(class505, 131072, 1404485768);
		if (null != class528) {
			Class294 class294 = method11168();
			return class528.method11270(i, i_21_, class294, false, 0);
		}
		return false;
	}

	public int method13005() {
		return (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null ? ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.YA() : 0);
	}

	public int method13006() {
		return (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null ? ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.YA() : 0);
	}

	void method13023(GraphicalRenderer class505) {
		/* empty */
	}

	Class285 method13010(GraphicalRenderer class505) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 == null)
			return null;
		Class294 class294 = method11168();
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub1_Sub6) this).aBool10541, (byte) 3);
		((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	Class285 method12989(GraphicalRenderer class505) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 == null)
			return null;
		Class294 class294 = method11168();
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub1_Sub6) this).aBool10541, (byte) -31);
		((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	void method13012(GraphicalRenderer class505) {
		/* empty */
	}

	MeshRasterizer method16121(GraphicalRenderer class505, int i) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null && class505.method8452(((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.m(), i) == 0)
			return ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535;
		Class452 class452 = method16117(class505, i, false, (byte) 0);
		if (class452 != null)
			return (MeshRasterizer) class452.anObject5443;
		return null;
	}

	public void method85(byte i) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null)
			((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11259();
	}

	boolean method13011() {
		return ((Class521_Sub1_Sub1_Sub6) this).aBool10543;
	}

	void method13016(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_23_, int i_24_, boolean bool) {
		if (class521_sub1 instanceof Class521_Sub1_Sub5_Sub1) {
			Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1 = (Class521_Sub1_Sub5_Sub1) class521_sub1;
			if (null != ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 && null != (((Class521_Sub1_Sub5_Sub1) class521_sub1_sub5_sub1).aClass528_10513))
				((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11269((((Class521_Sub1_Sub5_Sub1) class521_sub1_sub5_sub1).aClass528_10513), i, i_23_, i_24_, bool);
		} else if (class521_sub1 instanceof Class521_Sub1_Sub1_Sub6) {
			Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6_25_ = (Class521_Sub1_Sub1_Sub6) class521_sub1;
			if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null && null != ((Class521_Sub1_Sub1_Sub6) class521_sub1_sub1_sub6_25_).aClass528_10535)
				((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.method11269((((Class521_Sub1_Sub1_Sub6) class521_sub1_sub1_sub6_25_).aClass528_10535), i, i_23_, i_24_, bool);
		}
	}

	public Class200 method13019(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		if (null == ((Class521_Sub1_Sub1_Sub6) this).aClass200_10537)
			((Class521_Sub1_Sub1_Sub6) this).aClass200_10537 = Class275_Sub2.method12505((int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, method16116(class505, 0, -1544222422), (byte) 86);
		return ((Class521_Sub1_Sub1_Sub6) this).aClass200_10537;
	}

	public Class200 method13018(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		if (null == ((Class521_Sub1_Sub1_Sub6) this).aClass200_10537)
			((Class521_Sub1_Sub1_Sub6) this).aClass200_10537 = Class275_Sub2.method12505((int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, method16116(class505, 0, 1772745037), (byte) -101);
		return ((Class521_Sub1_Sub1_Sub6) this).aClass200_10537;
	}

	public Class200 method12993(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		if (null == ((Class521_Sub1_Sub1_Sub6) this).aClass200_10537)
			((Class521_Sub1_Sub1_Sub6) this).aClass200_10537 = Class275_Sub2.method12505((int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, method16116(class505, 0, 2021240884), (byte) -103);
		return ((Class521_Sub1_Sub1_Sub6) this).aClass200_10537;
	}

	boolean method13020(GraphicalRenderer class505, int i, int i_26_) {
		MeshRasterizer class528 = method16116(class505, 131072, 1129524351);
		if (null != class528) {
			Class294 class294 = method11168();
			return class528.method11270(i, i_26_, class294, false, 0);
		}
		return false;
	}

	void method13021() {
		((Class521_Sub1_Sub1_Sub6) this).aBool10543 = false;
		if (null != ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535)
			((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.KA(((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.m() & ~0x10000);
	}

	void method13015() {
		((Class521_Sub1_Sub1_Sub6) this).aBool10543 = false;
		if (null != ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535)
			((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.KA(((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.m() & ~0x10000);
	}

	public void method87(GraphicalRenderer class505, int i) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 == null) && ((Class521_Sub1_Sub1_Sub6) this).aBool10544) {
			Class452 class452 = method16117(class505, 262144, true, (byte) 0);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538;
			((Class521_Sub1_Sub1_Sub6) this).aClass282_Sub50_Sub17_10538 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null)
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -9);
	}

	public int method12995(int i) {
		return (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null ? ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.YA() : 0);
	}

	public int method73() {
		return ((Class521_Sub1_Sub1_Sub6) this).aByte10539;
	}

	MeshRasterizer method16122(GraphicalRenderer class505, int i) {
		if (((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 != null && class505.method8452(((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.m(), i) == 0)
			return ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535;
		Class452 class452 = method16117(class505, i, false, (byte) 0);
		if (class452 != null)
			return (MeshRasterizer) class452.anObject5443;
		return null;
	}

	void method12991(GraphicalRenderer class505, int i) {
		/* empty */
	}

	public int method16123() {
		return (null != ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535 ? ((Class521_Sub1_Sub1_Sub6) this).aClass528_10535.N() / 4 : 15);
	}

	static final void method16124(CS2Executor class527, short i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (string.startsWith(Class76.method1358(0, (byte) 0)) || string.startsWith(Class76.method1358(1, (byte) 0)))
			string = string.substring(7);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = Class280.method4975(string, (byte) -104) ? 1 : 0;
	}

	public static int method16125(int i, int i_27_, boolean bool, int i_28_) {
		Class282_Sub30 class282_sub30 = Class517.method11127(i, bool, -1144151775);
		if (null == class282_sub30)
			return 0;
		if (i_27_ < 0 || i_27_ >= (((Class282_Sub30) class282_sub30).anIntArray7709).length)
			return 0;
		return ((Class282_Sub30) class282_sub30).anIntArray7709[i_27_];
	}
}
