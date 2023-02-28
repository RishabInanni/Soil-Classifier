package crop;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;

public class MoistureLabel {
    public static void main(String[] args) {
        // Load OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        // Load soil image
        Mat image = Imgcodecs.imread("C:/Users/KIIT/eclipse-workspace1/crop/image/download.jpeg");

        // Convert to grayscale
        Mat gray = new Mat();
        Imgproc.cvtColor(image, gray, Imgproc.COLOR_BGR2GRAY);

        // Apply threshold to binarize image
        Mat thresh = new Mat();
        Imgproc.threshold(gray, thresh, 100, 255, Imgproc.THRESH_BINARY_INV);

        // Calculate mean brightness of soil pixels
        Scalar mean = Core.mean(image, thresh);

        // Convert brightness to moisture content using calibration curve or formula
        double moisture = brightnessToMoisture(mean.val[0]);

        // Print moisture content
        System.out.println("Moisture content: " + moisture + "%");
    }

    private static double brightnessToMoisture(double brightness) {
        // Replace with your calibration curve or formula
        // Example formula: moisture = 100 - (brightness / 2)
        return 100 - (brightness / 2);
    }
}
