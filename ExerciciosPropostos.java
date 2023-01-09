import java.util.*;

public class ExerciciosPropostos {
    public static void main(String[] args) {
        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("  Interrogatório  ");
        System.out.println(" Telefonou para a Vítima ");
        String resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(" Esteve no local do crime? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(" Mora perto da vítima ? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(" Devia  avítima ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(" Já trabalhou com a vítima? ");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while (contador.hasNext()) {
            String res = contador.next();
            if (res.contains("sim")) {
                count ++;
            }
        }

        switch (count) {
            case 2:
                System.out.println("  Suspeita  ");
            break;
            case 3:
            case 4:
                System.out.println("  Cúmplice  ");
                break;
            case 5:
                System.out.println("  Assasino  ");
                break;
            default:
                System.out.println("  Inocente  ");
                break;

        }
    }
}
