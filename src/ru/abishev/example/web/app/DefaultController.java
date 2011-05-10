package ru.abishev.example.web.app;

import ru.abishev.example.web.framework.*;

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
public class DefaultController extends Controller {
    @Override
    public void process(Request request, Response response) {
        response.redirectTo("user-list");
//        response.re
    }
}
