import javax.servlet.*;
import java.util.*;
import java.io.*;

public class PostParametersServlet extends GenericServlet {
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        Enumeration g = request.getParameterNames();
        while (g.hasMoreElements()) {
            String pname = (String) g.nextElement();
            pw.print(pname + " = ");
            String pvalue = request.getParameter(pname);
            pw.println(pvalue);
        }
        pw.close();

    }
}