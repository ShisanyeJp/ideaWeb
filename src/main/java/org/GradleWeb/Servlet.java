package org.GradleWeb;
////注释。。。。。。。第一第二merge
//怎么搞 注释。。。。1
//hello javaScript
//想怎么搞就这么搞
//搞不了 ，搞的了
//泰迪  tiger 聪孙
//........hello
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/MyServlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do post");
        int a = 10;
        int b =30;
        int c =a+b;
        System.out.println(c);
        System.out.println(b);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("do get");
        int a = 10;
        int b =30;
        int c =a+b;
        System.out.println(c);
        System.out.println(b);
    }
}
