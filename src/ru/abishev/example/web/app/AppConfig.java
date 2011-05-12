package ru.abishev.example.web.app;

import ru.abishev.example.web.framework.Config;
import ru.abishev.example.web.framework.Router;

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
public class AppConfig extends Config {
    @Override
    public Router getRouter() {
        return new Router() {
            {
                registerRoute("/", "index", new DefaultController());
                registerRoute("/users", "user-list", new DefaultController());
                registerRoute("/user/:id", "user-view", new DefaultController());
//                registerRoute("/ad/:id", "ad-view", new DefaultController());9
            }
        };
    }
}
