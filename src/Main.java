import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String prenda;
        double precio, precioFinal;
        double descuento=0;


        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese la prenda deseada: ");
        prenda= entrada.nextLine().toLowerCase();
        System.out.println("Ingrese el precio");
        precio=entrada.nextDouble();

        switch (prenda){
            case "pantalon":{
                descuento=30;
                break;
            }
            case "remera":{
                descuento=15;
                break;
            }
            case "zapatilla":{
                descuento=20;
                break;
            }
            default:{
                System.out.println("Opcion incorrecta");
            }

        }
        calcularPrecioFinal(prenda,precio, descuento);

    }

    public static void calcularPrecioFinal(String prenda,double precio, double descuento){
        double precioFinal= precio -(descuento*precio)/100;
        System.out.println("El precio de " + prenda + " es: $" + precioFinal);

    }
}