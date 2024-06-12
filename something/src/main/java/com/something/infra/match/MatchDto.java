package com.something.infra.match;

import java.util.Date;

public class MatchDto {
	
	private String matcSeq;
	private String matcRoomName;
	private String matcLocal;
	private Date regDate;
	private Date modDate; 
	private Integer delNy;
	
	public String getMatcSeq() {
		return matcSeq;
	}
	public void setMatcSeq(String matcSeq) {
		this.matcSeq = matcSeq;
	}
	public String getMatcRoomName() {
		return matcRoomName;
	}
	public void setMatcRoomName(String matcRoomName) {
		this.matcRoomName = matcRoomName;
	}
	public String getMatcLocal() {
		return matcLocal;
	}
	public void setMatcLocal(String matcLocal) {
		this.matcLocal = matcLocal;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getModDate() {
		return modDate;
	}
	public void setModDate(Date modDate) {
		this.modDate = modDate;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
	}
	
	
}
