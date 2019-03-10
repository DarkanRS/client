import java.util.HashMap;
import java.util.Map;

public final class Class321 {

	long aLong3726;

	int anInt3730;

	Class332 aClass332_3729;

	Map aMap3728;

	AbstractQueue_Sub1 anAbstractQueue_Sub1_3725;

	AbstractQueue_Sub1 anAbstractQueue_Sub1_3727;

	public Object method5737(Object object_1, int i_2) {
		synchronized (this) {
			if (this.aLong3726 != -1L) {
				this.method5745((byte) 57);
			}
			Class328 class328_4 = (Class328) this.aMap3728.remove(object_1);
			Object object_5;
			if (class328_4 != null) {
				this.anAbstractQueue_Sub1_3725.remove(class328_4);
				if (this.method5738(16711680)) {
					this.anAbstractQueue_Sub1_3727.remove(class328_4);
				}
				object_5 = class328_4.anObject3768;
				return object_5;
			} else {
				object_5 = null;
				return object_5;
			}
		}
	}

	Class321(long long_1, int i_3, Class332 class332_4) {
		this.aLong3726 = long_1;
		this.anInt3730 = i_3;
		this.aClass332_3729 = class332_4;
		if (this.anInt3730 == -1) {
			this.aMap3728 = new HashMap(64);
			this.anAbstractQueue_Sub1_3725 = new AbstractQueue_Sub1(64);
			this.anAbstractQueue_Sub1_3727 = null;
		} else {
			if (this.aClass332_3729 == null) {
				throw new IllegalArgumentException("");
			}
			this.aMap3728 = new HashMap(this.anInt3730);
			this.anAbstractQueue_Sub1_3725 = new AbstractQueue_Sub1(this.anInt3730);
			this.anAbstractQueue_Sub1_3727 = new AbstractQueue_Sub1(this.anInt3730);
		}
	}

	boolean method5738(int i_1) {
		return this.anInt3730 != -1;
	}

	public Object method5739(Object object_1, byte b_2) {
		synchronized (this) {
			if (this.aLong3726 != -1L) {
				this.method5745((byte) 81);
			}
			Class328 class328_4 = (Class328) this.aMap3728.get(object_1);
			Object object_5;
			if (class328_4 == null) {
				object_5 = null;
				return object_5;
			} else {
				this.method5742(class328_4, false, (byte) 41);
				object_5 = class328_4.anObject3768;
				return object_5;
			}
		}
	}

	public Object method5740(Object object_1, Object object_2, int i_3) {
		synchronized (this) {
			if (this.aLong3726 != -1L) {
				this.method5745((byte) 119);
			}
			Class328 class328_5 = (Class328) this.aMap3728.get(object_1);
			if (class328_5 != null) {
				Object object_9 = class328_5.anObject3768;
				class328_5.anObject3768 = object_2;
				this.method5742(class328_5, false, (byte) 13);
				return object_9;
			} else {
				Class328 class328_6;
				if (this.method5738(16711680) && this.aMap3728.size() == this.anInt3730) {
					class328_6 = (Class328) this.anAbstractQueue_Sub1_3727.remove();
					this.aMap3728.remove(class328_6.anObject3770);
					this.anAbstractQueue_Sub1_3725.remove(class328_6);
				}
				class328_6 = new Class328(object_2, object_1);
				this.aMap3728.put(object_1, class328_6);
				this.method5742(class328_6, true, (byte) 6);
				Object obj_7 = null;
				return obj_7;
			}
		}
	}

	void method5742(Class328 class328_1, boolean bool_2, byte b_3) {
		if (!bool_2) {
			this.anAbstractQueue_Sub1_3725.remove(class328_1);
			if (this.method5738(16711680) && !this.anAbstractQueue_Sub1_3727.remove(class328_1)) {
				throw new IllegalStateException("");
			}
		}
		class328_1.aLong3767 = System.currentTimeMillis();
		if (this.method5738(16711680)) {
			switch (this.aClass332_3729.anInt3876) {
			case 0:
				++class328_1.aLong3769;
				break;
			case 1:
				class328_1.aLong3769 = class328_1.aLong3767;
			}
			this.anAbstractQueue_Sub1_3727.add(class328_1);
		}
		this.anAbstractQueue_Sub1_3725.add(class328_1);
	}

	public void method5744(byte b_1) {
		synchronized (this) {
			this.aMap3728.clear();
			this.anAbstractQueue_Sub1_3725.clear();
			if (this.method5738(16711680)) {
				this.anAbstractQueue_Sub1_3727.clear();
			}
		}
	}

	void method5745(byte b_1) {
		if (this.aLong3726 == -1L) {
			throw new IllegalStateException("");
		} else {
			long long_2 = System.currentTimeMillis() - this.aLong3726;
			while (!this.anAbstractQueue_Sub1_3725.isEmpty()) {
				Class328 class328_4 = (Class328) this.anAbstractQueue_Sub1_3725.peek();
				if (class328_4.aLong3767 >= long_2) {
					break;
				}
				this.aMap3728.remove(class328_4.anObject3770);
				this.anAbstractQueue_Sub1_3725.remove(class328_4);
				if (this.method5738(16711680)) {
					this.anAbstractQueue_Sub1_3727.remove(class328_4);
				}
			}
		}
	}

	public Class321(int i_1, Class332 class332_2) {
		this(-1L, i_1, class332_2);
	}

	public static void method5757(int i_0) {
		Class345.aClass229_4031.method3859(1719265419);
	}
}
