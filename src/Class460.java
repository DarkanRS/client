/* Class460 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URL;
import java.util.Iterator;

public class Class460 implements Iterator {
	HashTable aClass437_5675;
	Linkable aClass298_5676;
	int anInt5677;
	Linkable aClass298_5678 = null;

	public boolean hasNext() {
		try {
			if ((((HashTable) ((Class460) this).aClass437_5675).buckets[1772241843 * ((Class460) this).anInt5677 - 1]) != ((Class460) this).aClass298_5676)
				return true;
			while (((Class460) this).anInt5677 * 1772241843 < 577108745 * (((HashTable) ((Class460) this).aClass437_5675).size)) {
				if ((((HashTable) ((Class460) this).aClass437_5675).buckets[((((Class460) this).anInt5677 += -317185157) * 1772241843 - 1)].next) != (((HashTable) ((Class460) this).aClass437_5675).buckets[((Class460) this).anInt5677 * 1772241843 - 1])) {
					((Class460) this).aClass298_5676 = (((HashTable) ((Class460) this).aClass437_5675).buckets[((Class460) this).anInt5677 * 1772241843 - 1].next);
					return true;
				}
				((Class460) this).aClass298_5676 = (((HashTable) ((Class460) this).aClass437_5675).buckets[1772241843 * ((Class460) this).anInt5677 - 1]);
			}
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sy.hasNext(").append(')').toString());
		}
	}

	void method5978(int i) {
		try {
			((Class460) this).aClass298_5676 = (((HashTable) ((Class460) this).aClass437_5675).buckets[0].next);
			((Class460) this).anInt5677 = -317185157;
			((Class460) this).aClass298_5678 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sy.d(").append(')').toString());
		}
	}

	public Class460(HashTable class437) {
		((Class460) this).aClass437_5675 = class437;
		method5978(-751580615);
	}

	public void remove() {
		try {
			if (((Class460) this).aClass298_5678 == null)
				throw new IllegalStateException();
			((Class460) this).aClass298_5678.unlink(-1460969981);
			((Class460) this).aClass298_5678 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sy.remove(").append(')').toString());
		}
	}

	public Object next() {
		try {
			if ((((HashTable) ((Class460) this).aClass437_5675).buckets[((Class460) this).anInt5677 * 1772241843 - 1]) != ((Class460) this).aClass298_5676) {
				Linkable class298 = ((Class460) this).aClass298_5676;
				((Class460) this).aClass298_5676 = class298.next;
				((Class460) this).aClass298_5678 = class298;
				return class298;
			}
			while_106_: do {
				Linkable class298;
				do {
					if (((Class460) this).anInt5677 * 1772241843 >= (577108745 * (((HashTable) ((Class460) this).aClass437_5675).size)))
						break while_106_;
					class298 = (((HashTable) ((Class460) this).aClass437_5675).buckets[((((Class460) this).anInt5677 += -317185157) * 1772241843) - 1].next);
				} while (class298 == (((HashTable) ((Class460) this).aClass437_5675).buckets[((Class460) this).anInt5677 * 1772241843 - 1]));
				((Class460) this).aClass298_5676 = class298.next;
				((Class460) this).aClass298_5678 = class298;
				return class298;
			} while (false);
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sy.next(").append(')').toString());
		}
	}

	public Linkable method5979(int i) {
		try {
			method5978(-751580615);
			return (Linkable) next();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sy.u(").append(')').toString());
		}
	}

	static final void method5980(byte i) {
		try {
			if (1 != Class360.anInt3896 * -707576455 && 100 != Class360.anInt3896 * -707576455) {
				do {
					try {
						int i_0_;
						if (0 == 1820934059 * Class360.anInt3904)
							i_0_ = 250;
						else
							i_0_ = 2000;
						if (Class360.aBoolean3886 && Class360.anInt3896 * -707576455 >= 62)
							i_0_ = 6000;
						if (-122629167 * Class360.anInt3868 != 264 || (203 != Class360.anInt3896 * -707576455 && 42 != -1372893999 * Class360.anInt3871))
							Class360.anInt3900 += -975705897;
						if (-1937798425 * Class360.anInt3900 > i_0_) {
							Class360.aClass25_3905.method384((byte) 57);
							if (Class360.anInt3904 * 1820934059 < 3) {
								if (264 == Class360.anInt3868 * -122629167)
									Class474.aClass471_5979.method6058(-281677177);
								else
									Class241.aClass471_2705.method6058(-213625938);
								Class360.anInt3900 = 0;
								Class360.anInt3904 += -72367357;
								Class360.anInt3896 = -455386772;
							} else {
								Class360.anInt3896 = -395862839;
								Class78.method845(-5, 1141860334);
								break;
							}
						}
						if (12 == Class360.anInt3896 * -707576455) {
							if (264 == -122629167 * Class360.anInt3868) // World
																		// login
								Class360.aClass25_3905.method389((Class264_Sub4.method2515(Class474.aClass471_5979.method6056(295506052), 15000, -649048480)), Class474.aClass471_5979.address, (byte) 0);
							else
								Class360.aClass25_3905.method389((Class264_Sub4.method2515(Class464.createSocket(Loader.LOBBY_IP, Loader.LOBBY_PORT), 15000, -649048480)), Class241.aClass471_2705.address, (byte) 0);
							Class360.aClass25_3905.method383((short) 8191);
							Class298_Sub36 class298_sub36 = Class82_Sub6.method885(-1825045529);
							if (Class360.aBoolean3886) {
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte((Class211.aClass211_2413.anInt2418 * -1813470547));
								class298_sub36.aClass298_Sub53_Sub2_7396.writeShort(0, 16711935);
								int i_1_ = 385051775 * (class298_sub36.aClass298_Sub53_Sub2_7396.index);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(Loader.REVISION, -1354427278);
								if (Loader.SUB_REVISION != -1) {
									class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(Loader.SUB_REVISION, 376398822);
								}
								if (-122629167 * Class360.anInt3868 == 264)
									class298_sub36.aClass298_Sub53_Sub2_7396.writeByte((5 == client.anInt8752 * -1233866115 ? 1 : 0));
								RsByteBuffer class298_sub53 = Class322.method3933(-1454924768);
								class298_sub53.writeByte((2084404473 * (Class360.anInt3873)));
								class298_sub53.writeShort((int) (Math.random() * 9.9999999E7), 16711935);
								class298_sub53.writeByte(Class321.aClass429_3357.method242(694163818));
								class298_sub53.writeInt((client.anInt8665 * -1154804873), -1393012818);
								for (int i_2_ = 0; i_2_ < 6; i_2_++)
									class298_sub53.writeInt((int) (Math.random() * 9.9999999E7), 499420945);
								class298_sub53.writeLong(client.clientKey * -8380697455384249973L);
								class298_sub53.writeByte((-937307905 * (client.aClass411_8944.gameType)));
								class298_sub53.writeByte((int) (Math.random() * 9.9999999E7));
								class298_sub53.applyRsa((Class50.aBigInteger500), (Class50.aBigInteger503), 1533826109);
								class298_sub36.aClass298_Sub53_Sub2_7396.writeBytes(class298_sub53.buffer, 0, 385051775 * class298_sub53.index, (short) -29754);
								class298_sub36.aClass298_Sub53_Sub2_7396.method3593(385051775 * (class298_sub36.aClass298_Sub53_Sub2_7396.index) - i_1_, 1585504133);
							} else
								class298_sub36.aClass298_Sub53_Sub2_7396.writeByte((-1813470547 * Class211.aClass211_2416.anInt2418));
							Class360.aClass25_3905.method390(class298_sub36, (byte) -57);
							Class360.aClass25_3905.method386(-1781606732);
							Class360.anInt3896 = 1009016718;
						}
						if (Class360.anInt3896 * -707576455 == 30) {
							if (!Class360.aClass25_3905.method387(537308016).isAvailable(1, (byte) -19))
								break;
							Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 1, (byte) 75);
							int i_3_ = ((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[0]) & 0xff);
							if (0 != i_3_) {
								Class360.anInt3896 = -395862839;
								Class78.method845(i_3_, 352942199);
								Class360.aClass25_3905.method384((byte) 110);
								ClientScriptsExecutor.method4693(1976641602);
								break;
							}
							if (Class360.aBoolean3886)
								Class360.anInt3896 = -238095732;
							else
								Class360.anInt3896 = 1898985570;
						}
						if (-707576455 * Class360.anInt3896 == 44) {
							if (!Class360.aClass25_3905.method387(537308016).isAvailable(2, (byte) -17))
								break;
							Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 2, (byte) -39);
							((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
							((BufferedConnectionContext) Class360.aClass25_3905).stream.index = ((BufferedConnectionContext) Class360.aClass25_3905).stream.readUnsignedShort() * 116413311;
							Class360.anInt3896 = -1485208182;
						}
						if (Class360.anInt3896 * -707576455 == 58) {
							if (!Class360.aClass25_3905.method387(537308016).isAvailable((385051775 * (((BufferedConnectionContext) Class360.aClass25_3905).stream.index)), (byte) 6))
								break;
							Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, (385051775 * (((BufferedConnectionContext) Class360.aClass25_3905).stream.index)), (byte) 33);
							((BufferedConnectionContext) Class360.aClass25_3905).stream.method3610(Class360.anIntArray3889, 642509947);
							((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
							String string = ((BufferedConnectionContext) Class360.aClass25_3905).stream.readJagString(681479919);
							((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
							String string_4_ = Class212.aClass212_2430.method1951(-1670386026);
							if (!client.aBoolean8638 || !Class65.method762(string, 1, string_4_, -2049749087))
								Class273.method2559(string, true, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-671601354) == 5, string_4_, client.aBoolean8867, client.aBoolean8651, -1487322449);
							Class360.anInt3896 = 1226307758;
						}
						if (Class360.anInt3896 * -707576455 == 62) {
							if (!Class360.aClass25_3905.method387(537308016).isAvailable(1, (byte) 73))
								break;
							Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 1, (byte) 68);
							if (((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[0]) & 0xff) == 1)
								Class360.anInt3896 = 1562646664;
						}
						if (Class360.anInt3896 * -707576455 == 72) {
							if (!Class360.aClass25_3905.method387(537308016).isAvailable(16, (byte) -100))
								break;
							Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 16, (byte) 59);
							((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 1862612976;
							((BufferedConnectionContext) Class360.aClass25_3905).stream.method3610(Class360.anIntArray3889, 642509947);
							((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
							Class360.aLong3874 = (((BufferedConnectionContext) Class360.aClass25_3905).stream.readLong((short) 27770) * -2742373017286080113L);
							Class360.aLong3911 = (((BufferedConnectionContext) Class360.aClass25_3905).stream.readLong((short) 10381) * 3207425516430892907L);
							Class360.anInt3896 = 1898985570;
						}
						if (-707576455 * Class360.anInt3896 == 82) {
							((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
							Class360.aClass25_3905.method383((short) 8191);
							Class298_Sub36 class298_sub36 = Class82_Sub6.method885(-1133801446);
							RsBitsBuffer stream = class298_sub36.aClass298_Sub53_Sub2_7396;
							if (264 == -122629167 * Class360.anInt3868) { // WORLD
																			// LOGIN
								Class211 class211;
								if (Class360.aBoolean3886)
									class211 = Class211.aClass211_2417;
								else
									class211 = Class211.aClass211_2409;
								stream.writeByte(-1813470547 * class211.anInt2418);
								stream.writeShort(0, 16711935);
								int i_5_ = (385051775 * stream.index);
								int i_6_ = (385051775 * stream.index);
								if (!Class360.aBoolean3886) {
									stream.writeInt(Loader.REVISION, 711122101);
									if (Loader.SUB_REVISION != -1) {
										stream.writeInt(Loader.SUB_REVISION, 98092954);
									}
									stream.writeByte((client.anInt8752 * -1233866115 == 5 ? 1 : 0));
									i_6_ = (385051775 * stream.index);
									RsByteBuffer class298_sub53 = Class_ta_Sub2.method6003(-2133378997);
									stream.writeBytes(class298_sub53.buffer, 0, class298_sub53.index * 385051775, (short) -31677);
									i_6_ = (stream.index * 385051775);
									stream.writeByte(((Class360.aLong3874 * 122690138525332847L) == -1L ? 1 : 0));
									if ((Class360.aLong3874 * 122690138525332847L) == -1L)
										stream.writeString(Class360.username, 2140422151);
									else
										stream.writeLong(122690138525332847L * Class360.aLong3874);
								}
								stream.writeByte(Class190.method1859((byte) -90));
								stream.writeShort(-2110394505 * Class462.anInt5683, 16711935);
								stream.writeShort((Class298_Sub40_Sub9.anInt9716 * -1111710645), 16711935);
								stream.writeByte(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub13_7550.method5675(-217929740));
								Class10.method322(stream, (byte) 1); // writes
								// 24
								// bytes
								stream.writeString((client.aString8927), 2114152304);
								stream.writeInt(-1154804873 * client.anInt8665, -1572632938);
								RsByteBuffer class298_sub53 = Class422_Sub25.aClass298_Sub48_8425.method3542(-611972750);
								stream.writeByte(385051775 * class298_sub53.index);
								stream.writeBytes(class298_sub53.buffer, 0, class298_sub53.index * 385051775, (short) -20549);
								client.aBoolean8666 = true;
								if (Loader.usingRS) {
									RsByteBuffer class298_sub53_7_ = (new RsByteBuffer(Class12.aClass298_Sub44_9946.method3530(-1431420237)));
									Class12.aClass298_Sub44_9946.writeMachineInformation(class298_sub53_7_, 652337983);
									stream.writeBytes(class298_sub53_7_.buffer, 0, class298_sub53_7_.buffer.length, (short) -1355);
								}
								stream.writeInt(((client.anInt8713) * -2059460167), -1287558190);
								stream.writeLong(client.aLong8645 * -5648129435911399733L);
								stream.writeByte(null == client.aString8648 ? 0 : 1);
								if (client.aString8648 != null)
									stream.writeString(client.aString8648, 2119355084);
								stream.writeByte((Class84.aClass305_770.method3747("jagtheora", 1302159774) ? 1 : 0));
								stream.writeByte(((client.aBoolean8638) ? 1 : 0));
								stream.writeByte(((client.aBoolean8958) ? 1 : 0));
								stream.writeByte(((Class350.anInt3758) * -180909151));
								stream.writeInt(1886068421 * client.anInt8654, 576248494);
								stream.writeString((client.aString8655), 2141094155);
								stream.writeByte((null == Class386.aClass471_4146 || ((1606920449 * Class474.aClass471_5979.worldId) != (Class386.aClass471_4146.worldId * 1606920449))) ? 1 : 0);
								Class486.writeCacheCRCs(stream, -956052447);
								stream.method3611(Class360.anIntArray3889, i_6_, 385051775 * stream.index, 1729780581);
								stream.method3593((385051775 * stream.index - i_5_), 1585504133);
							} else { // LOBBY LOGIN
								Class211 class211;
								if (Class360.aBoolean3886)
									class211 = Class211.aClass211_2417;
								else
									class211 = Class211.aClass211_2411;
								stream.writeByte(-1813470547 * class211.anInt2418);
								stream.writeShort(0, 16711935);
								int i_8_ = (385051775 * stream.index);
								int i_9_ = (385051775 * stream.index);
								if (!Class360.aBoolean3886) {
									stream.writeInt(Loader.REVISION, -452164382);
									if (Loader.SUB_REVISION != -1) {
										stream.writeInt(Loader.SUB_REVISION, 317411115);
									}
									RsByteBuffer class298_sub53 = Class_ta_Sub2.method6003(-1358767373);
									stream.writeBytes(class298_sub53.buffer, 0, class298_sub53.index * 385051775, (short) -22572);
									i_9_ = (stream.index * 385051775);
									stream.writeByte((122690138525332847L * Class360.aLong3874) == -1L ? 1 : 0);
									if (-1L == (122690138525332847L * Class360.aLong3874))
										stream.writeString(Class360.username, 2126472832);
									else
										stream.writeLong(122690138525332847L * Class360.aLong3874);
								}
								stream.writeByte((-937307905 * client.aClass411_8944.gameType));
								stream.writeByte(Class321.aClass429_3357.method242(694163818));
								Class10.method322(stream, (byte) 1);
								stream.writeString((client.aString8927), 2107324025);
								RsByteBuffer buffer = Class422_Sub25.aClass298_Sub48_8425.method3542(-1517637513);
								stream.writeByte(((buffer.index) * 385051775));
								stream.writeBytes(buffer.buffer, 0, buffer.index * 385051775, (short) -4570);
								RsByteBuffer buf = (new RsByteBuffer(Class12.aClass298_Sub44_9946.method3530(-1431420237)));
								Class12.aClass298_Sub44_9946.writeMachineInformation(buf, 1834978848);
								stream.writeBytes(buf.buffer, 0, buf.buffer.length, (short) -14969);
								stream.writeInt(-1154804873 * client.anInt8665, 142980326);
								stream.writeInt(((client.anInt8654) * 1886068421), -840792899);
								stream.writeString((client.aString8655), 2126130218);
								Class486.writeCacheCRCs(stream, -535015918);
								byte[] bs = NetworkInterface.getByInetAddress(InetAddress.getLocalHost()).getHardwareAddress();
								stream.writeByte(bs.length);
								stream.writeBytes(bs, 0, bs.length, (short) -20549);
								stream.method3611(Class360.anIntArray3889, i_9_, 385051775 * stream.index, -1390268287);
								stream.method3593((385051775 * stream.index - i_8_), 1585504133);
							}
							Class360.aClass25_3905.method390(class298_sub36, (byte) -65);
							Class360.aClass25_3905.method386(-1062695636);
							Class360.aClass25_3905.aClass449_330 = new IsaacCipher(Class360.anIntArray3889);
							for (int i_11_ = 0; i_11_ < 4; i_11_++)
								Class360.anIntArray3889[i_11_] += 50;
							((BufferedConnectionContext) Class360.aClass25_3905).aClass449_334 = new IsaacCipher(Class360.anIntArray3889);
							new IsaacCipher(Class360.anIntArray3889);
							((BufferedConnectionContext) Class360.aClass25_3905).stream.method3665((((BufferedConnectionContext) Class360.aClass25_3905).aClass449_334), (byte) 80);
							Class360.anIntArray3889 = null;
							Class360.anInt3896 = 1443598798;
						}
						if (94 == -707576455 * Class360.anInt3896) {
							if (!Class360.aClass25_3905.method387(537308016).isAvailable(1, (byte) -69))
								break;
							Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 1, (byte) -72);
							int loginOpcode = ((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[0]) & 0xff);
							if (21 == loginOpcode)
								Class360.anInt3896 = 2056752677;
							else if (29 == loginOpcode || 45 == loginOpcode) {
								Class197.anInt1992 = 974522705 * loginOpcode;
								Class360.anInt3896 = -616044022;
							} else {
								if (loginOpcode == 1) {
									Class360.anInt3896 = -931578236;
									Class78.method845(loginOpcode, 1486771183);
									break;
								}
								if (loginOpcode == 2)
									Class360.anInt3896 = 1601365905;
								else if (15 == loginOpcode) {
									((BufferedConnectionContext) Class360.aClass25_3905).anInt336 = -1763582762;
									Class360.anInt3896 = 907883401;
								} else {
									if (loginOpcode == 23 && (1820934059 * Class360.anInt3904 < 3)) {
										Class360.anInt3900 = 0;
										Class360.anInt3904 += -72367357;
										Class360.anInt3896 = -455386772;
										Class360.aClass25_3905.method384((byte) 93);
									} else {
										if (loginOpcode == 42) {
											Class360.anInt3896 = 1244222307;
											Class78.method845(loginOpcode, 1924139793);
										} else {
											if (Class360.aBoolean3870 && !Class360.aBoolean3886 && -1 != (2084404473 * Class360.anInt3873) && 35 == loginOpcode) {
												Class360.aBoolean3886 = true;
												Class360.anInt3900 = 0;
												Class360.anInt3896 = -455386772;
												Class360.aClass25_3905.method384((byte) 93);
											} else {
												Class360.anInt3896 = -395862839;
												Class78.method845(loginOpcode, 1778518954);
												Class360.aClass25_3905.method384((byte) 124);
												ClientScriptsExecutor.method4693(1976641602);
												break;
											}
											break;
										}
										break;
									}
									break;
								}
							}
						}
						if (Class360.anInt3896 * -707576455 == 117) {
							Class360.aClass25_3905.method383((short) 8191);
							Class298_Sub36 class298_sub36 = Class82_Sub6.method885(-1106381844);
							RsBitsBuffer class298_sub53_sub2 = class298_sub36.aClass298_Sub53_Sub2_7396;
							class298_sub53_sub2.method3665((Class360.aClass25_3905.aClass449_330), (byte) 41);
							class298_sub53_sub2.method3668((-1813470547 * (Class211.aClass211_2419.anInt2418)), (byte) 1);
							Class360.aClass25_3905.method390(class298_sub36, (byte) -122);
							Class360.aClass25_3905.method386(-1208418920);
							Class360.anInt3896 = 1443598798;
						} else if (125 == Class360.anInt3896 * -707576455) {
							if (Class360.aClass25_3905.method387(537308016).isAvailable(1, (byte) 48)) {
								Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 1, (byte) -14);
								int i_13_ = (((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[0]) & 0xff;
								Class360.anInt3908 = i_13_ * -1954130922;
								Class360.anInt3896 = -395862839;
								Class78.method845(21, 779029063);
								Class360.aClass25_3905.method384((byte) 10);
								ClientScriptsExecutor.method4693(1976641602);
							}
						} else if (-707576455 * Class360.anInt3896 == 203) {
							if (Class360.aClass25_3905.method387(537308016).isAvailable(2, (byte) 92)) {
								Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 2, (byte) 31);
								Class360.anInt3866 = ((((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[0]) & 0xff) << 8) + ((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[1]) & 0xff)) * -1156978587;
								Class360.anInt3896 = 1443598798;
							}
						} else if (-707576455 * Class360.anInt3896 == 186) {
							if (29 == Class197.anInt1992 * 1892081585) {
								if (!Class360.aClass25_3905.method387(537308016).isAvailable(1, (byte) 78))
									break;
								Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 1, (byte) -63);
								Class360.anInt3910 = (1200969765 * ((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[0]) & 0xff));
							} else if (Class197.anInt1992 * 1892081585 == 45) {
								if (!Class360.aClass25_3905.method387(537308016).isAvailable(3, (byte) -85))
									break;
								Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 3, (byte) -63);
								Class360.anInt3910 = (1200969765 * ((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[0]) & 0xff));
								Class360.anInt3909 = (1719895145 * (((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[2]) & 0xff) + (((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[1]) & 0xff) << 8)));
							} else
								throw new IllegalStateException();
							Class360.anInt3896 = -395862839;
							Class78.method845(1892081585 * Class197.anInt1992, -28417078);
							Class360.aClass25_3905.method384((byte) 7);
							ClientScriptsExecutor.method4693(1976641602);
						} else if (137 == Class360.anInt3896 * -707576455) { // if
																				// sucefull
																				// world
																				// login,
																				// index
																				// 2
							if (Class360.aClass25_3905.method387(537308016).isAvailable(1, (byte) -1)) {
								Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 1, (byte) -34);
								Class360.loginConfigsSize = (1962471985 * ((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer[0]) & 0xff));
								Class360.anInt3896 = 1541841972;
							}
						} else { // setting login configs size
							if (-707576455 * Class360.anInt3896 == 148) { // if
																			// world
																			// login
								RsBitsBuffer stream = (((BufferedConnectionContext) Class360.aClass25_3905).stream);
								if (264 == Class360.anInt3868 * -122629167) { // world
																				// login,
																				// 264
									if (!Class360.aClass25_3905.method387(537308016).isAvailable(-1359010095 * Class360.loginConfigsSize, (byte) 68))
										break;
									Class360.aClass25_3905.method387(537308016).read(stream.buffer, 0, Class360.loginConfigsSize * -1359010095, (byte) 13);
									stream.index = 0;
									client.playerRights = (stream.readUnsignedByte() * 1835619115);
									client.anInt8932 = (stream.readUnsignedByte() * -418443653);
									client.aBoolean8811 = stream.readUnsignedByte() == 1;
									client.aBoolean8812 = stream.readUnsignedByte() == 1;
									client.aBoolean8813 = stream.readUnsignedByte() == 1;
									client.aBoolean8802 = stream.readUnsignedByte() == 1;
									client.playerIndex = (stream.readUnsignedShort() * 1448461709);
									client.aBoolean8807 = stream.readUnsignedByte() == 1;
									Class298_Sub41.anInt7456 = (stream.read24BitInteger((byte) -39) * 777394511);
									client.isMemberWorld = stream.readUnsignedByte() == 1;
									Class112.aString1369 = stream.readString(-796084606);
									client.aClass283_8716.method2641(-1352577967).method5790(client.isMemberWorld, 915103443);
									Class62.aClass248_612.method2384((short) 206).method2641(-884206015).method5790(client.isMemberWorld, 915103443);
									Class298_Sub32_Sub14.aClass477_9400.method6092(client.isMemberWorld, 798055588);
									Class15.aClass507_224.method6270(client.isMemberWorld, (byte) -2);
								} else { // lobby login
									if (!Class360.aClass25_3905.method387(537308016).isAvailable(Class360.loginConfigsSize * -1359010095, (byte) -27))
										break;
									Class360.aClass25_3905.method387(537308016).read(stream.buffer, 0, Class360.loginConfigsSize * -1359010095, (byte) 29);
									stream.index = 0;
									client.playerRights = (stream.readUnsignedByte() * 1835619115);
									System.out.println("Rights: " + (client.playerRights * 1806357379));
									client.anInt8932 = (stream.readUnsignedByte() * -418443653);
									client.aBoolean8811 = stream.readUnsignedByte() == 1;
									Class298_Sub41.anInt7456 = (stream.read24BitInteger((byte) -98) * 777394511);
									Class287.myPlayer.gender = (byte) stream.readUnsignedByte();
									client.aBoolean8812 = stream.readUnsignedByte() == 1;
									client.aBoolean8813 = stream.readUnsignedByte() == 1;
									Class247.aLong2748 = (stream.readLong((short) 9875) * 9182695496232067233L);
									Class298_Sub35.aLong7395 = (((-536549149186981023L * Class247.aLong2748) - Class122.method1319((byte) 1) - stream.method3601((byte) 74)) * -7894334964002250373L);
									int i_14_ = stream.readUnsignedByte();
									client.aBoolean8807 = 0 != (i_14_ & 0x1);
									Class510.aBoolean6222 = 0 != (i_14_ & 0x2);
									Class384.anInt4128 = (stream.readInt((byte) 99) * -1704395451);
									Class525.aBoolean6300 = stream.readUnsignedByte() == 1;
									Class100.anInt1079 = (stream.readInt((byte) -9) * -442700441);
									Class66.anInt666 = (stream.readUnsignedShort() * -1652734029);
									OutcommingPacket.anInt2099 = (stream.readUnsignedShort() * 808373911);
									Linkable.anInt3190 = (stream.readUnsignedShort() * -591256495);
									Linkable.anInt3191 = (stream.readInt((byte) 39) * -1316190437);
									Class251.aClass524_2773 = new Class524(Linkable.anInt3191 * 2071493395);
									new Thread(Class251.aClass524_2773).start();
									Class95.anInt923 = (stream.readUnsignedByte() * 1240622393);
									Class485.anInt6059 = (stream.readUnsignedShort() * 556974909);
									Class52_Sub2.anInt6815 = (stream.readUnsignedShort() * 580840459);
									Class406.aBoolean5274 = stream.readUnsignedByte() == 1;
									Class287.myPlayer.username = Class287.myPlayer.displayName = RuntimeException_Sub2.aString6305 = stream.readJagString(681479919);
									Class95.anInt924 = (stream.readUnsignedByte() * 821936487); // TODO:
									Class216.anInt6659 = (stream.readInt((byte) -28) * 2029589759);
									client.aBoolean8640 = stream.readUnsignedByte() == 1;
									Class386.aClass471_4146 = new Class464();
									Class386.aClass471_4146.worldId = (stream.readUnsignedShort() * 348739329);
									if (65535 == 1606920449 * (Class386.aClass471_4146.worldId))
										Class386.aClass471_4146.worldId = -348739329;
									Class386.aClass471_4146.address = stream.readJagString(681479919);
									System.out.println("Address: " + Class386.aClass471_4146.address + " - world: " + ((Class386.aClass471_4146.worldId) * 1606920449));
									if (Class401.aClass401_6557 != Class242.aClass401_2708) {
										Class386.aClass471_4146.anInt5954 = ((Class386.aClass471_4146.worldId) * -1670427267 + 815680320);
										Class386.aClass471_4146.anInt5955 = (-52655920 + (Class386.aClass471_4146.worldId) * 925746937);
									}
									if ((Class242.aClass401_2708 != Class401.aClass401_6552) && ((Class242.aClass401_2708 != Class401.aClass401_6554) || (1806357379 * client.playerRights < 2)) && (Class474.aClass471_5979.method6057(Class474.aClass471_5976, 2123928060))) {
										Class380.method4678(-1667448332);
									}
								}
								if (client.aBoolean8811 && !client.aBoolean8813 || client.aBoolean8807) {
									try {
										Class466.method6021((ClientScriptMap.anApplet6044), "zap", (short) 11786);
									} catch (Throwable throwable) {
										if (client.aBoolean8639) {
											try {
												ClientScriptMap.anApplet6044.getAppletContext().showDocument((new URL(ClientScriptMap.anApplet6044.getCodeBase(), "blank.ws")), "tbi");
											} catch (Exception exception) {
												/* empty */
											}
										}
									}
								} else {
									try {
										Class466.method6021((ClientScriptMap.anApplet6044), "unzap", (short) 10429);
									} catch (Throwable throwable) {
										/* empty */
									}
								}
								if (Class401.aClass401_6557 == Class242.aClass401_2708)
									Class212.aClass212_2422.method1952(-1392768715);
								if (264 == Class360.anInt3868 * -122629167) // World
																			// login
									Class360.anInt3896 = -101133317;
								else { // Lobby login
									Class360.anInt3896 = -395862839;
									Class78.method845(2, 1533583535);
									ObjectDefinitions.method5789(-954161588);
									Class439.method5851(14, 1153867870);
									((BufferedConnectionContext) Class360.aClass25_3905).INCOMMING_PACKET = null;
									break;
								}
							}
							if (-707576455 * Class360.anInt3896 == 163) {
								if (!Class360.aClass25_3905.method387(537308016).isAvailable(3, (byte) 75))
									break;
								Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 3, (byte) -16);
								Class360.anInt3896 = -952382928;
							}
							if (-707576455 * Class360.anInt3896 == 176) {
								RsBitsBuffer stream = (((BufferedConnectionContext) Class360.aClass25_3905).stream);
								stream.index = 0;
								if (stream.method3661((byte) -27)) {
									if (!Class360.aClass25_3905.method387(537308016).isAvailable(1, (byte) -10))
										break;
									Class360.aClass25_3905.method387(537308016).read(stream.buffer, 3, 1, (byte) -25);
								}
								((BufferedConnectionContext) Class360.aClass25_3905).INCOMMING_PACKET = (Class510.method6290(-1456212765)[stream.readUnsignedSmart(250607366)]); // receives
																																								// packet
																																								// id
								((BufferedConnectionContext) Class360.aClass25_3905).anInt336 = (stream.readUnsignedShort() * -1265692267); // stream
																															// required
																															// size,
																															// prob
																															// packet
																															// size
								Class360.anInt3896 = 1878180878;
							}
							if (158 == -707576455 * Class360.anInt3896) {
								if (Class360.aClass25_3905.method387(537308016).isAvailable((-866602563 * (((BufferedConnectionContext) Class360.aClass25_3905).anInt336)), (byte) -22)) {
									Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, (-866602563 * (((BufferedConnectionContext) Class360.aClass25_3905).anInt336)), (byte) 29);
									((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
									int packetSize = ((((BufferedConnectionContext) Class360.aClass25_3905).anInt336) * -866602563);
									Class360.anInt3896 = -395862839;
									Class78.method845(2, 1250429131);
									Class411.method5579(-2092028687);
									Class51.decodeLswp((((BufferedConnectionContext) Class360.aClass25_3905).stream), 837096225);
									int i_16_ = packetSize - (((BufferedConnectionContext) Class360.aClass25_3905).stream.index) * 385051775;
									RsBitsBuffer stream = new RsBitsBuffer(i_16_);
									System.arraycopy((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), ((((BufferedConnectionContext) Class360.aClass25_3905).stream.index) * 385051775), stream.buffer, 0, i_16_);
									((BufferedConnectionContext) Class360.aClass25_3905).stream.index += i_16_ * 116413311;
									if ((((BufferedConnectionContext) Class360.aClass25_3905).INCOMMING_PACKET) == IncommingPacket.LOAD_MAP_SCENE_DYNAMIC_PACKET)
										client.aClass283_8716.sendMapScene(new Class267((Class266.LOAD_MAP_SCENE_DYNAMIC), stream), -1991819579);
									else
										client.aClass283_8716.sendMapScene(new Class267((Class266.LOAD_MAP_SCENE_NORMAL), stream), -1991819579);
									if (packetSize != (((BufferedConnectionContext) Class360.aClass25_3905).stream.index) * 385051775)
										throw new RuntimeException(new StringBuilder().append(385051775 * (((BufferedConnectionContext) (Class360.aClass25_3905)).stream.index)).append(" ").append(packetSize).toString());
									((BufferedConnectionContext) Class360.aClass25_3905).INCOMMING_PACKET = null;
								}
							} else {
								if (193 != Class360.anInt3896 * -707576455)
									break;
								if (-2 == (-866602563 * (((BufferedConnectionContext) Class360.aClass25_3905).anInt336))) {
									if (!Class360.aClass25_3905.method387(537308016).isAvailable(2, (byte) 39))
										break;
									Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, 2, (byte) 9);
									((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
									((BufferedConnectionContext) Class360.aClass25_3905).anInt336 = (((BufferedConnectionContext) Class360.aClass25_3905).stream.readUnsignedShort() * -1265692267);
								}
								if (Class360.aClass25_3905.method387(537308016).isAvailable((-866602563 * (((BufferedConnectionContext) Class360.aClass25_3905).anInt336)), (byte) 77)) {
									Class360.aClass25_3905.method387(537308016).read((((BufferedConnectionContext) Class360.aClass25_3905).stream.buffer), 0, (((BufferedConnectionContext) Class360.aClass25_3905).anInt336) * -866602563, (byte) -73);
									((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
									int i_17_ = ((((BufferedConnectionContext) Class360.aClass25_3905).anInt336) * -866602563);
									Class360.anInt3896 = -395862839;
									Class78.method845(15, 380191322);
									Class431.method5766(144926411);
									Class51.decodeLswp((((BufferedConnectionContext) Class360.aClass25_3905).stream), 822397380);
									if ((385051775 * (((BufferedConnectionContext) Class360.aClass25_3905).stream.index)) != i_17_)
										throw new RuntimeException(new StringBuilder().append((((BufferedConnectionContext) (Class360.aClass25_3905)).stream.index) * 385051775).append(" ").append(i_17_).toString());
									((BufferedConnectionContext) Class360.aClass25_3905).INCOMMING_PACKET = null;
								}
							}
						}
					} catch (IOException ioexception) {
						Class360.aClass25_3905.method384((byte) 40);
						if (1820934059 * Class360.anInt3904 < 3) {
							if (264 == -122629167 * Class360.anInt3868)
								Class474.aClass471_5979.method6058(-1442409390);
							else
								Class241.aClass471_2705.method6058(-734598763);
							Class360.anInt3900 = 0;
							Class360.anInt3904 += -72367357;
							Class360.anInt3896 = -455386772;
						} else {
							Class360.anInt3896 = -395862839;
							Class78.method845(-4, 500556519);
							ClientScriptsExecutor.method4693(1976641602);
						}
						break;
					}
					break;
				} while (false);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sy.c(").append(')').toString());
		}
	}

	static void method5981(boolean bool, boolean bool_18_, String string, String string_19_, long l) {
		try {
			Class360.aBoolean3886 = bool;
			if (!bool_18_)
				Class360.anInt3873 = -2035975497;
			Class360.aBoolean3870 = bool_18_;
			Class360.username = string;
			Class360.password = string_19_;
			Class360.aLong3874 = l * -2742373017286080113L;
			if (!Class360.aBoolean3870 && (Class360.username.equals("") || Class360.password.equals("")))
				Class78.method845(3, 418769263);
			else {
				if (Class360.anInt3868 * -122629167 != 136) {
					Class360.anInt3908 = 0;
					Class360.anInt3910 = -1200969765;
					Class360.anInt3909 = -1719895145;
				}
				Class360.aClass25_3905.aBoolean347 = false;
				Class78.method845(-3, 1492625242);
				Class360.anInt3896 = -455386772;
				Class360.anInt3900 = 0;
				Class360.anInt3904 = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("sy.e(").append(')').toString());
		}
	}
}
