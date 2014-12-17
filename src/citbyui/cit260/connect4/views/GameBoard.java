/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.views;

import citbyui.cit260.connect4.control.GameMenuControl;
import citbyui.cit260.connect4.enums.GameStatus;
import citbyui.cit260.connect4.enums.GameType;
import citbyui.cit260.connect4.enums.PlayerType;
import citbyui.cit260.connect4.exceptions.Connect4Exception;
import citbyui.cit260.connect4.exceptions.GameException;
import citbyui.cit260.connect4.models.Game;
import citbyui.cit260.connect4.models.PlayerName;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
/**
 *
 * @author Sarah & Patti
 */
public class GameBoard extends javax.swing.JFrame {
    private String currentMarker = null;
    private Game game = null;
    private GameMenuControl gameCommands = null;
    /**
     * Creates new form GameMenu
     */
    public GameBoard() {
        this.initComponents();
        this.initializeFrame();
        setLocationRelativeTo(null);
    }
    
    public GameBoard(Game game) {
        this();
        this.game = game;
        this.gameCommands = new GameMenuControl(game);
    }
    
    
    
    public void initializeFrame() {
        /* Create and display the form */
        

        connectFourTable.getTableHeader().setVisible(false);
        connectFourTable.getTableHeader().setPreferredSize(new Dimension(0, 0));
        connectFourTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        Color backgroundColor = connectFourTable.getBackground();
        connectFourTable.setSelectionBackground(backgroundColor);

        CellRenderer cellRenderer = new CellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableColumnModel columnTableModel = connectFourTable.getColumnModel();
        for (int i = 0; i < connectFourTable.getColumnCount(); i++) {
            columnTableModel.getColumn(i).setCellRenderer(cellRenderer);
        }
        
    }
    
    public String getCurrentMarker() {
        return currentMarker;
    }

    public void setCurrentMarker(String currentMarker) {
        this.currentMarker = currentMarker;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public JTable getTicTacToeTable() {
        return connectFourTable;
    }

    public void setTicTacToeTable(JTable ticTacToeTable) {
        this.connectFourTable = ticTacToeTable;
    }

    public JPanel getJpMainPanel() {
        return jpMainPanel;
    }

    public void setJpMainPanel(JPanel jpMainPanel) {
        this.jpMainPanel = jpMainPanel;
    }

    public JPanel getJpBody() {
        return jpBody;
    }

    public void setJpBody(JPanel jpBody) {
        this.jpBody = jpBody;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBody = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpgameboard = new javax.swing.JPanel();
        jbplaygame = new javax.swing.JButton();
        jbhelpgame = new javax.swing.JButton();
        jbquitgame = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageOutput = new javax.swing.JTextArea();
        jpMainPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        connectFourTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpBody.setBackground(new java.awt.Color(0, 0, 0));
        jpBody.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Game Board");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jpgameboard.setBackground(new java.awt.Color(0, 153, 153));
        jpgameboard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbplaygame.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbplaygame.setText("Play");
        jbplaygame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbplaygame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbplaygameActionPerformed(evt);
            }
        });

        jbhelpgame.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbhelpgame.setText("Help");
        jbhelpgame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbhelpgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbhelpgameActionPerformed(evt);
            }
        });

        jbquitgame.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jbquitgame.setText("Quit");
        jbquitgame.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbquitgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbquitgameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpgameboardLayout = new javax.swing.GroupLayout(jpgameboard);
        jpgameboard.setLayout(jpgameboardLayout);
        jpgameboardLayout.setHorizontalGroup(
            jpgameboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpgameboardLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpgameboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbquitgame, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbhelpgame, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbplaygame, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jpgameboardLayout.setVerticalGroup(
            jpgameboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpgameboardLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbplaygame)
                .addGap(39, 39, 39)
                .addComponent(jbhelpgame)
                .addGap(40, 40, 40)
                .addComponent(jbquitgame)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        messageOutput.setColumns(20);
        messageOutput.setRows(5);
        jScrollPane1.setViewportView(messageOutput);

        jpMainPanel.setBackground(new java.awt.Color(0, 0, 0));

        connectFourTable.setAutoCreateRowSorter(true);
        connectFourTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 5));
        connectFourTable.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        connectFourTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Column 1", "Column 2", "Column 3", "Column 4", "Column 5", "Column 6", "Column 7"
            }
        ));
        connectFourTable.setGridColor(new java.awt.Color(0, 0, 0));
        connectFourTable.setRowHeight(60);
        connectFourTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cellClicked(evt);
            }
        });
        jScrollPane2.setViewportView(connectFourTable);

        javax.swing.GroupLayout jpMainPanelLayout = new javax.swing.GroupLayout(jpMainPanel);
        jpMainPanel.setLayout(jpMainPanelLayout);
        jpMainPanelLayout.setHorizontalGroup(
            jpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        jpMainPanelLayout.setVerticalGroup(
            jpMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jpMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jpgameboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpBodyLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpMainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpgameboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbplaygameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbplaygameActionPerformed
        this.gameCommands.startNewGame(this.game);
        clearMarkers();
        takeFirstTurn();
        String nextPlayersMessage = this.game.getCurrentPlayer().getName()
        + " it is your turn.";
        this.messageOutput.setText(nextPlayersMessage);
    }//GEN-LAST:event_jbplaygameActionPerformed

    private void jbquitgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbquitgameActionPerformed
        MainFrame main = new MainFrame();
        main.setVisible(true);
        this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jbquitgameActionPerformed

    private void jbhelpgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbhelpgameActionPerformed
        HelpMenu help = new HelpMenu();
        help.setVisible(true);
        this.dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_jbhelpgameActionPerformed

    private void cellClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cellClicked
        JTable jTable = (JTable) evt.getComponent();
        this.messageOutput.setForeground(Color.black);
        this.takeTurn(jTable);
    }//GEN-LAST:event_cellClicked
