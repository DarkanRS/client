/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class Class152 {
	Class453 aClass453_1587;
	long aLong1588 = -8735484037837793267L;
	static int anInt1589 = 1;
	static int anInt1590 = 3;
	static int anInt1591 = 2;
	long aLong1592;
	static int anInt1593 = 4;
	static Class4 aClass4_1594;

	void method1650(RsByteBuffer class298_sub53, byte i) {
		try {
			((Class152) this).aLong1592 = (class298_sub53.readLong((short) 9142) * 1517159550238851441L);
			((Class152) this).aLong1588 = (class298_sub53.readLong((short) 28083) * 8735484037837793267L);
			for (int i_0_ = class298_sub53.readUnsignedByte(); i_0_ != 0; i_0_ = class298_sub53.readUnsignedByte()) {
				Class298_Sub17 class298_sub17;
				if (1 == i_0_)
					class298_sub17 = new Class298_Sub17_Sub1(this);
				else if (i_0_ == 4)
					class298_sub17 = new Class298_Sub17_Sub4(this);
				else if (3 == i_0_)
					class298_sub17 = new Class298_Sub17_Sub3(this);
				else if (i_0_ == 2)
					class298_sub17 = new Class298_Sub17_Sub2(this);
				else
					throw new RuntimeException("");
				class298_sub17.method2917(class298_sub53, 1753656698);
				((Class152) this).aClass453_1587.method5935(class298_sub17, 120722253);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ge.a(").append(')').toString());
		}
	}

	public void method1651(ClanChannel class298_sub25, byte i) {
		try {
			if ((-6615773310558494831L * ((Class152) this).aLong1592 != class298_sub25.linkedKey * 7051297995265073167L) || (-3106107963843196613L * ((Class152) this).aLong1588 != (((ClanChannel) class298_sub25).aLong7361 * -3244420319926665157L)))
				throw new RuntimeException("");
			for (Class298_Sub17 class298_sub17 = (Class298_Sub17) ((Class152) this).aClass453_1587.method5939(1766612795); class298_sub17 != null; class298_sub17 = ((Class298_Sub17) ((Class152) this).aClass453_1587.method5944(49146)))
				class298_sub17.method2918(class298_sub25, -2022437727);
			((ClanChannel) class298_sub25).aLong7361 += 8816161044679006451L;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ge.f(").append(')').toString());
		}
	}

	public Class152(RsByteBuffer class298_sub53) {
		((Class152) this).aClass453_1587 = new Class453();
		method1650(class298_sub53, (byte) 2);
	}

	public static void method1652(GraphicsToolkit class_ra, long l) {
		try {
			Class344.anInt3677 = 1740005197 * Class344.anInt3682;
			Class344.anInt3682 = 0;
			Class122.method1319((byte) 1);
			Iterator iterator = Class344.aList3683.iterator();
			while (iterator.hasNext()) {
				Class351 class351 = (Class351) iterator.next();
				boolean bool = class351.method4222(class_ra, l);
				if (!bool) {
					iterator.remove();
					Class344.aClass351Array3679[(Class344.anInt3681 * -1264407527)] = class351;
					Class344.anInt3681 = 2027155497 * (Class344.anInt3681 * -1264407527 + 1 & (Class65.anIntArray658[Class344.anInt3675 * 1197525581]));
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ge.f(").append(')').toString());
		}
	}

	static final void method1653(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -2067054685 * Class52_Sub2.anInt6815;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ge.amo(").append(')').toString());
		}
	}

	public static byte[] method1654(byte[] is, int i, int i_1_, byte i_2_) {
		try {
			byte[] is_3_;
			if (i > 0) {
				is_3_ = new byte[i_1_];
				for (int i_4_ = 0; i_4_ < i_1_; i_4_++)
					is_3_[i_4_] = is[i + i_4_];
			} else
				is_3_ = is;
			Class455 class455 = new Class455();
			class455.method5953(-1537662698);
			class455.method5954(is_3_, (long) (8 * i_1_));
			byte[] is_5_ = new byte[64];
			class455.method5955(is_5_, 0, -1569457483);
			return is_5_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ge.i(").append(')').toString());
		}
	}

	static void method1655(Class302_Sub5 class302_sub5, int i) {
		try {
			((Class302_Sub5) class302_sub5).aClass365_Sub1_Sub1_Sub2_7660 = null;
			if (1585762285 * Class302_Sub5.anInt7662 < 20) {
				Class302_Sub5.aClass442_7661.method5870(class302_sub5, -104859728);
				Class302_Sub5.anInt7662 += 1704977893;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ge.p(").append(')').toString());
		}
	}

	static final void method1656(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub29_7583.method5726(-2143087996);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ge.akl(").append(')').toString());
		}
	}
}
