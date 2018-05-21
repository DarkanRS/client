
/* Class96_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;
import java.io.RandomAccessFile;

public class Class96_Sub23 extends Class96 {
	int anInt9443;
	int anInt9444;
	static Class282_Sub50_Sub7 aClass282_Sub50_Sub7_9445;

	Class96_Sub23(RsByteBuffer class282_sub35) {
		super(class282_sub35);
		((Class96_Sub23) this).anInt9443 = class282_sub35.readUnsignedShort() * -1213243163;
		((Class96_Sub23) this).anInt9444 = class282_sub35.readInt() * 605669045;
	}

	public void method1592(int i) {
		client.anInt7236 = 1519430577 * client.cycles;
		client.anInt7237 = (266167451 * client.cycles + 349339261 * ((Class96_Sub23) this).anInt9443);
		Class468_Sub2.anInt7868 = client.anInt7238 * -390938125;
		Class350_Sub2.anInt7815 = -415330727 * client.anInt7377;
		Class329_Sub1.anInt7726 = -347829129 * client.anInt7413;
		Class282_Sub17_Sub4.anInt9940 = -1700206581 * client.anInt7217;
		client.anInt7238 = -1065441845 * (((Class96_Sub23) this).anInt9444 * -160991331 >>> 24);
		client.anInt7377 = ((((Class96_Sub23) this).anInt9444 * -160991331 >>> 16 & 0xff) * -1161006165);
		client.anInt7413 = (-160991331 * ((Class96_Sub23) this).anInt9444 >>> 8 & 0xff) * -403366797;
		client.anInt7217 = (-160991331 * ((Class96_Sub23) this).anInt9444 & 0xff) * -284907767;
	}

	public void method1601() {
		client.anInt7236 = 1519430577 * client.cycles;
		client.anInt7237 = (266167451 * client.cycles + 349339261 * ((Class96_Sub23) this).anInt9443);
		Class468_Sub2.anInt7868 = client.anInt7238 * -390938125;
		Class350_Sub2.anInt7815 = -415330727 * client.anInt7377;
		Class329_Sub1.anInt7726 = -347829129 * client.anInt7413;
		Class282_Sub17_Sub4.anInt9940 = -1700206581 * client.anInt7217;
		client.anInt7238 = -1065441845 * (((Class96_Sub23) this).anInt9444 * -160991331 >>> 24);
		client.anInt7377 = ((((Class96_Sub23) this).anInt9444 * -160991331 >>> 16 & 0xff) * -1161006165);
		client.anInt7413 = (-160991331 * ((Class96_Sub23) this).anInt9444 >>> 8 & 0xff) * -403366797;
		client.anInt7217 = (-160991331 * ((Class96_Sub23) this).anInt9444 & 0xff) * -284907767;
	}

	static File method14681(String string, int i) {
		if (!Class271.aBool3328)
			throw new RuntimeException("");
		File file = (File) Class271.aHashtable3329.get(string);
		if (file != null)
			return file;
		File file_0_ = new File(Class271.aFile3327, string);
		RandomAccessFile randomaccessfile = null;
		File file_1_;
		try {
			File file_2_ = new File(file_0_.getParent());
			if (!file_2_.exists())
				throw new RuntimeException("");
			randomaccessfile = new RandomAccessFile(file_0_, "rw");
			int i_3_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_3_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			Class271.aHashtable3329.put(string, file_0_);
			file_1_ = file_0_;
		} catch (Exception exception) {
			try {
				if (null != randomaccessfile) {
					randomaccessfile.close();
					Object object = null;
				}
			} catch (Exception exception_4_) {
				/* empty */
			}
			throw new RuntimeException();
		}
		return file_1_;
	}

	public static final Class118 method14682(Class98 class98, Class118 class118, int i) {
		if (2110532063 * class118.anInt1305 != -1)
			return class98.method1618(2110532063 * class118.anInt1305, (byte) 12);
		if (!class98.aBool999) {
			int i_5_ = class118.anInt1287 * -1952846363 >>> 16;
			Class451 class451 = new Class451(client.aClass465_7442);
			for (Class282_Sub44 class282_sub44 = (Class282_Sub44) class451.method7503(1677593260); null != class282_sub44; class282_sub44 = (Class282_Sub44) class451.next()) {
				if (class282_sub44.anInt8063 * 587626901 == i_5_)
					return Class117.method1981((int) (-3442165056282524525L * (class282_sub44.data)), (byte) 125);
			}
		}
		return null;
	}
}
