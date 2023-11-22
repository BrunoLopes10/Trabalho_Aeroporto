import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Trabalho {
    private static Queue<String> filaDeReservas = new LinkedList<>();
    private static String nomePassageiro; private static String cpfPassageiro;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int opcao;
       
       do {
           exibirMenu();
           opcao = scanner.nextInt();
           scanner.nextLine();
          
           switch (opcao) {
               case 1:
                   vizualizarVoos();
               break;
               case 2:
                   cadastrarPassageiro(scanner);
               case 3:
                   checkin();
         }       
        } while (opcao != 5);
}
    
    private static void exibirMenu() {
    System.out.println("---------------------------");
    System.out.println("|       MENU DE VOOS      | ");
    System.out.println("---------------------------");
    System.out.println("| 1 - VISUALIZAR VOOS     |");
    System.out.println("| 2 - RESERVAR PASSAGEM   |");
    System.out.println("| 3 - FAZER CHECK-IN      |");
    System.out.println("| 4 - PROCESSAR RESERVAS  |");
    System.out.println("| 5 - SAIR                |");
    System.out.println("---------------------------");
    System.out.print("| DIGITE UMA OPÇÃO: ");
}

private static void vizualizarVoos() {
    
    System.out.println("");
    System.out.println("-------- VOOS -------");
    System.out.println("NÚMERO DO VOO: 309");
    System.out.println("ORIGEM: VITÓRIA");
    System.out.println("DESTINO: SÃO PAULO");
    System.out.println("HORÁRIO DE PARTIDA: 19:00 ");
    System.out.println("HORÁRIO DE CHEGADA: 00:00");
    System.out.println("QUANTIDADE MÁXIMA DE PASSAGEIROS: 215");
    System.out.println("STATUS: DISPONÍVEL");
    
    System.out.println("--------------------------------------------------");
    
    System.out.println("NÚMERO DO VOO: 85");
    System.out.println("ORIGEM: RIO DE JANEIRO");
    System.out.println("DESTINO: VITÓRIA");
    System.out.println("HORÁRIO DE PARTIDA: 10:00");
    System.out.println("HORÁRIO DE CHEGADA: 11:30");
    System.out.println("QUANTIDADE MÁXIMA DE PASSAGEIROS: 220");
    System.out.println("STATUS: DISPONIVEL");
    
            System.out.println("--------------------------------------------------");

    
    System.out.println("NÚMERO DO VOO: 2365");
    System.out.println("ORIGEM: LONDRINA");
    System.out.println("DESTINO: SÃO PAULO");
    System.out.println("HORÁRIO DE PARTIDA: 15:00");
    System.out.println("HORÁRIO DE CHEGADA: 16:30");
    System.out.println("QUANTIDADE MÁXIMA DE PASSAGEIROS: 200");
    System.out.println("STATUS: DISPONIVEL");
            System.out.println("--------------------------------------------------");

    
    System.out.println("NÚMERO DO VOO: 1235");
    System.out.println("ORIGEM: GUARULHOS");
    System.out.println("DESTINO: SALVADOR");
    System.out.println("HORÁRIO DE PARTIDA: 19:00");
    System.out.println("HORÁRIO DE CHEGADA: 21:30");
    System.out.println("QUANTIDADE MÁXIMA DE PASSAGEIROS: 230");
    System.out.println("STATUS: DISPONÍVEL");
    
            System.out.println("--------------------------------------------------");


}

private static void cadastrarPassageiro(Scanner scanner) {
    System.out.println("QUAL O NÚMERO DO VOO QUE O(A) SENHOR(A) DESEJA RESERVAR ?");
    int reserva = scanner.nextInt();
if (reserva == 309 || reserva == 85 || reserva == 2365 || reserva == 1235) {
     System.out.println("NÚMERO DO VOO CONFIRMADO!");

       System.out.print("INSIRA SEU NOME COMPLETO:");
       scanner.nextLine();
       nomePassageiro = scanner.nextLine();

       System.out.print("INSIRA A SUA IDADE:");
       int idade = scanner.nextInt();
       
       String cpf;
    boolean cpfValido = false;

    while (!cpfValido) {
        System.out.print("INSIRA SEU CPF:");
        scanner.nextLine();
        cpfPassageiro = scanner.nextLine();

        if (cpfPassageiro.length() == 14) {
            cpfValido = true;
        } else {
            System.err.println("CPF INVÁLIDO. CERTIFIQUE-SE DE ESCREVER NA FORMA CORRETA.");
        }
    }
       
       System.out.print("INSIRA SEU EMAIL:");
       String email = scanner.next();
       
       {
       filaDeReservas.offer("RESERVA PARA: " + nomePassageiro + " (Voo " + reserva + ")");
    
}
    System.out.println("");
    System.out.println("================================");
    System.out.println("RESERVA FEITA COM SUCESSO!");
    System.out.println("================================");
    System.out.println("");
    
   }else{
       
    System.err.println("NÚMERO DE RESERVA INVÁLIDO");
   }
       
}

private static void checkin() {
    System.out.println("----- AGUARDANDO CONFIRMAÇÃO -----");
    System.out.println("NOME DO PASSAGEIRO: " + nomePassageiro);
    System.out.println("CPF DO PASSAGEIRO: " + cpfPassageiro);
    System.out.println("STATUS: AGUARDANDO CONFIRMAÇÃO...");
    System.out.println("==================================");

}
}