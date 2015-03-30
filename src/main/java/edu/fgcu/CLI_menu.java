package main.java.edu.fgcu;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.Console;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Created by geoffreykuhn on 3/10/15.
 */
public class CLI_menu {

   public static int menu(){

       System.out.println("How many times do you want to run this group of tests? \n\n");

      // Scanner reader = new Scanner(System.in);
       //Integer num_runs =reader.nextInt();
        int num_runs=2;
       // throw new RuntimeException("Menu exception");

       return num_runs;
    }

    public static int menu_subset(Class<Test_class> obj, int total_num_tests){

        System.out.println("What percentage of the test would you like to run? \n\n");

        Scanner reader = new Scanner(System.in);
        Integer perc_runs =reader.nextInt();

        return perc_runs;
    }


    public static void exit(){

        throw new RuntimeException("Menu exit exception");

    }


}
