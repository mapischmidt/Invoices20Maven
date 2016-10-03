package com.invoices20maven.easp.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.invoices20maven.easp.DAOAPI.EASPExecutionUnit;
import com.invoices20maven.easp.exceptions.EASPException;
import com.invoices20maven.easp.exceptions.EASPExceptionEnum;
import com.invoices20maven.easp.statements.EASPStatement;

public class EASPExecutionUnitImpl implements EASPExecutionUnit {

	@Override
	public ResultSet executeQuery(Statement statement, EASPStatement easpStatement) throws SQLException {
		ResultSet result = null;
		result = statement.executeQuery(easpStatement.getType().getStatement());
		statement.close();
		return result;
	}

	@Override
	public void executeUpdate(PreparedStatement statement) throws EASPException {
		try {
			statement.execute();
			statement.close();
		} catch (SQLException e) {
			throw new EASPException(EASPExceptionEnum.E003, e);
		}
	}

}
