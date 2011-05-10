package ru.abishev.example.web.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
public class Router {
    private final List<String> routes = new ArrayList<String>();

    public void registerRoute(String path, String name, Controller controller) {
        routes.add(name);
    }

    public List<String> getRoutes() {
        return routes;
    }
}
