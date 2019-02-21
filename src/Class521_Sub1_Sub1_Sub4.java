/* Class521_Sub1_Sub1_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class521_Sub1_Sub1_Sub4 extends Class521_Sub1_Sub1 {
	Animation aClass456_10404;
	boolean aBool10405;
	int anInt10406;
	int anInt10407;
	int anInt10408 = 0;
	Class539 aClass539_10409;

	Class285 method12989(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15929(class505, 0x800 | (868957945 * ((Class521_Sub1_Sub1_Sub4) this).anInt10408 != 0 ? 5 : 0), (((Class521_Sub1_Sub1_Sub4) this).anInt10406 * 346760837), (short) 27510);
		if (null == class528)
			return null;
		if (0 != ((Class521_Sub1_Sub1_Sub4) this).anInt10408 * 868957945)
			class528.f(1509410816 * ((Class521_Sub1_Sub1_Sub4) this).anInt10408);
		Matrix44Var class294 = method11168();
		method15930(class505, class528, class294, (byte) 22);
		Class285 class285 = Class470.method7824(false, (byte) -71);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409) {
			Class151 class151 = ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub1_Sub4) this).aBool10405 = class528.i();
		((Class521_Sub1_Sub1_Sub4) this).anInt10407 = class528.YA() * 1799159049;
		class528.n();
		return class285;
	}

	boolean method12986(int i) {
		return false;
	}

	public final boolean method15925() {
		return (((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 != null && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.hasSpeed(611652726));
	}

	public int method12995(int i) {
		return ((Class521_Sub1_Sub1_Sub4) this).anInt10407 * -1656643271;
	}

	public Class200 method12992(GraphicalRenderer class505, byte i) {
		return null;
	}

	public final void method15926(int i, byte i_0_) {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass456_10404) {
			if (i_0_ != 8) {
				if (!((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(1671019519)) {
					if (i_0_ != 8)
						((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7627(i, 360110199);
				}
			}
		}
	}

	public final boolean method15927(int i) {
		return (((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 != null && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.hasSpeed(-432924037));
	}

	public final boolean method15928(short i) {
		return (((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 == null || ((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(283387313));
	}

	MeshRasterizer method15929(GraphicalRenderer class505, int i, int i_1_, short i_2_) {
		SpotAnimDefinitions class525 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_1_, (byte) -22);
		Class390 class390 = aClass206_7970.aClass390Array2607[plane];
		Class390 class390_3_ = (aByte7968 < 3 ? aClass206_7970.aClass390Array2607[aByte7968 + 1] : null);
		Vector3 class385 = method11166().aClass385_3595;
		return ((((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 != null && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(1923086864)) ? class525.method11238(class505, i, true, class390, class390_3_, (int) class385.x, (int) class385.y, (int) class385.z, (((Class521_Sub1_Sub1_Sub4) this).aClass456_10404), (byte) 2, -2029487974)
				: class525.method11238(class505, i, true, class390, class390_3_, (int) class385.x, (int) class385.y, (int) class385.z, null, (byte) 2, -379915283));
	}

	Class285 method13009(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15929(class505, 0x800 | (868957945 * ((Class521_Sub1_Sub1_Sub4) this).anInt10408 != 0 ? 5 : 0), (((Class521_Sub1_Sub1_Sub4) this).anInt10406 * 346760837), (short) -6159);
		if (null == class528)
			return null;
		if (0 != ((Class521_Sub1_Sub1_Sub4) this).anInt10408 * 868957945)
			class528.f(1509410816 * ((Class521_Sub1_Sub1_Sub4) this).anInt10408);
		Matrix44Var class294 = method11168();
		method15930(class505, class528, class294, (byte) 81);
		Class285 class285 = Class470.method7824(false, (byte) -13);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409) {
			Class151 class151 = ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub1_Sub4) this).aBool10405 = class528.i();
		((Class521_Sub1_Sub1_Sub4) this).anInt10407 = class528.YA() * 1799159049;
		class528.n();
		return class285;
	}

	public Class521_Sub1_Sub1_Sub4(SceneObjectManager class206, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool) {
		super(class206, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, i_13_, false, (byte) 0);
		((Class521_Sub1_Sub1_Sub4) this).anInt10407 = 0;
		((Class521_Sub1_Sub1_Sub4) this).aBool10405 = true;
		((Class521_Sub1_Sub1_Sub4) this).anInt10406 = -1615535539 * i;
		((Class521_Sub1_Sub1_Sub4) this).anInt10408 = -2052644023 * i_14_;
		SpotAnimDefinitions class525 = (IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(346760837 * ((Class521_Sub1_Sub1_Sub4) this).anInt10406, (byte) -53));
		int i_15_ = class525.animationId * -364555849;
		if (-1 != i_15_) {
			((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 = new Class456_Sub2(this, false);
			int i_16_ = class525.aBool6968 ? 0 : 2;
			if (bool)
				i_16_ = 1;
			((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7571(i_15_, i_4_, i_16_, false, -782305807);
		}
		method13008(1, (byte) -42);
	}

	void method15930(GraphicalRenderer class505, MeshRasterizer class528, Matrix44Var class294, byte i) {
		class528.method11273(class294);
		Class87[] class87s = class528.method11253();
		Class172[] class172s = class528.method11274();
		if ((((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 == null || ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.aBool7132) && (class87s != null || class172s != null))
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 = Class539.method11557(client.cycles * -1809259861, true);
		if (((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 != null) {
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11511(class505, (long) (client.cycles * -1809259861), class87s, class172s, false);
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11515(plane, aShort9458, localX, aShort9456, localY);
		}
	}

	public void method15931(int i) {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409)
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11527();
	}

	boolean method12983(GraphicalRenderer class505, int i, int i_17_, int i_18_) {
		return false;
	}

	final boolean method12985(int i) {
		return false;
	}

	final void method13013(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_19_, int i_20_, boolean bool, int i_21_) {
		throw new IllegalStateException();
	}

	public void method15932() {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409)
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11527();
	}

	boolean method12999() {
		return false;
	}

	boolean method13000() {
		return ((Class521_Sub1_Sub1_Sub4) this).aBool10405;
	}

	final void method13021() {
		throw new IllegalStateException();
	}

	public int method13017() {
		return ((Class521_Sub1_Sub1_Sub4) this).anInt10407 * -1656643271;
	}

	public Class200 method13019(GraphicalRenderer class505) {
		return null;
	}

	public int method13005() {
		return ((Class521_Sub1_Sub1_Sub4) this).anInt10407 * -1656643271;
	}

	final void method12984(int i) {
		throw new IllegalStateException();
	}

	void method15933(GraphicalRenderer class505, MeshRasterizer class528, Matrix44Var class294) {
		class528.method11273(class294);
		Class87[] class87s = class528.method11253();
		Class172[] class172s = class528.method11274();
		if ((((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 == null || ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.aBool7132) && (class87s != null || class172s != null))
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 = Class539.method11557(client.cycles * -1809259861, true);
		if (((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 != null) {
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11511(class505, (long) (client.cycles * -1809259861), class87s, class172s, false);
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11515(plane, aShort9458, localX, aShort9456, localY);
		}
	}

	boolean method13002() {
		return ((Class521_Sub1_Sub1_Sub4) this).aBool10405;
	}

	Class285 method13010(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15929(class505, 0x800 | (868957945 * ((Class521_Sub1_Sub1_Sub4) this).anInt10408 != 0 ? 5 : 0), (((Class521_Sub1_Sub1_Sub4) this).anInt10406 * 346760837), (short) 25265);
		if (null == class528)
			return null;
		if (0 != ((Class521_Sub1_Sub1_Sub4) this).anInt10408 * 868957945)
			class528.f(1509410816 * ((Class521_Sub1_Sub1_Sub4) this).anInt10408);
		Matrix44Var class294 = method11168();
		method15930(class505, class528, class294, (byte) 3);
		Class285 class285 = Class470.method7824(false, (byte) -9);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409) {
			Class151 class151 = ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub1_Sub4) this).aBool10405 = class528.i();
		((Class521_Sub1_Sub1_Sub4) this).anInt10407 = class528.YA() * 1799159049;
		class528.n();
		return class285;
	}

	Class285 method12990(GraphicalRenderer class505, int i) {
		MeshRasterizer class528 = method15929(class505, 0x800 | (868957945 * ((Class521_Sub1_Sub1_Sub4) this).anInt10408 != 0 ? 5 : 0), (((Class521_Sub1_Sub1_Sub4) this).anInt10406 * 346760837), (short) -28146);
		if (null == class528)
			return null;
		if (0 != ((Class521_Sub1_Sub1_Sub4) this).anInt10408 * 868957945)
			class528.f(1509410816 * ((Class521_Sub1_Sub1_Sub4) this).anInt10408);
		Matrix44Var class294 = method11168();
		method15930(class505, class528, class294, (byte) 66);
		Class285 class285 = Class470.method7824(false, (byte) -116);
		class528.method11282(class294, aClass275_Sub5Array7965[0], 0);
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409) {
			Class151 class151 = ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11517();
			class505.method8456(class151);
		}
		((Class521_Sub1_Sub1_Sub4) this).aBool10405 = class528.i();
		((Class521_Sub1_Sub1_Sub4) this).anInt10407 = class528.YA() * 1799159049;
		class528.n();
		return class285;
	}

	void method13012(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15929(class505, 0, (346760837 * ((Class521_Sub1_Sub1_Sub4) this).anInt10406), (short) -3054);
		if (class528 != null)
			method15930(class505, class528, method11168(), (byte) 100);
	}

	void method12991(GraphicalRenderer class505, int i) {
		MeshRasterizer class528 = method15929(class505, 0, (346760837 * ((Class521_Sub1_Sub1_Sub4) this).anInt10406), (short) 4697);
		if (class528 != null)
			method15930(class505, class528, method11168(), (byte) 25);
	}

	final boolean method13026() {
		return false;
	}

	final void method13015() {
		throw new IllegalStateException();
	}

	final void method13016(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_22_, int i_23_, boolean bool) {
		throw new IllegalStateException();
	}

	public int method13006() {
		return ((Class521_Sub1_Sub1_Sub4) this).anInt10407 * -1656643271;
	}

	public Class200 method13018(GraphicalRenderer class505) {
		return null;
	}

	public Class200 method12993(GraphicalRenderer class505) {
		return null;
	}

	public int method13003() {
		return ((Class521_Sub1_Sub1_Sub4) this).anInt10407 * -1656643271;
	}

	boolean method13001() {
		return ((Class521_Sub1_Sub1_Sub4) this).aBool10405;
	}

	boolean method13020(GraphicalRenderer class505, int i, int i_24_) {
		return false;
	}

	public final void method15934(int i) {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(373644481))
			((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7627(i, 617125868);
	}

	public final void method15935(int i) {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(853707253))
			((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7627(i, 1656253798);
	}

	public final void method15936(int i) {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(965558043))
			((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7627(i, 1846790436);
	}

	public final void method15937(int i) {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(1151294437))
			((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7627(i, 1439956381);
	}

	public final void method15938(int i) {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(1390763763))
			((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7627(i, -1186053610);
	}

	public final boolean method15939() {
		return (((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 != null && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.hasSpeed(930180782));
	}

	void method13023(GraphicalRenderer class505) {
		MeshRasterizer class528 = method15929(class505, 0, (346760837 * ((Class521_Sub1_Sub1_Sub4) this).anInt10406), (short) 19834);
		if (class528 != null)
			method15930(class505, class528, method11168(), (byte) 68);
	}

	public final boolean method15940() {
		return (((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 != null && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.hasSpeed(1035417240));
	}

	public final boolean method15941() {
		return (((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 == null || ((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(476304409));
	}

	MeshRasterizer method15942(GraphicalRenderer class505, int i, int i_25_) {
		SpotAnimDefinitions class525 = IndexLoaders.SPOT_ANIM_INDEX_LOADER.getSpotAnimDefs(i_25_, (byte) 25);
		Class390 class390 = aClass206_7970.aClass390Array2607[plane];
		Class390 class390_26_ = (aByte7968 < 3 ? aClass206_7970.aClass390Array2607[aByte7968 + 1] : null);
		Vector3 class385 = method11166().aClass385_3595;
		return ((((Class521_Sub1_Sub1_Sub4) this).aClass456_10404 != null && !((Class521_Sub1_Sub1_Sub4) this).aClass456_10404.method7580(1039380680)) ? class525.method11238(class505, i, true, class390, class390_26_, (int) class385.x, (int) class385.y, (int) class385.z, (((Class521_Sub1_Sub1_Sub4) this).aClass456_10404), (byte) 2, -1013943244)
				: class525.method11238(class505, i, true, class390, class390_26_, (int) class385.x, (int) class385.y, (int) class385.z, null, (byte) 2, -1957882134));
	}

	void method15943(GraphicalRenderer class505, MeshRasterizer class528, Matrix44Var class294) {
		class528.method11273(class294);
		Class87[] class87s = class528.method11253();
		Class172[] class172s = class528.method11274();
		if ((((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 == null || ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.aBool7132) && (class87s != null || class172s != null))
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 = Class539.method11557(client.cycles * -1809259861, true);
		if (((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 != null) {
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11511(class505, (long) (client.cycles * -1809259861), class87s, class172s, false);
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11515(plane, aShort9458, localX, aShort9456, localY);
		}
	}

	void method15944(GraphicalRenderer class505, MeshRasterizer class528, Matrix44Var class294) {
		class528.method11273(class294);
		Class87[] class87s = class528.method11253();
		Class172[] class172s = class528.method11274();
		if ((((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 == null || ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.aBool7132) && (class87s != null || class172s != null))
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 = Class539.method11557(client.cycles * -1809259861, true);
		if (((Class521_Sub1_Sub1_Sub4) this).aClass539_10409 != null) {
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11511(class505, (long) (client.cycles * -1809259861), class87s, class172s, false);
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11515(plane, aShort9458, localX, aShort9456, localY);
		}
	}

	boolean method12987(int i) {
		return ((Class521_Sub1_Sub1_Sub4) this).aBool10405;
	}

	final boolean method13011() {
		return false;
	}

	public void method15945() {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409)
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11527();
	}

	public void method15946() {
		if (null != ((Class521_Sub1_Sub1_Sub4) this).aClass539_10409)
			((Class521_Sub1_Sub1_Sub4) this).aClass539_10409.method11527();
	}
}
