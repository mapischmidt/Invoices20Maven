package com.invoices20maven.easp.service;

import java.sql.SQLException;

import com.invoices20maven.easp.commands.EASPCommand;
import com.invoices20maven.easp.commands.EASPCommandEnum;
import com.invoices20maven.easp.exceptions.EASPException;
import com.invoices20maven.easp.exceptions.EASPExceptionEnum;
import com.invoices20maven.easp.facadeAPI.EASPFacade;
import com.invoices20maven.easp.serviceAPI.EASPCommandService;

public class EASPCommandServiceImpl implements EASPCommandService {

	private EASPFacade facade;

	public EASPCommandServiceImpl(EASPFacade facade) {
		this.facade = facade;
	}

	@Override
	public EASPCommand createCommand(String input) {
		EASPCommand result = null;
		switch (input) {
		case "exit":
			result = new EASPCommand(EASPCommandEnum.EXIT);
			break;
		case "create_customer":
			result = new EASPCommand(EASPCommandEnum.CREATE_CUSTOMER);
			break;
		default:
			result = new EASPCommand(EASPCommandEnum.DEFAULT);
			break;
		}
		return result;
	}

	@Override
	public void executeCommand(EASPCommand command) throws EASPException, SQLException {
		if (command.getType().equals(EASPCommandEnum.EXIT)) {
			facade.closeUI();
		} else if (command.getType().equals(EASPCommandEnum.CREATE_CUSTOMER)) {
			facade.createNewCustomer();
		} else /* unknown command */ {
			throw new EASPException(EASPExceptionEnum.E005, new NullPointerException(), command.getType().toString());
		}
	}

}
