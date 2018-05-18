/* Class425 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class ItemDefinitions implements Interface46 {
	public int anInt5030;
	public int anInt5031;
	int resizeY;
	ItemIndexLoader loader;
	int id;
	int modelId;
	byte[] spriteRecolorIndices;
	short[] originalColors;
	short[] modifiedColors;
	IterableNodeMap cs2Map;
	short[] originalTextures;
	public int modelZoom;
	public String aString5043 = "null";
	public int anInt5044;
	public int anInt5045;
	public int bindTemplateId;
	public int anInt5047;
	int lendId;
	public int anInt5049;
	public int anInt5050;
	public int anInt5051;
	public boolean members;
	public String[] groundOptions;
	public String[] inventoryOptions;
	public int anInt5055;
	public int anInt5056;
	public int anInt5058;
	public int anInt5059;
	public int anInt5060;
	public int anInt5061;
	public int anInt5062;
	public int anInt5063;
	public int anInt5064;
	public int anInt5065;
	int maleBody1;
	int ambient;
	public int landTemplateId;
	int femaleBody2;
	int maleBody3;
	int femaleBody3;
	int[] stackAmounts;
	int femaleWearXOffset;
	public int anInt5074;
	int femaleBody1;
	int maleWearZOffset;
	int femaleWearZOffset;
	public int certTemplateId;
	int maleHead2;
	int femaleHead1;
	int femaleHead2;
	int[] stackIds;
	short[] modifiedTextures;
	public int certId;
	public boolean grandExchange;
	public static short[] staticColorArr256 = new short[256];
	int resizeX;
	int maleWearXOffset;
	int resizeZ;
	int femaleWearYOffset;
	int contrast;
	public int team;
	int maleWearYOffset;
	public int anInt5095;
	int maleHead1;
	public int[] quests;
	public int anInt5098;
	int bindId;
	int maleBody2;
	public boolean aBool5101;
	public int anInt5102;

	public final MeshRasterizer method7084(GraphicalRenderer class505, int i, int i_0_, PlayerAppearance class238, Class456 class456, int i_1_, int i_2_, int i_3_, int i_4_, byte i_5_) {
		if (this.stackIds != null && i_0_ > 1) {
			int i_6_ = -1;
			for (int i_7_ = 0; i_7_ < 10; i_7_++) {
				if (i_0_ >= this.stackAmounts[i_7_] && 0 != this.stackAmounts[i_7_])
					i_6_ = this.stackIds[i_7_];
			}
			if (i_6_ != -1)
				return (this.loader.getItemDefinitions(i_6_, 1094056584).method7084(class505, i, 1, class238, class456, i_1_, i_2_, i_3_, i_4_, (byte) 0));
		}
		int i_8_ = i;
		if (class456 != null)
			i_8_ |= class456.method7640(-1206237088);
		MeshRasterizer class528;
		synchronized (((ItemIndexLoader) this.loader).aClass229_5115) {
			class528 = ((MeshRasterizer) (((ItemIndexLoader) this.loader).aClass229_5115.method3865((long) (1116898509 * this.id | class505.rendererId * -413843045 << 29))));
		}
		if (null == class528 || class505.method8452(class528.m(), i_8_) != 0) {
			if (null != class528)
				i_8_ = class505.method8546(i_8_, class528.m());
			int i_9_ = i_8_;
			if (this.originalTextures != null)
				i_9_ |= 0x8000;
			if (this.originalColors != null || class238 != null)
				i_9_ |= 0x4000;
			if (128 != this.resizeX * -1149583549)
				i_9_ |= 0x1;
			if (-1149583549 * this.resizeX != 128)
				i_9_ |= 0x2;
			if (this.resizeX * -1149583549 != 128)
				i_9_ |= 0x4;
			RSMesh class157 = RSMesh.decodeMesh((((ItemIndexLoader) this.loader).meshIndex), (-1002877901 * this.modelId), 0);
			if (class157 == null)
				return null;
			if (class157.zoom < 13)
				class157.upscale(2);
			class528 = (class505.createMeshRasterizer(class157, i_9_, 924631903 * (((ItemIndexLoader) this.loader).anInt5116), 64 + this.ambient * -235550995, 850 + 1381934903 * this.contrast));
			if (128 != -1149583549 * this.resizeX || 128 != this.resizeY * -1507136321 || 128 != this.resizeZ * 256268633)
				class528.oa(this.resizeX * -1149583549, this.resizeY * -1507136321, this.resizeZ * 256268633);
			if (null != this.originalColors) {
				for (int i_10_ = 0; i_10_ < this.originalColors.length; i_10_++) {
					if (this.spriteRecolorIndices != null && i_10_ < this.spriteRecolorIndices.length)
						class528.X(this.originalColors[i_10_], (staticColorArr256[(this.spriteRecolorIndices[i_10_] & 0xff)]));
					else
						class528.X(this.originalColors[i_10_], this.modifiedColors[i_10_]);
				}
			}
			if (this.originalTextures != null) {
				for (int i_11_ = 0; i_11_ < this.originalTextures.length; i_11_++)
					class528.W(this.originalTextures[i_11_], this.modifiedTextures[i_11_]);
			}
			if (null != class238) {
				for (int i_12_ = 0; i_12_ < 10; i_12_++) {
					for (int i_13_ = 0; i_13_ < (AbstractQueue_Sub1.SKIN_COLORS[i_12_]).length; i_13_++) {
						if (class238.colors[i_12_] < (Class366.SKIN_COLORS[i_12_][i_13_]).length)
							class528.X((AbstractQueue_Sub1.SKIN_COLORS[i_12_][i_13_]), (Class366.SKIN_COLORS[i_12_][i_13_][class238.colors[i_12_]]));
					}
				}
			}
			class528.KA(i_8_);
			synchronized (((ItemIndexLoader) this.loader).aClass229_5115) {
				((ItemIndexLoader) this.loader).aClass229_5115.put(class528, (long) (this.id * 1116898509 | class505.rendererId * -413843045 << 29));
			}
		}
		if (null != class456 || 0 != i_4_) {
			class528 = class528.method11289((byte) 1, i_8_, true);
			if (class456 != null)
				class456.method7577(class528, 0, 16711935);
			if (i_4_ != 0)
				class528.PA(i_1_, i_2_, i_3_, i_4_);
		}
		class528.KA(i);
		return class528;
	}

	void postDecode(int i) {
		/* empty */
	}

	void decode(RsByteBuffer class282_sub35, int i) {
		for (;;) {
			int i_14_ = class282_sub35.readUnsignedByte();
			if (0 == i_14_)
				break;
			method7089(class282_sub35, i_14_, 1695857075);
		}
	}

	void generateBind(ItemDefinitions class425_15_, ItemDefinitions class425_16_, int i) {
		anInt5051 = 0;
		this.modelId = ((ItemDefinitions) class425_15_).modelId * 1;
		modelZoom = 1 * class425_15_.modelZoom;
		anInt5058 = 1 * class425_15_.anInt5058;
		anInt5045 = class425_15_.anInt5045 * 1;
		anInt5074 = 1 * class425_15_.anInt5074;
		anInt5063 = class425_15_.anInt5063 * 1;
		anInt5044 = 1 * class425_15_.anInt5044;
		this.originalColors = ((ItemDefinitions) class425_16_).originalColors;
		this.modifiedColors = ((ItemDefinitions) class425_16_).modifiedColors;
		this.spriteRecolorIndices = ((ItemDefinitions) class425_16_).spriteRecolorIndices;
		this.originalTextures = ((ItemDefinitions) class425_16_).originalTextures;
		this.modifiedTextures = ((ItemDefinitions) class425_16_).modifiedTextures;
		aString5043 = class425_16_.aString5043;
		members = class425_16_.members;
		anInt5047 = 1 * class425_16_.anInt5047;
		anInt5064 = 1 * class425_16_.anInt5064;
		anInt5065 = class425_16_.anInt5065 * 1;
		this.maleBody1 = 1 * ((ItemDefinitions) class425_16_).maleBody1;
		this.maleBody2 = 1 * ((ItemDefinitions) class425_16_).maleBody2;
		this.maleBody3 = ((ItemDefinitions) class425_16_).maleBody3 * 1;
		this.femaleBody1 = ((ItemDefinitions) class425_16_).femaleBody1 * 1;
		this.femaleBody2 = ((ItemDefinitions) class425_16_).femaleBody2 * 1;
		this.femaleBody3 = ((ItemDefinitions) class425_16_).femaleBody3 * 1;
		this.maleWearXOffset = 1 * ((ItemDefinitions) class425_16_).maleWearXOffset;
		this.femaleWearXOffset = ((ItemDefinitions) class425_16_).femaleWearXOffset * 1;
		this.maleWearYOffset = ((ItemDefinitions) class425_16_).maleWearYOffset * 1;
		this.femaleWearYOffset = 1 * ((ItemDefinitions) class425_16_).femaleWearYOffset;
		this.maleWearZOffset = 1 * ((ItemDefinitions) class425_16_).maleWearZOffset;
		this.femaleWearZOffset = ((ItemDefinitions) class425_16_).femaleWearZOffset * 1;
		this.maleHead1 = ((ItemDefinitions) class425_16_).maleHead1 * 1;
		this.maleHead2 = ((ItemDefinitions) class425_16_).maleHead2 * 1;
		this.femaleHead1 = ((ItemDefinitions) class425_16_).femaleHead1 * 1;
		this.femaleHead2 = ((ItemDefinitions) class425_16_).femaleHead2 * 1;
		team = class425_16_.team * 1;
		groundOptions = class425_16_.groundOptions;
		this.cs2Map = ((ItemDefinitions) class425_16_).cs2Map;
		anInt5049 = 1 * class425_16_.anInt5049;
		inventoryOptions = new String[5];
		if (null != class425_16_.inventoryOptions) {
			for (int i_17_ = 0; i_17_ < 4; i_17_++)
				inventoryOptions[i_17_] = class425_16_.inventoryOptions[i_17_];
		}
		inventoryOptions[4] = Message.aClass433_5166.translate((((ItemIndexLoader) (this.loader)).language), -2102685104);
	}

	void generateCert(ItemDefinitions class425_18_, ItemDefinitions class425_19_, int i) {
		this.modelId = 1 * ((ItemDefinitions) class425_18_).modelId;
		modelZoom = 1 * class425_18_.modelZoom;
		anInt5058 = 1 * class425_18_.anInt5058;
		anInt5045 = class425_18_.anInt5045 * 1;
		anInt5074 = class425_18_.anInt5074 * 1;
		anInt5063 = 1 * class425_18_.anInt5063;
		anInt5044 = class425_18_.anInt5044 * 1;
		this.originalColors = ((ItemDefinitions) class425_18_).originalColors;
		this.modifiedColors = ((ItemDefinitions) class425_18_).modifiedColors;
		this.spriteRecolorIndices = ((ItemDefinitions) class425_18_).spriteRecolorIndices;
		this.originalTextures = ((ItemDefinitions) class425_18_).originalTextures;
		this.modifiedTextures = ((ItemDefinitions) class425_18_).modifiedTextures;
		aString5043 = class425_19_.aString5043;
		members = class425_19_.members;
		anInt5051 = 1 * class425_19_.anInt5051;
		anInt5049 = -1948887511;
	}

	void method7089(RsByteBuffer class282_sub35, int i, int i_20_) {
		if (1 == i)
			this.modelId = class282_sub35.readBigSmart(2064304422) * 809144059;
		else if (i == 2)
			aString5043 = class282_sub35.readString(1760674316);
		else if (i == 4)
			modelZoom = class282_sub35.readUnsignedShort() * 292917833;
		else if (i == 5)
			anInt5058 = class282_sub35.readUnsignedShort() * 492453963;
		else if (6 == i)
			anInt5045 = class282_sub35.readUnsignedShort() * 619430641;
		else if (i == 7) {
			anInt5063 = class282_sub35.readUnsignedShort() * 834650329;
			if (406372201 * anInt5063 > 32767)
				anInt5063 -= -1059520512;
		} else if (8 == i) {
			anInt5044 = class282_sub35.readUnsignedShort() * 870855977;
			if (-1316014311 * anInt5044 > 32767)
				anInt5044 -= 891879424;
		} else if (11 == i)
			anInt5049 = -1948887511;
		else if (i == 12)
			anInt5051 = class282_sub35.readInt() * 222766991;
		else if (i == 13)
			anInt5047 = class282_sub35.readUnsignedByte() * -1946123025;
		else if (14 == i)
			anInt5064 = class282_sub35.readUnsignedByte() * -247957423;
		else if (i == 16)
			members = true;
		else if (i == 18)
			anInt5050 = class282_sub35.readUnsignedShort() * -173634739;
		else if (23 == i)
			this.maleBody1 = class282_sub35.readBigSmart(2019249082) * -342249107;
		else if (24 == i)
			this.maleBody2 = class282_sub35.readBigSmart(2036288175) * 178028511;
		else if (i == 25)
			this.femaleBody1 = class282_sub35.readBigSmart(2091471186) * -1963342619;
		else if (26 == i)
			this.femaleBody2 = class282_sub35.readBigSmart(2001810199) * -691157025;
		else if (i == 27)
			anInt5065 = class282_sub35.readUnsignedByte() * -1540246871;
		else if (i >= 30 && i < 35)
			groundOptions[i - 30] = class282_sub35.readString(-383945926);
		else if (i >= 35 && i < 40)
			inventoryOptions[i - 35] = class282_sub35.readString(1233494937);
		else if (i == 40) {
			int i_21_ = class282_sub35.readUnsignedByte();
			this.originalColors = new short[i_21_];
			this.modifiedColors = new short[i_21_];
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
				this.originalColors[i_22_] = (short) class282_sub35.readUnsignedShort();
				this.modifiedColors[i_22_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_23_ = class282_sub35.readUnsignedByte();
			this.originalTextures = new short[i_23_];
			this.modifiedTextures = new short[i_23_];
			for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
				this.originalTextures[i_24_] = (short) class282_sub35.readUnsignedShort();
				this.modifiedTextures[i_24_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_25_ = class282_sub35.readUnsignedByte();
			this.spriteRecolorIndices = new byte[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
				this.spriteRecolorIndices[i_26_] = class282_sub35.readByte((short) -8308);
		} else if (i == 43) {
			anInt5102 = class282_sub35.readInt() * -796858641;
			aBool5101 = true;
		} else if (i == 65)
			grandExchange = true;
		else if (78 == i)
			this.maleBody3 = class282_sub35.readBigSmart(2006648786) * -2110709183;
		else if (79 == i)
			this.femaleBody3 = class282_sub35.readBigSmart(1954056541) * 1292119991;
		else if (90 == i)
			this.maleHead1 = class282_sub35.readBigSmart(2016946160) * -582979729;
		else if (91 == i)
			this.femaleHead1 = class282_sub35.readBigSmart(2097200271) * -1176241203;
		else if (i == 92)
			this.maleHead2 = class282_sub35.readBigSmart(2142001802) * -18677607;
		else if (i == 93)
			this.femaleHead2 = class282_sub35.readBigSmart(2139963180) * 1320781975;
		else if (i == 95)
			anInt5074 = class282_sub35.readUnsignedShort() * -1869642735;
		else if (96 == i)
			anInt5095 = class282_sub35.readUnsignedByte() * -676128457;
		else if (i == 97)
			certId = class282_sub35.readUnsignedShort() * 2048174935;
		else if (i == 98)
			certTemplateId = class282_sub35.readUnsignedShort() * 185661005;
		else if (i >= 100 && i < 110) {
			if (null == this.stackIds) {
				this.stackIds = new int[10];
				this.stackAmounts = new int[10];
			}
			this.stackIds[i - 100] = class282_sub35.readUnsignedShort();
			this.stackAmounts[i - 100] = class282_sub35.readUnsignedShort();
		} else if (i == 110)
			this.resizeX = class282_sub35.readUnsignedShort() * 1651983723;
		else if (i == 111)
			this.resizeY = class282_sub35.readUnsignedShort() * -868842689;
		else if (i == 112)
			this.resizeZ = class282_sub35.readUnsignedShort() * 1983536873;
		else if (i == 113)
			this.ambient = class282_sub35.readByte((short) -25769) * 259622629;
		else if (i == 114)
			this.contrast = class282_sub35.readByte((short) -9734) * 1423227043;
		else if (i == 115)
			team = class282_sub35.readUnsignedByte() * 1901746537;
		else if (121 == i)
			this.lendId = class282_sub35.readUnsignedShort() * -68529475;
		else if (122 == i)
			landTemplateId = class282_sub35.readUnsignedShort() * -1862010471;
		else if (125 == i) {
			this.maleWearXOffset = ((class282_sub35.readByte((short) -30156) << 2) * 1904059659);
			this.maleWearYOffset = ((class282_sub35.readByte((short) -23127) << 2) * -547377553);
			this.maleWearZOffset = ((class282_sub35.readByte((short) -22740) << 2) * 1878832413);
		} else if (i == 126) {
			this.femaleWearXOffset = ((class282_sub35.readByte((short) -11885) << 2) * 1252496961);
			this.femaleWearYOffset = ((class282_sub35.readByte((short) -8708) << 2) * -377946013);
			this.femaleWearZOffset = ((class282_sub35.readByte((short) -26470) << 2) * 1444840851);
		} else if (127 == i) {
			anInt5059 = class282_sub35.readUnsignedByte() * 1898017081;
			anInt5055 = class282_sub35.readUnsignedShort() * -1370939175;
		} else if (i == 128) {
			anInt5060 = class282_sub35.readUnsignedByte() * 930264291;
			anInt5056 = class282_sub35.readUnsignedShort() * 2036382095;
		} else if (i == 129) {
			anInt5061 = class282_sub35.readUnsignedByte() * -1908691611;
			anInt5062 = class282_sub35.readUnsignedShort() * 988221655;
		} else if (i == 130) {
			anInt5030 = class282_sub35.readUnsignedByte() * -1151562079;
			anInt5031 = class282_sub35.readUnsignedShort() * -149100495;
		} else if (132 == i) {
			int i_27_ = class282_sub35.readUnsignedByte();
			quests = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				quests[i_28_] = class282_sub35.readUnsignedShort();
		} else if (i == 134)
			anInt5098 = class282_sub35.readUnsignedByte() * -179097779;
		else if (i == 139)
			this.bindId = class282_sub35.readUnsignedShort() * 1174980021;
		else if (i == 140)
			bindTemplateId = class282_sub35.readUnsignedShort() * 1638301585;
		else if (249 == i) {
			int i_29_ = class282_sub35.readUnsignedByte();
			if (null == this.cs2Map) {
				int i_30_ = Class323.nextPowerOfTwo(i_29_, -1837166011);
				this.cs2Map = new IterableNodeMap(i_30_);
			}
			for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_32_ = class282_sub35.read24BitUnsignedInteger((short) 19822);
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(1641742655));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				this.cs2Map.method7765(class282, (long) i_32_);
			}
		}
	}

	public ItemDefinitions method7090(int i, byte i_33_) {
		if (this.stackIds != null && i > 1) {
			int i_34_ = -1;
			for (int i_35_ = 0; i_35_ < 10; i_35_++) {
				if (i >= this.stackAmounts[i_35_] && this.stackAmounts[i_35_] != 0)
					i_34_ = this.stackIds[i_35_];
			}
			if (-1 != i_34_)
				return this.loader.getItemDefinitions(i_34_, 1397135456);
		}
		return this;
	}

	int[] renderToSprite(GraphicalRenderer hardwareRenderer, GraphicalRenderer softwareRenderer, int amount, int outlineSize, int shadowColor, boolean zoomedIn, int i_47_, FontRenderer fontRenderer, PlayerAppearance playerAppearance, short i_48_) {
		RSMesh inventoryMesh = RSMesh.decodeMesh((((ItemIndexLoader) this.loader).meshIndex), -1002877901 * this.modelId, 0);
		if (inventoryMesh == null)
			return null;
		if (inventoryMesh.zoom < 13)
			inventoryMesh.upscale(2);
		if (null != this.originalColors) {
			for (int i = 0; i < this.originalColors.length; i++) {
				if (null != this.spriteRecolorIndices && i < this.spriteRecolorIndices.length)
					inventoryMesh.recolor((this.originalColors[i]), staticColorArr256[(this.spriteRecolorIndices[i]) & 0xff]);
				else
					inventoryMesh.recolor((this.originalColors[i]), (this.modifiedColors[i]));
			}
		}
		if (null != this.originalTextures) {
			for (int i = 0; i < this.originalTextures.length; i++)
				inventoryMesh.retexture(this.originalTextures[i], this.modifiedTextures[i]);
		}
		if (null != playerAppearance) {
			for (int i = 0; i < 10; i++) {
				for (int i_52_ = 0; i_52_ < (AbstractQueue_Sub1.SKIN_COLORS[i]).length; i_52_++) {
					if (playerAppearance.colors[i] < (Class366.SKIN_COLORS[i][i_52_]).length)
						inventoryMesh.recolor((AbstractQueue_Sub1.SKIN_COLORS[i][i_52_]), (Class366.SKIN_COLORS[i][i_52_][(playerAppearance.colors[i])]));
				}
			}
		}
		int mask = 2048;
		boolean needsResize = false;
		if (128 != this.resizeX * -1149583549 || this.resizeY * -1507136321 != 128 || 128 != 256268633 * this.resizeZ) {
			needsResize = true;
			mask |= 0x7;
		}
		MeshRasterizer meshRasterizer = hardwareRenderer.createMeshRasterizer(inventoryMesh, mask, 64, (this.ambient * -235550995 + 64), (this.contrast * 1381934903 + 768));
		if (!meshRasterizer.successful())
			return null;
		if (needsResize)
			meshRasterizer.oa(-1149583549 * this.resizeX, this.resizeY * -1507136321, 256268633 * this.resizeZ);
		NativeSprite sprite = null;
		if (-1 != certTemplateId * -722914683) {
			sprite = (this.loader.renderItemSprite(hardwareRenderer, softwareRenderer, certId * 1416589415, 10, 1, 0, true, true, 0, fontRenderer, playerAppearance, (byte) -12));
			if (sprite == null)
				return null;
		} else if (-1203090775 * landTemplateId != -1) {
			sprite = (this.loader.renderItemSprite(hardwareRenderer, softwareRenderer, -14763883 * this.lendId, amount, outlineSize, shadowColor, false, true, 0, fontRenderer, playerAppearance, (byte) 63));
			if (sprite == null)
				return null;
		} else if (-1 != 370155889 * bindTemplateId) {
			sprite = (this.loader.renderItemSprite(hardwareRenderer, softwareRenderer, 224116893 * this.bindId, amount, outlineSize, shadowColor, false, true, 0, fontRenderer, playerAppearance, (byte) 12));
			if (null == sprite)
				return null;
		}
		int zoom;
		if (zoomedIn)
			zoom = (int) (1.5 * (double) (modelZoom * -1468071943)) << 2;
		else if (outlineSize == 2)
			zoom = (int) ((double) (modelZoom * -1468071943) * 1.04) << 2;
		else
			zoom = modelZoom * -1468071943 << 2;
		Class384 class384 = hardwareRenderer.method8453();
		Class384 class384_56_ = hardwareRenderer.method8449();
		class384_56_.method6531(16.0F, 16.0F, 512.0F, 512.0F, 50.0F, 2.14748365E9F, (float) hardwareRenderer.method8523((byte) 121).method2714(), (float) hardwareRenderer.method8523((byte) 111).method2716());
		hardwareRenderer.method8424(class384_56_);
		hardwareRenderer.method8617(0, 0, hardwareRenderer.method8523((byte) 122).method2714(), hardwareRenderer.method8523((byte) 122).method2716());
		Class294 class294 = new Class294();
		hardwareRenderer.method8457(class294);
		hardwareRenderer.IA(0.95F + (float) (Math.random() / 10.0));
		hardwareRenderer.m(16777215, 0.95F + (float) (Math.random() / 10.0), 0.95F + (float) (Math.random() / 10.0), -50.0F, -10.0F, -50.0F);
		Class294 class294_57_ = hardwareRenderer.method8450();
		class294_57_.method5217(0.0F, 0.0F, 1.0F, Class382.method6508(-(anInt5074 * 701885681) << 3));
		class294_57_.method5220(0.0F, 1.0F, 0.0F, Class382.method6508(920448529 * anInt5045 << 3));
		class294_57_.method5219((float) (406372201 * anInt5063 << 2), (float) (((zoom * (Class382.anIntArray4657[1752402275 * anInt5058 << 3])) >> 14) - meshRasterizer.YA() / 2 + (-1316014311 * anInt5044 << 2)), (float) ((((Class382.anIntArray4661[anInt5058 * 1752402275 << 3]) * zoom) >> 14) + (-1316014311 * anInt5044 << 2)));
		class294_57_.method5220(1.0F, 0.0F, 0.0F, Class382.method6508(1752402275 * anInt5058 << 3));
		hardwareRenderer.r(0, 0, 36, 32);
		hardwareRenderer.ba(2, 0);
		hardwareRenderer.B(0, 0, 36, 32, 0, 0);
		hardwareRenderer.c(0, -1, 0);
		meshRasterizer.method11282(class294_57_, null, 1);
		hardwareRenderer.method8424(class384);
		int[] pixels = hardwareRenderer.ab(0, 0, 36, 32);
		if (outlineSize >= 1) {
			pixels = addOutlines(pixels, -16777214, (byte) -98);
			if (outlineSize >= 2)
				pixels = addOutlines(pixels, -1, (byte) -71);
		}
		if (shadowColor != 0)
			addShadow(pixels, shadowColor, (byte) -34);
		if (-1 != landTemplateId * -1203090775)
			sprite.method2752(0, 0);
		else if (bindTemplateId * 370155889 != -1)
			sprite.method2752(0, 0);
		hardwareRenderer.createNativeSprite(pixels, 0, 36, 36, 32, 1982525260).method2752(0, 0);
		if (certTemplateId * -722914683 != -1)
			sprite.method2752(0, 0);
		if (1 == i_47_ || 2 == i_47_ && (1 == anInt5049 * 318481945 || 1 != amount) && amount != -1)
			fontRenderer.renderText(Class304.method5407(amount, (((ItemIndexLoader) (this.loader)).language), (byte) 47), 0, 9, -256, -16777215, -418109423);
		pixels = hardwareRenderer.ab(0, 0, 36, 32);
		for (int i_58_ = 0; i_58_ < pixels.length; i_58_++) {
			if ((pixels[i_58_] & 0xffffff) == 0)
				pixels[i_58_] = 0;
			else
				pixels[i_58_] |= ~0xffffff;
		}
		return pixels;
	}

	void addShadow(int[] is, int i, byte i_63_) {
		for (int i_64_ = 31; i_64_ > 0; i_64_--) {
			int i_65_ = i_64_ * 36;
			for (int i_66_ = 35; i_66_ > 0; i_66_--) {
				if (0 == is[i_66_ + i_65_] && is[i_66_ + i_65_ - 1 - 36] != 0)
					is[i_65_ + i_66_] = i;
			}
		}
	}

	public final boolean method7096(boolean bool, MeshModifier class422, int i) {
		int i_67_;
		int i_68_;
		int i_69_;
		if (bool) {
			if (null != class422 && null != class422.femaleBody) {
				i_67_ = class422.femaleBody[0];
				i_68_ = class422.femaleBody[1];
				i_69_ = class422.femaleBody[2];
			} else {
				i_67_ = this.femaleBody1 * -2090968851;
				i_68_ = -1259031521 * this.femaleBody2;
				i_69_ = -1802576377 * this.femaleBody3;
			}
		} else if (class422 != null && null != class422.maleBody) {
			i_67_ = class422.maleBody[0];
			i_68_ = class422.maleBody[1];
			i_69_ = class422.maleBody[2];
		} else {
			i_67_ = -525270939 * this.maleBody1;
			i_68_ = -931922913 * this.maleBody2;
			i_69_ = this.maleBody3 * -562041407;
		}
		if (i_67_ == -1)
			return true;
		boolean bool_70_ = true;
		if (!((ItemIndexLoader) this.loader).meshIndex.method5688(i_67_, 0, 16711935))
			bool_70_ = false;
		if (i_68_ != -1 && !((ItemIndexLoader) this.loader).meshIndex.method5688(i_68_, 0, 16711935))
			bool_70_ = false;
		if (i_69_ != -1 && !((ItemIndexLoader) this.loader).meshIndex.method5688(i_69_, 0, 16711935))
			bool_70_ = false;
		return bool_70_;
	}

	public final RSMesh method7097(boolean bool, MeshModifier class422, int i) {
		int i_71_;
		int i_72_;
		int i_73_;
		if (bool) {
			if (class422 != null && class422.femaleBody != null) {
				i_71_ = class422.femaleBody[0];
				i_72_ = class422.femaleBody[1];
				i_73_ = class422.femaleBody[2];
			} else {
				i_71_ = this.femaleBody1 * -2090968851;
				i_72_ = this.femaleBody2 * -1259031521;
				i_73_ = this.femaleBody3 * -1802576377;
			}
		} else if (class422 != null && null != class422.maleBody) {
			i_71_ = class422.maleBody[0];
			i_72_ = class422.maleBody[1];
			i_73_ = class422.maleBody[2];
		} else {
			i_71_ = -525270939 * this.maleBody1;
			i_72_ = -931922913 * this.maleBody2;
			i_73_ = -562041407 * this.maleBody3;
		}
		if (-1 == i_71_)
			return null;
		RSMesh class157 = RSMesh.decodeMesh((((ItemIndexLoader) (this.loader)).meshIndex), i_71_, 0);
		if (class157 == null)
			return null;
		if (class157.zoom < 13)
			class157.upscale(2);
		if (i_72_ != -1) {
			RSMesh class157_74_ = RSMesh.decodeMesh((((ItemIndexLoader) this.loader).meshIndex), i_72_, 0);
			if (class157_74_.zoom < 13)
				class157_74_.upscale(2);
			if (i_73_ != -1) {
				RSMesh class157_75_ = RSMesh.decodeMesh((((ItemIndexLoader) this.loader).meshIndex), i_73_, 0);
				if (class157_75_.zoom < 13)
					class157_75_.upscale(2);
				RSMesh[] class157s = { class157, class157_74_, class157_75_ };
				class157 = new RSMesh(class157s, 3);
			} else {
				RSMesh[] class157s = { class157, class157_74_ };
				class157 = new RSMesh(class157s, 2);
			}
		}
		if (!bool && (0 != -1021444445 * this.maleWearXOffset || -988581745 * this.maleWearYOffset != 0 || this.maleWearZOffset * 1784001845 != 0))
			class157.method2712(this.maleWearXOffset * -1021444445, -988581745 * this.maleWearYOffset, this.maleWearZOffset * 1784001845);
		if (bool && (0 != -958170687 * this.femaleWearXOffset || this.femaleWearYOffset * -710311605 != 0 || 362438811 * this.femaleWearZOffset != 0))
			class157.method2712(this.femaleWearXOffset * -958170687, -710311605 * this.femaleWearYOffset, this.femaleWearZOffset * 362438811);
		if (this.originalColors != null) {
			short[] is;
			if (null != class422 && class422.modifiedColors != null)
				is = class422.modifiedColors;
			else
				is = this.modifiedColors;
			for (int i_76_ = 0; i_76_ < this.originalColors.length; i_76_++)
				class157.recolor(this.originalColors[i_76_], is[i_76_]);
		}
		if (this.originalTextures != null) {
			short[] is;
			if (null != class422 && null != class422.modifiedTextures)
				is = class422.modifiedTextures;
			else
				is = this.modifiedTextures;
			for (int i_77_ = 0; i_77_ < this.originalTextures.length; i_77_++)
				class157.retexture(this.originalTextures[i_77_], is[i_77_]);
		}
		return class157;
	}

	public final boolean method7098(boolean bool, MeshModifier class422, int i) {
		int i_78_;
		int i_79_;
		if (bool) {
			if (class422 != null && null != class422.femaleHeads) {
				i_78_ = class422.femaleHeads[0];
				i_79_ = class422.femaleHeads[1];
			} else {
				i_78_ = -1705416443 * this.femaleHead1;
				i_79_ = this.femaleHead2 * -1871546585;
			}
		} else if (null != class422 && null != class422.maleHeads) {
			i_78_ = class422.maleHeads[0];
			i_79_ = class422.maleHeads[1];
		} else {
			i_78_ = this.maleHead1 * -603336817;
			i_79_ = this.maleHead2 * -613723223;
		}
		if (i_78_ == -1)
			return true;
		boolean bool_80_ = true;
		if (!((ItemIndexLoader) this.loader).meshIndex.method5688(i_78_, 0, 16711935))
			bool_80_ = false;
		if (-1 != i_79_ && !((ItemIndexLoader) this.loader).meshIndex.method5688(i_79_, 0, 16711935))
			bool_80_ = false;
		return bool_80_;
	}

	public int method7099(int i, int i_81_, int i_82_) {
		if (this.cs2Map == null)
			return i_81_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) this.cs2Map.method7754((long) i));
		if (null == class282_sub38)
			return i_81_;
		return -570797415 * class282_sub38.anInt8002;
	}

	public String method7101(int i, String string, int i_83_) {
		if (null == this.cs2Map)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) this.cs2Map.method7754((long) i));
		if (class282_sub47 == null)
			return string;
		return (String) class282_sub47.anObject8068;
	}

	int[] addOutlines(int[] is, int i, byte i_163_) {
		int[] is_164_ = new int[1152];
		int i_165_ = 0;
		for (int i_166_ = 0; i_166_ < 32; i_166_++) {
			for (int i_167_ = 0; i_167_ < 36; i_167_++) {
				int i_168_ = is[i_165_];
				if (0 == i_168_) {
					if (i_167_ > 0 && is[i_165_ - 1] != 0)
						i_168_ = i;
					else if (i_166_ > 0 && 0 != is[i_165_ - 36])
						i_168_ = i;
					else if (i_167_ < 35 && is[i_165_ + 1] != 0)
						i_168_ = i;
					else if (i_166_ < 31 && is[i_165_ + 36] != 0)
						i_168_ = i;
				}
				is_164_[i_165_++] = i_168_;
			}
		}
		return is_164_;
	}

	ItemDefinitions() {
		modelZoom = 1720113744;
		anInt5058 = 0;
		anInt5045 = 0;
		anInt5074 = 0;
		anInt5063 = 0;
		anInt5044 = 0;
		anInt5049 = 0;
		anInt5050 = 173634739;
		anInt5051 = 222766991;
		members = false;
		anInt5055 = 1370939175;
		anInt5056 = -2036382095;
		anInt5062 = -988221655;
		anInt5031 = 149100495;
		anInt5059 = -1898017081;
		anInt5060 = -930264291;
		anInt5061 = 1908691611;
		anInt5030 = 1151562079;
		anInt5047 = 1946123025;
		anInt5064 = 247957423;
		anInt5065 = 1540246871;
		this.maleBody1 = 342249107;
		this.maleBody2 = -178028511;
		this.femaleBody1 = 1963342619;
		this.femaleBody2 = 691157025;
		this.maleBody3 = 2110709183;
		this.femaleBody3 = -1292119991;
		this.maleWearXOffset = 0;
		this.femaleWearXOffset = 0;
		this.maleWearYOffset = 0;
		this.femaleWearYOffset = 0;
		this.maleWearZOffset = 0;
		this.femaleWearZOffset = 0;
		this.maleHead1 = 582979729;
		this.maleHead2 = 18677607;
		this.femaleHead1 = 1176241203;
		this.femaleHead2 = -1320781975;
		certId = -2048174935;
		certTemplateId = -185661005;
		this.lendId = 68529475;
		landTemplateId = 1862010471;
		this.resizeX = 1000519040;
		this.resizeY = 457285504;
		this.resizeZ = 489649280;
		this.ambient = 0;
		this.contrast = 0;
		team = 0;
		grandExchange = false;
		anInt5095 = 0;
		anInt5098 = 0;
		this.bindId = -1174980021;
		bindTemplateId = -1638301585;
		aBool5101 = false;
	}

	public final RSMesh method7130(boolean bool, MeshModifier class422, int i) {
		int i_206_;
		int i_207_;
		if (bool) {
			if (null != class422 && class422.femaleHeads != null) {
				i_206_ = class422.femaleHeads[0];
				i_207_ = class422.femaleHeads[1];
			} else {
				i_206_ = this.femaleHead1 * -1705416443;
				i_207_ = this.femaleHead2 * -1871546585;
			}
		} else if (class422 != null && null != class422.maleHeads) {
			i_206_ = class422.maleHeads[0];
			i_207_ = class422.maleHeads[1];
		} else {
			i_206_ = -603336817 * this.maleHead1;
			i_207_ = this.maleHead2 * -613723223;
		}
		if (i_206_ == -1)
			return null;
		RSMesh class157 = RSMesh.decodeMesh((((ItemIndexLoader) (this.loader)).meshIndex), i_206_, 0);
		if (class157.zoom < 13)
			class157.upscale(2);
		if (-1 != i_207_) {
			RSMesh class157_208_ = RSMesh.decodeMesh((((ItemIndexLoader) this.loader).meshIndex), i_207_, 0);
			if (class157_208_.zoom < 13)
				class157_208_.upscale(2);
			RSMesh[] class157s = { class157, class157_208_ };
			class157 = new RSMesh(class157s, 2);
		}
		if (null != this.originalColors) {
			short[] is;
			if (null != class422 && class422.modifiedColors != null)
				is = class422.modifiedColors;
			else
				is = this.modifiedColors;
			for (int i_209_ = 0; i_209_ < this.originalColors.length; i_209_++)
				class157.recolor(this.originalColors[i_209_], is[i_209_]);
		}
		if (this.originalTextures != null) {
			short[] is;
			if (class422 != null && null != class422.modifiedTextures)
				is = class422.modifiedTextures;
			else
				is = this.modifiedTextures;
			for (int i_210_ = 0; i_210_ < this.originalTextures.length; i_210_++)
				class157.retexture(this.originalTextures[i_210_], is[i_210_]);
		}
		return class157;
	}

	void generateLend(ItemDefinitions class425_217_, ItemDefinitions class425_218_, int i) {
		anInt5051 = 0;
		this.modelId = 1 * ((ItemDefinitions) class425_217_).modelId;
		modelZoom = class425_217_.modelZoom * 1;
		anInt5058 = 1 * class425_217_.anInt5058;
		anInt5045 = 1 * class425_217_.anInt5045;
		anInt5074 = 1 * class425_217_.anInt5074;
		anInt5063 = class425_217_.anInt5063 * 1;
		anInt5044 = 1 * class425_217_.anInt5044;
		this.originalColors = ((ItemDefinitions) class425_218_).originalColors;
		this.modifiedColors = ((ItemDefinitions) class425_218_).modifiedColors;
		this.spriteRecolorIndices = ((ItemDefinitions) class425_218_).spriteRecolorIndices;
		this.originalTextures = ((ItemDefinitions) class425_218_).originalTextures;
		this.modifiedTextures = ((ItemDefinitions) class425_218_).modifiedTextures;
		aString5043 = class425_218_.aString5043;
		members = class425_218_.members;
		anInt5047 = 1 * class425_218_.anInt5047;
		anInt5064 = 1 * class425_218_.anInt5064;
		anInt5065 = class425_218_.anInt5065 * 1;
		this.maleBody1 = 1 * ((ItemDefinitions) class425_218_).maleBody1;
		this.maleBody2 = 1 * ((ItemDefinitions) class425_218_).maleBody2;
		this.maleBody3 = ((ItemDefinitions) class425_218_).maleBody3 * 1;
		this.femaleBody1 = 1 * ((ItemDefinitions) class425_218_).femaleBody1;
		this.femaleBody2 = 1 * ((ItemDefinitions) class425_218_).femaleBody2;
		this.femaleBody3 = 1 * ((ItemDefinitions) class425_218_).femaleBody3;
		this.maleWearXOffset = 1 * ((ItemDefinitions) class425_218_).maleWearXOffset;
		this.femaleWearXOffset = ((ItemDefinitions) class425_218_).femaleWearXOffset * 1;
		this.maleWearYOffset = 1 * ((ItemDefinitions) class425_218_).maleWearYOffset;
		this.femaleWearYOffset = ((ItemDefinitions) class425_218_).femaleWearYOffset * 1;
		this.maleWearZOffset = ((ItemDefinitions) class425_218_).maleWearZOffset * 1;
		this.femaleWearZOffset = 1 * ((ItemDefinitions) class425_218_).femaleWearZOffset;
		this.maleHead1 = ((ItemDefinitions) class425_218_).maleHead1 * 1;
		this.maleHead2 = ((ItemDefinitions) class425_218_).maleHead2 * 1;
		this.femaleHead1 = ((ItemDefinitions) class425_218_).femaleHead1 * 1;
		this.femaleHead2 = 1 * ((ItemDefinitions) class425_218_).femaleHead2;
		team = class425_218_.team * 1;
		groundOptions = class425_218_.groundOptions;
		this.cs2Map = ((ItemDefinitions) class425_218_).cs2Map;
		inventoryOptions = new String[5];
		if (null != class425_218_.inventoryOptions) {
			for (int i_219_ = 0; i_219_ < 4; i_219_++)
				inventoryOptions[i_219_] = class425_218_.inventoryOptions[i_219_];
		}
		inventoryOptions[4] = Message.aClass433_5165.translate((((ItemIndexLoader) (this.loader)).language), -898798531);
	}

	static final void method7140(Animable class521_sub1_sub1_sub2, Animable class521_sub1_sub1_sub2_243_, int i, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_, byte i_250_) {
		int i_251_ = class521_sub1_sub1_sub2_243_.method15899(-525246876);
		if (-1 != i_251_) {
			Object object = null;
			NativeSprite class160 = (NativeSprite) client.aClass229_7204.method3865((long) i_251_);
			if (class160 == null) {
				Class91[] class91s = Class91.method1514(Class211.aClass317_2673, i_251_, 0);
				if (null == class91s)
					return;
				class160 = Class316.aClass505_3680.method8444(class91s[0], true);
				client.aClass229_7204.put(class160, (long) i_251_);
			}
			Class385 class385 = class521_sub1_sub1_sub2.method11166().aClass385_3595;
			Class210.method3612(class521_sub1_sub1_sub2.aByte7967, (int) class385.aFloat4671, (int) class385.aFloat4673, (class521_sub1_sub1_sub2.method15805(828768449) * 256), 0, false, (byte) 2);
			int i_252_ = (int) ((float) i_244_ + client.aFloatArray7292[0] - 18.0F);
			int i_253_ = (int) ((float) i_245_ + client.aFloatArray7292[1] - 16.0F - 54.0F);
			i_252_ += 18 * (i / 4);
			i_253_ += i % 4 * 18;
			class160.method2752(i_252_, i_253_);
			if (class521_sub1_sub1_sub2 == class521_sub1_sub1_sub2_243_)
				Class316.aClass505_3680.method8562(i_252_ - 1, i_253_ - 1, 18, 18, -256, (byte) 4);
			Class275_Sub2 class275_sub2 = Class3.method286(2086923872);
			((Class275_Sub2) class275_sub2).aClass521_Sub1_Sub1_Sub2_7739 = class521_sub1_sub1_sub2_243_;
			((Class275_Sub2) class275_sub2).anInt7742 = -945313559 * i_252_;
			((Class275_Sub2) class275_sub2).anInt7743 = -1731479375 * i_253_;
			((Class275_Sub2) class275_sub2).anInt7744 = (16 + i_252_) * 164907185;
			((Class275_Sub2) class275_sub2).anInt7740 = 1753364739 * (16 + i_253_);
			client.aClass457_7290.method7649(class275_sub2, 1174204485);
		}
	}

	public static void method7141(int i, byte i_254_) {
		Class329.method5906(i, -464275916);
	}

	static final void method7142(Class118 class118, Class98 class98, CS2Executor class527, int i) {
		class118.aBool1420 = ((((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]) == 1);
		Class109.method1858(class118, (byte) 53);
	}

	static final void method7143(CS2Executor class527, int i) {
		((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 += 141891001) * 1942118537 - 1] = Class393.aClass282_Sub54_4783.aClass468_Sub13_8229.method12714(-988664751);
	}
}
