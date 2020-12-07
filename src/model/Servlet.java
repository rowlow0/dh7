package model;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String dept=req.getParameter("dept");
		String id=req.getParameter("id");
		String check=req.getParameter("check");
		
		String duty=req.getParameter("duty");
		String name=req.getParameter("name");
		String phone=req.getParameter("phone");
		String position=req.getParameter("position");
		
		String flag=req.getParameter("flag");
		String url="index.jsp";
		
		System.out.println(flag);
		System.out.println(check);
		
		if(flag.equals("s")&&check.equals("checkDept")) {
		 Dao dao=new Dao();
		 Dto dto=new Dto();
		 List<Dto> list=null;
			 dto.setDept(dept);
			 list=dao.selectDept(dto);	
		 req.setAttribute("list", list);
		 url="selectResult.jsp";
		}
		
		if(flag.equals("s")&&check.equals("checkId")) {
			 Dao dao=new Dao();
			 Dto dto=new Dto();
			 List<Dto> list=null;
				 dto.setId(id);
				 list=dao.selectId(dto);
			 req.setAttribute("list", list);
			 url="selectResult.jsp";
			}
		
		if(flag.equals("u")) {
			 Dao dao=new Dao();
			 Dto dto=new Dto();
			 dto.setDept(dept);
			 dto.setDuty(duty);
			 dto.setId(id);
			 dto.setName(name);
			 dto.setPhone(phone);
			 dto.setPosition(position);
			 dao.update(dto);
		}
		
		if(flag.equals("i")) {
			 Dao dao=new Dao();
			 Dto dto=new Dto();
			 dto.setDept(dept);
			 dto.setDuty(duty);
			 dto.setId(id);
			 dto.setName(name);
			 dto.setPhone(phone);
			 dto.setPosition(position);
			 dao.insert(dto);
		}
		
		if(flag.equals("d")) {
			 Dao dao=new Dao();
			 Dto dto=new Dto();
			 dto.setId(id);
			 dto.setName(name);
			 dao.delete(dto);
		}
		
		
		RequestDispatcher dis=req.getRequestDispatcher(url);
		dis.forward(req, res);
	}

}
