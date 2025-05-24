package org.example;

import javax.swing.*;
import java.awt.*;

public class YearEndReportFrame extends JFrame {
    public YearEndReportFrame(String reportText) {
        setTitle("Year-End BIR Tax Report (All Employees)");
        setSize(600, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea(reportText);
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        textArea.setEditable(false);
        textArea.setMargin(new Insets(10, 10, 10, 10));

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
    }
}

