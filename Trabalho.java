import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Trabalho {
    
private static Scanner scanner = new Scanner(System.in);    
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
                break;
            case 3:
                checkin();
                break;
            case 4:
                administrador(scanner);
                break;
            case 5:
                System.out.println("FECHANDO O SISTEMA...");
                break;
            default:
                System.err.println("OPÇÃO INVÁLIDA, DIGITE NOVAMENTE.");
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
    System.out.println("DENTINO: VITÓRIA");
    System.out.println("HORÁRIO DE PARTIDA: 10:00");
    System.out.println("HORÁRIO DE CHEGADA: 11:30");
    System.out.println("QUANTIDADE MÁXIMA DE PASSAGEIROS: 220");
    System.out.println("STATUS: DISPONIVEL");
    
            System.out.println("--------------------------------------------------");

    
    System.out.println("NÚMERO DO VOO: 2365");
    System.out.println("ORIGEM: LONDRINA");
    System.out.println("DENTINO: SÃO PAULO");
    System.out.println("HORÁRIO DE PARTIDA: 15:00");
    System.out.println("HORÁRIO DE CHEGADA: 16:30");
    System.out.println("QUANTIDADE MÁXIMA DE PASSAGEIROS: 200");
    System.out.println("STATUS: DISPONIVEL");
            System.out.println("--------------------------------------------------");

    
    System.out.println("NÚMERO DO VOO: 1235");
    System.out.println("ORIGEM: GUARULHOS");
    System.out.println("DENTINO: SALVADOR");
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
            System.err.println("CPF inválido. Certifique-se de digitar no formato correto.");
        }
    }
       
       System.out.print("INSIRA SEU EMAIL:");
       String email = scanner.next();
       
       {
       filaDeReservas.offer("Reserva para " + nomePassageiro + " (Voo " + reserva + ")");
    
}
    
    System.out.println("================================");
    System.out.println("RESERVA FEITA COM SUCESSO!");
    System.out.println("================================");
    System.out.println("");
    
   }else{
       
    System.err.println("NÚMERO DE RESERVA INVÁLIDO");
   }
       
}

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class aa2 {
    
private static Scanner scanner = new Scanner(System.in);    
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
                break;
            case 3:
                checkin();
                break;
            case 4:
                administrador(scanner);
                break;
            case 5:
                System.out.println("FECHANDO O SISTEMA...");
                break;
            default:
                System.err.println("OPÇÃO INVÁLIDA, DIGITE NOVAMENTE.");
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
    System.out.println("DENTINO: VITÓRIA");
    System.out.println("HORÁRIO DE PARTIDA: 10:00");
    System.out.println("HORÁRIO DE CHEGADA: 11:30");
    System.out.println("QUANTIDADE MÁXIMA DE PASSAGEIROS: 220");
    System.out.println("STATUS: DISPONIVEL");
    
            System.out.println("--------------------------------------------------");

    
    System.out.println("NÚMERO DO VOO: 2365");
    System.out.println("ORIGEM: LONDRINA");
    System.out.println("DENTINO: SÃO PAULO");
    System.out.println("HORÁRIO DE PARTIDA: 15:00");
    System.out.println("HORÁRIO DE CHEGADA: 16:30");
    System.out.println("QUANTIDADE MÁXIMA DE PASSAGEIROS: 200");
    System.out.println("STATUS: DISPONIVEL");
            System.out.println("--------------------------------------------------");

    
    System.out.println("NÚMERO DO VOO: 1235");
    System.out.println("ORIGEM: GUARULHOS");
    System.out.println("DENTINO: SALVADOR");
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
            System.err.println("CPF inválido. Certifique-se de digitar no formato correto.");
        }
    }
       
       System.out.print("INSIRA SEU EMAIL:");
       String email = scanner.next();
       
       {
       filaDeReservas.offer("Reserva para " + nomePassageiro + " (Voo " + reserva + ")");
    
}
    
    System.out.println("================================");
    System.out.println("RESERVA FEITA COM SUCESSO!");
    System.out.println("================================");
    System.out.println("");
    
   }else{
       
    System.err.println("NÚMERO DE RESERVA INVÁLIDO");
   }
       
}

private static void checkin() {
    if (!filaDeReservas.isEmpty()) {
        int i = 1;
        System.out.println("----- RESERVAS PARA CHECK-IN -----");
        for (String reserva : filaDeReservas) {
            System.out.println(i + ". " + reserva);
            i++;
        }
        System.out.println("0. Cancelar");

        System.out.print("Escolha o número da reserva para realizar o check-in: ");
        int opcao = scanner.nextInt();

        if (opcao >= 1 && opcao <= filaDeReservas.size()) {
            realizarCheckin(opcao);
        } else if (opcao == 0) {
            System.out.println("Operação cancelada.");
        } else {
            System.out.println("Número de reserva inválido.");
        }
    } else {
        System.out.println("Nenhuma reserva para realizar check-in no momento.");
    }
}

