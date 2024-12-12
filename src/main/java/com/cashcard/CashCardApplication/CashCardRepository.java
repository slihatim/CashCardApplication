package com.cashcard.CashCardApplication;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

//@Component
public interface CashCardRepository extends CrudRepository<CashCard, Long> {

}
