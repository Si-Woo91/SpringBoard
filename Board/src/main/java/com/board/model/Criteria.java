package com.board.model;

import java.util.Arrays;

public class Criteria {
	
//	현재 페이지
	private int pageNum;

//	한 페이지 당 보여지는 게시물 수
	private int amount;

//	검색 키워드
	private String keyword;

//	검색 타입
	private String type;

//	검색 타입 배열 변환
	private String[] typeArr;

//	기본 생성자 (기본 : 1, 보여지는 게시물 수 : 10
	public Criteria() {
		this(1,10);
	}

//	생성자
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		this.typeArr = type.split("");
	}

	public String[] getTypeArr() {
		return typeArr;
	}

	public void setTypeArr(String[] typeArr) {
		this.typeArr = typeArr;
	}

	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", keyword=" + keyword + ", type=" + type
				+ ", typeArr=" + Arrays.toString(typeArr) + "]";
	}	
	
}
