package com.ztesoft.bsn.dubbo.entity;

/**
 * dubbo返回基类
 * @author Administrator
 *
 */
public class DubboResponse {
	
	private int resultCode;
	
	private String resultDesc;
	
	private String jsonObject;

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public String getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(String jsonObject) {
		this.jsonObject = jsonObject;
	}
	
	
	
}
