package binar.andlima.dependencyinjection_daggerhilt

import android.content.Context

class Engine {

    fun startEngine() : String{
        return "Engine Started"
    }
}

//class Engine(private val context: Context) {
//
//    fun startEngine() : String{
//        return context.getString(R.string.enginestarted)
//    }
//}