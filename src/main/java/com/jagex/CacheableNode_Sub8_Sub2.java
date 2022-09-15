package com.jagex;

import java.lang.ref.SoftReference;

public class CacheableNode_Sub8_Sub2 extends CacheableNode_Sub8 {

	SoftReference<NativeSprite> aSoftReference10410;

	CacheableNode_Sub8_Sub2(Interface18 interface18_1, NativeSprite object_2, int i_3) {
		super(interface18_1, i_3);
		aSoftReference10410 = new SoftReference<>(object_2);
	}

	@Override
	NativeSprite method14858() {
		return aSoftReference10410.get();
	}

	@Override
	NativeSprite method14859() {
		return aSoftReference10410.get();
	}

	@Override
	NativeSprite method14860() {
		return aSoftReference10410.get();
	}

	@Override
	NativeSprite method14861() {
		return aSoftReference10410.get();
	}

	@Override
	boolean method14862() {
		return true;
	}

	@Override
	NativeSprite method14863() {
		return aSoftReference10410.get();
	}

	@Override
	NativeSprite method14864() {
		return aSoftReference10410.get();
	}

	@Override
	boolean method14865() {
		return true;
	}

}
