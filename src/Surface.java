public class Surface {

	public int anInt834;
	public Surface aClass87_835;
	public int anInt840;
	public int anInt841;
	public int anInt843;
	public int anInt844;
	public int anInt845;
	public int anInt846;
	public int anInt847;
	public int anInt848;
	int anInt842;
	public int anInt836;
	public int anInt837;
	public int anInt838;
	public byte aByte839;

	public ParticleProducerDefinition method1485() {
		return Node_Sub11_Sub1.getParticleProducerDefs(this.anInt842);
	}

	Surface method1488(int i_1, int i_2, int i_3) {
		return new Surface(this.anInt842, i_1, i_2, i_3, this.aByte839);
	}

	Surface(int i_1, int i_2, int i_3, int i_4, byte b_5) {
		this.anInt842 = i_1;
		this.anInt836 = i_2;
		this.anInt837 = i_3;
		this.anInt838 = i_4;
		this.aByte839 = b_5;
	}

	public static AccountCreationResponseOpcodes method1489() {
		return CutsceneAction_Sub9.RECIEVED_RESPONSE == null ? AccountCreationResponseOpcodes.aClass483_5730 : CutsceneAction_Sub9.RECIEVED_RESPONSE;
	}

	public static void method1491(int i_0, byte b_1) {
		if (Class148.anInt1730 != 0) {
			Class158_Sub2_Sub3.anInt10243 = i_0;
		} else {
			Class148.aNode_Sub15_Sub2_1735.setVolume(i_0, 814872907);
		}
	}
}
