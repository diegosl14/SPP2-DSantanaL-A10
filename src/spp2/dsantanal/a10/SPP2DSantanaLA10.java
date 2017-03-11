/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.dsantanal.a10;
import java.util.Scanner;
/**
 *
 * @author diego
 * l
 */
public class SPP2DSantanaLA10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] a, b; 
        int tamaño=pedirTamaño();
        
        //Crear matrices
        a=Matriz("A", tamaño);
        b=Matriz("B", tamaño);
        
        //Suma de matrices 
        restaMatrices (a,b);
        multiMatrices (a,b);
        } 
    public static int pedirTamaño(){
        Scanner sc=new Scanner(System.in);
        boolean flag;
        int a=0;
        do{
            try{
                System.out.println("Ingrse el tamaño del arreglo ");
                a=sc.nextInt();
                flag=false;
            }
            catch (Exception e){
                System.out.println("Ingrese de nuevo el tamaño del arreglo ");
                sc.next();
                flag=true;
            }
        } 
        while (flag);
        return a;
    }
    public static int pedirEntero(){
       Scanner sc=new Scanner(System.in);
       boolean flag;
       int a=0;
       do{
           try{
               System.out.println("Escriba un entero ");
               a=sc.nextInt();
               flag=false;
           }
           catch (Exception e){
               System.out.println("ERROR");
               a=sc.nextInt();
               flag=true;
           }
       }
       while (flag);
       return a;
    }
    public static int[][] Matriz (String a, int t){
        int[][] Matriz= new int[t][t];
        System.out.println("Arreglo"+a);
        for (int i=0; i<Matriz.length; i++){
            for (int j=0; j<Matriz.length; j++){
              Matriz [i][j]=pedirEntero();  
            }
                }
        return Matriz;   
    }
    public static int[][] restaMatrices(int[][] a, int[][] b){
        int[][] r= new int[a.length][a.length];
        System.out.println("Suma");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                r[i][j]=a[i][j]-b[i][j];
                System.out.println("La suma de matrices es ["+r[i][j]+"]");
            }
        }
            return r;
    }
    public static int[][] multiMatrices(int[][] a, int[][]b){
        int[][] r= new int[a.length][a.length];
        System.out.println("Multiplicación");
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a.length; j++){
                for (int x=0; x<a.length; x++){
                    r[i][j]=(a[i][x]*b[x][j]);
                System.out.println("La multiplicación de matrices es ["+r[i][j]+"]");
            }    
        }
    }
        return r;
   }
}