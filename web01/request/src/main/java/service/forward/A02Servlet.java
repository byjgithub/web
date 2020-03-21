package service.forward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

/**
 * 演示request获取请求的参数：
 * getParameter(String name):获取html提交来的数据，根据 name属性值，获取客户端提交的值。
 * getParameterNames(String name);获取html提交来的数据，根据 name属性值，获取客户端提交的数据的集合。
 *
 * @Description TODO
 * @ClassName ${NAME}
 * @Author Administrator
 * @Date 2020/3/17 0017 20:17
 * @Version V1.0
 */
@WebServlet(name = "a02Servlet", value = "/A02Servlet")
public class A02Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        // 获取超链接提交的数据

        String xxx = request.getParameter("xxx");
        String yyy = request.getParameter("yyy");
        System.out.println("超链接提交的数据：" + xxx + "    " + yyy);

        System.out.println();

        //获取表单提交的数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String[] hobbies = request.getParameterValues("hobby");
        PrintWriter writer = response.getWriter();
        System.out.println("用户=" + username
                + ";  密码=" + password
                + ";  爱好：" + Arrays.toString(hobbies));


        // 获取所有请求参数的名称
        Enumeration<String> names = request.getParameterNames();
        while (names.hasMoreElements()) {
            System.out.println(names.nextElement());
        }

        // 获取所有请求参数封装到 Map中
        Map<String, String[]> map = request.getParameterMap();
        for (String name : map.keySet()) {
            String[] value = map.get(name);
            System.out.println(name + "=" + Arrays.toString(value));
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request, response);
    }
}