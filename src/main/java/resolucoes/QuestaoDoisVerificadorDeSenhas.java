package resolucoes;

import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@NoArgsConstructor
public class QuestaoDoisVerificadorDeSenhas {

    public int verificarSenhaForte(String senha) {
        int minimoAceitavelDeCaracteres = 6;
        int caracteresFaltantes = 4;
        int totalCaracteresRecebidos = senha.length();

        if (totalCaracteresRecebidos > 0) {
            if (verificarConteudoSenha("(?=.*\\d)", senha)) {// para ao menos um dígito
                caracteresFaltantes -= 1;
            }
            if (verificarConteudoSenha("(?=.*[a-z])", senha)) {// ao menos uma letra minúscula
                caracteresFaltantes -= 1;
            }
            if (verificarConteudoSenha("(?=.*[A-Z])", senha)) {// AO MENOS UMA LETRA MAIÚSCULA
                caracteresFaltantes -= 1;
            }
            if (verificarConteudoSenha("(?=.*[!@#$%^&*()[-]+])", senha)) {// ao menos um caractere especial
                caracteresFaltantes -= 1;
            }
        } else
            caracteresFaltantes = minimoAceitavelDeCaracteres;

        int minimoNecessarioSenhaForte = totalCaracteresRecebidos + caracteresFaltantes;
        if (minimoNecessarioSenhaForte < minimoAceitavelDeCaracteres)
            caracteresFaltantes = minimoAceitavelDeCaracteres - minimoNecessarioSenhaForte + caracteresFaltantes;

        return caracteresFaltantes;
    }

    public boolean verificarConteudoSenha(String regex, String campoParaVerificar) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(campoParaVerificar);
        return matcher.find();
    }

}
