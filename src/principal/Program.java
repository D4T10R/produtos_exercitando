
import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor14;

import entities.ProdutosNovos;
import entities.ProdutosVelhos;
import entities.Tipo;
import entities.produtos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<produtos> produtos = new ArrayList<>();
        Date dataAtual = new Date();

        String strPath = "c:\\Users\\Leona\\Documents\\out";
        Boolean success = new File(strPath).mkdir();
        String strFile = strPath + "\\test.txt";
        
       


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(strFile))) {

            for (int n = 0; n < 5; n++) {

                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Preço: R$");
                Double preco = sc.nextDouble();
                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();
                System.out.print("Tipo: ");
                sc.next();
                String strTipo = sc.nextLine();
            
                System.out.println("Fabricação: ");
                Date fabricacao = sdf.parse(sc.nextLine());
                System.out.println("Vencimento: ");
                Date vencimento = sdf.parse(sc.nextLine());

                if (vencimento.compareTo(dataAtual) > 0 || vencimento.compareTo(dataAtual) == 0) {
                    produtos.add(new ProdutosNovos(nome, preco, quantidade, Tipo.valueOf(strTipo), fabricacao, vencimento));  // PROBLEMAS NO ENUM
                }
                else if (vencimento.compareTo(dataAtual) < 0) {
                    produtos.add(new ProdutosVelhos(nome, preco, quantidade, Tipo.valueOf(strTipo), fabricacao, vencimento));
                }
                

            }


        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ParseException e) {
            System.out.println("ERRO FABRICACAO SDF" + e.getMessage());
        }




        try (BufferedReader br = new BufferedReader(new FileReader(strFile))) {

            System.out.println("");
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

}