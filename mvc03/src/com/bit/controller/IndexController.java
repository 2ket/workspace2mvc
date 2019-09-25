package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//명령을 받아 들이는 부분. 이 컨트롤러는 서블릿 입니다.
public class IndexController extends HttpServlet{
	//index.bit 라는 확장명을 앞으로 쓰겠습니다.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		//리퀘스트 스코프가 유지되야 하는 상황->액션태그에서 하나 있었음...<jsp forward:이런거..>백앤드니까 액션태그는 없겠지만..
		RequestDispatcher rd=req.getRequestDispatcher("index.jsp");//뷰가 돠는 부분을 정해준다.
		rd.forward(req, resp);
	}

}
