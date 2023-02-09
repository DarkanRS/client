package com.rs.jagex;

public abstract class MouseRecord extends Node {

	public abstract void cache();

	public abstract int getClickType();

	public abstract int getMeta();

	public abstract long getTime();

	public abstract int getX();

	public abstract int getY();
}
