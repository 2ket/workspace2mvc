package com.bit.test;

import java.sql.Connection;
import java.util.ArrayList;

import com.bit.model.Guest02Dao;
import com.bit.model.Guest02Dto;

public class DaoTest {

	public static void main(String[] args) {
		Guest02Dao dao = new Guest02Dao();
		Connection conn=dao.getConnection();
//		System.out.println("Connection? :"+(conn!=null));
		ArrayList<Guest02Dto> list = dao.getList();
		
		//����Ʈ���� �ܿ� �׽�Ʈ�� �����ϰ� ��(Ŀ�ؼ��� ����� Ȯ��)
		int last=0;
		for(Guest02Dto bean : list){
//			System.out.println(bean);
			int num=bean.getNum();
			if(last<num)last=num;
		}
		
//		����Ʈ�� �����ϴ���, ����Ʈ ����� 0���� ū�� Ȯ��
		System.out.println("list?:"+(list!=null));
		int size =list.size();
		System.out.println("list size>0? :"+(size>0));
		
//		����Ʈ�� �߰��� �Ǵ��� Ȯ��
		dao=new Guest02Dao();
		Guest02Dto target=new Guest02Dto();
		target.setSub("new test1");
		target.setUnum(1);
		target.setPay(1111);
		
		dao.addList(target.getSub(), target.getUnum(), target.getPay());
		
		dao=new Guest02Dao();
		System.out.println("insert? :"+(size+1==dao.getList().size()));
		
		dao=new Guest02Dao();
		Guest02Dto bean = dao.getListOne(last+1);
		System.out.println(bean);
		//���� �Է��� ����� ������ Ȯ��
		System.out.println("detail? :"+(bean.getSub().equals("new test1")&&1==bean.getUnum()&&1111==bean.getPay()));
		
		dao=new Guest02Dao();
		target.setSub("edit01");
		target.setPay(2222);
		System.out.println("update?"+(dao.editOne(target.getSub(), target.getPay(), target.getNum())>0));
		
	}

}
