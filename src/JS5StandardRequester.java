import java.lang.reflect.Field;
import java.lang.reflect.Method;

public abstract class JS5StandardRequester {

	long aLong3648;
	int anInt3653;
	PaddedJS5Request current;
	Queue priorities = new Queue();
	Queue waitingPriorities = new Queue();
	Queue extras = new Queue();
	Queue waitingExtras = new Queue();
	RsByteBuffer aClass282_Sub35_3655 = new RsByteBuffer(6);
	byte aByte3656 = 0;
	public volatile int anInt3657 = 0;
	public volatile int anInt3650 = 0;
	RsByteBuffer aClass282_Sub35_3647 = new RsByteBuffer(10);

	public abstract void method5514();

	PaddedJS5Request request(int i_1, int i_2, byte b_3, boolean bool_4, byte b_5) {
		long long_6 = ((long) i_1 << 32) + (long) i_2;
		PaddedJS5Request request = new PaddedJS5Request();
		request.key = long_6;
		request.padding = b_3;
		request.highPriority = bool_4;
		if (bool_4) {
			if (this.priorities((short) 22331) >= 50) {
				throw new RuntimeException();
			}

			this.priorities.method7936(request);
		} else {
			if (this.extras(-1983883069) >= 20) {
				throw new RuntimeException();
			}

			this.extras.method7936(request);
		}

		return request;
	}

	boolean extraUnavailable(int i_1) {
		return this.extras(-1727956644) >= 20;
	}

	boolean priorityUnavailable(int i_1) {
		return this.priorities((short) 24755) >= 50;
	}

	int extras(int i_1) {
		return this.extras.size(-1975244786) + this.waitingExtras.size(431574855);
	}

	abstract void method5520(byte var1);

	public abstract boolean method5521();

	public abstract void init(Object var1, boolean var2);

	public abstract void method5523(boolean var1, byte var2);

	public abstract boolean method5524();

	public abstract void method5525(int var1);

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

	public abstract void method5544(Object var1, boolean var2);

	public abstract void method5545(Object var1, boolean var2);

	public abstract void method5546(boolean var1);

	public abstract void method5547();

	public abstract void method5548();

	public abstract void method5549();

	public abstract void method5550();

	public abstract void method5552();

	public int priorities(short s_1) {
		return this.priorities.size(946484951) + this.waitingPriorities.size(1256746547);
	}

	public abstract void method5554();

	public abstract boolean method5557();

	public static final void method5558() {
		Class9.loginStage = 2;
		Class9.anInt106 = -2;
		Class9.anInt72 = -2;
	}

	public static void setBillboardIndex(Index index_0) {
		BillboardDefinitions.BILLBOARD_INDEX = index_0;
	}

	public static void method5560(RsByteBuffer rsbytebuffer_0, int i_1) {
		ReflectionCheck class282_sub42_3 = new ReflectionCheck();
		class282_sub42_3.anInt8033 = rsbytebuffer_0.readUnsignedByte();
		class282_sub42_3.anInt8038 = rsbytebuffer_0.readInt();
		class282_sub42_3.anIntArray8035 = new int[class282_sub42_3.anInt8033];
		class282_sub42_3.anIntArray8036 = new int[class282_sub42_3.anInt8033];
		class282_sub42_3.aFieldArray8037 = new Field[class282_sub42_3.anInt8033];
		class282_sub42_3.anIntArray8040 = new int[class282_sub42_3.anInt8033];
		class282_sub42_3.aMethodArray8034 = new Method[class282_sub42_3.anInt8033];
		class282_sub42_3.aByteArrayArrayArray8041 = new byte[class282_sub42_3.anInt8033][][];

		for (int i_4 = 0; i_4 < class282_sub42_3.anInt8033; i_4++) {
			try {
				int i_5 = rsbytebuffer_0.readUnsignedByte();
				String string_6;
				String string_7;
				int i_8;
				if (i_5 != 0 && i_5 != 1 && i_5 != 2) {
					if (i_5 == 3 || i_5 == 4) {
						string_6 = rsbytebuffer_0.readString();
						string_7 = rsbytebuffer_0.readString();
						i_8 = rsbytebuffer_0.readUnsignedByte();
						String[] arr_9 = new String[i_8];

						for (int i_10 = 0; i_10 < i_8; i_10++) {
							arr_9[i_10] = rsbytebuffer_0.readString();
						}

						String string_21 = rsbytebuffer_0.readString();
						byte[][] bytes_11 = new byte[i_8][];
						int i_13;
						if (i_5 == 3) {
							for (int i_12 = 0; i_12 < i_8; i_12++) {
								i_13 = rsbytebuffer_0.readInt();
								bytes_11[i_12] = new byte[i_13];
								rsbytebuffer_0.readBytes(bytes_11[i_12], 0, i_13);
							}
						}

						class282_sub42_3.anIntArray8035[i_4] = i_5;
						Class[] arr_22 = new Class[i_8];

						for (i_13 = 0; i_13 < i_8; i_13++) {
							arr_22[i_13] = Class148.method2553(arr_9[i_13], (short) 32325);
						}

						Class class_23 = Class148.method2553(string_21, (short) 26273);
						if (Class148.method2553(string_6, (short) 12990).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] arr_14 = Class148.method2553(string_6, (short) 12676).getDeclaredMethods();
						Method[] arr_15 = arr_14;

						for (int i_16 = 0; i_16 < arr_15.length; i_16++) {
							Method method_17 = arr_15[i_16];
							if (method_17.getName().equals(string_7)) {
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
										class282_sub42_3.aMethodArray8034[i_4] = method_17;
									}
								}
							}
						}

						class282_sub42_3.aByteArrayArrayArray8041[i_4] = bytes_11;
					}
				} else {
					string_6 = rsbytebuffer_0.readString();
					string_7 = rsbytebuffer_0.readString();
					i_8 = 0;
					if (i_5 == 1) {
						i_8 = rsbytebuffer_0.readInt();
					}

					class282_sub42_3.anIntArray8035[i_4] = i_5;
					class282_sub42_3.anIntArray8040[i_4] = i_8;
					if (Class148.method2553(string_6, (short) 15152).getClassLoader() == null) {
						throw new SecurityException();
					}

					class282_sub42_3.aFieldArray8037[i_4] = Class148.method2553(string_6, (short) 8812).getDeclaredField(string_7);
				}
			} catch (ClassNotFoundException classnotfoundexception_25) {
				class282_sub42_3.anIntArray8036[i_4] = -1;
			} catch (SecurityException securityexception_26) {
				class282_sub42_3.anIntArray8036[i_4] = -2;
			} catch (NullPointerException nullpointerexception_27) {
				class282_sub42_3.anIntArray8036[i_4] = -3;
			} catch (Exception exception_28) {
				class282_sub42_3.anIntArray8036[i_4] = -4;
			} catch (Throwable throwable_29) {
				class282_sub42_3.anIntArray8036[i_4] = -5;
			}
		}

		Class435.PENDING_REFLECTION_CHECKS.append(class282_sub42_3);
	}

}
