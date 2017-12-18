/* Class374_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;
import java.util.Queue;

public class Class374_Sub2 extends Class374 {
	Queue aQueue7732 = new LinkedList();

	void method4618(byte i) {
		try {
			Class298_Sub50_Sub2 class298_sub50_sub2 = ((Class298_Sub50_Sub2) ((Class374_Sub2) this).aQueue7732.poll());
			if (class298_sub50_sub2 != null) {
				Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.CLICK_UNWALKABLE_AREA_PACKET, client.gameConnection.aClass449_330, (byte) 24);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeInt((class298_sub50_sub2.method3547((byte) -44) | class298_sub50_sub2.method3560(-1824201705) << 16), 126259689);
				class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(method4615(class298_sub50_sub2, 65535, (byte) 33));
				class298_sub36.aClass298_Sub53_Sub2_7396.writeByteC((class298_sub50_sub2.method3569((byte) 113) << 1 | class298_sub50_sub2.method3568((byte) -17) & 0x1), 2075950579);
				client.gameConnection.method390(class298_sub36, (byte) -50);
				class298_sub50_sub2.method3550(29456166);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adt.d(").append(')').toString());
		}
	}

	void method4642(Class298_Sub50_Sub2 class298_sub50_sub2, byte i) {
		try {
			((Class374_Sub2) this).aQueue7732.add(class298_sub50_sub2);
			if (((Class374_Sub2) this).aQueue7732.size() > 10)
				((Class374_Sub2) this).aQueue7732.poll();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adt.az(").append(')').toString());
		}
	}

	Class298_Sub36 method4633(byte i) {
		try {
			return Class18.method359(OutcommingPacket.aClass198_2059, client.gameConnection.aClass449_330, (byte) 31);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adt.x(").append(')').toString());
		}
	}

	boolean method4619(int i) {
		try {
			return (!((Class374_Sub2) this).aQueue7732.isEmpty() || (((Class374_Sub2) this).aLong4075 * 8383148474145196457L < Class122.method1319((byte) 1) - 2000L));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adt.u(").append(')').toString());
		}
	}

	void method4643(RsByteBuffer class298_sub53, Class298_Sub50_Sub2 class298_sub50_sub2, int i) {
		try {
			class298_sub53.writeByte(class298_sub50_sub2.method3568((byte) -71));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adt.as(").append(')').toString());
		}
	}

	void method4622() {
		Class298_Sub50_Sub2 class298_sub50_sub2 = (Class298_Sub50_Sub2) ((Class374_Sub2) this).aQueue7732.poll();
		if (class298_sub50_sub2 != null) {
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.CLICK_UNWALKABLE_AREA_PACKET, client.gameConnection.aClass449_330, (byte) 10);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt((class298_sub50_sub2.method3547((byte) -64) | class298_sub50_sub2.method3560(-1366988076) << 16), -1149175207);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(method4615(class298_sub50_sub2, 65535, (byte) 100));
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByteC((class298_sub50_sub2.method3569((byte) 32) << 1 | class298_sub50_sub2.method3568((byte) -124) & 0x1), 1797403189);
			client.gameConnection.method390(class298_sub36, (byte) -27);
			class298_sub50_sub2.method3550(1518067003);
		}
	}

	Class298_Sub36 method4625() {
		return Class18.method359(OutcommingPacket.aClass198_2059, client.gameConnection.aClass449_330, (byte) 45);
	}

	int method4628() {
		return 1;
	}

	Class374_Sub2() {
		/* empty */
	}

	void method4621() {
		Class298_Sub50_Sub2 class298_sub50_sub2 = (Class298_Sub50_Sub2) ((Class374_Sub2) this).aQueue7732.poll();
		if (class298_sub50_sub2 != null) {
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.CLICK_UNWALKABLE_AREA_PACKET, client.gameConnection.aClass449_330, (byte) 51);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt((class298_sub50_sub2.method3547((byte) -14) | class298_sub50_sub2.method3560(-1950900559) << 16), -582997683);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(method4615(class298_sub50_sub2, 65535, (byte) 125));
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByteC((class298_sub50_sub2.method3569((byte) 37) << 1 | class298_sub50_sub2.method3568((byte) -48) & 0x1), 1887595218);
			client.gameConnection.method390(class298_sub36, (byte) -104);
			class298_sub50_sub2.method3550(1749258704);
		}
	}

	void method4617(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50, byte i) {
		try {
			method4643(class298_sub53, (Class298_Sub50_Sub2) class298_sub50, -1392580670);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adt.k(").append(')').toString());
		}
	}

	int method4616(int i) {
		try {
			return 1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adt.i(").append(')').toString());
		}
	}

	boolean method4623() {
		return (!((Class374_Sub2) this).aQueue7732.isEmpty() || (((Class374_Sub2) this).aLong4075 * 8383148474145196457L < Class122.method1319((byte) 1) - 2000L));
	}

	boolean method4634() {
		return (!((Class374_Sub2) this).aQueue7732.isEmpty() || (((Class374_Sub2) this).aLong4075 * 8383148474145196457L < Class122.method1319((byte) 1) - 2000L));
	}

	boolean method4624() {
		return (!((Class374_Sub2) this).aQueue7732.isEmpty() || (((Class374_Sub2) this).aLong4075 * 8383148474145196457L < Class122.method1319((byte) 1) - 2000L));
	}

	void method4632(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50) {
		method4643(class298_sub53, (Class298_Sub50_Sub2) class298_sub50, -1850528986);
	}

	Class298_Sub36 method4631() {
		return Class18.method359(OutcommingPacket.aClass198_2059, client.gameConnection.aClass449_330, (byte) 58);
	}

	int method4635() {
		return 1;
	}

	void method4613() {
		Class298_Sub50_Sub2 class298_sub50_sub2 = (Class298_Sub50_Sub2) ((Class374_Sub2) this).aQueue7732.poll();
		if (class298_sub50_sub2 != null) {
			Class298_Sub36 class298_sub36 = Class18.method359(OutcommingPacket.CLICK_UNWALKABLE_AREA_PACKET, client.gameConnection.aClass449_330, (byte) 30);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeInt((class298_sub50_sub2.method3547((byte) 14) | class298_sub50_sub2.method3560(-1929012233) << 16), -836695878);
			class298_sub36.aClass298_Sub53_Sub2_7396.writeShortLE128(method4615(class298_sub50_sub2, 65535, (byte) 100));
			class298_sub36.aClass298_Sub53_Sub2_7396.writeByteC((class298_sub50_sub2.method3569((byte) 83) << 1 | class298_sub50_sub2.method3568((byte) -60) & 0x1), 1757564259);
			client.gameConnection.method390(class298_sub36, (byte) -126);
			class298_sub50_sub2.method3550(-718347820);
		}
	}

	int method4629() {
		return 1;
	}

	void method4627(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50) {
		method4643(class298_sub53, (Class298_Sub50_Sub2) class298_sub50, -1691760036);
	}

	void method4630(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50) {
		method4643(class298_sub53, (Class298_Sub50_Sub2) class298_sub50, -710116883);
	}

	void method4612(RsByteBuffer class298_sub53, Class298_Sub50 class298_sub50) {
		method4643(class298_sub53, (Class298_Sub50_Sub2) class298_sub50, -2014256695);
	}

	static final void method4644(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			if (Class82_Sub6.aClass7Array6846 != null && i_0_ < -1801543887 * Class489.anInt6071 && (Class82_Sub6.aClass7Array6846[i_0_].aString93.equalsIgnoreCase(Class287.myPlayer.username)))
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 1;
			else
				((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919) - 1] = 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("adt.wa(").append(')').toString());
		}
	}
}
