import javax.swing.*;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener{
    private JPanel mainPanel;
    private JTextArea myTextArea;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JLabel label1;



    public MainGUIWindow(){
        createUIComponents();
    }


    public void actionPerformed(actionEvent e){
        Object source = e.getSource();
        if(source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();

            if(text.equals("Send")){
                myTextArea.append("button 1 clicked");
            } else {
                myTextArea.append("button 2 clicked");
            }
        }

    }

    public void keyTyped(keyEvent e){

    }
    public void keyEvent(keyEvene e){

    }
    public void keyReleased(keyEvent e){

    }



    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("My GUI");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myTextArea.setLineWrap(true);
        button1.addActionListener(this);
        button2.addActionListener(this);
        textField1.addKeyListener(this);
        setVisible(true);

    }
}
