package com.example.user;

import java.io.FileWriter;
import java.util.*;

public class UserOperations {
    Scanner sc = new Scanner(System.in);
    String filename;
    List<UserClass> users = new ArrayList<>();

    public UserOperations(List<UserClass> user) {
        this.users = user;
    }


    public  void checkFileFormatOperation(){
//        File file = new File(filename);
//        if(file.exists())
//        {
//            System.out.println("File Exist and File Extension is : "+ FilenameUtils.getExtension(filename));
//        }
//        else{
//                System.out.println("File does not exist");
//        }
    }


    public void searchUserCodeOperation(){
        System.out.println("Enter the user code");
        String userCode = sc.next();
        for (UserClass user : users) {
            if (userCode.equals(user.getUsercode())) {
                System.out.println(user.toString());
            }
        }
    }


    public void sortByAlphabeticOrder() {
        Collections.sort(users);
        System.out.println("After sorting : ");
        System.out.println(users);
    }

    public void searchMaxJobCompletion(){
        int maxjob = 0;
        for (UserClass u3 : users) {
            if (u3.getJobs_completed()>maxjob){
                maxjob = u3.getJobs_completed();
                System.out.println(maxjob);
                System.out.println(u3.toString());
            }
        }
    }

    public void createFileConsistRemoteJobs(){
        try{
            System.out.println("Enter Preferred Location : ");
            String location = sc.next();
            FileWriter writer = new FileWriter("E:\\1.Practice\\demo\\sample.csv");
            for (UserClass u2 : users) {
                if (location.equals(u2.getPreffered_location())) {
                    System.out.println(u2.toString());
                    writer.append(u2.getUsercode());
                    writer.append(",");
                    writer.append(u2.getName());
                    writer.append(",");
                    writer.append(Integer.toString(u2.getJobs_completed()));
                    writer.append(",");
                    writer.append(u2.getPreffered_location());
                    writer.append(",");
                    writer.append(Boolean.toString(u2.isInactive()));
                    writer.append("\n");
                }
            }

            writer.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
