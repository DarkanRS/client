
/* Class275 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class275 {
	public Class275 aClass275_3339;
	public Class275 aClass275_3340;

	public void method4885() {
		if (null != aClass275_3340) {
			aClass275_3340.aClass275_3339 = aClass275_3339;
			aClass275_3339.aClass275_3340 = aClass275_3340;
			aClass275_3339 = null;
			aClass275_3340 = null;
		}
	}

	public void method4886() {
		if (null != aClass275_3340) {
			aClass275_3340.aClass275_3339 = aClass275_3339;
			aClass275_3339.aClass275_3340 = aClass275_3340;
			aClass275_3339 = null;
			aClass275_3340 = null;
		}
	}

	public void method4887(byte i) {
		if (null != aClass275_3340) {
			aClass275_3340.aClass275_3339 = aClass275_3339;
			aClass275_3339.aClass275_3340 = aClass275_3340;
			aClass275_3339 = null;
			aClass275_3340 = null;
		}
	}

	public void method4888() {
		if (null != aClass275_3340) {
			aClass275_3340.aClass275_3339 = aClass275_3339;
			aClass275_3339.aClass275_3340 = aClass275_3340;
			aClass275_3339 = null;
			aClass275_3340 = null;
		}
	}

	static final void method4889(Class527 class527, int i) {
		String string = (String) (((Class527) class527).anObjectArray7019[(((Class527) class527).anInt7000 -= 1476624725) * 1806726141]);
		int i_0_ = 0;
		if (Class115.method1950(string, -1586612370))
			i_0_ = Class328.method5830(string, 1827486792);
		Class282_Sub23 class282_sub23 = Class271.method4828(OutgoingPacket.aClass379_4585, client.aClass184_7475.aClass432_2283, 1022314002);
		class282_sub23.aClass282_Sub35_Sub2_7682.writeInt(i_0_);
		client.aClass184_7475.method3049(class282_sub23, -492560470);
	}

	static final int method4890(int i, int i_1_, int i_2_, int i_3_) {
		return i < i_1_ ? i_1_ : i > i_2_ ? i_2_ : i;
	}

	public static void method4891(byte i) {
		if (null == client.aFrame3260) {
			int i_4_ = -1911940837 * client.anInt3250;
			int i_5_ = 698621615 * client.anInt3251;
			int i_6_ = (-1016911135 * Class45.anInt434 - Class349.anInt4083 * -418109423 - i_4_);
			int i_7_ = (Class107.anInt1082 * -499509193 - -969250379 * client.anInt3243 - i_5_);
			if (i_4_ > 0 || i_6_ > 0 || i_5_ > 0 || i_7_ > 0) {
				try {
					Container container = Class371.method6354((byte) 1);
					int i_8_ = 0;
					int i_9_ = 0;
					if (client.aFrame3261 == container) {
						Insets insets = client.aFrame3261.getInsets();
						i_8_ = insets.left;
						i_9_ = insets.top;
					}
					Graphics graphics = container.getGraphics();
					graphics.setColor(Color.black);
					if (i_4_ > 0)
						graphics.fillRect(i_8_, i_9_, i_4_, Class107.anInt1082 * -499509193);
					if (i_5_ > 0)
						graphics.fillRect(i_8_, i_9_, -1016911135 * Class45.anInt434, i_5_);
					if (i_6_ > 0)
						graphics.fillRect((Class45.anInt434 * -1016911135 + i_8_ - i_6_), i_9_, i_6_, Class107.anInt1082 * -499509193);
					if (i_7_ > 0)
						graphics.fillRect(i_8_, (i_9_ + -499509193 * Class107.anInt1082 - i_7_), Class45.anInt434 * -1016911135, i_7_);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
	}
}
