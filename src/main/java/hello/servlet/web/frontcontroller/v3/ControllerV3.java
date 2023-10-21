package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

/**
 * ControllerV3
 * <pre>
 * Describe here
 * </pre>
 *
 * @version 1.0,
 */
public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
