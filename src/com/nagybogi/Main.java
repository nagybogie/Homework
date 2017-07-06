package com.nagybogi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main  {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Child> kinderGarten = new ArrayList<>();

    public static void main(String[] args) {

        boolean another = true;


        do {
            String reader = scanner.nextLine();
            if(reader.isEmpty()) {
                another = false;
            } else {
                ArrayList<String> myLine = new ArrayList<String>(Arrays.asList(reader.split(" ")));
                if(myLine.size() > 1) {
                    for (int item = 1; item < myLine.size(); item++) {
                        boolean found = false;
                        for (Child temp : kinderGarten) {
                            if (temp.getName().equals(myLine.get(item))) {
                                temp.addFriend(myLine.get(0));
                                found = true;
                            }
                        }
                        if (!found) {
                            Child temp = new Child(myLine.get(item));
                            temp.addFriend(myLine.get(0));
                            kinderGarten.add(temp);

                        }
                    }
                } else {
                    System.out.println("You didn't write any friends");
                }



            }


        } while (another);
        int most = 0;
        for (Child who : kinderGarten) {
            if(who.friends.size() > most) {
                most = who.friends.size();
            }

        }

        for (Child who : kinderGarten) {
             if(who.friends.size() == most) {
                 System.out.println(who.getName() + " with " + who.friends.size() + " friends is the most popular child in the kindergarten");
             }

        }

    }



}
