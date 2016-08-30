package com.ztesoft.bsn.dubbo.recharge.entity;

/**
 * 
 * @ClassName: RechargeRequestDto 
 * @Description: 充值请求参数 
 * @author lindong
 * @date 2016年8月30日 上午9:06:27 
 *
 */
public class RechargeRequestDto {
	
	private String accNbr;
	
	private long amount;
	
	private String rechargeDate;

	public String getAccNbr() {
		return accNbr;
	}

	public void setAccNbr(String accNbr) {
		this.accNbr = accNbr;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public String getRechargeDate() {
		return rechargeDate;
	}

	public void setRechargeDate(String rechargeDate) {
		this.rechargeDate = rechargeDate;
	}
	
	
}
