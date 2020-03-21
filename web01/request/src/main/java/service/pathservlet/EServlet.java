package service.pathservlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈${DESCRIPTION}〉
 *
 * @author Administrator
 * @create 2020/3/20 0020
 * @since 1.0.0
 */

@WebServlet(name = "EServlet", value = "/EServlet")
public class EServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 处理post 请求乱码问题
        request.setCharacterEncoding("utf-8");
        // 处理post 响应乱码问题
        response.setContentType("text/html;charset=utf-8");

        System.out.println("这是 EServlet！！！");
        response.getWriter().println("这是/request/service/EServlet");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 处理响应乱码问题
        response.setContentType("text/html;charset=utf-8");
        /*// 处理 get请求乱码问题 
        String name = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8"); */
        doPost(request, response);


    }

}