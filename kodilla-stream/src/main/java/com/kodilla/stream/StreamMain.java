package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain
{
    public static void main(String[] args)
    {
        Forum forum = new Forum();

        int now = LocalDate.now().getYear();

        Map<Integer, ForumUser> theResultMapOfFilteredForumUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getUserSex() == 'M')
                .filter(forumUser -> forumUser.getUserDateOfBirth().getYear() <= now - 20)
                .filter(forumUser -> forumUser.getUserPostsCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, ForumUser -> ForumUser));

        System.out.println("# Users: " + theResultMapOfFilteredForumUsers.size());
        theResultMapOfFilteredForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}