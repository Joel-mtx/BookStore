package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Book;

/**
 * @author Joel Martinez-Gonzalez - jmartinezgonzale
 * CIS175 - Spring 2021
 * Mar 28, 2021
 */

@Repository
public interface BooksRepository extends JpaRepository<Book, Long>{

}
