import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos você ganha por hora?");
        double hora = scan.nextDouble();
        System.out.println("Qual valor de horas trabalahdas no mês?");
        double vhora= scan.nextDouble();
        double reslt = hora * vhora;
        double sidicato = 0.03;
        double FGTS = 0.11;

        if (reslt <= 900){
            System.out.println("O sálario liquido vai ser de:"+ (reslt*sidicato+reslt));
            System.out.println("O sálario liqudo com o FGTS vai ser de:"+ (reslt*FGTS+reslt));

//        }else if (reslt>= 1500){
//            System.out.println();

        }


    }
}
