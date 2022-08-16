

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A02_Form
 */
@WebServlet("/a02Form")
public class A02_Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A02_Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    // 여기에 내가 하고싶은 작업을 작성하면 된다.
        // 폼에서 입력한 내용을 하면에 뿌려주기
        // 폼에서 입력한 이메일, 날짜, 코멘트, 야구 내용을 가져오기
		
		request.setCharacterEncoding("UTF-8");
		
        String email = request.getParameter("email");
        Date date = Date.valueOf(request.getParameter("date"));
        String comment = request.getParameter("comment");
        String baseball = request.getParameter("baseball");
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.print("<html><head></head><body>");
        out.print("email : " + email + "<br>");
        out.print("date : " + date + "<br>");
        out.print("comment : " + comment + "<br>");
        out.print("baseball : " + baseball + "<br>");
        out.print("</body></html>");
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