private void clearMarkers() {
        TableModel model = this.connectFourTable.getModel();
        int rowCount = this.connectFourTable.getRowCount();
        int colCount = this.connectFourTable.getColumnCount();
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                model.setValueAt("", row, col);
            }
        }   
    }
    
    
    private String getNextPlayerMessage(PlayerName player) {
        if (this.game.getGameType() == GameType.ONE_PLAYER) {
            return "The computer took it's turn. It is now your turn "
                    + player.getName();
        } else {
            return "It is now your turn "
                    + player.getName();
        }
    }

    
    
    
    private boolean gameOver() {
        if (this.game.getStatus() == GameStatus.TIE) { // a tie?
            this.messageOutput.setText(this.game.getTiedMessage());
            return true;
        } else if (this.game.getStatus() == GameStatus.WINNER) { // a win?
            this.messageOutput.setText(this.game.getWinningMessage());
            return true;
        }

        return false;
    }
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
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable connectFourTable;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbhelpgame;
    private javax.swing.JButton jbplaygame;
    private javax.swing.JButton jbquitgame;
    private javax.swing.JPanel jpBody;
    private javax.swing.JPanel jpMainPanel;
    private javax.swing.JPanel jpMainPanel1;
    private javax.swing.JPanel jpgameboard;
    private javax.swing.JTextArea messageOutput;
    private javax.swing.JTable ticTacToeTable1;
    // End of variables declaration//GEN-END:variables

    private void takeFirstTurn() {
        PlayerName currentPlayer = this.game.getCurrentPlayer();
        
        if (this.game.getStatus() == GameStatus.NEW_GAME
                && this.game.getGameType() == GameType.ONE_PLAYER
                && currentPlayer.getPlayerType() == PlayerType.COMPUTER_PLAYER) {
            try {
                Point locationMarkerPlaced = this.gameCommands.playerTakesTurn(currentPlayer, null);

                String playersMarker = game.getCurrentPlayer().getMarker();
                this.connectFourTable.getModel().setValueAt(playersMarker, locationMarkerPlaced.x, locationMarkerPlaced.y);
                
            } catch (Exception ex) {
                this.messageOutput.setText(ex.getMessage());
                ex.printStackTrace();
                this.dispose();
            }
        }
        
        String promptNextPlayer = getNextPlayerMessage(currentPlayer);
        this.messageOutput.setText(promptNextPlayer);
        this.game.setStatus(GameStatus.PLAYING);
    }

    private void takeTurn(JTable table) {
        String playersMarker;
        int selectedRow = table.getSelectedRow();
        int selectedColumn = table.getSelectedColumn();
        Point selectedLocation = new Point(selectedRow, selectedColumn);

        PlayerName currentPlayer = this.game.getCurrentPlayer();
        PlayerName otherPlayer = this.game.getOtherPlayer();

        try {

            if (this.game.getGameType() == GameType.ONE_PLAYER) {
                // regular players turn
                Point locationMarkerPlaced = 
                        this.gameCommands.playerTakesTurn(currentPlayer, selectedLocation);
                playersMarker = currentPlayer.getMarker();
                table.getModel().setValueAt(playersMarker, locationMarkerPlaced.x, locationMarkerPlaced.y);
                if (this.gameOver()) { // game won or tied?
                    return;
                }
              
                table.setCellSelectionEnabled(false);
                ListSelectionModel selectionModel = table.getSelectionModel();
                selectionModel.clearSelection();
                

                // computers turn
                locationMarkerPlaced = this.gameCommands.playerTakesTurn(otherPlayer, null);
                playersMarker = otherPlayer.getMarker();
                table.getModel().setValueAt(playersMarker, locationMarkerPlaced.x, locationMarkerPlaced.y);

                if (this.gameOver()) { // game won or tied?
                    return;
                }
                
                


            } else { // two player game
                // regular players turn                
                Point locationMarkerPlaced = this.gameCommands.playerTakesTurn(this.game.getCurrentPlayer(), selectedLocation);
                playersMarker = currentPlayer.getMarker();
                table.getModel().setValueAt(playersMarker, locationMarkerPlaced.x, selectedColumn);
                if (this.gameOver()) { // game won or tied?
                    return;
                }
                
                table.setCellSelectionEnabled(false);
                ListSelectionModel selectionModel = table.getSelectionModel();
                selectionModel.clearSelection();
            }

            if (this.gameOver()) { // game won or tied?
                return;
            }

            String promptNextPlayer = getNextPlayerMessage(this.game.getCurrentPlayer());
            this.messageOutput.setText(promptNextPlayer);

        } catch (GameException | Connect4Exception gex) {
            this.messageOutput.setText(gex.getMessage());
            ListSelectionModel selectionModel = table.getSelectionModel();
            selectionModel.clearSelection();
        } catch (Exception ex) {
            this.messageOutput.setText(ex.getMessage());
            ex.printStackTrace();
            this.dispose();
        }
    }

    private class CellRenderer extends DefaultTableCellRenderer {

        public CellRenderer() {
            super();
        }

        public void setValue(PlayerName player) {
            setText((player == null) ? "" : player.getMarker());
        }
    }
}
