import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double altura, base;
        int opc = 0;
        Rectangulo rectangulo = new Rectangulo();

        do {

            System.out.println("""
                    Menu
                    1) Rectangulo
                    2) Triangulo
                    3) Circulo
                    4) Salir
                    Ingrese la opcion deseada: """);
            opc = scan.nextInt();
            switch (opc){

                case 1:
                    System.out.println("Ingrese la altura del Rectangulo: ");
                    altura = scan.nextDouble();
                    System.out.println("Ingrese la base del Rectangulo: ");
                    base = scan.nextDouble();
                    rectangulo.setAltura(altura);
                    rectangulo.setBase(base);
                    System.out.println("El Area del rectangulo es :" + rectangulo.calcularArea(););
                    System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    System.out.println("Hasta Prontooooo");
                    break;
                default:
                    System.out.println("Valor Incorrecto");
                    break;
            }
        }while (opc != 4);
    }
}