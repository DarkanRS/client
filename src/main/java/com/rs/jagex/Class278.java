package com.rs.jagex;

import java.io.IOException;

import jagtheora.ogg.OggPacket;
import jagtheora.ogg.OggPage;
import jagtheora.ogg.OggStreamState;
import jagtheora.ogg.OggSyncState;

public abstract class Class278 {

	boolean aBool3361;
	Node_Sub41_Sub3 aNode_Sub41_Sub3_3363;
	Node_Sub41_Sub4 aNode_Sub41_Sub4_3366;
	String aString3365;
	Node_Sub41_Sub2 aNode_Sub41_Sub2_3364;
	boolean aBool3353;
	boolean aBool3359;
	byte[] aByteArray3354;
	OggSyncState anOggSyncState3355;
	OggPage anOggPage3352;
	OggPacket anOggPacket3356;
	IterableNodeMap aClass465_3358;
	boolean aBool3360;

	Class278() {
		if (!LibraryLoader.getLoader().loadLibrary("jagtheora"))
			throw new RuntimeException("");
		aByteArray3354 = new byte[4096];
		anOggSyncState3355 = new OggSyncState();
		anOggPage3352 = new OggPage();
		anOggPacket3356 = new OggPacket();
		aClass465_3358 = new IterableNodeMap(8);
	}

	abstract int decode(byte[] var1) throws IOException;

	boolean method4910() {
		if (aNode_Sub41_Sub4_3366 != null)
			return !aNode_Sub41_Sub3_3363.method14794() || method4923() > aNode_Sub41_Sub3_3363.method14792();
			double d_2 = aNode_Sub41_Sub3_3363.method14791();
			return d_2 == 0.0D || Utils.time() >= aNode_Sub41_Sub3_3363.method14793() + 1000.0D / d_2;
	}

	Node_Sub41 method4911() throws IOException {
		if (aBool3360)
			throw new IllegalStateException();
		if (aBool3361)
			return null;
		else {
			int i_2;
			while (anOggSyncState3355.pageOut(anOggPage3352) <= 0) {
				i_2 = decode(aByteArray3354);
				if (i_2 == -1) {
					aBool3361 = true;
					return null;
				}
				if (i_2 == 0)
					return null;
				if (!anOggSyncState3355.write(aByteArray3354, i_2))
					throw new RuntimeException("");
			}
			i_2 = anOggPage3352.getSerialNumber();
			if (!anOggPage3352.isBOS()) {
				Node_Sub41 class282_sub41_9 = (Node_Sub41) aClass465_3358.get(i_2);
				if (!class282_sub41_9.anOggStreamState8032.pageIn(anOggPage3352))
					throw new IllegalStateException();
				else
					return class282_sub41_9;
			} else {
				OggStreamState oggstreamstate_3 = new OggStreamState(i_2);
				if (!oggstreamstate_3.pageIn(anOggPage3352) || (oggstreamstate_3.packetPeek(anOggPacket3356) != 1))
					throw new IllegalStateException();
				else {
					Node_Sub41 obj_4;
					if (aNode_Sub41_Sub3_3363 == null && anOggPacket3356.isTheora()) {
						aNode_Sub41_Sub3_3363 = new Node_Sub41_Sub3(oggstreamstate_3);
						obj_4 = aNode_Sub41_Sub3_3363;
					} else if (aNode_Sub41_Sub4_3366 == null && anOggPacket3356.isVorbis()) {
						aNode_Sub41_Sub4_3366 = new Node_Sub41_Sub4(oggstreamstate_3);
						obj_4 = aNode_Sub41_Sub4_3366;
					} else {
						byte[] bytes_5 = anOggPacket3356.getData();
						StringBuilder stringbuilder_6 = new StringBuilder();
						for (int i_7 = 1; i_7 < bytes_5.length && Character.isLetterOrDigit((char) bytes_5[i_7]); i_7++)
							stringbuilder_6.append((char) bytes_5[i_7]);
						String string_8 = stringbuilder_6.toString();
						if ("kate".equals(string_8))
							obj_4 = new Node_Sub41_Sub2(oggstreamstate_3);
						else
							obj_4 = new Node_Sub41_Sub1(oggstreamstate_3);
					}
					aClass465_3358.put(obj_4, i_2);
					return obj_4;
				}
			}
		}
	}

	void method4913() throws IOException {
		while (aNode_Sub41_Sub3_3363.anOggStreamState8032.packetOut(anOggPacket3356) != 1) {
			Node_Sub41 class282_sub41_2 = method4911();
			if (class282_sub41_2 == null) {
				if (aBool3361)
					method4916();
				return;
			}
			if (class282_sub41_2 == aNode_Sub41_Sub2_3364)
				method4942();
		}
		aNode_Sub41_Sub3_3363.method13361(anOggPacket3356);
	}

	public Node_Sub41_Sub4 method4914() {
		return aNode_Sub41_Sub4_3366;
	}

	public void method4915(String string_1) {
		aString3365 = string_1;
		if (aString3365 == null)
			aNode_Sub41_Sub2_3364 = null;
		else {
			if (aNode_Sub41_Sub2_3364 != null && !aString3365.equals(aNode_Sub41_Sub2_3364.method14703()))
				aNode_Sub41_Sub2_3364 = null;
			if (aNode_Sub41_Sub2_3364 == null)
				for (Node_Sub41 class282_sub41_3 = (Node_Sub41) aClass465_3358.method7750(); class282_sub41_3 != null; class282_sub41_3 = (Node_Sub41) aClass465_3358.method7751())
					if (class282_sub41_3 instanceof Node_Sub41_Sub2 class282_sub41_sub2_4) {
						if (aString3365.equals(class282_sub41_sub2_4.method14703())) {
							aNode_Sub41_Sub2_3364 = class282_sub41_sub2_4;
							break;
						}
					}
		}
	}

