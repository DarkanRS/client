package com.jagex;

public class PaddedJS5Request extends JS5CacheRequest {

	static Index TEXTURED_MESH_INDEX;
	byte padding;
	int anInt10377;
	ByteBuf stream;

	@Override
	int getCompletion() {
		return stream == null ? 0 : stream.index * 100 / (stream.buffer.length - padding);
	}

	@Override
	byte[] getData() {
		if (!waiting && stream.index >= stream.buffer.length - padding)
			return stream.buffer;
		throw new RuntimeException();
	}

	@Override
	byte[] method14941() {
		if (!waiting && stream.index >= stream.buffer.length - padding)
			return stream.buffer;
		throw new RuntimeException();
	}

	@Override
	byte[] method14944() {
		if (!waiting && stream.index >= stream.buffer.length - padding)
			return stream.buffer;
		throw new RuntimeException();
	}

	@Override
	byte[] method14945() {
		if (!waiting && stream.index >= stream.buffer.length - padding)
			return stream.buffer;
		throw new RuntimeException();
	}

	@Override
	int method14946() {
		return stream == null ? 0 : stream.index / (stream.buffer.length - padding);
	}

	@Override
	int method14947() {
		return stream == null ? 0 : stream.index / (stream.buffer.length - padding);
	}

	@Override
	int method14948() {
		return stream == null ? 0 : stream.index / (stream.buffer.length - padding);
	}

}
