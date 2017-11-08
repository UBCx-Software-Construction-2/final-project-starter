package util.test;

import org.junit.jupiter.api.Test;
import util.Util;

import java.awt.image.BufferedImage;

/**
 * Created by norm on 2017-09-22.
 */
public class TestImage {
    @Test
    public void testImage() {
        BufferedImage norm = Util.imageFromURL("https://www.cs.ubc.ca/~norm");
    }
}
