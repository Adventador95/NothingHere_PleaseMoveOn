package CorendonServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CorendonServlet
 */
@WebServlet("/CorendonServlet")
public class CorendonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CorendonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				 }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // read form fields
        String ticketnummer = request.getParameter("Ticketnummer");
        String achternaam = request.getParameter("Achternaam");
        PrintWriter out = response.getWriter();
        
        System.out.println("Ticketnummer: " + ticketnummer);
        System.out.println("Achternaam: " + achternaam);
                  
        // return response
        if ((ticketnummer).equals("Test") && ((achternaam).equals("Bemer"))){
        	
        	response.sendRedirect("success.html");
        }
        else {
        	out.println("<script type=\"text/javascript\">");
        	out.println("alert('Ticketnummer en/of achternaam incorrect.');");
        	out.println("location='Corendonlogin.html';");
        	out.println("</script>");
        
        }
        
	}

}
