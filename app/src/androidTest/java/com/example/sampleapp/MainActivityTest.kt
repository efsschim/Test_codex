package com.example.sampleapp

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun updatesGreetingWhenButtonClicked() {
        onView(withId(R.id.greetingText)).check(matches(withText(R.string.greeting_message)))
        onView(withId(R.id.actionButton)).perform(click())
        onView(withId(R.id.greetingText)).check(matches(withText(R.string.button_clicked_message)))
    }
}
