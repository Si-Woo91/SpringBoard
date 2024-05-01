package com.board.service;

import java.util.List;

import com.board.model.BoardVO;
import com.board.model.Criteria;

public interface BoardService {

//	게시물 등록
	public void enroll(BoardVO board);

//	게시판 목록
	public List<BoardVO> getListPaging(Criteria cri);

//	게시물 조회
	public BoardVO getPage(int bno);	
	
//	게시물 수정
	public int modify(BoardVO board);

//	게시물 삭제
	public int delete(int bno);

//	게시판 총 갯수
	public int getTotal(Criteria cri);
	
}
