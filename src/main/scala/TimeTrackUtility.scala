package com.artenc.utility

object TimeTrackUtility
{
    private var lastTrackTime : Long = 0

    def start() {
        println("Start time track")
        lastTrackTime = System.nanoTime()
    }

    def printTimeSinceLast(title: String = "") {
        var nano = System.nanoTime() - lastTrackTime
        var mc = nano / 1000
        var ms = mc / 1000
        var s = ms / 1000

        nano -= mc * 1000
        mc -= ms * 1000
        ms -= s * 1000

        if (!title.isEmpty)
            print(s"${title}: ")
        if (s > 0)
            print(s"${s}s ")
        if (ms > 0)
            print(s"${ms}ms ")
        if (mc > 0)
            print(s"${mc}us ")
        println(s"${nano}ns since last")

        lastTrackTime = System.nanoTime()
    }
}
