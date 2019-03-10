import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;

public class OutgoingPacket {

	public static OutgoingPacket KEEP_ALIVE = new OutgoingPacket(0, 0);

	public static OutgoingPacket aClass379_4528 = new OutgoingPacket(1, 3);

	public static OutgoingPacket aClass379_4529 = new OutgoingPacket(2, 4);

	public static OutgoingPacket aClass379_4530 = new OutgoingPacket(3, 3);

	public static OutgoingPacket aClass379_4573 = new OutgoingPacket(4, 16);

	public static OutgoingPacket aClass379_4549 = new OutgoingPacket(5, 4);

	public static OutgoingPacket aClass379_4571 = new OutgoingPacket(6, 3);

	public static OutgoingPacket aClass379_4534 = new OutgoingPacket(7, -1);

	public static OutgoingPacket aClass379_4535 = new OutgoingPacket(8, 7);

	public static OutgoingPacket aClass379_4536 = new OutgoingPacket(9, 8);

	public static OutgoingPacket aClass379_4537 = new OutgoingPacket(10, -1);

	public static OutgoingPacket aClass379_4566 = new OutgoingPacket(11, 2);

	public static OutgoingPacket aClass379_4561 = new OutgoingPacket(12, -1);

	public static OutgoingPacket aClass379_4540 = new OutgoingPacket(13, 11);

	public static OutgoingPacket aClass379_4541 = new OutgoingPacket(14, -1);

	public static OutgoingPacket aClass379_4542 = new OutgoingPacket(15, -2);

	public static OutgoingPacket aClass379_4532 = new OutgoingPacket(16, 3);

	public static OutgoingPacket aClass379_4544 = new OutgoingPacket(17, 2);

	public static OutgoingPacket aClass379_4531 = new OutgoingPacket(18, 4);

	public static OutgoingPacket aClass379_4546 = new OutgoingPacket(19, 8);

	public static OutgoingPacket aClass379_4547 = new OutgoingPacket(20, 3);

	public static OutgoingPacket aClass379_4605 = new OutgoingPacket(21, 8);

	public static OutgoingPacket aClass379_4604 = new OutgoingPacket(22, 8);

	public static OutgoingPacket aClass379_4550 = new OutgoingPacket(23, 8);

	public static OutgoingPacket aClass379_4559 = new OutgoingPacket(24, 7);

	public static OutgoingPacket aClass379_4552 = new OutgoingPacket(25, 7);

	public static OutgoingPacket aClass379_4553 = new OutgoingPacket(26, -1);

	public static OutgoingPacket aClass379_4554 = new OutgoingPacket(27, 8);

	public static OutgoingPacket aClass379_4555 = new OutgoingPacket(28, -2);

	public static OutgoingPacket aClass379_4551 = new OutgoingPacket(29, -1);

	public static OutgoingPacket aClass379_4557 = new OutgoingPacket(30, 1);

	public static OutgoingPacket aClass379_4623 = new OutgoingPacket(31, 3);

	public static OutgoingPacket aClass379_4626 = new OutgoingPacket(32, 9);

	public static OutgoingPacket WALK = new OutgoingPacket(33, 5);

	public static OutgoingPacket aClass379_4578 = new OutgoingPacket(34, -1);

	public static OutgoingPacket aClass379_4533 = new OutgoingPacket(35, -2);

	public static OutgoingPacket aClass379_4563 = new OutgoingPacket(36, -1);

	public static OutgoingPacket aClass379_4556 = new OutgoingPacket(37, 2);

	public static OutgoingPacket aClass379_4565 = new OutgoingPacket(38, 9);

	public static OutgoingPacket aClass379_4630 = new OutgoingPacket(39, -1);

	public static OutgoingPacket aClass379_4567 = new OutgoingPacket(40, -1);

	public static OutgoingPacket aClass379_4568 = new OutgoingPacket(41, 11);

	public static OutgoingPacket MINI_WALK = new OutgoingPacket(42, 18);

	public static OutgoingPacket aClass379_4564 = new OutgoingPacket(43, 7);

	public static OutgoingPacket aClass379_4595 = new OutgoingPacket(44, 9);

	public static OutgoingPacket aClass379_4572 = new OutgoingPacket(45, 1);

	public static OutgoingPacket aClass379_4589 = new OutgoingPacket(46, 12);

	public static OutgoingPacket aClass379_4613 = new OutgoingPacket(47, 4);

	public static OutgoingPacket aClass379_4575 = new OutgoingPacket(48, 9);

	public static OutgoingPacket aClass379_4548 = new OutgoingPacket(49, 6);

	public static OutgoingPacket aClass379_4577 = new OutgoingPacket(50, 3);

	public static OutgoingPacket aClass379_4594 = new OutgoingPacket(51, 3);

	public static OutgoingPacket aClass379_4579 = new OutgoingPacket(52, -1);

