package com.nagybogi;

import java.util.ArrayList;

/**
 * Created by nagy on 2017.07.05..
 */
public class Child {
    public String name;
    public ArrayList<String> friends;

    public  String getName() {
        return name;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public void addFriend(String friend) {
        if(name.equals(friend)) {
            System.out.println("You can't write yourself ( " + name + " ) ");
        } else if(friends.contains(friend)) {
            System.out.println("You can't write somebody twice ( " + name + " )" );
        } else {
            friends.add(friend);
        }
    }

    public Child(String name){
        this.name = name;
        friends = new ArrayList<>();
    }

}
