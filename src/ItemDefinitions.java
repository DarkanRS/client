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
	public int lendTemplateId;
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

	public final MeshRasterizer method7084(GraphicalRenderer renderer, int i, int i_0_, PlayerAppearance class238, Class456 class456, int i_1_, int i_2_, int i_3_, int i_4_, byte i_5_) {
		if (stackIds != null && i_0_ > 1) {
			int i_6_ = -1;
			for (int i_7_ = 0; i_7_ < 10; i_7_++) {
				if (i_0_ >= stackAmounts[i_7_] && 0 != stackAmounts[i_7_])
					i_6_ = stackIds[i_7_];
			}
			if (i_6_ != -1)
				return (loader.getItemDefinitions(i_6_, 1094056584).method7084(renderer, i, 1, class238, class456, i_1_, i_2_, i_3_, i_4_, (byte) 0));
		}
		int i_8_ = i;
		if (class456 != null)
			i_8_ |= class456.method7640(-1206237088);
		MeshRasterizer rasterizer;
		synchronized (((ItemIndexLoader) loader).aClass229_5115) {
			rasterizer = ((MeshRasterizer) (((ItemIndexLoader) loader).aClass229_5115.get((long) (1116898509 * id | renderer.rendererId * -413843045 << 29))));
		}
		if (null == rasterizer || renderer.method8452(rasterizer.m(), i_8_) != 0) {
			if (null != rasterizer)
				i_8_ = renderer.method8546(i_8_, rasterizer.m());
			int i_9_ = i_8_;
			if (originalTextures != null)
				i_9_ |= 0x8000;
			if (originalColors != null || class238 != null)
				i_9_ |= 0x4000;
			if (128 != resizeX * -1149583549)
				i_9_ |= 0x1;
			if (-1149583549 * resizeY != 128)
				i_9_ |= 0x2;
			if (resizeZ * -1149583549 != 128)
				i_9_ |= 0x4;
			RSMesh itemMesh = RSMesh.decodeMesh((((ItemIndexLoader) loader).meshIndex), (-1002877901 * modelId), 0);
			if (itemMesh == null)
				return null;
			if (itemMesh.zoom < 13)
				itemMesh.upscale(2);
			rasterizer = (renderer.createMeshRasterizer(itemMesh, i_9_, 924631903 * (((ItemIndexLoader) loader).anInt5116), 64 + ambient * -235550995, 850 + 1381934903 * contrast));
			if (128 != -1149583549 * resizeX || 128 != resizeY * -1507136321 || 128 != resizeZ * 256268633)
				rasterizer.oa(resizeX * -1149583549, resizeY * -1507136321, resizeZ * 256268633);
			if (null != originalColors) {
				for (int i_10_ = 0; i_10_ < originalColors.length; i_10_++) {
					if (spriteRecolorIndices != null && i_10_ < spriteRecolorIndices.length)
						rasterizer.X(originalColors[i_10_], (staticColorArr256[(spriteRecolorIndices[i_10_] & 0xff)]));
					else
						rasterizer.X(originalColors[i_10_], modifiedColors[i_10_]);
				}
			}
			if (originalTextures != null) {
				for (int i_11_ = 0; i_11_ < originalTextures.length; i_11_++)
					rasterizer.W(originalTextures[i_11_], modifiedTextures[i_11_]);
			}
			if (null != class238) {
				for (int i_12_ = 0; i_12_ < 10; i_12_++) {
					for (int i_13_ = 0; i_13_ < (AbstractQueue_Sub1.skinColors[i_12_]).length; i_13_++) {
						if (class238.colors[i_12_] < (Class366.skinColors[i_12_][i_13_]).length)
							rasterizer.X((AbstractQueue_Sub1.skinColors[i_12_][i_13_]), (Class366.skinColors[i_12_][i_13_][class238.colors[i_12_]]));
					}
				}
			}
			rasterizer.KA(i_8_);
			synchronized (((ItemIndexLoader) loader).aClass229_5115) {
				((ItemIndexLoader) loader).aClass229_5115.put(rasterizer, (long) (id * 1116898509 | renderer.rendererId * -413843045 << 29));
			}
		}
		if (null != class456 || 0 != i_4_) {
			rasterizer = rasterizer.method11289((byte) 1, i_8_, true);
			if (class456 != null)
				class456.method7577(rasterizer, 0, 16711935);
			if (i_4_ != 0)
				rasterizer.PA(i_1_, i_2_, i_3_, i_4_);
		}
		rasterizer.KA(i);
		return rasterizer;
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
		modelId = ((ItemDefinitions) class425_15_).modelId * 1;
		modelZoom = 1 * class425_15_.modelZoom;
		anInt5058 = 1 * class425_15_.anInt5058;
		anInt5045 = class425_15_.anInt5045 * 1;
		anInt5074 = 1 * class425_15_.anInt5074;
		anInt5063 = class425_15_.anInt5063 * 1;
		anInt5044 = 1 * class425_15_.anInt5044;
		originalColors = ((ItemDefinitions) class425_16_).originalColors;
		modifiedColors = ((ItemDefinitions) class425_16_).modifiedColors;
		spriteRecolorIndices = ((ItemDefinitions) class425_16_).spriteRecolorIndices;
		originalTextures = ((ItemDefinitions) class425_16_).originalTextures;
		modifiedTextures = ((ItemDefinitions) class425_16_).modifiedTextures;
		aString5043 = class425_16_.aString5043;
		members = class425_16_.members;
		anInt5047 = 1 * class425_16_.anInt5047;
		anInt5064 = 1 * class425_16_.anInt5064;
		anInt5065 = class425_16_.anInt5065 * 1;
		maleBody1 = 1 * ((ItemDefinitions) class425_16_).maleBody1;
		maleBody2 = 1 * ((ItemDefinitions) class425_16_).maleBody2;
		maleBody3 = ((ItemDefinitions) class425_16_).maleBody3 * 1;
		femaleBody1 = ((ItemDefinitions) class425_16_).femaleBody1 * 1;
		femaleBody2 = ((ItemDefinitions) class425_16_).femaleBody2 * 1;
		femaleBody3 = ((ItemDefinitions) class425_16_).femaleBody3 * 1;
		maleWearXOffset = 1 * ((ItemDefinitions) class425_16_).maleWearXOffset;
		femaleWearXOffset = ((ItemDefinitions) class425_16_).femaleWearXOffset * 1;
		maleWearYOffset = ((ItemDefinitions) class425_16_).maleWearYOffset * 1;
		femaleWearYOffset = 1 * ((ItemDefinitions) class425_16_).femaleWearYOffset;
		maleWearZOffset = 1 * ((ItemDefinitions) class425_16_).maleWearZOffset;
		femaleWearZOffset = ((ItemDefinitions) class425_16_).femaleWearZOffset * 1;
		maleHead1 = ((ItemDefinitions) class425_16_).maleHead1 * 1;
		maleHead2 = ((ItemDefinitions) class425_16_).maleHead2 * 1;
		femaleHead1 = ((ItemDefinitions) class425_16_).femaleHead1 * 1;
		femaleHead2 = ((ItemDefinitions) class425_16_).femaleHead2 * 1;
		team = class425_16_.team * 1;
		groundOptions = class425_16_.groundOptions;
		cs2Map = ((ItemDefinitions) class425_16_).cs2Map;
		anInt5049 = 1 * class425_16_.anInt5049;
		inventoryOptions = new String[5];
		if (null != class425_16_.inventoryOptions) {
			for (int i_17_ = 0; i_17_ < 4; i_17_++)
				inventoryOptions[i_17_] = class425_16_.inventoryOptions[i_17_];
		}
		inventoryOptions[4] = Message.aClass433_5166.translate((((ItemIndexLoader) (loader)).language), -2102685104);
	}

	void generateCert(ItemDefinitions class425_18_, ItemDefinitions class425_19_, int i) {
		modelId = 1 * ((ItemDefinitions) class425_18_).modelId;
		modelZoom = 1 * class425_18_.modelZoom;
		anInt5058 = 1 * class425_18_.anInt5058;
		anInt5045 = class425_18_.anInt5045 * 1;
		anInt5074 = class425_18_.anInt5074 * 1;
		anInt5063 = 1 * class425_18_.anInt5063;
		anInt5044 = class425_18_.anInt5044 * 1;
		originalColors = ((ItemDefinitions) class425_18_).originalColors;
		modifiedColors = ((ItemDefinitions) class425_18_).modifiedColors;
		spriteRecolorIndices = ((ItemDefinitions) class425_18_).spriteRecolorIndices;
		originalTextures = ((ItemDefinitions) class425_18_).originalTextures;
		modifiedTextures = ((ItemDefinitions) class425_18_).modifiedTextures;
		aString5043 = class425_19_.aString5043;
		members = class425_19_.members;
		anInt5051 = 1 * class425_19_.anInt5051;
		anInt5049 = -1948887511;
	}

	void method7089(RsByteBuffer class282_sub35, int i, int i_20_) {
		if (1 == i)
			modelId = class282_sub35.readBigSmart(2064304422) * 809144059;
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
			maleBody1 = class282_sub35.readBigSmart(2019249082) * -342249107;
		else if (24 == i)
			maleBody2 = class282_sub35.readBigSmart(2036288175) * 178028511;
		else if (i == 25)
			femaleBody1 = class282_sub35.readBigSmart(2091471186) * -1963342619;
		else if (26 == i)
			femaleBody2 = class282_sub35.readBigSmart(2001810199) * -691157025;
		else if (i == 27)
			anInt5065 = class282_sub35.readUnsignedByte() * -1540246871;
		else if (i >= 30 && i < 35)
			groundOptions[i - 30] = class282_sub35.readString(-383945926);
		else if (i >= 35 && i < 40)
			inventoryOptions[i - 35] = class282_sub35.readString(1233494937);
		else if (i == 40) {
			int i_21_ = class282_sub35.readUnsignedByte();
			originalColors = new short[i_21_];
			modifiedColors = new short[i_21_];
			for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
				originalColors[i_22_] = (short) class282_sub35.readUnsignedShort();
				modifiedColors[i_22_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (41 == i) {
			int i_23_ = class282_sub35.readUnsignedByte();
			originalTextures = new short[i_23_];
			modifiedTextures = new short[i_23_];
			for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
				originalTextures[i_24_] = (short) class282_sub35.readUnsignedShort();
				modifiedTextures[i_24_] = (short) class282_sub35.readUnsignedShort();
			}
		} else if (i == 42) {
			int i_25_ = class282_sub35.readUnsignedByte();
			spriteRecolorIndices = new byte[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
				spriteRecolorIndices[i_26_] = class282_sub35.readByte((short) -8308);
		} else if (i == 43) {
			anInt5102 = class282_sub35.readInt() * -796858641;
			aBool5101 = true;
		} else if (i == 65)
			grandExchange = true;
		else if (78 == i)
			maleBody3 = class282_sub35.readBigSmart(2006648786) * -2110709183;
		else if (79 == i)
			femaleBody3 = class282_sub35.readBigSmart(1954056541) * 1292119991;
		else if (90 == i)
			maleHead1 = class282_sub35.readBigSmart(2016946160) * -582979729;
		else if (91 == i)
			femaleHead1 = class282_sub35.readBigSmart(2097200271) * -1176241203;
		else if (i == 92)
			maleHead2 = class282_sub35.readBigSmart(2142001802) * -18677607;
		else if (i == 93)
			femaleHead2 = class282_sub35.readBigSmart(2139963180) * 1320781975;
		else if (i == 95)
			anInt5074 = class282_sub35.readUnsignedShort() * -1869642735;
		else if (96 == i)
			anInt5095 = class282_sub35.readUnsignedByte() * -676128457;
		else if (i == 97)
			certId = class282_sub35.readUnsignedShort() * 2048174935;
		else if (i == 98)
			certTemplateId = class282_sub35.readUnsignedShort() * 185661005;
		else if (i >= 100 && i < 110) {
			if (null == stackIds) {
				stackIds = new int[10];
				stackAmounts = new int[10];
			}
			stackIds[i - 100] = class282_sub35.readUnsignedShort();
			stackAmounts[i - 100] = class282_sub35.readUnsignedShort();
		} else if (i == 110)
			resizeX = class282_sub35.readUnsignedShort() * 1651983723;
		else if (i == 111)
			resizeY = class282_sub35.readUnsignedShort() * -868842689;
		else if (i == 112)
			resizeZ = class282_sub35.readUnsignedShort() * 1983536873;
		else if (i == 113)
			ambient = class282_sub35.readByte((short) -25769) * 259622629;
		else if (i == 114)
			contrast = class282_sub35.readByte((short) -9734) * 1423227043;
		else if (i == 115)
			team = class282_sub35.readUnsignedByte() * 1901746537;
		else if (121 == i)
			lendId = class282_sub35.readUnsignedShort() * -68529475;
		else if (122 == i)
			lendTemplateId = class282_sub35.readUnsignedShort() * -1862010471;
		else if (125 == i) {
			maleWearXOffset = ((class282_sub35.readByte((short) -30156) << 2) * 1904059659);
			maleWearYOffset = ((class282_sub35.readByte((short) -23127) << 2) * -547377553);
			maleWearZOffset = ((class282_sub35.readByte((short) -22740) << 2) * 1878832413);
		} else if (i == 126) {
			femaleWearXOffset = ((class282_sub35.readByte((short) -11885) << 2) * 1252496961);
			femaleWearYOffset = ((class282_sub35.readByte((short) -8708) << 2) * -377946013);
			femaleWearZOffset = ((class282_sub35.readByte((short) -26470) << 2) * 1444840851);
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
			bindId = class282_sub35.readUnsignedShort() * 1174980021;
		else if (i == 140)
			bindTemplateId = class282_sub35.readUnsignedShort() * 1638301585;
		else if (249 == i) {
			int i_29_ = class282_sub35.readUnsignedByte();
			if (null == cs2Map) {
				int i_30_ = Class323.nextPowerOfTwo(i_29_, -1837166011);
				cs2Map = new IterableNodeMap(i_30_);
			}
			for (int i_31_ = 0; i_31_ < i_29_; i_31_++) {
				boolean bool = class282_sub35.readUnsignedByte() == 1;
				int i_32_ = class282_sub35.read24BitUnsignedInteger((short) 19822);
				Node class282;
				if (bool)
					class282 = new Class282_Sub47(class282_sub35.readString(1641742655));
				else
					class282 = new Class282_Sub38(class282_sub35.readInt());
				cs2Map.method7765(class282, (long) i_32_);
			}
		}
	}

	public ItemDefinitions method7090(int i, byte i_33_) {
		if (stackIds != null && i > 1) {
			int i_34_ = -1;
			for (int i_35_ = 0; i_35_ < 10; i_35_++) {
				if (i >= stackAmounts[i_35_] && stackAmounts[i_35_] != 0)
					i_34_ = stackIds[i_35_];
			}
			if (-1 != i_34_)
				return loader.getItemDefinitions(i_34_, 1397135456);
		}
		return this;
	}

	int[] renderToSprite(GraphicalRenderer hardwareRenderer, GraphicalRenderer softwareRenderer, int amount, int outlineSize, int shadowColor, boolean zoomedIn, int i_47_, FontRenderer fontRenderer, PlayerAppearance playerAppearance, short i_48_) {
		RSMesh inventoryMesh = RSMesh.decodeMesh((((ItemIndexLoader) loader).meshIndex), -1002877901 * modelId, 0);
		if (inventoryMesh == null)
			return null;
		if (inventoryMesh.zoom < 13)
			inventoryMesh.upscale(2);
		if (null != originalColors) {
			for (int i_49_ = 0; i_49_ < originalColors.length; i_49_++) {
				if (null != spriteRecolorIndices && i_49_ < spriteRecolorIndices.length)
					inventoryMesh.recolor((originalColors[i_49_]), staticColorArr256[(spriteRecolorIndices[i_49_]) & 0xff]);
				else
					inventoryMesh.recolor((originalColors[i_49_]), (modifiedColors[i_49_]));
			}
		}
		if (null != originalTextures) {
			for (int i_50_ = 0; i_50_ < originalTextures.length; i_50_++)
				inventoryMesh.retexture(originalTextures[i_50_], modifiedTextures[i_50_]);
		}
		if (null != playerAppearance) {
			for (int i_51_ = 0; i_51_ < 10; i_51_++) {
				for (int i_52_ = 0; i_52_ < (AbstractQueue_Sub1.skinColors[i_51_]).length; i_52_++) {
					if (playerAppearance.colors[i_51_] < (Class366.skinColors[i_51_][i_52_]).length)
						inventoryMesh.recolor((AbstractQueue_Sub1.skinColors[i_51_][i_52_]), (Class366.skinColors[i_51_][i_52_][(playerAppearance.colors[i_51_])]));
				}
			}
		}
		int mask = 2048;
		boolean needResize = false;
		if (128 != resizeX * -1149583549 || resizeY * -1507136321 != 128 || 128 != 256268633 * resizeZ) {
			needResize = true;
			mask |= 0x7;
		}
		MeshRasterizer meshRasterizer = hardwareRenderer.createMeshRasterizer(inventoryMesh, mask, 64, (ambient * -235550995 + 64), (contrast * 1381934903 + 768));
		if (!meshRasterizer.successful())
			return null;
		if (needResize)
			meshRasterizer.oa(-1149583549 * resizeX, resizeY * -1507136321, 256268633 * resizeZ);
		NativeSprite sprite = null;
		if (-1 != certTemplateId * -722914683) {
			sprite = (loader.renderItemSprite(hardwareRenderer, softwareRenderer, certId * 1416589415, 10, 1, 0, true, true, 0, fontRenderer, playerAppearance, (byte) -12));
			if (sprite == null)
				return null;
		} else if (-1203090775 * lendTemplateId != -1) {
			sprite = (loader.renderItemSprite(hardwareRenderer, softwareRenderer, -14763883 * lendId, amount, outlineSize, shadowColor, false, true, 0, fontRenderer, playerAppearance, (byte) 63));
			if (sprite == null)
				return null;
		} else if (-1 != 370155889 * bindTemplateId) {
			sprite = (loader.renderItemSprite(hardwareRenderer, softwareRenderer, 224116893 * bindId, amount, outlineSize, shadowColor, false, true, 0, fontRenderer, playerAppearance, (byte) 12));
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
		if (-1 != lendTemplateId * -1203090775)
			sprite.method2752(0, 0);
		else if (bindTemplateId * 370155889 != -1)
			sprite.method2752(0, 0);
		hardwareRenderer.createNativeSprite(pixels, 0, 36, 36, 32, 1982525260).method2752(0, 0);
		if (certTemplateId * -722914683 != -1)
			sprite.method2752(0, 0);
		if (1 == i_47_ || 2 == i_47_ && (1 == anInt5049 * 318481945 || 1 != amount) && amount != -1)
			fontRenderer.renderText(Class304.colorifyItemAmount(amount, (((ItemIndexLoader) (loader)).language), (byte) 47), 0, 9, -256, -16777215, -418109423);
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

	public final boolean bodyMeshesReady(boolean female, MeshModifier modifier, int i) {
		int body1;
		int body2;
		int body3;
		if (female) {
			if (null != modifier && null != modifier.femaleBody) {
				body1 = modifier.femaleBody[0];
				body2 = modifier.femaleBody[1];
				body3 = modifier.femaleBody[2];
			} else {
				body1 = femaleBody1 * -2090968851;
				body2 = -1259031521 * femaleBody2;
				body3 = -1802576377 * femaleBody3;
			}
		} else if (modifier != null && null != modifier.maleBody) {
			body1 = modifier.maleBody[0];
			body2 = modifier.maleBody[1];
			body3 = modifier.maleBody[2];
		} else {
			body1 = -525270939 * maleBody1;
			body2 = -931922913 * maleBody2;
			body3 = maleBody3 * -562041407;
		}
		if (body1 == -1)
			return true;
		boolean hasMesh = true;
		if (!((ItemIndexLoader) loader).meshIndex.load(body1, 0, 16711935))
			hasMesh = false;
		if (body2 != -1 && !((ItemIndexLoader) loader).meshIndex.load(body2, 0, 16711935))
			hasMesh = false;
		if (body3 != -1 && !((ItemIndexLoader) loader).meshIndex.load(body3, 0, 16711935))
			hasMesh = false;
		return hasMesh;
	}

	public final RSMesh getBodyMesh(boolean female, MeshModifier modifier, int i) {
		int body1;
		int body2;
		int body3;
		if (female) {
			if (modifier != null && modifier.femaleBody != null) {
				body1 = modifier.femaleBody[0];
				body2 = modifier.femaleBody[1];
				body3 = modifier.femaleBody[2];
			} else {
				body1 = femaleBody1 * -2090968851;
				body2 = femaleBody2 * -1259031521;
				body3 = femaleBody3 * -1802576377;
			}
		} else if (modifier != null && null != modifier.maleBody) {
			body1 = modifier.maleBody[0];
			body2 = modifier.maleBody[1];
			body3 = modifier.maleBody[2];
		} else {
			body1 = -525270939 * maleBody1;
			body2 = -931922913 * maleBody2;
			body3 = -562041407 * maleBody3;
		}
		if (-1 == body1)
			return null;
		RSMesh body1Mesh = RSMesh.decodeMesh((((ItemIndexLoader) (loader)).meshIndex), body1, 0);
		if (body1Mesh == null)
			return null;
		if (body1Mesh.zoom < 13)
			body1Mesh.upscale(2);
		if (body2 != -1) {
			RSMesh body2Mesh = RSMesh.decodeMesh((((ItemIndexLoader) loader).meshIndex), body2, 0);
			if (body2Mesh.zoom < 13)
				body2Mesh.upscale(2);
			if (body3 != -1) {
				RSMesh body3Mesh = RSMesh.decodeMesh((((ItemIndexLoader) loader).meshIndex), body3, 0);
				if (body3Mesh.zoom < 13)
					body3Mesh.upscale(2);
				RSMesh[] class157s = { body1Mesh, body2Mesh, body3Mesh };
				body1Mesh = new RSMesh(class157s, 3);
			} else {
				RSMesh[] class157s = { body1Mesh, body2Mesh };
				body1Mesh = new RSMesh(class157s, 2);
			}
		}
		if (!female && (0 != -1021444445 * maleWearXOffset || -988581745 * maleWearYOffset != 0 || maleWearZOffset * 1784001845 != 0))
			body1Mesh.method2712(maleWearXOffset * -1021444445, -988581745 * maleWearYOffset, maleWearZOffset * 1784001845);
		if (female && (0 != -958170687 * femaleWearXOffset || femaleWearYOffset * -710311605 != 0 || 362438811 * femaleWearZOffset != 0))
			body1Mesh.method2712(femaleWearXOffset * -958170687, -710311605 * femaleWearYOffset, femaleWearZOffset * 362438811);
		if (originalColors != null) {
			short[] colMod;
			if (null != modifier && modifier.modifiedColors != null)
				colMod = modifier.modifiedColors;
			else
				colMod = modifiedColors;
			for (int i_76_ = 0; i_76_ < originalColors.length; i_76_++)
				body1Mesh.recolor(originalColors[i_76_], colMod[i_76_]);
		}
		if (originalTextures != null) {
			short[] texMod;
			if (null != modifier && null != modifier.modifiedTextures)
				texMod = modifier.modifiedTextures;
			else
				texMod = modifiedTextures;
			for (int i_77_ = 0; i_77_ < originalTextures.length; i_77_++)
				body1Mesh.retexture(originalTextures[i_77_], texMod[i_77_]);
		}
		return body1Mesh;
	}

	public final boolean headMeshesReady(boolean female, MeshModifier modifier, int i) {
		int head1;
		int head2;
		if (female) {
			if (modifier != null && null != modifier.femaleHeads) {
				head1 = modifier.femaleHeads[0];
				head2 = modifier.femaleHeads[1];
			} else {
				head1 = -1705416443 * femaleHead1;
				head2 = femaleHead2 * -1871546585;
			}
		} else if (null != modifier && null != modifier.maleHeads) {
			head1 = modifier.maleHeads[0];
			head2 = modifier.maleHeads[1];
		} else {
			head1 = maleHead1 * -603336817;
			head2 = maleHead2 * -613723223;
		}
		if (head1 == -1)
			return true;
		boolean hasMesh = true;
		if (!((ItemIndexLoader) loader).meshIndex.load(head1, 0, 16711935))
			hasMesh = false;
		if (-1 != head2 && !((ItemIndexLoader) loader).meshIndex.load(head2, 0, 16711935))
			hasMesh = false;
		return hasMesh;
	}

	public int method7099(int i, int i_81_, int i_82_) {
		if (cs2Map == null)
			return i_81_;
		Class282_Sub38 class282_sub38 = ((Class282_Sub38) cs2Map.method7754((long) i));
		if (null == class282_sub38)
			return i_81_;
		return -570797415 * class282_sub38.anInt8002;
	}

	public String method7101(int i, String string, int i_83_) {
		if (null == cs2Map)
			return string;
		Class282_Sub47 class282_sub47 = ((Class282_Sub47) cs2Map.method7754((long) i));
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
		maleBody1 = 342249107;
		maleBody2 = -178028511;
		femaleBody1 = 1963342619;
		femaleBody2 = 691157025;
		maleBody3 = 2110709183;
		femaleBody3 = -1292119991;
		maleWearXOffset = 0;
		femaleWearXOffset = 0;
		maleWearYOffset = 0;
		femaleWearYOffset = 0;
		maleWearZOffset = 0;
		femaleWearZOffset = 0;
		maleHead1 = 582979729;
		maleHead2 = 18677607;
		femaleHead1 = 1176241203;
		femaleHead2 = -1320781975;
		certId = -2048174935;
		certTemplateId = -185661005;
		lendId = 68529475;
		lendTemplateId = 1862010471;
		resizeX = 1000519040;
		resizeY = 457285504;
		resizeZ = 489649280;
		ambient = 0;
		contrast = 0;
		team = 0;
		grandExchange = false;
		anInt5095 = 0;
		anInt5098 = 0;
		bindId = -1174980021;
		bindTemplateId = -1638301585;
		aBool5101 = false;
	}

	public final RSMesh getHeadMesh(boolean bool, MeshModifier modifier, int i) {
		int head1;
		int head2;
		if (bool) {
			if (null != modifier && modifier.femaleHeads != null) {
				head1 = modifier.femaleHeads[0];
				head2 = modifier.femaleHeads[1];
			} else {
				head1 = femaleHead1 * -1705416443;
				head2 = femaleHead2 * -1871546585;
			}
		} else if (modifier != null && null != modifier.maleHeads) {
			head1 = modifier.maleHeads[0];
			head2 = modifier.maleHeads[1];
		} else {
			head1 = -603336817 * maleHead1;
			head2 = maleHead2 * -613723223;
		}
		if (head1 == -1)
			return null;
		RSMesh head1Mesh = RSMesh.decodeMesh((((ItemIndexLoader) (loader)).meshIndex), head1, 0);
		if (head1Mesh.zoom < 13)
			head1Mesh.upscale(2);
		if (-1 != head2) {
			RSMesh head2Mesh = RSMesh.decodeMesh((((ItemIndexLoader) loader).meshIndex), head2, 0);
			if (head2Mesh.zoom < 13)
				head2Mesh.upscale(2);
			RSMesh[] heads = { head1Mesh, head2Mesh };
			head1Mesh = new RSMesh(heads, 2);
		}
		if (null != originalColors) {
			short[] colMod;
			if (null != modifier && modifier.modifiedColors != null)
				colMod = modifier.modifiedColors;
			else
				colMod = modifiedColors;
			for (int i_209_ = 0; i_209_ < originalColors.length; i_209_++)
				head1Mesh.recolor(originalColors[i_209_], colMod[i_209_]);
		}
		if (originalTextures != null) {
			short[] texMod;
			if (modifier != null && null != modifier.modifiedTextures)
				texMod = modifier.modifiedTextures;
			else
				texMod = modifiedTextures;
			for (int i_210_ = 0; i_210_ < originalTextures.length; i_210_++)
				head1Mesh.retexture(originalTextures[i_210_], texMod[i_210_]);
		}
		return head1Mesh;
	}

	void generateLend(ItemDefinitions class425_217_, ItemDefinitions class425_218_, int i) {
		anInt5051 = 0;
		modelId = 1 * ((ItemDefinitions) class425_217_).modelId;
		modelZoom = class425_217_.modelZoom * 1;
		anInt5058 = 1 * class425_217_.anInt5058;
		anInt5045 = 1 * class425_217_.anInt5045;
		anInt5074 = 1 * class425_217_.anInt5074;
		anInt5063 = class425_217_.anInt5063 * 1;
		anInt5044 = 1 * class425_217_.anInt5044;
		originalColors = ((ItemDefinitions) class425_218_).originalColors;
		modifiedColors = ((ItemDefinitions) class425_218_).modifiedColors;
		spriteRecolorIndices = ((ItemDefinitions) class425_218_).spriteRecolorIndices;
		originalTextures = ((ItemDefinitions) class425_218_).originalTextures;
		modifiedTextures = ((ItemDefinitions) class425_218_).modifiedTextures;
		aString5043 = class425_218_.aString5043;
		members = class425_218_.members;
		anInt5047 = 1 * class425_218_.anInt5047;
		anInt5064 = 1 * class425_218_.anInt5064;
		anInt5065 = class425_218_.anInt5065 * 1;
		maleBody1 = 1 * ((ItemDefinitions) class425_218_).maleBody1;
		maleBody2 = 1 * ((ItemDefinitions) class425_218_).maleBody2;
		maleBody3 = ((ItemDefinitions) class425_218_).maleBody3 * 1;
		femaleBody1 = 1 * ((ItemDefinitions) class425_218_).femaleBody1;
		femaleBody2 = 1 * ((ItemDefinitions) class425_218_).femaleBody2;
		femaleBody3 = 1 * ((ItemDefinitions) class425_218_).femaleBody3;
		maleWearXOffset = 1 * ((ItemDefinitions) class425_218_).maleWearXOffset;
		femaleWearXOffset = ((ItemDefinitions) class425_218_).femaleWearXOffset * 1;
		maleWearYOffset = 1 * ((ItemDefinitions) class425_218_).maleWearYOffset;
		femaleWearYOffset = ((ItemDefinitions) class425_218_).femaleWearYOffset * 1;
		maleWearZOffset = ((ItemDefinitions) class425_218_).maleWearZOffset * 1;
		femaleWearZOffset = 1 * ((ItemDefinitions) class425_218_).femaleWearZOffset;
		maleHead1 = ((ItemDefinitions) class425_218_).maleHead1 * 1;
		maleHead2 = ((ItemDefinitions) class425_218_).maleHead2 * 1;
		femaleHead1 = ((ItemDefinitions) class425_218_).femaleHead1 * 1;
		femaleHead2 = 1 * ((ItemDefinitions) class425_218_).femaleHead2;
		team = class425_218_.team * 1;
		groundOptions = class425_218_.groundOptions;
		cs2Map = ((ItemDefinitions) class425_218_).cs2Map;
		inventoryOptions = new String[5];
		if (null != class425_218_.inventoryOptions) {
			for (int i_219_ = 0; i_219_ < 4; i_219_++)
				inventoryOptions[i_219_] = class425_218_.inventoryOptions[i_219_];
		}
		inventoryOptions[4] = Message.aClass433_5165.translate((((ItemIndexLoader) (loader)).language), -898798531);
	}

	static final void method7140(Animable class521_sub1_sub1_sub2, Animable class521_sub1_sub1_sub2_243_, int i, int i_244_, int i_245_, int i_246_, int i_247_, int i_248_, int i_249_, byte i_250_) {
		int i_251_ = class521_sub1_sub1_sub2_243_.method15899(-525246876);
		if (-1 != i_251_) {
			Object object = null;
			NativeSprite class160 = (NativeSprite) client.aClass229_7204.get((long) i_251_);
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
