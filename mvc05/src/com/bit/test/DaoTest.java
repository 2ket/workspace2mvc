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
		
		//프론트엔드 외에 테스트가 가능하게 됨(커넥션이 됬는지 확인)
		int last=0;
		for(Guest02Dto bean : list){
//			System.out.println(bean);
			int num=bean.getNum();
			if(last<num)last=num;
		}
		
//		리스트가 존재하는지, 리스트 사이즈가 0보다 큰지 확인
		System.out.println("list?:"+(list!=null));
		int size =list.size();
		System.out.println("list size>0? :"+(size>0));
		
//		리스트에 추가가 되는지 확인
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
		//내가 입력한 내용과 같은지 확인
		System.out.println("detail? :"+(bean.getSub().equals("new test1")&&1==bean.getUnum()&&1111==bean.getPay()));
		
		dao=new Guest02Dao();
		target.setSub("edit01");
		target.setPay(2222);
		System.out.println("update?"+(dao.editOne(target.getSub(), target.getPay(), target.getNum())>0));
		
	}

}
