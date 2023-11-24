package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu  {

    private List<Voo> voos = new ArrayList<>();

    public void Menu() {

        voos.add(new VooEmirates("FDK6", "Congonhas", "Egito", "23-11-2023", "5h50", 250));
        voos.add(new VooDelta("JMS9", "Aeródromo Nascimento", "Madrid", "24-11-2023", "16h00", 250));
        voos.add(new VooAzul("C3PO", "Campo de Marte", "Natal", "25-10-2023", "15h45", 200));

        Scanner teclado = new Scanner(System.in);
        boolean sair = true;

        while (sair) {
            System.out.println("---------- Qual Serviço você deseja utilizar?  ----------");
            System.out.println("Menu:");
            System.out.println("0 - Sair");
            System.out.println("1 - Horário dos Voos");
            System.out.println("2 - Destinos dos Voos");
            System.out.println("3 - Data de partida");
            System.out.println("4 - Companhias Aéreas");
            System.out.println("----------------------------------------------------------");
            int userOption = teclado.nextInt();
            teclado.nextLine();

            switch (userOption) {
                case 0:
                    System.out.println("Aguardamos o seu retorno!!");
                    sair = false;
                    break;
                case 1:
                    listarHorariosVoos();
                    break;
                case 2:
                    listarDestinos();
                    break;
                case 3:
                    listarDatas();
                    break;
                case 4:
                    listarCompanhiasAereas();
                    break;
            }
        }
    }

    private void listarHorariosVoos() {
        System.out.println("Lista de Horários de Voos:");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println("Hora do voo: " + voo.getHoraPartida());
            System.out.println();
        }
    }

    private void listarCompanhiasAereas() {
        System.out.println("Lista de Companhias Aéreas: ");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println();
        }
    }

    private void listarDestinos() {
        System.out.println("Lista de Destinos: ");
        for (Voo voo : voos) {
            System.out.println("Companhia Aérea: " + voo.getNomeCompanhia());
            System.out.println("Horário Voo: " + voo.getHoraPartida());
            System.out.println("Local de partida: " + voo.getOrigem());
            System.out.println("Destino: " + voo.getDestino());
            System.out.println();
        }
    }

    private void listarDatas() {
        System.out.println("Data dos voos: ");
        for (Voo voo : voos) {
            System.out.println("Destino: " + voo.getDestino());
            System.out.println("Data Voo: " + voo.getDataPartida());
            System.out.println("Horário Voo: " + voo.getHoraPartida());
            System.out.println();
        }
    }

}