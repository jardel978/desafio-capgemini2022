package resolucoes;

import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
public class QuestaoTresAnagramas {

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