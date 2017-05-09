package com.wipro.bank.assessment;

import java.util.*;
import com.wipro.bank.entity.*;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final List<Account> accounts = new ArrayList<Account>();
	
	public Account getAccountDetailsByID(int id)
	{
		for(Account acc:accounts)
			if(acc!=null)
				if(acc.getAccountID() == id)
					return acc;
		
		return null;
	}
	
	public List<Account> getAccountDetailsByBalance(double amount)
	{
		/*for(Account acc:accounts)
			if(acc!=null)
				if(acc.getBalance()==amount)*/
		Iterator<Account> iterator = accounts.iterator();
		while(iterator.hasNext())
		{
			Account a = iterator.next();
			if(a.getBalance()==amount)
			{
				return accounts;
			}
		}
			
		return null;
	}
	
  }
