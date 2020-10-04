package z.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import z.dao.UserDaoInf;
import z.vo.User;

@Service
public class UserServiceImpl implements UserServiceInf {
    @Autowired
    private UserDaoInf userDaoInf;
    @Override
    public void insertUser(User user) {
        userDaoInf.insertUser(user);
    }
}
