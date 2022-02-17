package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resolucoes.QuestaoTresAnagramas;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoTresAnagramasTest {

    @Test
    void encontarAnagramas() {
        QuestaoTresAnagramas questaoTresAnagramas = new QuestaoTresAnagramas();

//        Cenário Negativo

        //case n01
        Assertions.assertNotEquals(1, questaoTresAnagramas.encontarAnagramas("abba"), "Cenário negativo: case n01");

        //case n02
        Assertions.assertNotEquals(4, questaoTresAnagramas.encontarAnagramas("ifailuhkqq"), "Cenário negativo: case n02");

        //case n03
        Assertions.assertNotEquals(9, questaoTresAnagramas.encontarAnagramas("kkkk"), "Cenário negativo: case n03");


//        Cenário Positivo

        //case p01
        Assertions.assertEquals(3, questaoTresAnagramas.encontarAnagramas("ifailuhkqq"), "Cenário positivo: case p01");

        //case p02
        Assertions.assertEquals(4, questaoTresAnagramas.encontarAnagramas("abba"), "Cenário positivo: case p02");

        //case p03
        Assertions.assertEquals(0, questaoTresAnagramas.encontarAnagramas("abcd"), "Cenário positivo: case p03");

        //case p04
        Assertions.assertEquals(5, questaoTresAnagramas.encontarAnagramas("cdcd"), "Cenário positivo: case p04");

    }
}