public class Main {
    String Str = "GEEKSFORGEEKS";
    String Keyword = "AYUSH";

    String str = LowerToUpper(Str);
    String keyword = LowerToUpper(Keyword);

    String key = generateKey(str, keyword);
    String cipher_text = cipherText(str, key);

    System.out.println("Ciphertext : " + cipher_text + "\n");

    System.out.println("Original/Decrypted Text : " + originalText(cipher_text, key));
}
