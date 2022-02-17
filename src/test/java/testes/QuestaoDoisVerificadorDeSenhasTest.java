package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resolucoes.QuestaoDoisVerificadorDeSenhas;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoDoisVerificadorDeSenhasTest {

    @Test
    void verificarSenhaForte() {
        QuestaoDoisVerificadorDeSenhas verificadorDeSenhas = new QuestaoDoisVerificadorDeSenhas();

//        Cenário Negativo

//        case n01
        Assertions.assertNotEquals(1, verificadorDeSenhas.verificarSenhaForte("Ah5*fl"), "Cenário negativo: case n01");

//        case n02
        Assertions.assertNotEquals(5, verificadorDeSenhas.verificarSenhaForte(""), "Cenário negativo: case n02");

//        case n03
        Assertions.assertNotEquals(4, verificadorDeSenhas.verificarSenhaForte("-fl"), "Cenário negativo: case n03");

//        case n04
        Assertions.assertNotEquals(1, verificadorDeSenhas.verificarSenhaForte("Ah5*"), "Cenário negativo: case n04");


//        Cenário Positivo

//        case p01
        Assertions.assertEquals(0, verificadorDeSenhas.verificarSenhaForte("Ab3*ss"), "Cenário positivo: case p01");

//        case p02
        Assertions.assertEquals(6, verificadorDeSenhas.verificarSenhaForte(""), "Cenário positivo: case p02");

//        case p03
        Assertions.assertEquals(5, verificadorDeSenhas.verificarSenhaForte("*"), "Cenário positivo: case p03");

//        case p04
        Assertions.assertEquals(4, verificadorDeSenhas.verificarSenhaForte("*d"), "Cenário positivo: case p04");

//        case p05
        Assertions.assertEquals(3, verificadorDeSenhas.verificarSenhaForte("*dd"), "Cenário positivo: case p05");

//        case p06
        Assertions.assertEquals(3, verificadorDeSenhas.verificarSenhaForte("asdfgh"), "Cenário positivo: case p06");

    }


    @Test
    void testandoMetodoDeVerificarConteudoSenha() {

        QuestaoDoisVerificadorDeSenhas verificadorDeSenhas = new QuestaoDoisVerificadorDeSenhas();
        var regexCaracteresMinusculos = "(?=.*[a-z])";
        var regexCaracteresEspeciais = "(?=.*[!@#$%^&*()[-]+])";
        var regexCaracteresMaiusculos = "(?=.*[A-Z])";
        var regexCaracteresDigitos = "(?=.*\\d)";

//        Cenário Negativo

//        case n01
        Assertions.assertNotEquals(false, verificadorDeSenhas.verificarConteudoSenha(regexCaracteresMinusculos, "Ah5" +
                        "*fl"),
                "Cenário negativo: case n01");

//        case n02
        Assertions.assertNotEquals(true, verificadorDeSenhas.verificarConteudoSenha(regexCaracteresEspeciais,
                        "f4556GD"),
                "Cenário negativo: case n02");


//        Cenário Positivo

//        case p01
        Assertions.assertEquals(true, verificadorDeSenhas.verificarConteudoSenha(regexCaracteresMaiusculos, "8dbE4f*"),
                "Cenário positivo: case p01");

//        case p02
        Assertions.assertEquals(false, verificadorDeSenhas.verificarConteudoSenha(regexCaracteresDigitos, "Jwd-dRF"),
                "Cenário " +
                "positivo: case p02");

    }
}