public class Main2 {
    String idiomas;

    Main2 (String falado){
        idiomas = falado;
        System.out.println(idiomas + " É falado no mundo");

    }
    public static void main2(String[] args){
        Main obg1 = new Main2("Alemão");
        Main obj2 = new Main2("Inglês";)
        Main obj3 = new Main2("Português");
        System.out.println(obg1.idiomas);
    }
}
