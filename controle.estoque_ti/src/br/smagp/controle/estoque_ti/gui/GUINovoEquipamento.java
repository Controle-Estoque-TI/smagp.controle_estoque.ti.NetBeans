/**
 * GUI RESPONSAVÉL POR MANTER TODOS OS TIPOS DE EQUIPAMENTOS ENCONTRADOS NO
 * SETOR DE TI DA SECRETARIA MUNICIPAL E GESTÃO DE PESSOAS
 *
 */
package br.smagp.controle.estoque_ti.gui;

import br.smagp.controle.estoque_ti.objects.ModeloTabela;
import br.smagp.controle.estoque_ti.dao.DAOFactory;
import br.smagp.controle.estoque_ti.dao.TipoEquipamentoDAO;
import br.smagp.controle.estoque_ti.db.ConnectionFactory;
import br.smagp.controle.estoque_ti.model.TipoEquipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author AllexOnRails
 */
public class GUINovoEquipamento extends javax.swing.JFrame {

    /**
     * CRIA UM NOVO FORMULÁRIO GUINovoEquipamento
     */
    //@atributoss necessários para relizar qualquer operação 
    //com a base de dados MYSQL 
    //-> statement -result_set - SQL - conecta
    private static Statement statement;
    private static ResultSet result_set;
    private PreparedStatement SQL;
    private String result;
    ConnectionFactory conecta = ConnectionFactory.getInstance();

    //INICIALIZA OS COMPONENTES PARA CRIAR O FORMULÁRIO
    public GUINovoEquipamento() {
        initComponents();
        this.setResizable(false);
        this.setLocation(250, 100);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        preencherTabela();
    }

    /**
     *
     * @author AllexOnRails
     *
     * Este metodo abaixo montado na mao serve para criar e exibir os dados
     * encontrados na tabela correspondente
     */
    public void preencherTabela() {
        ArrayList dados = new ArrayList(); //Cria uma Lista dados do tipo Array
        String[] Colunas = new String[]{ //Cria e Inicializa um Array do tipo String
            "ID", "Tipo do Equipamento"
        };
        TipoEquipamentoDAO data = new DAOFactory().getTipoEquipamento(); //instancia um novo tipo de equipamento
        dados = data.select(); //colecta todos os campos da tabela
        ModeloTabela modelo = new ModeloTabela(dados, Colunas); // Cria um novo modelo baseado nos parametros passados
        jTableTipoEquipamentos.setModel(modelo);
        jTableTipoEquipamentos.getColumnModel().getColumn(0).setPreferredWidth(120); //seta o tamanho da coluna em pixels
        jTableTipoEquipamentos.getColumnModel().getColumn(0).setResizable(false); // seta se a coluna pode ou não ser redimensionavel
        jTableTipoEquipamentos.getColumnModel().getColumn(1).setPreferredWidth(494);
        jTableTipoEquipamentos.getColumnModel().getColumn(1).setResizable(false);

        jTableTipoEquipamentos.getTableHeader().setReorderingAllowed(false);
        jTableTipoEquipamentos.setAutoResizeMode(jTableTipoEquipamentos.AUTO_RESIZE_OFF);
        jTableTipoEquipamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtType = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoEquipamentos = new javax.swing.JTable();
        btAlterar = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btPrimeiro = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuNovoItem = new javax.swing.JMenuItem();
        jMenuSelecionarItem = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel1.setText("Tipo de Equipamentos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tipo:");

        jtType.setText("(ex: Impressora)");
        jtType.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtType.setEnabled(false);

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-cadastrar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jTableTipoEquipamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableTipoEquipamentos);

        btAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-editar.png"))); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.setEnabled(false);
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/Previous.png"))); // NOI18N
        btAnterior.setEnabled(false);
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        btProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/Next.png"))); // NOI18N
        btProximo.setEnabled(false);
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("ID:");

