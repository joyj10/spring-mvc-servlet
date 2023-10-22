package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * ControllerV4
 * <pre>
 * Describe here
 * </pre>
 *
 * @version 1.0,
 */
public interface ControllerV4 {

    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
