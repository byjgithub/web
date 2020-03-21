package service.servlet01;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "B1Servlet", value = "/B1Servlet")
public class B1Servlet extends HttpServlet {

    int count;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        // 获取响应头信息
        String referer = request.getHeader("Referer");
        System.out.println(referer);
        // 对request请求进行判断，是否来自本地请求
        if (referer == null || !referer.contains("localhost")) {
            // 非本地请求，发送404异常
            response.sendError(404,"非localhost访问");
        } else {
            // 本地请求，记录访问次数
            System.out.println("本地连接访问次数：" + (++count));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");


    }

}