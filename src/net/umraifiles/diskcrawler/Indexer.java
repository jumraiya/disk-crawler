
package net.umraifiles.diskcrawler;

import java.nio.file.Path;
/**
 *
 * @author Jaideep Umraiya
 * Class which analyzes the size
 * and contents of a directory and deposits the results in a DiskHeap
 */
public interface Indexer {
    
    /**
     * Analyzes the given directory
     * @param p a directory from which to collect data
     * @return A DirInfo object containing all the statistics for the directory
     */
    DirInfo index(Path p);
}
