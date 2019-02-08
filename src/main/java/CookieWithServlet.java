import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns={"/cookie"})
public class CookieWithServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {



        response.addHeader("Set-Cookie", "arkadas3=isa aytimur"); // cookie eklemenin diger bir yolu


          

    }


    protected void doPost(HttpServletRequest request,HttpServletResponse response)
    throws ServletException, IOException {
      doPost(request, response);
    }


}