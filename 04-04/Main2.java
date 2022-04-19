import javax.swing.JOptionPane;
public class Main2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");
        String nomeCompleto = nome+" "+ sobreNome;
        JOptionPane.showInputDialog(null, "Nome Completo: "+nomeCompleto, "Informção", JOptionPane.INFORMATION_MESSAGE);
    }
}
