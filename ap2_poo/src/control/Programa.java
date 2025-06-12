package control;

import model.*;

public class Programa {
    public static void main(String[] args) {
        // pessoas responsaveis
        Instrutor instrutor1 = new Instrutor("Lucas", "lucasinstrutor@gmail.com","Desenvolvimento de Software", "ADS" );
        Instrutor instrutor2 = new Instrutor("rafael", "rafaelinstrutor@gmail.com","Desenvolvimento de IA", "CDIA" );
        Organizador organizador1 = new Organizador("Joao", "joaoorganizador@gmail.com", "Chefe");
        Organizador organizador2 = new Organizador("julio", "julioorganizador@gmail.com", "CEO");

        // local
        Sala sala1 = new Sala("Sala 1", 50, "F", "1", true);
        Sala sala2 = new Sala("Sala 2", 40, "H", "2", false);
        Auditorio auditorio1 = new Auditorio("Auditorio 1", 150, "A", true, false);
        Auditorio auditorio2 = new Auditorio("Auditorio 2", 160, "P", false, true);
        Laboratorio labInformatica = new Laboratorio("Lab de Informática 1", 30, "Bloco C", 30, "laboratorio de informatica");
        Laboratorio labQuimica = new Laboratorio("Lab de Química 2", 20, "Bloco B", 20, "laboratorio de quimica");

        //palestrantes
        Palestrante palestrante1 = new Palestrante("Thiago", "thiagopalestras@gmail.com", "IBMEC");
        Palestrante palestrante2 = new Palestrante("Anderson", "andersonpalestras@gmail.com", "IBMEC");

        //evento
        Palestra palestraIA = new Palestra("IA no dia a dia", "12/06/2025", "2 horas", 5000);
        Palestra palestraSoftware = new Palestra("Aprenda a desenvolver softwares", "19/06/2025", "2 horas", 7000);
        Minicurso minicrusoDev = new Minicurso("Desenvolvimento de Software", "15/06/2025 a 15/07/2025", "1 mes", 5000, instrutor1, 40);
        Minicurso minicrusoIA = new Minicurso("Desenvolvimento de IAs", "24/06/2025 a 24/07/2025", "1 mes", 8000, instrutor2, 50);
        Seminario pesquisaIA = new Seminario("Pesquisa sobre IA e seus beneficios", "17/06/2025","2 horas", 500, "IA", "Thiago", "Lucca");
        Seminario pesquisaMecatronica = new Seminario("Pesquisa sobre mecatronica", "18/06/2025","3 horas", 500, "mecatronica", "Clayton", "Guilherme");

        //participantes
        Participante participante1 = new Participante("Pedro Santos","123456789", "pedrosantos@gmail.com", "ADS" );
        Participante participante2 = new Participante("Bruno Henrique","987654321", "brunohenrique@gmail.com", "ES" );


    }
}

