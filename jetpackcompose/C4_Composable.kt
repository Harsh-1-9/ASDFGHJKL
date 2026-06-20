package com.example.myfirstapp.jetpackcompose
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.R
import org.w3c.dom.Text

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImageExample() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Icon(
            imageVector = Icons.Default.Call,
            contentDescription = "Person Icon",
            modifier = Modifier.size(100.dp),
            tint = Color.Black,
        )
    }
    Image(
        painter = painterResource(R.drawable.img),
        contentDescription = "Image Example",
        modifier = Modifier
            .padding(16.dp)
            .clickable(onClick = {})
            .size(300.dp)
            .clip(RoundedCornerShape(16.dp)),
        contentScale = ContentScale.Fit,

    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ImagePractice1() {
    Image(
        painter = painterResource(R.drawable.image2),
        contentDescription = "Practice Image",
        modifier = Modifier
            .padding(16.dp)
            .size(200.dp)
            .clip(RoundedCornerShape(20.dp)),
        contentScale = ContentScale.Crop
    )

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfileApp() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painter = painterResource(R.drawable.image),
            contentDescription = "Clickable Image",
            modifier = Modifier
                .size(200.dp)
                .clickable(onClick = {})
                .clip(RoundedCornerShape(20.dp)),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Harsh Jangra",
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Android Developer",
            fontSize = 20.sp,
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Cursive,
            color = Color.Black
        )
        Row(
            modifier = Modifier
                .padding(top = 20.dp)
                .clickable(onClick = {}),
            horizontalArrangement = Arrangement.spacedBy(40.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Call,
                contentDescription = "Call",
                modifier = Modifier.size(40.dp),
                tint = Color.Black,
            )
            Text(
                text = "Call",
                modifier = Modifier.padding(start = 6.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable(onClick = {
                    Toast.makeText(context, "Card Clicked", Toast.LENGTH_SHORT).show() }
                )
            ) {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email",
                    modifier = Modifier.size(40.dp),
                    tint = Color.Black
                )
                Text(
                    text = "Email",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}

