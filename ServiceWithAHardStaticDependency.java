// Try to break the static dependency referenced by the static field.
class SomeService {

    // This inner class simulates a framework deep configuration class, static and untouchable.
    public static class Configuration {
        static String getPropertyFromDatabase(String parameter) {
            // connect to database
            return "some_value for " + parameter;
        }
    }

    private static String SOME_IMPORTANT_PARAMETER = Configuration.getPropertyFromDatabase("SOME_IMPORTANT_PARAMETER");

    public String run() {
        return SOME_IMPORTANT_PARAMETER;
    }
}
