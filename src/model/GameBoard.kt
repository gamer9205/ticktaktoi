import model.Symbol
import kotlin.Array

class GameBoard {
    private  val  context= Array(3){arrayOfNulls<Symbol>(size = 3)}
// set cel
    fun  setCel(row :Int,column: Int,symbol: Symbol){
        context[row][column]=symbol
    }
    // create show content









}