public class equalsIgnoreCaseString {
    
    public static void main(String[] args) {
        String string1 = "What";
        String string2 = "what";
        String string3 = "WhaT";
        System.out.println("Hasilnya : " +string1.equalsIgnoreCase(string2));
        System.out.println("Hasilnya : " +string1.equalsIgnoreCase(string3));
    }
}
