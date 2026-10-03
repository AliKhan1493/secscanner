package com.cybersec.secscanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cybersec.secscanner.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            secscannerTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Column(modifier = Modifier.fillMaxSize().padding(18.dp).statusBarsPadding()) {
                        Text("🕵️ secscanner", fontSize = 24.sp, fontWeight = FontWeight.Bold, color = MaterialTheme.colorScheme.primary)
                        Text("Subnet Vulnerability & Open Ports Scanner", fontSize = 13.sp, color = Color.Gray)
                        Spacer(modifier = Modifier.height(20.dp))
                        Text("192.168.1.1 - Router Gateway (Port 80, 443 OPEN)", color = Color.LightGray)
                        Text("192.168.1.105 - Linux Host (Port 22 SSH OPEN)", color = Color.LightGray)
                    }
                }
            }
        }
    }
}
