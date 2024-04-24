package model.exceptions;

public class DomainException extends RuntimeException{

    private static final long serialVersionUid = 1L;

    public DomainException(String msn){
        super(msn);
    }
}
