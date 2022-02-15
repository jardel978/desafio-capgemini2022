package resolucoes;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class QuestaoUmFazendoEscadas {

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
