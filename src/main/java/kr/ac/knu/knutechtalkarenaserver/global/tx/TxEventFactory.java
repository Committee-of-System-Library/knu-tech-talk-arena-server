package kr.ac.knu.knutechtalkarenaserver.global.tx;

public interface TxEventFactory<T> {

    TxEvent<?> create(T context);
}
