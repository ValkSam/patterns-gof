package bar.foo;

import java.io.InputStream;

public class GifImageReaderCreator extends ImageReaderCreator {

    @Override
    public Image createImage(InputStream is) {

        Image decodedImage = new DecodedImage();
        // TODO decode as GIF and fill out decodedImage
        return decodedImage;
    }

}
