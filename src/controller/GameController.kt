package controller

import GameBoard
import model.Player
import model.Symbol

class GameController {
private  lateinit var player1: Player
 private lateinit var player2: Player
    private val gameboard=GameBoard()

    init {
        initPlayer()
    }

    private fun initPlayer(){
        println("Enter the name of Player1")
        val namePlayer1= readln()

        println("Chose a symbol for Player $namePlayer1 (X or 0)")
        val symbolfromConsole= readln().uppercase()
        val symmbol= when(symbolfromConsole){
            "x","х"->Symbol.x
            else ->Symbol.o
        }
        player1=Player(namePlayer1,symmbol)
        println("Enter the name of Player 2")
        val namePlayer2= readln()
        player2=Player(namePlayer2,if (player1.symbol==Symbol.x)Symbol.o else Symbol.x )

    }
}