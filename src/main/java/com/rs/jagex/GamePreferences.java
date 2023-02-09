package com.rs.jagex;

public class GamePreferences extends Node {

	public GraphicsToolkitPreference currentToolkit;
	public Preference_Sub4 antiAliasingDefault;
	public Preference_Sub4 aPreference_Sub4_8223;
	public BloomPreference bloom;
	public BrightnessPreference brightness;
	public Preference_Sub1 buildArea;
	public Preference_Sub16 aPreference_Sub16_8198;
	public Preference_Sub26 flickeringEffects;
	public FogPreference fog;
	public Preference_Sub17 groundBlending;
	public GroundDecorationPreference groundDecor;
	public IdleAnimationsPreference idleAnimations;
	public LightDetailPreference lightDetail;
	public SceneryShadowPreference sceneryShadows;
	public Preference_Sub29 toolkitDefault;
	public Preference_Sub20 particles;
	public Preference_Sub27 removeRoofs;
	public Preference_Sub27 removeRoofsOptionOverride;
	public Preference_Sub7 maxScreenSize;
	public Preference_Sub14 skyBoxes;
	public Preference_Sub28 characterShadows;
	public TexturesPreference textures;
	public GraphicsToolkitPreference toolKit;
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
	Game game;
	ProcessorSpecs processorSpecs;

	public GamePreferences(ByteBuf rsbytebuffer_1, Game game_2) {
		game = game_2;
		processorSpecs = new ProcessorSpecs(Engine.MAX_MEMORY, Engine.AVAILABLE_PROCESSORS, Class402.aString4828.indexOf("arm") != -1);
		currentToolkit = new GraphicsToolkitPreference(0, this);
		decode(rsbytebuffer_1);
	}

	public GamePreferences(Game game_1) {
		game = game_1;
		processorSpecs = new ProcessorSpecs(Engine.MAX_MEMORY, Engine.AVAILABLE_PROCESSORS, Class402.aString4828.toLowerCase().indexOf("arm") != -1);
		currentToolkit = new GraphicsToolkitPreference(0, this);
		method13497(true);
	}

