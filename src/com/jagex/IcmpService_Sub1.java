package com.jagex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jaclib.ping.IcmpService;

public class IcmpService_Sub1 extends IcmpService {

	static byte[][][] aByteArrayArrayArray7963;
	static volatile IcmpService_Sub1 anIcmpService_Sub1_7964;
	List aList7962 = new ArrayList();

	protected void notify(int i_1) {
		Iterator iterator_2 = this.aList7962.iterator();

		while (iterator_2.hasNext()) {
			Interface45 interface45_3 = (Interface45) iterator_2.next();
			interface45_3.method248(i_1 == 0, -1942989186);
		}

	}

	protected void notify(int i_1, int i_2, int i_3) {
		Iterator iterator_4 = this.aList7962.iterator();

		while (iterator_4.hasNext()) {
			Interface45 interface45_5 = (Interface45) iterator_4.next();
			interface45_5.method245(i_1, i_2, i_3);
		}

	}

	protected void method11597(int i_1) {
		Iterator iterator_2 = this.aList7962.iterator();

		while (iterator_2.hasNext()) {
			Interface45 interface45_3 = (Interface45) iterator_2.next();
			interface45_3.method248(i_1 == 0, -1493708806);
		}

	}

	protected void method11598(int i_1) {
		Iterator iterator_2 = this.aList7962.iterator();

		while (iterator_2.hasNext()) {
			Interface45 interface45_3 = (Interface45) iterator_2.next();
			interface45_3.method248(i_1 == 0, 1478443735);
		}

	}

	protected void method11599(int i_1, int i_2, int i_3) {
		Iterator iterator_4 = this.aList7962.iterator();

		while (iterator_4.hasNext()) {
			Interface45 interface45_5 = (Interface45) iterator_4.next();
			interface45_5.method245(i_1, i_2, i_3);
		}

	}

	protected void method11600(int i_1, int i_2, int i_3) {
		Iterator iterator_4 = this.aList7962.iterator();

		while (iterator_4.hasNext()) {
			Interface45 interface45_5 = (Interface45) iterator_4.next();
			interface45_5.method245(i_1, i_2, i_3);
		}

	}

}
