package composit;

/**
 * Created by ValkSam on 16.10.2016.
 */
public interface File {
    boolean isFile();

    String getName();

    String getContent();

    void setContent(String content);

    int getSize();

    void showFile();
}
