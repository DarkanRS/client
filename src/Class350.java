/* Class350 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.util.Iterator;

public class Class350 {
	public int[][] anIntArrayArray3710;
	public int anInt3711 = 512849763;
	public int[] anIntArray3712 = null;
	public int[] anIntArray3713 = null;
	int anInt3714 = 0;
	public int anInt3715 = -241536037;
	public int anInt3716;
	public int anInt3717;
	Matrix3f[] aClass222Array3718;
	public int anInt3719;
	public int anInt3720;
	public int anInt3721;
	public int anInt3722;
	public int anInt3723;
	public int anInt3724;
	Class349 aClass349_3725;
	public int anInt3726;
	public int anInt3727;
	public int anInt3728;
	public int anInt3729;
	public int anInt3730;
	public int anInt3731;
	public int[] anIntArray3732;
	public int anInt3733 = 1442268255;
	public int anInt3734;
	public int anInt3735;
	public int anInt3736;
	public int anInt3737;
	public int anInt3738;
	public int anInt3739;
	public int anInt3740;
	public int anInt3741;
	public int[] anIntArray3742;
	public int anInt3743;
	public int anInt3744;
	public int anInt3745;
	public int anInt3746;
	public int anInt3747;
	public int anInt3748;
	public int anInt3749;
	public int anInt3750;
	public int anInt3751;
	public int anInt3752;
	public int[][] anIntArrayArray3753;
	public int anInt3754;
	public int anInt3755;
	public boolean aBoolean3756;
	public static ClanChannel primaryChannel;
	static int anInt3758;
	public static String aString3759;

	void method4206(RsByteBuffer class298_sub53, int i, int i_0_) {
		try {
			if (1 == i) {
				anInt3711 = class298_sub53.readBigSmart(1235052657) * -512849763;
				anInt3717 = class298_sub53.readBigSmart(1235052657) * -1216995793;
			} else if (2 == i)
				anInt3755 = class298_sub53.readBigSmart(1235052657) * -1201368129;
			else if (i == 3)
				anInt3722 = class298_sub53.readBigSmart(1235052657) * 1316025001;
			else if (4 == i)
				anInt3727 = class298_sub53.readBigSmart(1235052657) * -1511636755;
			else if (5 == i)
				anInt3728 = class298_sub53.readBigSmart(1235052657) * 1034489103;
			else if (i == 6)
				anInt3721 = class298_sub53.readBigSmart(1235052657) * -1261244237;
			else if (i == 7)
				anInt3749 = class298_sub53.readBigSmart(1235052657) * -1711775317;
			else if (i == 8)
				anInt3746 = class298_sub53.readBigSmart(1235052657) * -1593946535;
			else if (9 == i)
				anInt3724 = class298_sub53.readBigSmart(1235052657) * 1566713043;
			else if (26 == i) {
				anInt3735 = (short) (class298_sub53.readUnsignedByte() * 4) * 1013056483;
				anInt3736 = (short) (class298_sub53.readUnsignedByte() * 4) * -1453025501;
			} else if (i == 27) {
				if (anIntArrayArray3710 == null)
					anIntArrayArray3710 = (new int[(((Class349) ((Class350) this).aClass349_3725).aClass405_3707.anIntArray5267).length][]);
				int i_1_ = class298_sub53.readUnsignedByte();
				anIntArrayArray3710[i_1_] = new int[6];
				for (int i_2_ = 0; i_2_ < 6; i_2_++)
					anIntArrayArray3710[i_1_][i_2_] = class298_sub53.readShort(2080193946);
			} else if (i == 28) {
				int i_3_ = class298_sub53.readUnsignedByte();
				anIntArray3732 = new int[i_3_];
				for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
					anIntArray3732[i_4_] = class298_sub53.readUnsignedByte();
					if (anIntArray3732[i_4_] == 255)
						anIntArray3732[i_4_] = -1;
				}
			} else if (i == 29)
				anInt3744 = class298_sub53.readUnsignedByte() * 115903875;
			else if (i == 30)
				anInt3745 = class298_sub53.readUnsignedShort() * 719028937;
			else if (31 == i)
				anInt3726 = class298_sub53.readUnsignedByte() * -369164975;
			else if (32 == i)
				anInt3747 = class298_sub53.readUnsignedShort() * 1012239243;
			else if (33 == i)
				anInt3748 = class298_sub53.readShort(1712856653) * 92325015;
			else if (34 == i)
				anInt3720 = class298_sub53.readUnsignedByte() * 477826083;
			else if (i == 35)
				anInt3750 = class298_sub53.readUnsignedShort() * -1803824059;
			else if (36 == i)
				anInt3751 = class298_sub53.readShort(1850319623) * 1175766897;
			else if (37 == i)
				anInt3752 = class298_sub53.readUnsignedByte() * 1083720273;
			else if (38 == i)
				anInt3715 = class298_sub53.readBigSmart(1235052657) * 241536037;
			else if (39 == i)
				anInt3733 = class298_sub53.readBigSmart(1235052657) * -1442268255;
			else if (i == 40)
				anInt3741 = class298_sub53.readBigSmart(1235052657) * 564296781;
			else if (i == 41)
				anInt3719 = class298_sub53.readBigSmart(1235052657) * -1440097851;
			else if (42 == i)
				anInt3723 = class298_sub53.readBigSmart(1235052657) * 1270333873;
			else if (i == 43)
				anInt3738 = class298_sub53.readBigSmart(1235052657) * 697230329;
			else if (44 == i)
				anInt3754 = class298_sub53.readBigSmart(1235052657) * -853635893;
			else if (i == 45)
				anInt3716 = class298_sub53.readUnsignedShort() * -928434405;
			else if (46 == i)
				anInt3729 = class298_sub53.readBigSmart(1235052657) * 537960313;
			else if (i == 47)
				anInt3743 = class298_sub53.readBigSmart(1235052657) * 1019547381;
			else if (48 == i)
				anInt3731 = class298_sub53.readBigSmart(1235052657) * -1402060193;
			else if (i == 49)
				anInt3739 = class298_sub53.readBigSmart(1235052657) * -549936551;
			else if (50 == i)
				anInt3737 = class298_sub53.readBigSmart(1235052657) * -71356649;
			else if (i == 51)
				anInt3730 = class298_sub53.readBigSmart(1235052657) * -1236000399;
			else if (52 == i) {
				int i_5_ = class298_sub53.readUnsignedByte();
				anIntArray3712 = new int[i_5_];
				anIntArray3713 = new int[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					anIntArray3712[i_6_] = class298_sub53.readBigSmart(1235052657);
					int i_7_ = class298_sub53.readUnsignedByte();
					anIntArray3713[i_6_] = i_7_;
					((Class350) this).anInt3714 += i_7_ * 81529747;
				}
			} else if (i == 53)
				aBoolean3756 = false;
			else if (i == 54) {
				anInt3734 = ((class298_sub53.readUnsignedByte() << 6) * 989376361);
				anInt3740 = ((class298_sub53.readUnsignedByte() << 6) * -1343302987);
			} else if (55 == i) {
				if (anIntArray3742 == null)
					anIntArray3742 = (new int[(((Class349) ((Class350) this).aClass349_3725).aClass405_3707.anIntArray5267).length]);
				int i_8_ = class298_sub53.readUnsignedByte();
				anIntArray3742[i_8_] = class298_sub53.readUnsignedShort();
			} else if (i == 56) {
				if (null == anIntArrayArray3753)
					anIntArrayArray3753 = (new int[(((Class349) ((Class350) this).aClass349_3725).aClass405_3707.anIntArray5267).length][]);
				int i_9_ = class298_sub53.readUnsignedByte();
				anIntArrayArray3753[i_9_] = new int[3];
				for (int i_10_ = 0; i_10_ < 3; i_10_++)
					anIntArrayArray3753[i_9_][i_10_] = class298_sub53.readShort(1788063911);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.f(").append(')').toString());
		}
	}

	public Matrix3f[] method4207(byte i) {
		try {
			if (((Class350) this).aClass222Array3718 != null)
				return ((Class350) this).aClass222Array3718;
			if (null == anIntArrayArray3710)
				return null;
			((Class350) this).aClass222Array3718 = new Matrix3f[anIntArrayArray3710.length];
			for (int i_11_ = 0; i_11_ < anIntArrayArray3710.length; i_11_++) {
				int i_12_ = 0;
				int i_13_ = 0;
				int i_14_ = 0;
				int i_15_ = 0;
				int i_16_ = 0;
				int i_17_ = 0;
				if (anIntArrayArray3710[i_11_] != null) {
					i_12_ = anIntArrayArray3710[i_11_][0];
					i_13_ = anIntArrayArray3710[i_11_][1];
					i_14_ = anIntArrayArray3710[i_11_][2];
					i_15_ = anIntArrayArray3710[i_11_][3] << 3;
					i_16_ = anIntArrayArray3710[i_11_][4] << 3;
					i_17_ = anIntArrayArray3710[i_11_][5] << 3;
				}
				if (i_12_ == 0 && 0 == i_13_ && 0 == i_14_ && 0 == i_15_ && 0 == i_16_ && i_17_ == 0) {
					if (i <= 12)
						throw new IllegalStateException();
				} else {
					Matrix3f class222 = (((Class350) this).aClass222Array3718[i_11_] = new Matrix3f());
					if (0 != i_17_)
						class222.method2071(0.0F, 0.0F, 1.0F, Class220.method2049(i_17_));
					if (0 != i_15_)
						class222.method2071(1.0F, 0.0F, 0.0F, Class220.method2049(i_15_));
					if (0 != i_16_)
						class222.method2071(0.0F, 1.0F, 0.0F, Class220.method2049(i_16_));
					class222.method2064((float) i_12_, (float) i_13_, (float) i_14_);
				}
			}
			return ((Class350) this).aClass222Array3718;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.i(").append(')').toString());
		}
	}

	Class350() {
		anInt3717 = 1216995793;
		anInt3741 = -564296781;
		anInt3719 = 1440097851;
		anInt3723 = -1270333873;
		anInt3721 = 1261244237;
		anInt3749 = 1711775317;
		anInt3746 = 1593946535;
		anInt3724 = -1566713043;
		anInt3755 = 1201368129;
		anInt3722 = -1316025001;
		anInt3727 = 1511636755;
		anInt3728 = -1034489103;
		anInt3729 = -537960313;
		anInt3743 = -1019547381;
		anInt3731 = 1402060193;
		anInt3739 = 549936551;
		anInt3737 = 71356649;
		anInt3730 = 1236000399;
		anInt3735 = 0;
		anInt3736 = 0;
		anInt3734 = 0;
		anInt3740 = 0;
		anInt3744 = 0;
		anInt3745 = 0;
		anInt3726 = 0;
		anInt3747 = 0;
		anInt3748 = 0;
		anInt3720 = 0;
		anInt3750 = 0;
		anInt3751 = 0;
		anInt3752 = -1083720273;
		anInt3738 = -697230329;
		anInt3754 = 853635893;
		anInt3716 = 928434405;
		aBoolean3756 = true;
	}

	public int method4208(int i) {
		try {
			if (anInt3711 * -809747019 != -1)
				return anInt3711 * -809747019;
			if (null != anIntArray3712) {
				int i_18_ = (int) (Math.random() * (double) (-5125477 * ((Class350) this).anInt3714));
				int i_19_;
				for (i_19_ = 0; i_18_ >= anIntArray3713[i_19_]; i_19_++)
					i_18_ -= anIntArray3713[i_19_];
				return anIntArray3712[i_19_];
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.b(").append(')').toString());
		}
	}

	public boolean method4209(int i, byte i_20_) {
		try {
			if (-1 == i)
				return false;
			if (i == -809747019 * anInt3711)
				return true;
			if (null != anIntArray3712) {
				for (int i_21_ = 0; i_21_ < anIntArray3712.length; i_21_++) {
					if (i == anIntArray3712[i_21_])
						return true;
				}
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.p(").append(')').toString());
		}
	}

	public int[] method4210(int i) {
		try {
			HashTable class437 = new HashTable(16);
			Class316.method3844(-809747019 * anInt3711, class437, -518506092);
			if (null != anIntArray3712) {
				int[] is = anIntArray3712;
				for (int i_22_ = 0; i_22_ < is.length; i_22_++) {
					int i_23_ = is[i_22_];
					Class316.method3844(i_23_, class437, -996745872);
				}
			}
			Class316.method3844(844607405 * anInt3715, class437, -1466126807);
			Class316.method3844(1061677153 * anInt3733, class437, -537938152);
			Class316.method3844(-129111857 * anInt3717, class437, -1080833419);
			Class316.method3844(anInt3741 * -277799803, class437, -1770644447);
			Class316.method3844(315374861 * anInt3719, class437, -1518977416);
			Class316.method3844(anInt3723 * -1532631215, class437, -674677793);
			Class316.method3844(230243963 * anInt3721, class437, -1811756409);
			Class316.method3844(491753731 * anInt3749, class437, -1070117202);
			Class316.method3844(-2054940183 * anInt3746, class437, -891093089);
			Class316.method3844(-783166629 * anInt3724, class437, -2016176230);
			Class316.method3844(anInt3755 * 328817727, class437, -1375066780);
			Class316.method3844(anInt3722 * -1238642279, class437, -1493937450);
			Class316.method3844(anInt3727 * -907666203, class437, -1237374124);
			Class316.method3844(124010991 * anInt3728, class437, -707153443);
			Class316.method3844(anInt3729 * 371497673, class437, -455707757);
			Class316.method3844(anInt3743 * -279532195, class437, -455027567);
			Class316.method3844(anInt3731 * 1885772191, class437, -507782637);
			Class316.method3844(anInt3739 * 914130409, class437, -997447340);
			Class316.method3844(anInt3737 * 250017959, class437, -1792088224);
			Class316.method3844(anInt3730 * -119373935, class437, -909523000);
			int[] is = new int[class437.method5814(1901508554)];
			int i_24_ = 0;
			Iterator iterator = class437.iterator();
			while (iterator.hasNext()) {
				Linkable class298 = (Linkable) iterator.next();
				is[i_24_++] = (int) (class298.linkedKey * 7051297995265073167L);
			}
			return is;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.k(").append(')').toString());
		}
	}

	void method4211(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_25_ = class298_sub53.readUnsignedByte();
				if (i_25_ == 0) {
					if (i != 162499609)
						throw new IllegalStateException();
					break;
				}
				method4206(class298_sub53, i_25_, -247907698);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.a(").append(')').toString());
		}
	}

	static final void method4212(ClientScript2 class403, short i) {
		try {
			int i_26_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anInt5241 -= 1938723502;
			String string = (String) (((ClientScript2) class403).anObjectArray5240[((ClientScript2) class403).anInt5241 * -203050393]);
			String string_27_ = ((String) (((ClientScript2) class403).anObjectArray5240[1 + ((ClientScript2) class403).anInt5241 * -203050393]));
			if (string.length() <= 500 && string_27_.length() <= 500)
				Class291.method2791(i_26_, string, string_27_, 600657777);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.aps(").append(')').toString());
		}
	}

	static final void method4213(ClientScript2 class403, int i) {
		try {
			Class242.anInt2709 = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.abp(").append(')').toString());
		}
	}

	public static Class336 method4214(int i, int i_28_, short i_29_) {
		try {
			Class315.aClass336_Sub6_3307.toX = i * -760677635;
			Class315.aClass336_Sub6_3307.toY = i_28_ * 167105303;
			Class315.aClass336_Sub6_3307.sizeX = -1544157451;
			Class315.aClass336_Sub6_3307.sizeY = -1468199503;
			return Class315.aClass336_Sub6_3307;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.a(").append(')').toString());
		}
	}

	public static int method4215(int i, int i_30_, float f, int i_31_) {
		try {
			return Class298_Sub32_Sub38.method3387(i, i_30_, (int) f, 1963059640);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.x(").append(')').toString());
		}
	}

	static final void method4216(ClientScript2 class403, int i) {
		try {
			Class422_Sub25.aClass298_Sub48_8425.method3540(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub23_7576, 0, -1906997591);
			Class3.method300(656179282);
			client.aBoolean8666 = false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.anv(").append(')').toString());
		}
	}

	static final void method4217(ClientScript2 class403, int i) {
		try {
			int i_32_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547.method5612(i_32_, 1352882135);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.aoc(").append(')').toString());
		}
	}

	static void method4218(int i) {
		try {
			if (Class8.anInt98 * 256666041 < 102)
				Class8.anInt98 += 879545142;
			if (-917301319 * Class8.anInt104 != -1 && (3224865510845692061L * Class146.aLong1576 < Class122.method1319((byte) 1))) {
				for (int i_33_ = Class8.anInt104 * -917301319; i_33_ < Class8.aStringArray109.length; i_33_++) {
					if (Class8.aStringArray109[i_33_].startsWith("pause")) {
						int i_34_ = 5;
						try {
							i_34_ = Integer.parseInt(Class8.aStringArray109[i_33_].substring(6));
						} catch (Exception exception) {
							/* empty */
						}
						Class255.method2435(new StringBuilder().append("Pausing for ").append(i_34_).append(" seconds...").toString(), 270683370);
						Class8.anInt104 = (i_33_ + 1) * -1428832631;
						Class146.aLong1576 = (Class122.method1319((byte) 1) + (long) (1000 * i_34_)) * 6717445677357895093L;
						return;
					}
					Class8.aString101 = Class8.aStringArray109[i_33_];
					Class142.method1568(false, 1496417723);
				}
				Class8.anInt104 = 1428832631;
			}
			if (0 != 1170859143 * client.anInt8682) {
				Class8.anInt103 -= client.anInt8682 * 1787831191;
				if (Class8.anInt103 * -1731316011 >= Class8.anInt102 * -2035787443)
					Class8.anInt103 = Class8.anInt102 * -1477098343 - 205738621;
				if (-1731316011 * Class8.anInt103 < 0)
					Class8.anInt103 = 0;
				client.anInt8682 = 0;
			}
			for (int i_35_ = 0; i_35_ < 1351936279 * client.anInt8894; i_35_++) {
				Interface16 interface16 = client.anInterface16Array8710[i_35_];
				int i_36_ = interface16.method218((byte) -29);
				char c = interface16.method217((byte) -110);
				int i_37_ = interface16.method220((byte) 0);
				if (84 == i_36_)
					Class142.method1568(false, 1496417723);
				if (i_36_ == 80)
					Class142.method1568(true, 1496417723);
				else if (i_36_ == 66 && 0 != (i_37_ & 0x4)) {
					if (Class365_Sub1_Sub5_Sub2.aClipboard9941 != null) {
						String string = "";
						for (int i_38_ = Class8.aStringArray107.length - 1; i_38_ >= 0; i_38_--) {
							if (Class8.aStringArray107[i_38_] != null && Class8.aStringArray107[i_38_].length() > 0)
								string = new StringBuilder().append(string).append(Class8.aStringArray107[i_38_]).append('\n').toString();
						}
						Class365_Sub1_Sub5_Sub2.aClipboard9941.setContents(new StringSelection(string), null);
					}
				} else if (67 == i_36_ && 0 != (i_37_ & 0x4)) {
					if (Class365_Sub1_Sub5_Sub2.aClipboard9941 != null) {
						try {
							Transferable transferable = Class365_Sub1_Sub5_Sub2.aClipboard9941.getContents(null);
							if (transferable != null) {
								String string = (String) (transferable.getTransferData(DataFlavor.stringFlavor));
								if (null != string) {
									String[] strings = (Class365_Sub1_Sub3_Sub1.method4508(string, '\n', 1017779885));
									Class55.method606(strings, 399274522);
								}
							}
						} catch (Exception exception) {
							/* empty */
						}
					}
				} else if (i_36_ == 85 && -1182747927 * Class8.anInt99 > 0) {
					Class8.aString101 = new StringBuilder().append(Class8.aString101.substring(0, ((-1182747927 * Class8.anInt99) - 1))).append(Class8.aString101.substring(Class8.anInt99 * -1182747927)).toString();
					Class8.anInt99 -= 1914783065;
				} else if (101 == i_36_ && (-1182747927 * Class8.anInt99 < Class8.aString101.length()))
					Class8.aString101 = new StringBuilder().append(Class8.aString101.substring(0, -1182747927 * Class8.anInt99)).append(Class8.aString101.substring(1 + (Class8.anInt99 * -1182747927))).toString();
				else if (i_36_ == 96 && Class8.anInt99 * -1182747927 > 0)
					Class8.anInt99 -= 1914783065;
				else if (i_36_ == 97 && (-1182747927 * Class8.anInt99 < Class8.aString101.length()))
					Class8.anInt99 += 1914783065;
				else if (102 == i_36_)
					Class8.anInt99 = 0;
				else if (103 == i_36_)
					Class8.anInt99 = Class8.aString101.length() * 1914783065;
				else if (104 == i_36_ && (-1217082313 * Class8.anInt105 < Class8.aStringArray107.length)) {
					Class8.anInt105 += -1305958009;
					Class55.method607(-214283222);
					Class8.anInt99 = Class8.aString101.length() * 1914783065;
				} else if (105 == i_36_ && -1217082313 * Class8.anInt105 > 0) {
					Class8.anInt105 -= -1305958009;
					Class55.method607(1763987987);
					Class8.anInt99 = Class8.aString101.length() * 1914783065;
				} else if (ObjectDefinitions.method5788(c, (short) 160) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
					Class8.aString101 = new StringBuilder().append(Class8.aString101.substring(0, -1182747927 * Class8.anInt99)).append(client.anInterface16Array8710[i_35_].method217((byte) 9)).append(Class8.aString101.substring(Class8.anInt99 * -1182747927)).toString();
					Class8.anInt99 += 1914783065;
				}
			}
			client.anInt8894 = 0;
			client.anInt8687 = 0;
			Class360.method4301(2005471811);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("op.u(").append(')').toString());
		}
	}
}
