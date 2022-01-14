package edu.kis.vh.nursery;

public class HanoiRhymer extends defaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
//Odp1: Wiersze 13,14,15.
//Odp2: Alt + <- i Alt + -> pozwalają na przechodzenie między otwartymi kartami w edytorze.