	public static OutgoingPacket aClass379_4580 = new OutgoingPacket(53, 3);

	public static OutgoingPacket aClass379_4581 = new OutgoingPacket(54, 7);

	public static OutgoingPacket aClass379_4582 = new OutgoingPacket(55, 4);

	public static OutgoingPacket aClass379_4543 = new OutgoingPacket(56, -2);

	public static OutgoingPacket aClass379_4584 = new OutgoingPacket(57, 7);

	public static OutgoingPacket aClass379_4585 = new OutgoingPacket(58, 4);

	public static OutgoingPacket aClass379_4586 = new OutgoingPacket(59, 6);

	public static OutgoingPacket aClass379_4587 = new OutgoingPacket(60, 0);

	public static OutgoingPacket aClass379_4588 = new OutgoingPacket(61, 7);

	public static OutgoingPacket aClass379_4597 = new OutgoingPacket(62, 1);

	public static OutgoingPacket aClass379_4590 = new OutgoingPacket(63, 4);

	public static OutgoingPacket aClass379_4591 = new OutgoingPacket(64, -1);

	public static OutgoingPacket aClass379_4592 = new OutgoingPacket(65, 3);

	public static OutgoingPacket aClass379_4539 = new OutgoingPacket(66, 3);

	public static OutgoingPacket aClass379_4583 = new OutgoingPacket(67, 15);

	public static OutgoingPacket aClass379_4527 = new OutgoingPacket(68, 8);

	public static OutgoingPacket aClass379_4596 = new OutgoingPacket(69, -1);

	public static OutgoingPacket aClass379_4629 = new OutgoingPacket(70, 3);

	public static OutgoingPacket aClass379_4598 = new OutgoingPacket(71, -1);

	public static OutgoingPacket aClass379_4562 = new OutgoingPacket(72, 8);

	public static OutgoingPacket OBJECT_EXAMINE = new OutgoingPacket(73, 9);

	public static OutgoingPacket aClass379_4601 = new OutgoingPacket(74, 16);

	public static OutgoingPacket aClass379_4602 = new OutgoingPacket(75, 9);

	public static OutgoingPacket aClass379_4603 = new OutgoingPacket(76, 0);

	public static OutgoingPacket aClass379_4599 = new OutgoingPacket(77, 3);

	public static OutgoingPacket aClass379_4600 = new OutgoingPacket(78, -1);

	public static OutgoingPacket aClass379_4606 = new OutgoingPacket(79, 1);

	public static OutgoingPacket aClass379_4607 = new OutgoingPacket(80, -1);

	public static OutgoingPacket aClass379_4608 = new OutgoingPacket(81, 8);

	public static OutgoingPacket aClass379_4609 = new OutgoingPacket(82, 4);

	public static OutgoingPacket aClass379_4593 = new OutgoingPacket(83, 4);

	public static OutgoingPacket aClass379_4627 = new OutgoingPacket(84, 6);

	public static OutgoingPacket aClass379_4612 = new OutgoingPacket(85, -1);

	public static OutgoingPacket aClass379_4538 = new OutgoingPacket(86, -1);

	public static OutgoingPacket aClass379_4614 = new OutgoingPacket(87, -1);

	public static OutgoingPacket aClass379_4615 = new OutgoingPacket(88, 2);

	public static OutgoingPacket aClass379_4616 = new OutgoingPacket(89, 3);

	public static OutgoingPacket aClass379_4617 = new OutgoingPacket(90, -1);

	public static OutgoingPacket aClass379_4618 = new OutgoingPacket(91, -1);

	public static OutgoingPacket aClass379_4619 = new OutgoingPacket(92, -2);

	public static OutgoingPacket aClass379_4620 = new OutgoingPacket(93, 9);

	public static OutgoingPacket aClass379_4621 = new OutgoingPacket(94, 3);

	public static OutgoingPacket aClass379_4622 = new OutgoingPacket(95, 3);

	public static OutgoingPacket aClass379_4574 = new OutgoingPacket(96, 8);

	public static OutgoingPacket aClass379_4624 = new OutgoingPacket(97, -1);

	public static OutgoingPacket aClass379_4625 = new OutgoingPacket(98, 17);

	public static OutgoingPacket aClass379_4558 = new OutgoingPacket(99, -2);

	public static OutgoingPacket aClass379_4611 = new OutgoingPacket(100, -1);

	public static OutgoingPacket aClass379_4628 = new OutgoingPacket(101, -2);

	public static OutgoingPacket aClass379_4570 = new OutgoingPacket(102, -2);

	public static OutgoingPacket aClass379_4610 = new OutgoingPacket(103, 3);

	int anInt4631;

	int anInt4632;

	OutgoingPacket(int i_1, int i_2) {
		this.anInt4631 = i_1;
		this.anInt4632 = i_2;
	}
}
