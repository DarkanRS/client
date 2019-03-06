public class Class282_Sub50_Sub11_Sub1 extends JS5CacheRequest {

	byte aByte10376;
	int anInt10377;
	RsByteBuffer stream;
	static Index aClass317_10379;

	int method14947() {
		return this.stream == null ? 0 : this.stream.index / (this.stream.buffer.length - this.aByte10376);
	}

	byte[] getData(int i_1) {
		if (!this.incomplete && this.stream.index >= this.stream.buffer.length - this.aByte10376) {
			return this.stream.buffer;
		} else {
			throw new RuntimeException();
		}
	}

	int getCompletion(int i_1) {
		return this.stream == null ? 0 : this.stream.index * 100 / (this.stream.buffer.length - this.aByte10376);
	}

	byte[] method14944() {
		if (!this.incomplete && this.stream.index >= this.stream.buffer.length - this.aByte10376) {
			return this.stream.buffer;
		} else {
			throw new RuntimeException();
		}
	}

	byte[] method14945() {
		if (!this.incomplete && this.stream.index >= this.stream.buffer.length - this.aByte10376) {
			return this.stream.buffer;
		} else {
			throw new RuntimeException();
		}
	}

	byte[] method14941() {
		if (!this.incomplete && this.stream.index >= this.stream.buffer.length - this.aByte10376) {
			return this.stream.buffer;
		} else {
			throw new RuntimeException();
		}
	}

	int method14946() {
		return this.stream == null ? 0 : this.stream.index / (this.stream.buffer.length - this.aByte10376);
	}

	int method14948() {
		return this.stream == null ? 0 : this.stream.index / (this.stream.buffer.length - this.aByte10376);
	}

}
