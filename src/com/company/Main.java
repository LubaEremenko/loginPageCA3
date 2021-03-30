package com.company;

public class Main {

    public static void main(String[] args) {
	// create an instance of ID and passwords class
        IDandPasswords idandPasswords = new IDandPasswords();

        //create an instance of login page
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());  // set login info as argument, it will return hash map



    }
}
