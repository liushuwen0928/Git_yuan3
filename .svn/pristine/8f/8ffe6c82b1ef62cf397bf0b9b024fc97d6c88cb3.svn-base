package z.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import z.biz.UserServiceInf;
import z.vo.User;

@RestController
@RequestMapping("/user")
public class UserControl {
    @Autowired
    private UserServiceInf userServiceinf;
    /**
     * 添加用户
     */
    @RequestMapping("/insertUser")
    public String insertUser(){
        System.out.println("aa");
        User user  =new User();
        user.setName("aa");
        user.setAge(10);
        this.userServiceinf.insertUser(user);
        return "ok";
    }
}
