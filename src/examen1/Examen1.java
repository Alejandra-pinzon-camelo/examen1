package examen1;
import javax.swing.JOptionPane;
public class Examen1 {
    public static void main(String[] args) {
        int n= Integer.parseInt(JOptionPane.showInputDialog("digite el limite de datos"));
        int[] numero=new int[n];
        
        for (int i = 0; i < n; i++) { 
            numero [i]= Integer.parseInt(JOptionPane.showInputDialog("digite un numero "));
            if(numero[i]>255){
            numero [i]= Integer.parseInt(JOptionPane.showInputDialog("numero invalido digite otro numero "));
              System.out.print(numero [i]+" ");
               }else
             System.out.print(numero [i]+" ");
                }
        System.out.println(" ");
        int p= Integer.parseInt(JOptionPane.showInputDialog("digite el porcentaje "));
        System.out.print(p);
         System.out.println(" ");
        for (int i = 0; i < numero.length; i++) {  
            if (numero[i]==255){
                 System.out.print(numero[i]+" ");
            }else {
                int porcentaje=numero[i]*p/100;
                int suma=numero[i]+porcentaje;
                System.out.print(suma+" ");
            }
        }
    }
    
}
