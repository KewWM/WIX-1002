
package Lab10.Q3;

public class Tester 
{
    public static void main(String[] args) 
    {
        ShuffleCipher plainToCipher = new ShuffleCipher
        ("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Q3/plainText.txt", "C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Q3/shuffleCipherText.txt", 2);
        plainToCipher.plainToCipher();

        ShuffleCipher cipherToPlain = new ShuffleCipher
        ("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Q3/shuffleCipherText.txt", "C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Q3/shuffleDecodedText.txt", 2);
        cipherToPlain.cipherToPlain();

    }
}
