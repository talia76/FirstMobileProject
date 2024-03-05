package com.remindly.tests;

import org.testng.annotations.Test;

public class AddReminderTests extends TestBase{
    @Test
    public void addReminderPositiveTest() {
        app.getMainScreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnDateField();
        app.getReminder().swipeToMonth("future", "MAY", 2);
        app.getReminder().selectDate(0);
        app.getReminder().selectYear("future", "2025");
        //app.getReminder().tapOnOk();
    }
}
