
/* Class534_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.LinkedList;
import java.util.Queue;

public class Class534_Sub1 extends Class534 {
	Queue aQueue7921 = new LinkedList();

	int method11424() {
		return 1;
	}

	void method12809(Class282_Sub53_Sub1 class282_sub53_sub1, int i) {
		((Class534_Sub1) this).aQueue7921.add(class282_sub53_sub1);
		if (((Class534_Sub1) this).aQueue7921.size() > 10)
			((Class534_Sub1) this).aQueue7921.poll();
	}

	void method11414(int i) {
		Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) ((Class534_Sub1) this).aQueue7921.poll();
		if (class282_sub53_sub1 != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4584, client.aClass184_7475.aClass432_2283, -342114191);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeLEInt((class282_sub53_sub1.method13481(2071740821) | class282_sub53_sub1.method13469(1875995188) << 16), (byte) 22);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte128((class282_sub53_sub1.method14730(-24722123) << 1 | class282_sub53_sub1.method14729(-1996461669) & 0x1), 670389922);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(method11408(class282_sub53_sub1, 65535, 1958251581), (short) -6480);
			client.aClass184_7475.method3049(class282_sub23, 2146130042);
			class282_sub53_sub1.method13475(-1706861091);
		}
	}

	Class534_Sub1() {
		/* empty */
	}

	void method12810(RsByteBuffer class282_sub35, Class282_Sub53_Sub1 class282_sub53_sub1, byte i) {
		class282_sub35.writeByte(class282_sub53_sub1.method14729(-1996461669));
	}

	boolean method11423(int i) {
		return (!((Class534_Sub1) this).aQueue7921.isEmpty() || (2966128844247041579L * ((Class534_Sub1) this).aLong7076 < Class169.method2869(1670432849) - 2000L));
	}

	int method11412(int i) {
		return 1;
	}

	void method11427(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53) {
		method12810(class282_sub35, (Class282_Sub53_Sub1) class282_sub53, (byte) 72);
	}

	void method12811(Class282_Sub53_Sub1 class282_sub53_sub1) {
		((Class534_Sub1) this).aQueue7921.add(class282_sub53_sub1);
		if (((Class534_Sub1) this).aQueue7921.size() > 10)
			((Class534_Sub1) this).aQueue7921.poll();
	}

	void method11426(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53) {
		method12810(class282_sub35, (Class282_Sub53_Sub1) class282_sub53, (byte) 80);
	}

	void method11431() {
		Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) ((Class534_Sub1) this).aQueue7921.poll();
		if (class282_sub53_sub1 != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4584, client.aClass184_7475.aClass432_2283, 329623917);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeLEInt((class282_sub53_sub1.method13481(1928533930) | class282_sub53_sub1.method13469(-2039460343) << 16), (byte) -49);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte128((class282_sub53_sub1.method14730(-1430500590) << 1 | class282_sub53_sub1.method14729(-1996461669) & 0x1), -2080491977);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(method11408(class282_sub53_sub1, 65535, 2099731488), (short) -23063);
			client.aClass184_7475.method3049(class282_sub23, -608010003);
			class282_sub53_sub1.method13475(1162879870);
		}
	}

	void method11418() {
		Class282_Sub53_Sub1 class282_sub53_sub1 = (Class282_Sub53_Sub1) ((Class534_Sub1) this).aQueue7921.poll();
		if (class282_sub53_sub1 != null) {
			Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4584, client.aClass184_7475.aClass432_2283, -642495389);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeLEInt((class282_sub53_sub1.method13481(932524891) | class282_sub53_sub1.method13469(-1600764926) << 16), (byte) 96);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeByte128((class282_sub53_sub1.method14730(2068393904) << 1 | class282_sub53_sub1.method14729(-1996461669) & 0x1), -414105270);
			class282_sub23.aClass282_Sub35_Sub2_7682.writeShortLE(method11408(class282_sub53_sub1, 65535, -352975879), (short) -24854);
			client.aClass184_7475.method3049(class282_sub23, 1053975975);
			class282_sub53_sub1.method13475(-92529177);
		}
	}

	boolean method11434() {
		return (!((Class534_Sub1) this).aQueue7921.isEmpty() || (2966128844247041579L * ((Class534_Sub1) this).aLong7076 < Class169.method2869(1749452081) - 2000L));
	}

	Class282_Sub23 method11416(byte i) {
		return Class271.method4828(OutgoingPacket.aClass379_4567, client.aClass184_7475.aClass432_2283, 361662405);
	}

	Class282_Sub23 method11420() {
		return Class271.method4828(OutgoingPacket.aClass379_4567, client.aClass184_7475.aClass432_2283, 1749991235);
	}

	Class282_Sub23 method11428() {
		return Class271.method4828(OutgoingPacket.aClass379_4567, client.aClass184_7475.aClass432_2283, -127030354);
	}

	Class282_Sub23 method11422() {
		return Class271.method4828(OutgoingPacket.aClass379_4567, client.aClass184_7475.aClass432_2283, 469247032);
	}

	void method12812(RsByteBuffer class282_sub35, Class282_Sub53_Sub1 class282_sub53_sub1) {
		class282_sub35.writeByte(class282_sub53_sub1.method14729(-1996461669));
	}

	void method12813(RsByteBuffer class282_sub35, Class282_Sub53_Sub1 class282_sub53_sub1) {
		class282_sub35.writeByte(class282_sub53_sub1.method14729(-1996461669));
	}

	int method11415() {
		return 1;
	}

	int method11425() {
		return 1;
	}

	void method12814(Class282_Sub53_Sub1 class282_sub53_sub1) {
		((Class534_Sub1) this).aQueue7921.add(class282_sub53_sub1);
		if (((Class534_Sub1) this).aQueue7921.size() > 10)
			((Class534_Sub1) this).aQueue7921.poll();
	}

	void method11413(RsByteBuffer class282_sub35, Class282_Sub53 class282_sub53, int i) {
		method12810(class282_sub35, (Class282_Sub53_Sub1) class282_sub53, (byte) 110);
	}

	Class282_Sub23 method11421() {
		return Class271.method4828(OutgoingPacket.aClass379_4567, client.aClass184_7475.aClass432_2283, 610044227);
	}

	static int[] method12815(Class282_Sub50_Sub7 class282_sub50_sub7, int i) {
		int[] is = null;
		if (Class38.method859(-1441507225 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587, 219826890))
			is = (Class119.aClass426_1463.getItemDefinitions((int) (-5876141066140255231L * (((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584)), 327237779).anIntArray5097);
		else if ((-270249393 * ((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579) != -1)
			is = (Class119.aClass426_1463.getItemDefinitions((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9579 * -270249393), 616869394).anIntArray5097);
		else if (Class237.method3989((((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587 * -1441507225), (byte) 0)) {
			Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L))));
			if (class282_sub47 != null) {
				NPC class521_sub1_sub1_sub2_sub2 = ((NPC) class282_sub47.anObject8068);
				Class409 class409 = class521_sub1_sub1_sub2_sub2.aClass409_10580;
				if (class409.anIntArray4886 != null)
					class409 = class409.method6884(Class158_Sub1.aClass3_8507, 265881693);
				if (class409 != null)
					is = class409.anIntArray4915;
			}
		} else if (Class431.method7252(-1441507225 * (((Class282_Sub50_Sub7) class282_sub50_sub7).anInt9587), (byte) 0)) {
			Class478 class478 = (client.aClass257_7353.method4436(-1943524543).method7891((int) ((((Class282_Sub50_Sub7) class282_sub50_sub7).aLong9584) * -5876141066140255231L >>> 32 & 0x7fffffffL), 65280));
			if (class478.anIntArray5650 != null)
				class478 = class478.method8013(Class158_Sub1.aClass3_8507, (byte) 45);
			if (class478 != null)
				is = class478.anIntArray5707;
		}
		return is;
	}

	static final void method12816(Class527 class527, int i) {
		((Class527) class527).anInt7012 -= 283782002;
		int i_0_ = (((Class527) class527).anIntArray6999[1942118537 * ((Class527) class527).anInt7012]);
		int i_1_ = (((Class527) class527).anIntArray6999[1 + ((Class527) class527).anInt7012 * 1942118537]);
		((Class527) class527).anIntArray6999[(((Class527) class527).anInt7012 += 141891001) * 1942118537 - 1] = i_0_ % i_1_;
	}
}
