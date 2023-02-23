package com.rs.jagex;

public enum RenderDistance {
	LOW(4),
	MED(5),
	HIGH(6);

	public int chunkSize;

	RenderDistance(int i_2) {
		chunkSize = i_2;
	}
}
