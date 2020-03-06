package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sistema")
public class HomeSistemaServlet extends HttpServlet{

	private static final long serialVersionUID = -144188071113791664L;

	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("ISO-8859-1");
		resp.setContentType("text/html"); //Informa que está recebendo um HTML
		
		PrintWriter out = resp.getWriter(); // Varaável para concatenar 
		
		out.println("<html>");
		out.println("<html/>");
		out.println("<head>");
		out.println("<tittle>Home</tittle>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Bem-Vindo!</h1>");
		out.println("<h4>Essa eh a pagina principal do sistema</h4>"); //Usa "nome" pq é o que está contido no valor "name"no arquivo HTML 
		out.println("<h3><a href=\"login.html\"> Logout</a></h3>");
		out.println("</body>");
		out.println("</html>");
	}
	
	

}
