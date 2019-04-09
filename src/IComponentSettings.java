public final class IComponentSettings extends Node {

	static IComponentSettings DEFAULT_SETTINGS = new IComponentSettings(0, -1);
	public int settingsHash;
	public int interfaceId;

	public final boolean dragEnabled() {
		return (this.settingsHash >> 21 & 0x1) != 0;
	}

	public final boolean clickOptionEnabled(int option) {
		return (this.settingsHash >> option + 1 & 0x1) != 0;
	}

	public final int getUseOptionFlags() {
		return IComponentSettings.getUseOptionFlags(this.settingsHash);
	}

	public final int depthFlags() {
		return this.settingsHash >> 18 & 0x7;
	}

	public IComponentSettings(int i_1, int i_2) {
		this.settingsHash = i_1;
		this.interfaceId = i_2;
	}

	public final boolean bit22Enabled() {
		return (this.settingsHash >> 22 & 0x1) != 0;
	}

	public final boolean continueOptionEnabled() {
		return (this.settingsHash & 0x1) != 0;
	}

	public final boolean bit23Enabled() {
		return (this.settingsHash >> 23 & 0x1) != 0;
	}

	static final int getUseOptionFlags(int settings) {
		return settings >> 11 & 0x7f;
	}

}
