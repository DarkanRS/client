public class Class59 {

	public int[] anIntArray562;
	static SoftCache aClass229_533 = new SoftCache(64);
	public short aShort530;
	public short aShort570;
	public short aShort536;
	public short aShort579;
	public int anInt538;
	public int anInt539;
	public int anInt542 = 0;
	public int anInt569;
	public int anInt577;
	public int anInt544;
	int anInt548;
	int anInt549;
	public int anInt555;
	public int anInt556;
	public int anInt546;
	public int anInt545;
	public int[] anIntArray559;
	public int[] anIntArray561;
	public int anInt591 = -2;
	public int anInt600 = -2;
	public int anInt557 = 0;
	public int anInt554 = -1;
	public int anInt573 = -1;
	public int anInt564;
	public boolean aBool567 = true;
	public int anInt537 = -1;
	public int anInt535 = -1;
	public int anInt571 = 0;
	int anInt552 = 100;
	public boolean aBool568 = true;
	int anInt553 = 100;
	public int anInt547 = -1;
	int anInt543 = 100;
	public boolean aBool550 = true;
	public int[] anIntArray582;
	public boolean aBool572 = true;
	public int anInt583 = -1;
	int anInt589 = 100;
	public boolean aBool574 = false;
	public boolean aBool534 = true;
	public boolean aBool576 = false;
	public boolean aBool541 = true;
	public boolean aBool578 = false;
	public int anInt565;
	int anInt566;
	public int anInt581;
	public int anInt551;
	int anInt599;
	public int anInt584;
	public int anInt585;
	int anInt586;
	public int anInt587;
	public int anInt588;
	int anInt575;
	public int anInt590;
	public int anInt558;
	public int anInt592;
	public int anInt593;
	public int anInt594;
	public int anInt595;
	public int anInt597;
	public int anInt596;
	public int anInt598;
	public int anInt580;
	public int anInt540;

	void method1145(RsByteBuffer rsbytebuffer_1, int i_2, int i_3) {
		if (i_2 == 1) {
			this.aShort530 = (short) rsbytebuffer_1.readUnsignedShort();
			this.aShort570 = (short) rsbytebuffer_1.readUnsignedShort();
			this.aShort536 = (short) rsbytebuffer_1.readUnsignedShort();
			this.aShort579 = (short) rsbytebuffer_1.readUnsignedShort();
			byte b_4 = 3;
			this.aShort530 = (short) (this.aShort530 << b_4);
			this.aShort570 = (short) (this.aShort570 << b_4);
			this.aShort536 = (short) (this.aShort536 << b_4);
			this.aShort579 = (short) (this.aShort579 << b_4);
		} else if (i_2 == 2) {
			rsbytebuffer_1.readUnsignedByte();
		} else if (i_2 == 3) {
			this.anInt538 = rsbytebuffer_1.readInt();
			this.anInt539 = rsbytebuffer_1.readInt();
		} else if (i_2 == 4) {
			this.anInt542 = rsbytebuffer_1.readUnsignedByte();
			this.anInt569 = rsbytebuffer_1.readByte();
		} else if (i_2 == 5) {
			this.anInt544 = this.anInt577 = rsbytebuffer_1.readUnsignedShort() << 12 << 2;
		} else if (i_2 == 6) {
			this.anInt548 = rsbytebuffer_1.readInt();
			this.anInt549 = rsbytebuffer_1.readInt();
		} else if (i_2 == 7) {
			this.anInt555 = rsbytebuffer_1.readUnsignedShort();
			this.anInt556 = rsbytebuffer_1.readUnsignedShort();
		} else if (i_2 == 8) {
			this.anInt546 = rsbytebuffer_1.readUnsignedShort();
			this.anInt545 = rsbytebuffer_1.readUnsignedShort();
		} else {
			int i_5;
			int i_6;
			if (i_2 == 9) {
				i_6 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray559 = new int[i_6];

				for (i_5 = 0; i_5 < i_6; i_5++) {
					this.anIntArray559[i_5] = rsbytebuffer_1.readUnsignedShort();
				}
			} else if (i_2 == 10) {
				i_6 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray561 = new int[i_6];

				for (i_5 = 0; i_5 < i_6; i_5++) {
					this.anIntArray561[i_5] = rsbytebuffer_1.readUnsignedShort();
				}
			} else if (i_2 == 12) {
				this.anInt591 = rsbytebuffer_1.readByte();
			} else if (i_2 == 13) {
				this.anInt600 = rsbytebuffer_1.readByte();
			} else if (i_2 == 14) {
				this.anInt557 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 15) {
				this.anInt554 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 16) {
				this.aBool567 = rsbytebuffer_1.readUnsignedByte() == 1;
				this.anInt537 = rsbytebuffer_1.readUnsignedShort();
				this.anInt535 = rsbytebuffer_1.readUnsignedShort();
				this.aBool568 = rsbytebuffer_1.readUnsignedByte() == 1;
			} else if (i_2 == 17) {
				this.anInt573 = rsbytebuffer_1.readUnsignedShort();
			} else if (i_2 == 18) {
				this.anInt564 = rsbytebuffer_1.readInt();
			} else if (i_2 == 19) {
				this.anInt571 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 20) {
				this.anInt552 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 21) {
				this.anInt553 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 22) {
				this.anInt547 = rsbytebuffer_1.readInt();
			} else if (i_2 == 23) {
				this.anInt543 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 24) {
				this.aBool550 = false;
			} else if (i_2 == 25) {
				i_6 = rsbytebuffer_1.readUnsignedByte();
				this.anIntArray582 = new int[i_6];

				for (i_5 = 0; i_5 < i_6; i_5++) {
					this.anIntArray582[i_5] = rsbytebuffer_1.readUnsignedShort();
				}
			} else if (i_2 == 26) {
				this.aBool572 = false;
			} else if (i_2 == 27) {
				this.anInt583 = rsbytebuffer_1.readUnsignedShort() << 12 << 2;
			} else if (i_2 == 28) {
				this.anInt589 = rsbytebuffer_1.readUnsignedByte();
			} else if (i_2 == 29) {
				rsbytebuffer_1.readShort();
			} else if (i_2 == 30) {
				this.aBool574 = true;
			} else if (i_2 == 31) {
				this.anInt544 = rsbytebuffer_1.readUnsignedShort() << 12 << 2;
				this.anInt577 = rsbytebuffer_1.readUnsignedShort() << 12 << 2;
			} else if (i_2 == 32) {
				this.aBool534 = false;
			} else if (i_2 == 33) {
				this.aBool576 = true;
			} else if (i_2 == 34) {
				this.aBool541 = false;
			}
		}

	}

	void method1146(byte b_1) {
		if (this.anInt591 > -2 || this.anInt600 > -2) {
			this.aBool578 = true;
		}

		this.anInt565 = this.anInt548 >> 16 & 0xff;
		this.anInt566 = this.anInt549 >> 16 & 0xff;
		this.anInt581 = this.anInt566 - this.anInt565;
		this.anInt551 = this.anInt548 >> 8 & 0xff;
		this.anInt599 = this.anInt549 >> 8 & 0xff;
		this.anInt584 = this.anInt599 - this.anInt551;
		this.anInt585 = this.anInt548 & 0xff;
		this.anInt586 = this.anInt549 & 0xff;
		this.anInt587 = this.anInt586 - this.anInt585;
		this.anInt588 = this.anInt548 >> 24 & 0xff;
		this.anInt575 = this.anInt549 >> 24 & 0xff;
		this.anInt590 = this.anInt575 - this.anInt588;
		if (this.anInt564 != 0) {
			this.anInt558 = this.anInt552 * this.anInt556 / 100;
			this.anInt592 = this.anInt553 * this.anInt556 / 100;
			if (this.anInt558 == 0) {
				this.anInt558 = 1;
			}

			this.anInt593 = ((this.anInt564 >> 16 & 0xff) - (this.anInt581 / 2 + this.anInt565) << 8) / this.anInt558;
			this.anInt594 = ((this.anInt564 >> 8 & 0xff) - (this.anInt584 / 2 + this.anInt551) << 8) / this.anInt558;
			this.anInt595 = ((this.anInt564 & 0xff) - (this.anInt587 / 2 + this.anInt585) << 8) / this.anInt558;
			if (this.anInt592 == 0) {
				this.anInt592 = 1;
			}

			this.anInt596 = ((this.anInt564 >> 24 & 0xff) - (this.anInt590 / 2 + this.anInt588) << 8) / this.anInt592;
			this.anInt593 += this.anInt593 > 0 ? -4 : 4;
			this.anInt594 += this.anInt594 > 0 ? -4 : 4;
			this.anInt595 += this.anInt595 > 0 ? -4 : 4;
			this.anInt596 += this.anInt596 > 0 ? -4 : 4;
		}

		if (this.anInt547 != -1) {
			this.anInt597 = this.anInt556 * this.anInt543 / 100;
			if (this.anInt597 == 0) {
				this.anInt597 = 1;
			}

			this.anInt598 = (this.anInt547 - ((this.anInt539 - this.anInt538) / 2 + this.anInt538)) / this.anInt597;
		}

		if (this.anInt583 != -1) {
			this.anInt580 = this.anInt589 * this.anInt556 / 100;
			if (this.anInt580 == 0) {
				this.anInt580 = 1;
			}

			this.anInt540 = (this.anInt583 - ((this.anInt577 - this.anInt544) / 2 + this.anInt544)) / this.anInt580;
		}

	}

	void method1150(RsByteBuffer rsbytebuffer_1, int i_2) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}

			this.method1145(rsbytebuffer_1, i_3, -762162667);
		}
	}

	public static int method1159(Index index_0, int i_1) {
		int i_2 = 0;
		if (index_0.method5661(Class165.anInt2035, 1772789270)) {
			++i_2;
		}

		if (index_0.method5661(Class475.anInt5622, 1087630651)) {
			++i_2;
		}

		if (index_0.method5661(Class16.anInt135, -1445417233)) {
			++i_2;
		}

		if (index_0.method5661(Class16.anInt142, 1290057314)) {
			++i_2;
		}

		if (index_0.method5661(Class16.anInt137, -1474020229)) {
			++i_2;
		}

		if (index_0.method5661(Class468_Sub12.anInt7899, 704936626)) {
			++i_2;
		}

		if (index_0.method5661(Class13.anInt130, 602886024)) {
			++i_2;
		}

		if (index_0.method5661(Class16.anInt143, -1990269462)) {
			++i_2;
		}

		if (index_0.method5661(Class400.anInt4821, 245812600)) {
			++i_2;
		}

		if (index_0.method5661(Class16.anInt141, -1961759001)) {
			++i_2;
		}

		if (index_0.method5661(Class165.anInt2037, -521696107)) {
			++i_2;
		}

		if (index_0.method5661(Class271.anInt3330, -80851855)) {
			++i_2;
		}

		return i_2;
	}

	public static void method1160(int i_0) {
		if (Class51.anInt488 != -1) {
			SpotAnimIndexLoader.method8862(Class51.anInt488, -1, -1, false, -1732540658);
			Class51.anInt488 = -1;
		}

	}

	public static void method1161(int i_0, int i_1, int i_2, int i_3, int i_4, int i_5, String string_6, short s_7) {
		Class275_Sub6 class275_sub6_8 = new Class275_Sub6();
		class275_sub6_8.anInt7857 = i_0;
		class275_sub6_8.anInt7859 = i_1;
		class275_sub6_8.anInt7854 = i_2;
		class275_sub6_8.anInt7858 = i_4 + client.cycles;
		class275_sub6_8.anInt7855 = i_3;
		class275_sub6_8.aString7860 = string_6;
		class275_sub6_8.anInt7856 = i_5;
		client.aClass457_7335.method7649(class275_sub6_8, 1112580220);
	}

	static final void method1162(CS2Executor cs2executor_0, int i_1) {
		cs2executor_0.intStackPtr -= 4;
		int i_2 = cs2executor_0.intStack[cs2executor_0.intStackPtr];
		int i_3 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 1];
		int i_4 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 2];
		int i_5 = cs2executor_0.intStack[cs2executor_0.intStackPtr + 3];
		CoordGrid coordgrid_6 = IndexLoaders.MAP_REGION_DECODER.getCoordGrid(988818864);
		Class11.method469((i_2 >> 14 & 0x3fff) - coordgrid_6.x, (i_2 & 0x3fff) - coordgrid_6.y, i_3 << 2, i_4, i_5, (byte) -62);
	}

	public static String method1163(int i_0, int i_1) {
		return "<col=" + Integer.toHexString(i_0) + ">";
	}

}
