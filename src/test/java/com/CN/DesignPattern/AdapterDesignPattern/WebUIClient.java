public interface WebUIClient {
    void open(String url);
    void click(String selector);
    void type(String selector, String text);
    String getTitle();
    void close();
}
