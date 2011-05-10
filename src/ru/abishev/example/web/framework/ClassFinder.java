package ru.abishev.example.web.framework;

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
public class ClassFinder {
    public static Class findClassBySimpleName(String name) {
        for (Package _package : Package.getPackages()) {
            try {
                Class clazz = Class.forName(_package.getName() + "." + name);
                if (clazz != null) {
                    return clazz;
                }
            } catch (Exception e) {
            }
        }
        return null;
    }
}
