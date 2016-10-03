package com.invoices20maven.easp.service;

import java.sql.Connection;

import com.invoices20maven.easp.DAO.EASPConnectorImpl;
import com.invoices20maven.easp.exceptions.EASPException;
import com.invoices20maven.easp.exceptions.EASPExceptionEnum;
import com.invoices20maven.easp.serviceAPI.EASPLoginService;

public class EASPLoginServiceImpl implements EASPLoginService {
	
	EASPConnectorImpl connector;

	@Override
	public Connection connect(String username, String password) throws EASPException {
		connector = new EASPConnectorImpl();
		try {
			return connector.connect(username, password);
		} catch (EASPException easpException) {
			throw easpException;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public void closeConnection(Connection dbConnection) throws EASPException {
		try {
			connector.closeConnection(dbConnection);
		} catch (EASPException easpException) {
			throw easpException;
		} catch (NullPointerException nullPointerException) {
			throw new EASPException(EASPExceptionEnum.E002, nullPointerException);
		}
	}

	@Override
	public EASPException handleServerError() {
		// TODO Auto-generated method stub
		return null;
	}

}
