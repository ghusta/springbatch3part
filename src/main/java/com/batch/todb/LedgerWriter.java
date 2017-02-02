package com.batch.todb;

import java.util.Iterator;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("itemWriter")
public class LedgerWriter implements ItemWriter<Ledger> {

	@Autowired
	private LedgerDAO itemDAO;

	public void write(List<? extends Ledger> items) throws Exception {
		for (Ledger item : items) {
			itemDAO.save(item);
		}
	}
}