package kr.ac.knu.knutechtalkarenaserver.global.tx;

import lombok.Getter;

@Getter
public abstract class TxEvent<T> {

    private final boolean success;
    private final T context;

    protected TxEvent(boolean success, T context) {
        this.success = success;
        this.context = context;
    }
}