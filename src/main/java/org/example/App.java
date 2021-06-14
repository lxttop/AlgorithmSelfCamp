package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        for( char cur : s) {
            System.out.println(cur);
        }
    }
}
