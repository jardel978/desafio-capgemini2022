package resolucoes;

import lombok.NoArgsConstructor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A classe <strong>QuestaoDoisVerificadorDeSenhas</strong> tem a funcionalidade de avaliar uma string e dizer se ela é
 * forte ou fraca para ser usada como uma senha que deve cumprir certos requisitos
 *
 * @author Jardel Silva Oliveira
 * @version 1.0
 */


/**
 * Construtor gerado com o uso do Projeto Lombok<br>
 * <strong>Uso: </strong><br>
 *      QuestaoDoisVerificadorDeSenhas verificadorDeSenhas = new QuestaoDoisVerificadorDeSenhas();
 */
@NoArgsConstructor
public class QuestaoDoisVerificadorDeSenhas {


    /**
     * Metodo que avalia se a string recebida atende aos requisitos para ser considerada uma senha forte<br>
     * Requisitos avaliados: <br>
     * 1- Ter no minimo uma letra minuscula;<br>
     * 2- Ter no minino uma letra maiuscula;<br>
     * 3- Ter no minimo um digito;<br>
     * 4- Ter no minimo seis caracteres;<br>
     * 5- Ter no minimo um dos caracteres especiais: !@#$%^&*()-+
     * @param senha String a ser avaliada
     * @return  Inteiro que informa a quantidade minima de caracteres a serem adicionados para que a string
     * informada possa ser considerada forte e atender a todos os requisitos requeridos
     */
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

    /**
     * Metodo que faz uma verificacao entre uma string e uma expressao regular - Regex
     * @param regex Expressao regular - Regex
     * @param campoParaVerificar String que sera verificada com o uso da regex informada
     * @return Booleano resultante da verificacao da string com o uso da regex informada
     */
    public boolean verificarConteudoSenha(String regex, String campoParaVerificar) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(campoParaVerificar);
        return matcher.find();
    }

}
