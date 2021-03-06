/**
 * ESTA GUI ESTÁ RESPONSÁVEL POR MANTER E EXIBIR OS EQUIPAMENTOS ENCONTRADOS NO
 * ESTOQUE DO SUPORTE DE TI
 *
 */
package br.smagp.controle.estoque_ti.gui;

//IMPORTES OBRIGATÓRIOS PARA REALIZAR AS TAREFAS CONTIDAS NESTE FORMULÁRIO
import br.smagp.controle.estoque_ti.objects.ModeloTabela;
import br.smagp.controle.estoque_ti.dao.DAOFactory;
import br.smagp.controle.estoque_ti.dao.EquipamentoDAO;
import br.smagp.controle.estoque_ti.db.ConnectionFactory;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

import br.smagp.controle.estoque_ti.gui.GUIMenu;
import br.smagp.controle.estoque_ti.model.Equipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author AllexOnRails
 */
public class GUIEquipamento extends javax.swing.JFrame {

    //@atributoss necessários para relizar qualquer operação 
    //com a base de dados MYSQL 
    //-> statement -result_set - SQL - conecta
    private static ResultSet result_set;
    private PreparedStatement SQL;
    private String result;
    Connection conecta = ConnectionFactory.getInstance().getConnection();

    /**
     * INICIALIZA O FORMULARIO
     */
    public GUIEquipamento() {
        this.initComponents();
        this.setResizable(false);
        this.setLocation(250, 100);
        this.setLocationRelativeTo(null);
        this.PreencherJTipoEquipamento();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.preencherTabela();
    }

    //COMPONENTES INICIALIZADOS PELO NET-BEANS
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtBuscarNumeroDeSerie = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jProgressBar1 = new javax.swing.JProgressBar();
        btExcluir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jtEquipamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtNumeroSerie = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtMarca = new javax.swing.JTextField();
        jtPatrimonio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btNovo = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTipoEquipamento = new javax.swing.JComboBox();
        btApagar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jtID = new javax.swing.JTextField();
        btAtualizarComboBox = new javax.swing.JButton();
        btPrimeiro = new javax.swing.JButton();
        btUltimo = new javax.swing.JButton();
        btAnterior = new javax.swing.JButton();
        btProximo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableFindEquipamento = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuListarTodosOsEquipamentos = new javax.swing.JMenuItem();
        jMenuNovoItemDeEquipamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Número de Série:");

