import java.util.Scanner;

public class Tri {
    public static void main(String[] args){
        Scanner meuObj = new Scanner(System.in); 
        //cria objeto
        System.out.println("Programa lados de um retângulo");
        System.out.println("Entre com o primeiro valor do lado: ");
        Double lado1 = meuObj.nextDouble();
        System.out.println("Entre com o valor do segundo lado: ");
        Double lado2 = meuObj.nextDouble();
        Double areaTriangulo = lado1 * lado2;
      System.out.println("a área do triangulo é:" + areaTriangulo);


      System.out.println(********);
      System.out.println("Programa área de um triângulo");
      System.out.println("Entre com o valor da base");
      Double base1 = meuObj.nextDouble();
      Double areaTriangulo = (base1 * altura1) / 2;
      System.out.prontln("Area do triângulo é: " + areaTriangulo);

      meuObj.clase();

    }
}