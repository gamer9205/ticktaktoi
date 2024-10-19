package controller

import GameBoard
import model.Player

class GameController {
private  var player1: Player?=null
    private  var player2: Player?=null
    private val gameboard=GameBoard()

    init {
        initPlayer()
    }

    private fun initPlayer(){
        println("Enter the name of Player1")
        val namePlayer1= readln()
        val name

    }
}