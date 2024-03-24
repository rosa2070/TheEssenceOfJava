package ch8.quiz;

public class Exercise8_9 {
    public static void main(String[] args) throws Exception{
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

class UnsupportedFunctionException extends RuntimeException {
    private final int ERR_CODE;

    UnsupportedFunctionException(String msg, int errCode) {
        super(msg);
        ERR_CODE = errCode;
    }

    UnsupportedFunctionException(String msg) {
        this(msg, 100);
    }

    int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }
}
