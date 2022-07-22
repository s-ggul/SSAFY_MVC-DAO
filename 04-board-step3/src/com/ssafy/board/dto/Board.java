package com.ssafy.board.dto;
public class Board {
	private int no;
	private String title;
	private String content;
	private String writer;
	private int viewCnt;
	public Board() {}
	public Board(String title, String content, String writer, int viewCnt) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.viewCnt = viewCnt;
	}
	public Board(int no, String title, String content, String writer, int viewCnt) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.viewCnt = viewCnt;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public int getViewCnt() {
		return viewCnt;
	}
	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", viewCnt="
				+ viewCnt + "]";
	}
}
