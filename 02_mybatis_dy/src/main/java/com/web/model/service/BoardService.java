package com.web.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.model.dto.Board;


public interface BoardService {
	public List<Board> selectBoardByNo(int no);
}
