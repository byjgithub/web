package com.itcast.service;

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
 * @create 2020/3/21 0021
 * @since 1.0.0
 */

@WebServlet(name = "AddOperaServlet", value = "/AddOperaServlet")
public class AddOperaServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 处理post 请求乱码问题
        request.setCharacterEncoding("utf-8");
        // 处理post 响应乱码问题
        response.setContentType("text/html;charset=utf-8");

        // 获取 客户端提交的数据，并进行处理
        String[] addends = request.getParameterValues("addend");
        int sum = 0;
        for (String addend : addends) {
            sum += Integer.parseInt(addend);
        }

        // 将处理结果放入 request域中
        request.setAttribute("result", sum);
        // 将结果转发至结果显示页面
        request.getRequestDispatcher("/jsp/addOperation.jsp");
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