package com.rs.jagex;

public class CacheableNode_Sub11_Sub2 extends JS5CacheRequest {

	JS5CacheFile aClass203_10464;
	int anInt10467;
	byte[] aByteArray10469;

	@Override
	int getCompletion() {
		return waiting ? 0 : 100;
	}

	@Override
	byte[] getData() {
		if (waiting)
			throw new RuntimeException();
		return aByteArray10469;
	}

	@Override
	byte[] method14941() {
		if (waiting)
			throw new RuntimeException();
		return aByteArray10469;
	}

	@Override
	byte[] method14944() {
		if (waiting)
			throw new RuntimeException();
		return aByteArray10469;
	}

	@Override
	byte[] method14945() {
		if (waiting)
			throw new RuntimeException();
		return aByteArray10469;
	}

	@Override
	int method14946() {
		return waiting ? 0 : 100;
	}

	@Override
	int method14947() {
		return waiting ? 0 : 100;
	}

	@Override
	int method14948() {
		return waiting ? 0 : 100;
	}

}