	void decode(ByteBuf rsbytebuffer_1) {
		if (rsbytebuffer_1 != null && rsbytebuffer_1.buffer != null) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 < 23) {
				try {
					method13498(rsbytebuffer_1, i_3);
				} catch (Exception exception_5) {
					method13497(true);
				}

				method13497(false);
			} else if (i_3 > 27)
				method13497(true);
			else {
				antiAliasingDefault = new Preference_Sub4(rsbytebuffer_1.readUnsignedByte(), this);
				aPreference_Sub4_8223 = new Preference_Sub4(antiAliasingDefault.method12641(), this);
				bloom = new BloomPreference(rsbytebuffer_1.readUnsignedByte(), this);
				brightness = new BrightnessPreference(rsbytebuffer_1.readUnsignedByte(), this);
				buildArea = new Preference_Sub1(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 27)
					aPreference_Sub16_8198 = new Preference_Sub16(rsbytebuffer_1.readUnsignedByte(), this);

				flickeringEffects = new Preference_Sub26(rsbytebuffer_1.readUnsignedByte(), this);
				fog = new FogPreference(rsbytebuffer_1.readUnsignedByte(), this);
				groundBlending = new Preference_Sub17(rsbytebuffer_1.readUnsignedByte(), this);
				groundDecor = new GroundDecorationPreference(rsbytebuffer_1.readUnsignedByte(), this);
				idleAnimations = new IdleAnimationsPreference(rsbytebuffer_1.readUnsignedByte(), this);
				lightDetail = new LightDetailPreference(rsbytebuffer_1.readUnsignedByte(), this);
				sceneryShadows = new SceneryShadowPreference(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 24)
					toolkitDefault = new Preference_Sub29(rsbytebuffer_1.readUnsignedByte(), this);

				particles = new Preference_Sub20(rsbytebuffer_1.readUnsignedByte(), this);
				removeRoofs = new Preference_Sub27(rsbytebuffer_1.readUnsignedByte(), this);
				removeRoofsOptionOverride = new Preference_Sub27(removeRoofs.method12952(), this);
				maxScreenSize = new Preference_Sub7(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 25)
					skyBoxes = new Preference_Sub14(rsbytebuffer_1.readUnsignedByte(), this);

				characterShadows = new Preference_Sub28(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 <= 25)
					++rsbytebuffer_1.index;

				textures = new TexturesPreference(rsbytebuffer_1.readUnsignedByte(), this);
				toolKit = new GraphicsToolkitPreference(rsbytebuffer_1.readUnsignedByte(), this);
				currentToolkit = new GraphicsToolkitPreference(toolKit.getValue(), this);
				rsbytebuffer_1.readUnsignedByte();
				water = new WaterPreference(rsbytebuffer_1.readUnsignedByte(), this);
				screenSize = new ScreenSizePreference(rsbytebuffer_1.readUnsignedByte(), this);
				aPreference_Sub9_8218 = new ScreenSizePreference(screenSize.getValue(), this);
				customCursors = new CustomCursorsPreference(this);
				graphics = new GraphicsPreference(rsbytebuffer_1.readUnsignedByte(), this);
				cpu = new CPUMaxMemoryPreference(rsbytebuffer_1.readUnsignedByte(), this);
				aPreference_Sub11_8217 = new Preference_Sub11(rsbytebuffer_1.readUnsignedByte(), this);
				safeMode = new SafeModePreference(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 26)
					aPreference_Sub3_8199 = new Preference_Sub3(rsbytebuffer_1.readUnsignedByte(), this);

				soundEffectVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				ambientSoundVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				voiceOverVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				musicVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				aPreference_Sub13_8229 = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
				monoStereo = new MonoStereoPreference(rsbytebuffer_1.readUnsignedByte(), this);
				method13497(false);
			}
		} else
			method13497(true);

		method13502();
	}

	public ByteBuf encode() {
		ByteBuf rsbytebuffer_2 = new ByteBuf(40);
		/*0*/
		rsbytebuffer_2.writeByte(27);
		/*1*/
		rsbytebuffer_2.writeByte(antiAliasingDefault.method12641());
		/*2*/
		rsbytebuffer_2.writeByte(bloom.method12706());
		/*3*/
		rsbytebuffer_2.writeByte(brightness.method12865());
		/*4*/
		rsbytebuffer_2.writeByte(buildArea.method12615());
		/*5*/
		rsbytebuffer_2.writeByte(aPreference_Sub16_8198.method12750());
		/*6*/
		rsbytebuffer_2.writeByte(flickeringEffects.method12943());
		/*7*/
		rsbytebuffer_2.writeByte(fog.method13417());
		/*8*/
		rsbytebuffer_2.writeByte(groundBlending.method12762());
		/*9*/
		rsbytebuffer_2.writeByte(groundDecor.method12897());
		/*10*/
		rsbytebuffer_2.writeByte(idleAnimations.getValue());
		/*11*/
		rsbytebuffer_2.writeByte(lightDetail.method12786());
		/*12*/
		rsbytebuffer_2.writeByte(sceneryShadows.method12624());
		/*13*/
		rsbytebuffer_2.writeByte(toolkitDefault.method13050());
		/*14*/
		rsbytebuffer_2.writeByte(particles.method12794());
		/*15*/
		rsbytebuffer_2.writeByte(removeRoofs.method12952());
		/*16*/
		rsbytebuffer_2.writeByte(maxScreenSize.method12666());
		/*17*/
		rsbytebuffer_2.writeByte(skyBoxes.method12728());
		/*18*/
		rsbytebuffer_2.writeByte(characterShadows.method12966());
		/*19*/
		rsbytebuffer_2.writeByte(textures.method12873());
		/*20*/
		rsbytebuffer_2.writeByte(toolKit.getValue());
		/*21*/
		rsbytebuffer_2.writeByte(0);
		/*22*/
		rsbytebuffer_2.writeByte(water.getValue());
		/*23*/
		rsbytebuffer_2.writeByte(screenSize.getValue());
		/*24*/
		rsbytebuffer_2.writeByte(customCursors.method12675());
		/*25*/
		rsbytebuffer_2.writeByte(graphics.method12654());
		/*26*/
		rsbytebuffer_2.writeByte(cpu.getValue());
		/*27*/
		rsbytebuffer_2.writeByte(aPreference_Sub11_8217.method12699());
		/*28*/
		rsbytebuffer_2.writeByte(safeMode.getValue());
		/*29*/
		rsbytebuffer_2.writeByte(aPreference_Sub3_8199.method12632());
		/*30*/
		rsbytebuffer_2.writeByte(soundEffectVolume.method12714());
		/*31*/
		rsbytebuffer_2.writeByte(ambientSoundVolume.method12714());
		/*32*/
		rsbytebuffer_2.writeByte(voiceOverVolume.method12714());
		/*33*/
		rsbytebuffer_2.writeByte(musicVolume.method12714());
		/*34*/
		rsbytebuffer_2.writeByte(aPreference_Sub13_8229.method12714());
		/*35*/
		rsbytebuffer_2.writeByte(monoStereo.method12691());
		return rsbytebuffer_2;
	}

	public Game getGame() {
		return game;
	}

	public ProcessorSpecs getProcessorSpecs() {
		return processorSpecs;
	}

	void method13497(boolean bool_1) {
		if (bool_1 || antiAliasingDefault == null)
			antiAliasingDefault = new Preference_Sub4(this);

		if (bool_1 || aPreference_Sub4_8223 == null)
			aPreference_Sub4_8223 = new Preference_Sub4(antiAliasingDefault.method12641(), this);

		if (bool_1 || bloom == null)
			bloom = new BloomPreference(this);

		if (bool_1 || brightness == null)
			brightness = new BrightnessPreference(this);

		if (bool_1 || buildArea == null)
			buildArea = new Preference_Sub1(this);

		if (bool_1 || aPreference_Sub16_8198 == null)
			aPreference_Sub16_8198 = new Preference_Sub16(this);

		if (bool_1 || flickeringEffects == null)
			flickeringEffects = new Preference_Sub26(this);

		if (bool_1 || fog == null)
			fog = new FogPreference(this);

		if (bool_1 || groundBlending == null)
			groundBlending = new Preference_Sub17(this);

		if (bool_1 || groundDecor == null)
			groundDecor = new GroundDecorationPreference(this);

		if (bool_1 || idleAnimations == null)
			idleAnimations = new IdleAnimationsPreference(this);

		if (bool_1 || lightDetail == null)
			lightDetail = new LightDetailPreference(this);

		if (bool_1 || sceneryShadows == null)
			sceneryShadows = new SceneryShadowPreference(this);

		if (bool_1 || toolkitDefault == null)
			toolkitDefault = new Preference_Sub29(this);

		if (bool_1 || particles == null)
			particles = new Preference_Sub20(this);

		if (bool_1 || removeRoofs == null)
			removeRoofs = new Preference_Sub27(this);

		if (bool_1 || removeRoofsOptionOverride == null)
			removeRoofsOptionOverride = new Preference_Sub27(removeRoofs.method12952(), this);

		if (bool_1 || maxScreenSize == null)
			maxScreenSize = new Preference_Sub7(this);

		if (bool_1 || skyBoxes == null)
			skyBoxes = new Preference_Sub14(this);

		if (bool_1 || characterShadows == null)
			characterShadows = new Preference_Sub28(this);

		if (bool_1 || textures == null)
			textures = new TexturesPreference(this);

		if (bool_1 || toolKit == null)
			toolKit = new GraphicsToolkitPreference(this);

		if (bool_1 || currentToolkit == null)
			currentToolkit = new GraphicsToolkitPreference(toolKit.getValue(), this);

		if (bool_1 || water == null)
			water = new WaterPreference(this);

		if (bool_1 || screenSize == null)
			screenSize = new ScreenSizePreference(this);

		if (bool_1 || aPreference_Sub9_8218 == null)
			aPreference_Sub9_8218 = new ScreenSizePreference(screenSize.getValue(), this);

		if (bool_1 || customCursors == null)
			customCursors = new CustomCursorsPreference(this);

		if (bool_1 || graphics == null)
			graphics = new GraphicsPreference(this);

		if (bool_1 || cpu == null)
			cpu = new CPUMaxMemoryPreference(this);

		if (bool_1 || aPreference_Sub11_8217 == null)
			aPreference_Sub11_8217 = new Preference_Sub11(this);

		if (bool_1 || safeMode == null)
			safeMode = new SafeModePreference(this);

		if (bool_1 || aPreference_Sub3_8199 == null)
			aPreference_Sub3_8199 = new Preference_Sub3(this);

		if (bool_1 || soundEffectVolume == null)
			soundEffectVolume = new SoundLevelPreference(this);

		if (bool_1 || ambientSoundVolume == null)
			ambientSoundVolume = new SoundLevelPreference(this);

		if (bool_1 || voiceOverVolume == null)
			voiceOverVolume = new SoundLevelPreference(this);

		if (bool_1 || musicVolume == null)
			musicVolume = new SoundLevelPreference(this);

		if (bool_1 || aPreference_Sub13_8229 == null)
			aPreference_Sub13_8229 = new SoundLevelPreference(this);

		if (bool_1 || monoStereo == null)
			monoStereo = new MonoStereoPreference(this);

	}

	void method13498(ByteBuf rsbytebuffer_1, int i_2) {
		brightness = new BrightnessPreference(rsbytebuffer_1.readUnsignedByte(), this);
		++rsbytebuffer_1.index;
		removeRoofs = new Preference_Sub27(rsbytebuffer_1.readUnsignedByte() + 1, this);
		groundDecor = new GroundDecorationPreference(rsbytebuffer_1.readUnsignedByte(), this);
		++rsbytebuffer_1.index;
		idleAnimations = new IdleAnimationsPreference(rsbytebuffer_1.readUnsignedByte(), this);
		flickeringEffects = new Preference_Sub26(rsbytebuffer_1.readUnsignedByte(), this);
		rsbytebuffer_1.readUnsignedByte();
		characterShadows = new Preference_Sub28(rsbytebuffer_1.readUnsignedByte(), this);
		int i_4 = rsbytebuffer_1.readUnsignedByte();
		int i_5 = 0;
		if (i_2 >= 17)
			i_5 = rsbytebuffer_1.readUnsignedByte();

		sceneryShadows = new SceneryShadowPreference(Math.max(i_4, i_5), this);
		boolean bool_6 = true;
		boolean bool_7 = true;
		if (i_2 >= 2) {
			bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
			if (i_2 >= 17)
				bool_7 = rsbytebuffer_1.readUnsignedByte() == 1;
		} else {
			bool_6 = rsbytebuffer_1.readUnsignedByte() == 1;
			rsbytebuffer_1.readUnsignedByte();
		}

		lightDetail = new LightDetailPreference(bool_6 | bool_7 ? 1 : 0, this);
		water = new WaterPreference(rsbytebuffer_1.readUnsignedByte(), this);
		fog = new FogPreference(rsbytebuffer_1.readUnsignedByte(), this);
		antiAliasingDefault = new Preference_Sub4(rsbytebuffer_1.readUnsignedByte(), this);
		monoStereo = new MonoStereoPreference(rsbytebuffer_1.readUnsignedByte(), this);
		soundEffectVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		if (i_2 >= 20)
			voiceOverVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		else
			voiceOverVolume = new SoundLevelPreference(soundEffectVolume.method12714(), this);

		musicVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		ambientSoundVolume = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		if (i_2 >= 21)
			aPreference_Sub13_8229 = new SoundLevelPreference(rsbytebuffer_1.readUnsignedByte(), this);
		else
			aPreference_Sub13_8229 = new SoundLevelPreference(musicVolume.method12714(), this);

		if (i_2 >= 1) {
			rsbytebuffer_1.readUnsignedShort();
			rsbytebuffer_1.readUnsignedShort();
		}

		if (i_2 >= 3 && i_2 < 6)
			rsbytebuffer_1.readUnsignedByte();

		if (i_2 >= 4)
			particles = new Preference_Sub20(rsbytebuffer_1.readUnsignedByte(), this);

		rsbytebuffer_1.readInt();
		if (i_2 >= 6)
			screenSize = new ScreenSizePreference(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 7)
			safeMode = new SafeModePreference(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 8)
			rsbytebuffer_1.readUnsignedByte();

		if (i_2 >= 9)
			buildArea = new Preference_Sub1(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 10)
			bloom = new BloomPreference(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 11)
			customCursors = new CustomCursorsPreference(this);

		if (i_2 >= 12)
			idleAnimations = new IdleAnimationsPreference(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 13)
			groundBlending = new Preference_Sub17(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 14)
			toolKit = new GraphicsToolkitPreference(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 15)
			cpu = new CPUMaxMemoryPreference(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 16)
			textures = new TexturesPreference(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 18)
			graphics = new GraphicsPreference(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 19)
			maxScreenSize = new Preference_Sub7(rsbytebuffer_1.readUnsignedByte(), this);

		if (i_2 >= 22)
			aPreference_Sub11_8217 = new Preference_Sub11(rsbytebuffer_1.readUnsignedByte(), this);

	}

	void method13502() {
		antiAliasingDefault.method12639();
		aPreference_Sub4_8223.method12639();
		bloom.method12703();
		brightness.method12861();
		buildArea.method12616();
		aPreference_Sub16_8198.method12749();
		flickeringEffects.method12941();
		fog.method13415();
		groundBlending.method12767();
		groundDecor.method12898();
		idleAnimations.method12741();
		lightDetail.method12785();
		sceneryShadows.method12627();
		toolkitDefault.method13048();
		particles.method12793();
		removeRoofs.method12950();
		removeRoofsOptionOverride.method12950();
		maxScreenSize.method12663();
		skyBoxes.method12725();
		characterShadows.method12959();
		textures.method12871();
		toolKit.method12773();
		currentToolkit.method12773();
		water.method12918();
		screenSize.method12684();
		aPreference_Sub9_8218.method12684();
		customCursors.method12674();
		graphics.method12653();
		cpu.method12648();
		aPreference_Sub11_8217.method12698();
		safeMode.method12928();
		aPreference_Sub3_8199.method12631();
		soundEffectVolume.method12712();
		ambientSoundVolume.method12712();
		voiceOverVolume.method12712();
		musicVolume.method12712();
		aPreference_Sub13_8229.method12712();
		monoStereo.method12692();
	}

	public void method13505(GraphicsToolkitPreference class468_sub18_1, boolean bool_2) {
		class468_sub18_1.method12783(bool_2);
		method13502();
	}

	public void setValue(Preference class468_1, int i_2) {
		class468_1.setPref(i_2);
		method13502();
	}

}
