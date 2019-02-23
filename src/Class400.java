import java.util.Random;

public class Class400 {

	static int anInt4821;
	static int anInt4822;
	Index aClass317_4817;
	Class402[] aClass402Array4818;
	int anInt4820;

	Class402 method6784(int i_1, int i_2, int i_3) {
		if (this.anInt4820 == -1) {
			return new Class402(false, new Class399[0]);
		} else {
			Class399 class399_4 = new Class399(this.anInt4820, i_1, i_2);
			return new Class402(false, new Class399[] { class399_4 });
		}
	}

	public Class393 method6785(int i_1, int i_2) {
		byte[] bytes_3 = this.aClass317_4817.getFile(i_1, 0);
		Class393 class393_4 = new Class393();
		class393_4.method6743(new RsByteBuffer(bytes_3), -1754311806);
		return class393_4;
	}

	public Class399[] method6786(int i_1, int i_2) {
		if (i_1 >= 0 && i_1 < this.aClass402Array4818.length) {
			Class402 class402_3 = this.aClass402Array4818[i_1];
			if (class402_3.aBool4826 && class402_3.aClass399Array4827.length > 1) {
				int i_4 = this.anInt4820 == -1 ? 0 : 1;
				Random random_5 = new Random();
				Class399[] arr_6 = new Class399[class402_3.aClass399Array4827.length];
				System.arraycopy(class402_3.aClass399Array4827, 0, arr_6, 0, arr_6.length);

				for (int i_7 = i_4; i_7 < arr_6.length; i_7++) {
					int i_8 = Class476.method7931(random_5, arr_6.length - i_4, -871858753) + i_4;
					Class399 class399_9 = class402_3.aClass399Array4827[i_7];
					arr_6[i_7] = arr_6[i_8];
					arr_6[i_8] = class399_9;
				}

				return arr_6;
			} else {
				return class402_3.aClass399Array4827;
			}
		} else {
			return this.method6784(0, 0, 1890158711).aClass399Array4827;
		}
	}

	public boolean method6790(int i_1) {
		return this.anInt4820 != -1;
	}

	public Class400(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_4817 = index_3;
		RsByteBuffer rsbytebuffer_4 = new RsByteBuffer(this.aClass317_4817.getFile(0, 0));
		int i_5 = rsbytebuffer_4.buffer != null && rsbytebuffer_4.buffer.length >= 1 ? rsbytebuffer_4.readUnsignedByte() : -1;
		if (i_5 < 4) {
			this.aClass402Array4818 = new Class402[0];
			this.anInt4820 = -1;
		} else {
			int i_6 = rsbytebuffer_4.readUnsignedByte();
			Class60[] arr_7 = Class112.method1870(-738775405);
			boolean bool_8 = true;
			int i_9;
			int i_10;
			if (arr_7.length != i_6) {
				bool_8 = false;
			} else {
				for (i_9 = 0; i_9 < arr_7.length; i_9++) {
					i_10 = rsbytebuffer_4.readUnsignedByte();
					if (i_10 != arr_7[i_9].anInt611) {
						bool_8 = false;
						break;
					}
				}
			}

			if (bool_8) {
				i_9 = rsbytebuffer_4.readUnsignedByte();
				i_10 = rsbytebuffer_4.readUnsignedByte();
				int i_11;
				int i_12;
				if (i_5 > 2) {
					this.anInt4820 = rsbytebuffer_4.readShort(2041179357);
					i_11 = rsbytebuffer_4.read24BitUnsignedInteger();
					i_12 = rsbytebuffer_4.readUnsignedShort();
				} else {
					this.anInt4820 = -1;
					i_11 = 0;
					i_12 = 0;
				}

				this.aClass402Array4818 = new Class402[i_10 + 1];

				int i_13;
				for (i_13 = 0; i_13 < i_9; i_13++) {
					int i_14 = rsbytebuffer_4.readUnsignedByte();
					boolean bool_15 = rsbytebuffer_4.readUnsignedByte() == 1;
					int i_16 = rsbytebuffer_4.readUnsignedShort();
					Class399[] arr_17;
					int i_18;
					int i_19;
					int i_20;
					int i_21;
					if (this.anInt4820 != -1) {
						arr_17 = new Class399[i_16 + 1];
						arr_17[0] = new Class399(this.anInt4820, i_11, i_12);

						for (i_18 = 0; i_18 < i_16; i_18++) {
							i_19 = rsbytebuffer_4.readUnsignedShort();
							i_20 = rsbytebuffer_4.read24BitUnsignedInteger();
							i_21 = rsbytebuffer_4.readUnsignedShort();
							arr_17[i_18 + 1] = new Class399(i_19, i_20, i_21);
						}
					} else {
						arr_17 = new Class399[i_16];

						for (i_18 = 0; i_18 < i_16; i_18++) {
							i_19 = rsbytebuffer_4.readUnsignedShort();
							i_20 = rsbytebuffer_4.read24BitUnsignedInteger();
							i_21 = rsbytebuffer_4.readUnsignedShort();
							arr_17[i_18] = new Class399(i_19, i_20, i_21);
						}

						this.aClass402Array4818[i_14] = new Class402(bool_15, arr_17);
					}

					this.aClass402Array4818[i_14] = new Class402(bool_15, arr_17);
				}

				for (i_13 = 0; i_13 < i_10 + 1; i_13++) {
					if (this.aClass402Array4818[i_13] == null) {
						this.aClass402Array4818[i_13] = this.method6784(i_11, i_12, 85224376);
					}
				}
			} else {
				this.aClass402Array4818 = new Class402[0];
				this.anInt4820 = -1;
			}
		}

	}

