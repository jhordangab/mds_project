package mdsproject;

/**
 *
 * @author jhordangabriel
 */
public class UsuarioDb {

    public Aluno[] alunos;
    public Professor[] professores;

    public void start() {

        alunos = new Aluno[7];
        professores = new Professor[1];
        
        for (int indice = 0; indice < 7; indice++) {
            alunos[indice] = new Aluno();
            alunos[indice].setId(indice);
        }
        
        alunos[0].setNome("Chaves");
        alunos[0].setLogin("chaves");
        alunos[0].setSenha("chaveses");
        alunos[0].setAnoEntrada(2015);
        alunos[0].setCurso("Engenharia de Software");
        alunos[0].setHorario('N');

        alunos[1].setNome("Chiquinha");
        alunos[1].setLogin("chiquinha");
        alunos[1].setSenha("chiquinhaes");
        alunos[1].setAnoEntrada(2015);
        alunos[1].setCurso("Engenharia de Software");
        alunos[1].setHorario('N');

        alunos[2].setNome("Kiko");
        alunos[2].setLogin("kiko");
        alunos[2].setSenha("kikoes");
        alunos[2].setAnoEntrada(2015);
        alunos[2].setCurso("Engenharia de Software");
        alunos[2].setHorario('N');

        alunos[3].setNome("Dona Florinda");
        alunos[3].setLogin("florinda");
        alunos[3].setSenha("florindaes");
        alunos[3].setAnoEntrada(2015);
        alunos[3].setCurso("Engenharia de Software");
        alunos[3].setHorario('N');

        alunos[4].setNome("Seu Madruga");
        alunos[4].setLogin("madruga");
        alunos[4].setSenha("madrugaes");
        alunos[4].setAnoEntrada(2015);
        alunos[4].setCurso("Engenharia de Software");
        alunos[4].setHorario('N');

        alunos[5].setNome("Seu Barriga");
        alunos[5].setLogin("barriga");
        alunos[5].setSenha("barrigaes");
        alunos[5].setAnoEntrada(2015);
        alunos[5].setCurso("Engenharia de Software");
        alunos[5].setHorario('N');

        alunos[6].setNome("Dona Clotildes");
        alunos[6].setLogin("clotildes");
        alunos[6].setSenha("clotildeses");
        alunos[6].setAnoEntrada(2015);
        alunos[6].setCurso("Engenharia de Software");
        alunos[6].setHorario('N');

        professores[0] = new Professor();
        professores[0].setId(0);
        professores[0].setNome("Professor Girafales");
        professores[0].setLogin("girafales");
        professores[0].setSenha("girafaleses");

    }

    public Aluno[] getAlunos() {
        return this.alunos;
    }

    public Professor[] getProfessores() {
        return this.professores;
    }
}
