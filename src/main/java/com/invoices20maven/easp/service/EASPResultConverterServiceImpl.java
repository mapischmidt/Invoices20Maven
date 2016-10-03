package com.invoices20maven.easp.service;

import java.sql.ResultSet;

import com.invoices20maven.easp.model.EASPCustomer;
import com.invoices20maven.easp.model.EASPInvoice;
import com.invoices20maven.easp.serviceAPI.EASPResultConverterService;

public class EASPResultConverterServiceImpl implements EASPResultConverterService {

	@Override
	public EASPCustomer[] convertToCustomers(ResultSet r) {
		EASPCustomer[] result = null;
		return result;
	}

	@Override
	public EASPInvoice[] convertToInvoices(ResultSet r) {
		// TODO Auto-generated method stub
		return null;
	}

}
