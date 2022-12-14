// Java program to demonstrate working of SimpleDateFormat

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class date {
    public static void main(String args[])
            throws ParseException
    {
        // Formatting as per given pattern in the argument
        SimpleDateFormat ft
                = new SimpleDateFormat("dd-MM-yyyy");
        String str = ft.format(new Date());   //gives the date of today
        Date str1 = ft.parse(str);
        System.out.println("Formatted Date : " + str1);

        // parsing a given String
        str = "09/05/1998";
        ft = new SimpleDateFormat("MM/dd/yyyy");
        Date date = ft.parse(str);

        // this will print the date as per parsed string
        System.out.println("Parsed Date : " + date);
    }
}
