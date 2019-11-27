package com.tenxgames.kaspressotest

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainTest : TestCase() {
    @get:Rule
    val activityTestRule = ActivityTestRule(MainActivity::class.java, false, true)

    @Test
    fun openSecondActivityTest() {

        before {
            activityTestRule.launchActivity(null)
        }.after {

        }.run {

            step("step 1: pushing button") {
                MainScreen {
                    btnOpen.click()
                }
            }
            step("step 2: second activity has been opened") {
                device.activities.isCurrent(SecondActivity::class.java)
            }
        }

    }
}
