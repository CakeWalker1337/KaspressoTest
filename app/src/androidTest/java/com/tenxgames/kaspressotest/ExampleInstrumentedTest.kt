package com.tenxgames.kaspressotest

import android.content.Intent
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainTest : TestCase() {
    @get:Rule
    val firstActivityTestRule = ActivityTestRule(MainActivity::class.java, false, false)

    @get:Rule
    val secondActivityTestRule = ActivityTestRule(SecondActivity::class.java, false, false)


    @Test
    fun openSecondActivityTest() {

        before {
            firstActivityTestRule.launchActivity(null)
        }.after {
        }.run {

            step("step 1: pushing button") {
                MainScreen {
                    btnOpen.click()
                }
            }
            step("result: second activity has been opened") {
                device.activities.isCurrent(SecondActivity::class.java)
            }
        }

    }
    @Test
    fun changeTabTest(){

        before {
            secondActivityTestRule.launchActivity(null)
        }.after {

        }.run {
            step("step 1: swiping pager to left"){
                SecondScreen{
                    viewPager.swipeLeft()
                }
            }
            step("result: second tab has been selected"){
                SecondScreen{
                    tabLayout.isTabSelected(1)
                }
            }
        }

    }
}
