public interface InputSubscriber {
	boolean valid(MouseRecord var1, KeyRecord[] var2, int var3, Class199 var4);

	static InputSubscriber decode(RsByteBuffer rsbytebuffer_0) {
		InputSubscriberType class221_2 = InputSubscriberType.valueOf(rsbytebuffer_0.readUnsignedByte());
		return (InputSubscriber) (class221_2 == InputSubscriberType.COMBINED ? CombinedInputSubscriber.decode(rsbytebuffer_0) : (class221_2 == InputSubscriberType.KEY_PRESS ? KeyPressInputSubscriber.decode(rsbytebuffer_0) : (class221_2 == InputSubscriberType.KEY_HOLD ? KeyHoldInputSubscriber.decode(rsbytebuffer_0) : null)));
	}
}
