import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;





public class oddEven  {
    
  
    


    public oddEven() {
        JFrame jf = new JFrame("Odd or Even");
        jf.setLayout(null);
        jf.setSize(300,300);
        jf.setLocation(500,50);
        JTextField textField_Two = new JTextField();
        JTextField textField=new JTextField();
        JButton okButton = new JButton("Check");
        textField.setSize(275,30);
        textField.setLocation(5,5);

        textField_Two.setSize(275,30);
        textField_Two.setLocation(5,40);
        
        okButton.setSize(80,80);
        okButton.setLocation(100,150);
        

        

        jf.setVisible(true);
        jf.add(textField);
        jf.add(textField_Two);
        jf.add(okButton);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws Exception {
        new oddEven();
    }
    
  
    
}
