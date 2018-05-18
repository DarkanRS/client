
/* Class278 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

public abstract class Class278 {
	OggPage anOggPage3352;
	boolean aBool3353;
	byte[] aByteArray3354;
	OggSyncState anOggSyncState3355;
	OggPacket anOggPacket3356;
	static final int anInt3357 = 10;
	IterableNodeMap aClass465_3358;
	boolean aBool3359;
	boolean aBool3360;
	boolean aBool3361;
	static final int anInt3362 = 50;
	Class282_Sub41_Sub3 aClass282_Sub41_Sub3_3363;
	Class282_Sub41_Sub2 aClass282_Sub41_Sub2_3364;
	String aString3365;
	Class282_Sub41_Sub4 aClass282_Sub41_Sub4_3366;

	public Class282_Sub41_Sub3 method4909() {
		return ((Class278) this).aClass282_Sub41_Sub3_3363;
	}

	boolean method4910(int i) {
		if (null != ((Class278) this).aClass282_Sub41_Sub4_3366)
			return (!((Class278) this).aClass282_Sub41_Sub3_3363.method14794(-1464343328) || method4923(24293549) > ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255));
		double d = (double) ((Class278) this).aClass282_Sub41_Sub3_3363.method14791(-1670765094);
		return (d == 0.0 || ((double) Class169.method2869(2019710921) >= (double) ((Class278) this).aClass282_Sub41_Sub3_3363.method14793(2126760544) + 1000.0 / d));
	}

	Class282_Sub41 method4911(byte i) throws IOException {
		if (((Class278) this).aBool3360)
			throw new IllegalStateException();
		if (((Class278) this).aBool3361)
			return null;
		while (((Class278) this).anOggSyncState3355.pageOut(((Class278) this).anOggPage3352) <= 0) {
			int i_0_ = method4951(((Class278) this).aByteArray3354, -1649772947);
			if (i_0_ == -1) {
				((Class278) this).aBool3361 = true;
				return null;
			}
			if (i_0_ == 0)
				return null;
			if (!((Class278) this).anOggSyncState3355.write(((Class278) this).aByteArray3354, i_0_))
				throw new RuntimeException("");
		}
		int i_1_ = ((Class278) this).anOggPage3352.getSerialNumber();
		if (((Class278) this).anOggPage3352.isBOS()) {
			OggStreamState oggstreamstate = new OggStreamState(i_1_);
			if (!oggstreamstate.pageIn(((Class278) this).anOggPage3352))
				throw new IllegalStateException();
			if (oggstreamstate.packetPeek(((Class278) this).anOggPacket3356) != 1)
				throw new IllegalStateException();
			Class282_Sub41 class282_sub41;
			if (((Class278) this).aClass282_Sub41_Sub3_3363 == null && ((Class278) this).anOggPacket3356.isTheora()) {
				((Class278) this).aClass282_Sub41_Sub3_3363 = new Class282_Sub41_Sub3(oggstreamstate);
				class282_sub41 = ((Class278) this).aClass282_Sub41_Sub3_3363;
			} else if (((Class278) this).aClass282_Sub41_Sub4_3366 == null && ((Class278) this).anOggPacket3356.isVorbis()) {
				((Class278) this).aClass282_Sub41_Sub4_3366 = new Class282_Sub41_Sub4(oggstreamstate);
				class282_sub41 = ((Class278) this).aClass282_Sub41_Sub4_3366;
			} else {
				byte[] is = ((Class278) this).anOggPacket3356.getData();
				StringBuilder stringbuilder = new StringBuilder();
				for (int i_2_ = 1; (i_2_ < is.length && Character.isLetterOrDigit((char) is[i_2_])); i_2_++)
					stringbuilder.append((char) is[i_2_]);
				String string = stringbuilder.toString();
				if (string.equals("kate"))
					class282_sub41 = new Class282_Sub41_Sub2(oggstreamstate);
				else
					class282_sub41 = new Class282_Sub41_Sub1(oggstreamstate);
			}
			((Class278) this).aClass465_3358.method7765(class282_sub41, (long) i_1_);
			return class282_sub41;
		}
		Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7754((long) i_1_));
		if (!((Class282_Sub41) class282_sub41).anOggStreamState8032.pageIn(((Class278) this).anOggPage3352))
			throw new IllegalStateException();
		return class282_sub41;
	}

	public void method4912() throws IOException {
		if (!((Class278) this).aBool3353) {
			while_72_: for (/**/; !((Class278) this).aBool3360; ((Class278) this).aBool3359 = false) {
				Class282_Sub41 class282_sub41;
				if (!((Class278) this).aBool3359) {
					class282_sub41 = method4911((byte) 121);
					if (class282_sub41 == null) {
						if (((Class278) this).aBool3361)
							method4916(1516535457);
						break;
					}
					if (class282_sub41 == null)
						throw new IllegalStateException();
					((Class278) this).aBool3359 = true;
				} else
					class282_sub41 = ((Class282_Sub41) (((Class278) this).aClass465_3358.method7754((long) ((Class278) this).anOggPage3352.getSerialNumber())));
				if (((Class278) this).aClass282_Sub41_Sub4_3366 == class282_sub41) {
					if (((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1637154872) < 50) {
						do {
							if ((((Class282_Sub41_Sub4) ((Class278) this).aClass282_Sub41_Sub4_3366).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356)) != 1)
								continue while_72_;
							((Class278) this).aClass282_Sub41_Sub4_3366.method13361(((Class278) this).anOggPacket3356, (byte) 14);
							method4942(1684580210);
							if (((Class278) this).aClass282_Sub41_Sub3_3363 != null) {
								double d = ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255);
								for (int i = 0; i < 10 && method4910(2126681819); i++) {
									method4913(-1250579369);
									if (((Class278) this).aBool3360)
										return;
								}
								if (d < ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255))
									break;
							}
						} while (((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1369444134) < 50);
						break;
					}
					break;
				}
				if (class282_sub41 instanceof Class282_Sub41_Sub2)
					method4942(-423819918);
				else if (((Class278) this).aClass282_Sub41_Sub3_3363 != class282_sub41) {
					while (((Class282_Sub41) class282_sub41).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) == 1) {
						if (1 == (((Class282_Sub41) class282_sub41).anInt8031 * -509226247) && class282_sub41 instanceof Class282_Sub41_Sub2)
							method4915(((Class278) this).aString3365, 264858153);
						class282_sub41.method13361((((Class278) this).anOggPacket3356), (byte) 14);
					}
				} else if (null == ((Class278) this).aClass282_Sub41_Sub4_3366 && !((Class278) this).aBool3353) {
					for (int i = 0; i < 10 && method4910(-482828030); i++) {
						method4913(790988349);
						if (((Class278) this).aBool3360)
							break;
					}
					break;
				}
			}
		}
	}

	void method4913(int i) throws IOException {
		while (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) != 1) {
			Class282_Sub41 class282_sub41 = method4911((byte) 119);
			if (null == class282_sub41) {
				if (((Class278) this).aBool3361)
					method4916(1516535457);
				return;
			}
			if (class282_sub41 == ((Class278) this).aClass282_Sub41_Sub2_3364)
				method4942(1272558981);
		}
		((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
	}

	public Class282_Sub41_Sub4 method4914(int i) {
		return ((Class278) this).aClass282_Sub41_Sub4_3366;
	}

	public void method4915(String string, int i) {
		((Class278) this).aString3365 = string;
		if (((Class278) this).aString3365 == null)
			((Class278) this).aClass282_Sub41_Sub2_3364 = null;
		else {
			if (null != ((Class278) this).aClass282_Sub41_Sub2_3364 && !(((Class278) this).aString3365.equals(((Class278) this).aClass282_Sub41_Sub2_3364.method14703(366618468))))
				((Class278) this).aClass282_Sub41_Sub2_3364 = null;
			if (null == ((Class278) this).aClass282_Sub41_Sub2_3364) {
				for (Class282_Sub41 class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-1121671279); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 18)) {
					if (class282_sub41 instanceof Class282_Sub41_Sub2) {
						Class282_Sub41_Sub2 class282_sub41_sub2 = (Class282_Sub41_Sub2) class282_sub41;
						if (((Class278) this).aString3365.equals(class282_sub41_sub2.method14703(314176350))) {
							((Class278) this).aClass282_Sub41_Sub2_3364 = class282_sub41_sub2;
							break;
						}
					}
				}
			}
		}
	}

	void method4916(int i) {
		for (Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-934664274)); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 92)) {
			if (((Class278) this).aClass282_Sub41_Sub3_3363 != class282_sub41) {
				while (((Class282_Sub41) class282_sub41).anOggStreamState8032.packetOut() == 1)
					class282_sub41.method13361((((Class278) this).anOggPacket3356), (byte) 14);
			}
		}
		if (((Class278) this).aClass282_Sub41_Sub3_3363 != null) {
			for (int i_3_ = 0; i_3_ < 10 && method4910(-1822567904); i_3_++) {
				if (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut() != 1) {
					method4947((byte) 12);
					break;
				}
				((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
			}
		}
	}

	void method4917() throws IOException {
		while (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) != 1) {
			Class282_Sub41 class282_sub41 = method4911((byte) 24);
			if (null == class282_sub41) {
				if (((Class278) this).aBool3361)
					method4916(1516535457);
				return;
			}
			if (class282_sub41 == ((Class278) this).aClass282_Sub41_Sub2_3364)
				method4942(1118780114);
		}
		((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
	}

	public Class282_Sub41_Sub3 method4918(int i) {
		return ((Class278) this).aClass282_Sub41_Sub3_3363;
	}

	boolean method4919() {
		if (null != ((Class278) this).aClass282_Sub41_Sub4_3366)
			return (!((Class278) this).aClass282_Sub41_Sub3_3363.method14794(-1082487367) || (method4923(-1110848895) > ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255)));
		double d = (double) ((Class278) this).aClass282_Sub41_Sub3_3363.method14791(-737725705);
		return (d == 0.0 || ((double) Class169.method2869(2111890419) >= (double) ((Class278) this).aClass282_Sub41_Sub3_3363.method14793(1488184084) + 1000.0 / d));
	}

	Class282_Sub41 method4920() throws IOException {
		if (((Class278) this).aBool3360)
			throw new IllegalStateException();
		if (((Class278) this).aBool3361)
			return null;
		while (((Class278) this).anOggSyncState3355.pageOut(((Class278) this).anOggPage3352) <= 0) {
			int i = method4951(((Class278) this).aByteArray3354, -2140037633);
			if (i == -1) {
				((Class278) this).aBool3361 = true;
				return null;
			}
			if (i == 0)
				return null;
			if (!((Class278) this).anOggSyncState3355.write(((Class278) this).aByteArray3354, i))
				throw new RuntimeException("");
		}
		int i = ((Class278) this).anOggPage3352.getSerialNumber();
		if (((Class278) this).anOggPage3352.isBOS()) {
			OggStreamState oggstreamstate = new OggStreamState(i);
			if (!oggstreamstate.pageIn(((Class278) this).anOggPage3352))
				throw new IllegalStateException();
			if (oggstreamstate.packetPeek(((Class278) this).anOggPacket3356) != 1)
				throw new IllegalStateException();
			Class282_Sub41 class282_sub41;
			if (((Class278) this).aClass282_Sub41_Sub3_3363 == null && ((Class278) this).anOggPacket3356.isTheora()) {
				((Class278) this).aClass282_Sub41_Sub3_3363 = new Class282_Sub41_Sub3(oggstreamstate);
				class282_sub41 = ((Class278) this).aClass282_Sub41_Sub3_3363;
			} else if (((Class278) this).aClass282_Sub41_Sub4_3366 == null && ((Class278) this).anOggPacket3356.isVorbis()) {
				((Class278) this).aClass282_Sub41_Sub4_3366 = new Class282_Sub41_Sub4(oggstreamstate);
				class282_sub41 = ((Class278) this).aClass282_Sub41_Sub4_3366;
			} else {
				byte[] is = ((Class278) this).anOggPacket3356.getData();
				StringBuilder stringbuilder = new StringBuilder();
				for (int i_4_ = 1; (i_4_ < is.length && Character.isLetterOrDigit((char) is[i_4_])); i_4_++)
					stringbuilder.append((char) is[i_4_]);
				String string = stringbuilder.toString();
				if (string.equals("kate"))
					class282_sub41 = new Class282_Sub41_Sub2(oggstreamstate);
				else
					class282_sub41 = new Class282_Sub41_Sub1(oggstreamstate);
			}
			((Class278) this).aClass465_3358.method7765(class282_sub41, (long) i);
			return class282_sub41;
		}
		Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7754((long) i));
		if (!((Class282_Sub41) class282_sub41).anOggStreamState8032.pageIn(((Class278) this).anOggPage3352))
			throw new IllegalStateException();
		return class282_sub41;
	}

	public boolean method4921(byte i) {
		if (!((Class278) this).aBool3360 && !((Class278) this).aBool3361)
			return false;
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null && ((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1747379029) > 0)
			return false;
		return true;
	}

	public Class282_Sub41_Sub2 method4922() {
		return ((Class278) this).aClass282_Sub41_Sub2_3364;
	}

	public double method4923(int i) {
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null)
			return ((Class278) this).aClass282_Sub41_Sub4_3366.method14848(2074842940);
		if (null != ((Class278) this).aClass282_Sub41_Sub3_3363)
			return ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255);
		return 0.0;
	}

	public void method4924(boolean bool, int i) {
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null) {
			Class282_Sub15_Sub1 class282_sub15_sub1 = ((Class278) this).aClass282_Sub41_Sub4_3366.method14845(1918232773);
			if (null != class282_sub15_sub1)
				class282_sub15_sub1.method14816(bool, -910374946);
		}
		((Class278) this).aBool3353 = !((Class278) this).aBool3353;
	}

	abstract int method4925(byte[] is) throws IOException;

	public Class282_Sub41_Sub2 method4926() {
		return ((Class278) this).aClass282_Sub41_Sub2_3364;
	}

	Class282_Sub41 method4927() throws IOException {
		if (((Class278) this).aBool3360)
			throw new IllegalStateException();
		if (((Class278) this).aBool3361)
			return null;
		while (((Class278) this).anOggSyncState3355.pageOut(((Class278) this).anOggPage3352) <= 0) {
			int i = method4951(((Class278) this).aByteArray3354, -1080013090);
			if (i == -1) {
				((Class278) this).aBool3361 = true;
				return null;
			}
			if (i == 0)
				return null;
			if (!((Class278) this).anOggSyncState3355.write(((Class278) this).aByteArray3354, i))
				throw new RuntimeException("");
		}
		int i = ((Class278) this).anOggPage3352.getSerialNumber();
		if (((Class278) this).anOggPage3352.isBOS()) {
			OggStreamState oggstreamstate = new OggStreamState(i);
			if (!oggstreamstate.pageIn(((Class278) this).anOggPage3352))
				throw new IllegalStateException();
			if (oggstreamstate.packetPeek(((Class278) this).anOggPacket3356) != 1)
				throw new IllegalStateException();
			Class282_Sub41 class282_sub41;
			if (((Class278) this).aClass282_Sub41_Sub3_3363 == null && ((Class278) this).anOggPacket3356.isTheora()) {
				((Class278) this).aClass282_Sub41_Sub3_3363 = new Class282_Sub41_Sub3(oggstreamstate);
				class282_sub41 = ((Class278) this).aClass282_Sub41_Sub3_3363;
			} else if (((Class278) this).aClass282_Sub41_Sub4_3366 == null && ((Class278) this).anOggPacket3356.isVorbis()) {
				((Class278) this).aClass282_Sub41_Sub4_3366 = new Class282_Sub41_Sub4(oggstreamstate);
				class282_sub41 = ((Class278) this).aClass282_Sub41_Sub4_3366;
			} else {
				byte[] is = ((Class278) this).anOggPacket3356.getData();
				StringBuilder stringbuilder = new StringBuilder();
				for (int i_5_ = 1; (i_5_ < is.length && Character.isLetterOrDigit((char) is[i_5_])); i_5_++)
					stringbuilder.append((char) is[i_5_]);
				String string = stringbuilder.toString();
				if (string.equals("kate"))
					class282_sub41 = new Class282_Sub41_Sub2(oggstreamstate);
				else
					class282_sub41 = new Class282_Sub41_Sub1(oggstreamstate);
			}
			((Class278) this).aClass465_3358.method7765(class282_sub41, (long) i);
			return class282_sub41;
		}
		Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7754((long) i));
		if (!((Class282_Sub41) class282_sub41).anOggStreamState8032.pageIn(((Class278) this).anOggPage3352))
			throw new IllegalStateException();
		return class282_sub41;
	}

	public boolean method4928() {
		if (!((Class278) this).aBool3360 && !((Class278) this).aBool3361)
			return false;
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null && ((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1416978407) > 0)
			return false;
		return true;
	}

	public void method4929() throws IOException {
		if (!((Class278) this).aBool3353) {
			while_74_: for (/**/; !((Class278) this).aBool3360; ((Class278) this).aBool3359 = false) {
				Class282_Sub41 class282_sub41;
				if (!((Class278) this).aBool3359) {
					class282_sub41 = method4911((byte) 107);
					if (class282_sub41 == null) {
						if (((Class278) this).aBool3361)
							method4916(1516535457);
						break;
					}
					if (class282_sub41 == null)
						throw new IllegalStateException();
					((Class278) this).aBool3359 = true;
				} else
					class282_sub41 = ((Class282_Sub41) (((Class278) this).aClass465_3358.method7754((long) ((Class278) this).anOggPage3352.getSerialNumber())));
				if (((Class278) this).aClass282_Sub41_Sub4_3366 == class282_sub41) {
					if (((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1500584204) < 50) {
						do {
							if ((((Class282_Sub41_Sub4) ((Class278) this).aClass282_Sub41_Sub4_3366).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356)) != 1)
								continue while_74_;
							((Class278) this).aClass282_Sub41_Sub4_3366.method13361(((Class278) this).anOggPacket3356, (byte) 14);
							method4942(1240205197);
							if (((Class278) this).aClass282_Sub41_Sub3_3363 != null) {
								double d = ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255);
								for (int i = 0; i < 10 && method4910(-1617942291); i++) {
									method4913(-230491853);
									if (((Class278) this).aBool3360)
										return;
								}
								if (d < ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255))
									break;
							}
						} while (((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1386041831) < 50);
						break;
					}
					break;
				}
				if (class282_sub41 instanceof Class282_Sub41_Sub2)
					method4942(1413991175);
				else if (((Class278) this).aClass282_Sub41_Sub3_3363 != class282_sub41) {
					while (((Class282_Sub41) class282_sub41).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) == 1) {
						if (1 == (((Class282_Sub41) class282_sub41).anInt8031 * -509226247) && class282_sub41 instanceof Class282_Sub41_Sub2)
							method4915(((Class278) this).aString3365, 1911897312);
						class282_sub41.method13361((((Class278) this).anOggPacket3356), (byte) 14);
					}
				} else if (null == ((Class278) this).aClass282_Sub41_Sub4_3366 && !((Class278) this).aBool3353) {
					for (int i = 0; i < 10 && method4910(1399216871); i++) {
						method4913(-1440647935);
						if (((Class278) this).aBool3360)
							break;
					}
					break;
				}
			}
		}
	}

	void method4930() throws IOException {
		while (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) != 1) {
			Class282_Sub41 class282_sub41 = method4911((byte) 16);
			if (null == class282_sub41) {
				if (((Class278) this).aBool3361)
					method4916(1516535457);
				return;
			}
			if (class282_sub41 == ((Class278) this).aClass282_Sub41_Sub2_3364)
				method4942(-1289315191);
		}
		((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
	}

	void method4931() throws IOException {
		while (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) != 1) {
			Class282_Sub41 class282_sub41 = method4911((byte) 126);
			if (null == class282_sub41) {
				if (((Class278) this).aBool3361)
					method4916(1516535457);
				return;
			}
			if (class282_sub41 == ((Class278) this).aClass282_Sub41_Sub2_3364)
				method4942(1500930017);
		}
		((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
	}

	public void method4932(int i) throws IOException {
		if (!((Class278) this).aBool3353) {
			while_76_: for (/**/; !((Class278) this).aBool3360; ((Class278) this).aBool3359 = false) {
				Class282_Sub41 class282_sub41;
				if (!((Class278) this).aBool3359) {
					class282_sub41 = method4911((byte) 87);
					if (class282_sub41 == null) {
						if (((Class278) this).aBool3361)
							method4916(1516535457);
						break;
					}
					if (class282_sub41 == null)
						throw new IllegalStateException();
					((Class278) this).aBool3359 = true;
				} else
					class282_sub41 = ((Class282_Sub41) (((Class278) this).aClass465_3358.method7754((long) ((Class278) this).anOggPage3352.getSerialNumber())));
				if (((Class278) this).aClass282_Sub41_Sub4_3366 == class282_sub41) {
					if (((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1650384649) < 50) {
						do {
							if ((((Class282_Sub41_Sub4) ((Class278) this).aClass282_Sub41_Sub4_3366).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356)) != 1)
								continue while_76_;
							((Class278) this).aClass282_Sub41_Sub4_3366.method13361(((Class278) this).anOggPacket3356, (byte) 14);
							method4942(-473852611);
							if (((Class278) this).aClass282_Sub41_Sub3_3363 != null) {
								double d = ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255);
								for (int i_6_ = 0; i_6_ < 10 && method4910(-1524174534); i_6_++) {
									method4913(1928018641);
									if (((Class278) this).aBool3360)
										return;
								}
								if (d < ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255))
									break;
							}
						} while (((Class278) this).aClass282_Sub41_Sub4_3366.method14847(2101566549) < 50);
						break;
					}
					break;
				}
				if (class282_sub41 instanceof Class282_Sub41_Sub2)
					method4942(-934171767);
				else if (((Class278) this).aClass282_Sub41_Sub3_3363 != class282_sub41) {
					while (((Class282_Sub41) class282_sub41).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) == 1) {
						if (1 == (((Class282_Sub41) class282_sub41).anInt8031 * -509226247) && class282_sub41 instanceof Class282_Sub41_Sub2)
							method4915(((Class278) this).aString3365, 1039658724);
						class282_sub41.method13361((((Class278) this).anOggPacket3356), (byte) 14);
					}
				} else if (null == ((Class278) this).aClass282_Sub41_Sub4_3366 && !((Class278) this).aBool3353) {
					for (int i_7_ = 0; i_7_ < 10 && method4910(1413439449); i_7_++) {
						method4913(1867007041);
						if (((Class278) this).aBool3360)
							break;
					}
					break;
				}
			}
		}
	}

	void method4933() throws IOException {
		while (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) != 1) {
			Class282_Sub41 class282_sub41 = method4911((byte) 76);
			if (null == class282_sub41) {
				if (((Class278) this).aBool3361)
					method4916(1516535457);
				return;
			}
			if (class282_sub41 == ((Class278) this).aClass282_Sub41_Sub2_3364)
				method4942(-1762119230);
		}
		((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
	}

	void method4934() {
		for (Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7750(229978902)); class282_sub41 != null; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 119)) {
			if (class282_sub41 instanceof Class282_Sub41_Sub2) {
				Class282_Sub41_Sub2 class282_sub41_sub2 = (Class282_Sub41_Sub2) class282_sub41;
				while ((-509226247 * ((Class282_Sub41_Sub2) class282_sub41_sub2).anInt8031 <= 8 || (method4923(2009092975) > (double) class282_sub41_sub2.method14705((byte) 122))) && (((Class282_Sub41_Sub2) class282_sub41_sub2).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) == 1))
					class282_sub41_sub2.method13361((((Class278) this).anOggPacket3356), (byte) 14);
			}
		}
		method4915(((Class278) this).aString3365, 1134286227);
	}

	public Class282_Sub41_Sub2 method4935(int i) {
		return ((Class278) this).aClass282_Sub41_Sub2_3364;
	}

	boolean method4936() {
		if (null != ((Class278) this).aClass282_Sub41_Sub4_3366)
			return (!((Class278) this).aClass282_Sub41_Sub3_3363.method14794(105138835) || method4923(765567802) > ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255));
		double d = (double) ((Class278) this).aClass282_Sub41_Sub3_3363.method14791(-810302381);
		return (d == 0.0 || ((double) Class169.method2869(1616748669) >= (double) ((Class278) this).aClass282_Sub41_Sub3_3363.method14793(1780508378) + 1000.0 / d));
	}

	void method4937() {
		for (Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-1618532019)); class282_sub41 != null; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 104)) {
			if (class282_sub41 instanceof Class282_Sub41_Sub2) {
				Class282_Sub41_Sub2 class282_sub41_sub2 = (Class282_Sub41_Sub2) class282_sub41;
				while ((-509226247 * ((Class282_Sub41_Sub2) class282_sub41_sub2).anInt8031 <= 8 || (method4923(348159861) > (double) class282_sub41_sub2.method14705((byte) 16))) && (((Class282_Sub41_Sub2) class282_sub41_sub2).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) == 1))
					class282_sub41_sub2.method13361((((Class278) this).anOggPacket3356), (byte) 14);
			}
		}
		method4915(((Class278) this).aString3365, -1261913534);
	}

	void method4938() {
		for (Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-343452811)); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 64)) {
			if (((Class278) this).aClass282_Sub41_Sub3_3363 != class282_sub41) {
				while (((Class282_Sub41) class282_sub41).anOggStreamState8032.packetOut() == 1)
					class282_sub41.method13361((((Class278) this).anOggPacket3356), (byte) 14);
			}
		}
		if (((Class278) this).aClass282_Sub41_Sub3_3363 != null) {
			for (int i = 0; i < 10 && method4910(1619923553); i++) {
				if (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut() != 1) {
					method4947((byte) 51);
					break;
				}
				((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
			}
		}
	}

	void method4939() {
		for (Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-297704075)); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 87)) {
			if (((Class278) this).aClass282_Sub41_Sub3_3363 != class282_sub41) {
				while (((Class282_Sub41) class282_sub41).anOggStreamState8032.packetOut() == 1)
					class282_sub41.method13361((((Class278) this).anOggPacket3356), (byte) 14);
			}
		}
		if (((Class278) this).aClass282_Sub41_Sub3_3363 != null) {
			for (int i = 0; i < 10 && method4910(-494631464); i++) {
				if (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut() != 1) {
					method4947((byte) 2);
					break;
				}
				((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
			}
		}
	}

	public void method4940(boolean bool) {
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null) {
			Class282_Sub15_Sub1 class282_sub15_sub1 = ((Class278) this).aClass282_Sub41_Sub4_3366.method14845(2147195482);
			if (null != class282_sub15_sub1)
				class282_sub15_sub1.method14816(bool, -2021080353);
		}
		((Class278) this).aBool3353 = !((Class278) this).aBool3353;
	}

	void method4941() {
		for (Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-1688438296)); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 43)) {
			if (((Class278) this).aClass282_Sub41_Sub3_3363 != class282_sub41) {
				while (((Class282_Sub41) class282_sub41).anOggStreamState8032.packetOut() == 1)
					class282_sub41.method13361((((Class278) this).anOggPacket3356), (byte) 14);
			}
		}
		if (((Class278) this).aClass282_Sub41_Sub3_3363 != null) {
			for (int i = 0; i < 10 && method4910(851221557); i++) {
				if (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut() != 1) {
					method4947((byte) 19);
					break;
				}
				((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
			}
		}
	}

	void method4942(int i) {
		for (Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-1801716581)); class282_sub41 != null; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 10)) {
			if (class282_sub41 instanceof Class282_Sub41_Sub2) {
				Class282_Sub41_Sub2 class282_sub41_sub2 = (Class282_Sub41_Sub2) class282_sub41;
				while ((-509226247 * ((Class282_Sub41_Sub2) class282_sub41_sub2).anInt8031 <= 8 || (method4923(1693788471) > (double) class282_sub41_sub2.method14705((byte) 39))) && (((Class282_Sub41_Sub2) class282_sub41_sub2).anOggStreamState8032.packetOut(((Class278) this).anOggPacket3356) == 1))
					class282_sub41_sub2.method13361((((Class278) this).anOggPacket3356), (byte) 14);
			}
		}
		method4915(((Class278) this).aString3365, -159539907);
	}

	public Class282_Sub41_Sub3 method4943() {
		return ((Class278) this).aClass282_Sub41_Sub3_3363;
	}

	public Class282_Sub41_Sub3 method4944() {
		return ((Class278) this).aClass282_Sub41_Sub3_3363;
	}

	public double method4945() {
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null)
			return ((Class278) this).aClass282_Sub41_Sub4_3366.method14848(2141886821);
		if (null != ((Class278) this).aClass282_Sub41_Sub3_3363)
			return ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255);
		return 0.0;
	}

	Class278(int i) {
		if (!Class362.method6278(616047582).method222("jagtheora", -784781962))
			throw new RuntimeException("");
		((Class278) this).aByteArray3354 = new byte[i];
		((Class278) this).anOggSyncState3355 = new OggSyncState();
		((Class278) this).anOggPage3352 = new OggPage();
		((Class278) this).anOggPacket3356 = new OggPacket();
		((Class278) this).aClass465_3358 = new IterableNodeMap(8);
	}

	public Class282_Sub41_Sub4 method4946() {
		return ((Class278) this).aClass282_Sub41_Sub4_3366;
	}

	public void method4947(byte i) {
		if (!((Class278) this).aBool3360) {
			for (Class282_Sub41 class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7750(2031827035); class282_sub41 != null; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 35)) {
				class282_sub41.method13360(171967708);
				((Class282_Sub41) class282_sub41).anOggStreamState8032.method6699();
			}
			((Class278) this).anOggPacket3356.method6699();
			((Class278) this).anOggPage3352.method6699();
			((Class278) this).anOggSyncState3355.method6699();
			((Class278) this).aBool3360 = true;
		}
	}

	void method4948() {
		for (Class282_Sub41 class282_sub41 = ((Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-270008473)); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 22)) {
			if (((Class278) this).aClass282_Sub41_Sub3_3363 != class282_sub41) {
				while (((Class282_Sub41) class282_sub41).anOggStreamState8032.packetOut() == 1)
					class282_sub41.method13361((((Class278) this).anOggPacket3356), (byte) 14);
			}
		}
		if (((Class278) this).aClass282_Sub41_Sub3_3363 != null) {
			for (int i = 0; i < 10 && method4910(-609045362); i++) {
				if (((Class282_Sub41_Sub3) ((Class278) this).aClass282_Sub41_Sub3_3363).anOggStreamState8032.packetOut() != 1) {
					method4947((byte) 9);
					break;
				}
				((Class278) this).aClass282_Sub41_Sub3_3363.method13361(((Class278) this).anOggPacket3356, (byte) 14);
			}
		}
	}

	public boolean method4949() {
		if (!((Class278) this).aBool3360 && !((Class278) this).aBool3361)
			return false;
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null && ((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1957216577) > 0)
			return false;
		return true;
	}

	public boolean method4950() {
		if (!((Class278) this).aBool3360 && !((Class278) this).aBool3361)
			return false;
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null && ((Class278) this).aClass282_Sub41_Sub4_3366.method14847(1603558209) > 0)
			return false;
		return true;
	}

	abstract int method4951(byte[] is, int i) throws IOException;

	public void method4952(String string) {
		((Class278) this).aString3365 = string;
		if (((Class278) this).aString3365 == null)
			((Class278) this).aClass282_Sub41_Sub2_3364 = null;
		else {
			if (null != ((Class278) this).aClass282_Sub41_Sub2_3364 && !(((Class278) this).aString3365.equals(((Class278) this).aClass282_Sub41_Sub2_3364.method14703(-1867119973))))
				((Class278) this).aClass282_Sub41_Sub2_3364 = null;
			if (null == ((Class278) this).aClass282_Sub41_Sub2_3364) {
				for (Class282_Sub41 class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-1065037407); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 50)) {
					if (class282_sub41 instanceof Class282_Sub41_Sub2) {
						Class282_Sub41_Sub2 class282_sub41_sub2 = (Class282_Sub41_Sub2) class282_sub41;
						if (((Class278) this).aString3365.equals(class282_sub41_sub2.method14703(-709721674))) {
							((Class278) this).aClass282_Sub41_Sub2_3364 = class282_sub41_sub2;
							break;
						}
					}
				}
			}
		}
	}

	public void method4953(String string) {
		((Class278) this).aString3365 = string;
		if (((Class278) this).aString3365 == null)
			((Class278) this).aClass282_Sub41_Sub2_3364 = null;
		else {
			if (null != ((Class278) this).aClass282_Sub41_Sub2_3364 && !(((Class278) this).aString3365.equals(((Class278) this).aClass282_Sub41_Sub2_3364.method14703(-242580689))))
				((Class278) this).aClass282_Sub41_Sub2_3364 = null;
			if (null == ((Class278) this).aClass282_Sub41_Sub2_3364) {
				for (Class282_Sub41 class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7750(1493864179); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 69)) {
					if (class282_sub41 instanceof Class282_Sub41_Sub2) {
						Class282_Sub41_Sub2 class282_sub41_sub2 = (Class282_Sub41_Sub2) class282_sub41;
						if (((Class278) this).aString3365.equals(class282_sub41_sub2.method14703(-510240335))) {
							((Class278) this).aClass282_Sub41_Sub2_3364 = class282_sub41_sub2;
							break;
						}
					}
				}
			}
		}
	}

	public void method4954(String string) {
		((Class278) this).aString3365 = string;
		if (((Class278) this).aString3365 == null)
			((Class278) this).aClass282_Sub41_Sub2_3364 = null;
		else {
			if (null != ((Class278) this).aClass282_Sub41_Sub2_3364 && !(((Class278) this).aString3365.equals(((Class278) this).aClass282_Sub41_Sub2_3364.method14703(930968791))))
				((Class278) this).aClass282_Sub41_Sub2_3364 = null;
			if (null == ((Class278) this).aClass282_Sub41_Sub2_3364) {
				for (Class282_Sub41 class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7750(1859697034); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 45)) {
					if (class282_sub41 instanceof Class282_Sub41_Sub2) {
						Class282_Sub41_Sub2 class282_sub41_sub2 = (Class282_Sub41_Sub2) class282_sub41;
						if (((Class278) this).aString3365.equals(class282_sub41_sub2.method14703(144263025))) {
							((Class278) this).aClass282_Sub41_Sub2_3364 = class282_sub41_sub2;
							break;
						}
					}
				}
			}
		}
	}

	public void method4955(String string) {
		((Class278) this).aString3365 = string;
		if (((Class278) this).aString3365 == null)
			((Class278) this).aClass282_Sub41_Sub2_3364 = null;
		else {
			if (null != ((Class278) this).aClass282_Sub41_Sub2_3364 && !(((Class278) this).aString3365.equals(((Class278) this).aClass282_Sub41_Sub2_3364.method14703(-223026285))))
				((Class278) this).aClass282_Sub41_Sub2_3364 = null;
			if (null == ((Class278) this).aClass282_Sub41_Sub2_3364) {
				for (Class282_Sub41 class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-329462379); null != class282_sub41; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 19)) {
					if (class282_sub41 instanceof Class282_Sub41_Sub2) {
						Class282_Sub41_Sub2 class282_sub41_sub2 = (Class282_Sub41_Sub2) class282_sub41;
						if (((Class278) this).aString3365.equals(class282_sub41_sub2.method14703(913057124))) {
							((Class278) this).aClass282_Sub41_Sub2_3364 = class282_sub41_sub2;
							break;
						}
					}
				}
			}
		}
	}

	public double method4956() {
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null)
			return ((Class278) this).aClass282_Sub41_Sub4_3366.method14848(2096049139);
		if (null != ((Class278) this).aClass282_Sub41_Sub3_3363)
			return ((Class278) this).aClass282_Sub41_Sub3_3363.method14792((short) 255);
		return 0.0;
	}

	public void method4957() {
		if (!((Class278) this).aBool3360) {
			for (Class282_Sub41 class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7750(-1718801554); class282_sub41 != null; class282_sub41 = (Class282_Sub41) ((Class278) this).aClass465_3358.method7751((byte) 115)) {
				class282_sub41.method13360(-71563390);
				((Class282_Sub41) class282_sub41).anOggStreamState8032.method6699();
			}
			((Class278) this).anOggPacket3356.method6699();
			((Class278) this).anOggPage3352.method6699();
			((Class278) this).anOggSyncState3355.method6699();
			((Class278) this).aBool3360 = true;
		}
	}

	public void method4958(boolean bool) {
		if (((Class278) this).aClass282_Sub41_Sub4_3366 != null) {
			Class282_Sub15_Sub1 class282_sub15_sub1 = ((Class278) this).aClass282_Sub41_Sub4_3366.method14845(339084107);
			if (null != class282_sub15_sub1)
				class282_sub15_sub1.method14816(bool, -661843531);
		}
		((Class278) this).aBool3353 = !((Class278) this).aBool3353;
	}

	public Class282_Sub41_Sub4 method4959() {
		return ((Class278) this).aClass282_Sub41_Sub4_3366;
	}

	static final void method4960(CS2Executor class527, short i) {
		int i_8_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_8_, (byte) 120);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_8_ >> 16];
		Class172.method2915(class118, class98, class527, (byte) 0);
	}

	static final void method4961(CS2Executor class527, int i) {
		int i_9_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_9_, (byte) 17);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_9_ >> 16];
		Class96_Sub18.method14664(class118, class98, true, 2, class527, (byte) 71);
	}

	static final void method4962(CS2Executor class527, int i) {
		int i_10_ = (((CS2Executor) class527).intStack[(((CS2Executor) class527).anInt7012 -= 141891001) * 1942118537]);
		Class118 class118 = Class117.method1981(i_10_, (byte) 10);
		Class98 class98 = Class468_Sub8.aClass98Array7889[i_10_ >> 16];
		Class96_Sub18.method14664(class118, class98, false, 1, class527, (byte) 28);
	}

	static Class282_Sub20 method4963(RsByteBuffer class282_sub35, byte i) {
		class282_sub35.readUnsignedByte();
		int i_11_ = class282_sub35.readUnsignedByte();
		Class282_Sub20 class282_sub20 = Class252.method4328(i_11_, -1146932113);
		((Class282_Sub20) class282_sub20).anInt7668 = class282_sub35.readUnsignedByte() * 278242663;
		int i_12_ = class282_sub35.readUnsignedByte();
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			int i_14_ = class282_sub35.readUnsignedByte();
			class282_sub20.method12322(i_14_, class282_sub35, -1503572950);
		}
		class282_sub20.method12321(1551109929);
		return class282_sub20;
	}
}
