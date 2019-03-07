import java.io.File;
import java.io.IOException;

public class ObjectDefinitions {

	public int id;
	public String[] options;
	ObjectIndexLoader loader;
	public static short[] aShortArray5691 = new short[256];
	public byte[] types;
	public int[][] modelIds;
	public String name = "null";
	public int sizeX = 1;
	public int sizeY = 1;
	public int clipType = 2;
	public boolean projectileClipped = true;
	public int interactable = -1;
	byte groundContoured = 0;
	public boolean delayShading = false;
	public int occludes = -1;
	int[] animations = null;
	public int decorDisplacement = 64;
	int ambient = 0;
	int contrast = 0;
	short[] originalColors;
	public short[] modifiedColors;
	short[] originalTextures;
	public short[] modifiedTextures;
	byte[] aByteArray5641;
	public boolean inverted = false;
	public boolean castsShadow = true;
	int scaleX = 128;
	int scaleY = 128;
	int scaleZ = 128;
	int offsetX = 0;
	int offsetY = 0;
	int offsetZ = 0;
	public boolean obstructsGround = false;
	public boolean gateway = false;
	public int supportsItems = -1;
	int configFileId = -1;
	int configId = -1;
	public int ambientSoundId = -1;
	public int ambientSoundHearDistance = 0;
	public int anInt5667 = 0;
	public int anInt5698 = 0;
	public int[] audioTracks;
	public int[] toObjectIds;
	int anInt5654 = -1;
	public boolean hidden = false;
	public boolean aBool5703 = true;
	public boolean aBool5702 = true;
	public boolean members = false;
	public boolean adjustMapSceneRotation = false;
	public boolean hasAnimation = false;
	public int anInt5705 = -1;
	public int anInt5665 = -1;
	public int anInt5670 = -1;
	public int anInt5666 = -1;
	public int mapSpriteRotation = 0;
	public int mapSpriteId = -1;
	public int ambientSoundVolume = 255;
	public boolean flipMapSprite = false;
	int[] animProbs = null;
	public int mapIcon = -1;
	public int[] anIntArray5707;
	byte aByte5644;
	byte aByte5642;
	byte aByte5646;
	byte aByte5634 = 0;
	int anInt5682 = 0;
	int anInt5683 = 0;
	int anInt5710 = 0;
	public int anInt5704 = 0;
	public boolean aBool5696 = false;
	public boolean aBool5700 = false;
	public int anInt5684 = 960;
	public int anInt5658 = 0;
	public int anInt5708 = 256;
	public int anInt5709 = 256;
	public boolean aBool5699 = false;
	public int anInt5694 = 0;
	public boolean aBool5711 = false;
	IterableNodeMap aClass465_5668;

	public int method7963(int i_1, int i_2, int i_3) {
		if (this.aClass465_5668 == null) {
			return i_2;
		} else {
			Class282_Sub38 class282_sub38_4 = (Class282_Sub38) this.aClass465_5668.get((long) i_1);
			return class282_sub38_4 == null ? i_2 : class282_sub38_4.anInt8002;
		}
	}

