package com.rs.jagex;

import com.rs.Loader;

public class SubInterface extends Node {

	public static Loader suppliedApplet;
	public int interfaceId;
	public int overlay;

	public SubInterface(int i_1, int i_2) {
		interfaceId = i_1;
		overlay = i_2;
	}

	public boolean load() {
		return true;
	}
}
