import java.util.LinkedList;

public class Class62 implements Interface3 {

	public String aString649;

	public Class356 aClass356_650;

	public Class353 aClass353_654;

	public int anInt651;

	public int anInt655;

	public int anInt653;

	public int anInt656;

	public int anInt657;

	public int anInt652;

	public int anInt648;

	public int anInt658;

	public int anInt659;

	public int anInt660;

	public Class60 method24(int i_1) {
		return Class60.aClass60_604;
	}

	Class62(String string_1, Class356 class356_2, Class353 class353_3, int i_4, int i_5, int i_6, int i_7, int i_8, int i_9, int i_10, int i_11, int i_12, int i_13) {
		this.aString649 = string_1;
		this.aClass356_650 = class356_2;
		this.aClass353_654 = class353_3;
		this.anInt651 = i_4;
		this.anInt655 = i_5;
		this.anInt653 = i_6;
		this.anInt656 = i_7;
		this.anInt657 = i_8;
		this.anInt652 = i_9;
		this.anInt648 = i_10;
		this.anInt658 = i_11;
		this.anInt659 = i_12;
		this.anInt660 = i_13;
	}

	public Class60 method25() {
		return Class60.aClass60_604;
	}

	static void method1260(int i_0, boolean bool_1, int i_2) {
		if (bool_1) {
			TCPMessage tcpmessage_3 = Class271.method4828(OutgoingPacket.aClass379_4556, client.aClass184_7475.isaac, -341537070);
			tcpmessage_3.buffer.writeShort(i_0, 1417031095);
			client.aClass184_7475.method3049(tcpmessage_3, 684083045);
		} else {
			Class210.method3614(Class397.aClass397_4800, i_0, -1, (byte) 69);
		}
	}

	public static void method1261(Index index_0, byte b_1) {
		Class235.anInt2902 = 0;
		Class235.anInt2905 = 0;
		Class235.aList2896 = new LinkedList();
		Class235.aClass275_Sub1_Sub1_Sub1Array2897 = new Particle[1024];
		Queue.aClass539Array5632 = new ParticleSystem[Class89.anIntArray931[Class235.anInt2906] + 1];
		Class235.anInt2899 = 0;
		Class235.anInt2901 = 0;
		Class282_Sub20_Sub22.setParticleIndex(index_0, (byte) -16);
		Class111.method1866(index_0, -473782412);
	}

	public static boolean method1262(int i_0, String string_1, byte b_2) {
		Class159.aClass450_2010 = new Class450();
		Class159.aClass450_2010.worldId = i_0;
		Class159.aClass450_2010.aString5433 = string_1;
		if (Class90.aClass496_952 != Class496.aClass496_5813) {
			Class159.aClass450_2010.anInt5434 = Class159.aClass450_2010.worldId * -1708079975 + 1140744768;
			Class159.aClass450_2010.anInt5437 = Class159.aClass450_2010.worldId * -1473668237 + 1047080176;
		}
		return true;
	}
}
