package com.jagex;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class301 implements Interface41 {

	static int anInt3555;

	public static int anInt3556;

	boolean aBool3554;

	String aString3553;

	public Class445 method230() {
		return Class445.aClass445_5383;
	}

	public Class445 method235() {
		return Class445.aClass445_5383;
	}

	public int method231() {
		if (this.aBool3554) {
			return 100;
		} else {
			int i_1 = IndexLoaders.NATIVE_LIBRARY_LOADER.method4648(this.aString3553, 2070008290);
			if (i_1 >= 0 && i_1 <= 100) {
				return i_1;
			} else {
				this.aBool3554 = true;
				return 100;
			}
		}
	}

	public Class445 method232() {
		return Class445.aClass445_5383;
	}

	public Class445 method233() {
		return Class445.aClass445_5383;
	}

	public Class445 method234() {
		return Class445.aClass445_5383;
	}

	boolean method5328(byte b_1) {
		return this.aBool3554;
	}

	public int getCompletion() {
		if (this.aBool3554) {
			return 100;
		} else {
			int i_2 = IndexLoaders.NATIVE_LIBRARY_LOADER.method4648(this.aString3553, -419242357);
			if (i_2 >= 0 && i_2 <= 100) {
				return i_2;
			} else {
				this.aBool3554 = true;
				return 100;
			}
		}
	}

	Class301(String string_1) {
		this.aString3553 = string_1;
	}

	public static Class283 method5331(Index index_0, String string_1, boolean bool_2) {
		int i_4 = index_0.getArchiveId(string_1);
		if (i_4 == -1) {
			return new Class283(0);
		} else {
			int[] ints_5 = index_0.getValidFileIds(i_4);
			Class283 class283_6 = new Class283(ints_5.length);
			int i_7 = 0;
			int i_8 = 0;
			while (true) {
				while (i_7 < class283_6.anInt3382) {
					RsByteBuffer rsbytebuffer_9 = new RsByteBuffer(index_0.getFile(i_4, ints_5[i_8++]));
					int i_10 = rsbytebuffer_9.readInt();
					int i_11 = rsbytebuffer_9.readUnsignedShort();
					int i_12 = rsbytebuffer_9.readUnsignedByte();
					if (!bool_2 && i_12 == 1) {
						--class283_6.anInt3382;
					} else {
						class283_6.anIntArray3381[i_7] = i_10;
						class283_6.anIntArray3383[i_7] = i_11;
						++i_7;
					}
				}
				return class283_6;
			}
		}
	}

	static void method5333() {
		if (Class179.anInt2221 < 102) {
			Class179.anInt2221 += 6;
		}
		int i_1;
		if (Class179.anInt2231 != -1 && Class179.aLong2232 < Utils.time()) {
			for (i_1 = Class179.anInt2231; i_1 < Class276.aStringArray3345.length; i_1++) {
				if (Class276.aStringArray3345[i_1].startsWith("pause")) {
					int i_2 = 5;
					try {
						i_2 = Integer.parseInt(Class276.aStringArray3345[i_1].substring(6));
					} catch (Exception exception_12) {
						;
					}
					Class209.printConsoleMessage("Pausing for " + i_2 + " seconds...");
					Class179.anInt2231 = i_1 + 1;
					Class179.aLong2232 = Utils.time() + (long) (i_2 * 1000);
					return;
				}
				Class179.aString2225 = Class276.aStringArray3345[i_1];
				Class165.method2853(false, -1814369538);
			}
			Class179.anInt2231 = -1;
		}
		if (client.anInt7191 != 0) {
			Class179.anInt2223 -= client.anInt7191 * 5;
			if (Class179.anInt2223 >= Class179.anInt2227) {
				Class179.anInt2223 = Class179.anInt2227 - 1;
			}
			if (Class179.anInt2223 < 0) {
				Class179.anInt2223 = 0;
			}
			client.anInt7191 = 0;
		}
		for (i_1 = 0; i_1 < client.anInt7193; i_1++) {
			KeyRecord interface16_9 = client.KEYS_PRESSED[i_1];
			int i_10 = interface16_9.getCode();
			char var_4 = interface16_9.getCharacter();
			int i_5 = interface16_9.getFlags();
			if (i_10 == 84) {
				Class165.method2853(false, -2060132011);
			}
			if (i_10 == 80) {
				Class165.method2853(true, -719504830);
			} else if (i_10 == 66 && (i_5 & 0x4) != 0) {
				if (Class182.aClipboard2263 != null) {
					String str_14 = "";
					for (int i_7 = Class13.aStringArray129.length - 1; i_7 >= 0; --i_7) {
						if (Class13.aStringArray129[i_7] != null && Class13.aStringArray129[i_7].length() > 0) {
							str_14 = str_14 + Class13.aStringArray129[i_7] + '\n';
						}
					}
					Class182.aClipboard2263.setContents(new StringSelection(str_14), (ClipboardOwner) null);
				}
			} else if (i_10 == 67 && (i_5 & 0x4) != 0) {
				if (Class182.aClipboard2263 != null) {
					try {
						Transferable transferable_6 = Class182.aClipboard2263.getContents((Object) null);
						if (transferable_6 != null) {
							String string_11 = (String) transferable_6.getTransferData(DataFlavor.stringFlavor);
							if (string_11 != null) {
								String[] arr_8 = MovingAnimation.method12681(string_11, '\n');
								Class341.method6074(arr_8, 1068148827);
							}
						}
					} catch (Exception exception_13) {
						;
					}
				}
			} else if (i_10 == 85 && Class179.anInt2220 > 0) {
				Class179.aString2225 = Class179.aString2225.substring(0, Class179.anInt2220 - 1) + Class179.aString2225.substring(Class179.anInt2220);
				--Class179.anInt2220;
			} else if (i_10 == 101 && Class179.anInt2220 < Class179.aString2225.length()) {
				Class179.aString2225 = Class179.aString2225.substring(0, Class179.anInt2220) + Class179.aString2225.substring(Class179.anInt2220 + 1);
			} else if (i_10 == 96 && Class179.anInt2220 > 0) {
				--Class179.anInt2220;
			} else if (i_10 == 97 && Class179.anInt2220 < Class179.aString2225.length()) {
				++Class179.anInt2220;
			} else if (i_10 == 102) {
				Class179.anInt2220 = 0;
			} else if (i_10 == 103) {
				Class179.anInt2220 = Class179.aString2225.length();
			} else if (i_10 == 104 && Class179.anInt2226 < Class13.aStringArray129.length) {
				++Class179.anInt2226;
				Class534.method11441((byte) -63);
				Class179.anInt2220 = Class179.aString2225.length();
			} else if (i_10 == 105 && Class179.anInt2226 > 0) {
				--Class179.anInt2226;
				Class534.method11441((byte) -128);
				Class179.anInt2220 = Class179.aString2225.length();
			} else if (Class380.method6450(var_4, -803297917) || "\\/.:, _-+[]~@".indexOf(var_4) != -1) {
				Class179.aString2225 = Class179.aString2225.substring(0, Class179.anInt2220) + client.KEYS_PRESSED[i_1].getCharacter() + Class179.aString2225.substring(Class179.anInt2220);
				++Class179.anInt2220;
			}
		}
		client.anInt7193 = 0;
		client.maximumHeldKeys = 0;
		Static.method6378();
	}

	static boolean method5334(int i_0, int i_1, int i_2) {
		return i_1 >= 1000 && i_0 < 1000 ? true : (i_1 < 1000 && i_0 < 1000 ? (CutsceneAction_Sub4.method13788(i_0, -1087183805) ? true : !CutsceneAction_Sub4.method13788(i_1, -1371032664)) : i_1 >= 1000 && i_0 >= 1000);
	}
}
