package com.sksamuel.kotest.engine.test

import io.kotest.core.spec.style.StringSpec
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.seconds

class Issue5184BugTest : StringSpec({
    "test with coroutineTestScope parameter".config(coroutineTestScope=true)
    {
        launch {
            delay(100.seconds)
        }
    }
})