package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Guest02Dao;

@WebServlet("/bbs/detail.bit")
public class DetailController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num=Integer.parseInt(req.getParameter("idx"));
		Guest02Dao dao=new Guest02Dao();
		req.setAttribute("bean", dao.getListOne(num));
		
		RequestDispatcher rd =null;
		rd=req.getRequestDispatcher("/mvc05/bbs/detail.jsp");
		rd.forward(req, resp);
	}
}
