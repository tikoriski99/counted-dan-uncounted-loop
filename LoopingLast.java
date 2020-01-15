/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping.last;

/**
 *
 * @author HP
 */
public class LoopingLast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    System.out.println("=== counted loop for ===");
        for(int x = 1; x<8; x++){
            System.out.println("#####");
            
        System.out.println("=== counted loop for ke 2 ===");    
        for(int y = 4; y < 10; y++){
            System.out.println("ke"+y);
            
            
        System.out.println(" ===counted loop for ke 3 ===");
        for (int z = 2; z<=20; z+=3){
            System.out.println(z); // z+=3 (nilai z akan ditambah tiga (+3) di setiap pengulangan)
            
            
        System.out.println(" ===counted loop for each ===");
        int angka []={12,13,14,27};
        
        for ( int k : angka){
        System.out.println(k);  
       
        System.out.println(" ===uncounted loop while ===");
        int d = 0;
        while (d <= 10){
            System.out.println("Perulangan ke" + d); d++;
            
            
        System.out.println(" ===uncounted do while ===");
        int b = 4;
        do {
            System.out.println("Perulangan ke-" + b); b++;  
        } while (b <=10);
        }
        }
        }
        }
            
        }
    }
    }
    

