
package net.umraifiles.diskcrawler.Impl;

import java.nio.file.Path;
import net.umraifiles.diskcrawler.Crawler;
import java.util.Queue;
/**
 * 
 * @author Jaideep Umraiya
 * Thread safe crawler
 */
public class FileCrawler implements Crawler {
    private Path start;
    
    public FileCrawler(Path p) {
        this.start = p;    
    }
    @Override
    public void startCrawl() {
         
     }
    
    @Override
    public void startCrawl(Path p) {
        
    }
    
    @Override
    public void stopCrawl() {
        
    }
    
    @Override
    public void reset() {
        
    }
    
    @Override
    public Queue<Path> getResults() {
        return null;
    }   
}
