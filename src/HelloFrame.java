import javax.swing.*;

public class HelloFrame extends JFrame{
    private JPanel mainPanel;

    public HelloFrame(){
        add(mainPanel);

        setTitle("Hello Guys");
        setSize(450,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
