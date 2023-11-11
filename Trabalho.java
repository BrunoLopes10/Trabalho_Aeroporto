import java.util.Scanner;


public class Trabalho {
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
}