public class GamePreferences extends Node {

	Game game;
	ProcessorSpecs processorSpecs;
	public GraphicsToolkitPreference currentToolkit;
	public Preference_Sub4 aPreference_Sub4_8187;
	public Preference_Sub4 aPreference_Sub4_8223;
	public Preference_Sub12 aPreference_Sub12_8195;
	public Preference_Sub21 aPreference_Sub21_8222;
	public Preference_Sub1 aPreference_Sub1_8197;
	public Preference_Sub16 aPreference_Sub16_8198;
	public Preference_Sub26 aPreference_Sub26_8224;
	public FogPreference fog;
	public Preference_Sub17 aPreference_Sub17_8200;
	public Preference_Sub23 aPreference_Sub23_8202;
	public IdleAnimationsPreference idleAnimations;
	public Preference_Sub19 aPreference_Sub19_8204;
	public Preference_Sub2 aPreference_Sub2_8205;
	public Preference_Sub29 aPreference_Sub29_8201;
	public Preference_Sub20 aPreference_Sub20_8207;
	public Preference_Sub27 aPreference_Sub27_8208;
	public Preference_Sub27 aPreference_Sub27_8209;
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
	public Preference_Sub13 aPreference_Sub13_8225;
	public Preference_Sub13 aPreference_Sub13_8193;
	public Preference_Sub13 aPreference_Sub13_8227;
	public Preference_Sub13 aPreference_Sub13_8228;
	public Preference_Sub13 aPreference_Sub13_8229;
	public Preference_Sub10 aPreference_Sub10_8215;

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
				this.aPreference_Sub4_8187 = new Preference_Sub4(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub4_8223 = new Preference_Sub4(this.aPreference_Sub4_8187.method12641(-1510157435), this);
				this.aPreference_Sub12_8195 = new Preference_Sub12(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub21_8222 = new Preference_Sub21(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub1_8197 = new Preference_Sub1(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 27) {
					this.aPreference_Sub16_8198 = new Preference_Sub16(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.aPreference_Sub26_8224 = new Preference_Sub26(rsbytebuffer_1.readUnsignedByte(), this);
				this.fog = new FogPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub17_8200 = new Preference_Sub17(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub23_8202 = new Preference_Sub23(rsbytebuffer_1.readUnsignedByte(), this);
				this.idleAnimations = new IdleAnimationsPreference(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub19_8204 = new Preference_Sub19(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub2_8205 = new Preference_Sub2(rsbytebuffer_1.readUnsignedByte(), this);
				if (i_3 >= 24) {
					this.aPreference_Sub29_8201 = new Preference_Sub29(rsbytebuffer_1.readUnsignedByte(), this);
				}

				this.aPreference_Sub20_8207 = new Preference_Sub20(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub27_8208 = new Preference_Sub27(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub27_8209 = new Preference_Sub27(this.aPreference_Sub27_8208.method12952((byte) 37), this);
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

				this.aPreference_Sub13_8225 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub13_8193 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub13_8227 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub13_8228 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub13_8229 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
				this.aPreference_Sub10_8215 = new Preference_Sub10(rsbytebuffer_1.readUnsignedByte(), this);
				this.method13497(false, -23246823);
			}
		} else {
			this.method13497(true, -1548642338);
		}

		this.method13502();
	}

	void method13497(boolean bool_1, int i_2) {
		if (bool_1 || this.aPreference_Sub4_8187 == null) {
			this.aPreference_Sub4_8187 = new Preference_Sub4(this);
		}

		if (bool_1 || this.aPreference_Sub4_8223 == null) {
			this.aPreference_Sub4_8223 = new Preference_Sub4(this.aPreference_Sub4_8187.method12641(2142983368), this);
		}

		if (bool_1 || this.aPreference_Sub12_8195 == null) {
			this.aPreference_Sub12_8195 = new Preference_Sub12(this);
		}

		if (bool_1 || this.aPreference_Sub21_8222 == null) {
			this.aPreference_Sub21_8222 = new Preference_Sub21(this);
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

		if (bool_1 || this.aPreference_Sub23_8202 == null) {
			this.aPreference_Sub23_8202 = new Preference_Sub23(this);
		}

		if (bool_1 || this.idleAnimations == null) {
			this.idleAnimations = new IdleAnimationsPreference(this);
		}

		if (bool_1 || this.aPreference_Sub19_8204 == null) {
			this.aPreference_Sub19_8204 = new Preference_Sub19(this);
		}

		if (bool_1 || this.aPreference_Sub2_8205 == null) {
			this.aPreference_Sub2_8205 = new Preference_Sub2(this);
		}

		if (bool_1 || this.aPreference_Sub29_8201 == null) {
			this.aPreference_Sub29_8201 = new Preference_Sub29(this);
		}

		if (bool_1 || this.aPreference_Sub20_8207 == null) {
			this.aPreference_Sub20_8207 = new Preference_Sub20(this);
		}

		if (bool_1 || this.aPreference_Sub27_8208 == null) {
			this.aPreference_Sub27_8208 = new Preference_Sub27(this);
		}

		if (bool_1 || this.aPreference_Sub27_8209 == null) {
			this.aPreference_Sub27_8209 = new Preference_Sub27(this.aPreference_Sub27_8208.method12952((byte) 96), this);
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

		if (bool_1 || this.aPreference_Sub13_8225 == null) {
			this.aPreference_Sub13_8225 = new Preference_Sub13(this);
		}

		if (bool_1 || this.aPreference_Sub13_8193 == null) {
			this.aPreference_Sub13_8193 = new Preference_Sub13(this);
		}

		if (bool_1 || this.aPreference_Sub13_8227 == null) {
			this.aPreference_Sub13_8227 = new Preference_Sub13(this);
		}

		if (bool_1 || this.aPreference_Sub13_8228 == null) {
			this.aPreference_Sub13_8228 = new Preference_Sub13(this);
		}

		if (bool_1 || this.aPreference_Sub13_8229 == null) {
			this.aPreference_Sub13_8229 = new Preference_Sub13(this);
		}

		if (bool_1 || this.aPreference_Sub10_8215 == null) {
			this.aPreference_Sub10_8215 = new Preference_Sub10(this);
		}

	}

	void method13498(RsByteBuffer rsbytebuffer_1, int i_2) {
		this.aPreference_Sub21_8222 = new Preference_Sub21(rsbytebuffer_1.readUnsignedByte(), this);
		++rsbytebuffer_1.index;
		this.aPreference_Sub27_8208 = new Preference_Sub27(rsbytebuffer_1.readUnsignedByte() + 1, this);
		this.aPreference_Sub23_8202 = new Preference_Sub23(rsbytebuffer_1.readUnsignedByte(), this);
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

		this.aPreference_Sub2_8205 = new Preference_Sub2(i_4 > i_5 ? i_4 : i_5, this);
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
		this.aPreference_Sub4_8187 = new Preference_Sub4(rsbytebuffer_1.readUnsignedByte(), this);
		this.aPreference_Sub10_8215 = new Preference_Sub10(rsbytebuffer_1.readUnsignedByte(), this);
		this.aPreference_Sub13_8225 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		if (i_2 >= 20) {
			this.aPreference_Sub13_8227 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		} else {
			this.aPreference_Sub13_8227 = new Preference_Sub13(this.aPreference_Sub13_8225.method12714(), this);
		}

		this.aPreference_Sub13_8228 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		this.aPreference_Sub13_8193 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		if (i_2 >= 21) {
			this.aPreference_Sub13_8229 = new Preference_Sub13(rsbytebuffer_1.readUnsignedByte(), this);
		} else {
			this.aPreference_Sub13_8229 = new Preference_Sub13(this.aPreference_Sub13_8228.method12714(), this);
		}

		if (i_2 >= 1) {
			rsbytebuffer_1.readUnsignedShort();
			rsbytebuffer_1.readUnsignedShort();
		}

		if (i_2 >= 3 && i_2 < 6) {
			rsbytebuffer_1.readUnsignedByte();
		}

		if (i_2 >= 4) {
			this.aPreference_Sub20_8207 = new Preference_Sub20(rsbytebuffer_1.readUnsignedByte(), this);
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
			this.aPreference_Sub12_8195 = new Preference_Sub12(rsbytebuffer_1.readUnsignedByte(), this);
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
		rsbytebuffer_2.writeByte(27);
		rsbytebuffer_2.writeByte(this.aPreference_Sub4_8187.method12641(1497480561));
		rsbytebuffer_2.writeByte(this.aPreference_Sub12_8195.method12706((byte) 95));
		rsbytebuffer_2.writeByte(this.aPreference_Sub21_8222.method12865());
		rsbytebuffer_2.writeByte(this.aPreference_Sub1_8197.method12615(-462784918));
		rsbytebuffer_2.writeByte(this.aPreference_Sub16_8198.method12750());
		rsbytebuffer_2.writeByte(this.aPreference_Sub26_8224.method12943(975799184));
		rsbytebuffer_2.writeByte(this.fog.method13417(-1899817216));
		rsbytebuffer_2.writeByte(this.aPreference_Sub17_8200.method12762(-140573));
		rsbytebuffer_2.writeByte(this.aPreference_Sub23_8202.method12897((byte) 75));
		rsbytebuffer_2.writeByte(this.idleAnimations.getValue());
		rsbytebuffer_2.writeByte(this.aPreference_Sub19_8204.method12786());
		rsbytebuffer_2.writeByte(this.aPreference_Sub2_8205.method12624((byte) -37));
		rsbytebuffer_2.writeByte(this.aPreference_Sub29_8201.method13050());
		rsbytebuffer_2.writeByte(this.aPreference_Sub20_8207.method12794());
		rsbytebuffer_2.writeByte(this.aPreference_Sub27_8208.method12952((byte) 121));
		rsbytebuffer_2.writeByte(this.aPreference_Sub7_8210.method12666(141061966));
		rsbytebuffer_2.writeByte(this.aPreference_Sub14_8211.method12728());
		rsbytebuffer_2.writeByte(this.aPreference_Sub28_8212.method12966((byte) -41));
		rsbytebuffer_2.writeByte(this.textures.method12873(2145197376));
		rsbytebuffer_2.writeByte(this.aPreference_Sub18_8214.getValue(-120460114));
		rsbytebuffer_2.writeByte(0);
		rsbytebuffer_2.writeByte(this.water.getValue());
		rsbytebuffer_2.writeByte(this.screenSize.method12687(416506379));
		rsbytebuffer_2.writeByte(this.customCursors.method12675());
		rsbytebuffer_2.writeByte(this.graphics.method12654());
		rsbytebuffer_2.writeByte(this.cpu.getValue());
		rsbytebuffer_2.writeByte(this.aPreference_Sub11_8217.method12699((byte) -71));
		rsbytebuffer_2.writeByte(this.safeMode.getValue((byte) -54));
		rsbytebuffer_2.writeByte(this.aPreference_Sub3_8199.method12632(793302253));
		rsbytebuffer_2.writeByte(this.aPreference_Sub13_8225.method12714());
		rsbytebuffer_2.writeByte(this.aPreference_Sub13_8193.method12714());
		rsbytebuffer_2.writeByte(this.aPreference_Sub13_8227.method12714());
		rsbytebuffer_2.writeByte(this.aPreference_Sub13_8228.method12714());
		rsbytebuffer_2.writeByte(this.aPreference_Sub13_8229.method12714());
		rsbytebuffer_2.writeByte(this.aPreference_Sub10_8215.method12691(-1240240085));
		return rsbytebuffer_2;
	}

	void method13502() {
		this.aPreference_Sub4_8187.method12639((byte) -35);
		this.aPreference_Sub4_8223.method12639((byte) -23);
		this.aPreference_Sub12_8195.method12703();
		this.aPreference_Sub21_8222.method12861();
		this.aPreference_Sub1_8197.method12616();
		this.aPreference_Sub16_8198.method12749();
		this.aPreference_Sub26_8224.method12941();
		this.fog.method13415();
		this.aPreference_Sub17_8200.method12767();
		this.aPreference_Sub23_8202.method12898();
		this.idleAnimations.method12741();
		this.aPreference_Sub19_8204.method12785();
		this.aPreference_Sub2_8205.method12627();
		this.aPreference_Sub29_8201.method13048();
		this.aPreference_Sub20_8207.method12793();
		this.aPreference_Sub27_8208.method12950(1301389562);
		this.aPreference_Sub27_8209.method12950(221369371);
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
		this.aPreference_Sub13_8225.method12712((byte) 114);
		this.aPreference_Sub13_8193.method12712((byte) 41);
		this.aPreference_Sub13_8227.method12712((byte) 85);
		this.aPreference_Sub13_8228.method12712((byte) 78);
		this.aPreference_Sub13_8229.method12712((byte) 16);
		this.aPreference_Sub10_8215.method12692();
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
