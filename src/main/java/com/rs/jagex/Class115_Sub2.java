package com.rs.jagex;

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
	JAGGLRenderer aGraphicalRenderer_Sub2_Sub1_9419;

	Class115_Sub2(JAGGLRenderer class505_sub2_sub1_1, Class99 class99_2) {
		anInt9423 = 0;
		anInt9435 = 0;
		anInt9424 = 0;
		aBool9425 = false;
		anIntArray9426 = new int[13];
		aString1245 = class99_2.aString1003;
		StringBuilder programString = new StringBuilder();
		Class121[] arr_4;
		int i_5;
		Class121 class121_6;
		System.out.println("Shader loading:");
		if (class99_2.aString1001 != null) {
			System.out.println(class99_2.aString1001);
			shaderName = class99_2.aString1001;
			if (class99_2.aClass121Array1000 != null) {
				arr_4 = class99_2.aClass121Array1000;

				for (i_5 = 0; i_5 < arr_4.length; i_5++) {
					class121_6 = arr_4[i_5];
					programString.append("#define ").append(class121_6.aString1524).append(" ").append(class121_6.aString1523).append('\n');
				}
			}

			programString.append(new String(class505_sub2_sub1_1.getGLShaderData(shaderName)));
			aString9434 = programString.toString();
		}

		if (class99_2.aString1002 != null) {
			System.out.println(class99_2.aString1002);
			aString1246 = class99_2.aString1002;
			programString.setLength(0);
			if (class99_2.aClass121Array1004 != null) {
				arr_4 = class99_2.aClass121Array1004;

				for (i_5 = 0; i_5 < arr_4.length; i_5++) {
					class121_6 = arr_4[i_5];
					programString.append("#define ").append(class121_6.aString1524).append(" ").append(class121_6.aString1523).append('\n');
				}
			}

			programString.append(new String(class505_sub2_sub1_1.getGLShaderData(aString1246)));
			shaderProgram = programString.toString();
		}

		Class503.method8365(anIntArray9426, 0, anIntArray9426.length, -1);
	}

	Class115_Sub2(JAGGLRenderer class505_sub2_sub1_1, OpenGLShader class101_sub1_2, Class99 class99_3) {
		this(class505_sub2_sub1_1, class99_3);
		aClass101_Sub1_9421 = class101_sub1_2;
		aGraphicalRenderer_Sub2_Sub1_9419 = class505_sub2_sub1_1;
	}

	@Override
	protected void finalize() {
		method26();
	}

	int method14671(int i_1, String string_2) {
		if (string_2 == null)
			return 0;
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

	@Override
	void method1891(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457() != Class111.aClass111_1150)
			throw new AssertionError();
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1)
			OpenGL.glUniform4fv(i_3, 4, matrix44_2.method6517(aFloatArray9427), 0);
	}

	@Override
	void method1893(int i_1, float f_2, float f_3, float f_4) {
		OpenGL.glUniform3f(i_1, f_2, f_3, f_4);
	}

	@Override
	void method1894(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1 && aFloatArray9429[i_3] != f_2) {
			aFloatArray9429[i_3] = f_2;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1219 && class282_sub21_sub1_1.method15457() != Class111.aClass111_1182)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform1f(i_3, f_2);
		}

	}

	@Override
	void method1895(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	@Override
	void method1896(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 obj_3) {
		Interface30 obj_31 = obj_3;
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			if (obj_31 == null)
				obj_31 = aGraphicalRenderer_Sub2_Sub1_9419.anInterface6_8788;

			if (i_2 < aGraphicalRenderer_Sub2_Sub1_9419.anInt8825) {
				aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
				aGraphicalRenderer_Sub2_Sub1_9419.method14035(obj_31);
			} else {
				OpenGL.glActiveTexture(i_2 + 33984);
				OpenGL.glBindTexture(((Class319) obj_31).anInt3707, ((Class319) obj_31).anInt3706);
			}

			if (i_2 != anIntArray9433[i_4]) {
				anIntArray9433[i_4] = i_2;
				OpenGL.glUniform1i(i_4, i_2);
			}
		}

	}

	@Override
	void method1897(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (aFloatArray9429[i_6] != f_2 || aFloatArray9422[i_6] != f_3 || aFloatArray9431[i_6] != f_4 || aFloatArray9432[i_6] != f_5)) {
			aFloatArray9429[i_6] = f_2;
			aFloatArray9422[i_6] = f_3;
			aFloatArray9431[i_6] = f_4;
			aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	@Override
	public boolean method1898() {
		if (aBool9425)
			return true;
		aGraphicalRenderer_Sub2_Sub1_9419.aClass115_Sub2_10189 = null;
		anInt9435 = method14671(35633, aString9434);
		anInt9424 = method14671(35632, shaderProgram);
		if (anInt9435 != 0 && anInt9424 != 0) {
			anInt9423 = OpenGL.glCreateProgram();
			if (anInt9435 != 0)
				OpenGL.glAttachShader(anInt9423, anInt9435);

			if (anInt9424 != 0)
				OpenGL.glAttachShader(anInt9423, anInt9424);

			OpenGL.glLinkProgram(anInt9423);
			OpenGL.glGetProgramiv(anInt9423, 35714, anIntArray9417, 0);
			if (anIntArray9417[0] == 0) {
				if (anInt9435 != 0) {
					OpenGL.glDetachShader(anInt9423, anInt9435);
					OpenGL.glDeleteShader(anInt9435);
				}

				if (anInt9424 != 0) {
					OpenGL.glDetachShader(anInt9423, anInt9424);
					OpenGL.glDeleteShader(anInt9424);
				}

				OpenGL.glDeleteProgram(anInt9423);
				return false;
			} else {
				OpenGL.glUseProgram(anInt9423);
				int i_1 = -1;

				int i_2;
				for (i_2 = 0; i_2 < aClass101_Sub1_9421.method1650(); i_2++)
					if (aClass101_Sub1_9421.method1652(i_2) == this) {
						i_1 = i_2;
						break;
					}

				if (i_1 == -1)
					return false;
				else {
					i_2 = 0;
					int i_3 = 0;

					int i_4;
					Node_Sub21_Sub1 class282_sub21_sub1_5;
					Class111 class111_6;
					int i_7;
					for (i_4 = 0; i_4 < aClass101_Sub1_9421.method1682(); i_4++) {
						class282_sub21_sub1_5 = aClass101_Sub1_9421.method1742(i_4);
						if (class282_sub21_sub1_5 != null) {
							class282_sub21_sub1_5.method15471(i_1);
							class111_6 = class282_sub21_sub1_5.method15457();
							i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
							if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134)
								i_3 = Math.max(i_7, i_3);
							else
								i_2 = Math.max(i_7, i_2);
						}
					}

					for (i_4 = 0; i_4 < aClass101_Sub1_9421.method1679(); i_4++) {
						class282_sub21_sub1_5 = aClass101_Sub1_9421.method1705(i_4);
						if (class282_sub21_sub1_5 != null) {
							class282_sub21_sub1_5.method15471(i_1);
							class111_6 = class282_sub21_sub1_5.method15457();
							i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
							if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134)
								i_3 = Math.max(i_7, i_3);
							else
								i_2 = Math.max(i_7, i_2);
						}
					}

					aFloatArray9429 = new float[i_2 + 1];
					aFloatArray9422 = new float[i_2 + 1];
					aFloatArray9431 = new float[i_2 + 1];
					aFloatArray9432 = new float[i_2 + 1];
					anIntArray9433 = new int[i_3 + 1];

					for (i_4 = 0; i_4 < anIntArray9433.length; i_4++)
						anIntArray9433[i_4] = -1;

					aString9434 = null;
					shaderProgram = null;
					aBool9425 = true;
					return true;
				}
			}
		} else {
			if (anInt9435 != 0)
				OpenGL.glDeleteShader(anInt9435);

			if (anInt9424 != 0)
				OpenGL.glDeleteShader(anInt9424);

			return false;
		}
	}

	@Override
	public boolean method1899() {
		if (aBool9425)
			return true;
		aGraphicalRenderer_Sub2_Sub1_9419.aClass115_Sub2_10189 = null;
		anInt9435 = method14671(35633, aString9434);
		anInt9424 = method14671(35632, shaderProgram);
		if (anInt9435 != 0 && anInt9424 != 0) {
			anInt9423 = OpenGL.glCreateProgram();
			if (anInt9435 != 0)
				OpenGL.glAttachShader(anInt9423, anInt9435);

			if (anInt9424 != 0)
				OpenGL.glAttachShader(anInt9423, anInt9424);

			OpenGL.glLinkProgram(anInt9423);
			OpenGL.glGetProgramiv(anInt9423, 35714, anIntArray9417, 0);
			if (anIntArray9417[0] == 0) {
				if (anInt9435 != 0) {
					OpenGL.glDetachShader(anInt9423, anInt9435);
					OpenGL.glDeleteShader(anInt9435);
				}

				if (anInt9424 != 0) {
					OpenGL.glDetachShader(anInt9423, anInt9424);
					OpenGL.glDeleteShader(anInt9424);
				}

				OpenGL.glDeleteProgram(anInt9423);
				return false;
			} else {
				OpenGL.glUseProgram(anInt9423);
				int i_1 = -1;

				int i_2;
				for (i_2 = 0; i_2 < aClass101_Sub1_9421.method1650(); i_2++)
					if (aClass101_Sub1_9421.method1652(i_2) == this) {
						i_1 = i_2;
						break;
					}

				if (i_1 == -1)
					return false;
				else {
					i_2 = 0;
					int i_3 = 0;

					int i_4;
					Node_Sub21_Sub1 class282_sub21_sub1_5;
					Class111 class111_6;
					int i_7;
					for (i_4 = 0; i_4 < aClass101_Sub1_9421.method1682(); i_4++) {
						class282_sub21_sub1_5 = aClass101_Sub1_9421.method1742(i_4);
						if (class282_sub21_sub1_5 != null) {
							class282_sub21_sub1_5.method15471(i_1);
							class111_6 = class282_sub21_sub1_5.method15457();
							i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
							if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134)
								i_3 = Math.max(i_7, i_3);
							else
								i_2 = Math.max(i_7, i_2);
						}
					}

					for (i_4 = 0; i_4 < aClass101_Sub1_9421.method1679(); i_4++) {
						class282_sub21_sub1_5 = aClass101_Sub1_9421.method1705(i_4);
						if (class282_sub21_sub1_5 != null) {
							class282_sub21_sub1_5.method15471(i_1);
							class111_6 = class282_sub21_sub1_5.method15457();
							i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
							if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134)
								i_3 = Math.max(i_7, i_3);
							else
								i_2 = Math.max(i_7, i_2);
						}
					}

					aFloatArray9429 = new float[i_2 + 1];
					aFloatArray9422 = new float[i_2 + 1];
					aFloatArray9431 = new float[i_2 + 1];
					aFloatArray9432 = new float[i_2 + 1];
					anIntArray9433 = new int[i_3 + 1];

					for (i_4 = 0; i_4 < anIntArray9433.length; i_4++)
						anIntArray9433[i_4] = -1;

					aString9434 = null;
					shaderProgram = null;
					aBool9425 = true;
					return true;
				}
			}
		} else {
			if (anInt9435 != 0)
				OpenGL.glDeleteShader(anInt9435);

			if (anInt9424 != 0)
				OpenGL.glDeleteShader(anInt9424);

			return false;
		}
	}

	@Override
	void method1900(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform4fv(i_1, 4, matrix44_2.method6517(aFloatArray9427), 0);
	}

	@Override
	void method1901(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (aFloatArray9429[i_6] != f_2 || aFloatArray9422[i_6] != f_3 || aFloatArray9431[i_6] != f_4 || aFloatArray9432[i_6] != f_5)) {
			aFloatArray9429[i_6] = f_2;
			aFloatArray9422[i_6] = f_3;
			aFloatArray9431[i_6] = f_4;
			aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	@Override
	void method1902(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform3fv(i_1, 3, matrix44_2.method6544(aFloatArray9427), 0);
	}

	@Override
	void method1903(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1)
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);

	}

	@Override
	void method1904(int i_1, float[] floats_2, int i_3) {
		OpenGL.glUniform4fv(i_1, i_3, floats_2, 0);
	}

	@Override
	void method1905(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform3fv(i_1, 3, matrix44_2.method6544(aFloatArray9427), 0);
	}

	@Override
	void method1906(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform2fv(i_1, 4, matrix44_2.method6551(aFloatArray9427), 0);
	}

	@Override
	void method1907(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	@Override
	void method1908(int i_1, int i_2, Interface30 interface30_3) {
		aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	@Override
	void method1910(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform4fv(i_1, 4, matrix44_2.method6517(aFloatArray9427), 0);
	}

	@Override
	public boolean method1911() {
		if (aBool9425)
			return true;
		aGraphicalRenderer_Sub2_Sub1_9419.aClass115_Sub2_10189 = null;
		anInt9435 = method14671(35633, aString9434);
		anInt9424 = method14671(35632, shaderProgram);
		if (anInt9435 != 0 && anInt9424 != 0) {
			anInt9423 = OpenGL.glCreateProgram();
			if (anInt9435 != 0)
				OpenGL.glAttachShader(anInt9423, anInt9435);

			if (anInt9424 != 0)
				OpenGL.glAttachShader(anInt9423, anInt9424);

			OpenGL.glLinkProgram(anInt9423);
			OpenGL.glGetProgramiv(anInt9423, 35714, anIntArray9417, 0);
			if (anIntArray9417[0] == 0) {
				if (anInt9435 != 0) {
					OpenGL.glDetachShader(anInt9423, anInt9435);
					OpenGL.glDeleteShader(anInt9435);
				}

				if (anInt9424 != 0) {
					OpenGL.glDetachShader(anInt9423, anInt9424);
					OpenGL.glDeleteShader(anInt9424);
				}

				OpenGL.glDeleteProgram(anInt9423);
				return false;
			} else {
				OpenGL.glUseProgram(anInt9423);
				int i_1 = -1;

				int i_2;
				for (i_2 = 0; i_2 < aClass101_Sub1_9421.method1650(); i_2++)
					if (aClass101_Sub1_9421.method1652(i_2) == this) {
						i_1 = i_2;
						break;
					}

				if (i_1 == -1)
					return false;
				else {
					i_2 = 0;
					int i_3 = 0;

					int i_4;
					Node_Sub21_Sub1 class282_sub21_sub1_5;
					Class111 class111_6;
					int i_7;
					for (i_4 = 0; i_4 < aClass101_Sub1_9421.method1682(); i_4++) {
						class282_sub21_sub1_5 = aClass101_Sub1_9421.method1742(i_4);
						if (class282_sub21_sub1_5 != null) {
							class282_sub21_sub1_5.method15471(i_1);
							class111_6 = class282_sub21_sub1_5.method15457();
							i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
							if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134)
								i_3 = Math.max(i_7, i_3);
							else
								i_2 = Math.max(i_7, i_2);
						}
					}

					for (i_4 = 0; i_4 < aClass101_Sub1_9421.method1679(); i_4++) {
						class282_sub21_sub1_5 = aClass101_Sub1_9421.method1705(i_4);
						if (class282_sub21_sub1_5 != null) {
							class282_sub21_sub1_5.method15471(i_1);
							class111_6 = class282_sub21_sub1_5.method15457();
							i_7 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_5).anIntArray10308[i_1];
							if (class111_6 != Class111.aClass111_1219 && class111_6 != Class111.aClass111_1182 && class111_6 != Class111.aClass111_1132 && class111_6 != Class111.aClass111_1133 && class111_6 != Class111.aClass111_1134)
								i_3 = Math.max(i_7, i_3);
							else
								i_2 = Math.max(i_7, i_2);
						}
					}

					aFloatArray9429 = new float[i_2 + 1];
					aFloatArray9422 = new float[i_2 + 1];
					aFloatArray9431 = new float[i_2 + 1];
					aFloatArray9432 = new float[i_2 + 1];
					anIntArray9433 = new int[i_3 + 1];

					for (i_4 = 0; i_4 < anIntArray9433.length; i_4++)
						anIntArray9433[i_4] = -1;

					aString9434 = null;
					shaderProgram = null;
					aBool9425 = true;
					return true;
				}
			}
		} else {
			if (anInt9435 != 0)
				OpenGL.glDeleteShader(anInt9435);

			if (anInt9424 != 0)
				OpenGL.glDeleteShader(anInt9424);

			return false;
		}
	}

	@Override
	void method1912(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2) {
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1 && aFloatArray9429[i_3] != f_2) {
			aFloatArray9429[i_3] = f_2;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1219 && class282_sub21_sub1_1.method15457() != Class111.aClass111_1182)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform1f(i_3, f_2);
		}

	}

	@Override
	void method1913(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1 && (aFloatArray9429[i_4] != f_2 || aFloatArray9422[i_4] != f_3)) {
			aFloatArray9429[i_4] = f_2;
			aFloatArray9422[i_4] = f_3;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1132)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform2f(i_4, f_2, f_3);
		}

	}

	@Override
	void method1914(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_5 != -1 && (aFloatArray9429[i_5] != f_2 || aFloatArray9422[i_5] != f_3 || aFloatArray9431[i_5] != f_4)) {
			aFloatArray9429[i_5] = f_2;
			aFloatArray9422[i_5] = f_3;
			aFloatArray9431[i_5] = f_4;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1133)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform3f(i_5, f_2, f_3, f_4);
		}

	}

	@Override
	void method1915(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_5 != -1 && (aFloatArray9429[i_5] != f_2 || aFloatArray9422[i_5] != f_3 || aFloatArray9431[i_5] != f_4)) {
			aFloatArray9429[i_5] = f_2;
			aFloatArray9422[i_5] = f_3;
			aFloatArray9431[i_5] = f_4;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1133)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform3f(i_5, f_2, f_3, f_4);
		}

	}

	@Override
	void method1916(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_5 != -1 && (aFloatArray9429[i_5] != f_2 || aFloatArray9422[i_5] != f_3 || aFloatArray9431[i_5] != f_4)) {
			aFloatArray9429[i_5] = f_2;
			aFloatArray9422[i_5] = f_3;
			aFloatArray9431[i_5] = f_4;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1133)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform3f(i_5, f_2, f_3, f_4);
		}

	}

	@Override
	void method1917(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (aFloatArray9429[i_6] != f_2 || aFloatArray9422[i_6] != f_3 || aFloatArray9431[i_6] != f_4 || aFloatArray9432[i_6] != f_5)) {
			aFloatArray9429[i_6] = f_2;
			aFloatArray9422[i_6] = f_3;
			aFloatArray9431[i_6] = f_4;
			aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	@Override
	void method1918(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1)
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);

	}

	@Override
	void method1919(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1)
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);

	}

	@Override
	void method1920(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (aFloatArray9429[i_6] != f_2 || aFloatArray9422[i_6] != f_3 || aFloatArray9431[i_6] != f_4 || aFloatArray9432[i_6] != f_5)) {
			aFloatArray9429[i_6] = f_2;
			aFloatArray9422[i_6] = f_3;
			aFloatArray9431[i_6] = f_4;
			aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	@Override
	void method1921(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1)
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);

	}

	@Override
	void method1922(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform3fv(i_1, 3, matrix44_2.method6544(aFloatArray9427), 0);
	}

	@Override
	void method1923(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1 && (aFloatArray9429[i_4] != f_2 || aFloatArray9422[i_4] != f_3)) {
			aFloatArray9429[i_4] = f_2;
			aFloatArray9422[i_4] = f_3;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1132)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform2f(i_4, f_2, f_3);
		}

	}

	@Override
	void method1924(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457() != Class111.aClass111_1168)
			throw new AssertionError();
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1)
			OpenGL.glUniform2fv(i_3, 4, matrix44_2.method6551(aFloatArray9427), 0);
	}

	@Override
	void method1925(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457() != Class111.aClass111_1168)
			throw new AssertionError();
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1)
			OpenGL.glUniform2fv(i_3, 4, matrix44_2.method6551(aFloatArray9427), 0);
	}

	@Override
	void method1926(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457() != Class111.aClass111_1150)
			throw new AssertionError();
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1)
			OpenGL.glUniform4fv(i_3, 4, matrix44_2.method6517(aFloatArray9427), 0);
	}

	@Override
	void method1927(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457() != Class111.aClass111_1150)
			throw new AssertionError();
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1)
			OpenGL.glUniform4fv(i_3, 4, matrix44_2.method6517(aFloatArray9427), 0);
	}

	@Override
	void method1928(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 obj_3) {
		Interface30 obj_31 = obj_3;
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			if (obj_31 == null)
				obj_31 = aGraphicalRenderer_Sub2_Sub1_9419.anInterface6_8788;

			if (i_2 < aGraphicalRenderer_Sub2_Sub1_9419.anInt8825) {
				aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
				aGraphicalRenderer_Sub2_Sub1_9419.method14035(obj_31);
			} else {
				OpenGL.glActiveTexture(33984 + i_2);
				OpenGL.glBindTexture(((Class319) obj_31).anInt3707, ((Class319) obj_31).anInt3706);
			}

			if (anIntArray9433[i_4] != i_2) {
				anIntArray9433[i_4] = i_2;
				OpenGL.glUniform1i(i_4, i_2);
			}
		}

	}

	@Override
	void method1929(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 obj_3) {
		Interface30 obj_31 = obj_3;
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			if (obj_31 == null)
				obj_31 = aGraphicalRenderer_Sub2_Sub1_9419.anInterface6_8788;

			if (i_2 < aGraphicalRenderer_Sub2_Sub1_9419.anInt8825) {
				aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
				aGraphicalRenderer_Sub2_Sub1_9419.method14035(obj_31);
			} else {
				OpenGL.glActiveTexture(33984 + i_2);
				OpenGL.glBindTexture(((Class319) obj_31).anInt3707, ((Class319) obj_31).anInt3706);
			}

			if (anIntArray9433[i_4] != i_2) {
				anIntArray9433[i_4] = i_2;
				OpenGL.glUniform1i(i_4, i_2);
			}
		}

	}

	@Override
	void method1930(Node_Sub21_Sub1 class282_sub21_sub1_1, int i_2, Interface30 obj_3) {
		Interface30 obj_31 = obj_3;
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1) {
			if (obj_31 == null)
				obj_31 = aGraphicalRenderer_Sub2_Sub1_9419.anInterface6_8788;

			if (i_2 < aGraphicalRenderer_Sub2_Sub1_9419.anInt8825) {
				aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
				aGraphicalRenderer_Sub2_Sub1_9419.method14035(obj_31);
			} else {
				OpenGL.glActiveTexture(33984 + i_2);
				OpenGL.glBindTexture(((Class319) obj_31).anInt3707, ((Class319) obj_31).anInt3706);
			}

			if (anIntArray9433[i_4] != i_2) {
				anIntArray9433[i_4] = i_2;
				OpenGL.glUniform1i(i_4, i_2);
			}
		}

	}

	@Override
	void method1931(int i_1, float f_2, float f_3, float f_4) {
		OpenGL.glUniform3f(i_1, f_2, f_3, f_4);
	}

	@Override
	void method1932(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	@Override
	void method1933(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	@Override
	void method1934(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	@Override
	void method1935(int i_1, float f_2, float f_3, float f_4, float f_5) {
		OpenGL.glUniform4f(i_1, f_2, f_3, f_4, f_5);
	}

	@Override
	void method1936(Node_Sub21_Sub1 class282_sub21_sub1_1, Matrix44 matrix44_2) {
		if (!$assertionsDisabled && class282_sub21_sub1_1.method15457() != Class111.aClass111_1168)
			throw new AssertionError();
		int i_3 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_3 != -1)
			OpenGL.glUniform2fv(i_3, 4, matrix44_2.method6551(aFloatArray9427), 0);
	}

	@Override
	void method1937(int i_1, float[] floats_2, int i_3) {
		OpenGL.glUniform4fv(i_1, i_3, floats_2, 0);
	}

	@Override
	void method1938(int i_1, float[] floats_2, int i_3) {
		OpenGL.glUniform4fv(i_1, i_3, floats_2, 0);
	}

	@Override
	void method1939(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4) {
		int i_5 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_5 != -1 && (aFloatArray9429[i_5] != f_2 || aFloatArray9422[i_5] != f_3 || aFloatArray9431[i_5] != f_4)) {
			aFloatArray9429[i_5] = f_2;
			aFloatArray9422[i_5] = f_3;
			aFloatArray9431[i_5] = f_4;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1133)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform3f(i_5, f_2, f_3, f_4);
		}

	}

	@Override
	void method1940(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform3fv(i_1, 3, matrix44_2.method6544(aFloatArray9427), 0);
	}

	@Override
	void method1941(Node_Sub21_Sub1 class282_sub21_sub1_1, float f_2, float f_3, float f_4, float f_5) {
		int i_6 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_6 != -1 && (aFloatArray9429[i_6] != f_2 || aFloatArray9422[i_6] != f_3 || aFloatArray9431[i_6] != f_4 || aFloatArray9432[i_6] != f_5)) {
			aFloatArray9429[i_6] = f_2;
			aFloatArray9422[i_6] = f_3;
			aFloatArray9431[i_6] = f_4;
			aFloatArray9432[i_6] = f_5;
			if (class282_sub21_sub1_1.method15457() != Class111.aClass111_1134)
				throw new IllegalArgumentException_Sub1();

			OpenGL.glUniform4f(i_6, f_2, f_3, f_4, f_5);
		}

	}

	@Override
	void method1942(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform2fv(i_1, 4, matrix44_2.method6551(aFloatArray9427), 0);
	}

	@Override
	void method1943(int i_1, Matrix44 matrix44_2) {
		OpenGL.glUniform4fv(i_1, 4, matrix44_2.method6517(aFloatArray9427), 0);
	}

	@Override
	void method1944(Node_Sub21_Sub1 class282_sub21_sub1_1, float[] floats_2, int i_3) {
		int i_4 = ((Node_Sub21_Sub1_Sub2) class282_sub21_sub1_1).method15788();
		if (i_4 != -1)
			OpenGL.glUniform4fv(i_4, i_3, floats_2, 0);

	}

	@Override
	void method1945(int i_1, int i_2, Interface30 interface30_3) {
		aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	@Override
	void method1946(int i_1, int i_2, Interface30 interface30_3) {
		aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	@Override
	void method1947(int i_1, int i_2, Interface30 interface30_3) {
		aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	@Override
	void method1948(int i_1, int i_2, Interface30 interface30_3) {
		aGraphicalRenderer_Sub2_Sub1_9419.method14163(i_2);
		aGraphicalRenderer_Sub2_Sub1_9419.method14035(interface30_3);
		OpenGL.glUniform1i(i_1, i_2);
	}

	@Override
	public void method26() {
		if (anInt9423 != 0) {
			aGraphicalRenderer_Sub2_Sub1_9419.method15573(anInt9423);
			if (anInt9435 != 0)
				aGraphicalRenderer_Sub2_Sub1_9419.method15580(anInt9435);

			if (anInt9424 != 0)
				aGraphicalRenderer_Sub2_Sub1_9419.method15580(anInt9424);

			anInt9423 = 0;
			anInt9435 = 0;
			anInt9424 = 0;
		}

	}

	@Override
	public void method32() {
		if (anInt9423 != 0) {
			aGraphicalRenderer_Sub2_Sub1_9419.method15573(anInt9423);
			if (anInt9435 != 0)
				aGraphicalRenderer_Sub2_Sub1_9419.method15580(anInt9435);

			if (anInt9424 != 0)
				aGraphicalRenderer_Sub2_Sub1_9419.method15580(anInt9424);

			anInt9423 = 0;
			anInt9435 = 0;
			anInt9424 = 0;
		}

	}

}
