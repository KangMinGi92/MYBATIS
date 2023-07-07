package com.web.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.model.dto.Board;

public class BoardDaoImpl implements BoardDao {

	@Override
	public List<Board> selectBoardByNo(SqlSession session,int no) {
		return session.selectList("board.selectBoardByNo",no);
	}

}
