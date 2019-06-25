package co.itcast.contriller;

import co.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author geng
 * @data 2019/5/21/10:12
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/testString")
    public  String testString(Model model){
        System.out.println("执行");
        //模仿从数据库查程序
        User user=new User();
        user.setUsername("老马");
        user.setPassword("123");
        user.setAge(88);
 //model对象
        model.addAttribute("user",user);


        return "success";
    }

    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("testvoid执行");
     //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
       //重定向
        //response.sendRedirect(request.getContextPath()+"/response.jsp");

        //直接响应
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("你好");
        return;
    }


    @RequestMapping("/testModelVoid")
    public ModelAndView testModelVoid(){
        ModelAndView mv = new ModelAndView();
        System.out.println("testmodel执行");
        //模仿从数据库查程序
        User user=new User();
        user.setUsername("小小");
        user.setPassword("123");
        user.setAge(88);
        //model对象

         mv.addObject("user",user);
         //跳转界面
        mv.setViewName("success");

        return mv;
    }
}
