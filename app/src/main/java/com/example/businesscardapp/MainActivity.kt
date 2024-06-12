package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinesscardappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinesscardappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}

//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}

@Composable
fun TopSpacing(){
    Spacer(modifier = Modifier.height(100.dp))
}
@Composable
fun MidSpacing(){
    Spacer(modifier = Modifier.height(30.dp))
}
@Composable
fun Header(){
    Column(
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        val image = painterResource(R.drawable.android_logo)
        Box (modifier = Modifier.background(Color(0xFF073042))){
            Image(
                painter = image, contentDescription = null,
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
            )
        }
        Text(text = stringResource(R.string.full_name), fontSize = 40.sp ,

            modifier = Modifier
                .padding(bottom = 10.dp)
        )
        Text(text = stringResource(R.string.title), color = Color(0xFF3ddc84)
        )
    }
}
@Composable
fun Contact(){
    Column {
        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Icon(Icons.Rounded.Phone, contentDescription = null)
            Spacer(modifier = Modifier.width(25.dp))
            Text(text = stringResource(R.string.phonee))
        }
        Row(modifier = Modifier.padding(bottom = 10.dp)) {
            Icon(Icons.Rounded.Share, contentDescription = null)
            Spacer(modifier = Modifier.width(25.dp))
            Text(text = stringResource(R.string.username))
        }
        Row{
            Icon(Icons.Rounded.Email, contentDescription = null)
            Spacer(modifier = Modifier.width(25.dp))
            Text(text = stringResource(R.string.emaill))
        }
    }
}

@Composable
fun BusinessCardScreen(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
        modifier = Modifier.fillMaxSize()
    ) {
        TopSpacing()
        Header()
        MidSpacing()
        Contact()




    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesscardappTheme {
        BusinessCardScreen()
    }
}