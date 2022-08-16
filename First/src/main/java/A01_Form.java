

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A01_Form
 */
@WebServlet("/a01Form")
public class A01_Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A01_Form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//넘어오는 데이터를 받고 싶어요
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String adress = request.getParameter("adress");
		String qty = request.getParameter("qty");
		
		//콘솔에 먼저
//		System.out.println("이름은 "+name + "이고, 아이디는"+id+"입니다.");
		
		//화면에 데이터를 출력하고 싶어요
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<html><head></head><body>");
		out.println("이름은 "+name + "이고, 아이디는"+id+"입니다.");
		out.println("주문수량은 "+ qty + "개 입니다.");
		//무슨 물건인지 모르겠지만 단가가 100원인경우, 주문 금액을 화면에 출력하기
		int amt=0;
		amt = Integer.parseInt(qty);
		
		out.println("주문금액은 "+ amt*100 + "원 입니다.");
		out.println("</body><html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
