package PackagePlusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        //contadores para armazenar a quantidade de valores positivos, negativos e zeros
        int contPos = 0;
        int contNeg = 0;
        int contZero = 0;



        //percorre a lista
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0){    //se o valor for menor que zero (negativo), imprime esse valor
                contNeg++;  //incrementa 1 ao contador de valores negativos
            }
            else if (arr.get(i) > 0) {  //se o valor for maior que zero (positivo), imprime esse valor
                contPos++;  //incrementa 1 ao contador de valores positvos
            }
            else{   //se o valor for zero (neutro), imprime esse valor
                contZero++; //incrementa 1 ao contador de valores negativos
            }
        }

        //calcula a proporcao de valores positivos, negativos e zeros (em decimal) e imprime em seguida
        double ratioPos = (double)contPos / arr.size();    //calcula a proporcao de valores positivos
        double ratioNeg = (double)contNeg / arr.size();    //calcula a proporcao de valores negativos
        double ratioZero = (double)contZero / arr.size();  //calcula a proporcao de valores nulos (zeros)


        System.out.println(ratioPos%.6f);
        System.out.println(ratioNeg%.6f);
        System.out.println(ratioZero%.6f);
    }

}


/*
o programa ira pedir duas entradas:

- uma com a quantidade de valores a serem inseridos
- outra com os valores propriamente ditos

feito isso, o método plusMinus verificará a quantidade de valores positivos, negativos e
zeros presentes na lista fornecida. Em seguira, irá imprimir essas proporções com 6 casas decimais.
* */


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