        jtID.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtID.setEnabled(false);

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icon_voltar.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/First.png"))); // NOI18N
        btPrimeiro.setEnabled(false);
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });

        btUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/Last.png"))); // NOI18N
        btUltimo.setEnabled(false);
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-buscar.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setEnabled(false);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtType)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(231, 231, 231))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtType, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Iniciar");

        jMenuNovoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-cadastrar.png"))); // NOI18N
        jMenuNovoItem.setText("Novo item");
        jMenuNovoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoItemActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuNovoItem);

        jMenuSelecionarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-editar.png"))); // NOI18N
        jMenuSelecionarItem.setText("Selecionar item");
        jMenuSelecionarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSelecionarItemActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSelecionarItem);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-sair.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // Esta Action [PROCEDIMENTO] é responsável por salvar novos tipos de equipametos na base de dados.
        // ex: impressora, copiadora, nobreak
        // Apenas o tipo para que possam ser acessados na hora de cadastrar novo equipamento
        try {
            TipoEquipamento equipamento = new TipoEquipamento();//INSTANCIA UM NOVO TIPO DE EQUIPAMENTO
            equipamento.setTipo_equipamento(jtType.getText().toUpperCase()); //COLETA O CONTEUDO DESCRITO NO CAMPO DE TEXTO E SETA EM SET_TIPO_EQUIPAMENTO

            TipoEquipamentoDAO type = new DAOFactory().getTipoEquipamento(); //INSTANCIA UM NOVO TIPO_EQUIPAMENTO_DAO
            type.create(equipamento); //INSERE UM NOVO TIPO DE EQUIPAMENTO NA BASE DE DADOS
        } catch (SQLException ex) {
            ex.printStackTrace(); //SE OCORRER ALGUM ERRO A JANELA DESCRITA ABAIXO SERÁ EXIBIDDA
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
        preencherTabela(); //PREENCHE A TABELA NOVAMENTE COM DADOS ATUALIZADOS
        jtType.setEnabled(true);
        btSalvar.setEnabled(true);
        btBuscar.setEnabled(false);
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btPrimeiro.setEnabled(false);
        btProximo.setEnabled(false);
        btAnterior.setEnabled(false);
        btUltimo.setEnabled(false);
        jMenuNovoItem.setEnabled(false);
        jMenuSelecionarItem.setEnabled(true);
        jtType.setText("Informe aqui o novo tipo.");
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        TipoEquipamentoDAO type = new DAOFactory().getTipoEquipamento(); //INICIA UMA NOVA INSTANCIA DE TIPO EQUIPAMENTO DAO
        try {
            Connection conecta = ConnectionFactory.getInstance().getConnection(); //INICIA UMA NOVA CONEXAO COM A BASE DE DADOS
            SQL = conecta.prepareStatement("SELECT tipo FROM tipo_equipamentos WHERE tipo=?;"); //INICIA UM PREPARE STATEMENT COM O CODIGO SQL
            SQL.setString(1, jtType.getText());//NESTE PONTO COLETAMOS O CONTEUDO DO CAMPO DE TEXTO E ATRIBUIMOS O MESMO AO PREPARED STATEMENT
            result_set = SQL.executeQuery(); //NESTE MOMENTO ATRIBUIMOS AO RESULT SET A EXECUÇÃO DA QUERY

            while (result_set.next()) {
                result = result_set.getString("tipo");
            } //para cada item retornado pela tabela a variavel result a string correspondente

            if (!jtType.getText().equals(result)) { // caso o que esta sendo informado no campo de texto não seja compativel com o que se encontra na base de dados a mensagem de erro abaixo será exibida.
                System.out.println("Erro 404: Impossivel remover\nItem não encontrado.");
                JOptionPane.showMessageDialog(null, "Impossivel remover\nItem não encontrado. ", "ERRO 404", JOptionPane.ERROR_MESSAGE);
            } else {
                System.out.println("Sucesso: item " + result + " removido.");
                type.deleteFromType(result);//caso a mensagem de erro acima não seja exibida um item da tabela será removido
            }
            preencherTabela(); //PREENCHE A TABELA NOVAMENTE COM DADOS ATUALIZADOS
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }

        /**
         * As linhas abaixo setam se os determinados campos e botões serão
         * ablitados ou não
         */
        jtType.setEnabled(true);

        btSalvar.setEnabled(false);
        btCancelar.setEnabled(true);
        btExcluir.setEnabled(true);
        btAlterar.setEnabled(true);
        btPrimeiro.setEnabled(true);
        btUltimo.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
        btBuscar.setEnabled(true);

        jMenuNovoItem.setEnabled(false);
        jMenuSelecionarItem.setEnabled(true);
        //Fim do método excluir em tipo equipamento
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jMenuNovoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoItemActionPerformed
        jtType.setEnabled(true);
        btSalvar.setEnabled(true);
        btCancelar.setEnabled(true);
        jMenuNovoItem.setEnabled(false);
        jMenuSelecionarItem.setEnabled(false);
        jtType.setText("");
    }//GEN-LAST:event_jMenuNovoItemActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        jtType.setEnabled(false);
        btSalvar.setEnabled(false);
        btBuscar.setEnabled(false);
        btCancelar.setEnabled(false);
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        jMenuNovoItem.setEnabled(true);
        jMenuSelecionarItem.setEnabled(true);
        btPrimeiro.setEnabled(false);
        btUltimo.setEnabled(false);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(false);
        jtType.setText("ex: memória");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuSelecionarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSelecionarItemActionPerformed
        jtType.setEnabled(true);
        btSalvar.setEnabled(false);
        btCancelar.setEnabled(true);

        jMenuNovoItem.setEnabled(false);
        jMenuSelecionarItem.setEnabled(false);

        btPrimeiro.setEnabled(true);
        btUltimo.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);

        btBuscar.setEnabled(true);
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);

        jtType.setText("ex: memória");
    }//GEN-LAST:event_jMenuSelecionarItemActionPerformed

    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        btExcluir.setEnabled(true);
        btAlterar.setEnabled(true);
        try {
            //ConnectionFactory conecta = ConnectionFactory.getInstance();
            conecta.executaSQL("SELECT * FROM tipo_equipamentos;");
            if (conecta.result_set.first()) {
                jtID.setText(String.valueOf(conecta.result_set.getInt("id")));
                jtType.setText(conecta.result_set.getString("tipo"));
            }
            this.preencherTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        btExcluir.setEnabled(true);
        btAlterar.setEnabled(true);
        try {
            //ConnectionFactory conecta = ConnectionFactory.getInstance();
            conecta.executaSQL("SELECT * FROM tipo_equipamentos;");
            if (conecta.result_set.last()) {
                jtID.setText(String.valueOf(conecta.result_set.getInt("id")));
                jtType.setText(conecta.result_set.getString("tipo"));
            }
            this.preencherTabela();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        btExcluir.setEnabled(true);
        btAlterar.setEnabled(true);
        try {
            //ConnectionFactory conecta = ConnectionFactory.getInstance();
            //result = conecta.result_set.getString("tipo");
            if (conecta.result_set.previous()) {
                jtID.setText(String.valueOf(conecta.result_set.getInt("id")));
                jtType.setText(conecta.result_set.getString("tipo"));
            }
            this.preencherTabela();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Não foi retroceder a exibição do dado.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        btExcluir.setEnabled(true);
        btAlterar.setEnabled(true);
        try {
            //ConnectionFactory conecta = ConnectionFactory.getInstance();
            //result = conecta.result_set.getString("tipo");
            if (conecta.result_set.next()) {
                jtID.setText(String.valueOf(conecta.result_set.getInt("id")));
                jtType.setText(conecta.result_set.getString("tipo"));
            }
            this.preencherTabela();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Não foi avançar a exibição do dado.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btProximoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try {
            TipoEquipamentoDAO type = new DAOFactory().getTipoEquipamento(); //INICIA UMA NOVA INSTANCIA DE TIPO EQUIPAMENTO DAO
            TipoEquipamento equipamento = new TipoEquipamento(); //INSTANCIA UM NOVO TIPO_EQUIPAMENTO
            equipamento.setId(Integer.parseInt(jtID.getText())); // ATRIBUI O VALOR DO CAMPO DE TEXTO ID EM SET ID
            equipamento.setTipo_equipamento(jtType.getText().toUpperCase()); // ATRIBUI O VALOR DO CAMPO DE TEXTO TIPO EM SET TIPO EQUIPAMENTO
            type.update(equipamento); // EXECUTA O METODO UPDATE CONTIDO EM TIPO_EQUIPAMENTO_DAO
        } catch (SQLException ex) {
            Logger.getLogger(GUINovoEquipamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.preencherTabela(); //PREENCHE A TABELA NOVAMENTE COM DADOS ATUALIZADOS

        /**
         * As linhas abaixo setam se os determinados campos e botões serão
         * ablitados ou não
         */
        jtType.setEnabled(false);
        btSalvar.setEnabled(false);
        btCancelar.setEnabled(false);
        btExcluir.setEnabled(false);
        btAlterar.setEnabled(false);
        btPrimeiro.setEnabled(false);
        btUltimo.setEnabled(false);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(false);
        btBuscar.setEnabled(false);
        jMenuNovoItem.setEnabled(true);
        jMenuSelecionarItem.setEnabled(true);
        jtID.setText("");
        jtType.setText("ex: memória");
        //Fim do método aletrar em tipo equipamento
    }//GEN-LAST:event_btAlterarActionPerformed

    public void preencherTabelaPeloBotaoBuscar(String type) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{
            "ID", "Tipo"
        };
        TipoEquipamentoDAO data = new DAOFactory().getTipoEquipamento();
        dados = data.selectByType(type);
        if (dados.isEmpty()) {
            jtType.setText("Informe o novo tipo aqui.");
            jtType.setEnabled(true);
            btSalvar.setEnabled(true);
            btCancelar.setEnabled(true);
            btExcluir.setEnabled(false);
            btAlterar.setEnabled(false);
            btPrimeiro.setEnabled(false);
            btUltimo.setEnabled(false);
            btAnterior.setEnabled(false);
            btProximo.setEnabled(false);
            jMenuNovoItem.setEnabled(false);
            jMenuSelecionarItem.setEnabled(false);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jTableTipoEquipamentos.setModel(modelo);
        jTableTipoEquipamentos.getColumnModel().getColumn(0).setPreferredWidth(120); //seta o tamanho da coluna em pixels
        jTableTipoEquipamentos.getColumnModel().getColumn(0).setResizable(false); // seta se a coluna pode ou não ser redimensionavel
        jTableTipoEquipamentos.getColumnModel().getColumn(1).setPreferredWidth(494);
        jTableTipoEquipamentos.getColumnModel().getColumn(1).setResizable(false);

        jTableTipoEquipamentos.getTableHeader().setReorderingAllowed(false);
        jTableTipoEquipamentos.setAutoResizeMode(jTableTipoEquipamentos.AUTO_RESIZE_OFF);
        jTableTipoEquipamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }


    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        try {
            ConnectionFactory conecta = ConnectionFactory.getInstance();
            //result = conecta.result_set.getString("tipo");
            conecta.executaSQL("SELECT id, tipo FROM tipo_equipamentos WHERE tipo='" + jtType.getText() + "';");
            conecta.result_set.first();

            jtID.setText(String.valueOf(conecta.result_set.getInt("id")));
            jtType.setText(conecta.result_set.getString("tipo"));

            jtType.setEnabled(true);
            btSalvar.setEnabled(false);
            btCancelar.setEnabled(true);
            btExcluir.setEnabled(true);
            btAlterar.setEnabled(true);
            btPrimeiro.setEnabled(true);
            btUltimo.setEnabled(true);
            btAnterior.setEnabled(true);
            btProximo.setEnabled(true);
            jMenuNovoItem.setEnabled(false);
            jMenuSelecionarItem.setEnabled(false);

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Não foi retroceder a exibição do dado.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }

        if (jtType.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, digite o número de série que deseja buscar.");
        } else {
            preencherTabelaPeloBotaoBuscar(jtType.getText());
        }
    }//GEN-LAST:event_btBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(GUINovoEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUINovoEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUINovoEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUINovoEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUINovoEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuNovoItem;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jMenuSelecionarItem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoEquipamentos;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtType;
    // End of variables declaration//GEN-END:variables
}
