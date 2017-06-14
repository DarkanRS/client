/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Model {
	
	public Class68[] aClass68Array613;
	public int vertices;
	public short[] aShortArray615;
	public int[] anIntArray616;
	public short[] aShortArray617;
	public int[] anIntArray618;
	public int[] vertexSkinTypes;
	public short[] aShortArray620;
	public int triangles;
	public byte[] tex_fill_attr;
	public short[] tex_point_mapx;
	public short[] aShortArray624;
	public byte[] face_fill_attributes;
	public int anInt626;
	public byte[] aByteArray627;
	public byte[] aByteArray628;
	public short[] aShortArray629;
	public int size = 12;
	public int[] alpha_channel;
	public byte priority;
	public byte[] priorities;
	public int texturedTriangles;
	public byte[] aByteArray635;
	public short[] tex_point_mapy;
	public int[] anIntArray637;
	public short[] tex_point_mapz;
	public int[] particles_zlifepsan;
	public int[] particles_zdir;
	public int[] particles_xdir;
	public int[] anIntArray642;
	public int[] tex_primary_clr;
	public short[] aShortArray644;
	public byte[] particles_xlifespan;
	public short[] aShortArray646;
	public Class85[] aClass85Array647;
	public int[] tex_secondary_clr;
	public Class84[] aClass84Array649;

	Model(byte[] is) {
		vertices = 0;
		anInt626 = 0;
		triangles = 0;
		priority = (byte) 0;
		texturedTriangles = 0;
		if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
			decode(is);
		else
			method746(is);
	}

	public Model(int i, int i_0_, int i_1_) {
		vertices = 0;
		anInt626 = 0;
		triangles = 0;
		priority = (byte) 0;
		texturedTriangles = 0;
		anIntArray616 = new int[i];
		anIntArray642 = new int[i];
		anIntArray618 = new int[i];
		vertexSkinTypes = new int[i];
		aShortArray644 = new short[i_0_];
		aShortArray646 = new short[i_0_];
		aShortArray624 = new short[i_0_];
		face_fill_attributes = new byte[i_0_];
		priorities = new byte[i_0_];
		aByteArray627 = new byte[i_0_];
		aByteArray635 = new byte[i_0_];
		aShortArray629 = new short[i_0_];
		aShortArray617 = new short[i_0_];
		alpha_channel = new int[i_0_];
		if (i_1_ > 0) {
			tex_fill_attr = new byte[i_1_];
			tex_point_mapx = new short[i_1_];
			tex_point_mapy = new short[i_1_];
			tex_point_mapz = new short[i_1_];
			particles_zlifepsan = new int[i_1_];
			particles_zdir = new int[i_1_];
			particles_xdir = new int[i_1_];
			particles_xlifespan = new byte[i_1_];
			aByteArray628 = new byte[i_1_];
			anIntArray637 = new int[i_1_];
			tex_primary_clr = new int[i_1_];
			tex_secondary_clr = new int[i_1_];
		}
	}

	public Model(Model[] class64s, int i) {
		vertices = 0;
		anInt626 = 0;
		triangles = 0;
		priority = (byte) 0;
		texturedTriangles = 0;
		vertices = 0;
		triangles = 0;
		texturedTriangles = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		int i_4_ = 0;
		boolean bool = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		priority = (byte) -1;
		for (int i_10_ = 0; i_10_ < i; i_10_++) {
			Model class64_11_ = class64s[i_10_];
			if (class64_11_ != null) {
				vertices += class64_11_.vertices;
				triangles += class64_11_.triangles;
				texturedTriangles += class64_11_.texturedTriangles;
				if (class64_11_.aClass85Array647 != null)
					i_2_ += class64_11_.aClass85Array647.length;
				if (class64_11_.aClass68Array613 != null)
					i_3_ += class64_11_.aClass68Array613.length;
				if (class64_11_.aClass84Array649 != null)
					i_4_ += class64_11_.aClass84Array649.length;
				bool = bool | class64_11_.face_fill_attributes != null;
				if (class64_11_.priorities != null)
					bool_5_ = true;
				else {
					if (priority == -1)
						priority = class64_11_.priority;
					if (priority != class64_11_.priority)
						bool_5_ = true;
				}
				bool_6_ = bool_6_ | class64_11_.aByteArray627 != null;
				bool_7_ = bool_7_ | class64_11_.aByteArray635 != null;
				bool_8_ = bool_8_ | class64_11_.aShortArray617 != null;
				bool_9_ = bool_9_ | class64_11_.alpha_channel != null;
			}
		}
		anIntArray616 = new int[vertices];
		anIntArray642 = new int[vertices];
		anIntArray618 = new int[vertices];
		vertexSkinTypes = new int[vertices];
		aShortArray620 = new short[vertices];
		aShortArray644 = new short[triangles];
		aShortArray646 = new short[triangles];
		aShortArray624 = new short[triangles];
		if (bool)
			face_fill_attributes = new byte[triangles];
		if (bool_5_)
			priorities = new byte[triangles];
		if (bool_6_)
			aByteArray627 = new byte[triangles];
		if (bool_7_)
			aByteArray635 = new byte[triangles];
		aShortArray629 = new short[triangles];
		if (bool_8_)
			aShortArray617 = new short[triangles];
		if (bool_9_)
			alpha_channel = new int[triangles];
		aShortArray615 = new short[triangles];
		if (texturedTriangles > 0) {
			tex_fill_attr = new byte[texturedTriangles];
			tex_point_mapx = new short[texturedTriangles];
			tex_point_mapy = new short[texturedTriangles];
			tex_point_mapz = new short[texturedTriangles];
			particles_zlifepsan = new int[texturedTriangles];
			particles_zdir = new int[texturedTriangles];
			particles_xdir = new int[texturedTriangles];
			particles_xlifespan = new byte[texturedTriangles];
			aByteArray628 = new byte[texturedTriangles];
			anIntArray637 = new int[texturedTriangles];
			tex_primary_clr = new int[texturedTriangles];
			tex_secondary_clr = new int[texturedTriangles];
		}
		if (i_4_ > 0)
			aClass84Array649 = new Class84[i_4_];
		if (i_2_ > 0)
			aClass85Array647 = new Class85[i_2_];
		if (i_3_ > 0)
			aClass68Array613 = new Class68[i_3_];
		vertices = 0;
		triangles = 0;
		texturedTriangles = 0;
		i_2_ = 0;
		i_3_ = 0;
		i_4_ = 0;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			short i_13_ = (short) (1 << i_12_);
			Model class64_14_ = class64s[i_12_];
			if (class64_14_ != null) {
				if (class64_14_.aClass84Array649 != null) {
					for (int i_15_ = 0; i_15_ < class64_14_.aClass84Array649.length; i_15_++) {
						Class84 class84 = class64_14_.aClass84Array649[i_15_];
						aClass84Array649[i_4_++] = class84.method945((class84.anInt767 * 1512514121 + triangles), 214949543);
					}
				}
				for (int i_16_ = 0; i_16_ < class64_14_.triangles; i_16_++) {
					if (bool && class64_14_.face_fill_attributes != null)
						face_fill_attributes[triangles] = class64_14_.face_fill_attributes[i_16_];
					if (bool_5_) {
						if (class64_14_.priorities != null)
							priorities[triangles] = class64_14_.priorities[i_16_];
						else
							priorities[triangles] = class64_14_.priority;
					}
					if (bool_6_ && class64_14_.aByteArray627 != null)
						aByteArray627[triangles] = class64_14_.aByteArray627[i_16_];
					if (bool_8_) {
						if (class64_14_.aShortArray617 != null)
							aShortArray617[triangles] = class64_14_.aShortArray617[i_16_];
						else
							aShortArray617[triangles] = (short) -1;
					}
					if (bool_9_) {
						if (class64_14_.alpha_channel != null)
							alpha_channel[triangles] = class64_14_.alpha_channel[i_16_];
						else
							alpha_channel[triangles] = -1;
					}
					aShortArray644[triangles] = (short) method743(class64_14_, class64_14_.aShortArray644[i_16_], i_13_);
					aShortArray646[triangles] = (short) method743(class64_14_, class64_14_.aShortArray646[i_16_], i_13_);
					aShortArray624[triangles] = (short) method743(class64_14_, class64_14_.aShortArray624[i_16_], i_13_);
					aShortArray615[triangles] = i_13_;
					aShortArray629[triangles] = class64_14_.aShortArray629[i_16_];
					triangles++;
				}
				if (class64_14_.aClass85Array647 != null) {
					for (int i_17_ = 0; i_17_ < class64_14_.aClass85Array647.length; i_17_++) {
						int i_18_ = method743(class64_14_, (class64_14_.aClass85Array647[i_17_].anInt773) * -710317103, i_13_);
						int i_19_ = method743(class64_14_, (class64_14_.aClass85Array647[i_17_].anInt774) * 1705862021, i_13_);
						int i_20_ = method743(class64_14_, (class64_14_.aClass85Array647[i_17_].anInt775) * 1636170731, i_13_);
						aClass85Array647[i_2_] = class64_14_.aClass85Array647[i_17_].method954(i_18_, i_19_, i_20_, -1991744488);
						i_2_++;
					}
				}
				if (class64_14_.aClass68Array613 != null) {
					for (int i_21_ = 0; i_21_ < class64_14_.aClass68Array613.length; i_21_++) {
						int i_22_ = method743(class64_14_, (class64_14_.aClass68Array613[i_21_].anInt674) * -180596249, i_13_);
						aClass68Array613[i_3_] = class64_14_.aClass68Array613[i_21_].method776(i_22_, (byte) 0);
						i_3_++;
					}
				}
			}
		}
		int i_23_ = 0;
		anInt626 = vertices;
		for (int i_24_ = 0; i_24_ < i; i_24_++) {
			short i_25_ = (short) (1 << i_24_);
			Model class64_26_ = class64s[i_24_];
			if (class64_26_ != null) {
				for (int i_27_ = 0; i_27_ < class64_26_.triangles; i_27_++) {
					if (bool_7_)
						aByteArray635[i_23_++] = (byte) ((class64_26_.aByteArray635 != null && (class64_26_.aByteArray635[i_27_] != -1)) ? (class64_26_.aByteArray635[i_27_] + texturedTriangles) : -1);
				}
				for (int i_28_ = 0; i_28_ < class64_26_.texturedTriangles; i_28_++) {
					byte i_29_ = (tex_fill_attr[texturedTriangles] = class64_26_.tex_fill_attr[i_28_]);
					if (i_29_ == 0) {
						tex_point_mapx[texturedTriangles] = (short) method743(class64_26_, (class64_26_.tex_point_mapx[i_28_]), i_25_);
						tex_point_mapy[texturedTriangles] = (short) method743(class64_26_, (class64_26_.tex_point_mapy[i_28_]), i_25_);
						tex_point_mapz[texturedTriangles] = (short) method743(class64_26_, (class64_26_.tex_point_mapz[i_28_]), i_25_);
					}
					if (i_29_ >= 1 && i_29_ <= 3) {
						tex_point_mapx[texturedTriangles] = class64_26_.tex_point_mapx[i_28_];
						tex_point_mapy[texturedTriangles] = class64_26_.tex_point_mapy[i_28_];
						tex_point_mapz[texturedTriangles] = class64_26_.tex_point_mapz[i_28_];
						particles_zlifepsan[texturedTriangles] = class64_26_.particles_zlifepsan[i_28_];
						particles_zdir[texturedTriangles] = class64_26_.particles_zdir[i_28_];
						particles_xdir[texturedTriangles] = class64_26_.particles_xdir[i_28_];
						particles_xlifespan[texturedTriangles] = class64_26_.particles_xlifespan[i_28_];
						aByteArray628[texturedTriangles] = class64_26_.aByteArray628[i_28_];
						anIntArray637[texturedTriangles] = class64_26_.anIntArray637[i_28_];
					}
					if (i_29_ == 2) {
						tex_primary_clr[texturedTriangles] = class64_26_.tex_primary_clr[i_28_];
						tex_secondary_clr[texturedTriangles] = class64_26_.tex_secondary_clr[i_28_];
					}
					texturedTriangles++;
				}
			}
		}
	}

	final int method743(Model class64_30_, int i, short i_31_) {
		int i_32_ = class64_30_.anIntArray616[i];
		int i_33_ = class64_30_.anIntArray642[i];
		int i_34_ = class64_30_.anIntArray618[i];
		for (int i_35_ = 0; i_35_ < vertices; i_35_++) {
			if (i_32_ == anIntArray616[i_35_] && i_33_ == anIntArray642[i_35_] && i_34_ == anIntArray618[i_35_]) {
				aShortArray620[i_35_] |= i_31_;
				return i_35_;
			}
		}
		anIntArray616[vertices] = i_32_;
		anIntArray642[vertices] = i_33_;
		anIntArray618[vertices] = i_34_;
		aShortArray620[vertices] = i_31_;
		vertexSkinTypes[vertices] = (class64_30_.vertexSkinTypes != null ? class64_30_.vertexSkinTypes[i] : -1);
		return vertices++;
	}

	void method744(RsByteBuffer class298_sub53, RsByteBuffer class298_sub53_36_) {
		short i = 0;
		short i_37_ = 0;
		short i_38_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < triangles; i_40_++) {
			int i_41_ = class298_sub53_36_.readUnsignedByte();
			if (i_41_ == 1) {
				i = (short) (class298_sub53.method3645(590991010) + i_39_);
				i_39_ = i;
				i_37_ = (short) (class298_sub53.method3645(590991010) + i_39_);
				i_39_ = i_37_;
				i_38_ = (short) (class298_sub53.method3645(590991010) + i_39_);
				i_39_ = i_38_;
				aShortArray644[i_40_] = i;
				aShortArray646[i_40_] = i_37_;
				aShortArray624[i_40_] = i_38_;
				if (i > anInt626)
					anInt626 = i;
				if (i_37_ > anInt626)
					anInt626 = i_37_;
				if (i_38_ > anInt626)
					anInt626 = i_38_;
			}
			if (i_41_ == 2) {
				i_37_ = i_38_;
				i_38_ = (short) (class298_sub53.method3645(590991010) + i_39_);
				i_39_ = i_38_;
				aShortArray644[i_40_] = i;
				aShortArray646[i_40_] = i_37_;
				aShortArray624[i_40_] = i_38_;
				if (i_38_ > anInt626)
					anInt626 = i_38_;
			}
			if (i_41_ == 3) {
				i = i_38_;
				i_38_ = (short) (class298_sub53.method3645(590991010) + i_39_);
				i_39_ = i_38_;
				aShortArray644[i_40_] = i;
				aShortArray646[i_40_] = i_37_;
				aShortArray624[i_40_] = i_38_;
				if (i_38_ > anInt626)
					anInt626 = i_38_;
			}
			if (i_41_ == 4) {
				short i_42_ = i;
				i = i_37_;
				i_37_ = i_42_;
				i_38_ = (short) (class298_sub53.method3645(590991010) + i_39_);
				i_39_ = i_38_;
				aShortArray644[i_40_] = i;
				aShortArray646[i_40_] = i_37_;
				aShortArray624[i_40_] = i_38_;
				if (i_38_ > anInt626)
					anInt626 = i_38_;
			}
		}
		anInt626++;
	}

	void method745(RsByteBuffer class298_sub53, RsByteBuffer class298_sub53_43_, RsByteBuffer class298_sub53_44_, RsByteBuffer class298_sub53_45_, RsByteBuffer class298_sub53_46_, RsByteBuffer class298_sub53_47_) {
		for (int i = 0; i < texturedTriangles; i++) {
			int i_48_ = tex_fill_attr[i] & 0xff;
			if (i_48_ == 0) {
				tex_point_mapx[i] = (short) class298_sub53.readUnsignedShort();
				tex_point_mapy[i] = (short) class298_sub53.readUnsignedShort();
				tex_point_mapz[i] = (short) class298_sub53.readUnsignedShort();
			}
			if (i_48_ == 1) {
				tex_point_mapx[i] = (short) class298_sub53_43_.readUnsignedShort();
				tex_point_mapy[i] = (short) class298_sub53_43_.readUnsignedShort();
				tex_point_mapz[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (size < 15) {
					particles_zlifepsan[i] = class298_sub53_44_.readUnsignedShort();
					if (size < 14)
						particles_zdir[i] = class298_sub53_44_.readUnsignedShort();
					else
						particles_zdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -55);
					particles_xdir[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					particles_zlifepsan[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 73);
					particles_zdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -3);
					particles_xdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 48);
				}
				particles_xlifespan[i] = class298_sub53_45_.readByte(-12558881);
				aByteArray628[i] = class298_sub53_46_.readByte(-12558881);
				anIntArray637[i] = class298_sub53_47_.readByte(-12558881);
			}
			if (i_48_ == 2) {
				tex_point_mapx[i] = (short) class298_sub53_43_.readUnsignedShort();
				tex_point_mapy[i] = (short) class298_sub53_43_.readUnsignedShort();
				tex_point_mapz[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (size < 15) {
					particles_zlifepsan[i] = class298_sub53_44_.readUnsignedShort();
					if (size < 14)
						particles_zdir[i] = class298_sub53_44_.readUnsignedShort();
					else
						particles_zdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -37);
					particles_xdir[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					particles_zlifepsan[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -91);
					particles_zdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 78);
					particles_xdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 37);
				}
				particles_xlifespan[i] = class298_sub53_45_.readByte(-12558881);
				aByteArray628[i] = class298_sub53_46_.readByte(-12558881);
				anIntArray637[i] = class298_sub53_47_.readByte(-12558881);
				tex_primary_clr[i] = class298_sub53_47_.readByte(-12558881);
				tex_secondary_clr[i] = class298_sub53_47_.readByte(-12558881);
			}
			if (i_48_ == 3) {
				tex_point_mapx[i] = (short) class298_sub53_43_.readUnsignedShort();
				tex_point_mapy[i] = (short) class298_sub53_43_.readUnsignedShort();
				tex_point_mapz[i] = (short) class298_sub53_43_.readUnsignedShort();
				if (size < 15) {
					particles_zlifepsan[i] = class298_sub53_44_.readUnsignedShort();
					if (size < 14)
						particles_zdir[i] = class298_sub53_44_.readUnsignedShort();
					else
						particles_zdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) 6);
					particles_xdir[i] = class298_sub53_44_.readUnsignedShort();
				} else {
					particles_zlifepsan[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -35);
					particles_zdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -11);
					particles_xdir[i] = class298_sub53_44_.read24BitUnsignedInteger((byte) -24);
				}
				particles_xlifespan[i] = class298_sub53_45_.readByte(-12558881);
				aByteArray628[i] = class298_sub53_46_.readByte(-12558881);
				anIntArray637[i] = class298_sub53_47_.readByte(-12558881);
			}
		}
	}

	void method746(byte[] is) {
		boolean bool = false;
		boolean bool_49_ = false;
		RsByteBuffer class298_sub53 = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_50_ = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_51_ = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_52_ = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_53_ = new RsByteBuffer(is);
		class298_sub53.index = (is.length - 18) * 116413311;
		vertices = class298_sub53.readUnsignedShort();
		triangles = class298_sub53.readUnsignedShort();
		texturedTriangles = class298_sub53.readUnsignedByte();
		int i = class298_sub53.readUnsignedByte();
		int i_54_ = class298_sub53.readUnsignedByte();
		int i_55_ = class298_sub53.readUnsignedByte();
		int i_56_ = class298_sub53.readUnsignedByte();
		int i_57_ = class298_sub53.readUnsignedByte();
		int i_58_ = class298_sub53.readUnsignedShort();
		int i_59_ = class298_sub53.readUnsignedShort();
		int i_60_ = class298_sub53.readUnsignedShort();
		int i_61_ = class298_sub53.readUnsignedShort();
		int i_62_ = 0;
		int i_63_ = i_62_;
		i_62_ += vertices;
		int i_64_ = i_62_;
		i_62_ += triangles;
		int i_65_ = i_62_;
		if (i_54_ == 255)
			i_62_ += triangles;
		int i_66_ = i_62_;
		if (i_56_ == 1)
			i_62_ += triangles;
		int i_67_ = i_62_;
		if (i == 1)
			i_62_ += triangles;
		int i_68_ = i_62_;
		if (i_57_ == 1)
			i_62_ += vertices;
		int i_69_ = i_62_;
		if (i_55_ == 1)
			i_62_ += triangles;
		int i_70_ = i_62_;
		i_62_ += i_61_;
		int i_71_ = i_62_;
		i_62_ += triangles * 2;
		int i_72_ = i_62_;
		i_62_ += texturedTriangles * 6;
		int i_73_ = i_62_;
		i_62_ += i_58_;
		int i_74_ = i_62_;
		i_62_ += i_59_;
		int i_75_ = i_62_;
		i_62_ += i_60_;
		anIntArray616 = new int[vertices];
		anIntArray642 = new int[vertices];
		anIntArray618 = new int[vertices];
		aShortArray644 = new short[triangles];
		aShortArray646 = new short[triangles];
		aShortArray624 = new short[triangles];
		if (texturedTriangles > 0) {
			tex_fill_attr = new byte[texturedTriangles];
			tex_point_mapx = new short[texturedTriangles];
			tex_point_mapy = new short[texturedTriangles];
			tex_point_mapz = new short[texturedTriangles];
		}
		if (i_57_ == 1)
			vertexSkinTypes = new int[vertices];
		if (i == 1) {
			face_fill_attributes = new byte[triangles];
			aByteArray635 = new byte[triangles];
			aShortArray617 = new short[triangles];
		}
		if (i_54_ == 255)
			priorities = new byte[triangles];
		else
			priority = (byte) i_54_;
		if (i_55_ == 1)
			aByteArray627 = new byte[triangles];
		if (i_56_ == 1)
			alpha_channel = new int[triangles];
		aShortArray629 = new short[triangles];
		class298_sub53.index = i_63_ * 116413311;
		class298_sub53_50_.index = i_73_ * 116413311;
		class298_sub53_51_.index = i_74_ * 116413311;
		class298_sub53_52_.index = i_75_ * 116413311;
		class298_sub53_53_.index = i_68_ * 116413311;
		int i_76_ = 0;
		int i_77_ = 0;
		int i_78_ = 0;
		for (int i_79_ = 0; i_79_ < vertices; i_79_++) {
			int i_80_ = class298_sub53.readUnsignedByte();
			int i_81_ = 0;
			if ((i_80_ & 0x1) != 0)
				i_81_ = class298_sub53_50_.method3645(590991010);
			int i_82_ = 0;
			if ((i_80_ & 0x2) != 0)
				i_82_ = class298_sub53_51_.method3645(590991010);
			int i_83_ = 0;
			if ((i_80_ & 0x4) != 0)
				i_83_ = class298_sub53_52_.method3645(590991010);
			anIntArray616[i_79_] = i_76_ + i_81_;
			anIntArray642[i_79_] = i_77_ + i_82_;
			anIntArray618[i_79_] = i_78_ + i_83_;
			i_76_ = anIntArray616[i_79_];
			i_77_ = anIntArray642[i_79_];
			i_78_ = anIntArray618[i_79_];
			if (i_57_ == 1)
				vertexSkinTypes[i_79_] = class298_sub53_53_.readUnsignedByte();
		}
		class298_sub53.index = i_71_ * 116413311;
		class298_sub53_50_.index = i_67_ * 116413311;
		class298_sub53_51_.index = i_65_ * 116413311;
		class298_sub53_52_.index = i_69_ * 116413311;
		class298_sub53_53_.index = i_66_ * 116413311;
		for (int i_84_ = 0; i_84_ < triangles; i_84_++) {
			aShortArray629[i_84_] = (short) class298_sub53.readUnsignedShort();
			if (i == 1) {
				int i_85_ = class298_sub53_50_.readUnsignedByte();
				if ((i_85_ & 0x1) == 1) {
					face_fill_attributes[i_84_] = (byte) 1;
					bool = true;
				} else
					face_fill_attributes[i_84_] = (byte) 0;
				if ((i_85_ & 0x2) == 2) {
					aByteArray635[i_84_] = (byte) (i_85_ >> 2);
					aShortArray617[i_84_] = aShortArray629[i_84_];
					aShortArray629[i_84_] = (short) 127;
					if (aShortArray617[i_84_] != -1)
						bool_49_ = true;
				} else {
					aByteArray635[i_84_] = (byte) -1;
					aShortArray617[i_84_] = (short) -1;
				}
			}
			if (i_54_ == 255)
				priorities[i_84_] = class298_sub53_51_.readByte(-12558881);
			if (i_55_ == 1)
				aByteArray627[i_84_] = class298_sub53_52_.readByte(-12558881);
			if (i_56_ == 1)
				alpha_channel[i_84_] = class298_sub53_53_.readUnsignedByte();
		}
		anInt626 = -1;
		class298_sub53.index = i_70_ * 116413311;
		class298_sub53_50_.index = i_64_ * 116413311;
		short i_86_ = 0;
		short i_87_ = 0;
		short i_88_ = 0;
		int i_89_ = 0;
		for (int i_90_ = 0; i_90_ < triangles; i_90_++) {
			int i_91_ = class298_sub53_50_.readUnsignedByte();
			if (i_91_ == 1) {
				i_86_ = (short) (class298_sub53.method3645(590991010) + i_89_);
				i_89_ = i_86_;
				i_87_ = (short) (class298_sub53.method3645(590991010) + i_89_);
				i_89_ = i_87_;
				i_88_ = (short) (class298_sub53.method3645(590991010) + i_89_);
				i_89_ = i_88_;
				aShortArray644[i_90_] = i_86_;
				aShortArray646[i_90_] = i_87_;
				aShortArray624[i_90_] = i_88_;
				if (i_86_ > anInt626)
					anInt626 = i_86_;
				if (i_87_ > anInt626)
					anInt626 = i_87_;
				if (i_88_ > anInt626)
					anInt626 = i_88_;
			}
			if (i_91_ == 2) {
				i_87_ = i_88_;
				i_88_ = (short) (class298_sub53.method3645(590991010) + i_89_);
				i_89_ = i_88_;
				aShortArray644[i_90_] = i_86_;
				aShortArray646[i_90_] = i_87_;
				aShortArray624[i_90_] = i_88_;
				if (i_88_ > anInt626)
					anInt626 = i_88_;
			}
			if (i_91_ == 3) {
				i_86_ = i_88_;
				i_88_ = (short) (class298_sub53.method3645(590991010) + i_89_);
				i_89_ = i_88_;
				aShortArray644[i_90_] = i_86_;
				aShortArray646[i_90_] = i_87_;
				aShortArray624[i_90_] = i_88_;
				if (i_88_ > anInt626)
					anInt626 = i_88_;
			}
			if (i_91_ == 4) {
				short i_92_ = i_86_;
				i_86_ = i_87_;
				i_87_ = i_92_;
				i_88_ = (short) (class298_sub53.method3645(590991010) + i_89_);
				i_89_ = i_88_;
				aShortArray644[i_90_] = i_86_;
				aShortArray646[i_90_] = i_87_;
				aShortArray624[i_90_] = i_88_;
				if (i_88_ > anInt626)
					anInt626 = i_88_;
			}
		}
		anInt626++;
		class298_sub53.index = i_72_ * 116413311;
		for (int i_93_ = 0; i_93_ < texturedTriangles; i_93_++) {
			tex_fill_attr[i_93_] = (byte) 0;
			tex_point_mapx[i_93_] = (short) class298_sub53.readUnsignedShort();
			tex_point_mapy[i_93_] = (short) class298_sub53.readUnsignedShort();
			tex_point_mapz[i_93_] = (short) class298_sub53.readUnsignedShort();
		}
		if (aByteArray635 != null) {
			boolean bool_94_ = false;
			for (int i_95_ = 0; i_95_ < triangles; i_95_++) {
				int i_96_ = aByteArray635[i_95_] & 0xff;
				if (i_96_ != 255) {
					if (((tex_point_mapx[i_96_] & 0xffff) == aShortArray644[i_95_]) && ((tex_point_mapy[i_96_] & 0xffff) == aShortArray646[i_95_]) && ((tex_point_mapz[i_96_] & 0xffff) == aShortArray624[i_95_]))
						aByteArray635[i_95_] = (byte) -1;
					else
						bool_94_ = true;
				}
			}
			if (!bool_94_)
				aByteArray635 = null;
		}
		if (!bool_49_)
			aShortArray617 = null;
		if (!bool)
			face_fill_attributes = null;
	}

	public int method747(int i, int i_97_, int i_98_) {
		for (int i_99_ = 0; i_99_ < vertices; i_99_++) {
			if (anIntArray616[i_99_] == i && anIntArray642[i_99_] == i_97_ && anIntArray618[i_99_] == i_98_)
				return i_99_;
		}
		anIntArray616[vertices] = i;
		anIntArray642[vertices] = i_97_;
		anIntArray618[vertices] = i_98_;
		anInt626 = vertices + 1;
		return vertices++;
	}

	public int method748(int i, int i_100_, int i_101_, byte i_102_, byte i_103_, short i_104_, byte i_105_, short i_106_) {
		aShortArray644[triangles] = (short) i;
		aShortArray646[triangles] = (short) i_100_;
		aShortArray624[triangles] = (short) i_101_;
		face_fill_attributes[triangles] = i_102_;
		aByteArray635[triangles] = i_103_;
		aShortArray629[triangles] = i_104_;
		aByteArray627[triangles] = i_105_;
		aShortArray617[triangles] = i_106_;
		return triangles++;
	}

	public int[][] method749(boolean bool) {
		int[] is = new int[256];
		int i = 0;
		int i_107_ = bool ? vertices : anInt626;
		for (int i_108_ = 0; i_108_ < i_107_; i_108_++) {
			int i_109_ = vertexSkinTypes[i_108_];
			if (i_109_ >= 0) {
				is[i_109_]++;
				if (i_109_ > i)
					i = i_109_;
			}
		}
		int[][] is_110_ = new int[i + 1][];
		for (int i_111_ = 0; i_111_ <= i; i_111_++) {
			is_110_[i_111_] = new int[is[i_111_]];
			is[i_111_] = 0;
		}
		for (int i_112_ = 0; i_112_ < i_107_; i_112_++) {
			int i_113_ = vertexSkinTypes[i_112_];
			if (i_113_ >= 0)
				is_110_[i_113_][is[i_113_]++] = i_112_;
		}
		return is_110_;
	}

	public int[][] method750() {
		int[] is = new int[256];
		int i = 0;
		for (int i_114_ = 0; i_114_ < triangles; i_114_++) {
			int i_115_ = alpha_channel[i_114_];
			if (i_115_ >= 0) {
				is[i_115_]++;
				if (i_115_ > i)
					i = i_115_;
			}
		}
		int[][] is_116_ = new int[i + 1][];
		for (int i_117_ = 0; i_117_ <= i; i_117_++) {
			is_116_[i_117_] = new int[is[i_117_]];
			is[i_117_] = 0;
		}
		for (int i_118_ = 0; i_118_ < triangles; i_118_++) {
			int i_119_ = alpha_channel[i_118_];
			if (i_119_ >= 0)
				is_116_[i_119_][is[i_119_]++] = i_118_;
		}
		return is_116_;
	}

	public static Model method751(Class243 class243, int i, int i_120_) {
		byte[] is = class243.getFile(i, i_120_, (byte) -97);
		if (is == null)
			return null;
		return new Model(is);
	}

	public void method752(short i, short i_121_) {
		if (aShortArray617 != null) {
			for (int i_122_ = 0; i_122_ < triangles; i_122_++) {
				if (aShortArray617[i_122_] == i)
					aShortArray617[i_122_] = i_121_;
			}
		}
	}

	public void method753(int i, int i_123_, int i_124_) {
		for (int i_125_ = 0; i_125_ < vertices; i_125_++) {
			anIntArray616[i_125_] += i;
			anIntArray642[i_125_] += i_123_;
			anIntArray618[i_125_] += i_124_;
		}
	}

	public void method754(int i, int i_126_, int i_127_) {
		if (i_127_ != 0) {
			int i_128_ = Class220.anIntArray2483[i_127_];
			int i_129_ = Class220.anIntArray2474[i_127_];
			for (int i_130_ = 0; i_130_ < vertices; i_130_++) {
				int i_131_ = ((anIntArray642[i_130_] * i_128_ + anIntArray616[i_130_] * i_129_) >> 14);
				anIntArray642[i_130_] = (anIntArray642[i_130_] * i_129_ - anIntArray616[i_130_] * i_128_) >> 14;
				anIntArray616[i_130_] = i_131_;
			}
		}
		if (i != 0) {
			int i_132_ = Class220.anIntArray2483[i];
			int i_133_ = Class220.anIntArray2474[i];
			for (int i_134_ = 0; i_134_ < vertices; i_134_++) {
				int i_135_ = ((anIntArray642[i_134_] * i_133_ - anIntArray618[i_134_] * i_132_) >> 14);
				anIntArray618[i_134_] = (anIntArray642[i_134_] * i_132_ + anIntArray618[i_134_] * i_133_) >> 14;
				anIntArray642[i_134_] = i_135_;
			}
		}
		if (i_126_ != 0) {
			int i_136_ = Class220.anIntArray2483[i_126_];
			int i_137_ = Class220.anIntArray2474[i_126_];
			for (int i_138_ = 0; i_138_ < vertices; i_138_++) {
				int i_139_ = ((anIntArray618[i_138_] * i_136_ + anIntArray616[i_138_] * i_137_) >> 14);
				anIntArray618[i_138_] = (anIntArray618[i_138_] * i_137_ - anIntArray616[i_138_] * i_136_) >> 14;
				anIntArray616[i_138_] = i_139_;
			}
		}
	}

	public void method755(int i) {
		for (int i_140_ = 0; i_140_ < vertices; i_140_++) {
			anIntArray616[i_140_] <<= i;
			anIntArray642[i_140_] <<= i;
			anIntArray618[i_140_] <<= i;
		}
		if (texturedTriangles > 0 && particles_zlifepsan != null) {
			for (int i_141_ = 0; i_141_ < particles_zlifepsan.length; i_141_++) {
				particles_zlifepsan[i_141_] <<= i;
				particles_zdir[i_141_] <<= i;
				if (tex_fill_attr[i_141_] != 1)
					particles_xdir[i_141_] <<= i;
			}
		}
	}

	public void method756(short i, short i_142_) {
		for (int i_143_ = 0; i_143_ < triangles; i_143_++) {
			if (aShortArray629[i_143_] == i)
				aShortArray629[i_143_] = i_142_;
		}
	}

	public byte method757(short i, short i_144_, short i_145_, short i_146_, short i_147_, short i_148_, byte i_149_, byte i_150_, byte i_151_) {
		if (texturedTriangles >= 255)
			throw new IllegalStateException();
		tex_fill_attr[texturedTriangles] = (byte) 3;
		tex_point_mapx[texturedTriangles] = i;
		tex_point_mapy[texturedTriangles] = i_144_;
		tex_point_mapz[texturedTriangles] = i_145_;
		particles_zlifepsan[texturedTriangles] = i_146_;
		particles_zdir[texturedTriangles] = i_147_;
		particles_xdir[texturedTriangles] = i_148_;
		particles_xlifespan[texturedTriangles] = i_149_;
		aByteArray628[texturedTriangles] = i_150_;
		anIntArray637[texturedTriangles] = i_151_;
		return (byte) texturedTriangles++;
	}

	void decode(byte[] is) {
		RsByteBuffer buffer = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_152_ = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_153_ = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_154_ = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_155_ = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_156_ = new RsByteBuffer(is);
		RsByteBuffer class298_sub53_157_ = new RsByteBuffer(is);
		buffer.index = (is.length - 23) * 116413311;
		vertices = buffer.readUnsignedShort();
		triangles = buffer.readUnsignedShort();
		texturedTriangles = buffer.readUnsignedByte();
		int bitSet = buffer.readUnsignedByte();
		boolean has_fill_attr = (bitSet & 0x1) == 1;
		boolean has_surface_fx = (bitSet & 0x2) == 2;
		boolean has_vertex_normals = (bitSet & 0x4) == 4;
		boolean has_large_size = (bitSet & 0x8) == 8;
		if (has_large_size) {
			buffer.index -= 814893177;
			size = buffer.readUnsignedByte();
			buffer.index += 698479866;
		}
		int priority = buffer.readUnsignedByte();
		int i_162_ = buffer.readUnsignedByte();
		int i_163_ = buffer.readUnsignedByte();
		int i_164_ = buffer.readUnsignedByte();
		int i_165_ = buffer.readUnsignedByte();
		int i_166_ = buffer.readUnsignedShort();
		int i_167_ = buffer.readUnsignedShort();
		int i_168_ = buffer.readUnsignedShort();
		int i_169_ = buffer.readUnsignedShort();
		int i_170_ = buffer.readUnsignedShort();
		int i_172__ = 0;
		int particle_amt = 0;
		int particle_clr = 0;
		if (texturedTriangles > 0) {
			tex_fill_attr = new byte[texturedTriangles];
			buffer.index = 0;
			for (int i = 0; i < texturedTriangles; i++) {
				byte type = (tex_fill_attr[i] = buffer.readByte(-12558881));
				if (type == 0)
					i_172__++;
				if (type >= 1 && type <= 3)
					particle_amt++;
				if (type == 2)
					particle_clr++;
			}
		}
		int i_176_ = texturedTriangles;
		int i_177_ = i_176_;
		i_176_ += vertices;
		int i_178_ = i_176_;
		if (has_fill_attr)
			i_176_ += triangles;
		int i_179_ = i_176_;
		i_176_ += triangles;
		int i_180_ = i_176_;
		if (priority == 255)
			i_176_ += triangles;
		int i_181_ = i_176_;
		if (i_163_ == 1)
			i_176_ += triangles;
		int i_182_ = i_176_;
		if (i_165_ == 1)
			i_176_ += vertices;
		int i_183_ = i_176_;
		if (i_162_ == 1)
			i_176_ += triangles;
		int i_184_ = i_176_;
		i_176_ += i_169_;
		int i_185_ = i_176_;
		if (i_164_ == 1)
			i_176_ += triangles * 2;
		int i_186_ = i_176_;
		i_176_ += i_170_;
		int i_187_ = i_176_;
		i_176_ += triangles * 2;
		int i_188_ = i_176_;
		i_176_ += i_166_;
		int i_189_ = i_176_;
		i_176_ += i_167_;
		int i_190_ = i_176_;
		i_176_ += i_168_;
		int i_191_ = i_176_;
		i_176_ += i_172__ * 6;
		int i_192_ = i_176_;
		i_176_ += particle_amt * 6;
		int i_193_ = 6;
		if (size == 14)
			i_193_ = 7;
		else if (size >= 15)
			i_193_ = 9;
		int i_194_ = i_176_;
		i_176_ += particle_amt * i_193_;
		int i_195_ = i_176_;
		i_176_ += particle_amt;
		int i_196_ = i_176_;
		i_176_ += particle_amt;
		int i_197_ = i_176_;
		i_176_ += particle_amt + particle_clr * 2;
		int i_198_ = i_176_;
		anIntArray616 = new int[vertices];
		anIntArray642 = new int[vertices];
		anIntArray618 = new int[vertices];
		aShortArray644 = new short[triangles];
		aShortArray646 = new short[triangles];
		aShortArray624 = new short[triangles];
		if (i_165_ == 1)
			vertexSkinTypes = new int[vertices];
		if (has_fill_attr)
			face_fill_attributes = new byte[triangles];
		if (priority == 255)
			priorities = new byte[triangles];
		else
			this.priority = (byte) priority;
		if (i_162_ == 1)
			aByteArray627 = new byte[triangles];
		if (i_163_ == 1)
			alpha_channel = new int[triangles];
		if (i_164_ == 1)
			aShortArray617 = new short[triangles];
		if (i_164_ == 1 && texturedTriangles > 0)
			aByteArray635 = new byte[triangles];
		aShortArray629 = new short[triangles];
		if (texturedTriangles > 0) {
			tex_point_mapx = new short[texturedTriangles];
			tex_point_mapy = new short[texturedTriangles];
			tex_point_mapz = new short[texturedTriangles];
			if (particle_amt > 0) {
				particles_zlifepsan = new int[particle_amt];
				particles_zdir = new int[particle_amt];
				particles_xdir = new int[particle_amt];
				particles_xlifespan = new byte[particle_amt];
				aByteArray628 = new byte[particle_amt];
				anIntArray637 = new int[particle_amt];
			}
			if (particle_clr > 0) {
				tex_primary_clr = new int[particle_clr];
				tex_secondary_clr = new int[particle_clr];
			}
		}
		buffer.index = i_177_ * 116413311;
		class298_sub53_152_.index = i_188_ * 116413311;
		class298_sub53_153_.index = i_189_ * 116413311;
		class298_sub53_154_.index = i_190_ * 116413311;
		class298_sub53_155_.index = i_182_ * 116413311;
		int i_199_ = 0;
		int i_200_ = 0;
		int i_201_ = 0;
		for (int i_202_ = 0; i_202_ < vertices; i_202_++) {
			int i_203_ = buffer.readUnsignedByte();
			int i_204_ = 0;
			if ((i_203_ & 0x1) != 0)
				i_204_ = class298_sub53_152_.method3645(590991010);
			int i_205_ = 0;
			if ((i_203_ & 0x2) != 0)
				i_205_ = class298_sub53_153_.method3645(590991010);
			int i_206_ = 0;
			if ((i_203_ & 0x4) != 0)
				i_206_ = class298_sub53_154_.method3645(590991010);
			anIntArray616[i_202_] = i_199_ + i_204_;
			anIntArray642[i_202_] = i_200_ + i_205_;
			anIntArray618[i_202_] = i_201_ + i_206_;
			i_199_ = anIntArray616[i_202_];
			i_200_ = anIntArray642[i_202_];
			i_201_ = anIntArray618[i_202_];
			if (i_165_ == 1)
				vertexSkinTypes[i_202_] = class298_sub53_155_.readUnsignedByte();
		}
		buffer.index = i_187_ * 116413311;
		class298_sub53_152_.index = i_178_ * 116413311;
		class298_sub53_153_.index = i_180_ * 116413311;
		class298_sub53_154_.index = i_183_ * 116413311;
		class298_sub53_155_.index = i_181_ * 116413311;
		class298_sub53_156_.index = i_185_ * 116413311;
		class298_sub53_157_.index = i_186_ * 116413311;
		for (int i_207_ = 0; i_207_ < triangles; i_207_++) {
			aShortArray629[i_207_] = (short) buffer.readUnsignedShort();
			if (has_fill_attr)
				face_fill_attributes[i_207_] = class298_sub53_152_.readByte(-12558881);
			if (priority == 255)
				priorities[i_207_] = class298_sub53_153_.readByte(-12558881);
			if (i_162_ == 1)
				aByteArray627[i_207_] = class298_sub53_154_.readByte(-12558881);
			if (i_163_ == 1)
				alpha_channel[i_207_] = class298_sub53_155_.readUnsignedByte();
			if (i_164_ == 1)
				aShortArray617[i_207_] = (short) (class298_sub53_156_.readUnsignedShort() - 1);
			if (aByteArray635 != null) {
				if (aShortArray617[i_207_] != -1)
					aByteArray635[i_207_] = (byte) (class298_sub53_157_.readUnsignedByte() - 1);
				else
					aByteArray635[i_207_] = (byte) -1;
			}
		}
		anInt626 = -1;
		buffer.index = i_184_ * 116413311;
		class298_sub53_152_.index = i_179_ * 116413311;
		method744(buffer, class298_sub53_152_);
		buffer.index = i_191_ * 116413311;
		class298_sub53_152_.index = i_192_ * 116413311;
		class298_sub53_153_.index = i_194_ * 116413311;
		class298_sub53_154_.index = i_195_ * 116413311;
		class298_sub53_155_.index = i_196_ * 116413311;
		class298_sub53_156_.index = i_197_ * 116413311;
		method745(buffer, class298_sub53_152_, class298_sub53_153_, class298_sub53_154_, class298_sub53_155_, class298_sub53_156_);
		buffer.index = i_198_ * 116413311;
		if (has_surface_fx) {
			int i_208_ = buffer.readUnsignedByte();
			if (i_208_ > 0) {
				aClass85Array647 = new Class85[i_208_];
				for (int i_209_ = 0; i_209_ < i_208_; i_209_++) {
					int i_210_ = buffer.readUnsignedShort();
					int i_211_ = buffer.readUnsignedShort();
					byte i_212_;
					if (priority == 255)
						i_212_ = priorities[i_211_];
					else
						i_212_ = (byte) priority;
					aClass85Array647[i_209_] = new Class85(i_210_, aShortArray644[i_211_], aShortArray646[i_211_], aShortArray624[i_211_], i_212_);
				}
			}
			int i_213_ = buffer.readUnsignedByte();
			if (i_213_ > 0) {
				aClass68Array613 = new Class68[i_213_];
				for (int i_214_ = 0; i_214_ < i_213_; i_214_++) {
					int i_215_ = buffer.readUnsignedShort();
					int i_216_ = buffer.readUnsignedShort();
					aClass68Array613[i_214_] = new Class68(i_215_, i_216_);
				}
			}
		}
		if (has_vertex_normals) {
			int i_217_ = buffer.readUnsignedByte();
			if (i_217_ > 0) {
				aClass84Array649 = new Class84[i_217_];
				for (int i_218_ = 0; i_218_ < i_217_; i_218_++) {
					int i_219_ = buffer.readUnsignedShort();
					int i_220_ = buffer.readUnsignedShort();
					int i_221_ = buffer.readUnsignedByte();
					byte i_222_ = buffer.readByte(-12558881);
					aClass84Array649[i_218_] = new Class84(i_219_, i_220_, i_221_, i_222_);
				}
			}
		}
	}

	public int[][] method759() {
		int[] is = new int[256];
		int i = 0;
		for (int i_223_ = 0; i_223_ < aClass84Array649.length; i_223_++) {
			int i_224_ = aClass84Array649[i_223_].anInt766 * -1606786303;
			if (i_224_ >= 0) {
				is[i_224_]++;
				if (i_224_ > i)
					i = i_224_;
			}
		}
		int[][] is_225_ = new int[i + 1][];
		for (int i_226_ = 0; i_226_ <= i; i_226_++) {
			is_225_[i_226_] = new int[is[i_226_]];
			is[i_226_] = 0;
		}
		for (int i_227_ = 0; i_227_ < aClass84Array649.length; i_227_++) {
			int i_228_ = aClass84Array649[i_227_].anInt766 * -1606786303;
			if (i_228_ >= 0)
				is_225_[i_228_][is[i_228_]++] = i_227_;
		}
		return is_225_;
	}
}
