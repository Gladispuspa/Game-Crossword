package project;

import java.util.Scanner;


public class Project {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.println("\t**SELAMAT DATANG DI GAME CROSSWORD**");
        System.out.println("****************************************************");
        System.out.println("silahkan masukan nama anda untuk memainkan game ini\n");
        System.out.print("Nama pemain : ");
        String nama = input.next();
        System.out.println("_____________________________________________");
        System.out.println(nama.toUpperCase() + "\tSELAMAT MEMAINKAN GAME CROSSWORD");
        System.out.println("_____________________________________________");
        int pilihan;
        do {
            System.out.println("============================");
            System.out.println("\tMENU");
            System.out.println("----------------------------");
            System.out.println("1.Crossword kata benda");
            System.out.println("2.Crossword Kata Sifat");
            System.out.println("3. Keluar");
            System.out.println("--------------------");
            System.out.print("Masukan Pilihan : ");
            pilihan = input.nextInt();
            System.out.println("--------------------");
            boolean back = true;
            switch (pilihan) {
                case 1:
                    CrosswordKataBenda();
                    break;
                case 2:
                    CrosswordKataSifat();
                    break;
                case 3:
                    Keluar();
                    break;

            }
        } while (pilihan != 0);

    }

    private static void CrosswordKataBenda() {
        Scanner input = new Scanner(System.in);
        for (String i = "Y"; i.equals("Y") || i.equals("y");) {
            System.out.println("-------------------------");
            System.out.println("\tLEVEL 1");
            System.out.println("--------------------------");
            int score = 0;
            char board[][] = {{'G', 'A', 'M', 'P', 'G', 'O', 'L', 'E', 'K', 'A'},
            {'C', 'E', 'S', 'E', 'A', 'M', 'P', 'A', 'L', 'M'},
            {'G', 'U', 'G', 'U', 'Y', 'U', 'N', 'G', 'E', 'M'},
            {'P', 'E', 'K', 'E', 'U', 'L', 'I', 'A', 'S', 'U'},
            {'S', 'U', 'U', 'A', 'N', 'G', 'I', 'L', 'E', 'M'},
            {'E', 'A', 'R', 'U', 'G', 'I', 'S', 'U', 'P', 'O'},
            {'B', 'A', 'S', 'R', 'U', 'K', 'A', 'B', 'E', 'L'},
            {'P', 'A', 'I', 'N', 'G', 'E', 'M', 'E', 'T', 'U'},
            {'J', 'U', 'N', 'G', 'E', 'M', 'A', 'N', 'U', 'S'},
            {'A', 'S', 'A', 'P', 'U', 'B', 'A', 'N', 'D', 'A'}};

            //tampilan board 
            System.out.println("**************************");

            for (int a = 0; a < 10; a++) {
                System.out.print("** ");
                for (int b = 0; b < 10; b++) {
                    System.out.print(board[a][b] + " ");
                }
                System.out.println("***");
            }
            System.out.println("**************************");
            {

                //input kata
                for (int c = 0; c < 5; c++) {
                    System.out.print("inputkan kata :");
                    String kata = input.next();

                    //cek jawaban
                    if (kata.equalsIgnoreCase("KURSI") || kata.equals("UANG") || kata.equals("KABEL") || kata.equals("GAYUNG") || kata.equals("SAPU")) {
                        System.out.println("JAWABAN BENAR");

                    } else {
                        System.out.println("JAWABAN SALAH");
                    }

                }
                System.out.println("Apakah anda mau mengulang? Y/T");
                i = input.next();
            }
        }
        for (String j = "Y"; j.equals("Y") || j.equals("y");) {
            System.out.println("-------------------------");
            System.out.println("\tLEVEL 2");
            System.out.println("--------------------------");
            char board2[][] = {{'G', 'P', 'M', 'T', 'G', 'O', 'L', 'E', 'K', 'A'},
            {'C', 'E', 'S', 'A', 'A', 'M', 'P', 'A', 'L', 'M'},
            {'G', 'S', 'G', 'X', 'M', 'U', 'N', 'G', 'E', 'M'},
            {'P', 'A', 'K', 'I', 'O', 'B', 'I', 'S', 'S', 'U'},
            {'S', 'W', 'T', 'A', 'B', 'G', 'I', 'L', 'E', 'M'},
            {'E', 'A', 'P', 'U', 'I', 'I', 'S', 'U', 'P', 'O'},
            {'B', 'T', 'S', 'R', 'L', 'K', 'A', 'O', 'P', 'L'},
            {'P', 'A', 'M', 'N', 'G', 'E', 'M', 'E', 'T', 'U'},
            {'J', 'U', 'K', 'A', 'P', 'A', 'L', 'N', 'U', 'S'},
            {'A', 'S', 'I', 'P', 'L', 'B', 'A', 'N', 'D', 'A'}};

            //tampilan board
            System.out.println("**************************");

            for (int a = 0; a < 10; a++) {
                System.out.print("** ");
                for (int b = 0; b < 10; b++) {
                    System.out.print(board2[a][b] + " ");
                }
                System.out.println("***");
            }
            System.out.println("**************************");

            //input kata
            for (int k = 0; k < 5; k++) {
                System.out.print("inputkan kata :");
                String kata2 = input.next();

                if (kata2.equalsIgnoreCase("MOBIL") || kata2.equals("KAPAL") || kata2.equals("PESAWAT") || kata2.equals("BIS") || kata2.equals("TAXI")) {
                    System.out.println("JAWABAN BENAR");
                } else {
                    System.out.println("JAWABAN SALAH");
                }
            }

            System.out.println("Apakah anda mau mengulang? Y/T");
            j = input.next();

        }
    }

    private static void CrosswordKataSifat() {
        Scanner input = new Scanner(System.in);
        for (String j = "Y"; j.equals("Y") || j.equals("y");) {
            System.out.println("-------------------------");
            System.out.println("LEVEL 1 KATA SIFAT");
            System.out.println("--------------------------");
            char board[][] = {{'C', 'A', 'N', 'T', 'I', 'K', 'L', 'E', 'K', 'A'},
            {'C', 'E', 'S', 'E', 'A', 'M', 'P', 'A', 'L', 'M'},
            {'G', 'U', 'G', 'U', 'D', 'U', 'N', 'G', 'E', 'M'},
            {'P', 'E', 'K', 'E', 'N', 'L', 'I', 'A', 'S', 'A'},
            {'S', 'J', 'B', 'A', 'I', 'K', 'I', 'L', 'E', 'L'},
            {'E', 'A', 'R', 'U', 'G', 'I', 'S', 'U', 'P', 'A'},
            {'B', 'H', 'P', 'R', 'U', 'K', 'A', 'P', 'M', 'S'},
            {'P', 'A', 'I', 'N', 'G', 'E', 'M', 'E', 'T', 'U'},
            {'J', 'T', 'N', 'G', 'E', 'R', 'A', 'J', 'I', 'N'},
            {'A', '1', 'U', 'P', 'U', 'B', 'A', 'N', 'D', 'A'}};

            //tampilan board
            System.out.println("**************************");

            for (int a = 0; a < 10; a++) {
                System.out.print("** ");
                for (int b = 0; b < 10; b++) {
                    System.out.print(board[a][b] + " ");
                }
                System.out.println("***");
            }
            System.out.println("**************************");

            //input kata
            for (int c = 0; c < 5; c++) {
                System.out.print("inputkan kata :");
                String kata_1 = input.next();

                //cek jawaban       
                if (kata_1.equalsIgnoreCase("CANTIK") || kata_1.equals("BAIK") || kata_1.equals("MALAS") || kata_1.equals("RAJIN") || kata_1.equals("JELEK")) {
                    System.out.println("JAWABAN BENAR");
                } else {
                    System.out.println("JAWABAN SALAH");

                }
            }
            System.out.println("Apakah anda mau mengulang? Y/T");
            j = input.next();

        }

        for (String k = "Y"; k.equals("Y") || k.equals("y");) {
            System.out.println("-------------------------");
            System.out.println("LEVEL 1 KATA SIFAT");
            System.out.println("--------------------------");
            char board[][] = {{'C', 'M', 'N', 'A', 'I', 'K', 'L', 'E', 'K', 'A'},
                              {'C', 'A', 'S', 'E', 'N', 'A', 'N', 'G', 'L', 'M'},
                              {'G', 'R', 'G', 'B', 'D', 'U', 'N', 'G', 'E', 'M'},
                              {'P', 'A', 'K', 'O', 'N', 'L', 'I', 'A', 'S', 'P'},
                              {'S', 'H', 'B', 'D', 'U', 'K', 'I', 'L', 'E', 'A'},
                              {'E', 'U', 'R', 'O', 'P', 'I', 'N', 'T', 'A', 'R'},
                              {'B', 'H', 'P', 'H', 'U', 'K', 'A', 'P', 'M', 'A'},
                              {'P', 'A', 'I', 'N', 'G', 'E', 'M', 'E', 'T', 'M'},
                              {'J', 'T', 'N', 'G', 'E', 'R', 'O', 'J', 'L', 'A'},
                              {'A', '1', 'U', 'P', 'U', 'B', 'A', 'N', 'D', 'H'}};

            //tampilan board
            System.out.println("**************************");

            for (int a = 0; a < 10; a++) {
                System.out.print("** ");
                for (int b = 0; b < 10; b++) {
                    System.out.print(board[a][b] + " ");
                }
                System.out.println("***");
            }
            System.out.println("**************************");

            //input kata
            for (int c = 0; c < 5; c++) {
                System.out.print("inputkan kata :");
                String kata_1 = input.next();

                //cek jawaban       
                if (kata_1.equalsIgnoreCase("MARAH") || kata_1.equals("BODOH") || kata_1.equals("PINTAR") || kata_1.equals("RAMAH") || kata_1.equals("SENANG")) {
                    System.out.println("JAWABAN BENAR");
                } else {
                    System.out.println("JAWABAN SALAH");

                }
            }
            System.out.println("Apakah anda mau mengulang? Y/T");
            k = input.next();

        }

    }

    private static void Keluar() {
            System.exit(0);
        
    }
}
