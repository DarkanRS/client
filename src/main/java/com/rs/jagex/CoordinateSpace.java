package com.rs.jagex;

public class CoordinateSpace {

	public Quaternion quaternion = new Quaternion();
	public Vector3 coords = new Vector3();

	public CoordinateSpace() {
	}

	public CoordinateSpace(CoordinateSpace coordinateSpace) {
		copy(coordinateSpace);
	}

	public void copy(CoordinateSpace coordinateSpace) {
		quaternion.copy(coordinateSpace.quaternion);
		coords.copy(coordinateSpace.coords);
	}

	public void method5413() {
		quaternion.negate();
		coords.negate();
		coords.method6634(quaternion);
	}

	public void method5414(CoordinateSpace pos2) {
		quaternion.multiply(pos2.quaternion);
		coords.method6634(pos2.quaternion);
		coords.add(pos2.coords);
	}

	@Override
	public String toString() {
		return "[" + quaternion + "|" + coords + "]";
	}

}
