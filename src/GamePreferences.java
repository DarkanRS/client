public class GamePreferences extends Node {

	Game game;
	ProcessorSpecs processorSpecs;
	public GraphicsToolkitPreference currentToolkit;
	public Preference_Sub4 antiAliasingDefault;
	public Preference_Sub4 aPreference_Sub4_8223;
	public BloomPreference bloom;
	public BrightnessPreference brightness;
	public Preference_Sub1 aPreference_Sub1_8197;
	public Preference_Sub16 aPreference_Sub16_8198;
	public Preference_Sub26 aPreference_Sub26_8224;
	public FogPreference fog;
	public Preference_Sub17 aPreference_Sub17_8200;
	public GroundDecorationPreference groundDecoration;
	public IdleAnimationsPreference idleAnimations;
	public Preference_Sub19 aPreference_Sub19_8204;
	public SceneryShadowPreference sceneryShadows;
	public Preference_Sub29 aPreference_Sub29_8201;
	public Preference_Sub20 particles;
	public Preference_Sub27 aPreference_Sub27_8208;
	public Preference_Sub27 removeRoofsOptionOverride;
	public Preference_Sub7 aPreference_Sub7_8210;
	public Preference_Sub14 aPreference_Sub14_8211;
	public Preference_Sub28 aPreference_Sub28_8212;
	public TexturesPreference textures;
	public GraphicsToolkitPreference aPreference_Sub18_8214;
	public WaterPreference water;
	public ScreenSizePreference screenSize;
	public ScreenSizePreference aPreference_Sub9_8218;
	public CustomCursorsPreference customCursors;
	public GraphicsPreference graphics;
	public CPUMaxMemoryPreference cpu;
	public Preference_Sub11 aPreference_Sub11_8217;
	public SafeModePreference safeMode;
	public Preference_Sub3 aPreference_Sub3_8199;
	public SoundLevelPreference soundEffectVolume;
	public SoundLevelPreference ambientSoundVolume;
	public SoundLevelPreference voiceOverVolume;
	public SoundLevelPreference musicVolume;
	public SoundLevelPreference aPreference_Sub13_8229;
	public MonoStereoPreference monoStereo;

	public GamePreferences(RsByteBuffer rsbytebuffer_1, Game game_2) {
		this.game = game_2;
		this.processorSpecs = new ProcessorSpecs(Engine.MAX_MEMORY, Engine.AVAILABLE_PROCESSORS, Class402.aString4828.indexOf("arm") != -1);
		this.currentToolkit = new GraphicsToolkitPreference(0, this);
		this.decode(rsbytebuffer_1);
	}

	void decode(RsByteBuffer rsbytebuffer_1) {
		if (rsbytebuffer_1 != null && rsbytebuffer_1.buffer != null) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 < 23) {
				try {
					this.method13498(rsbytebuffer_1, i_3);
				} catch (Exception exception_5) {
					this.method13497(true, 612084272);
				}

				this.method13497(false, -226219565);
			} else if (i_3 > 27) {
				this.method13497(true, 2054281814);
			} else {
				this.antiAliasingDefault = new Preference_Sub4(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub4_8223 = new Preference_Sub4(this.antiAliasingDefault.method12641(-1510157435), this);
				this.bloom = new BloomPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.brightness = new BrightnessPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub1_8197 = new Preference_Sub1(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 27) {
					this.aPreference_Sub16_8198 = new Preference_Sub16(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.aPreference_Sub26_8224 = new Preference_Sub26(rsbytebuffer_1.readUnsignedByte(), this);
				this.fog = new FogPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub17_8200 = new Preference_Sub17(rsbytebuffer_1.readUnsignedByte(), this);
				this.groundDecoration = new GroundDecorationPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.idleAnimations = new IdleAnimationsPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub19_8204 = new Preference_Sub19(rsbytebuffer_1.readUnsignedByte(), this);
				this.sceneryShadows = new SceneryShadowPreference(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 24) {
					this.aPreference_Sub29_8201 = new Preference_Sub29(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.particles = new Preference_Sub20(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub27_8208 = new Preference_Sub27(rsbytebuffer_1.readUnsignedByte(), this);
				this.removeRoofsOptionOverride = new Preference_Sub27(this.aPreference_Sub27_8208.method12952((byte) 37), this);
				this.aPreference_Sub7_8210 = new Preference_Sub7(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 25) {
					this.aPreference_Sub14_8211 = new Preference_Sub14(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.aPreference_Sub28_8212 = new Preference_Sub28(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 <= 25) {
					++rsbytebuffer_1.index;
				}

				this.textures = new TexturesPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub18_8214 = new GraphicsToolkitPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.currentToolkit = new GraphicsToolkitPreference(this.aPreference_Sub18_8214.getValue(-958077547), this);
				rsbytebuffer_1.readUnsignedByte();
				this.water = new WaterPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.screenSize = new ScreenSizePreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub9_8218 = new ScreenSizePreference(this.screenSize.method12687(-1215691938), this);
				this.customCursors = new CustomCursorsPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.graphics = new GraphicsPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.cpu = new CPUMaxMemoryPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub11_8217 = new Preference_Sub11(rsbytebuffer_1.readUnsignedByte(), this);
				this.safeMode = new SafeModePreference(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 26) {
					this.aPreference_Sub3_8199 = new Preference_Sub3(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.soundEffectVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.ambientSoundVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.voiceOverVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.musicVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub13_8229 = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.monoStereo = new MonoStereoPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.method13497(false, -23246823);
			}
		} else {
			this.method13497(true, -1548642338);
		}

		this.method13502();
	}

	void method13497(boolean bool_1, int i_2) {
		if (bool_1 || this.antiAliasingDefault == null) {
			this.antiAliasingDefault = new Preference_Sub4(this);
		}

		if (bool_1 || this.aPreference_Sub4_8223 == null) {
			this.aPreference_Sub4_8223 = new Preference_Sub4(this.antiAliasingDefault.method12641(2142983368), this);
		}

		if (bool_1 || this.bloom == null) {
			this.bloom = new BloomPreference(this);
		}

		if (bool_1 || this.brightness == null) {
			this.brightness = new BrightnessPreference(this);
		}

		if (bool_1 || this.aPreference_Sub1_8197 == null) {
			this.aPreference_Sub1_8197 = new Preference_Sub1(this);
		}

		if (bool_1 || this.aPreference_Sub16_8198 == null) {
			this.aPreference_Sub16_8198 = new Preference_Sub16(this);
		}

		if (bool_1 || this.aPreference_Sub26_8224 == null) {
			this.aPreference_Sub26_8224 = new Preference_Sub26(this);
		}

		if (bool_1 || this.fog == null) {
			this.fog = new FogPreference(this);
		}

		if (bool_1 || this.aPreference_Sub17_8200 == null) {
			this.aPreference_Sub17_8200 = new Preference_Sub17(this);
		}

		if (bool_1 || this.groundDecoration == null) {
			this.groundDecoration = new GroundDecorationPreference(this);
		}

		if (bool_1 || this.idleAnimations == null) {
			this.idleAnimations = new IdleAnimationsPreference(this);
		}

		if (bool_1 || this.aPreference_Sub19_8204 == null) {
			this.aPreference_Sub19_8204 = new Preference_Sub19(this);
		}

		if (bool_1 || this.sceneryShadows == null) {
			this.sceneryShadows = new SceneryShadowPreference(this);
		}

		if (bool_1 || this.aPreference_Sub29_8201 == null) {
			this.aPreference_Sub29_8201 = new Preference_Sub29(this);
		}

		if (bool_1 || this.particles == null) {
			this.particles = new Preference_Sub20(this);
		}

		if (bool_1 || this.aPreference_Sub27_8208 == null) {
			this.aPreference_Sub27_8208 = new Preference_Sub27(this);
		}

		if (bool_1 || this.removeRoofsOptionOverride == null) {
			this.removeRoofsOptionOverride = new Preference_Sub27(this.aPreference_Sub27_8208.method12952((byte) 96), this);
		}

		if (bool_1 || this.aPreference_Sub7_8210 == null) {
			this.aPreference_Sub7_8210 = new Preference_Sub7(this);
		}

		if (bool_1 || this.aPreference_Sub14_8211 == null) {
			this.aPreference_Sub14_8211 = new Preference_Sub14(this);
		}

		if (bool_1 || this.aPreference_Sub28_8212 == null) {
			this.aPreference_Sub28_8212 = new Preference_Sub28(this);
		}

		if (bool_1 || this.textures == null) {
			this.textures = new TexturesPreference(this);
		}

		if (bool_1 || this.aPreference_Sub18_8214 == null) {
			this.aPreference_Sub18_8214 = new GraphicsToolkitPreference(this);
		}

		if (bool_1 || this.currentToolkit == null) {
			this.currentToolkit = new GraphicsToolkitPreference(this.aPreference_Sub18_8214.getValue(-1125192103), this);
		}

		if (bool_1 || this.water == null) {
			this.water = new WaterPreference(this);
		}

		if (bool_1 || this.screenSize == null) {
			this.screenSize = new ScreenSizePreference(this);
		}

		if (bool_1 || this.aPreference_Sub9_8218 == null) {
			this.aPreference_Sub9_8218 = new ScreenSizePreference(this.screenSize.method12687(-1865727854), this);
		}

		if (bool_1 || this.customCursors == null) {
			this.customCursors = new CustomCursorsPreference(this);
		}

		if (bool_1 || this.graphics == null) {
			this.graphics = new GraphicsPreference(this);
		}

		if (bool_1 || this.cpu == null) {
			this.cpu = new CPUMaxMemoryPreference(this);
		}

		if (bool_1 || this.aPreference_Sub11_8217 == null) {
			this.aPreference_Sub11_8217 = new Preference_Sub11(this);
		}

		if (bool_1 || this.safeMode == null) {
			this.safeMode = new SafeModePreference(this);
		}

		if (bool_1 || this.aPreference_Sub3_8199 == null) {
			this.aPreference_Sub3_8199 = new Preference_Sub3(this);
		}

		if (bool_1 || this.soundEffectVolume == null) {
			this.soundEffectVolume = new SoundLevelPreference(this);
		}

		if (bool_1 || this.ambientSoundVolume == null) {
			this.ambientSoundVolume = new SoundLevelPreference(this);
		}

		if (bool_1 || this.voiceOverVolume == null) {
			this.voiceOverVolume = new SoundLevelPreference(this);
		}

		if (bool_1 || this.musicVolume == null) {
			this.musicVolume = new SoundLevelPreference(this);
		}

		if (bool_1 || this.aPreference_Sub13_8229 == null) {
			this.aPreference_Sub13_8229 = new SoundLevelPreference(this);
		}

		if (bool_1 || this.monoStereo == null) {
			this.monoStereo = new MonoStereoPreference(this);
		}

	}

	void method13498(RsByteBuffer rsbytebuffer_1, int i_2) {
		this.brightness = new BrightnessPreference(rsbytebuffer_1.readUnsignedByte(), this);
		++rsbytebuffer_1.index;
		this.aPreference_Sub27_8208 = new Preference_Sub27(rsbytebuffer_1.readUnsignedByte() + 1, this);
		this.groundDecoration = new GroundDecorationPreference(rsbytebuffer_1.readUnsignedByte(), this);
		++rsbytebuffer_1.index;
		this.idleAnimations = new IdleAnimationsPreference(rsbytebuffer_1.readUnsignedByte(), this);
		this.aPreference_Sub26_8224 = new Preference_Sub26(rsbytebuffer_1.readUnsignedByte(), this);
		rsbytebuffer_1.readUnsignedByte();
		this.aPreference_Sub28_8212 = new Preference_Sub28(rsbytebuffer_1.readUnsignedByte(), this);
		int i_4 = rsbytebuffer_1.readUnsignedByte();
		int i_5 = 0;
		if (i_2 >= 17) {
			i_5 = rsbytebuffer_1.readUnsignedByte();
		}

		this.sceneryShadows = new SceneryShadowPreference(i_4 > i_5 ? i_4 : i_5, this);
		boolean bool_6 = true;
		boolean bool_7 = true;
		if (i_2 >= 2) {
			bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
			if (i_2 >= 17) {
				bool_7 = rsbytebuffer_1.readUnsignedByte() == 1;
			}
		} else {
			bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
			rsbytebuffer_1.readUnsignedByte();
		}

		this.aPreference_Sub19_8204 = new Preference_Sub19(bool_6 | bool_7 ? 1 : 0, this);
		this.water = new WaterPreference(rsbytebuffer_1.readUnsignedByte(), this);
		this.fog = new FogPreference(rsbytebuffer_1.readUnsignedByte(), this);
		this.antiAliasingDefault = new Preference_Sub4(rsbytebuffer_1.readUnsignedByte(), this);
		this.monoStereo = new MonoStereoPreference(rsbytebuffer_1.readUnsignedByte(), this);
		this.soundEffectVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		if (i_2 >= 20) {
			this.voiceOverVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		} else {
			this.voiceOverVolume = new SoundLevelPreference(this.soundEffectVolume.method12714(), this);
		}

		this.musicVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		this.ambientSoundVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		if (i_2 >= 21) {
			this.aPreference_Sub13_8229 = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		} else {
			this.aPreference_Sub13_8229 = new SoundLevelPreference(this.musicVolume.method12714(), this);
		}

		if (i_2 >= 1) {
			rsbytebuffer_1.readUnsignedShort();
			rsbytebuffer_1.readUnsignedShort();
		}

		if (i_2 >= 3 && i_2 < 6) {
			rsbytebuffer_1.readUnsignedByte();
		}

		if (i_2 >= 4) {
			this.particles = new Preference_Sub20(rsbytebuffer_1.readUnsignedByte(), this);
		}

		rsbytebuffer_1.readInt();
		if (i_2 >= 6) {
			this.screenSize = new ScreenSizePreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 7) {
			this.safeMode = new SafeModePreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 8) {
			rsbytebuffer_1.readUnsignedByte();
		}

		if (i_2 >= 9) {
			this.aPreference_Sub1_8197 = new Preference_Sub1(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 10) {
			this.bloom = new BloomPreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 11) {
			this.customCursors = new CustomCursorsPreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 12) {
			this.idleAnimations = new IdleAnimationsPreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 13) {
			this.aPreference_Sub17_8200 = new Preference_Sub17(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 14) {
			this.aPreference_Sub18_8214 = new GraphicsToolkitPreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 15) {
			this.cpu = new CPUMaxMemoryPreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 16) {
			this.textures = new TexturesPreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 18) {
			this.graphics = new GraphicsPreference(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 19) {
			this.aPreference_Sub7_8210 = new Preference_Sub7(rsbytebuffer_1.readUnsignedByte(), this);
		}

		if (i_2 >= 22) {
			this.aPreference_Sub11_8217 = new Preference_Sub11(rsbytebuffer_1.readUnsignedByte(), this);
		}

	}

	public RsByteBuffer encode() {
		RsByteBuffer rsbytebuffer_2 = new RsByteBuffer(40);
		/*0*/rsbytebuffer_2.writeByte(27);
		/*1*/rsbytebuffer_2.writeByte(this.antiAliasingDefault.method12641(1497480561));
		/*2*/rsbytebuffer_2.writeByte(this.bloom.method12706((byte) 95));
		/*3*/rsbytebuffer_2.writeByte(this.brightness.method12865());
		/*4*/rsbytebuffer_2.writeByte(this.aPreference_Sub1_8197.method12615(-462784918));
		/*5*/rsbytebuffer_2.writeByte(this.aPreference_Sub16_8198.method12750());
		/*6*/rsbytebuffer_2.writeByte(this.aPreference_Sub26_8224.method12943(975799184));
		/*7*/rsbytebuffer_2.writeByte(this.fog.method13417(-1899817216));
		/*8*/rsbytebuffer_2.writeByte(this.aPreference_Sub17_8200.method12762(-140573));
		/*9*/rsbytebuffer_2.writeByte(this.groundDecoration.method12897((byte) 75));
		/*10*/rsbytebuffer_2.writeByte(this.idleAnimations.getValue());
		/*11*/rsbytebuffer_2.writeByte(this.aPreference_Sub19_8204.method12786());
		/*12*/rsbytebuffer_2.writeByte(this.sceneryShadows.method12624((byte) -37));
		/*13*/rsbytebuffer_2.writeByte(this.aPreference_Sub29_8201.method13050());
		/*14*/rsbytebuffer_2.writeByte(this.particles.method12794());
		/*15*/rsbytebuffer_2.writeByte(this.aPreference_Sub27_8208.method12952((byte) 121));
		/*16*/rsbytebuffer_2.writeByte(this.aPreference_Sub7_8210.method12666(141061966));
		/*17*/rsbytebuffer_2.writeByte(this.aPreference_Sub14_8211.method12728());
		/*18*/rsbytebuffer_2.writeByte(this.aPreference_Sub28_8212.method12966((byte) -41));
		/*19*/rsbytebuffer_2.writeByte(this.textures.method12873(2145197376));
		/*20*/rsbytebuffer_2.writeByte(this.aPreference_Sub18_8214.getValue(-120460114));
		/*21*/rsbytebuffer_2.writeByte(0);
		/*22*/rsbytebuffer_2.writeByte(this.water.getValue());
		/*23*/rsbytebuffer_2.writeByte(this.screenSize.method12687(416506379));
		/*24*/rsbytebuffer_2.writeByte(this.customCursors.method12675());
		/*25*/rsbytebuffer_2.writeByte(this.graphics.method12654());
		/*26*/rsbytebuffer_2.writeByte(this.cpu.getValue());
		/*27*/rsbytebuffer_2.writeByte(this.aPreference_Sub11_8217.method12699((byte) -71));
		/*28*/rsbytebuffer_2.writeByte(this.safeMode.getValue((byte) -54));
		/*29*/rsbytebuffer_2.writeByte(this.aPreference_Sub3_8199.method12632(793302253));
		/*30*/rsbytebuffer_2.writeByte(this.soundEffectVolume.method12714());
		/*31*/rsbytebuffer_2.writeByte(this.ambientSoundVolume.method12714());
		/*32*/rsbytebuffer_2.writeByte(this.voiceOverVolume.method12714());
		/*33*/rsbytebuffer_2.writeByte(this.musicVolume.method12714());
		/*34*/rsbytebuffer_2.writeByte(this.aPreference_Sub13_8229.method12714());
		/*35*/rsbytebuffer_2.writeByte(this.monoStereo.method12691(-1240240085));
		return rsbytebuffer_2;
	}

	void method13502() {
		this.antiAliasingDefault.method12639((byte) -35);
		this.aPreference_Sub4_8223.method12639((byte) -23);
		this.bloom.method12703();
		this.brightness.method12861();
		this.aPreference_Sub1_8197.method12616();
		this.aPreference_Sub16_8198.method12749();
		this.aPreference_Sub26_8224.method12941();
		this.fog.method13415();
		this.aPreference_Sub17_8200.method12767();
		this.groundDecoration.method12898();
		this.idleAnimations.method12741();
		this.aPreference_Sub19_8204.method12785();
		this.sceneryShadows.method12627();
		this.aPreference_Sub29_8201.method13048();
		this.particles.method12793();
		this.aPreference_Sub27_8208.method12950(1301389562);
		this.removeRoofsOptionOverride.method12950(221369371);
		this.aPreference_Sub7_8210.method12663();
		this.aPreference_Sub14_8211.method12725();
		this.aPreference_Sub28_8212.method12959();
		this.textures.method12871();
		this.aPreference_Sub18_8214.method12773(-132030593);
		this.currentToolkit.method12773(-1630198990);
		this.water.method12918();
		this.screenSize.method12684((byte) -10);
		this.aPreference_Sub9_8218.method12684((byte) 105);
		this.customCursors.method12674();
		this.graphics.method12653();
		this.cpu.method12648();
		this.aPreference_Sub11_8217.method12698();
		this.safeMode.method12928();
		this.aPreference_Sub3_8199.method12631();
		this.soundEffectVolume.method12712((byte) 114);
		this.ambientSoundVolume.method12712((byte) 41);
		this.voiceOverVolume.method12712((byte) 85);
		this.musicVolume.method12712((byte) 78);
		this.aPreference_Sub13_8229.method12712((byte) 16);
		this.monoStereo.method12692();
	}

	public ProcessorSpecs getProcessorSpecs() {
		return this.processorSpecs;
	}

	public void method13505(GraphicsToolkitPreference class468_sub18_1, boolean bool_2, int i_3) {
		class468_sub18_1.method12783(bool_2);
		this.method13502();
	}

	public GamePreferences(Game game_1) {
		this.game = game_1;
		this.processorSpecs = new ProcessorSpecs(Engine.MAX_MEMORY, Engine.AVAILABLE_PROCESSORS, Class402.aString4828.toLowerCase().indexOf("arm") != -1);
		this.currentToolkit = new GraphicsToolkitPreference(0, this);
		this.method13497(true, 311350524);
	}

	public void setValue(Preference class468_1, int i_2) {
		class468_1.setPref(i_2);
		this.method13502();
	}

	public Game getGame() {
		return this.game;
	}

}
