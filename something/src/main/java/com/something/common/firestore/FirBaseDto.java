package com.something.common.firestore;

import java.util.Date;

public class FirBaseDto {
	
	private String mtctmText;
	private String mtctSeq;
	private Integer delNy;
	private Date regDate;
	private Date modDate;
	public String getMtctmText() {
		return mtctmText;
	}
	public void setMtctmText(String mtctmText) {
		this.mtctmText = mtctmText;
	}
	public String getMtctSeq() {
		return mtctSeq;
	}
	public void setMtctSeq(String mtctSeq) {
		this.mtctSeq = mtctSeq;
	}
	public Integer getDelNy() {
		return delNy;
	}
	public void setDelNy(Integer delNy) {
		this.delNy = delNy;
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
	
}
