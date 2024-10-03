package pantawid;

import java.sql.pantawid;
import java.util.Scanner;


public class Pantawid {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String response;
        do{
        System.out.println("1. ADD");
        System.out.println("2. VIEW");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        
        System.out.print("Enter Action: ");
        int action =  sc.nextInt();
        pantawid pantawid = new pantawid(); 
        switch(action){
            case 1:
               
            Pantawid.addPantawid();
            break;
            
            case 2:
             Pantawid.addPantawid();
            break;
        }
            System.out.println("Do1 you want to continue? (yes/no): ");
            response = sc.next();  
        }while(response.equalsIgnoreCase("yes"));
        System.out.println("Thank you!"); 
    }

    private static void addPantawid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void addemployee(){
        Scanner sc = new Scanner(System.in);
        config conf = new config();
        System.out.print(" First Name: ");
        String fname = sc.next();
        System.out.print(" Last Name: ");
        String lname = sc.next();
        System.out.print("Benificiary address: ");
        String email = sc.next();
        System.out.print("Benificiary email: ");
        String status = sc.next();

        String sql = "INSERT INTO tbl_Benificiary (b_fname,b_lname, b_address,b_email) VALUES (?, ?, ?, ?)";


        conf.addRecord(sql, fname, lname,address, email, status);


    }
    
    private void viewemployee() {
        config conf = new config();
        String votersQuery = "SELECT * FROM tbl_Beneficiary"; 
        String[] votersHeaders = {"Beneficiary ID", "First Name", "Last Name","address", "Email",};
        String[] votersColumns = {"b_id", "b_fname", "b_lname","b_address, "b_email"};

        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
    
}