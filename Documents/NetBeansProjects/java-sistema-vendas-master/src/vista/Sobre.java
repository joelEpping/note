package vista;

/**
 * Janela sobre a aplicação
 *
 * @author Juliano
 */
public class Sobre extends javax.swing.JDialog {

    public Sobre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbIcone = new javax.swing.JLabel();
        taTexto = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        lbIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sobre.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 20);
        getContentPane().add(lbIcone, gridBagConstraints);

        taTexto.setEditable(false);
        taTexto.setColumns(20);
        taTexto.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        taTexto.setRows(5);
        taTexto.setText("Sistema de Stock\nAutor: Joel Sanchez, Diego Lusberg y Francisco Man.\nFacultad Politecnica UNE\n\nEl presente sistema permite la busqueda, creación\nborrado y actualización dinámica de los datos para \nuna distribuidora de electrodemisticos.");
        taTexto.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        taTexto.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(taTexto, gridBagConstraints);

        setSize(new java.awt.Dimension(330, 220));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbIcone;
    private javax.swing.JTextArea taTexto;
    // End of variables declaration//GEN-END:variables
}
