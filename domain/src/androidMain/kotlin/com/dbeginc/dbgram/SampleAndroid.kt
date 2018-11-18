package com.dbeginc.dbgram

import android.os.Build

actual class Sample {
    actual fun checkMe() = 42
}

actual object Platform {
    actual val name: String = Build.VERSION.BASE_OS.plus(Build.VERSION.CODENAME).plus(Build.VERSION.RELEASE)
}