package com.jagex;

import java.util.zip.CRC32;

public class JS5GrabWorker extends JS5FileWorker {

	static CRC32 aCRC32_7804 = new CRC32();

	static boolean method12562() {
		if (AccountCreationStage.aCacheableNode_Sub7_12 == null)
			return false;
		if (AccountCreationStage.aCacheableNode_Sub7_12.clickType >= 2000)
			AccountCreationStage.aCacheableNode_Sub7_12.clickType -= 2000;
		return AccountCreationStage.aCacheableNode_Sub7_12.clickType == 1007;
	}

	JS5CacheRequest refTableReq;

	ReferenceTable table;

	byte[] aByteArray7792;

	int anInt7793;

	boolean aBool7795;

	NodeCollection coll;

	IterableNodeMap aClass465_7796 = new IterableNodeMap(16);

	int anInt7797;

	NodeCollection aClass482_7807 = new NodeCollection();

	long aLong7785;

	int indexId;

	JS5CacheFile dataFile;

	boolean hasDataFile;

	JS5CacheFile refsFile;

	JS5StandardRequester standardRequester;

	JS5LocalRequester localRequester;

	int tableCRC;

	byte[] tableDigest;

	int tableRevision;

	boolean aBool7801;

	JS5GrabWorker(int i_1, JS5CacheFile js5cachefile_2, JS5CacheFile js5cachefile_3, JS5StandardRequester js5standardrequester_4, JS5LocalRequester js5localrequester_5, int i_6, byte[] bytes_7, int i_8) {
		indexId = i_1;
		dataFile = js5cachefile_2;
		if (dataFile == null)
			hasDataFile = false;
		else {
			hasDataFile = true;
			coll = new NodeCollection();
		}
		refsFile = js5cachefile_3;
		standardRequester = js5standardrequester_4;
		localRequester = js5localrequester_5;
		tableCRC = i_6;
		tableDigest = bytes_7;
		tableRevision = i_8;
		aBool7801 = true;
		if (refsFile != null)
			refTableReq = localRequester.method5578(indexId, refsFile);
	}

	@Override
	ReferenceTable getReferenceTable() {
		if (table != null)
			return table;
		if (refTableReq == null) {
			if (standardRequester.priorityUnavailable())
				return null;
			refTableReq = standardRequester.request(255, indexId, (byte) 0, true);
		}
		if (refTableReq.waiting)
			return null;
		else {
			byte[] bytes_2 = refTableReq.getData();
			if (refTableReq instanceof CacheableNode_Sub11_Sub2) {
				if (bytes_2 == null)
					throw new RuntimeException();
				table = new ReferenceTable(bytes_2, tableCRC, tableDigest);
				if (table.revision != tableRevision)
					throw new RuntimeException();
			} else {
				if (bytes_2 == null)
					throw new RuntimeException();
				table = new ReferenceTable(bytes_2, tableCRC, tableDigest);
				if (refsFile != null)
					localRequester.method5564(indexId, bytes_2, refsFile);
			}
			refTableReq = null;
			if (dataFile != null) {
				aByteArray7792 = new byte[table.archiveCount];
				anInt7793 = 0;
			}
			return table;
		}
	}

	public int method12541() {
		return table == null ? 0 : table.numValidArchives;
	}

	public int method12542() {
		return anInt7793;
	}

	public int method12543() {
		return getReferenceTable() == null ? (refTableReq == null ? 0 : refTableReq.getCompletion()) : 100;
	}

	public void method12544() {
		if (dataFile != null) {
			aBool7795 = true;
			if (coll == null)
				coll = new NodeCollection();
		}
	}

