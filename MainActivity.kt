package com.example.logincompose

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.scale
import androidx.core.view.WindowCompat

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ✅ System status bar color
        window.statusBarColor = Color(0xFF004953).toArgb()
        WindowCompat.getInsetsController(window, window.decorView)
            .isAppearanceLightStatusBars = false

        setContent {
            LoginScreen()
        }
    }
}

@Composable
fun LoginScreen() {

    val TealBlue = Color(0xFF004953)

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var rememberMe by remember { mutableStateOf(true) }
    var notifCheckbox by remember { mutableStateOf(false) }
    var notifSwitch by remember { mutableStateOf(true) }

    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {

        // 🔹 TOP BAR
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(TealBlue)
                .statusBarsPadding()
                .height(90.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Login",
                color = Color.White,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)
        ) {

            Spacer(modifier = Modifier.height(30.dp))

            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Username") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(20.dp))

            // 🔐 Password hidden
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                modifier = Modifier.fillMaxWidth(),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Password
                )
            )

            Spacer(modifier = Modifier.height(30.dp))

            // ✅ Remember Me (COMPACT)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = rememberMe,
                    onCheckedChange = { rememberMe = it },
                    modifier = Modifier.size(20.dp),
                    colors = CheckboxDefaults.colors(checkedColor = TealBlue)
                )

                Spacer(modifier = Modifier.width(6.dp))

                Text("Remember Me", fontSize = 15.sp)

                Spacer(modifier = Modifier.weight(1f))

                Switch(
                    checked = rememberMe,
                    onCheckedChange = { rememberMe = it },
                    modifier = Modifier.scale(0.85f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        uncheckedThumbColor = Color.White,
                        checkedTrackColor = TealBlue,
                        uncheckedTrackColor = TealBlue.copy(alpha = 0.4f)
                    )
                )
            }


            // ✅ Enable Notification (COMPACT)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(40.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = notifCheckbox,
                    onCheckedChange = { notifCheckbox = it },
                    modifier = Modifier.size(20.dp),
                    colors = CheckboxDefaults.colors(checkedColor = TealBlue)
                )

                Spacer(modifier = Modifier.width(6.dp))

                Text("Enable Notification", fontSize = 15.sp)

                Spacer(modifier = Modifier.weight(1f))

                Switch(
                    checked = notifSwitch,
                    onCheckedChange = { notifSwitch = it },
                    modifier = Modifier.scale(0.85f),
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        uncheckedThumbColor = Color.White,
                        checkedTrackColor = TealBlue,
                        uncheckedTrackColor = TealBlue.copy(alpha = 0.4f)
                    )
                )
            }

            Spacer(modifier = Modifier.height(30.dp))

            // 🔘 Login Button
            Button(
                onClick = {
                    if (email.length >= 4 && password.length >= 6) {
                        Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
                        context.startActivity(
                            Intent(context, HomeActivity::class.java)
                        )
                    } else {
                        Toast.makeText(context, "Invalid Credentials", Toast.LENGTH_SHORT).show()
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(containerColor = TealBlue)
            ) {
                Text("Login", color = Color.White)
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Use Compose State Management and @Preview.",
                fontSize = 16.sp,
                color = Color.Gray
            )

            Spacer(modifier = Modifier.height(4.dp))

            Text(
                text = "No XML layout should be used",
                fontSize = 16.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLogin() {
    LoginScreen()
}
