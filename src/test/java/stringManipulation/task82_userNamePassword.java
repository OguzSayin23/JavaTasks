package test.java.stringManipulation;

import java.util.Scanner;

public class task82_userNamePassword {
    //•Login Functionality Logic
    //•UserName,Password
    //•--- > Program will ask to enter username and password
    //•--- > If both username and password are blank
    //•"UserName and Password Fields cannot be empty"
    //•--- > If userName is blank and password is not blank
    //•"UserName cannot be empty"
    //•--- > If userName is not blank and password is blank
    //•"Password cannot be empty"
    //•--- > If the username or password is not valid
    //•"UserName or password is not valid. Please verify"
    //•--- > If the username and password are both valid
    //•"User Logged in successfully"

    public static void main(String[] args) {

        String username = "oguzsayin";
        String password = "qazwsxedc";

       // System.out.println(username.substring(3,4));

        login(username,password);
    }

    public static void login(String username, String password){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username:");
        String inputUsername = sc.nextLine();
        System.out.print("Enter password:");
        String inputPassword = sc.nextLine();

        if (inputUsername.isEmpty()&&inputPassword.isEmpty()) {
            System.out.println("UserName and Password Fields cannot be empty");
        }else if(inputUsername.isEmpty()&&inputPassword.length()>0){
            System.out.println("UserName cannot be empty");
        }else if(inputUsername.length()>0&&inputPassword.isEmpty()){
            System.out.println("Password cannot be empty");
        }else if(!inputUsername.equals(username)||!inputPassword.equals(password)){
            System.out.println("UserName or password is not valid. Please verify");
        }else if(inputUsername.equals(username)||inputPassword.equals(password)){
            System.out.println("UUser Logged in successfully");
        }
    }

}
