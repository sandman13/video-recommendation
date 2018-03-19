package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;

import javax.annotation.Resource;
import java.text.MessageFormat;


/**
 * @author hui zhang
 * @date 2018-3-15
 */
@Controller
@RequestMapping(value = "/demo")
public class HelloController {

    @Resource(name="userService")
    private UserService userService;

    private static final Logger LOGGER=LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/login")
    public String hello_login(){
        LOGGER.info("enter in HelloController");
        return "login";
    }

    @RequestMapping(value = "/login_check") public String login_check(String username, String password){
    LOGGER.info(MessageFormat.format("enter in HelloController,username:{0},password:{1}",username,password));
     if ( userService.queryByUserNameAndPassword(username,password)){
         return "redirect:/success";
     }else{
         return "redirect:/demo/login";
     }
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
