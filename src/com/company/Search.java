package com.company;

import java.util.Arrays;

public class Search {
    public static void main (String[] args)
    {
        String name="Jeeet";
        char target='t';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(SearchChar(name,target));
    }
public static boolean SearchChar(String name,char target)
{
    for(char ch:name.toCharArray() )
    {
        if(ch==target)
        {
            return true;
        }
    }
    return false;
    }
}
