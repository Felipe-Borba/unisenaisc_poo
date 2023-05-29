import javax.swing.JFrame;

public class GUIDemo {

    public static void main(String[] args) {
        JFrame frame = null;

//        frame = new JFrame();
//        frame.setTitle("Demo Componentes Swing");
//        frame.setSize(640, 480);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // PrincipalFrame
//		frame = new PrincipalFrame();

        // PrincipalFrame com um botão (BorderLayout - default)
//		frame = new ButtonFrame();

        // BorderLayout
//		frame = new BorderLayoutFrame();

        // FlowLayout
//		frame = new FlowLayoutFrame();

        // GridLayout
//		frame = new GridLayoutFrame();

        // BoxLayout
//		frame = new BoxLayoutFrame();

        // GridBagLayout
//		frame = new GridBagLayoutFrame();

        // Null Layout
//		frame = new NullLayoutFrame();

        // JPanel
//		frame = new PanelFrame();

        // Input Fields
//		frame = new InputFieldsFrame();

        // Action Event
		frame = new ActionEventFrame();

        // Item Event
//		frame = new ItemEventFrame();

        // List Selection Event
//		frame = new ListSelectionEventFrame();

        frame.setVisible(true);
    } // fim do método main

} // fim da classe GUIDemo
