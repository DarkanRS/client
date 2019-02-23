public final class IComponentSettings extends Node {

	static IComponentSettings aClass282_Sub10_7546 = new IComponentSettings(0, -1);
	public int settings;
	public int interfaceId;

	public final boolean dragEnabled() {
		return (this.settings >> 21 & 0x1) != 0;
	}

	public final boolean clickOptionEnabled(int option) {
		return (this.settings >> option + 1 & 0x1) != 0;
	}

	public final int getUseOptionFlags() {
		return Class96_Sub6.getUseOptionFlags(this.settings);
	}

	public final int depthFlags() {
		return this.settings >> 18 & 0x7;
	}

	public IComponentSettings(int i_1, int i_2) {
		this.settings = i_1;
		this.interfaceId = i_2;
	}

	public final boolean bit22Enabled() {
		return (this.settings >> 22 & 0x1) != 0;
	}

	public final boolean continueOptionEnabled() {
		return (this.settings & 0x1) != 0;
	}

	public final boolean bit23Enabled() {
		return (this.settings >> 23 & 0x1) != 0;
	}

}
