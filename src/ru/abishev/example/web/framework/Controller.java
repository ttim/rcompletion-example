package ru.abishev.example.web.framework;

/**
 * @author Timur Abishev (timur@abishev.ru)
 */
public abstract class Controller {
    public abstract void process(Request request, Response response);
}
