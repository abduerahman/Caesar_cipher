import java.lang.Math;

public class caesar_cipher {
    private String text;
    private String encryptedText = "";
    private String decryptedText = "";

    public caesar_cipher(String encptText){
        this.text = encptText;
    }

    public String encryption(){
        for(int i =0; i < this.text.length(); i++){
            char c =  (char)(Math.abs(((((int)(this.text.charAt(i))) - 65 + 3) )% 26 )+ 65);
            this.encryptedText = this.encryptedText + String.valueOf(c);
        }
        return this.encryptedText;
    }

    public String decryption(){
        for (int i =0; i < this.encryptedText.length(); i++){
            int c = ((int)this.encryptedText.charAt(i) - 65 - 3 )%26 + 65;
            this.decryptedText = this.decryptedText + (char)c;
        }
       return this.decryptedText;
    }



    public static void main(String [] args){
        caesar_cipher c = new caesar_cipher("ABC");
        System.out.println(c.encryption());
        System.out.println(c.decryption());

    }
}
