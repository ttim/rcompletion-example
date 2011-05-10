package ru.abishev.example.web.framework;

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
public abstract class Config {
    public abstract Router getRouter();

    public static Config getAppConfig() {
        try {
//            Class configClass = ClassFinder.findClassBySimpleName("AppConfig");
//            if (configClass == null) {
//                throw new RuntimeException("Null config class!");
//            }
//
//            return (Config) configClass.newInstance();
            return (Config) Class.forName("ru.abishev.example.web.app.AppConfig").newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
