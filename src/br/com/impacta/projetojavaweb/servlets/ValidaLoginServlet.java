package br.com.impacta.projetojavaweb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class ValidaLoginServlet extends HttpServlet{

	private static final long serialVersionUID = 7393894369402219133L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		if(login != null && senha != null){
			
			senha = senha.trim();
			login = login.trim();
			
			if(!login.isEmpty()&&!senha.isEmpty() && senha.equals("admin") && login.equals("admin")){
			
				RequestDispatcher dispatcher = req.getRequestDispatcher("/sistema"); //Despacha para a página /sistema.
				dispatcher.forward(req, resp);
				return; //Return efetuado para nao cair na linha abaixo.
			}
			
		}
			resp.sendRedirect("ProjetoJavaWeb2/errologin.html");
	}
	
	

}
