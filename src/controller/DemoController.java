package controller;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ws.*;
import ws.DemoStub.*;
import ws.ProductWSStub.*;

/**
 * Servlet implementation class DemoController
 */
public class DemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try{
			DemoStub ds = new DemoStub();
			ProductWSStub ps = new ProductWSStub();
			//chama hello web service
			out.print(ds.hello().get_return());
			
			//chama sum web service
			Sum s = new Sum();
			s.setA(1);
			s.setB(2);
			out.print("<br>Sum: " + ds.sum(s).get_return());
			
			//chama find Web Service
			Product p = ps.find().get_return();
			out.print("<h3>Product Information</h3>");
			out.print("<br> Id: " + p.getId());
			out.print("<br> Name: " + p.getName());
			out.print("<br> price: " + p.getPrice());
			out.print("<h3> List Product Information</h3>");
			
		} catch (Exception e){
			out.print(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

