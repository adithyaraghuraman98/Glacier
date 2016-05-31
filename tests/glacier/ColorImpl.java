import java.util.Arrays;
import edu.cmu.cs.glacier.qual.Immutable;

public class ColorImpl {
    private byte @Immutable [] _rgb;
    private byte [] _mutableRgb;
    
    public int hashCode() {
    	// This should be OK, but will be an error until we have a @ReadOnly annotation.
    	Arrays.hashCode(_mutableRgb); 
    	
    	return Arrays.hashCode(_rgb);
    }
}
