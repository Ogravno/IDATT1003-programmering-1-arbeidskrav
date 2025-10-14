public class NewString {
    private String str;

    public NewString(String str) {
        this.str = str;
    }

    public String getString() {
        return this.str;
    }

    public void shorten(){
        String[] strWords = this.str.split(" ");

        String strShortened = "";
        for (int i=0; i<strWords.length; i++) {
            strShortened += strWords[i].charAt(0);
        }

        this.str = strShortened;
    }

    public void removeSign(String sign) {
        this.str = this.str.replaceAll(sign, "");
    }
}