	JS5CacheRequest method12546(int i_1, int i_2) {
		Object obj_4 = aClass465_7796.get(i_1);
		if (obj_4 != null && i_2 == 0 && !((JS5CacheRequest) obj_4).highPriority && ((JS5CacheRequest) obj_4).waiting) {
			((JS5CacheRequest) obj_4).unlink();
			obj_4 = null;
		}
		if (obj_4 == null) {
			if (i_2 == 0) {
				if (dataFile != null && aByteArray7792[i_1] != -1)
					obj_4 = localRequester.method5578(i_1, dataFile);
				else {
					if (standardRequester.priorityUnavailable())
						return null;
					obj_4 = standardRequester.request(indexId, i_1, (byte) 2, true);
				}
			} else if (i_2 == 1) {
				if (dataFile == null)
					throw new RuntimeException();
				obj_4 = localRequester.method5567(i_1, dataFile);
			} else {
				if ((i_2 != 2) || (dataFile == null) || (aByteArray7792[i_1] != -1))
					throw new RuntimeException();
				if (standardRequester.extraUnavailable())
					return null;
				obj_4 = standardRequester.request(indexId, i_1, (byte) 2, false);
			}
			aClass465_7796.put((Node) obj_4, i_1);
		}
		if (((JS5CacheRequest) obj_4).waiting)
			return null;
		byte[] bytes_5 = ((JS5CacheRequest) obj_4).getData();
		byte[] bytes_8;
		if (obj_4 instanceof CacheableNode_Sub11_Sub2)
			try {
				if (bytes_5 != null && bytes_5.length > 2) {
					aCRC32_7804.reset();
					aCRC32_7804.update(bytes_5, 0, bytes_5.length - 2);
					int i_7 = (int) aCRC32_7804.getValue();
					if (i_7 != table.crcs[i_1])
						throw new RuntimeException();
					else {
						if (table.whirlpool != null && table.whirlpool[i_1] != null) {
							bytes_8 = table.whirlpool[i_1];
							byte[] bytes_9 = Class361.getWhirlpool(bytes_5, 0, bytes_5.length - 2);
							for (int i_10 = 0; i_10 < 64; i_10++)
								if (bytes_9[i_10] != bytes_8[i_10])
									throw new RuntimeException();
						}
						int i_11 = (bytes_5[bytes_5.length - 1] & 0xff) + ((bytes_5[bytes_5.length - 2] & 0xff) << 8);
						if (i_11 != (table.versions[i_1] & 0xffff))
							throw new RuntimeException();
						else {
							if (aByteArray7792[i_1] != 1) {
								byte b_10000 = aByteArray7792[i_1];
								++anInt7793;
								aByteArray7792[i_1] = 1;
							}
							if (!((JS5CacheRequest) obj_4).highPriority)
								((JS5CacheRequest) obj_4).unlink();
							return (JS5CacheRequest) obj_4;
						}
					}
				} else
					throw new RuntimeException();
			} catch (Exception exception_15) {
				aByteArray7792[i_1] = -1;
				((JS5CacheRequest) obj_4).unlink();
				if (((JS5CacheRequest) obj_4).highPriority && !standardRequester.priorityUnavailable()) {
					PaddedJS5Request class282_sub50_sub11_sub1_16 = standardRequester.request(indexId, i_1, (byte) 2, true);
					aClass465_7796.put(class282_sub50_sub11_sub1_16, i_1);
				}
				return null;
			}
		else if (bytes_5 != null && bytes_5.length > 2) {
			aCRC32_7804.reset();
			aCRC32_7804.update(bytes_5, 0, bytes_5.length - 2);
			int i_13 = (int) aCRC32_7804.getValue();
			if (i_13 != table.crcs[i_1])
				throw new RuntimeException();
			else {
				if (table.whirlpool != null && table.whirlpool[i_1] != null) {
					byte[] bytes_12 = table.whirlpool[i_1];
					bytes_8 = Class361.getWhirlpool(bytes_5, 0, bytes_5.length - 2);
					for (int i_14 = 0; i_14 < 64; i_14++)
						if (bytes_8[i_14] != bytes_12[i_14])
							throw new RuntimeException();
				}
				standardRequester.anInt3657 = 0;
				standardRequester.anInt3650 = 0;
				bytes_5[bytes_5.length - 2] = (byte) (table.versions[i_1] >>> 8);
				bytes_5[bytes_5.length - 1] = (byte) table.versions[i_1];
				if (dataFile != null) {
					localRequester.method5564(i_1, bytes_5, dataFile);
					if (aByteArray7792[i_1] != 1) {
						++anInt7793;
						aByteArray7792[i_1] = 1;
					}
				}
				if (!((JS5CacheRequest) obj_4).highPriority)
					((JS5CacheRequest) obj_4).unlink();
				return (JS5CacheRequest) obj_4;
			}
		} else
			throw new RuntimeException();
	}

