package packag1;

import java.io.IOException;

public class CustomException extends IOException {
    public String name;
    public String code;

    public CustomException(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public CustomException(String message, Throwable cause, String name, String code) {
        super(message, cause);
        this.name = name;
        this.code = code;
    }
}
