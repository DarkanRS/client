
/* Class327_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class JS5GrabWorker extends JS5FileWorker {
	boolean hasDataFile;
	JS5StandardRequester standardRequester;
	JS5LocalRequester localRequester;
	JS5CacheFile dataFile;
	JS5CacheFile refsFile;
	JS5CacheRequest refTableReq;
	long aLong7785;
	byte[] tableDigest;
	int indexId;
	ReferenceTable table;
	byte[] aByteArray7792;
	int anInt7793 = 0;
	int tableRevision;
	boolean aBool7795;
	IterableNodeMap aClass465_7796 = new IterableNodeMap(16);
	int anInt7797 = 0;
	NodeCollection coll;
	boolean aBool7801;
	static CRC32 aCRC32_7804 = new CRC32();
	int tableCRC;
	NodeCollection aClass482_7807 = new NodeCollection();

	void method5812(int i) {
		if (this.dataFile != null) {
			for (Node class282 = this.aClass482_7807.head((byte) 23); null != class282; class282 = this.aClass482_7807.next(290181019)) {
				if (-3442165056282524525L * class282.data == (long) i)
					return;
			}
			Node class282 = new Node();
			class282.data = (long) i * -1253863389874800229L;
			this.aClass482_7807.append(class282, -1173351233);
		}
	}

	int method5806(int i, byte i_0_) {
		JS5CacheRequest class282_sub50_sub11 = ((JS5CacheRequest) this.aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11)
			return class282_sub50_sub11.getCompletion(-1369977403);
		return 0;
	}

	ReferenceTable getReferenceTable(int i) {
		if (this.table != null)
			return this.table;
		if (this.refTableReq == null) {
			if (this.standardRequester.method5517(-1056221811))
				return null;
			this.refTableReq = (this.standardRequester.method5515(255, 737076305 * this.indexId, (byte) 0, true, (byte) 102));
		}
		if (((JS5CacheRequest) this.refTableReq).incomplete)
			return null;
		byte[] is = this.refTableReq.getData(862505694);
		if (this.refTableReq instanceof Class282_Sub50_Sub11_Sub2) {
			try {
				if (is == null)
					throw new RuntimeException();
				this.table = new ReferenceTable(is, (-1197578581 * this.tableCRC), this.tableDigest);
				if (1502635595 * ((ReferenceTable) (this.table)).revision != -1803818645 * this.tableRevision)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				this.table = null;
				if (this.standardRequester.method5517(-430209987))
					this.refTableReq = null;
				else
					this.refTableReq = (this.standardRequester.method5515(255, 737076305 * this.indexId, (byte) 0, true, (byte) 22));
				return null;
			}
		} else {
			try {
				if (is == null)
					throw new RuntimeException();
				this.table = new ReferenceTable(is, (this.tableCRC * -1197578581), this.tableDigest);
			} catch (RuntimeException runtimeexception) {
				this.standardRequester.method5520((byte) 0);
				this.table = null;
				if (this.standardRequester.method5517(-2045697306))
					this.refTableReq = null;
				else
					this.refTableReq = (this.standardRequester.method5515(255, this.indexId * 737076305, (byte) 0, true, (byte) 12));
				return null;
			}
			if (null != this.refsFile)
				this.localRequester.method5564(this.indexId * 737076305, is, this.refsFile, -694199353);
		}
		this.refTableReq = null;
		if (this.dataFile != null) {
			this.aByteArray7792 = new byte[(((ReferenceTable) this.table).archiveCount) * 1563136279];
			this.anInt7793 = 0;
		}
		return this.table;
	}

	byte[] method5804(int i, int i_1_) {
		JS5CacheRequest class282_sub50_sub11 = method12546(i, 0, 242482231);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.getData(-2100194534);
		class282_sub50_sub11.remove();
		return is;
	}

	void processCheck(byte i) {
		if (null != this.coll && getReferenceTable(-2030640343) != null) {
			for (Node node = this.aClass482_7807.head((byte) 69); null != node; node = this.aClass482_7807.next(-235017563)) {
				int i_13_ = (int) (node.data * -3442165056282524525L);
				if (i_13_ < 0 || (i_13_ >= (((ReferenceTable) this.table).archiveCount) * 1563136279) || 0 == (((ReferenceTable) this.table).validFileIdSizes[i_13_]))
					node.remove();
				else {
					if (this.aByteArray7792[i_13_] == 0)
						method12546(i_13_, 1, -43813469);
					if (this.aByteArray7792[i_13_] == -1)
						method12546(i_13_, 2, -461658168);
					if (1 == this.aByteArray7792[i_13_])
						node.remove();
				}
			}
		}
	}

	void method5805(int i, int i_14_) {
		if (this.dataFile != null) {
			for (Node class282 = this.aClass482_7807.head((byte) 115); null != class282; class282 = this.aClass482_7807.next(-1039604534)) {
				if (-3442165056282524525L * class282.data == (long) i)
					return;
			}
			Node class282 = new Node();
			class282.data = (long) i * -1253863389874800229L;
			this.aClass482_7807.append(class282, 1037130654);
		}
	}

	public int method12541(int i) {
		if (this.table == null)
			return 0;
		return (((ReferenceTable) this.table).numValidArchives * 1006899347);
	}

	public int method12542(int i) {
		return this.anInt7793 * 308504451;
	}

	public int method12543(int i) {
		if (getReferenceTable(-122167082) == null) {
			if (this.refTableReq == null)
				return 0;
			return this.refTableReq.getCompletion(-1790040248);
		}
		return 100;
	}

	public void method12544(short i) {
		if (this.dataFile != null) {
			this.aBool7795 = true;
			if (this.coll == null)
				this.coll = new NodeCollection();
		}
	}

	JS5CacheRequest method12546(int i, int i_26_, int i_27_) {
		JS5CacheRequest class282_sub50_sub11 = ((JS5CacheRequest) this.aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11 && 0 == i_26_ && !((JS5CacheRequest) class282_sub50_sub11).aBool9637 && ((JS5CacheRequest) class282_sub50_sub11).incomplete) {
			class282_sub50_sub11.remove();
			class282_sub50_sub11 = null;
		}
		if (class282_sub50_sub11 == null) {
			if (i_26_ == 0) {
				if (this.dataFile != null && -1 != this.aByteArray7792[i])
					class282_sub50_sub11 = (this.localRequester.method5578(i, this.dataFile, -1224840675));
				else if (!this.standardRequester.method5517(-1505335895))
					class282_sub50_sub11 = (this.standardRequester.method5515(this.indexId * 737076305, i, (byte) 2, true, (byte) 13));
				else
					return null;
			} else if (i_26_ == 1) {
				if (null == this.dataFile)
					throw new RuntimeException();
				class282_sub50_sub11 = (this.localRequester.method5567(i, this.dataFile, 1246338163));
			} else if (2 == i_26_) {
				if (null == this.dataFile)
					throw new RuntimeException();
				if (-1 != this.aByteArray7792[i])
					throw new RuntimeException();
				if (!this.standardRequester.method5516(-633705058))
					class282_sub50_sub11 = (this.standardRequester.method5515(this.indexId * 737076305, i, (byte) 2, false, (byte) 54));
				else
					return null;
			} else
				throw new RuntimeException();
			this.aClass465_7796.method7765(class282_sub50_sub11, (long) i);
		}
		if (((JS5CacheRequest) class282_sub50_sub11).incomplete)
			return null;
		byte[] is = class282_sub50_sub11.getData(-530456645);
		if (class282_sub50_sub11 instanceof Class282_Sub50_Sub11_Sub2) {
			JS5CacheRequest class282_sub50_sub11_28_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7804.reset();
				aCRC32_7804.update(is, 0, is.length - 2);
				int i_29_ = (int) aCRC32_7804.getValue();
				if (i_29_ != (((ReferenceTable) this.table).unknown[i]))
					throw new RuntimeException();
				if (null != (((ReferenceTable) this.table).whirlpool) && (null != (((ReferenceTable) this.table).whirlpool[i]))) {
					byte[] is_30_ = (((ReferenceTable) this.table).whirlpool[i]);
					byte[] is_31_ = Class361.method6273(is, 0, is.length - 2, (byte) 21);
					for (int i_32_ = 0; i_32_ < 64; i_32_++) {
						if (is_31_[i_32_] != is_30_[i_32_])
							throw new RuntimeException();
					}
				}
				int i_33_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (((((ReferenceTable) this.table).crcs[i]) & 0xffff) != i_33_)
					throw new RuntimeException();
				if (1 != this.aByteArray7792[i]) {
					if (0 != this.aByteArray7792[i]) {
						/* empty */
					}
					this.anInt7793 += -1723048149;
					this.aByteArray7792[i] = (byte) 1;
				}
				if (!((JS5CacheRequest) class282_sub50_sub11).aBool9637)
					class282_sub50_sub11.remove();
				class282_sub50_sub11_28_ = class282_sub50_sub11;
			} catch (Exception exception) {
				this.aByteArray7792[i] = (byte) -1;
				class282_sub50_sub11.remove();
				if (((JS5CacheRequest) class282_sub50_sub11).aBool9637 && !this.standardRequester.method5517(-439719120)) {
					Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (this.standardRequester.method5515(this.indexId * 737076305, i, (byte) 2, true, (byte) -66));
					this.aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
				}
				return null;
			}
			return class282_sub50_sub11_28_;
		}
		try {
			if (is == null || is.length <= 2)
				throw new RuntimeException();
			aCRC32_7804.reset();
			aCRC32_7804.update(is, 0, is.length - 2);
			int i_34_ = (int) aCRC32_7804.getValue();
			if ((((ReferenceTable) this.table).unknown[i]) != i_34_)
				throw new RuntimeException();
			if ((((ReferenceTable) this.table).whirlpool) != null && (((ReferenceTable) this.table).whirlpool[i]) != null) {
				byte[] is_35_ = (((ReferenceTable) this.table).whirlpool[i]);
				byte[] is_36_ = Class361.method6273(is, 0, is.length - 2, (byte) 12);
				for (int i_37_ = 0; i_37_ < 64; i_37_++) {
					if (is_36_[i_37_] != is_35_[i_37_])
						throw new RuntimeException();
				}
			}
			this.standardRequester.anInt3657 = 0;
			this.standardRequester.anInt3650 = 0;
		} catch (RuntimeException runtimeexception) {
			this.standardRequester.method5520((byte) 0);
			class282_sub50_sub11.remove();
			if (((JS5CacheRequest) class282_sub50_sub11).aBool9637 && !this.standardRequester.method5517(-1089916342)) {
				Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (this.standardRequester.method5515(this.indexId * 737076305, i, (byte) 2, true, (byte) -35));
				this.aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((ReferenceTable) this.table).crcs[i]) >>> 8);
		is[is.length - 1] = (byte) (((ReferenceTable) this.table).crcs[i]);
		if (this.dataFile != null) {
			this.localRequester.method5564(i, is, this.dataFile, -234788536);
			if (this.aByteArray7792[i] != 1) {
				this.anInt7793 += -1723048149;
				this.aByteArray7792[i] = (byte) 1;
			}
		}
		if (!((JS5CacheRequest) class282_sub50_sub11).aBool9637)
			class282_sub50_sub11.remove();
		return class282_sub50_sub11;
	}

	ReferenceTable method5807() {
		if (this.table != null)
			return this.table;
		if (this.refTableReq == null) {
			if (this.standardRequester.method5517(-1103490150))
				return null;
			this.refTableReq = (this.standardRequester.method5515(255, 737076305 * this.indexId, (byte) 0, true, (byte) -74));
		}
		if (((JS5CacheRequest) this.refTableReq).incomplete)
			return null;
		byte[] is = this.refTableReq.getData(1691080819);
		if (this.refTableReq instanceof Class282_Sub50_Sub11_Sub2) {
			try {
				if (is == null)
					throw new RuntimeException();
				this.table = new ReferenceTable(is, (-1197578581 * this.tableCRC), this.tableDigest);
				if (1502635595 * ((ReferenceTable) (this.table)).revision != -1803818645 * this.tableRevision)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				this.table = null;
				if (this.standardRequester.method5517(-1857312667))
					this.refTableReq = null;
				else
					this.refTableReq = (this.standardRequester.method5515(255, 737076305 * this.indexId, (byte) 0, true, (byte) 43));
				return null;
			}
		} else {
			try {
				if (is == null)
					throw new RuntimeException();
				this.table = new ReferenceTable(is, (this.tableCRC * -1197578581), this.tableDigest);
			} catch (RuntimeException runtimeexception) {
				this.standardRequester.method5520((byte) 0);
				this.table = null;
				if (this.standardRequester.method5517(-621846092))
					this.refTableReq = null;
				else
					this.refTableReq = (this.standardRequester.method5515(255, this.indexId * 737076305, (byte) 0, true, (byte) -5));
				return null;
			}
			if (null != this.refsFile)
				this.localRequester.method5564(this.indexId * 737076305, is, this.refsFile, -1915662957);
		}
		this.refTableReq = null;
		if (this.dataFile != null) {
			this.aByteArray7792 = new byte[(((ReferenceTable) this.table).archiveCount) * 1563136279];
			this.anInt7793 = 0;
		}
		return this.table;
	}

	JS5GrabWorker(int i, JS5CacheFile class203, JS5CacheFile class203_38_, JS5StandardRequester class312, JS5LocalRequester class313, int i_39_, byte[] is, int i_40_, boolean bool) {
		this.aLong7785 = 0L;
		this.indexId = -507714383 * i;
		this.dataFile = class203;
		if (null == this.dataFile)
			this.hasDataFile = false;
		else {
			this.hasDataFile = true;
			this.coll = new NodeCollection();
		}
		this.refsFile = class203_38_;
		this.standardRequester = class312;
		this.localRequester = class313;
		this.tableCRC = -903977981 * i_39_;
		this.tableDigest = is;
		this.tableRevision = i_40_ * -794625213;
		this.aBool7801 = bool;
		if (this.refsFile != null)
			this.refTableReq = (this.localRequester.method5578(737076305 * this.indexId, this.refsFile, -1435732555));
	}

	byte[] method5809(int i) {
		JS5CacheRequest class282_sub50_sub11 = method12546(i, 0, -1085366519);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.getData(1414497884);
		class282_sub50_sub11.remove();
		return is;
	}

	int method5810(int i) {
		JS5CacheRequest class282_sub50_sub11 = ((JS5CacheRequest) this.aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11)
			return class282_sub50_sub11.getCompletion(-1968748053);
		return 0;
	}

	byte[] method5811(int i) {
		JS5CacheRequest class282_sub50_sub11 = method12546(i, 0, 227570516);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.getData(1816584795);
		class282_sub50_sub11.remove();
		return is;
	}

	void method5808(int i) {
		if (this.dataFile != null) {
			for (Node class282 = this.aClass482_7807.head((byte) 28); null != class282; class282 = this.aClass482_7807.next(978707001)) {
				if (-3442165056282524525L * class282.data == (long) i)
					return;
			}
			Node class282 = new Node();
			class282.data = (long) i * -1253863389874800229L;
			this.aClass482_7807.append(class282, 269471242);
		}
	}

	byte[] method5813(int i) {
		JS5CacheRequest class282_sub50_sub11 = method12546(i, 0, -1115231710);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.getData(737831388);
		class282_sub50_sub11.remove();
		return is;
	}

	void method12552(int i) {
		if (null != this.coll) {
			if (getReferenceTable(418724601) == null)
				return;
			if (this.hasDataFile) {
				boolean bool = true;
				for (Node class282 = this.coll.head((byte) 124); null != class282; class282 = this.coll.next(328179980)) {
					int i_52_ = (int) (-3442165056282524525L * class282.data);
					if (this.aByteArray7792[i_52_] == 0)
						method12546(i_52_, 1, -1048339107);
					if (this.aByteArray7792[i_52_] != 0)
						class282.remove();
					else
						bool = false;
				}
				while (1482915297 * this.anInt7797 < (((ReferenceTable) this.table).validFileIdSizes).length) {
					if ((((ReferenceTable) this.table).validFileIdSizes[this.anInt7797 * 1482915297]) == 0)
						this.anInt7797 += -1503033823;
					else {
						if ((((JS5LocalRequester) this.localRequester).anInt3662) * 3183863 >= 250) {
							bool = false;
							break;
						}
						if (0 == (this.aByteArray7792[(1482915297 * this.anInt7797)]))
							method12546((this.anInt7797 * 1482915297), 1, 317844663);
						if (0 == (this.aByteArray7792[(this.anInt7797 * 1482915297)])) {
							Node class282 = new Node();
							class282.data = ((long) this.anInt7797 * -3869615546755887045L);
							this.coll.append(class282, -1762683318);
							bool = false;
						}
						this.anInt7797 += -1503033823;
					}
				}
				if (bool) {
					this.hasDataFile = false;
					this.anInt7797 = 0;
				}
			} else if (this.aBool7795) {
				boolean bool = true;
				for (Node class282 = this.coll.head((byte) 13); null != class282; class282 = this.coll.next(392865935)) {
					int i_53_ = (int) (class282.data * -3442165056282524525L);
					if (1 != this.aByteArray7792[i_53_])
						method12546(i_53_, 2, -1651626518);
					if (1 == this.aByteArray7792[i_53_])
						class282.remove();
					else
						bool = false;
				}
				while (1482915297 * this.anInt7797 < (((ReferenceTable) this.table).validFileIdSizes).length) {
					if ((((ReferenceTable) this.table).validFileIdSizes[1482915297 * this.anInt7797]) == 0)
						this.anInt7797 += -1503033823;
					else {
						if (this.standardRequester.method5516(-619518274)) {
							bool = false;
							break;
						}
						if (1 != (this.aByteArray7792[(this.anInt7797 * 1482915297)]))
							method12546((1482915297 * this.anInt7797), 2, 627310789);
						if (1 != (this.aByteArray7792[(this.anInt7797 * 1482915297)])) {
							Node class282 = new Node();
							class282.data = (-3869615546755887045L * (long) this.anInt7797);
							this.coll.append(class282, 720444419);
							bool = false;
						}
						this.anInt7797 += -1503033823;
					}
				}
				if (bool) {
					this.aBool7795 = false;
					this.anInt7797 = 0;
				}
			} else
				this.coll = null;
		}
		if (this.aBool7801 && (Class169.method2869(2055331378) >= this.aLong7785 * 8350705993444210771L)) {
			for (JS5CacheRequest class282_sub50_sub11 = (JS5CacheRequest) this.aClass465_7796.method7750(-556717169); class282_sub50_sub11 != null; class282_sub50_sub11 = (JS5CacheRequest) this.aClass465_7796.method7751((byte) 47)) {
				if (!((JS5CacheRequest) class282_sub50_sub11).incomplete) {
					if (((JS5CacheRequest) class282_sub50_sub11).aBool9638) {
						if (!((JS5CacheRequest) class282_sub50_sub11).aBool9637)
							throw new RuntimeException();
						class282_sub50_sub11.remove();
					} else
						((JS5CacheRequest) class282_sub50_sub11).aBool9638 = true;
				}
			}
			this.aLong7785 = ((Class169.method2869(1703691062) + 1000L) * -8999221579515212837L);
		}
	}

	public int method12559(int i) {
		if (null == this.table)
			return 0;
		if (!this.hasDataFile)
			return (1006899347 * (((ReferenceTable) this.table).numValidArchives));
		Node class282 = this.coll.head((byte) 11);
		if (null == class282)
			return 0;
		return (int) (class282.data * -3442165056282524525L);
	}

	static final void method12560(CS2Executor class527, short i) {
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub26_8224.method12943(1554846172) == 1 ? 1 : 0;
	}

	static final void method12561(CS2Executor class527, int i) {
		int i_54_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (i_54_ != -1)
			Class92.method1563(i_54_, 1917715893);
	}

	static boolean method12562(int i) {
		if (null == Class1.aClass282_Sub50_Sub7_12)
			return false;
		if ((((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12).anInt9587 * -1441507225) >= 2000)
			((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12).anInt9587 -= -836888656;
		if (1007 == -1441507225 * ((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12).anInt9587)
			return true;
		return false;
	}
}
