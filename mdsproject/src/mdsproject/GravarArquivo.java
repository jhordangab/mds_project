/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mdsproject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class GravarArquivo {
    private static Scanner s;

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("file.txt");

        Charset utf8 = StandardCharsets.UTF_8;

        BufferedWriter escritor = null;

        escritor = Files.newBufferedWriter(path, utf8);

        s = new Scanner(System.in);

        escritor.write(s.nextLine());

        escritor.flush();   
        
        System.out.println("Arquivo Salvo!");     
    }
     
}
