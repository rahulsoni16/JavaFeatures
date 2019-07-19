package com.code.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

/**
 * 
 * @author rahul.soni
 *         https://www.tutorialspoint.com/java_dip/image_compression_technique.htm
 *
 */
class ImageCompression {

    public static void main(String[] args) throws IOException {

	File input = new File("D:/Rahul/Tech/github/JavaFeatures/src/com/code/image/DSC_3008.jpg");
	BufferedImage image = ImageIO.read(input);

	File compressedImageFile = new File(
		"D:/Rahul/Tech/github/JavaFeatures/src/com/code/image/DSC_3008-compress.jpg");
	OutputStream os = new FileOutputStream(compressedImageFile);

	Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName("jpg");
	ImageWriter writer = (ImageWriter) writers.next();

	ImageOutputStream ios = ImageIO.createImageOutputStream(os);
	writer.setOutput(ios);

	ImageWriteParam param = writer.getDefaultWriteParam();

	param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
	param.setCompressionQuality(0.05f);
	writer.write(null, new IIOImage(image, null, null), param);

	os.close();
	ios.close();
	writer.dispose();
    }
}