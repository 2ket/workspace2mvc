package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//����� �޾� ���̴� �κ�. �� ��Ʈ�ѷ��� ���� �Դϴ�.
public class IndexController extends HttpServlet{
	//index.bit ��� Ȯ����� ������ ���ڽ��ϴ�.
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		//������Ʈ �������� �����Ǿ� �ϴ� ��Ȳ->�׼��±׿��� �ϳ� �־���...<jsp forward:�̷���..>��ص�ϱ� �׼��±״� ��������..
		RequestDispatcher rd=req.getRequestDispatcher("index.jsp");//�䰡 �´� �κ��� �����ش�.
		rd.forward(req, resp);
	}

}
