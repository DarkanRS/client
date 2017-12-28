
/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Class431 {
	public char aChar5140;
	int anInt5141;
	String aString5142 = "null";
	int anInt5143;
	Map aMap5144;
	Object[] anObjectArray5145;
	public char aChar5146;
	HashMap aHashMap5147;

	public int method7222(int i) {
		return ((Class431) this).anInt5141 * 451970335;
	}

	public boolean method7223(Object object) {
		if (0 == 451970335 * ((Class431) this).anInt5141)
			return false;
		if (((Class431) this).aHashMap5147 == null)
			method7233(1243120329);
		return ((Class431) this).aHashMap5147.containsKey(object);
	}

	void method7224(RsByteBuffer class282_sub35, int i, int i_0_) {
		if (i == 1)
			aChar5146 = Class11.method470(class282_sub35.readByte((short) -25760), -1589762239);
		else if (2 == i)
			aChar5140 = Class11.method470(class282_sub35.readByte((short) -9162), -940945676);
		else if (i == 3)
			((Class431) this).aString5142 = class282_sub35.readString(1536445218);
		else if (4 == i)
			((Class431) this).anInt5143 = class282_sub35.readInt() * -1641160573;
		else if (i == 5 || 6 == i) {
			((Class431) this).anInt5141 = class282_sub35.readUnsignedShort() * -1557612833;
			((Class431) this).aMap5144 = new HashMap(((Class431) this).anInt5141 * 451970335);
			for (int i_1_ = 0; i_1_ < ((Class431) this).anInt5141 * 451970335; i_1_++) {
				int i_2_ = class282_sub35.readInt();
				java.io.Serializable serializable;
				if (5 == i)
					serializable = class282_sub35.readString(100976796);
				else
					serializable = new Integer(class282_sub35.readInt());
				((Class431) this).aMap5144.put(new Integer(i_2_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_3_ = class282_sub35.readUnsignedShort();
			((Class431) this).anInt5141 = class282_sub35.readUnsignedShort() * -1557612833;
			((Class431) this).anObjectArray5145 = new Object[i_3_];
			for (int i_4_ = 0; i_4_ < 451970335 * ((Class431) this).anInt5141; i_4_++) {
				int i_5_ = class282_sub35.readUnsignedShort();
				if (7 == i)
					((Class431) this).anObjectArray5145[i_5_] = class282_sub35.readString(-258913669);
				else
					((Class431) this).anObjectArray5145[i_5_] = new Integer(class282_sub35.readInt());
			}
		}
	}

	Object method7225(int i, byte i_6_) {
		if (null != ((Class431) this).anObjectArray5145) {
			if (i < 0 || i >= ((Class431) this).anObjectArray5145.length)
				return null;
			return ((Class431) this).anObjectArray5145[i];
		}
		if (null != ((Class431) this).aMap5144)
			return ((Class431) this).aMap5144.get(new Integer(i));
		return null;
	}

	public String method7226(int i, int i_7_) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((Class431) this).aString5142;
		return (String) object;
	}

	void method7227(RsByteBuffer class282_sub35, byte i) {
		for (;;) {
			int i_8_ = class282_sub35.readUnsignedByte();
			if (0 == i_8_)
				break;
			method7224(class282_sub35, i_8_, -1155102640);
		}
	}

	public boolean method7228(Object object, byte i) {
		if (0 == 451970335 * ((Class431) this).anInt5141)
			return false;
		if (((Class431) this).aHashMap5147 == null)
			method7233(1243120329);
		return ((Class431) this).aHashMap5147.containsKey(object);
	}

	void method7229(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aChar5146 = Class11.method470(class282_sub35.readByte((short) -4343), -1657829033);
		else if (2 == i)
			aChar5140 = Class11.method470(class282_sub35.readByte((short) -22753), 1267007843);
		else if (i == 3)
			((Class431) this).aString5142 = class282_sub35.readString(1863822320);
		else if (4 == i)
			((Class431) this).anInt5143 = class282_sub35.readInt() * -1641160573;
		else if (i == 5 || 6 == i) {
			((Class431) this).anInt5141 = class282_sub35.readUnsignedShort() * -1557612833;
			((Class431) this).aMap5144 = new HashMap(((Class431) this).anInt5141 * 451970335);
			for (int i_9_ = 0; i_9_ < ((Class431) this).anInt5141 * 451970335; i_9_++) {
				int i_10_ = class282_sub35.readInt();
				java.io.Serializable serializable;
				if (5 == i)
					serializable = class282_sub35.readString(185126386);
				else
					serializable = new Integer(class282_sub35.readInt());
				((Class431) this).aMap5144.put(new Integer(i_10_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_11_ = class282_sub35.readUnsignedShort();
			((Class431) this).anInt5141 = class282_sub35.readUnsignedShort() * -1557612833;
			((Class431) this).anObjectArray5145 = new Object[i_11_];
			for (int i_12_ = 0; i_12_ < 451970335 * ((Class431) this).anInt5141; i_12_++) {
				int i_13_ = class282_sub35.readUnsignedShort();
				if (7 == i)
					((Class431) this).anObjectArray5145[i_13_] = class282_sub35.readString(1149772193);
				else
					((Class431) this).anObjectArray5145[i_13_] = new Integer(class282_sub35.readInt());
			}
		}
	}

	public boolean method7230(Object object) {
		if (0 == 451970335 * ((Class431) this).anInt5141)
			return false;
		if (((Class431) this).aHashMap5147 == null)
			method7233(1243120329);
		return ((Class431) this).aHashMap5147.containsKey(object);
	}

	void method7231() {
		HashMap hashmap = new HashMap();
		if (null != ((Class431) this).anObjectArray5145) {
			for (int i = 0; i < ((Class431) this).anObjectArray5145.length; i++) {
				if (null != ((Class431) this).anObjectArray5145[i]) {
					Object object = ((Class431) this).anObjectArray5145[i];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (((Class431) this).aMap5144 != null) {
			Iterator iterator = ((Class431) this).aMap5144.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (list == null) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		((Class431) this).aHashMap5147 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_14_ = list.iterator();
			while (iterator_14_.hasNext()) {
				Integer integer = (Integer) iterator_14_.next();
				is[i++] = integer.intValue();
			}
			if (null == ((Class431) this).anObjectArray5145)
				Arrays.sort(is);
			((Class431) this).aHashMap5147.put(entry.getKey(), is);
		}
	}

	public int method7232(int i, int i_15_) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((Class431) this).anInt5143 * -1972277717;
		return ((Integer) object).intValue();
	}

	void method7233(int i) {
		HashMap hashmap = new HashMap();
		if (null != ((Class431) this).anObjectArray5145) {
			for (int i_16_ = 0; i_16_ < ((Class431) this).anObjectArray5145.length; i_16_++) {
				if (null != ((Class431) this).anObjectArray5145[i_16_]) {
					Object object = ((Class431) this).anObjectArray5145[i_16_];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i_16_));
				}
			}
		} else if (((Class431) this).aMap5144 != null) {
			Iterator iterator = ((Class431) this).aMap5144.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (list == null) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		((Class431) this).aHashMap5147 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i_17_ = 0;
			Iterator iterator_18_ = list.iterator();
			while (iterator_18_.hasNext()) {
				Integer integer = (Integer) iterator_18_.next();
				is[i_17_++] = integer.intValue();
			}
			if (null == ((Class431) this).anObjectArray5145)
				Arrays.sort(is);
			((Class431) this).aHashMap5147.put(entry.getKey(), is);
		}
	}

	void method7234(RsByteBuffer class282_sub35, int i) {
		if (i == 1)
			aChar5146 = Class11.method470(class282_sub35.readByte((short) -27224), -1874955458);
		else if (2 == i)
			aChar5140 = Class11.method470(class282_sub35.readByte((short) -19143), 1492940801);
		else if (i == 3)
			((Class431) this).aString5142 = class282_sub35.readString(386674298);
		else if (4 == i)
			((Class431) this).anInt5143 = class282_sub35.readInt() * -1641160573;
		else if (i == 5 || 6 == i) {
			((Class431) this).anInt5141 = class282_sub35.readUnsignedShort() * -1557612833;
			((Class431) this).aMap5144 = new HashMap(((Class431) this).anInt5141 * 451970335);
			for (int i_19_ = 0; i_19_ < ((Class431) this).anInt5141 * 451970335; i_19_++) {
				int i_20_ = class282_sub35.readInt();
				java.io.Serializable serializable;
				if (5 == i)
					serializable = class282_sub35.readString(-24415718);
				else
					serializable = new Integer(class282_sub35.readInt());
				((Class431) this).aMap5144.put(new Integer(i_20_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_21_ = class282_sub35.readUnsignedShort();
			((Class431) this).anInt5141 = class282_sub35.readUnsignedShort() * -1557612833;
			((Class431) this).anObjectArray5145 = new Object[i_21_];
			for (int i_22_ = 0; i_22_ < 451970335 * ((Class431) this).anInt5141; i_22_++) {
				int i_23_ = class282_sub35.readUnsignedShort();
				if (7 == i)
					((Class431) this).anObjectArray5145[i_23_] = class282_sub35.readString(1194875966);
				else
					((Class431) this).anObjectArray5145[i_23_] = new Integer(class282_sub35.readInt());
			}
		}
	}

	public int method7235(int i) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((Class431) this).anInt5143 * -1972277717;
		return ((Integer) object).intValue();
	}

	public int method7236(int i) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((Class431) this).anInt5143 * -1972277717;
		return ((Integer) object).intValue();
	}

	public int method7237(int i) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((Class431) this).anInt5143 * -1972277717;
		return ((Integer) object).intValue();
	}

	public String method7238(int i) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((Class431) this).aString5142;
		return (String) object;
	}

	public String method7239(int i) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((Class431) this).aString5142;
		return (String) object;
	}

	Object method7240(int i) {
		if (null != ((Class431) this).anObjectArray5145) {
			if (i < 0 || i >= ((Class431) this).anObjectArray5145.length)
				return null;
			return ((Class431) this).anObjectArray5145[i];
		}
		if (null != ((Class431) this).aMap5144)
			return ((Class431) this).aMap5144.get(new Integer(i));
		return null;
	}

	Object method7241(int i) {
		if (null != ((Class431) this).anObjectArray5145) {
			if (i < 0 || i >= ((Class431) this).anObjectArray5145.length)
				return null;
			return ((Class431) this).anObjectArray5145[i];
		}
		if (null != ((Class431) this).aMap5144)
			return ((Class431) this).aMap5144.get(new Integer(i));
		return null;
	}

	Class431() {
		((Class431) this).anInt5141 = 0;
	}

	void method7242(RsByteBuffer class282_sub35) {
		for (;;) {
			int i = class282_sub35.readUnsignedByte();
			if (0 == i)
				break;
			method7224(class282_sub35, i, 716815214);
		}
	}

	public boolean method7243(Object object) {
		if (0 == 451970335 * ((Class431) this).anInt5141)
			return false;
		if (((Class431) this).aHashMap5147 == null)
			method7233(1243120329);
		return ((Class431) this).aHashMap5147.containsKey(object);
	}

	public boolean method7244(Object object) {
		if (0 == 451970335 * ((Class431) this).anInt5141)
			return false;
		if (((Class431) this).aHashMap5147 == null)
			method7233(1243120329);
		return ((Class431) this).aHashMap5147.containsKey(object);
	}

	public int[] method7245(Object object) {
		if (0 == ((Class431) this).anInt5141 * 451970335)
			return null;
		if (null == ((Class431) this).aHashMap5147)
			method7233(1243120329);
		return (int[]) ((Class431) this).aHashMap5147.get(object);
	}

	public int[] method7246(Object object) {
		if (0 == ((Class431) this).anInt5141 * 451970335)
			return null;
		if (null == ((Class431) this).aHashMap5147)
			method7233(1243120329);
		return (int[]) ((Class431) this).aHashMap5147.get(object);
	}

	public int method7247() {
		return ((Class431) this).anInt5141 * 451970335;
	}

	public int method7248() {
		return ((Class431) this).anInt5141 * 451970335;
	}

	public int method7249() {
		return ((Class431) this).anInt5141 * 451970335;
	}

	void method7250() {
		HashMap hashmap = new HashMap();
		if (null != ((Class431) this).anObjectArray5145) {
			for (int i = 0; i < ((Class431) this).anObjectArray5145.length; i++) {
				if (null != ((Class431) this).anObjectArray5145[i]) {
					Object object = ((Class431) this).anObjectArray5145[i];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i));
				}
			}
		} else if (((Class431) this).aMap5144 != null) {
			Iterator iterator = ((Class431) this).aMap5144.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry entry = (Map.Entry) iterator.next();
				Object object = entry.getValue();
				List list = (List) hashmap.get(object);
				if (list == null) {
					list = new LinkedList();
					hashmap.put(object, list);
				}
				list.add(entry.getKey());
			}
		} else
			throw new IllegalStateException();
		((Class431) this).aHashMap5147 = new HashMap();
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			List list = (List) entry.getValue();
			int[] is = new int[list.size()];
			int i = 0;
			Iterator iterator_24_ = list.iterator();
			while (iterator_24_.hasNext()) {
				Integer integer = (Integer) iterator_24_.next();
				is[i++] = integer.intValue();
			}
			if (null == ((Class431) this).anObjectArray5145)
				Arrays.sort(is);
			((Class431) this).aHashMap5147.put(entry.getKey(), is);
		}
	}

	public int[] method7251(Object object, int i) {
		if (0 == ((Class431) this).anInt5141 * 451970335)
			return null;
		if (null == ((Class431) this).aHashMap5147)
			method7233(1243120329);
		return (int[]) ((Class431) this).aHashMap5147.get(object);
	}

	static boolean method7252(int i, byte i_25_) {
		if (3 == i || i == 4 || 5 == i || i == 6 || i == 1001 || 1002 == i)
			return true;
		if (i == 2)
			return true;
		return false;
	}
}
