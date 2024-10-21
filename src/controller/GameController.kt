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
     fun playGane(){


         var curretPlayer=player1
         while (true) {
             gameboard.showContentState()
             println("Player=${curretPlayer.name},enter your move (row and column)!")
             var row=0
             var column=0
             println("row=")
             row= readLine()!!.toInt() -1
             println("colum=")
             column= readLine()!!.toInt() -1
             if (gameboard.isCellEmpty(row,column)){
                 gameboard.setCel(row,column,curretPlayer.symbol)
                 gameboard.showContentState()

             }
             if (gameboard.isWiner(curretPlayer)){
                 println("The player ${curretPlayer.name} is win! GAME OVER!")
                 break

             } else{
                 curretPlayer=(if (curretPlayer === player1)player2 else player1)
             }

         }

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