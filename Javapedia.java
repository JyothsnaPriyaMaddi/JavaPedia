import java.util.Scanner;

import javax.lang.model.element.Name;

public class Javapedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many historical figures will you register?");
        int numberOfHistoricalFigures = sc.nextInt();
        
        sc.nextLine();
        String[][] database = new String[numberOfHistoricalFigures][3];

        for(int i = 0; i < database.length; i++) {
            switch(i) {
                case 0: System.out.println("Figure 1");break;
                case 1: System.out.println("Figure 2");break;
            }
            System.out.print("Name: ");
            database[i][0] = sc.nextLine();
            System.out.print("Date of birth: ");
            database[i][1] = sc.nextLine();
            System.out.print("Occupation: ");
            database[i][2] = sc.nextLine();
        }
        print2DArray(database);
        System.out.print("Who do you want information on?");
        String information = sc.nextLine();
        for(int i = 0; i < database.length; i++) {
            if(database[i][0].equals(information)) {
                System.out.println("\tName: "+database[i][0]);
                System.out.println("\tDate of birth: "+database[i][1]);
                System.out.println("\tOccupation: "+database[i][2]);
            }
        }
    }
    public static void print2DArray(String[][] database) {
        System.out.println("These are the values you stored: ");
        for(int i = 0; i < database.length; i++) {
            System.out.println("\t"+database[i][0]+" "+database[i][1]+" "+database[i][2]);
        }

    }
}