package com.rs.jagex;

import com.rs.jagex.clans.settings.ChangeClanSetting;

import java.awt.*;
import java.util.Queue;

public class Class373 {

	public static int anInt4350;

	static void method6365() {
		Queue<MouseRecord_Sub1> queue_1 = Class236.aQueue2914;
		synchronized (Class236.aQueue2914) {
			Point point_2;
			if (Class351.gameCanvas.isShowing())
				point_2 = Class351.gameCanvas.getLocationOnScreen();
			else
				point_2 = null;
			while (true)
				while (true) {
					MouseRecord_Sub1 record = Class236.aQueue2914.poll();
					if (record == null)
						return;
					if (point_2 != null && Class351.gameCanvas.isShowing() && IFSubObjectPosition.appletHasFocus) {
						record.method14732(point_2);
						if (!record.method14731() && record.getX() < ChangeClanSetting.BASE_WINDOW_WIDTH && record.getY() < Engine.BASE_WINDOW_HEIGHT * -969250379 && record.getX() >= 0 && record.getY() >= 0) {
							int i_4 = record.getClickType();
							if (record.getClickType() == -1)
								Class236.MOUSE_MOVEMENT_CANVAS.addRecord(record);
							else if (Class298.method5304(i_4))
								Class236.MOUSE_MOVEMENT_CANVAS.method12809(record);
						}
					} else
						record.cache();
				}
		}
	}

	Class373() throws Throwable {
		throw new Error();
	}
}
