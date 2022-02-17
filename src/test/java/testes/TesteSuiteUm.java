package testes;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectClasses({QuestaoUmFazendoEscadasTest.class, QuestaoDoisVerificadorDeSenhasTest.class,
        QuestaoTresAnagramasTest.class})
@SuiteDisplayName("Suite para casos de teste das três questões")
public class TesteSuiteUm {
}
