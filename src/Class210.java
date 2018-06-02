/* Class210 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class210 {
	SoftCache aClass229_2664 = new SoftCache(20);
	Index aClass317_2665;
	Index aClass317_2666;
	SoftCache aClass229_2667 = new SoftCache(64);
	public static int[] anIntArray2668;

	public void method3602(int i, int i_0_) {
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.method3858(i, (byte) -65);
		}
		synchronized (((Class210) this).aClass229_2664) {
			((Class210) this).aClass229_2664.method3858(i, (byte) 47);
		}
	}

	public HitsplatDefinitions getDefinitions(int i, int i_1_) {
		HitsplatDefinitions class228;
		synchronized (((Class210) this).aClass229_2667) {
			class228 = ((HitsplatDefinitions) ((Class210) this).aClass229_2667.get((long) i));
		}
		if (null != class228)
			return class228;
		byte[] is;
		synchronized (((Class210) this).aClass317_2665) {
			is = (((Class210) this).aClass317_2665.getFile(-71319279 * SharedConfigsType.aClass120_1509.id, i, -1498386951));
		}
		class228 = new HitsplatDefinitions();
		((HitsplatDefinitions) class228).aClass210_2850 = this;
		if (is != null)
			class228.method3837(new RsByteBuffer(is), 738101655);
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.put(class228, (long) i);
		}
		return class228;
	}

	public void method3604(short i) {
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.method3859(1876702995);
		}
		synchronized (((Class210) this).aClass229_2664) {
			((Class210) this).aClass229_2664.method3859(2003512741);
		}
	}

	public void method3605(int i) {
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.method3858(i, (byte) -44);
		}
		synchronized (((Class210) this).aClass229_2664) {
			((Class210) this).aClass229_2664.method3858(i, (byte) 43);
		}
	}

	public void method3606() {
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.method3863(1160672503);
		}
		synchronized (((Class210) this).aClass229_2664) {
			((Class210) this).aClass229_2664.method3863(1641352532);
		}
	}

	public HitsplatDefinitions method3607(int i) {
		HitsplatDefinitions class228;
		synchronized (((Class210) this).aClass229_2667) {
			class228 = ((HitsplatDefinitions) ((Class210) this).aClass229_2667.get((long) i));
		}
		if (null != class228)
			return class228;
		byte[] is;
		synchronized (((Class210) this).aClass317_2665) {
			is = (((Class210) this).aClass317_2665.getFile(-71319279 * SharedConfigsType.aClass120_1509.id, i, -1498305941));
		}
		class228 = new HitsplatDefinitions();
		((HitsplatDefinitions) class228).aClass210_2850 = this;
		if (is != null)
			class228.method3837(new RsByteBuffer(is), 1313817347);
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.put(class228, (long) i);
		}
		return class228;
	}

	public Class210(Game class486, Language class495, Index class317, Index class317_2_) {
		((Class210) this).aClass317_2666 = class317_2_;
		((Class210) this).aClass317_2665 = class317;
		((Class210) this).aClass317_2665.filesCount((-71319279 * (SharedConfigsType.aClass120_1509.id)), -512720264);
	}

	public void method3608(int i) {
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.method3863(994543412);
		}
		synchronized (((Class210) this).aClass229_2664) {
			((Class210) this).aClass229_2664.method3863(1441931247);
		}
	}

	public void method3609() {
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.method3863(2086367744);
		}
		synchronized (((Class210) this).aClass229_2664) {
			((Class210) this).aClass229_2664.method3863(1682011582);
		}
	}

	public void method3610() {
		synchronized (((Class210) this).aClass229_2667) {
			((Class210) this).aClass229_2667.method3863(1241737838);
		}
		synchronized (((Class210) this).aClass229_2664) {
			((Class210) this).aClass229_2664.method3863(733911460);
		}
	}

	static final void method3611(CS2Executor class527, int i) {
		Class393.aClass282_Sub54_4783.method13511(Class393.aClass282_Sub54_4783.aClass468_Sub2_8205, (class527.intStack[(class527.anInt7012 -= 141891001) * 1942118537]), -163458202);
		IndexLoaders.MAP_REGION_DECODER.method4547((byte) -4);
		Class190.method3148((byte) 43);
		client.aBool7175 = false;
	}

	static final void method3612(int i, int i_3_, int i_4_, int i_5_, int i_6_, boolean bool, byte i_7_) {
		if (!bool && (i_3_ < 512 || i_4_ < 512 || i_3_ > (IndexLoaders.MAP_REGION_DECODER.method4424(112357923) - 2) * 512 || i_4_ > (IndexLoaders.MAP_REGION_DECODER.method4451(-200996261) - 2) * 512)) {
			float[] fs = client.aFloatArray7292;
			client.aFloatArray7292[1] = -1.0F;
			fs[0] = -1.0F;
		} else {
			int i_8_ = Class504.method8389(i_3_, i_4_, i, (byte) 110) - i_6_;
			client.aClass294_7457.method5209(Renderers.SOFTWARE_RENDERER.method8458());
			client.aClass294_7457.method5219((float) i_5_, 0.0F, 0.0F);
			Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
			if (bool)
				Renderers.SOFTWARE_RENDERER.method8479((float) i_3_, (float) i_8_, (float) i_4_, client.aFloatArray7292);
			else
				Renderers.SOFTWARE_RENDERER.method8515((float) i_3_, (float) i_8_, (float) i_4_, client.aFloatArray7292);
			client.aClass294_7457.method5219((float) -i_5_, 0.0F, 0.0F);
			Renderers.SOFTWARE_RENDERER.method8457(client.aClass294_7457);
			client.aFloatArray7292[0] -= (float) (client.anInt7444 * -1007294471);
			client.aFloatArray7292[1] -= (float) (client.anInt7445 * 915815265);
		}
	}

	static final void method3613(CS2Executor class527, int i) {
		if (Class475.aBool5623 && Engine.aFrame3260 != null)
			Class440.method7373(Class393.aClass282_Sub54_4783.aClass468_Sub9_8226.method12687(551500203), -1, -1, false, (byte) 52);
	}

	public static void method3614(Class397 class397, int i, int i_9_, byte i_10_) {
		CS2Executor class527 = Class125.method2167(-547790370);
		Class107.method1834(class397, i, i_9_, class527, (byte) 7);
	}
}
