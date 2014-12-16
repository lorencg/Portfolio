/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;

import java.awt.Point;
import java.util.Objects;
import java.util.Scanner;
import javax.swing.table.AbstractTableModel;
import citbyui.cit260.connect4.exceptions.GameException;
import citbyui.cit260.connect4.enums.ErrorType;
/**
 *
 * @author SexyMama
 */
public class Board extends AbstractTableModel {
    int rowCount = 3;
    int columnCount = 3;
    private String name;
    private Point boardDimensions = new Point();
    private PlayerName[][] boardLocations;

    public Board() {
    }

    public Board(int noRows, int noColumns) {
        this.boardDimensions.setLocation(noRows, noRows);
        this.boardLocations = new PlayerName[noRows][noColumns];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getBoardDimensions() {
        return boardDimensions;
    }

    public void setBoardDimensions(Point boardDimensions) {
        this.boardDimensions = boardDimensions;
    }

    public PlayerName[][] getBoardLocations() {
        return boardLocations;
    }

    public void setBoardLocations(PlayerName[][] boardLocations) {
        this.boardLocations = boardLocations;
    }

       @Override
    public int getRowCount() {
        return (int) this.boardDimensions.getX();
    }

    @Override
    public int getColumnCount() {
        return (int) this.boardDimensions.getY();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return boardLocations[rowIndex][columnIndex];
    } 
   

    public PlayerName getPlayerAt(int row, int column) {
        return this.boardLocations[row][column];
    }


    public void clearTheBoard() {
        for (int i = 0; i < this.boardLocations.length; i++) {
            PlayerName[] rowlocations = this.boardLocations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                PlayerName location = rowlocations[j];
                location = null;
            }
        }
    }
    

    public void occupyLocation(PlayerName player, int row, int column) throws GameException {  
        PlayerName playerAtLocation = this.boardLocations[row][column];

        if (playerAtLocation != null) { // location already occupied
            throw new GameException(ErrorType.ERROR203.getMessage());
        }
        this.boardLocations[row][column] = player;
    }

    public class Location {

        private int row;
        private int column;
        private String value;
        private PlayerName player;

        Location() {
        }

        int getRow() {
            return row;
        }

        void setRow(int row) {
            this.row = row;
        }

        int getColumn() {
            return column;
        }

        void setColumn(int column) {
            this.column = column;
        }

        String getValue() {
            return value;
        }

        void setValue(String value) {
            this.value = value;
        }

        PlayerName getPlayer() {
            return player;
        }

        public void setPlayer(PlayerName player) {
            this.player = player;
        }

        String[] getCoordinates() {
            String[] coordinates = new String[2];
            Integer intRow = this.getRow() + 1;
            Integer intColumn = this.getColumn() + 1;
            coordinates[0] = intRow.toString();
            coordinates[1] = intColumn.toString();
            return coordinates;
        }
    }
}