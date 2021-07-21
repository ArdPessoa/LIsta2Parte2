import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o sálario:");
        double salario = scan.nextDouble();
        double aumT = 0.05*salario;

        if(salario<=280){
            System.out.println("O aumento vai ser de:" +(salario*0.2+salario));

        }else if (salario>=280 & salario<=700){
            System.out.println("O aumento vai ser de:"+(salario*0.15+salario));

        }else if (salario >700 & salario<=1500){
            System.out.println("O aumento vai ser de:"+(salario*0.1+salario));

        }else if (salario>1500){
            System.out.println("Com o reajuste o sálario foi:"+(salario*0.05+salario));
            System.out.println("Antes do reajusto era:" + salario);
            System.out.println("O aumento foi %5");
            System.out.println("O aumento foi de:" + aumT);

        }
    }
}
