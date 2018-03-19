package dao.impl;

import bean.UserDO;
import dao.CommonDao;
import dao.UserDao;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author hui zhang
 * @date 2018-3-15
 */
@Repository(value = "userDao")
public class UserDaoImpl extends CommonDao implements UserDao{
    /**
     * 根据用户和密码查询
     * @param userDO
     * @return
     */
    public List<UserDO> queryByUserNameAndPassword(UserDO userDO) {
      return getSqlSession().selectList("zh.find");
    }
}
