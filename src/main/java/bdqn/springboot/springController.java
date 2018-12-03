package bdqn.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class springController {
    @Autowired
    private Student student;
    @ResponseBody
    @RequestMapping("/say")
    public String sayHello(){
        return ""+student.getName()+"";
    }
}
