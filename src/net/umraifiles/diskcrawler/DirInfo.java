
package net.umraifiles.diskcrawler;

import java.util.Map;
import java.nio.file.Path;
/**
 *
 * @author Jaideep Umraiya
 * Class containing the result of analysis of a directory
 * Size of directory
 * Number of files
 * Average File Size
 * Distribution of files per type
 * Distribution of disk usage per type
 * a sorted list of child DirInfo references
 */
public interface DirInfo {
    /**
     * Calculates total disk usage of directory
     * @return Size of the directory in kb
     */
    public int getSize();
    
    /**
     * Sorts files according to size and returns the collection
     * @return Sorted array of files according to size
     */
    public Path[] getFiles();
    
    /**
     * Computes and returns the average file size in the directory
     * @return Average file size in directory
     */
    public int getAvgFileSize();
    /**
     * Computes the distribution of file types in the directory
     * @return Distribution(percentile) of file types in directory
     */
    public Map<String, Integer> getTypeDist();
    /**
     * Computes the disk usage for various file types in the directory
     * @return Distribution of disk usage of file types in the directory
     */
    public Map<String, Integer> getTypeSizeDist();
    /**
     * Computes and returns an array of references to child info structures
     * @return An sorted array info structures for all immediate subdirectories
     */
    public DirInfo[] getChildrenInfo();
}
