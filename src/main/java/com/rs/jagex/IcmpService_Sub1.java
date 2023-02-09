package com.rs.jagex;

import jaclib.ping.IcmpService;

import java.util.ArrayList;
import java.util.List;

public class IcmpService_Sub1 extends IcmpService {

	static byte[][][] aByteArrayArrayArray7963;
	static volatile IcmpService_Sub1 anIcmpService_Sub1_7964;
	List<Interface45> aList7962 = new ArrayList<>();

	@Override
	protected void method11597() {
		for (Interface45 interface45_3 : aList7962)
			interface45_3.method248();

	}


	@Override
	protected void method11598() {

		for (Interface45 interface45_3 : aList7962)
			interface45_3.method248();

	}

	@Override
	protected void method11599(int i_1, int i_2, int i_3) {

		for (Interface45 interface45_5 : aList7962)
			interface45_5.addMouseRecord(i_1, i_2, i_3);

	}

	@Override
	protected void method11600(int i_1, int i_2, int i_3) {

		for (Interface45 interface45_5 : aList7962)
			interface45_5.addMouseRecord(i_1, i_2, i_3);

	}

	@Override
	protected void notify(int i_1) {

		for (Interface45 interface45_3 : aList7962)
			interface45_3.method248();

	}

	protected void notify(int i, int i_0_, int i_1_) {
		for (Interface45 interface45 : this.aList7962) {
			interface45.addMouseRecord(i, i_0_, i_1_);
		}
	}

}
