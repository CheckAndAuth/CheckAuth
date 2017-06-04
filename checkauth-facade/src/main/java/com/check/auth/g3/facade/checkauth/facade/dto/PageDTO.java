package com.check.auth.g3.facade.checkauth.facade.dto;

import java.io.Serializable;
import java.util.List;

public class PageDTO<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 总记录数
	 */
	private long total;
	/**
	 * 页码
	 */
	private int pageNum;
	/**
	 * 每页条数
	 */
	private int pageSize;
	/**
	 * 当页第一条记录序号
	 */
	private int offset;
	/**
	 * 总页数
	 */
	private int pages;
	/**
	 * 结果集
	 */
	private List<T> pageList;
	/**
	 * @param total
	 * @param pageSize
	 */
	public PageDTO(long total, int pageNum, int pageSize) {
		super();
		this.total = total;
		this.pageSize = pageSize > -1 ? pageSize : 0;
		if (this.pageSize > 0) {
            this.pages = (int) (total / this.pageSize + ((total % this.pageSize == 0) ? 0 : 1));
        } else {
            this.pages = 0;
        }
		this.pageNum =pageNum>0?pageNum:1;
		this.offset = this.pageSize * (this.pageNum - 1);
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public List<T> getPageList() {
		return pageList;
	}
	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}
	
}
