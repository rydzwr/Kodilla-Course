package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum
{
    private static final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum()
    {
        theUsersList.add(new ForumUser(1, "name1", 'M', LocalDate.of(2000,7,10), 10));
        theUsersList.add(new ForumUser(2, "name2", 'S', LocalDate.of(1997,9,18), 7));
        theUsersList.add(new ForumUser(3, "name3", 'M', LocalDate.of(1988,12,12), 2));
        theUsersList.add(new ForumUser(4, "name4", 'S', LocalDate.of(1975,4,2), 19));
        theUsersList.add(new ForumUser(5, "name5", 'M', LocalDate.of(1996,3,10), 41));
        theUsersList.add(new ForumUser(6, "name6", 'S', LocalDate.of(2001,8,18), 7));
        theUsersList.add(new ForumUser(7, "name7", 'M', LocalDate.of(2010,11,12), 1));
        theUsersList.add(new ForumUser(8, "name8", 'S', LocalDate.of(1991,7,2), 23));
        theUsersList.add(new ForumUser(9, "name9", 'M', LocalDate.of(2000,7,10), 10));
        theUsersList.add(new ForumUser(10, "name10", 'S', LocalDate.of(1994,8,17), 8));
        theUsersList.add(new ForumUser(11, "name11", 'M', LocalDate.of(1987,11,13), 3));
        theUsersList.add(new ForumUser(12, "name12", 'S', LocalDate.of(1974,5,3), 18));
        theUsersList.add(new ForumUser(13, "name13", 'M', LocalDate.of(1995,4,11), 31));
        theUsersList.add(new ForumUser(14, "name14", 'S', LocalDate.of(2002,9,19), 9));
        theUsersList.add(new ForumUser(15, "name15", 'M', LocalDate.of(2009,12,13), 4));
        theUsersList.add(new ForumUser(16, "name16", 'S', LocalDate.of(1990,8,3), 28));
    }

    public static List<ForumUser> getList()
    {
        return new ArrayList<>(theUsersList);
    }
}
