/* Class298_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.BitSet;

public class ClanChannel extends Linkable {
	boolean usingLong;
	boolean usingString = true;
	public byte aByte7355;
	public int numbersInChat = 0;
	int[] anIntArray7357;
	public String clanName = null;
	public ClanMember[] members;
	public byte aByte7360;
	long aLong7361;

	public ClanChannel(RsByteBuffer class298_sub53) {
		decode(class298_sub53, (byte) -94);
	}

	public int[] method3095(int i) {
		try {
			if (((ClanChannel) this).anIntArray7357 == null) {
				String[] strings = new String[numbersInChat * 649879491];
				((ClanChannel) this).anIntArray7357 = new int[649879491 * numbersInChat];
				for (int i_0_ = 0; i_0_ < numbersInChat * 649879491; i_0_++) {
					strings[i_0_] = members[i_0_].username;
					((ClanChannel) this).anIntArray7357[i_0_] = i_0_;
				}
				Class298_Sub32_Sub32.method3345(strings, (((ClanChannel) this).anIntArray7357), 715814355);
			}
			return ((ClanChannel) this).anIntArray7357;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.f(").append(')').toString());
		}
	}

	void method3096(ClanMember class163, int i) {
		try {
			if (members == null || 649879491 * numbersInChat >= members.length)
				method3099(5 + 649879491 * numbersInChat, (byte) 26);
			members[(numbersInChat += 506595563) * 649879491 - 1] = class163;
			((ClanChannel) this).anIntArray7357 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.b(").append(')').toString());
		}
	}

	public int method3097(String string, byte i) {
		try {
			for (int i_1_ = 0; i_1_ < 649879491 * numbersInChat; i_1_++) {
				if (members[i_1_].username.equalsIgnoreCase(string))
					return i_1_;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.i(").append(')').toString());
		}
	}

	void decode(RsByteBuffer stream, byte b) {
		try {
			int usernameSettings = stream.readUnsignedByte();
			if ((usernameSettings & 0x1) != 0)
				((ClanChannel) this).usingLong = true;
			if ((usernameSettings & 0x2) != 0)
				((ClanChannel) this).usingString = true;
			linkedKey = (stream.readLong((short) 1568) * 4191220306876042991L);
			((ClanChannel) this).aLong7361 = (stream.readLong((short) 25426) * 8816161044679006451L);
			clanName = stream.readString(1262859658);
			stream.readUnsignedByte();
			aByte7355 = stream.readByte(-12558881);
			aByte7360 = stream.readByte(-12558881);
			numbersInChat = stream.readUnsignedShort() * 506595563;
			if (numbersInChat * 649879491 > 0) {
				members = new ClanMember[649879491 * numbersInChat];
				for (int i = 0; i < numbersInChat * 649879491; i++) {
					ClanMember member = new ClanMember();
					if (((ClanChannel) this).usingLong)
						stream.readLong((short) 26032);
					if (((ClanChannel) this).usingString)
						member.username = stream.readString(254031265);
					member.rank = stream.readByte(-12558881);
					member.world = stream.readUnsignedShort() * -62810701;
					members[i] = member;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.k(").append(')').toString());
		}
	}

	static {
		new BitSet(65536);
	}

	void method3099(int i, byte i_4_) {
		try {
			if (null != members)
				Class425.method5737(members, 0, members = new ClanMember[i], 0, numbersInChat * 649879491);
			else
				members = new ClanMember[i];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.a(").append(')').toString());
		}
	}

	void method3100(int i, int i_5_) {
		try {
			numbersInChat -= 506595563;
			if (0 == numbersInChat * 649879491)
				members = null;
			else
				Class425.method5737(members, 1 + i, members, i, numbersInChat * 649879491 - i);
			((ClanChannel) this).anIntArray7357 = null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.p(").append(')').toString());
		}
	}

	static final void method3101(ClientScript2 class403, int i) {
		try {
			Class107.method1138(class403, -807637826);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.si(").append(')').toString());
		}
	}

	static final void method3102(ClientScript2 class403, int i) {
		try {
			Class298_Sub37_Sub13 class298_sub37_sub13 = Class301.method3705(((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]);
			if (class298_sub37_sub13 == null || null == class298_sub37_sub13.aString9641)
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = "";
			else
				((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 += 969361751) * -203050393) - 1] = class298_sub37_sub13.aString9641;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.adf(").append(')').toString());
		}
	}

	static final void method3103(ClientScript2 class403, int i) {
		try {
			int i_6_ = (((ClientScript2) class403).anIntArray5257[1883543357 * ((ClientScript2) class403).anInt5259]);
			Long var_long = (Long) Class313.anObjectArray3298[i_6_];
			if (var_long == null)
				((ClientScript2) class403).aLongArray5251[((((ClientScript2) class403).anInt5245 += -682569305) * 1685767703) - 1] = -1L;
			else
				((ClientScript2) class403).aLongArray5251[((((ClientScript2) class403).anInt5245 += -682569305) * 1685767703) - 1] = var_long.longValue();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("abj.bs(").append(')').toString());
		}
	}
}
