public class Semana {
    public static void main(String[] args) {
        Scanner meuObj = new Scanner(System.in);
        System.out.println("Entre com o dia da semana:");
        int x = meuObj.nextInt();
        if ((dia >= 1) && (dia <=7)){
           if(dia == 1){
               System.out.println("Domingo");
           }
           if(dia == 2){
               System.out.println("Segunda");
           }
           if(dia == 3){
            System.out.println("Terça");
           }
           if(dia == 4){
            System.out.println("Quarta");
           }
           if(dia == 5){
            System.out.println("Quinta");
           }  
        }
        
    }
    

}
