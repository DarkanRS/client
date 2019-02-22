/* Class306 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class306 implements Runnable {
	int anInt3596;
	boolean aBool3597;
	Interface27 anInterface27_3598 = new Class304();
	volatile boolean aBool3599;
	int anInt3600;
	long aLong3601;
	long aLong3602;
	String aString3603;
	Interface27 anInterface27_3604 = null;
	XLoadingStage aClass387_3605;

	synchronized boolean method5417() {
		return (((Class306) this).anInterface27_3598.method189(-3323946835697055613L * ((Class306) this).aLong3601));
	}

	int method5418(int i) {
		return 137107041 * ((Class306) this).anInt3600;
	}

	synchronized void method5419(byte i) {
		((Class306) this).aBool3597 = true;
	}

	synchronized void method5420() {
		((Class306) this).aBool3597 = true;
	}

	int method5421() {
		return 137107041 * ((Class306) this).anInt3600;
	}

	synchronized void method5422(long l, String string, int i, XLoadingStage class387, int i_0_) {
		((Class306) this).aLong3602 = -4939654261418088205L * l;
		((Class306) this).aString3603 = string;
		((Class306) this).anInt3596 = -2130001021 * i;
		((Class306) this).aClass387_3605 = class387;
	}

	public int method5423(int i) {
		if (((Class306) this).aClass387_3605 == null)
			return 0;
		int i_1_ = -1763884029 * ((Class306) this).aClass387_3605.anInt4712;
		if (((XLoadingStage) ((Class306) this).aClass387_3605).aBool4718 && (-1935875285 * ((Class306) this).anInt3596 < (((XLoadingStage) ((Class306) this).aClass387_3605).anInt4703 * 586831783)))
			return 1 + ((Class306) this).anInt3596 * -1935875285;
		if (i_1_ < 0 || i_1_ >= Class302.aClass387Array3557.length - 1)
			return 100;
		if (-1935875285 * ((Class306) this).anInt3596 == (2033966327 * ((XLoadingStage) ((Class306) this).aClass387_3605).anInt4715))
			return (((XLoadingStage) ((Class306) this).aClass387_3605).anInt4703 * 586831783);
		return (((XLoadingStage) ((Class306) this).aClass387_3605).anInt4715 * 2033966327);
	}

	public int method5424(byte i) {
		return -1935875285 * ((Class306) this).anInt3596;
	}

	public String method5425(int i) {
		return ((Class306) this).aString3603;
	}

	int method5426() {
		return 137107041 * ((Class306) this).anInt3600;
	}

	public XLoadingStage method5427(int i) {
		return ((Class306) this).aClass387_3605;
	}

	synchronized void method5428() {
		((Class306) this).aBool3597 = true;
	}

	public void run() {
		while (!((Class306) this).aBool3599) {
			long l = Class169.method2869(1937016324);
			synchronized (this) {
				try {
					((Class306) this).anInt3600 += -603779679;
					if (((Class306) this).anInterface27_3598 instanceof Class304)
						((Class306) this).anInterface27_3598.method187(((Class306) this).aBool3597, 1725591035);
					else {
						long l_2_ = Class169.method2869(2127985835);
						if (null != Renderers.SOFTWARE_RENDERER && null != ((Class306) this).anInterface27_3604 && ((Class306) this).anInterface27_3604.method190(1422459894) != 0 && ((((Class306) this).aLong3601 * -3323946835697055613L) >= l_2_ - (long) ((Class306) this).anInterface27_3604.method190(1006889549))) {
							int i = (int) (255L * (l_2_ - (-3323946835697055613L * ((Class306) this).aLong3601)) / (long) ((Class306) this).anInterface27_3604.method190(908741626));
							int i_3_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_3_ = i_3_ << 24 | 0xffffff;
							Class275.method4891((byte) -26);
							Renderers.SOFTWARE_RENDERER.ba(1, 0);
							NativeSprite class160 = (Renderers.SOFTWARE_RENDERER.method8440(-418109423 * Class349.anInt4083, Engine.anInt3243 * -969250379, true, -367647925));
							Class158_Sub1 class158_sub1 = Renderers.SOFTWARE_RENDERER.method8418();
							class158_sub1.method13759(0, class160.method2808());
							Renderers.SOFTWARE_RENDERER.method8637(class158_sub1, 2132781090);
							((Class306) this).anInterface27_3604.method187(true, 1725591035);
							Renderers.SOFTWARE_RENDERER.method8416(class158_sub1, (byte) -81);
							class160.method2742(0, 0, 0, i_3_, 1);
							Renderers.SOFTWARE_RENDERER.method8637(class158_sub1, 2069802277);
							Renderers.SOFTWARE_RENDERER.ba(1, 0);
							((Class306) this).anInterface27_3598.method187(true, 1725591035);
							Renderers.SOFTWARE_RENDERER.method8416(class158_sub1, (byte) -35);
							class160.method2742(0, 0, 0, i, 1);
						} else {
							if (((Class306) this).anInterface27_3604 != null) {
								((Class306) this).aBool3597 = true;
								((Class306) this).anInterface27_3604.method188((byte) 98);
								((Class306) this).anInterface27_3604 = null;
							}
							if (((Class306) this).aBool3597) {
								Class275.method4891((byte) -116);
								if (null != Renderers.SOFTWARE_RENDERER)
									Renderers.SOFTWARE_RENDERER.ba(1, 0);
							}
							((Class306) this).anInterface27_3598.method187((((Class306) this).aBool3597 || (null != Renderers.SOFTWARE_RENDERER && Renderers.SOFTWARE_RENDERER.method8465())), 1725591035);
						}
						try {
							if (Renderers.SOFTWARE_RENDERER != null && !(((Class306) this).anInterface27_3598 instanceof Class304))
								Renderers.SOFTWARE_RENDERER.method8393((short) 10667);
						} catch (Exception_Sub3 exception_sub3) {
							Class151.method2594(new StringBuilder().append(exception_sub3.getMessage()).append(Class308.aclient3620.method4669(1137623288)).toString(), exception_sub3, (byte) -20);
							Class538.method11500(0, true, (byte) 24);
						}
					}
					((Class306) this).aBool3597 = false;
					if (Renderers.SOFTWARE_RENDERER != null && !(((Class306) this).anInterface27_3598 instanceof Class304) && ((-1763884029 * ((Class306) this).aClass387_3605.anInt4712) < XLoadingStage.aClass387_4698.anInt4712 * -1763884029))
						Class532_Sub1.method12840(2100341141);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_4_ = Class169.method2869(1993428891);
			int i = (int) (20L - (l_4_ - l));
			if (i > 0)
				Class89.method1504((long) i);
		}
	}

	public void method5429() {
		while (!((Class306) this).aBool3599) {
			long l = Class169.method2869(1636289789);
			synchronized (this) {
				try {
					((Class306) this).anInt3600 += -603779679;
					if (((Class306) this).anInterface27_3598 instanceof Class304)
						((Class306) this).anInterface27_3598.method187(((Class306) this).aBool3597, 1725591035);
					else {
						long l_5_ = Class169.method2869(2096237890);
						if (null != Renderers.SOFTWARE_RENDERER && null != ((Class306) this).anInterface27_3604 && ((Class306) this).anInterface27_3604.method190(1582032827) != 0 && ((((Class306) this).aLong3601 * -3323946835697055613L) >= l_5_ - (long) ((Class306) this).anInterface27_3604.method190(469417614))) {
							int i = (int) (255L * (l_5_ - (-3323946835697055613L * ((Class306) this).aLong3601)) / (long) ((Class306) this).anInterface27_3604.method190(1089903421));
							int i_6_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_6_ = i_6_ << 24 | 0xffffff;
							Class275.method4891((byte) -118);
							Renderers.SOFTWARE_RENDERER.ba(1, 0);
							NativeSprite class160 = (Renderers.SOFTWARE_RENDERER.method8440(-418109423 * Class349.anInt4083, Engine.anInt3243 * -969250379, true, -166884611));
							Class158_Sub1 class158_sub1 = Renderers.SOFTWARE_RENDERER.method8418();
							class158_sub1.method13759(0, class160.method2808());
							Renderers.SOFTWARE_RENDERER.method8637(class158_sub1, -570536248);
							((Class306) this).anInterface27_3604.method187(true, 1725591035);
							Renderers.SOFTWARE_RENDERER.method8416(class158_sub1, (byte) -101);
							class160.method2742(0, 0, 0, i_6_, 1);
							Renderers.SOFTWARE_RENDERER.method8637(class158_sub1, -1655516585);
							Renderers.SOFTWARE_RENDERER.ba(1, 0);
							((Class306) this).anInterface27_3598.method187(true, 1725591035);
							Renderers.SOFTWARE_RENDERER.method8416(class158_sub1, (byte) -6);
							class160.method2742(0, 0, 0, i, 1);
						} else {
							if (((Class306) this).anInterface27_3604 != null) {
								((Class306) this).aBool3597 = true;
								((Class306) this).anInterface27_3604.method188((byte) -20);
								((Class306) this).anInterface27_3604 = null;
							}
							if (((Class306) this).aBool3597) {
								Class275.method4891((byte) -75);
								if (null != Renderers.SOFTWARE_RENDERER)
									Renderers.SOFTWARE_RENDERER.ba(1, 0);
							}
							((Class306) this).anInterface27_3598.method187((((Class306) this).aBool3597 || (null != Renderers.SOFTWARE_RENDERER && Renderers.SOFTWARE_RENDERER.method8465())), 1725591035);
						}
						try {
							if (Renderers.SOFTWARE_RENDERER != null && !(((Class306) this).anInterface27_3598 instanceof Class304))
								Renderers.SOFTWARE_RENDERER.method8393((short) 28821);
						} catch (Exception_Sub3 exception_sub3) {
							Class151.method2594(new StringBuilder().append(exception_sub3.getMessage()).append(Class308.aclient3620.method4669(976372382)).toString(), exception_sub3, (byte) -54);
							Class538.method11500(0, true, (byte) 24);
						}
					}
					((Class306) this).aBool3597 = false;
					if (Renderers.SOFTWARE_RENDERER != null && !(((Class306) this).anInterface27_3598 instanceof Class304) && ((-1763884029 * ((Class306) this).aClass387_3605.anInt4712) < XLoadingStage.aClass387_4698.anInt4712 * -1763884029))
						Class532_Sub1.method12840(2013949561);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_7_ = Class169.method2869(1550838982);
			int i = (int) (20L - (l_7_ - l));
			if (i > 0)
				Class89.method1504((long) i);
		}
	}

	public void method5430() {
		while (!((Class306) this).aBool3599) {
			long l = Class169.method2869(1957460923);
			synchronized (this) {
				try {
					((Class306) this).anInt3600 += -603779679;
					if (((Class306) this).anInterface27_3598 instanceof Class304)
						((Class306) this).anInterface27_3598.method187(((Class306) this).aBool3597, 1725591035);
					else {
						long l_8_ = Class169.method2869(1857528832);
						if (null != Renderers.SOFTWARE_RENDERER && null != ((Class306) this).anInterface27_3604 && ((Class306) this).anInterface27_3604.method190(1085795256) != 0 && ((((Class306) this).aLong3601 * -3323946835697055613L) >= l_8_ - (long) ((Class306) this).anInterface27_3604.method190(848643442))) {
							int i = (int) (255L * (l_8_ - (-3323946835697055613L * ((Class306) this).aLong3601)) / (long) ((Class306) this).anInterface27_3604.method190(269013393));
							int i_9_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_9_ = i_9_ << 24 | 0xffffff;
							Class275.method4891((byte) -46);
							Renderers.SOFTWARE_RENDERER.ba(1, 0);
							NativeSprite class160 = (Renderers.SOFTWARE_RENDERER.method8440(-418109423 * Class349.anInt4083, Engine.anInt3243 * -969250379, true, 662915370));
							Class158_Sub1 class158_sub1 = Renderers.SOFTWARE_RENDERER.method8418();
							class158_sub1.method13759(0, class160.method2808());
							Renderers.SOFTWARE_RENDERER.method8637(class158_sub1, -802865212);
							((Class306) this).anInterface27_3604.method187(true, 1725591035);
							Renderers.SOFTWARE_RENDERER.method8416(class158_sub1, (byte) -113);
							class160.method2742(0, 0, 0, i_9_, 1);
							Renderers.SOFTWARE_RENDERER.method8637(class158_sub1, -3990686);
							Renderers.SOFTWARE_RENDERER.ba(1, 0);
							((Class306) this).anInterface27_3598.method187(true, 1725591035);
							Renderers.SOFTWARE_RENDERER.method8416(class158_sub1, (byte) -43);
							class160.method2742(0, 0, 0, i, 1);
						} else {
							if (((Class306) this).anInterface27_3604 != null) {
								((Class306) this).aBool3597 = true;
								((Class306) this).anInterface27_3604.method188((byte) 23);
								((Class306) this).anInterface27_3604 = null;
							}
							if (((Class306) this).aBool3597) {
								Class275.method4891((byte) -66);
								if (null != Renderers.SOFTWARE_RENDERER)
									Renderers.SOFTWARE_RENDERER.ba(1, 0);
							}
							((Class306) this).anInterface27_3598.method187((((Class306) this).aBool3597 || (null != Renderers.SOFTWARE_RENDERER && Renderers.SOFTWARE_RENDERER.method8465())), 1725591035);
						}
						try {
							if (Renderers.SOFTWARE_RENDERER != null && !(((Class306) this).anInterface27_3598 instanceof Class304))
								Renderers.SOFTWARE_RENDERER.method8393((short) 13587);
						} catch (Exception_Sub3 exception_sub3) {
							Class151.method2594(new StringBuilder().append(exception_sub3.getMessage()).append(Class308.aclient3620.method4669(184564104)).toString(), exception_sub3, (byte) -34);
							Class538.method11500(0, true, (byte) 24);
						}
					}
					((Class306) this).aBool3597 = false;
					if (Renderers.SOFTWARE_RENDERER != null && !(((Class306) this).anInterface27_3598 instanceof Class304) && ((-1763884029 * ((Class306) this).aClass387_3605.anInt4712) < XLoadingStage.aClass387_4698.anInt4712 * -1763884029))
						Class532_Sub1.method12840(1434548492);
				} catch (Exception exception) {
					continue;
				}
			}
			long l_10_ = Class169.method2869(2084803621);
			int i = (int) (20L - (l_10_ - l));
			if (i > 0)
				Class89.method1504((long) i);
		}
	}

	public int method5431() {
		return -1935875285 * ((Class306) this).anInt3596;
	}

	int method5432() {
		return 137107041 * ((Class306) this).anInt3600;
	}

	int method5433() {
		return 137107041 * ((Class306) this).anInt3600;
	}

	public long method5434() {
		return 5901517445831929915L * ((Class306) this).aLong3602;
	}

	int method5435() {
		return 137107041 * ((Class306) this).anInt3600;
	}

	int method5436() {
		return 137107041 * ((Class306) this).anInt3600;
	}

	Class306() {
		/* empty */
	}

	void method5437(int i) {
		((Class306) this).aBool3599 = true;
	}

	synchronized boolean method5438() {
		return (((Class306) this).anInterface27_3598.method189(-3323946835697055613L * ((Class306) this).aLong3601));
	}

	public long method5439(int i) {
		return 5901517445831929915L * ((Class306) this).aLong3602;
	}

	synchronized void method5440(Interface27 interface27) {
		((Class306) this).anInterface27_3604 = ((Class306) this).anInterface27_3598;
		((Class306) this).anInterface27_3598 = interface27;
		((Class306) this).aLong3601 = Class169.method2869(1875257992) * 1167380479424480811L;
	}

	synchronized void method5441(Interface27 interface27) {
		((Class306) this).anInterface27_3604 = ((Class306) this).anInterface27_3598;
		((Class306) this).anInterface27_3598 = interface27;
		((Class306) this).aLong3601 = Class169.method2869(1857108408) * 1167380479424480811L;
	}

	synchronized void method5442(Interface27 interface27) {
		((Class306) this).anInterface27_3604 = ((Class306) this).anInterface27_3598;
		((Class306) this).anInterface27_3598 = interface27;
		((Class306) this).aLong3601 = Class169.method2869(1876195097) * 1167380479424480811L;
	}

	synchronized void method5443(long l, String string, int i, XLoadingStage class387) {
		((Class306) this).aLong3602 = -4939654261418088205L * l;
		((Class306) this).aString3603 = string;
		((Class306) this).anInt3596 = -2130001021 * i;
		((Class306) this).aClass387_3605 = class387;
	}

	public int method5444() {
		return -1935875285 * ((Class306) this).anInt3596;
	}

	synchronized void method5445(Interface27 interface27, byte i) {
		((Class306) this).anInterface27_3604 = ((Class306) this).anInterface27_3598;
		((Class306) this).anInterface27_3598 = interface27;
		((Class306) this).aLong3601 = Class169.method2869(2076129630) * 1167380479424480811L;
	}

	public long method5446() {
		return 5901517445831929915L * ((Class306) this).aLong3602;
	}

	public long method5447() {
		return 5901517445831929915L * ((Class306) this).aLong3602;
	}

	public XLoadingStage method5448() {
		return ((Class306) this).aClass387_3605;
	}

	public XLoadingStage method5449() {
		return ((Class306) this).aClass387_3605;
	}

	synchronized boolean method5450(int i) {
		return (((Class306) this).anInterface27_3598.method189(-3323946835697055613L * ((Class306) this).aLong3601));
	}

	public XLoadingStage method5451() {
		return ((Class306) this).aClass387_3605;
	}

	public XLoadingStage method5452() {
		return ((Class306) this).aClass387_3605;
	}

	static final void method5453(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		class118.anInt1453 = ((class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]) * 542423029);
		Class109.method1858(class118, (byte) 38);
	}

	static final void method5454(CS2Executor class527, byte i) {
		UnderlayDefinition class513 = (class527.aBool7022 ? class527.aClass513_6994 : class527.aClass513_7007);
		IComponentDefinitions class118 = ((UnderlayDefinition) class513).aClass118_5886;
		Interface class98 = ((UnderlayDefinition) class513).aClass98_5885;
		Class388.method6689(class118, class98, class527, -1325522232);
	}

	static final void method5455(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		if (Class96_Sub14.method14642(string, class527, 1521695883) != null)
			string = string.substring(0, string.length() - 1);
		class118.anObjectArray1418 = Class351.method6193(string, class527, 570621267);
		class118.aBool1384 = true;
	}

	static final void method5456(CS2Executor class527, int i) {
		String string = (String) (class527.objectStack[(class527.anInt7000 -= 1476624725) * 1806726141]);
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = Class182.method3044(string, -1519993030);
	}

	public static String method5457(long l) {
		if (l <= 0L || l >= 6582952005840035281L)
			return null;
		if (l % 37L == 0L)
			return null;
		int i = 0;
		for (long l_11_ = l; 0L != l_11_; l_11_ /= 37L)
			i++;
		StringBuilder stringbuilder = new StringBuilder(i);
		while (0L != l) {
			long l_12_ = l;
			l /= 37L;
			stringbuilder.append(Class500.aCharArray5825[(int) (l_12_ - 37L * l)]);
		}
		return stringbuilder.reverse().toString();
	}

	static void method5458(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
		float f = ((float) Class291_Sub1.yLength / (float) Class291_Sub1.xLength);
		int i_17_ = i_14_;
		int i_18_ = i_15_;
		if (f < 1.0F)
			i_18_ = (int) ((float) i_14_ * f);
		else
			i_17_ = (int) ((float) i_15_ / f);
		i -= (i_14_ - i_17_) / 2;
		i_13_ -= (i_15_ - i_18_) / 2;
		Class427.anInt5123 = Class291_Sub1.xLength * i / i_17_ * 1714827959;
		Class475.anInt5624 = 1710901657 * (Class291_Sub1.yLength - Class291_Sub1.yLength * i_13_ / i_18_);
		Class291_Sub1.anInt8014 = -1089992553;
		Class291_Sub1.anInt8016 = 638834387;
		Class89.method1502(825346113);
	}

	static final void method5459(IComponentDefinitions class118, Interface class98, CS2Executor class527, int i) {
		int i_19_ = (class527.intStack[(class527.intStackPtr -= 141891001) * 1942118537]);
		if (i_19_ != class118.anInt1435 * 602613369) {
			class118.anInt1435 = -655465527 * i_19_;
			Class109.method1858(class118, (byte) 77);
		}
		if (class118.anInt1288 * 1924549737 == -1 && !class98.aBool999)
			JS5LocalRequester.method5581(-1952846363 * class118.idHash, (byte) 2);
	}
}
