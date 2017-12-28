
/* FileFilter_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.File;

import javax.swing.filechooser.FileFilter;

public class FileFilter_Sub1 extends FileFilter {
	Class191 this$0;
	Class191 aClass191_7864;

	public boolean accept(File file) {
		if (((FileFilter_Sub1) this).aClass191_7864.method3156(1858089337) && file.isDirectory())
			return true;
		if (!((FileFilter_Sub1) this).aClass191_7864.method3156(-400296685))
			return true;
		return false;
	}

	public boolean method12607(File file) {
		if (((FileFilter_Sub1) this).aClass191_7864.method3156(2089229371) && file.isDirectory())
			return true;
		if (!((FileFilter_Sub1) this).aClass191_7864.method3156(863956968))
			return true;
		return false;
	}

	FileFilter_Sub1(Class191 class191, Class191 class191_0_) {
		((FileFilter_Sub1) this).this$0 = class191;
		((FileFilter_Sub1) this).aClass191_7864 = class191_0_;
	}

	public String getDescription() {
		return null;
	}
}
