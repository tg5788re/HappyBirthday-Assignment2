package com.example.happybirthday_assignment2

import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.TextView
import android.widget.Button
import android.content.Intent

//import com.example.happybirthday_assignment2.ui.theme.HappyBirthdayAssignment2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val studentName = findViewById<TextView>(R.id.name)
        val studentID = findViewById<TextView>(R.id.studentID)

        studentName.text = "Juanaiga Okugas "
        studentID.text = "1086179"

        val studentButton = findViewById<Button>(R.id.listButton)
        studentButton.setOnClickListener {
            val intent = Intent(this, SoftwareEngineeringChallenges::class.java)
            startActivity(intent)
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//            text = "Hello $name!",
//            modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    HappyBirthdayAssignment2Theme {
//        Greeting("Juanaiga Okugas, 1086179")
//    }
//}
