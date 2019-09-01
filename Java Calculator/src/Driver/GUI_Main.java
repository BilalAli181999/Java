
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OFFICE
 */
public class GUI_Main {

    JFrame jf;
    JTextField jtfU, jtfL, jtfH;
    JButton[] jb = new JButton[29];
    BtnHandler btnHandler = new BtnHandler(this);

    public GUI_Main() {
        initGUI();
    }

    public void initGUI() {
        int i, x_axis = 10, y_axis = 45, width = 300, height = 25;
        jf = new JFrame("Calculaor");
        jf.setLayout(null);
        jf.setBackground(Color.white);

        jtfH = new JTextField();
        jtfU = new JTextField();
        jtfL = new JTextField();

        jtfH.setBounds(5, 10, 300, 30);
        jtfH.setEditable(false);
        jtfH.setBorder(BorderFactory.createEmptyBorder());
        jtfH.setEditable(false);
        jtfH.setText("Standard");
        jtfH.setFocusable(false);

        jtfH.setFont(new Font("Segoe UI Historic", Font.BOLD, 20));
        jtfU.setBounds(x_axis, y_axis, width, height);
        jtfU.setEditable(false);
        jtfU.setFocusable(false);
        jtfU.setHorizontalAlignment(JTextField.RIGHT);
        jtfU.setBorder(BorderFactory.createEmptyBorder());
        jtfU.setFont(new Font("Segoe UI Historic", Font.PLAIN, 13));
        jtfL.setBounds(x_axis, y_axis + height, width, height + 45);
        jtfL.setText("0");
        jtfL.setFocusable(false);
        jtfL.setEditable(false);
        jtfL.setHorizontalAlignment(JTextField.RIGHT);
        jtfL.setBorder(BorderFactory.createEmptyBorder());
        jtfL.setFont(new Font("Segoe UI Historic", Font.BOLD, 44));
        jf.add(jtfH);
        jf.add(jtfU);
        jf.add(jtfL);

        x_axis = 5;
        y_axis = 142;
        width = 62;
        height = 32;
        for (i = 0; i < 5; i++) {
            jb[i] = new JButton();
            jb[i].setBounds(x_axis, y_axis, width, height);
            x_axis += width;
            jb[i].addActionListener(btnHandler);
            jf.add(jb[i]);
            jb[i].setBorder(BorderFactory.createEmptyBorder());
            jb[i].setBackground(Color.white);
            jb[i].setForeground(new Color(175, 58, 166));
            jb[i].setFont(new Font("Segoe UI Historic", Font.BOLD, 12));

        }
        jb[0].setText("MC");
        jb[1].setText("MR");
        jb[0].setEnabled(false);
        jb[1].setEnabled(false);
        jb[2].setText("M+");
        jb[3].setText("M-");
        jb[4].setText("MS");

        int l, m, n, o, p;
        x_axis = 5;
        y_axis = 176;
        width = 78;
        height = 53;

        for (l = i; l < 9; l++) {
            jb[l] = new JButton();
            jb[l].setBounds(x_axis, y_axis, width, height);
            x_axis += width;
            jb[l].addActionListener(btnHandler);
            jf.add(jb[l]);
            jb[l].setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));
            jb[l].setBorder(BorderFactory.createEmptyBorder());
            jb[l].setBackground(Color.WHITE);
        }
        jb[5].setText("%");
        jb[6].setText("_/");
        jb[7].setText("x^2");
        jb[8].setText("1/x");
        x_axis = 5;
        y_axis += height;
        for (m = l; m < 13; m++) {
            jb[m] = new JButton();
            jb[m].setBounds(x_axis, y_axis, width, height);
            x_axis += width;
            jb[m].addActionListener(btnHandler);
            jf.add(jb[m]);
            jb[m].setBorder(BorderFactory.createEmptyBorder());
            jb[m].setBackground(Color.WHITE);
            jb[m].setFont(new Font("Segoe UI Symbol", Font.PLAIN, 18));

        }
        jb[9].setText("CE");
        jb[10].setText("C");
        jb[11].setText("<<");
        jb[12].setText("/");
        x_axis = 5;
        y_axis += height;
        for (n = m; n < 17; n++) {
            jb[n] = new JButton();
            jb[n].setBounds(x_axis, y_axis, width, height);
            x_axis += width;
            jb[n].addActionListener(btnHandler);

            jf.add(jb[n]);
            jb[n].setBorder(BorderFactory.createEmptyBorder());
            jb[n].setFont(new Font("Segoe UI Historic", Font.BOLD, 22));

        }
        jb[13].setText("7");
        jb[14].setText("8");
        jb[15].setText("9");
        jb[16].setText("x");
        jb[16].setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
        jb[13].setBackground(new Color(175, 58, 166));
        jb[14].setBackground(new Color(175, 58, 166));
        jb[15].setBackground(new Color(175, 58, 166));
        jb[16].setBackground(Color.WHITE);
        jb[13].setForeground(Color.WHITE);
        jb[14].setForeground(Color.WHITE);
        jb[15].setForeground(Color.WHITE);
        x_axis = 5;
        y_axis += height;
        for (o = n; o < 21; o++) {
            jb[o] = new JButton();
            jb[o].setBounds(x_axis, y_axis, width, height);
            x_axis += width;
            jb[o].addActionListener(btnHandler);
            jf.add(jb[o]);
            jb[o].setBorder(BorderFactory.createEmptyBorder());
            jb[o].setFont(new Font("Segoe UI Historic", Font.BOLD, 22));

        }
        jb[17].setText("4");
        jb[18].setText("5");
        jb[19].setText("6");
        jb[20].setText("-");
        jb[20].setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
        jb[17].setBackground(new Color(175, 58, 166));
        jb[18].setBackground(new Color(175, 58, 166));
        jb[19].setBackground(new Color(175, 58, 166));
        jb[20].setBackground(Color.WHITE);
        jb[17].setForeground(Color.WHITE);
        jb[18].setForeground(Color.WHITE);
        jb[19].setForeground(Color.WHITE);

        x_axis = 5;
        y_axis += height;
        for (p = o; p < 25; p++) {
            jb[p] = new JButton();
            jb[p].setBounds(x_axis, y_axis, width, height);
            x_axis += width;
            jb[p].addActionListener(btnHandler);
            jf.add(jb[p]);
            jb[p].setBorder(BorderFactory.createEmptyBorder());
            jb[p].setFont(new Font("Segoe UI Historic", Font.BOLD, 22));

        }

        jb[21].setText("1");
        jb[22].setText("2");
        jb[23].setText("3");
        jb[24].setText("+");
        jb[24].setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
        jb[21].setBackground(new Color(175, 58, 166));
        jb[22].setBackground(new Color(175, 58, 166));
        jb[23].setBackground(new Color(175, 58, 166));
        jb[24].setBackground(Color.WHITE);
        jb[21].setForeground(Color.WHITE);
        jb[22].setForeground(Color.WHITE);
        jb[23].setForeground(Color.WHITE);

        x_axis = 5;
        y_axis += height;
        for (int q = p; q < 29; q++) {
            jb[q] = new JButton();
            jb[q].setBounds(x_axis, y_axis, width, height);
            x_axis += width;
            jb[q].addActionListener(btnHandler);
            jf.add(jb[q]);
            jb[q].setBackground(Color.WHITE);
            jb[q].setBorder(BorderFactory.createEmptyBorder());
            jb[q].setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));

        }

        jb[25].setText("!");
        jb[26].setText("0");
        jb[26].setFont(new Font("Segoe UI Historic", Font.BOLD, 22));
        jb[26].setBackground(new Color(175, 58, 166));
        jb[26].setForeground(Color.white);
        jb[27].setText(".");
        jb[27].setFont(new Font("Segoe UI Symbol", Font.BOLD, 22));
        jb[28].setText("=");

        jf.setSize(336, 538);
        jf.setLocation(500, 100);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }

}
