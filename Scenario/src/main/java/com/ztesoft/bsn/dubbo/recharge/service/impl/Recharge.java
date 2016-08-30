package com.ztesoft.bsn.dubbo.recharge.service.impl;

import com.ztesoft.bsn.dubbo.entity.DubboResponse;
import com.ztesoft.bsn.dubbo.recharge.entity.RechargeRequestDto;
import com.ztesoft.bsn.dubbo.recharge.service.IRecharge;

public class Recharge implements IRecharge{

	@Override
	public DubboResponse recharge(RechargeRequestDto rechargeQequestDto) {
		DubboResponse resp = new DubboResponse();
		resp.setResultCode(0);
		resp.setResultDesc("充值成功");
//		resp.setJsonObject(jsonObject);;
		System.out.println(rechargeQequestDto.getAccNbr());
		System.out.println(rechargeQequestDto.getAmount());
		System.out.println(rechargeQequestDto.getRechargeDate());
		return resp;
	}

}
