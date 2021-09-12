package model;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) throws IOException  {
		 
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Informe uma temperatura ");
        int temperatura = scanner.nextInt();
        System.out.println("Atual tem valor " + temperatura);
        scanner.close();
        
        int quente = 40;
        int frio = 10;
        
        if(temperatura >= quente)
        	System.out.println("Está quente");
        else if(temperatura <= frio)
        	System.out.println("Está frio");
        else
        	System.out.println("Normal");
     
    }

}
