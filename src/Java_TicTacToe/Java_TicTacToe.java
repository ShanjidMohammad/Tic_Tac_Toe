
package Java_TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


      
public class Java_TicTacToe extends javax.swing.JFrame {

   private String startGame="X";
   private int xCount=0;
   private int oCount=0;
   private int cnt=0;
   int f=0;
   
    public Java_TicTacToe() {
        initComponents();
    }
    
    private void gameScore()
    {
        PlayerX.setText(String.valueOf(xCount));
        PlayerO.setText(String.valueOf(oCount));
    }
    private void choose_a_Player()
    {
      if(startGame.equalsIgnoreCase("X"))
      {
          startGame="O";
      }
      else
      {
          startGame="X";
      }
    }
    
    private void  winningGame()
    {
       String b1=btn1.getText();
       String b2=btn2.getText();
       String b3=btn3.getText();
       String b4=btn4.getText();
       String b5=btn5.getText();
       String b6=btn6.getText();
       String b7=btn7.getText();
       String b8=btn8.getText();
       String b9=btn9.getText();
       
       
        
        if(b1==("X")&&b2==("X")&&b3==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);

            
            xCount++;
            cnt=0;
            gameScore();
        }
        
        else if(b4==("X")&&b5==("X")&&b6==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
            
            xCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b7==("X")&&b8==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
            
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            
            xCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b1==("X")&&b4==("X")&&b7==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
            
            
            btn2.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn3.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
            
            xCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b2==("X")&&b5==("X")&&b8==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            
            btn4.setEnabled(false);
            btn1.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn3.setEnabled(false);
            btn9.setEnabled(false);
            
            
            xCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b3==("X")&&b6==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
            
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn1.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn2.setEnabled(false);
            
            
            xCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b1==("X")&&b5==("X")&&b9==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            
            btn4.setEnabled(false);
            btn2.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn3.setEnabled(false);
            
            
            xCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b3==("X")&&b5==("X")&&b7==("X"))
        {
            JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
            
            btn4.setEnabled(false);
            btn1.setEnabled(false);
            btn6.setEnabled(false);
            btn2.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
            xCount++;
            cnt=0;
            gameScore();
        }
            
