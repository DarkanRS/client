
/* Class327_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Js5GrabWorker extends Js5FileWorker {
	boolean hasDataFile;
	Js5StandardRequester standardRequester;
	Js5LocalRequester localRequester;
	Js5CacheFile dataFile;
	Js5CacheFile refsFile;
	Js5CacheRequest refTableReq;
	long aLong7785;
	byte[] tableDigest;
	int indexId;
	ReferenceTable table;
	static final byte aByte7789 = 0;
	static final byte aByte7790 = 1;
	static final byte aByte7791 = -1;
	byte[] aByteArray7792;
	int anInt7793 = 0;
	int tableRevision;
	boolean aBool7795;
	IterableNodeMap aClass465_7796 = new IterableNodeMap(16);
	int anInt7797 = 0;
	NodeCollection coll;
	static final int anInt7799 = 2;
	static final int anInt7800 = 1;
	boolean aBool7801;
	static final int anInt7802 = 1000;
	static final int anInt7803 = 250;
	static CRC32 aCRC32_7804 = new CRC32();
	static final int anInt7805 = 0;
	int tableCrc;
	NodeCollection aClass482_7807 = new NodeCollection();

	void method5812(int i) {
		if (dataFile != null) {
			for (Node class282 = aClass482_7807.head((byte) 23); null != class282; class282 = aClass482_7807.next(290181019)) {
				if (-3442165056282524525L * class282.uid == (long) i)
					return;
			}
			Node class282 = new Node();
			class282.uid = (long) i * -1253863389874800229L;
			aClass482_7807.method8059(class282, -1173351233);
		}
	}

	int method5806(int i, byte i_0_) {
		Js5CacheRequest class282_sub50_sub11 = ((Js5CacheRequest) aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11)
			return class282_sub50_sub11.getCompletion(-1369977403);
		return 0;
	}

	ReferenceTable getReferenceTable(int i) {
		if (table != null)
			return table;
		if (refTableReq == null) {
			if (standardRequester.priorityRequestsFull(-1056221811))
				return null;
			refTableReq = (standardRequester.request(255, 737076305 * indexId, (byte) 0, true, (byte) 102));
		}
		if (((Js5CacheRequest) refTableReq).incomplete)
			return null;
		byte[] data = refTableReq.getData(862505694);
		if (refTableReq instanceof Js5LocalRequest) {
			try {
				if (data == null)
					throw new RuntimeException();
				table = new ReferenceTable(data, (-1197578581 * tableCrc), tableDigest);
				if (1502635595 * ((ReferenceTable) (table)).revision != -1803818645 * tableRevision)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				table = null;
				if (standardRequester.priorityRequestsFull(-430209987))
					refTableReq = null;
				else
					refTableReq = (standardRequester.request(255, 737076305 * indexId, (byte) 0, true, (byte) 22));
				return null;
			}
		} else {
			try {
				if (data == null)
					throw new RuntimeException();
				table = new ReferenceTable(data, (tableCrc * -1197578581), tableDigest);
			} catch (RuntimeException runtimeexception) {
				standardRequester.method5520((byte) 0);
				table = null;
				if (standardRequester.priorityRequestsFull(-2045697306))
					refTableReq = null;
				else
					refTableReq = (standardRequester.request(255, indexId * 737076305, (byte) 0, true, (byte) 12));
				return null;
			}
			if (null != refsFile)
				localRequester.write(indexId * 737076305, data, refsFile, -694199353);
		}
		refTableReq = null;
		if (dataFile != null) {
			aByteArray7792 = new byte[(((ReferenceTable) table).archiveCount) * 1563136279];
			anInt7793 = 0;
		}
		return table;
	}

	byte[] method5804(int i, int i_1_) {
		Js5CacheRequest class282_sub50_sub11 = method12546(i, 0, 242482231);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.getData(-2100194534);
		class282_sub50_sub11.unlink(-371378792);
		return is;
	}
	
	void processCheck(byte i) {
		if (null != coll && getReferenceTable(-2030640343) != null) {
			for (Node node = aClass482_7807.head((byte) 69); null != node; node = aClass482_7807.next(-235017563)) {
				int i_13_ = (int) (node.uid * -3442165056282524525L);
				if (i_13_ < 0 || (i_13_ >= (((ReferenceTable) table).archiveCount) * 1563136279) || 0 == (((ReferenceTable) table).fileCounts[i_13_]))
					node.unlink(-371378792);
				else {
					if (aByteArray7792[i_13_] == 0)
						method12546(i_13_, 1, -43813469);
					if (aByteArray7792[i_13_] == -1)
						method12546(i_13_, 2, -461658168);
					if (1 == aByteArray7792[i_13_])
						node.unlink(-371378792);
				}
			}
		}
	}

	void method5805(int i, int i_14_) {
		if (dataFile != null) {
			for (Node class282 = aClass482_7807.head((byte) 115); null != class282; class282 = aClass482_7807.next(-1039604534)) {
				if (-3442165056282524525L * class282.uid == (long) i)
					return;
			}
			Node class282 = new Node();
			class282.uid = (long) i * -1253863389874800229L;
			aClass482_7807.method8059(class282, 1037130654);
		}
	}

	public int method12541(int i) {
		if (table == null)
			return 0;
		return (((ReferenceTable) table).numValidArchives * 1006899347);
	}

	public int method12542(int i) {
		return anInt7793 * 308504451;
	}

	public int getCompletion(int i) {
		if (getReferenceTable(-122167082) == null) {
			if (refTableReq == null)
				return 0;
			return refTableReq.getCompletion(-1790040248);
		}
		return 100;
	}

	public void method12544(short i) {
		if (dataFile != null) {
			aBool7795 = true;
			if (coll == null)
				coll = new NodeCollection();
		}
	}

	Js5CacheRequest method12546(int i, int i_26_, int i_27_) {
		Js5CacheRequest class282_sub50_sub11 = ((Js5CacheRequest) aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11 && 0 == i_26_ && !((Js5CacheRequest) class282_sub50_sub11).aBool9637 && ((Js5CacheRequest) class282_sub50_sub11).incomplete) {
			class282_sub50_sub11.unlink(-371378792);
			class282_sub50_sub11 = null;
		}
		if (class282_sub50_sub11 == null) {
			if (i_26_ == 0) {
				if (dataFile != null && -1 != aByteArray7792[i])
					class282_sub50_sub11 = (localRequester.readNow(i, dataFile, -1224840675));
				else if (!standardRequester.priorityRequestsFull(-1505335895))
					class282_sub50_sub11 = (standardRequester.request(indexId * 737076305, i, (byte) 2, true, (byte) 13));
				else
					return null;
			} else if (i_26_ == 1) {
				if (null == dataFile)
					throw new RuntimeException();
				class282_sub50_sub11 = (localRequester.method5567(i, dataFile, 1246338163));
			} else if (2 == i_26_) {
				if (null == dataFile)
					throw new RuntimeException();
				if (-1 != aByteArray7792[i])
					throw new RuntimeException();
				if (!standardRequester.method5516(-633705058))
					class282_sub50_sub11 = (standardRequester.request(indexId * 737076305, i, (byte) 2, false, (byte) 54));
				else
					return null;
			} else
				throw new RuntimeException();
			aClass465_7796.method7765(class282_sub50_sub11, (long) i);
		}
		if (((Js5CacheRequest) class282_sub50_sub11).incomplete)
			return null;
		byte[] is = class282_sub50_sub11.getData(-530456645);
		if (class282_sub50_sub11 instanceof Js5LocalRequest) {
			Js5CacheRequest class282_sub50_sub11_28_;
			try {
				if (is == null || is.length <= 2)
					throw new RuntimeException();
				aCRC32_7804.reset();
				aCRC32_7804.update(is, 0, is.length - 2);
				int i_29_ = (int) aCRC32_7804.getValue();
				if (i_29_ != (((ReferenceTable) table).unknown[i]))
					throw new RuntimeException();
				if (null != (((ReferenceTable) table).whirlpool) && (null != (((ReferenceTable) table).whirlpool[i]))) {
					byte[] is_30_ = (((ReferenceTable) table).whirlpool[i]);
					byte[] is_31_ = Class361.method6273(is, 0, is.length - 2, (byte) 21);
					for (int i_32_ = 0; i_32_ < 64; i_32_++) {
						if (is_31_[i_32_] != is_30_[i_32_])
							throw new RuntimeException();
					}
				}
				int i_33_ = ((is[is.length - 1] & 0xff) + ((is[is.length - 2] & 0xff) << 8));
				if (((((ReferenceTable) table).crcs[i]) & 0xffff) != i_33_)
					throw new RuntimeException();
				if (1 != aByteArray7792[i]) {
					if (0 != aByteArray7792[i]) {
						/* empty */
					}
					anInt7793 += -1723048149;
					aByteArray7792[i] = (byte) 1;
				}
				if (!((Js5CacheRequest) class282_sub50_sub11).aBool9637)
					class282_sub50_sub11.unlink(-371378792);
				class282_sub50_sub11_28_ = class282_sub50_sub11;
			} catch (Exception exception) {
				aByteArray7792[i] = (byte) -1;
				class282_sub50_sub11.unlink(-371378792);
				if (((Js5CacheRequest) class282_sub50_sub11).aBool9637 && !standardRequester.priorityRequestsFull(-439719120)) {
					Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (standardRequester.request(indexId * 737076305, i, (byte) 2, true, (byte) -66));
					aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
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
			if ((((ReferenceTable) table).unknown[i]) != i_34_)
				throw new RuntimeException();
			if ((((ReferenceTable) table).whirlpool) != null && (((ReferenceTable) table).whirlpool[i]) != null) {
				byte[] is_35_ = (((ReferenceTable) table).whirlpool[i]);
				byte[] is_36_ = Class361.method6273(is, 0, is.length - 2, (byte) 12);
				for (int i_37_ = 0; i_37_ < 64; i_37_++) {
					if (is_36_[i_37_] != is_35_[i_37_])
						throw new RuntimeException();
				}
			}
			standardRequester.anInt3657 = 0;
			standardRequester.anInt3650 = 0;
		} catch (RuntimeException runtimeexception) {
			standardRequester.method5520((byte) 0);
			class282_sub50_sub11.unlink(-371378792);
			if (((Js5CacheRequest) class282_sub50_sub11).aBool9637 && !standardRequester.priorityRequestsFull(-1089916342)) {
				Class282_Sub50_Sub11_Sub1 class282_sub50_sub11_sub1 = (standardRequester.request(indexId * 737076305, i, (byte) 2, true, (byte) -35));
				aClass465_7796.method7765(class282_sub50_sub11_sub1, (long) i);
			}
			return null;
		}
		is[is.length - 2] = (byte) ((((ReferenceTable) table).crcs[i]) >>> 8);
		is[is.length - 1] = (byte) (((ReferenceTable) table).crcs[i]);
		if (dataFile != null) {
			localRequester.write(i, is, dataFile, -234788536);
			if (aByteArray7792[i] != 1) {
				anInt7793 += -1723048149;
				aByteArray7792[i] = (byte) 1;
			}
		}
		if (!((Js5CacheRequest) class282_sub50_sub11).aBool9637)
			class282_sub50_sub11.unlink(-371378792);
		return class282_sub50_sub11;
	}

	ReferenceTable method5807() {
		if (table != null)
			return table;
		if (refTableReq == null) {
			if (standardRequester.priorityRequestsFull(-1103490150))
				return null;
			refTableReq = (standardRequester.request(255, 737076305 * indexId, (byte) 0, true, (byte) -74));
		}
		if (((Js5CacheRequest) refTableReq).incomplete)
			return null;
		byte[] is = refTableReq.getData(1691080819);
		if (refTableReq instanceof Js5LocalRequest) {
			try {
				if (is == null)
					throw new RuntimeException();
				table = new ReferenceTable(is, (-1197578581 * tableCrc), tableDigest);
				if (1502635595 * ((ReferenceTable) (table)).revision != -1803818645 * tableRevision)
					throw new RuntimeException();
			} catch (RuntimeException runtimeexception) {
				table = null;
				if (standardRequester.priorityRequestsFull(-1857312667))
					refTableReq = null;
				else
					refTableReq = (standardRequester.request(255, 737076305 * indexId, (byte) 0, true, (byte) 43));
				return null;
			}
		} else {
			try {
				if (is == null)
					throw new RuntimeException();
				table = new ReferenceTable(is, (tableCrc * -1197578581), tableDigest);
			} catch (RuntimeException runtimeexception) {
				standardRequester.method5520((byte) 0);
				table = null;
				if (standardRequester.priorityRequestsFull(-621846092))
					refTableReq = null;
				else
					refTableReq = (standardRequester.request(255, indexId * 737076305, (byte) 0, true, (byte) -5));
				return null;
			}
			if (null != refsFile)
				localRequester.write(indexId * 737076305, is, refsFile, -1915662957);
		}
		refTableReq = null;
		if (dataFile != null) {
			aByteArray7792 = new byte[(((ReferenceTable) table).archiveCount) * 1563136279];
			anInt7793 = 0;
		}
		return table;
	}

	Js5GrabWorker(int index_, Js5CacheFile dataFile_, Js5CacheFile refsFile_, Js5StandardRequester standardRequester_, Js5LocalRequester localRequester_, int tableCrc_, byte[] digestTable, int tableRev, boolean bool) {
		this.aLong7785 = 0L;
		this.indexId = -507714383 * index_;
		this.dataFile = dataFile_;
		if (null == dataFile)
			this.hasDataFile = false;
		else {
			this.hasDataFile = true;
			this.coll = new NodeCollection();
		}
		this.refsFile = refsFile_;
		this.standardRequester = standardRequester_;
		this.localRequester = localRequester_;
		this.tableCrc = -903977981 * tableCrc_;
		this.tableDigest = digestTable;
		this.tableRevision = tableRev * -794625213;
		this.aBool7801 = bool;
		if (this.refsFile != null)
			this.refTableReq = (this.localRequester.readNow(737076305 * this.indexId, this.refsFile, -1435732555));
	}

	byte[] method5809(int i) {
		Js5CacheRequest class282_sub50_sub11 = method12546(i, 0, -1085366519);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.getData(1414497884);
		class282_sub50_sub11.unlink(-371378792);
		return is;
	}

	int method5810(int i) {
		Js5CacheRequest class282_sub50_sub11 = ((Js5CacheRequest) aClass465_7796.method7754((long) i));
		if (null != class282_sub50_sub11)
			return class282_sub50_sub11.getCompletion(-1968748053);
		return 0;
	}

	byte[] method5811(int i) {
		Js5CacheRequest class282_sub50_sub11 = method12546(i, 0, 227570516);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.getData(1816584795);
		class282_sub50_sub11.unlink(-371378792);
		return is;
	}

	void method5808(int i) {
		if (dataFile != null) {
			for (Node class282 = aClass482_7807.head((byte) 28); null != class282; class282 = aClass482_7807.next(978707001)) {
				if (-3442165056282524525L * class282.uid == (long) i)
					return;
			}
			Node class282 = new Node();
			class282.uid = (long) i * -1253863389874800229L;
			aClass482_7807.method8059(class282, 269471242);
		}
	}

	byte[] method5813(int i) {
		Js5CacheRequest class282_sub50_sub11 = method12546(i, 0, -1115231710);
		if (class282_sub50_sub11 == null)
			return null;
		byte[] is = class282_sub50_sub11.getData(737831388);
		class282_sub50_sub11.unlink(-371378792);
		return is;
	}

	void method12552(int i) {
		if (null != coll) {
			if (getReferenceTable(418724601) == null)
				return;
			if (hasDataFile) {
				boolean bool = true;
				for (Node class282 = coll.head((byte) 124); null != class282; class282 = coll.next(328179980)) {
					int i_52_ = (int) (-3442165056282524525L * class282.uid);
					if (aByteArray7792[i_52_] == 0)
						method12546(i_52_, 1, -1048339107);
					if (aByteArray7792[i_52_] != 0)
						class282.unlink(-371378792);
					else
						bool = false;
				}
				while (1482915297 * anInt7797 < (((ReferenceTable) table).fileCounts).length) {
					if ((((ReferenceTable) table).fileCounts[anInt7797 * 1482915297]) == 0)
						anInt7797 += -1503033823;
					else {
						if ((((Js5LocalRequester) localRequester).anInt3662) * 3183863 >= 250) {
							bool = false;
							break;
						}
						if (0 == (aByteArray7792[(1482915297 * anInt7797)]))
							method12546((anInt7797 * 1482915297), 1, 317844663);
						if (0 == (aByteArray7792[(anInt7797 * 1482915297)])) {
							Node class282 = new Node();
							class282.uid = ((long) anInt7797 * -3869615546755887045L);
							coll.method8059(class282, -1762683318);
							bool = false;
						}
						anInt7797 += -1503033823;
					}
				}
				if (bool) {
					hasDataFile = false;
					anInt7797 = 0;
				}
			} else if (aBool7795) {
				boolean bool = true;
				for (Node class282 = coll.head((byte) 13); null != class282; class282 = coll.next(392865935)) {
					int i_53_ = (int) (class282.uid * -3442165056282524525L);
					if (1 != aByteArray7792[i_53_])
						method12546(i_53_, 2, -1651626518);
					if (1 == aByteArray7792[i_53_])
						class282.unlink(-371378792);
					else
						bool = false;
				}
				while (1482915297 * anInt7797 < (((ReferenceTable) table).fileCounts).length) {
					if ((((ReferenceTable) table).fileCounts[1482915297 * anInt7797]) == 0)
						anInt7797 += -1503033823;
					else {
						if (standardRequester.method5516(-619518274)) {
							bool = false;
							break;
						}
						if (1 != (aByteArray7792[(anInt7797 * 1482915297)]))
							method12546((1482915297 * anInt7797), 2, 627310789);
						if (1 != (aByteArray7792[(anInt7797 * 1482915297)])) {
							Node class282 = new Node();
							class282.uid = (-3869615546755887045L * (long) anInt7797);
							coll.method8059(class282, 720444419);
							bool = false;
						}
						anInt7797 += -1503033823;
					}
				}
				if (bool) {
					aBool7795 = false;
					anInt7797 = 0;
				}
			} else
				coll = null;
		}
		if (aBool7801 && (Class169.method2869(2055331378) >= aLong7785 * 8350705993444210771L)) {
			for (Js5CacheRequest class282_sub50_sub11 = (Js5CacheRequest) aClass465_7796.method7750(-556717169); class282_sub50_sub11 != null; class282_sub50_sub11 = (Js5CacheRequest) aClass465_7796.method7751((byte) 47)) {
				if (!((Js5CacheRequest) class282_sub50_sub11).incomplete) {
					if (((Js5CacheRequest) class282_sub50_sub11).aBool9638) {
						if (!((Js5CacheRequest) class282_sub50_sub11).aBool9637)
							throw new RuntimeException();
						class282_sub50_sub11.unlink(-371378792);
					} else
						((Js5CacheRequest) class282_sub50_sub11).aBool9638 = true;
				}
			}
			aLong7785 = ((Class169.method2869(1703691062) + 1000L) * -8999221579515212837L);
		}
	}
	
	public int method12559(int i) {
		if (null == table)
			return 0;
		if (!hasDataFile)
			return (1006899347 * (((ReferenceTable) table).numValidArchives));
		Node class282 = coll.head((byte) 11);
		if (null == class282)
			return 0;
		return (int) (class282.uid * -3442165056282524525L);
	}

	static final void method12560(CS2Executor class527, short i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub26_8224.method12943(1554846172) == 1 ? 1 : 0;
	}

	static final void method12561(CS2Executor class527, int i) {
		int i_54_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
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
