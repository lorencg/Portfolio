/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.control;

import citbyui.cit260.connect4.enums.GameStatus;
import citbyui.cit260.connect4.exceptions.Connect4Exception;
import citbyui.cit260.connect4.enums.ErrorType;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import citbyui.cit260.connect4.enums.GameType;
import citbyui.cit260.connect4.enums.PlayerType;
import citbyui.cit260.connect4.models.Board;
import citbyui.cit260.connect4.models.Game;
import citbyui.cit260.connect4.models.PlayerName;
import citbyui.cit260.connect4.exceptions.GameException;
/**
 *
 * @author SexyMama
 */
public class GameMenuControl {
    
    Game game;
    Board board;

    public GameMenuControl(Game game) {
        this.game = game;
        this.board = game.getBoard();
    }
    
    public Point playerTakesTurn(PlayerName player, Point selectedLocation) throws Connect4Exception, GameException {
        Point locationMarkerPlaced = null;

        if (player ==  null) {
            throw new Connect4Exception(ErrorType.ERROR106.getMessage());
        }

        if (player.getPlayerType() != PlayerType.REGULAR_PLAYER && 
            player.getPlayerType() != PlayerType.COMPUTER_PLAYER) {
            throw new Connect4Exception(ErrorType.ERROR209.getMessage());
        }
        
                
        if (this.game.getStatus() != GameStatus.PLAYING ) {
            throw new GameException(ErrorType.ERROR206.getMessage());
        }

        PlayerType playerType = player.getPlayerType();

        if (playerType == PlayerType.REGULAR_PLAYER) {
            this.regularTurn(player, selectedLocation);
            locationMarkerPlaced = selectedLocation;
        }
        else if (playerType == PlayerType.COMPUTER_PLAYER) {
            locationMarkerPlaced = this.coumputerTakesTurn(player);
        }

        this.alternatePlayers();

        return locationMarkerPlaced;
    }
    
    public void takeTurn(Point selectedLocation) throws Connect4Exception, GameException {
        PlayerName currentPlayer = this.game.getCurrentPlayer();
        PlayerName otherPlayer = this.game.getOtherPlayer();
        
        PlayerType playerType = currentPlayer.getPlayerType(); 

        if (this.game.getGameType() == GameType.ONE_PLAYER) {
            if (currentPlayer.getPlayerType() == PlayerType.REGULAR_PLAYER) {
                this.playerTakesTurn(currentPlayer, selectedLocation);
                if (this.game.getStatus() != GameStatus.PLAYING) { // game over ?
                    return;
                }
                
                this.playerTakesTurn(otherPlayer, selectedLocation);
                String message = "The computer also took it's turn. "
                        + " it is your turn again " + currentPlayer.getName();
            }
            if (currentPlayer.getPlayerType() == PlayerType.COMPUTER_PLAYER) {
                this.playerTakesTurn(currentPlayer, selectedLocation);
                this.alternatePlayers();                
            } 
        } 
        else if (this.game.getGameType() == GameType.TWO_PLAYER) {
            this.playerTakesTurn(currentPlayer, selectedLocation);
            this.alternatePlayers();
        }
        



    }
    
    public void alternatePlayers() {
        if (this.game.getCurrentPlayer() == this.game.getPlayer1()) {
            this.game.setCurrentPlayer(this.game.getPlayer2());
            this.game.setOtherPlayer(this.game.getPlayer1());
        } else {
            this.game.setCurrentPlayer(this.game.getPlayer1());
            this.game.setOtherPlayer(this.game.getPlayer2());
        }
    }
    
    public void regularTurn(PlayerName player, Point location) throws Connect4Exception, GameException {
        if (location == null) {
            throw new IllegalArgumentException("GameCommands - regularTurn: location is null");
        }
        
        if (game.getStatus() != GameStatus.PLAYING && 
            game.getStatus() != GameStatus.NEW_GAME) {
            throw new Connect4Exception(ErrorType.ERROR206.getMessage());
        }

        game.setStatus(GameStatus.PLAYING);
        this.markLocation(player, location);
    }
    
