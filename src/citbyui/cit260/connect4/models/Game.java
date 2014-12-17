/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.connect4.models;

import citbyui.cit260.connect4.enums.GameType;
import citbyui.cit260.connect4.enums.GameStatus;
import citbyui.cit260.connect4.views.GameBoard;
/**
 *
 * @author Loren
 */
public class Game {

    private GameType gameType;
    private PlayerName playerA;
    private PlayerName playerB;
    private PlayerName currentPlayer;
    private PlayerName otherPlayer;
    private PlayerName winner;
    private PlayerName loser;
    private GameStatus status;
    private Board board;
    private GameBoard gameFrame;
    private static final String PLAYER_A_DEFAULT_MARKER = "X";
    private static final String PLAYER_B_DEFAULT_MARKER = "O";
    

    public Game() {
       this.playerA = new PlayerName();
       this.playerB = new PlayerName();
       
       this.playerA.setMarker(PLAYER_A_DEFAULT_MARKER);
       this.playerB.setMarker(PLAYER_B_DEFAULT_MARKER);
    }

    public Game(GameType gameType) {
        this();

        this.gameType = gameType;
        this.board = new Board(6, 7);
        
    }

    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public PlayerName getPlayerA() {
        return playerA;
    }

    public void setPlayerA(PlayerName playerA) {
        this.playerA = playerA;
    }

    public PlayerName getPlayerB() {
        return playerB;
    }

    public void setPlayerB(PlayerName playerB) {
        this.playerB = playerB;
    }

    public PlayerName getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(PlayerName currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public PlayerName getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(PlayerName otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public PlayerName getWinner() {
        return winner;
    }

    public void setWinner(PlayerName winner) {
        this.winner = winner;
    }

    public PlayerName getLoser() {
        return loser;
    }

    public void setLoser(PlayerName loser) {
        this.loser = loser;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public GameBoard getGameFrame() {
        return gameFrame;
    }

    public void setGameFrame(GameBoard gameFrame) {
        this.gameFrame = gameFrame;
    }



    public void start() {

        this.setPlayingOrder(playerA, playerB);

        // clear the board
        this.board.clearTheBoard();
        this.setStatus(GameStatus.NEW_GAME);
    }

    public void setPlayingOrder(PlayerName player1, PlayerName player2) {

        double randomValue = Math.random();

        if (randomValue < 0.5) {
            this.currentPlayer = player1;
            this.otherPlayer = player2;
        } else {
            this.otherPlayer = player2;
            this.currentPlayer = player1;
        }

    }

    public void recordWinner() {
        if (this.currentPlayer == this.playerA) {
            this.winner = this.playerA;
            this.loser = this.playerB;
        } else {
            this.winner = this.playerB;
            this.loser = this.playerA;
        }

        long noWins = this.winner.getWins();
        noWins++;
        this.winner.setWins(noWins);
        long noLosses = this.loser.getLosses();
        noLosses++;
        this.loser.setLosses(noLosses);

        this.setStatus(GameStatus.WINNER);
        
    }

    public void recordTie() {
        long player1Ties = this.playerA.getTies();
        player1Ties++;
        this.playerA.setTies(player1Ties);
        long player2Ties = this.playerB.getTies();
        player2Ties++;
        this.playerB.setTies(player2Ties);

        this.setStatus(GameStatus.TIE);
       
    }



    public String getWinningMessage () {
        return
            "Congratulations " + winner.getName() + "! You won the game."
            + "\nSorry " + loser.getName() + ", You are the loser.";
    }

    public String getTiedMessage () {
       return "The game is a tie. Better luck next time!";
    }
}
