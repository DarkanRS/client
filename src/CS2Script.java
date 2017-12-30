/* Class282_Sub50_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class CS2Script extends Class282_Sub50 {
	public Object[] anObjectArray9519;
	public String aString9520;
	public Class522[] aClass522Array9521;
	public int[] anIntArray9522;
	public long[] aLongArray9523;
	public int anInt9524;
	public int nIntLocals;
	public int nObjectLocals;
	public Class397 aClass397_9527;
	public int anInt9528;
	public int anInt9529;
	public int nLongLocals;
	public Class465[] aClass465Array9531;

	public CS2Script(RsByteBuffer class282_sub35) {
		int i = method14769(class282_sub35, -1384937123);
		int i_0_ = 0;
		Class522[] class522s = Class191.method3165(-2086914573);
		while (-1990677291 * class282_sub35.index < i) {
			Class522 class522 = method14768(class282_sub35, class522s, (byte) 2);
			method14771(class282_sub35, i_0_, class522, 341832992);
			i_0_++;
		}
	}

	Class522 method14768(RsByteBuffer class282_sub35, Class522[] class522s, byte i) {
		int i_1_ = class282_sub35.readUnsignedShort();
		if (i_1_ < 0 || i_1_ >= class522s.length)
			throw new RuntimeException("");
		Class522 class522 = class522s[i_1_];
		return class522;
	}

	int method14769(RsByteBuffer buffer, int i) {
		buffer.index = (buffer.buffer.length - 2) * -1115476867;
		int i_2_ = buffer.readUnsignedShort();
		int i_3_ = buffer.buffer.length - 2 - i_2_ - 16;
		buffer.index = -1115476867 * i_3_;
		int i_4_ = buffer.readInt();
		nIntLocals = buffer.readUnsignedShort() * -1386418893;
		nObjectLocals = buffer.readUnsignedShort() * -975682841;
		nLongLocals = buffer.readUnsignedShort() * -60178873;
		anInt9528 = buffer.readUnsignedShort() * 950806069;
		anInt9529 = buffer.readUnsignedShort() * 370522055;
		anInt9524 = buffer.readUnsignedShort() * -1593316803;
		int i_5_ = buffer.readUnsignedByte();
		if (i_5_ > 0) {
			aClass465Array9531 = new Class465[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				int i_7_ = buffer.readUnsignedShort();
				Class465 class465 = new Class465(Class323.method5778(i_7_, -234379644));
				aClass465Array9531[i_6_] = class465;
				while (i_7_-- > 0) {
					int i_8_ = buffer.readInt();
					int i_9_ = buffer.readInt();
					class465.method7765(new Class282_Sub38(i_9_), (long) i_8_);
				}
			}
		}
		buffer.index = 0;
		aString9520 = buffer.method13090(198990051);
		aClass522Array9521 = new Class522[i_4_];
		return i_3_;
	}

	void method14771(RsByteBuffer class282_sub35, int i, Class522 class522, int i_10_) {
		int i_11_ = aClass522Array9521.length;
		if (class522 == Class522.aClass522_5949) {
			if (anObjectArray9519 == null)
				anObjectArray9519 = new String[i_11_];
			anObjectArray9519[i] = class282_sub35.readString(835506752).intern();
		} else if (Class522.aClass522_5980 == class522) {
			if (null == aLongArray9523)
				aLongArray9523 = new long[i_11_];
			aLongArray9523[i] = class282_sub35.readLong(1461379326);
		} else {
			if (null == anIntArray9522)
				anIntArray9522 = new int[i_11_];
			if (class522.aBool6953)
				anIntArray9522[i] = class282_sub35.readInt();
			else
				anIntArray9522[i] = class282_sub35.readUnsignedByte();
		}
		aClass522Array9521[i] = class522;
	}
}
