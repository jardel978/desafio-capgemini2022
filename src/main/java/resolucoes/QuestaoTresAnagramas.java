package resolucoes;

import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * A classe <strong>QuestaoTresAnagramas</strong> contem a funcionalidade de analizar uma string e informar quantos
 * anagramas de substrings ela possui
 *
 * @author Jardel Silva Oliveira
 * @version 1.0
 */


/**
 * Construtor gerado com o uso do Projeto Lombok<br>
 * <strong>Uso: </strong><br>
 *      QuestaoTresAnagramas questaoTresAnagramas = new QuestaoTresAnagramas();
 */
@NoArgsConstructor
public class QuestaoTresAnagramas {


    /**
     * Metodo responsavel por receber uma string e retornar a quantidade de possiveis anagramas de substrings que
     * essa string possui
     * @param palavra String a ser analizada
     * @return Inteiro que informa a quantidade de substrings que são anagramas encontrados
     */
    public int encontarAnagramas(String palavra) {

        Map<String, Integer> substringsMap = new HashMap<>();

        for (int i = 0; i <= palavra.length(); i++) {
            for (int j = i + 1; j <= palavra.length(); j++) {
                char[] substringChar = palavra.substring(i, j).toCharArray();
                Arrays.sort(substringChar);
                String substringOrdenada = new String(substringChar);

                if (!substringsMap.containsKey(substringOrdenada)) {
                    substringsMap.put(substringOrdenada, 1);
                } else {
                    Integer ocorrenciasDessaSubstring = substringsMap.get(substringOrdenada);
                    substringsMap.put(substringOrdenada, ++ocorrenciasDessaSubstring);
                }
            }
        }

        return substringsMap.values().stream().reduce(0, (subtotal, val) -> subtotal =
                subtotal + ((val * (val - 1)) / 2));

    }
}