package com.tenxgames.kaspressotest

import com.agoda.kakao.text.KButton
import com.agoda.kakao.text.KTextView

object MainScreen : KScreen<MainScreen>() {

    override val layoutId: Int? = R.layout.activity_main
    override val viewClass: Class<*>? = MainActivity::class.java

    val simpleButton = KButton { withId(R.id.activity_main_button_simple) }

    val webViewButton = KButton { withId(R.id.activity_main_button_webview) }

    val scrollViewStubButton = KButton { withId(R.id.activity_main_button_scroll_view_sample) }

    val continuouslyButton = KButton { withId(R.id.activity_main_button_continuously_sample) }

    val descriptionText = KTextView { withId(R.id.activity_main_title) }
}