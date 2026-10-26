import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldoFinal = 0;
        int opcion = 0;
        int operaciones = 0;
        int rechazados = 0;
        int contOpera = 0;

            System.out.println("Servicios bancarios");
            System.out.print("Ingrese el saldo: ");
            double saldo = Integer.parseInt(sc.nextLine());

            if (saldo < 1 && saldo > 1000000000){
                System.out.println("Saldo debe ser entre mil millones y 0");
                }

            saldoFinal = saldo;

            System.out.println("Ingrese el numero de operaciones a realizar: ");
            operaciones = Integer.parseInt(sc.nextLine());
            if (operaciones > 10 && operaciones < 1){
                System.out.println("Operaciones debe ser entre 1 y 10");}

            contOpera = operaciones;
        do {
            for (int i = contOpera; i != 0; i--){
                System.out.println("1. Deposito");
                System.out.println("2. Retiro");
                System.out.println("ingrese su opcion: ");
                opcion  = Integer.parseInt(sc.nextLine());

                switch (opcion){
                    case 1:
                        System.out.print("Ingrese el saldo a depositar: ");
                        double deposito = Double.parseDouble(sc.nextLine());
                        if (deposito < 1){
                            System.out.println("Saldo debe ser mayor a 0");
                            rechazados++;
                            break;}
                        saldoFinal += deposito;

                        contOpera--;
                        System.out.println("contador: " + contOpera);

                        break;

                        case 2:
                            System.out.print("Ingrese el saldo a retirar: ");
                            double retiro = Double.parseDouble(sc.nextLine());

                            if (retiro > saldoFinal) {
                                System.out.println("Saldo insuficiente");
                                rechazados++;
                                break;
                            }
                            saldoFinal -= retiro;

                            contOpera--;
                            System.out.println("contador: " + contOpera);
                            break;

                    default:
                        System.out.println("Ingrese uan opcion (1 o 2)");
                        break;

                }
            }
        }while(contOpera != 0);

        System.out.println("SALDO FINAL: " + saldoFinal);
        System.out.println("RECHAZADOS: " + rechazados);


    }
}
