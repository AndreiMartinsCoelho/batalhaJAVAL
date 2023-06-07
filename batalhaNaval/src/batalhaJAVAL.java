
import java.util.Scanner;

import java.util.Random;

public class batalhaJAVAL {

    // aloca os barcos na matriz 1
    public static boolean alocaBarco(char[][] matriz, int tamanho, char orientacao, int pLinha, int pColuna) {
        boolean barcoAlocado = false;
        boolean espacoLivre = true;
        // Verificando se o barco cabe na vertical
        if (orientacao == 'v') {
            if (pLinha >= 0 && pColuna >= 0 && pLinha + tamanho < 10 && pColuna < 10) {

                for (int i = pLinha; i < pLinha + tamanho; i++) {
                    if (matriz[i][pColuna] != '~')
                        espacoLivre = false;
                }
                if (espacoLivre) {
                    for (int i = pLinha; i < pLinha + tamanho; i++) {
                        matriz[i][pColuna] = 'N';
                    }
                    barcoAlocado = true;
                }
            }

        }
        // Verificando se o barco cabe na horizontal
        if (orientacao == 'h') {
            if (pLinha >= 0 && pColuna >= 0 && pLinha < 10 && pColuna + tamanho < 10) {
                for (int i = pColuna; i < pColuna + tamanho; i++) {
                    if (matriz[pLinha][i] != '~')
                        espacoLivre = false;
                }
                if (espacoLivre) {
                    for (int i = pColuna; i < pColuna + tamanho; i++) {
                        matriz[pLinha][i] = 'N';
                    }
                    barcoAlocado = true;
                }
            }

        }
        return barcoAlocado;
    }// final do teste

    //Teste para alocar os barcos na matriz 2
    public static boolean alocaBarco2(char[][] matriz2, int tamanho2, char orientacao2, int pLinha2, int pColuna2) {
        boolean barcoAlocado2 = false;
        boolean espacoLivre2 = true;
        // Verificando se o barco cabe na vertical
        if (orientacao2 == 'v') {
            if (pLinha2 >= 0 && pColuna2 >= 0 && pLinha2 + tamanho2 < 10 && pColuna2 < 10) {

                for (int i = pLinha2; i < pLinha2 + tamanho2; i++) {
                    if (matriz2[i][pColuna2] != '~')
                        espacoLivre2 = false;
                }
                if (espacoLivre2) {
                    for (int i = pLinha2; i < pLinha2 + tamanho2; i++) {
                        matriz2[i][pColuna2] = 'N';
                    }
                    barcoAlocado2 = true;
                }
            }

        }
        // Verificando se o barco cabe na horizontal
        if (orientacao2 == 'h') {
            if (pLinha2 >= 0 && pColuna2 >= 0 && pLinha2 < 10 && pColuna2 + tamanho2 < 10) {
                for (int i = pColuna2; i < pColuna2 + tamanho2; i++) {
                    if (matriz2[pLinha2][i] != '~')
                        espacoLivre2 = false;
                }
                if (espacoLivre2) {
                    for (int i = pColuna2; i < pColuna2 + tamanho2; i++) {
                        matriz2[pLinha2][i] = 'N';
                    }
                    barcoAlocado2 = true;
                }
            }

        }
        return barcoAlocado2;
    }// final do teste

    //Teste que verifica se o tiro acertou ou não
    public static boolean verificarTiro(char[][] matriz, int linha, int coluna) {
        boolean tiroAcertou = false;

        //se o tiro estiver dentro da matriz
        if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz.length) {
            char posicao = matriz[linha][coluna];
            if (posicao == 'N') {
                matriz[linha][coluna] = 'X'; // Marcar como tiro certo
                tiroAcertou = true;
            } else if (posicao == '~') {
                matriz[linha][coluna] = 'O'; // Marcar como tiro na água
            }
        }

