package br.com.senai.Servlet01.classes;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/olamundo")
public class OlaMundo extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		PrintWriter saida = arg1.getWriter();
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<h3>Olá Mundo Servlet</h3>");
		saida.println("</body>");
		saida.println("</html>");
	}
}
