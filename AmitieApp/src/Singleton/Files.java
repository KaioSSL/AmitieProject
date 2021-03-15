//Renato Lopes - 2020/2
package Singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Files {
    public static Files instance;

    public String readfile() {
        String data = "";
        try {
            File myObj = new File("UltimoNumero.txt");
            Scanner myReader = new Scanner(myObj);
            data = myReader.nextLine();
            myReader.close();
            System.out.println("Numero recuperado com sucesso!");
            return (data);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não existe.");
            // e.printStackTrace();
        }
        return (data);
    }

    public void writefile(String numero) {
        try {
            FileWriter myWriter = new FileWriter("UltimoNumero.txt");
            myWriter.write(numero);
            myWriter.close();
            System.out.println("Numero salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Arquivo não existe.");
            // e.printStackTrace();
        }
    }

    public void createfile() {
        try {
            File myObj = new File("UltimoNumero.txt");
            if (myObj.createNewFile()) {
                System.out.println("Arquivo criado: " + myObj.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Um erro ocorreu.");
            // e.printStackTrace();
        }
    }
}
