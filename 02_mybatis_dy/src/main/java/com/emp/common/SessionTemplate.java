package com.emp.common;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SessionTemplate {
	public static SqlSession getSession() {
		SqlSession session=null;
		String file="mybatis-config.xml";
		try(InputStream is=Resources.getResourceAsStream(file);) {
			session=new SqlSessionFactoryBuilder().build(is).openSession(false);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
	}
	public static SqlSession getWebSession() {
		String file="mybatis-config.xml";
		SqlSession session=null;
		try(InputStream is=Resources.getResourceAsStream(file);){
			//위에서 build(is)뒤에 아무것도 안써서 기본 environments default="BS"값의 default로 불러왔지만, 
			//environment가 2개이상일경우 연결해야할 환경의 environment id="web" id값을 넣어줘야한다.
			session=new SqlSessionFactoryBuilder().build(is,"web").openSession();
		}catch(IOException e) {
			e.printStackTrace();
		}
		return session;
	}
}	
