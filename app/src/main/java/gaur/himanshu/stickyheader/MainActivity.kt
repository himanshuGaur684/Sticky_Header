package gaur.himanshu.stickyheader

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import gaur.himanshu.stickyheader.ui.theme.StickyHeaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StickyHeaderTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    StickyHeader()
                }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun StickyHeader() {

    val list = getFakeList().groupBy { it.age }

    LazyColumn {
        list.forEach { (age, fakeList) ->

            stickyHeader {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color.Gray)
                ) {
                    Text(
                        text = age.toString(),
                        style = MaterialTheme.typography.h5,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }

            items(fakeList) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                ) {
                    Text(
                        text = "Name: ${it.name}  Age: ${it.age}",
                        style = MaterialTheme.typography.body1
                    )
                }
            }

        }
    }


}


data class FakeData(
    val name: String,
    val age: Int
)

fun getFakeList(): List<FakeData> {
    return listOf(
        FakeData(name = "Ram", age = 12),
        FakeData(name = "Shyam", age = 12),
        FakeData(name = "Raghu", age = 12),
        FakeData(name = "Arjun", age = 12),
        FakeData(name = "Ram", age = 13),
        FakeData(name = "Shyam", age = 13),
        FakeData(name = "Raghu", age = 13),
        FakeData(name = "Arjun", age = 13),
        FakeData(name = "Ram", age = 14),
        FakeData(name = "Shyam", age = 14),
        FakeData(name = "Raghu", age = 14),
        FakeData(name = "Arjun", age = 14),
        FakeData(name = "Ram", age = 15),
        FakeData(name = "Shyam", age = 15),
        FakeData(name = "Raghu", age = 15),
        FakeData(name = "Arjun", age = 15),
        FakeData(name = "Ram", age = 16),
        FakeData(name = "Shyam", age = 16),
        FakeData(name = "Raghu", age = 16),
        FakeData(name = "Arjun", age = 16),
        FakeData(name = "Ram", age = 17),
        FakeData(name = "Shyam", age = 17),
        FakeData(name = "Raghu", age = 17),
        FakeData(name = "Arjun", age = 17),
        FakeData(name = "Ram", age = 18),
        FakeData(name = "Shyam", age = 18),
        FakeData(name = "Raghu", age = 18),
        FakeData(name = "Arjun", age = 18),
        FakeData(name = "Ram", age = 19),
        FakeData(name = "Shyam", age = 19),
        FakeData(name = "Raghu", age = 19),
        FakeData(name = "Arjun", age = 19),
        FakeData(name = "Ram", age = 20),
        FakeData(name = "Shyam", age = 20),
        FakeData(name = "Raghu", age = 20),
        FakeData(name = "Arjun", age = 20),
    )
}
