package com.nt.upi;

public class UPIPaymentOperation {

	//Perform the UPI Operations
	public String doPayment(long phoneNo,double amount,String upid)
	{
		//perform UPI Operationsss
		return amount+ " amount is @paid to this phone number  "+phoneNo;
	}
}
