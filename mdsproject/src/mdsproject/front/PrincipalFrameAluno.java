/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdsproject.front;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mdsproject.dao.ArtefatoDao;
import mdsproject.dao.UsuarioDao;

/**
 *
 * @author jhordangabriel
 */
public class PrincipalFrameAluno extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalFrame
     */
    public PrincipalFrameAluno() {
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

        jMenuItem6 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        panelContent = new javax.swing.JPanel();
        panelBuscar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buscarArtTf = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultBuscaTa = new javax.swing.JTextArea();
        panelInserirArtefato = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        nomeArtTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        conteudoArtTa = new javax.swing.JTextArea();
        inserirArtBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        panelListarArtefatos = new javax.swing.JPanel();
        labelListaArtefatos = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaArtTa = new javax.swing.JTextArea();
        panelCadastrar = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        tipoUsuaCb = new javax.swing.JComboBox<>();
        salvarUsuaBtn = new javax.swing.JButton();
        limparUsuaBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        artefatoNav = new javax.swing.JMenu();
        localizarNav = new javax.swing.JMenuItem();
        controleNav = new javax.swing.JMenu();
        arquivosNav = new javax.swing.JMenu();
        cadastrarNav = new javax.swing.JMenuItem();
        listarNav = new javax.swing.JMenuItem();
        cadastrarUsuaNav = new javax.swing.JMenuItem();
        perfilNav = new javax.swing.JMenu();
        sairNav = new javax.swing.JMenuItem();

        jMenuItem6.setText("jMenuItem6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelContent.setBackground(new java.awt.Color(255, 255, 255));
        panelContent.setLayout(new java.awt.CardLayout());

        panelBuscar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nome do Arquivo");

        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        resultBuscaTa.setEditable(false);
        resultBuscaTa.setColumns(20);
        resultBuscaTa.setRows(5);
        jScrollPane2.setViewportView(resultBuscaTa);

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3)
                    .addGroup(panelBuscarLayout.createSequentialGroup()
                        .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBuscarLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBuscarLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarArtTf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarBtn)
                    .addComponent(buscarArtTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        panelContent.add(panelBuscar, "card2");

        panelInserirArtefato.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Nome do Artefato");

        jLabel4.setText("Conteúdo do Artefato");

        conteudoArtTa.setColumns(20);
        conteudoArtTa.setRows(5);
        jScrollPane4.setViewportView(conteudoArtTa);

        inserirArtBtn.setText("Inserir");
        inserirArtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inserirArtBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Cadastro de Artefatos");

        javax.swing.GroupLayout panelInserirArtefatoLayout = new javax.swing.GroupLayout(panelInserirArtefato);
        panelInserirArtefato.setLayout(panelInserirArtefatoLayout);
        panelInserirArtefatoLayout.setHorizontalGroup(
            panelInserirArtefatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInserirArtefatoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelInserirArtefatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelInserirArtefatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inserirArtBtn)
                        .addGroup(panelInserirArtefatoLayout.createSequentialGroup()
                            .addGroup(panelInserirArtefatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(panelInserirArtefatoLayout.createSequentialGroup()
                                    .addGap(118, 118, 118)
                                    .addComponent(jLabel5))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nomeArtTf, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGap(6, 6, 6))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        panelInserirArtefatoLayout.setVerticalGroup(
            panelInserirArtefatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInserirArtefatoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeArtTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inserirArtBtn)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        panelContent.add(panelInserirArtefato, "card2");

        panelListarArtefatos.setBackground(new java.awt.Color(255, 255, 255));

        labelListaArtefatos.setText("Lista de Artefatos");

        listaArtTa.setColumns(20);
        listaArtTa.setRows(5);
        jScrollPane3.setViewportView(listaArtTa);

        javax.swing.GroupLayout panelListarArtefatosLayout = new javax.swing.GroupLayout(panelListarArtefatos);
        panelListarArtefatos.setLayout(panelListarArtefatosLayout);
        panelListarArtefatosLayout.setHorizontalGroup(
            panelListarArtefatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarArtefatosLayout.createSequentialGroup()
                .addGroup(panelListarArtefatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListarArtefatosLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(labelListaArtefatos))
                    .addGroup(panelListarArtefatosLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelListarArtefatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        panelListarArtefatosLayout.setVerticalGroup(
            panelListarArtefatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListarArtefatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelListaArtefatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        labelListaArtefatos.getAccessibleContext().setAccessibleName("Lista de Artefatos");

        panelContent.add(panelListarArtefatos, "card2");

        panelCadastrar.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.add(panelContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        artefatoNav.setText("Artefatos");

        localizarNav.setText("Localizar");
        localizarNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localizarNavActionPerformed(evt);
            }
        });
        artefatoNav.add(localizarNav);

        jMenuBar1.add(artefatoNav);

        controleNav.setText("Controle");

        arquivosNav.setText("Arquivos");

        cadastrarNav.setText("Cadastrar");
        cadastrarNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarNavActionPerformed(evt);
            }
        });
        arquivosNav.add(cadastrarNav);

        listarNav.setText("Listar");
        listarNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarNavActionPerformed(evt);
            }
        });
        arquivosNav.add(listarNav);

        controleNav.add(arquivosNav);

        jMenuBar1.add(controleNav);

        perfilNav.setText("Perfil");

        sairNav.setText("Sair");
        sairNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairNavActionPerformed(evt);
            }
        });
        perfilNav.add(sairNav);

        jMenuBar1.add(perfilNav);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void limparUsuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparUsuaBtnActionPerformed
        nomeUsuaTf.setText("");
        senhaUsuaPf.setText("");
    }//GEN-LAST:event_limparUsuaBtnActionPerformed

    private void salvarUsuaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarUsuaBtnActionPerformed
        String nome = nomeUsuaTf.getText();
        String senha = senhaUsuaPf.getText();
        int type = tipoUsuaCb.getSelectedIndex();
        
        if(!nome.isEmpty() && !senha.isEmpty()){
            try {
                UsuarioDao.cadastrar(nome, senha, type);
            } catch (IOException ex) {
                Logger.getLogger(PrincipalFrameProfessor.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Usuário " + nome + " cadastrado com sucesso!");
            nomeUsuaTf.setText("");
            senhaUsuaPf.setText("");
        }else{
            JOptionPane.showMessageDialog(null, "Ocorreu um erro! Favor preencha todos os campos.");
        }
    }//GEN-LAST:event_salvarUsuaBtnActionPerformed

    private void sairNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairNavActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }//GEN-LAST:event_sairNavActionPerformed

    private void inserirArtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inserirArtBtnActionPerformed
        // TODO add your handling code here:
        String filename = nomeArtTf.getText();
        String content = conteudoArtTa.getText();
        
        try {
            
            ArtefatoDao.cadastrar(filename, content);
            JOptionPane.showMessageDialog(null, "Artefato " + filename + " cadastrado com sucesso!");
            nomeArtTf.setText("");
            conteudoArtTa.setText("");
            
        } catch (IOException ex) {
            Logger.getLogger(PrincipalFrameProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_inserirArtBtnActionPerformed

    private void cadastrarNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarNavActionPerformed
        // TODO add your handling code here:
        panelContent.removeAll();
        panelContent.repaint();
        panelContent.revalidate();
        panelContent.add(panelInserirArtefato);
        panelContent.repaint();
        panelContent.revalidate();
    }//GEN-LAST:event_cadastrarNavActionPerformed

    private void listarNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarNavActionPerformed
        panelContent.removeAll();
        panelContent.repaint();
        panelContent.revalidate();
        panelContent.add(panelListarArtefatos);
        panelContent.repaint();
        panelContent.revalidate();
        
         try {
            String lista = ArtefatoDao.listar();
            listaArtTa.setText(lista);
            listaArtTa.setEditable(false);
            // TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrincipalFrameProfessor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Base64DecodingException ex) {
            Logger.getLogger(PrincipalFrameProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_listarNavActionPerformed

    private void localizarNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localizarNavActionPerformed
        // TODO add your handling code here:
        panelContent.removeAll();
        panelContent.repaint();
        panelContent.revalidate();
        panelContent.add(panelBuscar);
        panelContent.repaint();
        panelContent.revalidate();
        resultBuscaTa.setText("");
    }//GEN-LAST:event_localizarNavActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
        
        String txt = buscarArtTf.getText();
        String lista = ArtefatoDao.localizar(txt);
        resultBuscaTa.setText(lista);
    }//GEN-LAST:event_buscarBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SenhaUsuaLbl;
    private javax.swing.JMenu arquivosNav;
    private javax.swing.JMenu artefatoNav;
    private javax.swing.JTextField buscarArtTf;
    private javax.swing.JButton buscarBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem cadastrarNav;
    private javax.swing.JMenuItem cadastrarUsuaNav;
    private javax.swing.JTextArea conteudoArtTa;
    private javax.swing.JMenu controleNav;
    private javax.swing.JButton inserirArtBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel labelListaArtefatos;
    private javax.swing.JButton limparUsuaBtn;
    private javax.swing.JTextArea listaArtTa;
    private javax.swing.JMenuItem listarNav;
    private javax.swing.JMenuItem localizarNav;
    private javax.swing.JTextField nomeArtTf;
    private javax.swing.JLabel nomeUsuaLbl;
    private javax.swing.JTextField nomeUsuaTf;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelCadastrar;
    private javax.swing.JPanel panelContent;
    private javax.swing.JPanel panelInserirArtefato;
    private javax.swing.JPanel panelListarArtefatos;
    private javax.swing.JMenu perfilNav;
    private javax.swing.JTextArea resultBuscaTa;
    private javax.swing.JMenuItem sairNav;
    private javax.swing.JButton salvarUsuaBtn;
    private javax.swing.JPasswordField senhaUsuaPf;
    private javax.swing.JComboBox<String> tipoUsuaCb;
    // End of variables declaration//GEN-END:variables
}
