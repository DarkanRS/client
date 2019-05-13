public enum MovementType implements Identifiable {

	STATIONARY((byte) -1), 
	HALF_WALK((byte) 0), 
	WALKING((byte) 1), 
	RUNNING((byte) 2);

	public byte id;

	public int getValue() {
		return this.id;
	}

	public int getValueIncr() {
		return this.id + 1;
	}

	MovementType(byte b_1) {
		this.id = b_1;
	}
}
