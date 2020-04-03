package cn.cloudcc.aigou.controller;


import cn.cloudcc.aigou.domain.Employee;
import cn.cloudcc.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//登陆controller 用来接收登陆请求 ，判断是否登录成功
@RestController
public class LoginController {

//    设置restfull风格  请求路径和请求方法
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){


        System.out.println(employee);
//     判断用户名或者密码是否正确

        if("admin".equals(employee.getUsername()) && "0".equals(employee.getPassword())){
            return AjaxResult.me();//调用静态方法  自动默认成功
        }
        return AjaxResult.me().setSuccess(false).setMessage("用户名或者密码错误！");

    }



}
