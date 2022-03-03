package com.company;

public class AccountExampleTest {
    public static AccountExample accountExample;
    public static final String[] validAccount = new String[] {"123456","#145554","_456654asd"};

    public static void main(String[] args) {
	// write your code here

        accountExample = new AccountExample();
        for (String account:validAccount
             ) {
            boolean isValid = accountExample.validate(account);
            if (isValid == true){
                System.out.println("Account '" + account + '\'' + "Hợp lệ!");
            } else {
                System.out.println("Account '" + account + '\'' + "Không hợp lệ");
            }
        }
    }
}
