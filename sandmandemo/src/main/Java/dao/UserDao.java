package dao;

import bean.UserDO;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author hui zhang
 * @date 2018-3-15
 */
public interface  UserDao{

    List<UserDO> queryByUserNameAndPassword(UserDO userDO);

}
