/* Class433 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class433 {
	Model[] aClass64Array5443;
	Class429 aClass429_5444;
	boolean aBoolean5445;
	Class243 aClass243_5446;
	Class243 aClass243_5447;
	public static int anInt5448 = 256;
	Class348 aClass348_5449 = new Class348(256);
	Class348 aClass348_5450 = new Class348(500);
	Class348 aClass348_5451;
	Class348 aClass348_5452 = new Class348(30);
	int anInt5453;
	String[] aStringArray5454;
	Class411 aClass411_5455;
	Class454 aClass454_5456;

	public void method5790(boolean bool, int i) {
		try {
			if (((Class433) this).aBoolean5445 != bool) {
				((Class433) this).aBoolean5445 = bool;
				method5793(1159892995);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.f(").append(')').toString());
		}
	}

	public void method5791(int i, int i_0_) {
		try {
			((Class433) this).anInt5453 = -570701637 * i;
			synchronized (((Class433) this).aClass348_5450) {
				((Class433) this).aClass348_5450.method4187();
			}
			synchronized (((Class433) this).aClass348_5452) {
				((Class433) this).aClass348_5452.method4187();
			}
			synchronized (((Class433) this).aClass348_5451) {
				((Class433) this).aClass348_5451.method4187();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.b(").append(')').toString());
		}
	}

	public void method5792(int i, byte i_1_) {
		try {
			((Class433) this).aClass348_5449 = new Class348(i);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.p(").append(')').toString());
		}
	}

	public void method5793(int i) {
		try {
			synchronized (((Class433) this).aClass348_5449) {
				((Class433) this).aClass348_5449.method4187();
			}
			synchronized (((Class433) this).aClass348_5450) {
				((Class433) this).aClass348_5450.method4187();
			}
			synchronized (((Class433) this).aClass348_5452) {
				((Class433) this).aClass348_5452.method4187();
			}
			synchronized (((Class433) this).aClass348_5451) {
				((Class433) this).aClass348_5451.method4187();
			}
			((Class433) this).aClass64Array5443 = new Model[4];
			((Class433) this).aClass454_5456 = new Class454(null, null);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.i(").append(')').toString());
		}
	}

	public void method5794(int i, byte i_2_) {
		try {
			synchronized (((Class433) this).aClass348_5449) {
				((Class433) this).aClass348_5449.method4186(i, -798729587);
			}
			synchronized (((Class433) this).aClass348_5450) {
				((Class433) this).aClass348_5450.method4186(i, -1754602717);
			}
			synchronized (((Class433) this).aClass348_5452) {
				((Class433) this).aClass348_5452.method4186(i, 466618917);
			}
			synchronized (((Class433) this).aClass348_5451) {
				((Class433) this).aClass348_5451.method4186(i, -855180536);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.k(").append(')').toString());
		}
	}

	public void method5795(int i) {
		try {
			synchronized (((Class433) this).aClass348_5449) {
				((Class433) this).aClass348_5449.method4189();
			}
			synchronized (((Class433) this).aClass348_5450) {
				((Class433) this).aClass348_5450.method4189();
			}
			synchronized (((Class433) this).aClass348_5452) {
				((Class433) this).aClass348_5452.method4189();
			}
			synchronized (((Class433) this).aClass348_5451) {
				((Class433) this).aClass348_5451.method4189();
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.d(").append(')').toString());
		}
	}

	public Class433(Class411 class411, Class429 class429, boolean bool, Class243 class243, Class243 class243_3_) {
		((Class433) this).aClass348_5451 = new Class348(50);
		((Class433) this).aClass64Array5443 = new Model[4];
		((Class433) this).aClass454_5456 = new Class454(null, null);
		((Class433) this).aClass411_5455 = class411;
		((Class433) this).aClass429_5444 = class429;
		((Class433) this).aBoolean5445 = bool;
		((Class433) this).aClass243_5446 = class243;
		((Class433) this).aClass243_5447 = class243_3_;
		if (null != ((Class433) this).aClass243_5446) {
			int i = ((Class433) this).aClass243_5446.method2296(1680210708) - 1;
			Class120.aClass120_1443.method1306((short) 23751);
			((Class433) this).aClass243_5446.method2316(i, -1017296855);
		}
		if (((Class433) this).aClass411_5455 == Class411.aClass411_5320)
			((Class433) this).aStringArray5454 = (new String[] { null, null, null, null, null, Tradution.aClass470_5905.method6049((((Class433) this).aClass429_5444), -875414210) });
		else
			((Class433) this).aStringArray5454 = new String[] { null, null, null, null, null, null };
	}

	public ObjectDefinitions getObjectDefinitions(int objectId) {
		try {
			ObjectDefinitions class432;
			synchronized (((Class433) this).aClass348_5449) {
				class432 = (ObjectDefinitions) ((Class433) this).aClass348_5449.method4184((long) objectId);
			}
			if (class432 != null)
				return class432;
			byte[] is;
			synchronized (((Class433) this).aClass243_5446) {
				is = (((Class433) this).aClass243_5446.getFile(Class120.aClass120_1443.getArchiveId(objectId, -1875026798), Class120.aClass120_1443.getFileId(objectId, -1955117131), (byte) -69));
			}
			class432 = new ObjectDefinitions();
			class432.anInt5365 = objectId * -950871973;
			((ObjectDefinitions) class432).aClass433_5403 = this;
			class432.aStringArray5394 = (String[]) ((Class433) this).aStringArray5454.clone();
			if (null != is)
				class432.method5783(new RsByteBuffer(is), -1780393822);
			class432.method5778(-231037911);
			if (class432.aBoolean5416) {
				class432.anInt5380 = 0;
				class432.aBoolean5424 = false;
			}
			if (!((Class433) this).aBoolean5445 && class432.aBoolean5434) {
				class432.aStringArray5394 = null;
				class432.anIntArray5370 = null;
			}
			synchronized (((Class433) this).aClass348_5449) {
				((Class433) this).aClass348_5449.method4194(class432, (long) objectId);
			}
			return class432;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.a(").append(')').toString());
		}
	}

	static final void method5797(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		try {
			int i_9_ = 0;
			int i_10_ = i_6_;
			int i_11_ = -i_6_;
			int i_12_ = -1;
			Class82_Sub22.method940(Class372_Sub1.anIntArrayArray4047[i_5_], i - i_6_, i + i_6_, i_7_, 198591816);
			while (i_10_ > i_9_) {
				i_12_ += 2;
				i_11_ += i_12_;
				i_9_++;
				if (i_11_ >= 0) {
					i_10_--;
					i_11_ -= i_10_ << 1;
					int[] is = Class372_Sub1.anIntArrayArray4047[i_10_ + i_5_];
					int[] is_13_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_10_];
					int i_14_ = i_9_ + i;
					int i_15_ = i - i_9_;
					Class82_Sub22.method940(is, i_15_, i_14_, i_7_, 1681024850);
					Class82_Sub22.method940(is_13_, i_15_, i_14_, i_7_, -1116732446);
				}
				int i_16_ = i_10_ + i;
				int i_17_ = i - i_10_;
				int[] is = Class372_Sub1.anIntArrayArray4047[i_5_ + i_9_];
				int[] is_18_ = Class372_Sub1.anIntArrayArray4047[i_5_ - i_9_];
				Class82_Sub22.method940(is, i_17_, i_16_, i_7_, -143852292);
				Class82_Sub22.method940(is_18_, i_17_, i_16_, i_7_, 358013733);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.s(").append(')').toString());
		}
	}

	static final void method5798(ClientScript2 class403, short i) {
		try {
			int i_19_ = (((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]);
			IComponentDefinition class105 = Class50.getIComponentDefinitions(i_19_, (byte) -1);
			Class119 class119 = Class389.aClass119Array4165[i_19_ >> 16];
			Class298_Sub45.method3533(class105, class119, class403, (byte) -45);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.dc(").append(')').toString());
		}
	}

	static Class100[] method5799(int i) {
		try {
			return (new Class100[] { Class100.aClass100_975, Class100.aClass100_954, Class100.aClass100_1076, Class100.aClass100_956, Class100.aClass100_957, Class100.aClass100_958, Class100.aClass100_959, Class100.aClass100_1033, Class100.aClass100_961, Class100.aClass100_1042, Class100.aClass100_1028, Class100.aClass100_964, Class100.aClass100_1069, Class100.aClass100_966, Class100.aClass100_984, Class100.aClass100_968, Class100.aClass100_969, Class100.aClass100_970, Class100.aClass100_971,
					Class100.aClass100_994, Class100.aClass100_1058, Class100.aClass100_967, Class100.aClass100_1073, Class100.aClass100_976, Class100.aClass100_977, Class100.aClass100_1049, Class100.aClass100_995, Class100.aClass100_1001, Class100.aClass100_973, Class100.aClass100_960, Class100.aClass100_983, Class100.aClass100_1031, Class100.aClass100_985, Class100.aClass100_986, Class100.aClass100_987, Class100.aClass100_988, Class100.aClass100_989, Class100.aClass100_990,
					Class100.aClass100_991, Class100.aClass100_992, Class100.aClass100_1051, Class100.aClass100_963, Class100.aClass100_1078, Class100.aClass100_996, Class100.aClass100_997, Class100.aClass100_998, Class100.aClass100_999, Class100.aClass100_1000, Class100.aClass100_965, Class100.aClass100_1002, Class100.aClass100_1003, Class100.aClass100_1004, Class100.aClass100_1005, Class100.aClass100_1050, Class100.aClass100_1007, Class100.aClass100_1008, Class100.aClass100_1009,
					Class100.aClass100_1010, Class100.aClass100_1040, Class100.aClass100_1012, Class100.aClass100_1013, Class100.aClass100_1014, Class100.aClass100_1015, Class100.aClass100_981, Class100.aClass100_1018, Class100.aClass100_1025, Class100.aClass100_1019, Class100.aClass100_1020, Class100.aClass100_1021, Class100.aClass100_1022, Class100.aClass100_1023, Class100.aClass100_1024, Class100.aClass100_1041, Class100.aClass100_1026, Class100.aClass100_1027, Class100.aClass100_978,
					Class100.aClass100_1029, Class100.aClass100_953, Class100.aClass100_1075, Class100.aClass100_1032, Class100.aClass100_980, Class100.aClass100_1034, Class100.aClass100_1039, Class100.aClass100_1036, Class100.aClass100_1037, Class100.aClass100_1030, Class100.aClass100_1064, Class100.aClass100_1035, Class100.aClass100_1061, Class100.aClass100_1006, Class100.aClass100_1043, Class100.aClass100_1044, Class100.aClass100_1038, Class100.aClass100_1046, Class100.aClass100_955,
					Class100.aClass100_1048, Class100.aClass100_1077, Class100.aClass100_974, Class100.aClass100_962, Class100.aClass100_1052, Class100.aClass100_993, Class100.aClass100_1054, Class100.aClass100_1016, Class100.aClass100_1056, Class100.aClass100_1057, Class100.aClass100_972, Class100.aClass100_1059, Class100.aClass100_1060, Class100.aClass100_1047, Class100.aClass100_1062, Class100.aClass100_1063, Class100.aClass100_1045, Class100.aClass100_1065, Class100.aClass100_1066,
					Class100.aClass100_1067, Class100.aClass100_1068, Class100.aClass100_1055, Class100.aClass100_1070, Class100.aClass100_1071, Class100.aClass100_982, Class100.aClass100_1053, Class100.aClass100_1074, Class100.aClass100_979, Class100.aClass100_1017, Class100.aClass100_1011 });
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("rx.a(").append(')').toString());
		}
	}
}
