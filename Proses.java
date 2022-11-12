package sesi6;

import java.util.Scanner;

public class Proses {
    public static void main(String[] args) {
        Laptop ideapad = new Lenovo();
        User andri = new User(ideapad);
        
        Scanner in = new Scanner(System.in);
        System.out.println("Menggunakan laptop");
        
        while(true){
            System.out.print("ON/OFF/UP/DOWN/OUT: ");
            String input = in.nextLine();
            if(input.equals("OUT")){
                System.out.println("laptop tidak digunakan");
                break;
            }
            gunakanLaptop(andri, input);
        }
        
    }
    
    public static void gunakanLaptop(User laptop, String input){
        if(input.equals("ON")){
            laptop.turnOnLaptop();
        }
        else if(input.equals("OFF")){
            laptop.turnOffLaptop();
        }
        else if(input.equals("UP")){
            laptop.makeLaptopLouder();
        }
        else if(input.equals("DOWN")){
            laptop.makeLaptopSilence();
        }
    }
}
