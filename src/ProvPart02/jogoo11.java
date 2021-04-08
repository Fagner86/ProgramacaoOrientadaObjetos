/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProvPart02;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Fagner
 */
public class jogoo11 extends javax.swing.JFrame {

    int i = 0;
    int numeroAte5[] = new int[5];
    int numeroD6Ate10[] = new int[5];
    int totalLista = 0;

    public jogoo11() {
        initComponents();
        Random NumeroAA = new Random();
        for (i = 0; i < 5; i++) {
            int num = NumeroAA.nextInt(10);
            numeroAte5[i] = num;
        }
        for (i = 0; i < 5; i++) {
            int num = NumeroAA.nextInt(10);
            numeroD6Ate10[i] = num;
        }
    }

    int pontos2 = 0;
    int pontos1 = 0;
    int sinal1 = 0;
    int sinal2 = 0;
    int totalP1 = 0;
    int totalP2 = 0;
    int cartaN1 = 0;
    int cartaN2 = 0;
    int numeroDVitoriaJ1 = 0;
    int numeroDVitoriaJ2 = 0;
    int numeroDEmpates = 0;

    String[] images = {"src/imagem/cartaA.jpg", "src/imagem/Carta2.png", "src/imagem/Carta3.png", "src/imagem/Carta4.png",
        "src/imagem/Carta5.jpg", "src/imagem/Carta6.png", "src/imagem/Carta7.jpg", "src/imagem/Carta8.png",
        "src/imagem/Carta9.png", "src/imagem/Carta10.png"};

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        textJogado01 = new javax.swing.JTextField();
        textJogador02 = new javax.swing.JTextField();
        BJogado01 = new javax.swing.JButton();
        BJogador02 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        textV1 = new javax.swing.JTextField();
        textV2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textEmpate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(1);
        jButton1.setName(""); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 130));

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 130));

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 130));

        jButton4.setBackground(java.awt.Color.white);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 130));

        jButton5.setBackground(java.awt.Color.white);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 130));

        jButton6.setBackground(java.awt.Color.white);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 130));

        jButton7.setBackground(java.awt.Color.white);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, 130));

        jButton8.setBackground(java.awt.Color.white);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, 130));

        jButton9.setBackground(java.awt.Color.white);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, -1, 130));

        jButton10.setBackground(java.awt.Color.white);
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setPreferredSize(new java.awt.Dimension(70, 180));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, 130));

        textJogado01.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textJogado01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textJogado01ActionPerformed(evt);
            }
        });
        getContentPane().add(textJogado01, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 40, 30));

        textJogador02.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(textJogador02, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 40, 30));

        BJogado01.setText("Jogador 01");
        BJogado01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJogado01ActionPerformed(evt);
            }
        });
        getContentPane().add(BJogado01, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, 30));

        BJogador02.setText("Jogador 02");
        BJogador02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJogador02ActionPerformed(evt);
            }
        });
        getContentPane().add(BJogador02, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 100, 30));

        jButton12.setText("Jogar novamente");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 140, 30));

        jLabel1.setText("                              Placar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 230, 20));

        jLabel2.setText("N vitórias");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 60, 20));

        jLabel3.setText("N vitórias");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 70, 20));

        textV1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textV1ActionPerformed(evt);
            }
        });
        getContentPane().add(textV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 30, -1));

        textV2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textV2ActionPerformed(evt);
            }
        });
        getContentPane().add(textV2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 30, -1));

        jLabel4.setText("N empates ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 350, 70, 20));

        textEmpate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textEmpate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmpateActionPerformed(evt);
            }
        });
        getContentPane().add(textEmpate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 30, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (sinal1 >= 1) {

            //if (sinal1 >= 1) {
            SecureRandom generator = new SecureRandom();
            int randomNumber = generator.nextInt(numeroAte5.length);

            ImageIcon icoA = new ImageIcon(images[numeroAte5[randomNumber]]);
            icoA.setImage(icoA.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), 1));

            jButton1.setIcon(icoA);
            pontos1 = numeroAte5[randomNumber] + 1;
            cartaN1 = pontos1;

            JOptionPane.showMessageDialog(null, "Pontos: " + pontos1);
            /**
             * } else if (sinal2 >= 1) { SecureRandom generator = new
             * SecureRandom(); int randomNumber =
             * generator.nextInt(numeroAte5.length);
             *
             * ImageIcon icoA = new ImageIcon(images[numeroAte5[randomNumber]]);
             * icoA.setImage(icoA.getImage().getScaledInstance(jButton1.getWidth(),
             * jButton1.getHeight(), 1)); jButton1.setIcon(icoA);
             *
             * pontos2 = pontos2 + numeroAte5[randomNumber] + 1;
             *
             * JOptionPane.showMessageDialog(null, "Pontos: " + pontos2);
             *
             * cartaN2 = pontos2;
             *
             * //comparando as carta para ver qual a maior if (cartaN1 >
             * cartaN2) { totalP1 = totalP1 + cartaN1 + cartaN2;
             * textJogado01.setText(String.valueOf(totalP1)); numeroDVitoriaJ1 =
             * numeroDVitoriaJ1 + 1;
             * textV1.setText(String.valueOf(numeroDVitoriaJ1)); } else if
             * (cartaN1 < cartaN2) { totalP2 = totalP2 + cartaN1 + cartaN2;;
             * textJogador02.setText(String.valueOf(totalP2)); numeroDVitoriaJ2
             * = numeroDVitoriaJ2 + 1;
             * textV2.setText(String.valueOf(numeroDVitoriaJ2)); } else if
             * (cartaN1 == cartaN2) { numeroDEmpates = numeroDEmpates + 1;
             * textEmpate.setText(String.valueOf(numeroDEmpates));
             * JOptionPane.showMessageDialog(null, "Empate "); }
             *
             *
             * }
             */
            sinal1 = 0;
            sinal2 = 0;
        } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal2 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 1 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 2 ");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (sinal1 >= 1) {

            // if (sinal1 >= 1) {
            SecureRandom generator = new SecureRandom();
            int randomNumber = generator.nextInt(numeroAte5.length);

            ImageIcon icoA = new ImageIcon(images[numeroAte5[randomNumber]]);
            icoA.setImage(icoA.getImage().getScaledInstance(jButton2.getWidth(), jButton2.getHeight(), 1));
            jButton2.setIcon(icoA);

            //atribuindo os pontos com o numero gerado do random e somando mais +1 pq o numero random começa na posição zero
            pontos1 = numeroAte5[randomNumber] + 1;
            cartaN1 = pontos1;

            JOptionPane.showMessageDialog(null, "Pontos: " + pontos1);

            /**
             * } else if (sinal2 >= 1) { SecureRandom generator = new
             * SecureRandom(); int randomNumber =
             * generator.nextInt(numeroAte5.length);
             *
             * ImageIcon icoA = new ImageIcon(images[numeroAte5[randomNumber]]);
             * icoA.setImage(icoA.getImage().getScaledInstance(jButton2.getWidth(),
             * jButton2.getHeight(), 1)); jButton2.setIcon(icoA);
             *
             * pontos2 = pontos2 + numeroAte5[randomNumber] + 1;
             *
             * JOptionPane.showMessageDialog(null, "Pontos: " + pontos2);
             *
             * cartaN2 = pontos2;
             *
             * //comparando as carta para ver qual a maior if (cartaN1 >
             * cartaN2) { totalP1 = totalP1 + cartaN1 + cartaN2;
             * textJogado01.setText(String.valueOf(totalP1)); numeroDVitoriaJ1 =
             * numeroDVitoriaJ1 + 1;
             * textV1.setText(String.valueOf(numeroDVitoriaJ1)); } else if
             * (cartaN1 < cartaN2) { totalP2 = totalP2 + cartaN1 + cartaN2;;
             * textJogador02.setText(String.valueOf(totalP2)); numeroDVitoriaJ2
             * = numeroDVitoriaJ2 + 1;
             * textEmpate.setText(String.valueOf(numeroDVitoriaJ2)); } else if
             * (cartaN1 == cartaN2) { numeroDEmpates = numeroDEmpates + 1;
             * textV2.setText(String.valueOf(numeroDEmpates));
             * JOptionPane.showMessageDialog(null, "Empate "); }
            }*
             */
            sinal1 = 0;
            sinal2 = 0;
       } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal2 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 1 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 2 ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (sinal1 >= 1) {

            SecureRandom generator = new SecureRandom();
            int randomNumber = generator.nextInt(numeroAte5.length);

            ImageIcon icoA = new ImageIcon(images[numeroAte5[randomNumber]]);
            icoA.setImage(icoA.getImage().getScaledInstance(jButton3.getWidth(), jButton3.getHeight(), 1));
            jButton3.setIcon(icoA);

            pontos1 =  numeroAte5[randomNumber] + 1;
            cartaN1 = pontos1;

            JOptionPane.showMessageDialog(null, "Pontos: " + pontos1);

            sinal1 = 0;
            sinal2 = 0;
        } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal2 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 1 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 2 ");
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if (sinal1 >= 1) {

            SecureRandom generator = new SecureRandom();
            int randomNumber = generator.nextInt(numeroAte5.length);

            ImageIcon icoA = new ImageIcon(images[numeroAte5[randomNumber]]);
            icoA.setImage(icoA.getImage().getScaledInstance(jButton4.getWidth(), jButton4.getHeight(), 1));
            jButton4.setIcon(icoA);

            pontos1 =  numeroAte5[randomNumber] + 1;
            cartaN1 = pontos1;

            JOptionPane.showMessageDialog(null, "Pontos: " + pontos1);

            sinal1 = 0;
            sinal2 = 0;
       } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal2 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 1 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 2 ");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (sinal1 >= 1) {

            SecureRandom generator = new SecureRandom();
            int randomNumber = generator.nextInt(numeroAte5.length);

            ImageIcon icoA = new ImageIcon(images[numeroAte5[randomNumber]]);
            icoA.setImage(icoA.getImage().getScaledInstance(jButton5.getWidth(), jButton5.getHeight(), 1));
            jButton5.setIcon(icoA);

            pontos1 =  numeroAte5[randomNumber] + 1;
            cartaN1 = pontos1;

            JOptionPane.showMessageDialog(null, "Pontos: " + pontos1);

            sinal1 = 0;
            sinal2 = 0;
       } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal2 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 1 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 2 ");
        }


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (sinal2 >= 1) {
            SecureRandom generator = new SecureRandom();
            int randomNumber = generator.nextInt(numeroD6Ate10.length);

            ImageIcon icoA = new ImageIcon(images[numeroD6Ate10[randomNumber]]);
            icoA.setImage(icoA.getImage().getScaledInstance(jButton6.getWidth(), jButton6.getHeight(), 1));
            jButton6.setIcon(icoA);

            pontos2 = numeroD6Ate10[randomNumber] + 1;

            JOptionPane.showMessageDialog(null, "Pontos: " + pontos2);

            cartaN2 = pontos2;

            //comparando as carta para ver qual a maior
            if (cartaN1 > cartaN2) {
                totalP1 = totalP1 + cartaN1 + cartaN2;
                textJogado01.setText(String.valueOf(totalP1));
                numeroDVitoriaJ1 = numeroDVitoriaJ1 + 1;
                textV1.setText(String.valueOf(numeroDVitoriaJ1));
            } else if (cartaN1 < cartaN2) {
                totalP2 = totalP2 + cartaN1 + cartaN2;;
                textJogador02.setText(String.valueOf(totalP2));
                numeroDVitoriaJ2 = numeroDVitoriaJ2 + 1;
                textV2.setText(String.valueOf(numeroDVitoriaJ2));
            } else if (cartaN1 == cartaN2) {
                numeroDEmpates = numeroDEmpates + 1;
                textEmpate.setText(String.valueOf(numeroDEmpates));
                JOptionPane.showMessageDialog(null, "Empate ");
            }
            sinal1 = 0;
            sinal2 = 0;
       } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal1 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 2 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione jogador 2");
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if ( sinal2 >= 1) {

           
                SecureRandom generator = new SecureRandom();
                int randomNumber = generator.nextInt(numeroD6Ate10.length);

                ImageIcon icoA = new ImageIcon(images[numeroD6Ate10[randomNumber]]);
                icoA.setImage(icoA.getImage().getScaledInstance(jButton7.getWidth(), jButton7.getHeight(), 1));
                jButton7.setIcon(icoA);

                pontos2 = numeroD6Ate10[randomNumber] + 1;

                JOptionPane.showMessageDialog(null, "Pontos: " + pontos2);

                cartaN2 = pontos2;

                //comparando as carta para ver qual a maior
                if (cartaN1 > cartaN2) {
                    totalP1 = totalP1 + cartaN1 + cartaN2;
                    textJogado01.setText(String.valueOf(totalP1));
                    numeroDVitoriaJ1 = numeroDVitoriaJ1 + 1;
                    textV1.setText(String.valueOf(numeroDVitoriaJ1));
                } else if (cartaN1 < cartaN2) {
                    totalP2 = totalP2 + cartaN1 + cartaN2;;
                    textJogador02.setText(String.valueOf(totalP2));
                    numeroDVitoriaJ2 = numeroDVitoriaJ2 + 1;
                    textV2.setText(String.valueOf(numeroDVitoriaJ2));
                } else if (cartaN1 == cartaN2) {
                    numeroDEmpates = numeroDEmpates + 1;
                    textEmpate.setText(String.valueOf(numeroDEmpates));
                    JOptionPane.showMessageDialog(null, "Empate ");
                }

            
            sinal1 = 0;
            sinal2 = 0;
        } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal1 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 2 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione jogador 2");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if ( sinal2 >= 1) {
            
                SecureRandom generator = new SecureRandom();
                int randomNumber = generator.nextInt(numeroD6Ate10.length);

                ImageIcon icoA = new ImageIcon(images[numeroD6Ate10[randomNumber]]);
                icoA.setImage(icoA.getImage().getScaledInstance(jButton9.getWidth(), jButton9.getHeight(), 1));
                jButton9.setIcon(icoA);

                pontos2 =  numeroD6Ate10[randomNumber] + 1;

                JOptionPane.showMessageDialog(null, "Pontos: " + pontos2);

                cartaN2 = pontos2;

                //comparando as carta para ver qual a maior
                if (cartaN1 > cartaN2) {
                    totalP1 = totalP1 + cartaN1 + cartaN2;
                    textJogado01.setText(String.valueOf(totalP1));
                    numeroDVitoriaJ1 = numeroDVitoriaJ1 + 1;
                    textV1.setText(String.valueOf(numeroDVitoriaJ1));
                } else if (cartaN1 < cartaN2) {
                    totalP2 = totalP2 + cartaN1 + cartaN2;;
                    textJogador02.setText(String.valueOf(totalP2));
                    numeroDVitoriaJ2 = numeroDVitoriaJ2 + 1;
                    textV2.setText(String.valueOf(numeroDVitoriaJ2));
                } else if (cartaN1 == cartaN2) {
                    numeroDEmpates = numeroDEmpates + 1;
                    textEmpate.setText(String.valueOf(numeroDEmpates));
                    JOptionPane.showMessageDialog(null, "Empate ");
                }
            
            sinal1 = 0;
            sinal2 = 0;
       } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal1 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 2 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione jogador 2");
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        if ( sinal2 >= 1) {

           
                SecureRandom generator = new SecureRandom();
                int randomNumber = generator.nextInt(numeroD6Ate10.length);

                ImageIcon icoA = new ImageIcon(images[numeroD6Ate10[randomNumber]]);
                icoA.setImage(icoA.getImage().getScaledInstance(jButton10.getWidth(), jButton10.getHeight(), 1));
                jButton10.setIcon(icoA);

                pontos2 =  numeroD6Ate10[randomNumber] + 1;

                JOptionPane.showMessageDialog(null, "Pontos: " + pontos2);

                cartaN2 = pontos2;
               
                
                //comparando as carta para ver qual a maior
                if (cartaN1 > cartaN2) {
                    totalP1 = totalP1 + cartaN1 + cartaN2;
                    textJogado01.setText(String.valueOf(totalP1));
                    numeroDVitoriaJ1 = numeroDVitoriaJ1 + 1;
                    textV1.setText(String.valueOf(numeroDVitoriaJ1));
                } else if (cartaN1 < cartaN2) {
                    totalP2 = totalP2 + cartaN1 + cartaN2;;
                    textJogador02.setText(String.valueOf(totalP2));
                    numeroDVitoriaJ2 = numeroDVitoriaJ2 + 1;
                    textV2.setText(String.valueOf(numeroDVitoriaJ2));
                } else if (cartaN1 == cartaN2) {
                    numeroDEmpates = numeroDEmpates + 1;
                    textEmpate.setText(String.valueOf(numeroDEmpates));
                    JOptionPane.showMessageDialog(null, "Empate ");
                }

            
            sinal1 = 0;
            sinal2 = 0;
       } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal1 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 2 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione jogador 2");
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if ( sinal2 >= 1) {

           
                SecureRandom generator = new SecureRandom();
                int randomNumber = generator.nextInt(numeroD6Ate10.length);

                ImageIcon icoA = new ImageIcon(images[numeroD6Ate10[randomNumber]]);
                icoA.setImage(icoA.getImage().getScaledInstance(jButton8.getWidth(), jButton8.getHeight(), 1));
                jButton8.setIcon(icoA);

                pontos2 = numeroD6Ate10[randomNumber] + 1;

                JOptionPane.showMessageDialog(null, "Pontos: " + pontos2);

                cartaN2 = pontos2;
               
                //comparando as carta para ver qual a maior
                if (cartaN1 > cartaN2) {
                    totalP1 = totalP1 + cartaN1 + cartaN2;
                    textJogado01.setText(String.valueOf(totalP1));
                    numeroDVitoriaJ1 = numeroDVitoriaJ1 + 1;
                    textV1.setText(String.valueOf(numeroDVitoriaJ1));
                } else if (cartaN1 < cartaN2) {
                    totalP2 = totalP2 + cartaN1 + cartaN2;;
                    textJogador02.setText(String.valueOf(totalP2));
                    numeroDVitoriaJ2 = numeroDVitoriaJ2 + 1;
                    textV2.setText(String.valueOf(numeroDVitoriaJ2));
                } else if (cartaN1 == cartaN2) {
                    numeroDEmpates = numeroDEmpates + 1;
                    textEmpate.setText(String.valueOf(numeroDEmpates));
                    JOptionPane.showMessageDialog(null, "Empate ");
                }

            
            sinal1 = 0;
            sinal2 = 0;
        } else if (pontos1 > 0 && pontos2 > 0) {
            JOptionPane.showMessageDialog(null, "Selecione o jogador 1 ");
        } else if (sinal1 > 0) {
            JOptionPane.showMessageDialog(null, "Carta do jogador 2 ");
        } else if ((pontos1 == 0 && pontos2 == 0) && (sinal2 == 0) && (sinal1 == 0)){
            JOptionPane.showMessageDialog(null, "Selecione um jogador ");
        } else {
            JOptionPane.showMessageDialog(null, "Selecione jogador 2");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void BJogado01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJogado01ActionPerformed
        BJogado01.setBackground(Color.GREEN);
        BJogador02.setBackground(null);
        sinal1 = sinal1 + 1;
        sinal2 = 0;
        pontos1 = 0;
        pontos2 = 0;
        //textJogado01.setText("");
        // textJogador02.setText("");
        /**
         * jButton10.setIcon(null); jButton9.setIcon(null);
         * jButton8.setIcon(null); jButton7.setIcon(null);
         * jButton6.setIcon(null); jButton5.setIcon(null);
         * jButton4.setIcon(null); jButton3.setIcon(null);
         * jButton2.setIcon(null); jButton1.setIcon(null);
         */

    }//GEN-LAST:event_BJogado01ActionPerformed

    private void BJogador02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJogador02ActionPerformed
        BJogado01.setBackground(null);
        BJogador02.setBackground(Color.GREEN);
        sinal2 = sinal2 + 1;
        sinal1 = 0;


    }//GEN-LAST:event_BJogador02ActionPerformed

    private void textJogado01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textJogado01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textJogado01ActionPerformed

    private void textV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textV1ActionPerformed

    private void textV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textV2ActionPerformed

    private void textEmpateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmpateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmpateActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        BJogado01.setBackground(null);
        BJogador02.setBackground(null);
        sinal1 = 0;
        sinal2 = 0;
        pontos1 = 0;
        pontos2 = 0;
        pontos1 = 0;

        totalP1 = 0;
        totalP2 = 0;
        cartaN1 = 0;
        cartaN2 = 0;
        numeroDVitoriaJ1 = 0;
        numeroDVitoriaJ2 = 0;
        numeroDEmpates = 0;
        textJogado01.setText("");
        textJogador02.setText("");
        textV1.setText("");
        textV2.setText("");
        textEmpate.setText("");

        jButton10.setIcon(null);
        jButton9.setIcon(null);
        jButton8.setIcon(null);
        jButton7.setIcon(null);
        jButton6.setIcon(null);
        jButton5.setIcon(null);
        jButton4.setIcon(null);
        jButton3.setIcon(null);
        jButton2.setIcon(null);
        jButton1.setIcon(null);
        Random NumeroAA = new Random();
        for (i = 0; i < 5; i++) {
            int num = NumeroAA.nextInt(10);
            numeroAte5[i] = num;
        }
        for (i = 0; i < 5; i++) {
            int num = NumeroAA.nextInt(10);
            numeroD6Ate10[i] = num;
        }


    }//GEN-LAST:event_jButton12ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogoo11().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BJogado01;
    private javax.swing.JButton BJogador02;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textEmpate;
    private javax.swing.JTextField textJogado01;
    private javax.swing.JTextField textJogador02;
    private javax.swing.JTextField textV1;
    private javax.swing.JTextField textV2;
    // End of variables declaration//GEN-END:variables
}
