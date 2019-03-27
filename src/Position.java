public class Position {

	public Quaternion aClass381_3594 = new Quaternion();
	public Vector3 aClass385_3595 = new Vector3();

	public void method5411(Position class305_1) {
		this.aClass381_3594.copy(class305_1.aClass381_3594);
		this.aClass385_3595.copy(class305_1.aClass385_3595);
	}

	public Position() {
	}

	public final void method5413() {
		this.aClass381_3594.negate();
		this.aClass385_3595.negate();
		this.aClass385_3595.method6634(this.aClass381_3594);
	}

	public final void method5414(Position class305_1) {
		this.aClass381_3594.multiply(class305_1.aClass381_3594);
		this.aClass385_3595.method6634(class305_1.aClass381_3594);
		this.aClass385_3595.add(class305_1.aClass385_3595);
	}

	public Position(Position class305_1) {
		this.method5411(class305_1);
	}

	public String toString() {
		return "[" + this.aClass381_3594.toString() + "|" + this.aClass385_3595.toString() + "]";
	}

}
