/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public final class Class112 {

	Class112() throws Throwable {
		throw new Error();
	}

	public static Class60[] method1870(int i) {
		return new Class60[] { Class60.aClass60_609, Class60.aClass60_602, Class60.aClass60_603, Class60.aClass60_608, Class60.aClass60_605, Class60.aClass60_606, Class60.aClass60_607, Class60.aClass60_604, Class60.aClass60_601, Class60.aClass60_610 };
	}

	public static int method1871(int i, int i_9_, int i_10_, int i_11_) {
		i_10_ &= 0x3;
		if (i_10_ == 0)
			return i;
		if (i_10_ == 1)
			return i_9_;
		if (2 == i_10_)
			return 7 - i;
		return 7 - i_9_;
	}

	static final void method1872(CS2Executor class527, int i) {
		class527.intStackPtr -= 283782002;
		int i_12_ = (class527.intStack[class527.intStackPtr * 1942118537]);
		int i_13_ = (class527.intStack[1 + 1942118537 * class527.intStackPtr]);
		class527.intStack[(class527.intStackPtr += 141891001) * 1942118537 - 1] = Class252.method4327(i_12_, i_13_, true, false, (byte) 32);
	}

	public static int findRoute(int srcX, int srcY, int srcSizeXY, RouteStrategy strategy, ClipMap clipMap, boolean findAlternative, int[] bufferX, int[] bufferY, int i_17_) {
		for (int x = 0; x < 128; x++) {
			for (int y = 0; y < 128; y++) {
				Class251.directions[x][y] = 0;
				Class251.distances[x][y] = 99999999;
			}
		}
		boolean found;
		if (srcSizeXY == 1)
			found = Class96_Sub17.performCalculationS1(srcX, srcY, strategy, clipMap, -1231399529);
		else if (srcSizeXY == 2)
			found = Class46.performCalculationS2(srcX, srcY, strategy, clipMap, -46560095);
		else
			found = Class46.performCalculationSX(srcX, srcY, srcSizeXY, strategy, clipMap, (byte) 21);
		int graphBaseX = srcX - 64;
		int graphBaseY = srcY - 64;
		int endX = Class251.exitX * -1659935235;
		int endY = Class251.exitY * 1434452541;
		if (!found) {
			if (findAlternative) {
				int lowestCost = Integer.MAX_VALUE;
				int lowestDistance = Integer.MAX_VALUE;
				int alternativeRouteRange = 10;
				int approxDestX = -1440558477 * strategy.approxDestinationX;
				int approxDestY = strategy.approxDestinationY * 1732585867;
				int approxDestinationSizeX = -1384164183 * strategy.approxDestinationSizeX;
				int approxDestinationSizeY = strategy.approxDestinationSizeY * 361960939;
				for (int checkX = approxDestX - alternativeRouteRange; checkX <= approxDestX + alternativeRouteRange; checkX++) {
					for (int checkY = approxDestY - alternativeRouteRange; checkY <= approxDestY + alternativeRouteRange; checkY++) {
						int graphX = checkX - graphBaseX;
						int graphY = checkY - graphBaseY;
						if (graphX >= 0 && graphY >= 0 && graphX < 128 && graphY < 128 && (Class251.distances[graphX][graphY] < 100)) {
							int deltaX = 0;
							if (checkX < approxDestX)
								deltaX = approxDestX - checkX;
							else if (checkX > approxDestinationSizeX + approxDestX - 1)
								deltaX = checkX - (approxDestX + approxDestinationSizeX - 1);
							int deltaY = 0;
							if (checkY < approxDestY)
								deltaY = approxDestY - checkY;
							else if (checkY > approxDestinationSizeY + approxDestY - 1)
								deltaY = checkY - (approxDestY + approxDestinationSizeY - 1);
							int cost = deltaX * deltaX + deltaY * deltaY;
							if (cost < lowestCost || (cost == lowestCost && (Class251.distances[graphX][graphY]) < lowestDistance)) {
								lowestCost = cost;
								lowestDistance = (Class251.distances[graphX][graphY]);
								endX = checkX;
								endY = checkY;
							}
						}
					}
				}
				if (lowestCost == Integer.MAX_VALUE)
					return -1;
			} else
				return -1;
		}
		if (srcX == endX && srcY == endY)
			return 0;
		int steps = 0;
		Class251.bufferX[steps] = endX;
		Class251.bufferY[steps++] = endY;
		int lastwritten;
		int direction = (lastwritten = Class251.directions[endX - graphBaseX][endY - graphBaseY]);
		while (srcX != endX || endY != srcY) {
			if (lastwritten != direction) {
				lastwritten = direction;
				Class251.bufferX[steps] = endX;
				Class251.bufferY[steps++] = endY;
			}
			if ((direction & 0x2) != 0)
				endX++;
			else if ((direction & 0x8) != 0)
				endX--;
			if ((direction & 0x1) != 0)
				endY++;
			else if ((direction & 0x4) != 0)
				endY--;
			direction = Class251.directions[endX - graphBaseX][endY - graphBaseY];
		}
		int i = 0;
		do {
			if (steps-- <= 0)
				break;
			bufferX[i] = Class251.bufferX[steps];
			bufferY[i++] = Class251.bufferY[steps];
		} while (i < bufferX.length);
		return i;
	}

	static final void method1874(CS2Executor class527, int i) {
		String string = (Class462.aStringArray5548[(class527.intOpValues[class527.instrPtr * 301123709])]);
		if (null == string)
			string = "";
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}
}
