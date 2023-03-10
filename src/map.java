public class map {
    private char [] data;
    private char [] values;

    public map(){
        this.data = new char[26];
        this.values = new char[26];

        for(int i =0; i< 26;i++){
            this.data[i] = (char)(i+65);
            this.values[i] = (char)( ( (i+3)%25) + 65);
        }
    }

    public char indexValue(char value){
        for(int i =0; i < this.data.length;i++){
            if(data[i] == value){
                return this.values[i];
            }
        }
        return '1';
    }

    public char valueOfIndex(char value){
        for(int i =0; i < this.values.length;i++){
            if(this.values[i] == value){
                return this.data[i];
            }
        }
        return '1';
    }
}