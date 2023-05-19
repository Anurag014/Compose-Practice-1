package com.example.composepractice

import android.os.Bundle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.composepractice.ui.theme.ComposePracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = colorResource(id = R.color.white)
                ) {
                    Content()
                }
            }
        }
    }
}

@Composable
fun ComposeBackground() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun ArticleHeading() {
    Text(text = stringResource(R.string.article_title),
        modifier = Modifier.padding(16.dp),
        fontSize = 24.sp
    )
}

@Composable
fun Paragraph1() {
    Text(text = stringResource(R.string.paragraph_1),
        modifier = Modifier.padding(16.dp,0.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun Paragraph2() {
    Text(text = stringResource(id = R.string.paragraph_2),
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}

@Composable
fun Content() {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        ComposeBackground()
        ArticleHeading()
        Paragraph1()
        Paragraph2()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    ComposePracticeTheme {
        Content()
    }
}