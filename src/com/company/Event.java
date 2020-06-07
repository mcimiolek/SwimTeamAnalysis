package com.company;

import java.util.ArrayList;

/* Consists of a time in seconds and fractional seconds, the name of an event, and a list of splits for that event in
   seconds. Also allows the conversion of times in seconds to a standard results format. */
public class Event {
    private String name;                    // The name of the event
    private float timeSeconds = -1;         // The time of the event in seconds and fractional seconds
    private ArrayList<Float> splits = null; // An array list of splits for the event

    // A constructor to create an event when given all three parts
    Event(String name, float time, ArrayList<Float> splits) {
        this.name = name;
        this.timeSeconds = time;
        this.splits = splits;
    }

    /* Constructor where only an event name is given; therefore makes the assumption the event has no time (represented
       by -1), and there are no splits */
    Event(String name) {
        this.name = name;
}

    /* Constructor where only the name and time of an event are given; therefore makes the assumption the event has no
       splits available. */
    Event(String name, float time) {
        this.name = name;
        this.timeSeconds = time;
    }

    // Turns the time as seconds into a string containing it as a standard swim time format
    public String formatTime() {
        String seconds = (timeSeconds
    }
}
