package org.agilewiki.jactor.multithreadingTest.exceptions;

import org.agilewiki.jactor.bind.SynchronousRequest;

/**
 * Test code.
 */
public class SyncDivide extends SynchronousRequest<Integer> {
    private int n;
    private int d;

    public int getN() {
        return n;
    }

    public int getD() {
        return d;
    }

    public SyncDivide(int n, int d) {
        this.n = n;
        this.d = d;
    }
}
