package com.invoices20maven.easp.serviceAPI;

import java.sql.ResultSet;

import com.invoices20maven.easp.model.EASPCustomer;
import com.invoices20maven.easp.model.EASPInvoice;

public interface EASPResultConverterService {

	public EASPCustomer[] convertToCustomers(ResultSet r);
	
	public EASPInvoice[] convertToInvoices(ResultSet r);
	
}
