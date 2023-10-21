package hello.servlet.web.frontcontroller.v2.controller;

import hello.servlet.web.frontcontroller.v1.MyView;
import hello.servlet.web.frontcontroller.v2.ControllerV2;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * MemberFormControllerV2
 * <pre>
 * Describe here
 * </pre>
 *
 * @version 1.0,
 */
public class MemberFormControllerV2 implements ControllerV2 {

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        return new MyView("/WEB-INF/views/new-form.jsp");
    }
}
