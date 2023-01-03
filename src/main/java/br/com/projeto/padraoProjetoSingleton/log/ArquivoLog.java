package br.com.projeto.padraoProjetoSingleton.log;

import java.util.Objects;

public class ArquivoLog {
    
    private String textoLog;

    private static ArquivoLog log;

    private ArquivoLog() {
        this.textoLog = "Log gerado";
    }

    public static synchronized ArquivoLog getInstance() {

        if(log == null) {
            log = new ArquivoLog();
        }

        return log;

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(textoLog);
    }
    
}
