package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter 'view' if you want to view a membersFile or 'edit' to see edit options." );

        Scanner firstLayerScanner = new Scanner(System.in);
        String firstLayer = firstLayerScanner.nextLine();
        if (firstLayer.equals("view"))
        {
            System.out.println("View option is under construction.");

        }
        else if ( firstLayer.equals("edit"))
        {
            System.out.println("Welcome to edit options ");
            System.out.println("\n Enter 'add' or 'delete' or 'query' or 'save'.");

            Scanner secondLayerScanner = new Scanner(System.in);
            String secondLayer = secondLayerScanner.nextLine();

            if (secondLayer.equals("add"))
            {
                System.out.println("Enter 'y' if you want to add a member record or 'n' to cancel." );
                //get input y/n from user if y, output membersfile else cancel.
                Scanner firstInputScanner = new Scanner(System.in);
                String firstInput = firstInputScanner.nextLine();
                System.out.println(firstInput);

                if (firstInput.equals("y"))
                {
                    //add name James Bloggs; birthday 20/12/1978; pass Gold; mobile 0411111111; fee $60
                    System.out.println("Input member details in following format: 'Name', 'Birthdate', 'Membership type', 'Contact number', 'Membership fee'");
                    Scanner secondInputScanner = new Scanner(System.in);
                    String secondInput = secondInputScanner.nextLine();

                    try {
                        BufferedWriter writer = new BufferedWriter(new FileWriter("membersFile.txt"));
                        writer.write("\n" + secondInput);
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else
                {
                    System.out.println("Proceeding has been cancelled.");
                }

            }

            else if(secondLayer.equals("delete"))
            {
                System.out.println("Delete feature is under construction.");
            }

            else if(secondLayer.equals("query"))
            {
                System.out.println("Query feature is under construction.");
            }


            else if(secondLayer.equals("save"))
            {
                System.out.println("Save feature is under construction.");
            }

            else
            {
                System.out.println("Invalid input.");
            }
        }

        else
        {
            System.out.println(" Invalid input, only 'view' or 'edit' is accepted.");
        }









    }
}