          else  if(b1==("O")&&b2==("O")&&b3==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 0 Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.ORANGE);
            btn2.setBackground(Color.ORANGE);
            btn3.setBackground(Color.ORANGE);
            
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
            oCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b4==("O")&&b5==("O")&&b6==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 0 Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn4.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn6.setBackground(Color.YELLOW);
            
            
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
            oCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b7==("O")&&b8==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 0 Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn7.setBackground(Color.GREEN);
            btn8.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            
            oCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b1==("O")&&b4==("O")&&b7==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 0 Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.ORANGE);
            btn4.setBackground(Color.ORANGE);
            btn7.setBackground(Color.ORANGE);
            
            btn2.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn3.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
            
            oCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b2==("O")&&b5==("O")&&b8==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 0 Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn2.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn8.setBackground(Color.YELLOW);
            
            btn1.setEnabled(false);
            btn3.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn4.setEnabled(false);
            btn9.setEnabled(false);
            
            oCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b3==("O")&&b6==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 0 Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.GREEN);
            btn6.setBackground(Color.GREEN);
            btn9.setBackground(Color.GREEN);
            
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn8.setEnabled(false);
            btn7.setEnabled(false);
            
            oCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b1==("O")&&b5==("O")&&b9==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 0 Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn1.setBackground(Color.YELLOW);
            btn5.setBackground(Color.YELLOW);
            btn9.setBackground(Color.YELLOW);
            
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn7.setEnabled(false);
            
            oCount++;
            cnt=0;
            gameScore();
        }
        
       else if(b3==("O")&&b5==("O")&&b7==("O"))
        {
            JOptionPane.showMessageDialog(this, "Player 0 Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            btn3.setBackground(Color.GREEN);
            btn5.setBackground(Color.GREEN);
            btn7.setBackground(Color.GREEN);
            
            btn4.setEnabled(false);
            btn1.setEnabled(false);
            btn2.setEnabled(false);
            btn6.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
            oCount++;
            cnt=0;
            gameScore();
        }
       else if(cnt==9)
        {
            JOptionPane.showMessageDialog(this, "No Result", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            
            
             btn1.setBackground(Color.RED);
             btn2.setBackground(Color.RED);
             btn3.setBackground(Color.RED);
             btn4.setBackground(Color.RED);
             btn5.setBackground(Color.RED);
             btn6.setBackground(Color.RED);
             btn7.setBackground(Color.RED);
             btn8.setBackground(Color.RED);
             btn9.setBackground(Color.RED);
        }
        

    
        
    }
    
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PlayerX = new javax.swing.JLabel();
        PlayerO = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        New_game_btn = new javax.swing.JButton();
        Reset_btn = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(95, 158, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(95, 158, 160));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel1.setText("Player O:");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 70));

        PlayerX.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        PlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerX.setText("0");
        PlayerX.setOpaque(true);
        jPanel6.add(PlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 270, 70));

        PlayerO.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        PlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayerO.setText("0");
        PlayerO.setOpaque(true);
        jPanel6.add(PlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 270, 70));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel5.setText("Player X:");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 70));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 610, 180));

        jPanel7.setBackground(new java.awt.Color(95, 158, 160));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton10.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton10.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton10.setPreferredSize(new java.awt.Dimension(200, 158));
        jPanel7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 200, 180));

        New_game_btn.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        New_game_btn.setText("NEW GAME");
        New_game_btn.setMaximumSize(new java.awt.Dimension(200, 158));
        New_game_btn.setMinimumSize(new java.awt.Dimension(200, 158));
        New_game_btn.setPreferredSize(new java.awt.Dimension(200, 158));
        New_game_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_game_btnActionPerformed(evt);
            }
        });
        jPanel7.add(New_game_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 200));

        Reset_btn.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        Reset_btn.setText("RESET");
        Reset_btn.setMaximumSize(new java.awt.Dimension(200, 158));
        Reset_btn.setMinimumSize(new java.awt.Dimension(200, 158));
        Reset_btn.setPreferredSize(new java.awt.Dimension(200, 158));
        Reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset_btnActionPerformed(evt);
            }
        });
        jPanel7.add(Reset_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 310, 170));

        ExitButton.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        ExitButton.setText("EXIT");
        ExitButton.setMaximumSize(new java.awt.Dimension(200, 158));
        ExitButton.setMinimumSize(new java.awt.Dimension(200, 158));
        ExitButton.setPreferredSize(new java.awt.Dimension(200, 158));
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });
        jPanel7.add(ExitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 270, 170));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 610, 410));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 640, 650));

        jPanel4.setBackground(new java.awt.Color(95, 158, 160));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(95, 158, 160));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, 500, 100));

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn2.setMaximumSize(new java.awt.Dimension(200, 158));
        btn2.setMinimumSize(new java.awt.Dimension(200, 158));
        btn2.setPreferredSize(new java.awt.Dimension(200, 158));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 200, 180));

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn1.setMaximumSize(new java.awt.Dimension(200, 158));
        btn1.setMinimumSize(new java.awt.Dimension(200, 158));
        btn1.setPreferredSize(new java.awt.Dimension(200, 158));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 200, 180));

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn4.setMaximumSize(new java.awt.Dimension(200, 158));
        btn4.setMinimumSize(new java.awt.Dimension(200, 158));
        btn4.setPreferredSize(new java.awt.Dimension(200, 158));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel4.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, 180));

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn7.setMaximumSize(new java.awt.Dimension(200, 158));
        btn7.setMinimumSize(new java.awt.Dimension(200, 158));
        btn7.setPreferredSize(new java.awt.Dimension(200, 158));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel4.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 200, 180));

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn6.setMaximumSize(new java.awt.Dimension(200, 158));
        btn6.setMinimumSize(new java.awt.Dimension(200, 158));
        btn6.setPreferredSize(new java.awt.Dimension(200, 158));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel4.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 200, 180));

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn8.setMaximumSize(new java.awt.Dimension(200, 158));
        btn8.setMinimumSize(new java.awt.Dimension(200, 158));
        btn8.setPreferredSize(new java.awt.Dimension(200, 158));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel4.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 200, 180));

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn5.setMaximumSize(new java.awt.Dimension(200, 158));
        btn5.setMinimumSize(new java.awt.Dimension(200, 158));
        btn5.setPreferredSize(new java.awt.Dimension(200, 158));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel4.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 200, 180));

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn3.setMaximumSize(new java.awt.Dimension(200, 158));
        btn3.setMinimumSize(new java.awt.Dimension(200, 158));
        btn3.setPreferredSize(new java.awt.Dimension(200, 158));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 20, 200, 180));

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        btn9.setMaximumSize(new java.awt.Dimension(200, 158));
        btn9.setMinimumSize(new java.awt.Dimension(200, 158));
        btn9.setPreferredSize(new java.awt.Dimension(200, 158));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel4.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 200, 180));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 680, 650));

        jPanel3.setBackground(new java.awt.Color(95, 158, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIC TAC TOE GAME");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1340, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1480, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
                 
       frame = new JFrame("Exit");

    
        if(JOptionPane.showConfirmDialog(frame,"CONFIRM EXIT","TIK TAK TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    
      
    }//GEN-LAST:event_ExitButtonActionPerformed

    private void Reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset_btnActionPerformed
        if(JOptionPane.showConfirmDialog( frame,"CONFIRM RESET","TIK TAC TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            xCount = 0;
        oCount = 0;
        gameScore();
        // Start a new game
            New_game_btnActionPerformed(evt);
            btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        cnt=0;
        
        }
        
        
        
    }//GEN-LAST:event_Reset_btnActionPerformed

    private void New_game_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_game_btnActionPerformed
        
      if(JOptionPane.showConfirmDialog(frame,"Confirm New Game","TIK TAC TOE",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
      {
          // Clear the board and start a new game
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        
        
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        // Reset backgrounds
        btn1.setBackground(null);
        btn2.setBackground(null);
        btn3.setBackground(null);
        btn4.setBackground(null);
        btn5.setBackground(null);
        btn6.setBackground(null);
        btn7.setBackground(null);
        btn8.setBackground(null);
        btn9.setBackground(null);

        // Reset player turn
        startGame="X";
        cnt=0;
      }
      
    }//GEN-LAST:event_New_game_btnActionPerformed
    
    private void handleButtonClick(javax.swing.JButton button) {
    if (button.getText().isEmpty()) {
        button.setText(startGame);
        cnt++;

        // Toggle player turn
        if (startGame.equalsIgnoreCase("X")) {
            f = 0;
        } else {
            f = 1;
        }
        choose_a_Player();
        winningGame();
    }
}

    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        handleButtonClick(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
      handleButtonClick(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       handleButtonClick(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        handleButtonClick(btn4);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        handleButtonClick(btn5);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
       handleButtonClick(btn6);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        handleButtonClick(btn7);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        handleButtonClick(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        handleButtonClick(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton;
    private javax.swing.JButton New_game_btn;
    private javax.swing.JLabel PlayerO;
    private javax.swing.JLabel PlayerX;
    private javax.swing.JButton Reset_btn;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
