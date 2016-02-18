package mdsproject;

/**
 *
 * @author jhordangabriel
 */
public class ConteudoDb {

    public Conteudo[] conteudos;

    public void start() {

        for (int indice = 0; indice < 10; indice++) {
            conteudos[indice] = new Conteudo();
            conteudos[indice].setId(indice);
        }
        
        conteudos[0].setTitulo("Aprenda Java");
        conteudos[0].setConteudo("Aprenda Java, a linguagem de programação mais "
                + "usada no mundo, e os princípios da programação orientada a "
                + "objetos. Este material gratuito é o que usamos no curso de "
                + "Java da Caelum e esperamos que seja útil no seu aprendizado. "
                + "Não deixe também de compartilhar essa apostila com seus "
                + "amigos.");

        conteudos[1].setTitulo("O que oferece a Caelum");
        conteudos[1].setConteudo("A Caelum oferece cursos de TI desde 2004 em "
                + "todo o Brasil. É conhecida por seus cursos nas áreas de"
                + " Java, Ruby, mobile, front-end, .NET e agile, além de cursos "
                + "online. Temos diversas apostilas abertas para download e "
                + "consulta gratuita. E, se estiver interessado em nossos "
                + "cursos, não deixe de entrar em contato.");

        conteudos[2].setTitulo("O que necessita");
        conteudos[2].setConteudo("Muitos livros, ao passar dos capítulos,"
                + " mencionam todos os detalhes da linguagem juntamente com "
                + "seus princípios básicos. Isso acaba criando muita "
                + "confusão, em especial porque o estudante não consegue "
                + "distinguir exatamente o que é primordial aprender no "
                + "início, daquilo que pode ser estudado mais adiante.");

        conteudos[3].setTitulo("Classes Abstratas");
        conteudos[3].setConteudo("Se uma classe abstrata deve ou não ter "
                + "ao menos um método abstrato, se o if só aceita argumentos"
                + " booleanos e todos os detalhes sobre classes internas,"
                + " realmente não devem se tornar preocupações para aquele "
                + "cujo objetivo primário é aprender Java. Esse tipo de "
                + "informação será adquirida com o tempo, e não é necessário"
                + " no início.");

        conteudos[4].setTitulo("O que tem no curso");
        conteudos[4].setConteudo("Neste curso, separamos essas informações"
                + " em quadros especiais, já que são informações extras. "
                + "Ou então, apenas citamos num exercício e deixamos para "
                + "o leitor procurar informações se for de seu interesse.");

        conteudos[5].setTitulo("O que falta mencionar");
        conteudos[5].setConteudo("Por fim, falta mencionar algo sobre a "
                + "prática, que deve ser tratada seriamente: todos os "
                + "exercícios são muito importantes e os desafios podem "
                + "ser feitos quando o curso terminar. De qualquer maneira"
                + " recomendamos aos alunos estudarem em casa, e praticarem"
                + " bastante código e variações.");

        conteudos[6].setTitulo("Exercicios do curso");
        conteudos[6].setConteudo("Os exercícios do curso variam de práticos"
                + " até pesquisas na Internet, ou mesmo consultas sobre"
                + " assuntos avançados em determinados tópicos para incitar"
                + " a curiosidade do aprendiz na tecnologia.");

        conteudos[7].setTitulo("O que existem");
        conteudos[7].setConteudo("Existem também, em determinados capítulos, "
                + "uma série de desafios. Eles focam mais no problema "
                + "computacional que na linguagem, porém são uma excelente "
                + "forma de treinar a sintaxe e, principalmente, familiarizar"
                + " o aluno com a biblioteca padrão Java, além de proporcionar"
                + " um ganho na velocidade de desenvolvimento.");

        conteudos[8].setTitulo("Sobre as duvidas");
        conteudos[8].setConteudo("Para tirar dúvidas dos exercícios, "
                + "ou de Java em geral, recomendamos o fórum do GUJ"
                + " (http://www.guj.com.br/), onde sua dúvida será "
                + "respondida prontamente. O GUJ foi fundado por "
                + "desenvolvedores da Caelum, e hoje conta com mais "
                + "de um milhão de mensagens.");

        conteudos[9].setTitulo("Humanas");
        conteudos[9].setConteudo("Fora isso, sinta-se à vontade para entrar"
                + " em contato com seu instrutor para tirar todas as dúvidas"
                + " que surgirem durante o curso.");

    }

    public Conteudo[] getConteudos() {
        return this.conteudos;
    }

}
