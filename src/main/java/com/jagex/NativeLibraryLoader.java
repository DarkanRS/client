package com.jagex;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class NativeLibraryLoader implements LibraryLoader {

    public static int[][] CUTSCENE_MAP_XTEAS;

    public static int anInt3240;

    Hashtable<String, Class<LibraryBase>> linkedLibraries = new Hashtable<String, Class<LibraryBase>>();

    Hashtable<String, File> fileTable = new Hashtable<>();

    Index nativeLibraryIndex;

    String OS_AND_ARCHITECTURE;

    public NativeLibraryLoader(Index nativeIndex) {
        nativeLibraryIndex = nativeIndex;
        String str_2 = "";
        if (!Class396.OS_NAME.startsWith("win") && !Class396.OS_NAME.startsWith("windows 7")) {
            if (Class396.OS_NAME.startsWith("linux")) {
                str_2 += "linux/";
            } else if (Class396.OS_NAME.startsWith("mac")) {
                str_2 += "macos/";
            }
        } else {
            str_2 += "windows/";
        }
        if (!Class396.OS_ARCHITECTURE.startsWith("amd64") && !Class396.OS_ARCHITECTURE.startsWith("x86_64")) {
            if (!Class396.OS_ARCHITECTURE.startsWith("i386") && !Class396.OS_ARCHITECTURE.startsWith("i486") && !Class396.OS_ARCHITECTURE.startsWith("i586") && !Class396.OS_ARCHITECTURE.startsWith("x86")) {
                if (Class396.OS_ARCHITECTURE.startsWith("ppc")) {
                    str_2 += "ppc/";
                } else {
                    str_2 += "universal/";
                }
            } else {
                str_2 += "x86/";
            }
        } else {
            str_2 += "x86_64/";
        }
        OS_AND_ARCHITECTURE = str_2;
    }

    void method4637(String string_1, File file_2) {
        fileTable.put(string_1, file_2);
    }

    public boolean hasTheoraLibrary() {
        return linkedLibraries.containsKey("jagtheora");
    }

    @Override
    public boolean loadLibrary(String string_1) {
        return loadLibrary(string_1, LibraryBase.class);
    }
    
    boolean loadLibrary(String name, Class<LibraryBase> link) {
        Class<LibraryBase> baseClass = linkedLibraries.get(name);
        if (baseClass != null) {
            return baseClass.getClassLoader() == link.getClassLoader();
        } else {
            File libFile = null;
            if (libFile == null) {
                libFile = fileTable.get(name);
            }
            if (libFile != null) {
                try {
                    libFile = new File(libFile.getCanonicalPath());
                    System.load(libFile.getPath());
                    linkedLibraries.put(name, link);
                    return true;
                } catch (Throwable t) {
                	System.err.println("Error loading " + name + " library.");
                    t.printStackTrace();
                }
            }
            return false;
        }
    }

    @Override
    public boolean unload() {
        Hashtable<String, Class<LibraryBase>> hashtable_2 = new Hashtable<>();
        Enumeration<String> libraries = linkedLibraries.keys();
        while (libraries.hasMoreElements()) {
            String string_4 = libraries.nextElement();
            hashtable_2.put(string_4, linkedLibraries.get(string_4));
        }
        try {
            Class class_25 = Class.forName("java.lang.reflect.AccessibleObject");
            Class class_5 = Class.forName("java.lang.ClassLoader");
            Field field_6 = class_5.getDeclaredField("nativeLibraries");
            Method method_7 = class_25.getDeclaredMethod("setAccessible", Boolean.TYPE);
            method_7.invoke(field_6, Boolean.TRUE);
            try {
                libraries = linkedLibraries.keys();
                while (libraries.hasMoreElements()) {
                    String string_8 = libraries.nextElement();
                    try {
                        File file_9 = fileTable.get(string_8);
                        Class<LibraryBase> class_10 = linkedLibraries.get(string_8);
                        Vector vector_11 = (Vector) field_6.get(class_10.getClassLoader());
                        for (int i_12 = 0; i_12 < vector_11.size(); i_12++) {
                            try {
                                Object object_13 = vector_11.elementAt(i_12);
                                Field field_14 = object_13.getClass().getDeclaredField("name");
                                method_7.invoke(field_14, Boolean.TRUE);
                                try {
                                    String string_15 = (String) field_14.get(object_13);
                                    if (string_15 != null && string_15.equalsIgnoreCase(file_9.getCanonicalPath())) {
                                        Field field_16 = object_13.getClass().getDeclaredField("handle");
                                        Method method_17 = object_13.getClass().getDeclaredMethod("finalize");
                                        method_7.invoke(field_16, Boolean.TRUE);
                                        method_7.invoke(method_17, Boolean.TRUE);
                                        try {
                                            method_17.invoke(object_13);
                                            field_16.set(object_13, new Integer(0));
                                            hashtable_2.remove(string_8);
                                        } catch (Throwable ignored) {
                                        }
                                        method_7.invoke(method_17, Boolean.FALSE);
                                        method_7.invoke(field_16, Boolean.FALSE);
                                    }
                                } catch (Throwable ignored) {
                                }
                                method_7.invoke(field_14, Boolean.FALSE);
                            } catch (Throwable ignored) {
                            }
                        }
                    } catch (Throwable ignored) {
                    }
                }
            } catch (Throwable ignored) {
            }
            method_7.invoke(field_6, Boolean.FALSE);
        } catch (Throwable ignored) {
        }
        linkedLibraries = hashtable_2;
        return linkedLibraries.isEmpty();
    }

    @Override
    public boolean hasDxLibrary() {
        return fileTable.containsKey("jagdx");
    }

    @Override
    public boolean containsLibrary(String string_1) {
        return fileTable.containsKey(string_1);
    }

    public int method4648(String string_1) {
        if (fileTable.containsKey(string_1)) {
            return 100;
        } else {
            String string_3 = Class94.prependOS(string_1);
            if (string_3 == null) {
                return -1;
            } else {
                String string_4 = null;
                if (string_4 == null) {
                    string_4 = OS_AND_ARCHITECTURE + string_3;
                    if (!nativeLibraryIndex.method5625(string_4, "")) {
                        return -1;
                    }
                }
                if (!nativeLibraryIndex.method5629(string_4)) {
                    return nativeLibraryIndex.method5631(string_4);
                } else {
                    byte[] bytes_5 = nativeLibraryIndex.getFileByName(string_4, "");
                    Object obj_6 = null;
                    File file_7 = CutsceneAction_Sub23.method14681(string_3);
                    if (bytes_5 != null && file_7 != null) {
                        boolean bool_11 = true;
                        byte[] bytes_9 = VarNPCMap.method2621(file_7);
                        if (bytes_9 != null && bytes_9.length == bytes_5.length) {
                            for (int i_10 = 0; i_10 < bytes_9.length; i_10++) {
                                if (bytes_9[i_10] != bytes_5[i_10]) {
                                    bool_11 = false;
                                    break;
                                }
                            }
                        } else {
                            bool_11 = false;
                        }
                        try {
                            if (!bool_11) {
                                try {
                                    FileOutputStream fileoutputstream_12 = new FileOutputStream(file_7);
                                    fileoutputstream_12.write(bytes_5, 0, bytes_5.length);
                                    fileoutputstream_12.close();
                                } catch (IOException ioexception_13) {
                                    throw new RuntimeException();
                                }
                            }
                        } catch (Throwable throwable_14) {
                            return -1;
                        }
                        method4637(string_1, file_7);
                        return 100;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }
}
