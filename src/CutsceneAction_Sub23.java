import java.io.File;
import java.io.RandomAccessFile;

public class CutsceneAction_Sub23 extends CutsceneAction {

	static CacheableNode_Sub7 aCacheableNode_Sub7_9445;
	int anInt9443;
	int anInt9444;

	CutsceneAction_Sub23(RsByteBuffer rsbytebuffer_1) {
		super(rsbytebuffer_1);
		this.anInt9443 = rsbytebuffer_1.readUnsignedShort();
		this.anInt9444 = rsbytebuffer_1.readInt();
	}

	public void method1592() {
		client.anInt7236 = client.cycles;
		client.anInt7237 = this.anInt9443 + client.cycles;
		SceneryShadowPreference.anInt7868 = client.anInt7238;
		Class350_Sub2.anInt7815 = client.anInt7377;
		Class329_Sub1.anInt7726 = client.anInt7413;
		Node_Sub17_Sub4.anInt9940 = client.anInt7217;
		client.anInt7238 = this.anInt9444 >>> 24;
		client.anInt7377 = this.anInt9444 >>> 16 & 0xff;
		client.anInt7413 = this.anInt9444 >>> 8 & 0xff;
		client.anInt7217 = this.anInt9444 & 0xff;
	}

	public void method1601() {
		client.anInt7236 = 1519430577 * client.cycles * 1968179203 * 1475344155;
		client.anInt7237 = (266167451 * client.cycles * 1968179203 + 349339261 * this.anInt9443 * -1213243163) * -1347062991;
		SceneryShadowPreference.anInt7868 = client.anInt7238 * -16843009 * 255 * -1065441845 * -390938125 * -1396457669 * 1823561699 * -16843009 * 255;
		Class350_Sub2.anInt7815 = -415330727 * client.anInt7377 * -1161006165 * 364894697 * 1356525315;
		Class329_Sub1.anInt7726 = -347829129 * client.anInt7413 * -403366797 * 935136583 * 1512368315;
		Node_Sub17_Sub4.anInt9940 = -1700206581 * client.anInt7217 * -284907767 * -88550325;
		client.anInt7238 = -1065441845 * (this.anInt9444 * 605669045 * -160991331 >>> 24) * 1823561699 * -16843009 * 255;
		client.anInt7377 = (this.anInt9444 * 605669045 * -160991331 >>> 16 & 0xff) * -1161006165 * 1356525315;
		client.anInt7413 = (-160991331 * this.anInt9444 * 605669045 >>> 8 & 0xff) * -403366797 * 1512368315;
		client.anInt7217 = (-160991331 * this.anInt9444 * 605669045 & 0xff) * -284907767 * -1249044679;
	}

	static File method14681(String string_0, int i_1) {
		if (!Class271.aBool3328) {
			throw new RuntimeException("");
		} else {
			File file_2 = (File) Class271.aHashtable3329.get(string_0);
			if (file_2 != null) {
				return file_2;
			} else {
				File file_3 = new File(Class271.aFile3327, string_0);
				RandomAccessFile randomaccessfile_4 = null;

				try {
					File file_6 = new File(file_3.getParent());
					if (!file_6.exists()) {
						throw new RuntimeException("");
					} else {
						randomaccessfile_4 = new RandomAccessFile(file_3, "rw");
						int i_7 = randomaccessfile_4.read();
						randomaccessfile_4.seek(0L);
						randomaccessfile_4.write(i_7);
						randomaccessfile_4.seek(0L);
						randomaccessfile_4.close();
						Class271.aHashtable3329.put(string_0, file_3);
						return file_3;
					}
				} catch (Exception exception_10) {
					try {
						if (randomaccessfile_4 != null) {
							randomaccessfile_4.close();
							Object obj_8 = null;
						}
					} catch (Exception exception_9) {
						;
					}

					throw new RuntimeException();
				}
			}
		}
	}

	public static final IComponentDefinitions method14682(RSInterface interface_0, IComponentDefinitions icomponentdefinitions_1) {
		if (icomponentdefinitions_1.parent != -1) {
			return interface_0.getComponent(icomponentdefinitions_1.parent);
		} else {
			if (!interface_0.aBool999) {
				int i_3 = icomponentdefinitions_1.idHash >>> 16;
				HashTableIterator class451_4 = new HashTableIterator(client.OPEN_INTERFACES);

				for (IFSubNode class282_sub44_5 = (IFSubNode) class451_4.first(); class282_sub44_5 != null; class282_sub44_5 = (IFSubNode) class451_4.next()) {
					if (i_3 == class282_sub44_5.interfaceId) {
						return IComponentDefinitions.getDefs((int) class282_sub44_5.data);
					}
				}
			}

			return null;
		}
	}

}