	void method12552() {
		if (coll != null) {
			if (getReferenceTable() == null)
				return;
			Node node_3;
			int i_4;
			boolean bool_5;
			if (hasDataFile) {
				bool_5 = true;
				for (node_3 = coll.head(); node_3 != null; node_3 = coll.next()) {
					i_4 = (int) node_3.pointer;
					if (aByteArray7792[i_4] == 0)
						method12546(i_4, 1);
					if (aByteArray7792[i_4] != 0)
						node_3.unlink();
					else
						bool_5 = false;
				}
				while (anInt7797 * 1482915297 < table.validFileIdSizes.length) {
					if (table.validFileIdSizes[anInt7797 * 1482915297] != 0) {
						if (localRequester.anInt3662 >= 250) {
							bool_5 = false;
							break;
						}
						if (aByteArray7792[anInt7797 * 1482915297] == 0)
							method12546(anInt7797 * 1482915297, 1);
						if (aByteArray7792[anInt7797 * 1482915297] == 0) {
							node_3 = new Node();
							node_3.pointer = anInt7797 * 1482915297L;
							coll.append(node_3);
							bool_5 = false;
						}
					}
					anInt7797 += -1503033823;
				}
				if (bool_5) {
					hasDataFile = false;
					anInt7797 = 0;
				}
			} else if (aBool7795) {
				bool_5 = true;
				for (node_3 = coll.head(); node_3 != null; node_3 = coll.next()) {
					i_4 = (int) node_3.pointer;
					if (aByteArray7792[i_4] != 1)
						method12546(i_4, 2);
					if (aByteArray7792[i_4] == 1)
						node_3.unlink();
					else
						bool_5 = false;
				}
				while (anInt7797 * 1482915297 < table.validFileIdSizes.length) {
					if (table.validFileIdSizes[anInt7797 * 1482915297] != 0) {
						if (standardRequester.extraUnavailable()) {
							bool_5 = false;
							break;
						}
						if (aByteArray7792[anInt7797 * 1482915297] != 1)
							method12546(anInt7797 * 1482915297, 2);
						if (aByteArray7792[anInt7797 * 1482915297] != 1) {
							node_3 = new Node();
							node_3.pointer = anInt7797 * 1482915297L;
							coll.append(node_3);
							bool_5 = false;
						}
					}
					anInt7797 += -1503033823;
				}
				if (bool_5) {
					aBool7795 = false;
					anInt7797 = 0;
				}
			} else
				coll = null;
		}
		if (aBool7801 && Utils.time() >= aLong7785) {
			for (JS5CacheRequest js5cacherequest_2 = (JS5CacheRequest) aClass465_7796.method7750(); js5cacherequest_2 != null; js5cacherequest_2 = (JS5CacheRequest) aClass465_7796.method7751())
				if (!js5cacherequest_2.waiting)
					if (js5cacherequest_2.aBool9638) {
						if (!js5cacherequest_2.highPriority)
							throw new RuntimeException();
						js5cacherequest_2.unlink();
					} else
						js5cacherequest_2.aBool9638 = true;
			aLong7785 = Utils.time() + 1000L;
		}
	}

	public int method12559() {
		if (table == null)
			return 0;
		if (!hasDataFile)
			return table.numValidArchives;
		else {
			Node node_2 = coll.head();
			return node_2 == null ? 0 : (int) node_2.pointer;
		}
	}

	@Override
	byte[] method5804(int i_1) {
		JS5CacheRequest js5cacherequest_3 = method12546(i_1, 0);
		if (js5cacherequest_3 == null)
			return null;
		byte[] bytes_4 = js5cacherequest_3.getData();
		js5cacherequest_3.unlink();
		return bytes_4;
	}

	@Override
	void method5805(int i_1) {
		if (dataFile != null) {
			Node node_3;
			for (node_3 = aClass482_7807.head(); node_3 != null; node_3 = aClass482_7807.next())
				if (node_3.pointer == i_1)
					return;
			node_3 = new Node();
			node_3.pointer = i_1;
			aClass482_7807.append(node_3);
		}
	}

	@Override
	int method5806(int i_1) {
		JS5CacheRequest js5cacherequest_3 = (JS5CacheRequest) aClass465_7796.get(i_1);
		return js5cacherequest_3 != null ? js5cacherequest_3.getCompletion() : 0;
	}

