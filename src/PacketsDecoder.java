
/* Class455_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class PacketsDecoder extends Class455 {
	int[] anIntArray9077;
	int[] anIntArray9078;
	public static int anInt9079;

	PacketsDecoder(int i, int i_0_, int[] is, int[] is_1_) {
		this.anIntArray9077 = is;
		this.anIntArray9078 = is_1_;
	}

	static final boolean method14433(Class184 class184, int i) throws IOException {
		Class202 class202 = class184.method3053((byte) -107);
		RsBitsBuffer stream = class184.aClass282_Sub35_Sub2_2284;
		if (null == class202) {
			return false;
		}
		if (null == class184.aClass375_2286) {
			if (class184.aBool2288) {
				if (!class202.method3315(1, (byte) 84)) {
					return false;
				}
				class202.method3327((class184.aClass282_Sub35_Sub2_2284.buffer), 0, 1, -1338515791);
				class184.anInt2292 += 755149573;
				class184.anInt2289 = 0;
				class184.aBool2288 = false;
			}
			stream.index = 0;
			if (stream.method14869((short) 22877)) {
				if (!class202.method3315(1, (byte) 98)) {
					return false;
				}
				class202.method3327((class184.aClass282_Sub35_Sub2_2284.buffer), 1, 1, -566199770);
				class184.anInt2292 += 755149573;
				class184.anInt2289 = 0;
			}
			class184.aBool2288 = true;
			IncomingPacket[] class375s = Class60.getIncommingPacket();
			int i_2_ = stream.method14870();
			if (i_2_ < 0 || i_2_ >= class375s.length) {
				throw new IOException(new StringBuilder().append(i_2_).append(" ").append(stream.index * -1990677291).toString());
			}
			class184.aClass375_2286 = class375s[i_2_];
			class184.anInt2287 = class184.aClass375_2286.anInt4513 * 1385530365;
		}
		if (715663393 * class184.anInt2287 == -1) {
			if (!class202.method3315(1, (byte) 96)) {
				return false;
			}
			class202.method3327(stream.buffer, 0, 1, -1428027721);
			class184.anInt2287 = (stream.buffer[0] & 0xff) * -640590879;
			class184.anInt2292 += 755149573;
			class184.anInt2289 = 0;
		}
		if (class184.anInt2287 * 715663393 == -2) {
			if (!class202.method3315(2, (byte) 58)) {
				return false;
			}
			class202.method3327(stream.buffer, 0, 2, -1086022200);
			stream.index = 0;
			class184.anInt2287 = stream.readUnsignedShort() * -640590879;
			class184.anInt2292 += 1510299146;
			class184.anInt2289 = 0;
		}
		if (class184.anInt2287 * 715663393 > 0) {
			if (!class202.method3315((715663393 * class184.anInt2287), (byte) 90)) {
				return false;
			}
			stream.index = 0;
			class202.method3327(stream.buffer, 0, 715663393 * class184.anInt2287, -2131709422);
			class184.anInt2292 += 1163449253 * class184.anInt2287;
			class184.anInt2289 = 0;
		}
		class184.aClass375_2291 = class184.aClass375_2296;
		class184.aClass375_2296 = class184.aClass375_2278;
		class184.aClass375_2278 = class184.aClass375_2286;
		if (IncomingPacket.aClass375_4486 == class184.aClass375_2286) {
			int i_3_ = stream.readInt();
			int i_4_ = stream.readIntV2(-1998341482);
			Class470.method7825(-402122141);
			Class96_Sub3.method13786(i_3_, 1, i_4_, -1, (byte) -45);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4504) {
			String string = stream.readString(1958437341);
			Class251.handleCommand(string, false, false, -354697449);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4356) {
			int i_5_ = stream.readUnsignedShort();
			int i_6_ = stream.readUnsignedByte();
			boolean bool = 1 == (i_6_ & 0x1);
			Class225_Sub5.method13043(i_5_, bool, (short) -26041);
			int i_7_ = stream.readUnsignedShort();
			for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
				int i_9_ = stream.readUnsigned128Byte();
				if (255 == i_9_) {
					i_9_ = stream.readIntV2(-760330093);
				}
				int i_10_ = stream.readShortLE128(602501853);
				Class282_Sub21.method12353(i_5_, i_8_, i_10_ - 1, i_9_, bool, -713581501);
			}
			client.anIntArray7381[(client.anInt7382 += 940885317) * 280036749 - 1 & 0x1f] = i_5_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4444) {
			int i_11_ = stream.readUnsignedByteC(1686876240);
			Class470.method7825(-39143318);
			client.anInt7291 = 1080687357 * i_11_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4482 == class184.aClass375_2286) {
			Class85.aString817 = (715663393 * class184.anInt2287 > 2 ? stream.readString(1759947530) : Message.WALK_HERE.translate(Class223.CURRENT_LANGUAGE, -1187913693));
			client.anInt7311 = (715663393 * class184.anInt2287 > 0 ? stream.readUnsignedShort() : -1) * -1263465007;
			if (65535 == client.anInt7311 * 460745521) {
				client.anInt7311 = 1263465007;
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4469 == class184.aClass375_2286) {
			int i_12_ = stream.readUnsignedShort128();
			int i_13_ = stream.readShortLE128(602501853);
			Class470.method7825(1278401565);
			Class12.method486(i_13_, i_12_, 0, 596260679);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4413) {
			Class438.method7333(false, 2061848059);
			class184.aClass375_2286 = null;
			return false;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4446) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4210, 2050771049);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4400) {
			client.anInt7395 = client.anInt7347 * -79413035;
			boolean bool = stream.readUnsignedByte() == 1;
			if (1 == 715663393 * class184.anInt2287) {
				if (bool) {
					Class113.aClass282_Sub4_1235 = null;
				} else {
					Class202_Sub1.aClass282_Sub4_8186 = null;
				}
				class184.aClass375_2286 = null;
				return true;
			}
			if (bool) {
				Class113.aClass282_Sub4_1235 = new Class282_Sub4(stream);
			} else {
				Class202_Sub1.aClass282_Sub4_8186 = new Class282_Sub4(stream);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4408 == class184.aClass375_2286) {
			int i_14_ = stream.readUnsignedByte();
			if (stream.readUnsignedByte() == 0) {
				client.aClass330Array7428[i_14_] = new Class330();
			} else {
				stream.index -= -1115476867;
				client.aClass330Array7428[i_14_] = new Class330(stream);
			}
			client.anInt7320 = 262662777 * client.anInt7347;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4395) {
			int i_15_ = stream.readInt();
			int i_16_ = stream.readShortLE((byte) -42);
			int i_17_ = stream.readShortLE((byte) -126);
			int i_18_ = stream.readShortLE128(602501853);
			Class470.method7825(94861760);
			Class149_Sub1.method14583(i_15_, i_16_, i_17_, i_18_, -2141386100);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4475) {
			String string = stream.readString(2070403769);
			int i_19_ = stream.readIntV1();
			Class470.method7825(-588315880);
			Class38.method860(i_19_, string, -697454473);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.WINDOW_PANE_PACKET) {
			int key3 = stream.readIntV1();
			int key4 = stream.readIntV1();// method13130(-1330631707);
			int id = stream.readUnsignedShort128();
			int type = stream.readUnsigned128Byte();
			int key2 = stream.readInt();
			int key1 = stream.readInt();
			Class470.method7825(-400873026);
			if (type == 2) {
				ItemDefaultsLoader.method7081((byte) 18);
			}
			int[] is = { key1, key2, key3, key4 };
			client.anInt7349 = 153305321 * id;
			Class336.method6007(id, is, -1517468503);
			Class516.method8867(false, -905479502);
			Class150.method2582(-1699899559 * client.anInt7349, is, -1390726584);
			for (int i_26_ = 0; i_26_ < 107; i_26_++) {
				client.aBoolArray7443[i_26_] = true;
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4478 == class184.aClass375_2286) {
			int i_27_ = stream.readUnsignedShort128();
			int i_28_ = stream.readIntV1();
			int i_29_ = stream.readIntV1();
			Class470.method7825(994147760);
			Class96_Sub3.method13786(i_28_, 5, i_27_, i_29_, (byte) -76);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4390 == class184.aClass375_2286) {
			Class470.method7825(1974206194);
			Class514.method8841(1210401894);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4511) {
			String string = stream.readString(-391052683);
			int i_30_ = stream.readShortLE128(602501853);
			Class470.method7825(1212962087);
			MapRegion.method4562(i_30_, string, -1783534567);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4416) {
			Class158_Sub1_Sub2.anInt10131 = ((stream.read128Byte((short) 9583) << 3) * 657999909);
			Class272.anInt3331 = stream.readUnsignedByte128(-1153285276) * 1822731553;
			Class458.anInt5495 = ((stream.readByte((short) -31928) << 3) * 801275545);
			while (-1990677291 * stream.index < 715663393 * class184.anInt2287) {
				TilestreamPacket class364 = (Class163.method2842(-332458150)[stream.readUnsignedByte()]);
				Class188.decodeTilestreamPacket(class364, 1774288531);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4406 == class184.aClass375_2286) {
			int i_31_ = stream.readUnsignedShort();
			int i_32_ = stream.readInt();
			Class470.method7825(1616362856);
			Class175.method2966(i_32_, i_31_, (short) 151);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4382) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(880000122);
			String string_33_ = string;
			if (bool) {
				string_33_ = stream.readString(952948027);
			}
			long l = stream.readUnsignedShort();
			long l_34_ = stream.read24BitUnsignedInteger((short) 22344);
			int i_35_ = stream.readUnsignedByte();
			int i_36_ = stream.readUnsignedShort();
			long l_37_ = l_34_ + (l << 32);
			boolean bool_38_ = false;
			while_117_: do {
				for (int i_39_ = 0; i_39_ < 100; i_39_++) {
					if (client.aLongArray7424[i_39_] == l_37_) {
						bool_38_ = true;
						break while_117_;
					}
				}
				if (i_35_ <= 1 && Class280.method4975(string_33_, (byte) -80)) {
					bool_38_ = true;
				}
			} while (false);
			if (!bool_38_) {
				client.aLongArray7424[client.anInt7389 * -1307820429] = l_37_;
				client.anInt7389 = 1022203579 * ((1 + -1307820429 * client.anInt7389) % 100);
				String string_40_ = IndexLoaders.aClass429_4265.method7214(i_36_, -2078154753).method14897(stream, (byte) 0);
				if (i_35_ == 2) {
					MapRegionLoaderTask.method6070(18, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string_33_).toString(), string, string_40_, null, i_36_, 30927485);
				} else if (1 == i_35_) {
					MapRegionLoaderTask.method6070(18, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string_33_).toString(), string, string_40_, null, i_36_, 30927485);
				} else {
					MapRegionLoaderTask.method6070(18, 0, string, string_33_, string, string_40_, null, i_36_, 30927485);
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4456) {
			int i_41_ = stream.readIntLE(1373172636);
			int i_42_ = stream.readUnsignedShort128();
			Class470.method7825(1178481607);
			Class440.method7374(i_41_, i_42_, -1621742846);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4433) {
			int i_43_ = stream.readUnsignedShort();
			if (65535 == i_43_) {
				i_43_ = -1;
			}
			int i_44_ = stream.readUnsignedByte();
			int i_45_ = stream.readUnsignedShort();
			int i_46_ = stream.readUnsignedByte();
			int i_47_ = stream.readUnsignedShort();
			Class435.method7300(i_43_, i_44_, i_45_, i_46_, false, i_47_, 1449989045);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.RUN_ENERGY) {
			client.anInt7300 = stream.readUnsignedByte() * -1107631499;
			client.anInt7397 = client.anInt7347 * 1520234947;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4379) {
			int i_48_ = stream.readInt();
			int i_49_ = stream.readShortLE128(602501853);
			int i_50_ = stream.readIntV1();
			Class470.method7825(-444552624);
			Class96_Sub3.method13786(i_50_, 3, i_49_, i_48_, (byte) -84);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4477) {
			int i_51_ = stream.readUnsignedByteC(1994158207);
			int i_52_ = stream.readUnsignedShort128();
			if (i_52_ == 65535) {
				i_52_ = -1;
			}
			int i_53_ = stream.readUnsignedByteC(-1478296892);
			int i_54_ = stream.readUnsignedShort128();
			int i_55_ = stream.readIntLE(7314252);
			int i_56_ = stream.readShortLE((byte) -30);
			int i_57_ = i_53_ & 0x7;
			int i_58_ = i_53_ >> 3 & 0xf;
			if (i_58_ == 15) {
				i_58_ = -1;
			}
			boolean bool = 1 == (i_53_ >> 7 & 0x1);
			if (i_55_ >> 30 != 0) {
				Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1211596991);
				int i_59_ = i_55_ >> 28 & 0x3;
				int i_60_ = (i_55_ >> 14 & 0x3fff) - class219.anInt2711 * 1948093437;
				int i_61_ = (i_55_ & 0x3fff) - -1002240017 * class219.anInt2712;
				if (i_60_ >= 0 && i_61_ >= 0 && i_60_ < IndexLoaders.MAP_REGION_DECODER.method4424(388459650) && i_61_ < IndexLoaders.MAP_REGION_DECODER.method4451(-1824277921)) {
					if (i_52_ == -1) {
						Class282_Sub50_Sub10 class282_sub50_sub10 = ((Class282_Sub50_Sub10) client.aClass465_7334.method7754(i_60_ << 16 | i_61_));
						if (class282_sub50_sub10 != null) {
							class282_sub50_sub10.aClass521_Sub1_Sub1_Sub4_9636.method15931(-2031553804);
							class282_sub50_sub10.unlink(-371378792);
						}
					} else {
						int i_62_ = i_60_ * 512 + 256;
						int i_63_ = i_61_ * 512 + 256;
						int i_64_ = i_59_;
						if (i_64_ < 3 && IndexLoaders.MAP_REGION_DECODER.method4433(33386298).method5497(i_60_, i_61_, 1765906120)) {
							i_64_++;
						}
						Class521_Sub1_Sub1_Sub4 class521_sub1_sub1_sub4 = (new Class521_Sub1_Sub1_Sub4(IndexLoaders.MAP_REGION_DECODER.method4430(-1893689656), i_52_, i_54_, i_59_, i_64_, i_62_, Class504.method8389(i_62_, i_63_, i_59_, (byte) 74) - i_56_, i_63_, i_60_, i_60_, i_61_, i_61_, i_57_, bool));
						client.aClass465_7334.method7765(new Class282_Sub50_Sub10(class521_sub1_sub1_sub4), i_60_ << 16 | i_61_);
					}
				}
			} else if (i_55_ >> 29 != 0) {
				int i_65_ = i_55_ & 0xffff;
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754(i_65_));
				if (null != class282_sub47) {
					NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
					Class161 class161 = (class521_sub1_sub1_sub2_sub2.aClass161Array10339[i_51_]);
					if (i_52_ == 65535) {
						i_52_ = -1;
					}
					boolean bool_66_ = true;
					int i_67_ = class161.anInt2012 * 378836105;
					if (i_52_ != -1 && i_67_ != -1) {
						if (i_52_ == i_67_) {
							Class525 class525 = IndexLoaders.aClass515_9416.method8845(i_52_, (byte) -4);
							if (class525.aBool6968 && -364555849 * class525.anInt6977 != -1) {
								AnimationDefinitions class518 = (IndexLoaders.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) -4));
								int i_68_ = class518.anInt5907 * 554947543;
								if (0 == i_68_ || i_68_ == 2) {
									bool_66_ = false;
								} else if (1 == i_68_) {
									bool_66_ = true;
								}
							}
						} else {
							Class525 class525 = IndexLoaders.aClass515_9416.method8845(i_52_, (byte) 50);
							Class525 class525_69_ = IndexLoaders.aClass515_9416.method8845(i_67_, (byte) 100);
							if (-1 != class525.anInt6977 * -364555849 && -364555849 * class525_69_.anInt6977 != -1) {
								AnimationDefinitions class518 = (IndexLoaders.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) 15));
								AnimationDefinitions class518_70_ = (IndexLoaders.aClass523_3868.method11205(-364555849 * class525_69_.anInt6977, (byte) 19));
								if (class518.anInt5916 * -1834317435 < -1834317435 * class518_70_.anInt5916) {
									bool_66_ = false;
								}
							}
						}
					}
					if (bool_66_) {
						class161.anInt2012 = i_52_ * -1025302087;
						class161.anInt2013 = 391696483 * i_56_;
						class161.anInt2011 = -523477979 * i_58_;
						if (-1 != i_52_) {
							Class525 class525 = IndexLoaders.aClass515_9416.method8845(i_52_, (byte) -65);
							int i_71_ = class525.aBool6968 ? 0 : 2;
							if (bool) {
								i_71_ = 1;
							}
							class161.aClass456_2014.method7571(class525.anInt6977 * -364555849, i_54_, i_71_, false, 1725179623);
						} else {
							class161.aClass456_2014.method7567(-1, (short) 8960);
						}
					}
				}
			} else if (i_55_ >> 28 != 0) {
				int i_72_ = i_55_ & 0xffff;
				Player class521_sub1_sub1_sub2_sub1;
				if (i_72_ == 1595512269 * client.anInt7315) {
					class521_sub1_sub1_sub2_sub1 = Class84.myPlayer;
				} else {
					class521_sub1_sub1_sub2_sub1 = client.players[i_72_];
				}
				if (null != class521_sub1_sub1_sub2_sub1) {
					Class161 class161 = (class521_sub1_sub1_sub2_sub1.aClass161Array10339[i_51_]);
					if (65535 == i_52_) {
						i_52_ = -1;
					}
					boolean bool_73_ = true;
					int i_74_ = 378836105 * class161.anInt2012;
					if (i_52_ != -1 && i_74_ != -1) {
						if (i_74_ == i_52_) {
							Class525 class525 = IndexLoaders.aClass515_9416.method8845(i_52_, (byte) 39);
							if (class525.aBool6968 && -1 != -364555849 * class525.anInt6977) {
								AnimationDefinitions class518 = (IndexLoaders.aClass523_3868.method11205(class525.anInt6977 * -364555849, (byte) 36));
								int i_75_ = 554947543 * class518.anInt5907;
								if (i_75_ == 0 || i_75_ == 2) {
									bool_73_ = false;
								} else if (i_75_ == 1) {
									bool_73_ = true;
								}
							}
						} else {
							Class525 class525 = IndexLoaders.aClass515_9416.method8845(i_52_, (byte) -86);
							Class525 class525_76_ = IndexLoaders.aClass515_9416.method8845(i_74_, (byte) -10);
							if (-364555849 * class525.anInt6977 != -1 && class525_76_.anInt6977 * -364555849 != -1) {
								AnimationDefinitions class518 = (IndexLoaders.aClass523_3868.method11205(-364555849 * class525.anInt6977, (byte) -12));
								AnimationDefinitions class518_77_ = (IndexLoaders.aClass523_3868.method11205(-364555849 * class525_76_.anInt6977, (byte) 15));
								if (class518.anInt5916 * -1834317435 < class518_77_.anInt5916 * -1834317435) {
									bool_73_ = false;
								}
							}
						}
					}
					if (bool_73_) {
						class161.anInt2012 = -1025302087 * i_52_;
						class161.anInt2013 = i_56_ * 391696483;
						class161.anInt2011 = -523477979 * i_58_;
						class161.anInt2015 = i_57_ * 1859279795;
						if (-1 != i_52_) {
							Class525 class525 = IndexLoaders.aClass515_9416.method8845(i_52_, (byte) -15);
							int i_78_ = class525.aBool6968 ? 0 : 2;
							if (bool) {
								i_78_ = 1;
							}
							class161.aClass456_2014.method7571(-364555849 * class525.anInt6977, i_54_, i_78_, false, -948478080);
						} else {
							class161.aClass456_2014.method7567(-1, (short) 8960);
						}
					}
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4391) {
			int i_79_ = stream.readUnsignedByte();
			int i_80_ = stream.readUnsignedShort128() << 2;
			int i_81_ = stream.readUnsignedByte128(-1952319270);
			int i_82_ = stream.readUnsignedByteC(1062022644);
			int i_83_ = stream.readUnsigned128Byte();
			Class470.method7825(1011041047);
			Class11.method469(i_79_, i_81_, i_80_, i_83_, i_82_, (byte) -10);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4368 == class184.aClass375_2286) {
			int i_84_ = stream.readUnsignedByte();
			int i_85_ = stream.readUnsignedShort128();
			Class470.method7825(-822536297);
			Class93.method1575(i_85_, i_84_, true, 733762718);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.GAME_MESSAGE == class184.aClass375_2286) {
			int i_86_ = stream.readUnsignedSmart(1685842544);
			int i_87_ = stream.readInt();
			int i_88_ = stream.readUnsignedByte();
			String string = "";
			String string_89_ = string;
			if (0 != (i_88_ & 0x1)) {
				string = stream.readString(1176411618);
				if ((i_88_ & 0x2) != 0) {
					string_89_ = stream.readString(605615491);
				} else {
					string_89_ = string;
				}
			}
			String string_90_ = stream.readString(126875008);
			if (99 == i_86_) {
				Class209.method3598(string_90_, -1476632772);
			} else if (i_86_ == 98) {
				Class240.method4140(string_90_, -2007576372);
			} else {
				if (!string_89_.equals("") && Class280.method4975(string_89_, (byte) -48)) {
					class184.aClass375_2286 = null;
					return true;
				}
				Class191.method3167(i_86_, i_87_, string, string_89_, string, string_90_, 1911483495);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4439 == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4211, 34147700);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4367 == class184.aClass375_2286) {
			if (Class475.aBool5623 && null != client.aFrame3260) {
				Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-2060452662), -1, -1, false, (byte) 2);
			}
			byte[] is = new byte[class184.anInt2287 * 715663393 - 1];
			boolean bool = stream.readUnsignedByte() == 1;
			stream.method14873(is, 0, 715663393 * (class184.anInt2287) - 1, (byte) 8);
			RsByteBuffer class282_sub35 = new RsByteBuffer(is);
			String string = class282_sub35.readString(254616668);
			if (bool) {
				String string_91_ = class282_sub35.readString(1524615378);
				if (string_91_.length() == 0) {
					string_91_ = string;
				}
				if (!client.aBool7310 || Class225_Sub6.aString8069.startsWith("mac") || !Class186.method3082(string, 1, Class361.aClass361_4179.method6253((byte) -74), 145298920)) {
					Class282_Sub50_Sub6.method14788(string_91_, true, Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(111625844) == 5, client.aBool7158, client.aBool7159, (byte) -120);
				}
			} else {
				Class282_Sub50_Sub6.method14788(string, true, (Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-1499528045) == 5), client.aBool7158, client.aBool7159, (byte) -96);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4422 == class184.aClass375_2286) {
			int i_92_ = stream.readUnsigned128Byte();
			int i_93_ = stream.readUnsignedShort();
			int i_94_ = stream.readUnsignedByteC(-588997418);
			int i_95_ = stream.readUnsignedByteC(138735834);
			int i_96_ = stream.readUnsigned128Byte();
			Class470.method7825(665470469);
			client.aBoolArray7431[i_94_] = true;
			client.anIntArray7268[i_94_] = i_95_;
			client.anIntArray7433[i_94_] = i_92_;
			client.anIntArray7462[i_94_] = i_96_;
			client.anIntArray7435[i_94_] = i_93_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4355) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(786111895);
			String string_97_ = string;
			if (bool) {
				string_97_ = stream.readString(2137300008);
			}
			int i_98_ = stream.readUnsignedByte();
			boolean bool_99_ = false;
			if (i_98_ <= 1) {
				if (client.aBool7224 && !client.aBool7244 || client.aBool7325) {
					bool_99_ = true;
				} else if (i_98_ <= 1 && Class280.method4975(string_97_, (byte) -70)) {
					bool_99_ = true;
				}
			}
			if (!bool_99_) {
				String string_100_ = (Class182.method3044(Defaults7Loader.method8755(stream, (byte) 29), -1519993030));
				if (i_98_ == 2) {
					MapRegionLoaderTask.method6070(24, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string_97_).toString(), string, string_100_, null, -1, 30927485);
				} else if (1 == i_98_) {
					MapRegionLoaderTask.method6070(24, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string_97_).toString(), string, string_100_, null, -1, 30927485);
				} else {
					MapRegionLoaderTask.method6070(24, 0, string, string_97_, string, string_100_, null, -1, 30927485);
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4434 == class184.aClass375_2286) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(-199776118);
			String string_101_ = string;
			if (bool) {
				string_101_ = stream.readString(52268459);
			}
			int i_102_ = stream.readUnsignedByte();
			int i_103_ = stream.readUnsignedShort();
			boolean bool_104_ = false;
			if (i_102_ <= 1 && Class280.method4975(string_101_, (byte) -65)) {
				bool_104_ = true;
			}
			if (!bool_104_) {
				String string_105_ = IndexLoaders.aClass429_4265.method7214(i_103_, -1821075949).method14897(stream, (byte) 0);
				if (i_102_ == 2) {
					MapRegionLoaderTask.method6070(25, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string_101_).toString(), string, string_105_, null, i_103_, 30927485);
				} else if (i_102_ == 1) {
					MapRegionLoaderTask.method6070(25, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string_101_).toString(), string, string_105_, null, i_103_, 30927485);
				} else {
					MapRegionLoaderTask.method6070(25, 0, string, string_101_, string, string_105_, null, i_103_, 30927485);
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4373) {
			Class149_Sub2.aClass461_9316 = Class246.method4203(stream.readUnsignedByte(), (byte) 2);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4496 == class184.aClass375_2286) {
			int i_106_ = stream.readShortLE128(602501853);
			int[] is = new int[Class8_Sub3.method14339(179659033).length];
			for (int i_107_ = 0; i_107_ < Class8_Sub3.method14339(2021729749).length; i_107_++) {
				is[i_107_] = stream.readIntLE(196232406);
			}
			int i_108_ = stream.readUnsignedByte();
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) client.aClass465_7208.method7754(i_106_));
			if (class282_sub47 != null) {
				Class20.animate(((Animable) class282_sub47.anObject8068), is, i_108_, true, (byte) 72);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.MOVE_ICOMPONENT == class184.aClass375_2286) {
			int i_109_ = stream.readUnsignedShort128(877005762);
			int i_110_ = stream.readIntV2(-1005542632);
			int i_111_ = stream.readUnsignedShortLE128(-1358044133);
			Class470.method7825(457880484);
			Class96_Sub16.method14648(i_110_, i_111_, i_109_, (byte) 8);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.DYNAMIC_MAP_REGION == class184.aClass375_2286) {
			RsBitsBuffer class282_sub35_sub2_112_ = new RsBitsBuffer(class184.anInt2287 * 715663393);
			System.arraycopy((class184.aClass282_Sub35_Sub2_2284.buffer), -1990677291 * (class184.aClass282_Sub35_Sub2_2284.index), class282_sub35_sub2_112_.buffer, 0, 715663393 * class184.anInt2287);
			Class414.method6989(1407669515);
			if (Class393.aClass282_Sub54_4783.aClass468_Sub3_8199.method12632(917077703) == 1) {
				IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335(Class256.aClass256_3155, class282_sub35_sub2_112_), 301123709);
			} else {
				IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3155, class282_sub35_sub2_112_), 1959185438);
			}
			class184.aClass375_2286 = null;
			return false;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4499) {
			client.aByte7458 = stream.readByte((short) -693);
			if (0 == client.aByte7458 || client.aByte7458 == 1) {
				client.aBool7323 = true;
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.NPC_ON_ICOMPONENT) {
			int i_113_ = stream.readIntLE(684015342);
			int i_114_ = stream.readIntV1();
			Class470.method7825(-1093951005);
			Class96_Sub3.method13786(i_113_, 2, i_114_, -1, (byte) -52);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4369) {
			int i_115_ = stream.readUnsignedShort();
			Player class521_sub1_sub1_sub2_sub1;
			if (i_115_ == 1595512269 * client.anInt7315) {
				class521_sub1_sub1_sub2_sub1 = Class84.myPlayer;
			} else {
				class521_sub1_sub1_sub2_sub1 = client.players[i_115_];
			}
			if (class521_sub1_sub1_sub2_sub1 == null) {
				class184.aClass375_2286 = null;
				return true;
			}
			int i_116_ = stream.readUnsignedShort();
			int i_117_ = stream.readUnsignedByte();
			boolean bool = 0 != (i_116_ & 0x8000);
			if (null != class521_sub1_sub1_sub2_sub1.displayName && null != class521_sub1_sub1_sub2_sub1.playerAppearance) {
				boolean bool_118_ = false;
				if (i_117_ <= 1) {
					if (!bool && (client.aBool7224 && !client.aBool7244 || client.aBool7325)) {
						bool_118_ = true;
					} else if (Class280.method4975((class521_sub1_sub1_sub2_sub1.displayName), (byte) -107)) {
						bool_118_ = true;
					}
				}
				if (!bool_118_) {
					int i_119_ = -1;
					String string;
					if (bool) {
						i_116_ &= 0x7fff;
						Class346 class346 = Class175.method2958(stream, -1418215798);
						i_119_ = class346.anInt4048 * -624100047;
						string = class346.aClass282_Sub50_Sub9_4047.method14897(stream, (byte) 0);
					} else {
						string = (Class182.method3044(Defaults7Loader.method8755(stream, (byte) 71), -1519993030));
					}
					class521_sub1_sub1_sub2_sub1.sendChat(string.trim(), i_116_ >> 8, i_116_ & 0xff, (byte) 33);
					int i_120_;
					if (1 == i_117_ || i_117_ == 2) {
						i_120_ = bool ? 17 : 1;
					} else {
						i_120_ = bool ? 17 : 2;
					}
					if (2 == i_117_) {
						MapRegionLoaderTask.method6070(i_120_, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(class521_sub1_sub1_sub2_sub1.method16127(true, 2000914170)).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(class521_sub1_sub1_sub2_sub1.method16128(false, 1912893547)).toString(), class521_sub1_sub1_sub2_sub1.username, string, null, i_119_, 30927485);
					} else if (1 == i_117_) {
						MapRegionLoaderTask.method6070(i_120_, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(class521_sub1_sub1_sub2_sub1.method16127(true, 1975174486)).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(class521_sub1_sub1_sub2_sub1.method16128(false, 1912893547)).toString(), class521_sub1_sub1_sub2_sub1.username, string, null, i_119_, 30927485);
					} else {
						MapRegionLoaderTask.method6070(i_120_, 0, class521_sub1_sub1_sub2_sub1.method16127(true, 2076242583), class521_sub1_sub1_sub2_sub1.method16128(false, 1912893547), class521_sub1_sub1_sub2_sub1.username, string, null, i_119_, 30927485);
					}
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4409 == class184.aClass375_2286) {
			int i_121_ = stream.readUnsignedShort();
			String string = stream.readString(-53471090);
			boolean bool = stream.readUnsignedByte() == 1;
			Class448.aClass450_5429 = Class159.aClass450_2010;
			Class448.aBool5428 = bool;
			Class62.method1262(i_121_, string, (byte) 0);
			Object object = null;
			Class365.method6298(17, 1752786993);
			class184.aClass375_2286 = null;
			return false;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4360) {
			Class438.method7333(Class9.aBool71, 2100753515);
			class184.aClass375_2286 = null;
			return false;
		}
		if (IncomingPacket.GLOBAL_CONFIG_1 == class184.aClass375_2286) {
			int i_122_ = stream.readShortLE((byte) -64);
			int i_123_ = stream.readIntV2(-390916272);
			Class470.method7825(933827827);
			Class393.method6751(i_122_, i_123_, -1413337528);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4506 == class184.aClass375_2286) {
			int i_124_ = stream.readIntV2(-1343839559);
			int i_125_ = stream.readIntLE(664737330);
			int i_126_ = stream.readShortLE((byte) -14);
			int i_127_ = stream.readInt();
			int i_128_ = stream.readIntV1();
			int i_129_ = stream.readUnsigned128Byte();
			Class219 class219 = new Class219(stream.readIntV1());
			int i_130_ = stream.readIntV1();
			int i_131_ = stream.readShortLE128(602501853);
			Class470.method7825(881365038);
			Class31.method812(i_124_, new Class282_Sub44_Sub3(i_126_, i_129_, new Class520(class219, i_131_)), new int[] { i_128_, i_130_, i_125_, i_127_ }, false, (byte) 121);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4500 == class184.aClass375_2286) {
			client.anInt7179 = 318487303 * client.anInt7347;
			if (715663393 * class184.anInt2287 == 0) {
				client.aString7426 = null;
				client.aString7359 = null;
				Class459.anInt5534 = 0;
				Class467.aClass173Array5575 = null;
				class184.aClass375_2286 = null;
				return true;
			}
			client.aString7359 = stream.readString(603900971);
			boolean bool = stream.readUnsignedByte() == 1;
			if (bool) {
				stream.readString(231926254);
			}
			long l = stream.readLong(1393893108);
			client.aString7426 = Class306.method5457(l);
			Class412.aByte4963 = stream.readByte((short) -17911);
			int i_132_ = stream.readUnsignedByte();
			if (i_132_ == 255) {
				class184.aClass375_2286 = null;
				return true;
			}
			Class459.anInt5534 = -1461487731 * i_132_;
			Class173[] class173s = new Class173[100];
			for (int i_133_ = 0; i_133_ < Class459.anInt5534 * -1772444859; i_133_++) {
				class173s[i_133_] = new Class173();
				class173s[i_133_].aString2129 = stream.readString(1322791381);
				bool = stream.readUnsignedByte() == 1;
				if (bool) {
					class173s[i_133_].aString2127 = stream.readString(424125456);
				} else {
					class173s[i_133_].aString2127 = class173s[i_133_].aString2129;
				}
				class173s[i_133_].aString2128 = Class383.method6515(class173s[i_133_].aString2127, 1942118537);
				class173s[i_133_].anInt2131 = stream.readUnsignedShort() * 1704138443;
				class173s[i_133_].aByte2126 = stream.readByte((short) -7231);
				class173s[i_133_].aString2130 = stream.readString(-348715880);
				if (class173s[i_133_].aString2127.equals(Class84.myPlayer.displayName)) {
					Class48_Sub2.aByte9263 = class173s[i_133_].aByte2126;
				}
			}
			boolean bool_134_ = false;
			int i_135_ = -1772444859 * Class459.anInt5534;
			do {
				if (i_135_ <= 0) {
					break;
				}
				bool_134_ = true;
				i_135_--;
				for (int i_136_ = 0; i_136_ < i_135_; i_136_++) {
					if ((class173s[i_136_].aString2128.compareTo(class173s[1 + i_136_].aString2128)) > 0) {
						Class173 class173 = class173s[i_136_];
						class173s[i_136_] = class173s[i_136_ + 1];
						class173s[1 + i_136_] = class173;
						bool_134_ = false;
					}
				}
			} while (!bool_134_);
			Class467.aClass173Array5575 = class173s;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4387 == class184.aClass375_2286) {
			Class470.method7825(1881544107);
			Class275_Sub7.method12606((byte) 81);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4401 == class184.aClass375_2286) {
			int i_137_ = stream.readUnsignedShort();
			String string = stream.readString(-265883573);
			if (Class46.anObjectArray437 == null) {
				Class46.anObjectArray437 = (new Object[IndexLoaders.aClass394_5831.anInt4785 * 117597627]);
			}
			Class46.anObjectArray437[i_137_] = string;
			client.anIntArray7222[(client.anInt7390 += 9095609) * 1033923721 - 1 & 0x1f] = i_137_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4414) {
			int i_138_ = stream.readUnsignedByte128(-1018518837);
			int i_139_ = stream.readUnsignedByte128(-655779539);
			int i_140_ = stream.readUnsignedShort128();
			if (i_140_ == 65535) {
				i_140_ = -1;
			}
			Class42.method890(i_140_, i_139_, i_138_, (byte) -6);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4501) {
			boolean bool = stream.readUnsigned128Byte() == 1;
			int i_141_ = stream.readIntLE(1699741740);
			Class470.method7825(1755063045);
			Class331.method5924(i_141_, bool, 16777472);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4411) {
			int i_142_ = stream.method13132(-458827259);
			int i_143_ = stream.readUnsigned128Byte();
			int i_144_ = stream.readShortLE((byte) -115);
			if (65535 == i_144_) {
				i_144_ = -1;
			}
			Class117.method1978(i_144_, i_142_, i_143_, (byte) 1);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4427) {
			client.anInt7422 = stream.readUnsignedByteC(-751450518) * 1267760345;
			client.anInt7416 = stream.readUnsignedByte128(-1679113626) * 1429316783;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4451) {
			Class158_Sub1.aClass3_8507.method265(1066076779);
			client.anInt7453 += -383481888;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4465) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4215, 844987156);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4473) {
			client.anInt7354 = stream.readShort(2042981264) * 875405409;
			client.anInt7397 = client.anInt7347 * 1520234947;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4399) {
			int i_145_ = stream.readIntLE(507733552);
			Class470.method7825(-741454199);
			if (-1 == i_145_) {
				Class508.anInt5864 = 987778595;
				Class86.anInt833 = -1509271845;
			} else {
				Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1825501600);
				int i_146_ = i_145_ >> 14 & 0x3fff;
				int i_147_ = i_145_ & 0x3fff;
				i_146_ -= 1948093437 * class219.anInt2711;
				if (i_146_ < 0) {
					i_146_ = 0;
				} else if (i_146_ >= IndexLoaders.MAP_REGION_DECODER.method4424(2001969663)) {
					i_146_ = IndexLoaders.MAP_REGION_DECODER.method4424(1292734123);
				}
				i_147_ -= class219.anInt2712 * -1002240017;
				if (i_147_ < 0) {
					i_147_ = 0;
				} else if (i_147_ >= IndexLoaders.MAP_REGION_DECODER.method4451(-446292147)) {
					i_147_ = IndexLoaders.MAP_REGION_DECODER.method4451(-1249519564);
				}
				Class508.anInt5864 = -987778595 * (256 + (i_146_ << 9));
				Class86.anInt833 = 1509271845 * ((i_147_ << 9) + 256);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4509) {
			for (int i_148_ = 0; i_148_ < client.players.length; i_148_++) {
				if (null != client.players[i_148_]) {
					client.players[i_148_].anIntArray10350 = null;
					client.players[i_148_].aClass456_10338.method7567(-1, (short) 8960);
				}
			}
			for (int i_149_ = 0; i_149_ < 1658163325 * client.anInt7210; i_149_++) {
				((Animable) client.aClass282_Sub47Array7209[i_149_].anObject8068).anIntArray10350 = null;
				((Animable) client.aClass282_Sub47Array7209[i_149_].anObject8068).aClass456_10338.method7567(-1, (short) 8960);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4353 == class184.aClass375_2286) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(537640935);
			long l = stream.readUnsignedShort();
			long l_150_ = stream.read24BitUnsignedInteger((short) 2221);
			int i_151_ = stream.readUnsignedByte();
			int i_152_ = stream.readUnsignedShort();
			long l_153_ = l_150_ + (l << 32);
			boolean bool_154_ = false;
			Object object = null;
			Class282_Sub4 class282_sub4 = (bool ? Class113.aClass282_Sub4_1235 : Class202_Sub1.aClass282_Sub4_8186);
			while_118_: do {
				if (null == class282_sub4) {
					bool_154_ = true;
				} else {
					for (int i_155_ = 0; i_155_ < 100; i_155_++) {
						if (l_153_ == client.aLongArray7424[i_155_]) {
							bool_154_ = true;
							break while_118_;
						}
					}
					if (i_151_ <= 1 && Class280.method4975(string, (byte) -52)) {
						bool_154_ = true;
					}
				}
			} while (false);
			if (!bool_154_) {
				client.aLongArray7424[-1307820429 * client.anInt7389] = l_153_;
				client.anInt7389 = (1 + -1307820429 * client.anInt7389) % 100 * 1022203579;
				String string_156_ = IndexLoaders.aClass429_4265.method7214(i_152_, -1887115838).method14897(stream, (byte) 0);
				int i_157_ = bool ? 42 : 45;
				if (2 == i_151_ || 3 == i_151_) {
					MapRegionLoaderTask.method6070(i_157_, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), string, string_156_, class282_sub4.aString7501, i_152_, 30927485);
				} else if (1 == i_151_) {
					MapRegionLoaderTask.method6070(i_157_, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), string, string_156_, class282_sub4.aString7501, i_152_, 30927485);
				} else {
					MapRegionLoaderTask.method6070(i_157_, 0, string, string, string, string_156_, class282_sub4.aString7501, i_152_, 30927485);
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4377 == class184.aClass375_2286) {
			int i_158_ = stream.readUnsignedShort();
			long l = stream.readLong(923196069);
			if (Class46.anObjectArray437 == null) {
				Class46.anObjectArray437 = (new Object[IndexLoaders.aClass394_5831.anInt4785 * 117597627]);
			}
			Class46.anObjectArray437[i_158_] = new Long(l);
			client.anIntArray7222[(client.anInt7390 += 9095609) * 1033923721 - 1 & 0x1f] = i_158_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4493 == class184.aClass375_2286) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(1168813312);
			String string_159_ = string;
			if (bool) {
				string_159_ = stream.readString(1997417381);
			}
			long l = stream.readLong(1356149635);
			long l_160_ = stream.readUnsignedShort();
			long l_161_ = stream.read24BitUnsignedInteger((short) 19743);
			int i_162_ = stream.readUnsignedByte();
			int i_163_ = stream.readUnsignedShort();
			long l_164_ = (l_160_ << 32) + l_161_;
			boolean bool_165_ = false;
			while_119_: do {
				for (int i_166_ = 0; i_166_ < 100; i_166_++) {
					if (client.aLongArray7424[i_166_] == l_164_) {
						bool_165_ = true;
						break while_119_;
					}
				}
				if (i_162_ <= 1 && Class280.method4975(string_159_, (byte) -44)) {
					bool_165_ = true;
				}
			} while (false);
			if (!bool_165_) {
				client.aLongArray7424[-1307820429 * client.anInt7389] = l_164_;
				client.anInt7389 = (1 + client.anInt7389 * -1307820429) % 100 * 1022203579;
				String string_167_ = IndexLoaders.aClass429_4265.method7214(i_163_, -1839082633).method14897(stream, (byte) 0);
				if (i_162_ == 2) {
					MapRegionLoaderTask.method6070(20, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string_159_).toString(), string, string_167_, Class179.method3018(l), i_163_, 30927485);
				} else if (1 == i_162_) {
					MapRegionLoaderTask.method6070(20, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string_159_).toString(), string, string_167_, Class179.method3018(l), i_163_, 30927485);
				} else {
					MapRegionLoaderTask.method6070(20, 0, string, string_159_, string, string_167_, Class179.method3018(l), i_163_, 30927485);
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4510 == class184.aClass375_2286) {
			String string = stream.readString(1145817674);
			int i_168_ = stream.readUnsignedShort();
			String string_169_ = IndexLoaders.aClass429_4265.method7214(i_168_, -1726302200).method14897(stream, (byte) 0);
			MapRegionLoaderTask.method6070(19, 0, string, string, string, string_169_, null, i_168_, 30927485);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4484) {
			int i_170_ = stream.readUnsignedShort();
			int i_171_ = stream.readInt();
			if (null == Class46.anObjectArray437) {
				Class46.anObjectArray437 = (new Object[117597627 * IndexLoaders.aClass394_5831.anInt4785]);
			}
			Class46.anObjectArray437[i_170_] = new Integer(i_171_);
			client.anIntArray7222[(client.anInt7390 += 9095609) * 1033923721 - 1 & 0x1f] = i_170_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.WORLD_TILE == class184.aClass375_2286) {
			Class158_Sub1_Sub2.anInt10131 = ((stream.readByte128(2090412640) << 3) * 657999909);
			Class272.anInt3331 = stream.readUnsignedByte128(-2083264480) * 1822731553;
			Class458.anInt5495 = (stream.readByte128(1860551613) << 3) * 801275545;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.ICOMPONENT_SETTINGS == class184.aClass375_2286) {
			int i_172_ = stream.readShortLE128(602501853);
			if (65535 == i_172_) {
				i_172_ = -1;
			}
			int i_173_ = stream.readIntV2(-1820495375);
			int i_174_ = stream.readUnsignedShort();
			if (i_174_ == 65535) {
				i_174_ = -1;
			}
			int i_175_ = stream.readIntLE(452648918);
			Class470.method7825(745585795);
			for (int i_176_ = i_174_; i_176_ <= i_172_; i_176_++) {
				long l = i_176_ + ((long) i_173_ << 32);
				Class282_Sub10 class282_sub10 = (Class282_Sub10) client.aClass465_7405.method7754(l);
				Class282_Sub10 class282_sub10_177_;
				if (class282_sub10 == null) {
					if (-1 == i_176_) {
						class282_sub10_177_ = new Class282_Sub10(i_175_, (Class117.method1981(i_173_, (byte) 67).aClass282_Sub10_1364.anInt7541) * 1831058647);
					} else {
						class282_sub10_177_ = new Class282_Sub10(i_175_, -1);
					}
				} else {
					class282_sub10_177_ = new Class282_Sub10(i_175_, (1831058647 * class282_sub10.anInt7541));
					class282_sub10.unlink(-371378792);
				}
				client.aClass465_7405.method7765(class282_sub10_177_, l);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4375) {
			int i_178_ = stream.readUnsignedByte();
			int i_179_ = stream.readBigSmart();
			if (client.aClass281Array7180[i_178_] != null) {
				client.aClass281Array7180[i_178_].method4979(IndexLoaders.MAP_REGION_DECODER.method4430(-1999339488), -617722573);
				client.aClass281Array7180[i_178_] = null;
			}
			if (-1 != i_179_) {
				client.aClass281Array7180[i_178_] = new Class281(Renderers.SOFTWARE_RENDERER, stream, i_179_);
				client.aClass281Array7180[i_178_].method4978(IndexLoaders.MAP_REGION_DECODER.method4430(-1306272287), (byte) -1);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4404 == class184.aClass375_2286) {
			Class185.method3077(1093107755);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4405 == class184.aClass375_2286) {
			int i_180_ = stream.readInt();
			int i_181_ = stream.readInt();
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4595, class184.aClass432_2283, 2042092);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV2(i_180_, (byte) 104);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeIntV1(i_181_, -1650869516);
			class282_sub23.aClass282_Sub35_Sub2_7682.write128Byte(457052913 * client.anInt3253, -826747048);
			class184.method3049(class282_sub23, -917310259);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4464 == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4216, 1197049024);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4474) {
			int i_182_ = stream.readUnsignedShort();
			byte i_183_ = stream.readByte((short) -15680);
			if (null == Class46.anObjectArray437) {
				Class46.anObjectArray437 = (new Object[117597627 * IndexLoaders.aClass394_5831.anInt4785]);
			}
			Class46.anObjectArray437[i_182_] = new Integer(i_183_);
			client.anIntArray7222[(client.anInt7390 += 9095609) * 1033923721 - 1 & 0x1f] = i_182_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4458 == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4205, 1052430539);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4393 == class184.aClass375_2286) {
			int i_184_ = stream.readUnsignedByteC(726740720);
			int i_185_ = stream.readShortLE((byte) -122);
			boolean bool = 1 == (i_184_ & 0x1);
			Class29.method788(i_185_, bool, -2088356489);
			client.anIntArray7381[(client.anInt7382 += 940885317) * 280036749 - 1 & 0x1f] = i_185_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4491 == class184.aClass375_2286) {
			if (Class282_Sub17.method12259(-1741204137 * client.anInt7166, -1298993736)) {
				client.anInt7178 = (int) (stream.readUnsignedShort() * 2.5F) * -1706714701;
			} else {
				client.anInt7178 = stream.readUnsignedShort() * 338166522;
			}
			client.anInt7397 = 1520234947 * client.anInt7347;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4479 == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4214, 1188928157);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4392) {
			Class458.anInt5495 = ((stream.read128Byte((short) 15542) << 3) * 801275545);
			Class158_Sub1_Sub2.anInt10131 = ((stream.readByte((short) -16828) << 3) * 657999909);
			Class272.anInt3331 = stream.readUnsignedByte() * 1822731553;
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(902676925);
			for (Class282_Sub29 class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7750(-1866877180)); null != class282_sub29; class282_sub29 = ((Class282_Sub29) client.aClass465_7414.method7751((byte) 48))) {
				int i_186_ = (int) ((-3442165056282524525L * class282_sub29.data >> 28) & 0x3L);
				int i_187_ = (int) (class282_sub29.data * -3442165056282524525L & 0x3fffL);
				int i_188_ = i_187_ - class219.anInt2711 * 1948093437;
				int i_189_ = (int) ((class282_sub29.data * -3442165056282524525L >> 14) & 0x3fffL);
				int i_190_ = i_189_ - -1002240017 * class219.anInt2712;
				if (i_186_ == Class272.anInt3331 * -1258088735 && i_188_ >= -2109540951 * Class458.anInt5495 && i_188_ < 8 + Class458.anInt5495 * -2109540951 && i_190_ >= 71472045 * Class158_Sub1_Sub2.anInt10131 && i_190_ < Class158_Sub1_Sub2.anInt10131 * 71472045 + 8) {
					class282_sub29.unlink(-371378792);
					if (i_188_ >= 0 && i_190_ >= 0 && (i_188_ < IndexLoaders.MAP_REGION_DECODER.method4424(-359634463)) && (i_190_ < IndexLoaders.MAP_REGION_DECODER.method4451(-542957162))) {
						Class434_Sub1.method12760((Class272.anInt3331 * -1258088735), i_188_, i_190_, -1380263584);
					}
				}
			}
			for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7775.head((byte) 94)); null != class282_sub31; class282_sub31 = (Class282_Sub31) Class282_Sub31.aClass482_7775.next(-766641666)) {
				if ((37618455 * class282_sub31.anInt7762 >= -2109540951 * Class458.anInt5495) && (37618455 * class282_sub31.anInt7762 < 8 + -2109540951 * Class458.anInt5495) && (class282_sub31.anInt7763 * -322610393 >= Class158_Sub1_Sub2.anInt10131 * 71472045) && (-322610393 * class282_sub31.anInt7763 < 71472045 * Class158_Sub1_Sub2.anInt10131 + 8) && (-1258088735 * Class272.anInt3331 == (class282_sub31.anInt7764 * 1291499461))) {
					class282_sub31.aBool7774 = true;
				}
			}
			for (Class282_Sub31 class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7776.head((byte) 125)); null != class282_sub31; class282_sub31 = ((Class282_Sub31) Class282_Sub31.aClass482_7776.next(804942724))) {
				if ((class282_sub31.anInt7762 * 37618455 >= -2109540951 * Class458.anInt5495) && (class282_sub31.anInt7762 * 37618455 < 8 + Class458.anInt5495 * -2109540951) && (class282_sub31.anInt7763 * -322610393 >= 71472045 * Class158_Sub1_Sub2.anInt10131) && (class282_sub31.anInt7763 * -322610393 < Class158_Sub1_Sub2.anInt10131 * 71472045 + 8) && (Class272.anInt3331 * -1258088735 == (1291499461 * class282_sub31.anInt7764))) {
					class282_sub31.aBool7774 = true;
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4487 == class184.aClass375_2286) {
			int i_191_ = stream.readUnsignedShort();
			if (i_191_ == 65535) {
				i_191_ = -1;
			}
			int i_192_ = stream.readUnsignedByte();
			int i_193_ = stream.readUnsignedShort();
			int i_194_ = stream.readUnsignedByte();
			int i_195_ = stream.readUnsignedShort();
			Class153.method2618(i_191_, i_192_, i_193_, i_194_, i_195_, 1278035776);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4372 == class184.aClass375_2286) {
			boolean bool = stream.readUnsignedByte() == 1;
			Class470.method7825(1191925088);
			Class96_Sub6.aBool9173 = bool;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4441) {
			stream.index += -1168581204;
			if (stream.method13105((byte) 80)) {
				Class496.method8309(stream, (stream.index * -1990677291) - 28, 1177161322);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4430) {
			int i_196_ = stream.readUnsignedByte();
			int i_197_ = i_196_ >> 5;
			int i_198_ = i_196_ & 0x1f;
			if (i_198_ == 0) {
				client.aClass180Array7348[i_197_] = null;
				class184.aClass375_2286 = null;
				return true;
			}
			Class180 class180 = new Class180();
			class180.anInt2236 = i_198_ * -860161943;
			class180.anInt2240 = stream.readUnsignedByte() * -2076609299;
			if (class180.anInt2240 * -1923151643 >= 0 && (class180.anInt2240 * -1923151643 < Class391.aClass160Array4778.length)) {
				if (class180.anInt2236 * -379447335 == 1 || class180.anInt2236 * -379447335 == 10) {
					class180.anInt2238 = (stream.readUnsignedShort() * -1443656627);
					class180.anInt2244 = (stream.readUnsignedShort() * 2120479369);
					stream.index += -166940172;
				} else if (class180.anInt2236 * -379447335 >= 2 && class180.anInt2236 * -379447335 <= 6) {
					if (-379447335 * class180.anInt2236 == 2) {
						class180.anInt2243 = -1353024768;
						class180.anInt2235 = 1980974848;
					}
					if (class180.anInt2236 * -379447335 == 3) {
						class180.anInt2243 = 0;
						class180.anInt2235 = 1980974848;
					}
					if (class180.anInt2236 * -379447335 == 4) {
						class180.anInt2243 = 1588917760;
						class180.anInt2235 = 1980974848;
					}
					if (5 == class180.anInt2236 * -379447335) {
						class180.anInt2243 = -1353024768;
						class180.anInt2235 = 0;
					}
					if (6 == class180.anInt2236 * -379447335) {
						class180.anInt2243 = -1353024768;
						class180.anInt2235 = -333017600;
					}
					class180.anInt2236 = -1720323886;
					class180.anInt2239 = (stream.readUnsignedByte() * 665145419);
					Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(2046392322);
					class180.anInt2243 += ((stream.readUnsignedShort() - class219.anInt2711 * 1948093437) << 9) * -1582343557;
					class180.anInt2235 += ((stream.readUnsignedShort() - -1002240017 * class219.anInt2712) << 9) * -1351216313;
					class180.anInt2241 = ((stream.readUnsignedByte() << 2) * -912841119);
					class180.anInt2237 = (stream.readUnsignedShort() * 1144190707);
				}
				class180.anInt2242 = stream.readInt() * -669014749;
				client.aClass180Array7348[i_197_] = class180;
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4429) {
			int i_199_ = stream.readUnsignedByte128(-1139286912) * 4;
			int i_200_ = stream.readUnsignedShortLE128(-1358044133);
			int i_201_ = stream.readShortLE((byte) -25);
			int i_202_ = stream.readShort(1661284878);
			int i_203_ = stream.readUnsignedByte128(-850673914);
			int i_204_ = stream.readUnsignedShort128();
			int i_205_ = stream.readUnsignedShort();
			int i_206_ = stream.readShortLE128(602501853);
			int i_207_ = stream.readShortLE128(602501853);
			int i_208_ = stream.readUnsignedByte128(-1518251062);
			if (255 == i_208_) {
				i_208_ = -1;
			}
			int i_209_ = stream.readByteC(-1483186607);
			int i_210_ = stream.readByteC(616572083);
			int i_211_ = stream.readUnsignedShort128();
			int i_212_ = stream.readUnsignedByteC(-1005375060);
			boolean bool = 0 != (i_203_ & 0x1);
			boolean bool_213_ = 0 != (i_203_ & 0x2);
			int i_214_ = bool_213_ ? i_203_ >> 2 : -1;
			if (bool_213_) {
				i_212_ = (byte) i_212_;
			} else {
				i_212_ *= 4;
			}
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(2057571253);
			int i_215_ = i_211_ - -398780422 * class219.anInt2711;
			int i_216_ = i_204_ - -2004480034 * class219.anInt2712;
			i_209_ += i_215_;
			i_210_ += i_216_;
			if (i_215_ >= 0 && i_216_ >= 0 && i_215_ < IndexLoaders.MAP_REGION_DECODER.method4424(1885615957) * 2 && i_216_ < IndexLoaders.MAP_REGION_DECODER.method4424(1685736884) * 2 && i_209_ >= 0 && i_210_ >= 0 && i_209_ < IndexLoaders.MAP_REGION_DECODER.method4451(-1422128606) * 2 && i_210_ < IndexLoaders.MAP_REGION_DECODER.method4451(-1745798122) * 2 && i_207_ != 65535) {
				i_215_ = 256 * i_215_;
				i_216_ = 256 * i_216_;
				i_209_ = 256 * i_209_;
				i_210_ = 256 * i_210_;
				i_212_ <<= 2;
				i_199_ <<= 2;
				i_205_ <<= 2;
				Class438.method7335(i_207_, i_200_, i_202_, i_214_, i_212_, i_199_, i_215_, i_216_, i_209_, i_210_, i_206_, i_201_, i_208_, i_205_, bool, 1771137455);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4358 == class184.aClass375_2286) {
			boolean bool = stream.readUnsignedByte() == 1;
			byte[] is = new byte[715663393 * class184.anInt2287 - 1];
			stream.readBytes(is, 0, (class184.anInt2287 * 715663393) - 1, 1093492861);
			Class151.method2589(bool, is, -1912381757);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.VARPBIT_2) {
			int i_217_ = stream.readIntV2(-1778621836);
			int i_218_ = stream.readUnsignedShort128();
			Class158_Sub1.aClass3_8507.method268(i_218_, i_217_, -1714881897);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4362) {
			int i_219_ = stream.readShortLE128(602501853);
			Class470.method7825(869737055);
			Class92.method1563(i_219_, 1917715893);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4488) {
			client.anInt7192 = client.anInt7347 * 1441449451;
			boolean bool = stream.readUnsignedByte() == 1;
			if (715663393 * class184.anInt2287 == 1) {
				if (bool) {
					Class58.aClass61_528 = null;
				} else {
					Class282_Sub13.aClass61_7587 = null;
				}
				class184.aClass375_2286 = null;
				return true;
			}
			if (bool) {
				Class58.aClass61_528 = new Class61(stream);
			} else {
				Class282_Sub13.aClass61_7587 = new Class61(stream);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4457) {
			int i_220_ = stream.readUnsignedShort();
			Class470.method7825(711453188);
			Class123.method2152(i_220_, -1865446551);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4450 == class184.aClass375_2286) {
			int i_221_ = stream.readUnsignedShort();
			int i_222_ = stream.readUnsignedByte();
			boolean bool = (i_222_ & 0x1) == 1;
			while (-1990677291 * stream.index < 715663393 * class184.anInt2287) {
				int i_223_ = stream.readUnsignedSmart(1532067241);
				int i_224_ = stream.readUnsignedShort();
				int i_225_ = 0;
				if (i_224_ != 0) {
					i_225_ = stream.readUnsignedByte();
					if (i_225_ == 255) {
						i_225_ = stream.readInt();
					}
				}
				Class282_Sub21.method12353(i_221_, i_223_, i_224_ - 1, i_225_, bool, -1281904163);
			}
			client.anIntArray7381[(client.anInt7382 += 940885317) * 280036749 - 1 & 0x1f] = i_221_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.PING == class184.aClass375_2286) {
			class184.aClass375_2286 = null;
			return false;
		}
		if (class184.aClass375_2286 == IncomingPacket.CONFIG_1) {
			byte i_226_ = stream.readByte((short) -12957);
			int i_227_ = stream.readShortLE128(602501853);
			Class158_Sub1.aClass3_8507.method281(i_227_, i_226_, (byte) 16);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4359) {
			int i_228_ = stream.readUnsigned128Byte();
			int i_229_ = stream.readUnsignedByte();
			int i_230_ = stream.readUnsignedByteC(1030625671);
			int i_231_ = stream.readInt();
			int i_232_ = stream.readIntV1();
			int i_233_ = i_232_ >> 28;
			int i_234_ = i_232_ >> 14 & 0x3fff;
			int i_235_ = i_232_ & 0x3fff;
			Class320.method5731(i_233_, i_234_, i_235_, i_228_, i_230_, i_231_, i_229_, -595463761);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4497 == class184.aClass375_2286) {
			if (-1 != client.anInt7349 * -1699899559) {
				Class383.method6514(client.anInt7349 * -1699899559, 0, 1952807696);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4370 == class184.aClass375_2286) {
			String string = stream.readString(-124894785);
			boolean bool = stream.readUnsignedByte() == 1;
			String string_236_;
			if (bool) {
				string_236_ = stream.readString(1182748583);
			} else {
				string_236_ = string;
			}
			int i_237_ = stream.readUnsignedShort();
			byte i_238_ = stream.readByte((short) -18288);
			boolean bool_239_ = false;
			if (-128 == i_238_) {
				bool_239_ = true;
			}
			if (bool_239_) {
				if (0 == Class459.anInt5534 * -1772444859) {
					class184.aClass375_2286 = null;
					return true;
				}
				boolean bool_240_ = false;
				int i_241_;
				for (i_241_ = 0; (i_241_ < Class459.anInt5534 * -1772444859 && (!Class467.aClass173Array5575[i_241_].aString2127.equals(string_236_) || -774562077 * (Class467.aClass173Array5575[i_241_].anInt2131) != i_237_)); i_241_++) {
					/* empty */
				}
				if (i_241_ < -1772444859 * Class459.anInt5534) {
					for (/**/; i_241_ < Class459.anInt5534 * -1772444859 - 1; i_241_++) {
						Class467.aClass173Array5575[i_241_] = Class467.aClass173Array5575[i_241_ + 1];
					}
					Class459.anInt5534 -= -1461487731;
					Class467.aClass173Array5575[(Class459.anInt5534 * -1772444859)] = null;
				}
			} else {
				String string_242_ = stream.readString(14652935);
				Class173 class173 = new Class173();
				class173.aString2129 = string;
				class173.aString2127 = string_236_;
				class173.aString2128 = Class383.method6515(class173.aString2127, 1942118537);
				class173.anInt2131 = 1704138443 * i_237_;
				class173.aByte2126 = i_238_;
				class173.aString2130 = string_242_;
				int i_243_;
				for (i_243_ = -1772444859 * Class459.anInt5534 - 1; i_243_ >= 0; i_243_--) {
					int i_244_ = Class467.aClass173Array5575[i_243_].aString2128.compareTo(class173.aString2128);
					if (0 == i_244_) {
						Class467.aClass173Array5575[i_243_].anInt2131 = i_237_ * 1704138443;
						Class467.aClass173Array5575[i_243_].aByte2126 = i_238_;
						Class467.aClass173Array5575[i_243_].aString2130 = string_242_;
						if (string_236_.equals(Class84.myPlayer.displayName)) {
							Class48_Sub2.aByte9263 = i_238_;
						}
						client.anInt7179 = client.anInt7347 * 318487303;
						class184.aClass375_2286 = null;
						return true;
					}
					if (i_244_ < 0) {
						break;
					}
				}
				if (-1772444859 * Class459.anInt5534 >= Class467.aClass173Array5575.length) {
					class184.aClass375_2286 = null;
					return true;
				}
				for (int i_245_ = Class459.anInt5534 * -1772444859 - 1; i_245_ > i_243_; i_245_--) {
					Class467.aClass173Array5575[1 + i_245_] = Class467.aClass173Array5575[i_245_];
				}
				if (0 == Class459.anInt5534 * -1772444859) {
					Class467.aClass173Array5575 = new Class173[100];
				}
				Class467.aClass173Array5575[1 + i_243_] = class173;
				Class459.anInt5534 += -1461487731;
				if (string_236_.equals(Class84.myPlayer.displayName)) {
					Class48_Sub2.aByte9263 = i_238_;
				}
			}
			client.anInt7179 = 318487303 * client.anInt7347;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4383) {
			int i_246_ = stream.readIntV1();
			int i_247_ = stream.readShortLE128(602501853);
			int i_248_ = stream.readUnsignedShort();
			if (i_248_ == 65535) {
				i_248_ = -1;
			}
			int i_249_ = stream.readUnsignedShort128();
			if (65535 == i_249_) {
				i_249_ = -1;
			}
			Class470.method7825(-1105399171);
			for (int i_250_ = i_249_; i_250_ <= i_248_; i_250_++) {
				long l = i_250_ + ((long) i_246_ << 32);
				Class282_Sub10 class282_sub10 = (Class282_Sub10) client.aClass465_7405.method7754(l);
				Class282_Sub10 class282_sub10_251_;
				if (null == class282_sub10) {
					if (i_250_ == -1) {
						class282_sub10_251_ = new Class282_Sub10((Class117.method1981(i_246_, (byte) 100).aClass282_Sub10_1364.anInt7547) * 488242129, i_247_);
					} else {
						class282_sub10_251_ = new Class282_Sub10(0, i_247_);
					}
				} else {
					class282_sub10_251_ = new Class282_Sub10((class282_sub10.anInt7547 * 488242129), i_247_);
					class282_sub10.unlink(-371378792);
				}
				client.aClass465_7405.method7765(class282_sub10_251_, l);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4384 == class184.aClass375_2286) {
			int i_252_ = stream.readUnsignedByte128(-1543145246);
			int i_253_ = stream.readInt();
			Class470.method7825(278578436);
			Class149_Sub4.method14663(i_253_, i_252_, (byte) 0);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4480 == class184.aClass375_2286) {
			client.anInt7395 = client.anInt7347 * -79413035;
			boolean bool = stream.readUnsignedByte() == 1;
			Class349 class349 = new Class349(stream);
			Class282_Sub4 class282_sub4;
			if (bool) {
				class282_sub4 = Class113.aClass282_Sub4_1235;
			} else {
				class282_sub4 = Class202_Sub1.aClass282_Sub4_8186;
			}
			class349.method6179(class282_sub4, (short) -12831);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.REGION) {
			RsBitsBuffer class282_sub35_sub2_254_ = new RsBitsBuffer(class184.anInt2287 * 715663393);
			System.arraycopy((class184.aClass282_Sub35_Sub2_2284.buffer), (class184.aClass282_Sub35_Sub2_2284.index) * -1990677291, class282_sub35_sub2_254_.buffer, 0, 715663393 * class184.anInt2287);
			Class414.method6989(1407669515);
			if (Class393.aClass282_Sub54_4783.aClass468_Sub3_8199.method12632(621836544) == 1) {
				IndexLoaders.MAP_REGION_LOADER_THREAD.method6049(new Class335(Class256.aClass256_3158, class282_sub35_sub2_254_), 301123709);
			} else {
				IndexLoaders.MAP_REGION_DECODER.method4499(new Class335(Class256.aClass256_3158, class282_sub35_sub2_254_), 1089182926);
			}
			class184.aClass375_2286 = null;
			return false;
		}
		if (IncomingPacket.REMOVE_GROUND_ITEM == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4207, 915834659);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4417) {
			int i_255_ = stream.readIntV2(-433591239);
			int i_256_ = stream.readInt();
			Class470.method7825(1816561941);
			Class184.method3069(i_256_, i_255_, 393215246);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4351 == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4218, 385099520);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4381 == class184.aClass375_2286) {
			int i_257_ = stream.readIntV2(-389607229);
			int i_258_ = stream.readShortLE128(602501853);
			Class158_Sub1.aClass3_8507.method281(i_258_, i_257_, (byte) -17);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4407 == class184.aClass375_2286) {
			int i_259_ = stream.readInt();
			Class470.method7825(-1159345533);
			Class282_Sub44 class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7754(i_259_));
			if (class282_sub44 != null) {
				Class351.method6196(class282_sub44, true, false, -1452683291);
			}
			if (null != client.aClass118_7352) {
				Class109.method1858(client.aClass118_7352, (byte) 55);
				client.aClass118_7352 = null;
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4490 == class184.aClass375_2286) {
			int i_260_ = stream.readInt();
			int i_261_ = stream.readUnsignedByte();
			int i_262_ = stream.readUnsignedByte();
			client.anIntArray7338[i_261_] = i_260_;
			client.anIntArray7336[i_261_] = i_262_;
			client.anIntArray7337[i_261_] = 1;
			int i_263_ = Class516.anIntArray5895[i_261_] - 1;
			for (int i_264_ = 0; i_264_ < i_263_; i_264_++) {
				if (i_260_ >= Class516.anIntArray5896[i_264_]) {
					client.anIntArray7337[i_261_] = 2 + i_264_;
				}
			}
			client.anIntArray7283[(client.anInt7384 += 1513865569) * 260874913 - 1 & 0x1f] = i_261_;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4453 == class184.aClass375_2286) {
			byte i_265_ = stream.readByte((short) -5973);
			int i_266_ = stream.readUnsignedByteC(-1202169109);
			Class470.method7825(-603286899);
			Class52_Sub2.method14501(i_265_, i_266_, 1624203213);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4440) {
			Class46.anObjectArray437 = new Object[117597627 * IndexLoaders.aClass394_5831.anInt4785];
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4495) {
			int i_267_ = stream.readIntV2(-544566311);
			int i_268_ = stream.readShortLE((byte) -57); //TODO possibly
			int i_269_ = stream.readShortLE((byte) -93);
			int i_270_ = stream.readUnsignedByte();
			Class470.method7825(-126108182);
			Class506.method8722(i_267_, i_270_, i_268_, i_269_, 1767108719);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4397 == class184.aClass375_2286) {
			boolean bool = stream.readUnsigned128Byte() == 1;
			int i_271_ = stream.readIntV2(-247300590);
			Class470.method7825(1854453567);
			Class199.method3252(i_271_, bool, -1395501412);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4352 == class184.aClass375_2286) {
			int i_272_ = stream.readUnsignedByte();
			Class466 class466 = (Class466) Class386.method6672(Class335.method5963(-5009614), i_272_, -2108912489);
			if (class466 == null) {
				class466 = Class466.aClass466_5563;
			}
			JS5CacheRequest.method14949(class466, 1453204131);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4508) {
			Class504.anInt5832 = stream.read24BitInteger(1949038328) * 1346472513;
			client.aBool7224 = stream.readUnsignedByte() == 1;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4410) {
			int i_273_ = stream.readIntLE(1863808126);
			int i_274_ = stream.readUnsignedByte();
			int i_275_ = stream.readIntV1();
			int i_276_ = stream.readUnsignedShort();
			int i_277_ = stream.readInt();
			int i_278_ = stream.readIntV1();
			int i_279_ = stream.readIntV1();
			int i_280_ = stream.readShortLE((byte) -104);
			Class470.method7825(726119231);
			Class31.method812(i_278_, new Class282_Sub44_Sub2(i_276_, i_274_, i_280_), new int[] { i_275_, i_277_, i_279_, i_273_ }, false, (byte) 25);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4502) {
			client.anInt7192 = client.anInt7347 * 1441449451;
			boolean bool = stream.readUnsignedByte() == 1;
			Class348 class348 = new Class348(stream);
			Class61 class61;
			if (bool) {
				class61 = Class58.aClass61_528;
			} else {
				class61 = Class282_Sub13.aClass61_7587;
			}
			class348.method6173(class61, -1753022365);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4421 == class184.aClass375_2286) {
			int i_281_ = stream.readUnsigned128Byte();
			int i_282_ = stream.readUnsigned128Byte();
			if (i_281_ == 255) {
				i_281_ = -1;
				i_282_ = -1;
			}
			Defaults8Loader.method11155(i_281_, i_282_, -1859663619);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4505 == class184.aClass375_2286) {
			Class187.anInt2363 = stream.readUnsignedByte() * 208004807;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4402) {
			int i_283_ = stream.readUnsignedShort128();
			int i_284_ = stream.readIntLE(361228788);
			Class470.method7825(-963697092);
			Class282_Sub20_Sub21.method15381(i_284_, i_283_, -665241735);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.INTERFACE == class184.aClass375_2286) {
			int i_285_ = stream.readInt();
			int i_286_ = stream.readIntV2(-1694964243);
			int i_287_ = stream.readIntV2(-346063041);
			int i_288_ = stream.readShortLE128(602501853);
			int i_289_ = stream.readIntLE(514814036);
			int i_290_ = stream.readInt();
			int i_291_ = stream.readUnsignedByteC(1579852251);
			Class470.method7825(473378556);
			Class31.method812(i_290_, new Class282_Sub44(i_288_, i_291_), new int[] { i_285_, i_287_, i_286_, i_289_ }, false, (byte) 25);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4438) {
			int i_292_ = stream.readUnsignedByte();
			Class494 class494 = ((Class494) Class386.method6672(UnderlayIndexLoader.method8038((byte) 99), i_292_, -1560493235));
			if (class494 == null) {
				class494 = Class494.aClass494_5782;
			}
			Class468_Sub26.method12948(class494, -16711936);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4462 == class184.aClass375_2286) {
			String string = stream.readString(1700329070);
			int i_293_ = stream.readUnsignedByte128(-694816925);
			int i_294_ = stream.readShortLE128(602501853);
			if (65535 == i_294_) {
				i_294_ = -1;
			}
			int i_295_ = stream.readUnsignedByteC(1148216670);
			if (i_293_ >= 1 && i_293_ <= 8) {
				if (string.equalsIgnoreCase("null")) {
					string = null;
				}
				client.aStringArray7329[i_293_ - 1] = string;
				client.anIntArray7328[i_293_ - 1] = i_294_;
				client.aBoolArray7330[i_293_ - 1] = 0 == i_295_;
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4463) {
			int i_296_ = stream.readUnsignedShort();
			if (65535 == i_296_) {
				i_296_ = -1;
			}
			int i_297_ = stream.readInt();
			int i_298_ = stream.readIntV2(-1389778745);
			Class470.method7825(-586263541);
			Class96_Sub9.method14587(i_297_, i_296_, i_298_, (short) -342);
			ItemDefinitions class425 = IndexLoaders.ITEM_INDEX_LOADER.getItemDefinitions(i_296_, 985436598);
			Class149_Sub1.method14583(i_297_, 1752402275 * class425.anInt5058, 920448529 * class425.anInt5045, class425.modelZoom * -1468071943, -2105289855);
			Class28.method778(i_297_, class425.anInt5063 * 406372201, -1316014311 * class425.anInt5044, class425.anInt5074 * 701885681, (byte) 16);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4481 == class184.aClass375_2286) {
			int i_299_ = stream.readShortLE((byte) -74);
			int i_300_ = stream.readUnsignedShort128();
			int i_301_ = stream.readUnsignedShort128();
			int i_302_ = stream.readIntV2(-1297851300);
			Class470.method7825(754356437);
			Class96_Sub3.method13786(i_302_, 7, i_299_ << 16 | i_301_, i_300_, (byte) -41);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4354 == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4204, 1220604522);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4423 == class184.aClass375_2286) {
			int i_303_ = stream.readIntV1();
			Class470.method7825(627328237);
			Class96_Sub3.method13786(i_303_, 5, 1595512269 * client.anInt7315, 0, (byte) -60);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4428 == class184.aClass375_2286) {
			int i_304_ = stream.readShortLE128(602501853);
			if (65535 == i_304_) {
				i_304_ = -1;
			}
			Class332.method5930(i_304_, (byte) 38);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4492 == class184.aClass375_2286) {
			int i_305_ = stream.readUnsignedShort();
			Class443.method7421(i_305_, 2001451534);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.CREATE_OBJECT == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4208, 428929195);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4443 == class184.aClass375_2286) {
			String string = stream.readString(142927157);
			String string_306_ = Class182.method3044(Defaults7Loader.method8755(stream, (byte) 116), -1519993030);
			Class191.method3167(6, 0, string, string, string, string_306_, 1342704972);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.CREATE_GROUND_ITEM == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4206, 894121342);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4452 == class184.aClass375_2286) {
			client.anInt7434 = 741498541;
			client.anInt7386 = client.anInt7347 * 23579151;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.PLAYER_ON_ICOMPONENT) {
			int i_307_ = stream.readIntLE(760670522);
			Class470.method7825(889183110);
			Class96_Sub3.method13786(i_307_, 3, client.anInt7315 * 1595512269, 0, (byte) -81);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4426) {
			int i_308_ = stream.readIntLE(1055449742);
			if (Class354.anInt4112 * -1400898651 != i_308_) {
				Class354.anInt4112 = i_308_ * 544371757;
				Class210.method3614(Class397.aClass397_4812, -1, -1, (byte) 95);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4449) {
			JS5StandardRequester.method5560(stream, 715663393 * class184.anInt2287, -822486096);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.VARPBIT_1 == class184.aClass375_2286) {
			int i_309_ = stream.readUnsignedShort();
			int i_310_ = stream.readUnsignedByte128(-1075041075);
			Class158_Sub1.aClass3_8507.method268(i_309_, i_310_, -1140695527);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4361) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(2134921181);
			String string_311_ = string;
			if (bool) {
				string_311_ = stream.readString(1668974707);
			}
			long l = stream.readUnsignedShort();
			long l_312_ = stream.read24BitUnsignedInteger((short) 8384);
			int i_313_ = stream.readUnsignedByte();
			long l_314_ = (l << 32) + l_312_;
			boolean bool_315_ = false;
			while_120_: do {
				for (int i_316_ = 0; i_316_ < 100; i_316_++) {
					if (client.aLongArray7424[i_316_] == l_314_) {
						bool_315_ = true;
						break while_120_;
					}
				}
				if (i_313_ <= 1) {
					if (client.aBool7224 && !client.aBool7244 || client.aBool7325) {
						bool_315_ = true;
					} else if (Class280.method4975(string_311_, (byte) -73)) {
						bool_315_ = true;
					}
				}
			} while (false);
			if (!bool_315_) {
				client.aLongArray7424[-1307820429 * client.anInt7389] = l_314_;
				client.anInt7389 = 1022203579 * ((-1307820429 * client.anInt7389 + 1) % 100);
				String string_317_ = (Class182.method3044(Defaults7Loader.method8755(stream, (byte) 81), -1519993030));
				if (2 == i_313_) {
					MapRegionLoaderTask.method6070(7, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string_311_).toString(), string, string_317_, null, -1, 30927485);
				} else if (i_313_ == 1) {
					MapRegionLoaderTask.method6070(7, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string_311_).toString(), string, string_317_, null, -1, 30927485);
				} else {
					MapRegionLoaderTask.method6070(3, 0, string, string_311_, string, string_317_, null, -1, 30927485);
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.GLOBAL_CONFIG_2 == class184.aClass375_2286) {
			byte i_318_ = stream.read128Byte((short) -6566);
			int i_319_ = stream.readShortLE((byte) -105);
			Class470.method7825(865938232);
			Class393.method6751(i_319_, i_318_, 1876892604);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.CONFIG_2 == class184.aClass375_2286) {
			int i_320_ = stream.readInt();
			int i_321_ = stream.readIntV1();
			Class470.method7825(1770241922);
			Class282_Sub11_Sub1.method15435(i_321_, i_320_, (byte) -67);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4386 == class184.aClass375_2286) {
			int i_322_ = stream.readIntV2(-1649128015);
			int i_323_ = stream.readIntV2(-1377250026);
			Class470.method7825(-971334097);
			ObjectIndexLoader.method7917(i_323_, i_322_, (byte) 2);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4396) {
			int i_324_ = stream.readUnsignedShort();
			int i_325_ = stream.readUnsignedShort();
			int i_326_ = stream.readUnsignedShort();
			Class470.method7825(-958341641);
			if (Class468_Sub8.aClass98Array7889[i_324_] != null) {
				for (int i_327_ = i_325_; i_327_ < i_326_; i_327_++) {
					int i_328_ = stream.read24BitUnsignedInteger((short) 24020);
					if (i_327_ < (Class468_Sub8.aClass98Array7889[i_324_].aClass118Array998).length && (Class468_Sub8.aClass98Array7889[i_324_].aClass118Array998[i_327_]) != null) {
						Class468_Sub8.aClass98Array7889[i_324_].aClass118Array998[i_327_].anInt1414 = i_328_ * 1998608255;
					}
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4435 == class184.aClass375_2286) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4209, 408109448);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.PLAYER_UPDATE == class184.aClass375_2286) {
			Class282_Sub34.decodePlayerUpdate(stream, (class184.anInt2287 * 715663393), (byte) 3);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4371 == class184.aClass375_2286) {
			int i_329_ = stream.readUnsignedByte();
			int i_330_ = stream.readUnsignedByte();
			int i_331_ = stream.readUnsigned128Byte();
			int i_332_ = stream.readShortLE((byte) -27) << 2;
			int i_333_ = stream.readUnsignedByte128(-904691893);
			Class470.method7825(-450255418);
			Class225.method3794(i_330_, i_329_, i_332_, i_331_, i_333_, true, (byte) -1);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4432) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(-117632913);
			long l = stream.readUnsignedShort();
			long l_334_ = stream.read24BitUnsignedInteger((short) 7335);
			int i_335_ = stream.readUnsignedByte();
			long l_336_ = l_334_ + (l << 32);
			boolean bool_337_ = false;
			Object object = null;
			Class282_Sub4 class282_sub4 = (bool ? Class113.aClass282_Sub4_1235 : Class202_Sub1.aClass282_Sub4_8186);
			while_121_: do {
				if (null == class282_sub4) {
					bool_337_ = true;
				} else {
					for (int i_338_ = 0; i_338_ < 100; i_338_++) {
						if (client.aLongArray7424[i_338_] == l_336_) {
							bool_337_ = true;
							break while_121_;
						}
					}
					if (i_335_ <= 1) {
						if (client.aBool7224 && !client.aBool7244 || client.aBool7325) {
							bool_337_ = true;
						} else if (Class280.method4975(string, (byte) -47)) {
							bool_337_ = true;
						}
					}
				}
			} while (false);
			if (!bool_337_) {
				client.aLongArray7424[-1307820429 * client.anInt7389] = l_336_;
				client.anInt7389 = (1 + client.anInt7389 * -1307820429) % 100 * 1022203579;
				String string_339_ = (Class182.method3044(Defaults7Loader.method8755(stream, (byte) 54), -1519993030));
				int i_340_ = bool ? 41 : 44;
				if (i_335_ == 2 || 3 == i_335_) {
					MapRegionLoaderTask.method6070(i_340_, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), string, string_339_, class282_sub4.aString7501, -1, 30927485);
				} else if (1 == i_335_) {
					MapRegionLoaderTask.method6070(i_340_, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), string, string_339_, class282_sub4.aString7501, -1, 30927485);
				} else {
					MapRegionLoaderTask.method6070(i_340_, 0, string, string, string, string_339_, class282_sub4.aString7501, -1, 30927485);
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4507) {
			byte[] is = new byte[class184.anInt2287 * 715663393];
			stream.method14873(is, 0, (class184.anInt2287 * 715663393), (byte) 8);
			String string = Class344.method6118(is, 0, (class184.anInt2287 * 715663393), (byte) -124);
			if (client.aBool7310) {
				try {
					Class361.aClass361_4180.method6254(new Object[] { string }, (byte) 51);
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.PROJECTILE) {
			Class188.decodeTilestreamPacket(TilestreamPacket.PROJECTILE, 1406697126);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4442) {
			Class516.method8868(stream.readString(960810446), (byte) -72);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4412) {
			client.aBool7454 = stream.readUnsignedByte128(-2050851904) == 1;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4425) {
			while (-1990677291 * stream.index < 715663393 * class184.anInt2287) {
				boolean bool = stream.readUnsignedByte() == 1;
				String string = stream.readString(-671496562);
				String string_341_ = stream.readString(1916457897);
				int i_342_ = stream.readUnsignedShort();
				int i_343_ = stream.readUnsignedByte();
				boolean bool_344_ = stream.readUnsignedByte() == 1;
				String string_345_ = "";
				int i_346_ = -1;
				int i_347_ = 0;
				if (i_342_ > 0) {
					string_345_ = stream.readString(-81827729);
					i_346_ = stream.readUnsignedByte();
					i_347_ = stream.readInt();
				}
				for (int i_348_ = 0; i_348_ < 493536965 * client.anInt7449; i_348_++) {
					Class6 class6 = client.aClass6Array7452[i_348_];
					if (!bool) {
						if (string.equals(class6.aString37)) {
							if (i_342_ != class6.anInt39 * 1017482937) {
								boolean bool_349_ = true;
								for (Class275_Sub4 class275_sub4 = ((Class275_Sub4) client.aClass457_7350.method7659(301908602)); class275_sub4 != null; class275_sub4 = ((Class275_Sub4) client.aClass457_7350.method7650((byte) 73))) {
									if (class275_sub4.aString7837.equals(string)) {
										if (0 != i_342_ && (class275_sub4.aShort7839) == 0) {
											class275_sub4.method4887((byte) 2);
											bool_349_ = false;
										} else if (i_342_ == 0 && 0 != (class275_sub4.aShort7839)) {
											class275_sub4.method4887((byte) -38);
											bool_349_ = false;
										}
									}
								}
								if (bool_349_) {
									client.aClass457_7350.method7649(new Class275_Sub4(string, i_342_), 1701737919);
								}
								class6.anInt39 = i_342_ * 506730377;
							}
							class6.aString43 = string_341_;
							class6.aString40 = string_345_;
							class6.anInt41 = i_343_ * 1890140877;
							class6.anInt42 = -860892823 * i_346_;
							class6.aBool38 = bool_344_;
							class6.anInt44 = -1074941995 * i_347_;
							string = null;
							break;
						}
					} else if (string_341_.equals(class6.aString37)) {
						class6.aString37 = string;
						class6.aString43 = string_341_;
						string = null;
						break;
					}
				}
				if (string != null && 493536965 * client.anInt7449 < 200) {
					Class6 class6 = new Class6();
					client.aClass6Array7452[493536965 * client.anInt7449] = class6;
					class6.aString37 = string;
					class6.aString43 = string_341_;
					class6.anInt39 = i_342_ * 506730377;
					class6.aString40 = string_345_;
					class6.anInt41 = 1890140877 * i_343_;
					class6.anInt42 = i_346_ * -860892823;
					class6.aBool38 = bool_344_;
					class6.anInt44 = -1074941995 * i_347_;
					client.anInt7449 += -238893043;
				}
			}
			client.anInt7434 = 1482997082;
			client.anInt7386 = 23579151 * client.anInt7347;
			boolean bool = false;
			int i_350_ = client.anInt7449 * 493536965;
			do {
				if (i_350_ <= 0) {
					break;
				}
				bool = true;
				i_350_--;
				for (int i_351_ = 0; i_351_ < i_350_; i_351_++) {
					boolean bool_352_ = false;
					Class6 class6 = client.aClass6Array7452[i_351_];
					Class6 class6_353_ = client.aClass6Array7452[i_351_ + 1];
					if ((Class159.aClass450_2010.worldId * -87869981 != class6.anInt39 * 1017482937) && (-87869981 * Class159.aClass450_2010.worldId == 1017482937 * class6_353_.anInt39)) {
						bool_352_ = true;
					}
					if (!bool_352_ && 1017482937 * class6.anInt39 == 0 && class6_353_.anInt39 * 1017482937 != 0) {
						bool_352_ = true;
					}
					if (!bool_352_ && !class6.aBool38 && class6_353_.aBool38) {
						bool_352_ = true;
					}
					if (bool_352_) {
						Class6 class6_354_ = client.aClass6Array7452[i_351_];
						client.aClass6Array7452[i_351_] = client.aClass6Array7452[1 + i_351_];
						client.aClass6Array7452[1 + i_351_] = class6_354_;
						bool = false;
					}
				}
			} while (!bool);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4498 == class184.aClass375_2286) {
			int i_355_ = stream.readInt();
			Class119.aClass12_1461 = new Class12(i_355_);
			Thread thread = new Thread(Class119.aClass12_1461);
			thread.setPriority(1);
			thread.start();
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4365) {
			int i_356_ = stream.readIntV2(-1544593371);
			int i_357_ = stream.readInt();
			Class470.method7825(1577365213);
			Class282_Sub44 class282_sub44 = ((Class282_Sub44) client.aClass465_7442.method7754(i_357_));
			Class282_Sub44 class282_sub44_358_ = ((Class282_Sub44) client.aClass465_7442.method7754(i_356_));
			if (null != class282_sub44_358_) {
				Class351.method6196(class282_sub44_358_, (class282_sub44 == null || (class282_sub44.anInt8063 * 587626901 != 587626901 * (class282_sub44_358_.anInt8063))), false, -1298031252);
			}
			if (class282_sub44 != null) {
				class282_sub44.unlink(-371378792);
				client.aClass465_7442.method7765(class282_sub44, i_356_);
			}
			Class118 class118 = Class117.method1981(i_357_, (byte) 29);
			if (null != class118) {
				Class109.method1858(class118, (byte) -6);
			}
			class118 = Class117.method1981(i_356_, (byte) 46);
			if (null != class118) {
				Class109.method1858(class118, (byte) 22);
				Class12.method483((Class468_Sub8.aClass98Array7889[class118.anInt1287 * -1952846363 >>> 16]), class118, true, -460404316);
			}
			if (client.anInt7349 * -1699899559 != -1) {
				Class383.method6514(client.anInt7349 * -1699899559, 1, 1200373841);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4461 == class184.aClass375_2286) {
			int i_359_ = stream.readUnsignedShort();
			client.anInt7357 = 1562805881;
			client.anInt7231 = i_359_ * -593633913;
			client.anInt7341 = -1004732507;
			IndexLoaders.CUTSCENE_INDEX.method5661(-1638311881 * client.anInt7231, -190684974);
			Class316.method5594(-559600711);
			Class228.method3851(-402153223);
			int i_360_ = stream.readUnsignedShort();
			Class262.anIntArrayArray3239 = new int[i_360_][4];
			for (int i_361_ = 0; i_361_ < i_360_; i_361_++) {
				for (int i_362_ = 0; i_362_ < 4; i_362_++) {
					Class262.anIntArrayArray3239[i_361_][i_362_] = stream.readInt();
				}
			}
			int i_363_ = stream.readUnsignedByte();
			Class276.aClass282_Sub35_3346 = new RsByteBuffer(i_363_);
			Class276.aClass282_Sub35_3346.writeBytes(stream.buffer, stream.index * -1990677291, i_363_);
			stream.index += -1115476867 * i_363_;
			class184.aClass375_2286 = null;
			return false;
		}
		if (class184.aClass375_2286 == IncomingPacket.DESTROY_OBJECT) {
			Class188.decodeTilestreamPacket(TilestreamPacket.aClass364_4213, 1743263242);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4394) {
			int i_364_ = stream.readInt();
			boolean bool = stream.readUnsignedByteC(-999919017) == 1;
			if (Class469.aBool5585 != bool || -1003441631 * Class232.anInt2879 != i_364_) {
				Class469.aBool5585 = bool;
				Class232.anInt2879 = -336113183 * i_364_;
				Class210.method3614(Class397.aClass397_4803, -1, -1, (byte) 27);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4385 == class184.aClass375_2286) {
			int i_365_ = stream.readUnsignedShort128();
			int i_366_ = stream.readIntLE(1332722479);
			int i_367_ = stream.readUnsignedByteC(1811840250);
			int i_368_ = stream.readInt();
			int i_369_ = stream.readIntLE(1807832897);
			int i_370_ = stream.readShortLE128(602501853);
			int i_371_ = stream.readInt();
			int i_372_ = stream.readInt();
			Class470.method7825(1088980855);
			Class31.method812(i_368_, new Class282_Sub44_Sub1(i_370_, i_367_, i_365_), new int[] { i_372_, i_366_, i_371_, i_369_ }, false, (byte) 46);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4489 == class184.aClass375_2286) {
			int i_373_ = stream.readUnsignedByte();
			boolean bool = 1 == (i_373_ & 0x1);
			String string = stream.readString(1684657970);
			String string_374_ = stream.readString(-321858778);
			if (!bool) {
				Class10 class10 = new Class10();
				client.aClass10Array7456[-1754449153 * client.anInt7373] = class10;
				class10.aString115 = string;
				class10.aString116 = string_374_;
				class10.aBool117 = (i_373_ & 0x2) == 2;
				client.anInt7373 += -637942529;
			} else {
				for (int i_375_ = 0; i_375_ < -1754449153 * client.anInt7373; i_375_++) {
					Class10 class10 = client.aClass10Array7456[i_375_];
					if (string_374_.equals(class10.aString115)) {
						class10.aString115 = string;
						class10.aString116 = string_374_;
						break;
					}
				}
			}
			client.anInt7386 = 23579151 * client.anInt7347;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4470 == class184.aClass375_2286) {
			int i_376_ = stream.readShortLE((byte) -15);
			String string = stream.readString(650950496);
			Class470.method7825(-929905527);
			MapRegion.method4562(i_376_, string, -1183230823);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.NPC_UPDATE) {
			Class540.decodeNPCUpdate(false, -1846664385);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4376 == class184.aClass375_2286) {
			boolean bool = stream.readUnsignedByte() == 1;
			String string = stream.readString(480845027);
			String string_377_ = string;
			if (bool) {
				string_377_ = stream.readString(841235351);
			}
			long l = stream.readLong(776681433);
			long l_378_ = stream.readUnsignedShort();
			long l_379_ = stream.read24BitUnsignedInteger((short) 8142);
			int i_380_ = stream.readUnsignedByte();
			long l_381_ = (l_378_ << 32) + l_379_;
			boolean bool_382_ = false;
			while_122_: do {
				for (int i_383_ = 0; i_383_ < 100; i_383_++) {
					if (l_381_ == client.aLongArray7424[i_383_]) {
						bool_382_ = true;
						break while_122_;
					}
				}
				if (i_380_ <= 1) {
					if (client.aBool7224 && !client.aBool7244 || client.aBool7325) {
						bool_382_ = true;
					} else if (Class280.method4975(string_377_, (byte) -112)) {
						bool_382_ = true;
					}
				}
			} while (false);
			if (!bool_382_) {
				client.aLongArray7424[-1307820429 * client.anInt7389] = l_381_;
				client.anInt7389 = (-1307820429 * client.anInt7389 + 1) % 100 * 1022203579;
				String string_384_ = (Class182.method3044(Defaults7Loader.method8755(stream, (byte) 107), -1519993030));
				if (2 == i_380_ || i_380_ == 3) {
					MapRegionLoaderTask.method6070(9, 0, new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(1, (byte) 0)).append(string_377_).toString(), string, string_384_, Class179.method3018(l), -1, 30927485);
				} else if (1 == i_380_) {
					MapRegionLoaderTask.method6070(9, 0, new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string).toString(), new StringBuilder().append(Class76.method1358(0, (byte) 0)).append(string_377_).toString(), string, string_384_, Class179.method3018(l), -1, 30927485);
				} else {
					MapRegionLoaderTask.method6070(9, 0, string, string_377_, string, string_384_, Class179.method3018(l), -1, 30927485);
				}
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.OBJECT_ANIMATION) {
			int i_385_ = stream.readIntV2(-1065611098);
			int i_386_ = i_385_ >> 28 & 0x3;
			int i_387_ = i_385_ >> 14 & 0x3fff;
			int i_388_ = i_385_ & 0x3fff;
			int i_389_ = stream.readIntLE(81001230);
			int i_390_ = stream.readUnsigned128Byte();
			int i_391_ = i_390_ >> 2;
			int i_392_ = i_390_ & 0x3;
			int i_393_ = client.anIntArray7230[i_391_];
			Class219 class219 = IndexLoaders.MAP_REGION_DECODER.method4519(1832979532);
			i_387_ -= class219.anInt2711 * 1948093437;
			i_388_ -= class219.anInt2712 * -1002240017;
			Class9.method455(i_386_, i_387_, i_388_, i_393_, i_391_, i_392_, i_389_, (byte) 1);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4455 == class184.aClass375_2286) {
			int i_394_ = stream.readUnsignedShort();
			if (65535 == i_394_) {
				i_394_ = -1;
			}
			int i_395_ = stream.readUnsignedByte();
			int i_396_ = stream.readUnsignedShort();
			int i_397_ = stream.readUnsignedByte();
			Class435.method7300(i_394_, i_395_, i_396_, i_397_, true, 256, 1449989045);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4448 == class184.aClass375_2286) {
			client.anInt7373 = stream.readUnsignedByte() * -637942529;
			for (int i_398_ = 0; i_398_ < client.anInt7373 * -1754449153; i_398_++) {
				Class10 class10 = new Class10();
				client.aClass10Array7456[i_398_] = class10;
				class10.aString115 = stream.readString(605886833);
				class10.aString116 = stream.readString(957168264);
				class10.aBool117 = false;
			}
			client.anInt7386 = client.anInt7347 * 23579151;
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4483 == class184.aClass375_2286) {
			int i_399_ = stream.readShortLE((byte) -26);
			int i_400_ = stream.readUnsignedShort();
			int i_401_ = stream.readUnsigned128Byte();
			int i_402_ = stream.readIntLE(576944061);
			Class470.method7825(1533122072);
			Class282_Sub28.method12420(i_402_, i_401_, i_400_, i_399_, 2108425103);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4364 == class184.aClass375_2286) {
			client.anInt7162 = stream.method13121(358505784) * 351447303;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4374) {
			int i_403_ = stream.readIntV2(-1532962648);
			int i_404_ = stream.readIntV2(-646638711);
			int i_405_ = stream.readUnsignedByte128(-1264346056);
			int i_406_ = stream.readInt();
			int i_407_ = stream.readIntV1();
			int i_408_ = stream.readUnsignedShort128();
			int i_409_ = stream.readUnsigned128Byte();
			int i_410_ = i_409_ >> 2;
			int i_411_ = i_409_ & 0x3;
			int i_412_ = stream.readInt();
			Class219 class219 = new Class219(stream.readIntV2(-1833365269));
			int i_413_ = stream.readInt();
			Class470.method7825(-1402446608);
			Class31.method812(i_403_, new Class282_Sub44_Sub4(i_408_, i_405_, new Class530(class219, i_410_, i_411_, i_413_)), new int[] { i_407_, i_406_, i_404_, i_412_ }, false, (byte) 10);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.aClass375_4445 == class184.aClass375_2286) {
			Class46.anObjectArray437 = null;
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4437) {
			if (Class475.aBool5623 && client.aFrame3260 != null) {
				Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-1706994104), -1, -1, false, (byte) 30);
			}
			byte[] is = new byte[class184.anInt2287 * 715663393];
			stream.method14873(is, 0, (class184.anInt2287 * 715663393), (byte) 8);
			String string = Class344.method6118(is, 0, (715663393 * class184.anInt2287), (byte) -8);
			String string_414_ = "opensn";
			if (!client.aBool7310 || !Class186.method3082(string, 1, string_414_, 145298920)) {
				Class508.method8736(string, true, Class393.aClass282_Sub54_4783.aClass468_Sub18_8230.method12776(-780399145) == 5, string_414_, client.aBool7158, client.aBool7159, (byte) -17);
			}
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.aClass375_4418) {
			int i_415_ = stream.readUnsignedShort128();
			int i_416_ = stream.readIntV2(-875618994); //TODO possible
			int i_417_ = stream.readShortLE((byte) -6);
			Class470.method7825(-1216270588);
			Class225_Sub2.method12882(i_416_, (i_417_ << 16) + i_415_, 1247559712);
			class184.aClass375_2286 = null;
			return true;
		}
		if (class184.aClass375_2286 == IncomingPacket.RUN_CS2_SCRIPT) {
			String string = stream.readString(435488422);
			Object[] objects = new Object[string.length() + 1];
			for (int i_418_ = string.length() - 1; i_418_ >= 0; i_418_--) {
				if (string.charAt(i_418_) == 's') {
					objects[i_418_ + 1] = stream.readString(1389732666);
				} else {
					objects[1 + i_418_] = new Integer(stream.readInt());
				}
			}
			objects[0] = new Integer(stream.readInt());
			Class470.method7825(14988826);
			Class282_Sub43 class282_sub43 = new Class282_Sub43();
			class282_sub43.anObjectArray8054 = objects;
			Class96_Sub4.method13790(class282_sub43, 502538057);
			class184.aClass375_2286 = null;
			return true;
		}
		if (IncomingPacket.NPC_UPDATE_LARGE == class184.aClass375_2286) {
			Class540.decodeNPCUpdate(true, -938480813);
			class184.aClass375_2286 = null;
			return true;
		}
		Class151.method2594(new StringBuilder().append(null != class184.aClass375_2286 ? 1694502249 * class184.aClass375_2286.anInt4512 : -1).append(Class2.aString14).append(class184.aClass375_2296 != null ? class184.aClass375_2296.anInt4512 * 1694502249 : -1).append(Class2.aString14).append(null != class184.aClass375_2291 ? class184.aClass375_2291.anInt4512 * 1694502249 : -1).append(" ").append(715663393 * class184.anInt2287).toString(), new RuntimeException(), (byte) -73);
		Class438.method7333(false, 2095335662);
		return true;
	}

	static final void method14434(CS2Executor class527, int i) {
		class527.anInt7000 -= -1341717846;
		Class533.method11404((String) (class527.objectStack[(1806726141 * class527.anInt7000)]), (String) (class527.objectStack[1 + (class527.anInt7000 * 1806726141)]), "", (class527.intStack[((class527.anInt7012 -= 141891001) * 1942118537)]) == 1, false, -94301647);
	}
}
