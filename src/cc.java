public class cc {
    private String text;
    private String encryptedText;
    private String dencryptedText;
    private map data;

    public cc(String text){
        this.data = new map();
        this.encryptedText = "";
        this.dencryptedText ="";
        this.text = text;
    }

    public String encrpt(){
        for(int i =0; i < this.text.length();i++){
            this.encryptedText = this.encryptedText + data.indexValue(this.text.charAt(i));
        }
        return this.encryptedText;
    }

    public String decrpt(){
        for(int i =0; i < this.encryptedText.length();i++){
            this.dencryptedText = this.dencryptedText + data.valueOfIndex(this.encryptedText.charAt(i)) ;
        }
        return this.dencryptedText;
    }

    public static void main(String [] args){
        cc s = new cc("ABC");
        System.out.println(s.encrpt());
        System.out.println(s.decrpt());
    }
}