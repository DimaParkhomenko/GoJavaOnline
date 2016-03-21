package module6.ex1_aboutfile_Exception;

public class WrongCharException extends Exception {
    // Exception is designed to keep message and other exceptions details
    // When we create new Exception's class, usually we initialize all types of
    // constructor as Exception class has.
    // Исключением разработан, чтобы хранить сообщение и другие детали исключения
    // Когда мы создаем новый класс Исключения, обычно мы инициализируем все виды
    // конструкторов которые имеет класс Исключение.
    public WrongCharException(String message) {
        super(message);
    }

    public WrongCharException() {
        super();
    }

    public WrongCharException(String message, Throwable cause) {
        super(message, cause);
    }

    public WrongCharException(Throwable cause) {
        super(cause);
    }
}
