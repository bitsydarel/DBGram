package com.dbeginc.dbgram

import android.os.Build

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = "Android"
}