import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet",urlPatterns = "/display_discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("desciption");
        float listPrice=Float.parseFloat(request.getParameter("price"));
        float discountPercent= Float.parseFloat(request.getParameter("percent"));
        float discountAmount= listPrice*discountPercent/100;
        float discountPrice=listPrice-discountAmount;
        PrintWriter writer= response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Desciption: " + description + "</h1>");
        writer.println("<h1>List Price: " + listPrice + "</h1>");
        writer.println("Discount Percent: " + discountPercent + "</h1>");
        writer.println("Discount Amount: " + discountAmount + "</h1>");
        writer.println("Discount Price: " + discountPrice + "</h1>");

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
