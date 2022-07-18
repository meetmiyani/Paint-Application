package mmiyani.example.paint_application

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import mmiyani.example.paint_application.paintView.Companion.colorList
import mmiyani.example.paint_application.paintView.Companion.currentBrush
import mmiyani.example.paint_application.paintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.redColor)
        val blueBtn = findViewById<ImageButton>(R.id.blueColor)
        val orangeBtn = findViewById<ImageButton>(R.id.orangeColor)
        val blackBtn = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener{
            Toast.makeText(this,"Red color has been selected", Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.rgb(166,3,33))
            useColor(paintBrush.color)
        }
        blueBtn.setOnClickListener{
            Toast.makeText(this,"Blue", Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.rgb(32,40,98))
            useColor(paintBrush.color)
        }
        orangeBtn.setOnClickListener{
            Toast.makeText(this,"Orange", Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.rgb(217,142,4))
            useColor(paintBrush.color)
        }
        blackBtn.setOnClickListener{
            Toast.makeText(this,"Black", Toast.LENGTH_SHORT).show()
            paintBrush.setColor(Color.BLACK)
            useColor(paintBrush.color)
        }
        eraser.setOnClickListener{
            Toast.makeText(this,"Cleared", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun useColor(color: Int) {
        currentBrush = color
        path = Path()
    }
}