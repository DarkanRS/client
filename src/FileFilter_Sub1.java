/* FileFilter_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileFilter_Sub1 extends FileFilter {
	Class214 aClass214_6317;
	Class214 aClass214_6318;

	public boolean accept(File file) {
		try {
			if (((FileFilter_Sub1) this).aClass214_6318.method1987(564359284) && file.isDirectory())
				return true;
			if (!((FileFilter_Sub1) this).aClass214_6318.method1987(842824305))
				return true;
			return false;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aeo.accept(").append(')').toString());
		}
	}

	public String getDescription() {
		try {
			return null;
		} catch (RuntimeException runtimeexception) {
			throw Class346.method4175(runtimeexception, new StringBuilder().append("aeo.getDescription(").append(')').toString());
		}
	}

	FileFilter_Sub1(Class214 class214, Class214 class214_0_) {
		super();
		((FileFilter_Sub1) this).aClass214_6317 = class214;
		((FileFilter_Sub1) this).aClass214_6318 = class214_0_;
	}
}
