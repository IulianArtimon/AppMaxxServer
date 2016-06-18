import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 * Created by HP-Laptop on 18-Jun-16.
 */

@WebServlet("/random")
public class ClasaMea extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter pv= resp.getWriter();
        Random r = new Random();
        int ran = r.nextInt(100);

        String val = req.getParameter("s");

        if(val.equals("1")){
            pv.write(""+ran);
        }
         else {
            pv.write(ran);
        }

        pv.close();
    }
}
