package com.artenc.utility

object BitUtility
{
    def printInt(value: Int) {
        var j = 0
        for (i <- 31 to 0 by -1) {
            if (j == 8) {
                print(" ")
                j = 0
            }
            j += 1

            print(if (((value >> i) & 1) == 1) "1" else "0")
        }
        println
    }
}
