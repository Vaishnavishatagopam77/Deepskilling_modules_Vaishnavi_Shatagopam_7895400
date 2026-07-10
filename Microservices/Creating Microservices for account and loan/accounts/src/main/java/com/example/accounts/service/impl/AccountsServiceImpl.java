package com.example.accounts.service.impl;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accounts.dto.CustomerDto;
import com.example.accounts.entity.Accounts;
import com.example.accounts.entity.Customer;
import com.example.accounts.repository.AccountsRepository;
import com.example.accounts.repository.CustomerRepository;
import com.example.accounts.service.IAccountsService;

@Service
public class AccountsServiceImpl implements IAccountsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

        Customer customer = new Customer();
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setMobileNumber(customerDto.getMobileNumber());

        Customer savedCustomer = customerRepository.save(customer);

        Accounts account = new Accounts();
        account.setCustomerId(savedCustomer.getCustomerId());
        account.setAccountNumber(generateAccountNumber());
        account.setAccountType("Savings");
        account.setBranchAddress("Hyderabad");

        accountsRepository.save(account);
    }

    @Override
    public CustomerDto fetchAccount(String mobileNumber) {
        return new CustomerDto();
    }

    @Override
    public boolean updateAccount(CustomerDto customerDto) {
        return true;
    }

    @Override
    public boolean deleteAccount(String mobileNumber) {
        return true;
    }

    private Long generateAccountNumber() {
        return 1000000000L + new Random().nextInt(900000000);
    }
}