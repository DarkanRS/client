/* Class305 - Decompiled by JODE
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

public class Class305 implements Interface27 {
	Class243 aClass243_6735;
	String aString6736;
	Hashtable aHashtable6737 = new Hashtable();
	Hashtable aHashtable6738 = new Hashtable();

	public int method3743(String string) {
		if (((Class305) this).aHashtable6737.containsKey(string))
			return 100;
		String string_0_ = Class462.method5990(string, 1546651930);
		if (null == string_0_)
			return -1;
		String string_1_ = null;
		if (string_1_ == null) {
			string_1_ = new StringBuilder().append(((Class305) this).aString6736).append(string_0_).toString();
			if (!((Class305) this).aClass243_6735.method2300(string_1_, "", (byte) 15))
				return -1;
		}
		if (!((Class305) this).aClass243_6735.method2312(string_1_, -2138379227))
			return ((Class305) this).aClass243_6735.method2305(string_1_, -896654552);
		byte[] is = ((Class305) this).aClass243_6735.method2301(string_1_, "", 1164372929);
		Object object = null;
		File file;
		try {
			file = Class482.method6118(string_0_, (byte) -1);
		} catch (RuntimeException runtimeexception) {
			return -1;
		}
		if (is != null && null != file) {
			boolean bool = true;
			byte[] is_2_ = Class362.method4311(file, -1944658057);
			if (null != is_2_ && is.length == is_2_.length) {
				for (int i = 0; i < is_2_.length; i++) {
					if (is_2_[i] != is[i]) {
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
			method3745(string, file, 1006624802);
			return 100;
		}
		return -1;
	}

	public int method3744(String string, int i) {
		try {
			if (((Class305) this).aHashtable6737.containsKey(string))
				return 100;
			String string_3_ = Class462.method5990(string, 1546651930);
			if (null == string_3_)
				return -1;
			String string_4_ = null;
			if (string_4_ == null) {
				string_4_ = new StringBuilder().append(((Class305) this).aString6736).append(string_3_).toString();
				if (!((Class305) this).aClass243_6735.method2300(string_4_, "", (byte) -89))
					return -1;
			}
			if (!((Class305) this).aClass243_6735.method2312(string_4_, -2144191880))
				return ((Class305) this).aClass243_6735.method2305(string_4_, 1762657326);
			byte[] is = ((Class305) this).aClass243_6735.method2301(string_4_, "", 829888057);
			Object object = null;
			File file;
			try {
				file = Class482.method6118(string_3_, (byte) -34);
			} catch (RuntimeException runtimeexception) {
				return -1;
			}
			if (is != null && null != file) {
				boolean bool = true;
				byte[] is_5_ = Class362.method4311(file, -1944658057);
				if (null != is_5_ && is.length == is_5_.length) {
					for (int i_6_ = 0; i_6_ < is_5_.length; i_6_++) {
						if (is_5_[i_6_] != is[i_6_]) {
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
				method3745(string, file, 1950110076);
				return 100;
			}
			return -1;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.f(").append(')').toString());
		}
	}

	void method3745(String string, File file, int i) {
		try {
			((Class305) this).aHashtable6737.put(string, file);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.b(").append(')').toString());
		}
	}

	public boolean method263(String string, int i) {
		try {
			return ((Class305) this).aHashtable6737.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.p(").append(')').toString());
		}
	}

	public boolean method265(String string, int i) {
		try {
			return method3746(string, Class294.class, 891469368);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.k(").append(')').toString());
		}
	}

	boolean method3746(String string, Class var_class, int i) {
		try {
			Class var_class_7_ = (Class) ((Class305) this).aHashtable6738.get(string);
			if (var_class_7_ != null) {
				if (var_class_7_.getClassLoader() != var_class.getClassLoader())
					return false;
				return true;
			}
			File file = null;
			if (null == file)
				file = (File) ((Class305) this).aHashtable6737.get(string);
			do {
				if (file != null) {
					boolean bool;
					try {
						file = new File(file.getCanonicalPath());
						Class var_class_8_ = java.lang.Runtime.class;
						Class var_class_9_ = java.lang.reflect.AccessibleObject.class;
						Method method = var_class_9_.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
						Method method_10_ = (var_class_8_.getDeclaredMethod("load0", (new Class[] { java.lang.Class.class, java.lang.String.class })));
						method.invoke(method_10_, new Object[] { Boolean.TRUE });
						method_10_.invoke(Runtime.getRuntime(), new Object[] { var_class, file.getPath() });
						method.invoke(method_10_, new Object[] { Boolean.FALSE });
						((Class305) this).aHashtable6738.put(string, var_class);
						bool = true;
					} catch (NoSuchMethodException nosuchmethodexception) {
						System.load(file.getPath());
						((Class305) this).aHashtable6738.put(string, Class294.class);
						return true;
					} catch (Throwable throwable) {
						break;
					}
					return bool;
				}
			} while (false);
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.d(").append(')').toString());
		}
	}

	public boolean method264(int i) {
		try {
			Hashtable hashtable = new Hashtable();
			Enumeration enumeration = ((Class305) this).aHashtable6738.keys();
			while (enumeration.hasMoreElements()) {
				String string = (String) enumeration.nextElement();
				hashtable.put(string, ((Class305) this).aHashtable6738.get(string));
			}
			try {
				Class var_class = java.lang.reflect.AccessibleObject.class;
				Class var_class_11_ = java.lang.ClassLoader.class;
				Field field = var_class_11_.getDeclaredField("nativeLibraries");
				Method method = var_class.getDeclaredMethod("setAccessible", (new Class[] { Boolean.TYPE }));
				method.invoke(field, new Object[] { Boolean.TRUE });
				try {
					enumeration = ((Class305) this).aHashtable6738.keys();
					while (enumeration.hasMoreElements()) {
						String string = (String) enumeration.nextElement();
						try {
							File file = (File) ((Class305) this).aHashtable6737.get(string);
							Class var_class_12_ = (Class) ((Class305) this).aHashtable6738.get(string);
							Vector vector = ((Vector) field.get(var_class_12_.getClassLoader()));
							for (int i_13_ = 0; i_13_ < vector.size(); i_13_++) {
								try {
									Object object = vector.elementAt(i_13_);
									Field field_14_ = object.getClass().getDeclaredField("name");
									method.invoke(field_14_, (new Object[] { Boolean.TRUE }));
									try {
										String string_15_ = (String) field_14_.get(object);
										if (string_15_ != null && (string_15_.equalsIgnoreCase(file.getCanonicalPath()))) {
											Field field_16_ = (object.getClass().getDeclaredField("handle"));
											Method method_17_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
											method.invoke(field_16_, (new Object[] { Boolean.TRUE }));
											method.invoke(method_17_, (new Object[] { Boolean.TRUE }));
											try {
												method_17_.invoke(object, (new Object[0]));
												field_16_.set(object, new Integer(0));
												hashtable.remove(string);
											} catch (Throwable throwable) {
												/* empty */
											}
											method.invoke(method_17_, (new Object[] { Boolean.FALSE }));
											method.invoke(field_16_, (new Object[] { Boolean.FALSE }));
										}
									} catch (Throwable throwable) {
										/* empty */
									}
									method.invoke(field_14_, (new Object[] { Boolean.FALSE }));
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
			((Class305) this).aHashtable6738 = hashtable;
			return ((Class305) this).aHashtable6738.isEmpty();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.u(").append(')').toString());
		}
	}

	public boolean method262() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class305) this).aHashtable6738.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class305) this).aHashtable6738.get(string));
		}
		try {
			Class var_class = java.lang.reflect.AccessibleObject.class;
			Class var_class_18_ = java.lang.ClassLoader.class;
			Field field = var_class_18_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class305) this).aHashtable6738.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class305) this).aHashtable6737.get(string));
						Class var_class_19_ = ((Class) ((Class305) this).aHashtable6738.get(string));
						Vector vector = ((Vector) field.get(var_class_19_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_20_ = object.getClass().getDeclaredField("name");
								method.invoke(field_20_, new Object[] { Boolean.TRUE });
								try {
									String string_21_ = (String) field_20_.get(object);
									if (string_21_ != null && (string_21_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_22_ = object.getClass().getDeclaredField("handle");
										Method method_23_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_22_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_23_, (new Object[] { Boolean.TRUE }));
										try {
											method_23_.invoke(object, new Object[0]);
											field_22_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_23_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_22_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_20_, new Object[] { Boolean.FALSE });
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
		((Class305) this).aHashtable6738 = hashtable;
		return ((Class305) this).aHashtable6738.isEmpty();
	}

	public Class305(Class243 class243) {
		((Class305) this).aClass243_6735 = class243;
		String string = "";
		if (Class495.aString6094.startsWith("win") || Class495.aString6094.startsWith("windows 7"))
			string = new StringBuilder().append(string).append("windows/").toString();
		else if (Class495.aString6094.startsWith("linux"))
			string = new StringBuilder().append(string).append("linux/").toString();
		else if (Class495.aString6094.startsWith("mac"))
			string = new StringBuilder().append(string).append("macos/").toString();
		if (Class495.aString6093.startsWith("amd64") || Class495.aString6093.startsWith("x86_64"))
			string = new StringBuilder().append(string).append("x86_64/").toString();
		else if (Class495.aString6093.startsWith("i386") || Class495.aString6093.startsWith("i486") || Class495.aString6093.startsWith("i586") || Class495.aString6093.startsWith("x86"))
			string = new StringBuilder().append(string).append("x86/").toString();
		else if (Class495.aString6093.startsWith("ppc"))
			string = new StringBuilder().append(string).append("ppc/").toString();
		else
			string = new StringBuilder().append(string).append("universal/").toString();
		((Class305) this).aString6736 = string;
	}

	public boolean method266(String string) {
		return ((Class305) this).aHashtable6737.containsKey(string);
	}

	public boolean method269() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class305) this).aHashtable6738.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class305) this).aHashtable6738.get(string));
		}
		try {
			Class var_class = java.lang.reflect.AccessibleObject.class;
			Class var_class_24_ = java.lang.ClassLoader.class;
			Field field = var_class_24_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class305) this).aHashtable6738.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class305) this).aHashtable6737.get(string));
						Class var_class_25_ = ((Class) ((Class305) this).aHashtable6738.get(string));
						Vector vector = ((Vector) field.get(var_class_25_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_26_ = object.getClass().getDeclaredField("name");
								method.invoke(field_26_, new Object[] { Boolean.TRUE });
								try {
									String string_27_ = (String) field_26_.get(object);
									if (string_27_ != null && (string_27_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_28_ = object.getClass().getDeclaredField("handle");
										Method method_29_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_28_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_29_, (new Object[] { Boolean.TRUE }));
										try {
											method_29_.invoke(object, new Object[0]);
											field_28_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_29_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_28_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_26_, new Object[] { Boolean.FALSE });
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
		((Class305) this).aHashtable6738 = hashtable;
		return ((Class305) this).aHashtable6738.isEmpty();
	}

	public boolean method270(String string) {
		return method3746(string, Class294.class, 156464109);
	}

	public boolean method267(String string) {
		return method3746(string, Class294.class, 783446283);
	}

	public boolean method3747(String string, int i) {
		try {
			return ((Class305) this).aHashtable6738.containsKey(string);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.i(").append(')').toString());
		}
	}

	public boolean method268() {
		Hashtable hashtable = new Hashtable();
		Enumeration enumeration = ((Class305) this).aHashtable6738.keys();
		while (enumeration.hasMoreElements()) {
			String string = (String) enumeration.nextElement();
			hashtable.put(string, ((Class305) this).aHashtable6738.get(string));
		}
		try {
			Class var_class = java.lang.reflect.AccessibleObject.class;
			Class var_class_30_ = java.lang.ClassLoader.class;
			Field field = var_class_30_.getDeclaredField("nativeLibraries");
			Method method = var_class.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
			method.invoke(field, new Object[] { Boolean.TRUE });
			try {
				enumeration = ((Class305) this).aHashtable6738.keys();
				while (enumeration.hasMoreElements()) {
					String string = (String) enumeration.nextElement();
					try {
						File file = ((File) ((Class305) this).aHashtable6737.get(string));
						Class var_class_31_ = ((Class) ((Class305) this).aHashtable6738.get(string));
						Vector vector = ((Vector) field.get(var_class_31_.getClassLoader()));
						for (int i = 0; i < vector.size(); i++) {
							try {
								Object object = vector.elementAt(i);
								Field field_32_ = object.getClass().getDeclaredField("name");
								method.invoke(field_32_, new Object[] { Boolean.TRUE });
								try {
									String string_33_ = (String) field_32_.get(object);
									if (string_33_ != null && (string_33_.equalsIgnoreCase(file.getCanonicalPath()))) {
										Field field_34_ = object.getClass().getDeclaredField("handle");
										Method method_35_ = (object.getClass().getDeclaredMethod("finalize", new Class[0]));
										method.invoke(field_34_, (new Object[] { Boolean.TRUE }));
										method.invoke(method_35_, (new Object[] { Boolean.TRUE }));
										try {
											method_35_.invoke(object, new Object[0]);
											field_34_.set(object, new Integer(0));
											hashtable.remove(string);
										} catch (Throwable throwable) {
											/* empty */
										}
										method.invoke(method_35_, (new Object[] { Boolean.FALSE }));
										method.invoke(field_34_, (new Object[] { Boolean.FALSE }));
									}
								} catch (Throwable throwable) {
									/* empty */
								}
								method.invoke(field_32_, new Object[] { Boolean.FALSE });
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
		((Class305) this).aHashtable6738 = hashtable;
		return ((Class305) this).aHashtable6738.isEmpty();
	}

	static final void method3748(ClientScript2 class403, int i) {
		try {
			((ClientScript2) class403).anInt5239 -= -1175642067;
			int i_36_ = (((ClientScript2) class403).anIntArray5244[681479919 * ((ClientScript2) class403).anInt5239]);
			int i_37_ = (((ClientScript2) class403).anIntArray5244[1 + ((ClientScript2) class403).anInt5239 * 681479919]);
			int i_38_ = (((ClientScript2) class403).anIntArray5244[((ClientScript2) class403).anInt5239 * 681479919 + 2]);
			String string = (String) (((ClientScript2) class403).anObjectArray5240[(((ClientScript2) class403).anInt5241 -= 969361751) * -203050393]);
			if (i_37_ == -1)
				throw new RuntimeException();
			ClientScriptMap class483 = Class51.aClass475_506.getClientScriptMap(i_37_, 1528209569);
			if (i_36_ != class483.aChar6042)
				throw new RuntimeException();
			if (class483.aChar6037 != 's')
				throw new RuntimeException();
			int[] is = class483.method6128(string, (short) 14661);
			if (i_38_ < 0 || null == is || is.length <= i_38_)
				throw new RuntimeException();
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = is[i_38_];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.vm(").append(')').toString());
		}
	}

	static final void method3749(ClientScript2 class403, byte i) {
		try {
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = 1592380953 * client.anInt8669;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.tm(").append(')').toString());
		}
	}

	static final void method3750(ClientScript2 class403, byte i) {
		try {
			Class79.method850((((ClientScript2) class403).aClass365_Sub1_Sub1_Sub2_5242), (((ClientScript2) class403).anIntArray5244[(((ClientScript2) class403).anInt5239 -= -391880689) * 681479919]), (byte) 14);
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) client.aFloatArray8891[0];
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) client.aFloatArray8891[1];
			((ClientScript2) class403).anIntArray5244[((((ClientScript2) class403).anInt5239 += -391880689) * 681479919 - 1)] = (int) client.aFloatArray8891[2];
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.aov(").append(')').toString());
		}
	}

	static void method3751(byte i) {
		try {
			Class360.aClass25_3905.method383((short) 8191);
			((BufferedConnectionContext) Class360.aClass25_3905).stream.index = 0;
			((BufferedConnectionContext) Class360.aClass25_3905).aClass202_344 = null;
			((BufferedConnectionContext) Class360.aClass25_3905).aClass202_345 = null;
			((BufferedConnectionContext) Class360.aClass25_3905).aClass202_348 = null;
			((BufferedConnectionContext) Class360.aClass25_3905).anInt338 = 0;
			client.anInt8669 = 0;
			Class_ta.method5998(1477186028);
			client.anInt8942 = 0;
			client.anInt8941 = 0;
			client.aString8804 = null;
			Class489.anInt6071 = 0;
			Class82_Sub6.aClass7Array6846 = null;
			Class508.aClass162_6216 = null;
			Class225.aClass162_2512 = null;
			Class132.method1481(-163784749);
			for (int i_39_ = 0; i_39_ < 25; i_39_++) {
				client.anIntArray8924[i_39_] = 0;
				client.anIntArray8828[i_39_] = 0;
				client.anIntArray8829[i_39_] = 0;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.ax(").append(')').toString());
		}
	}

	static void method3752(int i, int i_40_, int i_41_) {
		try {
			Class298_Sub37_Sub12 class298_sub37_sub12 = Class410.method4985(1, (long) i);
			class298_sub37_sub12.method3449((byte) 4);
			((Class298_Sub37_Sub12) class298_sub37_sub12).anInt9610 = i_40_ * 1274450087;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.av(").append(')').toString());
		}
	}

	public static void method3753(byte i) {
		try {
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7421.method5939(1766612795)); class298_sub41 != null; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7421.method5944(49146))) {
				if (((Class298_Sub41) class298_sub41).aBoolean7437)
					class298_sub41.method3519(-2105706918);
			}
			for (Class298_Sub41 class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7455.method5939(1766612795)); null != class298_sub41; class298_sub41 = ((Class298_Sub41) Class298_Sub41.aClass453_7455.method5944(49146))) {
				if (((Class298_Sub41) class298_sub41).aBoolean7437)
					class298_sub41.method3519(-1213183099);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("mr.f(").append(')').toString());
		}
	}
}
