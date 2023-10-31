package repository;

/**
 *
 * @author ASUS
 */
public interface ISearch {

    void countWordInFile(String path, String word);

    void getFileNameContainsWordInDirectory(String path, String word);
    
}
