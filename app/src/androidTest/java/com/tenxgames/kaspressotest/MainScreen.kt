package com.tenxgames.kaspressotest

import com.agoda.kakao.text.KButton

object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int? = R.layout.activity_main
    override val viewClass: Class<*>? = MainActivity::class.java

    val btnOpen = KButton { withId(R.id.btnOpen) }
}