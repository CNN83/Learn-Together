package com.example.learntogether

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                Surface(color = MaterialTheme.colors.background) {
                    LearnTogetherImage(
                        stringResource(R.string.header_string),
                        stringResource(R.string.component1_string),
                        stringResource(R.string.component2_string)
                    )
                }
            }
        }
    }
}

@Composable
fun LearnTogetherImage(header: String, component1: String, component2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Column() {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
        )
            LearnTogetherText(
                header = header,
                component1 = component1,
                component2 = component2
            )
    }
}

@Composable
fun LearnTogetherText(header: String, component1: String, component2: String, modifier: Modifier = Modifier) {
    Column (Modifier.fillMaxHeight().background(Color.DarkGray)) {
        Text(
            text = header,
            fontSize = 24.sp,
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp)
        )
        Text(
            text = component1,
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = component2,
            modifier = Modifier
                .wrapContentWidth(Alignment.CenterHorizontally)
                .padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true)
@Composable
fun LearnTogetherImagePreview() {
    LearnTogetherTheme {
        LearnTogetherImage(
            stringResource(R.string.header_string),
            stringResource(R.string.component1_string),
            stringResource(R.string.component2_string)
        )
    }
}