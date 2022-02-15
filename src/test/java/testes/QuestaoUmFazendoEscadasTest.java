package testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import resolucoes.QuestaoUmFazendoEscadas;

import static org.junit.jupiter.api.Assertions.*;

class QuestaoUmFazendoEscadasTest {

    @Test
    void fazerEscada() {

        QuestaoUmFazendoEscadas questaoUmFazendoEscadas = new QuestaoUmFazendoEscadas();

//        Cenário Negativo

        //case n01
        Assertions.assertNotEquals(
                "     *\n" +
                        "    **\n" +
                        "   ***\n" +
                        "  ****\n" +
                        " *****\n" +
                        " ******", questaoUmFazendoEscadas.fazerEscada(6), "Cenário negativo: case n01");

        //case n02
        Assertions.assertNotEquals(
                "     *" +
                        "    **" +
                        "   ***" +
                        "  ****" +
                        " *****" +
                        "******", questaoUmFazendoEscadas.fazerEscada(6), "Cenário negativo: case n02");


//        Cenário Positivo

        //case p01
        Assertions.assertEquals(
                "  *\n" +
                        " **\n" +
                        "***", questaoUmFazendoEscadas.fazerEscada(3), "Cenário positivo: case p01");

        //case p02
        Assertions.assertEquals(
                "     *\n" +
                        "    **\n" +
                        "   ***\n" +
                        "  ****\n" +
                        " *****\n" +
                        "******", questaoUmFazendoEscadas.fazerEscada(6), "Cenário positivo: case p02");

        //case p03
        Assertions.assertEquals(
                "      *\n" +
                        "     **\n" +
                        "    ***\n" +
                        "   ****\n" +
                        "  *****\n" +
                        " ******\n" +
                        "*******", questaoUmFazendoEscadas.fazerEscada(7), "Cenário positivo: case p03");
    }
}