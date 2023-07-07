package com.web.model.service;

import static com.emp.common.SessionTemplate.*;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.model.dao.BoardDao;
import com.web.model.dao.BoardDaoImpl;
import com.web.model.dto.Board;

public class BoardServiceImpl implements BoardService {
	private BoardDao dao=new BoardDaoImpl();
	
	@Override
	public List<Board> selectBoardByNo(int no) {
		SqlSession session=getWebSession();
		List<Board> list=dao.selectBoardByNo(session, no);
		session.close();
		return list;
	}

}
