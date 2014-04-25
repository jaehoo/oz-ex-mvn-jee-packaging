import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: asanchez
 * Date: 25/04/14
 * Time: 01:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        requestProcessor(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        requestProcessor(request,response);
    }

    public void requestProcessor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{



        System.out.println("SERVLET OK");

        TestService ts= new TestService();
        ts.getMessage();

    }

}
