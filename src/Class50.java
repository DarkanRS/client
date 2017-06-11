/* Class50 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class50 {
	static BigInteger aBigInteger500 = new BigInteger("10001", 16);
	public static BigInteger aBigInteger501;
	public static BigInteger aBigInteger502;
	static BigInteger aBigInteger503 =

	Loader.usingRS ? (new BigInteger("ac548ab1174bf4dc38ff9a47be125012b9dd859bb4a5a7e9b1b655f16697740410813e98a46091042f3bc873ddb3e38e7e9432b5466b21a7feec65f0eee0a147", 16)) : (new BigInteger(
			"102876637271116124732338500663639643113504464789339249490399312659674772039314875904176809267475033772367707882873773291786014475222178654932442254125731622781524413208523465520758537060408541610254619166907142593731337618490879831401461945679478046811438574041131738117063340726565226753787565780501845348613"));;

	Class50() throws Throwable {
		throw new Error();
	}

	static {
		aBigInteger502 = new BigInteger("10001", 16);
		aBigInteger501 = Loader.usingRS ?

		(new BigInteger(
				"9246d9c7c5037426c7dd3e91f727ac10ca4e0c5c60760ff20201c9ff6d3f6a5e25c352b59e13364497e01c182d5e2a2cfacd63871a52d56d0c9aa5e9916d31d87ba3cd88fa0b83b44fb26ce0fe5460c2f1b2b44d433d297047e6432c84864f89a8b83d43402cac854ec0436356d54c994d63306086159fa65b319e307aef815162443137f80c2876049a95549fdf7edb0c2ad75b39586c12c1b3abd06d9652addae6021c2fce9edd2db4fa6a2a6882931fba2817f1c9faebcf72701d917b105f5ff1708e3b5529279a20e54be7aad9faa3f8331ea3d5ee308c3882c35ecf069209d75d32340eb2a2bc6919e315c003df93ae2288f52a2e68bd981fe32c7c7bcc305cf44fd00a52e6bcaaaf791875156e94a494bb5e3628106d64600ea5f423aa1859a136cb0b3fa05260b616681e57030e9fb8fc4e139df5369874eb5518bcd8325dc4df05730be59b5939d30464507567a5c8cdbe6d1607fc0907d781be51a694cdd56acdb7dc62e930842d42e7fb0aef1a9b0f937cb1c3f8c8b1ad433353eb907e0dddd6b6a3269da319ba8899fb3dcd39011c205fbb9bed2335915a98ef9bb656420fc0dc2c18f90adc427f6a66a1f920c275b8ea027db03b874ccff7ff955b75c999ac232fc7ccfef3df6f34b1213a07bdd72add252966d5906d93ad70272b4e3277b31ddaecf0d750a53e17dcfc1490133ee03107870d6bfd2e63cf99fb",
				16))
				: (new BigInteger("119555331260995530494627322191654816613155476612603817103079689925995402263457895890829148093414135342420807287820032417458428763496565605970163936696811485500553506743979521465489801746973392901885588777462023165252483988431877411021816445058706597607453280166045122971960003629860919338852061972113876035333"));

		new BigInteger("10001", 16);
		new BigInteger("bcbc4d92251300b3c4ade65fa1d315d66e370f300925dc949024628fa32b66d253fb8d2813c775c5c97d32a6bc8aeea94bbd3ae869330b2b4bcf7adc5aea89f5", 16);
	}

	public static IComponentDefinition getIComponentDefinitions(int parentHash, byte dummyValue) {
		try {
			int parentId = parentHash >> 16;
			//System.out.println("IComponentDefinitions: InterfaceID: "+ parentId);
			if (null == Class389.aClass119Array4165[parentId] || (Class389.aClass119Array4165[parentId].method1297(parentHash, (short) 3713) == null)) {
				boolean bool = Class378.method4671(parentId, null, -957339129);
				if (!bool)
					return null;
			}
			return Class389.aClass119Array4165[parentId].method1297(parentHash, (short) 19883);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.f(").append(')').toString());
		}
	}

	public static void method530(int i, int i_2_) {
		try {
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_2004, client.gameConnection.aClass449_330, (byte) 24);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(-1, -106491517);
			client.gameConnection.method390(class298_sub36, (byte) -71);
			Class298_Sub37_Sub10.aClass95_9602 = new Class95(Class374_Sub1.aClass243_7731, i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.ax(").append(')').toString());
		}
	}

	static final void method531(byte i) {
		try {
			Class388.anInt4157 -= -1866863069;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.f(").append(')').toString());
		}
	}

	static final void method532(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -1168328513 * client.anInt8837;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.abh(").append(')').toString());
		}
	}

	static void method533(long[] ls, int[] is, int i, int i_3_, int i_4_) {
		try {
			if (i < i_3_) {
				int i_5_ = (i + i_3_) / 2;
				int i_6_ = i;
				long l = ls[i_5_];
				ls[i_5_] = ls[i_3_];
				ls[i_3_] = l;
				int i_7_ = is[i_5_];
				is[i_5_] = is[i_3_];
				is[i_3_] = i_7_;
				int i_8_ = 9223372036854775807L == l ? 0 : 1;
				for (int i_9_ = i; i_9_ < i_3_; i_9_++) {
					if (ls[i_9_] < (long) (i_9_ & i_8_) + l) {
						long l_10_ = ls[i_9_];
						ls[i_9_] = ls[i_6_];
						ls[i_6_] = l_10_;
						int i_11_ = is[i_9_];
						is[i_9_] = is[i_6_];
						is[i_6_++] = i_11_;
					}
				}
				ls[i_3_] = ls[i_6_];
				ls[i_6_] = l;
				is[i_3_] = is[i_6_];
				is[i_6_] = i_7_;
				method533(ls, is, i, i_6_ - 1, 569685338);
				method533(ls, is, 1 + i_6_, i_3_, 765910015);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.d(").append(')').toString());
		}
	}

	static void method534(byte i) {
		try {
			Class121.anIntArray6321 = Class365_Sub1_Sub3_Sub2.method4513(2048, 35, 8, 8, 4, 0.4F, true, 33985);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.i(").append(')').toString());
		}
	}

	static final void method535(int i, byte i_12_) {
		try {
			int i_13_ = (client.anInt8884 * 443738891 - client.anInt8921 * -1656615113);
			if (i_13_ >= 100) {
				Class298_Sub1.anInt7164 = 1355934404;
				Class418.anInt5339 = -1001372047;
				Class100.anInt1081 = 178575833;
			} else {
				int i_14_ = (int) client.aFloat8757;
				if (client.anInt8764 * -523207831 >> 8 > i_14_)
					i_14_ = -523207831 * client.anInt8764 >> 8;
				if (client.aBooleanArray8684[4] && 128 + client.anIntArray8925[4] > i_14_)
					i_14_ = 128 + client.anIntArray8925[4];
				int i_15_ = ((int) client.aFloat8949 + -1419578297 * client.anInt8744 & 0x3fff);
				Class217 class217 = (Class287.myPlayer.method4337().aClass217_2599);
				Class482.method6121(1103750049 * Class75.anInt708, Class356.method4271((int) class217.aFloat2451, (int) class217.aFloat2454, 1855729883 * Class99.anInt952, -1800819540) - 200, 1346160791 * Class106.anInt1309, i_14_, i_15_, 600 + (i_14_ >> 3) * 3 << 2, i, -1059521295);
				float f = 1.0F - ((float) ((100 - i_13_) * ((100 - i_13_) * (100 - i_13_))) / 1000000.0F);
				Class367.anInt4000 = ((int) ((float) (Class301_Sub1.anInt7639 * -1806467999) + f * (float) (Class367.anInt4000 * -1740717447 - (-1806467999 * Class301_Sub1.anInt7639))) * 547882953);
				Class110.anInt6403 = (1078403147 * (int) ((float) (1449634147 * Class110.anInt6403 - 2032233737 * Class409.anInt5284) * f + (float) (Class409.anInt5284 * 2032233737)));
				Class146.anInt1575 = ((int) (f * (float) (Class146.anInt1575 * -299812095 - (1368015401 * Class82_Sub2.anInt6822)) + (float) (1368015401 * Class82_Sub2.anInt6822)) * 309839105);
				client.anInt8756 = ((int) ((float) (-104436553 * client.anInt8756 - Class21.anInt277 * 827399463) * f + (float) (Class21.anInt277 * 827399463)) * -648269561);
				int i_16_ = (Class135.anInt6384 * -1847894591 - -883946017 * Class298_Sub9.anInt7228);
				if (i_16_ > 8192)
					i_16_ -= 16384;
				else if (i_16_ < -8192)
					i_16_ += 16384;
				Class135.anInt6384 = ((int) ((float) i_16_ * f + (float) (Class298_Sub9.anInt7228 * -883946017)) * -1587695039);
				Class135.anInt6384 = -1587695039 * (-1847894591 * Class135.anInt6384 & 0x3fff);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.hz(").append(')').toString());
		}
	}

	static final void method536(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_17_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_18_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_19_ = (((ClientScript2) class403).anIntArray5244[2 + 681479919 * ((ClientScript2) class403).anInt5239]);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = ((ClientScript2) class403).aClass162_5252.method1752(i_17_, i_18_, i_19_, 1489690746);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.xr(").append(')').toString());
		}
	}

	static final void method537(ClientScript2 class403, byte i) {
		try {
			int i_20_ = ((((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]) >> 16);
			int i_21_ = ((((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]) & 0xffff);
			int i_22_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (i_22_ < 0 || i_22_ > 5000)
				throw new RuntimeException();
			((ClientScript2) class403).anIntArray5236[i_20_] = i_22_;
			int i_23_ = -1;
			if (105 == i_21_)
				i_23_ = 0;
			for (int i_24_ = 0; i_24_ < i_22_; i_24_++)
				((ClientScript2) class403).anIntArrayArray5238[i_20_][i_24_] = i_23_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.an(").append(')').toString());
		}
	}

	static final void method538(ClientScript2 class403, byte i) {
		try {
			Class390 class390 = (((ClientScript2) class403).aBoolean5261 ? ((ClientScript2) class403).aClass390_5247 : ((ClientScript2) class403).aClass390_5246);
			IComponentDefinition class105 = ((Class390) class390).aClass105_4168;
			Class119 class119 = ((Class390) class390).aClass119_4167;
			Class365_Sub1.method4401(class105, class119, class403, (byte) -16);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("c.ih(").append(')').toString());
		}
	}
}
