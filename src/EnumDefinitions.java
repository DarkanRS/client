
/* Class431 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class EnumDefinitions {
	public char aChar5140;
	int anInt5141;
	String aString5142 = "null";
	int anInt5143;
	Map aMap5144;
	Object[] anObjectArray5145;
	public char aChar5146;
	HashMap aHashMap5147;

	public int method7222(int i) {
		return ((EnumDefinitions) this).anInt5141 * 451970335;
	}

	void method7224(RsByteBuffer class282_sub35, int i, int i_0_) {
		if (i == 1)
			aChar5146 = Class11.method470(class282_sub35.readByte(), -1589762239);
		else if (2 == i)
			aChar5140 = Class11.method470(class282_sub35.readByte(), -940945676);
		else if (i == 3)
			((EnumDefinitions) this).aString5142 = class282_sub35.readString();
		else if (4 == i)
			((EnumDefinitions) this).anInt5143 = class282_sub35.readInt() * -1641160573;
		else if (i == 5 || 6 == i) {
			((EnumDefinitions) this).anInt5141 = class282_sub35.readUnsignedShort() * -1557612833;
			((EnumDefinitions) this).aMap5144 = new HashMap(((EnumDefinitions) this).anInt5141 * 451970335);
			for (int i_1_ = 0; i_1_ < ((EnumDefinitions) this).anInt5141 * 451970335; i_1_++) {
				int i_2_ = class282_sub35.readInt();
				java.io.Serializable serializable;
				if (5 == i)
					serializable = class282_sub35.readString();
				else
					serializable = new Integer(class282_sub35.readInt());
				((EnumDefinitions) this).aMap5144.put(new Integer(i_2_), serializable);
			}
		} else if (i == 7 || i == 8) {
			int i_3_ = class282_sub35.readUnsignedShort();
			((EnumDefinitions) this).anInt5141 = class282_sub35.readUnsignedShort() * -1557612833;
			((EnumDefinitions) this).anObjectArray5145 = new Object[i_3_];
			for (int i_4_ = 0; i_4_ < 451970335 * ((EnumDefinitions) this).anInt5141; i_4_++) {
				int i_5_ = class282_sub35.readUnsignedShort();
				if (7 == i)
					((EnumDefinitions) this).anObjectArray5145[i_5_] = class282_sub35.readString();
				else
					((EnumDefinitions) this).anObjectArray5145[i_5_] = new Integer(class282_sub35.readInt());
			}
		}
	}

	Object method7225(int i, byte i_6_) {
		if (null != ((EnumDefinitions) this).anObjectArray5145) {
			if (i < 0 || i >= ((EnumDefinitions) this).anObjectArray5145.length)
				return null;
			return ((EnumDefinitions) this).anObjectArray5145[i];
		}
		if (null != ((EnumDefinitions) this).aMap5144)
			return ((EnumDefinitions) this).aMap5144.get(new Integer(i));
		return null;
	}

	public String method7226(int i, int i_7_) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((EnumDefinitions) this).aString5142;
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
		if (0 == 451970335 * ((EnumDefinitions) this).anInt5141)
			return false;
		if (((EnumDefinitions) this).aHashMap5147 == null)
			method7233(1243120329);
		return ((EnumDefinitions) this).aHashMap5147.containsKey(object);
	}

	public int method7232(int i, int i_15_) {
		Object object = method7225(i, (byte) 1);
		if (object == null)
			return ((EnumDefinitions) this).anInt5143 * -1972277717;
		return ((Integer) object).intValue();
	}

	void method7233(int i) {
		HashMap hashmap = new HashMap();
		if (null != ((EnumDefinitions) this).anObjectArray5145) {
			for (int i_16_ = 0; i_16_ < ((EnumDefinitions) this).anObjectArray5145.length; i_16_++) {
				if (null != ((EnumDefinitions) this).anObjectArray5145[i_16_]) {
					Object object = ((EnumDefinitions) this).anObjectArray5145[i_16_];
					List list = (List) hashmap.get(object);
					if (null == list) {
						list = new LinkedList();
						hashmap.put(object, list);
					}
					list.add(new Integer(i_16_));
				}
			}
		} else if (((EnumDefinitions) this).aMap5144 != null) {
			Iterator iterator = ((EnumDefinitions) this).aMap5144.entrySet().iterator();
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
		((EnumDefinitions) this).aHashMap5147 = new HashMap();
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
			if (null == ((EnumDefinitions) this).anObjectArray5145)
				Arrays.sort(is);
			((EnumDefinitions) this).aHashMap5147.put(entry.getKey(), is);
		}
	}

	EnumDefinitions() {
		((EnumDefinitions) this).anInt5141 = 0;
	}

	public int[] method7251(Object object, int i) {
		if (0 == ((EnumDefinitions) this).anInt5141 * 451970335)
			return null;
		if (null == ((EnumDefinitions) this).aHashMap5147)
			method7233(1243120329);
		return (int[]) ((EnumDefinitions) this).aHashMap5147.get(object);
	}

	static boolean method7252(int i, byte i_25_) {
		if (3 == i || i == 4 || 5 == i || i == 6 || i == 1001 || 1002 == i)
			return true;
		if (i == 2)
			return true;
		return false;
	}
}
