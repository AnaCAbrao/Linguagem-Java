public class Main4 {
    public static void main(String[] args) {
        int quantidadedeNotas;
        System.out.println("Entre com a quantidade de notas:");
        quantidadedeNotas = meuOb.nextInt();
        double[] notas = new double[quantidadedeNotas];
        for(int i = 0; i< quantidadedeNotas; i++){
            System.out.println("Entre com a nota");
            notas[i] = meuObj.nextDouble();
        }
        double total = 0;
        for(int j = 0; j< notas.length; j++){
            total = total + notas[j];
        }
        total = total/quantidadedeNotas;
        System.out.println("A média será:"+ total);
        meuObj.close();
    }
}
