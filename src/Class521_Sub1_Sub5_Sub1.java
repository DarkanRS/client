
/* Class521_Sub1_Sub5_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class521_Sub1_Sub5_Sub1 extends Class521_Sub1_Sub5 implements SceneObject {
	MeshRasterizer aClass528_10513;
	int anInt10514;
	ObjectIndexLoader aClass474_10515;
	boolean aBool10516;
	Class282_Sub50_Sub17 aClass282_Sub50_Sub17_10517;
	static int[] anIntArray10518;
	Class200 aClass200_10519;
	byte aByte10520;
	byte aByte10521;
	static int[] anIntArray10522 = { 1, 2, 4, 8 };
	boolean aBool10523;
	boolean aBool10524;
	boolean aBool10525;
	static int anInt10526;
	static Class194 aClass194_10527;

	@Override
	public void method88(GraphicalRenderer class505, int i) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((this.aClass282_Sub50_Sub17_10517 == null) && this.aBool10516) {
			Class452 class452 = method16101(class505, 262144, true, -306749899);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = this.aClass282_Sub50_Sub17_10517;
			this.aClass282_Sub50_Sub17_10517 = null;
		}
		Vector3 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17) {
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.x, (int) class385.z, null, (byte) -17);
		}
	}

	@Override
	boolean method12986(int i) {
		if (this.aClass528_10513 != null) {
			return !this.aClass528_10513.u();
		}
		return true;
	}

	Class452 method16101(GraphicalRenderer class505, int i, boolean bool, int i_0_) {
		ObjectDefinitions class478 = (this.aClass474_10515.getObjectDefinitions(-585553417 * this.anInt10514, 65280));
		Class390 class390;
		Class390 class390_1_;
		if (this.aBool10525) {
			class390 = aClass206_7970.aClass390Array2614[aByte7968];
			class390_1_ = aClass206_7970.aClass390Array2607[0];
		} else {
			class390 = aClass206_7970.aClass390Array2607[aByte7968];
			if (aByte7968 < 3) {
				class390_1_ = aClass206_7970.aClass390Array2607[aByte7968 + 1];
			} else {
				class390_1_ = null;
			}
		}
		Vector3 class385 = method11166().aClass385_3595;
		return class478.method8010(class505, i, this.aByte10521, this.aByte10520, class390, class390_1_, (int) class385.x, (int) class385.y, (int) class385.z, bool, null, 1259203877);
	}

	@Override
	public void method83(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((null == this.aClass282_Sub50_Sub17_10517) && this.aBool10516) {
			Class452 class452 = method16101(class505, 262144, true, -235872372);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = this.aClass282_Sub50_Sub17_10517;
			this.aClass282_Sub50_Sub17_10517 = null;
		}
		Vector3 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null) {
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.x, (int) class385.z, null, (byte) -128);
		}
	}

	MeshRasterizer method16102(GraphicalRenderer class505, int i, int i_2_) {
		if (this.aClass528_10513 != null && class505.method8452(this.aClass528_10513.m(), i) == 0) {
			return this.aClass528_10513;
		}
		Class452 class452 = method16101(class505, i, false, 1433556866);
		if (class452 != null) {
			return (MeshRasterizer) class452.anObject5443;
		}
		return null;
	}

	@Override
	Class285 method12989(GraphicalRenderer class505) {
		if (this.aClass528_10513 == null) {
			return null;
		}
		Matrix44Var class294 = method11168();
		Class285 class285 = Class470.method7824(this.aBool10523, (byte) -98);
		this.aClass528_10513.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	@Override
	public Class200 method12992(GraphicalRenderer class505, byte i) {
		Vector3 class385 = method11166().aClass385_3595;
		if (this.aClass200_10519 == null) {
			this.aClass200_10519 = Class275_Sub2.method12505((int) class385.x, (int) class385.y, (int) class385.z, method16102(class505, 0, 2053058474), (byte) 82);
		}
		return this.aClass200_10519;
	}

	@Override
	public void method85(byte i) {
		if (null != this.aClass528_10513) {
			if (i == 1) {
				this.aClass528_10513.method11259();
			}
		}
	}

	@Override
	void method12991(GraphicalRenderer class505, int i) {
		/* empty */
	}

	@Override
	void method13016(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_3_, int i_4_, boolean bool) {
		if (class521_sub1 instanceof Class521_Sub1_Sub5_Sub1) {
			Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_5_ = (Class521_Sub1_Sub5_Sub1) class521_sub1;
			if (null != this.aClass528_10513 && (class521_sub1_sub5_sub1_5_.aClass528_10513) != null) {
				this.aClass528_10513.method11269((class521_sub1_sub5_sub1_5_.aClass528_10513), i, i_3_, i_4_, bool);
			}
		} else if (class521_sub1 instanceof Class521_Sub1_Sub1_Sub6) {
			Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (Class521_Sub1_Sub1_Sub6) class521_sub1;
			if (this.aClass528_10513 != null && (class521_sub1_sub1_sub6.aClass528_10535) != null) {
				this.aClass528_10513.method11269((class521_sub1_sub1_sub6.aClass528_10535), i, i_3_, i_4_, bool);
			}
		}
	}

	@Override
	boolean method12985(int i) {
		return this.aBool10524;
	}

	@Override
	public void method93(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((null == this.aClass282_Sub50_Sub17_10517) && this.aBool10516) {
			Class452 class452 = method16101(class505, 262144, true, 1179408975);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = this.aClass282_Sub50_Sub17_10517;
			this.aClass282_Sub50_Sub17_10517 = null;
		}
		Vector3 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null) {
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.x, (int) class385.z, null, (byte) -90);
		}
	}

	@Override
	void method12984(int i) {
		this.aBool10524 = false;
		if (this.aClass528_10513 != null) {
			this.aClass528_10513.KA(this.aClass528_10513.m() & ~0x10000);
		}
	}

	@Override
	public int getId(int i) {
		return this.anInt10514 * -585553417;
	}

	@Override
	public int method89(int i) {
		return this.aByte10521;
	}

	@Override
	public int method92(int i) {
		return this.aByte10520;
	}

	@Override
	public int method13006() {
		return (this.aClass528_10513 != null ? this.aClass528_10513.YA() : 0);
	}

	@Override
	public boolean method86(int i) {
		return this.aBool10516;
	}

	@Override
	public void method87(GraphicalRenderer class505, int i) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((null == this.aClass282_Sub50_Sub17_10517) && this.aBool10516) {
			Class452 class452 = method16101(class505, 262144, true, 1228305596);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (class452 != null ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = this.aClass282_Sub50_Sub17_10517;
			this.aClass282_Sub50_Sub17_10517 = null;
		}
		Vector3 class385 = method11166().aClass385_3595;
		if (class282_sub50_sub17 != null) {
			aClass206_7970.method3426(class282_sub50_sub17, aByte7968, (int) class385.x, (int) class385.z, null, (byte) -39);
		}
	}

	@Override
	boolean method12999() {
		if (this.aClass528_10513 != null) {
			return !this.aClass528_10513.u();
		}
		return true;
	}

	static {
		anIntArray10518 = new int[] { 16, 32, 64, 128 };
	}

	@Override
	public int method76() {
		return this.anInt10514 * -585553417;
	}

	@Override
	public int method39() {
		return this.anInt10514 * -585553417;
	}

	@Override
	public int method73() {
		return this.aByte10521;
	}

	@Override
	public int method77() {
		return this.aByte10521;
	}

	@Override
	void method13023(GraphicalRenderer class505) {
		/* empty */
	}

	@Override
	public void method38() {
		if (null != this.aClass528_10513) {
			this.aClass528_10513.method11259();
		}
	}

	@Override
	public void method96() {
		if (null != this.aClass528_10513) {
			this.aClass528_10513.method11259();
		}
	}

	@Override
	public void method90() {
		if (null != this.aClass528_10513) {
			this.aClass528_10513.method11259();
		}
	}

	@Override
	public boolean method94() {
		return this.aBool10516;
	}

	@Override
	public boolean method95() {
		return this.aBool10516;
	}

	@Override
	boolean method13000() {
		if (this.aClass528_10513 != null) {
			return this.aClass528_10513.i();
		}
		return false;
	}

	@Override
	public int method91() {
		return this.aByte10520;
	}

	@Override
	public void method97(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((this.aClass282_Sub50_Sub17_10517 == null) && this.aBool10516) {
			Class452 class452 = method16101(class505, 262144, true, -1296082997);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = this.aClass282_Sub50_Sub17_10517;
			this.aClass282_Sub50_Sub17_10517 = null;
		}
		Vector3 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17) {
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.x, (int) class385.z, null, (byte) 23);
		}
	}

	@Override
	public void method98(GraphicalRenderer class505) {
		Object object = null;
		Class282_Sub50_Sub17 class282_sub50_sub17;
		if ((this.aClass282_Sub50_Sub17_10517 == null) && this.aBool10516) {
			Class452 class452 = method16101(class505, 262144, true, -195320342);
			class282_sub50_sub17 = (Class282_Sub50_Sub17) (null != class452 ? class452.anObject5444 : null);
		} else {
			class282_sub50_sub17 = this.aClass282_Sub50_Sub17_10517;
			this.aClass282_Sub50_Sub17_10517 = null;
		}
		Vector3 class385 = method11166().aClass385_3595;
		if (null != class282_sub50_sub17) {
			aClass206_7970.method3427(class282_sub50_sub17, aByte7968, (int) class385.x, (int) class385.z, null, (byte) 45);
		}
	}

	public Class521_Sub1_Sub5_Sub1(SceneObjectManager class206, GraphicalRenderer class505, ObjectIndexLoader class474, ObjectDefinitions class478, int i, int i_6_, int i_7_, int i_8_, int i_9_, boolean bool, int i_10_, int i_11_, boolean bool_12_) {
		super(class206, i_7_, i_8_, i_9_, i, i_6_, Class235.method3967(i_10_, i_11_, -1066763061));
		this.aClass474_10515 = class474;
		this.anInt10514 = 1742474857 * class478.id;
		this.aBool10525 = bool;
		this.aByte10521 = (byte) i_10_;
		this.aByte10520 = (byte) i_11_;
		this.aBool10523 = 0 != class478.anInt5652 * -348507379 && !bool;
		this.aBool10524 = bool_12_;
		this.aBool10516 = (class505.method8402() && class478.aBool5703 && !this.aBool10525 && Class393.aClass282_Sub54_4783.aClass468_Sub2_8205.method12624((byte) -75) != 0);
		int i_13_ = 2048;
		if (this.aBool10524) {
			i_13_ |= 0x10000;
		}
		if (class478.aBool5711) {
			i_13_ |= 0x80000;
		}
		Class452 class452 = method16101(class505, i_13_, this.aBool10516, -1805031480);
		if (class452 != null) {
			this.aClass528_10513 = (MeshRasterizer) class452.anObject5443;
			this.aClass282_Sub50_Sub17_10517 = (Class282_Sub50_Sub17) class452.anObject5444;
			if (this.aBool10524 || class478.aBool5711) {
				this.aClass528_10513 = this.aClass528_10513.method11289((byte) 0, i_13_, false);
				if (class478.aBool5711) {
					Class341 class341 = IndexLoaders.MAP_REGION_DECODER.method4426(475600426);
					this.aClass528_10513.PA(1367691291 * class341.anInt3992, 1646020803 * class341.anInt3993, class341.anInt3994 * 945117807, 2100466695 * class341.anInt3995);
				}
			}
		}
		method13008(1, (byte) -117);
	}

	@Override
	Class285 method12990(GraphicalRenderer class505, int i) {
		if (this.aClass528_10513 == null) {
			return null;
		}
		Matrix44Var class294 = method11168();
		Class285 class285 = Class470.method7824(this.aBool10523, (byte) -74);
		this.aClass528_10513.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	@Override
	boolean method13001() {
		if (this.aClass528_10513 != null) {
			return this.aClass528_10513.i();
		}
		return false;
	}

	MeshRasterizer method16103(GraphicalRenderer class505, int i) {
		if (this.aClass528_10513 != null && class505.method8452(this.aClass528_10513.m(), i) == 0) {
			return this.aClass528_10513;
		}
		Class452 class452 = method16101(class505, i, false, 1976323697);
		if (class452 != null) {
			return (MeshRasterizer) class452.anObject5443;
		}
		return null;
	}

	@Override
	boolean method13002() {
		if (this.aClass528_10513 != null) {
			return this.aClass528_10513.i();
		}
		return false;
	}

	@Override
	public int method13017() {
		return (this.aClass528_10513 != null ? this.aClass528_10513.YA() : 0);
	}

	@Override
	public int method13005() {
		return (this.aClass528_10513 != null ? this.aClass528_10513.YA() : 0);
	}

	@Override
	void method13013(GraphicalRenderer class505, Class521_Sub1 class521_sub1, int i, int i_14_, int i_15_, boolean bool, int i_16_) {
		if (class521_sub1 instanceof Class521_Sub1_Sub5_Sub1) {
			Class521_Sub1_Sub5_Sub1 class521_sub1_sub5_sub1_17_ = (Class521_Sub1_Sub5_Sub1) class521_sub1;
			if (null != this.aClass528_10513 && (class521_sub1_sub5_sub1_17_.aClass528_10513) != null) {
				this.aClass528_10513.method11269((class521_sub1_sub5_sub1_17_.aClass528_10513), i, i_14_, i_15_, bool);
			}
		} else if (class521_sub1 instanceof Class521_Sub1_Sub1_Sub6) {
			Class521_Sub1_Sub1_Sub6 class521_sub1_sub1_sub6 = (Class521_Sub1_Sub1_Sub6) class521_sub1;
			if (this.aClass528_10513 != null && (class521_sub1_sub1_sub6.aClass528_10535) != null) {
				this.aClass528_10513.method11269((class521_sub1_sub1_sub6.aClass528_10535), i, i_14_, i_15_, bool);
			}
		}
	}

	@Override
	Class285 method13009(GraphicalRenderer class505) {
		if (this.aClass528_10513 == null) {
			return null;
		}
		Matrix44Var class294 = method11168();
		Class285 class285 = Class470.method7824(this.aBool10523, (byte) -12);
		this.aClass528_10513.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	@Override
	Class285 method13010(GraphicalRenderer class505) {
		if (this.aClass528_10513 == null) {
			return null;
		}
		Matrix44Var class294 = method11168();
		Class285 class285 = Class470.method7824(this.aBool10523, (byte) -7);
		this.aClass528_10513.method11282(class294, aClass275_Sub5Array7965[0], 0);
		return class285;
	}

	@Override
	public int method13003() {
		return (this.aClass528_10513 != null ? this.aClass528_10513.YA() : 0);
	}

	@Override
	void method13012(GraphicalRenderer class505) {
		/* empty */
	}

	Class452 method16104(GraphicalRenderer class505, int i, boolean bool) {
		ObjectDefinitions class478 = (this.aClass474_10515.getObjectDefinitions(-585553417 * this.anInt10514, 65280));
		Class390 class390;
		Class390 class390_18_;
		if (this.aBool10525) {
			class390 = aClass206_7970.aClass390Array2614[aByte7968];
			class390_18_ = aClass206_7970.aClass390Array2607[0];
		} else {
			class390 = aClass206_7970.aClass390Array2607[aByte7968];
			if (aByte7968 < 3) {
				class390_18_ = aClass206_7970.aClass390Array2607[aByte7968 + 1];
			} else {
				class390_18_ = null;
			}
		}
		Vector3 class385 = method11166().aClass385_3595;
		return class478.method8010(class505, i, this.aByte10521, this.aByte10520, class390, class390_18_, (int) class385.x, (int) class385.y, (int) class385.z, bool, null, -344511963);
	}

	@Override
	boolean method13026() {
		return this.aBool10524;
	}

	@Override
	boolean method13011() {
		return this.aBool10524;
	}

	static int method16105(int i, int i_19_) {
		if (1109376893 * SceneObjectType.WALL_DIAGONAL_CORNER.type == i || SceneObjectType.WALL_STRAIGHT_CORNER.type * 1109376893 == i) {
			return anIntArray10518[i_19_ & 0x3];
		}
		return anIntArray10522[i_19_ & 0x3];
	}

	@Override
	public Class200 method13019(GraphicalRenderer class505) {
		Vector3 class385 = method11166().aClass385_3595;
		if (this.aClass200_10519 == null) {
			this.aClass200_10519 = Class275_Sub2.method12505((int) class385.x, (int) class385.y, (int) class385.z, method16102(class505, 0, 1598187689), (byte) -54);
		}
		return this.aClass200_10519;
	}

	@Override
	public Class200 method13018(GraphicalRenderer class505) {
		Vector3 class385 = method11166().aClass385_3595;
		if (this.aClass200_10519 == null) {
			this.aClass200_10519 = Class275_Sub2.method12505((int) class385.x, (int) class385.y, (int) class385.z, method16102(class505, 0, -6951740), (byte) -23);
		}
		return this.aClass200_10519;
	}

	@Override
	public Class200 method12993(GraphicalRenderer class505) {
		Vector3 class385 = method11166().aClass385_3595;
		if (this.aClass200_10519 == null) {
			this.aClass200_10519 = Class275_Sub2.method12505((int) class385.x, (int) class385.y, (int) class385.z, method16102(class505, 0, 1171214573), (byte) -10);
		}
		return this.aClass200_10519;
	}

	@Override
	boolean method13020(GraphicalRenderer class505, int i, int i_20_) {
		MeshRasterizer class528 = method16102(class505, 131072, 67761408);
		if (null != class528) {
			Matrix44Var class294 = method11168();
			return class528.method11270(i, i_20_, class294, false, 0);
		}
		return false;
	}

	@Override
	void method13021() {
		this.aBool10524 = false;
		if (this.aClass528_10513 != null) {
			this.aClass528_10513.KA(this.aClass528_10513.m() & ~0x10000);
		}
	}

	@Override
	boolean method12987(int i) {
		if (this.aClass528_10513 != null) {
			return this.aClass528_10513.i();
		}
		return false;
	}

	@Override
	public int method12995(int i) {
		return (this.aClass528_10513 != null ? this.aClass528_10513.YA() : 0);
	}

	@Override
	void method13015() {
		this.aBool10524 = false;
		if (this.aClass528_10513 != null) {
			this.aClass528_10513.KA(this.aClass528_10513.m() & ~0x10000);
		}
	}

	MeshRasterizer method16106(GraphicalRenderer class505, int i) {
		if (this.aClass528_10513 != null && class505.method8452(this.aClass528_10513.m(), i) == 0) {
			return this.aClass528_10513;
		}
		Class452 class452 = method16101(class505, i, false, -1080908587);
		if (class452 != null) {
			return (MeshRasterizer) class452.anObject5443;
		}
		return null;
	}

	@Override
	boolean method12983(GraphicalRenderer class505, int i, int i_21_, int i_22_) {
		MeshRasterizer class528 = method16102(class505, 131072, 1136432980);
		if (null != class528) {
			Matrix44Var class294 = method11168();
			return class528.method11270(i, i_21_, class294, false, 0);
		}
		return false;
	}

	static void handleAccountCreationStart(int i) {
		if (null != Class192.ACCOUNT_CREATION_STAGE) {
			try {
				int i_23_;
				if (0 == 1539502519 * Class14.anInt134) {
					i_23_ = 250;
				} else {
					i_23_ = 2000;
				}
				Class14.anInt133 += -1066537219;
				if (-623501739 * Class14.anInt133 > i_23_) {
					Class5.method297(2057502740);
				}
				if (Class192.ACCOUNT_CREATION_STAGE == Class1.REQUEST) {
					client.aClass184_7218.method3050(Class38.method852(Class448.aClass450_5424.method7494((byte) 121), 15000, 1038176780), Class448.aClass450_5424.aString5433, (byte) -47);
					client.aClass184_7218.method3054((short) 8665);
					TCPMessage message = Class207.method3558((byte) 87);
					message.buffer.writeByte(1627920319 * OutgoingLoginPacket.CREATE_ACCOUNT_CONNECT.id);
					message.buffer.writeShort(0, 1417031095);
					int i_24_ = -1990677291 * (message.buffer.index);
					message.buffer.writeShort(727, 1417031095);
					message.buffer.writeShort(1, 1417031095);
					Class14.LOGIN_XTEAS = Class463.method7725(message, (byte) -61);
					int i_25_ = (message.buffer.index * -1990677291);
					message.buffer.writeString(client.aString7164);
					message.buffer.writeShort(-1543197399 * client.anInt7149, 1417031095);
					message.buffer.writeLong(-8972807970865466165L * client.aLong7153);
					message.buffer.writeString(Class464.aString5555);
					message.buffer.writeByte(Class223.CURRENT_LANGUAGE.method243((byte) 1));
					message.buffer.writeByte(client.CURRENT_GAME.anInt5746 * 1648080491);
					Class31.method809(message.buffer, -1671456029);
					String string = client.aString7156;
					message.buffer.writeByte(string == null ? 0 : 1);
					if (string != null) {
						message.buffer.writeString(string);
					}
					Class11.SYSTEM_INFO.writeMachineInformation(message.buffer, 419814551);
					message.buffer.index += 781596523;
					message.buffer.encryptWithXtea(Class14.LOGIN_XTEAS, i_25_, (message.buffer.index * -1990677291), 1645773158);
					message.buffer.method13281((-1990677291 * (message.buffer.index) - i_24_), 1201423895);
					client.aClass184_7218.method3049(message, -1007484142);
					client.aClass184_7218.method3047(557990439);
					Class192.ACCOUNT_CREATION_STAGE = Class1.RESPONSE;
				}
				if (Class1.RESPONSE == Class192.ACCOUNT_CREATION_STAGE) {
					if (client.aClass184_7218.method3053((byte) -48) == null) {
						Class5.method297(2055895853);
					} else if (client.aClass184_7218.method3053((byte) -55).method3315(1, (byte) 85)) {
						client.aClass184_7218.method3053((byte) -73).method3327((client.aClass184_7218.recievedBuffer.buffer), 0, 1, -1181691571);
						Class96_Sub9.RECIEVED_RESPONSE = ((AccountCreationResponseOpcodes) Class386.method6672(Interface.method1626(1186080710), (client.aClass184_7218.recievedBuffer.buffer[0]) & 0xff, -865772612));
						if (AccountCreationResponseOpcodes.CONTINUE == Class96_Sub9.RECIEVED_RESPONSE) {
							client.aClass184_7218.isaac = new IsaacCipher(Class14.LOGIN_XTEAS);
							int[] is = new int[4];
							for (int i_26_ = 0; i_26_ < 4; i_26_++) {
								is[i_26_] = Class14.LOGIN_XTEAS[i_26_] + 50;
							}
							client.aClass184_7218.aClass432_2295 = new IsaacCipher(is);
							client.aClass184_7218.recievedBuffer.setIsaacCipher((client.aClass184_7218.aClass432_2295), 1577326429);
							Class365.setGameState(3, 801938860);
							client.aClass184_7218.method3054((short) -8634);
							client.aClass184_7218.recievedBuffer.index = 0;
							client.aClass184_7218.aClass375_2278 = null;
							client.aClass184_7218.aClass375_2296 = null;
							client.aClass184_7218.aClass375_2291 = null;
							client.aClass184_7218.anInt2289 = 0;
						} else {
							client.aClass184_7218.method3051((byte) -45);
						}
						client.aClass184_7218.aClass375_2286 = null;
						Class192.ACCOUNT_CREATION_STAGE = null;
					}
				}
			} catch (IOException ioexception) {
				Class5.method297(1992210840);
			}
		}
	}
}
