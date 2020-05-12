package com.mini.minishop;

public class Pagination {

	private int listSize = 5; // 초기값으로 목록개수를 5로 셋팅
	private int rangeSize = 5; // 초기값으로 페이지범위를 5로 셋팅
	private int page; // 현재 페이지
	private int range; // 현재 페이지 범위
	private int listCnt; // 게시글의 총 갯수
	private int pageCnt; // 총 페이지 갯수
	private int startPage;
	private int startList;
	private int endPage;
	private boolean prev; // 이전버튼을 만들지 판단
	private boolean next; // 다음버튼을 만들지 판단
	private int startCount; // 해당 페이지에서 게시글의 시작 번호
	private int endCount; // 해당 페이지에서 게시글의 끝 번호

	public int getRangeSize() {

		return rangeSize;

	}

	public int getPage() {

		return page;

	}

	public void setPage(int page) {

		this.page = page;

	}

	public int getRange() {

		return range;

	}

	public void setRange(int range) {

		this.range = range;

	}

	public int getStartPage() {

		return startPage;

	}

	public void setStartPage(int startPage) {

		this.startPage = startPage;

	}

	public int getEndPage() {

		return endPage;

	}

	public void setEndPage(int endPage) {

		this.endPage = endPage;

	}

	public boolean isPrev() {

		return prev;

	}

	public void setPrev(boolean prev) {

		this.prev = prev;

	}

	public boolean isNext() {

		return next;

	}

	public void setNext(boolean next) {

		this.next = next;

	}

	public int getListSize() {

		return listSize;

	}

	public void setListSize(int listSize) {

		this.listSize = listSize;

	}

	public int getListCnt() {

		return listCnt;

	}

	public void setListCnt(int listCnt) {

		this.listCnt = listCnt;

	}

	public int getStartList() {

		return startList;

	}

	public int getStartCount() {
		return startCount;
	}

	public void setStartCount(int startCount) {
		this.startCount = startCount;
	}

	public int getEndCount() {
		return endCount;
	}

	public void setEndCount(int endCount) {
		this.endCount = endCount;
	}

	public void pageInfo(int page, int range, int listCnt) {
		this.page = page;
		this.range = range;
		this.listCnt = listCnt;
		// 전체 페이지수
		this.pageCnt = (int) Math.ceil((double) listCnt / listSize);
		// 시작 페이지
		this.startPage = (range - 1) * rangeSize + 1;
		// 끝 페이지
		this.endPage = range * rangeSize;
		// 게시판 시작번호
		this.startList = (page - 1) * listSize;
		// 이전 버튼 상태
		this.prev = range == 1 ? false : true;
		// 다음 버튼 상태
		this.next = pageCnt > endPage ? true : false;
		if (this.endPage > this.pageCnt) {
			this.endPage = this.pageCnt;
			this.next = false;
		}
		this.startCount = (page - 1) * listSize + 1;
		this.endCount = page * listSize;
	}
}
