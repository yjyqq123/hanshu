package cn.itcast.web.servletContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextDemo2")
public class servletContextDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
         * ServletContext对象的获取
         *  1.获取MIME类型：
            2.域对象：共享数据
            3.获取文件的真实(服务器)路径
            *
         */
        //2.通过HttpServlet获取
        ServletContext context=this.getServletContext();
        //3.获取数据
        Object msg=context.getAttribute("msg");
        System.out.println(msg);


    }
}