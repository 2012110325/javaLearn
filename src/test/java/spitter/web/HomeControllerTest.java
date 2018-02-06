package spitter.web;

import com.spittr.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

/**
 * Created by liqiang28 on 2018/2/6.
 */
public class HomeControllerTest {

    @Test
    public void testHomePage() {
        HomeController controller = new HomeController();

        MockMvc mvc = standaloneSetup(controller).build();
//        mvc.perform(get("/")).addExpect(view().name("home"));
    }



}
