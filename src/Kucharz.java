/*
Kucharz dostał na urodziny dwa kosze owoców. W pierwszym koszu jest J jabłek, w drugim P pomarańczy. Kucharz lubi
pomarańcze i jabłka tak samo bardzo dlatego chciałby mieć ich po równo. Każde jabłko i każda pomarańcza kosztuje
1 złotą monetę. Kucharz ma Z monet. Napisz program, który na wejściu dostaje trzy liczby:
        J P Z (ilość jabłek, ilość pomarańczy, ilość złotych monet).
Program ma wypisywać jaka jest minimalna możliwa różnica między ilością jabłek i pomarańczy po zakupie owoców.
Kucharz jest bardzo łakomy więc zawsze wydaje wszystkie monety na zakupach.
*/

import java.util.Scanner;

public class Kucharz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę jabłek");
        int j = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj liczbę pomarańczy");
        int p = Integer.parseInt(scanner.nextLine());
        System.out.println("Podaj liczbę monet");
        int z = Integer.parseInt(scanner.nextLine());;
        System.out.println(GUI.calculate(j,p,z));
    }

}

