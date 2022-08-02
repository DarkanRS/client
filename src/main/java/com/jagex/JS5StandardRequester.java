package com.jagex;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class JS5StandardRequester {

	public volatile int anInt3657;
	public volatile int anInt3650;
	long aLong3648;
	int anInt3653;
	PaddedJS5Request current;
	Queue priorities = new Queue();
	Queue waitingPriorities = new Queue();
	Queue extras = new Queue();
	Queue waitingExtras = new Queue();
	ByteBuf aNode_Sub35_3655 = new ByteBuf(6);
	byte aByte3656;
	ByteBuf aNode_Sub35_3647 = new ByteBuf(10);

	public static void method5558() {
		Class9.loginStage = 2;
		Class9.anInt106 = -2;
		Class9.anInt72 = -2;
	}

	public static void setBillboardIndex(Index index_0) {
		BillboardDefinitions.BILLBOARD_INDEX = index_0;
	}

	public static void method5560(ByteBuf buffer) {
		ReflectionCheck check = new ReflectionCheck();
		check.size = buffer.readUnsignedByte();
		check.id = buffer.readInt();
		check.types = new int[check.size];
		check.exceptionCodes = new int[check.size];
		check.fields = new Field[check.size];
		check.fieldValues = new int[check.size];
		check.methods = new Method[check.size];
		check.serializedObjectParams = new byte[check.size][][];

		for (int i_4 = 0; i_4 < check.size; i_4++) {
			try {
				int type = buffer.readUnsignedByte();
				switch (type) {
				case 0, 1, 2 -> {
					String className = buffer.readString();
					String methodName = buffer.readString();
					
					int paramLength = 0;
					if (type == 1)
						paramLength = buffer.readInt();

					check.types[i_4] = type;
					check.fieldValues[i_4] = paramLength;
					if (Class148.classFromTypeString(className).getClassLoader() == null) {
						throw new SecurityException();
					}

					check.fields[i_4] = Class148.classFromTypeString(className).getDeclaredField(methodName);
				}
				case 3, 4 -> {
					String className = buffer.readString();
					String methodName = buffer.readString();
					int paramLength = buffer.readUnsignedByte();
					String[] params = new String[paramLength];

					for (int i_10 = 0; i_10 < paramLength; i_10++) {
						params[i_10] = buffer.readString();
					}

					String returnType = buffer.readString();
					byte[][] bytes_11 = new byte[paramLength][];
					int i_13;
					if (type == 3) {
						for (int i_12 = 0; i_12 < paramLength; i_12++) {
							i_13 = buffer.readInt();
							bytes_11[i_12] = new byte[i_13];
							buffer.readBytes(bytes_11[i_12], 0, i_13);
						}
					}

					check.types[i_4] = type;
					Class[] arr_22 = new Class[paramLength];

					for (i_13 = 0; i_13 < paramLength; i_13++) {
						arr_22[i_13] = Class148.classFromTypeString(params[i_13]);
					}

					Class<Byte> class_23 = Class148.classFromTypeString(returnType);
					if (Class148.classFromTypeString(className).getClassLoader() == null) {
						throw new SecurityException();
					}

					Method[] methods = Class148.classFromTypeString(className).getDeclaredMethods();
					Method[] methods2 = methods;

					for (int i_16 = 0; i_16 < methods2.length; i_16++) {
						Method method_17 = methods2[i_16];
						if (method_17.getName().equals(methodName)) {
							Class[] arr_18 = method_17.getParameterTypes();
							if (arr_22.length == arr_18.length) {
								boolean bool_19 = true;

								for (int i_20 = 0; i_20 < arr_22.length; i_20++) {
									if (arr_22[i_20] != arr_18[i_20]) {
										bool_19 = false;
										break;
									}
								}

								if (bool_19 && class_23 == method_17.getReturnType()) {
									check.methods[i_4] = method_17;
								}
							}
						}
					}

					check.serializedObjectParams[i_4] = bytes_11;
				}
				}
			} catch (ClassNotFoundException classnotfoundexception_25) {
				check.exceptionCodes[i_4] = -1;
			} catch (SecurityException securityexception_26) {
				check.exceptionCodes[i_4] = -2;
			} catch (NullPointerException nullpointerexception_27) {
				check.exceptionCodes[i_4] = -3;
			} catch (Exception exception_28) {
				check.exceptionCodes[i_4] = -4;
			} catch (Throwable throwable_29) {
				check.exceptionCodes[i_4] = -5;
			}
		}

		Class435.PENDING_REFLECTION_CHECKS.append(check);
	}

	public abstract void method5514();

	PaddedJS5Request request(int i_1, int i_2, byte b_3, boolean bool_4) {
		long long_6 = ((long) i_1 << 32) + i_2;
		PaddedJS5Request request = new PaddedJS5Request();
		request.key = long_6;
		request.padding = b_3;
		request.highPriority = bool_4;
		if (bool_4) {
			if (priorities() >= 50) {
				throw new RuntimeException();
			}

			priorities.add(request);
		} else {
			if (extras() >= 20) {
				throw new RuntimeException();
			}

			extras.add(request);
		}

		return request;
	}

	boolean extraUnavailable() {
		return extras() >= 20;
	}

	boolean priorityUnavailable() {
		return priorities() >= 50;
	}

	int extras() {
		return extras.size() + waitingExtras.size();
	}

	abstract void method5520();

	public abstract boolean method5521();

	public abstract void init(Connection var1, boolean var2);

	public abstract void method5523(boolean var1);

	public abstract boolean method5524();

	public abstract void method5525();

	public abstract void method5526();

	public abstract void method5527();

	public abstract void method5528();

	public abstract void method5530();

	public abstract void method5532();

	public abstract void method5537();

	abstract void method5538();

	abstract void method5539();

	abstract void method5540();

	public abstract boolean method5542();

	public abstract void method5543();

	public abstract void method5544(Connection var1, boolean var2);

	public abstract void method5545(Connection var1, boolean var2);

	public abstract void method5546(boolean var1);

	public abstract void method5547();

	public abstract void method5548();

	public abstract void method5549();

	public abstract void method5550();

	public abstract void method5552();

	public int priorities() {
		return priorities.size() + waitingPriorities.size();
	}

	public abstract void method5554();

	public abstract boolean method5557();

}
