package vista;

import modelo.Usuario;
import javax.swing.JOptionPane;

/**
 * Janela menu da aplicação
 *
 * @author Juliano
 */
public class Menu extends javax.swing.JFrame {
   static  Usuario usuarioonline = new Usuario();
    public Menu() {
        initComponents();
         
    }
    
    public Menu(Usuario usuario){
        initComponents();
        usuarioonline = usuario;
        JOptionPane.showMessageDialog(null, "Bienvenido: "+usuarioonline.getNombre());
        if(usuarioonline.getNivel_acceso()==0){
            btUsuario.setEnabled(false);
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btVenda = new javax.swing.JButton();
        btProduto = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        btUsuario = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        miProduto = new javax.swing.JMenuItem();
        miCliente = new javax.swing.JMenuItem();
        miFornecedor = new javax.swing.JMenuItem();
        menuMovimentos = new javax.swing.JMenu();
        miVenda = new javax.swing.JMenuItem();
        miCompra = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Vendas");

        toolBar.setFloatable(false);

        btVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venda.png"))); // NOI18N
        btVenda.setText("Venta");
        btVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btVenda.setFocusable(false);
        btVenda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVenda.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/venda-foco.png"))); // NOI18N
        btVenda.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btVenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        toolBar.add(btVenda);

        btProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/produto-foco.png"))); // NOI18N
        btProduto.setText("Produto");
        btProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btProduto.setFocusable(false);
        btProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProduto.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/produto-foco.png"))); // NOI18N
        btProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        toolBar.add(btProduto);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCliente.setFocusable(false);
        btCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCliente.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente-foco.png"))); // NOI18N
        btCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        toolBar.add(btCliente);

        btUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fornecedor-foco.png"))); // NOI18N
        btUsuario.setText("Usuarios");
        btUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btUsuario.setFocusable(false);
        btUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btUsuario.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fornecedor-foco.png"))); // NOI18N
        btUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        toolBar.add(btUsuario);

        btSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sair-foco.png"))); // NOI18N
        btSair.setText("Sair");
        btSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSair.setFocusable(false);
        btSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSair.setMargin(new java.awt.Insets(2, 12, 2, 12));
        btSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sair-foco.png"))); // NOI18N
        btSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        toolBar.add(btSair);

        getContentPane().add(toolBar, java.awt.BorderLayout.PAGE_START);

        desktopPane.setOpaque(false);
        getContentPane().add(desktopPane, java.awt.BorderLayout.CENTER);

        menuCadastros.setText("Cadastros");

        miProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        miProduto.setText("Cadastrar Produto");
        miProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        menuCadastros.add(miProduto);

        miCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        miCliente.setText("Cadastrar Cliente");
        miCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClienteActionPerformed(evt);
            }
        });
        menuCadastros.add(miCliente);

        miFornecedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        miFornecedor.setText("Cadastrar Fornecedor");
        miFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miFornecedorActionPerformed(evt);
            }
        });
        menuCadastros.add(miFornecedor);

        menuBar.add(menuCadastros);

        menuMovimentos.setText("Movimentos");

        miVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        miVenda.setText("Registrar Venda");
        miVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miVendaActionPerformed(evt);
            }
        });
        menuMovimentos.add(miVenda);

        miCompra.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        miCompra.setText("Registrar Compra");
        miCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCompraActionPerformed(evt);
            }
        });
        menuMovimentos.add(miCompra);

        menuBar.add(menuMovimentos);

        menuSistema.setText("Sistema");

        miSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        menuSistema.add(miSobre);

        miSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        miSair.setText("Sair");
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        menuSistema.add(miSair);

        menuBar.add(menuSistema);

        setJMenuBar(menuBar);

        setSize(new java.awt.Dimension(900, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutoActionPerformed
        RegistraProducto c = new RegistraProducto();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miProdutoActionPerformed

    private void miClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClienteActionPerformed
        RegistroCliente c = new RegistroCliente();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miClienteActionPerformed

    private void miFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miFornecedorActionPerformed
        RegistroUsuario c = new RegistroUsuario();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miFornecedorActionPerformed

    private void miVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miVendaActionPerformed
        RegistrarVenta v = new RegistrarVenta();
        desktopPane.add(v);
        v.setVisible(true);
    }//GEN-LAST:event_miVendaActionPerformed

    private void miCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCompraActionPerformed
        LancamentoCompra c = new LancamentoCompra();
        desktopPane.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_miCompraActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        Sobre s = new Sobre(this, true);
        s.setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btProduto;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton btVenda;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuMovimentos;
    private javax.swing.JMenu menuSistema;
    private javax.swing.JMenuItem miCliente;
    private javax.swing.JMenuItem miCompra;
    private javax.swing.JMenuItem miFornecedor;
    private javax.swing.JMenuItem miProduto;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miVenda;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
}
