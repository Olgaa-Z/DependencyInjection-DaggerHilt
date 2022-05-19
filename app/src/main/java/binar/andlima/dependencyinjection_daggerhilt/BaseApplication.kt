package binar.andlima.dependencyinjection_daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

//akan mengenali application class,
// kalau di hapus, si hilt ga akan menegenali baseapplication class
//deklarasikan baseApplication class di android manifest
@HiltAndroidApp
class BaseApplication : Application() {

}