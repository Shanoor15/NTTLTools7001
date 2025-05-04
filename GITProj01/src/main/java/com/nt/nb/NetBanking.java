package com.nt.nb;

public class NetBanking {

	//perform NetBanking Process
	public String transferMoney(long srcAcount,long destAcount,String ifscCode,double amount)
	{
		return "@"+amount+" amount is transfering from "+srcAcount+" to "+destAcount;
	}
}
