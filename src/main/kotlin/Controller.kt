import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
public class Controller {

    @GetMapping("/")
    fun blog(model: Model): String{
        model["title"] = "Click"
        return "click"
    }

}