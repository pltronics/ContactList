package com.contactlist.contacts.dao;

import com.contactlist.contacts.model.Contact;

public interface IContactDAO {

	public Contact fetch(int id);

	public Contact fetchById(int id);

}
