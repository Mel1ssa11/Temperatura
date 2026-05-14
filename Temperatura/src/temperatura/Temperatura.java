/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temperatura extends JFrame {

    Container tela;
    JLabel titulo, labelCelsius, labelFahrenheit, labelKelvin;
    JTextField textoCelsius, textoFahrenheit, textoKelvin;
    JButton converter;

    public Temperatura() {

        super("Conversor de Temperatura");

        tela = getContentPane();
        tela.setLayout(null);
        tela.setBackground(new Color(142, 210, 188));

        titulo = new JLabel("Conversor de Temperatura");
        titulo.setBounds(0, 30, 500, 30);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 26));
        titulo.setForeground(new Color(26, 75, 131));

        labelCelsius = new JLabel("Graus Celsius");
        labelFahrenheit = new JLabel("Graus Fahrenheit");
        labelKelvin = new JLabel("Graus Kelvin");
        labelCelsius.setBounds(60, 110, 150, 25);
        labelFahrenheit.setBounds(60, 170, 150, 25);
        labelKelvin.setBounds(60, 230, 150, 25);

        textoCelsius = new JTextField();
        textoFahrenheit = new JTextField();
        textoKelvin = new JTextField();
        textoCelsius.setBounds(230, 110, 180, 30);
        textoFahrenheit.setBounds(230, 170, 180, 30);
        textoKelvin.setBounds(230, 230, 180, 30);
        textoFahrenheit.setEditable(false);
        textoKelvin.setEditable(false);

        converter = new JButton("Converter");
        converter.setBounds(180, 320, 140, 35);
        converter.setBackground(new Color(246, 86, 65));
        converter.setForeground(Color.WHITE);

        converter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {

                    double celsius = Double.parseDouble(textoCelsius.getText().replace(",", "."));

                    double fahrenheit = (celsius * 9 / 5) + 32;
                    double kelvin = celsius + 273.15;

                    textoFahrenheit.setText(String.valueOf(fahrenheit));
                    textoKelvin.setText(String.valueOf(kelvin));

                } catch (NumberFormatException erro) {

                    JOptionPane.showMessageDialog(null,
                            "Digite apenas numeros validos");

                }
            }
        });

        tela.add(titulo);

        tela.add(labelCelsius);
        tela.add(labelFahrenheit);
        tela.add(labelKelvin);

        tela.add(textoCelsius);
        tela.add(textoFahrenheit);
        tela.add(textoKelvin);

        tela.add(converter);

        setSize(500, 450);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
