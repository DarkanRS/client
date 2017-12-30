
/* Class507 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class507 {
	public static final int anInt5859 = 6;
	static Class208 aClass208_5860;

	Class507() throws Throwable {
		throw new Error();
	}

	static final void method8723(CS2Executor class527, int i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class202.method3338(class118, class98, class527, (byte) 40);
	}

	static final void method8724(CS2Executor class527, int i) {
		((CS2Executor) class527).anInt7012 -= 283782002;
		int i_0_ = (((CS2Executor) class527).intStack[((CS2Executor) class527).anInt7012 * 1942118537]);
		int i_1_ = (((CS2Executor) class527).intStack[1 + 1942118537 * ((CS2Executor) class527).anInt7012]);
		if (Class468_Sub8.aClass98Array7889[i_0_] == null)
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = 0;
		else
			((CS2Executor) class527).intStack[((((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1)] = -1726519169 * (Class468_Sub8.aClass98Array7889[i_0_].aClass118Array998[i_1_].anInt1414);
	}

	static void method8725(int i, int i_2_, int i_3_, int i_4_, boolean bool, int i_5_) {
		if (Class475.aBool5623 && client.aFrame3260 != null && (i_2_ != 3 || Class363.anInt4203 * -2123019059 != i_3_ || i_4_ != 977902937 * client.anInt3249)) {
			Class329.method5903(Class274.aClass470_3336, client.aFrame3260, -1600993985);
			client.aFrame3260 = null;
		}
		if (Class475.aBool5623 && i_2_ == 3 && client.aFrame3260 == null) {
			client.aFrame3260 = Class472.method7852(Class274.aClass470_3336, i_3_, i_4_, 0, 0, (byte) -27);
			if (client.aFrame3260 != null) {
				Class363.anInt4203 = -1685356539 * i_3_;
				client.anInt3249 = i_4_ * -1328358679;
				Class190.method3148((byte) 115);
			}
		}
		if (i_2_ == 3 && (!Class475.aBool5623 || null == client.aFrame3260))
			method8725(i, Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(-1519705843), -1, -1, true, -1040786933);
		else {
			Container container = Class371.method6354((byte) 1);
			if (null != client.aFrame3260) {
				Class45.anInt434 = 1031248161 * i_3_;
				Class107.anInt1082 = i_4_ * 685317511;
			} else if (client.aFrame3261 != null) {
				Insets insets = client.aFrame3261.getInsets();
				Class45.anInt434 = (client.aFrame3261.getSize().width - (insets.left + insets.right)) * 1031248161;
				Class107.anInt1082 = (client.aFrame3261.getSize().height - (insets.bottom + insets.top)) * 685317511;
			} else {
				Class45.anInt434 = container.getSize().width * 1031248161;
				Class107.anInt1082 = container.getSize().height * 685317511;
			}
			if (-1016911135 * Class45.anInt434 <= 0)
				Class45.anInt434 = 1031248161;
			if (Class107.anInt1082 * -499509193 <= 0)
				Class107.anInt1082 = 685317511;
			if (i_2_ != 1)
				Class46.method935((byte) -63);
			else {
				Class349.anInt4083 = 262617915 * client.anInt7439;
				client.anInt3250 = (-1016911135 * Class45.anInt434 - client.anInt7439 * 150480619) / 2 * -1347577581;
				client.anInt3243 = 1984724499 * client.anInt7312;
				client.anInt3251 = 0;
			}
			if (Class90.aClass496_952 != Class496.aClass496_5813 && Class349.anInt4083 * -418109423 < 1024 && client.anInt3243 * -969250379 >= 768) {
				/* empty */
			}
			if (!bool) {
				Class351.aCanvas4096.setSize(-418109423 * Class349.anInt4083, client.anInt3243 * -969250379);
				Class316.aClass505_3680.method8414(Class351.aCanvas4096, -418109423 * Class349.anInt4083, client.anInt3243 * -969250379, -1972128400);
				if (container == client.aFrame3261) {
					Insets insets = client.aFrame3261.getInsets();
					Class351.aCanvas4096.setLocation(insets.left + -1911940837 * client.anInt3250, insets.top + client.anInt3251 * 698621615);
				} else
					Class351.aCanvas4096.setLocation((-1911940837 * client.anInt3250), (client.anInt3251 * 698621615));
			} else
				Class350_Sub2.method12571(-551950888);
			if (i_2_ >= 2)
				client.aBool7301 = true;
			else
				client.aBool7301 = false;
			Class400.method6795(2030703690);
			if (-1699899559 * client.anInt7349 != -1)
				Class516.method8867(true, -905479502);
			if (client.aClass184_7475.method3053((byte) -102) != null && Class169.method2875(client.anInt7166 * -1741204137, -2070106492))
				Class388.method6692(529242177);
			for (int i_6_ = 0; i_6_ < 107; i_6_++)
				client.aBoolArray7443[i_6_] = true;
			client.aBool3274 = true;
		}
	}

	static final void method8726(CS2Executor class527, short i) {
		UnderlayDefinition class513 = (((CS2Executor) class527).aBool7022 ? ((CS2Executor) class527).aClass513_6994 : ((CS2Executor) class527).aClass513_7007);
		Class118 class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Class98 class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class30.method797(class118, class98, class527, 2104717291);
	}

	public static Class282_Sub50_Sub7 method8727(int i) {
		return Class20.aClass282_Sub50_Sub7_168;
	}
}
