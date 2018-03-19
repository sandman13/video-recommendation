package service.impl;

import bean.UserDO;
import dao.UserDao;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hui zhang
 * @date 2018-3-15
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Resource(name="userDao")
    private UserDao userDao;
    public boolean queryByUserNameAndPassword(String username, String password) {
        List<UserDO> userDOList = userDao.queryByUserNameAndPassword(convertToDO(username, password));
        if (userDOList==null||userDOList.size()==0){
            return false;
        }
        return true;
    }

    private UserDO convertToDO(String username, String password) {
        UserDO userDO=new UserDO();
        userDO.setUsername(username);
        userDO.setPassword(password);
        return userDO;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
