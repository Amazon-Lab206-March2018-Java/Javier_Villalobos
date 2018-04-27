import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//...
//...
@WebServlet("/home")
public class Home extends HttpServlet {
  private static final long serialVersionUID = 1L;
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // get the value for the query parameter
      String userName = request.getParameter("name");
      String language = request.getParameter("language");
      String hometown = request.getParameter("hometown");
      if(userName==null)
    	  userName="Unknown";
      if(language==null)
    	  language="Unknown";
      if(hometown==null)
    	  hometown="Unknown";
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.write("<h1>Welcome, " + userName + "</h1>");
      out.write("<h1>Your favorite language is: " + language + "</h1>");
      out.write("<h1>Your hometown is: " + hometown + "</h1>");
  }
}