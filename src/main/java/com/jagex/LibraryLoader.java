package com.jagex;

public interface LibraryLoader {

	static LibraryLoader getLoader() {
		if (Class404.LIBRARY_LOADER == null)
			throw new IllegalStateException("");
		return Class404.LIBRARY_LOADER;
	}

	boolean containsLibrary(String var1);

	boolean hasDxLibrary();

	boolean loadLibrary(String var1);

	boolean unload();
}
