package binar.andlima.dependencyinjection_daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

//untuk kasih tau Hilt untuk meng inject ke class ini
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//    diisi nanti variable - isinya kosong
    @Inject
    lateinit var engine : Engine

    @Inject
    lateinit var injectString : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ini cara normal tanpa Hilt DI
//        val engine = Engine()
//        engine.startEngine()
        engine.startEngine()


        txtmain.text = injectString
        txtmaindua.text = engine.startEngine()




    }
}