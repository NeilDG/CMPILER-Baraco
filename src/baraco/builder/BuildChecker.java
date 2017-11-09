package baraco.builder;

public class BuildChecker {

    private static BuildChecker sharedInstance = null;

    private boolean successful = true;

    public static BuildChecker getInstance() {
        return sharedInstance;
    }

    private BuildChecker() {

    }

    public static void initialize() {
        sharedInstance = new BuildChecker();
        ErrorRepository.initialize();
    }

    public static void reset() {
        sharedInstance.successful  = true;
        ErrorRepository.reset();
    }

    public boolean canExecute() {
        return this.successful;
    }

    public static void reportCustomError(int errorCode, String additionalMessage) {
        String errorMessage = ErrorRepository.getErrorMessage(errorCode) + " " + additionalMessage;
        //Console.log(LogType.ERROR, errorMessage);
        System.out.println("ERROR: " + errorMessage);

        sharedInstance.successful = false;
    }

    public static void reportCustomError(int errorCode, String additionalMessage, Object... parameters) {
        String errorMessage = String.format(ErrorRepository.getErrorMessage(errorCode) + " " + additionalMessage, parameters);
        System.out.println("ERROR: " + errorMessage);

        sharedInstance.successful = false;
    }
}
