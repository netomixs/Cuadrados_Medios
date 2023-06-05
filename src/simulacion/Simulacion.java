/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacion;

/**
 *
 * @author netom
 */
public class Simulacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int semilla=5735;
       for(int i=0;i<10;i++){
           int aux=semilla*semilla;
           String str=""+aux;
           char arr[]=new char[4];
          arr[3] =str.charAt(str.length()-3);
          arr[2] =str.charAt(str.length()-4);
          arr[1] =str.charAt(str.length()-5);
          arr[0] =str.charAt(str.length()-6);
          str=String.valueOf(arr);
          semilla=Integer.parseInt(str);
           System.out.println("0."+str);
       }
    }
    
}
