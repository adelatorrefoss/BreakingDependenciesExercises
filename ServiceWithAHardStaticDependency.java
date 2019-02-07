class SomeService {

    // This inner class simulates a framework deep configuration class, static and untouchable.
    public static class Configuration {
        static String getPropertyFromDatabase(String parameter) {
            // connect to database
            return "some_value for " + parameter;
        }
    }

    private static String SOME_IMPORTANT_PARAMETER = Configuration.getPropertyFromDatabase("SOME_IMPORTANT_PARAMETER");

    public void run() {
        System.out.print(SOME_IMPORTANT_PARAMETER);
    }
}
