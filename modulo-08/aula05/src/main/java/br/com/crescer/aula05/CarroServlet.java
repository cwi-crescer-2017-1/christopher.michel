package br.com.crescer.aula05;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author carloshenrique
 */
@WebServlet(name = "carro", urlPatterns = "/carro")
public class CarroServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json");
        try (final PrintWriter writer = resp.getWriter()) {
            writer.append(" { \"marca\" : \"VW\", \"modelo\" : \"UP\"} ");
        }
    }

}