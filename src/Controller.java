import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by 48089748z on 21/04/16.
 */
public class Controller extends HttpServlet
{
    @Override
    public void init() throws ServletException {super.init();}

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        PrintWriter pw = resp.getWriter();
        String value = req.getParameter("value");
        if (value.equalsIgnoreCase("vermell")) {pw.println("<font color=\"red\">Aixo es Vermell</font>    <input name =\"button\" type=\"submit\" value=\"Back\" onclick=\"location.href='./index.jsp'\"/>");}
        else if (value.equalsIgnoreCase("verd")) {pw.println("<font color=\"green\">Aixo es Verd</font>    <input name =\"button\" type=\"submit\" value=\"Back\" onclick=\"location.href='./index.jsp'\"/>");}
        else if (value.equalsIgnoreCase("negre")) {pw.println("<font color=\"black\">Aixo es Negre</font>    <input name =\"button\" type=\"submit\" value=\"Back\" onclick=\"location.href='./index.jsp'\"/>");}
        else if (value.equalsIgnoreCase("groc")) {pw.println("<font color=\"yellow\">Aixo es Groc</font>    <input name =\"button\" type=\"submit\" value=\"Back\" onclick=\"location.href='./index.jsp'\"/>");}
        else if (value.equalsIgnoreCase("blau")) {pw.println("<font color=\"blue\">Aixo es Blau</font>    <input name =\"button\" type=\"submit\" value=\"Back\" onclick=\"location.href='./index.jsp'\"/>");}
        else {pw.println("<font color=\"black\">NO HO SE TOT!</font><br></br><img src=\"https://s-media-cache-ak0.pinimg.com/736x/03/47/49/034749c536d770cdbff3d9eb3e81196a.jpg\" alt=\"Mountain View\" style=\"width:304px;height:228px;\">    <input name =\"button\" type=\"submit\" value=\"Back\" onclick=\"location.href='./index.jsp'\"/>");}
    }
}
