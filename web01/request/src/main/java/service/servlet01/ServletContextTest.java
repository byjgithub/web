package service.servlet01;

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

@WebServlet(name = "ServletContextTest", value = "/ServletContextTest")
public class ServletContextTest extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 处理post 请求乱码问题
        request.setCharacterEncoding("utf-8");
        // 处理post 响应乱码问题
        response.setContentType("text/html;charset=utf-8");


    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 处理响应乱码问题
        response.setContentType("text/html;charset=utf-8");
        /*// 处理 get请求乱码问题 
        String name = new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8"); */
        doPost(request, response);

        /*// 获取 ServletContext 对象
        ServletContext servletContext = this.getServletContext();
        // 初始化参数
        String initParameter = servletContext.getInitParameter("");
        Enumeration<String> initParameterNames = servletContext.getInitParameterNames();
        servletContext.setInitParameter("", "");
        // 属性
        Object attribute = servletContext.getAttribute("");
        Enumeration<String> attributeNames = servletContext.getAttributeNames();
        servletContext.setAttribute("", "");*/
    }

}