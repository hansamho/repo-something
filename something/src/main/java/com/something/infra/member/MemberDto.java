package com.something.infra.member;

import java.util.Date;

public class MemberDto {
	
	private String ifmmSeq;
	private String ifmmName;
	private String ifmmId;
	private String ifmmPwd;
	private String ifmmMobile;
	private String ifmmDob;
	private Integer ifmmGenderCd;
	private Integer ifmmMbtiCd;
	private Integer ifmmLikeCount;
	private Date regDate;
	private Date modDate;
	private Integer delNy;
	public String getIfmmSeq() {
		return ifmmSeq;
	}
	public void setIfmmSeq(String ifmmSeq) {
		this.ifmmSeq = ifmmSeq;
	}
	public String getIfmmName() {
		return ifmmName;
	}
	public void setIfmmName(String ifmmName) {
		this.ifmmName = ifmmName;
	}
	public String getIfmmId() {
		return ifmmId;
	}
	public void setIfmmId(String ifmmId) {
		this.ifmmId = ifmmId;
	}
	public String getIfmmPwd() {
		return ifmmPwd;
	}
	public void setIfmmPwd(String ifmmPwd) {
		this.ifmmPwd = ifmmPwd;
	}
	public String getIfmmMobile() {
		return ifmmMobile;
	}
	public void setIfmmMobile(String ifmmMobile) {
		this.ifmmMobile = ifmmMobile;
	}
	public String getIfmmDob() {
		return ifmmDob;
	}
	public void setIfmmDob(String ifmmDob) {
		this.ifmmDob = ifmmDob;
	}
	public Integer getIfmmGenderCd() {
		return ifmmGenderCd;
	}
	public void setIfmmGenderCd(Integer ifmmGenderCd) {
		this.ifmmGenderCd = ifmmGenderCd;
	}
	public Integer getIfmmMbtiCd() {
		return ifmmMbtiCd;
	}
	public void setIfmmMbtiCd(Integer ifmmMbtiCd) {
		this.ifmmMbtiCd = ifmmMbtiCd;
	}
	public Integer getIfmmLikeCount() {
		return ifmmLikeCount;
	}
	public void setIfmmLikeCount(Integer ifmmLikeCount) {
		this.ifmmLikeCount = ifmmLikeCount;
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
