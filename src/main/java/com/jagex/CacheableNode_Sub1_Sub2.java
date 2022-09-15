package com.jagex;

import java.lang.ref.SoftReference;

public class CacheableNode_Sub1_Sub2 extends CacheableNode_Sub1 {

	SoftReference aSoftReference10403;

	CacheableNode_Sub1_Sub2(Object object_1, int i_2) {
		super(i_2);
		aSoftReference10403 = new SoftReference(object_1);
	}

	@Override
	boolean method14691() {
		return true;
	}

	@Override
	Object method14692() {
		return aSoftReference10403.get();
	}

	@Override
	Object method14693() {
		return aSoftReference10403.get();
	}

	@Override
	boolean method14694() {
		return true;
	}

}