	void method7964(RsByteBuffer rsbytebuffer_1, byte b_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method7965(rsbytebuffer_1, i_3, -421182854);
		}
	}

	void method7965(RsByteBuffer buffer, int opcode, int i_3) {
		int i_4;
		int i_5;
		int i_6;
		int i_7;
		if (opcode == 1) {
			i_4 = buffer.readUnsignedByte();
			this.types = new byte[i_4];
			this.modelIds = new int[i_4][];

			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.types[i_5] = buffer.readByte();
				i_6 = buffer.readUnsignedByte();
				this.modelIds[i_5] = new int[i_6];

				for (i_7 = 0; i_7 < i_6; i_7++) {
					this.modelIds[i_5][i_7] = buffer.readBigSmart();
				}
			}
		} else if (opcode == 2) {
			this.name = buffer.readString();
		} else if (opcode == 14) {
			this.sizeX = buffer.readUnsignedByte();
		} else if (opcode == 15) {
			this.sizeY = buffer.readUnsignedByte();
		} else if (opcode == 17) {
			this.clipType = 0;
			this.projectileClipped = false;
		} else if (opcode == 18) {
			this.projectileClipped = false;
		} else if (opcode == 19) {
			this.interactable = buffer.readUnsignedByte();
		} else if (opcode == 21) {
			this.groundContoured = 1;
		} else if (opcode == 22) {
			this.delayShading = true;
		} else if (opcode == 23) {
			this.occludes = 1;
		} else if (opcode == 24) {
			i_4 = buffer.readBigSmart();
			if (i_4 != -1) {
				this.animations = new int[] { i_4 };
			}
		} else if (opcode == 27) {
			this.clipType = 1;
		} else if (opcode == 28) {
			this.decorDisplacement = buffer.readUnsignedByte() << 2;
		} else if (opcode == 29) {
			this.ambient = buffer.readByte();
		} else if (opcode == 39) {
			this.contrast = buffer.readByte() * 5;
		} else if (opcode >= 30 && opcode < 35) {
			this.options[opcode - 30] = buffer.readString();
		} else if (opcode == 40) {
			i_4 = buffer.readUnsignedByte();
			this.originalColors = new short[i_4];
			this.modifiedColors = new short[i_4];

			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.originalColors[i_5] = (short) buffer.readUnsignedShort();
				this.modifiedColors[i_5] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 41) {
			i_4 = buffer.readUnsignedByte();
			this.originalTextures = new short[i_4];
			this.modifiedTextures = new short[i_4];

			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.originalTextures[i_5] = (short) buffer.readUnsignedShort();
				this.modifiedTextures[i_5] = (short) buffer.readUnsignedShort();
			}
		} else if (opcode == 42) {
			i_4 = buffer.readUnsignedByte();
			this.aByteArray5641 = new byte[i_4];

			for (i_5 = 0; i_5 < i_4; i_5++) {
				this.aByteArray5641[i_5] = buffer.readByte();
			}
		} else if (opcode == 62) {
			this.inverted = true;
		} else if (opcode == 64) {
			this.castsShadow = false;
		} else if (opcode == 65) {
			this.scaleX = buffer.readUnsignedShort();
		} else if (opcode == 66) {
			this.scaleY = buffer.readUnsignedShort();
		} else if (opcode == 67) {
			this.scaleZ = buffer.readUnsignedShort();
		} else if (opcode == 69) {
			buffer.readUnsignedByte();
		} else if (opcode == 70) {
			this.offsetX = buffer.readShort() << 2;
		} else if (opcode == 71) {
			this.offsetY = buffer.readShort() << 2;
		} else if (opcode == 72) {
			this.offsetZ = buffer.readShort() << 2;
		} else if (opcode == 73) {
			this.obstructsGround = true;
		} else if (opcode == 74) {
			this.gateway = true;
		} else if (opcode == 75) {
			this.supportsItems = buffer.readUnsignedByte();
		} else if (opcode != 77 && opcode != 92) {
			if (opcode == 78) {
				this.ambientSoundId = buffer.readUnsignedShort();
				this.ambientSoundHearDistance = buffer.readUnsignedByte();
			} else if (opcode == 79) {
				this.anInt5667 = buffer.readUnsignedShort();
				this.anInt5698 = buffer.readUnsignedShort();
				this.ambientSoundHearDistance = buffer.readUnsignedByte();
				i_4 = buffer.readUnsignedByte();
				this.audioTracks = new int[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.audioTracks[i_5] = buffer.readUnsignedShort();
				}
			} else if (opcode == 81) {
				this.groundContoured = 2;
				this.anInt5654 = buffer.readUnsignedByte() * 256;
			} else if (opcode == 82) {
				this.hidden = true;
			} else if (opcode == 88) {
				this.aBool5703 = false;
			} else if (opcode == 89) {
				this.aBool5702 = false;
			} else if (opcode == 91) {
				this.members = true;
			} else if (opcode == 93) {
				this.groundContoured = 3;
				this.anInt5654 = buffer.readUnsignedShort();
			} else if (opcode == 94) {
				this.groundContoured = 4;
			} else if (opcode == 95) {
				this.groundContoured = 5;
				this.anInt5654 = buffer.readShort();
			} else if (opcode == 97) {
				this.adjustMapSceneRotation = true;
			} else if (opcode == 98) {
				this.hasAnimation = true;
			} else if (opcode == 99) {
				this.anInt5705 = buffer.readUnsignedByte();
				this.anInt5665 = buffer.readUnsignedShort();
			} else if (opcode == 100) {
				this.anInt5670 = buffer.readUnsignedByte();
				this.anInt5666 = buffer.readUnsignedShort();
			} else if (opcode == 101) {
				this.mapSpriteRotation = buffer.readUnsignedByte();
			} else if (opcode == 102) {
				this.mapSpriteId = buffer.readUnsignedShort();
			} else if (opcode == 103) {
				this.occludes = 0;
			} else if (opcode == 104) {
				this.ambientSoundVolume = buffer.readUnsignedByte();
			} else if (opcode == 105) {
				this.flipMapSprite = true;
			} else if (opcode == 106) {
				i_4 = buffer.readUnsignedByte();
				i_5 = 0;
				this.animations = new int[i_4];
				this.animProbs = new int[i_4];

				for (i_6 = 0; i_6 < i_4; i_6++) {
					this.animations[i_6] = buffer.readBigSmart();
					i_5 += this.animProbs[i_6] = buffer.readUnsignedByte();
				}

				for (i_6 = 0; i_6 < i_4; i_6++) {
					this.animProbs[i_6] = this.animProbs[i_6] * 65535 / i_5;
				}
			} else if (opcode == 107) {
				this.mapIcon = buffer.readUnsignedShort();
			} else if (opcode >= 150 && opcode < 155) {
				this.options[opcode - 150] = buffer.readString();
				if (!this.loader.showOptions) {
					this.options[opcode - 150] = null;
				}
			} else if (opcode == 160) {
				i_4 = buffer.readUnsignedByte();
				this.anIntArray5707 = new int[i_4];

				for (i_5 = 0; i_5 < i_4; i_5++) {
					this.anIntArray5707[i_5] = buffer.readUnsignedShort();
				}
			} else if (opcode == 162) {
				this.groundContoured = 3;
				this.anInt5654 = buffer.readInt();
			} else if (opcode == 163) {
				this.aByte5644 = buffer.readByte();
				this.aByte5642 = buffer.readByte();
				this.aByte5646 = buffer.readByte();
				this.aByte5634 = buffer.readByte();
			} else if (opcode == 164) {
				this.anInt5682 = buffer.readShort();
			} else if (opcode == 165) {
				this.anInt5683 = buffer.readShort();
			} else if (opcode == 166) {
				this.anInt5710 = buffer.readShort();
			} else if (opcode == 167) {
				this.anInt5704 = buffer.readUnsignedShort();
			} else if (opcode == 168) {
				this.aBool5696 = true;
			} else if (opcode == 169) {
				this.aBool5700 = true;
			} else if (opcode == 170) {
				this.anInt5684 = buffer.readUnsignedSmart(1632519186);
			} else if (opcode == 171) {
				this.anInt5658 = buffer.readUnsignedSmart(1916118902);
			} else if (opcode == 173) {
				this.anInt5708 = buffer.readUnsignedShort();
				this.anInt5709 = buffer.readUnsignedShort();
			} else if (opcode == 177) {
				this.aBool5699 = true;
			} else if (opcode == 178) {
				this.anInt5694 = buffer.readUnsignedByte();
			} else if (opcode == 189) {
				this.aBool5711 = true;
			} else if (opcode == 249) {
				i_4 = buffer.readUnsignedByte();
				if (this.aClass465_5668 == null) {
					i_5 = Class323.nextPowerOfTwo(i_4, -1920576994);
					this.aClass465_5668 = new IterableNodeMap(i_5);
				}

				for (i_5 = 0; i_5 < i_4; i_5++) {
					boolean bool_9 = buffer.readUnsignedByte() == 1;
					i_7 = buffer.read24BitUnsignedInteger();
					Object obj_8;
					if (bool_9) {
						obj_8 = new Class282_Sub47(buffer.readString());
					} else {
						obj_8 = new Class282_Sub38(buffer.readInt());
					}

					this.aClass465_5668.put((Node) obj_8, (long) i_7);
				}
			}
		} else {
			this.configFileId = buffer.readUnsignedShort();
			if (this.configFileId == 65535) {
				this.configFileId = -1;
			}

			this.configId = buffer.readUnsignedShort();
			if (this.configId == 65535) {
				this.configId = -1;
			}

			i_4 = -1;
			if (opcode == 92) {
				i_4 = buffer.readBigSmart();
			}

			i_5 = buffer.readUnsignedByte();
			this.toObjectIds = new int[i_5 + 2];

			for (i_6 = 0; i_6 <= i_5; i_6++) {
				this.toObjectIds[i_6] = buffer.readBigSmart();
			}

			this.toObjectIds[i_5 + 1] = i_4;
		}

	}

	void method7966(int i_1) {
		if (this.interactable == -1) {
			this.interactable = 0;
			if (this.types != null && this.types.length == 1 && this.types[0] == SceneObjectType.SCENERY_INTERACT.type) {
				this.interactable = 1;
			}

			for (int i_2 = 0; i_2 < 5; i_2++) {
				if (this.options[i_2] != null) {
					this.interactable = 1;
					break;
				}
			}
		}

		if (this.supportsItems == -1) {
			this.supportsItems = this.clipType != 0 ? 1 : 0;
		}

		if (this.method7967((byte) 39) || this.hasAnimation || this.toObjectIds != null) {
			this.aBool5699 = true;
		}

	}

	public boolean method7967(byte b_1) {
		return this.animations != null;
	}

	public final boolean method7968(int i_1) {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean bool_2 = true;
			Index index_3 = this.loader.meshIndex;
			synchronized (this.loader.meshIndex) {
				for (int i_4 = 0; i_4 < this.modelIds.length; i_4++) {
					for (int i_5 = 0; i_5 < this.modelIds[i_4].length; i_5++) {
						bool_2 &= this.loader.meshIndex.load(this.modelIds[i_4][i_5], 0);
					}
				}

				return bool_2;
			}
		}
	}

	MeshRasterizer method7971(GraphicalRenderer class505, int i, int i_35_, int i_36_, Class476 class476, int i_37_) {
		int i_38_ = 64 + ((ObjectDefinitions) this).ambient;
		int i_39_ = 850 + ((ObjectDefinitions) this).contrast;
		int i_40_ = i;
		boolean bool = inverted || i_35_ == (SceneObjectType.WALL_WHOLE_CORNER.type) && i_36_ > 3;
		if (bool)
			i |= 0x10;
		if (0 == i_36_) {
			if (128 != ((ObjectDefinitions) this).scaleX || 0 != ((ObjectDefinitions) this).offsetX)
				i |= 0x1;
			if (128 != ((ObjectDefinitions) this).scaleZ || ((ObjectDefinitions) this).offsetZ != 0)
				i |= 0x4;
		} else
			i |= 0xd;
		if (((ObjectDefinitions) this).scaleY != 128 || ((ObjectDefinitions) this).offsetY != 0)
			i |= 0x2;
		if (null != ((ObjectDefinitions) this).originalColors)
			i |= 0x4000;
		if (((ObjectDefinitions) this).originalTextures != null)
			i |= 0x8000;
		if (0 != ((ObjectDefinitions) this).aByte5634)
			i |= 0x80000;
		MeshRasterizer class528 = null;
		if (types != null) {
			int i_41_ = -1;
			for (int i_42_ = 0; i_42_ < types.length; i_42_++) {
				if (i_35_ == types[i_42_]) {
					i_41_ = i_42_;
					break;
				}
			}
			if (-1 == i_41_)
				return null;
			int[] is = ((null != class476 && null != ((Class476) class476).anIntArray5626) ? ((Class476) class476).anIntArray5626 : modelIds[i_41_]);
			int i_43_ = is.length;
			if (i_43_ > 0) {
				long l = (long) (class505.rendererId);
				for (int i_44_ = 0; i_44_ < i_43_; i_44_++)
					l = (long) is[i_44_] + 67783L * l;
				synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5614) {
					class528 = ((MeshRasterizer) ((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5614.get(l));
				}
				if (null != class528) {
					if (i_38_ != class528.c())
						i |= 0x1000;
					if (i_39_ != class528.Z())
						i |= 0x2000;
				}
				if (class528 == null || class505.method8452(class528.m(), i) != 0) {
					int i_45_ = i | 0x1f01f;
					if (class528 != null)
						i_45_ = class505.method8546(i_45_, class528.m());
					RSMesh class157 = null;
					synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass157Array5616) {
						for (int i_46_ = 0; i_46_ < i_43_; i_46_++) {
							synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).meshIndex) {
								class157 = RSMesh.decodeMesh((((ObjectIndexLoader) (((ObjectDefinitions) this).loader)).meshIndex), is[i_46_], 0);
							}
							if (null == class157) {
								MeshRasterizer class528_47_ = null;
								return class528_47_;
							}
							if (class157.version < 13)
								class157.upscale(2);
							if (i_43_ > 1)
								((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass157Array5616[i_46_] = class157;
						}
						if (i_43_ > 1)
							class157 = new RSMesh((((ObjectIndexLoader) (((ObjectDefinitions) this).loader)).aClass157Array5616), i_43_);
					}
					class528 = class505.createMeshRasterizer(class157, i_45_, (((ObjectIndexLoader) (((ObjectDefinitions) this).loader)).anInt5617), i_38_, i_39_);
					synchronized (((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5614) {
						((ObjectIndexLoader) ((ObjectDefinitions) this).loader).aClass229_5614.put(class528, l);
					}
				}
			}
		}
		if (null == class528)
			return null;
		MeshRasterizer class528_48_ = class528.method11289((byte) 0, i, true);
		if (i_38_ != class528.c())
			class528_48_.p(i_38_);
		if (i_39_ != class528.Z())
			class528_48_.Q(i_39_);
		if (bool)
			class528_48_.wa();
		if (SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type == i_35_ && i_36_ > 3) {
			class528_48_.S(2048);
			class528_48_.ia(180, 0, -180);
		}
		i_36_ &= 0x3;
		if (i_36_ == 1)
			class528_48_.S(4096);
		else if (i_36_ == 2)
			class528_48_.S(8192);
		else if (i_36_ == 3)
			class528_48_.S(12288);
		if (null != ((ObjectDefinitions) this).originalColors) {
			short[] is;
			if (class476 != null && ((Class476) class476).aShortArray5628 != null)
				is = ((Class476) class476).aShortArray5628;
			else
				is = modifiedColors;
			for (int i_49_ = 0; i_49_ < ((ObjectDefinitions) this).originalColors.length; i_49_++) {
				if (null != ((ObjectDefinitions) this).aByteArray5641 && i_49_ < ((ObjectDefinitions) this).aByteArray5641.length)
					class528_48_.X(((ObjectDefinitions) this).originalColors[i_49_], (aShortArray5691[(((ObjectDefinitions) this).aByteArray5641[i_49_] & 0xff)]));
				else
					class528_48_.X(((ObjectDefinitions) this).originalColors[i_49_], is[i_49_]);
			}
		}
		if (null != ((ObjectDefinitions) this).originalTextures) {
			short[] is;
			if (class476 != null && null != ((Class476) class476).aShortArray5625)
				is = ((Class476) class476).aShortArray5625;
			else
				is = modifiedTextures;
			for (int i_50_ = 0; i_50_ < ((ObjectDefinitions) this).originalTextures.length; i_50_++)
				class528_48_.W(((ObjectDefinitions) this).originalTextures[i_50_], is[i_50_]);
		}
		if (((ObjectDefinitions) this).aByte5634 != 0)
			class528_48_.PA(((ObjectDefinitions) this).aByte5644, ((ObjectDefinitions) this).aByte5642, ((ObjectDefinitions) this).aByte5646, ((ObjectDefinitions) this).aByte5634 & 0xff);
		if (((ObjectDefinitions) this).scaleX != 128 || 128 != ((ObjectDefinitions) this).scaleY || 128 != ((ObjectDefinitions) this).scaleZ)
			class528_48_.oa(((ObjectDefinitions) this).scaleX, ((ObjectDefinitions) this).scaleY, ((ObjectDefinitions) this).scaleZ);
		if (((ObjectDefinitions) this).offsetX != 0 || ((ObjectDefinitions) this).offsetY != 0 || ((ObjectDefinitions) this).offsetZ != 0)
			class528_48_.ia(((ObjectDefinitions) this).offsetX, ((ObjectDefinitions) this).offsetY, ((ObjectDefinitions) this).offsetZ);
		class528_48_.KA(i_40_);
		return class528_48_;
	}

	public String method7973(int i_1, String string_2, byte b_3) {
		if (this.aClass465_5668 == null) {
			return string_2;
		} else {
			Class282_Sub47 class282_sub47_4 = (Class282_Sub47) this.aClass465_5668.get((long) i_1);
			return class282_sub47_4 == null ? string_2 : (String) class282_sub47_4.anObject8068;
		}
	}

	public boolean method7974(int i_1) {
		if (this.toObjectIds == null) {
			return this.ambientSoundId != -1 || this.audioTracks != null;
		} else {
			for (int i_2 = 0; i_2 < this.toObjectIds.length; i_2++) {
				if (this.toObjectIds[i_2] != -1) {
					ObjectDefinitions objectdefinitions_3 = this.loader.getObjectDefinitions(this.toObjectIds[i_2], 65280);
					if (objectdefinitions_3.ambientSoundId != -1 || objectdefinitions_3.audioTracks != null) {
						return true;
					}
				}
			}

			return false;
		}
	}

	public boolean method7976(short s_1) {
		return this.animations != null && this.animations.length > 1;
	}

	public int method7977(byte b_1) {
		if (this.animations != null) {
			if (this.animations.length <= 1) {
				return this.animations[0];
			}

			int i_2 = (int) (Math.random() * 65535.0D);

			for (int i_3 = 0; i_3 < this.animations.length; i_3++) {
				if (i_2 <= this.animProbs[i_3]) {
					return this.animations[i_3];
				}

				i_2 -= this.animProbs[i_3];
			}
		}

		return -1;
	}

	public boolean method7979(int i_1, int i_2) {
		if (this.animations != null && i_1 != -1) {
			for (int i_3 = 0; i_3 < this.animations.length; i_3++) {
				if (this.animations[i_3] == i_1) {
					return true;
				}
			}
		}

		return false;
	}

	public final boolean method7987(int i_1, int i_2) {
		if (this.modelIds == null) {
			return true;
		} else {
			boolean bool_3 = true;
			Index index_4 = this.loader.meshIndex;
			synchronized (this.loader.meshIndex) {
				for (int i_5 = 0; i_5 < this.types.length; i_5++) {
					if (this.types[i_5] == i_1) {
						for (int i_6 = 0; i_6 < this.modelIds[i_5].length; i_6++) {
							if (!this.loader.meshIndex.load(this.modelIds[i_5][i_6], 0)) {
								bool_3 = false;
							}
						}
					}
				}

				return bool_3;
			}
		}
	}

	public int[] method8008(int i_1) {
		return this.animations;
	}

	public final synchronized Class452 method8010(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, Ground class390_5, Ground class390_6, int i_7, int i_8, int i_9, boolean bool_10, Class476 class476_11, int i_12) {
		if (Class485.method8201(i_3, -159499065)) {
			i_3 = SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type;
		}

		long long_13 = (long) ((i_3 << 3) + i_4 + (this.id << 10));
		long_13 |= (long) (graphicalrenderer_1.rendererId << 29);
		if (class476_11 != null) {
			long_13 |= class476_11.aLong5627 << 32;
		}

		int i_15 = i_2;
		if (this.groundContoured == 3) {
			i_15 = i_2 | 0x7;
		} else {
			if (this.groundContoured != 0 || this.anInt5683 != 0) {
				i_15 = i_2 | 0x2;
			}

			if (this.anInt5682 != 0) {
				i_15 |= 0x1;
			}

			if (this.anInt5710 != 0) {
				i_15 |= 0x4;
			}
		}

		if (bool_10) {
			i_15 |= 0x40000;
		}

		SoftCache softcache_17 = this.loader.aClass229_5615;
		Class452 class452_16;
		synchronized (this.loader.aClass229_5615) {
			class452_16 = (Class452) this.loader.aClass229_5615.get(long_13);
		}

		MeshRasterizer meshrasterizer_24 = (MeshRasterizer) (class452_16 != null ? class452_16.anObject5443 : null);
		Shadow class282_sub50_sub17_18 = null;
		if (meshrasterizer_24 != null && graphicalrenderer_1.method8452(meshrasterizer_24.m(), i_15) == 0) {
			class282_sub50_sub17_18 = (Shadow) class452_16.anObject5444;
			if (bool_10 && class282_sub50_sub17_18 == null) {
				class282_sub50_sub17_18 = (Shadow) (class452_16.anObject5444 = meshrasterizer_24.ga((Shadow) null));
			}
		} else {
			if (meshrasterizer_24 != null) {
				i_15 = graphicalrenderer_1.method8546(i_15, meshrasterizer_24.m());
			}

			int i_19 = i_15;
			if (i_3 == SceneObjectType.SCENERY_INTERACT.type && i_4 > 3) {
				i_19 = i_15 | 0x5;
			}

			meshrasterizer_24 = this.method7971(graphicalrenderer_1, i_19, i_3, i_4, class476_11, 1453950061);
			if (meshrasterizer_24 == null) {
				return null;
			}

			if (i_3 == SceneObjectType.SCENERY_INTERACT.type && i_4 > 3) {
				meshrasterizer_24.f(2048);
			}

			if (bool_10) {
				class282_sub50_sub17_18 = meshrasterizer_24.ga((Shadow) null);
			}

			meshrasterizer_24.KA(i_15);
			class452_16 = new Class452(meshrasterizer_24, class282_sub50_sub17_18);
			SoftCache softcache_20 = this.loader.aClass229_5615;
			synchronized (this.loader.aClass229_5615) {
				this.loader.aClass229_5615.put(class452_16, long_13);
			}
		}

		boolean bool_25 = this.groundContoured != 0 && (class390_5 != null || class390_6 != null);
		boolean bool_21 = this.anInt5682 != 0 || this.anInt5683 != 0 || this.anInt5710 != 0;
		if (!bool_25 && !bool_21) {
			meshrasterizer_24 = meshrasterizer_24.method11289((byte) 0, i_2, true);
		} else {
			meshrasterizer_24 = meshrasterizer_24.method11289((byte) 0, i_15, true);
			if (bool_25 && this.anInt5654 < 16384) {
				meshrasterizer_24.pa(this.groundContoured, this.anInt5654, class390_5, class390_6, i_7, i_8, i_9);
			}

			if (bool_21) {
				meshrasterizer_24.ia(this.anInt5682, this.anInt5683, this.anInt5710);
			}

			meshrasterizer_24.KA(i_2);
		}

		this.loader.aClass452_5620.anObject5443 = meshrasterizer_24;
		this.loader.aClass452_5620.anObject5444 = class282_sub50_sub17_18;
		return this.loader.aClass452_5620;
	}

	public final synchronized MeshRasterizer method8012(GraphicalRenderer graphicalrenderer_1, int i_2, int i_3, int i_4, Ground class390_5, Ground class390_6, int i_7, int i_8, int i_9, Animation animation_10, Class476 class476_11, int i_12) {
		if (Class485.method8201(i_3, -159499065)) {
			i_3 = SceneObjectType.STRAIGHT_INSIDE_WALL_DEC.type;
		}

		long long_13 = (long) ((i_3 << 3) + i_4 + (this.id << 10));
		long_13 |= (long) (graphicalrenderer_1.rendererId << 29);
		if (class476_11 != null) {
			long_13 |= class476_11.aLong5627 << 32;
		}

		if (animation_10 != null) {
			i_2 |= animation_10.method7640(-967753514);
		}

		if (this.groundContoured == 3) {
			i_2 |= 0x7;
		} else {
			if (this.groundContoured != 0 || this.anInt5683 != 0) {
				i_2 |= 0x2;
			}

			if (this.anInt5682 != 0) {
				i_2 |= 0x1;
			}

			if (this.anInt5710 != 0) {
				i_2 |= 0x4;
			}
		}

		if (i_3 == SceneObjectType.SCENERY_INTERACT.type && i_4 > 3) {
			i_2 |= 0x5;
		}

		SoftCache softcache_17 = this.loader.aClass229_5619;
		MeshRasterizer meshrasterizer_16;
		synchronized (this.loader.aClass229_5619) {
			meshrasterizer_16 = (MeshRasterizer) this.loader.aClass229_5619.get(long_13);
		}

		if (meshrasterizer_16 == null || graphicalrenderer_1.method8452(meshrasterizer_16.m(), i_2) != 0) {
			if (meshrasterizer_16 != null) {
				i_2 = graphicalrenderer_1.method8546(i_2, meshrasterizer_16.m());
			}

			meshrasterizer_16 = this.method7971(graphicalrenderer_1, i_2, i_3, i_4, class476_11, 991974728);
			if (meshrasterizer_16 == null) {
				return null;
			}

			softcache_17 = this.loader.aClass229_5619;
			synchronized (this.loader.aClass229_5619) {
				this.loader.aClass229_5619.put(meshrasterizer_16, long_13);
			}
		}

		boolean bool_18 = false;
		if (animation_10 != null) {
			meshrasterizer_16 = meshrasterizer_16.method11289((byte) 1, i_2, true);
			bool_18 = true;
			animation_10.rasterize(meshrasterizer_16, i_4 & 0x3, 16711935);
		}

		if (i_3 == SceneObjectType.SCENERY_INTERACT.type && i_4 > 3) {
			if (!bool_18) {
				meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
				bool_18 = true;
			}

			meshrasterizer_16.f(2048);
		}

		if (this.groundContoured != 0) {
			if (!bool_18) {
				meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
				bool_18 = true;
			}

			meshrasterizer_16.pa(this.groundContoured, this.anInt5654, class390_5, class390_6, i_7, i_8, i_9);
		}

		if (this.anInt5682 != 0 || this.anInt5683 != 0 || this.anInt5710 != 0) {
			if (!bool_18) {
				meshrasterizer_16 = meshrasterizer_16.method11289((byte) 3, i_2, true);
				bool_18 = true;
			}

			meshrasterizer_16.ia(this.anInt5682, this.anInt5683, this.anInt5710);
		}

		if (bool_18) {
			meshrasterizer_16.KA(i_2);
		}

		return meshrasterizer_16;
	}

	public final ObjectDefinitions method8013(Interface42 interface42_1, byte b_2) {
		int i_3 = -1;
		if (this.configFileId != -1) {
			i_3 = interface42_1.method241(this.configFileId, 1655583167);
		} else if (this.configId != -1) {
			i_3 = interface42_1.method240(this.configId, 426606861);
		}

		if (i_3 >= 0 && i_3 < this.toObjectIds.length - 1 && this.toObjectIds[i_3] != -1) {
			return this.loader.getObjectDefinitions(this.toObjectIds[i_3], 65280);
		} else {
			int i_4 = this.toObjectIds[this.toObjectIds.length - 1];
			return i_4 != -1 ? this.loader.getObjectDefinitions(i_4, 65280) : null;
		}
	}

	static final void method8018(CS2Executor cs2executor_0, int i_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		IComponentDefinitions icomponentdefinitions_3 = Class117.method1981(i_2, (byte) 74);
		Interface interface_4 = Class468_Sub8.aClass98Array7889[i_2 >> 16];
		ItemDefinitions.method7142(icomponentdefinitions_3, interface_4, cs2executor_0, -1447710686);
	}

	static final void method8019(CS2Executor cs2executor_0, short s_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		if (client.anInt7434 != 0 && i_2 < client.anInt7373) {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = client.aClass10Array7456[i_2].aString115;
		} else {
			cs2executor_0.objectStack[++cs2executor_0.anInt7000 - 1] = "";
		}

	}

	public static void method8020(int i_0) {
		MeshModifier.method7042((byte) 2);
		Class282_Sub20_Sub36.method15420((byte) -32);
		Class282_Sub20_Sub24.method15391(792930354);
		Class335.method5961(1418471735);
	}

	static final void method8021(CS2Executor cs2executor_0, short s_1) {
		cs2executor_0.intStackPtr -= 3;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		Class96_Sub10.method14603(5, i_2 << 16 | i_3, i_4, "", (byte) 110);
	}

	static Class282_Sub50_Sub12 method8022(int i_0) {
		Class282_Sub50_Sub12 class282_sub50_sub12_1 = (Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass477_9666.method7941((byte) 4);
		if (class282_sub50_sub12_1 != null) {
			class282_sub50_sub12_1.remove();
			class282_sub50_sub12_1.method13452();
			return class282_sub50_sub12_1;
		} else {
			do {
				class282_sub50_sub12_1 = (Class282_Sub50_Sub12) Class282_Sub50_Sub12.aClass477_9655.method7941((byte) 4);
				if (class282_sub50_sub12_1 == null) {
					return null;
				}

				if (class282_sub50_sub12_1.method14955(31148025) > Class169.time()) {
					return null;
				}

				class282_sub50_sub12_1.remove();
				class282_sub50_sub12_1.method13452();
			} while ((class282_sub50_sub12_1.key & ~0x7fffffffffffffffL) == 0L);

			return class282_sub50_sub12_1;
		}
	}

	static byte[] method8023(File file_0, int i_1, byte b_2) {
		try {
			byte[] bytes_4 = new byte[i_1];
			Class353.method6208(file_0, bytes_4, i_1, 108704305);
			return bytes_4;
		} catch (IOException ioexception_5) {
			return null;
		}
	}

}
