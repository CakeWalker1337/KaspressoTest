package com.tenxgames.kaspressotest

import com.agoda.kakao.pager.KViewPager
import com.agoda.kakao.tabs.KTabLayout

object SecondScreen : KScreen<SecondScreen>() {

    override val layoutId: Int? = R.layout.activity_second
    override val viewClass: Class<*>? = SecondActivity::class.java

    val viewPager = KViewPager { withId(R.id.viewPager) }
    val tabLayout = KTabLayout {withId(R.id.tabLayout)}
}