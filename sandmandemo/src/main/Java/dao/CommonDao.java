package dao;

        import org.apache.ibatis.session.SqlSessionFactory;
        import org.mybatis.spring.support.SqlSessionDaoSupport;
        import org.springframework.stereotype.Repository;

        import javax.annotation.Resource;

/**
 * @author hui zhang
 * @date 2018-3-15
 */
@Repository
public class CommonDao extends SqlSessionDaoSupport {
    @Resource
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}

