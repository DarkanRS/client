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

	public Class60 method24() {
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
			TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.aClass379_4556, client.outputContext.isaac);
			tcpmessage_3.buffer.writeShort(i_0);
			client.outputContext.queuePacket(tcpmessage_3);
		} else {
			HitsplatIndexLoader.method3614(Class397.aClass397_4800, i_0, -1, (byte) 69);
		}
	}

	public static void method1261(Index index_0) {
		Class235.anInt2902 = 0;
		Class235.anInt2905 = 0;
		Class235.aList2896 = new LinkedList();
		Class235.aEntityNode_Sub1_Sub1_Sub1Array2897 = new Particle[1024];
		Queue.aClass539Array5632 = new ParticleSystem[Class89.anIntArray931[Class235.anInt2906] + 1];
		Class235.anInt2899 = 0;
		Class235.anInt2901 = 0;
		Node_Sub20_Sub22.setParticleIndex(index_0);
		Class111.method1866(index_0);
	}

	public static boolean setGameHost(int i_0, String string_1) {
		Class159.GAME_CONNECTION_INFO = new ConnectionInfo();
		Class159.GAME_CONNECTION_INFO.worldId = i_0;
		Class159.GAME_CONNECTION_INFO.host = string_1;
		if (HDWaterTile.SERVER_ENVIRONMENT != ServerEnvironment.LIVE) {
			Class159.GAME_CONNECTION_INFO.anInt5434 = Class159.GAME_CONNECTION_INFO.worldId;
			Class159.GAME_CONNECTION_INFO.anInt5437 = Class159.GAME_CONNECTION_INFO.worldId;
		}
		return true;
	}
}
