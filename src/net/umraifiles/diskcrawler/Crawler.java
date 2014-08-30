package net.umraifiles.diskcrawler;

import java.nio.file.Path;
import java.util.Collection;
/**
 *
 * @author Jaideep Umraiya
 * Given a root position, crawls the file system recursively
 * and maintains a Queue for Indexers to consume.
 */
public interface Crawler {
    /**
     * Method which starts a crawling operation
     * If called after stopping a crawl operation, resumes from where it left off.
     * If called while already running throws an exception
     */
    public void startCrawl() throws IllegalStateException;
    
    /**
     * Starts a crawling operation from a given path
     * @param p the directory from which to start the operation.
     */
    public void startCrawl(Path p) throws IllegalStateException,IllegalArgumentException;   
    
    
    /**
     * Method which halts a crawling operation
     */
    public void stopCrawl();
    
    /**
     * Resets the state of the crawler after stopping the crawl operation
     * 
     */
    public void reset();
    
    public Collection<Path> getResults();
}