        jtBuscarNumeroDeSerie.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jtBuscarNumeroDeSerie.setHighlighter(null);
        jtBuscarNumeroDeSerie.setSelectionColor(new java.awt.Color(204, 204, 204));

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-buscar.png"))); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/cancel2.png"))); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.setEnabled(false);
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
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

        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-editar.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Equipamento: ");

        jtEquipamento.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Número de série: ");

        jtNumeroSerie.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Marca: ");

        jtMarca.setEnabled(false);

        jtPatrimonio.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Patrimônio: ");

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-cadastrar.png"))); // NOI18N
        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-cadastrar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setEnabled(false);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tipo: ");

        jTipoEquipamento.setEnabled(false);

        btApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/Reset.png"))); // NOI18N
        btApagar.setText("Apagar");
        btApagar.setEnabled(false);
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");

        jtID.setEnabled(false);

        btAtualizarComboBox.setBackground(new java.awt.Color(204, 204, 255));
        btAtualizarComboBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-editar.png"))); // NOI18N
        btAtualizarComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btAtualizarComboBox.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        btAtualizarComboBox.setEnabled(false);
        btAtualizarComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarComboBoxActionPerformed(evt);
            }
        });

        btPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/First.png"))); // NOI18N
        btPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrimeiroActionPerformed(evt);
            }
        });

        btUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/Last.png"))); // NOI18N
        btUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUltimoActionPerformed(evt);
            }
        });

        btAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/Previous.png"))); // NOI18N
        btAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnteriorActionPerformed(evt);
            }
        });

        btProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/Next.png"))); // NOI18N
        btProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProximoActionPerformed(evt);
            }
        });

        jtableFindEquipamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtableFindEquipamento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtBuscarNumeroDeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)
                        .addGap(10, 10, 10)
                        .addComponent(btNovo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(121, 121, 121)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAtualizarComboBox))
                    .addComponent(jLabel6)
                    .addComponent(jtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btCancelar))
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addComponent(jtBuscarNumeroDeSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTipoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAtualizarComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(jtPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Arquivo");

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-sair.png"))); // NOI18N
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuListarTodosOsEquipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone_lapis.png"))); // NOI18N
        jMenuListarTodosOsEquipamentos.setText("Listar Equipamentos");
        jMenuListarTodosOsEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarTodosOsEquipamentosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuListarTodosOsEquipamentos);

        jMenuNovoItemDeEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/smagp/controle/estoque_ti/resources/icone-cadastrar.png"))); // NOI18N
        jMenuNovoItemDeEquipamento.setText("Novo tipo de equipamento");
        jMenuNovoItemDeEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNovoItemDeEquipamentoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuNovoItemDeEquipamento);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //METODO REPONSAVEL POR COLETAR TODOS OS ITENS DA BASE DE DADOS E 
    //PREENCHER A TABELA
    public void preencherTabela() {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{
            "ID", "Número de Série", "Descrição", "Tipo", "Marca", "Patrimônio"
        };
        EquipamentoDAO data = new DAOFactory().getEquipamento();
        dados = data.select();
        if (dados.isEmpty()) {
//            btNovo.setEnabled(false);
//            btBuscar.setEnabled(false);

            jtNumeroSerie.setText("Informe o nº de Série.");
            jtEquipamento.setText("Informe o equipamento.");
            jtMarca.setText("_TM");
            jtPatrimonio.setText("Informe o patrimonio.");

            jtBuscarNumeroDeSerie.setEnabled(false);
            jtNumeroSerie.setEnabled(true);
            jtEquipamento.setEnabled(true);
            jtMarca.setEnabled(true);
            jtPatrimonio.setEnabled(true);
            jTipoEquipamento.setEnabled(true);

            btSalvar.setEnabled(true);
            btApagar.setEnabled(true);
            btCancelar.setEnabled(true);
            btNovo.setEnabled(false);
            btExcluir.setEnabled(false);
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);

            btAtualizarComboBox.setEnabled(true);

        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jtableFindEquipamento.setModel(modelo);
        jtableFindEquipamento.getColumnModel().getColumn(0).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(0).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(1).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(1).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(2).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(2).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(3).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(3).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(4).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(4).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(5).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(5).setResizable(false);

        jtableFindEquipamento.getTableHeader().setReorderingAllowed(false);
        jtableFindEquipamento.setAutoResizeMode(jtableFindEquipamento.AUTO_RESIZE_OFF);
        jtableFindEquipamento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    //METODO REPONSAVEL POR COLETAR TODOS OS ITENS DA BASE DE DADOS E 
    //PREENCHER A TABELA COM BASE NO NUMERO DE SERIE
    public void preencherTabelaByNumeroDeSerie(String numero_de_serie_do_equipamento) {
        ArrayList dados = new ArrayList();
        String[] Colunas = new String[]{
            "ID", "Número de Série", "Descrição", "Tipo", "Marca", "Patrimônio"
        };
        EquipamentoDAO data = new DAOFactory().getEquipamento();
        dados = data.selectByNumeroDeSerie(numero_de_serie_do_equipamento);
        if (dados.isEmpty()) {
            btNovo.setEnabled(false);
            btBuscar.setEnabled(true);

            jtID.setText("");
            jtNumeroSerie.setText("Informe o nº de Série.");
            jtEquipamento.setText("Informe o equipamento.");
            jtMarca.setText("_TM");
            jtPatrimonio.setText("Informe o patrimonio.");

            jtBuscarNumeroDeSerie.setEnabled(false);
            jtNumeroSerie.setEnabled(true);
            jtEquipamento.setEnabled(true);
            jtMarca.setEnabled(true);
            jtPatrimonio.setEnabled(true);
            jTipoEquipamento.setEnabled(true);

            btSalvar.setEnabled(true);
            btApagar.setEnabled(true);
            btCancelar.setEnabled(true);
            btExcluir.setEnabled(false);
            btEditar.setEnabled(false);
            btExcluir.setEnabled(false);
        }
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        jtableFindEquipamento.setModel(modelo);
        jtableFindEquipamento.getColumnModel().getColumn(0).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(0).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(1).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(1).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(2).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(2).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(3).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(3).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(4).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(4).setResizable(false);
        jtableFindEquipamento.getColumnModel().getColumn(5).setPreferredWidth(120);
        jtableFindEquipamento.getColumnModel().getColumn(5).setResizable(false);

        jtableFindEquipamento.getTableHeader().setReorderingAllowed(false);
        jtableFindEquipamento.setAutoResizeMode(jtableFindEquipamento.AUTO_RESIZE_OFF);
        jtableFindEquipamento.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    //EVENTO GERADO PELO BOTAO CANCELAR
    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        /**
         * Abaixo setamos se os determinados componentes estarão abilitados ou
         * não
         */
        jtNumeroSerie.setEnabled(false);
        jtEquipamento.setEnabled(false);
        jtMarca.setEnabled(false);
        jtPatrimonio.setEnabled(false);
        jTipoEquipamento.setEnabled(false);
        btSalvar.setEnabled(false);
        btCancelar.setEnabled(false);
        btApagar.setEnabled(false);
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btAtualizarComboBox.setEnabled(false);

        btNovo.setEnabled(true);

        jtID.setText("");
        jtNumeroSerie.setText("");
        jtEquipamento.setText("");
        jtMarca.setText("_TM");
        jtPatrimonio.setText("");

        btBuscar.setEnabled(true);
        jtBuscarNumeroDeSerie.setEnabled(true);

        btPrimeiro.setEnabled(true);
        btUltimo.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);

        this.preencherTabela();
    }//GEN-LAST:event_btCancelarActionPerformed

    //EVENTO GERADO PELO BOTAO NOVO
    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        /**
         * Aqui se encontra o start do formulário de cadastro
         */
        jtNumeroSerie.setEnabled(true);
        jtEquipamento.setEnabled(true);
        jtMarca.setEnabled(true);
        jtPatrimonio.setEnabled(true);
        jTipoEquipamento.setEnabled(true);

        jtNumeroSerie.setText("");
        jtEquipamento.setText("");
        jtMarca.setText("_TM");
        jtPatrimonio.setText("");

        btNovo.setEnabled(false);
        btSalvar.setEnabled(true);
        btApagar.setEnabled(true);
        btCancelar.setEnabled(true);
        btBuscar.setEnabled(false);
        btAtualizarComboBox.setEnabled(true);

        btPrimeiro.setEnabled(false);
        btUltimo.setEnabled(false);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(false);

        jtBuscarNumeroDeSerie.setEnabled(false);
    }//GEN-LAST:event_btNovoActionPerformed

    //EVENTO GERADO PELO BOTAO SALVAR
    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // Esta Action [PROCEDIMENTO] é responsável por salvar os equipametos na base de dados.
        Equipamento equipamento = new Equipamento();
        equipamento.setN_serie_equipamento(jtNumeroSerie.getText());
        equipamento.setEquipamento(jtEquipamento.getText().toUpperCase());
        equipamento.setMarca_equipamento(jtMarca.getText().toUpperCase());
        equipamento.setTipo_equipamento(jTipoEquipamento.getSelectedItem().toString());
        equipamento.setPatrimonio(jtPatrimonio.getText());

        EquipamentoDAO dao = new DAOFactory().getEquipamento();
        try {
            dao.create(equipamento);
            System.out.println(dao.selectByNumeroDeSerie(equipamento.getN_serie_equipamento()));
            JOptionPane.showMessageDialog(null, equipamento.getEquipamento() + " registrado.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
        this.preencherTabela();
        /**
         * Logo abaixo todos os campos e botões do formulario são desabilitados
         * devido a inserção com sucesso dos dados na base de dados.
         */

        jtID.setEnabled(false);
        jtNumeroSerie.setEnabled(true);
        jtEquipamento.setEnabled(true);
        jtMarca.setEnabled(true);
        jtPatrimonio.setEnabled(true);
        jTipoEquipamento.setEnabled(true);
        btSalvar.setEnabled(true);
        btCancelar.setEnabled(true);
        btApagar.setEnabled(true);

        jtID.setText("");
        jtNumeroSerie.setText("");
        jtEquipamento.setText("");
        jtMarca.setText("_TM");
        jtPatrimonio.setText("");

        btNovo.setEnabled(false);
        btBuscar.setEnabled(false);
        jtBuscarNumeroDeSerie.setEnabled(false);

        btPrimeiro.setEnabled(false);
        btUltimo.setEnabled(false);
        btAnterior.setEnabled(false);
        btProximo.setEnabled(false);
    }//GEN-LAST:event_btSalvarActionPerformed

    //METODO RESPONSAVEL POR PREENCHER O COMBO-BOX UTILIZADO
    private void PreencherJTipoEquipamento() {
        try {
            Connection conecta = ConnectionFactory.getInstance().getConnection(); //INICIALIZA UM NOVA CONEXAO COM A BASE DE DADOS
            PreparedStatement SQL = conecta.prepareStatement("SELECT tipo FROM tipo_equipamentos;"); //CRIA UM PREPARED STATEMENT COM O SQL

            ResultSet result_set = SQL.executeQuery(); //EXECUTA O SQL GERADO PELO PREPARED STATEMENT

            while (result_set.next()) { //COLETA O ITEM SELECIONADO  E ATRIBUI AO COMBO-BOX
                String tipo = result_set.getString("tipo");
                jTipoEquipamento.addItem(tipo);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nehum item encontrado em: tipo_equipamentos", "Erro 404 - NOT FOUND", JOptionPane.WARNING_MESSAGE);
        }
    }

    //EVENTO GERADO PELO BOTAO APAGAR
    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        jtID.setText("");
        jtNumeroSerie.setText("");
        jtEquipamento.setText("");
        jtMarca.setText("_TM");
        jtPatrimonio.setText("");
    }//GEN-LAST:event_btApagarActionPerformed

    //EVENTO GERADO PELO BOTAO SAIR
    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuSairActionPerformed

    //EVENTO GERADO PELO MENU NOVO ITEM DE EQUIPAMENTO
    private void jMenuNovoItemDeEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNovoItemDeEquipamentoActionPerformed
        new GUINovoEquipamento().setVisible(true);
    }//GEN-LAST:event_jMenuNovoItemDeEquipamentoActionPerformed

    //EVENTO GERADO PELO BOTAO EDITAR
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        Equipamento equipamentoModel = new Equipamento();
        EquipamentoDAO equipamento = new DAOFactory().getEquipamento(); //INICIA UMA NOVA INSTANCIA DE EQUIPAMENTO DAO

        /**
         * Abaixo estamos coletando os dados contidos no formulário estando
         * estes alterados ou não e ao mesmo tempo estamos jogando estes no
         * metodo update em EquipamentoDAO
         */
        equipamentoModel.setId(Integer.parseInt(jtID.getText()));
        equipamentoModel.setN_serie_equipamento(jtNumeroSerie.getText().toUpperCase());
        equipamentoModel.setEquipamento(jtEquipamento.getText().toUpperCase());
        equipamentoModel.setTipo_equipamento(jTipoEquipamento.getSelectedItem().toString());
        equipamentoModel.setMarca_equipamento(jtMarca.getText().toUpperCase());
        equipamentoModel.setPatrimonio(jtPatrimonio.getText());

        try {
            equipamento.update(equipamentoModel); //EXCUTAMOS O METODO UPDATE EM EQUIPAMENTO_DAO RESPONSAVEL POR GERAR O COMANDO UPDATE DO SQL
        } catch (SQLException ex) {
            Logger.getLogger(GUIEquipamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.preencherTabela(); //PREENCHE A TABELA NOVAMENTE COM DADOS ATUALIZADOS

        /**
         * As linhas abaixo setam se os determinados campos e botões serão
         * ablitados ou não
         */
        jtNumeroSerie.setEnabled(false);
        jtEquipamento.setEnabled(false);
        jtMarca.setEnabled(false);
        jtPatrimonio.setEnabled(false);
        jTipoEquipamento.setEnabled(false);

        btSalvar.setEnabled(false);
        btCancelar.setEnabled(false);
        btApagar.setEnabled(false);
        btEditar.setEnabled(false);
        btExcluir.setEnabled(false);
        btAtualizarComboBox.setEnabled(false);

        btNovo.setEnabled(true);

        jtID.setText("");
        jtNumeroSerie.setText("");
        jtEquipamento.setText("");
        jtMarca.setText("_TM");
        jtPatrimonio.setText("");

        btBuscar.setEnabled(true);
        jtBuscarNumeroDeSerie.setEnabled(true);

        btPrimeiro.setEnabled(true);
        btUltimo.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);

        //Fim do método alterar em equipamento
    }//GEN-LAST:event_btEditarActionPerformed

    //EVENTO GERADO PELO BOTAO BUSCAR
    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        try {
            ConnectionFactory conecta = ConnectionFactory.getInstance(); //UMA INSTANCIA DA CONEXAO COM A BASE DE DADOS É CRIADA
            conecta.executaSQL("SELECT * FROM equipamentos WHERE n_serie='" + jtBuscarNumeroDeSerie.getText() + "';"); // EXECUTAMOS O METODO EXECUTA SQL PASSANDO O SEGUINTE SQL
            conecta.result_set.first();// COLETAMOS OS DADOS RETORNANDOS PELO SQL

            /**
             * ATRIBUIMOS AOS CAMPOS DE TEXTO OS VALORES COLETADO PELA EXECUÇÃO
             * DO DO EXECUTA_SQL
             */
            jtID.setText(String.valueOf(conecta.result_set.getInt("id")));
            jtNumeroSerie.setText(conecta.result_set.getString("n_serie"));
            jtEquipamento.setText(conecta.result_set.getString("descricao"));
            jtMarca.setText(conecta.result_set.getString("marca"));
            jtPatrimonio.setText(conecta.result_set.getString("patrimonio"));

            jtNumeroSerie.setEnabled(true);
            jtEquipamento.setEnabled(true);
            jtMarca.setEnabled(true);
            jtPatrimonio.setEnabled(true);
            jTipoEquipamento.setEnabled(true);

            btSalvar.setEnabled(false);
            btEditar.setEnabled(true);
            btApagar.setEnabled(false);
            btCancelar.setEnabled(true);
            btExcluir.setEnabled(true);
            btNovo.setEnabled(false);
            btAtualizarComboBox.setEnabled(true);

            btPrimeiro.setEnabled(true);
            btUltimo.setEnabled(true);
            btAnterior.setEnabled(true);
            btProximo.setEnabled(true);

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Não foi retroceder a exibição do dado.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }

        if (jtBuscarNumeroDeSerie.getText().isEmpty()) { //CASO O CAMPO DE TEXTO ESTEJA VAZIO E SEJA PRESSIONADO O BOTAO BUSCAR A MENSAGEM DE ERRO ABAIXO SERÁ EXIBIDA
            JOptionPane.showMessageDialog(null, "Por favor, digite o número de série que deseja buscar.");
        } else {
            preencherTabelaByNumeroDeSerie(jtBuscarNumeroDeSerie.getText()); //PREENCHE A TABELA COM O ELEMENTO RETORNADO
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    //EVENTO GERADO PELO BOTAO EXCLUIR
    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        EquipamentoDAO equipamento = new DAOFactory().getEquipamento(); //INICIA UMA NOVA INSTANCIA DE TIPO EQUIPAMENTO DAO
        try {
            Connection conecta = ConnectionFactory.getInstance().getConnection(); //INICIA UMA NOVA CONEXAO COM A BASE DE DADOS
            SQL = conecta.prepareStatement("SELECT * FROM equipamentos WHERE n_serie=?;"); //INICIA UM PREPARE STATEMENT COM O CODIGO SQL
            SQL.setString(1, jtBuscarNumeroDeSerie.getText());//NESTE PONTO COLETAMOS O CONTEUDO DO CAMPO DE TEXTO E ATRIBUIMOS O MESMO AO PREPARED STATEMENT
            result_set = SQL.executeQuery(); //NESTE MOMENTO ATRIBUIMOS AO RESULT SET A EXECUÇÃO DA QUERY

            while (result_set.next()) {
                result = result_set.getString("n_serie");
            }

            equipamento.delete(result);//caso a mensagem de erro acima não seja exibida um item da tabela será removido
            preencherTabela(); //PREENCHE A TABELA NOVAMENTE COM DADOS ATUALIZADOS
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "ERRO: " + ex, "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }

        /**
         * As linhas abaixo setam se os determinados campos e botões serão
         * ablitados ou não
         */
        //campos de textos e combo box
        jtID.setEnabled(false);
        jtNumeroSerie.setEnabled(false);
        jtEquipamento.setEnabled(false);
        jtMarca.setEnabled(false);
        jtPatrimonio.setEnabled(false);
        jTipoEquipamento.setEnabled(false);

        //botoes em false
        btSalvar.setEnabled(false);
        btCancelar.setEnabled(false);
        btApagar.setEnabled(false);
        btAtualizarComboBox.setEnabled(false);
        btExcluir.setEnabled(false);
        btEditar.setEnabled(false);

        //resetando o conteudo dos campos de texto
        jtID.setText("");
        jtNumeroSerie.setText("");
        jtEquipamento.setText("");
        jtMarca.setText("_TM");
        jtPatrimonio.setText("");

        //botoes em true
        btNovo.setEnabled(true);
        btBuscar.setEnabled(true);
        jtBuscarNumeroDeSerie.setEnabled(true);

        btPrimeiro.setEnabled(true);
        btUltimo.setEnabled(true);
        btAnterior.setEnabled(true);
        btProximo.setEnabled(true);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void jMenuListarTodosOsEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarTodosOsEquipamentosActionPerformed
        new GUIListEquipamentos().setVisible(true);
    }//GEN-LAST:event_jMenuListarTodosOsEquipamentosActionPerformed

    private void btAtualizarComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarComboBoxActionPerformed
        this.PreencherJTipoEquipamento();
    }//GEN-LAST:event_btAtualizarComboBoxActionPerformed


    private void btPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrimeiroActionPerformed
        try {
            SQL = conecta.prepareStatement("SELECT * FROM equipamentos;");
            result_set = SQL.executeQuery();
            if (result_set.first()) {
                jtID.setText(String.valueOf(result_set.getInt("id")));
                jtNumeroSerie.setText(result_set.getString("n_serie"));
                jtEquipamento.setText(result_set.getString("descricao"));
                jtMarca.setText(result_set.getString("marca"));
                jtPatrimonio.setText(result_set.getString("patrimonio"));

                //campos de textos e combo box
                jtID.setEnabled(false);
                jtNumeroSerie.setEnabled(true);
                jtEquipamento.setEnabled(true);
                jtMarca.setEnabled(true);
                jtPatrimonio.setEnabled(true);
                jTipoEquipamento.setEnabled(true);

                //botoes desativados
                btSalvar.setEnabled(false);

                //botoes abilitados
                btCancelar.setEnabled(true);
                btApagar.setEnabled(true);
                btAtualizarComboBox.setEnabled(true);
                btExcluir.setEnabled(true);
                btEditar.setEnabled(true);
                this.preencherTabela();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Impossivel continuar.\nSelecione o primeiro ou o último elemento para continuar.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Impossivel continuar.\nSelecione o primeiro ou o último elemento para continuar.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btPrimeiroActionPerformed

    private void btUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUltimoActionPerformed
        try {
            SQL = conecta.prepareStatement("SELECT * FROM equipamentos;");
            result_set = SQL.executeQuery();
            if (result_set.last()) {
                jtID.setText(String.valueOf(result_set.getInt("id")));
                jtNumeroSerie.setText(result_set.getString("n_serie"));
                jtEquipamento.setText(result_set.getString("descricao"));
                jtMarca.setText(result_set.getString("marca"));
                jtPatrimonio.setText(result_set.getString("patrimonio"));

                //campos de textos e combo box
                jtID.setEnabled(false);
                jtNumeroSerie.setEnabled(true);
                jtEquipamento.setEnabled(true);
                jtMarca.setEnabled(true);
                jtPatrimonio.setEnabled(true);
                jTipoEquipamento.setEnabled(true);

                //botoes desativados
                btSalvar.setEnabled(false);

                //botoes abilitados
                btCancelar.setEnabled(true);
                btApagar.setEnabled(true);
                btAtualizarComboBox.setEnabled(true);
                btExcluir.setEnabled(true);
                btEditar.setEnabled(true);

                this.preencherTabela();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Impossivel continuar.\nSelecione o primeiro ou o último elemento para continuar.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Impossivel continuar.\nSelecione o primeiro ou o último elemento para continuar.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btUltimoActionPerformed

    private void btAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnteriorActionPerformed
        try {

            if (result_set.previous()) {
                jtID.setText(String.valueOf(result_set.getInt("id")));
                jtNumeroSerie.setText(result_set.getString("n_serie"));
                jtEquipamento.setText(result_set.getString("descricao"));
                jtMarca.setText(result_set.getString("marca"));
                jtPatrimonio.setText(result_set.getString("patrimonio"));

                //campos de textos e combo box
                jtID.setEnabled(false);
                jtNumeroSerie.setEnabled(true);
                jtEquipamento.setEnabled(true);
                jtMarca.setEnabled(true);
                jtPatrimonio.setEnabled(true);
                jTipoEquipamento.setEnabled(true);

                //botoes desativados
                btSalvar.setEnabled(false);

                //botoes abilitados
                btCancelar.setEnabled(true);
                btApagar.setEnabled(true);
                btAtualizarComboBox.setEnabled(true);
                btExcluir.setEnabled(true);
                btEditar.setEnabled(true);

                this.preencherTabela();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Impossivel continuar.\nSelecione o primeiro ou o último elemento para continuar.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Impossivel continuar.\nSelecione o primeiro ou o último elemento para continuar.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btAnteriorActionPerformed

    private void btProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProximoActionPerformed
        try {
            if (result_set.next()) {
                jtID.setText(String.valueOf(result_set.getInt("id")));
                jtNumeroSerie.setText(result_set.getString("n_serie"));
                jtEquipamento.setText(result_set.getString("descricao"));
                jtMarca.setText(result_set.getString("marca"));
                jtPatrimonio.setText(result_set.getString("patrimonio"));
                //campos de textos e combo box
                jtID.setEnabled(false);
                jtNumeroSerie.setEnabled(true);
                jtEquipamento.setEnabled(true);
                jtMarca.setEnabled(true);
                jtPatrimonio.setEnabled(true);
                jTipoEquipamento.setEnabled(true);

                //botoes desativados
                btSalvar.setEnabled(false);

                //botoes abilitados
                btCancelar.setEnabled(true);
                btApagar.setEnabled(true);
                btAtualizarComboBox.setEnabled(true);
                btExcluir.setEnabled(true);
                btEditar.setEnabled(true);

                this.preencherTabela();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Impossivel continuar.\nSelecione o primeiro ou o último elemento para continuar.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "ERRO: Impossivel continuar.\nSelecione o primeiro ou o último elemento para continuar.", "ERRO 504", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btProximoActionPerformed

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
            java.util.logging.Logger.getLogger(GUIEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEquipamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUIEquipamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnterior;
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btAtualizarComboBox;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPrimeiro;
    private javax.swing.JButton btProximo;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuListarTodosOsEquipamentos;
    private javax.swing.JMenuItem jMenuNovoItemDeEquipamento;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox jTipoEquipamento;
    private javax.swing.JTextField jtBuscarNumeroDeSerie;
    private javax.swing.JTextField jtEquipamento;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtNumeroSerie;
    private javax.swing.JTextField jtPatrimonio;
    private javax.swing.JTable jtableFindEquipamento;
    // End of variables declaration//GEN-END:variables
}
