package kr.ac.knu.knutechtalkarenaserver.global.tx;

public interface TxFailureHandler<E> {

    void handle(E event);
}
