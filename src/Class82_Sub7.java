/* Class82_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82_Sub7 extends Class82 {
	int anInt6847;
	int anInt6848;
	int anInt6849;
	int anInt6850;
	int anInt6851;
	int anInt6852;

	public void method866(int i) {
		try {
			Class87.aClass75Array805[((Class82_Sub7) this).anInt6848 * 958596181].method833(0, -1291875097);
			Class87.aClass75Array805[((Class82_Sub7) this).anInt6851 * 940626959].method833(1, -853378806);
			client.anInt8768 = 0;
			client.anInt8770 = -1367521861 * ((Class82_Sub7) this).anInt6849;
			client.anInt8857 = 0;
			client.anInt8852 = 2019692335 * ((Class82_Sub7) this).anInt6852;
			client.anInt8774 = -970762691 * ((Class82_Sub7) this).anInt6850;
			client.anInt8769 = -2694169;
			client.anInt8771 = ((Class82_Sub7) this).anInt6847 * -1957420531;
			Class298_Sub1.anInt7164 = -734758223;
			Class397.method4913((byte) 66);
			client.aBoolean8725 = true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xp.f(").append(')').toString());
		}
	}

	public void method869() {
		Class87.aClass75Array805[((Class82_Sub7) this).anInt6848 * 958596181].method833(0, -577755381);
		Class87.aClass75Array805[((Class82_Sub7) this).anInt6851 * 940626959].method833(1, 1173943462);
		client.anInt8768 = 0;
		client.anInt8770 = -1367521861 * ((Class82_Sub7) this).anInt6849;
		client.anInt8857 = 0;
		client.anInt8852 = 2019692335 * ((Class82_Sub7) this).anInt6852;
		client.anInt8774 = -970762691 * ((Class82_Sub7) this).anInt6850;
		client.anInt8769 = -2694169;
		client.anInt8771 = ((Class82_Sub7) this).anInt6847 * -1957420531;
		Class298_Sub1.anInt7164 = -734758223;
		Class397.method4913((byte) 83);
		client.aBoolean8725 = true;
	}

	public void method868() {
		Class87.aClass75Array805[((Class82_Sub7) this).anInt6848 * 958596181].method833(0, -2120641956);
		Class87.aClass75Array805[((Class82_Sub7) this).anInt6851 * 940626959].method833(1, -1465561982);
		client.anInt8768 = 0;
		client.anInt8770 = -1367521861 * ((Class82_Sub7) this).anInt6849;
		client.anInt8857 = 0;
		client.anInt8852 = 2019692335 * ((Class82_Sub7) this).anInt6852;
		client.anInt8774 = -970762691 * ((Class82_Sub7) this).anInt6850;
		client.anInt8769 = -2694169;
		client.anInt8771 = ((Class82_Sub7) this).anInt6847 * -1957420531;
		Class298_Sub1.anInt7164 = -734758223;
		Class397.method4913((byte) 78);
		client.aBoolean8725 = true;
	}

	Class82_Sub7(RsByteBuffer class298_sub53) {
		super(class298_sub53);
		((Class82_Sub7) this).anInt6848 = class298_sub53.readUnsignedShort() * 1053415677;
		((Class82_Sub7) this).anInt6851 = class298_sub53.readUnsignedShort() * -289957137;
		((Class82_Sub7) this).anInt6849 = class298_sub53.readUnsignedShort() * -1654642079;
		((Class82_Sub7) this).anInt6847 = class298_sub53.readUnsignedShort() * 456781431;
		((Class82_Sub7) this).anInt6852 = class298_sub53.readUnsignedShort() * -1191092803;
		((Class82_Sub7) this).anInt6850 = class298_sub53.readUnsignedShort() * 512797893;
	}

	static void method889(Matrix4f class233, boolean bool, float f, float f_0_, float f_1_, float f_2_, int i, int i_3_, int i_4_) {
		try {
			int i_5_ = client.aClass283_8716.method2635(-115794055);
			int i_6_ = client.aClass283_8716.method2634((byte) -118);
			class233.method2152(f, f_0_, f_1_, f_2_, (float) i_6_, (float) i_5_, (float) i, (float) i_3_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xp.fj(").append(')').toString());
		}
	}

	static final void decodePlayersMasks(RsBitsBuffer stream, int i) {
		try {
			for (int i_7_ = 0; i_7_ < -1281683379 * Class10.anInt139; i_7_++) {
				int playerIndex = Class10.anIntArray140[i_7_];
				Player player = client.aClass365_Sub1_Sub1_Sub2_Sub2Array8805[playerIndex];
				int mask = stream.readUnsignedByte();
				if ((mask & 0x2) != 0)
					mask += stream.readUnsignedByte() << 8;
				if ((mask & 0x400) != 0)
					mask += stream.readUnsignedByte() << 16;
				Class297.decodePlayerMasks(stream, playerIndex, player, mask);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xp.d(").append(')').toString());
		}
	}

	static final void method891(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = -2005990483 * Class360.anInt3910;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("xp.ahn(").append(')').toString());
		}
	}
}
