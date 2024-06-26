package com.board.model;

import java.util.Date;

public class BoardVO {
	
	/*
	create sequence board_seq
	  start with 1
	  increment by 1
	  nomaxvalue;
	
	create trigger board_trigger
	  before insert on board
	  for each row
	begin
	  select board_seq.nextval into :new.bno from dual;
	end;
	
	
	create table board (
	    bno number,
	    title varchar2(150) not null,
	    content varchar2(2000) not null,
	    writer varchar2(50) not null,
	    regdate date default sysdate,
	    updatedate date default sysdate,
	    constraint pk_board primary key(bno)
	);
	*/

//	게시판 번호
	private int bno;

//	게시판 제목
	private String title;

//	게시판 내용
	private String content;

//	게시판 작성자
	private String writer;

//	등록 날짜
	private Date regdate;

//	수정 날짜
	private Date updateDate;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + ", updateDate=" + updateDate + "]";
	}

	
}
