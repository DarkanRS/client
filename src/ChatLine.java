
/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Iterator;

public class ChatLine {
	public String message;
	public int anInt1084;
	public int anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
	public int anInt1086;
	public String crownedName;
	public String nameSimple;
	public String name;
	public String clan;
	public int anInt1091;
	public int type;
	public static String aString1093;

	void set(int type, int i_6_, String crownedName, String name, String nameSimple, String clan, int i_10_, String message) {
		this.anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0) * 1559615941;
		this.anInt1084 = client.cycles * -953903207;
		this.type = type * -1301834499;
		this.anInt1086 = i_6_ * 1439047399;
		this.crownedName = crownedName;
		this.name = name;
		this.nameSimple = nameSimple;
		this.clan = clan;
		this.anInt1091 = 1875798715 * i_10_;
		this.message = message;
	}

	ChatLine(int i, int i_13_, String string, String string_14_, String string_15_, String string_16_, int i_17_, String string_18_) {
		this.anInt1084 = -953903207 * client.cycles;
		this.type = i * -1301834499;
		this.anInt1086 = 1439047399 * i_13_;
		this.crownedName = string;
		this.name = string_14_;
		this.nameSimple = string_15_;
		this.clan = string_16_;
		this.anInt1091 = 1875798715 * i_17_;
		this.message = string_18_;
	}

	static final void method1845(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 122183599) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class118.anObjectArray1271 = Class351.method6193(string, class527, 350429453);
		class118.aBool1384 = true;
	}

	public static int getLength(String string) {
		return string.length() + 1;
	}

	static RsByteBuffer getLoginMod() {
		RsByteBuffer class282_sub35 = Class94.method1587((byte) -101);
		class282_sub35.writeLong(0L);
		class282_sub35.writeString(Class9.aString102);
		class282_sub35.writeLong(Class9.aLong86 * -6063499577746028609L);
		class282_sub35.writeLong(2357923306087344989L * client.aLong7409);
		class282_sub35.applyRSA(Class18.LOGIN_EXPONENT, Class18.LOGIN_MODULUS);
		return class282_sub35;
	}

	public static void method1848(SceneObjectManager class206, GraphicalRenderer class505, int i) {
		Iterator iterator = Class235.aList2896.iterator();
		while (iterator.hasNext()) {
			Class539 class539 = (Class539) iterator.next();
			if (class539.aBool7130) {
				class539.method11516(class206, class505);
			}
		}
	}
}
