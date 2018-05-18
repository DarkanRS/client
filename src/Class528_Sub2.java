/* Class528_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class528_Sub2 extends MeshRasterizer {
	static int anInt8562;
	boolean aBool8563 = false;
	Class185 aClass185_8564;
	Class185 aClass185_8565;
	Class144 aClass144_8566;
	int[] anIntArray8567;
	int[][] anIntArrayArray8568;
	short[] aShortArray8569;
	short aShort8570;
	short aShort8571;
	static final int anInt8572 = 7;
	static final int anInt8573 = 618520;
	short aShort8574;
	int anInt8575;
	static final int anInt8576 = 0;
	int anInt8577;
	int anInt8578 = 0;
	int anInt8579 = 0;
	int[] anIntArray8580;
	int[] anIntArray8581;
	Class176[] aClass176Array8582;
	int[] anIntArray8583;
	Class189[] aClass189Array8584;
	Class189[] aClass189Array8585;
	int anInt8586 = 0;
	short[] aShortArray8587;
	short[] aShortArray8588;
	boolean aBool8589;
	float[] aFloatArray8590;
	float[][] aFloatArrayArray8591;
	int[] anIntArray8592;
	static final int anInt8593 = -1;
	int[] anIntArray8594;
	short aShort8595;
	static final int anInt8596 = 1;
	static final int anInt8597 = 2;
	int anInt8598 = 0;
	Class195[] aClass195Array8599;
	byte[] aByteArray8600;
	byte[] aByteArray8601;
	byte[] aByteArray8602;
	short[] aShortArray8603;
	short[] aShortArray8604;
	float[] aFloatArray8605;
	int anInt8606;
	int anInt8607;
	int[][] anIntArrayArray8608;
	boolean aBool8609;
	int[] anIntArray8610;
	int anInt8611;
	static int anInt8612;
	int anInt8613;
	boolean aBool8614;
	Class87[] aClass87Array8615;
	Class172[] aClass172Array8616;
	int anInt8617;
	Class193[] aClass193Array8618;
	int[] anIntArray8619;
	int[][] anIntArrayArray8620;
	boolean aBool8621;
	static final int anInt8622 = 4;
	short[] aShortArray8623;
	static final int anInt8624 = 618648;
	short aShort8625;
	Class528_Sub2[] aClass528_Sub2Array8626;
	short aShort8627;
	int[] anIntArray8628;
	short aShort8629;
	boolean aBool8630;
	int[] anIntArray8631;
	short[] aShortArray8632;
	int[] anIntArray8633;
	short aShort8634;
	float[][] aFloatArrayArray8635;
	float[] aFloatArray8636;
	float[] aFloatArray8637;
	Class505_Sub3 aClass505_Sub3_8638;
	int[] anIntArray8639;
	boolean aBool8640;
	static final int anInt8641 = -2;
	short[] aShortArray8642;
	int[] anIntArray8643;
	static int anInt8644 = 4096;
	Class528_Sub2[] aClass528_Sub2Array8645;

	public void method11282(Class294 class294, Class275_Sub5 class275_sub5, int i) {
		method13814(class294, class275_sub5, i);
	}

	final void method13794(boolean bool, boolean bool_0_, boolean bool_1_, int i) {
		short i_2_ = ((Class528_Sub2) this).aShortArray8587[i];
		short i_3_ = ((Class528_Sub2) this).aShortArray8588[i];
		short i_4_ = ((Class528_Sub2) this).aShortArray8642[i];
		if (((Class528_Sub2) this).aShortArray8603 == null || ((Class528_Sub2) this).aShortArray8603[i] == -1) {
			if (((Class528_Sub2) this).aByteArray8602 == null)
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = 0;
			else
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = ((Class528_Sub2) this).aByteArray8602[i] & 0xff;
			if (((Class528_Sub2) this).anIntArray8594[i] == -1)
				((Class528_Sub2) this).aClass144_8566.method2428(bool, bool_0_, bool_1_, ((Class528_Sub2) this).aFloatArray8605[i_2_], ((Class528_Sub2) this).aFloatArray8605[i_3_], ((Class528_Sub2) this).aFloatArray8605[i_4_], ((Class528_Sub2) this).aFloatArray8590[i_2_], ((Class528_Sub2) this).aFloatArray8590[i_3_], ((Class528_Sub2) this).aFloatArray8590[i_4_], ((Class528_Sub2) this).aFloatArray8636[i_2_], ((Class528_Sub2) this).aFloatArray8636[i_3_],
						((Class528_Sub2) this).aFloatArray8636[i_4_], (Class335.anIntArray3916[((Class528_Sub2) this).anIntArray8592[i] & 0xffff]));
			else
				((Class528_Sub2) this).aClass144_8566.method2426(bool, bool_0_, bool_1_, ((Class528_Sub2) this).aFloatArray8605[i_2_], ((Class528_Sub2) this).aFloatArray8605[i_3_], ((Class528_Sub2) this).aFloatArray8605[i_4_], ((Class528_Sub2) this).aFloatArray8590[i_2_], ((Class528_Sub2) this).aFloatArray8590[i_3_], ((Class528_Sub2) this).aFloatArray8590[i_4_], ((Class528_Sub2) this).aFloatArray8636[i_2_], ((Class528_Sub2) this).aFloatArray8636[i_3_],
						((Class528_Sub2) this).aFloatArray8636[i_4_], (float) (((Class528_Sub2) this).anIntArray8592[i] & 0xffff), (float) (((Class528_Sub2) this).anIntArray8631[i] & 0xffff), (float) (((Class528_Sub2) this).anIntArray8594[i] & 0xffff));
		} else {
			int i_5_ = -16777216;
			if (((Class528_Sub2) this).aByteArray8602 != null)
				i_5_ = (255 - (((Class528_Sub2) this).aByteArray8602[i] & 0xff) << 24);
			if (((Class528_Sub2) this).anIntArray8594[i] == -1) {
				int i_6_ = (i_5_ | ((Class528_Sub2) this).anIntArray8592[i] & 0xffffff);
				((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_0_, bool_1_, ((Class528_Sub2) this).aFloatArray8605[i_2_], ((Class528_Sub2) this).aFloatArray8605[i_3_], ((Class528_Sub2) this).aFloatArray8605[i_4_], ((Class528_Sub2) this).aFloatArray8590[i_2_], ((Class528_Sub2) this).aFloatArray8590[i_3_], ((Class528_Sub2) this).aFloatArray8590[i_4_], ((Class528_Sub2) this).aFloatArray8636[i_2_], ((Class528_Sub2) this).aFloatArray8636[i_3_],
						((Class528_Sub2) this).aFloatArray8636[i_4_], ((Class528_Sub2) this).aFloatArray8637[i_2_], ((Class528_Sub2) this).aFloatArray8637[i_3_], ((Class528_Sub2) this).aFloatArray8637[i_4_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
						((Class528_Sub2) this).aFloatArrayArray8591[i][2], i_6_, i_6_, i_6_, (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, 0.0F, 0.0F, 0.0F, ((Class528_Sub2) this).aShortArray8603[i]);
			} else
				((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_0_, bool_1_, ((Class528_Sub2) this).aFloatArray8605[i_2_], ((Class528_Sub2) this).aFloatArray8605[i_3_], ((Class528_Sub2) this).aFloatArray8605[i_4_], ((Class528_Sub2) this).aFloatArray8590[i_2_], ((Class528_Sub2) this).aFloatArray8590[i_3_], ((Class528_Sub2) this).aFloatArray8590[i_4_], ((Class528_Sub2) this).aFloatArray8636[i_2_], ((Class528_Sub2) this).aFloatArray8636[i_3_],
						((Class528_Sub2) this).aFloatArray8636[i_4_], ((Class528_Sub2) this).aFloatArray8637[i_2_], ((Class528_Sub2) this).aFloatArray8637[i_3_], ((Class528_Sub2) this).aFloatArray8637[i_4_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
						((Class528_Sub2) this).aFloatArrayArray8591[i][2], (i_5_ | ((Class528_Sub2) this).anIntArray8592[i] & 0xffffff), (i_5_ | ((Class528_Sub2) this).anIntArray8631[i] & 0xffffff), (i_5_ | ((Class528_Sub2) this).anIntArray8594[i] & 0xffffff), (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, 0.0F, 0.0F, 0.0F, ((Class528_Sub2) this).aShortArray8603[i]);
		}
	}

	void method13795(Class185 class185) {
		((Class528_Sub2) this).aClass144_8566 = ((Class185) class185).aClass144_2310;
		if (class185 != ((Class528_Sub2) this).aClass185_8564) {
			((Class528_Sub2) this).aClass185_8564 = class185;
			((Class528_Sub2) this).anIntArray8633 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2319);
			((Class528_Sub2) this).aFloatArray8590 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2302);
			((Class528_Sub2) this).aFloatArray8605 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2341);
			((Class528_Sub2) this).aFloatArray8636 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2322);
			((Class528_Sub2) this).aFloatArray8637 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2323);
			((Class528_Sub2) this).anIntArray8583 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2321);
			((Class528_Sub2) this).anIntArray8639 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2325);
			((Class528_Sub2) this).anIntArray8628 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2312);
			((Class528_Sub2) this).anIntArray8567 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2327);
			((Class528_Sub2) this).anIntArray8619 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2328);
			((Class528_Sub2) this).anIntArray8643 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2329);
		}
	}

	public void Q(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x2000) != 8192)
			throw new IllegalStateException();
		((Class528_Sub2) this).anInt8577 = i;
		((Class528_Sub2) this).anInt8598 = 0;
	}

	void method13796(Thread thread) {
		Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(thread);
		if (class185 != ((Class528_Sub2) this).aClass185_8565) {
			((Class528_Sub2) this).aClass185_8565 = class185;
			((Class528_Sub2) this).aClass528_Sub2Array8626 = (((Class185) ((Class528_Sub2) this).aClass185_8565).aClass528_Sub2Array2339);
			((Class528_Sub2) this).aClass528_Sub2Array8645 = (((Class185) ((Class528_Sub2) this).aClass185_8565).aClass528_Sub2Array2340);
		}
	}

	void method13797() {
		((Class528_Sub2) this).aClass189Array8584 = new Class189[((Class528_Sub2) this).anInt8579];
		for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++)
			((Class528_Sub2) this).aClass189Array8584[i] = new Class189();
		for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
			short i_7_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_8_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_9_ = ((Class528_Sub2) this).aShortArray8642[i];
			int i_10_ = (((Class528_Sub2) this).anIntArray8580[i_8_] - ((Class528_Sub2) this).anIntArray8580[i_7_]);
			int i_11_ = (((Class528_Sub2) this).anIntArray8581[i_8_] - ((Class528_Sub2) this).anIntArray8581[i_7_]);
			int i_12_ = (((Class528_Sub2) this).anIntArray8610[i_8_] - ((Class528_Sub2) this).anIntArray8610[i_7_]);
			int i_13_ = (((Class528_Sub2) this).anIntArray8580[i_9_] - ((Class528_Sub2) this).anIntArray8580[i_7_]);
			int i_14_ = (((Class528_Sub2) this).anIntArray8581[i_9_] - ((Class528_Sub2) this).anIntArray8581[i_7_]);
			int i_15_ = (((Class528_Sub2) this).anIntArray8610[i_9_] - ((Class528_Sub2) this).anIntArray8610[i_7_]);
			int i_16_ = i_11_ * i_15_ - i_14_ * i_12_;
			int i_17_ = i_12_ * i_13_ - i_15_ * i_10_;
			int i_18_;
			for (i_18_ = i_10_ * i_14_ - i_13_ * i_11_; (i_16_ > 8192 || i_17_ > 8192 || i_18_ > 8192 || i_16_ < -8192 || i_17_ < -8192 || i_18_ < -8192); i_18_ >>= 1) {
				i_16_ >>= 1;
				i_17_ >>= 1;
			}
			int i_19_ = (int) Math.sqrt((double) (i_16_ * i_16_ + i_17_ * i_17_ + i_18_ * i_18_));
			if (i_19_ <= 0)
				i_19_ = 1;
			i_16_ = i_16_ * 256 / i_19_;
			i_17_ = i_17_ * 256 / i_19_;
			i_18_ = i_18_ * 256 / i_19_;
			byte i_20_;
			if (((Class528_Sub2) this).aByteArray8600 == null)
				i_20_ = (byte) 0;
			else
				i_20_ = ((Class528_Sub2) this).aByteArray8600[i];
			if (i_20_ == 0) {
				Class189 class189 = ((Class528_Sub2) this).aClass189Array8584[i_7_];
				((Class189) class189).anInt2380 += i_16_;
				((Class189) class189).anInt2381 += i_17_;
				((Class189) class189).anInt2379 += i_18_;
				((Class189) class189).anInt2382++;
				class189 = ((Class528_Sub2) this).aClass189Array8584[i_8_];
				((Class189) class189).anInt2380 += i_16_;
				((Class189) class189).anInt2381 += i_17_;
				((Class189) class189).anInt2379 += i_18_;
				((Class189) class189).anInt2382++;
				class189 = ((Class528_Sub2) this).aClass189Array8584[i_9_];
				((Class189) class189).anInt2380 += i_16_;
				((Class189) class189).anInt2381 += i_17_;
				((Class189) class189).anInt2379 += i_18_;
				((Class189) class189).anInt2382++;
			} else if (i_20_ == 1) {
				if (((Class528_Sub2) this).aClass195Array8599 == null)
					((Class528_Sub2) this).aClass195Array8599 = new Class195[((Class528_Sub2) this).anInt8586];
				Class195 class195 = (((Class528_Sub2) this).aClass195Array8599[i] = new Class195());
				((Class195) class195).anInt2410 = i_16_;
				((Class195) class195).anInt2411 = i_17_;
				((Class195) class195).anInt2412 = i_18_;
			}
		}
	}

	public void cq(short i, short i_21_) {
		for (int i_22_ = 0; i_22_ < ((Class528_Sub2) this).anInt8586; i_22_++) {
			if (((Class528_Sub2) this).aShortArray8604[i_22_] == i)
				((Class528_Sub2) this).aShortArray8604[i_22_] = i_21_;
		}
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i_23_ = 0; i_23_ < ((Class528_Sub2) this).anInt8617; i_23_++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_23_];
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_23_];
				((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | ((Class335.anIntArray3916[Class372.method6362((((Class528_Sub2) this).aShortArray8604[(((Class193) class193).anInt2393) * 142270897]), 1835640690) & 0xffff]) & 0xffffff)) * -1022818925;
			}
		}
		if (((Class528_Sub2) this).anInt8598 == 2)
			((Class528_Sub2) this).anInt8598 = 1;
	}

	void method13798(boolean bool) {
		if (((Class528_Sub2) this).anInt8598 == 1)
			method13801();
		else if (((Class528_Sub2) this).anInt8598 == 2) {
			if ((((Class528_Sub2) this).anInt8575 & 0x97098) == 0 && ((Class528_Sub2) this).aFloatArrayArray8635 == null)
				((Class528_Sub2) this).aShortArray8604 = null;
			if (bool)
				((Class528_Sub2) this).aByteArray8600 = null;
		} else {
			method13877();
			int i = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9011) * 1302966735;
			int i_24_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt8988) * -1947219005;
			int i_25_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9007) * 1237704411;
			int i_26_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt8992) * -456583957 >> 8;
			int i_27_ = 0;
			int i_28_ = 0;
			if (((Class528_Sub2) this).anInt8577 != 0) {
				i_27_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt8990 * -1085780736 / ((Class528_Sub2) this).anInt8577);
				i_28_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt8991 * -1967065344 / ((Class528_Sub2) this).anInt8577);
			}
			if (((Class528_Sub2) this).anIntArray8592 == null) {
				((Class528_Sub2) this).anIntArray8592 = new int[((Class528_Sub2) this).anInt8586];
				((Class528_Sub2) this).anIntArray8631 = new int[((Class528_Sub2) this).anInt8586];
				((Class528_Sub2) this).anIntArray8594 = new int[((Class528_Sub2) this).anInt8586];
			}
			for (int i_29_ = 0; i_29_ < ((Class528_Sub2) this).anInt8586; i_29_++) {
				byte i_30_;
				if (((Class528_Sub2) this).aByteArray8600 == null)
					i_30_ = (byte) 0;
				else
					i_30_ = ((Class528_Sub2) this).aByteArray8600[i_29_];
				byte i_31_;
				if (((Class528_Sub2) this).aByteArray8602 == null)
					i_31_ = (byte) 0;
				else
					i_31_ = ((Class528_Sub2) this).aByteArray8602[i_29_];
				short i_32_;
				if (((Class528_Sub2) this).aShortArray8603 == null)
					i_32_ = (short) -1;
				else
					i_32_ = ((Class528_Sub2) this).aShortArray8603[i_29_];
				if (i_31_ == -2)
					i_30_ = (byte) 3;
				if (i_31_ == -1)
					i_30_ = (byte) 2;
				if (i_32_ == -1) {
					if (i_30_ == 0) {
						int i_33_ = (((Class528_Sub2) this).aShortArray8604[i_29_] & 0xffff);
						int i_34_ = (((i_33_ & 0x7f) * ((Class528_Sub2) this).anInt8606) >> 7);
						short i_35_ = Class372.method6362(i_33_ & ~0x7f | i_34_, 1639823285);
						Class189 class189;
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8587[i_29_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8587[i_29_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8587[i_29_])]);
						int i_36_ = (((i * ((Class189) class189).anInt2380 + i_24_ * ((Class189) class189).anInt2381 + i_25_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16);
						int i_37_ = i_36_ > 256 ? i_27_ : i_28_;
						int i_38_ = (i_26_ >> 1) + (i_37_ * i_36_ >> 17);
						((Class528_Sub2) this).anIntArray8592[i_29_] = (i_38_ << 17 | Class282_Sub20_Sub2.method15076(i_35_, i_38_, -1278791259));
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8588[i_29_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8588[i_29_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8588[i_29_])]);
						i_36_ = ((i * ((Class189) class189).anInt2380 + i_24_ * ((Class189) class189).anInt2381 + i_25_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16;
						i_37_ = i_36_ > 256 ? i_27_ : i_28_;
						i_38_ = (i_26_ >> 1) + (i_37_ * i_36_ >> 17);
						((Class528_Sub2) this).anIntArray8631[i_29_] = (i_38_ << 17 | Class282_Sub20_Sub2.method15076(i_35_, i_38_, -1871859335));
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8642[i_29_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8642[i_29_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8642[i_29_])]);
						i_36_ = ((i * ((Class189) class189).anInt2380 + i_24_ * ((Class189) class189).anInt2381 + i_25_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16;
						i_37_ = i_36_ > 256 ? i_27_ : i_28_;
						i_38_ = (i_26_ >> 1) + (i_37_ * i_36_ >> 17);
						((Class528_Sub2) this).anIntArray8594[i_29_] = (i_38_ << 17 | Class282_Sub20_Sub2.method15076(i_35_, i_38_, -2145226586));
					} else if (i_30_ == 1) {
						int i_39_ = (((Class528_Sub2) this).aShortArray8604[i_29_] & 0xffff);
						int i_40_ = (((i_39_ & 0x7f) * ((Class528_Sub2) this).anInt8606) >> 7);
						short i_41_ = Class372.method6362(i_39_ & ~0x7f | i_40_, 646072999);
						Class195 class195 = ((Class528_Sub2) this).aClass195Array8599[i_29_];
						int i_42_ = ((i * ((Class195) class195).anInt2410 + i_24_ * ((Class195) class195).anInt2411 + i_25_ * ((Class195) class195).anInt2412) >> 16);
						int i_43_ = i_42_ > 256 ? i_27_ : i_28_;
						int i_44_ = (i_26_ >> 1) + (i_43_ * i_42_ >> 17);
						((Class528_Sub2) this).anIntArray8592[i_29_] = (i_44_ << 17 | Class282_Sub20_Sub2.method15076(i_41_, i_44_, -1499238507));
						((Class528_Sub2) this).anIntArray8594[i_29_] = -1;
					} else if (i_30_ == 3) {
						((Class528_Sub2) this).anIntArray8592[i_29_] = 128;
						((Class528_Sub2) this).anIntArray8594[i_29_] = -1;
					} else
						((Class528_Sub2) this).anIntArray8594[i_29_] = -2;
				} else {
					int i_45_ = (((Class528_Sub2) this).aShortArray8604[i_29_] & 0xffff);
					if (i_30_ == 0) {
						Class189 class189;
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8587[i_29_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8587[i_29_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8587[i_29_])]);
						int i_46_ = (((i * ((Class189) class189).anInt2380 + i_24_ * ((Class189) class189).anInt2381 + i_25_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16);
						int i_47_ = i_46_ > 256 ? i_27_ : i_28_;
						int i_48_ = method13800((i_26_ >> 2) + (i_47_ * i_46_ >> 18));
						((Class528_Sub2) this).anIntArray8592[i_29_] = i_48_ << 24 | method13799(i_45_, i_32_, i_48_);
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8588[i_29_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8588[i_29_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8588[i_29_])]);
						i_46_ = ((i * ((Class189) class189).anInt2380 + i_24_ * ((Class189) class189).anInt2381 + i_25_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16;
						i_47_ = i_46_ > 256 ? i_27_ : i_28_;
						i_48_ = method13800((i_26_ >> 2) + (i_47_ * i_46_ >> 18));
						((Class528_Sub2) this).anIntArray8631[i_29_] = i_48_ << 24 | method13799(i_45_, i_32_, i_48_);
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8642[i_29_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8642[i_29_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8642[i_29_])]);
						i_46_ = ((i * ((Class189) class189).anInt2380 + i_24_ * ((Class189) class189).anInt2381 + i_25_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16;
						i_47_ = i_46_ > 256 ? i_27_ : i_28_;
						i_48_ = method13800((i_26_ >> 2) + (i_47_ * i_46_ >> 18));
						((Class528_Sub2) this).anIntArray8594[i_29_] = i_48_ << 24 | method13799(i_45_, i_32_, i_48_);
					} else if (i_30_ == 1) {
						Class195 class195 = ((Class528_Sub2) this).aClass195Array8599[i_29_];
						int i_49_ = ((i * ((Class195) class195).anInt2410 + i_24_ * ((Class195) class195).anInt2411 + i_25_ * ((Class195) class195).anInt2412) >> 16);
						int i_50_ = i_49_ > 256 ? i_27_ : i_28_;
						int i_51_ = method13800((i_26_ >> 2) + (i_50_ * i_49_ >> 18));
						((Class528_Sub2) this).anIntArray8592[i_29_] = i_51_ << 24 | method13799(i_45_, i_32_, i_51_);
						((Class528_Sub2) this).anIntArray8594[i_29_] = -1;
					} else
						((Class528_Sub2) this).anIntArray8594[i_29_] = -2;
				}
			}
			((Class528_Sub2) this).aClass189Array8584 = null;
			((Class528_Sub2) this).aClass189Array8585 = null;
			((Class528_Sub2) this).aClass195Array8599 = null;
			if ((((Class528_Sub2) this).anInt8575 & 0x97098) == 0 && ((Class528_Sub2) this).aFloatArrayArray8635 == null)
				((Class528_Sub2) this).aShortArray8604 = null;
			if (bool)
				((Class528_Sub2) this).aByteArray8600 = null;
			((Class528_Sub2) this).anInt8598 = 2;
		}
	}

	int method13799(int i, short i_52_, int i_53_) {
		int i_54_ = Class540.anIntArray7136[method13855(i, i_53_)];
		Class169 class169 = ((Class528_Sub2) this).aClass505_Sub3_8638.anInterface22_5834.method144(i_52_ & 0xffff, -1944142308);
		int i_55_ = class169.aByte2079 & 0xff;
		if (i_55_ != 0) {
			int i_56_ = 131586 * i_53_;
			if (i_55_ == 256)
				i_54_ = i_56_;
			else {
				int i_57_ = i_55_;
				int i_58_ = 256 - i_55_;
				i_54_ = (((i_56_ & 0xff00ff) * i_57_ + (i_54_ & 0xff00ff) * i_58_ & ~0xff00ff) + ((i_56_ & 0xff00) * i_57_ + (i_54_ & 0xff00) * i_58_ & 0xff0000)) >> 8;
			}
		}
		int i_59_ = class169.aByte2080 & 0xff;
		if (i_59_ != 0) {
			i_59_ += 256;
			int i_60_ = ((i_54_ & 0xff0000) >> 16) * i_59_;
			if (i_60_ > 65535)
				i_60_ = 65535;
			int i_61_ = ((i_54_ & 0xff00) >> 8) * i_59_;
			if (i_61_ > 65535)
				i_61_ = 65535;
			int i_62_ = (i_54_ & 0xff) * i_59_;
			if (i_62_ > 65535)
				i_62_ = 65535;
			i_54_ = (i_60_ << 8 & 0xff0000) + (i_61_ & 0xff00) + (i_62_ >> 8);
		}
		return i_54_;
	}

	public MeshRasterizer method11289(byte i, int i_63_, boolean bool) {
		method13796(Thread.currentThread());
		boolean bool_64_ = false;
		Class528_Sub2 class528_sub2_65_;
		Class528_Sub2 class528_sub2_66_;
		if (i > 0 && i <= 7) {
			class528_sub2_66_ = ((Class528_Sub2) this).aClass528_Sub2Array8645[i - 1];
			class528_sub2_65_ = ((Class528_Sub2) this).aClass528_Sub2Array8626[i - 1];
			bool_64_ = true;
		} else
			class528_sub2_65_ = class528_sub2_66_ = new Class528_Sub2(((Class528_Sub2) this).aClass505_Sub3_8638);
		return method13804(class528_sub2_65_, class528_sub2_66_, i_63_, bool_64_, bool);
	}

	int method13800(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	void method13801() {
		if (((Class528_Sub2) this).anInt8598 == 0)
			method13853(false);
		else if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				method13802();
			}
		} else
			method13802();
	}

	void method13802() {
		for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
			short i_67_ = (((Class528_Sub2) this).aShortArray8603 != null ? ((Class528_Sub2) this).aShortArray8603[i] : (short) -1);
			if (i_67_ == -1) {
				int i_68_ = ((Class528_Sub2) this).aShortArray8604[i] & 0xffff;
				int i_69_ = (i_68_ & 0x7f) * ((Class528_Sub2) this).anInt8606 >> 7;
				short i_70_ = Class372.method6362(i_68_ & ~0x7f | i_69_, 1473480576);
				if (((Class528_Sub2) this).anIntArray8594[i] == -1) {
					int i_71_ = ((Class528_Sub2) this).anIntArray8592[i] & ~0x1ffff;
					((Class528_Sub2) this).anIntArray8592[i] = i_71_ | Class282_Sub20_Sub2.method15076(i_70_, i_71_ >> 17, -1901811732);
				} else if (((Class528_Sub2) this).anIntArray8594[i] != -2) {
					int i_72_ = ((Class528_Sub2) this).anIntArray8592[i] & ~0x1ffff;
					((Class528_Sub2) this).anIntArray8592[i] = i_72_ | Class282_Sub20_Sub2.method15076(i_70_, i_72_ >> 17, -1355323417);
					i_72_ = ((Class528_Sub2) this).anIntArray8631[i] & ~0x1ffff;
					((Class528_Sub2) this).anIntArray8631[i] = i_72_ | Class282_Sub20_Sub2.method15076(i_70_, i_72_ >> 17, -1594902351);
					i_72_ = ((Class528_Sub2) this).anIntArray8594[i] & ~0x1ffff;
					((Class528_Sub2) this).anIntArray8594[i] = i_72_ | Class282_Sub20_Sub2.method15076(i_70_, i_72_ >> 17, -2107311246);
				}
			}
		}
		((Class528_Sub2) this).anInt8598 = 2;
	}

	final boolean method13803(int i) {
		if (((Class528_Sub2) this).anIntArray8643 == null)
			return false;
		if (((Class528_Sub2) this).anIntArray8643[i] == -1)
			return false;
		return true;
	}

	public Class282_Sub50_Sub17 dn(Class282_Sub50_Sub17 class282_sub50_sub17) {
		return null;
	}

	MeshRasterizer method13804(Class528_Sub2 class528_sub2_73_, Class528_Sub2 class528_sub2_74_, int i, boolean bool, boolean bool_75_) {
		((Class528_Sub2) class528_sub2_73_).aBool8621 = ((Class528_Sub2) this).aBool8621;
		if (((Class528_Sub2) this).aBool8621) {
			((Class528_Sub2) class528_sub2_73_).aShort8627 = ((Class528_Sub2) this).aShort8627;
			((Class528_Sub2) class528_sub2_73_).aShort8625 = ((Class528_Sub2) this).aShort8625;
			((Class528_Sub2) class528_sub2_73_).aShort8629 = ((Class528_Sub2) this).aShort8629;
			((Class528_Sub2) class528_sub2_73_).aShort8634 = ((Class528_Sub2) this).aShort8634;
			((Class528_Sub2) class528_sub2_73_).aShort8570 = ((Class528_Sub2) this).aShort8570;
			((Class528_Sub2) class528_sub2_73_).aShort8571 = ((Class528_Sub2) this).aShort8571;
			((Class528_Sub2) class528_sub2_73_).aShort8595 = ((Class528_Sub2) this).aShort8595;
			((Class528_Sub2) class528_sub2_73_).aShort8574 = ((Class528_Sub2) this).aShort8574;
		}
		((Class528_Sub2) class528_sub2_73_).anInt8606 = ((Class528_Sub2) this).anInt8606;
		((Class528_Sub2) class528_sub2_73_).anInt8577 = ((Class528_Sub2) this).anInt8577;
		((Class528_Sub2) class528_sub2_73_).anInt8578 = ((Class528_Sub2) this).anInt8578;
		((Class528_Sub2) class528_sub2_73_).anInt8579 = ((Class528_Sub2) this).anInt8579;
		((Class528_Sub2) class528_sub2_73_).anInt8586 = ((Class528_Sub2) this).anInt8586;
		((Class528_Sub2) class528_sub2_73_).anInt8617 = ((Class528_Sub2) this).anInt8617;
		if ((i & 0x100) != 0)
			((Class528_Sub2) class528_sub2_73_).aBool8630 = true;
		else
			((Class528_Sub2) class528_sub2_73_).aBool8630 = ((Class528_Sub2) this).aBool8630;
		((Class528_Sub2) class528_sub2_73_).aBool8640 = ((Class528_Sub2) this).aBool8640;
		boolean bool_76_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_77_ = bool_76_ || (i & 0x1) != 0;
		boolean bool_78_ = bool_76_ || (i & 0x2) != 0;
		boolean bool_79_ = bool_76_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_77_ || bool_78_ || bool_79_) {
			if (bool_77_) {
				if (((Class528_Sub2) class528_sub2_74_).anIntArray8580 == null || ((((Class528_Sub2) class528_sub2_74_).anIntArray8580).length < ((Class528_Sub2) this).anInt8578))
					((Class528_Sub2) class528_sub2_73_).anIntArray8580 = ((Class528_Sub2) class528_sub2_74_).anIntArray8580 = new int[((Class528_Sub2) this).anInt8578];
				else
					((Class528_Sub2) class528_sub2_73_).anIntArray8580 = ((Class528_Sub2) class528_sub2_74_).anIntArray8580;
				for (int i_80_ = 0; i_80_ < ((Class528_Sub2) this).anInt8578; i_80_++)
					((Class528_Sub2) class528_sub2_73_).anIntArray8580[i_80_] = ((Class528_Sub2) this).anIntArray8580[i_80_];
			} else
				((Class528_Sub2) class528_sub2_73_).anIntArray8580 = ((Class528_Sub2) this).anIntArray8580;
			if (bool_78_) {
				if (((Class528_Sub2) class528_sub2_74_).anIntArray8581 == null || ((((Class528_Sub2) class528_sub2_74_).anIntArray8581).length < ((Class528_Sub2) this).anInt8578))
					((Class528_Sub2) class528_sub2_73_).anIntArray8581 = ((Class528_Sub2) class528_sub2_74_).anIntArray8581 = new int[((Class528_Sub2) this).anInt8578];
				else
					((Class528_Sub2) class528_sub2_73_).anIntArray8581 = ((Class528_Sub2) class528_sub2_74_).anIntArray8581;
				for (int i_81_ = 0; i_81_ < ((Class528_Sub2) this).anInt8578; i_81_++)
					((Class528_Sub2) class528_sub2_73_).anIntArray8581[i_81_] = ((Class528_Sub2) this).anIntArray8581[i_81_];
			} else
				((Class528_Sub2) class528_sub2_73_).anIntArray8581 = ((Class528_Sub2) this).anIntArray8581;
			if (bool_79_) {
				if (((Class528_Sub2) class528_sub2_74_).anIntArray8610 == null || ((((Class528_Sub2) class528_sub2_74_).anIntArray8610).length < ((Class528_Sub2) this).anInt8578))
					((Class528_Sub2) class528_sub2_73_).anIntArray8610 = ((Class528_Sub2) class528_sub2_74_).anIntArray8610 = new int[((Class528_Sub2) this).anInt8578];
				else
					((Class528_Sub2) class528_sub2_73_).anIntArray8610 = ((Class528_Sub2) class528_sub2_74_).anIntArray8610;
				for (int i_82_ = 0; i_82_ < ((Class528_Sub2) this).anInt8578; i_82_++)
					((Class528_Sub2) class528_sub2_73_).anIntArray8610[i_82_] = ((Class528_Sub2) this).anIntArray8610[i_82_];
			} else
				((Class528_Sub2) class528_sub2_73_).anIntArray8610 = ((Class528_Sub2) this).anIntArray8610;
		} else {
			((Class528_Sub2) class528_sub2_73_).anIntArray8580 = ((Class528_Sub2) this).anIntArray8580;
			((Class528_Sub2) class528_sub2_73_).anIntArray8581 = ((Class528_Sub2) this).anIntArray8581;
			((Class528_Sub2) class528_sub2_73_).anIntArray8610 = ((Class528_Sub2) this).anIntArray8610;
		}
		if ((i & 0x84080) != 0) {
			if (((Class528_Sub2) class528_sub2_74_).aShortArray8604 == null || (((Class528_Sub2) class528_sub2_74_).aShortArray8604.length < ((Class528_Sub2) this).anInt8586)) {
				int i_83_ = ((Class528_Sub2) this).anInt8586;
				((Class528_Sub2) class528_sub2_73_).aShortArray8604 = ((Class528_Sub2) class528_sub2_74_).aShortArray8604 = new short[i_83_];
			} else
				((Class528_Sub2) class528_sub2_73_).aShortArray8604 = ((Class528_Sub2) class528_sub2_74_).aShortArray8604;
			for (int i_84_ = 0; i_84_ < ((Class528_Sub2) this).anInt8586; i_84_++)
				((Class528_Sub2) class528_sub2_73_).aShortArray8604[i_84_] = ((Class528_Sub2) this).aShortArray8604[i_84_];
		} else
			((Class528_Sub2) class528_sub2_73_).aShortArray8604 = ((Class528_Sub2) this).aShortArray8604;
		if ((i & 0x97018) != 0) {
			((Class528_Sub2) class528_sub2_73_).anInt8598 = 0;
			Class528_Sub2 class528_sub2_85_ = class528_sub2_73_;
			Class528_Sub2 class528_sub2_86_ = class528_sub2_73_;
			((Class528_Sub2) class528_sub2_73_).anIntArray8594 = null;
			((Class528_Sub2) class528_sub2_86_).anIntArray8631 = null;
			((Class528_Sub2) class528_sub2_85_).anIntArray8592 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_75_)
				method13853(false);
			if (((Class528_Sub2) this).anIntArray8592 != null) {
				if (((Class528_Sub2) class528_sub2_74_).anIntArray8592 == null || ((((Class528_Sub2) class528_sub2_74_).anIntArray8592).length < ((Class528_Sub2) this).anInt8586)) {
					int i_87_ = ((Class528_Sub2) this).anInt8586;
					((Class528_Sub2) class528_sub2_73_).anIntArray8592 = ((Class528_Sub2) class528_sub2_74_).anIntArray8592 = new int[i_87_];
					((Class528_Sub2) class528_sub2_73_).anIntArray8631 = ((Class528_Sub2) class528_sub2_74_).anIntArray8631 = new int[i_87_];
					((Class528_Sub2) class528_sub2_73_).anIntArray8594 = ((Class528_Sub2) class528_sub2_74_).anIntArray8594 = new int[i_87_];
				} else {
					((Class528_Sub2) class528_sub2_73_).anIntArray8592 = ((Class528_Sub2) class528_sub2_74_).anIntArray8592;
					((Class528_Sub2) class528_sub2_73_).anIntArray8631 = ((Class528_Sub2) class528_sub2_74_).anIntArray8631;
					((Class528_Sub2) class528_sub2_73_).anIntArray8594 = ((Class528_Sub2) class528_sub2_74_).anIntArray8594;
				}
				for (int i_88_ = 0; i_88_ < ((Class528_Sub2) this).anInt8586; i_88_++) {
					((Class528_Sub2) class528_sub2_73_).anIntArray8592[i_88_] = ((Class528_Sub2) this).anIntArray8592[i_88_];
					((Class528_Sub2) class528_sub2_73_).anIntArray8631[i_88_] = ((Class528_Sub2) this).anIntArray8631[i_88_];
					((Class528_Sub2) class528_sub2_73_).anIntArray8594[i_88_] = ((Class528_Sub2) this).anIntArray8594[i_88_];
				}
			}
			((Class528_Sub2) class528_sub2_73_).anInt8598 = ((Class528_Sub2) this).anInt8598;
		} else {
			if (bool_75_)
				method13853(false);
			((Class528_Sub2) class528_sub2_73_).anIntArray8592 = ((Class528_Sub2) this).anIntArray8592;
			((Class528_Sub2) class528_sub2_73_).anIntArray8631 = ((Class528_Sub2) this).anIntArray8631;
			((Class528_Sub2) class528_sub2_73_).anIntArray8594 = ((Class528_Sub2) this).anIntArray8594;
			((Class528_Sub2) class528_sub2_73_).anInt8598 = ((Class528_Sub2) this).anInt8598;
		}
		if ((i & 0x100) != 0) {
			if (((Class528_Sub2) class528_sub2_74_).aByteArray8602 == null || (((Class528_Sub2) class528_sub2_74_).aByteArray8602.length < ((Class528_Sub2) this).anInt8586)) {
				int i_89_ = ((Class528_Sub2) this).anInt8586;
				((Class528_Sub2) class528_sub2_73_).aByteArray8602 = ((Class528_Sub2) class528_sub2_74_).aByteArray8602 = new byte[i_89_];
			} else
				((Class528_Sub2) class528_sub2_73_).aByteArray8602 = ((Class528_Sub2) class528_sub2_74_).aByteArray8602;
			if (((Class528_Sub2) this).aByteArray8602 != null) {
				for (int i_90_ = 0; i_90_ < ((Class528_Sub2) this).anInt8586; i_90_++)
					((Class528_Sub2) class528_sub2_73_).aByteArray8602[i_90_] = ((Class528_Sub2) this).aByteArray8602[i_90_];
			} else {
				for (int i_91_ = 0; i_91_ < ((Class528_Sub2) this).anInt8586; i_91_++)
					((Class528_Sub2) class528_sub2_73_).aByteArray8602[i_91_] = (byte) 0;
			}
		} else
			((Class528_Sub2) class528_sub2_73_).aByteArray8602 = ((Class528_Sub2) this).aByteArray8602;
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (((Class528_Sub2) class528_sub2_74_).aClass189Array8584 == null || ((((Class528_Sub2) class528_sub2_74_).aClass189Array8584).length < ((Class528_Sub2) this).anInt8579)) {
				int i_92_ = ((Class528_Sub2) this).anInt8579;
				((Class528_Sub2) class528_sub2_73_).aClass189Array8584 = ((Class528_Sub2) class528_sub2_74_).aClass189Array8584 = new Class189[i_92_];
			} else
				((Class528_Sub2) class528_sub2_73_).aClass189Array8584 = ((Class528_Sub2) class528_sub2_74_).aClass189Array8584;
			if (((Class528_Sub2) this).aClass189Array8584 != null) {
				for (int i_93_ = 0; i_93_ < ((Class528_Sub2) this).anInt8579; i_93_++)
					((Class528_Sub2) class528_sub2_73_).aClass189Array8584[i_93_] = new Class189(((Class528_Sub2) this).aClass189Array8584[i_93_]);
			} else
				((Class528_Sub2) class528_sub2_73_).aClass189Array8584 = null;
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				if ((((Class528_Sub2) class528_sub2_74_).aClass195Array8599 == null) || ((((Class528_Sub2) class528_sub2_74_).aClass195Array8599).length < ((Class528_Sub2) this).anInt8586)) {
					int i_94_ = ((Class528_Sub2) this).anInt8586;
					((Class528_Sub2) class528_sub2_73_).aClass195Array8599 = ((Class528_Sub2) class528_sub2_74_).aClass195Array8599 = new Class195[i_94_];
				} else
					((Class528_Sub2) class528_sub2_73_).aClass195Array8599 = (((Class528_Sub2) class528_sub2_74_).aClass195Array8599);
				for (int i_95_ = 0; i_95_ < ((Class528_Sub2) this).anInt8586; i_95_++)
					((Class528_Sub2) class528_sub2_73_).aClass195Array8599[i_95_] = ((((Class528_Sub2) this).aClass195Array8599[i_95_] != null) ? new Class195(((Class528_Sub2) this).aClass195Array8599[i_95_]) : null);
			} else
				((Class528_Sub2) class528_sub2_73_).aClass195Array8599 = null;
		} else {
			if (bool_75_)
				method13877();
			((Class528_Sub2) class528_sub2_73_).aClass189Array8584 = ((Class528_Sub2) this).aClass189Array8584;
			((Class528_Sub2) class528_sub2_73_).aClass195Array8599 = ((Class528_Sub2) this).aClass195Array8599;
		}
		if ((i & 0x8000) != 0) {
			if (((Class528_Sub2) this).aShortArray8603 == null)
				((Class528_Sub2) class528_sub2_73_).aShortArray8603 = null;
			else {
				if (((Class528_Sub2) class528_sub2_74_).aShortArray8603 == null || ((((Class528_Sub2) class528_sub2_74_).aShortArray8603).length < ((Class528_Sub2) this).anInt8586)) {
					int i_96_ = ((Class528_Sub2) this).anInt8586;
					((Class528_Sub2) class528_sub2_73_).aShortArray8603 = ((Class528_Sub2) class528_sub2_74_).aShortArray8603 = new short[i_96_];
				} else
					((Class528_Sub2) class528_sub2_73_).aShortArray8603 = ((Class528_Sub2) class528_sub2_74_).aShortArray8603;
				for (int i_97_ = 0; i_97_ < ((Class528_Sub2) this).anInt8586; i_97_++)
					((Class528_Sub2) class528_sub2_73_).aShortArray8603[i_97_] = ((Class528_Sub2) this).aShortArray8603[i_97_];
			}
		} else
			((Class528_Sub2) class528_sub2_73_).aShortArray8603 = ((Class528_Sub2) this).aShortArray8603;
		if ((i & 0x10000) != 0) {
			if (((Class528_Sub2) this).aByteArray8600 == null)
				((Class528_Sub2) class528_sub2_73_).aByteArray8600 = null;
			else {
				if (((Class528_Sub2) class528_sub2_74_).aByteArray8600 == null || ((((Class528_Sub2) class528_sub2_74_).aByteArray8600).length < ((Class528_Sub2) this).anInt8586)) {
					int i_98_ = (bool ? ((Class528_Sub2) this).anInt8586 + 100 : ((Class528_Sub2) this).anInt8586);
					((Class528_Sub2) class528_sub2_73_).aByteArray8600 = ((Class528_Sub2) class528_sub2_74_).aByteArray8600 = new byte[i_98_];
				} else
					((Class528_Sub2) class528_sub2_73_).aByteArray8600 = ((Class528_Sub2) class528_sub2_74_).aByteArray8600;
				for (int i_99_ = 0; i_99_ < ((Class528_Sub2) this).anInt8586; i_99_++)
					((Class528_Sub2) class528_sub2_73_).aByteArray8600[i_99_] = ((Class528_Sub2) this).aByteArray8600[i_99_];
			}
		} else
			((Class528_Sub2) class528_sub2_73_).aByteArray8600 = ((Class528_Sub2) this).aByteArray8600;
		if ((i & 0xc580) != 0) {
			if (((Class528_Sub2) class528_sub2_74_).aClass176Array8582 == null || ((((Class528_Sub2) class528_sub2_74_).aClass176Array8582).length < ((Class528_Sub2) this).anInt8617)) {
				int i_100_ = ((Class528_Sub2) this).anInt8617;
				((Class528_Sub2) class528_sub2_73_).aClass176Array8582 = ((Class528_Sub2) class528_sub2_74_).aClass176Array8582 = new Class176[i_100_];
				for (int i_101_ = 0; i_101_ < ((Class528_Sub2) this).anInt8617; i_101_++)
					((Class528_Sub2) class528_sub2_73_).aClass176Array8582[i_101_] = ((Class528_Sub2) this).aClass176Array8582[i_101_].method2972(1878824746);
			} else {
				((Class528_Sub2) class528_sub2_73_).aClass176Array8582 = ((Class528_Sub2) class528_sub2_74_).aClass176Array8582;
				for (int i_102_ = 0; i_102_ < ((Class528_Sub2) this).anInt8617; i_102_++)
					((Class528_Sub2) class528_sub2_73_).aClass176Array8582[i_102_].method2968(((Class528_Sub2) this).aClass176Array8582[i_102_], 1574407861);
			}
		} else
			((Class528_Sub2) class528_sub2_73_).aClass176Array8582 = ((Class528_Sub2) this).aClass176Array8582;
		if (((Class528_Sub2) this).aFloatArrayArray8635 != null && (i & 0x10) != 0) {
			if ((((Class528_Sub2) class528_sub2_74_).aFloatArrayArray8635 == null) || ((((Class528_Sub2) class528_sub2_74_).aFloatArrayArray8635).length < ((Class528_Sub2) this).anInt8586)) {
				int i_103_ = (bool ? ((Class528_Sub2) this).anInt8586 + 100 : ((Class528_Sub2) this).anInt8586);
				((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8635 = ((Class528_Sub2) class528_sub2_74_).aFloatArrayArray8635 = new float[i_103_][3];
			} else
				((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8635 = ((Class528_Sub2) class528_sub2_74_).aFloatArrayArray8635;
			for (int i_104_ = 0; i_104_ < ((Class528_Sub2) this).anInt8586; i_104_++) {
				if (((Class528_Sub2) this).aFloatArrayArray8635[i_104_] != null) {
					((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8635[i_104_][0] = (((Class528_Sub2) this).aFloatArrayArray8635[i_104_][0]);
					((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8635[i_104_][1] = (((Class528_Sub2) this).aFloatArrayArray8635[i_104_][1]);
					((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8635[i_104_][2] = (((Class528_Sub2) this).aFloatArrayArray8635[i_104_][2]);
				}
			}
			if ((((Class528_Sub2) class528_sub2_74_).aFloatArrayArray8591 == null) || ((((Class528_Sub2) class528_sub2_74_).aFloatArrayArray8591).length < ((Class528_Sub2) this).anInt8586)) {
				int i_105_ = (bool ? ((Class528_Sub2) this).anInt8586 + 100 : ((Class528_Sub2) this).anInt8586);
				((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8591 = ((Class528_Sub2) class528_sub2_74_).aFloatArrayArray8591 = new float[i_105_][3];
			} else
				((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8591 = ((Class528_Sub2) class528_sub2_74_).aFloatArrayArray8591;
			for (int i_106_ = 0; i_106_ < ((Class528_Sub2) this).anInt8586; i_106_++) {
				if (((Class528_Sub2) this).aFloatArrayArray8591[i_106_] != null) {
					((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8591[i_106_][0] = (((Class528_Sub2) this).aFloatArrayArray8591[i_106_][0]);
					((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8591[i_106_][1] = (((Class528_Sub2) this).aFloatArrayArray8591[i_106_][1]);
					((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8591[i_106_][2] = (((Class528_Sub2) this).aFloatArrayArray8591[i_106_][2]);
				}
			}
		} else {
			((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8635 = ((Class528_Sub2) this).aFloatArrayArray8635;
			((Class528_Sub2) class528_sub2_73_).aFloatArrayArray8591 = ((Class528_Sub2) this).aFloatArrayArray8591;
		}
		((Class528_Sub2) class528_sub2_73_).anIntArrayArray8568 = ((Class528_Sub2) this).anIntArrayArray8568;
		((Class528_Sub2) class528_sub2_73_).anIntArrayArray8608 = ((Class528_Sub2) this).anIntArrayArray8608;
		((Class528_Sub2) class528_sub2_73_).anIntArrayArray8620 = ((Class528_Sub2) this).anIntArrayArray8620;
		((Class528_Sub2) class528_sub2_73_).aShortArray8569 = ((Class528_Sub2) this).aShortArray8569;
		((Class528_Sub2) class528_sub2_73_).aShortArray8632 = ((Class528_Sub2) this).aShortArray8632;
		((Class528_Sub2) class528_sub2_73_).aByteArray8601 = ((Class528_Sub2) this).aByteArray8601;
		((Class528_Sub2) class528_sub2_73_).aShortArray8587 = ((Class528_Sub2) this).aShortArray8587;
		((Class528_Sub2) class528_sub2_73_).aShortArray8588 = ((Class528_Sub2) this).aShortArray8588;
		((Class528_Sub2) class528_sub2_73_).aShortArray8642 = ((Class528_Sub2) this).aShortArray8642;
		((Class528_Sub2) class528_sub2_73_).aClass87Array8615 = ((Class528_Sub2) this).aClass87Array8615;
		((Class528_Sub2) class528_sub2_73_).aClass172Array8616 = ((Class528_Sub2) this).aClass172Array8616;
		((Class528_Sub2) class528_sub2_73_).aClass193Array8618 = ((Class528_Sub2) this).aClass193Array8618;
		((Class528_Sub2) class528_sub2_73_).aShortArray8623 = ((Class528_Sub2) this).aShortArray8623;
		((Class528_Sub2) class528_sub2_73_).anInt8575 = i;
		return class528_sub2_73_;
	}

	public int m() {
		return ((Class528_Sub2) this).anInt8575;
	}

	public void method11293(Class294 class294, Class275_Sub5 class275_sub5, int i) {
		method13814(class294, class275_sub5, i);
	}

	public void method11259() {
		/* empty */
	}

	public void f(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method13805();
		else if (i == 8192)
			method13806();
		else if (i == 12288)
			method13807();
		else {
			int i_107_ = Class382.anIntArray4657[i];
			int i_108_ = Class382.anIntArray4661[i];
			synchronized (this) {
				for (int i_109_ = 0; i_109_ < ((Class528_Sub2) this).anInt8578; i_109_++) {
					int i_110_ = (((((Class528_Sub2) this).anIntArray8610[i_109_] * i_107_) + (((Class528_Sub2) this).anIntArray8580[i_109_] * i_108_)) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_109_] = ((((Class528_Sub2) this).anIntArray8610[i_109_] * i_108_) - (((Class528_Sub2) this).anIntArray8580[i_109_] * i_107_)) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_109_] = i_110_;
				}
				method13812();
			}
		}
	}

	public void S(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0xd) != 13)
			throw new IllegalStateException();
		if (((Class528_Sub2) this).aClass189Array8584 != null) {
			if (i == 4096)
				method13850();
			else if (i == 8192)
				method13809();
			else if (i == 12288)
				method13810();
			else {
				int i_111_ = Class382.anIntArray4657[i];
				int i_112_ = Class382.anIntArray4661[i];
				synchronized (this) {
					for (int i_113_ = 0; i_113_ < ((Class528_Sub2) this).anInt8579; i_113_++) {
						int i_114_ = ((((Class528_Sub2) this).anIntArray8610[i_113_] * i_111_) + (((Class528_Sub2) this).anIntArray8580[i_113_] * i_112_)) >> 14;
						((Class528_Sub2) this).anIntArray8610[i_113_] = ((((Class528_Sub2) this).anIntArray8610[i_113_] * i_112_) - (((Class528_Sub2) this).anIntArray8580[i_113_] * i_111_)) >> 14;
						((Class528_Sub2) this).anIntArray8580[i_113_] = i_114_;
						if (((Class528_Sub2) this).aClass189Array8584[i_113_] != null) {
							i_114_ = ((((Class189) (((Class528_Sub2) this).aClass189Array8584[i_113_])).anInt2379) * i_111_ + (((Class189) (((Class528_Sub2) this).aClass189Array8584[i_113_])).anInt2380 * i_112_)) >> 14;
							((Class189) (((Class528_Sub2) this).aClass189Array8584[i_113_])).anInt2379 = ((((Class189) (((Class528_Sub2) this).aClass189Array8584[i_113_])).anInt2379) * i_112_ - (((Class189) (((Class528_Sub2) this).aClass189Array8584[i_113_])).anInt2380 * i_111_)) >> 14;
							((Class189) (((Class528_Sub2) this).aClass189Array8584[i_113_])).anInt2380 = i_114_;
						}
					}
					if (((Class528_Sub2) this).aClass195Array8599 != null) {
						for (int i_115_ = 0; i_115_ < ((Class528_Sub2) this).anInt8586; i_115_++) {
							if ((((Class528_Sub2) this).aClass195Array8599[i_115_]) != null) {
								int i_116_ = (((((Class195) (((Class528_Sub2) this).aClass195Array8599[i_115_])).anInt2412 * i_111_) + (((Class195) (((Class528_Sub2) this).aClass195Array8599[i_115_])).anInt2410 * i_112_)) >> 14);
								((Class195) (((Class528_Sub2) this).aClass195Array8599[i_115_])).anInt2412 = ((((Class195) (((Class528_Sub2) this).aClass195Array8599[i_115_])).anInt2412 * i_112_) - (((Class195) (((Class528_Sub2) this).aClass195Array8599[i_115_])).anInt2410 * i_111_)) >> 14;
								((Class195) (((Class528_Sub2) this).aClass195Array8599[i_115_])).anInt2410 = i_116_;
							}
						}
					}
					for (int i_117_ = ((Class528_Sub2) this).anInt8579; i_117_ < ((Class528_Sub2) this).anInt8578; i_117_++) {
						int i_118_ = ((((Class528_Sub2) this).anIntArray8610[i_117_] * i_111_) + (((Class528_Sub2) this).anIntArray8580[i_117_] * i_112_)) >> 14;
						((Class528_Sub2) this).anIntArray8610[i_117_] = ((((Class528_Sub2) this).anIntArray8610[i_117_] * i_112_) - (((Class528_Sub2) this).anIntArray8580[i_117_] * i_111_)) >> 14;
						((Class528_Sub2) this).anIntArray8580[i_117_] = i_118_;
					}
					((Class528_Sub2) this).anInt8598 = 0;
					((Class528_Sub2) this).aBool8621 = false;
				}
			}
		} else
			f(i);
	}

	void method13805() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_119_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_119_;
			}
			method13812();
		}
	}

	void method13806() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			}
			method13812();
		}
	}

	void method13807() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_120_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_120_;
			}
			method13812();
		}
	}

	void method13808() {
		((Class528_Sub2) this).aClass189Array8584 = null;
		((Class528_Sub2) this).aClass189Array8585 = null;
		((Class528_Sub2) this).aClass195Array8599 = null;
		((Class528_Sub2) this).aBool8621 = false;
	}

	void method13809() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	void method13810() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				int i_121_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_121_;
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					i_121_ = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = -i_121_;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						int i_122_ = (((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412);
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = ((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = -i_122_;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_123_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_123_;
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	public void t(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x6) != 6)
			throw new IllegalStateException();
		int i_124_ = Class382.anIntArray4657[i];
		int i_125_ = Class382.anIntArray4661[i];
		synchronized (this) {
			for (int i_126_ = 0; i_126_ < ((Class528_Sub2) this).anInt8578; i_126_++) {
				int i_127_ = ((((Class528_Sub2) this).anIntArray8581[i_126_] * i_125_ - (((Class528_Sub2) this).anIntArray8610[i_126_] * i_124_)) >> 14);
				((Class528_Sub2) this).anIntArray8610[i_126_] = (((Class528_Sub2) this).anIntArray8581[i_126_] * i_124_ + (((Class528_Sub2) this).anIntArray8610[i_126_] * i_125_)) >> 14;
				((Class528_Sub2) this).anIntArray8581[i_126_] = i_127_;
			}
			method13812();
		}
	}

	public void EA(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x3) != 3)
			throw new IllegalStateException();
		int i_128_ = Class382.anIntArray4657[i];
		int i_129_ = Class382.anIntArray4661[i];
		synchronized (this) {
			for (int i_130_ = 0; i_130_ < ((Class528_Sub2) this).anInt8578; i_130_++) {
				int i_131_ = ((((Class528_Sub2) this).anIntArray8581[i_130_] * i_128_ + (((Class528_Sub2) this).anIntArray8580[i_130_] * i_129_)) >> 14);
				((Class528_Sub2) this).anIntArray8581[i_130_] = (((Class528_Sub2) this).anIntArray8581[i_130_] * i_129_ - (((Class528_Sub2) this).anIntArray8580[i_130_] * i_128_)) >> 14;
				((Class528_Sub2) this).anIntArray8580[i_130_] = i_131_;
			}
			method13812();
		}
	}

	int method13811(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	public void wa() {
		if ((((Class528_Sub2) this).anInt8575 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++)
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			if (((Class528_Sub2) this).aClass189Array8584 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
					if (((Class528_Sub2) this).aClass189Array8584[i] != null)
						((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass189Array8585 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
					if (((Class528_Sub2) this).aClass189Array8585[i] != null)
						((Class189) (((Class528_Sub2) this).aClass189Array8585[i])).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8585[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null)
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
				}
			}
			short[] is = ((Class528_Sub2) this).aShortArray8587;
			((Class528_Sub2) this).aShortArray8587 = ((Class528_Sub2) this).aShortArray8642;
			((Class528_Sub2) this).aShortArray8642 = is;
			if (((Class528_Sub2) this).aFloatArrayArray8635 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aFloatArrayArray8635[i] != null) {
						float f = (((Class528_Sub2) this).aFloatArrayArray8635[i][0]);
						((Class528_Sub2) this).aFloatArrayArray8635[i][0] = (((Class528_Sub2) this).aFloatArrayArray8635[i][2]);
						((Class528_Sub2) this).aFloatArrayArray8635[i][2] = f;
					}
					if (((Class528_Sub2) this).aFloatArrayArray8591[i] != null) {
						float f = (((Class528_Sub2) this).aFloatArrayArray8591[i][0]);
						((Class528_Sub2) this).aFloatArrayArray8591[i][0] = (((Class528_Sub2) this).aFloatArrayArray8591[i][2]);
						((Class528_Sub2) this).aFloatArrayArray8591[i][2] = f;
					}
				}
			}
			((Class528_Sub2) this).aBool8621 = false;
			((Class528_Sub2) this).anInt8598 = 0;
		}
	}

	public void oa(int i, int i_132_, int i_133_) {
		if (i != 128 && (((Class528_Sub2) this).anInt8575 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_132_ != 128 && (((Class528_Sub2) this).anInt8575 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_133_ != 128 && (((Class528_Sub2) this).anInt8575 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_134_ = 0; i_134_ < ((Class528_Sub2) this).anInt8578; i_134_++) {
				((Class528_Sub2) this).anIntArray8580[i_134_] = ((Class528_Sub2) this).anIntArray8580[i_134_] * i >> 7;
				((Class528_Sub2) this).anIntArray8581[i_134_] = (((Class528_Sub2) this).anIntArray8581[i_134_] * i_132_ >> 7);
				((Class528_Sub2) this).anIntArray8610[i_134_] = (((Class528_Sub2) this).anIntArray8610[i_134_] * i_133_ >> 7);
			}
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	void bp() {
		if (((Class528_Sub2) this).aBool8589) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8580[i] + 7 >> 4;
				((Class528_Sub2) this).anIntArray8581[i] = ((Class528_Sub2) this).anIntArray8581[i] + 7 >> 4;
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8610[i] + 7 >> 4;
			}
			((Class528_Sub2) this).aBool8589 = false;
		}
		if (((Class528_Sub2) this).aBool8609) {
			method13801();
			((Class528_Sub2) this).aBool8609 = false;
		}
		((Class528_Sub2) this).aBool8621 = false;
	}

	void method13812() {
		((Class528_Sub2) this).aClass189Array8584 = null;
		((Class528_Sub2) this).aClass189Array8585 = null;
		((Class528_Sub2) this).aClass195Array8599 = null;
		((Class528_Sub2) this).aBool8621 = false;
	}

	public void method11273(Class294 class294) {
		method13795(((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Class384 class384 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2317);
		class384.method6522(class294);
		if (((Class528_Sub2) this).aClass87Array8615 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).aClass87Array8615.length; i++) {
				Class87 class87 = ((Class528_Sub2) this).aClass87Array8615[i];
				Class87 class87_135_ = class87;
				if (class87.aClass87_835 != null)
					class87_135_ = class87.aClass87_835;
				class87_135_.anInt844 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_135_.anInt841 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_135_.anInt847 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_135_.anInt834 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_135_.anInt843 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_135_.anInt845 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_135_.anInt846 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_135_.anInt840 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_135_.anInt848 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub2) this).aClass172Array8616 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).aClass172Array8616.length; i++) {
				Class172 class172 = ((Class528_Sub2) this).aClass172Array8616[i];
				Class172 class172_136_ = class172;
				if (class172.aClass172_2114 != null)
					class172_136_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Class384(class384);
				class172_136_.anInt2113 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_136_.anInt2117 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_136_.anInt2118 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	void method11261() {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				aBool7023 = false;
				this.notifyAll();
			}
		}
	}

	void method13813() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	void ka() {
		if (((Class528_Sub2) this).aBool8589) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8580[i] + 7 >> 4;
				((Class528_Sub2) this).anIntArray8581[i] = ((Class528_Sub2) this).anIntArray8581[i] + 7 >> 4;
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8610[i] + 7 >> 4;
			}
			((Class528_Sub2) this).aBool8589 = false;
		}
		if (((Class528_Sub2) this).aBool8609) {
			method13801();
			((Class528_Sub2) this).aBool8609 = false;
		}
		((Class528_Sub2) this).aBool8621 = false;
	}

	void method11268(int i, int[] is, int i_137_, int i_138_, int i_139_, int i_140_, boolean bool) {
		int i_141_ = is.length;
		if (i == 0) {
			i_137_ <<= 4;
			i_138_ <<= 4;
			i_139_ <<= 4;
			if (!((Class528_Sub2) this).aBool8589) {
				for (int i_142_ = 0; i_142_ < ((Class528_Sub2) this).anInt8578; i_142_++) {
					((Class528_Sub2) this).anIntArray8580[i_142_] <<= 4;
					((Class528_Sub2) this).anIntArray8581[i_142_] <<= 4;
					((Class528_Sub2) this).anIntArray8610[i_142_] <<= 4;
				}
				((Class528_Sub2) this).aBool8589 = true;
			}
			int i_143_ = 0;
			((Class528_Sub2) this).anInt8611 = 0;
			((Class528_Sub2) this).anInt8607 = 0;
			((Class528_Sub2) this).anInt8613 = 0;
			for (int i_144_ = 0; i_144_ < i_141_; i_144_++) {
				int i_145_ = is[i_144_];
				if (i_145_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_146_ = ((Class528_Sub2) this).anIntArrayArray8568[i_145_];
					for (int i_147_ = 0; i_147_ < is_146_.length; i_147_++) {
						int i_148_ = is_146_[i_147_];
						((Class528_Sub2) this).anInt8611 += ((Class528_Sub2) this).anIntArray8580[i_148_];
						((Class528_Sub2) this).anInt8607 += ((Class528_Sub2) this).anIntArray8581[i_148_];
						((Class528_Sub2) this).anInt8613 += ((Class528_Sub2) this).anIntArray8610[i_148_];
						i_143_++;
					}
				}
			}
			if (i_143_ > 0) {
				((Class528_Sub2) this).anInt8611 = ((Class528_Sub2) this).anInt8611 / i_143_ + i_137_;
				((Class528_Sub2) this).anInt8607 = ((Class528_Sub2) this).anInt8607 / i_143_ + i_138_;
				((Class528_Sub2) this).anInt8613 = ((Class528_Sub2) this).anInt8613 / i_143_ + i_139_;
			} else {
				((Class528_Sub2) this).anInt8611 = i_137_;
				((Class528_Sub2) this).anInt8607 = i_138_;
				((Class528_Sub2) this).anInt8613 = i_139_;
			}
		} else if (i == 1) {
			i_137_ <<= 4;
			i_138_ <<= 4;
			i_139_ <<= 4;
			if (!((Class528_Sub2) this).aBool8589) {
				for (int i_149_ = 0; i_149_ < ((Class528_Sub2) this).anInt8578; i_149_++) {
					((Class528_Sub2) this).anIntArray8580[i_149_] <<= 4;
					((Class528_Sub2) this).anIntArray8581[i_149_] <<= 4;
					((Class528_Sub2) this).anIntArray8610[i_149_] <<= 4;
				}
				((Class528_Sub2) this).aBool8589 = true;
			}
			for (int i_150_ = 0; i_150_ < i_141_; i_150_++) {
				int i_151_ = is[i_150_];
				if (i_151_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_152_ = ((Class528_Sub2) this).anIntArrayArray8568[i_151_];
					for (int i_153_ = 0; i_153_ < is_152_.length; i_153_++) {
						int i_154_ = is_152_[i_153_];
						((Class528_Sub2) this).anIntArray8580[i_154_] += i_137_;
						((Class528_Sub2) this).anIntArray8581[i_154_] += i_138_;
						((Class528_Sub2) this).anIntArray8610[i_154_] += i_139_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_155_ = 0; i_155_ < i_141_; i_155_++) {
				int i_156_ = is[i_155_];
				if (i_156_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_157_ = ((Class528_Sub2) this).anIntArrayArray8568[i_156_];
					if ((i_140_ & 0x1) == 0) {
						for (int i_158_ = 0; i_158_ < is_157_.length; i_158_++) {
							int i_159_ = is_157_[i_158_];
							((Class528_Sub2) this).anIntArray8580[i_159_] -= ((Class528_Sub2) this).anInt8611;
							((Class528_Sub2) this).anIntArray8581[i_159_] -= ((Class528_Sub2) this).anInt8607;
							((Class528_Sub2) this).anIntArray8610[i_159_] -= ((Class528_Sub2) this).anInt8613;
							if (i_139_ != 0) {
								int i_160_ = Class382.anIntArray4657[i_139_];
								int i_161_ = Class382.anIntArray4661[i_139_];
								int i_162_ = (((((Class528_Sub2) this).anIntArray8581[i_159_]) * i_160_ + (((Class528_Sub2) this).anIntArray8580[i_159_]) * i_161_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8581[i_159_] = ((((Class528_Sub2) this).anIntArray8581[i_159_]) * i_161_ - (((Class528_Sub2) this).anIntArray8580[i_159_]) * i_160_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8580[i_159_] = i_162_;
							}
							if (i_137_ != 0) {
								int i_163_ = Class382.anIntArray4657[i_137_];
								int i_164_ = Class382.anIntArray4661[i_137_];
								int i_165_ = (((((Class528_Sub2) this).anIntArray8581[i_159_]) * i_164_ - (((Class528_Sub2) this).anIntArray8610[i_159_]) * i_163_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8610[i_159_] = ((((Class528_Sub2) this).anIntArray8581[i_159_]) * i_163_ + (((Class528_Sub2) this).anIntArray8610[i_159_]) * i_164_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8581[i_159_] = i_165_;
							}
							if (i_138_ != 0) {
								int i_166_ = Class382.anIntArray4657[i_138_];
								int i_167_ = Class382.anIntArray4661[i_138_];
								int i_168_ = (((((Class528_Sub2) this).anIntArray8610[i_159_]) * i_166_ + (((Class528_Sub2) this).anIntArray8580[i_159_]) * i_167_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8610[i_159_] = ((((Class528_Sub2) this).anIntArray8610[i_159_]) * i_167_ - (((Class528_Sub2) this).anIntArray8580[i_159_]) * i_166_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8580[i_159_] = i_168_;
							}
							((Class528_Sub2) this).anIntArray8580[i_159_] += ((Class528_Sub2) this).anInt8611;
							((Class528_Sub2) this).anIntArray8581[i_159_] += ((Class528_Sub2) this).anInt8607;
							((Class528_Sub2) this).anIntArray8610[i_159_] += ((Class528_Sub2) this).anInt8613;
						}
					} else {
						for (int i_169_ = 0; i_169_ < is_157_.length; i_169_++) {
							int i_170_ = is_157_[i_169_];
							((Class528_Sub2) this).anIntArray8580[i_170_] -= ((Class528_Sub2) this).anInt8611;
							((Class528_Sub2) this).anIntArray8581[i_170_] -= ((Class528_Sub2) this).anInt8607;
							((Class528_Sub2) this).anIntArray8610[i_170_] -= ((Class528_Sub2) this).anInt8613;
							if (i_137_ != 0) {
								int i_171_ = Class382.anIntArray4657[i_137_];
								int i_172_ = Class382.anIntArray4661[i_137_];
								int i_173_ = (((((Class528_Sub2) this).anIntArray8581[i_170_]) * i_172_ - (((Class528_Sub2) this).anIntArray8610[i_170_]) * i_171_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8610[i_170_] = ((((Class528_Sub2) this).anIntArray8581[i_170_]) * i_171_ + (((Class528_Sub2) this).anIntArray8610[i_170_]) * i_172_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8581[i_170_] = i_173_;
							}
							if (i_139_ != 0) {
								int i_174_ = Class382.anIntArray4657[i_139_];
								int i_175_ = Class382.anIntArray4661[i_139_];
								int i_176_ = (((((Class528_Sub2) this).anIntArray8581[i_170_]) * i_174_ + (((Class528_Sub2) this).anIntArray8580[i_170_]) * i_175_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8581[i_170_] = ((((Class528_Sub2) this).anIntArray8581[i_170_]) * i_175_ - (((Class528_Sub2) this).anIntArray8580[i_170_]) * i_174_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8580[i_170_] = i_176_;
							}
							if (i_138_ != 0) {
								int i_177_ = Class382.anIntArray4657[i_138_];
								int i_178_ = Class382.anIntArray4661[i_138_];
								int i_179_ = (((((Class528_Sub2) this).anIntArray8610[i_170_]) * i_177_ + (((Class528_Sub2) this).anIntArray8580[i_170_]) * i_178_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8610[i_170_] = ((((Class528_Sub2) this).anIntArray8610[i_170_]) * i_178_ - (((Class528_Sub2) this).anIntArray8580[i_170_]) * i_177_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8580[i_170_] = i_179_;
							}
							((Class528_Sub2) this).anIntArray8580[i_170_] += ((Class528_Sub2) this).anInt8611;
							((Class528_Sub2) this).anIntArray8581[i_170_] += ((Class528_Sub2) this).anInt8607;
							((Class528_Sub2) this).anIntArray8610[i_170_] += ((Class528_Sub2) this).anInt8613;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_180_ = 0; i_180_ < i_141_; i_180_++) {
				int i_181_ = is[i_180_];
				if (i_181_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_182_ = ((Class528_Sub2) this).anIntArrayArray8568[i_181_];
					for (int i_183_ = 0; i_183_ < is_182_.length; i_183_++) {
						int i_184_ = is_182_[i_183_];
						((Class528_Sub2) this).anIntArray8580[i_184_] -= ((Class528_Sub2) this).anInt8611;
						((Class528_Sub2) this).anIntArray8581[i_184_] -= ((Class528_Sub2) this).anInt8607;
						((Class528_Sub2) this).anIntArray8610[i_184_] -= ((Class528_Sub2) this).anInt8613;
						((Class528_Sub2) this).anIntArray8580[i_184_] = (((Class528_Sub2) this).anIntArray8580[i_184_] * i_137_ / 128);
						((Class528_Sub2) this).anIntArray8581[i_184_] = (((Class528_Sub2) this).anIntArray8581[i_184_] * i_138_ / 128);
						((Class528_Sub2) this).anIntArray8610[i_184_] = (((Class528_Sub2) this).anIntArray8610[i_184_] * i_139_ / 128);
						((Class528_Sub2) this).anIntArray8580[i_184_] += ((Class528_Sub2) this).anInt8611;
						((Class528_Sub2) this).anIntArray8581[i_184_] += ((Class528_Sub2) this).anInt8607;
						((Class528_Sub2) this).anIntArray8610[i_184_] += ((Class528_Sub2) this).anInt8613;
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub2) this).anIntArrayArray8608 != null && ((Class528_Sub2) this).aByteArray8602 != null) {
				for (int i_185_ = 0; i_185_ < i_141_; i_185_++) {
					int i_186_ = is[i_185_];
					if (i_186_ < ((Class528_Sub2) this).anIntArrayArray8608.length) {
						int[] is_187_ = (((Class528_Sub2) this).anIntArrayArray8608[i_186_]);
						for (int i_188_ = 0; i_188_ < is_187_.length; i_188_++) {
							int i_189_ = is_187_[i_188_];
							int i_190_ = (((((Class528_Sub2) this).aByteArray8602[i_189_]) & 0xff) + i_137_ * 8);
							if (i_190_ < 0)
								i_190_ = 0;
							else if (i_190_ > 255)
								i_190_ = 255;
							((Class528_Sub2) this).aByteArray8602[i_189_] = (byte) i_190_;
						}
					}
				}
				if (((Class528_Sub2) this).aClass193Array8618 != null) {
					for (int i_191_ = 0; i_191_ < ((Class528_Sub2) this).anInt8617; i_191_++) {
						Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_191_]);
						Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_191_]);
						((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & 0xffffff) | 255 - ((((Class528_Sub2) this).aByteArray8602[(((Class193) class193).anInt2393 * 142270897)]) & 0xff) << 24) * -1022818925;
					}
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub2) this).anIntArrayArray8608 != null) {
				for (int i_192_ = 0; i_192_ < i_141_; i_192_++) {
					int i_193_ = is[i_192_];
					if (i_193_ < ((Class528_Sub2) this).anIntArrayArray8608.length) {
						int[] is_194_ = (((Class528_Sub2) this).anIntArrayArray8608[i_193_]);
						for (int i_195_ = 0; i_195_ < is_194_.length; i_195_++) {
							int i_196_ = is_194_[i_195_];
							int i_197_ = ((((Class528_Sub2) this).aShortArray8604[i_196_]) & 0xffff);
							int i_198_ = i_197_ >> 10 & 0x3f;
							int i_199_ = i_197_ >> 7 & 0x7;
							int i_200_ = i_197_ & 0x7f;
							i_198_ = i_198_ + i_137_ & 0x3f;
							i_199_ += i_138_;
							if (i_199_ < 0)
								i_199_ = 0;
							else if (i_199_ > 7)
								i_199_ = 7;
							i_200_ += i_139_;
							if (i_200_ < 0)
								i_200_ = 0;
							else if (i_200_ > 127)
								i_200_ = 127;
							((Class528_Sub2) this).aShortArray8604[i_196_] = (short) (i_198_ << 10 | i_199_ << 7 | i_200_);
						}
						((Class528_Sub2) this).aBool8609 = true;
					}
				}
				if (((Class528_Sub2) this).aClass193Array8618 != null) {
					for (int i_201_ = 0; i_201_ < ((Class528_Sub2) this).anInt8617; i_201_++) {
						Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_201_]);
						Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_201_]);
						((Class176) class176).anInt2199 = (((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | (Class335.anIntArray3916[(Class372.method6362((((Class528_Sub2) this).aShortArray8604[(((Class193) class193).anInt2393 * 142270897)]) & 0xffff, 1563168236)) & 0xffff]) & 0xffffff) * -1022818925);
					}
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_202_ = 0; i_202_ < i_141_; i_202_++) {
					int i_203_ = is[i_202_];
					if (i_203_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_204_ = (((Class528_Sub2) this).anIntArrayArray8620[i_203_]);
						for (int i_205_ = 0; i_205_ < is_204_.length; i_205_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_204_[i_205_]]);
							((Class176) class176).anInt2192 += i_137_ * -943685543;
							((Class176) class176).anInt2189 += i_138_ * 1414070385;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_206_ = 0; i_206_ < i_141_; i_206_++) {
					int i_207_ = is[i_206_];
					if (i_207_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_208_ = (((Class528_Sub2) this).anIntArrayArray8620[i_207_]);
						for (int i_209_ = 0; i_209_ < is_208_.length; i_209_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_208_[i_209_]]);
							((Class176) class176).aFloat2190 = (((Class176) class176).aFloat2190 * (float) i_137_ / 128.0F);
							((Class176) class176).aFloat2191 = (((Class176) class176).aFloat2191 * (float) i_138_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_210_ = 0; i_210_ < i_141_; i_210_++) {
					int i_211_ = is[i_210_];
					if (i_211_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_212_ = (((Class528_Sub2) this).anIntArrayArray8620[i_211_]);
						for (int i_213_ = 0; i_213_ < is_212_.length; i_213_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_212_[i_213_]]);
							((Class176) class176).anInt2194 = ((((Class176) class176).anInt2194 * 156323613 + i_137_) & 0x3fff) * 2076699445;
						}
					}
				}
			}
		}
	}

	void e(int i, int[] is, int i_214_, int i_215_, int i_216_, boolean bool, int i_217_, int[] is_218_) {
		int i_219_ = is.length;
		if (i == 0) {
			i_214_ <<= 4;
			i_215_ <<= 4;
			i_216_ <<= 4;
			if (!((Class528_Sub2) this).aBool8589) {
				for (int i_220_ = 0; i_220_ < ((Class528_Sub2) this).anInt8578; i_220_++) {
					((Class528_Sub2) this).anIntArray8580[i_220_] <<= 4;
					((Class528_Sub2) this).anIntArray8581[i_220_] <<= 4;
					((Class528_Sub2) this).anIntArray8610[i_220_] <<= 4;
				}
				((Class528_Sub2) this).aBool8589 = true;
			}
			int i_221_ = 0;
			((Class528_Sub2) this).anInt8611 = 0;
			((Class528_Sub2) this).anInt8607 = 0;
			((Class528_Sub2) this).anInt8613 = 0;
			for (int i_222_ = 0; i_222_ < i_219_; i_222_++) {
				int i_223_ = is[i_222_];
				if (i_223_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_224_ = ((Class528_Sub2) this).anIntArrayArray8568[i_223_];
					for (int i_225_ = 0; i_225_ < is_224_.length; i_225_++) {
						int i_226_ = is_224_[i_225_];
						if (((Class528_Sub2) this).aShortArray8569 == null || (i_217_ & (((Class528_Sub2) this).aShortArray8569[i_226_])) != 0) {
							((Class528_Sub2) this).anInt8611 += (((Class528_Sub2) this).anIntArray8580[i_226_]);
							((Class528_Sub2) this).anInt8607 += (((Class528_Sub2) this).anIntArray8581[i_226_]);
							((Class528_Sub2) this).anInt8613 += (((Class528_Sub2) this).anIntArray8610[i_226_]);
							i_221_++;
						}
					}
				}
			}
			if (i_221_ > 0) {
				((Class528_Sub2) this).anInt8611 = ((Class528_Sub2) this).anInt8611 / i_221_ + i_214_;
				((Class528_Sub2) this).anInt8607 = ((Class528_Sub2) this).anInt8607 / i_221_ + i_215_;
				((Class528_Sub2) this).anInt8613 = ((Class528_Sub2) this).anInt8613 / i_221_ + i_216_;
				((Class528_Sub2) this).aBool8614 = true;
			} else {
				((Class528_Sub2) this).anInt8611 = i_214_;
				((Class528_Sub2) this).anInt8607 = i_215_;
				((Class528_Sub2) this).anInt8613 = i_216_;
			}
		} else if (i == 1) {
			if (is_218_ != null) {
				int i_227_ = ((is_218_[0] * i_214_ + is_218_[1] * i_215_ + is_218_[2] * i_216_ + 8192) >> 14);
				int i_228_ = ((is_218_[3] * i_214_ + is_218_[4] * i_215_ + is_218_[5] * i_216_ + 8192) >> 14);
				int i_229_ = ((is_218_[6] * i_214_ + is_218_[7] * i_215_ + is_218_[8] * i_216_ + 8192) >> 14);
				i_214_ = i_227_;
				i_215_ = i_228_;
				i_216_ = i_229_;
			}
			i_214_ <<= 4;
			i_215_ <<= 4;
			i_216_ <<= 4;
			if (!((Class528_Sub2) this).aBool8589) {
				for (int i_230_ = 0; i_230_ < ((Class528_Sub2) this).anInt8578; i_230_++) {
					((Class528_Sub2) this).anIntArray8580[i_230_] <<= 4;
					((Class528_Sub2) this).anIntArray8581[i_230_] <<= 4;
					((Class528_Sub2) this).anIntArray8610[i_230_] <<= 4;
				}
				((Class528_Sub2) this).aBool8589 = true;
			}
			for (int i_231_ = 0; i_231_ < i_219_; i_231_++) {
				int i_232_ = is[i_231_];
				if (i_232_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_233_ = ((Class528_Sub2) this).anIntArrayArray8568[i_232_];
					for (int i_234_ = 0; i_234_ < is_233_.length; i_234_++) {
						int i_235_ = is_233_[i_234_];
						if (((Class528_Sub2) this).aShortArray8569 == null || (i_217_ & (((Class528_Sub2) this).aShortArray8569[i_235_])) != 0) {
							((Class528_Sub2) this).anIntArray8580[i_235_] += i_214_;
							((Class528_Sub2) this).anIntArray8581[i_235_] += i_215_;
							((Class528_Sub2) this).anIntArray8610[i_235_] += i_216_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_218_ != null) {
				if (!((Class528_Sub2) this).aBool8589) {
					for (int i_236_ = 0; i_236_ < ((Class528_Sub2) this).anInt8578; i_236_++) {
						((Class528_Sub2) this).anIntArray8580[i_236_] <<= 4;
						((Class528_Sub2) this).anIntArray8581[i_236_] <<= 4;
						((Class528_Sub2) this).anIntArray8610[i_236_] <<= 4;
					}
					((Class528_Sub2) this).aBool8589 = true;
				}
				int i_237_ = is_218_[9] << 4;
				int i_238_ = is_218_[10] << 4;
				int i_239_ = is_218_[11] << 4;
				int i_240_ = is_218_[12] << 4;
				int i_241_ = is_218_[13] << 4;
				int i_242_ = is_218_[14] << 4;
				if (((Class528_Sub2) this).aBool8614) {
					int i_243_ = ((is_218_[0] * ((Class528_Sub2) this).anInt8611 + is_218_[3] * ((Class528_Sub2) this).anInt8607 + is_218_[6] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					int i_244_ = ((is_218_[1] * ((Class528_Sub2) this).anInt8611 + is_218_[4] * ((Class528_Sub2) this).anInt8607 + is_218_[7] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					int i_245_ = ((is_218_[2] * ((Class528_Sub2) this).anInt8611 + is_218_[5] * ((Class528_Sub2) this).anInt8607 + is_218_[8] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					i_243_ += i_240_;
					i_244_ += i_241_;
					i_245_ += i_242_;
					((Class528_Sub2) this).anInt8611 = i_243_;
					((Class528_Sub2) this).anInt8607 = i_244_;
					((Class528_Sub2) this).anInt8613 = i_245_;
					((Class528_Sub2) this).aBool8614 = false;
				}
				int[] is_246_ = new int[9];
				int i_247_ = Class382.anIntArray4661[i_214_];
				int i_248_ = Class382.anIntArray4657[i_214_];
				int i_249_ = Class382.anIntArray4661[i_215_];
				int i_250_ = Class382.anIntArray4657[i_215_];
				int i_251_ = Class382.anIntArray4661[i_216_];
				int i_252_ = Class382.anIntArray4657[i_216_];
				int i_253_ = i_248_ * i_251_ + 8192 >> 14;
				int i_254_ = i_248_ * i_252_ + 8192 >> 14;
				is_246_[0] = i_249_ * i_251_ + i_250_ * i_254_ + 8192 >> 14;
				is_246_[1] = -i_249_ * i_252_ + i_250_ * i_253_ + 8192 >> 14;
				is_246_[2] = i_250_ * i_247_ + 8192 >> 14;
				is_246_[3] = i_247_ * i_252_ + 8192 >> 14;
				is_246_[4] = i_247_ * i_251_ + 8192 >> 14;
				is_246_[5] = -i_248_;
				is_246_[6] = -i_250_ * i_251_ + i_249_ * i_254_ + 8192 >> 14;
				is_246_[7] = i_250_ * i_252_ + i_249_ * i_253_ + 8192 >> 14;
				is_246_[8] = i_249_ * i_247_ + 8192 >> 14;
				int i_255_ = ((is_246_[0] * -((Class528_Sub2) this).anInt8611 + is_246_[1] * -((Class528_Sub2) this).anInt8607 + is_246_[2] * -((Class528_Sub2) this).anInt8613 + 8192) >> 14);
				int i_256_ = ((is_246_[3] * -((Class528_Sub2) this).anInt8611 + is_246_[4] * -((Class528_Sub2) this).anInt8607 + is_246_[5] * -((Class528_Sub2) this).anInt8613 + 8192) >> 14);
				int i_257_ = ((is_246_[6] * -((Class528_Sub2) this).anInt8611 + is_246_[7] * -((Class528_Sub2) this).anInt8607 + is_246_[8] * -((Class528_Sub2) this).anInt8613 + 8192) >> 14);
				int i_258_ = i_255_ + ((Class528_Sub2) this).anInt8611;
				int i_259_ = i_256_ + ((Class528_Sub2) this).anInt8607;
				int i_260_ = i_257_ + ((Class528_Sub2) this).anInt8613;
				int[] is_261_ = new int[9];
				for (int i_262_ = 0; i_262_ < 3; i_262_++) {
					for (int i_263_ = 0; i_263_ < 3; i_263_++) {
						int i_264_ = 0;
						for (int i_265_ = 0; i_265_ < 3; i_265_++)
							i_264_ += (is_246_[i_262_ * 3 + i_265_] * is_218_[i_263_ * 3 + i_265_]);
						is_261_[i_262_ * 3 + i_263_] = i_264_ + 8192 >> 14;
					}
				}
				int i_266_ = ((is_246_[0] * i_240_ + is_246_[1] * i_241_ + is_246_[2] * i_242_ + 8192) >> 14);
				int i_267_ = ((is_246_[3] * i_240_ + is_246_[4] * i_241_ + is_246_[5] * i_242_ + 8192) >> 14);
				int i_268_ = ((is_246_[6] * i_240_ + is_246_[7] * i_241_ + is_246_[8] * i_242_ + 8192) >> 14);
				i_266_ += i_258_;
				i_267_ += i_259_;
				i_268_ += i_260_;
				int[] is_269_ = new int[9];
				for (int i_270_ = 0; i_270_ < 3; i_270_++) {
					for (int i_271_ = 0; i_271_ < 3; i_271_++) {
						int i_272_ = 0;
						for (int i_273_ = 0; i_273_ < 3; i_273_++)
							i_272_ += (is_218_[i_270_ * 3 + i_273_] * is_261_[i_271_ + i_273_ * 3]);
						is_269_[i_270_ * 3 + i_271_] = i_272_ + 8192 >> 14;
					}
				}
				int i_274_ = ((is_218_[0] * i_266_ + is_218_[1] * i_267_ + is_218_[2] * i_268_ + 8192) >> 14);
				int i_275_ = ((is_218_[3] * i_266_ + is_218_[4] * i_267_ + is_218_[5] * i_268_ + 8192) >> 14);
				int i_276_ = ((is_218_[6] * i_266_ + is_218_[7] * i_267_ + is_218_[8] * i_268_ + 8192) >> 14);
				i_274_ += i_237_;
				i_275_ += i_238_;
				i_276_ += i_239_;
				for (int i_277_ = 0; i_277_ < i_219_; i_277_++) {
					int i_278_ = is[i_277_];
					if (i_278_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
						int[] is_279_ = (((Class528_Sub2) this).anIntArrayArray8568[i_278_]);
						for (int i_280_ = 0; i_280_ < is_279_.length; i_280_++) {
							int i_281_ = is_279_[i_280_];
							if (((Class528_Sub2) this).aShortArray8569 == null || ((i_217_ & (((Class528_Sub2) this).aShortArray8569[i_281_])) != 0)) {
								int i_282_ = (is_269_[0] * (((Class528_Sub2) this).anIntArray8580[i_281_]) + is_269_[1] * (((Class528_Sub2) this).anIntArray8581[i_281_]) + is_269_[2] * (((Class528_Sub2) this).anIntArray8610[i_281_]) + 8192) >> 14;
								int i_283_ = (is_269_[3] * (((Class528_Sub2) this).anIntArray8580[i_281_]) + is_269_[4] * (((Class528_Sub2) this).anIntArray8581[i_281_]) + is_269_[5] * (((Class528_Sub2) this).anIntArray8610[i_281_]) + 8192) >> 14;
								int i_284_ = (is_269_[6] * (((Class528_Sub2) this).anIntArray8580[i_281_]) + is_269_[7] * (((Class528_Sub2) this).anIntArray8581[i_281_]) + is_269_[8] * (((Class528_Sub2) this).anIntArray8610[i_281_]) + 8192) >> 14;
								i_282_ += i_274_;
								i_283_ += i_275_;
								i_284_ += i_276_;
								((Class528_Sub2) this).anIntArray8580[i_281_] = i_282_;
								((Class528_Sub2) this).anIntArray8581[i_281_] = i_283_;
								((Class528_Sub2) this).anIntArray8610[i_281_] = i_284_;
							}
						}
					}
				}
			} else {
				for (int i_285_ = 0; i_285_ < i_219_; i_285_++) {
					int i_286_ = is[i_285_];
					if (i_286_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
						int[] is_287_ = (((Class528_Sub2) this).anIntArrayArray8568[i_286_]);
						for (int i_288_ = 0; i_288_ < is_287_.length; i_288_++) {
							int i_289_ = is_287_[i_288_];
							if (((Class528_Sub2) this).aShortArray8569 == null || ((i_217_ & (((Class528_Sub2) this).aShortArray8569[i_289_])) != 0)) {
								((Class528_Sub2) this).anIntArray8580[i_289_] -= ((Class528_Sub2) this).anInt8611;
								((Class528_Sub2) this).anIntArray8581[i_289_] -= ((Class528_Sub2) this).anInt8607;
								((Class528_Sub2) this).anIntArray8610[i_289_] -= ((Class528_Sub2) this).anInt8613;
								if (i_216_ != 0) {
									int i_290_ = Class382.anIntArray4657[i_216_];
									int i_291_ = Class382.anIntArray4661[i_216_];
									int i_292_ = ((((Class528_Sub2) this).anIntArray8581[i_289_]) * i_290_ + (((Class528_Sub2) this).anIntArray8580[i_289_]) * i_291_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8581[i_289_] = ((((Class528_Sub2) this).anIntArray8581[i_289_]) * i_291_ - (((Class528_Sub2) this).anIntArray8580[i_289_]) * i_290_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8580[i_289_] = i_292_;
								}
								if (i_214_ != 0) {
									int i_293_ = Class382.anIntArray4657[i_214_];
									int i_294_ = Class382.anIntArray4661[i_214_];
									int i_295_ = ((((Class528_Sub2) this).anIntArray8581[i_289_]) * i_294_ - (((Class528_Sub2) this).anIntArray8610[i_289_]) * i_293_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8610[i_289_] = ((((Class528_Sub2) this).anIntArray8581[i_289_]) * i_293_ + (((Class528_Sub2) this).anIntArray8610[i_289_]) * i_294_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8581[i_289_] = i_295_;
								}
								if (i_215_ != 0) {
									int i_296_ = Class382.anIntArray4657[i_215_];
									int i_297_ = Class382.anIntArray4661[i_215_];
									int i_298_ = ((((Class528_Sub2) this).anIntArray8610[i_289_]) * i_296_ + (((Class528_Sub2) this).anIntArray8580[i_289_]) * i_297_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8610[i_289_] = ((((Class528_Sub2) this).anIntArray8610[i_289_]) * i_297_ - (((Class528_Sub2) this).anIntArray8580[i_289_]) * i_296_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8580[i_289_] = i_298_;
								}
								((Class528_Sub2) this).anIntArray8580[i_289_] += ((Class528_Sub2) this).anInt8611;
								((Class528_Sub2) this).anIntArray8581[i_289_] += ((Class528_Sub2) this).anInt8607;
								((Class528_Sub2) this).anIntArray8610[i_289_] += ((Class528_Sub2) this).anInt8613;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_218_ != null) {
				if (!((Class528_Sub2) this).aBool8589) {
					for (int i_299_ = 0; i_299_ < ((Class528_Sub2) this).anInt8578; i_299_++) {
						((Class528_Sub2) this).anIntArray8580[i_299_] <<= 4;
						((Class528_Sub2) this).anIntArray8581[i_299_] <<= 4;
						((Class528_Sub2) this).anIntArray8610[i_299_] <<= 4;
					}
					((Class528_Sub2) this).aBool8589 = true;
				}
				int i_300_ = is_218_[9] << 4;
				int i_301_ = is_218_[10] << 4;
				int i_302_ = is_218_[11] << 4;
				int i_303_ = is_218_[12] << 4;
				int i_304_ = is_218_[13] << 4;
				int i_305_ = is_218_[14] << 4;
				if (((Class528_Sub2) this).aBool8614) {
					int i_306_ = ((is_218_[0] * ((Class528_Sub2) this).anInt8611 + is_218_[3] * ((Class528_Sub2) this).anInt8607 + is_218_[6] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					int i_307_ = ((is_218_[1] * ((Class528_Sub2) this).anInt8611 + is_218_[4] * ((Class528_Sub2) this).anInt8607 + is_218_[7] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					int i_308_ = ((is_218_[2] * ((Class528_Sub2) this).anInt8611 + is_218_[5] * ((Class528_Sub2) this).anInt8607 + is_218_[8] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					i_306_ += i_303_;
					i_307_ += i_304_;
					i_308_ += i_305_;
					((Class528_Sub2) this).anInt8611 = i_306_;
					((Class528_Sub2) this).anInt8607 = i_307_;
					((Class528_Sub2) this).anInt8613 = i_308_;
					((Class528_Sub2) this).aBool8614 = false;
				}
				int i_309_ = i_214_ << 15 >> 7;
				int i_310_ = i_215_ << 15 >> 7;
				int i_311_ = i_216_ << 15 >> 7;
				int i_312_ = i_309_ * -((Class528_Sub2) this).anInt8611 + 8192 >> 14;
				int i_313_ = i_310_ * -((Class528_Sub2) this).anInt8607 + 8192 >> 14;
				int i_314_ = i_311_ * -((Class528_Sub2) this).anInt8613 + 8192 >> 14;
				int i_315_ = i_312_ + ((Class528_Sub2) this).anInt8611;
				int i_316_ = i_313_ + ((Class528_Sub2) this).anInt8607;
				int i_317_ = i_314_ + ((Class528_Sub2) this).anInt8613;
				int[] is_318_ = new int[9];
				is_318_[0] = i_309_ * is_218_[0] + 8192 >> 14;
				is_318_[1] = i_309_ * is_218_[3] + 8192 >> 14;
				is_318_[2] = i_309_ * is_218_[6] + 8192 >> 14;
				is_318_[3] = i_310_ * is_218_[1] + 8192 >> 14;
				is_318_[4] = i_310_ * is_218_[4] + 8192 >> 14;
				is_318_[5] = i_310_ * is_218_[7] + 8192 >> 14;
				is_318_[6] = i_311_ * is_218_[2] + 8192 >> 14;
				is_318_[7] = i_311_ * is_218_[5] + 8192 >> 14;
				is_318_[8] = i_311_ * is_218_[8] + 8192 >> 14;
				int i_319_ = i_309_ * i_303_ + 8192 >> 14;
				int i_320_ = i_310_ * i_304_ + 8192 >> 14;
				int i_321_ = i_311_ * i_305_ + 8192 >> 14;
				i_319_ += i_315_;
				i_320_ += i_316_;
				i_321_ += i_317_;
				int[] is_322_ = new int[9];
				for (int i_323_ = 0; i_323_ < 3; i_323_++) {
					for (int i_324_ = 0; i_324_ < 3; i_324_++) {
						int i_325_ = 0;
						for (int i_326_ = 0; i_326_ < 3; i_326_++)
							i_325_ += (is_218_[i_323_ * 3 + i_326_] * is_318_[i_324_ + i_326_ * 3]);
						is_322_[i_323_ * 3 + i_324_] = i_325_ + 8192 >> 14;
					}
				}
				int i_327_ = ((is_218_[0] * i_319_ + is_218_[1] * i_320_ + is_218_[2] * i_321_ + 8192) >> 14);
				int i_328_ = ((is_218_[3] * i_319_ + is_218_[4] * i_320_ + is_218_[5] * i_321_ + 8192) >> 14);
				int i_329_ = ((is_218_[6] * i_319_ + is_218_[7] * i_320_ + is_218_[8] * i_321_ + 8192) >> 14);
				i_327_ += i_300_;
				i_328_ += i_301_;
				i_329_ += i_302_;
				for (int i_330_ = 0; i_330_ < i_219_; i_330_++) {
					int i_331_ = is[i_330_];
					if (i_331_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
						int[] is_332_ = (((Class528_Sub2) this).anIntArrayArray8568[i_331_]);
						for (int i_333_ = 0; i_333_ < is_332_.length; i_333_++) {
							int i_334_ = is_332_[i_333_];
							if (((Class528_Sub2) this).aShortArray8569 == null || ((i_217_ & (((Class528_Sub2) this).aShortArray8569[i_334_])) != 0)) {
								int i_335_ = (is_322_[0] * (((Class528_Sub2) this).anIntArray8580[i_334_]) + is_322_[1] * (((Class528_Sub2) this).anIntArray8581[i_334_]) + is_322_[2] * (((Class528_Sub2) this).anIntArray8610[i_334_]) + 8192) >> 14;
								int i_336_ = (is_322_[3] * (((Class528_Sub2) this).anIntArray8580[i_334_]) + is_322_[4] * (((Class528_Sub2) this).anIntArray8581[i_334_]) + is_322_[5] * (((Class528_Sub2) this).anIntArray8610[i_334_]) + 8192) >> 14;
								int i_337_ = (is_322_[6] * (((Class528_Sub2) this).anIntArray8580[i_334_]) + is_322_[7] * (((Class528_Sub2) this).anIntArray8581[i_334_]) + is_322_[8] * (((Class528_Sub2) this).anIntArray8610[i_334_]) + 8192) >> 14;
								i_335_ += i_327_;
								i_336_ += i_328_;
								i_337_ += i_329_;
								((Class528_Sub2) this).anIntArray8580[i_334_] = i_335_;
								((Class528_Sub2) this).anIntArray8581[i_334_] = i_336_;
								((Class528_Sub2) this).anIntArray8610[i_334_] = i_337_;
							}
						}
					}
				}
			} else {
				for (int i_338_ = 0; i_338_ < i_219_; i_338_++) {
					int i_339_ = is[i_338_];
					if (i_339_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
						int[] is_340_ = (((Class528_Sub2) this).anIntArrayArray8568[i_339_]);
						for (int i_341_ = 0; i_341_ < is_340_.length; i_341_++) {
							int i_342_ = is_340_[i_341_];
							if (((Class528_Sub2) this).aShortArray8569 == null || ((i_217_ & (((Class528_Sub2) this).aShortArray8569[i_342_])) != 0)) {
								((Class528_Sub2) this).anIntArray8580[i_342_] -= ((Class528_Sub2) this).anInt8611;
								((Class528_Sub2) this).anIntArray8581[i_342_] -= ((Class528_Sub2) this).anInt8607;
								((Class528_Sub2) this).anIntArray8610[i_342_] -= ((Class528_Sub2) this).anInt8613;
								((Class528_Sub2) this).anIntArray8580[i_342_] = (((Class528_Sub2) this).anIntArray8580[i_342_]) * i_214_ / 128;
								((Class528_Sub2) this).anIntArray8581[i_342_] = (((Class528_Sub2) this).anIntArray8581[i_342_]) * i_215_ / 128;
								((Class528_Sub2) this).anIntArray8610[i_342_] = (((Class528_Sub2) this).anIntArray8610[i_342_]) * i_216_ / 128;
								((Class528_Sub2) this).anIntArray8580[i_342_] += ((Class528_Sub2) this).anInt8611;
								((Class528_Sub2) this).anIntArray8581[i_342_] += ((Class528_Sub2) this).anInt8607;
								((Class528_Sub2) this).anIntArray8610[i_342_] += ((Class528_Sub2) this).anInt8613;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub2) this).anIntArrayArray8608 != null && ((Class528_Sub2) this).aByteArray8602 != null) {
				for (int i_343_ = 0; i_343_ < i_219_; i_343_++) {
					int i_344_ = is[i_343_];
					if (i_344_ < ((Class528_Sub2) this).anIntArrayArray8608.length) {
						int[] is_345_ = (((Class528_Sub2) this).anIntArrayArray8608[i_344_]);
						for (int i_346_ = 0; i_346_ < is_345_.length; i_346_++) {
							int i_347_ = is_345_[i_346_];
							if (((Class528_Sub2) this).aShortArray8632 == null || ((i_217_ & (((Class528_Sub2) this).aShortArray8632[i_347_])) != 0)) {
								int i_348_ = (((((Class528_Sub2) this).aByteArray8602[i_347_]) & 0xff) + i_214_ * 8);
								if (i_348_ < 0)
									i_348_ = 0;
								else if (i_348_ > 255)
									i_348_ = 255;
								((Class528_Sub2) this).aByteArray8602[i_347_] = (byte) i_348_;
							}
						}
					}
				}
				if (((Class528_Sub2) this).aClass193Array8618 != null) {
					for (int i_349_ = 0; i_349_ < ((Class528_Sub2) this).anInt8617; i_349_++) {
						Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_349_]);
						Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_349_]);
						((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & 0xffffff) | 255 - ((((Class528_Sub2) this).aByteArray8602[(((Class193) class193).anInt2393 * 142270897)]) & 0xff) << 24) * -1022818925;
					}
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub2) this).anIntArrayArray8608 != null) {
				for (int i_350_ = 0; i_350_ < i_219_; i_350_++) {
					int i_351_ = is[i_350_];
					if (i_351_ < ((Class528_Sub2) this).anIntArrayArray8608.length) {
						int[] is_352_ = (((Class528_Sub2) this).anIntArrayArray8608[i_351_]);
						for (int i_353_ = 0; i_353_ < is_352_.length; i_353_++) {
							int i_354_ = is_352_[i_353_];
							if (((Class528_Sub2) this).aShortArray8632 == null || ((i_217_ & (((Class528_Sub2) this).aShortArray8632[i_354_])) != 0)) {
								int i_355_ = ((((Class528_Sub2) this).aShortArray8604[i_354_]) & 0xffff);
								int i_356_ = i_355_ >> 10 & 0x3f;
								int i_357_ = i_355_ >> 7 & 0x7;
								int i_358_ = i_355_ & 0x7f;
								i_356_ = i_356_ + i_214_ & 0x3f;
								i_357_ += i_215_;
								if (i_357_ < 0)
									i_357_ = 0;
								else if (i_357_ > 7)
									i_357_ = 7;
								i_358_ += i_216_;
								if (i_358_ < 0)
									i_358_ = 0;
								else if (i_358_ > 127)
									i_358_ = 127;
								((Class528_Sub2) this).aShortArray8604[i_354_] = (short) (i_356_ << 10 | i_357_ << 7 | i_358_);
							}
						}
						((Class528_Sub2) this).aBool8609 = true;
					}
				}
				if (((Class528_Sub2) this).aClass193Array8618 != null) {
					for (int i_359_ = 0; i_359_ < ((Class528_Sub2) this).anInt8617; i_359_++) {
						Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_359_]);
						Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_359_]);
						((Class176) class176).anInt2199 = (((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | (Class335.anIntArray3916[(Class372.method6362((((Class528_Sub2) this).aShortArray8604[(((Class193) class193).anInt2393 * 142270897)]) & 0xffff, 468160301)) & 0xffff]) & 0xffffff) * -1022818925);
					}
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_360_ = 0; i_360_ < i_219_; i_360_++) {
					int i_361_ = is[i_360_];
					if (i_361_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_362_ = (((Class528_Sub2) this).anIntArrayArray8620[i_361_]);
						for (int i_363_ = 0; i_363_ < is_362_.length; i_363_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_362_[i_363_]]);
							((Class176) class176).anInt2192 += i_214_ * -943685543;
							((Class176) class176).anInt2189 += i_215_ * 1414070385;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_364_ = 0; i_364_ < i_219_; i_364_++) {
					int i_365_ = is[i_364_];
					if (i_365_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_366_ = (((Class528_Sub2) this).anIntArrayArray8620[i_365_]);
						for (int i_367_ = 0; i_367_ < is_366_.length; i_367_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_366_[i_367_]]);
							((Class176) class176).aFloat2190 = (((Class176) class176).aFloat2190 * (float) i_214_ / 128.0F);
							((Class176) class176).aFloat2191 = (((Class176) class176).aFloat2191 * (float) i_215_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_368_ = 0; i_368_ < i_219_; i_368_++) {
					int i_369_ = is[i_368_];
					if (i_369_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_370_ = (((Class528_Sub2) this).anIntArrayArray8620[i_369_]);
						for (int i_371_ = 0; i_371_ < is_370_.length; i_371_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_370_[i_371_]]);
							((Class176) class176).anInt2194 = ((((Class176) class176).anInt2194 * 156323613 + i_214_) & 0x3fff) * 2076699445;
						}
					}
				}
			}
		}
	}

	void w(int i, int i_372_, int i_373_, int i_374_) {
		if (i == 0) {
			int i_375_ = 0;
			((Class528_Sub2) this).anInt8611 = 0;
			((Class528_Sub2) this).anInt8607 = 0;
			((Class528_Sub2) this).anInt8613 = 0;
			for (int i_376_ = 0; i_376_ < ((Class528_Sub2) this).anInt8578; i_376_++) {
				((Class528_Sub2) this).anInt8611 += ((Class528_Sub2) this).anIntArray8580[i_376_];
				((Class528_Sub2) this).anInt8607 += ((Class528_Sub2) this).anIntArray8581[i_376_];
				((Class528_Sub2) this).anInt8613 += ((Class528_Sub2) this).anIntArray8610[i_376_];
				i_375_++;
			}
			if (i_375_ > 0) {
				((Class528_Sub2) this).anInt8611 = ((Class528_Sub2) this).anInt8611 / i_375_ + i_372_;
				((Class528_Sub2) this).anInt8607 = ((Class528_Sub2) this).anInt8607 / i_375_ + i_373_;
				((Class528_Sub2) this).anInt8613 = ((Class528_Sub2) this).anInt8613 / i_375_ + i_374_;
			} else {
				((Class528_Sub2) this).anInt8611 = i_372_;
				((Class528_Sub2) this).anInt8607 = i_373_;
				((Class528_Sub2) this).anInt8613 = i_374_;
			}
		} else if (i == 1) {
			for (int i_377_ = 0; i_377_ < ((Class528_Sub2) this).anInt8578; i_377_++) {
				((Class528_Sub2) this).anIntArray8580[i_377_] += i_372_;
				((Class528_Sub2) this).anIntArray8581[i_377_] += i_373_;
				((Class528_Sub2) this).anIntArray8610[i_377_] += i_374_;
			}
		} else if (i == 2) {
			for (int i_378_ = 0; i_378_ < ((Class528_Sub2) this).anInt8578; i_378_++) {
				((Class528_Sub2) this).anIntArray8580[i_378_] -= ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_378_] -= ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_378_] -= ((Class528_Sub2) this).anInt8613;
				if (i_374_ != 0) {
					int i_379_ = Class382.anIntArray4657[i_374_];
					int i_380_ = Class382.anIntArray4661[i_374_];
					int i_381_ = (((((Class528_Sub2) this).anIntArray8581[i_378_] * i_379_) + (((Class528_Sub2) this).anIntArray8580[i_378_] * i_380_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8581[i_378_] = ((((Class528_Sub2) this).anIntArray8581[i_378_] * i_380_) - (((Class528_Sub2) this).anIntArray8580[i_378_] * i_379_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_378_] = i_381_;
				}
				if (i_372_ != 0) {
					int i_382_ = Class382.anIntArray4657[i_372_];
					int i_383_ = Class382.anIntArray4661[i_372_];
					int i_384_ = (((((Class528_Sub2) this).anIntArray8581[i_378_] * i_383_) - (((Class528_Sub2) this).anIntArray8610[i_378_] * i_382_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_378_] = ((((Class528_Sub2) this).anIntArray8581[i_378_] * i_382_) + (((Class528_Sub2) this).anIntArray8610[i_378_] * i_383_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8581[i_378_] = i_384_;
				}
				if (i_373_ != 0) {
					int i_385_ = Class382.anIntArray4657[i_373_];
					int i_386_ = Class382.anIntArray4661[i_373_];
					int i_387_ = (((((Class528_Sub2) this).anIntArray8610[i_378_] * i_385_) + (((Class528_Sub2) this).anIntArray8580[i_378_] * i_386_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_378_] = ((((Class528_Sub2) this).anIntArray8610[i_378_] * i_386_) - (((Class528_Sub2) this).anIntArray8580[i_378_] * i_385_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_378_] = i_387_;
				}
				((Class528_Sub2) this).anIntArray8580[i_378_] += ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_378_] += ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_378_] += ((Class528_Sub2) this).anInt8613;
			}
		} else if (i == 3) {
			for (int i_388_ = 0; i_388_ < ((Class528_Sub2) this).anInt8578; i_388_++) {
				((Class528_Sub2) this).anIntArray8580[i_388_] -= ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_388_] -= ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_388_] -= ((Class528_Sub2) this).anInt8613;
				((Class528_Sub2) this).anIntArray8580[i_388_] = (((Class528_Sub2) this).anIntArray8580[i_388_] * i_372_ / 128);
				((Class528_Sub2) this).anIntArray8581[i_388_] = (((Class528_Sub2) this).anIntArray8581[i_388_] * i_373_ / 128);
				((Class528_Sub2) this).anIntArray8610[i_388_] = (((Class528_Sub2) this).anIntArray8610[i_388_] * i_374_ / 128);
				((Class528_Sub2) this).anIntArray8580[i_388_] += ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_388_] += ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_388_] += ((Class528_Sub2) this).anInt8613;
			}
		} else if (i == 5) {
			for (int i_389_ = 0; i_389_ < ((Class528_Sub2) this).anInt8586; i_389_++) {
				int i_390_ = ((((Class528_Sub2) this).aByteArray8602[i_389_] & 0xff) + i_372_ * 8);
				if (i_390_ < 0)
					i_390_ = 0;
				else if (i_390_ > 255)
					i_390_ = 255;
				((Class528_Sub2) this).aByteArray8602[i_389_] = (byte) i_390_;
			}
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_391_ = 0; i_391_ < ((Class528_Sub2) this).anInt8617; i_391_++) {
					Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_391_];
					Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_391_];
					((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & 0xffffff) | 255 - ((((Class528_Sub2) this).aByteArray8602[(((Class193) class193).anInt2393 * 142270897)]) & 0xff) << 24) * -1022818925;
				}
			}
		} else if (i == 7) {
			for (int i_392_ = 0; i_392_ < ((Class528_Sub2) this).anInt8586; i_392_++) {
				int i_393_ = ((Class528_Sub2) this).aShortArray8604[i_392_] & 0xffff;
				int i_394_ = i_393_ >> 10 & 0x3f;
				int i_395_ = i_393_ >> 7 & 0x7;
				int i_396_ = i_393_ & 0x7f;
				i_394_ = i_394_ + i_372_ & 0x3f;
				i_395_ += i_373_;
				if (i_395_ < 0)
					i_395_ = 0;
				else if (i_395_ > 7)
					i_395_ = 7;
				i_396_ += i_374_;
				if (i_396_ < 0)
					i_396_ = 0;
				else if (i_396_ > 127)
					i_396_ = 127;
				((Class528_Sub2) this).aShortArray8604[i_392_] = (short) (i_394_ << 10 | i_395_ << 7 | i_396_);
			}
			((Class528_Sub2) this).aBool8609 = true;
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_397_ = 0; i_397_ < ((Class528_Sub2) this).anInt8617; i_397_++) {
					Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_397_];
					Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_397_];
					((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | ((Class335.anIntArray3916[Class372.method6362((((Class528_Sub2) this).aShortArray8604[((((Class193) class193).anInt2393) * 142270897)]) & 0xffff, 1606412034) & 0xffff]) & 0xffffff)) * -1022818925;
				}
			}
		} else if (i == 8) {
			for (int i_398_ = 0; i_398_ < ((Class528_Sub2) this).anInt8617; i_398_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_398_];
				((Class176) class176).anInt2192 += i_372_ * -943685543;
				((Class176) class176).anInt2189 += i_373_ * 1414070385;
			}
		} else if (i == 10) {
			for (int i_399_ = 0; i_399_ < ((Class528_Sub2) this).anInt8617; i_399_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_399_];
				((Class176) class176).aFloat2190 = (((Class176) class176).aFloat2190 * (float) i_372_ / 128.0F);
				((Class176) class176).aFloat2191 = (((Class176) class176).aFloat2191 * (float) i_373_ / 128.0F);
			}
		} else if (i == 9) {
			for (int i_400_ = 0; i_400_ < ((Class528_Sub2) this).anInt8617; i_400_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_400_];
				((Class176) class176).anInt2194 = (((Class176) class176).anInt2194 * 156323613 + i_372_ & 0x3fff) * 2076699445;
			}
		}
	}

	public int cd() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8629;
	}

	public int ar() {
		return ((Class528_Sub2) this).anInt8575;
	}

	void method13814(Class294 class294, Class275_Sub5 class275_sub5, int i) {
		if (((Class528_Sub2) this).anInt8579 >= 1) {
			Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread());
			Class384 class384 = ((Class185) class185).aClass384_2317;
			class384.method6522(class294);
			Class384 class384_401_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8994);
			Class384 class384_402_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8995);
			if (!((Class528_Sub2) this).aBool8621)
				method13876();
			boolean bool = class384.method6526();
			float[] fs = ((Class185) class185).aFloatArray2324;
			class384.method6527(0.0F, (float) ((Class528_Sub2) this).aShort8570, 0.0F, fs);
			float f = fs[0];
			float f_403_ = fs[1];
			float f_404_ = fs[2];
			class384.method6527(0.0F, (float) ((Class528_Sub2) this).aShort8625, 0.0F, fs);
			float f_405_ = fs[0];
			float f_406_ = fs[1];
			float f_407_ = fs[2];
			for (int i_408_ = 0; i_408_ < 6; i_408_++) {
				float[] fs_409_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloatArrayArray8989[i_408_]);
				float f_410_ = (fs_409_[0] * f + fs_409_[1] * f_403_ + fs_409_[2] * f_404_ + fs_409_[3] + (float) ((Class528_Sub2) this).aShort8595);
				float f_411_ = (fs_409_[0] * f_405_ + fs_409_[1] * f_406_ + fs_409_[2] * f_407_ + fs_409_[3] + (float) ((Class528_Sub2) this).aShort8595);
				if (f_410_ < 0.0F && f_411_ < 0.0F)
					return;
			}
			float f_412_;
			float f_413_;
			if (bool) {
				f_412_ = class384_401_.aFloatArray4667[14];
				f_413_ = class384_401_.aFloatArray4667[6];
			} else {
				f_412_ = ((class384.aFloatArray4667[12] * class384_401_.aFloatArray4667[2]) + (class384.aFloatArray4667[13] * class384_401_.aFloatArray4667[6]) + (class384.aFloatArray4667[14] * class384_401_.aFloatArray4667[10]) + class384_401_.aFloatArray4667[14]);
				f_413_ = ((class384.aFloatArray4667[4] * class384_401_.aFloatArray4667[2]) + (class384.aFloatArray4667[5] * class384_401_.aFloatArray4667[6]) + (class384.aFloatArray4667[6] * class384_401_.aFloatArray4667[10]));
			}
			float f_414_ = f_412_ + (float) ((Class528_Sub2) this).aShort8570 * f_413_;
			float f_415_ = f_412_ + (float) ((Class528_Sub2) this).aShort8625 * f_413_;
			float f_416_ = (f_414_ > f_415_ ? f_414_ + (float) ((Class528_Sub2) this).aShort8595 : f_415_ + (float) ((Class528_Sub2) this).aShort8595);
			float f_417_ = (class384_402_.aFloatArray4667[10] * f_416_ + class384_402_.aFloatArray4667[14]);
			if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
				synchronized (this) {
					while (((Class528_Sub2) this).aBool8563) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					((Class528_Sub2) this).aBool8563 = true;
				}
			}
			method13795(class185);
			Class384 class384_418_ = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2318);
			class384_418_.method6562(class384);
			class384_418_.method6523(((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aClass384_8996);
			if ((i & 0x2) != 0)
				((Class528_Sub2) this).aClass144_8566.method2418(true);
			else
				((Class528_Sub2) this).aClass144_8566.method2418(false);
			boolean bool_419_ = false;
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2326 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1679);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2332 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1702);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2311 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1683);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2308 = 1.0F / (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1683);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2331 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1678);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2333 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1680);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1682);
			((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2337 = (((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1684 * -992859573);
			for (int i_420_ = 0; i_420_ < ((Class528_Sub2) this).anInt8578; i_420_++) {
				int i_421_ = ((Class528_Sub2) this).anIntArray8580[i_420_];
				int i_422_ = ((Class528_Sub2) this).anIntArray8581[i_420_];
				int i_423_ = ((Class528_Sub2) this).anIntArray8610[i_420_];
				float f_424_ = (class384_418_.aFloatArray4667[0] * (float) i_421_ + class384_418_.aFloatArray4667[4] * (float) i_422_ + class384_418_.aFloatArray4667[8] * (float) i_423_ + class384_418_.aFloatArray4667[12]);
				float f_425_ = (class384_418_.aFloatArray4667[1] * (float) i_421_ + class384_418_.aFloatArray4667[5] * (float) i_422_ + class384_418_.aFloatArray4667[9] * (float) i_423_ + class384_418_.aFloatArray4667[13]);
				float f_426_ = (class384_418_.aFloatArray4667[2] * (float) i_421_ + class384_418_.aFloatArray4667[6] * (float) i_422_ + class384_418_.aFloatArray4667[10] * (float) i_423_ + class384_418_.aFloatArray4667[14]);
				float f_427_ = (class384_418_.aFloatArray4667[3] * (float) i_421_ + class384_418_.aFloatArray4667[7] * (float) i_422_ + class384_418_.aFloatArray4667[11] * (float) i_423_ + class384_418_.aFloatArray4667[15]);
				((Class528_Sub2) this).aFloatArray8636[i_420_] = ((((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335) + (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2311) * f_426_ / f_427_);
				((Class528_Sub2) this).aFloatArray8637[i_420_] = f_427_;
				if (f_426_ >= -f_427_) {
					((Class528_Sub2) this).aFloatArray8590[i_420_] = (float) (int) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2331) + (((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2326) * f_424_ / f_427_);
					((Class528_Sub2) this).aFloatArray8605[i_420_] = (float) (int) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2333) + (((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2332) * f_425_ / f_427_);
				} else {
					((Class528_Sub2) this).aFloatArray8590[i_420_] = -5000.0F;
					bool_419_ = true;
				}
				if (((Class185) ((Class528_Sub2) this).aClass185_8564).aBool2309)
					((Class528_Sub2) this).anIntArray8633[i_420_] = (int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) i_421_) + (class384.aFloatArray4667[5] * (float) i_422_) + (class384.aFloatArray4667[9] * (float) i_423_)));
			}
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_428_ = 0; i_428_ < ((Class528_Sub2) this).anInt8617; i_428_++) {
					Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_428_];
					Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_428_];
					short i_429_ = (((Class528_Sub2) this).aShortArray8587[((Class193) class193).anInt2393 * 142270897]);
					short i_430_ = (((Class528_Sub2) this).aShortArray8588[((Class193) class193).anInt2393 * 142270897]);
					short i_431_ = (((Class528_Sub2) this).aShortArray8642[((Class193) class193).anInt2393 * 142270897]);
					int i_432_ = ((((Class528_Sub2) this).anIntArray8580[i_429_] + ((Class528_Sub2) this).anIntArray8580[i_430_] + ((Class528_Sub2) this).anIntArray8580[i_431_]) / 3);
					int i_433_ = ((((Class528_Sub2) this).anIntArray8581[i_429_] + ((Class528_Sub2) this).anIntArray8581[i_430_] + ((Class528_Sub2) this).anIntArray8581[i_431_]) / 3);
					int i_434_ = ((((Class528_Sub2) this).anIntArray8610[i_429_] + ((Class528_Sub2) this).anIntArray8610[i_430_] + ((Class528_Sub2) this).anIntArray8610[i_431_]) / 3);
					float f_435_ = (class384_418_.aFloatArray4667[0] * (float) i_432_ + class384_418_.aFloatArray4667[4] * (float) i_433_ + class384_418_.aFloatArray4667[8] * (float) i_434_ + class384_418_.aFloatArray4667[12]);
					float f_436_ = (class384_418_.aFloatArray4667[1] * (float) i_432_ + class384_418_.aFloatArray4667[5] * (float) i_433_ + class384_418_.aFloatArray4667[9] * (float) i_434_ + class384_418_.aFloatArray4667[13]);
					float f_437_ = (class384_418_.aFloatArray4667[2] * (float) i_432_ + class384_418_.aFloatArray4667[6] * (float) i_433_ + class384_418_.aFloatArray4667[10] * (float) i_434_ + class384_418_.aFloatArray4667[14]);
					float f_438_ = (class384_418_.aFloatArray4667[3] * (float) i_432_ + class384_418_.aFloatArray4667[7] * (float) i_433_ + class384_418_.aFloatArray4667[11] * (float) i_434_ + class384_418_.aFloatArray4667[15]);
					f_437_ += ((class384_402_.aFloatArray4667[2] * (float) (((Class176) class176).anInt2192 * -310982679)) + (class384_402_.aFloatArray4667[6] * (float) (((Class176) class176).anInt2189 * 1349697681)));
					f_438_ += ((class384_402_.aFloatArray4667[3] * (float) (((Class176) class176).anInt2192 * -310982679)) + (class384_402_.aFloatArray4667[7] * (float) (((Class176) class176).anInt2189 * 1349697681)));
					if (f_437_ > -f_438_) {
						f_435_ += ((class384_402_.aFloatArray4667[0] * (float) (((Class176) class176).anInt2192 * -310982679)) + (class384_402_.aFloatArray4667[4] * (float) (((Class176) class176).anInt2189 * 1349697681)));
						f_436_ += ((class384_402_.aFloatArray4667[1] * (float) (((Class176) class176).anInt2192 * -310982679)) + (class384_402_.aFloatArray4667[5] * (float) (((Class176) class176).anInt2189 * 1349697681)));
						float f_439_ = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8976) * f_435_ / f_438_);
						float f_440_ = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9004) * f_436_ / f_438_);
						float f_441_ = (((Class176) class176).aFloat2190 * (float) ((Class193) class193).aShort2394);
						float f_442_ = (((Class176) class176).aFloat2191 * (float) ((Class193) class193).aShort2395);
						float f_443_ = (f_435_ + class384_402_.aFloatArray4667[0] * f_441_ + class384_402_.aFloatArray4667[4] * f_442_);
						float f_444_ = (f_436_ + class384_402_.aFloatArray4667[1] * f_441_ + class384_402_.aFloatArray4667[5] * f_442_);
						float f_445_ = (f_438_ + class384_402_.aFloatArray4667[3] * f_441_ + class384_402_.aFloatArray4667[7] * f_442_);
						float f_446_ = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8976) * f_443_ / f_445_);
						float f_447_ = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9004) * f_444_ / f_445_);
						((Class176) class176).anInt2195 = (int) f_439_ * 1832369091;
						((Class176) class176).anInt2196 = (int) f_440_ * 1544556155;
						((Class176) class176).aFloat2193 = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8985) + ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8978) * (f_437_ - (class384_402_.aFloatArray4667[10] * (float) ((((Class193) class193).anInt2400) * 219886141))) / f_438_));
						((Class176) class176).anInt2197 = (int) (f_446_ < f_439_ ? f_439_ - f_446_ : f_446_ - f_439_) * -710849997;
						((Class176) class176).anInt2198 = (int) (f_447_ < f_440_ ? f_440_ - f_447_ : f_447_ - f_440_) * 1185210621;
					} else {
						Class176 class176_448_ = class176;
						((Class176) class176).anInt2198 = 0;
						((Class176) class176_448_).anInt2197 = 0;
					}
				}
			}
			if (class275_sub5 != null) {
				boolean bool_449_ = false;
				boolean bool_450_ = true;
				int i_451_ = ((((Class528_Sub2) this).aShort8634 + ((Class528_Sub2) this).aShort8627) >> 1);
				int i_452_ = ((((Class528_Sub2) this).aShort8571 + ((Class528_Sub2) this).aShort8629) >> 1);
				int i_453_ = i_451_;
				short i_454_ = ((Class528_Sub2) this).aShort8570;
				int i_455_ = i_452_;
				float f_456_ = (class384_418_.aFloatArray4667[0] * (float) i_453_ + class384_418_.aFloatArray4667[4] * (float) i_454_ + class384_418_.aFloatArray4667[8] * (float) i_455_ + class384_418_.aFloatArray4667[12]);
				float f_457_ = (class384_418_.aFloatArray4667[1] * (float) i_453_ + class384_418_.aFloatArray4667[5] * (float) i_454_ + class384_418_.aFloatArray4667[9] * (float) i_455_ + class384_418_.aFloatArray4667[13]);
				float f_458_ = (class384_418_.aFloatArray4667[2] * (float) i_453_ + class384_418_.aFloatArray4667[6] * (float) i_454_ + class384_418_.aFloatArray4667[10] * (float) i_455_ + class384_418_.aFloatArray4667[14]);
				float f_459_ = (class384_418_.aFloatArray4667[3] * (float) i_453_ + class384_418_.aFloatArray4667[7] * (float) i_454_ + class384_418_.aFloatArray4667[11] * (float) i_455_ + class384_418_.aFloatArray4667[15]);
				if (f_458_ >= -f_459_) {
					class275_sub5.anInt7847 = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976) * f_456_ / f_459_);
					class275_sub5.anInt7848 = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004) * f_457_ / f_459_);
				} else
					bool_449_ = true;
				i_453_ = i_451_;
				i_454_ = ((Class528_Sub2) this).aShort8625;
				i_455_ = i_452_;
				float f_460_ = (class384_418_.aFloatArray4667[0] * (float) i_453_ + class384_418_.aFloatArray4667[4] * (float) i_454_ + class384_418_.aFloatArray4667[8] * (float) i_455_ + class384_418_.aFloatArray4667[12]);
				float f_461_ = (class384_418_.aFloatArray4667[1] * (float) i_453_ + class384_418_.aFloatArray4667[5] * (float) i_454_ + class384_418_.aFloatArray4667[9] * (float) i_455_ + class384_418_.aFloatArray4667[13]);
				float f_462_ = (class384_418_.aFloatArray4667[2] * (float) i_453_ + class384_418_.aFloatArray4667[6] * (float) i_454_ + class384_418_.aFloatArray4667[10] * (float) i_455_ + class384_418_.aFloatArray4667[14]);
				float f_463_ = (class384_418_.aFloatArray4667[3] * (float) i_453_ + class384_418_.aFloatArray4667[7] * (float) i_454_ + class384_418_.aFloatArray4667[11] * (float) i_455_ + class384_418_.aFloatArray4667[15]);
				if (f_462_ >= -f_463_) {
					class275_sub5.anInt7850 = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976) * f_460_ / f_463_);
					class275_sub5.anInt7846 = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004) * f_461_ / f_463_);
				} else
					bool_449_ = true;
				if (bool_449_) {
					if (f_458_ < -f_459_ && f_462_ < -f_463_)
						bool_450_ = false;
					else if (f_458_ < -f_459_) {
						float f_464_ = (f_458_ + f_459_) / (f_462_ + f_463_) - 1.0F;
						float f_465_ = f_456_ + f_464_ * (f_460_ - f_456_);
						float f_466_ = f_457_ + f_464_ * (f_461_ - f_457_);
						float f_467_ = f_459_ + f_464_ * (f_463_ - f_459_);
						class275_sub5.anInt7847 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_465_ / f_467_));
						class275_sub5.anInt7848 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004 * f_466_ / f_467_));
					} else if (f_462_ < -f_463_) {
						float f_468_ = (f_462_ + f_463_) / (f_458_ + f_459_) - 1.0F;
						float f_469_ = f_460_ + f_468_ * (f_456_ - f_460_);
						float f_470_ = f_461_ + f_468_ * (f_457_ - f_461_);
						float f_471_ = f_463_ + f_468_ * (f_459_ - f_463_);
						class275_sub5.anInt7850 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_469_ / f_471_));
						class275_sub5.anInt7846 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004 * f_470_ / f_471_));
					}
				}
				if (bool_450_) {
					if (f_458_ / f_459_ > f_462_ / f_463_) {
						float f_472_ = (f_456_ + (class384_402_.aFloatArray4667[0] * (float) ((Class528_Sub2) this).aShort8595) + class384_402_.aFloatArray4667[12]);
						float f_473_ = (f_459_ + (class384_402_.aFloatArray4667[3] * (float) ((Class528_Sub2) this).aShort8595) + class384_402_.aFloatArray4667[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) - (float) class275_sub5.anInt7847 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_472_ / f_473_));
					} else {
						float f_474_ = (f_460_ + (class384_402_.aFloatArray4667[0] * (float) ((Class528_Sub2) this).aShort8595) + class384_402_.aFloatArray4667[12]);
						float f_475_ = (f_463_ + (class384_402_.aFloatArray4667[3] * (float) ((Class528_Sub2) this).aShort8595) + class384_402_.aFloatArray4667[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) - (float) class275_sub5.anInt7850 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_474_ / f_475_));
					}
					class275_sub5.aBool7849 = true;
				}
			}
			method13853(true);
			((Class144) ((Class528_Sub2) this).aClass144_8566).aBool1675 = (i & 0x1) == 0;
			((Class144) ((Class528_Sub2) this).aClass144_8566).aBool1672 = false;
			try {
				method13817((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anIntArray8979) != null, (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloatArray9010) != null, (i & 0x4) != 0, bool_419_, ((((Class185) ((Class528_Sub2) this).aClass185_8564).aBool2304 && f_417_ > (((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2305)) || ((Class185) (((Class528_Sub2) this).aClass185_8564)).aBool2309));
			} catch (Exception exception) {
				/* empty */
			}
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_476_ = 0; i_476_ < ((Class528_Sub2) this).anInt8586; i_476_++)
					((Class528_Sub2) this).anIntArray8643[i_476_] = -1;
			}
			((Class528_Sub2) this).aClass144_8566 = null;
			if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
				synchronized (this) {
					((Class528_Sub2) this).aBool8563 = false;
					this.notifyAll();
				}
			}
		}
	}

	void method13815() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_477_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_477_;
			}
			method13812();
		}
	}

	final boolean method13816(int i) {
		if (((Class528_Sub2) this).aByteArray8602 == null)
			return false;
		if (((Class528_Sub2) this).aByteArray8602[i] == 0)
			return false;
		return true;
	}

	public void method11269(MeshRasterizer class528, int i, int i_478_, int i_479_, boolean bool) {
		Class528_Sub2 class528_sub2_480_ = (Class528_Sub2) class528;
		if ((((Class528_Sub2) this).anInt8575 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class528_Sub2) class528_sub2_480_).anInt8575 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method13795(((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread()));
		method13876();
		method13877();
		class528_sub2_480_.method13876();
		class528_sub2_480_.method13877();
		anInt8612++;
		int i_481_ = 0;
		int[] is = ((Class528_Sub2) class528_sub2_480_).anIntArray8580;
		int i_482_ = ((Class528_Sub2) class528_sub2_480_).anInt8579;
		for (int i_483_ = 0; i_483_ < ((Class528_Sub2) this).anInt8579; i_483_++) {
			Class189 class189 = ((Class528_Sub2) this).aClass189Array8584[i_483_];
			if (((Class189) class189).anInt2382 != 0) {
				int i_484_ = ((Class528_Sub2) this).anIntArray8581[i_483_] - i_478_;
				if (i_484_ >= ((Class528_Sub2) class528_sub2_480_).aShort8570 && (i_484_ <= ((Class528_Sub2) class528_sub2_480_).aShort8625)) {
					int i_485_ = ((Class528_Sub2) this).anIntArray8580[i_483_] - i;
					if ((i_485_ >= ((Class528_Sub2) class528_sub2_480_).aShort8634) && i_485_ <= (((Class528_Sub2) class528_sub2_480_).aShort8627)) {
						int i_486_ = (((Class528_Sub2) this).anIntArray8610[i_483_] - i_479_);
						if (i_486_ >= (((Class528_Sub2) class528_sub2_480_).aShort8571) && i_486_ <= (((Class528_Sub2) class528_sub2_480_).aShort8629)) {
							for (int i_487_ = 0; i_487_ < i_482_; i_487_++) {
								Class189 class189_488_ = (((Class528_Sub2) class528_sub2_480_).aClass189Array8584[i_487_]);
								if (i_485_ == is[i_487_] && i_486_ == (((Class528_Sub2) class528_sub2_480_).anIntArray8610[i_487_]) && i_484_ == (((Class528_Sub2) class528_sub2_480_).anIntArray8581[i_487_]) && (((Class189) class189_488_).anInt2382 != 0)) {
									if ((((Class528_Sub2) this).aClass189Array8585) == null)
										((Class528_Sub2) this).aClass189Array8585 = new Class189[((Class528_Sub2) this).anInt8579];
									if ((((Class528_Sub2) class528_sub2_480_).aClass189Array8585) == null)
										((Class528_Sub2) class528_sub2_480_).aClass189Array8585 = new Class189[i_482_];
									Class189 class189_489_ = (((Class528_Sub2) this).aClass189Array8585[i_483_]);
									if (class189_489_ == null)
										class189_489_ = ((Class528_Sub2) this).aClass189Array8585[i_483_] = new Class189(class189);
									Class189 class189_490_ = (((Class528_Sub2) class528_sub2_480_).aClass189Array8585[i_487_]);
									if (class189_490_ == null)
										class189_490_ = ((Class528_Sub2) class528_sub2_480_).aClass189Array8585[i_487_] = new Class189(class189_488_);
									((Class189) class189_489_).anInt2380 += (((Class189) class189_488_).anInt2380);
									((Class189) class189_489_).anInt2381 += (((Class189) class189_488_).anInt2381);
									((Class189) class189_489_).anInt2379 += (((Class189) class189_488_).anInt2379);
									((Class189) class189_489_).anInt2382 += (((Class189) class189_488_).anInt2382);
									((Class189) class189_490_).anInt2380 += ((Class189) class189).anInt2380;
									((Class189) class189_490_).anInt2381 += ((Class189) class189).anInt2381;
									((Class189) class189_490_).anInt2379 += ((Class189) class189).anInt2379;
									((Class189) class189_490_).anInt2382 += ((Class189) class189).anInt2382;
									i_481_++;
									((Class528_Sub2) this).anIntArray8567[i_483_] = anInt8612;
									((Class528_Sub2) this).anIntArray8619[i_487_] = anInt8612;
								}
							}
						}
					}
				}
			}
		}
		if (i_481_ >= 3 && bool) {
			for (int i_491_ = 0; i_491_ < ((Class528_Sub2) this).anInt8586; i_491_++) {
				if (((((Class528_Sub2) this).anIntArray8567[((Class528_Sub2) this).aShortArray8587[i_491_]]) == anInt8612) && ((((Class528_Sub2) this).anIntArray8567[((Class528_Sub2) this).aShortArray8588[i_491_]]) == anInt8612) && ((((Class528_Sub2) this).anIntArray8567[((Class528_Sub2) this).aShortArray8642[i_491_]]) == anInt8612)) {
					if (((Class528_Sub2) this).aByteArray8600 == null)
						((Class528_Sub2) this).aByteArray8600 = new byte[((Class528_Sub2) this).anInt8586];
					((Class528_Sub2) this).aByteArray8600[i_491_] = (byte) 2;
				}
			}
			for (int i_492_ = 0; i_492_ < ((Class528_Sub2) class528_sub2_480_).anInt8586; i_492_++) {
				if ((((Class528_Sub2) this).anIntArray8619[(((Class528_Sub2) class528_sub2_480_).aShortArray8587[i_492_])]) == anInt8612 && (((Class528_Sub2) this).anIntArray8619[(((Class528_Sub2) class528_sub2_480_).aShortArray8588[i_492_])]) == anInt8612 && (((Class528_Sub2) this).anIntArray8619[(((Class528_Sub2) class528_sub2_480_).aShortArray8642[i_492_])]) == anInt8612) {
					if (((Class528_Sub2) class528_sub2_480_).aByteArray8600 == null)
						((Class528_Sub2) class528_sub2_480_).aByteArray8600 = new byte[(((Class528_Sub2) class528_sub2_480_).anInt8586)];
					((Class528_Sub2) class528_sub2_480_).aByteArray8600[i_492_] = (byte) 2;
				}
			}
		}
	}

	boolean ea() {
		if (((Class528_Sub2) this).anIntArrayArray8568 == null)
			return false;
		((Class528_Sub2) this).anInt8611 = 0;
		((Class528_Sub2) this).anInt8607 = 0;
		((Class528_Sub2) this).anInt8613 = 0;
		return true;
	}

	final void method13817(boolean bool, boolean bool_493_, boolean bool_494_, boolean bool_495_, boolean bool_496_) {
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8617; i++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i];
				((Class528_Sub2) this).anIntArray8643[((Class193) class193).anInt2393 * 142270897] = i;
			}
		}
		if (((Class528_Sub2) this).aBool8630 || ((Class528_Sub2) this).aClass193Array8618 != null) {
			if ((((Class528_Sub2) this).anInt8575 & 0x100) == 0 && ((Class528_Sub2) this).aShortArray8623 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					short i_497_ = ((Class528_Sub2) this).aShortArray8623[i];
					method13868(bool, bool_493_, bool_494_, i_497_, bool_495_, bool_496_);
				}
			} else {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (!method13816(i) && !method13803(i))
						method13868(bool, bool_493_, bool_494_, i, bool_495_, bool_496_);
				}
				if (((Class528_Sub2) this).aByteArray8601 == null) {
					for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
						if (method13816(i) || method13803(i))
							method13868(bool, bool_493_, bool_494_, i, bool_495_, bool_496_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_498_ = 0; i_498_ < ((Class528_Sub2) this).anInt8586; i_498_++) {
							if ((((Class528_Sub2) this).aByteArray8601[i_498_] == i) && (method13816(i_498_) || method13803(i_498_)))
								method13868(bool, bool_493_, bool_494_, i_498_, bool_495_, bool_496_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++)
				method13868(bool, bool_493_, bool_494_, i, bool_495_, bool_496_);
		}
	}

	final void method13818(boolean bool, boolean bool_499_, boolean bool_500_, int i) {
		if (!((Class185) ((Class528_Sub2) this).aClass185_8564).aBool2309) {
			short i_501_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_502_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_503_ = ((Class528_Sub2) this).aShortArray8642[i];
			Class384 class384 = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8995);
			float f = class384.aFloatArray4667[10];
			float f_504_ = class384.aFloatArray4667[14];
			float f_505_ = class384.aFloatArray4667[11];
			float f_506_ = class384.aFloatArray4667[15];
			float f_507_ = f_504_ * f_505_ - f * f_506_;
			float f_508_ = ((((Class528_Sub2) this).aFloatArray8636[i_501_] - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335)) * (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2308));
			float f_509_ = ((((Class528_Sub2) this).aFloatArray8636[i_502_] - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335)) * (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2308));
			float f_510_ = ((((Class528_Sub2) this).aFloatArray8636[i_503_] - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335)) * (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2308));
			float f_511_ = f_508_ * f_507_ / (f_508_ * f_505_ - f);
			float f_512_ = f_509_ * f_507_ / (f_509_ * f_505_ - f);
			float f_513_ = f_510_ * f_507_ / (f_510_ * f_505_ - f);
			float f_514_ = ((f_511_ - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2305)) / (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2303));
			if (f_514_ > 1.0F)
				f_514_ = 1.0F;
			else if (f_514_ < 0.0F)
				f_514_ = 0.0F;
			float f_515_ = ((f_512_ - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2305)) / (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2303));
			if (f_515_ > 1.0F)
				f_515_ = 1.0F;
			else if (f_515_ < 0.0F)
				f_515_ = 0.0F;
			float f_516_ = ((f_513_ - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2305)) / (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2303));
			if (f_516_ > 1.0F)
				f_516_ = 1.0F;
			else if (f_516_ < 0.0F)
				f_516_ = 0.0F;
			float f_517_ = f_514_ + f_515_ + f_516_;
			if (!(f_517_ >= 3.0F)) {
				if (f_517_ <= 0.0F)
					method13848(bool, bool_499_, bool_500_, i);
				else {
					if (((Class528_Sub2) this).aByteArray8602 == null)
						((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = 0;
					else
						((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = ((Class528_Sub2) this).aByteArray8602[i] & 0xff;
					if (((Class528_Sub2) this).aShortArray8603 == null || ((Class528_Sub2) this).aShortArray8603[i] == -1) {
						if (((Class528_Sub2) this).anIntArray8594[i] == -1)
							((Class528_Sub2) this).aClass144_8566.method2425(bool, bool_499_, bool_500_, (((Class528_Sub2) this).aFloatArray8605[i_501_]), (((Class528_Sub2) this).aFloatArray8605[i_502_]), (((Class528_Sub2) this).aFloatArray8605[i_503_]), (((Class528_Sub2) this).aFloatArray8590[i_501_]), (((Class528_Sub2) this).aFloatArray8590[i_502_]), (((Class528_Sub2) this).aFloatArray8590[i_503_]), (((Class528_Sub2) this).aFloatArray8636[i_501_]),
									(((Class528_Sub2) this).aFloatArray8636[i_502_]), (((Class528_Sub2) this).aFloatArray8636[i_503_]), Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8592[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_514_ * 255.0F, 833509259),
									Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8592[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_515_ * 255.0F, 833509259), Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8592[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_516_ * 255.0F, 833509259));
						else
							((Class528_Sub2) this).aClass144_8566.method2425(bool, bool_499_, bool_500_, (((Class528_Sub2) this).aFloatArray8605[i_501_]), (((Class528_Sub2) this).aFloatArray8605[i_502_]), (((Class528_Sub2) this).aFloatArray8605[i_503_]), (((Class528_Sub2) this).aFloatArray8590[i_501_]), (((Class528_Sub2) this).aFloatArray8590[i_502_]), (((Class528_Sub2) this).aFloatArray8590[i_503_]), (((Class528_Sub2) this).aFloatArray8636[i_501_]),
									(((Class528_Sub2) this).aFloatArray8636[i_502_]), (((Class528_Sub2) this).aFloatArray8636[i_503_]), Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8592[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_514_ * 255.0F, 833509259),
									Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8631[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_515_ * 255.0F, 833509259), Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8594[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_516_ * 255.0F, 833509259));
					} else {
						int i_518_ = -16777216;
						if (((Class528_Sub2) this).aByteArray8602 != null)
							i_518_ = 255 - ((((Class528_Sub2) this).aByteArray8602[i]) & 0xff) << 24;
						if (((Class528_Sub2) this).anIntArray8594[i] == -1) {
							int i_519_ = (i_518_ | (((Class528_Sub2) this).anIntArray8592[i] & 0xffffff));
							((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_499_, bool_500_, (((Class528_Sub2) this).aFloatArray8605[i_501_]), (((Class528_Sub2) this).aFloatArray8605[i_502_]), (((Class528_Sub2) this).aFloatArray8605[i_503_]), (((Class528_Sub2) this).aFloatArray8590[i_501_]), (((Class528_Sub2) this).aFloatArray8590[i_502_]), (((Class528_Sub2) this).aFloatArray8590[i_503_]), (((Class528_Sub2) this).aFloatArray8636[i_501_]),
									(((Class528_Sub2) this).aFloatArray8636[i_502_]), (((Class528_Sub2) this).aFloatArray8636[i_503_]), (((Class528_Sub2) this).aFloatArray8637[i_501_]), (((Class528_Sub2) this).aFloatArray8637[i_502_]), (((Class528_Sub2) this).aFloatArray8637[i_503_]), (((Class528_Sub2) this).aFloatArrayArray8635[i][0]), (((Class528_Sub2) this).aFloatArrayArray8635[i][1]), (((Class528_Sub2) this).aFloatArrayArray8635[i][2]), (((Class528_Sub2) this).aFloatArrayArray8591[i][0]),
									(((Class528_Sub2) this).aFloatArrayArray8591[i][1]), (((Class528_Sub2) this).aFloatArrayArray8591[i][2]), i_519_, i_519_, i_519_, (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_514_ * 255.0F, f_515_ * 255.0F, f_516_ * 255.0F, ((Class528_Sub2) this).aShortArray8603[i]);
						} else
							((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_499_, bool_500_, (((Class528_Sub2) this).aFloatArray8605[i_501_]), (((Class528_Sub2) this).aFloatArray8605[i_502_]), (((Class528_Sub2) this).aFloatArray8605[i_503_]), (((Class528_Sub2) this).aFloatArray8590[i_501_]), (((Class528_Sub2) this).aFloatArray8590[i_502_]), (((Class528_Sub2) this).aFloatArray8590[i_503_]), (((Class528_Sub2) this).aFloatArray8636[i_501_]),
									(((Class528_Sub2) this).aFloatArray8636[i_502_]), (((Class528_Sub2) this).aFloatArray8636[i_503_]), (((Class528_Sub2) this).aFloatArray8637[i_501_]), (((Class528_Sub2) this).aFloatArray8637[i_502_]), (((Class528_Sub2) this).aFloatArray8637[i_503_]), (((Class528_Sub2) this).aFloatArrayArray8635[i][0]), (((Class528_Sub2) this).aFloatArrayArray8635[i][1]), (((Class528_Sub2) this).aFloatArrayArray8635[i][2]), (((Class528_Sub2) this).aFloatArrayArray8591[i][0]),
									(((Class528_Sub2) this).aFloatArrayArray8591[i][1]), (((Class528_Sub2) this).aFloatArrayArray8591[i][2]), i_518_ | (((Class528_Sub2) this).anIntArray8592[i]) & 0xffffff, i_518_ | (((Class528_Sub2) this).anIntArray8631[i]) & 0xffffff, i_518_ | (((Class528_Sub2) this).anIntArray8594[i]) & 0xffffff, (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_514_ * 255.0F, f_515_ * 255.0F, f_516_ * 255.0F,
									((Class528_Sub2) this).aShortArray8603[i]);
					}
				}
			}
		} else {
			short i_520_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_521_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_522_ = ((Class528_Sub2) this).aShortArray8642[i];
			float f = 0.0F;
			float f_523_ = 0.0F;
			float f_524_ = 0.0F;
			if (((Class528_Sub2) this).anIntArray8633[i_520_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2313 * 1493774857))
				f = 1.0F;
			else if (((Class528_Sub2) this).anIntArray8633[i_520_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2306) * 2102822577)
				f = ((float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - ((Class528_Sub2) this).anIntArray8633[i_520_]) * 1.0F / (float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2313 * 1493774857)));
			if (((Class528_Sub2) this).anIntArray8633[i_521_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2313 * 1493774857))
				f_523_ = 1.0F;
			else if (((Class528_Sub2) this).anIntArray8633[i_521_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2306) * 2102822577)
				f_523_ = ((float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class528_Sub2) this).anIntArray8633[i_521_])) * 1.0F / (float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2313) * 1493774857));
			if (((Class528_Sub2) this).anIntArray8633[i_522_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2313 * 1493774857))
				f_524_ = 1.0F;
			else if (((Class528_Sub2) this).anIntArray8633[i_522_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2306) * 2102822577)
				f_524_ = ((float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class528_Sub2) this).anIntArray8633[i_522_])) * 1.0F / (float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2313) * 1493774857));
			if (((Class528_Sub2) this).aByteArray8602 == null)
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = 0;
			else
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = ((Class528_Sub2) this).aByteArray8602[i] & 0xff;
			if (((Class528_Sub2) this).aShortArray8603 == null || ((Class528_Sub2) this).aShortArray8603[i] == -1) {
				if (((Class528_Sub2) this).anIntArray8594[i] == -1)
					((Class528_Sub2) this).aClass144_8566.method2425(bool, bool_499_, bool_500_, ((Class528_Sub2) this).aFloatArray8605[i_520_], ((Class528_Sub2) this).aFloatArray8605[i_521_], ((Class528_Sub2) this).aFloatArray8605[i_522_], ((Class528_Sub2) this).aFloatArray8590[i_520_], ((Class528_Sub2) this).aFloatArray8590[i_521_], ((Class528_Sub2) this).aFloatArray8590[i_522_], ((Class528_Sub2) this).aFloatArray8636[i_520_], ((Class528_Sub2) this).aFloatArray8636[i_521_],
							((Class528_Sub2) this).aFloatArray8636[i_522_], Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8592[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f * 255.0F, 833509259), Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8592[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_523_ * 255.0F, 833509259),
							Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8592[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_524_ * 255.0F, 833509259));
				else
					((Class528_Sub2) this).aClass144_8566.method2425(bool, bool_499_, bool_500_, ((Class528_Sub2) this).aFloatArray8605[i_520_], ((Class528_Sub2) this).aFloatArray8605[i_521_], ((Class528_Sub2) this).aFloatArray8605[i_522_], ((Class528_Sub2) this).aFloatArray8590[i_520_], ((Class528_Sub2) this).aFloatArray8590[i_521_], ((Class528_Sub2) this).aFloatArray8590[i_522_], ((Class528_Sub2) this).aFloatArray8636[i_520_], ((Class528_Sub2) this).aFloatArray8636[i_521_],
							((Class528_Sub2) this).aFloatArray8636[i_522_], Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8592[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f * 255.0F, 833509259), Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8631[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_523_ * 255.0F, 833509259),
							Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8594[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_524_ * 255.0F, 833509259));
			} else {
				int i_525_ = -16777216;
				if (((Class528_Sub2) this).aByteArray8602 != null)
					i_525_ = 255 - (((Class528_Sub2) this).aByteArray8602[i] & 0xff) << 24;
				if (((Class528_Sub2) this).anIntArray8594[i] == -1) {
					int i_526_ = i_525_ | (((Class528_Sub2) this).anIntArray8592[i] & 0xffffff);
					((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_499_, bool_500_, ((Class528_Sub2) this).aFloatArray8605[i_520_], ((Class528_Sub2) this).aFloatArray8605[i_521_], ((Class528_Sub2) this).aFloatArray8605[i_522_], ((Class528_Sub2) this).aFloatArray8590[i_520_], ((Class528_Sub2) this).aFloatArray8590[i_521_], ((Class528_Sub2) this).aFloatArray8590[i_522_], ((Class528_Sub2) this).aFloatArray8636[i_520_], ((Class528_Sub2) this).aFloatArray8636[i_521_],
							((Class528_Sub2) this).aFloatArray8636[i_522_], ((Class528_Sub2) this).aFloatArray8637[i_520_], ((Class528_Sub2) this).aFloatArray8637[i_521_], ((Class528_Sub2) this).aFloatArray8637[i_522_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
							((Class528_Sub2) this).aFloatArrayArray8591[i][2], i_526_, i_526_, i_526_, (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, f * 255.0F, f_523_ * 255.0F, f_524_ * 255.0F, ((Class528_Sub2) this).aShortArray8603[i]);
				} else
					((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_499_, bool_500_, ((Class528_Sub2) this).aFloatArray8605[i_520_], ((Class528_Sub2) this).aFloatArray8605[i_521_], ((Class528_Sub2) this).aFloatArray8605[i_522_], ((Class528_Sub2) this).aFloatArray8590[i_520_], ((Class528_Sub2) this).aFloatArray8590[i_521_], ((Class528_Sub2) this).aFloatArray8590[i_522_], ((Class528_Sub2) this).aFloatArray8636[i_520_], ((Class528_Sub2) this).aFloatArray8636[i_521_],
							((Class528_Sub2) this).aFloatArray8636[i_522_], ((Class528_Sub2) this).aFloatArray8637[i_520_], ((Class528_Sub2) this).aFloatArray8637[i_521_], ((Class528_Sub2) this).aFloatArray8637[i_522_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
							((Class528_Sub2) this).aFloatArrayArray8591[i][2], i_525_ | (((Class528_Sub2) this).anIntArray8592[i] & 0xffffff), i_525_ | (((Class528_Sub2) this).anIntArray8631[i] & 0xffffff), i_525_ | (((Class528_Sub2) this).anIntArray8594[i] & 0xffffff), (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, f * 255.0F, f_523_ * 255.0F, f_524_ * 255.0F, ((Class528_Sub2) this).aShortArray8603[i]);
			}
		}
	}

	public boolean method11270(int i, int i_527_, Class294 class294, boolean bool, int i_528_) {
		method13795(((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Class384 class384 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2317);
		class384.method6522(class294);
		Class384 class384_529_ = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2318);
		class384_529_.method6562(class384);
		class384_529_.method6523(((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8996);
		boolean bool_530_ = false;
		int i_531_ = 2147483647;
		int i_532_ = -2147483648;
		int i_533_ = 2147483647;
		int i_534_ = -2147483648;
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		int i_535_ = ((((Class528_Sub2) this).aShort8627 - ((Class528_Sub2) this).aShort8634) >> 1);
		int i_536_ = ((((Class528_Sub2) this).aShort8625 - ((Class528_Sub2) this).aShort8570) >> 1);
		int i_537_ = ((((Class528_Sub2) this).aShort8629 - ((Class528_Sub2) this).aShort8571) >> 1);
		int i_538_ = ((Class528_Sub2) this).aShort8634 + i_535_;
		int i_539_ = ((Class528_Sub2) this).aShort8570 + i_536_;
		int i_540_ = ((Class528_Sub2) this).aShort8571 + i_537_;
		int i_541_ = i_538_ - (i_535_ << i_528_);
		int i_542_ = i_539_ - (i_536_ << i_528_);
		int i_543_ = i_540_ - (i_537_ << i_528_);
		int i_544_ = i_538_ + (i_535_ << i_528_);
		int i_545_ = i_539_ + (i_536_ << i_528_);
		int i_546_ = i_540_ + (i_537_ << i_528_);
		((Class528_Sub2) this).anIntArray8583[0] = i_541_;
		((Class528_Sub2) this).anIntArray8639[0] = i_542_;
		((Class528_Sub2) this).anIntArray8628[0] = i_543_;
		((Class528_Sub2) this).anIntArray8583[1] = i_544_;
		((Class528_Sub2) this).anIntArray8639[1] = i_542_;
		((Class528_Sub2) this).anIntArray8628[1] = i_543_;
		((Class528_Sub2) this).anIntArray8583[2] = i_541_;
		((Class528_Sub2) this).anIntArray8639[2] = i_545_;
		((Class528_Sub2) this).anIntArray8628[2] = i_543_;
		((Class528_Sub2) this).anIntArray8583[3] = i_544_;
		((Class528_Sub2) this).anIntArray8639[3] = i_545_;
		((Class528_Sub2) this).anIntArray8628[3] = i_543_;
		((Class528_Sub2) this).anIntArray8583[4] = i_541_;
		((Class528_Sub2) this).anIntArray8639[4] = i_542_;
		((Class528_Sub2) this).anIntArray8628[4] = i_546_;
		((Class528_Sub2) this).anIntArray8583[5] = i_544_;
		((Class528_Sub2) this).anIntArray8639[5] = i_542_;
		((Class528_Sub2) this).anIntArray8628[5] = i_546_;
		((Class528_Sub2) this).anIntArray8583[6] = i_541_;
		((Class528_Sub2) this).anIntArray8639[6] = i_545_;
		((Class528_Sub2) this).anIntArray8628[6] = i_546_;
		((Class528_Sub2) this).anIntArray8583[7] = i_544_;
		((Class528_Sub2) this).anIntArray8639[7] = i_545_;
		((Class528_Sub2) this).anIntArray8628[7] = i_546_;
		for (int i_547_ = 0; i_547_ < 8; i_547_++) {
			int i_548_ = ((Class528_Sub2) this).anIntArray8583[i_547_];
			int i_549_ = ((Class528_Sub2) this).anIntArray8639[i_547_];
			int i_550_ = ((Class528_Sub2) this).anIntArray8628[i_547_];
			float f = (class384_529_.aFloatArray4667[2] * (float) i_548_ + class384_529_.aFloatArray4667[6] * (float) i_549_ + class384_529_.aFloatArray4667[10] * (float) i_550_ + class384_529_.aFloatArray4667[14]);
			float f_551_ = (class384_529_.aFloatArray4667[3] * (float) i_548_ + class384_529_.aFloatArray4667[7] * (float) i_549_ + class384_529_.aFloatArray4667[11] * (float) i_550_ + class384_529_.aFloatArray4667[15]);
			if (f >= -f_551_) {
				float f_552_ = (class384_529_.aFloatArray4667[0] * (float) i_548_ + class384_529_.aFloatArray4667[4] * (float) i_549_ + class384_529_.aFloatArray4667[8] * (float) i_550_ + class384_529_.aFloatArray4667[12]);
				float f_553_ = (class384_529_.aFloatArray4667[1] * (float) i_548_ + class384_529_.aFloatArray4667[5] * (float) i_549_ + class384_529_.aFloatArray4667[9] * (float) i_550_ + class384_529_.aFloatArray4667[13]);
				int i_554_ = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976) * f_552_ / f_551_);
				int i_555_ = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004) * f_553_ / f_551_);
				if (i_554_ < i_531_)
					i_531_ = i_554_;
				if (i_554_ > i_532_)
					i_532_ = i_554_;
				if (i_555_ < i_533_)
					i_533_ = i_555_;
				if (i_555_ > i_534_)
					i_534_ = i_555_;
				bool_530_ = true;
			}
		}
		if (bool_530_ && i > i_531_ && i < i_532_ && i_527_ > i_533_ && i_527_ < i_534_) {
			if (bool)
				return true;
			for (int i_556_ = 0; i_556_ < ((Class528_Sub2) this).anInt8578; i_556_++) {
				int i_557_ = ((Class528_Sub2) this).anIntArray8580[i_556_];
				int i_558_ = ((Class528_Sub2) this).anIntArray8581[i_556_];
				int i_559_ = ((Class528_Sub2) this).anIntArray8610[i_556_];
				float f = (class384_529_.aFloatArray4667[2] * (float) i_557_ + class384_529_.aFloatArray4667[6] * (float) i_558_ + class384_529_.aFloatArray4667[10] * (float) i_559_ + class384_529_.aFloatArray4667[14]);
				float f_560_ = (class384_529_.aFloatArray4667[3] * (float) i_557_ + class384_529_.aFloatArray4667[7] * (float) i_558_ + class384_529_.aFloatArray4667[11] * (float) i_559_ + class384_529_.aFloatArray4667[15]);
				if (f >= -f_560_) {
					float f_561_ = (class384_529_.aFloatArray4667[0] * (float) i_557_ + class384_529_.aFloatArray4667[4] * (float) i_558_ + class384_529_.aFloatArray4667[8] * (float) i_559_ + class384_529_.aFloatArray4667[12]);
					float f_562_ = (class384_529_.aFloatArray4667[1] * (float) i_557_ + class384_529_.aFloatArray4667[5] * (float) i_558_ + class384_529_.aFloatArray4667[9] * (float) i_559_ + class384_529_.aFloatArray4667[13]);
					((Class528_Sub2) this).aFloatArray8590[i_556_] = (float) (int) (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_561_ / f_560_));
					((Class528_Sub2) this).aFloatArray8605[i_556_] = (float) (int) (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8982 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004 * f_562_ / f_560_));
				} else
					((Class528_Sub2) this).aFloatArray8590[i_556_] = -999999.0F;
			}
			for (int i_563_ = 0; i_563_ < ((Class528_Sub2) this).anInt8586; i_563_++) {
				if (((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8587[i_563_]]) != -999999.0F) && ((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8588[i_563_]]) != -999999.0F) && ((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8642[i_563_]]) != -999999.0F) && (method13819(i, i_527_, (((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8587[i_563_]]),
						(((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8588[i_563_]]), (((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8642[i_563_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8587[i_563_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8588[i_563_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8642[i_563_]]))))
					return true;
			}
		}
		return false;
	}

	boolean method13819(int i, int i_564_, float f, float f_565_, float f_566_, float f_567_, float f_568_, float f_569_) {
		if ((float) i_564_ < f && (float) i_564_ < f_565_ && (float) i_564_ < f_566_)
			return false;
		if ((float) i_564_ > f && (float) i_564_ > f_565_ && (float) i_564_ > f_566_)
			return false;
		if ((float) i < f_567_ && (float) i < f_568_ && (float) i < f_569_)
			return false;
		if ((float) i > f_567_ && (float) i > f_568_ && (float) i > f_569_)
			return false;
		return true;
	}

	static {
		anInt8562 = 4096;
		anInt8612 = 0;
	}

	void method11260() {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				while (aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool7023 = true;
			}
		}
	}

	int method13820(int i, short i_570_, int i_571_) {
		int i_572_ = Class540.anIntArray7136[method13855(i, i_571_)];
		Class169 class169 = ((Class528_Sub2) this).aClass505_Sub3_8638.anInterface22_5834.method144(i_570_ & 0xffff, -1832198730);
		int i_573_ = class169.aByte2079 & 0xff;
		if (i_573_ != 0) {
			int i_574_ = 131586 * i_571_;
			if (i_573_ == 256)
				i_572_ = i_574_;
			else {
				int i_575_ = i_573_;
				int i_576_ = 256 - i_573_;
				i_572_ = ((((i_574_ & 0xff00ff) * i_575_ + (i_572_ & 0xff00ff) * i_576_) & ~0xff00ff) + (((i_574_ & 0xff00) * i_575_ + (i_572_ & 0xff00) * i_576_) & 0xff0000)) >> 8;
			}
		}
		int i_577_ = class169.aByte2080 & 0xff;
		if (i_577_ != 0) {
			i_577_ += 256;
			int i_578_ = ((i_572_ & 0xff0000) >> 16) * i_577_;
			if (i_578_ > 65535)
				i_578_ = 65535;
			int i_579_ = ((i_572_ & 0xff00) >> 8) * i_577_;
			if (i_579_ > 65535)
				i_579_ = 65535;
			int i_580_ = (i_572_ & 0xff) * i_577_;
			if (i_580_ > 65535)
				i_580_ = 65535;
			i_572_ = (i_578_ << 8 & 0xff0000) + (i_579_ & 0xff00) + (i_580_ >> 8);
		}
		return i_572_;
	}

	public int N() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8595;
	}

	public int n() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8574;
	}

	public int RA() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8634;
	}

	public boolean method11303() {
		if (((Class528_Sub2) this).aShortArray8603 == null)
			return true;
		for (int i = 0; i < ((Class528_Sub2) this).aShortArray8603.length; i++) {
			if (((Class528_Sub2) this).aShortArray8603[i] != -1 && !(((Class528_Sub2) this).aClass505_Sub3_8638.method14360(((Class528_Sub2) this).aShortArray8603[i])))
				return false;
		}
		return true;
	}

	public int cm() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8570;
	}

	public int o() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8625;
	}

	public int AA() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8571;
	}

	public int cv() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8634;
	}

	public void p(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class528_Sub2) this).anInt8606 = i;
		((Class528_Sub2) this).anInt8598 = 0;
	}

	public MeshRasterizer method11276(byte i, int i_581_, boolean bool) {
		method13796(Thread.currentThread());
		boolean bool_582_ = false;
		Class528_Sub2 class528_sub2_583_;
		Class528_Sub2 class528_sub2_584_;
		if (i > 0 && i <= 7) {
			class528_sub2_584_ = ((Class528_Sub2) this).aClass528_Sub2Array8645[i - 1];
			class528_sub2_583_ = ((Class528_Sub2) this).aClass528_Sub2Array8626[i - 1];
			bool_582_ = true;
		} else
			class528_sub2_583_ = class528_sub2_584_ = new Class528_Sub2(((Class528_Sub2) this).aClass505_Sub3_8638);
		return method13804(class528_sub2_583_, class528_sub2_584_, i_581_, bool_582_, bool);
	}

	public void bw(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method13805();
		else if (i == 8192)
			method13806();
		else if (i == 12288)
			method13807();
		else {
			int i_585_ = Class382.anIntArray4657[i];
			int i_586_ = Class382.anIntArray4661[i];
			synchronized (this) {
				for (int i_587_ = 0; i_587_ < ((Class528_Sub2) this).anInt8578; i_587_++) {
					int i_588_ = (((((Class528_Sub2) this).anIntArray8610[i_587_] * i_585_) + (((Class528_Sub2) this).anIntArray8580[i_587_] * i_586_)) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_587_] = ((((Class528_Sub2) this).anIntArray8610[i_587_] * i_586_) - (((Class528_Sub2) this).anIntArray8580[i_587_] * i_585_)) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_587_] = i_588_;
				}
				method13812();
			}
		}
	}

	public int Z() {
		return ((Class528_Sub2) this).anInt8577;
	}

	void method13821() {
		if (((Class528_Sub2) this).anInt8598 == 0)
			method13853(false);
		else if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				method13802();
			}
		} else
			method13802();
	}

	public void X(short i, short i_589_) {
		for (int i_590_ = 0; i_590_ < ((Class528_Sub2) this).anInt8586; i_590_++) {
			if (((Class528_Sub2) this).aShortArray8604[i_590_] == i)
				((Class528_Sub2) this).aShortArray8604[i_590_] = i_589_;
		}
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i_591_ = 0; i_591_ < ((Class528_Sub2) this).anInt8617; i_591_++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_591_];
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_591_];
				((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | ((Class335.anIntArray3916[Class372.method6362((((Class528_Sub2) this).aShortArray8604[(((Class193) class193).anInt2393) * 142270897]), 677879658) & 0xffff]) & 0xffffff)) * -1022818925;
			}
		}
		if (((Class528_Sub2) this).anInt8598 == 2)
			((Class528_Sub2) this).anInt8598 = 1;
	}

	public void method11312(byte i, byte[] is) {
		if ((((Class528_Sub2) this).anInt8575 & 0x100000) == 0)
			throw new RuntimeException();
		if (((Class528_Sub2) this).aByteArray8602 == null)
			((Class528_Sub2) this).aByteArray8602 = new byte[((Class528_Sub2) this).anInt8586];
		if (is == null) {
			for (int i_592_ = 0; i_592_ < ((Class528_Sub2) this).anInt8586; i_592_++)
				((Class528_Sub2) this).aByteArray8602[i_592_] = i;
		} else {
			for (int i_593_ = 0; i_593_ < ((Class528_Sub2) this).anInt8586; i_593_++) {
				int i_594_ = 255 - ((255 - (is[i_593_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class528_Sub2) this).aByteArray8602[i_593_] = (byte) i_594_;
			}
		}
		if (((Class528_Sub2) this).anInt8598 == 2)
			((Class528_Sub2) this).anInt8598 = 1;
	}

	public Class282_Sub50_Sub17 da(Class282_Sub50_Sub17 class282_sub50_sub17) {
		return null;
	}

	public void PA(int i, int i_595_, int i_596_, int i_597_) {
		if ((((Class528_Sub2) this).anInt8575 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_598_ = 0; i_598_ < ((Class528_Sub2) this).anInt8586; i_598_++) {
			int i_599_ = ((Class528_Sub2) this).aShortArray8604[i_598_] & 0xffff;
			int i_600_ = i_599_ >> 10 & 0x3f;
			int i_601_ = i_599_ >> 7 & 0x7;
			int i_602_ = i_599_ & 0x7f;
			if (i != -1)
				i_600_ += (i - i_600_) * i_597_ >> 7;
			if (i_595_ != -1)
				i_601_ += (i_595_ - i_601_) * i_597_ >> 7;
			if (i_596_ != -1)
				i_602_ += (i_596_ - i_602_) * i_597_ >> 7;
			((Class528_Sub2) this).aShortArray8604[i_598_] = (short) (i_600_ << 10 | i_601_ << 7 | i_602_);
		}
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i_603_ = 0; i_603_ < ((Class528_Sub2) this).anInt8617; i_603_++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_603_];
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_603_];
				((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | ((Class335.anIntArray3916[Class372.method6362(((((Class528_Sub2) this).aShortArray8604[(((Class193) class193).anInt2393) * 142270897]) & 0xffff), 713561210) & 0xffff]) & 0xffffff)) * -1022818925;
			}
		}
		if (((Class528_Sub2) this).anInt8598 == 2)
			((Class528_Sub2) this).anInt8598 = 1;
	}

	public Class87[] method11253() {
		return ((Class528_Sub2) this).aClass87Array8615;
	}

	public Class172[] method11274() {
		return ((Class528_Sub2) this).aClass172Array8616;
	}

	final void method13822(boolean bool, boolean bool_604_, boolean bool_605_, int i) {
		short i_606_ = ((Class528_Sub2) this).aShortArray8587[i];
		short i_607_ = ((Class528_Sub2) this).aShortArray8588[i];
		short i_608_ = ((Class528_Sub2) this).aShortArray8642[i];
		if (((Class528_Sub2) this).aShortArray8603 == null || ((Class528_Sub2) this).aShortArray8603[i] == -1) {
			if (((Class528_Sub2) this).aByteArray8602 == null)
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = 0;
			else
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = ((Class528_Sub2) this).aByteArray8602[i] & 0xff;
			if (((Class528_Sub2) this).anIntArray8594[i] == -1)
				((Class528_Sub2) this).aClass144_8566.method2428(bool, bool_604_, bool_605_, ((Class528_Sub2) this).aFloatArray8605[i_606_], ((Class528_Sub2) this).aFloatArray8605[i_607_], ((Class528_Sub2) this).aFloatArray8605[i_608_], ((Class528_Sub2) this).aFloatArray8590[i_606_], ((Class528_Sub2) this).aFloatArray8590[i_607_], ((Class528_Sub2) this).aFloatArray8590[i_608_], ((Class528_Sub2) this).aFloatArray8636[i_606_], ((Class528_Sub2) this).aFloatArray8636[i_607_],
						((Class528_Sub2) this).aFloatArray8636[i_608_], (Class335.anIntArray3916[((Class528_Sub2) this).anIntArray8592[i] & 0xffff]));
			else
				((Class528_Sub2) this).aClass144_8566.method2426(bool, bool_604_, bool_605_, ((Class528_Sub2) this).aFloatArray8605[i_606_], ((Class528_Sub2) this).aFloatArray8605[i_607_], ((Class528_Sub2) this).aFloatArray8605[i_608_], ((Class528_Sub2) this).aFloatArray8590[i_606_], ((Class528_Sub2) this).aFloatArray8590[i_607_], ((Class528_Sub2) this).aFloatArray8590[i_608_], ((Class528_Sub2) this).aFloatArray8636[i_606_], ((Class528_Sub2) this).aFloatArray8636[i_607_],
						((Class528_Sub2) this).aFloatArray8636[i_608_], (float) (((Class528_Sub2) this).anIntArray8592[i] & 0xffff), (float) (((Class528_Sub2) this).anIntArray8631[i] & 0xffff), (float) (((Class528_Sub2) this).anIntArray8594[i] & 0xffff));
		} else {
			int i_609_ = -16777216;
			if (((Class528_Sub2) this).aByteArray8602 != null)
				i_609_ = 255 - (((Class528_Sub2) this).aByteArray8602[i] & 0xff) << 24;
			if (((Class528_Sub2) this).anIntArray8594[i] == -1) {
				int i_610_ = (i_609_ | ((Class528_Sub2) this).anIntArray8592[i] & 0xffffff);
				((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_604_, bool_605_, ((Class528_Sub2) this).aFloatArray8605[i_606_], ((Class528_Sub2) this).aFloatArray8605[i_607_], ((Class528_Sub2) this).aFloatArray8605[i_608_], ((Class528_Sub2) this).aFloatArray8590[i_606_], ((Class528_Sub2) this).aFloatArray8590[i_607_], ((Class528_Sub2) this).aFloatArray8590[i_608_], ((Class528_Sub2) this).aFloatArray8636[i_606_], ((Class528_Sub2) this).aFloatArray8636[i_607_],
						((Class528_Sub2) this).aFloatArray8636[i_608_], ((Class528_Sub2) this).aFloatArray8637[i_606_], ((Class528_Sub2) this).aFloatArray8637[i_607_], ((Class528_Sub2) this).aFloatArray8637[i_608_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
						((Class528_Sub2) this).aFloatArrayArray8591[i][2], i_610_, i_610_, i_610_, (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, 0.0F, 0.0F, 0.0F, ((Class528_Sub2) this).aShortArray8603[i]);
			} else
				((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_604_, bool_605_, ((Class528_Sub2) this).aFloatArray8605[i_606_], ((Class528_Sub2) this).aFloatArray8605[i_607_], ((Class528_Sub2) this).aFloatArray8605[i_608_], ((Class528_Sub2) this).aFloatArray8590[i_606_], ((Class528_Sub2) this).aFloatArray8590[i_607_], ((Class528_Sub2) this).aFloatArray8590[i_608_], ((Class528_Sub2) this).aFloatArray8636[i_606_], ((Class528_Sub2) this).aFloatArray8636[i_607_],
						((Class528_Sub2) this).aFloatArray8636[i_608_], ((Class528_Sub2) this).aFloatArray8637[i_606_], ((Class528_Sub2) this).aFloatArray8637[i_607_], ((Class528_Sub2) this).aFloatArray8637[i_608_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
						((Class528_Sub2) this).aFloatArrayArray8591[i][2], (i_609_ | ((Class528_Sub2) this).anIntArray8592[i] & 0xffffff), (i_609_ | ((Class528_Sub2) this).anIntArray8631[i] & 0xffffff), (i_609_ | ((Class528_Sub2) this).anIntArray8594[i] & 0xffffff), (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, 0.0F, 0.0F, 0.0F, ((Class528_Sub2) this).aShortArray8603[i]);
		}
	}

	public boolean i() {
		return ((Class528_Sub2) this).aBool8630;
	}

	public boolean u() {
		return ((Class528_Sub2) this).aBool8640;
	}

	public void bk(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x6) != 6)
			throw new IllegalStateException();
		int i_611_ = Class382.anIntArray4657[i];
		int i_612_ = Class382.anIntArray4661[i];
		synchronized (this) {
			for (int i_613_ = 0; i_613_ < ((Class528_Sub2) this).anInt8578; i_613_++) {
				int i_614_ = ((((Class528_Sub2) this).anIntArray8581[i_613_] * i_612_ - (((Class528_Sub2) this).anIntArray8610[i_613_] * i_611_)) >> 14);
				((Class528_Sub2) this).anIntArray8610[i_613_] = (((Class528_Sub2) this).anIntArray8581[i_613_] * i_611_ + (((Class528_Sub2) this).anIntArray8610[i_613_] * i_612_)) >> 14;
				((Class528_Sub2) this).anIntArray8581[i_613_] = i_614_;
			}
			method13812();
		}
	}

	void method13823(Class185 class185) {
		((Class528_Sub2) this).aClass144_8566 = ((Class185) class185).aClass144_2310;
		if (class185 != ((Class528_Sub2) this).aClass185_8564) {
			((Class528_Sub2) this).aClass185_8564 = class185;
			((Class528_Sub2) this).anIntArray8633 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2319);
			((Class528_Sub2) this).aFloatArray8590 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2302);
			((Class528_Sub2) this).aFloatArray8605 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2341);
			((Class528_Sub2) this).aFloatArray8636 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2322);
			((Class528_Sub2) this).aFloatArray8637 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2323);
			((Class528_Sub2) this).anIntArray8583 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2321);
			((Class528_Sub2) this).anIntArray8639 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2325);
			((Class528_Sub2) this).anIntArray8628 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2312);
			((Class528_Sub2) this).anIntArray8567 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2327);
			((Class528_Sub2) this).anIntArray8619 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2328);
			((Class528_Sub2) this).anIntArray8643 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2329);
		}
	}

	void method13824(Class185 class185) {
		((Class528_Sub2) this).aClass144_8566 = ((Class185) class185).aClass144_2310;
		if (class185 != ((Class528_Sub2) this).aClass185_8564) {
			((Class528_Sub2) this).aClass185_8564 = class185;
			((Class528_Sub2) this).anIntArray8633 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2319);
			((Class528_Sub2) this).aFloatArray8590 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2302);
			((Class528_Sub2) this).aFloatArray8605 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2341);
			((Class528_Sub2) this).aFloatArray8636 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2322);
			((Class528_Sub2) this).aFloatArray8637 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2323);
			((Class528_Sub2) this).anIntArray8583 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2321);
			((Class528_Sub2) this).anIntArray8639 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2325);
			((Class528_Sub2) this).anIntArray8628 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2312);
			((Class528_Sub2) this).anIntArray8567 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2327);
			((Class528_Sub2) this).anIntArray8619 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2328);
			((Class528_Sub2) this).anIntArray8643 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2329);
		}
	}

	public void method11294(Class294 class294) {
		method13795(((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Class384 class384 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2317);
		class384.method6522(class294);
		if (((Class528_Sub2) this).aClass87Array8615 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).aClass87Array8615.length; i++) {
				Class87 class87 = ((Class528_Sub2) this).aClass87Array8615[i];
				Class87 class87_615_ = class87;
				if (class87.aClass87_835 != null)
					class87_615_ = class87.aClass87_835;
				class87_615_.anInt844 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_615_.anInt841 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_615_.anInt847 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_615_.anInt834 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_615_.anInt843 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_615_.anInt845 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_615_.anInt846 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_615_.anInt840 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_615_.anInt848 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub2) this).aClass172Array8616 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).aClass172Array8616.length; i++) {
				Class172 class172 = ((Class528_Sub2) this).aClass172Array8616[i];
				Class172 class172_616_ = class172;
				if (class172.aClass172_2114 != null)
					class172_616_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Class384(class384);
				class172_616_.anInt2113 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_616_.anInt2117 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_616_.anInt2118 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	void method13825(Thread thread) {
		Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(thread);
		if (class185 != ((Class528_Sub2) this).aClass185_8565) {
			((Class528_Sub2) this).aClass185_8565 = class185;
			((Class528_Sub2) this).aClass528_Sub2Array8626 = (((Class185) ((Class528_Sub2) this).aClass185_8565).aClass528_Sub2Array2339);
			((Class528_Sub2) this).aClass528_Sub2Array8645 = (((Class185) ((Class528_Sub2) this).aClass185_8565).aClass528_Sub2Array2340);
		}
	}

	void method13826(Thread thread) {
		Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(thread);
		if (class185 != ((Class528_Sub2) this).aClass185_8565) {
			((Class528_Sub2) this).aClass185_8565 = class185;
			((Class528_Sub2) this).aClass528_Sub2Array8626 = (((Class185) ((Class528_Sub2) this).aClass185_8565).aClass528_Sub2Array2339);
			((Class528_Sub2) this).aClass528_Sub2Array8645 = (((Class185) ((Class528_Sub2) this).aClass185_8565).aClass528_Sub2Array2340);
		}
	}

	void method13827() {
		if (((Class528_Sub2) this).anInt8598 == 0 && ((Class528_Sub2) this).aClass189Array8584 == null) {
			if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
				synchronized (this) {
					method13797();
				}
			} else
				method13797();
		}
	}

	void method13828() {
		if (((Class528_Sub2) this).anInt8598 == 0 && ((Class528_Sub2) this).aClass189Array8584 == null) {
			if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
				synchronized (this) {
					method13797();
				}
			} else
				method13797();
		}
	}

	void method13829() {
		((Class528_Sub2) this).aClass189Array8584 = new Class189[((Class528_Sub2) this).anInt8579];
		for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++)
			((Class528_Sub2) this).aClass189Array8584[i] = new Class189();
		for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
			short i_617_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_618_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_619_ = ((Class528_Sub2) this).aShortArray8642[i];
			int i_620_ = (((Class528_Sub2) this).anIntArray8580[i_618_] - ((Class528_Sub2) this).anIntArray8580[i_617_]);
			int i_621_ = (((Class528_Sub2) this).anIntArray8581[i_618_] - ((Class528_Sub2) this).anIntArray8581[i_617_]);
			int i_622_ = (((Class528_Sub2) this).anIntArray8610[i_618_] - ((Class528_Sub2) this).anIntArray8610[i_617_]);
			int i_623_ = (((Class528_Sub2) this).anIntArray8580[i_619_] - ((Class528_Sub2) this).anIntArray8580[i_617_]);
			int i_624_ = (((Class528_Sub2) this).anIntArray8581[i_619_] - ((Class528_Sub2) this).anIntArray8581[i_617_]);
			int i_625_ = (((Class528_Sub2) this).anIntArray8610[i_619_] - ((Class528_Sub2) this).anIntArray8610[i_617_]);
			int i_626_ = i_621_ * i_625_ - i_624_ * i_622_;
			int i_627_ = i_622_ * i_623_ - i_625_ * i_620_;
			int i_628_;
			for (i_628_ = i_620_ * i_624_ - i_623_ * i_621_; (i_626_ > 8192 || i_627_ > 8192 || i_628_ > 8192 || i_626_ < -8192 || i_627_ < -8192 || i_628_ < -8192); i_628_ >>= 1) {
				i_626_ >>= 1;
				i_627_ >>= 1;
			}
			int i_629_ = (int) Math.sqrt((double) (i_626_ * i_626_ + i_627_ * i_627_ + i_628_ * i_628_));
			if (i_629_ <= 0)
				i_629_ = 1;
			i_626_ = i_626_ * 256 / i_629_;
			i_627_ = i_627_ * 256 / i_629_;
			i_628_ = i_628_ * 256 / i_629_;
			byte i_630_;
			if (((Class528_Sub2) this).aByteArray8600 == null)
				i_630_ = (byte) 0;
			else
				i_630_ = ((Class528_Sub2) this).aByteArray8600[i];
			if (i_630_ == 0) {
				Class189 class189 = ((Class528_Sub2) this).aClass189Array8584[i_617_];
				((Class189) class189).anInt2380 += i_626_;
				((Class189) class189).anInt2381 += i_627_;
				((Class189) class189).anInt2379 += i_628_;
				((Class189) class189).anInt2382++;
				class189 = ((Class528_Sub2) this).aClass189Array8584[i_618_];
				((Class189) class189).anInt2380 += i_626_;
				((Class189) class189).anInt2381 += i_627_;
				((Class189) class189).anInt2379 += i_628_;
				((Class189) class189).anInt2382++;
				class189 = ((Class528_Sub2) this).aClass189Array8584[i_619_];
				((Class189) class189).anInt2380 += i_626_;
				((Class189) class189).anInt2381 += i_627_;
				((Class189) class189).anInt2379 += i_628_;
				((Class189) class189).anInt2382++;
			} else if (i_630_ == 1) {
				if (((Class528_Sub2) this).aClass195Array8599 == null)
					((Class528_Sub2) this).aClass195Array8599 = new Class195[((Class528_Sub2) this).anInt8586];
				Class195 class195 = (((Class528_Sub2) this).aClass195Array8599[i] = new Class195());
				((Class195) class195).anInt2410 = i_626_;
				((Class195) class195).anInt2411 = i_627_;
				((Class195) class195).anInt2412 = i_628_;
			}
		}
	}

	void method13830() {
		((Class528_Sub2) this).aClass189Array8584 = new Class189[((Class528_Sub2) this).anInt8579];
		for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++)
			((Class528_Sub2) this).aClass189Array8584[i] = new Class189();
		for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
			short i_631_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_632_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_633_ = ((Class528_Sub2) this).aShortArray8642[i];
			int i_634_ = (((Class528_Sub2) this).anIntArray8580[i_632_] - ((Class528_Sub2) this).anIntArray8580[i_631_]);
			int i_635_ = (((Class528_Sub2) this).anIntArray8581[i_632_] - ((Class528_Sub2) this).anIntArray8581[i_631_]);
			int i_636_ = (((Class528_Sub2) this).anIntArray8610[i_632_] - ((Class528_Sub2) this).anIntArray8610[i_631_]);
			int i_637_ = (((Class528_Sub2) this).anIntArray8580[i_633_] - ((Class528_Sub2) this).anIntArray8580[i_631_]);
			int i_638_ = (((Class528_Sub2) this).anIntArray8581[i_633_] - ((Class528_Sub2) this).anIntArray8581[i_631_]);
			int i_639_ = (((Class528_Sub2) this).anIntArray8610[i_633_] - ((Class528_Sub2) this).anIntArray8610[i_631_]);
			int i_640_ = i_635_ * i_639_ - i_638_ * i_636_;
			int i_641_ = i_636_ * i_637_ - i_639_ * i_634_;
			int i_642_;
			for (i_642_ = i_634_ * i_638_ - i_637_ * i_635_; (i_640_ > 8192 || i_641_ > 8192 || i_642_ > 8192 || i_640_ < -8192 || i_641_ < -8192 || i_642_ < -8192); i_642_ >>= 1) {
				i_640_ >>= 1;
				i_641_ >>= 1;
			}
			int i_643_ = (int) Math.sqrt((double) (i_640_ * i_640_ + i_641_ * i_641_ + i_642_ * i_642_));
			if (i_643_ <= 0)
				i_643_ = 1;
			i_640_ = i_640_ * 256 / i_643_;
			i_641_ = i_641_ * 256 / i_643_;
			i_642_ = i_642_ * 256 / i_643_;
			byte i_644_;
			if (((Class528_Sub2) this).aByteArray8600 == null)
				i_644_ = (byte) 0;
			else
				i_644_ = ((Class528_Sub2) this).aByteArray8600[i];
			if (i_644_ == 0) {
				Class189 class189 = ((Class528_Sub2) this).aClass189Array8584[i_631_];
				((Class189) class189).anInt2380 += i_640_;
				((Class189) class189).anInt2381 += i_641_;
				((Class189) class189).anInt2379 += i_642_;
				((Class189) class189).anInt2382++;
				class189 = ((Class528_Sub2) this).aClass189Array8584[i_632_];
				((Class189) class189).anInt2380 += i_640_;
				((Class189) class189).anInt2381 += i_641_;
				((Class189) class189).anInt2379 += i_642_;
				((Class189) class189).anInt2382++;
				class189 = ((Class528_Sub2) this).aClass189Array8584[i_633_];
				((Class189) class189).anInt2380 += i_640_;
				((Class189) class189).anInt2381 += i_641_;
				((Class189) class189).anInt2379 += i_642_;
				((Class189) class189).anInt2382++;
			} else if (i_644_ == 1) {
				if (((Class528_Sub2) this).aClass195Array8599 == null)
					((Class528_Sub2) this).aClass195Array8599 = new Class195[((Class528_Sub2) this).anInt8586];
				Class195 class195 = (((Class528_Sub2) this).aClass195Array8599[i] = new Class195());
				((Class195) class195).anInt2410 = i_640_;
				((Class195) class195).anInt2411 = i_641_;
				((Class195) class195).anInt2412 = i_642_;
			}
		}
	}

	void method13831() {
		((Class528_Sub2) this).aClass189Array8584 = new Class189[((Class528_Sub2) this).anInt8579];
		for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++)
			((Class528_Sub2) this).aClass189Array8584[i] = new Class189();
		for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
			short i_645_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_646_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_647_ = ((Class528_Sub2) this).aShortArray8642[i];
			int i_648_ = (((Class528_Sub2) this).anIntArray8580[i_646_] - ((Class528_Sub2) this).anIntArray8580[i_645_]);
			int i_649_ = (((Class528_Sub2) this).anIntArray8581[i_646_] - ((Class528_Sub2) this).anIntArray8581[i_645_]);
			int i_650_ = (((Class528_Sub2) this).anIntArray8610[i_646_] - ((Class528_Sub2) this).anIntArray8610[i_645_]);
			int i_651_ = (((Class528_Sub2) this).anIntArray8580[i_647_] - ((Class528_Sub2) this).anIntArray8580[i_645_]);
			int i_652_ = (((Class528_Sub2) this).anIntArray8581[i_647_] - ((Class528_Sub2) this).anIntArray8581[i_645_]);
			int i_653_ = (((Class528_Sub2) this).anIntArray8610[i_647_] - ((Class528_Sub2) this).anIntArray8610[i_645_]);
			int i_654_ = i_649_ * i_653_ - i_652_ * i_650_;
			int i_655_ = i_650_ * i_651_ - i_653_ * i_648_;
			int i_656_;
			for (i_656_ = i_648_ * i_652_ - i_651_ * i_649_; (i_654_ > 8192 || i_655_ > 8192 || i_656_ > 8192 || i_654_ < -8192 || i_655_ < -8192 || i_656_ < -8192); i_656_ >>= 1) {
				i_654_ >>= 1;
				i_655_ >>= 1;
			}
			int i_657_ = (int) Math.sqrt((double) (i_654_ * i_654_ + i_655_ * i_655_ + i_656_ * i_656_));
			if (i_657_ <= 0)
				i_657_ = 1;
			i_654_ = i_654_ * 256 / i_657_;
			i_655_ = i_655_ * 256 / i_657_;
			i_656_ = i_656_ * 256 / i_657_;
			byte i_658_;
			if (((Class528_Sub2) this).aByteArray8600 == null)
				i_658_ = (byte) 0;
			else
				i_658_ = ((Class528_Sub2) this).aByteArray8600[i];
			if (i_658_ == 0) {
				Class189 class189 = ((Class528_Sub2) this).aClass189Array8584[i_645_];
				((Class189) class189).anInt2380 += i_654_;
				((Class189) class189).anInt2381 += i_655_;
				((Class189) class189).anInt2379 += i_656_;
				((Class189) class189).anInt2382++;
				class189 = ((Class528_Sub2) this).aClass189Array8584[i_646_];
				((Class189) class189).anInt2380 += i_654_;
				((Class189) class189).anInt2381 += i_655_;
				((Class189) class189).anInt2379 += i_656_;
				((Class189) class189).anInt2382++;
				class189 = ((Class528_Sub2) this).aClass189Array8584[i_647_];
				((Class189) class189).anInt2380 += i_654_;
				((Class189) class189).anInt2381 += i_655_;
				((Class189) class189).anInt2379 += i_656_;
				((Class189) class189).anInt2382++;
			} else if (i_658_ == 1) {
				if (((Class528_Sub2) this).aClass195Array8599 == null)
					((Class528_Sub2) this).aClass195Array8599 = new Class195[((Class528_Sub2) this).anInt8586];
				Class195 class195 = (((Class528_Sub2) this).aClass195Array8599[i] = new Class195());
				((Class195) class195).anInt2410 = i_654_;
				((Class195) class195).anInt2411 = i_655_;
				((Class195) class195).anInt2412 = i_656_;
			}
		}
	}

	void method13832(boolean bool) {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				method13798(bool);
			}
		} else
			method13798(bool);
	}

	void method13833(boolean bool) {
		if (((Class528_Sub2) this).anInt8598 == 1)
			method13801();
		else if (((Class528_Sub2) this).anInt8598 == 2) {
			if ((((Class528_Sub2) this).anInt8575 & 0x97098) == 0 && ((Class528_Sub2) this).aFloatArrayArray8635 == null)
				((Class528_Sub2) this).aShortArray8604 = null;
			if (bool)
				((Class528_Sub2) this).aByteArray8600 = null;
		} else {
			method13877();
			int i = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9011) * 1302966735;
			int i_659_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt8988) * -1947219005;
			int i_660_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9007) * 1237704411;
			int i_661_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt8992) * -456583957 >> 8;
			int i_662_ = 0;
			int i_663_ = 0;
			if (((Class528_Sub2) this).anInt8577 != 0) {
				i_662_ = (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).anInt8990 * -1085780736 / ((Class528_Sub2) this).anInt8577);
				i_663_ = (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).anInt8991 * -1967065344 / ((Class528_Sub2) this).anInt8577);
			}
			if (((Class528_Sub2) this).anIntArray8592 == null) {
				((Class528_Sub2) this).anIntArray8592 = new int[((Class528_Sub2) this).anInt8586];
				((Class528_Sub2) this).anIntArray8631 = new int[((Class528_Sub2) this).anInt8586];
				((Class528_Sub2) this).anIntArray8594 = new int[((Class528_Sub2) this).anInt8586];
			}
			for (int i_664_ = 0; i_664_ < ((Class528_Sub2) this).anInt8586; i_664_++) {
				byte i_665_;
				if (((Class528_Sub2) this).aByteArray8600 == null)
					i_665_ = (byte) 0;
				else
					i_665_ = ((Class528_Sub2) this).aByteArray8600[i_664_];
				byte i_666_;
				if (((Class528_Sub2) this).aByteArray8602 == null)
					i_666_ = (byte) 0;
				else
					i_666_ = ((Class528_Sub2) this).aByteArray8602[i_664_];
				short i_667_;
				if (((Class528_Sub2) this).aShortArray8603 == null)
					i_667_ = (short) -1;
				else
					i_667_ = ((Class528_Sub2) this).aShortArray8603[i_664_];
				if (i_666_ == -2)
					i_665_ = (byte) 3;
				if (i_666_ == -1)
					i_665_ = (byte) 2;
				if (i_667_ == -1) {
					if (i_665_ == 0) {
						int i_668_ = (((Class528_Sub2) this).aShortArray8604[i_664_] & 0xffff);
						int i_669_ = (((i_668_ & 0x7f) * ((Class528_Sub2) this).anInt8606) >> 7);
						short i_670_ = Class372.method6362(i_668_ & ~0x7f | i_669_, 1208101152);
						Class189 class189;
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8587[i_664_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8587[i_664_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8587[i_664_])]);
						int i_671_ = (((i * ((Class189) class189).anInt2380 + i_659_ * ((Class189) class189).anInt2381 + i_660_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16);
						int i_672_ = i_671_ > 256 ? i_662_ : i_663_;
						int i_673_ = (i_661_ >> 1) + (i_672_ * i_671_ >> 17);
						((Class528_Sub2) this).anIntArray8592[i_664_] = (i_673_ << 17 | Class282_Sub20_Sub2.method15076(i_670_, i_673_, -1317255909));
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8588[i_664_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8588[i_664_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8588[i_664_])]);
						i_671_ = ((i * ((Class189) class189).anInt2380 + i_659_ * ((Class189) class189).anInt2381 + i_660_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16;
						i_672_ = i_671_ > 256 ? i_662_ : i_663_;
						i_673_ = (i_661_ >> 1) + (i_672_ * i_671_ >> 17);
						((Class528_Sub2) this).anIntArray8631[i_664_] = (i_673_ << 17 | Class282_Sub20_Sub2.method15076(i_670_, i_673_, -1668701002));
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8642[i_664_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8642[i_664_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8642[i_664_])]);
						i_671_ = ((i * ((Class189) class189).anInt2380 + i_659_ * ((Class189) class189).anInt2381 + i_660_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16;
						i_672_ = i_671_ > 256 ? i_662_ : i_663_;
						i_673_ = (i_661_ >> 1) + (i_672_ * i_671_ >> 17);
						((Class528_Sub2) this).anIntArray8594[i_664_] = (i_673_ << 17 | Class282_Sub20_Sub2.method15076(i_670_, i_673_, -1787784988));
					} else if (i_665_ == 1) {
						int i_674_ = (((Class528_Sub2) this).aShortArray8604[i_664_] & 0xffff);
						int i_675_ = (((i_674_ & 0x7f) * ((Class528_Sub2) this).anInt8606) >> 7);
						short i_676_ = Class372.method6362(i_674_ & ~0x7f | i_675_, 658832160);
						Class195 class195 = (((Class528_Sub2) this).aClass195Array8599[i_664_]);
						int i_677_ = ((i * ((Class195) class195).anInt2410 + i_659_ * ((Class195) class195).anInt2411 + i_660_ * ((Class195) class195).anInt2412) >> 16);
						int i_678_ = i_677_ > 256 ? i_662_ : i_663_;
						int i_679_ = (i_661_ >> 1) + (i_678_ * i_677_ >> 17);
						((Class528_Sub2) this).anIntArray8592[i_664_] = (i_679_ << 17 | Class282_Sub20_Sub2.method15076(i_676_, i_679_, -1295522955));
						((Class528_Sub2) this).anIntArray8594[i_664_] = -1;
					} else if (i_665_ == 3) {
						((Class528_Sub2) this).anIntArray8592[i_664_] = 128;
						((Class528_Sub2) this).anIntArray8594[i_664_] = -1;
					} else
						((Class528_Sub2) this).anIntArray8594[i_664_] = -2;
				} else {
					int i_680_ = (((Class528_Sub2) this).aShortArray8604[i_664_] & 0xffff);
					if (i_665_ == 0) {
						Class189 class189;
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8587[i_664_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8587[i_664_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8587[i_664_])]);
						int i_681_ = (((i * ((Class189) class189).anInt2380 + i_659_ * ((Class189) class189).anInt2381 + i_660_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16);
						int i_682_ = i_681_ > 256 ? i_662_ : i_663_;
						int i_683_ = method13800((i_661_ >> 2) + (i_682_ * i_681_ >> 18));
						((Class528_Sub2) this).anIntArray8592[i_664_] = i_683_ << 24 | method13799(i_680_, i_667_, i_683_);
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8588[i_664_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8588[i_664_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8588[i_664_])]);
						i_681_ = ((i * ((Class189) class189).anInt2380 + i_659_ * ((Class189) class189).anInt2381 + i_660_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16;
						i_682_ = i_681_ > 256 ? i_662_ : i_663_;
						i_683_ = method13800((i_661_ >> 2) + (i_682_ * i_681_ >> 18));
						((Class528_Sub2) this).anIntArray8631[i_664_] = i_683_ << 24 | method13799(i_680_, i_667_, i_683_);
						if (((Class528_Sub2) this).aClass189Array8585 != null && (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8642[i_664_])]) != null)
							class189 = (((Class528_Sub2) this).aClass189Array8585[(((Class528_Sub2) this).aShortArray8642[i_664_])]);
						else
							class189 = (((Class528_Sub2) this).aClass189Array8584[(((Class528_Sub2) this).aShortArray8642[i_664_])]);
						i_681_ = ((i * ((Class189) class189).anInt2380 + i_659_ * ((Class189) class189).anInt2381 + i_660_ * ((Class189) class189).anInt2379) / ((Class189) class189).anInt2382) >> 16;
						i_682_ = i_681_ > 256 ? i_662_ : i_663_;
						i_683_ = method13800((i_661_ >> 2) + (i_682_ * i_681_ >> 18));
						((Class528_Sub2) this).anIntArray8594[i_664_] = i_683_ << 24 | method13799(i_680_, i_667_, i_683_);
					} else if (i_665_ == 1) {
						Class195 class195 = (((Class528_Sub2) this).aClass195Array8599[i_664_]);
						int i_684_ = ((i * ((Class195) class195).anInt2410 + i_659_ * ((Class195) class195).anInt2411 + i_660_ * ((Class195) class195).anInt2412) >> 16);
						int i_685_ = i_684_ > 256 ? i_662_ : i_663_;
						int i_686_ = method13800((i_661_ >> 2) + (i_685_ * i_684_ >> 18));
						((Class528_Sub2) this).anIntArray8592[i_664_] = i_686_ << 24 | method13799(i_680_, i_667_, i_686_);
						((Class528_Sub2) this).anIntArray8594[i_664_] = -1;
					} else
						((Class528_Sub2) this).anIntArray8594[i_664_] = -2;
				}
			}
			((Class528_Sub2) this).aClass189Array8584 = null;
			((Class528_Sub2) this).aClass189Array8585 = null;
			((Class528_Sub2) this).aClass195Array8599 = null;
			if ((((Class528_Sub2) this).anInt8575 & 0x97098) == 0 && ((Class528_Sub2) this).aFloatArrayArray8635 == null)
				((Class528_Sub2) this).aShortArray8604 = null;
			if (bool)
				((Class528_Sub2) this).aByteArray8600 = null;
			((Class528_Sub2) this).anInt8598 = 2;
		}
	}

	int method13834(int i, short i_687_, int i_688_) {
		int i_689_ = Class540.anIntArray7136[method13855(i, i_688_)];
		Class169 class169 = ((Class528_Sub2) this).aClass505_Sub3_8638.anInterface22_5834.method144(i_687_ & 0xffff, -1864931389);
		int i_690_ = class169.aByte2079 & 0xff;
		if (i_690_ != 0) {
			int i_691_ = 131586 * i_688_;
			if (i_690_ == 256)
				i_689_ = i_691_;
			else {
				int i_692_ = i_690_;
				int i_693_ = 256 - i_690_;
				i_689_ = ((((i_691_ & 0xff00ff) * i_692_ + (i_689_ & 0xff00ff) * i_693_) & ~0xff00ff) + (((i_691_ & 0xff00) * i_692_ + (i_689_ & 0xff00) * i_693_) & 0xff0000)) >> 8;
			}
		}
		int i_694_ = class169.aByte2080 & 0xff;
		if (i_694_ != 0) {
			i_694_ += 256;
			int i_695_ = ((i_689_ & 0xff0000) >> 16) * i_694_;
			if (i_695_ > 65535)
				i_695_ = 65535;
			int i_696_ = ((i_689_ & 0xff00) >> 8) * i_694_;
			if (i_696_ > 65535)
				i_696_ = 65535;
			int i_697_ = (i_689_ & 0xff) * i_694_;
			if (i_697_ > 65535)
				i_697_ = 65535;
			i_689_ = (i_695_ << 8 & 0xff0000) + (i_696_ & 0xff00) + (i_697_ >> 8);
		}
		return i_689_;
	}

	void bl(int i, int[] is, int i_698_, int i_699_, int i_700_, boolean bool, int i_701_, int[] is_702_) {
		int i_703_ = is.length;
		if (i == 0) {
			i_698_ <<= 4;
			i_699_ <<= 4;
			i_700_ <<= 4;
			if (!((Class528_Sub2) this).aBool8589) {
				for (int i_704_ = 0; i_704_ < ((Class528_Sub2) this).anInt8578; i_704_++) {
					((Class528_Sub2) this).anIntArray8580[i_704_] <<= 4;
					((Class528_Sub2) this).anIntArray8581[i_704_] <<= 4;
					((Class528_Sub2) this).anIntArray8610[i_704_] <<= 4;
				}
				((Class528_Sub2) this).aBool8589 = true;
			}
			int i_705_ = 0;
			((Class528_Sub2) this).anInt8611 = 0;
			((Class528_Sub2) this).anInt8607 = 0;
			((Class528_Sub2) this).anInt8613 = 0;
			for (int i_706_ = 0; i_706_ < i_703_; i_706_++) {
				int i_707_ = is[i_706_];
				if (i_707_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_708_ = ((Class528_Sub2) this).anIntArrayArray8568[i_707_];
					for (int i_709_ = 0; i_709_ < is_708_.length; i_709_++) {
						int i_710_ = is_708_[i_709_];
						if (((Class528_Sub2) this).aShortArray8569 == null || (i_701_ & (((Class528_Sub2) this).aShortArray8569[i_710_])) != 0) {
							((Class528_Sub2) this).anInt8611 += (((Class528_Sub2) this).anIntArray8580[i_710_]);
							((Class528_Sub2) this).anInt8607 += (((Class528_Sub2) this).anIntArray8581[i_710_]);
							((Class528_Sub2) this).anInt8613 += (((Class528_Sub2) this).anIntArray8610[i_710_]);
							i_705_++;
						}
					}
				}
			}
			if (i_705_ > 0) {
				((Class528_Sub2) this).anInt8611 = ((Class528_Sub2) this).anInt8611 / i_705_ + i_698_;
				((Class528_Sub2) this).anInt8607 = ((Class528_Sub2) this).anInt8607 / i_705_ + i_699_;
				((Class528_Sub2) this).anInt8613 = ((Class528_Sub2) this).anInt8613 / i_705_ + i_700_;
				((Class528_Sub2) this).aBool8614 = true;
			} else {
				((Class528_Sub2) this).anInt8611 = i_698_;
				((Class528_Sub2) this).anInt8607 = i_699_;
				((Class528_Sub2) this).anInt8613 = i_700_;
			}
		} else if (i == 1) {
			if (is_702_ != null) {
				int i_711_ = ((is_702_[0] * i_698_ + is_702_[1] * i_699_ + is_702_[2] * i_700_ + 8192) >> 14);
				int i_712_ = ((is_702_[3] * i_698_ + is_702_[4] * i_699_ + is_702_[5] * i_700_ + 8192) >> 14);
				int i_713_ = ((is_702_[6] * i_698_ + is_702_[7] * i_699_ + is_702_[8] * i_700_ + 8192) >> 14);
				i_698_ = i_711_;
				i_699_ = i_712_;
				i_700_ = i_713_;
			}
			i_698_ <<= 4;
			i_699_ <<= 4;
			i_700_ <<= 4;
			if (!((Class528_Sub2) this).aBool8589) {
				for (int i_714_ = 0; i_714_ < ((Class528_Sub2) this).anInt8578; i_714_++) {
					((Class528_Sub2) this).anIntArray8580[i_714_] <<= 4;
					((Class528_Sub2) this).anIntArray8581[i_714_] <<= 4;
					((Class528_Sub2) this).anIntArray8610[i_714_] <<= 4;
				}
				((Class528_Sub2) this).aBool8589 = true;
			}
			for (int i_715_ = 0; i_715_ < i_703_; i_715_++) {
				int i_716_ = is[i_715_];
				if (i_716_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_717_ = ((Class528_Sub2) this).anIntArrayArray8568[i_716_];
					for (int i_718_ = 0; i_718_ < is_717_.length; i_718_++) {
						int i_719_ = is_717_[i_718_];
						if (((Class528_Sub2) this).aShortArray8569 == null || (i_701_ & (((Class528_Sub2) this).aShortArray8569[i_719_])) != 0) {
							((Class528_Sub2) this).anIntArray8580[i_719_] += i_698_;
							((Class528_Sub2) this).anIntArray8581[i_719_] += i_699_;
							((Class528_Sub2) this).anIntArray8610[i_719_] += i_700_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_702_ != null) {
				if (!((Class528_Sub2) this).aBool8589) {
					for (int i_720_ = 0; i_720_ < ((Class528_Sub2) this).anInt8578; i_720_++) {
						((Class528_Sub2) this).anIntArray8580[i_720_] <<= 4;
						((Class528_Sub2) this).anIntArray8581[i_720_] <<= 4;
						((Class528_Sub2) this).anIntArray8610[i_720_] <<= 4;
					}
					((Class528_Sub2) this).aBool8589 = true;
				}
				int i_721_ = is_702_[9] << 4;
				int i_722_ = is_702_[10] << 4;
				int i_723_ = is_702_[11] << 4;
				int i_724_ = is_702_[12] << 4;
				int i_725_ = is_702_[13] << 4;
				int i_726_ = is_702_[14] << 4;
				if (((Class528_Sub2) this).aBool8614) {
					int i_727_ = ((is_702_[0] * ((Class528_Sub2) this).anInt8611 + is_702_[3] * ((Class528_Sub2) this).anInt8607 + is_702_[6] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					int i_728_ = ((is_702_[1] * ((Class528_Sub2) this).anInt8611 + is_702_[4] * ((Class528_Sub2) this).anInt8607 + is_702_[7] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					int i_729_ = ((is_702_[2] * ((Class528_Sub2) this).anInt8611 + is_702_[5] * ((Class528_Sub2) this).anInt8607 + is_702_[8] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					i_727_ += i_724_;
					i_728_ += i_725_;
					i_729_ += i_726_;
					((Class528_Sub2) this).anInt8611 = i_727_;
					((Class528_Sub2) this).anInt8607 = i_728_;
					((Class528_Sub2) this).anInt8613 = i_729_;
					((Class528_Sub2) this).aBool8614 = false;
				}
				int[] is_730_ = new int[9];
				int i_731_ = Class382.anIntArray4661[i_698_];
				int i_732_ = Class382.anIntArray4657[i_698_];
				int i_733_ = Class382.anIntArray4661[i_699_];
				int i_734_ = Class382.anIntArray4657[i_699_];
				int i_735_ = Class382.anIntArray4661[i_700_];
				int i_736_ = Class382.anIntArray4657[i_700_];
				int i_737_ = i_732_ * i_735_ + 8192 >> 14;
				int i_738_ = i_732_ * i_736_ + 8192 >> 14;
				is_730_[0] = i_733_ * i_735_ + i_734_ * i_738_ + 8192 >> 14;
				is_730_[1] = -i_733_ * i_736_ + i_734_ * i_737_ + 8192 >> 14;
				is_730_[2] = i_734_ * i_731_ + 8192 >> 14;
				is_730_[3] = i_731_ * i_736_ + 8192 >> 14;
				is_730_[4] = i_731_ * i_735_ + 8192 >> 14;
				is_730_[5] = -i_732_;
				is_730_[6] = -i_734_ * i_735_ + i_733_ * i_738_ + 8192 >> 14;
				is_730_[7] = i_734_ * i_736_ + i_733_ * i_737_ + 8192 >> 14;
				is_730_[8] = i_733_ * i_731_ + 8192 >> 14;
				int i_739_ = ((is_730_[0] * -((Class528_Sub2) this).anInt8611 + is_730_[1] * -((Class528_Sub2) this).anInt8607 + is_730_[2] * -((Class528_Sub2) this).anInt8613 + 8192) >> 14);
				int i_740_ = ((is_730_[3] * -((Class528_Sub2) this).anInt8611 + is_730_[4] * -((Class528_Sub2) this).anInt8607 + is_730_[5] * -((Class528_Sub2) this).anInt8613 + 8192) >> 14);
				int i_741_ = ((is_730_[6] * -((Class528_Sub2) this).anInt8611 + is_730_[7] * -((Class528_Sub2) this).anInt8607 + is_730_[8] * -((Class528_Sub2) this).anInt8613 + 8192) >> 14);
				int i_742_ = i_739_ + ((Class528_Sub2) this).anInt8611;
				int i_743_ = i_740_ + ((Class528_Sub2) this).anInt8607;
				int i_744_ = i_741_ + ((Class528_Sub2) this).anInt8613;
				int[] is_745_ = new int[9];
				for (int i_746_ = 0; i_746_ < 3; i_746_++) {
					for (int i_747_ = 0; i_747_ < 3; i_747_++) {
						int i_748_ = 0;
						for (int i_749_ = 0; i_749_ < 3; i_749_++)
							i_748_ += (is_730_[i_746_ * 3 + i_749_] * is_702_[i_747_ * 3 + i_749_]);
						is_745_[i_746_ * 3 + i_747_] = i_748_ + 8192 >> 14;
					}
				}
				int i_750_ = ((is_730_[0] * i_724_ + is_730_[1] * i_725_ + is_730_[2] * i_726_ + 8192) >> 14);
				int i_751_ = ((is_730_[3] * i_724_ + is_730_[4] * i_725_ + is_730_[5] * i_726_ + 8192) >> 14);
				int i_752_ = ((is_730_[6] * i_724_ + is_730_[7] * i_725_ + is_730_[8] * i_726_ + 8192) >> 14);
				i_750_ += i_742_;
				i_751_ += i_743_;
				i_752_ += i_744_;
				int[] is_753_ = new int[9];
				for (int i_754_ = 0; i_754_ < 3; i_754_++) {
					for (int i_755_ = 0; i_755_ < 3; i_755_++) {
						int i_756_ = 0;
						for (int i_757_ = 0; i_757_ < 3; i_757_++)
							i_756_ += (is_702_[i_754_ * 3 + i_757_] * is_745_[i_755_ + i_757_ * 3]);
						is_753_[i_754_ * 3 + i_755_] = i_756_ + 8192 >> 14;
					}
				}
				int i_758_ = ((is_702_[0] * i_750_ + is_702_[1] * i_751_ + is_702_[2] * i_752_ + 8192) >> 14);
				int i_759_ = ((is_702_[3] * i_750_ + is_702_[4] * i_751_ + is_702_[5] * i_752_ + 8192) >> 14);
				int i_760_ = ((is_702_[6] * i_750_ + is_702_[7] * i_751_ + is_702_[8] * i_752_ + 8192) >> 14);
				i_758_ += i_721_;
				i_759_ += i_722_;
				i_760_ += i_723_;
				for (int i_761_ = 0; i_761_ < i_703_; i_761_++) {
					int i_762_ = is[i_761_];
					if (i_762_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
						int[] is_763_ = (((Class528_Sub2) this).anIntArrayArray8568[i_762_]);
						for (int i_764_ = 0; i_764_ < is_763_.length; i_764_++) {
							int i_765_ = is_763_[i_764_];
							if (((Class528_Sub2) this).aShortArray8569 == null || ((i_701_ & (((Class528_Sub2) this).aShortArray8569[i_765_])) != 0)) {
								int i_766_ = (is_753_[0] * (((Class528_Sub2) this).anIntArray8580[i_765_]) + is_753_[1] * (((Class528_Sub2) this).anIntArray8581[i_765_]) + is_753_[2] * (((Class528_Sub2) this).anIntArray8610[i_765_]) + 8192) >> 14;
								int i_767_ = (is_753_[3] * (((Class528_Sub2) this).anIntArray8580[i_765_]) + is_753_[4] * (((Class528_Sub2) this).anIntArray8581[i_765_]) + is_753_[5] * (((Class528_Sub2) this).anIntArray8610[i_765_]) + 8192) >> 14;
								int i_768_ = (is_753_[6] * (((Class528_Sub2) this).anIntArray8580[i_765_]) + is_753_[7] * (((Class528_Sub2) this).anIntArray8581[i_765_]) + is_753_[8] * (((Class528_Sub2) this).anIntArray8610[i_765_]) + 8192) >> 14;
								i_766_ += i_758_;
								i_767_ += i_759_;
								i_768_ += i_760_;
								((Class528_Sub2) this).anIntArray8580[i_765_] = i_766_;
								((Class528_Sub2) this).anIntArray8581[i_765_] = i_767_;
								((Class528_Sub2) this).anIntArray8610[i_765_] = i_768_;
							}
						}
					}
				}
			} else {
				for (int i_769_ = 0; i_769_ < i_703_; i_769_++) {
					int i_770_ = is[i_769_];
					if (i_770_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
						int[] is_771_ = (((Class528_Sub2) this).anIntArrayArray8568[i_770_]);
						for (int i_772_ = 0; i_772_ < is_771_.length; i_772_++) {
							int i_773_ = is_771_[i_772_];
							if (((Class528_Sub2) this).aShortArray8569 == null || ((i_701_ & (((Class528_Sub2) this).aShortArray8569[i_773_])) != 0)) {
								((Class528_Sub2) this).anIntArray8580[i_773_] -= ((Class528_Sub2) this).anInt8611;
								((Class528_Sub2) this).anIntArray8581[i_773_] -= ((Class528_Sub2) this).anInt8607;
								((Class528_Sub2) this).anIntArray8610[i_773_] -= ((Class528_Sub2) this).anInt8613;
								if (i_700_ != 0) {
									int i_774_ = Class382.anIntArray4657[i_700_];
									int i_775_ = Class382.anIntArray4661[i_700_];
									int i_776_ = ((((Class528_Sub2) this).anIntArray8581[i_773_]) * i_774_ + (((Class528_Sub2) this).anIntArray8580[i_773_]) * i_775_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8581[i_773_] = ((((Class528_Sub2) this).anIntArray8581[i_773_]) * i_775_ - (((Class528_Sub2) this).anIntArray8580[i_773_]) * i_774_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8580[i_773_] = i_776_;
								}
								if (i_698_ != 0) {
									int i_777_ = Class382.anIntArray4657[i_698_];
									int i_778_ = Class382.anIntArray4661[i_698_];
									int i_779_ = ((((Class528_Sub2) this).anIntArray8581[i_773_]) * i_778_ - (((Class528_Sub2) this).anIntArray8610[i_773_]) * i_777_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8610[i_773_] = ((((Class528_Sub2) this).anIntArray8581[i_773_]) * i_777_ + (((Class528_Sub2) this).anIntArray8610[i_773_]) * i_778_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8581[i_773_] = i_779_;
								}
								if (i_699_ != 0) {
									int i_780_ = Class382.anIntArray4657[i_699_];
									int i_781_ = Class382.anIntArray4661[i_699_];
									int i_782_ = ((((Class528_Sub2) this).anIntArray8610[i_773_]) * i_780_ + (((Class528_Sub2) this).anIntArray8580[i_773_]) * i_781_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8610[i_773_] = ((((Class528_Sub2) this).anIntArray8610[i_773_]) * i_781_ - (((Class528_Sub2) this).anIntArray8580[i_773_]) * i_780_ + 16383) >> 14;
									((Class528_Sub2) this).anIntArray8580[i_773_] = i_782_;
								}
								((Class528_Sub2) this).anIntArray8580[i_773_] += ((Class528_Sub2) this).anInt8611;
								((Class528_Sub2) this).anIntArray8581[i_773_] += ((Class528_Sub2) this).anInt8607;
								((Class528_Sub2) this).anIntArray8610[i_773_] += ((Class528_Sub2) this).anInt8613;
							}
						}
					}
				}
			}
		} else if (i == 3) {
			if (is_702_ != null) {
				if (!((Class528_Sub2) this).aBool8589) {
					for (int i_783_ = 0; i_783_ < ((Class528_Sub2) this).anInt8578; i_783_++) {
						((Class528_Sub2) this).anIntArray8580[i_783_] <<= 4;
						((Class528_Sub2) this).anIntArray8581[i_783_] <<= 4;
						((Class528_Sub2) this).anIntArray8610[i_783_] <<= 4;
					}
					((Class528_Sub2) this).aBool8589 = true;
				}
				int i_784_ = is_702_[9] << 4;
				int i_785_ = is_702_[10] << 4;
				int i_786_ = is_702_[11] << 4;
				int i_787_ = is_702_[12] << 4;
				int i_788_ = is_702_[13] << 4;
				int i_789_ = is_702_[14] << 4;
				if (((Class528_Sub2) this).aBool8614) {
					int i_790_ = ((is_702_[0] * ((Class528_Sub2) this).anInt8611 + is_702_[3] * ((Class528_Sub2) this).anInt8607 + is_702_[6] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					int i_791_ = ((is_702_[1] * ((Class528_Sub2) this).anInt8611 + is_702_[4] * ((Class528_Sub2) this).anInt8607 + is_702_[7] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					int i_792_ = ((is_702_[2] * ((Class528_Sub2) this).anInt8611 + is_702_[5] * ((Class528_Sub2) this).anInt8607 + is_702_[8] * ((Class528_Sub2) this).anInt8613 + 8192) >> 14);
					i_790_ += i_787_;
					i_791_ += i_788_;
					i_792_ += i_789_;
					((Class528_Sub2) this).anInt8611 = i_790_;
					((Class528_Sub2) this).anInt8607 = i_791_;
					((Class528_Sub2) this).anInt8613 = i_792_;
					((Class528_Sub2) this).aBool8614 = false;
				}
				int i_793_ = i_698_ << 15 >> 7;
				int i_794_ = i_699_ << 15 >> 7;
				int i_795_ = i_700_ << 15 >> 7;
				int i_796_ = i_793_ * -((Class528_Sub2) this).anInt8611 + 8192 >> 14;
				int i_797_ = i_794_ * -((Class528_Sub2) this).anInt8607 + 8192 >> 14;
				int i_798_ = i_795_ * -((Class528_Sub2) this).anInt8613 + 8192 >> 14;
				int i_799_ = i_796_ + ((Class528_Sub2) this).anInt8611;
				int i_800_ = i_797_ + ((Class528_Sub2) this).anInt8607;
				int i_801_ = i_798_ + ((Class528_Sub2) this).anInt8613;
				int[] is_802_ = new int[9];
				is_802_[0] = i_793_ * is_702_[0] + 8192 >> 14;
				is_802_[1] = i_793_ * is_702_[3] + 8192 >> 14;
				is_802_[2] = i_793_ * is_702_[6] + 8192 >> 14;
				is_802_[3] = i_794_ * is_702_[1] + 8192 >> 14;
				is_802_[4] = i_794_ * is_702_[4] + 8192 >> 14;
				is_802_[5] = i_794_ * is_702_[7] + 8192 >> 14;
				is_802_[6] = i_795_ * is_702_[2] + 8192 >> 14;
				is_802_[7] = i_795_ * is_702_[5] + 8192 >> 14;
				is_802_[8] = i_795_ * is_702_[8] + 8192 >> 14;
				int i_803_ = i_793_ * i_787_ + 8192 >> 14;
				int i_804_ = i_794_ * i_788_ + 8192 >> 14;
				int i_805_ = i_795_ * i_789_ + 8192 >> 14;
				i_803_ += i_799_;
				i_804_ += i_800_;
				i_805_ += i_801_;
				int[] is_806_ = new int[9];
				for (int i_807_ = 0; i_807_ < 3; i_807_++) {
					for (int i_808_ = 0; i_808_ < 3; i_808_++) {
						int i_809_ = 0;
						for (int i_810_ = 0; i_810_ < 3; i_810_++)
							i_809_ += (is_702_[i_807_ * 3 + i_810_] * is_802_[i_808_ + i_810_ * 3]);
						is_806_[i_807_ * 3 + i_808_] = i_809_ + 8192 >> 14;
					}
				}
				int i_811_ = ((is_702_[0] * i_803_ + is_702_[1] * i_804_ + is_702_[2] * i_805_ + 8192) >> 14);
				int i_812_ = ((is_702_[3] * i_803_ + is_702_[4] * i_804_ + is_702_[5] * i_805_ + 8192) >> 14);
				int i_813_ = ((is_702_[6] * i_803_ + is_702_[7] * i_804_ + is_702_[8] * i_805_ + 8192) >> 14);
				i_811_ += i_784_;
				i_812_ += i_785_;
				i_813_ += i_786_;
				for (int i_814_ = 0; i_814_ < i_703_; i_814_++) {
					int i_815_ = is[i_814_];
					if (i_815_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
						int[] is_816_ = (((Class528_Sub2) this).anIntArrayArray8568[i_815_]);
						for (int i_817_ = 0; i_817_ < is_816_.length; i_817_++) {
							int i_818_ = is_816_[i_817_];
							if (((Class528_Sub2) this).aShortArray8569 == null || ((i_701_ & (((Class528_Sub2) this).aShortArray8569[i_818_])) != 0)) {
								int i_819_ = (is_806_[0] * (((Class528_Sub2) this).anIntArray8580[i_818_]) + is_806_[1] * (((Class528_Sub2) this).anIntArray8581[i_818_]) + is_806_[2] * (((Class528_Sub2) this).anIntArray8610[i_818_]) + 8192) >> 14;
								int i_820_ = (is_806_[3] * (((Class528_Sub2) this).anIntArray8580[i_818_]) + is_806_[4] * (((Class528_Sub2) this).anIntArray8581[i_818_]) + is_806_[5] * (((Class528_Sub2) this).anIntArray8610[i_818_]) + 8192) >> 14;
								int i_821_ = (is_806_[6] * (((Class528_Sub2) this).anIntArray8580[i_818_]) + is_806_[7] * (((Class528_Sub2) this).anIntArray8581[i_818_]) + is_806_[8] * (((Class528_Sub2) this).anIntArray8610[i_818_]) + 8192) >> 14;
								i_819_ += i_811_;
								i_820_ += i_812_;
								i_821_ += i_813_;
								((Class528_Sub2) this).anIntArray8580[i_818_] = i_819_;
								((Class528_Sub2) this).anIntArray8581[i_818_] = i_820_;
								((Class528_Sub2) this).anIntArray8610[i_818_] = i_821_;
							}
						}
					}
				}
			} else {
				for (int i_822_ = 0; i_822_ < i_703_; i_822_++) {
					int i_823_ = is[i_822_];
					if (i_823_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
						int[] is_824_ = (((Class528_Sub2) this).anIntArrayArray8568[i_823_]);
						for (int i_825_ = 0; i_825_ < is_824_.length; i_825_++) {
							int i_826_ = is_824_[i_825_];
							if (((Class528_Sub2) this).aShortArray8569 == null || ((i_701_ & (((Class528_Sub2) this).aShortArray8569[i_826_])) != 0)) {
								((Class528_Sub2) this).anIntArray8580[i_826_] -= ((Class528_Sub2) this).anInt8611;
								((Class528_Sub2) this).anIntArray8581[i_826_] -= ((Class528_Sub2) this).anInt8607;
								((Class528_Sub2) this).anIntArray8610[i_826_] -= ((Class528_Sub2) this).anInt8613;
								((Class528_Sub2) this).anIntArray8580[i_826_] = (((Class528_Sub2) this).anIntArray8580[i_826_]) * i_698_ / 128;
								((Class528_Sub2) this).anIntArray8581[i_826_] = (((Class528_Sub2) this).anIntArray8581[i_826_]) * i_699_ / 128;
								((Class528_Sub2) this).anIntArray8610[i_826_] = (((Class528_Sub2) this).anIntArray8610[i_826_]) * i_700_ / 128;
								((Class528_Sub2) this).anIntArray8580[i_826_] += ((Class528_Sub2) this).anInt8611;
								((Class528_Sub2) this).anIntArray8581[i_826_] += ((Class528_Sub2) this).anInt8607;
								((Class528_Sub2) this).anIntArray8610[i_826_] += ((Class528_Sub2) this).anInt8613;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub2) this).anIntArrayArray8608 != null && ((Class528_Sub2) this).aByteArray8602 != null) {
				for (int i_827_ = 0; i_827_ < i_703_; i_827_++) {
					int i_828_ = is[i_827_];
					if (i_828_ < ((Class528_Sub2) this).anIntArrayArray8608.length) {
						int[] is_829_ = (((Class528_Sub2) this).anIntArrayArray8608[i_828_]);
						for (int i_830_ = 0; i_830_ < is_829_.length; i_830_++) {
							int i_831_ = is_829_[i_830_];
							if (((Class528_Sub2) this).aShortArray8632 == null || ((i_701_ & (((Class528_Sub2) this).aShortArray8632[i_831_])) != 0)) {
								int i_832_ = (((((Class528_Sub2) this).aByteArray8602[i_831_]) & 0xff) + i_698_ * 8);
								if (i_832_ < 0)
									i_832_ = 0;
								else if (i_832_ > 255)
									i_832_ = 255;
								((Class528_Sub2) this).aByteArray8602[i_831_] = (byte) i_832_;
							}
						}
					}
				}
				if (((Class528_Sub2) this).aClass193Array8618 != null) {
					for (int i_833_ = 0; i_833_ < ((Class528_Sub2) this).anInt8617; i_833_++) {
						Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_833_]);
						Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_833_]);
						((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & 0xffffff) | 255 - ((((Class528_Sub2) this).aByteArray8602[(((Class193) class193).anInt2393 * 142270897)]) & 0xff) << 24) * -1022818925;
					}
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub2) this).anIntArrayArray8608 != null) {
				for (int i_834_ = 0; i_834_ < i_703_; i_834_++) {
					int i_835_ = is[i_834_];
					if (i_835_ < ((Class528_Sub2) this).anIntArrayArray8608.length) {
						int[] is_836_ = (((Class528_Sub2) this).anIntArrayArray8608[i_835_]);
						for (int i_837_ = 0; i_837_ < is_836_.length; i_837_++) {
							int i_838_ = is_836_[i_837_];
							if (((Class528_Sub2) this).aShortArray8632 == null || ((i_701_ & (((Class528_Sub2) this).aShortArray8632[i_838_])) != 0)) {
								int i_839_ = ((((Class528_Sub2) this).aShortArray8604[i_838_]) & 0xffff);
								int i_840_ = i_839_ >> 10 & 0x3f;
								int i_841_ = i_839_ >> 7 & 0x7;
								int i_842_ = i_839_ & 0x7f;
								i_840_ = i_840_ + i_698_ & 0x3f;
								i_841_ += i_699_;
								if (i_841_ < 0)
									i_841_ = 0;
								else if (i_841_ > 7)
									i_841_ = 7;
								i_842_ += i_700_;
								if (i_842_ < 0)
									i_842_ = 0;
								else if (i_842_ > 127)
									i_842_ = 127;
								((Class528_Sub2) this).aShortArray8604[i_838_] = (short) (i_840_ << 10 | i_841_ << 7 | i_842_);
							}
						}
						((Class528_Sub2) this).aBool8609 = true;
					}
				}
				if (((Class528_Sub2) this).aClass193Array8618 != null) {
					for (int i_843_ = 0; i_843_ < ((Class528_Sub2) this).anInt8617; i_843_++) {
						Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_843_]);
						Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_843_]);
						((Class176) class176).anInt2199 = (((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | (Class335.anIntArray3916[(Class372.method6362((((Class528_Sub2) this).aShortArray8604[(((Class193) class193).anInt2393 * 142270897)]) & 0xffff, 1376089110)) & 0xffff]) & 0xffffff) * -1022818925);
					}
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_844_ = 0; i_844_ < i_703_; i_844_++) {
					int i_845_ = is[i_844_];
					if (i_845_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_846_ = (((Class528_Sub2) this).anIntArrayArray8620[i_845_]);
						for (int i_847_ = 0; i_847_ < is_846_.length; i_847_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_846_[i_847_]]);
							((Class176) class176).anInt2192 += i_698_ * -943685543;
							((Class176) class176).anInt2189 += i_699_ * 1414070385;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_848_ = 0; i_848_ < i_703_; i_848_++) {
					int i_849_ = is[i_848_];
					if (i_849_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_850_ = (((Class528_Sub2) this).anIntArrayArray8620[i_849_]);
						for (int i_851_ = 0; i_851_ < is_850_.length; i_851_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_850_[i_851_]]);
							((Class176) class176).aFloat2190 = (((Class176) class176).aFloat2190 * (float) i_698_ / 128.0F);
							((Class176) class176).aFloat2191 = (((Class176) class176).aFloat2191 * (float) i_699_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_852_ = 0; i_852_ < i_703_; i_852_++) {
					int i_853_ = is[i_852_];
					if (i_853_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_854_ = (((Class528_Sub2) this).anIntArrayArray8620[i_853_]);
						for (int i_855_ = 0; i_855_ < is_854_.length; i_855_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_854_[i_855_]]);
							((Class176) class176).anInt2194 = ((((Class176) class176).anInt2194 * 156323613 + i_698_) & 0x3fff) * 2076699445;
						}
					}
				}
			}
		}
	}

	int method13835(int i, int i_856_) {
		i_856_ = i_856_ * (i & 0x7f) >> 7;
		if (i_856_ < 2)
			i_856_ = 2;
		else if (i_856_ > 126)
			i_856_ = 126;
		return (i & 0xff80) + i_856_;
	}

	int method13836(int i, int i_857_) {
		i_857_ = i_857_ * (i & 0x7f) >> 7;
		if (i_857_ < 2)
			i_857_ = 2;
		else if (i_857_ > 126)
			i_857_ = 126;
		return (i & 0xff80) + i_857_;
	}

	int method13837(int i) {
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		return i;
	}

	public int ca() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8570;
	}

	void method13838() {
		if (((Class528_Sub2) this).anInt8598 == 0)
			method13853(false);
		else if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				method13802();
			}
		} else
			method13802();
	}

	void method13839() {
		if (((Class528_Sub2) this).anInt8598 == 0)
			method13853(false);
		else if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				method13802();
			}
		} else
			method13802();
	}

	public void cr(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x2000) != 8192)
			throw new IllegalStateException();
		((Class528_Sub2) this).anInt8577 = i;
		((Class528_Sub2) this).anInt8598 = 0;
	}

	public void method11299(MeshRasterizer class528, int i, int i_858_, int i_859_, boolean bool) {
		Class528_Sub2 class528_sub2_860_ = (Class528_Sub2) class528;
		if ((((Class528_Sub2) this).anInt8575 & 0x10000) != 65536)
			throw new IllegalStateException("");
		if ((((Class528_Sub2) class528_sub2_860_).anInt8575 & 0x10000) != 65536)
			throw new IllegalStateException("");
		method13795(((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread()));
		method13876();
		method13877();
		class528_sub2_860_.method13876();
		class528_sub2_860_.method13877();
		anInt8612++;
		int i_861_ = 0;
		int[] is = ((Class528_Sub2) class528_sub2_860_).anIntArray8580;
		int i_862_ = ((Class528_Sub2) class528_sub2_860_).anInt8579;
		for (int i_863_ = 0; i_863_ < ((Class528_Sub2) this).anInt8579; i_863_++) {
			Class189 class189 = ((Class528_Sub2) this).aClass189Array8584[i_863_];
			if (((Class189) class189).anInt2382 != 0) {
				int i_864_ = ((Class528_Sub2) this).anIntArray8581[i_863_] - i_858_;
				if (i_864_ >= ((Class528_Sub2) class528_sub2_860_).aShort8570 && (i_864_ <= ((Class528_Sub2) class528_sub2_860_).aShort8625)) {
					int i_865_ = ((Class528_Sub2) this).anIntArray8580[i_863_] - i;
					if ((i_865_ >= ((Class528_Sub2) class528_sub2_860_).aShort8634) && i_865_ <= (((Class528_Sub2) class528_sub2_860_).aShort8627)) {
						int i_866_ = (((Class528_Sub2) this).anIntArray8610[i_863_] - i_859_);
						if (i_866_ >= (((Class528_Sub2) class528_sub2_860_).aShort8571) && i_866_ <= (((Class528_Sub2) class528_sub2_860_).aShort8629)) {
							for (int i_867_ = 0; i_867_ < i_862_; i_867_++) {
								Class189 class189_868_ = (((Class528_Sub2) class528_sub2_860_).aClass189Array8584[i_867_]);
								if (i_865_ == is[i_867_] && i_866_ == (((Class528_Sub2) class528_sub2_860_).anIntArray8610[i_867_]) && i_864_ == (((Class528_Sub2) class528_sub2_860_).anIntArray8581[i_867_]) && (((Class189) class189_868_).anInt2382 != 0)) {
									if ((((Class528_Sub2) this).aClass189Array8585) == null)
										((Class528_Sub2) this).aClass189Array8585 = new Class189[((Class528_Sub2) this).anInt8579];
									if ((((Class528_Sub2) class528_sub2_860_).aClass189Array8585) == null)
										((Class528_Sub2) class528_sub2_860_).aClass189Array8585 = new Class189[i_862_];
									Class189 class189_869_ = (((Class528_Sub2) this).aClass189Array8585[i_863_]);
									if (class189_869_ == null)
										class189_869_ = ((Class528_Sub2) this).aClass189Array8585[i_863_] = new Class189(class189);
									Class189 class189_870_ = (((Class528_Sub2) class528_sub2_860_).aClass189Array8585[i_867_]);
									if (class189_870_ == null)
										class189_870_ = ((Class528_Sub2) class528_sub2_860_).aClass189Array8585[i_867_] = new Class189(class189_868_);
									((Class189) class189_869_).anInt2380 += (((Class189) class189_868_).anInt2380);
									((Class189) class189_869_).anInt2381 += (((Class189) class189_868_).anInt2381);
									((Class189) class189_869_).anInt2379 += (((Class189) class189_868_).anInt2379);
									((Class189) class189_869_).anInt2382 += (((Class189) class189_868_).anInt2382);
									((Class189) class189_870_).anInt2380 += ((Class189) class189).anInt2380;
									((Class189) class189_870_).anInt2381 += ((Class189) class189).anInt2381;
									((Class189) class189_870_).anInt2379 += ((Class189) class189).anInt2379;
									((Class189) class189_870_).anInt2382 += ((Class189) class189).anInt2382;
									i_861_++;
									((Class528_Sub2) this).anIntArray8567[i_863_] = anInt8612;
									((Class528_Sub2) this).anIntArray8619[i_867_] = anInt8612;
								}
							}
						}
					}
				}
			}
		}
		if (i_861_ >= 3 && bool) {
			for (int i_871_ = 0; i_871_ < ((Class528_Sub2) this).anInt8586; i_871_++) {
				if (((((Class528_Sub2) this).anIntArray8567[((Class528_Sub2) this).aShortArray8587[i_871_]]) == anInt8612) && ((((Class528_Sub2) this).anIntArray8567[((Class528_Sub2) this).aShortArray8588[i_871_]]) == anInt8612) && ((((Class528_Sub2) this).anIntArray8567[((Class528_Sub2) this).aShortArray8642[i_871_]]) == anInt8612)) {
					if (((Class528_Sub2) this).aByteArray8600 == null)
						((Class528_Sub2) this).aByteArray8600 = new byte[((Class528_Sub2) this).anInt8586];
					((Class528_Sub2) this).aByteArray8600[i_871_] = (byte) 2;
				}
			}
			for (int i_872_ = 0; i_872_ < ((Class528_Sub2) class528_sub2_860_).anInt8586; i_872_++) {
				if ((((Class528_Sub2) this).anIntArray8619[(((Class528_Sub2) class528_sub2_860_).aShortArray8587[i_872_])]) == anInt8612 && (((Class528_Sub2) this).anIntArray8619[(((Class528_Sub2) class528_sub2_860_).aShortArray8588[i_872_])]) == anInt8612 && (((Class528_Sub2) this).anIntArray8619[(((Class528_Sub2) class528_sub2_860_).aShortArray8642[i_872_])]) == anInt8612) {
					if (((Class528_Sub2) class528_sub2_860_).aByteArray8600 == null)
						((Class528_Sub2) class528_sub2_860_).aByteArray8600 = new byte[(((Class528_Sub2) class528_sub2_860_).anInt8586)];
					((Class528_Sub2) class528_sub2_860_).aByteArray8600[i_872_] = (byte) 2;
				}
			}
		}
	}

	public int dg() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8574;
	}

	public MeshRasterizer method11277(byte i, int i_873_, boolean bool) {
		method13796(Thread.currentThread());
		boolean bool_874_ = false;
		Class528_Sub2 class528_sub2_875_;
		Class528_Sub2 class528_sub2_876_;
		if (i > 0 && i <= 7) {
			class528_sub2_876_ = ((Class528_Sub2) this).aClass528_Sub2Array8645[i - 1];
			class528_sub2_875_ = ((Class528_Sub2) this).aClass528_Sub2Array8626[i - 1];
			bool_874_ = true;
		} else
			class528_sub2_875_ = class528_sub2_876_ = new Class528_Sub2(((Class528_Sub2) this).aClass505_Sub3_8638);
		return method13804(class528_sub2_875_, class528_sub2_876_, i_873_, bool_874_, bool);
	}

	public MeshRasterizer method11278(byte i, int i_877_, boolean bool) {
		method13796(Thread.currentThread());
		boolean bool_878_ = false;
		Class528_Sub2 class528_sub2_879_;
		Class528_Sub2 class528_sub2_880_;
		if (i > 0 && i <= 7) {
			class528_sub2_880_ = ((Class528_Sub2) this).aClass528_Sub2Array8645[i - 1];
			class528_sub2_879_ = ((Class528_Sub2) this).aClass528_Sub2Array8626[i - 1];
			bool_878_ = true;
		} else
			class528_sub2_879_ = class528_sub2_880_ = new Class528_Sub2(((Class528_Sub2) this).aClass505_Sub3_8638);
		return method13804(class528_sub2_879_, class528_sub2_880_, i_877_, bool_878_, bool);
	}

	public MeshRasterizer method11279(byte i, int i_881_, boolean bool) {
		method13796(Thread.currentThread());
		boolean bool_882_ = false;
		Class528_Sub2 class528_sub2_883_;
		Class528_Sub2 class528_sub2_884_;
		if (i > 0 && i <= 7) {
			class528_sub2_884_ = ((Class528_Sub2) this).aClass528_Sub2Array8645[i - 1];
			class528_sub2_883_ = ((Class528_Sub2) this).aClass528_Sub2Array8626[i - 1];
			bool_882_ = true;
		} else
			class528_sub2_883_ = class528_sub2_884_ = new Class528_Sub2(((Class528_Sub2) this).aClass505_Sub3_8638);
		return method13804(class528_sub2_883_, class528_sub2_884_, i_881_, bool_882_, bool);
	}

	public MeshRasterizer method11296(byte i, int i_885_, boolean bool) {
		method13796(Thread.currentThread());
		boolean bool_886_ = false;
		Class528_Sub2 class528_sub2_887_;
		Class528_Sub2 class528_sub2_888_;
		if (i > 0 && i <= 7) {
			class528_sub2_888_ = ((Class528_Sub2) this).aClass528_Sub2Array8645[i - 1];
			class528_sub2_887_ = ((Class528_Sub2) this).aClass528_Sub2Array8626[i - 1];
			bool_886_ = true;
		} else
			class528_sub2_887_ = class528_sub2_888_ = new Class528_Sub2(((Class528_Sub2) this).aClass505_Sub3_8638);
		return method13804(class528_sub2_887_, class528_sub2_888_, i_885_, bool_886_, bool);
	}

	public int ci() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8634;
	}

	public int ae() {
		return ((Class528_Sub2) this).anInt8575;
	}

	public void aq(int i) {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				if ((((Class528_Sub2) this).anInt8575 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method13853(true);
				((Class528_Sub2) this).anInt8575 = i;
			}
		} else {
			if ((((Class528_Sub2) this).anInt8575 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method13853(true);
			((Class528_Sub2) this).anInt8575 = i;
		}
	}

	final boolean method13840(int i) {
		if (((Class528_Sub2) this).aByteArray8602 == null)
			return false;
		if (((Class528_Sub2) this).aByteArray8602[i] == 0)
			return false;
		return true;
	}

	public byte[] aw() {
		return ((Class528_Sub2) this).aByteArray8602;
	}

	public void KA(int i) {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				if ((((Class528_Sub2) this).anInt8575 & 0x10000) == 65536 && (i & 0x10000) == 0)
					method13853(true);
				((Class528_Sub2) this).anInt8575 = i;
			}
		} else {
			if ((((Class528_Sub2) this).anInt8575 & 0x10000) == 65536 && (i & 0x10000) == 0)
				method13853(true);
			((Class528_Sub2) this).anInt8575 = i;
		}
	}

	public void bx(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method13805();
		else if (i == 8192)
			method13806();
		else if (i == 12288)
			method13807();
		else {
			int i_889_ = Class382.anIntArray4657[i];
			int i_890_ = Class382.anIntArray4661[i];
			synchronized (this) {
				for (int i_891_ = 0; i_891_ < ((Class528_Sub2) this).anInt8578; i_891_++) {
					int i_892_ = (((((Class528_Sub2) this).anIntArray8610[i_891_] * i_889_) + (((Class528_Sub2) this).anIntArray8580[i_891_] * i_890_)) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_891_] = ((((Class528_Sub2) this).anIntArray8610[i_891_] * i_890_) - (((Class528_Sub2) this).anIntArray8580[i_891_] * i_889_)) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_891_] = i_892_;
				}
				method13812();
			}
		}
	}

	public void bz(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0xd) != 13)
			throw new IllegalStateException();
		if (((Class528_Sub2) this).aClass189Array8584 != null) {
			if (i == 4096)
				method13850();
			else if (i == 8192)
				method13809();
			else if (i == 12288)
				method13810();
			else {
				int i_893_ = Class382.anIntArray4657[i];
				int i_894_ = Class382.anIntArray4661[i];
				synchronized (this) {
					for (int i_895_ = 0; i_895_ < ((Class528_Sub2) this).anInt8579; i_895_++) {
						int i_896_ = ((((Class528_Sub2) this).anIntArray8610[i_895_] * i_893_) + (((Class528_Sub2) this).anIntArray8580[i_895_] * i_894_)) >> 14;
						((Class528_Sub2) this).anIntArray8610[i_895_] = ((((Class528_Sub2) this).anIntArray8610[i_895_] * i_894_) - (((Class528_Sub2) this).anIntArray8580[i_895_] * i_893_)) >> 14;
						((Class528_Sub2) this).anIntArray8580[i_895_] = i_896_;
						if (((Class528_Sub2) this).aClass189Array8584[i_895_] != null) {
							i_896_ = ((((Class189) (((Class528_Sub2) this).aClass189Array8584[i_895_])).anInt2379) * i_893_ + (((Class189) (((Class528_Sub2) this).aClass189Array8584[i_895_])).anInt2380 * i_894_)) >> 14;
							((Class189) (((Class528_Sub2) this).aClass189Array8584[i_895_])).anInt2379 = ((((Class189) (((Class528_Sub2) this).aClass189Array8584[i_895_])).anInt2379) * i_894_ - (((Class189) (((Class528_Sub2) this).aClass189Array8584[i_895_])).anInt2380 * i_893_)) >> 14;
							((Class189) (((Class528_Sub2) this).aClass189Array8584[i_895_])).anInt2380 = i_896_;
						}
					}
					if (((Class528_Sub2) this).aClass195Array8599 != null) {
						for (int i_897_ = 0; i_897_ < ((Class528_Sub2) this).anInt8586; i_897_++) {
							if ((((Class528_Sub2) this).aClass195Array8599[i_897_]) != null) {
								int i_898_ = (((((Class195) (((Class528_Sub2) this).aClass195Array8599[i_897_])).anInt2412 * i_893_) + (((Class195) (((Class528_Sub2) this).aClass195Array8599[i_897_])).anInt2410 * i_894_)) >> 14);
								((Class195) (((Class528_Sub2) this).aClass195Array8599[i_897_])).anInt2412 = ((((Class195) (((Class528_Sub2) this).aClass195Array8599[i_897_])).anInt2412 * i_894_) - (((Class195) (((Class528_Sub2) this).aClass195Array8599[i_897_])).anInt2410 * i_893_)) >> 14;
								((Class195) (((Class528_Sub2) this).aClass195Array8599[i_897_])).anInt2410 = i_898_;
							}
						}
					}
					for (int i_899_ = ((Class528_Sub2) this).anInt8579; i_899_ < ((Class528_Sub2) this).anInt8578; i_899_++) {
						int i_900_ = ((((Class528_Sub2) this).anIntArray8610[i_899_] * i_893_) + (((Class528_Sub2) this).anIntArray8580[i_899_] * i_894_)) >> 14;
						((Class528_Sub2) this).anIntArray8610[i_899_] = ((((Class528_Sub2) this).anIntArray8610[i_899_] * i_894_) - (((Class528_Sub2) this).anIntArray8580[i_899_] * i_893_)) >> 14;
						((Class528_Sub2) this).anIntArray8580[i_899_] = i_900_;
					}
					((Class528_Sub2) this).anInt8598 = 0;
					((Class528_Sub2) this).aBool8621 = false;
				}
			}
		} else
			f(i);
	}

	final void method13841(boolean bool, boolean bool_901_, boolean bool_902_, boolean bool_903_, boolean bool_904_) {
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8617; i++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i];
				((Class528_Sub2) this).anIntArray8643[((Class193) class193).anInt2393 * 142270897] = i;
			}
		}
		if (((Class528_Sub2) this).aBool8630 || ((Class528_Sub2) this).aClass193Array8618 != null) {
			if ((((Class528_Sub2) this).anInt8575 & 0x100) == 0 && ((Class528_Sub2) this).aShortArray8623 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					short i_905_ = ((Class528_Sub2) this).aShortArray8623[i];
					method13868(bool, bool_901_, bool_902_, i_905_, bool_903_, bool_904_);
				}
			} else {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (!method13816(i) && !method13803(i))
						method13868(bool, bool_901_, bool_902_, i, bool_903_, bool_904_);
				}
				if (((Class528_Sub2) this).aByteArray8601 == null) {
					for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
						if (method13816(i) || method13803(i))
							method13868(bool, bool_901_, bool_902_, i, bool_903_, bool_904_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_906_ = 0; i_906_ < ((Class528_Sub2) this).anInt8586; i_906_++) {
							if ((((Class528_Sub2) this).aByteArray8601[i_906_] == i) && (method13816(i_906_) || method13803(i_906_)))
								method13868(bool, bool_901_, bool_902_, i_906_, bool_903_, bool_904_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++)
				method13868(bool, bool_901_, bool_902_, i, bool_903_, bool_904_);
		}
	}

	void method13842() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_907_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_907_;
			}
			method13812();
		}
	}

	void method13843() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_908_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_908_;
			}
			method13812();
		}
	}

	public void method11295() {
		/* empty */
	}

	void method13844() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			}
			method13812();
		}
	}

	void method13845() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_909_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_909_;
			}
			method13812();
		}
	}

	void method13846() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_910_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_910_;
			}
			method13812();
		}
	}

	void method13847() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				int i_911_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_911_;
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					i_911_ = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = -i_911_;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						int i_912_ = (((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412);
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = ((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = -i_912_;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_913_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_913_;
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	final void method13848(boolean bool, boolean bool_914_, boolean bool_915_, int i) {
		short i_916_ = ((Class528_Sub2) this).aShortArray8587[i];
		short i_917_ = ((Class528_Sub2) this).aShortArray8588[i];
		short i_918_ = ((Class528_Sub2) this).aShortArray8642[i];
		if (((Class528_Sub2) this).aShortArray8603 == null || ((Class528_Sub2) this).aShortArray8603[i] == -1) {
			if (((Class528_Sub2) this).aByteArray8602 == null)
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = 0;
			else
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = ((Class528_Sub2) this).aByteArray8602[i] & 0xff;
			if (((Class528_Sub2) this).anIntArray8594[i] == -1)
				((Class528_Sub2) this).aClass144_8566.method2428(bool, bool_914_, bool_915_, ((Class528_Sub2) this).aFloatArray8605[i_916_], ((Class528_Sub2) this).aFloatArray8605[i_917_], ((Class528_Sub2) this).aFloatArray8605[i_918_], ((Class528_Sub2) this).aFloatArray8590[i_916_], ((Class528_Sub2) this).aFloatArray8590[i_917_], ((Class528_Sub2) this).aFloatArray8590[i_918_], ((Class528_Sub2) this).aFloatArray8636[i_916_], ((Class528_Sub2) this).aFloatArray8636[i_917_],
						((Class528_Sub2) this).aFloatArray8636[i_918_], (Class335.anIntArray3916[((Class528_Sub2) this).anIntArray8592[i] & 0xffff]));
			else
				((Class528_Sub2) this).aClass144_8566.method2426(bool, bool_914_, bool_915_, ((Class528_Sub2) this).aFloatArray8605[i_916_], ((Class528_Sub2) this).aFloatArray8605[i_917_], ((Class528_Sub2) this).aFloatArray8605[i_918_], ((Class528_Sub2) this).aFloatArray8590[i_916_], ((Class528_Sub2) this).aFloatArray8590[i_917_], ((Class528_Sub2) this).aFloatArray8590[i_918_], ((Class528_Sub2) this).aFloatArray8636[i_916_], ((Class528_Sub2) this).aFloatArray8636[i_917_],
						((Class528_Sub2) this).aFloatArray8636[i_918_], (float) (((Class528_Sub2) this).anIntArray8592[i] & 0xffff), (float) (((Class528_Sub2) this).anIntArray8631[i] & 0xffff), (float) (((Class528_Sub2) this).anIntArray8594[i] & 0xffff));
		} else {
			int i_919_ = -16777216;
			if (((Class528_Sub2) this).aByteArray8602 != null)
				i_919_ = 255 - (((Class528_Sub2) this).aByteArray8602[i] & 0xff) << 24;
			if (((Class528_Sub2) this).anIntArray8594[i] == -1) {
				int i_920_ = (i_919_ | ((Class528_Sub2) this).anIntArray8592[i] & 0xffffff);
				((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_914_, bool_915_, ((Class528_Sub2) this).aFloatArray8605[i_916_], ((Class528_Sub2) this).aFloatArray8605[i_917_], ((Class528_Sub2) this).aFloatArray8605[i_918_], ((Class528_Sub2) this).aFloatArray8590[i_916_], ((Class528_Sub2) this).aFloatArray8590[i_917_], ((Class528_Sub2) this).aFloatArray8590[i_918_], ((Class528_Sub2) this).aFloatArray8636[i_916_], ((Class528_Sub2) this).aFloatArray8636[i_917_],
						((Class528_Sub2) this).aFloatArray8636[i_918_], ((Class528_Sub2) this).aFloatArray8637[i_916_], ((Class528_Sub2) this).aFloatArray8637[i_917_], ((Class528_Sub2) this).aFloatArray8637[i_918_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
						((Class528_Sub2) this).aFloatArrayArray8591[i][2], i_920_, i_920_, i_920_, (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, 0.0F, 0.0F, 0.0F, ((Class528_Sub2) this).aShortArray8603[i]);
			} else
				((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_914_, bool_915_, ((Class528_Sub2) this).aFloatArray8605[i_916_], ((Class528_Sub2) this).aFloatArray8605[i_917_], ((Class528_Sub2) this).aFloatArray8605[i_918_], ((Class528_Sub2) this).aFloatArray8590[i_916_], ((Class528_Sub2) this).aFloatArray8590[i_917_], ((Class528_Sub2) this).aFloatArray8590[i_918_], ((Class528_Sub2) this).aFloatArray8636[i_916_], ((Class528_Sub2) this).aFloatArray8636[i_917_],
						((Class528_Sub2) this).aFloatArray8636[i_918_], ((Class528_Sub2) this).aFloatArray8637[i_916_], ((Class528_Sub2) this).aFloatArray8637[i_917_], ((Class528_Sub2) this).aFloatArray8637[i_918_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
						((Class528_Sub2) this).aFloatArrayArray8591[i][2], (i_919_ | ((Class528_Sub2) this).anIntArray8592[i] & 0xffffff), (i_919_ | ((Class528_Sub2) this).anIntArray8631[i] & 0xffffff), (i_919_ | ((Class528_Sub2) this).anIntArray8594[i] & 0xffffff), (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, 0.0F, 0.0F, 0.0F, ((Class528_Sub2) this).aShortArray8603[i]);
		}
	}

	public int YA() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8570;
	}

	void method13849() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	void method13850() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				int i_921_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_921_;
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					i_921_ = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = -i_921_;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						int i_922_ = (((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410);
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = ((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -i_922_;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_923_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_923_;
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	void method13851() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				int i_924_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_924_;
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					i_924_ = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = -i_924_;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						int i_925_ = (((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412);
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = ((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = -i_925_;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_926_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_926_;
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	void method13852() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				int i_927_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_927_;
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					i_927_ = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = -i_927_;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						int i_928_ = (((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412);
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = ((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = -i_928_;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_929_ = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = -i_929_;
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	public Class282_Sub50_Sub17 ga(Class282_Sub50_Sub17 class282_sub50_sub17) {
		return null;
	}

	void method13853(boolean bool) {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				method13798(bool);
			}
		} else
			method13798(bool);
	}

	public void bs(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x6) != 6)
			throw new IllegalStateException();
		int i_930_ = Class382.anIntArray4657[i];
		int i_931_ = Class382.anIntArray4661[i];
		synchronized (this) {
			for (int i_932_ = 0; i_932_ < ((Class528_Sub2) this).anInt8578; i_932_++) {
				int i_933_ = ((((Class528_Sub2) this).anIntArray8581[i_932_] * i_931_ - (((Class528_Sub2) this).anIntArray8610[i_932_] * i_930_)) >> 14);
				((Class528_Sub2) this).anIntArray8610[i_932_] = (((Class528_Sub2) this).anIntArray8581[i_932_] * i_930_ + (((Class528_Sub2) this).anIntArray8610[i_932_] * i_931_)) >> 14;
				((Class528_Sub2) this).anIntArray8581[i_932_] = i_933_;
			}
			method13812();
		}
	}

	public void bm(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x6) != 6)
			throw new IllegalStateException();
		int i_934_ = Class382.anIntArray4657[i];
		int i_935_ = Class382.anIntArray4661[i];
		synchronized (this) {
			for (int i_936_ = 0; i_936_ < ((Class528_Sub2) this).anInt8578; i_936_++) {
				int i_937_ = ((((Class528_Sub2) this).anIntArray8581[i_936_] * i_935_ - (((Class528_Sub2) this).anIntArray8610[i_936_] * i_934_)) >> 14);
				((Class528_Sub2) this).anIntArray8610[i_936_] = (((Class528_Sub2) this).anIntArray8581[i_936_] * i_934_ + (((Class528_Sub2) this).anIntArray8610[i_936_] * i_935_)) >> 14;
				((Class528_Sub2) this).anIntArray8581[i_936_] = i_937_;
			}
			method13812();
		}
	}

	public void bf(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x6) != 6)
			throw new IllegalStateException();
		int i_938_ = Class382.anIntArray4657[i];
		int i_939_ = Class382.anIntArray4661[i];
		synchronized (this) {
			for (int i_940_ = 0; i_940_ < ((Class528_Sub2) this).anInt8578; i_940_++) {
				int i_941_ = ((((Class528_Sub2) this).anIntArray8581[i_940_] * i_939_ - (((Class528_Sub2) this).anIntArray8610[i_940_] * i_938_)) >> 14);
				((Class528_Sub2) this).anIntArray8610[i_940_] = (((Class528_Sub2) this).anIntArray8581[i_940_] * i_938_ + (((Class528_Sub2) this).anIntArray8610[i_940_] * i_939_)) >> 14;
				((Class528_Sub2) this).anIntArray8581[i_940_] = i_941_;
			}
			method13812();
		}
	}

	public void bn(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x6) != 6)
			throw new IllegalStateException();
		int i_942_ = Class382.anIntArray4657[i];
		int i_943_ = Class382.anIntArray4661[i];
		synchronized (this) {
			for (int i_944_ = 0; i_944_ < ((Class528_Sub2) this).anInt8578; i_944_++) {
				int i_945_ = ((((Class528_Sub2) this).anIntArray8581[i_944_] * i_943_ - (((Class528_Sub2) this).anIntArray8610[i_944_] * i_942_)) >> 14);
				((Class528_Sub2) this).anIntArray8610[i_944_] = (((Class528_Sub2) this).anIntArray8581[i_944_] * i_942_ + (((Class528_Sub2) this).anIntArray8610[i_944_] * i_943_)) >> 14;
				((Class528_Sub2) this).anIntArray8581[i_944_] = i_945_;
			}
			method13812();
		}
	}

	public void be() {
		if ((((Class528_Sub2) this).anInt8575 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++)
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			if (((Class528_Sub2) this).aClass189Array8584 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
					if (((Class528_Sub2) this).aClass189Array8584[i] != null)
						((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass189Array8585 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
					if (((Class528_Sub2) this).aClass189Array8585[i] != null)
						((Class189) (((Class528_Sub2) this).aClass189Array8585[i])).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8585[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null)
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
				}
			}
			short[] is = ((Class528_Sub2) this).aShortArray8587;
			((Class528_Sub2) this).aShortArray8587 = ((Class528_Sub2) this).aShortArray8642;
			((Class528_Sub2) this).aShortArray8642 = is;
			if (((Class528_Sub2) this).aFloatArrayArray8635 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aFloatArrayArray8635[i] != null) {
						float f = (((Class528_Sub2) this).aFloatArrayArray8635[i][0]);
						((Class528_Sub2) this).aFloatArrayArray8635[i][0] = (((Class528_Sub2) this).aFloatArrayArray8635[i][2]);
						((Class528_Sub2) this).aFloatArrayArray8635[i][2] = f;
					}
					if (((Class528_Sub2) this).aFloatArrayArray8591[i] != null) {
						float f = (((Class528_Sub2) this).aFloatArrayArray8591[i][0]);
						((Class528_Sub2) this).aFloatArrayArray8591[i][0] = (((Class528_Sub2) this).aFloatArrayArray8591[i][2]);
						((Class528_Sub2) this).aFloatArrayArray8591[i][2] = f;
					}
				}
			}
			((Class528_Sub2) this).aBool8621 = false;
			((Class528_Sub2) this).anInt8598 = 0;
		}
	}

	public void by() {
		if ((((Class528_Sub2) this).anInt8575 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++)
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			if (((Class528_Sub2) this).aClass189Array8584 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
					if (((Class528_Sub2) this).aClass189Array8584[i] != null)
						((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass189Array8585 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
					if (((Class528_Sub2) this).aClass189Array8585[i] != null)
						((Class189) (((Class528_Sub2) this).aClass189Array8585[i])).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8585[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null)
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
				}
			}
			short[] is = ((Class528_Sub2) this).aShortArray8587;
			((Class528_Sub2) this).aShortArray8587 = ((Class528_Sub2) this).aShortArray8642;
			((Class528_Sub2) this).aShortArray8642 = is;
			if (((Class528_Sub2) this).aFloatArrayArray8635 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aFloatArrayArray8635[i] != null) {
						float f = (((Class528_Sub2) this).aFloatArrayArray8635[i][0]);
						((Class528_Sub2) this).aFloatArrayArray8635[i][0] = (((Class528_Sub2) this).aFloatArrayArray8635[i][2]);
						((Class528_Sub2) this).aFloatArrayArray8635[i][2] = f;
					}
					if (((Class528_Sub2) this).aFloatArrayArray8591[i] != null) {
						float f = (((Class528_Sub2) this).aFloatArrayArray8591[i][0]);
						((Class528_Sub2) this).aFloatArrayArray8591[i][0] = (((Class528_Sub2) this).aFloatArrayArray8591[i][2]);
						((Class528_Sub2) this).aFloatArrayArray8591[i][2] = f;
					}
				}
			}
			((Class528_Sub2) this).aBool8621 = false;
			((Class528_Sub2) this).anInt8598 = 0;
		}
	}

	public void ia(int i, int i_946_, int i_947_) {
		if (i != 0 && (((Class528_Sub2) this).anInt8575 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_946_ != 0 && (((Class528_Sub2) this).anInt8575 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_947_ != 0 && (((Class528_Sub2) this).anInt8575 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_948_ = 0; i_948_ < ((Class528_Sub2) this).anInt8578; i_948_++) {
				((Class528_Sub2) this).anIntArray8580[i_948_] += i;
				((Class528_Sub2) this).anIntArray8581[i_948_] += i_946_;
				((Class528_Sub2) this).anIntArray8610[i_948_] += i_947_;
			}
		}
	}

	void method13854() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++) {
				((Class528_Sub2) this).anIntArray8580[i] = -((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			}
			method13812();
		}
	}

	int method13855(int i, int i_949_) {
		i_949_ = i_949_ * (i & 0x7f) >> 7;
		if (i_949_ < 2)
			i_949_ = 2;
		else if (i_949_ > 126)
			i_949_ = 126;
		return (i & 0xff80) + i_949_;
	}

	void method13856() {
		((Class528_Sub2) this).aClass189Array8584 = null;
		((Class528_Sub2) this).aClass189Array8585 = null;
		((Class528_Sub2) this).aClass195Array8599 = null;
		((Class528_Sub2) this).aBool8621 = false;
	}

	public Class282_Sub50_Sub17 dr(Class282_Sub50_Sub17 class282_sub50_sub17) {
		return null;
	}

	void method13857() {
		((Class528_Sub2) this).aClass189Array8584 = null;
		((Class528_Sub2) this).aClass189Array8585 = null;
		((Class528_Sub2) this).aClass195Array8599 = null;
		((Class528_Sub2) this).aBool8621 = false;
	}

	void method11288() {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				aBool7023 = false;
				this.notifyAll();
			}
		}
	}

	void method11285() {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				aBool7023 = false;
				this.notifyAll();
			}
		}
	}

	boolean bh() {
		if (((Class528_Sub2) this).anIntArrayArray8568 == null)
			return false;
		((Class528_Sub2) this).anInt8611 = 0;
		((Class528_Sub2) this).anInt8607 = 0;
		((Class528_Sub2) this).anInt8613 = 0;
		return true;
	}

	boolean bv() {
		if (((Class528_Sub2) this).anIntArrayArray8568 == null)
			return false;
		((Class528_Sub2) this).anInt8611 = 0;
		((Class528_Sub2) this).anInt8607 = 0;
		((Class528_Sub2) this).anInt8613 = 0;
		return true;
	}

	public void bj(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0xd) != 13)
			throw new IllegalStateException();
		if (((Class528_Sub2) this).aClass189Array8584 != null) {
			if (i == 4096)
				method13850();
			else if (i == 8192)
				method13809();
			else if (i == 12288)
				method13810();
			else {
				int i_950_ = Class382.anIntArray4657[i];
				int i_951_ = Class382.anIntArray4661[i];
				synchronized (this) {
					for (int i_952_ = 0; i_952_ < ((Class528_Sub2) this).anInt8579; i_952_++) {
						int i_953_ = ((((Class528_Sub2) this).anIntArray8610[i_952_] * i_950_) + (((Class528_Sub2) this).anIntArray8580[i_952_] * i_951_)) >> 14;
						((Class528_Sub2) this).anIntArray8610[i_952_] = ((((Class528_Sub2) this).anIntArray8610[i_952_] * i_951_) - (((Class528_Sub2) this).anIntArray8580[i_952_] * i_950_)) >> 14;
						((Class528_Sub2) this).anIntArray8580[i_952_] = i_953_;
						if (((Class528_Sub2) this).aClass189Array8584[i_952_] != null) {
							i_953_ = ((((Class189) (((Class528_Sub2) this).aClass189Array8584[i_952_])).anInt2379) * i_950_ + (((Class189) (((Class528_Sub2) this).aClass189Array8584[i_952_])).anInt2380 * i_951_)) >> 14;
							((Class189) (((Class528_Sub2) this).aClass189Array8584[i_952_])).anInt2379 = ((((Class189) (((Class528_Sub2) this).aClass189Array8584[i_952_])).anInt2379) * i_951_ - (((Class189) (((Class528_Sub2) this).aClass189Array8584[i_952_])).anInt2380 * i_950_)) >> 14;
							((Class189) (((Class528_Sub2) this).aClass189Array8584[i_952_])).anInt2380 = i_953_;
						}
					}
					if (((Class528_Sub2) this).aClass195Array8599 != null) {
						for (int i_954_ = 0; i_954_ < ((Class528_Sub2) this).anInt8586; i_954_++) {
							if ((((Class528_Sub2) this).aClass195Array8599[i_954_]) != null) {
								int i_955_ = (((((Class195) (((Class528_Sub2) this).aClass195Array8599[i_954_])).anInt2412 * i_950_) + (((Class195) (((Class528_Sub2) this).aClass195Array8599[i_954_])).anInt2410 * i_951_)) >> 14);
								((Class195) (((Class528_Sub2) this).aClass195Array8599[i_954_])).anInt2412 = ((((Class195) (((Class528_Sub2) this).aClass195Array8599[i_954_])).anInt2412 * i_951_) - (((Class195) (((Class528_Sub2) this).aClass195Array8599[i_954_])).anInt2410 * i_950_)) >> 14;
								((Class195) (((Class528_Sub2) this).aClass195Array8599[i_954_])).anInt2410 = i_955_;
							}
						}
					}
					for (int i_956_ = ((Class528_Sub2) this).anInt8579; i_956_ < ((Class528_Sub2) this).anInt8578; i_956_++) {
						int i_957_ = ((((Class528_Sub2) this).anIntArray8610[i_956_] * i_950_) + (((Class528_Sub2) this).anIntArray8580[i_956_] * i_951_)) >> 14;
						((Class528_Sub2) this).anIntArray8610[i_956_] = ((((Class528_Sub2) this).anIntArray8610[i_956_] * i_951_) - (((Class528_Sub2) this).anIntArray8580[i_956_] * i_950_)) >> 14;
						((Class528_Sub2) this).anIntArray8580[i_956_] = i_957_;
					}
					((Class528_Sub2) this).anInt8598 = 0;
					((Class528_Sub2) this).aBool8621 = false;
				}
			}
		} else
			f(i);
	}

	void method11275(int i, int[] is, int i_958_, int i_959_, int i_960_, int i_961_, boolean bool) {
		int i_962_ = is.length;
		if (i == 0) {
			i_958_ <<= 4;
			i_959_ <<= 4;
			i_960_ <<= 4;
			if (!((Class528_Sub2) this).aBool8589) {
				for (int i_963_ = 0; i_963_ < ((Class528_Sub2) this).anInt8578; i_963_++) {
					((Class528_Sub2) this).anIntArray8580[i_963_] <<= 4;
					((Class528_Sub2) this).anIntArray8581[i_963_] <<= 4;
					((Class528_Sub2) this).anIntArray8610[i_963_] <<= 4;
				}
				((Class528_Sub2) this).aBool8589 = true;
			}
			int i_964_ = 0;
			((Class528_Sub2) this).anInt8611 = 0;
			((Class528_Sub2) this).anInt8607 = 0;
			((Class528_Sub2) this).anInt8613 = 0;
			for (int i_965_ = 0; i_965_ < i_962_; i_965_++) {
				int i_966_ = is[i_965_];
				if (i_966_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_967_ = ((Class528_Sub2) this).anIntArrayArray8568[i_966_];
					for (int i_968_ = 0; i_968_ < is_967_.length; i_968_++) {
						int i_969_ = is_967_[i_968_];
						((Class528_Sub2) this).anInt8611 += ((Class528_Sub2) this).anIntArray8580[i_969_];
						((Class528_Sub2) this).anInt8607 += ((Class528_Sub2) this).anIntArray8581[i_969_];
						((Class528_Sub2) this).anInt8613 += ((Class528_Sub2) this).anIntArray8610[i_969_];
						i_964_++;
					}
				}
			}
			if (i_964_ > 0) {
				((Class528_Sub2) this).anInt8611 = ((Class528_Sub2) this).anInt8611 / i_964_ + i_958_;
				((Class528_Sub2) this).anInt8607 = ((Class528_Sub2) this).anInt8607 / i_964_ + i_959_;
				((Class528_Sub2) this).anInt8613 = ((Class528_Sub2) this).anInt8613 / i_964_ + i_960_;
			} else {
				((Class528_Sub2) this).anInt8611 = i_958_;
				((Class528_Sub2) this).anInt8607 = i_959_;
				((Class528_Sub2) this).anInt8613 = i_960_;
			}
		} else if (i == 1) {
			i_958_ <<= 4;
			i_959_ <<= 4;
			i_960_ <<= 4;
			if (!((Class528_Sub2) this).aBool8589) {
				for (int i_970_ = 0; i_970_ < ((Class528_Sub2) this).anInt8578; i_970_++) {
					((Class528_Sub2) this).anIntArray8580[i_970_] <<= 4;
					((Class528_Sub2) this).anIntArray8581[i_970_] <<= 4;
					((Class528_Sub2) this).anIntArray8610[i_970_] <<= 4;
				}
				((Class528_Sub2) this).aBool8589 = true;
			}
			for (int i_971_ = 0; i_971_ < i_962_; i_971_++) {
				int i_972_ = is[i_971_];
				if (i_972_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_973_ = ((Class528_Sub2) this).anIntArrayArray8568[i_972_];
					for (int i_974_ = 0; i_974_ < is_973_.length; i_974_++) {
						int i_975_ = is_973_[i_974_];
						((Class528_Sub2) this).anIntArray8580[i_975_] += i_958_;
						((Class528_Sub2) this).anIntArray8581[i_975_] += i_959_;
						((Class528_Sub2) this).anIntArray8610[i_975_] += i_960_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_976_ = 0; i_976_ < i_962_; i_976_++) {
				int i_977_ = is[i_976_];
				if (i_977_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_978_ = ((Class528_Sub2) this).anIntArrayArray8568[i_977_];
					if ((i_961_ & 0x1) == 0) {
						for (int i_979_ = 0; i_979_ < is_978_.length; i_979_++) {
							int i_980_ = is_978_[i_979_];
							((Class528_Sub2) this).anIntArray8580[i_980_] -= ((Class528_Sub2) this).anInt8611;
							((Class528_Sub2) this).anIntArray8581[i_980_] -= ((Class528_Sub2) this).anInt8607;
							((Class528_Sub2) this).anIntArray8610[i_980_] -= ((Class528_Sub2) this).anInt8613;
							if (i_960_ != 0) {
								int i_981_ = Class382.anIntArray4657[i_960_];
								int i_982_ = Class382.anIntArray4661[i_960_];
								int i_983_ = (((((Class528_Sub2) this).anIntArray8581[i_980_]) * i_981_ + (((Class528_Sub2) this).anIntArray8580[i_980_]) * i_982_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8581[i_980_] = ((((Class528_Sub2) this).anIntArray8581[i_980_]) * i_982_ - (((Class528_Sub2) this).anIntArray8580[i_980_]) * i_981_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8580[i_980_] = i_983_;
							}
							if (i_958_ != 0) {
								int i_984_ = Class382.anIntArray4657[i_958_];
								int i_985_ = Class382.anIntArray4661[i_958_];
								int i_986_ = (((((Class528_Sub2) this).anIntArray8581[i_980_]) * i_985_ - (((Class528_Sub2) this).anIntArray8610[i_980_]) * i_984_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8610[i_980_] = ((((Class528_Sub2) this).anIntArray8581[i_980_]) * i_984_ + (((Class528_Sub2) this).anIntArray8610[i_980_]) * i_985_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8581[i_980_] = i_986_;
							}
							if (i_959_ != 0) {
								int i_987_ = Class382.anIntArray4657[i_959_];
								int i_988_ = Class382.anIntArray4661[i_959_];
								int i_989_ = (((((Class528_Sub2) this).anIntArray8610[i_980_]) * i_987_ + (((Class528_Sub2) this).anIntArray8580[i_980_]) * i_988_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8610[i_980_] = ((((Class528_Sub2) this).anIntArray8610[i_980_]) * i_988_ - (((Class528_Sub2) this).anIntArray8580[i_980_]) * i_987_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8580[i_980_] = i_989_;
							}
							((Class528_Sub2) this).anIntArray8580[i_980_] += ((Class528_Sub2) this).anInt8611;
							((Class528_Sub2) this).anIntArray8581[i_980_] += ((Class528_Sub2) this).anInt8607;
							((Class528_Sub2) this).anIntArray8610[i_980_] += ((Class528_Sub2) this).anInt8613;
						}
					} else {
						for (int i_990_ = 0; i_990_ < is_978_.length; i_990_++) {
							int i_991_ = is_978_[i_990_];
							((Class528_Sub2) this).anIntArray8580[i_991_] -= ((Class528_Sub2) this).anInt8611;
							((Class528_Sub2) this).anIntArray8581[i_991_] -= ((Class528_Sub2) this).anInt8607;
							((Class528_Sub2) this).anIntArray8610[i_991_] -= ((Class528_Sub2) this).anInt8613;
							if (i_958_ != 0) {
								int i_992_ = Class382.anIntArray4657[i_958_];
								int i_993_ = Class382.anIntArray4661[i_958_];
								int i_994_ = (((((Class528_Sub2) this).anIntArray8581[i_991_]) * i_993_ - (((Class528_Sub2) this).anIntArray8610[i_991_]) * i_992_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8610[i_991_] = ((((Class528_Sub2) this).anIntArray8581[i_991_]) * i_992_ + (((Class528_Sub2) this).anIntArray8610[i_991_]) * i_993_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8581[i_991_] = i_994_;
							}
							if (i_960_ != 0) {
								int i_995_ = Class382.anIntArray4657[i_960_];
								int i_996_ = Class382.anIntArray4661[i_960_];
								int i_997_ = (((((Class528_Sub2) this).anIntArray8581[i_991_]) * i_995_ + (((Class528_Sub2) this).anIntArray8580[i_991_]) * i_996_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8581[i_991_] = ((((Class528_Sub2) this).anIntArray8581[i_991_]) * i_996_ - (((Class528_Sub2) this).anIntArray8580[i_991_]) * i_995_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8580[i_991_] = i_997_;
							}
							if (i_959_ != 0) {
								int i_998_ = Class382.anIntArray4657[i_959_];
								int i_999_ = Class382.anIntArray4661[i_959_];
								int i_1000_ = (((((Class528_Sub2) this).anIntArray8610[i_991_]) * i_998_ + (((Class528_Sub2) this).anIntArray8580[i_991_]) * i_999_ + 16383) >> 14);
								((Class528_Sub2) this).anIntArray8610[i_991_] = ((((Class528_Sub2) this).anIntArray8610[i_991_]) * i_999_ - (((Class528_Sub2) this).anIntArray8580[i_991_]) * i_998_ + 16383) >> 14;
								((Class528_Sub2) this).anIntArray8580[i_991_] = i_1000_;
							}
							((Class528_Sub2) this).anIntArray8580[i_991_] += ((Class528_Sub2) this).anInt8611;
							((Class528_Sub2) this).anIntArray8581[i_991_] += ((Class528_Sub2) this).anInt8607;
							((Class528_Sub2) this).anIntArray8610[i_991_] += ((Class528_Sub2) this).anInt8613;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_1001_ = 0; i_1001_ < i_962_; i_1001_++) {
				int i_1002_ = is[i_1001_];
				if (i_1002_ < ((Class528_Sub2) this).anIntArrayArray8568.length) {
					int[] is_1003_ = ((Class528_Sub2) this).anIntArrayArray8568[i_1002_];
					for (int i_1004_ = 0; i_1004_ < is_1003_.length; i_1004_++) {
						int i_1005_ = is_1003_[i_1004_];
						((Class528_Sub2) this).anIntArray8580[i_1005_] -= ((Class528_Sub2) this).anInt8611;
						((Class528_Sub2) this).anIntArray8581[i_1005_] -= ((Class528_Sub2) this).anInt8607;
						((Class528_Sub2) this).anIntArray8610[i_1005_] -= ((Class528_Sub2) this).anInt8613;
						((Class528_Sub2) this).anIntArray8580[i_1005_] = (((Class528_Sub2) this).anIntArray8580[i_1005_] * i_958_ / 128);
						((Class528_Sub2) this).anIntArray8581[i_1005_] = (((Class528_Sub2) this).anIntArray8581[i_1005_] * i_959_ / 128);
						((Class528_Sub2) this).anIntArray8610[i_1005_] = (((Class528_Sub2) this).anIntArray8610[i_1005_] * i_960_ / 128);
						((Class528_Sub2) this).anIntArray8580[i_1005_] += ((Class528_Sub2) this).anInt8611;
						((Class528_Sub2) this).anIntArray8581[i_1005_] += ((Class528_Sub2) this).anInt8607;
						((Class528_Sub2) this).anIntArray8610[i_1005_] += ((Class528_Sub2) this).anInt8613;
					}
				}
			}
		} else if (i == 5) {
			if (((Class528_Sub2) this).anIntArrayArray8608 != null && ((Class528_Sub2) this).aByteArray8602 != null) {
				for (int i_1006_ = 0; i_1006_ < i_962_; i_1006_++) {
					int i_1007_ = is[i_1006_];
					if (i_1007_ < ((Class528_Sub2) this).anIntArrayArray8608.length) {
						int[] is_1008_ = (((Class528_Sub2) this).anIntArrayArray8608[i_1007_]);
						for (int i_1009_ = 0; i_1009_ < is_1008_.length; i_1009_++) {
							int i_1010_ = is_1008_[i_1009_];
							int i_1011_ = (((((Class528_Sub2) this).aByteArray8602[i_1010_]) & 0xff) + i_958_ * 8);
							if (i_1011_ < 0)
								i_1011_ = 0;
							else if (i_1011_ > 255)
								i_1011_ = 255;
							((Class528_Sub2) this).aByteArray8602[i_1010_] = (byte) i_1011_;
						}
					}
				}
				if (((Class528_Sub2) this).aClass193Array8618 != null) {
					for (int i_1012_ = 0; i_1012_ < ((Class528_Sub2) this).anInt8617; i_1012_++) {
						Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_1012_]);
						Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_1012_]);
						((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & 0xffffff) | 255 - ((((Class528_Sub2) this).aByteArray8602[(((Class193) class193).anInt2393 * 142270897)]) & 0xff) << 24) * -1022818925;
					}
				}
			}
		} else if (i == 7) {
			if (((Class528_Sub2) this).anIntArrayArray8608 != null) {
				for (int i_1013_ = 0; i_1013_ < i_962_; i_1013_++) {
					int i_1014_ = is[i_1013_];
					if (i_1014_ < ((Class528_Sub2) this).anIntArrayArray8608.length) {
						int[] is_1015_ = (((Class528_Sub2) this).anIntArrayArray8608[i_1014_]);
						for (int i_1016_ = 0; i_1016_ < is_1015_.length; i_1016_++) {
							int i_1017_ = is_1015_[i_1016_];
							int i_1018_ = ((((Class528_Sub2) this).aShortArray8604[i_1017_]) & 0xffff);
							int i_1019_ = i_1018_ >> 10 & 0x3f;
							int i_1020_ = i_1018_ >> 7 & 0x7;
							int i_1021_ = i_1018_ & 0x7f;
							i_1019_ = i_1019_ + i_958_ & 0x3f;
							i_1020_ += i_959_;
							if (i_1020_ < 0)
								i_1020_ = 0;
							else if (i_1020_ > 7)
								i_1020_ = 7;
							i_1021_ += i_960_;
							if (i_1021_ < 0)
								i_1021_ = 0;
							else if (i_1021_ > 127)
								i_1021_ = 127;
							((Class528_Sub2) this).aShortArray8604[i_1017_] = (short) (i_1019_ << 10 | i_1020_ << 7 | i_1021_);
						}
						((Class528_Sub2) this).aBool8609 = true;
					}
				}
				if (((Class528_Sub2) this).aClass193Array8618 != null) {
					for (int i_1022_ = 0; i_1022_ < ((Class528_Sub2) this).anInt8617; i_1022_++) {
						Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_1022_]);
						Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_1022_]);
						((Class176) class176).anInt2199 = (((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | (Class335.anIntArray3916[(Class372.method6362((((Class528_Sub2) this).aShortArray8604[(((Class193) class193).anInt2393 * 142270897)]) & 0xffff, 634773727)) & 0xffff]) & 0xffffff) * -1022818925);
					}
				}
			}
		} else if (i == 8) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_1023_ = 0; i_1023_ < i_962_; i_1023_++) {
					int i_1024_ = is[i_1023_];
					if (i_1024_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_1025_ = (((Class528_Sub2) this).anIntArrayArray8620[i_1024_]);
						for (int i_1026_ = 0; i_1026_ < is_1025_.length; i_1026_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_1025_[i_1026_]]);
							((Class176) class176).anInt2192 += i_958_ * -943685543;
							((Class176) class176).anInt2189 += i_959_ * 1414070385;
						}
					}
				}
			}
		} else if (i == 10) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_1027_ = 0; i_1027_ < i_962_; i_1027_++) {
					int i_1028_ = is[i_1027_];
					if (i_1028_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_1029_ = (((Class528_Sub2) this).anIntArrayArray8620[i_1028_]);
						for (int i_1030_ = 0; i_1030_ < is_1029_.length; i_1030_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_1029_[i_1030_]]);
							((Class176) class176).aFloat2190 = (((Class176) class176).aFloat2190 * (float) i_958_ / 128.0F);
							((Class176) class176).aFloat2191 = (((Class176) class176).aFloat2191 * (float) i_959_ / 128.0F);
						}
					}
				}
			}
		} else if (i == 9) {
			if (((Class528_Sub2) this).anIntArrayArray8620 != null) {
				for (int i_1031_ = 0; i_1031_ < i_962_; i_1031_++) {
					int i_1032_ = is[i_1031_];
					if (i_1032_ < ((Class528_Sub2) this).anIntArrayArray8620.length) {
						int[] is_1033_ = (((Class528_Sub2) this).anIntArrayArray8620[i_1032_]);
						for (int i_1034_ = 0; i_1034_ < is_1033_.length; i_1034_++) {
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[is_1033_[i_1034_]]);
							((Class176) class176).anInt2194 = ((((Class176) class176).anInt2194 * 156323613 + i_958_) & 0x3fff) * 2076699445;
						}
					}
				}
			}
		}
	}

	public void bq() {
		if ((((Class528_Sub2) this).anInt8575 & 0x10) != 16)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8578; i++)
				((Class528_Sub2) this).anIntArray8610[i] = -((Class528_Sub2) this).anIntArray8610[i];
			if (((Class528_Sub2) this).aClass189Array8584 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
					if (((Class528_Sub2) this).aClass189Array8584[i] != null)
						((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass189Array8585 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
					if (((Class528_Sub2) this).aClass189Array8585[i] != null)
						((Class189) (((Class528_Sub2) this).aClass189Array8585[i])).anInt2379 = -((Class189) (((Class528_Sub2) this).aClass189Array8585[i])).anInt2379;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null)
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
				}
			}
			short[] is = ((Class528_Sub2) this).aShortArray8587;
			((Class528_Sub2) this).aShortArray8587 = ((Class528_Sub2) this).aShortArray8642;
			((Class528_Sub2) this).aShortArray8642 = is;
			if (((Class528_Sub2) this).aFloatArrayArray8635 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aFloatArrayArray8635[i] != null) {
						float f = (((Class528_Sub2) this).aFloatArrayArray8635[i][0]);
						((Class528_Sub2) this).aFloatArrayArray8635[i][0] = (((Class528_Sub2) this).aFloatArrayArray8635[i][2]);
						((Class528_Sub2) this).aFloatArrayArray8635[i][2] = f;
					}
					if (((Class528_Sub2) this).aFloatArrayArray8591[i] != null) {
						float f = (((Class528_Sub2) this).aFloatArrayArray8591[i][0]);
						((Class528_Sub2) this).aFloatArrayArray8591[i][0] = (((Class528_Sub2) this).aFloatArrayArray8591[i][2]);
						((Class528_Sub2) this).aFloatArrayArray8591[i][2] = f;
					}
				}
			}
			((Class528_Sub2) this).aBool8621 = false;
			((Class528_Sub2) this).anInt8598 = 0;
		}
	}

	void bb(int i, int i_1035_, int i_1036_, int i_1037_) {
		if (i == 0) {
			int i_1038_ = 0;
			((Class528_Sub2) this).anInt8611 = 0;
			((Class528_Sub2) this).anInt8607 = 0;
			((Class528_Sub2) this).anInt8613 = 0;
			for (int i_1039_ = 0; i_1039_ < ((Class528_Sub2) this).anInt8578; i_1039_++) {
				((Class528_Sub2) this).anInt8611 += ((Class528_Sub2) this).anIntArray8580[i_1039_];
				((Class528_Sub2) this).anInt8607 += ((Class528_Sub2) this).anIntArray8581[i_1039_];
				((Class528_Sub2) this).anInt8613 += ((Class528_Sub2) this).anIntArray8610[i_1039_];
				i_1038_++;
			}
			if (i_1038_ > 0) {
				((Class528_Sub2) this).anInt8611 = ((Class528_Sub2) this).anInt8611 / i_1038_ + i_1035_;
				((Class528_Sub2) this).anInt8607 = ((Class528_Sub2) this).anInt8607 / i_1038_ + i_1036_;
				((Class528_Sub2) this).anInt8613 = ((Class528_Sub2) this).anInt8613 / i_1038_ + i_1037_;
			} else {
				((Class528_Sub2) this).anInt8611 = i_1035_;
				((Class528_Sub2) this).anInt8607 = i_1036_;
				((Class528_Sub2) this).anInt8613 = i_1037_;
			}
		} else if (i == 1) {
			for (int i_1040_ = 0; i_1040_ < ((Class528_Sub2) this).anInt8578; i_1040_++) {
				((Class528_Sub2) this).anIntArray8580[i_1040_] += i_1035_;
				((Class528_Sub2) this).anIntArray8581[i_1040_] += i_1036_;
				((Class528_Sub2) this).anIntArray8610[i_1040_] += i_1037_;
			}
		} else if (i == 2) {
			for (int i_1041_ = 0; i_1041_ < ((Class528_Sub2) this).anInt8578; i_1041_++) {
				((Class528_Sub2) this).anIntArray8580[i_1041_] -= ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_1041_] -= ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_1041_] -= ((Class528_Sub2) this).anInt8613;
				if (i_1037_ != 0) {
					int i_1042_ = Class382.anIntArray4657[i_1037_];
					int i_1043_ = Class382.anIntArray4661[i_1037_];
					int i_1044_ = (((((Class528_Sub2) this).anIntArray8581[i_1041_] * i_1042_) + (((Class528_Sub2) this).anIntArray8580[i_1041_] * i_1043_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8581[i_1041_] = ((((Class528_Sub2) this).anIntArray8581[i_1041_] * i_1043_) - (((Class528_Sub2) this).anIntArray8580[i_1041_] * i_1042_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_1041_] = i_1044_;
				}
				if (i_1035_ != 0) {
					int i_1045_ = Class382.anIntArray4657[i_1035_];
					int i_1046_ = Class382.anIntArray4661[i_1035_];
					int i_1047_ = (((((Class528_Sub2) this).anIntArray8581[i_1041_] * i_1046_) - (((Class528_Sub2) this).anIntArray8610[i_1041_] * i_1045_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_1041_] = ((((Class528_Sub2) this).anIntArray8581[i_1041_] * i_1045_) + (((Class528_Sub2) this).anIntArray8610[i_1041_] * i_1046_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8581[i_1041_] = i_1047_;
				}
				if (i_1036_ != 0) {
					int i_1048_ = Class382.anIntArray4657[i_1036_];
					int i_1049_ = Class382.anIntArray4661[i_1036_];
					int i_1050_ = (((((Class528_Sub2) this).anIntArray8610[i_1041_] * i_1048_) + (((Class528_Sub2) this).anIntArray8580[i_1041_] * i_1049_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_1041_] = ((((Class528_Sub2) this).anIntArray8610[i_1041_] * i_1049_) - (((Class528_Sub2) this).anIntArray8580[i_1041_] * i_1048_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_1041_] = i_1050_;
				}
				((Class528_Sub2) this).anIntArray8580[i_1041_] += ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_1041_] += ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_1041_] += ((Class528_Sub2) this).anInt8613;
			}
		} else if (i == 3) {
			for (int i_1051_ = 0; i_1051_ < ((Class528_Sub2) this).anInt8578; i_1051_++) {
				((Class528_Sub2) this).anIntArray8580[i_1051_] -= ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_1051_] -= ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_1051_] -= ((Class528_Sub2) this).anInt8613;
				((Class528_Sub2) this).anIntArray8580[i_1051_] = (((Class528_Sub2) this).anIntArray8580[i_1051_] * i_1035_ / 128);
				((Class528_Sub2) this).anIntArray8581[i_1051_] = (((Class528_Sub2) this).anIntArray8581[i_1051_] * i_1036_ / 128);
				((Class528_Sub2) this).anIntArray8610[i_1051_] = (((Class528_Sub2) this).anIntArray8610[i_1051_] * i_1037_ / 128);
				((Class528_Sub2) this).anIntArray8580[i_1051_] += ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_1051_] += ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_1051_] += ((Class528_Sub2) this).anInt8613;
			}
		} else if (i == 5) {
			for (int i_1052_ = 0; i_1052_ < ((Class528_Sub2) this).anInt8586; i_1052_++) {
				int i_1053_ = ((((Class528_Sub2) this).aByteArray8602[i_1052_] & 0xff) + i_1035_ * 8);
				if (i_1053_ < 0)
					i_1053_ = 0;
				else if (i_1053_ > 255)
					i_1053_ = 255;
				((Class528_Sub2) this).aByteArray8602[i_1052_] = (byte) i_1053_;
			}
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_1054_ = 0; i_1054_ < ((Class528_Sub2) this).anInt8617; i_1054_++) {
					Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_1054_];
					Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1054_];
					((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & 0xffffff) | 255 - ((((Class528_Sub2) this).aByteArray8602[(((Class193) class193).anInt2393 * 142270897)]) & 0xff) << 24) * -1022818925;
				}
			}
		} else if (i == 7) {
			for (int i_1055_ = 0; i_1055_ < ((Class528_Sub2) this).anInt8586; i_1055_++) {
				int i_1056_ = ((Class528_Sub2) this).aShortArray8604[i_1055_] & 0xffff;
				int i_1057_ = i_1056_ >> 10 & 0x3f;
				int i_1058_ = i_1056_ >> 7 & 0x7;
				int i_1059_ = i_1056_ & 0x7f;
				i_1057_ = i_1057_ + i_1035_ & 0x3f;
				i_1058_ += i_1036_;
				if (i_1058_ < 0)
					i_1058_ = 0;
				else if (i_1058_ > 7)
					i_1058_ = 7;
				i_1059_ += i_1037_;
				if (i_1059_ < 0)
					i_1059_ = 0;
				else if (i_1059_ > 127)
					i_1059_ = 127;
				((Class528_Sub2) this).aShortArray8604[i_1055_] = (short) (i_1057_ << 10 | i_1058_ << 7 | i_1059_);
			}
			((Class528_Sub2) this).aBool8609 = true;
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_1060_ = 0; i_1060_ < ((Class528_Sub2) this).anInt8617; i_1060_++) {
					Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_1060_];
					Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1060_];
					((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | ((Class335.anIntArray3916[Class372.method6362((((Class528_Sub2) this).aShortArray8604[((((Class193) class193).anInt2393) * 142270897)]) & 0xffff, 369062758) & 0xffff]) & 0xffffff)) * -1022818925;
				}
			}
		} else if (i == 8) {
			for (int i_1061_ = 0; i_1061_ < ((Class528_Sub2) this).anInt8617; i_1061_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1061_];
				((Class176) class176).anInt2192 += i_1035_ * -943685543;
				((Class176) class176).anInt2189 += i_1036_ * 1414070385;
			}
		} else if (i == 10) {
			for (int i_1062_ = 0; i_1062_ < ((Class528_Sub2) this).anInt8617; i_1062_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1062_];
				((Class176) class176).aFloat2190 = (((Class176) class176).aFloat2190 * (float) i_1035_ / 128.0F);
				((Class176) class176).aFloat2191 = (((Class176) class176).aFloat2191 * (float) i_1036_ / 128.0F);
			}
		} else if (i == 9) {
			for (int i_1063_ = 0; i_1063_ < ((Class528_Sub2) this).anInt8617; i_1063_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1063_];
				((Class176) class176).anInt2194 = (((Class176) class176).anInt2194 * 156323613 + i_1035_ & 0x3fff) * 2076699445;
			}
		}
	}

	public void method11298(Class294 class294, int i, boolean bool) {
		if (((Class528_Sub2) this).aShortArray8569 != null) {
			Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread());
			Class294 class294_1064_ = ((Class185) class185).aClass294_2316;
			class294_1064_.method5209(class294);
			if (bool)
				class294_1064_.method5207();
			Class384 class384 = ((Class185) class185).aClass384_2317;
			class384.method6522(class294_1064_);
			float[] fs = new float[3];
			for (int i_1065_ = 0; i_1065_ < ((Class528_Sub2) this).anInt8579; i_1065_++) {
				if ((i & ((Class528_Sub2) this).aShortArray8569[i_1065_]) != 0) {
					class384.method6527((float) (((Class528_Sub2) this).anIntArray8580[i_1065_]), (float) (((Class528_Sub2) this).anIntArray8581[i_1065_]), (float) (((Class528_Sub2) this).anIntArray8610[i_1065_]), fs);
					((Class528_Sub2) this).anIntArray8580[i_1065_] = (int) fs[0];
					((Class528_Sub2) this).anIntArray8581[i_1065_] = (int) fs[1];
					((Class528_Sub2) this).anIntArray8610[i_1065_] = (int) fs[2];
				}
			}
		}
	}

	public int ya() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8627;
	}

	public void method11290(Class294 class294, int i, boolean bool) {
		if (((Class528_Sub2) this).aShortArray8569 != null) {
			Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread());
			Class294 class294_1066_ = ((Class185) class185).aClass294_2316;
			class294_1066_.method5209(class294);
			if (bool)
				class294_1066_.method5207();
			Class384 class384 = ((Class185) class185).aClass384_2317;
			class384.method6522(class294_1066_);
			float[] fs = new float[3];
			for (int i_1067_ = 0; i_1067_ < ((Class528_Sub2) this).anInt8579; i_1067_++) {
				if ((i & ((Class528_Sub2) this).aShortArray8569[i_1067_]) != 0) {
					class384.method6527((float) (((Class528_Sub2) this).anIntArray8580[i_1067_]), (float) (((Class528_Sub2) this).anIntArray8581[i_1067_]), (float) (((Class528_Sub2) this).anIntArray8610[i_1067_]), fs);
					((Class528_Sub2) this).anIntArray8580[i_1067_] = (int) fs[0];
					((Class528_Sub2) this).anIntArray8581[i_1067_] = (int) fs[1];
					((Class528_Sub2) this).anIntArray8610[i_1067_] = (int) fs[2];
				}
			}
		}
	}

	public void method11291(Class294 class294, int i, boolean bool) {
		if (((Class528_Sub2) this).aShortArray8569 != null) {
			Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread());
			Class294 class294_1068_ = ((Class185) class185).aClass294_2316;
			class294_1068_.method5209(class294);
			if (bool)
				class294_1068_.method5207();
			Class384 class384 = ((Class185) class185).aClass384_2317;
			class384.method6522(class294_1068_);
			float[] fs = new float[3];
			for (int i_1069_ = 0; i_1069_ < ((Class528_Sub2) this).anInt8579; i_1069_++) {
				if ((i & ((Class528_Sub2) this).aShortArray8569[i_1069_]) != 0) {
					class384.method6527((float) (((Class528_Sub2) this).anIntArray8580[i_1069_]), (float) (((Class528_Sub2) this).anIntArray8581[i_1069_]), (float) (((Class528_Sub2) this).anIntArray8610[i_1069_]), fs);
					((Class528_Sub2) this).anIntArray8580[i_1069_] = (int) fs[0];
					((Class528_Sub2) this).anIntArray8581[i_1069_] = (int) fs[1];
					((Class528_Sub2) this).anIntArray8610[i_1069_] = (int) fs[2];
				}
			}
		}
	}

	public void method11292(Class294 class294, int i, boolean bool) {
		if (((Class528_Sub2) this).aShortArray8569 != null) {
			Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread());
			Class294 class294_1070_ = ((Class185) class185).aClass294_2316;
			class294_1070_.method5209(class294);
			if (bool)
				class294_1070_.method5207();
			Class384 class384 = ((Class185) class185).aClass384_2317;
			class384.method6522(class294_1070_);
			float[] fs = new float[3];
			for (int i_1071_ = 0; i_1071_ < ((Class528_Sub2) this).anInt8579; i_1071_++) {
				if ((i & ((Class528_Sub2) this).aShortArray8569[i_1071_]) != 0) {
					class384.method6527((float) (((Class528_Sub2) this).anIntArray8580[i_1071_]), (float) (((Class528_Sub2) this).anIntArray8581[i_1071_]), (float) (((Class528_Sub2) this).anIntArray8610[i_1071_]), fs);
					((Class528_Sub2) this).anIntArray8580[i_1071_] = (int) fs[0];
					((Class528_Sub2) this).anIntArray8581[i_1071_] = (int) fs[1];
					((Class528_Sub2) this).anIntArray8610[i_1071_] = (int) fs[2];
				}
			}
		}
	}

	public void pa(int i, int i_1072_, Class390 class390, Class390 class390_1073_, int i_1074_, int i_1075_, int i_1076_) {
		if (i == 3) {
			if ((((Class528_Sub2) this).anInt8575 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((((Class528_Sub2) this).anInt8575 & 0x2) != 2)
			throw new IllegalStateException();
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		int i_1077_ = i_1074_ + ((Class528_Sub2) this).aShort8634;
		int i_1078_ = i_1074_ + ((Class528_Sub2) this).aShort8627;
		int i_1079_ = i_1076_ + ((Class528_Sub2) this).aShort8571;
		int i_1080_ = i_1076_ + ((Class528_Sub2) this).aShort8629;
		if (i == 4 || (i_1077_ >= 0 && ((i_1078_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4776 * -1843860823) && i_1079_ >= 0 && ((i_1080_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4773 * 1826078169))) {
			int[][] is = class390.anIntArrayArray4772;
			int[][] is_1081_ = null;
			if (class390_1073_ != null)
				is_1081_ = class390_1073_.anIntArrayArray4772;
			if (i == 4 || i == 5) {
				if (class390_1073_ == null || (i_1077_ < 0 || ((i_1078_ + class390_1073_.anInt4774 * 750971439 >> class390_1073_.anInt4775 * 1856651955) >= class390_1073_.anInt4776 * -1843860823) || i_1079_ < 0 || ((i_1080_ + class390_1073_.anInt4774 * 750971439 >> class390_1073_.anInt4775 * 1856651955) >= class390_1073_.anInt4773 * 1826078169)))
					return;
			} else {
				i_1077_ >>= class390.anInt4775 * 1856651955;
				i_1078_ = (i_1078_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				i_1079_ >>= class390.anInt4775 * 1856651955;
				i_1080_ = (i_1080_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				if (is[i_1077_][i_1079_] == i_1075_ && is[i_1078_][i_1079_] == i_1075_ && is[i_1077_][i_1080_] == i_1075_ && is[i_1078_][i_1080_] == i_1075_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1082_ = class390.anInt4774 * 750971439 - 1;
					for (int i_1083_ = 0; i_1083_ < ((Class528_Sub2) this).anInt8579; i_1083_++) {
						int i_1084_ = (((Class528_Sub2) this).anIntArray8580[i_1083_] + i_1074_);
						int i_1085_ = (((Class528_Sub2) this).anIntArray8610[i_1083_] + i_1076_);
						int i_1086_ = i_1084_ & i_1082_;
						int i_1087_ = i_1085_ & i_1082_;
						int i_1088_ = i_1084_ >> class390.anInt4775 * 1856651955;
						int i_1089_ = i_1085_ >> class390.anInt4775 * 1856651955;
						int i_1090_ = (((is[i_1088_][i_1089_] * (class390.anInt4774 * 750971439 - i_1086_)) + is[i_1088_ + 1][i_1089_] * i_1086_) >> class390.anInt4775 * 1856651955);
						int i_1091_ = (((is[i_1088_][i_1089_ + 1] * (class390.anInt4774 * 750971439 - i_1086_)) + is[i_1088_ + 1][i_1089_ + 1] * i_1086_) >> class390.anInt4775 * 1856651955);
						int i_1092_ = (i_1090_ * (class390.anInt4774 * 750971439 - i_1087_) + i_1091_ * i_1087_ >> class390.anInt4775 * 1856651955);
						((Class528_Sub2) this).anIntArray8581[i_1083_] = (((Class528_Sub2) this).anIntArray8581[i_1083_] + i_1092_ - i_1075_);
					}
					for (int i_1093_ = ((Class528_Sub2) this).anInt8579; i_1093_ < ((Class528_Sub2) this).anInt8578; i_1093_++) {
						int i_1094_ = (((Class528_Sub2) this).anIntArray8580[i_1093_] + i_1074_);
						int i_1095_ = (((Class528_Sub2) this).anIntArray8610[i_1093_] + i_1076_);
						int i_1096_ = i_1094_ & i_1082_;
						int i_1097_ = i_1095_ & i_1082_;
						int i_1098_ = i_1094_ >> class390.anInt4775 * 1856651955;
						int i_1099_ = i_1095_ >> class390.anInt4775 * 1856651955;
						if (i_1098_ >= 0 && i_1098_ < is.length - 1 && i_1099_ >= 0 && i_1099_ < is[0].length - 1) {
							int i_1100_ = (((is[i_1098_][i_1099_] * (class390.anInt4774 * 750971439 - i_1096_)) + is[i_1098_ + 1][i_1099_] * i_1096_) >> class390.anInt4775 * 1856651955);
							int i_1101_ = (((is[i_1098_][i_1099_ + 1] * (class390.anInt4774 * 750971439 - i_1096_)) + is[i_1098_ + 1][i_1099_ + 1] * i_1096_) >> class390.anInt4775 * 1856651955);
							int i_1102_ = (i_1100_ * (class390.anInt4774 * 750971439 - i_1097_) + i_1101_ * i_1097_ >> class390.anInt4775 * 1856651955);
							((Class528_Sub2) this).anIntArray8581[i_1093_] = (((Class528_Sub2) this).anIntArray8581[i_1093_]) + i_1102_ - i_1075_;
						}
					}
				} else if (i == 2) {
					if (((Class528_Sub2) this).aShort8570 == 0)
						return;
					int i_1103_ = class390.anInt4774 * 750971439 - 1;
					for (int i_1104_ = 0; i_1104_ < ((Class528_Sub2) this).anInt8579; i_1104_++) {
						int i_1105_ = ((((Class528_Sub2) this).anIntArray8581[i_1104_] << 16) / ((Class528_Sub2) this).aShort8570);
						if (i_1105_ < i_1072_) {
							int i_1106_ = ((((Class528_Sub2) this).anIntArray8580[i_1104_]) + i_1074_);
							int i_1107_ = ((((Class528_Sub2) this).anIntArray8610[i_1104_]) + i_1076_);
							int i_1108_ = i_1106_ & i_1103_;
							int i_1109_ = i_1107_ & i_1103_;
							int i_1110_ = i_1106_ >> class390.anInt4775 * 1856651955;
							int i_1111_ = i_1107_ >> class390.anInt4775 * 1856651955;
							int i_1112_ = (((is[i_1110_][i_1111_] * (class390.anInt4774 * 750971439 - i_1108_)) + is[i_1110_ + 1][i_1111_] * i_1108_) >> class390.anInt4775 * 1856651955);
							int i_1113_ = (((is[i_1110_][i_1111_ + 1] * (class390.anInt4774 * 750971439 - i_1108_)) + is[i_1110_ + 1][i_1111_ + 1] * i_1108_) >> class390.anInt4775 * 1856651955);
							int i_1114_ = (i_1112_ * (class390.anInt4774 * 750971439 - i_1109_) + i_1113_ * i_1109_ >> class390.anInt4775 * 1856651955);
							((Class528_Sub2) this).anIntArray8581[i_1104_] = ((((Class528_Sub2) this).anIntArray8581[i_1104_]) + ((i_1114_ - i_1075_) * (i_1072_ - i_1105_) / i_1072_));
						} else
							((Class528_Sub2) this).anIntArray8581[i_1104_] = (((Class528_Sub2) this).anIntArray8581[i_1104_]);
					}
					for (int i_1115_ = ((Class528_Sub2) this).anInt8579; i_1115_ < ((Class528_Sub2) this).anInt8578; i_1115_++) {
						int i_1116_ = ((((Class528_Sub2) this).anIntArray8581[i_1115_] << 16) / ((Class528_Sub2) this).aShort8570);
						if (i_1116_ < i_1072_) {
							int i_1117_ = ((((Class528_Sub2) this).anIntArray8580[i_1115_]) + i_1074_);
							int i_1118_ = ((((Class528_Sub2) this).anIntArray8610[i_1115_]) + i_1076_);
							int i_1119_ = i_1117_ & i_1103_;
							int i_1120_ = i_1118_ & i_1103_;
							int i_1121_ = i_1117_ >> class390.anInt4775 * 1856651955;
							int i_1122_ = i_1118_ >> class390.anInt4775 * 1856651955;
							if (i_1121_ >= 0 && (i_1121_ < class390.anInt4776 * -1843860823 - 1) && i_1122_ >= 0 && (i_1122_ < class390.anInt4773 * 1826078169 - 1)) {
								int i_1123_ = (((is[i_1121_][i_1122_] * (class390.anInt4774 * 750971439 - i_1119_)) + is[i_1121_ + 1][i_1122_] * i_1119_) >> class390.anInt4775 * 1856651955);
								int i_1124_ = (((is[i_1121_][i_1122_ + 1] * (class390.anInt4774 * 750971439 - i_1119_)) + (is[i_1121_ + 1][i_1122_ + 1] * i_1119_)) >> class390.anInt4775 * 1856651955);
								int i_1125_ = ((i_1123_ * (class390.anInt4774 * 750971439 - i_1120_)) + i_1124_ * i_1120_ >> class390.anInt4775 * 1856651955);
								((Class528_Sub2) this).anIntArray8581[i_1115_] = ((((Class528_Sub2) this).anIntArray8581[i_1115_]) + ((i_1125_ - i_1075_) * (i_1072_ - i_1116_) / i_1072_));
							}
						} else
							((Class528_Sub2) this).anIntArray8581[i_1115_] = (((Class528_Sub2) this).anIntArray8581[i_1115_]);
					}
				} else if (i == 3) {
					int i_1126_ = (i_1072_ & 0xff) * 4;
					int i_1127_ = (i_1072_ >> 8 & 0xff) * 4;
					int i_1128_ = (i_1072_ >> 16 & 0xff) << 6;
					int i_1129_ = (i_1072_ >> 24 & 0xff) << 6;
					if (i_1074_ - (i_1126_ >> 1) < 0 || ((i_1074_ + (i_1126_ >> 1) + class390.anInt4774 * 750971439) >= (class390.anInt4776 * -1843860823 << class390.anInt4775 * 1856651955)) || i_1076_ - (i_1127_ >> 1) < 0 || ((i_1076_ + (i_1127_ >> 1) + class390.anInt4774 * 750971439) >= (class390.anInt4773 * 1826078169 << class390.anInt4775 * 1856651955)))
						return;
					method11281(class390, i_1074_, i_1075_, i_1076_, i_1126_, i_1127_, i_1128_, i_1129_);
				} else if (i == 4) {
					int i_1130_ = class390_1073_.anInt4774 * 750971439 - 1;
					int i_1131_ = (((Class528_Sub2) this).aShort8625 - ((Class528_Sub2) this).aShort8570);
					for (int i_1132_ = 0; i_1132_ < ((Class528_Sub2) this).anInt8579; i_1132_++) {
						int i_1133_ = (((Class528_Sub2) this).anIntArray8580[i_1132_] + i_1074_);
						int i_1134_ = (((Class528_Sub2) this).anIntArray8610[i_1132_] + i_1076_);
						int i_1135_ = i_1133_ & i_1130_;
						int i_1136_ = i_1134_ & i_1130_;
						int i_1137_ = i_1133_ >> class390_1073_.anInt4775 * 1856651955;
						int i_1138_ = i_1134_ >> class390_1073_.anInt4775 * 1856651955;
						int i_1139_ = (((is_1081_[i_1137_][i_1138_] * (class390_1073_.anInt4774 * 750971439 - i_1135_)) + is_1081_[i_1137_ + 1][i_1138_] * i_1135_) >> class390_1073_.anInt4775 * 1856651955);
						int i_1140_ = (((is_1081_[i_1137_][i_1138_ + 1] * (class390_1073_.anInt4774 * 750971439 - i_1135_)) + is_1081_[i_1137_ + 1][i_1138_ + 1] * i_1135_) >> class390_1073_.anInt4775 * 1856651955);
						int i_1141_ = (i_1139_ * (class390_1073_.anInt4774 * 750971439 - i_1136_) + i_1140_ * i_1136_ >> class390_1073_.anInt4775 * 1856651955);
						((Class528_Sub2) this).anIntArray8581[i_1132_] = (((Class528_Sub2) this).anIntArray8581[i_1132_] + (i_1141_ - i_1075_) + i_1131_);
					}
					for (int i_1142_ = ((Class528_Sub2) this).anInt8579; i_1142_ < ((Class528_Sub2) this).anInt8578; i_1142_++) {
						int i_1143_ = (((Class528_Sub2) this).anIntArray8580[i_1142_] + i_1074_);
						int i_1144_ = (((Class528_Sub2) this).anIntArray8610[i_1142_] + i_1076_);
						int i_1145_ = i_1143_ & i_1130_;
						int i_1146_ = i_1144_ & i_1130_;
						int i_1147_ = i_1143_ >> class390_1073_.anInt4775 * 1856651955;
						int i_1148_ = i_1144_ >> class390_1073_.anInt4775 * 1856651955;
						if (i_1147_ >= 0 && (i_1147_ < class390_1073_.anInt4776 * -1843860823 - 1) && i_1148_ >= 0 && (i_1148_ < class390_1073_.anInt4773 * 1826078169 - 1)) {
							int i_1149_ = (((is_1081_[i_1147_][i_1148_] * (class390_1073_.anInt4774 * 750971439 - i_1145_)) + is_1081_[i_1147_ + 1][i_1148_] * i_1145_) >> class390_1073_.anInt4775 * 1856651955);
							int i_1150_ = (((is_1081_[i_1147_][i_1148_ + 1] * (class390_1073_.anInt4774 * 750971439 - i_1145_)) + (is_1081_[i_1147_ + 1][i_1148_ + 1] * i_1145_)) >> class390_1073_.anInt4775 * 1856651955);
							int i_1151_ = ((i_1149_ * (class390_1073_.anInt4774 * 750971439 - i_1146_)) + i_1150_ * i_1146_ >> class390_1073_.anInt4775 * 1856651955);
							((Class528_Sub2) this).anIntArray8581[i_1142_] = (((Class528_Sub2) this).anIntArray8581[i_1142_]) + (i_1151_ - i_1075_) + i_1131_;
						}
					}
				} else if (i == 5) {
					int i_1152_ = class390_1073_.anInt4774 * 750971439 - 1;
					int i_1153_ = (((Class528_Sub2) this).aShort8625 - ((Class528_Sub2) this).aShort8570);
					for (int i_1154_ = 0; i_1154_ < ((Class528_Sub2) this).anInt8579; i_1154_++) {
						int i_1155_ = (((Class528_Sub2) this).anIntArray8580[i_1154_] + i_1074_);
						int i_1156_ = (((Class528_Sub2) this).anIntArray8610[i_1154_] + i_1076_);
						int i_1157_ = i_1155_ & i_1152_;
						int i_1158_ = i_1156_ & i_1152_;
						int i_1159_ = i_1155_ >> class390.anInt4775 * 1856651955;
						int i_1160_ = i_1156_ >> class390.anInt4775 * 1856651955;
						int i_1161_ = (((is[i_1159_][i_1160_] * (class390.anInt4774 * 750971439 - i_1157_)) + is[i_1159_ + 1][i_1160_] * i_1157_) >> class390.anInt4775 * 1856651955);
						int i_1162_ = (((is[i_1159_][i_1160_ + 1] * (class390.anInt4774 * 750971439 - i_1157_)) + is[i_1159_ + 1][i_1160_ + 1] * i_1157_) >> class390.anInt4775 * 1856651955);
						int i_1163_ = (i_1161_ * (class390.anInt4774 * 750971439 - i_1158_) + i_1162_ * i_1158_ >> class390.anInt4775 * 1856651955);
						i_1161_ = (((is_1081_[i_1159_][i_1160_] * (class390_1073_.anInt4774 * 750971439 - i_1157_)) + is_1081_[i_1159_ + 1][i_1160_] * i_1157_) >> class390_1073_.anInt4775 * 1856651955);
						i_1162_ = (((is_1081_[i_1159_][i_1160_ + 1] * (class390_1073_.anInt4774 * 750971439 - i_1157_)) + is_1081_[i_1159_ + 1][i_1160_ + 1] * i_1157_) >> class390_1073_.anInt4775 * 1856651955);
						int i_1164_ = (i_1161_ * (class390_1073_.anInt4774 * 750971439 - i_1158_) + i_1162_ * i_1158_ >> class390_1073_.anInt4775 * 1856651955);
						int i_1165_ = i_1163_ - i_1164_ - i_1072_;
						((Class528_Sub2) this).anIntArray8581[i_1154_] = ((((Class528_Sub2) this).anIntArray8581[i_1154_] << 8) / i_1153_ * i_1165_ >> 8) - (i_1075_ - i_1163_);
					}
					for (int i_1166_ = ((Class528_Sub2) this).anInt8579; i_1166_ < ((Class528_Sub2) this).anInt8578; i_1166_++) {
						int i_1167_ = (((Class528_Sub2) this).anIntArray8580[i_1166_] + i_1074_);
						int i_1168_ = (((Class528_Sub2) this).anIntArray8610[i_1166_] + i_1076_);
						int i_1169_ = i_1167_ & i_1152_;
						int i_1170_ = i_1168_ & i_1152_;
						int i_1171_ = i_1167_ >> class390.anInt4775 * 1856651955;
						int i_1172_ = i_1168_ >> class390.anInt4775 * 1856651955;
						if (i_1171_ >= 0 && i_1171_ < class390.anInt4776 * -1843860823 - 1 && (i_1171_ < class390_1073_.anInt4776 * -1843860823 - 1) && i_1172_ >= 0 && i_1172_ < class390.anInt4773 * 1826078169 - 1 && (i_1172_ < class390_1073_.anInt4773 * 1826078169 - 1)) {
							int i_1173_ = (((is[i_1171_][i_1172_] * (class390.anInt4774 * 750971439 - i_1169_)) + is[i_1171_ + 1][i_1172_] * i_1169_) >> class390.anInt4775 * 1856651955);
							int i_1174_ = (((is[i_1171_][i_1172_ + 1] * (class390.anInt4774 * 750971439 - i_1169_)) + is[i_1171_ + 1][i_1172_ + 1] * i_1169_) >> class390.anInt4775 * 1856651955);
							int i_1175_ = (i_1173_ * (class390.anInt4774 * 750971439 - i_1170_) + i_1174_ * i_1170_ >> class390.anInt4775 * 1856651955);
							i_1173_ = (((is_1081_[i_1171_][i_1172_] * (class390_1073_.anInt4774 * 750971439 - i_1169_)) + is_1081_[i_1171_ + 1][i_1172_] * i_1169_) >> class390_1073_.anInt4775 * 1856651955);
							i_1174_ = (((is_1081_[i_1171_][i_1172_ + 1] * (class390_1073_.anInt4774 * 750971439 - i_1169_)) + (is_1081_[i_1171_ + 1][i_1172_ + 1] * i_1169_)) >> class390_1073_.anInt4775 * 1856651955);
							int i_1176_ = ((i_1173_ * (class390_1073_.anInt4774 * 750971439 - i_1170_)) + i_1174_ * i_1170_ >> class390_1073_.anInt4775 * 1856651955);
							int i_1177_ = i_1175_ - i_1176_ - i_1072_;
							((Class528_Sub2) this).anIntArray8581[i_1166_] = (((((Class528_Sub2) this).anIntArray8581[i_1166_]) << 8) / i_1153_ * i_1177_ >> 8) - (i_1075_ - i_1175_);
						}
					}
				}
				((Class528_Sub2) this).aBool8621 = false;
			}
		}
	}

	void method13858(Class294 class294, Class275_Sub5 class275_sub5, int i) {
		if (((Class528_Sub2) this).anInt8579 >= 1) {
			Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread());
			Class384 class384 = ((Class185) class185).aClass384_2317;
			class384.method6522(class294);
			Class384 class384_1178_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8994);
			Class384 class384_1179_ = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8995);
			if (!((Class528_Sub2) this).aBool8621)
				method13876();
			boolean bool = class384.method6526();
			float[] fs = ((Class185) class185).aFloatArray2324;
			class384.method6527(0.0F, (float) ((Class528_Sub2) this).aShort8570, 0.0F, fs);
			float f = fs[0];
			float f_1180_ = fs[1];
			float f_1181_ = fs[2];
			class384.method6527(0.0F, (float) ((Class528_Sub2) this).aShort8625, 0.0F, fs);
			float f_1182_ = fs[0];
			float f_1183_ = fs[1];
			float f_1184_ = fs[2];
			for (int i_1185_ = 0; i_1185_ < 6; i_1185_++) {
				float[] fs_1186_ = (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloatArrayArray8989[i_1185_]);
				float f_1187_ = (fs_1186_[0] * f + fs_1186_[1] * f_1180_ + fs_1186_[2] * f_1181_ + fs_1186_[3] + (float) ((Class528_Sub2) this).aShort8595);
				float f_1188_ = (fs_1186_[0] * f_1182_ + fs_1186_[1] * f_1183_ + fs_1186_[2] * f_1184_ + fs_1186_[3] + (float) ((Class528_Sub2) this).aShort8595);
				if (f_1187_ < 0.0F && f_1188_ < 0.0F)
					return;
			}
			float f_1189_;
			float f_1190_;
			if (bool) {
				f_1189_ = class384_1178_.aFloatArray4667[14];
				f_1190_ = class384_1178_.aFloatArray4667[6];
			} else {
				f_1189_ = ((class384.aFloatArray4667[12] * class384_1178_.aFloatArray4667[2]) + (class384.aFloatArray4667[13] * class384_1178_.aFloatArray4667[6]) + (class384.aFloatArray4667[14] * class384_1178_.aFloatArray4667[10]) + class384_1178_.aFloatArray4667[14]);
				f_1190_ = ((class384.aFloatArray4667[4] * class384_1178_.aFloatArray4667[2]) + (class384.aFloatArray4667[5] * class384_1178_.aFloatArray4667[6]) + (class384.aFloatArray4667[6] * class384_1178_.aFloatArray4667[10]));
			}
			float f_1191_ = (f_1189_ + (float) ((Class528_Sub2) this).aShort8570 * f_1190_);
			float f_1192_ = (f_1189_ + (float) ((Class528_Sub2) this).aShort8625 * f_1190_);
			float f_1193_ = (f_1191_ > f_1192_ ? f_1191_ + (float) ((Class528_Sub2) this).aShort8595 : f_1192_ + (float) ((Class528_Sub2) this).aShort8595);
			float f_1194_ = (class384_1179_.aFloatArray4667[10] * f_1193_ + class384_1179_.aFloatArray4667[14]);
			if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
				synchronized (this) {
					while (((Class528_Sub2) this).aBool8563) {
						try {
							this.wait();
						} catch (InterruptedException interruptedexception) {
							/* empty */
						}
					}
					((Class528_Sub2) this).aBool8563 = true;
				}
			}
			method13795(class185);
			Class384 class384_1195_ = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2318);
			class384_1195_.method6562(class384);
			class384_1195_.method6523(((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aClass384_8996);
			if ((i & 0x2) != 0)
				((Class528_Sub2) this).aClass144_8566.method2418(true);
			else
				((Class528_Sub2) this).aClass144_8566.method2418(false);
			boolean bool_1196_ = false;
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2326 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1679);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2332 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1702);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2311 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1683);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2308 = 1.0F / (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1683);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2331 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1678);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2333 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1680);
			((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335 = (((Class144) ((Class528_Sub2) this).aClass144_8566).aFloat1682);
			((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2337 = (((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1684 * -992859573);
			for (int i_1197_ = 0; i_1197_ < ((Class528_Sub2) this).anInt8578; i_1197_++) {
				int i_1198_ = ((Class528_Sub2) this).anIntArray8580[i_1197_];
				int i_1199_ = ((Class528_Sub2) this).anIntArray8581[i_1197_];
				int i_1200_ = ((Class528_Sub2) this).anIntArray8610[i_1197_];
				float f_1201_ = (class384_1195_.aFloatArray4667[0] * (float) i_1198_ + class384_1195_.aFloatArray4667[4] * (float) i_1199_ + class384_1195_.aFloatArray4667[8] * (float) i_1200_ + class384_1195_.aFloatArray4667[12]);
				float f_1202_ = (class384_1195_.aFloatArray4667[1] * (float) i_1198_ + class384_1195_.aFloatArray4667[5] * (float) i_1199_ + class384_1195_.aFloatArray4667[9] * (float) i_1200_ + class384_1195_.aFloatArray4667[13]);
				float f_1203_ = (class384_1195_.aFloatArray4667[2] * (float) i_1198_ + class384_1195_.aFloatArray4667[6] * (float) i_1199_ + class384_1195_.aFloatArray4667[10] * (float) i_1200_ + class384_1195_.aFloatArray4667[14]);
				float f_1204_ = (class384_1195_.aFloatArray4667[3] * (float) i_1198_ + class384_1195_.aFloatArray4667[7] * (float) i_1199_ + class384_1195_.aFloatArray4667[11] * (float) i_1200_ + class384_1195_.aFloatArray4667[15]);
				((Class528_Sub2) this).aFloatArray8636[i_1197_] = ((((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335) + (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2311) * f_1203_ / f_1204_);
				((Class528_Sub2) this).aFloatArray8637[i_1197_] = f_1204_;
				if (f_1203_ >= -f_1204_) {
					((Class528_Sub2) this).aFloatArray8590[i_1197_] = (float) (int) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2331) + (((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2326) * f_1201_ / f_1204_);
					((Class528_Sub2) this).aFloatArray8605[i_1197_] = (float) (int) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2333) + (((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2332) * f_1202_ / f_1204_);
				} else {
					((Class528_Sub2) this).aFloatArray8590[i_1197_] = -5000.0F;
					bool_1196_ = true;
				}
				if (((Class185) ((Class528_Sub2) this).aClass185_8564).aBool2309)
					((Class528_Sub2) this).anIntArray8633[i_1197_] = (int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) i_1198_) + (class384.aFloatArray4667[5] * (float) i_1199_) + (class384.aFloatArray4667[9] * (float) i_1200_)));
			}
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_1205_ = 0; i_1205_ < ((Class528_Sub2) this).anInt8617; i_1205_++) {
					Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_1205_];
					Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1205_];
					short i_1206_ = (((Class528_Sub2) this).aShortArray8587[((Class193) class193).anInt2393 * 142270897]);
					short i_1207_ = (((Class528_Sub2) this).aShortArray8588[((Class193) class193).anInt2393 * 142270897]);
					short i_1208_ = (((Class528_Sub2) this).aShortArray8642[((Class193) class193).anInt2393 * 142270897]);
					int i_1209_ = ((((Class528_Sub2) this).anIntArray8580[i_1206_] + ((Class528_Sub2) this).anIntArray8580[i_1207_] + ((Class528_Sub2) this).anIntArray8580[i_1208_]) / 3);
					int i_1210_ = ((((Class528_Sub2) this).anIntArray8581[i_1206_] + ((Class528_Sub2) this).anIntArray8581[i_1207_] + ((Class528_Sub2) this).anIntArray8581[i_1208_]) / 3);
					int i_1211_ = ((((Class528_Sub2) this).anIntArray8610[i_1206_] + ((Class528_Sub2) this).anIntArray8610[i_1207_] + ((Class528_Sub2) this).anIntArray8610[i_1208_]) / 3);
					float f_1212_ = (class384_1195_.aFloatArray4667[0] * (float) i_1209_ + (class384_1195_.aFloatArray4667[4] * (float) i_1210_) + (class384_1195_.aFloatArray4667[8] * (float) i_1211_) + class384_1195_.aFloatArray4667[12]);
					float f_1213_ = (class384_1195_.aFloatArray4667[1] * (float) i_1209_ + (class384_1195_.aFloatArray4667[5] * (float) i_1210_) + (class384_1195_.aFloatArray4667[9] * (float) i_1211_) + class384_1195_.aFloatArray4667[13]);
					float f_1214_ = (class384_1195_.aFloatArray4667[2] * (float) i_1209_ + (class384_1195_.aFloatArray4667[6] * (float) i_1210_) + (class384_1195_.aFloatArray4667[10] * (float) i_1211_) + class384_1195_.aFloatArray4667[14]);
					float f_1215_ = (class384_1195_.aFloatArray4667[3] * (float) i_1209_ + (class384_1195_.aFloatArray4667[7] * (float) i_1210_) + (class384_1195_.aFloatArray4667[11] * (float) i_1211_) + class384_1195_.aFloatArray4667[15]);
					f_1214_ += ((class384_1179_.aFloatArray4667[2] * (float) (((Class176) class176).anInt2192 * -310982679)) + (class384_1179_.aFloatArray4667[6] * (float) (((Class176) class176).anInt2189 * 1349697681)));
					f_1215_ += ((class384_1179_.aFloatArray4667[3] * (float) (((Class176) class176).anInt2192 * -310982679)) + (class384_1179_.aFloatArray4667[7] * (float) (((Class176) class176).anInt2189 * 1349697681)));
					if (f_1214_ > -f_1215_) {
						f_1212_ += ((class384_1179_.aFloatArray4667[0] * (float) (((Class176) class176).anInt2192 * -310982679)) + (class384_1179_.aFloatArray4667[4] * (float) (((Class176) class176).anInt2189 * 1349697681)));
						f_1213_ += ((class384_1179_.aFloatArray4667[1] * (float) (((Class176) class176).anInt2192 * -310982679)) + (class384_1179_.aFloatArray4667[5] * (float) (((Class176) class176).anInt2189 * 1349697681)));
						float f_1216_ = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8976) * f_1212_ / f_1215_);
						float f_1217_ = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9004) * f_1213_ / f_1215_);
						float f_1218_ = (((Class176) class176).aFloat2190 * (float) ((Class193) class193).aShort2394);
						float f_1219_ = (((Class176) class176).aFloat2191 * (float) ((Class193) class193).aShort2395);
						float f_1220_ = (f_1212_ + class384_1179_.aFloatArray4667[0] * f_1218_ + class384_1179_.aFloatArray4667[4] * f_1219_);
						float f_1221_ = (f_1213_ + class384_1179_.aFloatArray4667[1] * f_1218_ + class384_1179_.aFloatArray4667[5] * f_1219_);
						float f_1222_ = (f_1215_ + class384_1179_.aFloatArray4667[3] * f_1218_ + class384_1179_.aFloatArray4667[7] * f_1219_);
						float f_1223_ = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8976) * f_1220_ / f_1222_);
						float f_1224_ = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9004) * f_1221_ / f_1222_);
						((Class176) class176).anInt2195 = (int) f_1216_ * 1832369091;
						((Class176) class176).anInt2196 = (int) f_1217_ * 1544556155;
						((Class176) class176).aFloat2193 = ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8985) + ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8978) * (f_1214_ - (class384_1179_.aFloatArray4667[10] * (float) ((((Class193) class193).anInt2400) * 219886141))) / f_1215_));
						((Class176) class176).anInt2197 = (int) (f_1223_ < f_1216_ ? f_1216_ - f_1223_ : f_1223_ - f_1216_) * -710849997;
						((Class176) class176).anInt2198 = (int) (f_1224_ < f_1217_ ? f_1217_ - f_1224_ : f_1224_ - f_1217_) * 1185210621;
					} else {
						Class176 class176_1225_ = class176;
						((Class176) class176).anInt2198 = 0;
						((Class176) class176_1225_).anInt2197 = 0;
					}
				}
			}
			if (class275_sub5 != null) {
				boolean bool_1226_ = false;
				boolean bool_1227_ = true;
				int i_1228_ = ((((Class528_Sub2) this).aShort8634 + ((Class528_Sub2) this).aShort8627) >> 1);
				int i_1229_ = ((((Class528_Sub2) this).aShort8571 + ((Class528_Sub2) this).aShort8629) >> 1);
				int i_1230_ = i_1228_;
				short i_1231_ = ((Class528_Sub2) this).aShort8570;
				int i_1232_ = i_1229_;
				float f_1233_ = (class384_1195_.aFloatArray4667[0] * (float) i_1230_ + class384_1195_.aFloatArray4667[4] * (float) i_1231_ + class384_1195_.aFloatArray4667[8] * (float) i_1232_ + class384_1195_.aFloatArray4667[12]);
				float f_1234_ = (class384_1195_.aFloatArray4667[1] * (float) i_1230_ + class384_1195_.aFloatArray4667[5] * (float) i_1231_ + class384_1195_.aFloatArray4667[9] * (float) i_1232_ + class384_1195_.aFloatArray4667[13]);
				float f_1235_ = (class384_1195_.aFloatArray4667[2] * (float) i_1230_ + class384_1195_.aFloatArray4667[6] * (float) i_1231_ + class384_1195_.aFloatArray4667[10] * (float) i_1232_ + class384_1195_.aFloatArray4667[14]);
				float f_1236_ = (class384_1195_.aFloatArray4667[3] * (float) i_1230_ + class384_1195_.aFloatArray4667[7] * (float) i_1231_ + class384_1195_.aFloatArray4667[11] * (float) i_1232_ + class384_1195_.aFloatArray4667[15]);
				if (f_1235_ >= -f_1236_) {
					class275_sub5.anInt7847 = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976) * f_1233_ / f_1236_);
					class275_sub5.anInt7848 = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004) * f_1234_ / f_1236_);
				} else
					bool_1226_ = true;
				i_1230_ = i_1228_;
				i_1231_ = ((Class528_Sub2) this).aShort8625;
				i_1232_ = i_1229_;
				float f_1237_ = (class384_1195_.aFloatArray4667[0] * (float) i_1230_ + class384_1195_.aFloatArray4667[4] * (float) i_1231_ + class384_1195_.aFloatArray4667[8] * (float) i_1232_ + class384_1195_.aFloatArray4667[12]);
				float f_1238_ = (class384_1195_.aFloatArray4667[1] * (float) i_1230_ + class384_1195_.aFloatArray4667[5] * (float) i_1231_ + class384_1195_.aFloatArray4667[9] * (float) i_1232_ + class384_1195_.aFloatArray4667[13]);
				float f_1239_ = (class384_1195_.aFloatArray4667[2] * (float) i_1230_ + class384_1195_.aFloatArray4667[6] * (float) i_1231_ + class384_1195_.aFloatArray4667[10] * (float) i_1232_ + class384_1195_.aFloatArray4667[14]);
				float f_1240_ = (class384_1195_.aFloatArray4667[3] * (float) i_1230_ + class384_1195_.aFloatArray4667[7] * (float) i_1231_ + class384_1195_.aFloatArray4667[11] * (float) i_1232_ + class384_1195_.aFloatArray4667[15]);
				if (f_1239_ >= -f_1240_) {
					class275_sub5.anInt7850 = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976) * f_1237_ / f_1240_);
					class275_sub5.anInt7846 = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004) * f_1238_ / f_1240_);
				} else
					bool_1226_ = true;
				if (bool_1226_) {
					if (f_1235_ < -f_1236_ && f_1239_ < -f_1240_)
						bool_1227_ = false;
					else if (f_1235_ < -f_1236_) {
						float f_1241_ = (f_1235_ + f_1236_) / (f_1239_ + f_1240_) - 1.0F;
						float f_1242_ = f_1233_ + f_1241_ * (f_1237_ - f_1233_);
						float f_1243_ = f_1234_ + f_1241_ * (f_1238_ - f_1234_);
						float f_1244_ = f_1236_ + f_1241_ * (f_1240_ - f_1236_);
						class275_sub5.anInt7847 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_1242_ / f_1244_));
						class275_sub5.anInt7848 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004 * f_1243_ / f_1244_));
					} else if (f_1239_ < -f_1240_) {
						float f_1245_ = (f_1239_ + f_1240_) / (f_1235_ + f_1236_) - 1.0F;
						float f_1246_ = f_1237_ + f_1245_ * (f_1233_ - f_1237_);
						float f_1247_ = f_1238_ + f_1245_ * (f_1234_ - f_1238_);
						float f_1248_ = f_1240_ + f_1245_ * (f_1236_ - f_1240_);
						class275_sub5.anInt7850 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_1246_ / f_1248_));
						class275_sub5.anInt7846 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8982) + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004 * f_1247_ / f_1248_));
					}
				}
				if (bool_1227_) {
					if (f_1235_ / f_1236_ > f_1239_ / f_1240_) {
						float f_1249_ = (f_1233_ + (class384_1179_.aFloatArray4667[0] * (float) ((Class528_Sub2) this).aShort8595) + class384_1179_.aFloatArray4667[12]);
						float f_1250_ = (f_1236_ + (class384_1179_.aFloatArray4667[3] * (float) ((Class528_Sub2) this).aShort8595) + class384_1179_.aFloatArray4667[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) - (float) class275_sub5.anInt7847 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_1249_ / f_1250_));
					} else {
						float f_1251_ = (f_1237_ + (class384_1179_.aFloatArray4667[0] * (float) ((Class528_Sub2) this).aShort8595) + class384_1179_.aFloatArray4667[12]);
						float f_1252_ = (f_1240_ + (class384_1179_.aFloatArray4667[3] * (float) ((Class528_Sub2) this).aShort8595) + class384_1179_.aFloatArray4667[15]);
						class275_sub5.anInt7851 = (int) ((((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003) - (float) class275_sub5.anInt7850 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_1251_ / f_1252_));
					}
					class275_sub5.aBool7849 = true;
				}
			}
			method13853(true);
			((Class144) ((Class528_Sub2) this).aClass144_8566).aBool1675 = (i & 0x1) == 0;
			((Class144) ((Class528_Sub2) this).aClass144_8566).aBool1672 = false;
			try {
				method13817((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anIntArray8979) != null, (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloatArray9010) != null, (i & 0x4) != 0, bool_1196_, ((((Class185) ((Class528_Sub2) this).aClass185_8564).aBool2304 && f_1194_ > (((Class185) (((Class528_Sub2) this).aClass185_8564)).aFloat2305)) || ((Class185) (((Class528_Sub2) this).aClass185_8564)).aBool2309));
			} catch (Exception exception) {
				/* empty */
			}
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_1253_ = 0; i_1253_ < ((Class528_Sub2) this).anInt8586; i_1253_++)
					((Class528_Sub2) this).anIntArray8643[i_1253_] = -1;
			}
			((Class528_Sub2) this).aClass144_8566 = null;
			if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
				synchronized (this) {
					((Class528_Sub2) this).aBool8563 = false;
					this.notifyAll();
				}
			}
		}
	}

	final void method13859(boolean bool, boolean bool_1254_, boolean bool_1255_, boolean bool_1256_, boolean bool_1257_) {
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8617; i++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i];
				((Class528_Sub2) this).anIntArray8643[((Class193) class193).anInt2393 * 142270897] = i;
			}
		}
		if (((Class528_Sub2) this).aBool8630 || ((Class528_Sub2) this).aClass193Array8618 != null) {
			if ((((Class528_Sub2) this).anInt8575 & 0x100) == 0 && ((Class528_Sub2) this).aShortArray8623 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					short i_1258_ = ((Class528_Sub2) this).aShortArray8623[i];
					method13868(bool, bool_1254_, bool_1255_, i_1258_, bool_1256_, bool_1257_);
				}
			} else {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (!method13816(i) && !method13803(i))
						method13868(bool, bool_1254_, bool_1255_, i, bool_1256_, bool_1257_);
				}
				if (((Class528_Sub2) this).aByteArray8601 == null) {
					for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
						if (method13816(i) || method13803(i))
							method13868(bool, bool_1254_, bool_1255_, i, bool_1256_, bool_1257_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_1259_ = 0; i_1259_ < ((Class528_Sub2) this).anInt8586; i_1259_++) {
							if ((((Class528_Sub2) this).aByteArray8601[i_1259_] == i) && (method13816(i_1259_) || method13803(i_1259_)))
								method13868(bool, bool_1254_, bool_1255_, i_1259_, bool_1256_, bool_1257_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++)
				method13868(bool, bool_1254_, bool_1255_, i, bool_1256_, bool_1257_);
		}
	}

	void method13860(Class185 class185) {
		((Class528_Sub2) this).aClass144_8566 = ((Class185) class185).aClass144_2310;
		if (class185 != ((Class528_Sub2) this).aClass185_8564) {
			((Class528_Sub2) this).aClass185_8564 = class185;
			((Class528_Sub2) this).anIntArray8633 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2319);
			((Class528_Sub2) this).aFloatArray8590 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2302);
			((Class528_Sub2) this).aFloatArray8605 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2341);
			((Class528_Sub2) this).aFloatArray8636 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2322);
			((Class528_Sub2) this).aFloatArray8637 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloatArray2323);
			((Class528_Sub2) this).anIntArray8583 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2321);
			((Class528_Sub2) this).anIntArray8639 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2325);
			((Class528_Sub2) this).anIntArray8628 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2312);
			((Class528_Sub2) this).anIntArray8567 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2327);
			((Class528_Sub2) this).anIntArray8619 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2328);
			((Class528_Sub2) this).anIntArray8643 = (((Class185) ((Class528_Sub2) this).aClass185_8564).anIntArray2329);
		}
	}

	final void method13861(boolean bool, boolean bool_1260_, boolean bool_1261_, boolean bool_1262_, boolean bool_1263_) {
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8617; i++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i];
				((Class528_Sub2) this).anIntArray8643[((Class193) class193).anInt2393 * 142270897] = i;
			}
		}
		if (((Class528_Sub2) this).aBool8630 || ((Class528_Sub2) this).aClass193Array8618 != null) {
			if ((((Class528_Sub2) this).anInt8575 & 0x100) == 0 && ((Class528_Sub2) this).aShortArray8623 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					short i_1264_ = ((Class528_Sub2) this).aShortArray8623[i];
					method13868(bool, bool_1260_, bool_1261_, i_1264_, bool_1262_, bool_1263_);
				}
			} else {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (!method13816(i) && !method13803(i))
						method13868(bool, bool_1260_, bool_1261_, i, bool_1262_, bool_1263_);
				}
				if (((Class528_Sub2) this).aByteArray8601 == null) {
					for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
						if (method13816(i) || method13803(i))
							method13868(bool, bool_1260_, bool_1261_, i, bool_1262_, bool_1263_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_1265_ = 0; i_1265_ < ((Class528_Sub2) this).anInt8586; i_1265_++) {
							if ((((Class528_Sub2) this).aByteArray8601[i_1265_] == i) && (method13816(i_1265_) || method13803(i_1265_)))
								method13868(bool, bool_1260_, bool_1261_, i_1265_, bool_1262_, bool_1263_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++)
				method13868(bool, bool_1260_, bool_1261_, i, bool_1262_, bool_1263_);
		}
	}

	final void method13862(boolean bool, boolean bool_1266_, boolean bool_1267_, boolean bool_1268_, boolean bool_1269_) {
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8617; i++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i];
				((Class528_Sub2) this).anIntArray8643[((Class193) class193).anInt2393 * 142270897] = i;
			}
		}
		if (((Class528_Sub2) this).aBool8630 || ((Class528_Sub2) this).aClass193Array8618 != null) {
			if ((((Class528_Sub2) this).anInt8575 & 0x100) == 0 && ((Class528_Sub2) this).aShortArray8623 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					short i_1270_ = ((Class528_Sub2) this).aShortArray8623[i];
					method13868(bool, bool_1266_, bool_1267_, i_1270_, bool_1268_, bool_1269_);
				}
			} else {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (!method13816(i) && !method13803(i))
						method13868(bool, bool_1266_, bool_1267_, i, bool_1268_, bool_1269_);
				}
				if (((Class528_Sub2) this).aByteArray8601 == null) {
					for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
						if (method13816(i) || method13803(i))
							method13868(bool, bool_1266_, bool_1267_, i, bool_1268_, bool_1269_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_1271_ = 0; i_1271_ < ((Class528_Sub2) this).anInt8586; i_1271_++) {
							if ((((Class528_Sub2) this).aByteArray8601[i_1271_] == i) && (method13816(i_1271_) || method13803(i_1271_)))
								method13868(bool, bool_1266_, bool_1267_, i_1271_, bool_1268_, bool_1269_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++)
				method13868(bool, bool_1266_, bool_1267_, i, bool_1268_, bool_1269_);
		}
	}

	final void method13863(boolean bool, boolean bool_1272_, boolean bool_1273_, boolean bool_1274_, boolean bool_1275_) {
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8617; i++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i];
				((Class528_Sub2) this).anIntArray8643[((Class193) class193).anInt2393 * 142270897] = i;
			}
		}
		if (((Class528_Sub2) this).aBool8630 || ((Class528_Sub2) this).aClass193Array8618 != null) {
			if ((((Class528_Sub2) this).anInt8575 & 0x100) == 0 && ((Class528_Sub2) this).aShortArray8623 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					short i_1276_ = ((Class528_Sub2) this).aShortArray8623[i];
					method13868(bool, bool_1272_, bool_1273_, i_1276_, bool_1274_, bool_1275_);
				}
			} else {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (!method13816(i) && !method13803(i))
						method13868(bool, bool_1272_, bool_1273_, i, bool_1274_, bool_1275_);
				}
				if (((Class528_Sub2) this).aByteArray8601 == null) {
					for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
						if (method13816(i) || method13803(i))
							method13868(bool, bool_1272_, bool_1273_, i, bool_1274_, bool_1275_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_1277_ = 0; i_1277_ < ((Class528_Sub2) this).anInt8586; i_1277_++) {
							if ((((Class528_Sub2) this).aByteArray8601[i_1277_] == i) && (method13816(i_1277_) || method13803(i_1277_)))
								method13868(bool, bool_1272_, bool_1273_, i_1277_, bool_1274_, bool_1275_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++)
				method13868(bool, bool_1272_, bool_1273_, i, bool_1274_, bool_1275_);
		}
	}

	final void method13864(boolean bool, boolean bool_1278_, boolean bool_1279_, boolean bool_1280_, boolean bool_1281_) {
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8617; i++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i];
				((Class528_Sub2) this).anIntArray8643[((Class193) class193).anInt2393 * 142270897] = i;
			}
		}
		if (((Class528_Sub2) this).aBool8630 || ((Class528_Sub2) this).aClass193Array8618 != null) {
			if ((((Class528_Sub2) this).anInt8575 & 0x100) == 0 && ((Class528_Sub2) this).aShortArray8623 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					short i_1282_ = ((Class528_Sub2) this).aShortArray8623[i];
					method13868(bool, bool_1278_, bool_1279_, i_1282_, bool_1280_, bool_1281_);
				}
			} else {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (!method13816(i) && !method13803(i))
						method13868(bool, bool_1278_, bool_1279_, i, bool_1280_, bool_1281_);
				}
				if (((Class528_Sub2) this).aByteArray8601 == null) {
					for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
						if (method13816(i) || method13803(i))
							method13868(bool, bool_1278_, bool_1279_, i, bool_1280_, bool_1281_);
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_1283_ = 0; i_1283_ < ((Class528_Sub2) this).anInt8586; i_1283_++) {
							if ((((Class528_Sub2) this).aByteArray8601[i_1283_] == i) && (method13816(i_1283_) || method13803(i_1283_)))
								method13868(bool, bool_1278_, bool_1279_, i_1283_, bool_1280_, bool_1281_);
						}
					}
				}
			}
		} else {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++)
				method13868(bool, bool_1278_, bool_1279_, i, bool_1280_, bool_1281_);
		}
	}

	void method13865() {
		((Class528_Sub2) this).aClass189Array8584 = null;
		((Class528_Sub2) this).aClass189Array8585 = null;
		((Class528_Sub2) this).aClass195Array8599 = null;
		((Class528_Sub2) this).aBool8621 = false;
	}

	final boolean method13866(int i) {
		if (((Class528_Sub2) this).aByteArray8602 == null)
			return false;
		if (((Class528_Sub2) this).aByteArray8602[i] == 0)
			return false;
		return true;
	}

	final boolean method13867(int i) {
		if (((Class528_Sub2) this).anIntArray8643 == null)
			return false;
		if (((Class528_Sub2) this).anIntArray8643[i] == -1)
			return false;
		return true;
	}

	final void method13868(boolean bool, boolean bool_1284_, boolean bool_1285_, int i, boolean bool_1286_, boolean bool_1287_) {
		if (((Class528_Sub2) this).anIntArray8594[i] != -2) {
			short i_1288_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_1289_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_1290_ = ((Class528_Sub2) this).aShortArray8642[i];
			float f = ((Class528_Sub2) this).aFloatArray8590[i_1288_];
			float f_1291_ = ((Class528_Sub2) this).aFloatArray8590[i_1289_];
			float f_1292_ = ((Class528_Sub2) this).aFloatArray8590[i_1290_];
			if (!bool_1286_ || (f != -5000.0F && f_1291_ != -5000.0F && f_1292_ != -5000.0F)) {
				float f_1293_ = ((Class528_Sub2) this).aFloatArray8605[i_1288_];
				float f_1294_ = ((Class528_Sub2) this).aFloatArray8605[i_1289_];
				float f_1295_ = ((Class528_Sub2) this).aFloatArray8605[i_1290_];
				if (((Class528_Sub2) this).anIntArray8643[i] != -1 || ((f - f_1291_) * (f_1295_ - f_1294_) - (f_1293_ - f_1294_) * (f_1292_ - f_1291_)) > 0.0F) {
					if (f < 0.0F || f_1291_ < 0.0F || f_1292_ < 0.0F || f > (float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2337) * -214577309) || (f_1291_ > (float) (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2337 * -214577309)) || (f_1292_ > (float) (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2337 * -214577309)))
						((Class144) ((Class528_Sub2) this).aClass144_8566).aBool1708 = true;
					else
						((Class144) ((Class528_Sub2) this).aClass144_8566).aBool1708 = false;
					if (bool_1287_) {
						int i_1296_ = ((Class528_Sub2) this).anIntArray8643[i];
						if (i_1296_ == -1 || !(((Class193) (((Class528_Sub2) this).aClass193Array8618[i_1296_])).aBool2399))
							method13818(bool, bool_1284_, bool_1285_, i);
					} else {
						int i_1297_ = ((Class528_Sub2) this).anIntArray8643[i];
						if (i_1297_ != -1) {
							Class193 class193 = (((Class528_Sub2) this).aClass193Array8618[i_1297_]);
							Class176 class176 = (((Class528_Sub2) this).aClass176Array8582[i_1297_]);
							if (!((Class193) class193).aBool2399)
								method13848(bool, bool_1284_, bool_1285_, i);
							((Class528_Sub2) this).aClass505_Sub3_8638.method14372(bool, bool_1284_, bool_1285_, ((Class176) class176).anInt2195 * -2051502869, ((Class176) class176).anInt2196 * -1235509069, ((Class176) class176).aFloat2193, ((Class176) class176).anInt2197 * -705511173, ((Class176) class176).anInt2198 * -226608043, ((Class193) class193).aShort2396 & 0xffff, ((Class176) class176).anInt2199 * -1303125861, ((Class193) class193).aByte2398, ((Class193) class193).aByte2397);
						} else
							method13848(bool, bool_1284_, bool_1285_, i);
					}
				}
			}
		}
	}

	public int cp() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8634;
	}

	final void method13869(boolean bool, boolean bool_1298_, boolean bool_1299_, int i) {
		if (!((Class185) ((Class528_Sub2) this).aClass185_8564).aBool2309) {
			short i_1300_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_1301_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_1302_ = ((Class528_Sub2) this).aShortArray8642[i];
			Class384 class384 = (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8995);
			float f = class384.aFloatArray4667[10];
			float f_1303_ = class384.aFloatArray4667[14];
			float f_1304_ = class384.aFloatArray4667[11];
			float f_1305_ = class384.aFloatArray4667[15];
			float f_1306_ = f_1303_ * f_1304_ - f * f_1305_;
			float f_1307_ = ((((Class528_Sub2) this).aFloatArray8636[i_1300_] - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335)) * (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2308));
			float f_1308_ = ((((Class528_Sub2) this).aFloatArray8636[i_1301_] - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335)) * (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2308));
			float f_1309_ = ((((Class528_Sub2) this).aFloatArray8636[i_1302_] - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2335)) * (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2308));
			float f_1310_ = f_1307_ * f_1306_ / (f_1307_ * f_1304_ - f);
			float f_1311_ = f_1308_ * f_1306_ / (f_1308_ * f_1304_ - f);
			float f_1312_ = f_1309_ * f_1306_ / (f_1309_ * f_1304_ - f);
			float f_1313_ = ((f_1310_ - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2305)) / (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2303));
			if (f_1313_ > 1.0F)
				f_1313_ = 1.0F;
			else if (f_1313_ < 0.0F)
				f_1313_ = 0.0F;
			float f_1314_ = ((f_1311_ - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2305)) / (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2303));
			if (f_1314_ > 1.0F)
				f_1314_ = 1.0F;
			else if (f_1314_ < 0.0F)
				f_1314_ = 0.0F;
			float f_1315_ = ((f_1312_ - (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2305)) / (((Class185) ((Class528_Sub2) this).aClass185_8564).aFloat2303));
			if (f_1315_ > 1.0F)
				f_1315_ = 1.0F;
			else if (f_1315_ < 0.0F)
				f_1315_ = 0.0F;
			float f_1316_ = f_1313_ + f_1314_ + f_1315_;
			if (!(f_1316_ >= 3.0F)) {
				if (f_1316_ <= 0.0F)
					method13848(bool, bool_1298_, bool_1299_, i);
				else {
					if (((Class528_Sub2) this).aByteArray8602 == null)
						((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = 0;
					else
						((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = ((Class528_Sub2) this).aByteArray8602[i] & 0xff;
					if (((Class528_Sub2) this).aShortArray8603 == null || ((Class528_Sub2) this).aShortArray8603[i] == -1) {
						if (((Class528_Sub2) this).anIntArray8594[i] == -1)
							((Class528_Sub2) this).aClass144_8566.method2425(bool, bool_1298_, bool_1299_, (((Class528_Sub2) this).aFloatArray8605[i_1300_]), (((Class528_Sub2) this).aFloatArray8605[i_1301_]), (((Class528_Sub2) this).aFloatArray8605[i_1302_]), (((Class528_Sub2) this).aFloatArray8590[i_1300_]), (((Class528_Sub2) this).aFloatArray8590[i_1301_]), (((Class528_Sub2) this).aFloatArray8590[i_1302_]), (((Class528_Sub2) this).aFloatArray8636[i_1300_]),
									(((Class528_Sub2) this).aFloatArray8636[i_1301_]), (((Class528_Sub2) this).aFloatArray8636[i_1302_]), Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8592[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_1313_ * 255.0F, 833509259),
									Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8592[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_1314_ * 255.0F, 833509259), Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8592[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_1315_ * 255.0F, 833509259));
						else
							((Class528_Sub2) this).aClass144_8566.method2425(bool, bool_1298_, bool_1299_, (((Class528_Sub2) this).aFloatArray8605[i_1300_]), (((Class528_Sub2) this).aFloatArray8605[i_1301_]), (((Class528_Sub2) this).aFloatArray8605[i_1302_]), (((Class528_Sub2) this).aFloatArray8590[i_1300_]), (((Class528_Sub2) this).aFloatArray8590[i_1301_]), (((Class528_Sub2) this).aFloatArray8590[i_1302_]), (((Class528_Sub2) this).aFloatArray8636[i_1300_]),
									(((Class528_Sub2) this).aFloatArray8636[i_1301_]), (((Class528_Sub2) this).aFloatArray8636[i_1302_]), Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8592[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_1313_ * 255.0F, 833509259),
									Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8631[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_1314_ * 255.0F, 833509259), Class302.method5364((Class335.anIntArray3916[((((Class528_Sub2) this).anIntArray8594[i]) & 0xffff)]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307) * 1402414887, f_1315_ * 255.0F, 833509259));
					} else {
						int i_1317_ = -16777216;
						if (((Class528_Sub2) this).aByteArray8602 != null)
							i_1317_ = 255 - ((((Class528_Sub2) this).aByteArray8602[i]) & 0xff) << 24;
						if (((Class528_Sub2) this).anIntArray8594[i] == -1) {
							int i_1318_ = (i_1317_ | (((Class528_Sub2) this).anIntArray8592[i] & 0xffffff));
							((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_1298_, bool_1299_, (((Class528_Sub2) this).aFloatArray8605[i_1300_]), (((Class528_Sub2) this).aFloatArray8605[i_1301_]), (((Class528_Sub2) this).aFloatArray8605[i_1302_]), (((Class528_Sub2) this).aFloatArray8590[i_1300_]), (((Class528_Sub2) this).aFloatArray8590[i_1301_]), (((Class528_Sub2) this).aFloatArray8590[i_1302_]), (((Class528_Sub2) this).aFloatArray8636[i_1300_]),
									(((Class528_Sub2) this).aFloatArray8636[i_1301_]), (((Class528_Sub2) this).aFloatArray8636[i_1302_]), (((Class528_Sub2) this).aFloatArray8637[i_1300_]), (((Class528_Sub2) this).aFloatArray8637[i_1301_]), (((Class528_Sub2) this).aFloatArray8637[i_1302_]), (((Class528_Sub2) this).aFloatArrayArray8635[i][0]), (((Class528_Sub2) this).aFloatArrayArray8635[i][1]), (((Class528_Sub2) this).aFloatArrayArray8635[i][2]),
									(((Class528_Sub2) this).aFloatArrayArray8591[i][0]), (((Class528_Sub2) this).aFloatArrayArray8591[i][1]), (((Class528_Sub2) this).aFloatArrayArray8591[i][2]), i_1318_, i_1318_, i_1318_, (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_1313_ * 255.0F, f_1314_ * 255.0F, f_1315_ * 255.0F, ((Class528_Sub2) this).aShortArray8603[i]);
						} else
							((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_1298_, bool_1299_, (((Class528_Sub2) this).aFloatArray8605[i_1300_]), (((Class528_Sub2) this).aFloatArray8605[i_1301_]), (((Class528_Sub2) this).aFloatArray8605[i_1302_]), (((Class528_Sub2) this).aFloatArray8590[i_1300_]), (((Class528_Sub2) this).aFloatArray8590[i_1301_]), (((Class528_Sub2) this).aFloatArray8590[i_1302_]), (((Class528_Sub2) this).aFloatArray8636[i_1300_]),
									(((Class528_Sub2) this).aFloatArray8636[i_1301_]), (((Class528_Sub2) this).aFloatArray8636[i_1302_]), (((Class528_Sub2) this).aFloatArray8637[i_1300_]), (((Class528_Sub2) this).aFloatArray8637[i_1301_]), (((Class528_Sub2) this).aFloatArray8637[i_1302_]), (((Class528_Sub2) this).aFloatArrayArray8635[i][0]), (((Class528_Sub2) this).aFloatArrayArray8635[i][1]), (((Class528_Sub2) this).aFloatArrayArray8635[i][2]),
									(((Class528_Sub2) this).aFloatArrayArray8591[i][0]), (((Class528_Sub2) this).aFloatArrayArray8591[i][1]), (((Class528_Sub2) this).aFloatArrayArray8591[i][2]), i_1317_ | (((Class528_Sub2) this).anIntArray8592[i]) & 0xffffff, i_1317_ | (((Class528_Sub2) this).anIntArray8631[i]) & 0xffffff, i_1317_ | (((Class528_Sub2) this).anIntArray8594[i]) & 0xffffff, (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_1313_ * 255.0F,
									f_1314_ * 255.0F, f_1315_ * 255.0F, ((Class528_Sub2) this).aShortArray8603[i]);
					}
				}
			}
		} else {
			short i_1319_ = ((Class528_Sub2) this).aShortArray8587[i];
			short i_1320_ = ((Class528_Sub2) this).aShortArray8588[i];
			short i_1321_ = ((Class528_Sub2) this).aShortArray8642[i];
			float f = 0.0F;
			float f_1322_ = 0.0F;
			float f_1323_ = 0.0F;
			if (((Class528_Sub2) this).anIntArray8633[i_1319_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2313 * 1493774857))
				f = 1.0F;
			else if (((Class528_Sub2) this).anIntArray8633[i_1319_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2306) * 2102822577)
				f = ((float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - ((Class528_Sub2) this).anIntArray8633[i_1319_]) * 1.0F / (float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2313 * 1493774857)));
			if (((Class528_Sub2) this).anIntArray8633[i_1320_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2313 * 1493774857))
				f_1322_ = 1.0F;
			else if (((Class528_Sub2) this).anIntArray8633[i_1320_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2306) * 2102822577)
				f_1322_ = ((float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class528_Sub2) this).anIntArray8633[i_1320_])) * 1.0F / (float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2313) * 1493774857));
			if (((Class528_Sub2) this).anIntArray8633[i_1321_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2313 * 1493774857))
				f_1323_ = 1.0F;
			else if (((Class528_Sub2) this).anIntArray8633[i_1321_] > (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2306) * 2102822577)
				f_1323_ = ((float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class528_Sub2) this).anIntArray8633[i_1321_])) * 1.0F / (float) ((((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2306 * 2102822577) - (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2313) * 1493774857));
			if (((Class528_Sub2) this).aByteArray8602 == null)
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = 0;
			else
				((Class144) ((Class528_Sub2) this).aClass144_8566).anInt1674 = ((Class528_Sub2) this).aByteArray8602[i] & 0xff;
			if (((Class528_Sub2) this).aShortArray8603 == null || ((Class528_Sub2) this).aShortArray8603[i] == -1) {
				if (((Class528_Sub2) this).anIntArray8594[i] == -1)
					((Class528_Sub2) this).aClass144_8566.method2425(bool, bool_1298_, bool_1299_, ((Class528_Sub2) this).aFloatArray8605[i_1319_], ((Class528_Sub2) this).aFloatArray8605[i_1320_], ((Class528_Sub2) this).aFloatArray8605[i_1321_], ((Class528_Sub2) this).aFloatArray8590[i_1319_], ((Class528_Sub2) this).aFloatArray8590[i_1320_], ((Class528_Sub2) this).aFloatArray8590[i_1321_], ((Class528_Sub2) this).aFloatArray8636[i_1319_], ((Class528_Sub2) this).aFloatArray8636[i_1320_],
							((Class528_Sub2) this).aFloatArray8636[i_1321_], Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8592[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f * 255.0F, 833509259), Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8592[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_1322_ * 255.0F, 833509259),
							Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8592[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_1323_ * 255.0F, 833509259));
				else
					((Class528_Sub2) this).aClass144_8566.method2425(bool, bool_1298_, bool_1299_, ((Class528_Sub2) this).aFloatArray8605[i_1319_], ((Class528_Sub2) this).aFloatArray8605[i_1320_], ((Class528_Sub2) this).aFloatArray8605[i_1321_], ((Class528_Sub2) this).aFloatArray8590[i_1319_], ((Class528_Sub2) this).aFloatArray8590[i_1320_], ((Class528_Sub2) this).aFloatArray8590[i_1321_], ((Class528_Sub2) this).aFloatArray8636[i_1319_], ((Class528_Sub2) this).aFloatArray8636[i_1320_],
							((Class528_Sub2) this).aFloatArray8636[i_1321_], Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8592[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f * 255.0F, 833509259), Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8631[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_1322_ * 255.0F, 833509259),
							Class302.method5364((Class335.anIntArray3916[(((Class528_Sub2) this).anIntArray8594[i]) & 0xffff]), (((Class185) (((Class528_Sub2) this).aClass185_8564)).anInt2307 * 1402414887), f_1323_ * 255.0F, 833509259));
			} else {
				int i_1324_ = -16777216;
				if (((Class528_Sub2) this).aByteArray8602 != null)
					i_1324_ = 255 - (((Class528_Sub2) this).aByteArray8602[i] & 0xff) << 24;
				if (((Class528_Sub2) this).anIntArray8594[i] == -1) {
					int i_1325_ = i_1324_ | (((Class528_Sub2) this).anIntArray8592[i] & 0xffffff);
					((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_1298_, bool_1299_, ((Class528_Sub2) this).aFloatArray8605[i_1319_], ((Class528_Sub2) this).aFloatArray8605[i_1320_], ((Class528_Sub2) this).aFloatArray8605[i_1321_], ((Class528_Sub2) this).aFloatArray8590[i_1319_], ((Class528_Sub2) this).aFloatArray8590[i_1320_], ((Class528_Sub2) this).aFloatArray8590[i_1321_], ((Class528_Sub2) this).aFloatArray8636[i_1319_], ((Class528_Sub2) this).aFloatArray8636[i_1320_],
							((Class528_Sub2) this).aFloatArray8636[i_1321_], ((Class528_Sub2) this).aFloatArray8637[i_1319_], ((Class528_Sub2) this).aFloatArray8637[i_1320_], ((Class528_Sub2) this).aFloatArray8637[i_1321_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
							((Class528_Sub2) this).aFloatArrayArray8591[i][2], i_1325_, i_1325_, i_1325_, (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, f * 255.0F, f_1322_ * 255.0F, f_1323_ * 255.0F, ((Class528_Sub2) this).aShortArray8603[i]);
				} else
					((Class528_Sub2) this).aClass144_8566.method2424(bool, bool_1298_, bool_1299_, ((Class528_Sub2) this).aFloatArray8605[i_1319_], ((Class528_Sub2) this).aFloatArray8605[i_1320_], ((Class528_Sub2) this).aFloatArray8605[i_1321_], ((Class528_Sub2) this).aFloatArray8590[i_1319_], ((Class528_Sub2) this).aFloatArray8590[i_1320_], ((Class528_Sub2) this).aFloatArray8590[i_1321_], ((Class528_Sub2) this).aFloatArray8636[i_1319_], ((Class528_Sub2) this).aFloatArray8636[i_1320_],
							((Class528_Sub2) this).aFloatArray8636[i_1321_], ((Class528_Sub2) this).aFloatArray8637[i_1319_], ((Class528_Sub2) this).aFloatArray8637[i_1320_], ((Class528_Sub2) this).aFloatArray8637[i_1321_], ((Class528_Sub2) this).aFloatArrayArray8635[i][0], ((Class528_Sub2) this).aFloatArrayArray8635[i][1], ((Class528_Sub2) this).aFloatArrayArray8635[i][2], ((Class528_Sub2) this).aFloatArrayArray8591[i][0], ((Class528_Sub2) this).aFloatArrayArray8591[i][1],
							((Class528_Sub2) this).aFloatArrayArray8591[i][2], i_1324_ | (((Class528_Sub2) this).anIntArray8592[i] & 0xffffff), i_1324_ | (((Class528_Sub2) this).anIntArray8631[i] & 0xffffff), i_1324_ | (((Class528_Sub2) this).anIntArray8594[i] & 0xffffff), (((Class185) ((Class528_Sub2) this).aClass185_8564).anInt2307) * 1402414887, f * 255.0F, f_1322_ * 255.0F, f_1323_ * 255.0F, ((Class528_Sub2) this).aShortArray8603[i]);
			}
		}
	}

	boolean method13870(int i, int i_1326_, float f, float f_1327_, float f_1328_, float f_1329_, float f_1330_, float f_1331_) {
		if ((float) i_1326_ < f && (float) i_1326_ < f_1327_ && (float) i_1326_ < f_1328_)
			return false;
		if ((float) i_1326_ > f && (float) i_1326_ > f_1327_ && (float) i_1326_ > f_1328_)
			return false;
		if ((float) i < f_1329_ && (float) i < f_1330_ && (float) i < f_1331_)
			return false;
		if ((float) i > f_1329_ && (float) i > f_1330_ && (float) i > f_1331_)
			return false;
		return true;
	}

	public void method11315(Class294 class294) {
		method13795(((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Class384 class384 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2317);
		class384.method6522(class294);
		if (((Class528_Sub2) this).aClass87Array8615 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).aClass87Array8615.length; i++) {
				Class87 class87 = ((Class528_Sub2) this).aClass87Array8615[i];
				Class87 class87_1332_ = class87;
				if (class87.aClass87_835 != null)
					class87_1332_ = class87.aClass87_835;
				class87_1332_.anInt844 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * -1929058355);
				class87_1332_.anInt841 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * 996785411);
				class87_1332_.anInt847 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt836 * -1572033967])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt836 * -1572033967)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt836 * -1572033967)])))) * 976806429);
				class87_1332_.anInt834 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * -458323579);
				class87_1332_.anInt843 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * 543149547);
				class87_1332_.anInt845 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt837 * -1955014451])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt837 * -1955014451)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt837 * -1955014451)])))) * 1054448197);
				class87_1332_.anInt846 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * 1348028043);
				class87_1332_.anInt840 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * -1652520905);
				class87_1332_.anInt848 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[class87.anInt838 * -2135413869])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class87.anInt838 * -2135413869)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class87.anInt838 * -2135413869)])))) * 1757672349);
			}
		}
		if (((Class528_Sub2) this).aClass172Array8616 != null) {
			for (int i = 0; i < ((Class528_Sub2) this).aClass172Array8616.length; i++) {
				Class172 class172 = ((Class528_Sub2) this).aClass172Array8616[i];
				Class172 class172_1333_ = class172;
				if (class172.aClass172_2114 != null)
					class172_1333_ = class172.aClass172_2114;
				if (class172.aClass384_2116 != null)
					class172.aClass384_2116.method6562(class384);
				else
					class172.aClass384_2116 = new Class384(class384);
				class172_1333_.anInt2113 = ((int) (class384.aFloatArray4667[12] + ((class384.aFloatArray4667[0] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[4] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[8] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * 959663283);
				class172_1333_.anInt2117 = ((int) (class384.aFloatArray4667[13] + ((class384.aFloatArray4667[1] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[5] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[9] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * -1084180847);
				class172_1333_.anInt2118 = ((int) (class384.aFloatArray4667[14] + ((class384.aFloatArray4667[2] * (float) (((Class528_Sub2) this).anIntArray8580[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[6] * (float) (((Class528_Sub2) this).anIntArray8581[(class172.anInt2119 * -1382123871)])) + (class384.aFloatArray4667[10] * (float) (((Class528_Sub2) this).anIntArray8610[(class172.anInt2119 * -1382123871)])))) * -1221574613);
			}
		}
	}

	public void method11263(Class294 class294, int i, boolean bool) {
		if (((Class528_Sub2) this).aShortArray8569 != null) {
			Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread());
			Class294 class294_1334_ = ((Class185) class185).aClass294_2316;
			class294_1334_.method5209(class294);
			if (bool)
				class294_1334_.method5207();
			Class384 class384 = ((Class185) class185).aClass384_2317;
			class384.method6522(class294_1334_);
			float[] fs = new float[3];
			for (int i_1335_ = 0; i_1335_ < ((Class528_Sub2) this).anInt8579; i_1335_++) {
				if ((i & ((Class528_Sub2) this).aShortArray8569[i_1335_]) != 0) {
					class384.method6527((float) (((Class528_Sub2) this).anIntArray8580[i_1335_]), (float) (((Class528_Sub2) this).anIntArray8581[i_1335_]), (float) (((Class528_Sub2) this).anIntArray8610[i_1335_]), fs);
					((Class528_Sub2) this).anIntArray8580[i_1335_] = (int) fs[0];
					((Class528_Sub2) this).anIntArray8581[i_1335_] = (int) fs[1];
					((Class528_Sub2) this).anIntArray8610[i_1335_] = (int) fs[2];
				}
			}
		}
	}

	void method13871() {
		if (!((Class528_Sub2) this).aBool8621) {
			int i = 0;
			int i_1336_ = 0;
			int i_1337_ = 32767;
			int i_1338_ = 32767;
			int i_1339_ = 32767;
			int i_1340_ = -32768;
			int i_1341_ = -32768;
			int i_1342_ = -32768;
			for (int i_1343_ = 0; i_1343_ < ((Class528_Sub2) this).anInt8579; i_1343_++) {
				int i_1344_ = ((Class528_Sub2) this).anIntArray8580[i_1343_];
				int i_1345_ = ((Class528_Sub2) this).anIntArray8581[i_1343_];
				int i_1346_ = ((Class528_Sub2) this).anIntArray8610[i_1343_];
				if (i_1344_ < i_1337_)
					i_1337_ = i_1344_;
				if (i_1344_ > i_1340_)
					i_1340_ = i_1344_;
				if (i_1345_ < i_1338_)
					i_1338_ = i_1345_;
				if (i_1345_ > i_1341_)
					i_1341_ = i_1345_;
				if (i_1346_ < i_1339_)
					i_1339_ = i_1346_;
				if (i_1346_ > i_1342_)
					i_1342_ = i_1346_;
				int i_1347_ = i_1344_ * i_1344_ + i_1346_ * i_1346_;
				if (i_1347_ > i)
					i = i_1347_;
				i_1347_ += i_1345_ * i_1345_;
				if (i_1347_ > i_1336_)
					i_1336_ = i_1347_;
			}
			((Class528_Sub2) this).aShort8634 = (short) i_1337_;
			((Class528_Sub2) this).aShort8627 = (short) i_1340_;
			((Class528_Sub2) this).aShort8570 = (short) i_1338_;
			((Class528_Sub2) this).aShort8625 = (short) i_1341_;
			((Class528_Sub2) this).aShort8571 = (short) i_1339_;
			((Class528_Sub2) this).aShort8629 = (short) i_1342_;
			((Class528_Sub2) this).aShort8595 = (short) (int) (Math.sqrt((double) i) + 0.99);
			((Class528_Sub2) this).aShort8574 = (short) (int) (Math.sqrt((double) i_1336_) + 0.99);
			((Class528_Sub2) this).aBool8621 = true;
		}
	}

	void method13872() {
		if (!((Class528_Sub2) this).aBool8621) {
			int i = 0;
			int i_1348_ = 0;
			int i_1349_ = 32767;
			int i_1350_ = 32767;
			int i_1351_ = 32767;
			int i_1352_ = -32768;
			int i_1353_ = -32768;
			int i_1354_ = -32768;
			for (int i_1355_ = 0; i_1355_ < ((Class528_Sub2) this).anInt8579; i_1355_++) {
				int i_1356_ = ((Class528_Sub2) this).anIntArray8580[i_1355_];
				int i_1357_ = ((Class528_Sub2) this).anIntArray8581[i_1355_];
				int i_1358_ = ((Class528_Sub2) this).anIntArray8610[i_1355_];
				if (i_1356_ < i_1349_)
					i_1349_ = i_1356_;
				if (i_1356_ > i_1352_)
					i_1352_ = i_1356_;
				if (i_1357_ < i_1350_)
					i_1350_ = i_1357_;
				if (i_1357_ > i_1353_)
					i_1353_ = i_1357_;
				if (i_1358_ < i_1351_)
					i_1351_ = i_1358_;
				if (i_1358_ > i_1354_)
					i_1354_ = i_1358_;
				int i_1359_ = i_1356_ * i_1356_ + i_1358_ * i_1358_;
				if (i_1359_ > i)
					i = i_1359_;
				i_1359_ += i_1357_ * i_1357_;
				if (i_1359_ > i_1348_)
					i_1348_ = i_1359_;
			}
			((Class528_Sub2) this).aShort8634 = (short) i_1349_;
			((Class528_Sub2) this).aShort8627 = (short) i_1352_;
			((Class528_Sub2) this).aShort8570 = (short) i_1350_;
			((Class528_Sub2) this).aShort8625 = (short) i_1353_;
			((Class528_Sub2) this).aShort8571 = (short) i_1351_;
			((Class528_Sub2) this).aShort8629 = (short) i_1354_;
			((Class528_Sub2) this).aShort8595 = (short) (int) (Math.sqrt((double) i) + 0.99);
			((Class528_Sub2) this).aShort8574 = (short) (int) (Math.sqrt((double) i_1348_) + 0.99);
			((Class528_Sub2) this).aBool8621 = true;
		}
	}

	void method13873() {
		if (!((Class528_Sub2) this).aBool8621) {
			int i = 0;
			int i_1360_ = 0;
			int i_1361_ = 32767;
			int i_1362_ = 32767;
			int i_1363_ = 32767;
			int i_1364_ = -32768;
			int i_1365_ = -32768;
			int i_1366_ = -32768;
			for (int i_1367_ = 0; i_1367_ < ((Class528_Sub2) this).anInt8579; i_1367_++) {
				int i_1368_ = ((Class528_Sub2) this).anIntArray8580[i_1367_];
				int i_1369_ = ((Class528_Sub2) this).anIntArray8581[i_1367_];
				int i_1370_ = ((Class528_Sub2) this).anIntArray8610[i_1367_];
				if (i_1368_ < i_1361_)
					i_1361_ = i_1368_;
				if (i_1368_ > i_1364_)
					i_1364_ = i_1368_;
				if (i_1369_ < i_1362_)
					i_1362_ = i_1369_;
				if (i_1369_ > i_1365_)
					i_1365_ = i_1369_;
				if (i_1370_ < i_1363_)
					i_1363_ = i_1370_;
				if (i_1370_ > i_1366_)
					i_1366_ = i_1370_;
				int i_1371_ = i_1368_ * i_1368_ + i_1370_ * i_1370_;
				if (i_1371_ > i)
					i = i_1371_;
				i_1371_ += i_1369_ * i_1369_;
				if (i_1371_ > i_1360_)
					i_1360_ = i_1371_;
			}
			((Class528_Sub2) this).aShort8634 = (short) i_1361_;
			((Class528_Sub2) this).aShort8627 = (short) i_1364_;
			((Class528_Sub2) this).aShort8570 = (short) i_1362_;
			((Class528_Sub2) this).aShort8625 = (short) i_1365_;
			((Class528_Sub2) this).aShort8571 = (short) i_1363_;
			((Class528_Sub2) this).aShort8629 = (short) i_1366_;
			((Class528_Sub2) this).aShort8595 = (short) (int) (Math.sqrt((double) i) + 0.99);
			((Class528_Sub2) this).aShort8574 = (short) (int) (Math.sqrt((double) i_1360_) + 0.99);
			((Class528_Sub2) this).aBool8621 = true;
		}
	}

	void method13874() {
		if (!((Class528_Sub2) this).aBool8621) {
			int i = 0;
			int i_1372_ = 0;
			int i_1373_ = 32767;
			int i_1374_ = 32767;
			int i_1375_ = 32767;
			int i_1376_ = -32768;
			int i_1377_ = -32768;
			int i_1378_ = -32768;
			for (int i_1379_ = 0; i_1379_ < ((Class528_Sub2) this).anInt8579; i_1379_++) {
				int i_1380_ = ((Class528_Sub2) this).anIntArray8580[i_1379_];
				int i_1381_ = ((Class528_Sub2) this).anIntArray8581[i_1379_];
				int i_1382_ = ((Class528_Sub2) this).anIntArray8610[i_1379_];
				if (i_1380_ < i_1373_)
					i_1373_ = i_1380_;
				if (i_1380_ > i_1376_)
					i_1376_ = i_1380_;
				if (i_1381_ < i_1374_)
					i_1374_ = i_1381_;
				if (i_1381_ > i_1377_)
					i_1377_ = i_1381_;
				if (i_1382_ < i_1375_)
					i_1375_ = i_1382_;
				if (i_1382_ > i_1378_)
					i_1378_ = i_1382_;
				int i_1383_ = i_1380_ * i_1380_ + i_1382_ * i_1382_;
				if (i_1383_ > i)
					i = i_1383_;
				i_1383_ += i_1381_ * i_1381_;
				if (i_1383_ > i_1372_)
					i_1372_ = i_1383_;
			}
			((Class528_Sub2) this).aShort8634 = (short) i_1373_;
			((Class528_Sub2) this).aShort8627 = (short) i_1376_;
			((Class528_Sub2) this).aShort8570 = (short) i_1374_;
			((Class528_Sub2) this).aShort8625 = (short) i_1377_;
			((Class528_Sub2) this).aShort8571 = (short) i_1375_;
			((Class528_Sub2) this).aShort8629 = (short) i_1378_;
			((Class528_Sub2) this).aShort8595 = (short) (int) (Math.sqrt((double) i) + 0.99);
			((Class528_Sub2) this).aShort8574 = (short) (int) (Math.sqrt((double) i_1372_) + 0.99);
			((Class528_Sub2) this).aBool8621 = true;
		}
	}

	public void bi(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x5) != 5)
			throw new IllegalStateException();
		if (i == 4096)
			method13805();
		else if (i == 8192)
			method13806();
		else if (i == 12288)
			method13807();
		else {
			int i_1384_ = Class382.anIntArray4657[i];
			int i_1385_ = Class382.anIntArray4661[i];
			synchronized (this) {
				for (int i_1386_ = 0; i_1386_ < ((Class528_Sub2) this).anInt8578; i_1386_++) {
					int i_1387_ = (((((Class528_Sub2) this).anIntArray8610[i_1386_] * i_1384_) + (((Class528_Sub2) this).anIntArray8580[i_1386_] * i_1385_)) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_1386_] = ((((Class528_Sub2) this).anIntArray8610[i_1386_] * i_1385_) - (((Class528_Sub2) this).anIntArray8580[i_1386_] * i_1384_)) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_1386_] = i_1387_;
				}
				method13812();
			}
		}
	}

	public void W(short i, short i_1388_) {
		if (((Class528_Sub2) this).aShortArray8603 != null) {
			if (!((Class528_Sub2) this).aBool8640 && i_1388_ >= 0) {
				Class169 class169 = ((Class528_Sub2) this).aClass505_Sub3_8638.anInterface22_5834.method144(i_1388_ & 0xffff, -1877330793);
				if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
					((Class528_Sub2) this).aBool8640 = true;
			}
			for (int i_1389_ = 0; i_1389_ < ((Class528_Sub2) this).anInt8586; i_1389_++) {
				if (((Class528_Sub2) this).aShortArray8603[i_1389_] == i)
					((Class528_Sub2) this).aShortArray8603[i_1389_] = i_1388_;
			}
		}
	}

	public int dd() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8625;
	}

	void bo(int i, int i_1390_, int i_1391_, int i_1392_) {
		if (i == 0) {
			int i_1393_ = 0;
			((Class528_Sub2) this).anInt8611 = 0;
			((Class528_Sub2) this).anInt8607 = 0;
			((Class528_Sub2) this).anInt8613 = 0;
			for (int i_1394_ = 0; i_1394_ < ((Class528_Sub2) this).anInt8578; i_1394_++) {
				((Class528_Sub2) this).anInt8611 += ((Class528_Sub2) this).anIntArray8580[i_1394_];
				((Class528_Sub2) this).anInt8607 += ((Class528_Sub2) this).anIntArray8581[i_1394_];
				((Class528_Sub2) this).anInt8613 += ((Class528_Sub2) this).anIntArray8610[i_1394_];
				i_1393_++;
			}
			if (i_1393_ > 0) {
				((Class528_Sub2) this).anInt8611 = ((Class528_Sub2) this).anInt8611 / i_1393_ + i_1390_;
				((Class528_Sub2) this).anInt8607 = ((Class528_Sub2) this).anInt8607 / i_1393_ + i_1391_;
				((Class528_Sub2) this).anInt8613 = ((Class528_Sub2) this).anInt8613 / i_1393_ + i_1392_;
			} else {
				((Class528_Sub2) this).anInt8611 = i_1390_;
				((Class528_Sub2) this).anInt8607 = i_1391_;
				((Class528_Sub2) this).anInt8613 = i_1392_;
			}
		} else if (i == 1) {
			for (int i_1395_ = 0; i_1395_ < ((Class528_Sub2) this).anInt8578; i_1395_++) {
				((Class528_Sub2) this).anIntArray8580[i_1395_] += i_1390_;
				((Class528_Sub2) this).anIntArray8581[i_1395_] += i_1391_;
				((Class528_Sub2) this).anIntArray8610[i_1395_] += i_1392_;
			}
		} else if (i == 2) {
			for (int i_1396_ = 0; i_1396_ < ((Class528_Sub2) this).anInt8578; i_1396_++) {
				((Class528_Sub2) this).anIntArray8580[i_1396_] -= ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_1396_] -= ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_1396_] -= ((Class528_Sub2) this).anInt8613;
				if (i_1392_ != 0) {
					int i_1397_ = Class382.anIntArray4657[i_1392_];
					int i_1398_ = Class382.anIntArray4661[i_1392_];
					int i_1399_ = (((((Class528_Sub2) this).anIntArray8581[i_1396_] * i_1397_) + (((Class528_Sub2) this).anIntArray8580[i_1396_] * i_1398_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8581[i_1396_] = ((((Class528_Sub2) this).anIntArray8581[i_1396_] * i_1398_) - (((Class528_Sub2) this).anIntArray8580[i_1396_] * i_1397_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_1396_] = i_1399_;
				}
				if (i_1390_ != 0) {
					int i_1400_ = Class382.anIntArray4657[i_1390_];
					int i_1401_ = Class382.anIntArray4661[i_1390_];
					int i_1402_ = (((((Class528_Sub2) this).anIntArray8581[i_1396_] * i_1401_) - (((Class528_Sub2) this).anIntArray8610[i_1396_] * i_1400_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_1396_] = ((((Class528_Sub2) this).anIntArray8581[i_1396_] * i_1400_) + (((Class528_Sub2) this).anIntArray8610[i_1396_] * i_1401_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8581[i_1396_] = i_1402_;
				}
				if (i_1391_ != 0) {
					int i_1403_ = Class382.anIntArray4657[i_1391_];
					int i_1404_ = Class382.anIntArray4661[i_1391_];
					int i_1405_ = (((((Class528_Sub2) this).anIntArray8610[i_1396_] * i_1403_) + (((Class528_Sub2) this).anIntArray8580[i_1396_] * i_1404_) + 16383) >> 14);
					((Class528_Sub2) this).anIntArray8610[i_1396_] = ((((Class528_Sub2) this).anIntArray8610[i_1396_] * i_1404_) - (((Class528_Sub2) this).anIntArray8580[i_1396_] * i_1403_) + 16383) >> 14;
					((Class528_Sub2) this).anIntArray8580[i_1396_] = i_1405_;
				}
				((Class528_Sub2) this).anIntArray8580[i_1396_] += ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_1396_] += ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_1396_] += ((Class528_Sub2) this).anInt8613;
			}
		} else if (i == 3) {
			for (int i_1406_ = 0; i_1406_ < ((Class528_Sub2) this).anInt8578; i_1406_++) {
				((Class528_Sub2) this).anIntArray8580[i_1406_] -= ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_1406_] -= ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_1406_] -= ((Class528_Sub2) this).anInt8613;
				((Class528_Sub2) this).anIntArray8580[i_1406_] = (((Class528_Sub2) this).anIntArray8580[i_1406_] * i_1390_ / 128);
				((Class528_Sub2) this).anIntArray8581[i_1406_] = (((Class528_Sub2) this).anIntArray8581[i_1406_] * i_1391_ / 128);
				((Class528_Sub2) this).anIntArray8610[i_1406_] = (((Class528_Sub2) this).anIntArray8610[i_1406_] * i_1392_ / 128);
				((Class528_Sub2) this).anIntArray8580[i_1406_] += ((Class528_Sub2) this).anInt8611;
				((Class528_Sub2) this).anIntArray8581[i_1406_] += ((Class528_Sub2) this).anInt8607;
				((Class528_Sub2) this).anIntArray8610[i_1406_] += ((Class528_Sub2) this).anInt8613;
			}
		} else if (i == 5) {
			for (int i_1407_ = 0; i_1407_ < ((Class528_Sub2) this).anInt8586; i_1407_++) {
				int i_1408_ = ((((Class528_Sub2) this).aByteArray8602[i_1407_] & 0xff) + i_1390_ * 8);
				if (i_1408_ < 0)
					i_1408_ = 0;
				else if (i_1408_ > 255)
					i_1408_ = 255;
				((Class528_Sub2) this).aByteArray8602[i_1407_] = (byte) i_1408_;
			}
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_1409_ = 0; i_1409_ < ((Class528_Sub2) this).anInt8617; i_1409_++) {
					Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_1409_];
					Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1409_];
					((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & 0xffffff) | 255 - ((((Class528_Sub2) this).aByteArray8602[(((Class193) class193).anInt2393 * 142270897)]) & 0xff) << 24) * -1022818925;
				}
			}
		} else if (i == 7) {
			for (int i_1410_ = 0; i_1410_ < ((Class528_Sub2) this).anInt8586; i_1410_++) {
				int i_1411_ = ((Class528_Sub2) this).aShortArray8604[i_1410_] & 0xffff;
				int i_1412_ = i_1411_ >> 10 & 0x3f;
				int i_1413_ = i_1411_ >> 7 & 0x7;
				int i_1414_ = i_1411_ & 0x7f;
				i_1412_ = i_1412_ + i_1390_ & 0x3f;
				i_1413_ += i_1391_;
				if (i_1413_ < 0)
					i_1413_ = 0;
				else if (i_1413_ > 7)
					i_1413_ = 7;
				i_1414_ += i_1392_;
				if (i_1414_ < 0)
					i_1414_ = 0;
				else if (i_1414_ > 127)
					i_1414_ = 127;
				((Class528_Sub2) this).aShortArray8604[i_1410_] = (short) (i_1412_ << 10 | i_1413_ << 7 | i_1414_);
			}
			((Class528_Sub2) this).aBool8609 = true;
			if (((Class528_Sub2) this).aClass193Array8618 != null) {
				for (int i_1415_ = 0; i_1415_ < ((Class528_Sub2) this).anInt8617; i_1415_++) {
					Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_1415_];
					Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1415_];
					((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | ((Class335.anIntArray3916[Class372.method6362((((Class528_Sub2) this).aShortArray8604[((((Class193) class193).anInt2393) * 142270897)]) & 0xffff, 745540902) & 0xffff]) & 0xffffff)) * -1022818925;
				}
			}
		} else if (i == 8) {
			for (int i_1416_ = 0; i_1416_ < ((Class528_Sub2) this).anInt8617; i_1416_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1416_];
				((Class176) class176).anInt2192 += i_1390_ * -943685543;
				((Class176) class176).anInt2189 += i_1391_ * 1414070385;
			}
		} else if (i == 10) {
			for (int i_1417_ = 0; i_1417_ < ((Class528_Sub2) this).anInt8617; i_1417_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1417_];
				((Class176) class176).aFloat2190 = (((Class176) class176).aFloat2190 * (float) i_1390_ / 128.0F);
				((Class176) class176).aFloat2191 = (((Class176) class176).aFloat2191 * (float) i_1391_ / 128.0F);
			}
		} else if (i == 9) {
			for (int i_1418_ = 0; i_1418_ < ((Class528_Sub2) this).anInt8617; i_1418_++) {
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1418_];
				((Class176) class176).anInt2194 = (((Class176) class176).anInt2194 * 156323613 + i_1390_ & 0x3fff) * 2076699445;
			}
		}
	}

	public int ct() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8627;
	}

	public int cu() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8627;
	}

	public int ha() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8629;
	}

	public int cw() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8570;
	}

	void method13875() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				int i_1419_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_1419_;
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					i_1419_ = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = -i_1419_;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						int i_1420_ = (((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410);
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = ((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -i_1420_;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_1421_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_1421_;
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	public int c() {
		return ((Class528_Sub2) this).anInt8606;
	}

	public int ck() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8571;
	}

	public int co() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8629;
	}

	void method13876() {
		if (!((Class528_Sub2) this).aBool8621) {
			int i = 0;
			int i_1422_ = 0;
			int i_1423_ = 32767;
			int i_1424_ = 32767;
			int i_1425_ = 32767;
			int i_1426_ = -32768;
			int i_1427_ = -32768;
			int i_1428_ = -32768;
			for (int i_1429_ = 0; i_1429_ < ((Class528_Sub2) this).anInt8579; i_1429_++) {
				int i_1430_ = ((Class528_Sub2) this).anIntArray8580[i_1429_];
				int i_1431_ = ((Class528_Sub2) this).anIntArray8581[i_1429_];
				int i_1432_ = ((Class528_Sub2) this).anIntArray8610[i_1429_];
				if (i_1430_ < i_1423_)
					i_1423_ = i_1430_;
				if (i_1430_ > i_1426_)
					i_1426_ = i_1430_;
				if (i_1431_ < i_1424_)
					i_1424_ = i_1431_;
				if (i_1431_ > i_1427_)
					i_1427_ = i_1431_;
				if (i_1432_ < i_1425_)
					i_1425_ = i_1432_;
				if (i_1432_ > i_1428_)
					i_1428_ = i_1432_;
				int i_1433_ = i_1430_ * i_1430_ + i_1432_ * i_1432_;
				if (i_1433_ > i)
					i = i_1433_;
				i_1433_ += i_1431_ * i_1431_;
				if (i_1433_ > i_1422_)
					i_1422_ = i_1433_;
			}
			((Class528_Sub2) this).aShort8634 = (short) i_1423_;
			((Class528_Sub2) this).aShort8627 = (short) i_1426_;
			((Class528_Sub2) this).aShort8570 = (short) i_1424_;
			((Class528_Sub2) this).aShort8625 = (short) i_1427_;
			((Class528_Sub2) this).aShort8571 = (short) i_1425_;
			((Class528_Sub2) this).aShort8629 = (short) i_1428_;
			((Class528_Sub2) this).aShort8595 = (short) (int) (Math.sqrt((double) i) + 0.99);
			((Class528_Sub2) this).aShort8574 = (short) (int) (Math.sqrt((double) i_1422_) + 0.99);
			((Class528_Sub2) this).aBool8621 = true;
		}
	}

	public void ce(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x1000) != 4096)
			throw new IllegalStateException();
		((Class528_Sub2) this).anInt8606 = i;
		((Class528_Sub2) this).anInt8598 = 0;
	}

	void method13877() {
		if (((Class528_Sub2) this).anInt8598 == 0 && ((Class528_Sub2) this).aClass189Array8584 == null) {
			if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
				synchronized (this) {
					method13797();
				}
			} else
				method13797();
		}
	}

	public int ch() {
		return ((Class528_Sub2) this).anInt8577;
	}

	public byte[] cz() {
		return ((Class528_Sub2) this).aByteArray8602;
	}

	public void dl(int i) {
		if ((((Class528_Sub2) this).anInt8575 & 0x3) != 3)
			throw new IllegalStateException();
		int i_1434_ = Class382.anIntArray4657[i];
		int i_1435_ = Class382.anIntArray4661[i];
		synchronized (this) {
			for (int i_1436_ = 0; i_1436_ < ((Class528_Sub2) this).anInt8578; i_1436_++) {
				int i_1437_ = (((Class528_Sub2) this).anIntArray8581[i_1436_] * i_1434_ + (((Class528_Sub2) this).anIntArray8580[i_1436_] * i_1435_)) >> 14;
				((Class528_Sub2) this).anIntArray8581[i_1436_] = (((Class528_Sub2) this).anIntArray8581[i_1436_] * i_1435_ - (((Class528_Sub2) this).anIntArray8580[i_1436_] * i_1434_)) >> 14;
				((Class528_Sub2) this).anIntArray8580[i_1436_] = i_1437_;
			}
			method13812();
		}
	}

	public void method11307(byte i, byte[] is) {
		if ((((Class528_Sub2) this).anInt8575 & 0x100000) == 0)
			throw new RuntimeException();
		if (((Class528_Sub2) this).aByteArray8602 == null)
			((Class528_Sub2) this).aByteArray8602 = new byte[((Class528_Sub2) this).anInt8586];
		if (is == null) {
			for (int i_1438_ = 0; i_1438_ < ((Class528_Sub2) this).anInt8586; i_1438_++)
				((Class528_Sub2) this).aByteArray8602[i_1438_] = i;
		} else {
			for (int i_1439_ = 0; i_1439_ < ((Class528_Sub2) this).anInt8586; i_1439_++) {
				int i_1440_ = 255 - ((255 - (is[i_1439_] & 0xff)) * (255 - (i & 0xff)) / 255);
				((Class528_Sub2) this).aByteArray8602[i_1439_] = (byte) i_1440_;
			}
		}
		if (((Class528_Sub2) this).anInt8598 == 2)
			((Class528_Sub2) this).anInt8598 = 1;
	}

	void method13878() {
		synchronized (this) {
			for (int i = 0; i < ((Class528_Sub2) this).anInt8579; i++) {
				int i_1441_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_1441_;
				if (((Class528_Sub2) this).aClass189Array8584[i] != null) {
					i_1441_ = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2380;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2380 = ((Class189) (((Class528_Sub2) this).aClass189Array8584[i])).anInt2379;
					((Class189) ((Class528_Sub2) this).aClass189Array8584[i]).anInt2379 = -i_1441_;
				}
			}
			if (((Class528_Sub2) this).aClass195Array8599 != null) {
				for (int i = 0; i < ((Class528_Sub2) this).anInt8586; i++) {
					if (((Class528_Sub2) this).aClass195Array8599[i] != null) {
						int i_1442_ = (((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410);
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2410 = ((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412;
						((Class195) (((Class528_Sub2) this).aClass195Array8599[i])).anInt2412 = -i_1442_;
					}
				}
			}
			for (int i = ((Class528_Sub2) this).anInt8579; i < ((Class528_Sub2) this).anInt8578; i++) {
				int i_1443_ = ((Class528_Sub2) this).anIntArray8580[i];
				((Class528_Sub2) this).anIntArray8580[i] = ((Class528_Sub2) this).anIntArray8610[i];
				((Class528_Sub2) this).anIntArray8610[i] = -i_1443_;
			}
			((Class528_Sub2) this).anInt8598 = 0;
			((Class528_Sub2) this).aBool8621 = false;
		}
	}

	public Class87[] method11300() {
		return ((Class528_Sub2) this).aClass87Array8615;
	}

	public Class172[] method11331() {
		return ((Class528_Sub2) this).aClass172Array8616;
	}

	public Class172[] method11283() {
		return ((Class528_Sub2) this).aClass172Array8616;
	}

	public Class172[] method11302() {
		return ((Class528_Sub2) this).aClass172Array8616;
	}

	public void cy(int i, int i_1444_, int i_1445_, int i_1446_) {
		if ((((Class528_Sub2) this).anInt8575 & 0x80000) != 524288)
			throw new IllegalStateException();
		for (int i_1447_ = 0; i_1447_ < ((Class528_Sub2) this).anInt8586; i_1447_++) {
			int i_1448_ = ((Class528_Sub2) this).aShortArray8604[i_1447_] & 0xffff;
			int i_1449_ = i_1448_ >> 10 & 0x3f;
			int i_1450_ = i_1448_ >> 7 & 0x7;
			int i_1451_ = i_1448_ & 0x7f;
			if (i != -1)
				i_1449_ += (i - i_1449_) * i_1446_ >> 7;
			if (i_1444_ != -1)
				i_1450_ += (i_1444_ - i_1450_) * i_1446_ >> 7;
			if (i_1445_ != -1)
				i_1451_ += (i_1445_ - i_1451_) * i_1446_ >> 7;
			((Class528_Sub2) this).aShortArray8604[i_1447_] = (short) (i_1449_ << 10 | i_1450_ << 7 | i_1451_);
		}
		if (((Class528_Sub2) this).aClass193Array8618 != null) {
			for (int i_1452_ = 0; i_1452_ < ((Class528_Sub2) this).anInt8617; i_1452_++) {
				Class193 class193 = ((Class528_Sub2) this).aClass193Array8618[i_1452_];
				Class176 class176 = ((Class528_Sub2) this).aClass176Array8582[i_1452_];
				((Class176) class176).anInt2199 = ((((Class176) class176).anInt2199 * -1303125861 & ~0xffffff) | ((Class335.anIntArray3916[Class372.method6362(((((Class528_Sub2) this).aShortArray8604[(((Class193) class193).anInt2393) * 142270897]) & 0xffff), 1460494952) & 0xffff]) & 0xffffff)) * -1022818925;
			}
		}
		if (((Class528_Sub2) this).anInt8598 == 2)
			((Class528_Sub2) this).anInt8598 = 1;
	}

	public boolean dh() {
		return ((Class528_Sub2) this).aBool8640;
	}

	public int cb() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8570;
	}

	public void bc(int i, int i_1453_, Class390 class390, Class390 class390_1454_, int i_1455_, int i_1456_, int i_1457_) {
		if (i == 3) {
			if ((((Class528_Sub2) this).anInt8575 & 0x7) != 7)
				throw new IllegalStateException();
		} else if ((((Class528_Sub2) this).anInt8575 & 0x2) != 2)
			throw new IllegalStateException();
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		int i_1458_ = i_1455_ + ((Class528_Sub2) this).aShort8634;
		int i_1459_ = i_1455_ + ((Class528_Sub2) this).aShort8627;
		int i_1460_ = i_1457_ + ((Class528_Sub2) this).aShort8571;
		int i_1461_ = i_1457_ + ((Class528_Sub2) this).aShort8629;
		if (i == 4 || (i_1458_ >= 0 && ((i_1459_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4776 * -1843860823) && i_1460_ >= 0 && ((i_1461_ + class390.anInt4774 * 750971439 >> class390.anInt4775 * 1856651955) < class390.anInt4773 * 1826078169))) {
			int[][] is = class390.anIntArrayArray4772;
			int[][] is_1462_ = null;
			if (class390_1454_ != null)
				is_1462_ = class390_1454_.anIntArrayArray4772;
			if (i == 4 || i == 5) {
				if (class390_1454_ == null || (i_1458_ < 0 || ((i_1459_ + class390_1454_.anInt4774 * 750971439 >> class390_1454_.anInt4775 * 1856651955) >= class390_1454_.anInt4776 * -1843860823) || i_1460_ < 0 || ((i_1461_ + class390_1454_.anInt4774 * 750971439 >> class390_1454_.anInt4775 * 1856651955) >= class390_1454_.anInt4773 * 1826078169)))
					return;
			} else {
				i_1458_ >>= class390.anInt4775 * 1856651955;
				i_1459_ = (i_1459_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				i_1460_ >>= class390.anInt4775 * 1856651955;
				i_1461_ = (i_1461_ + (class390.anInt4774 * 750971439 - 1) >> class390.anInt4775 * 1856651955);
				if (is[i_1458_][i_1460_] == i_1456_ && is[i_1459_][i_1460_] == i_1456_ && is[i_1458_][i_1461_] == i_1456_ && is[i_1459_][i_1461_] == i_1456_)
					return;
			}
			synchronized (this) {
				if (i == 1) {
					int i_1463_ = class390.anInt4774 * 750971439 - 1;
					for (int i_1464_ = 0; i_1464_ < ((Class528_Sub2) this).anInt8579; i_1464_++) {
						int i_1465_ = (((Class528_Sub2) this).anIntArray8580[i_1464_] + i_1455_);
						int i_1466_ = (((Class528_Sub2) this).anIntArray8610[i_1464_] + i_1457_);
						int i_1467_ = i_1465_ & i_1463_;
						int i_1468_ = i_1466_ & i_1463_;
						int i_1469_ = i_1465_ >> class390.anInt4775 * 1856651955;
						int i_1470_ = i_1466_ >> class390.anInt4775 * 1856651955;
						int i_1471_ = (((is[i_1469_][i_1470_] * (class390.anInt4774 * 750971439 - i_1467_)) + is[i_1469_ + 1][i_1470_] * i_1467_) >> class390.anInt4775 * 1856651955);
						int i_1472_ = (((is[i_1469_][i_1470_ + 1] * (class390.anInt4774 * 750971439 - i_1467_)) + is[i_1469_ + 1][i_1470_ + 1] * i_1467_) >> class390.anInt4775 * 1856651955);
						int i_1473_ = (i_1471_ * (class390.anInt4774 * 750971439 - i_1468_) + i_1472_ * i_1468_ >> class390.anInt4775 * 1856651955);
						((Class528_Sub2) this).anIntArray8581[i_1464_] = (((Class528_Sub2) this).anIntArray8581[i_1464_] + i_1473_ - i_1456_);
					}
					for (int i_1474_ = ((Class528_Sub2) this).anInt8579; i_1474_ < ((Class528_Sub2) this).anInt8578; i_1474_++) {
						int i_1475_ = (((Class528_Sub2) this).anIntArray8580[i_1474_] + i_1455_);
						int i_1476_ = (((Class528_Sub2) this).anIntArray8610[i_1474_] + i_1457_);
						int i_1477_ = i_1475_ & i_1463_;
						int i_1478_ = i_1476_ & i_1463_;
						int i_1479_ = i_1475_ >> class390.anInt4775 * 1856651955;
						int i_1480_ = i_1476_ >> class390.anInt4775 * 1856651955;
						if (i_1479_ >= 0 && i_1479_ < is.length - 1 && i_1480_ >= 0 && i_1480_ < is[0].length - 1) {
							int i_1481_ = (((is[i_1479_][i_1480_] * (class390.anInt4774 * 750971439 - i_1477_)) + is[i_1479_ + 1][i_1480_] * i_1477_) >> class390.anInt4775 * 1856651955);
							int i_1482_ = (((is[i_1479_][i_1480_ + 1] * (class390.anInt4774 * 750971439 - i_1477_)) + is[i_1479_ + 1][i_1480_ + 1] * i_1477_) >> class390.anInt4775 * 1856651955);
							int i_1483_ = (i_1481_ * (class390.anInt4774 * 750971439 - i_1478_) + i_1482_ * i_1478_ >> class390.anInt4775 * 1856651955);
							((Class528_Sub2) this).anIntArray8581[i_1474_] = (((Class528_Sub2) this).anIntArray8581[i_1474_]) + i_1483_ - i_1456_;
						}
					}
				} else if (i == 2) {
					if (((Class528_Sub2) this).aShort8570 == 0)
						return;
					int i_1484_ = class390.anInt4774 * 750971439 - 1;
					for (int i_1485_ = 0; i_1485_ < ((Class528_Sub2) this).anInt8579; i_1485_++) {
						int i_1486_ = ((((Class528_Sub2) this).anIntArray8581[i_1485_] << 16) / ((Class528_Sub2) this).aShort8570);
						if (i_1486_ < i_1453_) {
							int i_1487_ = ((((Class528_Sub2) this).anIntArray8580[i_1485_]) + i_1455_);
							int i_1488_ = ((((Class528_Sub2) this).anIntArray8610[i_1485_]) + i_1457_);
							int i_1489_ = i_1487_ & i_1484_;
							int i_1490_ = i_1488_ & i_1484_;
							int i_1491_ = i_1487_ >> class390.anInt4775 * 1856651955;
							int i_1492_ = i_1488_ >> class390.anInt4775 * 1856651955;
							int i_1493_ = (((is[i_1491_][i_1492_] * (class390.anInt4774 * 750971439 - i_1489_)) + is[i_1491_ + 1][i_1492_] * i_1489_) >> class390.anInt4775 * 1856651955);
							int i_1494_ = (((is[i_1491_][i_1492_ + 1] * (class390.anInt4774 * 750971439 - i_1489_)) + is[i_1491_ + 1][i_1492_ + 1] * i_1489_) >> class390.anInt4775 * 1856651955);
							int i_1495_ = (i_1493_ * (class390.anInt4774 * 750971439 - i_1490_) + i_1494_ * i_1490_ >> class390.anInt4775 * 1856651955);
							((Class528_Sub2) this).anIntArray8581[i_1485_] = ((((Class528_Sub2) this).anIntArray8581[i_1485_]) + ((i_1495_ - i_1456_) * (i_1453_ - i_1486_) / i_1453_));
						} else
							((Class528_Sub2) this).anIntArray8581[i_1485_] = (((Class528_Sub2) this).anIntArray8581[i_1485_]);
					}
					for (int i_1496_ = ((Class528_Sub2) this).anInt8579; i_1496_ < ((Class528_Sub2) this).anInt8578; i_1496_++) {
						int i_1497_ = ((((Class528_Sub2) this).anIntArray8581[i_1496_] << 16) / ((Class528_Sub2) this).aShort8570);
						if (i_1497_ < i_1453_) {
							int i_1498_ = ((((Class528_Sub2) this).anIntArray8580[i_1496_]) + i_1455_);
							int i_1499_ = ((((Class528_Sub2) this).anIntArray8610[i_1496_]) + i_1457_);
							int i_1500_ = i_1498_ & i_1484_;
							int i_1501_ = i_1499_ & i_1484_;
							int i_1502_ = i_1498_ >> class390.anInt4775 * 1856651955;
							int i_1503_ = i_1499_ >> class390.anInt4775 * 1856651955;
							if (i_1502_ >= 0 && (i_1502_ < class390.anInt4776 * -1843860823 - 1) && i_1503_ >= 0 && (i_1503_ < class390.anInt4773 * 1826078169 - 1)) {
								int i_1504_ = (((is[i_1502_][i_1503_] * (class390.anInt4774 * 750971439 - i_1500_)) + is[i_1502_ + 1][i_1503_] * i_1500_) >> class390.anInt4775 * 1856651955);
								int i_1505_ = (((is[i_1502_][i_1503_ + 1] * (class390.anInt4774 * 750971439 - i_1500_)) + (is[i_1502_ + 1][i_1503_ + 1] * i_1500_)) >> class390.anInt4775 * 1856651955);
								int i_1506_ = ((i_1504_ * (class390.anInt4774 * 750971439 - i_1501_)) + i_1505_ * i_1501_ >> class390.anInt4775 * 1856651955);
								((Class528_Sub2) this).anIntArray8581[i_1496_] = ((((Class528_Sub2) this).anIntArray8581[i_1496_]) + ((i_1506_ - i_1456_) * (i_1453_ - i_1497_) / i_1453_));
							}
						} else
							((Class528_Sub2) this).anIntArray8581[i_1496_] = (((Class528_Sub2) this).anIntArray8581[i_1496_]);
					}
				} else if (i == 3) {
					int i_1507_ = (i_1453_ & 0xff) * 4;
					int i_1508_ = (i_1453_ >> 8 & 0xff) * 4;
					int i_1509_ = (i_1453_ >> 16 & 0xff) << 6;
					int i_1510_ = (i_1453_ >> 24 & 0xff) << 6;
					if (i_1455_ - (i_1507_ >> 1) < 0 || ((i_1455_ + (i_1507_ >> 1) + class390.anInt4774 * 750971439) >= (class390.anInt4776 * -1843860823 << class390.anInt4775 * 1856651955)) || i_1457_ - (i_1508_ >> 1) < 0 || ((i_1457_ + (i_1508_ >> 1) + class390.anInt4774 * 750971439) >= (class390.anInt4773 * 1826078169 << class390.anInt4775 * 1856651955)))
						return;
					method11281(class390, i_1455_, i_1456_, i_1457_, i_1507_, i_1508_, i_1509_, i_1510_);
				} else if (i == 4) {
					int i_1511_ = class390_1454_.anInt4774 * 750971439 - 1;
					int i_1512_ = (((Class528_Sub2) this).aShort8625 - ((Class528_Sub2) this).aShort8570);
					for (int i_1513_ = 0; i_1513_ < ((Class528_Sub2) this).anInt8579; i_1513_++) {
						int i_1514_ = (((Class528_Sub2) this).anIntArray8580[i_1513_] + i_1455_);
						int i_1515_ = (((Class528_Sub2) this).anIntArray8610[i_1513_] + i_1457_);
						int i_1516_ = i_1514_ & i_1511_;
						int i_1517_ = i_1515_ & i_1511_;
						int i_1518_ = i_1514_ >> class390_1454_.anInt4775 * 1856651955;
						int i_1519_ = i_1515_ >> class390_1454_.anInt4775 * 1856651955;
						int i_1520_ = (((is_1462_[i_1518_][i_1519_] * (class390_1454_.anInt4774 * 750971439 - i_1516_)) + is_1462_[i_1518_ + 1][i_1519_] * i_1516_) >> class390_1454_.anInt4775 * 1856651955);
						int i_1521_ = (((is_1462_[i_1518_][i_1519_ + 1] * (class390_1454_.anInt4774 * 750971439 - i_1516_)) + is_1462_[i_1518_ + 1][i_1519_ + 1] * i_1516_) >> class390_1454_.anInt4775 * 1856651955);
						int i_1522_ = (i_1520_ * (class390_1454_.anInt4774 * 750971439 - i_1517_) + i_1521_ * i_1517_ >> class390_1454_.anInt4775 * 1856651955);
						((Class528_Sub2) this).anIntArray8581[i_1513_] = (((Class528_Sub2) this).anIntArray8581[i_1513_] + (i_1522_ - i_1456_) + i_1512_);
					}
					for (int i_1523_ = ((Class528_Sub2) this).anInt8579; i_1523_ < ((Class528_Sub2) this).anInt8578; i_1523_++) {
						int i_1524_ = (((Class528_Sub2) this).anIntArray8580[i_1523_] + i_1455_);
						int i_1525_ = (((Class528_Sub2) this).anIntArray8610[i_1523_] + i_1457_);
						int i_1526_ = i_1524_ & i_1511_;
						int i_1527_ = i_1525_ & i_1511_;
						int i_1528_ = i_1524_ >> class390_1454_.anInt4775 * 1856651955;
						int i_1529_ = i_1525_ >> class390_1454_.anInt4775 * 1856651955;
						if (i_1528_ >= 0 && (i_1528_ < class390_1454_.anInt4776 * -1843860823 - 1) && i_1529_ >= 0 && (i_1529_ < class390_1454_.anInt4773 * 1826078169 - 1)) {
							int i_1530_ = (((is_1462_[i_1528_][i_1529_] * (class390_1454_.anInt4774 * 750971439 - i_1526_)) + is_1462_[i_1528_ + 1][i_1529_] * i_1526_) >> class390_1454_.anInt4775 * 1856651955);
							int i_1531_ = (((is_1462_[i_1528_][i_1529_ + 1] * (class390_1454_.anInt4774 * 750971439 - i_1526_)) + (is_1462_[i_1528_ + 1][i_1529_ + 1] * i_1526_)) >> class390_1454_.anInt4775 * 1856651955);
							int i_1532_ = ((i_1530_ * (class390_1454_.anInt4774 * 750971439 - i_1527_)) + i_1531_ * i_1527_ >> class390_1454_.anInt4775 * 1856651955);
							((Class528_Sub2) this).anIntArray8581[i_1523_] = (((Class528_Sub2) this).anIntArray8581[i_1523_]) + (i_1532_ - i_1456_) + i_1512_;
						}
					}
				} else if (i == 5) {
					int i_1533_ = class390_1454_.anInt4774 * 750971439 - 1;
					int i_1534_ = (((Class528_Sub2) this).aShort8625 - ((Class528_Sub2) this).aShort8570);
					for (int i_1535_ = 0; i_1535_ < ((Class528_Sub2) this).anInt8579; i_1535_++) {
						int i_1536_ = (((Class528_Sub2) this).anIntArray8580[i_1535_] + i_1455_);
						int i_1537_ = (((Class528_Sub2) this).anIntArray8610[i_1535_] + i_1457_);
						int i_1538_ = i_1536_ & i_1533_;
						int i_1539_ = i_1537_ & i_1533_;
						int i_1540_ = i_1536_ >> class390.anInt4775 * 1856651955;
						int i_1541_ = i_1537_ >> class390.anInt4775 * 1856651955;
						int i_1542_ = (((is[i_1540_][i_1541_] * (class390.anInt4774 * 750971439 - i_1538_)) + is[i_1540_ + 1][i_1541_] * i_1538_) >> class390.anInt4775 * 1856651955);
						int i_1543_ = (((is[i_1540_][i_1541_ + 1] * (class390.anInt4774 * 750971439 - i_1538_)) + is[i_1540_ + 1][i_1541_ + 1] * i_1538_) >> class390.anInt4775 * 1856651955);
						int i_1544_ = (i_1542_ * (class390.anInt4774 * 750971439 - i_1539_) + i_1543_ * i_1539_ >> class390.anInt4775 * 1856651955);
						i_1542_ = (((is_1462_[i_1540_][i_1541_] * (class390_1454_.anInt4774 * 750971439 - i_1538_)) + is_1462_[i_1540_ + 1][i_1541_] * i_1538_) >> class390_1454_.anInt4775 * 1856651955);
						i_1543_ = (((is_1462_[i_1540_][i_1541_ + 1] * (class390_1454_.anInt4774 * 750971439 - i_1538_)) + is_1462_[i_1540_ + 1][i_1541_ + 1] * i_1538_) >> class390_1454_.anInt4775 * 1856651955);
						int i_1545_ = (i_1542_ * (class390_1454_.anInt4774 * 750971439 - i_1539_) + i_1543_ * i_1539_ >> class390_1454_.anInt4775 * 1856651955);
						int i_1546_ = i_1544_ - i_1545_ - i_1453_;
						((Class528_Sub2) this).anIntArray8581[i_1535_] = ((((Class528_Sub2) this).anIntArray8581[i_1535_] << 8) / i_1534_ * i_1546_ >> 8) - (i_1456_ - i_1544_);
					}
					for (int i_1547_ = ((Class528_Sub2) this).anInt8579; i_1547_ < ((Class528_Sub2) this).anInt8578; i_1547_++) {
						int i_1548_ = (((Class528_Sub2) this).anIntArray8580[i_1547_] + i_1455_);
						int i_1549_ = (((Class528_Sub2) this).anIntArray8610[i_1547_] + i_1457_);
						int i_1550_ = i_1548_ & i_1533_;
						int i_1551_ = i_1549_ & i_1533_;
						int i_1552_ = i_1548_ >> class390.anInt4775 * 1856651955;
						int i_1553_ = i_1549_ >> class390.anInt4775 * 1856651955;
						if (i_1552_ >= 0 && i_1552_ < class390.anInt4776 * -1843860823 - 1 && (i_1552_ < class390_1454_.anInt4776 * -1843860823 - 1) && i_1553_ >= 0 && i_1553_ < class390.anInt4773 * 1826078169 - 1 && (i_1553_ < class390_1454_.anInt4773 * 1826078169 - 1)) {
							int i_1554_ = (((is[i_1552_][i_1553_] * (class390.anInt4774 * 750971439 - i_1550_)) + is[i_1552_ + 1][i_1553_] * i_1550_) >> class390.anInt4775 * 1856651955);
							int i_1555_ = (((is[i_1552_][i_1553_ + 1] * (class390.anInt4774 * 750971439 - i_1550_)) + is[i_1552_ + 1][i_1553_ + 1] * i_1550_) >> class390.anInt4775 * 1856651955);
							int i_1556_ = (i_1554_ * (class390.anInt4774 * 750971439 - i_1551_) + i_1555_ * i_1551_ >> class390.anInt4775 * 1856651955);
							i_1554_ = (((is_1462_[i_1552_][i_1553_] * (class390_1454_.anInt4774 * 750971439 - i_1550_)) + is_1462_[i_1552_ + 1][i_1553_] * i_1550_) >> class390_1454_.anInt4775 * 1856651955);
							i_1555_ = (((is_1462_[i_1552_][i_1553_ + 1] * (class390_1454_.anInt4774 * 750971439 - i_1550_)) + (is_1462_[i_1552_ + 1][i_1553_ + 1] * i_1550_)) >> class390_1454_.anInt4775 * 1856651955);
							int i_1557_ = ((i_1554_ * (class390_1454_.anInt4774 * 750971439 - i_1551_)) + i_1555_ * i_1551_ >> class390_1454_.anInt4775 * 1856651955);
							int i_1558_ = i_1556_ - i_1557_ - i_1453_;
							((Class528_Sub2) this).anIntArray8581[i_1547_] = (((((Class528_Sub2) this).anIntArray8581[i_1547_]) << 8) / i_1534_ * i_1558_ >> 8) - (i_1456_ - i_1556_);
						}
					}
				}
				((Class528_Sub2) this).aBool8621 = false;
			}
		}
	}

	public int dy() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8595;
	}

	public int dm() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8595;
	}

	public int dp() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8574;
	}

	public int du() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8574;
	}

	Class528_Sub2(Class505_Sub3 class505_sub3) {
		((Class528_Sub2) this).aBool8589 = false;
		((Class528_Sub2) this).aBool8614 = false;
		((Class528_Sub2) this).aBool8621 = false;
		((Class528_Sub2) this).aBool8630 = false;
		((Class528_Sub2) this).aBool8640 = false;
		((Class528_Sub2) this).aClass505_Sub3_8638 = class505_sub3;
	}

	public boolean successful() {
		if (((Class528_Sub2) this).aShortArray8603 == null)
			return true;
		for (int i = 0; i < ((Class528_Sub2) this).aShortArray8603.length; i++) {
			if (((Class528_Sub2) this).aShortArray8603[i] != -1 && !(((Class528_Sub2) this).aClass505_Sub3_8638.method14360(((Class528_Sub2) this).aShortArray8603[i])))
				return false;
		}
		return true;
	}

	public void di(short i, short i_1559_) {
		if (((Class528_Sub2) this).aShortArray8603 != null) {
			if (!((Class528_Sub2) this).aBool8640 && i_1559_ >= 0) {
				Class169 class169 = ((Class528_Sub2) this).aClass505_Sub3_8638.anInterface22_5834.method144(i_1559_ & 0xffff, -2096330622);
				if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
					((Class528_Sub2) this).aBool8640 = true;
			}
			for (int i_1560_ = 0; i_1560_ < ((Class528_Sub2) this).anInt8586; i_1560_++) {
				if (((Class528_Sub2) this).aShortArray8603[i_1560_] == i)
					((Class528_Sub2) this).aShortArray8603[i_1560_] = i_1559_;
			}
		}
	}

	public void df(short i, short i_1561_) {
		if (((Class528_Sub2) this).aShortArray8603 != null) {
			if (!((Class528_Sub2) this).aBool8640 && i_1561_ >= 0) {
				Class169 class169 = ((Class528_Sub2) this).aClass505_Sub3_8638.anInterface22_5834.method144(i_1561_ & 0xffff, -2091368936);
				if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
					((Class528_Sub2) this).aBool8640 = true;
			}
			for (int i_1562_ = 0; i_1562_ < ((Class528_Sub2) this).anInt8586; i_1562_++) {
				if (((Class528_Sub2) this).aShortArray8603[i_1562_] == i)
					((Class528_Sub2) this).aShortArray8603[i_1562_] = i_1561_;
			}
		}
	}

	public boolean dv() {
		return ((Class528_Sub2) this).aBool8630;
	}

	void method11308() {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				while (aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool7023 = true;
			}
		}
	}

	void method11301() {
		if ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).anInt9008) * 656550451 > 1) {
			synchronized (this) {
				while (aBool7023) {
					try {
						this.wait();
					} catch (InterruptedException interruptedexception) {
						/* empty */
					}
				}
				aBool7023 = true;
			}
		}
	}

	Class528_Sub2(Class505_Sub3 class505_sub3, RSMesh class157, int i, int i_1563_, int i_1564_, int i_1565_) {
		((Class528_Sub2) this).aBool8589 = false;
		((Class528_Sub2) this).aBool8614 = false;
		((Class528_Sub2) this).aBool8621 = false;
		((Class528_Sub2) this).aBool8630 = false;
		((Class528_Sub2) this).aBool8640 = false;
		((Class528_Sub2) this).aClass505_Sub3_8638 = class505_sub3;
		((Class528_Sub2) this).anInt8575 = i;
		((Class528_Sub2) this).anInt8606 = i_1563_;
		((Class528_Sub2) this).anInt8577 = i_1564_;
		Interface22 interface22 = ((Class528_Sub2) this).aClass505_Sub3_8638.anInterface22_5834;
		((Class528_Sub2) this).anInt8578 = class157.anInt1974;
		((Class528_Sub2) this).anInt8579 = class157.anInt1999;
		((Class528_Sub2) this).anIntArray8580 = class157.anIntArray1976;
		((Class528_Sub2) this).anIntArray8581 = class157.anIntArray2003;
		((Class528_Sub2) this).anIntArray8610 = class157.anIntArray1978;
		((Class528_Sub2) this).anInt8586 = class157.anInt1973;
		((Class528_Sub2) this).aShortArray8587 = class157.aShortArray1982;
		((Class528_Sub2) this).aShortArray8588 = class157.aShortArray1983;
		((Class528_Sub2) this).aShortArray8642 = class157.aShortArray1984;
		((Class528_Sub2) this).aByteArray8601 = class157.aByteArray1977;
		((Class528_Sub2) this).aShortArray8604 = class157.aShortArray2006;
		((Class528_Sub2) this).aByteArray8602 = class157.aByteArray1975;
		((Class528_Sub2) this).aShortArray8632 = class157.aShortArray1981;
		((Class528_Sub2) this).aByteArray8600 = class157.aByteArray1985;
		((Class528_Sub2) this).aClass87Array8615 = class157.aClass87Array2007;
		((Class528_Sub2) this).aClass172Array8616 = class157.aClass172Array2008;
		((Class528_Sub2) this).aShortArray8569 = class157.aShortArray1980;
		int[] is = new int[((Class528_Sub2) this).anInt8586];
		for (int i_1566_ = 0; i_1566_ < ((Class528_Sub2) this).anInt8586; i_1566_++)
			is[i_1566_] = i_1566_;
		long[] ls = new long[((Class528_Sub2) this).anInt8586];
		boolean bool = (((Class528_Sub2) this).anInt8575 & 0x100) != 0;
		for (int i_1567_ = 0; i_1567_ < ((Class528_Sub2) this).anInt8586; i_1567_++) {
			int i_1568_ = is[i_1567_];
			Class169 class169 = null;
			int i_1569_ = 0;
			int i_1570_ = 0;
			int i_1571_ = 0;
			int i_1572_ = 0;
			if (class157.aClass84Array2009 != null) {
				boolean bool_1573_ = false;
				for (int i_1574_ = 0; i_1574_ < class157.aClass84Array2009.length; i_1574_++) {
					Class84 class84 = class157.aClass84Array2009[i_1574_];
					if (i_1568_ == class84.anInt809 * 2110152423) {
						Class347 class347 = Class417.method7005((class84.anInt812 * -221586257), -1951471035);
						if (class347.aBool4059)
							bool_1573_ = true;
						if (class347.anInt4055 * 117872423 != -1) {
							Class169 class169_1575_ = interface22.method144((class347.anInt4055 * 117872423), -1996466919);
							if (class169_1575_.anInt2074 * 1960017665 == 2)
								((Class528_Sub2) this).aBool8630 = true;
						}
					}
				}
				if (bool_1573_)
					ls[i_1567_] = 9223372036854775807L;
			}
			int i_1576_ = -1;
			if (class157.aShortArray1993 != null) {
				i_1576_ = class157.aShortArray1993[i_1568_];
				if (i_1576_ != -1) {
					class169 = interface22.method144(i_1576_ & 0xffff, -1793423627);
					if ((i_1565_ & 0x40) == 0 || !class169.aBool2056) {
						i_1571_ = class169.aByte2064;
						i_1572_ = class169.aByte2076;
					} else
						i_1576_ = -1;
				}
			}
			boolean bool_1577_ = ((((Class528_Sub2) this).aByteArray8602 != null && ((Class528_Sub2) this).aByteArray8602[i_1568_] != 0) || (class169 != null && class169.anInt2074 * 1960017665 == 2));
			if ((bool || bool_1577_) && ((Class528_Sub2) this).aByteArray8601 != null)
				i_1569_ += ((Class528_Sub2) this).aByteArray8601[i_1568_] << 17;
			if (bool_1577_)
				i_1569_ += 65536;
			i_1569_ += (i_1571_ & 0xff) << 8;
			i_1569_ += i_1572_ & 0xff;
			i_1570_ += (i_1576_ & 0xffff) << 16;
			i_1570_ += i_1567_ & 0xffff;
			ls[i_1567_] = ((long) i_1569_ << 32) + (long) i_1570_;
			((Class528_Sub2) this).aBool8630 |= bool_1577_;
		}
		Class159.method2736(ls, is, (byte) 8);
		if (class157.aClass84Array2009 != null) {
			((Class528_Sub2) this).anInt8617 = class157.aClass84Array2009.length;
			((Class528_Sub2) this).aClass193Array8618 = new Class193[((Class528_Sub2) this).anInt8617];
			((Class528_Sub2) this).aClass176Array8582 = new Class176[((Class528_Sub2) this).anInt8617];
			for (int i_1578_ = 0; i_1578_ < class157.aClass84Array2009.length; i_1578_++) {
				Class84 class84 = class157.aClass84Array2009[i_1578_];
				Class347 class347 = Class417.method7005(class84.anInt812 * -221586257, -1147106415);
				int i_1579_ = ((Class335.anIntArray3916[(class157.aShortArray2006[class84.anInt809 * 2110152423]) & 0xffff]) & 0xffffff);
				i_1579_ = i_1579_ | 255 - (class157.aByteArray1975 != null ? ((class157.aByteArray1975[class84.anInt809 * 2110152423]) & 0xff) : 0) << 24;
				((Class528_Sub2) this).aClass193Array8618[i_1578_] = new Class193(class84.anInt809 * 2110152423, (class157.aShortArray1982[class84.anInt809 * 2110152423]), (class157.aShortArray1983[class84.anInt809 * 2110152423]), (class157.aShortArray1984[class84.anInt809 * 2110152423]), class347.anInt4054 * -1720863327, class347.anInt4050 * -743047207, class347.anInt4055 * 117872423, class347.anInt4057 * 1007428267, class347.anInt4051 * -920295177, class347.aBool4059,
						class84.anInt810 * 1823219025);
				((Class528_Sub2) this).aClass176Array8582[i_1578_] = new Class176(i_1579_);
			}
		}
		((Class528_Sub2) this).aFloatArrayArray8635 = new float[((Class528_Sub2) this).anInt8586][];
		((Class528_Sub2) this).aFloatArrayArray8591 = new float[((Class528_Sub2) this).anInt8586][];
		Class83 class83 = method11256(class157, is, ((Class528_Sub2) this).anInt8586);
		Class185 class185 = ((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread());
		float[] fs = ((Class185) class185).aFloatArray2338;
		boolean bool_1580_ = false;
		for (int i_1581_ = 0; i_1581_ < ((Class528_Sub2) this).anInt8586; i_1581_++) {
			int i_1582_ = is[i_1581_];
			int i_1583_;
			if (class157.aByteArray1988 == null)
				i_1583_ = -1;
			else
				i_1583_ = class157.aByteArray1988[i_1582_];
			int i_1584_ = (class157.aShortArray1993 == null ? (int) -1 : class157.aShortArray1993[i_1582_]);
			if (i_1584_ != -1 && (i_1565_ & 0x40) != 0) {
				Class169 class169 = interface22.method144(i_1584_ & 0xffff, -1940118414);
				if (class169.aBool2056)
					i_1584_ = -1;
			}
			if (i_1584_ != -1) {
				bool_1580_ = true;
				float[] fs_1585_ = (((Class528_Sub2) this).aFloatArrayArray8635[i_1582_] = new float[3]);
				float[] fs_1586_ = (((Class528_Sub2) this).aFloatArrayArray8591[i_1582_] = new float[3]);
				boolean bool_1587_ = false;
				if (i_1583_ == -1) {
					fs_1585_[0] = 0.0F;
					fs_1586_[0] = 1.0F;
					fs_1585_[1] = 1.0F;
					fs_1586_[1] = 1.0F;
					fs_1585_[2] = 0.0F;
					fs_1586_[2] = 0.0F;
				} else {
					i_1583_ &= 0xff;
					byte i_1588_ = class157.aByteArray1995[i_1583_];
					if (i_1588_ == 0) {
						short i_1589_ = ((Class528_Sub2) this).aShortArray8587[i_1582_];
						short i_1590_ = ((Class528_Sub2) this).aShortArray8588[i_1582_];
						short i_1591_ = ((Class528_Sub2) this).aShortArray8642[i_1582_];
						short i_1592_ = class157.aShortArray1996[i_1583_];
						short i_1593_ = class157.aShortArray1987[i_1583_];
						short i_1594_ = class157.aShortArray1998[i_1583_];
						float f = (float) (((Class528_Sub2) this).anIntArray8580[i_1592_]);
						float f_1595_ = (float) (((Class528_Sub2) this).anIntArray8581[i_1592_]);
						float f_1596_ = (float) (((Class528_Sub2) this).anIntArray8610[i_1592_]);
						float f_1597_ = ((float) (((Class528_Sub2) this).anIntArray8580[i_1593_]) - f);
						float f_1598_ = ((float) (((Class528_Sub2) this).anIntArray8581[i_1593_]) - f_1595_);
						float f_1599_ = ((float) (((Class528_Sub2) this).anIntArray8610[i_1593_]) - f_1596_);
						float f_1600_ = ((float) (((Class528_Sub2) this).anIntArray8580[i_1594_]) - f);
						float f_1601_ = ((float) (((Class528_Sub2) this).anIntArray8581[i_1594_]) - f_1595_);
						float f_1602_ = ((float) (((Class528_Sub2) this).anIntArray8610[i_1594_]) - f_1596_);
						float f_1603_ = ((float) (((Class528_Sub2) this).anIntArray8580[i_1589_]) - f);
						float f_1604_ = ((float) (((Class528_Sub2) this).anIntArray8581[i_1589_]) - f_1595_);
						float f_1605_ = ((float) (((Class528_Sub2) this).anIntArray8610[i_1589_]) - f_1596_);
						float f_1606_ = ((float) (((Class528_Sub2) this).anIntArray8580[i_1590_]) - f);
						float f_1607_ = ((float) (((Class528_Sub2) this).anIntArray8581[i_1590_]) - f_1595_);
						float f_1608_ = ((float) (((Class528_Sub2) this).anIntArray8610[i_1590_]) - f_1596_);
						float f_1609_ = ((float) (((Class528_Sub2) this).anIntArray8580[i_1591_]) - f);
						float f_1610_ = ((float) (((Class528_Sub2) this).anIntArray8581[i_1591_]) - f_1595_);
						float f_1611_ = ((float) (((Class528_Sub2) this).anIntArray8610[i_1591_]) - f_1596_);
						float f_1612_ = f_1598_ * f_1602_ - f_1599_ * f_1601_;
						float f_1613_ = f_1599_ * f_1600_ - f_1597_ * f_1602_;
						float f_1614_ = f_1597_ * f_1601_ - f_1598_ * f_1600_;
						float f_1615_ = f_1601_ * f_1614_ - f_1602_ * f_1613_;
						float f_1616_ = f_1602_ * f_1612_ - f_1600_ * f_1614_;
						float f_1617_ = f_1600_ * f_1613_ - f_1601_ * f_1612_;
						float f_1618_ = 1.0F / (f_1615_ * f_1597_ + f_1616_ * f_1598_ + f_1617_ * f_1599_);
						fs_1585_[0] = (f_1615_ * f_1603_ + f_1616_ * f_1604_ + f_1617_ * f_1605_) * f_1618_;
						fs_1585_[1] = (f_1615_ * f_1606_ + f_1616_ * f_1607_ + f_1617_ * f_1608_) * f_1618_;
						fs_1585_[2] = (f_1615_ * f_1609_ + f_1616_ * f_1610_ + f_1617_ * f_1611_) * f_1618_;
						f_1615_ = f_1598_ * f_1614_ - f_1599_ * f_1613_;
						f_1616_ = f_1599_ * f_1612_ - f_1597_ * f_1614_;
						f_1617_ = f_1597_ * f_1613_ - f_1598_ * f_1612_;
						f_1618_ = 1.0F / (f_1615_ * f_1600_ + f_1616_ * f_1601_ + f_1617_ * f_1602_);
						fs_1586_[0] = (f_1615_ * f_1603_ + f_1616_ * f_1604_ + f_1617_ * f_1605_) * f_1618_;
						fs_1586_[1] = (f_1615_ * f_1606_ + f_1616_ * f_1607_ + f_1617_ * f_1608_) * f_1618_;
						fs_1586_[2] = (f_1615_ * f_1609_ + f_1616_ * f_1610_ + f_1617_ * f_1611_) * f_1618_;
					} else {
						short i_1619_ = ((Class528_Sub2) this).aShortArray8587[i_1582_];
						short i_1620_ = ((Class528_Sub2) this).aShortArray8588[i_1582_];
						short i_1621_ = ((Class528_Sub2) this).aShortArray8642[i_1582_];
						int i_1622_ = class83.anIntArray808[i_1583_];
						int i_1623_ = class83.anIntArray805[i_1583_];
						int i_1624_ = class83.anIntArray807[i_1583_];
						float[] fs_1625_ = class83.aFloatArrayArray806[i_1583_];
						byte i_1626_ = class157.aByteArray1990[i_1583_];
						float f = ((float) class157.anIntArray1992[i_1583_] / 256.0F);
						if (i_1588_ == 1) {
							float f_1627_ = ((float) class157.anIntArray2001[i_1583_] / 1024.0F);
							method11306((((Class528_Sub2) this).anIntArray8580[i_1619_]), (((Class528_Sub2) this).anIntArray8581[i_1619_]), (((Class528_Sub2) this).anIntArray8610[i_1619_]), i_1622_, i_1623_, i_1624_, fs_1625_, f_1627_, i_1626_, f, fs);
							fs_1585_[0] = fs[0];
							fs_1586_[0] = fs[1];
							method11306((((Class528_Sub2) this).anIntArray8580[i_1620_]), (((Class528_Sub2) this).anIntArray8581[i_1620_]), (((Class528_Sub2) this).anIntArray8610[i_1620_]), i_1622_, i_1623_, i_1624_, fs_1625_, f_1627_, i_1626_, f, fs);
							fs_1585_[1] = fs[0];
							fs_1586_[1] = fs[1];
							method11306((((Class528_Sub2) this).anIntArray8580[i_1621_]), (((Class528_Sub2) this).anIntArray8581[i_1621_]), (((Class528_Sub2) this).anIntArray8610[i_1621_]), i_1622_, i_1623_, i_1624_, fs_1625_, f_1627_, i_1626_, f, fs);
							fs_1585_[2] = fs[0];
							fs_1586_[2] = fs[1];
							float f_1628_ = f_1627_ / 2.0F;
							if ((i_1626_ & 0x1) == 0) {
								if (fs_1585_[1] - fs_1585_[0] > f_1628_)
									fs_1585_[1] -= f_1627_;
								else if (fs_1585_[0] - fs_1585_[1] > f_1628_)
									fs_1585_[1] += f_1627_;
								if (fs_1585_[2] - fs_1585_[0] > f_1628_)
									fs_1585_[2] -= f_1627_;
								else if (fs_1585_[0] - fs_1585_[2] > f_1628_)
									fs_1585_[2] += f_1627_;
							} else {
								if (fs_1586_[1] - fs_1586_[0] > f_1628_)
									fs_1586_[1] -= f_1627_;
								else if (fs_1586_[0] - fs_1586_[1] > f_1628_)
									fs_1586_[1] += f_1627_;
								if (fs_1586_[2] - fs_1586_[0] > f_1628_)
									fs_1586_[2] -= f_1627_;
								else if (fs_1586_[0] - fs_1586_[2] > f_1628_)
									fs_1586_[2] += f_1627_;
							}
						} else if (i_1588_ == 2) {
							float f_1629_ = ((float) class157.anIntArray1997[i_1583_] / 256.0F);
							float f_1630_ = ((float) class157.anIntArray2004[i_1583_] / 256.0F);
							int i_1631_ = ((((Class528_Sub2) this).anIntArray8580[i_1620_]) - (((Class528_Sub2) this).anIntArray8580[i_1619_]));
							int i_1632_ = ((((Class528_Sub2) this).anIntArray8581[i_1620_]) - (((Class528_Sub2) this).anIntArray8581[i_1619_]));
							int i_1633_ = ((((Class528_Sub2) this).anIntArray8610[i_1620_]) - (((Class528_Sub2) this).anIntArray8610[i_1619_]));
							int i_1634_ = ((((Class528_Sub2) this).anIntArray8580[i_1621_]) - (((Class528_Sub2) this).anIntArray8580[i_1619_]));
							int i_1635_ = ((((Class528_Sub2) this).anIntArray8581[i_1621_]) - (((Class528_Sub2) this).anIntArray8581[i_1619_]));
							int i_1636_ = ((((Class528_Sub2) this).anIntArray8610[i_1621_]) - (((Class528_Sub2) this).anIntArray8610[i_1619_]));
							int i_1637_ = i_1632_ * i_1636_ - i_1635_ * i_1633_;
							int i_1638_ = i_1633_ * i_1634_ - i_1636_ * i_1631_;
							int i_1639_ = i_1631_ * i_1635_ - i_1634_ * i_1632_;
							float f_1640_ = (64.0F / (float) class157.anIntArray1989[i_1583_]);
							float f_1641_ = (64.0F / (float) class157.anIntArray2000[i_1583_]);
							float f_1642_ = (64.0F / (float) class157.anIntArray2001[i_1583_]);
							float f_1643_ = (((float) i_1637_ * fs_1625_[0] + (float) i_1638_ * fs_1625_[1] + (float) i_1639_ * fs_1625_[2]) / f_1640_);
							float f_1644_ = (((float) i_1637_ * fs_1625_[3] + (float) i_1638_ * fs_1625_[4] + (float) i_1639_ * fs_1625_[5]) / f_1641_);
							float f_1645_ = (((float) i_1637_ * fs_1625_[6] + (float) i_1638_ * fs_1625_[7] + (float) i_1639_ * fs_1625_[8]) / f_1642_);
							int i_1646_ = method11254(f_1643_, f_1644_, f_1645_);
							method11255((((Class528_Sub2) this).anIntArray8580[i_1619_]), (((Class528_Sub2) this).anIntArray8581[i_1619_]), (((Class528_Sub2) this).anIntArray8610[i_1619_]), i_1622_, i_1623_, i_1624_, i_1646_, fs_1625_, i_1626_, f, f_1629_, f_1630_, fs);
							fs_1585_[0] = fs[0];
							fs_1586_[0] = fs[1];
							method11255((((Class528_Sub2) this).anIntArray8580[i_1620_]), (((Class528_Sub2) this).anIntArray8581[i_1620_]), (((Class528_Sub2) this).anIntArray8610[i_1620_]), i_1622_, i_1623_, i_1624_, i_1646_, fs_1625_, i_1626_, f, f_1629_, f_1630_, fs);
							fs_1585_[1] = fs[0];
							fs_1586_[1] = fs[1];
							method11255((((Class528_Sub2) this).anIntArray8580[i_1621_]), (((Class528_Sub2) this).anIntArray8581[i_1621_]), (((Class528_Sub2) this).anIntArray8610[i_1621_]), i_1622_, i_1623_, i_1624_, i_1646_, fs_1625_, i_1626_, f, f_1629_, f_1630_, fs);
							fs_1585_[2] = fs[0];
							fs_1586_[2] = fs[1];
						} else if (i_1588_ == 3) {
							method11271((((Class528_Sub2) this).anIntArray8580[i_1619_]), (((Class528_Sub2) this).anIntArray8581[i_1619_]), (((Class528_Sub2) this).anIntArray8610[i_1619_]), i_1622_, i_1623_, i_1624_, fs_1625_, i_1626_, f, fs);
							fs_1585_[0] = fs[0];
							fs_1586_[0] = fs[1];
							method11271((((Class528_Sub2) this).anIntArray8580[i_1620_]), (((Class528_Sub2) this).anIntArray8581[i_1620_]), (((Class528_Sub2) this).anIntArray8610[i_1620_]), i_1622_, i_1623_, i_1624_, fs_1625_, i_1626_, f, fs);
							fs_1585_[1] = fs[0];
							fs_1586_[1] = fs[1];
							method11271((((Class528_Sub2) this).anIntArray8580[i_1621_]), (((Class528_Sub2) this).anIntArray8581[i_1621_]), (((Class528_Sub2) this).anIntArray8610[i_1621_]), i_1622_, i_1623_, i_1624_, fs_1625_, i_1626_, f, fs);
							fs_1585_[2] = fs[0];
							fs_1586_[2] = fs[1];
							if ((i_1626_ & 0x1) == 0) {
								if (fs_1585_[1] - fs_1585_[0] > 0.5F)
									fs_1585_[1]--;
								else if (fs_1585_[0] - fs_1585_[1] > 0.5F)
									fs_1585_[1]++;
								if (fs_1585_[2] - fs_1585_[0] > 0.5F)
									fs_1585_[2]--;
								else if (fs_1585_[0] - fs_1585_[2] > 0.5F)
									fs_1585_[2]++;
							} else {
								if (fs_1586_[1] - fs_1586_[0] > 0.5F)
									fs_1586_[1]--;
								else if (fs_1586_[0] - fs_1586_[1] > 0.5F)
									fs_1586_[1]++;
								if (fs_1586_[2] - fs_1586_[0] > 0.5F)
									fs_1586_[2]--;
								else if (fs_1586_[0] - fs_1586_[2] > 0.5F)
									fs_1586_[2]++;
							}
						}
					}
				}
			}
		}
		if (!bool_1580_) {
			((Class528_Sub2) this).aFloatArrayArray8591 = null;
			((Class528_Sub2) this).aFloatArrayArray8635 = null;
		}
		if (class157.anIntArray2002 != null && (((Class528_Sub2) this).anInt8575 & 0x20) != 0)
			((Class528_Sub2) this).anIntArrayArray8568 = class157.method2665(true);
		if (class157.anIntArray1991 != null && (((Class528_Sub2) this).anInt8575 & 0x180) != 0)
			((Class528_Sub2) this).anIntArrayArray8608 = class157.method2666();
		if (class157.aClass84Array2009 != null && (((Class528_Sub2) this).anInt8575 & 0x400) != 0)
			((Class528_Sub2) this).anIntArrayArray8620 = class157.method2667();
		if (class157.aShortArray1993 != null) {
			((Class528_Sub2) this).aShortArray8603 = new short[((Class528_Sub2) this).anInt8586];
			boolean bool_1647_ = false;
			for (int i_1648_ = 0; i_1648_ < ((Class528_Sub2) this).anInt8586; i_1648_++) {
				short i_1649_ = class157.aShortArray1993[i_1648_];
				if (i_1649_ != -1) {
					Class169 class169 = ((Class528_Sub2) this).aClass505_Sub3_8638.anInterface22_5834.method144(i_1649_, -1981607530);
					if ((i_1565_ & 0x40) == 0 || !class169.aBool2056) {
						((Class528_Sub2) this).aShortArray8603[i_1648_] = i_1649_;
						bool_1647_ = true;
						if (class169.anInt2074 * 1960017665 == 2)
							((Class528_Sub2) this).aBool8630 = true;
						if (class169.aByte2081 != 0 || class169.aByte2090 != 0)
							((Class528_Sub2) this).aBool8640 = true;
					} else
						((Class528_Sub2) this).aShortArray8603[i_1648_] = (short) -1;
				} else
					((Class528_Sub2) this).aShortArray8603[i_1648_] = (short) -1;
			}
			if (!bool_1647_)
				((Class528_Sub2) this).aShortArray8603 = null;
		} else
			((Class528_Sub2) this).aShortArray8603 = null;
		if (((Class528_Sub2) this).aBool8630 || ((Class528_Sub2) this).aClass193Array8618 != null) {
			((Class528_Sub2) this).aShortArray8623 = new short[((Class528_Sub2) this).anInt8586];
			for (int i_1650_ = 0; i_1650_ < ((Class528_Sub2) this).anInt8586; i_1650_++)
				((Class528_Sub2) this).aShortArray8623[i_1650_] = (short) is[i_1650_];
		}
	}

	public boolean method11286(int i, int i_1651_, Class294 class294, boolean bool, int i_1652_) {
		method13795(((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Class384 class384 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2317);
		class384.method6522(class294);
		Class384 class384_1653_ = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2318);
		class384_1653_.method6562(class384);
		class384_1653_.method6523(((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8996);
		boolean bool_1654_ = false;
		int i_1655_ = 2147483647;
		int i_1656_ = -2147483648;
		int i_1657_ = 2147483647;
		int i_1658_ = -2147483648;
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		int i_1659_ = ((((Class528_Sub2) this).aShort8627 - ((Class528_Sub2) this).aShort8634) >> 1);
		int i_1660_ = ((((Class528_Sub2) this).aShort8625 - ((Class528_Sub2) this).aShort8570) >> 1);
		int i_1661_ = ((((Class528_Sub2) this).aShort8629 - ((Class528_Sub2) this).aShort8571) >> 1);
		int i_1662_ = ((Class528_Sub2) this).aShort8634 + i_1659_;
		int i_1663_ = ((Class528_Sub2) this).aShort8570 + i_1660_;
		int i_1664_ = ((Class528_Sub2) this).aShort8571 + i_1661_;
		int i_1665_ = i_1662_ - (i_1659_ << i_1652_);
		int i_1666_ = i_1663_ - (i_1660_ << i_1652_);
		int i_1667_ = i_1664_ - (i_1661_ << i_1652_);
		int i_1668_ = i_1662_ + (i_1659_ << i_1652_);
		int i_1669_ = i_1663_ + (i_1660_ << i_1652_);
		int i_1670_ = i_1664_ + (i_1661_ << i_1652_);
		((Class528_Sub2) this).anIntArray8583[0] = i_1665_;
		((Class528_Sub2) this).anIntArray8639[0] = i_1666_;
		((Class528_Sub2) this).anIntArray8628[0] = i_1667_;
		((Class528_Sub2) this).anIntArray8583[1] = i_1668_;
		((Class528_Sub2) this).anIntArray8639[1] = i_1666_;
		((Class528_Sub2) this).anIntArray8628[1] = i_1667_;
		((Class528_Sub2) this).anIntArray8583[2] = i_1665_;
		((Class528_Sub2) this).anIntArray8639[2] = i_1669_;
		((Class528_Sub2) this).anIntArray8628[2] = i_1667_;
		((Class528_Sub2) this).anIntArray8583[3] = i_1668_;
		((Class528_Sub2) this).anIntArray8639[3] = i_1669_;
		((Class528_Sub2) this).anIntArray8628[3] = i_1667_;
		((Class528_Sub2) this).anIntArray8583[4] = i_1665_;
		((Class528_Sub2) this).anIntArray8639[4] = i_1666_;
		((Class528_Sub2) this).anIntArray8628[4] = i_1670_;
		((Class528_Sub2) this).anIntArray8583[5] = i_1668_;
		((Class528_Sub2) this).anIntArray8639[5] = i_1666_;
		((Class528_Sub2) this).anIntArray8628[5] = i_1670_;
		((Class528_Sub2) this).anIntArray8583[6] = i_1665_;
		((Class528_Sub2) this).anIntArray8639[6] = i_1669_;
		((Class528_Sub2) this).anIntArray8628[6] = i_1670_;
		((Class528_Sub2) this).anIntArray8583[7] = i_1668_;
		((Class528_Sub2) this).anIntArray8639[7] = i_1669_;
		((Class528_Sub2) this).anIntArray8628[7] = i_1670_;
		for (int i_1671_ = 0; i_1671_ < 8; i_1671_++) {
			int i_1672_ = ((Class528_Sub2) this).anIntArray8583[i_1671_];
			int i_1673_ = ((Class528_Sub2) this).anIntArray8639[i_1671_];
			int i_1674_ = ((Class528_Sub2) this).anIntArray8628[i_1671_];
			float f = (class384_1653_.aFloatArray4667[2] * (float) i_1672_ + class384_1653_.aFloatArray4667[6] * (float) i_1673_ + class384_1653_.aFloatArray4667[10] * (float) i_1674_ + class384_1653_.aFloatArray4667[14]);
			float f_1675_ = (class384_1653_.aFloatArray4667[3] * (float) i_1672_ + class384_1653_.aFloatArray4667[7] * (float) i_1673_ + class384_1653_.aFloatArray4667[11] * (float) i_1674_ + class384_1653_.aFloatArray4667[15]);
			if (f >= -f_1675_) {
				float f_1676_ = (class384_1653_.aFloatArray4667[0] * (float) i_1672_ + class384_1653_.aFloatArray4667[4] * (float) i_1673_ + class384_1653_.aFloatArray4667[8] * (float) i_1674_ + class384_1653_.aFloatArray4667[12]);
				float f_1677_ = (class384_1653_.aFloatArray4667[1] * (float) i_1672_ + class384_1653_.aFloatArray4667[5] * (float) i_1673_ + class384_1653_.aFloatArray4667[9] * (float) i_1674_ + class384_1653_.aFloatArray4667[13]);
				int i_1678_ = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8976) * f_1676_ / f_1675_);
				int i_1679_ = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9004) * f_1677_ / f_1675_);
				if (i_1678_ < i_1655_)
					i_1655_ = i_1678_;
				if (i_1678_ > i_1656_)
					i_1656_ = i_1678_;
				if (i_1679_ < i_1657_)
					i_1657_ = i_1679_;
				if (i_1679_ > i_1658_)
					i_1658_ = i_1679_;
				bool_1654_ = true;
			}
		}
		if (bool_1654_ && i > i_1655_ && i < i_1656_ && i_1651_ > i_1657_ && i_1651_ < i_1658_) {
			if (bool)
				return true;
			for (int i_1680_ = 0; i_1680_ < ((Class528_Sub2) this).anInt8578; i_1680_++) {
				int i_1681_ = ((Class528_Sub2) this).anIntArray8580[i_1680_];
				int i_1682_ = ((Class528_Sub2) this).anIntArray8581[i_1680_];
				int i_1683_ = ((Class528_Sub2) this).anIntArray8610[i_1680_];
				float f = (class384_1653_.aFloatArray4667[2] * (float) i_1681_ + class384_1653_.aFloatArray4667[6] * (float) i_1682_ + class384_1653_.aFloatArray4667[10] * (float) i_1683_ + class384_1653_.aFloatArray4667[14]);
				float f_1684_ = (class384_1653_.aFloatArray4667[3] * (float) i_1681_ + class384_1653_.aFloatArray4667[7] * (float) i_1682_ + class384_1653_.aFloatArray4667[11] * (float) i_1683_ + class384_1653_.aFloatArray4667[15]);
				if (f >= -f_1684_) {
					float f_1685_ = (class384_1653_.aFloatArray4667[0] * (float) i_1681_ + (class384_1653_.aFloatArray4667[4] * (float) i_1682_) + (class384_1653_.aFloatArray4667[8] * (float) i_1683_) + class384_1653_.aFloatArray4667[12]);
					float f_1686_ = (class384_1653_.aFloatArray4667[1] * (float) i_1681_ + (class384_1653_.aFloatArray4667[5] * (float) i_1682_) + (class384_1653_.aFloatArray4667[9] * (float) i_1683_) + class384_1653_.aFloatArray4667[13]);
					((Class528_Sub2) this).aFloatArray8590[i_1680_] = (float) (int) (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_1685_ / f_1684_));
					((Class528_Sub2) this).aFloatArray8605[i_1680_] = (float) (int) (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8982 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004 * f_1686_ / f_1684_));
				} else
					((Class528_Sub2) this).aFloatArray8590[i_1680_] = -999999.0F;
			}
			for (int i_1687_ = 0; i_1687_ < ((Class528_Sub2) this).anInt8586; i_1687_++) {
				if (((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8587[i_1687_]]) != -999999.0F) && ((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8588[i_1687_]]) != -999999.0F) && ((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8642[i_1687_]]) != -999999.0F) && (method13819(i, i_1651_, (((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8587[i_1687_]]),
						(((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8588[i_1687_]]), (((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8642[i_1687_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8587[i_1687_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8588[i_1687_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8642[i_1687_]]))))
					return true;
			}
		}
		return false;
	}

	public boolean method11309(int i, int i_1688_, Class294 class294, boolean bool, int i_1689_) {
		method13795(((Class528_Sub2) this).aClass505_Sub3_8638.method14370(Thread.currentThread()));
		Class384 class384 = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2317);
		class384.method6522(class294);
		Class384 class384_1690_ = (((Class185) ((Class528_Sub2) this).aClass185_8564).aClass384_2318);
		class384_1690_.method6562(class384);
		class384_1690_.method6523(((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aClass384_8996);
		boolean bool_1691_ = false;
		int i_1692_ = 2147483647;
		int i_1693_ = -2147483648;
		int i_1694_ = 2147483647;
		int i_1695_ = -2147483648;
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		int i_1696_ = ((((Class528_Sub2) this).aShort8627 - ((Class528_Sub2) this).aShort8634) >> 1);
		int i_1697_ = ((((Class528_Sub2) this).aShort8625 - ((Class528_Sub2) this).aShort8570) >> 1);
		int i_1698_ = ((((Class528_Sub2) this).aShort8629 - ((Class528_Sub2) this).aShort8571) >> 1);
		int i_1699_ = ((Class528_Sub2) this).aShort8634 + i_1696_;
		int i_1700_ = ((Class528_Sub2) this).aShort8570 + i_1697_;
		int i_1701_ = ((Class528_Sub2) this).aShort8571 + i_1698_;
		int i_1702_ = i_1699_ - (i_1696_ << i_1689_);
		int i_1703_ = i_1700_ - (i_1697_ << i_1689_);
		int i_1704_ = i_1701_ - (i_1698_ << i_1689_);
		int i_1705_ = i_1699_ + (i_1696_ << i_1689_);
		int i_1706_ = i_1700_ + (i_1697_ << i_1689_);
		int i_1707_ = i_1701_ + (i_1698_ << i_1689_);
		((Class528_Sub2) this).anIntArray8583[0] = i_1702_;
		((Class528_Sub2) this).anIntArray8639[0] = i_1703_;
		((Class528_Sub2) this).anIntArray8628[0] = i_1704_;
		((Class528_Sub2) this).anIntArray8583[1] = i_1705_;
		((Class528_Sub2) this).anIntArray8639[1] = i_1703_;
		((Class528_Sub2) this).anIntArray8628[1] = i_1704_;
		((Class528_Sub2) this).anIntArray8583[2] = i_1702_;
		((Class528_Sub2) this).anIntArray8639[2] = i_1706_;
		((Class528_Sub2) this).anIntArray8628[2] = i_1704_;
		((Class528_Sub2) this).anIntArray8583[3] = i_1705_;
		((Class528_Sub2) this).anIntArray8639[3] = i_1706_;
		((Class528_Sub2) this).anIntArray8628[3] = i_1704_;
		((Class528_Sub2) this).anIntArray8583[4] = i_1702_;
		((Class528_Sub2) this).anIntArray8639[4] = i_1703_;
		((Class528_Sub2) this).anIntArray8628[4] = i_1707_;
		((Class528_Sub2) this).anIntArray8583[5] = i_1705_;
		((Class528_Sub2) this).anIntArray8639[5] = i_1703_;
		((Class528_Sub2) this).anIntArray8628[5] = i_1707_;
		((Class528_Sub2) this).anIntArray8583[6] = i_1702_;
		((Class528_Sub2) this).anIntArray8639[6] = i_1706_;
		((Class528_Sub2) this).anIntArray8628[6] = i_1707_;
		((Class528_Sub2) this).anIntArray8583[7] = i_1705_;
		((Class528_Sub2) this).anIntArray8639[7] = i_1706_;
		((Class528_Sub2) this).anIntArray8628[7] = i_1707_;
		for (int i_1708_ = 0; i_1708_ < 8; i_1708_++) {
			int i_1709_ = ((Class528_Sub2) this).anIntArray8583[i_1708_];
			int i_1710_ = ((Class528_Sub2) this).anIntArray8639[i_1708_];
			int i_1711_ = ((Class528_Sub2) this).anIntArray8628[i_1708_];
			float f = (class384_1690_.aFloatArray4667[2] * (float) i_1709_ + class384_1690_.aFloatArray4667[6] * (float) i_1710_ + class384_1690_.aFloatArray4667[10] * (float) i_1711_ + class384_1690_.aFloatArray4667[14]);
			float f_1712_ = (class384_1690_.aFloatArray4667[3] * (float) i_1709_ + class384_1690_.aFloatArray4667[7] * (float) i_1710_ + class384_1690_.aFloatArray4667[11] * (float) i_1711_ + class384_1690_.aFloatArray4667[15]);
			if (f >= -f_1712_) {
				float f_1713_ = (class384_1690_.aFloatArray4667[0] * (float) i_1709_ + class384_1690_.aFloatArray4667[4] * (float) i_1710_ + class384_1690_.aFloatArray4667[8] * (float) i_1711_ + class384_1690_.aFloatArray4667[12]);
				float f_1714_ = (class384_1690_.aFloatArray4667[1] * (float) i_1709_ + class384_1690_.aFloatArray4667[5] * (float) i_1710_ + class384_1690_.aFloatArray4667[9] * (float) i_1711_ + class384_1690_.aFloatArray4667[13]);
				int i_1715_ = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9003) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8976) * f_1713_ / f_1712_);
				int i_1716_ = (int) ((((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat8982) + (((Class505_Sub3) ((Class528_Sub2) this).aClass505_Sub3_8638).aFloat9004) * f_1714_ / f_1712_);
				if (i_1715_ < i_1692_)
					i_1692_ = i_1715_;
				if (i_1715_ > i_1693_)
					i_1693_ = i_1715_;
				if (i_1716_ < i_1694_)
					i_1694_ = i_1716_;
				if (i_1716_ > i_1695_)
					i_1695_ = i_1716_;
				bool_1691_ = true;
			}
		}
		if (bool_1691_ && i > i_1692_ && i < i_1693_ && i_1688_ > i_1694_ && i_1688_ < i_1695_) {
			if (bool)
				return true;
			for (int i_1717_ = 0; i_1717_ < ((Class528_Sub2) this).anInt8578; i_1717_++) {
				int i_1718_ = ((Class528_Sub2) this).anIntArray8580[i_1717_];
				int i_1719_ = ((Class528_Sub2) this).anIntArray8581[i_1717_];
				int i_1720_ = ((Class528_Sub2) this).anIntArray8610[i_1717_];
				float f = (class384_1690_.aFloatArray4667[2] * (float) i_1718_ + class384_1690_.aFloatArray4667[6] * (float) i_1719_ + class384_1690_.aFloatArray4667[10] * (float) i_1720_ + class384_1690_.aFloatArray4667[14]);
				float f_1721_ = (class384_1690_.aFloatArray4667[3] * (float) i_1718_ + class384_1690_.aFloatArray4667[7] * (float) i_1719_ + class384_1690_.aFloatArray4667[11] * (float) i_1720_ + class384_1690_.aFloatArray4667[15]);
				if (f >= -f_1721_) {
					float f_1722_ = (class384_1690_.aFloatArray4667[0] * (float) i_1718_ + (class384_1690_.aFloatArray4667[4] * (float) i_1719_) + (class384_1690_.aFloatArray4667[8] * (float) i_1720_) + class384_1690_.aFloatArray4667[12]);
					float f_1723_ = (class384_1690_.aFloatArray4667[1] * (float) i_1718_ + (class384_1690_.aFloatArray4667[5] * (float) i_1719_) + (class384_1690_.aFloatArray4667[9] * (float) i_1720_) + class384_1690_.aFloatArray4667[13]);
					((Class528_Sub2) this).aFloatArray8590[i_1717_] = (float) (int) (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9003 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8976 * f_1722_ / f_1721_));
					((Class528_Sub2) this).aFloatArray8605[i_1717_] = (float) (int) (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat8982 + (((Class505_Sub3) (((Class528_Sub2) this).aClass505_Sub3_8638)).aFloat9004 * f_1723_ / f_1721_));
				} else
					((Class528_Sub2) this).aFloatArray8590[i_1717_] = -999999.0F;
			}
			for (int i_1724_ = 0; i_1724_ < ((Class528_Sub2) this).anInt8586; i_1724_++) {
				if (((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8587[i_1724_]]) != -999999.0F) && ((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8588[i_1724_]]) != -999999.0F) && ((((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8642[i_1724_]]) != -999999.0F) && (method13819(i, i_1688_, (((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8587[i_1724_]]),
						(((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8588[i_1724_]]), (((Class528_Sub2) this).aFloatArray8605[((Class528_Sub2) this).aShortArray8642[i_1724_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8587[i_1724_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8588[i_1724_]]), (((Class528_Sub2) this).aFloatArray8590[((Class528_Sub2) this).aShortArray8642[i_1724_]]))))
					return true;
			}
		}
		return false;
	}

	public int cc() {
		if (!((Class528_Sub2) this).aBool8621)
			method13876();
		return ((Class528_Sub2) this).aShort8634;
	}

	public Class282_Sub50_Sub17 dw(Class282_Sub50_Sub17 class282_sub50_sub17) {
		return null;
	}

	public void dk(int i, int i_1725_, int i_1726_) {
		if (i != 0 && (((Class528_Sub2) this).anInt8575 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1725_ != 0 && (((Class528_Sub2) this).anInt8575 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1726_ != 0 && (((Class528_Sub2) this).anInt8575 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1727_ = 0; i_1727_ < ((Class528_Sub2) this).anInt8578; i_1727_++) {
				((Class528_Sub2) this).anIntArray8580[i_1727_] += i;
				((Class528_Sub2) this).anIntArray8581[i_1727_] += i_1725_;
				((Class528_Sub2) this).anIntArray8610[i_1727_] += i_1726_;
			}
		}
	}

	public int dq() {
		return ((Class528_Sub2) this).anInt8606;
	}

	public void ep(int i, int i_1728_, int i_1729_) {
		if (i != 128 && (((Class528_Sub2) this).anInt8575 & 0x1) != 1)
			throw new IllegalStateException();
		if (i_1728_ != 128 && (((Class528_Sub2) this).anInt8575 & 0x2) != 2)
			throw new IllegalStateException();
		if (i_1729_ != 128 && (((Class528_Sub2) this).anInt8575 & 0x4) != 4)
			throw new IllegalStateException();
		synchronized (this) {
			for (int i_1730_ = 0; i_1730_ < ((Class528_Sub2) this).anInt8578; i_1730_++) {
				((Class528_Sub2) this).anIntArray8580[i_1730_] = ((Class528_Sub2) this).anIntArray8580[i_1730_] * i >> 7;
				((Class528_Sub2) this).anIntArray8581[i_1730_] = (((Class528_Sub2) this).anIntArray8581[i_1730_] * i_1728_ >> 7);
				((Class528_Sub2) this).anIntArray8610[i_1730_] = (((Class528_Sub2) this).anIntArray8610[i_1730_] * i_1729_ >> 7);
			}
			((Class528_Sub2) this).aBool8621 = false;
		}
	}
}
