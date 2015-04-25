/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

/**
 *
 * @author Felix Diaz ®
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grp_Radios = new javax.swing.ButtonGroup();
        pnl_Cuadricula = new javax.swing.JPanel();
        pnl_Controls = new javax.swing.JPanel();
        list_Metodos = new javax.swing.JComboBox();
        lbl_Metodo = new javax.swing.JLabel();
        lbl_Titulo = new javax.swing.JLabel();
        lista_dificultad = new javax.swing.JComboBox();
        radio_inicio = new javax.swing.JRadioButton();
        radio_fin = new javax.swing.JRadioButton();
        btn_realizar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        lbl_Dificultad = new javax.swing.JLabel();
        radio_obstaculo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnl_CuadriculaLayout = new javax.swing.GroupLayout(pnl_Cuadricula);
        pnl_Cuadricula.setLayout(pnl_CuadriculaLayout);
        pnl_CuadriculaLayout.setHorizontalGroup(
            pnl_CuadriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 518, Short.MAX_VALUE)
        );
        pnl_CuadriculaLayout.setVerticalGroup(
            pnl_CuadriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        list_Metodos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Classic A*", "Deepth Search", "Foward Checking" }));

        lbl_Metodo.setText("Método :");

        lbl_Titulo.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_Titulo.setText("Configuracion");

        lista_dificultad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Imposible", "Very Tough", "Tough", "Normal", "Easy" }));

        radio_inicio.setText("Poner Inicio");

        radio_fin.setText("Poner Fin");

        btn_realizar.setText("Iniciar");

        btn_limpiar.setText("Reset");

        lbl_Dificultad.setText("Dificultad :");

        radio_obstaculo.setText("Poner Bloque");

        javax.swing.GroupLayout pnl_ControlsLayout = new javax.swing.GroupLayout(pnl_Controls);
        pnl_Controls.setLayout(pnl_ControlsLayout);
        pnl_ControlsLayout.setHorizontalGroup(
            pnl_ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ControlsLayout.createSequentialGroup()
                .addGroup(pnl_ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_ControlsLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbl_Titulo))
                    .addGroup(pnl_ControlsLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnl_ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(list_Metodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio_inicio)
                            .addGroup(pnl_ControlsLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(pnl_ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_realizar)
                                    .addComponent(btn_limpiar)))
                            .addGroup(pnl_ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lista_dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(radio_obstaculo))))
                    .addGroup(pnl_ControlsLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnl_ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Dificultad)
                            .addComponent(lbl_Metodo))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        pnl_ControlsLayout.setVerticalGroup(
            pnl_ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ControlsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Titulo)
                .addGap(19, 19, 19)
                .addComponent(lbl_Metodo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(list_Metodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(radio_inicio)
                .addGap(18, 18, 18)
                .addComponent(radio_fin)
                .addGap(18, 18, 18)
                .addComponent(radio_obstaculo)
                .addGap(38, 38, 38)
                .addComponent(lbl_Dificultad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lista_dificultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btn_realizar)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_Cuadricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_Controls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_Controls, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_Cuadricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_limpiar;
    public javax.swing.JButton btn_realizar;
    public javax.swing.ButtonGroup grp_Radios;
    private javax.swing.JLabel lbl_Dificultad;
    private javax.swing.JLabel lbl_Metodo;
    private javax.swing.JLabel lbl_Titulo;
    public javax.swing.JComboBox list_Metodos;
    public javax.swing.JComboBox lista_dificultad;
    private javax.swing.JPanel pnl_Controls;
    public javax.swing.JPanel pnl_Cuadricula;
    public javax.swing.JRadioButton radio_fin;
    public javax.swing.JRadioButton radio_inicio;
    public javax.swing.JRadioButton radio_obstaculo;
    // End of variables declaration//GEN-END:variables
}
