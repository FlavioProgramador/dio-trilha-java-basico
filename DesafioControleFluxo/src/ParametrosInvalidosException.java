public class ParametrosInvalidosException extends Exception {
    
    // Construtor que recebe uma mensagem personalizada de erro
    public ParametrosInvalidosException(String message) {
        super(message);  // Passa a mensagem para o construtor da classe Exception
    }
    
    // Construtor que recebe a mensagem e a causa da exceção (exceção original)
    public ParametrosInvalidosException(String message, Throwable cause) {
        super(message, cause);  // Passa a mensagem e a causa para o construtor da classe Exception
    }
}
