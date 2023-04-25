package edu.joao.segunda;
public class Teste1Classe {
    public static void main (String [] args){

        String primeiroNome = "João";
        String segundoNome = "Pedro";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print (nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
