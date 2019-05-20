package baseconverter;

public class ParseResult {
    public int fromBase;
    public String number;


    public ParseResult(String[] args) {
        if (args.length==1){
            this.number=args[0];
            this.fromBase=8;
        }
        else {
            this.number = args[2];
            this.fromBase=Integer.parseInt(args[1]);
        }
    }
}
