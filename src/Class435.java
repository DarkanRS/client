
/* Class435 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class435 {
	static NodeCollection aClass482_5332 = new NodeCollection();

	static Class method7293(String string) throws ClassNotFoundException {
		if (string.equals("B"))
			return Byte.TYPE;
		if (string.equals("I"))
			return Integer.TYPE;
		if (string.equals("S"))
			return Short.TYPE;
		if (string.equals("J"))
			return Long.TYPE;
		if (string.equals("Z"))
			return Boolean.TYPE;
		if (string.equals("F"))
			return Float.TYPE;
		if (string.equals("D"))
			return Double.TYPE;
		if (string.equals("C"))
			return Character.TYPE;
		if (string.equals("void"))
			return Void.TYPE;
		return Class.forName(string);
	}

	public static void method7294(RsBitsBuffer class282_sub35_sub2) {
		Class282_Sub42 class282_sub42 = (Class282_Sub42) aClass482_5332.head((byte) 27);
		if (class282_sub42 != null) {
			int i = class282_sub35_sub2.index * -1990677291;
			class282_sub35_sub2.writeInt(1935007287 * (((Class282_Sub42) class282_sub42).anInt8038));
			for (int i_0_ = 0; (i_0_ < -286349405 * ((Class282_Sub42) class282_sub42).anInt8033); i_0_++) {
				if (0 != ((Class282_Sub42) class282_sub42).anIntArray8036[i_0_])
					class282_sub35_sub2.writeByte((((Class282_Sub42) class282_sub42).anIntArray8036[i_0_]));
				else {
					try {
						int i_1_ = (((Class282_Sub42) class282_sub42).anIntArray8035[i_0_]);
						if (i_1_ == 0) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_0_]);
							int i_2_ = field.getInt(null);
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_2_);
						} else if (1 == i_1_) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_0_]);
							field.setInt(null, (((Class282_Sub42) class282_sub42).anIntArray8040[i_0_]));
							class282_sub35_sub2.writeByte(0);
						} else if (2 == i_1_) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_0_]);
							int i_3_ = field.getModifiers();
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_3_);
						}
						if (i_1_ == 3) {
							Method method = (((Class282_Sub42) class282_sub42).aMethodArray8034[i_0_]);
							byte[][] is = (((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041[i_0_]);
							Object[] objects = new Object[is.length];
							for (int i_4_ = 0; i_4_ < is.length; i_4_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_4_])));
								objects[i_4_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class282_sub35_sub2.writeByte(0);
							else if (object instanceof Number) {
								class282_sub35_sub2.writeByte(1);
								class282_sub35_sub2.writeLong(((Number) object).longValue());
							} else if (object instanceof String) {
								class282_sub35_sub2.writeByte(2);
								class282_sub35_sub2.writeString((String) object);
							} else
								class282_sub35_sub2.writeByte(4);
						} else if (i_1_ == 4) {
							Method method = (((Class282_Sub42) class282_sub42).aMethodArray8034[i_0_]);
							int i_5_ = method.getModifiers();
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_5_);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class282_sub35_sub2.writeByte(-10);
					} catch (InvalidClassException invalidclassexception) {
						class282_sub35_sub2.writeByte(-11);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class282_sub35_sub2.writeByte(-12);
					} catch (OptionalDataException optionaldataexception) {
						class282_sub35_sub2.writeByte(-13);
					} catch (IllegalAccessException illegalaccessexception) {
						class282_sub35_sub2.writeByte(-14);
					} catch (IllegalArgumentException illegalargumentexception) {
						class282_sub35_sub2.writeByte(-15);
					} catch (InvocationTargetException invocationtargetexception) {
						class282_sub35_sub2.writeByte(-16);
					} catch (SecurityException securityexception) {
						class282_sub35_sub2.writeByte(-17);
					} catch (IOException ioexception) {
						class282_sub35_sub2.writeByte(-18);
					} catch (NullPointerException nullpointerexception) {
						class282_sub35_sub2.writeByte(-19);
					} catch (Exception exception) {
						class282_sub35_sub2.writeByte(-20);
					} catch (Throwable throwable) {
						class282_sub35_sub2.writeByte(-21);
					}
				}
			}
			class282_sub35_sub2.method13104(i, 1491760652);
			class282_sub42.remove();
		}
	}

	public static void method7295() {
		aClass482_5332 = new NodeCollection();
	}

	public static void method7296() {
		aClass482_5332 = new NodeCollection();
	}

	Class435() throws Throwable {
		throw new Error();
	}

	public static void method7297(RsByteBuffer class282_sub35, int i) {
		Class282_Sub42 class282_sub42 = new Class282_Sub42();
		((Class282_Sub42) class282_sub42).anInt8033 = class282_sub35.readUnsignedByte() * 1029882891;
		((Class282_Sub42) class282_sub42).anInt8038 = class282_sub35.readInt() * 1339438983;
		((Class282_Sub42) class282_sub42).anIntArray8035 = (new int[((Class282_Sub42) class282_sub42).anInt8033 * -286349405]);
		((Class282_Sub42) class282_sub42).anIntArray8036 = (new int[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aFieldArray8037 = (new Field[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).anIntArray8040 = (new int[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aMethodArray8034 = (new Method[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041 = (new byte[((Class282_Sub42) class282_sub42).anInt8033 * -286349405][][]);
		for (int i_6_ = 0; i_6_ < ((Class282_Sub42) class282_sub42).anInt8033 * -286349405; i_6_++) {
			try {
				int i_7_ = class282_sub35.readUnsignedByte();
				if (i_7_ == 0 || 1 == i_7_ || i_7_ == 2) {
					String string = class282_sub35.readString();
					String string_8_ = class282_sub35.readString();
					int i_9_ = 0;
					if (1 == i_7_)
						i_9_ = class282_sub35.readInt();
					((Class282_Sub42) class282_sub42).anIntArray8035[i_6_] = i_7_;
					((Class282_Sub42) class282_sub42).anIntArray8040[i_6_] = i_9_;
					if (Class148.method2553(string, (short) 11600).getClassLoader() == null)
						throw new SecurityException();
					((Class282_Sub42) class282_sub42).aFieldArray8037[i_6_] = Class148.method2553(string, (short) 22853).getDeclaredField(string_8_);
				} else if (3 == i_7_ || 4 == i_7_) {
					String string = class282_sub35.readString();
					String string_10_ = class282_sub35.readString();
					int i_11_ = class282_sub35.readUnsignedByte();
					String[] strings = new String[i_11_];
					for (int i_12_ = 0; i_12_ < i_11_; i_12_++)
						strings[i_12_] = class282_sub35.readString();
					String string_13_ = class282_sub35.readString();
					byte[][] is = new byte[i_11_][];
					if (3 == i_7_) {
						for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
							int i_15_ = class282_sub35.readInt();
							is[i_14_] = new byte[i_15_];
							class282_sub35.readBytes(is[i_14_], 0, i_15_, 2066553299);
						}
					}
					((Class282_Sub42) class282_sub42).anIntArray8035[i_6_] = i_7_;
					Class[] var_classes = new Class[i_11_];
					for (int i_16_ = 0; i_16_ < i_11_; i_16_++)
						var_classes[i_16_] = Class148.method2553(strings[i_16_], (short) 29429);
					Class var_class = Class148.method2553(string_13_, (short) 10269);
					if (Class148.method2553(string, (short) 8789).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class148.method2553(string, (short) 24538).getDeclaredMethods();
					Method[] methods_17_ = methods;
					for (int i_18_ = 0; i_18_ < methods_17_.length; i_18_++) {
						Method method = methods_17_[i_18_];
						if (method.getName().equals(string_10_)) {
							Class[] var_classes_19_ = method.getParameterTypes();
							if (var_classes.length == var_classes_19_.length) {
								boolean bool = true;
								for (int i_20_ = 0; i_20_ < var_classes.length; i_20_++) {
									if (var_classes[i_20_] != var_classes_19_[i_20_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									((Class282_Sub42) class282_sub42).aMethodArray8034[i_6_] = method;
							}
						}
					}
					((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041[i_6_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -1;
			} catch (SecurityException securityexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -2;
			} catch (NullPointerException nullpointerexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -3;
			} catch (Exception exception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -4;
			} catch (Throwable throwable) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_6_] = -5;
			}
		}
		aClass482_5332.append(class282_sub42, -1342758977);
	}

	public static void method7298(RsByteBuffer class282_sub35, int i) {
		Class282_Sub42 class282_sub42 = new Class282_Sub42();
		((Class282_Sub42) class282_sub42).anInt8033 = class282_sub35.readUnsignedByte() * 1029882891;
		((Class282_Sub42) class282_sub42).anInt8038 = class282_sub35.readInt() * 1339438983;
		((Class282_Sub42) class282_sub42).anIntArray8035 = (new int[((Class282_Sub42) class282_sub42).anInt8033 * -286349405]);
		((Class282_Sub42) class282_sub42).anIntArray8036 = (new int[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aFieldArray8037 = (new Field[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).anIntArray8040 = (new int[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aMethodArray8034 = (new Method[-286349405 * ((Class282_Sub42) class282_sub42).anInt8033]);
		((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041 = (new byte[((Class282_Sub42) class282_sub42).anInt8033 * -286349405][][]);
		for (int i_21_ = 0; i_21_ < ((Class282_Sub42) class282_sub42).anInt8033 * -286349405; i_21_++) {
			try {
				int i_22_ = class282_sub35.readUnsignedByte();
				if (i_22_ == 0 || 1 == i_22_ || i_22_ == 2) {
					String string = class282_sub35.readString();
					String string_23_ = class282_sub35.readString();
					int i_24_ = 0;
					if (1 == i_22_)
						i_24_ = class282_sub35.readInt();
					((Class282_Sub42) class282_sub42).anIntArray8035[i_21_] = i_22_;
					((Class282_Sub42) class282_sub42).anIntArray8040[i_21_] = i_24_;
					if (Class148.method2553(string, (short) 8359).getClassLoader() == null)
						throw new SecurityException();
					((Class282_Sub42) class282_sub42).aFieldArray8037[i_21_] = Class148.method2553(string, (short) 25870).getDeclaredField(string_23_);
				} else if (3 == i_22_ || 4 == i_22_) {
					String string = class282_sub35.readString();
					String string_25_ = class282_sub35.readString();
					int i_26_ = class282_sub35.readUnsignedByte();
					String[] strings = new String[i_26_];
					for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
						strings[i_27_] = class282_sub35.readString();
					String string_28_ = class282_sub35.readString();
					byte[][] is = new byte[i_26_][];
					if (3 == i_22_) {
						for (int i_29_ = 0; i_29_ < i_26_; i_29_++) {
							int i_30_ = class282_sub35.readInt();
							is[i_29_] = new byte[i_30_];
							class282_sub35.readBytes(is[i_29_], 0, i_30_, 404199347);
						}
					}
					((Class282_Sub42) class282_sub42).anIntArray8035[i_21_] = i_22_;
					Class[] var_classes = new Class[i_26_];
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
						var_classes[i_31_] = Class148.method2553(strings[i_31_], (short) 11211);
					Class var_class = Class148.method2553(string_28_, (short) 24149);
					if (Class148.method2553(string, (short) 21540).getClassLoader() == null)
						throw new SecurityException();
					Method[] methods = Class148.method2553(string, (short) 8495).getDeclaredMethods();
					Method[] methods_32_ = methods;
					for (int i_33_ = 0; i_33_ < methods_32_.length; i_33_++) {
						Method method = methods_32_[i_33_];
						if (method.getName().equals(string_25_)) {
							Class[] var_classes_34_ = method.getParameterTypes();
							if (var_classes.length == var_classes_34_.length) {
								boolean bool = true;
								for (int i_35_ = 0; i_35_ < var_classes.length; i_35_++) {
									if (var_classes[i_35_] != var_classes_34_[i_35_]) {
										bool = false;
										break;
									}
								}
								if (bool && var_class == method.getReturnType())
									((Class282_Sub42) class282_sub42).aMethodArray8034[i_21_] = method;
							}
						}
					}
					((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041[i_21_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_21_] = -1;
			} catch (SecurityException securityexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_21_] = -2;
			} catch (NullPointerException nullpointerexception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_21_] = -3;
			} catch (Exception exception) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_21_] = -4;
			} catch (Throwable throwable) {
				((Class282_Sub42) class282_sub42).anIntArray8036[i_21_] = -5;
			}
		}
		aClass482_5332.append(class282_sub42, 1807094121);
	}

	public static void method7299(RsBitsBuffer class282_sub35_sub2) {
		Class282_Sub42 class282_sub42 = (Class282_Sub42) aClass482_5332.head((byte) 86);
		if (class282_sub42 != null) {
			int i = class282_sub35_sub2.index * -1990677291;
			class282_sub35_sub2.writeInt(1935007287 * (((Class282_Sub42) class282_sub42).anInt8038));
			for (int i_36_ = 0; (i_36_ < -286349405 * ((Class282_Sub42) class282_sub42).anInt8033); i_36_++) {
				if (0 != ((Class282_Sub42) class282_sub42).anIntArray8036[i_36_])
					class282_sub35_sub2.writeByte((((Class282_Sub42) class282_sub42).anIntArray8036[i_36_]));
				else {
					try {
						int i_37_ = (((Class282_Sub42) class282_sub42).anIntArray8035[i_36_]);
						if (i_37_ == 0) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_36_]);
							int i_38_ = field.getInt(null);
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_38_);
						} else if (1 == i_37_) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_36_]);
							field.setInt(null, (((Class282_Sub42) class282_sub42).anIntArray8040[i_36_]));
							class282_sub35_sub2.writeByte(0);
						} else if (2 == i_37_) {
							Field field = (((Class282_Sub42) class282_sub42).aFieldArray8037[i_36_]);
							int i_39_ = field.getModifiers();
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_39_);
						}
						if (i_37_ == 3) {
							Method method = (((Class282_Sub42) class282_sub42).aMethodArray8034[i_36_]);
							byte[][] is = (((Class282_Sub42) class282_sub42).aByteArrayArrayArray8041[i_36_]);
							Object[] objects = new Object[is.length];
							for (int i_40_ = 0; i_40_ < is.length; i_40_++) {
								ObjectInputStream objectinputstream = (new ObjectInputStream(new ByteArrayInputStream(is[i_40_])));
								objects[i_40_] = objectinputstream.readObject();
							}
							Object object = method.invoke(null, objects);
							if (null == object)
								class282_sub35_sub2.writeByte(0);
							else if (object instanceof Number) {
								class282_sub35_sub2.writeByte(1);
								class282_sub35_sub2.writeLong(((Number) object).longValue());
							} else if (object instanceof String) {
								class282_sub35_sub2.writeByte(2);
								class282_sub35_sub2.writeString((String) object);
							} else
								class282_sub35_sub2.writeByte(4);
						} else if (i_37_ == 4) {
							Method method = (((Class282_Sub42) class282_sub42).aMethodArray8034[i_36_]);
							int i_41_ = method.getModifiers();
							class282_sub35_sub2.writeByte(0);
							class282_sub35_sub2.writeInt(i_41_);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						class282_sub35_sub2.writeByte(-10);
					} catch (InvalidClassException invalidclassexception) {
						class282_sub35_sub2.writeByte(-11);
					} catch (StreamCorruptedException streamcorruptedexception) {
						class282_sub35_sub2.writeByte(-12);
					} catch (OptionalDataException optionaldataexception) {
						class282_sub35_sub2.writeByte(-13);
					} catch (IllegalAccessException illegalaccessexception) {
						class282_sub35_sub2.writeByte(-14);
					} catch (IllegalArgumentException illegalargumentexception) {
						class282_sub35_sub2.writeByte(-15);
					} catch (InvocationTargetException invocationtargetexception) {
						class282_sub35_sub2.writeByte(-16);
					} catch (SecurityException securityexception) {
						class282_sub35_sub2.writeByte(-17);
					} catch (IOException ioexception) {
						class282_sub35_sub2.writeByte(-18);
					} catch (NullPointerException nullpointerexception) {
						class282_sub35_sub2.writeByte(-19);
					} catch (Exception exception) {
						class282_sub35_sub2.writeByte(-20);
					} catch (Throwable throwable) {
						class282_sub35_sub2.writeByte(-21);
					}
				}
			}
			class282_sub35_sub2.method13104(i, -1139639151);
			class282_sub42.remove();
		}
	}

	public static Class268 method7300(int i, int i_42_, int i_43_, int i_44_, boolean bool, int i_45_, int i_46_) {
		if ((bool ? Class393.aClass282_Sub54_4783.aClass468_Sub13_8227.method12714(1497954665) : Class393.aClass282_Sub54_4783.aClass468_Sub13_8225.method12714(346781978)) != 0 && i_42_ != 0 && -458827259 * Class260.anInt3219 < 50 && -1 != i) {
			Class268 class268 = new Class268(bool ? (byte) 3 : (byte) 2, i, i_42_, i_43_, i_44_, 0, i_45_, null);
			Class260.aClass268Array3232[(Class260.anInt3219 += -1221598515) * -458827259 - 1] = class268;
			return class268;
		}
		return null;
	}

	static void method7301(Class293[][][] class293s, byte i) {
		for (int i_47_ = 0; i_47_ < class293s.length; i_47_++) {
			Class293[][] class293s_48_ = class293s[i_47_];
			for (int i_49_ = 0; i_49_ < class293s_48_.length; i_49_++) {
				for (int i_50_ = 0; i_50_ < class293s_48_[i_49_].length; i_50_++) {
					Class293 class293 = class293s_48_[i_49_][i_50_];
					if (null != class293) {
						if (class293.aClass521_Sub1_Sub3_3499 instanceof SceneObject)
							((SceneObject) class293.aClass521_Sub1_Sub3_3499).method85((byte) 1);
						if (class293.aClass521_Sub1_Sub4_3503 instanceof SceneObject)
							((SceneObject) class293.aClass521_Sub1_Sub4_3503).method85((byte) 1);
						if (class293.aClass521_Sub1_Sub4_3500 instanceof SceneObject)
							((SceneObject) class293.aClass521_Sub1_Sub4_3500).method85((byte) 1);
						if (class293.aClass521_Sub1_Sub5_3505 instanceof SceneObject)
							((SceneObject) class293.aClass521_Sub1_Sub5_3505).method85((byte) 1);
						if (class293.aClass521_Sub1_Sub5_3502 instanceof SceneObject)
							((SceneObject) class293.aClass521_Sub1_Sub5_3502).method85((byte) 1);
						for (Class208 class208 = class293.aClass208_3504; class208 != null; class208 = class208.aClass208_2660) {
							Class521_Sub1_Sub1 class521_sub1_sub1 = class208.aClass521_Sub1_Sub1_2659;
							if (class521_sub1_sub1 instanceof SceneObject)
								((SceneObject) class521_sub1_sub1).method85((byte) 1);
						}
					}
				}
			}
		}
	}

	static final void method7302(GraphicalRenderer class505, Interface22 interface22, byte i) {
		if (null != Class291_Sub1.aClass282_Sub50_Sub6_3491) {
			Class169.method2869(1719554572);
			Class169.method2869(1888552596);
			if (-8084891 * Class291_Sub1.anInt8015 < 10) {
				if (!Class291_Sub1.aClass317_3460.method5629(Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533, 71472045)) {
					Class291_Sub1.anInt8015 = (IndexLoaders.WORLD_MAP_INDEX.method5631((Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533), (byte) 95)) / 10 * -45072531;
					return;
				}
				NPCDefinitions.method6907(-1568053655);
				Class291_Sub1.anInt8015 = -450725310;
			}
			if (Class291_Sub1.anInt8015 * -8084891 == 10) {
				Class291_Sub1.anInt3472 = -742910705 * (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9539) >> 6 << 6;
				Class291_Sub1.anInt3473 = (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9541 * 458255425) >> 6 << 6;
				Class291_Sub1.xLength = ((235539227 * Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9540) >> 6 << 6) - Class291_Sub1.anInt3472 + 64;
				Class291_Sub1.yLength = ((1097246003 * Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9535) >> 6 << 6) - Class291_Sub1.anInt3473 + 64;
				int[] is = new int[3];
				int i_51_ = -1;
				int i_52_ = -1;
				Vector3 class385 = (Class84.myPlayer.method11166().aClass385_3595);
				CoordGrid class219 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(1209620896);
				if (Class291_Sub1.aClass282_Sub50_Sub6_3491.method14778(Class84.myPlayer.plane, (class219.x * 1948093437 + ((int) class385.x >> 9)), (((int) class385.z >> 9) + class219.y * -1002240017), is, -1889386276)) {
					i_51_ = is[1] - Class291_Sub1.anInt3472;
					i_52_ = is[2] - Class291_Sub1.anInt3473;
				}
				if (!Class291_Sub1.aBool8028 && i_51_ >= 0 && i_51_ < Class291_Sub1.xLength && i_52_ >= 0 && i_52_ < Class291_Sub1.yLength) {
					i_51_ += (int) (Math.random() * 10.0) - 5;
					i_52_ += (int) (Math.random() * 10.0) - 5;
					Class427.anInt5123 = i_51_ * 1714827959;
					Class475.anInt5624 = 1710901657 * i_52_;
				} else if (-1 != Class291_Sub1.anInt8019 * 634461411 && -812481713 * Class291_Sub1.anInt8020 != -1) {
					Class291_Sub1.aClass282_Sub50_Sub6_3491.method14777(634461411 * Class291_Sub1.anInt8019, Class291_Sub1.anInt8020 * -812481713, is, -1997642770);
					if (is != null) {
						Class427.anInt5123 = 1714827959 * (is[1] - Class291_Sub1.anInt3472);
						Class475.anInt5624 = 1710901657 * (is[2] - Class291_Sub1.anInt3473);
					}
					Class291_Sub1.anInt8020 = -611890095;
					Class291_Sub1.anInt8019 = -776800459;
					Class291_Sub1.aBool8028 = false;
				} else {
					Class291_Sub1.aClass282_Sub50_Sub6_3491.method14777(556833041 * (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9532) >> 14 & 0x3fff, (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9532 * 556833041) & 0x3fff, is, -2052252503);
					Class427.anInt5123 = 1714827959 * (is[1] - Class291_Sub1.anInt3472);
					Class475.anInt5624 = (is[2] - Class291_Sub1.anInt3473) * 1710901657;
				}
				if (37 == (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695)) {
					Class291_Sub1.aFloat3468 = 3.0F;
					Class291_Sub1.aFloat3462 = 3.0F;
				} else if (-1337359695 * (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542) == 50) {
					Class291_Sub1.aFloat3468 = 4.0F;
					Class291_Sub1.aFloat3462 = 4.0F;
				} else if (-1337359695 * (Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542) == 75) {
					Class291_Sub1.aFloat3468 = 6.0F;
					Class291_Sub1.aFloat3462 = 6.0F;
				} else if ((Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695) == 100) {
					Class291_Sub1.aFloat3468 = 8.0F;
					Class291_Sub1.aFloat3462 = 8.0F;
				} else if ((Class291_Sub1.aClass282_Sub50_Sub6_3491.anInt9542 * -1337359695) == 200) {
					Class291_Sub1.aFloat3468 = 16.0F;
					Class291_Sub1.aFloat3462 = 16.0F;
				} else {
					Class291_Sub1.aFloat3468 = 8.0F;
					Class291_Sub1.aFloat3462 = 8.0F;
				}
				Class291_Sub1.anInt3469 = (int) Class291_Sub1.aFloat3468 >> 1;
				Class291_Sub1.aByteArrayArrayArray3464 = CircularBuffer.method8246(Class291_Sub1.anInt3469, (short) 8192);
				Class89.method1502(-931909822);
				Class291_Sub1.method5126();
				Class346.aClass482_4049 = new NodeCollection();
				Class291_Sub1.anInt3454 += (int) (Math.random() * 5.0) - 2;
				if (Class291_Sub1.anInt3454 < -8)
					Class291_Sub1.anInt3454 = -8;
				if (Class291_Sub1.anInt3454 > 8)
					Class291_Sub1.anInt3454 = 8;
				Class291_Sub1.anInt3463 += (int) (Math.random() * 5.0) - 2;
				if (Class291_Sub1.anInt3463 < -16)
					Class291_Sub1.anInt3463 = -16;
				if (Class291_Sub1.anInt3463 > 16)
					Class291_Sub1.anInt3463 = 16;
				Class291_Sub1.method5132(interface22, Class291_Sub1.anInt3454 >> 2 << 10, Class291_Sub1.anInt3463 >> 1);
				Class291_Sub1.aClass218_3456.method3697(1024, 256, 2137741394);
				Class291_Sub1.aClass427_3457.method7175(256, 256, 993879963);
				Class291_Sub1.aClass474_3455.method7899(4096, -2034610586);
				IndexLoaders.aClass230_147.method3906(256, (short) 727);
				Class291_Sub1.anInt8015 = -901450620;
			} else if (20 == Class291_Sub1.anInt8015 * -8084891) {
				Exception_Sub3.method15619(true, -484129587);
				Class291_Sub1.method5183(class505, Class291_Sub1.anInt3454, Class291_Sub1.anInt3463);
				Class291_Sub1.anInt8015 = 1590615436;
				Exception_Sub3.method15619(true, 771628468);
				Class282_Sub15_Sub1.method14840((byte) -59);
			} else if (60 == Class291_Sub1.anInt8015 * -8084891) {
				if (Class291_Sub1.aClass317_3460.validFile(new StringBuilder().append(Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), 1399536954)) {
					if (!Class291_Sub1.aClass317_3460.method5629(new StringBuilder().append(Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), 71472045))
						return;
					Class291_Sub1.aClass283_3470 = Class301.method5331(Class291_Sub1.aClass317_3460, new StringBuilder().append(Class291_Sub1.aClass282_Sub50_Sub6_3491.aString9533).append("_staticelements").toString(), client.membersWorld, 874508557);
				} else
					Class291_Sub1.aClass283_3470 = new Class283(0);
				Class291_Sub1.method5145();
				Class291_Sub1.anInt8015 = 1139890126;
				Exception_Sub3.method15619(true, -147678453);
				Class282_Sub15_Sub1.method14840((byte) -22);
			} else if (-8084891 * Class291_Sub1.anInt8015 == 70) {
				Class494.aClass194_5794 = new Class194(class505, 11, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 1004672533;
				Exception_Sub3.method15619(true, -1670495557);
				Class282_Sub15_Sub1.method14840((byte) 30);
			} else if (-8084891 * Class291_Sub1.anInt8015 == 73) {
				Class291_Sub1.aClass194_8017 = new Class194(class505, 12, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 869454940;
				Exception_Sub3.method15619(true, -1191023445);
				Class282_Sub15_Sub1.method14840((byte) -90);
			} else if (-8084891 * Class291_Sub1.anInt8015 == 76) {
				Class291_Sub1.aClass194_8023 = new Class194(class505, 14, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 734237347;
				Exception_Sub3.method15619(true, -2098673020);
				Class282_Sub15_Sub1.method14840((byte) -57);
			} else if (79 == -8084891 * Class291_Sub1.anInt8015) {
				Class446.aClass194_5416 = new Class194(class505, 17, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 599019754;
				Exception_Sub3.method15619(true, 784313452);
				Class282_Sub15_Sub1.method14840((byte) 55);
			} else if (-8084891 * Class291_Sub1.anInt8015 == 82) {
				Class114.aClass194_1243 = new Class194(class505, 19, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 463802161;
				Exception_Sub3.method15619(true, 299968314);
				Class282_Sub15_Sub1.method14840((byte) -88);
			} else if (-8084891 * Class291_Sub1.anInt8015 == 85) {
				DefaultsFile.aClass194_6967 = new Class194(class505, 22, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 328584568;
				Exception_Sub3.method15619(true, 735044045);
				Class282_Sub15_Sub1.method14840((byte) -35);
			} else if (-8084891 * Class291_Sub1.anInt8015 == 88) {
				Class251.aClass194_3103 = new Class194(class505, 26, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = 193366975;
				Exception_Sub3.method15619(true, 1741477937);
				Class282_Sub15_Sub1.method14840((byte) -64);
			} else {
				Class521_Sub1_Sub5_Sub1.aClass194_10527 = new Class194(class505, 30, true, Class351.gameCanvas);
				Class291_Sub1.anInt8015 = -212285804;
				Exception_Sub3.method15619(true, -95185892);
				Class282_Sub15_Sub1.method14840((byte) -14);
				System.gc();
			}
		}
	}

	public static String method7303(Class282_Sub50_Sub7 class282_sub50_sub7, byte i) {
		if (Class20.aBool161 || class282_sub50_sub7 == null)
			return "";
		if ((((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588 == null || ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588.length() == 0) && null != ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585 && ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585.length() > 0)
			return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9585;
		return ((Class282_Sub50_Sub7) class282_sub50_sub7).aString9588;
	}
}
