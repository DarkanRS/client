import java.util.Iterator;

public class ChatLine {

	public static String aString1093;
	public int anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0);
	public int anInt1084;
	public int type;
	public int anInt1086;
	public String crownedName;
	public String name;
	public String nameSimple;
	public String clan;
	public int anInt1091;
	public String message;

	void set(int i_1, int i_2, String string_3, String string_4, String string_5, String string_6, int i_7, String string_8) {
		this.anInt1085 = Class282_Sub20_Sub28.method15396((byte) 0);
		this.anInt1084 = client.cycles;
		this.type = i_1;
		this.anInt1086 = i_2;
		this.crownedName = string_3;
		this.name = string_4;
		this.nameSimple = string_5;
		this.clan = string_6;
		this.anInt1091 = i_7;
		this.message = string_8;
	}

	ChatLine(int i_1, int i_2, String string_3, String string_4, String string_5, String string_6, int i_7, String string_8) {
		this.anInt1084 = client.cycles;
		this.type = i_1;
		this.anInt1086 = i_2;
		this.crownedName = string_3;
		this.name = string_4;
		this.nameSimple = string_5;
		this.clan = string_6;
		this.anInt1091 = i_7;
		this.message = string_8;
	}

	static final void method1845(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.objectStack[--cs2executor_2.anInt7000];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 122183599) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1271 = Class351.method6193(string_4, cs2executor_2, 350429453);
		icomponentdefinitions_0.aBool1384 = true;
	}

	public static int getLength(String string_0) {
		return string_0.length() + 1;
	}

	static RsByteBuffer getLoginMod() {
		RsByteBuffer rsbytebuffer_0 = Class94.method1587((byte) -101);
		rsbytebuffer_0.writeLong(0L);
		rsbytebuffer_0.writeString(Class9.aString102);
		rsbytebuffer_0.writeLong(Class9.aLong86);
		rsbytebuffer_0.writeLong(client.aLong7409);
		rsbytebuffer_0.applyRSA(Loader.RSA_PUBLIC_EXPONENT, Loader.RSA_PUBLIC_MODULUS);
		return rsbytebuffer_0;
	}

	public static void method1848(SceneObjectManager sceneobjectmanager_0, GraphicalRenderer graphicalrenderer_1, int i_2) {
		Iterator iterator_3 = Class235.aList2896.iterator();

		while (iterator_3.hasNext()) {
			ParticleSystem class539_4 = (ParticleSystem) iterator_3.next();
			if (class539_4.aBool7130) {
				class539_4.method11516(sceneobjectmanager_0, graphicalrenderer_1);
			}
		}

	}

}
