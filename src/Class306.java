public class Class306 implements Runnable {

	boolean aBool3597;
	long aLong3602;
	String aString3603;
	int anInt3596;
	LoadingStage aClass387_3605;
	int anInt3600;
	Interface27 anInterface27_3604 = null;
	Interface27 anInterface27_3598 = new Class304();
	volatile boolean aBool3599;
	long aLong3601;

	int method5418(int i_1) {
		return this.anInt3600;
	}

	synchronized void method5419(byte b_1) {
		this.aBool3597 = true;
	}

	synchronized void method5422(long long_1, String string_3, int i_4, LoadingStage xloadingstage_5, int i_6) {
		this.aLong3602 = long_1;
		this.aString3603 = string_3;
		this.anInt3596 = i_4;
		this.aClass387_3605 = xloadingstage_5;
	}

	public int method5423(int i_1) {
		if (this.aClass387_3605 == null) {
			return 0;
		} else {
			int i_2 = this.aClass387_3605.anInt4712;
			return this.aClass387_3605.aBool4718 && this.anInt3596 < this.aClass387_3605.anInt4703 ? this.anInt3596 + 1 : (i_2 >= 0 && i_2 < Class302.aClass387Array3557.length - 1 ? (this.aClass387_3605.anInt4715 == this.anInt3596 ? this.aClass387_3605.anInt4703 : this.aClass387_3605.anInt4715) : 100);
		}
	}

	public int method5424(byte b_1) {
		return this.anInt3596;
	}

	public String method5425(int i_1) {
		return this.aString3603;
	}

	public LoadingStage method5427(int i_1) {
		return this.aClass387_3605;
	}

	public void run() {
		while (!this.aBool3599) {
			long long_1 = Class169.time();
			synchronized (this) {
				try {
					++this.anInt3600;
					if (this.anInterface27_3598 instanceof Class304) {
						this.anInterface27_3598.method187(this.aBool3597, 1725591035);
					} else {
						long long_4 = Class169.time();
						if (Renderers.SOFTWARE_RENDERER != null && this.anInterface27_3604 != null && this.anInterface27_3604.method190(1422459894) != 0 && this.aLong3601 >= long_4 - (long) this.anInterface27_3604.method190(1006889549)) {
							int i_6 = (int) (255L * (long_4 - this.aLong3601) / (long) this.anInterface27_3604.method190(908741626));
							int i_7 = 255 - i_6;
							i_6 = i_6 << 24 | 0xffffff;
							i_7 = i_7 << 24 | 0xffffff;
							Class275.method4891((byte) -26);
							Renderers.SOFTWARE_RENDERER.ba(1, 0);
							NativeSprite nativesprite_8 = Renderers.SOFTWARE_RENDERER.method8440(Class349.anInt4083, Engine.anInt3243 * -969250379, true, -367647925);
							Class158_Sub1 class158_sub1_9 = Renderers.SOFTWARE_RENDERER.method8418();
							class158_sub1_9.method13759(0, nativesprite_8.method2808());
							Renderers.SOFTWARE_RENDERER.method8637(class158_sub1_9, 2132781090);
							this.anInterface27_3604.method187(true, 1725591035);
							Renderers.SOFTWARE_RENDERER.method8416(class158_sub1_9, (byte) -81);
							nativesprite_8.method2742(0, 0, 0, i_7, 1);
							Renderers.SOFTWARE_RENDERER.method8637(class158_sub1_9, 2069802277);
							Renderers.SOFTWARE_RENDERER.ba(1, 0);
							this.anInterface27_3598.method187(true, 1725591035);
							Renderers.SOFTWARE_RENDERER.method8416(class158_sub1_9, (byte) -35);
							nativesprite_8.method2742(0, 0, 0, i_6, 1);
						} else {
							if (this.anInterface27_3604 != null) {
								this.aBool3597 = true;
								this.anInterface27_3604.method188((byte) 98);
								this.anInterface27_3604 = null;
							}

							if (this.aBool3597) {
								Class275.method4891((byte) -116);
								if (Renderers.SOFTWARE_RENDERER != null) {
									Renderers.SOFTWARE_RENDERER.ba(1, 0);
								}
							}

							this.anInterface27_3598.method187(this.aBool3597 || Renderers.SOFTWARE_RENDERER != null && Renderers.SOFTWARE_RENDERER.method8465(), 1725591035);
						}

						try {
							if (Renderers.SOFTWARE_RENDERER != null && !(this.anInterface27_3598 instanceof Class304)) {
								Renderers.SOFTWARE_RENDERER.method8393((short) 10667);
							}
						} catch (Exception_Sub3 exception_sub3_14) {
							Class151.method2594(exception_sub3_14.getMessage() + Class308.aclient3620.method4669(1137623288), exception_sub3_14, (byte) -20);
							ParticleProducer.method11500(0, true, (byte) 24);
						}
					}

					this.aBool3597 = false;
					if (Renderers.SOFTWARE_RENDERER != null && !(this.anInterface27_3598 instanceof Class304) && this.aClass387_3605.anInt4712 < LoadingStage.aClass387_4698.anInt4712) {
						Class532_Sub1.method12840(2100341141);
					}
				} catch (Exception exception_15) {
					continue;
				}
			}

			long long_12 = Class169.time();
			int i_5 = (int) (20L - (long_12 - long_1));
			if (i_5 > 0) {
				Class89.sleep((long) i_5);
			}
		}

	}

	void method5437(int i_1) {
		this.aBool3599 = true;
	}

	public long method5439(int i_1) {
		return this.aLong3602;
	}

	synchronized void method5445(Interface27 interface27_1, byte b_2) {
		this.anInterface27_3604 = this.anInterface27_3598;
		this.anInterface27_3598 = interface27_1;
		this.aLong3601 = Class169.time();
	}

	synchronized boolean method5450(int i_1) {
		return this.anInterface27_3598.method189(this.aLong3601);
	}

	static final void method5453(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		icomponentdefinitions_0.anInt1453 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		Class109.method1858(icomponentdefinitions_0, (byte) 38);
	}

	static final void method5454(CS2Executor cs2executor_0, byte b_1) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class388.method6689(icomponentdefinitions_3, interface_4, cs2executor_0, -1325522232);
	}

	static final void method5455(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		String string_4 = (String) cs2executor_2.stringStack[--cs2executor_2.stringStackPtr];
		if (Class96_Sub14.method14642(string_4, cs2executor_2, 1521695883) != null) {
			string_4 = string_4.substring(0, string_4.length() - 1);
		}

		icomponentdefinitions_0.anObjectArray1418 = Class351.method6193(string_4, cs2executor_2, 570621267);
		icomponentdefinitions_0.aBool1384 = true;
	}

	static final void method5456(CS2Executor cs2executor_0) {
		String string_2 = (String) cs2executor_0.stringStack[--cs2executor_0.stringStackPtr];
		cs2executor_0.stringStack[++cs2executor_0.stringStackPtr - 1] = Class182.method3044(string_2, -1519993030);
	}

	public static String method5457(long long_0) {
		if (long_0 > 0L && long_0 < 6582952005840035281L) {
			if (long_0 % 37L == 0L) {
				return null;
			} else {
				int i_2 = 0;

				for (long long_3 = long_0; long_3 != 0L; long_3 /= 37L) {
					++i_2;
				}

				StringBuilder stringbuilder_6 = new StringBuilder(i_2);

				while (long_0 != 0L) {
					long long_4 = long_0;
					long_0 /= 37L;
					stringbuilder_6.append(Class500.aCharArray5825[(int) (long_4 - 37L * long_0)]);
				}

				return stringbuilder_6.reverse().toString();
			}
		} else {
			return null;
		}
	}

	static void method5458(int i_0, int i_1, int i_2, int i_3, int i_4) {
		float f_5 = (float) Class291_Sub1.yLength / (float) Class291_Sub1.xLength;
		int i_6 = i_2;
		int i_7 = i_3;
		if (f_5 < 1.0F) {
			i_7 = (int) ((float) i_2 * f_5);
		} else {
			i_6 = (int) ((float) i_3 / f_5);
		}

		i_0 -= (i_2 - i_6) / 2;
		i_1 -= (i_3 - i_7) / 2;
		Class427.anInt5123 = i_0 * Class291_Sub1.xLength / i_6;
		Class475.anInt5624 = Class291_Sub1.yLength - Class291_Sub1.yLength * i_1 / i_7;
		Class291_Sub1.anInt8014 = -1;
		Class291_Sub1.anInt8016 = -1;
		Class89.method1502(825346113);
	}

	static final void method5459(IComponentDefinitions icomponentdefinitions_0, Interface interface_1, CS2Executor cs2executor_2, int i_3) {
		int i_4 = cs2executor_2.intStack[--cs2executor_2.intStackPtr];
		if (i_4 != icomponentdefinitions_0.anInt1435) {
			icomponentdefinitions_0.anInt1435 = i_4;
			Class109.method1858(icomponentdefinitions_0, (byte) 77);
		}

		if (icomponentdefinitions_0.anInt1288 == -1 && !interface_1.aBool999) {
			JS5LocalRequester.method5581(icomponentdefinitions_0.idHash, (byte) 2);
		}

	}

}
