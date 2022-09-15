package com.jagex;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameIdentifier implements Runnable {

	public static void clearComponents(int i_0) {
		if (i_0 != -1 && !MapAreaIndexLoader.INTERFACES_LOADED[i_0]) {
			Class388.INTERFACE_INDEX.clearFiles(i_0);
			Interface.INTERFACES[i_0] = null;
		}
	}

	static void method482() {
		if (Class182.HARDWARE_RENDERER != null) {
			Class182.HARDWARE_RENDERER.method8396();
			Class182.HARDWARE_RENDERER = null;
			Class182.aFontRenderer_2259 = null;
		}
	}

	public static void method483(Interface interface_0, IComponentDefinitions icomponentdefinitions_1, boolean bool_2) {
		Class480.method8044(interface_0.components, icomponentdefinitions_1, bool_2);
	}

	public static void method486(int i_0, int i_1, int i_2) {
		i_0 <<= 3;
		i_1 <<= 3;
		i_2 <<= 3;
		client.camAngleX = i_0;
		client.camAngleY = i_1;
		if (NativeLibraryLoader.anInt3240 == 5) {
			Class293.anInt3512 = i_0;
			AnimationDefinitions.anInt5930 = i_1;
			Class121.anInt1525 = i_2;
		}
		Static.processCamera();
		client.aBool7371 = true;
	}

	public static void method487(SongReference class116_0, int i_1) {
		Class148.aNode_Sub15_Sub2_1735.method15101();
		Node_Sub15_Sub2 class282_sub15_sub2_3 = class116_0.method1954();
		if (class282_sub15_sub2_3 != null) {
			Class502.aClass253_5830.method4334();
			Class148.aNode_Sub15_Sub2_1735 = class282_sub15_sub2_3;
			Class148.aNode_Sub15_Sub2_1735.method15098(class116_0.method1955(), false);
			Class148.aNode_Sub15_Sub2_1735.setVolume(i_1);
			if (Class502.aClass253_5830 != null)
				Class502.aClass253_5830.method4329(Class148.aNode_Sub15_Sub2_1735);
			Class332.method5929();
		}
	}

	static int method488(int i_0, int i_1) {
		return i_1 < 0 ? i_0 : (int) (i_0 * Math.sqrt(1.220703125E-4D * (16384 - i_1)) + 0.5D);
	}

	volatile String host;

	InetAddress address;

	HostNameIdentifier(int i_1) throws UnknownHostException {
		address = InetAddress.getByAddress(new byte[]{(byte) (i_1 >> 24 & 0xff), (byte) (i_1 >> 16 & 0xff), (byte) (i_1 >> 8 & 0xff), (byte) (i_1 & 0xff)});
	}

	public String getHostName() {
		return host;
	}

	@Override
	public void run() {
		host = address.getHostName();
	}
}
