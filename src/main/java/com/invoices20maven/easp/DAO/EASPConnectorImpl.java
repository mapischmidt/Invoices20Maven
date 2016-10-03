package com.invoices20maven.easp.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//import org.postgresql.util.PSQLException;

import com.invoices20maven.easp.DAOAPI.EASPConnector;
import com.invoices20maven.easp.exceptions.EASPExceptionEnum;
import com.invoices20maven.easp.exceptions.EASPException;

public class EASPConnectorImpl implements EASPConnector {
	
	@Override
	public Connection connect(String username, String password) throws EASPException {
		Properties connProps = new Properties();
		connProps.put("username", username);
		connProps.put("password", password);
		
		Connection connection = null;
		
		String driverPath = "jdbc:postgresql://localhost/EASP?useUnicode=yes&textEncoding=UTF-8";

		// Start connection
		try {
			connection = DriverManager.getConnection(driverPath, connProps);
		} catch (SQLException sqlException) {
			throw new EASPException(EASPExceptionEnum.E001, sqlException, driverPath, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

        @Override
	public void closeConnection(Connection dbConnection) throws EASPException {
		try {
			dbConnection.close();
		} catch (NullPointerException nullPointerException) {
			throw new EASPException(EASPExceptionEnum.E002, nullPointerException);
		} catch (SQLException sqlException) {
			throw new EASPException(EASPExceptionEnum.E003, sqlException);
		}
	}
	
}
