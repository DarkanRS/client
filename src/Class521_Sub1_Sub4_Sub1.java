
/* Class521_Sub1_Sub4_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;
import java.util.List;

public class Class521_Sub1_Sub4_Sub1 extends Class521_Sub1_Sub4 implements Interface12 {
	boolean aBool10481;
	int anInt10482;
	MeshRasterizer aClass528_10483;
	Class200 aClass200_10484;
	byte aByte10485;
	Class282_Sub50_Sub17 aClass282_Sub50_Sub17_10486;
	byte aByte10487;
	boolean aBool10488;
	Class474 aClass474_10489;
	boolean aBool10490;

	public int method76() {
		return ((Class521_Sub1_Sub4_Sub1) this).anInt10482 * 462020215;
	}

	boolean method12986(int i) {
		if (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return !((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.u();
		return true;
	}

	boolean method12987(int i) {
		if (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.i();
		return false;
	}

	public int method12995(int i) {
		return (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 ? ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.YA() : 0);
	}

	MeshRasterizer method16068(GraphicalRenderer class505, int i, byte i_0_) {
		if (((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 != null && class505.method8452(((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.m(), i) == 0)
			return ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483;
		Class452 class452 = method16069(class505, i, false, 1517561642);
		if (null != class452)
			return (MeshRasterizer) class452.anObject5443;
		return null;
	}

	Class452 method16069(GraphicalRenderer class505, int i, boolean bool, int i_1_) {
		Class478 class478 = (((Class521_Sub1_Sub4_Sub1) this).aClass474_10489.method7891(462020215 * ((Class521_Sub1_Sub4_Sub1) this).anInt10482, 65280));
		Class390 class390;
		Class390 class390_2_;
		if (((Class521_Sub1_Sub4_Sub1) this).aBool10488) {
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
		return class478.method8010(class505, i, ((Class521_Sub1_Sub4_Sub1) this).aByte10485, ((Class521_Sub1_Sub4_Sub1) this).aByte10487, class390, class390_2_, (int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, bool, null, 921813682);
	}

	public void method90() {
		if (((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 != null)
			((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11259();
	}

	Class285 method12990(GraphicalRenderer class505, int i) {
		if (null == ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return null;
		Class294 class294 = class505.method8450();
		class294.method5209(method11168());
		class294.method5219((float) aShort9611, 0.0F, (float) aShort9612);
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub4_Sub1) this).aBool10481, (byte) -111);
		((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	void method12991(GraphicalRenderer class505, int i) {
		/* empty */
	}

	boolean method12983(GraphicalRenderer class505, int i, int i_3_, int i_4_) {
		MeshRasterizer class528 = method16068(class505, 131072, (byte) -65);
		if (null != class528) {
			Class294 class294 = method11168();
			return class528.method11270(i, i_3_, class294, false, 0);
		}
		return false;
	}

	public Class521_Sub1_Sub4_Sub1(Class206 class206, GraphicalRenderer class505, Class474 class474, Class478 class478, int i, int i_5_, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_, int i_10_, int i_11_, int i_12_) {
		super(class206, i_6_, i_7_, i_8_, i, i_5_, i_9_, i_10_);
		((Class521_Sub1_Sub4_Sub1) this).aClass474_10489 = class474;
		((Class521_Sub1_Sub4_Sub1) this).anInt10482 = class478.anInt5633 * -1301990679;
		((Class521_Sub1_Sub4_Sub1) this).aBool10488 = bool;
		((Class521_Sub1_Sub4_Sub1) this).aByte10487 = (byte) i_12_;
		((Class521_Sub1_Sub4_Sub1) this).aByte10485 = (byte) i_11_;
		((Class521_Sub1_Sub4_Sub1) this).aBool10481 = 0 != class478.anInt5652 * -348507379 && !bool;
		((Class521_Sub1_Sub4_Sub1) this).aBool10490 = (class505.method8402() && class478.aBool5703 && !((Class521_Sub1_Sub4_Sub1) this).aBool10488 && Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -12) != 0);
		int i_13_ = 2048;
		if (class478.aBool5711)
			i_13_ |= 0x80000;
		Class452 class452 = method16069(class505, i_13_, ((Class521_Sub1_Sub4_Sub1) this).aBool10490, 1172907039);
		if (null != class452) {
			((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 = (MeshRasterizer) class452.anObject5443;
			((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 = (Class282_Sub50_Sub17) class452.anObject5444;
			if (class478.aBool5711) {
				((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 = ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11289((byte) 0, i_13_, false);
				if (class478.aBool5711) {
					Class341 class341 = client.aClass257_7353.method4426(2127518782);
					((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.PA(class341.anInt3992 * 1367691291, 1646020803 * class341.anInt3993, 945117807 * class341.anInt3994, class341.anInt3995 * 2100466695);
				}
			}
		}
		method13008(1, (byte) -102);
	}

	public int method13005() {
		return (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 ? ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.YA() : 0);
	}

	public int method92(int i) {
		return ((Class521_Sub1_Sub4_Sub1) this).aByte10487;
	}

	public void method85(byte i) {
		if (((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 != null)
			((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11259();
	}

	Class285 method12989(GraphicalRenderer class505) {
		if (null == ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return null;
		Class294 class294 = class505.method8450();
		class294.method5209(method11168());
		class294.method5219((float) aShort9611, 0.0F, (float) aShort9612);
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub4_Sub1) this).aBool10481, (byte) -46);
		((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	public void method87(GraphicalRenderer class505, int i) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 == null) && ((Class521_Sub1_Sub4_Sub1) this).aBool10490) {
			Class452 class452 = method16069(class505, 262144, true, -395426412);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486;
			((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17)
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -33);
	}

	public void method88(GraphicalRenderer class505, int i) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((null == ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486) && ((Class521_Sub1_Sub4_Sub1) this).aBool10490) {
			Class452 class452 = method16069(class505, 262144, true, 1476969150);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486;
			((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17)
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -18);
	}

	boolean method13002() {
		if (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.i();
		return false;
	}

	public int method39() {
		return ((Class521_Sub1_Sub4_Sub1) this).anInt10482 * 462020215;
	}

	public int method73() {
		return ((Class521_Sub1_Sub4_Sub1) this).aByte10485;
	}

	boolean method12999() {
		if (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return !((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.u();
		return true;
	}

	public int method91() {
		return ((Class521_Sub1_Sub4_Sub1) this).aByte10487;
	}

	public void method38() {
		if (((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 != null)
			((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11259();
	}

	public void method96() {
		if (((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 != null)
			((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11259();
	}

	public Class200 method12992(GraphicalRenderer class505, byte i) {
		Class385 class385 = method11166().aClass385_3595;
		if (null == ((Class521_Sub1_Sub4_Sub1) this).aClass200_10484)
			((Class521_Sub1_Sub4_Sub1) this).aClass200_10484 = Class275_Sub2.method12505((int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, method16068(class505, 0, (byte) 22), (byte) 106);
		return ((Class521_Sub1_Sub4_Sub1) this).aClass200_10484;
	}

	public boolean method94() {
		return ((Class521_Sub1_Sub4_Sub1) this).aBool10490;
	}

	boolean method13000() {
		if (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.i();
		return false;
	}

	public void method93(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 == null) && ((Class521_Sub1_Sub4_Sub1) this).aBool10490) {
			Class452 class452 = method16069(class505, 262144, true, -576169702);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486;
			((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17)
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -19);
	}

	public void method83(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 == null) && ((Class521_Sub1_Sub4_Sub1) this).aBool10490) {
			Class452 class452 = method16069(class505, 262144, true, 991322100);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486;
			((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17)
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -64);
	}

	public void method97(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((null == ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486) && ((Class521_Sub1_Sub4_Sub1) this).aBool10490) {
			Class452 class452 = method16069(class505, 262144, true, -1308325866);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486;
			((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17)
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) 44);
	}

	public int method84(int i) {
		return ((Class521_Sub1_Sub4_Sub1) this).anInt10482 * 462020215;
	}

	public void method98(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((null == ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486) && ((Class521_Sub1_Sub4_Sub1) this).aBool10490) {
			Class452 class452 = method16069(class505, 262144, true, 6216150);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = ((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486;
			((Class521_Sub1_Sub4_Sub1) this).aClass282_Sub50_Sub17_10486 = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17)
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.aFloat4671, (int) class385.aFloat4673, null, (byte) -74);
	}

	public boolean method86(int i) {
		return ((Class521_Sub1_Sub4_Sub1) this).aBool10490;
	}

	public Class200 method12993(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		if (null == ((Class521_Sub1_Sub4_Sub1) this).aClass200_10484)
			((Class521_Sub1_Sub4_Sub1) this).aClass200_10484 = Class275_Sub2.method12505((int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, method16068(class505, 0, (byte) -75), (byte) -30);
		return ((Class521_Sub1_Sub4_Sub1) this).aClass200_10484;
	}

	public int method77() {
		return ((Class521_Sub1_Sub4_Sub1) this).aByte10485;
	}

	public int method13003() {
		return (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 ? ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.YA() : 0);
	}

	boolean method13001() {
		if (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.i();
		return false;
	}

	public boolean method95() {
		return ((Class521_Sub1_Sub4_Sub1) this).aBool10490;
	}

	public int method13006() {
		return (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 ? ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.YA() : 0);
	}

	Class285 method13009(GraphicalRenderer class505) {
		if (null == ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return null;
		Class294 class294 = class505.method8450();
		class294.method5209(method11168());
		class294.method5219((float) aShort9611, 0.0F, (float) aShort9612);
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub4_Sub1) this).aBool10481, (byte) -51);
		((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	Class285 method13010(GraphicalRenderer class505) {
		if (null == ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483)
			return null;
		Class294 class294 = class505.method8450();
		class294.method5209(method11168());
		class294.method5219((float) aShort9611, 0.0F, (float) aShort9612);
		Class285 class285 = Class470.method7824(((Class521_Sub1_Sub4_Sub1) this).aBool10481, (byte) -61);
		((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	public Class200 method13019(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		if (null == ((Class521_Sub1_Sub4_Sub1) this).aClass200_10484)
			((Class521_Sub1_Sub4_Sub1) this).aClass200_10484 = Class275_Sub2.method12505((int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, method16068(class505, 0, (byte) -38), (byte) 41);
		return ((Class521_Sub1_Sub4_Sub1) this).aClass200_10484;
	}

	void method13012(GraphicalRenderer class505) {
		/* empty */
	}

	public int method89(int i) {
		return ((Class521_Sub1_Sub4_Sub1) this).aByte10485;
	}

	void method13023(GraphicalRenderer class505) {
		/* empty */
	}

	public Class200 method13018(GraphicalRenderer class505) {
		Class385 class385 = method11166().aClass385_3595;
		if (null == ((Class521_Sub1_Sub4_Sub1) this).aClass200_10484)
			((Class521_Sub1_Sub4_Sub1) this).aClass200_10484 = Class275_Sub2.method12505((int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, method16068(class505, 0, (byte) 32), (byte) 31);
		return ((Class521_Sub1_Sub4_Sub1) this).aClass200_10484;
	}

	public int method13017() {
		return (null != ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 ? ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.YA() : 0);
	}

	boolean method13020(GraphicalRenderer class505, int i, int i_14_) {
		MeshRasterizer class528 = method16068(class505, 131072, (byte) -6);
		if (null != class528) {
			Class294 class294 = method11168();
			return class528.method11270(i, i_14_, class294, false, 0);
		}
		return false;
	}

	MeshRasterizer method16070(GraphicalRenderer class505, int i) {
		if (((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 != null && class505.method8452(((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.m(), i) == 0)
			return ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483;
		Class452 class452 = method16069(class505, i, false, 373644227);
		if (null != class452)
			return (MeshRasterizer) class452.anObject5443;
		return null;
	}

	MeshRasterizer method16071(GraphicalRenderer class505, int i) {
		if (((Class521_Sub1_Sub4_Sub1) this).aClass528_10483 != null && class505.method8452(((Class521_Sub1_Sub4_Sub1) this).aClass528_10483.m(), i) == 0)
			return ((Class521_Sub1_Sub4_Sub1) this).aClass528_10483;
		Class452 class452 = method16069(class505, i, false, -1558431742);
		if (null != class452)
			return (MeshRasterizer) class452.anObject5443;
		return null;
	}

	Class452 method16072(GraphicalRenderer class505, int i, boolean bool) {
		Class478 class478 = (((Class521_Sub1_Sub4_Sub1) this).aClass474_10489.method7891(462020215 * ((Class521_Sub1_Sub4_Sub1) this).anInt10482, 65280));
		Class390 class390;
		Class390 class390_15_;
		if (((Class521_Sub1_Sub4_Sub1) this).aBool10488) {
			class390 = aClass206_7970.aClass390Array2614[aByte7968];
			class390_15_ = aClass206_7970.aClass390Array2607[0];
		} else {
			class390 = aClass206_7970.aClass390Array2607[aByte7968];
			if (aByte7968 < 3)
				class390_15_ = aClass206_7970.aClass390Array2607[aByte7968 + 1];
			else
				class390_15_ = null;
		}
		Class385 class385 = method11166().aClass385_3595;
		return class478.method8010(class505, i, ((Class521_Sub1_Sub4_Sub1) this).aByte10485, ((Class521_Sub1_Sub4_Sub1) this).aByte10487, class390, class390_15_, (int) class385.aFloat4671, (int) class385.aFloat4672, (int) class385.aFloat4673, bool, null, 982185102);
	}

	static void method16073(GraphicalRenderer class505, int i, int i_16_, int i_17_) {
		if (i >= 0 && i_16_ >= 0 && Class20.aClass384_158 != null) {
			Class219 class219 = client.aClass257_7353.method4519(1956252326);
			Class384 class384 = class505.method8449();
			class505.method8424(Class20.aClass384_158);
			class505.method8457(Class20.aClass294_155);
			class505.r(Class20.anInt180 * -1747787169, 1607392711 * Class20.anInt181, (Class20.anInt180 * -1747787169 + Class20.anInt176 * -2026336709), (Class20.anInt184 * 919355353 + 1607392711 * Class20.anInt181));
			class505.method8617(-1747787169 * Class20.anInt180, 1607392711 * Class20.anInt181, Class20.anInt176 * -2026336709, 919355353 * Class20.anInt184);
			class384.method6522(Class20.aClass294_155);
			class384.method6523(Class20.aClass384_158);
			class384.method6524();
			int i_18_ = i - -1747787169 * Class20.anInt180;
			int i_19_ = i_16_ - Class20.anInt181 * 1607392711;
			if (client.aClass257_7353.method4430(-955165498) != null && (!client.aBool7344 || (1310510077 * Class506.anInt5858 & 0x40) != 0)) {
				int i_20_ = -1;
				int i_21_ = -1;
				float f = (2.0F * (float) i_18_ / (float) (Class20.anInt176 * -2026336709) - 1.0F);
				float f_22_ = (2.0F * (float) i_19_ / (float) (919355353 * Class20.anInt184) - 1.0F);
				class384.method6527(f, f_22_, -1.0F, Class20.aFloatArray194);
				float f_23_ = Class20.aFloatArray194[0] / Class20.aFloatArray194[3];
				float f_24_ = Class20.aFloatArray194[1] / Class20.aFloatArray194[3];
				float f_25_ = Class20.aFloatArray194[2] / Class20.aFloatArray194[3];
				class384.method6527(f, f_22_, 1.0F, Class20.aFloatArray194);
				float f_26_ = Class20.aFloatArray194[0] / Class20.aFloatArray194[3];
				float f_27_ = Class20.aFloatArray194[1] / Class20.aFloatArray194[3];
				float f_28_ = Class20.aFloatArray194[2] / Class20.aFloatArray194[3];
				float f_29_ = Class4.method288(f_23_, f_24_, f_25_, f_26_, f_27_, f_28_, 4, -1077357745);
				if (f_29_ > 0.0F) {
					float f_30_ = f_26_ - f_23_;
					float f_31_ = f_28_ - f_25_;
					int i_32_ = (int) (f_30_ * f_29_ + f_23_);
					int i_33_ = (int) (f_29_ * f_31_ + f_25_);
					i_20_ = i_32_ + (Class84.myPlayer.method15805(828768449) - 1 << 8) >> 9;
					i_21_ = i_33_ + (Class84.myPlayer.method15805(828768449) - 1 << 8) >> 9;
					int i_34_ = Class84.myPlayer.aByte7967;
					if (i_34_ < 3 && ((client.aClass257_7353.method4433(33386298).aByteArrayArrayArray3638[1][i_32_ >> 9][i_33_ >> 9]) & 0x2) != 0)
						i_34_++;
				}
				if (-1 != i_20_ && i_21_ != -1) {
					if (client.aBool7344 && 0 != (1310510077 * Class506.anInt5858 & 0x40)) {
						Class118 class118 = Index.method5694(Class7.anInt56 * 728544879, (client.anInt7345 * -1673073865), -649580549);
						if (class118 != null)
							PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(" ").append(Class2.aString17).append(" ").toString(), (Class519.anInt5932 * -239192305), 59, -1, 0L, i_20_, i_21_, true, false, (long) (i_20_ << 32 | i_21_), true, -1546030291);
						else
							Class60.method1170(-609337146);
					} else {
						if (Class96_Sub6.aBool9173)
							PlayerAppearance.method4032((Message.aClass433_5287.translate(Class223.aClass495_2772, -1215623425)), "", -1, 60, -1, 0L, i_20_, i_21_, true, false, (long) (i_20_ << 32 | i_21_), true, -1333249112);
						PlayerAppearance.method4032(Class85.aString817, "", 460745521 * client.anInt7311, 23, -1, 0L, i_20_, i_21_, true, false, (long) (i_20_ << 32 | i_21_), true, -1883599124);
					}
				}
			}
			Login class284 = client.aClass257_7353.method4430(-1644964406).aClass284_2648;
			int i_35_ = i;
			int i_36_ = i_16_;
			List list = class284.aList3388;
			Iterator iterator = list.iterator();
			while (iterator.hasNext()) {
				Class285 class285 = (Class285) iterator.next();
				if ((client.aBool7372 || (Class84.myPlayer.aByte7967 == class285.aClass521_Sub1_3391.aByte7967)) && class285.method5019(class505, i_35_, i_36_, 319168388)) {
					boolean bool = false;
					boolean bool_37_ = false;
					int i_38_;
					int i_39_;
					if (class285.aClass521_Sub1_3391 instanceof Class521_Sub1_Sub1) {
						i_38_ = ((Class521_Sub1_Sub1) class285.aClass521_Sub1_3391).aShort9458;
						i_39_ = ((Class521_Sub1_Sub1) class285.aClass521_Sub1_3391).aShort9456;
					} else {
						Class385 class385 = (class285.aClass521_Sub1_3391.method11166().aClass385_3595);
						i_38_ = (int) class385.aFloat4671 >> 9;
						i_39_ = (int) class385.aFloat4673 >> 9;
					}
					if (class285.aClass521_Sub1_3391 instanceof Player) {
						Player class521_sub1_sub1_sub2_sub1 = ((Player) class285.aClass521_Sub1_3391);
						int i_40_ = class521_sub1_sub1_sub2_sub1.method15805(828768449);
						Class385 class385 = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
						if ((0 == (i_40_ & 0x1) && 0 == ((int) class385.aFloat4671 & 0x1ff) && 0 == ((int) class385.aFloat4673 & 0x1ff)) || (1 == (i_40_ & 0x1) && 256 == ((int) class385.aFloat4671 & 0x1ff) && (((int) class385.aFloat4673 & 0x1ff) == 256))) {
							int i_41_ = ((int) class385.aFloat4671 - (class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1 << 8));
							int i_42_ = ((int) class385.aFloat4673 - (class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1 << 8));
							for (int i_43_ = 0; i_43_ < client.anInt7211 * -685729279; i_43_++) {
								Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_43_])));
								if (class282_sub47 != null) {
									NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
									if (((class521_sub1_sub1_sub2_sub2.anInt10375) * 717008059 != client.cycles * -1809259861) && (class521_sub1_sub1_sub2_sub2.aBool10318)) {
										Class385 class385_44_ = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
										int i_45_ = ((int) class385_44_.aFloat4671 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
										int i_46_ = ((int) class385_44_.aFloat4673 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
										if (i_45_ >= i_41_ && (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_45_ - i_41_ >> 9))) && i_46_ >= i_42_ && (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_46_ - i_42_ >> 9)))) {
											Class220.method3736(class521_sub1_sub1_sub2_sub2, ((Class84.myPlayer.aByte7967) != (class285.aClass521_Sub1_3391.aByte7967)), 1752430415);
											class521_sub1_sub1_sub2_sub2.anInt10375 = (client.cycles * 1977662161);
										}
									}
								}
							}
							int i_47_ = Class197.NUM_PLAYER_INDICES * -963499271;
							int[] is = Class197.PLAYER_INDICES;
							for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
								Player class521_sub1_sub1_sub2_sub1_49_ = (client.players[is[i_48_]]);
								if (class521_sub1_sub1_sub2_sub1_49_ != null && ((class521_sub1_sub1_sub2_sub1_49_.anInt10375) * 717008059 != -1809259861 * client.cycles) && (class521_sub1_sub1_sub2_sub1 != class521_sub1_sub1_sub2_sub1_49_) && (class521_sub1_sub1_sub2_sub1_49_.aBool10318)) {
									Class385 class385_50_ = (class521_sub1_sub1_sub2_sub1_49_.method11166().aClass385_3595);
									int i_51_ = ((int) class385_50_.aFloat4671 - (class521_sub1_sub1_sub2_sub1_49_.method15805(828768449) - 1 << 8));
									int i_52_ = ((int) class385_50_.aFloat4673 - (class521_sub1_sub1_sub2_sub1_49_.method15805(828768449) - 1 << 8));
									if (i_51_ >= i_41_ && (class521_sub1_sub1_sub2_sub1_49_.method15805(828768449) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_51_ - i_41_ >> 9))) && i_52_ >= i_42_ && (class521_sub1_sub1_sub2_sub1_49_.method15805(828768449) <= (class521_sub1_sub1_sub2_sub1.method15805(828768449) - (i_52_ - i_42_ >> 9)))) {
										Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1_49_, ((class285.aClass521_Sub1_3391.aByte7967) != (Class84.myPlayer.aByte7967)), 1557506355);
										class521_sub1_sub1_sub2_sub1_49_.anInt10375 = client.cycles * 1977662161;
									}
								}
							}
						}
						if (717008059 * class521_sub1_sub1_sub2_sub1.anInt10375 == client.cycles * -1809259861)
							continue;
						Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, (class285.aClass521_Sub1_3391.aByte7967 != (Class84.myPlayer.aByte7967)), 1557506355);
						class521_sub1_sub1_sub2_sub1.anInt10375 = 1977662161 * client.cycles;
					}
					if (class285.aClass521_Sub1_3391 instanceof NPC) {
						NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class285.aClass521_Sub1_3391);
						if (null != class521_sub1_sub1_sub2_sub2.aClass409_10580) {
							Class385 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
							if ((0 == (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) & 0x1) && 0 == ((int) class385.aFloat4671 & 0x1ff) && 0 == ((int) class385.aFloat4673 & 0x1ff)) || (1 == ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) & 0x1) && 256 == ((int) class385.aFloat4671 & 0x1ff) && 256 == ((int) class385.aFloat4673 & 0x1ff))) {
								int i_53_ = ((int) class385.aFloat4671 - (((class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858) * 1203434505) - 1 << 8));
								int i_54_ = ((int) class385.aFloat4673 - ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - 1 << 8));
								for (int i_55_ = 0; i_55_ < client.anInt7211 * -685729279; i_55_++) {
									Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) client.anIntArray7212[i_55_])));
									if (null != class282_sub47) {
										NPC class521_sub1_sub1_sub2_sub2_56_ = ((NPC) class282_sub47.anObject8068);
										if (((717008059 * (class521_sub1_sub1_sub2_sub2_56_.anInt10375)) != -1809259861 * client.cycles) && (class521_sub1_sub1_sub2_sub2 != class521_sub1_sub1_sub2_sub2_56_) && (class521_sub1_sub1_sub2_sub2_56_.aBool10318)) {
											Class385 class385_57_ = (class521_sub1_sub1_sub2_sub2_56_.method11166().aClass385_3595);
											int i_58_ = ((int) (class385_57_.aFloat4671) - ((1203434505 * (class521_sub1_sub1_sub2_sub2_56_.aClass409_10580.anInt4858)) - 1 << 8));
											int i_59_ = ((int) (class385_57_.aFloat4673) - (((class521_sub1_sub1_sub2_sub2_56_.aClass409_10580.anInt4858) * 1203434505) - 1 << 8));
											if (i_58_ >= i_53_ && ((1203434505 * (class521_sub1_sub1_sub2_sub2_56_.aClass409_10580.anInt4858)) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_58_ - i_53_ >> 9))) && i_59_ >= i_54_ && ((class521_sub1_sub1_sub2_sub2_56_.aClass409_10580.anInt4858) * 1203434505 <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_59_ - i_54_ >> 9)))) {
												Class220.method3736(class521_sub1_sub1_sub2_sub2_56_, ((Class84.myPlayer.aByte7967) != (class285.aClass521_Sub1_3391.aByte7967)), 1644654446);
												class521_sub1_sub1_sub2_sub2_56_.anInt10375 = (1977662161 * client.cycles);
											}
										}
									}
								}
								int i_60_ = Class197.NUM_PLAYER_INDICES * -963499271;
								int[] is = Class197.PLAYER_INDICES;
								for (int i_61_ = 0; i_61_ < i_60_; i_61_++) {
									Player class521_sub1_sub1_sub2_sub1 = (client.players[is[i_61_]]);
									if (null != class521_sub1_sub1_sub2_sub1 && (-1809259861 * client.cycles != (717008059 * (class521_sub1_sub1_sub2_sub1.anInt10375))) && (class521_sub1_sub1_sub2_sub1.aBool10318)) {
										Class385 class385_62_ = (class521_sub1_sub1_sub2_sub1.method11166().aClass385_3595);
										int i_63_ = ((int) class385_62_.aFloat4671 - ((class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1) << 8));
										int i_64_ = ((int) class385_62_.aFloat4673 - ((class521_sub1_sub1_sub2_sub1.method15805(828768449) - 1) << 8));
										if (i_63_ >= i_53_ && (class521_sub1_sub1_sub2_sub1.method15805(828768449) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_63_ - i_53_ >> 9))) && i_64_ >= i_54_ && (class521_sub1_sub1_sub2_sub1.method15805(828768449) <= ((1203434505 * (class521_sub1_sub1_sub2_sub2.aClass409_10580.anInt4858)) - (i_64_ - i_54_ >> 9)))) {
											Class96_Sub22.method14678(class521_sub1_sub1_sub2_sub1, ((class285.aClass521_Sub1_3391.aByte7967) != (Class84.myPlayer.aByte7967)), 1557506355);
											class521_sub1_sub1_sub2_sub1.anInt10375 = (client.cycles * 1977662161);
										}
									}
								}
							}
							if ((class521_sub1_sub1_sub2_sub2.anInt10375 * 717008059) == -1809259861 * client.cycles)
								continue;
							Class220.method3736(class521_sub1_sub1_sub2_sub2, ((Class84.myPlayer.aByte7967) != class285.aClass521_Sub1_3391.aByte7967), 1776503457);
							class521_sub1_sub1_sub2_sub2.anInt10375 = client.cycles * 1977662161;
						}
					}
					if (class285.aClass521_Sub1_3391 instanceof Class521_Sub1_Sub2_Sub1) {
						int i_65_ = class219.anInt2711 * 1948093437 + i_38_;
						int i_66_ = i_39_ + class219.anInt2712 * -1002240017;
						Class282_Sub29 class282_sub29 = ((Class282_Sub29) (client.aClass465_7414.method7754((long) ((class285.aClass521_Sub1_3391.aByte7967) << 28 | i_66_ << 14 | i_65_))));
						if (null != class282_sub29) {
							int i_67_ = 0;
							Class282_Sub34 class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.method8065(-2081006953));
							while (class282_sub34 != null) {
								ItemDefinitions class425 = (IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(1964309863 * class282_sub34.anInt7853, 2117137985));
								int i_68_;
								if (class425.aBool5101)
									i_68_ = class425.anInt5102 * 712312847;
								else if (class425.members)
									i_68_ = -1519092215 * (Class149_Sub2.aClass511_9314.anInt5880);
								else
									i_68_ = 725268415 * (Class149_Sub2.aClass511_9314.anInt5881);
								if (client.aBool7344 && ((Class84.myPlayer.aByte7967) == (class285.aClass521_Sub1_3391.aByte7967))) {
									AttributeDefault class437 = ((Class96_Sub12.anInt9319 * -1605351655) != -1 ? (Class125.aClass424_1573.method7069((-1605351655 * Class96_Sub12.anInt9319), (byte) 0)) : null);
									if ((Class506.anInt5858 * 1310510077 & 0x1) != 0 && (null == class437 || ((class425.method7099((Class96_Sub12.anInt9319 * -1605351655), (-1741480635 * class437.anInt5337), -1083542144)) != (class437.anInt5337 * -1741480635))))
										PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(i_68_, 619010179)).append(class425.aString5043).toString(), Class519.anInt5932 * -239192305, 17, -1, (long) (class282_sub34.anInt7853 * 1964309863), i_38_, i_39_, true, false, (long) i_67_, false, -1634636602);
								}
								if (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967)) {
									String[] strings = class425.groundOptions;
									for (int i_69_ = strings.length - 1; i_69_ >= 0; i_69_--) {
										if (null != strings[i_69_]) {
											int i_70_ = 0;
											int i_71_ = client.anInt7342 * 452205213;
											if (0 == i_69_)
												i_70_ = 18;
											if (i_69_ == 1)
												i_70_ = 19;
											if (2 == i_69_)
												i_70_ = 20;
											if (3 == i_69_)
												i_70_ = 21;
											if (4 == i_69_)
												i_70_ = 22;
											if (5 == i_69_)
												i_70_ = 1004;
											if (i_69_ == (class425.anInt5059 * -934531831))
												i_71_ = (1152999273 * class425.anInt5055);
											if (i_69_ == (class425.anInt5060 * 1533030603))
												i_71_ = (class425.anInt5056 * -1540078225);
											PlayerAppearance.method4032(strings[i_69_], new StringBuilder().append(Class59.method1163(i_68_, 619010179)).append(class425.aString5043).toString(), i_71_, i_70_, -1, (long) (1964309863 * (class282_sub34.anInt7853)), i_38_, i_39_, true, false, (long) i_67_, false, -1528903882);
										}
									}
								}
								class282_sub34 = ((Class282_Sub34) class282_sub29.aClass482_7708.method8068((byte) 117));
								i_67_++;
							}
						}
					}
					if (class285.aClass521_Sub1_3391 instanceof Interface12) {
						Interface12 interface12 = (Interface12) class285.aClass521_Sub1_3391;
						Class478 class478 = (client.aClass257_7353.method4436(-1539469212).method7891(interface12.method84(2000772127), 65280));
						if (null != class478.anIntArray5650)
							class478 = class478.method8013((Class158_Sub1.aClass3_8507), (byte) 107);
						if (null != class478) {
							if (client.aBool7344 && (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967))) {
								AttributeDefault class437 = (-1 != (-1605351655 * Class96_Sub12.anInt9319) ? (Class125.aClass424_1573.method7069((Class96_Sub12.anInt9319 * -1605351655), (byte) 0)) : null);
								if (0 != (1310510077 * Class506.anInt5858 & 0x4) && (class437 == null || ((class478.method7963((Class96_Sub12.anInt9319 * -1605351655), -1741480635 * class437.anInt5337, -2052450472)) != (-1741480635 * class437.anInt5337))))
									PlayerAppearance.method4032(client.aString7275, new StringBuilder().append(client.aString7356).append(" ").append(Class2.aString17).append(" ").append(Class59.method1163(65535, 619010179)).append(class478.aString5638).toString(), Class519.anInt5932 * -239192305, 2, -1, Class329.method5905(interface12, i_38_, i_39_, (byte) -79), i_38_, i_39_, true, false, (long) interface12.hashCode(), false, -2015227666);
							}
							if (class285.aClass521_Sub1_3391.aByte7967 == (Class84.myPlayer.aByte7967)) {
								String[] strings = class478.aStringArray5647;
								if (null != strings) {
									for (int i_72_ = strings.length - 1; i_72_ >= 0; i_72_--) {
										if (strings[i_72_] != null) {
											int i_73_ = 0;
											int i_74_ = 452205213 * client.anInt7342;
											if (i_72_ == 0)
												i_73_ = 3;
											if (i_72_ == 1)
												i_73_ = 4;
											if (2 == i_72_)
												i_73_ = 5;
											if (i_72_ == 3)
												i_73_ = 6;
											if (4 == i_72_)
												i_73_ = 1001;
											if (i_72_ == 5)
												i_73_ = 1002;
											if (class478.anInt5705 * -176888381 == i_72_)
												i_74_ = (1362609543 * class478.anInt5665);
											if (570422367 * class478.anInt5670 == i_72_)
												i_74_ = (-305458077 * class478.anInt5666);
											PlayerAppearance.method4032(strings[i_72_], new StringBuilder().append(Class59.method1163(65535, 619010179)).append(class478.aString5638).toString(), i_74_, i_73_, -1, (Class329.method5905(interface12, i_38_, i_39_, (byte) -98)), i_38_, i_39_, true, false, (long) interface12.hashCode(), false, -1344607256);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
