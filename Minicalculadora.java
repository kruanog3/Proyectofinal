import java.util.Scanner;

 public class Minicalculadora
 {
 public static void main( String[] args ){
 	Scanner leer = new Scanner (System.in);
         int valor1; 
 int valor2; 
 int resultado;
 int operaciones;
 int contador;
  int arreglo1[]=new int [5];
  char info1[]=new char [5];
   int arreglo2[]=new int [5];
  char info2[]=new char [5];
    int arreglo3[]=new int [5];
  char info3[]=new char [5];
    int arreglo4[]=new int [5];
  char info4[]=new char [5];
 	do {
        System.out.println("\n1. Suma de dos numeros");
 	System.out.println("2. Resta de dos numeros");
 	System.out.println("3. Multiplicacion de dos numeros");
 	System.out.println("4. Division de dos numeros");
 	System.out.println("5. Ver Bitácora");
 	System.out.println("6. Borrar Bitácora");
 	System.out.println("7. Salir");
 	System.out.println("Ingrese Opción");
        operaciones=leer.nextInt();
 	 switch (operaciones) {
        case 1:
          System.out.print("Ingrese el primer valor:");
          valor1=leer.nextInt();
          System.out.print("Ingrese el segundo valor:");
          valor2=leer.nextInt();
          resultado = valor1 + valor2;
          arreglo1[0]=valor1;
          info1[0]='+';
          info1[1]='=';
          arreglo1[1]=valor2;
          arreglo1[2]=resultado;
          System.out.println("El resultado es:"+resultado);
          break;

 	 	case 2:
 	 	  System.out.print("Ingrese el primer valor:");
          valor1=leer.nextInt();
          System.out.print("Ingrese el segundo valor:");
          valor2=leer.nextInt();
          resultado = valor1 - valor2;
          System.out.println("El resultado es:"+resultado);
          arreglo2[0]=valor1;
          info2[0]='-';
          info2[1]='=';
          arreglo2[1]=valor2;
          arreglo2[2]=resultado;
          break;

 	 	case 3:
 	 	  System.out.print("Ingrese el primer valor:");
          valor1=leer.nextInt();
          System.out.print("Ingrese el segundo valor:");
          valor2=leer.nextInt();
          resultado = valor1 * valor2;
          System.out.println("El resultado es:"+resultado);
            arreglo3[0]=valor1;
          info3[0]='*';
          info3[1]='=';
          arreglo3[1]=valor2;
          arreglo3[2]=resultado;
          break;

 	 	case 4:
 	 	  System.out.print("Ingrese el primer valor:");
          valor1=leer.nextInt();
          System.out.print("Ingrese el segundo valor:");
          valor2=leer.nextInt();
          resultado = valor1 / valor2;
          System.out.println("El resultado es:"+resultado);
            arreglo4[0]=valor1;
          info4[0]='/';
          info4[1]='=';
          arreglo4[1]=valor2;
          arreglo4[2]=resultado;
          break;
             case 5:
                 System.out.println ("Ver Bitácora:");
                 for (contador=0; contador<=2; contador++){
                     System.out.print (arreglo1[contador]);
                      System.out.print (info1[contador]);
                 }

                 System.out.println("\n");
           for (contador=0; contador<=2; contador++){
                   System.out.print (arreglo2[contador]);
                      System.out.print (info2[contador]);
           }
                       System.out.println("\n");
           for (contador=0; contador<=2; contador++){
                   System.out.print (arreglo3[contador]);
                      System.out.print (info3[contador]);
           }
                       System.out.println("\n");
           for (contador=0; contador<=2; contador++){
                   System.out.print (arreglo4[contador]);
                      System.out.print (info4[contador]);
           }
                 
                 break;
             case 6:
          arreglo1[0]=0;
          info1[0]=' ';
          info1[1]=' ';
          arreglo1[1]=0;
          arreglo1[2]=0;

          arreglo2[0]=0;
          info2[0]=' ';
          info2[1]=' ';
          arreglo2[1]=0;
          arreglo2[2]=0;

          arreglo3[0]=0;
          info3[0]=' ';
          info3[1]=' ';
          arreglo3[1]=0;
          arreglo3[2]=0;

          arreglo4[0]=0;
          info4[0]=' ';
          info4[1]=' ';
          arreglo4[1]=0;
          arreglo4[2]=0;
          break;
 	 	default:
 	 	   System.out.println("Gracias por utilizar Minicalculadora");
 	    }
        }
while (operaciones!=7);
 
 }

}
