public class Node_Sub44_Sub2 extends IFSubNode {

	int anInt9482;

	public boolean method13401() {
		Player player_2 = client.players[this.anInt9482];
		if (player_2 != null) {
			AccountCreationStage.method252(CS2HookEventType.aClass397_4807, this.interfaceId, player_2, this.anInt9482, 2003138435);
			return true;
		} else {
			return false;
		}
	}

	public Node_Sub44_Sub2(int i_1, int i_2, int i_3) {
		super(i_1, i_2);
		this.anInt9482 = i_3;
	}

}
