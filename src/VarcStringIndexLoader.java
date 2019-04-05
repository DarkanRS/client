public class VarcStringIndexLoader {

	static IComponentDefinitions aClass118_4825;
	Index configIndex;
	public int size;

	public VarcStringIndexLoader(Game game_1, Language xlanguage_2, Index index_3) {
		new SoftCache(64);
		this.configIndex = index_3;
		this.size = this.configIndex.filesCount(SharedConfigsType.VARC_STRING.id);
	}
}
