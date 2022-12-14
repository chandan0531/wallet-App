package com.masai.service;

import java.math.BigDecimal;
import java.util.List;

import com.masai.entities.BankAccount;
import com.masai.entities.Customer;
import com.masai.entities.Wallet;
import com.masai.exception.InvalidAccountException;

public interface WalletService {
	
	public Customer createAccount(Customer customer);
	
	public BigDecimal showBalance(String mobileno) throws InvalidAccountException;
	
	//public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount);
	
	//public Customer depositAmount(String mobileno, BigDecimal amount);
	
	
	//public Customer updateAccount(Customer customer);
	
	public Customer addMoney(Wallet wallet,double amount);
	
	public List<BankAccount> bankAccountByWalletId(Integer walletId);
	

}
