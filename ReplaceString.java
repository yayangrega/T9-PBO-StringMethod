public class ReplaceString {
    
    public static void main(String[] args) {
        String string1 = "Hello mybro";
        String GantiKarakter = string1.replace('H', 'T');
        String GantiKalimat = string1.replace("Hello", "Good Night");
        System.out.println("untuk replace karakter : "+GantiKarakter);
        System.out.println("untuk replace kalimat : "+GantiKalimat);
    }
}
