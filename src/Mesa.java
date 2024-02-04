import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Xandy
 */
public class Mesa extends javax.swing.JFrame {

    private Baralho baralho = new Baralho();

    private ArrayList<CartaViravel> cartasCPU = new ArrayList<>();

    private ArrayList<CartaViravel> cartasJogador = new ArrayList<>();


    public Mesa() {
        initComponents();
        baralho.montarBaralho();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mesa = new javax.swing.JPanel();
        BtnParar = new javax.swing.JButton();
        BtnMaisUmaCarta = new javax.swing.JButton();
        jLabelCPU = new javax.swing.JLabel();
        jLabelPlayerUm = new javax.swing.JLabel();
        BtnSair = new javax.swing.JButton();
        maoCPU = new javax.swing.JPanel();
        maoPlayer = new javax.swing.JPanel();
        lblCPUScoreRes = new javax.swing.JLabel();
        lblPlayerScoreRes = new javax.swing.JLabel();
        BtnClear = new javax.swing.JButton();
        BtnNovoJogo = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(885, 653));
        setResizable(false);
        setSize(new java.awt.Dimension(885, 653));

        mesa.setBackground(new java.awt.Color(0, 75, 35));
        mesa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnParar.setText("Parar");
        BtnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPararActionPerformed(evt);
            }
        });
        mesa.add(BtnParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 590, 140, 30));

        BtnMaisUmaCarta.setText("Mais uma carta");
        BtnMaisUmaCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMaisUmaCartaActionPerformed(evt);
            }
        });
        mesa.add(BtnMaisUmaCarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 590, 140, 30));

        jLabelCPU.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelCPU.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCPU.setText("CPU");
        mesa.add(jLabelCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 890, 40));

        jLabelPlayerUm.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelPlayerUm.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPlayerUm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPlayerUm.setText("Player 1");
        mesa.add(jLabelPlayerUm, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 890, 40));

        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });
        mesa.add(BtnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, -1, -1));

        maoCPU.setBackground(new java.awt.Color(0, 75, 35));
        maoCPU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        mesa.add(maoCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 700, 180));

        maoPlayer.setBackground(new java.awt.Color(0, 75, 35));
        maoPlayer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        mesa.add(maoPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 700, 180));

        lblCPUScoreRes.setBackground(new java.awt.Color(255, 255, 255));
        lblCPUScoreRes.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblCPUScoreRes.setForeground(new java.awt.Color(255, 255, 255));
        lblCPUScoreRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCPUScoreRes.setText("0");
        mesa.add(lblCPUScoreRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 90, 180));

        lblPlayerScoreRes.setBackground(new java.awt.Color(255, 255, 255));
        lblPlayerScoreRes.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lblPlayerScoreRes.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayerScoreRes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayerScoreRes.setText("0");
        mesa.add(lblPlayerScoreRes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 180));

        BtnClear.setText("Clear");
        BtnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClearActionPerformed(evt);
            }
        });
        mesa.add(BtnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        BtnNovoJogo.setText("Novo Jogo");
        BtnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNovoJogoActionPerformed(evt);
            }
        });
        mesa.add(BtnNovoJogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mesa, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPararActionPerformed
        redesenhaPC();

    }//GEN-LAST:event_BtnPararActionPerformed

    private void BtnMaisUmaCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMaisUmaCartaActionPerformed
        // TODO add your handling code here:

        if (!baralho.acabouCartas()) {
            JLabel carta = new JLabel();
            CartaViravel c = baralho.pegarCarta();  // pega uma carta do baralho
            c.abrirCarta();
            carta.setIcon(c.getFigura());
            maoPlayer.add(carta);
            cartasJogador.add(c);
            totalizarJogador();
            pack();
        } else {
            JOptionPane.showMessageDialog(null, "As cartas do baralho terminaram ");
        }

    }//GEN-LAST:event_BtnMaisUmaCartaActionPerformed

//-------------------------------------------------------------------------------------------------------------
    
    private void totalizarJogador() {
        int totalJogador = 0;
        for (CartaViravel c : cartasJogador) {
            totalJogador += c.getValor();

            if (totalJogador > 21) {
                JOptionPane.showMessageDialog(null, "Você Excedeu o valor de [21]");
            }
            lblPlayerScoreRes.setText("" + totalJogador);
        }
    }

    private void totalizarCPU() {
        int totalCPU = 0;
        for (CartaViravel d : cartasCPU) {
            totalCPU += d.getValor();

            if (totalCPU > 21) {
                JOptionPane.showMessageDialog(null, "Você Excedeu o valor de [21]");
            }
            lblCPUScoreRes.setText("" + totalCPU);

        }
    }
  
//-------------------------------------------------------------------------------------------------------------
    
    private void pegarCartaPlayer() {
        JLabel carta = new JLabel();
        CartaViravel c = baralho.pegarCarta();  // pega uma carta do baralho
        c.abrirCarta();
        carta.setIcon(c.getFigura());
        maoPlayer.add(carta);
        cartasJogador.add(c);
        totalizarJogador();
        pack();
    }

    private void pegarCartaCPU(boolean aberta) {
        JLabel carta = new JLabel();
        CartaViravel d = baralho.pegarCarta();  // pega uma carta do baralho
        if (aberta) {
            d.abrirCarta();
        } else {
            d.fecharCarta();
        }
        carta.setIcon(d.getFigura());
        maoCPU.add(carta);
        cartasCPU.add(d);
        totalizarCPU();
        pack();
    }

    private void redesenhaPC() {
        this.maoCPU.removeAll();
        this.maoCPU.repaint();
        for (CartaViravel c : cartasCPU) {
            JLabel carta = new JLabel();
            c.abrirCarta();
            carta.setIcon(c.getFigura());
            maoCPU.add(carta);
        }
        pack();
    }
    
//-------------------------------------------------------------------------------------------------------------

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_BtnSairActionPerformed

    private void BtnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearActionPerformed
    }//GEN-LAST:event_BtnClearActionPerformed

    private void BtnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNovoJogoActionPerformed
        pegarCartaPlayer();
        pegarCartaPlayer();
        pegarCartaCPU(true);
        pegarCartaCPU(false);
    }//GEN-LAST:event_BtnNovoJogoActionPerformed

//-------------------------------------------------------------------------------------------------------------
    public void limparMesa() {
        this.mesa.removeAll();
        this.mesa.repaint();
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClear;
    private javax.swing.JButton BtnMaisUmaCarta;
    private javax.swing.JButton BtnNovoJogo;
    private javax.swing.JButton BtnParar;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel jLabelCPU;
    private javax.swing.JLabel jLabelPlayerUm;
    private javax.swing.JLabel lblCPUScoreRes;
    private javax.swing.JLabel lblPlayerScoreRes;
    private javax.swing.JPanel maoCPU;
    private javax.swing.JPanel maoPlayer;
    private javax.swing.JPanel mesa;
    // End of variables declaration//GEN-END:variables
}
