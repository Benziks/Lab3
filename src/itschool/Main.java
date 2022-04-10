package itschool;
import java.util.*;
import java.lang.*;
import java.io.File;






public class Main
{
    public static void main(String[] args) {
        task4();
        task27();
        task50();
        task61();
    }





//50
// Дана строка, состоящая из слов кириллицей, разделенных пробелами (одним или несколькими).
// Вывести строку, содержащую эти же слова, разделенные одним пробелом и расположенные в обратном порядке.

    private static	void task50(){
        String s = "Max Danya Jenya Gwem" + " Ben Ken Alex Jenny";
        List<String> words = Arrays.asList(s.split(" "));
        Collections.reverse(words);
        System.out.println(String.join(" ", words));




    }
    //4.
    //Дано целое число N (1 ≤ N ≤ 26). Вывести N первых прописных (т. е. заглавных) букв латинского алфавита.
    private static	void task4(){
        Scanner d = new Scanner(System.in);
        System.out.println("Введите число в промежутке 1<=N<=26 ");
        int N = d.nextInt();

        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println(s.substring(0, N));
    }


    //27
    //Даны целые положительные числа N1 и N2 и строки S1 и S2.
    // Получить из этих строк новую строку, содержащую первые N1 символов строки S1 и последние N2 символов строки S2 (в указанном порядке).

    private static	void task27(){

        String s1 = "abcdefg";
        String s2 = "123456789 ";
        String result;
        int N1=2,N2=6;
        result = s1.substring(0, N1);
        result+=s2.substring(N2);
        System.out.println(result);
    }

    //61 Дана строка, содержащая полное имя файла.
    // Выделить из этой строки название последнего каталога (без символов «\»).
    // Если файл содержится в корневом каталоге, то вывести символ «\».



    private static	void task61(){


        String path = "c:\\Users\\Pole.Gogen\\Downloads\\Virtual Machine Spec Java SE 8.pdf";
        File fileName = new File(path);
        System.out.println(fileName.getName().substring(0, fileName.getName().lastIndexOf('.')));

    }











}
































