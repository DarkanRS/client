/* Class376 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class376 {
	public char aChar4085;
	public int anInt4086;
	public int anInt4087;
	public int anInt4088;
	public static int anInt4089;
	public static int anInt4090;

	void method4655(RsByteBuffer class298_sub53, int i) {
		try {
			for (;;) {
				int i_0_ = class298_sub53.readUnsignedByte();
				if (i_0_ == 0) {
					if (i <= 1110101469) {
						/* empty */
					}
					break;
				}
				method4656(class298_sub53, i_0_, 2123525160);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pq.a(").append(')').toString());
		}
	}

	void method4656(RsByteBuffer class298_sub53, int i, int i_1_) {
		try {
			if (i == 1)
				aChar4085 = Class493.method6190(class298_sub53.readByte(-12558881), 2024016549);
			else if (i == 2) {
				anInt4086 = class298_sub53.readUnsignedShort() * -1304139699;
				anInt4087 = class298_sub53.readUnsignedByte() * 480047535;
				anInt4088 = class298_sub53.readUnsignedByte() * -1977314169;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pq.f(").append(')').toString());
		}
	}

	Class376() {
		/* empty */
	}

	static final void method4657(ClientScript2 class403, int i) {
		try {
			int i_2_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			Class102 class102 = Class298_Sub40_Sub13.method3517(i_2_, -1228274394);
			int i_3_ = -1;
			if (null != class102)
				i_3_ = class102.anInt1087 * -945858763;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = i_3_;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pq.abv(").append(')').toString());
		}
	}

	static final void method4658(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class422_Sub25.aClass298_Sub48_8425.aClass422_Sub2_7547.method5629(-460328639) == 1 ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pq.ajg(").append(')').toString());
		}
	}

	public static void method4659(int i, int i_4_) {
		try {
			if (Class400.method4931((byte) 56)) {
				if (2084404473 * Class360.anInt3873 != i)
					Class360.aLong3874 = 2742373017286080113L;
				Class360.anInt3873 = i * 2035975497;
				client.lobbyConnection.method384((byte) 49);
				Class439.method5851(4, 1551250847);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pq.q(").append(')').toString());
		}
	}

	static final void method4660(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) (Class122.method1319((byte) 1) / 60000L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("pq.akn(").append(')').toString());
		}
	}
}
