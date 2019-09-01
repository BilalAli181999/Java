
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author OFFICE
 */
public class BtnHandler implements ActionListener {

    double firstNum, scndNum, result;
    String operator, answer;
    ;
    GUI_Main gui;

    public BtnHandler(GUI_Main gui) {
        this.gui = gui;
    }

    public String[] readFromFile() {
        FileReader fr = null;
        int count = 0;
        try {
            File f = new File("Calculator.dup");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String[] line = new String[10];
            int i = 0;
            while (br.ready()) {
                line[i] = br.readLine();
                i++;
            }
            return line;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        } finally {
            try {
                fr.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    public void writeIntoFile(String msg) {
        FileWriter fw = null;
        try {
            File f = new File("Calculator.dup");
            fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(f);
            pw.write(msg);
            pw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gui.jb[0]) {
            gui.jtfL.setText("0");
            writeIntoFile("0");
            gui.jb[0].setEnabled(false);
            gui.jb[1].setEnabled(false);
        } else if (e.getSource() == gui.jb[1]) {
            String[] name = readFromFile();
            gui.jtfL.setText(name[0]);
        } else if (e.getSource() == gui.jb[2]) {
            gui.jb[0].setEnabled(true);
            gui.jb[1].setEnabled(true);
            String[] name = readFromFile();
            firstNum = Double.parseDouble(name[0]);
            scndNum = Double.parseDouble(gui.jtfL.getText());
            result = firstNum + scndNum;
            writeIntoFile(String.valueOf(result));
        } else if (e.getSource() == gui.jb[3]) {
            gui.jb[0].setEnabled(true);
            gui.jb[1].setEnabled(true);
            String[] name = readFromFile();
            firstNum = Double.parseDouble(name[0]);
            scndNum = Double.parseDouble(gui.jtfL.getText());
            result = firstNum - scndNum;
            writeIntoFile(String.valueOf(result));

        } else if (e.getSource() == gui.jb[4]) {
            gui.jb[0].setEnabled(true);
            gui.jb[1].setEnabled(true);
            String msg[] = readFromFile();
            writeIntoFile(gui.jtfL.getText());
            int i = 0;
            while (msg[i] != null) {
                writeIntoFile(msg[i]+"\n");
                i++;
            }

        } else if (e.getSource() == gui.jb[5]) {
            firstNum = Double.parseDouble(gui.jtfL.getText());
            gui.jtfU.setText(gui.jtfL.getText() + " Mod");
            gui.jtfL.setText("");
            operator = "%";
        } else if (e.getSource() == gui.jb[6]) {
            if (gui.jtfL.getText().isEmpty()) {
                if (gui.jtfL.getText().isEmpty()) {
                    gui.jtfU.setText(gui.jtfU.getText() + "sqrt/(" + firstNum + ")");
                    result = Math.sqrt(firstNum);
                    if (String.valueOf(result).length() > 12) {

                        gui.jtfL.setText(String.valueOf(result).substring(0, 12));
                    } else {
                        gui.jtfL.setText(String.valueOf(result));
                    }
                }
            } else {
                firstNum = Double.parseDouble(gui.jtfL.getText());
                gui.jtfU.setText("sqrt(" + firstNum + ")");
                result = Math.sqrt(firstNum);
                if (String.valueOf(result).length() > 12) {

                    gui.jtfL.setText(String.valueOf(result).substring(0, 12));
                } else {
                    gui.jtfL.setText(String.valueOf(result));
                }
            }

        } else if (e.getSource() == gui.jb[7]) {
            if (gui.jtfL.getText().isEmpty()) {
                gui.jtfU.setText(gui.jtfU.getText() + "sqr/(" + firstNum + ")");
                result = Math.pow(firstNum, 2);
                if (String.valueOf(result).length() > 12) {

                    gui.jtfL.setText(String.valueOf(result).substring(0, 12));
                } else {
                    gui.jtfL.setText(String.valueOf(result));
                }
            } else {
                firstNum = Double.parseDouble(gui.jtfL.getText());
                gui.jtfU.setText("sqr(" + firstNum + ")");
                result = Math.pow(firstNum, 2);
                if (String.valueOf(result).length() > 12) {

                    gui.jtfL.setText(String.valueOf(result).substring(0, 12));
                } else {
                    gui.jtfL.setText(String.valueOf(result));
                }
            }
        } else if (e.getSource() == gui.jb[8]) {
            if (gui.jtfL.getText().isEmpty()) {
                gui.jtfU.setText(gui.jtfU.getText() + "1/(" + firstNum + ")");
                if (firstNum == 0) {
                    gui.jtfL.setText("Cannot divide by zero");
                    for (int x = 0; x <= 8; x++) {
                        gui.jb[x].setEnabled(false);
                    }
                    gui.jb[12].setEnabled(false);
                    gui.jb[16].setEnabled(false);
                    gui.jb[20].setEnabled(false);
                    gui.jb[24].setEnabled(false);
                    gui.jb[25].setEnabled(false);
                    gui.jb[27].setEnabled(false);
                } else {
                    result = 1 / firstNum;
                    if (String.valueOf(result).length() > 12) {

                        gui.jtfL.setText(String.valueOf(result).substring(0, 12));
                    } else {
                        gui.jtfL.setText(String.valueOf(result));
                    }
                }
            } else {
                firstNum = Double.parseDouble(gui.jtfL.getText());
                gui.jtfU.setText("1/(" + String.valueOf(firstNum) + ")");
                if (firstNum == 0) {
                    gui.jtfL.setText("Cannot divide by zero");
                    for (int x = 0; x <= 8; x++) {
                        gui.jb[x].setEnabled(false);
                    }
                    gui.jb[12].setEnabled(false);
                    gui.jb[16].setEnabled(false);
                    gui.jb[20].setEnabled(false);
                    gui.jb[24].setEnabled(false);
                    gui.jb[25].setEnabled(false);
                    gui.jb[27].setEnabled(false);
                } else {
                    result = 1 / firstNum;
                    if (String.valueOf(result).length() > 12) {

                        gui.jtfL.setText(String.valueOf(result).substring(0, 12));
                    } else {
                        gui.jtfL.setText(String.valueOf(result));
                    }
                }
            }
        } else if (e.getSource() == gui.jb[9]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
            }
            gui.jtfL.setText("0");
        } else if (e.getSource() == gui.jb[10]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
            }
            gui.jtfU.setText("");
            gui.jtfL.setText("0");
        } else if (e.getSource() == gui.jb[11]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfL.setText("0");
                gui.jtfU.setText("");
            } else {
                if (gui.jtfL.getText().length() > 1) {
                    int size = gui.jtfL.getText().length();
                    String s = gui.jtfL.getText();
                    gui.jtfL.setText(s.substring(0, size - 1));
                } else {
                    gui.jtfL.setText("0");
                }
            }
        } else if (e.getSource() == gui.jb[12]) {
            if (!gui.jtfU.getText().isEmpty() && gui.jtfU.getText().endsWith(operator)) {
                gui.jtfU.setText(gui.jtfU.getText().substring(0, gui.jtfU.getText().length() - 1) + "-");
            } else {
                gui.jtfU.setText(gui.jtfL.getText() + "/");
                firstNum = Double.parseDouble(gui.jtfL.getText());
                gui.jtfL.setText("");
            }
            operator = "/";
        } else if (e.getSource() == gui.jb[13]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {
                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("7");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "7");
                }
            }
        } else if (e.getSource() == gui.jb[14]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {
                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("8");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "8");
                }
            }
        } else if (e.getSource() == gui.jb[15]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {

                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("9");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "9");
                }

            }
        } else if (e.getSource() == gui.jb[16]) {
            if (!gui.jtfU.getText().isEmpty() && gui.jtfU.getText().endsWith(operator)) {
                gui.jtfU.setText(gui.jtfU.getText().substring(0, gui.jtfU.getText().length() - 1) + "-");
            } else {
                gui.jtfU.setText(gui.jtfL.getText() + "*");
                firstNum = Double.parseDouble(gui.jtfL.getText());
                gui.jtfL.setText("");
            }
            operator = "*";
        } else if (e.getSource() == gui.jb[17]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {

                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("4");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "4");
                }
            }
        } else if (e.getSource() == gui.jb[18]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {

                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("5");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "5");
                }
            }

        } else if (e.getSource() == gui.jb[19]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {

                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("6");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "6");
                }
            }
        } else if (e.getSource() == gui.jb[20]) {
            if (!gui.jtfU.getText().isEmpty() && gui.jtfU.getText().endsWith(operator)) {
                gui.jtfU.setText(gui.jtfU.getText().substring(0, gui.jtfU.getText().length() - 1) + "-");
            } else {
                gui.jtfU.setText(gui.jtfL.getText() + "-");
                firstNum = Double.parseDouble(gui.jtfL.getText());
                gui.jtfL.setText("");
            }
            operator = "-";
        } else if (e.getSource() == gui.jb[21]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {

                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("1");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "1");
                }
            }

        } else if (e.getSource() == gui.jb[22]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {

                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("2");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "2");
                }
            }

        } else if (e.getSource() == gui.jb[23]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {

                if (gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText())) {
                    gui.jtfL.setText("3");
                } else {
                    gui.jtfL.setText(gui.jtfL.getText() + "3");
                }
            }
        } else if (e.getSource() == gui.jb[24]) {
            if (!gui.jtfU.getText().isEmpty() && gui.jtfU.getText().endsWith(operator)) {
                gui.jtfU.setText(gui.jtfU.getText().substring(0, gui.jtfU.getText().length() - 1) + "+");
            } else {
                gui.jtfU.setText(gui.jtfL.getText() + "+");
                firstNum = Double.parseDouble(gui.jtfL.getText());
                gui.jtfL.setText("");
            }
            operator = "+";

        } else if (e.getSource() == gui.jb[25]) {
            if (!gui.jtfL.getText().isEmpty()) {

                String s = gui.jtfL.getText();
                if (!s.startsWith("0")) {
                    if (s.startsWith("-")) {
                        if (!gui.jtfU.getText().isEmpty()) {
                            gui.jtfU.setText("negate(" + gui.jtfU.getText() + ")");
                        } else {
                            gui.jtfU.setText("negate(" + s + ")");
                        }
                        gui.jtfL.setText(s.substring(1));
                    } else {
                        if (!gui.jtfU.getText().isEmpty()) {
                            gui.jtfU.setText("negate(" + gui.jtfU.getText() + ")");
                        } else {
                            gui.jtfU.setText("negate(" + s + ")");
                        }
                        gui.jtfL.setText("-" + s);
                    }
                } else {
                    gui.jtfU.setText("");
                }

            }
        } else if (e.getSource() == gui.jb[26]) {
            if (!(gui.jtfL.getText().length() == 1 && "0".equals(gui.jtfL.getText()))) {
                gui.jtfL.setText(gui.jtfL.getText() + "0");
            }
        } else if (e.getSource() == gui.jb[27]) {
            if (!gui.jtfL.getText().contains(".")) {
                gui.jtfL.setText(gui.jtfL.getText() + ".");
            }
            gui.jtfU.setText("");
        } else if (e.getSource() == gui.jb[28]) {
            if (!gui.jb[2].isEnabled()) {
                for (int y = 2; y < 29; y++) {
                    gui.jb[y].setEnabled(true);
                }
                gui.jtfU.setText("");
                gui.jtfL.setText("0");
            } else {
                scndNum = Double.parseDouble(gui.jtfL.getText());
                if (operator != null) {
                    switch (operator) {
                        case "+":
                            result = firstNum + scndNum;
                            gui.jtfL.setText(String.valueOf(result));
                            gui.jtfU.setText("");
                            break;
                        case "-":
                            result = firstNum - scndNum;
                            gui.jtfL.setText(String.valueOf(result));
                            gui.jtfU.setText("");
                            break;
                        case "*":
                            result = firstNum * scndNum;
                            gui.jtfL.setText(String.valueOf(result));
                            gui.jtfU.setText("");
                            break;
                        case "/":
                            if (scndNum == 0) {
                                for (int x = 0; x <= 8; x++) {
                                    gui.jb[x].setEnabled(false);
                                }
                                gui.jb[12].setEnabled(false);
                                gui.jb[16].setEnabled(false);
                                gui.jb[20].setEnabled(false);
                                gui.jb[24].setEnabled(false);
                                gui.jb[25].setEnabled(false);
                                gui.jb[27].setEnabled(false);
                            } else {
                                result = firstNum / scndNum;
                                gui.jtfL.setText(String.valueOf(result));
                                gui.jtfU.setText("");
                            }
                            break;
                        case "%":
                            if (scndNum == 0) {
                                for (int x = 0; x <= 8; x++) {
                                    gui.jb[x].setEnabled(false);
                                }
                                gui.jb[12].setEnabled(false);
                                gui.jb[16].setEnabled(false);
                                gui.jb[20].setEnabled(false);
                                gui.jb[24].setEnabled(false);
                                gui.jb[25].setEnabled(false);
                                gui.jb[27].setEnabled(false);
                            }
                            scndNum = Double.parseDouble(gui.jtfL.getText());
                            result = firstNum % scndNum;
                            gui.jtfL.setText(String.valueOf(result));
                            gui.jtfU.setText("");
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }
}
