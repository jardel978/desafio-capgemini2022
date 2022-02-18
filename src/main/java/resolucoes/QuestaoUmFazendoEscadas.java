package resolucoes;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe <strong>QuestaoUmFazendoEscadas</strong> possui a funcionalidade de recebe um inteiro "n" e gera uma
 * string analoga a uma escada e seus degrais com base e altura no valor de "n"
 *
 * @author Jardel Silva Oliveira
 * @version 1.0
 */

/**
 * Construtor gerado com o uso do Projeto Lombok<br>
 * <strong>Uso: </strong><br>
 *      QuestaoUmFazendoEscadas questaoUmFazendoEscadas = new QuestaoUmFazendoEscadas();
 */
@NoArgsConstructor
public class QuestaoUmFazendoEscadas {

    /**
     * Metodo responsavel por receber um numero inteiro e retornar uma escada de strings
     * @param n Inteiro que informa o tamanho da altura e da base da escada de strings a ser gerada
     * @return String que faz analogia a uma escada. Essa escada de strings possui tamanho e altura n
     */
    public String fazerEscada(int n) {
        List<String> escada = new ArrayList<>();
        for (var i = 1; i <= n; i++) {
            String linha = " ".repeat(n - i) + "*".repeat(i) + "\n";
            if (i == n)
                linha = "*".repeat(i);
            escada.add(linha);
        }
        return escada.toString().replace("[", "")
                .replace(", ", "").replace("]", "");
    }

}
