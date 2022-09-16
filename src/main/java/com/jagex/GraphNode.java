package com.jagex;

public class GraphNode {

	boolean aBool5938 = true;
	boolean aBool5945 = true;
	boolean aBool5942;
	GraphNode aGraphNode_5944;
	GraphNode aGraphNode_5943;
	GraphNode aGraphNode_5940;
	CoordinateSpace aClass305_5936 = new CoordinateSpace();
	CoordinateSpace aClass305_5937 = new CoordinateSpace();
	CoordinateSpace aClass305_5939 = new CoordinateSpace();
	Matrix44Var aClass294_5941;

	GraphNode() {
		new Matrix44();
		new Matrix44();
		aClass294_5941 = new Matrix44Var();
		aBool5942 = true;
		aGraphNode_5943 = null;
		aGraphNode_5944 = null;
		aGraphNode_5940 = null;
	}

	public CoordinateSpace method11165() {
		return aClass305_5936;
	}

	public CoordinateSpace method11166() {
		if (aBool5938) {
			aBool5938 = false;
			if (aGraphNode_5943 != null) {
				aClass305_5937.copy(aClass305_5936);
				aClass305_5937.method5414(aGraphNode_5943.method11166());
			} else
				aClass305_5937.copy(aClass305_5936);
		}
		return aClass305_5937;
	}

	CoordinateSpace method11167() {
		if (aBool5945) {
			aBool5945 = false;
			aClass305_5939.copy(method11166());
			aClass305_5939.method5413();
		}

		return aClass305_5937;
	}

	Matrix44Var method11168() {
		if (aBool5942) {
			aBool5942 = false;
			aClass294_5941.method5279(method11166());
		}

		return aClass294_5941;
	}

	public void method11171(Vector3 vector3_1) {
		aClass305_5936.coords.copy(vector3_1);
		method11174();
		if (aGraphNode_5944 != null)
			aGraphNode_5944.method11188();

	}

	public void method11172(float f_1, float f_2, float f_3) {
		aClass305_5936.coords.set(f_1, f_2, f_3);
		method11174();
		if (aGraphNode_5944 != null)
			aGraphNode_5944.method11188();

	}

	void method11174() {
		aBool5938 = true;
		aBool5945 = true;
		aBool5942 = true;
	}

	void method11175(CoordinateSpace class305_1) {
		aClass305_5936.copy(class305_1);
		method11174();
		if (aGraphNode_5944 != null)
			aGraphNode_5944.method11188();

	}

	public void method11176() {
		GraphNode class521_1;
		if (aGraphNode_5943 != null) {
			class521_1 = aGraphNode_5943.aGraphNode_5944;
			if (class521_1 == this)
				aGraphNode_5943.aGraphNode_5944 = aGraphNode_5940;
			else {
				while (this != class521_1.aGraphNode_5940)
					class521_1 = class521_1.aGraphNode_5940;

				class521_1.aGraphNode_5940 = aGraphNode_5940;
			}
		}

		method11174();
		if (aGraphNode_5944 != null) {
			aGraphNode_5944.method11188();
			class521_1 = aGraphNode_5944;

			while (true) {
				class521_1.aClass305_5936.method5414(aClass305_5936);
				class521_1.aGraphNode_5943 = aGraphNode_5943;
				if (class521_1.aGraphNode_5940 == null) {
					class521_1.aGraphNode_5940 = aGraphNode_5943.aGraphNode_5944;
					aGraphNode_5943.aGraphNode_5944 = aGraphNode_5944;
					break;
				}

				class521_1 = class521_1.aGraphNode_5940;
			}
		}

		aGraphNode_5943 = null;
		aGraphNode_5940 = null;
		aGraphNode_5944 = null;
	}

	public void method11187(Quaternion quaternion_1) {
		aClass305_5936.quaternion.copy(quaternion_1);
		method11174();
		if (aGraphNode_5944 != null)
			aGraphNode_5944.method11188();

	}

	void method11188() {
		method11174();
		if (aGraphNode_5944 != null)
			aGraphNode_5944.method11188();

		if (aGraphNode_5940 != null)
			aGraphNode_5940.method11188();

	}

	void method11191(CoordinateSpace class305_1) {
		if (aGraphNode_5943 != null) {
			CoordinateSpace class305_2 = new CoordinateSpace(class305_1);
			class305_2.method5414(aGraphNode_5943.method11167());
			method11175(class305_2);
		} else
			method11175(class305_1);

	}

}
