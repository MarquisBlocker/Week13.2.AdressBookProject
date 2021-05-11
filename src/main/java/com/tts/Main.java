package com.tts;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String firstName;
        String lastName;
        String phoneNumber;
        String emailAddress;

        ArrayList<AddressBook> addresslist = new ArrayList<AddressBook>();

        Scanner input = new Scanner(System.in);
        int option = 0;

        while (option != 6) {
            System.out.println("1) Add an Entry\n");
            System.out.println("2) Remove an Entry\n");
            System.out.println("3) Search for Entry\n");
            System.out.println("4) Print Address Book\n");
            System.out.println("5) Delete Book\n");
            System.out.println("6) Quit\n");
            System.out.println("Please Choose What you'd like to do");

            option = input.nextInt();

            if (option == 1) {
                Scanner inputAdd = new Scanner(System.in);
                System.out.println("First Name: ");
                firstName = inputAdd.nextLine();

                System.out.println("Last Name: ");
                lastName = inputAdd.nextLine();

                System.out.println("Phone Number: ");
                phoneNumber = inputAdd.nextLine();

                System.out.println("Email Address");
                emailAddress = inputAdd.nextLine();

                int valid = emailAddress.indexOf("@");
                int valid2 = emailAddress.indexOf(".");

                if (valid == -1 || valid2 == -1) {
                    System.out.println("You have entered an invalid email address!");
                } else {
                    System.out.println(firstName);
                    System.out.println(lastName);
                    System.out.println(phoneNumber);
                    System.out.println(emailAddress);
                    addresslist.add(new AddressBook(firstName, lastName, phoneNumber, emailAddress));
                }
            }

            if (option == 2) {
                String email;
                Scanner inputRemove = new Scanner(System.in);
                System.out.println("Enter an entry's email to remove: ");
                email = inputRemove.next();

                int valid = email.indexOf("@");
                int valid2 = email.indexOf(".");

                if (valid == -1 || valid2 == -1) {
                    System.out.println("You have entered an invalid email address!");
                } else {
                    AddressBook addressToBeRemoved = null;

                    for (AddressBook address : addresslist) {
                        if (address.getEMAILADDRESS().equalsIgnoreCase(email))
                            addressToBeRemoved = address;
                        System.out.println(addresslist.toString());
                    }
                    if (addressToBeRemoved != null) {
                        addresslist.remove(addressToBeRemoved);
                        System.out.println("Address deleted successfully\n");
                    } else
                        System.out.println("ERROR! Address not found!\n");
                }
            }

            if (option == 3) {
                System.out.println("1) First Name: ");
                System.out.println("2) Last Name: ");
                System.out.println("3) Phone Number: ");
                System.out.println("4) Email Address\n");

                System.out.println("Choose a search type: ");
                int type = input.nextInt();

                System.out.println("Enter your search");
                String search = input.next();

                for (AddressBook address : addresslist) {
                    if (type == 1) {
                        if (address.getFIRSTNAME().equalsIgnoreCase(search))
                            System.out.println(addresslist.toString());
                    } else if (type == 2) {
                        if (address.getLASTNAME().equalsIgnoreCase(search))
                            System.out.println(addresslist.toString());
                    } else if (type == 3) {
                        if (address.getPHONENUMBER().equalsIgnoreCase(search))
                            System.out.println(addresslist.toString());
                    } else if (type == 4) {
                        if (address.getEMAILADDRESS().equalsIgnoreCase(search))
                            System.out.println(addresslist.toString());
                    } else
                        System.out.println("ERROR! Address not found!\n");
                }
            }

            if (option == 4) {
                System.out.println("Address list:");
                for (AddressBook address : addresslist) {
                    System.out.println(address.toString());
                }
            }

            if (option == 5) {
                addresslist.clear();
                System.out.println("Address deleted successfully\n");
            }

        }
    }
}
