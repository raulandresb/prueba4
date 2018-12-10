
import java.util.Scanner;


public class MainEjercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      

        System.out.println("ingrese cuenta");
        int cuentaAhorro =entrada.nextInt();
        entrada.skip("\n");
        System.out.println("ingrese titular");
        String titular=(entrada.nextLine());
        System.out.println("ingrese saldo");
        int saldo = entrada.nextInt();
        System.out.println("ingrese interes anual");
        double interesAnual= entrada.nextDouble();
        System.out.println("ingrese deposito");
        int deposito =entrada.nextInt();
        saldo = saldo+deposito;
        System.out.println("ingrese giro");
        int giro =entrada.nextInt();
        saldo = (saldo)-(giro);
        if(saldo<0){
            System.out.println("Esta en numeros rojos");
        }else{
            System.out.println("La cuenta esta con saldo favorable");
        }
        System.out.println("El saldo es de: "+saldo);
        System.out.println("el interes ganado es de "+(saldo+(saldo*interesAnual)));
        System.out.println("Ingrese valor actual del dolar: ");
        double valorDolar = entrada.nextDouble();
        System.out.println("El dinero en dolares es"+(saldo/valorDolar));
        
        
        
       
    
        
        
       
        
    }
    
}
