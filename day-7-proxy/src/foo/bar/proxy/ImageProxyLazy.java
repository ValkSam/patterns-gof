package foo.bar.proxy;

public class ImageProxyLazy implements Image {

    /**
     * Private Proxy data
     */
    private String imageFilePath;

    /**
     * Reference to RealSubject
     */
    private Image proxifiedImage;

    public ImageProxyLazy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void showImage() {

        // create the Image Object only when the image is required to be shown

        proxifiedImage = new HighResolutionImage(imageFilePath);

        // now call showImage on realSubject
        proxifiedImage.showImage();

    }
}
