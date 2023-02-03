
package Lab10.Q2;

public class Tester 
{
    public static void main(String[] args) 
    {
        SubstitutionCipher plainToCipher = new SubstitutionCipher
        ("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Q2/plainText.txt", "C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Q2/cipherText.txt", 2);
        plainToCipher.encodeFile();

        SubstitutionCipher cipherToPlain = new SubstitutionCipher
        ("C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Q2/cipherText.txt", "C:/Users/User/Documents/NetBeansProjects/WIX 1002/src/Lab10/Q2/decodedPlainText.txt", 2);
        cipherToPlain.decodeFile();
    }

}
