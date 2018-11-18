package com.dbeginc.dbgram

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsServer {
    @Test
    fun testHello() {
        assertTrue("Server" in hello())
    }
}