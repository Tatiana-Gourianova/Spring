package gourianova.apptrainer.controller;
import gourianova.apptrainer.model.App;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AppController {

    private static App app;

    static {
        app = new App();
        app.setTitle("GleamingStar");
        app.setYear(2017);
        app.setGenre("shooter");

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allApps() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("apps");
        modelAndView.addObject("app",app);
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;


        }


}
