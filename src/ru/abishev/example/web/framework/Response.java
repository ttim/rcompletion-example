package ru.abishev.example.web.framework;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
public class Response {
    public void redirectTo(String routeName) {
        // ...
    }

    public List<String> getCompletionList() {
        List<String> result = new ArrayList<String>();


        try {
            for (String routeName : Config.getAppConfig().getRouter().getRoutes()) {
                result.add("redirectTo(\"" + routeName + "\")");
            }
        } catch (Exception e) {
            result.add("!Exception " + e);
        }

        return result;
    }
}
