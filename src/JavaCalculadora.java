import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.Calculadora;



public class JavaCalculadora {


    private double operador1;
    private double operador2;
    private char escolha_da_operacao;
    private JPanel JavaCalculadora;
    private JTextField textDisplay;
    private JButton btLimpar;
    private JButton btNove;
    private JButton btSeis;
    private JButton btDois;
    private JButton btTres;
    private JButton btCinco;
    private JButton btOito;
    private JButton btnPonto;
    private JButton btnSoma;
    private JButton btnMult;
    private JButton btnSubtracao;
    private JButton btnDiv;
    private JButton btOperacao;
    private JButton btUm;
    private JButton btQuatro;
    private JButton btSete;
    private JButton btZero;

    private void getOperador(String btnText){
        escolha_da_operacao = btnText.charAt(0);
        operador1 = operador1 + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }
    public JavaCalculadora() {
        Calculadora calc = new Calculadora();

        operador2 = 0.0;
        operador1 = 0.0;
        btUm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btUmText = textDisplay.getText() + btUm.getText();
                textDisplay.setText(btUmText);

            }
        });
        btDois.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btDoisText = textDisplay.getText() + btDois.getText();
                textDisplay.setText(btDoisText);
            }
        });
        btTres.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btTresText = textDisplay.getText() + btTres.getText();
                textDisplay.setText(btTresText);
            }
        });
        btQuatro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btQuatroText = textDisplay.getText() + btQuatro.getText();
                textDisplay.setText(btQuatroText);
            }
        });
        btCinco.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btCincoText = textDisplay.getText() + btCinco.getText();
                textDisplay.setText(btCincoText);
            }
        });
        btSeis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btSeisText = textDisplay.getText() + btSeis.getText();
                textDisplay.setText(btSeisText);
            }
        });
        btSete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btSeteText = textDisplay.getText() + btSete.getText();
                textDisplay.setText(btSeteText);
            }
        });
        btOito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btOitoText = textDisplay.getText() + btOito.getText();
                textDisplay.setText(btOitoText);
            }
        });
        btNove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btNoveText = textDisplay.getText() + btNove.getText();
                textDisplay.setText(btNoveText);
            }
        });
        btZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btZeroText = textDisplay.getText() + btZero.getText();
                textDisplay.setText(btZeroText);
            }
        });
        btnPonto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                }
                else if (textDisplay.getText().contains(".")){
                    btnPonto.setEnabled(false);
                }
                else{
                    String btnPontoText = textDisplay.getText() + btnPonto.getText();
                    textDisplay.setText(btnPontoText);
                }
                btnPonto.setEnabled(true);
            }
        });
        btnSoma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnSoma.getText();
                getOperador(button_text);

            }
        });
        btnSubtracao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnSubtracao.getText();
                getOperador(button_text);
            }
        });
        btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDiv.getText();
                getOperador(button_text);
            }
        });
        btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMult.getText();
                getOperador(button_text);
            }
        });
        btOperacao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (escolha_da_operacao){
                    case '+':
                        calc.setOperador1(operador1);
                        operador2 = Double.parseDouble(textDisplay.getText());
                        calc.setOperador2(operador2);
                        calc.setOperacao(Calculadora.OPERACAO.ADICAO);
                        textDisplay.setText(Double.toString(calc.calcular()));
                        break;
                    case '-':
                        calc.setOperador1(operador1);
                        operador2 = Double.parseDouble(textDisplay.getText());
                        calc.setOperador2(operador2);
                        calc.setOperacao(Calculadora.OPERACAO.SUBTRACAO);
                        textDisplay.setText(Double.toString(calc.calcular()));
                        break;

                    case 'x':
                        calc.setOperador1(operador1);
                        operador2 = Double.parseDouble(textDisplay.getText());
                        calc.setOperador2(operador2);
                        calc.setOperacao(Calculadora.OPERACAO.MULTIPLICACAO);
                        textDisplay.setText(Double.toString(calc.calcular()));
                        break;
                    case '/':
                        calc.setOperador1(operador1);
                        operador2 = Double.parseDouble(textDisplay.getText());
                        calc.setOperador2(operador2);
                        calc.setOperacao(Calculadora.OPERACAO.DIVISAO);
                        textDisplay.setText(Double.toString(calc.calcular()));
                        break;
                }
                operador1 = 0.0;
            }

        });
        btLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                operador2 = 0;
                textDisplay.setText("");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora");
        frame.setContentPane(new JavaCalculadora().JavaCalculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
