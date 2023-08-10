package hw_DIP;

public class Text implements Content{
    String text;

    public Text(String text) {
        this.text = text;
    }


    @Override
    public String getContent() {
        return text;
    }
}
