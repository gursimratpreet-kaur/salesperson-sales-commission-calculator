/*
Gursimratpreet Kaur
Student Number : 991845418
Assignment Number : 2
Date Assignment Completed : February 15th , 2026
 */

import java.util.Scanner;
import java.util.ArrayList;
import content.District;

public class App {
    public static void main(String[] args)  {
        /* Input for ID */
        
        Scanner k = new Scanner(System.in);
        System.out.print("Enter Salesperson's ID or -1 to end: ");
        int salesID = k.nextInt();

        int bananas = 0;
        int oranges = 0;
        int apples = 0; 
        int index = 0;
        ArrayList <String> personList = new ArrayList<String>();
        ArrayList <String> salesList = new ArrayList <String>();
        ArrayList <String> comList = new ArrayList <String>();

        if (salesID == -1){
            System.out.println("No data available.");
        }
        
        /*Only works if id is not -1 as -1 is entered to end. */
        while (salesID != -1){
            Scanner l = new Scanner(System.in);
            System.out.print("Enter Salesperson's Name: ");
            String salesperson = l.nextLine();

            /*Using enum for district */
            /* Using count for numbering and sub as index of array used to display values of districts. */
            District d [] = District.values();
            int count = 1;
            System.out.println("DISTRICT CHOICES:");
            for (int sub = 1 ; sub < d.length + 1 ; sub++){
                System.out.println( count + ". " + d[sub - 1]);
                count++;
            }

            System.out.print("Enter district: ");
            int district = l.nextInt();
            while (district < 1 || district > 4){
                System.out.print("Invalid Input! Enter district: ");
                district = l.nextInt();
            }

            System.out.print("Enter banana sales: ");
            bananas = l.nextInt();
            while (bananas < 0 || bananas > 5000){
                System.out.print("Invalid - Banana sales must be between 0 to $5000: ");
                bananas = l.nextInt();
            }
            System.out.print("Enter orange sales: ");
            oranges = l.nextInt();
            while (oranges < 0 || oranges > 5000){
                System.out.print("Invalid - Orange sales must be between 0 to $5000: ");
                oranges = l.nextInt();
            }
            System.out.print("Enter apple sales: ");
            apples = l.nextInt();
            while (apples < 0 || apples > 5000){
                System.out.print("Invalid - Apple sales must be between 0 to $5000: ");
                apples = l.nextInt();
            }

                
                /*Creating first comma separated string */
                String person = Integer.toString(salesID) +"," + salesperson + ","  + d[district-1];
                personList.add(index,person);
                    

                /*Creating second comma separated string */
                String sales = Integer.toString(salesID) + ", "+ Integer.toString(bananas)+ ","  +Integer.toString(oranges)  + ","+Integer.toString(apples);
                salesList.add(index,sales);



                /*Calculating commision */
                int bComm = 0;
                int oComm = 0;
                int aComm = 0;

                /*Commission for bananas */
                if (bananas > 0 && bananas <= 1000){
                    bComm = 20;
                }
                else if(bananas<=2000){
                    bComm = 30;
                }
                else if(bananas <= 3000){
                    bComm = 40;
                }
                else{
                    bComm = 50;
                }


                /*Commission for oranges */
                if (oranges > 0 && oranges <= 1000){
                    oComm = 30;
                }
                else if (oranges <= 2000){
                    oComm = 40;
                }
                else if(oranges <= 3000){
                    oComm = 50;
                }
                else{
                    oComm = 60;
                }


                /*Commission for apples */
                if (apples > 0 && apples <= 1000){
                    aComm = 40;
                }
                else if (apples <= 2000){
                    aComm = 50;
                }
                else if ( apples <= 3000){
                    aComm = 60;
                }
                else {
                    aComm = 70;
                }

                /*Creating third comma separated string */
                String Comm = Integer.toString(salesID) + "," + Integer.toString(bComm) + "," + Integer.toString(oComm) + "," + Integer.toString(aComm);
                comList.add(index,Comm);

                System.out.print("Enter salesid or -1 to end: ");
                salesID = k.nextInt();
                index++;
                /*Index variable is used to keep track of the number of values added. */
               
            
                
                if (salesID == -1){
                    System.out.printf("%-15s" , "Salesperson Table");
                    System.out.println();

                    System.out.printf("%-12s %-12s %-12s" , "ID" ,"Name" , "District");
                    System.out.println();

                    System.out.printf("%-12s %-12s %-12s" , "***" ,"*****" ,"********");
                    System.out.println();
                    for (String persons : personList){
                        String personArray [] = persons.split(",");
                        System.out.printf("%-12s %-12s %-12s", personArray[0], personArray[1] , personArray[2]);
                        System.out.println();
                    }

                    System.out.printf("%-15s" , "Sales Table");
                    System.out.println();

                    System.out.printf("%-12s %-12s %-12s %-12s" , "ID" ,"Bananas" , "Oranges" , "Apples");
                    System.out.println();

                    System.out.printf("%-12s %-12s %-12s %-12s" , "***" ,"*******" ,"******" ,"******");
                    System.out.println();
                    
                    for (String sale : salesList){
                        String salesArray [] = sale.split(",");
                        System.out.printf("%-12s %-12s %-12s %-12s" , salesArray[0] , salesArray[1] , salesArray[2], salesArray[3]);
                        System.out.println();
                    }

           
                
                    System.out.println();
                    System.out.printf("%-15s" , "Commission Table");
                    System.out.println();

                    System.out.printf("%-12s %-12s %-12s %-12s" , "ID" ,"Bananas" , "Oranges" , "Apples");
                    System.out.println();

                    System.out.printf("%-12s %-12s %-12s %-12s" , "***" ,"*******" ,"******" ,"******");
                    System.out.println();

                    for(String comms : comList){
                        String commArray [] = comms.split(",");
                        System.out.printf("%-12s %-12s %-12s %-12s" , commArray[0] , commArray[1] , commArray[2] , commArray[3]);
                        System.out.println();
                    }
                    l.close();
                }
            }
            k.close();   
            System.out.println("Student Name: Gursimratpreet Kaur");
            System.out.println("Student ID: 991845418"); 
        }
    }
