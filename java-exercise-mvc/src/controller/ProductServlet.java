package controller;

import model.Product;
import service.ProductServiceImpl;
import service.ProductSevice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet",urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductSevice productSevice = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");
        if (action==null){
            action="";
        }
        switch (action){
            case"create":
                createProduct(request,response);
                break;
                default:
                    break;
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
      String name = request.getParameter("name ");
      int id = Integer.parseInt(request.getParameter("id"));
      String function = request.getParameter("function");
      Product product = new Product(id,name,function);
      this.productSevice.save(product);
      RequestDispatcher requestDispatcher= request.getRequestDispatcher("product/create.jsp");
      request.setAttribute("message","New product was created");
      try {
          requestDispatcher.forward(request,response);
      } catch (ServletException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action== null){
            action="";
        }
        switch (action){
            case "create":
                showCreateForm(request,response);
                break;
                default:
                    listProducts(request,response);
                    break;
        }
    }


    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher=request.getRequestDispatcher("product/creat.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products= this.productSevice.findAll();
        request.setAttribute("products",products);
        RequestDispatcher dispatcher=request.getRequestDispatcher("product/list.jsp");
        try{
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
