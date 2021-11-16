package com.example.user;

import java.util.List;
import java.util.Scanner;

public class UserApplication {

    public void mainOperation(){
        System.out.println("Enter the file : ");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();

        DataReadClass uo = new DataReadClass(filename);
        List<UserClass> u1 = uo.userop();

        UserOperations userOperations = new UserOperations(u1);
        // checks the input file format.
        userOperations.checkFileFormatOperation();
        int choice;

        do {
            System.out.println("----------------------------------------");
            System.out.println("1.Search the user record based on the UserCode.");
            System.out.println("2.Search the record of who has completed maximum jobs.");
            System.out.println("3.Print records in alphabetic order by name.");
            System.out.println("4.Write the records in a diff file which prefers a remote job.");
            System.out.println("5.Send email to support@gigvistas.com if there is an inactive member.");
            System.out.println("6.Exiting from the process.");
            System.out.println("----------------------------------------");
            System.out.println("Enter your choice: ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1.Search the user record based on the UserCode.");
                    userOperations.searchUserCodeOperation();
                    break;

                case 2:
                    System.out.println("2.Search the record of who has completed maximum jobs.");
                    userOperations.searchMaxJobCompletion();
                    break;

                case 3:
                    System.out.println("3.Print records in alphabetic order by name.");
                    userOperations.sortByAlphabeticOrder();
                    break;

                case 4:
                    System.out.println("4.Write the records in a diff file which prefers a remote job.");
                    userOperations.createFileConsistRemoteJobs();
                    break;

                case 5:
                    System.out.println("5.Send email to support@gigvistas.com if there is an inactive member.");
                    //userOperations.();
                    break;

                default:
                    System.out.println("Exiting from the process....");
                    break;
            }
        } while (choice != 6);
    }
}
