package hello.servlet.web.frontcontroller.v5;

import hello.servlet.web.frontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * MyHandlerAdapter
 * <pre>
 * Describe here
 * </pre>
 *
 * @version 1.0,
 */
public interface MyHandlerAdapter {
    boolean supports(Object handler);

    ModelView handler(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
