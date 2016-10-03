package com.invoices20maven.easp.serviceAPI;

import java.sql.Connection;

import com.invoices20maven.easp.exceptions.EASPException;

public interface EASPLoginService {

	public Connection connect(String username, String password) throws EASPException;
	
	public EASPException handleServerError();

	public void closeConnection(Connection dbConnection) throws EASPException;
	
}
