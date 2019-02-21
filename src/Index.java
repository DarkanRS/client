/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Index {
	Object[] anObjectArray3682;
	int anInt3683;
	static Class395 aClass395_3684 = new Class395();
	boolean aBool3685;
	Object[][] files;
	static int anInt3689;
	JS5FileWorker aClass327_3690;
	static boolean aBool3692 = false;
	ReferenceTable referenceTable = null;

	public int getCrc() {
		if (!referenceTableLoaded())
			throw new IllegalStateException("");
		return (-2006273977 * referenceTable.crc);
	}

	synchronized boolean fileExists(int fileId) {
		if (!referenceTableLoaded())
			return false;
		if (fileId < 0 || fileId >= (referenceTable.fileCounts).length || 0 == (referenceTable.fileCounts[fileId])) {
			if (aBool3692)
				throw new IllegalArgumentException(Integer.toString(fileId));
			return false;
		}
		return true;
	}

	synchronized boolean fileExists(int fileId, int archiveId) {
		if (!referenceTableLoaded())
			return false;
		if (fileId < 0 || archiveId < 0 || fileId >= (referenceTable.fileCounts).length || archiveId >= (referenceTable.fileCounts[fileId])) {
			if (aBool3692)
				throw new IllegalArgumentException(new StringBuilder().append(fileId).append(" ").append(archiveId).toString());
			return false;
		}
		return true;
	}

	synchronized void method5605(int i, byte i_7_) {
		if (this.aBool3685)
			this.anObjectArray3682[i] = this.aClass327_3690.method5804(i, 1942118537);
		else
			this.anObjectArray3682[i] = JS5Manager.method5493(this.aClass327_3690.method5804(i, 1942118537), false, (byte) 47);
	}

	void method5606(int i, int i_8_) {
		this.aClass327_3690.method5805(i, 1941193995);
	}

	public byte[] getFile(int archiveId, int fileId) {
		return getFile(archiveId, fileId, null);
	}

	public boolean validFile(String string) {
		if (!referenceTableLoaded())
			return false;
		string = string.toLowerCase();
		int i_11_ = (referenceTable.archiveName.method865(GraphicalRenderer.method8696(string, -746218156), -1797692054));
		if (i_11_ < 0)
			return false;
		return true;
	}

	public int getArchiveId(String string) {
		if (!referenceTableLoaded())
			return -1;
		string = string.toLowerCase();
		int i_12_ = (referenceTable.archiveName.method865(GraphicalRenderer.method8696(string, -221631935), -1537354695));
		if (!fileExists(i_12_))
			return -1;
		return i_12_;
	}

	public synchronized boolean isValid() {
		if (!referenceTableLoaded())
			return false;
		boolean bool = true;
		for (int i = 0; i < (referenceTable.validArchiveIds).length; i++) {
			int archiveId = (referenceTable.validArchiveIds[i]);
			if (null == this.anObjectArray3682[archiveId]) {
				method5605(archiveId, (byte) 0);
				if (null == this.anObjectArray3682[archiveId])
					bool = false;
			}
		}
		return bool;
	}

	synchronized int method5613(int i, byte i_15_) {
		if (!fileExists(i))
			return 0;
		if (this.anObjectArray3682[i] != null)
			return 100;
		return this.aClass327_3690.method5806(i, (byte) 49);
	}

	public synchronized int getCompletion() {
		if (!referenceTableLoaded())
			return 0;
		int i_16_ = 0;
		int i_17_ = 0;
		for (int i_18_ = 0; i_18_ < this.anObjectArray3682.length; i_18_++) {
			if ((referenceTable.validFileIdSizes[i_18_]) > 0) {
				i_16_ += 100;
				i_17_ += method5613(i_18_, (byte) -93);
			}
		}
		if (0 == i_16_)
			return 100;
		int i_19_ = 100 * i_17_ / i_16_;
		return i_19_;
	}

	public synchronized byte[] getFile(int fileId) {
		if (!referenceTableLoaded())
			return null;
		if (referenceTable.fileCounts.length == 1)
			return getFile(0, fileId);
		if (!fileExists(fileId))
			return null;
		if (1 == referenceTable.fileCounts[fileId])
			return getFile(fileId, 0);
		throw new RuntimeException();
	}

	public synchronized int[] getValidFileIds(int archiveId) {
		if (!fileExists(archiveId))
			return null;
		int[] counts = (referenceTable.validFileIds[archiveId]);
		if (null == counts) {
			counts = new int[(referenceTable.validFileIdSizes[archiveId])];
			for (int i = 0; i < counts.length; i++)
				counts[i] = i;
		}
		return counts;
	}

	public int containersCount() {
		if (!referenceTableLoaded())
			return -1;
		return (referenceTable.fileCounts).length;
	}

	public synchronized void method5619(int fileId, int i_23_) {
		if (fileExists(fileId)) {
			if (null != this.files)
				this.files[fileId] = null;
		}
	}

	public int method5623(int i, byte i_26_) {
		if (!referenceTableLoaded())
			return -1;
		int i_27_ = referenceTable.archiveName.method865(i, -1675109701);
		if (!fileExists(i_27_))
			return -1;
		return i_27_;
	}

	public int filesCount(int archiveId) {
		if (!fileExists(archiveId))
			return 0;
		return referenceTable.fileCounts[archiveId];
	}

	public boolean method5625(String string, String string_29_, byte i) {
		if (!referenceTableLoaded())
			return false;
		string = string.toLowerCase();
		string_29_ = string_29_.toLowerCase();
		int i_30_ = (referenceTable.archiveName.method865(GraphicalRenderer.method8696(string, -1816008366), -1883190493));
		if (i_30_ < 0)
			return false;
		int i_31_ = (referenceTable.namedFiles[i_30_].method865(GraphicalRenderer.method8696(string_29_, -92083175), -1658700496));
		if (i_31_ < 0)
			return false;
		return true;
	}

	public synchronized byte[] method5626(String string, String string_32_, byte i) {
		if (!referenceTableLoaded())
			return null;
		string = string.toLowerCase();
		string_32_ = string_32_.toLowerCase();
		int i_33_ = (referenceTable.archiveName.method865(GraphicalRenderer.method8696(string, -1702952082), -1918848832));
		if (!fileExists(i_33_))
			return null;
		int i_34_ = (referenceTable.namedFiles[i_33_].method865(GraphicalRenderer.method8696(string_32_, -1819598468), -1926581994));
		return getFile(i_33_, i_34_);
	}

	boolean method5627(String string, String string_35_, byte i) {
		if (!referenceTableLoaded())
			return false;
		string = string.toLowerCase();
		string_35_ = string_35_.toLowerCase();
		int i_36_ = (referenceTable.archiveName.method865(GraphicalRenderer.method8696(string, 639316649), -1994003594));
		if (!fileExists(i_36_))
			return false;
		int i_37_ = (referenceTable.namedFiles[i_36_].method865(GraphicalRenderer.method8696(string_35_, -316679725), -1542672707));
		return load(i_36_, i_37_, 16711935);
	}

	public boolean method5628(String string, int i) {
		int i_38_ = getArchiveId("");
		if (-1 != i_38_)
			return method5627("", string, (byte) -29);
		return method5627(string, "", (byte) 31);
	}

	public boolean method5629(String string, int i) {
		if (!referenceTableLoaded())
			return false;
		string = string.toLowerCase();
		int i_39_ = (referenceTable.archiveName.method865(GraphicalRenderer.method8696(string, -1032103959), -2031296285));
		return loadFile(i_39_, -2119577317);
	}

	public void method5630(String string, int i) {
		if (referenceTableLoaded()) {
			string = string.toLowerCase();
			int i_40_ = (referenceTable.archiveName.method865(GraphicalRenderer.method8696(string, 320473901), -2076023188));
			method5606(i_40_, 831904871);
		}
	}

	public int method5631(String string, byte i) {
		if (!referenceTableLoaded())
			return 0;
		string = string.toLowerCase();
		int i_41_ = (referenceTable.archiveName.method865(GraphicalRenderer.method8696(string, -1627018596), -1645709178));
		return method5613(i_41_, (byte) -6);
	}

	static {
		anInt3689 = 0;
	}

	synchronized boolean referenceTableLoaded() {
		if (this.referenceTable == null) {
			this.referenceTable = this.aClass327_3690.getReferenceTable(-860118856);
			if (this.referenceTable == null)
				return false;
			this.anObjectArray3682 = new Object[(referenceTable.archiveCount) * 1563136279];
			this.files = new Object[(referenceTable.archiveCount) * 1563136279][];
		}
		return true;
	}
	
	synchronized boolean method5638(int i, int i_45_, int[] is, int i_46_) {
		if (!fileExists(i))
			return false;
		if (this.anObjectArray3682[i] == null)
			return false;
		int i_47_ = referenceTable.validFileIdSizes[i];
		int[] is_48_ = (referenceTable.validFileIds[i]);
		if (null == this.files[i])
			this.files[i] = new Object[(referenceTable.fileCounts[i])];
		Object[] objects = this.files[i];
		boolean bool = true;
		for (int i_49_ = 0; i_49_ < i_47_; i_49_++) {
			int i_50_;
			if (null == is_48_)
				i_50_ = i_49_;
			else
				i_50_ = is_48_[i_49_];
			if (objects[i_50_] == null) {
				bool = false;
				break;
			}
		}
		if (bool)
			return true;
		byte[] is_51_;
		if (null != is && (is[0] != 0 || 0 != is[1] || 0 != is[2] || is[3] != 0)) {
			is_51_ = Class346.method6154(this.anObjectArray3682[i], true, (byte) 1);
			RsByteBuffer class282_sub35 = new RsByteBuffer(is_51_);
			class282_sub35.method13249(is, 5, class282_sub35.buffer.length, -429400691);
		} else
			is_51_ = Class346.method6154(this.anObjectArray3682[i], false, (byte) 1);
		byte[] is_52_;
		try {
			is_52_ = Class282_Sub17_Sub6.method15438(is_51_, (byte) 43);
		} catch (RuntimeException runtimeexception) {
			throw Class150.method2585(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_51_.length).append(" ").append(Class285.getCRC(is_51_, is_51_.length)).append(" ").append(Class285.getCRC(is_51_, is_51_.length - 2)).append(" ").append(referenceTable.unknown[i]).append(" ").append(-2006273977 * (referenceTable.crc)).toString());
		}
		if (this.aBool3685)
			this.anObjectArray3682[i] = null;
		if (i_47_ > 1) {
			if (1067739717 * this.anInt3683 != 2) {
				int i_53_ = is_52_.length;
				int i_54_ = is_52_[--i_53_] & 0xff;
				i_53_ -= i_54_ * i_47_ * 4;
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_52_);
				int[] is_55_ = new int[i_47_];
				class282_sub35.index = i_53_ * -1115476867;
				for (int i_56_ = 0; i_56_ < i_54_; i_56_++) {
					int i_57_ = 0;
					for (int i_58_ = 0; i_58_ < i_47_; i_58_++) {
						i_57_ += class282_sub35.readInt();
						is_55_[i_58_] += i_57_;
					}
				}
				byte[][] is_59_ = new byte[i_47_][];
				for (int i_60_ = 0; i_60_ < i_47_; i_60_++) {
					is_59_[i_60_] = new byte[is_55_[i_60_]];
					is_55_[i_60_] = 0;
				}
				class282_sub35.index = i_53_ * -1115476867;
				int i_61_ = 0;
				for (int i_62_ = 0; i_62_ < i_54_; i_62_++) {
					int i_63_ = 0;
					for (int i_64_ = 0; i_64_ < i_47_; i_64_++) {
						i_63_ += class282_sub35.readInt();
						System.arraycopy(is_52_, i_61_, is_59_[i_64_], is_55_[i_64_], i_63_);
						is_55_[i_64_] += i_63_;
						i_61_ += i_63_;
					}
				}
				for (int i_65_ = 0; i_65_ < i_47_; i_65_++) {
					int i_66_;
					if (is_48_ == null)
						i_66_ = i_65_;
					else
						i_66_ = is_48_[i_65_];
					if (this.anInt3683 * 1067739717 == 0)
						objects[i_66_] = JS5Manager.method5493(is_59_[i_65_], false, (byte) 5);
					else
						objects[i_66_] = is_59_[i_65_];
				}
			} else {
				int i_67_ = is_52_.length;
				int i_68_ = is_52_[--i_67_] & 0xff;
				i_67_ -= 4 * (i_68_ * i_47_);
				RsByteBuffer class282_sub35 = new RsByteBuffer(is_52_);
				int i_69_ = 0;
				int i_70_ = 0;
				class282_sub35.index = i_67_ * -1115476867;
				for (int i_71_ = 0; i_71_ < i_68_; i_71_++) {
					int i_72_ = 0;
					for (int i_73_ = 0; i_73_ < i_47_; i_73_++) {
						i_72_ += class282_sub35.readInt();
						int i_74_;
						if (null == is_48_)
							i_74_ = i_73_;
						else
							i_74_ = is_48_[i_73_];
						if (i_45_ == i_74_) {
							i_69_ += i_72_;
							i_70_ = i_74_;
						}
					}
				}
				if (0 == i_69_)
					return true;
				byte[] is_75_ = new byte[i_69_];
				i_69_ = 0;
				class282_sub35.index = -1115476867 * i_67_;
				int i_76_ = 0;
				for (int i_77_ = 0; i_77_ < i_68_; i_77_++) {
					int i_78_ = 0;
					for (int i_79_ = 0; i_79_ < i_47_; i_79_++) {
						i_78_ += class282_sub35.readInt();
						int i_80_;
						if (is_48_ == null)
							i_80_ = i_79_;
						else
							i_80_ = is_48_[i_79_];
						if (i_80_ == i_45_) {
							System.arraycopy(is_52_, i_76_, is_75_, i_69_, i_78_);
							i_69_ += i_78_;
						}
						i_76_ += i_78_;
					}
				}
				objects[i_70_] = is_75_;
			}
		} else {
			int i_81_;
			if (is_48_ == null)
				i_81_ = 0;
			else
				i_81_ = is_48_[0];
			if (0 == 1067739717 * this.anInt3683)
				objects[i_81_] = JS5Manager.method5493(is_52_, false, (byte) 109);
			else
				objects[i_81_] = is_52_;
		}
		return true;
	}

	public synchronized byte[] getFile(int archiveId, int fileId, int[] xteas) {
		if (!fileExists(archiveId, fileId))
			return null;
		byte[] is_86_ = null;
		if (this.files[archiveId] == null || null == this.files[archiveId][fileId]) {
			boolean bool = method5638(archiveId, fileId, xteas, 2068142986);
			if (!bool) {
				method5605(archiveId, (byte) 0);
				bool = method5638(archiveId, fileId, xteas, 382040238);
				if (!bool)
					return null;
			}
		}
		if (null == this.files[archiveId])
			throw new RuntimeException("");
		if (null != this.files[archiveId][fileId]) {
			is_86_ = Class346.method6154((this.files[archiveId][fileId]), false, (byte) 1);
			if (is_86_ == null)
				throw new RuntimeException("");
		}
		if (is_86_ != null) {
			if (1 == this.anInt3683 * 1067739717) {
				this.files[archiveId][fileId] = null;
				if (1 == (referenceTable.fileCounts[archiveId]))
					this.files[archiveId] = null;
			} else if (this.anInt3683 * 1067739717 == 2)
				this.files[archiveId] = null;
		}
		return is_86_;
	}

	public synchronized boolean loadFile(int i, int i_127_) {
		if (!fileExists(i))
			return false;
		if (null != this.anObjectArray3682[i])
			return true;
		method5605(i, (byte) 0);
		if (null != this.anObjectArray3682[i])
			return true;
		return false;
	}

	public synchronized boolean method5661(int i, int i_136_) {
		if (!referenceTableLoaded())
			return false;
		if (1 == (referenceTable.fileCounts).length)
			return load(0, i, 16711935);
		if (!fileExists(i))
			return false;
		if (referenceTable.fileCounts[i] == 1)
			return load(i, 0, 16711935);
		throw new RuntimeException();
	}

	public Index(JS5FileWorker class327, boolean bool, int i) {
		if (i < 0 || i > 2)
			throw new IllegalArgumentException("");
		this.aClass327_3690 = class327;
		this.aBool3685 = bool;
		this.anInt3683 = i * -1279321971;
	}

	public void method5676(boolean bool, boolean bool_148_, byte i) {
		if (referenceTableLoaded()) {
			if (bool) {
				referenceTable.nameHashes = null;
				referenceTable.archiveName = null;
			}
			if (bool_148_) {
				referenceTable.fileNameHashes = null;
				referenceTable.namedFiles = null;
			}
		}
	}

	public synchronized boolean load(int i, int i_154_, int i_155_) {
		if (!fileExists(i, i_154_))
			return false;
		if (this.files[i] != null && this.files[i][i_154_] != null)
			return true;
		if (this.anObjectArray3682[i] != null)
			return true;
		method5605(i, (byte) 0);
		if (null != this.anObjectArray3682[i])
			return true;
		return false;
	}

	static final void method5691(CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		int i_164_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		Class282_Sub20_Sub36.method15419(string, 1 == i_164_, -940793702);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method5692(CS2Executor class527, int i) {
		AnimationDefinitions.method11148(((Class521_Sub1) class527.anInterface12_7013), (class527.intStack[((class527.intStackPtr -= 141891001) * 1942118537)]), -253954252);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
	}

	public static int method5693(CharSequence charsequence, int i, int i_165_, byte[] is, int i_166_, int i_167_) {
		int i_168_ = i_165_ - i;
		for (int i_169_ = 0; i_169_ < i_168_; i_169_++) {
			char c = charsequence.charAt(i + i_169_);
			if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff')
				is[i_169_ + i_166_] = (byte) c;
			else if ('\u20ac' == c)
				is[i_169_ + i_166_] = (byte) -128;
			else if ('\u201a' == c)
				is[i_166_ + i_169_] = (byte) -126;
			else if ('\u0192' == c)
				is[i_166_ + i_169_] = (byte) -125;
			else if ('\u201e' == c)
				is[i_169_ + i_166_] = (byte) -124;
			else if ('\u2026' == c)
				is[i_166_ + i_169_] = (byte) -123;
			else if (c == '\u2020')
				is[i_166_ + i_169_] = (byte) -122;
			else if (c == '\u2021')
				is[i_169_ + i_166_] = (byte) -121;
			else if ('\u02c6' == c)
				is[i_166_ + i_169_] = (byte) -120;
			else if (c == '\u2030')
				is[i_169_ + i_166_] = (byte) -119;
			else if ('\u0160' == c)
				is[i_169_ + i_166_] = (byte) -118;
			else if ('\u2039' == c)
				is[i_169_ + i_166_] = (byte) -117;
			else if ('\u0152' == c)
				is[i_169_ + i_166_] = (byte) -116;
			else if (c == '\u017d')
				is[i_166_ + i_169_] = (byte) -114;
			else if ('\u2018' == c)
				is[i_169_ + i_166_] = (byte) -111;
			else if ('\u2019' == c)
				is[i_169_ + i_166_] = (byte) -110;
			else if ('\u201c' == c)
				is[i_169_ + i_166_] = (byte) -109;
			else if ('\u201d' == c)
				is[i_166_ + i_169_] = (byte) -108;
			else if ('\u2022' == c)
				is[i_169_ + i_166_] = (byte) -107;
			else if (c == '\u2013')
				is[i_169_ + i_166_] = (byte) -106;
			else if ('\u2014' == c)
				is[i_169_ + i_166_] = (byte) -105;
			else if (c == '\u02dc')
				is[i_166_ + i_169_] = (byte) -104;
			else if ('\u2122' == c)
				is[i_169_ + i_166_] = (byte) -103;
			else if ('\u0161' == c)
				is[i_166_ + i_169_] = (byte) -102;
			else if ('\u203a' == c)
				is[i_166_ + i_169_] = (byte) -101;
			else if ('\u0153' == c)
				is[i_166_ + i_169_] = (byte) -100;
			else if ('\u017e' == c)
				is[i_166_ + i_169_] = (byte) -98;
			else if ('\u0178' == c)
				is[i_166_ + i_169_] = (byte) -97;
			else
				is[i_166_ + i_169_] = (byte) 63;
		}
		return i_168_;
	}

	public static IComponentDefinitions method5694(int i, int i_170_, int i_171_) {
		IComponentDefinitions class118 = Class117.method1981(i, (byte) 33);
		if (-1 == i_170_)
			return class118;
		if (class118 == null || class118.aClass118Array1438 == null || i_170_ >= class118.aClass118Array1438.length)
			return null;
		return class118.aClass118Array1438[i_170_];
	}

	static final void method5695(CS2Executor class527, byte i) {
		int i_172_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (client.anInt7434 * 1609086245 == 2 && i_172_ < 493536965 * client.anInt7449)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 1017482937 * client.aClass6Array7452[i_172_].anInt39;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method5696(CS2Executor class527, int i) {
		class527.intStackPtr -= 425673003;
		Class153.method2618((class527.intStack[1942118537 * class527.intStackPtr]), (class527.intStack[(class527.intStackPtr * 1942118537 + 1)]), (class527.intStack[(class527.intStackPtr * 1942118537 + 2)]), 255, 256, 1363502239);
	}
}
