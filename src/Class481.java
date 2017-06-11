/* Class481 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public abstract class Class481 {
	int anInt6033;
	String aString6034;
	static int anInt6035;

	Socket method6110(int i) throws IOException {
		try {
			return new Socket(((Class481) this).aString6034, 98195689 * ((Class481) this).anInt6033);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tv.b(").append(')').toString());
		}
	}

	public abstract Socket method6111(int i) throws IOException;

	Class481() {
		/* empty */
	}

	public abstract Socket method6112() throws IOException;

	static final void decodeNPCsMasks(short i) {
		try {
			RsBitsBuffer stream = ((BufferedConnectionContext) client.gameConnection).stream;
			for (int i_0_ = 0; i_0_ < client.anInt8808 * -976358333; i_0_++) {
				int npcIndex = client.anIntArray8706[i_0_];
				NPC npc = ((NPC) (((Class298_Sub29) client.npcs.get((long) npcIndex)).anObject7366));

				int mask = stream.readUnsignedByte();
				if (0 != (mask & 0x2)) {
					mask += stream.readUnsignedByte() << 8;
				}
				if (0 != (mask & 0x8000)) {
					mask += stream.readUnsignedByte() << 16;
				}
				if ((mask & 0x10000) != 0) {
					mask += stream.readUnsignedByte() << 24;
				}
				if (0 != (mask & 0x20)) { // Force chat - ordinal 0
					npc.method4461(stream.readString(68173648), 0, 0, 973412325);
				}
				if ((mask & 0x10) != 0) { // Face entity - ordinal 1
					npc.anInt10090 = (stream.readUnsignedShortLE128(1478539457) * 283914955);
					if (65535 == (npc.anInt10090 * 1433412323)) {
						npc.anInt10090 = -283914955;
					}
				}
				if ((mask & 0x80000) != 0) { // Unidentified - ordinal 2
					npc.aByte10117 = stream.read128Byte(507762157);
					npc.aByte10108 = stream.read128Byte(-666954662);
					npc.aByte10109 = stream.readByteC(-154305803);
					npc.aByte10130 = (byte) stream.readUnsignedByte128(-1014855659);
					npc.anInt10105 = ((client.anInt8884 * 443738891 + stream.readUnsignedShortLE128(1478539457)) * 1828453179);
					npc.anInt10106 = ((client.anInt8884 * 443738891 + stream.readUnsignedShortLE128(1478539457)) * -473408095);
				}
				if (0 != (mask & 0x80)) { // Face location - ordinal 3
					npc.anInt10179 = (stream.readUnsignedShort128(-1091754982) * 1312461425);
					npc.anInt10180 = (stream.readUnsignedShortLE128(1478539457) * 2139727009);
				}
				if (0 != (mask & 0x8)) { // Animation - ordinal 4
					int[] is = new int[Class522.method6325((byte) -124).length];
					for (int i_3_ = 0; i_3_ < Class522.method6325((byte) -5).length; i_3_++) {
						is[i_3_] = stream.readBigSmart(1235052657);
					}
					int i_4_ = stream.readUnsignedByte();
					Class431.method5768(npc, is, i_4_, true, (byte) 108);
				}
				if ((mask & 0x200) != 0) { // Set render animation id - ordinal
											// 5
					npc.anInt10184 = (stream.readUnsignedShortLE((byte) -68) * -312753929);
					if (-1317338937 * npc.anInt10184 == 65535) {
						npc.anInt10184 = 312753929;
					}
				}
				if (0 != (mask & 0x2000)) { // ?? ordinal 6
					int i_5_ = stream.readUnsignedByte128(-1014855659);
					int[] is = new int[i_5_];
					int[] is_6_ = new int[i_5_];
					for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
						int i_8_ = stream.readUnsignedShort();
						if ((i_8_ & 0xc000) == 49152) {
							int i_9_ = stream.readUnsignedShortLE((byte) 11);
							is[i_7_] = i_8_ << 16 | i_9_;
						} else {
							is[i_7_] = i_8_;
						}
						is_6_[i_7_] = stream.readUnsignedShort();
					}
					npc.method4451(is, is_6_, 2082086484);
				}
				if (0 != (mask & 0x4)) { // Hit ? ordinal 7
					int i_10_ = stream.readUnsignedByteC((short) -3904);
					if (i_10_ > 0) {
						for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
							int i_12_ = -1;
							int i_13_ = -1;
							int i_14_ = -1;
							int i_15_ = stream.readUnsignedSmart(1723054621);
							if (i_15_ == 32767) {
								i_15_ = stream.readUnsignedSmart(1723054621);
								i_13_ = stream.readUnsignedSmart(1723054621);
								i_12_ = stream.readUnsignedSmart(1723054621);
								i_14_ = stream.readUnsignedSmart(1723054621);
							} else if (32766 != i_15_) {
								i_13_ = stream.readUnsignedSmart(1723054621);
							} else {
								i_15_ = -1;
							}
							int i_16_ = stream.readUnsignedSmart(1723054621);
							int i_17_ = stream.readUnsignedByte128(-1014855659);
							npc.method4420(i_15_, i_13_, i_12_, i_14_, client.anInt8884 * 443738891, i_16_, i_17_, (byte) 6);
						}
					}
				}
				if ((mask & 0x1000) != 0) {// ordinal 8
					int i_18_ = (npc.aClass503_10190.anIntArray6129).length;
					int i_19_ = 0;
					if (null != (npc.aClass503_10190.aShortArray6134))
						i_19_ = (npc.aClass503_10190.aShortArray6134).length;
					int i_20_ = 0;
					if ((npc.aClass503_10190.aShortArray6154) != null)
						i_20_ = (npc.aClass503_10190.aShortArray6154).length;
					int i_21_ = stream.readUnsignedByte();
					if (1 == (i_21_ & 0x1))
						npc.aClass498_10181 = null;
					else {
						int[] is = null;
						if ((i_21_ & 0x2) == 2) {
							is = new int[i_18_];
							for (int i_22_ = 0; i_22_ < i_18_; i_22_++) {
								is[i_22_] = stream.readBigSmart(1235052657);
							}
						}
						short[] is_23_ = null;
						if (4 == (i_21_ & 0x4)) {
							is_23_ = new short[i_19_];
							for (int i_24_ = 0; i_24_ < i_19_; i_24_++) {
								is_23_[i_24_] = (short) stream.readUnsignedShort();
							}
						}
						short[] is_25_ = null;
						if ((i_21_ & 0x8) == 8) {
							is_25_ = new short[i_20_];
							for (int i_26_ = 0; i_26_ < i_20_; i_26_++) {
								is_25_[i_26_] = (short) stream.readUnsignedShort();
							}
						}
						long l = ((long) npcIndex | (long) ((npc.anInt10182 += -230300471) * -156273287 - 1) << 32);
						npc.aClass498_10181 = new Class498(l, is, is_23_, is_25_);
					}
				}
				if ((mask & 0x2000000) != 0) { // Graphics 4 ordinal 9
					int graphicsId = stream.readUnsignedShort128(1014024931);
					int position = stream.readInt((byte) -18);
					if (graphicsId == 65535) {
						graphicsId = -1;
					}
					int graphicData = stream.readUnsignedByte128(-1014855659);
					int rotation = graphicData & 0x7;
					int i_31_ = graphicData >> 3 & 0xf;
					if (i_31_ == 15) {
						i_31_ = -1;
					}
					boolean bool = (graphicData >> 7 & 0x1) == 1;
					npc.sendGraphics(graphicsId, position, rotation, i_31_, bool, 3, 1962048388);
				}
				if ((mask & 0x40) != 0) { // Graphics 1 ordinal 10
					int graphicId = stream.readUnsignedShortLE128(1478539457);
					int positioning = stream.readIntV1(-416273786);
					if (graphicId == 65535) {
						graphicId = -1;
					}
					int i_34_ = stream.readUnsigned128Byte((byte) 76);
					int rotation = i_34_ & 0x7;
					int i_36_ = i_34_ >> 3 & 0xf;
					if (15 == i_36_) {
						i_36_ = -1;
					}
					boolean bool = 1 == (i_34_ >> 7 & 0x1);
					npc.sendGraphics(graphicId, positioning, rotation, i_36_, bool, 0, 2031478624);
				}
				if ((mask & 0x100) != 0) { // Graphics 2 ordinal 11
					int graphicId = stream.readUnsignedShort128(1324789017);
					int positioning = stream.readIntLE(-2017462427);
					if (65535 == graphicId)
						graphicId = -1;
					int i_39_ = stream.readUnsignedByteC((short) -19864);
					int rotation = i_39_ & 0x7;
					int i_41_ = i_39_ >> 3 & 0xf;
					if (i_41_ == 15)
						i_41_ = -1;
					boolean bool = 1 == (i_39_ >> 7 & 0x1);
					npc.sendGraphics(graphicId, positioning, rotation, i_41_, bool, 1, -774185979);
				}
				if ((mask & 0x4000) != 0) {// ordinal 12
					int i_42_ = stream.readUnsignedByteC((short) -15927);
					int[] is = new int[i_42_];
					int[] is_43_ = new int[i_42_];
					int[] is_44_ = new int[i_42_];
					for (int i_45_ = 0; i_45_ < i_42_; i_45_++) {
						int i_46_ = stream.readBigSmart(1235052657);
						is[i_45_] = i_46_;
						is_43_[i_45_] = stream.readUnsignedByteC((short) -8275);
						is_44_[i_45_] = stream.readUnsignedShortLE((byte) 48);
					}
					Class298_Sub37_Sub7.method3428(npc, is, is_43_, is_44_, 1644064563);
				}
				if ((mask & 0x400) != 0) {// ordinal 13
					int i_47_ = stream.readUnsignedShortLE128(1478539457);
					npc.anInt10088 = (stream.readUnsignedByte() * 918505277);
					npc.anInt10096 = (stream.readUnsigned128Byte((byte) 19) * -494980103);
					npc.aBoolean10119 = (i_47_ & 0x8000) != 0;
					npc.anInt10087 = (i_47_ & 0x7fff) * -257621575;
					npc.anInt10086 = (npc.anInt10088 * 1195117671 + (client.anInt8884 * 1208636921 + (-1132907677 * npc.anInt10087)));
				}
				if ((mask & 0x100000) != 0) {// ordinal 14
					npc.aClass73_10187.method816((byte) -105);
					int i_48_ = ((stream.buffer[(stream.index += 116413311) * 385051775 - 1]) & 0xff);
					for (int i_49_ = 0; i_49_ < i_48_; i_49_++) {
						int i_50_ = stream.readUnsignedShort();
						int i_51_ = stream.readIntV2((byte) 67);
						npc.aClass73_10187.method814(i_50_, i_51_, 304714746);
					}
				}
				if ((mask & 0x800) != 0) {// Force movement ordinal 15
					npc.anInt10098 = (stream.read128Byte(1984951178) * 1925713613);
					npc.anInt10100 = (stream.readByte(-12558881) * 516351707);
					npc.anInt10099 = (stream.readByteC(736826018) * 1712047767);
					npc.anInt10101 = (stream.readByteC(1643626542) * 2089924823);
					npc.anInt10095 = (stream.readUnsignedShortLE((byte) -54) + 443738891 * client.anInt8884) * 996079737;
					npc.anInt10103 = (stream.readUnsignedShortLE128(1478539457) + client.anInt8884 * 443738891) * 1000906529;
					npc.anInt10104 = (stream.readUnsignedShort128(-1999232161) * 1386670945);
					npc.anInt10098 += (npc.scenePositionXQueue[0] * 1925713613);
					npc.anInt10100 += (npc.scenePositionYQueue[0] * 516351707);
					npc.anInt10099 += (npc.scenePositionXQueue[0] * 1712047767);
					npc.anInt10101 += (npc.scenePositionYQueue[0] * 2089924823);
					npc.anInt10120 = -1013322787;
					npc.anInt10125 = 0;
				}
				if (0 != (mask & 0x400000)) {// ordinal 16
					int i_52_ = ((stream.buffer[(stream.index += 116413311) * 385051775 - 1]) & 0xff);
					for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
						int i_54_ = stream.readUnsignedByteC((short) -28984);
						int i_55_ = stream.readInt((byte) 38);
						int i_56_ = stream.read24BitUnsignedIntegerV2((byte) 8);
						npc.method4460(i_54_, i_55_, i_56_, -783761378);
					}
				}
				if (0 != (mask & 0x1000000)) { // Graphics 3 ordinal 17
					int graphicId = stream.readUnsignedShortLE128(1478539457);
					int positioning = stream.readInt((byte) 38);
					if (graphicId == 65535)
						graphicId = -1;
					int i_59_ = stream.readUnsigned128Byte((byte) 28);
					int rotation = i_59_ & 0x7;
					int i_61_ = i_59_ >> 3 & 0xf;
					if (15 == i_61_)
						i_61_ = -1;
					boolean bool = 1 == (i_59_ >> 7 & 0x1);
					npc.sendGraphics(graphicId, positioning, rotation, i_61_, bool, 2, -1163482569);
				}
				if ((mask & 0x800000) != 0) { // Rename - ordinal 18
					npc.aString10186 = stream.readString(1858696307);
					if ("".equals(npc.aString10186) || (npc.aString10186.equals(npc.aClass503_10190.aString6127)))
						npc.aString10186 = (npc.aClass503_10190.aString6127);
				}
				if ((mask & 0x20000) != 0) {// ordinal 19
					int i_62_ = ((stream.buffer[(stream.index += 116413311) * 385051775 - 1]) & 0xff);
					for (int i_63_ = 0; i_63_ < i_62_; i_63_++) {
						int i_64_ = stream.readUnsignedShort128(1053667933);
						int i_65_ = stream.readInt((byte) -33);
						npc.aClass73_10187.method814(i_64_, i_65_, 1573935280);
					}
				}
				if ((mask & 0x200000) != 0) {// ordinal 20
					int i_66_ = (npc.aClass503_10190.anIntArray6130).length;
					int i_67_ = 0;
					if (null != (npc.aClass503_10190.aShortArray6134)) {
						i_67_ = (npc.aClass503_10190.aShortArray6134).length;
					}
					int i_68_ = 0;
					if ((npc.aClass503_10190.aShortArray6154) != null) {
						i_67_ = (npc.aClass503_10190.aShortArray6154).length;
					}
					int i_69_ = stream.readUnsignedByte();
					if ((i_69_ & 0x1) == 1) {
						if (i >= 4095) {
							/* empty */
						}
					} else {
						int[] is = null;
						if ((i_69_ & 0x2) == 2) {
							is = new int[i_66_];
							for (int i_70_ = 0; i_70_ < i_66_; i_70_++)
								is[i_70_] = stream.readBigSmart(1235052657);
						}
						short[] is_71_ = null;
						if ((i_69_ & 0x4) == 4) {
							is_71_ = new short[i_67_];
							for (int i_72_ = 0; i_72_ < i_67_; i_72_++)
								is_71_[i_72_] = (short) stream.readUnsignedShortLE128(1478539457);
						}
						short[] is_73_ = null;
						if (8 == (i_69_ & 0x8)) {
							is_73_ = new short[i_68_];
							for (int i_74_ = 0; i_74_ < i_68_; i_74_++)
								is_73_[i_74_] = (short) stream.readUnsignedShortLE((byte) 2);
						}
						long l = ((long) npcIndex | (long) ((npc.anInt10183 += 55499771) * -1842219213 - 1) << 32);
						new Class498(l, is, is_71_, is_73_);
					}
				}
				if ((mask & 0x40000) != 0) {// Change combat level - ordinal 21
					npc.anInt10189 = (stream.readUnsignedShortLE((byte) 16) * 933118661);
					if (npc.anInt10189 * 1817570317 == 65535) {
						npc.anInt10189 = (npc.aClass503_10190.anInt6149) * 1520279523;
					}
				}
				if ((mask & 0x1) != 0) {// Transform NPC id - ordinal 22
					if (npc.aClass503_10190.method6242((byte) 32)) {
						Class244.method2330(npc, (byte) 7);
					}
					npc.method4464((Class15.aClass507_224.method6269(stream.readBigSmart(1235052657), 384117949)), 1598792788);
					npc.setSizeOffset((npc.aClass503_10190.anInt6187) * -2095128707, -2141370583);
					npc.anInt10115 = -1186616623 * (((npc.aClass503_10190.anInt6181) * -1927065533) << 3);
					if (npc.aClass503_10190.method6242((byte) 23)) {
						Class391.method4884(npc.plane, npc.scenePositionXQueue[0], npc.scenePositionYQueue[0], 0, null, npc, null, (byte) 68);
					}
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("tv.kd(").append(')').toString());
		}
	}
}
