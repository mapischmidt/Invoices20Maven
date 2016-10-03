package com.invoices20maven.easp.facadeAPI;

import java.sql.SQLException;

import com.invoices20maven.easp.commands.EASPCommand;
import com.invoices20maven.easp.exceptions.EASPException;
import com.invoices20maven.easp.userInterfaceAPI.EASPUserInterface;

public interface EASPFacade {
	
	// ---------------------------------- DB ---------------------------------- //

	public void connectToDB(String username, String password);
	
	public void closeConnection();
	
	public void createNewCustomer() throws SQLException;
		
	// ------------------------------ UserInterface --------------------------- //
	
	public void startUI(EASPUserInterface ui);
	
	public void closeUI();
	
	public EASPCommand createCommand(String input);
	
	public void executeCommand(EASPCommand command);
			
	// -------------------------------- Exceptions ---------------------------- //
	
	public void handleEASPException(EASPException easpException);
	
}
