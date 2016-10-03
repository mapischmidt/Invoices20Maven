package com.invoices20maven.easp.serviceAPI;

import java.sql.SQLException;

import com.invoices20maven.easp.commands.EASPCommand;
import com.invoices20maven.easp.exceptions.EASPException;

public interface EASPCommandService {

	public EASPCommand createCommand(String input);
	
	public void executeCommand(EASPCommand command) throws EASPException, SQLException;
	
}
