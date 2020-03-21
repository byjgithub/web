package service.forward;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈转发〉
 *
 * @author Administrator
 * @create 2020/3/18 0018
 * @since 1.0.0
 */

@WebServlet(name = "B2Servlet", value = "/B2Servlet")
public class B2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        /* 处理请求的第一个Servlet*/
        // 设置响应头
        response.setHeader("b2Servlet", "b2Servlet");

        //设置响应体
        response.getWriter().println("B2Servlet");

        // 请求转发，等同于调用 c2Servlet 的 service方法
        request.getRequestDispatcher("/C2Servlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");


    }

}