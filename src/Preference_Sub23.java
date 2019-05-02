public class Preference_Sub23 extends Preference {

	public int method12897(byte b_1) {
		return this.anInt5578;
	}

	public void method12898() {
		if (this.manager.getGame() != Game.darkan) {
			this.anInt5578 = 1;
		}

		if (this.anInt5578 != 0 && this.anInt5578 != 1) {
			this.anInt5578 = this.method7781(2046040491);
		}

	}

	int method7786() {
		return 1;
	}

	public boolean method12899() {
		return this.manager.getGame() == Game.darkan;
	}

	int method7781(int i_1) {
		return 1;
	}

	void setValue(int i_1) {
		this.anInt5578 = i_1;
	}

	public Preference_Sub23(int i_1, GamePreferences class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	public int method7784(int i_1) {
		return this.manager.getGame() == Game.darkan ? 1 : 3;
	}

	void method7780(int i_1) {
		this.anInt5578 = i_1 * -754033619 * -859024475;
	}

	int method7787() {
		return 1;
	}

	public int method7785(int i_1) {
		return this.manager.getGame() == Game.darkan ? 1 : 3;
	}

	public Preference_Sub23(GamePreferences class282_sub54_1) {
		super(class282_sub54_1);
	}

}
