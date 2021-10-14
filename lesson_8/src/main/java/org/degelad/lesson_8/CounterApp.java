package org.degelad.lesson_8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * Попробовать переписать приложение счётчика "с нуля", по минимуму используя
 * методичку. 1. Добавить кнопку сброса счётчика на первоначальное значение. 2.
 * Добавить кнопку сохранения предыдущего значения (как в калькуляторе). Кнопка
 * должна запоминать текущее значение и при повторном нажатии обновлять
 * существующее значение счётчика.
 *
 * @author degelad
 */
public class CounterApp extends JFrame {

    private int value;
    private int saveValue;
    private int i = 0;

    public CounterApp(int initialValue) {
        setBounds(200, 200, 500, 500);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        Font font = new Font("Arial", Font.BOLD, 32);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        JButton resetButton = new JButton("reset");
        resetButton.setFont(font);
        add(resetButton, BorderLayout.NORTH);

        JButton saveButton = new JButton("save");
        saveButton.setFont(font);
        add(saveButton, BorderLayout.SOUTH);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value = initialValue;
                saveValue = value;
                i = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });
        
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                i++;
                if (i == 1){
                
                saveValue = value;
                counterValueView.setText(String.valueOf(value));}
                else if (i >= 2){
                counterValueView.setText(String.valueOf(saveValue));
                }
            }
        });
        
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

    }

    public static void main(String[] args) {
        new CounterApp(0);
    }

}
