package com.jagex;

public class PaddedJS5Request extends JS5CacheRequest {

    byte padding;
    int anInt10377;
    RsByteBuffer stream;
    static Index TEXTURED_MESH_INDEX;

    int method14947() {
        return this.stream == null ? 0 : this.stream.index / (this.stream.buffer.length - this.padding);
    }

    byte[] getData(int i_1) {
        if (!this.waiting && this.stream.index >= this.stream.buffer.length - this.padding) {
            return this.stream.buffer;
        } else {
            throw new RuntimeException();
        }
    }

    int getCompletion(int i_1) {
        return this.stream == null ? 0 : this.stream.index * 100 / (this.stream.buffer.length - this.padding);
    }

    byte[] method14944() {
        if (!this.waiting && this.stream.index >= this.stream.buffer.length - this.padding) {
            return this.stream.buffer;
        } else {
            throw new RuntimeException();
        }
    }

    byte[] method14945() {
        if (!this.waiting && this.stream.index >= this.stream.buffer.length - this.padding) {
            return this.stream.buffer;
        } else {
            throw new RuntimeException();
        }
    }

    byte[] method14941() {
        if (!this.waiting && this.stream.index >= this.stream.buffer.length - this.padding) {
            return this.stream.buffer;
        } else {
            throw new RuntimeException();
        }
    }

    int method14946() {
        return this.stream == null ? 0 : this.stream.index / (this.stream.buffer.length - this.padding);
    }

    int method14948() {
        return this.stream == null ? 0 : this.stream.index / (this.stream.buffer.length - this.padding);
    }

}
