package com.jagex;
public class PlayerStrategy extends RouteStrategy {

	int anInt7929;

	public boolean canExit(int i_1, int i_2, int i_3, ClipMap clipmap_4) {
		return clipmap_4.method5978(i_2, i_3, i_1, i_1, this.approxDestinationX, this.approxDestinationY, this.approxDestinationSizeX, this.approxDestinationSizeY, this.anInt7929);
	}
}
