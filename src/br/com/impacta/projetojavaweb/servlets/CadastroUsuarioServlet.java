package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cadastro")
public class CadastroUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = -595180341272296993L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("ISO-8859-1");
		resp.setContentType("text/html"); //Informa que está recebendo um HTML
		
		PrintWriter out = resp.getWriter(); // Varaável para concatenar 
		
		//Abaixo irá montar o HTML usando a variável out
		
		out.println("<html>");
		out.println("<html/>");
		out.println("<head>");
		out.println("<tittle>Cadastro efetuado com sucesso!</tittle>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Cadastro realizado com sucesso.</h1>");
		out.println("<h4>Nome: </h4>" + req.getParameter("nome")); //Usa "nome" pq é o que está contido no valor "name"no arquivo HTML 
		out.println("<h4>Login: </h4>" + req.getParameter("login"));
		out.println("</body>");
		out.println("</html>");
		
		
	}

	
	

}