	@Override
	ReferenceTable method5807() {
		if (table != null)
			return table;
		if (refTableReq == null) {
			if (standardRequester.priorityUnavailable())
				return null;
			refTableReq = standardRequester.request(255, 737076305 * indexId * -507714383, (byte) 0, true);
		}
		if (refTableReq.waiting)
			return null;
		else {
			byte[] bytes_1 = refTableReq.getData();
			if (refTableReq instanceof CacheableNode_Sub11_Sub2) {
				if (bytes_1 == null)
					throw new RuntimeException();
				table = new ReferenceTable(bytes_1, -1197578581 * tableCRC * -903977981, tableDigest);
				if (1502635595 * table.revision * -1817791645 != -1803818645 * tableRevision * -794625213)
					throw new RuntimeException();
			} else {
				if (bytes_1 == null)
					throw new RuntimeException();
				table = new ReferenceTable(bytes_1, tableCRC * -903977981 * -1197578581, tableDigest);
				if (refsFile != null)
					localRequester.method5564(indexId * -507714383 * 737076305, bytes_1, refsFile);
			}
			refTableReq = null;
			if (dataFile != null) {
				aByteArray7792 = new byte[table.archiveCount * -1799178585 * 1563136279];
				anInt7793 = 0;
			}
			return table;
		}
	}

	@Override
	void method5808(int i_1) {
		if (dataFile != null) {
			Node node_2;
			for (node_2 = aClass482_7807.head(); node_2 != null; node_2 = aClass482_7807.next())
				if (-3442165056282524525L * node_2.pointer * -1253863389874800229L == i_1)
					return;
			node_2 = new Node();
			node_2.pointer = i_1 * -1253863389874800229L * -3442165056282524525L;
			aClass482_7807.append(node_2);
		}
	}

	@Override
	byte[] method5809(int i_1) {
		JS5CacheRequest js5cacherequest_2 = method12546(i_1, 0);
		if (js5cacherequest_2 == null)
			return null;
		byte[] bytes_3 = js5cacherequest_2.getData();
		js5cacherequest_2.unlink();
		return bytes_3;
	}

	@Override
	int method5810(int i_1) {
		JS5CacheRequest js5cacherequest_2 = (JS5CacheRequest) aClass465_7796.get(i_1);
		return js5cacherequest_2 != null ? js5cacherequest_2.getCompletion() : 0;
	}

	@Override
	byte[] method5811(int i_1) {
		JS5CacheRequest js5cacherequest_2 = method12546(i_1, 0);
		if (js5cacherequest_2 == null)
			return null;
		byte[] bytes_3 = js5cacherequest_2.getData();
		js5cacherequest_2.unlink();
		return bytes_3;
	}

	@Override
	void method5812(int i_1) {
		if (dataFile != null) {
			Node node_2;
			for (node_2 = aClass482_7807.head(); node_2 != null; node_2 = aClass482_7807.next())
				if (-3442165056282524525L * node_2.pointer * -1253863389874800229L == i_1)
					return;
			node_2 = new Node();
			node_2.pointer = i_1 * -1253863389874800229L * -3442165056282524525L;
			aClass482_7807.append(node_2);
		}
	}

	@Override
	byte[] method5813(int i_1) {
		JS5CacheRequest js5cacherequest_2 = method12546(i_1, 0);
		if (js5cacherequest_2 == null)
			return null;
		byte[] bytes_3 = js5cacherequest_2.getData();
		js5cacherequest_2.unlink();
		return bytes_3;
	}

	void processCheck() {
		if (coll != null && getReferenceTable() != null)
			for (Node node_2 = aClass482_7807.head(); node_2 != null; node_2 = aClass482_7807.next()) {
				int i_3 = (int) node_2.pointer;
				if (i_3 >= 0 && i_3 < table.archiveCount && table.validFileIdSizes[i_3] != 0) {
					if (aByteArray7792[i_3] == 0)
						method12546(i_3, 1);
					if (aByteArray7792[i_3] == -1)
						method12546(i_3, 2);
					if (aByteArray7792[i_3] == 1)
						node_2.unlink();
				} else
					node_2.unlink();
			}
	}
}
