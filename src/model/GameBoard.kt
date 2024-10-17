import model.Symbol
import kotlin.Array

class GameBoard {
    private  val  content= Array(3){arrayOfNulls<Symbol>(size = 3)}
// set cel
    fun  setCel(row :Int,column: Int,symbol: Symbol){
        content[row][column]=symbol
    }
    // create show content
    fun showContentState(){
        println("----------")
       for (i in 0 until MAX_ROW){
           for (j in 0 until MAX_COLUMN){
               print(content[i][j] ?: " ")
           }
       }
    }





    companion object{
        const val MAX_ROW=3
        const val MAX_COLUMN=3
    }








}