	static String method6793(String string_0, byte b_1) {
		String string_2 = null;
		int i_3 = string_0.indexOf("--> ");
		if (i_3 >= 0) {
			string_2 = string_0.substring(0, i_3 + 4);
			string_0 = string_0.substring(i_3 + 4);
		}

		if (string_0.startsWith("directlogin ")) {
			int i_4 = string_0.indexOf(" ", "directlogin ".length());
			if (i_4 >= 0) {
				int i_5 = string_0.length();
				string_0 = string_0.substring(0, i_4) + " ";

				for (int i_6 = i_4 + 1; i_6 < i_5; i_6++) {
					string_0 = string_0 + "*";
				}
			}
		}

		return string_2 != null ? string_2 + string_0 : string_0;
	}

	static void executeHookInner(HookRequest hookrequest_0, int i_1, byte b_2) {
		Object[] arr_3 = hookrequest_0.params;
		int i_4 = ((Integer) arr_3[0]).intValue();
		CS2Script cs2script_5 = Class286.getCS2Script(i_4);
		if (cs2script_5 != null) {
			CS2Executor cs2executor_6 = Class125.getNextScriptExecutor(-444057050);
			cs2executor_6.intLocals = new int[cs2script_5.intLocalsCount];
			int i_7 = 0;
			cs2executor_6.objectLocals = new String[cs2script_5.stringLocalsCount];
			int i_8 = 0;
			cs2executor_6.longLocals = new long[cs2script_5.longLocalsCount];
			int i_9 = 0;

			for (int i_10 = 1; i_10 < arr_3.length; i_10++) {
				if (arr_3[i_10] instanceof Integer) {
					int i_11 = ((Integer) arr_3[i_10]).intValue();
					if (i_11 == -2147483647) {
						i_11 = hookrequest_0.anInt8059;
					}

					if (i_11 == -2147483646) {
						i_11 = hookrequest_0.anInt8055;
					}

					if (i_11 == -2147483645) {
						i_11 = hookrequest_0.iComponentDefs != null ? hookrequest_0.iComponentDefs.idHash : -1;
					}

					if (i_11 == -2147483644) {
						i_11 = hookrequest_0.anInt8051;
					}

					if (i_11 == -2147483643) {
						i_11 = hookrequest_0.iComponentDefs != null ? hookrequest_0.iComponentDefs.anInt1288 : -1;
					}

					if (i_11 == -2147483642) {
						i_11 = hookrequest_0.aClass118_8057 != null ? hookrequest_0.aClass118_8057.idHash : -1;
					}

					if (i_11 == -2147483641) {
						i_11 = hookrequest_0.aClass118_8057 != null ? hookrequest_0.aClass118_8057.anInt1288 : -1;
					}

					if (i_11 == -2147483640) {
						i_11 = hookrequest_0.anInt8058;
					}

					if (i_11 == -2147483639) {
						i_11 = hookrequest_0.anInt8056;
					}

					cs2executor_6.intLocals[i_7++] = i_11;
				} else if (arr_3[i_10] instanceof String) {
					String string_13 = (String) arr_3[i_10];
					if (string_13.equals("event_opbase")) {
						string_13 = hookrequest_0.opName;
					}

					cs2executor_6.objectLocals[i_8++] = string_13;
				} else if (arr_3[i_10] instanceof Long) {
					long long_14 = ((Long) arr_3[i_10]).longValue();
					cs2executor_6.longLocals[i_9++] = long_14;
				}
			}

			cs2executor_6.anInt7015 = hookrequest_0.anInt8061;
			Class51.method1068(cs2script_5, i_1, cs2executor_6, 564283341);
		}

	}

	static void method6795(int i_0) {
		int i_1 = Class349.anInt4083;
		int i_2 = client.anInt3243 * -969250379;
		if (Class45.anInt434 < i_1) {
			i_1 = Class45.anInt434;
		}

		if (Class107.anInt1082 < i_2) {
			i_2 = Class107.anInt1082;
		}

		try {
			Class361.aClass361_4173.method6256(new Object[] { Integer.valueOf(i_1), Integer.valueOf(i_2), Integer.valueOf(Class158.method2730((short) -17142)), Integer.valueOf(Class393.aClass282_Sub54_4783.aClass468_Sub7_8210.method12666(1852404651)) }, 2140026236);
		} catch (Throwable throwable_4) {
			;
		}

	}

}