        return tiroAcertou;
    }// final do teste

    //Teste que imprime a matriz 1 com os barcos alocados
    public static String imprimeMatriz(char[][] matriz) {
        String retorno = "";
        // matriz 1 do jogo|mapa 1
        System.out.print("\t");
        for (char coluna = 'A'; coluna < 'A' + matriz.length; coluna++) {
            System.out.print(coluna + " \t");
        }

        System.out.println();

        for (int l = 0; l < matriz.length; l++) {
            retorno += l;
            for (int c = 0; c < matriz[0].length; c++) {
                retorno += "\t" + matriz[l][c];
            }
            retorno += "\n";
        }

        System.out.println();

        return retorno;

    }//final do teste

    //Teste que imprime a matriz 2 com os barcos alocados
    public static String imprimeMatriz2(char matriz2[][]) {
        String retornee = "";
        // matriz 2 do jogo|mapa 2
        System.out.println();

        System.out.print("\t");
        for (char coluna = 'A'; coluna < 'A' + matriz2.length; coluna++) {
            System.out.print(coluna + " \t");
        }

        System.out.println();

        for (int l = 0; l < matriz2.length; l++) {
            retornee += l;
            for (int c = 0; c < matriz2[0].length; c++) {
                retornee += "\t" + matriz2[l][c];
            }
            retornee += "\n";
        }

        System.out.println();

        return retornee;
    }//final do teste

    //imprime a primeira matriz com os tiros acertados
    public static String imprimeMatrizComTirosAcertados(char[][] matriz) {
        String retorno = "";

        System.out.print("\t");
        for (char coluna = 'A'; coluna < 'A' + matriz.length; coluna++) {
            System.out.print(coluna + "\t");
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i+ "\t");
            for (int j = 0; j < matriz.length; j++) {
                char caractere = matriz[i][j];
                if (caractere == 'N') {
                    caractere = '~';
                }
                System.out.print(caractere + "\t");
            }
            System.out.println();
        }
        System.out.println();

        return retorno;
    }//final do teste

    //imprime um segunda matriz com os tiros acertados
    public static String imprimeMatrizComTirosAcertados2(char[][] matriz) {
        String retorno = "";

        System.out.print("\t");
        for (char coluna = 'A'; coluna < 'A' + matriz.length; coluna++) {
            System.out.print(coluna + "\t");
        }
        System.out.println();

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(i + 1 + "\t");
            for (int j = 0; j < matriz.length; j++) {
                char caractere = matriz[i][j];
                if (caractere == 'N') {
                    caractere = '~';
                }
                System.out.print(caractere + "\t");
            }
            System.out.println();
        }
        System.out.println();

        return retorno;
    }//final do teste

    //metodo principal do codigo da batalha JAVAL
    public static void main(String[] args) {

        char mapaOne[][] = new char[10][10];
        char mapaTwo[][] = new char[10][10];
        // colocando agua na matriz do mapa
        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                mapaOne[l][c] = '~';
            }
        }

        for (int l = 0; l < 10; l++) {
            for (int c = 0; c < 10; c++) {
                mapaTwo[l][c] = '~';
            }
        }

        System.out.println("Batalha Naval em JAVA!!!\n");

        System.out.println("---------------\n");

        Scanner ler = new Scanner(System.in);

        // Declaração das variaveis do jogo
        String MODE = "";
        String ALOCAR = "";
        String ALOCARtwo = "";
        String NICK = "";
        String NICK2 = "";

        // selecionar modo de jogo
        System.out.println("Jogar contra a máquina[PC]!");
        System.out.println("Jogar contra o player[P]!");

        System.out.println("Escolha qual modo deseja jogar:");
        MODE = ler.nextLine();

        System.out.println("A coluna a,b,c...valem como 0,1,2...respectivamente\n");

        // selionar alocação dos barcos
        System.out.println("Alocar os barcos de forma automática[AUTO] ou manual[MANU]\n");
        switch (MODE.toUpperCase()) {
            case "PC":
                System.out.println("Digite o seu nick para jogar:\n");
                NICK = ler.nextLine();

                System.out.println("A máquina alocou os  barcos automaticamente\n");
                jogoMaquinaAuto2(mapaOne);
                System.out.println(imprimeMatriz(mapaOne));

                System.out.println("Selecione como deseja alocar os barcos[PLAYER-2]:\n");
                ALOCARtwo = ler.nextLine();

                // selecionar alocação dos barcos para o jogador 2

                switch (ALOCARtwo.toUpperCase()) {
                    case "AUTO":
                        System.out.println("O player " + NICK.toUpperCase() + " alocou os barcos automaticamente\n");
                        jogoMaquinaAuto1(mapaTwo);
                        System.out.println(imprimeMatriz2(mapaTwo));
                        break;

                    case "MANU":
                        jogoManual2(mapaTwo);
                        System.out.println(imprimeMatriz2(mapaTwo));
                        System.out.println("O player " + NICK + " alocou os barcos manualmente \n");
                        break;

                    default:
                        System.out.println("Opção invalida!!!\n");
                        break;
                }

            //iniciando o jogo
            realizarTiroAutomatizado(mapaOne, mapaTwo);
            System.out.println(imprimeMatrizComTirosAcertados(mapaTwo));
            System.out.println(imprimeMatrizComTirosAcertados2(mapaOne));

            break;
            
            //modo player
            case "P":
                System.out.println("Digite o nick do primeiro jogador:\n");
                NICK = ler.nextLine();
                System.out.println("Digite o seu nick do segundo jogador:\n");
                NICK2 = ler.nextLine();

                System.out.println("Selecione como deseja alocar os barcos[PLAYER-1]:\n");
                ALOCAR = ler.nextLine();

                System.out.println("Selecione como deseja alocar os barcos[PLAYER-2]:\n");
                ALOCARtwo = ler.nextLine();

                //alocar barcos do player-1

                switch (ALOCAR.toUpperCase()) {
                    case "AUTO":
                        System.out.println("O player-1 " + NICK.toUpperCase() + " alocou os  barcos automaticamente \n");
                        jogoMaquinaAuto1(mapaOne);
                        System.out.println(imprimeMatriz(mapaOne));
                        break;

                    case "MANU":
                        System.out.println("O player-1 " + NICK.toUpperCase() + " alocou os barcos manualmente \n");
                        jogoManual1(mapaOne);
                        System.out.println(imprimeMatriz(mapaOne));
                        break;

                    default:
                        System.out.println("Opção invalida!!!\n");
                    break;
                }

                //alocar barcos do player-2

                switch( ALOCARtwo.toUpperCase() ) {
                    case "AUTO":
                        System.out.println("O player-2 " + NICK2.toUpperCase() + " alocou os barcos automaticamente \n");
                        jogoMaquinaAuto2(mapaTwo);
                        System.out.println(imprimeMatriz2(mapaTwo));
                    break;

                    case "MANU":
                        System.out.println("O player-2 " + NICK2.toUpperCase() + " alocou os barcos manualmente \n");
                        jogoManual2(mapaTwo);
                        System.out.println(imprimeMatriz2(mapaTwo));
                    break;

                    default:
                        System.out.println("Opção invalida!!!\n");
                    break;
                }

                //realizar tiros

                realizarTiroJJ(mapaOne, mapaTwo);

                break;

            }//final do switch
    }// final do main

    // metodo para jogar os barcos automaticamente
    public static void jogoMaquinaAuto2(char mapaOne[][]) {
        Random aleatorio = new Random();
        int quantBarcos = 1;
        int tamanhoBarco = 4;

        // alocacao no mapaOne
        while (quantBarcos <= 4) {
            int quantBarcosTipo = 0;
            while (quantBarcosTipo < quantBarcos) {
                boolean alocado = false;
                // while (!alocado) {
                int linha = aleatorio.nextInt(10);
                int coluna = aleatorio.nextInt(10);
                char orientacao;
                if (aleatorio.nextBoolean()) {
                    orientacao = 'v';
                } else {
                    orientacao = 'h';
                }
                alocado = alocaBarco(mapaOne, tamanhoBarco, orientacao, linha, coluna);
                System.out.println(alocado);
                // }//Fim aloca barco
                if (alocado) {
                    quantBarcosTipo++;
                }
            }
            tamanhoBarco--;
            quantBarcos++;
        }

    }// final do teste

    //metodo para jogar contra a maquina
    public static void jogoMaquinaAuto1(char mapaTwo[][]) {

        //Alaoca os barcos no mapaTwo
        Random aleatorio2 = new Random();
        int quantBarcos2 = 1;
        int tamanhoBarco2 = 4;

        while (quantBarcos2 <= 4) {
            int quantBarcosTipo2 = 0;
            while (quantBarcosTipo2 < quantBarcos2) {
                boolean alocado2 = false;
                // while (!alocado) {
                int linha2 = aleatorio2.nextInt(10);
                int coluna2 = aleatorio2.nextInt(10);
                char orientacao2;
                if (aleatorio2.nextBoolean()) {
                    orientacao2 = 'v';
                } else {
                    orientacao2 = 'h';
                }
                alocado2 = alocaBarco2(mapaTwo, tamanhoBarco2, orientacao2, linha2, coluna2);
                System.out.println(alocado2);
                // }//Fim aloca barco
                if (alocado2) {
                    quantBarcosTipo2++;
                }
            }
            tamanhoBarco2--;
            quantBarcos2++;
        }

    }// final do metodo teste

    // alocação dos barcos manualmente|Player 1
    public static void jogoManual1(char mapaOne[][]) {
        // alocacao no mapaTwo
        Scanner ler1 = new Scanner(System.in);

        int quantBarcos = 1;
        int tamanhoBarco = 4;

        while (quantBarcos <= 4) {
            int quantBarcosTipo = 0;
            while (quantBarcosTipo < quantBarcos) {
                boolean alocado = false;

                System.out.println("Digite um valor para alocar a posição L: ");
                int linha = ler1.nextInt();

                System.out.println("Digite um valor para alocar a posição C: ");
                int coluna = ler1.nextInt();
                ler1.nextLine();
                char orientacao;
                System.out.println("Digite a orientação (v/h): ");
                String orientacaoInput = ler1.nextLine();
                if (orientacaoInput == "v".toUpperCase()) {
                    orientacao = 'v';
                } else {
                    orientacao = 'h';
                }

                alocado = alocaBarco(mapaOne, tamanhoBarco, orientacao, linha, coluna);
                System.out.println(alocado);
                if (alocado) {
                    quantBarcosTipo++;
                }
            }
            tamanhoBarco--;
            quantBarcos++;
        }
    }// final do teste

    // alocação dos barcos manualmente|Player 2
    public static void jogoManual2(char mapaTwo[][]) {
        // alocacao no mapaTwo
        Scanner ler2 = new Scanner(System.in);

        int quantBarcos2 = 1;
        int tamanhoBarco2 = 4;

        while (quantBarcos2 <= 4) {
            int quantBarcosTipo2 = 0;
            while (quantBarcosTipo2 < quantBarcos2) {
                boolean alocado2 = false;

                System.out.println("Digite um valor para alocar a posição L: ");
                int linha2 = ler2.nextInt();

                System.out.println("Digite um valor para alocar a posição C: ");
                int coluna2 = ler2.nextInt();
                ler2.nextLine();

                char orientacao2;
                System.out.println("Digite a orientação (v/h): ");
                String orientacaoInput = ler2.nextLine();
                if (orientacaoInput == "v".toUpperCase()) {
                    orientacao2 = 'v';
                } else {
                    orientacao2 = 'h';
                }

                alocado2 = alocaBarco2(mapaTwo, tamanhoBarco2, orientacao2, linha2, coluna2);
                System.out.println(alocado2);
                if (alocado2) {
                    quantBarcosTipo2++;
                }
            }
            tamanhoBarco2--;
            quantBarcos2++;
        }
    }// final do teste

    //Inicia o jogo de maquina Vs jogador
    public static void realizarTiroAutomatizado(char[][] mapaOne, char[][] mapaTwo) {
        Random random = new Random();
        int tirosAcertadosMaquina = 0;
        int tirosAcertadosJogador = 0;
        int totalTiros = 20;

        //finaliza até quando todos um dos jogadores acertarem todos os tiros nos navios
        while (tirosAcertadosMaquina < totalTiros && tirosAcertadosJogador < totalTiros) {
            // Vez da máquina
            System.out.println("Vez da Máquina");
            int linhaTiroMaquina = random.nextInt(mapaTwo.length);
            int colunaTiroMaquina = random.nextInt(mapaTwo.length);

            boolean tiroAcertouMaquina = verificarTiro(mapaTwo, linhaTiroMaquina, colunaTiroMaquina);
            if (tiroAcertouMaquina) {
                System.out.println("A máquina acertou um navio!");
                tirosAcertadosMaquina++;
            } else {
                System.out.println("A máquina errou o tiro!");
            }

            imprimeMatrizComTirosAcertados(mapaTwo);

            // Vez do jogador
            System.out.println("Vez do Jogador");
            Scanner ler = new Scanner(System.in);

            System.out.println("Digite a linha para realizar o tiro: ");
            int linhaTiroJogador = ler.nextInt();

            System.out.println("Digite a coluna para realizar o tiro: ");
            int colunaTiroJogador = ler.nextInt();
            ler.nextLine();

            boolean tiroAcertouJogador = verificarTiro(mapaOne, linhaTiroJogador, colunaTiroJogador);
            if (tiroAcertouJogador) {
                System.out.println("Jogador acertou um navio!");
                tirosAcertadosJogador++;
            } else {
                System.out.println("Jogador errou o tiro!");
            }

            imprimeMatrizComTirosAcertados(mapaOne);

            System.out.println("Tiros acertados pela máquina: " + tirosAcertadosMaquina);
            System.out.println("Tiros acertados pelo jogador: " + tirosAcertadosJogador);
        }

        System.out.println("Fim do jogo!");

        //verifica se o jogador 1 acertou todos os tiros
        if (tirosAcertadosJogador == totalTiros) {
            System.out.println("O jogador venceu!");
        } else {
            System.out.println("A maquina venceu!");
        }

    }//final do teste.

    //Inicia o jogo de jogador Vs jogador
    public static void realizarTiroJJ(char[][] mapaOne, char[][] mapaTwo) {
        Scanner ler = new Scanner(System.in);
        int tirosAcertadosJogador2 = 0;
        int tirosAcertadosJogador = 0;
        int totalTiros = 20;

        //finaliza até quando todos um dos jogadores acertarem todos os tiros nos navios
        while (tirosAcertadosJogador2 < totalTiros && tirosAcertadosJogador < totalTiros) {

            //Vez do jogador 1
            System.out.println("Vez do Jogador 1");
            System.out.println("Digite a linha para realizar o tiro: ");
            int linhaTiroJogador = ler.nextInt();

            System.out.println("Digite a coluna para realizar o tiro: ");
            int colunaTiroJogador = ler.nextInt();
            ler.nextLine();

            //acerte o tiro e continue jogando e se não acertar passe a vez para o outro jogador
            boolean tiroAcertouJogador = verificarTiro(mapaTwo, linhaTiroJogador, colunaTiroJogador);
            if(tiroAcertouJogador){
                System.out.println("O jogador 1 acertou um navio!");
                tirosAcertadosJogador++;
            }else{
                System.out.println("O jogador 1 errou o tiro!");
                System.out.println("Vez do Jogador 2");
            }

            //imprime o mapa com os tiros acertados
            imprimeMatrizComTirosAcertados(mapaTwo);

            //vez do jogador 2
            System.out.println("Vez do Jogador 2");
            System.out.println("Digite a linha para realizar o tiro: ");
            int linhaTiroJogador2 = ler.nextInt();

            System.out.println("Digite a coluna para realizar o tiro: ");
            int colunaTiroJogador2 = ler.nextInt();
            ler.nextLine();

            //acerte o tiro e continue jogando e se não acertar passe a vez para o outro jogador
            boolean tiroAcertouJogador2 = verificarTiro(mapaOne, linhaTiroJogador2, colunaTiroJogador2);
            //acerte o tiro e continue jogando e se não acertar passe a vez para o outro jogador
            if (tiroAcertouJogador2) {
                System.out.println("Jogador 2 acertou um navio!");
                tirosAcertadosJogador2++;
            } else {
                System.out.println("Jogador 2 errou o tiro!");
            }

            imprimeMatrizComTirosAcertados(mapaOne);

            System.out.println("Tiros acertados pelo jogador 2: " + tirosAcertadosJogador2);
            System.out.println("Tiros acertados pelo jogador 1: " + tirosAcertadosJogador);
        }
        System.out.println("Fim do jogo!");

        //verifica se o jogador 1 acertou todos os tiros
        if (tirosAcertadosJogador == totalTiros) {
            System.out.println("O jogador 1 venceu!");
        } else {
            System.out.println("O jogador 2 venceu!");
        }

    }//final do teste.


}//final public class