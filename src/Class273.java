/* Class273 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Desktop;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;

public class Class273 {
	public static Class273 aClass273_2904;
	static Class273 aClass273_2905 = new Class273();
	public static Class273 aClass273_2906 = new Class273();
	static Class273 aClass273_2907;

	static {
		aClass273_2904 = new Class273();
		aClass273_2907 = new Class273();
	}

	Class273() {
		/* empty */
	}

	public static void method2559(String string, boolean bool, boolean bool_0_, String string_1_, boolean bool_2_, boolean bool_3_, int i) {
		try {
			if (bool) {
				do {
					if (!bool_2_ && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
						try {
							Desktop.getDesktop().browse(new URI(string));
						} catch (Exception exception) {
							break;
						}
						return;
					}
				} while (false);
				if (Class82_Sub8.aString6856.startsWith("win") && !bool_2_)
					Class254.method2427(string, 0, (byte) 23);
				else if (Class82_Sub8.aString6856.startsWith("mac"))
					Class65.method762(string, 1, string_1_, -1988096952);
				else
					Class254.method2427(string, 2, (byte) 77);
			} else
				Class254.method2427(string, 3, (byte) 71);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("li.f(").append(')').toString());
		}
	}

	static final void method2560(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5241 -= 1938723502;
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = Class26.method397((String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 * -203050393)]), ((String) (((ClientScript2) class403).anObjectArray5240[-203050393 * (((ClientScript2) class403).anInt5241) + 1])), Class321.aClass429_3357, -1813623072);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("li.zz(").append(')').toString());
		}
	}

	static final void method2561(ClientScript2 class403, int i) {
		try {
			boolean bool = false;
			if (client.aBoolean8638) {
				try {
					Object object = (Class212.aClass212_2426.method1953((new Object[] { Integer.valueOf(Class298_Sub41.anInt7456 * 1914527151), (Boolean.valueOf(1 == (Class287.myPlayer.gender))), Integer.valueOf(((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 -= -391880689) * 681479919)]) }), -1838433046));
					if (null != object)
						bool = ((Boolean) object).booleanValue();
				} catch (Throwable throwable) {
					/* empty */
				}
			}
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = bool ? 1 : 0;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("li.ant(").append(')').toString());
		}
	}

	static void method2562(int i, int i_4_, int i_5_, boolean bool, int i_6_, boolean bool_7_, byte i_8_) {
		try {
			if (i < i_4_) {
				int i_9_ = (i + i_4_) / 2;
				int i_10_ = i;
				Class343_Sub1 class343_sub1 = Class474.aClass343_Sub1Array5975[i_9_];
				Class474.aClass343_Sub1Array5975[i_9_] = Class474.aClass343_Sub1Array5975[i_4_];
				Class474.aClass343_Sub1Array5975[i_4_] = class343_sub1;
				for (int i_11_ = i; i_11_ < i_4_; i_11_++) {
					if (Class310.method3809((Class474.aClass343_Sub1Array5975[i_11_]), class343_sub1, i_5_, bool, i_6_, bool_7_, -279850410) <= 0) {
						Class343_Sub1 class343_sub1_12_ = Class474.aClass343_Sub1Array5975[i_11_];
						Class474.aClass343_Sub1Array5975[i_11_] = Class474.aClass343_Sub1Array5975[i_10_];
						Class474.aClass343_Sub1Array5975[i_10_++] = class343_sub1_12_;
					}
				}
				Class474.aClass343_Sub1Array5975[i_4_] = Class474.aClass343_Sub1Array5975[i_10_];
				Class474.aClass343_Sub1Array5975[i_10_] = class343_sub1;
				method2562(i, i_10_ - 1, i_5_, bool, i_6_, bool_7_, (byte) -43);
				method2562(1 + i_10_, i_4_, i_5_, bool, i_6_, bool_7_, (byte) 54);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("li.x(").append(')').toString());
		}
	}

	public static GraphicsToolkit method2563(Canvas canvas, Interface_ma interface_ma, int i, int i_13_, byte i_14_) {
		try {
			return new ja(canvas, interface_ma, i, i_13_);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("li.a(").append(')').toString());
		}
	}

	static final void method2564(ClientScript2 class403, short i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_15_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919]);
			int i_16_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 1]);
			int i_17_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239 + 2]);
			Class301_Sub1.method3713(9, i_15_ << 16 | i_16_, i_17_, "", -529750443);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("li.alx(").append(')').toString());
		}
	}

	public static int method2565(short i) {
		try {
			return 14;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("li.k(").append(')').toString());
		}
	}

	public static void method2566(RsByteBuffer stream, int i, byte i_18_) {
		try {
			Class298_Sub47 class298_sub47 = new Class298_Sub47();
			((Class298_Sub47) class298_sub47).anInt7538 = stream.readUnsignedByte() * -468176359;
			((Class298_Sub47) class298_sub47).anInt7542 = stream.readInt((byte) 43) * -530104791;
			((Class298_Sub47) class298_sub47).anIntArray7537 = (new int[((Class298_Sub47) class298_sub47).anInt7538 * 719522345]);
			((Class298_Sub47) class298_sub47).anIntArray7536 = (new int[((Class298_Sub47) class298_sub47).anInt7538 * 719522345]);
			((Class298_Sub47) class298_sub47).aFieldArray7539 = (new Field[719522345 * ((Class298_Sub47) class298_sub47).anInt7538]);
			((Class298_Sub47) class298_sub47).anIntArray7535 = (new int[((Class298_Sub47) class298_sub47).anInt7538 * 719522345]);
			((Class298_Sub47) class298_sub47).aMethodArray7541 = (new Method[719522345 * ((Class298_Sub47) class298_sub47).anInt7538]);
			((Class298_Sub47) class298_sub47).aByteArrayArrayArray7540 = (new byte[((Class298_Sub47) class298_sub47).anInt7538 * 719522345][][]);
			for (int count = 0; (count < ((Class298_Sub47) class298_sub47).anInt7538 * 719522345); count++) {
				try {
					int type = stream.readUnsignedByte();
					if (type == 0 || type == 1 || 2 == type) {
						String string = stream.readString(-1707497835);
						String string_21_ = stream.readString(-976277803);
						int i_22_ = 0;
						if (1 == type)
							i_22_ = stream.readInt((byte) -46);
						((Class298_Sub47) class298_sub47).anIntArray7537[count] = type;
						((Class298_Sub47) class298_sub47).anIntArray7535[count] = i_22_;
						if (Class136.method1498(string, (byte) 67).getClassLoader() == null) {
							throw new SecurityException();
						}
						((Class298_Sub47) class298_sub47).aFieldArray7539[count] = Class136.method1498(string, (byte) 81).getDeclaredField(string_21_);
					} else if (type == 3 || 4 == type) {
						String fieldType = stream.readString(-1377559322);
						String methodName = stream.readString(1945683710);
						int numParams = stream.readUnsignedByte();
						String[] parameterTypes = new String[numParams];
						for (int i_25_ = 0; i_25_ < numParams; i_25_++)
							parameterTypes[i_25_] = stream.readString(-1854507369);
						String returnType = stream.readString(-1619475079);
						byte[][] is = new byte[numParams][];
						if (type == 3) {
							for (int i_27_ = 0; i_27_ < numParams; i_27_++) {
								int i_28_ = stream.readInt((byte) -44);
								is[i_27_] = new byte[i_28_];
								stream.readBytes(is[i_27_], 0, i_28_, -953523806);
							}
						}
						((Class298_Sub47) class298_sub47).anIntArray7537[count] = type;
						Class[] parameters = new Class[numParams];
						for (int idx = 0; idx < numParams; idx++)
							parameters[idx] = Class136.method1498(parameterTypes[idx], (byte) 64);
						Class returnTypeClass = Class136.method1498(returnType, (byte) 5);
						if (Class136.method1498(fieldType, (byte) 23).getClassLoader() == null) {
							throw new SecurityException();
						}
						Method[] methods = Class136.method1498(fieldType, (byte) 42).getDeclaredMethods();
						Method[] methods_30_ = methods;
						for (int i_31_ = 0; i_31_ < methods_30_.length; i_31_++) {
							Method method = methods_30_[i_31_];
							if (method.getName().equals(methodName)) {
								Class[] var_classes_32_ = method.getParameterTypes();
								if (parameters.length == var_classes_32_.length) {
									boolean bool = true;
									for (int i_33_ = 0; i_33_ < parameters.length; i_33_++) {
										if (parameters[i_33_] != var_classes_32_[i_33_]) {
											bool = false;
											break;
										}
									}
									if (bool && returnTypeClass == method.getReturnType())
										((Class298_Sub47) class298_sub47).aMethodArray7541[count] = method;
								}
							}
						}
						((Class298_Sub47) class298_sub47).aByteArrayArrayArray7540[count] = is;
					}
				} catch (ClassNotFoundException classnotfoundexception) {
					((Class298_Sub47) class298_sub47).anIntArray7536[count] = -1;
				} catch (SecurityException securityexception) {
					((Class298_Sub47) class298_sub47).anIntArray7536[count] = -2;
				} catch (NullPointerException nullpointerexception) {
					((Class298_Sub47) class298_sub47).anIntArray7536[count] = -3;
				} catch (Exception exception) {
					((Class298_Sub47) class298_sub47).anIntArray7536[count] = -4;
				} catch (Throwable throwable) {
					((Class298_Sub47) class298_sub47).anIntArray7536[count] = -5;
				}
			}
			Class478.aClass453_6002.method5935(class298_sub47, 512081003);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("li.p(").append(')').toString());
		}
	}
}
