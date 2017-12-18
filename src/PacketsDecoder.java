import java.io.IOException;

public class PacketsDecoder {

	static final boolean method4548(BufferedConnectionContext class25, int i) throws IOException {
		try {
			Class318 class318 = class25.method387(537308016);
			RsBitsBuffer stream = ((BufferedConnectionContext) class25).stream;
			if (class318 == null)
				return false;
			if (null == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				if (((BufferedConnectionContext) class25).aBoolean337) {
					if (!class318.isAvailable(1, (byte) -44))
						return false;
					class318.read((((BufferedConnectionContext) class25).stream.buffer), 0, 1, (byte) 1);
					((BufferedConnectionContext) class25).anInt341 += 655103753;
					((BufferedConnectionContext) class25).anInt338 = 0;
					((BufferedConnectionContext) class25).aBoolean337 = false;
				}
				stream.index = 0;
				if (stream.method3661((byte) -78)) {
					if (!class318.isAvailable(1, (byte) -13))
						return false;
					class318.read((((BufferedConnectionContext) class25).stream.buffer), 1, 1, (byte) 4);
					((BufferedConnectionContext) class25).anInt341 += 655103753;
					((BufferedConnectionContext) class25).anInt338 = 0;
				}
				((BufferedConnectionContext) class25).aBoolean337 = true;
				IncommingPacket[] class202s = Class510.method6290(-1456212765);
				int i_78_ = stream.readUnsignedSmart(250607366);
				if (i_78_ < 0 || i_78_ >= class202s.length)
					throw new IOException(new StringBuilder().append(i_78_).append(" ").append(385051775 * stream.index).toString());
				((BufferedConnectionContext) class25).INCOMMING_PACKET = class202s[i_78_];
				((BufferedConnectionContext) class25).anInt336 = ((BufferedConnectionContext) class25).INCOMMING_PACKET.anInt2165 * -80186869;
			}
			if (-1 == -866602563 * ((BufferedConnectionContext) class25).anInt336) {
				if (!class318.isAvailable(1, (byte) -5))
					return false;
				class318.read(stream.buffer, 0, 1, (byte) 48);
				((BufferedConnectionContext) class25).anInt336 = ((stream.buffer[0] & 0xff) * -1265692267);
				((BufferedConnectionContext) class25).anInt341 += 655103753;
				((BufferedConnectionContext) class25).anInt338 = 0;
			}
			if (-2 == -866602563 * ((BufferedConnectionContext) class25).anInt336) {
				if (!class318.isAvailable(2, (byte) 9))
					return false;
				class318.read(stream.buffer, 0, 2, (byte) -84);
				stream.index = 0;
				((BufferedConnectionContext) class25).anInt336 = stream.readUnsignedShort() * -1265692267;
				((BufferedConnectionContext) class25).anInt341 += 1310207506;
				((BufferedConnectionContext) class25).anInt338 = 0;
			}
			if (-866602563 * ((BufferedConnectionContext) class25).anInt336 > 0) {
				if (!class318.isAvailable((-866602563 * ((BufferedConnectionContext) class25).anInt336), (byte) -53))
					return false;
				stream.index = 0;
				class318.read(stream.buffer, 0, -866602563 * ((BufferedConnectionContext) class25).anInt336, (byte) 117);
				((BufferedConnectionContext) class25).anInt341 += 1190279845 * ((BufferedConnectionContext) class25).anInt336;
				((BufferedConnectionContext) class25).anInt338 = 0;
			}
			((BufferedConnectionContext) class25).aClass202_348 = ((BufferedConnectionContext) class25).aClass202_345;
			((BufferedConnectionContext) class25).aClass202_345 = ((BufferedConnectionContext) class25).aClass202_344;
			((BufferedConnectionContext) class25).aClass202_344 = ((BufferedConnectionContext) class25).INCOMMING_PACKET;
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2162) {
				client.aByte8959 = stream.readByteC(281504196);
				if (client.aByte8959 == 0 || client.aByte8959 == 1)
					client.aBoolean8640 = true;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2261) {
				client.anInt8885 = 887090299 * client.anInt8933;
				boolean bool = stream.readUnsignedByte() == 1;
				Class160 class160 = new Class160(stream);
				Class162 class162;
				if (bool)
					class162 = Class225.aClass162_2512;
				else
					class162 = Class508.aClass162_6216;
				class160.method1707(class162, (byte) -89);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2255) {
				int i_79_ = stream.readUnsignedShort();
				Class321.method3928(i_79_, (byte) 1);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.MESSAGE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_80_ = stream.readUnsignedSmart(1723054621);
				int i_81_ = stream.readInt((byte) 32);
				int i_82_ = stream.readUnsignedByte();
				String string = "";
				String string_83_ = string;
				if ((i_82_ & 0x1) != 0) {
					string = stream.readString(-803257696);
					if (0 != (i_82_ & 0x2))
						string_83_ = stream.readString(1955180504);
					else
						string_83_ = string;
				}
				String string_84_ = stream.readString(-149899401);
				if (i_80_ == 99)
					Class255.method2435(string_84_, 1055145979);
				else if (i_80_ == 98)
					Class422_Sub18.method5694(string_84_, 893713138);
				else {
					if (!string_83_.equals("") && Class287.method2722(string_83_, -1821123802)) {
						((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
						return true;
					}
					Class242_Sub1.method2282(i_80_, i_81_, string, string_83_, string, string_84_, -1468983571);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2309) {
				client.anInt8845 = stream.readShort(2135181158) * 2043410797;
				client.anInt8888 = client.anInt8933 * 1991119277;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.KEEP_ALIVE_PACKET) {
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return false;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.MODEL_ON_ICOMPONENT_PACKET) {
				int modelId = stream.readInt((byte) 40);
				int interfaceHash = stream.readInt((byte) -19);
				Class343.method4162(1737716957);
				SubIncommingPacket.method1924(interfaceHash, 2, modelId, -1, 262144);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2277 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int interfaceHash = stream.readInt((byte) 86);
				int i_88_ = stream.readUnsignedShort();
				int i_89_ = stream.readInt((byte) 9);
				Class343.method4162(1819553678);
				SubIncommingPacket.method1924(interfaceHash, 3, i_88_, i_89_, 262144);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2209) {
				int i_90_ = stream.readInt((byte) -41);
				Class251.aClass524_2773 = new Class524(i_90_);
				Thread thread = new Thread(Class251.aClass524_2773);
				thread.setPriority(1);
				thread.start();
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2270 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_91_ = stream.readUnsignedShort();
				int i_92_ = stream.readIntV1(1375072280);
				Class343.method4162(1593058351);
				Class418.method5600(i_92_, i_91_, -683645841);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2204) {
				Class313.anObjectArray3298 = null;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.GRAPHICS_PACKET) {
				int graphicsId = stream.readUnsignedShort();
				if (65535 == graphicsId)
					graphicsId = -1;
				int slotId = stream.readUnsignedByte128(-1014855659);
				int speed = stream.readUnsignedShort();
				int hash = stream.readUnsignedByte128(-1014855659);
				int graphicsHeight = stream.readUnsignedShort();
				int targetHash = stream.readIntLE(-1780969146);
				int i_99_ = hash & 0x7;
				int i_100_ = hash >> 3 & 0xf;
				if (15 == i_100_)
					i_100_ = -1;
				boolean bool = (hash >> 7 & 0x1) == 1;
				if (targetHash >> 30 != 0) {
					Class341 class341 = client.aClass283_8716.method2628(681479919);
					int i_101_ = targetHash >> 28 & 0x3;
					int i_102_ = ((targetHash >> 14 & 0x3fff) - -1760580017 * class341.gameSceneBaseX);
					int i_103_ = (targetHash & 0x3fff) - 283514611 * class341.gameSceneBaseY;
					if (i_102_ >= 0 && i_103_ >= 0 && (i_102_ < client.aClass283_8716.method2629(-1990296889)) && (i_103_ < client.aClass283_8716.method2630(-1604198619))) {
						if (graphicsId == -1) {
							Class298_Sub37_Sub3 class298_sub37_sub3 = ((Class298_Sub37_Sub3) (client.aClass437_8825.get((long) (i_102_ << 16 | i_103_))));
							if (class298_sub37_sub3 != null) {
								((Class298_Sub37_Sub3) class298_sub37_sub3).aClass365_Sub1_Sub1_Sub3_9578.method4480((byte) 12);
								class298_sub37_sub3.unlink(-1460969981);
							}
						} else {
							int i_104_ = 256 + i_102_ * 512;
							int i_105_ = 256 + 512 * i_103_;
							int i_106_ = i_101_;
							if (i_106_ < 3 && (client.aClass283_8716.method2654(651162634).method2320(i_102_, i_103_, -2025869337)))
								i_106_++;
							Class365_Sub1_Sub1_Sub3 class365_sub1_sub1_sub3 = (new Class365_Sub1_Sub1_Sub3(client.aClass283_8716.method2675(-1611682495), graphicsId, speed, i_101_, i_106_, i_104_, Class356.method4271(i_104_, i_105_, i_101_, -1215922012) - graphicsHeight, i_105_, i_102_, i_102_, i_103_, i_103_, i_99_, bool));
							client.aClass437_8825.method5817((new Class298_Sub37_Sub3(class365_sub1_sub1_sub3)), (long) (i_102_ << 16 | i_103_));
						}
					}
				} else if (targetHash >> 29 != 0) {
					int i_107_ = targetHash & 0xffff;
					Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_107_));
					if (null != class298_sub29) {
						NPC class365_sub1_sub1_sub2_sub1 = ((NPC) class298_sub29.anObject7366);
						Graphics class56 = (class365_sub1_sub1_sub2_sub1.currentGraphics[slotId]);
						if (graphicsId == 65535)
							graphicsId = -1;
						boolean bool_108_ = true;
						int i_109_ = -967533709 * class56.id;
						if (-1 != graphicsId && i_109_ != -1) {
							if (graphicsId == i_109_) {
								Class398 class398 = Class158_Sub1.aClass389_8568.method4857(graphicsId, -2138799623);
								if (class398.aBoolean5215 && -1 != class398.anInt5205 * 1505778629) {
									Class391 class391 = (Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) -71));
									int i_110_ = class391.anInt4184 * -1117238071;
									if (i_110_ == 0 || 2 == i_110_)
										bool_108_ = false;
									else if (i_110_ == 1)
										bool_108_ = true;
								}
							} else {
								Class398 class398 = Class158_Sub1.aClass389_8568.method4857(graphicsId, -1997923010);
								Class398 class398_111_ = Class158_Sub1.aClass389_8568.method4857(i_109_, -1881939747);
								if (class398.anInt5205 * 1505778629 != -1 && (class398_111_.anInt5205 * 1505778629 != -1)) {
									Class391 class391 = (Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) 83));
									Class391 class391_112_ = (Class501.aClass395_6122.method4903((1505778629 * class398_111_.anInt5205), (byte) -25));
									if (-1445588039 * class391.anInt4178 < (-1445588039 * class391_112_.anInt4178))
										bool_108_ = false;
								}
							}
						}
						if (bool_108_) {
							class56.id = 1313669563 * graphicsId;
							class56.height = graphicsHeight * 1755371497;
							class56.anInt568 = i_100_ * 1533439965;
							if (-1 != graphicsId) {
								Class398 class398 = Class158_Sub1.aClass389_8568.method4857(graphicsId, -1696520605);
								int i_113_ = class398.aBoolean5215 ? 0 : 2;
								if (bool)
									i_113_ = 1;
								class56.aClass438_569.method5824(1505778629 * class398.anInt5205, speed, i_113_, false, (byte) 0);
							} else
								class56.aClass438_569.method5821(-1, -1461567794);
						}
					}
				} else if (targetHash >> 28 != 0) {
					int i_114_ = targetHash & 0xffff;
					Player class365_sub1_sub1_sub2_sub2;
					if (i_114_ == -442628795 * client.playerIndex)
						class365_sub1_sub1_sub2_sub2 = Class287.myPlayer;
					else
						class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_114_]);
					if (class365_sub1_sub1_sub2_sub2 != null) {
						Graphics class56 = (class365_sub1_sub1_sub2_sub2.currentGraphics[slotId]);
						if (65535 == graphicsId)
							graphicsId = -1;
						boolean bool_115_ = true;
						int i_116_ = -967533709 * class56.id;
						if (graphicsId != -1 && -1 != i_116_) {
							if (graphicsId == i_116_) {
								Class398 class398 = Class158_Sub1.aClass389_8568.method4857(graphicsId, -1990411818);
								if (class398.aBoolean5215 && class398.anInt5205 * 1505778629 != -1) {
									Class391 class391 = (Class501.aClass395_6122.method4903(class398.anInt5205 * 1505778629, (byte) -15));
									int i_117_ = -1117238071 * class391.anInt4184;
									if (0 == i_117_ || 2 == i_117_)
										bool_115_ = false;
									else if (i_117_ == 1)
										bool_115_ = true;
								}
							} else {
								Class398 class398 = Class158_Sub1.aClass389_8568.method4857(graphicsId, -1975194771);
								Class398 class398_118_ = Class158_Sub1.aClass389_8568.method4857(i_116_, -1893234855);
								if (-1 != class398.anInt5205 * 1505778629 && -1 != (1505778629 * class398_118_.anInt5205)) {
									Class391 class391 = (Class501.aClass395_6122.method4903(1505778629 * class398.anInt5205, (byte) -1));
									Class391 class391_119_ = (Class501.aClass395_6122.method4903((class398_118_.anInt5205 * 1505778629), (byte) -13));
									if (class391.anInt4178 * -1445588039 < (-1445588039 * class391_119_.anInt4178))
										bool_115_ = false;
								}
							}
						}
						if (bool_115_) {
							class56.id = graphicsId * 1313669563;
							class56.height = graphicsHeight * 1755371497;
							class56.anInt568 = i_100_ * 1533439965;
							class56.anInt571 = 1949040559 * i_99_;
							if (graphicsId != -1) {
								Class398 class398 = Class158_Sub1.aClass389_8568.method4857(graphicsId, -2053481236);
								int i_120_ = class398.aBoolean5215 ? 0 : 2;
								if (bool)
									i_120_ = 1;
								class56.aClass438_569.method5824(1505778629 * class398.anInt5205, speed, i_120_, false, (byte) 0);
							} else
								class56.aClass438_569.method5821(-1, -1498678101);
						}
					}
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2273 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_121_ = stream.readIntV2((byte) 74);
				int i_122_ = stream.readUnsignedByte();
				int i_123_ = stream.readIntLE(-1943559024);
				int i_124_ = stream.readIntV1(40948873);
				int i_125_ = stream.readUnsignedByte128(-1014855659);
				int i_126_ = i_125_ >> 2;
				int i_127_ = i_125_ & 0x3;
				Class341 class341 = new Class341(stream.readInt((byte) -80));
				int i_128_ = stream.readIntV2((byte) 67);
				int i_129_ = stream.readUnsignedShort();
				int i_130_ = stream.readInt((byte) 111);
				int i_131_ = stream.readInt((byte) 20);
				Class343.method4162(1565654917);
				Class113.method1254(i_128_, new Class298_Sub51_Sub3(i_129_, i_122_, new Class409(class341, i_126_, i_127_, i_124_)), new int[] { i_131_, i_121_, i_123_, i_130_ }, false, 1266119011);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2186 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_132_ = stream.readUnsignedShortLE128(1478539457);
				Class343.method4162(1731780028);
				Class119.method1300(i_132_, 8113847);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.PRIVATE_GAME_BAR_STAGE_PACKET) {
				Class110.aClass459_6404 = Class275.method2571(stream.readUnsignedByte(), 413652738);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.GLOBAL_STRING_PACKET_2 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				String string = stream.readString(-1190925173);
				int i_133_ = stream.readUnsignedShort();
				Class343.method4162(1879133917);
				Class501.method6230(i_133_, string, -1961104888);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2182 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.aClass206_2347, (short) -69);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.CONFIG1_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_134_ = stream.readUnsignedShortLE128(1478539457);
				byte i_135_ = stream.readByte128((byte) -42);
				Class128.aClass148_6331.method1605(i_134_, i_135_, (byte) 120);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2166) {
				Class128.aClass148_6331.method1603(-1701505848);
				client.anInt8783 += -612656928;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2199 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				String string = stream.readString(1959588541);
				boolean bool = stream.readUnsignedByte() == 1;
				String string_136_;
				if (bool)
					string_136_ = stream.readString(1305622298);
				else
					string_136_ = string;
				int i_137_ = stream.readUnsignedShort();
				byte i_138_ = stream.readByte(-12558881);
				boolean bool_139_ = false;
				if (i_138_ == -128)
					bool_139_ = true;
				if (bool_139_) {
					if (-1801543887 * Class489.anInt6071 == 0) {
						((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
						return true;
					}
					boolean bool_140_ = false;
					int i_141_;
					for (i_141_ = 0; i_141_ < Class489.anInt6071 * -1801543887; i_141_++) {
						if (Class82_Sub6.aClass7Array6846[i_141_].aString93.equals(string_136_) && (Class82_Sub6.aClass7Array6846[i_141_].anInt95 * -1071570519) == i_137_) {
							if (i <= -1128197512)
								throw new IllegalStateException();
							break;
						}
					}
					if (i_141_ < -1801543887 * Class489.anInt6071) {
						for (/**/; i_141_ < -1801543887 * Class489.anInt6071 - 1; i_141_++)
							Class82_Sub6.aClass7Array6846[i_141_] = Class82_Sub6.aClass7Array6846[1 + i_141_];
						Class489.anInt6071 -= -1649911343;
						Class82_Sub6.aClass7Array6846[(Class489.anInt6071 * -1801543887)] = null;
					}
				} else {
					String string_142_ = stream.readString(-1357066804);
					Class7 class7 = new Class7();
					class7.aString92 = string;
					class7.aString93 = string_136_;
					((Class7) class7).aString94 = Class173.method1824(class7.aString93, -514633017);
					class7.anInt95 = i_137_ * -129166695;
					class7.aByte97 = i_138_;
					class7.aString96 = string_142_;
					int i_143_;
					for (i_143_ = -1801543887 * Class489.anInt6071 - 1; i_143_ >= 0; i_143_--) {
						int i_144_ = ((Class7) Class82_Sub6.aClass7Array6846[i_143_]).aString94.compareTo(((Class7) class7).aString94);
						if (0 == i_144_) {
							Class82_Sub6.aClass7Array6846[i_143_].anInt95 = -129166695 * i_137_;
							Class82_Sub6.aClass7Array6846[i_143_].aByte97 = i_138_;
							Class82_Sub6.aClass7Array6846[i_143_].aString96 = string_142_;
							if (string_136_.equals(Class287.myPlayer.username))
								Class173.aByte1759 = i_138_;
							client.anInt8912 = client.anInt8933 * 1348241137;
							((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
							return true;
						}
						if (i_144_ < 0) {
							if (i <= -1128197512)
								throw new IllegalStateException();
							break;
						}
					}
					if (-1801543887 * Class489.anInt6071 >= Class82_Sub6.aClass7Array6846.length) {
						((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
						return true;
					}
					for (int i_145_ = -1801543887 * Class489.anInt6071 - 1; i_145_ > i_143_; i_145_--)
						Class82_Sub6.aClass7Array6846[i_145_ + 1] = Class82_Sub6.aClass7Array6846[i_145_];
					if (0 == Class489.anInt6071 * -1801543887)
						Class82_Sub6.aClass7Array6846 = new Class7[100];
					Class82_Sub6.aClass7Array6846[1 + i_143_] = class7;
					Class489.anInt6071 += -1649911343;
					if (string_136_.equals(Class287.myPlayer.username))
						Class173.aByte1759 = i_138_;
				}
				client.anInt8912 = client.anInt8933 * 1348241137;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.SYSTEM_UPDATE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				if (Class299.method3682(client.anInt8752 * -1233866115, 1765230881))
					client.anInt8669 = (int) ((float) stream.readUnsignedShort() * 2.5F) * -2090750423;
				else
					client.anInt8669 = (stream.readUnsignedShort() * 1701996750);
				client.anInt8888 = client.anInt8933 * 1991119277;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.CLAN_CHAT_CHANNEL) {
				client.anInt8886 = -1469951735 * client.anInt8933;
				boolean bool = stream.readUnsignedByte() == 1;
				if (((BufferedConnectionContext) class25).anInt336 * -866602563 == 1) {
					if (bool)
						Class350.primaryChannel = null;
					else
						Class375.visitedChannel = null;
					((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
					return true;
				}
				if (bool)
					Class350.primaryChannel = new ClanChannel(stream);
				else
					Class375.visitedChannel = new ClanChannel(stream);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2237 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_146_ = stream.readUnsignedByte128(-1014855659);
				int i_147_ = stream.readUnsignedShort();
				Class343.method4162(1741117485);
				Class313.method3820(i_147_, i_146_, true, 2135177684);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2184 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int soundId = stream.readUnsignedShort();
				if (65535 == soundId)
					soundId = -1;
				int i_149_ = stream.readUnsignedByte();
				int i_150_ = stream.readUnsignedShort();
				int i_151_ = stream.readUnsignedByte();
				int i_152_ = stream.readUnsignedShort();
				Class320.method3913(soundId, i_149_, i_150_, i_151_, false, i_152_, 1571464629);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2307 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_153_ = stream.readIntV2((byte) 25);
				boolean bool = stream.readUnsignedByte128(-1014855659) == 1;
				if (bool != Class525.aBoolean6300 || i_153_ != Class100.anInt1079 * -1537941929) {
					Class525.aBoolean6300 = bool;
					Class100.anInt1079 = i_153_ * -442700441;
					Class126.method1405(Class502.aClass502_6725, -1, -1, -387034642);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.ICOMPONENT_MODEL_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_154_ = stream.readIntV1(1989852233);
				int i_155_ = stream.readIntV1(1846064867);
				Class343.method4162(1511078955);
				SubIncommingPacket.method1924(i_155_, 1, i_154_, -1, 262144);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2236) {
				int i_156_ = stream.readUnsignedByte();
				int i_157_ = stream.readBigSmart(1235052657);
				if (null != client.aClass299Array8671[i_156_]) {
					client.aClass299Array8671[i_156_].method3677(client.aClass283_8716.method2675(-1611682495), -1127737066);
					client.aClass299Array8671[i_156_] = null;
				}
				if (i_157_ != -1) {
					client.aClass299Array8671[i_156_] = new Class299(Class373.aClass_ra4071, stream, i_157_);
					client.aClass299Array8671[i_156_].method3676(client.aClass283_8716.method2675(-1611682495), 2021897283);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2177) {
				stream.index += -1035394588;
				if (stream.method3615((byte) 83))
					Class249.method2391(stream, (385051775 * stream.index) - 28, (byte) 2);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.SET_MOUSE_PACKET) {
				Class82_Sub6.aString6845 = (-866602563 * ((BufferedConnectionContext) class25).anInt336 > 2 ? stream.readString(-1124509361) : Tradution.aClass470_5854.method6049(Class321.aClass429_3357, -875414210));
				client.anInt8822 = ((((BufferedConnectionContext) class25).anInt336 * -866602563 > 0 ? stream.readUnsignedShort() : -1) * 812630591);
				if (client.anInt8822 * -1471730241 == 65535)
					client.anInt8822 = -812630591;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2160 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_158_ = stream.readUnsigned128Byte((byte) 93);
				int i_159_ = stream.readIntV2((byte) 110);
				int i_160_ = stream.readIntLE(-1787792569);
				int i_161_ = stream.readIntV1(-3791656);
				int i_162_ = stream.readUnsignedShort();
				int i_163_ = stream.readIntV1(293159659);
				int i_164_ = stream.readInt((byte) 52);
				int i_165_ = stream.readUnsignedShortLE((byte) -85);
				Class341 class341 = new Class341(stream.readInt((byte) 122));
				Class343.method4162(1648370068);
				Class113.method1254(i_160_, new Class298_Sub51_Sub4(i_165_, i_158_, new Class400(class341, i_162_)), new int[] { i_161_, i_159_, i_164_, i_163_ }, false, 518456835);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2153 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(1064239302);
				long l = (long) stream.readUnsignedShort();
				long l_166_ = (long) stream.read24BitUnsignedInteger((byte) -89);
				int i_167_ = stream.readUnsignedByte();
				long l_168_ = (l << 32) + l_166_;
				boolean bool_169_ = false;
				Object object = null;
				ClanChannel class298_sub25 = (bool ? Class350.primaryChannel : Class375.visitedChannel);
				while_86_: do {
					if (null == class298_sub25)
						bool_169_ = true;
					else {
						for (int i_170_ = 0; i_170_ < 100; i_170_++) {
							if (client.aLongArray8915[i_170_] == l_168_) {
								bool_169_ = true;
								break while_86_;
							}
						}
						if (i_167_ <= 1) {
							if (client.aBoolean8811 && !client.aBoolean8812 || client.aBoolean8802)
								bool_169_ = true;
							else if (Class287.method2722(string, -1430081758))
								bool_169_ = true;
						}
					}
				} while (false);
				if (!bool_169_) {
					client.aLongArray8915[1594173071 * client.anInt8916] = l_168_;
					client.anInt8916 = ((1 + 1594173071 * client.anInt8916) % 100 * 1356544111);
					String string_171_ = (Class248.decryptStringMessage(Class127_Sub1.huffManDecryption(stream, 406823150), 298199531));
					int i_172_ = bool ? 41 : 44;
					if (2 == i_167_ || i_167_ == 3)
						BufferedConnectionContext.method393(i_172_, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), string, string_171_, class298_sub25.clanName, -1, 1446000206);
					else if (i_167_ == 1)
						BufferedConnectionContext.method393(i_172_, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), string, string_171_, class298_sub25.clanName, -1, 1446000206);
					else
						BufferedConnectionContext.method393(i_172_, 0, string, string, string, string_171_, class298_sub25.clanName, -1, 1446000206);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.ICOMPONENT_SETTINGS_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int settingsHash = stream.readIntV2((byte) 86);
				int icomponentHash = stream.readInt((byte) -5);
				int fromSlot = stream.readUnsignedShort128(62274819);
				if (65535 == fromSlot)
					fromSlot = -1;
				int toSlot = stream.readUnsignedShortLE((byte) 37);
				if (toSlot == 65535)
					toSlot = -1;
				Class343.method4162(1722846425);
				for (int slot = fromSlot; slot <= toSlot; slot++) {
					long l = (long) slot + ((long) icomponentHash << 32);
					IComponentSettings settings = (IComponentSettings) client.aClass437_8896.get(l);
					IComponentSettings newSettings;
					if (settings == null) {
						if (-1 == slot)
							newSettings = new IComponentSettings(settingsHash, ((Class50.getIComponentDefinitions(icomponentHash, (byte) -34).iComponentSettings.anInt7410) * -1133219011));
						else
							newSettings = new IComponentSettings(settingsHash, -1);
					} else {
						newSettings = new IComponentSettings(settingsHash, (-1133219011 * settings.anInt7410));
						settings.unlink(-1460969981);
					}
					client.aClass437_8896.method5817(newSettings, l);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.SEND_FRIEND_QUICK_CHAT_MESSAGE_PACKET) {
				String string = stream.readString(1989805088);
				int i_179_ = stream.readUnsignedShort();
				String string_180_ = Class447.aClass469_5618.method6045(i_179_, (short) -5033).method3459(stream, -734708119);
				BufferedConnectionContext.method393(19, 0, string, string, string, string_180_, null, i_179_, 1446000206);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2223 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_181_ = stream.readIntV1(-337455761);
				Class343.method4162(1843920927);
				if (i_181_ == -1) {
					Class100.anInt1081 = 178575833;
					Class418.anInt5339 = -1001372047;
				} else {
					Class341 class341 = client.aClass283_8716.method2628(681479919);
					int i_182_ = i_181_ >> 14 & 0x3fff;
					int i_183_ = i_181_ & 0x3fff;
					i_182_ -= -1760580017 * class341.gameSceneBaseX;
					if (i_182_ < 0)
						i_182_ = 0;
					else if (i_182_ >= client.aClass283_8716.method2629(-2076483330))
						i_182_ = client.aClass283_8716.method2629(-1922242399);
					i_183_ -= 283514611 * class341.gameSceneBaseY;
					if (i_183_ < 0)
						i_183_ = 0;
					else if (i_183_ >= client.aClass283_8716.method2630(-1784447321))
						i_183_ = client.aClass283_8716.method2630(232319200);
					Class100.anInt1081 = -178575833 * ((i_182_ << 9) + 256);
					Class418.anInt5339 = 1001372047 * (256 + (i_183_ << 9));
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.CONFIG_BY_FILE2_PACKET) {
				int i_184_ = stream.readIntV1(731981095);
				int i_185_ = stream.readUnsignedShort128(692000052);
				Class128.aClass148_6331.setConfigByFileValue(i_185_, i_184_, 1330896239);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2274) {
				int i_186_ = stream.readIntV1(-148644153);
				int i_187_ = stream.readUnsignedShortLE((byte) -123);
				int i_188_ = stream.readUnsignedShortLE128(1478539457);
				Class343.method4162(2059368260);
				Class242.method2269(i_186_, i_187_ + (i_188_ << 16), -1655835904);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2193) {
				Class315.method3834(SubIncommingPacket.aClass206_2354, (short) 16643);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.OBJECT_ANIMATION_PACKET) {
				int animationId = stream.readInt((byte) 57);
				int typeHash = stream.readUnsignedByteC((short) -14009);
				int i_191_ = typeHash >> 2;
				int i_192_ = typeHash & 0x3;
				int i_193_ = client.anIntArray8739[i_191_];
				int locationHash = stream.readIntLE(-1783512122);
				int i_195_ = locationHash >> 28 & 0x3;
				int i_196_ = locationHash >> 14 & 0x3fff;
				int i_197_ = locationHash & 0x3fff;
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				i_196_ -= -1760580017 * class341.gameSceneBaseX;
				i_197_ -= 283514611 * class341.gameSceneBaseY;
				Tradution.method6055(i_195_, i_196_, i_197_, i_193_, i_191_, i_192_, animationId, -1216383524);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.PUBLIC_MESSAGE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_198_ = stream.readUnsignedShort();
				Player class365_sub1_sub1_sub2_sub2;
				if (-442628795 * client.playerIndex == i_198_)
					class365_sub1_sub1_sub2_sub2 = Class287.myPlayer;
				else
					class365_sub1_sub1_sub2_sub2 = (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_198_]);
				if (null == class365_sub1_sub1_sub2_sub2) {
					((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
					return true;
				}
				int i_199_ = stream.readUnsignedShort();
				int rights = stream.readUnsignedByte();
				boolean bool = 0 != (i_199_ & 0x8000);
				if (null != class365_sub1_sub1_sub2_sub2.username && null != class365_sub1_sub1_sub2_sub2.aClass366_10209) {
					boolean bool_201_ = false;
					if (rights != 2) {
						if (!bool && (client.aBoolean8811 && !client.aBoolean8812 || client.aBoolean8802))
							bool_201_ = true;
						else if (Class287.method2722(class365_sub1_sub1_sub2_sub2.username, -1965589466))
							bool_201_ = true;
					}
					if (!bool_201_) {
						int i_202_ = -1;
						String string;
						if (bool) {
							i_199_ &= 0x7fff;
							Class177 class177 = Class498.method6209(stream, (byte) 25);
							i_202_ = -2034569943 * class177.anInt1787;
							string = (class177.aClass298_Sub37_Sub14_1788.method3459(stream, -734708119));
						} else
							string = Class248.decryptStringMessage((Class127_Sub1.huffManDecryption(stream, -1331458039)), -446542687);
						class365_sub1_sub1_sub2_sub2.method4474(string.trim(), i_199_ >> 8, i_199_ & 0xff, 1232670584);
						int i_203_;
						if (rights == 1 || 2 == rights)
							i_203_ = bool ? 17 : 1;
						else
							i_203_ = bool ? 17 : 2;
						if (rights == 2)
							BufferedConnectionContext.method393(i_203_, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(class365_sub1_sub1_sub2_sub2.method4470(true, -1687851032)).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(class365_sub1_sub1_sub2_sub2.method4475(false, (byte) -97)).toString(), class365_sub1_sub1_sub2_sub2.displayName, string, null, i_202_, 1446000206);
						else if (rights == 1)
							BufferedConnectionContext.method393(i_203_, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(class365_sub1_sub1_sub2_sub2.method4470(true, -1640003201)).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(class365_sub1_sub1_sub2_sub2.method4475(false, (byte) -113)).toString(), class365_sub1_sub1_sub2_sub2.displayName, string, null, i_202_, 1446000206);
						else if (rights != 0)
							BufferedConnectionContext.method393(i_203_, 0, "<img=" + rights + ">" + class365_sub1_sub1_sub2_sub2.method4470(true, -1755073777), "<img=" + rights + ">" + class365_sub1_sub1_sub2_sub2.method4475(false, (byte) -103), class365_sub1_sub1_sub2_sub2.displayName, string, null, i_202_, 1446000206);
						else
							BufferedConnectionContext.method393(i_203_, 0, class365_sub1_sub1_sub2_sub2.method4470(true, -1755073777), class365_sub1_sub1_sub2_sub2.method4475(false, (byte) -103), class365_sub1_sub1_sub2_sub2.displayName, string, null, i_202_, 1446000206);
					}
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2298) {
				if (Class452.aBoolean5642 && Class231.aFrame2589 != null)
					Class357.method4276(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7543.method5669((byte) 92), -1, -1, false, 1686359227);
				byte[] is = new byte[((BufferedConnectionContext) class25).anInt336 * -866602563];
				stream.method3662(is, 0, -866602563 * ((BufferedConnectionContext) class25).anInt336, (byte) 1);
				String string = Class52.method556(is, 0, (((BufferedConnectionContext) class25).anInt336 * -866602563), 1174912789);
				String string_204_ = "opensn";
				if (!client.aBoolean8638 || !Class65.method762(string, 1, string_204_, -2024310199))
					Class273.method2559(string, true, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-446024577) == 5, string_204_, client.aBoolean8867, client.aBoolean8651, -1865929375);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2253) {
				int i_205_ = stream.readIntV2((byte) 94);
				int i_206_ = stream.readInt((byte) -79);
				Class343.method4162(1691449694);
				Class298_Sub1.method2846(i_206_, i_205_, (byte) -84);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2178 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class396.method4908(stream.readString(-1156862569), 2117221193);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.HIDE_ICOMPONENT_PACKET) {
				int i_207_ = stream.readIntV2((byte) 86);
				int i_208_ = stream.readUnsignedByte();
				Class343.method4162(1919173680);
				Class491.method6178(i_207_, i_208_, -109953213);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.WORLD_LIST_PACKET) {
				boolean bool = stream.readUnsignedByte() == 1;
				byte[] is = new byte[-866602563 * ((BufferedConnectionContext) class25).anInt336 - 1];
				stream.readBytes(is, 0, -866602563 * ((BufferedConnectionContext) class25).anInt336 - 1, -953523806);
				ConfigDefinitions.method3979(bool, is, 1637029392);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.INTERFACE_PACKET) { // interface
																							// definitions
																							// way
				int interfaceId = stream.readUnsignedShort();
				int key1 = stream.readInt((byte) -24);
				int key2 = stream.readIntV2((byte) 113);
				int parentHash = stream.readIntV1(1955887955);
				int clipped = stream.readUnsignedByte();
				int key4 = stream.readIntV1(1660153737);
				int key3 = stream.readIntV2((byte) 4);
				Class343.method4162(1799178442);
				Class113.method1254(parentHash, new Interface(interfaceId, clipped), new int[] { key1, key2, key3, key4 }, false, -37609880);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.RUN_SCRIPT_PACKET) {
				String string = stream.readString(1468234041);
				Object[] objects = new Object[string.length() + 1];
				for (int i_216_ = string.length() - 1; i_216_ >= 0; i_216_--) {
					if (string.charAt(i_216_) == 's')
						objects[i_216_ + 1] = stream.readString(1977322513);
					else
						objects[i_216_ + 1] = new Integer(stream.readInt((byte) -5));
				}
				objects[0] = new Integer(stream.readInt((byte) 18));
				Class343.method4162(1722404314);
				Script class298_sub46 = new Script();
				class298_sub46.params = objects;

//				ClientScript class298_sub37_sub17 = Class216.getClientScript((Integer) objects[0], (byte) 1);
//				System.out.println("i " + (class298_sub37_sub17.anInt9679 * -1516159487));
//				System.out.println("s " + (class298_sub37_sub17.anInt9680 * 1787035509));
//				System.out.println("l " + (1679522843 * class298_sub37_sub17.anInt9681));

				Class444.method5889(class298_sub46, (byte) 58);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.LOAD_MAP_SCENE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				RsBitsBuffer class298_sub53_sub2_217_ = new RsBitsBuffer(((BufferedConnectionContext) class25).anInt336 * -866602563);
				System.arraycopy((((BufferedConnectionContext) class25).stream.buffer), 385051775 * (((BufferedConnectionContext) class25).stream.index), class298_sub53_sub2_217_.buffer, 0, -866602563 * ((BufferedConnectionContext) class25).anInt336);
				Class119.method1304(1536628978);
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub21_7580.method5703((byte) -123) == 1)
					Class62.aClass248_612.method2385(new Class267(Class266.LOAD_MAP_SCENE_NORMAL, class298_sub53_sub2_217_), 1122139565);
				else
					client.aClass283_8716.sendMapScene(new Class267(Class266.LOAD_MAP_SCENE_NORMAL, class298_sub53_sub2_217_), -1991819579);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return false;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2234) {
				client.anInt8886 = client.anInt8933 * -1469951735;
				boolean bool = stream.readUnsignedByte() == 1;
				Class152 class152 = new Class152(stream);
				ClanChannel class298_sub25;
				if (bool)
					class298_sub25 = Class350.primaryChannel;
				else
					class298_sub25 = Class375.visitedChannel;
				class152.method1651(class298_sub25, (byte) -33);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.LOBBY_LOGOUT_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				// Lobby logout
				Class216.method2001(Class360.aBoolean3912, (byte) 110);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return false;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2212) {
				int i_218_ = stream.readIntLE(-1822549301);
				boolean bool = stream.readUnsigned128Byte((byte) 98) == 1;
				Class343.method4162(1548348256);
				Class95.method1034(i_218_, bool, -928914135);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.RUN_ENERGY_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				client.anInt8844 = stream.readUnsignedByte() * -1985989501;
				client.anInt8888 = client.anInt8933 * 1991119277;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.PLAYER_OPTION_PACKET) {
				int slot = stream.readUnsignedByte128(-1014855659);
				String optionName = stream.readString(446512531);
				int cursor = stream.readUnsignedShortLE128(1478539457);
				if (65535 == cursor)
					cursor = -1;
				int onTop = stream.readUnsignedByteC((short) -24766);
				if (slot >= 1 && slot <= 8) {
					if (optionName.equalsIgnoreCase("null"))
						optionName = null;
					client.aStringArray8820[slot - 1] = optionName;
					client.anIntArray8904[slot - 1] = cursor;
					client.aBooleanArray8821[slot - 1] = 0 == onTop;
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.ITEMS_PACKET) {
				int i_222_ = stream.readUnsignedShort();
				int i_223_ = stream.readUnsignedByte();
				boolean bool = (i_223_ & 0x1) == 1;
				Class293.method2823(i_222_, bool, (byte) 106);
				int i_224_ = stream.readUnsignedShort();
				for (int i_225_ = 0; i_225_ < i_224_; i_225_++) {
					int i_226_ = stream.readUnsignedShortLE128(1478539457);
					int i_227_ = stream.readUnsignedByte128(-1014855659);
					if (i_227_ == 255)
						i_227_ = stream.readIntV1(-228125522);
					Class82_Sub8.method896(i_222_, i_225_, i_226_ - 1, i_227_, bool, 1471693915);
				}
				client.anIntArray8823[(client.anInt8873 += 1524000797) * 1610062389 - 1 & 0x1f] = i_222_;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2217 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class313.anObjectArray3298 = new Object[2143828057 * Class99.aClass517_951.anInt6268];
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.SET_CAMERA_LOOK_PACKET) {
				int viewLocalY = stream.readUnsignedByte128(-1014855659);
				int speed1 = stream.readUnsignedByte();
				int viewLocalX = stream.readUnsignedByteC((short) -4149);
				int speed2 = stream.readUnsignedByte();
				int viewZ = stream.readUnsignedShort128(-638464143) << 2;
				Class343.method4162(1712816736);
				Class173.method1822(viewLocalX, viewLocalY, viewZ, speed1, speed2, (byte) 92);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.RECEIVE_PRIVATE_QUICK_CHAT_MESSAGE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(1572587252);
				String string_233_ = string;
				if (bool)
					string_233_ = stream.readString(-1158716165);
				long l = (long) stream.readUnsignedShort();
				long l_234_ = (long) stream.read24BitUnsignedInteger((byte) -47);
				int rights = stream.readUnsignedByte();
				int i_236_ = stream.readUnsignedShort();
				long l_237_ = l_234_ + (l << 32);
				boolean bool_238_ = false;
				while_87_: do {
					for (int i_239_ = 0; i_239_ < 100; i_239_++) {
						if (client.aLongArray8915[i_239_] == l_237_) {
							bool_238_ = true;
							break while_87_;
						}
					}
					if (rights != 2 && Class287.method2722(string_233_, -1912331316))
						bool_238_ = true;
				} while (false);
				if (!bool_238_) {
					client.aLongArray8915[client.anInt8916 * 1594173071] = l_237_;
					client.anInt8916 = 1356544111 * ((1594173071 * client.anInt8916 + 1) % 100);
					String string_240_ = Class447.aClass469_5618.method6045(i_236_, (short) -8978).method3459(stream, -734708119);
					if (2 == rights)
						BufferedConnectionContext.method393(18, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(string_233_).toString(), string, string_240_, null, i_236_, 1446000206);
					else if (rights == 1)
						BufferedConnectionContext.method393(18, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(string_233_).toString(), string, string_240_, null, i_236_, 1446000206);
					else if (rights != 0)
						BufferedConnectionContext.method393(18, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_233_, string, string_240_, null, i_236_, 1446000206);
					else
						BufferedConnectionContext.method393(18, 0, string, string_233_, string, string_240_, null, i_236_, 1446000206);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2259 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_241_ = stream.readIntV2((byte) 45);
				if (-821031539 * Class384.anInt4128 != i_241_) {
					Class384.anInt4128 = -1704395451 * i_241_;
					Class126.method1405(Class502.aClass502_6723, -1, -1, 459954784);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2293) {
				int i_242_ = stream.readUnsignedShort();
				byte i_243_ = stream.readByte(-12558881);
				if (null == Class313.anObjectArray3298)
					Class313.anObjectArray3298 = (new Object[2143828057 * Class99.aClass517_951.anInt6268]);
				Class313.anObjectArray3298[i_242_] = new Integer(i_243_);
				client.anIntArray8880[((client.anInt8881 += -1965237945) * -1653538697) - 1 & 0x1f] = i_242_;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2249 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int fromSlot = stream.readUnsignedShort128(1746070906);
				if (65535 == fromSlot)
					fromSlot = -1;
				int i_245_ = stream.readUnsignedShort128(351532240);
				int i_246_ = stream.readIntLE(-1871651695);
				int i_247_ = stream.readUnsignedShort128(866146486);
				if (65535 == i_247_)
					i_247_ = -1;
				Class343.method4162(2138875176);
				for (int i_248_ = fromSlot; i_248_ <= i_247_; i_248_++) {
					long l = (long) i_248_ + ((long) i_246_ << 32);
					IComponentSettings class298_sub38 = (IComponentSettings) client.aClass437_8896.get(l);
					IComponentSettings class298_sub38_249_;
					if (class298_sub38 == null) {
						if (i_248_ == -1)
							class298_sub38_249_ = new IComponentSettings(((Class50.getIComponentDefinitions(i_246_, (byte) -9).iComponentSettings.settingsHash) * -1266165749), i_245_);
						else
							class298_sub38_249_ = new IComponentSettings(0, i_245_);
					} else {
						class298_sub38_249_ = new IComponentSettings((-1266165749 * class298_sub38.settingsHash), i_245_);
						class298_sub38.unlink(-1460969981);
					}
					client.aClass437_8896.method5817(class298_sub38_249_, l);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2276 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class162.baseTileX = (stream.readByteC(169252362) << 3) * 1536927433;
				Class375.basePlane = stream.readUnsignedByte() * -1217120325;
				Class216.baseTileY = ((stream.readByteC(-136295651) << 3) * 2091861441);
				while (385051775 * stream.index < ((BufferedConnectionContext) class25).anInt336 * -866602563) {
					SubIncommingPacket class206 = (Class309_Sub1.method3807((byte) -52)[stream.readUnsignedByte()]);
					Class315.method3834(class206, (short) -6953);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2248) {
				int i_250_ = stream.readUnsignedByte();
				Class428 class428 = ((Class428) Class422_Sub20.method5701(Class440.method5861(-810032943), i_250_, (byte) 2));
				if (class428 == null)
					class428 = Class428.aClass428_6619;
				Class386.method4721(class428, (byte) -10);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.MUSIC_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_251_ = stream.readUnsignedByte();
				int i_252_ = stream.readUnsignedShortLE128(1478539457);
				if (i_252_ == 65535)
					i_252_ = -1;
				int i_253_ = stream.readUnsignedByte128(-1014855659);
				Class86.method967(i_252_, i_253_, i_251_, 1756237267);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.SHAKE_CAMERA_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_254_ = stream.readUnsignedByte128(-1014855659);
				int slotId = stream.readUnsignedByte128(-1014855659);
				int i_256_ = stream.readUnsignedByte128(-1014855659);
				int i_257_ = stream.readUnsignedByte128(-1014855659);
				int i_258_ = stream.readUnsignedShortLE((byte) 49);
				Class343.method4162(1754985057);
				client.aBooleanArray8684[slotId] = true;
				client.anIntArray8860[slotId] = i_257_;
				client.anIntArray8925[slotId] = i_256_;
				client.anIntArray8926[slotId] = i_254_;
				client.anIntArray8790[slotId] = i_258_;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2195 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_259_ = stream.readUnsignedByte();
				Class413 class413 = ((Class413) Class422_Sub20.method5701(Class348.method4196(-424264250), i_259_, (byte) 2));
				if (class413 == null)
					class413 = Class413.aClass413_6587;
				Class298_Sub30.method3113(class413, (byte) -102);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.RECEIVE_FRIEND_CHAT_QUICK_MESSAGE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(416848386);
				String string_260_ = string;
				if (bool)
					string_260_ = stream.readString(-151386453);
				long l = stream.readLong((short) 2948);
				long l_261_ = (long) stream.readUnsignedShort();
				long l_262_ = (long) stream.read24BitUnsignedInteger((byte) 50);
				int rights = stream.readUnsignedByte();
				int i_264_ = stream.readUnsignedShort();
				long l_265_ = (l_261_ << 32) + l_262_;
				boolean bool_266_ = false;
				while_88_: do {
					for (int i_267_ = 0; i_267_ < 100; i_267_++) {
						if (l_265_ == client.aLongArray8915[i_267_]) {
							bool_266_ = true;
							break while_88_;
						}
					}
					if (rights != 2 && Class287.method2722(string_260_, -1463632350))
						bool_266_ = true;
				} while (false);
				if (!bool_266_) {
					client.aLongArray8915[1594173071 * client.anInt8916] = l_265_;
					client.anInt8916 = ((client.anInt8916 * 1594173071 + 1) % 100 * 1356544111);
					String string_268_ = Class447.aClass469_5618.method6045(i_264_, (short) -10826).method3459(stream, -734708119);
					if (2 == rights)
						BufferedConnectionContext.method393(20, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(string_260_).toString(), string, string_268_, Class404.method4952(l), i_264_, 1446000206);
					else if (rights == 1)
						BufferedConnectionContext.method393(20, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(string_260_).toString(), string, string_268_, Class404.method4952(l), i_264_, 1446000206);
					else if (rights != 0)
						BufferedConnectionContext.method393(20, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_260_, string, string_268_, Class404.method4952(l), i_264_, 1446000206);
					else
						BufferedConnectionContext.method393(20, 0, string, string_260_, string, string_268_, Class404.method4952(l), i_264_, 1446000206);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2242) {
				boolean bool = stream.readUnsignedByte() == 1;
				Class343.method4162(1490036813);
				Class396.aBoolean5196 = bool;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.FRIENDS_PACKET) {
				while (stream.index * 385051775 < ((BufferedConnectionContext) class25).anInt336 * -866602563) {
					boolean bool = stream.readUnsignedByte() == 1;
					String string = stream.readString(1159315726);
					String string_269_ = stream.readString(1988455124);
					int i_270_ = stream.readUnsignedShort();
					int i_271_ = stream.readUnsignedByte();
					boolean bool_272_ = stream.readUnsignedByte() == 1;
					String string_273_ = "";
					boolean bool_274_ = false;
					if (i_270_ > 0) {
						string_273_ = stream.readString(1917634572);
						bool_274_ = stream.readUnsignedByte() == 1;
					}
					for (int i_275_ = 0; i_275_ < client.anInt8941 * -1054937867; i_275_++) {
						if (!bool) {
							if (string.equals(client.aStringArray8704[i_275_])) {
								if (client.anIntArray8946[i_275_] != i_270_) {
									boolean bool_276_ = true;
									for (Class302_Sub2 class302_sub2 = ((Class302_Sub2) client.aClass442_8951.method5868(-16777216)); null != class302_sub2; class302_sub2 = ((Class302_Sub2) client.aClass442_8951.method5872(269965941))) {
										if (((Class302_Sub2) class302_sub2).aString7648.equals(string)) {
											if (i_270_ != 0 && (((Class302_Sub2) class302_sub2).aShort7646 == 0)) {
												class302_sub2.method3714(185516853);
												bool_276_ = false;
											} else if (i_270_ == 0 && (0 != (((Class302_Sub2) class302_sub2).aShort7646))) {
												class302_sub2.method3714(1336201155);
												bool_276_ = false;
											}
										}
									}
									if (bool_276_)
										client.aClass442_8951.method5870(new Class302_Sub2(string, i_270_), 1940667363);
									client.anIntArray8946[i_275_] = i_270_;
								}
								client.aStringArray8945[i_275_] = string_269_;
								client.aStringArray8947[i_275_] = string_273_;
								client.anIntArray8705[i_275_] = i_271_;
								client.aBooleanArray8722[i_275_] = bool_274_;
								client.aBooleanArray8950[i_275_] = bool_272_;
								string = null;
								break;
							}
						} else if (string_269_.equals(client.aStringArray8704[i_275_])) {
							client.aStringArray8704[i_275_] = string;
							client.aStringArray8945[i_275_] = string_269_;
							string = null;
							break;
						}
					}
					if (string != null && client.anInt8941 * -1054937867 < 200) {
						client.aStringArray8704[-1054937867 * client.anInt8941] = string;
						client.aStringArray8945[-1054937867 * client.anInt8941] = string_269_;
						client.anIntArray8946[-1054937867 * client.anInt8941] = i_270_;
						client.aStringArray8947[client.anInt8941 * -1054937867] = string_273_;
						client.anIntArray8705[-1054937867 * client.anInt8941] = i_271_;
						client.aBooleanArray8722[(-1054937867 * client.anInt8941)] = bool_274_;
						client.aBooleanArray8950[(client.anInt8941 * -1054937867)] = bool_272_;
						client.anInt8941 += 560029533;
					}
				}
				client.anInt8942 = 1353701786;
				client.anInt8883 = 754377557 * client.anInt8933;
				boolean bool = false;
				int i_277_ = -1054937867 * client.anInt8941;
				while_89_: do {
					do {
						if (i_277_ <= 0)
							break while_89_;
						bool = true;
						i_277_--;
						for (int i_278_ = 0; i_278_ < i_277_; i_278_++) {
							boolean bool_279_ = false;
							if ((Class474.aClass471_5979.worldId * 1606920449 != client.anIntArray8946[i_278_]) && ((1606920449 * Class474.aClass471_5979.worldId) == client.anIntArray8946[i_278_ + 1]))
								bool_279_ = true;
							if (!bool_279_ && client.anIntArray8946[i_278_] == 0 && client.anIntArray8946[i_278_ + 1] != 0)
								bool_279_ = true;
							if (!bool_279_ && !client.aBooleanArray8950[i_278_] && client.aBooleanArray8950[1 + i_278_])
								bool_279_ = true;
							if (bool_279_) {
								int i_280_ = client.anIntArray8946[i_278_];
								client.anIntArray8946[i_278_] = client.anIntArray8946[i_278_ + 1];
								client.anIntArray8946[1 + i_278_] = i_280_;
								String string = client.aStringArray8947[i_278_];
								client.aStringArray8947[i_278_] = client.aStringArray8947[i_278_ + 1];
								client.aStringArray8947[1 + i_278_] = string;
								String string_281_ = client.aStringArray8704[i_278_];
								client.aStringArray8704[i_278_] = client.aStringArray8704[i_278_ + 1];
								client.aStringArray8704[1 + i_278_] = string_281_;
								String string_282_ = client.aStringArray8945[i_278_];
								client.aStringArray8945[i_278_] = client.aStringArray8945[1 + i_278_];
								client.aStringArray8945[1 + i_278_] = string_282_;
								int i_283_ = client.anIntArray8705[i_278_];
								client.anIntArray8705[i_278_] = client.anIntArray8705[i_278_ + 1];
								client.anIntArray8705[1 + i_278_] = i_283_;
								boolean bool_284_ = client.aBooleanArray8722[i_278_];
								client.aBooleanArray8722[i_278_] = client.aBooleanArray8722[i_278_ + 1];
								client.aBooleanArray8722[1 + i_278_] = bool_284_;
								boolean bool_285_ = client.aBooleanArray8950[i_278_];
								client.aBooleanArray8950[i_278_] = client.aBooleanArray8950[1 + i_278_];
								client.aBooleanArray8950[1 + i_278_] = bool_285_;
								bool = false;
							}
						}
					} while (!bool);
					if (i <= -1128197512)
						throw new IllegalStateException();
				} while (false);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2283) {
				client.anInt8885 = 887090299 * client.anInt8933;
				boolean bool = stream.readUnsignedByte() == 1;
				if (-866602563 * ((BufferedConnectionContext) class25).anInt336 == 1) {
					if (bool)
						Class225.aClass162_2512 = null;
					else
						Class508.aClass162_6216 = null;
					((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
					return true;
				}
				if (bool)
					Class225.aClass162_2512 = new Class162(stream);
				else
					Class508.aClass162_6216 = new Class162(stream);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.SPAWN_OBJECT_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.SPAWN_OBJECT_PACKET, (short) -2213);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.SET_CAMERA_POS_PACKET) {
				int speed2 = stream.readUnsignedByte128(-1014855659);
				int speed1 = stream.readUnsignedByte128(-1014855659);
				int moveLocalY = stream.readUnsignedByte();
				int moveZ = stream.readUnsignedShort() << 2;
				int moveLocalX = stream.readUnsignedByte();
				Class343.method4162(1925493110);
				Class97_Sub1.method1043(moveLocalX, moveLocalY, moveZ, speed2, speed1, true);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2228 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				if (-1 != client.WINDOW_PANE_ID * -257444687)
					Class82_Sub10.method903(client.WINDOW_PANE_ID * -257444687, 0, 390245730);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2198 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_291_ = stream.readUnsignedShort();
				long l = stream.readLong((short) 19761);
				if (null == Class313.anObjectArray3298)
					Class313.anObjectArray3298 = (new Object[Class99.aClass517_951.anInt6268 * 2143828057]);
				Class313.anObjectArray3298[i_291_] = new Long(l);
				client.anIntArray8880[((client.anInt8881 += -1965237945) * -1653538697) - 1 & 0x1f] = i_291_;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2207 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_292_ = stream.readIntV2((byte) 20);
				int i_293_ = stream.readUnsignedShortLE128(1478539457);
				int i_294_ = stream.readUnsignedByte128(-1014855659);
				int i_295_ = stream.readInt((byte) 94);
				int i_296_ = stream.readUnsignedShortLE128(1478539457);
				int i_297_ = stream.readIntLE(-2033138780);
				int i_298_ = stream.readIntV2((byte) 114);
				int i_299_ = stream.readIntV1(922208794);
				Class343.method4162(1810781923);
				Class113.method1254(i_299_, new Class298_Sub51_Sub2(i_296_, i_294_, i_293_), new int[] { i_292_, i_298_, i_297_, i_295_ }, false, 1697416272);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2239) {
				client.anInt8913 = stream.readUnsigned128Byte((byte) 101) * -1777248765;
				client.anInt8837 = stream.readUnsignedByte() * 1583527743;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2267 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_300_ = stream.readUnsignedShortLE((byte) 10);
				int interfaceHash = stream.readIntV1(-104926142);
				int i_302_ = stream.readInt((byte) 74);
				Class343.method4162(2137201192);
				SubIncommingPacket.method1924(interfaceHash, 5, i_300_, i_302_, 262144);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.CAMERA_ROTATION_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_303_ = stream.readUnsignedShort();
				int i_304_ = stream.readUnsignedShortLE((byte) -3);
				Class343.method4162(2073286157);
				Class344.method4165(i_304_, i_303_, 0, -1627127168);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.SEND_PRIVATE_MESSAGE_PACKET) {
				String string = stream.readString(1394442545);
				String string_305_ = (Class248.decryptStringMessage(Class127_Sub1.huffManDecryption(stream, 1133530682), 882285799));
				Class242_Sub1.method2282(6, 0, string, string, string, string_305_, -109686251);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2299 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_306_ = stream.readUnsignedByte128(-1014855659);
				byte i_307_ = stream.readByteC(1558025285);
				Class343.method4162(1545754039);
				Class239.method2207(i_307_, i_306_, (byte) 59);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.GLOBAL_CONFIG2_PACKET) {
				int i_308_ = stream.readUnsignedShort128(-534917966);
				int i_309_ = stream.readInt((byte) 11);
				Class343.method4162(2060055041);
				Class305.method3752(i_308_, i_309_, 644551429);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2201 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_310_ = stream.readUnsignedShort128(615970463);
				Class343.method4162(2136468444);
				Class285.method2710(i_310_, (byte) 50);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.CONFIG_BY_FILE1_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_311_ = stream.readUnsignedShort128(-1866261395);
				int i_312_ = stream.readUnsignedByteC((short) -13502);
				Class128.aClass148_6331.setConfigByFileValue(i_311_, i_312_, -580939812);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2185) {
				for (int i_313_ = 0; (i_313_ < client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805.length); i_313_++) {
					if (client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_313_] != null) {
						client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_313_].anIntArray10093 = null;
						client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[i_313_].aClass438_10078.method5821(-1, -1564622591);
					}
				}
				for (int i_314_ = 0; i_314_ < client.anInt8772 * 1962237353; i_314_++) {
					((Entity) client.aClass298_Sub29Array8816[i_314_].anObject7366).anIntArray10093 = null;
					((Entity) client.aClass298_Sub29Array8816[i_314_].anObject7366).aClass438_10078.method5821(-1, -2064932982);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2251) {
				int i_315_ = stream.readInt((byte) 69);
				int i_316_ = stream.readInt((byte) -11);
				Class343.method4162(1838306305);
				Interface class298_sub51 = ((Interface) client.aClass437_8841.get((long) i_315_));
				Interface class298_sub51_317_ = ((Interface) client.aClass437_8841.get((long) i_316_));
				if (null != class298_sub51_317_)
					Class173.method1821(class298_sub51_317_, (class298_sub51 == null || ((class298_sub51_317_.interfaceId * -1617025021) != (-1617025021 * class298_sub51.interfaceId))), false, -113822480);
				if (class298_sub51 != null) {
					class298_sub51.unlink(-1460969981);
					client.aClass437_8841.method5817(class298_sub51, (long) i_316_);
				}
				IComponentDefinition class105 = Class50.getIComponentDefinitions(i_315_, (byte) -52);
				if (class105 != null)
					Tradution.method6054(class105, 1086965599);
				class105 = Class50.getIComponentDefinitions(i_316_, (byte) 51);
				if (class105 != null) {
					Tradution.method6054(class105, -904794130);
					Class65.method761((Class389.aClass119Array4165[(-440872681 * class105.anInt1142 >>> 16)]), class105, true, 112223880);
				}
				if (client.WINDOW_PANE_ID * -257444687 != -1)
					Class82_Sub10.method903(client.WINDOW_PANE_ID * -257444687, 1, -167409895);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.TILE_MESSAGE_PACKET) {
				Class315.method3834(SubIncommingPacket.TILE_MESSAGE_PACKET, (short) 15563);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.MUSIC_EFFECT_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_318_ = stream.readUnsigned128Byte((byte) 61);
				int i_319_ = stream.read24BitUnsignedIntegerV2((byte) 8);
				int i_320_ = stream.readUnsignedShort();
				if (i_320_ == 65535)
					i_320_ = -1;
				System.out.println("called: " + i_318_ + ", " + i_319_ + ", " + i_320_);
				Class136.method1495(i_320_, i_319_, i_318_, -649427988);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.GAME_PANE_PACKET) {
				int type = stream.readUnsigned128Byte((byte) 107);
				int windowId = stream.readUnsignedShort128(822482622);
				int secondXteaKey = stream.readIntLE(-1743023788);
				int firstXteaKey = stream.readIntV2((byte) 50);
				int fourthXteaKey = stream.readInt((byte) -102);
				int thirdXteaKey = stream.readInt((byte) -25);
				Class343.method4162(1900966840);
				if (2 == type)
					Class365_Sub1_Sub2_Sub1.method4499((byte) 84);
				int[] keySet = { firstXteaKey, secondXteaKey, thirdXteaKey, fourthXteaKey };
				client.WINDOW_PANE_ID = 1785861201 * windowId;
				Class8.method321(windowId, keySet, 1073572568);
				Class257.method2453(false, (byte) 8);
				Class14.method341(client.WINDOW_PANE_ID * -257444687, keySet, 278724032);
				for (int i_327_ = 0; i_327_ < 113; i_327_++)
					client.aBooleanArray8900[i_327_] = true;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2176) {
				int i_328_ = stream.readUnsignedShort();
				if (65535 == i_328_)
					i_328_ = -1;
				int i_329_ = stream.readUnsignedByte();
				int i_330_ = stream.readUnsignedShort();
				int i_331_ = stream.readUnsignedByte();
				int i_332_ = stream.readUnsignedShort();
				Class239.method2210(i_328_, i_329_, i_330_, i_331_, i_332_, 1530382732);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.ITEMS_UPDATE_PACKET) {
				int key = stream.readUnsignedShort();
				int keyCheck = stream.readUnsignedByte();
				boolean negativekeyCheck = (keyCheck & 0x1) == 1;
				while (385051775 * stream.index < ((BufferedConnectionContext) class25).anInt336 * -866602563) {
					int slotId = stream.readUnsignedSmart(1723054621);
					int id = stream.readUnsignedShort();
					int i_337_ = 0;
					if (0 != id) {
						i_337_ = stream.readUnsignedByte();
						if (255 == i_337_)
							i_337_ = stream.readInt((byte) 3);
					}
					Class82_Sub8.method896(key, slotId, id - 1, i_337_, negativekeyCheck, -540593777);
				}
				client.anIntArray8823[(client.anInt8873 += 1524000797) * 1610062389 - 1 & 0x1f] = key;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2230) {
				int i_338_ = stream.readUnsignedShort128(1639237229);
				int i_339_ = stream.readIntV2((byte) 111);
				Class343.method4162(1587998629);
				Class82_Sub8.method895(i_339_, i_338_, 1883543357);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.GLOBAL_CONFIG1_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				byte i_340_ = stream.readByteC(-112492447);
				int i_341_ = stream.readUnsignedShort128(-40843211);
				Class343.method4162(1542442248);
				Class305.method3752(i_341_, i_340_, 644551429);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2250 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_342_ = stream.readInt((byte) -66);
				Class343.method4162(1629324419);
				SubIncommingPacket.method1924(i_342_, 5, client.playerIndex * -442628795, 0, 262144);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.PLAYER_UNDER_NPC_PRIORITY_PACKET) {
				int i_343_ = stream.readUnsignedByteC((short) -2884);
				Class343.method4162(1810891735);
				client.anInt8903 = i_343_ * -1149402483;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2172) {
				int i_344_ = stream.readIntLE(-1698291810);
				int i_345_ = stream.readUnsignedShort128(-75929984);
				int i_346_ = stream.readUnsignedShort128(-771680618);
				int i_347_ = stream.readUnsignedShortLE((byte) -100);
				Class343.method4162(1819509217);
				Class355.method4265(i_344_, i_347_, i_345_, i_346_, -1411433618);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2290 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_348_ = stream.readUnsignedShortLE128(1478539457);
				int i_349_ = stream.readShort(1694615298);
				int i_350_ = stream.readUnsignedShort128(-1882102994);
				int i_351_ = stream.readByteC(1399907326);
				int i_352_ = stream.readUnsignedByte128(-1014855659);
				if (i_352_ == 255)
					i_352_ = -1;
				int i_353_ = stream.method3651(-1839915924);
				int i_354_ = stream.readUnsignedShort();
				int i_355_ = stream.readUnsigned128Byte((byte) 14) * 4;
				int i_356_ = stream.readUnsignedByte();
				int i_357_ = stream.readUnsignedShort128(-931118162);
				int i_358_ = stream.readUnsigned128Byte((byte) 17);
				int i_359_ = stream.readUnsignedShort128(-643251199);
				int i_360_ = stream.readUnsignedShort();
				int i_361_ = stream.readByteC(263654343);
				boolean bool = 0 != (i_356_ & 0x1);
				boolean bool_362_ = (i_356_ & 0x2) != 0;
				int i_363_ = bool_362_ ? i_356_ >> 2 : -1;
				if (bool_362_)
					i_358_ = (byte) i_358_;
				else
					i_358_ *= 4;
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				int i_364_ = i_354_ - class341.gameSceneBaseX * 773807262;
				int i_365_ = i_357_ - 567029222 * class341.gameSceneBaseY;
				i_351_ += i_364_;
				i_361_ += i_365_;
				if (i_364_ >= 0 && i_365_ >= 0 && (i_364_ < client.aClass283_8716.method2629(-1911669738) * 2) && (i_365_ < client.aClass283_8716.method2629(-1992464171) * 2) && i_351_ >= 0 && i_361_ >= 0 && (i_351_ < client.aClass283_8716.method2630(-2022476058) * 2) && (i_361_ < client.aClass283_8716.method2630(1563119067) * 2) && 65535 != i_348_) {
					i_364_ *= 256;
					i_365_ *= 256;
					i_351_ = 256 * i_351_;
					i_361_ = 256 * i_361_;
					i_358_ <<= 2;
					i_355_ <<= 2;
					i_350_ <<= 2;
					HashTable.method5818(i_348_, i_349_, i_353_, i_363_, i_358_, i_355_, i_364_, i_365_, i_351_, i_361_, i_360_, i_359_, i_352_, i_350_, bool, 2141342802);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.RESET_SOUNDS_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class422.method5617((byte) -98);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.RECEIVE_PERSONAL_MESSAGE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(-1519760350);
				String string_366_ = string;
				if (bool)
					string_366_ = stream.readString(1241788566);
				int rights = stream.readUnsignedByte();
				boolean bool_368_ = false;
				if (rights != 2) {
					if (client.aBoolean8811 && !client.aBoolean8812 || client.aBoolean8802)
						bool_368_ = true;
					else if (rights != 2 && Class287.method2722(string_366_, -1379408074))
						bool_368_ = true;
				}
				if (!bool_368_) {
					String string_369_ = (Class248.decryptStringMessage(Class127_Sub1.huffManDecryption(stream, 1427185881), 1705296480));
					if (2 == rights)
						BufferedConnectionContext.method393(24, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(string_366_).toString(), string, string_369_, null, -1, 1446000206);
					else if (rights == 1)
						BufferedConnectionContext.method393(24, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(string_366_).toString(), string, string_369_, null, -1, 1446000206);
					else if (rights != 0)
						BufferedConnectionContext.method393(24, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_366_, string, string_369_, null, -1, 1446000206);
					else
						BufferedConnectionContext.method393(24, 0, string, string_366_, string, string_369_, null, -1, 1446000206);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.NPC_UPDATE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class406.decodeNPCUpdate(false, -1542019143);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2272) {
				int i_370_ = stream.readIntV2((byte) 74);
				int i_371_ = stream.readIntV1(-453095803);
				Class343.method4162(1793904328);
				Class494.method6193(i_371_, i_370_, -1060655592);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2168) {
				// Probably some chat packet?
				client.anInt8942 = -1470632755;
				client.anInt8883 = client.anInt8933 * 754377557;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.LOGOUT_PACKET) {
				Class216.method2001(false, (byte) 107);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return false;
			}
			if (IncommingPacket.aClass202_2179 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_372_ = stream.readUnsignedShortLE((byte) -26);
				int i_373_ = stream.readIntV1(716816642);
				int i_374_ = stream.readUnsignedShortLE128(1478539457);
				int i_375_ = stream.readUnsignedByte();
				Class343.method4162(1544492012);
				Class237.method2198(i_373_, i_375_, i_372_, i_374_, (short) -8450);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2297 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				client.aBoolean8815 = stream.readUnsignedByteC((short) -6905) == 1;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2221 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_376_ = stream.readUnsignedShort();
				int i_377_ = stream.readIntV2((byte) 112);
				int i_378_ = stream.readUnsignedShortLE((byte) -41);
				int i_379_ = stream.readUnsignedByte128(-1014855659);
				Class343.method4162(1863986418);
				Class82_Sub20.method935(i_377_, i_379_, i_378_, i_376_, 1382023549);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.SEND_GROUND_ITEM_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.SEND_GROUND_ITEM_PACKET, (short) 18993);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.CUTSCENE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_380_ = stream.readUnsignedShort();
				client.anInt8726 = 733205975;
				client.anInt8870 = 221729505 * i_380_;
				client.anInt8724 = 986798515;
				Class399.aClass243_5220.method2310(577335585 * client.anInt8870, -457216440);
				Class194.method1868(2025307040);
				Class98_Sub2.method1065((byte) 74);
				int i_381_ = stream.readUnsignedShort();
				Class298_Sub37.anIntArrayArray7407 = new int[i_381_][4];
				for (int i_382_ = 0; i_382_ < i_381_; i_382_++) {
					for (int i_383_ = 0; i_383_ < 4; i_383_++)
						Class298_Sub37.anIntArrayArray7407[i_382_][i_383_] = stream.readInt((byte) 32);
				}
				int i_384_ = stream.readUnsignedByte();
				Class128_Sub1.aClass298_Sub53_8555 = new RsByteBuffer(i_384_);
				Class128_Sub1.aClass298_Sub53_8555.writeBytes(stream.buffer, 385051775 * stream.index, i_384_, (short) -25177);
				stream.index += i_384_ * 116413311;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return false;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.DESTROY_OBJECT_PACKET) {
				Class315.method3834(SubIncommingPacket.DESTROY_OBJECT_PACKET, (short) -19172);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2203 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_385_ = stream.readUnsignedByte();
				if (stream.readUnsignedByte() == 0)
					client.aClass251Array8920[i_385_] = new Class251();
				else {
					stream.index -= 116413311;
					client.aClass251Array8920[i_385_] = new Class251(stream);
				}
				client.anInt8796 = client.anInt8933 * 1729482221;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.ITEM_ON_ICOMPONENT_PACKET) {
				int i_386_ = stream.readUnsignedShort128(-666448295);
				if (65535 == i_386_)
					i_386_ = -1;
				int i_387_ = stream.readIntV1(-731950816);
				int i_388_ = stream.readIntV2((byte) 47);
				Class343.method4162(1742484303);
				RsByteBuffer.method3656(i_388_, i_386_, i_387_, (short) 1020);
				ItemDefinitions class468 = Class298_Sub32_Sub14.aClass477_9400.getItemDefinitions(i_386_);
				Class355.method4265(i_388_, 330519029 * class468.anInt5714, -3355859 * class468.anInt5715, class468.anInt5713 * 1396167403, -1121225747);
				Class253.method2422(i_388_, 252709809 * class468.anInt5717, -1811316489 * class468.anInt5718, class468.anInt5716 * -1368639199, 499708204);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2191 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_389_ = stream.readIntLE(-2128346216);
				int i_390_ = stream.readUnsignedShortLE128(1478539457);
				Class343.method4162(2079015348);
				Class112.method1244(i_389_, i_390_, (byte) -47);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2231 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.aClass206_2346, (short) 9490);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2284 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.aClass206_2357, (short) 18359);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2271) {
				int i_391_ = stream.readInt((byte) -35);
				int i_392_ = stream.readIntV2((byte) 14);
				Class343.method4162(1466518715);
				Class108.method1152(i_392_, i_391_, -314450920);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.CLIENT_CONSOLE_COMMAND_PACKET) {
				String string = stream.readString(1645493685);
				Class419.method5605(string, false, false, 1722466628);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.ICOMPONENT_TEXT_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				String string = stream.readString(-1785786498);
				int i_393_ = stream.readInt((byte) 115);
				Class343.method4162(1866229286);
				Class98.method1058(i_393_, string, (byte) 66);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.RECEIVE_QUICK_PRIVATE_MESSAGE) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(-247712899);
				long l = (long) stream.readUnsignedShort();
				long l_394_ = (long) stream.read24BitUnsignedInteger((byte) -13);
				int rights = stream.readUnsignedByte();
				int i_396_ = stream.readUnsignedShort();
				long l_397_ = (l << 32) + l_394_;
				boolean bool_398_ = false;
				Object object = null;
				ClanChannel class298_sub25 = (bool ? Class350.primaryChannel : Class375.visitedChannel);
				while_90_: do {
					if (class298_sub25 == null)
						bool_398_ = true;
					else {
						for (int i_399_ = 0; i_399_ < 100; i_399_++) {
							if (l_397_ == client.aLongArray8915[i_399_]) {
								bool_398_ = true;
								break while_90_;
							}
						}
						if (rights != 2 && Class287.method2722(string, -1151281576))
							bool_398_ = true;
					}
				} while (false);
				if (!bool_398_) {
					client.aLongArray8915[1594173071 * client.anInt8916] = l_397_;
					client.anInt8916 = ((1594173071 * client.anInt8916 + 1) % 100 * 1356544111);
					String string_400_ = Class447.aClass469_5618.method6045(i_396_, (short) -926).method3459(stream, -734708119);
					int i_401_ = bool ? 42 : 45;
					if (rights == 2 || 3 == rights)
						BufferedConnectionContext.method393(i_401_, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), string, string_400_, class298_sub25.clanName, i_396_, 1446000206);
					else if (1 == rights)
						BufferedConnectionContext.method393(i_401_, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), string, string_400_, class298_sub25.clanName, i_396_, 1446000206);
					else if (rights != 0)
						BufferedConnectionContext.method393(i_401_, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string, string, string_400_, class298_sub25.clanName, i_396_, 1446000206);
					else
						BufferedConnectionContext.method393(i_401_, 0, string, string, string, string_400_, class298_sub25.clanName, i_396_, 1446000206);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2174 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(-862055008);
				String string_402_ = string;
				if (bool)
					string_402_ = stream.readString(-2118001006);
				int i_403_ = stream.readUnsignedByte();
				int i_404_ = stream.readUnsignedShort();
				boolean bool_405_ = false;
				if (i_403_ <= 1 && Class287.method2722(string_402_, -1454768672))
					bool_405_ = true;
				if (!bool_405_) {
					String string_406_ = Class447.aClass469_5618.method6045(i_404_, (short) -11547).method3459(stream, -734708119);
					if (2 == i_403_)
						BufferedConnectionContext.method393(25, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(string_402_).toString(), string, string_406_, null, i_404_, 1446000206);
					else if (1 == i_403_)
						BufferedConnectionContext.method393(25, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(string_402_).toString(), string, string_406_, null, i_404_, 1446000206);
					else
						BufferedConnectionContext.method393(25, 0, string, string_402_, string, string_406_, null, i_404_, 1446000206);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.SOUND_INDEX15) {
				int soundId = stream.readUnsignedShort();
				if (soundId == 65535)
					soundId = -1;
				int i_408_ = stream.readUnsignedByte();
				int i_409_ = stream.readUnsignedShort();
				int i_410_ = stream.readUnsignedByte();
				Class320.method3913(soundId, i_408_, i_409_, i_410_, true, 256, 2006173434);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2305 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.aClass206_2356, (short) -5340);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2163) {
				int i_411_ = stream.readUnsignedByte128(-1014855659);
				int i_412_ = stream.readUnsignedByte128(-1014855659);
				if (i_412_ == 255) {
					i_412_ = -1;
					i_411_ = -1;
				}
				Class372_Sub1.method4596(i_412_, i_411_, 1367458334);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.REMOVE_GROUND_ITEM_PACKET) {
				Class315.method3834(SubIncommingPacket.REMOVE_GROUND_ITEM_PACKET, (short) 8251);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2232) {
				int i_413_ = stream.readInt((byte) -19);
				int i_414_ = stream.readInt((byte) -1);
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.aClass198_1998, class25.aClass449_330, (byte) 120);
				class298_sub36.aClass298_Sub53_Sub2_7396.write128Byte(914379507 * client.anInt6467, (byte) 1);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeInt(i_413_, 390381879);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeIntV1(i_414_, (byte) -42);
				class25.method390(class298_sub36, (byte) -114);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_1900 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {// interface
																							// defs?
				int toSlot = stream.readUnsignedShort128(-529654569);
				int firstXtea = stream.readInt((byte) 18);
				int fromSlot = stream.readUnsignedShort128(-680257970);
				int thirdXtea = stream.readIntV1(2002579136);
				int interfaceId = stream.readIntV2((byte) 1);
				int clipped = stream.readUnsigned128Byte((byte) 98);
				//System.out.println(clipped);
				int secondXtea = stream.readIntV2((byte) 63);
				int fourthXtea = stream.readIntV1(200309251);
				Class343.method4162(1675842876);
				Class113.method1254(interfaceId, new Class298_Sub51_Sub1(fromSlot, clipped, toSlot), new int[] { firstXtea, secondXtea, thirdXtea, fourthXtea }, false, -983354204);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.SECURITY_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class273.method2566(stream, ((BufferedConnectionContext) class25).anInt336 * -866602563, (byte) -111);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2154) {// emote
				int[] is = new int[Class522.method6325((byte) -31).length];
				for (int i_423_ = 0; i_423_ < Class522.method6325((byte) -48).length; i_423_++)
					is[i_423_] = stream.readInt((byte) -69);
				int i_424_ = stream.readUnsignedByte();
				int i_425_ = stream.readUnsignedShort();
				Class298_Sub29 class298_sub29 = ((Class298_Sub29) client.npcs.get((long) i_425_));
				if (class298_sub29 != null)
					Class431.method5768(((Entity) class298_sub29.anObject7366), is, i_424_, true, (byte) -7);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2220 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class216.baseTileY = ((stream.read128Byte(1269677513) << 3) * 2091861441);
				Class375.basePlane = stream.readUnsigned128Byte((byte) 40) * -1217120325;
				Class162.baseTileX = (stream.readByteC(188175247) << 3) * 1536927433;
				Class341 class341 = client.aClass283_8716.method2628(681479919);
				for (Class298_Sub2 class298_sub2 = ((Class298_Sub2) client.groundItems.method5816(1564654282)); class298_sub2 != null; class298_sub2 = ((Class298_Sub2) client.groundItems.method5815((byte) 10))) {
					int i_426_ = (int) ((class298_sub2.linkedKey * 7051297995265073167L) >> 28 & 0x3L);
					int i_427_ = (int) (7051297995265073167L * class298_sub2.linkedKey & 0x3fffL);
					int i_428_ = i_427_ - -1760580017 * class341.gameSceneBaseX;
					int i_429_ = (int) ((7051297995265073167L * class298_sub2.linkedKey) >> 14 & 0x3fffL);
					int i_430_ = i_429_ - 283514611 * class341.gameSceneBaseY;
					if (i_426_ == Class375.basePlane * -191892109 && i_428_ >= 134435705 * Class162.baseTileX && i_428_ < 8 + 134435705 * Class162.baseTileX && i_430_ >= -105526719 * Class216.baseTileY && i_430_ < 8 + Class216.baseTileY * -105526719) {
						class298_sub2.unlink(-1460969981);
						if (i_428_ >= 0 && i_430_ >= 0 && i_428_ < client.aClass283_8716.method2629(-2088487368) && i_430_ < client.aClass283_8716.method2630(1377874440))
							Class173.method1820((Class375.basePlane * -191892109), i_428_, i_430_, 1641680263);
					}
				}
				for (Class298_Sub1 class298_sub1 = (Class298_Sub1) Class298_Sub1.aClass453_7152.method5939(1766612795); class298_sub1 != null; class298_sub1 = ((Class298_Sub1) Class298_Sub1.aClass453_7152.method5944(49146))) {
					if ((class298_sub1.anInt7150 * 634196087 >= 134435705 * Class162.baseTileX) && (634196087 * class298_sub1.anInt7150 < 8 + 134435705 * Class162.baseTileX) && (-2146829167 * class298_sub1.anInt7155 >= -105526719 * Class216.baseTileY) && (-2146829167 * class298_sub1.anInt7155 < Class216.baseTileY * -105526719 + 8) && (((Class298_Sub1) class298_sub1).anInt7151 * 2108312995) == -191892109 * Class375.basePlane)
						((Class298_Sub1) class298_sub1).aBoolean7160 = true;
				}
				for (Class298_Sub1 class298_sub1 = (Class298_Sub1) Class298_Sub1.aClass453_7162.method5939(1766612795); null != class298_sub1; class298_sub1 = ((Class298_Sub1) Class298_Sub1.aClass453_7162.method5944(49146))) {
					if ((634196087 * class298_sub1.anInt7150 >= 134435705 * Class162.baseTileX) && (634196087 * class298_sub1.anInt7150 < Class162.baseTileX * 134435705 + 8) && (class298_sub1.anInt7155 * -2146829167 >= -105526719 * Class216.baseTileY) && (class298_sub1.anInt7155 * -2146829167 < -105526719 * Class216.baseTileY + 8) && ((2108312995 * ((Class298_Sub1) class298_sub1).anInt7151) == -191892109 * Class375.basePlane))
						((Class298_Sub1) class298_sub1).aBoolean7160 = true;
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.GLOBAL_STRING_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_431_ = stream.readUnsignedShort();
				String string = stream.readString(975296122);
				Class343.method4162(1777124419);
				Class501.method6230(i_431_, string, -2125607456);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.STOP_CAMERA_SHAKE_PACKET) {
				Class343.method4162(1929183255);
				Class82_Sub11.method906(-1060675118);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2227) {
				int i_432_ = stream.readUnsignedShort();
				int i_433_ = stream.readUnsignedShort();
				int i_434_ = stream.readUnsignedShort();
				Class343.method4162(1555900413);
				if (Class389.aClass119Array4165[i_432_] != null) {
					for (int i_435_ = i_433_; i_435_ < i_434_; i_435_++) {
						int i_436_ = stream.read24BitUnsignedInteger((byte) -1);
						if (i_435_ < (Class389.aClass119Array4165[i_432_].aClass105Array1405).length && (Class389.aClass119Array4165[i_432_].aClass105Array1405[i_435_]) != null)
							Class389.aClass119Array4165[i_432_].aClass105Array1405[i_435_].anInt1141 = i_436_ * -177949397;
					}
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.SWITCH_ITEMS_LOOK_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Loader.DEVELOPER_CONSOLE_COLOR = stream.readInt((byte) 0);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.WORLD_TILE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class216.baseTileY = (stream.readByte128((byte) -8) << 3) * 2091861441;
				Class375.basePlane = (stream.readUnsignedByteC((short) -28965) * -1217120325);
				Class162.baseTileX = ((stream.read128Byte(-1150117384) << 3) * 1536927433);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2188) {
				int i_437_ = stream.readUnsignedShort();
				int i_438_ = stream.readInt((byte) -116);
				if (Class313.anObjectArray3298 == null)
					Class313.anObjectArray3298 = (new Object[Class99.aClass517_951.anInt6268 * 2143828057]);
				Class313.anObjectArray3298[i_437_] = new Integer(i_438_);
				client.anIntArray8880[((client.anInt8881 += -1965237945) * -1653538697) - 1 & 0x1f] = i_437_;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2158 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				// seems to switch world
				int i_439_ = stream.readUnsignedShort();
				String string = stream.readString(-2100646019);
				boolean bool = stream.readUnsignedByte() == 1;
				Class474.aClass471_5972 = Class474.aClass471_5979;
				Class474.aBoolean5973 = bool;
				Class372.method4589(i_439_, string, 955770805);
				Object object = null;
				Class439.method5851(13, 1140359625);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return false;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.SKILL_LEVEL_PACKET) {
				int skillId = stream.readUnsigned128Byte((byte) 17);
				int xp = stream.readInt((byte) 78);
				int level = stream.readUnsignedByte128(-1014855659);
				client.anIntArray8829[skillId] = xp;
				client.anIntArray8924[skillId] = level;
				client.anIntArray8828[skillId] = 1;
				int i_443_ = Class368.anIntArray4002[skillId] - 1;
				for (int i_444_ = 0; i_444_ < i_443_; i_444_++) {
					if (xp >= Class368.anIntArray4003[i_444_])
						client.anIntArray8828[skillId] = 2 + i_444_;
				}
				client.anIntArray8833[(client.anInt8875 += 1972492301) * -1048955195 - 1 & 0x1f] = skillId;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.FRIENDS_CHAT_CHANNEL_PACKET) {
				client.anInt8912 = 1348241137 * client.anInt8933;
				if (((BufferedConnectionContext) class25).anInt336 * -866602563 == 0) {
					client.aString8804 = null;
					client.aString8919 = null;
					Class489.anInt6071 = 0;
					Class82_Sub6.aClass7Array6846 = null;
					((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
					return true;
				}
				client.aString8919 = stream.readString(2105595106);
				boolean bool = stream.readUnsignedByte() == 1;
				if (bool)
					stream.readString(-124470201);
				long l = stream.readLong((short) 6221);
				client.aString8804 = Class377.method4664(l);
				Class514.aByte6228 = stream.readByte(-12558881);
				int i_445_ = stream.readUnsignedByte();
				if (255 == i_445_) {
					((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
					return true;
				}
				Class489.anInt6071 = -1649911343 * i_445_;
				Class7[] class7s = new Class7[100];
				for (int i_446_ = 0; i_446_ < Class489.anInt6071 * -1801543887; i_446_++) {
					class7s[i_446_] = new Class7();
					class7s[i_446_].aString92 = stream.readString(403996572);
					bool = stream.readUnsignedByte() == 1;
					if (bool)
						class7s[i_446_].aString93 = stream.readString(1553463180);
					else
						class7s[i_446_].aString93 = class7s[i_446_].aString92;
					((Class7) class7s[i_446_]).aString94 = Class173.method1824(class7s[i_446_].aString93, 445649895);
					class7s[i_446_].anInt95 = (stream.readUnsignedShort() * -129166695);
					class7s[i_446_].aByte97 = stream.readByte(-12558881);
					class7s[i_446_].aString96 = stream.readString(-1930467617);
					if (class7s[i_446_].aString93.equals(Class287.myPlayer.username))
						Class173.aByte1759 = class7s[i_446_].aByte97;
				}
				boolean bool_447_ = false;
				int i_448_ = Class489.anInt6071 * -1801543887;
				while_91_: do {
					do {
						if (i_448_ <= 0)
							break while_91_;
						bool_447_ = true;
						i_448_--;
						for (int i_449_ = 0; i_449_ < i_448_; i_449_++) {
							if ((((Class7) class7s[i_449_]).aString94.compareTo(((Class7) class7s[1 + i_449_]).aString94)) > 0) {
								Class7 class7 = class7s[i_449_];
								class7s[i_449_] = class7s[1 + i_449_];
								class7s[1 + i_449_] = class7;
								bool_447_ = false;
							}
						}
					} while (!bool_447_);
					if (i <= -1128197512)
						throw new IllegalStateException();
				} while (false);
				Class82_Sub6.aClass7Array6846 = class7s;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.LARGE_NPC_UPDATE_PACKET) {
				Class406.decodeNPCUpdate(true, -1463103982);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.RESET_CAMERA_PACKET) {
				Class343.method4162(1464854077);
				Class_na.method3478(-2144902476);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.HINT_ICON_PACKET) {
				int i_450_ = stream.readUnsignedByte();
				int i_451_ = i_450_ >> 5;
				int i_452_ = i_450_ & 0x1f;
				if (0 == i_452_) {
					client.aClass19Array8869[i_451_] = null;
					((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
					return true;
				}
				Class19 class19 = new Class19();
				class19.anInt266 = 1231457277 * i_452_;
				((Class19) class19).anInt258 = stream.readUnsignedByte() * -1078964265;
				if (((Class19) class19).anInt258 * -92466201 >= 0 && (((Class19) class19).anInt258 * -92466201 < Class128_Sub2.aClass57Array8560.length)) {
					if (class19.anInt266 * 958933333 == 1 || 10 == class19.anInt266 * 958933333) {
						class19.anInt256 = (stream.readUnsignedShort() * 1626935871);
						((Class19) class19).anInt265 = (stream.readUnsignedShort() * -571637617);
						stream.index += 465653244;
					} else if (class19.anInt266 * 958933333 >= 2 && class19.anInt266 * 958933333 <= 6) {
						if (958933333 * class19.anInt266 == 2) {
							class19.anInt260 = 1513435904;
							class19.anInt261 = -1303452928;
						}
						if (3 == 958933333 * class19.anInt266) {
							class19.anInt260 = 0;
							class19.anInt261 = -1303452928;
						}
						if (958933333 * class19.anInt266 == 4) {
							class19.anInt260 = -1268095488;
							class19.anInt261 = -1303452928;
						}
						if (5 == 958933333 * class19.anInt266) {
							class19.anInt260 = 1513435904;
							class19.anInt261 = 0;
						}
						if (class19.anInt266 * 958933333 == 6) {
							class19.anInt260 = 1513435904;
							class19.anInt261 = 1688061440;
						}
						class19.anInt266 = -1832052742;
						((Class19) class19).anInt259 = (stream.readUnsignedByte() * -1962848411);
						Class341 class341 = client.aClass283_8716.method2628(681479919);
						class19.anInt260 += ((stream.readUnsignedShort() - -1760580017 * class341.gameSceneBaseX) << 9) * 962213171;
						class19.anInt261 += ((stream.readUnsignedShort() - class341.gameSceneBaseY * 283514611) << 9) * 313675491;
						((Class19) class19).anInt262 = ((stream.readUnsignedByte() << 2) * -2098711205);
						class19.anInt257 = (stream.readUnsignedShort() * -1670140163);
					}
					class19.anInt263 = (stream.readInt((byte) -34) * -698073157);
					client.aClass19Array8869[i_451_] = class19;
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.PLAYER_ON_ICOMPONENT_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_453_ = stream.readIntV2((byte) 99);
				Class343.method4162(1945510464);
				SubIncommingPacket.method1924(i_453_, 3, client.playerIndex * -442628795, 0, 262144);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.BLACK_OUT_PACKET) {
				Class3.anInt56 = stream.readUnsignedByte() * -986054733;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2247 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_454_ = stream.readUnsignedShort();
				String string = stream.readString(-1175861112);
				if (null == Class313.anObjectArray3298)
					Class313.anObjectArray3298 = (new Object[2143828057 * Class99.aClass517_951.anInt6268]);
				Class313.anObjectArray3298[i_454_] = string;
				client.anIntArray8880[((client.anInt8881 += -1965237945) * -1653538697) - 1 & 0x1f] = i_454_;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.LOAD_MAP_SCENE_DYNAMIC_PACKET) {
				RsBitsBuffer class298_sub53_sub2_455_ = new RsBitsBuffer(((BufferedConnectionContext) class25).anInt336 * -866602563);
				System.arraycopy((((BufferedConnectionContext) class25).stream.buffer), (((BufferedConnectionContext) class25).stream.index) * 385051775, class298_sub53_sub2_455_.buffer, 0, ((BufferedConnectionContext) class25).anInt336 * -866602563);
				Class119.method1304(1849823335);
				if (Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub21_7580.method5703((byte) -70) == 1)
					Class62.aClass248_612.method2385(new Class267(Class266.LOAD_MAP_SCENE_DYNAMIC, class298_sub53_sub2_455_), 1563574437);
				else
					client.aClass283_8716.sendMapScene(new Class267(Class266.LOAD_MAP_SCENE_DYNAMIC, class298_sub53_sub2_455_), -1991819579);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return false;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2306) {
				int i_456_ = stream.readUnsignedShort128(-739582411);
				int i_457_ = stream.readUnsigned128Byte((byte) 91);
				boolean bool = (i_457_ & 0x1) == 1;
				Class197.method1888(i_456_, bool, 1659854875);
				client.anIntArray8823[(client.anInt8873 += 1524000797) * 1610062389 - 1 & 0x1f] = i_456_;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2194 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_458_ = stream.readInt((byte) 30);
				int i_459_ = stream.readUnsignedByte128(-1014855659);
				int i_460_ = stream.readInt((byte) 38);
				int i_461_ = stream.readUnsignedByte();
				int i_462_ = stream.readUnsignedByteC((short) -2008);
				int i_463_ = i_460_ >> 28;
				int i_464_ = i_460_ >> 14 & 0x3fff;
				int i_465_ = i_460_ & 0x3fff;
				Class426.method5743(i_463_, i_464_, i_465_, i_459_, i_462_, i_458_, i_461_, 2105013784);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2215 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.aClass206_2343, (short) 17513);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2287 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.aClass206_2348, (short) 10101);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.OPEN_URL_PACKET) {
				if (Class452.aBoolean5642 && Class231.aFrame2589 != null)
					Class357.method4276(Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub12_7543.method5669((byte) 42), -1, -1, false, -1432148158);
				byte[] is = new byte[((BufferedConnectionContext) class25).anInt336 * -866602563 - 1];
				boolean bool = stream.readUnsignedByte() == 1;
				stream.method3662(is, 0, (((BufferedConnectionContext) class25).anInt336 * -866602563) - 1, (byte) 1);
				RsByteBuffer class298_sub53 = new RsByteBuffer(is);
				String string = class298_sub53.readString(799488751);
				if (bool) {
					String string_466_ = class298_sub53.readString(403182631);
					if (string_466_.length() == 0)
						string_466_ = string;
					if (!client.aBoolean8638 || Class82_Sub8.aString6856.startsWith("mac") || !Class65.method762(string, 1, Class212.aClass212_2424.method1951(-1209858466), -1999887910))
						Class346.method4172(string_466_, true, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-2008340671) == 5, client.aBoolean8867, client.aBoolean8651, (byte) 13);
				} else
					Class346.method4172(string, true, Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub14_7571.method5677(-389602471) == 5, client.aBoolean8867, client.aBoolean8651, (byte) 54);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.CONFIG2_PACKET) {
				int configId = stream.readUnsignedShort128(2011852017);
				int value = stream.readIntLE(-1991182834);
				Class128.aClass148_6331.method1605(configId, value, (byte) 35);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2238 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_469_ = stream.readUnsignedShortLE((byte) -12);
				int i_470_ = stream.readUnsignedShort128(-382838124);
				int i_471_ = stream.readIntV1(1708571253);
				int i_472_ = stream.readUnsignedShort();
				Class343.method4162(1927580267);
				SubIncommingPacket.method1924(i_471_, 7, i_470_ << 16 | i_469_, i_472_, 262144);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.PLAYER_UPDATE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class247.decodePlayerUpdate(stream, ((BufferedConnectionContext) class25).anInt336 * -866602563, 1110385787);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.PROJECTILE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.PROJECTILE_PACKET, (short) -13236);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.RECEIVE_FRIEND_CHAT_MESSAGE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(-2047466585);
				String string_473_ = string;
				if (bool)
					string_473_ = stream.readString(-378419431);
				long l = stream.readLong((short) 19447);
				long l_474_ = (long) stream.readUnsignedShort();
				long l_475_ = (long) stream.read24BitUnsignedInteger((byte) 5);
				int rights = stream.readUnsignedByte();
				long l_477_ = l_475_ + (l_474_ << 32);
				boolean bool_478_ = false;
				while_92_: do {
					for (int i_479_ = 0; i_479_ < 100; i_479_++) {
						if (l_477_ == client.aLongArray8915[i_479_]) {
							bool_478_ = true;
							break while_92_;
						}
					}
					if (rights != 2) {
						if (client.aBoolean8811 && !client.aBoolean8812 || client.aBoolean8802)
							bool_478_ = true;
						else if (Class287.method2722(string_473_, -991136791))
							bool_478_ = true;
					}
				} while (false);
				if (!bool_478_) {
					client.aLongArray8915[1594173071 * client.anInt8916] = l_477_;
					client.anInt8916 = 1356544111 * ((1 + 1594173071 * client.anInt8916) % 100);
					String string_480_ = (Class248.decryptStringMessage(Class127_Sub1.huffManDecryption(stream, 130122413), -1233870536));
					if (rights == 2 || rights == 3)
						BufferedConnectionContext.method393(9, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(string_473_).toString(), string, string_480_, Class404.method4952(l), -1, 1446000206);
					else if (1 == rights)
						BufferedConnectionContext.method393(9, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(string_473_).toString(), string, string_480_, Class404.method4952(l), -1, 1446000206);
					else if (rights != 0)
						BufferedConnectionContext.method393(9, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_473_, string, string_480_, Class404.method4952(l), -1, 1446000206);
					else
						BufferedConnectionContext.method393(9, 0, string, string_473_, string, string_480_, Class404.method4952(l), -1, 1446000206);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.CLOSE_INTERFACE_PACKET) {
				int i_481_ = stream.readIntLE(-2020536115);
				Class343.method4162(1762312694);
				Interface class298_sub51 = ((Interface) client.aClass437_8841.get((long) i_481_));
				if (class298_sub51 != null)
					Class173.method1821(class298_sub51, true, false, -113822480);
				if (client.aClass105_8652 != null) {
					Tradution.method6054(client.aClass105_8652, -760560936);
					client.aClass105_8652 = null;
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2208) {
				int i_482_ = stream.readUnsignedShort128(1340695333);
				if (i_482_ == 65535)
					i_482_ = -1;
				Class50.method530(i_482_, -111895522);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.IGNORES_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				client.anInt8952 = stream.readUnsignedByte() * -765637727;
				for (int i_483_ = 0; i_483_ < client.anInt8952 * -548972447; i_483_++) {
					client.aStringArray8859[i_483_] = stream.readString(-1615855350);
					client.aStringArray8954[i_483_] = stream.readString(700707036);
					if (client.aStringArray8954[i_483_].equals(""))
						client.aStringArray8954[i_483_] = client.aStringArray8859[i_483_];
					client.aStringArray8955[i_483_] = stream.readString(-104782632);
					client.aStringArray8773[i_483_] = stream.readString(1098088401);
					if (client.aStringArray8773[i_483_].equals(""))
						client.aStringArray8773[i_483_] = client.aStringArray8955[i_483_];
					client.aBooleanArray8957[i_483_] = false;
				}
				client.anInt8883 = 754377557 * client.anInt8933;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2157 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class298_Sub41.anInt7456 = stream.read24BitInteger((byte) -43) * 777394511;
				client.aBoolean8811 = stream.readUnsignedByte() == 1;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2151 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				Class315.method3834(SubIncommingPacket.aClass206_2353, (short) -14002);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.aClass202_2265 == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				int i_484_ = stream.readIntV2((byte) 77);
				boolean bool = stream.readUnsigned128Byte((byte) 32) == 1;
				Class343.method4162(2147134789);
				Class508.method6282(i_484_, bool, -1778713719);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.aClass202_2218) {
				int i_485_ = stream.readShort(1670794281);
				int i_486_ = stream.readShort(1614686039);
				int i_487_ = stream.readIntLE(-2073398222);
				Class343.method4162(1771373308);
				ClientScriptMap.method6132(i_487_, i_486_, i_485_, (byte) 45);
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (IncommingPacket.RECEIVE_PRIVATE_MESSAGE_PACKET == ((BufferedConnectionContext) class25).INCOMMING_PACKET) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(-323676906);
				String string_488_ = string;
				if (bool)
					string_488_ = stream.readString(-726880698);
				long l = (long) stream.readUnsignedShort();
				long l_489_ = (long) stream.read24BitUnsignedInteger((byte) -115);
				int rights = stream.readUnsignedByte();
				long l_491_ = l_489_ + (l << 32);
				boolean bool_492_ = false;
				while_93_: do {
					for (int i_493_ = 0; i_493_ < 100; i_493_++) {
						if (l_491_ == client.aLongArray8915[i_493_]) {
							bool_492_ = true;
							break while_93_;
						}
					}
					if (rights != 2) {
						if (client.aBoolean8811 && !client.aBoolean8812 || client.aBoolean8802)
							bool_492_ = true;
						else if (Class287.method2722(string_488_, -2116888507))
							bool_492_ = true;
					}
				} while (false);
				if (!bool_492_) {
					client.aLongArray8915[client.anInt8916 * 1594173071] = l_491_;
					client.anInt8916 = 1356544111 * ((1 + client.anInt8916 * 1594173071) % 100);
					String string_494_ = (Class248.decryptStringMessage(Class127_Sub1.huffManDecryption(stream, -1313378115), 19429593));
					if (2 == rights)
						BufferedConnectionContext.method393(7, 0, new StringBuilder().append(Class247.method2368(1, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(1, -278777595)).append(string_488_).toString(), string, string_494_, null, -1, 1446000206);
					else if (rights == 1)
						BufferedConnectionContext.method393(7, 0, new StringBuilder().append(Class247.method2368(0, -278777595)).append(string).toString(), new StringBuilder().append(Class247.method2368(0, -278777595)).append(string_488_).toString(), string, string_494_, null, -1, 1446000206);
					else if (rights != 0)
						BufferedConnectionContext.method393(3, 0, "<img=" + rights + ">" + string, "<img=" + rights + ">" + string_488_, string, string_494_, null, -1, 1446000206);
					else
						BufferedConnectionContext.method393(3, 0, string, string_488_, string, string_494_, null, -1, 1446000206);
				}
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			if (((BufferedConnectionContext) class25).INCOMMING_PACKET == IncommingPacket.IGNORE_PACKET) {
				int i_495_ = stream.readUnsignedByte();
				boolean bool = (i_495_ & 0x1) == 1;
				String string = stream.readString(1721558949);
				String string_496_ = stream.readString(-1738395503);
				if (string_496_.equals(""))
					string_496_ = string;
				String string_497_ = stream.readString(1813366475);
				String string_498_ = stream.readString(1965503507);
				if (string_498_.equals(""))
					string_498_ = string_497_;
				if (!bool) {
					client.aStringArray8859[client.anInt8952 * -548972447] = string;
					client.aStringArray8954[client.anInt8952 * -548972447] = string_496_;
					client.aStringArray8955[client.anInt8952 * -548972447] = string_497_;
					client.aStringArray8773[-548972447 * client.anInt8952] = string_498_;
					client.aBooleanArray8957[-548972447 * client.anInt8952] = 2 == (i_495_ & 0x2);
					client.anInt8952 += -765637727;
				} else {
					for (int i_499_ = 0; i_499_ < client.anInt8952 * -548972447; i_499_++) {
						if (client.aStringArray8954[i_499_].equals(string_498_)) {
							client.aStringArray8859[i_499_] = string;
							client.aStringArray8954[i_499_] = string_496_;
							client.aStringArray8955[i_499_] = string_497_;
							client.aStringArray8773[i_499_] = string_498_;
							break;
						}
					}
				}
				client.anInt8883 = client.anInt8933 * 754377557;
				((BufferedConnectionContext) class25).INCOMMING_PACKET = null;
				return true;
			}
			Class464.method6062(
					new StringBuilder().append(((BufferedConnectionContext) class25).INCOMMING_PACKET != null ? 2075990793 * (((BufferedConnectionContext) class25).INCOMMING_PACKET.anInt2187) : -1).append(Class26.aString353).append(null != ((BufferedConnectionContext) class25).aClass202_345 ? (((BufferedConnectionContext) class25).aClass202_345.anInt2187) * 2075990793 : -1).append(Class26.aString353).append(null != ((BufferedConnectionContext) class25).aClass202_348 ? (((BufferedConnectionContext) class25).aClass202_348.anInt2187) * 2075990793 : -1).append(" ")
							.append(((BufferedConnectionContext) class25).anInt336 * -866602563).toString(), new RuntimeException(), (short) -18255);
			Class216.method2001(false, (byte) 69);
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pf.jw(").append(')').toString());
		}
	}

}
