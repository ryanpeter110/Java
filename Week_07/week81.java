import java.io.*;

import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
@WebServlet ("/week81")
public class week81
extends HttpServlet {

  public void doGet(HttpServletRequest req,  HttpServletResponse res)
  throws ServletException, IOException {

    // Get print writer.
    PrintWriter out = res.getWriter();
    res.setContentType("text/html");
    String name=req.getParameter("name");
    String pass=req.getParameter("pass");
    String repass=req.getParameter("repass");
    Calendar c = Calendar.getInstance();
    
    if(pass.equals("shivamraj")&&repass.equals(pass)){
    out.println("<html><body>"
              +"<h3>Hello " +"Good Afternoon"+name
              +"</body></html>");}
    else{
        out.println("<html><body>"
                  +"<h3> Wrong Password "
                  +"</body></html>");}
    }

// Servlet to handle “post” method
  public void doPost(HttpServletRequest req,  HttpServletResponse res)
  throws ServletException, IOException {
      doGet(req,res);
  }
}
