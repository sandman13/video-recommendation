package service;

/**
 * @author hui zhang
 * @date 2018-3-15
 */
public interface UserService {

    boolean queryByUserNameAndPassword(String username,String password);

}
