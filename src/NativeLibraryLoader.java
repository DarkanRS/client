
/* Class262 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

@SuppressWarnings({"rawtypes", "unchecked"})
public class NativeLibraryLoader implements Interface36 {
	Index nativeLibraryIndex;
	String OS_AND_ARCHITECTURE;
	Hashtable aHashtable3237 = new Hashtable();
	Hashtable linkedLibraries = new Hashtable();
	public static int[][] anIntArrayArray3239;
	public static int anInt3240;

	void method4637(String string, File file, byte i) {
		((NativeLibraryLoader) this).aHashtable3237.put(string, file);
	}

	public boolean method4639(String string, short i) {
		return ((NativeLibraryLoader) this).linkedLibraries.containsKey(string);
	}

	public boolean loadLibrary(String dllName, int i) {
		return loadLibrary(dllName, Class266.class, (byte) 2);
	}

	public boolean method219(int i) {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((NativeLibraryLoader) this).linkedLibraries.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((NativeLibraryLoader) this).linkedLibraries.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_4_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_4_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((NativeLibraryLoader) this).linkedLibraries.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((NativeLibraryLoader) this).aHashtable3237.get(string));
						Class var_class_5_ = ((Class) ((NativeLibraryLoader) this).linkedLibraries.get(string));
						Vector vector = ((Vector) field.get(var_class_5_.getClassLoader()));
						for (int i_6_ = 0; i_6_ < vector.size(); i_6_++) {
							try {
								Object object = vector.elementAt(i_6_);
								Field field_7_ = object.getClass().getDeclaredField("name");
								method.invoke(field_7_, new Object[] { Boolean.TRUE });
								try {
									String string_8_ = (String) field_7_.get(object);
									if (string_8_ != null && (string_8_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_9_ = object.getClass().getDeclaredField("handle");
										Method method_10_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_9_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_10_, (new Object[] { Boolean.TRUE }));
										try {
											method_10_.invoke(object, new Object[0]);
											field_9_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_10_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_9_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_7_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((NativeLibraryLoader) this).linkedLibraries = hashtable;
		return ((NativeLibraryLoader) this).linkedLibraries.isEmpty();
	}

	public boolean method224(String string) {
		return loadLibrary(string, Class266.class, (byte) 2);
	}

	public boolean method218(String string, int i) {
		return ((NativeLibraryLoader) this).aHashtable3237.containsKey(string);
	}

	boolean loadLibrary(String libName, Class classToLoadFrom, byte i) {
		Class clazz = (Class) ((NativeLibraryLoader) this).linkedLibraries.get(libName);
		if (clazz != null) {
			if (clazz.getClassLoader() != classToLoadFrom.getClassLoader())
				return false;
			return true;
		}
		File file = null;
		if (file == null)
			file = (File) ((NativeLibraryLoader) this).aHashtable3237.get(libName);
		do {
			if (null != file) {
				boolean bool;
				try {
					file = new File(file.getCanonicalPath());
//					Class runtime = Class.forName("java.lang.Runtime");
//					Class accessibleObject = Class.forName("java.lang.reflect.AccessibleObject");
//					Method setAccessible = accessibleObject.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
//					Method load = (runtime.getDeclaredMethod("load0", (new Class[] { Class.forName("java.lang.Class"), Class.forName("java.lang.String") })));
//					setAccessible.invoke(load, new Object[] { Boolean.TRUE });
//					load.invoke(Runtime.getRuntime(), new Object[] { classToLoadFrom, file.getPath() });
//					setAccessible.invoke(load, new Object[] { Boolean.FALSE });
					System.load(file.getPath());
					((NativeLibraryLoader) this).linkedLibraries.put(libName, classToLoadFrom);
					bool = true;
				} catch (Throwable throwable) {
					throwable.printStackTrace();
					break;
				}
				return bool;
			}
		} while (false);
		return false;
	}

	public boolean method223(String string) {
		return ((NativeLibraryLoader) this).aHashtable3237.containsKey(string);
	}

	public NativeLibraryLoader(Index nativeLibraryIndex) {
		((NativeLibraryLoader) this).nativeLibraryIndex = nativeLibraryIndex;
		String string = "";
		if (Class396.OS_NAME.startsWith("win") || Class396.OS_NAME.startsWith("windows 7"))
			string = new StringBuilder().append(string).append("windows/").toString();
		else if (Class396.OS_NAME.startsWith("linux"))
			string = new StringBuilder().append(string).append("linux/").toString();
		else if (Class396.OS_NAME.startsWith("mac"))
			string = new StringBuilder().append(string).append("macos/").toString();
		if (Class396.OS_ARCHITECTURE.startsWith("amd64") || Class396.OS_ARCHITECTURE.startsWith("x86_64"))
			string = new StringBuilder().append(string).append("x86_64/").toString();
		else if (Class396.OS_ARCHITECTURE.startsWith("i386") || Class396.OS_ARCHITECTURE.startsWith("i486") || Class396.OS_ARCHITECTURE.startsWith("i586") || Class396.OS_ARCHITECTURE.startsWith("x86"))
			string = new StringBuilder().append(string).append("x86/").toString();
		else if (Class396.OS_ARCHITECTURE.startsWith("ppc"))
			string = new StringBuilder().append(string).append("ppc/").toString();
		else
			string = new StringBuilder().append(string).append("universal/").toString();
		((NativeLibraryLoader) this).OS_AND_ARCHITECTURE = string;
	}

	public int method4648(String fileName, int i) {
		if (((NativeLibraryLoader) this).aHashtable3237.containsKey(fileName))
			return 100;
		String libraryName = Class94.prependOS(fileName, (byte) 70);
		if (libraryName == null)
			return -1;
		String fullLibName = null;
		if (fullLibName == null) {
			fullLibName = new StringBuilder().append(((NativeLibraryLoader) this).OS_AND_ARCHITECTURE).append(libraryName).toString();
			if (!((NativeLibraryLoader) this).nativeLibraryIndex.method5625(fullLibName, "", (byte) -91))
				return -1;
		}
		if (!((NativeLibraryLoader) this).nativeLibraryIndex.method5629(fullLibName, 71472045))
			return ((NativeLibraryLoader) this).nativeLibraryIndex.method5631(fullLibName, (byte) 113);
		byte[] is = ((NativeLibraryLoader) this).nativeLibraryIndex.method5626(fullLibName, "", (byte) 1);
		Object object = null;
		File file;
		try {
			file = Class96_Sub23.method14681(libraryName, 827415998);
		} catch (RuntimeException runtimeexception) {
			return -1;
		}
		if (null != is && file != null) {
			boolean bool = true;
			byte[] is_21_ = Class153.method2621(file, -1379715433);
			if (null != is_21_ && is_21_.length == is.length) {
				for (int i_22_ = 0; i_22_ < is_21_.length; i_22_++) {
					if (is_21_[i_22_] != is[i_22_]) {
						bool = false;
						break;
					}
				}
			} else
				bool = false;
			try {
				if (!bool) {
					try {
						FileOutputStream fileoutputstream = new FileOutputStream(file);
						fileoutputstream.write(is, 0, is.length);
						fileoutputstream.close();
					} catch (IOException ioexception) {
						throw new RuntimeException();
					}
				}
			} catch (Throwable throwable) {
				return -1;
			}
			method4637(fileName, file, (byte) -88);
			return 100;
		}
		return -1;
	}

	public boolean method221(String string) {
		return loadLibrary(string, Class266.class, (byte) 2);
	}

	public boolean method217(String string) {
		return loadLibrary(string, Class266.class, (byte) 2);
	}

	public boolean method220() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((NativeLibraryLoader) this).linkedLibraries.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((NativeLibraryLoader) this).linkedLibraries.get(string));
		}
		try {
			Class var_class = Class.forName("java.lang.reflect.AccessibleObject");
			Class var_class_23_ = Class.forName("java.lang.ClassLoader");
			Field field = var_class_23_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((NativeLibraryLoader) this).linkedLibraries.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((NativeLibraryLoader) this).aHashtable3237.get(string));
						Class var_class_24_ = ((Class) ((NativeLibraryLoader) this).linkedLibraries.get(string));
						Vector vector = ((Vector) field.get(var_class_24_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_25_ = object.getClass().getDeclaredField("name");
								method.invoke(field_25_, new Object[] { Boolean.TRUE });
								try {
									String string_26_ = (String) field_25_.get(object);
									if (string_26_ != null && (string_26_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_27_ = object.getClass().getDeclaredField("handle");
										Method method_28_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_27_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_28_, (new Object[] { Boolean.TRUE }));
										try {
											method_28_.invoke(object, new Object[0]);
											field_27_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_28_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_27_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_25_, new Object[] { Boolean.FALSE });
							} catch (Throwable throwable) {
								/* empty */
							}
						}
					} catch (Throwable throwable) {
						/* empty */
					}
				}
			} catch (Throwable throwable) {
				/* empty */
			}
			method.invoke(field, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
			/* empty */
		}
		((NativeLibraryLoader) this).linkedLibraries = hashtable;
		return ((NativeLibraryLoader) this).linkedLibraries.isEmpty();
	}

	static final void method4651(IComponentDefinitions class118, Interface class98, CS2Executor class527, byte i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1522252372) != null) {
			if (i <= 0)
				return;
			string = string.substring(0, string.length() - 1);
		}
		class118.anObjectArray1292 = Class351.method6193(string, class527, 1736342439);
		class118.aBool1384 = true;
	}

	static final void method4652(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
		int i_29_ = (class527.intStack[1942118537 * class527.intStackPtr]);
		int i_30_ = (class527.intStack[1 + class527.intStackPtr * 1942118537]);
		if (0 == i_29_)
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = 0;
		else
			class527.intStack[((class527.intStackPtr += 141891001) * 1942118537 - 1)] = (int) Math.pow((double) i_29_, (double) i_30_);
	}

	static void method4653(int i, int i_31_, int i_32_) {
		if (Class58.aClass529_527.aBool7044 || (1 != 2144330291 * Class20.anInt169 && (!Class96_Sub6.aBool9173 || 2 != 2144330291 * Class20.anInt169 || !(((Class282_Sub50_Sub7) Class1.aClass282_Sub50_Sub7_12).aString9576.equals(Message.FACE_HERE.translate(Class223.CURRENT_LANGUAGE, -1649910920)))))) {
			FontMetrics class414 = Class114.method1887(2016134923);
			int i_33_ = (class414.getWidthNoSprites(Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -2018972202), -1967833701));
			int i_34_;
			if (!Class20.aBool162) {
				for (Class282_Sub50_Sub7 class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 95)); null != class282_sub50_sub7; class282_sub50_sub7 = ((Class282_Sub50_Sub7) Class20.aClass482_171.next(1149283361))) {
					int i_35_ = Class282_Sub50_Sub17.method15507(class282_sub50_sub7, class414, 943671530);
					if (i_35_ > i_33_)
						i_33_ = i_35_;
				}
				i_33_ += 8;
				i_34_ = 21 + 2144330291 * Class20.anInt169 * (Class20.anInt178 * 997766473);
				Class110.anInt1104 = -1149880001 * ((Class20.aBool187 ? 26 : 22) + (2144330291 * Class20.anInt169 * (Class20.anInt178 * 997766473)));
			} else {
				for (Class282_Sub50_Sub15 class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7941((byte) 4)); class282_sub50_sub15 != null; class282_sub50_sub15 = ((Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-1603156921))) {
					int i_36_;
					if (1 == (((Class282_Sub50_Sub15) class282_sub50_sub15).anInt9769) * 2026887253)
						i_36_ = (Class282_Sub50_Sub17.method15507(((Class282_Sub50_Sub7) (((Class282_Sub50_Sub15) class282_sub50_sub15).aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119)), class414, 943671530));
					else
						i_36_ = Class163.method2840(class282_sub50_sub15, class414, 444800403);
					if (i_36_ > i_33_)
						i_33_ = i_36_;
				}
				i_33_ += 8;
				i_34_ = 21 + 997766473 * Class20.anInt178 * (Class20.anInt170 * 292682521);
				Class110.anInt1104 = (Class20.anInt178 * 997766473 * (Class20.anInt170 * 292682521) + (Class20.aBool187 ? 26 : 22)) * -1149880001;
			}
			i_33_ += 10;
			int i_37_ = i - i_33_ / 2;
			if (i_37_ + i_33_ > -418109423 * Class349.anInt4083)
				i_37_ = Class349.anInt4083 * -418109423 - i_33_;
			if (i_37_ < 0)
				i_37_ = 0;
			int i_38_ = i_31_;
			if (i_38_ + i_34_ > Engine.anInt3243 * -969250379)
				i_38_ = Engine.anInt3243 * -969250379 - i_34_;
			if (i_38_ < 0)
				i_38_ = 0;
			Class301.anInt3555 = i_37_ * 1699362117;
			Class184.anInt2300 = -1865657955 * i_38_;
			Class158_Sub2.anInt8975 = 363510355 * i_33_;
			Class20.anInt156 = (int) (Math.random() * 24.0) * -2033238375;
			Class20.aBool161 = true;
		}
	}
}