	void method4916() {
		for (Node_Sub41 class282_sub41_2 = (Node_Sub41) aClass465_3358.method7750(); class282_sub41_2 != null; class282_sub41_2 = (Node_Sub41) aClass465_3358.method7751())
			if (class282_sub41_2 != aNode_Sub41_Sub3_3363)
				while (class282_sub41_2.anOggStreamState8032.packetOut() == 1)
					class282_sub41_2.method13361(anOggPacket3356);
		if (aNode_Sub41_Sub3_3363 != null)
			for (int i_3 = 0; i_3 < 10 && method4910(); i_3++) {
				if (aNode_Sub41_Sub3_3363.anOggStreamState8032.packetOut() != 1) {
					method4947();
					break;
				}
				aNode_Sub41_Sub3_3363.method13361(anOggPacket3356);
			}
	}

	public Node_Sub41_Sub3 method4918() {
		return aNode_Sub41_Sub3_3363;
	}

	public boolean method4921() {
		return (aBool3360 || aBool3361) && (aNode_Sub41_Sub4_3366 == null || aNode_Sub41_Sub4_3366.method14847() <= 0);
	}

	public double method4923() {
		return aNode_Sub41_Sub4_3366 != null ? aNode_Sub41_Sub4_3366.method14848() : (aNode_Sub41_Sub3_3363 != null ? aNode_Sub41_Sub3_3363.method14792() : 0.0D);
	}

	public void method4924(boolean bool_1) {
		if (aNode_Sub41_Sub4_3366 != null) {
			Node_Sub15_Sub1 class282_sub15_sub1_3 = aNode_Sub41_Sub4_3366.method14845();
			if (class282_sub15_sub1_3 != null)
				class282_sub15_sub1_3.method14816(bool_1);
		}
		aBool3353 = !aBool3353;
	}

	public void method4932() throws IOException {
		if (!aBool3353)
			for (; !aBool3360; aBool3359 = false) {
				Node_Sub41 class282_sub41_2;
				if (!aBool3359) {
					class282_sub41_2 = method4911();
					if (class282_sub41_2 == null) {
						if (aBool3361)
							method4916();
						break;
					}
					if (class282_sub41_2 == null)
						throw new IllegalStateException();
					aBool3359 = true;
				} else
					class282_sub41_2 = (Node_Sub41) aClass465_3358.get(anOggPage3352.getSerialNumber());
				if (class282_sub41_2 == aNode_Sub41_Sub4_3366) {
					if (aNode_Sub41_Sub4_3366.method14847() >= 50)
						break;
					while (aNode_Sub41_Sub4_3366.anOggStreamState8032.packetOut(anOggPacket3356) == 1) {
						aNode_Sub41_Sub4_3366.method13361(anOggPacket3356);
						method4942();
						if (aNode_Sub41_Sub3_3363 != null) {
							double d_3 = aNode_Sub41_Sub3_3363.method14792();
							for (int i_5 = 0; i_5 < 10 && method4910(); i_5++) {
								method4913();
								if (aBool3360)
									return;
							}
							if (d_3 < aNode_Sub41_Sub3_3363.method14792())
								return;
						}
						if (aNode_Sub41_Sub4_3366.method14847() >= 50)
							return;
					}
				} else if (class282_sub41_2 instanceof Node_Sub41_Sub2)
					method4942();
				else if (class282_sub41_2 != aNode_Sub41_Sub3_3363) {
					for (; class282_sub41_2.anOggStreamState8032.packetOut(anOggPacket3356) == 1; class282_sub41_2.method13361(anOggPacket3356))
						if (class282_sub41_2.anInt8031 == 1 && class282_sub41_2 instanceof Node_Sub41_Sub2)
							method4915(aString3365);
				} else if (aNode_Sub41_Sub4_3366 == null && !aBool3353) {
					for (int i_6 = 0; i_6 < 10 && method4910(); i_6++) {
						method4913();
						if (aBool3360)
							return;
					}
					return;
				}
			}
	}

	public Node_Sub41_Sub2 method4935() {
		return aNode_Sub41_Sub2_3364;
	}

	void method4942() {
		for (Node_Sub41 class282_sub41_2 = (Node_Sub41) aClass465_3358.method7750(); class282_sub41_2 != null; class282_sub41_2 = (Node_Sub41) aClass465_3358.method7751())
			if (class282_sub41_2 instanceof Node_Sub41_Sub2 class282_sub41_sub2_3) {
				while ((class282_sub41_sub2_3.anInt8031 <= 8 || method4923() > class282_sub41_sub2_3.method14705()) && class282_sub41_sub2_3.anOggStreamState8032.packetOut(anOggPacket3356) == 1)
					class282_sub41_sub2_3.method13361(anOggPacket3356);
			}
		method4915(aString3365);
	}

	public void method4947() {
		if (!aBool3360) {
			for (Node_Sub41 class282_sub41_2 = (Node_Sub41) aClass465_3358.method7750(); class282_sub41_2 != null; class282_sub41_2 = (Node_Sub41) aClass465_3358.method7751()) {
				class282_sub41_2.method13360();
				class282_sub41_2.anOggStreamState8032.method6699();
			}
			anOggPacket3356.method6699();
			anOggPage3352.method6699();
			anOggSyncState3355.method6699();
			aBool3360 = true;
		}
	}
}
