class VariableDistraction {
    public static void cardCount() {
    Illusionist.count = 42;
    Illusionist illusionistAl = new Illusionist();
    Illusionist illusionistBob = new Illusionist();
    illusionistAl.count = 36;
    illusionistBob.count = 26;
    System.out.println(Illusionist.count); 
    }
}
