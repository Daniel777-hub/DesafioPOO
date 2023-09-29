public interface WebBrowser {
    void displayPage(String url);
    void addNewTab(String url);
    void refreshPage(String url);
}