import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FileFilter_Sub1 extends FileFilter {

	Class191 this$0;
	Class191 aClass191_7864;

	public boolean accept(File file_1) {
		return this.aClass191_7864.method3156(1858089337) && file_1.isDirectory() ? true : !this.aClass191_7864.method3156(-400296685);
	}

	FileFilter_Sub1(Class191 class191_1, Class191 class191_2) {
		this.this$0 = class191_1;
		this.aClass191_7864 = class191_2;
	}

	public String getDescription() {
		return null;
	}

}
