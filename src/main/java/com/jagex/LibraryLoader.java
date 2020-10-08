package com.jagex;

public interface LibraryLoader {

    boolean hasDxLibrary();

    boolean unload();

    boolean loadLibrary(String var1);

    boolean containsLibrary(String var1);

	static LibraryLoader getLoader() {
	    if (Class404.LIBRARY_LOADER == null) {
	        throw new IllegalStateException("");
	    } else {
	        return Class404.LIBRARY_LOADER;
	    }
	}
}
