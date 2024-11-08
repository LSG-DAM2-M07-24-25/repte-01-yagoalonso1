    import android.os.Bundle
    import androidx.activity.ComponentActivity
    import androidx.activity.compose.setContent
    import androidx.compose.foundation.background
    import androidx.compose.foundation.border
    import androidx.compose.foundation.clickable
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.text.BasicTextField
    import androidx.compose.foundation.text.KeyboardOptions
    import androidx.compose.material3.*
    import androidx.compose.material.icons.Icons
    import androidx.compose.material.icons.filled.*
    import androidx.compose.runtime.*
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.text.font.FontWeight
    import androidx.compose.ui.text.input.KeyboardType
    import androidx.compose.ui.text.input.TextFieldValue
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.example.androidstudio_koala_template.ui.theme.AndroidStudioKoalaTemplateTheme

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                AndroidStudioKoalaTemplateTheme {
                    MyDropDownMenu()
                }
            }
        }

        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun MyDropDownMenu() {
            Text("¡Hola Mundo!")  // Simple texto para ver si el problema está en la UI.
        }
    }