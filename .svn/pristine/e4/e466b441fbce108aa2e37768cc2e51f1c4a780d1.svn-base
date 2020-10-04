package control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import vo.Person;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonControl {
    @RequestMapping("showAllPerson")
    public String showAllPerson(Model model){
        System.out.println("进入控制层");
        Person p1 = new Person();
        p1.setId(1);
        p1.setName("aa");

        Person p2 = new Person();
        p2.setId(2);
        p2.setName("bb");

        Person p3 = new Person();
        p3.setId(3);
        p3.setName("cc");

        List<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        model.addAttribute("list",list);
        return "show";
    }
}
