package advancePratic.advancePratic09;
import javax.swing.JOptionPane;
public class JOptionPanekonu {

    public static void main(String[] args) {
        String strvize=JOptionPane.showInputDialog("Lutfen Vize Notunuzu Giriniz");//input verialir
       int vizenotu=Integer.parseInt(strvize);
       if (vizenotu<0 || vizenotu>100){
           strvize=JOptionPane.showInputDialog("Lutfen Vize Notunuzu Tekrar Giriniz");
           vizenotu=Integer.parseInt(strvize);
       }
       String strfinal=JOptionPane.showInputDialog("Lutfen Final Notunuzu Giriniz");
       int finalNotu=Integer.parseInt(strfinal);
        if (finalNotu<0 || vizenotu>100) {
            strfinal = JOptionPane.showInputDialog("Lutfen Final Notunuzu Tekrar Giriniz");
            finalNotu = Integer.parseInt(strfinal);
        }
         int not=(int)(vizenotu*0.4+finalNotu*0.6);
            JOptionPane.showMessageDialog(null,not,"NOT Ortalamaniz",JOptionPane.INFORMATION_MESSAGE);






    }




}
