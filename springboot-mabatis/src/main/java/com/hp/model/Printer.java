package com.hp.model;

import java.io.Serializable;

/**
 * @author ck
 * @date 2018年5月22日 下午3:31:29
 */
public class Printer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String model;
	private String sn;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public Printer(String model, String sn) {
		super();
		this.model = model;
		this.sn = sn;
	}
	@Override
	public String toString() {
		return "Printer [model=" + model + ", sn=" + sn + "]";
	}
	
	
}
