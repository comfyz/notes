package xyz.comfyz.notes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

/**
 * @author :    comfy
 * @date :      2019-04-12 12:22:03
 * @since :     1.8
 */
@Controller
public class TestController {

    @Autowired
    private ApplicationContext context;

    public TestController() {
        System.out.println(this.context);
    }
}
