public class Position {

	public Quaternion quaternion = new Quaternion();
	public Vector3 coords = new Vector3();

	public void copy(Position position) {
		this.quaternion.copy(position.quaternion);
		this.coords.copy(position.coords);
	}

	public Position() {
	}

	public final void method5413() {
		this.quaternion.negate();
		this.coords.negate();
		this.coords.method6634(this.quaternion);
	}

	public final void method5414(Position pos2) {
		this.quaternion.multiply(pos2.quaternion);
		this.coords.method6634(pos2.quaternion);
		this.coords.add(pos2.coords);
	}

	public Position(Position position) {
		this.copy(position);
	}

	public String toString() {
		return "[" + this.quaternion.toString() + "|" + this.coords.toString() + "]";
	}

}
