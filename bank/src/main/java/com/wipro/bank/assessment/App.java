package com.wipro.bank.assessment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		Account acc = null;
		Iterator<Account> iterator = accounts.iterator();
		while(iterator.hasNext())
		{	
			acc = iterator.next();
			if(acc.getAccountID() == id)
			{
				return acc;
			}
			else
				acc=null;
			
		}return acc;
			
			
	}
	
	public List<Account> getAccountDetailsByBalance(double amount)
	{
		/*for(Account acc:accounts)
			if(acc!=null)
				if(acc.getBalance()==amount)*/
		List<Account> acc = new ArrayList<Account>();
		for(Account a:App.accounts)
		{
			if(a!=null)
			{
				if(a.getBalance()>=amount)
			    {
				 acc.add(a);
			    }
			}
		 }
		if(acc.size()==0)
			acc=null;
		return acc;
	}
	
	public static void main(String args[]){
		App a = new App();
		System.out.println(accounts);
		App.accounts.add(new Account (1,"acc1",101.11));		
		App.accounts.add(new Account (3,"acc3",303.33));
		App.accounts.add(new Account (4,"acc4",404.43));
		App.accounts.add(new Account (5,"acc5",505.55));	
		if(accounts.contains(a.getAccountDetailsByBalance(900.00)))
			System.out.println("True");
		else
		 System.out.println("False");
     	}
}
	
  