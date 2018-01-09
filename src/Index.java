/* Class317 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Index {
	static final int anInt3681 = 0;
	Object[] anObjectArray3682;
	int anInt3683;
	static Class395 aClass395_3684 = new Class395();
	boolean aBool3685;
	static final int anInt3686 = 0;
	public static final int anInt3687 = 1;
	Object[][] files;
	static int anInt3689;
	Js5FileWorker aClass327_3690;
	public static final int anInt3691 = 2;
	static boolean aBool3692 = false;
	static final int anInt3693 = 1;
	ReferenceTable referenceTable = null;

	public int method5602(int i) {
		if (!method5635((byte) 1))
			throw new IllegalStateException("");
		return (-2006273977 * ((ReferenceTable) ((Index) this).referenceTable).anInt3733);
	}

	synchronized boolean method5603(int i, int i_4_) {
		if (!method5635((byte) 1))
			return false;
		if (i < 0 || i >= (((ReferenceTable) ((Index) this).referenceTable).fileLengths).length || 0 == (((ReferenceTable) ((Index) this).referenceTable).fileLengths[i])) {
			if (aBool3692)
				throw new IllegalArgumentException(Integer.toString(i));
			return false;
		}
		return true;
	}

	synchronized boolean fileExists(int fileId, int archiveId, int i_6_) {
		if (!method5635((byte) 1))
			return false;
		if (fileId < 0 || archiveId < 0 || fileId >= (((ReferenceTable) ((Index) this).referenceTable).fileLengths).length || archiveId >= (((ReferenceTable) ((Index) this).referenceTable).fileLengths[fileId])) {
			if (aBool3692)
				throw new IllegalArgumentException(new StringBuilder().append(fileId).append(" ").append(archiveId).toString());
			return false;
		}
		return true;
	}

	synchronized void method5605(int i, byte i_7_) {
		if (((Index) this).aBool3685)
			((Index) this).anObjectArray3682[i] = ((Index) this).aClass327_3690.method5804(i, 1942118537);
		else
			((Index) this).anObjectArray3682[i] = Class309.method5493(((Index) this).aClass327_3690.method5804(i, 1942118537), false, (byte) 47);
	}

	void method5606(int i, int i_8_) {
		((Index) this).aClass327_3690.method5805(i, 1941193995);
	}

	public byte[] getFile(int fileId, int archiveId, int i_10_) {
		return getFile(fileId, archiveId, null, -1098430914);
	}

	public boolean validFile(String string, int i) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i_11_ = (((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(GraphicalRenderer.method8696(string, -746218156), -1797692054));
		if (i_11_ < 0)
			return false;
		return true;
	}

	public int method5610(String string, int i) {
		if (!method5635((byte) 1))
			return -1;
		string = string.toLowerCase();
		int i_12_ = (((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(GraphicalRenderer.method8696(string, -221631935), -1537354695));
		if (!method5603(i_12_, 16711680))
			return -1;
		return i_12_;
	}

	public synchronized boolean method5612(byte i) {
		if (!method5635((byte) 1))
			return false;
		boolean bool = true;
		for (int i_13_ = 0; i_13_ < (((ReferenceTable) ((Index) this).referenceTable).validArchiveIds).length; i_13_++) {
			int i_14_ = (((ReferenceTable) ((Index) this).referenceTable).validArchiveIds[i_13_]);
			if (null == ((Index) this).anObjectArray3682[i_14_]) {
				method5605(i_14_, (byte) 0);
				if (null == ((Index) this).anObjectArray3682[i_14_])
					bool = false;
			}
		}
		return bool;
	}

	synchronized int method5613(int i, byte i_15_) {
		if (!method5603(i, 16711680))
			return 0;
		if (((Index) this).anObjectArray3682[i] != null)
			return 100;
		return ((Index) this).aClass327_3690.method5806(i, (byte) 49);
	}

	public synchronized int method5614(int i) {
		if (!method5635((byte) 1))
			return 0;
		int i_16_ = 0;
		int i_17_ = 0;
		for (int i_18_ = 0; i_18_ < ((Index) this).anObjectArray3682.length; i_18_++) {
			if ((((ReferenceTable) ((Index) this).referenceTable).fileCounts[i_18_]) > 0) {
				i_16_ += 100;
				i_17_ += method5613(i_18_, (byte) -93);
			}
		}
		if (0 == i_16_)
			return 100;
		int i_19_ = 100 * i_17_ / i_16_;
		return i_19_;
	}

	public synchronized byte[] method5615(int i, int i_20_) {
		if (!method5635((byte) 1))
			return null;
		if (((ReferenceTable) ((Index) this).referenceTable).fileLengths.length == 1)
			return getFile(0, i, -1610063782);
		if (!method5603(i, 16711680))
			return null;
		if (1 == ((ReferenceTable) ((Index) this).referenceTable).fileLengths[i])
			return getFile(i, 0, -2077891857);
		throw new RuntimeException();
	}

	public synchronized int[] method5616(int i, int i_21_) {
		if (!method5603(i, 16711680))
			return null;
		int[] is = (((ReferenceTable) ((Index) this).referenceTable).archiveFiles[i]);
		if (null == is) {
			is = new int[(((ReferenceTable) ((Index) this).referenceTable).fileCounts[i])];
			for (int i_22_ = 0; i_22_ < is.length; i_22_++)
				is[i_22_] = i_22_;
		}
		return is;
	}

	public int containersCount(int i) {
		if (!method5635((byte) 1))
			return -1;
		return (((ReferenceTable) ((Index) this).referenceTable).fileLengths).length;
	}

	public synchronized void method5619(int i, int i_23_) {
		if (method5603(i, 16711680)) {
			if (null != ((Index) this).files)
				((Index) this).files[i] = null;
		}
	}

	public int method5623(int i, byte i_26_) {
		if (!method5635((byte) 1))
			return -1;
		int i_27_ = ((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(i, -1675109701);
		if (!method5603(i_27_, 16711680))
			return -1;
		return i_27_;
	}

	public int filesCount(int i, int i_28_) {
		if (!method5603(i, 16711680))
			return 0;
		return ((ReferenceTable) ((Index) this).referenceTable).fileLengths[i];
	}

	public boolean method5625(String string, String string_29_, byte i) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_29_ = string_29_.toLowerCase();
		int i_30_ = (((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(GraphicalRenderer.method8696(string, -1816008366), -1883190493));
		if (i_30_ < 0)
			return false;
		int i_31_ = (((ReferenceTable) ((Index) this).referenceTable).namedFiles[i_30_].method865(GraphicalRenderer.method8696(string_29_, -92083175), -1658700496));
		if (i_31_ < 0)
			return false;
		return true;
	}

	public synchronized byte[] method5626(String string, String string_32_, byte i) {
		if (!method5635((byte) 1))
			return null;
		string = string.toLowerCase();
		string_32_ = string_32_.toLowerCase();
		int i_33_ = (((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(GraphicalRenderer.method8696(string, -1702952082), -1918848832));
		if (!method5603(i_33_, 16711680))
			return null;
		int i_34_ = (((ReferenceTable) ((Index) this).referenceTable).namedFiles[i_33_].method865(GraphicalRenderer.method8696(string_32_, -1819598468), -1926581994));
		return getFile(i_33_, i_34_, -1552378572);
	}

	boolean method5627(String string, String string_35_, byte i) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		string_35_ = string_35_.toLowerCase();
		int i_36_ = (((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(GraphicalRenderer.method8696(string, 639316649), -1994003594));
		if (!method5603(i_36_, 16711680))
			return false;
		int i_37_ = (((ReferenceTable) ((Index) this).referenceTable).namedFiles[i_36_].method865(GraphicalRenderer.method8696(string_35_, -316679725), -1542672707));
		return load(i_36_, i_37_, 16711935);
	}

	public boolean method5628(String string, int i) {
		int i_38_ = method5610("", -200916633);
		if (-1 != i_38_)
			return method5627("", string, (byte) -29);
		return method5627(string, "", (byte) 31);
	}

	public boolean method5629(String string, int i) {
		if (!method5635((byte) 1))
			return false;
		string = string.toLowerCase();
		int i_39_ = (((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(GraphicalRenderer.method8696(string, -1032103959), -2031296285));
		return method5647(i_39_, -2119577317);
	}

	public void method5630(String string, int i) {
		if (method5635((byte) 1)) {
			string = string.toLowerCase();
			int i_40_ = (((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(GraphicalRenderer.method8696(string, 320473901), -2076023188));
			method5606(i_40_, 831904871);
		}
	}

	public int method5631(String string, byte i) {
		if (!method5635((byte) 1))
			return 0;
		string = string.toLowerCase();
		int i_41_ = (((ReferenceTable) ((Index) this).referenceTable).archiveName.method865(GraphicalRenderer.method8696(string, -1627018596), -1645709178));
		return method5613(i_41_, (byte) -6);
	}

	static {
		anInt3689 = 0;
	}

	synchronized boolean method5635(byte i) {
		if (((Index) this).referenceTable == null) {
			((Index) this).referenceTable = ((Index) this).aClass327_3690.getReferenceTable(-860118856);
			if (((Index) this).referenceTable == null)
				return false;
			((Index) this).anObjectArray3682 = new Object[(((ReferenceTable) ((Index) this).referenceTable).archiveCount) * 1563136279];
			((Index) this).files = new Object[(((ReferenceTable) ((Index) this).referenceTable).archiveCount) * 1563136279][];
		}
		return true;
	}

	synchronized boolean method5638(int i, int i_45_, int[] is, int i_46_) {
		if (!method5603(i, 16711680))
			return false;
		if (((Index) this).anObjectArray3682[i] == null)
			return false;
		int i_47_ = ((ReferenceTable) ((Index) this).referenceTable).fileCounts[i];
		int[] is_48_ = (((ReferenceTable) ((Index) this).referenceTable).archiveFiles[i]);
		if (null == ((Index) this).files[i])
			((Index) this).files[i] = new Object[(((ReferenceTable) ((Index) this).referenceTable).fileLengths[i])];
		Object[] objects = ((Index) this).files[i];
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
			is_51_ = Class346.toByteArray(((Index) this).anObjectArray3682[i], true, (byte) 1);
			RsByteBuffer class282_sub35 = new RsByteBuffer(is_51_);
			class282_sub35.method13249(is, 5, class282_sub35.buffer.length, -429400691);
		} else
			is_51_ = Class346.toByteArray(((Index) this).anObjectArray3682[i], false, (byte) 1);
		byte[] is_52_;
		try {
			is_52_ = Class282_Sub17_Sub6.method15438(is_51_, (byte) 43);
		} catch (RuntimeException runtimeexception) {
			throw Class150.method2585(runtimeexception, new StringBuilder().append(null != is).append(" ").append(i).append(" ").append(is_51_.length).append(" ").append(Class285.method5028(is_51_, is_51_.length, (short) 255)).append(" ").append(Class285.method5028(is_51_, is_51_.length - 2, (short) 255)).append(" ").append(((ReferenceTable) ((Index) this).referenceTable).unknown[i]).append(" ").append(-2006273977 * (((ReferenceTable) ((Index) this).referenceTable).anInt3733)).toString());
		}
		if (((Index) this).aBool3685)
			((Index) this).anObjectArray3682[i] = null;
		if (i_47_ > 1) {
			if (1067739717 * ((Index) this).anInt3683 != 2) {
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
					if (((Index) this).anInt3683 * 1067739717 == 0)
						objects[i_66_] = Class309.method5493(is_59_[i_65_], false, (byte) 5);
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
			if (0 == 1067739717 * ((Index) this).anInt3683)
				objects[i_81_] = Class309.method5493(is_52_, false, (byte) 109);
			else
				objects[i_81_] = is_52_;
		}
		return true;
	}

	public synchronized byte[] getFile(int fileId, int archiveId, int[] xteas, int i_85_) {
		if (!fileExists(fileId, archiveId, -1834383347))
			return null;
		byte[] data = null;
		if (((Index) this).files[fileId] == null || null == ((Index) this).files[fileId][archiveId]) {
			boolean bool = method5638(fileId, archiveId, xteas, 2068142986);
			if (!bool) {
				method5605(fileId, (byte) 0);
				bool = method5638(fileId, archiveId, xteas, 382040238);
				if (!bool)
					return null;
			}
		}
		if (null == ((Index) this).files[fileId])
			throw new RuntimeException("");
		if (null != ((Index) this).files[fileId][archiveId]) {
			data = Class346.toByteArray((((Index) this).files[fileId][archiveId]), false, (byte) 1);
			if (data == null)
				throw new RuntimeException("");
		}
		if (data != null) {
			if (1 == ((Index) this).anInt3683 * 1067739717) {
				((Index) this).files[fileId][archiveId] = null;
				if (1 == (((ReferenceTable) ((Index) this).referenceTable).fileLengths[fileId]))
					((Index) this).files[fileId] = null;
			} else if (((Index) this).anInt3683 * 1067739717 == 2)
				((Index) this).files[fileId] = null;
		}
		return data;
	}

	public synchronized boolean method5647(int i, int i_127_) {
		if (!method5603(i, 16711680))
			return false;
		if (null != ((Index) this).anObjectArray3682[i])
			return true;
		method5605(i, (byte) 0);
		if (null != ((Index) this).anObjectArray3682[i])
			return true;
		return false;
	}

	public synchronized boolean method5661(int i, int i_136_) {
		if (!method5635((byte) 1))
			return false;
		if (1 == (((ReferenceTable) ((Index) this).referenceTable).fileLengths).length)
			return load(0, i, 16711935);
		if (!method5603(i, 16711680))
			return false;
		if (((ReferenceTable) ((Index) this).referenceTable).fileLengths[i] == 1)
			return load(i, 0, 16711935);
		throw new RuntimeException();
	}

	public Index(Js5FileWorker class327, boolean bool, int i) {
		if (i < 0 || i > 2)
			throw new IllegalArgumentException("");
		((Index) this).aClass327_3690 = class327;
		((Index) this).aBool3685 = bool;
		((Index) this).anInt3683 = i * -1279321971;
	}

	public void method5676(boolean bool, boolean bool_148_, byte i) {
		if (method5635((byte) 1)) {
			if (bool) {
				((ReferenceTable) ((Index) this).referenceTable).nameHashes = null;
				((ReferenceTable) ((Index) this).referenceTable).archiveName = null;
			}
			if (bool_148_) {
				((ReferenceTable) ((Index) this).referenceTable).fileNameHashes = null;
				((ReferenceTable) ((Index) this).referenceTable).namedFiles = null;
			}
		}
	}

	public synchronized boolean load(int archiveId, int fileId, int i_155_) {
		if (!fileExists(archiveId, fileId, -1834383347))
			return false;
		if (((Index) this).files[archiveId] != null && ((Index) this).files[archiveId][fileId] != null)
			return true;
		if (((Index) this).anObjectArray3682[archiveId] != null)
			return true;
		method5605(archiveId, (byte) 0);
		if (null != ((Index) this).anObjectArray3682[archiveId])
			return true;
		return false;
	}
	
	static final void method5691(CS2Executor class527, byte i) {
		String string = (String) (((CS2Executor) class527).objectStack[(((CS2Executor) class527).anInt7000 -= 1476624725) * 1806726141]);
		int i_164_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class282_Sub20_Sub36.method15419(string, 1 == i_164_, -940793702);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = 560339485 * Class415.anInt4985;
	}

	static final void method5692(CS2Executor class527, int i) {
		Class518.method11148(((Class521_Sub1) ((CS2Executor) class527).anInterface12_7013), (((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537)]), -253954252);
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[0];
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[1];
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = (int) client.aFloatArray7292[2];
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

	public static Class118 method5694(int i, int i_170_, int i_171_) {
		Class118 class118 = Class117.method1981(i, (byte) 33);
		if (-1 == i_170_)
			return class118;
		if (class118 == null || class118.aClass118Array1438 == null || i_170_ >= class118.aClass118Array1438.length)
			return null;
		return class118.aClass118Array1438[i_170_];
	}

	static final void method5695(CS2Executor class527, byte i) {
		int i_172_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		if (client.anInt7434 * 1609086245 == 2 && i_172_ < 493536965 * client.anInt7449)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 1017482937 * client.aClass6Array7452[i_172_].anInt39;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
	}

	static final void method5696(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 425673003;
		Class153.method2618((((CS2Executor) class527).intStack[1942118537 * ((CS2Executor) class527).anInt7012]), (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 * 1942118537 + 1)]), (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 * 1942118537 + 2)]), 255, 256, 1363502239);
	}
}