    public Point coumputerTakesTurn(PlayerName player) throws Connect4Exception, GameException {
        // computer takes turn
        game.setStatus(GameStatus.PLAYING); 
        Point location = this.getComputersSelection();
        this.markLocation(player, location);
        return location;
    }
    

    
    
    private void markLocation(PlayerName player, Point location) throws GameException {


        
        this.game.getBoard().occupyLocation(player, location.x, location.y);
        if (this.isTie()) { // game tied already
            this.game.recordTie();
            this.game.setStatus(GameStatus.TIE);
            return;
        }

        boolean aWinner = this.isWinner();
        if (aWinner) { // game won already
            this.game.recordWinner();
            this.game.setStatus(GameStatus.WINNER);
            return;
        }
        
        this.game.setStatus(GameStatus.PLAYING);
    }
    
    
    
    private Point getComputersSelection()  throws Connect4Exception {
        Point coordinate;
        try {
            coordinate = this.findWinningLocation(game.getCurrentPlayer());
            if (coordinate != null) { // winning location found for computer
                return coordinate;
            }
            
            // find winning location for other player
            coordinate = this.findWinningLocation(game.getOtherPlayer());
            if (coordinate == null) { // no winning location found for other player
                coordinate = this.chooseRandomLocation();

                if (coordinate == null) {
                    throw new GameException(ErrorType.ERROR201.getMessage());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Connect4Exception(e.getMessage());
        }
        
        return coordinate;
    }

    
    public void startNewGame(Game game) {
        game.start();
        this.clearTheBoard();
    }
  
    
    
    public void clearTheBoard() {
        PlayerName[][] locations = this.game.getBoard().getBoardLocations();
        
        for (int i = 0; i < this.board.getBoardLocations().length; i++) {
            PlayerName[] rowlocations = locations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                rowlocations[j] = null;
            }
        }
    }


    private boolean isTie() {
        PlayerName[][] locations = this.board.getBoardLocations();

        for (int row = 0; row < locations.length; row++) {
            PlayerName[] rowLocations = locations[row];
            for (int col = 0; col < rowLocations.length; col++) {
                PlayerName location = rowLocations[col];
                if (locations[row][col] == null) { // square not taken yet
                    return false;
                }
            }
        }

        return true;
    }

    
    private boolean isWinner() {

        PlayerName[][] locations = this.board.getBoardLocations();

        for (int row = 0; row < locations.length; row++) {
            PlayerName[] rowLocations = locations[row];
            for (int col = 0; col < rowLocations.length; col++) {
                if (threeInARow(row, col, locations)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean threeInARow(int row, int col, PlayerName[][] boardLocations) {
        boolean winner = false;

        int columnLength = boardLocations[row].length;
        int rowLength = boardLocations.length;

        // square not taken yet
        if (boardLocations[row][col] == null) {
            return false;
        } // search for three adjacent horizontally
        else if (row < rowLength && col < columnLength - 2
                && boardLocations[row][col] == boardLocations[row][col + 1]
                && boardLocations[row][col] == boardLocations[row][col + 2]) {
            return true;
        } // search for three adjacent vertically
        else if (row < rowLength - 2 && col < columnLength
                && boardLocations[row][col] == boardLocations[row + 1][col]
                && boardLocations[row][col] == boardLocations[row + 2][col]) {
            return true;
        } // search for three adjacent diagonally leaning backward
        else if (row < rowLength - 2 && col < columnLength - 2
                && boardLocations[row][col] == boardLocations[row + 1][col + 1]
                && boardLocations[row][col] == boardLocations[row + 2][col + 2]) {
            return true;
        } // search for three adjacent diagonally learning forward
        else if (row < rowLength - 2 && col > 1
                && boardLocations[row][col] == boardLocations[row + 1][col - 1]
                && boardLocations[row][col] == boardLocations[row + 2][col - 2]) {
            return true;
        }

        return false;
    }

    private Point findWinningLocation(PlayerName player) {
        Point coordinate = new Point();
        PlayerName[][] locations = this.board.getBoardLocations();
        for (int row = 0; row < locations.length; row++) {
            PlayerName[] rowLocations = locations[row];
            for (int col = 0; col < rowLocations.length; col++) {
                PlayerName location = rowLocations[col];
                coordinate.setLocation(row, col);

                if (rowLocations[col] != null) { // location is occupied
                    continue;
                }

                // search for three adjacent horizontally
                if ((row < locations.length
                        && col < rowLocations.length - 2)
                        && (locations[row][col + 1] == player
                        && locations[row][col + 2] == player)) {
                    return coordinate;
                } else if ((row < locations.length
                        && col > 0 && col < rowLocations.length - 1)
                        && (locations[row][col - 1] == player
                        && locations[row][col + 1] == player)) {
                    return coordinate;
                } else if ((row < locations.length && col > 1)
                        && (locations[row][col - 1] == player
                        && locations[row][col - 2] == player)) {
                    return coordinate;
                } // search for three adjacent vertically
                else if ((row < locations.length - 2
                        && col < rowLocations.length)
                        && (locations[row + 1][col] == player
                        && locations[row + 2][col] == player)) {
                    return coordinate;
                } else if ((row > 0 && row < locations.length - 1
                        && col < rowLocations.length)
                        && (locations[row - 1][col] == player
                        && locations[row + 1][col] == player)) {
                    return coordinate;
                } else if ((row > 1 && col < rowLocations.length)
                        && (locations[row - 1][col] == player
                        && locations[row - 2][col] == player)) {
                    return coordinate;
                } // search for three adjacent diagonally leaning backward
                else if ((row < locations.length - 2
                        && col < rowLocations.length - 2)
                        && (locations[row + 1][col + 1] == player
                        && locations[row + 2][col + 2] == player)) {
                    return coordinate;
                } else if ((row > 0 && row < locations.length - 1
                        && col > 0 && col < rowLocations.length - 1)
                        && (locations[row - 1][col + 1] == player
                        && locations[row + 1][col - 1] == player)) {
                    return coordinate;
                } else if ((row > 1 && col > 1)
                        && (locations[row - 1][col - 1] == player
                        && locations[row - 2][col - 2] == player)) {
                    return coordinate;
                } // search for three adjacent diagonally learning forward
                else if ((row < locations.length - 2 && col > 1)
                        && (locations[row + 1][col - 1] == player
                        && locations[row + 2][col - 2] == player)) {
                    return coordinate;
                } else if ((row > 0 && row < locations.length - 1
                        && col > 0 && col < rowLocations.length - 1)
                        && (locations[row - 1][col + 1] == player
                        && locations[row + 1][col - 1] == player)) {
                    return coordinate;
                } else if ((row > 1 && col < rowLocations.length - 2)
                        && (locations[row - 1][col + 1] == player
                        && locations[row - 2][col + 2] == player)) {
                    return coordinate;
                }
            }
        }

        return null; // not found
    }

    private Point chooseRandomLocation() {
        Point randomLocation;

        ArrayList<Point> listOfEmptyLocations = new ArrayList<>();
        PlayerName[][] locations = this.board.getBoardLocations();

        // create list of empty locations
        for (int row = 0; row < locations.length; row++) {
            PlayerName[] rowLocations = locations[row];
            for (int col = 0; col < rowLocations.length; col++) {
                PlayerName location = rowLocations[col];
                if (location == null) { // location not occupied?
                    listOfEmptyLocations.add(new Point(row, col));
                }
            }
        }

        int noOfEmptyLocations = listOfEmptyLocations.size();

        if (noOfEmptyLocations == 0) { // no empty locations?
            return null;
        } else if (listOfEmptyLocations.size() == 1) { // only one empty location?
            randomLocation = listOfEmptyLocations.get(0);
            return randomLocation;
        } else { // randomly choose one of the empty locations
            int randomNumber = new Random().nextInt(noOfEmptyLocations);
            randomLocation = listOfEmptyLocations.get(randomNumber);
            return randomLocation;
        }
    }
    
}

