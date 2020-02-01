package com.jagex;
import jaggl.OpenGL;

public class Class115_Sub2 extends Class115 {

	static boolean $assertionsDisabled = !Class115_Sub2.class.desiredAssertionStatus();
	static int[] anIntArray9417 = new int[2];
	static float[] aFloatArray9427 = new float[16];
	int anInt9423;
	int anInt9435;
	int anInt9424;
	boolean aBool9425;
	int[] anIntArray9426;
	String aString9434;
	String shaderProgram;
	float[] aFloatArray9429;
	float[] aFloatArray9422;
	float[] aFloatArray9431;
	float[] aFloatArray9432;
	int[] anIntArray9433;
	OpenGLShader aClass101_Sub1_9421;
	GraphicalRenderer_Sub2_Sub1 aGraphicalRenderer_Sub2_Sub1_9419;

	void method1928(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 obj_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			if (obj_3 == null) {
				obj_3 = this.aGraphicalRenderer_Sub2_Sub1_9419.anInterface6_8788;
			}

			if (i_2 < this.aGraphicalRenderer_Sub2_Sub1_9419.anInt8825) {
				this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
				this.aGraphicalRenderer_Sub2_Sub1_9419.method14035((Interface30) obj_3);
			} else {
				OpenGL.glActiveTexture(33984 + i_2);
				OpenGL.glBindTexture(((Class319) obj_3).anInt3707, ((Class319) obj_3).anInt3706);
			}

			if (this.anIntArray9433[i_4] != i_2) {
				this.anIntArray9433[i_4] = i_2;
				OpenGL.glUniform1i(i_4, i_2);
			}
		}

	}

	Class115_Sub2(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, Class99 class99_2) {
		this.anInt9423 = 0;
		this.anInt9435 = 0;
		this.anInt9424 = 0;
		this.aBool9425 = false;
		this.anIntArray9426 = new int[13];
		this.aString1245 = class99_2.aString1003;
		StringBuilder programString = new StringBuilder();
		Class121[] arr_4;
		int i_5;
		Class121 class121_6;
		System.out.println("Shader loading:");
		if (class99_2.aString1001 != null) {
			System.out.println(class99_2.aString1001);
			this.shaderName = class99_2.aString1001;
			if (class99_2.aClass121Array1000 != null) {
				arr_4 = class99_2.aClass121Array1000;

				for (i_5 = 0; i_5 < arr_4.length; i_5++) {
					class121_6 = arr_4[i_5];
					programString.append("#define " + class121_6.aString1524 + " " + class121_6.aString1523 + '\n');
				}
			}

			programString.append(new String(class505_sub2_sub1_1.getGLShaderData(this.shaderName)));
			this.aString9434 = programString.toString();
		}

		if (class99_2.aString1002 != null) {
			System.out.println(class99_2.aString1002);
			this.aString1246 = class99_2.aString1002;
			programString.setLength(0);
			if (class99_2.aClass121Array1004 != null) {
				arr_4 = class99_2.aClass121Array1004;

				for (i_5 = 0; i_5 < arr_4.length; i_5++) {
					class121_6 = arr_4[i_5];
					programString.append("#define " + class121_6.aString1524 + " " + class121_6.aString1523 + '\n');
				}
			}

			programString.append(new String(class505_sub2_sub1_1.getGLShaderData(this.aString1246)));
			this.shaderProgram = programString.toString();
		}

		Class503.method8365(this.anIntArray9426, 0, this.anIntArray9426.length, -1);
	}

	int method14671(int i_1, String string_2, String string_3) {
		if (string_2 == null) {
			return 0;
		} else {
			int i_4 = OpenGL.glCreateShader(i_1);
			OpenGL.glShaderSource(i_4, string_2);
			OpenGL.glCompileShader(i_4);
			OpenGL.glGetShaderiv(i_4, 35713, anIntArray9417, 0);
			if (anIntArray9417[0] == 0) {
				OpenGL.glDeleteShader(i_4);
				i_4 = 0;
			}

			return i_4;
		}
	}

	void method1894(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1 && this.aFloatArray9429[i_3] != f_2) {
			this.aFloatArray9429[i_3] = f_2;
			if (class282_sub21_sub1_1.method15457((byte) 94) != Class111.aClass111_1219 && class282_sub21_sub1_1.method15457((byte) 73) != Class111.aClass111_1182) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform1f(i_3, f_2);
		}

	}

	void method1923(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1 && (this.aFloatArray9429[i_4] != f_2 || this.aFloatArray9422[i_4] != f_3)) {
			this.aFloatArray9429[i_4] = f_2;
			this.aFloatArray9422[i_4] = f_3;
			if (class282_sub21_sub1_1.method15457((byte) 21) != Class111.aClass111_1132) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform2f(i_4, f_2, f_3);
		}

	}

	void method1939(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_5 != -1 && (this.aFloatArray9429[i_5] != f_2 || this.aFloatArray9422[i_5] != f_3 || this.aFloatArray9431[i_5] != f_4)) {
			this.aFloatArray9429[i_5] = f_2;
			this.aFloatArray9422[i_5] = f_3;
			this.aFloatArray9431[i_5] = f_4;
			if (class282_sub21_sub1_1.method15457((byte) 99) != Class111.aClass111_1133) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform3f(i_5, f_2, f_3, f_4);
		}

	}

	void method1944(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);
		}

	}

	void method1903(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);
		}

	}

	void method1936(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457((byte) 19) != Class111.aClass111_1168) {
			throw new AssertionError();
		} else {
			int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
			if (i_3 != -1) {
				OpenGL.glUniform2fv(i_3, 4, matrix44arr_2.method6551(aFloatArray9427), 0);
			}

		}
	}

	void method1891(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457((byte) 98) != Class111.aClass111_1150) {
			throw new AssertionError();
		} else {
			int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
			if (i_3 != -1) {
				OpenGL.glUniform4fv(i_3, 4, matrix44arr_2.method6517(aFloatArray9427), 0);
			}

		}
	}

	void method1896(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 obj_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			if (obj_3 == null) {
				obj_3 = this.aGraphicalRenderer_Sub2_Sub1_9419.anInterface6_8788;
			}

			if (i_2 < this.aGraphicalRenderer_Sub2_Sub1_9419.anInt8825) {
				this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
				this.aGraphicalRenderer_Sub2_Sub1_9419.method14035((Interface30) obj_3);
			} else {
				OpenGL.glActiveTexture(i_2 + 33984);
				OpenGL.glBindTexture(((Class319) obj_3).anInt3707, ((Class319) obj_3).anInt3706);
			}

			if (i_2 != this.anIntArray9433[i_4]) {
				this.anIntArray9433[i_4] = i_2;
				OpenGL.glUniform1i(i_4, i_2);
			}
		}

	}

	void method1893(int i_1, float f_2, float f_3, float f_4) {
		OpenGL.glUniform3f(i_1, f_2, f_3, f_4);
	}

	void method1895(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	void method1897(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (this.aFloatArray9429[i_6] != f_2 || this.aFloatArray9422[i_6] != f_3 || this.aFloatArray9431[i_6] != f_4 || this.aFloatArray9432[i_6] != f_5)) {
			this.aFloatArray9429[i_6] = f_2;
			this.aFloatArray9422[i_6] = f_3;
			this.aFloatArray9431[i_6] = f_4;
			this.aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457((byte) 46) != Class111.aClass111_1134) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	void method1905(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform3fv(i_1, 3, matrix44arr_2.method6544(aFloatArray9427), 0);
	}

	void method1906(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform2fv(i_1, 4, matrix44arr_2.method6551(aFloatArray9427), 0);
	}

	void method1900(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform4fv(i_1, 4, matrix44arr_2.method6517(aFloatArray9427), 0);
	}

	void method1927(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457((byte) 94) != Class111.aClass111_1150) {
			throw new AssertionError();
		} else {
			int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
			if (i_3 != -1) {
				OpenGL.glUniform4fv(i_3, 4, matrix44arr_2.method6517(aFloatArray9427), 0);
			}

		}
	}

	void method1938(int i_1, float[] floats_2, int i_3) {
		OpenGL.glUniform4fv(i_1, i_3, floats_2, 0);
	}

	public void finalize() {
		this.method26();
	}

	public void method32() {
		if (this.anInt9423 != 0) {
			this.aGraphicalRenderer_Sub2_Sub1_9419.method15573(this.anInt9423);
			if (this.anInt9435 != 0) {
				this.aGraphicalRenderer_Sub2_Sub1_9419.method15580((long) this.anInt9435);
			}

			if (this.anInt9424 != 0) {
				this.aGraphicalRenderer_Sub2_Sub1_9419.method15580((long) this.anInt9424);
			}

			this.anInt9423 = 0;
			this.anInt9435 = 0;
			this.anInt9424 = 0;
		}

	}

	void method1945(int i_1, int i_2, Interface30 interface30_3) {
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	public boolean method1898() {
		if (this.aBool9425) {
			return true;
		} else {
			this.aGraphicalRenderer_Sub2_Sub1_9419.aClass115_Sub2_10189 = null;
			this.anInt9435 = this.method14671(35633, this.aString9434, this.shaderName);
			this.anInt9424 = this.method14671(35632, this.shaderProgram, this.aString1246);
			if (this.anInt9435 != 0 && this.anInt9424 != 0) {
				this.anInt9423 = OpenGL.glCreateProgram();
				if (this.anInt9435 != 0) {
					OpenGL.glAttachShader(this.anInt9423, this.anInt9435);
				}

				if (this.anInt9424 != 0) {
					OpenGL.glAttachShader(this.anInt9423, this.anInt9424);
				}

				OpenGL.glLinkProgram(this.anInt9423);
				OpenGL.glGetProgramiv(this.anInt9423, 35714, anIntArray9417, 0);
				if (anIntArray9417[0] == 0) {
					if (this.anInt9435 != 0) {
						OpenGL.glDetachShader(this.anInt9423, this.anInt9435);
						OpenGL.glDeleteShader(this.anInt9435);
					}

					if (this.anInt9424 != 0) {
						OpenGL.glDetachShader(this.anInt9423, this.anInt9424);
						OpenGL.glDeleteShader(this.anInt9424);
					}

					OpenGL.glDeleteProgram(this.anInt9423);
					return false;
				} else {
					OpenGL.glUseProgram(this.anInt9423);
					int i_1 = -1;

					int i_2;
					for (i_2 = 0; i_2 < this.aClass101_Sub1_9421.method1650(656920593); i_2++) {
						if (this.aClass101_Sub1_9421.method1652(i_2, (byte) 43) == this) {
							i_1 = i_2;
							break;
						}
					}

					if (i_1 == -1) {
						return false;
					} else {
						i_2 = 0;
						int i_3 = 0;

						int i_4;
						Node_Sub21_Sub1 class282_sub21_sub1_5;
						Class111 class111_6;
						int i_7;
						for (i_4 = 0; i_4 < this.aClass101_Sub1_9421.method1682(508450289); i_4++) {
							class282_sub21_sub1_5 = this.aClass101_Sub1_9421.method1742(i_4, 618345574);
							if (class282_sub21_sub1_5 != null) {
								class282_sub21_sub1_5.method15471(i_1);
								class111_6 = class282_sub21_sub1_5.method15457((byte) 111);
								i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
								if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134) {
									i_3 = Math.max(i_7, i_3);
								} else {
									i_2 = Math.max(i_7, i_2);
								}
							}
						}

						for (i_4 = 0; i_4 < this.aClass101_Sub1_9421.method1679(381488614); i_4++) {
							class282_sub21_sub1_5 = this.aClass101_Sub1_9421.method1705(i_4, 2049312181);
							if (class282_sub21_sub1_5 != null) {
								class282_sub21_sub1_5.method15471(i_1);
								class111_6 = class282_sub21_sub1_5.method15457((byte) 93);
								i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
								if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134) {
									i_3 = Math.max(i_7, i_3);
								} else {
									i_2 = Math.max(i_7, i_2);
								}
							}
						}

						this.aFloatArray9429 = new float[i_2 + 1];
						this.aFloatArray9422 = new float[i_2 + 1];
						this.aFloatArray9431 = new float[i_2 + 1];
						this.aFloatArray9432 = new float[i_2 + 1];
						this.anIntArray9433 = new int[i_3 + 1];

						for (i_4 = 0; i_4 < this.anIntArray9433.length; i_4++) {
							this.anIntArray9433[i_4] = -1;
						}

						this.aString9434 = null;
						this.shaderProgram = null;
						this.aBool9425 = true;
						return true;
					}
				}
			} else {
				if (this.anInt9435 != 0) {
					OpenGL.glDeleteShader(this.anInt9435);
				}

				if (this.anInt9424 != 0) {
					OpenGL.glDeleteShader(this.anInt9424);
				}

				return false;
			}
		}
	}

	void method1901(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (this.aFloatArray9429[i_6] != f_2 || this.aFloatArray9422[i_6] != f_3 || this.aFloatArray9431[i_6] != f_4 || this.aFloatArray9432[i_6] != f_5)) {
			this.aFloatArray9429[i_6] = f_2;
			this.aFloatArray9422[i_6] = f_3;
			this.aFloatArray9431[i_6] = f_4;
			this.aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457((byte) 39) != Class111.aClass111_1134) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	void method1912(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1 && this.aFloatArray9429[i_3] != f_2) {
			this.aFloatArray9429[i_3] = f_2;
			if (class282_sub21_sub1_1.method15457((byte) 104) != Class111.aClass111_1219 && class282_sub21_sub1_1.method15457((byte) 20) != Class111.aClass111_1182) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform1f(i_3, f_2);
		}

	}

	void method1913(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1 && (this.aFloatArray9429[i_4] != f_2 || this.aFloatArray9422[i_4] != f_3)) {
			this.aFloatArray9429[i_4] = f_2;
			this.aFloatArray9422[i_4] = f_3;
			if (class282_sub21_sub1_1.method15457((byte) 91) != Class111.aClass111_1132) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform2f(i_4, f_2, f_3);
		}

	}

	void method1914(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_5 != -1 && (this.aFloatArray9429[i_5] != f_2 || this.aFloatArray9422[i_5] != f_3 || this.aFloatArray9431[i_5] != f_4)) {
			this.aFloatArray9429[i_5] = f_2;
			this.aFloatArray9422[i_5] = f_3;
			this.aFloatArray9431[i_5] = f_4;
			if (class282_sub21_sub1_1.method15457((byte) 25) != Class111.aClass111_1133) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform3f(i_5, f_2, f_3, f_4);
		}

	}

	void method1915(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_5 != -1 && (this.aFloatArray9429[i_5] != f_2 || this.aFloatArray9422[i_5] != f_3 || this.aFloatArray9431[i_5] != f_4)) {
			this.aFloatArray9429[i_5] = f_2;
			this.aFloatArray9422[i_5] = f_3;
			this.aFloatArray9431[i_5] = f_4;
			if (class282_sub21_sub1_1.method15457((byte) 86) != Class111.aClass111_1133) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform3f(i_5, f_2, f_3, f_4);
		}

	}

	void method1916(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_5 != -1 && (this.aFloatArray9429[i_5] != f_2 || this.aFloatArray9422[i_5] != f_3 || this.aFloatArray9431[i_5] != f_4)) {
			this.aFloatArray9429[i_5] = f_2;
			this.aFloatArray9422[i_5] = f_3;
			this.aFloatArray9431[i_5] = f_4;
			if (class282_sub21_sub1_1.method15457((byte) 50) != Class111.aClass111_1133) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform3f(i_5, f_2, f_3, f_4);
		}

	}

	void method1937(int i_1, float[] floats_2, int i_3) {
		OpenGL.glUniform4fv(i_1, i_3, floats_2, 0);
	}

	void method1948(int i_1, int i_2, Interface30 interface30_3) {
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	void method1920(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (this.aFloatArray9429[i_6] != f_2 || this.aFloatArray9422[i_6] != f_3 || this.aFloatArray9431[i_6] != f_4 || this.aFloatArray9432[i_6] != f_5)) {
			this.aFloatArray9429[i_6] = f_2;
			this.aFloatArray9422[i_6] = f_3;
			this.aFloatArray9431[i_6] = f_4;
			this.aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457((byte) 81) != Class111.aClass111_1134) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	void method1941(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (this.aFloatArray9429[i_6] != f_2 || this.aFloatArray9422[i_6] != f_3 || this.aFloatArray9431[i_6] != f_4 || this.aFloatArray9432[i_6] != f_5)) {
			this.aFloatArray9429[i_6] = f_2;
			this.aFloatArray9422[i_6] = f_3;
			this.aFloatArray9431[i_6] = f_4;
			this.aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457((byte) 63) != Class111.aClass111_1134) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	void method1919(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);
		}

	}

	void method1908(int i_1, int i_2, Interface30 interface30_3) {
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	public boolean method1911() {
		if (this.aBool9425) {
			return true;
		} else {
			this.aGraphicalRenderer_Sub2_Sub1_9419.aClass115_Sub2_10189 = null;
			this.anInt9435 = this.method14671(35633, this.aString9434, this.shaderName);
			this.anInt9424 = this.method14671(35632, this.shaderProgram, this.aString1246);
			if (this.anInt9435 != 0 && this.anInt9424 != 0) {
				this.anInt9423 = OpenGL.glCreateProgram();
				if (this.anInt9435 != 0) {
					OpenGL.glAttachShader(this.anInt9423, this.anInt9435);
				}

				if (this.anInt9424 != 0) {
					OpenGL.glAttachShader(this.anInt9423, this.anInt9424);
				}

				OpenGL.glLinkProgram(this.anInt9423);
				OpenGL.glGetProgramiv(this.anInt9423, 35714, anIntArray9417, 0);
				if (anIntArray9417[0] == 0) {
					if (this.anInt9435 != 0) {
						OpenGL.glDetachShader(this.anInt9423, this.anInt9435);
						OpenGL.glDeleteShader(this.anInt9435);
					}

					if (this.anInt9424 != 0) {
						OpenGL.glDetachShader(this.anInt9423, this.anInt9424);
						OpenGL.glDeleteShader(this.anInt9424);
					}

					OpenGL.glDeleteProgram(this.anInt9423);
					return false;
				} else {
					OpenGL.glUseProgram(this.anInt9423);
					int i_1 = -1;

					int i_2;
					for (i_2 = 0; i_2 < this.aClass101_Sub1_9421.method1650(-219628565); i_2++) {
						if (this.aClass101_Sub1_9421.method1652(i_2, (byte) 83) == this) {
							i_1 = i_2;
							break;
						}
					}

					if (i_1 == -1) {
						return false;
					} else {
						i_2 = 0;
						int i_3 = 0;

						int i_4;
						Node_Sub21_Sub1 class282_sub21_sub1_5;
						Class111 class111_6;
						int i_7;
						for (i_4 = 0; i_4 < this.aClass101_Sub1_9421.method1682(1113047146); i_4++) {
							class282_sub21_sub1_5 = this.aClass101_Sub1_9421.method1742(i_4, -1229516858);
							if (class282_sub21_sub1_5 != null) {
								class282_sub21_sub1_5.method15471(i_1);
								class111_6 = class282_sub21_sub1_5.method15457((byte) 21);
								i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
								if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134) {
									i_3 = Math.max(i_7, i_3);
								} else {
									i_2 = Math.max(i_7, i_2);
								}
							}
						}

						for (i_4 = 0; i_4 < this.aClass101_Sub1_9421.method1679(-1571283399); i_4++) {
							class282_sub21_sub1_5 = this.aClass101_Sub1_9421.method1705(i_4, 741194215);
							if (class282_sub21_sub1_5 != null) {
								class282_sub21_sub1_5.method15471(i_1);
								class111_6 = class282_sub21_sub1_5.method15457((byte) 103);
								i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
								if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134) {
									i_3 = Math.max(i_7, i_3);
								} else {
									i_2 = Math.max(i_7, i_2);
								}
							}
						}

						this.aFloatArray9429 = new float[i_2 + 1];
						this.aFloatArray9422 = new float[i_2 + 1];
						this.aFloatArray9431 = new float[i_2 + 1];
						this.aFloatArray9432 = new float[i_2 + 1];
						this.anIntArray9433 = new int[i_3 + 1];

						for (i_4 = 0; i_4 < this.anIntArray9433.length; i_4++) {
							this.anIntArray9433[i_4] = -1;
						}

						this.aString9434 = null;
						this.shaderProgram = null;
						this.aBool9425 = true;
						return true;
					}
				}
			} else {
				if (this.anInt9435 != 0) {
					OpenGL.glDeleteShader(this.anInt9435);
				}

				if (this.anInt9424 != 0) {
					OpenGL.glDeleteShader(this.anInt9424);
				}

				return false;
			}
		}
	}

	void method1925(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457((byte) 93) != Class111.aClass111_1168) {
			throw new AssertionError();
		} else {
			int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
			if (i_3 != -1) {
				OpenGL.glUniform2fv(i_3, 4, matrix44arr_2.method6551(aFloatArray9427), 0);
			}

		}
	}

	void method1924(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457((byte) 100) != Class111.aClass111_1168) {
			throw new AssertionError();
		} else {
			int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
			if (i_3 != -1) {
				OpenGL.glUniform2fv(i_3, 4, matrix44arr_2.method6551(aFloatArray9427), 0);
			}

		}
	}

	void method1917(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (this.aFloatArray9429[i_6] != f_2 || this.aFloatArray9422[i_6] != f_3 || this.aFloatArray9431[i_6] != f_4 || this.aFloatArray9432[i_6] != f_5)) {
			this.aFloatArray9429[i_6] = f_2;
			this.aFloatArray9422[i_6] = f_3;
			this.aFloatArray9431[i_6] = f_4;
			this.aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457((byte) 76) != Class111.aClass111_1134) {
				throw new IllegalArgumentException_Sub1(class282_sub21_sub1_1, "");
			}

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	void method1926(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44Arr matrix44arr_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457((byte) 117) != Class111.aClass111_1150) {
			throw new AssertionError();
		} else {
			int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
			if (i_3 != -1) {
				OpenGL.glUniform4fv(i_3, 4, matrix44arr_2.method6517(aFloatArray9427), 0);
			}

		}
	}

	void method1930(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 obj_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			if (obj_3 == null) {
				obj_3 = this.aGraphicalRenderer_Sub2_Sub1_9419.anInterface6_8788;
			}

			if (i_2 < this.aGraphicalRenderer_Sub2_Sub1_9419.anInt8825) {
				this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
				this.aGraphicalRenderer_Sub2_Sub1_9419.method14035((Interface30) obj_3);
			} else {
				OpenGL.glActiveTexture(33984 + i_2);
				OpenGL.glBindTexture(((Class319) obj_3).anInt3707, ((Class319) obj_3).anInt3706);
			}

			if (this.anIntArray9433[i_4] != i_2) {
				this.anIntArray9433[i_4] = i_2;
				OpenGL.glUniform1i(i_4, i_2);
			}
		}

	}

	void method1904(int i_1, float[] floats_2, int i_3) {
		OpenGL.glUniform4fv(i_1, i_3, floats_2, 0);
	}

	void method1918(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);
		}

	}

	void method1946(int i_1, int i_2, Interface30 interface30_3) {
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	void method1931(int i_1, float f_2, float f_3, float f_4) {
		OpenGL.glUniform3f(i_1, f_2, f_3, f_4);
	}

	void method1932(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	void method1933(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	void method1934(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	void method1935(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	void method1921(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);
		}

	}

	void method1902(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform3fv(i_1, 3, matrix44arr_2.method6544(aFloatArray9427), 0);
	}

	Class115_Sub2(GraphicalRenderer_Sub2_Sub1 class505_sub2_sub1_1, OpenGLShader class101_sub1_2, Class99 class99_3) {
		this(class505_sub2_sub1_1, class99_3);
		this.aClass101_Sub1_9421 = class101_sub1_2;
		this.aGraphicalRenderer_Sub2_Sub1_9419 = class505_sub2_sub1_1;
	}

	public void method26() {
		if (this.anInt9423 != 0) {
			this.aGraphicalRenderer_Sub2_Sub1_9419.method15573(this.anInt9423);
			if (this.anInt9435 != 0) {
				this.aGraphicalRenderer_Sub2_Sub1_9419.method15580((long) this.anInt9435);
			}

			if (this.anInt9424 != 0) {
				this.aGraphicalRenderer_Sub2_Sub1_9419.method15580((long) this.anInt9424);
			}

			this.anInt9423 = 0;
			this.anInt9435 = 0;
			this.anInt9424 = 0;
		}

	}

	void method1940(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform3fv(i_1, 3, matrix44arr_2.method6544(aFloatArray9427), 0);
	}

	void method1922(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform3fv(i_1, 3, matrix44arr_2.method6544(aFloatArray9427), 0);
	}

	void method1942(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform2fv(i_1, 4, matrix44arr_2.method6551(aFloatArray9427), 0);
	}

	void method1943(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform4fv(i_1, 4, matrix44arr_2.method6517(aFloatArray9427), 0);
	}

	void method1910(int i_1, Matrix44Arr matrix44arr_2) {
		OpenGL.glUniform4fv(i_1, 4, matrix44arr_2.method6517(aFloatArray9427), 0);
	}

	public boolean method1899() {
		if (this.aBool9425) {
			return true;
		} else {
			this.aGraphicalRenderer_Sub2_Sub1_9419.aClass115_Sub2_10189 = null;
			this.anInt9435 = this.method14671(35633, this.aString9434, this.shaderName);
			this.anInt9424 = this.method14671(35632, this.shaderProgram, this.aString1246);
			if (this.anInt9435 != 0 && this.anInt9424 != 0) {
				this.anInt9423 = OpenGL.glCreateProgram();
				if (this.anInt9435 != 0) {
					OpenGL.glAttachShader(this.anInt9423, this.anInt9435);
				}

				if (this.anInt9424 != 0) {
					OpenGL.glAttachShader(this.anInt9423, this.anInt9424);
				}

				OpenGL.glLinkProgram(this.anInt9423);
				OpenGL.glGetProgramiv(this.anInt9423, 35714, anIntArray9417, 0);
				if (anIntArray9417[0] == 0) {
					if (this.anInt9435 != 0) {
						OpenGL.glDetachShader(this.anInt9423, this.anInt9435);
						OpenGL.glDeleteShader(this.anInt9435);
					}

					if (this.anInt9424 != 0) {
						OpenGL.glDetachShader(this.anInt9423, this.anInt9424);
						OpenGL.glDeleteShader(this.anInt9424);
					}

					OpenGL.glDeleteProgram(this.anInt9423);
					return false;
				} else {
					OpenGL.glUseProgram(this.anInt9423);
					int i_1 = -1;

					int i_2;
					for (i_2 = 0; i_2 < this.aClass101_Sub1_9421.method1650(1699577818); i_2++) {
						if (this.aClass101_Sub1_9421.method1652(i_2, (byte) 68) == this) {
							i_1 = i_2;
							break;
						}
					}

					if (i_1 == -1) {
						return false;
					} else {
						i_2 = 0;
						int i_3 = 0;

						int i_4;
						Node_Sub21_Sub1 class282_sub21_sub1_5;
						Class111 class111_6;
						int i_7;
						for (i_4 = 0; i_4 < this.aClass101_Sub1_9421.method1682(-225666639); i_4++) {
							class282_sub21_sub1_5 = this.aClass101_Sub1_9421.method1742(i_4, -1517256754);
							if (class282_sub21_sub1_5 != null) {
								class282_sub21_sub1_5.method15471(i_1);
								class111_6 = class282_sub21_sub1_5.method15457((byte) 125);
								i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
								if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134) {
									i_3 = Math.max(i_7, i_3);
								} else {
									i_2 = Math.max(i_7, i_2);
								}
							}
						}

						for (i_4 = 0; i_4 < this.aClass101_Sub1_9421.method1679(-1090966018); i_4++) {
							class282_sub21_sub1_5 = this.aClass101_Sub1_9421.method1705(i_4, -565117281);
							if (class282_sub21_sub1_5 != null) {
								class282_sub21_sub1_5.method15471(i_1);
								class111_6 = class282_sub21_sub1_5.method15457((byte) 124);
								i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
								if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134) {
									i_3 = Math.max(i_7, i_3);
								} else {
									i_2 = Math.max(i_7, i_2);
								}
							}
						}

						this.aFloatArray9429 = new float[i_2 + 1];
						this.aFloatArray9422 = new float[i_2 + 1];
						this.aFloatArray9431 = new float[i_2 + 1];
						this.aFloatArray9432 = new float[i_2 + 1];
						this.anIntArray9433 = new int[i_3 + 1];

						for (i_4 = 0; i_4 < this.anIntArray9433.length; i_4++) {
							this.anIntArray9433[i_4] = -1;
						}

						this.aString9434 = null;
						this.shaderProgram = null;
						this.aBool9425 = true;
						return true;
					}
				}
			} else {
				if (this.anInt9435 != 0) {
					OpenGL.glDeleteShader(this.anInt9435);
				}

				if (this.anInt9424 != 0) {
					OpenGL.glDeleteShader(this.anInt9424);
				}

				return false;
			}
		}
	}

	void method1907(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	void method1947(int i_1, int i_2, Interface30 interface30_3) {
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		this.aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	void method1929(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 obj_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			if (obj_3 == null) {
				obj_3 = this.aGraphicalRenderer_Sub2_Sub1_9419.anInterface6_8788;
			}

			if (i_2 < this.aGraphicalRenderer_Sub2_Sub1_9419.anInt8825) {
				this.aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
				this.aGraphicalRenderer_Sub2_Sub1_9419.method14035((Interface30) obj_3);
			} else {
				OpenGL.glActiveTexture(33984 + i_2);
				OpenGL.glBindTexture(((Class319) obj_3).anInt3707, ((Class319) obj_3).anInt3706);
			}

			if (this.anIntArray9433[i_4] != i_2) {
				this.anIntArray9433[i_4] = i_2;
				OpenGL.glUniform1i(i_4, i_2);
			}
		}

	}

}
