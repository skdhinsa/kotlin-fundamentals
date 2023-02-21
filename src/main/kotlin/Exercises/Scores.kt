package Exercises

class Scores ()
{

    fun checkIfNewPersonalBest(best:Double, current: Double): Double{
        if(best<current){
            return current
        }
        return best
    }

}