private static void realizarCheckin(int opcao) {
    int i = 1;
    String reservaEscolhida = "";
    for (String reserva : filaDeReservas) {
        if (i == opcao) {
            reservaEscolhida = reserva;
            break;
        }
        i++;
    }

    String[] detalhesReserva = reservaEscolhida.split(" ");
    String nomeReserva = detalhesReserva[2];
    String numeroVoo = detalhesReserva[4].replace(")", "");

    System.out.println("----- CHECK-IN -----");
    System.out.println("NOME DO PASSAGEIRO: " + nomeReserva);
    System.out.println("NÚMERO DO VOO: " + numeroVoo);
    System.out.println("STATUS: CHECK-IN CONCLUÍDO");
    System.out.println("=====================");
}
    
private static void administrador(Scanner scanner) {
   System.out.println("----- LOGIN ADMINISTRADOR  -----");
    System.out.print("CHAVE DE ACESSO: ");
    String chave = scanner.next();
    
    if (chave.equals("admin")) {
        System.out.print("SENHA DE ACESSO: ");
        String senha = scanner.next();
        
        if (senha.equals("admin")) {
            exibirReservas();
        } else {
            System.err.println("SENHA INVÁLIDA. TENTE NOVAMENTE.");
        }
    } else {
        System.err.println("CHAVE DE ACESSO INVÁLIDA. TENTE NOVAMENTE.");
    }
}

private static void exibirReservas() {
        System.out.println("----- RESERVAS -----");
        int i = 1;
        for (String reserva : filaDeReservas) {
            System.out.println(i + ". " + reserva);
            i++;
        }
        System.out.println("--------------------");

        System.out.println("Selecione o número da reserva para confirmar ou cancelar (0 para sair): ");
        int opcao = scanner.nextInt();

        if (opcao >= 1 && opcao <= filaDeReservas.size()) {
            System.out.println("1. Confirmar Reserva");
            System.out.println("2. Cancelar Reserva");
            int acao = scanner.nextInt();

            if (acao == 1) {
                confirmarReserva(opcao);
            } else if (acao == 2) {
                cancelarReserva(opcao);
            } else {
                System.err.println("Opção inválida.");
            }
        } else if (opcao == 0) {
            System.out.println("Operação cancelada.");
        } else {
            System.err.println("Número de reserva inválido.");
        }
    }

    private static void confirmarReserva(int numeroReserva) {
        System.out.println("Reserva confirmada: " + filaDeReservas.poll());
    }

    private static void cancelarReserva(int numeroReserva) {
        System.out.println("Reserva cancelada: " + filaDeReservas.remove());
    }
}
    
private static void administrador(Scanner scanner) {
   System.out.println("----- LOGIN ADMINISTRADOR  -----");
    System.out.print("CHAVE DE ACESSO: ");
    String chave = scanner.next();
    
    if (chave.equals("admin")) {
        System.out.print("SENHA DE ACESSO: ");
        String senha = scanner.next();
        
        if (senha.equals("admin")) {
            exibirReservas();
        } else {
            System.err.println("SENHA INVÁLIDA. TENTE NOVAMENTE.");
        }
    } else {
        System.err.println("CHAVE DE ACESSO INVÁLIDA. TENTE NOVAMENTE.");
    }
}

private static void exibirReservas() {
        System.out.println("----- RESERVAS -----");
        int i = 1;
        for (String reserva : filaDeReservas) {
            System.out.println(i + ". " + reserva);
            i++;
        }
        System.out.println("--------------------");

        System.out.println("Selecione o número da reserva para confirmar ou cancelar (0 para sair): ");
        int opcao = scanner.nextInt();

        if (opcao >= 1 && opcao <= filaDeReservas.size()) {
            System.out.println("1. Confirmar Reserva");
            System.out.println("2. Cancelar Reserva");
            int acao = scanner.nextInt();

            if (acao == 1) {
                confirmarReserva(opcao);
            } else if (acao == 2) {
                cancelarReserva(opcao);
            } else {
                System.err.println("Opção inválida.");
            }
        } else if (opcao == 0) {
            System.out.println("Operação cancelada.");
        } else {
            System.err.println("Número de reserva inválido.");
        }
    }

    private static void confirmarReserva(int numeroReserva) {
        System.out.println("Reserva confirmada: " + filaDeReservas.poll());
    }

    private static void cancelarReserva(int numeroReserva) {
        System.out.println("Reserva cancelada: " + filaDeReservas.remove());
    }
}