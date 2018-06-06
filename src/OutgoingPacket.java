
/* Class379 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class OutgoingPacket {
	public static OutgoingPacket aClass379_4527;
	public static OutgoingPacket aClass379_4528;
	public static OutgoingPacket aClass379_4529;
	public static OutgoingPacket aClass379_4530;
	public static OutgoingPacket aClass379_4531;
	public static OutgoingPacket aClass379_4532;
	public static OutgoingPacket aClass379_4533;
	public static OutgoingPacket aClass379_4534;
	public static OutgoingPacket aClass379_4535;
	public static OutgoingPacket aClass379_4536;
	public static OutgoingPacket aClass379_4537;
	public static OutgoingPacket aClass379_4538;
	public static OutgoingPacket aClass379_4539;
	public static OutgoingPacket aClass379_4540;
	public static OutgoingPacket aClass379_4541;
	public static OutgoingPacket aClass379_4542;
	public static OutgoingPacket aClass379_4543;
	public static OutgoingPacket aClass379_4544;
	public static OutgoingPacket KEEP_ALIVE = new OutgoingPacket(0, 0);
	public static OutgoingPacket aClass379_4546;
	public static OutgoingPacket aClass379_4547;
	public static OutgoingPacket aClass379_4548;
	public static OutgoingPacket aClass379_4549;
	public static OutgoingPacket aClass379_4550;
	public static OutgoingPacket aClass379_4551;
	public static OutgoingPacket aClass379_4552;
	public static OutgoingPacket aClass379_4553;
	public static OutgoingPacket aClass379_4554;
	public static OutgoingPacket aClass379_4555;
	public static OutgoingPacket aClass379_4556;
	public static OutgoingPacket aClass379_4557;
	public static OutgoingPacket aClass379_4558;
	public static OutgoingPacket aClass379_4559;
	public static OutgoingPacket WALK;
	public static OutgoingPacket aClass379_4561;
	public static OutgoingPacket aClass379_4562;
	public static OutgoingPacket aClass379_4563;
	public static OutgoingPacket aClass379_4564;
	public static OutgoingPacket aClass379_4565;
	public static OutgoingPacket aClass379_4566;
	public static OutgoingPacket aClass379_4567;
	public static OutgoingPacket aClass379_4568;
	public static OutgoingPacket MINI_WALK;
	public static OutgoingPacket aClass379_4570;
	public static OutgoingPacket aClass379_4571;
	public static OutgoingPacket aClass379_4572;
	public static OutgoingPacket aClass379_4573;
	public static OutgoingPacket aClass379_4574;
	public static OutgoingPacket aClass379_4575;
	public static OutgoingPacket OBJECT_EXAMINE;
	public static OutgoingPacket aClass379_4577;
	public static OutgoingPacket aClass379_4578;
	public static OutgoingPacket aClass379_4579;
	public static OutgoingPacket aClass379_4580;
	public static OutgoingPacket aClass379_4581;
	public static OutgoingPacket aClass379_4582;
	public static OutgoingPacket aClass379_4583;
	public static OutgoingPacket aClass379_4584;
	public static OutgoingPacket aClass379_4585;
	public static OutgoingPacket aClass379_4586;
	public static OutgoingPacket aClass379_4587;
	public static OutgoingPacket aClass379_4588;
	public static OutgoingPacket aClass379_4589;
	public static OutgoingPacket aClass379_4590;
	public static OutgoingPacket aClass379_4591;
	public static OutgoingPacket aClass379_4592;
	public static OutgoingPacket aClass379_4593;
	public static OutgoingPacket aClass379_4594;
	public static OutgoingPacket aClass379_4595;
	public static OutgoingPacket aClass379_4596;
	public static OutgoingPacket aClass379_4597;
	public static OutgoingPacket aClass379_4598;
	public static OutgoingPacket aClass379_4599;
	public static OutgoingPacket aClass379_4600;
	public static OutgoingPacket aClass379_4601;
	public static OutgoingPacket aClass379_4602;
	public static OutgoingPacket aClass379_4603;
	public static OutgoingPacket aClass379_4604;
	public static OutgoingPacket aClass379_4605;
	public static OutgoingPacket aClass379_4606;
	public static OutgoingPacket aClass379_4607;
	public static OutgoingPacket aClass379_4608;
	public static OutgoingPacket aClass379_4609;
	public static OutgoingPacket aClass379_4610;
	public static OutgoingPacket aClass379_4611;
	public static OutgoingPacket aClass379_4612;
	public static OutgoingPacket aClass379_4613;
	public static OutgoingPacket aClass379_4614;
	public static OutgoingPacket aClass379_4615;
	public static OutgoingPacket aClass379_4616;
	public static OutgoingPacket aClass379_4617;
	public static OutgoingPacket aClass379_4618;
	public static OutgoingPacket aClass379_4619;
	public static OutgoingPacket aClass379_4620;
	public static OutgoingPacket aClass379_4621;
	public static OutgoingPacket aClass379_4622;
	public static OutgoingPacket aClass379_4623;
	public static OutgoingPacket aClass379_4624;
	public static OutgoingPacket aClass379_4625;
	public static OutgoingPacket aClass379_4626;
	public static OutgoingPacket aClass379_4627;
	public static OutgoingPacket aClass379_4628;
	public static OutgoingPacket aClass379_4629;
	public static OutgoingPacket aClass379_4630;
	int anInt4631;
	int anInt4632;

	OutgoingPacket(int id, int size) {
		this.anInt4631 = -2043160167 * id;
		this.anInt4632 = -1422665881 * size;
	}

	static {
		aClass379_4528 = new OutgoingPacket(1, 3);
		aClass379_4529 = new OutgoingPacket(2, 4);
		aClass379_4530 = new OutgoingPacket(3, 3);
		aClass379_4573 = new OutgoingPacket(4, 16);
		aClass379_4549 = new OutgoingPacket(5, 4);
		aClass379_4571 = new OutgoingPacket(6, 3);
		aClass379_4534 = new OutgoingPacket(7, -1);
		aClass379_4535 = new OutgoingPacket(8, 7);
		aClass379_4536 = new OutgoingPacket(9, 8);
		aClass379_4537 = new OutgoingPacket(10, -1);
		aClass379_4566 = new OutgoingPacket(11, 2);
		aClass379_4561 = new OutgoingPacket(12, -1);
		aClass379_4540 = new OutgoingPacket(13, 11);
		aClass379_4541 = new OutgoingPacket(14, -1);
		aClass379_4542 = new OutgoingPacket(15, -2);
		aClass379_4532 = new OutgoingPacket(16, 3);
		aClass379_4544 = new OutgoingPacket(17, 2);
		aClass379_4531 = new OutgoingPacket(18, 4);
		aClass379_4546 = new OutgoingPacket(19, 8);
		aClass379_4547 = new OutgoingPacket(20, 3);
		aClass379_4605 = new OutgoingPacket(21, 8);
		aClass379_4604 = new OutgoingPacket(22, 8);
		aClass379_4550 = new OutgoingPacket(23, 8);
		aClass379_4559 = new OutgoingPacket(24, 7);
		aClass379_4552 = new OutgoingPacket(25, 7);
		aClass379_4553 = new OutgoingPacket(26, -1);
		aClass379_4554 = new OutgoingPacket(27, 8);
		aClass379_4555 = new OutgoingPacket(28, -2);
		aClass379_4551 = new OutgoingPacket(29, -1);
		aClass379_4557 = new OutgoingPacket(30, 1);
		aClass379_4623 = new OutgoingPacket(31, 3);
		aClass379_4626 = new OutgoingPacket(32, 9);
		WALK = new OutgoingPacket(33, 5);
		aClass379_4578 = new OutgoingPacket(34, -1);
		aClass379_4533 = new OutgoingPacket(35, -2);
		aClass379_4563 = new OutgoingPacket(36, -1);
		aClass379_4556 = new OutgoingPacket(37, 2);
		aClass379_4565 = new OutgoingPacket(38, 9);
		aClass379_4630 = new OutgoingPacket(39, -1);
		aClass379_4567 = new OutgoingPacket(40, -1);
		aClass379_4568 = new OutgoingPacket(41, 11);
		MINI_WALK = new OutgoingPacket(42, 18);
		aClass379_4564 = new OutgoingPacket(43, 7);
		aClass379_4595 = new OutgoingPacket(44, 9);
		aClass379_4572 = new OutgoingPacket(45, 1);
		aClass379_4589 = new OutgoingPacket(46, 12);
		aClass379_4613 = new OutgoingPacket(47, 4);
		aClass379_4575 = new OutgoingPacket(48, 9);
		aClass379_4548 = new OutgoingPacket(49, 6);
		aClass379_4577 = new OutgoingPacket(50, 3);
		aClass379_4594 = new OutgoingPacket(51, 3);
		aClass379_4579 = new OutgoingPacket(52, -1);
		aClass379_4580 = new OutgoingPacket(53, 3);
		aClass379_4581 = new OutgoingPacket(54, 7);
		aClass379_4582 = new OutgoingPacket(55, 4);
		aClass379_4543 = new OutgoingPacket(56, -2);
		aClass379_4584 = new OutgoingPacket(57, 7);
		aClass379_4585 = new OutgoingPacket(58, 4);
		aClass379_4586 = new OutgoingPacket(59, 6);
		aClass379_4587 = new OutgoingPacket(60, 0);
		aClass379_4588 = new OutgoingPacket(61, 7);
		aClass379_4597 = new OutgoingPacket(62, 1);
		aClass379_4590 = new OutgoingPacket(63, 4);
		aClass379_4591 = new OutgoingPacket(64, -1);
		aClass379_4592 = new OutgoingPacket(65, 3);
		aClass379_4539 = new OutgoingPacket(66, 3);
		aClass379_4583 = new OutgoingPacket(67, 15);
		aClass379_4527 = new OutgoingPacket(68, 8);
		aClass379_4596 = new OutgoingPacket(69, -1);
		aClass379_4629 = new OutgoingPacket(70, 3);
		aClass379_4598 = new OutgoingPacket(71, -1);
		aClass379_4562 = new OutgoingPacket(72, 8);
		OBJECT_EXAMINE = new OutgoingPacket(73, 9);
		aClass379_4601 = new OutgoingPacket(74, 16);
		aClass379_4602 = new OutgoingPacket(75, 9);
		aClass379_4603 = new OutgoingPacket(76, 0);
		aClass379_4599 = new OutgoingPacket(77, 3);
		aClass379_4600 = new OutgoingPacket(78, -1);
		aClass379_4606 = new OutgoingPacket(79, 1);
		aClass379_4607 = new OutgoingPacket(80, -1);
		aClass379_4608 = new OutgoingPacket(81, 8);
		aClass379_4609 = new OutgoingPacket(82, 4);
		aClass379_4593 = new OutgoingPacket(83, 4);
		aClass379_4627 = new OutgoingPacket(84, 6);
		aClass379_4612 = new OutgoingPacket(85, -1);
		aClass379_4538 = new OutgoingPacket(86, -1);
		aClass379_4614 = new OutgoingPacket(87, -1);
		aClass379_4615 = new OutgoingPacket(88, 2);
		aClass379_4616 = new OutgoingPacket(89, 3);
		aClass379_4617 = new OutgoingPacket(90, -1);
		aClass379_4618 = new OutgoingPacket(91, -1);
		aClass379_4619 = new OutgoingPacket(92, -2);
		aClass379_4620 = new OutgoingPacket(93, 9);
		aClass379_4621 = new OutgoingPacket(94, 3);
		aClass379_4622 = new OutgoingPacket(95, 3);
		aClass379_4574 = new OutgoingPacket(96, 8);
		aClass379_4624 = new OutgoingPacket(97, -1);
		aClass379_4625 = new OutgoingPacket(98, 17);
		aClass379_4558 = new OutgoingPacket(99, -2);
		aClass379_4611 = new OutgoingPacket(100, -1);
		aClass379_4628 = new OutgoingPacket(101, -2);
		aClass379_4570 = new OutgoingPacket(102, -2);
		aClass379_4610 = new OutgoingPacket(103, 3);
	}

	static final void method6439(CS2Executor class527, int i) {
		class527.anInt7012 -= 283782002;
		int i_1_ = (class527.intStack[1942118537 * class527.anInt7012]);
		int i_2_ = (class527.intStack[1 + 1942118537 * class527.anInt7012]);
		int i_3_ = (IndexLoaders.QUICK_CHAT_INDEX_LOADER2.getMessageDefinitions(i_1_, -1579462583).method14918(i_2_, -1799645652).id * -1869685303);
		class527.intStack[(class527.anInt7012 += 141891001) * 1942118537 - 1] = i_3_;
	}

	static final void method6440(CS2Executor class527, int i) {
		String string = "";
		if (Class182.aClipboard2263 != null) {
			Transferable transferable = Class182.aClipboard2263.getContents(null);
			if (null != transferable) {
				try {
					string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
					if (string == null) {
						string = "";
					}
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
		class527.objectStack[(class527.anInt7000 += 1476624725) * 1806726141 - 1] = string;
	}
}
