/* Class427 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class427 {
	SoftCache aClass229_5117 = new SoftCache(64);
	Index aClass317_5118;
	public static final int anInt5119 = 64;
	Index aClass317_5120;
	public static final int anInt5121 = 64;
	SoftCache aClass229_5122 = new SoftCache(64);
	public static int anInt5123;

	public Class418 method7172(int i, int i_0_) {
		Class418 class418;
		synchronized (((Class427) this).aClass229_5117) {
			class418 = ((Class418) ((Class427) this).aClass229_5117.method3865((long) i));
		}
		if (class418 != null)
			return class418;
		byte[] is;
		synchronized (((Class427) this).aClass317_5120) {
			is = ((Class427) this).aClass317_5120.getFile(((SharedConfigsType.aClass120_1497.anInt1521) * -71319279), i, -1171405866);
		}
		class418 = new Class418();
		((Class418) class418).aClass427_4998 = this;
		if (is != null)
			class418.method7008(new RsByteBuffer(is), 1761998604);
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.put(class418, (long) i);
		}
		return class418;
	}

	public void method7173(int i, int i_1_) {
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.method3858(i, (byte) 14);
		}
		synchronized (((Class427) this).aClass229_5122) {
			((Class427) this).aClass229_5122.method3858(i, (byte) 47);
		}
	}

	public Class427(Game class486, Language class495, Index class317, Index class317_2_) {
		((Class427) this).aClass317_5120 = class317;
		((Class427) this).aClass317_5118 = class317_2_;
		((Class427) this).aClass317_5120.filesCount((SharedConfigsType.aClass120_1497.anInt1521) * -71319279, 1541409828);
		Math.random();
		Math.random();
		Math.random();
		Math.random();
	}

	public void method7174(int i) {
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.method3859(764081943);
		}
		synchronized (((Class427) this).aClass229_5122) {
			((Class427) this).aClass229_5122.method3859(-1307540664);
		}
	}

	public void method7175(int i, int i_3_, int i_4_) {
		((Class427) this).aClass229_5117 = new SoftCache(i);
		((Class427) this).aClass229_5122 = new SoftCache(i_3_);
	}

	public void method7176() {
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.method3863(1162016248);
		}
		synchronized (((Class427) this).aClass229_5122) {
			((Class427) this).aClass229_5122.method3863(1443152174);
		}
	}

	public void method7177(short i) {
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.method3863(1392803983);
		}
		synchronized (((Class427) this).aClass229_5122) {
			((Class427) this).aClass229_5122.method3863(728062976);
		}
	}

	public void method7178(int i, int i_5_) {
		((Class427) this).aClass229_5117 = new SoftCache(i);
		((Class427) this).aClass229_5122 = new SoftCache(i_5_);
	}

	public void method7179(int i, int i_6_) {
		((Class427) this).aClass229_5117 = new SoftCache(i);
		((Class427) this).aClass229_5122 = new SoftCache(i_6_);
	}

	public void method7180(int i, int i_7_) {
		((Class427) this).aClass229_5117 = new SoftCache(i);
		((Class427) this).aClass229_5122 = new SoftCache(i_7_);
	}

	public void method7181(int i, int i_8_) {
		((Class427) this).aClass229_5117 = new SoftCache(i);
		((Class427) this).aClass229_5122 = new SoftCache(i_8_);
	}

	public void method7182() {
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.method3859(-1178915812);
		}
		synchronized (((Class427) this).aClass229_5122) {
			((Class427) this).aClass229_5122.method3859(-125423422);
		}
	}

	public void method7183(int i) {
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.method3858(i, (byte) 65);
		}
		synchronized (((Class427) this).aClass229_5122) {
			((Class427) this).aClass229_5122.method3858(i, (byte) -64);
		}
	}

	public void method7184() {
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.method3863(824449754);
		}
		synchronized (((Class427) this).aClass229_5122) {
			((Class427) this).aClass229_5122.method3863(756406627);
		}
	}

	public Class418 method7185(int i) {
		Class418 class418;
		synchronized (((Class427) this).aClass229_5117) {
			class418 = ((Class418) ((Class427) this).aClass229_5117.method3865((long) i));
		}
		if (class418 != null)
			return class418;
		byte[] is;
		synchronized (((Class427) this).aClass317_5120) {
			is = ((Class427) this).aClass317_5120.getFile(((SharedConfigsType.aClass120_1497.anInt1521) * -71319279), i, -1952476258);
		}
		class418 = new Class418();
		((Class418) class418).aClass427_4998 = this;
		if (is != null)
			class418.method7008(new RsByteBuffer(is), 1405817786);
		synchronized (((Class427) this).aClass229_5117) {
			((Class427) this).aClass229_5117.put(class418, (long) i);
		}
		return class418;
	}

	static final void method7186(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = client.anInt7315 * 1595512269;
	}

	static final void method7187(CS2Executor class527, int i) {
		/* empty */
	}

	static final int method7188(Animable class521_sub1_sub1_sub2, int i) {
		if (455380417 * class521_sub1_sub1_sub2.anInt10340 == 0)
			return 0;
		if (-1 != -737324181 * class521_sub1_sub1_sub2.faceEntity) {
			Animable class521_sub1_sub1_sub2_9_ = null;
			if (-737324181 * class521_sub1_sub1_sub2.faceEntity < 32768) {
				Class282_Sub47 class282_sub47 = ((Class282_Sub47) (client.aClass465_7208.method7754((long) (-737324181 * class521_sub1_sub1_sub2.faceEntity))));
				if (null != class282_sub47)
					class521_sub1_sub1_sub2_9_ = ((Animable) class282_sub47.anObject8068);
			} else if (class521_sub1_sub1_sub2.faceEntity * -737324181 >= 32768)
				class521_sub1_sub1_sub2_9_ = (client.players[(-737324181 * class521_sub1_sub1_sub2.faceEntity - 32768)]);
			if (class521_sub1_sub1_sub2_9_ != null) {
				Class385 class385 = Class385.method6632((class521_sub1_sub1_sub2.method11166().aClass385_3595), class521_sub1_sub1_sub2_9_.method11166().aClass385_3595);
				int i_10_ = (int) class385.aFloat4671;
				int i_11_ = (int) class385.aFloat4673;
				if (i_10_ != 0 || i_11_ != 0)
					class521_sub1_sub1_sub2.method15863((int) (Math.atan2((double) i_10_, (double) i_11_) * 2607.5945876176133) & 0x3fff, 1489120080);
			}
		}
		if (class521_sub1_sub1_sub2 instanceof Player) {
			Player class521_sub1_sub1_sub2_sub1 = (Player) class521_sub1_sub1_sub2;
			if (327043279 * class521_sub1_sub1_sub2_sub1.faceDirection != -1 && (class521_sub1_sub1_sub2_sub1.anInt10355 * 1871221471 == 0 || (-666607017 * class521_sub1_sub1_sub2_sub1.anInt10366 > 0))) {
				class521_sub1_sub1_sub2_sub1.method15863(class521_sub1_sub1_sub2_sub1.faceDirection * 327043279, 1785594136);
				class521_sub1_sub1_sub2_sub1.faceDirection = -1435090479;
			}
		} else if (class521_sub1_sub1_sub2 instanceof NPC) {
			NPC class521_sub1_sub1_sub2_sub2 = (NPC) class521_sub1_sub1_sub2;
			if (-1929895711 * class521_sub1_sub1_sub2_sub2.anInt10578 != -1 && (0 == class521_sub1_sub1_sub2_sub2.anInt10355 * 1871221471 || (class521_sub1_sub1_sub2_sub2.anInt10366 * -666607017 > 0))) {
				Class385 class385 = (class521_sub1_sub1_sub2_sub2.method11166().aClass385_3595);
				Class219 class219 = client.aClass257_7353.method4519(1777766742);
				int i_12_ = ((int) class385.aFloat4671 - (class521_sub1_sub1_sub2_sub2.anInt10578 * -132062976 - class219.anInt2711 * 495713536 - class219.anInt2711 * 495713536));
				int i_13_ = ((int) class385.aFloat4673 - (-473524480 * class521_sub1_sub1_sub2_sub2.anInt10577 - class219.anInt2712 * 1124593408 - class219.anInt2712 * 1124593408));
				if (i_12_ != 0 || 0 != i_13_)
					class521_sub1_sub1_sub2_sub2.method15863((int) (Math.atan2((double) i_12_, (double) i_13_) * 2607.5945876176133) & 0x3fff, 1631347734);
				class521_sub1_sub1_sub2_sub2.anInt10578 = -119874337;
			}
		}
		return class521_sub1_sub1_sub2.method15796((byte) 1);
	}

	public static int method7189(RsByteBuffer class282_sub35, String string, int i) {
		int i_14_ = -1990677291 * class282_sub35.index;
		byte[] is = Class473.method7885(string, (byte) -70);
		class282_sub35.method13076(is.length, 2140409411);
		class282_sub35.index += Class113.aClass117_1234.method1971(is, 0, is.length, (class282_sub35.buffer), (class282_sub35.index * -1990677291), -130174544) * -1115476867;
		return class282_sub35.index * -1990677291 - i_14_;
	}
}
