package hello.servlet.basic.request;


import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * RequestParamServlet
 * <pre>
 * 1. 파라미터 전송 기능
 * http://localhost:8080/request-param?uesrname=hello&age=20
 * </pre>
 *
 * @version 1.0,
 */

@Slf4j
@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        log.info("[전체 파라미터 조회] - start");

        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> log.info("{} = {}", paramName, request.getParameter(paramName)));

        log.info("[전체 파라미터 조회] - end");
        log.info("");

        log.info("[단일 파라미터 조회]");
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        log.info("username = {} ", username);
        log.info("age = {} ", age);
        log.info("");

        log.info("[이름이 같은 복수 파라미터 조회]");
        String[] usernames = request.getParameterValues("username");
        for (String name : usernames) {
            log.info("name = {} ", name);
        }
        log.info("");

        response.getWriter().write("ok");
    }
}
