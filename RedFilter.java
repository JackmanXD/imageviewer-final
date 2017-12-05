import java.awt.Color;

/**
 * An image filter to apply a red color filter.
 * 
 * @author Michael Kölling and David J. Barnes.
 * @version 1.0
 * 
 * @author Jack Henry Protopapa
 * @version 1.2
 */
public class RedFilter extends Filter
{
    /**
     * Constructor for objects of class RedFilter.
     * @param name The name of the filter.
     */
    public RedFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                Color pix = image.getPixel(x, y);
                image.setPixel(x, y, new Color(0 + pix.getRed(),
                                               0,
                                               0));
            }
        }
    }
}
