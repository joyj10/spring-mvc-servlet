package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * OldController
 * <pre>
 * Describe here
 * </pre>
 *
 * @version 1.0,
 */
// 스프링 빈의 이름을 아래와 같이 세팅
// 0순위 : @RequestMapping > 1순위 : 스프링 빈의 이름으로 핸들러를 찾음
@Component("/spring/old-controller")
public class OldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest");
        return new ModelAndView("new-form");
    }
}
