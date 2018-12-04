package org.hemant.thakkar.stockexchange;

import java.time.LocalDateTime;

public interface Tradable {
	public long getId();
	public void setId();
	public Product getProduct();
	public void setProduct(Product product);
	public LocalDateTime getEntryTime();
	public void setEntryTime(LocalDateTime entryTime);
	public Participant getParticipant();
}
