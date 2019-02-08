import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/send"})
public class SendRedirect extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {


        try {
            PrintWriter writer = response.getWriter();
            writer.write("eeh");
        } catch (IOException e) {
          e.printStackTrace();
        } 

          

    }




}