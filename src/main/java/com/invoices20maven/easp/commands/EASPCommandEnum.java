package com.invoices20maven.easp.commands;

public enum EASPCommandEnum {

	DEFAULT (""),
	EXIT ("exit"),
	SHOW_CUSTOMERS ("show_customers"),
	CREATE_CUSTOMER ("create_customer"),
	CREATE_INVOICE ("create_invoice");
	
	private final String type;
	
	private EASPCommandEnum(String type){
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
	
}
