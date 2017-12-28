
/* Class282_Sub41_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;

public class Class282_Sub41_Sub2 extends Class282_Sub41 {
	float aFloat9462;
	static final int anInt9463 = 0;
	int anInt9464;
	float aFloat9465;
	String aString9466;
	int anInt9467;
	static final int anInt9468 = 128;
	String aString9469;
	String aString9470;

	public float method14701() {
		return ((Class282_Sub41_Sub2) this).aFloat9462;
	}

	void method13362(OggPacket oggpacket, int i) {
		if (((Class282_Sub41_Sub2) this).anInt8031 * -509226247 <= 0 || "SUB".equals(((Class282_Sub41_Sub2) this).aString9469)) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(oggpacket.getData());
			int i_0_ = class282_sub35.readUnsignedByte();
			if (-509226247 * ((Class282_Sub41_Sub2) this).anInt8031 <= 8) {
				if (0 == (i_0_ | 0x80))
					throw new IllegalStateException();
				if (0 == -509226247 * ((Class282_Sub41_Sub2) this).anInt8031) {
					class282_sub35.index += 113835835;
					((Class282_Sub41_Sub2) this).anInt9464 = class282_sub35.method13085(-190193364) * -1289985113;
					((Class282_Sub41_Sub2) this).anInt9467 = class282_sub35.method13085(-2132826007) * -134578141;
					if (((Class282_Sub41_Sub2) this).anInt9464 * 658904087 == 0 || 0 == (1762799499 * ((Class282_Sub41_Sub2) this).anInt9467))
						throw new IllegalStateException();
					RsByteBuffer class282_sub35_1_ = new RsByteBuffer(16);
					class282_sub35.readBytes((class282_sub35_1_.buffer), 0, 16, -535587345);
					((Class282_Sub41_Sub2) this).aString9466 = class282_sub35_1_.readString(-419573156);
					class282_sub35_1_.index = 0;
					class282_sub35.readBytes((class282_sub35_1_.buffer), 0, 16, -346714339);
					((Class282_Sub41_Sub2) this).aString9469 = class282_sub35_1_.readString(697517004);
				}
			} else {
				if (i_0_ == 0) {
					long l = class282_sub35.method13278((byte) 91);
					long l_2_ = class282_sub35.method13278((byte) 49);
					long l_3_ = class282_sub35.method13278((byte) 65);
					if (l < 0L || l_2_ < 0L || l_3_ < 0L || l_3_ > l)
						throw new IllegalStateException();
					((Class282_Sub41_Sub2) this).aFloat9462 = ((float) ((long) (1762799499 * (((Class282_Sub41_Sub2) this).anInt9467)) * l) / (float) (((Class282_Sub41_Sub2) this).anInt9464 * 658904087));
					((Class282_Sub41_Sub2) this).aFloat9465 = ((float) ((long) (1762799499 * (((Class282_Sub41_Sub2) this).anInt9467)) * (l_2_ + l)) / (float) (658904087 * (((Class282_Sub41_Sub2) this).anInt9464)));
					int i_4_ = class282_sub35.method13085(737852969);
					if (i_4_ < 0 || i_4_ > (class282_sub35.buffer.length - -1990677291 * class282_sub35.index))
						throw new IllegalStateException();
					((Class282_Sub41_Sub2) this).aString9470 = Class271.method4824(class282_sub35.buffer, (class282_sub35.index * -1990677291), i_4_, 336004634);
				}
				if (0 != (i_0_ | 0x80))
					return;
			}
		}
	}

	public float method14702(int i) {
		return ((Class282_Sub41_Sub2) this).aFloat9462;
	}

	void method13366(OggPacket oggpacket) {
		if (((Class282_Sub41_Sub2) this).anInt8031 * -509226247 <= 0 || "SUB".equals(((Class282_Sub41_Sub2) this).aString9469)) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(oggpacket.getData());
			int i = class282_sub35.readUnsignedByte();
			if (-509226247 * ((Class282_Sub41_Sub2) this).anInt8031 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (0 == -509226247 * ((Class282_Sub41_Sub2) this).anInt8031) {
					class282_sub35.index += 113835835;
					((Class282_Sub41_Sub2) this).anInt9464 = (class282_sub35.method13085(-1091796694) * -1289985113);
					((Class282_Sub41_Sub2) this).anInt9467 = class282_sub35.method13085(-1792270527) * -134578141;
					if (((Class282_Sub41_Sub2) this).anInt9464 * 658904087 == 0 || 0 == (1762799499 * ((Class282_Sub41_Sub2) this).anInt9467))
						throw new IllegalStateException();
					RsByteBuffer class282_sub35_5_ = new RsByteBuffer(16);
					class282_sub35.readBytes((class282_sub35_5_.buffer), 0, 16, -399425573);
					((Class282_Sub41_Sub2) this).aString9466 = class282_sub35_5_.readString(1967332064);
					class282_sub35_5_.index = 0;
					class282_sub35.readBytes((class282_sub35_5_.buffer), 0, 16, 1205214509);
					((Class282_Sub41_Sub2) this).aString9469 = class282_sub35_5_.readString(119263690);
				}
			} else {
				if (i == 0) {
					long l = class282_sub35.method13278((byte) 70);
					long l_6_ = class282_sub35.method13278((byte) 34);
					long l_7_ = class282_sub35.method13278((byte) 20);
					if (l < 0L || l_6_ < 0L || l_7_ < 0L || l_7_ > l)
						throw new IllegalStateException();
					((Class282_Sub41_Sub2) this).aFloat9462 = ((float) ((long) (1762799499 * (((Class282_Sub41_Sub2) this).anInt9467)) * l) / (float) (((Class282_Sub41_Sub2) this).anInt9464 * 658904087));
					((Class282_Sub41_Sub2) this).aFloat9465 = ((float) ((long) (1762799499 * (((Class282_Sub41_Sub2) this).anInt9467)) * (l_6_ + l)) / (float) (658904087 * (((Class282_Sub41_Sub2) this).anInt9464)));
					int i_8_ = class282_sub35.method13085(-458972533);
					if (i_8_ < 0 || i_8_ > (class282_sub35.buffer.length - -1990677291 * class282_sub35.index))
						throw new IllegalStateException();
					((Class282_Sub41_Sub2) this).aString9470 = Class271.method4824(class282_sub35.buffer, (class282_sub35.index * -1990677291), i_8_, 336004634);
				}
				if (0 != (i | 0x80))
					return;
			}
		}
	}

	String method14703(int i) {
		return ((Class282_Sub41_Sub2) this).aString9466;
	}

	public String method14704(int i) {
		return ((Class282_Sub41_Sub2) this).aString9470;
	}

	void method13360(int i) {
		/* empty */
	}

	void method13363(OggPacket oggpacket) {
		if (((Class282_Sub41_Sub2) this).anInt8031 * -509226247 <= 0 || "SUB".equals(((Class282_Sub41_Sub2) this).aString9469)) {
			RsByteBuffer class282_sub35 = new RsByteBuffer(oggpacket.getData());
			int i = class282_sub35.readUnsignedByte();
			if (-509226247 * ((Class282_Sub41_Sub2) this).anInt8031 <= 8) {
				if (0 == (i | 0x80))
					throw new IllegalStateException();
				if (0 == -509226247 * ((Class282_Sub41_Sub2) this).anInt8031) {
					class282_sub35.index += 113835835;
					((Class282_Sub41_Sub2) this).anInt9464 = class282_sub35.method13085(-204880064) * -1289985113;
					((Class282_Sub41_Sub2) this).anInt9467 = class282_sub35.method13085(288642757) * -134578141;
					if (((Class282_Sub41_Sub2) this).anInt9464 * 658904087 == 0 || 0 == (1762799499 * ((Class282_Sub41_Sub2) this).anInt9467))
						throw new IllegalStateException();
					RsByteBuffer class282_sub35_9_ = new RsByteBuffer(16);
					class282_sub35.readBytes((class282_sub35_9_.buffer), 0, 16, 1763599266);
					((Class282_Sub41_Sub2) this).aString9466 = class282_sub35_9_.readString(1226058802);
					class282_sub35_9_.index = 0;
					class282_sub35.readBytes((class282_sub35_9_.buffer), 0, 16, 843155159);
					((Class282_Sub41_Sub2) this).aString9469 = class282_sub35_9_.readString(-149419627);
				}
			} else {
				if (i == 0) {
					long l = class282_sub35.method13278((byte) 117);
					long l_10_ = class282_sub35.method13278((byte) 11);
					long l_11_ = class282_sub35.method13278((byte) 26);
					if (l < 0L || l_10_ < 0L || l_11_ < 0L || l_11_ > l)
						throw new IllegalStateException();
					((Class282_Sub41_Sub2) this).aFloat9462 = ((float) ((long) (1762799499 * (((Class282_Sub41_Sub2) this).anInt9467)) * l) / (float) (((Class282_Sub41_Sub2) this).anInt9464 * 658904087));
					((Class282_Sub41_Sub2) this).aFloat9465 = ((float) ((long) (1762799499 * (((Class282_Sub41_Sub2) this).anInt9467)) * (l_10_ + l)) / (float) (658904087 * (((Class282_Sub41_Sub2) this).anInt9464)));
					int i_12_ = class282_sub35.method13085(922776057);
					if (i_12_ < 0 || i_12_ > (class282_sub35.buffer.length - -1990677291 * class282_sub35.index))
						throw new IllegalStateException();
					((Class282_Sub41_Sub2) this).aString9470 = Class271.method4824(class282_sub35.buffer, (class282_sub35.index * -1990677291), i_12_, 336004634);
				}
				if (0 != (i | 0x80))
					return;
			}
		}
	}

	public float method14705(byte i) {
		return ((Class282_Sub41_Sub2) this).aFloat9465;
	}

	void method13365() {
		/* empty */
	}

	Class282_Sub41_Sub2(OggStreamState oggstreamstate) {
		super(oggstreamstate);
	}

	String method14706() {
		return ((Class282_Sub41_Sub2) this).aString9466;
	}

	String method14707() {
		return ((Class282_Sub41_Sub2) this).aString9466;
	}

	public float method14708() {
		return ((Class282_Sub41_Sub2) this).aFloat9462;
	}

	void method13364() {
		/* empty */
	}

	public float method14709() {
		return ((Class282_Sub41_Sub2) this).aFloat9462;
	}

	public float method14710() {
		return ((Class282_Sub41_Sub2) this).aFloat9462;
	}

	public float method14711() {
		return ((Class282_Sub41_Sub2) this).aFloat9465;
	}

	public float method14712() {
		return ((Class282_Sub41_Sub2) this).aFloat9465;
	}

	public float method14713() {
		return ((Class282_Sub41_Sub2) this).aFloat9465;
	}

	public float method14714() {
		return ((Class282_Sub41_Sub2) this).aFloat9465;
	}

	public String method14715() {
		return ((Class282_Sub41_Sub2) this).aString9470;
	}
}
