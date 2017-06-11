/* Class298_Sub24_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggStreamState;
import jagtheora.theora.DecoderContext;
import jagtheora.theora.Frame;
import jagtheora.theora.GranulePos;
import jagtheora.theora.SetupInfo;
import jagtheora.theora.TheoraComment;
import jagtheora.theora.TheoraInfo;

public class Class298_Sub24_Sub3 extends Class298_Sub24 {
	boolean aBoolean9283;
	TheoraInfo aTheoraInfo9284;
	SetupInfo aSetupInfo9285 = new SetupInfo();
	static int anInt9286 = 2048;
	static int anInt9287 = 1024;
	DecoderContext aDecoderContext9288;
	double aDouble9289;
	Frame aFrame9290;
	int anInt9291;
	long aLong9292;
	boolean aBoolean9293;
	GranulePos aGranulePos9294;
	int anInt9295;
	TheoraComment aTheoraComment9296;
	boolean aBoolean9297;
	Object anObject9298;
	boolean aBoolean9299;

	Class298_Sub24_Sub3(OggStreamState oggstreamstate) {
		super(oggstreamstate);
		((Class298_Sub24_Sub3) this).aTheoraInfo9284 = new TheoraInfo();
		((Class298_Sub24_Sub3) this).aTheoraComment9296 = new TheoraComment();
	}

	float method3084(int i) {
		try {
			if (!((Class298_Sub24_Sub3) this).aBoolean9293 || ((Class298_Sub24_Sub3) this).aTheoraInfo9284.a())
				return 0.0F;
			return ((float) (((Class298_Sub24_Sub3) this).aTheoraInfo9284.fpsNumerator) / (float) (((Class298_Sub24_Sub3) this).aTheoraInfo9284.fpsDenominator));
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.n(").append(')').toString());
		}
	}

	double method3085(int i) {
		try {
			return ((Class298_Sub24_Sub3) this).aDouble9289;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.s(").append(')').toString());
		}
	}

	long method3086(byte i) {
		try {
			return (((Class298_Sub24_Sub3) this).aLong9292 * 7179368485346321301L);
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.z(").append(')').toString());
		}
	}

	boolean method3087(int i) {
		try {
			return ((Class298_Sub24_Sub3) this).aBoolean9293;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.y(").append(')').toString());
		}
	}

	void method3075(int i) {
		try {
			if (((Class298_Sub24_Sub3) this).aFrame9290 != null)
				((Class298_Sub24_Sub3) this).aFrame9290.f();
			if (null != ((Class298_Sub24_Sub3) this).aDecoderContext9288) {
				((Class298_Sub24_Sub3) this).aDecoderContext9288.f();
				((Class298_Sub24_Sub3) this).aDecoderContext9288 = null;
			}
			if (null != ((Class298_Sub24_Sub3) this).aGranulePos9294) {
				((Class298_Sub24_Sub3) this).aGranulePos9294.f();
				((Class298_Sub24_Sub3) this).aGranulePos9294 = null;
			}
			((Class298_Sub24_Sub3) this).aTheoraInfo9284.f();
			((Class298_Sub24_Sub3) this).aTheoraComment9296.f();
			((Class298_Sub24_Sub3) this).aSetupInfo9285.f();
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.b(").append(')').toString());
		}
	}

	public Object method3088(Interface15 interface15, int i) {
		try {
			if (null == ((Class298_Sub24_Sub3) this).aFrame9290)
				return null;
			if (!((Class298_Sub24_Sub3) this).aBoolean9299 && null != ((Class298_Sub24_Sub3) this).anObject9298)
				return ((Class298_Sub24_Sub3) this).anObject9298;
			((Class298_Sub24_Sub3) this).anObject9298 = (interface15.method214(((Class298_Sub24_Sub3) this).aFrame9290.pixels, 0, 1264450863 * ((Class298_Sub24_Sub3) this).aFrame9290.a, ((Class298_Sub24_Sub3) this).aFrame9290.a * 1264450863, -1459424961 * ((Class298_Sub24_Sub3) this).aFrame9290.f, false, 1108085908));
			((Class298_Sub24_Sub3) this).aBoolean9299 = false;
			return ((Class298_Sub24_Sub3) this).anObject9298;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.c(").append(')').toString());
		}
	}

	void method3077(OggPacket oggpacket) {
		if (!((Class298_Sub24_Sub3) this).aBoolean9293) {
			int i = (((Class298_Sub24_Sub3) this).aSetupInfo9285.decodeHeader(((Class298_Sub24_Sub3) this).aTheoraInfo9284, ((Class298_Sub24_Sub3) this).aTheoraComment9296, oggpacket));
			if (0 == i) {
				((Class298_Sub24_Sub3) this).aBoolean9293 = true;
				if ((((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameWidth > 2048) || (((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameHeight) > 1024)
					throw new IllegalStateException();
				((Class298_Sub24_Sub3) this).aDecoderContext9288 = new DecoderContext((((Class298_Sub24_Sub3) this).aTheoraInfo9284), (((Class298_Sub24_Sub3) this).aSetupInfo9285));
				((Class298_Sub24_Sub3) this).aGranulePos9294 = new GranulePos();
				((Class298_Sub24_Sub3) this).aFrame9290 = new Frame((((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameWidth), (((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameHeight));
				((Class298_Sub24_Sub3) this).anInt9295 = ((Class298_Sub24_Sub3) this).aDecoderContext9288.getMaxPostProcessingLevel() * 295322609;
				method3089((-2058603981 * ((Class298_Sub24_Sub3) this).anInt9291), (byte) 77);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			((Class298_Sub24_Sub3) this).aLong9292 = Class122.method1319((byte) 1) * 4704549656485466045L;
			int i = (((Class298_Sub24_Sub3) this).aDecoderContext9288.decodePacketIn(oggpacket, ((Class298_Sub24_Sub3) this).aGranulePos9294));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			((Class298_Sub24_Sub3) this).aDecoderContext9288.granuleFrame(((Class298_Sub24_Sub3) this).aGranulePos9294);
			((Class298_Sub24_Sub3) this).aDouble9289 = (((Class298_Sub24_Sub3) this).aDecoderContext9288.granuleTime(((Class298_Sub24_Sub3) this).aGranulePos9294));
			if (((Class298_Sub24_Sub3) this).aBoolean9297) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					((Class298_Sub24_Sub3) this).aBoolean9297 = false;
				else
					return;
			}
			if (!((Class298_Sub24_Sub3) this).aBoolean9283 || oggpacket.isKeyFrame() == 1) {
				if (((Class298_Sub24_Sub3) this).aDecoderContext9288.decodeFrame(((Class298_Sub24_Sub3) this).aFrame9290) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				((Class298_Sub24_Sub3) this).aBoolean9299 = true;
			}
		}
	}

	void method3078(OggPacket oggpacket) {
		if (!((Class298_Sub24_Sub3) this).aBoolean9293) {
			int i = (((Class298_Sub24_Sub3) this).aSetupInfo9285.decodeHeader(((Class298_Sub24_Sub3) this).aTheoraInfo9284, ((Class298_Sub24_Sub3) this).aTheoraComment9296, oggpacket));
			if (0 == i) {
				((Class298_Sub24_Sub3) this).aBoolean9293 = true;
				if ((((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameWidth > 2048) || (((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameHeight) > 1024)
					throw new IllegalStateException();
				((Class298_Sub24_Sub3) this).aDecoderContext9288 = new DecoderContext((((Class298_Sub24_Sub3) this).aTheoraInfo9284), (((Class298_Sub24_Sub3) this).aSetupInfo9285));
				((Class298_Sub24_Sub3) this).aGranulePos9294 = new GranulePos();
				((Class298_Sub24_Sub3) this).aFrame9290 = new Frame((((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameWidth), (((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameHeight));
				((Class298_Sub24_Sub3) this).anInt9295 = ((Class298_Sub24_Sub3) this).aDecoderContext9288.getMaxPostProcessingLevel() * 295322609;
				method3089((-2058603981 * ((Class298_Sub24_Sub3) this).anInt9291), (byte) 12);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			((Class298_Sub24_Sub3) this).aLong9292 = Class122.method1319((byte) 1) * 4704549656485466045L;
			int i = (((Class298_Sub24_Sub3) this).aDecoderContext9288.decodePacketIn(oggpacket, ((Class298_Sub24_Sub3) this).aGranulePos9294));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			((Class298_Sub24_Sub3) this).aDecoderContext9288.granuleFrame(((Class298_Sub24_Sub3) this).aGranulePos9294);
			((Class298_Sub24_Sub3) this).aDouble9289 = (((Class298_Sub24_Sub3) this).aDecoderContext9288.granuleTime(((Class298_Sub24_Sub3) this).aGranulePos9294));
			if (((Class298_Sub24_Sub3) this).aBoolean9297) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					((Class298_Sub24_Sub3) this).aBoolean9297 = false;
				else
					return;
			}
			if (!((Class298_Sub24_Sub3) this).aBoolean9283 || oggpacket.isKeyFrame() == 1) {
				if (((Class298_Sub24_Sub3) this).aDecoderContext9288.decodeFrame(((Class298_Sub24_Sub3) this).aFrame9290) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				((Class298_Sub24_Sub3) this).aBoolean9299 = true;
			}
		}
	}

	void method3072() {
		if (((Class298_Sub24_Sub3) this).aFrame9290 != null)
			((Class298_Sub24_Sub3) this).aFrame9290.f();
		if (null != ((Class298_Sub24_Sub3) this).aDecoderContext9288) {
			((Class298_Sub24_Sub3) this).aDecoderContext9288.f();
			((Class298_Sub24_Sub3) this).aDecoderContext9288 = null;
		}
		if (null != ((Class298_Sub24_Sub3) this).aGranulePos9294) {
			((Class298_Sub24_Sub3) this).aGranulePos9294.f();
			((Class298_Sub24_Sub3) this).aGranulePos9294 = null;
		}
		((Class298_Sub24_Sub3) this).aTheoraInfo9284.f();
		((Class298_Sub24_Sub3) this).aTheoraComment9296.f();
		((Class298_Sub24_Sub3) this).aSetupInfo9285.f();
	}

	void method3074(OggPacket oggpacket, int i) {
		try {
			if (!((Class298_Sub24_Sub3) this).aBoolean9293) {
				int i_0_ = (((Class298_Sub24_Sub3) this).aSetupInfo9285.decodeHeader(((Class298_Sub24_Sub3) this).aTheoraInfo9284, ((Class298_Sub24_Sub3) this).aTheoraComment9296, oggpacket));
				if (0 == i_0_) {
					((Class298_Sub24_Sub3) this).aBoolean9293 = true;
					if ((((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameWidth) > 2048 || (((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameHeight) > 1024)
						throw new IllegalStateException();
					((Class298_Sub24_Sub3) this).aDecoderContext9288 = new DecoderContext((((Class298_Sub24_Sub3) this).aTheoraInfo9284), (((Class298_Sub24_Sub3) this).aSetupInfo9285));
					((Class298_Sub24_Sub3) this).aGranulePos9294 = new GranulePos();
					((Class298_Sub24_Sub3) this).aFrame9290 = new Frame((((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameWidth), (((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameHeight));
					((Class298_Sub24_Sub3) this).anInt9295 = ((Class298_Sub24_Sub3) this).aDecoderContext9288.getMaxPostProcessingLevel() * 295322609;
					method3089((-2058603981 * ((Class298_Sub24_Sub3) this).anInt9291), (byte) 41);
				} else if (i_0_ < 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i_0_).toString());
			} else {
				((Class298_Sub24_Sub3) this).aLong9292 = Class122.method1319((byte) 1) * 4704549656485466045L;
				int i_1_ = (((Class298_Sub24_Sub3) this).aDecoderContext9288.decodePacketIn(oggpacket, ((Class298_Sub24_Sub3) this).aGranulePos9294));
				if (i_1_ < 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i_1_).toString());
				((Class298_Sub24_Sub3) this).aDecoderContext9288.granuleFrame(((Class298_Sub24_Sub3) this).aGranulePos9294);
				((Class298_Sub24_Sub3) this).aDouble9289 = (((Class298_Sub24_Sub3) this).aDecoderContext9288.granuleTime(((Class298_Sub24_Sub3) this).aGranulePos9294));
				if (((Class298_Sub24_Sub3) this).aBoolean9297) {
					boolean bool = oggpacket.isKeyFrame() == 1;
					if (bool)
						((Class298_Sub24_Sub3) this).aBoolean9297 = false;
					else
						return;
				}
				if (!((Class298_Sub24_Sub3) this).aBoolean9283 || oggpacket.isKeyFrame() == 1) {
					if ((((Class298_Sub24_Sub3) this).aDecoderContext9288.decodeFrame(((Class298_Sub24_Sub3) this).aFrame9290)) != 0)
						throw new IllegalStateException(new StringBuilder().append("").append(i_1_).toString());
					((Class298_Sub24_Sub3) this).aBoolean9299 = true;
				}
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.f(").append(')').toString());
		}
	}

	void method3089(int i, byte i_2_) {
		try {
			((Class298_Sub24_Sub3) this).anInt9291 = -703457029 * i;
			if (((Class298_Sub24_Sub3) this).aBoolean9293) {
				if (-2058603981 * ((Class298_Sub24_Sub3) this).anInt9291 > -42840815 * ((Class298_Sub24_Sub3) this).anInt9295)
					((Class298_Sub24_Sub3) this).anInt9291 = ((Class298_Sub24_Sub3) this).anInt9295 * -679663701;
				if (-2058603981 * ((Class298_Sub24_Sub3) this).anInt9291 < 0)
					((Class298_Sub24_Sub3) this).anInt9291 = 0;
				((Class298_Sub24_Sub3) this).aDecoderContext9288.setPostProcessingLevel(-2058603981 * ((Class298_Sub24_Sub3) this).anInt9291);
			}
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.q(").append(')').toString());
		}
	}

	void method3079() {
		if (((Class298_Sub24_Sub3) this).aFrame9290 != null)
			((Class298_Sub24_Sub3) this).aFrame9290.f();
		if (null != ((Class298_Sub24_Sub3) this).aDecoderContext9288) {
			((Class298_Sub24_Sub3) this).aDecoderContext9288.f();
			((Class298_Sub24_Sub3) this).aDecoderContext9288 = null;
		}
		if (null != ((Class298_Sub24_Sub3) this).aGranulePos9294) {
			((Class298_Sub24_Sub3) this).aGranulePos9294.f();
			((Class298_Sub24_Sub3) this).aGranulePos9294 = null;
		}
		((Class298_Sub24_Sub3) this).aTheoraInfo9284.f();
		((Class298_Sub24_Sub3) this).aTheoraComment9296.f();
		((Class298_Sub24_Sub3) this).aSetupInfo9285.f();
	}

	void method3076(OggPacket oggpacket) {
		if (!((Class298_Sub24_Sub3) this).aBoolean9293) {
			int i = (((Class298_Sub24_Sub3) this).aSetupInfo9285.decodeHeader(((Class298_Sub24_Sub3) this).aTheoraInfo9284, ((Class298_Sub24_Sub3) this).aTheoraComment9296, oggpacket));
			if (0 == i) {
				((Class298_Sub24_Sub3) this).aBoolean9293 = true;
				if ((((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameWidth > 2048) || (((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameHeight) > 1024)
					throw new IllegalStateException();
				((Class298_Sub24_Sub3) this).aDecoderContext9288 = new DecoderContext((((Class298_Sub24_Sub3) this).aTheoraInfo9284), (((Class298_Sub24_Sub3) this).aSetupInfo9285));
				((Class298_Sub24_Sub3) this).aGranulePos9294 = new GranulePos();
				((Class298_Sub24_Sub3) this).aFrame9290 = new Frame((((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameWidth), (((Class298_Sub24_Sub3) this).aTheoraInfo9284.frameHeight));
				((Class298_Sub24_Sub3) this).anInt9295 = ((Class298_Sub24_Sub3) this).aDecoderContext9288.getMaxPostProcessingLevel() * 295322609;
				method3089((-2058603981 * ((Class298_Sub24_Sub3) this).anInt9291), (byte) 95);
			} else if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
		} else {
			((Class298_Sub24_Sub3) this).aLong9292 = Class122.method1319((byte) 1) * 4704549656485466045L;
			int i = (((Class298_Sub24_Sub3) this).aDecoderContext9288.decodePacketIn(oggpacket, ((Class298_Sub24_Sub3) this).aGranulePos9294));
			if (i < 0)
				throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
			((Class298_Sub24_Sub3) this).aDecoderContext9288.granuleFrame(((Class298_Sub24_Sub3) this).aGranulePos9294);
			((Class298_Sub24_Sub3) this).aDouble9289 = (((Class298_Sub24_Sub3) this).aDecoderContext9288.granuleTime(((Class298_Sub24_Sub3) this).aGranulePos9294));
			if (((Class298_Sub24_Sub3) this).aBoolean9297) {
				boolean bool = oggpacket.isKeyFrame() == 1;
				if (bool)
					((Class298_Sub24_Sub3) this).aBoolean9297 = false;
				else
					return;
			}
			if (!((Class298_Sub24_Sub3) this).aBoolean9283 || oggpacket.isKeyFrame() == 1) {
				if (((Class298_Sub24_Sub3) this).aDecoderContext9288.decodeFrame(((Class298_Sub24_Sub3) this).aFrame9290) != 0)
					throw new IllegalStateException(new StringBuilder().append("").append(i).toString());
				((Class298_Sub24_Sub3) this).aBoolean9299 = true;
			}
		}
	}

	public static boolean method3090(int i, int i_3_) {
		try {
			if (Class87.anInt804 * 296787703 != i || null == Class118.aClass88_1402) {
				Class228.method2117(224664390);
				Class118.aClass88_1402 = Class88.aClass88_808;
				Class87.anInt804 = -1692564793 * i;
			}
			if (Class118.aClass88_1402 == Class88.aClass88_808) {
				byte[] is = Class399.aClass243_5220.method2294(i, (byte) 45);
				if (is == null)
					return false;
				RsByteBuffer class298_sub53 = new RsByteBuffer(is);
				Class339.method4125(class298_sub53, -2093041337);
				int i_4_ = class298_sub53.readUnsignedByte();
				for (int i_5_ = 0; i_5_ < i_4_; i_5_++)
					Class87.aClass453_799.method5935(new Class298_Sub7(class298_sub53), -51345743);
				int i_6_ = class298_sub53.readUnsignedSmart(1723054621);
				Class87.aClass75Array805 = new Class75[i_6_];
				for (int i_7_ = 0; i_7_ < i_6_; i_7_++)
					Class87.aClass75Array805[i_7_] = new Class75(class298_sub53);
				int i_8_ = class298_sub53.readUnsignedSmart(1723054621);
				Class87.aClass94Array794 = new Class94[i_8_];
				for (int i_9_ = 0; i_9_ < i_8_; i_9_++)
					Class87.aClass94Array794[i_9_] = new Class94(class298_sub53, i_9_);
				int i_10_ = class298_sub53.readUnsignedSmart(1723054621);
				Class87.aClass86Array798 = new Class86[i_10_];
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++)
					Class87.aClass86Array798[i_11_] = new Class86(class298_sub53);
				int i_12_ = class298_sub53.readUnsignedSmart(1723054621);
				Class87.aClass80Array795 = new Class80[i_12_];
				for (int i_13_ = 0; i_13_ < i_12_; i_13_++)
					Class87.aClass80Array795[i_13_] = new Class80(class298_sub53);
				int i_14_ = class298_sub53.readUnsignedSmart(1723054621);
				Class87.aClass82Array797 = new Class82[i_14_];
				for (int i_15_ = 0; i_15_ < i_14_; i_15_++)
					Class87.aClass82Array797[i_15_] = Class161_Sub1_Sub1.method1740(class298_sub53, (byte) -73);
				Class118.aClass88_1402 = Class88.aClass88_809;
			}
			if (Class118.aClass88_1402 == Class88.aClass88_809) {
				boolean bool = true;
				Class94[] class94s = Class87.aClass94Array794;
				for (int i_16_ = 0; i_16_ < class94s.length; i_16_++) {
					Class94 class94 = class94s[i_16_];
					if (!class94.method1019(1510757465))
						bool = false;
				}
				Class82[] class82s = Class87.aClass82Array797;
				for (int i_17_ = 0; i_17_ < class82s.length; i_17_++) {
					Class82 class82 = class82s[i_17_];
					if (!class82.method870(856848171))
						bool = false;
				}
				Class86[] class86s = Class87.aClass86Array798;
				for (int i_18_ = 0; i_18_ < class86s.length; i_18_++) {
					Class86 class86 = class86s[i_18_];
					if (!class86.method960((byte) 81))
						bool = false;
				}
				if (!bool)
					return false;
				Class118.aClass88_1402 = Class88.aClass88_807;
			}
			return true;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("ajq.a(").append(')').toString());
		}
	}
}
