/* Class464 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemEffects {
	public int[] male_head_mdls;
	static int anInt5691 = 2;
	static int anInt5692 = 4;
	static int anInt5693 = 1;
	public int[] aura_cmp_ptone = new int[3];
	public int[] aura_cmp_pttwo = new int[3];
	static int anInt5696 = 8;
	public int[] fem_head_mdls;
	public short[] color_palette;
	public short[] texture_palette;

	ItemEffects(ItemDefinitions class468) {
		male_head_mdls = new int[2];
		fem_head_mdls = new int[2];
		aura_cmp_ptone[0] = 1343198193 * class468.anInt5724;
		aura_cmp_ptone[1] = ((ItemDefinitions) class468).femaleModelId1 * 34210967;
		aura_cmp_ptone[2] = ((ItemDefinitions) class468).anInt5759 * 1313278521;
		aura_cmp_pttwo[0] = 1585491093 * class468.anInt5747;
		aura_cmp_pttwo[1] = ((ItemDefinitions) class468).femaleModelId2 * -1284247975;
		aura_cmp_pttwo[2] = ((ItemDefinitions) class468).anInt5741 * -1767718263;
		male_head_mdls[0] = ((ItemDefinitions) class468).anInt5760 * -1282951055;
		male_head_mdls[1] = 86274879 * ((ItemDefinitions) class468).male_head_mdltwo;
		fem_head_mdls[0] = ((ItemDefinitions) class468).anInt5750 * -1531415419;
		fem_head_mdls[1] = ((ItemDefinitions) class468).fem_head_mdltwo * 1578724433;
		if (((ItemDefinitions) class468).aShortArray5706 != null) {
			color_palette = new short[((ItemDefinitions) class468).aShortArray5706.length];
			System.arraycopy(((ItemDefinitions) class468).aShortArray5706, 0, color_palette, 0, color_palette.length);
		}
		if (null != ((ItemDefinitions) class468).aShortArray5712) {
			texture_palette = new short[((ItemDefinitions) class468).aShortArray5712.length];
			System.arraycopy(((ItemDefinitions) class468).aShortArray5712, 0, texture_palette, 0, texture_palette.length);
		}
	}

	public static final void method6015(int i) {
		try {
			if (!client.aBoolean8762) {
				client.aFloat8759 += (-24.0F - client.aFloat8759) / 2.0F;
				client.aBoolean8763 = true;
				client.aBoolean8762 = true;
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("td.hr(").append(')').toString());
		}
	}

	static final void method6016(ClientScript2 class403, int i) {
		try {
			int i_0_ = (((ClientScript2) class403).anIntArray5257[((ClientScript2) class403).anInt5259 * 1883543357]);
			ClientScriptsExecutor.aStringArray4126[i_0_] = (String) (((ClientScript2) class403).anObjectArray5240[((((ClientScript2) class403).anInt5241 -= 969361751) * -203050393)]);
			Class272.method2558(i_0_, 1525227442);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("td.am(").append(')').toString());
		}
	}
}
