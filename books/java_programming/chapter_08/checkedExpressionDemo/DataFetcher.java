package books.java_programming.chapter_08.checkedExpressionDemo;

public class DataFetcher {
    public String fetchFromUrl(String url) throws CheckedException{
        if(url == null){
            throw new CheckedException("Url not found");
        }
        String data = null;

        // rest of the statement
        // read lots of data over HTTP and return
        // it as a string instance
        return data;
    }
}


class CheckedException extends Exception{
    public CheckedException(String message){
        super(message);
    }
}