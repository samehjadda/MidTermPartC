
import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sameh
 */
class TestUserprofile{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your genre: ");
        String gen = scan.nextLine();
        
        UserProfile user = new UserProfile(name, gen);
        
        System.out.println("Your profile is created");
        
    }
}
