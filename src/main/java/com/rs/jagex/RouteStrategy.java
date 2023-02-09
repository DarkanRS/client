package com.rs.jagex;

public abstract class RouteStrategy {

	public int approxDestinationX;
	public int approxDestinationY;
	public int approxDestinationSizeX;

	public int approxDestinationSizeY;

	public abstract boolean canExit(int size, int x, int y, ClipFlagMap var4);
}
